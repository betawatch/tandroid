// default package

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ad6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ad6(cf7 cf7Var, String str, int i, Object[] objArr, CountDownLatch countDownLatch) {
        this.a = (byte) 2;
        this.c = cf7Var;
        this.d = str;
        this.b = i;
        this.e = objArr;
        this.f = countDownLatch;
    }

    /* JADX WARN: Code restructure failed: missing block: B:373:0x058d, code lost:
    
        if ("ru".equals(r2) == false) goto L288;
     */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03a0 A[Catch: Exception -> 0x0715, TryCatch #7 {Exception -> 0x0715, blocks: (B:84:0x0231, B:86:0x0239, B:88:0x023f, B:91:0x024b, B:94:0x0256, B:96:0x0279, B:98:0x027d, B:100:0x0283, B:102:0x0289, B:104:0x0296, B:105:0x029a, B:107:0x029d, B:109:0x02a7, B:114:0x02aa, B:116:0x02b0, B:118:0x02bc, B:120:0x02c6, B:123:0x02d9, B:124:0x02d4, B:127:0x02db, B:135:0x069b, B:211:0x02e3, B:230:0x02f2, B:232:0x0310, B:233:0x0314, B:235:0x031a, B:238:0x0322, B:240:0x032c, B:241:0x0330, B:243:0x0336, B:244:0x033a, B:246:0x034f, B:248:0x0359, B:250:0x0369, B:251:0x0371, B:253:0x0377, B:255:0x0381, B:257:0x0391, B:258:0x039a, B:260:0x03a0, B:262:0x03aa, B:264:0x03ba, B:265:0x03c3, B:267:0x03c9, B:269:0x03cf, B:271:0x03d9, B:273:0x03df, B:274:0x03e2, B:276:0x03e9, B:278:0x03f3, B:280:0x0401, B:281:0x0407, B:283:0x040d, B:285:0x0417, B:287:0x0427, B:288:0x0430, B:290:0x0436, B:292:0x0440, B:294:0x0450, B:295:0x0459, B:297:0x045f, B:299:0x0465, B:301:0x046f, B:303:0x0475, B:304:0x0478, B:305:0x047d, B:308:0x0484, B:310:0x048c, B:312:0x049b, B:315:0x04a2, B:317:0x04a8, B:319:0x04ae, B:320:0x04b1, B:322:0x04b6, B:324:0x04bc, B:325:0x04bf, B:327:0x04c5, B:329:0x04cf, B:330:0x04d5, B:333:0x04e3, B:335:0x04e9, B:336:0x04ec, B:338:0x04f2, B:340:0x04fc, B:342:0x0502, B:343:0x0505, B:344:0x0508, B:346:0x0512, B:348:0x0518, B:349:0x051b, B:350:0x051e, B:352:0x0528, B:354:0x052e, B:355:0x0531, B:356:0x0534, B:358:0x0542, B:360:0x0548, B:361:0x054b, B:365:0x0566, B:368:0x0579, B:370:0x057f, B:372:0x0587, B:374:0x05ae, B:376:0x05b9, B:378:0x05c1, B:380:0x05d5, B:383:0x05d8, B:385:0x05de, B:386:0x05e1, B:387:0x05ed, B:389:0x05f7, B:391:0x05fd, B:392:0x0600, B:393:0x0603, B:395:0x060d, B:397:0x0613, B:398:0x0616, B:400:0x061b, B:402:0x0625, B:404:0x062b, B:405:0x062e, B:406:0x0631, B:408:0x063b, B:410:0x0641, B:411:0x0644, B:412:0x0647, B:416:0x0657, B:417:0x058f, B:419:0x059b, B:421:0x05a1, B:451:0x0214), top: B:450:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03c9 A[Catch: Exception -> 0x0715, TryCatch #7 {Exception -> 0x0715, blocks: (B:84:0x0231, B:86:0x0239, B:88:0x023f, B:91:0x024b, B:94:0x0256, B:96:0x0279, B:98:0x027d, B:100:0x0283, B:102:0x0289, B:104:0x0296, B:105:0x029a, B:107:0x029d, B:109:0x02a7, B:114:0x02aa, B:116:0x02b0, B:118:0x02bc, B:120:0x02c6, B:123:0x02d9, B:124:0x02d4, B:127:0x02db, B:135:0x069b, B:211:0x02e3, B:230:0x02f2, B:232:0x0310, B:233:0x0314, B:235:0x031a, B:238:0x0322, B:240:0x032c, B:241:0x0330, B:243:0x0336, B:244:0x033a, B:246:0x034f, B:248:0x0359, B:250:0x0369, B:251:0x0371, B:253:0x0377, B:255:0x0381, B:257:0x0391, B:258:0x039a, B:260:0x03a0, B:262:0x03aa, B:264:0x03ba, B:265:0x03c3, B:267:0x03c9, B:269:0x03cf, B:271:0x03d9, B:273:0x03df, B:274:0x03e2, B:276:0x03e9, B:278:0x03f3, B:280:0x0401, B:281:0x0407, B:283:0x040d, B:285:0x0417, B:287:0x0427, B:288:0x0430, B:290:0x0436, B:292:0x0440, B:294:0x0450, B:295:0x0459, B:297:0x045f, B:299:0x0465, B:301:0x046f, B:303:0x0475, B:304:0x0478, B:305:0x047d, B:308:0x0484, B:310:0x048c, B:312:0x049b, B:315:0x04a2, B:317:0x04a8, B:319:0x04ae, B:320:0x04b1, B:322:0x04b6, B:324:0x04bc, B:325:0x04bf, B:327:0x04c5, B:329:0x04cf, B:330:0x04d5, B:333:0x04e3, B:335:0x04e9, B:336:0x04ec, B:338:0x04f2, B:340:0x04fc, B:342:0x0502, B:343:0x0505, B:344:0x0508, B:346:0x0512, B:348:0x0518, B:349:0x051b, B:350:0x051e, B:352:0x0528, B:354:0x052e, B:355:0x0531, B:356:0x0534, B:358:0x0542, B:360:0x0548, B:361:0x054b, B:365:0x0566, B:368:0x0579, B:370:0x057f, B:372:0x0587, B:374:0x05ae, B:376:0x05b9, B:378:0x05c1, B:380:0x05d5, B:383:0x05d8, B:385:0x05de, B:386:0x05e1, B:387:0x05ed, B:389:0x05f7, B:391:0x05fd, B:392:0x0600, B:393:0x0603, B:395:0x060d, B:397:0x0613, B:398:0x0616, B:400:0x061b, B:402:0x0625, B:404:0x062b, B:405:0x062e, B:406:0x0631, B:408:0x063b, B:410:0x0641, B:411:0x0644, B:412:0x0647, B:416:0x0657, B:417:0x058f, B:419:0x059b, B:421:0x05a1, B:451:0x0214), top: B:450:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03e9 A[Catch: Exception -> 0x0715, TryCatch #7 {Exception -> 0x0715, blocks: (B:84:0x0231, B:86:0x0239, B:88:0x023f, B:91:0x024b, B:94:0x0256, B:96:0x0279, B:98:0x027d, B:100:0x0283, B:102:0x0289, B:104:0x0296, B:105:0x029a, B:107:0x029d, B:109:0x02a7, B:114:0x02aa, B:116:0x02b0, B:118:0x02bc, B:120:0x02c6, B:123:0x02d9, B:124:0x02d4, B:127:0x02db, B:135:0x069b, B:211:0x02e3, B:230:0x02f2, B:232:0x0310, B:233:0x0314, B:235:0x031a, B:238:0x0322, B:240:0x032c, B:241:0x0330, B:243:0x0336, B:244:0x033a, B:246:0x034f, B:248:0x0359, B:250:0x0369, B:251:0x0371, B:253:0x0377, B:255:0x0381, B:257:0x0391, B:258:0x039a, B:260:0x03a0, B:262:0x03aa, B:264:0x03ba, B:265:0x03c3, B:267:0x03c9, B:269:0x03cf, B:271:0x03d9, B:273:0x03df, B:274:0x03e2, B:276:0x03e9, B:278:0x03f3, B:280:0x0401, B:281:0x0407, B:283:0x040d, B:285:0x0417, B:287:0x0427, B:288:0x0430, B:290:0x0436, B:292:0x0440, B:294:0x0450, B:295:0x0459, B:297:0x045f, B:299:0x0465, B:301:0x046f, B:303:0x0475, B:304:0x0478, B:305:0x047d, B:308:0x0484, B:310:0x048c, B:312:0x049b, B:315:0x04a2, B:317:0x04a8, B:319:0x04ae, B:320:0x04b1, B:322:0x04b6, B:324:0x04bc, B:325:0x04bf, B:327:0x04c5, B:329:0x04cf, B:330:0x04d5, B:333:0x04e3, B:335:0x04e9, B:336:0x04ec, B:338:0x04f2, B:340:0x04fc, B:342:0x0502, B:343:0x0505, B:344:0x0508, B:346:0x0512, B:348:0x0518, B:349:0x051b, B:350:0x051e, B:352:0x0528, B:354:0x052e, B:355:0x0531, B:356:0x0534, B:358:0x0542, B:360:0x0548, B:361:0x054b, B:365:0x0566, B:368:0x0579, B:370:0x057f, B:372:0x0587, B:374:0x05ae, B:376:0x05b9, B:378:0x05c1, B:380:0x05d5, B:383:0x05d8, B:385:0x05de, B:386:0x05e1, B:387:0x05ed, B:389:0x05f7, B:391:0x05fd, B:392:0x0600, B:393:0x0603, B:395:0x060d, B:397:0x0613, B:398:0x0616, B:400:0x061b, B:402:0x0625, B:404:0x062b, B:405:0x062e, B:406:0x0631, B:408:0x063b, B:410:0x0641, B:411:0x0644, B:412:0x0647, B:416:0x0657, B:417:0x058f, B:419:0x059b, B:421:0x05a1, B:451:0x0214), top: B:450:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x045f A[Catch: Exception -> 0x0715, TryCatch #7 {Exception -> 0x0715, blocks: (B:84:0x0231, B:86:0x0239, B:88:0x023f, B:91:0x024b, B:94:0x0256, B:96:0x0279, B:98:0x027d, B:100:0x0283, B:102:0x0289, B:104:0x0296, B:105:0x029a, B:107:0x029d, B:109:0x02a7, B:114:0x02aa, B:116:0x02b0, B:118:0x02bc, B:120:0x02c6, B:123:0x02d9, B:124:0x02d4, B:127:0x02db, B:135:0x069b, B:211:0x02e3, B:230:0x02f2, B:232:0x0310, B:233:0x0314, B:235:0x031a, B:238:0x0322, B:240:0x032c, B:241:0x0330, B:243:0x0336, B:244:0x033a, B:246:0x034f, B:248:0x0359, B:250:0x0369, B:251:0x0371, B:253:0x0377, B:255:0x0381, B:257:0x0391, B:258:0x039a, B:260:0x03a0, B:262:0x03aa, B:264:0x03ba, B:265:0x03c3, B:267:0x03c9, B:269:0x03cf, B:271:0x03d9, B:273:0x03df, B:274:0x03e2, B:276:0x03e9, B:278:0x03f3, B:280:0x0401, B:281:0x0407, B:283:0x040d, B:285:0x0417, B:287:0x0427, B:288:0x0430, B:290:0x0436, B:292:0x0440, B:294:0x0450, B:295:0x0459, B:297:0x045f, B:299:0x0465, B:301:0x046f, B:303:0x0475, B:304:0x0478, B:305:0x047d, B:308:0x0484, B:310:0x048c, B:312:0x049b, B:315:0x04a2, B:317:0x04a8, B:319:0x04ae, B:320:0x04b1, B:322:0x04b6, B:324:0x04bc, B:325:0x04bf, B:327:0x04c5, B:329:0x04cf, B:330:0x04d5, B:333:0x04e3, B:335:0x04e9, B:336:0x04ec, B:338:0x04f2, B:340:0x04fc, B:342:0x0502, B:343:0x0505, B:344:0x0508, B:346:0x0512, B:348:0x0518, B:349:0x051b, B:350:0x051e, B:352:0x0528, B:354:0x052e, B:355:0x0531, B:356:0x0534, B:358:0x0542, B:360:0x0548, B:361:0x054b, B:365:0x0566, B:368:0x0579, B:370:0x057f, B:372:0x0587, B:374:0x05ae, B:376:0x05b9, B:378:0x05c1, B:380:0x05d5, B:383:0x05d8, B:385:0x05de, B:386:0x05e1, B:387:0x05ed, B:389:0x05f7, B:391:0x05fd, B:392:0x0600, B:393:0x0603, B:395:0x060d, B:397:0x0613, B:398:0x0616, B:400:0x061b, B:402:0x0625, B:404:0x062b, B:405:0x062e, B:406:0x0631, B:408:0x063b, B:410:0x0641, B:411:0x0644, B:412:0x0647, B:416:0x0657, B:417:0x058f, B:419:0x059b, B:421:0x05a1, B:451:0x0214), top: B:450:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04a8 A[Catch: Exception -> 0x0715, TryCatch #7 {Exception -> 0x0715, blocks: (B:84:0x0231, B:86:0x0239, B:88:0x023f, B:91:0x024b, B:94:0x0256, B:96:0x0279, B:98:0x027d, B:100:0x0283, B:102:0x0289, B:104:0x0296, B:105:0x029a, B:107:0x029d, B:109:0x02a7, B:114:0x02aa, B:116:0x02b0, B:118:0x02bc, B:120:0x02c6, B:123:0x02d9, B:124:0x02d4, B:127:0x02db, B:135:0x069b, B:211:0x02e3, B:230:0x02f2, B:232:0x0310, B:233:0x0314, B:235:0x031a, B:238:0x0322, B:240:0x032c, B:241:0x0330, B:243:0x0336, B:244:0x033a, B:246:0x034f, B:248:0x0359, B:250:0x0369, B:251:0x0371, B:253:0x0377, B:255:0x0381, B:257:0x0391, B:258:0x039a, B:260:0x03a0, B:262:0x03aa, B:264:0x03ba, B:265:0x03c3, B:267:0x03c9, B:269:0x03cf, B:271:0x03d9, B:273:0x03df, B:274:0x03e2, B:276:0x03e9, B:278:0x03f3, B:280:0x0401, B:281:0x0407, B:283:0x040d, B:285:0x0417, B:287:0x0427, B:288:0x0430, B:290:0x0436, B:292:0x0440, B:294:0x0450, B:295:0x0459, B:297:0x045f, B:299:0x0465, B:301:0x046f, B:303:0x0475, B:304:0x0478, B:305:0x047d, B:308:0x0484, B:310:0x048c, B:312:0x049b, B:315:0x04a2, B:317:0x04a8, B:319:0x04ae, B:320:0x04b1, B:322:0x04b6, B:324:0x04bc, B:325:0x04bf, B:327:0x04c5, B:329:0x04cf, B:330:0x04d5, B:333:0x04e3, B:335:0x04e9, B:336:0x04ec, B:338:0x04f2, B:340:0x04fc, B:342:0x0502, B:343:0x0505, B:344:0x0508, B:346:0x0512, B:348:0x0518, B:349:0x051b, B:350:0x051e, B:352:0x0528, B:354:0x052e, B:355:0x0531, B:356:0x0534, B:358:0x0542, B:360:0x0548, B:361:0x054b, B:365:0x0566, B:368:0x0579, B:370:0x057f, B:372:0x0587, B:374:0x05ae, B:376:0x05b9, B:378:0x05c1, B:380:0x05d5, B:383:0x05d8, B:385:0x05de, B:386:0x05e1, B:387:0x05ed, B:389:0x05f7, B:391:0x05fd, B:392:0x0600, B:393:0x0603, B:395:0x060d, B:397:0x0613, B:398:0x0616, B:400:0x061b, B:402:0x0625, B:404:0x062b, B:405:0x062e, B:406:0x0631, B:408:0x063b, B:410:0x0641, B:411:0x0644, B:412:0x0647, B:416:0x0657, B:417:0x058f, B:419:0x059b, B:421:0x05a1, B:451:0x0214), top: B:450:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x04cf A[Catch: Exception -> 0x0715, TryCatch #7 {Exception -> 0x0715, blocks: (B:84:0x0231, B:86:0x0239, B:88:0x023f, B:91:0x024b, B:94:0x0256, B:96:0x0279, B:98:0x027d, B:100:0x0283, B:102:0x0289, B:104:0x0296, B:105:0x029a, B:107:0x029d, B:109:0x02a7, B:114:0x02aa, B:116:0x02b0, B:118:0x02bc, B:120:0x02c6, B:123:0x02d9, B:124:0x02d4, B:127:0x02db, B:135:0x069b, B:211:0x02e3, B:230:0x02f2, B:232:0x0310, B:233:0x0314, B:235:0x031a, B:238:0x0322, B:240:0x032c, B:241:0x0330, B:243:0x0336, B:244:0x033a, B:246:0x034f, B:248:0x0359, B:250:0x0369, B:251:0x0371, B:253:0x0377, B:255:0x0381, B:257:0x0391, B:258:0x039a, B:260:0x03a0, B:262:0x03aa, B:264:0x03ba, B:265:0x03c3, B:267:0x03c9, B:269:0x03cf, B:271:0x03d9, B:273:0x03df, B:274:0x03e2, B:276:0x03e9, B:278:0x03f3, B:280:0x0401, B:281:0x0407, B:283:0x040d, B:285:0x0417, B:287:0x0427, B:288:0x0430, B:290:0x0436, B:292:0x0440, B:294:0x0450, B:295:0x0459, B:297:0x045f, B:299:0x0465, B:301:0x046f, B:303:0x0475, B:304:0x0478, B:305:0x047d, B:308:0x0484, B:310:0x048c, B:312:0x049b, B:315:0x04a2, B:317:0x04a8, B:319:0x04ae, B:320:0x04b1, B:322:0x04b6, B:324:0x04bc, B:325:0x04bf, B:327:0x04c5, B:329:0x04cf, B:330:0x04d5, B:333:0x04e3, B:335:0x04e9, B:336:0x04ec, B:338:0x04f2, B:340:0x04fc, B:342:0x0502, B:343:0x0505, B:344:0x0508, B:346:0x0512, B:348:0x0518, B:349:0x051b, B:350:0x051e, B:352:0x0528, B:354:0x052e, B:355:0x0531, B:356:0x0534, B:358:0x0542, B:360:0x0548, B:361:0x054b, B:365:0x0566, B:368:0x0579, B:370:0x057f, B:372:0x0587, B:374:0x05ae, B:376:0x05b9, B:378:0x05c1, B:380:0x05d5, B:383:0x05d8, B:385:0x05de, B:386:0x05e1, B:387:0x05ed, B:389:0x05f7, B:391:0x05fd, B:392:0x0600, B:393:0x0603, B:395:0x060d, B:397:0x0613, B:398:0x0616, B:400:0x061b, B:402:0x0625, B:404:0x062b, B:405:0x062e, B:406:0x0631, B:408:0x063b, B:410:0x0641, B:411:0x0644, B:412:0x0647, B:416:0x0657, B:417:0x058f, B:419:0x059b, B:421:0x05a1, B:451:0x0214), top: B:450:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x04e3 A[Catch: Exception -> 0x0715, TRY_ENTER, TryCatch #7 {Exception -> 0x0715, blocks: (B:84:0x0231, B:86:0x0239, B:88:0x023f, B:91:0x024b, B:94:0x0256, B:96:0x0279, B:98:0x027d, B:100:0x0283, B:102:0x0289, B:104:0x0296, B:105:0x029a, B:107:0x029d, B:109:0x02a7, B:114:0x02aa, B:116:0x02b0, B:118:0x02bc, B:120:0x02c6, B:123:0x02d9, B:124:0x02d4, B:127:0x02db, B:135:0x069b, B:211:0x02e3, B:230:0x02f2, B:232:0x0310, B:233:0x0314, B:235:0x031a, B:238:0x0322, B:240:0x032c, B:241:0x0330, B:243:0x0336, B:244:0x033a, B:246:0x034f, B:248:0x0359, B:250:0x0369, B:251:0x0371, B:253:0x0377, B:255:0x0381, B:257:0x0391, B:258:0x039a, B:260:0x03a0, B:262:0x03aa, B:264:0x03ba, B:265:0x03c3, B:267:0x03c9, B:269:0x03cf, B:271:0x03d9, B:273:0x03df, B:274:0x03e2, B:276:0x03e9, B:278:0x03f3, B:280:0x0401, B:281:0x0407, B:283:0x040d, B:285:0x0417, B:287:0x0427, B:288:0x0430, B:290:0x0436, B:292:0x0440, B:294:0x0450, B:295:0x0459, B:297:0x045f, B:299:0x0465, B:301:0x046f, B:303:0x0475, B:304:0x0478, B:305:0x047d, B:308:0x0484, B:310:0x048c, B:312:0x049b, B:315:0x04a2, B:317:0x04a8, B:319:0x04ae, B:320:0x04b1, B:322:0x04b6, B:324:0x04bc, B:325:0x04bf, B:327:0x04c5, B:329:0x04cf, B:330:0x04d5, B:333:0x04e3, B:335:0x04e9, B:336:0x04ec, B:338:0x04f2, B:340:0x04fc, B:342:0x0502, B:343:0x0505, B:344:0x0508, B:346:0x0512, B:348:0x0518, B:349:0x051b, B:350:0x051e, B:352:0x0528, B:354:0x052e, B:355:0x0531, B:356:0x0534, B:358:0x0542, B:360:0x0548, B:361:0x054b, B:365:0x0566, B:368:0x0579, B:370:0x057f, B:372:0x0587, B:374:0x05ae, B:376:0x05b9, B:378:0x05c1, B:380:0x05d5, B:383:0x05d8, B:385:0x05de, B:386:0x05e1, B:387:0x05ed, B:389:0x05f7, B:391:0x05fd, B:392:0x0600, B:393:0x0603, B:395:0x060d, B:397:0x0613, B:398:0x0616, B:400:0x061b, B:402:0x0625, B:404:0x062b, B:405:0x062e, B:406:0x0631, B:408:0x063b, B:410:0x0641, B:411:0x0644, B:412:0x0647, B:416:0x0657, B:417:0x058f, B:419:0x059b, B:421:0x05a1, B:451:0x0214), top: B:450:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x04f2 A[Catch: Exception -> 0x0715, TryCatch #7 {Exception -> 0x0715, blocks: (B:84:0x0231, B:86:0x0239, B:88:0x023f, B:91:0x024b, B:94:0x0256, B:96:0x0279, B:98:0x027d, B:100:0x0283, B:102:0x0289, B:104:0x0296, B:105:0x029a, B:107:0x029d, B:109:0x02a7, B:114:0x02aa, B:116:0x02b0, B:118:0x02bc, B:120:0x02c6, B:123:0x02d9, B:124:0x02d4, B:127:0x02db, B:135:0x069b, B:211:0x02e3, B:230:0x02f2, B:232:0x0310, B:233:0x0314, B:235:0x031a, B:238:0x0322, B:240:0x032c, B:241:0x0330, B:243:0x0336, B:244:0x033a, B:246:0x034f, B:248:0x0359, B:250:0x0369, B:251:0x0371, B:253:0x0377, B:255:0x0381, B:257:0x0391, B:258:0x039a, B:260:0x03a0, B:262:0x03aa, B:264:0x03ba, B:265:0x03c3, B:267:0x03c9, B:269:0x03cf, B:271:0x03d9, B:273:0x03df, B:274:0x03e2, B:276:0x03e9, B:278:0x03f3, B:280:0x0401, B:281:0x0407, B:283:0x040d, B:285:0x0417, B:287:0x0427, B:288:0x0430, B:290:0x0436, B:292:0x0440, B:294:0x0450, B:295:0x0459, B:297:0x045f, B:299:0x0465, B:301:0x046f, B:303:0x0475, B:304:0x0478, B:305:0x047d, B:308:0x0484, B:310:0x048c, B:312:0x049b, B:315:0x04a2, B:317:0x04a8, B:319:0x04ae, B:320:0x04b1, B:322:0x04b6, B:324:0x04bc, B:325:0x04bf, B:327:0x04c5, B:329:0x04cf, B:330:0x04d5, B:333:0x04e3, B:335:0x04e9, B:336:0x04ec, B:338:0x04f2, B:340:0x04fc, B:342:0x0502, B:343:0x0505, B:344:0x0508, B:346:0x0512, B:348:0x0518, B:349:0x051b, B:350:0x051e, B:352:0x0528, B:354:0x052e, B:355:0x0531, B:356:0x0534, B:358:0x0542, B:360:0x0548, B:361:0x054b, B:365:0x0566, B:368:0x0579, B:370:0x057f, B:372:0x0587, B:374:0x05ae, B:376:0x05b9, B:378:0x05c1, B:380:0x05d5, B:383:0x05d8, B:385:0x05de, B:386:0x05e1, B:387:0x05ed, B:389:0x05f7, B:391:0x05fd, B:392:0x0600, B:393:0x0603, B:395:0x060d, B:397:0x0613, B:398:0x0616, B:400:0x061b, B:402:0x0625, B:404:0x062b, B:405:0x062e, B:406:0x0631, B:408:0x063b, B:410:0x0641, B:411:0x0644, B:412:0x0647, B:416:0x0657, B:417:0x058f, B:419:0x059b, B:421:0x05a1, B:451:0x0214), top: B:450:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0528 A[Catch: Exception -> 0x0715, TryCatch #7 {Exception -> 0x0715, blocks: (B:84:0x0231, B:86:0x0239, B:88:0x023f, B:91:0x024b, B:94:0x0256, B:96:0x0279, B:98:0x027d, B:100:0x0283, B:102:0x0289, B:104:0x0296, B:105:0x029a, B:107:0x029d, B:109:0x02a7, B:114:0x02aa, B:116:0x02b0, B:118:0x02bc, B:120:0x02c6, B:123:0x02d9, B:124:0x02d4, B:127:0x02db, B:135:0x069b, B:211:0x02e3, B:230:0x02f2, B:232:0x0310, B:233:0x0314, B:235:0x031a, B:238:0x0322, B:240:0x032c, B:241:0x0330, B:243:0x0336, B:244:0x033a, B:246:0x034f, B:248:0x0359, B:250:0x0369, B:251:0x0371, B:253:0x0377, B:255:0x0381, B:257:0x0391, B:258:0x039a, B:260:0x03a0, B:262:0x03aa, B:264:0x03ba, B:265:0x03c3, B:267:0x03c9, B:269:0x03cf, B:271:0x03d9, B:273:0x03df, B:274:0x03e2, B:276:0x03e9, B:278:0x03f3, B:280:0x0401, B:281:0x0407, B:283:0x040d, B:285:0x0417, B:287:0x0427, B:288:0x0430, B:290:0x0436, B:292:0x0440, B:294:0x0450, B:295:0x0459, B:297:0x045f, B:299:0x0465, B:301:0x046f, B:303:0x0475, B:304:0x0478, B:305:0x047d, B:308:0x0484, B:310:0x048c, B:312:0x049b, B:315:0x04a2, B:317:0x04a8, B:319:0x04ae, B:320:0x04b1, B:322:0x04b6, B:324:0x04bc, B:325:0x04bf, B:327:0x04c5, B:329:0x04cf, B:330:0x04d5, B:333:0x04e3, B:335:0x04e9, B:336:0x04ec, B:338:0x04f2, B:340:0x04fc, B:342:0x0502, B:343:0x0505, B:344:0x0508, B:346:0x0512, B:348:0x0518, B:349:0x051b, B:350:0x051e, B:352:0x0528, B:354:0x052e, B:355:0x0531, B:356:0x0534, B:358:0x0542, B:360:0x0548, B:361:0x054b, B:365:0x0566, B:368:0x0579, B:370:0x057f, B:372:0x0587, B:374:0x05ae, B:376:0x05b9, B:378:0x05c1, B:380:0x05d5, B:383:0x05d8, B:385:0x05de, B:386:0x05e1, B:387:0x05ed, B:389:0x05f7, B:391:0x05fd, B:392:0x0600, B:393:0x0603, B:395:0x060d, B:397:0x0613, B:398:0x0616, B:400:0x061b, B:402:0x0625, B:404:0x062b, B:405:0x062e, B:406:0x0631, B:408:0x063b, B:410:0x0641, B:411:0x0644, B:412:0x0647, B:416:0x0657, B:417:0x058f, B:419:0x059b, B:421:0x05a1, B:451:0x0214), top: B:450:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0542 A[Catch: Exception -> 0x0715, TryCatch #7 {Exception -> 0x0715, blocks: (B:84:0x0231, B:86:0x0239, B:88:0x023f, B:91:0x024b, B:94:0x0256, B:96:0x0279, B:98:0x027d, B:100:0x0283, B:102:0x0289, B:104:0x0296, B:105:0x029a, B:107:0x029d, B:109:0x02a7, B:114:0x02aa, B:116:0x02b0, B:118:0x02bc, B:120:0x02c6, B:123:0x02d9, B:124:0x02d4, B:127:0x02db, B:135:0x069b, B:211:0x02e3, B:230:0x02f2, B:232:0x0310, B:233:0x0314, B:235:0x031a, B:238:0x0322, B:240:0x032c, B:241:0x0330, B:243:0x0336, B:244:0x033a, B:246:0x034f, B:248:0x0359, B:250:0x0369, B:251:0x0371, B:253:0x0377, B:255:0x0381, B:257:0x0391, B:258:0x039a, B:260:0x03a0, B:262:0x03aa, B:264:0x03ba, B:265:0x03c3, B:267:0x03c9, B:269:0x03cf, B:271:0x03d9, B:273:0x03df, B:274:0x03e2, B:276:0x03e9, B:278:0x03f3, B:280:0x0401, B:281:0x0407, B:283:0x040d, B:285:0x0417, B:287:0x0427, B:288:0x0430, B:290:0x0436, B:292:0x0440, B:294:0x0450, B:295:0x0459, B:297:0x045f, B:299:0x0465, B:301:0x046f, B:303:0x0475, B:304:0x0478, B:305:0x047d, B:308:0x0484, B:310:0x048c, B:312:0x049b, B:315:0x04a2, B:317:0x04a8, B:319:0x04ae, B:320:0x04b1, B:322:0x04b6, B:324:0x04bc, B:325:0x04bf, B:327:0x04c5, B:329:0x04cf, B:330:0x04d5, B:333:0x04e3, B:335:0x04e9, B:336:0x04ec, B:338:0x04f2, B:340:0x04fc, B:342:0x0502, B:343:0x0505, B:344:0x0508, B:346:0x0512, B:348:0x0518, B:349:0x051b, B:350:0x051e, B:352:0x0528, B:354:0x052e, B:355:0x0531, B:356:0x0534, B:358:0x0542, B:360:0x0548, B:361:0x054b, B:365:0x0566, B:368:0x0579, B:370:0x057f, B:372:0x0587, B:374:0x05ae, B:376:0x05b9, B:378:0x05c1, B:380:0x05d5, B:383:0x05d8, B:385:0x05de, B:386:0x05e1, B:387:0x05ed, B:389:0x05f7, B:391:0x05fd, B:392:0x0600, B:393:0x0603, B:395:0x060d, B:397:0x0613, B:398:0x0616, B:400:0x061b, B:402:0x0625, B:404:0x062b, B:405:0x062e, B:406:0x0631, B:408:0x063b, B:410:0x0641, B:411:0x0644, B:412:0x0647, B:416:0x0657, B:417:0x058f, B:419:0x059b, B:421:0x05a1, B:451:0x0214), top: B:450:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x05b9 A[Catch: Exception -> 0x0715, TryCatch #7 {Exception -> 0x0715, blocks: (B:84:0x0231, B:86:0x0239, B:88:0x023f, B:91:0x024b, B:94:0x0256, B:96:0x0279, B:98:0x027d, B:100:0x0283, B:102:0x0289, B:104:0x0296, B:105:0x029a, B:107:0x029d, B:109:0x02a7, B:114:0x02aa, B:116:0x02b0, B:118:0x02bc, B:120:0x02c6, B:123:0x02d9, B:124:0x02d4, B:127:0x02db, B:135:0x069b, B:211:0x02e3, B:230:0x02f2, B:232:0x0310, B:233:0x0314, B:235:0x031a, B:238:0x0322, B:240:0x032c, B:241:0x0330, B:243:0x0336, B:244:0x033a, B:246:0x034f, B:248:0x0359, B:250:0x0369, B:251:0x0371, B:253:0x0377, B:255:0x0381, B:257:0x0391, B:258:0x039a, B:260:0x03a0, B:262:0x03aa, B:264:0x03ba, B:265:0x03c3, B:267:0x03c9, B:269:0x03cf, B:271:0x03d9, B:273:0x03df, B:274:0x03e2, B:276:0x03e9, B:278:0x03f3, B:280:0x0401, B:281:0x0407, B:283:0x040d, B:285:0x0417, B:287:0x0427, B:288:0x0430, B:290:0x0436, B:292:0x0440, B:294:0x0450, B:295:0x0459, B:297:0x045f, B:299:0x0465, B:301:0x046f, B:303:0x0475, B:304:0x0478, B:305:0x047d, B:308:0x0484, B:310:0x048c, B:312:0x049b, B:315:0x04a2, B:317:0x04a8, B:319:0x04ae, B:320:0x04b1, B:322:0x04b6, B:324:0x04bc, B:325:0x04bf, B:327:0x04c5, B:329:0x04cf, B:330:0x04d5, B:333:0x04e3, B:335:0x04e9, B:336:0x04ec, B:338:0x04f2, B:340:0x04fc, B:342:0x0502, B:343:0x0505, B:344:0x0508, B:346:0x0512, B:348:0x0518, B:349:0x051b, B:350:0x051e, B:352:0x0528, B:354:0x052e, B:355:0x0531, B:356:0x0534, B:358:0x0542, B:360:0x0548, B:361:0x054b, B:365:0x0566, B:368:0x0579, B:370:0x057f, B:372:0x0587, B:374:0x05ae, B:376:0x05b9, B:378:0x05c1, B:380:0x05d5, B:383:0x05d8, B:385:0x05de, B:386:0x05e1, B:387:0x05ed, B:389:0x05f7, B:391:0x05fd, B:392:0x0600, B:393:0x0603, B:395:0x060d, B:397:0x0613, B:398:0x0616, B:400:0x061b, B:402:0x0625, B:404:0x062b, B:405:0x062e, B:406:0x0631, B:408:0x063b, B:410:0x0641, B:411:0x0644, B:412:0x0647, B:416:0x0657, B:417:0x058f, B:419:0x059b, B:421:0x05a1, B:451:0x0214), top: B:450:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x05de A[Catch: Exception -> 0x0715, TryCatch #7 {Exception -> 0x0715, blocks: (B:84:0x0231, B:86:0x0239, B:88:0x023f, B:91:0x024b, B:94:0x0256, B:96:0x0279, B:98:0x027d, B:100:0x0283, B:102:0x0289, B:104:0x0296, B:105:0x029a, B:107:0x029d, B:109:0x02a7, B:114:0x02aa, B:116:0x02b0, B:118:0x02bc, B:120:0x02c6, B:123:0x02d9, B:124:0x02d4, B:127:0x02db, B:135:0x069b, B:211:0x02e3, B:230:0x02f2, B:232:0x0310, B:233:0x0314, B:235:0x031a, B:238:0x0322, B:240:0x032c, B:241:0x0330, B:243:0x0336, B:244:0x033a, B:246:0x034f, B:248:0x0359, B:250:0x0369, B:251:0x0371, B:253:0x0377, B:255:0x0381, B:257:0x0391, B:258:0x039a, B:260:0x03a0, B:262:0x03aa, B:264:0x03ba, B:265:0x03c3, B:267:0x03c9, B:269:0x03cf, B:271:0x03d9, B:273:0x03df, B:274:0x03e2, B:276:0x03e9, B:278:0x03f3, B:280:0x0401, B:281:0x0407, B:283:0x040d, B:285:0x0417, B:287:0x0427, B:288:0x0430, B:290:0x0436, B:292:0x0440, B:294:0x0450, B:295:0x0459, B:297:0x045f, B:299:0x0465, B:301:0x046f, B:303:0x0475, B:304:0x0478, B:305:0x047d, B:308:0x0484, B:310:0x048c, B:312:0x049b, B:315:0x04a2, B:317:0x04a8, B:319:0x04ae, B:320:0x04b1, B:322:0x04b6, B:324:0x04bc, B:325:0x04bf, B:327:0x04c5, B:329:0x04cf, B:330:0x04d5, B:333:0x04e3, B:335:0x04e9, B:336:0x04ec, B:338:0x04f2, B:340:0x04fc, B:342:0x0502, B:343:0x0505, B:344:0x0508, B:346:0x0512, B:348:0x0518, B:349:0x051b, B:350:0x051e, B:352:0x0528, B:354:0x052e, B:355:0x0531, B:356:0x0534, B:358:0x0542, B:360:0x0548, B:361:0x054b, B:365:0x0566, B:368:0x0579, B:370:0x057f, B:372:0x0587, B:374:0x05ae, B:376:0x05b9, B:378:0x05c1, B:380:0x05d5, B:383:0x05d8, B:385:0x05de, B:386:0x05e1, B:387:0x05ed, B:389:0x05f7, B:391:0x05fd, B:392:0x0600, B:393:0x0603, B:395:0x060d, B:397:0x0613, B:398:0x0616, B:400:0x061b, B:402:0x0625, B:404:0x062b, B:405:0x062e, B:406:0x0631, B:408:0x063b, B:410:0x0641, B:411:0x0644, B:412:0x0647, B:416:0x0657, B:417:0x058f, B:419:0x059b, B:421:0x05a1, B:451:0x0214), top: B:450:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x05f7 A[Catch: Exception -> 0x0715, TryCatch #7 {Exception -> 0x0715, blocks: (B:84:0x0231, B:86:0x0239, B:88:0x023f, B:91:0x024b, B:94:0x0256, B:96:0x0279, B:98:0x027d, B:100:0x0283, B:102:0x0289, B:104:0x0296, B:105:0x029a, B:107:0x029d, B:109:0x02a7, B:114:0x02aa, B:116:0x02b0, B:118:0x02bc, B:120:0x02c6, B:123:0x02d9, B:124:0x02d4, B:127:0x02db, B:135:0x069b, B:211:0x02e3, B:230:0x02f2, B:232:0x0310, B:233:0x0314, B:235:0x031a, B:238:0x0322, B:240:0x032c, B:241:0x0330, B:243:0x0336, B:244:0x033a, B:246:0x034f, B:248:0x0359, B:250:0x0369, B:251:0x0371, B:253:0x0377, B:255:0x0381, B:257:0x0391, B:258:0x039a, B:260:0x03a0, B:262:0x03aa, B:264:0x03ba, B:265:0x03c3, B:267:0x03c9, B:269:0x03cf, B:271:0x03d9, B:273:0x03df, B:274:0x03e2, B:276:0x03e9, B:278:0x03f3, B:280:0x0401, B:281:0x0407, B:283:0x040d, B:285:0x0417, B:287:0x0427, B:288:0x0430, B:290:0x0436, B:292:0x0440, B:294:0x0450, B:295:0x0459, B:297:0x045f, B:299:0x0465, B:301:0x046f, B:303:0x0475, B:304:0x0478, B:305:0x047d, B:308:0x0484, B:310:0x048c, B:312:0x049b, B:315:0x04a2, B:317:0x04a8, B:319:0x04ae, B:320:0x04b1, B:322:0x04b6, B:324:0x04bc, B:325:0x04bf, B:327:0x04c5, B:329:0x04cf, B:330:0x04d5, B:333:0x04e3, B:335:0x04e9, B:336:0x04ec, B:338:0x04f2, B:340:0x04fc, B:342:0x0502, B:343:0x0505, B:344:0x0508, B:346:0x0512, B:348:0x0518, B:349:0x051b, B:350:0x051e, B:352:0x0528, B:354:0x052e, B:355:0x0531, B:356:0x0534, B:358:0x0542, B:360:0x0548, B:361:0x054b, B:365:0x0566, B:368:0x0579, B:370:0x057f, B:372:0x0587, B:374:0x05ae, B:376:0x05b9, B:378:0x05c1, B:380:0x05d5, B:383:0x05d8, B:385:0x05de, B:386:0x05e1, B:387:0x05ed, B:389:0x05f7, B:391:0x05fd, B:392:0x0600, B:393:0x0603, B:395:0x060d, B:397:0x0613, B:398:0x0616, B:400:0x061b, B:402:0x0625, B:404:0x062b, B:405:0x062e, B:406:0x0631, B:408:0x063b, B:410:0x0641, B:411:0x0644, B:412:0x0647, B:416:0x0657, B:417:0x058f, B:419:0x059b, B:421:0x05a1, B:451:0x0214), top: B:450:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x060d A[Catch: Exception -> 0x0715, TryCatch #7 {Exception -> 0x0715, blocks: (B:84:0x0231, B:86:0x0239, B:88:0x023f, B:91:0x024b, B:94:0x0256, B:96:0x0279, B:98:0x027d, B:100:0x0283, B:102:0x0289, B:104:0x0296, B:105:0x029a, B:107:0x029d, B:109:0x02a7, B:114:0x02aa, B:116:0x02b0, B:118:0x02bc, B:120:0x02c6, B:123:0x02d9, B:124:0x02d4, B:127:0x02db, B:135:0x069b, B:211:0x02e3, B:230:0x02f2, B:232:0x0310, B:233:0x0314, B:235:0x031a, B:238:0x0322, B:240:0x032c, B:241:0x0330, B:243:0x0336, B:244:0x033a, B:246:0x034f, B:248:0x0359, B:250:0x0369, B:251:0x0371, B:253:0x0377, B:255:0x0381, B:257:0x0391, B:258:0x039a, B:260:0x03a0, B:262:0x03aa, B:264:0x03ba, B:265:0x03c3, B:267:0x03c9, B:269:0x03cf, B:271:0x03d9, B:273:0x03df, B:274:0x03e2, B:276:0x03e9, B:278:0x03f3, B:280:0x0401, B:281:0x0407, B:283:0x040d, B:285:0x0417, B:287:0x0427, B:288:0x0430, B:290:0x0436, B:292:0x0440, B:294:0x0450, B:295:0x0459, B:297:0x045f, B:299:0x0465, B:301:0x046f, B:303:0x0475, B:304:0x0478, B:305:0x047d, B:308:0x0484, B:310:0x048c, B:312:0x049b, B:315:0x04a2, B:317:0x04a8, B:319:0x04ae, B:320:0x04b1, B:322:0x04b6, B:324:0x04bc, B:325:0x04bf, B:327:0x04c5, B:329:0x04cf, B:330:0x04d5, B:333:0x04e3, B:335:0x04e9, B:336:0x04ec, B:338:0x04f2, B:340:0x04fc, B:342:0x0502, B:343:0x0505, B:344:0x0508, B:346:0x0512, B:348:0x0518, B:349:0x051b, B:350:0x051e, B:352:0x0528, B:354:0x052e, B:355:0x0531, B:356:0x0534, B:358:0x0542, B:360:0x0548, B:361:0x054b, B:365:0x0566, B:368:0x0579, B:370:0x057f, B:372:0x0587, B:374:0x05ae, B:376:0x05b9, B:378:0x05c1, B:380:0x05d5, B:383:0x05d8, B:385:0x05de, B:386:0x05e1, B:387:0x05ed, B:389:0x05f7, B:391:0x05fd, B:392:0x0600, B:393:0x0603, B:395:0x060d, B:397:0x0613, B:398:0x0616, B:400:0x061b, B:402:0x0625, B:404:0x062b, B:405:0x062e, B:406:0x0631, B:408:0x063b, B:410:0x0641, B:411:0x0644, B:412:0x0647, B:416:0x0657, B:417:0x058f, B:419:0x059b, B:421:0x05a1, B:451:0x0214), top: B:450:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x061b A[Catch: Exception -> 0x0715, TryCatch #7 {Exception -> 0x0715, blocks: (B:84:0x0231, B:86:0x0239, B:88:0x023f, B:91:0x024b, B:94:0x0256, B:96:0x0279, B:98:0x027d, B:100:0x0283, B:102:0x0289, B:104:0x0296, B:105:0x029a, B:107:0x029d, B:109:0x02a7, B:114:0x02aa, B:116:0x02b0, B:118:0x02bc, B:120:0x02c6, B:123:0x02d9, B:124:0x02d4, B:127:0x02db, B:135:0x069b, B:211:0x02e3, B:230:0x02f2, B:232:0x0310, B:233:0x0314, B:235:0x031a, B:238:0x0322, B:240:0x032c, B:241:0x0330, B:243:0x0336, B:244:0x033a, B:246:0x034f, B:248:0x0359, B:250:0x0369, B:251:0x0371, B:253:0x0377, B:255:0x0381, B:257:0x0391, B:258:0x039a, B:260:0x03a0, B:262:0x03aa, B:264:0x03ba, B:265:0x03c3, B:267:0x03c9, B:269:0x03cf, B:271:0x03d9, B:273:0x03df, B:274:0x03e2, B:276:0x03e9, B:278:0x03f3, B:280:0x0401, B:281:0x0407, B:283:0x040d, B:285:0x0417, B:287:0x0427, B:288:0x0430, B:290:0x0436, B:292:0x0440, B:294:0x0450, B:295:0x0459, B:297:0x045f, B:299:0x0465, B:301:0x046f, B:303:0x0475, B:304:0x0478, B:305:0x047d, B:308:0x0484, B:310:0x048c, B:312:0x049b, B:315:0x04a2, B:317:0x04a8, B:319:0x04ae, B:320:0x04b1, B:322:0x04b6, B:324:0x04bc, B:325:0x04bf, B:327:0x04c5, B:329:0x04cf, B:330:0x04d5, B:333:0x04e3, B:335:0x04e9, B:336:0x04ec, B:338:0x04f2, B:340:0x04fc, B:342:0x0502, B:343:0x0505, B:344:0x0508, B:346:0x0512, B:348:0x0518, B:349:0x051b, B:350:0x051e, B:352:0x0528, B:354:0x052e, B:355:0x0531, B:356:0x0534, B:358:0x0542, B:360:0x0548, B:361:0x054b, B:365:0x0566, B:368:0x0579, B:370:0x057f, B:372:0x0587, B:374:0x05ae, B:376:0x05b9, B:378:0x05c1, B:380:0x05d5, B:383:0x05d8, B:385:0x05de, B:386:0x05e1, B:387:0x05ed, B:389:0x05f7, B:391:0x05fd, B:392:0x0600, B:393:0x0603, B:395:0x060d, B:397:0x0613, B:398:0x0616, B:400:0x061b, B:402:0x0625, B:404:0x062b, B:405:0x062e, B:406:0x0631, B:408:0x063b, B:410:0x0641, B:411:0x0644, B:412:0x0647, B:416:0x0657, B:417:0x058f, B:419:0x059b, B:421:0x05a1, B:451:0x0214), top: B:450:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0657 A[Catch: Exception -> 0x0715, TRY_LEAVE, TryCatch #7 {Exception -> 0x0715, blocks: (B:84:0x0231, B:86:0x0239, B:88:0x023f, B:91:0x024b, B:94:0x0256, B:96:0x0279, B:98:0x027d, B:100:0x0283, B:102:0x0289, B:104:0x0296, B:105:0x029a, B:107:0x029d, B:109:0x02a7, B:114:0x02aa, B:116:0x02b0, B:118:0x02bc, B:120:0x02c6, B:123:0x02d9, B:124:0x02d4, B:127:0x02db, B:135:0x069b, B:211:0x02e3, B:230:0x02f2, B:232:0x0310, B:233:0x0314, B:235:0x031a, B:238:0x0322, B:240:0x032c, B:241:0x0330, B:243:0x0336, B:244:0x033a, B:246:0x034f, B:248:0x0359, B:250:0x0369, B:251:0x0371, B:253:0x0377, B:255:0x0381, B:257:0x0391, B:258:0x039a, B:260:0x03a0, B:262:0x03aa, B:264:0x03ba, B:265:0x03c3, B:267:0x03c9, B:269:0x03cf, B:271:0x03d9, B:273:0x03df, B:274:0x03e2, B:276:0x03e9, B:278:0x03f3, B:280:0x0401, B:281:0x0407, B:283:0x040d, B:285:0x0417, B:287:0x0427, B:288:0x0430, B:290:0x0436, B:292:0x0440, B:294:0x0450, B:295:0x0459, B:297:0x045f, B:299:0x0465, B:301:0x046f, B:303:0x0475, B:304:0x0478, B:305:0x047d, B:308:0x0484, B:310:0x048c, B:312:0x049b, B:315:0x04a2, B:317:0x04a8, B:319:0x04ae, B:320:0x04b1, B:322:0x04b6, B:324:0x04bc, B:325:0x04bf, B:327:0x04c5, B:329:0x04cf, B:330:0x04d5, B:333:0x04e3, B:335:0x04e9, B:336:0x04ec, B:338:0x04f2, B:340:0x04fc, B:342:0x0502, B:343:0x0505, B:344:0x0508, B:346:0x0512, B:348:0x0518, B:349:0x051b, B:350:0x051e, B:352:0x0528, B:354:0x052e, B:355:0x0531, B:356:0x0534, B:358:0x0542, B:360:0x0548, B:361:0x054b, B:365:0x0566, B:368:0x0579, B:370:0x057f, B:372:0x0587, B:374:0x05ae, B:376:0x05b9, B:378:0x05c1, B:380:0x05d5, B:383:0x05d8, B:385:0x05de, B:386:0x05e1, B:387:0x05ed, B:389:0x05f7, B:391:0x05fd, B:392:0x0600, B:393:0x0603, B:395:0x060d, B:397:0x0613, B:398:0x0616, B:400:0x061b, B:402:0x0625, B:404:0x062b, B:405:0x062e, B:406:0x0631, B:408:0x063b, B:410:0x0641, B:411:0x0644, B:412:0x0647, B:416:0x0657, B:417:0x058f, B:419:0x059b, B:421:0x05a1, B:451:0x0214), top: B:450:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x04c4  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Location location;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue3;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue4;
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
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue5;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue6;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue7;
        String M0;
        Locale locale;
        String str10;
        String str11;
        Address address;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        boolean z;
        String subThoroughfare;
        boolean z2;
        String thoroughfare;
        String locality;
        String countryName;
        boolean z3;
        String str18;
        StringBuilder sb;
        StringBuilder sb2;
        String countryName2;
        String locality2;
        String sb3;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        NativeByteBuffer byteBufferValue;
        SQLitePreparedStatement sQLitePreparedStatement;
        TLRPC.MessageMedia messageMedia;
        boolean z4 = true;
        switch (this.a) {
            case 0:
                Locale locale2 = (Locale) this.c;
                Location location2 = (Location) this.e;
                byte b = this.b;
                Locale locale3 = (Locale) this.d;
                qc6 qc6Var = (qc6) this.f;
                StringBuilder sb4 = new StringBuilder();
                TL_stories.TL_geoPointAddress tL_geoPointAddress = new TL_stories.TL_geoPointAddress();
                TL_stories.TL_geoPointAddress tL_geoPointAddress2 = new TL_stories.TL_geoPointAddress();
                try {
                    List<Address> fromLocation = new Geocoder(a.b, locale2).getFromLocation(location2.getLatitude(), location2.getLongitude(), 1);
                    if (b != 2) {
                        list = null;
                    } else if (locale3 == locale2) {
                        list = fromLocation;
                    } else {
                        try {
                            list = new Geocoder(a.b, locale3).getFromLocation(location2.getLatitude(), location2.getLongitude(), 1);
                        } catch (Exception unused) {
                            location = location2;
                            tL_messageMediaVenue = null;
                            tL_messageMediaVenue2 = null;
                            str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                            str = str2;
                            tL_messageMediaVenue4 = tL_messageMediaVenue;
                            tL_messageMediaVenue3 = tL_messageMediaVenue2;
                            gm.c3(new e77((Object) qc6Var, str2, (Object) str, (Object) tL_messageMediaVenue4, (Object) tL_messageMediaVenue3, (Object) location, (byte) 15));
                            return;
                        }
                    }
                    if (fromLocation.size() > 0) {
                        Address address2 = fromLocation.get(0);
                        Address address3 = (list == null || list.size() < 1) ? null : list.get(0);
                        if (b == 1) {
                            ArrayList arrayList = new ArrayList();
                            try {
                                str23 = address2.getAddressLine(0);
                            } catch (Exception unused2) {
                                str23 = null;
                            }
                            if (TextUtils.isEmpty(str23)) {
                                try {
                                    arrayList.add(address2.getSubThoroughfare());
                                } catch (Exception unused3) {
                                }
                                try {
                                    arrayList.add(address2.getThoroughfare());
                                } catch (Exception unused4) {
                                }
                                try {
                                    arrayList.add(address2.getAdminArea());
                                } catch (Exception unused5) {
                                }
                                try {
                                    arrayList.add(address2.getCountryName());
                                } catch (Exception unused6) {
                                }
                            } else {
                                arrayList.add(str23);
                            }
                            int i = 0;
                            while (i < arrayList.size()) {
                                if (arrayList.get(i) != null) {
                                    String[] split = ((String) arrayList.get(i)).split(", ");
                                    if (split.length > 1) {
                                        arrayList.remove(i);
                                        for (String str24 : split) {
                                            arrayList.add(i, str24);
                                            i++;
                                        }
                                    }
                                }
                                i++;
                            }
                            int i2 = 0;
                            while (i2 < arrayList.size()) {
                                if (TextUtils.isEmpty((CharSequence) arrayList.get(i2)) || arrayList.indexOf(arrayList.get(i2)) != i2 || ((String) arrayList.get(i2)).matches("^\\s*\\d{4,}\\s*$")) {
                                    arrayList.remove(i2);
                                    i2--;
                                }
                                i2++;
                            }
                            format = arrayList.isEmpty() ? null : TextUtils.join(", ", arrayList);
                            str3 = format;
                            sb3 = null;
                            str5 = null;
                            str18 = null;
                            str11 = null;
                            str17 = null;
                        } else {
                            StringBuilder sb5 = new StringBuilder();
                            StringBuilder sb6 = new StringBuilder();
                            StringBuilder sb7 = new StringBuilder();
                            StringBuilder sb8 = new StringBuilder();
                            String locality3 = address2.getLocality();
                            if (TextUtils.isEmpty(locality3)) {
                                locality3 = address2.getAdminArea();
                            }
                            if (TextUtils.isEmpty(locality3)) {
                                locality3 = address2.getSubAdminArea();
                            }
                            String str25 = locality3;
                            if (address3 != null) {
                                String locality4 = address3.getLocality();
                                if (TextUtils.isEmpty(locality4)) {
                                    locality4 = address3.getAdminArea();
                                }
                                if (TextUtils.isEmpty(locality4)) {
                                    locality4 = address3.getSubAdminArea();
                                }
                                String str26 = locality4;
                                locale = locale2;
                                str10 = address3.getAdminArea();
                                str11 = str26;
                            } else {
                                locale = locale2;
                                str10 = null;
                                str11 = null;
                            }
                            if (TextUtils.equals(address2.getThoroughfare(), str25)) {
                                address = address3;
                            } else {
                                address = address3;
                                if (!TextUtils.equals(address2.getThoroughfare(), address2.getCountryName())) {
                                    str12 = address2.getThoroughfare();
                                    if (TextUtils.isEmpty(str12) || TextUtils.equals(address2.getSubLocality(), str25)) {
                                        str13 = str12;
                                    } else {
                                        str13 = str12;
                                        if (!TextUtils.equals(address2.getSubLocality(), address2.getCountryName())) {
                                            str14 = address2.getSubLocality();
                                            if (TextUtils.isEmpty(str14) || TextUtils.equals(address2.getLocality(), str25)) {
                                                str15 = str14;
                                            } else {
                                                str15 = str14;
                                                if (!TextUtils.equals(address2.getLocality(), address2.getCountryName())) {
                                                    str16 = address2.getLocality();
                                                    if (!TextUtils.isEmpty(str16) || TextUtils.equals(str16, str25) || TextUtils.equals(str16, address2.getCountryName())) {
                                                        sb8 = null;
                                                    } else {
                                                        if (sb8.length() > 0) {
                                                            sb8.append(", ");
                                                        }
                                                        sb8.append(str16);
                                                    }
                                                    if (address != null) {
                                                        String thoroughfare2 = (TextUtils.equals(address.getThoroughfare(), str25) || TextUtils.equals(address.getThoroughfare(), address.getCountryName())) ? null : address.getThoroughfare();
                                                        if (!TextUtils.isEmpty(thoroughfare2) || TextUtils.equals(address.getSubLocality(), str25)) {
                                                            str19 = thoroughfare2;
                                                        } else {
                                                            str19 = thoroughfare2;
                                                            if (!TextUtils.equals(address.getSubLocality(), address.getCountryName())) {
                                                                str20 = address.getSubLocality();
                                                                if (TextUtils.isEmpty(str20) || TextUtils.equals(address.getLocality(), str25)) {
                                                                    str21 = str20;
                                                                } else {
                                                                    str21 = str20;
                                                                    if (!TextUtils.equals(address.getLocality(), address.getCountryName())) {
                                                                        str22 = address.getLocality();
                                                                        if (!TextUtils.isEmpty(str22) || TextUtils.equals(str22, str10) || TextUtils.equals(str22, address.getCountryName())) {
                                                                            sb4 = null;
                                                                        } else {
                                                                            if (sb4.length() > 0) {
                                                                                sb4.append(", ");
                                                                            }
                                                                            sb4.append(str22);
                                                                        }
                                                                        if (!TextUtils.isEmpty(sb4)) {
                                                                            int i3 = 0;
                                                                            while (true) {
                                                                                String[] strArr = dd6.Q;
                                                                                str17 = str10;
                                                                                if (i3 < 19) {
                                                                                    if (strArr[i3].equalsIgnoreCase(sb4.toString())) {
                                                                                        sb8 = null;
                                                                                        sb4 = null;
                                                                                    } else {
                                                                                        i3++;
                                                                                        str10 = str17;
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (TextUtils.isEmpty(str25)) {
                                                                                z = true;
                                                                            } else {
                                                                                if (sb7.length() > 0) {
                                                                                    sb7.append(", ");
                                                                                }
                                                                                sb7.append(str25);
                                                                                if (sb8 != null) {
                                                                                    if (sb8.length() > 0) {
                                                                                        sb8.append(", ");
                                                                                    }
                                                                                    sb8.append(str25);
                                                                                }
                                                                                z = false;
                                                                            }
                                                                            subThoroughfare = address2.getSubThoroughfare();
                                                                            if (TextUtils.isEmpty(subThoroughfare)) {
                                                                                z2 = false;
                                                                            } else {
                                                                                sb5.append(subThoroughfare);
                                                                                z2 = true;
                                                                            }
                                                                            thoroughfare = address2.getThoroughfare();
                                                                            boolean z5 = z;
                                                                            if (!TextUtils.isEmpty(thoroughfare)) {
                                                                                if (sb5.length() > 0) {
                                                                                    sb5.append(" ");
                                                                                }
                                                                                sb5.append(thoroughfare);
                                                                                z2 = true;
                                                                            }
                                                                            if (!z2) {
                                                                                String adminArea = address2.getAdminArea();
                                                                                if (!TextUtils.isEmpty(adminArea)) {
                                                                                    if (sb5.length() > 0) {
                                                                                        sb5.append(", ");
                                                                                    }
                                                                                    sb5.append(adminArea);
                                                                                }
                                                                                String subAdminArea = address2.getSubAdminArea();
                                                                                if (!TextUtils.isEmpty(subAdminArea)) {
                                                                                    if (sb5.length() > 0) {
                                                                                        sb5.append(", ");
                                                                                    }
                                                                                    sb5.append(subAdminArea);
                                                                                }
                                                                            }
                                                                            locality = address2.getLocality();
                                                                            if (!TextUtils.isEmpty(locality)) {
                                                                                if (sb5.length() > 0) {
                                                                                    sb5.append(", ");
                                                                                }
                                                                                sb5.append(locality);
                                                                            }
                                                                            String countryCode = address2.getCountryCode();
                                                                            countryName = address2.getCountryName();
                                                                            if (TextUtils.isEmpty(countryName)) {
                                                                                z3 = z2;
                                                                                str18 = countryCode;
                                                                                sb = sb8;
                                                                                sb2 = sb5;
                                                                            } else {
                                                                                if (sb5.length() > 0) {
                                                                                    sb5.append(", ");
                                                                                }
                                                                                sb5.append(countryName);
                                                                                z3 = z2;
                                                                                String language = locale.getLanguage();
                                                                                str18 = countryCode;
                                                                                if ("US".equals(address2.getCountryCode())) {
                                                                                    sb = sb8;
                                                                                    sb2 = sb5;
                                                                                } else {
                                                                                    sb = sb8;
                                                                                    sb2 = sb5;
                                                                                    if ("AE".equals(address2.getCountryCode())) {
                                                                                    }
                                                                                    if (!"GB".equals(address2.getCountryCode()) || !"en".equals(language)) {
                                                                                        if ("US".equals(address2.getCountryCode())) {
                                                                                            countryName = "USA";
                                                                                        }
                                                                                        if (sb7.length() > 0) {
                                                                                            sb7.append(", ");
                                                                                        }
                                                                                        sb7.append(countryName);
                                                                                    }
                                                                                    String[] split2 = countryName.split(" ");
                                                                                    countryName = "";
                                                                                    for (String str27 : split2) {
                                                                                        if (str27.length() > 0) {
                                                                                            countryName = countryName + str27.charAt(0);
                                                                                        }
                                                                                    }
                                                                                    if (sb7.length() > 0) {
                                                                                    }
                                                                                    sb7.append(countryName);
                                                                                }
                                                                                if (!"en".equals(language)) {
                                                                                    if (!"uk".equals(language)) {
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                String[] split22 = countryName.split(" ");
                                                                                countryName = "";
                                                                                while (r2 < r3) {
                                                                                }
                                                                                if (sb7.length() > 0) {
                                                                                }
                                                                                sb7.append(countryName);
                                                                            }
                                                                            countryName2 = address2.getCountryName();
                                                                            if (!TextUtils.isEmpty(countryName2)) {
                                                                                if (sb6.length() > 0) {
                                                                                    sb6.append(", ");
                                                                                }
                                                                                sb6.append(countryName2);
                                                                            }
                                                                            locality2 = address2.getLocality();
                                                                            if (!TextUtils.isEmpty(locality2)) {
                                                                                if (sb6.length() > 0) {
                                                                                    sb6.append(", ");
                                                                                }
                                                                                sb6.append(locality2);
                                                                            }
                                                                            if (!z3) {
                                                                                String adminArea2 = address2.getAdminArea();
                                                                                if (!TextUtils.isEmpty(adminArea2)) {
                                                                                    if (sb6.length() > 0) {
                                                                                        sb6.append(", ");
                                                                                    }
                                                                                    sb6.append(adminArea2);
                                                                                }
                                                                                String subAdminArea2 = address2.getSubAdminArea();
                                                                                if (!TextUtils.isEmpty(subAdminArea2)) {
                                                                                    if (sb6.length() > 0) {
                                                                                        sb6.append(", ");
                                                                                    }
                                                                                    sb6.append(subAdminArea2);
                                                                                }
                                                                            }
                                                                            format = sb2.toString();
                                                                            str3 = sb6.toString();
                                                                            sb3 = sb7.toString();
                                                                            str5 = sb == null ? null : sb.toString();
                                                                            z4 = z5;
                                                                        }
                                                                    }
                                                                }
                                                                str22 = str21;
                                                                if (TextUtils.isEmpty(str22)) {
                                                                }
                                                                sb4 = null;
                                                                if (!TextUtils.isEmpty(sb4)) {
                                                                }
                                                            }
                                                        }
                                                        str20 = str19;
                                                        if (TextUtils.isEmpty(str20)) {
                                                        }
                                                        str21 = str20;
                                                        str22 = str21;
                                                        if (TextUtils.isEmpty(str22)) {
                                                        }
                                                        sb4 = null;
                                                        if (!TextUtils.isEmpty(sb4)) {
                                                        }
                                                    }
                                                    str17 = str10;
                                                    if (TextUtils.isEmpty(str25)) {
                                                    }
                                                    subThoroughfare = address2.getSubThoroughfare();
                                                    if (TextUtils.isEmpty(subThoroughfare)) {
                                                    }
                                                    thoroughfare = address2.getThoroughfare();
                                                    boolean z52 = z;
                                                    if (!TextUtils.isEmpty(thoroughfare)) {
                                                    }
                                                    if (!z2) {
                                                    }
                                                    locality = address2.getLocality();
                                                    if (!TextUtils.isEmpty(locality)) {
                                                    }
                                                    String countryCode2 = address2.getCountryCode();
                                                    countryName = address2.getCountryName();
                                                    if (TextUtils.isEmpty(countryName)) {
                                                    }
                                                    countryName2 = address2.getCountryName();
                                                    if (!TextUtils.isEmpty(countryName2)) {
                                                    }
                                                    locality2 = address2.getLocality();
                                                    if (!TextUtils.isEmpty(locality2)) {
                                                    }
                                                    if (!z3) {
                                                    }
                                                    format = sb2.toString();
                                                    str3 = sb6.toString();
                                                    sb3 = sb7.toString();
                                                    if (sb == null) {
                                                    }
                                                    z4 = z52;
                                                }
                                            }
                                            str16 = str15;
                                            if (TextUtils.isEmpty(str16)) {
                                            }
                                            sb8 = null;
                                            if (address != null) {
                                            }
                                            str17 = str10;
                                            if (TextUtils.isEmpty(str25)) {
                                            }
                                            subThoroughfare = address2.getSubThoroughfare();
                                            if (TextUtils.isEmpty(subThoroughfare)) {
                                            }
                                            thoroughfare = address2.getThoroughfare();
                                            boolean z522 = z;
                                            if (!TextUtils.isEmpty(thoroughfare)) {
                                            }
                                            if (!z2) {
                                            }
                                            locality = address2.getLocality();
                                            if (!TextUtils.isEmpty(locality)) {
                                            }
                                            String countryCode22 = address2.getCountryCode();
                                            countryName = address2.getCountryName();
                                            if (TextUtils.isEmpty(countryName)) {
                                            }
                                            countryName2 = address2.getCountryName();
                                            if (!TextUtils.isEmpty(countryName2)) {
                                            }
                                            locality2 = address2.getLocality();
                                            if (!TextUtils.isEmpty(locality2)) {
                                            }
                                            if (!z3) {
                                            }
                                            format = sb2.toString();
                                            str3 = sb6.toString();
                                            sb3 = sb7.toString();
                                            if (sb == null) {
                                            }
                                            z4 = z522;
                                        }
                                    }
                                    str14 = str13;
                                    if (TextUtils.isEmpty(str14)) {
                                    }
                                    str15 = str14;
                                    str16 = str15;
                                    if (TextUtils.isEmpty(str16)) {
                                    }
                                    sb8 = null;
                                    if (address != null) {
                                    }
                                    str17 = str10;
                                    if (TextUtils.isEmpty(str25)) {
                                    }
                                    subThoroughfare = address2.getSubThoroughfare();
                                    if (TextUtils.isEmpty(subThoroughfare)) {
                                    }
                                    thoroughfare = address2.getThoroughfare();
                                    boolean z5222 = z;
                                    if (!TextUtils.isEmpty(thoroughfare)) {
                                    }
                                    if (!z2) {
                                    }
                                    locality = address2.getLocality();
                                    if (!TextUtils.isEmpty(locality)) {
                                    }
                                    String countryCode222 = address2.getCountryCode();
                                    countryName = address2.getCountryName();
                                    if (TextUtils.isEmpty(countryName)) {
                                    }
                                    countryName2 = address2.getCountryName();
                                    if (!TextUtils.isEmpty(countryName2)) {
                                    }
                                    locality2 = address2.getLocality();
                                    if (!TextUtils.isEmpty(locality2)) {
                                    }
                                    if (!z3) {
                                    }
                                    format = sb2.toString();
                                    str3 = sb6.toString();
                                    sb3 = sb7.toString();
                                    if (sb == null) {
                                    }
                                    z4 = z5222;
                                }
                            }
                            str12 = null;
                            if (TextUtils.isEmpty(str12)) {
                            }
                            str13 = str12;
                            str14 = str13;
                            if (TextUtils.isEmpty(str14)) {
                            }
                            str15 = str14;
                            str16 = str15;
                            if (TextUtils.isEmpty(str16)) {
                            }
                            sb8 = null;
                            if (address != null) {
                            }
                            str17 = str10;
                            if (TextUtils.isEmpty(str25)) {
                            }
                            subThoroughfare = address2.getSubThoroughfare();
                            if (TextUtils.isEmpty(subThoroughfare)) {
                            }
                            thoroughfare = address2.getThoroughfare();
                            boolean z52222 = z;
                            if (!TextUtils.isEmpty(thoroughfare)) {
                            }
                            if (!z2) {
                            }
                            locality = address2.getLocality();
                            if (!TextUtils.isEmpty(locality)) {
                            }
                            String countryCode2222 = address2.getCountryCode();
                            countryName = address2.getCountryName();
                            if (TextUtils.isEmpty(countryName)) {
                            }
                            countryName2 = address2.getCountryName();
                            if (!TextUtils.isEmpty(countryName2)) {
                            }
                            locality2 = address2.getLocality();
                            if (!TextUtils.isEmpty(locality2)) {
                            }
                            if (!z3) {
                            }
                            format = sb2.toString();
                            str3 = sb6.toString();
                            sb3 = sb7.toString();
                            if (sb == null) {
                            }
                            z4 = z52222;
                        }
                        str7 = sb3;
                        str4 = str18;
                        str6 = str11;
                        str8 = str17;
                    } else {
                        format = b == 1 ? null : String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(location2.getLongitude()));
                        str3 = format;
                        str4 = null;
                        str5 = null;
                        str6 = null;
                        z4 = true;
                        str7 = null;
                        str8 = null;
                    }
                    String str28 = format;
                    String str29 = str3;
                    if (TextUtils.isEmpty(str7)) {
                        location = location2;
                        str9 = str29;
                        tL_messageMediaVenue5 = null;
                    } else {
                        tL_messageMediaVenue5 = new TLRPC.TL_messageMediaVenue();
                        try {
                            TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                            tL_messageMediaVenue5.geo = tL_geoPoint;
                            location = location2;
                            str9 = str29;
                            try {
                                tL_geoPoint.lat = location.getLatitude();
                                tL_messageMediaVenue5.geo._long = location.getLongitude();
                                tL_messageMediaVenue5.query_id = -1L;
                                tL_messageMediaVenue5.title = str7;
                                tL_messageMediaVenue5.icon = z4 ? "country" : "city";
                                tL_messageMediaVenue5.emoji = dd6.b(str4);
                                if (z4) {
                                    tL_messageMediaVenue6 = null;
                                    try {
                                        M0 = jb6.M0(2131751691, null);
                                    } catch (Exception unused7) {
                                        tL_messageMediaVenue2 = tL_messageMediaVenue6;
                                        tL_messageMediaVenue = tL_messageMediaVenue5;
                                        str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                                        str = str2;
                                        tL_messageMediaVenue4 = tL_messageMediaVenue;
                                        tL_messageMediaVenue3 = tL_messageMediaVenue2;
                                        gm.c3(new e77((Object) qc6Var, str2, (Object) str, (Object) tL_messageMediaVenue4, (Object) tL_messageMediaVenue3, (Object) location, (byte) 15));
                                        return;
                                    }
                                } else {
                                    M0 = jb6.M0(2131747328, null);
                                }
                                tL_messageMediaVenue5.address = M0;
                                tL_messageMediaVenue5.geoAddress = tL_geoPointAddress;
                                tL_geoPointAddress.country_iso2 = str4;
                                if (!z4) {
                                    if (!TextUtils.isEmpty(str8)) {
                                        tL_geoPointAddress.flags |= 1;
                                        tL_geoPointAddress.state = str8;
                                    }
                                    if (!TextUtils.isEmpty(str6)) {
                                        tL_geoPointAddress.flags |= 2;
                                        tL_geoPointAddress.city = str6;
                                    }
                                }
                            } catch (Exception unused8) {
                                tL_messageMediaVenue = tL_messageMediaVenue5;
                                tL_messageMediaVenue2 = null;
                                str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                                str = str2;
                                tL_messageMediaVenue4 = tL_messageMediaVenue;
                                tL_messageMediaVenue3 = tL_messageMediaVenue2;
                                gm.c3(new e77((Object) qc6Var, str2, (Object) str, (Object) tL_messageMediaVenue4, (Object) tL_messageMediaVenue3, (Object) location, (byte) 15));
                                return;
                            }
                        } catch (Exception unused9) {
                            location = location2;
                        }
                    }
                    try {
                        if (TextUtils.isEmpty(str5)) {
                            tL_messageMediaVenue7 = null;
                        } else {
                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue8 = new TLRPC.TL_messageMediaVenue();
                            try {
                                TLRPC.TL_geoPoint tL_geoPoint2 = new TLRPC.TL_geoPoint();
                                tL_messageMediaVenue8.geo = tL_geoPoint2;
                                tL_geoPoint2.lat = location.getLatitude();
                                tL_messageMediaVenue8.geo._long = location.getLongitude();
                                tL_messageMediaVenue8.query_id = -1L;
                                tL_messageMediaVenue8.title = str5;
                                tL_messageMediaVenue8.icon = "pin";
                                tL_messageMediaVenue8.address = jb6.M0(2131747193, null);
                                tL_messageMediaVenue8.geoAddress = tL_geoPointAddress2;
                                tL_geoPointAddress2.country_iso2 = str4;
                                if (!TextUtils.isEmpty(str8)) {
                                    tL_geoPointAddress2.flags |= 1;
                                    tL_geoPointAddress2.state = str8;
                                }
                                if (!TextUtils.isEmpty(str6)) {
                                    tL_geoPointAddress2.flags |= 2;
                                    tL_geoPointAddress2.city = str6;
                                }
                                if (!TextUtils.isEmpty(sb4)) {
                                    tL_geoPointAddress2.flags |= 4;
                                    tL_geoPointAddress2.street = sb4.toString();
                                }
                                tL_messageMediaVenue7 = tL_messageMediaVenue8;
                            } catch (Exception unused10) {
                                tL_messageMediaVenue2 = tL_messageMediaVenue8;
                                tL_messageMediaVenue = tL_messageMediaVenue5;
                                str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                                str = str2;
                                tL_messageMediaVenue4 = tL_messageMediaVenue;
                                tL_messageMediaVenue3 = tL_messageMediaVenue2;
                                gm.c3(new e77((Object) qc6Var, str2, (Object) str, (Object) tL_messageMediaVenue4, (Object) tL_messageMediaVenue3, (Object) location, (byte) 15));
                                return;
                            }
                        }
                        if (tL_messageMediaVenue5 == null && tL_messageMediaVenue7 == null) {
                            try {
                                String c = dd6.c(location.getLongitude(), location.getLatitude());
                                if (c != null) {
                                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue9 = new TLRPC.TL_messageMediaVenue();
                                    try {
                                        TLRPC.TL_geoPoint tL_geoPoint3 = new TLRPC.TL_geoPoint();
                                        tL_messageMediaVenue9.geo = tL_geoPoint3;
                                        tL_geoPoint3.lat = location.getLatitude();
                                        tL_messageMediaVenue9.geo._long = location.getLongitude();
                                        tL_messageMediaVenue9.query_id = -1L;
                                        tL_messageMediaVenue9.title = c;
                                        tL_messageMediaVenue9.icon = "pin";
                                        tL_messageMediaVenue9.emoji = "🌊";
                                        tL_messageMediaVenue9.address = "Ocean";
                                        tL_messageMediaVenue5 = tL_messageMediaVenue9;
                                    } catch (Exception unused11) {
                                        tL_messageMediaVenue2 = tL_messageMediaVenue7;
                                        tL_messageMediaVenue = tL_messageMediaVenue9;
                                        str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                                        str = str2;
                                        tL_messageMediaVenue4 = tL_messageMediaVenue;
                                        tL_messageMediaVenue3 = tL_messageMediaVenue2;
                                        gm.c3(new e77((Object) qc6Var, str2, (Object) str, (Object) tL_messageMediaVenue4, (Object) tL_messageMediaVenue3, (Object) location, (byte) 15));
                                        return;
                                    }
                                }
                            } catch (Exception unused12) {
                                tL_messageMediaVenue2 = tL_messageMediaVenue7;
                                tL_messageMediaVenue = tL_messageMediaVenue5;
                                str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                                str = str2;
                                tL_messageMediaVenue4 = tL_messageMediaVenue;
                                tL_messageMediaVenue3 = tL_messageMediaVenue2;
                                gm.c3(new e77((Object) qc6Var, str2, (Object) str, (Object) tL_messageMediaVenue4, (Object) tL_messageMediaVenue3, (Object) location, (byte) 15));
                                return;
                            }
                        }
                        tL_messageMediaVenue3 = tL_messageMediaVenue7;
                        tL_messageMediaVenue4 = tL_messageMediaVenue5;
                        str = str9;
                        str2 = str28;
                    } catch (Exception unused13) {
                        tL_messageMediaVenue6 = null;
                        tL_messageMediaVenue2 = tL_messageMediaVenue6;
                        tL_messageMediaVenue = tL_messageMediaVenue5;
                        str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                        str = str2;
                        tL_messageMediaVenue4 = tL_messageMediaVenue;
                        tL_messageMediaVenue3 = tL_messageMediaVenue2;
                        gm.c3(new e77((Object) qc6Var, str2, (Object) str, (Object) tL_messageMediaVenue4, (Object) tL_messageMediaVenue3, (Object) location, (byte) 15));
                        return;
                    }
                } catch (Exception unused14) {
                    location = location2;
                    tL_messageMediaVenue = null;
                    tL_messageMediaVenue2 = null;
                }
                gm.c3(new e77((Object) qc6Var, str2, (Object) str, (Object) tL_messageMediaVenue4, (Object) tL_messageMediaVenue3, (Object) location, (byte) 15));
                return;
            case 1:
                hs6 hs6Var = (hs6) this.c;
                boolean[] zArr = (boolean[]) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                byte b2 = this.b;
                int[] iArr = (int[]) this.f;
                ArrayList[] arrayListArr = hs6Var.H;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    hs6Var.h1(((TLRPC.TL_messages_stickerSet) arrayList2.get(i4)).set.id, false);
                    ((TLRPC.TL_messages_stickerSet) arrayList2.get(i4)).set.archived = false;
                    arrayListArr[b2].add(iArr[i4], (TLRPC.TL_messages_stickerSet) arrayList2.get(i4));
                    hs6Var.J.k((TLRPC.TL_messages_stickerSet) arrayList2.get(i4), ((TLRPC.TL_messages_stickerSet) arrayList2.get(i4)).set.id);
                    hs6Var.K.k((TLRPC.TL_messages_stickerSet) arrayList2.get(i4), ((TLRPC.TL_messages_stickerSet) arrayList2.get(i4)).set.id);
                    hs6Var.O.put(((TLRPC.TL_messages_stickerSet) arrayList2.get(i4)).set.short_name, (TLRPC.TL_messages_stickerSet) arrayList2.get(i4));
                    hs6Var.U.l(((TLRPC.TL_messages_stickerSet) arrayList2.get(i4)).set.id);
                }
                ArrayList arrayList3 = arrayListArr[b2];
                int i5 = hs6Var.Z[b2];
                long[] jArr = hs6Var.Y;
                long s = hs6.s(arrayList3);
                jArr[b2] = s;
                hs6Var.M1(b2, i5, s, arrayList3);
                hs6Var.getNotificationCenter().k(61, Integer.valueOf(b2), Boolean.TRUE);
                return;
            case 2:
                cf7 cf7Var = (cf7) this.c;
                String str30 = (String) this.d;
                byte b3 = this.b;
                Object[] objArr = (Object[]) this.e;
                CountDownLatch countDownLatch = (CountDownLatch) this.f;
                try {
                    try {
                        String a = Utilities.a(str30);
                        if (a != null) {
                            SQLiteDatabase sQLiteDatabase = cf7Var.b;
                            Locale locale4 = Locale.US;
                            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, parent FROM sent_files_v2 WHERE uid = '" + a + "' AND type = " + ((int) b3), new Object[0]);
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
                    } finally {
                        countDownLatch.countDown();
                    }
                } catch (Exception e) {
                    cf7Var.n(e, true);
                }
                return;
            default:
                cf7 cf7Var2 = (cf7) this.c;
                String str31 = (String) this.d;
                TLObject tLObject = (TLObject) this.e;
                byte b4 = this.b;
                String str32 = (String) this.f;
                try {
                    String a2 = Utilities.a(str31);
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
                        sQLitePreparedStatement = cf7Var2.b.executeFast("REPLACE INTO sent_files_v2 VALUES(?, ?, ?, ?)");
                        try {
                            try {
                                sQLitePreparedStatement.requery();
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageMedia.getObjectSize());
                                messageMedia.serializeToStream(nativeByteBuffer);
                                sQLitePreparedStatement.bindString(1, a2);
                                sQLitePreparedStatement.bindInteger(2, b4);
                                sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer);
                                sQLitePreparedStatement.bindString(4, str32);
                                sQLitePreparedStatement.step();
                                nativeByteBuffer.reuse();
                            } catch (Exception e2) {
                                e = e2;
                                cf7Var2.n(e, true);
                                if (sQLitePreparedStatement == null) {
                                    return;
                                }
                                sQLitePreparedStatement.dispose();
                                return;
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            throw th;
                        }
                    } else {
                        sQLitePreparedStatement = null;
                    }
                    if (sQLitePreparedStatement == null) {
                        return;
                    }
                } catch (Exception e3) {
                    e = e3;
                    sQLitePreparedStatement = null;
                } catch (Throwable th2) {
                    th = th2;
                    sQLitePreparedStatement = null;
                    if (sQLitePreparedStatement != null) {
                    }
                    throw th;
                }
                sQLitePreparedStatement.dispose();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ad6(pg0 pg0Var, Serializable serializable, Object obj, int i, Serializable serializable2, byte b) {
        this.a = b;
        this.c = pg0Var;
        this.d = serializable;
        this.e = obj;
        this.b = i;
        this.f = serializable2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ad6(Locale locale, Location location, int i, Locale locale2, qc6 qc6Var) {
        this.a = (byte) 0;
        this.c = locale;
        this.e = location;
        this.b = i;
        this.d = locale2;
        this.f = qc6Var;
    }
}
