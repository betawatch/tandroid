package org.telegram.messenger;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.SparseArray;
import android.webkit.MimeTypeMap;
import j$.util.Map;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c90;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class qz extends f1 implements us {
    public static final r5 I = new r5("mediaSendQueue");
    public static final ThreadPoolExecutor J;
    public static volatile qz[] K;
    public final a0.h D;
    public final HashMap E;
    public final HashMap F;
    public final j2.f G;
    public final HashMap H;
    public final HashMap a;
    public final SparseArray b;
    public final SparseArray c;
    public final SparseArray d;
    public final SparseArray e;
    public final a0.h f;
    public final a0.h h;
    public final HashMap n;
    public final HashMap r;
    public final HashMap s;
    public final HashMap w;
    public final a0.h x;
    public final HashMap y;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        J = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        K = new qz[4];
    }

    public qz(int i10) {
        super(i10);
        this.a = new HashMap();
        this.b = new SparseArray();
        this.c = new SparseArray();
        this.d = new SparseArray();
        this.e = new SparseArray();
        this.f = new a0.h();
        this.h = new a0.h();
        this.n = new HashMap();
        this.r = new HashMap();
        this.s = new HashMap();
        this.w = new HashMap();
        this.x = new a0.h();
        this.y = new HashMap();
        this.D = new a0.h();
        this.E = new HashMap();
        this.F = new HashMap();
        this.G = new j2.f(new k2.m0(this));
        this.H = new HashMap();
        i0.g3(new ms(this, 13));
    }

    public static void B0(TLRPC.Message message, SerializedData serializedData) {
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia == null) {
            new TLRPC.TL_messageMediaEmpty().serializeToStream(serializedData);
        } else {
            messageMedia.serializeToStream(serializedData);
        }
        String str = message.message;
        if (str == null) {
            str = "";
        }
        serializedData.writeString(str);
        String str2 = message.attachPath;
        serializedData.writeString(str2 != null ? str2 : "");
        int size = message.entities.size();
        serializedData.writeInt32(size);
        for (int i10 = 0; i10 < size; i10++) {
            message.entities.get(i10).serializeToStream(serializedData);
        }
    }

    public static qz C(int i10) {
        qz qzVar;
        qz qzVar2 = K[i10];
        if (qzVar2 != null) {
            return qzVar2;
        }
        synchronized (qz.class) {
            try {
                qzVar = K[i10];
                if (qzVar == null) {
                    qz[] qzVarArr = K;
                    qz qzVar3 = new qz(i10);
                    qzVarArr[i10] = qzVar3;
                    qzVar = qzVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qzVar;
    }

    public static String D(c cVar, TLRPC.PhotoSize photoSize, Bitmap[] bitmapArr, boolean z10, boolean z11) {
        if (photoSize == null || photoSize.location == null) {
            return null;
        }
        PointF N1 = org.telegram.ui.Cells.q1.N1(photoSize.w, photoSize.h, 0, 0);
        if (bitmapArr != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                b8.G(cVar.a);
                File K2 = b8.K(photoSize, null, z11, true);
                FileInputStream fileInputStream = new FileInputStream(K2);
                BitmapFactory.decodeStream(fileInputStream, null, options);
                fileInputStream.close();
                float max = Math.max(options.outWidth / N1.x, options.outHeight / N1.y);
                if (max < 1.0f) {
                    max = 1.0f;
                }
                options.inJustDecodeBounds = false;
                options.inSampleSize = (int) max;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                FileInputStream fileInputStream2 = new FileInputStream(K2);
                bitmapArr[0] = BitmapFactory.decodeStream(fileInputStream2, null, options);
                fileInputStream2.close();
            } catch (Throwable unused) {
            }
        }
        return String.format(Locale.US, z10 ? "%d_%d@%d_%d_b" : "%d_%d@%d_%d", Long.valueOf(photoSize.location.volume_id), Integer.valueOf(photoSize.location.local_id), Integer.valueOf((int) (N1.x / i0.p)), Integer.valueOf((int) (N1.y / i0.p)));
    }

    public static long E() {
        long j10 = 0;
        while (j10 == 0) {
            j10 = Utilities.b.nextLong();
        }
        return j10;
    }

    public static TLRPC.PhotoSize G(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) arrayList.get(i10);
            if (photoSize != null && !(photoSize instanceof TLRPC.TL_photoPathSize) && !(photoSize instanceof TLRPC.TL_photoSizeEmpty) && photoSize.location != null) {
                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                    return photoSize;
                }
                TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
                tL_photoSize_layer127.type = photoSize.type;
                tL_photoSize_layer127.w = photoSize.w;
                tL_photoSize_layer127.h = photoSize.h;
                tL_photoSize_layer127.size = photoSize.size;
                byte[] bArr = photoSize.bytes;
                tL_photoSize_layer127.bytes = bArr;
                if (bArr == null) {
                    tL_photoSize_layer127.bytes = new byte[0];
                }
                TLRPC.TL_fileLocation_layer82 tL_fileLocation_layer82 = new TLRPC.TL_fileLocation_layer82();
                tL_photoSize_layer127.location = tL_fileLocation_layer82;
                TLRPC.FileLocation fileLocation = photoSize.location;
                tL_fileLocation_layer82.dc_id = fileLocation.dc_id;
                tL_fileLocation_layer82.volume_id = fileLocation.volume_id;
                tL_fileLocation_layer82.local_id = fileLocation.local_id;
                tL_fileLocation_layer82.secret = fileLocation.secret;
                return tL_photoSize_layer127;
            }
        }
        return null;
    }

    public static CharSequence H(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        CharSequence n12 = i0.n1(charSequence);
        if (n12.length() == 0) {
            return n12;
        }
        while (charSequence.length() > 0 && charSequence.charAt(0) == '\n') {
            charSequence = charSequence.subSequence(1, charSequence.length());
        }
        while (charSequence.length() > 0 && charSequence.charAt(charSequence.length() - 1) == '\n') {
            charSequence = charSequence.subSequence(0, charSequence.length() - 1);
        }
        return charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x01e2, code lost:
    
        if (x0(r9.a, null) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01e5, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01ee, code lost:
    
        if (android.text.TextUtils.isEmpty(r9.d) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x06a0, code lost:
    
        if (r8 == (r49 - 1)) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0b18, code lost:
    
        if (r6 == (r62 - 1)) goto L484;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0825, code lost:
    
        if (r3 == null) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0185, code lost:
    
        if (r4 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x11d5, code lost:
    
        if (r15 == (r62 - 1)) goto L773;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0487 A[Catch: Exception -> 0x046a, TRY_LEAVE, TryCatch #6 {Exception -> 0x046a, blocks: (B:237:0x0462, B:193:0x046f, B:231:0x047e, B:195:0x0487), top: B:236:0x0462 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0494 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0479 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0aeb  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0b26  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0822 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0bd9  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0d4b  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0eb2  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x0eba  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0ecd  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0f47  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0f58  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x0f71  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0fbf  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x0fd4  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x110c  */
    /* JADX WARN: Removed duplicated region for block: B:672:0x1119  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x1126  */
    /* JADX WARN: Removed duplicated region for block: B:680:0x1134 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:683:0x1140  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x114e  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x1151  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x1185  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x118e  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x119f  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x11a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:713:0x11f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:723:0x1232 A[LOOP:5: B:721:0x122a->B:723:0x1232, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:739:0x103a  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x0fc5  */
    /* JADX WARN: Removed duplicated region for block: B:748:0x0f2a  */
    /* JADX WARN: Removed duplicated region for block: B:749:0x0eb7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:791:0x1057  */
    /* JADX WARN: Removed duplicated region for block: B:836:0x12b0  */
    /* JADX WARN: Removed duplicated region for block: B:839:0x12cc  */
    /* JADX WARN: Removed duplicated region for block: B:840:0x0bdb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x026c  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v64 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void K(ArrayList arrayList, final long j10, boolean z10, boolean z11, boolean z12, final c cVar, long j11, final jj jjVar, final TLRPC.TL_inputPollAnswer tL_inputPollAnswer, final jj jjVar2, final jj jjVar3, final boolean z13, final int i10, final int i11, final TL_stories.StoryItem storyItem, final org.telegram.ui.kn knVar, final sw swVar, final long j12, final boolean z14, final long j13, final long j14, final oj ojVar, final ih.i iVar, boolean z15, m2.t tVar, final boolean z16) {
        String str;
        String str2;
        ?? r52;
        String str3;
        String str4;
        HashMap hashMap;
        boolean z17;
        int i12;
        hf hfVar;
        int i13;
        ArrayList arrayList2;
        int i14;
        HashMap hashMap2;
        String str5;
        String str6;
        String str7;
        long j15;
        int i15;
        HashMap hashMap3;
        long j16;
        boolean z18;
        String str8;
        x20 x20Var;
        String str9;
        boolean z19;
        String str10;
        int i16;
        ArrayList arrayList3;
        long j17;
        boolean z20;
        String str11;
        String str12;
        String str13;
        File file;
        String str14;
        Object obj;
        boolean z21;
        x20 x20Var2;
        String str15;
        long j18;
        String str16;
        TLRPC.TL_document tL_document;
        String str17;
        pz pzVar;
        Object obj2;
        String str18;
        Object obj3;
        Object obj4;
        String str19;
        Object obj5;
        Object obj6;
        Object obj7;
        String str20;
        Bitmap bitmap;
        int i17;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize q6;
        final HashMap hashMap4;
        String str21;
        int i18;
        int i19;
        long j19;
        int i20;
        ArrayList arrayList4;
        int i21;
        int size;
        int i22;
        boolean z22;
        Object obj8;
        String str22;
        char c10;
        String str23;
        Bitmap decodeFile;
        Object obj9;
        Object obj10;
        int i23;
        TLRPC.PhotoSize photoSize2;
        String str24;
        TLRPC.TL_document tL_document2;
        x20 x20Var3;
        x20 x20Var4;
        String str25;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        String str26;
        Object obj11;
        int i24;
        int i25;
        TLRPC.FileLocation fileLocation;
        String str27;
        Bitmap decodeFile2;
        Bitmap createBitmap;
        File file2;
        hf hfVar2;
        String str28;
        String str29;
        Object obj12;
        String str30;
        String str31;
        String str32;
        String str33;
        String str34;
        String str35;
        boolean z23;
        String str36;
        String str37;
        Object obj13;
        Object obj14;
        Object obj15;
        String str38;
        Object obj16;
        Object obj17;
        int i26;
        String str39;
        String str40;
        TLRPC.TL_photo tL_photo;
        String str41;
        final TLRPC.TL_photo tL_photo2;
        String str42;
        int i27;
        TLRPC.TL_photo tL_photo3;
        String str43;
        Object[] g02;
        Object obj18;
        int i28;
        int i29;
        long j20;
        ArrayList arrayList5;
        int i30;
        int i31;
        long j21;
        ArrayList arrayList6;
        Uri uri;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        Uri uri2;
        Uri uri3;
        boolean z24;
        long j22;
        int i32;
        File file3;
        TLRPC.TL_document tL_document3;
        HashMap hashMap5;
        Object obj19;
        boolean z25;
        File file4;
        final TLRPC.TL_document tL_document4;
        String str44;
        File file5;
        int i33;
        Bitmap r10;
        String str45;
        String str46;
        int i34;
        String str47;
        boolean z26;
        boolean z27;
        String str48;
        String str49;
        pz pzVar2;
        boolean z28;
        TLRPC.TL_photo tL_photo4;
        String str50;
        int i35;
        Object[] g03;
        String str51;
        Object obj20;
        Object obj21;
        Object[] g04;
        Object obj22;
        Uri uri4;
        Uri uri5;
        Bitmap decodeFile3;
        ArrayList arrayList7 = arrayList;
        c cVar2 = cVar;
        long currentTimeMillis = System.currentTimeMillis();
        int size2 = arrayList7.size();
        int i36 = 0;
        while (true) {
            str = ".jpeg";
            str2 = "-2147483648_";
            r52 = 1;
            if (i36 >= size2) {
                break;
            }
            pz pzVar3 = (pz) arrayList7.get(i36);
            if (pzVar3.c != null && pzVar3.p && pzVar3.q) {
                File file6 = new File(pzVar3.c);
                File file7 = new File(b8.z(4), "-2147483648_" + tz.p() + ".jpeg");
                long j23 = pzVar3.z;
                try {
                    if (TextUtils.isEmpty(pzVar3.b)) {
                        m(0L, j23, file6, file7);
                        pzVar3.c = file7.getAbsolutePath();
                        Pair L0 = i0.L0(file7);
                        if (((Integer) L0.first).intValue() != 0 && (decodeFile3 = BitmapFactory.decodeFile(file7.getAbsolutePath())) != null) {
                            int intValue = ((Integer) L0.second).intValue();
                            Matrix matrix = new Matrix();
                            matrix.postScale(intValue == 1 ? -1.0f : 1.0f, intValue == 2 ? -1.0f : 1.0f, decodeFile3.getWidth() / 2.0f, decodeFile3.getHeight() / 2.0f);
                            matrix.postRotate(((Integer) L0.first).intValue());
                            Bitmap createBitmap2 = Bitmap.createBitmap(decodeFile3, 0, 0, decodeFile3.getWidth(), decodeFile3.getHeight(), matrix, true);
                            File file8 = new File(b8.z(4), "-2147483648_" + tz.p() + ".jpeg");
                            createBitmap2.compress(Bitmap.CompressFormat.JPEG, 97, new FileOutputStream(file8));
                            pzVar3.c = file8.getAbsolutePath();
                            file7.delete();
                        }
                    } else {
                        pzVar3.c = pzVar3.b;
                    }
                    pzVar3.k = null;
                    pzVar3.o = false;
                    pzVar3.p = false;
                } catch (Exception e) {
                    f8.f(e);
                }
            }
            i36++;
        }
        boolean C = o5.C(j10);
        String str52 = ".gif";
        String str53 = "_";
        if (z10 || !z11) {
            str3 = ".gif";
            str4 = "_";
            hashMap = null;
        } else {
            HashMap hashMap6 = new HashMap();
            int i37 = 0;
            while (i37 < size2) {
                pz pzVar4 = (pz) arrayList7.get(i37);
                if (pzVar4.l == null && !pzVar4.o && pzVar4.k == null) {
                    ef efVar = pzVar4.y;
                    if (efVar != null && pzVar4.x) {
                        efVar.j();
                        String str54 = pzVar4.y.h;
                        if (str54 != null) {
                            pzVar4.c = str54;
                        }
                    }
                    String str55 = pzVar4.c;
                    if (str55 != null || (uri5 = pzVar4.a) == null) {
                        str47 = str55;
                    } else {
                        str55 = i0.T0(uri5);
                        str47 = pzVar4.a.toString();
                    }
                    if (str55 == null || pzVar4.h > 0) {
                        z26 = C;
                        z27 = false;
                    } else {
                        if (str55.endsWith(str52)) {
                            z27 = false;
                            z26 = C;
                        } else {
                            z27 = str55.endsWith(".webp");
                            z26 = C;
                        }
                        if (arrayList7.size() > r52 || ((z27 && !x0(null, str55)) || !TextUtils.isEmpty(pzVar4.d))) {
                            pzVar4.s = r52;
                            str48 = null;
                            if (str55 != null) {
                                File file9 = new File(str55);
                                StringBuilder t10 = a1.g.t(str47);
                                t10.append(file9.length());
                                t10.append(str53);
                                t10.append(file9.lastModified());
                                str49 = t10.toString();
                            } else {
                                str49 = str48;
                            }
                            if (z26 && pzVar4.h == 0 && !z12) {
                                boolean z29 = pzVar4.x;
                                int i38 = z29 ? !z26 ? 6 : 7 : !z26 ? 0 : 3;
                                if (pzVar4.q) {
                                    i35 = z29 ? 6 : 0;
                                } else {
                                    if (pzVar4.p) {
                                        if (z29) {
                                            i35 = 8;
                                        } else {
                                            i38 = 2;
                                        }
                                    }
                                    g03 = hs.a0(cVar2.a).g0(i38, str49);
                                    if (g03 != null) {
                                        Object obj23 = g03[0];
                                        if (obj23 instanceof TLRPC.TL_photo) {
                                            Object obj24 = (TLRPC.TL_photo) obj23;
                                            str51 = (String) g03[1];
                                            obj20 = obj24;
                                            if (obj20 == null && pzVar4.a != null && (g04 = hs.a0(cVar2.a).g0(i38, i0.T0(pzVar4.a))) != null) {
                                                obj22 = g04[0];
                                                if (obj22 instanceof TLRPC.TL_photo) {
                                                    str51 = (String) g04[1];
                                                    obj21 = (TLRPC.TL_photo) obj22;
                                                    tL_photo4 = obj21;
                                                    str50 = str51;
                                                    str45 = str52;
                                                    z28 = z26;
                                                    str46 = str53;
                                                    i34 = i37;
                                                    pzVar2 = pzVar4;
                                                    w(cVar2, z28, tL_photo4, pzVar4.c, pzVar4.a, 0L, pzVar4.x);
                                                }
                                            }
                                            obj21 = obj20;
                                            tL_photo4 = obj21;
                                            str50 = str51;
                                            str45 = str52;
                                            z28 = z26;
                                            str46 = str53;
                                            i34 = i37;
                                            pzVar2 = pzVar4;
                                            w(cVar2, z28, tL_photo4, pzVar4.c, pzVar4.a, 0L, pzVar4.x);
                                        }
                                    }
                                    String str56 = str48;
                                    str51 = str56;
                                    obj20 = str56;
                                    if (obj20 == null) {
                                        obj22 = g04[0];
                                        if (obj22 instanceof TLRPC.TL_photo) {
                                        }
                                    }
                                    obj21 = obj20;
                                    tL_photo4 = obj21;
                                    str50 = str51;
                                    str45 = str52;
                                    z28 = z26;
                                    str46 = str53;
                                    i34 = i37;
                                    pzVar2 = pzVar4;
                                    w(cVar2, z28, tL_photo4, pzVar4.c, pzVar4.a, 0L, pzVar4.x);
                                }
                                i38 = i35;
                                g03 = hs.a0(cVar2.a).g0(i38, str49);
                                if (g03 != null) {
                                }
                                String str562 = str48;
                                str51 = str562;
                                obj20 = str562;
                                if (obj20 == null) {
                                }
                                obj21 = obj20;
                                tL_photo4 = obj21;
                                str50 = str51;
                                str45 = str52;
                                z28 = z26;
                                str46 = str53;
                                i34 = i37;
                                pzVar2 = pzVar4;
                                w(cVar2, z28, tL_photo4, pzVar4.c, pzVar4.a, 0L, pzVar4.x);
                            } else {
                                str45 = str52;
                                str46 = str53;
                                pzVar2 = pzVar4;
                                z28 = z26;
                                i34 = i37;
                                tL_photo4 = null;
                                str50 = null;
                            }
                            boolean z30 = z28;
                            nz nzVar = new nz();
                            hashMap6.put(pzVar2, nzVar);
                            if (tL_photo4 != null) {
                                nzVar.b = str50;
                                nzVar.a = tL_photo4;
                                cVar2 = cVar;
                                C = z30;
                            } else {
                                nzVar.c = new CountDownLatch(1);
                                ThreadPoolExecutor threadPoolExecutor = J;
                                bi.n4 n4Var = new bi.n4(nzVar, cVar, pzVar2, z30, 21);
                                cVar2 = cVar;
                                C = z30;
                                threadPoolExecutor.execute(n4Var);
                            }
                            i37 = i34 + 1;
                            str52 = str45;
                            str53 = str46;
                            r52 = 1;
                        }
                        str45 = str52;
                        str46 = str53;
                        C = z26;
                    }
                    if (!hc.d0(pzVar4.a, pzVar4.c)) {
                        if (str55 == null && (uri4 = pzVar4.a) != null && (MediaController.G(uri4) || (z27 = MediaController.M(pzVar4.a)))) {
                            boolean z31 = true;
                            if (arrayList7.size() > 1) {
                                str48 = null;
                            } else if (z27) {
                                str48 = null;
                            } else {
                                str48 = null;
                            }
                            pzVar4.s = z31;
                            if (str55 != null) {
                            }
                            if (z26) {
                            }
                            str45 = str52;
                            str46 = str53;
                            pzVar2 = pzVar4;
                            z28 = z26;
                            i34 = i37;
                            tL_photo4 = null;
                            str50 = null;
                            boolean z302 = z28;
                            nz nzVar2 = new nz();
                            hashMap6.put(pzVar2, nzVar2);
                            if (tL_photo4 != null) {
                            }
                            i37 = i34 + 1;
                            str52 = str45;
                            str53 = str46;
                            r52 = 1;
                        }
                        str48 = null;
                        if (str55 != null) {
                        }
                        if (z26) {
                        }
                        str45 = str52;
                        str46 = str53;
                        pzVar2 = pzVar4;
                        z28 = z26;
                        i34 = i37;
                        tL_photo4 = null;
                        str50 = null;
                        boolean z3022 = z28;
                        nz nzVar22 = new nz();
                        hashMap6.put(pzVar2, nzVar22);
                        if (tL_photo4 != null) {
                        }
                        i37 = i34 + 1;
                        str52 = str45;
                        str53 = str46;
                        r52 = 1;
                    }
                    str45 = str52;
                    str46 = str53;
                    C = z26;
                } else {
                    str45 = str52;
                    str46 = str53;
                }
                i34 = i37;
                i37 = i34 + 1;
                str52 = str45;
                str53 = str46;
                r52 = 1;
            }
            str3 = str52;
            str4 = str53;
            hashMap = hashMap6;
        }
        long j24 = 0;
        long j25 = 0;
        long j26 = 0;
        String str57 = ".webp";
        int i39 = 0;
        int i40 = 0;
        ArrayList arrayList8 = null;
        ArrayList arrayList9 = null;
        ArrayList arrayList10 = null;
        ArrayList arrayList11 = null;
        ArrayList arrayList12 = null;
        String str58 = null;
        while (i40 < size2) {
            final pz pzVar5 = (pz) arrayList7.get(i40);
            boolean z32 = i39 == 0;
            if (j11 != j24) {
                j25 = j11;
                j26 = j25;
            } else if (z11 && size2 > 1 && i39 % 10 == 0) {
                j26 = Utilities.b.nextLong();
                j25 = j26;
            } else {
                i12 = i39;
                hfVar = pzVar5.l;
                i13 = i40;
                arrayList2 = arrayList8;
                ArrayList arrayList13 = arrayList9;
                i14 = size2;
                hashMap2 = hashMap;
                ArrayList arrayList14 = arrayList10;
                ArrayList arrayList15 = arrayList11;
                if (hfVar == null && pzVar5.k == null) {
                    str10 = str;
                    str9 = str2;
                    if (hfVar.H == 1) {
                        HashMap hashMap7 = new HashMap();
                        TLRPC.Document document = pzVar5.l.J;
                        if (document instanceof TLRPC.TL_document) {
                            tL_document3 = (TLRPC.TL_document) document;
                            b8.G(cVar2.a);
                            file3 = b8.L(tL_document3, true);
                        } else {
                            file3 = new File(b8.z(4), Utilities.a(pzVar5.l.C) + "." + hc.B(pzVar5.l.C, "jpg"));
                            tL_document3 = null;
                        }
                        if (tL_document3 == null) {
                            TLRPC.TL_document tL_document5 = new TLRPC.TL_document();
                            hashMap5 = hashMap7;
                            obj19 = "originalPath";
                            tL_document5.id = 0L;
                            tL_document5.file_reference = new byte[0];
                            tL_document5.date = ConnectionsManager.getInstance(cVar2.a).getCurrentTime();
                            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                            tL_documentAttributeFilename.file_name = "animation.gif";
                            tL_document5.attributes.add(tL_documentAttributeFilename);
                            tL_document5.size = pzVar5.l.G;
                            tL_document5.dc_id = 0;
                            if (z10 || !file3.toString().endsWith("mp4")) {
                                tL_document5.mime_type = "image/gif";
                            } else {
                                tL_document5.mime_type = "video/mp4";
                                tL_document5.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                            }
                            if (file3.exists()) {
                                file4 = file3;
                            } else {
                                file4 = null;
                                file3 = null;
                            }
                            if (file3 == null) {
                                file5 = new File(b8.z(4), Utilities.a(pzVar5.l.D) + "." + hc.B(pzVar5.l.D, "jpg"));
                                if (!file5.exists()) {
                                    file5 = null;
                                }
                            } else {
                                file5 = file3;
                            }
                            if (file5 != null) {
                                if (!C) {
                                    try {
                                        if (pzVar5.h == 0) {
                                            i33 = zs.r5;
                                            if (file5.getAbsolutePath().endsWith("mp4")) {
                                                String absolutePath = file5.getAbsolutePath();
                                                float f7 = i33;
                                                r10 = hc.K(absolutePath, null, f7, f7, true);
                                            } else {
                                                try {
                                                    r10 = r(1, file5.getAbsolutePath());
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    f8.f(e);
                                                    if (tL_document5.thumbs.isEmpty()) {
                                                    }
                                                    tL_document4 = tL_document5;
                                                    String str59 = pzVar5.l.C;
                                                    if (file4 != null) {
                                                    }
                                                    final String str60 = str59;
                                                    str44 = pzVar5.l.C;
                                                    if (str44 != null) {
                                                    }
                                                    final HashMap hashMap8 = hashMap5;
                                                    str7 = str57;
                                                    final boolean z33 = z32;
                                                    hashMap3 = hashMap2;
                                                    j16 = 0;
                                                    cVar2 = cVar;
                                                    i0.g3(new Runnable() { // from class: org.telegram.messenger.my
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            jj jjVar4 = jj.this;
                                                            TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                                            c cVar3 = cVar;
                                                            TLRPC.TL_document tL_document6 = tL_document4;
                                                            String str61 = str60;
                                                            HashMap hashMap9 = hashMap8;
                                                            pz pzVar6 = pzVar5;
                                                            if (jjVar4 != null || tL_inputPollAnswer2 != null) {
                                                                qz.C(cVar3.a).t(jjVar4, tL_inputPollAnswer2, null, null, tL_document6, str61, null, hashMap9, false, pzVar6.u, null);
                                                                return;
                                                            }
                                                            oz e10 = oz.e(tL_document6, null, str61, j10, jjVar2, jjVar3, pzVar6.d, pzVar6.i, hashMap9, z13, i10, i11, 0, null, pzVar6.u);
                                                            e10.H = storyItem;
                                                            e10.J = knVar;
                                                            e10.K = swVar;
                                                            if (z33) {
                                                                e10.O = j12;
                                                            }
                                                            e10.L = z14;
                                                            e10.Q = j13;
                                                            e10.R = j14;
                                                            e10.T = ojVar;
                                                            e10.k = pzVar6.B;
                                                            e10.j = iVar;
                                                            qz.C(cVar3.a).r0(e10);
                                                        }
                                                    });
                                                    i39 = i12;
                                                    arrayList8 = arrayList2;
                                                    z19 = C;
                                                    str8 = str4;
                                                    arrayList9 = arrayList13;
                                                    arrayList10 = arrayList14;
                                                    arrayList11 = arrayList15;
                                                    j15 = j25;
                                                    i16 = i14;
                                                    i15 = i13;
                                                    i40 = i15 + 1;
                                                    size2 = i16;
                                                    j24 = j16;
                                                    C = z19;
                                                    str = str10;
                                                    str2 = str9;
                                                    hashMap = hashMap3;
                                                    str57 = str7;
                                                    j25 = j15;
                                                    str4 = str8;
                                                    arrayList7 = arrayList;
                                                }
                                            }
                                            if (r10 != null) {
                                                try {
                                                    float f10 = i33;
                                                    TLRPC.PhotoSize Z = hc.Z(r10, f10, f10, i33 > 90 ? 80 : 55, C);
                                                    if (Z != null) {
                                                        tL_document5.thumbs.add(Z);
                                                        tL_document5.flags |= 1;
                                                    }
                                                    r10.recycle();
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    f8.f(e);
                                                    if (tL_document5.thumbs.isEmpty()) {
                                                    }
                                                    tL_document4 = tL_document5;
                                                    String str592 = pzVar5.l.C;
                                                    if (file4 != null) {
                                                    }
                                                    final String str602 = str592;
                                                    str44 = pzVar5.l.C;
                                                    if (str44 != null) {
                                                    }
                                                    final HashMap hashMap82 = hashMap5;
                                                    str7 = str57;
                                                    final boolean z332 = z32;
                                                    hashMap3 = hashMap2;
                                                    j16 = 0;
                                                    cVar2 = cVar;
                                                    i0.g3(new Runnable() { // from class: org.telegram.messenger.my
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            jj jjVar4 = jj.this;
                                                            TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                                            c cVar3 = cVar;
                                                            TLRPC.TL_document tL_document6 = tL_document4;
                                                            String str61 = str602;
                                                            HashMap hashMap9 = hashMap82;
                                                            pz pzVar6 = pzVar5;
                                                            if (jjVar4 != null || tL_inputPollAnswer2 != null) {
                                                                qz.C(cVar3.a).t(jjVar4, tL_inputPollAnswer2, null, null, tL_document6, str61, null, hashMap9, false, pzVar6.u, null);
                                                                return;
                                                            }
                                                            oz e102 = oz.e(tL_document6, null, str61, j10, jjVar2, jjVar3, pzVar6.d, pzVar6.i, hashMap9, z13, i10, i11, 0, null, pzVar6.u);
                                                            e102.H = storyItem;
                                                            e102.J = knVar;
                                                            e102.K = swVar;
                                                            if (z332) {
                                                                e102.O = j12;
                                                            }
                                                            e102.L = z14;
                                                            e102.Q = j13;
                                                            e102.R = j14;
                                                            e102.T = ojVar;
                                                            e102.k = pzVar6.B;
                                                            e102.j = iVar;
                                                            qz.C(cVar3.a).r0(e102);
                                                        }
                                                    });
                                                    i39 = i12;
                                                    arrayList8 = arrayList2;
                                                    z19 = C;
                                                    str8 = str4;
                                                    arrayList9 = arrayList13;
                                                    arrayList10 = arrayList14;
                                                    arrayList11 = arrayList15;
                                                    j15 = j25;
                                                    i16 = i14;
                                                    i15 = i13;
                                                    i40 = i15 + 1;
                                                    size2 = i16;
                                                    j24 = j16;
                                                    C = z19;
                                                    str = str10;
                                                    str2 = str9;
                                                    hashMap = hashMap3;
                                                    str57 = str7;
                                                    j25 = j15;
                                                    str4 = str8;
                                                    arrayList7 = arrayList;
                                                }
                                            }
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        f8.f(e);
                                        if (tL_document5.thumbs.isEmpty()) {
                                        }
                                        tL_document4 = tL_document5;
                                        String str5922 = pzVar5.l.C;
                                        if (file4 != null) {
                                        }
                                        final String str6022 = str5922;
                                        str44 = pzVar5.l.C;
                                        if (str44 != null) {
                                        }
                                        final HashMap hashMap822 = hashMap5;
                                        str7 = str57;
                                        final boolean z3322 = z32;
                                        hashMap3 = hashMap2;
                                        j16 = 0;
                                        cVar2 = cVar;
                                        i0.g3(new Runnable() { // from class: org.telegram.messenger.my
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                jj jjVar4 = jj.this;
                                                TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                                c cVar3 = cVar;
                                                TLRPC.TL_document tL_document6 = tL_document4;
                                                String str61 = str6022;
                                                HashMap hashMap9 = hashMap822;
                                                pz pzVar6 = pzVar5;
                                                if (jjVar4 != null || tL_inputPollAnswer2 != null) {
                                                    qz.C(cVar3.a).t(jjVar4, tL_inputPollAnswer2, null, null, tL_document6, str61, null, hashMap9, false, pzVar6.u, null);
                                                    return;
                                                }
                                                oz e102 = oz.e(tL_document6, null, str61, j10, jjVar2, jjVar3, pzVar6.d, pzVar6.i, hashMap9, z13, i10, i11, 0, null, pzVar6.u);
                                                e102.H = storyItem;
                                                e102.J = knVar;
                                                e102.K = swVar;
                                                if (z3322) {
                                                    e102.O = j12;
                                                }
                                                e102.L = z14;
                                                e102.Q = j13;
                                                e102.R = j14;
                                                e102.T = ojVar;
                                                e102.k = pzVar6.B;
                                                e102.j = iVar;
                                                qz.C(cVar3.a).r0(e102);
                                            }
                                        });
                                        i39 = i12;
                                        arrayList8 = arrayList2;
                                        z19 = C;
                                        str8 = str4;
                                        arrayList9 = arrayList13;
                                        arrayList10 = arrayList14;
                                        arrayList11 = arrayList15;
                                        j15 = j25;
                                        i16 = i14;
                                        i15 = i13;
                                        i40 = i15 + 1;
                                        size2 = i16;
                                        j24 = j16;
                                        C = z19;
                                        str = str10;
                                        str2 = str9;
                                        hashMap = hashMap3;
                                        str57 = str7;
                                        j25 = j15;
                                        str4 = str8;
                                        arrayList7 = arrayList;
                                    }
                                }
                                i33 = 90;
                                if (file5.getAbsolutePath().endsWith("mp4")) {
                                }
                                if (r10 != null) {
                                }
                            }
                            if (tL_document5.thumbs.isEmpty()) {
                                z25 = false;
                            } else {
                                TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                                hf hfVar3 = pzVar5.l;
                                tL_photoSize.w = hfVar3.E;
                                tL_photoSize.h = hfVar3.F;
                                z25 = false;
                                tL_photoSize.size = 0;
                                tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
                                tL_photoSize.type = "x";
                                tL_document5.thumbs.add(tL_photoSize);
                                tL_document5.flags |= 1;
                            }
                            tL_document4 = tL_document5;
                        } else {
                            hashMap5 = hashMap7;
                            obj19 = "originalPath";
                            z25 = false;
                            file4 = file3;
                            tL_document4 = tL_document3;
                        }
                        String str59222 = pzVar5.l.C;
                        if (file4 != null) {
                            str59222 = file4.toString();
                        }
                        final String str60222 = str59222;
                        str44 = pzVar5.l.C;
                        if (str44 != null) {
                            hashMap5.put(obj19, str44);
                        }
                        final HashMap hashMap8222 = hashMap5;
                        str7 = str57;
                        final boolean z33222 = z32;
                        hashMap3 = hashMap2;
                        j16 = 0;
                        cVar2 = cVar;
                        i0.g3(new Runnable() { // from class: org.telegram.messenger.my
                            @Override // java.lang.Runnable
                            public final void run() {
                                jj jjVar4 = jj.this;
                                TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                c cVar3 = cVar;
                                TLRPC.TL_document tL_document6 = tL_document4;
                                String str61 = str60222;
                                HashMap hashMap9 = hashMap8222;
                                pz pzVar6 = pzVar5;
                                if (jjVar4 != null || tL_inputPollAnswer2 != null) {
                                    qz.C(cVar3.a).t(jjVar4, tL_inputPollAnswer2, null, null, tL_document6, str61, null, hashMap9, false, pzVar6.u, null);
                                    return;
                                }
                                oz e102 = oz.e(tL_document6, null, str61, j10, jjVar2, jjVar3, pzVar6.d, pzVar6.i, hashMap9, z13, i10, i11, 0, null, pzVar6.u);
                                e102.H = storyItem;
                                e102.J = knVar;
                                e102.K = swVar;
                                if (z33222) {
                                    e102.O = j12;
                                }
                                e102.L = z14;
                                e102.Q = j13;
                                e102.R = j14;
                                e102.T = ojVar;
                                e102.k = pzVar6.B;
                                e102.j = iVar;
                                qz.C(cVar3.a).r0(e102);
                            }
                        });
                        i39 = i12;
                        arrayList8 = arrayList2;
                        z19 = C;
                        str8 = str4;
                        arrayList9 = arrayList13;
                        arrayList10 = arrayList14;
                        arrayList11 = arrayList15;
                        j15 = j25;
                        i16 = i14;
                        i15 = i13;
                        i40 = i15 + 1;
                        size2 = i16;
                        j24 = j16;
                        C = z19;
                        str = str10;
                        str2 = str9;
                        hashMap = hashMap3;
                        str57 = str7;
                        j25 = j15;
                        str4 = str8;
                        arrayList7 = arrayList;
                    } else {
                        str7 = str57;
                        long j27 = j25;
                        hashMap3 = hashMap2;
                        j16 = 0;
                        boolean z34 = C;
                        TLRPC.Photo photo = hfVar.K;
                        TLRPC.TL_photo tL_photo5 = photo instanceof TLRPC.TL_photo ? (TLRPC.TL_photo) photo : null;
                        if (tL_photo5 == null) {
                            File file10 = new File(b8.z(4), Utilities.a(pzVar5.l.C) + "." + hc.B(pzVar5.l.C, "jpg"));
                            if (!file10.exists() || file10.length() == 0) {
                                uri3 = null;
                            } else {
                                qz C2 = C(cVar2.a);
                                String file11 = file10.toString();
                                uri3 = null;
                                tL_photo5 = C2.A(file11, null, false);
                                if (tL_photo5 != null) {
                                    z24 = false;
                                    if (tL_photo5 == null) {
                                        File file12 = new File(b8.z(4), Utilities.a(pzVar5.l.D) + "." + hc.B(pzVar5.l.D, "jpg"));
                                        if (file12.exists()) {
                                            tL_photo5 = C(cVar2.a).A(file12.toString(), uri3, false);
                                        }
                                        if (tL_photo5 == null) {
                                            tL_photo5 = new TLRPC.TL_photo();
                                            tL_photo5.date = ConnectionsManager.getInstance(cVar2.a).getCurrentTime();
                                            tL_photo5.file_reference = new byte[0];
                                            TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                                            hf hfVar4 = pzVar5.l;
                                            tL_photoSize2.w = hfVar4.E;
                                            tL_photoSize2.h = hfVar4.F;
                                            tL_photoSize2.size = 0;
                                            tL_photoSize2.location = new TLRPC.TL_fileLocationUnavailable();
                                            tL_photoSize2.type = "x";
                                            tL_photo5.sizes.add(tL_photoSize2);
                                        }
                                    }
                                }
                            }
                            z24 = true;
                            if (tL_photo5 == null) {
                            }
                        } else {
                            uri3 = null;
                            z24 = true;
                        }
                        final HashMap hashMap9 = new HashMap();
                        String str61 = pzVar5.l.C;
                        if (str61 != null) {
                            hashMap9.put("originalPath", str61);
                        }
                        if (z11) {
                            int i41 = i12 + 1;
                            StringBuilder sb2 = new StringBuilder("");
                            j22 = j27;
                            sb2.append(j22);
                            hashMap9.put("groupId", sb2.toString());
                            if (z15) {
                                i32 = i13;
                            } else {
                                if (iVar == null && i41 == 10) {
                                    i32 = i13;
                                } else {
                                    i32 = i13;
                                }
                                hashMap9.put("final", "1");
                                i12 = i41;
                                j26 = 0;
                            }
                            i12 = i41;
                        } else {
                            j22 = j27;
                            i32 = i13;
                        }
                        final TLRPC.TL_photo tL_photo6 = tL_photo5;
                        i15 = i32;
                        final boolean z35 = z24;
                        j15 = j22;
                        cVar2 = cVar;
                        i0.g3(new Runnable() { // from class: org.telegram.messenger.ny
                            @Override // java.lang.Runnable
                            public final void run() {
                                jj jjVar4 = jj.this;
                                TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                c cVar3 = cVar;
                                TLRPC.TL_photo tL_photo7 = tL_photo6;
                                boolean z36 = z35;
                                pz pzVar6 = pzVar5;
                                HashMap hashMap10 = hashMap9;
                                if (jjVar4 != null || tL_inputPollAnswer2 != null) {
                                    qz.C(cVar3.a).t(jjVar4, tL_inputPollAnswer2, tL_photo7, null, null, z36 ? pzVar6.l.C : null, null, hashMap10, false, pzVar6.u, null);
                                    return;
                                }
                                oz c11 = oz.c(null, pzVar6.d, null, tL_photo7, null, null, null, null, null, null, j10, z36 ? pzVar6.l.C : null, jjVar2, jjVar3, null, true, null, pzVar6.i, null, hashMap10, z13, i10, i11, pzVar6.h, null, null, false, pzVar6.u);
                                c11.H = storyItem;
                                c11.J = knVar;
                                c11.K = swVar;
                                c11.O = j12;
                                c11.L = z14;
                                c11.Q = j13;
                                c11.R = j14;
                                c11.T = ojVar;
                                c11.k = pzVar6.B;
                                c11.j = iVar;
                                qz.C(cVar3.a).r0(c11);
                            }
                        });
                        i39 = i12;
                        arrayList8 = arrayList2;
                        z19 = z34;
                        str8 = str4;
                        arrayList9 = arrayList13;
                        arrayList10 = arrayList14;
                        arrayList11 = arrayList15;
                        str10 = str10;
                        str9 = str9;
                        i16 = i14;
                        i40 = i15 + 1;
                        size2 = i16;
                        j24 = j16;
                        C = z19;
                        str = str10;
                        str2 = str9;
                        hashMap = hashMap3;
                        str57 = str7;
                        j25 = j15;
                        str4 = str8;
                        arrayList7 = arrayList;
                    }
                } else {
                    str5 = str;
                    str6 = str2;
                    str7 = str57;
                    j15 = j25;
                    i15 = i13;
                    hashMap3 = hashMap2;
                    j16 = 0;
                    z18 = C;
                    if ((pzVar5.o && pzVar5.k == null) || (pzVar5.p && pzVar5.q)) {
                        String str62 = pzVar5.c;
                        if (str62 != null || (uri2 = pzVar5.a) == null) {
                            str28 = str62;
                            str29 = str28;
                        } else {
                            str29 = (Build.VERSION.SDK_INT < 30 || !"content".equals(uri2.getScheme())) ? i0.T0(pzVar5.a) : null;
                            str28 = pzVar5.a.toString();
                        }
                        if (tVar == null || pzVar5.a == null || !tVar.B().hasMimeType("image/png")) {
                            obj12 = "masks";
                            str30 = str28;
                            str31 = str7;
                            str32 = str6;
                        } else {
                            try {
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                InputStream openInputStream = w0.b.getContentResolver().openInputStream(pzVar5.a);
                                try {
                                    Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                                    StringBuilder sb3 = new StringBuilder();
                                    str32 = str6;
                                    try {
                                        sb3.append(str32);
                                        sb3.append(tz.p());
                                        str31 = str7;
                                        try {
                                            sb3.append(str31);
                                            obj12 = "masks";
                                            try {
                                                str30 = str28;
                                                try {
                                                    File file13 = new File(b8.z(4), sb3.toString());
                                                    fileOutputStream = new FileOutputStream(file13);
                                                    try {
                                                        decodeStream.compress(Bitmap.CompressFormat.WEBP, 100, fileOutputStream);
                                                        tz.y();
                                                        pzVar5.a = Uri.fromFile(file13);
                                                        if (openInputStream != null) {
                                                            try {
                                                                openInputStream.close();
                                                            } catch (Exception unused) {
                                                            }
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        inputStream = openInputStream;
                                                        try {
                                                            f8.f(th);
                                                            if (inputStream != null) {
                                                                try {
                                                                    inputStream.close();
                                                                } catch (Exception unused2) {
                                                                }
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    inputStream = openInputStream;
                                                    fileOutputStream = null;
                                                    f8.f(th);
                                                    if (inputStream != null) {
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                str30 = str28;
                                                inputStream = openInputStream;
                                                fileOutputStream = null;
                                                f8.f(th);
                                                if (inputStream != null) {
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            obj12 = "masks";
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        obj12 = "masks";
                                        str30 = str28;
                                        str31 = str7;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    obj12 = "masks";
                                    str30 = str28;
                                    str31 = str7;
                                    str32 = str6;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                obj12 = "masks";
                                str30 = str28;
                                str31 = str7;
                                str32 = str6;
                                fileOutputStream = null;
                                inputStream = null;
                            }
                            try {
                                fileOutputStream.close();
                            } catch (Exception unused3) {
                            }
                        }
                        if (!z10) {
                            if (!hc.d0(pzVar5.a, pzVar5.c)) {
                                if (pzVar5.s || str29 == null) {
                                    str33 = str3;
                                } else {
                                    str33 = str3;
                                    if ((str29.endsWith(str33) || str29.endsWith(str31)) && pzVar5.h <= 0) {
                                        str58 = str29.endsWith(str33) ? "gif" : "webp";
                                        str7 = str31;
                                        str34 = str29;
                                        str35 = str30;
                                        z23 = true;
                                        if (z23) {
                                            if (arrayList2 == null) {
                                                arrayList8 = new ArrayList();
                                                arrayList9 = new ArrayList();
                                                arrayList11 = new ArrayList();
                                                arrayList12 = new ArrayList();
                                                arrayList6 = new ArrayList();
                                            } else {
                                                arrayList8 = arrayList2;
                                                arrayList9 = arrayList13;
                                                arrayList6 = arrayList14;
                                                arrayList11 = arrayList15;
                                            }
                                            ArrayList arrayList16 = arrayList12;
                                            arrayList8.add(str34);
                                            arrayList9.add(str35);
                                            arrayList6.add(pzVar5.a);
                                            arrayList11.add(pzVar5.d);
                                            arrayList16.add(pzVar5.i);
                                            arrayList12 = arrayList16;
                                            str3 = str33;
                                            str9 = str32;
                                            z19 = z18;
                                            str8 = str4;
                                            str10 = str5;
                                            i16 = i14;
                                            arrayList10 = arrayList6;
                                        } else {
                                            if (str34 != null) {
                                                File file14 = new File(str34);
                                                StringBuilder t11 = a1.g.t(str35);
                                                t11.append(file14.length());
                                                String str63 = str4;
                                                t11.append(str63);
                                                str36 = str63;
                                                t11.append(file14.lastModified());
                                                str37 = t11.toString();
                                            } else {
                                                str36 = str4;
                                                str37 = null;
                                            }
                                            if (hashMap3 != null) {
                                                nz nzVar3 = (nz) hashMap3.get(pzVar5);
                                                TLRPC.TL_photo tL_photo7 = nzVar3.a;
                                                str41 = nzVar3.b;
                                                if (tL_photo7 == null) {
                                                    try {
                                                        nzVar3.c.await();
                                                    } catch (Exception e12) {
                                                        f8.f(e12);
                                                    }
                                                    tL_photo7 = nzVar3.a;
                                                    str41 = nzVar3.b;
                                                }
                                                hashMap3 = hashMap3;
                                                obj13 = "1";
                                                obj14 = "groupId";
                                                str3 = str33;
                                                str9 = str32;
                                                obj15 = obj12;
                                                str8 = str36;
                                                tL_photo2 = tL_photo7;
                                                str38 = str34;
                                                obj16 = "final";
                                                obj17 = "originalPath";
                                                i26 = 1;
                                                str39 = str37;
                                            } else {
                                                if (z18 || pzVar5.h != 0 || z12) {
                                                    hashMap3 = hashMap3;
                                                    obj13 = "1";
                                                    obj14 = "groupId";
                                                    str3 = str33;
                                                    str9 = str32;
                                                    obj15 = obj12;
                                                    str8 = str36;
                                                    str38 = str34;
                                                    obj16 = "final";
                                                    obj17 = "originalPath";
                                                    i26 = 1;
                                                    str39 = str37;
                                                    str40 = null;
                                                    tL_photo = null;
                                                } else {
                                                    int i42 = pzVar5.x ? !z18 ? 6 : 7 : !z18 ? 0 : 3;
                                                    Object[] g05 = hs.a0(cVar2.a).g0(i42, str37);
                                                    if (g05 != null) {
                                                        Object obj25 = g05[0];
                                                        str42 = str37;
                                                        if (obj25 instanceof TLRPC.TL_photo) {
                                                            tL_photo3 = (TLRPC.TL_photo) obj25;
                                                            i27 = 1;
                                                            str43 = (String) g05[1];
                                                            if (tL_photo3 == null && pzVar5.a != null && (g02 = hs.a0(cVar2.a).g0(i42, i0.T0(pzVar5.a))) != null) {
                                                                obj18 = g02[0];
                                                                if (obj18 instanceof TLRPC.TL_photo) {
                                                                    tL_photo3 = (TLRPC.TL_photo) obj18;
                                                                    str40 = (String) g02[i27];
                                                                    hashMap3 = hashMap3;
                                                                    str3 = str33;
                                                                    str9 = str32;
                                                                    obj15 = obj12;
                                                                    obj14 = "groupId";
                                                                    str8 = str36;
                                                                    str38 = str34;
                                                                    tL_photo = tL_photo3;
                                                                    obj17 = "originalPath";
                                                                    str39 = str42;
                                                                    obj16 = "final";
                                                                    i26 = i27;
                                                                    obj13 = "1";
                                                                    cVar2 = cVar;
                                                                    w(cVar2, z18, tL_photo, pzVar5.c, pzVar5.a, 0L, false);
                                                                }
                                                            }
                                                            str40 = str43;
                                                            hashMap3 = hashMap3;
                                                            str3 = str33;
                                                            str9 = str32;
                                                            obj15 = obj12;
                                                            obj14 = "groupId";
                                                            str8 = str36;
                                                            str38 = str34;
                                                            tL_photo = tL_photo3;
                                                            obj17 = "originalPath";
                                                            str39 = str42;
                                                            obj16 = "final";
                                                            i26 = i27;
                                                            obj13 = "1";
                                                            cVar2 = cVar;
                                                            w(cVar2, z18, tL_photo, pzVar5.c, pzVar5.a, 0L, false);
                                                        }
                                                    } else {
                                                        str42 = str37;
                                                    }
                                                    i27 = 1;
                                                    tL_photo3 = null;
                                                    str43 = null;
                                                    if (tL_photo3 == null) {
                                                        obj18 = g02[0];
                                                        if (obj18 instanceof TLRPC.TL_photo) {
                                                        }
                                                    }
                                                    str40 = str43;
                                                    hashMap3 = hashMap3;
                                                    str3 = str33;
                                                    str9 = str32;
                                                    obj15 = obj12;
                                                    obj14 = "groupId";
                                                    str8 = str36;
                                                    str38 = str34;
                                                    tL_photo = tL_photo3;
                                                    obj17 = "originalPath";
                                                    str39 = str42;
                                                    obj16 = "final";
                                                    i26 = i27;
                                                    obj13 = "1";
                                                    cVar2 = cVar;
                                                    w(cVar2, z18, tL_photo, pzVar5.c, pzVar5.a, 0L, false);
                                                }
                                                if (tL_photo == null) {
                                                    TLRPC.TL_photo A = C(cVar2.a).A(pzVar5.c, pzVar5.a, false);
                                                    if (z18 && pzVar5.r) {
                                                        new File(pzVar5.c).delete();
                                                    }
                                                    str41 = str40;
                                                    tL_photo2 = A;
                                                } else {
                                                    str41 = str40;
                                                    tL_photo2 = tL_photo;
                                                }
                                            }
                                            if (tL_photo2 != null) {
                                                final HashMap hashMap10 = new HashMap();
                                                final Bitmap[] bitmapArr = new Bitmap[i26];
                                                final String[] strArr = new String[i26];
                                                ArrayList arrayList17 = pzVar5.j;
                                                boolean z36 = (arrayList17 == null || arrayList17.isEmpty()) ? 0 : i26;
                                                tL_photo2.has_stickers = z36;
                                                if (z36 != 0) {
                                                    SerializedData serializedData = new SerializedData((pzVar5.j.size() * 20) + 4);
                                                    serializedData.writeInt32(pzVar5.j.size());
                                                    for (int i43 = 0; i43 < pzVar5.j.size(); i43++) {
                                                        ((TLRPC.InputDocument) pzVar5.j.get(i43)).serializeToStream(serializedData);
                                                    }
                                                    hashMap10.put(obj15, Utilities.f(serializedData.toByteArray()));
                                                    serializedData.cleanup();
                                                }
                                                if (str39 != null) {
                                                    hashMap10.put(obj17, str39);
                                                }
                                                if (str41 != null) {
                                                    hashMap10.put("parentObject", str41);
                                                }
                                                if (z11) {
                                                    try {
                                                        if (arrayList.size() == i26) {
                                                        }
                                                    } catch (Exception e13) {
                                                        f8.f(e13);
                                                    }
                                                    if (z11) {
                                                        i30 = i14;
                                                        i31 = i15;
                                                        j21 = j15;
                                                        i39 = i12;
                                                    } else {
                                                        i39 = i12 + 1;
                                                        StringBuilder sb4 = new StringBuilder("");
                                                        j21 = j15;
                                                        sb4.append(j21);
                                                        hashMap10.put(obj14, sb4.toString());
                                                        if (z15) {
                                                            i30 = i14;
                                                            i31 = i15;
                                                        } else {
                                                            if (iVar == null && i39 == 10) {
                                                                i30 = i14;
                                                                i31 = i15;
                                                            } else {
                                                                i30 = i14;
                                                                i31 = i15;
                                                            }
                                                            hashMap10.put(obj16, obj13);
                                                            j26 = 0;
                                                        }
                                                    }
                                                    final boolean z37 = pzVar5.x;
                                                    i29 = i31;
                                                    j20 = j21;
                                                    i28 = i30;
                                                    final String str64 = str41;
                                                    cVar2 = cVar;
                                                    i0.g3(new Runnable() { // from class: org.telegram.messenger.py
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            Bitmap[] bitmapArr2 = bitmapArr;
                                                            if (bitmapArr2[0] != null) {
                                                                String[] strArr2 = strArr;
                                                                if (strArr2[0] != null) {
                                                                    hc.D().O(new BitmapDrawable(bitmapArr2[0]), strArr2[0], false);
                                                                }
                                                            }
                                                            jj jjVar4 = jjVar;
                                                            TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                                            c cVar3 = cVar;
                                                            TLRPC.TL_photo tL_photo8 = tL_photo2;
                                                            HashMap hashMap11 = hashMap10;
                                                            pz pzVar6 = pzVar5;
                                                            String str65 = str64;
                                                            if (jjVar4 != null || tL_inputPollAnswer2 != null) {
                                                                qz.C(cVar3.a).t(jjVar4, tL_inputPollAnswer2, tL_photo8, null, null, null, null, hashMap11, false, pzVar6.u, str65);
                                                                return;
                                                            }
                                                            oz c11 = oz.c(null, pzVar6.d, null, tL_photo8, null, null, null, null, null, null, j10, null, jjVar2, jjVar3, null, true, null, pzVar6.i, null, hashMap11, z13, i10, i11, pzVar6.h, str65, null, z16, pzVar6.u);
                                                            c11.H = storyItem;
                                                            c11.J = knVar;
                                                            c11.K = swVar;
                                                            c11.O = j12;
                                                            c11.L = z14;
                                                            c11.P = pzVar6.w;
                                                            c11.k = pzVar6.B;
                                                            c11.Q = j13;
                                                            c11.R = j14;
                                                            c11.T = ojVar;
                                                            c11.S = z37;
                                                            c11.j = iVar;
                                                            qz.C(cVar3.a).r0(c11);
                                                        }
                                                    });
                                                    z19 = z18;
                                                    arrayList8 = arrayList2;
                                                    arrayList9 = arrayList13;
                                                    arrayList10 = arrayList14;
                                                    arrayList11 = arrayList15;
                                                }
                                                TLRPC.PhotoSize u10 = b8.u(i0.Z0(pzVar5.x), tL_photo2.sizes);
                                                if (u10 != null) {
                                                    strArr[0] = D(cVar2, u10, bitmapArr, false, false);
                                                }
                                                if (z11) {
                                                }
                                                final boolean z372 = pzVar5.x;
                                                i29 = i31;
                                                j20 = j21;
                                                i28 = i30;
                                                final String str642 = str41;
                                                cVar2 = cVar;
                                                i0.g3(new Runnable() { // from class: org.telegram.messenger.py
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        Bitmap[] bitmapArr2 = bitmapArr;
                                                        if (bitmapArr2[0] != null) {
                                                            String[] strArr2 = strArr;
                                                            if (strArr2[0] != null) {
                                                                hc.D().O(new BitmapDrawable(bitmapArr2[0]), strArr2[0], false);
                                                            }
                                                        }
                                                        jj jjVar4 = jjVar;
                                                        TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                                        c cVar3 = cVar;
                                                        TLRPC.TL_photo tL_photo8 = tL_photo2;
                                                        HashMap hashMap11 = hashMap10;
                                                        pz pzVar6 = pzVar5;
                                                        String str65 = str642;
                                                        if (jjVar4 != null || tL_inputPollAnswer2 != null) {
                                                            qz.C(cVar3.a).t(jjVar4, tL_inputPollAnswer2, tL_photo8, null, null, null, null, hashMap11, false, pzVar6.u, str65);
                                                            return;
                                                        }
                                                        oz c11 = oz.c(null, pzVar6.d, null, tL_photo8, null, null, null, null, null, null, j10, null, jjVar2, jjVar3, null, true, null, pzVar6.i, null, hashMap11, z13, i10, i11, pzVar6.h, str65, null, z16, pzVar6.u);
                                                        c11.H = storyItem;
                                                        c11.J = knVar;
                                                        c11.K = swVar;
                                                        c11.O = j12;
                                                        c11.L = z14;
                                                        c11.P = pzVar6.w;
                                                        c11.k = pzVar6.B;
                                                        c11.Q = j13;
                                                        c11.R = j14;
                                                        c11.T = ojVar;
                                                        c11.S = z372;
                                                        c11.j = iVar;
                                                        qz.C(cVar3.a).r0(c11);
                                                    }
                                                });
                                                z19 = z18;
                                                arrayList8 = arrayList2;
                                                arrayList9 = arrayList13;
                                                arrayList10 = arrayList14;
                                                arrayList11 = arrayList15;
                                            } else {
                                                String str65 = str9;
                                                i28 = i14;
                                                i29 = i15;
                                                j20 = j15;
                                                if (arrayList2 == null) {
                                                    arrayList8 = new ArrayList();
                                                    arrayList9 = new ArrayList();
                                                    arrayList5 = new ArrayList();
                                                    arrayList12 = new ArrayList();
                                                    arrayList10 = new ArrayList();
                                                } else {
                                                    arrayList8 = arrayList2;
                                                    arrayList9 = arrayList13;
                                                    arrayList10 = arrayList14;
                                                    arrayList5 = arrayList15;
                                                }
                                                ArrayList arrayList18 = arrayList12;
                                                arrayList8.add(str38);
                                                arrayList9.add(str39);
                                                arrayList10.add(pzVar5.a);
                                                arrayList5.add(pzVar5.d);
                                                arrayList18.add(pzVar5.i);
                                                arrayList11 = arrayList5;
                                                str9 = str65;
                                                arrayList12 = arrayList18;
                                                i39 = i12;
                                                z19 = z18;
                                            }
                                            str10 = str5;
                                            i16 = i28;
                                            i15 = i29;
                                            j15 = j20;
                                            i40 = i15 + 1;
                                            size2 = i16;
                                            j24 = j16;
                                            C = z19;
                                            str = str10;
                                            str2 = str9;
                                            hashMap = hashMap3;
                                            str57 = str7;
                                            j25 = j15;
                                            str4 = str8;
                                            arrayList7 = arrayList;
                                        }
                                    }
                                }
                                if (pzVar5.s || str29 != null || (uri = pzVar5.a) == null) {
                                    str7 = str31;
                                } else {
                                    str7 = str31;
                                    if (MediaController.G(uri)) {
                                        String uri6 = pzVar5.a.toString();
                                        str58 = "gif";
                                        str34 = MediaController.t(-1L, pzVar5.a, "gif");
                                        z23 = true;
                                        str35 = uri6;
                                        if (z23) {
                                        }
                                    } else if (MediaController.M(pzVar5.a)) {
                                        str35 = pzVar5.a.toString();
                                        str58 = "webp";
                                        str34 = MediaController.t(-1L, pzVar5.a, "webp");
                                        z23 = true;
                                        if (z23) {
                                        }
                                    }
                                }
                                str34 = str29;
                                str35 = str30;
                                z23 = false;
                                if (z23) {
                                }
                            }
                        }
                        str7 = str31;
                        str33 = str3;
                        str58 = str29 != null ? b8.D(new File(str29)) : "";
                        str34 = str29;
                        str35 = str30;
                        z23 = true;
                        if (z23) {
                        }
                    } else {
                        str8 = str4;
                        if (z10) {
                            x20 x20Var5 = pzVar5.k;
                            if (x20Var5 == null) {
                                x20Var5 = n(pzVar5.z, pzVar5.c);
                            }
                            x20Var = x20Var5;
                        } else {
                            x20Var = null;
                        }
                        if ((!z10 || (x20Var == null && !pzVar5.c.endsWith("mp4"))) && !pzVar5.p) {
                            str9 = str6;
                            z19 = z18;
                            str10 = str5;
                            i16 = i14;
                            i15 = i15;
                            j15 = j15;
                            if (arrayList2 != null) {
                                arrayList8 = new ArrayList();
                                arrayList3 = new ArrayList();
                                arrayList11 = new ArrayList();
                                arrayList12 = new ArrayList();
                                arrayList10 = new ArrayList();
                            } else {
                                arrayList8 = arrayList2;
                                arrayList3 = arrayList13;
                                arrayList10 = arrayList14;
                                arrayList11 = arrayList15;
                            }
                            ArrayList arrayList19 = arrayList12;
                            arrayList8.add(pzVar5.c);
                            arrayList3.add(pzVar5.c);
                            arrayList10.add(pzVar5.a);
                            arrayList11.add(pzVar5.d);
                            arrayList19.add(pzVar5.i);
                            arrayList9 = arrayList3;
                            arrayList12 = arrayList19;
                        } else {
                            if (pzVar5.c == null && (hfVar2 = pzVar5.l) != null) {
                                if (hfVar2.K instanceof TLRPC.TL_photo) {
                                    b8.G(cVar2.a);
                                    pzVar5.c = b8.L(pzVar5.l.K, true).getAbsolutePath();
                                } else {
                                    pzVar5.c = new File(b8.z(4), Utilities.a(pzVar5.l.C) + "." + hc.B(pzVar5.l.C, "jpg")).getAbsolutePath();
                                }
                            }
                            String str66 = pzVar5.c;
                            File file15 = new File(str66);
                            StringBuilder t12 = a1.g.t(str66);
                            t12.append(file15.length());
                            t12.append(str8);
                            t12.append(file15.lastModified());
                            String sb5 = t12.toString();
                            if (x20Var != null) {
                                boolean z38 = x20Var.t;
                                StringBuilder t13 = a1.g.t(sb5);
                                t13.append(x20Var.r);
                                t13.append(str8);
                                t13.append(x20Var.a);
                                t13.append(str8);
                                t13.append(x20Var.b);
                                t13.append(x20Var.t ? "_m" : "");
                                sb5 = t13.toString();
                                if (x20Var.k != x20Var.h) {
                                    StringBuilder i44 = sc.e.i(sb5, str8);
                                    i44.append(x20Var.k);
                                    sb5 = i44.toString();
                                }
                                long j28 = x20Var.a;
                                if (j28 < 0) {
                                    j28 = 0;
                                }
                                z20 = z38;
                                j17 = j28;
                            } else {
                                j17 = 0;
                                z20 = false;
                            }
                            String str67 = sb5;
                            if (!z18 && pzVar5.h == 0 && !z12 && (x20Var == null || (x20Var.A == null && x20Var.B == null && x20Var.G == null && x20Var.H == null))) {
                                Object[] g06 = hs.a0(cVar2.a).g0(!z18 ? 2 : 5, str67);
                                if (g06 != null) {
                                    Object obj26 = g06[0];
                                    if (obj26 instanceof TLRPC.TL_document) {
                                        tL_document = (TLRPC.TL_document) obj26;
                                        String str68 = (String) g06[1];
                                        file = file15;
                                        str11 = str67;
                                        obj = "groupId";
                                        str12 = "video/mp4";
                                        z21 = z18;
                                        str13 = str8;
                                        str14 = "";
                                        x20Var2 = x20Var;
                                        str15 = ".";
                                        j18 = j17;
                                        str16 = str66;
                                        w(cVar2, z21, tL_document, pzVar5.c, null, j18, false);
                                        str17 = str68;
                                        if (tL_document != null) {
                                            if (pzVar5.c == null || !pzVar5.p) {
                                                z22 = z21;
                                                obj8 = "masks";
                                                str18 = "mp4";
                                                str22 = str5;
                                                c10 = 'a';
                                                str23 = str16;
                                            } else {
                                                File file16 = new File(pzVar5.c);
                                                File z39 = b8.z(4);
                                                StringBuilder sb6 = new StringBuilder(str6);
                                                sb6.append(tz.p());
                                                z22 = z21;
                                                str22 = str5;
                                                sb6.append(str22);
                                                File file17 = new File(z39, sb6.toString());
                                                File file18 = new File(b8.z(4), str6 + tz.p() + ".mp4");
                                                long j29 = pzVar5.z;
                                                try {
                                                    m(j29, file16.length(), file16, file18);
                                                    str23 = file18.getAbsolutePath();
                                                    try {
                                                        pzVar5.c = str23;
                                                        if (TextUtils.isEmpty(pzVar5.b)) {
                                                            m(0L, j29, file16, file17);
                                                            pzVar5.f = file17.getAbsolutePath();
                                                            Pair L02 = i0.L0(file17);
                                                            if (((Integer) L02.first).intValue() != 0 && (decodeFile2 = BitmapFactory.decodeFile(file17.getAbsolutePath())) != null) {
                                                                int intValue2 = ((Integer) L02.second).intValue();
                                                                Matrix matrix2 = new Matrix();
                                                                str27 = str23;
                                                                obj8 = "masks";
                                                                try {
                                                                    str18 = "mp4";
                                                                } catch (Exception e14) {
                                                                    e = e14;
                                                                    str18 = "mp4";
                                                                }
                                                                try {
                                                                    matrix2.postScale(intValue2 == 1 ? -1.0f : 1.0f, intValue2 == 2 ? -1.0f : 1.0f, decodeFile2.getWidth() / 2.0f, decodeFile2.getHeight() / 2.0f);
                                                                    matrix2.postRotate(((Integer) L02.first).intValue());
                                                                    createBitmap = Bitmap.createBitmap(decodeFile2, 0, 0, decodeFile2.getWidth(), decodeFile2.getHeight(), matrix2, true);
                                                                    file2 = new File(b8.z(4), str6 + tz.p() + str22);
                                                                    c10 = 'a';
                                                                } catch (Exception e15) {
                                                                    e = e15;
                                                                    c10 = 'a';
                                                                    str23 = str27;
                                                                    f8.f(e);
                                                                    String str69 = pzVar5.e;
                                                                    if (str69 == null) {
                                                                    }
                                                                    if (decodeFile == null) {
                                                                    }
                                                                    if (decodeFile == null) {
                                                                    }
                                                                    str24 = null;
                                                                    tL_document2 = new TLRPC.TL_document();
                                                                    tL_document2.file_reference = new byte[i23];
                                                                    if (photoSize2 != null) {
                                                                    }
                                                                    x20Var3 = pzVar.k;
                                                                    if (x20Var3 == null) {
                                                                    }
                                                                    tL_document2.mime_type = str12;
                                                                    cVar2.d().v(false);
                                                                    x20Var4 = pzVar.k;
                                                                    if (x20Var4 != null) {
                                                                    }
                                                                    str25 = str13;
                                                                    if (z22) {
                                                                    }
                                                                    tL_document2.attributes.add(tL_documentAttributeVideo);
                                                                    if (x20Var2 != null) {
                                                                    }
                                                                    str10 = str22;
                                                                    str26 = str23;
                                                                    obj11 = obj9;
                                                                    if (file.exists()) {
                                                                    }
                                                                    x(pzVar.c, tL_documentAttributeVideo, null);
                                                                    obj6 = obj10;
                                                                    tL_document = tL_document2;
                                                                    str8 = str25;
                                                                    str20 = str24;
                                                                    obj4 = obj11;
                                                                    str16 = str26;
                                                                    obj2 = obj8;
                                                                    z19 = z22;
                                                                    obj7 = null;
                                                                    q6 = hc.q(pzVar.f);
                                                                    if (q6 == null) {
                                                                    }
                                                                    if (x20Var2 != null) {
                                                                    }
                                                                    if (x20Var2 != null) {
                                                                    }
                                                                    final String str70 = str20;
                                                                    hashMap4 = new HashMap();
                                                                    str21 = str11;
                                                                    if (str21 != null) {
                                                                    }
                                                                    if (pzVar.p) {
                                                                    }
                                                                    if (str17 != null) {
                                                                    }
                                                                    if (z20) {
                                                                    }
                                                                    str9 = str6;
                                                                    i18 = i14;
                                                                    i19 = i15;
                                                                    j19 = j15;
                                                                    i20 = i12;
                                                                    if (!z19) {
                                                                    }
                                                                    j15 = j19;
                                                                    final TLRPC.PhotoSize photoSize3 = q6;
                                                                    final String str71 = str17;
                                                                    final x20 x20Var6 = x20Var2;
                                                                    final Bitmap bitmap2 = bitmap;
                                                                    i15 = i19;
                                                                    final String str72 = str16;
                                                                    i16 = i18;
                                                                    final pz pzVar6 = pzVar;
                                                                    final TLRPC.TL_document tL_document6 = tL_document;
                                                                    cVar2 = cVar;
                                                                    i0.g3(new Runnable() { // from class: org.telegram.messenger.oy
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            String str73;
                                                                            Bitmap bitmap3 = bitmap2;
                                                                            if (bitmap3 != null && (str73 = str70) != null) {
                                                                                hc.D().O(new BitmapDrawable(bitmap3), str73, false);
                                                                            }
                                                                            jj jjVar4 = jjVar;
                                                                            TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                                                            c cVar3 = cVar;
                                                                            x20 x20Var7 = x20Var6;
                                                                            TLRPC.TL_document tL_document7 = tL_document6;
                                                                            String str74 = str72;
                                                                            HashMap hashMap11 = hashMap4;
                                                                            pz pzVar7 = pzVar6;
                                                                            String str75 = str71;
                                                                            if (jjVar4 != null || tL_inputPollAnswer2 != null) {
                                                                                qz.C(cVar3.a).t(jjVar4, tL_inputPollAnswer2, null, x20Var7, tL_document7, str74, null, hashMap11, false, pzVar7.u, str75);
                                                                                return;
                                                                            }
                                                                            oz e16 = oz.e(tL_document7, x20Var7, str74, j10, jjVar2, jjVar3, pzVar7.d, pzVar7.i, hashMap11, z13, i10, i11, pzVar7.h, str75, pzVar7.u);
                                                                            e16.H = storyItem;
                                                                            e16.J = knVar;
                                                                            e16.K = swVar;
                                                                            e16.O = j12;
                                                                            e16.L = z14;
                                                                            e16.P = pzVar7.w;
                                                                            e16.k = pzVar7.B;
                                                                            e16.o = photoSize3;
                                                                            e16.Q = j13;
                                                                            e16.R = j14;
                                                                            e16.T = ojVar;
                                                                            e16.U = pzVar7.p;
                                                                            e16.V = pzVar7.A / 1000;
                                                                            e16.j = iVar;
                                                                            qz.C(cVar3.a).r0(e16);
                                                                        }
                                                                    });
                                                                    arrayList8 = arrayList2;
                                                                    i12 = i20;
                                                                    arrayList9 = arrayList13;
                                                                    arrayList10 = arrayList14;
                                                                    arrayList11 = arrayList15;
                                                                    i39 = i12;
                                                                    i40 = i15 + 1;
                                                                    size2 = i16;
                                                                    j24 = j16;
                                                                    C = z19;
                                                                    str = str10;
                                                                    str2 = str9;
                                                                    hashMap = hashMap3;
                                                                    str57 = str7;
                                                                    j25 = j15;
                                                                    str4 = str8;
                                                                    arrayList7 = arrayList;
                                                                }
                                                                try {
                                                                    createBitmap.compress(Bitmap.CompressFormat.JPEG, 97, new FileOutputStream(file2));
                                                                    pzVar5.f = file2.getAbsolutePath();
                                                                    file17.delete();
                                                                    str23 = str27;
                                                                } catch (Exception e16) {
                                                                    e = e16;
                                                                    str23 = str27;
                                                                    f8.f(e);
                                                                    String str692 = pzVar5.e;
                                                                    if (str692 == null) {
                                                                    }
                                                                    if (decodeFile == null) {
                                                                    }
                                                                    if (decodeFile == null) {
                                                                    }
                                                                    str24 = null;
                                                                    tL_document2 = new TLRPC.TL_document();
                                                                    tL_document2.file_reference = new byte[i23];
                                                                    if (photoSize2 != null) {
                                                                    }
                                                                    x20Var3 = pzVar.k;
                                                                    if (x20Var3 == null) {
                                                                    }
                                                                    tL_document2.mime_type = str12;
                                                                    cVar2.d().v(false);
                                                                    x20Var4 = pzVar.k;
                                                                    if (x20Var4 != null) {
                                                                    }
                                                                    str25 = str13;
                                                                    if (z22) {
                                                                    }
                                                                    tL_document2.attributes.add(tL_documentAttributeVideo);
                                                                    if (x20Var2 != null) {
                                                                    }
                                                                    str10 = str22;
                                                                    str26 = str23;
                                                                    obj11 = obj9;
                                                                    if (file.exists()) {
                                                                    }
                                                                    x(pzVar.c, tL_documentAttributeVideo, null);
                                                                    obj6 = obj10;
                                                                    tL_document = tL_document2;
                                                                    str8 = str25;
                                                                    str20 = str24;
                                                                    obj4 = obj11;
                                                                    str16 = str26;
                                                                    obj2 = obj8;
                                                                    z19 = z22;
                                                                    obj7 = null;
                                                                    q6 = hc.q(pzVar.f);
                                                                    if (q6 == null) {
                                                                    }
                                                                    if (x20Var2 != null) {
                                                                    }
                                                                    if (x20Var2 != null) {
                                                                    }
                                                                    final String str702 = str20;
                                                                    hashMap4 = new HashMap();
                                                                    str21 = str11;
                                                                    if (str21 != null) {
                                                                    }
                                                                    if (pzVar.p) {
                                                                    }
                                                                    if (str17 != null) {
                                                                    }
                                                                    if (z20) {
                                                                    }
                                                                    str9 = str6;
                                                                    i18 = i14;
                                                                    i19 = i15;
                                                                    j19 = j15;
                                                                    i20 = i12;
                                                                    if (!z19) {
                                                                    }
                                                                    j15 = j19;
                                                                    final TLRPC.PhotoSize photoSize32 = q6;
                                                                    final String str712 = str17;
                                                                    final x20 x20Var62 = x20Var2;
                                                                    final Bitmap bitmap22 = bitmap;
                                                                    i15 = i19;
                                                                    final String str722 = str16;
                                                                    i16 = i18;
                                                                    final pz pzVar62 = pzVar;
                                                                    final TLRPC.TL_document tL_document62 = tL_document;
                                                                    cVar2 = cVar;
                                                                    i0.g3(new Runnable() { // from class: org.telegram.messenger.oy
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            String str73;
                                                                            Bitmap bitmap3 = bitmap22;
                                                                            if (bitmap3 != null && (str73 = str702) != null) {
                                                                                hc.D().O(new BitmapDrawable(bitmap3), str73, false);
                                                                            }
                                                                            jj jjVar4 = jjVar;
                                                                            TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                                                            c cVar3 = cVar;
                                                                            x20 x20Var7 = x20Var62;
                                                                            TLRPC.TL_document tL_document7 = tL_document62;
                                                                            String str74 = str722;
                                                                            HashMap hashMap11 = hashMap4;
                                                                            pz pzVar7 = pzVar62;
                                                                            String str75 = str712;
                                                                            if (jjVar4 != null || tL_inputPollAnswer2 != null) {
                                                                                qz.C(cVar3.a).t(jjVar4, tL_inputPollAnswer2, null, x20Var7, tL_document7, str74, null, hashMap11, false, pzVar7.u, str75);
                                                                                return;
                                                                            }
                                                                            oz e162 = oz.e(tL_document7, x20Var7, str74, j10, jjVar2, jjVar3, pzVar7.d, pzVar7.i, hashMap11, z13, i10, i11, pzVar7.h, str75, pzVar7.u);
                                                                            e162.H = storyItem;
                                                                            e162.J = knVar;
                                                                            e162.K = swVar;
                                                                            e162.O = j12;
                                                                            e162.L = z14;
                                                                            e162.P = pzVar7.w;
                                                                            e162.k = pzVar7.B;
                                                                            e162.o = photoSize32;
                                                                            e162.Q = j13;
                                                                            e162.R = j14;
                                                                            e162.T = ojVar;
                                                                            e162.U = pzVar7.p;
                                                                            e162.V = pzVar7.A / 1000;
                                                                            e162.j = iVar;
                                                                            qz.C(cVar3.a).r0(e162);
                                                                        }
                                                                    });
                                                                    arrayList8 = arrayList2;
                                                                    i12 = i20;
                                                                    arrayList9 = arrayList13;
                                                                    arrayList10 = arrayList14;
                                                                    arrayList11 = arrayList15;
                                                                    i39 = i12;
                                                                    i40 = i15 + 1;
                                                                    size2 = i16;
                                                                    j24 = j16;
                                                                    C = z19;
                                                                    str = str10;
                                                                    str2 = str9;
                                                                    hashMap = hashMap3;
                                                                    str57 = str7;
                                                                    j25 = j15;
                                                                    str4 = str8;
                                                                    arrayList7 = arrayList;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                pzVar5.f = pzVar5.b;
                                                            } catch (Exception e17) {
                                                                e = e17;
                                                                obj8 = "masks";
                                                                str18 = "mp4";
                                                                c10 = 'a';
                                                                f8.f(e);
                                                                String str6922 = pzVar5.e;
                                                                if (str6922 == null) {
                                                                }
                                                                if (decodeFile == null) {
                                                                    decodeFile = r(1, pzVar5.c);
                                                                }
                                                                if (decodeFile == null) {
                                                                }
                                                                str24 = null;
                                                                tL_document2 = new TLRPC.TL_document();
                                                                tL_document2.file_reference = new byte[i23];
                                                                if (photoSize2 != null) {
                                                                }
                                                                x20Var3 = pzVar.k;
                                                                if (x20Var3 == null) {
                                                                }
                                                                tL_document2.mime_type = str12;
                                                                cVar2.d().v(false);
                                                                x20Var4 = pzVar.k;
                                                                if (x20Var4 != null) {
                                                                }
                                                                str25 = str13;
                                                                if (z22) {
                                                                }
                                                                tL_document2.attributes.add(tL_documentAttributeVideo);
                                                                if (x20Var2 != null) {
                                                                }
                                                                str10 = str22;
                                                                str26 = str23;
                                                                obj11 = obj9;
                                                                if (file.exists()) {
                                                                }
                                                                x(pzVar.c, tL_documentAttributeVideo, null);
                                                                obj6 = obj10;
                                                                tL_document = tL_document2;
                                                                str8 = str25;
                                                                str20 = str24;
                                                                obj4 = obj11;
                                                                str16 = str26;
                                                                obj2 = obj8;
                                                                z19 = z22;
                                                                obj7 = null;
                                                                q6 = hc.q(pzVar.f);
                                                                if (q6 == null) {
                                                                }
                                                                if (x20Var2 != null) {
                                                                }
                                                                if (x20Var2 != null) {
                                                                }
                                                                final String str7022 = str20;
                                                                hashMap4 = new HashMap();
                                                                str21 = str11;
                                                                if (str21 != null) {
                                                                }
                                                                if (pzVar.p) {
                                                                }
                                                                if (str17 != null) {
                                                                }
                                                                if (z20) {
                                                                }
                                                                str9 = str6;
                                                                i18 = i14;
                                                                i19 = i15;
                                                                j19 = j15;
                                                                i20 = i12;
                                                                if (!z19) {
                                                                }
                                                                j15 = j19;
                                                                final TLRPC.PhotoSize photoSize322 = q6;
                                                                final String str7122 = str17;
                                                                final x20 x20Var622 = x20Var2;
                                                                final Bitmap bitmap222 = bitmap;
                                                                i15 = i19;
                                                                final String str7222 = str16;
                                                                i16 = i18;
                                                                final pz pzVar622 = pzVar;
                                                                final TLRPC.TL_document tL_document622 = tL_document;
                                                                cVar2 = cVar;
                                                                i0.g3(new Runnable() { // from class: org.telegram.messenger.oy
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        String str73;
                                                                        Bitmap bitmap3 = bitmap222;
                                                                        if (bitmap3 != null && (str73 = str7022) != null) {
                                                                            hc.D().O(new BitmapDrawable(bitmap3), str73, false);
                                                                        }
                                                                        jj jjVar4 = jjVar;
                                                                        TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                                                        c cVar3 = cVar;
                                                                        x20 x20Var7 = x20Var622;
                                                                        TLRPC.TL_document tL_document7 = tL_document622;
                                                                        String str74 = str7222;
                                                                        HashMap hashMap11 = hashMap4;
                                                                        pz pzVar7 = pzVar622;
                                                                        String str75 = str7122;
                                                                        if (jjVar4 != null || tL_inputPollAnswer2 != null) {
                                                                            qz.C(cVar3.a).t(jjVar4, tL_inputPollAnswer2, null, x20Var7, tL_document7, str74, null, hashMap11, false, pzVar7.u, str75);
                                                                            return;
                                                                        }
                                                                        oz e162 = oz.e(tL_document7, x20Var7, str74, j10, jjVar2, jjVar3, pzVar7.d, pzVar7.i, hashMap11, z13, i10, i11, pzVar7.h, str75, pzVar7.u);
                                                                        e162.H = storyItem;
                                                                        e162.J = knVar;
                                                                        e162.K = swVar;
                                                                        e162.O = j12;
                                                                        e162.L = z14;
                                                                        e162.P = pzVar7.w;
                                                                        e162.k = pzVar7.B;
                                                                        e162.o = photoSize322;
                                                                        e162.Q = j13;
                                                                        e162.R = j14;
                                                                        e162.T = ojVar;
                                                                        e162.U = pzVar7.p;
                                                                        e162.V = pzVar7.A / 1000;
                                                                        e162.j = iVar;
                                                                        qz.C(cVar3.a).r0(e162);
                                                                    }
                                                                });
                                                                arrayList8 = arrayList2;
                                                                i12 = i20;
                                                                arrayList9 = arrayList13;
                                                                arrayList10 = arrayList14;
                                                                arrayList11 = arrayList15;
                                                                i39 = i12;
                                                                i40 = i15 + 1;
                                                                size2 = i16;
                                                                j24 = j16;
                                                                C = z19;
                                                                str = str10;
                                                                str2 = str9;
                                                                hashMap = hashMap3;
                                                                str57 = str7;
                                                                j25 = j15;
                                                                str4 = str8;
                                                                arrayList7 = arrayList;
                                                            }
                                                        }
                                                        str27 = str23;
                                                        obj8 = "masks";
                                                        str18 = "mp4";
                                                        c10 = 'a';
                                                        str23 = str27;
                                                    } catch (Exception e18) {
                                                        e = e18;
                                                    }
                                                } catch (Exception e19) {
                                                    e = e19;
                                                    obj8 = "masks";
                                                    str18 = "mp4";
                                                    c10 = 'a';
                                                    str23 = str16;
                                                }
                                            }
                                            String str69222 = pzVar5.e;
                                            decodeFile = str69222 == null ? BitmapFactory.decodeFile(str69222) : null;
                                            if (decodeFile == null && (decodeFile = s(pzVar5.c, j18, null, false)) == null) {
                                                decodeFile = r(1, pzVar5.c);
                                            }
                                            if (decodeFile == null) {
                                                int max = (z22 || pzVar5.h != 0) ? 90 : Math.max(decodeFile.getWidth(), decodeFile.getHeight());
                                                float f11 = max;
                                                pzVar = pzVar5;
                                                obj3 = "originalPath";
                                                str19 = str15;
                                                obj5 = "final";
                                                bitmap = decodeFile;
                                                obj9 = "parentObject";
                                                obj10 = "1";
                                                photoSize2 = hc.b0(null, bitmap, (x20Var2 == null || !x20Var2.N) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP, f11, f11, max > 90 ? 80 : 55, z22, 0, 0, false);
                                                if (photoSize2 == null || photoSize2.location == null) {
                                                    i23 = 0;
                                                } else {
                                                    i23 = 0;
                                                    str24 = D(cVar2, photoSize2, null, true, false);
                                                    tL_document2 = new TLRPC.TL_document();
                                                    tL_document2.file_reference = new byte[i23];
                                                    if (photoSize2 != null) {
                                                        tL_document2.thumbs.add(photoSize2);
                                                        tL_document2.flags |= 1;
                                                    }
                                                    x20Var3 = pzVar.k;
                                                    if (x20Var3 == null && x20Var3.N) {
                                                        tL_document2.mime_type = "video/webm";
                                                    } else {
                                                        tL_document2.mime_type = str12;
                                                    }
                                                    cVar2.d().v(false);
                                                    x20Var4 = pzVar.k;
                                                    if (x20Var4 != null && x20Var4.N) {
                                                        tL_document2.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                                        TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                                                        tL_documentAttributeSticker.alt = "👍";
                                                        tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                                                        tL_document2.attributes.add(tL_documentAttributeSticker);
                                                        if (photoSize2 != null && (fileLocation = photoSize2.location) != null) {
                                                            Locale locale = Locale.US;
                                                            long j30 = fileLocation.volume_id;
                                                            int i45 = fileLocation.local_id;
                                                            StringBuilder sb7 = new StringBuilder();
                                                            sb7.append(j30);
                                                            str25 = str13;
                                                            sb7.append(str25);
                                                            sb7.append(i45);
                                                            sb7.append("@b1");
                                                            str24 = sb7.toString();
                                                            if (z22) {
                                                                tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo_layer159();
                                                            } else {
                                                                tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                                                                tL_documentAttributeVideo.supports_streaming = true;
                                                            }
                                                            tL_document2.attributes.add(tL_documentAttributeVideo);
                                                            if (x20Var2 != null || (!x20Var2.c() && pzVar.o)) {
                                                                str10 = str22;
                                                                str26 = str23;
                                                                obj11 = obj9;
                                                                if (file.exists()) {
                                                                    tL_document2.size = (int) file.length();
                                                                }
                                                                x(pzVar.c, tL_documentAttributeVideo, null);
                                                            } else {
                                                                if (pzVar.o && x20Var2.t) {
                                                                    x(pzVar.c, tL_documentAttributeVideo, x20Var2);
                                                                    x20Var2.h = tL_documentAttributeVideo.w;
                                                                    x20Var2.i = tL_documentAttributeVideo.h;
                                                                    obj11 = obj9;
                                                                } else {
                                                                    obj11 = obj9;
                                                                    tL_documentAttributeVideo.duration = (int) (x20Var2.r / 1000);
                                                                }
                                                                int i46 = x20Var2.g;
                                                                ye yeVar = x20Var2.H;
                                                                if (yeVar != null) {
                                                                    str10 = str22;
                                                                    i24 = yeVar.i;
                                                                    i25 = yeVar.j;
                                                                } else {
                                                                    str10 = str22;
                                                                    i24 = x20Var2.k;
                                                                    i25 = x20Var2.l;
                                                                }
                                                                str26 = str23;
                                                                if (i46 == 90 || i46 == 270) {
                                                                    tL_documentAttributeVideo.w = i25;
                                                                    tL_documentAttributeVideo.h = i24;
                                                                } else {
                                                                    tL_documentAttributeVideo.w = i24;
                                                                    tL_documentAttributeVideo.h = i25;
                                                                }
                                                                tL_document2.size = x20Var2.q;
                                                            }
                                                            obj6 = obj10;
                                                            tL_document = tL_document2;
                                                            str8 = str25;
                                                            str20 = str24;
                                                            obj4 = obj11;
                                                            str16 = str26;
                                                            obj2 = obj8;
                                                            z19 = z22;
                                                            obj7 = null;
                                                        }
                                                    }
                                                    str25 = str13;
                                                    if (z22) {
                                                    }
                                                    tL_document2.attributes.add(tL_documentAttributeVideo);
                                                    if (x20Var2 != null) {
                                                    }
                                                    str10 = str22;
                                                    str26 = str23;
                                                    obj11 = obj9;
                                                    if (file.exists()) {
                                                    }
                                                    x(pzVar.c, tL_documentAttributeVideo, null);
                                                    obj6 = obj10;
                                                    tL_document = tL_document2;
                                                    str8 = str25;
                                                    str20 = str24;
                                                    obj4 = obj11;
                                                    str16 = str26;
                                                    obj2 = obj8;
                                                    z19 = z22;
                                                    obj7 = null;
                                                }
                                            } else {
                                                pzVar = pzVar5;
                                                obj3 = "originalPath";
                                                obj9 = "parentObject";
                                                str19 = str15;
                                                obj10 = "1";
                                                obj5 = "final";
                                                i23 = 0;
                                                bitmap = decodeFile;
                                                photoSize2 = null;
                                            }
                                            str24 = null;
                                            tL_document2 = new TLRPC.TL_document();
                                            tL_document2.file_reference = new byte[i23];
                                            if (photoSize2 != null) {
                                            }
                                            x20Var3 = pzVar.k;
                                            if (x20Var3 == null) {
                                            }
                                            tL_document2.mime_type = str12;
                                            cVar2.d().v(false);
                                            x20Var4 = pzVar.k;
                                            if (x20Var4 != null) {
                                                tL_document2.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                                TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker2 = new TLRPC.TL_documentAttributeSticker();
                                                tL_documentAttributeSticker2.alt = "👍";
                                                tL_documentAttributeSticker2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                                                tL_document2.attributes.add(tL_documentAttributeSticker2);
                                                if (photoSize2 != null) {
                                                    Locale locale2 = Locale.US;
                                                    long j302 = fileLocation.volume_id;
                                                    int i452 = fileLocation.local_id;
                                                    StringBuilder sb72 = new StringBuilder();
                                                    sb72.append(j302);
                                                    str25 = str13;
                                                    sb72.append(str25);
                                                    sb72.append(i452);
                                                    sb72.append("@b1");
                                                    str24 = sb72.toString();
                                                    if (z22) {
                                                    }
                                                    tL_document2.attributes.add(tL_documentAttributeVideo);
                                                    if (x20Var2 != null) {
                                                    }
                                                    str10 = str22;
                                                    str26 = str23;
                                                    obj11 = obj9;
                                                    if (file.exists()) {
                                                    }
                                                    x(pzVar.c, tL_documentAttributeVideo, null);
                                                    obj6 = obj10;
                                                    tL_document = tL_document2;
                                                    str8 = str25;
                                                    str20 = str24;
                                                    obj4 = obj11;
                                                    str16 = str26;
                                                    obj2 = obj8;
                                                    z19 = z22;
                                                    obj7 = null;
                                                }
                                            }
                                            str25 = str13;
                                            if (z22) {
                                            }
                                            tL_document2.attributes.add(tL_documentAttributeVideo);
                                            if (x20Var2 != null) {
                                            }
                                            str10 = str22;
                                            str26 = str23;
                                            obj11 = obj9;
                                            if (file.exists()) {
                                            }
                                            x(pzVar.c, tL_documentAttributeVideo, null);
                                            obj6 = obj10;
                                            tL_document = tL_document2;
                                            str8 = str25;
                                            str20 = str24;
                                            obj4 = obj11;
                                            str16 = str26;
                                            obj2 = obj8;
                                            z19 = z22;
                                            obj7 = null;
                                        } else {
                                            boolean z40 = z21;
                                            pzVar = pzVar5;
                                            obj2 = "masks";
                                            str18 = "mp4";
                                            obj3 = "originalPath";
                                            obj4 = "parentObject";
                                            str19 = str15;
                                            obj5 = "final";
                                            str10 = str5;
                                            String str73 = str13;
                                            if (tL_document.thumbs.isEmpty()) {
                                                str8 = str73;
                                                obj6 = "1";
                                                z19 = z40;
                                                obj7 = null;
                                                str20 = null;
                                                bitmap = null;
                                            } else {
                                                String str74 = pzVar.e;
                                                Bitmap decodeFile4 = str74 != null ? BitmapFactory.decodeFile(str74) : null;
                                                if (decodeFile4 == null && (decodeFile4 = s(pzVar.c, j18, null, false)) == null) {
                                                    decodeFile4 = r(1, pzVar.c);
                                                }
                                                bitmap = decodeFile4;
                                                if (bitmap != null) {
                                                    int max2 = (z40 || pzVar.h != 0) ? 90 : Math.max(bitmap.getWidth(), bitmap.getHeight());
                                                    float f12 = max2;
                                                    str8 = str73;
                                                    obj6 = "1";
                                                    photoSize = hc.b0(null, bitmap, (x20Var2 == null || !x20Var2.N) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP, f12, f12, max2 > 90 ? 80 : 55, z40, 0, 0, false);
                                                    z19 = z40;
                                                    if (photoSize == null || photoSize.location == null) {
                                                        obj7 = null;
                                                        i17 = 1;
                                                        str20 = null;
                                                    } else {
                                                        obj7 = null;
                                                        i17 = 1;
                                                        str20 = D(cVar2, photoSize, null, true, false);
                                                    }
                                                } else {
                                                    str8 = str73;
                                                    obj6 = "1";
                                                    z19 = z40;
                                                    obj7 = null;
                                                    i17 = 1;
                                                    photoSize = null;
                                                    str20 = null;
                                                }
                                                if (photoSize != null) {
                                                    tL_document.thumbs.add(photoSize);
                                                    tL_document.flags |= i17;
                                                }
                                            }
                                        }
                                        q6 = hc.q(pzVar.f);
                                        if (q6 == null && pzVar.g != null) {
                                            q6 = new ec(pzVar.g);
                                        }
                                        if (x20Var2 != null && x20Var2.t) {
                                            size = tL_document.attributes.size();
                                            i22 = 0;
                                            while (true) {
                                                if (i22 < size) {
                                                    tL_document.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                                    break;
                                                } else if (tL_document.attributes.get(i22) instanceof TLRPC.TL_documentAttributeAnimated) {
                                                    break;
                                                } else {
                                                    i22++;
                                                }
                                            }
                                        }
                                        if (x20Var2 != null && (x20Var2.c() || !pzVar.o)) {
                                            File file19 = new File(b8.z(4), str6 + tz.p() + str19 + (!x20Var2.N ? "webm" : str18));
                                            tz.y();
                                            str16 = file19.getAbsolutePath();
                                        }
                                        final String str70222 = str20;
                                        hashMap4 = new HashMap();
                                        str21 = str11;
                                        if (str21 != null) {
                                            hashMap4.put(obj3, str21);
                                        }
                                        if (pzVar.p && !TextUtils.isEmpty(pzVar.f)) {
                                            hashMap4.put("imagePath", pzVar.f);
                                        }
                                        if (str17 != null) {
                                            hashMap4.put(obj4, str17);
                                        }
                                        if (z20 && z11) {
                                            int i47 = i12 + 1;
                                            StringBuilder sb8 = new StringBuilder(str14);
                                            str9 = str6;
                                            j19 = j15;
                                            sb8.append(j19);
                                            hashMap4.put(obj, sb8.toString());
                                            if (z15) {
                                                i18 = i14;
                                                i19 = i15;
                                            } else {
                                                if (iVar == null && i47 == 10) {
                                                    i18 = i14;
                                                    i19 = i15;
                                                } else {
                                                    i18 = i14;
                                                    i19 = i15;
                                                }
                                                hashMap4.put(obj5, obj6);
                                                i20 = i47;
                                                j26 = 0;
                                            }
                                            i20 = i47;
                                        } else {
                                            str9 = str6;
                                            i18 = i14;
                                            i19 = i15;
                                            j19 = j15;
                                            i20 = i12;
                                        }
                                        if (!z19 && ((x20Var2 == null || !x20Var2.N) && (arrayList4 = pzVar.j) != null && !arrayList4.isEmpty())) {
                                            tL_document.attributes.add(new TLRPC.TL_documentAttributeHasStickers());
                                            SerializedData serializedData2 = new SerializedData((pzVar.j.size() * 20) + 4);
                                            serializedData2.writeInt32(pzVar.j.size());
                                            for (i21 = 0; i21 < pzVar.j.size(); i21++) {
                                                ((TLRPC.InputDocument) pzVar.j.get(i21)).serializeToStream(serializedData2);
                                            }
                                            hashMap4.put(obj2, Utilities.f(serializedData2.toByteArray()));
                                            serializedData2.cleanup();
                                        }
                                        j15 = j19;
                                        final TLRPC.PhotoSize photoSize3222 = q6;
                                        final String str71222 = str17;
                                        final x20 x20Var6222 = x20Var2;
                                        final Bitmap bitmap2222 = bitmap;
                                        i15 = i19;
                                        final String str72222 = str16;
                                        i16 = i18;
                                        final pz pzVar6222 = pzVar;
                                        final TLRPC.TL_document tL_document6222 = tL_document;
                                        cVar2 = cVar;
                                        i0.g3(new Runnable() { // from class: org.telegram.messenger.oy
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                String str732;
                                                Bitmap bitmap3 = bitmap2222;
                                                if (bitmap3 != null && (str732 = str70222) != null) {
                                                    hc.D().O(new BitmapDrawable(bitmap3), str732, false);
                                                }
                                                jj jjVar4 = jjVar;
                                                TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                                c cVar3 = cVar;
                                                x20 x20Var7 = x20Var6222;
                                                TLRPC.TL_document tL_document7 = tL_document6222;
                                                String str742 = str72222;
                                                HashMap hashMap11 = hashMap4;
                                                pz pzVar7 = pzVar6222;
                                                String str75 = str71222;
                                                if (jjVar4 != null || tL_inputPollAnswer2 != null) {
                                                    qz.C(cVar3.a).t(jjVar4, tL_inputPollAnswer2, null, x20Var7, tL_document7, str742, null, hashMap11, false, pzVar7.u, str75);
                                                    return;
                                                }
                                                oz e162 = oz.e(tL_document7, x20Var7, str742, j10, jjVar2, jjVar3, pzVar7.d, pzVar7.i, hashMap11, z13, i10, i11, pzVar7.h, str75, pzVar7.u);
                                                e162.H = storyItem;
                                                e162.J = knVar;
                                                e162.K = swVar;
                                                e162.O = j12;
                                                e162.L = z14;
                                                e162.P = pzVar7.w;
                                                e162.k = pzVar7.B;
                                                e162.o = photoSize3222;
                                                e162.Q = j13;
                                                e162.R = j14;
                                                e162.T = ojVar;
                                                e162.U = pzVar7.p;
                                                e162.V = pzVar7.A / 1000;
                                                e162.j = iVar;
                                                qz.C(cVar3.a).r0(e162);
                                            }
                                        });
                                        arrayList8 = arrayList2;
                                        i12 = i20;
                                        arrayList9 = arrayList13;
                                        arrayList10 = arrayList14;
                                        arrayList11 = arrayList15;
                                    }
                                }
                            }
                            str11 = str67;
                            str12 = "video/mp4";
                            str13 = str8;
                            file = file15;
                            str14 = "";
                            obj = "groupId";
                            z21 = z18;
                            x20Var2 = x20Var;
                            str15 = ".";
                            j18 = j17;
                            str16 = str66;
                            tL_document = null;
                            str17 = null;
                            if (tL_document != null) {
                            }
                            q6 = hc.q(pzVar.f);
                            if (q6 == null) {
                                q6 = new ec(pzVar.g);
                            }
                            if (x20Var2 != null) {
                                size = tL_document.attributes.size();
                                i22 = 0;
                                while (true) {
                                    if (i22 < size) {
                                    }
                                    i22++;
                                }
                            }
                            if (x20Var2 != null) {
                                if (!x20Var2.N) {
                                }
                                File file192 = new File(b8.z(4), str6 + tz.p() + str19 + (!x20Var2.N ? "webm" : str18));
                                tz.y();
                                str16 = file192.getAbsolutePath();
                            }
                            final String str702222 = str20;
                            hashMap4 = new HashMap();
                            str21 = str11;
                            if (str21 != null) {
                            }
                            if (pzVar.p) {
                                hashMap4.put("imagePath", pzVar.f);
                            }
                            if (str17 != null) {
                            }
                            if (z20) {
                            }
                            str9 = str6;
                            i18 = i14;
                            i19 = i15;
                            j19 = j15;
                            i20 = i12;
                            if (!z19) {
                                tL_document.attributes.add(new TLRPC.TL_documentAttributeHasStickers());
                                SerializedData serializedData22 = new SerializedData((pzVar.j.size() * 20) + 4);
                                serializedData22.writeInt32(pzVar.j.size());
                                while (i21 < pzVar.j.size()) {
                                }
                                hashMap4.put(obj2, Utilities.f(serializedData22.toByteArray()));
                                serializedData22.cleanup();
                            }
                            j15 = j19;
                            final TLRPC.PhotoSize photoSize32222 = q6;
                            final String str712222 = str17;
                            final x20 x20Var62222 = x20Var2;
                            final Bitmap bitmap22222 = bitmap;
                            i15 = i19;
                            final String str722222 = str16;
                            i16 = i18;
                            final pz pzVar62222 = pzVar;
                            final TLRPC.TL_document tL_document62222 = tL_document;
                            cVar2 = cVar;
                            i0.g3(new Runnable() { // from class: org.telegram.messenger.oy
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String str732;
                                    Bitmap bitmap3 = bitmap22222;
                                    if (bitmap3 != null && (str732 = str702222) != null) {
                                        hc.D().O(new BitmapDrawable(bitmap3), str732, false);
                                    }
                                    jj jjVar4 = jjVar;
                                    TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                    c cVar3 = cVar;
                                    x20 x20Var7 = x20Var62222;
                                    TLRPC.TL_document tL_document7 = tL_document62222;
                                    String str742 = str722222;
                                    HashMap hashMap11 = hashMap4;
                                    pz pzVar7 = pzVar62222;
                                    String str75 = str712222;
                                    if (jjVar4 != null || tL_inputPollAnswer2 != null) {
                                        qz.C(cVar3.a).t(jjVar4, tL_inputPollAnswer2, null, x20Var7, tL_document7, str742, null, hashMap11, false, pzVar7.u, str75);
                                        return;
                                    }
                                    oz e162 = oz.e(tL_document7, x20Var7, str742, j10, jjVar2, jjVar3, pzVar7.d, pzVar7.i, hashMap11, z13, i10, i11, pzVar7.h, str75, pzVar7.u);
                                    e162.H = storyItem;
                                    e162.J = knVar;
                                    e162.K = swVar;
                                    e162.O = j12;
                                    e162.L = z14;
                                    e162.P = pzVar7.w;
                                    e162.k = pzVar7.B;
                                    e162.o = photoSize32222;
                                    e162.Q = j13;
                                    e162.R = j14;
                                    e162.T = ojVar;
                                    e162.U = pzVar7.p;
                                    e162.V = pzVar7.A / 1000;
                                    e162.j = iVar;
                                    qz.C(cVar3.a).r0(e162);
                                }
                            });
                            arrayList8 = arrayList2;
                            i12 = i20;
                            arrayList9 = arrayList13;
                            arrayList10 = arrayList14;
                            arrayList11 = arrayList15;
                        }
                    }
                    i39 = i12;
                    i40 = i15 + 1;
                    size2 = i16;
                    j24 = j16;
                    C = z19;
                    str = str10;
                    str2 = str9;
                    hashMap = hashMap3;
                    str57 = str7;
                    j25 = j15;
                    str4 = str8;
                    arrayList7 = arrayList;
                }
            }
            i12 = 0;
            hfVar = pzVar5.l;
            i13 = i40;
            arrayList2 = arrayList8;
            ArrayList arrayList132 = arrayList9;
            i14 = size2;
            hashMap2 = hashMap;
            ArrayList arrayList142 = arrayList10;
            ArrayList arrayList152 = arrayList11;
            if (hfVar == null) {
            }
            str5 = str;
            str6 = str2;
            str7 = str57;
            j15 = j25;
            i15 = i13;
            hashMap3 = hashMap2;
            j16 = 0;
            z18 = C;
            if (pzVar5.o) {
            }
            str8 = str4;
            if (z10) {
            }
            if (z10) {
            }
            str9 = str6;
            z19 = z18;
            str10 = str5;
            i16 = i14;
            i15 = i15;
            j15 = j15;
            if (arrayList2 != null) {
            }
            ArrayList arrayList192 = arrayList12;
            arrayList8.add(pzVar5.c);
            arrayList3.add(pzVar5.c);
            arrayList10.add(pzVar5.a);
            arrayList11.add(pzVar5.d);
            arrayList192.add(pzVar5.i);
            arrayList9 = arrayList3;
            arrayList12 = arrayList192;
            i39 = i12;
            i40 = i15 + 1;
            size2 = i16;
            j24 = j16;
            C = z19;
            str = str10;
            str2 = str9;
            hashMap = hashMap3;
            str57 = str7;
            j25 = j15;
            str4 = str8;
            arrayList7 = arrayList;
        }
        boolean z41 = C;
        long j31 = j24;
        ArrayList arrayList20 = arrayList8;
        ArrayList arrayList21 = arrayList9;
        int i48 = size2;
        ArrayList arrayList22 = arrayList10;
        ArrayList arrayList23 = arrayList11;
        long j32 = j26;
        int i49 = 10;
        if (j32 != j31 && !z15) {
            z(cVar2, j32, i10);
        }
        if (tVar != null) {
            ((t0.h) tVar.b).g();
        }
        if (arrayList20 != null && !arrayList20.isEmpty()) {
            int i50 = 1;
            long[] jArr = new long[1];
            int size3 = arrayList20.size();
            int i51 = i39;
            int i52 = 0;
            while (i52 < size3) {
                if (!z10 || z41 || i48 <= i50 || i51 % 10 != 0) {
                    z17 = false;
                } else {
                    z17 = false;
                    jArr[0] = Utilities.b.nextLong();
                    i51 = 0;
                }
                int i53 = i51 + 1;
                ArrayList arrayList24 = arrayList20;
                ArrayList arrayList25 = arrayList21;
                ArrayList arrayList26 = arrayList22;
                ArrayList arrayList27 = arrayList12;
                ArrayList arrayList28 = arrayList23;
                int i54 = size3;
                arrayList20 = arrayList24;
                arrayList21 = arrayList25;
                arrayList22 = arrayList26;
                arrayList12 = arrayList27;
                int i55 = i49;
                arrayList23 = arrayList28;
                String str75 = str58;
                int U = U(cVar2, (String) arrayList24.get(i52), (String) arrayList25.get(i52), (Uri) arrayList26.get(i52), str75, j10, jjVar2, jjVar3, storyItem, knVar, (ArrayList) arrayList27.get(i52), jjVar, jArr, (i53 == i49 || i52 == size3 + (-1)) ? true : z17, (CharSequence) arrayList28.get(i52), z13, i10, 0, null, z10, swVar, j12, z14, j13, j14, ojVar, null, -1);
                if (U != 0) {
                    i0.g3(new a1(U, cVar2, 12));
                }
                i52++;
                str58 = str75;
                size3 = i54;
                i51 = i53;
                i50 = 1;
                i49 = i55;
            }
        }
        if (v2.a) {
            f8.b("total send time = " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public static void R(c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j10, jj jjVar, jj jjVar2, org.telegram.ui.kn knVar, boolean z10, int i10, int i11, sw swVar, long j11, long j12, long j13) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        int i12 = 0;
        richMessage.rtl = false;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
            if (pageBlock != null) {
                richMessage.blocks.add(pageBlock);
            }
        }
        if (richMessage.blocks.isEmpty()) {
            return;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            richMessage.photos.addAll(arrayList2);
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            richMessage.documents.addAll(arrayList3);
        }
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayList<TL_iv.PageBlock> arrayList5 = richMessage.blocks;
        int size2 = arrayList5.size();
        while (i12 < size2) {
            TL_iv.PageBlock pageBlock2 = arrayList5.get(i12);
            i12++;
            j(pageBlock2, identityHashMap);
        }
        oz c10 = oz.c(null, null, null, null, null, null, null, null, null, null, j10, null, jjVar, jjVar2, null, true, null, null, null, null, z10, i10, i11, 0, null, null, false, false);
        c10.Y = richMessage;
        c10.Z = arrayList4;
        c10.J = knVar;
        c10.K = swVar;
        c10.O = j11;
        c10.R = j12;
        c10.Q = j13;
        C(cVar.a).r0(c10);
    }

    public static void S(final int i10, final long j10, final long j11, final long j12, final HashMap hashMap, final c cVar, final jj jjVar, final jj jjVar2, final sw swVar, final TLRPC.BotInlineResult botInlineResult, final TL_stories.StoryItem storyItem, final org.telegram.ui.ActionBar.k2 k2Var, final org.telegram.ui.kn knVar, final boolean z10) {
        oz d;
        TLRPC.TL_webPagePending tL_webPagePending;
        if (botInlineResult == null) {
            return;
        }
        TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaAuto) {
            new Thread(new Runnable() { // from class: org.telegram.messenger.fy
                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z11;
                    char c10;
                    long j13;
                    char c11;
                    final String str;
                    TLRPC.TL_document tL_document;
                    TLRPC.TL_photo tL_photo;
                    Bitmap K2;
                    int i11;
                    String str2;
                    TLRPC.BotInlineResult botInlineResult2;
                    TLRPC.TL_document tL_document2;
                    int i12;
                    TLRPC.InputPeer inputPeer;
                    long j14;
                    TLRPC.InputPeer inputPeer2;
                    boolean z12;
                    TLRPC.WebDocument webDocument;
                    long j15 = j10;
                    boolean C = o5.C(j15);
                    TLRPC.BotInlineResult botInlineResult3 = botInlineResult;
                    boolean equals = "game".equals(botInlineResult3.type);
                    final c cVar2 = cVar;
                    if (equals) {
                        if (C) {
                            return;
                        }
                        TLRPC.TL_game tL_game = new TLRPC.TL_game();
                        tL_game.title = botInlineResult3.title;
                        tL_game.description = botInlineResult3.description;
                        tL_game.short_name = botInlineResult3.id;
                        TLRPC.Photo photo = botInlineResult3.photo;
                        tL_game.photo = photo;
                        if (photo == null) {
                            tL_game.photo = new TLRPC.TL_photoEmpty();
                        }
                        TLRPC.Document document = botInlineResult3.document;
                        if (document instanceof TLRPC.TL_document) {
                            tL_game.document = document;
                            tL_game.flags |= 1;
                        }
                        str2 = tL_game;
                        j13 = j15;
                        z11 = C;
                        tL_photo = null;
                        tL_document = null;
                        str = null;
                    } else if (botInlineResult3 instanceof TLRPC.TL_botInlineMediaResult) {
                        TLRPC.Document document2 = botInlineResult3.document;
                        if (document2 != null) {
                            if (document2 instanceof TLRPC.TL_document) {
                                tL_document = (TLRPC.TL_document) document2;
                                j13 = j15;
                                z11 = C;
                                tL_photo = null;
                                str2 = null;
                                str = str2;
                            }
                            j13 = j15;
                            z11 = C;
                            tL_photo = null;
                            tL_document = null;
                            str2 = null;
                            str = null;
                        } else {
                            TLRPC.Photo photo2 = botInlineResult3.photo;
                            if (photo2 != null && (photo2 instanceof TLRPC.TL_photo)) {
                                tL_photo = (TLRPC.TL_photo) photo2;
                                j13 = j15;
                                z11 = C;
                                tL_document = null;
                                str2 = null;
                                str = str2;
                            }
                            j13 = j15;
                            z11 = C;
                            tL_photo = null;
                            tL_document = null;
                            str2 = null;
                            str = null;
                        }
                    } else {
                        TLRPC.WebDocument webDocument2 = botInlineResult3.content;
                        if (webDocument2 != null) {
                            String B = hc.B(webDocument2.url, null);
                            File file = new File(b8.z(4), Utilities.a(botInlineResult3.content.url) + (TextUtils.isEmpty(B) ? b8.C(botInlineResult3.content.mime_type) : sc.e.h(".", B)));
                            String absolutePath = file.exists() ? file.getAbsolutePath() : botInlineResult3.content.url;
                            String str3 = botInlineResult3.type;
                            str3.getClass();
                            switch (str3.hashCode()) {
                                case -1890252483:
                                    z11 = C;
                                    if (str3.equals("sticker")) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 102340:
                                    z11 = C;
                                    if (str3.equals("gif")) {
                                        c10 = 1;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 3143036:
                                    z11 = C;
                                    if (str3.equals("file")) {
                                        c10 = 2;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 93166550:
                                    z11 = C;
                                    if (str3.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                                        c10 = 3;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 106642994:
                                    z11 = C;
                                    if (str3.equals("photo")) {
                                        c10 = 4;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 112202875:
                                    if (str3.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                                        z11 = C;
                                        c10 = 5;
                                        break;
                                    }
                                    z11 = C;
                                    c10 = 65535;
                                    break;
                                case 112386354:
                                    if (str3.equals("voice")) {
                                        c10 = 6;
                                        z11 = C;
                                        break;
                                    }
                                    z11 = C;
                                    c10 = 65535;
                                    break;
                                default:
                                    z11 = C;
                                    c10 = 65535;
                                    break;
                            }
                            switch (c10) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 5:
                                case 6:
                                    TLRPC.TL_document tL_document3 = new TLRPC.TL_document();
                                    j13 = j15;
                                    tL_document3.id = 0L;
                                    tL_document3.size = 0L;
                                    tL_document3.dc_id = 0;
                                    tL_document3.mime_type = botInlineResult3.content.mime_type;
                                    tL_document3.file_reference = new byte[0];
                                    tL_document3.date = ConnectionsManager.getInstance(cVar2.a).getCurrentTime();
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_document3.attributes.add(tL_documentAttributeFilename);
                                    String str4 = botInlineResult3.type;
                                    str4.getClass();
                                    switch (str4.hashCode()) {
                                        case -1890252483:
                                            if (str4.equals("sticker")) {
                                                c11 = 0;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 102340:
                                            if (str4.equals("gif")) {
                                                c11 = 1;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 3143036:
                                            if (str4.equals("file")) {
                                                c11 = 2;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 93166550:
                                            if (str4.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                                                c11 = 3;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 112202875:
                                            if (str4.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                                                c11 = 4;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 112386354:
                                            if (str4.equals("voice")) {
                                                c11 = 5;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        default:
                                            c11 = 65535;
                                            break;
                                    }
                                    switch (c11) {
                                        case 0:
                                            TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                                            tL_documentAttributeSticker.alt = "";
                                            tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                                            tL_document3.attributes.add(tL_documentAttributeSticker);
                                            TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                                            int[] h12 = jj.h1(botInlineResult3);
                                            tL_documentAttributeImageSize.w = h12[0];
                                            tL_documentAttributeImageSize.h = h12[1];
                                            tL_document3.attributes.add(tL_documentAttributeImageSize);
                                            tL_documentAttributeFilename.file_name = "sticker.webp";
                                            try {
                                                if (botInlineResult3.thumb != null) {
                                                    Bitmap K3 = hc.K(new File(b8.z(4), Utilities.a(botInlineResult3.thumb.url) + "." + hc.B(botInlineResult3.thumb.url, "webp")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                                    if (K3 != null) {
                                                        TLRPC.PhotoSize Z = hc.Z(K3, 90.0f, 90.0f, 55, false);
                                                        if (Z != null) {
                                                            tL_document3.thumbs.add(Z);
                                                            tL_document3.flags |= 1;
                                                        }
                                                        K3.recycle();
                                                        break;
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                f8.g(th2, true);
                                                break;
                                            }
                                            break;
                                        case 1:
                                            tL_documentAttributeFilename.file_name = "animation.gif";
                                            if (absolutePath.endsWith("mp4")) {
                                                tL_document3.mime_type = "video/mp4";
                                                tL_document3.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                            } else {
                                                tL_document3.mime_type = "image/gif";
                                            }
                                            int i13 = z11 ? 90 : zs.r5;
                                            try {
                                                if (absolutePath.endsWith("mp4")) {
                                                    K2 = qz.r(1, absolutePath);
                                                    if (K2 == null) {
                                                        TLRPC.WebDocument webDocument3 = botInlineResult3.thumb;
                                                        if ((webDocument3 instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument3.mime_type)) {
                                                            String B2 = hc.B(botInlineResult3.thumb.url, null);
                                                            K2 = qz.r(1, new File(b8.z(4), Utilities.a(botInlineResult3.thumb.url) + (TextUtils.isEmpty(B2) ? b8.C(botInlineResult3.thumb.mime_type) : "." + B2)).getAbsolutePath());
                                                        }
                                                    }
                                                } else {
                                                    float f7 = i13;
                                                    K2 = hc.K(absolutePath, null, f7, f7, true);
                                                }
                                                if (K2 != null) {
                                                    float f10 = i13;
                                                    TLRPC.PhotoSize Z2 = hc.Z(K2, f10, f10, i13 > 90 ? 80 : 55, false);
                                                    if (Z2 != null) {
                                                        tL_document3.thumbs.add(Z2);
                                                        tL_document3.flags |= 1;
                                                    }
                                                    K2.recycle();
                                                    break;
                                                }
                                            } catch (Throwable th3) {
                                                f8.g(th3, true);
                                                break;
                                            }
                                            break;
                                        case 2:
                                            int lastIndexOf = botInlineResult3.content.mime_type.lastIndexOf(47);
                                            if (lastIndexOf != -1) {
                                                tL_documentAttributeFilename.file_name = "file." + botInlineResult3.content.mime_type.substring(lastIndexOf + 1);
                                                break;
                                            } else {
                                                tL_documentAttributeFilename.file_name = "file";
                                                break;
                                            }
                                        case 3:
                                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                            tL_documentAttributeAudio.duration = jj.g1(botInlineResult3);
                                            tL_documentAttributeAudio.title = botInlineResult3.title;
                                            int i14 = tL_documentAttributeAudio.flags;
                                            tL_documentAttributeAudio.flags = i14 | 1;
                                            String str5 = botInlineResult3.description;
                                            if (str5 != null) {
                                                tL_documentAttributeAudio.performer = str5;
                                                tL_documentAttributeAudio.flags = i14 | 3;
                                            }
                                            tL_documentAttributeFilename.file_name = "audio.mp3";
                                            tL_document3.attributes.add(tL_documentAttributeAudio);
                                            break;
                                        case 4:
                                            tL_documentAttributeFilename.file_name = "video.mp4";
                                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                                            int[] h13 = jj.h1(botInlineResult3);
                                            tL_documentAttributeVideo.w = h13[0];
                                            tL_documentAttributeVideo.h = h13[1];
                                            tL_documentAttributeVideo.duration = jj.g1(botInlineResult3);
                                            tL_documentAttributeVideo.supports_streaming = true;
                                            tL_document3.attributes.add(tL_documentAttributeVideo);
                                            try {
                                                if (botInlineResult3.thumb != null) {
                                                    Bitmap K4 = hc.K(new File(b8.z(4), Utilities.a(botInlineResult3.thumb.url) + "." + hc.B(botInlineResult3.thumb.url, "jpg")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                                    if (K4 != null) {
                                                        TLRPC.PhotoSize Z3 = hc.Z(K4, 90.0f, 90.0f, 55, false);
                                                        if (Z3 != null) {
                                                            tL_document3.thumbs.add(Z3);
                                                            tL_document3.flags |= 1;
                                                        }
                                                        K4.recycle();
                                                        break;
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                f8.g(th4, true);
                                                break;
                                            }
                                            break;
                                        case 5:
                                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2 = new TLRPC.TL_documentAttributeAudio();
                                            tL_documentAttributeAudio2.duration = jj.g1(botInlineResult3);
                                            tL_documentAttributeAudio2.voice = true;
                                            tL_documentAttributeFilename.file_name = "audio.ogg";
                                            tL_document3.attributes.add(tL_documentAttributeAudio2);
                                            break;
                                    }
                                    if (tL_documentAttributeFilename.file_name == null) {
                                        tL_documentAttributeFilename.file_name = "file";
                                    }
                                    if (tL_document3.mime_type == null) {
                                        tL_document3.mime_type = "application/octet-stream";
                                    }
                                    if (tL_document3.thumbs.isEmpty()) {
                                        TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                                        int[] h14 = jj.h1(botInlineResult3);
                                        tL_photoSize.w = h14[0];
                                        tL_photoSize.h = h14[1];
                                        tL_photoSize.size = 0;
                                        tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
                                        tL_photoSize.type = "x";
                                        tL_document3.thumbs.add(tL_photoSize);
                                        tL_document3.flags |= 1;
                                    }
                                    str = absolutePath;
                                    tL_document = tL_document3;
                                    tL_photo = null;
                                    break;
                                case 4:
                                    if (file.exists()) {
                                        i11 = 0;
                                        tL_photo = qz.C(cVar2.a).A(absolutePath, null, false);
                                    } else {
                                        i11 = 0;
                                        tL_photo = null;
                                    }
                                    if (tL_photo == null) {
                                        tL_photo = new TLRPC.TL_photo();
                                        tL_photo.date = ConnectionsManager.getInstance(cVar2.a).getCurrentTime();
                                        tL_photo.file_reference = new byte[i11];
                                        TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                                        int[] h15 = jj.h1(botInlineResult3);
                                        tL_photoSize2.w = h15[i11];
                                        tL_photoSize2.h = h15[1];
                                        tL_photoSize2.size = 1;
                                        tL_photoSize2.location = new TLRPC.TL_fileLocationUnavailable();
                                        tL_photoSize2.type = "x";
                                        tL_photo.sizes.add(tL_photoSize2);
                                    }
                                    str = absolutePath;
                                    j13 = j15;
                                    tL_document = null;
                                    break;
                                default:
                                    str = absolutePath;
                                    j13 = j15;
                                    tL_photo = null;
                                    tL_document = null;
                                    break;
                            }
                            str2 = null;
                        }
                        j13 = j15;
                        z11 = C;
                        tL_photo = null;
                        tL_document = null;
                        str2 = null;
                        str = null;
                    }
                    final HashMap hashMap2 = hashMap;
                    if (hashMap2 != null && (webDocument = botInlineResult3.content) != null) {
                        hashMap2.put("originalPath", webDocument.url);
                    }
                    final TLRPC.TL_game tL_game2 = str2;
                    final Bitmap[] bitmapArr = new Bitmap[1];
                    final String[] strArr = new String[1];
                    if (z11 && tL_document != null) {
                        for (int i15 = 0; i15 < tL_document.attributes.size(); i15++) {
                            if (tL_document.attributes.get(i15) instanceof TLRPC.TL_documentAttributeVideo) {
                                TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo2 = (TLRPC.TL_documentAttributeVideo) tL_document.attributes.get(i15);
                                TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                                tL_documentAttributeVideo_layer159.flags = tL_documentAttributeVideo2.flags;
                                tL_documentAttributeVideo_layer159.round_message = tL_documentAttributeVideo2.round_message;
                                tL_documentAttributeVideo_layer159.supports_streaming = tL_documentAttributeVideo2.supports_streaming;
                                tL_documentAttributeVideo_layer159.duration = tL_documentAttributeVideo2.duration;
                                tL_documentAttributeVideo_layer159.w = tL_documentAttributeVideo2.w;
                                tL_documentAttributeVideo_layer159.h = tL_documentAttributeVideo2.h;
                                tL_document.attributes.set(i15, tL_documentAttributeVideo_layer159);
                            }
                        }
                    }
                    if (jj.s3(tL_document, false)) {
                        TLRPC.PhotoSize w9 = b8.w(tL_document.thumbs, zs.r5, false, null, false);
                        b8.G(cVar2.a);
                        File I2 = b8.I(tL_document);
                        if (I2.exists()) {
                            z12 = true;
                        } else {
                            b8.G(cVar2.a);
                            z12 = true;
                            I2 = b8.K(tL_document, null, true, true);
                        }
                        inputPeer = null;
                        tL_document2 = tL_document;
                        botInlineResult2 = botInlineResult3;
                        boolean z13 = z12;
                        qz.w(cVar2, z11, tL_document2, I2.getAbsolutePath(), null, 0L, false);
                        strArr[0] = qz.D(cVar2, w9, bitmapArr, z13, z13);
                        i12 = z13;
                    } else {
                        botInlineResult2 = botInlineResult3;
                        tL_document2 = tL_document;
                        i12 = 1;
                        inputPeer = null;
                    }
                    if (o5.C(j13)) {
                        j14 = j13;
                        inputPeer2 = inputPeer;
                    } else {
                        j14 = j13;
                        inputPeer2 = vp.r1(cVar2.a).i1(j14);
                    }
                    if (inputPeer2 != null && inputPeer2.user_id != 0 && vp.r1(cVar2.a).a2(inputPeer2.user_id) != null && vp.r1(cVar2.a).a2(inputPeer2.user_id).voice_messages_forbidden && tL_document2 != null) {
                        boolean Q4 = jj.Q4(tL_document2);
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        if (Q4) {
                            i0.g3(new xn(i12, k2Var2));
                            return;
                        } else if (jj.i4(tL_document2)) {
                            i0.g3(new xn(2, k2Var2));
                            return;
                        }
                    }
                    final jj jjVar3 = jjVar;
                    final jj jjVar4 = jjVar2;
                    final long j16 = j14;
                    final boolean z14 = z10;
                    final int i16 = i10;
                    final sw swVar2 = swVar;
                    final TL_stories.StoryItem storyItem2 = storyItem;
                    final org.telegram.ui.kn knVar2 = knVar;
                    final long j17 = j11;
                    final long j18 = j12;
                    final TLRPC.TL_document tL_document4 = tL_document2;
                    final TLRPC.BotInlineResult botInlineResult4 = botInlineResult2;
                    final TLRPC.TL_photo tL_photo2 = tL_photo;
                    i0.g3(new Runnable() { // from class: org.telegram.messenger.wy
                        @Override // java.lang.Runnable
                        public final void run() {
                            oz c12;
                            TLRPC.TL_document tL_document5 = TLRPC.TL_document.this;
                            long j19 = j16;
                            jj jjVar5 = jjVar3;
                            jj jjVar6 = jjVar4;
                            TLRPC.BotInlineResult botInlineResult5 = botInlineResult4;
                            HashMap hashMap3 = hashMap2;
                            boolean z15 = z14;
                            int i17 = i16;
                            if (tL_document5 != null) {
                                Bitmap[] bitmapArr2 = bitmapArr;
                                if (bitmapArr2[0] != null) {
                                    String[] strArr2 = strArr;
                                    if (strArr2[0] != null) {
                                        hc.D().O(new BitmapDrawable(bitmapArr2[0]), strArr2[0], false);
                                    }
                                }
                                TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult5.send_message;
                                c12 = oz.f(tL_document5, null, str, j19, jjVar5, jjVar6, botInlineMessage2.message, botInlineMessage2.entities, botInlineMessage2.reply_markup, hashMap3, z15, i17, 0, 0, botInlineResult5, null, false);
                            } else {
                                TLRPC.TL_photo tL_photo3 = tL_photo2;
                                if (tL_photo3 != null) {
                                    TLRPC.WebDocument webDocument4 = botInlineResult5.content;
                                    String str6 = webDocument4 != null ? webDocument4.url : null;
                                    TLRPC.BotInlineMessage botInlineMessage3 = botInlineResult5.send_message;
                                    c12 = oz.c(null, botInlineMessage3.message, null, tL_photo3, null, null, null, null, null, null, j19, str6, jjVar5, jjVar6, null, true, null, botInlineMessage3.entities, botInlineMessage3.reply_markup, hashMap3, z15, i17, 0, 0, botInlineResult5, null, false, false);
                                } else {
                                    TLRPC.TL_game tL_game3 = tL_game2;
                                    c12 = tL_game3 != null ? oz.c(null, null, null, null, null, null, null, tL_game3, null, null, j19, null, jjVar5, jjVar6, null, true, null, null, botInlineResult5.send_message.reply_markup, hashMap3, z15, i17, 0, 0, null, null, false, false) : null;
                                }
                            }
                            if (c12 != null) {
                                c12.K = swVar2;
                                c12.H = storyItem2;
                                c12.J = knVar2;
                                c12.Q = j17;
                                c12.R = j18;
                                qz.C(cVar2.a).r0(c12);
                            }
                        }
                    });
                }
            }).run();
            return;
        }
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageText) {
            if (o5.C(j10)) {
                for (int i11 = 0; i11 < botInlineResult.send_message.entities.size(); i11++) {
                    TLRPC.MessageEntity messageEntity = botInlineResult.send_message.entities.get(i11);
                    if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                        tL_webPagePending = new TLRPC.TL_webPagePending();
                        String str = botInlineResult.send_message.message;
                        int i12 = messageEntity.offset;
                        tL_webPagePending.url = str.substring(i12, messageEntity.length + i12);
                        break;
                    }
                }
            }
            tL_webPagePending = null;
            TLRPC.TL_webPagePending tL_webPagePending2 = tL_webPagePending;
            TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
            oz b10 = oz.b(botInlineMessage2.message, j10, jjVar, jjVar2, tL_webPagePending2, !botInlineMessage2.no_webpage, botInlineMessage2.entities, botInlineMessage2.reply_markup, hashMap, z10, i10, 0, null, false);
            b10.K = swVar;
            b10.J = knVar;
            b10.Q = j11;
            b10.R = j12;
            C(cVar.a).r0(b10);
            return;
        }
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageRichMessage) {
            TL_iv.RichMessage richMessage = botInlineMessage.rich_message;
            oz c10 = oz.c(null, null, null, null, null, null, null, null, null, null, j10, null, jjVar, jjVar2, null, true, null, null, botInlineMessage.reply_markup, hashMap, z10, i10, 0, 0, null, null, false, false);
            c10.Y = richMessage;
            c10.K = swVar;
            c10.J = knVar;
            c10.Q = j11;
            c10.R = j12;
            C(cVar.a).r0(c10);
            return;
        }
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageWidget) {
            TLRPC.TL_botInlineMessageWidget tL_botInlineMessageWidget = (TLRPC.TL_botInlineMessageWidget) botInlineMessage;
            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = new TLRPC.TL_messageMediaWidget();
            tL_messageMediaWidget.width = tL_botInlineMessageWidget.width;
            tL_messageMediaWidget.height = tL_botInlineMessageWidget.height;
            tL_messageMediaWidget.payload = tL_botInlineMessageWidget.payload;
            tL_messageMediaWidget.public_data = tL_botInlineMessageWidget.public_data;
            tL_messageMediaWidget.public_data_hash = tL_botInlineMessageWidget.public_data_hash;
            tL_messageMediaWidget.chat_data = tL_botInlineMessageWidget.chat_data;
            tL_messageMediaWidget.widget_id = tL_botInlineMessageWidget.widget_id;
            oz d10 = oz.d(tL_messageMediaWidget, j10, jjVar, jjVar2, botInlineResult.send_message.reply_markup, hashMap, z10, i10);
            d10.b = tL_botInlineMessageWidget.message;
            d10.w = tL_botInlineMessageWidget.entities;
            d10.L = tL_botInlineMessageWidget.invert_media;
            d10.K = swVar;
            d10.J = knVar;
            d10.Q = j11;
            d10.R = j12;
            C(cVar.a).r0(d10);
            return;
        }
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) {
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
            TLRPC.BotInlineMessage botInlineMessage3 = botInlineResult.send_message;
            tL_messageMediaVenue.geo = botInlineMessage3.geo;
            tL_messageMediaVenue.address = botInlineMessage3.address;
            tL_messageMediaVenue.title = botInlineMessage3.title;
            tL_messageMediaVenue.provider = botInlineMessage3.provider;
            String str2 = botInlineMessage3.venue_type;
            tL_messageMediaVenue.venue_id = str2;
            tL_messageMediaVenue.venue_type = str2;
            if (str2 == null) {
                tL_messageMediaVenue.venue_type = "";
            }
            oz d11 = oz.d(tL_messageMediaVenue, j10, jjVar, jjVar2, botInlineMessage3.reply_markup, hashMap, z10, i10);
            d11.K = swVar;
            d11.J = knVar;
            d11.Q = j11;
            d11.R = j12;
            C(cVar.a).r0(d11);
            return;
        }
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) {
            if (botInlineMessage.period == 0 && botInlineMessage.proximity_notification_radius == 0) {
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.BotInlineMessage botInlineMessage4 = botInlineResult.send_message;
                tL_messageMediaGeo.geo = botInlineMessage4.geo;
                tL_messageMediaGeo.heading = botInlineMessage4.heading;
                d = oz.d(tL_messageMediaGeo, j10, jjVar, jjVar2, botInlineMessage4.reply_markup, hashMap, z10, i10);
            } else {
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.BotInlineMessage botInlineMessage5 = botInlineResult.send_message;
                int i13 = botInlineMessage5.period;
                if (i13 == 0) {
                    i13 = 900;
                }
                tL_messageMediaGeoLive.period = i13;
                tL_messageMediaGeoLive.geo = botInlineMessage5.geo;
                tL_messageMediaGeoLive.heading = botInlineMessage5.heading;
                tL_messageMediaGeoLive.proximity_notification_radius = botInlineMessage5.proximity_notification_radius;
                d = oz.d(tL_messageMediaGeoLive, j10, jjVar, jjVar2, botInlineMessage5.reply_markup, hashMap, z10, i10);
            }
            d.K = swVar;
            d.J = knVar;
            d.Q = j11;
            d.R = j12;
            C(cVar.a).r0(d);
            return;
        }
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaContact) {
            TLRPC.TL_user tL_user = new TLRPC.TL_user();
            TLRPC.BotInlineMessage botInlineMessage6 = botInlineResult.send_message;
            tL_user.phone = botInlineMessage6.phone_number;
            tL_user.first_name = botInlineMessage6.first_name;
            tL_user.last_name = botInlineMessage6.last_name;
            TLRPC.RestrictionReason restrictionReason = new TLRPC.RestrictionReason();
            restrictionReason.text = botInlineResult.send_message.vcard;
            restrictionReason.platform = "";
            restrictionReason.reason = "";
            tL_user.restriction_reason.add(restrictionReason);
            oz g10 = oz.g(tL_user, j10, jjVar, jjVar2, botInlineResult.send_message.reply_markup, hashMap, z10, i10, 0);
            g10.K = swVar;
            g10.J = knVar;
            g10.Q = j11;
            g10.R = j12;
            C(cVar.a).r0(g10);
            return;
        }
        if (!(botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaInvoice)) {
            if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage) {
                TLRPC.TL_webPagePending tL_webPagePending3 = new TLRPC.TL_webPagePending();
                tL_webPagePending3.url = ((TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage).url;
                TLRPC.BotInlineMessage botInlineMessage7 = botInlineResult.send_message;
                oz b11 = oz.b(botInlineMessage7.message, j10, jjVar, jjVar2, tL_webPagePending3, !botInlineMessage7.no_webpage, botInlineMessage7.entities, botInlineMessage7.reply_markup, hashMap, z10, i10, 0, null, false);
                b11.K = swVar;
                b11.J = knVar;
                b11.Q = j11;
                b11.R = j12;
                b11.L = botInlineResult.send_message.invert_media;
                C(cVar.a).r0(b11);
                return;
            }
            return;
        }
        if (o5.C(j10)) {
            return;
        }
        TLRPC.TL_botInlineMessageMediaInvoice tL_botInlineMessageMediaInvoice = (TLRPC.TL_botInlineMessageMediaInvoice) botInlineResult.send_message;
        TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice = new TLRPC.TL_messageMediaInvoice();
        tL_messageMediaInvoice.shipping_address_requested = tL_botInlineMessageMediaInvoice.shipping_address_requested;
        tL_messageMediaInvoice.test = tL_botInlineMessageMediaInvoice.test;
        tL_messageMediaInvoice.title = tL_botInlineMessageMediaInvoice.title;
        tL_messageMediaInvoice.description = tL_botInlineMessageMediaInvoice.description;
        TLRPC.WebDocument webDocument = tL_botInlineMessageMediaInvoice.photo;
        if (webDocument != null) {
            tL_messageMediaInvoice.webPhoto = webDocument;
            tL_messageMediaInvoice.flags |= 1;
        }
        tL_messageMediaInvoice.currency = tL_botInlineMessageMediaInvoice.currency;
        tL_messageMediaInvoice.total_amount = tL_botInlineMessageMediaInvoice.total_amount;
        tL_messageMediaInvoice.start_param = "";
        oz c11 = oz.c(null, null, null, null, null, null, null, null, null, tL_messageMediaInvoice, j10, null, jjVar, jjVar2, null, true, null, null, botInlineResult.send_message.reply_markup, hashMap, z10, i10, 0, 0, null, null, false, false);
        c11.K = swVar;
        c11.J = knVar;
        c11.Q = j11;
        c11.R = j12;
        C(cVar.a).r0(c11);
    }

    public static void T(c cVar, String str, String str2, Uri uri, String str3, String str4, long j10, jj jjVar, jj jjVar2, TL_stories.StoryItem storyItem, org.telegram.ui.kn knVar, boolean z10, m2.t tVar, sw swVar) {
        ArrayList arrayList;
        if ((str == null || str2 == null) && uri == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (uri != null) {
            arrayList = new ArrayList();
            arrayList.add(uri);
        } else {
            arrayList = null;
        }
        ArrayList arrayList4 = arrayList;
        if (str != null) {
            arrayList2.add(str);
            arrayList3.add(str2);
        }
        V(0, j10, 0L, 0L, 0L, null, str3, str4, arrayList2, arrayList3, arrayList4, null, null, null, tVar, cVar, jjVar, jjVar2, null, null, swVar, storyItem, knVar, z10, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:292|293|(7:295|296|297|298|299|300|301)(1:349)|(3:310|311|(3:313|314|(4:316|304|305|306)))|303|304|305|306) */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0212, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0213, code lost:
    
        org.telegram.messenger.f8.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e4, code lost:
    
        if (r0 == false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0580 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x023f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0256 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:342:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02f6 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int U(c cVar, String str, String str2, Uri uri, String str3, final long j10, final jj jjVar, final jj jjVar2, final TL_stories.StoryItem storyItem, final org.telegram.ui.kn knVar, final ArrayList arrayList, final jj jjVar3, long[] jArr, boolean z10, CharSequence charSequence, final boolean z11, int i10, final int i11, Integer[] numArr, boolean z12, final sw swVar, final long j11, final boolean z13, final long j12, final long j13, final oj ojVar, final ih.i iVar, final int i12) {
        MimeTypeMap mimeTypeMap;
        long j14;
        int i13;
        long j15;
        final String str4;
        String str5;
        String str6;
        String lowerCase;
        Object obj;
        Object obj2;
        cf.a a2;
        String str7;
        Bitmap bitmap;
        String str8;
        int i14;
        String str9;
        Bitmap bitmap2;
        String str10;
        String str11;
        boolean z14;
        Object obj3;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        boolean z15;
        Object obj4;
        Bitmap bitmap3;
        MimeTypeMap mimeTypeMap2;
        Object obj5;
        String str12;
        String str13;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2;
        File file;
        Object obj6;
        boolean z16;
        Integer num;
        Object obj7;
        String str14;
        TLRPC.TL_document tL_document;
        String str15;
        String str16;
        final HashMap hashMap;
        String str17;
        Integer num2;
        int i15;
        final int i16;
        long j16;
        Uri uri2;
        int i17;
        BitmapFactory.Options options;
        int i18;
        int i19;
        TLRPC.PhotoSize b02;
        String str18;
        char c10;
        String str19;
        TLRPC.TL_document tL_document2;
        String str20;
        String str21;
        String sb2;
        Throwable th2;
        MediaMetadataRetriever mediaMetadataRetriever;
        Bitmap bitmap4;
        boolean z17;
        int i20;
        String str22;
        String str23;
        String str24;
        String str25;
        Bitmap bitmap5;
        boolean z18;
        long j17;
        long j18;
        boolean z19;
        Cursor query;
        c cVar2 = cVar;
        String str26 = str2;
        long j19 = iVar != null ? iVar.c : 0L;
        if (((str != null && str.length() != 0) || uri != null) && ((uri == null || !i0.I1(uri, 0)) && (str == null || !i0.I1(Uri.fromFile(new File(str)), 0)))) {
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            if (uri != null && str == null) {
                try {
                    j15 = 0;
                    try {
                        AssetFileDescriptor openAssetFileDescriptor = w0.b.getContentResolver().openAssetFileDescriptor(uri, "r", null);
                        if (openAssetFileDescriptor != null) {
                            try {
                                j17 = openAssetFileDescriptor.getLength();
                            } catch (Exception e) {
                                e = e;
                                mimeTypeMap = singleton;
                                j14 = j19;
                                j17 = 0;
                                i13 = 2;
                                f8.g(e, true);
                                j18 = j17;
                                if (b8.m(cVar2.a, j18)) {
                                }
                                return i13;
                            }
                        } else {
                            j17 = 0;
                        }
                        try {
                            long j20 = j19;
                            try {
                                j14 = j20;
                                mimeTypeMap = singleton;
                                i13 = 2;
                                try {
                                    query = w0.b.getContentResolver().query(uri, new String[]{"_size"}, null, null, null);
                                    int columnIndex = query.getColumnIndex("_size");
                                    query.moveToFirst();
                                    j18 = query.getLong(columnIndex);
                                } catch (Exception e7) {
                                    e = e7;
                                }
                            } catch (Exception e10) {
                                e = e10;
                                mimeTypeMap = singleton;
                                j14 = j20;
                                i13 = 2;
                                f8.g(e, true);
                                j18 = j17;
                                if (b8.m(cVar2.a, j18)) {
                                }
                                return i13;
                            }
                            try {
                                query.close();
                            } catch (Exception e11) {
                                e = e11;
                                j17 = j18;
                                f8.g(e, true);
                                j18 = j17;
                                if (b8.m(cVar2.a, j18)) {
                                }
                                return i13;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            mimeTypeMap = singleton;
                            j14 = j19;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        mimeTypeMap = singleton;
                        j14 = j19;
                        i13 = 2;
                        j17 = j15;
                        f8.g(e, true);
                        j18 = j17;
                        if (b8.m(cVar2.a, j18)) {
                        }
                        return i13;
                    }
                } catch (Exception e14) {
                    e = e14;
                    mimeTypeMap = singleton;
                    j14 = j19;
                    i13 = 2;
                    j15 = 0;
                }
                if (b8.m(cVar2.a, j18)) {
                    str5 = str3 != null ? mimeTypeMap.getExtensionFromMimeType(str3) : null;
                    if (str5 == null) {
                        str5 = "txt";
                        z19 = false;
                    } else {
                        z19 = true;
                    }
                    String t10 = MediaController.t(-1L, uri, str5);
                    if (t10 != null) {
                        str4 = t10;
                    }
                }
                return i13;
            }
            mimeTypeMap = singleton;
            j14 = j19;
            i13 = 2;
            j15 = 0;
            str4 = str;
            str5 = null;
            File file2 = new File(str4);
            if (file2.exists() && file2.length() != j15) {
                if (b8.m(cVar2.a, file2.length())) {
                    boolean C = o5.C(j10);
                    String name = file2.getName();
                    if (str5 == null) {
                        int lastIndexOf = str4.lastIndexOf(46);
                        if (lastIndexOf == -1) {
                            str6 = "";
                            lowerCase = str6.toLowerCase();
                            if (lowerCase.equals("mp3") && !lowerCase.equals("m4a")) {
                                if (lowerCase.equals("opus") || lowerCase.equals("ogg") || lowerCase.equals("flac")) {
                                    try {
                                        MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                                        try {
                                            try {
                                                mediaMetadataRetriever2.setDataSource(file2.getAbsolutePath());
                                                if (mediaMetadataRetriever2.extractMetadata(9) != null) {
                                                    obj = "flac";
                                                    obj2 = "opus";
                                                    try {
                                                        int ceil = (int) Math.ceil(Long.parseLong(r0) / 1000.0f);
                                                        try {
                                                            String extractMetadata = mediaMetadataRetriever2.extractMetadata(7);
                                                            i20 = ceil;
                                                            try {
                                                                str24 = extractMetadata;
                                                                str25 = mediaMetadataRetriever2.extractMetadata(i13);
                                                            } catch (Exception e15) {
                                                                e = e15;
                                                                str22 = extractMetadata;
                                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                                                bitmap4 = null;
                                                                z17 = true;
                                                                str23 = null;
                                                                try {
                                                                    f8.g(e, z17);
                                                                    if (mediaMetadataRetriever != null) {
                                                                    }
                                                                    bitmap2 = bitmap4;
                                                                    i14 = i20;
                                                                    str11 = str22;
                                                                    str10 = str23;
                                                                    str7 = lowerCase;
                                                                    z14 = false;
                                                                    if (i14 != 0) {
                                                                    }
                                                                    if (str26 != null) {
                                                                    }
                                                                    z15 = false;
                                                                    if (iVar == null) {
                                                                    }
                                                                    if (z15) {
                                                                    }
                                                                    Bitmap bitmap6 = bitmap2;
                                                                    obj4 = "mp3";
                                                                    bitmap3 = bitmap6;
                                                                    Object obj8 = obj3;
                                                                    mimeTypeMap2 = mimeTypeMap;
                                                                    obj5 = obj8;
                                                                    str12 = str26;
                                                                    str13 = "";
                                                                    tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                                                                    file = file2;
                                                                    obj6 = obj2;
                                                                    z16 = C;
                                                                    num = 0;
                                                                    obj7 = obj;
                                                                    str14 = null;
                                                                    tL_document = null;
                                                                    if (tL_document != null) {
                                                                    }
                                                                    str16 = str13;
                                                                    if (charSequence != null) {
                                                                    }
                                                                    hashMap = new HashMap();
                                                                    if (str12 != null) {
                                                                    }
                                                                    if (z12) {
                                                                    }
                                                                    if (str15 != null) {
                                                                    }
                                                                    int i21 = 0;
                                                                    if (numArr != null) {
                                                                    }
                                                                    i15 = i21;
                                                                    if (z16) {
                                                                    }
                                                                    i16 = i10;
                                                                    j16 = j14;
                                                                    if (j16 != 0) {
                                                                    }
                                                                    final c cVar3 = cVar2;
                                                                    final TLRPC.TL_document tL_document3 = tL_document;
                                                                    final String str27 = str17;
                                                                    int i22 = i21;
                                                                    i0.g3(new Runnable() { // from class: org.telegram.messenger.jy
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            jj jjVar4 = jj.this;
                                                                            c cVar4 = cVar3;
                                                                            TLRPC.TL_document tL_document4 = tL_document3;
                                                                            String str28 = str4;
                                                                            HashMap hashMap2 = hashMap;
                                                                            String str29 = str27;
                                                                            if (jjVar4 != null) {
                                                                                qz.C(cVar4.a).t(jjVar4, null, null, null, tL_document4, str28, null, hashMap2, false, false, str29);
                                                                                return;
                                                                            }
                                                                            oz f7 = oz.f(tL_document4, null, str28, j10, jjVar, jjVar2, r11, arrayList, null, hashMap2, z11, i16, i11, 0, str29, null, false);
                                                                            f7.H = storyItem;
                                                                            f7.J = knVar;
                                                                            f7.K = swVar;
                                                                            f7.O = j11;
                                                                            f7.L = z13;
                                                                            f7.Q = j12;
                                                                            f7.R = j13;
                                                                            f7.T = ojVar;
                                                                            f7.k = i12;
                                                                            f7.j = iVar;
                                                                            qz.C(cVar4.a).r0(f7);
                                                                        }
                                                                    });
                                                                    return i22;
                                                                } catch (Throwable th3) {
                                                                    th2 = th3;
                                                                    if (mediaMetadataRetriever != null) {
                                                                    }
                                                                }
                                                            }
                                                        } catch (Exception e16) {
                                                            e = e16;
                                                            i20 = ceil;
                                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                                            bitmap4 = null;
                                                            z17 = true;
                                                            str22 = null;
                                                            str23 = null;
                                                            f8.g(e, z17);
                                                            if (mediaMetadataRetriever != null) {
                                                            }
                                                            bitmap2 = bitmap4;
                                                            i14 = i20;
                                                            str11 = str22;
                                                            str10 = str23;
                                                            str7 = lowerCase;
                                                            z14 = false;
                                                            if (i14 != 0) {
                                                            }
                                                            if (str26 != null) {
                                                            }
                                                            z15 = false;
                                                            if (iVar == null) {
                                                            }
                                                            if (z15) {
                                                            }
                                                            Bitmap bitmap62 = bitmap2;
                                                            obj4 = "mp3";
                                                            bitmap3 = bitmap62;
                                                            Object obj82 = obj3;
                                                            mimeTypeMap2 = mimeTypeMap;
                                                            obj5 = obj82;
                                                            str12 = str26;
                                                            str13 = "";
                                                            tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                                                            file = file2;
                                                            obj6 = obj2;
                                                            z16 = C;
                                                            num = 0;
                                                            obj7 = obj;
                                                            str14 = null;
                                                            tL_document = null;
                                                            if (tL_document != null) {
                                                            }
                                                            str16 = str13;
                                                            if (charSequence != null) {
                                                            }
                                                            hashMap = new HashMap();
                                                            if (str12 != null) {
                                                            }
                                                            if (z12) {
                                                            }
                                                            if (str15 != null) {
                                                            }
                                                            int i212 = 0;
                                                            if (numArr != null) {
                                                            }
                                                            i15 = i212;
                                                            if (z16) {
                                                            }
                                                            i16 = i10;
                                                            j16 = j14;
                                                            if (j16 != 0) {
                                                            }
                                                            final c cVar32 = cVar2;
                                                            final TLRPC.TL_document tL_document32 = tL_document;
                                                            final String str272 = str17;
                                                            int i222 = i212;
                                                            i0.g3(new Runnable() { // from class: org.telegram.messenger.jy
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    jj jjVar4 = jj.this;
                                                                    c cVar4 = cVar32;
                                                                    TLRPC.TL_document tL_document4 = tL_document32;
                                                                    String str28 = str4;
                                                                    HashMap hashMap2 = hashMap;
                                                                    String str29 = str272;
                                                                    if (jjVar4 != null) {
                                                                        qz.C(cVar4.a).t(jjVar4, null, null, null, tL_document4, str28, null, hashMap2, false, false, str29);
                                                                        return;
                                                                    }
                                                                    oz f7 = oz.f(tL_document4, null, str28, j10, jjVar, jjVar2, r11, arrayList, null, hashMap2, z11, i16, i11, 0, str29, null, false);
                                                                    f7.H = storyItem;
                                                                    f7.J = knVar;
                                                                    f7.K = swVar;
                                                                    f7.O = j11;
                                                                    f7.L = z13;
                                                                    f7.Q = j12;
                                                                    f7.R = j13;
                                                                    f7.T = ojVar;
                                                                    f7.k = i12;
                                                                    f7.j = iVar;
                                                                    qz.C(cVar4.a).r0(f7);
                                                                }
                                                            });
                                                            return i222;
                                                        }
                                                    } catch (Exception e17) {
                                                        e = e17;
                                                        mediaMetadataRetriever = mediaMetadataRetriever2;
                                                        bitmap4 = null;
                                                        z17 = true;
                                                        i20 = 0;
                                                        str22 = null;
                                                        str23 = null;
                                                        f8.g(e, z17);
                                                        if (mediaMetadataRetriever != null) {
                                                        }
                                                        bitmap2 = bitmap4;
                                                        i14 = i20;
                                                        str11 = str22;
                                                        str10 = str23;
                                                        str7 = lowerCase;
                                                        z14 = false;
                                                        if (i14 != 0) {
                                                        }
                                                        if (str26 != null) {
                                                        }
                                                        z15 = false;
                                                        if (iVar == null) {
                                                        }
                                                        if (z15) {
                                                        }
                                                        Bitmap bitmap622 = bitmap2;
                                                        obj4 = "mp3";
                                                        bitmap3 = bitmap622;
                                                        Object obj822 = obj3;
                                                        mimeTypeMap2 = mimeTypeMap;
                                                        obj5 = obj822;
                                                        str12 = str26;
                                                        str13 = "";
                                                        tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                                                        file = file2;
                                                        obj6 = obj2;
                                                        z16 = C;
                                                        num = 0;
                                                        obj7 = obj;
                                                        str14 = null;
                                                        tL_document = null;
                                                        if (tL_document != null) {
                                                        }
                                                        str16 = str13;
                                                        if (charSequence != null) {
                                                        }
                                                        hashMap = new HashMap();
                                                        if (str12 != null) {
                                                        }
                                                        if (z12) {
                                                        }
                                                        if (str15 != null) {
                                                        }
                                                        int i2122 = 0;
                                                        if (numArr != null) {
                                                        }
                                                        i15 = i2122;
                                                        if (z16) {
                                                        }
                                                        i16 = i10;
                                                        j16 = j14;
                                                        if (j16 != 0) {
                                                        }
                                                        final c cVar322 = cVar2;
                                                        final TLRPC.TL_document tL_document322 = tL_document;
                                                        final String str2722 = str17;
                                                        int i2222 = i2122;
                                                        i0.g3(new Runnable() { // from class: org.telegram.messenger.jy
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                jj jjVar4 = jj.this;
                                                                c cVar4 = cVar322;
                                                                TLRPC.TL_document tL_document4 = tL_document322;
                                                                String str28 = str4;
                                                                HashMap hashMap2 = hashMap;
                                                                String str29 = str2722;
                                                                if (jjVar4 != null) {
                                                                    qz.C(cVar4.a).t(jjVar4, null, null, null, tL_document4, str28, null, hashMap2, false, false, str29);
                                                                    return;
                                                                }
                                                                oz f7 = oz.f(tL_document4, null, str28, j10, jjVar, jjVar2, r11, arrayList, null, hashMap2, z11, i16, i11, 0, str29, null, false);
                                                                f7.H = storyItem;
                                                                f7.J = knVar;
                                                                f7.K = swVar;
                                                                f7.O = j11;
                                                                f7.L = z13;
                                                                f7.Q = j12;
                                                                f7.R = j13;
                                                                f7.T = ojVar;
                                                                f7.k = i12;
                                                                f7.j = iVar;
                                                                qz.C(cVar4.a).r0(f7);
                                                            }
                                                        });
                                                        return i2222;
                                                    }
                                                } else {
                                                    obj = "flac";
                                                    obj2 = "opus";
                                                    str24 = null;
                                                    str25 = null;
                                                    i20 = 0;
                                                }
                                                try {
                                                    byte[] embeddedPicture = mediaMetadataRetriever2.getEmbeddedPicture();
                                                    if (embeddedPicture != null) {
                                                        str22 = str24;
                                                        try {
                                                            str23 = str25;
                                                        } catch (Exception e18) {
                                                            e = e18;
                                                            str23 = str25;
                                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                                            bitmap4 = null;
                                                            z17 = true;
                                                            f8.g(e, z17);
                                                            if (mediaMetadataRetriever != null) {
                                                                try {
                                                                    mediaMetadataRetriever.release();
                                                                } catch (Exception e19) {
                                                                    f8.g(e19, z17);
                                                                }
                                                            }
                                                            bitmap2 = bitmap4;
                                                            i14 = i20;
                                                            str11 = str22;
                                                            str10 = str23;
                                                            str7 = lowerCase;
                                                            z14 = false;
                                                            if (i14 != 0) {
                                                            }
                                                            if (str26 != null) {
                                                            }
                                                            z15 = false;
                                                            if (iVar == null) {
                                                            }
                                                            if (z15) {
                                                            }
                                                            Bitmap bitmap6222 = bitmap2;
                                                            obj4 = "mp3";
                                                            bitmap3 = bitmap6222;
                                                            Object obj8222 = obj3;
                                                            mimeTypeMap2 = mimeTypeMap;
                                                            obj5 = obj8222;
                                                            str12 = str26;
                                                            str13 = "";
                                                            tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                                                            file = file2;
                                                            obj6 = obj2;
                                                            z16 = C;
                                                            num = 0;
                                                            obj7 = obj;
                                                            str14 = null;
                                                            tL_document = null;
                                                            if (tL_document != null) {
                                                            }
                                                            str16 = str13;
                                                            if (charSequence != null) {
                                                            }
                                                            hashMap = new HashMap();
                                                            if (str12 != null) {
                                                            }
                                                            if (z12) {
                                                            }
                                                            if (str15 != null) {
                                                            }
                                                            int i21222 = 0;
                                                            if (numArr != null) {
                                                            }
                                                            i15 = i21222;
                                                            if (z16) {
                                                            }
                                                            i16 = i10;
                                                            j16 = j14;
                                                            if (j16 != 0) {
                                                            }
                                                            final c cVar3222 = cVar2;
                                                            final TLRPC.TL_document tL_document3222 = tL_document;
                                                            final String str27222 = str17;
                                                            int i22222 = i21222;
                                                            i0.g3(new Runnable() { // from class: org.telegram.messenger.jy
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    jj jjVar4 = jj.this;
                                                                    c cVar4 = cVar3222;
                                                                    TLRPC.TL_document tL_document4 = tL_document3222;
                                                                    String str28 = str4;
                                                                    HashMap hashMap2 = hashMap;
                                                                    String str29 = str27222;
                                                                    if (jjVar4 != null) {
                                                                        qz.C(cVar4.a).t(jjVar4, null, null, null, tL_document4, str28, null, hashMap2, false, false, str29);
                                                                        return;
                                                                    }
                                                                    oz f7 = oz.f(tL_document4, null, str28, j10, jjVar, jjVar2, r11, arrayList, null, hashMap2, z11, i16, i11, 0, str29, null, false);
                                                                    f7.H = storyItem;
                                                                    f7.J = knVar;
                                                                    f7.K = swVar;
                                                                    f7.O = j11;
                                                                    f7.L = z13;
                                                                    f7.Q = j12;
                                                                    f7.R = j13;
                                                                    f7.T = ojVar;
                                                                    f7.k = i12;
                                                                    f7.j = iVar;
                                                                    qz.C(cVar4.a).r0(f7);
                                                                }
                                                            });
                                                            return i22222;
                                                        }
                                                        try {
                                                            bitmap5 = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
                                                        } catch (Exception e20) {
                                                            e = e20;
                                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                                            bitmap4 = null;
                                                            z17 = true;
                                                            f8.g(e, z17);
                                                            if (mediaMetadataRetriever != null) {
                                                            }
                                                            bitmap2 = bitmap4;
                                                            i14 = i20;
                                                            str11 = str22;
                                                            str10 = str23;
                                                            str7 = lowerCase;
                                                            z14 = false;
                                                            if (i14 != 0) {
                                                            }
                                                            if (str26 != null) {
                                                            }
                                                            z15 = false;
                                                            if (iVar == null) {
                                                            }
                                                            if (z15) {
                                                            }
                                                            Bitmap bitmap62222 = bitmap2;
                                                            obj4 = "mp3";
                                                            bitmap3 = bitmap62222;
                                                            Object obj82222 = obj3;
                                                            mimeTypeMap2 = mimeTypeMap;
                                                            obj5 = obj82222;
                                                            str12 = str26;
                                                            str13 = "";
                                                            tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                                                            file = file2;
                                                            obj6 = obj2;
                                                            z16 = C;
                                                            num = 0;
                                                            obj7 = obj;
                                                            str14 = null;
                                                            tL_document = null;
                                                            if (tL_document != null) {
                                                            }
                                                            str16 = str13;
                                                            if (charSequence != null) {
                                                            }
                                                            hashMap = new HashMap();
                                                            if (str12 != null) {
                                                            }
                                                            if (z12) {
                                                            }
                                                            if (str15 != null) {
                                                            }
                                                            int i212222 = 0;
                                                            if (numArr != null) {
                                                            }
                                                            i15 = i212222;
                                                            if (z16) {
                                                            }
                                                            i16 = i10;
                                                            j16 = j14;
                                                            if (j16 != 0) {
                                                            }
                                                            final c cVar32222 = cVar2;
                                                            final TLRPC.TL_document tL_document32222 = tL_document;
                                                            final String str272222 = str17;
                                                            int i222222 = i212222;
                                                            i0.g3(new Runnable() { // from class: org.telegram.messenger.jy
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    jj jjVar4 = jj.this;
                                                                    c cVar4 = cVar32222;
                                                                    TLRPC.TL_document tL_document4 = tL_document32222;
                                                                    String str28 = str4;
                                                                    HashMap hashMap2 = hashMap;
                                                                    String str29 = str272222;
                                                                    if (jjVar4 != null) {
                                                                        qz.C(cVar4.a).t(jjVar4, null, null, null, tL_document4, str28, null, hashMap2, false, false, str29);
                                                                        return;
                                                                    }
                                                                    oz f7 = oz.f(tL_document4, null, str28, j10, jjVar, jjVar2, r11, arrayList, null, hashMap2, z11, i16, i11, 0, str29, null, false);
                                                                    f7.H = storyItem;
                                                                    f7.J = knVar;
                                                                    f7.K = swVar;
                                                                    f7.O = j11;
                                                                    f7.L = z13;
                                                                    f7.Q = j12;
                                                                    f7.R = j13;
                                                                    f7.T = ojVar;
                                                                    f7.k = i12;
                                                                    f7.j = iVar;
                                                                    qz.C(cVar4.a).r0(f7);
                                                                }
                                                            });
                                                            return i222222;
                                                        }
                                                    } else {
                                                        str22 = str24;
                                                        str23 = str25;
                                                        bitmap5 = null;
                                                    }
                                                    if (jjVar3 == null) {
                                                        try {
                                                            if (lowerCase.equals("ogg")) {
                                                                if (MediaController.isOpusFile(file2.getAbsolutePath()) == 1) {
                                                                    z18 = true;
                                                                    mediaMetadataRetriever2.release();
                                                                    int i23 = i20;
                                                                    str7 = lowerCase;
                                                                    z14 = z18;
                                                                    i14 = i23;
                                                                    bitmap2 = bitmap5;
                                                                    str11 = str22;
                                                                    str10 = str23;
                                                                }
                                                            }
                                                        } catch (Exception e21) {
                                                            e = e21;
                                                            bitmap4 = bitmap5;
                                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                                            z17 = true;
                                                            f8.g(e, z17);
                                                            if (mediaMetadataRetriever != null) {
                                                            }
                                                            bitmap2 = bitmap4;
                                                            i14 = i20;
                                                            str11 = str22;
                                                            str10 = str23;
                                                            str7 = lowerCase;
                                                            z14 = false;
                                                            if (i14 != 0) {
                                                            }
                                                            if (str26 != null) {
                                                            }
                                                            z15 = false;
                                                            if (iVar == null) {
                                                            }
                                                            if (z15) {
                                                            }
                                                            Bitmap bitmap622222 = bitmap2;
                                                            obj4 = "mp3";
                                                            bitmap3 = bitmap622222;
                                                            Object obj822222 = obj3;
                                                            mimeTypeMap2 = mimeTypeMap;
                                                            obj5 = obj822222;
                                                            str12 = str26;
                                                            str13 = "";
                                                            tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                                                            file = file2;
                                                            obj6 = obj2;
                                                            z16 = C;
                                                            num = 0;
                                                            obj7 = obj;
                                                            str14 = null;
                                                            tL_document = null;
                                                            if (tL_document != null) {
                                                            }
                                                            str16 = str13;
                                                            if (charSequence != null) {
                                                            }
                                                            hashMap = new HashMap();
                                                            if (str12 != null) {
                                                            }
                                                            if (z12) {
                                                            }
                                                            if (str15 != null) {
                                                            }
                                                            int i2122222 = 0;
                                                            if (numArr != null) {
                                                            }
                                                            i15 = i2122222;
                                                            if (z16) {
                                                            }
                                                            i16 = i10;
                                                            j16 = j14;
                                                            if (j16 != 0) {
                                                            }
                                                            final c cVar322222 = cVar2;
                                                            final TLRPC.TL_document tL_document322222 = tL_document;
                                                            final String str2722222 = str17;
                                                            int i2222222 = i2122222;
                                                            i0.g3(new Runnable() { // from class: org.telegram.messenger.jy
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    jj jjVar4 = jj.this;
                                                                    c cVar4 = cVar322222;
                                                                    TLRPC.TL_document tL_document4 = tL_document322222;
                                                                    String str28 = str4;
                                                                    HashMap hashMap2 = hashMap;
                                                                    String str29 = str2722222;
                                                                    if (jjVar4 != null) {
                                                                        qz.C(cVar4.a).t(jjVar4, null, null, null, tL_document4, str28, null, hashMap2, false, false, str29);
                                                                        return;
                                                                    }
                                                                    oz f7 = oz.f(tL_document4, null, str28, j10, jjVar, jjVar2, r11, arrayList, null, hashMap2, z11, i16, i11, 0, str29, null, false);
                                                                    f7.H = storyItem;
                                                                    f7.J = knVar;
                                                                    f7.K = swVar;
                                                                    f7.O = j11;
                                                                    f7.L = z13;
                                                                    f7.Q = j12;
                                                                    f7.R = j13;
                                                                    f7.T = ojVar;
                                                                    f7.k = i12;
                                                                    f7.j = iVar;
                                                                    qz.C(cVar4.a).r0(f7);
                                                                }
                                                            });
                                                            return i2222222;
                                                        }
                                                    }
                                                    z18 = false;
                                                    mediaMetadataRetriever2.release();
                                                    int i232 = i20;
                                                    str7 = lowerCase;
                                                    z14 = z18;
                                                    i14 = i232;
                                                    bitmap2 = bitmap5;
                                                    str11 = str22;
                                                    str10 = str23;
                                                } catch (Exception e22) {
                                                    e = e22;
                                                    str22 = str24;
                                                }
                                            } catch (Throwable th4) {
                                                th2 = th4;
                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                                if (mediaMetadataRetriever != null) {
                                                    throw th2;
                                                }
                                                try {
                                                    mediaMetadataRetriever.release();
                                                    throw th2;
                                                } catch (Exception e23) {
                                                    f8.g(e23, true);
                                                    throw th2;
                                                }
                                            }
                                        } catch (Exception e24) {
                                            e = e24;
                                            obj = "flac";
                                            obj2 = "opus";
                                        }
                                    } catch (Exception e25) {
                                        e = e25;
                                        obj = "flac";
                                        obj2 = "opus";
                                        bitmap4 = null;
                                        mediaMetadataRetriever = null;
                                    } catch (Throwable th5) {
                                        th2 = th5;
                                        mediaMetadataRetriever = null;
                                    }
                                } else {
                                    str7 = lowerCase;
                                    obj = "flac";
                                    obj2 = "opus";
                                    str10 = null;
                                    z14 = false;
                                    i14 = 0;
                                    str11 = null;
                                    bitmap2 = null;
                                }
                                if (i14 != 0) {
                                    boolean z20 = z14;
                                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio3 = new TLRPC.TL_documentAttributeAudio();
                                    obj3 = "ogg";
                                    tL_documentAttributeAudio3.duration = i14;
                                    tL_documentAttributeAudio3.title = str11;
                                    tL_documentAttributeAudio3.performer = str10;
                                    if (str11 == null) {
                                        tL_documentAttributeAudio3.title = "";
                                    }
                                    int i24 = tL_documentAttributeAudio3.flags;
                                    tL_documentAttributeAudio3.flags = i24 | 1;
                                    if (str10 == null) {
                                        tL_documentAttributeAudio3.performer = "";
                                    }
                                    tL_documentAttributeAudio3.flags = i24 | 3;
                                    if (z20) {
                                        tL_documentAttributeAudio3.voice = true;
                                    }
                                    tL_documentAttributeAudio = tL_documentAttributeAudio3;
                                } else {
                                    obj3 = "ogg";
                                    tL_documentAttributeAudio = null;
                                }
                                if (str26 != null) {
                                    if (str26.endsWith("attheme")) {
                                        z15 = true;
                                        boolean z21 = iVar == null;
                                        if (!z15 || C || z21) {
                                            Bitmap bitmap6222222 = bitmap2;
                                            obj4 = "mp3";
                                            bitmap3 = bitmap6222222;
                                            Object obj8222222 = obj3;
                                            mimeTypeMap2 = mimeTypeMap;
                                            obj5 = obj8222222;
                                            str12 = str26;
                                            str13 = "";
                                            tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                                            file = file2;
                                            obj6 = obj2;
                                            z16 = C;
                                            num = 0;
                                            obj7 = obj;
                                            str14 = null;
                                            tL_document = null;
                                        } else {
                                            Object[] g02 = hs.a0(cVar2.a).g0(!C ? 1 : 4, str26);
                                            if (g02 != null) {
                                                Object obj9 = g02[0];
                                                if (obj9 instanceof TLRPC.TL_document) {
                                                    tL_document2 = (TLRPC.TL_document) obj9;
                                                    str19 = (String) g02[1];
                                                    if (tL_document2 == null || str4.equals(str26) || C) {
                                                        str20 = str19;
                                                    } else {
                                                        hs a02 = hs.a0(cVar2.a);
                                                        StringBuilder t11 = a1.g.t(str4);
                                                        str20 = str19;
                                                        t11.append(file2.length());
                                                        Object[] g03 = a02.g0(!C ? 1 : 4, t11.toString());
                                                        if (g03 != null) {
                                                            Object obj10 = g03[0];
                                                            if (obj10 instanceof TLRPC.TL_document) {
                                                                tL_document2 = (TLRPC.TL_document) obj10;
                                                                str21 = (String) g03[1];
                                                                str13 = "";
                                                                TLRPC.TL_document tL_document4 = tL_document2;
                                                                Bitmap bitmap7 = bitmap2;
                                                                obj4 = "mp3";
                                                                bitmap3 = bitmap7;
                                                                Object obj11 = obj3;
                                                                mimeTypeMap2 = mimeTypeMap;
                                                                obj5 = obj11;
                                                                tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                                                                str12 = str26;
                                                                file = file2;
                                                                obj6 = obj2;
                                                                z16 = C;
                                                                cVar2 = cVar;
                                                                num = 0;
                                                                obj7 = obj;
                                                                w(cVar2, z16, tL_document4, str4, null, 0L, false);
                                                                str14 = str21;
                                                                tL_document = tL_document4;
                                                            }
                                                        }
                                                    }
                                                    str21 = str20;
                                                    str13 = "";
                                                    TLRPC.TL_document tL_document42 = tL_document2;
                                                    Bitmap bitmap72 = bitmap2;
                                                    obj4 = "mp3";
                                                    bitmap3 = bitmap72;
                                                    Object obj112 = obj3;
                                                    mimeTypeMap2 = mimeTypeMap;
                                                    obj5 = obj112;
                                                    tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                                                    str12 = str26;
                                                    file = file2;
                                                    obj6 = obj2;
                                                    z16 = C;
                                                    cVar2 = cVar;
                                                    num = 0;
                                                    obj7 = obj;
                                                    w(cVar2, z16, tL_document42, str4, null, 0L, false);
                                                    str14 = str21;
                                                    tL_document = tL_document42;
                                                }
                                            }
                                            str19 = null;
                                            tL_document2 = null;
                                            if (tL_document2 == null) {
                                            }
                                            str20 = str19;
                                            str21 = str20;
                                            str13 = "";
                                            TLRPC.TL_document tL_document422 = tL_document2;
                                            Bitmap bitmap722 = bitmap2;
                                            obj4 = "mp3";
                                            bitmap3 = bitmap722;
                                            Object obj1122 = obj3;
                                            mimeTypeMap2 = mimeTypeMap;
                                            obj5 = obj1122;
                                            tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                                            str12 = str26;
                                            file = file2;
                                            obj6 = obj2;
                                            z16 = C;
                                            cVar2 = cVar;
                                            num = 0;
                                            obj7 = obj;
                                            w(cVar2, z16, tL_document422, str4, null, 0L, false);
                                            str14 = str21;
                                            tL_document = tL_document422;
                                        }
                                        if (tL_document != null) {
                                            tL_document = new TLRPC.TL_document();
                                            str15 = str14;
                                            tL_document.id = j15;
                                            tL_document.date = ConnectionsManager.getInstance(cVar2.a).getCurrentTime();
                                            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                            tL_documentAttributeFilename.file_name = name;
                                            tL_document.file_reference = new byte[0];
                                            tL_document.attributes.add(tL_documentAttributeFilename);
                                            tL_document.size = file.length();
                                            tL_document.dc_id = 0;
                                            if (tL_documentAttributeAudio2 != null) {
                                                tL_document.attributes.add(tL_documentAttributeAudio2);
                                            }
                                            if (str6.length() != 0) {
                                                switch (str7.hashCode()) {
                                                    case 106458:
                                                        str18 = str7;
                                                        if (str18.equals("m4a")) {
                                                            c10 = 0;
                                                            break;
                                                        }
                                                        c10 = 65535;
                                                        break;
                                                    case 108272:
                                                        str18 = str7;
                                                        if (str18.equals(obj4)) {
                                                            c10 = 1;
                                                            break;
                                                        }
                                                        c10 = 65535;
                                                        break;
                                                    case 109967:
                                                        str18 = str7;
                                                        if (str18.equals(obj5)) {
                                                            c10 = 2;
                                                            break;
                                                        }
                                                        c10 = 65535;
                                                        break;
                                                    case 3145576:
                                                        str18 = str7;
                                                        if (str18.equals(obj7)) {
                                                            c10 = 3;
                                                            break;
                                                        }
                                                        c10 = 65535;
                                                        break;
                                                    case 3418175:
                                                        str18 = str7;
                                                        if (str18.equals(obj6)) {
                                                            c10 = 4;
                                                            break;
                                                        }
                                                        c10 = 65535;
                                                        break;
                                                    case 3645340:
                                                        str18 = str7;
                                                        if (str18.equals("webp")) {
                                                            c10 = 5;
                                                            break;
                                                        }
                                                        c10 = 65535;
                                                        break;
                                                    default:
                                                        c10 = 65535;
                                                        str18 = str7;
                                                        break;
                                                }
                                                switch (c10) {
                                                    case 0:
                                                        tL_document.mime_type = "audio/m4a";
                                                        break;
                                                    case 1:
                                                        tL_document.mime_type = "audio/mpeg";
                                                        break;
                                                    case 2:
                                                        tL_document.mime_type = "audio/ogg";
                                                        break;
                                                    case 3:
                                                        tL_document.mime_type = "audio/flac";
                                                        break;
                                                    case 4:
                                                        tL_document.mime_type = "audio/opus";
                                                        break;
                                                    case 5:
                                                        tL_document.mime_type = "image/webp";
                                                        break;
                                                    default:
                                                        String mimeTypeFromExtension = mimeTypeMap2.getMimeTypeFromExtension(str18);
                                                        if (mimeTypeFromExtension == null) {
                                                            tL_document.mime_type = "application/octet-stream";
                                                            break;
                                                        } else {
                                                            tL_document.mime_type = mimeTypeFromExtension;
                                                            break;
                                                        }
                                                }
                                            } else {
                                                tL_document.mime_type = "application/octet-stream";
                                            }
                                            if (!z12 && tL_document.mime_type.equals("image/gif") && (jjVar3 == null || jjVar3.e1() == 0)) {
                                                try {
                                                    uri2 = null;
                                                    try {
                                                        Bitmap K2 = hc.K(file.getAbsolutePath(), null, 90.0f, 90.0f, true);
                                                        if (K2 != null) {
                                                            tL_documentAttributeFilename.file_name = "animation.gif";
                                                            tL_document.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                                            TLRPC.PhotoSize Z = hc.Z(K2, 90.0f, 90.0f, 55, z16);
                                                            if (Z != null) {
                                                                tL_document.thumbs.add(Z);
                                                                tL_document.flags |= 1;
                                                            }
                                                            K2.recycle();
                                                        }
                                                    } catch (Exception e26) {
                                                        e = e26;
                                                        i17 = 1;
                                                        f8.g(e, true);
                                                        if (bitmap3 != null) {
                                                        }
                                                        if (tL_document.mime_type.equals("image/webp")) {
                                                            options = new BitmapFactory.Options();
                                                            try {
                                                                options.inJustDecodeBounds = true;
                                                                BitmapFactory.decodeFile(str4, options);
                                                            } catch (Exception e27) {
                                                                f8.g(e27, true);
                                                            }
                                                            i18 = options.outWidth;
                                                            if (i18 != 0) {
                                                                TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                                                                str16 = str13;
                                                                tL_documentAttributeSticker.alt = str16;
                                                                tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                                                                tL_document.attributes.add(tL_documentAttributeSticker);
                                                                TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                                                                tL_documentAttributeImageSize.w = options.outWidth;
                                                                tL_documentAttributeImageSize.h = options.outHeight;
                                                                tL_document.attributes.add(tL_documentAttributeImageSize);
                                                                b02 = hc.b0(null, hc.K(file.getAbsolutePath(), uri2, 400.0f, 400.0f, true), Bitmap.CompressFormat.PNG, 400.0f, 400.0f, 100, z16, 0, 0, false);
                                                                if (b02 != null) {
                                                                }
                                                                if (charSequence != null) {
                                                                }
                                                                hashMap = new HashMap();
                                                                if (str12 != null) {
                                                                }
                                                                if (z12) {
                                                                }
                                                                if (str15 != null) {
                                                                }
                                                                int i21222222 = 0;
                                                                if (numArr != null) {
                                                                }
                                                                i15 = i21222222;
                                                                if (z16) {
                                                                }
                                                                i16 = i10;
                                                                j16 = j14;
                                                                if (j16 != 0) {
                                                                }
                                                                final c cVar3222222 = cVar2;
                                                                final TLRPC.TL_document tL_document3222222 = tL_document;
                                                                final String str27222222 = str17;
                                                                int i22222222 = i21222222;
                                                                i0.g3(new Runnable() { // from class: org.telegram.messenger.jy
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        jj jjVar4 = jj.this;
                                                                        c cVar4 = cVar3222222;
                                                                        TLRPC.TL_document tL_document43 = tL_document3222222;
                                                                        String str28 = str4;
                                                                        HashMap hashMap2 = hashMap;
                                                                        String str29 = str27222222;
                                                                        if (jjVar4 != null) {
                                                                            qz.C(cVar4.a).t(jjVar4, null, null, null, tL_document43, str28, null, hashMap2, false, false, str29);
                                                                            return;
                                                                        }
                                                                        oz f7 = oz.f(tL_document43, null, str28, j10, jjVar, jjVar2, r11, arrayList, null, hashMap2, z11, i16, i11, 0, str29, null, false);
                                                                        f7.H = storyItem;
                                                                        f7.J = knVar;
                                                                        f7.K = swVar;
                                                                        f7.O = j11;
                                                                        f7.L = z13;
                                                                        f7.Q = j12;
                                                                        f7.R = j13;
                                                                        f7.T = ojVar;
                                                                        f7.k = i12;
                                                                        f7.j = iVar;
                                                                        qz.C(cVar4.a).r0(f7);
                                                                    }
                                                                });
                                                                return i22222222;
                                                            }
                                                        }
                                                        str16 = str13;
                                                        if (charSequence != null) {
                                                        }
                                                        hashMap = new HashMap();
                                                        if (str12 != null) {
                                                        }
                                                        if (z12) {
                                                        }
                                                        if (str15 != null) {
                                                        }
                                                        int i212222222 = 0;
                                                        if (numArr != null) {
                                                        }
                                                        i15 = i212222222;
                                                        if (z16) {
                                                        }
                                                        i16 = i10;
                                                        j16 = j14;
                                                        if (j16 != 0) {
                                                        }
                                                        final c cVar32222222 = cVar2;
                                                        final TLRPC.TL_document tL_document32222222 = tL_document;
                                                        final String str272222222 = str17;
                                                        int i222222222 = i212222222;
                                                        i0.g3(new Runnable() { // from class: org.telegram.messenger.jy
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                jj jjVar4 = jj.this;
                                                                c cVar4 = cVar32222222;
                                                                TLRPC.TL_document tL_document43 = tL_document32222222;
                                                                String str28 = str4;
                                                                HashMap hashMap2 = hashMap;
                                                                String str29 = str272222222;
                                                                if (jjVar4 != null) {
                                                                    qz.C(cVar4.a).t(jjVar4, null, null, null, tL_document43, str28, null, hashMap2, false, false, str29);
                                                                    return;
                                                                }
                                                                oz f7 = oz.f(tL_document43, null, str28, j10, jjVar, jjVar2, r11, arrayList, null, hashMap2, z11, i16, i11, 0, str29, null, false);
                                                                f7.H = storyItem;
                                                                f7.J = knVar;
                                                                f7.K = swVar;
                                                                f7.O = j11;
                                                                f7.L = z13;
                                                                f7.Q = j12;
                                                                f7.R = j13;
                                                                f7.T = ojVar;
                                                                f7.k = i12;
                                                                f7.j = iVar;
                                                                qz.C(cVar4.a).r0(f7);
                                                            }
                                                        });
                                                        return i222222222;
                                                    }
                                                } catch (Exception e28) {
                                                    e = e28;
                                                    uri2 = null;
                                                }
                                            } else {
                                                uri2 = null;
                                            }
                                            i17 = 1;
                                            if (bitmap3 != null) {
                                                Bitmap bitmap8 = bitmap3;
                                                TLRPC.PhotoSize Z2 = hc.Z(bitmap8, 132.0f, 132.0f, 55, z16);
                                                if (Z2 != null) {
                                                    tL_document.thumbs.add(Z2);
                                                    tL_document.flags |= i17;
                                                }
                                                bitmap8.recycle();
                                            }
                                            if (tL_document.mime_type.equals("image/webp") && jjVar3 == null) {
                                                options = new BitmapFactory.Options();
                                                options.inJustDecodeBounds = true;
                                                BitmapFactory.decodeFile(str4, options);
                                                i18 = options.outWidth;
                                                if (i18 != 0 && (i19 = options.outHeight) != 0 && i18 <= 800 && i19 <= 800) {
                                                    TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker2 = new TLRPC.TL_documentAttributeSticker();
                                                    str16 = str13;
                                                    tL_documentAttributeSticker2.alt = str16;
                                                    tL_documentAttributeSticker2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                                                    tL_document.attributes.add(tL_documentAttributeSticker2);
                                                    TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize2 = new TLRPC.TL_documentAttributeImageSize();
                                                    tL_documentAttributeImageSize2.w = options.outWidth;
                                                    tL_documentAttributeImageSize2.h = options.outHeight;
                                                    tL_document.attributes.add(tL_documentAttributeImageSize2);
                                                    b02 = hc.b0(null, hc.K(file.getAbsolutePath(), uri2, 400.0f, 400.0f, true), Bitmap.CompressFormat.PNG, 400.0f, 400.0f, 100, z16, 0, 0, false);
                                                    if (b02 != null) {
                                                        tL_document.thumbs.add(b02);
                                                        tL_document.flags |= 1;
                                                    }
                                                    final String charSequence2 = charSequence != null ? charSequence.toString() : str16;
                                                    hashMap = new HashMap();
                                                    if (str12 != null) {
                                                        hashMap.put("originalPath", str12);
                                                    }
                                                    if (z12 && tL_documentAttributeAudio2 == null) {
                                                        hashMap.put("forceDocument", "1");
                                                    }
                                                    if (str15 != null) {
                                                        str17 = str15;
                                                        hashMap.put("parentObject", str17);
                                                    } else {
                                                        str17 = str15;
                                                    }
                                                    int i2122222222 = 0;
                                                    if (numArr != null) {
                                                        Integer num3 = numArr[0];
                                                        String str28 = tL_document.mime_type;
                                                        if (str28 != null && str28.toLowerCase().startsWith("image/webp")) {
                                                            numArr[0] = -1;
                                                            num2 = num3;
                                                            i15 = 1;
                                                            i2122222222 = 0;
                                                            if (!z16 || jArr == null) {
                                                                i16 = i10;
                                                            } else {
                                                                if (numArr == null || num2 == null || num2 == numArr[i2122222222] || iVar != null) {
                                                                    i16 = i10;
                                                                } else {
                                                                    i16 = i10;
                                                                    z(cVar2, jArr[i2122222222], i16);
                                                                    jArr[i2122222222] = Utilities.b.nextLong();
                                                                }
                                                                if (i15 == 0) {
                                                                    hashMap.put("groupId", str16 + jArr[i2122222222]);
                                                                    if (z10) {
                                                                        hashMap.put("final", "1");
                                                                    }
                                                                }
                                                            }
                                                            j16 = j14;
                                                            if (j16 != 0) {
                                                                hashMap.put("groupId", str16 + j16);
                                                            }
                                                            final c cVar322222222 = cVar2;
                                                            final TLRPC.TL_document tL_document322222222 = tL_document;
                                                            final String str2722222222 = str17;
                                                            int i2222222222 = i2122222222;
                                                            i0.g3(new Runnable() { // from class: org.telegram.messenger.jy
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    jj jjVar4 = jj.this;
                                                                    c cVar4 = cVar322222222;
                                                                    TLRPC.TL_document tL_document43 = tL_document322222222;
                                                                    String str282 = str4;
                                                                    HashMap hashMap2 = hashMap;
                                                                    String str29 = str2722222222;
                                                                    if (jjVar4 != null) {
                                                                        qz.C(cVar4.a).t(jjVar4, null, null, null, tL_document43, str282, null, hashMap2, false, false, str29);
                                                                        return;
                                                                    }
                                                                    oz f7 = oz.f(tL_document43, null, str282, j10, jjVar, jjVar2, charSequence2, arrayList, null, hashMap2, z11, i16, i11, 0, str29, null, false);
                                                                    f7.H = storyItem;
                                                                    f7.J = knVar;
                                                                    f7.K = swVar;
                                                                    f7.O = j11;
                                                                    f7.L = z13;
                                                                    f7.Q = j12;
                                                                    f7.R = j13;
                                                                    f7.T = ojVar;
                                                                    f7.k = i12;
                                                                    f7.j = iVar;
                                                                    qz.C(cVar4.a).r0(f7);
                                                                }
                                                            });
                                                            return i2222222222;
                                                        }
                                                        String str29 = tL_document.mime_type;
                                                        if ((str29 == null || !(str29.toLowerCase().startsWith("image/") || tL_document.mime_type.toLowerCase().startsWith("video/mp4"))) && !jj.y(tL_document)) {
                                                            i2122222222 = 0;
                                                            if (tL_documentAttributeAudio2 != null) {
                                                                numArr[0] = 2;
                                                            } else {
                                                                numArr[0] = num;
                                                            }
                                                        } else {
                                                            i2122222222 = 0;
                                                            numArr[0] = 1;
                                                        }
                                                        num2 = num3;
                                                    } else {
                                                        num2 = num;
                                                    }
                                                    i15 = i2122222222;
                                                    if (z16) {
                                                    }
                                                    i16 = i10;
                                                    j16 = j14;
                                                    if (j16 != 0) {
                                                    }
                                                    final c cVar3222222222 = cVar2;
                                                    final TLRPC.TL_document tL_document3222222222 = tL_document;
                                                    final String str27222222222 = str17;
                                                    int i22222222222 = i2122222222;
                                                    i0.g3(new Runnable() { // from class: org.telegram.messenger.jy
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            jj jjVar4 = jj.this;
                                                            c cVar4 = cVar3222222222;
                                                            TLRPC.TL_document tL_document43 = tL_document3222222222;
                                                            String str282 = str4;
                                                            HashMap hashMap2 = hashMap;
                                                            String str292 = str27222222222;
                                                            if (jjVar4 != null) {
                                                                qz.C(cVar4.a).t(jjVar4, null, null, null, tL_document43, str282, null, hashMap2, false, false, str292);
                                                                return;
                                                            }
                                                            oz f7 = oz.f(tL_document43, null, str282, j10, jjVar, jjVar2, charSequence2, arrayList, null, hashMap2, z11, i16, i11, 0, str292, null, false);
                                                            f7.H = storyItem;
                                                            f7.J = knVar;
                                                            f7.K = swVar;
                                                            f7.O = j11;
                                                            f7.L = z13;
                                                            f7.Q = j12;
                                                            f7.R = j13;
                                                            f7.T = ojVar;
                                                            f7.k = i12;
                                                            f7.j = iVar;
                                                            qz.C(cVar4.a).r0(f7);
                                                        }
                                                    });
                                                    return i22222222222;
                                                }
                                            }
                                        } else {
                                            str15 = str14;
                                        }
                                        str16 = str13;
                                        if (charSequence != null) {
                                        }
                                        hashMap = new HashMap();
                                        if (str12 != null) {
                                        }
                                        if (z12) {
                                            hashMap.put("forceDocument", "1");
                                        }
                                        if (str15 != null) {
                                        }
                                        int i21222222222 = 0;
                                        if (numArr != null) {
                                        }
                                        i15 = i21222222222;
                                        if (z16) {
                                        }
                                        i16 = i10;
                                        j16 = j14;
                                        if (j16 != 0) {
                                        }
                                        final c cVar32222222222 = cVar2;
                                        final TLRPC.TL_document tL_document32222222222 = tL_document;
                                        final String str272222222222 = str17;
                                        int i222222222222 = i21222222222;
                                        i0.g3(new Runnable() { // from class: org.telegram.messenger.jy
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                jj jjVar4 = jj.this;
                                                c cVar4 = cVar32222222222;
                                                TLRPC.TL_document tL_document43 = tL_document32222222222;
                                                String str282 = str4;
                                                HashMap hashMap2 = hashMap;
                                                String str292 = str272222222222;
                                                if (jjVar4 != null) {
                                                    qz.C(cVar4.a).t(jjVar4, null, null, null, tL_document43, str282, null, hashMap2, false, false, str292);
                                                    return;
                                                }
                                                oz f7 = oz.f(tL_document43, null, str282, j10, jjVar, jjVar2, charSequence2, arrayList, null, hashMap2, z11, i16, i11, 0, str292, null, false);
                                                f7.H = storyItem;
                                                f7.J = knVar;
                                                f7.K = swVar;
                                                f7.O = j11;
                                                f7.L = z13;
                                                f7.Q = j12;
                                                f7.R = j13;
                                                f7.T = ojVar;
                                                f7.k = i12;
                                                f7.j = iVar;
                                                qz.C(cVar4.a).r0(f7);
                                            }
                                        });
                                        return i222222222222;
                                    }
                                    if (tL_documentAttributeAudio != null) {
                                        StringBuilder i25 = sc.e.i(str26, MediaStreamTrack.AUDIO_TRACK_KIND);
                                        i25.append(file2.length());
                                        sb2 = i25.toString();
                                    } else {
                                        StringBuilder i26 = sc.e.i(str26, "");
                                        i26.append(file2.length());
                                        sb2 = i26.toString();
                                    }
                                    str26 = sb2;
                                }
                                z15 = false;
                                if (iVar == null) {
                                }
                                if (z15) {
                                }
                                Bitmap bitmap62222222 = bitmap2;
                                obj4 = "mp3";
                                bitmap3 = bitmap62222222;
                                Object obj82222222 = obj3;
                                mimeTypeMap2 = mimeTypeMap;
                                obj5 = obj82222222;
                                str12 = str26;
                                str13 = "";
                                tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                                file = file2;
                                obj6 = obj2;
                                z16 = C;
                                num = 0;
                                obj7 = obj;
                                str14 = null;
                                tL_document = null;
                                if (tL_document != null) {
                                }
                                str16 = str13;
                                if (charSequence != null) {
                                }
                                hashMap = new HashMap();
                                if (str12 != null) {
                                }
                                if (z12) {
                                }
                                if (str15 != null) {
                                }
                                int i212222222222 = 0;
                                if (numArr != null) {
                                }
                                i15 = i212222222222;
                                if (z16) {
                                }
                                i16 = i10;
                                j16 = j14;
                                if (j16 != 0) {
                                }
                                final c cVar322222222222 = cVar2;
                                final TLRPC.TL_document tL_document322222222222 = tL_document;
                                final String str2722222222222 = str17;
                                int i2222222222222 = i212222222222;
                                i0.g3(new Runnable() { // from class: org.telegram.messenger.jy
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        jj jjVar4 = jj.this;
                                        c cVar4 = cVar322222222222;
                                        TLRPC.TL_document tL_document43 = tL_document322222222222;
                                        String str282 = str4;
                                        HashMap hashMap2 = hashMap;
                                        String str292 = str2722222222222;
                                        if (jjVar4 != null) {
                                            qz.C(cVar4.a).t(jjVar4, null, null, null, tL_document43, str282, null, hashMap2, false, false, str292);
                                            return;
                                        }
                                        oz f7 = oz.f(tL_document43, null, str282, j10, jjVar, jjVar2, charSequence2, arrayList, null, hashMap2, z11, i16, i11, 0, str292, null, false);
                                        f7.H = storyItem;
                                        f7.J = knVar;
                                        f7.K = swVar;
                                        f7.O = j11;
                                        f7.L = z13;
                                        f7.Q = j12;
                                        f7.R = j13;
                                        f7.T = ojVar;
                                        f7.k = i12;
                                        f7.j = iVar;
                                        qz.C(cVar4.a).r0(f7);
                                    }
                                });
                                return i2222222222222;
                            }
                            obj = "flac";
                            obj2 = "opus";
                            a2 = cf.a.a(file2);
                            if (a2 == null) {
                                long j21 = a2.b;
                                if (j21 != j15) {
                                    String str30 = a2.d;
                                    str7 = lowerCase;
                                    str8 = a2.c;
                                    i14 = (int) (j21 / 1000);
                                    str9 = str30;
                                } else {
                                    str7 = lowerCase;
                                    str8 = null;
                                    i14 = 0;
                                    str9 = null;
                                }
                                bitmap = a2.o;
                            } else {
                                str7 = lowerCase;
                                bitmap = null;
                                str8 = null;
                                i14 = 0;
                                str9 = null;
                            }
                            bitmap2 = bitmap;
                            str10 = str9;
                            str11 = str8;
                            z14 = false;
                            if (i14 != 0) {
                            }
                            if (str26 != null) {
                            }
                            z15 = false;
                            if (iVar == null) {
                            }
                            if (z15) {
                            }
                            Bitmap bitmap622222222 = bitmap2;
                            obj4 = "mp3";
                            bitmap3 = bitmap622222222;
                            Object obj822222222 = obj3;
                            mimeTypeMap2 = mimeTypeMap;
                            obj5 = obj822222222;
                            str12 = str26;
                            str13 = "";
                            tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                            file = file2;
                            obj6 = obj2;
                            z16 = C;
                            num = 0;
                            obj7 = obj;
                            str14 = null;
                            tL_document = null;
                            if (tL_document != null) {
                            }
                            str16 = str13;
                            if (charSequence != null) {
                            }
                            hashMap = new HashMap();
                            if (str12 != null) {
                            }
                            if (z12) {
                            }
                            if (str15 != null) {
                            }
                            int i2122222222222 = 0;
                            if (numArr != null) {
                            }
                            i15 = i2122222222222;
                            if (z16) {
                            }
                            i16 = i10;
                            j16 = j14;
                            if (j16 != 0) {
                            }
                            final c cVar3222222222222 = cVar2;
                            final TLRPC.TL_document tL_document3222222222222 = tL_document;
                            final String str27222222222222 = str17;
                            int i22222222222222 = i2122222222222;
                            i0.g3(new Runnable() { // from class: org.telegram.messenger.jy
                                @Override // java.lang.Runnable
                                public final void run() {
                                    jj jjVar4 = jj.this;
                                    c cVar4 = cVar3222222222222;
                                    TLRPC.TL_document tL_document43 = tL_document3222222222222;
                                    String str282 = str4;
                                    HashMap hashMap2 = hashMap;
                                    String str292 = str27222222222222;
                                    if (jjVar4 != null) {
                                        qz.C(cVar4.a).t(jjVar4, null, null, null, tL_document43, str282, null, hashMap2, false, false, str292);
                                        return;
                                    }
                                    oz f7 = oz.f(tL_document43, null, str282, j10, jjVar, jjVar2, charSequence2, arrayList, null, hashMap2, z11, i16, i11, 0, str292, null, false);
                                    f7.H = storyItem;
                                    f7.J = knVar;
                                    f7.K = swVar;
                                    f7.O = j11;
                                    f7.L = z13;
                                    f7.Q = j12;
                                    f7.R = j13;
                                    f7.T = ojVar;
                                    f7.k = i12;
                                    f7.j = iVar;
                                    qz.C(cVar4.a).r0(f7);
                                }
                            });
                            return i22222222222222;
                        }
                        str5 = str4.substring(lastIndexOf + 1);
                    }
                    str6 = str5;
                    lowerCase = str6.toLowerCase();
                    if (lowerCase.equals("mp3")) {
                    }
                    obj = "flac";
                    obj2 = "opus";
                    a2 = cf.a.a(file2);
                    if (a2 == null) {
                    }
                    bitmap2 = bitmap;
                    str10 = str9;
                    str11 = str8;
                    z14 = false;
                    if (i14 != 0) {
                    }
                    if (str26 != null) {
                    }
                    z15 = false;
                    if (iVar == null) {
                    }
                    if (z15) {
                    }
                    Bitmap bitmap6222222222 = bitmap2;
                    obj4 = "mp3";
                    bitmap3 = bitmap6222222222;
                    Object obj8222222222 = obj3;
                    mimeTypeMap2 = mimeTypeMap;
                    obj5 = obj8222222222;
                    str12 = str26;
                    str13 = "";
                    tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                    file = file2;
                    obj6 = obj2;
                    z16 = C;
                    num = 0;
                    obj7 = obj;
                    str14 = null;
                    tL_document = null;
                    if (tL_document != null) {
                    }
                    str16 = str13;
                    if (charSequence != null) {
                    }
                    hashMap = new HashMap();
                    if (str12 != null) {
                    }
                    if (z12) {
                    }
                    if (str15 != null) {
                    }
                    int i21222222222222 = 0;
                    if (numArr != null) {
                    }
                    i15 = i21222222222222;
                    if (z16) {
                    }
                    i16 = i10;
                    j16 = j14;
                    if (j16 != 0) {
                    }
                    final c cVar32222222222222 = cVar2;
                    final TLRPC.TL_document tL_document32222222222222 = tL_document;
                    final String str272222222222222 = str17;
                    int i222222222222222 = i21222222222222;
                    i0.g3(new Runnable() { // from class: org.telegram.messenger.jy
                        @Override // java.lang.Runnable
                        public final void run() {
                            jj jjVar4 = jj.this;
                            c cVar4 = cVar32222222222222;
                            TLRPC.TL_document tL_document43 = tL_document32222222222222;
                            String str282 = str4;
                            HashMap hashMap2 = hashMap;
                            String str292 = str272222222222222;
                            if (jjVar4 != null) {
                                qz.C(cVar4.a).t(jjVar4, null, null, null, tL_document43, str282, null, hashMap2, false, false, str292);
                                return;
                            }
                            oz f7 = oz.f(tL_document43, null, str282, j10, jjVar, jjVar2, charSequence2, arrayList, null, hashMap2, z11, i16, i11, 0, str292, null, false);
                            f7.H = storyItem;
                            f7.J = knVar;
                            f7.K = swVar;
                            f7.O = j11;
                            f7.L = z13;
                            f7.Q = j12;
                            f7.R = j13;
                            f7.T = ojVar;
                            f7.k = i12;
                            f7.j = iVar;
                            qz.C(cVar4.a).r0(f7);
                        }
                    });
                    return i222222222222222;
                }
                return i13;
            }
        }
        return 1;
    }

    public static void V(final int i10, final long j10, final long j11, final long j12, final long j13, final ih.i iVar, final String str, final String str2, final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3, final ArrayList arrayList4, final ArrayList arrayList5, final ArrayList arrayList6, final m2.t tVar, final c cVar, final jj jjVar, final jj jjVar2, final jj jjVar3, final oj ojVar, final sw swVar, final TL_stories.StoryItem storyItem, final org.telegram.ui.kn knVar, final boolean z10, final boolean z11) {
        if (arrayList == null && arrayList2 == null && arrayList3 == null) {
            return;
        }
        if (arrayList == null || arrayList2 == null || arrayList.size() == arrayList2.size()) {
            Utilities.e.c(new Runnable() { // from class: org.telegram.messenger.cy
                @Override // java.lang.Runnable
                public final void run() {
                    int i11;
                    boolean z12;
                    String str3;
                    long j14;
                    int i12;
                    c cVar2;
                    Uri uri;
                    long j15;
                    oj ojVar2;
                    long j16;
                    int i13;
                    ArrayList arrayList7;
                    boolean z13;
                    long[] jArr = new long[1];
                    Integer[] numArr = new Integer[1];
                    long j17 = j10;
                    boolean C = o5.C(j17);
                    ArrayList arrayList8 = arrayList;
                    String str4 = str;
                    ih.i iVar2 = iVar;
                    c cVar3 = cVar;
                    int i14 = i10;
                    String str5 = str2;
                    jj jjVar4 = jjVar;
                    jj jjVar5 = jjVar2;
                    TL_stories.StoryItem storyItem2 = storyItem;
                    String str6 = str5;
                    org.telegram.ui.kn knVar2 = knVar;
                    ArrayList arrayList9 = arrayList4;
                    jj jjVar6 = jjVar3;
                    boolean z14 = z10;
                    m2.t tVar2 = tVar;
                    sw swVar2 = swVar;
                    m2.t tVar3 = tVar2;
                    int i15 = i14;
                    long j18 = j11;
                    boolean z15 = z11;
                    String str7 = str4;
                    long j19 = j18;
                    long j20 = j12;
                    long j21 = j13;
                    oj ojVar3 = ojVar;
                    if (arrayList8 != null) {
                        int size = arrayList8.size();
                        int i16 = 0;
                        i11 = 0;
                        int i17 = 0;
                        z12 = true;
                        while (i16 < size) {
                            m2.t tVar4 = tVar3;
                            String str8 = i16 == 0 ? str7 : null;
                            boolean z16 = z15;
                            if (C || size <= 1 || i17 % 10 != 0 || iVar2 != null) {
                                ojVar2 = ojVar3;
                                j16 = j17;
                                i13 = i15;
                            } else {
                                ojVar2 = ojVar3;
                                j16 = j17;
                                long j22 = jArr[0];
                                if (j22 != 0) {
                                    i13 = i15;
                                    qz.z(cVar3, j22, i13);
                                } else {
                                    i13 = i15;
                                }
                                jArr[0] = Utilities.b.nextLong();
                                i17 = 0;
                            }
                            int i18 = i17 + 1;
                            long j23 = jArr[0];
                            if ((iVar2 == null && i18 == 10) || i16 == size - 1) {
                                arrayList7 = arrayList9;
                                z13 = true;
                            } else {
                                arrayList7 = arrayList9;
                                z13 = false;
                            }
                            String str9 = (String) arrayList8.get(i16);
                            oj ojVar4 = ojVar2;
                            String str10 = (String) arrayList2.get(i16);
                            int i19 = i18;
                            String str11 = str6;
                            ArrayList arrayList10 = i16 == 0 ? arrayList7 : null;
                            String str12 = str7;
                            boolean z17 = tVar4 == null;
                            long j24 = j19;
                            if (!z12) {
                                j19 = 0;
                            }
                            ArrayList arrayList11 = arrayList5;
                            int i20 = i16;
                            int i21 = size;
                            long j25 = j16;
                            ArrayList arrayList12 = arrayList8;
                            ArrayList arrayList13 = arrayList7;
                            int i22 = i13;
                            j17 = j25;
                            i11 = qz.U(cVar3, str9, str10, null, str11, j17, jjVar4, jjVar5, storyItem2, knVar2, arrayList10, jjVar6, jArr, z13, str8, z14, i22, 0, numArr, z17, swVar2, j19, z16, j20, j21, ojVar4, iVar2, arrayList11 != null ? ((Integer) arrayList11.get(i16)).intValue() : -1);
                            c cVar4 = cVar3;
                            long j26 = jArr[0];
                            if (j23 != j26 || j26 == -1) {
                                i19 = 1;
                            }
                            if (i11 != 0 && z13 && iVar2 == null && j26 != 0) {
                                qz.z(cVar4, j26, i22);
                                jArr[0] = 0;
                                i19 = 0;
                            }
                            int i23 = i20 + 1;
                            i15 = i22;
                            cVar3 = cVar4;
                            str6 = str11;
                            ojVar3 = ojVar4;
                            z12 = false;
                            arrayList8 = arrayList12;
                            arrayList9 = arrayList13;
                            str7 = str12;
                            j19 = j24;
                            tVar3 = tVar4;
                            i16 = i23;
                            z15 = z16;
                            size = i21;
                            i17 = i19;
                        }
                    } else {
                        i11 = 0;
                        z12 = true;
                    }
                    boolean z18 = z15;
                    c cVar5 = cVar3;
                    ArrayList arrayList14 = arrayList8;
                    oj ojVar5 = ojVar3;
                    String str13 = str6;
                    ArrayList arrayList15 = arrayList9;
                    m2.t tVar5 = tVar3;
                    int i24 = i15;
                    String str14 = str7;
                    long j27 = j19;
                    ArrayList arrayList16 = arrayList3;
                    if (arrayList16 != null) {
                        jArr[0] = 0;
                        int size2 = arrayList16.size();
                        boolean z19 = z18;
                        int i25 = 0;
                        int i26 = 0;
                        while (i25 < arrayList16.size()) {
                            String str15 = (i25 == 0 && (arrayList14 == null || arrayList14.size() == 0)) ? str14 : null;
                            ArrayList arrayList17 = (i25 == 0 && (arrayList14 == null || arrayList14.size() == 0)) ? arrayList15 : null;
                            if (C || size2 <= 1 || i26 % 10 != 0 || iVar2 != null) {
                                str3 = str13;
                                j14 = j17;
                            } else {
                                str3 = str13;
                                j14 = j17;
                                long j28 = jArr[0];
                                if (j28 != 0) {
                                    qz.z(cVar5, j28, i24);
                                }
                                jArr[0] = Utilities.b.nextLong();
                                i26 = 0;
                            }
                            int i27 = i26 + 1;
                            long j29 = jArr[0];
                            boolean z20 = (iVar2 == null && i27 == 10) || i25 == size2 + (-1);
                            Uri uri2 = (Uri) arrayList16.get(i25);
                            boolean z21 = tVar5 == null;
                            if (z12) {
                                i12 = size2;
                                cVar2 = cVar5;
                                uri = uri2;
                                j17 = j14;
                                j15 = j27;
                            } else {
                                i12 = size2;
                                cVar2 = cVar5;
                                uri = uri2;
                                j17 = j14;
                                j15 = 0;
                            }
                            ArrayList arrayList18 = arrayList16;
                            ArrayList arrayList19 = arrayList6;
                            int intValue = arrayList19 != null ? ((Integer) arrayList19.get(i25)).intValue() : -1;
                            int i28 = i25;
                            int i29 = i24;
                            int i30 = i27;
                            str13 = str3;
                            boolean z22 = z19;
                            int i31 = i12;
                            i11 = qz.U(cVar2, null, null, uri, str13, j17, jjVar4, jjVar5, storyItem2, knVar2, arrayList17, jjVar6, jArr, z20, str15, z14, i29, 0, numArr, z21, swVar2, j15, z22, j20, j21, ojVar5, iVar2, intValue);
                            i24 = i29;
                            long j30 = jArr[0];
                            if (j29 != j30 || j30 == -1) {
                                i30 = 1;
                            }
                            if (i11 == 0 || !z20 || iVar2 != null || j30 == 0) {
                                i26 = i30;
                            } else {
                                qz.z(cVar2, j30, i24);
                                jArr[0] = 0;
                                i26 = 0;
                            }
                            i25 = i28 + 1;
                            cVar5 = cVar2;
                            z19 = z22;
                            z12 = false;
                            size2 = i31;
                            arrayList16 = arrayList18;
                        }
                    }
                    c cVar6 = cVar5;
                    int i32 = i11;
                    if (tVar5 != null) {
                        ((t0.h) tVar5.b).g();
                    }
                    if (i32 != 0) {
                        i0.g3(new a1(i32, cVar6, 12));
                    }
                }
            });
        }
    }

    public static void W(c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, CharSequence charSequence, String str, long j10, jj jjVar, jj jjVar2, boolean z10, int i10) {
        c cVar2;
        CharSequence charSequence2;
        ArrayList arrayList4;
        if (charSequence != null) {
            CharSequence[] charSequenceArr = {charSequence};
            cVar2 = cVar;
            ArrayList W = ui.b0(cVar2.a).W(charSequenceArr, true, true);
            charSequence2 = charSequenceArr[0];
            arrayList4 = W;
        } else {
            cVar2 = cVar;
            charSequence2 = charSequence;
            arrayList4 = null;
        }
        V(i10, j10, 0L, 0L, 0L, null, charSequence2 != null ? charSequence2.toString() : null, str, arrayList, arrayList2, arrayList3, arrayList4, null, null, null, cVar2, jjVar, jjVar2, null, null, null, null, null, z10, false);
    }

    public static void X(final c cVar, final ArrayList arrayList, final long j10, final jj jjVar, final jj jjVar2, final TL_stories.StoryItem storyItem, final org.telegram.ui.kn knVar, final boolean z10, boolean z11, final jj jjVar3, final TLRPC.TL_inputPollAnswer tL_inputPollAnswer, final boolean z12, final int i10, final int i11, final boolean z13, final m2.t tVar, final sw swVar, final long j11, final boolean z14, final long j12, final long j13, final oj ojVar, final ih.i iVar, final boolean z15) {
        final boolean z16;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                z16 = z11;
                break;
            } else {
                if (((pz) arrayList.get(i12)).h > 0) {
                    z16 = false;
                    break;
                }
                i12++;
            }
        }
        final long j14 = iVar != null ? iVar.c : 0L;
        final boolean z17 = j14 != 0;
        I.c(new Runnable() { // from class: org.telegram.messenger.bx
            @Override // java.lang.Runnable
            public final void run() {
                qz.K(arrayList, j10, z10, z16, z17, cVar, j14, jjVar3, tL_inputPollAnswer, jjVar, jjVar2, z12, i10, i11, storyItem, knVar, swVar, j11, z14, j12, j13, ojVar, iVar, z15, tVar, z13);
            }
        });
    }

    public static void Y(c cVar, Uri uri, long j10, jj jjVar, jj jjVar2, m2.t tVar, jj jjVar3, boolean z10, int i10, sw swVar) {
        Z(cVar, null, null, uri, j10, jjVar, jjVar2, null, null, null, tVar, 0, jjVar3, null, z10, i10, false, null, swVar, 0L, 0L, 0L, null);
    }

    public static void Z(c cVar, String str, String str2, Uri uri, long j10, jj jjVar, jj jjVar2, org.telegram.ui.kn knVar, ArrayList arrayList, ArrayList arrayList2, m2.t tVar, int i10, jj jjVar3, x20 x20Var, boolean z10, int i11, boolean z11, CharSequence charSequence, sw swVar, long j11, long j12, long j13, oj ojVar) {
        pz pzVar = new pz();
        pzVar.c = str;
        pzVar.e = str2;
        pzVar.a = uri;
        if (charSequence != null) {
            pzVar.d = charSequence.toString();
        }
        pzVar.i = arrayList;
        pzVar.h = i10;
        if (arrayList2 != null) {
            pzVar.j = new ArrayList(arrayList2);
        }
        pzVar.k = x20Var;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(pzVar);
        X(cVar, arrayList3, j10, jjVar, jjVar2, null, knVar, z11, false, jjVar3, null, z10, i11, 0, false, tVar, swVar, j11, false, j12, j13, ojVar, null, false);
    }

    public static void a0(c cVar, CharSequence charSequence, long j10, long j11, boolean z10, int i10, int i11) {
        hs.a0(cVar.a).a.c(new yw(charSequence, cVar, j11, j10, z10, i10, i11, 1));
    }

    public static void b0(final int i10, final int i11, final int i12, final long j10, final long j11, final long j12, final long j13, final CharSequence charSequence, final String str, final String str2, final ArrayList arrayList, final c cVar, final jj jjVar, final jj jjVar2, final jj jjVar3, final oj ojVar, final sw swVar, final x20 x20Var, final TLRPC.Photo photo, final TL_stories.StoryItem storyItem, final org.telegram.ui.kn knVar, final boolean z10, final boolean z11, final boolean z12) {
        if (str == null || str.length() == 0) {
            return;
        }
        new Thread(new Runnable() { // from class: org.telegram.messenger.yy
            /* JADX WARN: Removed duplicated region for block: B:100:0x0494  */
            /* JADX WARN: Removed duplicated region for block: B:103:0x049e  */
            /* JADX WARN: Removed duplicated region for block: B:105:0x04a5  */
            /* JADX WARN: Removed duplicated region for block: B:138:0x0357  */
            /* JADX WARN: Removed duplicated region for block: B:162:0x0436  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x019b  */
            /* JADX WARN: Removed duplicated region for block: B:91:0x0453  */
            /* JADX WARN: Removed duplicated region for block: B:95:0x045e  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                jj jjVar4;
                String str3;
                final int i13;
                final String str4;
                long j14;
                final x20 x20Var2;
                boolean z13;
                TLRPC.TL_document tL_document;
                c cVar2;
                String str5;
                boolean z14;
                c cVar3;
                final Bitmap bitmap;
                final String str6;
                final TLRPC.TL_document tL_document2;
                String str7;
                TLRPC.PhotoSize q6;
                String str8;
                TLRPC.Photo photo2;
                File file;
                String str9;
                TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
                int i14;
                int i15;
                x20 x20Var3 = x20Var;
                String str10 = str;
                if (x20Var3 == null) {
                    x20Var3 = qz.n(0L, str10);
                }
                x20 x20Var4 = x20Var3;
                long j15 = j10;
                boolean C = o5.C(j15);
                boolean z15 = x20Var4 != null && x20Var4.s;
                c cVar4 = cVar;
                CharSequence charSequence2 = charSequence;
                final jj jjVar5 = jjVar3;
                final jj jjVar6 = jjVar;
                jj jjVar7 = jjVar2;
                boolean z16 = z15;
                final ArrayList arrayList2 = arrayList;
                long j16 = 0;
                final boolean z17 = z10;
                final int i16 = i11;
                final int i17 = i12;
                final TL_stories.StoryItem storyItem2 = storyItem;
                final org.telegram.ui.kn knVar2 = knVar;
                final sw swVar2 = swVar;
                final long j17 = j12;
                final long j18 = j13;
                final oj ojVar2 = ojVar;
                if (x20Var4 == null && !str10.endsWith("mp4") && !z16) {
                    qz.U(cVar4, str10, str10, null, null, j15, jjVar6, jjVar7, storyItem2, knVar2, arrayList2, jjVar5, null, false, charSequence2, z17, i16, i17, null, z11, swVar2, 0L, false, j17, j18, ojVar2, null, -1);
                    return;
                }
                File file2 = new File(str10);
                StringBuilder t10 = a1.g.t(str10);
                t10.append(file2.length());
                t10.append("_");
                t10.append(file2.lastModified());
                String sb2 = t10.toString();
                if (x20Var4 != null) {
                    if (!z16) {
                        StringBuilder t11 = a1.g.t(sb2);
                        t11.append(x20Var4.r);
                        t11.append("_");
                        t11.append(x20Var4.a);
                        t11.append("_");
                        t11.append(x20Var4.b);
                        t11.append(x20Var4.t ? "_m" : "");
                        sb2 = t11.toString();
                        if (x20Var4.k != x20Var4.h) {
                            StringBuilder i18 = sc.e.i(sb2, "_");
                            i18.append(x20Var4.k);
                            sb2 = i18.toString();
                        }
                    }
                    long j19 = x20Var4.a;
                    if (j19 >= 0) {
                        j16 = j19;
                    }
                }
                long j20 = j16;
                int i19 = i10;
                if (!C && i19 == 0 && (x20Var4 == null || (x20Var4.A == null && x20Var4.B == null && x20Var4.G == null && x20Var4.H == null))) {
                    Object[] g02 = hs.a0(cVar4.a).g0(!C ? 2 : 5, sb2);
                    if (g02 != null) {
                        Object obj = g02[0];
                        jjVar4 = jjVar7;
                        if (obj instanceof TLRPC.TL_document) {
                            TLRPC.TL_document tL_document3 = (TLRPC.TL_document) obj;
                            String str11 = (String) g02[1];
                            str3 = sb2;
                            str4 = "";
                            i13 = i19;
                            x20Var2 = x20Var4;
                            z13 = z16;
                            j14 = j15;
                            qz.w(cVar4, C, tL_document3, str10, null, j20, false);
                            cVar2 = cVar4;
                            z14 = C;
                            str10 = str10;
                            tL_document = tL_document3;
                            str5 = str11;
                            if (tL_document == null) {
                                Bitmap bitmap2 = (x20Var2 == null || !x20Var2.P) ? null : x20Var2.O;
                                if (bitmap2 == null) {
                                    bitmap2 = qz.s(str10, j20, null, false);
                                }
                                if (bitmap2 == null) {
                                    bitmap2 = qz.r(1, str10);
                                }
                                int i20 = (z14 || i13 != 0) ? 90 : 320;
                                float f7 = i20;
                                TLRPC.PhotoSize Z = hc.Z(bitmap2, f7, f7, i20 > 90 ? 80 : 55, z14);
                                if (bitmap2 == null || Z == null) {
                                    file = file2;
                                    str9 = null;
                                } else if (!z13) {
                                    file = file2;
                                    str9 = null;
                                    bitmap2 = null;
                                } else if (z14) {
                                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, 90, 90, true);
                                    Utilities.blurBitmap(createScaledBitmap, 7);
                                    Utilities.blurBitmap(createScaledBitmap, 7);
                                    Utilities.blurBitmap(createScaledBitmap, 7);
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(Z.location.volume_id);
                                    sb3.append("_");
                                    str9 = String.format(a1.g.p(sb3, Z.location.local_id, "@%d_%d_b2"), Integer.valueOf((int) (i0.u / i0.p)), Integer.valueOf((int) (i0.u / i0.p)));
                                    bitmap2 = createScaledBitmap;
                                    file = file2;
                                } else {
                                    Utilities.blurBitmap(bitmap2, 3);
                                    StringBuilder sb4 = new StringBuilder();
                                    file = file2;
                                    sb4.append(Z.location.volume_id);
                                    sb4.append("_");
                                    str9 = String.format(a1.g.p(sb4, Z.location.local_id, "@%d_%d_b"), Integer.valueOf((int) (i0.u / i0.p)), Integer.valueOf((int) (i0.u / i0.p)));
                                }
                                TLRPC.TL_document tL_document4 = new TLRPC.TL_document();
                                if (Z != null) {
                                    tL_document4.thumbs.add(Z);
                                    tL_document4.flags |= 1;
                                }
                                tL_document4.file_reference = new byte[0];
                                tL_document4.mime_type = "video/mp4";
                                d20.i(cVar2.a).v(false);
                                if (!z14) {
                                    tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                                    tL_documentAttributeVideo.supports_streaming = true;
                                } else if (vp.r1(cVar2.a).Z0(Integer.valueOf((int) (j14 & 4294967295L))) == null) {
                                    return;
                                } else {
                                    tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo_layer159();
                                }
                                tL_documentAttributeVideo.round_message = z13;
                                tL_document4.attributes.add(tL_documentAttributeVideo);
                                if (x20Var2 != null && x20Var2.P) {
                                    tL_documentAttributeVideo.w = x20Var2.k;
                                    tL_documentAttributeVideo.h = x20Var2.l;
                                    tL_documentAttributeVideo.duration = x20Var2.r / 1000.0d;
                                    tL_document4.size = x20Var2.q;
                                } else if (x20Var2 == null || !x20Var2.c()) {
                                    if (file.exists()) {
                                        tL_document4.size = (int) file.length();
                                    }
                                    qz.x(str10, tL_documentAttributeVideo, null);
                                } else {
                                    if (x20Var2.t) {
                                        tL_document4.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                        qz.x(str10, tL_documentAttributeVideo, x20Var2);
                                        x20Var2.h = tL_documentAttributeVideo.w;
                                        x20Var2.i = tL_documentAttributeVideo.h;
                                    } else {
                                        tL_documentAttributeVideo.duration = x20Var2.r / 1000.0d;
                                    }
                                    int i21 = x20Var2.g;
                                    ye yeVar = x20Var2.H;
                                    if (yeVar != null) {
                                        i14 = yeVar.i;
                                        i15 = yeVar.j;
                                        i21 += yeVar.k;
                                    } else {
                                        i14 = x20Var2.k;
                                        i15 = x20Var2.l;
                                    }
                                    if (i21 == 90 || i21 == 270) {
                                        tL_documentAttributeVideo.w = i15;
                                        tL_documentAttributeVideo.h = i14;
                                    } else {
                                        tL_documentAttributeVideo.w = i14;
                                        tL_documentAttributeVideo.h = i15;
                                    }
                                    tL_document4.size = x20Var2.q;
                                }
                                str6 = str9;
                                cVar3 = cVar2;
                                tL_document2 = tL_document4;
                                bitmap = bitmap2;
                            } else {
                                if (tL_document.thumbs.isEmpty()) {
                                    Bitmap bitmap3 = (x20Var2 == null || !x20Var2.P) ? null : x20Var2.O;
                                    cVar3 = cVar2;
                                    Bitmap bitmap4 = null;
                                    if (bitmap3 == null) {
                                        bitmap3 = qz.s(str10, j20, null, false);
                                    }
                                    Bitmap r10 = bitmap3 == null ? qz.r(1, str10) : bitmap3;
                                    int i22 = (z14 || i13 != 0) ? 90 : 320;
                                    float f10 = i22;
                                    TLRPC.PhotoSize Z2 = hc.Z(r10, f10, f10, i22 > 90 ? 80 : 55, z14);
                                    if (r10 == null || Z2 == null) {
                                        str7 = null;
                                    } else {
                                        if (!z13) {
                                            str7 = null;
                                        } else if (z14) {
                                            bitmap4 = Bitmap.createScaledBitmap(r10, 90, 90, true);
                                            Utilities.blurBitmap(bitmap4, 7);
                                            Utilities.blurBitmap(bitmap4, 7);
                                            Utilities.blurBitmap(bitmap4, 7);
                                            StringBuilder sb5 = new StringBuilder();
                                            sb5.append(Z2.location.volume_id);
                                            sb5.append("_");
                                            str7 = String.format(a1.g.p(sb5, Z2.location.local_id, "@%d_%d_b2"), Integer.valueOf((int) (i0.u / i0.p)), Integer.valueOf((int) (i0.u / i0.p)));
                                        } else {
                                            Utilities.blurBitmap(r10, 3);
                                            StringBuilder sb6 = new StringBuilder();
                                            sb6.append(Z2.location.volume_id);
                                            sb6.append("_");
                                            str7 = String.format(a1.g.p(sb6, Z2.location.local_id, "@%d_%d_b"), Integer.valueOf((int) (i0.u / i0.p)), Integer.valueOf((int) (i0.u / i0.p)));
                                        }
                                        if (Z2 != null) {
                                            tL_document.thumbs.add(Z2);
                                            tL_document.flags |= 1;
                                        }
                                        str6 = str7;
                                        bitmap = bitmap4;
                                    }
                                    bitmap4 = r10;
                                    if (Z2 != null) {
                                    }
                                    str6 = str7;
                                    bitmap = bitmap4;
                                } else {
                                    cVar3 = cVar2;
                                    bitmap = null;
                                    str6 = null;
                                }
                                tL_document2 = tL_document;
                            }
                            q6 = hc.q(str2);
                            if (q6 == null && (photo2 = photo) != null) {
                                q6 = new ec(photo2);
                            }
                            if (x20Var2 != null && x20Var2.c()) {
                                File file3 = new File(b8.z(4), "-2147483648_" + tz.p() + ".mp4");
                                tz.y();
                                str10 = file3.getAbsolutePath();
                            }
                            final String str12 = str10;
                            final HashMap hashMap = new HashMap();
                            if (charSequence2 != null) {
                                str4 = charSequence2.toString();
                            }
                            str8 = str3;
                            if (str8 != null) {
                                hashMap.put("originalPath", str8);
                            }
                            if (str5 != null) {
                                hashMap.put("parentObject", str5);
                            }
                            final boolean z18 = z12;
                            final long j21 = j11;
                            final long j22 = j14;
                            final jj jjVar8 = jjVar4;
                            final String str13 = str5;
                            final TLRPC.PhotoSize photoSize = q6;
                            final c cVar5 = cVar3;
                            i0.g3(new Runnable() { // from class: org.telegram.messenger.qy
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String str14;
                                    Bitmap bitmap5 = bitmap;
                                    if (bitmap5 != null && (str14 = str6) != null) {
                                        hc.D().O(new BitmapDrawable(bitmap5), str14, false);
                                    }
                                    jj jjVar9 = jjVar5;
                                    c cVar6 = cVar5;
                                    x20 x20Var5 = x20Var2;
                                    TLRPC.TL_document tL_document5 = tL_document2;
                                    String str15 = str12;
                                    TLRPC.PhotoSize photoSize2 = photoSize;
                                    HashMap hashMap2 = hashMap;
                                    boolean z19 = z18;
                                    String str16 = str13;
                                    if (jjVar9 != null) {
                                        qz.C(cVar6.a).t(jjVar9, null, null, x20Var5, tL_document5, str15, photoSize2, hashMap2, false, z19, str16);
                                        return;
                                    }
                                    oz e = oz.e(tL_document5, x20Var5, str15, j22, jjVar6, jjVar8, str4, arrayList2, hashMap2, z17, i16, i17, i13, str16, z19);
                                    e.H = storyItem2;
                                    e.J = knVar2;
                                    e.K = swVar2;
                                    e.O = j21;
                                    e.o = photoSize2;
                                    e.Q = j17;
                                    e.R = j18;
                                    e.T = ojVar2;
                                    e.L = false;
                                    qz.C(cVar6.a).r0(e);
                                }
                            });
                        }
                        cVar2 = cVar4;
                        str3 = sb2;
                        z14 = C;
                        str4 = "";
                        i13 = i19;
                        x20Var2 = x20Var4;
                        z13 = z16;
                        j14 = j15;
                        str5 = null;
                        tL_document = null;
                        if (tL_document == null) {
                        }
                        q6 = hc.q(str2);
                        if (q6 == null) {
                            q6 = new ec(photo2);
                        }
                        if (x20Var2 != null) {
                            File file32 = new File(b8.z(4), "-2147483648_" + tz.p() + ".mp4");
                            tz.y();
                            str10 = file32.getAbsolutePath();
                        }
                        final String str122 = str10;
                        final HashMap hashMap2 = new HashMap();
                        if (charSequence2 != null) {
                        }
                        str8 = str3;
                        if (str8 != null) {
                        }
                        if (str5 != null) {
                        }
                        final boolean z182 = z12;
                        final long j212 = j11;
                        final long j222 = j14;
                        final jj jjVar82 = jjVar4;
                        final String str132 = str5;
                        final TLRPC.PhotoSize photoSize2 = q6;
                        final c cVar52 = cVar3;
                        i0.g3(new Runnable() { // from class: org.telegram.messenger.qy
                            @Override // java.lang.Runnable
                            public final void run() {
                                String str14;
                                Bitmap bitmap5 = bitmap;
                                if (bitmap5 != null && (str14 = str6) != null) {
                                    hc.D().O(new BitmapDrawable(bitmap5), str14, false);
                                }
                                jj jjVar9 = jjVar5;
                                c cVar6 = cVar52;
                                x20 x20Var5 = x20Var2;
                                TLRPC.TL_document tL_document5 = tL_document2;
                                String str15 = str122;
                                TLRPC.PhotoSize photoSize22 = photoSize2;
                                HashMap hashMap22 = hashMap2;
                                boolean z19 = z182;
                                String str16 = str132;
                                if (jjVar9 != null) {
                                    qz.C(cVar6.a).t(jjVar9, null, null, x20Var5, tL_document5, str15, photoSize22, hashMap22, false, z19, str16);
                                    return;
                                }
                                oz e = oz.e(tL_document5, x20Var5, str15, j222, jjVar6, jjVar82, str4, arrayList2, hashMap22, z17, i16, i17, i13, str16, z19);
                                e.H = storyItem2;
                                e.J = knVar2;
                                e.K = swVar2;
                                e.O = j212;
                                e.o = photoSize22;
                                e.Q = j17;
                                e.R = j18;
                                e.T = ojVar2;
                                e.L = false;
                                qz.C(cVar6.a).r0(e);
                            }
                        });
                    }
                }
                jjVar4 = jjVar7;
                cVar2 = cVar4;
                str3 = sb2;
                z14 = C;
                str4 = "";
                i13 = i19;
                x20Var2 = x20Var4;
                z13 = z16;
                j14 = j15;
                str5 = null;
                tL_document = null;
                if (tL_document == null) {
                }
                q6 = hc.q(str2);
                if (q6 == null) {
                }
                if (x20Var2 != null) {
                }
                final String str1222 = str10;
                final HashMap hashMap22 = new HashMap();
                if (charSequence2 != null) {
                }
                str8 = str3;
                if (str8 != null) {
                }
                if (str5 != null) {
                }
                final boolean z1822 = z12;
                final long j2122 = j11;
                final long j2222 = j14;
                final jj jjVar822 = jjVar4;
                final String str1322 = str5;
                final TLRPC.PhotoSize photoSize22 = q6;
                final c cVar522 = cVar3;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.qy
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str14;
                        Bitmap bitmap5 = bitmap;
                        if (bitmap5 != null && (str14 = str6) != null) {
                            hc.D().O(new BitmapDrawable(bitmap5), str14, false);
                        }
                        jj jjVar9 = jjVar5;
                        c cVar6 = cVar522;
                        x20 x20Var5 = x20Var2;
                        TLRPC.TL_document tL_document5 = tL_document2;
                        String str15 = str1222;
                        TLRPC.PhotoSize photoSize222 = photoSize22;
                        HashMap hashMap222 = hashMap22;
                        boolean z19 = z1822;
                        String str16 = str1322;
                        if (jjVar9 != null) {
                            qz.C(cVar6.a).t(jjVar9, null, null, x20Var5, tL_document5, str15, photoSize222, hashMap222, false, z19, str16);
                            return;
                        }
                        oz e = oz.e(tL_document5, x20Var5, str15, j2222, jjVar6, jjVar822, str4, arrayList2, hashMap222, z17, i16, i17, i13, str16, z19);
                        e.H = storyItem2;
                        e.J = knVar2;
                        e.K = swVar2;
                        e.O = j2122;
                        e.o = photoSize222;
                        e.Q = j17;
                        e.R = j18;
                        e.T = ojVar2;
                        e.L = false;
                        qz.C(cVar6.a).r0(e);
                    }
                });
            }
        }).start();
    }

    public static boolean h(CharSequence charSequence) {
        if (charSequence instanceof Spannable) {
            for (org.telegram.ui.Components.o5 o5Var : (org.telegram.ui.Components.o5[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.o5.class)) {
                if (o5Var.fromEmojiKeyboard) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void i(TL_iv.RichText richText) {
        if (richText == null) {
            return;
        }
        richText.parentRichText = null;
        TL_iv.RichText richText2 = richText.text;
        if (richText2 != null) {
            i(richText2);
        }
        ArrayList<TL_iv.RichText> arrayList = richText.texts;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_iv.RichText richText3 = arrayList.get(i10);
                i10++;
                i(richText3);
            }
        }
    }

    public static void j(TL_iv.PageBlock pageBlock, IdentityHashMap identityHashMap) {
        if (pageBlock == null || identityHashMap.put(pageBlock, Boolean.TRUE) != null) {
            return;
        }
        for (Field field : pageBlock.getClass().getFields()) {
            if (!Modifier.isStatic(field.getModifiers())) {
                try {
                    Object obj = field.get(pageBlock);
                    if (obj instanceof TL_iv.RichText) {
                        i((TL_iv.RichText) obj);
                    } else if (obj instanceof TL_iv.PageBlock) {
                        j((TL_iv.PageBlock) obj, identityHashMap);
                    } else if (obj instanceof TL_iv.PageCaption) {
                        i(((TL_iv.PageCaption) obj).text);
                        i(((TL_iv.PageCaption) obj).credit);
                    } else if (obj instanceof List) {
                        for (Object obj2 : (List) obj) {
                            if (obj2 instanceof TL_iv.PageBlock) {
                                j((TL_iv.PageBlock) obj2, identityHashMap);
                            } else if (obj2 instanceof TL_iv.RichText) {
                                i((TL_iv.RichText) obj2);
                            } else if ((obj2 instanceof TL_iv.PageListItem) || (obj2 instanceof TL_iv.PageListOrderedItem)) {
                                for (Field field2 : obj2.getClass().getFields()) {
                                    if (!Modifier.isStatic(field2.getModifiers())) {
                                        try {
                                            Object obj3 = field2.get(obj2);
                                            if (obj3 instanceof TL_iv.RichText) {
                                                i((TL_iv.RichText) obj3);
                                            } else if (obj3 instanceof List) {
                                                for (Object obj4 : (List) obj3) {
                                                    if (obj4 instanceof TL_iv.PageBlock) {
                                                        j((TL_iv.PageBlock) obj4, identityHashMap);
                                                    }
                                                }
                                            }
                                        } catch (IllegalAccessException unused) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (IllegalAccessException unused2) {
                }
            }
        }
    }

    public static ArrayList l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) arrayList.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                    tL_documentAttributeVideo_layer159.flags = documentAttribute.flags;
                    tL_documentAttributeVideo_layer159.round_message = documentAttribute.round_message;
                    tL_documentAttributeVideo_layer159.supports_streaming = documentAttribute.supports_streaming;
                    tL_documentAttributeVideo_layer159.duration = documentAttribute.duration;
                    tL_documentAttributeVideo_layer159.w = documentAttribute.w;
                    tL_documentAttributeVideo_layer159.h = documentAttribute.h;
                    arrayList2.add(tL_documentAttributeVideo_layer159);
                } else {
                    arrayList2.add(documentAttribute);
                }
            }
        }
        return arrayList2;
    }

    public static void m(long j10, long j11, File file, File file2) {
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            FileChannel channel2 = new FileOutputStream(file2).getChannel();
            try {
                channel.position(j10);
                ByteBuffer allocate = ByteBuffer.allocate(262144);
                while (j11 > 0) {
                    allocate.clear();
                    allocate.limit((int) Math.min(allocate.capacity(), j11));
                    int read = channel.read(allocate);
                    if (read <= 0) {
                        break;
                    }
                    allocate.flip();
                    channel2.write(allocate);
                    j11 -= read;
                }
                channel2.force(true);
                channel2.close();
                channel.close();
            } finally {
            }
        } catch (Throwable th2) {
            if (channel != null) {
                try {
                    channel.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static TL_iv.TL_inputRichMessage m0(ArrayList arrayList, TL_iv.RichMessage richMessage) {
        TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
        if (richMessage != null) {
            tL_inputRichMessage.rtl = richMessage.rtl;
            tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
            for (int i10 = 0; i10 < richMessage.blocks.size(); i10++) {
                tL_inputRichMessage.blocks.add(y0(richMessage.blocks.get(i10)));
            }
            ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                tL_inputRichMessage.flags |= 4;
                ArrayList<TLRPC.Photo> arrayList3 = richMessage.photos;
                int size = arrayList3.size();
                int i11 = 0;
                while (i11 < size) {
                    TLRPC.Photo photo = arrayList3.get(i11);
                    i11++;
                    TLRPC.Photo photo2 = photo;
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    tL_inputPhoto.id = photo2.id;
                    tL_inputPhoto.access_hash = photo2.access_hash;
                    byte[] bArr = photo2.file_reference;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    tL_inputPhoto.file_reference = bArr;
                    tL_inputRichMessage.photos.add(tL_inputPhoto);
                }
            }
            ArrayList<TLRPC.Document> arrayList4 = richMessage.documents;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                tL_inputRichMessage.flags |= 8;
                ArrayList<TLRPC.Document> arrayList5 = richMessage.documents;
                int size2 = arrayList5.size();
                int i12 = 0;
                while (i12 < size2) {
                    TLRPC.Document document = arrayList5.get(i12);
                    i12++;
                    TLRPC.Document document2 = document;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.id = document2.id;
                    tL_inputDocument.access_hash = document2.access_hash;
                    byte[] bArr2 = document2.file_reference;
                    if (bArr2 == null) {
                        bArr2 = new byte[0];
                    }
                    tL_inputDocument.file_reference = bArr2;
                    tL_inputRichMessage.documents.add(tL_inputDocument);
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                tL_inputRichMessage.flags |= 16;
                tL_inputRichMessage.users.addAll(arrayList);
            }
        }
        return tL_inputRichMessage;
    }

    public static x20 n(long j10, String str) {
        int[] iArr = new int[11];
        AnimatedFileNative.d(str, iArr, j10);
        if (iArr[0] == 0) {
            if (!v2.a) {
                return null;
            }
            f8.b("video hasn't avc1 atom");
            return null;
        }
        long length = new File(str).length();
        int E = MediaController.E(str);
        if (E == -1) {
            E = iArr[3];
        }
        float f7 = iArr[4];
        long j11 = iArr[5];
        int i10 = iArr[7];
        x20 x20Var = new x20();
        x20Var.a = -1L;
        x20Var.b = -1L;
        x20Var.m = E;
        x20Var.o = str;
        x20Var.p = j10;
        x20Var.n = i10;
        x20Var.r = (long) Math.ceil(f7);
        boolean z10 = true;
        int i11 = iArr[1];
        x20Var.h = i11;
        x20Var.k = i11;
        int i12 = iArr[2];
        x20Var.i = i12;
        x20Var.l = i12;
        x20Var.g = iArr[8];
        x20Var.v = (long) (f7 * 1000.0f);
        float max = Math.max(i11, i12);
        float f10 = 1280.0f;
        int i13 = max > 1280.0f ? 4 : max > 854.0f ? 3 : max > 640.0f ? 2 : 1;
        b6 q6 = b6.q(d20.s0);
        int e = w0.e();
        int round = Math.round((e == 1 ? q6.p().h : e == 2 ? q6.o().h : q6.n().h) / (100.0f / i13));
        if (round > i13) {
            round = i13;
        }
        if (new File(str).length() < 1048576000) {
            if (round != i13 || Math.max(x20Var.h, x20Var.i) > 1280) {
                if (round == 1) {
                    f10 = 432.0f;
                } else if (round == 2) {
                    f10 = 640.0f;
                } else if (round == 3) {
                    f10 = 848.0f;
                }
                int i14 = x20Var.h;
                int i15 = x20Var.i;
                float f11 = f10 / (i14 > i15 ? i14 : i15);
                x20Var.k = Math.round((i14 * f11) / 2.0f) * 2;
                x20Var.l = Math.round((x20Var.i * f11) / 2.0f) * 2;
            } else {
                z10 = false;
            }
            E = MediaController.Q(x20Var.i, x20Var.h, E, x20Var.l, x20Var.k);
        } else {
            z10 = false;
        }
        if (z10) {
            x20Var.m = E;
            x20Var.q = (long) a1.g.A(f7 / 1000.0f, MediaController.v(x20Var.k, x20Var.l, E, false), 8.0f, j11);
        } else {
            x20Var.k = x20Var.h;
            x20Var.l = x20Var.i;
            x20Var.m = E;
            x20Var.q = length;
        }
        if (x20Var.q == 0) {
            x20Var.q = 1L;
        }
        return x20Var;
    }

    public static Bitmap r(int i10, String str) {
        float f7 = i10 == 2 ? 1920.0f : i10 == 3 ? 96.0f : 512.0f;
        Bitmap s10 = s(str, 0L, null, false);
        if (s10 != null) {
            int width = s10.getWidth();
            int height = s10.getHeight();
            float f10 = width;
            if (f10 > f7 || height > f7) {
                float max = Math.max(width, height) / f7;
                return Bitmap.createScaledBitmap(s10, (int) (f10 / max), (int) (height / max), true);
            }
        }
        return s10;
    }

    public static Bitmap s(String str, long j10, int[] iArr, boolean z10) {
        if (z10) {
            org.telegram.ui.Components.s5 s5Var = new org.telegram.ui.Components.s5(new File(str), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
            Bitmap q6 = s5Var.q(j10, z10);
            if (iArr != null) {
                iArr[0] = s5Var.d[2];
            }
            s5Var.u();
            return q6 == null ? s(str, j10, iArr, false) : q6;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        Bitmap bitmap = null;
        try {
            mediaMetadataRetriever.setDataSource(str);
            bitmap = mediaMetadataRetriever.getFrameAtTime(j10, 1);
            if (bitmap == null) {
                bitmap = mediaMetadataRetriever.getFrameAtTime(j10, 3);
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable unused2) {
            }
            throw th2;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable unused3) {
        }
        return bitmap;
    }

    public static void w(c cVar, boolean z10, TLObject tLObject, String str, Uri uri, long j10, boolean z11) {
        boolean z12;
        TLRPC.PhotoSize b02;
        TLRPC.PhotoSize b03;
        if (tLObject instanceof TLRPC.TL_photo) {
            TLRPC.TL_photo tL_photo = (TLRPC.TL_photo) tLObject;
            TLRPC.PhotoSize w9 = b8.w(tL_photo.sizes, 90, false, null, false);
            if ((w9 instanceof TLRPC.TL_photoStrippedSize) || (w9 instanceof TLRPC.TL_photoPathSize)) {
                z12 = true;
            } else {
                b8.G(cVar.a);
                z12 = b8.K(w9, null, true, true).exists();
            }
            TLRPC.PhotoSize w10 = b8.w(tL_photo.sizes, i0.Z0(z11), false, null, false);
            b8.G(cVar.a);
            boolean exists = b8.K(w10, null, false, true).exists();
            if (z12 && exists) {
                return;
            }
            Bitmap K2 = hc.K(str, uri, i0.Z0(false), i0.Z0(false), true);
            if (K2 == null) {
                K2 = hc.K(str, uri, 800.0f, 800.0f, true);
            }
            Bitmap bitmap = K2;
            if (!exists && (b03 = hc.b0(w10, bitmap, Bitmap.CompressFormat.JPEG, i0.Z0(false), i0.Z0(false), 80, false, 101, 101, false)) != w10) {
                tL_photo.sizes.add(0, b03);
            }
            if (!z12 && (b02 = hc.b0(w9, bitmap, Bitmap.CompressFormat.JPEG, 90.0f, 90.0f, 55, true, 0, 0, false)) != w9) {
                tL_photo.sizes.add(0, b02);
            }
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_document) {
            TLRPC.TL_document tL_document = (TLRPC.TL_document) tLObject;
            if ((jj.K4(tL_document) || jj.M3(tL_document)) && jj.W2(tL_document)) {
                ArrayList<TLRPC.PhotoSize> arrayList = tL_document.thumbs;
                int i10 = zs.r5;
                TLRPC.PhotoSize w11 = b8.w(arrayList, zs.r5, false, null, false);
                if ((w11 instanceof TLRPC.TL_photoStrippedSize) || (w11 instanceof TLRPC.TL_photoPathSize)) {
                    return;
                }
                b8.G(cVar.a);
                if (b8.K(w11, null, true, true).exists()) {
                    return;
                }
                Bitmap s10 = s(str, j10, null, false);
                if (s10 == null) {
                    s10 = r(1, str);
                }
                Bitmap bitmap2 = s10;
                if (z10) {
                    i10 = 90;
                }
                ArrayList<TLRPC.PhotoSize> arrayList2 = tL_document.thumbs;
                float f7 = i10;
                int i11 = i10 > 90 ? 80 : 55;
                ThreadLocal threadLocal = hc.I;
                arrayList2.set(0, hc.b0(w11, bitmap2, Bitmap.CompressFormat.JPEG, f7, f7, i11, false, 0, 0, true));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r3 == 270(0x10e, float:3.78E-43)) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.media.MediaMetadataRetriever] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7, types: [double] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void x(String str, TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo, x20 x20Var) {
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        ?? r32 = 0;
        try {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
            if (extractMetadata != null) {
                tL_documentAttributeVideo.w = Integer.parseInt(extractMetadata);
            }
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            if (extractMetadata2 != null) {
                tL_documentAttributeVideo.h = Integer.parseInt(extractMetadata2);
            }
            if (mediaMetadataRetriever.extractMetadata(9) != null) {
                tL_documentAttributeVideo.duration = Long.parseLong(r3) / 1000.0d;
            }
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
            MediaMetadataRetriever mediaMetadataRetriever3 = extractMetadata3;
            if (extractMetadata3 != null) {
                int intValue = Utilities.z(extractMetadata3).intValue();
                if (x20Var != null) {
                    x20Var.g = intValue;
                    mediaMetadataRetriever3 = intValue;
                } else {
                    if (intValue != 90) {
                        mediaMetadataRetriever3 = intValue;
                    }
                    int i10 = tL_documentAttributeVideo.w;
                    int i11 = tL_documentAttributeVideo.h;
                    tL_documentAttributeVideo.w = i11;
                    tL_documentAttributeVideo.h = i10;
                    mediaMetadataRetriever3 = i11;
                }
            }
            try {
                mediaMetadataRetriever.release();
                mediaMetadataRetriever2 = mediaMetadataRetriever3;
            } catch (Exception e7) {
                f8.g(e7, true);
                mediaMetadataRetriever2 = mediaMetadataRetriever3;
            }
        } catch (Exception e10) {
            e = e10;
            r32 = mediaMetadataRetriever;
            f8.g(e, true);
            if (r32 != 0) {
                try {
                    r32.release();
                } catch (Exception e11) {
                    f8.g(e11, true);
                }
            }
            try {
                Context context = w0.b;
                File file = new File(str);
                MediaPlayer create = MediaPlayer.create(context, Uri.fromFile(file));
                mediaMetadataRetriever2 = file;
                if (create != null) {
                    r32 = create.getDuration() / 1000.0d;
                    tL_documentAttributeVideo.duration = r32;
                    tL_documentAttributeVideo.w = create.getVideoWidth();
                    tL_documentAttributeVideo.h = create.getVideoHeight();
                    create.release();
                    mediaMetadataRetriever2 = r32;
                }
            } catch (Exception e12) {
                f8.g(e12, true);
                mediaMetadataRetriever2 = r32;
            }
        } catch (Throwable th3) {
            th = th3;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            if (mediaMetadataRetriever2 != null) {
                try {
                    mediaMetadataRetriever2.release();
                } catch (Exception e13) {
                    f8.g(e13, true);
                }
            }
            throw th;
        }
    }

    public static boolean x0(Uri uri, String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (str != null) {
            try {
                BitmapFactory.decodeFile(str, options);
            } catch (Exception e) {
                f8.g(e, true);
            }
        } else {
            try {
                InputStream openInputStream = w0.b.getContentResolver().openInputStream(uri);
                try {
                    BitmapFactory.decodeStream(openInputStream, null, options);
                    if (openInputStream != null) {
                        openInputStream.close();
                    }
                } finally {
                }
            } catch (Exception unused) {
            }
        }
        return options.outWidth < 800 && options.outHeight < 800;
    }

    public static TL_iv.PageBlock y0(TL_iv.PageBlock pageBlock) {
        TLRPC.InputGeoPoint inputGeoPoint;
        if (!(pageBlock instanceof TL_iv.pageBlockMap)) {
            return pageBlock;
        }
        TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
        TL_iv.inputPageBlockMap inputpageblockmap = new TL_iv.inputPageBlockMap();
        TLRPC.GeoPoint geoPoint = pageblockmap.geo;
        if (geoPoint instanceof TLRPC.TL_geoPoint) {
            TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
            tL_inputGeoPoint.lat = geoPoint.lat;
            tL_inputGeoPoint._long = geoPoint._long;
            int i10 = geoPoint.accuracy_radius;
            if (i10 != 0) {
                tL_inputGeoPoint.flags |= 1;
                tL_inputGeoPoint.accuracy_radius = i10;
            }
            inputGeoPoint = tL_inputGeoPoint;
        } else {
            inputGeoPoint = new TLRPC.TL_inputGeoPointEmpty();
        }
        inputpageblockmap.geo = inputGeoPoint;
        inputpageblockmap.zoom = pageblockmap.zoom;
        inputpageblockmap.w = pageblockmap.w;
        inputpageblockmap.h = pageblockmap.h;
        inputpageblockmap.caption = pageblockmap.caption;
        return inputpageblockmap;
    }

    public static void z(c cVar, long j10, int i10) {
        i0.g3(new dd(cVar, j10, i10, 4));
    }

    public final TLRPC.TL_photo A(String str, Uri uri, boolean z10) {
        TLRPC.PhotoSize b02;
        Bitmap K2 = hc.K(str, uri, i0.Z0(z10), i0.Z0(z10), true);
        if (K2 == null) {
            K2 = hc.K(str, uri, 800.0f, 800.0f, true);
        }
        Bitmap bitmap = K2;
        ArrayList<TLRPC.PhotoSize> arrayList = new ArrayList<>();
        TLRPC.PhotoSize Z = hc.Z(bitmap, 90.0f, 90.0f, 55, true);
        if (Z != null) {
            arrayList.add(Z);
        }
        if (z10) {
            b02 = hc.b0(null, bitmap, Bitmap.CompressFormat.JPEG, i0.Z0(z10), i0.Z0(z10), 99, false, 101, 101, false);
        } else {
            b02 = hc.b0(null, bitmap, Bitmap.CompressFormat.JPEG, i0.Z0(z10), i0.Z0(z10), 80, false, 101, 101, false);
        }
        if (b02 != null) {
            arrayList.add(b02);
        }
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        getUserConfig().v(false);
        TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
        tL_photo.date = getConnectionsManager().getCurrentTime();
        tL_photo.sizes = arrayList;
        tL_photo.file_reference = new byte[0];
        return tL_photo;
    }

    public final void A0(cz czVar, TLRPC.InputMedia inputMedia, TLRPC.InputEncryptedFile inputEncryptedFile, String str) {
        int i10 = zs.W1;
        int i11 = 1;
        if (inputMedia == null) {
            if (inputEncryptedFile != null) {
                TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) czVar.d;
                int i12 = 0;
                while (true) {
                    if (i12 >= tL_messages_sendEncryptedMultiMedia.files.size()) {
                        break;
                    }
                    if (tL_messages_sendEncryptedMultiMedia.files.get(i12) == inputEncryptedFile) {
                        f0((TLRPC.Message) czVar.z.get(i12), czVar.H);
                        getNotificationCenter().k(i10, str, -1L, -1L, Boolean.FALSE);
                        break;
                    }
                    i12++;
                }
                t0(czVar, false);
                return;
            }
            return;
        }
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.media = inputMedia;
        TLObject tLObject = czVar.c;
        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject;
            tL_messages_uploadMedia.peer = tL_messages_sendMultiMedia.peer;
            int i13 = 0;
            while (true) {
                if (i13 >= tL_messages_sendMultiMedia.multi_media.size()) {
                    break;
                }
                if (tL_messages_sendMultiMedia.multi_media.get(i13).media == inputMedia) {
                    f0((TLRPC.Message) czVar.z.get(i13), czVar.H);
                    getNotificationCenter().k(i10, str, -1L, -1L, Boolean.FALSE);
                    break;
                }
                i13++;
            }
        } else {
            boolean z10 = tLObject instanceof TLRPC.TL_messages_sendMedia;
            if (z10) {
                TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                TLRPC.InputMedia inputMedia2 = tL_messages_sendMedia.media;
                if (inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    tL_messages_uploadMedia.peer = tL_messages_sendMedia.peer;
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia2;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= tL_inputMediaPaidMedia.extended_media.size()) {
                            break;
                        }
                        if (tL_inputMediaPaidMedia.extended_media.get(i14) == inputMedia) {
                            f0((TLRPC.Message) czVar.z.get(i14), czVar.H);
                            getNotificationCenter().k(i10, str, -1L, -1L, Boolean.FALSE);
                            break;
                        }
                        i14++;
                    }
                }
            }
            if (z10) {
                TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                TLRPC.InputMedia inputMedia3 = tL_messages_sendMedia2.media;
                if (inputMedia3 instanceof TLRPC.TL_inputMediaPoll) {
                    tL_messages_uploadMedia.peer = tL_messages_sendMedia2.peer;
                    int a2 = ih.g.a((TLRPC.TL_inputMediaPoll) inputMedia3, inputMedia);
                    int i15 = 0;
                    while (true) {
                        if (i15 >= czVar.C.size()) {
                            break;
                        }
                        if (((Integer) czVar.C.get(i15)).intValue() == a2) {
                            f0((TLRPC.Message) czVar.z.get(i15), czVar.H);
                            getNotificationCenter().k(i10, str, -1L, -1L, Boolean.FALSE);
                            break;
                        }
                        i15++;
                    }
                }
            }
            boolean z11 = tLObject instanceof TL_ephemeral.TL_sendMessage;
            if (z11) {
                TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) tLObject;
                TLRPC.InputMedia inputMedia4 = tL_sendMessage.media;
                if (inputMedia4 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    tL_messages_uploadMedia.peer = tL_sendMessage.peer;
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia2 = (TLRPC.TL_inputMediaPaidMedia) inputMedia4;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= tL_inputMediaPaidMedia2.extended_media.size()) {
                            break;
                        }
                        if (tL_inputMediaPaidMedia2.extended_media.get(i16) == inputMedia) {
                            f0((TLRPC.Message) czVar.z.get(i16), czVar.H);
                            getNotificationCenter().k(i10, str, -1L, -1L, Boolean.FALSE);
                            break;
                        }
                        i16++;
                    }
                }
            }
            if (z11) {
                TL_ephemeral.TL_sendMessage tL_sendMessage2 = (TL_ephemeral.TL_sendMessage) tLObject;
                TLRPC.InputMedia inputMedia5 = tL_sendMessage2.media;
                if (inputMedia5 instanceof TLRPC.TL_inputMediaPoll) {
                    tL_messages_uploadMedia.peer = tL_sendMessage2.peer;
                    int a10 = ih.g.a((TLRPC.TL_inputMediaPoll) inputMedia5, inputMedia);
                    int i17 = 0;
                    while (true) {
                        if (i17 >= czVar.C.size()) {
                            break;
                        }
                        if (((Integer) czVar.C.get(i17)).intValue() == a10) {
                            f0((TLRPC.Message) czVar.z.get(i17), czVar.H);
                            getNotificationCenter().k(i10, str, -1L, -1L, Boolean.FALSE);
                            break;
                        }
                        i17++;
                    }
                }
            }
        }
        getConnectionsManager().sendRequest(tL_messages_uploadMedia, new xx(this, inputMedia, czVar, i11));
    }

    public final hz B(long j10) {
        return (hz) this.D.f(j10);
    }

    public final Boolean F(jj jjVar, TLRPC.TodoItem todoItem) {
        return (Boolean) this.H.get(Integer.valueOf(Objects.hash(Long.valueOf(jj.B0(jjVar.k)), Integer.valueOf(jjVar.f1()), Integer.valueOf(todoItem.id))));
    }

    public final long I(long j10) {
        return ((Long) this.x.g(0L, j10)).longValue();
    }

    public final boolean J(int i10) {
        return this.c.indexOfKey(i10) >= 0 || this.d.indexOfKey(i10) >= 0;
    }

    public final void L(cz czVar) {
        M(czVar, -1);
    }

    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v62, types: [org.telegram.messenger.x20, org.telegram.tgnet.TLRPC$PhotoSize] */
    /* JADX WARN: Type inference failed for: r5v63 */
    public final void M(cz czVar, int i10) {
        TLObject tLObject;
        TLRPC.InputFile inputFile;
        String str;
        TLRPC.InputMedia inputMedia;
        TLRPC.InputPeer inputPeer;
        TLRPC.InputMedia inputMedia2;
        jj jjVar;
        TLRPC.PhotoSize photoSize;
        ArrayList arrayList;
        ?? r52;
        TLRPC.PhotoSize photoSize2;
        int i11;
        TLRPC.InputMedia inputMedia3;
        TLRPC.InputPeer inputPeer2;
        x20 x20Var;
        TLRPC.InputMedia d;
        TLRPC.PhotoSize photoSize3;
        qz qzVar = this;
        cz czVar2 = czVar;
        int i12 = czVar2.e;
        if (i12 == 0) {
            String str2 = czVar2.l;
            if (str2 != null) {
                qzVar.e0(str2, czVar2);
                hc.D().L(qzVar.currentAccount, czVar2.l, "file");
                return;
            }
            if (czVar2.c != null) {
                b8.G(qzVar.currentAccount);
                String file = b8.I(czVar2.g).toString();
                qzVar.e0(file, czVar2);
                qzVar.getFileLoader().i0(false, 16777216, file, true);
                qzVar.h0(czVar2.m);
                return;
            }
            b8.G(qzVar.currentAccount);
            String file2 = b8.I(czVar2.g).toString();
            if (czVar2.d != null && (photoSize3 = czVar2.g) != null && photoSize3.location.dc_id != 0) {
                File file3 = new File(file2);
                if (!file3.exists()) {
                    b8.G(qzVar.currentAccount);
                    file2 = b8.K(czVar2.g, null, true, true).toString();
                    file3 = new File(file2);
                }
                if (!file3.exists()) {
                    qzVar.e0(b8.r(null, czVar2.g), czVar2);
                    qzVar.getFileLoader().W(ic.f(czVar2.g, czVar2.h), czVar2.K, "jpg", 3, 0);
                    return;
                }
            }
            qzVar.e0(file2, czVar2);
            qzVar.getFileLoader().i0(true, 16777216, file2, true);
            qzVar.h0(czVar2.m);
            return;
        }
        if (i12 == 1) {
            x20 x20Var2 = czVar2.o;
            if (x20Var2 != null && x20Var2.c() && czVar2.p) {
                jj jjVar2 = czVar2.m;
                String str3 = jjVar2.k.attachPath;
                TLRPC.Document F0 = jjVar2.F0();
                if (str3 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(b8.z(4));
                    sb2.append("/");
                    sb2.append(F0.id);
                    sb2.append(".");
                    sb2.append(czVar2.o.N ? "webm" : "mp4");
                    str3 = sb2.toString();
                }
                qzVar.e0(str3, czVar2);
                czVar2.o.getClass();
                MediaController.B().h0(czVar2.m, false, true, false);
                qzVar.h0(czVar2.m);
                return;
            }
            x20 x20Var3 = czVar2.o;
            if (x20Var3 != null) {
                TLRPC.InputFile inputFile2 = x20Var3.w;
                if (inputFile2 != null) {
                    i11 = 4;
                    TLObject tLObject2 = czVar2.c;
                    (tLObject2 instanceof TLRPC.TL_messages_sendMedia ? ((TLRPC.TL_messages_sendMedia) tLObject2).media : tLObject2 instanceof TL_ephemeral.TL_sendMessage ? ((TL_ephemeral.TL_sendMessage) tLObject2).media : tLObject2 instanceof TLRPC.TL_messages_addPollAnswer ? ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer.input_media : ((TLRPC.TL_messages_editMessage) tLObject2).media).file = inputFile2;
                    x20Var3.w = null;
                } else {
                    i11 = 4;
                    if (x20Var3.x != null) {
                        TLRPC.TL_decryptedMessage tL_decryptedMessage = (TLRPC.TL_decryptedMessage) czVar2.d;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia = tL_decryptedMessage.media;
                        decryptedMessageMedia.size = x20Var3.q;
                        decryptedMessageMedia.key = x20Var3.y;
                        decryptedMessageMedia.iv = x20Var3.z;
                        ow secretChatHelper = qzVar.getSecretChatHelper();
                        jj jjVar3 = czVar2.m;
                        secretChatHelper.j(tL_decryptedMessage, jjVar3.k, czVar2.n, czVar2.o.x, czVar2.f, jjVar3);
                        czVar2.o.x = null;
                        return;
                    }
                }
            } else {
                i11 = 4;
            }
            TLObject tLObject3 = czVar2.c;
            if (tLObject3 == null) {
                jj jjVar4 = czVar2.m;
                String str4 = jjVar4.k.attachPath;
                TLRPC.Document F02 = jjVar4.F0();
                if (str4 == null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(b8.z(i11));
                    sb3.append("/");
                    str4 = a1.g.q(sb3, F02.id, ".mp4");
                }
                if (czVar2.d != null && F02.dc_id != 0) {
                    File file4 = new File(str4);
                    if (!file4.exists()) {
                        b8 fileLoader = qzVar.getFileLoader();
                        TLRPC.Message message = czVar2.m.k;
                        fileLoader.getClass();
                        file4 = b8.N(message, false, true);
                        if (file4 != null && file4.exists()) {
                            TLRPC.Message message2 = czVar2.m.k;
                            String absolutePath = file4.getAbsolutePath();
                            message2.attachPath = absolutePath;
                            czVar2.m.w0 = true;
                            str4 = absolutePath;
                        }
                    }
                    if (file4 == null || (!file4.exists() && czVar2.m.F0() != null)) {
                        b8 fileLoader2 = qzVar.getFileLoader();
                        TLRPC.Document F03 = czVar2.m.F0();
                        fileLoader2.getClass();
                        file4 = b8.K(F03, null, false, true);
                        if (file4 != null && file4.exists()) {
                            TLRPC.Message message3 = czVar2.m.k;
                            String absolutePath2 = file4.getAbsolutePath();
                            message3.attachPath = absolutePath2;
                            czVar2.m.w0 = true;
                            str4 = absolutePath2;
                        }
                    }
                    if (file4 == null || !file4.exists()) {
                        qzVar.e0(b8.r(null, F02), czVar2);
                        qzVar.getFileLoader().X(F02, czVar2.K, 3, 0);
                        return;
                    }
                }
                String str5 = str4;
                qzVar.e0(str5, czVar2);
                x20 x20Var4 = czVar2.m.p0;
                if (x20Var4 == null || !x20Var4.P) {
                    if (x20Var4 == null || !x20Var4.c()) {
                        qzVar.getFileLoader().i0(true, 33554432, str5, false);
                    } else {
                        qzVar.getFileLoader().h0(str5, true, false, F02.size, 33554432, false);
                    }
                }
                qzVar.h0(czVar2.m);
                return;
            }
            if (tLObject3 instanceof TLRPC.TL_messages_sendMedia) {
                TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject3;
                inputMedia3 = tL_messages_sendMedia.media;
                inputPeer2 = tL_messages_sendMedia.peer;
            } else if (tLObject3 instanceof TL_ephemeral.TL_sendMessage) {
                TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) tLObject3;
                inputMedia3 = tL_sendMessage.media;
                inputPeer2 = tL_sendMessage.peer;
            } else if (tLObject3 instanceof TLRPC.TL_messages_addPollAnswer) {
                TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) tLObject3;
                inputMedia3 = tL_messages_addPollAnswer.answer.input_media;
                inputPeer2 = tL_messages_addPollAnswer.peer;
            } else {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) tLObject3;
                inputMedia3 = tL_messages_editMessage.media;
                inputPeer2 = tL_messages_editMessage.peer;
            }
            if (inputMedia3 instanceof TLRPC.TL_inputMediaPaidMedia) {
                TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia3;
                if (!tL_inputMediaPaidMedia.extended_media.isEmpty()) {
                    inputMedia3 = tL_inputMediaPaidMedia.extended_media.get(0);
                }
            }
            if ((inputMedia3 instanceof TLRPC.TL_inputMediaPoll) && (d = ih.g.d((TLRPC.TL_inputMediaPoll) inputMedia3)) != null) {
                inputMedia3 = d;
            }
            TLRPC.InputFile inputFile3 = inputMedia3.file;
            if (inputFile3 == null && !(inputMedia3 instanceof TLRPC.TL_inputMediaDocument) && czVar2.p) {
                jj jjVar5 = czVar2.m;
                String str6 = jjVar5.k.attachPath;
                TLRPC.Document F04 = jjVar5.F0();
                TLRPC.TL_document tL_document = czVar2.m.C1;
                if (tL_document != null) {
                    F04 = tL_document;
                }
                if (str6 == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(b8.z(i11));
                    sb4.append("/");
                    str6 = a1.g.q(sb4, F04.id, ".mp4");
                }
                String str7 = str6;
                qzVar.e0(str7, czVar2);
                x20 x20Var5 = czVar2.m.p0;
                if (x20Var5 == null || !x20Var5.P) {
                    if (x20Var5 == null || !x20Var5.c()) {
                        qzVar.getFileLoader().i0(false, 33554432, str7, false);
                    } else {
                        qzVar.getFileLoader().h0(str7, false, false, F04.size, 33554432, false);
                    }
                }
                qzVar.h0(czVar2.m);
                return;
            }
            TLRPC.InputPhoto inputPhoto = inputMedia3.video_cover;
            if (inputPhoto == null && czVar2.j == null && czVar2.i != null && czVar2.q) {
                String str8 = b8.z(i11) + "/" + czVar2.i.location.volume_id + "_" + czVar2.i.location.local_id + ".jpg";
                qzVar.e0(str8, czVar2);
                qzVar.getFileLoader().i0(false, 16777216, str8, true);
                qzVar.h0(czVar2.m);
                return;
            }
            if (czVar2.k && (inputMedia3 instanceof TLRPC.TL_inputMediaUploadedDocument) && inputFile3 != null && czVar2.j != null) {
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = inputPeer2;
                inputMedia3.flags &= -65;
                inputMedia3.video_cover = null;
                tL_messages_uploadMedia.media = inputMedia3;
                qzVar.getConnectionsManager().sendRequest(tL_messages_uploadMedia, new v4(9, qzVar, czVar2));
                return;
            }
            if (inputPhoto == null && czVar2.j != null && czVar2.q) {
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia2 = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia2.peer = inputPeer2;
                TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                tL_inputMediaUploadedPhoto.file = czVar2.j;
                tL_messages_uploadMedia2.media = tL_inputMediaUploadedPhoto;
                qzVar.getConnectionsManager().sendRequest(tL_messages_uploadMedia2, new xx(qzVar, inputMedia3, czVar2, 0));
                return;
            }
            jj jjVar6 = czVar2.m;
            String str9 = b8.z(i11) + "/" + czVar2.g.location.volume_id + "_" + czVar2.g.location.local_id + "." + ((jjVar6 == null || (x20Var = jjVar6.p0) == null || !x20Var.N) ? "jpg" : "webp");
            qzVar.e0(str9, czVar2);
            qzVar.getFileLoader().i0(false, 16777216, str9, true);
            qzVar.h0(czVar2.m);
            return;
        }
        if (i12 == 2) {
            String str10 = czVar2.l;
            if (str10 != null) {
                qzVar.e0(str10, czVar2);
                hc.D().L(qzVar.currentAccount, czVar2.l, "gif");
                return;
            }
            TLObject tLObject4 = czVar2.c;
            if (tLObject4 != null) {
                TLRPC.InputMedia inputMedia4 = tLObject4 instanceof TLRPC.TL_messages_sendMedia ? ((TLRPC.TL_messages_sendMedia) tLObject4).media : tLObject4 instanceof TL_ephemeral.TL_sendMessage ? ((TL_ephemeral.TL_sendMessage) tLObject4).media : tLObject4 instanceof TLRPC.TL_messages_addPollAnswer ? ((TLRPC.TL_messages_addPollAnswer) tLObject4).answer.input_media : ((TLRPC.TL_messages_editMessage) tLObject4).media;
                if (inputMedia4.file == null) {
                    String str11 = czVar2.m.k.attachPath;
                    qzVar.e0(str11, czVar2);
                    qzVar.getFileLoader().i0(czVar2.c == null, 67108864, str11, false);
                    qzVar.h0(czVar2.m);
                    return;
                }
                if (inputMedia4.thumb != null || (photoSize2 = czVar2.g) == null || (photoSize2 instanceof TLRPC.TL_photoStrippedSize)) {
                    return;
                }
                String str12 = b8.z(4) + "/" + czVar2.g.location.volume_id + "_" + czVar2.g.location.local_id + ".jpg";
                qzVar.e0(str12, czVar2);
                qzVar.getFileLoader().i0(false, 16777216, str12, true);
                qzVar.h0(czVar2.m);
                return;
            }
            jj jjVar7 = czVar2.m;
            String str13 = jjVar7.k.attachPath;
            TLRPC.Document F05 = jjVar7.F0();
            if (czVar2.d != null && F05.dc_id != 0) {
                File file5 = new File(str13);
                if (!file5.exists()) {
                    b8 fileLoader3 = qzVar.getFileLoader();
                    TLRPC.Message message4 = czVar2.m.k;
                    fileLoader3.getClass();
                    file5 = b8.N(message4, false, true);
                    if (file5 != null && file5.exists()) {
                        TLRPC.Message message5 = czVar2.m.k;
                        String absolutePath3 = file5.getAbsolutePath();
                        message5.attachPath = absolutePath3;
                        czVar2.m.w0 = true;
                        str13 = absolutePath3;
                    }
                }
                if (file5 == null || (!file5.exists() && czVar2.m.F0() != null)) {
                    b8 fileLoader4 = qzVar.getFileLoader();
                    TLRPC.Document F06 = czVar2.m.F0();
                    fileLoader4.getClass();
                    file5 = b8.K(F06, null, false, true);
                    if (file5 != null && file5.exists()) {
                        TLRPC.Message message6 = czVar2.m.k;
                        String absolutePath4 = file5.getAbsolutePath();
                        message6.attachPath = absolutePath4;
                        czVar2.m.w0 = true;
                        str13 = absolutePath4;
                    }
                }
                if (file5 == null || !file5.exists()) {
                    qzVar.e0(b8.r(null, F05), czVar2);
                    qzVar.getFileLoader().X(F05, czVar2.K, 3, 0);
                    return;
                }
            }
            qzVar.e0(str13, czVar2);
            qzVar.getFileLoader().i0(true, 67108864, str13, false);
            qzVar.h0(czVar2.m);
            return;
        }
        if (i12 == 3) {
            String str14 = czVar2.m.k.attachPath;
            qzVar.e0(str14, czVar2);
            qzVar.getFileLoader().i0(czVar2.c == null, ConnectionsManager.FileTypeAudio, str14, true);
            qzVar.h0(czVar2.m);
            return;
        }
        if (i12 != 4) {
            if (i12 == 5) {
                String str15 = "stickerset_" + czVar2.m.f1();
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = (TLRPC.InputStickerSet) czVar2.K;
                qzVar.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new ci(qzVar, czVar2, str15, 10));
                qzVar.e0(str15, czVar2);
                return;
            }
            return;
        }
        boolean z10 = i10 < 0;
        if (czVar2.p || czVar2.q) {
            int size = i10 < 0 ? czVar2.x.size() - 1 : i10;
            jj jjVar8 = (jj) czVar2.x.get(size);
            TLRPC.Document F07 = jjVar8.F0();
            if (F07 == null && (jj.n1(jjVar8) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) jj.n1(jjVar8);
                TLRPC.MessageExtendedMedia messageExtendedMedia = size >= tL_messageMediaPaidMedia.extended_media.size() ? null : tL_messageMediaPaidMedia.extended_media.get(size);
                TLRPC.MessageMedia messageMedia = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia ? ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media : null;
                F07 = messageMedia == null ? null : messageMedia.document;
            }
            if (F07 == null && (jj.n1(jjVar8) instanceof TLRPC.TL_messageMediaPoll)) {
                TLRPC.MessageMedia f7 = ih.g.f((TLRPC.TL_messageMediaPoll) jj.n1(jjVar8), ((Integer) czVar2.C.get(size)).intValue());
                F07 = f7 == null ? null : f7.document;
            }
            if (F07 != null) {
                x20 x20Var6 = czVar2.o;
                if (x20Var6 != null && x20Var6.c() && czVar2.p) {
                    String str16 = jjVar8.k.attachPath;
                    if (str16 == null) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(b8.z(4));
                        sb5.append("/");
                        str16 = a1.g.q(sb5, F07.id, ".mp4");
                    }
                    qzVar.e0(str16, czVar2);
                    czVar2.E.put(jjVar8, str16);
                    czVar2.E.put(str16 + "_i", jjVar8);
                    TLRPC.PhotoSize photoSize4 = czVar2.g;
                    if (photoSize4 != null && photoSize4.location != null) {
                        czVar2.E.put(sc.e.A(str16, "_t"), czVar2.g);
                    }
                    TLRPC.PhotoSize photoSize5 = czVar2.i;
                    if (photoSize5 != null && photoSize5.location != null) {
                        czVar2.E.put(sc.e.A(str16, "_ct"), czVar2.i);
                    }
                    czVar2.o.getClass();
                    MediaController.B().h0(jjVar8, false, true, false);
                    czVar2.m = jjVar8;
                    qzVar.h0(jjVar8);
                } else {
                    String str17 = jjVar8.k.attachPath;
                    if (str17 == null) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(b8.z(4));
                        sb6.append("/");
                        str = "_ct";
                        str17 = a1.g.q(sb6, F07.id, ".mp4");
                    } else {
                        str = "_ct";
                    }
                    TLObject tLObject5 = czVar2.c;
                    if (tLObject5 != null) {
                        if (tLObject5 instanceof TLRPC.TL_messages_sendMultiMedia) {
                            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject5;
                            inputPeer = tL_messages_sendMultiMedia.peer;
                            inputMedia = tL_messages_sendMultiMedia.multi_media.get(size).media;
                        } else if (tLObject5 instanceof TLRPC.TL_messages_sendMedia) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject5;
                            inputPeer = tL_messages_sendMedia2.peer;
                            TLRPC.InputMedia inputMedia5 = tL_messages_sendMedia2.media;
                            if (inputMedia5 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                inputMedia = ((TLRPC.TL_inputMediaPaidMedia) inputMedia5).extended_media.get(size);
                            } else {
                                if (inputMedia5 instanceof TLRPC.TL_inputMediaPoll) {
                                    inputMedia = ih.g.e((TLRPC.TL_inputMediaPoll) inputMedia5, ((Integer) czVar2.C.get(size)).intValue());
                                }
                                inputMedia = null;
                            }
                        } else if (tLObject5 instanceof TL_ephemeral.TL_sendMessage) {
                            TL_ephemeral.TL_sendMessage tL_sendMessage2 = (TL_ephemeral.TL_sendMessage) tLObject5;
                            inputPeer = tL_sendMessage2.peer;
                            TLRPC.InputMedia inputMedia6 = tL_sendMessage2.media;
                            if (inputMedia6 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                inputMedia = ((TLRPC.TL_inputMediaPaidMedia) inputMedia6).extended_media.get(size);
                            } else {
                                if (inputMedia6 instanceof TLRPC.TL_inputMediaPoll) {
                                    inputMedia = ih.g.e((TLRPC.TL_inputMediaPoll) inputMedia6, ((Integer) czVar2.C.get(size)).intValue());
                                }
                                inputMedia = null;
                            }
                        } else {
                            inputMedia = null;
                            inputPeer = null;
                        }
                        if (inputMedia == null || inputMedia.file != null || (inputMedia instanceof TLRPC.TL_inputMediaDocument) || !czVar2.p) {
                            String str18 = str;
                            String str19 = str17;
                            TLRPC.PhotoSize photoSize6 = czVar2.i;
                            if (photoSize6 != null) {
                                photoSize = photoSize6;
                                if (czVar2.j == null && inputMedia != null && inputMedia.video_cover == null) {
                                    StringBuilder sb7 = new StringBuilder();
                                    sb7.append(b8.z(4));
                                    sb7.append("/");
                                    TLRPC.InputMedia inputMedia7 = inputMedia;
                                    sb7.append(czVar2.i.location.volume_id);
                                    sb7.append("_");
                                    sb7.append(czVar2.i.location.local_id);
                                    sb7.append(".jpg");
                                    String sb8 = sb7.toString();
                                    qzVar.e0(sb8, czVar2);
                                    TLRPC.PhotoSize photoSize7 = czVar2.i;
                                    if (photoSize7 != null && photoSize7.location != null) {
                                        StringBuilder sb9 = new StringBuilder();
                                        sb9.append(b8.z(4));
                                        sb9.append("/");
                                        sb9.append(czVar2.i.location.volume_id);
                                        sb9.append("_");
                                        String p5 = a1.g.p(sb9, czVar2.i.location.local_id, ".jpg");
                                        czVar2.E.put(sc.e.A(str19, str18), czVar2.i);
                                        czVar2.E.put(p5 + "_doc", str19);
                                    }
                                    czVar2.E.put(sb8 + "_o", str19);
                                    czVar2.E.put(str19 + "_i", jjVar8);
                                    czVar2.E.put(jjVar8, sb8);
                                    czVar2.E.put(sb8, inputMedia7);
                                    qzVar.getFileLoader().i0(false, 16777216, sb8, true);
                                    qzVar.h0(jjVar8);
                                } else {
                                    inputMedia2 = inputMedia;
                                    jjVar = jjVar8;
                                }
                            } else {
                                inputMedia2 = inputMedia;
                                jjVar = jjVar8;
                                photoSize = photoSize6;
                            }
                            if (photoSize == null || czVar2.j == null || inputMedia2 == null || inputMedia2.video_cover != null || !(inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) || inputMedia2.file == null || !(czVar2.c instanceof TLRPC.TL_messages_sendMultiMedia) || (arrayList = czVar2.D) == null || size < 0 || size >= arrayList.size() || !Boolean.TRUE.equals(czVar2.D.get(size))) {
                                TLRPC.InputMedia inputMedia8 = inputMedia2;
                                if (czVar2.i == null || czVar2.j == null || inputMedia8 == null || inputMedia8.video_cover != null) {
                                    qzVar = this;
                                    if (czVar2.g != null) {
                                        String str20 = b8.z(4) + "/" + czVar2.g.location.volume_id + "_" + czVar2.g.location.local_id + ".jpg";
                                        qzVar.e0(str20, czVar2);
                                        czVar2.E.put(str20 + "_o", str19);
                                        czVar2.E.put(jjVar, str20);
                                        czVar2.E.put(str20, inputMedia8);
                                        qzVar.getFileLoader().i0(false, 16777216, str20, true);
                                        qzVar.h0(jjVar);
                                    }
                                } else {
                                    TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia3 = new TLRPC.TL_messages_uploadMedia();
                                    tL_messages_uploadMedia3.peer = inputPeer;
                                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto2 = new TLRPC.TL_inputMediaUploadedPhoto();
                                    tL_inputMediaUploadedPhoto2.file = czVar2.j;
                                    tL_messages_uploadMedia3.media = tL_inputMediaUploadedPhoto2;
                                    qzVar = this;
                                    getConnectionsManager().sendRequest(tL_messages_uploadMedia3, new ko(qzVar, inputMedia8, czVar2, str19, jjVar, 4));
                                }
                            } else {
                                TLRPC.InputFile inputFile4 = czVar2.j;
                                inputMedia2.flags &= -65;
                                inputMedia2.video_cover = null;
                                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia4 = new TLRPC.TL_messages_uploadMedia();
                                tL_messages_uploadMedia4.peer = inputPeer;
                                tL_messages_uploadMedia4.media = inputMedia2;
                                ConnectionsManager connectionsManager = qzVar.getConnectionsManager();
                                yx yxVar = new yx(qzVar, inputFile4, inputMedia2, czVar2, size, str19, 0);
                                czVar2 = czVar2;
                                connectionsManager.sendRequest(tL_messages_uploadMedia4, yxVar);
                                r52 = 0;
                                qzVar = this;
                                czVar2.o = r52;
                                czVar2.g = r52;
                                czVar2.i = r52;
                                inputFile = r52;
                            }
                        } else {
                            qzVar.e0(str17, czVar2);
                            czVar2.E.put(jjVar8, str17);
                            czVar2.E.put(str17, inputMedia);
                            czVar2.E.put(str17 + "_i", jjVar8);
                            TLRPC.PhotoSize photoSize8 = czVar2.g;
                            if (photoSize8 != null && photoSize8.location != null) {
                                czVar2.E.put(sc.e.A(str17, "_t"), czVar2.g);
                            }
                            TLRPC.PhotoSize photoSize9 = czVar2.i;
                            if (photoSize9 != null && photoSize9.location != null) {
                                StringBuilder sb10 = new StringBuilder();
                                sb10.append(b8.z(4));
                                sb10.append("/");
                                sb10.append(czVar2.i.location.volume_id);
                                sb10.append("_");
                                String p9 = a1.g.p(sb10, czVar2.i.location.local_id, ".jpg");
                                czVar2.E.put(sc.e.A(str17, str), czVar2.i);
                                czVar2.E.put(p9 + "_doc", str17);
                            }
                            x20 x20Var7 = jjVar8.p0;
                            if (x20Var7 == null || !x20Var7.c()) {
                                qzVar.getFileLoader().i0(false, 33554432, str17, false);
                            } else {
                                qzVar.getFileLoader().h0(str17, false, false, F07.size, 33554432, false);
                            }
                            qzVar.h0(jjVar8);
                        }
                    } else {
                        String str21 = str17;
                        TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) czVar2.d;
                        qzVar.e0(str21, czVar2);
                        czVar2.E.put(jjVar8, str21);
                        czVar2.E.put(str21, tL_messages_sendEncryptedMultiMedia.files.get(size));
                        czVar2.E.put(str21 + "_i", jjVar8);
                        TLRPC.PhotoSize photoSize10 = czVar2.g;
                        if (photoSize10 != null && photoSize10.location != null) {
                            czVar2.E.put(sc.e.A(str21, "_t"), czVar2.g);
                        }
                        x20 x20Var8 = jjVar8.p0;
                        if (x20Var8 == null || !x20Var8.c()) {
                            qzVar.getFileLoader().i0(true, 33554432, str21, false);
                        } else {
                            qzVar.getFileLoader().h0(str21, true, false, F07.size, 33554432, false);
                        }
                        qzVar.h0(jjVar8);
                    }
                }
                r52 = 0;
                czVar2.o = r52;
                czVar2.g = r52;
                czVar2.i = r52;
                inputFile = r52;
            } else {
                String str22 = czVar2.l;
                if (str22 != null) {
                    qzVar.e0(str22, czVar2);
                    czVar2.E.put(jjVar8, czVar2.l);
                    czVar2.E.put(czVar2.l, jjVar8);
                    hc.D().L(qzVar.currentAccount, czVar2.l, "file");
                    inputFile = null;
                    czVar2.l = null;
                } else {
                    TLObject tLObject6 = czVar2.c;
                    if (tLObject6 instanceof TLRPC.TL_messages_sendMultiMedia) {
                        tLObject = ((TLRPC.TL_messages_sendMultiMedia) tLObject6).multi_media.get(size).media;
                    } else {
                        boolean z11 = tLObject6 instanceof TLRPC.TL_messages_sendMedia;
                        if (z11) {
                            TLRPC.InputMedia inputMedia9 = ((TLRPC.TL_messages_sendMedia) tLObject6).media;
                            if (inputMedia9 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                tLObject = ((TLRPC.TL_inputMediaPaidMedia) inputMedia9).extended_media.get(size);
                            }
                        }
                        if (z11) {
                            TLRPC.InputMedia inputMedia10 = ((TLRPC.TL_messages_sendMedia) tLObject6).media;
                            if (inputMedia10 instanceof TLRPC.TL_inputMediaPoll) {
                                tLObject = ih.g.e((TLRPC.TL_inputMediaPoll) inputMedia10, ((Integer) czVar2.C.get(size)).intValue());
                            }
                        }
                        boolean z12 = tLObject6 instanceof TL_ephemeral.TL_sendMessage;
                        if (z12) {
                            TLRPC.InputMedia inputMedia11 = ((TL_ephemeral.TL_sendMessage) tLObject6).media;
                            if (inputMedia11 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                tLObject = ((TLRPC.TL_inputMediaPaidMedia) inputMedia11).extended_media.get(size);
                            }
                        }
                        if (z12) {
                            TLRPC.InputMedia inputMedia12 = ((TL_ephemeral.TL_sendMessage) tLObject6).media;
                            if (inputMedia12 instanceof TLRPC.TL_inputMediaPoll) {
                                tLObject = ih.g.e((TLRPC.TL_inputMediaPoll) inputMedia12, ((Integer) czVar2.C.get(size)).intValue());
                            }
                        }
                        tLObject = ((TLRPC.TL_messages_sendEncryptedMultiMedia) czVar2.d).files.get(size);
                    }
                    b8.G(qzVar.currentAccount);
                    String file6 = b8.I(czVar2.g).toString();
                    qzVar.e0(file6, czVar2);
                    czVar2.E.put(file6, tLObject);
                    czVar2.E.put(jjVar8, file6);
                    qzVar.getFileLoader().i0(czVar2.d != null, 16777216, file6, true);
                    qzVar.h0(jjVar8);
                    inputFile = null;
                    czVar2.g = null;
                }
            }
            czVar2.j = inputFile;
            czVar2.p = false;
            czVar2.q = false;
        } else if (!czVar2.x.isEmpty()) {
            qzVar.f0(((jj) i0.a.g(1, czVar2.x)).k, czVar2.G != 0);
        }
        qzVar.t0(czVar2, z10);
    }

    public final void N(TLObject tLObject, jj jjVar, String str, cz czVar, Object obj, HashMap hashMap, boolean z10) {
        O(tLObject, jjVar, str, null, false, czVar, obj, hashMap, z10);
    }

    public final void O(TLObject tLObject, final jj jjVar, final String str, final cz czVar, final boolean z10, final cz czVar2, final Object obj, final HashMap hashMap, final boolean z11) {
        cz y3;
        ArrayList arrayList;
        TLObject tLObject2 = tLObject;
        if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
            TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) tLObject;
            TLRPC.InputMedia inputMedia = tL_messages_addPollAnswer.answer.input_media;
            if ((inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument) || (inputMedia instanceof TLRPC.TL_inputMediaUploadedPhoto)) {
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = tL_messages_addPollAnswer.peer;
                tL_messages_uploadMedia.media = tL_messages_addPollAnswer.answer.input_media;
                getConnectionsManager().sendRequest(tL_messages_uploadMedia, new zx(this, tL_messages_addPollAnswer, tLObject, jjVar, str, czVar, z10, czVar2, obj, hashMap, z11));
                return;
            }
            tLObject2 = tLObject;
        }
        if (!(tLObject2 instanceof TLRPC.TL_messages_editMessage) && z10 && (y3 = y(jjVar.f1(), jj.B0(jjVar.k))) != null) {
            boolean z12 = czVar != null ? czVar.H : false;
            dz dzVar = new dz();
            dzVar.a = tLObject2;
            dzVar.b = jjVar;
            dzVar.d = str;
            dzVar.g = czVar2;
            dzVar.h = obj;
            dzVar.i = z12;
            if (y3.b == null) {
                y3.b = new ArrayList();
            }
            y3.b.add(dzVar);
            if (czVar == null || (arrayList = czVar.b) == null) {
                return;
            }
            y3.b.addAll(arrayList);
            return;
        }
        TLRPC.Message message = jjVar.k;
        f0(message, z11);
        rh.e6 y10 = rh.e6.y(this.currentAccount, false);
        zw zwVar = new zw(this, tLObject2, jjVar, str, czVar, z10, czVar2, obj, hashMap, z11, 1);
        if (jjVar.k != null) {
            int f12 = jjVar.f1();
            if (rh.e6.o(tLObject) > 0 && y10.Q.remove(Integer.valueOf(f12))) {
                y10.R.put(Integer.valueOf(f12), zwVar);
                return;
            }
        }
        if (j2.b(this.currentAccount).a(tLObject, Collections.singletonList(jjVar), new zw(this, tLObject, jjVar, str, czVar, z10, czVar2, obj, hashMap, z11, 2))) {
            if (rf.s.g(this.currentAccount).a(tLObject, Collections.singletonList(jjVar), new q20() { // from class: org.telegram.messenger.ay
                @Override // org.telegram.messenger.q20
                public final void a(Object obj2) {
                    boolean z13 = z11;
                    qz.this.O((TLObject) obj2, jjVar, str, czVar, z10, czVar2, obj, hashMap, z13);
                }
            })) {
                message.reqId = getConnectionsManager().sendRequest(tLObject, new zx(this, tLObject, jjVar, str, czVar, z10, czVar2, obj, hashMap, z11, message), new p(6, this, message), (tLObject instanceof TLRPC.TL_messages_sendMessage ? 128 : 0) | 68);
                if (czVar != null) {
                    czVar.d();
                }
            }
        }
    }

    public final void P(final TLObject tLObject, final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3, final cz czVar, final boolean z10) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f0(((jj) arrayList.get(i10)).k, z10);
        }
        final int i11 = 0;
        if (rh.e6.y(this.currentAccount, false).c(tLObject, arrayList, new Runnable(this) { // from class: org.telegram.messenger.sx
            public final /* synthetic */ qz b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.P(tLObject, arrayList, arrayList2, arrayList3, czVar, z10);
                        break;
                    default:
                        this.b.P(tLObject, arrayList, arrayList2, arrayList3, czVar, z10);
                        break;
                }
            }
        })) {
            final int i12 = 1;
            if (j2.b(this.currentAccount).a(tLObject, arrayList, new Runnable(this) { // from class: org.telegram.messenger.sx
                public final /* synthetic */ qz b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            this.b.P(tLObject, arrayList, arrayList2, arrayList3, czVar, z10);
                            break;
                        default:
                            this.b.P(tLObject, arrayList, arrayList2, arrayList3, czVar, z10);
                            break;
                    }
                }
            }) && rf.s.g(this.currentAccount).a(tLObject, arrayList, new q20() { // from class: org.telegram.messenger.vx
                @Override // org.telegram.messenger.q20
                public final void a(Object obj) {
                    boolean z11 = z10;
                    qz.this.P((TLObject) obj, arrayList, arrayList2, arrayList3, czVar, z11);
                }
            })) {
                getConnectionsManager().sendRequest(tLObject, new RequestDelegate() { // from class: org.telegram.messenger.wx
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                        ArrayList arrayList4;
                        boolean z11;
                        boolean[] zArr;
                        qz qzVar = qz.this;
                        TLObject tLObject3 = tLObject;
                        ArrayList arrayList5 = arrayList;
                        ArrayList arrayList6 = arrayList2;
                        boolean z12 = z10;
                        if (tL_error == null || !w8.r(tL_error.text)) {
                            arrayList4 = arrayList6;
                            z11 = z12;
                        } else {
                            int c10 = w8.c(tL_error.text);
                            ArrayList arrayList7 = arrayList3;
                            arrayList4 = arrayList6;
                            z11 = z12;
                            cz czVar2 = czVar;
                            if (arrayList7 != null) {
                                ArrayList arrayList8 = new ArrayList(arrayList7);
                                if (c10 >= 0) {
                                    int i13 = 0;
                                    while (i13 < arrayList8.size()) {
                                        arrayList8.set(i13, c10 == i13 ? arrayList8.get(i13) : null);
                                        i13++;
                                    }
                                }
                                qzVar.getFileRefController().u(new Object[]{tLObject3, arrayList5, arrayList4, arrayList8, czVar2, Boolean.valueOf(z11)}, arrayList8);
                                return;
                            }
                            if (czVar2 != null) {
                                if (!((c10 < 0 || (zArr = czVar2.s) == null || c10 >= zArr.length) ? czVar2.r : zArr[c10])) {
                                    if (c10 < 0) {
                                        czVar2.r = true;
                                    } else {
                                        if (czVar2.s == null) {
                                            czVar2.s = new boolean[czVar2.x.size()];
                                        }
                                        czVar2.s[c10] = true;
                                    }
                                    i0.g3(new b5(qzVar, tLObject3, c10, czVar2, arrayList5, z11));
                                    return;
                                }
                            }
                        }
                        i0.g3(new gy(qzVar, tL_error, tLObject2, z11, arrayList5, arrayList4, tLObject3));
                    }
                }, (QuickAckDelegate) null, 68);
            }
        }
    }

    public final void Q(long j10, Uri uri, ArrayList arrayList, c90 c90Var) {
        if (this.D.f(j10) != null) {
            c90Var.run(0L);
            return;
        }
        if (o5.z(j10)) {
            long j11 = -j10;
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j11));
            if (L0 != null && !L0.megagroup) {
                getMessagesController().T(null, j11, null, new lh(this, uri, arrayList, c90Var), null);
                return;
            }
        }
        new Thread(new ym(this, arrayList, j10, uri, c90Var, 3)).start();
    }

    public final void a(TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, long j10) {
        if (j10 != 0) {
            TLRPC.InputPeer i12 = getMessagesController().i1(j10);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_forwardMessages.reply_to;
            if (inputReplyTo == null) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_messages_forwardMessages.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = i12;
            } else if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                inputReplyTo.monoforum_peer_id = i12;
                inputReplyTo.flags |= 32;
            }
        }
    }

    public final void b(TLRPC.TL_messages_sendInlineBotResult tL_messages_sendInlineBotResult, long j10) {
        if (j10 != 0) {
            TLRPC.InputPeer i12 = getMessagesController().i1(j10);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendInlineBotResult.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = i12;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendInlineBotResult.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = i12;
            tL_messages_sendInlineBotResult.flags |= 1;
        }
    }

    public final void c(TLRPC.TL_messages_sendMedia tL_messages_sendMedia, long j10) {
        if (j10 != 0) {
            TLRPC.InputPeer i12 = getMessagesController().i1(j10);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMedia.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = i12;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMedia.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = i12;
            tL_messages_sendMedia.flags |= 1;
        }
    }

    public final void c0(jj jjVar, long j10, long j11, long j12, oj ojVar) {
        if (jjVar == null) {
            return;
        }
        TLRPC.Message message = jjVar.k;
        TLRPC.MessageMedia messageMedia = message.media;
        ArrayList arrayList = null;
        r4 = null;
        r4 = null;
        HashMap hashMap = null;
        arrayList = null;
        if (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || (messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaGame) || (messageMedia instanceof TLRPC.TL_messageMediaInvoice)) {
            if (message.message == null) {
                if (o5.C(j10)) {
                    q0(m5.j(jjVar), j10, true, false, true, 0, 0, null, -1, j11, j12, ojVar);
                    return;
                }
                return;
            }
            TLRPC.WebPage webPage = messageMedia instanceof TLRPC.TL_messageMediaWebPage ? messageMedia.webpage : null;
            ArrayList<TLRPC.MessageEntity> arrayList2 = message.entities;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < jjVar.k.entities.size(); i10++) {
                    TLRPC.MessageEntity messageEntity = jjVar.k.entities.get(i10);
                    if ((messageEntity instanceof TLRPC.TL_messageEntityBold) || (messageEntity instanceof TLRPC.TL_messageEntityItalic) || (messageEntity instanceof TLRPC.TL_messageEntityPre) || (messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) || (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                        arrayList.add(messageEntity);
                    }
                }
            }
            oz b10 = oz.b(jjVar.k.message, j10, jjVar.C, null, webPage, true, arrayList, null, null, true, 0, 0, null, false);
            b10.Q = j11;
            b10.R = j12;
            b10.T = ojVar;
            r0(b10);
            return;
        }
        if (o5.C(j10)) {
            TLRPC.Message message2 = jjVar.k;
            if (message2.peer_id != null) {
                TLRPC.MessageMedia messageMedia2 = message2.media;
                if ((messageMedia2.photo instanceof TLRPC.TL_photo) || (messageMedia2.document instanceof TLRPC.TL_document)) {
                    hashMap = new HashMap();
                    hashMap.put("parentObject", "sent_" + jjVar.k.peer_id.channel_id + "_" + jjVar.f1() + "_" + jj.B0(jjVar.k) + "_" + jjVar.D + "_" + jjVar.T1());
                }
            }
        }
        HashMap hashMap2 = hashMap;
        TLRPC.Message message3 = jjVar.k;
        TLRPC.MessageMedia messageMedia3 = message3.media;
        TLRPC.Photo photo = messageMedia3.photo;
        if (photo instanceof TLRPC.TL_photo) {
            oz c10 = oz.c(null, message3.message, null, (TLRPC.TL_photo) photo, null, null, null, null, null, null, j10, null, jjVar.C, null, null, true, null, message3.entities, null, hashMap2, true, 0, 0, messageMedia3.ttl_seconds, jjVar, null, false, false);
            c10.Q = j11;
            c10.R = j12;
            c10.T = ojVar;
            r0(c10);
            return;
        }
        TLRPC.Document document = messageMedia3.document;
        if (document instanceof TLRPC.TL_document) {
            oz f7 = oz.f((TLRPC.TL_document) document, null, message3.attachPath, j10, jjVar.C, null, message3.message, message3.entities, null, hashMap2, true, 0, 0, messageMedia3.ttl_seconds, jjVar, null, false);
            f7.Q = j11;
            f7.R = j12;
            f7.T = ojVar;
            r0(f7);
            return;
        }
        if ((messageMedia3 instanceof TLRPC.TL_messageMediaVenue) || (messageMedia3 instanceof TLRPC.TL_messageMediaGeo)) {
            oz d = oz.d(messageMedia3, j10, jjVar.C, null, null, null, true, 0);
            d.Q = j11;
            d.R = j12;
            d.T = ojVar;
            r0(d);
            return;
        }
        if (messageMedia3.phone_number == null) {
            if (o5.C(j10)) {
                return;
            }
            q0(m5.j(jjVar), j10, true, false, true, 0, 0, null, -1, j11, j12, ojVar);
            return;
        }
        TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
        TLRPC.MessageMedia messageMedia4 = jjVar.k.media;
        tL_userContact_old2.phone = messageMedia4.phone_number;
        tL_userContact_old2.first_name = messageMedia4.first_name;
        tL_userContact_old2.last_name = messageMedia4.last_name;
        tL_userContact_old2.id = messageMedia4.user_id;
        oz g10 = oz.g(tL_userContact_old2, j10, jjVar.C, null, null, null, true, 0, 0);
        g10.R = j12;
        g10.T = ojVar;
        g10.Q = j11;
        r0(g10);
    }

    public final void d(TLRPC.TL_messages_sendMessage tL_messages_sendMessage, long j10) {
        if (j10 != 0) {
            TLRPC.InputPeer i12 = getMessagesController().i1(j10);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMessage.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = i12;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMessage.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = i12;
            tL_messages_sendMessage.flags |= 1;
        }
    }

    public final void d0(int i10) {
        SparseArray sparseArray = this.b;
        int size = sparseArray.size();
        sparseArray.remove(i10);
        if (size == 0 || sparseArray.size() != 0) {
            return;
        }
        hs messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new br(messagesStorage, 29));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0179  */
    @Override // org.telegram.messenger.us
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        jj jjVar;
        char c10;
        jj jjVar2;
        String str;
        ArrayList arrayList;
        int i12;
        int i13;
        int i14;
        int i15;
        jz jzVar;
        char c11;
        String str2;
        lz lzVar;
        ArrayList arrayList2;
        TLRPC.InputMedia inputMedia;
        TLRPC.InputFile inputFile;
        String str3;
        int i16;
        String str4;
        String str5;
        TLRPC.InputEncryptedFile inputEncryptedFile;
        TLObject tLObject;
        int i17;
        TLRPC.TL_decryptedMessage tL_decryptedMessage;
        String str6;
        char c12;
        int i18;
        HashMap hashMap;
        HashMap hashMap2;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        TLRPC.PhotoSize photoSize3;
        TLRPC.PhotoSize photoSize4;
        TLRPC.PhotoSize photoSize5;
        jj jjVar3;
        x20 x20Var;
        qz qzVar = this;
        int i19 = 0;
        boolean z10 = 1;
        if (i10 == zs.W1) {
            String str7 = (String) objArr[0];
            hz hzVar = (hz) qzVar.y.get(str7);
            if (hzVar != null) {
                hzVar.b(str7, ((Long) objArr[1]).longValue(), r3.longValue() / ((Long) objArr[2]).longValue());
            }
            lz lzVar2 = (lz) qzVar.E.get(str7);
            if (lzVar2 != null) {
                lzVar2.a(str7, ((Long) objArr[1]).longValue(), r3.longValue() / ((Long) objArr[2]).longValue());
                return;
            }
            return;
        }
        String str8 = "_t";
        int i20 = -1;
        if (i10 != zs.U1) {
            boolean z11 = true;
            if (i10 == zs.V1) {
                String str9 = (String) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                hz hzVar2 = (hz) qzVar.y.get(str9);
                if (hzVar2 != null) {
                    qz qzVar2 = hzVar2.q;
                    if (str9.equals(hzVar2.a)) {
                        qzVar2.D.l(hzVar2.j);
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.code = 400;
                        tL_error.text = "IMPORT_UPLOAD_FAILED";
                        qzVar2.getNotificationCenter().k(zs.v1, Long.valueOf(hzVar2.j), new TLRPC.TL_messages_initHistoryImport(), tL_error);
                    } else {
                        hzVar2.c.remove(str9);
                    }
                }
                lz lzVar3 = (lz) qzVar.E.get(str9);
                if (lzVar3 != null && (jzVar = (jz) lzVar3.a.remove(str9)) != null) {
                    lzVar3.d.remove(jzVar);
                }
                ArrayList arrayList3 = (ArrayList) qzVar.a.get(str9);
                if (arrayList3 != null) {
                    int i21 = 0;
                    while (i21 < arrayList3.size()) {
                        cz czVar = (cz) arrayList3.get(i21);
                        if ((booleanValue && czVar.d != null) || (!booleanValue && czVar.c != null)) {
                            czVar.c();
                            arrayList3.remove(i21);
                            i21--;
                        }
                        i21++;
                    }
                    if (arrayList3.isEmpty()) {
                        qzVar.a.remove(str9);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 == zs.a2) {
                jj jjVar4 = (jj) objArr[0];
                if (jjVar4.f1() == 0) {
                    return;
                }
                ArrayList arrayList4 = (ArrayList) qzVar.a.get(jjVar4.k.attachPath);
                if (arrayList4 != null) {
                    int i22 = 0;
                    while (true) {
                        if (i22 >= arrayList4.size()) {
                            break;
                        }
                        cz czVar2 = (cz) arrayList4.get(i22);
                        if (czVar2.e == 4) {
                            int indexOf = czVar2.x.indexOf(jjVar4);
                            czVar2.g = (TLRPC.PhotoSize) czVar2.E.get(jjVar4.k.attachPath + "_t");
                            if (czVar2.E.containsKey(jjVar4.k.attachPath + "_ct")) {
                                czVar2.i = (TLRPC.PhotoSize) czVar2.E.get(jjVar4.k.attachPath + "_ct");
                            }
                            czVar2.p = z11;
                            qzVar.M(czVar2, indexOf);
                            arrayList4.remove(i22);
                        } else {
                            if (czVar2.m == jjVar4) {
                                czVar2.o = null;
                                qzVar.M(czVar2, -1);
                                arrayList4.remove(i22);
                                break;
                            }
                            i22++;
                            z11 = true;
                        }
                    }
                    if (arrayList4.isEmpty()) {
                        qzVar.a.remove(jjVar4.k.attachPath);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 == zs.b2) {
                jj jjVar5 = (jj) objArr[0];
                if (jjVar5.f1() == 0) {
                    return;
                }
                String str10 = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                qzVar.getFileLoader().n(str10, o5.C(jj.B0(jjVar5.k)), longValue, longValue2, (Float) objArr[4]);
                if (longValue2 == 0 || (arrayList = (ArrayList) qzVar.a.get(jjVar5.k.attachPath)) == null) {
                    return;
                }
                for (int i23 = 0; i23 < arrayList.size(); i23++) {
                    cz czVar3 = (cz) arrayList.get(i23);
                    if (czVar3.e == 4) {
                        int i24 = 0;
                        while (true) {
                            if (i24 >= czVar3.x.size()) {
                                break;
                            }
                            jj jjVar6 = (jj) czVar3.x.get(i24);
                            if (jjVar6 == jjVar5) {
                                czVar3.m.r0 = true;
                                jjVar6.k.params.remove("ve");
                                TLRPC.Document F0 = czVar3.m.F0();
                                if (F0 != null) {
                                    F0.size = longValue2;
                                }
                                ArrayList arrayList5 = new ArrayList();
                                arrayList5.add(jjVar6.k);
                                if (jj.d5(jjVar6.k)) {
                                    i15 = 9;
                                    i14 = 0;
                                } else if (jj.b4(jjVar6.k)) {
                                    i14 = jj.J1(jjVar6.k);
                                    i15 = 5;
                                } else if (jjVar6.p1) {
                                    i14 = 0;
                                    i15 = 1;
                                } else {
                                    i14 = 0;
                                    i15 = 0;
                                }
                                if ((!czVar3.I && !czVar3.J) || i24 == 0) {
                                    qzVar.getMessagesStorage().j1(arrayList5, false, true, false, 0, false, i15, i14);
                                }
                            } else {
                                i24++;
                            }
                        }
                    } else {
                        jj jjVar7 = czVar3.m;
                        if (jjVar7 == jjVar5) {
                            jjVar7.r0 = true;
                            jjVar7.k.params.remove("ve");
                            TLRPC.Document F02 = czVar3.m.F0();
                            if (F02 != null) {
                                F02.size = longValue2;
                            }
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.add(czVar3.m.k);
                            if (jj.d5(czVar3.m.k)) {
                                i13 = 9;
                                i12 = 0;
                            } else if (jj.b4(czVar3.m.k)) {
                                i12 = jj.J1(czVar3.m.k);
                                i13 = 5;
                            } else {
                                i12 = 0;
                                i13 = czVar3.m.p1 ? 1 : 0;
                            }
                            qzVar.getMessagesStorage().j1(arrayList6, false, true, false, 0, false, i13, i12);
                            return;
                        }
                    }
                }
                return;
            }
            if (i10 == zs.c2) {
                jj jjVar8 = (jj) objArr[0];
                if (jjVar8.f1() == 0) {
                    return;
                }
                String str11 = (String) objArr[1];
                ArrayList arrayList7 = (ArrayList) qzVar.a.get(str11);
                if (arrayList7 != null) {
                    int i25 = 0;
                    while (i25 < arrayList7.size()) {
                        cz czVar4 = (cz) arrayList7.get(i25);
                        if (czVar4.e == 4) {
                            for (int i26 = 0; i26 < czVar4.z.size(); i26++) {
                                if (czVar4.x.get(i26) == jjVar8) {
                                    czVar4.c();
                                    arrayList7.remove(i25);
                                    i25--;
                                    break;
                                }
                            }
                            i25++;
                        } else {
                            if (czVar4.m == jjVar8) {
                                czVar4.c();
                                arrayList7.remove(i25);
                                i25--;
                                break;
                            }
                            i25++;
                        }
                    }
                    if (arrayList7.isEmpty()) {
                        qzVar.a.remove(str11);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 != zs.R1) {
                if (i10 == zs.Y1) {
                    String str12 = (String) objArr[0];
                    ArrayList arrayList8 = (ArrayList) qzVar.a.get(str12);
                    if (arrayList8 != null) {
                        for (int i27 = 0; i27 < arrayList8.size(); i27++) {
                            qzVar.M((cz) arrayList8.get(i27), -1);
                        }
                        qzVar.a.remove(str12);
                        return;
                    }
                    return;
                }
                if (i10 == zs.S1 || i10 == zs.Z1) {
                    String str13 = (String) objArr[0];
                    ArrayList arrayList9 = (ArrayList) qzVar.a.get(str13);
                    if (arrayList9 != null) {
                        for (int i28 = 0; i28 < arrayList9.size(); i28++) {
                            ((cz) arrayList9.get(i28)).c();
                        }
                        qzVar.a.remove(str13);
                        return;
                    }
                    return;
                }
                return;
            }
            String str14 = (String) objArr[0];
            ArrayList arrayList10 = (ArrayList) qzVar.a.get(str14);
            if (arrayList10 != null) {
                int i29 = 0;
                while (i29 < arrayList10.size()) {
                    cz czVar5 = (cz) arrayList10.get(i29);
                    int i30 = czVar5.e;
                    if (i30 == 0) {
                        jjVar = czVar5.m;
                        c10 = 0;
                    } else {
                        if (i30 == 2) {
                            jjVar2 = czVar5.m;
                        } else if (i30 == 4) {
                            jjVar2 = (jj) czVar5.E.get(str14);
                            if (jjVar2.F0() == null) {
                                jjVar = jjVar2;
                                c10 = 0;
                            }
                        } else {
                            jjVar = null;
                            c10 = 65535;
                        }
                        jjVar = jjVar2;
                        c10 = 1;
                    }
                    if (c10 == 0) {
                        str = str14;
                        Utilities.e.c(new cn(this, new File(b8.z(4), Utilities.a(str14) + "." + hc.B(str14, "file")), jjVar, czVar5, str14, 17));
                    } else {
                        str = str14;
                        if (c10 == 1) {
                            qzVar = this;
                            Utilities.e.c(new ul(this, czVar5, new File(b8.z(4), Utilities.a(str) + ".gif"), jjVar, 23));
                            i29++;
                            str14 = str;
                        }
                    }
                    qzVar = this;
                    i29++;
                    str14 = str;
                }
                qzVar.a.remove(str14);
                return;
            }
            return;
        }
        String str15 = (String) objArr[0];
        TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
        TLRPC.InputEncryptedFile inputEncryptedFile2 = (TLRPC.InputEncryptedFile) objArr[2];
        hz hzVar3 = (hz) qzVar.y.get(str15);
        if (hzVar3 != null) {
            if (!str15.equals(hzVar3.a)) {
                c11 = 5;
                str2 = "_ct";
                hzVar3.b(str15, ((Long) objArr[5]).longValue(), 1.0f);
                TLRPC.TL_messages_uploadImportedMedia tL_messages_uploadImportedMedia = new TLRPC.TL_messages_uploadImportedMedia();
                tL_messages_uploadImportedMedia.peer = hzVar3.g;
                tL_messages_uploadImportedMedia.import_id = hzVar3.k;
                tL_messages_uploadImportedMedia.file_name = new File(str15).getName();
                MimeTypeMap singleton = MimeTypeMap.getSingleton();
                int lastIndexOf = tL_messages_uploadImportedMedia.file_name.lastIndexOf(46);
                String lowerCase = lastIndexOf != -1 ? tL_messages_uploadImportedMedia.file_name.substring(lastIndexOf + 1).toLowerCase() : "txt";
                String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(lowerCase);
                if (mimeTypeFromExtension == null) {
                    mimeTypeFromExtension = "opus".equals(lowerCase) ? "audio/opus" : "webp".equals(lowerCase) ? "image/webp" : "text/plain";
                }
                if (mimeTypeFromExtension.equals("image/jpg") || mimeTypeFromExtension.equals("image/jpeg")) {
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.file = inputFile2;
                    tL_messages_uploadImportedMedia.media = tL_inputMediaUploadedPhoto;
                } else {
                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                    tL_inputMediaUploadedDocument.file = inputFile2;
                    tL_inputMediaUploadedDocument.mime_type = mimeTypeFromExtension;
                    tL_messages_uploadImportedMedia.media = tL_inputMediaUploadedDocument;
                }
                hzVar3.q.getConnectionsManager().sendRequest(tL_messages_uploadImportedMedia, new fz(hzVar3, str15), 2);
                lzVar = (lz) qzVar.E.get(str15);
                if (lzVar != null) {
                    lzVar.a(str15, ((Long) objArr[c11]).longValue(), 1.0f);
                    jz jzVar2 = (jz) lzVar.a.get(str15);
                    if (jzVar2 != null) {
                        jzVar2.a(lzVar.o.currentAccount, inputFile2, new hr(19, lzVar, str15));
                    }
                }
                arrayList2 = (ArrayList) qzVar.a.get(str15);
                if (arrayList2 == null) {
                    int i31 = 0;
                    while (i31 < arrayList2.size()) {
                        cz czVar6 = (cz) arrayList2.get(i31);
                        TLObject tLObject2 = czVar6.c;
                        if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                            inputMedia = ((TLRPC.TL_messages_sendMedia) tLObject2).media;
                            if (inputMedia instanceof TLRPC.TL_inputMediaPaidMedia) {
                                HashMap hashMap3 = czVar6.E;
                                inputMedia = hashMap3 == null ? ((TLRPC.TL_inputMediaPaidMedia) inputMedia).extended_media.get(i19) : (TLRPC.InputMedia) hashMap3.get(str15);
                            } else if (inputMedia instanceof TLRPC.TL_inputMediaPoll) {
                                HashMap hashMap4 = czVar6.E;
                                inputMedia = hashMap4 == null ? ih.g.d((TLRPC.TL_inputMediaPoll) inputMedia) : (TLRPC.InputMedia) hashMap4.get(str15);
                            }
                        } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
                            inputMedia = ((TL_ephemeral.TL_sendMessage) tLObject2).media;
                            if (inputMedia instanceof TLRPC.TL_inputMediaPaidMedia) {
                                HashMap hashMap5 = czVar6.E;
                                inputMedia = hashMap5 == null ? ((TLRPC.TL_inputMediaPaidMedia) inputMedia).extended_media.get(i19) : (TLRPC.InputMedia) hashMap5.get(str15);
                            } else if (inputMedia instanceof TLRPC.TL_inputMediaPoll) {
                                HashMap hashMap6 = czVar6.E;
                                inputMedia = hashMap6 == null ? ih.g.d((TLRPC.TL_inputMediaPoll) inputMedia) : (TLRPC.InputMedia) hashMap6.get(str15);
                            }
                        } else {
                            inputMedia = tLObject2 instanceof TLRPC.TL_messages_editMessage ? ((TLRPC.TL_messages_editMessage) tLObject2).media : tLObject2 instanceof TLRPC.TL_messages_sendMultiMedia ? (TLRPC.InputMedia) czVar6.E.get(str15) : tLObject2 instanceof TLRPC.TL_messages_addPollAnswer ? ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer.input_media : null;
                        }
                        if (inputFile2 == null || inputMedia == null) {
                            inputFile = inputFile2;
                            str3 = str8;
                            i16 = i19;
                            str4 = str2;
                            str5 = str15;
                            TLRPC.InputEncryptedFile inputEncryptedFile3 = inputEncryptedFile2;
                            if (inputEncryptedFile3 == null || (tLObject = czVar6.d) == null) {
                                inputEncryptedFile = inputEncryptedFile3;
                            } else {
                                if (czVar6.e == 4) {
                                    TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) tLObject;
                                    TLRPC.InputEncryptedFile inputEncryptedFile4 = (TLRPC.InputEncryptedFile) czVar6.E.get(str5);
                                    int indexOf2 = tL_messages_sendEncryptedMultiMedia.files.indexOf(inputEncryptedFile4);
                                    if (indexOf2 >= 0) {
                                        tL_messages_sendEncryptedMultiMedia.files.set(indexOf2, inputEncryptedFile3);
                                        i17 = z10;
                                        if (inputEncryptedFile4.id == 1) {
                                            czVar6.g = (TLRPC.PhotoSize) czVar6.E.get(str5 + str3);
                                        }
                                        tL_decryptedMessage = tL_messages_sendEncryptedMultiMedia.messages.get(indexOf2);
                                    } else {
                                        i17 = z10;
                                        tL_decryptedMessage = null;
                                    }
                                } else {
                                    i17 = z10;
                                    tL_decryptedMessage = (TLRPC.TL_decryptedMessage) tLObject;
                                }
                                if (tL_decryptedMessage != null) {
                                    TLRPC.DecryptedMessageMedia decryptedMessageMedia = tL_decryptedMessage.media;
                                    if ((decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaVideo) || (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaPhoto) || (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaDocument)) {
                                        tL_decryptedMessage.media.size = ((Long) objArr[c11]).longValue();
                                    }
                                    TLRPC.DecryptedMessageMedia decryptedMessageMedia2 = tL_decryptedMessage.media;
                                    decryptedMessageMedia2.key = (byte[]) objArr[3];
                                    decryptedMessageMedia2.iv = (byte[]) objArr[4];
                                    if (czVar6.e == 4) {
                                        qzVar.A0(czVar6, null, inputEncryptedFile3, str5);
                                        inputEncryptedFile = inputEncryptedFile3;
                                    } else {
                                        ow secretChatHelper = qzVar.getSecretChatHelper();
                                        jj jjVar9 = czVar6.m;
                                        secretChatHelper.j(tL_decryptedMessage, jjVar9.k, czVar6.n, inputEncryptedFile3, czVar6.f, jjVar9);
                                        inputEncryptedFile = inputEncryptedFile3;
                                    }
                                } else {
                                    inputEncryptedFile = inputEncryptedFile3;
                                }
                                arrayList2.remove(i31);
                                i31--;
                                i31 += i17;
                                str8 = str3;
                                z10 = i17;
                                str2 = str4;
                                inputFile2 = inputFile;
                                str15 = str5;
                                i19 = i16;
                                inputEncryptedFile2 = inputEncryptedFile;
                                i20 = -1;
                            }
                        } else {
                            int i32 = czVar6.e;
                            if (i32 == 0) {
                                inputMedia.file = inputFile2;
                                i16 = i19;
                                str6 = str8;
                                inputFile = inputFile2;
                                inputEncryptedFile = inputEncryptedFile2;
                                str5 = str15;
                                qzVar.O(czVar6.c, czVar6.m, czVar6.f, czVar6, true, null, czVar6.K, null, czVar6.H);
                            } else {
                                inputFile = inputFile2;
                                str6 = str8;
                                int i33 = i20;
                                i16 = i19;
                                inputEncryptedFile = inputEncryptedFile2;
                                str5 = str15;
                                if (i32 != z10) {
                                    c12 = 4;
                                    if (i32 == 2) {
                                        if (inputMedia.file == null) {
                                            inputMedia.file = inputFile;
                                            if (inputMedia.thumb != null || (photoSize3 = czVar6.g) == null || photoSize3.location == null) {
                                                qzVar.N(czVar6.c, czVar6.m, czVar6.f, null, czVar6.K, null, czVar6.H);
                                                qzVar = this;
                                            } else {
                                                qzVar.M(czVar6, i33);
                                            }
                                        } else {
                                            inputMedia.thumb = inputFile;
                                            inputMedia.flags |= 4;
                                            qzVar = this;
                                            qzVar.N(czVar6.c, czVar6.m, czVar6.f, null, czVar6.K, null, czVar6.H);
                                        }
                                    } else if (i32 == 3) {
                                        inputMedia.file = inputFile;
                                        qzVar = this;
                                        qzVar.N(czVar6.c, czVar6.m, czVar6.f, null, czVar6.K, null, czVar6.H);
                                    } else {
                                        qzVar = this;
                                        if (i32 == 4) {
                                            if (!(inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument)) {
                                                str4 = str2;
                                                str3 = str6;
                                                if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                                                    HashMap hashMap7 = czVar6.E;
                                                    if (hashMap7 != null) {
                                                        if (hashMap7.containsKey(str5 + "_doc")) {
                                                            i18 = z10;
                                                            String str16 = i18 == 0 ? (String) czVar6.E.get(str5 + "_doc") : str5;
                                                            jj jjVar10 = (jj) czVar6.E.get(str16 + "_i");
                                                            hashMap = czVar6.E;
                                                            if (hashMap != null) {
                                                                if (hashMap.containsKey(str16 + str3)) {
                                                                    czVar6.g = (TLRPC.PhotoSize) czVar6.E.get(str16 + str3);
                                                                }
                                                            }
                                                            hashMap2 = czVar6.E;
                                                            if (hashMap2 != null) {
                                                                if (hashMap2.containsKey(str16 + str4)) {
                                                                    czVar6.i = (TLRPC.PhotoSize) czVar6.E.get(str16 + str4);
                                                                }
                                                            }
                                                            int indexOf3 = czVar6.x.indexOf(jjVar10);
                                                            if (i18 == 0 && czVar6.j == null && czVar6.i != null) {
                                                                czVar6.j = inputFile;
                                                                czVar6.q = z10;
                                                                qzVar.M(czVar6, indexOf3);
                                                            } else if (czVar6.g == null && inputMedia.thumb == null) {
                                                                inputMedia.thumb = inputFile;
                                                                inputMedia.flags |= 4;
                                                                qzVar.A0(czVar6, inputMedia, null, (String) czVar6.E.get(str5 + "_o"));
                                                            } else {
                                                                inputMedia.file = inputFile;
                                                                qzVar.A0(czVar6, inputMedia, null, str5);
                                                            }
                                                        }
                                                    }
                                                    i18 = i16;
                                                    if (i18 == 0) {
                                                    }
                                                    jj jjVar102 = (jj) czVar6.E.get(str16 + "_i");
                                                    hashMap = czVar6.E;
                                                    if (hashMap != null) {
                                                    }
                                                    hashMap2 = czVar6.E;
                                                    if (hashMap2 != null) {
                                                    }
                                                    int indexOf32 = czVar6.x.indexOf(jjVar102);
                                                    if (i18 == 0) {
                                                    }
                                                    if (czVar6.g == null) {
                                                    }
                                                    inputMedia.file = inputFile;
                                                    qzVar.A0(czVar6, inputMedia, null, str5);
                                                } else {
                                                    inputMedia.file = inputFile;
                                                    qzVar.A0(czVar6, inputMedia, null, str5);
                                                }
                                            } else if (inputMedia.file == null) {
                                                inputMedia.file = inputFile;
                                                int indexOf4 = czVar6.x.indexOf((jj) czVar6.E.get(str5 + "_i"));
                                                HashMap hashMap8 = czVar6.E;
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append(str5);
                                                str3 = str6;
                                                sb2.append(str3);
                                                if (hashMap8.containsKey(sb2.toString())) {
                                                    czVar6.g = (TLRPC.PhotoSize) czVar6.E.get(str5 + str3);
                                                }
                                                HashMap hashMap9 = czVar6.E;
                                                StringBuilder sb3 = new StringBuilder();
                                                sb3.append(str5);
                                                str4 = str2;
                                                sb3.append(str4);
                                                if (hashMap9.containsKey(sb3.toString())) {
                                                    czVar6.i = (TLRPC.PhotoSize) czVar6.E.get(str5 + str4);
                                                }
                                                if (inputMedia.video_cover == null && (photoSize2 = czVar6.i) != null && photoSize2.location != null) {
                                                    czVar6.q = z10;
                                                    qzVar.M(czVar6, indexOf4);
                                                } else if (inputMedia.thumb != null || (photoSize = czVar6.g) == null || photoSize.location == null) {
                                                    qzVar.A0(czVar6, inputMedia, null, str5);
                                                } else {
                                                    czVar6.p = z10;
                                                    qzVar.M(czVar6, indexOf4);
                                                }
                                            } else {
                                                str4 = str2;
                                                str3 = str6;
                                                String str17 = (String) czVar6.E.get(str5 + "_doc");
                                                jj jjVar11 = (jj) czVar6.E.get(str17 + "_i");
                                                if (czVar6.E.containsKey(str17 + str3)) {
                                                    czVar6.g = (TLRPC.PhotoSize) czVar6.E.get(str17 + str3);
                                                }
                                                if (czVar6.E.containsKey(str17 + str4)) {
                                                    czVar6.i = (TLRPC.PhotoSize) czVar6.E.get(str17 + str4);
                                                }
                                                int indexOf5 = czVar6.x.indexOf(jjVar11);
                                                if (czVar6.j != null || czVar6.i == null) {
                                                    inputMedia.thumb = inputFile;
                                                    inputMedia.flags |= 4;
                                                    qzVar.A0(czVar6, inputMedia, null, (String) czVar6.E.get(str5 + "_o"));
                                                } else {
                                                    czVar6.j = inputFile;
                                                    czVar6.q = z10;
                                                    qzVar.M(czVar6, indexOf5);
                                                }
                                            }
                                            arrayList2.remove(i31);
                                            i31--;
                                        }
                                    }
                                } else if (inputMedia.file == null && ((photoSize4 = czVar6.i) == null || czVar6.p)) {
                                    inputMedia.file = inputFile;
                                    if (czVar6.j == null && photoSize4 != null) {
                                        qzVar.M(czVar6, i33);
                                    } else if (inputMedia.thumb != null || (photoSize5 = czVar6.g) == null || photoSize5.location == null || !((jjVar3 = czVar6.m) == null || (x20Var = jjVar3.p0) == null || !x20Var.N)) {
                                        qzVar.N(czVar6.c, czVar6.m, czVar6.f, null, czVar6.K, null, czVar6.H);
                                    } else {
                                        qzVar.M(czVar6, i33);
                                    }
                                } else if (czVar6.j != null || czVar6.i == null) {
                                    inputMedia.thumb = inputFile;
                                    c12 = 4;
                                    inputMedia.flags |= 4;
                                    qzVar.N(czVar6.c, czVar6.m, czVar6.f, null, czVar6.K, null, czVar6.H);
                                } else {
                                    czVar6.j = inputFile;
                                    czVar6.q = z10;
                                    qzVar.M(czVar6, i33);
                                }
                                str4 = str2;
                                str3 = str6;
                                arrayList2.remove(i31);
                                i31--;
                            }
                            str4 = str2;
                            str3 = str6;
                            arrayList2.remove(i31);
                            i31--;
                        }
                        i17 = z10;
                        i31 += i17;
                        str8 = str3;
                        z10 = i17;
                        str2 = str4;
                        inputFile2 = inputFile;
                        str15 = str5;
                        i19 = i16;
                        inputEncryptedFile2 = inputEncryptedFile;
                        i20 = -1;
                    }
                    String str18 = str15;
                    if (arrayList2.isEmpty()) {
                        qzVar.a.remove(str18);
                        return;
                    }
                    return;
                }
                return;
            }
            TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport = new TLRPC.TL_messages_initHistoryImport();
            tL_messages_initHistoryImport.file = inputFile2;
            tL_messages_initHistoryImport.media_count = hzVar3.b.size();
            tL_messages_initHistoryImport.peer = hzVar3.g;
            hzVar3.q.getConnectionsManager().sendRequest(tL_messages_initHistoryImport, new ez(hzVar3, tL_messages_initHistoryImport), 2);
        }
        c11 = 5;
        str2 = "_ct";
        lzVar = (lz) qzVar.E.get(str15);
        if (lzVar != null) {
        }
        arrayList2 = (ArrayList) qzVar.a.get(str15);
        if (arrayList2 == null) {
        }
    }

    public final void e(TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, long j10) {
        if (j10 != 0) {
            TLRPC.InputPeer i12 = getMessagesController().i1(j10);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMultiMedia.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = i12;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMultiMedia.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = i12;
            tL_messages_sendMultiMedia.flags |= 1;
        }
    }

    public final void e0(String str, cz czVar) {
        HashMap hashMap = this.a;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
        }
        arrayList.add(czVar);
    }

    public final void f(ArrayList arrayList) {
        HashMap hashMap;
        int i10;
        int i11;
        int i12;
        long j10;
        jj jjVar;
        int i13;
        String G;
        TLRPC.Message message;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        boolean z10 = false;
        int i14 = 0;
        int i15 = 0;
        long j11 = 0;
        int i16 = 0;
        boolean z11 = false;
        while (true) {
            int size = arrayList.size();
            hashMap = this.a;
            if (i16 >= size) {
                break;
            }
            jj jjVar2 = (jj) arrayList.get(i16);
            int i17 = jjVar2.p1 ? 1 : i14;
            long B0 = jj.B0(jjVar2.k);
            arrayList4.add(Integer.valueOf(jjVar2.f1()));
            if (jj.b4(jjVar2.k)) {
                i15 = jj.J1(jjVar2.k);
            }
            TLRPC.Message i02 = i0(jjVar2.f1(), jjVar2.p1);
            if (i02 != null) {
                getConnectionsManager().cancelRequest(i02.reqId, true);
            }
            rh.e6 y3 = rh.e6.y(this.currentAccount, z10);
            rh.z5 z5Var = y3.N;
            ArrayList arrayList5 = arrayList4;
            if (z5Var == null || z5Var.b != jj.B0(jjVar2.k)) {
                i12 = i16;
                j10 = B0;
            } else {
                rh.z5 z5Var2 = y3.N;
                int f12 = jjVar2.f1();
                rh.y5 y5Var = z5Var2.p;
                org.telegram.ui.Components.qb qbVar = z5Var2.d;
                i12 = i16;
                HashSet hashSet = z5Var2.k;
                j10 = B0;
                if (!z5Var2.n && !z5Var2.o) {
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            jjVar = null;
                            break;
                        }
                        jjVar = (jj) it.next();
                        Iterator it2 = it;
                        if (jjVar.f1() == f12) {
                            hashSet.remove(jjVar);
                            break;
                        }
                        it = it2;
                    }
                    if (hashSet.isEmpty()) {
                        z5Var2.n = true;
                        z5Var2.c.b();
                        y3.N = null;
                    } else {
                        z5Var2.g--;
                        if (jjVar != null && (message = jjVar.k) != null) {
                            z5Var2.h -= message.paid_message_stars;
                        }
                        rh.d6 d6Var = z5Var2.f;
                        if (d6Var != null) {
                            d6Var.b = 3000L;
                            i0.r(y5Var);
                            i0.h3(y5Var, 3000L);
                        }
                        org.telegram.ui.Components.f6 f6Var = qbVar.b;
                        int i18 = z5Var2.g;
                        if (i18 == 1) {
                            G = cd.L0(2131747719, null);
                            i13 = 0;
                        } else {
                            i13 = 0;
                            G = cd.G(i18, "PaidMessageSentTitle", new Object[0]);
                        }
                        f6Var.setText(G);
                        qbVar.c.setText(i0.W2(cd.H(',', "PaidMessageSentSubtitle", Math.max(i13, (int) z5Var2.h))));
                        qbVar.a.d();
                    }
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                ArrayList arrayList6 = (ArrayList) entry.getValue();
                int i19 = 0;
                while (true) {
                    if (i19 < arrayList6.size()) {
                        cz czVar = (cz) arrayList6.get(i19);
                        if (czVar.e == 4) {
                            jj jjVar3 = null;
                            int i20 = 0;
                            while (true) {
                                if (i20 >= czVar.x.size()) {
                                    i20 = -1;
                                    break;
                                }
                                jjVar3 = (jj) czVar.x.get(i20);
                                if (jjVar3.f1() == jjVar2.f1()) {
                                    j0(jjVar2.f1(), jjVar2.p1);
                                    break;
                                }
                                i20++;
                            }
                            if (i20 >= 0) {
                                czVar.x.remove(i20);
                                czVar.z.remove(i20);
                                czVar.B.remove(i20);
                                if (!czVar.y.isEmpty()) {
                                    czVar.y.remove(i20);
                                }
                                TLObject tLObject = czVar.c;
                                if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                                    ((TLRPC.TL_messages_sendMultiMedia) tLObject).multi_media.remove(i20);
                                } else {
                                    boolean z12 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                                    if (z12) {
                                        TLRPC.InputMedia inputMedia = ((TLRPC.TL_messages_sendMedia) tLObject).media;
                                        if (inputMedia instanceof TLRPC.TL_inputMediaPaidMedia) {
                                            ((TLRPC.TL_inputMediaPaidMedia) inputMedia).extended_media.remove(i20);
                                        }
                                    }
                                    if (z12) {
                                        TLRPC.InputMedia inputMedia2 = ((TLRPC.TL_messages_sendMedia) tLObject).media;
                                        if (inputMedia2 instanceof TLRPC.TL_inputMediaPoll) {
                                            ih.g.i((TLRPC.TL_inputMediaPoll) inputMedia2, ((Integer) czVar.C.get(i20)).intValue());
                                        }
                                    }
                                    boolean z13 = tLObject instanceof TL_ephemeral.TL_sendMessage;
                                    if (z13) {
                                        TLRPC.InputMedia inputMedia3 = ((TL_ephemeral.TL_sendMessage) tLObject).media;
                                        if (inputMedia3 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                            ((TLRPC.TL_inputMediaPaidMedia) inputMedia3).extended_media.remove(i20);
                                        }
                                    }
                                    if (z13) {
                                        TLRPC.InputMedia inputMedia4 = ((TL_ephemeral.TL_sendMessage) tLObject).media;
                                        if (inputMedia4 instanceof TLRPC.TL_inputMediaPoll) {
                                            ih.g.i((TLRPC.TL_inputMediaPoll) inputMedia4, ((Integer) czVar.C.get(i20)).intValue());
                                        }
                                    }
                                    TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) czVar.d;
                                    tL_messages_sendEncryptedMultiMedia.messages.remove(i20);
                                    tL_messages_sendEncryptedMultiMedia.files.remove(i20);
                                }
                                MediaController.B().i(jjVar2);
                                String str = (String) czVar.E.get(jjVar3);
                                if (str != null) {
                                    arrayList2.add(str);
                                }
                                if (czVar.x.isEmpty()) {
                                    czVar.d();
                                } else {
                                    if (czVar.G == jjVar2.f1()) {
                                        jj jjVar4 = (jj) i0.a.g(1, czVar.x);
                                        czVar.G = jjVar4.f1();
                                        jjVar4.k.params.put("final", "1");
                                        TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                        tL_messages_messages.messages.add(jjVar4.k);
                                        getMessagesStorage().h1(-2, 0, i17, czVar.a, 0L, tL_messages_messages, false);
                                    }
                                    if (!arrayList3.contains(czVar)) {
                                        arrayList3.add(czVar);
                                    }
                                }
                            }
                        } else if (czVar.m.f1() == jjVar2.f1()) {
                            j0(jjVar2.f1(), jjVar2.p1);
                            arrayList6.remove(i19);
                            czVar.d();
                            MediaController.B().i(czVar.m);
                            if (arrayList6.size() == 0) {
                                arrayList2.add((String) entry.getKey());
                                if (czVar.d != null) {
                                    z11 = true;
                                }
                            }
                        } else {
                            i19++;
                        }
                    }
                }
            }
            i16 = i12 + 1;
            i14 = i17;
            arrayList4 = arrayList5;
            j11 = j10;
            z10 = false;
        }
        ArrayList arrayList7 = arrayList4;
        for (int i21 = 0; i21 < arrayList2.size(); i21++) {
            String str2 = (String) arrayList2.get(i21);
            if (str2.startsWith("http")) {
                hc.D().g(str2);
            } else {
                getFileLoader().b(str2, z11);
            }
            hashMap.remove(str2);
        }
        int size2 = arrayList3.size();
        for (int i22 = 0; i22 < size2; i22++) {
            t0((cz) arrayList3.get(i22), false);
        }
        if (arrayList.size() == 1 && ((jj) arrayList.get(0)).Y2() && ((jj) arrayList.get(0)).B1 != null) {
            l0((jj) arrayList.get(0));
            return;
        }
        if (arrayList.size() == 1 && ((jj) arrayList.get(0)).Y2() && ((jj) arrayList.get(0)).T3()) {
            return;
        }
        if (!arrayList.isEmpty() && jj.d5(((jj) arrayList.get(0)).k)) {
            i11 = 9;
        } else {
            if (arrayList.isEmpty() || !jj.b4(((jj) arrayList.get(0)).k)) {
                i10 = i14 != 0 ? 1 : 0;
                getMessagesController().Z(arrayList7, null, null, j11, i15, false, i10);
            }
            i11 = 5;
        }
        i10 = i11;
        getMessagesController().Z(arrayList7, null, null, j11, i15, false, i10);
    }

    public final void f0(TLRPC.Message message, boolean z10) {
        if (Thread.currentThread() != w0.d.getLooper().getThread()) {
            i0.g3(new ex(this, message, z10, 2));
        } else {
            g0(message, z10);
        }
    }

    public final void g(jj jjVar) {
        ArrayList j10 = m5.j(jjVar);
        if (jjVar != null && jjVar.D == 29) {
            Iterator it = this.a.entrySet().iterator();
            cz czVar = null;
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) ((Map.Entry) it.next()).getValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    cz czVar2 = (cz) arrayList.get(i10);
                    if (czVar2.e == 4) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= czVar2.x.size()) {
                                break;
                            }
                            if (((jj) czVar2.x.get(i11)).f1() == jjVar.f1()) {
                                czVar = czVar2;
                                break;
                            }
                            i11++;
                        }
                    }
                    if (czVar != null) {
                        break;
                    }
                }
            }
            if (czVar != null) {
                j10.clear();
                j10.addAll(czVar.x);
            }
        }
        f(j10);
    }

    public final void g0(TLRPC.Message message, boolean z10) {
        if (message == null) {
            return;
        }
        int i10 = message.id;
        if (i10 > 0) {
            this.d.put(i10, message);
            return;
        }
        SparseArray sparseArray = this.c;
        boolean z11 = sparseArray.indexOfKey(i10) >= 0;
        j0(message.id, z10);
        sparseArray.put(message.id, message);
        if (z10 || z11 || jj.c3(message)) {
            return;
        }
        long B0 = jj.B0(message);
        a0.h hVar = this.f;
        hVar.k(Integer.valueOf(((Integer) hVar.g(0, B0)).intValue() + 1), B0);
        getNotificationCenter().k(zs.n1, new Object[0]);
    }

    public final void h0(jj jjVar) {
        if (jjVar == null || jjVar.f1() > 0 || jjVar.p1) {
            return;
        }
        TLRPC.Message message = jjVar.k;
        int i10 = message.id;
        SparseArray sparseArray = this.e;
        boolean z10 = sparseArray.indexOfKey(i10) >= 0;
        sparseArray.put(message.id, message);
        if (z10 || jj.c3(message)) {
            return;
        }
        long B0 = jj.B0(message);
        a0.h hVar = this.h;
        hVar.k(Integer.valueOf(((Integer) hVar.g(0, B0)).intValue() + 1), B0);
        getNotificationCenter().k(zs.n1, new Object[0]);
    }

    public final TLRPC.Message i0(int i10, boolean z10) {
        if (i10 > 0) {
            SparseArray sparseArray = this.d;
            TLRPC.Message message = (TLRPC.Message) sparseArray.get(i10);
            if (message != null) {
                sparseArray.remove(i10);
            }
            return message;
        }
        SparseArray sparseArray2 = this.c;
        TLRPC.Message message2 = (TLRPC.Message) sparseArray2.get(i10);
        if (message2 != null) {
            sparseArray2.remove(i10);
            if (!z10) {
                long B0 = jj.B0(message2);
                a0.h hVar = this.f;
                Integer num = (Integer) hVar.f(B0);
                if (num != null) {
                    int intValue = num.intValue() - 1;
                    if (intValue <= 0) {
                        hVar.l(B0);
                    } else {
                        hVar.k(Integer.valueOf(intValue), B0);
                    }
                    getNotificationCenter().k(zs.n1, new Object[0]);
                }
            }
        }
        return message2;
    }

    public final void j0(int i10, boolean z10) {
        if (i10 > 0 || z10) {
            return;
        }
        SparseArray sparseArray = this.e;
        TLRPC.Message message = (TLRPC.Message) sparseArray.get(i10);
        if (message != null) {
            sparseArray.remove(i10);
            long B0 = jj.B0(message);
            a0.h hVar = this.h;
            Integer num = (Integer) hVar.f(B0);
            if (num != null) {
                int intValue = num.intValue() - 1;
                if (intValue <= 0) {
                    hVar.l(B0);
                } else {
                    hVar.k(Integer.valueOf(intValue), B0);
                }
                getNotificationCenter().k(zs.n1, new Object[0]);
            }
        }
    }

    public final void k(jj jjVar, TLRPC.Updates updates, boolean z10) {
        int i10;
        if (jjVar == null) {
            return;
        }
        long B0 = jj.B0(jjVar.k);
        long j10 = jjVar.k.random_id;
        int i11 = 0;
        TLRPC.Message message = null;
        if (updates != null) {
            ArrayList<TLRPC.Update> arrayList = updates.updates;
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    i10 = 0;
                    break;
                }
                TLRPC.Update update = arrayList.get(i12);
                i12++;
                TLRPC.Update update2 = update;
                if (update2 instanceof TL_update.TL_updateMessageID) {
                    TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update2;
                    if (tL_updateMessageID.random_id == j10) {
                        i10 = tL_updateMessageID.id;
                        break;
                    }
                }
            }
            for (int i13 = 0; i13 < updates.updates.size(); i13++) {
                TLRPC.Update update3 = updates.updates.get(i13);
                if (update3 instanceof TL_update.TL_updateNewMessage) {
                    TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update3;
                    TLRPC.Message message2 = tL_updateNewMessage.message;
                    if ((message2.action instanceof TLRPC.TL_messageActionGramTransfer) && message2.out && o5.o(message2.peer_id) == B0 && (i10 == 0 || message2.id == i10)) {
                        updates.updates.remove(i13);
                        Utilities.d.c(new ry(this, tL_updateNewMessage, i11));
                        message = message2;
                        break;
                    }
                }
            }
            if (message != null) {
                for (int size2 = updates.updates.size() - 1; size2 >= 0; size2--) {
                    TLRPC.Update update4 = updates.updates.get(size2);
                    if ((update4 instanceof TL_update.TL_updateMessageID) && ((TL_update.TL_updateMessageID) update4).random_id == j10) {
                        updates.updates.remove(size2);
                    }
                }
            }
        } else {
            i10 = 0;
        }
        TLRPC.Message message3 = message;
        int i14 = jjVar.k.local_id;
        if (i14 >= 0) {
            i14 = jjVar.f1();
        }
        int i15 = i14;
        if (message3 != null) {
            message3.dialog_id = B0;
            message3.local_id = 0;
            message3.send_state = 0;
            Integer num = (Integer) getMessagesController().P.get(Long.valueOf(B0));
            if (num == null) {
                num = Integer.valueOf(getMessagesStorage().U(B0, true));
                getMessagesController().P.put(Long.valueOf(B0), num);
            }
            message3.unread = num.intValue() < message3.id;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(message3);
            getMessagesStorage().a.c(new zm(this, j10, B0, i15, message3, arrayList2, jjVar));
            return;
        }
        if (jjVar.f1() > 0) {
            d0(i15);
            i0(i15, false);
            return;
        }
        if (z10 || i10 != 0) {
            hs messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new mq(messagesStorage, j10, B0, Integer.valueOf(i15), i15, jjVar.k.date));
            jjVar.k.send_state = 0;
            jjVar.K1 = true;
            getNotificationCenter().k(zs.J, Integer.valueOf(i15));
        } else {
            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
            tL_messageService.id = i15;
            tL_messageService.dialog_id = B0;
            getMessagesStorage().N0(0, tL_messageService);
            jjVar.k.send_state = 2;
            jjVar.K1 = true;
            getNotificationCenter().k(zs.M, Integer.valueOf(i15));
        }
        d0(i15);
        i0(i15, false);
    }

    public final boolean k0(long j10, jj jjVar, boolean z10) {
        if (jjVar.f1() < 0) {
            TLRPC.Message message = jjVar.k;
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionGramTransfer)) {
                boolean z11 = messageAction instanceof TLRPC.TL_messageEncryptedAction;
                int i10 = zs.s;
                if (z11) {
                    TLRPC.EncryptedChat Z0 = getMessagesController().Z0(Integer.valueOf((int) (jj.B0(message) & 4294967295L)));
                    if (Z0 == null) {
                        getMessagesStorage().N0(jjVar.p1 ? 1 : 0, jjVar.k);
                        jjVar.k.send_state = 2;
                        getNotificationCenter().k(zs.M, Integer.valueOf(jjVar.f1()));
                        d0(jjVar.f1());
                        return false;
                    }
                    TLRPC.Message message2 = jjVar.k;
                    if (message2.random_id == 0) {
                        message2.random_id = E();
                    }
                    TLRPC.DecryptedMessageAction decryptedMessageAction = jjVar.k.action.encryptedAction;
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) {
                        getSecretChatHelper().z(Z0, jjVar.k);
                        return true;
                    }
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionDeleteMessages) {
                        getSecretChatHelper().t(Z0, null, jjVar.k);
                        return true;
                    }
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionFlushHistory) {
                        getSecretChatHelper().r(Z0, jjVar.k);
                        return true;
                    }
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNotifyLayer) {
                        getSecretChatHelper().w(Z0, jjVar.k);
                        return true;
                    }
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionReadMessages) {
                        getSecretChatHelper().u(Z0, null, jjVar.k);
                        return true;
                    }
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) {
                        ow secretChatHelper = getSecretChatHelper();
                        TLRPC.Message message3 = jjVar.k;
                        secretChatHelper.getClass();
                        if (Z0 instanceof TLRPC.TL_encryptedChat) {
                            TLRPC.DecryptedMessage tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
                            if (message3 != null) {
                                tL_decryptedMessageService.action = message3.action.encryptedAction;
                            } else {
                                TLRPC.DecryptedMessageAction tL_decryptedMessageActionScreenshotMessages = new TLRPC.TL_decryptedMessageActionScreenshotMessages();
                                tL_decryptedMessageService.action = tL_decryptedMessageActionScreenshotMessages;
                                tL_decryptedMessageActionScreenshotMessages.random_ids = null;
                                message3 = secretChatHelper.d(Z0, tL_decryptedMessageActionScreenshotMessages);
                                jj jjVar2 = new jj(secretChatHelper.currentAccount, message3, false, false);
                                jjVar2.k.send_state = 1;
                                jjVar2.V1 = true;
                                secretChatHelper.getMessagesController().i5(0, message3.dialog_id, m5.j(jjVar2));
                                secretChatHelper.getNotificationCenter().k(i10, new Object[0]);
                            }
                            TLRPC.Message message4 = message3;
                            tL_decryptedMessageService.random_id = message4.random_id;
                            secretChatHelper.j(tL_decryptedMessageService, message4, Z0, null, null, null);
                            return true;
                        }
                    } else if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionTyping)) {
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionResend) {
                            getSecretChatHelper().y(Z0, 0, 0, jjVar.k);
                            return true;
                        }
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionCommitKey) {
                            getSecretChatHelper().s(Z0, jjVar.k);
                            return true;
                        }
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAbortKey) {
                            getSecretChatHelper().p(Z0, jjVar.k, 0L);
                            return true;
                        }
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionRequestKey) {
                            getSecretChatHelper().x(Z0, jjVar.k);
                            return true;
                        }
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAcceptKey) {
                            getSecretChatHelper().q(Z0, jjVar.k);
                            return true;
                        }
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNoop) {
                            getSecretChatHelper().v(Z0, jjVar.k);
                        }
                    }
                    return true;
                }
                if (messageAction instanceof TLRPC.TL_messageActionScreenshotTaken) {
                    TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(jj.B0(jjVar.k)));
                    int O1 = jjVar.O1();
                    TLRPC.Message message5 = jjVar.k;
                    if (Z1 != null && O1 != 0 && Z1.id != getUserConfig().e()) {
                        TLRPC.TL_messages_sendScreenshotNotification tL_messages_sendScreenshotNotification = new TLRPC.TL_messages_sendScreenshotNotification();
                        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                        tL_messages_sendScreenshotNotification.peer = tL_inputPeerUser;
                        tL_inputPeerUser.access_hash = Z1.access_hash;
                        tL_inputPeerUser.user_id = Z1.id;
                        if (message5 != null) {
                            TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                            tL_inputReplyToMessage.reply_to_msg_id = O1;
                            tL_messages_sendScreenshotNotification.reply_to = tL_inputReplyToMessage;
                            tL_messages_sendScreenshotNotification.random_id = message5.random_id;
                        } else {
                            message5 = new TLRPC.TL_messageService();
                            message5.random_id = E();
                            message5.dialog_id = Z1.id;
                            message5.unread = true;
                            message5.out = true;
                            int j11 = getUserConfig().j();
                            message5.id = j11;
                            message5.local_id = j11;
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            message5.from_id = tL_peerUser;
                            tL_peerUser.user_id = getUserConfig().e();
                            message5.flags |= zs.n4;
                            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                            message5.reply_to = tL_messageReplyHeader;
                            tL_messageReplyHeader.flags |= 16;
                            tL_messageReplyHeader.reply_to_msg_id = O1;
                            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                            message5.peer_id = tL_peerUser2;
                            tL_peerUser2.user_id = Z1.id;
                            message5.date = getConnectionsManager().getCurrentTime();
                            message5.action = new TLRPC.TL_messageActionScreenshotTaken();
                            getUserConfig().v(false);
                        }
                        tL_messages_sendScreenshotNotification.random_id = message5.random_id;
                        jj jjVar3 = new jj(this.currentAccount, message5, false, true);
                        jjVar3.k.send_state = 1;
                        jjVar3.V1 = true;
                        getMessagesController().i5(0, message5.dialog_id, m5.j(jjVar3));
                        getNotificationCenter().k(i10, new Object[0]);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(message5);
                        getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
                        N(tL_messages_sendScreenshotNotification, jjVar3, null, null, null, null, false);
                    }
                }
                if (z10) {
                    this.b.put(jjVar.f1(), jjVar);
                }
                long B0 = jj.B0(jjVar.k);
                TLRPC.Message message6 = jjVar.k;
                oz c10 = oz.c(null, null, null, null, null, null, null, null, null, null, B0, message6.attachPath, null, null, null, true, jjVar, null, message6.reply_markup, message6.params, !message6.silent, jjVar.p1 ? message6.date : 0, 0, 0, null, null, false, false);
                TLRPC.Message message7 = jjVar.k;
                if (message7 != null) {
                    TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message7.quick_reply_shortcut;
                    if (inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcut) {
                        c10.M = ((TLRPC.TL_inputQuickReplyShortcut) inputQuickReplyShortcut).shortcut;
                    }
                    c10.N = jj.J1(message7);
                    c10.Q = jjVar.k.paid_message_stars;
                }
                TLRPC.Message message8 = jjVar.k;
                c10.X = message8 != null ? message8.ephemeralReceiverBotId : 0L;
                c10.Q = j10;
                r0(c10);
                return true;
            }
            if (z10) {
                k(jjVar, null, false);
            }
        } else if (jjVar.Y2()) {
            t(jjVar, null, null, null, null, null, null, null, true, jjVar.t2(), jjVar);
            return false;
        }
        return false;
    }

    public final void l0(jj jjVar) {
        jjVar.o1 = true;
        TLRPC.Message message = jjVar.k;
        message.media = jjVar.B1;
        message.message = jjVar.A1;
        ArrayList<TLRPC.MessageEntity> arrayList = jjVar.D1;
        message.entities = arrayList;
        message.attachPath = jjVar.E1;
        message.send_state = 0;
        if (arrayList != null) {
            message.flags |= 128;
        } else {
            message.flags &= -129;
        }
        jjVar.B1 = null;
        jjVar.A1 = null;
        jjVar.D1 = null;
        jjVar.E1 = null;
        jjVar.p0 = null;
        jjVar.D = -1;
        jjVar.K5();
        jjVar.z = null;
        if (jjVar.D != 0) {
            jjVar.k0();
        } else {
            jjVar.Q1 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(jjVar.k);
        getMessagesStorage().j1(arrayList2, false, true, false, 0, false, jjVar.p1 ? 1 : 0, 0L);
        getNotificationCenter().k(zs.m0, Long.valueOf(jj.B0(jjVar.k)), m5.j(jjVar));
    }

    public final void n0(boolean z10, jj jjVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, org.telegram.ui.un unVar) {
        boolean z11;
        int i10;
        if (jjVar == null || keyboardButtonProto == null || unVar == null) {
            return;
        }
        if (sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
            i10 = 3;
            z11 = false;
        } else if (sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
            z11 = false;
            i10 = 1;
        } else if (sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
            z11 = z10;
            i10 = 2;
        } else {
            z11 = z10;
            i10 = 0;
        }
        String str = jj.B0(jjVar.k) + "_" + jjVar.f1() + "_" + Utilities.f(keyboardButtonProto.getData()) + "_" + i10;
        this.r.put(str, Boolean.TRUE);
        String str2 = jj.B0(jjVar.k) + "_" + jjVar.f1();
        HashMap hashMap = this.s;
        List list = (List) hashMap.get(str2);
        if (list == null) {
            String str3 = jj.B0(jjVar.k) + "_" + jjVar.f1();
            ArrayList arrayList = new ArrayList();
            hashMap.put(str3, arrayList);
            list = arrayList;
        }
        list.add(str);
        TLObject[] tLObjectArr = new TLObject[1];
        zx zxVar = new zx(this, str, list, z11, jjVar, keyboardButtonProto, unVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10);
        if (z11) {
            getMessagesStorage().M(str, zxVar);
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrlAuth tL_inlineButtonTypeUrlAuth = (TL_keyboard.TL_inlineButtonTypeUrlAuth) sf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class);
        if (tL_inlineButtonTypeUrlAuth != null) {
            TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
            tL_messages_requestUrlAuth.peer = getMessagesController().i1(jj.B0(jjVar.k));
            tL_messages_requestUrlAuth.msg_id = jjVar.f1();
            tL_messages_requestUrlAuth.button_id = tL_inlineButtonTypeUrlAuth.button_id;
            tL_messages_requestUrlAuth.flags |= 2;
            tLObjectArr[0] = tL_messages_requestUrlAuth;
            getConnectionsManager().sendRequest(tL_messages_requestUrlAuth, zxVar, 2);
            return;
        }
        if (sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
            if ((jjVar.k.media.flags & 4) != 0) {
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = jjVar.k.media.receipt_msg_id;
                tL_payments_getPaymentReceipt.peer = getMessagesController().l1(jjVar.k.peer_id);
                tLObjectArr[0] = tL_payments_getPaymentReceipt;
                getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, zxVar, 2);
                return;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.msg_id = jjVar.f1();
            tL_inputInvoiceMessage.peer = getMessagesController().l1(jjVar.k.peer_id);
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
            JSONObject u10 = xh.m2.u(null, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tLObjectArr[0] = tL_payments_getPaymentForm;
            getConnectionsManager().sendRequest(tL_payments_getPaymentForm, zxVar, 2);
            return;
        }
        if (jj.c3(jjVar.k)) {
            TL_ephemeral.TL_getCallbackAnswer tL_getCallbackAnswer = new TL_ephemeral.TL_getCallbackAnswer();
            tL_getCallbackAnswer.peer = getMessagesController().i1(jj.B0(jjVar.k));
            tL_getCallbackAnswer.id = jjVar.P0();
            tL_getCallbackAnswer.data = keyboardButtonProto.getData();
            getConnectionsManager().sendRequest(tL_getCallbackAnswer, zxVar, 2);
            return;
        }
        TLRPC.TL_messages_getBotCallbackAnswer tL_messages_getBotCallbackAnswer = new TLRPC.TL_messages_getBotCallbackAnswer();
        tL_messages_getBotCallbackAnswer.peer = getMessagesController().i1(jj.B0(jjVar.k));
        tL_messages_getBotCallbackAnswer.msg_id = jjVar.f1();
        tL_messages_getBotCallbackAnswer.game = sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class);
        TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) sf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class);
        if (tL_inlineButtonTypeCallback != null && tL_inlineButtonTypeCallback.requires_password) {
            tL_messages_getBotCallbackAnswer.password = inputCheckPasswordSRP != null ? inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
            tL_messages_getBotCallbackAnswer.flags |= 4;
        }
        if (keyboardButtonProto.getData() != null) {
            tL_messages_getBotCallbackAnswer.flags |= 1;
            tL_messages_getBotCallbackAnswer.data = keyboardButtonProto.getData();
        }
        getConnectionsManager().sendRequest(tL_messages_getBotCallbackAnswer, zxVar, 2);
    }

    public final TLRPC.TL_inputReplyToMessage o(TLRPC.TL_messageReplyHeader tL_messageReplyHeader) {
        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
        tL_inputReplyToMessage.reply_to_msg_id = tL_messageReplyHeader.reply_to_msg_id;
        int i10 = tL_messageReplyHeader.flags;
        if ((i10 & 2) != 0) {
            tL_inputReplyToMessage.flags |= 1;
            tL_inputReplyToMessage.top_msg_id = tL_messageReplyHeader.reply_to_top_id;
        }
        if ((i10 & 1) != 0) {
            tL_inputReplyToMessage.flags |= 2;
            tL_inputReplyToMessage.reply_to_peer_id = vp.r1(this.currentAccount).l1(tL_messageReplyHeader.reply_to_peer_id);
        }
        if (tL_messageReplyHeader.quote) {
            ArrayList<TL_iv.RichText> arrayList = tL_messageReplyHeader.quote_rich;
            if (arrayList != null) {
                tL_inputReplyToMessage.quote_rich = arrayList;
            } else if ((tL_messageReplyHeader.flags & 64) != 0) {
                tL_inputReplyToMessage.flags |= 4;
                tL_inputReplyToMessage.quote_text = tL_messageReplyHeader.quote_text;
            }
            if (arrayList == null && (tL_messageReplyHeader.flags & 128) != 0) {
                tL_inputReplyToMessage.flags |= 8;
                tL_inputReplyToMessage.quote_entities = tL_messageReplyHeader.quote_entities;
            }
            if ((tL_messageReplyHeader.flags & 1024) != 0) {
                tL_inputReplyToMessage.flags |= 16;
                tL_inputReplyToMessage.quote_offset = tL_messageReplyHeader.quote_offset;
            }
        }
        if ((tL_messageReplyHeader.flags & 2048) != 0) {
            tL_inputReplyToMessage.flags |= 64;
            tL_inputReplyToMessage.todo_item_id = tL_messageReplyHeader.todo_item_id;
        }
        byte[] bArr = tL_messageReplyHeader.poll_option;
        if (bArr != null) {
            tL_inputReplyToMessage.poll_option = bArr;
        }
        return tL_inputReplyToMessage;
    }

    public final void o0(jj jjVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        if (jjVar == null || keyboardButtonProto == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jj.B0(jjVar.k));
        sb2.append("_");
        sb2.append(jjVar.f1());
        sb2.append("_");
        sb2.append(Utilities.f(keyboardButtonProto.getData()));
        sb2.append("_");
        sb2.append(sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) ? "1" : "0");
        this.n.put(sb2.toString(), jjVar);
        this.G.B();
    }

    public final TLRPC.TL_inputReplyToStory p(TL_stories.StoryItem storyItem) {
        TLRPC.TL_inputReplyToStory tL_inputReplyToStory = new TLRPC.TL_inputReplyToStory();
        tL_inputReplyToStory.story_id = storyItem.id;
        tL_inputReplyToStory.peer = getMessagesController().i1(storyItem.dialogId);
        return tL_inputReplyToStory;
    }

    public final void p0(TLRPC.InputPeer inputPeer, TLRPC.TL_inputMediaGame tL_inputMediaGame, long j10, long j11) {
        NativeByteBuffer nativeByteBuffer;
        if (inputPeer == null || tL_inputMediaGame == null) {
            return;
        }
        TLRPC.TL_messages_sendMedia tL_messages_sendMedia = new TLRPC.TL_messages_sendMedia();
        tL_messages_sendMedia.peer = inputPeer;
        if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
            tL_messages_sendMedia.silent = vp.r1(this.currentAccount).e7.getBoolean("silent_" + (-inputPeer.channel_id), false);
        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
            tL_messages_sendMedia.silent = vp.r1(this.currentAccount).e7.getBoolean("silent_" + (-inputPeer.chat_id), false);
        } else {
            tL_messages_sendMedia.silent = vp.r1(this.currentAccount).e7.getBoolean("silent_" + inputPeer.user_id, false);
        }
        tL_messages_sendMedia.random_id = j10 != 0 ? j10 : E();
        tL_messages_sendMedia.message = "";
        tL_messages_sendMedia.media = tL_inputMediaGame;
        long M = w3.M(getMessagesController().L0(Long.valueOf(inputPeer.chat_id)), getMessagesController().M0(inputPeer.chat_id), false);
        if (M != d20.i(this.currentAccount).e()) {
            tL_messages_sendMedia.send_as = getMessagesController().i1(M);
        }
        long M1 = getMessagesController().M1(o5.n(inputPeer));
        if (M1 <= 0) {
            M1 = o5.k(getMessagesController().H2(o5.n(inputPeer)));
        }
        if (M1 > 0) {
            tL_messages_sendMedia.flags |= TLObject.FLAG_21;
            tL_messages_sendMedia.allow_paid_stars = M1;
        }
        if (j11 == 0) {
            NativeByteBuffer nativeByteBuffer2 = null;
            try {
                nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + tL_inputMediaGame.getObjectSize() + 12);
            } catch (Exception e) {
                e = e;
            }
            try {
                nativeByteBuffer.writeInt32(3);
                nativeByteBuffer.writeInt64(j10);
                inputPeer.serializeToStream(nativeByteBuffer);
                tL_inputMediaGame.serializeToStream(nativeByteBuffer);
            } catch (Exception e7) {
                e = e7;
                nativeByteBuffer2 = nativeByteBuffer;
                f8.g(e, true);
                nativeByteBuffer = nativeByteBuffer2;
                j11 = getMessagesStorage().z(nativeByteBuffer);
                getConnectionsManager().sendRequest(tL_messages_sendMedia, new s4(this, j11, 4));
            }
            j11 = getMessagesStorage().z(nativeByteBuffer);
        }
        getConnectionsManager().sendRequest(tL_messages_sendMedia, new s4(this, j11, 4));
    }

    public final jj q(TLRPC.User user, String str, long j10, String str2, boolean z10, boolean z11, long j11) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        int j12 = getUserConfig().j();
        tL_messageService.id = j12;
        tL_messageService.local_id = j12;
        tL_messageService.random_id = j11;
        tL_messageService.dialog_id = user.id;
        tL_messageService.out = true;
        tL_messageService.unread = true;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().e();
        tL_messageService.flags |= 256;
        TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
        tL_messageService.peer_id = tL_peerUser2;
        tL_peerUser2.user_id = user.id;
        tL_messageService.date = getConnectionsManager().getCurrentTime();
        tL_messageService.send_state = 1;
        TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = new TLRPC.TL_messageActionGramTransfer();
        tL_messageActionGramTransfer.amount = j10;
        tL_messageActionGramTransfer.peer_address = str;
        tL_messageActionGramTransfer.transaction_id = "";
        tL_messageActionGramTransfer.comment = str2;
        tL_messageActionGramTransfer.comment_encrypted = z10;
        tL_messageActionGramTransfer.comment_encrypted_preparing = z11;
        tL_messageService.action = tL_messageActionGramTransfer;
        getUserConfig().v(false);
        jj jjVar = new jj(this.currentAccount, tL_messageService, false, true);
        jjVar.V1 = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_messageService);
        getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
        getMessagesController().i5(0, user.id, m5.j(jjVar));
        getNotificationCenter().k(zs.s, new Object[0]);
        f0(tL_messageService, false);
        return jjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:253:0x08a4, code lost:
    
        if (r12.contains(java.lang.Integer.valueOf(r1.reply_to_msg_id)) != false) goto L376;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x077e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0825 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x087a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x08cc  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0953  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0989 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x09c2  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0a13  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0a29  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0a4c  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0a64  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0a74  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0a94  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0ada  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0af4  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0b00  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0b1a  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0b3e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0b81  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0b8c  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0b41  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0b16  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0abe  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0a8a  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0a2b  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0a16  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0a06  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0955  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x08e1  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0843 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int q0(final ArrayList arrayList, long j10, final boolean z10, final boolean z11, final boolean z12, final int i10, final int i11, final jj jjVar, final int i12, long j11, final long j12, final oj ojVar) {
        TLRPC.UserFull a2;
        TLRPC.Chat L0;
        long j13;
        boolean z13;
        boolean z14;
        long j14;
        String str;
        boolean s10;
        boolean v;
        boolean o10;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        String str2;
        long j15;
        boolean z21;
        boolean z22;
        ArrayList<Integer> arrayList2;
        long j16;
        long j17;
        TLRPC.Peer peer;
        String str3;
        a0.h hVar;
        TLRPC.InputPeer inputPeer;
        boolean z23;
        ArrayList arrayList3;
        TLRPC.Chat chat;
        ArrayList<Long> arrayList4;
        ArrayList arrayList5;
        a0.h hVar2;
        int i13;
        int i14;
        int i15;
        TLRPC.TL_message tL_message;
        ArrayList<Long> arrayList6;
        a0.h hVar3;
        int i16;
        ArrayList<Integer> arrayList7;
        TLRPC.User Z1;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer2;
        TLRPC.MessageMedia messageMedia;
        long j18;
        TL_iv.RichMessage richMessage;
        TLRPC.ReplyMarkup replyMarkup;
        long j19;
        long j20;
        long M;
        a0.h hVar4;
        ArrayList<Integer> arrayList8;
        boolean z24;
        boolean z25;
        a0.h hVar5;
        TLRPC.Message message;
        int i17;
        int i18;
        ArrayList arrayList9;
        ArrayList arrayList10;
        TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages;
        ArrayList arrayList11;
        ul ulVar;
        qz qzVar;
        TLRPC.Message message2;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.Peer peer3;
        TLRPC.MessageReplyHeader messageReplyHeader2;
        int i19;
        int i20;
        TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        long o11;
        int i21;
        int i22;
        final qz qzVar2 = this;
        final long j21 = j10;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }
        long e = qzVar2.getUserConfig().e();
        if (o5.C(j21)) {
            long j22 = j12;
            oj ojVar2 = ojVar;
            long j23 = qzVar2.getMessagesController().Z0(Integer.valueOf((int) j21)).user_id;
            boolean z26 = (!o5.E(j23) || qzVar2.getMessagesController().Z1(Long.valueOf(j23)) == null || (a2 = qzVar2.getMessagesController().a2(j23)) == null) ? true : !a2.voice_messages_forbidden;
            int i23 = 0;
            for (int i24 = 0; i24 < arrayList.size(); i24++) {
                jj jjVar2 = (jj) arrayList.get(i24);
                if (z26 || !jj.R4(jjVar2.k)) {
                    if (!z26 && jj.j4(jjVar2.k) && i23 == 0) {
                        i23 = 8;
                    }
                } else if (i23 == 0) {
                    i23 = 7;
                }
            }
            if (i23 == 0) {
                int i25 = 0;
                while (i25 < arrayList.size()) {
                    qzVar2.c0((jj) arrayList.get(i25), j21, j11, j22, ojVar2);
                    i25++;
                    qzVar2 = this;
                    j21 = j10;
                    j22 = j12;
                    ojVar2 = ojVar;
                }
            }
            return i23;
        }
        TLRPC.Peer y12 = qzVar2.getMessagesController().y1(j21);
        long M1 = qzVar2.getMessagesController().M1(j21);
        if (M1 <= 0) {
            M1 = o5.k(qzVar2.getMessagesController().H2(j21));
        }
        if (M1 != j11) {
            org.telegram.ui.Components.s4.Z(qzVar2.currentAccount, Math.max(1, arrayList.size()), j21, new q20() { // from class: org.telegram.messenger.dy
                @Override // org.telegram.messenger.q20
                public final void a(Object obj) {
                    qz qzVar3 = qz.this;
                    qzVar3.getClass();
                    qzVar3.q0(arrayList, j21, z10, z11, z12, i10, i11, jjVar, i12, ((Long) obj).longValue(), j12, ojVar);
                }
            });
            return 0;
        }
        ArrayList arrayList12 = arrayList;
        int i26 = 0;
        int i27 = 1;
        if (!o5.E(j21)) {
            L0 = getMessagesController().L0(Long.valueOf(-j21));
            if (w3.T(L0)) {
                boolean z27 = L0.signatures;
                boolean z28 = L0.megagroup;
                z13 = !z28;
                if (z28 || !L0.has_link) {
                    z14 = z27;
                } else {
                    z14 = z27;
                    TLRPC.ChatFull M0 = getMessagesController().M0(L0.id);
                    if (M0 != null) {
                        j13 = M0.linked_chat_id;
                    }
                }
                j13 = 0;
            } else {
                j13 = 0;
                z13 = false;
                z14 = false;
            }
            if (L0 != null) {
                j14 = j13;
                str = getMessagesController().C0(L0.id, e);
            } else {
                j14 = j13;
                str = null;
            }
            boolean t10 = w3.t(L0);
            boolean p5 = w3.p(L0);
            boolean u10 = w3.u(L0);
            boolean l4 = w3.l(L0);
            boolean m10 = w3.m(L0);
            boolean r10 = w3.r(L0);
            s10 = w3.s(L0);
            v = w3.v(L0);
            o10 = w3.o(L0);
            z15 = r10;
            z16 = m10;
            z17 = l4;
            z18 = u10;
            z19 = z14;
            z20 = t10;
            str2 = str;
            j15 = j14;
            z21 = p5;
            z22 = z13;
        } else {
            if (getMessagesController().Z1(Long.valueOf(j21)) == null) {
                return 0;
            }
            boolean z29 = getMessagesController().a2(j21) != null ? !r6.voice_messages_forbidden : true;
            v = z29;
            s10 = z29;
            j15 = 0;
            z22 = false;
            z19 = false;
            z20 = true;
            z21 = true;
            z18 = true;
            z17 = true;
            z16 = true;
            z15 = true;
            o10 = true;
            L0 = null;
            str2 = null;
        }
        a0.h hVar6 = new a0.h();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList<Long> arrayList15 = new ArrayList<>();
        ArrayList<Integer> arrayList16 = new ArrayList<>();
        a0.h hVar7 = new a0.h();
        TLRPC.InputPeer i110 = getMessagesController().i1(j21);
        boolean z30 = j21 == e;
        int i28 = 0;
        ArrayList arrayList17 = arrayList14;
        ArrayList<Long> arrayList18 = arrayList15;
        ArrayList<Integer> arrayList19 = arrayList16;
        a0.h hVar8 = hVar7;
        TLRPC.InputPeer inputPeer2 = i110;
        int i29 = 0;
        ArrayList arrayList20 = arrayList13;
        boolean z31 = false;
        while (i28 < arrayList12.size()) {
            jj jjVar3 = (jj) arrayList12.get(i28);
            if (jjVar3.f1() <= 0 || jjVar3.m5()) {
                arrayList2 = arrayList19;
                j16 = e;
                j17 = j15;
                peer = y12;
                str3 = str2;
                hVar = hVar8;
                inputPeer = inputPeer2;
                z23 = z30;
                arrayList3 = arrayList17;
                chat = L0;
                arrayList4 = arrayList18;
                arrayList5 = arrayList20;
                hVar2 = hVar6;
                if (jjVar3.D != 0 || TextUtils.isEmpty(jjVar3.v)) {
                    i13 = i28;
                    arrayList18 = arrayList4;
                    hVar8 = hVar;
                    arrayList17 = arrayList3;
                } else {
                    TLRPC.MessageMedia messageMedia2 = jjVar3.k.media;
                    TLRPC.WebPage webPage = messageMedia2 != null ? messageMedia2.webpage : null;
                    i13 = i28;
                    oz b10 = oz.b(jjVar3.v.toString(), j10, null, jjVar, webPage, webPage != null ? i27 : 0, jjVar3.k.entities, null, null, z12, i10, i11, null, false);
                    b10.T = ojVar;
                    b10.R = j12;
                    b10.M = jj.K1(jjVar3.k);
                    b10.N = jj.J1(jjVar3.k);
                    r0(b10);
                    arrayList18 = arrayList4;
                    hVar8 = hVar;
                    arrayList17 = arrayList3;
                }
            } else {
                if (jjVar3.t4() || jjVar3.J2()) {
                    i14 = i28;
                } else {
                    i14 = i28;
                    if (!jj.t3(jjVar3.k) && !(jj.o1(jjVar3.k) instanceof TLRPC.TL_messageMediaGame)) {
                        i15 = i26;
                        if (!z20 || i15 == 0) {
                            if (!z21) {
                                TLRPC.Message message3 = jjVar3.k;
                                if ((message3.media instanceof TLRPC.TL_messageMediaPhoto) && !jj.L4(message3) && i15 == 0) {
                                    if (i29 == 0) {
                                        i21 = w3.P(16, L0) ? 10 : 12;
                                        arrayList2 = arrayList19;
                                        j16 = e;
                                        j17 = j15;
                                        peer = y12;
                                        str3 = str2;
                                        i29 = i21;
                                        i13 = i14;
                                        z23 = z30;
                                        arrayList5 = arrayList20;
                                        inputPeer = inputPeer2;
                                        chat = L0;
                                        hVar2 = hVar6;
                                    }
                                    arrayList2 = arrayList19;
                                    j16 = e;
                                    j17 = j15;
                                    peer = y12;
                                    str3 = str2;
                                    hVar = hVar8;
                                    i13 = i14;
                                    z23 = z30;
                                    arrayList3 = arrayList17;
                                    arrayList4 = arrayList18;
                                    arrayList5 = arrayList20;
                                    inputPeer = inputPeer2;
                                    chat = L0;
                                    hVar2 = hVar6;
                                    arrayList18 = arrayList4;
                                    hVar8 = hVar;
                                    arrayList17 = arrayList3;
                                }
                            }
                            if (o10 && jjVar3.I3()) {
                                if (i29 == 0) {
                                    i21 = w3.P(18, L0) ? 19 : 20;
                                    arrayList2 = arrayList19;
                                    j16 = e;
                                    j17 = j15;
                                    peer = y12;
                                    str3 = str2;
                                    i29 = i21;
                                    i13 = i14;
                                    z23 = z30;
                                    arrayList5 = arrayList20;
                                    inputPeer = inputPeer2;
                                    chat = L0;
                                    hVar2 = hVar6;
                                }
                                arrayList2 = arrayList19;
                                j16 = e;
                                j17 = j15;
                                peer = y12;
                                str3 = str2;
                                hVar = hVar8;
                                i13 = i14;
                                z23 = z30;
                                arrayList3 = arrayList17;
                                arrayList4 = arrayList18;
                                arrayList5 = arrayList20;
                                inputPeer = inputPeer2;
                                chat = L0;
                                hVar2 = hVar6;
                                arrayList18 = arrayList4;
                                hVar8 = hVar;
                                arrayList17 = arrayList3;
                            } else {
                                if (!z18) {
                                    TLRPC.Message message4 = jjVar3.k;
                                    if ((message4.media instanceof TLRPC.TL_messageMediaPhoto) && jj.L4(message4) && i15 == 0) {
                                        if (i29 == 0) {
                                            i22 = w3.P(17, L0) ? 9 : 11;
                                            i29 = i22;
                                            arrayList2 = arrayList19;
                                            j16 = e;
                                            j17 = j15;
                                            peer = y12;
                                            str3 = str2;
                                            i13 = i14;
                                            z23 = z30;
                                            arrayList5 = arrayList20;
                                            inputPeer = inputPeer2;
                                            chat = L0;
                                            hVar2 = hVar6;
                                        }
                                        arrayList2 = arrayList19;
                                        j16 = e;
                                        j17 = j15;
                                        peer = y12;
                                        str3 = str2;
                                        hVar = hVar8;
                                        i13 = i14;
                                        z23 = z30;
                                        arrayList3 = arrayList17;
                                        arrayList4 = arrayList18;
                                        arrayList5 = arrayList20;
                                        inputPeer = inputPeer2;
                                        chat = L0;
                                        hVar2 = hVar6;
                                        arrayList18 = arrayList4;
                                        hVar8 = hVar;
                                        arrayList17 = arrayList3;
                                    }
                                }
                                if (z15 && (jjVar3.k.media instanceof TLRPC.TL_messageMediaPoll)) {
                                    if (i29 == 0) {
                                        i22 = w3.P(10, L0) ? 6 : 3;
                                        i29 = i22;
                                        arrayList2 = arrayList19;
                                        j16 = e;
                                        j17 = j15;
                                        peer = y12;
                                        str3 = str2;
                                        i13 = i14;
                                        z23 = z30;
                                        arrayList5 = arrayList20;
                                        inputPeer = inputPeer2;
                                        chat = L0;
                                        hVar2 = hVar6;
                                    }
                                    arrayList2 = arrayList19;
                                    j16 = e;
                                    j17 = j15;
                                    peer = y12;
                                    str3 = str2;
                                    hVar = hVar8;
                                    i13 = i14;
                                    z23 = z30;
                                    arrayList3 = arrayList17;
                                    arrayList4 = arrayList18;
                                    arrayList5 = arrayList20;
                                    inputPeer = inputPeer2;
                                    chat = L0;
                                    hVar2 = hVar6;
                                    arrayList18 = arrayList4;
                                    hVar8 = hVar;
                                    arrayList17 = arrayList3;
                                } else {
                                    int i30 = 21;
                                    if (z15 && (jjVar3.k.media instanceof TLRPC.TL_messageMediaToDo)) {
                                        if (i29 == 0) {
                                            if (!w3.P(10, L0)) {
                                                i30 = 22;
                                            }
                                            arrayList2 = arrayList19;
                                            j16 = e;
                                            j17 = j15;
                                            peer = y12;
                                            str3 = str2;
                                            i29 = i30;
                                            i13 = i14;
                                            z23 = z30;
                                            arrayList5 = arrayList20;
                                            inputPeer = inputPeer2;
                                            chat = L0;
                                            hVar2 = hVar6;
                                        }
                                        arrayList2 = arrayList19;
                                        j16 = e;
                                        j17 = j15;
                                        peer = y12;
                                        str3 = str2;
                                        hVar = hVar8;
                                        i13 = i14;
                                        z23 = z30;
                                        arrayList3 = arrayList17;
                                        arrayList4 = arrayList18;
                                        arrayList5 = arrayList20;
                                        inputPeer = inputPeer2;
                                        chat = L0;
                                        hVar2 = hVar6;
                                        arrayList18 = arrayList4;
                                        hVar8 = hVar;
                                        arrayList17 = arrayList3;
                                    } else {
                                        if (v && jj.R4(jjVar3.k)) {
                                            if (L0 != null) {
                                                if (i29 == 0) {
                                                    i22 = w3.P(20, L0) ? 13 : 14;
                                                    i29 = i22;
                                                    arrayList2 = arrayList19;
                                                    j16 = e;
                                                    j17 = j15;
                                                    peer = y12;
                                                    str3 = str2;
                                                    i13 = i14;
                                                    z23 = z30;
                                                    arrayList5 = arrayList20;
                                                    inputPeer = inputPeer2;
                                                    chat = L0;
                                                    hVar2 = hVar6;
                                                }
                                            } else if (i29 == 0) {
                                                arrayList2 = arrayList19;
                                                j16 = e;
                                                j17 = j15;
                                                peer = y12;
                                                str3 = str2;
                                                i29 = 7;
                                                i13 = i14;
                                                z23 = z30;
                                                arrayList5 = arrayList20;
                                                inputPeer = inputPeer2;
                                                chat = L0;
                                                hVar2 = hVar6;
                                            }
                                        } else if (s10 && jj.j4(jjVar3.k)) {
                                            if (L0 != null) {
                                                if (i29 == 0) {
                                                    i21 = w3.P(21, L0) ? 15 : 16;
                                                    arrayList2 = arrayList19;
                                                    j16 = e;
                                                    j17 = j15;
                                                    peer = y12;
                                                    str3 = str2;
                                                    i29 = i21;
                                                    i13 = i14;
                                                    z23 = z30;
                                                    arrayList5 = arrayList20;
                                                    inputPeer = inputPeer2;
                                                    chat = L0;
                                                    hVar2 = hVar6;
                                                }
                                            } else if (i29 == 0) {
                                                arrayList2 = arrayList19;
                                                j16 = e;
                                                j17 = j15;
                                                peer = y12;
                                                str3 = str2;
                                                i13 = i14;
                                                z23 = z30;
                                                i29 = 8;
                                                arrayList5 = arrayList20;
                                                inputPeer = inputPeer2;
                                                chat = L0;
                                                hVar2 = hVar6;
                                            }
                                        } else if (!z17 || !(jjVar3.k.media instanceof TLRPC.TL_messageMediaDocument) || i15 != 0) {
                                            tL_message = new TLRPC.TL_message();
                                            if (z10 || (jjVar3.k.media instanceof TLRPC.TL_messageMediaWidget)) {
                                                if (jj.B0(jjVar3.k) == e || !jjVar3.p3()) {
                                                    arrayList6 = arrayList18;
                                                    hVar3 = hVar8;
                                                } else {
                                                    arrayList6 = arrayList18;
                                                    hVar3 = hVar8;
                                                    if (jjVar3.k.from_id.user_id == e) {
                                                        i16 = i27;
                                                        if (jj.l3(jjVar3.k)) {
                                                            TLRPC.TL_messageFwdHeader tL_messageFwdHeader = new TLRPC.TL_messageFwdHeader();
                                                            tL_message.fwd_from = tL_messageFwdHeader;
                                                            TLRPC.Message message5 = jjVar3.k;
                                                            TLRPC.MessageFwdHeader messageFwdHeader3 = message5.fwd_from;
                                                            if ((messageFwdHeader3.flags & 1) != 0) {
                                                                tL_messageFwdHeader.flags |= 1;
                                                                tL_messageFwdHeader.from_id = messageFwdHeader3.from_id;
                                                            }
                                                            if ((messageFwdHeader3.flags & 32) != 0) {
                                                                tL_messageFwdHeader.flags |= 32;
                                                                tL_messageFwdHeader.from_name = messageFwdHeader3.from_name;
                                                            }
                                                            if ((messageFwdHeader3.flags & 4) != 0) {
                                                                tL_messageFwdHeader.flags |= 4;
                                                                tL_messageFwdHeader.channel_post = messageFwdHeader3.channel_post;
                                                            }
                                                            if ((messageFwdHeader3.flags & 8) != 0) {
                                                                tL_messageFwdHeader.flags |= 8;
                                                                tL_messageFwdHeader.post_author = messageFwdHeader3.post_author;
                                                            }
                                                            if ((j21 == e || z22) && (messageFwdHeader3.flags & 16) != 0 && !h20.y(jj.B0(message5))) {
                                                                TLRPC.MessageFwdHeader messageFwdHeader4 = tL_message.fwd_from;
                                                                messageFwdHeader4.flags |= 16;
                                                                TLRPC.MessageFwdHeader messageFwdHeader5 = jjVar3.k.fwd_from;
                                                                messageFwdHeader4.saved_from_peer = messageFwdHeader5.saved_from_peer;
                                                                messageFwdHeader4.saved_from_msg_id = messageFwdHeader5.saved_from_msg_id;
                                                            }
                                                            tL_message.fwd_from.date = jjVar3.k.fwd_from.date;
                                                            tL_message.flags = 4;
                                                        } else if (i16 == 0) {
                                                            long Z0 = jjVar3.Z0();
                                                            TLRPC.TL_messageFwdHeader tL_messageFwdHeader2 = new TLRPC.TL_messageFwdHeader();
                                                            tL_message.fwd_from = tL_messageFwdHeader2;
                                                            tL_messageFwdHeader2.channel_post = jjVar3.f1();
                                                            tL_message.fwd_from.flags |= 4;
                                                            if (jjVar3.p3()) {
                                                                TLRPC.MessageFwdHeader messageFwdHeader6 = tL_message.fwd_from;
                                                                messageFwdHeader6.from_id = jjVar3.k.from_id;
                                                                messageFwdHeader6.flags |= 1;
                                                                arrayList7 = arrayList19;
                                                            } else {
                                                                tL_message.fwd_from.from_id = new TLRPC.TL_peerChannel();
                                                                TLRPC.MessageFwdHeader messageFwdHeader7 = tL_message.fwd_from;
                                                                TLRPC.Peer peer4 = messageFwdHeader7.from_id;
                                                                TLRPC.Message message6 = jjVar3.k;
                                                                arrayList7 = arrayList19;
                                                                TLRPC.Peer peer5 = message6.peer_id;
                                                                peer4.channel_id = peer5.channel_id;
                                                                messageFwdHeader7.flags |= 1;
                                                                if (message6.post && Z0 > 0) {
                                                                    TLRPC.Peer peer6 = message6.from_id;
                                                                    if (peer6 != null) {
                                                                        peer5 = peer6;
                                                                    }
                                                                    messageFwdHeader7.from_id = peer5;
                                                                }
                                                            }
                                                            if (jjVar3.k.post_author == null && !jjVar3.P3() && Z0 > 0 && jjVar3.k.post && (Z1 = getMessagesController().Z1(Long.valueOf(Z0))) != null) {
                                                                tL_message.fwd_from.post_author = i5.m(i26, Z1.first_name, Z1.last_name);
                                                                tL_message.fwd_from.flags |= 8;
                                                            }
                                                            tL_message.date = jjVar3.k.date;
                                                            tL_message.flags = 4;
                                                            if (j21 == e && (messageFwdHeader = tL_message.fwd_from) != null) {
                                                                messageFwdHeader.flags |= 16;
                                                                messageFwdHeader.saved_from_msg_id = jjVar3.f1();
                                                                TLRPC.MessageFwdHeader messageFwdHeader8 = tL_message.fwd_from;
                                                                TLRPC.Message message7 = jjVar3.k;
                                                                peer2 = message7.peer_id;
                                                                messageFwdHeader8.saved_from_peer = peer2;
                                                                if (peer2.user_id == e) {
                                                                    peer2.user_id = jj.B0(message7);
                                                                }
                                                            }
                                                        }
                                                        arrayList7 = arrayList19;
                                                        if (j21 == e) {
                                                            messageFwdHeader.flags |= 16;
                                                            messageFwdHeader.saved_from_msg_id = jjVar3.f1();
                                                            TLRPC.MessageFwdHeader messageFwdHeader82 = tL_message.fwd_from;
                                                            TLRPC.Message message72 = jjVar3.k;
                                                            peer2 = message72.peer_id;
                                                            messageFwdHeader82.saved_from_peer = peer2;
                                                            if (peer2.user_id == e) {
                                                            }
                                                        }
                                                    }
                                                }
                                                i16 = i26;
                                                if (jj.l3(jjVar3.k)) {
                                                }
                                                arrayList7 = arrayList19;
                                                if (j21 == e) {
                                                }
                                            } else {
                                                arrayList7 = arrayList19;
                                                arrayList6 = arrayList18;
                                                hVar3 = hVar8;
                                            }
                                            if (jjVar3.b5() && (messageFwdHeader2 = tL_message.fwd_from) != null && messageFwdHeader2.from_id != null) {
                                                messageFwdHeader2.from_id = (TLRPC.Peer) TLObject.deepCopy(jjVar3.k.peer_id, new e9(16));
                                                o11 = o5.o(jjVar3.k.from_id);
                                                if (o11 > 0) {
                                                    tL_message.via_bot_id = o11;
                                                }
                                            }
                                            HashMap<String, String> hashMap = new HashMap<>();
                                            tL_message.params = hashMap;
                                            hashMap.put("fwd_id", "" + jjVar3.f1());
                                            tL_message.params.put("fwd_peer", "" + jj.B0(jjVar3.k));
                                            if (!jjVar3.k.restriction_reason.isEmpty()) {
                                                tL_message.restriction_reason = jjVar3.k.restriction_reason;
                                                tL_message.flags |= TLObject.FLAG_22;
                                            }
                                            if (z16 && (jjVar3.k.media instanceof TLRPC.TL_messageMediaWebPage)) {
                                                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                                            } else {
                                                messageMedia = jjVar3.k.media;
                                                if (messageMedia instanceof TLRPC.TL_messageMediaWidget) {
                                                    tL_message.media = messageMedia;
                                                } else {
                                                    TLRPC.TL_messageMediaWidget tL_messageMediaWidget = (TLRPC.TL_messageMediaWidget) messageMedia;
                                                    TLRPC.TL_messageMediaWidget tL_messageMediaWidget2 = new TLRPC.TL_messageMediaWidget();
                                                    tL_messageMediaWidget2.is_copy = i27;
                                                    tL_messageMediaWidget2.width = tL_messageMediaWidget.width;
                                                    tL_messageMediaWidget2.height = tL_messageMediaWidget.height;
                                                    tL_messageMediaWidget2.payload = tL_messageMediaWidget.payload;
                                                    tL_messageMediaWidget2.public_data = tL_messageMediaWidget.public_data;
                                                    tL_messageMediaWidget2.public_data_hash = tL_messageMediaWidget.public_data_hash;
                                                    tL_messageMediaWidget2.widget_id = tL_messageMediaWidget.widget_id;
                                                    tL_message.media = tL_messageMediaWidget2;
                                                }
                                            }
                                            TLRPC.Message message8 = jjVar3.k;
                                            tL_message.invert_media = message8.invert_media;
                                            if (tL_message.media != null) {
                                                tL_message.flags |= 512;
                                            }
                                            j18 = message8.via_bot_id;
                                            if (j18 != 0) {
                                                tL_message.via_bot_id = j18;
                                                tL_message.flags |= 2048;
                                            }
                                            if (j15 != 0) {
                                                TLRPC.TL_messageReplies tL_messageReplies = new TLRPC.TL_messageReplies();
                                                tL_message.replies = tL_messageReplies;
                                                tL_messageReplies.comments = true;
                                                tL_messageReplies.channel_id = j15;
                                                tL_messageReplies.flags |= 1;
                                                tL_message.flags |= TLObject.FLAG_23;
                                            }
                                            if (z11 || tL_message.media == null) {
                                                tL_message.message = jjVar3.k.message;
                                            }
                                            richMessage = jjVar3.k.rich_message;
                                            if (richMessage != null) {
                                                tL_message.flags2 |= TLObject.FLAG_13;
                                                tL_message.rich_message = richMessage;
                                            }
                                            if (tL_message.message == null) {
                                                tL_message.message = "";
                                            }
                                            tL_message.fwd_msg_id = jjVar3.f1();
                                            TLRPC.Message message9 = jjVar3.k;
                                            tL_message.attachPath = message9.attachPath;
                                            tL_message.entities = message9.entities;
                                            replyMarkup = message9.reply_markup;
                                            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                j17 = j15;
                                            } else {
                                                TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = (TLRPC.TL_replyInlineMarkup) replyMarkup;
                                                TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup2 = new TLRPC.TL_replyInlineMarkup();
                                                tL_message.reply_markup = tL_replyInlineMarkup2;
                                                int size = tL_replyInlineMarkup.rows.size();
                                                int i31 = 0;
                                                boolean z32 = false;
                                                while (true) {
                                                    j17 = j15;
                                                    if (i31 >= size) {
                                                        break;
                                                    }
                                                    TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = tL_replyInlineMarkup.rows.get(i31);
                                                    int size2 = keyboardInlineButtonRow.buttons.size();
                                                    TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup3 = tL_replyInlineMarkup;
                                                    int i32 = 0;
                                                    TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow2 = null;
                                                    while (true) {
                                                        if (i32 >= size2) {
                                                            break;
                                                        }
                                                        int i33 = size2;
                                                        TL_keyboard.KeyboardInlineButton keyboardInlineButton = keyboardInlineButtonRow.buttons.get(i32);
                                                        int i34 = i32;
                                                        TL_keyboard.TL_inlineButtonTypeUrlAuth tL_inlineButtonTypeUrlAuth = (TL_keyboard.TL_inlineButtonTypeUrlAuth) sf.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class);
                                                        TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow2 = keyboardInlineButtonRow;
                                                        if (tL_inlineButtonTypeUrlAuth == null && !sf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) && !sf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) && !sf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                                                            z32 = true;
                                                            break;
                                                        }
                                                        if (tL_inlineButtonTypeUrlAuth != null) {
                                                            TL_keyboard.TL_keyboardInlineButton tL_keyboardInlineButton = new TL_keyboard.TL_keyboardInlineButton();
                                                            i19 = size;
                                                            TL_keyboard.TL_inlineButtonTypeUrlAuth tL_inlineButtonTypeUrlAuth2 = new TL_keyboard.TL_inlineButtonTypeUrlAuth();
                                                            tL_keyboardInlineButton.type = tL_inlineButtonTypeUrlAuth2;
                                                            i20 = i31;
                                                            tL_inlineButtonTypeUrlAuth2.flags = tL_inlineButtonTypeUrlAuth.flags;
                                                            tL_keyboardInlineButton.style = keyboardInlineButton.style;
                                                            String str4 = tL_inlineButtonTypeUrlAuth.fwd_text;
                                                            if (str4 != null) {
                                                                tL_inlineButtonTypeUrlAuth2.fwd_text = str4;
                                                                tL_keyboardInlineButton.text = str4;
                                                            } else {
                                                                tL_keyboardInlineButton.text = keyboardInlineButton.text;
                                                            }
                                                            tL_inlineButtonTypeUrlAuth2.url = tL_inlineButtonTypeUrlAuth.url;
                                                            tL_inlineButtonTypeUrlAuth2.button_id = tL_inlineButtonTypeUrlAuth.button_id;
                                                            keyboardInlineButton = tL_keyboardInlineButton;
                                                        } else {
                                                            i19 = size;
                                                            i20 = i31;
                                                        }
                                                        if (tL_keyboardInlineButtonRow2 == null) {
                                                            tL_keyboardInlineButtonRow = new TL_keyboard.TL_keyboardInlineButtonRow();
                                                            tL_replyInlineMarkup2.rows.add(tL_keyboardInlineButtonRow);
                                                        } else {
                                                            tL_keyboardInlineButtonRow = tL_keyboardInlineButtonRow2;
                                                        }
                                                        tL_keyboardInlineButtonRow.buttons.add(keyboardInlineButton);
                                                        tL_keyboardInlineButtonRow2 = tL_keyboardInlineButtonRow;
                                                        i32 = i34 + 1;
                                                        size2 = i33;
                                                        keyboardInlineButtonRow = keyboardInlineButtonRow2;
                                                        size = i19;
                                                        i31 = i20;
                                                    }
                                                    int i35 = size;
                                                    int i36 = i31;
                                                    if (z32) {
                                                        break;
                                                    }
                                                    i31 = i36 + 1;
                                                    tL_replyInlineMarkup = tL_replyInlineMarkup3;
                                                    j15 = j17;
                                                    size = i35;
                                                }
                                                if (z32) {
                                                    jjVar3.k.reply_markup = null;
                                                    tL_message.flags &= -65;
                                                    if (!tL_message.entities.isEmpty()) {
                                                        tL_message.flags |= 128;
                                                    }
                                                    if (tL_message.attachPath == null) {
                                                        tL_message.attachPath = "";
                                                    }
                                                    int j24 = getUserConfig().j();
                                                    tL_message.id = j24;
                                                    tL_message.local_id = j24;
                                                    tL_message.out = true;
                                                    j19 = jjVar3.k.grouped_id;
                                                    if (j19 != 0) {
                                                        Long l10 = (Long) hVar6.f(j19);
                                                        if (l10 == null) {
                                                            l10 = Long.valueOf(Utilities.b.nextLong());
                                                            hVar6.k(l10, jjVar3.k.grouped_id);
                                                        }
                                                        tL_message.grouped_id = l10.longValue();
                                                        tL_message.flags |= 131072;
                                                    }
                                                    if (y12.channel_id == 0 && z22) {
                                                        if (z19) {
                                                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                                            tL_message.from_id = tL_peerUser;
                                                            tL_peerUser.user_id = e;
                                                        } else {
                                                            tL_message.from_id = y12;
                                                        }
                                                        tL_message.post = true;
                                                        j20 = j10;
                                                    } else {
                                                        j20 = j10;
                                                        M = w3.M(L0, getMessagesController().M0(-j20), true);
                                                        if (M == e) {
                                                            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                                                            tL_message.from_id = tL_peerUser2;
                                                            tL_peerUser2.user_id = e;
                                                            tL_message.flags |= 256;
                                                        } else {
                                                            tL_message.from_id = getMessagesController().y1(M);
                                                            if (str2 != null) {
                                                                tL_message.post_author = str2;
                                                                tL_message.flags |= 65536;
                                                            }
                                                        }
                                                    }
                                                    if (tL_message.random_id == 0) {
                                                        tL_message.random_id = E();
                                                    }
                                                    ArrayList<Long> arrayList21 = arrayList6;
                                                    arrayList21.add(Long.valueOf(tL_message.random_id));
                                                    hVar4 = hVar3;
                                                    hVar4.k(tL_message, tL_message.random_id);
                                                    if (jj.c3(jjVar3.k)) {
                                                        arrayList8 = arrayList7;
                                                        arrayList8.add(Integer.valueOf(jjVar3.P0()));
                                                        z24 = true;
                                                    } else {
                                                        arrayList8 = arrayList7;
                                                        arrayList8.add(Integer.valueOf(tL_message.fwd_msg_id));
                                                        z24 = z31;
                                                    }
                                                    tL_message.date = i10 != 0 ? i10 : getConnectionsManager().getCurrentTime();
                                                    TLRPC.InputPeer inputPeer3 = inputPeer2;
                                                    z25 = inputPeer3 instanceof TLRPC.TL_inputPeerChannel;
                                                    if (z25 || !z22) {
                                                        hVar5 = hVar4;
                                                        message = jjVar3.k;
                                                        j16 = e;
                                                        if ((message.flags & 1024) != 0 && i10 == 0) {
                                                            tL_message.views = message.views;
                                                            tL_message.flags |= 1024;
                                                        }
                                                        tL_message.unread = true;
                                                    } else {
                                                        hVar5 = hVar4;
                                                        if (i10 == 0) {
                                                            tL_message.views = 1;
                                                            tL_message.flags |= 1024;
                                                        }
                                                        j16 = e;
                                                    }
                                                    tL_message.dialog_id = j20;
                                                    tL_message.peer_id = y12;
                                                    if (!jj.R4(tL_message) || jj.j4(tL_message)) {
                                                        if (z25 || jj.v0(jjVar3.k) == 0) {
                                                            tL_message.media_unread = true;
                                                        } else {
                                                            tL_message.media_unread = jjVar3.k.media_unread;
                                                        }
                                                    }
                                                    if (jjVar == null && ojVar == null && (messageReplyHeader = (message2 = jjVar3.k).reply_to) != null) {
                                                        peer3 = messageReplyHeader.reply_to_peer_id;
                                                        if (peer3 != null || jj.v5(peer3, message2.peer_id)) {
                                                            messageReplyHeader2 = jjVar3.k.reply_to;
                                                            if ((messageReplyHeader2.flags & 16) != 0) {
                                                            }
                                                        }
                                                        tL_message.flags |= 8;
                                                        tL_message.reply_to = jjVar3.k.reply_to;
                                                    }
                                                    i17 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                                                    if (i17 > 0) {
                                                        tL_message.flags2 |= 64;
                                                        tL_message.paid_message_stars = j11;
                                                    }
                                                    if (j12 != 0) {
                                                        i18 = i17;
                                                        tL_message.saved_peer_id = getMessagesController().y1(j12);
                                                        tL_message.flags |= TLObject.FLAG_28;
                                                    } else {
                                                        i18 = i17;
                                                    }
                                                    if (ojVar != null) {
                                                        tL_message.suggested_post = ojVar.c();
                                                    }
                                                    chat = L0;
                                                    TLRPC.Peer peer7 = y12;
                                                    str3 = str2;
                                                    jj jjVar4 = new jj(this.currentAccount, tL_message, true, true);
                                                    jjVar4.p1 = i10 != 0;
                                                    jjVar4.k.send_state = 1;
                                                    jjVar4.V1 = true;
                                                    ArrayList arrayList22 = arrayList20;
                                                    arrayList22.add(jjVar4);
                                                    arrayList9 = arrayList17;
                                                    arrayList9.add(tL_message);
                                                    hVar2 = hVar6;
                                                    rh.e6.y(this.currentAccount, false).d(jjVar4);
                                                    if (jjVar3.C != null) {
                                                        int i37 = 0;
                                                        while (i37 < arrayList.size()) {
                                                            arrayList10 = arrayList;
                                                            int i38 = i37;
                                                            if (((jj) arrayList10.get(i37)).f1() == jjVar3.C.f1()) {
                                                                TLRPC.Message message10 = jjVar4.k;
                                                                jj jjVar5 = jjVar3.C;
                                                                message10.replyMessage = jjVar5.k;
                                                                jjVar4.C = jjVar5;
                                                                break;
                                                            }
                                                            i37 = i38 + 1;
                                                        }
                                                    }
                                                    arrayList10 = arrayList;
                                                    f0(tL_message, i10 != 0);
                                                    if (v2.a) {
                                                        StringBuilder sb2 = new StringBuilder("forward message user_id = ");
                                                        sb2.append(inputPeer3.user_id);
                                                        sb2.append(" chat_id = ");
                                                        sb2.append(inputPeer3.chat_id);
                                                        sb2.append(" channel_id = ");
                                                        sb2.append(inputPeer3.channel_id);
                                                        sb2.append(" access_hash = ");
                                                        i0.a.q(inputPeer3.access_hash, sb2);
                                                    }
                                                    if (jjVar == null && ojVar == null) {
                                                        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                                        tL_message.reply_to = tL_messageReplyHeader;
                                                        tL_messageReplyHeader.flags |= 16;
                                                        tL_messageReplyHeader.reply_to_msg_id = jjVar.f1();
                                                        if (jjVar.p) {
                                                            TLRPC.MessageReplyHeader messageReplyHeader3 = tL_message.reply_to;
                                                            messageReplyHeader3.forum_topic = true;
                                                            messageReplyHeader3.flags |= 8;
                                                            if (arrayList9.size() == 100) {
                                                                i28 = i14;
                                                                if (i28 != arrayList10.size() - 1 && (i28 == arrayList10.size() - 1 || jj.B0(((jj) arrayList10.get(i28 + 1)).k) == jj.B0(jjVar3.k))) {
                                                                    arrayList4 = arrayList21;
                                                                    inputPeer = inputPeer3;
                                                                    qzVar = this;
                                                                    arrayList3 = arrayList9;
                                                                    z23 = z30;
                                                                    hVar = hVar5;
                                                                    peer = peer7;
                                                                    i27 = 1;
                                                                    arrayList5 = arrayList22;
                                                                    arrayList2 = arrayList8;
                                                                    z31 = z24;
                                                                    i13 = i28;
                                                                    arrayList18 = arrayList4;
                                                                    hVar8 = hVar;
                                                                    arrayList17 = arrayList3;
                                                                }
                                                            } else {
                                                                i28 = i14;
                                                            }
                                                            getMessagesStorage().i1(0, i10 == 0 ? 1 : 0, 0L, new ArrayList(arrayList9), false);
                                                            getMessagesController().i5(i10 == 0 ? 1 : 0, j20, arrayList22);
                                                            getNotificationCenter().k(zs.s, new Object[0]);
                                                            getUserConfig().v(false);
                                                            tL_messages_forwardMessages = new TLRPC.TL_messages_forwardMessages();
                                                            tL_messages_forwardMessages.to_peer = inputPeer3;
                                                            tL_messages_forwardMessages.silent = z12 || m5.w("silent_", j20, vp.r1(this.currentAccount).e7, false);
                                                            if (jjVar != null) {
                                                                tL_messages_forwardMessages.top_msg_id = jjVar.f1();
                                                                tL_messages_forwardMessages.flags |= 512;
                                                            }
                                                            if (i10 == 0) {
                                                                tL_messages_forwardMessages.schedule_date = i10;
                                                                int i39 = tL_messages_forwardMessages.flags;
                                                                tL_messages_forwardMessages.flags = i39 | 1024;
                                                                if (i11 != 0) {
                                                                    tL_messages_forwardMessages.schedule_repeat_period = i11;
                                                                    tL_messages_forwardMessages.flags = i39 | 16778240;
                                                                }
                                                            }
                                                            if (jjVar3.k.peer_id instanceof TLRPC.TL_peerChannel) {
                                                                inputPeer = inputPeer3;
                                                                tL_messages_forwardMessages.from_peer = new TLRPC.TL_inputPeerEmpty();
                                                            } else {
                                                                inputPeer = inputPeer3;
                                                                TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(jjVar3.k.peer_id.channel_id));
                                                                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                                                                tL_messages_forwardMessages.from_peer = tL_inputPeerChannel;
                                                                tL_inputPeerChannel.channel_id = jjVar3.k.peer_id.channel_id;
                                                                if (L02 != null) {
                                                                    tL_inputPeerChannel.access_hash = L02.access_hash;
                                                                }
                                                            }
                                                            tL_messages_forwardMessages.random_id = arrayList21;
                                                            tL_messages_forwardMessages.id = arrayList8;
                                                            tL_messages_forwardMessages.drop_author = z10;
                                                            tL_messages_forwardMessages.drop_media_captions = z11;
                                                            tL_messages_forwardMessages.with_my_score = arrayList10.size() != 1 && ((jj) arrayList10.get(0)).k.with_my_score;
                                                            tL_messages_forwardMessages.from_ephemeral = z24;
                                                            if (i12 >= 0) {
                                                                tL_messages_forwardMessages.flags |= TLObject.FLAG_20;
                                                                tL_messages_forwardMessages.video_timestamp = i12;
                                                            }
                                                            if (i18 <= 0) {
                                                                tL_messages_forwardMessages.flags |= TLObject.FLAG_21;
                                                                arrayList4 = arrayList21;
                                                                tL_messages_forwardMessages.allow_paid_stars = tL_messages_forwardMessages.id.size() * j11;
                                                            } else {
                                                                arrayList4 = arrayList21;
                                                            }
                                                            if (ojVar != null) {
                                                                tL_messages_forwardMessages.suggested_post = ojVar.c();
                                                                if (jjVar != null) {
                                                                    TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                                                                    tL_messages_forwardMessages.reply_to = tL_inputReplyToMessage;
                                                                    tL_inputReplyToMessage.reply_to_msg_id = jjVar.f1();
                                                                }
                                                            }
                                                            a(tL_messages_forwardMessages, j12);
                                                            arrayList11 = new ArrayList(arrayList22);
                                                            boolean z33 = z30;
                                                            arrayList5 = arrayList22;
                                                            arrayList2 = arrayList8;
                                                            i27 = 1;
                                                            a0.h hVar9 = hVar5;
                                                            hVar = hVar9;
                                                            arrayList3 = arrayList9;
                                                            peer = peer7;
                                                            z23 = z33;
                                                            ulVar = new ul(this, tL_messages_forwardMessages, arrayList11, new ey(i10, j10, hVar9, arrayList9, arrayList11, jjVar3, this, peer7, tL_messages_forwardMessages, i10 != 2147483646, z33), 4);
                                                            qzVar = this;
                                                            if (rh.e6.y(qzVar.currentAccount, false).c(tL_messages_forwardMessages, arrayList11, ulVar)) {
                                                                ulVar.run();
                                                            }
                                                            if (i28 != arrayList10.size() - 1) {
                                                                arrayList5 = new ArrayList();
                                                                arrayList17 = new ArrayList();
                                                                arrayList18 = new ArrayList<>();
                                                                arrayList2 = new ArrayList<>();
                                                                z31 = z24;
                                                                i13 = i28;
                                                                hVar8 = new a0.h();
                                                            }
                                                            z31 = z24;
                                                            i13 = i28;
                                                            arrayList18 = arrayList4;
                                                            hVar8 = hVar;
                                                            arrayList17 = arrayList3;
                                                        }
                                                    }
                                                    if (arrayList9.size() == 100) {
                                                    }
                                                    getMessagesStorage().i1(0, i10 == 0 ? 1 : 0, 0L, new ArrayList(arrayList9), false);
                                                    getMessagesController().i5(i10 == 0 ? 1 : 0, j20, arrayList22);
                                                    getNotificationCenter().k(zs.s, new Object[0]);
                                                    getUserConfig().v(false);
                                                    tL_messages_forwardMessages = new TLRPC.TL_messages_forwardMessages();
                                                    tL_messages_forwardMessages.to_peer = inputPeer3;
                                                    tL_messages_forwardMessages.silent = z12 || m5.w("silent_", j20, vp.r1(this.currentAccount).e7, false);
                                                    if (jjVar != null) {
                                                    }
                                                    if (i10 == 0) {
                                                    }
                                                    if (jjVar3.k.peer_id instanceof TLRPC.TL_peerChannel) {
                                                    }
                                                    tL_messages_forwardMessages.random_id = arrayList21;
                                                    tL_messages_forwardMessages.id = arrayList8;
                                                    tL_messages_forwardMessages.drop_author = z10;
                                                    tL_messages_forwardMessages.drop_media_captions = z11;
                                                    tL_messages_forwardMessages.with_my_score = arrayList10.size() != 1 && ((jj) arrayList10.get(0)).k.with_my_score;
                                                    tL_messages_forwardMessages.from_ephemeral = z24;
                                                    if (i12 >= 0) {
                                                    }
                                                    if (i18 <= 0) {
                                                    }
                                                    if (ojVar != null) {
                                                    }
                                                    a(tL_messages_forwardMessages, j12);
                                                    arrayList11 = new ArrayList(arrayList22);
                                                    boolean z332 = z30;
                                                    arrayList5 = arrayList22;
                                                    arrayList2 = arrayList8;
                                                    i27 = 1;
                                                    a0.h hVar92 = hVar5;
                                                    hVar = hVar92;
                                                    arrayList3 = arrayList9;
                                                    peer = peer7;
                                                    z23 = z332;
                                                    ulVar = new ul(this, tL_messages_forwardMessages, arrayList11, new ey(i10, j10, hVar92, arrayList9, arrayList11, jjVar3, this, peer7, tL_messages_forwardMessages, i10 != 2147483646, z332), 4);
                                                    qzVar = this;
                                                    if (rh.e6.y(qzVar.currentAccount, false).c(tL_messages_forwardMessages, arrayList11, ulVar)) {
                                                    }
                                                    if (i28 != arrayList10.size() - 1) {
                                                    }
                                                    z31 = z24;
                                                    i13 = i28;
                                                    arrayList18 = arrayList4;
                                                    hVar8 = hVar;
                                                    arrayList17 = arrayList3;
                                                } else {
                                                    tL_message.flags |= 64;
                                                }
                                            }
                                            if (!tL_message.entities.isEmpty()) {
                                            }
                                            if (tL_message.attachPath == null) {
                                            }
                                            int j242 = getUserConfig().j();
                                            tL_message.id = j242;
                                            tL_message.local_id = j242;
                                            tL_message.out = true;
                                            j19 = jjVar3.k.grouped_id;
                                            if (j19 != 0) {
                                            }
                                            if (y12.channel_id == 0) {
                                            }
                                            j20 = j10;
                                            M = w3.M(L0, getMessagesController().M0(-j20), true);
                                            if (M == e) {
                                            }
                                            if (tL_message.random_id == 0) {
                                            }
                                            ArrayList<Long> arrayList212 = arrayList6;
                                            arrayList212.add(Long.valueOf(tL_message.random_id));
                                            hVar4 = hVar3;
                                            hVar4.k(tL_message, tL_message.random_id);
                                            if (jj.c3(jjVar3.k)) {
                                            }
                                            tL_message.date = i10 != 0 ? i10 : getConnectionsManager().getCurrentTime();
                                            TLRPC.InputPeer inputPeer32 = inputPeer2;
                                            z25 = inputPeer32 instanceof TLRPC.TL_inputPeerChannel;
                                            if (z25) {
                                            }
                                            hVar5 = hVar4;
                                            message = jjVar3.k;
                                            j16 = e;
                                            if ((message.flags & 1024) != 0) {
                                                tL_message.views = message.views;
                                                tL_message.flags |= 1024;
                                            }
                                            tL_message.unread = true;
                                            tL_message.dialog_id = j20;
                                            tL_message.peer_id = y12;
                                            if (!jj.R4(tL_message)) {
                                            }
                                            if (z25) {
                                            }
                                            tL_message.media_unread = true;
                                            if (jjVar == null) {
                                                peer3 = messageReplyHeader.reply_to_peer_id;
                                                if (peer3 != null) {
                                                }
                                                messageReplyHeader2 = jjVar3.k.reply_to;
                                                if ((messageReplyHeader2.flags & 16) != 0) {
                                                }
                                            }
                                            i17 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                                            if (i17 > 0) {
                                            }
                                            if (j12 != 0) {
                                            }
                                            if (ojVar != null) {
                                            }
                                            chat = L0;
                                            TLRPC.Peer peer72 = y12;
                                            str3 = str2;
                                            jj jjVar42 = new jj(this.currentAccount, tL_message, true, true);
                                            jjVar42.p1 = i10 != 0;
                                            jjVar42.k.send_state = 1;
                                            jjVar42.V1 = true;
                                            ArrayList arrayList222 = arrayList20;
                                            arrayList222.add(jjVar42);
                                            arrayList9 = arrayList17;
                                            arrayList9.add(tL_message);
                                            hVar2 = hVar6;
                                            rh.e6.y(this.currentAccount, false).d(jjVar42);
                                            if (jjVar3.C != null) {
                                            }
                                            arrayList10 = arrayList;
                                            f0(tL_message, i10 != 0);
                                            if (v2.a) {
                                            }
                                            if (jjVar == null) {
                                            }
                                            if (arrayList9.size() == 100) {
                                            }
                                            getMessagesStorage().i1(0, i10 == 0 ? 1 : 0, 0L, new ArrayList(arrayList9), false);
                                            getMessagesController().i5(i10 == 0 ? 1 : 0, j20, arrayList222);
                                            getNotificationCenter().k(zs.s, new Object[0]);
                                            getUserConfig().v(false);
                                            tL_messages_forwardMessages = new TLRPC.TL_messages_forwardMessages();
                                            tL_messages_forwardMessages.to_peer = inputPeer32;
                                            tL_messages_forwardMessages.silent = z12 || m5.w("silent_", j20, vp.r1(this.currentAccount).e7, false);
                                            if (jjVar != null) {
                                            }
                                            if (i10 == 0) {
                                            }
                                            if (jjVar3.k.peer_id instanceof TLRPC.TL_peerChannel) {
                                            }
                                            tL_messages_forwardMessages.random_id = arrayList212;
                                            tL_messages_forwardMessages.id = arrayList8;
                                            tL_messages_forwardMessages.drop_author = z10;
                                            tL_messages_forwardMessages.drop_media_captions = z11;
                                            tL_messages_forwardMessages.with_my_score = arrayList10.size() != 1 && ((jj) arrayList10.get(0)).k.with_my_score;
                                            tL_messages_forwardMessages.from_ephemeral = z24;
                                            if (i12 >= 0) {
                                            }
                                            if (i18 <= 0) {
                                            }
                                            if (ojVar != null) {
                                            }
                                            a(tL_messages_forwardMessages, j12);
                                            arrayList11 = new ArrayList(arrayList222);
                                            boolean z3322 = z30;
                                            arrayList5 = arrayList222;
                                            arrayList2 = arrayList8;
                                            i27 = 1;
                                            a0.h hVar922 = hVar5;
                                            hVar = hVar922;
                                            arrayList3 = arrayList9;
                                            peer = peer72;
                                            z23 = z3322;
                                            ulVar = new ul(this, tL_messages_forwardMessages, arrayList11, new ey(i10, j10, hVar922, arrayList9, arrayList11, jjVar3, this, peer72, tL_messages_forwardMessages, i10 != 2147483646, z3322), 4);
                                            qzVar = this;
                                            if (rh.e6.y(qzVar.currentAccount, false).c(tL_messages_forwardMessages, arrayList11, ulVar)) {
                                            }
                                            if (i28 != arrayList10.size() - 1) {
                                            }
                                            z31 = z24;
                                            i13 = i28;
                                            arrayList18 = arrayList4;
                                            hVar8 = hVar;
                                            arrayList17 = arrayList3;
                                        } else if (i29 == 0) {
                                            i30 = w3.P(19, L0) ? 17 : 18;
                                            arrayList2 = arrayList19;
                                            j16 = e;
                                            j17 = j15;
                                            peer = y12;
                                            str3 = str2;
                                            i29 = i30;
                                            i13 = i14;
                                            z23 = z30;
                                            arrayList5 = arrayList20;
                                            inputPeer = inputPeer2;
                                            chat = L0;
                                            hVar2 = hVar6;
                                        }
                                        arrayList2 = arrayList19;
                                        j16 = e;
                                        j17 = j15;
                                        peer = y12;
                                        str3 = str2;
                                        hVar = hVar8;
                                        i13 = i14;
                                        z23 = z30;
                                        arrayList3 = arrayList17;
                                        arrayList4 = arrayList18;
                                        arrayList5 = arrayList20;
                                        inputPeer = inputPeer2;
                                        chat = L0;
                                        hVar2 = hVar6;
                                        arrayList18 = arrayList4;
                                        hVar8 = hVar;
                                        arrayList17 = arrayList3;
                                    }
                                }
                            }
                        } else {
                            if (i29 == 0) {
                                i21 = w3.P(8, L0) ? 4 : i27;
                                arrayList2 = arrayList19;
                                j16 = e;
                                j17 = j15;
                                peer = y12;
                                str3 = str2;
                                i29 = i21;
                                i13 = i14;
                                z23 = z30;
                                arrayList5 = arrayList20;
                                inputPeer = inputPeer2;
                                chat = L0;
                                hVar2 = hVar6;
                            }
                            arrayList2 = arrayList19;
                            j16 = e;
                            j17 = j15;
                            peer = y12;
                            str3 = str2;
                            hVar = hVar8;
                            i13 = i14;
                            z23 = z30;
                            arrayList3 = arrayList17;
                            arrayList4 = arrayList18;
                            arrayList5 = arrayList20;
                            inputPeer = inputPeer2;
                            chat = L0;
                            hVar2 = hVar6;
                            arrayList18 = arrayList4;
                            hVar8 = hVar;
                            arrayList17 = arrayList3;
                        }
                    }
                }
                i15 = i27;
                if (z20) {
                }
                if (!z21) {
                }
                if (o10) {
                }
                if (!z18) {
                }
                if (z15) {
                }
                int i302 = 21;
                if (z15) {
                }
                if (v) {
                }
                if (s10) {
                }
                if (!z17) {
                }
                tL_message = new TLRPC.TL_message();
                if (z10) {
                }
                if (jj.B0(jjVar3.k) == e) {
                }
                arrayList6 = arrayList18;
                hVar3 = hVar8;
                i16 = i26;
                if (jj.l3(jjVar3.k)) {
                }
                arrayList7 = arrayList19;
                if (j21 == e) {
                }
                if (jjVar3.b5()) {
                    messageFwdHeader2.from_id = (TLRPC.Peer) TLObject.deepCopy(jjVar3.k.peer_id, new e9(16));
                    o11 = o5.o(jjVar3.k.from_id);
                    if (o11 > 0) {
                    }
                }
                HashMap<String, String> hashMap2 = new HashMap<>();
                tL_message.params = hashMap2;
                hashMap2.put("fwd_id", "" + jjVar3.f1());
                tL_message.params.put("fwd_peer", "" + jj.B0(jjVar3.k));
                if (!jjVar3.k.restriction_reason.isEmpty()) {
                }
                if (z16) {
                }
                messageMedia = jjVar3.k.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaWidget) {
                }
                TLRPC.Message message82 = jjVar3.k;
                tL_message.invert_media = message82.invert_media;
                if (tL_message.media != null) {
                }
                j18 = message82.via_bot_id;
                if (j18 != 0) {
                }
                if (j15 != 0) {
                }
                if (z11) {
                }
                tL_message.message = jjVar3.k.message;
                richMessage = jjVar3.k.rich_message;
                if (richMessage != null) {
                }
                if (tL_message.message == null) {
                }
                tL_message.fwd_msg_id = jjVar3.f1();
                TLRPC.Message message92 = jjVar3.k;
                tL_message.attachPath = message92.attachPath;
                tL_message.entities = message92.entities;
                replyMarkup = message92.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                }
                if (!tL_message.entities.isEmpty()) {
                }
                if (tL_message.attachPath == null) {
                }
                int j2422 = getUserConfig().j();
                tL_message.id = j2422;
                tL_message.local_id = j2422;
                tL_message.out = true;
                j19 = jjVar3.k.grouped_id;
                if (j19 != 0) {
                }
                if (y12.channel_id == 0) {
                }
                j20 = j10;
                M = w3.M(L0, getMessagesController().M0(-j20), true);
                if (M == e) {
                }
                if (tL_message.random_id == 0) {
                }
                ArrayList<Long> arrayList2122 = arrayList6;
                arrayList2122.add(Long.valueOf(tL_message.random_id));
                hVar4 = hVar3;
                hVar4.k(tL_message, tL_message.random_id);
                if (jj.c3(jjVar3.k)) {
                }
                tL_message.date = i10 != 0 ? i10 : getConnectionsManager().getCurrentTime();
                TLRPC.InputPeer inputPeer322 = inputPeer2;
                z25 = inputPeer322 instanceof TLRPC.TL_inputPeerChannel;
                if (z25) {
                }
                hVar5 = hVar4;
                message = jjVar3.k;
                j16 = e;
                if ((message.flags & 1024) != 0) {
                }
                tL_message.unread = true;
                tL_message.dialog_id = j20;
                tL_message.peer_id = y12;
                if (!jj.R4(tL_message)) {
                }
                if (z25) {
                }
                tL_message.media_unread = true;
                if (jjVar == null) {
                }
                i17 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                if (i17 > 0) {
                }
                if (j12 != 0) {
                }
                if (ojVar != null) {
                }
                chat = L0;
                TLRPC.Peer peer722 = y12;
                str3 = str2;
                jj jjVar422 = new jj(this.currentAccount, tL_message, true, true);
                jjVar422.p1 = i10 != 0;
                jjVar422.k.send_state = 1;
                jjVar422.V1 = true;
                ArrayList arrayList2222 = arrayList20;
                arrayList2222.add(jjVar422);
                arrayList9 = arrayList17;
                arrayList9.add(tL_message);
                hVar2 = hVar6;
                rh.e6.y(this.currentAccount, false).d(jjVar422);
                if (jjVar3.C != null) {
                }
                arrayList10 = arrayList;
                f0(tL_message, i10 != 0);
                if (v2.a) {
                }
                if (jjVar == null) {
                }
                if (arrayList9.size() == 100) {
                }
                getMessagesStorage().i1(0, i10 == 0 ? 1 : 0, 0L, new ArrayList(arrayList9), false);
                getMessagesController().i5(i10 == 0 ? 1 : 0, j20, arrayList2222);
                getNotificationCenter().k(zs.s, new Object[0]);
                getUserConfig().v(false);
                tL_messages_forwardMessages = new TLRPC.TL_messages_forwardMessages();
                tL_messages_forwardMessages.to_peer = inputPeer322;
                tL_messages_forwardMessages.silent = z12 || m5.w("silent_", j20, vp.r1(this.currentAccount).e7, false);
                if (jjVar != null) {
                }
                if (i10 == 0) {
                }
                if (jjVar3.k.peer_id instanceof TLRPC.TL_peerChannel) {
                }
                tL_messages_forwardMessages.random_id = arrayList2122;
                tL_messages_forwardMessages.id = arrayList8;
                tL_messages_forwardMessages.drop_author = z10;
                tL_messages_forwardMessages.drop_media_captions = z11;
                tL_messages_forwardMessages.with_my_score = arrayList10.size() != 1 && ((jj) arrayList10.get(0)).k.with_my_score;
                tL_messages_forwardMessages.from_ephemeral = z24;
                if (i12 >= 0) {
                }
                if (i18 <= 0) {
                }
                if (ojVar != null) {
                }
                a(tL_messages_forwardMessages, j12);
                arrayList11 = new ArrayList(arrayList2222);
                boolean z33222 = z30;
                arrayList5 = arrayList2222;
                arrayList2 = arrayList8;
                i27 = 1;
                a0.h hVar9222 = hVar5;
                hVar = hVar9222;
                arrayList3 = arrayList9;
                peer = peer722;
                z23 = z33222;
                ulVar = new ul(this, tL_messages_forwardMessages, arrayList11, new ey(i10, j10, hVar9222, arrayList9, arrayList11, jjVar3, this, peer722, tL_messages_forwardMessages, i10 != 2147483646, z33222), 4);
                qzVar = this;
                if (rh.e6.y(qzVar.currentAccount, false).c(tL_messages_forwardMessages, arrayList11, ulVar)) {
                }
                if (i28 != arrayList10.size() - 1) {
                }
                z31 = z24;
                i13 = i28;
                arrayList18 = arrayList4;
                hVar8 = hVar;
                arrayList17 = arrayList3;
            }
            i28 = i13 + 1;
            arrayList12 = arrayList;
            hVar6 = hVar2;
            L0 = chat;
            inputPeer2 = inputPeer;
            arrayList20 = arrayList5;
            e = j16;
            y12 = peer;
            z30 = z23;
            j15 = j17;
            arrayList19 = arrayList2;
            str2 = str3;
            i26 = 0;
        }
        return i29;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void r0(org.telegram.messenger.oz r109) {
        /*
            Method dump skipped, instructions count: 11618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qz.r0(org.telegram.messenger.oz):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s0(jj jjVar, ArrayList arrayList, sg.o0 o0Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.yi yiVar) {
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji;
        if (jjVar == null || k2Var == null) {
            return;
        }
        TLRPC.TL_messages_sendReaction tL_messages_sendReaction = new TLRPC.TL_messages_sendReaction();
        TLRPC.Message message = jjVar.k;
        if (!message.isThreadMessage || message.fwd_from == null) {
            tL_messages_sendReaction.peer = getMessagesController().i1(jj.B0(jjVar.k));
            tL_messages_sendReaction.msg_id = jjVar.f1();
        } else {
            tL_messages_sendReaction.peer = getMessagesController().i1(jjVar.Z0());
            tL_messages_sendReaction.msg_id = jjVar.k.fwd_from.saved_from_msg_id;
        }
        tL_messages_sendReaction.add_to_recent = z11;
        if (z11 && o0Var != null) {
            ArrayList arrayList2 = ui.b0(this.currentAccount).C1;
            if (o0Var.f != null) {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                tL_reactionEmoji.emoticon = o0Var.f;
                tL_reactionCustomEmoji = tL_reactionEmoji;
            } else {
                TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji2 = new TLRPC.TL_reactionCustomEmoji();
                tL_reactionCustomEmoji2.document_id = o0Var.g;
                tL_reactionCustomEmoji = tL_reactionCustomEmoji2;
            }
            arrayList2.add(0, tL_reactionCustomEmoji);
        }
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                sg.o0 o0Var2 = (sg.o0) arrayList.get(i10);
                if (o0Var2.g != 0) {
                    TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji3 = new TLRPC.TL_reactionCustomEmoji();
                    tL_reactionCustomEmoji3.document_id = o0Var2.g;
                    tL_messages_sendReaction.reaction.add(tL_reactionCustomEmoji3);
                    tL_messages_sendReaction.flags |= 1;
                } else if (o0Var2.f != null) {
                    TLRPC.TL_reactionEmoji tL_reactionEmoji2 = new TLRPC.TL_reactionEmoji();
                    tL_reactionEmoji2.emoticon = o0Var2.f;
                    tL_messages_sendReaction.reaction.add(tL_reactionEmoji2);
                    tL_messages_sendReaction.flags |= 1;
                }
            }
        }
        if (z10) {
            tL_messages_sendReaction.flags |= 2;
            tL_messages_sendReaction.big = true;
        }
        getConnectionsManager().sendRequest(tL_messages_sendReaction, new v4(10, this, yiVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x06e3, code lost:
    
        if (r7 == 19) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x05a9, code lost:
    
        if (r10.t == false) goto L264;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x06e8 A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:7:0x0027, B:9:0x0031, B:11:0x0043, B:17:0x005a, B:20:0x0064, B:23:0x0069, B:25:0x006d, B:26:0x009a, B:29:0x00a0, B:31:0x00a6, B:33:0x00b0, B:34:0x02c9, B:36:0x02cd, B:37:0x02d1, B:42:0x02e9, B:47:0x02f2, B:49:0x02f6, B:51:0x0304, B:53:0x0308, B:54:0x031d, B:56:0x0321, B:58:0x0327, B:59:0x0311, B:61:0x0317, B:62:0x0331, B:64:0x0335, B:65:0x037c, B:66:0x037f, B:68:0x03b9, B:69:0x03c2, B:71:0x03cb, B:73:0x03d3, B:76:0x03d8, B:77:0x03df, B:80:0x03e7, B:82:0x0412, B:84:0x041a, B:92:0x043e, B:95:0x06d9, B:97:0x06dd, B:103:0x06e8, B:105:0x0703, B:116:0x07e9, B:121:0x080c, B:128:0x081a, B:133:0x0832, B:138:0x0839, B:158:0x0878, B:165:0x0887, B:170:0x089f, B:174:0x08a7, B:184:0x08bd, B:186:0x0708, B:188:0x070e, B:190:0x0735, B:192:0x0747, B:193:0x0757, B:195:0x075b, B:197:0x076b, B:198:0x0773, B:200:0x077a, B:201:0x0785, B:203:0x0789, B:205:0x07a1, B:207:0x07cd, B:208:0x07a9, B:210:0x07be, B:212:0x07c4, B:214:0x07d3, B:215:0x0750, B:217:0x0754, B:218:0x0729, B:221:0x044e, B:223:0x0452, B:225:0x0456, B:228:0x0468, B:230:0x046c, B:233:0x045c, B:235:0x0460, B:238:0x048f, B:240:0x0498, B:242:0x04a0, B:244:0x04b1, B:246:0x04ca, B:247:0x04da, B:250:0x0508, B:252:0x051e, B:254:0x0524, B:256:0x052c, B:259:0x052f, B:260:0x04e5, B:262:0x04ff, B:263:0x0504, B:267:0x0551, B:269:0x055a, B:271:0x0562, B:273:0x0573, B:275:0x0588, B:276:0x0593, B:279:0x05a5, B:282:0x05b3, B:284:0x05c0, B:287:0x05ee, B:289:0x0606, B:291:0x0613, B:292:0x0617, B:294:0x061f, B:296:0x0637, B:298:0x062e, B:300:0x0632, B:301:0x05cb, B:303:0x05e5, B:304:0x05ea, B:309:0x0649, B:312:0x0685, B:315:0x069b, B:317:0x069f, B:319:0x06ac, B:320:0x06b0, B:321:0x0663, B:323:0x067d, B:324:0x0682, B:327:0x06be, B:329:0x06c8, B:340:0x0344, B:342:0x035f, B:344:0x0365, B:345:0x036e, B:347:0x0376, B:350:0x02de, B:352:0x02e6, B:354:0x0075, B:356:0x0079, B:361:0x0089, B:363:0x008c, B:368:0x00c2, B:370:0x00d6, B:371:0x00db, B:374:0x0107, B:376:0x012d, B:378:0x0140, B:380:0x0146, B:382:0x014c, B:385:0x02b8, B:386:0x0152, B:388:0x0188, B:394:0x01aa, B:395:0x01b1, B:397:0x01ba, B:399:0x01cc, B:401:0x01f0, B:407:0x0203, B:409:0x0216, B:411:0x021c, B:413:0x0222, B:415:0x0225, B:417:0x0249, B:423:0x0269, B:424:0x0270, B:426:0x0276, B:428:0x0288, B:430:0x02ac), top: B:6:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0708 A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:7:0x0027, B:9:0x0031, B:11:0x0043, B:17:0x005a, B:20:0x0064, B:23:0x0069, B:25:0x006d, B:26:0x009a, B:29:0x00a0, B:31:0x00a6, B:33:0x00b0, B:34:0x02c9, B:36:0x02cd, B:37:0x02d1, B:42:0x02e9, B:47:0x02f2, B:49:0x02f6, B:51:0x0304, B:53:0x0308, B:54:0x031d, B:56:0x0321, B:58:0x0327, B:59:0x0311, B:61:0x0317, B:62:0x0331, B:64:0x0335, B:65:0x037c, B:66:0x037f, B:68:0x03b9, B:69:0x03c2, B:71:0x03cb, B:73:0x03d3, B:76:0x03d8, B:77:0x03df, B:80:0x03e7, B:82:0x0412, B:84:0x041a, B:92:0x043e, B:95:0x06d9, B:97:0x06dd, B:103:0x06e8, B:105:0x0703, B:116:0x07e9, B:121:0x080c, B:128:0x081a, B:133:0x0832, B:138:0x0839, B:158:0x0878, B:165:0x0887, B:170:0x089f, B:174:0x08a7, B:184:0x08bd, B:186:0x0708, B:188:0x070e, B:190:0x0735, B:192:0x0747, B:193:0x0757, B:195:0x075b, B:197:0x076b, B:198:0x0773, B:200:0x077a, B:201:0x0785, B:203:0x0789, B:205:0x07a1, B:207:0x07cd, B:208:0x07a9, B:210:0x07be, B:212:0x07c4, B:214:0x07d3, B:215:0x0750, B:217:0x0754, B:218:0x0729, B:221:0x044e, B:223:0x0452, B:225:0x0456, B:228:0x0468, B:230:0x046c, B:233:0x045c, B:235:0x0460, B:238:0x048f, B:240:0x0498, B:242:0x04a0, B:244:0x04b1, B:246:0x04ca, B:247:0x04da, B:250:0x0508, B:252:0x051e, B:254:0x0524, B:256:0x052c, B:259:0x052f, B:260:0x04e5, B:262:0x04ff, B:263:0x0504, B:267:0x0551, B:269:0x055a, B:271:0x0562, B:273:0x0573, B:275:0x0588, B:276:0x0593, B:279:0x05a5, B:282:0x05b3, B:284:0x05c0, B:287:0x05ee, B:289:0x0606, B:291:0x0613, B:292:0x0617, B:294:0x061f, B:296:0x0637, B:298:0x062e, B:300:0x0632, B:301:0x05cb, B:303:0x05e5, B:304:0x05ea, B:309:0x0649, B:312:0x0685, B:315:0x069b, B:317:0x069f, B:319:0x06ac, B:320:0x06b0, B:321:0x0663, B:323:0x067d, B:324:0x0682, B:327:0x06be, B:329:0x06c8, B:340:0x0344, B:342:0x035f, B:344:0x0365, B:345:0x036e, B:347:0x0376, B:350:0x02de, B:352:0x02e6, B:354:0x0075, B:356:0x0079, B:361:0x0089, B:363:0x008c, B:368:0x00c2, B:370:0x00d6, B:371:0x00db, B:374:0x0107, B:376:0x012d, B:378:0x0140, B:380:0x0146, B:382:0x014c, B:385:0x02b8, B:386:0x0152, B:388:0x0188, B:394:0x01aa, B:395:0x01b1, B:397:0x01ba, B:399:0x01cc, B:401:0x01f0, B:407:0x0203, B:409:0x0216, B:411:0x021c, B:413:0x0222, B:415:0x0225, B:417:0x0249, B:423:0x0269, B:424:0x0270, B:426:0x0276, B:428:0x0288, B:430:0x02ac), top: B:6:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x01aa A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:7:0x0027, B:9:0x0031, B:11:0x0043, B:17:0x005a, B:20:0x0064, B:23:0x0069, B:25:0x006d, B:26:0x009a, B:29:0x00a0, B:31:0x00a6, B:33:0x00b0, B:34:0x02c9, B:36:0x02cd, B:37:0x02d1, B:42:0x02e9, B:47:0x02f2, B:49:0x02f6, B:51:0x0304, B:53:0x0308, B:54:0x031d, B:56:0x0321, B:58:0x0327, B:59:0x0311, B:61:0x0317, B:62:0x0331, B:64:0x0335, B:65:0x037c, B:66:0x037f, B:68:0x03b9, B:69:0x03c2, B:71:0x03cb, B:73:0x03d3, B:76:0x03d8, B:77:0x03df, B:80:0x03e7, B:82:0x0412, B:84:0x041a, B:92:0x043e, B:95:0x06d9, B:97:0x06dd, B:103:0x06e8, B:105:0x0703, B:116:0x07e9, B:121:0x080c, B:128:0x081a, B:133:0x0832, B:138:0x0839, B:158:0x0878, B:165:0x0887, B:170:0x089f, B:174:0x08a7, B:184:0x08bd, B:186:0x0708, B:188:0x070e, B:190:0x0735, B:192:0x0747, B:193:0x0757, B:195:0x075b, B:197:0x076b, B:198:0x0773, B:200:0x077a, B:201:0x0785, B:203:0x0789, B:205:0x07a1, B:207:0x07cd, B:208:0x07a9, B:210:0x07be, B:212:0x07c4, B:214:0x07d3, B:215:0x0750, B:217:0x0754, B:218:0x0729, B:221:0x044e, B:223:0x0452, B:225:0x0456, B:228:0x0468, B:230:0x046c, B:233:0x045c, B:235:0x0460, B:238:0x048f, B:240:0x0498, B:242:0x04a0, B:244:0x04b1, B:246:0x04ca, B:247:0x04da, B:250:0x0508, B:252:0x051e, B:254:0x0524, B:256:0x052c, B:259:0x052f, B:260:0x04e5, B:262:0x04ff, B:263:0x0504, B:267:0x0551, B:269:0x055a, B:271:0x0562, B:273:0x0573, B:275:0x0588, B:276:0x0593, B:279:0x05a5, B:282:0x05b3, B:284:0x05c0, B:287:0x05ee, B:289:0x0606, B:291:0x0613, B:292:0x0617, B:294:0x061f, B:296:0x0637, B:298:0x062e, B:300:0x0632, B:301:0x05cb, B:303:0x05e5, B:304:0x05ea, B:309:0x0649, B:312:0x0685, B:315:0x069b, B:317:0x069f, B:319:0x06ac, B:320:0x06b0, B:321:0x0663, B:323:0x067d, B:324:0x0682, B:327:0x06be, B:329:0x06c8, B:340:0x0344, B:342:0x035f, B:344:0x0365, B:345:0x036e, B:347:0x0376, B:350:0x02de, B:352:0x02e6, B:354:0x0075, B:356:0x0079, B:361:0x0089, B:363:0x008c, B:368:0x00c2, B:370:0x00d6, B:371:0x00db, B:374:0x0107, B:376:0x012d, B:378:0x0140, B:380:0x0146, B:382:0x014c, B:385:0x02b8, B:386:0x0152, B:388:0x0188, B:394:0x01aa, B:395:0x01b1, B:397:0x01ba, B:399:0x01cc, B:401:0x01f0, B:407:0x0203, B:409:0x0216, B:411:0x021c, B:413:0x0222, B:415:0x0225, B:417:0x0249, B:423:0x0269, B:424:0x0270, B:426:0x0276, B:428:0x0288, B:430:0x02ac), top: B:6:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x01ba A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:7:0x0027, B:9:0x0031, B:11:0x0043, B:17:0x005a, B:20:0x0064, B:23:0x0069, B:25:0x006d, B:26:0x009a, B:29:0x00a0, B:31:0x00a6, B:33:0x00b0, B:34:0x02c9, B:36:0x02cd, B:37:0x02d1, B:42:0x02e9, B:47:0x02f2, B:49:0x02f6, B:51:0x0304, B:53:0x0308, B:54:0x031d, B:56:0x0321, B:58:0x0327, B:59:0x0311, B:61:0x0317, B:62:0x0331, B:64:0x0335, B:65:0x037c, B:66:0x037f, B:68:0x03b9, B:69:0x03c2, B:71:0x03cb, B:73:0x03d3, B:76:0x03d8, B:77:0x03df, B:80:0x03e7, B:82:0x0412, B:84:0x041a, B:92:0x043e, B:95:0x06d9, B:97:0x06dd, B:103:0x06e8, B:105:0x0703, B:116:0x07e9, B:121:0x080c, B:128:0x081a, B:133:0x0832, B:138:0x0839, B:158:0x0878, B:165:0x0887, B:170:0x089f, B:174:0x08a7, B:184:0x08bd, B:186:0x0708, B:188:0x070e, B:190:0x0735, B:192:0x0747, B:193:0x0757, B:195:0x075b, B:197:0x076b, B:198:0x0773, B:200:0x077a, B:201:0x0785, B:203:0x0789, B:205:0x07a1, B:207:0x07cd, B:208:0x07a9, B:210:0x07be, B:212:0x07c4, B:214:0x07d3, B:215:0x0750, B:217:0x0754, B:218:0x0729, B:221:0x044e, B:223:0x0452, B:225:0x0456, B:228:0x0468, B:230:0x046c, B:233:0x045c, B:235:0x0460, B:238:0x048f, B:240:0x0498, B:242:0x04a0, B:244:0x04b1, B:246:0x04ca, B:247:0x04da, B:250:0x0508, B:252:0x051e, B:254:0x0524, B:256:0x052c, B:259:0x052f, B:260:0x04e5, B:262:0x04ff, B:263:0x0504, B:267:0x0551, B:269:0x055a, B:271:0x0562, B:273:0x0573, B:275:0x0588, B:276:0x0593, B:279:0x05a5, B:282:0x05b3, B:284:0x05c0, B:287:0x05ee, B:289:0x0606, B:291:0x0613, B:292:0x0617, B:294:0x061f, B:296:0x0637, B:298:0x062e, B:300:0x0632, B:301:0x05cb, B:303:0x05e5, B:304:0x05ea, B:309:0x0649, B:312:0x0685, B:315:0x069b, B:317:0x069f, B:319:0x06ac, B:320:0x06b0, B:321:0x0663, B:323:0x067d, B:324:0x0682, B:327:0x06be, B:329:0x06c8, B:340:0x0344, B:342:0x035f, B:344:0x0365, B:345:0x036e, B:347:0x0376, B:350:0x02de, B:352:0x02e6, B:354:0x0075, B:356:0x0079, B:361:0x0089, B:363:0x008c, B:368:0x00c2, B:370:0x00d6, B:371:0x00db, B:374:0x0107, B:376:0x012d, B:378:0x0140, B:380:0x0146, B:382:0x014c, B:385:0x02b8, B:386:0x0152, B:388:0x0188, B:394:0x01aa, B:395:0x01b1, B:397:0x01ba, B:399:0x01cc, B:401:0x01f0, B:407:0x0203, B:409:0x0216, B:411:0x021c, B:413:0x0222, B:415:0x0225, B:417:0x0249, B:423:0x0269, B:424:0x0270, B:426:0x0276, B:428:0x0288, B:430:0x02ac), top: B:6:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0269 A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:7:0x0027, B:9:0x0031, B:11:0x0043, B:17:0x005a, B:20:0x0064, B:23:0x0069, B:25:0x006d, B:26:0x009a, B:29:0x00a0, B:31:0x00a6, B:33:0x00b0, B:34:0x02c9, B:36:0x02cd, B:37:0x02d1, B:42:0x02e9, B:47:0x02f2, B:49:0x02f6, B:51:0x0304, B:53:0x0308, B:54:0x031d, B:56:0x0321, B:58:0x0327, B:59:0x0311, B:61:0x0317, B:62:0x0331, B:64:0x0335, B:65:0x037c, B:66:0x037f, B:68:0x03b9, B:69:0x03c2, B:71:0x03cb, B:73:0x03d3, B:76:0x03d8, B:77:0x03df, B:80:0x03e7, B:82:0x0412, B:84:0x041a, B:92:0x043e, B:95:0x06d9, B:97:0x06dd, B:103:0x06e8, B:105:0x0703, B:116:0x07e9, B:121:0x080c, B:128:0x081a, B:133:0x0832, B:138:0x0839, B:158:0x0878, B:165:0x0887, B:170:0x089f, B:174:0x08a7, B:184:0x08bd, B:186:0x0708, B:188:0x070e, B:190:0x0735, B:192:0x0747, B:193:0x0757, B:195:0x075b, B:197:0x076b, B:198:0x0773, B:200:0x077a, B:201:0x0785, B:203:0x0789, B:205:0x07a1, B:207:0x07cd, B:208:0x07a9, B:210:0x07be, B:212:0x07c4, B:214:0x07d3, B:215:0x0750, B:217:0x0754, B:218:0x0729, B:221:0x044e, B:223:0x0452, B:225:0x0456, B:228:0x0468, B:230:0x046c, B:233:0x045c, B:235:0x0460, B:238:0x048f, B:240:0x0498, B:242:0x04a0, B:244:0x04b1, B:246:0x04ca, B:247:0x04da, B:250:0x0508, B:252:0x051e, B:254:0x0524, B:256:0x052c, B:259:0x052f, B:260:0x04e5, B:262:0x04ff, B:263:0x0504, B:267:0x0551, B:269:0x055a, B:271:0x0562, B:273:0x0573, B:275:0x0588, B:276:0x0593, B:279:0x05a5, B:282:0x05b3, B:284:0x05c0, B:287:0x05ee, B:289:0x0606, B:291:0x0613, B:292:0x0617, B:294:0x061f, B:296:0x0637, B:298:0x062e, B:300:0x0632, B:301:0x05cb, B:303:0x05e5, B:304:0x05ea, B:309:0x0649, B:312:0x0685, B:315:0x069b, B:317:0x069f, B:319:0x06ac, B:320:0x06b0, B:321:0x0663, B:323:0x067d, B:324:0x0682, B:327:0x06be, B:329:0x06c8, B:340:0x0344, B:342:0x035f, B:344:0x0365, B:345:0x036e, B:347:0x0376, B:350:0x02de, B:352:0x02e6, B:354:0x0075, B:356:0x0079, B:361:0x0089, B:363:0x008c, B:368:0x00c2, B:370:0x00d6, B:371:0x00db, B:374:0x0107, B:376:0x012d, B:378:0x0140, B:380:0x0146, B:382:0x014c, B:385:0x02b8, B:386:0x0152, B:388:0x0188, B:394:0x01aa, B:395:0x01b1, B:397:0x01ba, B:399:0x01cc, B:401:0x01f0, B:407:0x0203, B:409:0x0216, B:411:0x021c, B:413:0x0222, B:415:0x0225, B:417:0x0249, B:423:0x0269, B:424:0x0270, B:426:0x0276, B:428:0x0288, B:430:0x02ac), top: B:6:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0276 A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:7:0x0027, B:9:0x0031, B:11:0x0043, B:17:0x005a, B:20:0x0064, B:23:0x0069, B:25:0x006d, B:26:0x009a, B:29:0x00a0, B:31:0x00a6, B:33:0x00b0, B:34:0x02c9, B:36:0x02cd, B:37:0x02d1, B:42:0x02e9, B:47:0x02f2, B:49:0x02f6, B:51:0x0304, B:53:0x0308, B:54:0x031d, B:56:0x0321, B:58:0x0327, B:59:0x0311, B:61:0x0317, B:62:0x0331, B:64:0x0335, B:65:0x037c, B:66:0x037f, B:68:0x03b9, B:69:0x03c2, B:71:0x03cb, B:73:0x03d3, B:76:0x03d8, B:77:0x03df, B:80:0x03e7, B:82:0x0412, B:84:0x041a, B:92:0x043e, B:95:0x06d9, B:97:0x06dd, B:103:0x06e8, B:105:0x0703, B:116:0x07e9, B:121:0x080c, B:128:0x081a, B:133:0x0832, B:138:0x0839, B:158:0x0878, B:165:0x0887, B:170:0x089f, B:174:0x08a7, B:184:0x08bd, B:186:0x0708, B:188:0x070e, B:190:0x0735, B:192:0x0747, B:193:0x0757, B:195:0x075b, B:197:0x076b, B:198:0x0773, B:200:0x077a, B:201:0x0785, B:203:0x0789, B:205:0x07a1, B:207:0x07cd, B:208:0x07a9, B:210:0x07be, B:212:0x07c4, B:214:0x07d3, B:215:0x0750, B:217:0x0754, B:218:0x0729, B:221:0x044e, B:223:0x0452, B:225:0x0456, B:228:0x0468, B:230:0x046c, B:233:0x045c, B:235:0x0460, B:238:0x048f, B:240:0x0498, B:242:0x04a0, B:244:0x04b1, B:246:0x04ca, B:247:0x04da, B:250:0x0508, B:252:0x051e, B:254:0x0524, B:256:0x052c, B:259:0x052f, B:260:0x04e5, B:262:0x04ff, B:263:0x0504, B:267:0x0551, B:269:0x055a, B:271:0x0562, B:273:0x0573, B:275:0x0588, B:276:0x0593, B:279:0x05a5, B:282:0x05b3, B:284:0x05c0, B:287:0x05ee, B:289:0x0606, B:291:0x0613, B:292:0x0617, B:294:0x061f, B:296:0x0637, B:298:0x062e, B:300:0x0632, B:301:0x05cb, B:303:0x05e5, B:304:0x05ea, B:309:0x0649, B:312:0x0685, B:315:0x069b, B:317:0x069f, B:319:0x06ac, B:320:0x06b0, B:321:0x0663, B:323:0x067d, B:324:0x0682, B:327:0x06be, B:329:0x06c8, B:340:0x0344, B:342:0x035f, B:344:0x0365, B:345:0x036e, B:347:0x0376, B:350:0x02de, B:352:0x02e6, B:354:0x0075, B:356:0x0079, B:361:0x0089, B:363:0x008c, B:368:0x00c2, B:370:0x00d6, B:371:0x00db, B:374:0x0107, B:376:0x012d, B:378:0x0140, B:380:0x0146, B:382:0x014c, B:385:0x02b8, B:386:0x0152, B:388:0x0188, B:394:0x01aa, B:395:0x01b1, B:397:0x01ba, B:399:0x01cc, B:401:0x01f0, B:407:0x0203, B:409:0x0216, B:411:0x021c, B:413:0x0222, B:415:0x0225, B:417:0x0249, B:423:0x0269, B:424:0x0270, B:426:0x0276, B:428:0x0288, B:430:0x02ac), top: B:6:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03b9 A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:7:0x0027, B:9:0x0031, B:11:0x0043, B:17:0x005a, B:20:0x0064, B:23:0x0069, B:25:0x006d, B:26:0x009a, B:29:0x00a0, B:31:0x00a6, B:33:0x00b0, B:34:0x02c9, B:36:0x02cd, B:37:0x02d1, B:42:0x02e9, B:47:0x02f2, B:49:0x02f6, B:51:0x0304, B:53:0x0308, B:54:0x031d, B:56:0x0321, B:58:0x0327, B:59:0x0311, B:61:0x0317, B:62:0x0331, B:64:0x0335, B:65:0x037c, B:66:0x037f, B:68:0x03b9, B:69:0x03c2, B:71:0x03cb, B:73:0x03d3, B:76:0x03d8, B:77:0x03df, B:80:0x03e7, B:82:0x0412, B:84:0x041a, B:92:0x043e, B:95:0x06d9, B:97:0x06dd, B:103:0x06e8, B:105:0x0703, B:116:0x07e9, B:121:0x080c, B:128:0x081a, B:133:0x0832, B:138:0x0839, B:158:0x0878, B:165:0x0887, B:170:0x089f, B:174:0x08a7, B:184:0x08bd, B:186:0x0708, B:188:0x070e, B:190:0x0735, B:192:0x0747, B:193:0x0757, B:195:0x075b, B:197:0x076b, B:198:0x0773, B:200:0x077a, B:201:0x0785, B:203:0x0789, B:205:0x07a1, B:207:0x07cd, B:208:0x07a9, B:210:0x07be, B:212:0x07c4, B:214:0x07d3, B:215:0x0750, B:217:0x0754, B:218:0x0729, B:221:0x044e, B:223:0x0452, B:225:0x0456, B:228:0x0468, B:230:0x046c, B:233:0x045c, B:235:0x0460, B:238:0x048f, B:240:0x0498, B:242:0x04a0, B:244:0x04b1, B:246:0x04ca, B:247:0x04da, B:250:0x0508, B:252:0x051e, B:254:0x0524, B:256:0x052c, B:259:0x052f, B:260:0x04e5, B:262:0x04ff, B:263:0x0504, B:267:0x0551, B:269:0x055a, B:271:0x0562, B:273:0x0573, B:275:0x0588, B:276:0x0593, B:279:0x05a5, B:282:0x05b3, B:284:0x05c0, B:287:0x05ee, B:289:0x0606, B:291:0x0613, B:292:0x0617, B:294:0x061f, B:296:0x0637, B:298:0x062e, B:300:0x0632, B:301:0x05cb, B:303:0x05e5, B:304:0x05ea, B:309:0x0649, B:312:0x0685, B:315:0x069b, B:317:0x069f, B:319:0x06ac, B:320:0x06b0, B:321:0x0663, B:323:0x067d, B:324:0x0682, B:327:0x06be, B:329:0x06c8, B:340:0x0344, B:342:0x035f, B:344:0x0365, B:345:0x036e, B:347:0x0376, B:350:0x02de, B:352:0x02e6, B:354:0x0075, B:356:0x0079, B:361:0x0089, B:363:0x008c, B:368:0x00c2, B:370:0x00d6, B:371:0x00db, B:374:0x0107, B:376:0x012d, B:378:0x0140, B:380:0x0146, B:382:0x014c, B:385:0x02b8, B:386:0x0152, B:388:0x0188, B:394:0x01aa, B:395:0x01b1, B:397:0x01ba, B:399:0x01cc, B:401:0x01f0, B:407:0x0203, B:409:0x0216, B:411:0x021c, B:413:0x0222, B:415:0x0225, B:417:0x0249, B:423:0x0269, B:424:0x0270, B:426:0x0276, B:428:0x0288, B:430:0x02ac), top: B:6:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03cb A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:7:0x0027, B:9:0x0031, B:11:0x0043, B:17:0x005a, B:20:0x0064, B:23:0x0069, B:25:0x006d, B:26:0x009a, B:29:0x00a0, B:31:0x00a6, B:33:0x00b0, B:34:0x02c9, B:36:0x02cd, B:37:0x02d1, B:42:0x02e9, B:47:0x02f2, B:49:0x02f6, B:51:0x0304, B:53:0x0308, B:54:0x031d, B:56:0x0321, B:58:0x0327, B:59:0x0311, B:61:0x0317, B:62:0x0331, B:64:0x0335, B:65:0x037c, B:66:0x037f, B:68:0x03b9, B:69:0x03c2, B:71:0x03cb, B:73:0x03d3, B:76:0x03d8, B:77:0x03df, B:80:0x03e7, B:82:0x0412, B:84:0x041a, B:92:0x043e, B:95:0x06d9, B:97:0x06dd, B:103:0x06e8, B:105:0x0703, B:116:0x07e9, B:121:0x080c, B:128:0x081a, B:133:0x0832, B:138:0x0839, B:158:0x0878, B:165:0x0887, B:170:0x089f, B:174:0x08a7, B:184:0x08bd, B:186:0x0708, B:188:0x070e, B:190:0x0735, B:192:0x0747, B:193:0x0757, B:195:0x075b, B:197:0x076b, B:198:0x0773, B:200:0x077a, B:201:0x0785, B:203:0x0789, B:205:0x07a1, B:207:0x07cd, B:208:0x07a9, B:210:0x07be, B:212:0x07c4, B:214:0x07d3, B:215:0x0750, B:217:0x0754, B:218:0x0729, B:221:0x044e, B:223:0x0452, B:225:0x0456, B:228:0x0468, B:230:0x046c, B:233:0x045c, B:235:0x0460, B:238:0x048f, B:240:0x0498, B:242:0x04a0, B:244:0x04b1, B:246:0x04ca, B:247:0x04da, B:250:0x0508, B:252:0x051e, B:254:0x0524, B:256:0x052c, B:259:0x052f, B:260:0x04e5, B:262:0x04ff, B:263:0x0504, B:267:0x0551, B:269:0x055a, B:271:0x0562, B:273:0x0573, B:275:0x0588, B:276:0x0593, B:279:0x05a5, B:282:0x05b3, B:284:0x05c0, B:287:0x05ee, B:289:0x0606, B:291:0x0613, B:292:0x0617, B:294:0x061f, B:296:0x0637, B:298:0x062e, B:300:0x0632, B:301:0x05cb, B:303:0x05e5, B:304:0x05ea, B:309:0x0649, B:312:0x0685, B:315:0x069b, B:317:0x069f, B:319:0x06ac, B:320:0x06b0, B:321:0x0663, B:323:0x067d, B:324:0x0682, B:327:0x06be, B:329:0x06c8, B:340:0x0344, B:342:0x035f, B:344:0x0365, B:345:0x036e, B:347:0x0376, B:350:0x02de, B:352:0x02e6, B:354:0x0075, B:356:0x0079, B:361:0x0089, B:363:0x008c, B:368:0x00c2, B:370:0x00d6, B:371:0x00db, B:374:0x0107, B:376:0x012d, B:378:0x0140, B:380:0x0146, B:382:0x014c, B:385:0x02b8, B:386:0x0152, B:388:0x0188, B:394:0x01aa, B:395:0x01b1, B:397:0x01ba, B:399:0x01cc, B:401:0x01f0, B:407:0x0203, B:409:0x0216, B:411:0x021c, B:413:0x0222, B:415:0x0225, B:417:0x0249, B:423:0x0269, B:424:0x0270, B:426:0x0276, B:428:0x0288, B:430:0x02ac), top: B:6:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x043e A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:7:0x0027, B:9:0x0031, B:11:0x0043, B:17:0x005a, B:20:0x0064, B:23:0x0069, B:25:0x006d, B:26:0x009a, B:29:0x00a0, B:31:0x00a6, B:33:0x00b0, B:34:0x02c9, B:36:0x02cd, B:37:0x02d1, B:42:0x02e9, B:47:0x02f2, B:49:0x02f6, B:51:0x0304, B:53:0x0308, B:54:0x031d, B:56:0x0321, B:58:0x0327, B:59:0x0311, B:61:0x0317, B:62:0x0331, B:64:0x0335, B:65:0x037c, B:66:0x037f, B:68:0x03b9, B:69:0x03c2, B:71:0x03cb, B:73:0x03d3, B:76:0x03d8, B:77:0x03df, B:80:0x03e7, B:82:0x0412, B:84:0x041a, B:92:0x043e, B:95:0x06d9, B:97:0x06dd, B:103:0x06e8, B:105:0x0703, B:116:0x07e9, B:121:0x080c, B:128:0x081a, B:133:0x0832, B:138:0x0839, B:158:0x0878, B:165:0x0887, B:170:0x089f, B:174:0x08a7, B:184:0x08bd, B:186:0x0708, B:188:0x070e, B:190:0x0735, B:192:0x0747, B:193:0x0757, B:195:0x075b, B:197:0x076b, B:198:0x0773, B:200:0x077a, B:201:0x0785, B:203:0x0789, B:205:0x07a1, B:207:0x07cd, B:208:0x07a9, B:210:0x07be, B:212:0x07c4, B:214:0x07d3, B:215:0x0750, B:217:0x0754, B:218:0x0729, B:221:0x044e, B:223:0x0452, B:225:0x0456, B:228:0x0468, B:230:0x046c, B:233:0x045c, B:235:0x0460, B:238:0x048f, B:240:0x0498, B:242:0x04a0, B:244:0x04b1, B:246:0x04ca, B:247:0x04da, B:250:0x0508, B:252:0x051e, B:254:0x0524, B:256:0x052c, B:259:0x052f, B:260:0x04e5, B:262:0x04ff, B:263:0x0504, B:267:0x0551, B:269:0x055a, B:271:0x0562, B:273:0x0573, B:275:0x0588, B:276:0x0593, B:279:0x05a5, B:282:0x05b3, B:284:0x05c0, B:287:0x05ee, B:289:0x0606, B:291:0x0613, B:292:0x0617, B:294:0x061f, B:296:0x0637, B:298:0x062e, B:300:0x0632, B:301:0x05cb, B:303:0x05e5, B:304:0x05ea, B:309:0x0649, B:312:0x0685, B:315:0x069b, B:317:0x069f, B:319:0x06ac, B:320:0x06b0, B:321:0x0663, B:323:0x067d, B:324:0x0682, B:327:0x06be, B:329:0x06c8, B:340:0x0344, B:342:0x035f, B:344:0x0365, B:345:0x036e, B:347:0x0376, B:350:0x02de, B:352:0x02e6, B:354:0x0075, B:356:0x0079, B:361:0x0089, B:363:0x008c, B:368:0x00c2, B:370:0x00d6, B:371:0x00db, B:374:0x0107, B:376:0x012d, B:378:0x0140, B:380:0x0146, B:382:0x014c, B:385:0x02b8, B:386:0x0152, B:388:0x0188, B:394:0x01aa, B:395:0x01b1, B:397:0x01ba, B:399:0x01cc, B:401:0x01f0, B:407:0x0203, B:409:0x0216, B:411:0x021c, B:413:0x0222, B:415:0x0225, B:417:0x0249, B:423:0x0269, B:424:0x0270, B:426:0x0276, B:428:0x0288, B:430:0x02ac), top: B:6:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x06dd A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:7:0x0027, B:9:0x0031, B:11:0x0043, B:17:0x005a, B:20:0x0064, B:23:0x0069, B:25:0x006d, B:26:0x009a, B:29:0x00a0, B:31:0x00a6, B:33:0x00b0, B:34:0x02c9, B:36:0x02cd, B:37:0x02d1, B:42:0x02e9, B:47:0x02f2, B:49:0x02f6, B:51:0x0304, B:53:0x0308, B:54:0x031d, B:56:0x0321, B:58:0x0327, B:59:0x0311, B:61:0x0317, B:62:0x0331, B:64:0x0335, B:65:0x037c, B:66:0x037f, B:68:0x03b9, B:69:0x03c2, B:71:0x03cb, B:73:0x03d3, B:76:0x03d8, B:77:0x03df, B:80:0x03e7, B:82:0x0412, B:84:0x041a, B:92:0x043e, B:95:0x06d9, B:97:0x06dd, B:103:0x06e8, B:105:0x0703, B:116:0x07e9, B:121:0x080c, B:128:0x081a, B:133:0x0832, B:138:0x0839, B:158:0x0878, B:165:0x0887, B:170:0x089f, B:174:0x08a7, B:184:0x08bd, B:186:0x0708, B:188:0x070e, B:190:0x0735, B:192:0x0747, B:193:0x0757, B:195:0x075b, B:197:0x076b, B:198:0x0773, B:200:0x077a, B:201:0x0785, B:203:0x0789, B:205:0x07a1, B:207:0x07cd, B:208:0x07a9, B:210:0x07be, B:212:0x07c4, B:214:0x07d3, B:215:0x0750, B:217:0x0754, B:218:0x0729, B:221:0x044e, B:223:0x0452, B:225:0x0456, B:228:0x0468, B:230:0x046c, B:233:0x045c, B:235:0x0460, B:238:0x048f, B:240:0x0498, B:242:0x04a0, B:244:0x04b1, B:246:0x04ca, B:247:0x04da, B:250:0x0508, B:252:0x051e, B:254:0x0524, B:256:0x052c, B:259:0x052f, B:260:0x04e5, B:262:0x04ff, B:263:0x0504, B:267:0x0551, B:269:0x055a, B:271:0x0562, B:273:0x0573, B:275:0x0588, B:276:0x0593, B:279:0x05a5, B:282:0x05b3, B:284:0x05c0, B:287:0x05ee, B:289:0x0606, B:291:0x0613, B:292:0x0617, B:294:0x061f, B:296:0x0637, B:298:0x062e, B:300:0x0632, B:301:0x05cb, B:303:0x05e5, B:304:0x05ea, B:309:0x0649, B:312:0x0685, B:315:0x069b, B:317:0x069f, B:319:0x06ac, B:320:0x06b0, B:321:0x0663, B:323:0x067d, B:324:0x0682, B:327:0x06be, B:329:0x06c8, B:340:0x0344, B:342:0x035f, B:344:0x0365, B:345:0x036e, B:347:0x0376, B:350:0x02de, B:352:0x02e6, B:354:0x0075, B:356:0x0079, B:361:0x0089, B:363:0x008c, B:368:0x00c2, B:370:0x00d6, B:371:0x00db, B:374:0x0107, B:376:0x012d, B:378:0x0140, B:380:0x0146, B:382:0x014c, B:385:0x02b8, B:386:0x0152, B:388:0x0188, B:394:0x01aa, B:395:0x01b1, B:397:0x01ba, B:399:0x01cc, B:401:0x01f0, B:407:0x0203, B:409:0x0216, B:411:0x021c, B:413:0x0222, B:415:0x0225, B:417:0x0249, B:423:0x0269, B:424:0x0270, B:426:0x0276, B:428:0x0288, B:430:0x02ac), top: B:6:0x0027 }] */
    /* JADX WARN: Type inference failed for: r7v13, types: [org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_messages_editMessage] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_messages_addPollAnswer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(jj jjVar, TLRPC.TL_inputPollAnswer tL_inputPollAnswer, TLRPC.TL_photo tL_photo, x20 x20Var, TLRPC.TL_document tL_document, String str, TLRPC.PhotoSize photoSize, HashMap hashMap, boolean z10, boolean z11, Object obj) {
        Object obj2;
        boolean z12;
        char c10;
        Object obj3;
        HashMap hashMap2;
        x20 x20Var2;
        char c11;
        TLRPC.TL_document tL_document2;
        String str2;
        x20 x20Var3;
        String str3;
        char c12;
        char c13;
        long j10;
        HashMap hashMap3;
        TLRPC.InputMedia inputMedia;
        boolean z13;
        TLRPC.InputMedia inputMedia2;
        cz czVar;
        TLRPC.InputMedia inputMedia3;
        boolean z14;
        x20 x20Var4;
        TLRPC.InputMedia inputMedia4;
        boolean z15;
        boolean z16;
        boolean z17;
        TLRPC.InputMedia inputMedia5;
        String str4;
        TLRPC.InputMedia inputMedia6;
        String str5;
        boolean z18;
        TLRPC.TL_messages_editMessage tL_messages_editMessage;
        TLObject tLObject;
        TLRPC.InputMedia inputMedia7;
        boolean z19;
        TLRPC.TL_forumTopic tL_forumTopic;
        char c14;
        TLRPC.EncryptedChat Z0;
        TLRPC.TL_photo tL_photo2 = tL_photo;
        TLRPC.TL_document tL_document3 = tL_document;
        String str6 = str;
        if (jjVar == null) {
            return;
        }
        HashMap hashMap4 = hashMap == null ? new HashMap() : hashMap;
        TLRPC.Message message = jjVar.k;
        jjVar.o1 = false;
        try {
            long A0 = jjVar.A0();
            boolean z20 = !o5.C(A0) || ((Z0 = getMessagesController().Z0(Integer.valueOf(o5.h(A0)))) != null && i0.X0(Z0.layer) >= 101);
            if (z10) {
                TLRPC.MessageMedia messageMedia = jjVar.k.media;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaWebPage) && messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                        tL_photo2 = (TLRPC.TL_photo) messageMedia.photo;
                        x20Var2 = x20Var;
                        c14 = 2;
                    } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                        tL_document3 = (TLRPC.TL_document) messageMedia.document;
                        if (!jj.K4(tL_document3) && x20Var == null) {
                            c14 = 7;
                            x20Var2 = jjVar.p0;
                        }
                        c14 = 3;
                        x20Var2 = jjVar.p0;
                    } else {
                        x20Var2 = x20Var;
                        c14 = messageMedia instanceof TLRPC.TL_messageMediaToDo ? '\n' : (char) 65535;
                    }
                    hashMap2 = message.params;
                    obj3 = (obj == null || hashMap2 == null || !hashMap2.containsKey("parentObject")) ? obj : hashMap2.get("parentObject");
                    jjVar.w1 = message.message;
                    jjVar.x1 = message.entities;
                    obj2 = "originalPath";
                    z12 = z20;
                    c10 = c14;
                    str6 = message.attachPath;
                }
                x20Var2 = x20Var;
                c14 = 1;
                hashMap2 = message.params;
                if (obj == null) {
                }
                jjVar.w1 = message.message;
                jjVar.x1 = message.entities;
                obj2 = "originalPath";
                z12 = z20;
                c10 = c14;
                str6 = message.attachPath;
            } else {
                TLRPC.MessageMedia messageMedia2 = message.media;
                jjVar.B1 = messageMedia2;
                jjVar.A1 = message.message;
                jjVar.D1 = message.entities;
                jjVar.E1 = message.attachPath;
                if (messageMedia2 == null) {
                    new TLRPC.TL_messageMediaEmpty();
                }
                SerializedData serializedData = new SerializedData(true);
                B0(message, serializedData);
                SerializedData serializedData2 = new SerializedData(serializedData.length());
                B0(message, serializedData2);
                hashMap4.put("prevMedia", Base64.encodeToString(serializedData2.toByteArray(), 0));
                serializedData2.cleanup();
                if (tL_inputPollAnswer != null) {
                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) message.media;
                    TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                    obj2 = "originalPath";
                    tL_pollAnswer.text = tL_inputPollAnswer.text;
                    tL_pollAnswer.option = tL_inputPollAnswer.option;
                    int size = tL_messageMediaPoll.poll.answers.size();
                    tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                    jjVar.C1 = tL_document3;
                    if (tL_photo2 != null) {
                        TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
                        tL_pollAnswer.media = tL_messageMediaPhoto;
                        tL_messageMediaPhoto.flags |= 3;
                        tL_messageMediaPhoto.photo = tL_photo2;
                        tL_messageMediaPhoto.spoiler = z11;
                        if (str6 == null || str6.length() <= 0 || !str6.startsWith("http")) {
                            ArrayList<TLRPC.PhotoSize> arrayList = tL_photo2.sizes;
                            TLRPC.FileLocation fileLocation = arrayList.get(arrayList.size() - 1).location;
                            b8.G(this.currentAccount);
                            message.attachPath = b8.L(fileLocation, true).toString();
                            b8.G(this.currentAccount);
                            ih.g.j(message, b8.L(fileLocation, true).toString(), size);
                        } else {
                            message.attachPath = str6;
                            ih.g.j(message, str6, size);
                        }
                        z12 = z20;
                        c11 = 2;
                    } else if (tL_document3 != null) {
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                        tL_pollAnswer.media = tL_messageMediaDocument;
                        z12 = z20;
                        tL_messageMediaDocument.flags |= 3;
                        tL_messageMediaDocument.document = tL_document3;
                        tL_messageMediaDocument.spoiler = z11;
                        if (!jj.K4(tL_document3) && x20Var == null) {
                            c11 = 7;
                            if (x20Var != null) {
                                hashMap4.put("ve", x20Var.b());
                            }
                            message.attachPath = str6;
                            ih.g.j(message, str6, size);
                            if (!(photoSize instanceof ec)) {
                                TLRPC.MessageMedia messageMedia3 = tL_pollAnswer.media;
                                messageMedia3.flags |= 512;
                                messageMedia3.video_cover = ((ec) photoSize).a;
                            } else if (photoSize != null) {
                                TLRPC.TL_photo tL_photo3 = new TLRPC.TL_photo();
                                tL_photo3.date = getConnectionsManager().getCurrentTime();
                                tL_photo3.sizes.add(photoSize);
                                tL_photo3.file_reference = new byte[0];
                                TLRPC.MessageMedia messageMedia4 = tL_pollAnswer.media;
                                messageMedia4.video_cover = tL_photo3;
                                messageMedia4.flags |= 512;
                            }
                        }
                        c11 = 3;
                        if (x20Var != null) {
                        }
                        message.attachPath = str6;
                        ih.g.j(message, str6, size);
                        if (!(photoSize instanceof ec)) {
                        }
                    } else {
                        z12 = z20;
                        c11 = tL_inputPollAnswer.input_media != null ? (char) 11 : (char) 1;
                    }
                    c10 = c11;
                } else {
                    obj2 = "originalPath";
                    z12 = z20;
                    if (tL_photo2 != null) {
                        TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto2 = new TLRPC.TL_messageMediaPhoto();
                        message.media = tL_messageMediaPhoto2;
                        tL_messageMediaPhoto2.flags |= 3;
                        tL_messageMediaPhoto2.photo = tL_photo2;
                        tL_messageMediaPhoto2.spoiler = z11;
                        if (str6 == null || str6.length() <= 0 || !str6.startsWith("http")) {
                            ArrayList<TLRPC.PhotoSize> arrayList2 = tL_photo2.sizes;
                            TLRPC.FileLocation fileLocation2 = arrayList2.get(arrayList2.size() - 1).location;
                            b8.G(this.currentAccount);
                            message.attachPath = b8.L(fileLocation2, true).toString();
                        } else {
                            message.attachPath = str6;
                        }
                        c10 = 2;
                    } else if (tL_document3 != null) {
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument2 = new TLRPC.TL_messageMediaDocument();
                        message.media = tL_messageMediaDocument2;
                        tL_messageMediaDocument2.flags |= 3;
                        tL_messageMediaDocument2.document = tL_document3;
                        tL_messageMediaDocument2.spoiler = z11;
                        if (!jj.K4(tL_document3) && x20Var == null) {
                            c10 = 7;
                            if (x20Var != null) {
                                hashMap4.put("ve", x20Var.b());
                            }
                            message.attachPath = str6;
                            if (!(photoSize instanceof ec)) {
                                TLRPC.MessageMedia messageMedia5 = message.media;
                                messageMedia5.flags |= 512;
                                messageMedia5.video_cover = ((ec) photoSize).a;
                            } else if (photoSize != null) {
                                TLRPC.TL_photo tL_photo4 = new TLRPC.TL_photo();
                                tL_photo4.date = getConnectionsManager().getCurrentTime();
                                tL_photo4.sizes.add(photoSize);
                                tL_photo4.file_reference = new byte[0];
                                TLRPC.MessageMedia messageMedia6 = message.media;
                                messageMedia6.video_cover = tL_photo4;
                                messageMedia6.flags |= 512;
                            }
                        }
                        c10 = 3;
                        if (x20Var != null) {
                        }
                        message.attachPath = str6;
                        if (!(photoSize instanceof ec)) {
                        }
                    } else {
                        c10 = jjVar.k.media instanceof TLRPC.TL_messageMediaToDo ? '\n' : (char) 1;
                    }
                }
                message.params = hashMap4;
                message.send_state = 3;
                message.errorNewPriceStars = 0L;
                message.errorAllowedPriceStars = 0L;
                obj3 = obj;
                hashMap2 = hashMap4;
                x20Var2 = x20Var;
            }
            if (message.attachPath == null) {
                message.attachPath = "";
            }
            message.local_id = 0;
            int i10 = jjVar.D;
            if ((i10 == 3 || x20Var2 != null || i10 == 2) && !TextUtils.isEmpty(message.attachPath)) {
                jjVar.w0 = true;
            }
            x20 x20Var5 = jjVar.p0;
            if (x20Var5 != null && x20Var2 == null) {
                x20Var2 = x20Var5;
            }
            if (z10) {
                tL_document2 = tL_document3;
                str2 = str6;
                x20Var3 = x20Var2;
            } else {
                CharSequence charSequence = jjVar.w1;
                if (charSequence != null) {
                    String str7 = message.message;
                    String charSequence2 = charSequence.toString();
                    message.message = charSequence2;
                    jjVar.z = null;
                    if (c10 == 1) {
                        ArrayList<TLRPC.MessageEntity> arrayList3 = jjVar.x1;
                        if (arrayList3 != null) {
                            message.entities = arrayList3;
                            message.flags |= 128;
                        } else if (!TextUtils.equals(str7, charSequence2)) {
                            message.flags &= -129;
                        }
                        TLRPC.Message message2 = jjVar.k;
                        if (message2 != null && (message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                            jjVar.k0();
                        }
                    } else {
                        ArrayList<TLRPC.MessageEntity> arrayList4 = jjVar.x1;
                        if (arrayList4 != null) {
                            message.entities = arrayList4;
                            message.flags |= 128;
                            tL_document2 = tL_document3;
                            x20Var3 = x20Var2;
                            z19 = z12;
                        } else {
                            x20Var3 = x20Var2;
                            tL_document2 = tL_document3;
                            z19 = z12;
                            ArrayList<TLRPC.MessageEntity> W = getMediaDataController().W(new CharSequence[]{jjVar.w1}, z19, true);
                            if (W != null && !W.isEmpty()) {
                                message.entities = W;
                                message.flags |= 128;
                            } else if (!TextUtils.equals(str7, message.message)) {
                                message.flags &= -129;
                            }
                        }
                        jjVar.k0();
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(message);
                        getMessagesStorage().i1(0, jjVar.p1 ? 1 : 0, 0L, arrayList5, false);
                        x00 R1 = getMessagesController().R1();
                        z12 = z19;
                        str2 = str6;
                        tL_forumTopic = (TLRPC.TL_forumTopic) R1.e.f(x00.p(message.id, -message.dialog_id));
                        if (tL_forumTopic != null) {
                            tL_forumTopic.topMessage = message;
                            R1.y(-message.dialog_id, true);
                        }
                        jjVar.D = -1;
                        jjVar.K5();
                        if (c10 == 1) {
                            TLRPC.MessageMedia messageMedia7 = jjVar.k.media;
                            if (!(messageMedia7 instanceof TLRPC.TL_messageMediaPhoto) && !(messageMedia7 instanceof TLRPC.TL_messageMediaDocument)) {
                                jjVar.Q1 = false;
                                jjVar.I();
                            }
                            jjVar.k0();
                        }
                        jjVar.P(tL_inputPollAnswer == null);
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(jjVar);
                        getNotificationCenter().k(zs.m0, Long.valueOf(A0), arrayList6);
                    }
                }
                tL_document2 = tL_document3;
                x20Var3 = x20Var2;
                z19 = z12;
                ArrayList arrayList52 = new ArrayList();
                arrayList52.add(message);
                getMessagesStorage().i1(0, jjVar.p1 ? 1 : 0, 0L, arrayList52, false);
                x00 R12 = getMessagesController().R1();
                z12 = z19;
                str2 = str6;
                tL_forumTopic = (TLRPC.TL_forumTopic) R12.e.f(x00.p(message.id, -message.dialog_id));
                if (tL_forumTopic != null) {
                }
                jjVar.D = -1;
                jjVar.K5();
                if (c10 == 1) {
                }
                jjVar.P(tL_inputPollAnswer == null);
                ArrayList arrayList62 = new ArrayList();
                arrayList62.add(jjVar);
                getNotificationCenter().k(zs.m0, Long.valueOf(A0), arrayList62);
            }
            if (hashMap2 != null) {
                Object obj4 = obj2;
                if (hashMap2.containsKey(obj4)) {
                    str3 = (String) hashMap2.get(obj4);
                    char c15 = '\b';
                    if (c10 >= 1) {
                        if (c10 <= 3) {
                        }
                        c12 = 11;
                        if (c10 == c12) {
                            if (c10 != 1) {
                                if (c10 == 2) {
                                    TLRPC.InputMedia tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                                    tL_inputMediaUploadedPhoto.spoiler = z11;
                                    if (hashMap2 == null || (str5 = (String) hashMap2.get("masks")) == null) {
                                        c13 = '\b';
                                    } else {
                                        SerializedData serializedData3 = new SerializedData(Utilities.v(str5));
                                        boolean z21 = false;
                                        int readInt32 = serializedData3.readInt32(false);
                                        int i11 = 0;
                                        while (i11 < readInt32) {
                                            tL_inputMediaUploadedPhoto.stickers.add(TLRPC.InputDocument.TLdeserialize(serializedData3, serializedData3.readInt32(z21), z21));
                                            i11++;
                                            readInt32 = readInt32;
                                            c15 = c15;
                                            z21 = false;
                                        }
                                        c13 = c15;
                                        tL_inputMediaUploadedPhoto.flags |= 1;
                                        serializedData3.cleanup();
                                    }
                                    if (tL_photo2.access_hash == 0) {
                                        inputMedia6 = tL_inputMediaUploadedPhoto;
                                        z14 = true;
                                    } else {
                                        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                                        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                        tL_inputMediaPhoto.id = tL_inputPhoto;
                                        tL_inputPhoto.id = tL_photo2.id;
                                        tL_inputPhoto.access_hash = tL_photo2.access_hash;
                                        byte[] bArr = tL_photo2.file_reference;
                                        tL_inputPhoto.file_reference = bArr;
                                        if (bArr == null) {
                                            tL_inputPhoto.file_reference = new byte[0];
                                        }
                                        tL_inputMediaPhoto.spoiler = z11;
                                        inputMedia6 = tL_inputMediaPhoto;
                                        z14 = false;
                                    }
                                    j10 = A0;
                                    cz czVar2 = new cz(this, j10);
                                    czVar2.e = 0;
                                    czVar2.m = jjVar;
                                    czVar2.f = str3;
                                    czVar2.K = obj3;
                                    czVar2.t = tL_inputMediaUploadedPhoto;
                                    czVar2.p = z14;
                                    if (str2 != null && str2.length() > 0) {
                                        String str8 = str2;
                                        if (str8.startsWith("http")) {
                                            czVar2.l = str8;
                                            inputMedia3 = inputMedia6;
                                            czVar = czVar2;
                                            hashMap3 = hashMap2;
                                        }
                                    }
                                    czVar2.g = tL_photo2.sizes.get(r10.size() - 1);
                                    czVar2.h = tL_photo2;
                                    inputMedia3 = inputMedia6;
                                    czVar = czVar2;
                                    hashMap3 = hashMap2;
                                } else {
                                    c13 = '\b';
                                    j10 = A0;
                                    if (c10 == 3) {
                                        TLRPC.InputMedia tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                                        tL_inputMediaUploadedDocument.spoiler = z11;
                                        if (hashMap2 != null && (str4 = (String) hashMap2.get("masks")) != null) {
                                            SerializedData serializedData4 = new SerializedData(Utilities.v(str4));
                                            boolean z22 = false;
                                            int readInt322 = serializedData4.readInt32(false);
                                            int i12 = 0;
                                            while (i12 < readInt322) {
                                                tL_inputMediaUploadedDocument.stickers.add(TLRPC.InputDocument.TLdeserialize(serializedData4, serializedData4.readInt32(z22), z22));
                                                i12++;
                                                readInt322 = readInt322;
                                                z22 = false;
                                            }
                                            tL_inputMediaUploadedDocument.flags |= 1;
                                            serializedData4.cleanup();
                                        }
                                        TLRPC.TL_document tL_document4 = tL_document2;
                                        tL_inputMediaUploadedDocument.mime_type = tL_document4.mime_type;
                                        tL_inputMediaUploadedDocument.attributes = tL_document4.attributes;
                                        if (jjVar.q3()) {
                                            x20Var4 = x20Var3;
                                        } else {
                                            if (x20Var3 != null) {
                                                x20Var4 = x20Var3;
                                            } else {
                                                x20Var4 = x20Var3;
                                            }
                                            tL_inputMediaUploadedDocument.nosound_video = true;
                                            boolean z23 = v2.a;
                                            f8.b("nosound_video = true");
                                        }
                                        hashMap3 = hashMap2;
                                        if (tL_document4.access_hash == 0) {
                                            inputMedia4 = tL_inputMediaUploadedDocument;
                                            z15 = true;
                                        } else {
                                            TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                                            tL_inputMediaDocument.id = tL_inputDocument;
                                            tL_inputDocument.id = tL_document4.id;
                                            tL_inputDocument.access_hash = tL_document4.access_hash;
                                            byte[] bArr2 = tL_document4.file_reference;
                                            tL_inputDocument.file_reference = bArr2;
                                            if (bArr2 == null) {
                                                tL_inputDocument.file_reference = new byte[0];
                                            }
                                            tL_inputMediaDocument.spoiler = z11;
                                            inputMedia4 = tL_inputMediaDocument;
                                            z15 = false;
                                        }
                                        czVar = new cz(this, j10);
                                        czVar.e = 1;
                                        czVar.m = jjVar;
                                        czVar.f = str3;
                                        czVar.K = obj3;
                                        czVar.t = tL_inputMediaUploadedDocument;
                                        if (!tL_document4.thumbs.isEmpty()) {
                                            TLRPC.PhotoSize photoSize2 = tL_document4.thumbs.get(0);
                                            if (!(photoSize2 instanceof TLRPC.TL_photoStrippedSize)) {
                                                czVar.g = photoSize2;
                                                czVar.h = tL_document4;
                                            }
                                        }
                                        czVar.o = x20Var4;
                                        if (photoSize instanceof ec) {
                                            tL_inputMediaUploadedDocument.video_cover = ((ec) photoSize).b;
                                            tL_inputMediaUploadedDocument.flags |= 64;
                                        } else if (photoSize != null && !(photoSize instanceof TLRPC.TL_photoStrippedSize)) {
                                            czVar.i = photoSize;
                                            z16 = true;
                                            czVar.p = z15;
                                            czVar.q = z16;
                                            z14 = z15;
                                            z17 = z16;
                                            inputMedia5 = inputMedia4;
                                            z18 = inputMedia5 instanceof TLRPC.TL_inputMediaEmpty;
                                            TLRPC.InputMedia inputMedia8 = inputMedia5;
                                            if (z18) {
                                                int i13 = jjVar.D;
                                                if (i13 != 0) {
                                                    inputMedia8 = inputMedia5;
                                                }
                                                inputMedia8 = null;
                                            }
                                            if (tL_inputPollAnswer != null) {
                                                tLObject = new TLRPC.TL_messages_addPollAnswer();
                                                tL_inputPollAnswer.input_media = inputMedia8;
                                                tLObject.answer = tL_inputPollAnswer;
                                                tLObject.msg_id = jjVar.f1();
                                                tLObject.peer = getMessagesController().i1(j10);
                                                if (czVar != null) {
                                                    czVar.c = tLObject;
                                                }
                                            } else {
                                                if (jjVar.b3()) {
                                                    TL_ephemeral.TL_editMessage tL_editMessage = new TL_ephemeral.TL_editMessage();
                                                    tL_editMessage.id = jj.S(jjVar.f1());
                                                    tL_editMessage.receiver_id = new TLRPC.TL_inputUserEmpty();
                                                    tL_editMessage.welcome = true;
                                                    tL_messages_editMessage = tL_editMessage;
                                                } else {
                                                    TLRPC.TL_messages_editMessage tL_messages_editMessage2 = new TLRPC.TL_messages_editMessage();
                                                    tL_messages_editMessage2.id = jjVar.f1();
                                                    tL_messages_editMessage = tL_messages_editMessage2;
                                                }
                                                tLObject = tL_messages_editMessage;
                                                tLObject.peer = getMessagesController().i1(j10);
                                                TLRPC.Message message3 = jjVar.k;
                                                tLObject.invert_media = message3.invert_media;
                                                if (inputMedia8 != null) {
                                                    tLObject.flags |= TLObject.FLAG_14;
                                                    tLObject.media = inputMedia8;
                                                } else if (!jjVar.y1) {
                                                    tLObject.no_webpage = true;
                                                }
                                                if (jjVar.p1) {
                                                    tLObject.schedule_date = message3.date;
                                                    int i14 = tLObject.flags;
                                                    tLObject.flags = 32768 | i14;
                                                    int i15 = message3.schedule_repeat_period;
                                                    if (i15 != 0) {
                                                        tLObject.schedule_repeat_period = i15;
                                                        tLObject.flags = i14 | 294912;
                                                    }
                                                }
                                                if ((message3.flags & TLObject.FLAG_30) != 0) {
                                                    tLObject.quick_reply_shortcut_id = message3.quick_reply_shortcut_id;
                                                    tLObject.flags |= 131072;
                                                }
                                                CharSequence charSequence3 = jjVar.w1;
                                                if (charSequence3 != null) {
                                                    tLObject.message = charSequence3.toString();
                                                    int i16 = tLObject.flags;
                                                    tLObject.flags = i16 | 2048;
                                                    tLObject.no_webpage = !jjVar.y1;
                                                    ArrayList<TLRPC.MessageEntity> arrayList7 = jjVar.x1;
                                                    if (arrayList7 != null) {
                                                        tLObject.entities = arrayList7;
                                                        tLObject.flags = i16 | 2056;
                                                    } else {
                                                        ArrayList<TLRPC.MessageEntity> W2 = getMediaDataController().W(new CharSequence[]{jjVar.w1}, z12, true);
                                                        if (W2 != null && !W2.isEmpty()) {
                                                            tLObject.entities = W2;
                                                            tLObject.flags |= 8;
                                                        }
                                                    }
                                                    jjVar.w1 = null;
                                                    jjVar.x1 = null;
                                                }
                                                if (czVar != null) {
                                                    czVar.c = tLObject;
                                                }
                                            }
                                            if (c10 != 1 || c10 == 11) {
                                                N(tLObject, jjVar, null, czVar, obj3, hashMap3, jjVar.p1);
                                            }
                                            try {
                                                if (c10 == 2) {
                                                    if (!z14 && !z17) {
                                                        O(tLObject, jjVar, str3, null, true, czVar, obj3, hashMap3, jjVar.p1);
                                                        return;
                                                    }
                                                    L(czVar);
                                                    return;
                                                }
                                                HashMap hashMap5 = hashMap3;
                                                if (c10 == 3) {
                                                    if (!z14 && !z17) {
                                                        N(tLObject, jjVar, str3, czVar, obj3, hashMap5, jjVar.p1);
                                                        return;
                                                    }
                                                    L(czVar);
                                                    return;
                                                }
                                                try {
                                                    if (c10 == 6) {
                                                        N(tLObject, jjVar, str3, czVar, obj3, hashMap5, jjVar.p1);
                                                        return;
                                                    }
                                                    if (c10 == 7) {
                                                        if (z14 || z17) {
                                                            L(czVar);
                                                            return;
                                                        }
                                                        try {
                                                            N(tLObject, jjVar, str3, czVar, obj3, hashMap5, jjVar.p1);
                                                            return;
                                                        } catch (Exception e) {
                                                            e = e;
                                                            f8.f(e);
                                                            l0(jjVar);
                                                            return;
                                                        }
                                                    }
                                                    if (c10 != c13) {
                                                        if (c10 == '\n') {
                                                            N(tLObject, jjVar, str3, czVar, obj3, hashMap5, jjVar.p1);
                                                            return;
                                                        }
                                                        return;
                                                    } else {
                                                        if (!z14 && !z17) {
                                                            N(tLObject, jjVar, str3, czVar, obj3, hashMap5, jjVar.p1);
                                                            return;
                                                        }
                                                        L(czVar);
                                                        return;
                                                    }
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    f8.f(e);
                                                    l0(jjVar);
                                                    return;
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                            }
                                        }
                                        z16 = false;
                                        czVar.p = z15;
                                        czVar.q = z16;
                                        z14 = z15;
                                        z17 = z16;
                                        inputMedia5 = inputMedia4;
                                        z18 = inputMedia5 instanceof TLRPC.TL_inputMediaEmpty;
                                        TLRPC.InputMedia inputMedia82 = inputMedia5;
                                        if (z18) {
                                        }
                                        if (tL_inputPollAnswer != null) {
                                        }
                                        if (c10 != 1) {
                                        }
                                        N(tLObject, jjVar, null, czVar, obj3, hashMap3, jjVar.p1);
                                    }
                                    x20 x20Var6 = x20Var3;
                                    hashMap3 = hashMap2;
                                    TLRPC.TL_document tL_document5 = tL_document2;
                                    if (c10 == 7) {
                                        TLRPC.InputMedia tL_inputMediaUploadedDocument2 = new TLRPC.TL_inputMediaUploadedDocument();
                                        tL_inputMediaUploadedDocument2.mime_type = tL_document5.mime_type;
                                        tL_inputMediaUploadedDocument2.attributes = tL_document5.attributes;
                                        tL_inputMediaUploadedDocument2.spoiler = z11;
                                        if (tL_document5.access_hash == 0) {
                                            inputMedia2 = tL_inputMediaUploadedDocument2;
                                            z13 = true;
                                        } else {
                                            TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = new TLRPC.TL_inputMediaDocument();
                                            TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                            tL_inputMediaDocument2.id = tL_inputDocument2;
                                            tL_inputDocument2.id = tL_document5.id;
                                            tL_inputDocument2.access_hash = tL_document5.access_hash;
                                            byte[] bArr3 = tL_document5.file_reference;
                                            tL_inputDocument2.file_reference = bArr3;
                                            if (bArr3 == null) {
                                                tL_inputDocument2.file_reference = new byte[0];
                                            }
                                            tL_inputMediaDocument2.spoiler = z11;
                                            z13 = false;
                                            inputMedia2 = tL_inputMediaDocument2;
                                        }
                                        czVar = new cz(this, j10);
                                        czVar.f = str3;
                                        czVar.e = 2;
                                        czVar.m = jjVar;
                                        if (!tL_document5.thumbs.isEmpty() && (x20Var6 == null || !x20Var6.N)) {
                                            TLRPC.PhotoSize photoSize3 = tL_document5.thumbs.get(0);
                                            if (!(photoSize3 instanceof TLRPC.TL_photoStrippedSize)) {
                                                czVar.g = photoSize3;
                                                czVar.h = tL_document5;
                                            }
                                        }
                                        czVar.K = obj3;
                                        czVar.t = tL_inputMediaUploadedDocument2;
                                        czVar.p = z13;
                                        inputMedia3 = inputMedia2;
                                        z14 = z13;
                                    } else if (c10 == '\n') {
                                        TLRPC.MessageMedia o12 = jj.o1(jjVar.k);
                                        if (o12 instanceof TLRPC.TL_messageMediaToDo) {
                                            TLRPC.TL_inputMediaTodo tL_inputMediaTodo = new TLRPC.TL_inputMediaTodo();
                                            tL_inputMediaTodo.todo = ((TLRPC.TL_messageMediaToDo) o12).todo;
                                            inputMedia = tL_inputMediaTodo;
                                            z14 = false;
                                            z17 = false;
                                            czVar = null;
                                            inputMedia5 = inputMedia;
                                            z18 = inputMedia5 instanceof TLRPC.TL_inputMediaEmpty;
                                            TLRPC.InputMedia inputMedia822 = inputMedia5;
                                            if (z18) {
                                            }
                                            if (tL_inputPollAnswer != null) {
                                            }
                                            if (c10 != 1) {
                                            }
                                            N(tLObject, jjVar, null, czVar, obj3, hashMap3, jjVar.p1);
                                        }
                                    }
                                }
                                z17 = false;
                                inputMedia5 = inputMedia3;
                                z18 = inputMedia5 instanceof TLRPC.TL_inputMediaEmpty;
                                TLRPC.InputMedia inputMedia8222 = inputMedia5;
                                if (z18) {
                                }
                                if (tL_inputPollAnswer != null) {
                                }
                                if (c10 != 1) {
                                }
                                N(tLObject, jjVar, null, czVar, obj3, hashMap3, jjVar.p1);
                            }
                            TLRPC.MessageMedia messageMedia8 = message.media;
                            if ((messageMedia8 == null || (messageMedia8 instanceof TLRPC.TL_messageMediaEmpty) || (messageMedia8.webpage instanceof TLRPC.TL_webPageEmpty)) && !jjVar.y1) {
                                inputMedia7 = new TLRPC.TL_inputMediaEmpty();
                            } else if (messageMedia8 == null || messageMedia8.webpage == null) {
                                c13 = '\b';
                                hashMap3 = hashMap2;
                                j10 = A0;
                            } else {
                                TLRPC.TL_inputMediaWebPage tL_inputMediaWebPage = new TLRPC.TL_inputMediaWebPage();
                                TLRPC.MessageMedia messageMedia9 = message.media;
                                tL_inputMediaWebPage.url = messageMedia9.webpage.url;
                                tL_inputMediaWebPage.force_small_media = messageMedia9.force_small_media;
                                tL_inputMediaWebPage.force_large_media = messageMedia9.force_large_media;
                                inputMedia7 = tL_inputMediaWebPage;
                            }
                            inputMedia = null;
                            z14 = false;
                            z17 = false;
                            czVar = null;
                            inputMedia5 = inputMedia;
                            z18 = inputMedia5 instanceof TLRPC.TL_inputMediaEmpty;
                            TLRPC.InputMedia inputMedia82222 = inputMedia5;
                            if (z18) {
                            }
                            if (tL_inputPollAnswer != null) {
                            }
                            if (c10 != 1) {
                            }
                            N(tLObject, jjVar, null, czVar, obj3, hashMap3, jjVar.p1);
                        }
                        inputMedia7 = tL_inputPollAnswer.input_media;
                        c13 = '\b';
                        hashMap3 = hashMap2;
                        j10 = A0;
                        inputMedia = inputMedia7;
                        z14 = false;
                        z17 = false;
                        czVar = null;
                        inputMedia5 = inputMedia;
                        z18 = inputMedia5 instanceof TLRPC.TL_inputMediaEmpty;
                        TLRPC.InputMedia inputMedia822222 = inputMedia5;
                        if (z18) {
                        }
                        if (tL_inputPollAnswer != null) {
                        }
                        if (c10 != 1) {
                        }
                        N(tLObject, jjVar, null, czVar, obj3, hashMap3, jjVar.p1);
                    }
                    if ((c10 >= 5 || c10 > '\b') && c10 != '\n') {
                        c12 = 11;
                        if (c10 != 11) {
                            return;
                        }
                        if (c10 == c12) {
                        }
                        c13 = '\b';
                        hashMap3 = hashMap2;
                        j10 = A0;
                        inputMedia = inputMedia7;
                        z14 = false;
                        z17 = false;
                        czVar = null;
                        inputMedia5 = inputMedia;
                        z18 = inputMedia5 instanceof TLRPC.TL_inputMediaEmpty;
                        TLRPC.InputMedia inputMedia8222222 = inputMedia5;
                        if (z18) {
                        }
                        if (tL_inputPollAnswer != null) {
                        }
                        if (c10 != 1) {
                        }
                        N(tLObject, jjVar, null, czVar, obj3, hashMap3, jjVar.p1);
                    }
                    c12 = 11;
                    if (c10 == c12) {
                    }
                    c13 = '\b';
                    hashMap3 = hashMap2;
                    j10 = A0;
                    inputMedia = inputMedia7;
                    z14 = false;
                    z17 = false;
                    czVar = null;
                    inputMedia5 = inputMedia;
                    z18 = inputMedia5 instanceof TLRPC.TL_inputMediaEmpty;
                    TLRPC.InputMedia inputMedia82222222 = inputMedia5;
                    if (z18) {
                    }
                    if (tL_inputPollAnswer != null) {
                    }
                    if (c10 != 1) {
                    }
                    N(tLObject, jjVar, null, czVar, obj3, hashMap3, jjVar.p1);
                }
            }
            str3 = null;
            char c152 = '\b';
            if (c10 >= 1) {
            }
            if (c10 >= 5) {
            }
            c12 = 11;
            if (c10 != 11) {
            }
            if (c10 == c12) {
            }
            c13 = '\b';
            hashMap3 = hashMap2;
            j10 = A0;
            inputMedia = inputMedia7;
            z14 = false;
            z17 = false;
            czVar = null;
            inputMedia5 = inputMedia;
            z18 = inputMedia5 instanceof TLRPC.TL_inputMediaEmpty;
            TLRPC.InputMedia inputMedia822222222 = inputMedia5;
            if (z18) {
            }
            if (tL_inputPollAnswer != null) {
            }
            if (c10 != 1) {
            }
            N(tLObject, jjVar, null, czVar, obj3, hashMap3, jjVar.p1);
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t0(cz czVar, boolean z10) {
        cz czVar2;
        ArrayList arrayList;
        int i10;
        cz czVar3 = czVar;
        ArrayList arrayList2 = czVar3.x;
        long j10 = czVar3.a;
        if (arrayList2.isEmpty()) {
            czVar3.c();
            return;
        }
        String str = "group_" + czVar3.F;
        int i11 = 1;
        if (czVar3.G != ((jj) i0.a.g(1, czVar3.x)).f1()) {
            if (!z10) {
                boolean z11 = v2.a;
                f8.b("final message not added");
                return;
            } else {
                boolean z12 = v2.a;
                f8.b("final message not added, add");
                e0(str, czVar3);
                return;
            }
        }
        if (z10) {
            this.a.remove(str);
            jj jjVar = czVar3.m;
            if (jjVar != null && jj.d5(jjVar.k)) {
                i11 = 9;
            } else if (!czVar3.H) {
                jj jjVar2 = czVar3.m;
                if ((jjVar2 == null || !jj.b4(jjVar2.k)) && ((arrayList = czVar3.x) == null || arrayList.isEmpty() || !jj.b4(((jj) czVar3.x.get(0)).k))) {
                    i10 = 0;
                    if (!czVar3.I || czVar3.J) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add((jj) czVar3.x.get(0));
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add((TLRPC.Message) czVar3.z.get(0));
                        getMessagesStorage().j1(arrayList4, false, true, false, 0, false, i10, 0L);
                        getMessagesController().i5(i10, j10, arrayList3);
                    } else {
                        getMessagesStorage().j1(czVar3.z, false, true, false, 0, false, i10, 0L);
                        getMessagesController().i5(i10, j10, czVar3.x);
                    }
                    if (!czVar3.H) {
                        getNotificationCenter().k(zs.s, new Object[0]);
                    }
                    boolean z13 = v2.a;
                    f8.b("add message");
                } else {
                    i11 = 5;
                }
            }
            i10 = i11;
            if (czVar3.I) {
            }
            ArrayList arrayList32 = new ArrayList();
            arrayList32.add((jj) czVar3.x.get(0));
            ArrayList arrayList42 = new ArrayList();
            arrayList42.add((TLRPC.Message) czVar3.z.get(0));
            getMessagesStorage().j1(arrayList42, false, true, false, 0, false, i10, 0L);
            getMessagesController().i5(i10, j10, arrayList32);
            if (!czVar3.H) {
            }
            boolean z132 = v2.a;
            f8.b("add message");
        }
        TLObject tLObject = czVar3.c;
        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject;
            while (r4 < tL_messages_sendMultiMedia.multi_media.size()) {
                TLRPC.InputMedia inputMedia = tL_messages_sendMultiMedia.multi_media.get(r4).media;
                if ((inputMedia instanceof TLRPC.TL_inputMediaUploadedPhoto) || (inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument)) {
                    boolean z14 = v2.a;
                    f8.b("multi media not ready");
                    return;
                }
                if ((inputMedia instanceof TLRPC.TL_inputMediaDocument) && r4 < czVar3.x.size()) {
                    jj jjVar3 = (jj) czVar3.x.get(r4);
                    String str2 = jjVar3.k.attachPath;
                    if (str2 == null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(b8.z(4));
                        sb2.append("/");
                        str2 = a1.g.q(sb2, jjVar3.F0().id, ".mp4");
                    }
                    if (czVar3.E.containsKey(str2 + "_ct") && inputMedia.video_cover == null) {
                        boolean z15 = v2.a;
                        f8.b("cover media not ready");
                        return;
                    }
                }
                r4++;
            }
            cz y3 = y(czVar3.G, j10);
            if (y3 != null) {
                y3.a(czVar3.c, czVar3.x, czVar3.B, czVar3.y, czVar3, czVar3.H);
                ArrayList arrayList5 = czVar3.b;
                if (arrayList5 != null) {
                    y3.b.addAll(arrayList5);
                }
                boolean z16 = v2.a;
                f8.b("has maxDelayedMessage, delay");
                return;
            }
        } else {
            boolean z17 = tLObject instanceof TLRPC.TL_messages_sendMedia;
            if (z17) {
                TLRPC.InputMedia inputMedia2 = ((TLRPC.TL_messages_sendMedia) tLObject).media;
                if (inputMedia2 instanceof TLRPC.TL_inputMediaPoll) {
                    TLRPC.TL_inputMediaPoll tL_inputMediaPoll = (TLRPC.TL_inputMediaPoll) inputMedia2;
                    TLRPC.InputMedia inputMedia3 = tL_inputMediaPoll.attached_media;
                    if (!(inputMedia3 instanceof TLRPC.TL_inputMediaUploadedPhoto) && !(inputMedia3 instanceof TLRPC.TL_inputMediaUploadedDocument)) {
                        TLRPC.InputMedia inputMedia4 = tL_inputMediaPoll.solution_media;
                        if (!(inputMedia4 instanceof TLRPC.TL_inputMediaUploadedPhoto) && !(inputMedia4 instanceof TLRPC.TL_inputMediaUploadedDocument)) {
                            int size = tL_inputMediaPoll.poll.answers.size();
                            while (r4 < size) {
                                TLRPC.InputMedia e = ih.g.e(tL_inputMediaPoll, r4);
                                r4 = ((e instanceof TLRPC.TL_inputMediaUploadedPhoto) || (e instanceof TLRPC.TL_inputMediaUploadedDocument)) ? 0 : r4 + 1;
                            }
                            cz y10 = y(czVar3.G, j10);
                            if (y10 != null) {
                                y10.a(czVar3.c, czVar3.x, czVar3.B, czVar3.y, czVar3, czVar3.H);
                                ArrayList arrayList6 = czVar3.b;
                                if (arrayList6 != null) {
                                    y10.b.addAll(arrayList6);
                                }
                                boolean z18 = v2.a;
                                f8.b("has maxDelayedMessage, delay");
                                return;
                            }
                        }
                    }
                    boolean z19 = v2.a;
                    f8.b("multi media not ready");
                    return;
                }
            }
            if (z17) {
                TLRPC.InputMedia inputMedia5 = ((TLRPC.TL_messages_sendMedia) tLObject).media;
                if (inputMedia5 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia5;
                    while (r4 < tL_inputMediaPaidMedia.extended_media.size()) {
                        TLRPC.InputMedia inputMedia6 = tL_inputMediaPaidMedia.extended_media.get(r4);
                        if ((inputMedia6 instanceof TLRPC.TL_inputMediaUploadedPhoto) || (inputMedia6 instanceof TLRPC.TL_inputMediaUploadedDocument)) {
                            boolean z20 = v2.a;
                            f8.b("multi media not ready");
                            return;
                        }
                        r4++;
                    }
                    cz y11 = y(czVar3.G, j10);
                    if (y11 != null) {
                        y11.a(czVar3.c, czVar3.x, czVar3.B, czVar3.y, czVar3, czVar3.H);
                        ArrayList arrayList7 = czVar3.b;
                        if (arrayList7 != null) {
                            y11.b.addAll(arrayList7);
                        }
                        boolean z21 = v2.a;
                        f8.b("has maxDelayedMessage, delay");
                        return;
                    }
                }
            }
            TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) czVar3.d;
            while (r4 < tL_messages_sendEncryptedMultiMedia.files.size()) {
                if (tL_messages_sendEncryptedMultiMedia.files.get(r4) instanceof TLRPC.TL_inputEncryptedFile) {
                    return;
                } else {
                    r4++;
                }
            }
        }
        TLObject tLObject2 = czVar3.c;
        if (tLObject2 instanceof TLRPC.TL_messages_sendMultiMedia) {
            czVar2 = czVar3;
            P((TLRPC.TL_messages_sendMultiMedia) tLObject2, czVar3.x, czVar3.B, czVar3.y, czVar2, czVar2.H);
        } else if (!(tLObject2 instanceof TLRPC.TL_messages_sendMedia)) {
            getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) czVar3.d, czVar3);
            czVar3.d();
        } else {
            czVar2 = czVar3;
            P((TLRPC.TL_messages_sendMedia) tLObject2, czVar3.x, czVar3.B, czVar3.y, czVar2, czVar2.H);
        }
        czVar3 = czVar2;
        czVar3.d();
    }

    public final void u(jj jjVar, org.telegram.ui.ActionBar.k2 k2Var, int i10, int i11) {
        TLRPC.TL_messages_editMessage tL_messages_editMessage;
        if (k2Var == null || k2Var.getParentActivity() == null) {
            return;
        }
        if (jj.c3(jjVar.k)) {
            TL_ephemeral.TL_editMessage tL_editMessage = new TL_ephemeral.TL_editMessage();
            tL_editMessage.id = jj.S(jjVar.f1());
            tL_editMessage.receiver_id = new TLRPC.TL_inputUserEmpty();
            tL_editMessage.welcome = true;
            tL_messages_editMessage = tL_editMessage;
        } else {
            TLRPC.TL_messages_editMessage tL_messages_editMessage2 = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage2.id = jjVar.f1();
            tL_messages_editMessage = tL_messages_editMessage2;
        }
        tL_messages_editMessage.peer = getMessagesController().i1(jj.B0(jjVar.k));
        TLRPC.Message message = jjVar.k;
        if (message != null && (message.flags & TLObject.FLAG_30) != 0) {
            tL_messages_editMessage.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
            tL_messages_editMessage.flags |= 131072;
        }
        if (i10 != 0) {
            tL_messages_editMessage.schedule_date = i10;
            int i12 = tL_messages_editMessage.flags;
            tL_messages_editMessage.flags = 32768 | i12;
            if (i11 != 0) {
                tL_messages_editMessage.schedule_repeat_period = i11;
                tL_messages_editMessage.flags = i12 | 294912;
            }
        }
        getConnectionsManager().sendRequest(tL_messages_editMessage, new ci(this, k2Var, tL_messages_editMessage, 11));
    }

    public final void u0(TLRPC.Document document, String str, final long j10, final CharSequence charSequence, final x20 x20Var, final jj jjVar, final jj jjVar2, final TL_stories.StoryItem storyItem, final org.telegram.ui.kn knVar, final fj fjVar, final boolean z10, final int i10, final int i11, boolean z11, final Object obj, final sw swVar, final long j11, final long j12, final oj ojVar, final boolean z12) {
        final TLRPC.Document document2;
        TLRPC.PhotoSize photoSize;
        byte[] bArr;
        if (document == null) {
            return;
        }
        HashMap hashMap = null;
        if (o5.C(j10)) {
            if (getMessagesController().Z0(Integer.valueOf((int) (j10 & 4294967295L))) == null) {
                return;
            }
            document2 = new TLRPC.TL_document_layer82();
            document2.id = document.id;
            document2.access_hash = document.access_hash;
            document2.date = document.date;
            document2.mime_type = document.mime_type;
            byte[] bArr2 = document.file_reference;
            document2.file_reference = bArr2;
            if (bArr2 == null) {
                document2.file_reference = new byte[0];
            }
            document2.size = document.size;
            document2.dc_id = document.dc_id;
            document2.attributes = new ArrayList<>();
            for (int i12 = 0; i12 < document.attributes.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                    tL_documentAttributeVideo_layer159.flags = documentAttribute.flags;
                    tL_documentAttributeVideo_layer159.round_message = documentAttribute.round_message;
                    tL_documentAttributeVideo_layer159.supports_streaming = documentAttribute.supports_streaming;
                    tL_documentAttributeVideo_layer159.duration = documentAttribute.duration;
                    tL_documentAttributeVideo_layer159.w = documentAttribute.w;
                    tL_documentAttributeVideo_layer159.h = documentAttribute.h;
                    document2.attributes.add(tL_documentAttributeVideo_layer159);
                } else {
                    document2.attributes.add(documentAttribute);
                }
            }
            if (document2.mime_type == null) {
                document2.mime_type = "";
            }
            TLRPC.PhotoSize w9 = b8.w(document.thumbs, 10, false, null, false);
            if ((w9 instanceof TLRPC.TL_photoSize) || (w9 instanceof TLRPC.TL_photoSizeProgressive) || (w9 instanceof TLRPC.TL_photoStrippedSize)) {
                b8.G(this.currentAccount);
                File K2 = b8.K(w9, null, true, true);
                if ((w9 instanceof TLRPC.TL_photoStrippedSize) || K2.exists()) {
                    try {
                        if (w9 instanceof TLRPC.TL_photoStrippedSize) {
                            photoSize = new TLRPC.TL_photoStrippedSize();
                            bArr = w9.bytes;
                        } else {
                            TLRPC.TL_photoCachedSize tL_photoCachedSize = new TLRPC.TL_photoCachedSize();
                            K2.length();
                            byte[] bArr3 = new byte[(int) K2.length()];
                            new RandomAccessFile(K2, "r").readFully(bArr3);
                            photoSize = tL_photoCachedSize;
                            bArr = bArr3;
                        }
                        TLRPC.TL_fileLocation_layer82 tL_fileLocation_layer82 = new TLRPC.TL_fileLocation_layer82();
                        TLRPC.FileLocation fileLocation = w9.location;
                        tL_fileLocation_layer82.dc_id = fileLocation.dc_id;
                        tL_fileLocation_layer82.volume_id = fileLocation.volume_id;
                        tL_fileLocation_layer82.local_id = fileLocation.local_id;
                        tL_fileLocation_layer82.secret = fileLocation.secret;
                        photoSize.location = tL_fileLocation_layer82;
                        photoSize.size = w9.size;
                        photoSize.w = w9.w;
                        photoSize.h = w9.h;
                        photoSize.type = w9.type;
                        photoSize.bytes = bArr;
                        document2.thumbs.add(photoSize);
                        document2.flags |= 1;
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                }
            }
            if (document2.thumbs.isEmpty()) {
                TLRPC.TL_photoSizeEmpty tL_photoSizeEmpty = new TLRPC.TL_photoSizeEmpty();
                tL_photoSizeEmpty.type = "s";
                document2.thumbs.add(tL_photoSizeEmpty);
            }
        } else {
            document2 = document;
        }
        if (jj.s3(document2, false)) {
            I.c(new Runnable() { // from class: org.telegram.messenger.ty
                @Override // java.lang.Runnable
                public final void run() {
                    final Bitmap[] bitmapArr = new Bitmap[1];
                    final TLRPC.Document document3 = document2;
                    String q6 = ic.b(document3).q(null, null, false);
                    String str2 = "video/mp4".equals(document3.mime_type) ? ".mp4" : "video/x-matroska".equals(document3.mime_type) ? ".mkv" : "";
                    File file = new File(b8.z(3), sc.e.A(q6, str2));
                    if (!file.exists()) {
                        file = new File(b8.z(2), sc.e.A(q6, str2));
                    }
                    final qz qzVar = qz.this;
                    qz.w(qzVar.getAccountInstance(), false, document3, file.getAbsolutePath(), null, 0L, false);
                    final String[] strArr = {qz.D(qzVar.getAccountInstance(), b8.w(document3.thumbs, zs.r5, false, null, false), bitmapArr, true, true)};
                    final x20 x20Var2 = x20Var;
                    final long j13 = j10;
                    final jj jjVar3 = jjVar;
                    final jj jjVar4 = jjVar2;
                    final boolean z13 = z10;
                    final int i13 = i10;
                    final int i14 = i11;
                    final Object obj2 = obj;
                    final fj fjVar2 = fjVar;
                    final TL_stories.StoryItem storyItem2 = storyItem;
                    final org.telegram.ui.kn knVar2 = knVar;
                    final sw swVar2 = swVar;
                    final long j14 = j11;
                    final long j15 = j12;
                    final oj ojVar2 = ojVar;
                    final CharSequence charSequence2 = charSequence;
                    final boolean z14 = z12;
                    i0.g3(new Runnable() { // from class: org.telegram.messenger.jx
                        @Override // java.lang.Runnable
                        public final void run() {
                            qz qzVar2 = qz.this;
                            qzVar2.getClass();
                            Bitmap[] bitmapArr2 = bitmapArr;
                            if (bitmapArr2[0] != null) {
                                String[] strArr2 = strArr;
                                if (strArr2[0] != null) {
                                    hc.D().O(new BitmapDrawable(bitmapArr2[0]), strArr2[0], false);
                                }
                            }
                            oz f7 = oz.f((TLRPC.TL_document) document3, x20Var2, null, j13, jjVar3, jjVar4, null, null, null, null, z13, i13, i14, 0, obj2, fjVar2, false);
                            f7.H = storyItem2;
                            f7.J = knVar2;
                            f7.K = swVar2;
                            f7.Q = j14;
                            f7.R = j15;
                            f7.T = ojVar2;
                            CharSequence charSequence3 = charSequence2;
                            f7.b = charSequence3 != null ? charSequence3.toString() : null;
                            f7.L = z14;
                            qzVar2.r0(f7);
                        }
                    });
                }
            });
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap = new HashMap();
            hashMap.put("query", str);
        }
        oz f7 = oz.f((TLRPC.TL_document) document2, null, null, j10, jjVar, jjVar2, null, null, null, hashMap, z10, i10, i11, 0, obj, fjVar, z11);
        f7.H = storyItem;
        f7.J = knVar;
        f7.K = swVar;
        f7.Q = j11;
        f7.R = j12;
        f7.T = ojVar;
        f7.L = z12;
        r0(f7);
    }

    public final void v(jj jjVar, TL_iv.RichMessage richMessage, ArrayList arrayList, org.telegram.ui.ActionBar.k2 k2Var, boolean z10) {
        TLRPC.TL_messages_editMessage tL_messages_editMessage;
        if (jjVar == null || richMessage == null || jjVar.k == null) {
            return;
        }
        if (jjVar.Y2() && jjVar.k.reqId != 0) {
            getConnectionsManager().cancelRequest(jjVar.k.reqId, true);
            jjVar.k.reqId = 0;
        }
        if (jj.c3(jjVar.k)) {
            TL_ephemeral.TL_editMessage tL_editMessage = new TL_ephemeral.TL_editMessage();
            tL_editMessage.id = jj.S(jjVar.f1());
            tL_editMessage.receiver_id = new TLRPC.TL_inputUserEmpty();
            tL_editMessage.welcome = true;
            tL_messages_editMessage = tL_editMessage;
        } else {
            TLRPC.TL_messages_editMessage tL_messages_editMessage2 = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage2.id = jjVar.f1();
            tL_messages_editMessage = tL_messages_editMessage2;
        }
        TLRPC.TL_messages_editMessage tL_messages_editMessage3 = tL_messages_editMessage;
        tL_messages_editMessage3.peer = getMessagesController().i1(jj.B0(jjVar.k));
        tL_messages_editMessage3.rich_message = m0(arrayList, richMessage);
        int i10 = tL_messages_editMessage3.flags;
        tL_messages_editMessage3.flags = 8388608 | i10;
        if (jjVar.p1) {
            tL_messages_editMessage3.schedule_date = jjVar.k.date;
            tL_messages_editMessage3.flags = i10 | 8421376;
        }
        TLRPC.Message message = jjVar.k;
        if ((message.flags & TLObject.FLAG_30) != 0) {
            tL_messages_editMessage3.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
            tL_messages_editMessage3.flags |= 131072;
        }
        message.rich_message = richMessage;
        message.send_state = 3;
        int sendRequest = getConnectionsManager().sendRequest(tL_messages_editMessage3, new t4(jjVar, this, tL_messages_editMessage3, k2Var, z10));
        TLRPC.Message message2 = jjVar.k;
        if (message2 != null) {
            message2.reqId = sendRequest;
        }
        getNotificationCenter().k(zs.m0, Long.valueOf(jj.B0(jjVar.k)), m5.j(jjVar));
    }

    public final void v0(TLRPC.Document document, String str, long j10, jj jjVar, jj jjVar2, TL_stories.StoryItem storyItem, org.telegram.ui.kn knVar, fj fjVar, boolean z10, int i10, int i11, boolean z11, Object obj, sw swVar, long j11, long j12, oj ojVar) {
        u0(document, str, j10, null, null, jjVar, jjVar2, storyItem, knVar, fjVar, z10, i10, i11, z11, obj, swVar, j11, j12, ojVar, false);
    }

    public final int w0(jj jjVar, ArrayList arrayList, Runnable runnable) {
        byte[] bArr;
        if (jjVar != null) {
            String str = "poll_" + jjVar.E1();
            if (!this.r.containsKey(str)) {
                TLRPC.TL_messages_sendVote tL_messages_sendVote = new TLRPC.TL_messages_sendVote();
                tL_messages_sendVote.msg_id = jjVar.f1();
                tL_messages_sendVote.peer = getMessagesController().i1(jj.B0(jjVar.k));
                if (arrayList != null) {
                    bArr = new byte[arrayList.size()];
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) arrayList.get(i10);
                        if (pollAnswer != null) {
                            tL_messages_sendVote.options.add(pollAnswer.option);
                            bArr[i10] = pollAnswer.option[0];
                        }
                    }
                } else {
                    bArr = new byte[0];
                }
                this.w.put(str, bArr);
                return getConnectionsManager().sendRequest(tL_messages_sendVote, new r6(this, jjVar, str, runnable, 5));
            }
        }
        return 0;
    }

    public final cz y(int i10, long j10) {
        int f12;
        Iterator it = this.a.entrySet().iterator();
        cz czVar = null;
        int i11 = TLObject.FLAG_31;
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) ((Map.Entry) it.next()).getValue();
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                cz czVar2 = (cz) arrayList.get(i12);
                int i13 = czVar2.e;
                if ((i13 == 4 || i13 == 0) && czVar2.a == j10) {
                    jj jjVar = czVar2.m;
                    if (jjVar != null) {
                        f12 = jjVar.f1();
                    } else {
                        ArrayList arrayList2 = czVar2.x;
                        f12 = (arrayList2 == null || arrayList2.isEmpty()) ? 0 : ((jj) i0.a.g(1, czVar2.x)).f1();
                    }
                    if (f12 != 0 && f12 > i10 && czVar == null && i11 < f12) {
                        czVar = czVar2;
                        i11 = f12;
                    }
                }
            }
        }
        return czVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:366:0x0819, code lost:
    
        if (r10.h > 90) goto L404;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0a9c  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0af7  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0b66  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0b69  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0a9f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z0(jj jjVar, TLRPC.Message message, int i10, List list, boolean z10, int i11, HashMap hashMap) {
        List list2;
        String str;
        qz qzVar;
        jj jjVar2;
        TLRPC.Message message2;
        boolean z11;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia;
        TLRPC.PhotoSize photoSize;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia2;
        boolean z12;
        String str2;
        String str3;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia3;
        String str4;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        byte[] bArr;
        TLRPC.Message message3;
        String str5;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia4;
        String str6;
        jj jjVar3;
        TLRPC.Photo photo;
        boolean z13;
        TLRPC.Photo photo2;
        String str7;
        String str8;
        String str9;
        TLRPC.PhotoSize photoSize2;
        TLRPC.Photo photo3;
        TLRPC.PhotoSize photoSize3;
        int i12;
        boolean z14;
        TLRPC.Photo photo4;
        int i13;
        String str10;
        File file;
        x20 x20Var;
        TLRPC.MessageMedia messageMedia2;
        String str11;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia5;
        TLRPC.PhotoSize photoSize4;
        int i14;
        TLRPC.Message message4;
        int i15;
        int i16;
        String str12;
        File file2;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia6;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia7;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia8;
        TLRPC.PhotoSize photoSize5;
        TLObject tLObject;
        boolean z15;
        TLRPC.PhotoSize photoSize6;
        TLObject tLObject2;
        TLRPC.PhotoSize photoSize7;
        TLRPC.Document document;
        TLRPC.Photo photo5;
        TLRPC.PhotoSize w9;
        TLRPC.MessageMedia messageMedia3;
        TLRPC.WebPage webPage;
        TLRPC.Document document2;
        TLRPC.MessageMedia messageMedia4;
        TLRPC.WebPage webPage2;
        TLRPC.Photo photo6;
        TLRPC.MessageMedia messageMedia5;
        TLRPC.Document document3;
        TLRPC.MessageMedia messageMedia6;
        TLRPC.Photo photo7;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia9;
        TLRPC.MessageMedia messageMedia7;
        String sb2;
        qz qzVar2 = this;
        TLRPC.Message message5 = message;
        TLRPC.Message message6 = jjVar.k;
        if (list.isEmpty() || Math.max(0, i11) >= list.size()) {
            list2 = list;
            str = null;
        } else {
            list2 = list;
            str = (String) list2.get(Math.max(0, i11));
        }
        TLRPC.MessageMedia messageMedia8 = message5 == null ? null : message5.media;
        TLRPC.MessageMedia messageMedia9 = message6 == null ? null : message6.media;
        TLRPC.MessageMedia messageMedia10 = message6.media;
        if (messageMedia10 != null) {
            if (messageMedia10.storyItem != null) {
                message5.media = messageMedia10;
            } else if (!(messageMedia10 instanceof TLRPC.TL_messageMediaWidget)) {
                if (jjVar.C3()) {
                    TLRPC.MessageMedia messageMedia11 = message5.media;
                    if (messageMedia11 instanceof TLRPC.TL_messageMediaGeoLive) {
                        message6.media.period = messageMedia11.period;
                    }
                }
                if (jjVar.T2()) {
                    TLRPC.TL_messageMediaDice tL_messageMediaDice = (TLRPC.TL_messageMediaDice) message6.media;
                    TLRPC.TL_messageMediaDice tL_messageMediaDice2 = (TLRPC.TL_messageMediaDice) message5.media;
                    tL_messageMediaDice.value = tL_messageMediaDice2.value;
                    tL_messageMediaDice.flags = tL_messageMediaDice2.flags;
                    tL_messageMediaDice.game_outcome = tL_messageMediaDice2.game_outcome;
                    rh.e6.y(qzVar2.currentAccount, true).O();
                } else {
                    TLRPC.MessageMedia messageMedia12 = message6.media;
                    TLRPC.Photo photo8 = messageMedia12.photo;
                    if (photo8 != null) {
                        photoSize5 = b8.w(photo8.sizes, 40, false, null, false);
                        w9 = (message5 == null || (messageMedia6 = message5.media) == null || (photo7 = messageMedia6.photo) == null) ? photoSize5 : b8.w(photo7.sizes, 40, false, null, false);
                        tLObject = message6.media.photo;
                    } else {
                        TLRPC.Document document4 = messageMedia12.document;
                        if (document4 != null) {
                            photoSize5 = b8.w(document4.thumbs, 40, false, null, false);
                            w9 = (message5 == null || (messageMedia5 = message5.media) == null || (document3 = messageMedia5.document) == null) ? photoSize5 : b8.w(document3.thumbs, 40, false, null, false);
                            tLObject = message6.media.document;
                        } else {
                            TLRPC.WebPage webPage3 = messageMedia12.webpage;
                            if (webPage3 != null) {
                                TLRPC.Photo photo9 = webPage3.photo;
                                if (photo9 != null) {
                                    photoSize5 = b8.w(photo9.sizes, 40, false, null, false);
                                    w9 = (message5 == null || (messageMedia4 = message5.media) == null || (webPage2 = messageMedia4.webpage) == null || (photo6 = webPage2.photo) == null) ? photoSize5 : b8.w(photo6.sizes, 40, false, null, false);
                                    tLObject = message6.media.webpage.photo;
                                } else {
                                    TLRPC.Document document5 = webPage3.document;
                                    if (document5 != null) {
                                        photoSize5 = b8.w(document5.thumbs, 40, false, null, false);
                                        w9 = (message5 == null || (messageMedia3 = message5.media) == null || (webPage = messageMedia3.webpage) == null || (document2 = webPage.document) == null) ? photoSize5 : b8.w(document2.thumbs, 40, false, null, false);
                                        tLObject = message6.media.webpage.document;
                                    }
                                }
                            } else if ((messageMedia12 instanceof TLRPC.TL_messageMediaPaidMedia) && (messageMedia8 instanceof TLRPC.TL_messageMediaPaidMedia)) {
                                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia12;
                                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageMedia8;
                                if (!tL_messageMediaPaidMedia.extended_media.isEmpty() && !tL_messageMediaPaidMedia2.extended_media.isEmpty()) {
                                    if (i11 == -1) {
                                        int i17 = 0;
                                        while (i17 < tL_messageMediaPaidMedia.extended_media.size()) {
                                            qzVar2.z0(jjVar, message5, i10, list2, z10, i17, message5.params);
                                            i17++;
                                            qzVar2 = qzVar2;
                                            list2 = list;
                                        }
                                    } else {
                                        qzVar = qzVar2;
                                        jjVar2 = jjVar;
                                        z11 = z10;
                                        boolean z16 = tL_messageMediaPaidMedia2.extended_media.size() > 1;
                                        if (i11 < 0 || i11 >= tL_messageMediaPaidMedia2.extended_media.size()) {
                                            return;
                                        }
                                        TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia2.extended_media.get(i11);
                                        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                            TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia10 = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia;
                                            tL_messageExtendedMedia7 = tL_messageExtendedMedia10;
                                            messageMedia8 = tL_messageExtendedMedia10.media;
                                        } else {
                                            tL_messageExtendedMedia7 = null;
                                        }
                                        TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia.extended_media.get(i11);
                                        if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                                            TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia11 = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia2;
                                            messageMedia9 = tL_messageExtendedMedia11.media;
                                            TLRPC.Photo photo10 = messageMedia9.photo;
                                            if (photo10 != null) {
                                                z15 = z16;
                                                TLRPC.PhotoSize w10 = b8.w(photo10.sizes, 40, false, null, false);
                                                photoSize = (messageMedia8 == null || (photo5 = messageMedia8.photo) == null) ? w10 : b8.w(photo5.sizes, 40, false, null, false);
                                                tLObject2 = messageMedia9.photo;
                                                photoSize6 = w10;
                                            } else {
                                                z15 = z16;
                                                TLRPC.Document document6 = messageMedia9.document;
                                                if (document6 != null) {
                                                    TLRPC.PhotoSize w11 = b8.w(document6.thumbs, 40, false, null, false);
                                                    if (messageMedia8 == null || (document = messageMedia8.document) == null) {
                                                        photoSize7 = w11;
                                                        photoSize = photoSize7;
                                                    } else {
                                                        photoSize7 = w11;
                                                        photoSize = b8.w(document.thumbs, 40, false, null, false);
                                                    }
                                                    tLObject2 = messageMedia9.document;
                                                    photoSize6 = photoSize7;
                                                } else {
                                                    photoSize6 = null;
                                                    photoSize = null;
                                                    tLObject2 = null;
                                                }
                                            }
                                            photoSize5 = photoSize6;
                                            tL_messageExtendedMedia8 = tL_messageExtendedMedia11;
                                            TLObject tLObject3 = tLObject2;
                                            tL_messageExtendedMedia2 = tL_messageExtendedMedia7;
                                            tLObject = tLObject3;
                                            z12 = z15;
                                        } else {
                                            z12 = z16;
                                            tL_messageExtendedMedia2 = tL_messageExtendedMedia7;
                                            tL_messageExtendedMedia8 = null;
                                            photoSize5 = null;
                                            tLObject = null;
                                            photoSize = null;
                                        }
                                        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || !(photoSize5 instanceof TLRPC.TL_photoStrippedSize)) {
                                            tL_messageExtendedMedia9 = tL_messageExtendedMedia8;
                                            messageMedia7 = messageMedia8;
                                            message2 = message6;
                                        } else {
                                            StringBuilder sb3 = new StringBuilder("stripped");
                                            tL_messageExtendedMedia9 = tL_messageExtendedMedia8;
                                            sb3.append(w8.o(jjVar2));
                                            String sb4 = sb3.toString();
                                            if (message5 != null) {
                                                sb2 = "stripped" + w8.o(message5);
                                                messageMedia7 = messageMedia8;
                                                message2 = message6;
                                            } else {
                                                StringBuilder l4 = i0.a.l(i10, "strippedmessage", "_");
                                                messageMedia7 = messageMedia8;
                                                message2 = message6;
                                                l4.append(jj.v0(jjVar2.k));
                                                l4.append("_");
                                                l4.append(jjVar2.p1);
                                                sb2 = l4.toString();
                                            }
                                            hc.D().R(sb4, sb2, ic.f(photoSize, tLObject), z11);
                                        }
                                        tL_messageExtendedMedia = tL_messageExtendedMedia9;
                                        messageMedia = messageMedia7;
                                    }
                                }
                                return;
                            }
                        }
                    }
                    z12 = false;
                    photoSize = w9;
                    tL_messageExtendedMedia2 = null;
                    qzVar = qzVar2;
                    jjVar2 = jjVar;
                    tL_messageExtendedMedia8 = null;
                    z11 = z10;
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                    }
                    tL_messageExtendedMedia9 = tL_messageExtendedMedia8;
                    messageMedia7 = messageMedia8;
                    message2 = message6;
                    tL_messageExtendedMedia = tL_messageExtendedMedia9;
                    messageMedia = messageMedia7;
                }
            } else if (messageMedia8 instanceof TLRPC.TL_messageMediaWidget) {
                message6.media = messageMedia8;
            }
            qzVar = qzVar2;
            jjVar2 = jjVar;
            z11 = z10;
            tL_messageExtendedMedia8 = null;
            photoSize5 = null;
            tLObject = null;
            photoSize = null;
            tL_messageExtendedMedia2 = null;
            z12 = false;
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
            }
            tL_messageExtendedMedia9 = tL_messageExtendedMedia8;
            messageMedia7 = messageMedia8;
            message2 = message6;
            tL_messageExtendedMedia = tL_messageExtendedMedia9;
            messageMedia = messageMedia7;
        } else {
            qzVar = qzVar2;
            jjVar2 = jjVar;
            message2 = message6;
            z11 = z10;
            messageMedia = messageMedia8;
            tL_messageExtendedMedia = null;
            photoSize = null;
            tL_messageExtendedMedia2 = null;
            z12 = false;
        }
        if (message5 == null) {
            return;
        }
        String str13 = "s";
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia12 = tL_messageExtendedMedia2;
            if (messageMedia.photo != null && (messageMedia9 instanceof TLRPC.TL_messageMediaPhoto) && messageMedia9.photo != null) {
                if (messageMedia.ttl_seconds != 0 || jjVar2.p1 || jj.c3(message5)) {
                    str11 = "";
                    tL_messageExtendedMedia5 = tL_messageExtendedMedia;
                    photoSize4 = photoSize;
                } else {
                    boolean z17 = jjVar2.t1;
                    int i18 = messageMedia.document != null ? z17 ? 8 : 2 : z17 ? 6 : 0;
                    str11 = "";
                    hs messagesStorage = qzVar.getMessagesStorage();
                    tL_messageExtendedMedia5 = tL_messageExtendedMedia;
                    TLRPC.Photo photo11 = messageMedia.photo;
                    StringBuilder sb5 = new StringBuilder("sent_");
                    photoSize4 = photoSize;
                    sb5.append(message5.peer_id.channel_id);
                    sb5.append("_");
                    sb5.append(message5.id);
                    sb5.append("_");
                    sb5.append(o5.o(message5.peer_id));
                    sb5.append("_1_");
                    sb5.append(jj.q1(messageMedia9));
                    messagesStorage.l1(str, photo11, i18, sb5.toString());
                }
                if (messageMedia9.photo.sizes.size() == 1 && (messageMedia9.photo.sizes.get(0).location instanceof TLRPC.TL_fileLocationUnavailable)) {
                    messageMedia9.photo.sizes = messageMedia.photo.sizes;
                } else {
                    int i19 = 0;
                    while (i19 < messageMedia9.photo.sizes.size()) {
                        TLRPC.PhotoSize photoSize8 = messageMedia9.photo.sizes.get(i19);
                        if (photoSize8 == null || photoSize8.location == null || photoSize8.type == null) {
                            i14 = i19;
                            message4 = message5;
                        } else {
                            int i20 = 0;
                            while (i20 < messageMedia.photo.sizes.size()) {
                                TLRPC.PhotoSize photoSize9 = messageMedia.photo.sizes.get(i20);
                                if (photoSize9 == null || photoSize9.location == null || (photoSize9 instanceof TLRPC.TL_photoSizeEmpty) || (str12 = photoSize9.type) == null) {
                                    i16 = i19;
                                } else {
                                    int i21 = i19;
                                    if ((photoSize8.location.volume_id == -2147483648L && str12.equals(photoSize8.type)) || (photoSize9.w == photoSize8.w && photoSize9.h == photoSize8.h)) {
                                        String str14 = photoSize8.location.volume_id + "_" + photoSize8.location.local_id;
                                        String str15 = photoSize9.location.volume_id + "_" + photoSize9.location.local_id;
                                        if (str14.equals(str15)) {
                                            i15 = i21;
                                        } else {
                                            File file3 = new File(b8.z(4), str14.concat(".jpg"));
                                            if (messageMedia.ttl_seconds != 0 || ((messageMedia.photo.sizes.size() != 1 && photoSize9.w <= 90 && photoSize9.h <= 90) || z12)) {
                                                i15 = i21;
                                                file2 = new File(b8.z(4), sc.e.A(str15, ".jpg"));
                                            } else {
                                                b8.G(qzVar.currentAccount);
                                                file2 = b8.I(photoSize9);
                                                i15 = i21;
                                            }
                                            file3.renameTo(file2);
                                            hc.D().R(str14, str15, ic.i(photoSize9, messageMedia.photo), z11);
                                            photoSize8.location = photoSize9.location;
                                            photoSize8.size = photoSize9.size;
                                        }
                                        message4 = message;
                                        i14 = i15;
                                    } else {
                                        i16 = i21;
                                    }
                                }
                                i20++;
                                i19 = i16;
                            }
                            i15 = i19;
                            String str16 = photoSize8.location.volume_id + "_" + photoSize8.location.local_id;
                            new File(b8.z(4), sc.e.A(str16, ".jpg")).delete();
                            if ("s".equals(photoSize8.type) && photoSize4 != null) {
                                i14 = i15;
                                TLRPC.PhotoSize photoSize10 = photoSize4;
                                messageMedia9.photo.sizes.set(i14, photoSize10);
                                ic i22 = ic.i(photoSize10, messageMedia.photo);
                                message4 = message;
                                hc.D().R(str16, i22.q(message4, null, false), i22, z11);
                            }
                            message4 = message;
                            i14 = i15;
                        }
                        i19 = i14 + 1;
                        message5 = message4;
                    }
                }
                TLRPC.Message message7 = message5;
                if (!jjVar2.D3()) {
                    TLRPC.Message message8 = message2;
                    TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia13 = tL_messageExtendedMedia5;
                    if (!z12) {
                        message8.message = message7.message;
                        message7.attachPath = message8.attachPath;
                    } else if (tL_messageExtendedMedia13 != null && tL_messageExtendedMedia12 != null) {
                        tL_messageExtendedMedia13.attachPath = tL_messageExtendedMedia12.attachPath;
                    }
                    TLRPC.Photo photo12 = messageMedia9.photo;
                    TLRPC.Photo photo13 = messageMedia.photo;
                    photo12.id = photo13.id;
                    photo12.dc_id = photo13.dc_id;
                    photo12.access_hash = photo13.access_hash;
                    return;
                }
                String str17 = jjVar2.k.attachPath;
                String str18 = hashMap != null ? (String) Map.-EL.getOrDefault(hashMap, "imagePath", null) : null;
                TLRPC.Photo photo14 = messageMedia9.photo;
                TLRPC.Photo photo15 = messageMedia.photo;
                photo14.id = photo15.id;
                photo14.dc_id = photo15.dc_id;
                photo14.access_hash = photo15.access_hash;
                if (str18 != null && str18.startsWith(b8.z(4).getAbsolutePath())) {
                    File file4 = new File(str18);
                    b8.G(qzVar.currentAccount);
                    if (file4.renameTo(b8.K(messageMedia.photo, null, messageMedia.ttl_seconds != 0, true))) {
                        jjVar2.x0 = jjVar2.w0;
                        jjVar2.w0 = false;
                    }
                }
                TLRPC.Document document7 = message7.media.document;
                if (document7 != null) {
                    TLRPC.MessageMedia messageMedia13 = jjVar2.k.media;
                    messageMedia13.flags |= 16;
                    messageMedia13.document = document7;
                }
                if (str17 == null || !str17.startsWith(b8.z(4).getAbsolutePath())) {
                    TLRPC.Message message9 = message2;
                    TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia14 = tL_messageExtendedMedia5;
                    if (tL_messageExtendedMedia14 != null) {
                        tL_messageExtendedMedia14.attachPath = str17;
                        return;
                    } else {
                        message7.attachPath = str17;
                        message7.message = message9.message;
                        return;
                    }
                }
                File file5 = new File(str17);
                b8.G(qzVar.currentAccount);
                File K2 = b8.K(messageMedia.document, null, messageMedia.ttl_seconds != 0, true);
                if (file5.renameTo(K2)) {
                    TLRPC.Message message10 = message2;
                    TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia15 = tL_messageExtendedMedia5;
                    jjVar2.x0 = jjVar2.w0;
                    jjVar2.w0 = false;
                    if (tL_messageExtendedMedia15 != null) {
                        tL_messageExtendedMedia15.attachPath = str11;
                        return;
                    } else {
                        message10.attachPath = str11;
                        return;
                    }
                }
                if (!file5.exists()) {
                    tL_messageExtendedMedia6 = tL_messageExtendedMedia5;
                    if (tL_messageExtendedMedia6 == null) {
                        jjVar2.w0 = false;
                    }
                } else if (tL_messageExtendedMedia5 != null) {
                    tL_messageExtendedMedia6 = tL_messageExtendedMedia5;
                    tL_messageExtendedMedia6.attachPath = str17;
                } else {
                    tL_messageExtendedMedia6 = tL_messageExtendedMedia5;
                    message7.attachPath = str17;
                }
                if (tL_messageExtendedMedia6 == null) {
                    jjVar2.x0 = K2.exists();
                }
                message7.message = message2.message;
                return;
            }
        }
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia16 = tL_messageExtendedMedia;
        TLRPC.Message message11 = message2;
        if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument) || messageMedia.document == null || !(messageMedia9 instanceof TLRPC.TL_messageMediaDocument) || messageMedia9.document == null) {
            TLRPC.MessageMedia messageMedia14 = message5.media;
            if ((messageMedia14 instanceof TLRPC.TL_messageMediaContact) && (message11.media instanceof TLRPC.TL_messageMediaContact)) {
                message11.media = messageMedia14;
                return;
            }
            if (messageMedia14 instanceof TLRPC.TL_messageMediaWebPage) {
                message11.media = messageMedia14;
                return;
            }
            if (messageMedia14 instanceof TLRPC.TL_messageMediaGeo) {
                TLRPC.GeoPoint geoPoint = messageMedia14.geo;
                TLRPC.GeoPoint geoPoint2 = message11.media.geo;
                geoPoint.lat = geoPoint2.lat;
                geoPoint._long = geoPoint2._long;
                return;
            }
            if (!(messageMedia14 instanceof TLRPC.TL_messageMediaGame) && !(messageMedia14 instanceof TLRPC.TL_messageMediaInvoice)) {
                if (messageMedia14 instanceof TLRPC.TL_messageMediaPoll) {
                    message11.media = messageMedia14;
                    return;
                }
                return;
            }
            message11.media = messageMedia14;
            if (!TextUtils.isEmpty(message5.message)) {
                message11.entities = message5.entities;
                message11.message = message5.message;
            }
            TLRPC.ReplyMarkup replyMarkup = message5.reply_markup;
            if (replyMarkup != null) {
                message11.reply_markup = replyMarkup;
                message11.flags |= 64;
                return;
            }
            return;
        }
        if (messageMedia.ttl_seconds == 0 && ((x20Var = jjVar2.p0) == null || (x20Var.G == null && TextUtils.isEmpty(x20Var.B) && jjVar2.p0.H == null))) {
            boolean L4 = jj.L4(message5);
            if (L4 || jj.t3(message5)) {
                str2 = "";
                if (jj.s3(messageMedia.document, false) == jj.s3(messageMedia9.document, false)) {
                    if (jjVar2.p1 || jj.c3(message5)) {
                        str3 = ".jpg";
                        messageMedia2 = messageMedia;
                        tL_messageExtendedMedia3 = tL_messageExtendedMedia16;
                    } else {
                        jj jjVar4 = new jj(qzVar.currentAccount, message5, false, false);
                        hs messagesStorage2 = qzVar.getMessagesStorage();
                        TLRPC.Document document8 = messageMedia.document;
                        tL_messageExtendedMedia3 = tL_messageExtendedMedia16;
                        StringBuilder sb6 = new StringBuilder("sent_");
                        str3 = ".jpg";
                        messageMedia2 = messageMedia;
                        sb6.append(message5.peer_id.channel_id);
                        sb6.append("_");
                        sb6.append(message5.id);
                        sb6.append("_");
                        sb6.append(o5.o(message5.peer_id));
                        sb6.append("_");
                        sb6.append(jjVar4.D);
                        sb6.append("_");
                        sb6.append(jjVar4.T1());
                        messagesStorage2.l1(str, document8, 2, sb6.toString());
                    }
                    if (L4) {
                        message5.attachPath = message11.attachPath;
                    }
                    messageMedia = messageMedia2;
                }
            } else {
                str2 = "";
            }
            str3 = ".jpg";
            messageMedia2 = messageMedia;
            tL_messageExtendedMedia3 = tL_messageExtendedMedia16;
            if (!jj.R4(message5) && !jj.j4(message5) && !jjVar2.p1 && !jj.c3(message5)) {
                jj jjVar5 = new jj(qzVar.currentAccount, message5, false, false);
                messageMedia = messageMedia2;
                qzVar.getMessagesStorage().l1(str, messageMedia.document, 1, "sent_" + message5.peer_id.channel_id + "_" + message5.id + "_" + o5.o(message5.peer_id) + "_" + jjVar5.D + "_" + jjVar5.T1());
            }
            messageMedia = messageMedia2;
        } else {
            str2 = "";
            str3 = ".jpg";
            tL_messageExtendedMedia3 = tL_messageExtendedMedia16;
        }
        TLRPC.Photo photo16 = messageMedia9.video_cover;
        if (photo16 == null || (photo = messageMedia.video_cover) == null) {
            boolean z18 = z11;
            str4 = str;
            String str19 = str3;
            TLRPC.PhotoSize w12 = b8.w(messageMedia9.document.thumbs, zs.r5, false, null, false);
            TLRPC.PhotoSize w13 = b8.w(messageMedia.document.thumbs, zs.r5, false, null, false);
            if (w12 != null && (fileLocation2 = w12.location) != null && fileLocation2.volume_id == -2147483648L && w13 != null && w13.location != null && !(w13 instanceof TLRPC.TL_photoSizeEmpty) && !(w12 instanceof TLRPC.TL_photoSizeEmpty)) {
                String str20 = w12.location.volume_id + "_" + w12.location.local_id;
                String str21 = w13.location.volume_id + "_" + w13.location.local_id;
                if (!str20.equals(str21)) {
                    new File(b8.z(4), str20.concat(str19)).renameTo(new File(b8.z(4), sc.e.A(str21, str19)));
                    hc.D().R(str20, str21, ic.c(w13, messageMedia.document), z18);
                    w12.location = w13.location;
                    w12.size = w13.size;
                }
            } else if (w13 != null && w12 != null && jj.w4(message5) && (fileLocation = w12.location) != null) {
                w13.location = fileLocation;
            } else if (w12 == null || (w12.location instanceof TLRPC.TL_fileLocationUnavailable) || (w12 instanceof TLRPC.TL_photoSizeEmpty)) {
                messageMedia9.document.thumbs = messageMedia.document.thumbs;
            }
        } else {
            b8.w(photo16.sizes, 40, false, null, false);
            TLRPC.PhotoSize w14 = b8.w(photo.sizes, 40, false, null, false);
            if (photo16.sizes.size() == 1 && (photo16.sizes.get(0).location instanceof TLRPC.TL_fileLocationUnavailable)) {
                photo16.sizes = photo.sizes;
            } else {
                int i23 = 0;
                while (i23 < photo16.sizes.size()) {
                    TLRPC.PhotoSize photoSize11 = photo16.sizes.get(i23);
                    if (photoSize11 == null || photoSize11.location == null || photoSize11.type == null) {
                        z13 = z11;
                        photo2 = photo16;
                        str7 = str13;
                        str8 = str;
                        str9 = str3;
                        photoSize2 = w14;
                    } else {
                        str8 = str;
                        int i24 = 0;
                        while (i24 < photo.sizes.size()) {
                            TLRPC.PhotoSize photoSize12 = photo.sizes.get(i24);
                            if (photoSize12 != null) {
                                i13 = i24;
                                if (photoSize12.location == null || (photoSize12 instanceof TLRPC.TL_photoSizeEmpty) || (str10 = photoSize12.type) == null) {
                                    z14 = z11;
                                    photo4 = photo16;
                                    photoSize3 = w14;
                                    i12 = i23;
                                } else {
                                    photoSize3 = w14;
                                    i12 = i23;
                                    if ((photoSize11.location.volume_id == -2147483648L && str10.equals(photoSize11.type)) || (photoSize12.w == photoSize11.w && photoSize12.h == photoSize11.h)) {
                                        StringBuilder sb7 = new StringBuilder();
                                        TLRPC.Photo photo17 = photo16;
                                        sb7.append(photoSize11.location.volume_id);
                                        sb7.append("_");
                                        sb7.append(photoSize11.location.local_id);
                                        String sb8 = sb7.toString();
                                        String str22 = photoSize12.location.volume_id + "_" + photoSize12.location.local_id;
                                        if (sb8.equals(str22)) {
                                            z13 = z10;
                                            photo3 = photo17;
                                            str9 = str3;
                                        } else {
                                            photo3 = photo17;
                                            str9 = str3;
                                            File file6 = new File(b8.z(4), sb8.concat(str9));
                                            if (messageMedia.ttl_seconds == 0) {
                                                if (photo.sizes.size() != 1) {
                                                    if (photoSize12.w <= 90) {
                                                    }
                                                }
                                                if (!z12) {
                                                    b8.G(qzVar.currentAccount);
                                                    file = b8.K(photoSize12, null, true, true);
                                                    file6.renameTo(file);
                                                    z13 = z10;
                                                    hc.D().R(sb8, str22, ic.i(photoSize12, photo), z13);
                                                    photoSize11.location = photoSize12.location;
                                                    photoSize11.size = photoSize12.size;
                                                }
                                            }
                                            file = new File(b8.z(4), sc.e.A(str22, str9));
                                            file6.renameTo(file);
                                            z13 = z10;
                                            hc.D().R(sb8, str22, ic.i(photoSize12, photo), z13);
                                            photoSize11.location = photoSize12.location;
                                            photoSize11.size = photoSize12.size;
                                        }
                                        photoSize2 = photoSize3;
                                        i23 = i12;
                                        photo2 = photo3;
                                        str7 = str13;
                                    } else {
                                        z14 = z11;
                                        photo4 = photo16;
                                    }
                                }
                            } else {
                                z14 = z11;
                                photo4 = photo16;
                                photoSize3 = w14;
                                i12 = i23;
                                i13 = i24;
                            }
                            w14 = photoSize3;
                            i23 = i12;
                            photo16 = photo4;
                            str3 = str3;
                            i24 = i13 + 1;
                            z11 = z14;
                            qzVar = this;
                        }
                        z13 = z11;
                        photo3 = photo16;
                        photoSize3 = w14;
                        i12 = i23;
                        str9 = str3;
                        String str23 = photoSize11.location.volume_id + "_" + photoSize11.location.local_id;
                        new File(b8.z(4), sc.e.A(str23, str9)).delete();
                        if (str13.equals(photoSize11.type) && photoSize3 != null) {
                            photo2 = photo3;
                            i23 = i12;
                            photo2.sizes.set(i23, photoSize3);
                            ic i25 = ic.i(photoSize3, photo);
                            str7 = str13;
                            photoSize2 = photoSize3;
                            hc.D().R(str23, i25.q(message5, null, false), i25, z13);
                        }
                        photoSize2 = photoSize3;
                        i23 = i12;
                        photo2 = photo3;
                        str7 = str13;
                    }
                    i23++;
                    str13 = str7;
                    z11 = z13;
                    photo16 = photo2;
                    str = str8;
                    w14 = photoSize2;
                    qzVar = this;
                    str3 = str9;
                }
            }
            TLRPC.Photo photo18 = photo16;
            str4 = str;
            photo18.id = photo.id;
            photo18.dc_id = photo.dc_id;
            photo18.access_hash = photo.access_hash;
        }
        TLRPC.Document document9 = messageMedia9.document;
        TLRPC.Document document10 = messageMedia.document;
        document9.dc_id = document10.dc_id;
        document9.id = document10.id;
        document9.access_hash = document10.access_hash;
        int i26 = 0;
        while (true) {
            if (i26 >= messageMedia9.document.attributes.size()) {
                bArr = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = messageMedia9.document.attributes.get(i26);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                bArr = documentAttribute.waveform;
                break;
            }
            i26++;
        }
        messageMedia9.document.attributes = messageMedia.document.attributes;
        if (bArr != null) {
            for (int i27 = 0; i27 < messageMedia9.document.attributes.size(); i27++) {
                TLRPC.DocumentAttribute documentAttribute2 = messageMedia9.document.attributes.get(i27);
                if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                    documentAttribute2.waveform = bArr;
                    documentAttribute2.flags |= 4;
                }
            }
        }
        TLRPC.Document document11 = messageMedia9.document;
        TLRPC.Document document12 = messageMedia.document;
        document11.size = document12.size;
        document11.mime_type = document12.mime_type;
        if ((message5.flags & 4) == 0 && ((message5.out || message5.dialog_id == getUserConfig().e()) && !jj.b4(message5))) {
            if (jj.M3(messageMedia.document)) {
                if (jj.V2(messageMedia.document) ? getMessagesController().S3 : true) {
                    getMediaDataController().c(messageMedia.document, message5.date, true);
                }
            } else if (jj.u4(messageMedia.document) || jj.K2(messageMedia.document, true)) {
                ui mediaDataController = getMediaDataController();
                TLRPC.Document document13 = messageMedia.document;
                int i28 = message5.date;
                message3 = message5;
                str5 = str2;
                mediaDataController.d(0, message3, document13, i28, false);
                tL_messageExtendedMedia4 = tL_messageExtendedMedia3;
                str6 = tL_messageExtendedMedia3 == null ? tL_messageExtendedMedia4.attachPath : message11.attachPath;
                if (str6 != null || !str6.startsWith(b8.z(4).getAbsolutePath()) || jj.s3(messageMedia.document, false)) {
                    if (tL_messageExtendedMedia4 == null) {
                        tL_messageExtendedMedia4.attachPath = str6;
                        return;
                    } else {
                        message3.attachPath = str6;
                        message3.message = message11.message;
                        return;
                    }
                }
                File file7 = new File(str6);
                b8.G(this.currentAccount);
                File K3 = b8.K(messageMedia.document, null, messageMedia.ttl_seconds != 0, true);
                if (!file7.renameTo(K3)) {
                    if (file7.exists()) {
                        if (tL_messageExtendedMedia4 != null) {
                            tL_messageExtendedMedia4.attachPath = str6;
                        } else {
                            message3.attachPath = str6;
                        }
                    } else if (tL_messageExtendedMedia4 == null) {
                        jjVar3 = jjVar;
                        jjVar3.w0 = false;
                        if (tL_messageExtendedMedia4 == null) {
                            jjVar3.x0 = K3.exists();
                        }
                        message3.message = message11.message;
                        return;
                    }
                    jjVar3 = jjVar;
                    if (tL_messageExtendedMedia4 == null) {
                    }
                    message3.message = message11.message;
                    return;
                }
                if (jj.L4(message3)) {
                    jjVar.w0 = true;
                    return;
                }
                jjVar.x0 = jjVar.w0;
                jjVar.w0 = false;
                if (tL_messageExtendedMedia4 != null) {
                    tL_messageExtendedMedia4.attachPath = str5;
                } else {
                    message11.attachPath = str5;
                }
                if (str4 != null) {
                    String str24 = str4;
                    if (str24.startsWith("http")) {
                        hs messagesStorage3 = getMessagesStorage();
                        String file8 = K3.toString();
                        TLRPC.Document document14 = messageMedia9.document;
                        messagesStorage3.getClass();
                        if (str24.length() != 0) {
                            if ((file8 == null || file8.length() == 0) && document14 == null) {
                                return;
                            }
                            messagesStorage3.a.c(new ul(messagesStorage3, document14, str24, file8, 21));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        message3 = message5;
        str5 = str2;
        tL_messageExtendedMedia4 = tL_messageExtendedMedia3;
        if (tL_messageExtendedMedia3 == null) {
        }
        if (str6 != null) {
        }
        if (tL_messageExtendedMedia4 == null) {
        }
    }
}
