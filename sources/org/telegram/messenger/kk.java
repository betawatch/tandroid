package org.telegram.messenger;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.text.TextUtils;
import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class kk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ kk(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
        this.f = obj4;
    }

    private final void a() {
        TLRPC.MessageMedia messageMedia;
        hs hsVar = (hs) this.c;
        String str = (String) this.d;
        TLObject tLObject = (TLObject) this.e;
        int i10 = this.b;
        String str2 = (String) this.f;
        hsVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                String a2 = Utilities.a(str);
                if (a2 != null) {
                    if (tLObject instanceof TLRPC.Photo) {
                        messageMedia = new TLRPC.TL_messageMediaPhoto();
                        messageMedia.photo = (TLRPC.Photo) tLObject;
                        messageMedia.flags |= 1;
                    } else if (tLObject instanceof TLRPC.Document) {
                        messageMedia = new TLRPC.TL_messageMediaDocument();
                        messageMedia.document = (TLRPC.Document) tLObject;
                        messageMedia.flags |= 1;
                    } else {
                        messageMedia = null;
                    }
                    if (messageMedia == null) {
                        return;
                    }
                    sQLitePreparedStatement = hsVar.b.executeFast("REPLACE INTO sent_files_v2 VALUES(?, ?, ?, ?)");
                    sQLitePreparedStatement.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageMedia.getObjectSize());
                    messageMedia.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatement.bindString(1, a2);
                    sQLitePreparedStatement.bindInteger(2, i10);
                    sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer);
                    sQLitePreparedStatement.bindString(4, str2);
                    sQLitePreparedStatement.step();
                    nativeByteBuffer.reuse();
                }
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            } catch (Exception e) {
                hsVar.o(e, true);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th2) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:376:0x05f0, code lost:
    
        if ("ru".equals(r3) == false) goto L301;
     */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03d8 A[Catch: Exception -> 0x0261, TryCatch #16 {Exception -> 0x0261, blocks: (B:249:0x03bb, B:251:0x03c5, B:252:0x03d2, B:254:0x03d8, B:256:0x03e2, B:258:0x03f2, B:259:0x03fb, B:261:0x0401, B:263:0x040b, B:265:0x041b, B:266:0x0424, B:268:0x042a, B:270:0x0430, B:272:0x043a, B:274:0x0440, B:275:0x0443, B:277:0x044b, B:279:0x0451, B:281:0x045b, B:283:0x0469, B:284:0x0470, B:286:0x0476, B:288:0x0480, B:290:0x0490, B:291:0x0497, B:293:0x049d, B:295:0x04a7, B:297:0x04b5, B:298:0x04b9, B:300:0x04bf, B:302:0x04c5, B:304:0x04cf, B:306:0x04d5, B:307:0x04d8, B:308:0x04de, B:311:0x04e5, B:313:0x04eb, B:318:0x0503, B:320:0x0509, B:322:0x050f, B:323:0x0512, B:325:0x0517, B:327:0x051d, B:328:0x0520, B:330:0x0526, B:332:0x0530, B:333:0x0536, B:336:0x0544, B:338:0x054a, B:339:0x054d, B:341:0x0553, B:343:0x055d, B:345:0x0563, B:346:0x0566, B:347:0x0569, B:349:0x0573, B:351:0x0579, B:352:0x057c, B:353:0x057f, B:355:0x0589, B:357:0x058f, B:358:0x0592, B:359:0x0595, B:361:0x05a5, B:363:0x05ab, B:364:0x05ae, B:368:0x05c9, B:371:0x05dc, B:373:0x05e2, B:375:0x05ea, B:377:0x0612, B:379:0x061c, B:381:0x0624, B:383:0x0638, B:387:0x063c, B:389:0x0642, B:390:0x0645, B:391:0x0651, B:393:0x065b, B:395:0x0661, B:396:0x0664, B:397:0x0667, B:399:0x0671, B:401:0x0677, B:402:0x067a, B:404:0x067f, B:406:0x0689, B:408:0x068f, B:409:0x0692, B:410:0x0695, B:412:0x069f, B:414:0x06a5, B:415:0x06a8, B:416:0x06ab, B:420:0x06bc, B:422:0x05f2, B:424:0x05fe, B:427:0x0605, B:315:0x04fb), top: B:248:0x03bb }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0401 A[Catch: Exception -> 0x0261, TryCatch #16 {Exception -> 0x0261, blocks: (B:249:0x03bb, B:251:0x03c5, B:252:0x03d2, B:254:0x03d8, B:256:0x03e2, B:258:0x03f2, B:259:0x03fb, B:261:0x0401, B:263:0x040b, B:265:0x041b, B:266:0x0424, B:268:0x042a, B:270:0x0430, B:272:0x043a, B:274:0x0440, B:275:0x0443, B:277:0x044b, B:279:0x0451, B:281:0x045b, B:283:0x0469, B:284:0x0470, B:286:0x0476, B:288:0x0480, B:290:0x0490, B:291:0x0497, B:293:0x049d, B:295:0x04a7, B:297:0x04b5, B:298:0x04b9, B:300:0x04bf, B:302:0x04c5, B:304:0x04cf, B:306:0x04d5, B:307:0x04d8, B:308:0x04de, B:311:0x04e5, B:313:0x04eb, B:318:0x0503, B:320:0x0509, B:322:0x050f, B:323:0x0512, B:325:0x0517, B:327:0x051d, B:328:0x0520, B:330:0x0526, B:332:0x0530, B:333:0x0536, B:336:0x0544, B:338:0x054a, B:339:0x054d, B:341:0x0553, B:343:0x055d, B:345:0x0563, B:346:0x0566, B:347:0x0569, B:349:0x0573, B:351:0x0579, B:352:0x057c, B:353:0x057f, B:355:0x0589, B:357:0x058f, B:358:0x0592, B:359:0x0595, B:361:0x05a5, B:363:0x05ab, B:364:0x05ae, B:368:0x05c9, B:371:0x05dc, B:373:0x05e2, B:375:0x05ea, B:377:0x0612, B:379:0x061c, B:381:0x0624, B:383:0x0638, B:387:0x063c, B:389:0x0642, B:390:0x0645, B:391:0x0651, B:393:0x065b, B:395:0x0661, B:396:0x0664, B:397:0x0667, B:399:0x0671, B:401:0x0677, B:402:0x067a, B:404:0x067f, B:406:0x0689, B:408:0x068f, B:409:0x0692, B:410:0x0695, B:412:0x069f, B:414:0x06a5, B:415:0x06a8, B:416:0x06ab, B:420:0x06bc, B:422:0x05f2, B:424:0x05fe, B:427:0x0605, B:315:0x04fb), top: B:248:0x03bb }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x042a A[Catch: Exception -> 0x0261, TryCatch #16 {Exception -> 0x0261, blocks: (B:249:0x03bb, B:251:0x03c5, B:252:0x03d2, B:254:0x03d8, B:256:0x03e2, B:258:0x03f2, B:259:0x03fb, B:261:0x0401, B:263:0x040b, B:265:0x041b, B:266:0x0424, B:268:0x042a, B:270:0x0430, B:272:0x043a, B:274:0x0440, B:275:0x0443, B:277:0x044b, B:279:0x0451, B:281:0x045b, B:283:0x0469, B:284:0x0470, B:286:0x0476, B:288:0x0480, B:290:0x0490, B:291:0x0497, B:293:0x049d, B:295:0x04a7, B:297:0x04b5, B:298:0x04b9, B:300:0x04bf, B:302:0x04c5, B:304:0x04cf, B:306:0x04d5, B:307:0x04d8, B:308:0x04de, B:311:0x04e5, B:313:0x04eb, B:318:0x0503, B:320:0x0509, B:322:0x050f, B:323:0x0512, B:325:0x0517, B:327:0x051d, B:328:0x0520, B:330:0x0526, B:332:0x0530, B:333:0x0536, B:336:0x0544, B:338:0x054a, B:339:0x054d, B:341:0x0553, B:343:0x055d, B:345:0x0563, B:346:0x0566, B:347:0x0569, B:349:0x0573, B:351:0x0579, B:352:0x057c, B:353:0x057f, B:355:0x0589, B:357:0x058f, B:358:0x0592, B:359:0x0595, B:361:0x05a5, B:363:0x05ab, B:364:0x05ae, B:368:0x05c9, B:371:0x05dc, B:373:0x05e2, B:375:0x05ea, B:377:0x0612, B:379:0x061c, B:381:0x0624, B:383:0x0638, B:387:0x063c, B:389:0x0642, B:390:0x0645, B:391:0x0651, B:393:0x065b, B:395:0x0661, B:396:0x0664, B:397:0x0667, B:399:0x0671, B:401:0x0677, B:402:0x067a, B:404:0x067f, B:406:0x0689, B:408:0x068f, B:409:0x0692, B:410:0x0695, B:412:0x069f, B:414:0x06a5, B:415:0x06a8, B:416:0x06ab, B:420:0x06bc, B:422:0x05f2, B:424:0x05fe, B:427:0x0605, B:315:0x04fb), top: B:248:0x03bb }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x044b A[Catch: Exception -> 0x0261, TryCatch #16 {Exception -> 0x0261, blocks: (B:249:0x03bb, B:251:0x03c5, B:252:0x03d2, B:254:0x03d8, B:256:0x03e2, B:258:0x03f2, B:259:0x03fb, B:261:0x0401, B:263:0x040b, B:265:0x041b, B:266:0x0424, B:268:0x042a, B:270:0x0430, B:272:0x043a, B:274:0x0440, B:275:0x0443, B:277:0x044b, B:279:0x0451, B:281:0x045b, B:283:0x0469, B:284:0x0470, B:286:0x0476, B:288:0x0480, B:290:0x0490, B:291:0x0497, B:293:0x049d, B:295:0x04a7, B:297:0x04b5, B:298:0x04b9, B:300:0x04bf, B:302:0x04c5, B:304:0x04cf, B:306:0x04d5, B:307:0x04d8, B:308:0x04de, B:311:0x04e5, B:313:0x04eb, B:318:0x0503, B:320:0x0509, B:322:0x050f, B:323:0x0512, B:325:0x0517, B:327:0x051d, B:328:0x0520, B:330:0x0526, B:332:0x0530, B:333:0x0536, B:336:0x0544, B:338:0x054a, B:339:0x054d, B:341:0x0553, B:343:0x055d, B:345:0x0563, B:346:0x0566, B:347:0x0569, B:349:0x0573, B:351:0x0579, B:352:0x057c, B:353:0x057f, B:355:0x0589, B:357:0x058f, B:358:0x0592, B:359:0x0595, B:361:0x05a5, B:363:0x05ab, B:364:0x05ae, B:368:0x05c9, B:371:0x05dc, B:373:0x05e2, B:375:0x05ea, B:377:0x0612, B:379:0x061c, B:381:0x0624, B:383:0x0638, B:387:0x063c, B:389:0x0642, B:390:0x0645, B:391:0x0651, B:393:0x065b, B:395:0x0661, B:396:0x0664, B:397:0x0667, B:399:0x0671, B:401:0x0677, B:402:0x067a, B:404:0x067f, B:406:0x0689, B:408:0x068f, B:409:0x0692, B:410:0x0695, B:412:0x069f, B:414:0x06a5, B:415:0x06a8, B:416:0x06ab, B:420:0x06bc, B:422:0x05f2, B:424:0x05fe, B:427:0x0605, B:315:0x04fb), top: B:248:0x03bb }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0509 A[Catch: Exception -> 0x0261, TryCatch #16 {Exception -> 0x0261, blocks: (B:249:0x03bb, B:251:0x03c5, B:252:0x03d2, B:254:0x03d8, B:256:0x03e2, B:258:0x03f2, B:259:0x03fb, B:261:0x0401, B:263:0x040b, B:265:0x041b, B:266:0x0424, B:268:0x042a, B:270:0x0430, B:272:0x043a, B:274:0x0440, B:275:0x0443, B:277:0x044b, B:279:0x0451, B:281:0x045b, B:283:0x0469, B:284:0x0470, B:286:0x0476, B:288:0x0480, B:290:0x0490, B:291:0x0497, B:293:0x049d, B:295:0x04a7, B:297:0x04b5, B:298:0x04b9, B:300:0x04bf, B:302:0x04c5, B:304:0x04cf, B:306:0x04d5, B:307:0x04d8, B:308:0x04de, B:311:0x04e5, B:313:0x04eb, B:318:0x0503, B:320:0x0509, B:322:0x050f, B:323:0x0512, B:325:0x0517, B:327:0x051d, B:328:0x0520, B:330:0x0526, B:332:0x0530, B:333:0x0536, B:336:0x0544, B:338:0x054a, B:339:0x054d, B:341:0x0553, B:343:0x055d, B:345:0x0563, B:346:0x0566, B:347:0x0569, B:349:0x0573, B:351:0x0579, B:352:0x057c, B:353:0x057f, B:355:0x0589, B:357:0x058f, B:358:0x0592, B:359:0x0595, B:361:0x05a5, B:363:0x05ab, B:364:0x05ae, B:368:0x05c9, B:371:0x05dc, B:373:0x05e2, B:375:0x05ea, B:377:0x0612, B:379:0x061c, B:381:0x0624, B:383:0x0638, B:387:0x063c, B:389:0x0642, B:390:0x0645, B:391:0x0651, B:393:0x065b, B:395:0x0661, B:396:0x0664, B:397:0x0667, B:399:0x0671, B:401:0x0677, B:402:0x067a, B:404:0x067f, B:406:0x0689, B:408:0x068f, B:409:0x0692, B:410:0x0695, B:412:0x069f, B:414:0x06a5, B:415:0x06a8, B:416:0x06ab, B:420:0x06bc, B:422:0x05f2, B:424:0x05fe, B:427:0x0605, B:315:0x04fb), top: B:248:0x03bb }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0530 A[Catch: Exception -> 0x0261, TryCatch #16 {Exception -> 0x0261, blocks: (B:249:0x03bb, B:251:0x03c5, B:252:0x03d2, B:254:0x03d8, B:256:0x03e2, B:258:0x03f2, B:259:0x03fb, B:261:0x0401, B:263:0x040b, B:265:0x041b, B:266:0x0424, B:268:0x042a, B:270:0x0430, B:272:0x043a, B:274:0x0440, B:275:0x0443, B:277:0x044b, B:279:0x0451, B:281:0x045b, B:283:0x0469, B:284:0x0470, B:286:0x0476, B:288:0x0480, B:290:0x0490, B:291:0x0497, B:293:0x049d, B:295:0x04a7, B:297:0x04b5, B:298:0x04b9, B:300:0x04bf, B:302:0x04c5, B:304:0x04cf, B:306:0x04d5, B:307:0x04d8, B:308:0x04de, B:311:0x04e5, B:313:0x04eb, B:318:0x0503, B:320:0x0509, B:322:0x050f, B:323:0x0512, B:325:0x0517, B:327:0x051d, B:328:0x0520, B:330:0x0526, B:332:0x0530, B:333:0x0536, B:336:0x0544, B:338:0x054a, B:339:0x054d, B:341:0x0553, B:343:0x055d, B:345:0x0563, B:346:0x0566, B:347:0x0569, B:349:0x0573, B:351:0x0579, B:352:0x057c, B:353:0x057f, B:355:0x0589, B:357:0x058f, B:358:0x0592, B:359:0x0595, B:361:0x05a5, B:363:0x05ab, B:364:0x05ae, B:368:0x05c9, B:371:0x05dc, B:373:0x05e2, B:375:0x05ea, B:377:0x0612, B:379:0x061c, B:381:0x0624, B:383:0x0638, B:387:0x063c, B:389:0x0642, B:390:0x0645, B:391:0x0651, B:393:0x065b, B:395:0x0661, B:396:0x0664, B:397:0x0667, B:399:0x0671, B:401:0x0677, B:402:0x067a, B:404:0x067f, B:406:0x0689, B:408:0x068f, B:409:0x0692, B:410:0x0695, B:412:0x069f, B:414:0x06a5, B:415:0x06a8, B:416:0x06ab, B:420:0x06bc, B:422:0x05f2, B:424:0x05fe, B:427:0x0605, B:315:0x04fb), top: B:248:0x03bb }] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0544 A[Catch: Exception -> 0x0261, TRY_ENTER, TryCatch #16 {Exception -> 0x0261, blocks: (B:249:0x03bb, B:251:0x03c5, B:252:0x03d2, B:254:0x03d8, B:256:0x03e2, B:258:0x03f2, B:259:0x03fb, B:261:0x0401, B:263:0x040b, B:265:0x041b, B:266:0x0424, B:268:0x042a, B:270:0x0430, B:272:0x043a, B:274:0x0440, B:275:0x0443, B:277:0x044b, B:279:0x0451, B:281:0x045b, B:283:0x0469, B:284:0x0470, B:286:0x0476, B:288:0x0480, B:290:0x0490, B:291:0x0497, B:293:0x049d, B:295:0x04a7, B:297:0x04b5, B:298:0x04b9, B:300:0x04bf, B:302:0x04c5, B:304:0x04cf, B:306:0x04d5, B:307:0x04d8, B:308:0x04de, B:311:0x04e5, B:313:0x04eb, B:318:0x0503, B:320:0x0509, B:322:0x050f, B:323:0x0512, B:325:0x0517, B:327:0x051d, B:328:0x0520, B:330:0x0526, B:332:0x0530, B:333:0x0536, B:336:0x0544, B:338:0x054a, B:339:0x054d, B:341:0x0553, B:343:0x055d, B:345:0x0563, B:346:0x0566, B:347:0x0569, B:349:0x0573, B:351:0x0579, B:352:0x057c, B:353:0x057f, B:355:0x0589, B:357:0x058f, B:358:0x0592, B:359:0x0595, B:361:0x05a5, B:363:0x05ab, B:364:0x05ae, B:368:0x05c9, B:371:0x05dc, B:373:0x05e2, B:375:0x05ea, B:377:0x0612, B:379:0x061c, B:381:0x0624, B:383:0x0638, B:387:0x063c, B:389:0x0642, B:390:0x0645, B:391:0x0651, B:393:0x065b, B:395:0x0661, B:396:0x0664, B:397:0x0667, B:399:0x0671, B:401:0x0677, B:402:0x067a, B:404:0x067f, B:406:0x0689, B:408:0x068f, B:409:0x0692, B:410:0x0695, B:412:0x069f, B:414:0x06a5, B:415:0x06a8, B:416:0x06ab, B:420:0x06bc, B:422:0x05f2, B:424:0x05fe, B:427:0x0605, B:315:0x04fb), top: B:248:0x03bb }] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0553 A[Catch: Exception -> 0x0261, TryCatch #16 {Exception -> 0x0261, blocks: (B:249:0x03bb, B:251:0x03c5, B:252:0x03d2, B:254:0x03d8, B:256:0x03e2, B:258:0x03f2, B:259:0x03fb, B:261:0x0401, B:263:0x040b, B:265:0x041b, B:266:0x0424, B:268:0x042a, B:270:0x0430, B:272:0x043a, B:274:0x0440, B:275:0x0443, B:277:0x044b, B:279:0x0451, B:281:0x045b, B:283:0x0469, B:284:0x0470, B:286:0x0476, B:288:0x0480, B:290:0x0490, B:291:0x0497, B:293:0x049d, B:295:0x04a7, B:297:0x04b5, B:298:0x04b9, B:300:0x04bf, B:302:0x04c5, B:304:0x04cf, B:306:0x04d5, B:307:0x04d8, B:308:0x04de, B:311:0x04e5, B:313:0x04eb, B:318:0x0503, B:320:0x0509, B:322:0x050f, B:323:0x0512, B:325:0x0517, B:327:0x051d, B:328:0x0520, B:330:0x0526, B:332:0x0530, B:333:0x0536, B:336:0x0544, B:338:0x054a, B:339:0x054d, B:341:0x0553, B:343:0x055d, B:345:0x0563, B:346:0x0566, B:347:0x0569, B:349:0x0573, B:351:0x0579, B:352:0x057c, B:353:0x057f, B:355:0x0589, B:357:0x058f, B:358:0x0592, B:359:0x0595, B:361:0x05a5, B:363:0x05ab, B:364:0x05ae, B:368:0x05c9, B:371:0x05dc, B:373:0x05e2, B:375:0x05ea, B:377:0x0612, B:379:0x061c, B:381:0x0624, B:383:0x0638, B:387:0x063c, B:389:0x0642, B:390:0x0645, B:391:0x0651, B:393:0x065b, B:395:0x0661, B:396:0x0664, B:397:0x0667, B:399:0x0671, B:401:0x0677, B:402:0x067a, B:404:0x067f, B:406:0x0689, B:408:0x068f, B:409:0x0692, B:410:0x0695, B:412:0x069f, B:414:0x06a5, B:415:0x06a8, B:416:0x06ab, B:420:0x06bc, B:422:0x05f2, B:424:0x05fe, B:427:0x0605, B:315:0x04fb), top: B:248:0x03bb }] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0589 A[Catch: Exception -> 0x0261, TryCatch #16 {Exception -> 0x0261, blocks: (B:249:0x03bb, B:251:0x03c5, B:252:0x03d2, B:254:0x03d8, B:256:0x03e2, B:258:0x03f2, B:259:0x03fb, B:261:0x0401, B:263:0x040b, B:265:0x041b, B:266:0x0424, B:268:0x042a, B:270:0x0430, B:272:0x043a, B:274:0x0440, B:275:0x0443, B:277:0x044b, B:279:0x0451, B:281:0x045b, B:283:0x0469, B:284:0x0470, B:286:0x0476, B:288:0x0480, B:290:0x0490, B:291:0x0497, B:293:0x049d, B:295:0x04a7, B:297:0x04b5, B:298:0x04b9, B:300:0x04bf, B:302:0x04c5, B:304:0x04cf, B:306:0x04d5, B:307:0x04d8, B:308:0x04de, B:311:0x04e5, B:313:0x04eb, B:318:0x0503, B:320:0x0509, B:322:0x050f, B:323:0x0512, B:325:0x0517, B:327:0x051d, B:328:0x0520, B:330:0x0526, B:332:0x0530, B:333:0x0536, B:336:0x0544, B:338:0x054a, B:339:0x054d, B:341:0x0553, B:343:0x055d, B:345:0x0563, B:346:0x0566, B:347:0x0569, B:349:0x0573, B:351:0x0579, B:352:0x057c, B:353:0x057f, B:355:0x0589, B:357:0x058f, B:358:0x0592, B:359:0x0595, B:361:0x05a5, B:363:0x05ab, B:364:0x05ae, B:368:0x05c9, B:371:0x05dc, B:373:0x05e2, B:375:0x05ea, B:377:0x0612, B:379:0x061c, B:381:0x0624, B:383:0x0638, B:387:0x063c, B:389:0x0642, B:390:0x0645, B:391:0x0651, B:393:0x065b, B:395:0x0661, B:396:0x0664, B:397:0x0667, B:399:0x0671, B:401:0x0677, B:402:0x067a, B:404:0x067f, B:406:0x0689, B:408:0x068f, B:409:0x0692, B:410:0x0695, B:412:0x069f, B:414:0x06a5, B:415:0x06a8, B:416:0x06ab, B:420:0x06bc, B:422:0x05f2, B:424:0x05fe, B:427:0x0605, B:315:0x04fb), top: B:248:0x03bb }] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x05a5 A[Catch: Exception -> 0x0261, TryCatch #16 {Exception -> 0x0261, blocks: (B:249:0x03bb, B:251:0x03c5, B:252:0x03d2, B:254:0x03d8, B:256:0x03e2, B:258:0x03f2, B:259:0x03fb, B:261:0x0401, B:263:0x040b, B:265:0x041b, B:266:0x0424, B:268:0x042a, B:270:0x0430, B:272:0x043a, B:274:0x0440, B:275:0x0443, B:277:0x044b, B:279:0x0451, B:281:0x045b, B:283:0x0469, B:284:0x0470, B:286:0x0476, B:288:0x0480, B:290:0x0490, B:291:0x0497, B:293:0x049d, B:295:0x04a7, B:297:0x04b5, B:298:0x04b9, B:300:0x04bf, B:302:0x04c5, B:304:0x04cf, B:306:0x04d5, B:307:0x04d8, B:308:0x04de, B:311:0x04e5, B:313:0x04eb, B:318:0x0503, B:320:0x0509, B:322:0x050f, B:323:0x0512, B:325:0x0517, B:327:0x051d, B:328:0x0520, B:330:0x0526, B:332:0x0530, B:333:0x0536, B:336:0x0544, B:338:0x054a, B:339:0x054d, B:341:0x0553, B:343:0x055d, B:345:0x0563, B:346:0x0566, B:347:0x0569, B:349:0x0573, B:351:0x0579, B:352:0x057c, B:353:0x057f, B:355:0x0589, B:357:0x058f, B:358:0x0592, B:359:0x0595, B:361:0x05a5, B:363:0x05ab, B:364:0x05ae, B:368:0x05c9, B:371:0x05dc, B:373:0x05e2, B:375:0x05ea, B:377:0x0612, B:379:0x061c, B:381:0x0624, B:383:0x0638, B:387:0x063c, B:389:0x0642, B:390:0x0645, B:391:0x0651, B:393:0x065b, B:395:0x0661, B:396:0x0664, B:397:0x0667, B:399:0x0671, B:401:0x0677, B:402:0x067a, B:404:0x067f, B:406:0x0689, B:408:0x068f, B:409:0x0692, B:410:0x0695, B:412:0x069f, B:414:0x06a5, B:415:0x06a8, B:416:0x06ab, B:420:0x06bc, B:422:0x05f2, B:424:0x05fe, B:427:0x0605, B:315:0x04fb), top: B:248:0x03bb }] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x061c A[Catch: Exception -> 0x0261, TryCatch #16 {Exception -> 0x0261, blocks: (B:249:0x03bb, B:251:0x03c5, B:252:0x03d2, B:254:0x03d8, B:256:0x03e2, B:258:0x03f2, B:259:0x03fb, B:261:0x0401, B:263:0x040b, B:265:0x041b, B:266:0x0424, B:268:0x042a, B:270:0x0430, B:272:0x043a, B:274:0x0440, B:275:0x0443, B:277:0x044b, B:279:0x0451, B:281:0x045b, B:283:0x0469, B:284:0x0470, B:286:0x0476, B:288:0x0480, B:290:0x0490, B:291:0x0497, B:293:0x049d, B:295:0x04a7, B:297:0x04b5, B:298:0x04b9, B:300:0x04bf, B:302:0x04c5, B:304:0x04cf, B:306:0x04d5, B:307:0x04d8, B:308:0x04de, B:311:0x04e5, B:313:0x04eb, B:318:0x0503, B:320:0x0509, B:322:0x050f, B:323:0x0512, B:325:0x0517, B:327:0x051d, B:328:0x0520, B:330:0x0526, B:332:0x0530, B:333:0x0536, B:336:0x0544, B:338:0x054a, B:339:0x054d, B:341:0x0553, B:343:0x055d, B:345:0x0563, B:346:0x0566, B:347:0x0569, B:349:0x0573, B:351:0x0579, B:352:0x057c, B:353:0x057f, B:355:0x0589, B:357:0x058f, B:358:0x0592, B:359:0x0595, B:361:0x05a5, B:363:0x05ab, B:364:0x05ae, B:368:0x05c9, B:371:0x05dc, B:373:0x05e2, B:375:0x05ea, B:377:0x0612, B:379:0x061c, B:381:0x0624, B:383:0x0638, B:387:0x063c, B:389:0x0642, B:390:0x0645, B:391:0x0651, B:393:0x065b, B:395:0x0661, B:396:0x0664, B:397:0x0667, B:399:0x0671, B:401:0x0677, B:402:0x067a, B:404:0x067f, B:406:0x0689, B:408:0x068f, B:409:0x0692, B:410:0x0695, B:412:0x069f, B:414:0x06a5, B:415:0x06a8, B:416:0x06ab, B:420:0x06bc, B:422:0x05f2, B:424:0x05fe, B:427:0x0605, B:315:0x04fb), top: B:248:0x03bb }] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0642 A[Catch: Exception -> 0x0261, TryCatch #16 {Exception -> 0x0261, blocks: (B:249:0x03bb, B:251:0x03c5, B:252:0x03d2, B:254:0x03d8, B:256:0x03e2, B:258:0x03f2, B:259:0x03fb, B:261:0x0401, B:263:0x040b, B:265:0x041b, B:266:0x0424, B:268:0x042a, B:270:0x0430, B:272:0x043a, B:274:0x0440, B:275:0x0443, B:277:0x044b, B:279:0x0451, B:281:0x045b, B:283:0x0469, B:284:0x0470, B:286:0x0476, B:288:0x0480, B:290:0x0490, B:291:0x0497, B:293:0x049d, B:295:0x04a7, B:297:0x04b5, B:298:0x04b9, B:300:0x04bf, B:302:0x04c5, B:304:0x04cf, B:306:0x04d5, B:307:0x04d8, B:308:0x04de, B:311:0x04e5, B:313:0x04eb, B:318:0x0503, B:320:0x0509, B:322:0x050f, B:323:0x0512, B:325:0x0517, B:327:0x051d, B:328:0x0520, B:330:0x0526, B:332:0x0530, B:333:0x0536, B:336:0x0544, B:338:0x054a, B:339:0x054d, B:341:0x0553, B:343:0x055d, B:345:0x0563, B:346:0x0566, B:347:0x0569, B:349:0x0573, B:351:0x0579, B:352:0x057c, B:353:0x057f, B:355:0x0589, B:357:0x058f, B:358:0x0592, B:359:0x0595, B:361:0x05a5, B:363:0x05ab, B:364:0x05ae, B:368:0x05c9, B:371:0x05dc, B:373:0x05e2, B:375:0x05ea, B:377:0x0612, B:379:0x061c, B:381:0x0624, B:383:0x0638, B:387:0x063c, B:389:0x0642, B:390:0x0645, B:391:0x0651, B:393:0x065b, B:395:0x0661, B:396:0x0664, B:397:0x0667, B:399:0x0671, B:401:0x0677, B:402:0x067a, B:404:0x067f, B:406:0x0689, B:408:0x068f, B:409:0x0692, B:410:0x0695, B:412:0x069f, B:414:0x06a5, B:415:0x06a8, B:416:0x06ab, B:420:0x06bc, B:422:0x05f2, B:424:0x05fe, B:427:0x0605, B:315:0x04fb), top: B:248:0x03bb }] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x065b A[Catch: Exception -> 0x0261, TryCatch #16 {Exception -> 0x0261, blocks: (B:249:0x03bb, B:251:0x03c5, B:252:0x03d2, B:254:0x03d8, B:256:0x03e2, B:258:0x03f2, B:259:0x03fb, B:261:0x0401, B:263:0x040b, B:265:0x041b, B:266:0x0424, B:268:0x042a, B:270:0x0430, B:272:0x043a, B:274:0x0440, B:275:0x0443, B:277:0x044b, B:279:0x0451, B:281:0x045b, B:283:0x0469, B:284:0x0470, B:286:0x0476, B:288:0x0480, B:290:0x0490, B:291:0x0497, B:293:0x049d, B:295:0x04a7, B:297:0x04b5, B:298:0x04b9, B:300:0x04bf, B:302:0x04c5, B:304:0x04cf, B:306:0x04d5, B:307:0x04d8, B:308:0x04de, B:311:0x04e5, B:313:0x04eb, B:318:0x0503, B:320:0x0509, B:322:0x050f, B:323:0x0512, B:325:0x0517, B:327:0x051d, B:328:0x0520, B:330:0x0526, B:332:0x0530, B:333:0x0536, B:336:0x0544, B:338:0x054a, B:339:0x054d, B:341:0x0553, B:343:0x055d, B:345:0x0563, B:346:0x0566, B:347:0x0569, B:349:0x0573, B:351:0x0579, B:352:0x057c, B:353:0x057f, B:355:0x0589, B:357:0x058f, B:358:0x0592, B:359:0x0595, B:361:0x05a5, B:363:0x05ab, B:364:0x05ae, B:368:0x05c9, B:371:0x05dc, B:373:0x05e2, B:375:0x05ea, B:377:0x0612, B:379:0x061c, B:381:0x0624, B:383:0x0638, B:387:0x063c, B:389:0x0642, B:390:0x0645, B:391:0x0651, B:393:0x065b, B:395:0x0661, B:396:0x0664, B:397:0x0667, B:399:0x0671, B:401:0x0677, B:402:0x067a, B:404:0x067f, B:406:0x0689, B:408:0x068f, B:409:0x0692, B:410:0x0695, B:412:0x069f, B:414:0x06a5, B:415:0x06a8, B:416:0x06ab, B:420:0x06bc, B:422:0x05f2, B:424:0x05fe, B:427:0x0605, B:315:0x04fb), top: B:248:0x03bb }] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0671 A[Catch: Exception -> 0x0261, TryCatch #16 {Exception -> 0x0261, blocks: (B:249:0x03bb, B:251:0x03c5, B:252:0x03d2, B:254:0x03d8, B:256:0x03e2, B:258:0x03f2, B:259:0x03fb, B:261:0x0401, B:263:0x040b, B:265:0x041b, B:266:0x0424, B:268:0x042a, B:270:0x0430, B:272:0x043a, B:274:0x0440, B:275:0x0443, B:277:0x044b, B:279:0x0451, B:281:0x045b, B:283:0x0469, B:284:0x0470, B:286:0x0476, B:288:0x0480, B:290:0x0490, B:291:0x0497, B:293:0x049d, B:295:0x04a7, B:297:0x04b5, B:298:0x04b9, B:300:0x04bf, B:302:0x04c5, B:304:0x04cf, B:306:0x04d5, B:307:0x04d8, B:308:0x04de, B:311:0x04e5, B:313:0x04eb, B:318:0x0503, B:320:0x0509, B:322:0x050f, B:323:0x0512, B:325:0x0517, B:327:0x051d, B:328:0x0520, B:330:0x0526, B:332:0x0530, B:333:0x0536, B:336:0x0544, B:338:0x054a, B:339:0x054d, B:341:0x0553, B:343:0x055d, B:345:0x0563, B:346:0x0566, B:347:0x0569, B:349:0x0573, B:351:0x0579, B:352:0x057c, B:353:0x057f, B:355:0x0589, B:357:0x058f, B:358:0x0592, B:359:0x0595, B:361:0x05a5, B:363:0x05ab, B:364:0x05ae, B:368:0x05c9, B:371:0x05dc, B:373:0x05e2, B:375:0x05ea, B:377:0x0612, B:379:0x061c, B:381:0x0624, B:383:0x0638, B:387:0x063c, B:389:0x0642, B:390:0x0645, B:391:0x0651, B:393:0x065b, B:395:0x0661, B:396:0x0664, B:397:0x0667, B:399:0x0671, B:401:0x0677, B:402:0x067a, B:404:0x067f, B:406:0x0689, B:408:0x068f, B:409:0x0692, B:410:0x0695, B:412:0x069f, B:414:0x06a5, B:415:0x06a8, B:416:0x06ab, B:420:0x06bc, B:422:0x05f2, B:424:0x05fe, B:427:0x0605, B:315:0x04fb), top: B:248:0x03bb }] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x067f A[Catch: Exception -> 0x0261, TryCatch #16 {Exception -> 0x0261, blocks: (B:249:0x03bb, B:251:0x03c5, B:252:0x03d2, B:254:0x03d8, B:256:0x03e2, B:258:0x03f2, B:259:0x03fb, B:261:0x0401, B:263:0x040b, B:265:0x041b, B:266:0x0424, B:268:0x042a, B:270:0x0430, B:272:0x043a, B:274:0x0440, B:275:0x0443, B:277:0x044b, B:279:0x0451, B:281:0x045b, B:283:0x0469, B:284:0x0470, B:286:0x0476, B:288:0x0480, B:290:0x0490, B:291:0x0497, B:293:0x049d, B:295:0x04a7, B:297:0x04b5, B:298:0x04b9, B:300:0x04bf, B:302:0x04c5, B:304:0x04cf, B:306:0x04d5, B:307:0x04d8, B:308:0x04de, B:311:0x04e5, B:313:0x04eb, B:318:0x0503, B:320:0x0509, B:322:0x050f, B:323:0x0512, B:325:0x0517, B:327:0x051d, B:328:0x0520, B:330:0x0526, B:332:0x0530, B:333:0x0536, B:336:0x0544, B:338:0x054a, B:339:0x054d, B:341:0x0553, B:343:0x055d, B:345:0x0563, B:346:0x0566, B:347:0x0569, B:349:0x0573, B:351:0x0579, B:352:0x057c, B:353:0x057f, B:355:0x0589, B:357:0x058f, B:358:0x0592, B:359:0x0595, B:361:0x05a5, B:363:0x05ab, B:364:0x05ae, B:368:0x05c9, B:371:0x05dc, B:373:0x05e2, B:375:0x05ea, B:377:0x0612, B:379:0x061c, B:381:0x0624, B:383:0x0638, B:387:0x063c, B:389:0x0642, B:390:0x0645, B:391:0x0651, B:393:0x065b, B:395:0x0661, B:396:0x0664, B:397:0x0667, B:399:0x0671, B:401:0x0677, B:402:0x067a, B:404:0x067f, B:406:0x0689, B:408:0x068f, B:409:0x0692, B:410:0x0695, B:412:0x069f, B:414:0x06a5, B:415:0x06a8, B:416:0x06ab, B:420:0x06bc, B:422:0x05f2, B:424:0x05fe, B:427:0x0605, B:315:0x04fb), top: B:248:0x03bb }] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x06bc A[Catch: Exception -> 0x0261, TRY_LEAVE, TryCatch #16 {Exception -> 0x0261, blocks: (B:249:0x03bb, B:251:0x03c5, B:252:0x03d2, B:254:0x03d8, B:256:0x03e2, B:258:0x03f2, B:259:0x03fb, B:261:0x0401, B:263:0x040b, B:265:0x041b, B:266:0x0424, B:268:0x042a, B:270:0x0430, B:272:0x043a, B:274:0x0440, B:275:0x0443, B:277:0x044b, B:279:0x0451, B:281:0x045b, B:283:0x0469, B:284:0x0470, B:286:0x0476, B:288:0x0480, B:290:0x0490, B:291:0x0497, B:293:0x049d, B:295:0x04a7, B:297:0x04b5, B:298:0x04b9, B:300:0x04bf, B:302:0x04c5, B:304:0x04cf, B:306:0x04d5, B:307:0x04d8, B:308:0x04de, B:311:0x04e5, B:313:0x04eb, B:318:0x0503, B:320:0x0509, B:322:0x050f, B:323:0x0512, B:325:0x0517, B:327:0x051d, B:328:0x0520, B:330:0x0526, B:332:0x0530, B:333:0x0536, B:336:0x0544, B:338:0x054a, B:339:0x054d, B:341:0x0553, B:343:0x055d, B:345:0x0563, B:346:0x0566, B:347:0x0569, B:349:0x0573, B:351:0x0579, B:352:0x057c, B:353:0x057f, B:355:0x0589, B:357:0x058f, B:358:0x0592, B:359:0x0595, B:361:0x05a5, B:363:0x05ab, B:364:0x05ae, B:368:0x05c9, B:371:0x05dc, B:373:0x05e2, B:375:0x05ea, B:377:0x0612, B:379:0x061c, B:381:0x0624, B:383:0x0638, B:387:0x063c, B:389:0x0642, B:390:0x0645, B:391:0x0651, B:393:0x065b, B:395:0x0661, B:396:0x0664, B:397:0x0667, B:399:0x0671, B:401:0x0677, B:402:0x067a, B:404:0x067f, B:406:0x0689, B:408:0x068f, B:409:0x0692, B:410:0x0695, B:412:0x069f, B:414:0x06a5, B:415:0x06a8, B:416:0x06ab, B:420:0x06bc, B:422:0x05f2, B:424:0x05fe, B:427:0x0605, B:315:0x04fb), top: B:248:0x03bb }] */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0501  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        zf.h0 h0Var;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue3;
        String str;
        String str2;
        List<Address> list;
        String format;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String L0;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue4;
        String c10;
        Address address;
        String str11;
        String str12;
        Address address2;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        boolean z10;
        String subThoroughfare;
        boolean z11;
        String thoroughfare;
        String locality;
        String str18;
        String countryName;
        StringBuilder sb2;
        StringBuilder sb3;
        boolean z12;
        String str19;
        String countryName2;
        String locality2;
        String sb4;
        StringBuilder sb5;
        String str20;
        NativeByteBuffer byteBufferValue;
        boolean z13 = true;
        switch (this.a) {
            case 0:
                vp vpVar = (vp) this.c;
                rf.q qVar = (rf.q) this.d;
                qVar.b(vpVar.currentAccount, (ConcurrentHashMap) this.e, (ConcurrentHashMap) this.f, this.b);
                i0.g3(new sl(vpVar, qVar, 1));
                return;
            case 1:
                Locale locale = (Locale) this.c;
                Location location = (Location) this.d;
                int i10 = this.b;
                Locale locale2 = (Locale) this.e;
                zf.h0 h0Var2 = (zf.h0) this.f;
                StringBuilder sb6 = new StringBuilder();
                TL_stories.TL_geoPointAddress tL_geoPointAddress = new TL_stories.TL_geoPointAddress();
                TL_stories.TL_geoPointAddress tL_geoPointAddress2 = new TL_stories.TL_geoPointAddress();
                try {
                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue5 = null;
                    try {
                        List<Address> fromLocation = new Geocoder(w0.b, locale).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
                        if (i10 != 2) {
                            list = null;
                        } else if (locale2 == locale) {
                            list = fromLocation;
                        } else {
                            try {
                                list = new Geocoder(w0.b, locale2).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
                            } catch (Exception unused) {
                                h0Var = h0Var2;
                                tL_messageMediaVenue2 = null;
                                str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                                str = str2;
                                tL_messageMediaVenue3 = tL_messageMediaVenue5;
                                i0.g3(new ek((Object) h0Var, str2, str, (Object) tL_messageMediaVenue2, (Object) tL_messageMediaVenue3, (Object) location, 3));
                                return;
                            }
                        }
                        if (fromLocation.size() > 0) {
                            Address address3 = fromLocation.get(0);
                            Address address4 = (list == null || list.size() < 1) ? null : list.get(0);
                            if (i10 == 1) {
                                ArrayList arrayList = new ArrayList();
                                try {
                                    str20 = address3.getAddressLine(0);
                                } catch (Exception unused2) {
                                    str20 = null;
                                }
                                if (TextUtils.isEmpty(str20)) {
                                    try {
                                        arrayList.add(address3.getSubThoroughfare());
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        arrayList.add(address3.getThoroughfare());
                                    } catch (Exception unused4) {
                                    }
                                    try {
                                        arrayList.add(address3.getAdminArea());
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        arrayList.add(address3.getCountryName());
                                    } catch (Exception unused6) {
                                    }
                                } else {
                                    arrayList.add(str20);
                                }
                                int i11 = 0;
                                while (i11 < arrayList.size()) {
                                    if (arrayList.get(i11) != null) {
                                        String[] split = ((String) arrayList.get(i11)).split(", ");
                                        if (split.length > 1) {
                                            arrayList.remove(i11);
                                            for (String str21 : split) {
                                                arrayList.add(i11, str21);
                                                i11++;
                                            }
                                        }
                                    }
                                    i11++;
                                }
                                int i12 = 0;
                                while (i12 < arrayList.size()) {
                                    if (TextUtils.isEmpty((CharSequence) arrayList.get(i12)) || arrayList.indexOf(arrayList.get(i12)) != i12 || ((String) arrayList.get(i12)).matches("^\\s*\\d{4,}\\s*$")) {
                                        arrayList.remove(i12);
                                        i12--;
                                    }
                                    i12++;
                                }
                                format = arrayList.isEmpty() ? null : TextUtils.join(", ", arrayList);
                                str3 = format;
                                h0Var = h0Var2;
                                sb4 = null;
                                str5 = null;
                                str18 = null;
                                str12 = null;
                                str19 = null;
                            } else {
                                StringBuilder sb7 = new StringBuilder();
                                StringBuilder sb8 = new StringBuilder();
                                StringBuilder sb9 = new StringBuilder();
                                StringBuilder sb10 = new StringBuilder();
                                String locality3 = TextUtils.isEmpty(null) ? address3.getLocality() : null;
                                if (TextUtils.isEmpty(locality3)) {
                                    locality3 = address3.getAdminArea();
                                }
                                if (TextUtils.isEmpty(locality3)) {
                                    locality3 = address3.getSubAdminArea();
                                }
                                String str22 = locality3;
                                if (address4 != null) {
                                    String locality4 = TextUtils.isEmpty(null) ? address4.getLocality() : null;
                                    if (TextUtils.isEmpty(locality4)) {
                                        locality4 = address4.getAdminArea();
                                    }
                                    if (TextUtils.isEmpty(locality4)) {
                                        locality4 = address4.getSubAdminArea();
                                    }
                                    String str23 = locality4;
                                    address = address4;
                                    str11 = address4.getAdminArea();
                                    str12 = str23;
                                } else {
                                    address = address4;
                                    str11 = null;
                                    str12 = null;
                                }
                                if (TextUtils.isEmpty(null)) {
                                    address2 = address3;
                                    if (!TextUtils.equals(address2.getThoroughfare(), str22)) {
                                        h0Var = h0Var2;
                                        try {
                                            if (!TextUtils.equals(address2.getThoroughfare(), address2.getCountryName())) {
                                                str13 = address2.getThoroughfare();
                                                if (TextUtils.isEmpty(str13) || TextUtils.equals(address2.getSubLocality(), str22)) {
                                                    str14 = str13;
                                                } else {
                                                    str14 = str13;
                                                    if (!TextUtils.equals(address2.getSubLocality(), address2.getCountryName())) {
                                                        str15 = address2.getSubLocality();
                                                        if (TextUtils.isEmpty(str15) || TextUtils.equals(address2.getLocality(), str22)) {
                                                            str16 = str15;
                                                        } else {
                                                            str16 = str15;
                                                            if (!TextUtils.equals(address2.getLocality(), address2.getCountryName())) {
                                                                str17 = address2.getLocality();
                                                                if (!TextUtils.isEmpty(str17) || TextUtils.equals(str17, str22) || TextUtils.equals(str17, address2.getCountryName())) {
                                                                    sb10 = null;
                                                                } else {
                                                                    if (sb10.length() > 0) {
                                                                        sb10.append(", ");
                                                                    }
                                                                    sb10.append(str17);
                                                                }
                                                                if (address != null) {
                                                                    String thoroughfare2 = (!TextUtils.isEmpty(null) || TextUtils.equals(address.getThoroughfare(), str22) || TextUtils.equals(address.getThoroughfare(), address.getCountryName())) ? null : address.getThoroughfare();
                                                                    if (!TextUtils.isEmpty(thoroughfare2) || TextUtils.equals(address.getSubLocality(), str22)) {
                                                                        sb5 = sb10;
                                                                    } else {
                                                                        sb5 = sb10;
                                                                        if (!TextUtils.equals(address.getSubLocality(), address.getCountryName())) {
                                                                            thoroughfare2 = address.getSubLocality();
                                                                        }
                                                                    }
                                                                    if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address.getLocality(), str22) && !TextUtils.equals(address.getLocality(), address.getCountryName())) {
                                                                        thoroughfare2 = address.getLocality();
                                                                    }
                                                                    if (TextUtils.isEmpty(thoroughfare2) || TextUtils.equals(thoroughfare2, str11) || TextUtils.equals(thoroughfare2, address.getCountryName())) {
                                                                        sb6 = null;
                                                                    } else {
                                                                        if (sb6.length() > 0) {
                                                                            sb6.append(", ");
                                                                        }
                                                                        sb6.append(thoroughfare2);
                                                                    }
                                                                    if (!TextUtils.isEmpty(sb6)) {
                                                                        int i13 = 0;
                                                                        while (true) {
                                                                            String[] strArr = nd.P;
                                                                            if (i13 < 19) {
                                                                                if (strArr[i13].equalsIgnoreCase(sb6.toString())) {
                                                                                    sb10 = null;
                                                                                    sb6 = null;
                                                                                } else {
                                                                                    i13++;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    sb10 = sb5;
                                                                }
                                                                if (TextUtils.isEmpty(str22)) {
                                                                    z10 = true;
                                                                } else {
                                                                    if (sb9.length() > 0) {
                                                                        sb9.append(", ");
                                                                    }
                                                                    sb9.append(str22);
                                                                    if (sb10 != null) {
                                                                        if (sb10.length() > 0) {
                                                                            sb10.append(", ");
                                                                        }
                                                                        sb10.append(str22);
                                                                    }
                                                                    z10 = false;
                                                                }
                                                                subThoroughfare = address2.getSubThoroughfare();
                                                                if (TextUtils.isEmpty(subThoroughfare)) {
                                                                    z11 = false;
                                                                } else {
                                                                    sb7.append(subThoroughfare);
                                                                    z11 = true;
                                                                }
                                                                thoroughfare = address2.getThoroughfare();
                                                                boolean z14 = z10;
                                                                if (!TextUtils.isEmpty(thoroughfare)) {
                                                                    if (sb7.length() > 0) {
                                                                        sb7.append(" ");
                                                                    }
                                                                    sb7.append(thoroughfare);
                                                                    z11 = true;
                                                                }
                                                                if (!z11) {
                                                                    String adminArea = address2.getAdminArea();
                                                                    if (!TextUtils.isEmpty(adminArea)) {
                                                                        if (sb7.length() > 0) {
                                                                            sb7.append(", ");
                                                                        }
                                                                        sb7.append(adminArea);
                                                                    }
                                                                    String subAdminArea = address2.getSubAdminArea();
                                                                    if (!TextUtils.isEmpty(subAdminArea)) {
                                                                        if (sb7.length() > 0) {
                                                                            sb7.append(", ");
                                                                        }
                                                                        sb7.append(subAdminArea);
                                                                    }
                                                                }
                                                                locality = address2.getLocality();
                                                                if (!TextUtils.isEmpty(locality)) {
                                                                    if (sb7.length() > 0) {
                                                                        sb7.append(", ");
                                                                    }
                                                                    sb7.append(locality);
                                                                }
                                                                String countryCode = address2.getCountryCode();
                                                                str18 = str11;
                                                                countryName = address2.getCountryName();
                                                                if (TextUtils.isEmpty(countryName)) {
                                                                    sb2 = sb10;
                                                                    sb3 = sb7;
                                                                    z12 = z11;
                                                                    str19 = countryCode;
                                                                } else {
                                                                    if (sb7.length() > 0) {
                                                                        sb7.append(", ");
                                                                    }
                                                                    sb7.append(countryName);
                                                                    sb2 = sb10;
                                                                    String language = locale.getLanguage();
                                                                    sb3 = sb7;
                                                                    if ("US".equals(address2.getCountryCode())) {
                                                                        z12 = z11;
                                                                        str19 = countryCode;
                                                                    } else {
                                                                        z12 = z11;
                                                                        str19 = countryCode;
                                                                        if ("AE".equals(address2.getCountryCode())) {
                                                                        }
                                                                        if ("GB".equals(address2.getCountryCode()) && "en".equals(language)) {
                                                                            String str24 = "";
                                                                            for (String str25 : countryName.split(" ")) {
                                                                                if (str25.length() > 0) {
                                                                                    str24 = str24 + str25.charAt(0);
                                                                                }
                                                                            }
                                                                            countryName = str24;
                                                                            if (sb9.length() > 0) {
                                                                            }
                                                                            sb9.append(countryName);
                                                                        } else {
                                                                            if ("US".equals(address2.getCountryCode())) {
                                                                                countryName = "USA";
                                                                            }
                                                                            if (sb9.length() > 0) {
                                                                                sb9.append(", ");
                                                                            }
                                                                            sb9.append(countryName);
                                                                        }
                                                                    }
                                                                    if (!"en".equals(language)) {
                                                                        if (!"uk".equals(language)) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    String str242 = "";
                                                                    while (r5 < r2) {
                                                                    }
                                                                    countryName = str242;
                                                                    if (sb9.length() > 0) {
                                                                    }
                                                                    sb9.append(countryName);
                                                                }
                                                                countryName2 = address2.getCountryName();
                                                                if (!TextUtils.isEmpty(countryName2)) {
                                                                    if (sb8.length() > 0) {
                                                                        sb8.append(", ");
                                                                    }
                                                                    sb8.append(countryName2);
                                                                }
                                                                locality2 = address2.getLocality();
                                                                if (!TextUtils.isEmpty(locality2)) {
                                                                    if (sb8.length() > 0) {
                                                                        sb8.append(", ");
                                                                    }
                                                                    sb8.append(locality2);
                                                                }
                                                                if (!z12) {
                                                                    String adminArea2 = address2.getAdminArea();
                                                                    if (!TextUtils.isEmpty(adminArea2)) {
                                                                        if (sb8.length() > 0) {
                                                                            sb8.append(", ");
                                                                        }
                                                                        sb8.append(adminArea2);
                                                                    }
                                                                    String subAdminArea2 = address2.getSubAdminArea();
                                                                    if (!TextUtils.isEmpty(subAdminArea2)) {
                                                                        if (sb8.length() > 0) {
                                                                            sb8.append(", ");
                                                                        }
                                                                        sb8.append(subAdminArea2);
                                                                    }
                                                                }
                                                                format = sb3.toString();
                                                                str3 = sb8.toString();
                                                                sb4 = sb9.toString();
                                                                str5 = sb2 == null ? null : sb2.toString();
                                                                z13 = z14;
                                                            }
                                                        }
                                                        str17 = str16;
                                                        if (TextUtils.isEmpty(str17)) {
                                                        }
                                                        sb10 = null;
                                                        if (address != null) {
                                                        }
                                                        if (TextUtils.isEmpty(str22)) {
                                                        }
                                                        subThoroughfare = address2.getSubThoroughfare();
                                                        if (TextUtils.isEmpty(subThoroughfare)) {
                                                        }
                                                        thoroughfare = address2.getThoroughfare();
                                                        boolean z142 = z10;
                                                        if (!TextUtils.isEmpty(thoroughfare)) {
                                                        }
                                                        if (!z11) {
                                                        }
                                                        locality = address2.getLocality();
                                                        if (!TextUtils.isEmpty(locality)) {
                                                        }
                                                        String countryCode2 = address2.getCountryCode();
                                                        str18 = str11;
                                                        countryName = address2.getCountryName();
                                                        if (TextUtils.isEmpty(countryName)) {
                                                        }
                                                        countryName2 = address2.getCountryName();
                                                        if (!TextUtils.isEmpty(countryName2)) {
                                                        }
                                                        locality2 = address2.getLocality();
                                                        if (!TextUtils.isEmpty(locality2)) {
                                                        }
                                                        if (!z12) {
                                                        }
                                                        format = sb3.toString();
                                                        str3 = sb8.toString();
                                                        sb4 = sb9.toString();
                                                        str5 = sb2 == null ? null : sb2.toString();
                                                        z13 = z142;
                                                    }
                                                }
                                                str15 = str14;
                                                if (TextUtils.isEmpty(str15)) {
                                                }
                                                str16 = str15;
                                                str17 = str16;
                                                if (TextUtils.isEmpty(str17)) {
                                                }
                                                sb10 = null;
                                                if (address != null) {
                                                }
                                                if (TextUtils.isEmpty(str22)) {
                                                }
                                                subThoroughfare = address2.getSubThoroughfare();
                                                if (TextUtils.isEmpty(subThoroughfare)) {
                                                }
                                                thoroughfare = address2.getThoroughfare();
                                                boolean z1422 = z10;
                                                if (!TextUtils.isEmpty(thoroughfare)) {
                                                }
                                                if (!z11) {
                                                }
                                                locality = address2.getLocality();
                                                if (!TextUtils.isEmpty(locality)) {
                                                }
                                                String countryCode22 = address2.getCountryCode();
                                                str18 = str11;
                                                countryName = address2.getCountryName();
                                                if (TextUtils.isEmpty(countryName)) {
                                                }
                                                countryName2 = address2.getCountryName();
                                                if (!TextUtils.isEmpty(countryName2)) {
                                                }
                                                locality2 = address2.getLocality();
                                                if (!TextUtils.isEmpty(locality2)) {
                                                }
                                                if (!z12) {
                                                }
                                                format = sb3.toString();
                                                str3 = sb8.toString();
                                                sb4 = sb9.toString();
                                                str5 = sb2 == null ? null : sb2.toString();
                                                z13 = z1422;
                                            }
                                            str13 = null;
                                            if (TextUtils.isEmpty(str13)) {
                                            }
                                            str14 = str13;
                                            str15 = str14;
                                            if (TextUtils.isEmpty(str15)) {
                                            }
                                            str16 = str15;
                                            str17 = str16;
                                            if (TextUtils.isEmpty(str17)) {
                                            }
                                            sb10 = null;
                                            if (address != null) {
                                            }
                                            if (TextUtils.isEmpty(str22)) {
                                            }
                                            subThoroughfare = address2.getSubThoroughfare();
                                            if (TextUtils.isEmpty(subThoroughfare)) {
                                            }
                                            thoroughfare = address2.getThoroughfare();
                                            boolean z14222 = z10;
                                            if (!TextUtils.isEmpty(thoroughfare)) {
                                            }
                                            if (!z11) {
                                            }
                                            locality = address2.getLocality();
                                            if (!TextUtils.isEmpty(locality)) {
                                            }
                                            String countryCode222 = address2.getCountryCode();
                                            str18 = str11;
                                            countryName = address2.getCountryName();
                                            if (TextUtils.isEmpty(countryName)) {
                                            }
                                            countryName2 = address2.getCountryName();
                                            if (!TextUtils.isEmpty(countryName2)) {
                                            }
                                            locality2 = address2.getLocality();
                                            if (!TextUtils.isEmpty(locality2)) {
                                            }
                                            if (!z12) {
                                            }
                                            format = sb3.toString();
                                            str3 = sb8.toString();
                                            sb4 = sb9.toString();
                                            str5 = sb2 == null ? null : sb2.toString();
                                            z13 = z14222;
                                        } catch (Exception unused7) {
                                            tL_messageMediaVenue2 = null;
                                            str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                                            str = str2;
                                            tL_messageMediaVenue3 = tL_messageMediaVenue5;
                                            i0.g3(new ek((Object) h0Var, str2, str, (Object) tL_messageMediaVenue2, (Object) tL_messageMediaVenue3, (Object) location, 3));
                                            return;
                                        }
                                    }
                                } else {
                                    address2 = address3;
                                }
                                h0Var = h0Var2;
                                str13 = null;
                                if (TextUtils.isEmpty(str13)) {
                                }
                                str14 = str13;
                                str15 = str14;
                                if (TextUtils.isEmpty(str15)) {
                                }
                                str16 = str15;
                                str17 = str16;
                                if (TextUtils.isEmpty(str17)) {
                                }
                                sb10 = null;
                                if (address != null) {
                                }
                                if (TextUtils.isEmpty(str22)) {
                                }
                                subThoroughfare = address2.getSubThoroughfare();
                                if (TextUtils.isEmpty(subThoroughfare)) {
                                }
                                thoroughfare = address2.getThoroughfare();
                                boolean z142222 = z10;
                                if (!TextUtils.isEmpty(thoroughfare)) {
                                }
                                if (!z11) {
                                }
                                locality = address2.getLocality();
                                if (!TextUtils.isEmpty(locality)) {
                                }
                                String countryCode2222 = address2.getCountryCode();
                                str18 = str11;
                                countryName = address2.getCountryName();
                                if (TextUtils.isEmpty(countryName)) {
                                }
                                countryName2 = address2.getCountryName();
                                if (!TextUtils.isEmpty(countryName2)) {
                                }
                                locality2 = address2.getLocality();
                                if (!TextUtils.isEmpty(locality2)) {
                                }
                                if (!z12) {
                                }
                                format = sb3.toString();
                                str3 = sb8.toString();
                                sb4 = sb9.toString();
                                str5 = sb2 == null ? null : sb2.toString();
                                z13 = z142222;
                            }
                            str7 = sb4;
                            str4 = str18;
                            str6 = str12;
                            str8 = str19;
                        } else {
                            h0Var = h0Var2;
                            if (i10 == 1) {
                                format = null;
                            } else {
                                try {
                                    format = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                                } catch (Exception unused8) {
                                    tL_messageMediaVenue = null;
                                    tL_messageMediaVenue2 = tL_messageMediaVenue;
                                    tL_messageMediaVenue5 = tL_messageMediaVenue2;
                                    str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                                    str = str2;
                                    tL_messageMediaVenue3 = tL_messageMediaVenue5;
                                    i0.g3(new ek((Object) h0Var, str2, str, (Object) tL_messageMediaVenue2, (Object) tL_messageMediaVenue3, (Object) location, 3));
                                    return;
                                }
                            }
                            str3 = format;
                            str4 = null;
                            str5 = null;
                            str6 = null;
                            str7 = null;
                            str8 = null;
                            z13 = true;
                        }
                        if (TextUtils.isEmpty(str7)) {
                            str9 = format;
                            str10 = str3;
                            tL_messageMediaVenue2 = null;
                        } else {
                            try {
                                tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                            } catch (Exception unused9) {
                                tL_messageMediaVenue2 = null;
                            }
                            try {
                                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                tL_messageMediaVenue2.geo = tL_geoPoint;
                                str9 = format;
                                tL_geoPoint.lat = location.getLatitude();
                                str10 = str3;
                                tL_messageMediaVenue2.geo._long = location.getLongitude();
                                tL_messageMediaVenue2.query_id = -1L;
                                tL_messageMediaVenue2.title = str7;
                                tL_messageMediaVenue2.icon = z13 ? "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png" : "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                tL_messageMediaVenue2.emoji = nd.b(str8);
                                if (z13) {
                                    try {
                                        L0 = cd.L0(2131751754, null);
                                    } catch (Exception unused10) {
                                        tL_messageMediaVenue5 = null;
                                        str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                                        str = str2;
                                        tL_messageMediaVenue3 = tL_messageMediaVenue5;
                                        i0.g3(new ek((Object) h0Var, str2, str, (Object) tL_messageMediaVenue2, (Object) tL_messageMediaVenue3, (Object) location, 3));
                                        return;
                                    }
                                } else {
                                    L0 = cd.L0(2131747611, null);
                                }
                                tL_messageMediaVenue2.address = L0;
                                tL_messageMediaVenue2.geoAddress = tL_geoPointAddress;
                                tL_geoPointAddress.country_iso2 = str8;
                                if (!z13) {
                                    if (!TextUtils.isEmpty(str4)) {
                                        tL_geoPointAddress.flags |= 1;
                                        tL_geoPointAddress.state = str4;
                                    }
                                    if (!TextUtils.isEmpty(str6)) {
                                        tL_geoPointAddress.flags |= 2;
                                        tL_geoPointAddress.city = str6;
                                    }
                                }
                            } catch (Exception unused11) {
                                tL_messageMediaVenue5 = null;
                                str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                                str = str2;
                                tL_messageMediaVenue3 = tL_messageMediaVenue5;
                                i0.g3(new ek((Object) h0Var, str2, str, (Object) tL_messageMediaVenue2, (Object) tL_messageMediaVenue3, (Object) location, 3));
                                return;
                            }
                        }
                        try {
                            if (TextUtils.isEmpty(str5)) {
                                tL_messageMediaVenue4 = null;
                            } else {
                                tL_messageMediaVenue4 = new TLRPC.TL_messageMediaVenue();
                                try {
                                    TLRPC.TL_geoPoint tL_geoPoint2 = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue4.geo = tL_geoPoint2;
                                    StringBuilder sb11 = sb6;
                                    tL_geoPoint2.lat = location.getLatitude();
                                    tL_messageMediaVenue4.geo._long = location.getLongitude();
                                    tL_messageMediaVenue4.query_id = -1L;
                                    tL_messageMediaVenue4.title = str5;
                                    tL_messageMediaVenue4.icon = "pin";
                                    tL_messageMediaVenue4.address = cd.L0(2131747476, null);
                                    tL_messageMediaVenue4.geoAddress = tL_geoPointAddress2;
                                    tL_geoPointAddress2.country_iso2 = str8;
                                    if (!TextUtils.isEmpty(str4)) {
                                        tL_geoPointAddress2.flags |= 1;
                                        tL_geoPointAddress2.state = str4;
                                    }
                                    if (!TextUtils.isEmpty(str6)) {
                                        tL_geoPointAddress2.flags |= 2;
                                        tL_geoPointAddress2.city = str6;
                                    }
                                    if (!TextUtils.isEmpty(sb11)) {
                                        tL_geoPointAddress2.flags |= 4;
                                        tL_geoPointAddress2.street = sb11.toString();
                                    }
                                } catch (Exception unused12) {
                                    tL_messageMediaVenue5 = tL_messageMediaVenue4;
                                    str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                                    str = str2;
                                    tL_messageMediaVenue3 = tL_messageMediaVenue5;
                                    i0.g3(new ek((Object) h0Var, str2, str, (Object) tL_messageMediaVenue2, (Object) tL_messageMediaVenue3, (Object) location, 3));
                                    return;
                                }
                            }
                            if (tL_messageMediaVenue2 == null && tL_messageMediaVenue4 == null && (c10 = nd.c(location.getLongitude(), location.getLatitude())) != null) {
                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue6 = new TLRPC.TL_messageMediaVenue();
                                try {
                                    TLRPC.TL_geoPoint tL_geoPoint3 = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue6.geo = tL_geoPoint3;
                                    tL_geoPoint3.lat = location.getLatitude();
                                    tL_messageMediaVenue6.geo._long = location.getLongitude();
                                    tL_messageMediaVenue6.query_id = -1L;
                                    tL_messageMediaVenue6.title = c10;
                                    tL_messageMediaVenue6.icon = "pin";
                                    tL_messageMediaVenue6.emoji = "🌊";
                                    tL_messageMediaVenue6.address = "Ocean";
                                    tL_messageMediaVenue2 = tL_messageMediaVenue6;
                                } catch (Exception unused13) {
                                    tL_messageMediaVenue5 = tL_messageMediaVenue4;
                                    tL_messageMediaVenue2 = tL_messageMediaVenue6;
                                    str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                                    str = str2;
                                    tL_messageMediaVenue3 = tL_messageMediaVenue5;
                                    i0.g3(new ek((Object) h0Var, str2, str, (Object) tL_messageMediaVenue2, (Object) tL_messageMediaVenue3, (Object) location, 3));
                                    return;
                                }
                            }
                            tL_messageMediaVenue3 = tL_messageMediaVenue4;
                            str = str10;
                            str2 = str9;
                        } catch (Exception unused14) {
                            tL_messageMediaVenue5 = null;
                        }
                    } catch (Exception unused15) {
                        h0Var = h0Var2;
                    }
                } catch (Exception unused16) {
                    h0Var = h0Var2;
                    tL_messageMediaVenue = null;
                }
                i0.g3(new ek((Object) h0Var, str2, str, (Object) tL_messageMediaVenue2, (Object) tL_messageMediaVenue3, (Object) location, 3));
                return;
            case 2:
                ui uiVar = (ui) this.c;
                boolean[] zArr = (boolean[]) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                int i14 = this.b;
                int[] iArr = (int[]) this.f;
                ArrayList[] arrayListArr = uiVar.G;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    uiVar.g1(((TLRPC.TL_messages_stickerSet) arrayList2.get(i15)).set.id, false);
                    ((TLRPC.TL_messages_stickerSet) arrayList2.get(i15)).set.archived = false;
                    arrayListArr[i14].add(iArr[i15], (TLRPC.TL_messages_stickerSet) arrayList2.get(i15));
                    uiVar.I.k((TLRPC.TL_messages_stickerSet) arrayList2.get(i15), ((TLRPC.TL_messages_stickerSet) arrayList2.get(i15)).set.id);
                    uiVar.J.k((TLRPC.TL_messages_stickerSet) arrayList2.get(i15), ((TLRPC.TL_messages_stickerSet) arrayList2.get(i15)).set.id);
                    uiVar.N.put(((TLRPC.TL_messages_stickerSet) arrayList2.get(i15)).set.short_name, (TLRPC.TL_messages_stickerSet) arrayList2.get(i15));
                    uiVar.T.l(((TLRPC.TL_messages_stickerSet) arrayList2.get(i15)).set.id);
                }
                ArrayList arrayList3 = arrayListArr[i14];
                int i16 = uiVar.Y[i14];
                long[] jArr = uiVar.X;
                long q6 = ui.q(arrayList3);
                jArr[i14] = q6;
                uiVar.J1(i14, i16, q6, arrayList3);
                uiVar.getNotificationCenter().k(60, Integer.valueOf(i14), Boolean.TRUE);
                return;
            case 3:
                hs hsVar = (hs) this.c;
                String str26 = (String) this.d;
                int i17 = this.b;
                Object[] objArr = (Object[]) this.e;
                CountDownLatch countDownLatch = (CountDownLatch) this.f;
                hsVar.getClass();
                try {
                    try {
                        String a2 = Utilities.a(str26);
                        if (a2 != null) {
                            SQLiteDatabase sQLiteDatabase = hsVar.b;
                            Locale locale3 = Locale.US;
                            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, parent FROM sent_files_v2 WHERE uid = '" + a2 + "' AND type = " + i17, new Object[0]);
                            if (queryFinalized.next() && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                                TLRPC.MessageMedia TLdeserialize = TLRPC.MessageMedia.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                byteBufferValue.reuse();
                                if (TLdeserialize instanceof TLRPC.TL_messageMediaDocument) {
                                    objArr[0] = ((TLRPC.TL_messageMediaDocument) TLdeserialize).document;
                                } else if (TLdeserialize instanceof TLRPC.TL_messageMediaPhoto) {
                                    objArr[0] = ((TLRPC.TL_messageMediaPhoto) TLdeserialize).photo;
                                }
                                if (objArr[0] != null) {
                                    objArr[1] = queryFinalized.stringValue(1);
                                }
                            }
                            queryFinalized.dispose();
                        }
                    } catch (Exception e) {
                        hsVar.o(e, true);
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 4:
                a();
                return;
            case 5:
                zs zsVar = (zs) this.c;
                View view = (View) this.d;
                rs rsVar = (rs) this.e;
                qs qsVar = (qs) this.f;
                int i18 = this.b;
                view.removeOnAttachStateChangeListener(rsVar);
                zsVar.n(qsVar, i18);
                return;
            default:
                h00 h00Var = (h00) this.c;
                int i19 = this.b;
                ArrayList arrayList4 = (ArrayList) this.d;
                a0.h hVar = (a0.h) this.e;
                a0.h hVar2 = (a0.h) this.f;
                ArrayList arrayList5 = h00Var.o;
                a0.h hVar3 = h00Var.i;
                a0.h hVar4 = h00Var.h;
                ArrayList arrayList6 = h00Var.g;
                if (i19 != h00Var.c) {
                    return;
                }
                arrayList6.clear();
                arrayList6.addAll(arrayList4);
                hVar4.b();
                for (int i20 = 0; i20 < hVar.m(); i20++) {
                    hVar4.k((TLRPC.User) hVar.n(i20), hVar.j(i20));
                }
                hVar3.b();
                for (int i21 = 0; i21 < hVar2.m(); i21++) {
                    hVar3.k((TLRPC.Chat) hVar2.n(i21), hVar2.j(i21));
                }
                h00Var.e = true;
                h00Var.f = false;
                if (h00Var.d == 0 && !arrayList6.isEmpty()) {
                    h00Var.d = ((Long) arrayList6.get(0)).longValue();
                }
                ArrayList arrayList7 = new ArrayList(arrayList5);
                arrayList5.clear();
                for (int i22 = 0; i22 < arrayList7.size(); i22++) {
                    f00 f00Var = (f00) arrayList7.get(i22);
                    h00Var.c(f00Var.a, f00Var.b);
                }
                return;
        }
    }

    public /* synthetic */ kk(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i10;
    }

    public /* synthetic */ kk(f1 f1Var, Serializable serializable, Object obj, int i10, Serializable serializable2, int i11) {
        this.a = i11;
        this.c = f1Var;
        this.d = serializable;
        this.e = obj;
        this.b = i10;
        this.f = serializable2;
    }

    public /* synthetic */ kk(h00 h00Var, int i10, ArrayList arrayList, a0.h hVar, a0.h hVar2) {
        this.a = 6;
        this.c = h00Var;
        this.b = i10;
        this.d = arrayList;
        this.e = hVar;
        this.f = hVar2;
    }
}
