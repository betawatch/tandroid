package org.telegram.messenger;

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
import org.telegram.ui.d80;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class az extends c1 implements gs {
    public static final q5 J = new q5("mediaSendQueue");
    public static final ThreadPoolExecutor K;
    public static volatile az[] L;
    public final a0.h E;
    public final HashMap F;
    public final HashMap G;
    public final a8.b8 H;
    public final HashMap I;
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
        K = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        L = new az[4];
    }

    public az(int i7) {
        super(i7);
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
        this.E = new a0.h();
        this.F = new HashMap();
        this.G = new HashMap();
        this.H = new a8.b8(new hi.t5(this, 28));
        this.I = new HashMap();
        g0.g3(new yr(this, 12));
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
        for (int i7 = 0; i7 < size; i7++) {
            message.entities.get(i7).serializeToStream(serializedData);
        }
    }

    public static az C(int i7) {
        az azVar;
        az azVar2 = L[i7];
        if (azVar2 != null) {
            return azVar2;
        }
        synchronized (az.class) {
            try {
                azVar = L[i7];
                if (azVar == null) {
                    az[] azVarArr = L;
                    az azVar3 = new az(i7);
                    azVarArr[i7] = azVar3;
                    azVar = azVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return azVar;
    }

    public static String D(c cVar, TLRPC.PhotoSize photoSize, Bitmap[] bitmapArr, boolean z10, boolean z11) {
        if (photoSize == null || photoSize.location == null) {
            return null;
        }
        PointF Q1 = org.telegram.ui.Cells.r1.Q1(photoSize.w, photoSize.h, 0, 0);
        if (bitmapArr != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                w7.G(cVar.a);
                File J2 = w7.J(photoSize, null, z11, true);
                FileInputStream fileInputStream = new FileInputStream(J2);
                BitmapFactory.decodeStream(fileInputStream, null, options);
                fileInputStream.close();
                float max = Math.max(options.outWidth / Q1.x, options.outHeight / Q1.y);
                if (max < 1.0f) {
                    max = 1.0f;
                }
                options.inJustDecodeBounds = false;
                options.inSampleSize = (int) max;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                FileInputStream fileInputStream2 = new FileInputStream(J2);
                bitmapArr[0] = BitmapFactory.decodeStream(fileInputStream2, null, options);
                fileInputStream2.close();
            } catch (Throwable unused) {
            }
        }
        return String.format(Locale.US, z10 ? "%d_%d@%d_%d_b" : "%d_%d@%d_%d", Long.valueOf(photoSize.location.volume_id), Integer.valueOf(photoSize.location.local_id), Integer.valueOf((int) (Q1.x / g0.p)), Integer.valueOf((int) (Q1.y / g0.p)));
    }

    public static long E() {
        long j3 = 0;
        while (j3 == 0) {
            j3 = Utilities.b.nextLong();
        }
        return j3;
    }

    public static TLRPC.PhotoSize G(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) arrayList.get(i7);
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
        CharSequence n1 = g0.n1(charSequence);
        if (n1.length() == 0) {
            return n1;
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
    public static void K(ArrayList arrayList, final long j3, boolean z10, boolean z11, boolean z12, final c cVar, long j10, final gj gjVar, final TLRPC.TL_inputPollAnswer tL_inputPollAnswer, final gj gjVar2, final gj gjVar3, final boolean z13, final int i7, final int i10, final TL_stories.StoryItem storyItem, final org.telegram.ui.rm rmVar, final cw cwVar, final long j11, final boolean z14, final long j12, final long j13, final lj ljVar, final sh.f fVar, boolean z15, org.telegram.ui.Components.qf qfVar, final boolean z16) {
        String str;
        String str2;
        ?? r52;
        String str3;
        String str4;
        HashMap hashMap;
        boolean z17;
        int i11;
        jf jfVar;
        int i12;
        ArrayList arrayList2;
        int i13;
        HashMap hashMap2;
        String str5;
        String str6;
        String str7;
        long j14;
        int i14;
        HashMap hashMap3;
        long j15;
        boolean z18;
        String str8;
        f20 f20Var;
        String str9;
        boolean z19;
        String str10;
        int i15;
        ArrayList arrayList3;
        long j16;
        boolean z20;
        String str11;
        String str12;
        String str13;
        File file;
        String str14;
        Object obj;
        boolean z21;
        f20 f20Var2;
        String str15;
        long j17;
        String str16;
        TLRPC.TL_document tL_document;
        String str17;
        zy zyVar;
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
        int i16;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize q10;
        final HashMap hashMap4;
        String str21;
        int i17;
        int i18;
        long j18;
        int i19;
        ArrayList arrayList4;
        int i20;
        int size;
        int i21;
        boolean z22;
        Object obj8;
        String str22;
        char c10;
        String str23;
        Bitmap decodeFile;
        Object obj9;
        Object obj10;
        int i22;
        TLRPC.PhotoSize photoSize2;
        String str24;
        TLRPC.TL_document tL_document2;
        f20 f20Var3;
        f20 f20Var4;
        String str25;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        String str26;
        Object obj11;
        int i23;
        int i24;
        TLRPC.FileLocation fileLocation;
        String str27;
        Bitmap decodeFile2;
        Bitmap createBitmap;
        File file2;
        jf jfVar2;
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
        int i25;
        String str39;
        String str40;
        TLRPC.TL_photo tL_photo;
        String str41;
        final TLRPC.TL_photo tL_photo2;
        String str42;
        int i26;
        TLRPC.TL_photo tL_photo3;
        String str43;
        Object[] g02;
        Object obj18;
        int i27;
        int i28;
        long j19;
        ArrayList arrayList5;
        int i29;
        int i30;
        long j20;
        ArrayList arrayList6;
        Uri uri;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        Uri uri2;
        Uri uri3;
        boolean z24;
        long j21;
        int i31;
        File file3;
        TLRPC.TL_document tL_document3;
        HashMap hashMap5;
        Object obj19;
        boolean z25;
        File file4;
        final TLRPC.TL_document tL_document4;
        String str44;
        File file5;
        int i32;
        Bitmap r10;
        String str45;
        String str46;
        int i33;
        String str47;
        boolean z26;
        boolean z27;
        String str48;
        String str49;
        zy zyVar2;
        boolean z28;
        TLRPC.TL_photo tL_photo4;
        String str50;
        int i34;
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
        int i35 = 0;
        while (true) {
            str = ".jpeg";
            str2 = "-2147483648_";
            r52 = 1;
            if (i35 >= size2) {
                break;
            }
            zy zyVar3 = (zy) arrayList7.get(i35);
            if (zyVar3.c != null && zyVar3.p && zyVar3.q) {
                File file6 = new File(zyVar3.c);
                File file7 = new File(w7.z(4), "-2147483648_" + cz.p() + ".jpeg");
                long j22 = zyVar3.z;
                try {
                    if (TextUtils.isEmpty(zyVar3.b)) {
                        m(0L, j22, file6, file7);
                        zyVar3.c = file7.getAbsolutePath();
                        Pair L0 = g0.L0(file7);
                        if (((Integer) L0.first).intValue() != 0 && (decodeFile3 = BitmapFactory.decodeFile(file7.getAbsolutePath())) != null) {
                            int intValue = ((Integer) L0.second).intValue();
                            Matrix matrix = new Matrix();
                            matrix.postScale(intValue == 1 ? -1.0f : 1.0f, intValue == 2 ? -1.0f : 1.0f, decodeFile3.getWidth() / 2.0f, decodeFile3.getHeight() / 2.0f);
                            matrix.postRotate(((Integer) L0.first).intValue());
                            Bitmap createBitmap2 = Bitmap.createBitmap(decodeFile3, 0, 0, decodeFile3.getWidth(), decodeFile3.getHeight(), matrix, true);
                            File file8 = new File(w7.z(4), "-2147483648_" + cz.p() + ".jpeg");
                            createBitmap2.compress(Bitmap.CompressFormat.JPEG, 97, new FileOutputStream(file8));
                            zyVar3.c = file8.getAbsolutePath();
                            file7.delete();
                        }
                    } else {
                        zyVar3.c = zyVar3.b;
                    }
                    zyVar3.k = null;
                    zyVar3.o = false;
                    zyVar3.p = false;
                } catch (Exception e10) {
                    a8.f(e10);
                }
            }
            i35++;
        }
        boolean C = n5.C(j3);
        String str52 = ".gif";
        String str53 = "_";
        if (z10 || !z11) {
            str3 = ".gif";
            str4 = "_";
            hashMap = null;
        } else {
            HashMap hashMap6 = new HashMap();
            int i36 = 0;
            while (i36 < size2) {
                zy zyVar4 = (zy) arrayList7.get(i36);
                if (zyVar4.l == null && !zyVar4.o && zyVar4.k == null) {
                    ff ffVar = zyVar4.y;
                    if (ffVar != null && zyVar4.x) {
                        ffVar.m();
                        String str54 = zyVar4.y.h;
                        if (str54 != null) {
                            zyVar4.c = str54;
                        }
                    }
                    String str55 = zyVar4.c;
                    if (str55 != null || (uri5 = zyVar4.a) == null) {
                        str47 = str55;
                    } else {
                        str55 = g0.T0(uri5);
                        str47 = zyVar4.a.toString();
                    }
                    if (str55 == null || zyVar4.h > 0) {
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
                        if (arrayList7.size() > r52 || ((z27 && !x0(null, str55)) || !TextUtils.isEmpty(zyVar4.d))) {
                            zyVar4.s = r52;
                            str48 = null;
                            if (str55 != null) {
                                File file9 = new File(str55);
                                StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str47);
                                m10.append(file9.length());
                                m10.append(str53);
                                m10.append(file9.lastModified());
                                str49 = m10.toString();
                            } else {
                                str49 = str48;
                            }
                            if (z26 && zyVar4.h == 0 && !z12) {
                                boolean z29 = zyVar4.x;
                                int i37 = z29 ? !z26 ? 6 : 7 : !z26 ? 0 : 3;
                                if (zyVar4.q) {
                                    i34 = z29 ? 6 : 0;
                                } else {
                                    if (zyVar4.p) {
                                        if (z29) {
                                            i34 = 8;
                                        } else {
                                            i37 = 2;
                                        }
                                    }
                                    g03 = ur.a0(cVar2.a).g0(i37, str49);
                                    if (g03 != null) {
                                        Object obj23 = g03[0];
                                        if (obj23 instanceof TLRPC.TL_photo) {
                                            Object obj24 = (TLRPC.TL_photo) obj23;
                                            str51 = (String) g03[1];
                                            obj20 = obj24;
                                            if (obj20 == null && zyVar4.a != null && (g04 = ur.a0(cVar2.a).g0(i37, g0.T0(zyVar4.a))) != null) {
                                                obj22 = g04[0];
                                                if (obj22 instanceof TLRPC.TL_photo) {
                                                    str51 = (String) g04[1];
                                                    obj21 = (TLRPC.TL_photo) obj22;
                                                    tL_photo4 = obj21;
                                                    str50 = str51;
                                                    str45 = str52;
                                                    z28 = z26;
                                                    str46 = str53;
                                                    i33 = i36;
                                                    zyVar2 = zyVar4;
                                                    w(cVar2, z28, tL_photo4, zyVar4.c, zyVar4.a, 0L, zyVar4.x);
                                                }
                                            }
                                            obj21 = obj20;
                                            tL_photo4 = obj21;
                                            str50 = str51;
                                            str45 = str52;
                                            z28 = z26;
                                            str46 = str53;
                                            i33 = i36;
                                            zyVar2 = zyVar4;
                                            w(cVar2, z28, tL_photo4, zyVar4.c, zyVar4.a, 0L, zyVar4.x);
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
                                    i33 = i36;
                                    zyVar2 = zyVar4;
                                    w(cVar2, z28, tL_photo4, zyVar4.c, zyVar4.a, 0L, zyVar4.x);
                                }
                                i37 = i34;
                                g03 = ur.a0(cVar2.a).g0(i37, str49);
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
                                i33 = i36;
                                zyVar2 = zyVar4;
                                w(cVar2, z28, tL_photo4, zyVar4.c, zyVar4.a, 0L, zyVar4.x);
                            } else {
                                str45 = str52;
                                str46 = str53;
                                zyVar2 = zyVar4;
                                z28 = z26;
                                i33 = i36;
                                tL_photo4 = null;
                                str50 = null;
                            }
                            boolean z30 = z28;
                            xy xyVar = new xy();
                            hashMap6.put(zyVar2, xyVar);
                            if (tL_photo4 != null) {
                                xyVar.b = str50;
                                xyVar.a = tL_photo4;
                                cVar2 = cVar;
                                C = z30;
                            } else {
                                xyVar.c = new CountDownLatch(1);
                                ThreadPoolExecutor threadPoolExecutor = K;
                                aa.c0 c0Var = new aa.c0(xyVar, cVar, zyVar2, z30, 23);
                                cVar2 = cVar;
                                C = z30;
                                threadPoolExecutor.execute(c0Var);
                            }
                            i36 = i33 + 1;
                            str52 = str45;
                            str53 = str46;
                            r52 = 1;
                        }
                        str45 = str52;
                        str46 = str53;
                        C = z26;
                    }
                    if (!fc.d0(zyVar4.a, zyVar4.c)) {
                        if (str55 == null && (uri4 = zyVar4.a) != null && (MediaController.G(uri4) || (z27 = MediaController.M(zyVar4.a)))) {
                            boolean z31 = true;
                            if (arrayList7.size() > 1) {
                                str48 = null;
                            } else if (z27) {
                                str48 = null;
                            } else {
                                str48 = null;
                            }
                            zyVar4.s = z31;
                            if (str55 != null) {
                            }
                            if (z26) {
                            }
                            str45 = str52;
                            str46 = str53;
                            zyVar2 = zyVar4;
                            z28 = z26;
                            i33 = i36;
                            tL_photo4 = null;
                            str50 = null;
                            boolean z302 = z28;
                            xy xyVar2 = new xy();
                            hashMap6.put(zyVar2, xyVar2);
                            if (tL_photo4 != null) {
                            }
                            i36 = i33 + 1;
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
                        zyVar2 = zyVar4;
                        z28 = z26;
                        i33 = i36;
                        tL_photo4 = null;
                        str50 = null;
                        boolean z3022 = z28;
                        xy xyVar22 = new xy();
                        hashMap6.put(zyVar2, xyVar22);
                        if (tL_photo4 != null) {
                        }
                        i36 = i33 + 1;
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
                i33 = i36;
                i36 = i33 + 1;
                str52 = str45;
                str53 = str46;
                r52 = 1;
            }
            str3 = str52;
            str4 = str53;
            hashMap = hashMap6;
        }
        long j23 = 0;
        long j24 = 0;
        long j25 = 0;
        String str57 = ".webp";
        int i38 = 0;
        int i39 = 0;
        ArrayList arrayList8 = null;
        ArrayList arrayList9 = null;
        ArrayList arrayList10 = null;
        ArrayList arrayList11 = null;
        ArrayList arrayList12 = null;
        String str58 = null;
        while (i39 < size2) {
            final zy zyVar5 = (zy) arrayList7.get(i39);
            boolean z32 = i38 == 0;
            if (j10 != j23) {
                j24 = j10;
                j25 = j24;
            } else if (z11 && size2 > 1 && i38 % 10 == 0) {
                j25 = Utilities.b.nextLong();
                j24 = j25;
            } else {
                i11 = i38;
                jfVar = zyVar5.l;
                i12 = i39;
                arrayList2 = arrayList8;
                ArrayList arrayList13 = arrayList9;
                i13 = size2;
                hashMap2 = hashMap;
                ArrayList arrayList14 = arrayList10;
                ArrayList arrayList15 = arrayList11;
                if (jfVar == null && zyVar5.k == null) {
                    str10 = str;
                    str9 = str2;
                    if (jfVar.H == 1) {
                        HashMap hashMap7 = new HashMap();
                        TLRPC.Document document = zyVar5.l.J;
                        if (document instanceof TLRPC.TL_document) {
                            tL_document3 = (TLRPC.TL_document) document;
                            w7.G(cVar2.a);
                            file3 = w7.K(tL_document3, true);
                        } else {
                            file3 = new File(w7.z(4), Utilities.a(zyVar5.l.C) + "." + fc.B(zyVar5.l.C, "jpg"));
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
                            tL_document5.size = zyVar5.l.G;
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
                                file5 = new File(w7.z(4), Utilities.a(zyVar5.l.D) + "." + fc.B(zyVar5.l.D, "jpg"));
                                if (!file5.exists()) {
                                    file5 = null;
                                }
                            } else {
                                file5 = file3;
                            }
                            if (file5 != null) {
                                if (!C) {
                                    try {
                                        if (zyVar5.h == 0) {
                                            i32 = ls.r5;
                                            if (file5.getAbsolutePath().endsWith("mp4")) {
                                                String absolutePath = file5.getAbsolutePath();
                                                float f10 = i32;
                                                r10 = fc.K(absolutePath, null, f10, f10, true);
                                            } else {
                                                try {
                                                    r10 = r(1, file5.getAbsolutePath());
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    a8.f(e);
                                                    if (tL_document5.thumbs.isEmpty()) {
                                                    }
                                                    tL_document4 = tL_document5;
                                                    String str59 = zyVar5.l.C;
                                                    if (file4 != null) {
                                                    }
                                                    final String str60 = str59;
                                                    str44 = zyVar5.l.C;
                                                    if (str44 != null) {
                                                    }
                                                    final HashMap hashMap8 = hashMap5;
                                                    str7 = str57;
                                                    final boolean z33 = z32;
                                                    hashMap3 = hashMap2;
                                                    j15 = 0;
                                                    cVar2 = cVar;
                                                    g0.g3(new Runnable() { // from class: org.telegram.messenger.ux
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            gj gjVar4 = gj.this;
                                                            TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                                            c cVar3 = cVar;
                                                            TLRPC.TL_document tL_document6 = tL_document4;
                                                            String str61 = str60;
                                                            HashMap hashMap9 = hashMap8;
                                                            zy zyVar6 = zyVar5;
                                                            if (gjVar4 != null || tL_inputPollAnswer2 != null) {
                                                                az.C(cVar3.a).t(gjVar4, tL_inputPollAnswer2, null, null, tL_document6, str61, null, hashMap9, false, zyVar6.u, null);
                                                                return;
                                                            }
                                                            yy e12 = yy.e(tL_document6, null, str61, j3, gjVar2, gjVar3, zyVar6.d, zyVar6.i, hashMap9, z13, i7, i10, 0, null, zyVar6.u);
                                                            e12.H = storyItem;
                                                            e12.J = rmVar;
                                                            e12.K = cwVar;
                                                            if (z33) {
                                                                e12.O = j11;
                                                            }
                                                            e12.L = z14;
                                                            e12.Q = j12;
                                                            e12.R = j13;
                                                            e12.T = ljVar;
                                                            e12.k = zyVar6.B;
                                                            e12.j = fVar;
                                                            az.C(cVar3.a).r0(e12);
                                                        }
                                                    });
                                                    i38 = i11;
                                                    arrayList8 = arrayList2;
                                                    z19 = C;
                                                    str8 = str4;
                                                    arrayList9 = arrayList13;
                                                    arrayList10 = arrayList14;
                                                    arrayList11 = arrayList15;
                                                    j14 = j24;
                                                    i15 = i13;
                                                    i14 = i12;
                                                    i39 = i14 + 1;
                                                    size2 = i15;
                                                    j23 = j15;
                                                    C = z19;
                                                    str = str10;
                                                    str2 = str9;
                                                    hashMap = hashMap3;
                                                    str57 = str7;
                                                    j24 = j14;
                                                    str4 = str8;
                                                    arrayList7 = arrayList;
                                                }
                                            }
                                            if (r10 != null) {
                                                try {
                                                    float f11 = i32;
                                                    TLRPC.PhotoSize Z = fc.Z(r10, f11, f11, i32 > 90 ? 80 : 55, C);
                                                    if (Z != null) {
                                                        tL_document5.thumbs.add(Z);
                                                        tL_document5.flags |= 1;
                                                    }
                                                    r10.recycle();
                                                } catch (Exception e12) {
                                                    e = e12;
                                                    a8.f(e);
                                                    if (tL_document5.thumbs.isEmpty()) {
                                                    }
                                                    tL_document4 = tL_document5;
                                                    String str592 = zyVar5.l.C;
                                                    if (file4 != null) {
                                                    }
                                                    final String str602 = str592;
                                                    str44 = zyVar5.l.C;
                                                    if (str44 != null) {
                                                    }
                                                    final HashMap hashMap82 = hashMap5;
                                                    str7 = str57;
                                                    final boolean z332 = z32;
                                                    hashMap3 = hashMap2;
                                                    j15 = 0;
                                                    cVar2 = cVar;
                                                    g0.g3(new Runnable() { // from class: org.telegram.messenger.ux
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            gj gjVar4 = gj.this;
                                                            TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                                            c cVar3 = cVar;
                                                            TLRPC.TL_document tL_document6 = tL_document4;
                                                            String str61 = str602;
                                                            HashMap hashMap9 = hashMap82;
                                                            zy zyVar6 = zyVar5;
                                                            if (gjVar4 != null || tL_inputPollAnswer2 != null) {
                                                                az.C(cVar3.a).t(gjVar4, tL_inputPollAnswer2, null, null, tL_document6, str61, null, hashMap9, false, zyVar6.u, null);
                                                                return;
                                                            }
                                                            yy e122 = yy.e(tL_document6, null, str61, j3, gjVar2, gjVar3, zyVar6.d, zyVar6.i, hashMap9, z13, i7, i10, 0, null, zyVar6.u);
                                                            e122.H = storyItem;
                                                            e122.J = rmVar;
                                                            e122.K = cwVar;
                                                            if (z332) {
                                                                e122.O = j11;
                                                            }
                                                            e122.L = z14;
                                                            e122.Q = j12;
                                                            e122.R = j13;
                                                            e122.T = ljVar;
                                                            e122.k = zyVar6.B;
                                                            e122.j = fVar;
                                                            az.C(cVar3.a).r0(e122);
                                                        }
                                                    });
                                                    i38 = i11;
                                                    arrayList8 = arrayList2;
                                                    z19 = C;
                                                    str8 = str4;
                                                    arrayList9 = arrayList13;
                                                    arrayList10 = arrayList14;
                                                    arrayList11 = arrayList15;
                                                    j14 = j24;
                                                    i15 = i13;
                                                    i14 = i12;
                                                    i39 = i14 + 1;
                                                    size2 = i15;
                                                    j23 = j15;
                                                    C = z19;
                                                    str = str10;
                                                    str2 = str9;
                                                    hashMap = hashMap3;
                                                    str57 = str7;
                                                    j24 = j14;
                                                    str4 = str8;
                                                    arrayList7 = arrayList;
                                                }
                                            }
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        a8.f(e);
                                        if (tL_document5.thumbs.isEmpty()) {
                                        }
                                        tL_document4 = tL_document5;
                                        String str5922 = zyVar5.l.C;
                                        if (file4 != null) {
                                        }
                                        final String str6022 = str5922;
                                        str44 = zyVar5.l.C;
                                        if (str44 != null) {
                                        }
                                        final HashMap hashMap822 = hashMap5;
                                        str7 = str57;
                                        final boolean z3322 = z32;
                                        hashMap3 = hashMap2;
                                        j15 = 0;
                                        cVar2 = cVar;
                                        g0.g3(new Runnable() { // from class: org.telegram.messenger.ux
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                gj gjVar4 = gj.this;
                                                TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                                c cVar3 = cVar;
                                                TLRPC.TL_document tL_document6 = tL_document4;
                                                String str61 = str6022;
                                                HashMap hashMap9 = hashMap822;
                                                zy zyVar6 = zyVar5;
                                                if (gjVar4 != null || tL_inputPollAnswer2 != null) {
                                                    az.C(cVar3.a).t(gjVar4, tL_inputPollAnswer2, null, null, tL_document6, str61, null, hashMap9, false, zyVar6.u, null);
                                                    return;
                                                }
                                                yy e122 = yy.e(tL_document6, null, str61, j3, gjVar2, gjVar3, zyVar6.d, zyVar6.i, hashMap9, z13, i7, i10, 0, null, zyVar6.u);
                                                e122.H = storyItem;
                                                e122.J = rmVar;
                                                e122.K = cwVar;
                                                if (z3322) {
                                                    e122.O = j11;
                                                }
                                                e122.L = z14;
                                                e122.Q = j12;
                                                e122.R = j13;
                                                e122.T = ljVar;
                                                e122.k = zyVar6.B;
                                                e122.j = fVar;
                                                az.C(cVar3.a).r0(e122);
                                            }
                                        });
                                        i38 = i11;
                                        arrayList8 = arrayList2;
                                        z19 = C;
                                        str8 = str4;
                                        arrayList9 = arrayList13;
                                        arrayList10 = arrayList14;
                                        arrayList11 = arrayList15;
                                        j14 = j24;
                                        i15 = i13;
                                        i14 = i12;
                                        i39 = i14 + 1;
                                        size2 = i15;
                                        j23 = j15;
                                        C = z19;
                                        str = str10;
                                        str2 = str9;
                                        hashMap = hashMap3;
                                        str57 = str7;
                                        j24 = j14;
                                        str4 = str8;
                                        arrayList7 = arrayList;
                                    }
                                }
                                i32 = 90;
                                if (file5.getAbsolutePath().endsWith("mp4")) {
                                }
                                if (r10 != null) {
                                }
                            }
                            if (tL_document5.thumbs.isEmpty()) {
                                z25 = false;
                            } else {
                                TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                                jf jfVar3 = zyVar5.l;
                                tL_photoSize.w = jfVar3.E;
                                tL_photoSize.h = jfVar3.F;
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
                        String str59222 = zyVar5.l.C;
                        if (file4 != null) {
                            str59222 = file4.toString();
                        }
                        final String str60222 = str59222;
                        str44 = zyVar5.l.C;
                        if (str44 != null) {
                            hashMap5.put(obj19, str44);
                        }
                        final HashMap hashMap8222 = hashMap5;
                        str7 = str57;
                        final boolean z33222 = z32;
                        hashMap3 = hashMap2;
                        j15 = 0;
                        cVar2 = cVar;
                        g0.g3(new Runnable() { // from class: org.telegram.messenger.ux
                            @Override // java.lang.Runnable
                            public final void run() {
                                gj gjVar4 = gj.this;
                                TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                c cVar3 = cVar;
                                TLRPC.TL_document tL_document6 = tL_document4;
                                String str61 = str60222;
                                HashMap hashMap9 = hashMap8222;
                                zy zyVar6 = zyVar5;
                                if (gjVar4 != null || tL_inputPollAnswer2 != null) {
                                    az.C(cVar3.a).t(gjVar4, tL_inputPollAnswer2, null, null, tL_document6, str61, null, hashMap9, false, zyVar6.u, null);
                                    return;
                                }
                                yy e122 = yy.e(tL_document6, null, str61, j3, gjVar2, gjVar3, zyVar6.d, zyVar6.i, hashMap9, z13, i7, i10, 0, null, zyVar6.u);
                                e122.H = storyItem;
                                e122.J = rmVar;
                                e122.K = cwVar;
                                if (z33222) {
                                    e122.O = j11;
                                }
                                e122.L = z14;
                                e122.Q = j12;
                                e122.R = j13;
                                e122.T = ljVar;
                                e122.k = zyVar6.B;
                                e122.j = fVar;
                                az.C(cVar3.a).r0(e122);
                            }
                        });
                        i38 = i11;
                        arrayList8 = arrayList2;
                        z19 = C;
                        str8 = str4;
                        arrayList9 = arrayList13;
                        arrayList10 = arrayList14;
                        arrayList11 = arrayList15;
                        j14 = j24;
                        i15 = i13;
                        i14 = i12;
                        i39 = i14 + 1;
                        size2 = i15;
                        j23 = j15;
                        C = z19;
                        str = str10;
                        str2 = str9;
                        hashMap = hashMap3;
                        str57 = str7;
                        j24 = j14;
                        str4 = str8;
                        arrayList7 = arrayList;
                    } else {
                        str7 = str57;
                        long j26 = j24;
                        hashMap3 = hashMap2;
                        j15 = 0;
                        boolean z34 = C;
                        TLRPC.Photo photo = jfVar.K;
                        TLRPC.TL_photo tL_photo5 = photo instanceof TLRPC.TL_photo ? (TLRPC.TL_photo) photo : null;
                        if (tL_photo5 == null) {
                            File file10 = new File(w7.z(4), Utilities.a(zyVar5.l.C) + "." + fc.B(zyVar5.l.C, "jpg"));
                            if (!file10.exists() || file10.length() == 0) {
                                uri3 = null;
                            } else {
                                az C2 = C(cVar2.a);
                                String file11 = file10.toString();
                                uri3 = null;
                                tL_photo5 = C2.A(file11, null, false);
                                if (tL_photo5 != null) {
                                    z24 = false;
                                    if (tL_photo5 == null) {
                                        File file12 = new File(w7.z(4), Utilities.a(zyVar5.l.D) + "." + fc.B(zyVar5.l.D, "jpg"));
                                        if (file12.exists()) {
                                            tL_photo5 = C(cVar2.a).A(file12.toString(), uri3, false);
                                        }
                                        if (tL_photo5 == null) {
                                            tL_photo5 = new TLRPC.TL_photo();
                                            tL_photo5.date = ConnectionsManager.getInstance(cVar2.a).getCurrentTime();
                                            tL_photo5.file_reference = new byte[0];
                                            TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                                            jf jfVar4 = zyVar5.l;
                                            tL_photoSize2.w = jfVar4.E;
                                            tL_photoSize2.h = jfVar4.F;
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
                        String str61 = zyVar5.l.C;
                        if (str61 != null) {
                            hashMap9.put("originalPath", str61);
                        }
                        if (z11) {
                            int i40 = i11 + 1;
                            StringBuilder sb2 = new StringBuilder("");
                            j21 = j26;
                            sb2.append(j21);
                            hashMap9.put("groupId", sb2.toString());
                            if (z15) {
                                i31 = i12;
                            } else {
                                if (fVar == null && i40 == 10) {
                                    i31 = i12;
                                } else {
                                    i31 = i12;
                                }
                                hashMap9.put("final", "1");
                                i11 = i40;
                                j25 = 0;
                            }
                            i11 = i40;
                        } else {
                            j21 = j26;
                            i31 = i12;
                        }
                        final TLRPC.TL_photo tL_photo6 = tL_photo5;
                        i14 = i31;
                        final boolean z35 = z24;
                        j14 = j21;
                        cVar2 = cVar;
                        g0.g3(new Runnable() { // from class: org.telegram.messenger.vx
                            @Override // java.lang.Runnable
                            public final void run() {
                                gj gjVar4 = gj.this;
                                TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                c cVar3 = cVar;
                                TLRPC.TL_photo tL_photo7 = tL_photo6;
                                boolean z36 = z35;
                                zy zyVar6 = zyVar5;
                                HashMap hashMap10 = hashMap9;
                                if (gjVar4 != null || tL_inputPollAnswer2 != null) {
                                    az.C(cVar3.a).t(gjVar4, tL_inputPollAnswer2, tL_photo7, null, null, z36 ? zyVar6.l.C : null, null, hashMap10, false, zyVar6.u, null);
                                    return;
                                }
                                yy c11 = yy.c(null, zyVar6.d, null, tL_photo7, null, null, null, null, null, null, j3, z36 ? zyVar6.l.C : null, gjVar2, gjVar3, null, true, null, zyVar6.i, null, hashMap10, z13, i7, i10, zyVar6.h, null, null, false, zyVar6.u);
                                c11.H = storyItem;
                                c11.J = rmVar;
                                c11.K = cwVar;
                                c11.O = j11;
                                c11.L = z14;
                                c11.Q = j12;
                                c11.R = j13;
                                c11.T = ljVar;
                                c11.k = zyVar6.B;
                                c11.j = fVar;
                                az.C(cVar3.a).r0(c11);
                            }
                        });
                        i38 = i11;
                        arrayList8 = arrayList2;
                        z19 = z34;
                        str8 = str4;
                        arrayList9 = arrayList13;
                        arrayList10 = arrayList14;
                        arrayList11 = arrayList15;
                        str10 = str10;
                        str9 = str9;
                        i15 = i13;
                        i39 = i14 + 1;
                        size2 = i15;
                        j23 = j15;
                        C = z19;
                        str = str10;
                        str2 = str9;
                        hashMap = hashMap3;
                        str57 = str7;
                        j24 = j14;
                        str4 = str8;
                        arrayList7 = arrayList;
                    }
                } else {
                    str5 = str;
                    str6 = str2;
                    str7 = str57;
                    j14 = j24;
                    i14 = i12;
                    hashMap3 = hashMap2;
                    j15 = 0;
                    z18 = C;
                    if ((zyVar5.o && zyVar5.k == null) || (zyVar5.p && zyVar5.q)) {
                        String str62 = zyVar5.c;
                        if (str62 != null || (uri2 = zyVar5.a) == null) {
                            str28 = str62;
                            str29 = str28;
                        } else {
                            str29 = (Build.VERSION.SDK_INT < 30 || !"content".equals(uri2.getScheme())) ? g0.T0(zyVar5.a) : null;
                            str28 = zyVar5.a.toString();
                        }
                        if (qfVar == null || zyVar5.a == null || !qfVar.s0().hasMimeType("image/png")) {
                            obj12 = "masks";
                            str30 = str28;
                            str31 = str7;
                            str32 = str6;
                        } else {
                            try {
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                InputStream openInputStream = t0.b.getContentResolver().openInputStream(zyVar5.a);
                                try {
                                    Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                                    StringBuilder sb3 = new StringBuilder();
                                    str32 = str6;
                                    try {
                                        sb3.append(str32);
                                        sb3.append(cz.p());
                                        str31 = str7;
                                        try {
                                            sb3.append(str31);
                                            obj12 = "masks";
                                            try {
                                                str30 = str28;
                                                try {
                                                    File file13 = new File(w7.z(4), sb3.toString());
                                                    fileOutputStream = new FileOutputStream(file13);
                                                    try {
                                                        decodeStream.compress(Bitmap.CompressFormat.WEBP, 100, fileOutputStream);
                                                        cz.y();
                                                        zyVar5.a = Uri.fromFile(file13);
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
                                                            a8.f(th);
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
                                                    a8.f(th);
                                                    if (inputStream != null) {
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                str30 = str28;
                                                inputStream = openInputStream;
                                                fileOutputStream = null;
                                                a8.f(th);
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
                            if (!fc.d0(zyVar5.a, zyVar5.c)) {
                                if (zyVar5.s || str29 == null) {
                                    str33 = str3;
                                } else {
                                    str33 = str3;
                                    if ((str29.endsWith(str33) || str29.endsWith(str31)) && zyVar5.h <= 0) {
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
                                            arrayList6.add(zyVar5.a);
                                            arrayList11.add(zyVar5.d);
                                            arrayList16.add(zyVar5.i);
                                            arrayList12 = arrayList16;
                                            str3 = str33;
                                            str9 = str32;
                                            z19 = z18;
                                            str8 = str4;
                                            str10 = str5;
                                            i15 = i13;
                                            arrayList10 = arrayList6;
                                        } else {
                                            if (str34 != null) {
                                                File file14 = new File(str34);
                                                StringBuilder m11 = com.google.android.gms.internal.vision.e2.m(str35);
                                                m11.append(file14.length());
                                                String str63 = str4;
                                                m11.append(str63);
                                                str36 = str63;
                                                m11.append(file14.lastModified());
                                                str37 = m11.toString();
                                            } else {
                                                str36 = str4;
                                                str37 = null;
                                            }
                                            if (hashMap3 != null) {
                                                xy xyVar3 = (xy) hashMap3.get(zyVar5);
                                                TLRPC.TL_photo tL_photo7 = xyVar3.a;
                                                str41 = xyVar3.b;
                                                if (tL_photo7 == null) {
                                                    try {
                                                        xyVar3.c.await();
                                                    } catch (Exception e14) {
                                                        a8.f(e14);
                                                    }
                                                    tL_photo7 = xyVar3.a;
                                                    str41 = xyVar3.b;
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
                                                i25 = 1;
                                                str39 = str37;
                                            } else {
                                                if (z18 || zyVar5.h != 0 || z12) {
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
                                                    i25 = 1;
                                                    str39 = str37;
                                                    str40 = null;
                                                    tL_photo = null;
                                                } else {
                                                    int i41 = zyVar5.x ? !z18 ? 6 : 7 : !z18 ? 0 : 3;
                                                    Object[] g05 = ur.a0(cVar2.a).g0(i41, str37);
                                                    if (g05 != null) {
                                                        Object obj25 = g05[0];
                                                        str42 = str37;
                                                        if (obj25 instanceof TLRPC.TL_photo) {
                                                            tL_photo3 = (TLRPC.TL_photo) obj25;
                                                            i26 = 1;
                                                            str43 = (String) g05[1];
                                                            if (tL_photo3 == null && zyVar5.a != null && (g02 = ur.a0(cVar2.a).g0(i41, g0.T0(zyVar5.a))) != null) {
                                                                obj18 = g02[0];
                                                                if (obj18 instanceof TLRPC.TL_photo) {
                                                                    tL_photo3 = (TLRPC.TL_photo) obj18;
                                                                    str40 = (String) g02[i26];
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
                                                                    i25 = i26;
                                                                    obj13 = "1";
                                                                    cVar2 = cVar;
                                                                    w(cVar2, z18, tL_photo, zyVar5.c, zyVar5.a, 0L, false);
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
                                                            i25 = i26;
                                                            obj13 = "1";
                                                            cVar2 = cVar;
                                                            w(cVar2, z18, tL_photo, zyVar5.c, zyVar5.a, 0L, false);
                                                        }
                                                    } else {
                                                        str42 = str37;
                                                    }
                                                    i26 = 1;
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
                                                    i25 = i26;
                                                    obj13 = "1";
                                                    cVar2 = cVar;
                                                    w(cVar2, z18, tL_photo, zyVar5.c, zyVar5.a, 0L, false);
                                                }
                                                if (tL_photo == null) {
                                                    TLRPC.TL_photo A = C(cVar2.a).A(zyVar5.c, zyVar5.a, false);
                                                    if (z18 && zyVar5.r) {
                                                        new File(zyVar5.c).delete();
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
                                                final Bitmap[] bitmapArr = new Bitmap[i25];
                                                final String[] strArr = new String[i25];
                                                ArrayList arrayList17 = zyVar5.j;
                                                boolean z36 = (arrayList17 == null || arrayList17.isEmpty()) ? 0 : i25;
                                                tL_photo2.has_stickers = z36;
                                                if (z36 != 0) {
                                                    SerializedData serializedData = new SerializedData((zyVar5.j.size() * 20) + 4);
                                                    serializedData.writeInt32(zyVar5.j.size());
                                                    for (int i42 = 0; i42 < zyVar5.j.size(); i42++) {
                                                        ((TLRPC.InputDocument) zyVar5.j.get(i42)).serializeToStream(serializedData);
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
                                                        if (arrayList.size() == i25) {
                                                        }
                                                    } catch (Exception e15) {
                                                        a8.f(e15);
                                                    }
                                                    if (z11) {
                                                        i29 = i13;
                                                        i30 = i14;
                                                        j20 = j14;
                                                        i38 = i11;
                                                    } else {
                                                        i38 = i11 + 1;
                                                        StringBuilder sb4 = new StringBuilder("");
                                                        j20 = j14;
                                                        sb4.append(j20);
                                                        hashMap10.put(obj14, sb4.toString());
                                                        if (z15) {
                                                            i29 = i13;
                                                            i30 = i14;
                                                        } else {
                                                            if (fVar == null && i38 == 10) {
                                                                i29 = i13;
                                                                i30 = i14;
                                                            } else {
                                                                i29 = i13;
                                                                i30 = i14;
                                                            }
                                                            hashMap10.put(obj16, obj13);
                                                            j25 = 0;
                                                        }
                                                    }
                                                    final boolean z37 = zyVar5.x;
                                                    i28 = i30;
                                                    j19 = j20;
                                                    i27 = i29;
                                                    final String str64 = str41;
                                                    cVar2 = cVar;
                                                    g0.g3(new Runnable() { // from class: org.telegram.messenger.xx
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            Bitmap[] bitmapArr2 = bitmapArr;
                                                            if (bitmapArr2[0] != null) {
                                                                String[] strArr2 = strArr;
                                                                if (strArr2[0] != null) {
                                                                    fc.D().O(new BitmapDrawable(bitmapArr2[0]), strArr2[0], false);
                                                                }
                                                            }
                                                            gj gjVar4 = gjVar;
                                                            TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                                            c cVar3 = cVar;
                                                            TLRPC.TL_photo tL_photo8 = tL_photo2;
                                                            HashMap hashMap11 = hashMap10;
                                                            zy zyVar6 = zyVar5;
                                                            String str65 = str64;
                                                            if (gjVar4 != null || tL_inputPollAnswer2 != null) {
                                                                az.C(cVar3.a).t(gjVar4, tL_inputPollAnswer2, tL_photo8, null, null, null, null, hashMap11, false, zyVar6.u, str65);
                                                                return;
                                                            }
                                                            yy c11 = yy.c(null, zyVar6.d, null, tL_photo8, null, null, null, null, null, null, j3, null, gjVar2, gjVar3, null, true, null, zyVar6.i, null, hashMap11, z13, i7, i10, zyVar6.h, str65, null, z16, zyVar6.u);
                                                            c11.H = storyItem;
                                                            c11.J = rmVar;
                                                            c11.K = cwVar;
                                                            c11.O = j11;
                                                            c11.L = z14;
                                                            c11.P = zyVar6.w;
                                                            c11.k = zyVar6.B;
                                                            c11.Q = j12;
                                                            c11.R = j13;
                                                            c11.T = ljVar;
                                                            c11.S = z37;
                                                            c11.j = fVar;
                                                            az.C(cVar3.a).r0(c11);
                                                        }
                                                    });
                                                    z19 = z18;
                                                    arrayList8 = arrayList2;
                                                    arrayList9 = arrayList13;
                                                    arrayList10 = arrayList14;
                                                    arrayList11 = arrayList15;
                                                }
                                                TLRPC.PhotoSize u10 = w7.u(g0.Z0(zyVar5.x), tL_photo2.sizes);
                                                if (u10 != null) {
                                                    strArr[0] = D(cVar2, u10, bitmapArr, false, false);
                                                }
                                                if (z11) {
                                                }
                                                final boolean z372 = zyVar5.x;
                                                i28 = i30;
                                                j19 = j20;
                                                i27 = i29;
                                                final String str642 = str41;
                                                cVar2 = cVar;
                                                g0.g3(new Runnable() { // from class: org.telegram.messenger.xx
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        Bitmap[] bitmapArr2 = bitmapArr;
                                                        if (bitmapArr2[0] != null) {
                                                            String[] strArr2 = strArr;
                                                            if (strArr2[0] != null) {
                                                                fc.D().O(new BitmapDrawable(bitmapArr2[0]), strArr2[0], false);
                                                            }
                                                        }
                                                        gj gjVar4 = gjVar;
                                                        TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                                        c cVar3 = cVar;
                                                        TLRPC.TL_photo tL_photo8 = tL_photo2;
                                                        HashMap hashMap11 = hashMap10;
                                                        zy zyVar6 = zyVar5;
                                                        String str65 = str642;
                                                        if (gjVar4 != null || tL_inputPollAnswer2 != null) {
                                                            az.C(cVar3.a).t(gjVar4, tL_inputPollAnswer2, tL_photo8, null, null, null, null, hashMap11, false, zyVar6.u, str65);
                                                            return;
                                                        }
                                                        yy c11 = yy.c(null, zyVar6.d, null, tL_photo8, null, null, null, null, null, null, j3, null, gjVar2, gjVar3, null, true, null, zyVar6.i, null, hashMap11, z13, i7, i10, zyVar6.h, str65, null, z16, zyVar6.u);
                                                        c11.H = storyItem;
                                                        c11.J = rmVar;
                                                        c11.K = cwVar;
                                                        c11.O = j11;
                                                        c11.L = z14;
                                                        c11.P = zyVar6.w;
                                                        c11.k = zyVar6.B;
                                                        c11.Q = j12;
                                                        c11.R = j13;
                                                        c11.T = ljVar;
                                                        c11.S = z372;
                                                        c11.j = fVar;
                                                        az.C(cVar3.a).r0(c11);
                                                    }
                                                });
                                                z19 = z18;
                                                arrayList8 = arrayList2;
                                                arrayList9 = arrayList13;
                                                arrayList10 = arrayList14;
                                                arrayList11 = arrayList15;
                                            } else {
                                                String str65 = str9;
                                                i27 = i13;
                                                i28 = i14;
                                                j19 = j14;
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
                                                arrayList10.add(zyVar5.a);
                                                arrayList5.add(zyVar5.d);
                                                arrayList18.add(zyVar5.i);
                                                arrayList11 = arrayList5;
                                                str9 = str65;
                                                arrayList12 = arrayList18;
                                                i38 = i11;
                                                z19 = z18;
                                            }
                                            str10 = str5;
                                            i15 = i27;
                                            i14 = i28;
                                            j14 = j19;
                                            i39 = i14 + 1;
                                            size2 = i15;
                                            j23 = j15;
                                            C = z19;
                                            str = str10;
                                            str2 = str9;
                                            hashMap = hashMap3;
                                            str57 = str7;
                                            j24 = j14;
                                            str4 = str8;
                                            arrayList7 = arrayList;
                                        }
                                    }
                                }
                                if (zyVar5.s || str29 != null || (uri = zyVar5.a) == null) {
                                    str7 = str31;
                                } else {
                                    str7 = str31;
                                    if (MediaController.G(uri)) {
                                        String uri6 = zyVar5.a.toString();
                                        str58 = "gif";
                                        str34 = MediaController.t(-1L, zyVar5.a, "gif");
                                        z23 = true;
                                        str35 = uri6;
                                        if (z23) {
                                        }
                                    } else if (MediaController.M(zyVar5.a)) {
                                        str35 = zyVar5.a.toString();
                                        str58 = "webp";
                                        str34 = MediaController.t(-1L, zyVar5.a, "webp");
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
                        str58 = str29 != null ? w7.D(new File(str29)) : "";
                        str34 = str29;
                        str35 = str30;
                        z23 = true;
                        if (z23) {
                        }
                    } else {
                        str8 = str4;
                        if (z10) {
                            f20 f20Var5 = zyVar5.k;
                            if (f20Var5 == null) {
                                f20Var5 = n(zyVar5.z, zyVar5.c);
                            }
                            f20Var = f20Var5;
                        } else {
                            f20Var = null;
                        }
                        if ((!z10 || (f20Var == null && !zyVar5.c.endsWith("mp4"))) && !zyVar5.p) {
                            str9 = str6;
                            z19 = z18;
                            str10 = str5;
                            i15 = i13;
                            i14 = i14;
                            j14 = j14;
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
                            arrayList8.add(zyVar5.c);
                            arrayList3.add(zyVar5.c);
                            arrayList10.add(zyVar5.a);
                            arrayList11.add(zyVar5.d);
                            arrayList19.add(zyVar5.i);
                            arrayList9 = arrayList3;
                            arrayList12 = arrayList19;
                        } else {
                            if (zyVar5.c == null && (jfVar2 = zyVar5.l) != null) {
                                if (jfVar2.K instanceof TLRPC.TL_photo) {
                                    w7.G(cVar2.a);
                                    zyVar5.c = w7.K(zyVar5.l.K, true).getAbsolutePath();
                                } else {
                                    zyVar5.c = new File(w7.z(4), Utilities.a(zyVar5.l.C) + "." + fc.B(zyVar5.l.C, "jpg")).getAbsolutePath();
                                }
                            }
                            String str66 = zyVar5.c;
                            File file15 = new File(str66);
                            StringBuilder m12 = com.google.android.gms.internal.vision.e2.m(str66);
                            m12.append(file15.length());
                            m12.append(str8);
                            m12.append(file15.lastModified());
                            String sb5 = m12.toString();
                            if (f20Var != null) {
                                boolean z38 = f20Var.t;
                                StringBuilder m13 = com.google.android.gms.internal.vision.e2.m(sb5);
                                m13.append(f20Var.r);
                                m13.append(str8);
                                m13.append(f20Var.a);
                                m13.append(str8);
                                m13.append(f20Var.b);
                                m13.append(f20Var.t ? "_m" : "");
                                sb5 = m13.toString();
                                if (f20Var.k != f20Var.h) {
                                    StringBuilder n10 = p5.c.n(sb5, str8);
                                    n10.append(f20Var.k);
                                    sb5 = n10.toString();
                                }
                                long j27 = f20Var.a;
                                if (j27 < 0) {
                                    j27 = 0;
                                }
                                z20 = z38;
                                j16 = j27;
                            } else {
                                j16 = 0;
                                z20 = false;
                            }
                            String str67 = sb5;
                            if (!z18 && zyVar5.h == 0 && !z12 && (f20Var == null || (f20Var.A == null && f20Var.B == null && f20Var.G == null && f20Var.H == null))) {
                                Object[] g06 = ur.a0(cVar2.a).g0(!z18 ? 2 : 5, str67);
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
                                        f20Var2 = f20Var;
                                        str15 = ".";
                                        j17 = j16;
                                        str16 = str66;
                                        w(cVar2, z21, tL_document, zyVar5.c, null, j17, false);
                                        str17 = str68;
                                        if (tL_document != null) {
                                            if (zyVar5.c == null || !zyVar5.p) {
                                                z22 = z21;
                                                obj8 = "masks";
                                                str18 = "mp4";
                                                str22 = str5;
                                                c10 = 'a';
                                                str23 = str16;
                                            } else {
                                                File file16 = new File(zyVar5.c);
                                                File z39 = w7.z(4);
                                                StringBuilder sb6 = new StringBuilder(str6);
                                                sb6.append(cz.p());
                                                z22 = z21;
                                                str22 = str5;
                                                sb6.append(str22);
                                                File file17 = new File(z39, sb6.toString());
                                                File file18 = new File(w7.z(4), str6 + cz.p() + ".mp4");
                                                long j28 = zyVar5.z;
                                                try {
                                                    m(j28, file16.length(), file16, file18);
                                                    str23 = file18.getAbsolutePath();
                                                    try {
                                                        zyVar5.c = str23;
                                                        if (TextUtils.isEmpty(zyVar5.b)) {
                                                            m(0L, j28, file16, file17);
                                                            zyVar5.f = file17.getAbsolutePath();
                                                            Pair L02 = g0.L0(file17);
                                                            if (((Integer) L02.first).intValue() != 0 && (decodeFile2 = BitmapFactory.decodeFile(file17.getAbsolutePath())) != null) {
                                                                int intValue2 = ((Integer) L02.second).intValue();
                                                                Matrix matrix2 = new Matrix();
                                                                str27 = str23;
                                                                obj8 = "masks";
                                                                try {
                                                                    str18 = "mp4";
                                                                } catch (Exception e16) {
                                                                    e = e16;
                                                                    str18 = "mp4";
                                                                }
                                                                try {
                                                                    matrix2.postScale(intValue2 == 1 ? -1.0f : 1.0f, intValue2 == 2 ? -1.0f : 1.0f, decodeFile2.getWidth() / 2.0f, decodeFile2.getHeight() / 2.0f);
                                                                    matrix2.postRotate(((Integer) L02.first).intValue());
                                                                    createBitmap = Bitmap.createBitmap(decodeFile2, 0, 0, decodeFile2.getWidth(), decodeFile2.getHeight(), matrix2, true);
                                                                    file2 = new File(w7.z(4), str6 + cz.p() + str22);
                                                                    c10 = 'a';
                                                                } catch (Exception e17) {
                                                                    e = e17;
                                                                    c10 = 'a';
                                                                    str23 = str27;
                                                                    a8.f(e);
                                                                    String str69 = zyVar5.e;
                                                                    if (str69 == null) {
                                                                    }
                                                                    if (decodeFile == null) {
                                                                    }
                                                                    if (decodeFile == null) {
                                                                    }
                                                                    str24 = null;
                                                                    tL_document2 = new TLRPC.TL_document();
                                                                    tL_document2.file_reference = new byte[i22];
                                                                    if (photoSize2 != null) {
                                                                    }
                                                                    f20Var3 = zyVar.k;
                                                                    if (f20Var3 == null) {
                                                                    }
                                                                    tL_document2.mime_type = str12;
                                                                    cVar2.e().v(false);
                                                                    f20Var4 = zyVar.k;
                                                                    if (f20Var4 != null) {
                                                                    }
                                                                    str25 = str13;
                                                                    if (z22) {
                                                                    }
                                                                    tL_document2.attributes.add(tL_documentAttributeVideo);
                                                                    if (f20Var2 != null) {
                                                                    }
                                                                    str10 = str22;
                                                                    str26 = str23;
                                                                    obj11 = obj9;
                                                                    if (file.exists()) {
                                                                    }
                                                                    x(zyVar.c, tL_documentAttributeVideo, null);
                                                                    obj6 = obj10;
                                                                    tL_document = tL_document2;
                                                                    str8 = str25;
                                                                    str20 = str24;
                                                                    obj4 = obj11;
                                                                    str16 = str26;
                                                                    obj2 = obj8;
                                                                    z19 = z22;
                                                                    obj7 = null;
                                                                    q10 = fc.q(zyVar.f);
                                                                    if (q10 == null) {
                                                                    }
                                                                    if (f20Var2 != null) {
                                                                    }
                                                                    if (f20Var2 != null) {
                                                                    }
                                                                    final String str70 = str20;
                                                                    hashMap4 = new HashMap();
                                                                    str21 = str11;
                                                                    if (str21 != null) {
                                                                    }
                                                                    if (zyVar.p) {
                                                                    }
                                                                    if (str17 != null) {
                                                                    }
                                                                    if (z20) {
                                                                    }
                                                                    str9 = str6;
                                                                    i17 = i13;
                                                                    i18 = i14;
                                                                    j18 = j14;
                                                                    i19 = i11;
                                                                    if (!z19) {
                                                                    }
                                                                    j14 = j18;
                                                                    final TLRPC.PhotoSize photoSize3 = q10;
                                                                    final String str71 = str17;
                                                                    final f20 f20Var6 = f20Var2;
                                                                    final Bitmap bitmap2 = bitmap;
                                                                    i14 = i18;
                                                                    final String str72 = str16;
                                                                    i15 = i17;
                                                                    final zy zyVar6 = zyVar;
                                                                    final TLRPC.TL_document tL_document6 = tL_document;
                                                                    cVar2 = cVar;
                                                                    g0.g3(new Runnable() { // from class: org.telegram.messenger.wx
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            String str73;
                                                                            Bitmap bitmap3 = bitmap2;
                                                                            if (bitmap3 != null && (str73 = str70) != null) {
                                                                                fc.D().O(new BitmapDrawable(bitmap3), str73, false);
                                                                            }
                                                                            gj gjVar4 = gjVar;
                                                                            TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                                                            c cVar3 = cVar;
                                                                            f20 f20Var7 = f20Var6;
                                                                            TLRPC.TL_document tL_document7 = tL_document6;
                                                                            String str74 = str72;
                                                                            HashMap hashMap11 = hashMap4;
                                                                            zy zyVar7 = zyVar6;
                                                                            String str75 = str71;
                                                                            if (gjVar4 != null || tL_inputPollAnswer2 != null) {
                                                                                az.C(cVar3.a).t(gjVar4, tL_inputPollAnswer2, null, f20Var7, tL_document7, str74, null, hashMap11, false, zyVar7.u, str75);
                                                                                return;
                                                                            }
                                                                            yy e18 = yy.e(tL_document7, f20Var7, str74, j3, gjVar2, gjVar3, zyVar7.d, zyVar7.i, hashMap11, z13, i7, i10, zyVar7.h, str75, zyVar7.u);
                                                                            e18.H = storyItem;
                                                                            e18.J = rmVar;
                                                                            e18.K = cwVar;
                                                                            e18.O = j11;
                                                                            e18.L = z14;
                                                                            e18.P = zyVar7.w;
                                                                            e18.k = zyVar7.B;
                                                                            e18.o = photoSize3;
                                                                            e18.Q = j12;
                                                                            e18.R = j13;
                                                                            e18.T = ljVar;
                                                                            e18.U = zyVar7.p;
                                                                            e18.V = zyVar7.A / 1000;
                                                                            e18.j = fVar;
                                                                            az.C(cVar3.a).r0(e18);
                                                                        }
                                                                    });
                                                                    arrayList8 = arrayList2;
                                                                    i11 = i19;
                                                                    arrayList9 = arrayList13;
                                                                    arrayList10 = arrayList14;
                                                                    arrayList11 = arrayList15;
                                                                    i38 = i11;
                                                                    i39 = i14 + 1;
                                                                    size2 = i15;
                                                                    j23 = j15;
                                                                    C = z19;
                                                                    str = str10;
                                                                    str2 = str9;
                                                                    hashMap = hashMap3;
                                                                    str57 = str7;
                                                                    j24 = j14;
                                                                    str4 = str8;
                                                                    arrayList7 = arrayList;
                                                                }
                                                                try {
                                                                    createBitmap.compress(Bitmap.CompressFormat.JPEG, 97, new FileOutputStream(file2));
                                                                    zyVar5.f = file2.getAbsolutePath();
                                                                    file17.delete();
                                                                    str23 = str27;
                                                                } catch (Exception e18) {
                                                                    e = e18;
                                                                    str23 = str27;
                                                                    a8.f(e);
                                                                    String str692 = zyVar5.e;
                                                                    if (str692 == null) {
                                                                    }
                                                                    if (decodeFile == null) {
                                                                    }
                                                                    if (decodeFile == null) {
                                                                    }
                                                                    str24 = null;
                                                                    tL_document2 = new TLRPC.TL_document();
                                                                    tL_document2.file_reference = new byte[i22];
                                                                    if (photoSize2 != null) {
                                                                    }
                                                                    f20Var3 = zyVar.k;
                                                                    if (f20Var3 == null) {
                                                                    }
                                                                    tL_document2.mime_type = str12;
                                                                    cVar2.e().v(false);
                                                                    f20Var4 = zyVar.k;
                                                                    if (f20Var4 != null) {
                                                                    }
                                                                    str25 = str13;
                                                                    if (z22) {
                                                                    }
                                                                    tL_document2.attributes.add(tL_documentAttributeVideo);
                                                                    if (f20Var2 != null) {
                                                                    }
                                                                    str10 = str22;
                                                                    str26 = str23;
                                                                    obj11 = obj9;
                                                                    if (file.exists()) {
                                                                    }
                                                                    x(zyVar.c, tL_documentAttributeVideo, null);
                                                                    obj6 = obj10;
                                                                    tL_document = tL_document2;
                                                                    str8 = str25;
                                                                    str20 = str24;
                                                                    obj4 = obj11;
                                                                    str16 = str26;
                                                                    obj2 = obj8;
                                                                    z19 = z22;
                                                                    obj7 = null;
                                                                    q10 = fc.q(zyVar.f);
                                                                    if (q10 == null) {
                                                                    }
                                                                    if (f20Var2 != null) {
                                                                    }
                                                                    if (f20Var2 != null) {
                                                                    }
                                                                    final String str702 = str20;
                                                                    hashMap4 = new HashMap();
                                                                    str21 = str11;
                                                                    if (str21 != null) {
                                                                    }
                                                                    if (zyVar.p) {
                                                                    }
                                                                    if (str17 != null) {
                                                                    }
                                                                    if (z20) {
                                                                    }
                                                                    str9 = str6;
                                                                    i17 = i13;
                                                                    i18 = i14;
                                                                    j18 = j14;
                                                                    i19 = i11;
                                                                    if (!z19) {
                                                                    }
                                                                    j14 = j18;
                                                                    final TLRPC.PhotoSize photoSize32 = q10;
                                                                    final String str712 = str17;
                                                                    final f20 f20Var62 = f20Var2;
                                                                    final Bitmap bitmap22 = bitmap;
                                                                    i14 = i18;
                                                                    final String str722 = str16;
                                                                    i15 = i17;
                                                                    final zy zyVar62 = zyVar;
                                                                    final TLRPC.TL_document tL_document62 = tL_document;
                                                                    cVar2 = cVar;
                                                                    g0.g3(new Runnable() { // from class: org.telegram.messenger.wx
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            String str73;
                                                                            Bitmap bitmap3 = bitmap22;
                                                                            if (bitmap3 != null && (str73 = str702) != null) {
                                                                                fc.D().O(new BitmapDrawable(bitmap3), str73, false);
                                                                            }
                                                                            gj gjVar4 = gjVar;
                                                                            TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                                                            c cVar3 = cVar;
                                                                            f20 f20Var7 = f20Var62;
                                                                            TLRPC.TL_document tL_document7 = tL_document62;
                                                                            String str74 = str722;
                                                                            HashMap hashMap11 = hashMap4;
                                                                            zy zyVar7 = zyVar62;
                                                                            String str75 = str712;
                                                                            if (gjVar4 != null || tL_inputPollAnswer2 != null) {
                                                                                az.C(cVar3.a).t(gjVar4, tL_inputPollAnswer2, null, f20Var7, tL_document7, str74, null, hashMap11, false, zyVar7.u, str75);
                                                                                return;
                                                                            }
                                                                            yy e182 = yy.e(tL_document7, f20Var7, str74, j3, gjVar2, gjVar3, zyVar7.d, zyVar7.i, hashMap11, z13, i7, i10, zyVar7.h, str75, zyVar7.u);
                                                                            e182.H = storyItem;
                                                                            e182.J = rmVar;
                                                                            e182.K = cwVar;
                                                                            e182.O = j11;
                                                                            e182.L = z14;
                                                                            e182.P = zyVar7.w;
                                                                            e182.k = zyVar7.B;
                                                                            e182.o = photoSize32;
                                                                            e182.Q = j12;
                                                                            e182.R = j13;
                                                                            e182.T = ljVar;
                                                                            e182.U = zyVar7.p;
                                                                            e182.V = zyVar7.A / 1000;
                                                                            e182.j = fVar;
                                                                            az.C(cVar3.a).r0(e182);
                                                                        }
                                                                    });
                                                                    arrayList8 = arrayList2;
                                                                    i11 = i19;
                                                                    arrayList9 = arrayList13;
                                                                    arrayList10 = arrayList14;
                                                                    arrayList11 = arrayList15;
                                                                    i38 = i11;
                                                                    i39 = i14 + 1;
                                                                    size2 = i15;
                                                                    j23 = j15;
                                                                    C = z19;
                                                                    str = str10;
                                                                    str2 = str9;
                                                                    hashMap = hashMap3;
                                                                    str57 = str7;
                                                                    j24 = j14;
                                                                    str4 = str8;
                                                                    arrayList7 = arrayList;
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                zyVar5.f = zyVar5.b;
                                                            } catch (Exception e19) {
                                                                e = e19;
                                                                obj8 = "masks";
                                                                str18 = "mp4";
                                                                c10 = 'a';
                                                                a8.f(e);
                                                                String str6922 = zyVar5.e;
                                                                if (str6922 == null) {
                                                                }
                                                                if (decodeFile == null) {
                                                                    decodeFile = r(1, zyVar5.c);
                                                                }
                                                                if (decodeFile == null) {
                                                                }
                                                                str24 = null;
                                                                tL_document2 = new TLRPC.TL_document();
                                                                tL_document2.file_reference = new byte[i22];
                                                                if (photoSize2 != null) {
                                                                }
                                                                f20Var3 = zyVar.k;
                                                                if (f20Var3 == null) {
                                                                }
                                                                tL_document2.mime_type = str12;
                                                                cVar2.e().v(false);
                                                                f20Var4 = zyVar.k;
                                                                if (f20Var4 != null) {
                                                                }
                                                                str25 = str13;
                                                                if (z22) {
                                                                }
                                                                tL_document2.attributes.add(tL_documentAttributeVideo);
                                                                if (f20Var2 != null) {
                                                                }
                                                                str10 = str22;
                                                                str26 = str23;
                                                                obj11 = obj9;
                                                                if (file.exists()) {
                                                                }
                                                                x(zyVar.c, tL_documentAttributeVideo, null);
                                                                obj6 = obj10;
                                                                tL_document = tL_document2;
                                                                str8 = str25;
                                                                str20 = str24;
                                                                obj4 = obj11;
                                                                str16 = str26;
                                                                obj2 = obj8;
                                                                z19 = z22;
                                                                obj7 = null;
                                                                q10 = fc.q(zyVar.f);
                                                                if (q10 == null) {
                                                                }
                                                                if (f20Var2 != null) {
                                                                }
                                                                if (f20Var2 != null) {
                                                                }
                                                                final String str7022 = str20;
                                                                hashMap4 = new HashMap();
                                                                str21 = str11;
                                                                if (str21 != null) {
                                                                }
                                                                if (zyVar.p) {
                                                                }
                                                                if (str17 != null) {
                                                                }
                                                                if (z20) {
                                                                }
                                                                str9 = str6;
                                                                i17 = i13;
                                                                i18 = i14;
                                                                j18 = j14;
                                                                i19 = i11;
                                                                if (!z19) {
                                                                }
                                                                j14 = j18;
                                                                final TLRPC.PhotoSize photoSize322 = q10;
                                                                final String str7122 = str17;
                                                                final f20 f20Var622 = f20Var2;
                                                                final Bitmap bitmap222 = bitmap;
                                                                i14 = i18;
                                                                final String str7222 = str16;
                                                                i15 = i17;
                                                                final zy zyVar622 = zyVar;
                                                                final TLRPC.TL_document tL_document622 = tL_document;
                                                                cVar2 = cVar;
                                                                g0.g3(new Runnable() { // from class: org.telegram.messenger.wx
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        String str73;
                                                                        Bitmap bitmap3 = bitmap222;
                                                                        if (bitmap3 != null && (str73 = str7022) != null) {
                                                                            fc.D().O(new BitmapDrawable(bitmap3), str73, false);
                                                                        }
                                                                        gj gjVar4 = gjVar;
                                                                        TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                                                        c cVar3 = cVar;
                                                                        f20 f20Var7 = f20Var622;
                                                                        TLRPC.TL_document tL_document7 = tL_document622;
                                                                        String str74 = str7222;
                                                                        HashMap hashMap11 = hashMap4;
                                                                        zy zyVar7 = zyVar622;
                                                                        String str75 = str7122;
                                                                        if (gjVar4 != null || tL_inputPollAnswer2 != null) {
                                                                            az.C(cVar3.a).t(gjVar4, tL_inputPollAnswer2, null, f20Var7, tL_document7, str74, null, hashMap11, false, zyVar7.u, str75);
                                                                            return;
                                                                        }
                                                                        yy e182 = yy.e(tL_document7, f20Var7, str74, j3, gjVar2, gjVar3, zyVar7.d, zyVar7.i, hashMap11, z13, i7, i10, zyVar7.h, str75, zyVar7.u);
                                                                        e182.H = storyItem;
                                                                        e182.J = rmVar;
                                                                        e182.K = cwVar;
                                                                        e182.O = j11;
                                                                        e182.L = z14;
                                                                        e182.P = zyVar7.w;
                                                                        e182.k = zyVar7.B;
                                                                        e182.o = photoSize322;
                                                                        e182.Q = j12;
                                                                        e182.R = j13;
                                                                        e182.T = ljVar;
                                                                        e182.U = zyVar7.p;
                                                                        e182.V = zyVar7.A / 1000;
                                                                        e182.j = fVar;
                                                                        az.C(cVar3.a).r0(e182);
                                                                    }
                                                                });
                                                                arrayList8 = arrayList2;
                                                                i11 = i19;
                                                                arrayList9 = arrayList13;
                                                                arrayList10 = arrayList14;
                                                                arrayList11 = arrayList15;
                                                                i38 = i11;
                                                                i39 = i14 + 1;
                                                                size2 = i15;
                                                                j23 = j15;
                                                                C = z19;
                                                                str = str10;
                                                                str2 = str9;
                                                                hashMap = hashMap3;
                                                                str57 = str7;
                                                                j24 = j14;
                                                                str4 = str8;
                                                                arrayList7 = arrayList;
                                                            }
                                                        }
                                                        str27 = str23;
                                                        obj8 = "masks";
                                                        str18 = "mp4";
                                                        c10 = 'a';
                                                        str23 = str27;
                                                    } catch (Exception e20) {
                                                        e = e20;
                                                    }
                                                } catch (Exception e21) {
                                                    e = e21;
                                                    obj8 = "masks";
                                                    str18 = "mp4";
                                                    c10 = 'a';
                                                    str23 = str16;
                                                }
                                            }
                                            String str69222 = zyVar5.e;
                                            decodeFile = str69222 == null ? BitmapFactory.decodeFile(str69222) : null;
                                            if (decodeFile == null && (decodeFile = s(zyVar5.c, j17, null, false)) == null) {
                                                decodeFile = r(1, zyVar5.c);
                                            }
                                            if (decodeFile == null) {
                                                int max = (z22 || zyVar5.h != 0) ? 90 : Math.max(decodeFile.getWidth(), decodeFile.getHeight());
                                                float f12 = max;
                                                zyVar = zyVar5;
                                                obj3 = "originalPath";
                                                str19 = str15;
                                                obj5 = "final";
                                                bitmap = decodeFile;
                                                obj9 = "parentObject";
                                                obj10 = "1";
                                                photoSize2 = fc.b0(null, bitmap, (f20Var2 == null || !f20Var2.N) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP, f12, f12, max > 90 ? 80 : 55, z22, 0, 0, false);
                                                if (photoSize2 == null || photoSize2.location == null) {
                                                    i22 = 0;
                                                } else {
                                                    i22 = 0;
                                                    str24 = D(cVar2, photoSize2, null, true, false);
                                                    tL_document2 = new TLRPC.TL_document();
                                                    tL_document2.file_reference = new byte[i22];
                                                    if (photoSize2 != null) {
                                                        tL_document2.thumbs.add(photoSize2);
                                                        tL_document2.flags |= 1;
                                                    }
                                                    f20Var3 = zyVar.k;
                                                    if (f20Var3 == null && f20Var3.N) {
                                                        tL_document2.mime_type = "video/webm";
                                                    } else {
                                                        tL_document2.mime_type = str12;
                                                    }
                                                    cVar2.e().v(false);
                                                    f20Var4 = zyVar.k;
                                                    if (f20Var4 != null && f20Var4.N) {
                                                        tL_document2.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                                        TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                                                        tL_documentAttributeSticker.alt = "👍";
                                                        tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                                                        tL_document2.attributes.add(tL_documentAttributeSticker);
                                                        if (photoSize2 != null && (fileLocation = photoSize2.location) != null) {
                                                            Locale locale = Locale.US;
                                                            long j29 = fileLocation.volume_id;
                                                            int i43 = fileLocation.local_id;
                                                            StringBuilder sb7 = new StringBuilder();
                                                            sb7.append(j29);
                                                            str25 = str13;
                                                            sb7.append(str25);
                                                            sb7.append(i43);
                                                            sb7.append("@b1");
                                                            str24 = sb7.toString();
                                                            if (z22) {
                                                                tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo_layer159();
                                                            } else {
                                                                tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                                                                tL_documentAttributeVideo.supports_streaming = true;
                                                            }
                                                            tL_document2.attributes.add(tL_documentAttributeVideo);
                                                            if (f20Var2 != null || (!f20Var2.c() && zyVar.o)) {
                                                                str10 = str22;
                                                                str26 = str23;
                                                                obj11 = obj9;
                                                                if (file.exists()) {
                                                                    tL_document2.size = (int) file.length();
                                                                }
                                                                x(zyVar.c, tL_documentAttributeVideo, null);
                                                            } else {
                                                                if (zyVar.o && f20Var2.t) {
                                                                    x(zyVar.c, tL_documentAttributeVideo, f20Var2);
                                                                    f20Var2.h = tL_documentAttributeVideo.w;
                                                                    f20Var2.i = tL_documentAttributeVideo.h;
                                                                    obj11 = obj9;
                                                                } else {
                                                                    obj11 = obj9;
                                                                    tL_documentAttributeVideo.duration = (int) (f20Var2.r / 1000);
                                                                }
                                                                int i44 = f20Var2.g;
                                                                xe xeVar = f20Var2.H;
                                                                if (xeVar != null) {
                                                                    str10 = str22;
                                                                    i23 = xeVar.i;
                                                                    i24 = xeVar.j;
                                                                } else {
                                                                    str10 = str22;
                                                                    i23 = f20Var2.k;
                                                                    i24 = f20Var2.l;
                                                                }
                                                                str26 = str23;
                                                                if (i44 == 90 || i44 == 270) {
                                                                    tL_documentAttributeVideo.w = i24;
                                                                    tL_documentAttributeVideo.h = i23;
                                                                } else {
                                                                    tL_documentAttributeVideo.w = i23;
                                                                    tL_documentAttributeVideo.h = i24;
                                                                }
                                                                tL_document2.size = f20Var2.q;
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
                                                    if (f20Var2 != null) {
                                                    }
                                                    str10 = str22;
                                                    str26 = str23;
                                                    obj11 = obj9;
                                                    if (file.exists()) {
                                                    }
                                                    x(zyVar.c, tL_documentAttributeVideo, null);
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
                                                zyVar = zyVar5;
                                                obj3 = "originalPath";
                                                obj9 = "parentObject";
                                                str19 = str15;
                                                obj10 = "1";
                                                obj5 = "final";
                                                i22 = 0;
                                                bitmap = decodeFile;
                                                photoSize2 = null;
                                            }
                                            str24 = null;
                                            tL_document2 = new TLRPC.TL_document();
                                            tL_document2.file_reference = new byte[i22];
                                            if (photoSize2 != null) {
                                            }
                                            f20Var3 = zyVar.k;
                                            if (f20Var3 == null) {
                                            }
                                            tL_document2.mime_type = str12;
                                            cVar2.e().v(false);
                                            f20Var4 = zyVar.k;
                                            if (f20Var4 != null) {
                                                tL_document2.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                                TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker2 = new TLRPC.TL_documentAttributeSticker();
                                                tL_documentAttributeSticker2.alt = "👍";
                                                tL_documentAttributeSticker2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                                                tL_document2.attributes.add(tL_documentAttributeSticker2);
                                                if (photoSize2 != null) {
                                                    Locale locale2 = Locale.US;
                                                    long j292 = fileLocation.volume_id;
                                                    int i432 = fileLocation.local_id;
                                                    StringBuilder sb72 = new StringBuilder();
                                                    sb72.append(j292);
                                                    str25 = str13;
                                                    sb72.append(str25);
                                                    sb72.append(i432);
                                                    sb72.append("@b1");
                                                    str24 = sb72.toString();
                                                    if (z22) {
                                                    }
                                                    tL_document2.attributes.add(tL_documentAttributeVideo);
                                                    if (f20Var2 != null) {
                                                    }
                                                    str10 = str22;
                                                    str26 = str23;
                                                    obj11 = obj9;
                                                    if (file.exists()) {
                                                    }
                                                    x(zyVar.c, tL_documentAttributeVideo, null);
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
                                            if (f20Var2 != null) {
                                            }
                                            str10 = str22;
                                            str26 = str23;
                                            obj11 = obj9;
                                            if (file.exists()) {
                                            }
                                            x(zyVar.c, tL_documentAttributeVideo, null);
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
                                            zyVar = zyVar5;
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
                                                String str74 = zyVar.e;
                                                Bitmap decodeFile4 = str74 != null ? BitmapFactory.decodeFile(str74) : null;
                                                if (decodeFile4 == null && (decodeFile4 = s(zyVar.c, j17, null, false)) == null) {
                                                    decodeFile4 = r(1, zyVar.c);
                                                }
                                                bitmap = decodeFile4;
                                                if (bitmap != null) {
                                                    int max2 = (z40 || zyVar.h != 0) ? 90 : Math.max(bitmap.getWidth(), bitmap.getHeight());
                                                    float f13 = max2;
                                                    str8 = str73;
                                                    obj6 = "1";
                                                    photoSize = fc.b0(null, bitmap, (f20Var2 == null || !f20Var2.N) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP, f13, f13, max2 > 90 ? 80 : 55, z40, 0, 0, false);
                                                    z19 = z40;
                                                    if (photoSize == null || photoSize.location == null) {
                                                        obj7 = null;
                                                        i16 = 1;
                                                        str20 = null;
                                                    } else {
                                                        obj7 = null;
                                                        i16 = 1;
                                                        str20 = D(cVar2, photoSize, null, true, false);
                                                    }
                                                } else {
                                                    str8 = str73;
                                                    obj6 = "1";
                                                    z19 = z40;
                                                    obj7 = null;
                                                    i16 = 1;
                                                    photoSize = null;
                                                    str20 = null;
                                                }
                                                if (photoSize != null) {
                                                    tL_document.thumbs.add(photoSize);
                                                    tL_document.flags |= i16;
                                                }
                                            }
                                        }
                                        q10 = fc.q(zyVar.f);
                                        if (q10 == null && zyVar.g != null) {
                                            q10 = new cc(zyVar.g);
                                        }
                                        if (f20Var2 != null && f20Var2.t) {
                                            size = tL_document.attributes.size();
                                            i21 = 0;
                                            while (true) {
                                                if (i21 < size) {
                                                    tL_document.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                                    break;
                                                } else if (tL_document.attributes.get(i21) instanceof TLRPC.TL_documentAttributeAnimated) {
                                                    break;
                                                } else {
                                                    i21++;
                                                }
                                            }
                                        }
                                        if (f20Var2 != null && (f20Var2.c() || !zyVar.o)) {
                                            File file19 = new File(w7.z(4), str6 + cz.p() + str19 + (!f20Var2.N ? "webm" : str18));
                                            cz.y();
                                            str16 = file19.getAbsolutePath();
                                        }
                                        final String str70222 = str20;
                                        hashMap4 = new HashMap();
                                        str21 = str11;
                                        if (str21 != null) {
                                            hashMap4.put(obj3, str21);
                                        }
                                        if (zyVar.p && !TextUtils.isEmpty(zyVar.f)) {
                                            hashMap4.put("imagePath", zyVar.f);
                                        }
                                        if (str17 != null) {
                                            hashMap4.put(obj4, str17);
                                        }
                                        if (z20 && z11) {
                                            int i45 = i11 + 1;
                                            StringBuilder sb8 = new StringBuilder(str14);
                                            str9 = str6;
                                            j18 = j14;
                                            sb8.append(j18);
                                            hashMap4.put(obj, sb8.toString());
                                            if (z15) {
                                                i17 = i13;
                                                i18 = i14;
                                            } else {
                                                if (fVar == null && i45 == 10) {
                                                    i17 = i13;
                                                    i18 = i14;
                                                } else {
                                                    i17 = i13;
                                                    i18 = i14;
                                                }
                                                hashMap4.put(obj5, obj6);
                                                i19 = i45;
                                                j25 = 0;
                                            }
                                            i19 = i45;
                                        } else {
                                            str9 = str6;
                                            i17 = i13;
                                            i18 = i14;
                                            j18 = j14;
                                            i19 = i11;
                                        }
                                        if (!z19 && ((f20Var2 == null || !f20Var2.N) && (arrayList4 = zyVar.j) != null && !arrayList4.isEmpty())) {
                                            tL_document.attributes.add(new TLRPC.TL_documentAttributeHasStickers());
                                            SerializedData serializedData2 = new SerializedData((zyVar.j.size() * 20) + 4);
                                            serializedData2.writeInt32(zyVar.j.size());
                                            for (i20 = 0; i20 < zyVar.j.size(); i20++) {
                                                ((TLRPC.InputDocument) zyVar.j.get(i20)).serializeToStream(serializedData2);
                                            }
                                            hashMap4.put(obj2, Utilities.f(serializedData2.toByteArray()));
                                            serializedData2.cleanup();
                                        }
                                        j14 = j18;
                                        final TLRPC.PhotoSize photoSize3222 = q10;
                                        final String str71222 = str17;
                                        final f20 f20Var6222 = f20Var2;
                                        final Bitmap bitmap2222 = bitmap;
                                        i14 = i18;
                                        final String str72222 = str16;
                                        i15 = i17;
                                        final zy zyVar6222 = zyVar;
                                        final TLRPC.TL_document tL_document6222 = tL_document;
                                        cVar2 = cVar;
                                        g0.g3(new Runnable() { // from class: org.telegram.messenger.wx
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                String str732;
                                                Bitmap bitmap3 = bitmap2222;
                                                if (bitmap3 != null && (str732 = str70222) != null) {
                                                    fc.D().O(new BitmapDrawable(bitmap3), str732, false);
                                                }
                                                gj gjVar4 = gjVar;
                                                TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                                c cVar3 = cVar;
                                                f20 f20Var7 = f20Var6222;
                                                TLRPC.TL_document tL_document7 = tL_document6222;
                                                String str742 = str72222;
                                                HashMap hashMap11 = hashMap4;
                                                zy zyVar7 = zyVar6222;
                                                String str75 = str71222;
                                                if (gjVar4 != null || tL_inputPollAnswer2 != null) {
                                                    az.C(cVar3.a).t(gjVar4, tL_inputPollAnswer2, null, f20Var7, tL_document7, str742, null, hashMap11, false, zyVar7.u, str75);
                                                    return;
                                                }
                                                yy e182 = yy.e(tL_document7, f20Var7, str742, j3, gjVar2, gjVar3, zyVar7.d, zyVar7.i, hashMap11, z13, i7, i10, zyVar7.h, str75, zyVar7.u);
                                                e182.H = storyItem;
                                                e182.J = rmVar;
                                                e182.K = cwVar;
                                                e182.O = j11;
                                                e182.L = z14;
                                                e182.P = zyVar7.w;
                                                e182.k = zyVar7.B;
                                                e182.o = photoSize3222;
                                                e182.Q = j12;
                                                e182.R = j13;
                                                e182.T = ljVar;
                                                e182.U = zyVar7.p;
                                                e182.V = zyVar7.A / 1000;
                                                e182.j = fVar;
                                                az.C(cVar3.a).r0(e182);
                                            }
                                        });
                                        arrayList8 = arrayList2;
                                        i11 = i19;
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
                            f20Var2 = f20Var;
                            str15 = ".";
                            j17 = j16;
                            str16 = str66;
                            tL_document = null;
                            str17 = null;
                            if (tL_document != null) {
                            }
                            q10 = fc.q(zyVar.f);
                            if (q10 == null) {
                                q10 = new cc(zyVar.g);
                            }
                            if (f20Var2 != null) {
                                size = tL_document.attributes.size();
                                i21 = 0;
                                while (true) {
                                    if (i21 < size) {
                                    }
                                    i21++;
                                }
                            }
                            if (f20Var2 != null) {
                                if (!f20Var2.N) {
                                }
                                File file192 = new File(w7.z(4), str6 + cz.p() + str19 + (!f20Var2.N ? "webm" : str18));
                                cz.y();
                                str16 = file192.getAbsolutePath();
                            }
                            final String str702222 = str20;
                            hashMap4 = new HashMap();
                            str21 = str11;
                            if (str21 != null) {
                            }
                            if (zyVar.p) {
                                hashMap4.put("imagePath", zyVar.f);
                            }
                            if (str17 != null) {
                            }
                            if (z20) {
                            }
                            str9 = str6;
                            i17 = i13;
                            i18 = i14;
                            j18 = j14;
                            i19 = i11;
                            if (!z19) {
                                tL_document.attributes.add(new TLRPC.TL_documentAttributeHasStickers());
                                SerializedData serializedData22 = new SerializedData((zyVar.j.size() * 20) + 4);
                                serializedData22.writeInt32(zyVar.j.size());
                                while (i20 < zyVar.j.size()) {
                                }
                                hashMap4.put(obj2, Utilities.f(serializedData22.toByteArray()));
                                serializedData22.cleanup();
                            }
                            j14 = j18;
                            final TLRPC.PhotoSize photoSize32222 = q10;
                            final String str712222 = str17;
                            final f20 f20Var62222 = f20Var2;
                            final Bitmap bitmap22222 = bitmap;
                            i14 = i18;
                            final String str722222 = str16;
                            i15 = i17;
                            final zy zyVar62222 = zyVar;
                            final TLRPC.TL_document tL_document62222 = tL_document;
                            cVar2 = cVar;
                            g0.g3(new Runnable() { // from class: org.telegram.messenger.wx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String str732;
                                    Bitmap bitmap3 = bitmap22222;
                                    if (bitmap3 != null && (str732 = str702222) != null) {
                                        fc.D().O(new BitmapDrawable(bitmap3), str732, false);
                                    }
                                    gj gjVar4 = gjVar;
                                    TLRPC.TL_inputPollAnswer tL_inputPollAnswer2 = tL_inputPollAnswer;
                                    c cVar3 = cVar;
                                    f20 f20Var7 = f20Var62222;
                                    TLRPC.TL_document tL_document7 = tL_document62222;
                                    String str742 = str722222;
                                    HashMap hashMap11 = hashMap4;
                                    zy zyVar7 = zyVar62222;
                                    String str75 = str712222;
                                    if (gjVar4 != null || tL_inputPollAnswer2 != null) {
                                        az.C(cVar3.a).t(gjVar4, tL_inputPollAnswer2, null, f20Var7, tL_document7, str742, null, hashMap11, false, zyVar7.u, str75);
                                        return;
                                    }
                                    yy e182 = yy.e(tL_document7, f20Var7, str742, j3, gjVar2, gjVar3, zyVar7.d, zyVar7.i, hashMap11, z13, i7, i10, zyVar7.h, str75, zyVar7.u);
                                    e182.H = storyItem;
                                    e182.J = rmVar;
                                    e182.K = cwVar;
                                    e182.O = j11;
                                    e182.L = z14;
                                    e182.P = zyVar7.w;
                                    e182.k = zyVar7.B;
                                    e182.o = photoSize32222;
                                    e182.Q = j12;
                                    e182.R = j13;
                                    e182.T = ljVar;
                                    e182.U = zyVar7.p;
                                    e182.V = zyVar7.A / 1000;
                                    e182.j = fVar;
                                    az.C(cVar3.a).r0(e182);
                                }
                            });
                            arrayList8 = arrayList2;
                            i11 = i19;
                            arrayList9 = arrayList13;
                            arrayList10 = arrayList14;
                            arrayList11 = arrayList15;
                        }
                    }
                    i38 = i11;
                    i39 = i14 + 1;
                    size2 = i15;
                    j23 = j15;
                    C = z19;
                    str = str10;
                    str2 = str9;
                    hashMap = hashMap3;
                    str57 = str7;
                    j24 = j14;
                    str4 = str8;
                    arrayList7 = arrayList;
                }
            }
            i11 = 0;
            jfVar = zyVar5.l;
            i12 = i39;
            arrayList2 = arrayList8;
            ArrayList arrayList132 = arrayList9;
            i13 = size2;
            hashMap2 = hashMap;
            ArrayList arrayList142 = arrayList10;
            ArrayList arrayList152 = arrayList11;
            if (jfVar == null) {
            }
            str5 = str;
            str6 = str2;
            str7 = str57;
            j14 = j24;
            i14 = i12;
            hashMap3 = hashMap2;
            j15 = 0;
            z18 = C;
            if (zyVar5.o) {
            }
            str8 = str4;
            if (z10) {
            }
            if (z10) {
            }
            str9 = str6;
            z19 = z18;
            str10 = str5;
            i15 = i13;
            i14 = i14;
            j14 = j14;
            if (arrayList2 != null) {
            }
            ArrayList arrayList192 = arrayList12;
            arrayList8.add(zyVar5.c);
            arrayList3.add(zyVar5.c);
            arrayList10.add(zyVar5.a);
            arrayList11.add(zyVar5.d);
            arrayList192.add(zyVar5.i);
            arrayList9 = arrayList3;
            arrayList12 = arrayList192;
            i38 = i11;
            i39 = i14 + 1;
            size2 = i15;
            j23 = j15;
            C = z19;
            str = str10;
            str2 = str9;
            hashMap = hashMap3;
            str57 = str7;
            j24 = j14;
            str4 = str8;
            arrayList7 = arrayList;
        }
        boolean z41 = C;
        long j30 = j23;
        ArrayList arrayList20 = arrayList8;
        ArrayList arrayList21 = arrayList9;
        int i46 = size2;
        ArrayList arrayList22 = arrayList10;
        ArrayList arrayList23 = arrayList11;
        long j31 = j25;
        int i47 = 10;
        if (j31 != j30 && !z15) {
            z(cVar2, j31, i7);
        }
        if (qfVar != null) {
            ((t0.h) qfVar.b).i();
        }
        if (arrayList20 != null && !arrayList20.isEmpty()) {
            int i48 = 1;
            long[] jArr = new long[1];
            int size3 = arrayList20.size();
            int i49 = i38;
            int i50 = 0;
            while (i50 < size3) {
                if (!z10 || z41 || i46 <= i48 || i49 % 10 != 0) {
                    z17 = false;
                } else {
                    z17 = false;
                    jArr[0] = Utilities.b.nextLong();
                    i49 = 0;
                }
                int i51 = i49 + 1;
                ArrayList arrayList24 = arrayList20;
                ArrayList arrayList25 = arrayList21;
                ArrayList arrayList26 = arrayList22;
                ArrayList arrayList27 = arrayList12;
                ArrayList arrayList28 = arrayList23;
                int i52 = size3;
                arrayList20 = arrayList24;
                arrayList21 = arrayList25;
                arrayList22 = arrayList26;
                arrayList12 = arrayList27;
                int i53 = i47;
                arrayList23 = arrayList28;
                String str75 = str58;
                int U = U(cVar2, (String) arrayList24.get(i50), (String) arrayList25.get(i50), (Uri) arrayList26.get(i50), str75, j3, gjVar2, gjVar3, storyItem, rmVar, (ArrayList) arrayList27.get(i50), gjVar, jArr, (i51 == i47 || i50 == size3 + (-1)) ? true : z17, (CharSequence) arrayList28.get(i50), z13, i7, 0, null, z10, cwVar, j11, z14, j12, j13, ljVar, null, -1);
                if (U != 0) {
                    g0.g3(new x0(U, cVar2, 13));
                }
                i50++;
                str58 = str75;
                size3 = i52;
                i49 = i51;
                i48 = 1;
                i47 = i53;
            }
        }
        if (s2.a) {
            a8.b("total send time = " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public static void R(c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j3, gj gjVar, gj gjVar2, org.telegram.ui.rm rmVar, boolean z10, int i7, int i10, cw cwVar, long j10, long j11, long j12) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        int i11 = 0;
        richMessage.rtl = false;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
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
        while (i11 < size2) {
            TL_iv.PageBlock pageBlock2 = arrayList5.get(i11);
            i11++;
            j(pageBlock2, identityHashMap);
        }
        yy c10 = yy.c(null, null, null, null, null, null, null, null, null, null, j3, null, gjVar, gjVar2, null, true, null, null, null, null, z10, i7, i10, 0, null, null, false, false);
        c10.Y = richMessage;
        c10.Z = arrayList4;
        c10.J = rmVar;
        c10.K = cwVar;
        c10.O = j10;
        c10.R = j11;
        c10.Q = j12;
        C(cVar.a).r0(c10);
    }

    public static void S(final int i7, final long j3, final long j10, final long j11, final HashMap hashMap, final c cVar, final gj gjVar, final gj gjVar2, final cw cwVar, final TLRPC.BotInlineResult botInlineResult, final TL_stories.StoryItem storyItem, final org.telegram.ui.ActionBar.g2 g2Var, final org.telegram.ui.rm rmVar, final boolean z10) {
        yy d;
        TLRPC.TL_webPagePending tL_webPagePending;
        if (botInlineResult == null) {
            return;
        }
        TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaAuto) {
            new Thread(new Runnable() { // from class: org.telegram.messenger.nx
                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z11;
                    char c10;
                    long j12;
                    char c11;
                    final String str;
                    TLRPC.TL_document tL_document;
                    TLRPC.TL_photo tL_photo;
                    Bitmap K2;
                    int i10;
                    String str2;
                    TLRPC.BotInlineResult botInlineResult2;
                    TLRPC.TL_document tL_document2;
                    int i11;
                    TLRPC.InputPeer inputPeer;
                    long j13;
                    TLRPC.InputPeer inputPeer2;
                    boolean z12;
                    TLRPC.WebDocument webDocument;
                    long j14 = j3;
                    boolean C = n5.C(j14);
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
                        j12 = j14;
                        z11 = C;
                        tL_photo = null;
                        tL_document = null;
                        str = null;
                    } else if (botInlineResult3 instanceof TLRPC.TL_botInlineMediaResult) {
                        TLRPC.Document document2 = botInlineResult3.document;
                        if (document2 != null) {
                            if (document2 instanceof TLRPC.TL_document) {
                                tL_document = (TLRPC.TL_document) document2;
                                j12 = j14;
                                z11 = C;
                                tL_photo = null;
                                str2 = null;
                                str = str2;
                            }
                            j12 = j14;
                            z11 = C;
                            tL_photo = null;
                            tL_document = null;
                            str2 = null;
                            str = null;
                        } else {
                            TLRPC.Photo photo2 = botInlineResult3.photo;
                            if (photo2 != null && (photo2 instanceof TLRPC.TL_photo)) {
                                tL_photo = (TLRPC.TL_photo) photo2;
                                j12 = j14;
                                z11 = C;
                                tL_document = null;
                                str2 = null;
                                str = str2;
                            }
                            j12 = j14;
                            z11 = C;
                            tL_photo = null;
                            tL_document = null;
                            str2 = null;
                            str = null;
                        }
                    } else {
                        TLRPC.WebDocument webDocument2 = botInlineResult3.content;
                        if (webDocument2 != null) {
                            String B = fc.B(webDocument2.url, null);
                            File file = new File(w7.z(4), Utilities.a(botInlineResult3.content.url) + (TextUtils.isEmpty(B) ? w7.C(botInlineResult3.content.mime_type) : p5.c.k(".", B)));
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
                                    j12 = j14;
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
                                            int[] g12 = gj.g1(botInlineResult3);
                                            tL_documentAttributeImageSize.w = g12[0];
                                            tL_documentAttributeImageSize.h = g12[1];
                                            tL_document3.attributes.add(tL_documentAttributeImageSize);
                                            tL_documentAttributeFilename.file_name = "sticker.webp";
                                            try {
                                                if (botInlineResult3.thumb != null) {
                                                    Bitmap K3 = fc.K(new File(w7.z(4), Utilities.a(botInlineResult3.thumb.url) + "." + fc.B(botInlineResult3.thumb.url, "webp")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                                    if (K3 != null) {
                                                        TLRPC.PhotoSize Z = fc.Z(K3, 90.0f, 90.0f, 55, false);
                                                        if (Z != null) {
                                                            tL_document3.thumbs.add(Z);
                                                            tL_document3.flags |= 1;
                                                        }
                                                        K3.recycle();
                                                        break;
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                a8.g(th2, true);
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
                                            int i12 = z11 ? 90 : ls.r5;
                                            try {
                                                if (absolutePath.endsWith("mp4")) {
                                                    K2 = az.r(1, absolutePath);
                                                    if (K2 == null) {
                                                        TLRPC.WebDocument webDocument3 = botInlineResult3.thumb;
                                                        if ((webDocument3 instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument3.mime_type)) {
                                                            String B2 = fc.B(botInlineResult3.thumb.url, null);
                                                            K2 = az.r(1, new File(w7.z(4), Utilities.a(botInlineResult3.thumb.url) + (TextUtils.isEmpty(B2) ? w7.C(botInlineResult3.thumb.mime_type) : "." + B2)).getAbsolutePath());
                                                        }
                                                    }
                                                } else {
                                                    float f10 = i12;
                                                    K2 = fc.K(absolutePath, null, f10, f10, true);
                                                }
                                                if (K2 != null) {
                                                    float f11 = i12;
                                                    TLRPC.PhotoSize Z2 = fc.Z(K2, f11, f11, i12 > 90 ? 80 : 55, false);
                                                    if (Z2 != null) {
                                                        tL_document3.thumbs.add(Z2);
                                                        tL_document3.flags |= 1;
                                                    }
                                                    K2.recycle();
                                                    break;
                                                }
                                            } catch (Throwable th3) {
                                                a8.g(th3, true);
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
                                            tL_documentAttributeAudio.duration = gj.f1(botInlineResult3);
                                            tL_documentAttributeAudio.title = botInlineResult3.title;
                                            int i13 = tL_documentAttributeAudio.flags;
                                            tL_documentAttributeAudio.flags = i13 | 1;
                                            String str5 = botInlineResult3.description;
                                            if (str5 != null) {
                                                tL_documentAttributeAudio.performer = str5;
                                                tL_documentAttributeAudio.flags = i13 | 3;
                                            }
                                            tL_documentAttributeFilename.file_name = "audio.mp3";
                                            tL_document3.attributes.add(tL_documentAttributeAudio);
                                            break;
                                        case 4:
                                            tL_documentAttributeFilename.file_name = "video.mp4";
                                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                                            int[] g13 = gj.g1(botInlineResult3);
                                            tL_documentAttributeVideo.w = g13[0];
                                            tL_documentAttributeVideo.h = g13[1];
                                            tL_documentAttributeVideo.duration = gj.f1(botInlineResult3);
                                            tL_documentAttributeVideo.supports_streaming = true;
                                            tL_document3.attributes.add(tL_documentAttributeVideo);
                                            try {
                                                if (botInlineResult3.thumb != null) {
                                                    Bitmap K4 = fc.K(new File(w7.z(4), Utilities.a(botInlineResult3.thumb.url) + "." + fc.B(botInlineResult3.thumb.url, "jpg")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                                    if (K4 != null) {
                                                        TLRPC.PhotoSize Z3 = fc.Z(K4, 90.0f, 90.0f, 55, false);
                                                        if (Z3 != null) {
                                                            tL_document3.thumbs.add(Z3);
                                                            tL_document3.flags |= 1;
                                                        }
                                                        K4.recycle();
                                                        break;
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                a8.g(th4, true);
                                                break;
                                            }
                                            break;
                                        case 5:
                                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2 = new TLRPC.TL_documentAttributeAudio();
                                            tL_documentAttributeAudio2.duration = gj.f1(botInlineResult3);
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
                                        int[] g14 = gj.g1(botInlineResult3);
                                        tL_photoSize.w = g14[0];
                                        tL_photoSize.h = g14[1];
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
                                        i10 = 0;
                                        tL_photo = az.C(cVar2.a).A(absolutePath, null, false);
                                    } else {
                                        i10 = 0;
                                        tL_photo = null;
                                    }
                                    if (tL_photo == null) {
                                        tL_photo = new TLRPC.TL_photo();
                                        tL_photo.date = ConnectionsManager.getInstance(cVar2.a).getCurrentTime();
                                        tL_photo.file_reference = new byte[i10];
                                        TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                                        int[] g15 = gj.g1(botInlineResult3);
                                        tL_photoSize2.w = g15[i10];
                                        tL_photoSize2.h = g15[1];
                                        tL_photoSize2.size = 1;
                                        tL_photoSize2.location = new TLRPC.TL_fileLocationUnavailable();
                                        tL_photoSize2.type = "x";
                                        tL_photo.sizes.add(tL_photoSize2);
                                    }
                                    str = absolutePath;
                                    j12 = j14;
                                    tL_document = null;
                                    break;
                                default:
                                    str = absolutePath;
                                    j12 = j14;
                                    tL_photo = null;
                                    tL_document = null;
                                    break;
                            }
                            str2 = null;
                        }
                        j12 = j14;
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
                        for (int i14 = 0; i14 < tL_document.attributes.size(); i14++) {
                            if (tL_document.attributes.get(i14) instanceof TLRPC.TL_documentAttributeVideo) {
                                TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo2 = (TLRPC.TL_documentAttributeVideo) tL_document.attributes.get(i14);
                                TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                                tL_documentAttributeVideo_layer159.flags = tL_documentAttributeVideo2.flags;
                                tL_documentAttributeVideo_layer159.round_message = tL_documentAttributeVideo2.round_message;
                                tL_documentAttributeVideo_layer159.supports_streaming = tL_documentAttributeVideo2.supports_streaming;
                                tL_documentAttributeVideo_layer159.duration = tL_documentAttributeVideo2.duration;
                                tL_documentAttributeVideo_layer159.w = tL_documentAttributeVideo2.w;
                                tL_documentAttributeVideo_layer159.h = tL_documentAttributeVideo2.h;
                                tL_document.attributes.set(i14, tL_documentAttributeVideo_layer159);
                            }
                        }
                    }
                    if (gj.s3(tL_document, false)) {
                        TLRPC.PhotoSize w10 = w7.w(tL_document.thumbs, ls.r5, false, null, false);
                        w7.G(cVar2.a);
                        File I = w7.I(tL_document);
                        if (I.exists()) {
                            z12 = true;
                        } else {
                            w7.G(cVar2.a);
                            z12 = true;
                            I = w7.J(tL_document, null, true, true);
                        }
                        inputPeer = null;
                        tL_document2 = tL_document;
                        botInlineResult2 = botInlineResult3;
                        boolean z13 = z12;
                        az.w(cVar2, z11, tL_document2, I.getAbsolutePath(), null, 0L, false);
                        strArr[0] = az.D(cVar2, w10, bitmapArr, z13, z13);
                        i11 = z13;
                    } else {
                        botInlineResult2 = botInlineResult3;
                        tL_document2 = tL_document;
                        i11 = 1;
                        inputPeer = null;
                    }
                    if (n5.C(j12)) {
                        j13 = j12;
                        inputPeer2 = inputPeer;
                    } else {
                        j13 = j12;
                        inputPeer2 = np.u1(cVar2.a).l1(j13);
                    }
                    if (inputPeer2 != null && inputPeer2.user_id != 0 && np.u1(cVar2.a).d2(inputPeer2.user_id) != null && np.u1(cVar2.a).d2(inputPeer2.user_id).voice_messages_forbidden && tL_document2 != null) {
                        boolean Q4 = gj.Q4(tL_document2);
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        if (Q4) {
                            g0.g3(new mn(i11, g2Var2));
                            return;
                        } else if (gj.i4(tL_document2)) {
                            g0.g3(new mn(2, g2Var2));
                            return;
                        }
                    }
                    final gj gjVar3 = gjVar;
                    final gj gjVar4 = gjVar2;
                    final long j15 = j13;
                    final boolean z14 = z10;
                    final int i15 = i7;
                    final cw cwVar2 = cwVar;
                    final TL_stories.StoryItem storyItem2 = storyItem;
                    final org.telegram.ui.rm rmVar2 = rmVar;
                    final long j16 = j10;
                    final long j17 = j11;
                    final TLRPC.TL_document tL_document4 = tL_document2;
                    final TLRPC.BotInlineResult botInlineResult4 = botInlineResult2;
                    final TLRPC.TL_photo tL_photo2 = tL_photo;
                    g0.g3(new Runnable() { // from class: org.telegram.messenger.gy
                        @Override // java.lang.Runnable
                        public final void run() {
                            yy c12;
                            TLRPC.TL_document tL_document5 = TLRPC.TL_document.this;
                            long j18 = j15;
                            gj gjVar5 = gjVar3;
                            gj gjVar6 = gjVar4;
                            TLRPC.BotInlineResult botInlineResult5 = botInlineResult4;
                            HashMap hashMap3 = hashMap2;
                            boolean z15 = z14;
                            int i16 = i15;
                            if (tL_document5 != null) {
                                Bitmap[] bitmapArr2 = bitmapArr;
                                if (bitmapArr2[0] != null) {
                                    String[] strArr2 = strArr;
                                    if (strArr2[0] != null) {
                                        fc.D().O(new BitmapDrawable(bitmapArr2[0]), strArr2[0], false);
                                    }
                                }
                                TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult5.send_message;
                                c12 = yy.f(tL_document5, null, str, j18, gjVar5, gjVar6, botInlineMessage2.message, botInlineMessage2.entities, botInlineMessage2.reply_markup, hashMap3, z15, i16, 0, 0, botInlineResult5, null, false);
                            } else {
                                TLRPC.TL_photo tL_photo3 = tL_photo2;
                                if (tL_photo3 != null) {
                                    TLRPC.WebDocument webDocument4 = botInlineResult5.content;
                                    String str6 = webDocument4 != null ? webDocument4.url : null;
                                    TLRPC.BotInlineMessage botInlineMessage3 = botInlineResult5.send_message;
                                    c12 = yy.c(null, botInlineMessage3.message, null, tL_photo3, null, null, null, null, null, null, j18, str6, gjVar5, gjVar6, null, true, null, botInlineMessage3.entities, botInlineMessage3.reply_markup, hashMap3, z15, i16, 0, 0, botInlineResult5, null, false, false);
                                } else {
                                    TLRPC.TL_game tL_game3 = tL_game2;
                                    c12 = tL_game3 != null ? yy.c(null, null, null, null, null, null, null, tL_game3, null, null, j18, null, gjVar5, gjVar6, null, true, null, null, botInlineResult5.send_message.reply_markup, hashMap3, z15, i16, 0, 0, null, null, false, false) : null;
                                }
                            }
                            if (c12 != null) {
                                c12.K = cwVar2;
                                c12.H = storyItem2;
                                c12.J = rmVar2;
                                c12.Q = j16;
                                c12.R = j17;
                                az.C(cVar2.a).r0(c12);
                            }
                        }
                    });
                }
            }).run();
            return;
        }
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageText) {
            if (n5.C(j3)) {
                for (int i10 = 0; i10 < botInlineResult.send_message.entities.size(); i10++) {
                    TLRPC.MessageEntity messageEntity = botInlineResult.send_message.entities.get(i10);
                    if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                        tL_webPagePending = new TLRPC.TL_webPagePending();
                        String str = botInlineResult.send_message.message;
                        int i11 = messageEntity.offset;
                        tL_webPagePending.url = str.substring(i11, messageEntity.length + i11);
                        break;
                    }
                }
            }
            tL_webPagePending = null;
            TLRPC.TL_webPagePending tL_webPagePending2 = tL_webPagePending;
            TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
            yy b10 = yy.b(botInlineMessage2.message, j3, gjVar, gjVar2, tL_webPagePending2, !botInlineMessage2.no_webpage, botInlineMessage2.entities, botInlineMessage2.reply_markup, hashMap, z10, i7, 0, null, false);
            b10.K = cwVar;
            b10.J = rmVar;
            b10.Q = j10;
            b10.R = j11;
            C(cVar.a).r0(b10);
            return;
        }
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageRichMessage) {
            TL_iv.RichMessage richMessage = botInlineMessage.rich_message;
            yy c10 = yy.c(null, null, null, null, null, null, null, null, null, null, j3, null, gjVar, gjVar2, null, true, null, null, botInlineMessage.reply_markup, hashMap, z10, i7, 0, 0, null, null, false, false);
            c10.Y = richMessage;
            c10.K = cwVar;
            c10.J = rmVar;
            c10.Q = j10;
            c10.R = j11;
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
            yy d2 = yy.d(tL_messageMediaWidget, j3, gjVar, gjVar2, botInlineResult.send_message.reply_markup, hashMap, z10, i7);
            d2.b = tL_botInlineMessageWidget.message;
            d2.w = tL_botInlineMessageWidget.entities;
            d2.L = tL_botInlineMessageWidget.invert_media;
            d2.K = cwVar;
            d2.J = rmVar;
            d2.Q = j10;
            d2.R = j11;
            C(cVar.a).r0(d2);
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
            yy d10 = yy.d(tL_messageMediaVenue, j3, gjVar, gjVar2, botInlineMessage3.reply_markup, hashMap, z10, i7);
            d10.K = cwVar;
            d10.J = rmVar;
            d10.Q = j10;
            d10.R = j11;
            C(cVar.a).r0(d10);
            return;
        }
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) {
            if (botInlineMessage.period == 0 && botInlineMessage.proximity_notification_radius == 0) {
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.BotInlineMessage botInlineMessage4 = botInlineResult.send_message;
                tL_messageMediaGeo.geo = botInlineMessage4.geo;
                tL_messageMediaGeo.heading = botInlineMessage4.heading;
                d = yy.d(tL_messageMediaGeo, j3, gjVar, gjVar2, botInlineMessage4.reply_markup, hashMap, z10, i7);
            } else {
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.BotInlineMessage botInlineMessage5 = botInlineResult.send_message;
                int i12 = botInlineMessage5.period;
                if (i12 == 0) {
                    i12 = 900;
                }
                tL_messageMediaGeoLive.period = i12;
                tL_messageMediaGeoLive.geo = botInlineMessage5.geo;
                tL_messageMediaGeoLive.heading = botInlineMessage5.heading;
                tL_messageMediaGeoLive.proximity_notification_radius = botInlineMessage5.proximity_notification_radius;
                d = yy.d(tL_messageMediaGeoLive, j3, gjVar, gjVar2, botInlineMessage5.reply_markup, hashMap, z10, i7);
            }
            d.K = cwVar;
            d.J = rmVar;
            d.Q = j10;
            d.R = j11;
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
            yy g10 = yy.g(tL_user, j3, gjVar, gjVar2, botInlineResult.send_message.reply_markup, hashMap, z10, i7, 0);
            g10.K = cwVar;
            g10.J = rmVar;
            g10.Q = j10;
            g10.R = j11;
            C(cVar.a).r0(g10);
            return;
        }
        if (!(botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaInvoice)) {
            if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage) {
                TLRPC.TL_webPagePending tL_webPagePending3 = new TLRPC.TL_webPagePending();
                tL_webPagePending3.url = ((TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage).url;
                TLRPC.BotInlineMessage botInlineMessage7 = botInlineResult.send_message;
                yy b11 = yy.b(botInlineMessage7.message, j3, gjVar, gjVar2, tL_webPagePending3, !botInlineMessage7.no_webpage, botInlineMessage7.entities, botInlineMessage7.reply_markup, hashMap, z10, i7, 0, null, false);
                b11.K = cwVar;
                b11.J = rmVar;
                b11.Q = j10;
                b11.R = j11;
                b11.L = botInlineResult.send_message.invert_media;
                C(cVar.a).r0(b11);
                return;
            }
            return;
        }
        if (n5.C(j3)) {
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
        yy c11 = yy.c(null, null, null, null, null, null, null, null, null, tL_messageMediaInvoice, j3, null, gjVar, gjVar2, null, true, null, null, botInlineResult.send_message.reply_markup, hashMap, z10, i7, 0, 0, null, null, false, false);
        c11.K = cwVar;
        c11.J = rmVar;
        c11.Q = j10;
        c11.R = j11;
        C(cVar.a).r0(c11);
    }

    public static void T(c cVar, String str, String str2, Uri uri, String str3, String str4, long j3, gj gjVar, gj gjVar2, TL_stories.StoryItem storyItem, org.telegram.ui.rm rmVar, boolean z10, org.telegram.ui.Components.qf qfVar, cw cwVar) {
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
        V(0, j3, 0L, 0L, 0L, str3, str4, arrayList2, arrayList3, arrayList4, null, null, null, cVar, gjVar, gjVar2, null, null, cwVar, storyItem, rmVar, qfVar, null, z10, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:292|293|(7:295|296|297|298|299|300|301)(1:349)|(3:310|311|(3:313|314|(4:316|304|305|306)))|303|304|305|306) */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0212, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0213, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
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
    public static int U(c cVar, String str, String str2, Uri uri, String str3, final long j3, final gj gjVar, final gj gjVar2, final TL_stories.StoryItem storyItem, final org.telegram.ui.rm rmVar, final ArrayList arrayList, final gj gjVar3, long[] jArr, boolean z10, CharSequence charSequence, final boolean z11, int i7, final int i10, Integer[] numArr, boolean z12, final cw cwVar, final long j10, final boolean z13, final long j11, final long j12, final lj ljVar, final sh.f fVar, final int i11) {
        MimeTypeMap mimeTypeMap;
        long j13;
        int i12;
        long j14;
        final String str4;
        String str5;
        String str6;
        String lowerCase;
        Object obj;
        Object obj2;
        rf.a a10;
        String str7;
        Bitmap bitmap;
        String str8;
        int i13;
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
        int i14;
        final int i15;
        long j15;
        Uri uri2;
        int i16;
        BitmapFactory.Options options;
        int i17;
        int i18;
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
        int i19;
        String str22;
        String str23;
        String str24;
        String str25;
        Bitmap bitmap5;
        boolean z18;
        long j16;
        long j17;
        boolean z19;
        Cursor query;
        c cVar2 = cVar;
        String str26 = str2;
        long j18 = fVar != null ? fVar.c : 0L;
        if (((str != null && str.length() != 0) || uri != null) && ((uri == null || !g0.I1(uri, 0)) && (str == null || !g0.I1(Uri.fromFile(new File(str)), 0)))) {
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            if (uri != null && str == null) {
                try {
                    j14 = 0;
                    try {
                        AssetFileDescriptor openAssetFileDescriptor = t0.b.getContentResolver().openAssetFileDescriptor(uri, "r", null);
                        if (openAssetFileDescriptor != null) {
                            try {
                                j16 = openAssetFileDescriptor.getLength();
                            } catch (Exception e10) {
                                e = e10;
                                mimeTypeMap = singleton;
                                j13 = j18;
                                j16 = 0;
                                i12 = 2;
                                a8.g(e, true);
                                j17 = j16;
                                if (w7.m(cVar2.a, j17)) {
                                }
                                return i12;
                            }
                        } else {
                            j16 = 0;
                        }
                        try {
                            long j19 = j18;
                            try {
                                j13 = j19;
                                mimeTypeMap = singleton;
                                i12 = 2;
                                try {
                                    query = t0.b.getContentResolver().query(uri, new String[]{"_size"}, null, null, null);
                                    int columnIndex = query.getColumnIndex("_size");
                                    query.moveToFirst();
                                    j17 = query.getLong(columnIndex);
                                } catch (Exception e11) {
                                    e = e11;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                mimeTypeMap = singleton;
                                j13 = j19;
                                i12 = 2;
                                a8.g(e, true);
                                j17 = j16;
                                if (w7.m(cVar2.a, j17)) {
                                }
                                return i12;
                            }
                            try {
                                query.close();
                            } catch (Exception e13) {
                                e = e13;
                                j16 = j17;
                                a8.g(e, true);
                                j17 = j16;
                                if (w7.m(cVar2.a, j17)) {
                                }
                                return i12;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            mimeTypeMap = singleton;
                            j13 = j18;
                        }
                    } catch (Exception e15) {
                        e = e15;
                        mimeTypeMap = singleton;
                        j13 = j18;
                        i12 = 2;
                        j16 = j14;
                        a8.g(e, true);
                        j17 = j16;
                        if (w7.m(cVar2.a, j17)) {
                        }
                        return i12;
                    }
                } catch (Exception e16) {
                    e = e16;
                    mimeTypeMap = singleton;
                    j13 = j18;
                    i12 = 2;
                    j14 = 0;
                }
                if (w7.m(cVar2.a, j17)) {
                    str5 = str3 != null ? mimeTypeMap.getExtensionFromMimeType(str3) : null;
                    if (str5 == null) {
                        str5 = "txt";
                        z19 = false;
                    } else {
                        z19 = true;
                    }
                    String t6 = MediaController.t(-1L, uri, str5);
                    if (t6 != null) {
                        str4 = t6;
                    }
                }
                return i12;
            }
            mimeTypeMap = singleton;
            j13 = j18;
            i12 = 2;
            j14 = 0;
            str4 = str;
            str5 = null;
            File file2 = new File(str4);
            if (file2.exists() && file2.length() != j14) {
                if (w7.m(cVar2.a, file2.length())) {
                    boolean C = n5.C(j3);
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
                                                            i19 = ceil;
                                                            try {
                                                                str24 = extractMetadata;
                                                                str25 = mediaMetadataRetriever2.extractMetadata(i12);
                                                            } catch (Exception e17) {
                                                                e = e17;
                                                                str22 = extractMetadata;
                                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                                                bitmap4 = null;
                                                                z17 = true;
                                                                str23 = null;
                                                                try {
                                                                    a8.g(e, z17);
                                                                    if (mediaMetadataRetriever != null) {
                                                                    }
                                                                    bitmap2 = bitmap4;
                                                                    i13 = i19;
                                                                    str11 = str22;
                                                                    str10 = str23;
                                                                    str7 = lowerCase;
                                                                    z14 = false;
                                                                    if (i13 != 0) {
                                                                    }
                                                                    if (str26 != null) {
                                                                    }
                                                                    z15 = false;
                                                                    if (fVar == null) {
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
                                                                    int i20 = 0;
                                                                    if (numArr != null) {
                                                                    }
                                                                    i14 = i20;
                                                                    if (z16) {
                                                                    }
                                                                    i15 = i7;
                                                                    j15 = j13;
                                                                    if (j15 != 0) {
                                                                    }
                                                                    final c cVar3 = cVar2;
                                                                    final TLRPC.TL_document tL_document3 = tL_document;
                                                                    final String str27 = str17;
                                                                    int i21 = i20;
                                                                    g0.g3(new Runnable() { // from class: org.telegram.messenger.rx
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            gj gjVar4 = gj.this;
                                                                            c cVar4 = cVar3;
                                                                            TLRPC.TL_document tL_document4 = tL_document3;
                                                                            String str28 = str4;
                                                                            HashMap hashMap2 = hashMap;
                                                                            String str29 = str27;
                                                                            if (gjVar4 != null) {
                                                                                az.C(cVar4.a).t(gjVar4, null, null, null, tL_document4, str28, null, hashMap2, false, false, str29);
                                                                                return;
                                                                            }
                                                                            yy f10 = yy.f(tL_document4, null, str28, j3, gjVar, gjVar2, r11, arrayList, null, hashMap2, z11, i15, i10, 0, str29, null, false);
                                                                            f10.H = storyItem;
                                                                            f10.J = rmVar;
                                                                            f10.K = cwVar;
                                                                            f10.O = j10;
                                                                            f10.L = z13;
                                                                            f10.Q = j11;
                                                                            f10.R = j12;
                                                                            f10.T = ljVar;
                                                                            f10.k = i11;
                                                                            f10.j = fVar;
                                                                            az.C(cVar4.a).r0(f10);
                                                                        }
                                                                    });
                                                                    return i21;
                                                                } catch (Throwable th3) {
                                                                    th2 = th3;
                                                                    if (mediaMetadataRetriever != null) {
                                                                    }
                                                                }
                                                            }
                                                        } catch (Exception e18) {
                                                            e = e18;
                                                            i19 = ceil;
                                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                                            bitmap4 = null;
                                                            z17 = true;
                                                            str22 = null;
                                                            str23 = null;
                                                            a8.g(e, z17);
                                                            if (mediaMetadataRetriever != null) {
                                                            }
                                                            bitmap2 = bitmap4;
                                                            i13 = i19;
                                                            str11 = str22;
                                                            str10 = str23;
                                                            str7 = lowerCase;
                                                            z14 = false;
                                                            if (i13 != 0) {
                                                            }
                                                            if (str26 != null) {
                                                            }
                                                            z15 = false;
                                                            if (fVar == null) {
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
                                                            int i202 = 0;
                                                            if (numArr != null) {
                                                            }
                                                            i14 = i202;
                                                            if (z16) {
                                                            }
                                                            i15 = i7;
                                                            j15 = j13;
                                                            if (j15 != 0) {
                                                            }
                                                            final c cVar32 = cVar2;
                                                            final TLRPC.TL_document tL_document32 = tL_document;
                                                            final String str272 = str17;
                                                            int i212 = i202;
                                                            g0.g3(new Runnable() { // from class: org.telegram.messenger.rx
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    gj gjVar4 = gj.this;
                                                                    c cVar4 = cVar32;
                                                                    TLRPC.TL_document tL_document4 = tL_document32;
                                                                    String str28 = str4;
                                                                    HashMap hashMap2 = hashMap;
                                                                    String str29 = str272;
                                                                    if (gjVar4 != null) {
                                                                        az.C(cVar4.a).t(gjVar4, null, null, null, tL_document4, str28, null, hashMap2, false, false, str29);
                                                                        return;
                                                                    }
                                                                    yy f10 = yy.f(tL_document4, null, str28, j3, gjVar, gjVar2, r11, arrayList, null, hashMap2, z11, i15, i10, 0, str29, null, false);
                                                                    f10.H = storyItem;
                                                                    f10.J = rmVar;
                                                                    f10.K = cwVar;
                                                                    f10.O = j10;
                                                                    f10.L = z13;
                                                                    f10.Q = j11;
                                                                    f10.R = j12;
                                                                    f10.T = ljVar;
                                                                    f10.k = i11;
                                                                    f10.j = fVar;
                                                                    az.C(cVar4.a).r0(f10);
                                                                }
                                                            });
                                                            return i212;
                                                        }
                                                    } catch (Exception e19) {
                                                        e = e19;
                                                        mediaMetadataRetriever = mediaMetadataRetriever2;
                                                        bitmap4 = null;
                                                        z17 = true;
                                                        i19 = 0;
                                                        str22 = null;
                                                        str23 = null;
                                                        a8.g(e, z17);
                                                        if (mediaMetadataRetriever != null) {
                                                        }
                                                        bitmap2 = bitmap4;
                                                        i13 = i19;
                                                        str11 = str22;
                                                        str10 = str23;
                                                        str7 = lowerCase;
                                                        z14 = false;
                                                        if (i13 != 0) {
                                                        }
                                                        if (str26 != null) {
                                                        }
                                                        z15 = false;
                                                        if (fVar == null) {
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
                                                        int i2022 = 0;
                                                        if (numArr != null) {
                                                        }
                                                        i14 = i2022;
                                                        if (z16) {
                                                        }
                                                        i15 = i7;
                                                        j15 = j13;
                                                        if (j15 != 0) {
                                                        }
                                                        final c cVar322 = cVar2;
                                                        final TLRPC.TL_document tL_document322 = tL_document;
                                                        final String str2722 = str17;
                                                        int i2122 = i2022;
                                                        g0.g3(new Runnable() { // from class: org.telegram.messenger.rx
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                gj gjVar4 = gj.this;
                                                                c cVar4 = cVar322;
                                                                TLRPC.TL_document tL_document4 = tL_document322;
                                                                String str28 = str4;
                                                                HashMap hashMap2 = hashMap;
                                                                String str29 = str2722;
                                                                if (gjVar4 != null) {
                                                                    az.C(cVar4.a).t(gjVar4, null, null, null, tL_document4, str28, null, hashMap2, false, false, str29);
                                                                    return;
                                                                }
                                                                yy f10 = yy.f(tL_document4, null, str28, j3, gjVar, gjVar2, r11, arrayList, null, hashMap2, z11, i15, i10, 0, str29, null, false);
                                                                f10.H = storyItem;
                                                                f10.J = rmVar;
                                                                f10.K = cwVar;
                                                                f10.O = j10;
                                                                f10.L = z13;
                                                                f10.Q = j11;
                                                                f10.R = j12;
                                                                f10.T = ljVar;
                                                                f10.k = i11;
                                                                f10.j = fVar;
                                                                az.C(cVar4.a).r0(f10);
                                                            }
                                                        });
                                                        return i2122;
                                                    }
                                                } else {
                                                    obj = "flac";
                                                    obj2 = "opus";
                                                    str24 = null;
                                                    str25 = null;
                                                    i19 = 0;
                                                }
                                                try {
                                                    byte[] embeddedPicture = mediaMetadataRetriever2.getEmbeddedPicture();
                                                    if (embeddedPicture != null) {
                                                        str22 = str24;
                                                        try {
                                                            str23 = str25;
                                                        } catch (Exception e20) {
                                                            e = e20;
                                                            str23 = str25;
                                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                                            bitmap4 = null;
                                                            z17 = true;
                                                            a8.g(e, z17);
                                                            if (mediaMetadataRetriever != null) {
                                                                try {
                                                                    mediaMetadataRetriever.release();
                                                                } catch (Exception e21) {
                                                                    a8.g(e21, z17);
                                                                }
                                                            }
                                                            bitmap2 = bitmap4;
                                                            i13 = i19;
                                                            str11 = str22;
                                                            str10 = str23;
                                                            str7 = lowerCase;
                                                            z14 = false;
                                                            if (i13 != 0) {
                                                            }
                                                            if (str26 != null) {
                                                            }
                                                            z15 = false;
                                                            if (fVar == null) {
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
                                                            int i20222 = 0;
                                                            if (numArr != null) {
                                                            }
                                                            i14 = i20222;
                                                            if (z16) {
                                                            }
                                                            i15 = i7;
                                                            j15 = j13;
                                                            if (j15 != 0) {
                                                            }
                                                            final c cVar3222 = cVar2;
                                                            final TLRPC.TL_document tL_document3222 = tL_document;
                                                            final String str27222 = str17;
                                                            int i21222 = i20222;
                                                            g0.g3(new Runnable() { // from class: org.telegram.messenger.rx
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    gj gjVar4 = gj.this;
                                                                    c cVar4 = cVar3222;
                                                                    TLRPC.TL_document tL_document4 = tL_document3222;
                                                                    String str28 = str4;
                                                                    HashMap hashMap2 = hashMap;
                                                                    String str29 = str27222;
                                                                    if (gjVar4 != null) {
                                                                        az.C(cVar4.a).t(gjVar4, null, null, null, tL_document4, str28, null, hashMap2, false, false, str29);
                                                                        return;
                                                                    }
                                                                    yy f10 = yy.f(tL_document4, null, str28, j3, gjVar, gjVar2, r11, arrayList, null, hashMap2, z11, i15, i10, 0, str29, null, false);
                                                                    f10.H = storyItem;
                                                                    f10.J = rmVar;
                                                                    f10.K = cwVar;
                                                                    f10.O = j10;
                                                                    f10.L = z13;
                                                                    f10.Q = j11;
                                                                    f10.R = j12;
                                                                    f10.T = ljVar;
                                                                    f10.k = i11;
                                                                    f10.j = fVar;
                                                                    az.C(cVar4.a).r0(f10);
                                                                }
                                                            });
                                                            return i21222;
                                                        }
                                                        try {
                                                            bitmap5 = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
                                                        } catch (Exception e22) {
                                                            e = e22;
                                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                                            bitmap4 = null;
                                                            z17 = true;
                                                            a8.g(e, z17);
                                                            if (mediaMetadataRetriever != null) {
                                                            }
                                                            bitmap2 = bitmap4;
                                                            i13 = i19;
                                                            str11 = str22;
                                                            str10 = str23;
                                                            str7 = lowerCase;
                                                            z14 = false;
                                                            if (i13 != 0) {
                                                            }
                                                            if (str26 != null) {
                                                            }
                                                            z15 = false;
                                                            if (fVar == null) {
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
                                                            int i202222 = 0;
                                                            if (numArr != null) {
                                                            }
                                                            i14 = i202222;
                                                            if (z16) {
                                                            }
                                                            i15 = i7;
                                                            j15 = j13;
                                                            if (j15 != 0) {
                                                            }
                                                            final c cVar32222 = cVar2;
                                                            final TLRPC.TL_document tL_document32222 = tL_document;
                                                            final String str272222 = str17;
                                                            int i212222 = i202222;
                                                            g0.g3(new Runnable() { // from class: org.telegram.messenger.rx
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    gj gjVar4 = gj.this;
                                                                    c cVar4 = cVar32222;
                                                                    TLRPC.TL_document tL_document4 = tL_document32222;
                                                                    String str28 = str4;
                                                                    HashMap hashMap2 = hashMap;
                                                                    String str29 = str272222;
                                                                    if (gjVar4 != null) {
                                                                        az.C(cVar4.a).t(gjVar4, null, null, null, tL_document4, str28, null, hashMap2, false, false, str29);
                                                                        return;
                                                                    }
                                                                    yy f10 = yy.f(tL_document4, null, str28, j3, gjVar, gjVar2, r11, arrayList, null, hashMap2, z11, i15, i10, 0, str29, null, false);
                                                                    f10.H = storyItem;
                                                                    f10.J = rmVar;
                                                                    f10.K = cwVar;
                                                                    f10.O = j10;
                                                                    f10.L = z13;
                                                                    f10.Q = j11;
                                                                    f10.R = j12;
                                                                    f10.T = ljVar;
                                                                    f10.k = i11;
                                                                    f10.j = fVar;
                                                                    az.C(cVar4.a).r0(f10);
                                                                }
                                                            });
                                                            return i212222;
                                                        }
                                                    } else {
                                                        str22 = str24;
                                                        str23 = str25;
                                                        bitmap5 = null;
                                                    }
                                                    if (gjVar3 == null) {
                                                        try {
                                                            if (lowerCase.equals("ogg")) {
                                                                if (MediaController.isOpusFile(file2.getAbsolutePath()) == 1) {
                                                                    z18 = true;
                                                                    mediaMetadataRetriever2.release();
                                                                    int i22 = i19;
                                                                    str7 = lowerCase;
                                                                    z14 = z18;
                                                                    i13 = i22;
                                                                    bitmap2 = bitmap5;
                                                                    str11 = str22;
                                                                    str10 = str23;
                                                                }
                                                            }
                                                        } catch (Exception e23) {
                                                            e = e23;
                                                            bitmap4 = bitmap5;
                                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                                            z17 = true;
                                                            a8.g(e, z17);
                                                            if (mediaMetadataRetriever != null) {
                                                            }
                                                            bitmap2 = bitmap4;
                                                            i13 = i19;
                                                            str11 = str22;
                                                            str10 = str23;
                                                            str7 = lowerCase;
                                                            z14 = false;
                                                            if (i13 != 0) {
                                                            }
                                                            if (str26 != null) {
                                                            }
                                                            z15 = false;
                                                            if (fVar == null) {
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
                                                            int i2022222 = 0;
                                                            if (numArr != null) {
                                                            }
                                                            i14 = i2022222;
                                                            if (z16) {
                                                            }
                                                            i15 = i7;
                                                            j15 = j13;
                                                            if (j15 != 0) {
                                                            }
                                                            final c cVar322222 = cVar2;
                                                            final TLRPC.TL_document tL_document322222 = tL_document;
                                                            final String str2722222 = str17;
                                                            int i2122222 = i2022222;
                                                            g0.g3(new Runnable() { // from class: org.telegram.messenger.rx
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    gj gjVar4 = gj.this;
                                                                    c cVar4 = cVar322222;
                                                                    TLRPC.TL_document tL_document4 = tL_document322222;
                                                                    String str28 = str4;
                                                                    HashMap hashMap2 = hashMap;
                                                                    String str29 = str2722222;
                                                                    if (gjVar4 != null) {
                                                                        az.C(cVar4.a).t(gjVar4, null, null, null, tL_document4, str28, null, hashMap2, false, false, str29);
                                                                        return;
                                                                    }
                                                                    yy f10 = yy.f(tL_document4, null, str28, j3, gjVar, gjVar2, r11, arrayList, null, hashMap2, z11, i15, i10, 0, str29, null, false);
                                                                    f10.H = storyItem;
                                                                    f10.J = rmVar;
                                                                    f10.K = cwVar;
                                                                    f10.O = j10;
                                                                    f10.L = z13;
                                                                    f10.Q = j11;
                                                                    f10.R = j12;
                                                                    f10.T = ljVar;
                                                                    f10.k = i11;
                                                                    f10.j = fVar;
                                                                    az.C(cVar4.a).r0(f10);
                                                                }
                                                            });
                                                            return i2122222;
                                                        }
                                                    }
                                                    z18 = false;
                                                    mediaMetadataRetriever2.release();
                                                    int i222 = i19;
                                                    str7 = lowerCase;
                                                    z14 = z18;
                                                    i13 = i222;
                                                    bitmap2 = bitmap5;
                                                    str11 = str22;
                                                    str10 = str23;
                                                } catch (Exception e24) {
                                                    e = e24;
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
                                                } catch (Exception e25) {
                                                    a8.g(e25, true);
                                                    throw th2;
                                                }
                                            }
                                        } catch (Exception e26) {
                                            e = e26;
                                            obj = "flac";
                                            obj2 = "opus";
                                        }
                                    } catch (Exception e27) {
                                        e = e27;
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
                                    i13 = 0;
                                    str11 = null;
                                    bitmap2 = null;
                                }
                                if (i13 != 0) {
                                    boolean z20 = z14;
                                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio3 = new TLRPC.TL_documentAttributeAudio();
                                    obj3 = "ogg";
                                    tL_documentAttributeAudio3.duration = i13;
                                    tL_documentAttributeAudio3.title = str11;
                                    tL_documentAttributeAudio3.performer = str10;
                                    if (str11 == null) {
                                        tL_documentAttributeAudio3.title = "";
                                    }
                                    int i23 = tL_documentAttributeAudio3.flags;
                                    tL_documentAttributeAudio3.flags = i23 | 1;
                                    if (str10 == null) {
                                        tL_documentAttributeAudio3.performer = "";
                                    }
                                    tL_documentAttributeAudio3.flags = i23 | 3;
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
                                        boolean z21 = fVar == null;
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
                                            Object[] g02 = ur.a0(cVar2.a).g0(!C ? 1 : 4, str26);
                                            if (g02 != null) {
                                                Object obj9 = g02[0];
                                                if (obj9 instanceof TLRPC.TL_document) {
                                                    tL_document2 = (TLRPC.TL_document) obj9;
                                                    str19 = (String) g02[1];
                                                    if (tL_document2 == null || str4.equals(str26) || C) {
                                                        str20 = str19;
                                                    } else {
                                                        ur a02 = ur.a0(cVar2.a);
                                                        StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str4);
                                                        str20 = str19;
                                                        m10.append(file2.length());
                                                        Object[] g03 = a02.g0(!C ? 1 : 4, m10.toString());
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
                                            tL_document.id = j14;
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
                                            if (!z12 && tL_document.mime_type.equals("image/gif") && (gjVar3 == null || gjVar3.d1() == 0)) {
                                                try {
                                                    uri2 = null;
                                                    try {
                                                        Bitmap K2 = fc.K(file.getAbsolutePath(), null, 90.0f, 90.0f, true);
                                                        if (K2 != null) {
                                                            tL_documentAttributeFilename.file_name = "animation.gif";
                                                            tL_document.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                                            TLRPC.PhotoSize Z = fc.Z(K2, 90.0f, 90.0f, 55, z16);
                                                            if (Z != null) {
                                                                tL_document.thumbs.add(Z);
                                                                tL_document.flags |= 1;
                                                            }
                                                            K2.recycle();
                                                        }
                                                    } catch (Exception e28) {
                                                        e = e28;
                                                        i16 = 1;
                                                        a8.g(e, true);
                                                        if (bitmap3 != null) {
                                                        }
                                                        if (tL_document.mime_type.equals("image/webp")) {
                                                            options = new BitmapFactory.Options();
                                                            try {
                                                                options.inJustDecodeBounds = true;
                                                                BitmapFactory.decodeFile(str4, options);
                                                            } catch (Exception e29) {
                                                                a8.g(e29, true);
                                                            }
                                                            i17 = options.outWidth;
                                                            if (i17 != 0) {
                                                                TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                                                                str16 = str13;
                                                                tL_documentAttributeSticker.alt = str16;
                                                                tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                                                                tL_document.attributes.add(tL_documentAttributeSticker);
                                                                TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                                                                tL_documentAttributeImageSize.w = options.outWidth;
                                                                tL_documentAttributeImageSize.h = options.outHeight;
                                                                tL_document.attributes.add(tL_documentAttributeImageSize);
                                                                b02 = fc.b0(null, fc.K(file.getAbsolutePath(), uri2, 400.0f, 400.0f, true), Bitmap.CompressFormat.PNG, 400.0f, 400.0f, 100, z16, 0, 0, false);
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
                                                                int i20222222 = 0;
                                                                if (numArr != null) {
                                                                }
                                                                i14 = i20222222;
                                                                if (z16) {
                                                                }
                                                                i15 = i7;
                                                                j15 = j13;
                                                                if (j15 != 0) {
                                                                }
                                                                final c cVar3222222 = cVar2;
                                                                final TLRPC.TL_document tL_document3222222 = tL_document;
                                                                final String str27222222 = str17;
                                                                int i21222222 = i20222222;
                                                                g0.g3(new Runnable() { // from class: org.telegram.messenger.rx
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        gj gjVar4 = gj.this;
                                                                        c cVar4 = cVar3222222;
                                                                        TLRPC.TL_document tL_document43 = tL_document3222222;
                                                                        String str28 = str4;
                                                                        HashMap hashMap2 = hashMap;
                                                                        String str29 = str27222222;
                                                                        if (gjVar4 != null) {
                                                                            az.C(cVar4.a).t(gjVar4, null, null, null, tL_document43, str28, null, hashMap2, false, false, str29);
                                                                            return;
                                                                        }
                                                                        yy f10 = yy.f(tL_document43, null, str28, j3, gjVar, gjVar2, r11, arrayList, null, hashMap2, z11, i15, i10, 0, str29, null, false);
                                                                        f10.H = storyItem;
                                                                        f10.J = rmVar;
                                                                        f10.K = cwVar;
                                                                        f10.O = j10;
                                                                        f10.L = z13;
                                                                        f10.Q = j11;
                                                                        f10.R = j12;
                                                                        f10.T = ljVar;
                                                                        f10.k = i11;
                                                                        f10.j = fVar;
                                                                        az.C(cVar4.a).r0(f10);
                                                                    }
                                                                });
                                                                return i21222222;
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
                                                        int i202222222 = 0;
                                                        if (numArr != null) {
                                                        }
                                                        i14 = i202222222;
                                                        if (z16) {
                                                        }
                                                        i15 = i7;
                                                        j15 = j13;
                                                        if (j15 != 0) {
                                                        }
                                                        final c cVar32222222 = cVar2;
                                                        final TLRPC.TL_document tL_document32222222 = tL_document;
                                                        final String str272222222 = str17;
                                                        int i212222222 = i202222222;
                                                        g0.g3(new Runnable() { // from class: org.telegram.messenger.rx
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                gj gjVar4 = gj.this;
                                                                c cVar4 = cVar32222222;
                                                                TLRPC.TL_document tL_document43 = tL_document32222222;
                                                                String str28 = str4;
                                                                HashMap hashMap2 = hashMap;
                                                                String str29 = str272222222;
                                                                if (gjVar4 != null) {
                                                                    az.C(cVar4.a).t(gjVar4, null, null, null, tL_document43, str28, null, hashMap2, false, false, str29);
                                                                    return;
                                                                }
                                                                yy f10 = yy.f(tL_document43, null, str28, j3, gjVar, gjVar2, r11, arrayList, null, hashMap2, z11, i15, i10, 0, str29, null, false);
                                                                f10.H = storyItem;
                                                                f10.J = rmVar;
                                                                f10.K = cwVar;
                                                                f10.O = j10;
                                                                f10.L = z13;
                                                                f10.Q = j11;
                                                                f10.R = j12;
                                                                f10.T = ljVar;
                                                                f10.k = i11;
                                                                f10.j = fVar;
                                                                az.C(cVar4.a).r0(f10);
                                                            }
                                                        });
                                                        return i212222222;
                                                    }
                                                } catch (Exception e30) {
                                                    e = e30;
                                                    uri2 = null;
                                                }
                                            } else {
                                                uri2 = null;
                                            }
                                            i16 = 1;
                                            if (bitmap3 != null) {
                                                Bitmap bitmap8 = bitmap3;
                                                TLRPC.PhotoSize Z2 = fc.Z(bitmap8, 132.0f, 132.0f, 55, z16);
                                                if (Z2 != null) {
                                                    tL_document.thumbs.add(Z2);
                                                    tL_document.flags |= i16;
                                                }
                                                bitmap8.recycle();
                                            }
                                            if (tL_document.mime_type.equals("image/webp") && gjVar3 == null) {
                                                options = new BitmapFactory.Options();
                                                options.inJustDecodeBounds = true;
                                                BitmapFactory.decodeFile(str4, options);
                                                i17 = options.outWidth;
                                                if (i17 != 0 && (i18 = options.outHeight) != 0 && i17 <= 800 && i18 <= 800) {
                                                    TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker2 = new TLRPC.TL_documentAttributeSticker();
                                                    str16 = str13;
                                                    tL_documentAttributeSticker2.alt = str16;
                                                    tL_documentAttributeSticker2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                                                    tL_document.attributes.add(tL_documentAttributeSticker2);
                                                    TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize2 = new TLRPC.TL_documentAttributeImageSize();
                                                    tL_documentAttributeImageSize2.w = options.outWidth;
                                                    tL_documentAttributeImageSize2.h = options.outHeight;
                                                    tL_document.attributes.add(tL_documentAttributeImageSize2);
                                                    b02 = fc.b0(null, fc.K(file.getAbsolutePath(), uri2, 400.0f, 400.0f, true), Bitmap.CompressFormat.PNG, 400.0f, 400.0f, 100, z16, 0, 0, false);
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
                                                    int i2022222222 = 0;
                                                    if (numArr != null) {
                                                        Integer num3 = numArr[0];
                                                        String str28 = tL_document.mime_type;
                                                        if (str28 != null && str28.toLowerCase().startsWith("image/webp")) {
                                                            numArr[0] = -1;
                                                            num2 = num3;
                                                            i14 = 1;
                                                            i2022222222 = 0;
                                                            if (!z16 || jArr == null) {
                                                                i15 = i7;
                                                            } else {
                                                                if (numArr == null || num2 == null || num2 == numArr[i2022222222] || fVar != null) {
                                                                    i15 = i7;
                                                                } else {
                                                                    i15 = i7;
                                                                    z(cVar2, jArr[i2022222222], i15);
                                                                    jArr[i2022222222] = Utilities.b.nextLong();
                                                                }
                                                                if (i14 == 0) {
                                                                    hashMap.put("groupId", str16 + jArr[i2022222222]);
                                                                    if (z10) {
                                                                        hashMap.put("final", "1");
                                                                    }
                                                                }
                                                            }
                                                            j15 = j13;
                                                            if (j15 != 0) {
                                                                hashMap.put("groupId", str16 + j15);
                                                            }
                                                            final c cVar322222222 = cVar2;
                                                            final TLRPC.TL_document tL_document322222222 = tL_document;
                                                            final String str2722222222 = str17;
                                                            int i2122222222 = i2022222222;
                                                            g0.g3(new Runnable() { // from class: org.telegram.messenger.rx
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    gj gjVar4 = gj.this;
                                                                    c cVar4 = cVar322222222;
                                                                    TLRPC.TL_document tL_document43 = tL_document322222222;
                                                                    String str282 = str4;
                                                                    HashMap hashMap2 = hashMap;
                                                                    String str29 = str2722222222;
                                                                    if (gjVar4 != null) {
                                                                        az.C(cVar4.a).t(gjVar4, null, null, null, tL_document43, str282, null, hashMap2, false, false, str29);
                                                                        return;
                                                                    }
                                                                    yy f10 = yy.f(tL_document43, null, str282, j3, gjVar, gjVar2, charSequence2, arrayList, null, hashMap2, z11, i15, i10, 0, str29, null, false);
                                                                    f10.H = storyItem;
                                                                    f10.J = rmVar;
                                                                    f10.K = cwVar;
                                                                    f10.O = j10;
                                                                    f10.L = z13;
                                                                    f10.Q = j11;
                                                                    f10.R = j12;
                                                                    f10.T = ljVar;
                                                                    f10.k = i11;
                                                                    f10.j = fVar;
                                                                    az.C(cVar4.a).r0(f10);
                                                                }
                                                            });
                                                            return i2122222222;
                                                        }
                                                        String str29 = tL_document.mime_type;
                                                        if ((str29 == null || !(str29.toLowerCase().startsWith("image/") || tL_document.mime_type.toLowerCase().startsWith("video/mp4"))) && !gj.y(tL_document)) {
                                                            i2022222222 = 0;
                                                            if (tL_documentAttributeAudio2 != null) {
                                                                numArr[0] = 2;
                                                            } else {
                                                                numArr[0] = num;
                                                            }
                                                        } else {
                                                            i2022222222 = 0;
                                                            numArr[0] = 1;
                                                        }
                                                        num2 = num3;
                                                    } else {
                                                        num2 = num;
                                                    }
                                                    i14 = i2022222222;
                                                    if (z16) {
                                                    }
                                                    i15 = i7;
                                                    j15 = j13;
                                                    if (j15 != 0) {
                                                    }
                                                    final c cVar3222222222 = cVar2;
                                                    final TLRPC.TL_document tL_document3222222222 = tL_document;
                                                    final String str27222222222 = str17;
                                                    int i21222222222 = i2022222222;
                                                    g0.g3(new Runnable() { // from class: org.telegram.messenger.rx
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            gj gjVar4 = gj.this;
                                                            c cVar4 = cVar3222222222;
                                                            TLRPC.TL_document tL_document43 = tL_document3222222222;
                                                            String str282 = str4;
                                                            HashMap hashMap2 = hashMap;
                                                            String str292 = str27222222222;
                                                            if (gjVar4 != null) {
                                                                az.C(cVar4.a).t(gjVar4, null, null, null, tL_document43, str282, null, hashMap2, false, false, str292);
                                                                return;
                                                            }
                                                            yy f10 = yy.f(tL_document43, null, str282, j3, gjVar, gjVar2, charSequence2, arrayList, null, hashMap2, z11, i15, i10, 0, str292, null, false);
                                                            f10.H = storyItem;
                                                            f10.J = rmVar;
                                                            f10.K = cwVar;
                                                            f10.O = j10;
                                                            f10.L = z13;
                                                            f10.Q = j11;
                                                            f10.R = j12;
                                                            f10.T = ljVar;
                                                            f10.k = i11;
                                                            f10.j = fVar;
                                                            az.C(cVar4.a).r0(f10);
                                                        }
                                                    });
                                                    return i21222222222;
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
                                        int i20222222222 = 0;
                                        if (numArr != null) {
                                        }
                                        i14 = i20222222222;
                                        if (z16) {
                                        }
                                        i15 = i7;
                                        j15 = j13;
                                        if (j15 != 0) {
                                        }
                                        final c cVar32222222222 = cVar2;
                                        final TLRPC.TL_document tL_document32222222222 = tL_document;
                                        final String str272222222222 = str17;
                                        int i212222222222 = i20222222222;
                                        g0.g3(new Runnable() { // from class: org.telegram.messenger.rx
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                gj gjVar4 = gj.this;
                                                c cVar4 = cVar32222222222;
                                                TLRPC.TL_document tL_document43 = tL_document32222222222;
                                                String str282 = str4;
                                                HashMap hashMap2 = hashMap;
                                                String str292 = str272222222222;
                                                if (gjVar4 != null) {
                                                    az.C(cVar4.a).t(gjVar4, null, null, null, tL_document43, str282, null, hashMap2, false, false, str292);
                                                    return;
                                                }
                                                yy f10 = yy.f(tL_document43, null, str282, j3, gjVar, gjVar2, charSequence2, arrayList, null, hashMap2, z11, i15, i10, 0, str292, null, false);
                                                f10.H = storyItem;
                                                f10.J = rmVar;
                                                f10.K = cwVar;
                                                f10.O = j10;
                                                f10.L = z13;
                                                f10.Q = j11;
                                                f10.R = j12;
                                                f10.T = ljVar;
                                                f10.k = i11;
                                                f10.j = fVar;
                                                az.C(cVar4.a).r0(f10);
                                            }
                                        });
                                        return i212222222222;
                                    }
                                    if (tL_documentAttributeAudio != null) {
                                        StringBuilder n10 = p5.c.n(str26, MediaStreamTrack.AUDIO_TRACK_KIND);
                                        n10.append(file2.length());
                                        sb2 = n10.toString();
                                    } else {
                                        StringBuilder n11 = p5.c.n(str26, "");
                                        n11.append(file2.length());
                                        sb2 = n11.toString();
                                    }
                                    str26 = sb2;
                                }
                                z15 = false;
                                if (fVar == null) {
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
                                int i202222222222 = 0;
                                if (numArr != null) {
                                }
                                i14 = i202222222222;
                                if (z16) {
                                }
                                i15 = i7;
                                j15 = j13;
                                if (j15 != 0) {
                                }
                                final c cVar322222222222 = cVar2;
                                final TLRPC.TL_document tL_document322222222222 = tL_document;
                                final String str2722222222222 = str17;
                                int i2122222222222 = i202222222222;
                                g0.g3(new Runnable() { // from class: org.telegram.messenger.rx
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        gj gjVar4 = gj.this;
                                        c cVar4 = cVar322222222222;
                                        TLRPC.TL_document tL_document43 = tL_document322222222222;
                                        String str282 = str4;
                                        HashMap hashMap2 = hashMap;
                                        String str292 = str2722222222222;
                                        if (gjVar4 != null) {
                                            az.C(cVar4.a).t(gjVar4, null, null, null, tL_document43, str282, null, hashMap2, false, false, str292);
                                            return;
                                        }
                                        yy f10 = yy.f(tL_document43, null, str282, j3, gjVar, gjVar2, charSequence2, arrayList, null, hashMap2, z11, i15, i10, 0, str292, null, false);
                                        f10.H = storyItem;
                                        f10.J = rmVar;
                                        f10.K = cwVar;
                                        f10.O = j10;
                                        f10.L = z13;
                                        f10.Q = j11;
                                        f10.R = j12;
                                        f10.T = ljVar;
                                        f10.k = i11;
                                        f10.j = fVar;
                                        az.C(cVar4.a).r0(f10);
                                    }
                                });
                                return i2122222222222;
                            }
                            obj = "flac";
                            obj2 = "opus";
                            a10 = rf.a.a(file2);
                            if (a10 == null) {
                                long j20 = a10.b;
                                if (j20 != j14) {
                                    String str30 = a10.d;
                                    str7 = lowerCase;
                                    str8 = a10.c;
                                    i13 = (int) (j20 / 1000);
                                    str9 = str30;
                                } else {
                                    str7 = lowerCase;
                                    str8 = null;
                                    i13 = 0;
                                    str9 = null;
                                }
                                bitmap = a10.o;
                            } else {
                                str7 = lowerCase;
                                bitmap = null;
                                str8 = null;
                                i13 = 0;
                                str9 = null;
                            }
                            bitmap2 = bitmap;
                            str10 = str9;
                            str11 = str8;
                            z14 = false;
                            if (i13 != 0) {
                            }
                            if (str26 != null) {
                            }
                            z15 = false;
                            if (fVar == null) {
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
                            int i2022222222222 = 0;
                            if (numArr != null) {
                            }
                            i14 = i2022222222222;
                            if (z16) {
                            }
                            i15 = i7;
                            j15 = j13;
                            if (j15 != 0) {
                            }
                            final c cVar3222222222222 = cVar2;
                            final TLRPC.TL_document tL_document3222222222222 = tL_document;
                            final String str27222222222222 = str17;
                            int i21222222222222 = i2022222222222;
                            g0.g3(new Runnable() { // from class: org.telegram.messenger.rx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    gj gjVar4 = gj.this;
                                    c cVar4 = cVar3222222222222;
                                    TLRPC.TL_document tL_document43 = tL_document3222222222222;
                                    String str282 = str4;
                                    HashMap hashMap2 = hashMap;
                                    String str292 = str27222222222222;
                                    if (gjVar4 != null) {
                                        az.C(cVar4.a).t(gjVar4, null, null, null, tL_document43, str282, null, hashMap2, false, false, str292);
                                        return;
                                    }
                                    yy f10 = yy.f(tL_document43, null, str282, j3, gjVar, gjVar2, charSequence2, arrayList, null, hashMap2, z11, i15, i10, 0, str292, null, false);
                                    f10.H = storyItem;
                                    f10.J = rmVar;
                                    f10.K = cwVar;
                                    f10.O = j10;
                                    f10.L = z13;
                                    f10.Q = j11;
                                    f10.R = j12;
                                    f10.T = ljVar;
                                    f10.k = i11;
                                    f10.j = fVar;
                                    az.C(cVar4.a).r0(f10);
                                }
                            });
                            return i21222222222222;
                        }
                        str5 = str4.substring(lastIndexOf + 1);
                    }
                    str6 = str5;
                    lowerCase = str6.toLowerCase();
                    if (lowerCase.equals("mp3")) {
                    }
                    obj = "flac";
                    obj2 = "opus";
                    a10 = rf.a.a(file2);
                    if (a10 == null) {
                    }
                    bitmap2 = bitmap;
                    str10 = str9;
                    str11 = str8;
                    z14 = false;
                    if (i13 != 0) {
                    }
                    if (str26 != null) {
                    }
                    z15 = false;
                    if (fVar == null) {
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
                    int i20222222222222 = 0;
                    if (numArr != null) {
                    }
                    i14 = i20222222222222;
                    if (z16) {
                    }
                    i15 = i7;
                    j15 = j13;
                    if (j15 != 0) {
                    }
                    final c cVar32222222222222 = cVar2;
                    final TLRPC.TL_document tL_document32222222222222 = tL_document;
                    final String str272222222222222 = str17;
                    int i212222222222222 = i20222222222222;
                    g0.g3(new Runnable() { // from class: org.telegram.messenger.rx
                        @Override // java.lang.Runnable
                        public final void run() {
                            gj gjVar4 = gj.this;
                            c cVar4 = cVar32222222222222;
                            TLRPC.TL_document tL_document43 = tL_document32222222222222;
                            String str282 = str4;
                            HashMap hashMap2 = hashMap;
                            String str292 = str272222222222222;
                            if (gjVar4 != null) {
                                az.C(cVar4.a).t(gjVar4, null, null, null, tL_document43, str282, null, hashMap2, false, false, str292);
                                return;
                            }
                            yy f10 = yy.f(tL_document43, null, str282, j3, gjVar, gjVar2, charSequence2, arrayList, null, hashMap2, z11, i15, i10, 0, str292, null, false);
                            f10.H = storyItem;
                            f10.J = rmVar;
                            f10.K = cwVar;
                            f10.O = j10;
                            f10.L = z13;
                            f10.Q = j11;
                            f10.R = j12;
                            f10.T = ljVar;
                            f10.k = i11;
                            f10.j = fVar;
                            az.C(cVar4.a).r0(f10);
                        }
                    });
                    return i212222222222222;
                }
                return i12;
            }
        }
        return 1;
    }

    public static void V(final int i7, final long j3, final long j10, final long j11, final long j12, final String str, final String str2, final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3, final ArrayList arrayList4, final ArrayList arrayList5, final ArrayList arrayList6, final c cVar, final gj gjVar, final gj gjVar2, final gj gjVar3, final lj ljVar, final cw cwVar, final TL_stories.StoryItem storyItem, final org.telegram.ui.rm rmVar, final org.telegram.ui.Components.qf qfVar, final sh.f fVar, final boolean z10, final boolean z11) {
        if (arrayList == null && arrayList2 == null && arrayList3 == null) {
            return;
        }
        if (arrayList == null || arrayList2 == null || arrayList.size() == arrayList2.size()) {
            Utilities.e.c(new Runnable() { // from class: org.telegram.messenger.kx
                @Override // java.lang.Runnable
                public final void run() {
                    int i10;
                    boolean z12;
                    String str3;
                    long j13;
                    int i11;
                    c cVar2;
                    Uri uri;
                    long j14;
                    lj ljVar2;
                    long j15;
                    int i12;
                    ArrayList arrayList7;
                    boolean z13;
                    long[] jArr = new long[1];
                    Integer[] numArr = new Integer[1];
                    long j16 = j3;
                    boolean C = n5.C(j16);
                    ArrayList arrayList8 = arrayList;
                    String str4 = str;
                    sh.f fVar2 = fVar;
                    c cVar3 = cVar;
                    int i13 = i7;
                    String str5 = str2;
                    gj gjVar4 = gjVar;
                    gj gjVar5 = gjVar2;
                    TL_stories.StoryItem storyItem2 = storyItem;
                    String str6 = str5;
                    org.telegram.ui.rm rmVar2 = rmVar;
                    ArrayList arrayList9 = arrayList4;
                    gj gjVar6 = gjVar3;
                    boolean z14 = z10;
                    org.telegram.ui.Components.qf qfVar2 = qfVar;
                    cw cwVar2 = cwVar;
                    org.telegram.ui.Components.qf qfVar3 = qfVar2;
                    int i14 = i13;
                    long j17 = j10;
                    boolean z15 = z11;
                    String str7 = str4;
                    long j18 = j17;
                    long j19 = j11;
                    long j20 = j12;
                    lj ljVar3 = ljVar;
                    if (arrayList8 != null) {
                        int size = arrayList8.size();
                        int i15 = 0;
                        i10 = 0;
                        int i16 = 0;
                        z12 = true;
                        while (i15 < size) {
                            org.telegram.ui.Components.qf qfVar4 = qfVar3;
                            String str8 = i15 == 0 ? str7 : null;
                            boolean z16 = z15;
                            if (C || size <= 1 || i16 % 10 != 0 || fVar2 != null) {
                                ljVar2 = ljVar3;
                                j15 = j16;
                                i12 = i14;
                            } else {
                                ljVar2 = ljVar3;
                                j15 = j16;
                                long j21 = jArr[0];
                                if (j21 != 0) {
                                    i12 = i14;
                                    az.z(cVar3, j21, i12);
                                } else {
                                    i12 = i14;
                                }
                                jArr[0] = Utilities.b.nextLong();
                                i16 = 0;
                            }
                            int i17 = i16 + 1;
                            long j22 = jArr[0];
                            if ((fVar2 == null && i17 == 10) || i15 == size - 1) {
                                arrayList7 = arrayList9;
                                z13 = true;
                            } else {
                                arrayList7 = arrayList9;
                                z13 = false;
                            }
                            String str9 = (String) arrayList8.get(i15);
                            lj ljVar4 = ljVar2;
                            String str10 = (String) arrayList2.get(i15);
                            int i18 = i17;
                            String str11 = str6;
                            ArrayList arrayList10 = i15 == 0 ? arrayList7 : null;
                            String str12 = str7;
                            boolean z17 = qfVar4 == null;
                            long j23 = j18;
                            if (!z12) {
                                j18 = 0;
                            }
                            ArrayList arrayList11 = arrayList5;
                            int i19 = i15;
                            int i20 = size;
                            long j24 = j15;
                            ArrayList arrayList12 = arrayList8;
                            ArrayList arrayList13 = arrayList7;
                            int i21 = i12;
                            j16 = j24;
                            i10 = az.U(cVar3, str9, str10, null, str11, j16, gjVar4, gjVar5, storyItem2, rmVar2, arrayList10, gjVar6, jArr, z13, str8, z14, i21, 0, numArr, z17, cwVar2, j18, z16, j19, j20, ljVar4, fVar2, arrayList11 != null ? ((Integer) arrayList11.get(i15)).intValue() : -1);
                            c cVar4 = cVar3;
                            long j25 = jArr[0];
                            if (j22 != j25 || j25 == -1) {
                                i18 = 1;
                            }
                            if (i10 != 0 && z13 && fVar2 == null && j25 != 0) {
                                az.z(cVar4, j25, i21);
                                jArr[0] = 0;
                                i18 = 0;
                            }
                            int i22 = i19 + 1;
                            i14 = i21;
                            cVar3 = cVar4;
                            str6 = str11;
                            ljVar3 = ljVar4;
                            z12 = false;
                            arrayList8 = arrayList12;
                            arrayList9 = arrayList13;
                            str7 = str12;
                            j18 = j23;
                            qfVar3 = qfVar4;
                            i15 = i22;
                            z15 = z16;
                            size = i20;
                            i16 = i18;
                        }
                    } else {
                        i10 = 0;
                        z12 = true;
                    }
                    boolean z18 = z15;
                    c cVar5 = cVar3;
                    ArrayList arrayList14 = arrayList8;
                    lj ljVar5 = ljVar3;
                    String str13 = str6;
                    ArrayList arrayList15 = arrayList9;
                    org.telegram.ui.Components.qf qfVar5 = qfVar3;
                    int i23 = i14;
                    String str14 = str7;
                    long j26 = j18;
                    ArrayList arrayList16 = arrayList3;
                    if (arrayList16 != null) {
                        jArr[0] = 0;
                        int size2 = arrayList16.size();
                        boolean z19 = z18;
                        int i24 = 0;
                        int i25 = 0;
                        while (i24 < arrayList16.size()) {
                            String str15 = (i24 == 0 && (arrayList14 == null || arrayList14.size() == 0)) ? str14 : null;
                            ArrayList arrayList17 = (i24 == 0 && (arrayList14 == null || arrayList14.size() == 0)) ? arrayList15 : null;
                            if (C || size2 <= 1 || i25 % 10 != 0 || fVar2 != null) {
                                str3 = str13;
                                j13 = j16;
                            } else {
                                str3 = str13;
                                j13 = j16;
                                long j27 = jArr[0];
                                if (j27 != 0) {
                                    az.z(cVar5, j27, i23);
                                }
                                jArr[0] = Utilities.b.nextLong();
                                i25 = 0;
                            }
                            int i26 = i25 + 1;
                            long j28 = jArr[0];
                            boolean z20 = (fVar2 == null && i26 == 10) || i24 == size2 + (-1);
                            Uri uri2 = (Uri) arrayList16.get(i24);
                            boolean z21 = qfVar5 == null;
                            if (z12) {
                                i11 = size2;
                                cVar2 = cVar5;
                                uri = uri2;
                                j16 = j13;
                                j14 = j26;
                            } else {
                                i11 = size2;
                                cVar2 = cVar5;
                                uri = uri2;
                                j16 = j13;
                                j14 = 0;
                            }
                            ArrayList arrayList18 = arrayList16;
                            ArrayList arrayList19 = arrayList6;
                            int intValue = arrayList19 != null ? ((Integer) arrayList19.get(i24)).intValue() : -1;
                            int i27 = i24;
                            int i28 = i23;
                            int i29 = i26;
                            str13 = str3;
                            boolean z22 = z19;
                            int i30 = i11;
                            i10 = az.U(cVar2, null, null, uri, str13, j16, gjVar4, gjVar5, storyItem2, rmVar2, arrayList17, gjVar6, jArr, z20, str15, z14, i28, 0, numArr, z21, cwVar2, j14, z22, j19, j20, ljVar5, fVar2, intValue);
                            i23 = i28;
                            long j29 = jArr[0];
                            if (j28 != j29 || j29 == -1) {
                                i29 = 1;
                            }
                            if (i10 == 0 || !z20 || fVar2 != null || j29 == 0) {
                                i25 = i29;
                            } else {
                                az.z(cVar2, j29, i23);
                                jArr[0] = 0;
                                i25 = 0;
                            }
                            i24 = i27 + 1;
                            cVar5 = cVar2;
                            z19 = z22;
                            z12 = false;
                            size2 = i30;
                            arrayList16 = arrayList18;
                        }
                    }
                    c cVar6 = cVar5;
                    int i31 = i10;
                    if (qfVar5 != null) {
                        ((t0.h) qfVar5.b).i();
                    }
                    if (i31 != 0) {
                        g0.g3(new x0(i31, cVar6, 13));
                    }
                }
            });
        }
    }

    public static void W(c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, CharSequence charSequence, String str, long j3, gj gjVar, gj gjVar2, boolean z10, int i7) {
        c cVar2;
        CharSequence charSequence2;
        ArrayList arrayList4;
        if (charSequence != null) {
            CharSequence[] charSequenceArr = {charSequence};
            cVar2 = cVar;
            ArrayList Y = si.d0(cVar2.a).Y(charSequenceArr, true, true);
            charSequence2 = charSequenceArr[0];
            arrayList4 = Y;
        } else {
            cVar2 = cVar;
            charSequence2 = charSequence;
            arrayList4 = null;
        }
        V(i7, j3, 0L, 0L, 0L, charSequence2 != null ? charSequence2.toString() : null, str, arrayList, arrayList2, arrayList3, arrayList4, null, null, cVar2, gjVar, gjVar2, null, null, null, null, null, null, null, z10, false);
    }

    public static void X(final c cVar, final ArrayList arrayList, final long j3, final gj gjVar, final gj gjVar2, final TL_stories.StoryItem storyItem, final org.telegram.ui.rm rmVar, final boolean z10, boolean z11, final gj gjVar3, final TLRPC.TL_inputPollAnswer tL_inputPollAnswer, final boolean z12, final int i7, final int i10, final boolean z13, final org.telegram.ui.Components.qf qfVar, final cw cwVar, final long j10, final boolean z14, final long j11, final long j12, final lj ljVar, final sh.f fVar, final boolean z15) {
        final boolean z16;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                z16 = z11;
                break;
            } else {
                if (((zy) arrayList.get(i11)).h > 0) {
                    z16 = false;
                    break;
                }
                i11++;
            }
        }
        final long j13 = fVar != null ? fVar.c : 0L;
        final boolean z17 = j13 != 0;
        J.c(new Runnable() { // from class: org.telegram.messenger.lw
            @Override // java.lang.Runnable
            public final void run() {
                az.K(arrayList, j3, z10, z16, z17, cVar, j13, gjVar3, tL_inputPollAnswer, gjVar, gjVar2, z12, i7, i10, storyItem, rmVar, cwVar, j10, z14, j11, j12, ljVar, fVar, z15, qfVar, z13);
            }
        });
    }

    public static void Y(c cVar, Uri uri, long j3, gj gjVar, gj gjVar2, org.telegram.ui.Components.qf qfVar, gj gjVar3, boolean z10, int i7, cw cwVar) {
        Z(cVar, null, null, uri, j3, gjVar, gjVar2, null, null, null, qfVar, 0, gjVar3, null, z10, i7, false, null, cwVar, 0L, 0L, 0L, null);
    }

    public static void Z(c cVar, String str, String str2, Uri uri, long j3, gj gjVar, gj gjVar2, org.telegram.ui.rm rmVar, ArrayList arrayList, ArrayList arrayList2, org.telegram.ui.Components.qf qfVar, int i7, gj gjVar3, f20 f20Var, boolean z10, int i10, boolean z11, CharSequence charSequence, cw cwVar, long j10, long j11, long j12, lj ljVar) {
        zy zyVar = new zy();
        zyVar.c = str;
        zyVar.e = str2;
        zyVar.a = uri;
        if (charSequence != null) {
            zyVar.d = charSequence.toString();
        }
        zyVar.i = arrayList;
        zyVar.h = i7;
        if (arrayList2 != null) {
            zyVar.j = new ArrayList(arrayList2);
        }
        zyVar.k = f20Var;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(zyVar);
        X(cVar, arrayList3, j3, gjVar, gjVar2, null, rmVar, z11, false, gjVar3, null, z10, i10, 0, false, qfVar, cwVar, j10, false, j11, j12, ljVar, null, false);
    }

    public static void a0(c cVar, CharSequence charSequence, long j3, long j10, boolean z10, int i7, int i10) {
        ur.a0(cVar.a).a.c(new hw(charSequence, cVar, j10, j3, z10, i7, i10, 1));
    }

    public static void b0(final int i7, final int i10, final int i11, final long j3, final long j10, final long j11, final long j12, final CharSequence charSequence, final String str, final String str2, final ArrayList arrayList, final c cVar, final gj gjVar, final gj gjVar2, final gj gjVar3, final lj ljVar, final cw cwVar, final f20 f20Var, final TLRPC.Photo photo, final TL_stories.StoryItem storyItem, final org.telegram.ui.rm rmVar, final boolean z10, final boolean z11, final boolean z12) {
        if (str == null || str.length() == 0) {
            return;
        }
        new Thread(new Runnable() { // from class: org.telegram.messenger.jy
            /* JADX WARN: Removed duplicated region for block: B:100:0x0491  */
            /* JADX WARN: Removed duplicated region for block: B:103:0x049b  */
            /* JADX WARN: Removed duplicated region for block: B:105:0x04a2  */
            /* JADX WARN: Removed duplicated region for block: B:138:0x0354  */
            /* JADX WARN: Removed duplicated region for block: B:162:0x0433  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x019b  */
            /* JADX WARN: Removed duplicated region for block: B:91:0x0450  */
            /* JADX WARN: Removed duplicated region for block: B:95:0x045b  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                gj gjVar4;
                String str3;
                final int i12;
                final String str4;
                long j13;
                final f20 f20Var2;
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
                TLRPC.PhotoSize q10;
                String str8;
                TLRPC.Photo photo2;
                File file;
                String str9;
                TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
                int i13;
                int i14;
                f20 f20Var3 = f20Var;
                String str10 = str;
                if (f20Var3 == null) {
                    f20Var3 = az.n(0L, str10);
                }
                f20 f20Var4 = f20Var3;
                long j14 = j3;
                boolean C = n5.C(j14);
                boolean z15 = f20Var4 != null && f20Var4.s;
                c cVar4 = cVar;
                CharSequence charSequence2 = charSequence;
                final gj gjVar5 = gjVar3;
                final gj gjVar6 = gjVar;
                gj gjVar7 = gjVar2;
                boolean z16 = z15;
                final ArrayList arrayList2 = arrayList;
                long j15 = 0;
                final boolean z17 = z10;
                final int i15 = i10;
                final int i16 = i11;
                final TL_stories.StoryItem storyItem2 = storyItem;
                final org.telegram.ui.rm rmVar2 = rmVar;
                final cw cwVar2 = cwVar;
                final long j16 = j11;
                final long j17 = j12;
                final lj ljVar2 = ljVar;
                if (f20Var4 == null && !str10.endsWith("mp4") && !z16) {
                    az.U(cVar4, str10, str10, null, null, j14, gjVar6, gjVar7, storyItem2, rmVar2, arrayList2, gjVar5, null, false, charSequence2, z17, i15, i16, null, z11, cwVar2, 0L, false, j16, j17, ljVar2, null, -1);
                    return;
                }
                File file2 = new File(str10);
                StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str10);
                m10.append(file2.length());
                m10.append("_");
                m10.append(file2.lastModified());
                String sb2 = m10.toString();
                if (f20Var4 != null) {
                    if (!z16) {
                        StringBuilder m11 = com.google.android.gms.internal.vision.e2.m(sb2);
                        m11.append(f20Var4.r);
                        m11.append("_");
                        m11.append(f20Var4.a);
                        m11.append("_");
                        m11.append(f20Var4.b);
                        m11.append(f20Var4.t ? "_m" : "");
                        sb2 = m11.toString();
                        if (f20Var4.k != f20Var4.h) {
                            StringBuilder n10 = p5.c.n(sb2, "_");
                            n10.append(f20Var4.k);
                            sb2 = n10.toString();
                        }
                    }
                    long j18 = f20Var4.a;
                    if (j18 >= 0) {
                        j15 = j18;
                    }
                }
                long j19 = j15;
                int i17 = i7;
                if (!C && i17 == 0 && (f20Var4 == null || (f20Var4.A == null && f20Var4.B == null && f20Var4.G == null && f20Var4.H == null))) {
                    Object[] g02 = ur.a0(cVar4.a).g0(!C ? 2 : 5, sb2);
                    if (g02 != null) {
                        Object obj = g02[0];
                        gjVar4 = gjVar7;
                        if (obj instanceof TLRPC.TL_document) {
                            TLRPC.TL_document tL_document3 = (TLRPC.TL_document) obj;
                            String str11 = (String) g02[1];
                            str3 = sb2;
                            str4 = "";
                            i12 = i17;
                            f20Var2 = f20Var4;
                            z13 = z16;
                            j13 = j14;
                            az.w(cVar4, C, tL_document3, str10, null, j19, false);
                            cVar2 = cVar4;
                            z14 = C;
                            str10 = str10;
                            tL_document = tL_document3;
                            str5 = str11;
                            if (tL_document == null) {
                                Bitmap bitmap2 = (f20Var2 == null || !f20Var2.P) ? null : f20Var2.O;
                                if (bitmap2 == null) {
                                    bitmap2 = az.s(str10, j19, null, false);
                                }
                                if (bitmap2 == null) {
                                    bitmap2 = az.r(1, str10);
                                }
                                int i18 = (z14 || i12 != 0) ? 90 : 320;
                                float f10 = i18;
                                TLRPC.PhotoSize Z = fc.Z(bitmap2, f10, f10, i18 > 90 ? 80 : 55, z14);
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
                                    str9 = String.format(a8.p0.n(Z.location.local_id, "@%d_%d_b2", sb3), Integer.valueOf((int) (g0.u / g0.p)), Integer.valueOf((int) (g0.u / g0.p)));
                                    bitmap2 = createScaledBitmap;
                                    file = file2;
                                } else {
                                    Utilities.blurBitmap(bitmap2, 3);
                                    StringBuilder sb4 = new StringBuilder();
                                    file = file2;
                                    sb4.append(Z.location.volume_id);
                                    sb4.append("_");
                                    str9 = String.format(a8.p0.n(Z.location.local_id, "@%d_%d_b", sb4), Integer.valueOf((int) (g0.u / g0.p)), Integer.valueOf((int) (g0.u / g0.p)));
                                }
                                TLRPC.TL_document tL_document4 = new TLRPC.TL_document();
                                if (Z != null) {
                                    tL_document4.thumbs.add(Z);
                                    tL_document4.flags |= 1;
                                }
                                tL_document4.file_reference = new byte[0];
                                tL_document4.mime_type = "video/mp4";
                                k10.i(cVar2.a).v(false);
                                if (!z14) {
                                    tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                                    tL_documentAttributeVideo.supports_streaming = true;
                                } else if (np.u1(cVar2.a).c1(Integer.valueOf((int) (j13 & 4294967295L))) == null) {
                                    return;
                                } else {
                                    tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo_layer159();
                                }
                                tL_documentAttributeVideo.round_message = z13;
                                tL_document4.attributes.add(tL_documentAttributeVideo);
                                if (f20Var2 != null && f20Var2.P) {
                                    tL_documentAttributeVideo.w = f20Var2.k;
                                    tL_documentAttributeVideo.h = f20Var2.l;
                                    tL_documentAttributeVideo.duration = f20Var2.r / 1000.0d;
                                    tL_document4.size = f20Var2.q;
                                } else if (f20Var2 == null || !f20Var2.c()) {
                                    if (file.exists()) {
                                        tL_document4.size = (int) file.length();
                                    }
                                    az.x(str10, tL_documentAttributeVideo, null);
                                } else {
                                    if (f20Var2.t) {
                                        tL_document4.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                        az.x(str10, tL_documentAttributeVideo, f20Var2);
                                        f20Var2.h = tL_documentAttributeVideo.w;
                                        f20Var2.i = tL_documentAttributeVideo.h;
                                    } else {
                                        tL_documentAttributeVideo.duration = f20Var2.r / 1000.0d;
                                    }
                                    int i19 = f20Var2.g;
                                    xe xeVar = f20Var2.H;
                                    if (xeVar != null) {
                                        i13 = xeVar.i;
                                        i14 = xeVar.j;
                                    } else {
                                        i13 = f20Var2.k;
                                        i14 = f20Var2.l;
                                    }
                                    if (i19 == 90 || i19 == 270) {
                                        tL_documentAttributeVideo.w = i14;
                                        tL_documentAttributeVideo.h = i13;
                                    } else {
                                        tL_documentAttributeVideo.w = i13;
                                        tL_documentAttributeVideo.h = i14;
                                    }
                                    tL_document4.size = f20Var2.q;
                                }
                                str6 = str9;
                                cVar3 = cVar2;
                                tL_document2 = tL_document4;
                                bitmap = bitmap2;
                            } else {
                                if (tL_document.thumbs.isEmpty()) {
                                    Bitmap bitmap3 = (f20Var2 == null || !f20Var2.P) ? null : f20Var2.O;
                                    cVar3 = cVar2;
                                    Bitmap bitmap4 = null;
                                    if (bitmap3 == null) {
                                        bitmap3 = az.s(str10, j19, null, false);
                                    }
                                    Bitmap r10 = bitmap3 == null ? az.r(1, str10) : bitmap3;
                                    int i20 = (z14 || i12 != 0) ? 90 : 320;
                                    float f11 = i20;
                                    TLRPC.PhotoSize Z2 = fc.Z(r10, f11, f11, i20 > 90 ? 80 : 55, z14);
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
                                            str7 = String.format(a8.p0.n(Z2.location.local_id, "@%d_%d_b2", sb5), Integer.valueOf((int) (g0.u / g0.p)), Integer.valueOf((int) (g0.u / g0.p)));
                                        } else {
                                            Utilities.blurBitmap(r10, 3);
                                            StringBuilder sb6 = new StringBuilder();
                                            sb6.append(Z2.location.volume_id);
                                            sb6.append("_");
                                            str7 = String.format(a8.p0.n(Z2.location.local_id, "@%d_%d_b", sb6), Integer.valueOf((int) (g0.u / g0.p)), Integer.valueOf((int) (g0.u / g0.p)));
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
                            q10 = fc.q(str2);
                            if (q10 == null && (photo2 = photo) != null) {
                                q10 = new cc(photo2);
                            }
                            if (f20Var2 != null && f20Var2.c()) {
                                File file3 = new File(w7.z(4), "-2147483648_" + cz.p() + ".mp4");
                                cz.y();
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
                            final long j20 = j10;
                            final long j21 = j13;
                            final gj gjVar8 = gjVar4;
                            final String str13 = str5;
                            final TLRPC.PhotoSize photoSize = q10;
                            final c cVar5 = cVar3;
                            g0.g3(new Runnable() { // from class: org.telegram.messenger.yx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String str14;
                                    Bitmap bitmap5 = bitmap;
                                    if (bitmap5 != null && (str14 = str6) != null) {
                                        fc.D().O(new BitmapDrawable(bitmap5), str14, false);
                                    }
                                    gj gjVar9 = gjVar5;
                                    c cVar6 = cVar5;
                                    f20 f20Var5 = f20Var2;
                                    TLRPC.TL_document tL_document5 = tL_document2;
                                    String str15 = str12;
                                    TLRPC.PhotoSize photoSize2 = photoSize;
                                    HashMap hashMap2 = hashMap;
                                    boolean z19 = z18;
                                    String str16 = str13;
                                    if (gjVar9 != null) {
                                        az.C(cVar6.a).t(gjVar9, null, null, f20Var5, tL_document5, str15, photoSize2, hashMap2, false, z19, str16);
                                        return;
                                    }
                                    yy e10 = yy.e(tL_document5, f20Var5, str15, j21, gjVar6, gjVar8, str4, arrayList2, hashMap2, z17, i15, i16, i12, str16, z19);
                                    e10.H = storyItem2;
                                    e10.J = rmVar2;
                                    e10.K = cwVar2;
                                    e10.O = j20;
                                    e10.o = photoSize2;
                                    e10.Q = j16;
                                    e10.R = j17;
                                    e10.T = ljVar2;
                                    e10.L = false;
                                    az.C(cVar6.a).r0(e10);
                                }
                            });
                        }
                        cVar2 = cVar4;
                        str3 = sb2;
                        z14 = C;
                        str4 = "";
                        i12 = i17;
                        f20Var2 = f20Var4;
                        z13 = z16;
                        j13 = j14;
                        str5 = null;
                        tL_document = null;
                        if (tL_document == null) {
                        }
                        q10 = fc.q(str2);
                        if (q10 == null) {
                            q10 = new cc(photo2);
                        }
                        if (f20Var2 != null) {
                            File file32 = new File(w7.z(4), "-2147483648_" + cz.p() + ".mp4");
                            cz.y();
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
                        final long j202 = j10;
                        final long j212 = j13;
                        final gj gjVar82 = gjVar4;
                        final String str132 = str5;
                        final TLRPC.PhotoSize photoSize2 = q10;
                        final c cVar52 = cVar3;
                        g0.g3(new Runnable() { // from class: org.telegram.messenger.yx
                            @Override // java.lang.Runnable
                            public final void run() {
                                String str14;
                                Bitmap bitmap5 = bitmap;
                                if (bitmap5 != null && (str14 = str6) != null) {
                                    fc.D().O(new BitmapDrawable(bitmap5), str14, false);
                                }
                                gj gjVar9 = gjVar5;
                                c cVar6 = cVar52;
                                f20 f20Var5 = f20Var2;
                                TLRPC.TL_document tL_document5 = tL_document2;
                                String str15 = str122;
                                TLRPC.PhotoSize photoSize22 = photoSize2;
                                HashMap hashMap22 = hashMap2;
                                boolean z19 = z182;
                                String str16 = str132;
                                if (gjVar9 != null) {
                                    az.C(cVar6.a).t(gjVar9, null, null, f20Var5, tL_document5, str15, photoSize22, hashMap22, false, z19, str16);
                                    return;
                                }
                                yy e10 = yy.e(tL_document5, f20Var5, str15, j212, gjVar6, gjVar82, str4, arrayList2, hashMap22, z17, i15, i16, i12, str16, z19);
                                e10.H = storyItem2;
                                e10.J = rmVar2;
                                e10.K = cwVar2;
                                e10.O = j202;
                                e10.o = photoSize22;
                                e10.Q = j16;
                                e10.R = j17;
                                e10.T = ljVar2;
                                e10.L = false;
                                az.C(cVar6.a).r0(e10);
                            }
                        });
                    }
                }
                gjVar4 = gjVar7;
                cVar2 = cVar4;
                str3 = sb2;
                z14 = C;
                str4 = "";
                i12 = i17;
                f20Var2 = f20Var4;
                z13 = z16;
                j13 = j14;
                str5 = null;
                tL_document = null;
                if (tL_document == null) {
                }
                q10 = fc.q(str2);
                if (q10 == null) {
                }
                if (f20Var2 != null) {
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
                final long j2022 = j10;
                final long j2122 = j13;
                final gj gjVar822 = gjVar4;
                final String str1322 = str5;
                final TLRPC.PhotoSize photoSize22 = q10;
                final c cVar522 = cVar3;
                g0.g3(new Runnable() { // from class: org.telegram.messenger.yx
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str14;
                        Bitmap bitmap5 = bitmap;
                        if (bitmap5 != null && (str14 = str6) != null) {
                            fc.D().O(new BitmapDrawable(bitmap5), str14, false);
                        }
                        gj gjVar9 = gjVar5;
                        c cVar6 = cVar522;
                        f20 f20Var5 = f20Var2;
                        TLRPC.TL_document tL_document5 = tL_document2;
                        String str15 = str1222;
                        TLRPC.PhotoSize photoSize222 = photoSize22;
                        HashMap hashMap222 = hashMap22;
                        boolean z19 = z1822;
                        String str16 = str1322;
                        if (gjVar9 != null) {
                            az.C(cVar6.a).t(gjVar9, null, null, f20Var5, tL_document5, str15, photoSize222, hashMap222, false, z19, str16);
                            return;
                        }
                        yy e10 = yy.e(tL_document5, f20Var5, str15, j2122, gjVar6, gjVar822, str4, arrayList2, hashMap222, z17, i15, i16, i12, str16, z19);
                        e10.H = storyItem2;
                        e10.J = rmVar2;
                        e10.K = cwVar2;
                        e10.O = j2022;
                        e10.o = photoSize222;
                        e10.Q = j16;
                        e10.R = j17;
                        e10.T = ljVar2;
                        e10.L = false;
                        az.C(cVar6.a).r0(e10);
                    }
                });
            }
        }).start();
    }

    public static boolean h(CharSequence charSequence) {
        if (charSequence instanceof Spannable) {
            for (org.telegram.ui.Components.y5 y5Var : (org.telegram.ui.Components.y5[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.y5.class)) {
                if (y5Var.fromEmojiKeyboard) {
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
            int i7 = 0;
            while (i7 < size) {
                TL_iv.RichText richText3 = arrayList.get(i7);
                i7++;
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
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) arrayList.get(i7);
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

    public static void m(long j3, long j10, File file, File file2) {
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            FileChannel channel2 = new FileOutputStream(file2).getChannel();
            try {
                channel.position(j3);
                ByteBuffer allocate = ByteBuffer.allocate(262144);
                while (j10 > 0) {
                    allocate.clear();
                    allocate.limit((int) Math.min(allocate.capacity(), j10));
                    int read = channel.read(allocate);
                    if (read <= 0) {
                        break;
                    }
                    allocate.flip();
                    channel2.write(allocate);
                    j10 -= read;
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
            for (int i7 = 0; i7 < richMessage.blocks.size(); i7++) {
                tL_inputRichMessage.blocks.add(y0(richMessage.blocks.get(i7)));
            }
            ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                tL_inputRichMessage.flags |= 4;
                ArrayList<TLRPC.Photo> arrayList3 = richMessage.photos;
                int size = arrayList3.size();
                int i10 = 0;
                while (i10 < size) {
                    TLRPC.Photo photo = arrayList3.get(i10);
                    i10++;
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
                int i11 = 0;
                while (i11 < size2) {
                    TLRPC.Document document = arrayList5.get(i11);
                    i11++;
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

    public static f20 n(long j3, String str) {
        int[] iArr = new int[11];
        AnimatedFileNative.d(str, iArr, j3);
        if (iArr[0] == 0) {
            if (!s2.a) {
                return null;
            }
            a8.b("video hasn't avc1 atom");
            return null;
        }
        long length = new File(str).length();
        int E = MediaController.E(str);
        if (E == -1) {
            E = iArr[3];
        }
        float f10 = iArr[4];
        long j10 = iArr[5];
        int i7 = iArr[7];
        f20 f20Var = new f20();
        f20Var.a = -1L;
        f20Var.b = -1L;
        f20Var.m = E;
        f20Var.o = str;
        f20Var.p = j3;
        f20Var.n = i7;
        f20Var.r = (long) Math.ceil(f10);
        boolean z10 = true;
        int i10 = iArr[1];
        f20Var.h = i10;
        f20Var.k = i10;
        int i11 = iArr[2];
        f20Var.i = i11;
        f20Var.l = i11;
        f20Var.g = iArr[8];
        f20Var.v = (long) (f10 * 1000.0f);
        float max = Math.max(i10, i11);
        float f11 = 1280.0f;
        int i12 = max > 1280.0f ? 4 : max > 854.0f ? 3 : max > 640.0f ? 2 : 1;
        a6 q10 = a6.q(k10.t0);
        int e10 = t0.e();
        int round = Math.round((e10 == 1 ? q10.p().h : e10 == 2 ? q10.o().h : q10.n().h) / (100.0f / i12));
        if (round > i12) {
            round = i12;
        }
        if (new File(str).length() < 1048576000) {
            if (round != i12 || Math.max(f20Var.h, f20Var.i) > 1280) {
                if (round == 1) {
                    f11 = 432.0f;
                } else if (round == 2) {
                    f11 = 640.0f;
                } else if (round == 3) {
                    f11 = 848.0f;
                }
                int i13 = f20Var.h;
                int i14 = f20Var.i;
                float f12 = f11 / (i13 > i14 ? i13 : i14);
                f20Var.k = Math.round((i13 * f12) / 2.0f) * 2;
                f20Var.l = Math.round((f20Var.i * f12) / 2.0f) * 2;
            } else {
                z10 = false;
            }
            E = MediaController.Q(f20Var.i, f20Var.h, E, f20Var.l, f20Var.k);
        } else {
            z10 = false;
        }
        if (z10) {
            f20Var.m = E;
            f20Var.q = (long) a8.p0.f(f10 / 1000.0f, MediaController.v(f20Var.k, f20Var.l, E, false), 8.0f, j10);
        } else {
            f20Var.k = f20Var.h;
            f20Var.l = f20Var.i;
            f20Var.m = E;
            f20Var.q = length;
        }
        if (f20Var.q == 0) {
            f20Var.q = 1L;
        }
        return f20Var;
    }

    public static Bitmap r(int i7, String str) {
        float f10 = i7 == 2 ? 1920.0f : i7 == 3 ? 96.0f : 512.0f;
        Bitmap s5 = s(str, 0L, null, false);
        if (s5 != null) {
            int width = s5.getWidth();
            int height = s5.getHeight();
            float f11 = width;
            if (f11 > f10 || height > f10) {
                float max = Math.max(width, height) / f10;
                return Bitmap.createScaledBitmap(s5, (int) (f11 / max), (int) (height / max), true);
            }
        }
        return s5;
    }

    public static Bitmap s(String str, long j3, int[] iArr, boolean z10) {
        if (z10) {
            org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(new File(str), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
            Bitmap q10 = c6Var.q(j3, z10);
            if (iArr != null) {
                iArr[0] = c6Var.d[2];
            }
            c6Var.u();
            return q10 == null ? s(str, j3, iArr, false) : q10;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        Bitmap bitmap = null;
        try {
            mediaMetadataRetriever.setDataSource(str);
            bitmap = mediaMetadataRetriever.getFrameAtTime(j3, 1);
            if (bitmap == null) {
                bitmap = mediaMetadataRetriever.getFrameAtTime(j3, 3);
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

    public static void w(c cVar, boolean z10, TLObject tLObject, String str, Uri uri, long j3, boolean z11) {
        boolean z12;
        TLRPC.PhotoSize b02;
        TLRPC.PhotoSize b03;
        if (tLObject instanceof TLRPC.TL_photo) {
            TLRPC.TL_photo tL_photo = (TLRPC.TL_photo) tLObject;
            TLRPC.PhotoSize w10 = w7.w(tL_photo.sizes, 90, false, null, false);
            if ((w10 instanceof TLRPC.TL_photoStrippedSize) || (w10 instanceof TLRPC.TL_photoPathSize)) {
                z12 = true;
            } else {
                w7.G(cVar.a);
                z12 = w7.J(w10, null, true, true).exists();
            }
            TLRPC.PhotoSize w11 = w7.w(tL_photo.sizes, g0.Z0(z11), false, null, false);
            w7.G(cVar.a);
            boolean exists = w7.J(w11, null, false, true).exists();
            if (z12 && exists) {
                return;
            }
            Bitmap K2 = fc.K(str, uri, g0.Z0(false), g0.Z0(false), true);
            if (K2 == null) {
                K2 = fc.K(str, uri, 800.0f, 800.0f, true);
            }
            Bitmap bitmap = K2;
            if (!exists && (b03 = fc.b0(w11, bitmap, Bitmap.CompressFormat.JPEG, g0.Z0(false), g0.Z0(false), 80, false, 101, 101, false)) != w11) {
                tL_photo.sizes.add(0, b03);
            }
            if (!z12 && (b02 = fc.b0(w10, bitmap, Bitmap.CompressFormat.JPEG, 90.0f, 90.0f, 55, true, 0, 0, false)) != w10) {
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
            if ((gj.K4(tL_document) || gj.M3(tL_document)) && gj.W2(tL_document)) {
                ArrayList<TLRPC.PhotoSize> arrayList = tL_document.thumbs;
                int i7 = ls.r5;
                TLRPC.PhotoSize w12 = w7.w(arrayList, ls.r5, false, null, false);
                if ((w12 instanceof TLRPC.TL_photoStrippedSize) || (w12 instanceof TLRPC.TL_photoPathSize)) {
                    return;
                }
                w7.G(cVar.a);
                if (w7.J(w12, null, true, true).exists()) {
                    return;
                }
                Bitmap s5 = s(str, j3, null, false);
                if (s5 == null) {
                    s5 = r(1, str);
                }
                Bitmap bitmap2 = s5;
                if (z10) {
                    i7 = 90;
                }
                ArrayList<TLRPC.PhotoSize> arrayList2 = tL_document.thumbs;
                float f10 = i7;
                int i10 = i7 > 90 ? 80 : 55;
                ThreadLocal threadLocal = fc.I;
                arrayList2.set(0, fc.b0(w12, bitmap2, Bitmap.CompressFormat.JPEG, f10, f10, i10, false, 0, 0, true));
            }
        }
    }

    public static void x(String str, TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo, f20 f20Var) {
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        try {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
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
            if (extractMetadata3 != null) {
                int intValue = Utilities.z(extractMetadata3).intValue();
                if (f20Var == null && (intValue == 90 || intValue == 270)) {
                    int i7 = tL_documentAttributeVideo.w;
                    tL_documentAttributeVideo.w = tL_documentAttributeVideo.h;
                    tL_documentAttributeVideo.h = i7;
                }
            }
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        } catch (Exception e12) {
            e = e12;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            a8.g(e, true);
            if (mediaMetadataRetriever2 != null) {
                try {
                    mediaMetadataRetriever2.release();
                } catch (Exception e13) {
                    a8.g(e13, true);
                }
            }
            try {
                MediaPlayer create = MediaPlayer.create(t0.b, Uri.fromFile(new File(str)));
                if (create != null) {
                    tL_documentAttributeVideo.duration = create.getDuration() / 1000.0d;
                    tL_documentAttributeVideo.w = create.getVideoWidth();
                    tL_documentAttributeVideo.h = create.getVideoHeight();
                    create.release();
                }
            } catch (Exception e14) {
                a8.g(e14, true);
            }
        } catch (Throwable th3) {
            th = th3;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            if (mediaMetadataRetriever2 != null) {
                try {
                    mediaMetadataRetriever2.release();
                } catch (Exception e15) {
                    a8.g(e15, true);
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
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        } else {
            try {
                InputStream openInputStream = t0.b.getContentResolver().openInputStream(uri);
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
            int i7 = geoPoint.accuracy_radius;
            if (i7 != 0) {
                tL_inputGeoPoint.flags |= 1;
                tL_inputGeoPoint.accuracy_radius = i7;
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

    public static void z(c cVar, long j3, int i7) {
        g0.g3(new di.c9(cVar, j3, i7, 6));
    }

    public final TLRPC.TL_photo A(String str, Uri uri, boolean z10) {
        TLRPC.PhotoSize b02;
        Bitmap K2 = fc.K(str, uri, g0.Z0(z10), g0.Z0(z10), true);
        if (K2 == null) {
            K2 = fc.K(str, uri, 800.0f, 800.0f, true);
        }
        Bitmap bitmap = K2;
        ArrayList<TLRPC.PhotoSize> arrayList = new ArrayList<>();
        TLRPC.PhotoSize Z = fc.Z(bitmap, 90.0f, 90.0f, 55, true);
        if (Z != null) {
            arrayList.add(Z);
        }
        if (z10) {
            b02 = fc.b0(null, bitmap, Bitmap.CompressFormat.JPEG, g0.Z0(z10), g0.Z0(z10), 99, false, 101, 101, false);
        } else {
            b02 = fc.b0(null, bitmap, Bitmap.CompressFormat.JPEG, g0.Z0(z10), g0.Z0(z10), 80, false, 101, 101, false);
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

    public final void A0(my myVar, TLRPC.InputMedia inputMedia, TLRPC.InputEncryptedFile inputEncryptedFile, String str) {
        int i7 = ls.W1;
        int i10 = 1;
        if (inputMedia == null) {
            if (inputEncryptedFile != null) {
                TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) myVar.d;
                int i11 = 0;
                while (true) {
                    if (i11 >= tL_messages_sendEncryptedMultiMedia.files.size()) {
                        break;
                    }
                    if (tL_messages_sendEncryptedMultiMedia.files.get(i11) == inputEncryptedFile) {
                        f0((TLRPC.Message) myVar.z.get(i11), myVar.H);
                        getNotificationCenter().k(i7, str, -1L, -1L, Boolean.FALSE);
                        break;
                    }
                    i11++;
                }
                t0(myVar, false);
                return;
            }
            return;
        }
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.media = inputMedia;
        TLObject tLObject = myVar.c;
        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject;
            tL_messages_uploadMedia.peer = tL_messages_sendMultiMedia.peer;
            int i12 = 0;
            while (true) {
                if (i12 >= tL_messages_sendMultiMedia.multi_media.size()) {
                    break;
                }
                if (tL_messages_sendMultiMedia.multi_media.get(i12).media == inputMedia) {
                    f0((TLRPC.Message) myVar.z.get(i12), myVar.H);
                    getNotificationCenter().k(i7, str, -1L, -1L, Boolean.FALSE);
                    break;
                }
                i12++;
            }
        } else {
            boolean z10 = tLObject instanceof TLRPC.TL_messages_sendMedia;
            if (z10) {
                TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                TLRPC.InputMedia inputMedia2 = tL_messages_sendMedia.media;
                if (inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    tL_messages_uploadMedia.peer = tL_messages_sendMedia.peer;
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia2;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= tL_inputMediaPaidMedia.extended_media.size()) {
                            break;
                        }
                        if (tL_inputMediaPaidMedia.extended_media.get(i13) == inputMedia) {
                            f0((TLRPC.Message) myVar.z.get(i13), myVar.H);
                            getNotificationCenter().k(i7, str, -1L, -1L, Boolean.FALSE);
                            break;
                        }
                        i13++;
                    }
                }
            }
            if (z10) {
                TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                TLRPC.InputMedia inputMedia3 = tL_messages_sendMedia2.media;
                if (inputMedia3 instanceof TLRPC.TL_inputMediaPoll) {
                    tL_messages_uploadMedia.peer = tL_messages_sendMedia2.peer;
                    int a10 = sh.d.a((TLRPC.TL_inputMediaPoll) inputMedia3, inputMedia);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= myVar.C.size()) {
                            break;
                        }
                        if (((Integer) myVar.C.get(i14)).intValue() == a10) {
                            f0((TLRPC.Message) myVar.z.get(i14), myVar.H);
                            getNotificationCenter().k(i7, str, -1L, -1L, Boolean.FALSE);
                            break;
                        }
                        i14++;
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
                    int i15 = 0;
                    while (true) {
                        if (i15 >= tL_inputMediaPaidMedia2.extended_media.size()) {
                            break;
                        }
                        if (tL_inputMediaPaidMedia2.extended_media.get(i15) == inputMedia) {
                            f0((TLRPC.Message) myVar.z.get(i15), myVar.H);
                            getNotificationCenter().k(i7, str, -1L, -1L, Boolean.FALSE);
                            break;
                        }
                        i15++;
                    }
                }
            }
            if (z11) {
                TL_ephemeral.TL_sendMessage tL_sendMessage2 = (TL_ephemeral.TL_sendMessage) tLObject;
                TLRPC.InputMedia inputMedia5 = tL_sendMessage2.media;
                if (inputMedia5 instanceof TLRPC.TL_inputMediaPoll) {
                    tL_messages_uploadMedia.peer = tL_sendMessage2.peer;
                    int a11 = sh.d.a((TLRPC.TL_inputMediaPoll) inputMedia5, inputMedia);
                    int i16 = 0;
                    while (true) {
                        if (i16 >= myVar.C.size()) {
                            break;
                        }
                        if (((Integer) myVar.C.get(i16)).intValue() == a11) {
                            f0((TLRPC.Message) myVar.z.get(i16), myVar.H);
                            getNotificationCenter().k(i7, str, -1L, -1L, Boolean.FALSE);
                            break;
                        }
                        i16++;
                    }
                }
            }
        }
        getConnectionsManager().sendRequest(tL_messages_uploadMedia, new gx(this, inputMedia, myVar, i10));
    }

    public final ry B(long j3) {
        return (ry) this.E.f(j3);
    }

    public final Boolean F(gj gjVar, TLRPC.TodoItem todoItem) {
        return (Boolean) this.I.get(Integer.valueOf(Objects.hash(Long.valueOf(gj.B0(gjVar.k)), Integer.valueOf(gjVar.e1()), Integer.valueOf(todoItem.id))));
    }

    public final long I(long j3) {
        return ((Long) this.x.g(0L, j3)).longValue();
    }

    public final boolean J(int i7) {
        return this.c.indexOfKey(i7) >= 0 || this.d.indexOfKey(i7) >= 0;
    }

    public final void L(my myVar) {
        M(myVar, -1);
    }

    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v75, types: [org.telegram.messenger.f20, org.telegram.tgnet.TLRPC$PhotoSize] */
    /* JADX WARN: Type inference failed for: r2v76 */
    public final void M(my myVar, int i7) {
        TLObject tLObject;
        TLRPC.InputFile inputFile;
        String str;
        TLRPC.InputMedia inputMedia;
        TLRPC.InputPeer inputPeer;
        TLRPC.InputMedia inputMedia2;
        gj gjVar;
        TLRPC.PhotoSize photoSize;
        ArrayList arrayList;
        ?? r22;
        TLRPC.PhotoSize photoSize2;
        int i10;
        TLRPC.InputMedia inputMedia3;
        TLRPC.InputPeer inputPeer2;
        f20 f20Var;
        TLRPC.InputMedia d;
        TLRPC.PhotoSize photoSize3;
        final az azVar = this;
        final my myVar2 = myVar;
        int i11 = myVar2.e;
        if (i11 == 0) {
            String str2 = myVar2.l;
            if (str2 != null) {
                azVar.e0(str2, myVar2);
                fc.D().L(azVar.currentAccount, myVar2.l, "file");
                return;
            }
            if (myVar2.c != null) {
                w7.G(azVar.currentAccount);
                String file = w7.I(myVar2.g).toString();
                azVar.e0(file, myVar2);
                azVar.getFileLoader().h0(false, 16777216, file, true);
                azVar.h0(myVar2.m);
                return;
            }
            w7.G(azVar.currentAccount);
            String file2 = w7.I(myVar2.g).toString();
            if (myVar2.d != null && (photoSize3 = myVar2.g) != null && photoSize3.location.dc_id != 0) {
                File file3 = new File(file2);
                if (!file3.exists()) {
                    w7.G(azVar.currentAccount);
                    file2 = w7.J(myVar2.g, null, true, true).toString();
                    file3 = new File(file2);
                }
                if (!file3.exists()) {
                    azVar.e0(w7.r(null, myVar2.g), myVar2);
                    azVar.getFileLoader().V(gc.f(myVar2.g, myVar2.h), myVar2.K, "jpg", 3, 0);
                    return;
                }
            }
            azVar.e0(file2, myVar2);
            azVar.getFileLoader().h0(true, 16777216, file2, true);
            azVar.h0(myVar2.m);
            return;
        }
        if (i11 == 1) {
            f20 f20Var2 = myVar2.o;
            if (f20Var2 != null && f20Var2.c() && myVar2.p) {
                gj gjVar2 = myVar2.m;
                String str3 = gjVar2.k.attachPath;
                TLRPC.Document F0 = gjVar2.F0();
                if (str3 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(w7.z(4));
                    sb2.append("/");
                    sb2.append(F0.id);
                    sb2.append(".");
                    sb2.append(myVar2.o.N ? "webm" : "mp4");
                    str3 = sb2.toString();
                }
                azVar.e0(str3, myVar2);
                myVar2.o.getClass();
                MediaController.B().h0(myVar2.m, false, true, false);
                azVar.h0(myVar2.m);
                return;
            }
            f20 f20Var3 = myVar2.o;
            if (f20Var3 != null) {
                TLRPC.InputFile inputFile2 = f20Var3.w;
                if (inputFile2 != null) {
                    i10 = 4;
                    TLObject tLObject2 = myVar2.c;
                    (tLObject2 instanceof TLRPC.TL_messages_sendMedia ? ((TLRPC.TL_messages_sendMedia) tLObject2).media : tLObject2 instanceof TL_ephemeral.TL_sendMessage ? ((TL_ephemeral.TL_sendMessage) tLObject2).media : tLObject2 instanceof TLRPC.TL_messages_addPollAnswer ? ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer.input_media : ((TLRPC.TL_messages_editMessage) tLObject2).media).file = inputFile2;
                    f20Var3.w = null;
                } else {
                    i10 = 4;
                    if (f20Var3.x != null) {
                        TLRPC.TL_decryptedMessage tL_decryptedMessage = (TLRPC.TL_decryptedMessage) myVar2.d;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia = tL_decryptedMessage.media;
                        decryptedMessageMedia.size = f20Var3.q;
                        decryptedMessageMedia.key = f20Var3.y;
                        decryptedMessageMedia.iv = f20Var3.z;
                        yv secretChatHelper = azVar.getSecretChatHelper();
                        gj gjVar3 = myVar2.m;
                        secretChatHelper.j(tL_decryptedMessage, gjVar3.k, myVar2.n, myVar2.o.x, myVar2.f, gjVar3);
                        myVar2.o.x = null;
                        return;
                    }
                }
            } else {
                i10 = 4;
            }
            TLObject tLObject3 = myVar2.c;
            if (tLObject3 == null) {
                gj gjVar4 = myVar2.m;
                String str4 = gjVar4.k.attachPath;
                TLRPC.Document F02 = gjVar4.F0();
                if (str4 == null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(w7.z(i10));
                    sb3.append("/");
                    str4 = a8.p0.r(sb3, F02.id, ".mp4");
                }
                if (myVar2.d != null && F02.dc_id != 0) {
                    File file4 = new File(str4);
                    if (!file4.exists()) {
                        w7 fileLoader = azVar.getFileLoader();
                        TLRPC.Message message = myVar2.m.k;
                        fileLoader.getClass();
                        file4 = w7.M(message, false, true);
                        if (file4 != null && file4.exists()) {
                            TLRPC.Message message2 = myVar2.m.k;
                            String absolutePath = file4.getAbsolutePath();
                            message2.attachPath = absolutePath;
                            myVar2.m.y0 = true;
                            str4 = absolutePath;
                        }
                    }
                    if (file4 == null || (!file4.exists() && myVar2.m.F0() != null)) {
                        w7 fileLoader2 = azVar.getFileLoader();
                        TLRPC.Document F03 = myVar2.m.F0();
                        fileLoader2.getClass();
                        file4 = w7.J(F03, null, false, true);
                        if (file4 != null && file4.exists()) {
                            TLRPC.Message message3 = myVar2.m.k;
                            String absolutePath2 = file4.getAbsolutePath();
                            message3.attachPath = absolutePath2;
                            myVar2.m.y0 = true;
                            str4 = absolutePath2;
                        }
                    }
                    if (file4 == null || (!file4.exists() && myVar2.m.F0() != null)) {
                        w7 fileLoader3 = azVar.getFileLoader();
                        TLRPC.Document F04 = myVar2.m.F0();
                        fileLoader3.getClass();
                        file4 = w7.J(F04, null, true, true);
                        if (file4 != null && file4.exists()) {
                            TLRPC.Message message4 = myVar2.m.k;
                            String absolutePath3 = file4.getAbsolutePath();
                            message4.attachPath = absolutePath3;
                            myVar2.m.y0 = true;
                            str4 = absolutePath3;
                        }
                    }
                    if (file4 == null || !file4.exists()) {
                        azVar.e0(w7.r(null, F02), myVar2);
                        azVar.getFileLoader().W(F02, myVar2.K, 3, 0);
                        return;
                    }
                }
                String str5 = str4;
                azVar.e0(str5, myVar2);
                f20 f20Var4 = myVar2.m.r0;
                if (f20Var4 == null || !f20Var4.P) {
                    if (f20Var4 == null || !f20Var4.c()) {
                        azVar.getFileLoader().h0(true, 33554432, str5, false);
                    } else {
                        azVar.getFileLoader().g0(str5, true, false, F02.size, 33554432, false);
                    }
                }
                azVar.h0(myVar2.m);
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
            if ((inputMedia3 instanceof TLRPC.TL_inputMediaPoll) && (d = sh.d.d((TLRPC.TL_inputMediaPoll) inputMedia3)) != null) {
                inputMedia3 = d;
            }
            TLRPC.InputFile inputFile3 = inputMedia3.file;
            if (inputFile3 == null && !(inputMedia3 instanceof TLRPC.TL_inputMediaDocument) && myVar2.p) {
                gj gjVar5 = myVar2.m;
                String str6 = gjVar5.k.attachPath;
                TLRPC.Document F05 = gjVar5.F0();
                TLRPC.TL_document tL_document = myVar2.m.E1;
                if (tL_document != null) {
                    F05 = tL_document;
                }
                if (str6 == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(w7.z(i10));
                    sb4.append("/");
                    str6 = a8.p0.r(sb4, F05.id, ".mp4");
                }
                String str7 = str6;
                azVar.e0(str7, myVar2);
                f20 f20Var5 = myVar2.m.r0;
                if (f20Var5 == null || !f20Var5.P) {
                    if (f20Var5 == null || !f20Var5.c()) {
                        azVar.getFileLoader().h0(false, 33554432, str7, false);
                    } else {
                        azVar.getFileLoader().g0(str7, false, false, F05.size, 33554432, false);
                    }
                }
                azVar.h0(myVar2.m);
                return;
            }
            TLRPC.InputPhoto inputPhoto = inputMedia3.video_cover;
            if (inputPhoto == null && myVar2.j == null && myVar2.i != null && myVar2.q) {
                String str8 = w7.z(i10) + "/" + myVar2.i.location.volume_id + "_" + myVar2.i.location.local_id + ".jpg";
                azVar.e0(str8, myVar2);
                azVar.getFileLoader().h0(false, 16777216, str8, true);
                azVar.h0(myVar2.m);
                return;
            }
            if (myVar2.k && (inputMedia3 instanceof TLRPC.TL_inputMediaUploadedDocument) && inputFile3 != null && myVar2.j != null) {
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = inputPeer2;
                inputMedia3.flags &= -65;
                inputMedia3.video_cover = null;
                tL_messages_uploadMedia.media = inputMedia3;
                final boolean z10 = inputMedia3.spoiler;
                final int i12 = inputMedia3.ttl_seconds;
                azVar.getConnectionsManager().sendRequest(tL_messages_uploadMedia, new RequestDelegate() { // from class: org.telegram.messenger.fx
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject4, TLRPC.TL_error tL_error) {
                        g0.g3(new di.da(az.this, tLObject4, myVar2, z10, i12));
                    }
                });
                return;
            }
            if (inputPhoto == null && myVar2.j != null && myVar2.q) {
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia2 = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia2.peer = inputPeer2;
                TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                tL_inputMediaUploadedPhoto.file = myVar2.j;
                tL_messages_uploadMedia2.media = tL_inputMediaUploadedPhoto;
                azVar.getConnectionsManager().sendRequest(tL_messages_uploadMedia2, new gx(azVar, inputMedia3, myVar2, 0));
                return;
            }
            gj gjVar6 = myVar2.m;
            String str9 = w7.z(i10) + "/" + myVar2.g.location.volume_id + "_" + myVar2.g.location.local_id + "." + ((gjVar6 == null || (f20Var = gjVar6.r0) == null || !f20Var.N) ? "jpg" : "webp");
            azVar.e0(str9, myVar2);
            azVar.getFileLoader().h0(false, 16777216, str9, true);
            azVar.h0(myVar2.m);
            return;
        }
        if (i11 == 2) {
            String str10 = myVar2.l;
            if (str10 != null) {
                azVar.e0(str10, myVar2);
                fc.D().L(azVar.currentAccount, myVar2.l, "gif");
                return;
            }
            TLObject tLObject4 = myVar2.c;
            if (tLObject4 != null) {
                TLRPC.InputMedia inputMedia4 = tLObject4 instanceof TLRPC.TL_messages_sendMedia ? ((TLRPC.TL_messages_sendMedia) tLObject4).media : tLObject4 instanceof TL_ephemeral.TL_sendMessage ? ((TL_ephemeral.TL_sendMessage) tLObject4).media : tLObject4 instanceof TLRPC.TL_messages_addPollAnswer ? ((TLRPC.TL_messages_addPollAnswer) tLObject4).answer.input_media : ((TLRPC.TL_messages_editMessage) tLObject4).media;
                if (inputMedia4.file == null) {
                    String str11 = myVar2.m.k.attachPath;
                    azVar.e0(str11, myVar2);
                    azVar.getFileLoader().h0(myVar2.c == null, 67108864, str11, false);
                    azVar.h0(myVar2.m);
                    return;
                }
                if (inputMedia4.thumb != null || (photoSize2 = myVar2.g) == null || (photoSize2 instanceof TLRPC.TL_photoStrippedSize)) {
                    return;
                }
                String str12 = w7.z(4) + "/" + myVar2.g.location.volume_id + "_" + myVar2.g.location.local_id + ".jpg";
                azVar.e0(str12, myVar2);
                azVar.getFileLoader().h0(false, 16777216, str12, true);
                azVar.h0(myVar2.m);
                return;
            }
            gj gjVar7 = myVar2.m;
            String str13 = gjVar7.k.attachPath;
            TLRPC.Document F06 = gjVar7.F0();
            if (myVar2.d != null && F06.dc_id != 0) {
                File file5 = new File(str13);
                if (!file5.exists()) {
                    w7 fileLoader4 = azVar.getFileLoader();
                    TLRPC.Message message5 = myVar2.m.k;
                    fileLoader4.getClass();
                    file5 = w7.M(message5, false, true);
                    if (file5 != null && file5.exists()) {
                        TLRPC.Message message6 = myVar2.m.k;
                        String absolutePath4 = file5.getAbsolutePath();
                        message6.attachPath = absolutePath4;
                        myVar2.m.y0 = true;
                        str13 = absolutePath4;
                    }
                }
                if (file5 == null || (!file5.exists() && myVar2.m.F0() != null)) {
                    w7 fileLoader5 = azVar.getFileLoader();
                    TLRPC.Document F07 = myVar2.m.F0();
                    fileLoader5.getClass();
                    file5 = w7.J(F07, null, false, true);
                    if (file5 != null && file5.exists()) {
                        TLRPC.Message message7 = myVar2.m.k;
                        String absolutePath5 = file5.getAbsolutePath();
                        message7.attachPath = absolutePath5;
                        myVar2.m.y0 = true;
                        str13 = absolutePath5;
                    }
                }
                if (file5 == null || (!file5.exists() && myVar2.m.F0() != null)) {
                    w7 fileLoader6 = azVar.getFileLoader();
                    TLRPC.Document F08 = myVar2.m.F0();
                    fileLoader6.getClass();
                    file5 = w7.J(F08, null, true, true);
                    if (file5 != null && file5.exists()) {
                        TLRPC.Message message8 = myVar2.m.k;
                        String absolutePath6 = file5.getAbsolutePath();
                        message8.attachPath = absolutePath6;
                        myVar2.m.y0 = true;
                        str13 = absolutePath6;
                    }
                }
                if (file5 == null || !file5.exists()) {
                    azVar.e0(w7.r(null, F06), myVar2);
                    azVar.getFileLoader().W(F06, myVar2.K, 3, 0);
                    return;
                }
            }
            azVar.e0(str13, myVar2);
            azVar.getFileLoader().h0(true, 67108864, str13, false);
            azVar.h0(myVar2.m);
            return;
        }
        if (i11 == 3) {
            String str14 = myVar2.m.k.attachPath;
            azVar.e0(str14, myVar2);
            azVar.getFileLoader().h0(myVar2.c == null, ConnectionsManager.FileTypeAudio, str14, true);
            azVar.h0(myVar2.m);
            return;
        }
        if (i11 != 4) {
            if (i11 == 5) {
                String str15 = "stickerset_" + myVar2.m.e1();
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = (TLRPC.InputStickerSet) myVar2.K;
                azVar.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new di(azVar, myVar2, str15, 10));
                azVar.e0(str15, myVar2);
                return;
            }
            return;
        }
        boolean z11 = i7 < 0;
        if (myVar2.p || myVar2.q) {
            int size = i7 < 0 ? myVar2.x.size() - 1 : i7;
            gj gjVar8 = (gj) myVar2.x.get(size);
            TLRPC.Document F09 = gjVar8.F0();
            if (F09 == null && (gj.m1(gjVar8) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) gj.m1(gjVar8);
                TLRPC.MessageExtendedMedia messageExtendedMedia = size >= tL_messageMediaPaidMedia.extended_media.size() ? null : tL_messageMediaPaidMedia.extended_media.get(size);
                TLRPC.MessageMedia messageMedia = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia ? ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media : null;
                F09 = messageMedia == null ? null : messageMedia.document;
            }
            if (F09 == null && (gj.m1(gjVar8) instanceof TLRPC.TL_messageMediaPoll)) {
                TLRPC.MessageMedia f10 = sh.d.f((TLRPC.TL_messageMediaPoll) gj.m1(gjVar8), ((Integer) myVar2.C.get(size)).intValue());
                F09 = f10 == null ? null : f10.document;
            }
            if (F09 != null) {
                f20 f20Var6 = myVar2.o;
                if (f20Var6 != null && f20Var6.c() && myVar2.p) {
                    String str16 = gjVar8.k.attachPath;
                    if (str16 == null) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(w7.z(4));
                        sb5.append("/");
                        str16 = a8.p0.r(sb5, F09.id, ".mp4");
                    }
                    azVar.e0(str16, myVar2);
                    myVar2.E.put(gjVar8, str16);
                    myVar2.E.put(str16 + "_i", gjVar8);
                    TLRPC.PhotoSize photoSize4 = myVar2.g;
                    if (photoSize4 != null && photoSize4.location != null) {
                        myVar2.E.put(p5.c.v(str16, "_t"), myVar2.g);
                    }
                    TLRPC.PhotoSize photoSize5 = myVar2.i;
                    if (photoSize5 != null && photoSize5.location != null) {
                        myVar2.E.put(p5.c.v(str16, "_ct"), myVar2.i);
                    }
                    myVar2.o.getClass();
                    MediaController.B().h0(gjVar8, false, true, false);
                    myVar2.m = gjVar8;
                    azVar.h0(gjVar8);
                } else {
                    String str17 = gjVar8.k.attachPath;
                    if (str17 == null) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(w7.z(4));
                        sb6.append("/");
                        str = "_ct";
                        str17 = a8.p0.r(sb6, F09.id, ".mp4");
                    } else {
                        str = "_ct";
                    }
                    TLObject tLObject5 = myVar2.c;
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
                                    inputMedia = sh.d.e((TLRPC.TL_inputMediaPoll) inputMedia5, ((Integer) myVar2.C.get(size)).intValue());
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
                                    inputMedia = sh.d.e((TLRPC.TL_inputMediaPoll) inputMedia6, ((Integer) myVar2.C.get(size)).intValue());
                                }
                                inputMedia = null;
                            }
                        } else {
                            inputMedia = null;
                            inputPeer = null;
                        }
                        if (inputMedia == null || inputMedia.file != null || (inputMedia instanceof TLRPC.TL_inputMediaDocument) || !myVar2.p) {
                            String str18 = str;
                            String str19 = str17;
                            TLRPC.PhotoSize photoSize6 = myVar2.i;
                            if (photoSize6 != null) {
                                photoSize = photoSize6;
                                if (myVar2.j == null && inputMedia != null && inputMedia.video_cover == null) {
                                    StringBuilder sb7 = new StringBuilder();
                                    sb7.append(w7.z(4));
                                    sb7.append("/");
                                    TLRPC.InputMedia inputMedia7 = inputMedia;
                                    sb7.append(myVar2.i.location.volume_id);
                                    sb7.append("_");
                                    sb7.append(myVar2.i.location.local_id);
                                    sb7.append(".jpg");
                                    String sb8 = sb7.toString();
                                    azVar.e0(sb8, myVar2);
                                    TLRPC.PhotoSize photoSize7 = myVar2.i;
                                    if (photoSize7 != null && photoSize7.location != null) {
                                        StringBuilder sb9 = new StringBuilder();
                                        sb9.append(w7.z(4));
                                        sb9.append("/");
                                        sb9.append(myVar2.i.location.volume_id);
                                        sb9.append("_");
                                        String n10 = a8.p0.n(myVar2.i.location.local_id, ".jpg", sb9);
                                        myVar2.E.put(p5.c.v(str19, str18), myVar2.i);
                                        myVar2.E.put(n10 + "_doc", str19);
                                    }
                                    myVar2.E.put(sb8 + "_o", str19);
                                    myVar2.E.put(str19 + "_i", gjVar8);
                                    myVar2.E.put(gjVar8, sb8);
                                    myVar2.E.put(sb8, inputMedia7);
                                    azVar.getFileLoader().h0(false, 16777216, sb8, true);
                                    azVar.h0(gjVar8);
                                } else {
                                    inputMedia2 = inputMedia;
                                    gjVar = gjVar8;
                                }
                            } else {
                                inputMedia2 = inputMedia;
                                gjVar = gjVar8;
                                photoSize = photoSize6;
                            }
                            if (photoSize == null || myVar2.j == null || inputMedia2 == null || inputMedia2.video_cover != null || !(inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) || inputMedia2.file == null || !(myVar2.c instanceof TLRPC.TL_messages_sendMultiMedia) || (arrayList = myVar2.D) == null || size < 0 || size >= arrayList.size() || !Boolean.TRUE.equals(myVar2.D.get(size))) {
                                TLRPC.InputMedia inputMedia8 = inputMedia2;
                                if (myVar2.i == null || myVar2.j == null || inputMedia8 == null || inputMedia8.video_cover != null) {
                                    azVar = this;
                                    if (myVar2.g != null) {
                                        String str20 = w7.z(4) + "/" + myVar2.g.location.volume_id + "_" + myVar2.g.location.local_id + ".jpg";
                                        azVar.e0(str20, myVar2);
                                        myVar2.E.put(str20 + "_o", str19);
                                        myVar2.E.put(gjVar, str20);
                                        myVar2.E.put(str20, inputMedia8);
                                        azVar.getFileLoader().h0(false, 16777216, str20, true);
                                        azVar.h0(gjVar);
                                    }
                                } else {
                                    TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia3 = new TLRPC.TL_messages_uploadMedia();
                                    tL_messages_uploadMedia3.peer = inputPeer;
                                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto2 = new TLRPC.TL_inputMediaUploadedPhoto();
                                    tL_inputMediaUploadedPhoto2.file = myVar2.j;
                                    tL_messages_uploadMedia3.media = tL_inputMediaUploadedPhoto2;
                                    azVar = this;
                                    getConnectionsManager().sendRequest(tL_messages_uploadMedia3, new zn(azVar, inputMedia8, myVar2, str19, gjVar, 4));
                                }
                            } else {
                                TLRPC.InputFile inputFile4 = myVar2.j;
                                inputMedia2.flags &= -65;
                                inputMedia2.video_cover = null;
                                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia4 = new TLRPC.TL_messages_uploadMedia();
                                tL_messages_uploadMedia4.peer = inputPeer;
                                tL_messages_uploadMedia4.media = inputMedia2;
                                ConnectionsManager connectionsManager = azVar.getConnectionsManager();
                                hx hxVar = new hx(size, 0, this, inputMedia2, myVar2, str19, inputFile4);
                                myVar2 = myVar2;
                                connectionsManager.sendRequest(tL_messages_uploadMedia4, hxVar);
                                r22 = 0;
                                azVar = this;
                                myVar2.o = r22;
                                myVar2.g = r22;
                                myVar2.i = r22;
                                inputFile = r22;
                            }
                        } else {
                            azVar.e0(str17, myVar2);
                            myVar2.E.put(gjVar8, str17);
                            myVar2.E.put(str17, inputMedia);
                            myVar2.E.put(str17 + "_i", gjVar8);
                            TLRPC.PhotoSize photoSize8 = myVar2.g;
                            if (photoSize8 != null && photoSize8.location != null) {
                                myVar2.E.put(p5.c.v(str17, "_t"), myVar2.g);
                            }
                            TLRPC.PhotoSize photoSize9 = myVar2.i;
                            if (photoSize9 != null && photoSize9.location != null) {
                                StringBuilder sb10 = new StringBuilder();
                                sb10.append(w7.z(4));
                                sb10.append("/");
                                sb10.append(myVar2.i.location.volume_id);
                                sb10.append("_");
                                String n11 = a8.p0.n(myVar2.i.location.local_id, ".jpg", sb10);
                                myVar2.E.put(p5.c.v(str17, str), myVar2.i);
                                myVar2.E.put(n11 + "_doc", str17);
                            }
                            f20 f20Var7 = gjVar8.r0;
                            if (f20Var7 == null || !f20Var7.c()) {
                                azVar.getFileLoader().h0(false, 33554432, str17, false);
                            } else {
                                azVar.getFileLoader().g0(str17, false, false, F09.size, 33554432, false);
                            }
                            azVar.h0(gjVar8);
                        }
                    } else {
                        String str21 = str17;
                        TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) myVar2.d;
                        azVar.e0(str21, myVar2);
                        myVar2.E.put(gjVar8, str21);
                        myVar2.E.put(str21, tL_messages_sendEncryptedMultiMedia.files.get(size));
                        myVar2.E.put(str21 + "_i", gjVar8);
                        TLRPC.PhotoSize photoSize10 = myVar2.g;
                        if (photoSize10 != null && photoSize10.location != null) {
                            myVar2.E.put(p5.c.v(str21, "_t"), myVar2.g);
                        }
                        f20 f20Var8 = gjVar8.r0;
                        if (f20Var8 == null || !f20Var8.c()) {
                            azVar.getFileLoader().h0(true, 33554432, str21, false);
                        } else {
                            azVar.getFileLoader().g0(str21, true, false, F09.size, 33554432, false);
                        }
                        azVar.h0(gjVar8);
                    }
                }
                r22 = 0;
                myVar2.o = r22;
                myVar2.g = r22;
                myVar2.i = r22;
                inputFile = r22;
            } else {
                String str22 = myVar2.l;
                if (str22 != null) {
                    azVar.e0(str22, myVar2);
                    myVar2.E.put(gjVar8, myVar2.l);
                    myVar2.E.put(myVar2.l, gjVar8);
                    fc.D().L(azVar.currentAccount, myVar2.l, "file");
                    inputFile = null;
                    myVar2.l = null;
                } else {
                    TLObject tLObject6 = myVar2.c;
                    if (tLObject6 instanceof TLRPC.TL_messages_sendMultiMedia) {
                        tLObject = ((TLRPC.TL_messages_sendMultiMedia) tLObject6).multi_media.get(size).media;
                    } else {
                        boolean z12 = tLObject6 instanceof TLRPC.TL_messages_sendMedia;
                        if (z12) {
                            TLRPC.InputMedia inputMedia9 = ((TLRPC.TL_messages_sendMedia) tLObject6).media;
                            if (inputMedia9 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                tLObject = ((TLRPC.TL_inputMediaPaidMedia) inputMedia9).extended_media.get(size);
                            }
                        }
                        if (z12) {
                            TLRPC.InputMedia inputMedia10 = ((TLRPC.TL_messages_sendMedia) tLObject6).media;
                            if (inputMedia10 instanceof TLRPC.TL_inputMediaPoll) {
                                tLObject = sh.d.e((TLRPC.TL_inputMediaPoll) inputMedia10, ((Integer) myVar2.C.get(size)).intValue());
                            }
                        }
                        boolean z13 = tLObject6 instanceof TL_ephemeral.TL_sendMessage;
                        if (z13) {
                            TLRPC.InputMedia inputMedia11 = ((TL_ephemeral.TL_sendMessage) tLObject6).media;
                            if (inputMedia11 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                tLObject = ((TLRPC.TL_inputMediaPaidMedia) inputMedia11).extended_media.get(size);
                            }
                        }
                        if (z13) {
                            TLRPC.InputMedia inputMedia12 = ((TL_ephemeral.TL_sendMessage) tLObject6).media;
                            if (inputMedia12 instanceof TLRPC.TL_inputMediaPoll) {
                                tLObject = sh.d.e((TLRPC.TL_inputMediaPoll) inputMedia12, ((Integer) myVar2.C.get(size)).intValue());
                            }
                        }
                        tLObject = ((TLRPC.TL_messages_sendEncryptedMultiMedia) myVar2.d).files.get(size);
                    }
                    w7.G(azVar.currentAccount);
                    String file6 = w7.I(myVar2.g).toString();
                    azVar.e0(file6, myVar2);
                    myVar2.E.put(file6, tLObject);
                    myVar2.E.put(gjVar8, file6);
                    azVar.getFileLoader().h0(myVar2.d != null, 16777216, file6, true);
                    azVar.h0(gjVar8);
                    inputFile = null;
                    myVar2.g = null;
                }
            }
            myVar2.j = inputFile;
            myVar2.p = false;
            myVar2.q = false;
        } else if (!myVar2.x.isEmpty()) {
            azVar.f0(((gj) i5.c.h(1, myVar2.x)).k, myVar2.G != 0);
        }
        azVar.t0(myVar2, z11);
    }

    public final void N(TLObject tLObject, gj gjVar, String str, my myVar, Object obj, HashMap hashMap, boolean z10) {
        O(tLObject, gjVar, str, null, false, myVar, obj, hashMap, z10);
    }

    public final void O(TLObject tLObject, final gj gjVar, final String str, final my myVar, final boolean z10, final my myVar2, final Object obj, final HashMap hashMap, final boolean z11) {
        my y10;
        ArrayList arrayList;
        TLObject tLObject2 = tLObject;
        if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
            TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) tLObject;
            TLRPC.InputMedia inputMedia = tL_messages_addPollAnswer.answer.input_media;
            if ((inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument) || (inputMedia instanceof TLRPC.TL_inputMediaUploadedPhoto)) {
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = tL_messages_addPollAnswer.peer;
                tL_messages_uploadMedia.media = tL_messages_addPollAnswer.answer.input_media;
                getConnectionsManager().sendRequest(tL_messages_uploadMedia, new ix(this, tL_messages_addPollAnswer, tLObject, gjVar, str, myVar, z10, myVar2, obj, hashMap, z11));
                return;
            }
            tLObject2 = tLObject;
        }
        if (!(tLObject2 instanceof TLRPC.TL_messages_editMessage) && z10 && (y10 = y(gjVar.e1(), gj.B0(gjVar.k))) != null) {
            boolean z12 = myVar != null ? myVar.H : false;
            ny nyVar = new ny();
            nyVar.a = tLObject2;
            nyVar.b = gjVar;
            nyVar.d = str;
            nyVar.g = myVar2;
            nyVar.h = obj;
            nyVar.i = z12;
            if (y10.b == null) {
                y10.b = new ArrayList();
            }
            y10.b.add(nyVar);
            if (myVar == null || (arrayList = myVar.b) == null) {
                return;
            }
            y10.b.addAll(arrayList);
            return;
        }
        TLRPC.Message message = gjVar.k;
        f0(message, z11);
        di.y8 y11 = di.y8.y(this.currentAccount, false);
        iw iwVar = new iw(this, tLObject2, gjVar, str, myVar, z10, myVar2, obj, hashMap, z11, 1);
        if (gjVar.k != null) {
            int e12 = gjVar.e1();
            if (di.y8.o(tLObject) > 0 && y11.Q.remove(Integer.valueOf(e12))) {
                y11.R.put(Integer.valueOf(e12), iwVar);
                return;
            }
        }
        if (f2.b(this.currentAccount).a(tLObject, Collections.singletonList(gjVar), new iw(this, tLObject, gjVar, str, myVar, z10, myVar2, obj, hashMap, z11, 2))) {
            if (bg.x.g(this.currentAccount).a(tLObject, Collections.singletonList(gjVar), new y10() { // from class: org.telegram.messenger.jx
                @Override // org.telegram.messenger.y10
                public final void a(Object obj2) {
                    boolean z13 = z11;
                    az.this.O((TLObject) obj2, gjVar, str, myVar, z10, myVar2, obj, hashMap, z13);
                }
            })) {
                message.reqId = getConnectionsManager().sendRequest(tLObject, new ix(this, tLObject, gjVar, str, myVar, z10, myVar2, obj, hashMap, z11, message), new o(6, this, message), (tLObject instanceof TLRPC.TL_messages_sendMessage ? 128 : 0) | 68);
                if (myVar != null) {
                    myVar.d();
                }
            }
        }
    }

    public final void P(final TLObject tLObject, final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3, final my myVar, final boolean z10) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            f0(((gj) arrayList.get(i7)).k, z10);
        }
        final int i10 = 0;
        if (di.y8.y(this.currentAccount, false).c(tLObject, arrayList, new Runnable(this) { // from class: org.telegram.messenger.ax
            public final /* synthetic */ az b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.P(tLObject, arrayList, arrayList2, arrayList3, myVar, z10);
                        break;
                    default:
                        this.b.P(tLObject, arrayList, arrayList2, arrayList3, myVar, z10);
                        break;
                }
            }
        })) {
            final int i11 = 1;
            if (f2.b(this.currentAccount).a(tLObject, arrayList, new Runnable(this) { // from class: org.telegram.messenger.ax
                public final /* synthetic */ az b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            this.b.P(tLObject, arrayList, arrayList2, arrayList3, myVar, z10);
                            break;
                        default:
                            this.b.P(tLObject, arrayList, arrayList2, arrayList3, myVar, z10);
                            break;
                    }
                }
            }) && bg.x.g(this.currentAccount).a(tLObject, arrayList, new y10() { // from class: org.telegram.messenger.dx
                @Override // org.telegram.messenger.y10
                public final void a(Object obj) {
                    boolean z11 = z10;
                    az.this.P((TLObject) obj, arrayList, arrayList2, arrayList3, myVar, z11);
                }
            })) {
                getConnectionsManager().sendRequest(tLObject, new RequestDelegate() { // from class: org.telegram.messenger.ex
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                        ArrayList arrayList4;
                        boolean z11;
                        boolean[] zArr;
                        az azVar = az.this;
                        TLObject tLObject3 = tLObject;
                        ArrayList arrayList5 = arrayList;
                        ArrayList arrayList6 = arrayList2;
                        boolean z12 = z10;
                        if (tL_error == null || !r8.r(tL_error.text)) {
                            arrayList4 = arrayList6;
                            z11 = z12;
                        } else {
                            int c10 = r8.c(tL_error.text);
                            ArrayList arrayList7 = arrayList3;
                            arrayList4 = arrayList6;
                            z11 = z12;
                            my myVar2 = myVar;
                            if (arrayList7 != null) {
                                ArrayList arrayList8 = new ArrayList(arrayList7);
                                if (c10 >= 0) {
                                    int i12 = 0;
                                    while (i12 < arrayList8.size()) {
                                        arrayList8.set(i12, c10 == i12 ? arrayList8.get(i12) : null);
                                        i12++;
                                    }
                                }
                                azVar.getFileRefController().u(new Object[]{tLObject3, arrayList5, arrayList4, arrayList8, myVar2, Boolean.valueOf(z11)}, arrayList8);
                                return;
                            }
                            if (myVar2 != null) {
                                if (!((c10 < 0 || (zArr = myVar2.s) == null || c10 >= zArr.length) ? myVar2.r : zArr[c10])) {
                                    if (c10 < 0) {
                                        myVar2.r = true;
                                    } else {
                                        if (myVar2.s == null) {
                                            myVar2.s = new boolean[myVar2.x.size()];
                                        }
                                        myVar2.s[c10] = true;
                                    }
                                    g0.g3(new a5(azVar, tLObject3, c10, myVar2, arrayList5, z11));
                                    return;
                                }
                            }
                        }
                        g0.g3(new ox(azVar, tL_error, tLObject2, z11, arrayList5, arrayList4, tLObject3));
                    }
                }, (QuickAckDelegate) null, 68);
            }
        }
    }

    public final void Q(long j3, Uri uri, ArrayList arrayList, d80 d80Var) {
        if (this.E.f(j3) != null) {
            d80Var.run(0L);
            return;
        }
        if (n5.z(j3)) {
            long j10 = -j3;
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(j10));
            if (O0 != null && !O0.megagroup) {
                getMessagesController().T(null, j10, null, new nh(this, uri, arrayList, d80Var), null);
                return;
            }
        }
        new Thread(new im(this, arrayList, j3, uri, d80Var, 3)).start();
    }

    public final void a(TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, long j3) {
        if (j3 != 0) {
            TLRPC.InputPeer l1 = getMessagesController().l1(j3);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_forwardMessages.reply_to;
            if (inputReplyTo == null) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_messages_forwardMessages.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = l1;
            } else if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                inputReplyTo.monoforum_peer_id = l1;
                inputReplyTo.flags |= 32;
            }
        }
    }

    public final void b(TLRPC.TL_messages_sendInlineBotResult tL_messages_sendInlineBotResult, long j3) {
        if (j3 != 0) {
            TLRPC.InputPeer l1 = getMessagesController().l1(j3);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendInlineBotResult.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = l1;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendInlineBotResult.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = l1;
            tL_messages_sendInlineBotResult.flags |= 1;
        }
    }

    public final void c(TLRPC.TL_messages_sendMedia tL_messages_sendMedia, long j3) {
        if (j3 != 0) {
            TLRPC.InputPeer l1 = getMessagesController().l1(j3);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMedia.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = l1;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMedia.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = l1;
            tL_messages_sendMedia.flags |= 1;
        }
    }

    public final void c0(gj gjVar, long j3, long j10, long j11, lj ljVar) {
        if (gjVar == null) {
            return;
        }
        TLRPC.Message message = gjVar.k;
        TLRPC.MessageMedia messageMedia = message.media;
        ArrayList arrayList = null;
        r4 = null;
        r4 = null;
        HashMap hashMap = null;
        arrayList = null;
        if (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || (messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaGame) || (messageMedia instanceof TLRPC.TL_messageMediaInvoice)) {
            if (message.message == null) {
                if (n5.C(j3)) {
                    q0(f3.i(gjVar), j3, true, false, true, 0, 0, null, -1, j10, j11, ljVar);
                    return;
                }
                return;
            }
            TLRPC.WebPage webPage = messageMedia instanceof TLRPC.TL_messageMediaWebPage ? messageMedia.webpage : null;
            ArrayList<TLRPC.MessageEntity> arrayList2 = message.entities;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList = new ArrayList();
                for (int i7 = 0; i7 < gjVar.k.entities.size(); i7++) {
                    TLRPC.MessageEntity messageEntity = gjVar.k.entities.get(i7);
                    if ((messageEntity instanceof TLRPC.TL_messageEntityBold) || (messageEntity instanceof TLRPC.TL_messageEntityItalic) || (messageEntity instanceof TLRPC.TL_messageEntityPre) || (messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) || (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                        arrayList.add(messageEntity);
                    }
                }
            }
            yy b10 = yy.b(gjVar.k.message, j3, gjVar.C, null, webPage, true, arrayList, null, null, true, 0, 0, null, false);
            b10.Q = j10;
            b10.R = j11;
            b10.T = ljVar;
            r0(b10);
            return;
        }
        if (n5.C(j3)) {
            TLRPC.Message message2 = gjVar.k;
            if (message2.peer_id != null) {
                TLRPC.MessageMedia messageMedia2 = message2.media;
                if ((messageMedia2.photo instanceof TLRPC.TL_photo) || (messageMedia2.document instanceof TLRPC.TL_document)) {
                    hashMap = new HashMap();
                    hashMap.put("parentObject", "sent_" + gjVar.k.peer_id.channel_id + "_" + gjVar.e1() + "_" + gj.B0(gjVar.k) + "_" + gjVar.D + "_" + gjVar.S1());
                }
            }
        }
        HashMap hashMap2 = hashMap;
        TLRPC.Message message3 = gjVar.k;
        TLRPC.MessageMedia messageMedia3 = message3.media;
        TLRPC.Photo photo = messageMedia3.photo;
        if (photo instanceof TLRPC.TL_photo) {
            yy c10 = yy.c(null, message3.message, null, (TLRPC.TL_photo) photo, null, null, null, null, null, null, j3, null, gjVar.C, null, null, true, null, message3.entities, null, hashMap2, true, 0, 0, messageMedia3.ttl_seconds, gjVar, null, false, false);
            c10.Q = j10;
            c10.R = j11;
            c10.T = ljVar;
            r0(c10);
            return;
        }
        TLRPC.Document document = messageMedia3.document;
        if (document instanceof TLRPC.TL_document) {
            yy f10 = yy.f((TLRPC.TL_document) document, null, message3.attachPath, j3, gjVar.C, null, message3.message, message3.entities, null, hashMap2, true, 0, 0, messageMedia3.ttl_seconds, gjVar, null, false);
            f10.Q = j10;
            f10.R = j11;
            f10.T = ljVar;
            r0(f10);
            return;
        }
        if ((messageMedia3 instanceof TLRPC.TL_messageMediaVenue) || (messageMedia3 instanceof TLRPC.TL_messageMediaGeo)) {
            yy d = yy.d(messageMedia3, j3, gjVar.C, null, null, null, true, 0);
            d.Q = j10;
            d.R = j11;
            d.T = ljVar;
            r0(d);
            return;
        }
        if (messageMedia3.phone_number == null) {
            if (n5.C(j3)) {
                return;
            }
            q0(f3.i(gjVar), j3, true, false, true, 0, 0, null, -1, j10, j11, ljVar);
            return;
        }
        TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
        TLRPC.MessageMedia messageMedia4 = gjVar.k.media;
        tL_userContact_old2.phone = messageMedia4.phone_number;
        tL_userContact_old2.first_name = messageMedia4.first_name;
        tL_userContact_old2.last_name = messageMedia4.last_name;
        tL_userContact_old2.id = messageMedia4.user_id;
        yy g10 = yy.g(tL_userContact_old2, j3, gjVar.C, null, null, null, true, 0, 0);
        g10.R = j11;
        g10.T = ljVar;
        g10.Q = j10;
        r0(g10);
    }

    public final void d(TLRPC.TL_messages_sendMessage tL_messages_sendMessage, long j3) {
        if (j3 != 0) {
            TLRPC.InputPeer l1 = getMessagesController().l1(j3);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMessage.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = l1;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMessage.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = l1;
            tL_messages_sendMessage.flags |= 1;
        }
    }

    public final void d0(int i7) {
        SparseArray sparseArray = this.b;
        int size = sparseArray.size();
        sparseArray.remove(i7);
        if (size == 0 || sparseArray.size() != 0) {
            return;
        }
        ur messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new qq(messagesStorage, 22));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0179  */
    @Override // org.telegram.messenger.gs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        gj gjVar;
        char c10;
        gj gjVar2;
        String str;
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        int i14;
        ty tyVar;
        char c11;
        String str2;
        vy vyVar;
        ArrayList arrayList2;
        TLRPC.InputMedia inputMedia;
        TLRPC.InputFile inputFile;
        String str3;
        int i15;
        String str4;
        String str5;
        TLRPC.InputEncryptedFile inputEncryptedFile;
        TLObject tLObject;
        int i16;
        TLRPC.TL_decryptedMessage tL_decryptedMessage;
        String str6;
        char c12;
        int i17;
        HashMap hashMap;
        HashMap hashMap2;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        TLRPC.PhotoSize photoSize3;
        TLRPC.PhotoSize photoSize4;
        TLRPC.PhotoSize photoSize5;
        gj gjVar3;
        f20 f20Var;
        az azVar = this;
        int i18 = 0;
        boolean z10 = 1;
        if (i7 == ls.W1) {
            String str7 = (String) objArr[0];
            ry ryVar = (ry) azVar.y.get(str7);
            if (ryVar != null) {
                ryVar.b(str7, ((Long) objArr[1]).longValue(), r3.longValue() / ((Long) objArr[2]).longValue());
            }
            vy vyVar2 = (vy) azVar.F.get(str7);
            if (vyVar2 != null) {
                vyVar2.a(str7, ((Long) objArr[1]).longValue(), r3.longValue() / ((Long) objArr[2]).longValue());
                return;
            }
            return;
        }
        String str8 = "_t";
        int i19 = -1;
        if (i7 != ls.U1) {
            boolean z11 = true;
            if (i7 == ls.V1) {
                String str9 = (String) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                ry ryVar2 = (ry) azVar.y.get(str9);
                if (ryVar2 != null) {
                    az azVar2 = ryVar2.q;
                    if (str9.equals(ryVar2.a)) {
                        azVar2.E.l(ryVar2.j);
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.code = 400;
                        tL_error.text = "IMPORT_UPLOAD_FAILED";
                        azVar2.getNotificationCenter().k(ls.v1, Long.valueOf(ryVar2.j), new TLRPC.TL_messages_initHistoryImport(), tL_error);
                    } else {
                        ryVar2.c.remove(str9);
                    }
                }
                vy vyVar3 = (vy) azVar.F.get(str9);
                if (vyVar3 != null && (tyVar = (ty) vyVar3.a.remove(str9)) != null) {
                    vyVar3.d.remove(tyVar);
                }
                ArrayList arrayList3 = (ArrayList) azVar.a.get(str9);
                if (arrayList3 != null) {
                    int i20 = 0;
                    while (i20 < arrayList3.size()) {
                        my myVar = (my) arrayList3.get(i20);
                        if ((booleanValue && myVar.d != null) || (!booleanValue && myVar.c != null)) {
                            myVar.c();
                            arrayList3.remove(i20);
                            i20--;
                        }
                        i20++;
                    }
                    if (arrayList3.isEmpty()) {
                        azVar.a.remove(str9);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i7 == ls.a2) {
                gj gjVar4 = (gj) objArr[0];
                if (gjVar4.e1() == 0) {
                    return;
                }
                ArrayList arrayList4 = (ArrayList) azVar.a.get(gjVar4.k.attachPath);
                if (arrayList4 != null) {
                    int i21 = 0;
                    while (true) {
                        if (i21 >= arrayList4.size()) {
                            break;
                        }
                        my myVar2 = (my) arrayList4.get(i21);
                        if (myVar2.e == 4) {
                            int indexOf = myVar2.x.indexOf(gjVar4);
                            myVar2.g = (TLRPC.PhotoSize) myVar2.E.get(gjVar4.k.attachPath + "_t");
                            if (myVar2.E.containsKey(gjVar4.k.attachPath + "_ct")) {
                                myVar2.i = (TLRPC.PhotoSize) myVar2.E.get(gjVar4.k.attachPath + "_ct");
                            }
                            myVar2.p = z11;
                            azVar.M(myVar2, indexOf);
                            arrayList4.remove(i21);
                        } else {
                            if (myVar2.m == gjVar4) {
                                myVar2.o = null;
                                azVar.M(myVar2, -1);
                                arrayList4.remove(i21);
                                break;
                            }
                            i21++;
                            z11 = true;
                        }
                    }
                    if (arrayList4.isEmpty()) {
                        azVar.a.remove(gjVar4.k.attachPath);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i7 == ls.b2) {
                gj gjVar5 = (gj) objArr[0];
                if (gjVar5.e1() == 0) {
                    return;
                }
                String str10 = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                azVar.getFileLoader().n(str10, n5.C(gj.B0(gjVar5.k)), longValue, longValue2, (Float) objArr[4]);
                if (longValue2 == 0 || (arrayList = (ArrayList) azVar.a.get(gjVar5.k.attachPath)) == null) {
                    return;
                }
                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                    my myVar3 = (my) arrayList.get(i22);
                    if (myVar3.e == 4) {
                        int i23 = 0;
                        while (true) {
                            if (i23 >= myVar3.x.size()) {
                                break;
                            }
                            gj gjVar6 = (gj) myVar3.x.get(i23);
                            if (gjVar6 == gjVar5) {
                                myVar3.m.t0 = true;
                                gjVar6.k.params.remove("ve");
                                TLRPC.Document F0 = myVar3.m.F0();
                                if (F0 != null) {
                                    F0.size = longValue2;
                                }
                                ArrayList arrayList5 = new ArrayList();
                                arrayList5.add(gjVar6.k);
                                if (gj.d5(gjVar6.k)) {
                                    i14 = 9;
                                    i13 = 0;
                                } else if (gj.b4(gjVar6.k)) {
                                    i13 = gj.I1(gjVar6.k);
                                    i14 = 5;
                                } else if (gjVar6.r1) {
                                    i13 = 0;
                                    i14 = 1;
                                } else {
                                    i13 = 0;
                                    i14 = 0;
                                }
                                if ((!myVar3.I && !myVar3.J) || i23 == 0) {
                                    azVar.getMessagesStorage().j1(arrayList5, false, true, false, 0, false, i14, i13);
                                }
                            } else {
                                i23++;
                            }
                        }
                    } else {
                        gj gjVar7 = myVar3.m;
                        if (gjVar7 == gjVar5) {
                            gjVar7.t0 = true;
                            gjVar7.k.params.remove("ve");
                            TLRPC.Document F02 = myVar3.m.F0();
                            if (F02 != null) {
                                F02.size = longValue2;
                            }
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.add(myVar3.m.k);
                            if (gj.d5(myVar3.m.k)) {
                                i12 = 9;
                                i11 = 0;
                            } else if (gj.b4(myVar3.m.k)) {
                                i11 = gj.I1(myVar3.m.k);
                                i12 = 5;
                            } else {
                                i11 = 0;
                                i12 = myVar3.m.r1 ? 1 : 0;
                            }
                            azVar.getMessagesStorage().j1(arrayList6, false, true, false, 0, false, i12, i11);
                            return;
                        }
                    }
                }
                return;
            }
            if (i7 == ls.c2) {
                gj gjVar8 = (gj) objArr[0];
                if (gjVar8.e1() == 0) {
                    return;
                }
                String str11 = (String) objArr[1];
                ArrayList arrayList7 = (ArrayList) azVar.a.get(str11);
                if (arrayList7 != null) {
                    int i24 = 0;
                    while (i24 < arrayList7.size()) {
                        my myVar4 = (my) arrayList7.get(i24);
                        if (myVar4.e == 4) {
                            for (int i25 = 0; i25 < myVar4.z.size(); i25++) {
                                if (myVar4.x.get(i25) == gjVar8) {
                                    myVar4.c();
                                    arrayList7.remove(i24);
                                    i24--;
                                    break;
                                }
                            }
                            i24++;
                        } else {
                            if (myVar4.m == gjVar8) {
                                myVar4.c();
                                arrayList7.remove(i24);
                                i24--;
                                break;
                            }
                            i24++;
                        }
                    }
                    if (arrayList7.isEmpty()) {
                        azVar.a.remove(str11);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i7 != ls.R1) {
                if (i7 == ls.Y1) {
                    ArrayList arrayList8 = (ArrayList) azVar.a.remove((String) objArr[0]);
                    if (arrayList8 != null) {
                        for (int i26 = 0; i26 < arrayList8.size(); i26++) {
                            azVar.M((my) arrayList8.get(i26), -1);
                        }
                        return;
                    }
                    return;
                }
                if (i7 == ls.S1 || i7 == ls.Z1) {
                    String str12 = (String) objArr[0];
                    ArrayList arrayList9 = (ArrayList) azVar.a.get(str12);
                    if (arrayList9 != null) {
                        for (int i27 = 0; i27 < arrayList9.size(); i27++) {
                            ((my) arrayList9.get(i27)).c();
                        }
                        azVar.a.remove(str12);
                        return;
                    }
                    return;
                }
                return;
            }
            String str13 = (String) objArr[0];
            ArrayList arrayList10 = (ArrayList) azVar.a.get(str13);
            if (arrayList10 != null) {
                int i28 = 0;
                while (i28 < arrayList10.size()) {
                    my myVar5 = (my) arrayList10.get(i28);
                    int i29 = myVar5.e;
                    if (i29 == 0) {
                        gjVar = myVar5.m;
                        c10 = 0;
                    } else {
                        if (i29 == 2) {
                            gjVar2 = myVar5.m;
                        } else if (i29 == 4) {
                            gjVar2 = (gj) myVar5.E.get(str13);
                            if (gjVar2.F0() == null) {
                                gjVar = gjVar2;
                                c10 = 0;
                            }
                        } else {
                            gjVar = null;
                            c10 = 65535;
                        }
                        gjVar = gjVar2;
                        c10 = 1;
                    }
                    if (c10 == 0) {
                        str = str13;
                        Utilities.e.c(new gn(this, new File(w7.z(4), Utilities.a(str13) + "." + fc.B(str13, "file")), gjVar, myVar5, str13, 17));
                    } else {
                        str = str13;
                        if (c10 == 1) {
                            azVar = this;
                            Utilities.e.c(new ul(this, myVar5, new File(w7.z(4), Utilities.a(str) + ".gif"), gjVar, 24));
                            i28++;
                            str13 = str;
                        }
                    }
                    azVar = this;
                    i28++;
                    str13 = str;
                }
                azVar.a.remove(str13);
                return;
            }
            return;
        }
        String str14 = (String) objArr[0];
        TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
        TLRPC.InputEncryptedFile inputEncryptedFile2 = (TLRPC.InputEncryptedFile) objArr[2];
        ry ryVar3 = (ry) azVar.y.get(str14);
        if (ryVar3 != null) {
            if (!str14.equals(ryVar3.a)) {
                c11 = 5;
                str2 = "_ct";
                ryVar3.b(str14, ((Long) objArr[5]).longValue(), 1.0f);
                TLRPC.TL_messages_uploadImportedMedia tL_messages_uploadImportedMedia = new TLRPC.TL_messages_uploadImportedMedia();
                tL_messages_uploadImportedMedia.peer = ryVar3.g;
                tL_messages_uploadImportedMedia.import_id = ryVar3.k;
                tL_messages_uploadImportedMedia.file_name = new File(str14).getName();
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
                ryVar3.q.getConnectionsManager().sendRequest(tL_messages_uploadImportedMedia, new py(ryVar3, str14), 2);
                vyVar = (vy) azVar.F.get(str14);
                if (vyVar != null) {
                    vyVar.a(str14, ((Long) objArr[c11]).longValue(), 1.0f);
                    ty tyVar2 = (ty) vyVar.a.get(str14);
                    if (tyVar2 != null) {
                        tyVar2.a(vyVar.o.currentAccount, inputFile2, new sq(23, vyVar, str14));
                    }
                }
                arrayList2 = (ArrayList) azVar.a.get(str14);
                if (arrayList2 == null) {
                    int i30 = 0;
                    while (i30 < arrayList2.size()) {
                        my myVar6 = (my) arrayList2.get(i30);
                        TLObject tLObject2 = myVar6.c;
                        if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                            inputMedia = ((TLRPC.TL_messages_sendMedia) tLObject2).media;
                            if (inputMedia instanceof TLRPC.TL_inputMediaPaidMedia) {
                                HashMap hashMap3 = myVar6.E;
                                inputMedia = hashMap3 == null ? ((TLRPC.TL_inputMediaPaidMedia) inputMedia).extended_media.get(i18) : (TLRPC.InputMedia) hashMap3.get(str14);
                            } else if (inputMedia instanceof TLRPC.TL_inputMediaPoll) {
                                HashMap hashMap4 = myVar6.E;
                                inputMedia = hashMap4 == null ? sh.d.d((TLRPC.TL_inputMediaPoll) inputMedia) : (TLRPC.InputMedia) hashMap4.get(str14);
                            }
                        } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
                            inputMedia = ((TL_ephemeral.TL_sendMessage) tLObject2).media;
                            if (inputMedia instanceof TLRPC.TL_inputMediaPaidMedia) {
                                HashMap hashMap5 = myVar6.E;
                                inputMedia = hashMap5 == null ? ((TLRPC.TL_inputMediaPaidMedia) inputMedia).extended_media.get(i18) : (TLRPC.InputMedia) hashMap5.get(str14);
                            } else if (inputMedia instanceof TLRPC.TL_inputMediaPoll) {
                                HashMap hashMap6 = myVar6.E;
                                inputMedia = hashMap6 == null ? sh.d.d((TLRPC.TL_inputMediaPoll) inputMedia) : (TLRPC.InputMedia) hashMap6.get(str14);
                            }
                        } else {
                            inputMedia = tLObject2 instanceof TLRPC.TL_messages_editMessage ? ((TLRPC.TL_messages_editMessage) tLObject2).media : tLObject2 instanceof TLRPC.TL_messages_sendMultiMedia ? (TLRPC.InputMedia) myVar6.E.get(str14) : tLObject2 instanceof TLRPC.TL_messages_addPollAnswer ? ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer.input_media : null;
                        }
                        if (inputFile2 == null || inputMedia == null) {
                            inputFile = inputFile2;
                            str3 = str8;
                            i15 = i18;
                            str4 = str2;
                            str5 = str14;
                            TLRPC.InputEncryptedFile inputEncryptedFile3 = inputEncryptedFile2;
                            if (inputEncryptedFile3 == null || (tLObject = myVar6.d) == null) {
                                inputEncryptedFile = inputEncryptedFile3;
                            } else {
                                if (myVar6.e == 4) {
                                    TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) tLObject;
                                    TLRPC.InputEncryptedFile inputEncryptedFile4 = (TLRPC.InputEncryptedFile) myVar6.E.get(str5);
                                    int indexOf2 = tL_messages_sendEncryptedMultiMedia.files.indexOf(inputEncryptedFile4);
                                    if (indexOf2 >= 0) {
                                        tL_messages_sendEncryptedMultiMedia.files.set(indexOf2, inputEncryptedFile3);
                                        i16 = z10;
                                        if (inputEncryptedFile4.id == 1) {
                                            myVar6.g = (TLRPC.PhotoSize) myVar6.E.get(str5 + str3);
                                        }
                                        tL_decryptedMessage = tL_messages_sendEncryptedMultiMedia.messages.get(indexOf2);
                                    } else {
                                        i16 = z10;
                                        tL_decryptedMessage = null;
                                    }
                                } else {
                                    i16 = z10;
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
                                    if (myVar6.e == 4) {
                                        azVar.A0(myVar6, null, inputEncryptedFile3, str5);
                                        inputEncryptedFile = inputEncryptedFile3;
                                    } else {
                                        yv secretChatHelper = azVar.getSecretChatHelper();
                                        gj gjVar9 = myVar6.m;
                                        secretChatHelper.j(tL_decryptedMessage, gjVar9.k, myVar6.n, inputEncryptedFile3, myVar6.f, gjVar9);
                                        inputEncryptedFile = inputEncryptedFile3;
                                    }
                                } else {
                                    inputEncryptedFile = inputEncryptedFile3;
                                }
                                arrayList2.remove(i30);
                                i30--;
                                i30 += i16;
                                str8 = str3;
                                z10 = i16;
                                str2 = str4;
                                inputFile2 = inputFile;
                                str14 = str5;
                                i18 = i15;
                                inputEncryptedFile2 = inputEncryptedFile;
                                i19 = -1;
                            }
                        } else {
                            int i31 = myVar6.e;
                            if (i31 == 0) {
                                inputMedia.file = inputFile2;
                                i15 = i18;
                                str6 = str8;
                                inputFile = inputFile2;
                                inputEncryptedFile = inputEncryptedFile2;
                                str5 = str14;
                                azVar.O(myVar6.c, myVar6.m, myVar6.f, myVar6, true, null, myVar6.K, null, myVar6.H);
                            } else {
                                inputFile = inputFile2;
                                str6 = str8;
                                int i32 = i19;
                                i15 = i18;
                                inputEncryptedFile = inputEncryptedFile2;
                                str5 = str14;
                                if (i31 != z10) {
                                    c12 = 4;
                                    if (i31 == 2) {
                                        if (inputMedia.file == null) {
                                            inputMedia.file = inputFile;
                                            if (inputMedia.thumb != null || (photoSize3 = myVar6.g) == null || photoSize3.location == null) {
                                                azVar.N(myVar6.c, myVar6.m, myVar6.f, null, myVar6.K, null, myVar6.H);
                                                azVar = this;
                                            } else {
                                                azVar.M(myVar6, i32);
                                            }
                                        } else {
                                            inputMedia.thumb = inputFile;
                                            inputMedia.flags |= 4;
                                            azVar = this;
                                            azVar.N(myVar6.c, myVar6.m, myVar6.f, null, myVar6.K, null, myVar6.H);
                                        }
                                    } else if (i31 == 3) {
                                        inputMedia.file = inputFile;
                                        azVar = this;
                                        azVar.N(myVar6.c, myVar6.m, myVar6.f, null, myVar6.K, null, myVar6.H);
                                    } else {
                                        azVar = this;
                                        if (i31 == 4) {
                                            if (!(inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument)) {
                                                str4 = str2;
                                                str3 = str6;
                                                if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                                                    HashMap hashMap7 = myVar6.E;
                                                    if (hashMap7 != null) {
                                                        if (hashMap7.containsKey(str5 + "_doc")) {
                                                            i17 = z10;
                                                            String str15 = i17 == 0 ? (String) myVar6.E.get(str5 + "_doc") : str5;
                                                            gj gjVar10 = (gj) myVar6.E.get(str15 + "_i");
                                                            hashMap = myVar6.E;
                                                            if (hashMap != null) {
                                                                if (hashMap.containsKey(str15 + str3)) {
                                                                    myVar6.g = (TLRPC.PhotoSize) myVar6.E.get(str15 + str3);
                                                                }
                                                            }
                                                            hashMap2 = myVar6.E;
                                                            if (hashMap2 != null) {
                                                                if (hashMap2.containsKey(str15 + str4)) {
                                                                    myVar6.i = (TLRPC.PhotoSize) myVar6.E.get(str15 + str4);
                                                                }
                                                            }
                                                            int indexOf3 = myVar6.x.indexOf(gjVar10);
                                                            if (i17 == 0 && myVar6.j == null && myVar6.i != null) {
                                                                myVar6.j = inputFile;
                                                                myVar6.q = z10;
                                                                azVar.M(myVar6, indexOf3);
                                                            } else if (myVar6.g == null && inputMedia.thumb == null) {
                                                                inputMedia.thumb = inputFile;
                                                                inputMedia.flags |= 4;
                                                                azVar.A0(myVar6, inputMedia, null, (String) myVar6.E.get(str5 + "_o"));
                                                            } else {
                                                                inputMedia.file = inputFile;
                                                                azVar.A0(myVar6, inputMedia, null, str5);
                                                            }
                                                        }
                                                    }
                                                    i17 = i15;
                                                    if (i17 == 0) {
                                                    }
                                                    gj gjVar102 = (gj) myVar6.E.get(str15 + "_i");
                                                    hashMap = myVar6.E;
                                                    if (hashMap != null) {
                                                    }
                                                    hashMap2 = myVar6.E;
                                                    if (hashMap2 != null) {
                                                    }
                                                    int indexOf32 = myVar6.x.indexOf(gjVar102);
                                                    if (i17 == 0) {
                                                    }
                                                    if (myVar6.g == null) {
                                                    }
                                                    inputMedia.file = inputFile;
                                                    azVar.A0(myVar6, inputMedia, null, str5);
                                                } else {
                                                    inputMedia.file = inputFile;
                                                    azVar.A0(myVar6, inputMedia, null, str5);
                                                }
                                            } else if (inputMedia.file == null) {
                                                inputMedia.file = inputFile;
                                                int indexOf4 = myVar6.x.indexOf((gj) myVar6.E.get(str5 + "_i"));
                                                HashMap hashMap8 = myVar6.E;
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append(str5);
                                                str3 = str6;
                                                sb2.append(str3);
                                                if (hashMap8.containsKey(sb2.toString())) {
                                                    myVar6.g = (TLRPC.PhotoSize) myVar6.E.get(str5 + str3);
                                                }
                                                HashMap hashMap9 = myVar6.E;
                                                StringBuilder sb3 = new StringBuilder();
                                                sb3.append(str5);
                                                str4 = str2;
                                                sb3.append(str4);
                                                if (hashMap9.containsKey(sb3.toString())) {
                                                    myVar6.i = (TLRPC.PhotoSize) myVar6.E.get(str5 + str4);
                                                }
                                                if (inputMedia.video_cover == null && (photoSize2 = myVar6.i) != null && photoSize2.location != null) {
                                                    myVar6.q = z10;
                                                    azVar.M(myVar6, indexOf4);
                                                } else if (inputMedia.thumb != null || (photoSize = myVar6.g) == null || photoSize.location == null) {
                                                    azVar.A0(myVar6, inputMedia, null, str5);
                                                } else {
                                                    myVar6.p = z10;
                                                    azVar.M(myVar6, indexOf4);
                                                }
                                            } else {
                                                str4 = str2;
                                                str3 = str6;
                                                String str16 = (String) myVar6.E.get(str5 + "_doc");
                                                gj gjVar11 = (gj) myVar6.E.get(str16 + "_i");
                                                if (myVar6.E.containsKey(str16 + str3)) {
                                                    myVar6.g = (TLRPC.PhotoSize) myVar6.E.get(str16 + str3);
                                                }
                                                if (myVar6.E.containsKey(str16 + str4)) {
                                                    myVar6.i = (TLRPC.PhotoSize) myVar6.E.get(str16 + str4);
                                                }
                                                int indexOf5 = myVar6.x.indexOf(gjVar11);
                                                if (myVar6.j != null || myVar6.i == null) {
                                                    inputMedia.thumb = inputFile;
                                                    inputMedia.flags |= 4;
                                                    azVar.A0(myVar6, inputMedia, null, (String) myVar6.E.get(str5 + "_o"));
                                                } else {
                                                    myVar6.j = inputFile;
                                                    myVar6.q = z10;
                                                    azVar.M(myVar6, indexOf5);
                                                }
                                            }
                                            arrayList2.remove(i30);
                                            i30--;
                                        }
                                    }
                                } else if (inputMedia.file == null && ((photoSize4 = myVar6.i) == null || myVar6.p)) {
                                    inputMedia.file = inputFile;
                                    if (myVar6.j == null && photoSize4 != null) {
                                        azVar.M(myVar6, i32);
                                    } else if (inputMedia.thumb != null || (photoSize5 = myVar6.g) == null || photoSize5.location == null || !((gjVar3 = myVar6.m) == null || (f20Var = gjVar3.r0) == null || !f20Var.N)) {
                                        azVar.N(myVar6.c, myVar6.m, myVar6.f, null, myVar6.K, null, myVar6.H);
                                    } else {
                                        azVar.M(myVar6, i32);
                                    }
                                } else if (myVar6.j != null || myVar6.i == null) {
                                    inputMedia.thumb = inputFile;
                                    c12 = 4;
                                    inputMedia.flags |= 4;
                                    azVar.N(myVar6.c, myVar6.m, myVar6.f, null, myVar6.K, null, myVar6.H);
                                } else {
                                    myVar6.j = inputFile;
                                    myVar6.q = z10;
                                    azVar.M(myVar6, i32);
                                }
                                str4 = str2;
                                str3 = str6;
                                arrayList2.remove(i30);
                                i30--;
                            }
                            str4 = str2;
                            str3 = str6;
                            arrayList2.remove(i30);
                            i30--;
                        }
                        i16 = z10;
                        i30 += i16;
                        str8 = str3;
                        z10 = i16;
                        str2 = str4;
                        inputFile2 = inputFile;
                        str14 = str5;
                        i18 = i15;
                        inputEncryptedFile2 = inputEncryptedFile;
                        i19 = -1;
                    }
                    String str17 = str14;
                    if (arrayList2.isEmpty()) {
                        azVar.a.remove(str17);
                        return;
                    }
                    return;
                }
                return;
            }
            TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport = new TLRPC.TL_messages_initHistoryImport();
            tL_messages_initHistoryImport.file = inputFile2;
            tL_messages_initHistoryImport.media_count = ryVar3.b.size();
            tL_messages_initHistoryImport.peer = ryVar3.g;
            ryVar3.q.getConnectionsManager().sendRequest(tL_messages_initHistoryImport, new oy(ryVar3, tL_messages_initHistoryImport), 2);
        }
        c11 = 5;
        str2 = "_ct";
        vyVar = (vy) azVar.F.get(str14);
        if (vyVar != null) {
        }
        arrayList2 = (ArrayList) azVar.a.get(str14);
        if (arrayList2 == null) {
        }
    }

    public final void e(TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, long j3) {
        if (j3 != 0) {
            TLRPC.InputPeer l1 = getMessagesController().l1(j3);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMultiMedia.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = l1;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMultiMedia.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = l1;
            tL_messages_sendMultiMedia.flags |= 1;
        }
    }

    public final void e0(String str, my myVar) {
        HashMap hashMap = this.a;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
        }
        arrayList.add(myVar);
    }

    public final void f(ArrayList arrayList) {
        HashMap hashMap;
        int i7;
        int i10;
        int i11;
        long j3;
        gj gjVar;
        int i12;
        String G;
        TLRPC.Message message;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        long j10 = 0;
        int i15 = 0;
        boolean z11 = false;
        while (true) {
            int size = arrayList.size();
            hashMap = this.a;
            if (i15 >= size) {
                break;
            }
            gj gjVar2 = (gj) arrayList.get(i15);
            int i16 = gjVar2.r1 ? 1 : i13;
            long B0 = gj.B0(gjVar2.k);
            arrayList4.add(Integer.valueOf(gjVar2.e1()));
            if (gj.b4(gjVar2.k)) {
                i14 = gj.I1(gjVar2.k);
            }
            TLRPC.Message i02 = i0(gjVar2.e1(), gjVar2.r1);
            if (i02 != null) {
                getConnectionsManager().cancelRequest(i02.reqId, true);
            }
            di.y8 y10 = di.y8.y(this.currentAccount, z10);
            di.t8 t8Var = y10.N;
            ArrayList arrayList5 = arrayList4;
            if (t8Var == null || t8Var.b != gj.B0(gjVar2.k)) {
                i11 = i15;
                j3 = B0;
            } else {
                di.t8 t8Var2 = y10.N;
                int e12 = gjVar2.e1();
                di.s8 s8Var = t8Var2.p;
                org.telegram.ui.Components.ac acVar = t8Var2.d;
                i11 = i15;
                HashSet hashSet = t8Var2.k;
                j3 = B0;
                if (!t8Var2.n && !t8Var2.o) {
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            gjVar = null;
                            break;
                        }
                        gjVar = (gj) it.next();
                        Iterator it2 = it;
                        if (gjVar.e1() == e12) {
                            hashSet.remove(gjVar);
                            break;
                        }
                        it = it2;
                    }
                    if (hashSet.isEmpty()) {
                        t8Var2.n = true;
                        t8Var2.c.b();
                        y10.N = null;
                    } else {
                        t8Var2.g--;
                        if (gjVar != null && (message = gjVar.k) != null) {
                            t8Var2.h -= message.paid_message_stars;
                        }
                        di.x8 x8Var = t8Var2.f;
                        if (x8Var != null) {
                            x8Var.b = 3000L;
                            g0.r(s8Var);
                            g0.h3(s8Var, 3000L);
                        }
                        org.telegram.ui.Components.o6 o6Var = acVar.b;
                        int i17 = t8Var2.g;
                        if (i17 == 1) {
                            G = hd.N0(2131747509, null);
                            i12 = 0;
                        } else {
                            i12 = 0;
                            G = hd.G(i17, "PaidMessageSentTitle", new Object[0]);
                        }
                        o6Var.setText(G);
                        acVar.c.setText(g0.W2(hd.H(',', "PaidMessageSentSubtitle", Math.max(i12, (int) t8Var2.h))));
                        acVar.a.d();
                    }
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                ArrayList arrayList6 = (ArrayList) entry.getValue();
                int i18 = 0;
                while (true) {
                    if (i18 < arrayList6.size()) {
                        my myVar = (my) arrayList6.get(i18);
                        if (myVar.e == 4) {
                            gj gjVar3 = null;
                            int i19 = 0;
                            while (true) {
                                if (i19 >= myVar.x.size()) {
                                    i19 = -1;
                                    break;
                                }
                                gjVar3 = (gj) myVar.x.get(i19);
                                if (gjVar3.e1() == gjVar2.e1()) {
                                    j0(gjVar2.e1(), gjVar2.r1);
                                    break;
                                }
                                i19++;
                            }
                            if (i19 >= 0) {
                                myVar.x.remove(i19);
                                myVar.z.remove(i19);
                                myVar.B.remove(i19);
                                if (!myVar.y.isEmpty()) {
                                    myVar.y.remove(i19);
                                }
                                TLObject tLObject = myVar.c;
                                if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                                    ((TLRPC.TL_messages_sendMultiMedia) tLObject).multi_media.remove(i19);
                                } else {
                                    boolean z12 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                                    if (z12) {
                                        TLRPC.InputMedia inputMedia = ((TLRPC.TL_messages_sendMedia) tLObject).media;
                                        if (inputMedia instanceof TLRPC.TL_inputMediaPaidMedia) {
                                            ((TLRPC.TL_inputMediaPaidMedia) inputMedia).extended_media.remove(i19);
                                        }
                                    }
                                    if (z12) {
                                        TLRPC.InputMedia inputMedia2 = ((TLRPC.TL_messages_sendMedia) tLObject).media;
                                        if (inputMedia2 instanceof TLRPC.TL_inputMediaPoll) {
                                            sh.d.i((TLRPC.TL_inputMediaPoll) inputMedia2, ((Integer) myVar.C.get(i19)).intValue());
                                        }
                                    }
                                    boolean z13 = tLObject instanceof TL_ephemeral.TL_sendMessage;
                                    if (z13) {
                                        TLRPC.InputMedia inputMedia3 = ((TL_ephemeral.TL_sendMessage) tLObject).media;
                                        if (inputMedia3 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                            ((TLRPC.TL_inputMediaPaidMedia) inputMedia3).extended_media.remove(i19);
                                        }
                                    }
                                    if (z13) {
                                        TLRPC.InputMedia inputMedia4 = ((TL_ephemeral.TL_sendMessage) tLObject).media;
                                        if (inputMedia4 instanceof TLRPC.TL_inputMediaPoll) {
                                            sh.d.i((TLRPC.TL_inputMediaPoll) inputMedia4, ((Integer) myVar.C.get(i19)).intValue());
                                        }
                                    }
                                    TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) myVar.d;
                                    tL_messages_sendEncryptedMultiMedia.messages.remove(i19);
                                    tL_messages_sendEncryptedMultiMedia.files.remove(i19);
                                }
                                MediaController.B().i(gjVar2);
                                String str = (String) myVar.E.get(gjVar3);
                                if (str != null) {
                                    arrayList2.add(str);
                                }
                                if (myVar.x.isEmpty()) {
                                    myVar.d();
                                } else {
                                    if (myVar.G == gjVar2.e1()) {
                                        gj gjVar4 = (gj) i5.c.h(1, myVar.x);
                                        myVar.G = gjVar4.e1();
                                        gjVar4.k.params.put("final", "1");
                                        TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                        tL_messages_messages.messages.add(gjVar4.k);
                                        getMessagesStorage().h1(-2, 0, i16, myVar.a, 0L, tL_messages_messages, false);
                                    }
                                    if (!arrayList3.contains(myVar)) {
                                        arrayList3.add(myVar);
                                    }
                                }
                            }
                        } else if (myVar.m.e1() == gjVar2.e1()) {
                            j0(gjVar2.e1(), gjVar2.r1);
                            arrayList6.remove(i18);
                            myVar.d();
                            MediaController.B().i(myVar.m);
                            if (arrayList6.size() == 0) {
                                arrayList2.add((String) entry.getKey());
                                if (myVar.d != null) {
                                    z11 = true;
                                }
                            }
                        } else {
                            i18++;
                        }
                    }
                }
            }
            i15 = i11 + 1;
            i13 = i16;
            arrayList4 = arrayList5;
            j10 = j3;
            z10 = false;
        }
        ArrayList arrayList7 = arrayList4;
        for (int i20 = 0; i20 < arrayList2.size(); i20++) {
            String str2 = (String) arrayList2.get(i20);
            if (str2.startsWith("http")) {
                fc.D().g(str2);
            } else {
                getFileLoader().b(str2, z11);
            }
            hashMap.remove(str2);
        }
        int size2 = arrayList3.size();
        for (int i21 = 0; i21 < size2; i21++) {
            t0((my) arrayList3.get(i21), false);
        }
        if (arrayList.size() == 1 && ((gj) arrayList.get(0)).Y2() && ((gj) arrayList.get(0)).D1 != null) {
            l0((gj) arrayList.get(0));
            return;
        }
        if (arrayList.size() == 1 && ((gj) arrayList.get(0)).Y2() && ((gj) arrayList.get(0)).T3()) {
            return;
        }
        if (!arrayList.isEmpty() && gj.d5(((gj) arrayList.get(0)).k)) {
            i10 = 9;
        } else {
            if (arrayList.isEmpty() || !gj.b4(((gj) arrayList.get(0)).k)) {
                i7 = i13 != 0 ? 1 : 0;
                getMessagesController().Z(arrayList7, null, null, j10, i14, false, i7);
            }
            i10 = 5;
        }
        i7 = i10;
        getMessagesController().Z(arrayList7, null, null, j10, i14, false, i7);
    }

    public final void f0(TLRPC.Message message, boolean z10) {
        if (Thread.currentThread() != t0.d.getLooper().getThread()) {
            g0.g3(new mw(this, message, z10, 2));
        } else {
            g0(message, z10);
        }
    }

    public final void g(gj gjVar) {
        ArrayList i7 = f3.i(gjVar);
        if (gjVar != null && gjVar.D == 29) {
            Iterator it = this.a.entrySet().iterator();
            my myVar = null;
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) ((Map.Entry) it.next()).getValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    my myVar2 = (my) arrayList.get(i10);
                    if (myVar2.e == 4) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= myVar2.x.size()) {
                                break;
                            }
                            if (((gj) myVar2.x.get(i11)).e1() == gjVar.e1()) {
                                myVar = myVar2;
                                break;
                            }
                            i11++;
                        }
                    }
                    if (myVar != null) {
                        break;
                    }
                }
            }
            if (myVar != null) {
                i7.clear();
                i7.addAll(myVar.x);
            }
        }
        f(i7);
    }

    public final void g0(TLRPC.Message message, boolean z10) {
        if (message == null) {
            return;
        }
        int i7 = message.id;
        if (i7 > 0) {
            this.d.put(i7, message);
            return;
        }
        SparseArray sparseArray = this.c;
        boolean z11 = sparseArray.indexOfKey(i7) >= 0;
        j0(message.id, z10);
        sparseArray.put(message.id, message);
        if (z10 || z11 || gj.c3(message)) {
            return;
        }
        long B0 = gj.B0(message);
        a0.h hVar = this.f;
        hVar.k(Integer.valueOf(((Integer) hVar.g(0, B0)).intValue() + 1), B0);
        getNotificationCenter().k(ls.n1, new Object[0]);
    }

    public final void h0(gj gjVar) {
        if (gjVar == null || gjVar.e1() > 0 || gjVar.r1) {
            return;
        }
        TLRPC.Message message = gjVar.k;
        int i7 = message.id;
        SparseArray sparseArray = this.e;
        boolean z10 = sparseArray.indexOfKey(i7) >= 0;
        sparseArray.put(message.id, message);
        if (z10 || gj.c3(message)) {
            return;
        }
        long B0 = gj.B0(message);
        a0.h hVar = this.h;
        hVar.k(Integer.valueOf(((Integer) hVar.g(0, B0)).intValue() + 1), B0);
        getNotificationCenter().k(ls.n1, new Object[0]);
    }

    public final TLRPC.Message i0(int i7, boolean z10) {
        if (i7 > 0) {
            SparseArray sparseArray = this.d;
            TLRPC.Message message = (TLRPC.Message) sparseArray.get(i7);
            if (message != null) {
                sparseArray.remove(i7);
            }
            return message;
        }
        SparseArray sparseArray2 = this.c;
        TLRPC.Message message2 = (TLRPC.Message) sparseArray2.get(i7);
        if (message2 != null) {
            sparseArray2.remove(i7);
            if (!z10) {
                long B0 = gj.B0(message2);
                a0.h hVar = this.f;
                Integer num = (Integer) hVar.f(B0);
                if (num != null) {
                    int intValue = num.intValue() - 1;
                    if (intValue <= 0) {
                        hVar.l(B0);
                    } else {
                        hVar.k(Integer.valueOf(intValue), B0);
                    }
                    getNotificationCenter().k(ls.n1, new Object[0]);
                }
            }
        }
        return message2;
    }

    public final void j0(int i7, boolean z10) {
        if (i7 > 0 || z10) {
            return;
        }
        SparseArray sparseArray = this.e;
        TLRPC.Message message = (TLRPC.Message) sparseArray.get(i7);
        if (message != null) {
            sparseArray.remove(i7);
            long B0 = gj.B0(message);
            a0.h hVar = this.h;
            Integer num = (Integer) hVar.f(B0);
            if (num != null) {
                int intValue = num.intValue() - 1;
                if (intValue <= 0) {
                    hVar.l(B0);
                } else {
                    hVar.k(Integer.valueOf(intValue), B0);
                }
                getNotificationCenter().k(ls.n1, new Object[0]);
            }
        }
    }

    public final void k(gj gjVar, TLRPC.Updates updates, boolean z10) {
        int i7;
        if (gjVar == null) {
            return;
        }
        long B0 = gj.B0(gjVar.k);
        long j3 = gjVar.k.random_id;
        char c10 = 1;
        TLRPC.Message message = null;
        if (updates != null) {
            ArrayList<TLRPC.Update> arrayList = updates.updates;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i7 = 0;
                    break;
                }
                TLRPC.Update update = arrayList.get(i10);
                i10++;
                TLRPC.Update update2 = update;
                if (update2 instanceof TL_update.TL_updateMessageID) {
                    TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update2;
                    if (tL_updateMessageID.random_id == j3) {
                        i7 = tL_updateMessageID.id;
                        break;
                    }
                }
            }
            for (int i11 = 0; i11 < updates.updates.size(); i11++) {
                TLRPC.Update update3 = updates.updates.get(i11);
                if (update3 instanceof TL_update.TL_updateNewMessage) {
                    TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update3;
                    TLRPC.Message message2 = tL_updateNewMessage.message;
                    if ((message2.action instanceof TLRPC.TL_messageActionGramTransfer) && message2.out && n5.o(message2.peer_id) == B0 && (i7 == 0 || message2.id == i7)) {
                        updates.updates.remove(i11);
                        Utilities.d.c(new cy(this, tL_updateNewMessage, c10 == true ? 1 : 0));
                        message = message2;
                        break;
                    }
                }
            }
            if (message != null) {
                for (int size2 = updates.updates.size() - 1; size2 >= 0; size2--) {
                    TLRPC.Update update4 = updates.updates.get(size2);
                    if ((update4 instanceof TL_update.TL_updateMessageID) && ((TL_update.TL_updateMessageID) update4).random_id == j3) {
                        updates.updates.remove(size2);
                    }
                }
            }
        } else {
            i7 = 0;
        }
        TLRPC.Message message3 = message;
        int i12 = gjVar.k.local_id;
        if (i12 >= 0) {
            i12 = gjVar.e1();
        }
        int i13 = i12;
        if (message3 != null) {
            message3.dialog_id = B0;
            message3.local_id = 0;
            message3.send_state = 0;
            Integer num = (Integer) getMessagesController().Q.get(Long.valueOf(B0));
            if (num == null) {
                num = Integer.valueOf(getMessagesStorage().U(B0, true));
                getMessagesController().Q.put(Long.valueOf(B0), num);
            }
            message3.unread = num.intValue() < message3.id;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(message3);
            getMessagesStorage().a.c(new km(this, j3, B0, i13, message3, arrayList2, gjVar));
            return;
        }
        if (gjVar.e1() > 0) {
            d0(i13);
            i0(i13, false);
            return;
        }
        if (z10 || i7 != 0) {
            ur messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new cq(messagesStorage, j3, B0, Integer.valueOf(i13), i13, gjVar.k.date));
            gjVar.k.send_state = 0;
            gjVar.M1 = true;
            getNotificationCenter().k(ls.J, Integer.valueOf(i13));
        } else {
            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
            tL_messageService.id = i13;
            tL_messageService.dialog_id = B0;
            getMessagesStorage().N0(0, tL_messageService);
            gjVar.k.send_state = 2;
            gjVar.M1 = true;
            getNotificationCenter().k(ls.M, Integer.valueOf(i13));
        }
        d0(i13);
        i0(i13, false);
    }

    public final boolean k0(long j3, gj gjVar, boolean z10) {
        if (gjVar.e1() < 0) {
            TLRPC.Message message = gjVar.k;
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionGramTransfer)) {
                boolean z11 = messageAction instanceof TLRPC.TL_messageEncryptedAction;
                int i7 = ls.s;
                if (z11) {
                    TLRPC.EncryptedChat c12 = getMessagesController().c1(Integer.valueOf((int) (gj.B0(message) & 4294967295L)));
                    if (c12 == null) {
                        getMessagesStorage().N0(gjVar.r1 ? 1 : 0, gjVar.k);
                        gjVar.k.send_state = 2;
                        getNotificationCenter().k(ls.M, Integer.valueOf(gjVar.e1()));
                        d0(gjVar.e1());
                        return false;
                    }
                    TLRPC.Message message2 = gjVar.k;
                    if (message2.random_id == 0) {
                        message2.random_id = E();
                    }
                    TLRPC.DecryptedMessageAction decryptedMessageAction = gjVar.k.action.encryptedAction;
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) {
                        getSecretChatHelper().z(c12, gjVar.k);
                        return true;
                    }
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionDeleteMessages) {
                        getSecretChatHelper().t(c12, null, gjVar.k);
                        return true;
                    }
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionFlushHistory) {
                        getSecretChatHelper().r(c12, gjVar.k);
                        return true;
                    }
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNotifyLayer) {
                        getSecretChatHelper().w(c12, gjVar.k);
                        return true;
                    }
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionReadMessages) {
                        getSecretChatHelper().u(c12, null, gjVar.k);
                        return true;
                    }
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) {
                        yv secretChatHelper = getSecretChatHelper();
                        TLRPC.Message message3 = gjVar.k;
                        secretChatHelper.getClass();
                        if (c12 instanceof TLRPC.TL_encryptedChat) {
                            TLRPC.DecryptedMessage tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
                            if (message3 != null) {
                                tL_decryptedMessageService.action = message3.action.encryptedAction;
                            } else {
                                TLRPC.DecryptedMessageAction tL_decryptedMessageActionScreenshotMessages = new TLRPC.TL_decryptedMessageActionScreenshotMessages();
                                tL_decryptedMessageService.action = tL_decryptedMessageActionScreenshotMessages;
                                tL_decryptedMessageActionScreenshotMessages.random_ids = null;
                                message3 = secretChatHelper.d(c12, tL_decryptedMessageActionScreenshotMessages);
                                gj gjVar2 = new gj(secretChatHelper.currentAccount, message3, false, false);
                                gjVar2.k.send_state = 1;
                                gjVar2.X1 = true;
                                secretChatHelper.getMessagesController().x5(0, message3.dialog_id, f3.i(gjVar2));
                                secretChatHelper.getNotificationCenter().k(i7, new Object[0]);
                            }
                            TLRPC.Message message4 = message3;
                            tL_decryptedMessageService.random_id = message4.random_id;
                            secretChatHelper.j(tL_decryptedMessageService, message4, c12, null, null, null);
                            return true;
                        }
                    } else if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionTyping)) {
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionResend) {
                            getSecretChatHelper().y(c12, 0, 0, gjVar.k);
                            return true;
                        }
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionCommitKey) {
                            getSecretChatHelper().s(c12, gjVar.k);
                            return true;
                        }
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAbortKey) {
                            getSecretChatHelper().p(c12, gjVar.k, 0L);
                            return true;
                        }
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionRequestKey) {
                            getSecretChatHelper().x(c12, gjVar.k);
                            return true;
                        }
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAcceptKey) {
                            getSecretChatHelper().q(c12, gjVar.k);
                            return true;
                        }
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNoop) {
                            getSecretChatHelper().v(c12, gjVar.k);
                        }
                    }
                    return true;
                }
                if (messageAction instanceof TLRPC.TL_messageActionScreenshotTaken) {
                    TLRPC.User c22 = getMessagesController().c2(Long.valueOf(gj.B0(gjVar.k)));
                    int N1 = gjVar.N1();
                    TLRPC.Message message5 = gjVar.k;
                    if (c22 != null && N1 != 0 && c22.id != getUserConfig().e()) {
                        TLRPC.TL_messages_sendScreenshotNotification tL_messages_sendScreenshotNotification = new TLRPC.TL_messages_sendScreenshotNotification();
                        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                        tL_messages_sendScreenshotNotification.peer = tL_inputPeerUser;
                        tL_inputPeerUser.access_hash = c22.access_hash;
                        tL_inputPeerUser.user_id = c22.id;
                        if (message5 != null) {
                            TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                            tL_inputReplyToMessage.reply_to_msg_id = N1;
                            tL_messages_sendScreenshotNotification.reply_to = tL_inputReplyToMessage;
                            tL_messages_sendScreenshotNotification.random_id = message5.random_id;
                        } else {
                            message5 = new TLRPC.TL_messageService();
                            message5.random_id = E();
                            message5.dialog_id = c22.id;
                            message5.unread = true;
                            message5.out = true;
                            int j10 = getUserConfig().j();
                            message5.id = j10;
                            message5.local_id = j10;
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            message5.from_id = tL_peerUser;
                            tL_peerUser.user_id = getUserConfig().e();
                            message5.flags |= ls.n4;
                            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                            message5.reply_to = tL_messageReplyHeader;
                            tL_messageReplyHeader.flags |= 16;
                            tL_messageReplyHeader.reply_to_msg_id = N1;
                            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                            message5.peer_id = tL_peerUser2;
                            tL_peerUser2.user_id = c22.id;
                            message5.date = getConnectionsManager().getCurrentTime();
                            message5.action = new TLRPC.TL_messageActionScreenshotTaken();
                            getUserConfig().v(false);
                        }
                        tL_messages_sendScreenshotNotification.random_id = message5.random_id;
                        gj gjVar3 = new gj(this.currentAccount, message5, false, true);
                        gjVar3.k.send_state = 1;
                        gjVar3.X1 = true;
                        getMessagesController().x5(0, message5.dialog_id, f3.i(gjVar3));
                        getNotificationCenter().k(i7, new Object[0]);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(message5);
                        getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
                        N(tL_messages_sendScreenshotNotification, gjVar3, null, null, null, null, false);
                    }
                }
                if (z10) {
                    this.b.put(gjVar.e1(), gjVar);
                }
                long B0 = gj.B0(gjVar.k);
                TLRPC.Message message6 = gjVar.k;
                yy c10 = yy.c(null, null, null, null, null, null, null, null, null, null, B0, message6.attachPath, null, null, null, true, gjVar, null, message6.reply_markup, message6.params, !message6.silent, gjVar.r1 ? message6.date : 0, 0, 0, null, null, false, false);
                TLRPC.Message message7 = gjVar.k;
                if (message7 != null) {
                    TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message7.quick_reply_shortcut;
                    if (inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcut) {
                        c10.M = ((TLRPC.TL_inputQuickReplyShortcut) inputQuickReplyShortcut).shortcut;
                    }
                    c10.N = gj.I1(message7);
                    c10.Q = gjVar.k.paid_message_stars;
                }
                TLRPC.Message message8 = gjVar.k;
                c10.X = message8 != null ? message8.ephemeralReceiverBotId : 0L;
                c10.Q = j3;
                r0(c10);
                return true;
            }
            if (z10) {
                k(gjVar, null, false);
            }
        } else if (gjVar.Y2()) {
            t(gjVar, null, null, null, null, null, null, null, true, gjVar.t2(), gjVar);
            return false;
        }
        return false;
    }

    public final void l0(gj gjVar) {
        gjVar.q1 = true;
        TLRPC.Message message = gjVar.k;
        message.media = gjVar.D1;
        message.message = gjVar.C1;
        ArrayList<TLRPC.MessageEntity> arrayList = gjVar.F1;
        message.entities = arrayList;
        message.attachPath = gjVar.G1;
        message.send_state = 0;
        if (arrayList != null) {
            message.flags |= 128;
        } else {
            message.flags &= -129;
        }
        gjVar.D1 = null;
        gjVar.C1 = null;
        gjVar.F1 = null;
        gjVar.G1 = null;
        gjVar.r0 = null;
        gjVar.D = -1;
        gjVar.L5();
        gjVar.z = null;
        if (gjVar.D != 0) {
            gjVar.k0();
        } else {
            gjVar.S1 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(gjVar.k);
        getMessagesStorage().j1(arrayList2, false, true, false, 0, false, gjVar.r1 ? 1 : 0, 0L);
        getNotificationCenter().k(ls.m0, Long.valueOf(gj.B0(gjVar.k)), f3.i(gjVar));
    }

    public final void n0(boolean z10, gj gjVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, org.telegram.ui.bn bnVar) {
        boolean z11;
        int i7;
        if (gjVar == null || keyboardButtonProto == null || bnVar == null) {
            return;
        }
        if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
            i7 = 3;
            z11 = false;
        } else if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
            z11 = false;
            i7 = 1;
        } else if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
            z11 = z10;
            i7 = 2;
        } else {
            z11 = z10;
            i7 = 0;
        }
        String str = gj.B0(gjVar.k) + "_" + gjVar.e1() + "_" + Utilities.f(keyboardButtonProto.getData()) + "_" + i7;
        this.r.put(str, Boolean.TRUE);
        String str2 = gj.B0(gjVar.k) + "_" + gjVar.e1();
        HashMap hashMap = this.s;
        List list = (List) hashMap.get(str2);
        if (list == null) {
            String str3 = gj.B0(gjVar.k) + "_" + gjVar.e1();
            ArrayList arrayList = new ArrayList();
            hashMap.put(str3, arrayList);
            list = arrayList;
        }
        list.add(str);
        TLObject[] tLObjectArr = new TLObject[1];
        ix ixVar = new ix(this, str, list, z11, gjVar, keyboardButtonProto, bnVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10);
        if (z11) {
            getMessagesStorage().M(str, ixVar);
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrlAuth tL_inlineButtonTypeUrlAuth = (TL_keyboard.TL_inlineButtonTypeUrlAuth) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class);
        if (tL_inlineButtonTypeUrlAuth != null) {
            TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
            tL_messages_requestUrlAuth.peer = getMessagesController().l1(gj.B0(gjVar.k));
            tL_messages_requestUrlAuth.msg_id = gjVar.e1();
            tL_messages_requestUrlAuth.button_id = tL_inlineButtonTypeUrlAuth.button_id;
            tL_messages_requestUrlAuth.flags |= 2;
            tLObjectArr[0] = tL_messages_requestUrlAuth;
            getConnectionsManager().sendRequest(tL_messages_requestUrlAuth, ixVar, 2);
            return;
        }
        if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
            if ((gjVar.k.media.flags & 4) != 0) {
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = gjVar.k.media.receipt_msg_id;
                tL_payments_getPaymentReceipt.peer = getMessagesController().o1(gjVar.k.peer_id);
                tLObjectArr[0] = tL_payments_getPaymentReceipt;
                getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, ixVar, 2);
                return;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.msg_id = gjVar.e1();
            tL_inputInvoiceMessage.peer = getMessagesController().o1(gjVar.k.peer_id);
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
            JSONObject u10 = ki.s2.u(null, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tLObjectArr[0] = tL_payments_getPaymentForm;
            getConnectionsManager().sendRequest(tL_payments_getPaymentForm, ixVar, 2);
            return;
        }
        if (gj.c3(gjVar.k)) {
            TL_ephemeral.TL_getCallbackAnswer tL_getCallbackAnswer = new TL_ephemeral.TL_getCallbackAnswer();
            tL_getCallbackAnswer.peer = getMessagesController().l1(gj.B0(gjVar.k));
            tL_getCallbackAnswer.id = gjVar.P0();
            tL_getCallbackAnswer.data = keyboardButtonProto.getData();
            getConnectionsManager().sendRequest(tL_getCallbackAnswer, ixVar, 2);
            return;
        }
        TLRPC.TL_messages_getBotCallbackAnswer tL_messages_getBotCallbackAnswer = new TLRPC.TL_messages_getBotCallbackAnswer();
        tL_messages_getBotCallbackAnswer.peer = getMessagesController().l1(gj.B0(gjVar.k));
        tL_messages_getBotCallbackAnswer.msg_id = gjVar.e1();
        tL_messages_getBotCallbackAnswer.game = cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class);
        TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class);
        if (tL_inlineButtonTypeCallback != null && tL_inlineButtonTypeCallback.requires_password) {
            tL_messages_getBotCallbackAnswer.password = inputCheckPasswordSRP != null ? inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
            tL_messages_getBotCallbackAnswer.flags |= 4;
        }
        if (keyboardButtonProto.getData() != null) {
            tL_messages_getBotCallbackAnswer.flags |= 1;
            tL_messages_getBotCallbackAnswer.data = keyboardButtonProto.getData();
        }
        getConnectionsManager().sendRequest(tL_messages_getBotCallbackAnswer, ixVar, 2);
    }

    public final TLRPC.TL_inputReplyToMessage o(TLRPC.TL_messageReplyHeader tL_messageReplyHeader) {
        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
        tL_inputReplyToMessage.reply_to_msg_id = tL_messageReplyHeader.reply_to_msg_id;
        int i7 = tL_messageReplyHeader.flags;
        if ((i7 & 2) != 0) {
            tL_inputReplyToMessage.flags |= 1;
            tL_inputReplyToMessage.top_msg_id = tL_messageReplyHeader.reply_to_top_id;
        }
        if ((i7 & 1) != 0) {
            tL_inputReplyToMessage.flags |= 2;
            tL_inputReplyToMessage.reply_to_peer_id = np.u1(this.currentAccount).o1(tL_messageReplyHeader.reply_to_peer_id);
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

    public final void o0(gj gjVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        if (gjVar == null || keyboardButtonProto == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(gj.B0(gjVar.k));
        sb2.append("_");
        sb2.append(gjVar.e1());
        sb2.append("_");
        sb2.append(Utilities.f(keyboardButtonProto.getData()));
        sb2.append("_");
        sb2.append(cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) ? "1" : "0");
        this.n.put(sb2.toString(), gjVar);
        this.H.o();
    }

    public final TLRPC.TL_inputReplyToStory p(TL_stories.StoryItem storyItem) {
        TLRPC.TL_inputReplyToStory tL_inputReplyToStory = new TLRPC.TL_inputReplyToStory();
        tL_inputReplyToStory.story_id = storyItem.id;
        tL_inputReplyToStory.peer = getMessagesController().l1(storyItem.dialogId);
        return tL_inputReplyToStory;
    }

    public final void p0(TLRPC.InputPeer inputPeer, TLRPC.TL_inputMediaGame tL_inputMediaGame, long j3, long j10) {
        NativeByteBuffer nativeByteBuffer;
        if (inputPeer == null || tL_inputMediaGame == null) {
            return;
        }
        TLRPC.TL_messages_sendMedia tL_messages_sendMedia = new TLRPC.TL_messages_sendMedia();
        tL_messages_sendMedia.peer = inputPeer;
        if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
            tL_messages_sendMedia.silent = np.u1(this.currentAccount).g7.getBoolean("silent_" + (-inputPeer.channel_id), false);
        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
            tL_messages_sendMedia.silent = np.u1(this.currentAccount).g7.getBoolean("silent_" + (-inputPeer.chat_id), false);
        } else {
            tL_messages_sendMedia.silent = np.u1(this.currentAccount).g7.getBoolean("silent_" + inputPeer.user_id, false);
        }
        tL_messages_sendMedia.random_id = j3 != 0 ? j3 : E();
        tL_messages_sendMedia.message = "";
        tL_messages_sendMedia.media = tL_inputMediaGame;
        long M = v3.M(getMessagesController().O0(Long.valueOf(inputPeer.chat_id)), getMessagesController().P0(inputPeer.chat_id), false);
        if (M != k10.i(this.currentAccount).e()) {
            tL_messages_sendMedia.send_as = getMessagesController().l1(M);
        }
        long P1 = getMessagesController().P1(n5.n(inputPeer));
        if (P1 <= 0) {
            P1 = n5.k(getMessagesController().P2(n5.n(inputPeer)));
        }
        if (P1 > 0) {
            tL_messages_sendMedia.flags |= TLObject.FLAG_21;
            tL_messages_sendMedia.allow_paid_stars = P1;
        }
        if (j10 == 0) {
            NativeByteBuffer nativeByteBuffer2 = null;
            try {
                nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + tL_inputMediaGame.getObjectSize() + 12);
            } catch (Exception e10) {
                e = e10;
            }
            try {
                nativeByteBuffer.writeInt32(3);
                nativeByteBuffer.writeInt64(j3);
                inputPeer.serializeToStream(nativeByteBuffer);
                tL_inputMediaGame.serializeToStream(nativeByteBuffer);
            } catch (Exception e11) {
                e = e11;
                nativeByteBuffer2 = nativeByteBuffer;
                a8.g(e, true);
                nativeByteBuffer = nativeByteBuffer2;
                j10 = getMessagesStorage().z(nativeByteBuffer);
                getConnectionsManager().sendRequest(tL_messages_sendMedia, new x4(this, j10, 4));
            }
            j10 = getMessagesStorage().z(nativeByteBuffer);
        }
        getConnectionsManager().sendRequest(tL_messages_sendMedia, new x4(this, j10, 4));
    }

    public final gj q(TLRPC.User user, String str, long j3, String str2, boolean z10, boolean z11, long j10) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        int j11 = getUserConfig().j();
        tL_messageService.id = j11;
        tL_messageService.local_id = j11;
        tL_messageService.random_id = j10;
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
        tL_messageActionGramTransfer.amount = j3;
        tL_messageActionGramTransfer.peer_address = str;
        tL_messageActionGramTransfer.transaction_id = "";
        tL_messageActionGramTransfer.comment = str2;
        tL_messageActionGramTransfer.comment_encrypted = z10;
        tL_messageActionGramTransfer.comment_encrypted_preparing = z11;
        tL_messageService.action = tL_messageActionGramTransfer;
        getUserConfig().v(false);
        gj gjVar = new gj(this.currentAccount, tL_messageService, false, true);
        gjVar.X1 = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_messageService);
        getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
        getMessagesController().x5(0, user.id, f3.i(gjVar));
        getNotificationCenter().k(ls.s, new Object[0]);
        f0(tL_messageService, false);
        return gjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:253:0x08a3, code lost:
    
        if (r12.contains(java.lang.Integer.valueOf(r1.reply_to_msg_id)) != false) goto L376;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x077d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0824 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0879 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x095c  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0988 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x09c1  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0a28  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0a4b  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0a63  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0a73  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0a93  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0ad9  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0af3  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0aff  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0b19  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0b3d  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0b80  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0b8b  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0b40  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0b15  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0abd  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0a89  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0a2a  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0a15  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0842 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int q0(final ArrayList arrayList, long j3, final boolean z10, final boolean z11, final boolean z12, final int i7, final int i10, final gj gjVar, final int i11, long j10, final long j11, final lj ljVar) {
        TLRPC.UserFull d2;
        TLRPC.Chat O0;
        long j12;
        boolean z13;
        boolean z14;
        long j13;
        String str;
        boolean s5;
        boolean v;
        boolean o4;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        String str2;
        long j14;
        boolean z21;
        boolean z22;
        ArrayList<Integer> arrayList2;
        long j15;
        long j16;
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
        int i12;
        int i13;
        int i14;
        TLRPC.TL_message tL_message;
        ArrayList<Long> arrayList6;
        a0.h hVar3;
        int i15;
        ArrayList<Integer> arrayList7;
        TLRPC.User c22;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer2;
        TLRPC.MessageMedia messageMedia;
        long j17;
        TL_iv.RichMessage richMessage;
        TLRPC.ReplyMarkup replyMarkup;
        long j18;
        long j19;
        long M;
        a0.h hVar4;
        ArrayList<Integer> arrayList8;
        boolean z24;
        boolean z25;
        a0.h hVar5;
        TLRPC.Message message;
        int i16;
        int i17;
        ArrayList arrayList9;
        ArrayList arrayList10;
        TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages;
        ArrayList arrayList11;
        ul ulVar;
        az azVar;
        TLRPC.Message message2;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.Peer peer3;
        TLRPC.MessageReplyHeader messageReplyHeader2;
        int i18;
        int i19;
        TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        long o10;
        int i20;
        int i21;
        final az azVar2 = this;
        final long j20 = j3;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }
        long e10 = azVar2.getUserConfig().e();
        if (n5.C(j20)) {
            long j21 = j11;
            lj ljVar2 = ljVar;
            long j22 = azVar2.getMessagesController().c1(Integer.valueOf((int) j20)).user_id;
            boolean z26 = (!n5.E(j22) || azVar2.getMessagesController().c2(Long.valueOf(j22)) == null || (d2 = azVar2.getMessagesController().d2(j22)) == null) ? true : !d2.voice_messages_forbidden;
            int i22 = 0;
            for (int i23 = 0; i23 < arrayList.size(); i23++) {
                gj gjVar2 = (gj) arrayList.get(i23);
                if (z26 || !gj.R4(gjVar2.k)) {
                    if (!z26 && gj.j4(gjVar2.k) && i22 == 0) {
                        i22 = 8;
                    }
                } else if (i22 == 0) {
                    i22 = 7;
                }
            }
            if (i22 == 0) {
                int i24 = 0;
                while (i24 < arrayList.size()) {
                    azVar2.c0((gj) arrayList.get(i24), j20, j10, j21, ljVar2);
                    i24++;
                    azVar2 = this;
                    j20 = j3;
                    j21 = j11;
                    ljVar2 = ljVar;
                }
            }
            return i22;
        }
        TLRPC.Peer B1 = azVar2.getMessagesController().B1(j20);
        long P1 = azVar2.getMessagesController().P1(j20);
        if (P1 <= 0) {
            P1 = n5.k(azVar2.getMessagesController().P2(j20));
        }
        if (P1 != j10) {
            org.telegram.ui.Components.c5.X(azVar2.currentAccount, Math.max(1, arrayList.size()), j20, new y10() { // from class: org.telegram.messenger.lx
                @Override // org.telegram.messenger.y10
                public final void a(Object obj) {
                    az azVar3 = az.this;
                    azVar3.getClass();
                    azVar3.q0(arrayList, j20, z10, z11, z12, i7, i10, gjVar, i11, ((Long) obj).longValue(), j11, ljVar);
                }
            });
            return 0;
        }
        ArrayList arrayList12 = arrayList;
        int i25 = 0;
        int i26 = 1;
        if (!n5.E(j20)) {
            O0 = getMessagesController().O0(Long.valueOf(-j20));
            if (v3.T(O0)) {
                boolean z27 = O0.signatures;
                boolean z28 = O0.megagroup;
                z13 = !z28;
                if (z28 || !O0.has_link) {
                    z14 = z27;
                } else {
                    z14 = z27;
                    TLRPC.ChatFull P0 = getMessagesController().P0(O0.id);
                    if (P0 != null) {
                        j12 = P0.linked_chat_id;
                    }
                }
                j12 = 0;
            } else {
                j12 = 0;
                z13 = false;
                z14 = false;
            }
            if (O0 != null) {
                j13 = j12;
                str = getMessagesController().E0(O0.id, e10);
            } else {
                j13 = j12;
                str = null;
            }
            boolean t6 = v3.t(O0);
            boolean p10 = v3.p(O0);
            boolean u10 = v3.u(O0);
            boolean l10 = v3.l(O0);
            boolean m10 = v3.m(O0);
            boolean r10 = v3.r(O0);
            s5 = v3.s(O0);
            v = v3.v(O0);
            o4 = v3.o(O0);
            z15 = r10;
            z16 = m10;
            z17 = l10;
            z18 = u10;
            z19 = z14;
            z20 = t6;
            str2 = str;
            j14 = j13;
            z21 = p10;
            z22 = z13;
        } else {
            if (getMessagesController().c2(Long.valueOf(j20)) == null) {
                return 0;
            }
            boolean z29 = getMessagesController().d2(j20) != null ? !r6.voice_messages_forbidden : true;
            v = z29;
            s5 = z29;
            j14 = 0;
            z22 = false;
            z19 = false;
            z20 = true;
            z21 = true;
            z18 = true;
            z17 = true;
            z16 = true;
            z15 = true;
            o4 = true;
            O0 = null;
            str2 = null;
        }
        a0.h hVar6 = new a0.h();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList<Long> arrayList15 = new ArrayList<>();
        ArrayList<Integer> arrayList16 = new ArrayList<>();
        a0.h hVar7 = new a0.h();
        TLRPC.InputPeer l1 = getMessagesController().l1(j20);
        boolean z30 = j20 == e10;
        int i27 = 0;
        ArrayList arrayList17 = arrayList14;
        ArrayList<Long> arrayList18 = arrayList15;
        ArrayList<Integer> arrayList19 = arrayList16;
        a0.h hVar8 = hVar7;
        TLRPC.InputPeer inputPeer2 = l1;
        int i28 = 0;
        ArrayList arrayList20 = arrayList13;
        boolean z31 = false;
        while (i27 < arrayList12.size()) {
            gj gjVar3 = (gj) arrayList12.get(i27);
            if (gjVar3.e1() <= 0 || gjVar3.m5()) {
                arrayList2 = arrayList19;
                j15 = e10;
                j16 = j14;
                peer = B1;
                str3 = str2;
                hVar = hVar8;
                inputPeer = inputPeer2;
                z23 = z30;
                arrayList3 = arrayList17;
                chat = O0;
                arrayList4 = arrayList18;
                arrayList5 = arrayList20;
                hVar2 = hVar6;
                if (gjVar3.D != 0 || TextUtils.isEmpty(gjVar3.v)) {
                    i12 = i27;
                    arrayList18 = arrayList4;
                    hVar8 = hVar;
                    arrayList17 = arrayList3;
                } else {
                    TLRPC.MessageMedia messageMedia2 = gjVar3.k.media;
                    TLRPC.WebPage webPage = messageMedia2 != null ? messageMedia2.webpage : null;
                    i12 = i27;
                    yy b10 = yy.b(gjVar3.v.toString(), j3, null, gjVar, webPage, webPage != null ? i26 : 0, gjVar3.k.entities, null, null, z12, i7, i10, null, false);
                    b10.T = ljVar;
                    b10.R = j11;
                    b10.M = gj.J1(gjVar3.k);
                    b10.N = gj.I1(gjVar3.k);
                    r0(b10);
                    arrayList18 = arrayList4;
                    hVar8 = hVar;
                    arrayList17 = arrayList3;
                }
            } else {
                if (gjVar3.t4() || gjVar3.J2()) {
                    i13 = i27;
                } else {
                    i13 = i27;
                    if (!gj.t3(gjVar3.k) && !(gj.n1(gjVar3.k) instanceof TLRPC.TL_messageMediaGame)) {
                        i14 = i25;
                        if (!z20 || i14 == 0) {
                            if (!z21) {
                                TLRPC.Message message3 = gjVar3.k;
                                if ((message3.media instanceof TLRPC.TL_messageMediaPhoto) && !gj.L4(message3) && i14 == 0) {
                                    if (i28 == 0) {
                                        i20 = v3.P(16, O0) ? 10 : 12;
                                        arrayList2 = arrayList19;
                                        j15 = e10;
                                        j16 = j14;
                                        peer = B1;
                                        str3 = str2;
                                        i28 = i20;
                                        i12 = i13;
                                        z23 = z30;
                                        arrayList5 = arrayList20;
                                        inputPeer = inputPeer2;
                                        chat = O0;
                                        hVar2 = hVar6;
                                    }
                                    arrayList2 = arrayList19;
                                    j15 = e10;
                                    j16 = j14;
                                    peer = B1;
                                    str3 = str2;
                                    hVar = hVar8;
                                    i12 = i13;
                                    z23 = z30;
                                    arrayList3 = arrayList17;
                                    arrayList4 = arrayList18;
                                    arrayList5 = arrayList20;
                                    inputPeer = inputPeer2;
                                    chat = O0;
                                    hVar2 = hVar6;
                                    arrayList18 = arrayList4;
                                    hVar8 = hVar;
                                    arrayList17 = arrayList3;
                                }
                            }
                            if (o4 && gjVar3.I3()) {
                                if (i28 == 0) {
                                    i20 = v3.P(18, O0) ? 19 : 20;
                                    arrayList2 = arrayList19;
                                    j15 = e10;
                                    j16 = j14;
                                    peer = B1;
                                    str3 = str2;
                                    i28 = i20;
                                    i12 = i13;
                                    z23 = z30;
                                    arrayList5 = arrayList20;
                                    inputPeer = inputPeer2;
                                    chat = O0;
                                    hVar2 = hVar6;
                                }
                                arrayList2 = arrayList19;
                                j15 = e10;
                                j16 = j14;
                                peer = B1;
                                str3 = str2;
                                hVar = hVar8;
                                i12 = i13;
                                z23 = z30;
                                arrayList3 = arrayList17;
                                arrayList4 = arrayList18;
                                arrayList5 = arrayList20;
                                inputPeer = inputPeer2;
                                chat = O0;
                                hVar2 = hVar6;
                                arrayList18 = arrayList4;
                                hVar8 = hVar;
                                arrayList17 = arrayList3;
                            } else {
                                if (!z18) {
                                    TLRPC.Message message4 = gjVar3.k;
                                    if ((message4.media instanceof TLRPC.TL_messageMediaPhoto) && gj.L4(message4) && i14 == 0) {
                                        if (i28 == 0) {
                                            i21 = v3.P(17, O0) ? 9 : 11;
                                            i28 = i21;
                                            arrayList2 = arrayList19;
                                            j15 = e10;
                                            j16 = j14;
                                            peer = B1;
                                            str3 = str2;
                                            i12 = i13;
                                            z23 = z30;
                                            arrayList5 = arrayList20;
                                            inputPeer = inputPeer2;
                                            chat = O0;
                                            hVar2 = hVar6;
                                        }
                                        arrayList2 = arrayList19;
                                        j15 = e10;
                                        j16 = j14;
                                        peer = B1;
                                        str3 = str2;
                                        hVar = hVar8;
                                        i12 = i13;
                                        z23 = z30;
                                        arrayList3 = arrayList17;
                                        arrayList4 = arrayList18;
                                        arrayList5 = arrayList20;
                                        inputPeer = inputPeer2;
                                        chat = O0;
                                        hVar2 = hVar6;
                                        arrayList18 = arrayList4;
                                        hVar8 = hVar;
                                        arrayList17 = arrayList3;
                                    }
                                }
                                if (z15 && (gjVar3.k.media instanceof TLRPC.TL_messageMediaPoll)) {
                                    if (i28 == 0) {
                                        i21 = v3.P(10, O0) ? 6 : 3;
                                        i28 = i21;
                                        arrayList2 = arrayList19;
                                        j15 = e10;
                                        j16 = j14;
                                        peer = B1;
                                        str3 = str2;
                                        i12 = i13;
                                        z23 = z30;
                                        arrayList5 = arrayList20;
                                        inputPeer = inputPeer2;
                                        chat = O0;
                                        hVar2 = hVar6;
                                    }
                                    arrayList2 = arrayList19;
                                    j15 = e10;
                                    j16 = j14;
                                    peer = B1;
                                    str3 = str2;
                                    hVar = hVar8;
                                    i12 = i13;
                                    z23 = z30;
                                    arrayList3 = arrayList17;
                                    arrayList4 = arrayList18;
                                    arrayList5 = arrayList20;
                                    inputPeer = inputPeer2;
                                    chat = O0;
                                    hVar2 = hVar6;
                                    arrayList18 = arrayList4;
                                    hVar8 = hVar;
                                    arrayList17 = arrayList3;
                                } else {
                                    int i29 = 21;
                                    if (z15 && (gjVar3.k.media instanceof TLRPC.TL_messageMediaToDo)) {
                                        if (i28 == 0) {
                                            if (!v3.P(10, O0)) {
                                                i29 = 22;
                                            }
                                            arrayList2 = arrayList19;
                                            j15 = e10;
                                            j16 = j14;
                                            peer = B1;
                                            str3 = str2;
                                            i28 = i29;
                                            i12 = i13;
                                            z23 = z30;
                                            arrayList5 = arrayList20;
                                            inputPeer = inputPeer2;
                                            chat = O0;
                                            hVar2 = hVar6;
                                        }
                                        arrayList2 = arrayList19;
                                        j15 = e10;
                                        j16 = j14;
                                        peer = B1;
                                        str3 = str2;
                                        hVar = hVar8;
                                        i12 = i13;
                                        z23 = z30;
                                        arrayList3 = arrayList17;
                                        arrayList4 = arrayList18;
                                        arrayList5 = arrayList20;
                                        inputPeer = inputPeer2;
                                        chat = O0;
                                        hVar2 = hVar6;
                                        arrayList18 = arrayList4;
                                        hVar8 = hVar;
                                        arrayList17 = arrayList3;
                                    } else {
                                        if (v && gj.R4(gjVar3.k)) {
                                            if (O0 != null) {
                                                if (i28 == 0) {
                                                    i21 = v3.P(20, O0) ? 13 : 14;
                                                    i28 = i21;
                                                    arrayList2 = arrayList19;
                                                    j15 = e10;
                                                    j16 = j14;
                                                    peer = B1;
                                                    str3 = str2;
                                                    i12 = i13;
                                                    z23 = z30;
                                                    arrayList5 = arrayList20;
                                                    inputPeer = inputPeer2;
                                                    chat = O0;
                                                    hVar2 = hVar6;
                                                }
                                            } else if (i28 == 0) {
                                                arrayList2 = arrayList19;
                                                j15 = e10;
                                                j16 = j14;
                                                peer = B1;
                                                str3 = str2;
                                                i28 = 7;
                                                i12 = i13;
                                                z23 = z30;
                                                arrayList5 = arrayList20;
                                                inputPeer = inputPeer2;
                                                chat = O0;
                                                hVar2 = hVar6;
                                            }
                                        } else if (s5 && gj.j4(gjVar3.k)) {
                                            if (O0 != null) {
                                                if (i28 == 0) {
                                                    i20 = v3.P(21, O0) ? 15 : 16;
                                                    arrayList2 = arrayList19;
                                                    j15 = e10;
                                                    j16 = j14;
                                                    peer = B1;
                                                    str3 = str2;
                                                    i28 = i20;
                                                    i12 = i13;
                                                    z23 = z30;
                                                    arrayList5 = arrayList20;
                                                    inputPeer = inputPeer2;
                                                    chat = O0;
                                                    hVar2 = hVar6;
                                                }
                                            } else if (i28 == 0) {
                                                arrayList2 = arrayList19;
                                                j15 = e10;
                                                j16 = j14;
                                                peer = B1;
                                                str3 = str2;
                                                i12 = i13;
                                                z23 = z30;
                                                i28 = 8;
                                                arrayList5 = arrayList20;
                                                inputPeer = inputPeer2;
                                                chat = O0;
                                                hVar2 = hVar6;
                                            }
                                        } else if (!z17 || !(gjVar3.k.media instanceof TLRPC.TL_messageMediaDocument) || i14 != 0) {
                                            tL_message = new TLRPC.TL_message();
                                            if (z10 || (gjVar3.k.media instanceof TLRPC.TL_messageMediaWidget)) {
                                                if (gj.B0(gjVar3.k) == e10 || !gjVar3.p3()) {
                                                    arrayList6 = arrayList18;
                                                    hVar3 = hVar8;
                                                } else {
                                                    arrayList6 = arrayList18;
                                                    hVar3 = hVar8;
                                                    if (gjVar3.k.from_id.user_id == e10) {
                                                        i15 = i26;
                                                        if (gj.l3(gjVar3.k)) {
                                                            TLRPC.TL_messageFwdHeader tL_messageFwdHeader = new TLRPC.TL_messageFwdHeader();
                                                            tL_message.fwd_from = tL_messageFwdHeader;
                                                            TLRPC.Message message5 = gjVar3.k;
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
                                                            if ((j20 == e10 || z22) && (messageFwdHeader3.flags & 16) != 0 && !p10.z(gj.B0(message5))) {
                                                                TLRPC.MessageFwdHeader messageFwdHeader4 = tL_message.fwd_from;
                                                                messageFwdHeader4.flags |= 16;
                                                                TLRPC.MessageFwdHeader messageFwdHeader5 = gjVar3.k.fwd_from;
                                                                messageFwdHeader4.saved_from_peer = messageFwdHeader5.saved_from_peer;
                                                                messageFwdHeader4.saved_from_msg_id = messageFwdHeader5.saved_from_msg_id;
                                                            }
                                                            tL_message.fwd_from.date = gjVar3.k.fwd_from.date;
                                                            tL_message.flags = 4;
                                                        } else if (i15 == 0) {
                                                            long Z0 = gjVar3.Z0();
                                                            TLRPC.TL_messageFwdHeader tL_messageFwdHeader2 = new TLRPC.TL_messageFwdHeader();
                                                            tL_message.fwd_from = tL_messageFwdHeader2;
                                                            tL_messageFwdHeader2.channel_post = gjVar3.e1();
                                                            tL_message.fwd_from.flags |= 4;
                                                            if (gjVar3.p3()) {
                                                                TLRPC.MessageFwdHeader messageFwdHeader6 = tL_message.fwd_from;
                                                                messageFwdHeader6.from_id = gjVar3.k.from_id;
                                                                messageFwdHeader6.flags |= 1;
                                                                arrayList7 = arrayList19;
                                                            } else {
                                                                tL_message.fwd_from.from_id = new TLRPC.TL_peerChannel();
                                                                TLRPC.MessageFwdHeader messageFwdHeader7 = tL_message.fwd_from;
                                                                TLRPC.Peer peer4 = messageFwdHeader7.from_id;
                                                                TLRPC.Message message6 = gjVar3.k;
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
                                                            if (gjVar3.k.post_author == null && !gjVar3.P3() && Z0 > 0 && gjVar3.k.post && (c22 = getMessagesController().c2(Long.valueOf(Z0))) != null) {
                                                                tL_message.fwd_from.post_author = i5.m(i25, c22.first_name, c22.last_name);
                                                                tL_message.fwd_from.flags |= 8;
                                                            }
                                                            tL_message.date = gjVar3.k.date;
                                                            tL_message.flags = 4;
                                                            if (j20 == e10 && (messageFwdHeader = tL_message.fwd_from) != null) {
                                                                messageFwdHeader.flags |= 16;
                                                                messageFwdHeader.saved_from_msg_id = gjVar3.e1();
                                                                TLRPC.MessageFwdHeader messageFwdHeader8 = tL_message.fwd_from;
                                                                TLRPC.Message message7 = gjVar3.k;
                                                                peer2 = message7.peer_id;
                                                                messageFwdHeader8.saved_from_peer = peer2;
                                                                if (peer2.user_id == e10) {
                                                                    peer2.user_id = gj.B0(message7);
                                                                }
                                                            }
                                                        }
                                                        arrayList7 = arrayList19;
                                                        if (j20 == e10) {
                                                            messageFwdHeader.flags |= 16;
                                                            messageFwdHeader.saved_from_msg_id = gjVar3.e1();
                                                            TLRPC.MessageFwdHeader messageFwdHeader82 = tL_message.fwd_from;
                                                            TLRPC.Message message72 = gjVar3.k;
                                                            peer2 = message72.peer_id;
                                                            messageFwdHeader82.saved_from_peer = peer2;
                                                            if (peer2.user_id == e10) {
                                                            }
                                                        }
                                                    }
                                                }
                                                i15 = i25;
                                                if (gj.l3(gjVar3.k)) {
                                                }
                                                arrayList7 = arrayList19;
                                                if (j20 == e10) {
                                                }
                                            } else {
                                                arrayList7 = arrayList19;
                                                arrayList6 = arrayList18;
                                                hVar3 = hVar8;
                                            }
                                            if (gjVar3.b5() && (messageFwdHeader2 = tL_message.fwd_from) != null && messageFwdHeader2.from_id != null) {
                                                messageFwdHeader2.from_id = (TLRPC.Peer) TLObject.deepCopy(gjVar3.k.peer_id, new fd(7));
                                                o10 = n5.o(gjVar3.k.from_id);
                                                if (o10 > 0) {
                                                    tL_message.via_bot_id = o10;
                                                }
                                            }
                                            HashMap<String, String> hashMap = new HashMap<>();
                                            tL_message.params = hashMap;
                                            hashMap.put("fwd_id", "" + gjVar3.e1());
                                            tL_message.params.put("fwd_peer", "" + gj.B0(gjVar3.k));
                                            if (!gjVar3.k.restriction_reason.isEmpty()) {
                                                tL_message.restriction_reason = gjVar3.k.restriction_reason;
                                                tL_message.flags |= TLObject.FLAG_22;
                                            }
                                            if (z16 && (gjVar3.k.media instanceof TLRPC.TL_messageMediaWebPage)) {
                                                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                                            } else {
                                                messageMedia = gjVar3.k.media;
                                                if (messageMedia instanceof TLRPC.TL_messageMediaWidget) {
                                                    tL_message.media = messageMedia;
                                                } else {
                                                    TLRPC.TL_messageMediaWidget tL_messageMediaWidget = (TLRPC.TL_messageMediaWidget) messageMedia;
                                                    TLRPC.TL_messageMediaWidget tL_messageMediaWidget2 = new TLRPC.TL_messageMediaWidget();
                                                    tL_messageMediaWidget2.is_copy = i26;
                                                    tL_messageMediaWidget2.width = tL_messageMediaWidget.width;
                                                    tL_messageMediaWidget2.height = tL_messageMediaWidget.height;
                                                    tL_messageMediaWidget2.payload = tL_messageMediaWidget.payload;
                                                    tL_messageMediaWidget2.public_data = tL_messageMediaWidget.public_data;
                                                    tL_messageMediaWidget2.public_data_hash = tL_messageMediaWidget.public_data_hash;
                                                    tL_messageMediaWidget2.widget_id = tL_messageMediaWidget.widget_id;
                                                    tL_message.media = tL_messageMediaWidget2;
                                                }
                                            }
                                            TLRPC.Message message8 = gjVar3.k;
                                            tL_message.invert_media = message8.invert_media;
                                            if (tL_message.media != null) {
                                                tL_message.flags |= 512;
                                            }
                                            j17 = message8.via_bot_id;
                                            if (j17 != 0) {
                                                tL_message.via_bot_id = j17;
                                                tL_message.flags |= 2048;
                                            }
                                            if (j14 != 0) {
                                                TLRPC.TL_messageReplies tL_messageReplies = new TLRPC.TL_messageReplies();
                                                tL_message.replies = tL_messageReplies;
                                                tL_messageReplies.comments = true;
                                                tL_messageReplies.channel_id = j14;
                                                tL_messageReplies.flags |= 1;
                                                tL_message.flags |= TLObject.FLAG_23;
                                            }
                                            if (z11 || tL_message.media == null) {
                                                tL_message.message = gjVar3.k.message;
                                            }
                                            richMessage = gjVar3.k.rich_message;
                                            if (richMessage != null) {
                                                tL_message.flags2 |= TLObject.FLAG_13;
                                                tL_message.rich_message = richMessage;
                                            }
                                            if (tL_message.message == null) {
                                                tL_message.message = "";
                                            }
                                            tL_message.fwd_msg_id = gjVar3.e1();
                                            TLRPC.Message message9 = gjVar3.k;
                                            tL_message.attachPath = message9.attachPath;
                                            tL_message.entities = message9.entities;
                                            replyMarkup = message9.reply_markup;
                                            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                j16 = j14;
                                            } else {
                                                TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = (TLRPC.TL_replyInlineMarkup) replyMarkup;
                                                TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup2 = new TLRPC.TL_replyInlineMarkup();
                                                tL_message.reply_markup = tL_replyInlineMarkup2;
                                                int size = tL_replyInlineMarkup.rows.size();
                                                int i30 = 0;
                                                boolean z32 = false;
                                                while (true) {
                                                    j16 = j14;
                                                    if (i30 >= size) {
                                                        break;
                                                    }
                                                    TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = tL_replyInlineMarkup.rows.get(i30);
                                                    int size2 = keyboardInlineButtonRow.buttons.size();
                                                    TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup3 = tL_replyInlineMarkup;
                                                    int i31 = 0;
                                                    TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow2 = null;
                                                    while (true) {
                                                        if (i31 >= size2) {
                                                            break;
                                                        }
                                                        int i32 = size2;
                                                        TL_keyboard.KeyboardInlineButton keyboardInlineButton = keyboardInlineButtonRow.buttons.get(i31);
                                                        int i33 = i31;
                                                        TL_keyboard.TL_inlineButtonTypeUrlAuth tL_inlineButtonTypeUrlAuth = (TL_keyboard.TL_inlineButtonTypeUrlAuth) cg.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class);
                                                        TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow2 = keyboardInlineButtonRow;
                                                        if (tL_inlineButtonTypeUrlAuth == null && !cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) && !cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) && !cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                                                            z32 = true;
                                                            break;
                                                        }
                                                        if (tL_inlineButtonTypeUrlAuth != null) {
                                                            TL_keyboard.TL_keyboardInlineButton tL_keyboardInlineButton = new TL_keyboard.TL_keyboardInlineButton();
                                                            i18 = size;
                                                            TL_keyboard.TL_inlineButtonTypeUrlAuth tL_inlineButtonTypeUrlAuth2 = new TL_keyboard.TL_inlineButtonTypeUrlAuth();
                                                            tL_keyboardInlineButton.type = tL_inlineButtonTypeUrlAuth2;
                                                            i19 = i30;
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
                                                            i18 = size;
                                                            i19 = i30;
                                                        }
                                                        if (tL_keyboardInlineButtonRow2 == null) {
                                                            tL_keyboardInlineButtonRow = new TL_keyboard.TL_keyboardInlineButtonRow();
                                                            tL_replyInlineMarkup2.rows.add(tL_keyboardInlineButtonRow);
                                                        } else {
                                                            tL_keyboardInlineButtonRow = tL_keyboardInlineButtonRow2;
                                                        }
                                                        tL_keyboardInlineButtonRow.buttons.add(keyboardInlineButton);
                                                        tL_keyboardInlineButtonRow2 = tL_keyboardInlineButtonRow;
                                                        i31 = i33 + 1;
                                                        size2 = i32;
                                                        keyboardInlineButtonRow = keyboardInlineButtonRow2;
                                                        size = i18;
                                                        i30 = i19;
                                                    }
                                                    int i34 = size;
                                                    int i35 = i30;
                                                    if (z32) {
                                                        break;
                                                    }
                                                    i30 = i35 + 1;
                                                    tL_replyInlineMarkup = tL_replyInlineMarkup3;
                                                    j14 = j16;
                                                    size = i34;
                                                }
                                                if (z32) {
                                                    gjVar3.k.reply_markup = null;
                                                    tL_message.flags &= -65;
                                                    if (!tL_message.entities.isEmpty()) {
                                                        tL_message.flags |= 128;
                                                    }
                                                    if (tL_message.attachPath == null) {
                                                        tL_message.attachPath = "";
                                                    }
                                                    int j23 = getUserConfig().j();
                                                    tL_message.id = j23;
                                                    tL_message.local_id = j23;
                                                    tL_message.out = true;
                                                    j18 = gjVar3.k.grouped_id;
                                                    if (j18 != 0) {
                                                        Long l11 = (Long) hVar6.f(j18);
                                                        if (l11 == null) {
                                                            l11 = Long.valueOf(Utilities.b.nextLong());
                                                            hVar6.k(l11, gjVar3.k.grouped_id);
                                                        }
                                                        tL_message.grouped_id = l11.longValue();
                                                        tL_message.flags |= 131072;
                                                    }
                                                    if (B1.channel_id == 0 && z22) {
                                                        if (z19) {
                                                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                                            tL_message.from_id = tL_peerUser;
                                                            tL_peerUser.user_id = e10;
                                                        } else {
                                                            tL_message.from_id = B1;
                                                        }
                                                        tL_message.post = true;
                                                        j19 = j3;
                                                    } else {
                                                        j19 = j3;
                                                        M = v3.M(O0, getMessagesController().P0(-j19), true);
                                                        if (M == e10) {
                                                            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                                                            tL_message.from_id = tL_peerUser2;
                                                            tL_peerUser2.user_id = e10;
                                                            tL_message.flags |= 256;
                                                        } else {
                                                            tL_message.from_id = getMessagesController().B1(M);
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
                                                    if (gj.c3(gjVar3.k)) {
                                                        arrayList8 = arrayList7;
                                                        arrayList8.add(Integer.valueOf(gjVar3.P0()));
                                                        z24 = true;
                                                    } else {
                                                        arrayList8 = arrayList7;
                                                        arrayList8.add(Integer.valueOf(tL_message.fwd_msg_id));
                                                        z24 = z31;
                                                    }
                                                    tL_message.date = i7 != 0 ? i7 : getConnectionsManager().getCurrentTime();
                                                    TLRPC.InputPeer inputPeer3 = inputPeer2;
                                                    z25 = inputPeer3 instanceof TLRPC.TL_inputPeerChannel;
                                                    if (z25 || !z22) {
                                                        hVar5 = hVar4;
                                                        message = gjVar3.k;
                                                        j15 = e10;
                                                        if ((message.flags & 1024) != 0 && i7 == 0) {
                                                            tL_message.views = message.views;
                                                            tL_message.flags |= 1024;
                                                        }
                                                        tL_message.unread = true;
                                                    } else {
                                                        hVar5 = hVar4;
                                                        if (i7 == 0) {
                                                            tL_message.views = 1;
                                                            tL_message.flags |= 1024;
                                                        }
                                                        j15 = e10;
                                                    }
                                                    tL_message.dialog_id = j19;
                                                    tL_message.peer_id = B1;
                                                    if (!gj.R4(tL_message) || gj.j4(tL_message)) {
                                                        if (z25 || gj.v0(gjVar3.k) == 0) {
                                                            tL_message.media_unread = true;
                                                        } else {
                                                            tL_message.media_unread = gjVar3.k.media_unread;
                                                        }
                                                    }
                                                    if (gjVar == null && ljVar == null && (messageReplyHeader = (message2 = gjVar3.k).reply_to) != null) {
                                                        peer3 = messageReplyHeader.reply_to_peer_id;
                                                        if (peer3 != null || gj.v5(peer3, message2.peer_id)) {
                                                            messageReplyHeader2 = gjVar3.k.reply_to;
                                                            if ((messageReplyHeader2.flags & 16) != 0) {
                                                            }
                                                        }
                                                        tL_message.flags |= 8;
                                                        tL_message.reply_to = gjVar3.k.reply_to;
                                                    }
                                                    i16 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                                                    if (i16 > 0) {
                                                        tL_message.flags2 |= 64;
                                                        tL_message.paid_message_stars = j10;
                                                    }
                                                    if (j11 != 0) {
                                                        i17 = i16;
                                                        tL_message.saved_peer_id = getMessagesController().B1(j11);
                                                        tL_message.flags |= TLObject.FLAG_28;
                                                    } else {
                                                        i17 = i16;
                                                    }
                                                    if (ljVar != null) {
                                                        tL_message.suggested_post = ljVar.c();
                                                    }
                                                    chat = O0;
                                                    TLRPC.Peer peer7 = B1;
                                                    str3 = str2;
                                                    gj gjVar4 = new gj(this.currentAccount, tL_message, true, true);
                                                    gjVar4.r1 = i7 != 0;
                                                    gjVar4.k.send_state = 1;
                                                    gjVar4.X1 = true;
                                                    ArrayList arrayList22 = arrayList20;
                                                    arrayList22.add(gjVar4);
                                                    arrayList9 = arrayList17;
                                                    arrayList9.add(tL_message);
                                                    hVar2 = hVar6;
                                                    di.y8.y(this.currentAccount, false).d(gjVar4);
                                                    if (gjVar3.C != null) {
                                                        int i36 = 0;
                                                        while (i36 < arrayList.size()) {
                                                            arrayList10 = arrayList;
                                                            int i37 = i36;
                                                            if (((gj) arrayList10.get(i36)).e1() == gjVar3.C.e1()) {
                                                                TLRPC.Message message10 = gjVar4.k;
                                                                gj gjVar5 = gjVar3.C;
                                                                message10.replyMessage = gjVar5.k;
                                                                gjVar4.C = gjVar5;
                                                                break;
                                                            }
                                                            i36 = i37 + 1;
                                                        }
                                                    }
                                                    arrayList10 = arrayList;
                                                    f0(tL_message, i7 != 0);
                                                    if (s2.a) {
                                                        StringBuilder sb2 = new StringBuilder("forward message user_id = ");
                                                        sb2.append(inputPeer3.user_id);
                                                        sb2.append(" chat_id = ");
                                                        sb2.append(inputPeer3.chat_id);
                                                        sb2.append(" channel_id = ");
                                                        sb2.append(inputPeer3.channel_id);
                                                        sb2.append(" access_hash = ");
                                                        i5.c.v(inputPeer3.access_hash, sb2);
                                                    }
                                                    if (gjVar == null && ljVar == null) {
                                                        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                                        tL_message.reply_to = tL_messageReplyHeader;
                                                        tL_messageReplyHeader.flags |= 16;
                                                        tL_messageReplyHeader.reply_to_msg_id = gjVar.e1();
                                                        if (gjVar.p) {
                                                            TLRPC.MessageReplyHeader messageReplyHeader3 = tL_message.reply_to;
                                                            messageReplyHeader3.forum_topic = true;
                                                            messageReplyHeader3.flags |= 8;
                                                            if (arrayList9.size() == 100) {
                                                                i27 = i13;
                                                                if (i27 != arrayList10.size() - 1 && (i27 == arrayList10.size() - 1 || gj.B0(((gj) arrayList10.get(i27 + 1)).k) == gj.B0(gjVar3.k))) {
                                                                    arrayList4 = arrayList21;
                                                                    inputPeer = inputPeer3;
                                                                    azVar = this;
                                                                    arrayList3 = arrayList9;
                                                                    z23 = z30;
                                                                    hVar = hVar5;
                                                                    peer = peer7;
                                                                    i26 = 1;
                                                                    arrayList5 = arrayList22;
                                                                    arrayList2 = arrayList8;
                                                                    z31 = z24;
                                                                    i12 = i27;
                                                                    arrayList18 = arrayList4;
                                                                    hVar8 = hVar;
                                                                    arrayList17 = arrayList3;
                                                                }
                                                            } else {
                                                                i27 = i13;
                                                            }
                                                            getMessagesStorage().i1(0, i7 == 0 ? 1 : 0, 0L, new ArrayList(arrayList9), false);
                                                            getMessagesController().x5(i7 == 0 ? 1 : 0, j19, arrayList22);
                                                            getNotificationCenter().k(ls.s, new Object[0]);
                                                            getUserConfig().v(false);
                                                            tL_messages_forwardMessages = new TLRPC.TL_messages_forwardMessages();
                                                            tL_messages_forwardMessages.to_peer = inputPeer3;
                                                            tL_messages_forwardMessages.silent = z12 || f3.w("silent_", j19, np.u1(this.currentAccount).g7, false);
                                                            if (gjVar != null) {
                                                                tL_messages_forwardMessages.top_msg_id = gjVar.e1();
                                                                tL_messages_forwardMessages.flags |= 512;
                                                            }
                                                            if (i7 == 0) {
                                                                tL_messages_forwardMessages.schedule_date = i7;
                                                                int i38 = tL_messages_forwardMessages.flags;
                                                                tL_messages_forwardMessages.flags = i38 | 1024;
                                                                if (i10 != 0) {
                                                                    tL_messages_forwardMessages.schedule_repeat_period = i10;
                                                                    tL_messages_forwardMessages.flags = i38 | 16778240;
                                                                }
                                                            }
                                                            if (gjVar3.k.peer_id instanceof TLRPC.TL_peerChannel) {
                                                                inputPeer = inputPeer3;
                                                                tL_messages_forwardMessages.from_peer = new TLRPC.TL_inputPeerEmpty();
                                                            } else {
                                                                inputPeer = inputPeer3;
                                                                TLRPC.Chat O02 = getMessagesController().O0(Long.valueOf(gjVar3.k.peer_id.channel_id));
                                                                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                                                                tL_messages_forwardMessages.from_peer = tL_inputPeerChannel;
                                                                tL_inputPeerChannel.channel_id = gjVar3.k.peer_id.channel_id;
                                                                if (O02 != null) {
                                                                    tL_inputPeerChannel.access_hash = O02.access_hash;
                                                                }
                                                            }
                                                            tL_messages_forwardMessages.random_id = arrayList21;
                                                            tL_messages_forwardMessages.id = arrayList8;
                                                            tL_messages_forwardMessages.drop_author = z10;
                                                            tL_messages_forwardMessages.drop_media_captions = z11;
                                                            tL_messages_forwardMessages.with_my_score = arrayList10.size() != 1 && ((gj) arrayList10.get(0)).k.with_my_score;
                                                            tL_messages_forwardMessages.from_ephemeral = z24;
                                                            if (i11 >= 0) {
                                                                tL_messages_forwardMessages.flags |= TLObject.FLAG_20;
                                                                tL_messages_forwardMessages.video_timestamp = i11;
                                                            }
                                                            if (i17 <= 0) {
                                                                tL_messages_forwardMessages.flags |= TLObject.FLAG_21;
                                                                arrayList4 = arrayList21;
                                                                tL_messages_forwardMessages.allow_paid_stars = tL_messages_forwardMessages.id.size() * j10;
                                                            } else {
                                                                arrayList4 = arrayList21;
                                                            }
                                                            if (ljVar != null) {
                                                                tL_messages_forwardMessages.suggested_post = ljVar.c();
                                                                if (gjVar != null) {
                                                                    TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                                                                    tL_messages_forwardMessages.reply_to = tL_inputReplyToMessage;
                                                                    tL_inputReplyToMessage.reply_to_msg_id = gjVar.e1();
                                                                }
                                                            }
                                                            a(tL_messages_forwardMessages, j11);
                                                            arrayList11 = new ArrayList(arrayList22);
                                                            boolean z33 = z30;
                                                            arrayList5 = arrayList22;
                                                            arrayList2 = arrayList8;
                                                            i26 = 1;
                                                            a0.h hVar9 = hVar5;
                                                            hVar = hVar9;
                                                            arrayList3 = arrayList9;
                                                            peer = peer7;
                                                            z23 = z33;
                                                            ulVar = new ul(this, tL_messages_forwardMessages, arrayList11, new mx(i7, j3, hVar9, arrayList9, arrayList11, gjVar3, this, peer7, tL_messages_forwardMessages, i7 != 2147483646, z33), 4);
                                                            azVar = this;
                                                            if (di.y8.y(azVar.currentAccount, false).c(tL_messages_forwardMessages, arrayList11, ulVar)) {
                                                                ulVar.run();
                                                            }
                                                            if (i27 != arrayList10.size() - 1) {
                                                                arrayList5 = new ArrayList();
                                                                arrayList17 = new ArrayList();
                                                                arrayList18 = new ArrayList<>();
                                                                arrayList2 = new ArrayList<>();
                                                                z31 = z24;
                                                                i12 = i27;
                                                                hVar8 = new a0.h();
                                                            }
                                                            z31 = z24;
                                                            i12 = i27;
                                                            arrayList18 = arrayList4;
                                                            hVar8 = hVar;
                                                            arrayList17 = arrayList3;
                                                        }
                                                    }
                                                    if (arrayList9.size() == 100) {
                                                    }
                                                    getMessagesStorage().i1(0, i7 == 0 ? 1 : 0, 0L, new ArrayList(arrayList9), false);
                                                    getMessagesController().x5(i7 == 0 ? 1 : 0, j19, arrayList22);
                                                    getNotificationCenter().k(ls.s, new Object[0]);
                                                    getUserConfig().v(false);
                                                    tL_messages_forwardMessages = new TLRPC.TL_messages_forwardMessages();
                                                    tL_messages_forwardMessages.to_peer = inputPeer3;
                                                    tL_messages_forwardMessages.silent = z12 || f3.w("silent_", j19, np.u1(this.currentAccount).g7, false);
                                                    if (gjVar != null) {
                                                    }
                                                    if (i7 == 0) {
                                                    }
                                                    if (gjVar3.k.peer_id instanceof TLRPC.TL_peerChannel) {
                                                    }
                                                    tL_messages_forwardMessages.random_id = arrayList21;
                                                    tL_messages_forwardMessages.id = arrayList8;
                                                    tL_messages_forwardMessages.drop_author = z10;
                                                    tL_messages_forwardMessages.drop_media_captions = z11;
                                                    tL_messages_forwardMessages.with_my_score = arrayList10.size() != 1 && ((gj) arrayList10.get(0)).k.with_my_score;
                                                    tL_messages_forwardMessages.from_ephemeral = z24;
                                                    if (i11 >= 0) {
                                                    }
                                                    if (i17 <= 0) {
                                                    }
                                                    if (ljVar != null) {
                                                    }
                                                    a(tL_messages_forwardMessages, j11);
                                                    arrayList11 = new ArrayList(arrayList22);
                                                    boolean z332 = z30;
                                                    arrayList5 = arrayList22;
                                                    arrayList2 = arrayList8;
                                                    i26 = 1;
                                                    a0.h hVar92 = hVar5;
                                                    hVar = hVar92;
                                                    arrayList3 = arrayList9;
                                                    peer = peer7;
                                                    z23 = z332;
                                                    ulVar = new ul(this, tL_messages_forwardMessages, arrayList11, new mx(i7, j3, hVar92, arrayList9, arrayList11, gjVar3, this, peer7, tL_messages_forwardMessages, i7 != 2147483646, z332), 4);
                                                    azVar = this;
                                                    if (di.y8.y(azVar.currentAccount, false).c(tL_messages_forwardMessages, arrayList11, ulVar)) {
                                                    }
                                                    if (i27 != arrayList10.size() - 1) {
                                                    }
                                                    z31 = z24;
                                                    i12 = i27;
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
                                            int j232 = getUserConfig().j();
                                            tL_message.id = j232;
                                            tL_message.local_id = j232;
                                            tL_message.out = true;
                                            j18 = gjVar3.k.grouped_id;
                                            if (j18 != 0) {
                                            }
                                            if (B1.channel_id == 0) {
                                            }
                                            j19 = j3;
                                            M = v3.M(O0, getMessagesController().P0(-j19), true);
                                            if (M == e10) {
                                            }
                                            if (tL_message.random_id == 0) {
                                            }
                                            ArrayList<Long> arrayList212 = arrayList6;
                                            arrayList212.add(Long.valueOf(tL_message.random_id));
                                            hVar4 = hVar3;
                                            hVar4.k(tL_message, tL_message.random_id);
                                            if (gj.c3(gjVar3.k)) {
                                            }
                                            tL_message.date = i7 != 0 ? i7 : getConnectionsManager().getCurrentTime();
                                            TLRPC.InputPeer inputPeer32 = inputPeer2;
                                            z25 = inputPeer32 instanceof TLRPC.TL_inputPeerChannel;
                                            if (z25) {
                                            }
                                            hVar5 = hVar4;
                                            message = gjVar3.k;
                                            j15 = e10;
                                            if ((message.flags & 1024) != 0) {
                                                tL_message.views = message.views;
                                                tL_message.flags |= 1024;
                                            }
                                            tL_message.unread = true;
                                            tL_message.dialog_id = j19;
                                            tL_message.peer_id = B1;
                                            if (!gj.R4(tL_message)) {
                                            }
                                            if (z25) {
                                            }
                                            tL_message.media_unread = true;
                                            if (gjVar == null) {
                                                peer3 = messageReplyHeader.reply_to_peer_id;
                                                if (peer3 != null) {
                                                }
                                                messageReplyHeader2 = gjVar3.k.reply_to;
                                                if ((messageReplyHeader2.flags & 16) != 0) {
                                                }
                                            }
                                            i16 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                                            if (i16 > 0) {
                                            }
                                            if (j11 != 0) {
                                            }
                                            if (ljVar != null) {
                                            }
                                            chat = O0;
                                            TLRPC.Peer peer72 = B1;
                                            str3 = str2;
                                            gj gjVar42 = new gj(this.currentAccount, tL_message, true, true);
                                            gjVar42.r1 = i7 != 0;
                                            gjVar42.k.send_state = 1;
                                            gjVar42.X1 = true;
                                            ArrayList arrayList222 = arrayList20;
                                            arrayList222.add(gjVar42);
                                            arrayList9 = arrayList17;
                                            arrayList9.add(tL_message);
                                            hVar2 = hVar6;
                                            di.y8.y(this.currentAccount, false).d(gjVar42);
                                            if (gjVar3.C != null) {
                                            }
                                            arrayList10 = arrayList;
                                            f0(tL_message, i7 != 0);
                                            if (s2.a) {
                                            }
                                            if (gjVar == null) {
                                            }
                                            if (arrayList9.size() == 100) {
                                            }
                                            getMessagesStorage().i1(0, i7 == 0 ? 1 : 0, 0L, new ArrayList(arrayList9), false);
                                            getMessagesController().x5(i7 == 0 ? 1 : 0, j19, arrayList222);
                                            getNotificationCenter().k(ls.s, new Object[0]);
                                            getUserConfig().v(false);
                                            tL_messages_forwardMessages = new TLRPC.TL_messages_forwardMessages();
                                            tL_messages_forwardMessages.to_peer = inputPeer32;
                                            tL_messages_forwardMessages.silent = z12 || f3.w("silent_", j19, np.u1(this.currentAccount).g7, false);
                                            if (gjVar != null) {
                                            }
                                            if (i7 == 0) {
                                            }
                                            if (gjVar3.k.peer_id instanceof TLRPC.TL_peerChannel) {
                                            }
                                            tL_messages_forwardMessages.random_id = arrayList212;
                                            tL_messages_forwardMessages.id = arrayList8;
                                            tL_messages_forwardMessages.drop_author = z10;
                                            tL_messages_forwardMessages.drop_media_captions = z11;
                                            tL_messages_forwardMessages.with_my_score = arrayList10.size() != 1 && ((gj) arrayList10.get(0)).k.with_my_score;
                                            tL_messages_forwardMessages.from_ephemeral = z24;
                                            if (i11 >= 0) {
                                            }
                                            if (i17 <= 0) {
                                            }
                                            if (ljVar != null) {
                                            }
                                            a(tL_messages_forwardMessages, j11);
                                            arrayList11 = new ArrayList(arrayList222);
                                            boolean z3322 = z30;
                                            arrayList5 = arrayList222;
                                            arrayList2 = arrayList8;
                                            i26 = 1;
                                            a0.h hVar922 = hVar5;
                                            hVar = hVar922;
                                            arrayList3 = arrayList9;
                                            peer = peer72;
                                            z23 = z3322;
                                            ulVar = new ul(this, tL_messages_forwardMessages, arrayList11, new mx(i7, j3, hVar922, arrayList9, arrayList11, gjVar3, this, peer72, tL_messages_forwardMessages, i7 != 2147483646, z3322), 4);
                                            azVar = this;
                                            if (di.y8.y(azVar.currentAccount, false).c(tL_messages_forwardMessages, arrayList11, ulVar)) {
                                            }
                                            if (i27 != arrayList10.size() - 1) {
                                            }
                                            z31 = z24;
                                            i12 = i27;
                                            arrayList18 = arrayList4;
                                            hVar8 = hVar;
                                            arrayList17 = arrayList3;
                                        } else if (i28 == 0) {
                                            i29 = v3.P(19, O0) ? 17 : 18;
                                            arrayList2 = arrayList19;
                                            j15 = e10;
                                            j16 = j14;
                                            peer = B1;
                                            str3 = str2;
                                            i28 = i29;
                                            i12 = i13;
                                            z23 = z30;
                                            arrayList5 = arrayList20;
                                            inputPeer = inputPeer2;
                                            chat = O0;
                                            hVar2 = hVar6;
                                        }
                                        arrayList2 = arrayList19;
                                        j15 = e10;
                                        j16 = j14;
                                        peer = B1;
                                        str3 = str2;
                                        hVar = hVar8;
                                        i12 = i13;
                                        z23 = z30;
                                        arrayList3 = arrayList17;
                                        arrayList4 = arrayList18;
                                        arrayList5 = arrayList20;
                                        inputPeer = inputPeer2;
                                        chat = O0;
                                        hVar2 = hVar6;
                                        arrayList18 = arrayList4;
                                        hVar8 = hVar;
                                        arrayList17 = arrayList3;
                                    }
                                }
                            }
                        } else {
                            if (i28 == 0) {
                                i20 = v3.P(8, O0) ? 4 : i26;
                                arrayList2 = arrayList19;
                                j15 = e10;
                                j16 = j14;
                                peer = B1;
                                str3 = str2;
                                i28 = i20;
                                i12 = i13;
                                z23 = z30;
                                arrayList5 = arrayList20;
                                inputPeer = inputPeer2;
                                chat = O0;
                                hVar2 = hVar6;
                            }
                            arrayList2 = arrayList19;
                            j15 = e10;
                            j16 = j14;
                            peer = B1;
                            str3 = str2;
                            hVar = hVar8;
                            i12 = i13;
                            z23 = z30;
                            arrayList3 = arrayList17;
                            arrayList4 = arrayList18;
                            arrayList5 = arrayList20;
                            inputPeer = inputPeer2;
                            chat = O0;
                            hVar2 = hVar6;
                            arrayList18 = arrayList4;
                            hVar8 = hVar;
                            arrayList17 = arrayList3;
                        }
                    }
                }
                i14 = i26;
                if (z20) {
                }
                if (!z21) {
                }
                if (o4) {
                }
                if (!z18) {
                }
                if (z15) {
                }
                int i292 = 21;
                if (z15) {
                }
                if (v) {
                }
                if (s5) {
                }
                if (!z17) {
                }
                tL_message = new TLRPC.TL_message();
                if (z10) {
                }
                if (gj.B0(gjVar3.k) == e10) {
                }
                arrayList6 = arrayList18;
                hVar3 = hVar8;
                i15 = i25;
                if (gj.l3(gjVar3.k)) {
                }
                arrayList7 = arrayList19;
                if (j20 == e10) {
                }
                if (gjVar3.b5()) {
                    messageFwdHeader2.from_id = (TLRPC.Peer) TLObject.deepCopy(gjVar3.k.peer_id, new fd(7));
                    o10 = n5.o(gjVar3.k.from_id);
                    if (o10 > 0) {
                    }
                }
                HashMap<String, String> hashMap2 = new HashMap<>();
                tL_message.params = hashMap2;
                hashMap2.put("fwd_id", "" + gjVar3.e1());
                tL_message.params.put("fwd_peer", "" + gj.B0(gjVar3.k));
                if (!gjVar3.k.restriction_reason.isEmpty()) {
                }
                if (z16) {
                }
                messageMedia = gjVar3.k.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaWidget) {
                }
                TLRPC.Message message82 = gjVar3.k;
                tL_message.invert_media = message82.invert_media;
                if (tL_message.media != null) {
                }
                j17 = message82.via_bot_id;
                if (j17 != 0) {
                }
                if (j14 != 0) {
                }
                if (z11) {
                }
                tL_message.message = gjVar3.k.message;
                richMessage = gjVar3.k.rich_message;
                if (richMessage != null) {
                }
                if (tL_message.message == null) {
                }
                tL_message.fwd_msg_id = gjVar3.e1();
                TLRPC.Message message92 = gjVar3.k;
                tL_message.attachPath = message92.attachPath;
                tL_message.entities = message92.entities;
                replyMarkup = message92.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                }
                if (!tL_message.entities.isEmpty()) {
                }
                if (tL_message.attachPath == null) {
                }
                int j2322 = getUserConfig().j();
                tL_message.id = j2322;
                tL_message.local_id = j2322;
                tL_message.out = true;
                j18 = gjVar3.k.grouped_id;
                if (j18 != 0) {
                }
                if (B1.channel_id == 0) {
                }
                j19 = j3;
                M = v3.M(O0, getMessagesController().P0(-j19), true);
                if (M == e10) {
                }
                if (tL_message.random_id == 0) {
                }
                ArrayList<Long> arrayList2122 = arrayList6;
                arrayList2122.add(Long.valueOf(tL_message.random_id));
                hVar4 = hVar3;
                hVar4.k(tL_message, tL_message.random_id);
                if (gj.c3(gjVar3.k)) {
                }
                tL_message.date = i7 != 0 ? i7 : getConnectionsManager().getCurrentTime();
                TLRPC.InputPeer inputPeer322 = inputPeer2;
                z25 = inputPeer322 instanceof TLRPC.TL_inputPeerChannel;
                if (z25) {
                }
                hVar5 = hVar4;
                message = gjVar3.k;
                j15 = e10;
                if ((message.flags & 1024) != 0) {
                }
                tL_message.unread = true;
                tL_message.dialog_id = j19;
                tL_message.peer_id = B1;
                if (!gj.R4(tL_message)) {
                }
                if (z25) {
                }
                tL_message.media_unread = true;
                if (gjVar == null) {
                }
                i16 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i16 > 0) {
                }
                if (j11 != 0) {
                }
                if (ljVar != null) {
                }
                chat = O0;
                TLRPC.Peer peer722 = B1;
                str3 = str2;
                gj gjVar422 = new gj(this.currentAccount, tL_message, true, true);
                gjVar422.r1 = i7 != 0;
                gjVar422.k.send_state = 1;
                gjVar422.X1 = true;
                ArrayList arrayList2222 = arrayList20;
                arrayList2222.add(gjVar422);
                arrayList9 = arrayList17;
                arrayList9.add(tL_message);
                hVar2 = hVar6;
                di.y8.y(this.currentAccount, false).d(gjVar422);
                if (gjVar3.C != null) {
                }
                arrayList10 = arrayList;
                f0(tL_message, i7 != 0);
                if (s2.a) {
                }
                if (gjVar == null) {
                }
                if (arrayList9.size() == 100) {
                }
                getMessagesStorage().i1(0, i7 == 0 ? 1 : 0, 0L, new ArrayList(arrayList9), false);
                getMessagesController().x5(i7 == 0 ? 1 : 0, j19, arrayList2222);
                getNotificationCenter().k(ls.s, new Object[0]);
                getUserConfig().v(false);
                tL_messages_forwardMessages = new TLRPC.TL_messages_forwardMessages();
                tL_messages_forwardMessages.to_peer = inputPeer322;
                tL_messages_forwardMessages.silent = z12 || f3.w("silent_", j19, np.u1(this.currentAccount).g7, false);
                if (gjVar != null) {
                }
                if (i7 == 0) {
                }
                if (gjVar3.k.peer_id instanceof TLRPC.TL_peerChannel) {
                }
                tL_messages_forwardMessages.random_id = arrayList2122;
                tL_messages_forwardMessages.id = arrayList8;
                tL_messages_forwardMessages.drop_author = z10;
                tL_messages_forwardMessages.drop_media_captions = z11;
                tL_messages_forwardMessages.with_my_score = arrayList10.size() != 1 && ((gj) arrayList10.get(0)).k.with_my_score;
                tL_messages_forwardMessages.from_ephemeral = z24;
                if (i11 >= 0) {
                }
                if (i17 <= 0) {
                }
                if (ljVar != null) {
                }
                a(tL_messages_forwardMessages, j11);
                arrayList11 = new ArrayList(arrayList2222);
                boolean z33222 = z30;
                arrayList5 = arrayList2222;
                arrayList2 = arrayList8;
                i26 = 1;
                a0.h hVar9222 = hVar5;
                hVar = hVar9222;
                arrayList3 = arrayList9;
                peer = peer722;
                z23 = z33222;
                ulVar = new ul(this, tL_messages_forwardMessages, arrayList11, new mx(i7, j3, hVar9222, arrayList9, arrayList11, gjVar3, this, peer722, tL_messages_forwardMessages, i7 != 2147483646, z33222), 4);
                azVar = this;
                if (di.y8.y(azVar.currentAccount, false).c(tL_messages_forwardMessages, arrayList11, ulVar)) {
                }
                if (i27 != arrayList10.size() - 1) {
                }
                z31 = z24;
                i12 = i27;
                arrayList18 = arrayList4;
                hVar8 = hVar;
                arrayList17 = arrayList3;
            }
            i27 = i12 + 1;
            arrayList12 = arrayList;
            hVar6 = hVar2;
            O0 = chat;
            inputPeer2 = inputPeer;
            arrayList20 = arrayList5;
            e10 = j15;
            B1 = peer;
            z30 = z23;
            j14 = j16;
            arrayList19 = arrayList2;
            str2 = str3;
            i25 = 0;
        }
        return i28;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Not initialized variable reg: 74, insn: 0x2461: MOVE (r3 I:??[OBJECT, ARRAY]) = (r74 I:??[OBJECT, ARRAY]), block:B:1474:0x2461 */
    public final void r0(org.telegram.messenger.yy r106) {
        /*
            Method dump skipped, instructions count: 11439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.az.r0(org.telegram.messenger.yy):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s0(gj gjVar, ArrayList arrayList, ch.p0 p0Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.di diVar) {
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji;
        if (gjVar == null || g2Var == null) {
            return;
        }
        TLRPC.TL_messages_sendReaction tL_messages_sendReaction = new TLRPC.TL_messages_sendReaction();
        TLRPC.Message message = gjVar.k;
        if (!message.isThreadMessage || message.fwd_from == null) {
            tL_messages_sendReaction.peer = getMessagesController().l1(gj.B0(gjVar.k));
            tL_messages_sendReaction.msg_id = gjVar.e1();
        } else {
            tL_messages_sendReaction.peer = getMessagesController().l1(gjVar.Z0());
            tL_messages_sendReaction.msg_id = gjVar.k.fwd_from.saved_from_msg_id;
        }
        tL_messages_sendReaction.add_to_recent = z11;
        if (z11 && p0Var != null) {
            ArrayList arrayList2 = si.d0(this.currentAccount).F1;
            if (p0Var.f != null) {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                tL_reactionEmoji.emoticon = p0Var.f;
                tL_reactionCustomEmoji = tL_reactionEmoji;
            } else {
                TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji2 = new TLRPC.TL_reactionCustomEmoji();
                tL_reactionCustomEmoji2.document_id = p0Var.g;
                tL_reactionCustomEmoji = tL_reactionCustomEmoji2;
            }
            arrayList2.add(0, tL_reactionCustomEmoji);
        }
        if (!arrayList.isEmpty()) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ch.p0 p0Var2 = (ch.p0) arrayList.get(i7);
                if (p0Var2.g != 0) {
                    TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji3 = new TLRPC.TL_reactionCustomEmoji();
                    tL_reactionCustomEmoji3.document_id = p0Var2.g;
                    tL_messages_sendReaction.reaction.add(tL_reactionCustomEmoji3);
                    tL_messages_sendReaction.flags |= 1;
                } else if (p0Var2.f != null) {
                    TLRPC.TL_reactionEmoji tL_reactionEmoji2 = new TLRPC.TL_reactionEmoji();
                    tL_reactionEmoji2.emoticon = p0Var2.f;
                    tL_messages_sendReaction.reaction.add(tL_reactionEmoji2);
                    tL_messages_sendReaction.flags |= 1;
                }
            }
        }
        if (z10) {
            tL_messages_sendReaction.flags |= 2;
            tL_messages_sendReaction.big = true;
        }
        getConnectionsManager().sendRequest(tL_messages_sendReaction, new t4(9, this, diVar));
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
    public final void t(gj gjVar, TLRPC.TL_inputPollAnswer tL_inputPollAnswer, TLRPC.TL_photo tL_photo, f20 f20Var, TLRPC.TL_document tL_document, String str, TLRPC.PhotoSize photoSize, HashMap hashMap, boolean z10, boolean z11, Object obj) {
        Object obj2;
        boolean z12;
        char c10;
        Object obj3;
        HashMap hashMap2;
        f20 f20Var2;
        char c11;
        TLRPC.TL_document tL_document2;
        String str2;
        f20 f20Var3;
        String str3;
        char c12;
        char c13;
        long j3;
        HashMap hashMap3;
        TLRPC.InputMedia inputMedia;
        boolean z13;
        TLRPC.InputMedia inputMedia2;
        my myVar;
        TLRPC.InputMedia inputMedia3;
        boolean z14;
        f20 f20Var4;
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
        TLRPC.EncryptedChat c15;
        TLRPC.TL_photo tL_photo2 = tL_photo;
        TLRPC.TL_document tL_document3 = tL_document;
        String str6 = str;
        if (gjVar == null) {
            return;
        }
        HashMap hashMap4 = hashMap == null ? new HashMap() : hashMap;
        TLRPC.Message message = gjVar.k;
        gjVar.q1 = false;
        try {
            long A0 = gjVar.A0();
            boolean z20 = !n5.C(A0) || ((c15 = getMessagesController().c1(Integer.valueOf(n5.h(A0)))) != null && g0.X0(c15.layer) >= 101);
            if (z10) {
                TLRPC.MessageMedia messageMedia = gjVar.k.media;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaWebPage) && messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                        tL_photo2 = (TLRPC.TL_photo) messageMedia.photo;
                        f20Var2 = f20Var;
                        c14 = 2;
                    } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                        tL_document3 = (TLRPC.TL_document) messageMedia.document;
                        if (!gj.K4(tL_document3) && f20Var == null) {
                            c14 = 7;
                            f20Var2 = gjVar.r0;
                        }
                        c14 = 3;
                        f20Var2 = gjVar.r0;
                    } else {
                        f20Var2 = f20Var;
                        c14 = messageMedia instanceof TLRPC.TL_messageMediaToDo ? '\n' : (char) 65535;
                    }
                    hashMap2 = message.params;
                    obj3 = (obj == null || hashMap2 == null || !hashMap2.containsKey("parentObject")) ? obj : hashMap2.get("parentObject");
                    gjVar.y1 = message.message;
                    gjVar.z1 = message.entities;
                    obj2 = "originalPath";
                    z12 = z20;
                    c10 = c14;
                    str6 = message.attachPath;
                }
                f20Var2 = f20Var;
                c14 = 1;
                hashMap2 = message.params;
                if (obj == null) {
                }
                gjVar.y1 = message.message;
                gjVar.z1 = message.entities;
                obj2 = "originalPath";
                z12 = z20;
                c10 = c14;
                str6 = message.attachPath;
            } else {
                TLRPC.MessageMedia messageMedia2 = message.media;
                gjVar.D1 = messageMedia2;
                gjVar.C1 = message.message;
                gjVar.F1 = message.entities;
                gjVar.G1 = message.attachPath;
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
                    gjVar.E1 = tL_document3;
                    if (tL_photo2 != null) {
                        TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
                        tL_pollAnswer.media = tL_messageMediaPhoto;
                        tL_messageMediaPhoto.flags |= 3;
                        tL_messageMediaPhoto.photo = tL_photo2;
                        tL_messageMediaPhoto.spoiler = z11;
                        if (str6 == null || str6.length() <= 0 || !str6.startsWith("http")) {
                            ArrayList<TLRPC.PhotoSize> arrayList = tL_photo2.sizes;
                            TLRPC.FileLocation fileLocation = arrayList.get(arrayList.size() - 1).location;
                            w7.G(this.currentAccount);
                            message.attachPath = w7.K(fileLocation, true).toString();
                            w7.G(this.currentAccount);
                            sh.d.j(message, w7.K(fileLocation, true).toString(), size);
                        } else {
                            message.attachPath = str6;
                            sh.d.j(message, str6, size);
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
                        if (!gj.K4(tL_document3) && f20Var == null) {
                            c11 = 7;
                            if (f20Var != null) {
                                hashMap4.put("ve", f20Var.b());
                            }
                            message.attachPath = str6;
                            sh.d.j(message, str6, size);
                            if (!(photoSize instanceof cc)) {
                                TLRPC.MessageMedia messageMedia3 = tL_pollAnswer.media;
                                messageMedia3.flags |= 512;
                                messageMedia3.video_cover = ((cc) photoSize).a;
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
                        if (f20Var != null) {
                        }
                        message.attachPath = str6;
                        sh.d.j(message, str6, size);
                        if (!(photoSize instanceof cc)) {
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
                            w7.G(this.currentAccount);
                            message.attachPath = w7.K(fileLocation2, true).toString();
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
                        if (!gj.K4(tL_document3) && f20Var == null) {
                            c10 = 7;
                            if (f20Var != null) {
                                hashMap4.put("ve", f20Var.b());
                            }
                            message.attachPath = str6;
                            if (!(photoSize instanceof cc)) {
                                TLRPC.MessageMedia messageMedia5 = message.media;
                                messageMedia5.flags |= 512;
                                messageMedia5.video_cover = ((cc) photoSize).a;
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
                        if (f20Var != null) {
                        }
                        message.attachPath = str6;
                        if (!(photoSize instanceof cc)) {
                        }
                    } else {
                        c10 = gjVar.k.media instanceof TLRPC.TL_messageMediaToDo ? '\n' : (char) 1;
                    }
                }
                message.params = hashMap4;
                message.send_state = 3;
                message.errorNewPriceStars = 0L;
                message.errorAllowedPriceStars = 0L;
                obj3 = obj;
                hashMap2 = hashMap4;
                f20Var2 = f20Var;
            }
            if (message.attachPath == null) {
                message.attachPath = "";
            }
            message.local_id = 0;
            int i7 = gjVar.D;
            if ((i7 == 3 || f20Var2 != null || i7 == 2) && !TextUtils.isEmpty(message.attachPath)) {
                gjVar.y0 = true;
            }
            f20 f20Var5 = gjVar.r0;
            if (f20Var5 != null && f20Var2 == null) {
                f20Var2 = f20Var5;
            }
            if (z10) {
                tL_document2 = tL_document3;
                str2 = str6;
                f20Var3 = f20Var2;
            } else {
                CharSequence charSequence = gjVar.y1;
                if (charSequence != null) {
                    String str7 = message.message;
                    String charSequence2 = charSequence.toString();
                    message.message = charSequence2;
                    gjVar.z = null;
                    if (c10 == 1) {
                        ArrayList<TLRPC.MessageEntity> arrayList3 = gjVar.z1;
                        if (arrayList3 != null) {
                            message.entities = arrayList3;
                            message.flags |= 128;
                        } else if (!TextUtils.equals(str7, charSequence2)) {
                            message.flags &= -129;
                        }
                        TLRPC.Message message2 = gjVar.k;
                        if (message2 != null && (message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                            gjVar.k0();
                        }
                    } else {
                        ArrayList<TLRPC.MessageEntity> arrayList4 = gjVar.z1;
                        if (arrayList4 != null) {
                            message.entities = arrayList4;
                            message.flags |= 128;
                            tL_document2 = tL_document3;
                            f20Var3 = f20Var2;
                            z19 = z12;
                        } else {
                            f20Var3 = f20Var2;
                            tL_document2 = tL_document3;
                            z19 = z12;
                            ArrayList<TLRPC.MessageEntity> Y = getMediaDataController().Y(new CharSequence[]{gjVar.y1}, z19, true);
                            if (Y != null && !Y.isEmpty()) {
                                message.entities = Y;
                                message.flags |= 128;
                            } else if (!TextUtils.equals(str7, message.message)) {
                                message.flags &= -129;
                            }
                        }
                        gjVar.k0();
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(message);
                        getMessagesStorage().i1(0, gjVar.r1 ? 1 : 0, 0L, arrayList5, false);
                        f00 U1 = getMessagesController().U1();
                        z12 = z19;
                        str2 = str6;
                        tL_forumTopic = (TLRPC.TL_forumTopic) U1.e.f(f00.p(message.id, -message.dialog_id));
                        if (tL_forumTopic != null) {
                            tL_forumTopic.topMessage = message;
                            U1.y(-message.dialog_id, true);
                        }
                        gjVar.D = -1;
                        gjVar.L5();
                        if (c10 == 1) {
                            TLRPC.MessageMedia messageMedia7 = gjVar.k.media;
                            if (!(messageMedia7 instanceof TLRPC.TL_messageMediaPhoto) && !(messageMedia7 instanceof TLRPC.TL_messageMediaDocument)) {
                                gjVar.S1 = false;
                                gjVar.I();
                            }
                            gjVar.k0();
                        }
                        gjVar.P(tL_inputPollAnswer == null);
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(gjVar);
                        getNotificationCenter().k(ls.m0, Long.valueOf(A0), arrayList6);
                    }
                }
                tL_document2 = tL_document3;
                f20Var3 = f20Var2;
                z19 = z12;
                ArrayList arrayList52 = new ArrayList();
                arrayList52.add(message);
                getMessagesStorage().i1(0, gjVar.r1 ? 1 : 0, 0L, arrayList52, false);
                f00 U12 = getMessagesController().U1();
                z12 = z19;
                str2 = str6;
                tL_forumTopic = (TLRPC.TL_forumTopic) U12.e.f(f00.p(message.id, -message.dialog_id));
                if (tL_forumTopic != null) {
                }
                gjVar.D = -1;
                gjVar.L5();
                if (c10 == 1) {
                }
                gjVar.P(tL_inputPollAnswer == null);
                ArrayList arrayList62 = new ArrayList();
                arrayList62.add(gjVar);
                getNotificationCenter().k(ls.m0, Long.valueOf(A0), arrayList62);
            }
            if (hashMap2 != null) {
                Object obj4 = obj2;
                if (hashMap2.containsKey(obj4)) {
                    str3 = (String) hashMap2.get(obj4);
                    char c16 = '\b';
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
                                        int i10 = 0;
                                        while (i10 < readInt32) {
                                            tL_inputMediaUploadedPhoto.stickers.add(TLRPC.InputDocument.TLdeserialize(serializedData3, serializedData3.readInt32(z21), z21));
                                            i10++;
                                            readInt32 = readInt32;
                                            c16 = c16;
                                            z21 = false;
                                        }
                                        c13 = c16;
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
                                    j3 = A0;
                                    my myVar2 = new my(this, j3);
                                    myVar2.e = 0;
                                    myVar2.m = gjVar;
                                    myVar2.f = str3;
                                    myVar2.K = obj3;
                                    myVar2.t = tL_inputMediaUploadedPhoto;
                                    myVar2.p = z14;
                                    if (str2 != null && str2.length() > 0) {
                                        String str8 = str2;
                                        if (str8.startsWith("http")) {
                                            myVar2.l = str8;
                                            inputMedia3 = inputMedia6;
                                            myVar = myVar2;
                                            hashMap3 = hashMap2;
                                        }
                                    }
                                    myVar2.g = tL_photo2.sizes.get(r10.size() - 1);
                                    myVar2.h = tL_photo2;
                                    inputMedia3 = inputMedia6;
                                    myVar = myVar2;
                                    hashMap3 = hashMap2;
                                } else {
                                    c13 = '\b';
                                    j3 = A0;
                                    if (c10 == 3) {
                                        TLRPC.InputMedia tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                                        tL_inputMediaUploadedDocument.spoiler = z11;
                                        if (hashMap2 != null && (str4 = (String) hashMap2.get("masks")) != null) {
                                            SerializedData serializedData4 = new SerializedData(Utilities.v(str4));
                                            boolean z22 = false;
                                            int readInt322 = serializedData4.readInt32(false);
                                            int i11 = 0;
                                            while (i11 < readInt322) {
                                                tL_inputMediaUploadedDocument.stickers.add(TLRPC.InputDocument.TLdeserialize(serializedData4, serializedData4.readInt32(z22), z22));
                                                i11++;
                                                readInt322 = readInt322;
                                                z22 = false;
                                            }
                                            tL_inputMediaUploadedDocument.flags |= 1;
                                            serializedData4.cleanup();
                                        }
                                        TLRPC.TL_document tL_document4 = tL_document2;
                                        tL_inputMediaUploadedDocument.mime_type = tL_document4.mime_type;
                                        tL_inputMediaUploadedDocument.attributes = tL_document4.attributes;
                                        if (gjVar.q3()) {
                                            f20Var4 = f20Var3;
                                        } else {
                                            if (f20Var3 != null) {
                                                f20Var4 = f20Var3;
                                            } else {
                                                f20Var4 = f20Var3;
                                            }
                                            tL_inputMediaUploadedDocument.nosound_video = true;
                                            boolean z23 = s2.a;
                                            a8.b("nosound_video = true");
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
                                        myVar = new my(this, j3);
                                        myVar.e = 1;
                                        myVar.m = gjVar;
                                        myVar.f = str3;
                                        myVar.K = obj3;
                                        myVar.t = tL_inputMediaUploadedDocument;
                                        if (!tL_document4.thumbs.isEmpty()) {
                                            TLRPC.PhotoSize photoSize2 = tL_document4.thumbs.get(0);
                                            if (!(photoSize2 instanceof TLRPC.TL_photoStrippedSize)) {
                                                myVar.g = photoSize2;
                                                myVar.h = tL_document4;
                                            }
                                        }
                                        myVar.o = f20Var4;
                                        if (photoSize instanceof cc) {
                                            tL_inputMediaUploadedDocument.video_cover = ((cc) photoSize).b;
                                            tL_inputMediaUploadedDocument.flags |= 64;
                                        } else if (photoSize != null && !(photoSize instanceof TLRPC.TL_photoStrippedSize)) {
                                            myVar.i = photoSize;
                                            z16 = true;
                                            myVar.p = z15;
                                            myVar.q = z16;
                                            z14 = z15;
                                            z17 = z16;
                                            inputMedia5 = inputMedia4;
                                            z18 = inputMedia5 instanceof TLRPC.TL_inputMediaEmpty;
                                            TLRPC.InputMedia inputMedia8 = inputMedia5;
                                            if (z18) {
                                                int i12 = gjVar.D;
                                                if (i12 != 0) {
                                                    inputMedia8 = inputMedia5;
                                                }
                                                inputMedia8 = null;
                                            }
                                            if (tL_inputPollAnswer != null) {
                                                tLObject = new TLRPC.TL_messages_addPollAnswer();
                                                tL_inputPollAnswer.input_media = inputMedia8;
                                                tLObject.answer = tL_inputPollAnswer;
                                                tLObject.msg_id = gjVar.e1();
                                                tLObject.peer = getMessagesController().l1(j3);
                                                if (myVar != null) {
                                                    myVar.c = tLObject;
                                                }
                                            } else {
                                                if (gjVar.b3()) {
                                                    TL_ephemeral.TL_editMessage tL_editMessage = new TL_ephemeral.TL_editMessage();
                                                    tL_editMessage.id = gj.S(gjVar.e1());
                                                    tL_editMessage.receiver_id = new TLRPC.TL_inputUserEmpty();
                                                    tL_editMessage.welcome = true;
                                                    tL_messages_editMessage = tL_editMessage;
                                                } else {
                                                    TLRPC.TL_messages_editMessage tL_messages_editMessage2 = new TLRPC.TL_messages_editMessage();
                                                    tL_messages_editMessage2.id = gjVar.e1();
                                                    tL_messages_editMessage = tL_messages_editMessage2;
                                                }
                                                tLObject = tL_messages_editMessage;
                                                tLObject.peer = getMessagesController().l1(j3);
                                                TLRPC.Message message3 = gjVar.k;
                                                tLObject.invert_media = message3.invert_media;
                                                if (inputMedia8 != null) {
                                                    tLObject.flags |= TLObject.FLAG_14;
                                                    tLObject.media = inputMedia8;
                                                } else if (!gjVar.A1) {
                                                    tLObject.no_webpage = true;
                                                }
                                                if (gjVar.r1) {
                                                    tLObject.schedule_date = message3.date;
                                                    int i13 = tLObject.flags;
                                                    tLObject.flags = 32768 | i13;
                                                    int i14 = message3.schedule_repeat_period;
                                                    if (i14 != 0) {
                                                        tLObject.schedule_repeat_period = i14;
                                                        tLObject.flags = i13 | 294912;
                                                    }
                                                }
                                                if ((message3.flags & TLObject.FLAG_30) != 0) {
                                                    tLObject.quick_reply_shortcut_id = message3.quick_reply_shortcut_id;
                                                    tLObject.flags |= 131072;
                                                }
                                                CharSequence charSequence3 = gjVar.y1;
                                                if (charSequence3 != null) {
                                                    tLObject.message = charSequence3.toString();
                                                    int i15 = tLObject.flags;
                                                    tLObject.flags = i15 | 2048;
                                                    tLObject.no_webpage = !gjVar.A1;
                                                    ArrayList<TLRPC.MessageEntity> arrayList7 = gjVar.z1;
                                                    if (arrayList7 != null) {
                                                        tLObject.entities = arrayList7;
                                                        tLObject.flags = i15 | 2056;
                                                    } else {
                                                        ArrayList<TLRPC.MessageEntity> Y2 = getMediaDataController().Y(new CharSequence[]{gjVar.y1}, z12, true);
                                                        if (Y2 != null && !Y2.isEmpty()) {
                                                            tLObject.entities = Y2;
                                                            tLObject.flags |= 8;
                                                        }
                                                    }
                                                    gjVar.y1 = null;
                                                    gjVar.z1 = null;
                                                }
                                                if (myVar != null) {
                                                    myVar.c = tLObject;
                                                }
                                            }
                                            if (c10 != 1 || c10 == 11) {
                                                N(tLObject, gjVar, null, myVar, obj3, hashMap3, gjVar.r1);
                                            }
                                            try {
                                                if (c10 == 2) {
                                                    if (!z14 && !z17) {
                                                        O(tLObject, gjVar, str3, null, true, myVar, obj3, hashMap3, gjVar.r1);
                                                        return;
                                                    }
                                                    L(myVar);
                                                    return;
                                                }
                                                HashMap hashMap5 = hashMap3;
                                                if (c10 == 3) {
                                                    if (!z14 && !z17) {
                                                        N(tLObject, gjVar, str3, myVar, obj3, hashMap5, gjVar.r1);
                                                        return;
                                                    }
                                                    L(myVar);
                                                    return;
                                                }
                                                try {
                                                    if (c10 == 6) {
                                                        N(tLObject, gjVar, str3, myVar, obj3, hashMap5, gjVar.r1);
                                                        return;
                                                    }
                                                    if (c10 == 7) {
                                                        if (z14 || z17) {
                                                            L(myVar);
                                                            return;
                                                        }
                                                        try {
                                                            N(tLObject, gjVar, str3, myVar, obj3, hashMap5, gjVar.r1);
                                                            return;
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            a8.f(e);
                                                            l0(gjVar);
                                                            return;
                                                        }
                                                    }
                                                    if (c10 != c13) {
                                                        if (c10 == '\n') {
                                                            N(tLObject, gjVar, str3, myVar, obj3, hashMap5, gjVar.r1);
                                                            return;
                                                        }
                                                        return;
                                                    } else {
                                                        if (!z14 && !z17) {
                                                            N(tLObject, gjVar, str3, myVar, obj3, hashMap5, gjVar.r1);
                                                            return;
                                                        }
                                                        L(myVar);
                                                        return;
                                                    }
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    a8.f(e);
                                                    l0(gjVar);
                                                    return;
                                                }
                                            } catch (Exception e12) {
                                                e = e12;
                                            }
                                        }
                                        z16 = false;
                                        myVar.p = z15;
                                        myVar.q = z16;
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
                                        N(tLObject, gjVar, null, myVar, obj3, hashMap3, gjVar.r1);
                                    }
                                    f20 f20Var6 = f20Var3;
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
                                        myVar = new my(this, j3);
                                        myVar.f = str3;
                                        myVar.e = 2;
                                        myVar.m = gjVar;
                                        if (!tL_document5.thumbs.isEmpty() && (f20Var6 == null || !f20Var6.N)) {
                                            TLRPC.PhotoSize photoSize3 = tL_document5.thumbs.get(0);
                                            if (!(photoSize3 instanceof TLRPC.TL_photoStrippedSize)) {
                                                myVar.g = photoSize3;
                                                myVar.h = tL_document5;
                                            }
                                        }
                                        myVar.K = obj3;
                                        myVar.t = tL_inputMediaUploadedDocument2;
                                        myVar.p = z13;
                                        inputMedia3 = inputMedia2;
                                        z14 = z13;
                                    } else if (c10 == '\n') {
                                        TLRPC.MessageMedia n1 = gj.n1(gjVar.k);
                                        if (n1 instanceof TLRPC.TL_messageMediaToDo) {
                                            TLRPC.TL_inputMediaTodo tL_inputMediaTodo = new TLRPC.TL_inputMediaTodo();
                                            tL_inputMediaTodo.todo = ((TLRPC.TL_messageMediaToDo) n1).todo;
                                            inputMedia = tL_inputMediaTodo;
                                            z14 = false;
                                            z17 = false;
                                            myVar = null;
                                            inputMedia5 = inputMedia;
                                            z18 = inputMedia5 instanceof TLRPC.TL_inputMediaEmpty;
                                            TLRPC.InputMedia inputMedia822 = inputMedia5;
                                            if (z18) {
                                            }
                                            if (tL_inputPollAnswer != null) {
                                            }
                                            if (c10 != 1) {
                                            }
                                            N(tLObject, gjVar, null, myVar, obj3, hashMap3, gjVar.r1);
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
                                N(tLObject, gjVar, null, myVar, obj3, hashMap3, gjVar.r1);
                            }
                            TLRPC.MessageMedia messageMedia8 = message.media;
                            if ((messageMedia8 == null || (messageMedia8 instanceof TLRPC.TL_messageMediaEmpty) || (messageMedia8.webpage instanceof TLRPC.TL_webPageEmpty)) && !gjVar.A1) {
                                inputMedia7 = new TLRPC.TL_inputMediaEmpty();
                            } else if (messageMedia8 == null || messageMedia8.webpage == null) {
                                c13 = '\b';
                                hashMap3 = hashMap2;
                                j3 = A0;
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
                            myVar = null;
                            inputMedia5 = inputMedia;
                            z18 = inputMedia5 instanceof TLRPC.TL_inputMediaEmpty;
                            TLRPC.InputMedia inputMedia82222 = inputMedia5;
                            if (z18) {
                            }
                            if (tL_inputPollAnswer != null) {
                            }
                            if (c10 != 1) {
                            }
                            N(tLObject, gjVar, null, myVar, obj3, hashMap3, gjVar.r1);
                        }
                        inputMedia7 = tL_inputPollAnswer.input_media;
                        c13 = '\b';
                        hashMap3 = hashMap2;
                        j3 = A0;
                        inputMedia = inputMedia7;
                        z14 = false;
                        z17 = false;
                        myVar = null;
                        inputMedia5 = inputMedia;
                        z18 = inputMedia5 instanceof TLRPC.TL_inputMediaEmpty;
                        TLRPC.InputMedia inputMedia822222 = inputMedia5;
                        if (z18) {
                        }
                        if (tL_inputPollAnswer != null) {
                        }
                        if (c10 != 1) {
                        }
                        N(tLObject, gjVar, null, myVar, obj3, hashMap3, gjVar.r1);
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
                        j3 = A0;
                        inputMedia = inputMedia7;
                        z14 = false;
                        z17 = false;
                        myVar = null;
                        inputMedia5 = inputMedia;
                        z18 = inputMedia5 instanceof TLRPC.TL_inputMediaEmpty;
                        TLRPC.InputMedia inputMedia8222222 = inputMedia5;
                        if (z18) {
                        }
                        if (tL_inputPollAnswer != null) {
                        }
                        if (c10 != 1) {
                        }
                        N(tLObject, gjVar, null, myVar, obj3, hashMap3, gjVar.r1);
                    }
                    c12 = 11;
                    if (c10 == c12) {
                    }
                    c13 = '\b';
                    hashMap3 = hashMap2;
                    j3 = A0;
                    inputMedia = inputMedia7;
                    z14 = false;
                    z17 = false;
                    myVar = null;
                    inputMedia5 = inputMedia;
                    z18 = inputMedia5 instanceof TLRPC.TL_inputMediaEmpty;
                    TLRPC.InputMedia inputMedia82222222 = inputMedia5;
                    if (z18) {
                    }
                    if (tL_inputPollAnswer != null) {
                    }
                    if (c10 != 1) {
                    }
                    N(tLObject, gjVar, null, myVar, obj3, hashMap3, gjVar.r1);
                }
            }
            str3 = null;
            char c162 = '\b';
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
            j3 = A0;
            inputMedia = inputMedia7;
            z14 = false;
            z17 = false;
            myVar = null;
            inputMedia5 = inputMedia;
            z18 = inputMedia5 instanceof TLRPC.TL_inputMediaEmpty;
            TLRPC.InputMedia inputMedia822222222 = inputMedia5;
            if (z18) {
            }
            if (tL_inputPollAnswer != null) {
            }
            if (c10 != 1) {
            }
            N(tLObject, gjVar, null, myVar, obj3, hashMap3, gjVar.r1);
        } catch (Exception e13) {
            e = e13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t0(my myVar, boolean z10) {
        my myVar2;
        ArrayList arrayList;
        int i7;
        my myVar3 = myVar;
        ArrayList arrayList2 = myVar3.x;
        long j3 = myVar3.a;
        if (arrayList2.isEmpty()) {
            myVar3.c();
            return;
        }
        String str = "group_" + myVar3.F;
        int i10 = 1;
        if (myVar3.G != ((gj) i5.c.h(1, myVar3.x)).e1()) {
            if (!z10) {
                boolean z11 = s2.a;
                a8.b("final message not added");
                return;
            } else {
                boolean z12 = s2.a;
                a8.b("final message not added, add");
                e0(str, myVar3);
                return;
            }
        }
        if (z10) {
            this.a.remove(str);
            gj gjVar = myVar3.m;
            if (gjVar != null && gj.d5(gjVar.k)) {
                i10 = 9;
            } else if (!myVar3.H) {
                gj gjVar2 = myVar3.m;
                if ((gjVar2 == null || !gj.b4(gjVar2.k)) && ((arrayList = myVar3.x) == null || arrayList.isEmpty() || !gj.b4(((gj) myVar3.x.get(0)).k))) {
                    i7 = 0;
                    if (!myVar3.I || myVar3.J) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add((gj) myVar3.x.get(0));
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add((TLRPC.Message) myVar3.z.get(0));
                        getMessagesStorage().j1(arrayList4, false, true, false, 0, false, i7, 0L);
                        getMessagesController().x5(i7, j3, arrayList3);
                    } else {
                        getMessagesStorage().j1(myVar3.z, false, true, false, 0, false, i7, 0L);
                        getMessagesController().x5(i7, j3, myVar3.x);
                    }
                    if (!myVar3.H) {
                        getNotificationCenter().k(ls.s, new Object[0]);
                    }
                    boolean z13 = s2.a;
                    a8.b("add message");
                } else {
                    i10 = 5;
                }
            }
            i7 = i10;
            if (myVar3.I) {
            }
            ArrayList arrayList32 = new ArrayList();
            arrayList32.add((gj) myVar3.x.get(0));
            ArrayList arrayList42 = new ArrayList();
            arrayList42.add((TLRPC.Message) myVar3.z.get(0));
            getMessagesStorage().j1(arrayList42, false, true, false, 0, false, i7, 0L);
            getMessagesController().x5(i7, j3, arrayList32);
            if (!myVar3.H) {
            }
            boolean z132 = s2.a;
            a8.b("add message");
        }
        TLObject tLObject = myVar3.c;
        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject;
            while (r4 < tL_messages_sendMultiMedia.multi_media.size()) {
                TLRPC.InputMedia inputMedia = tL_messages_sendMultiMedia.multi_media.get(r4).media;
                if ((inputMedia instanceof TLRPC.TL_inputMediaUploadedPhoto) || (inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument)) {
                    boolean z14 = s2.a;
                    a8.b("multi media not ready");
                    return;
                }
                if ((inputMedia instanceof TLRPC.TL_inputMediaDocument) && r4 < myVar3.x.size()) {
                    gj gjVar3 = (gj) myVar3.x.get(r4);
                    String str2 = gjVar3.k.attachPath;
                    if (str2 == null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(w7.z(4));
                        sb2.append("/");
                        str2 = a8.p0.r(sb2, gjVar3.F0().id, ".mp4");
                    }
                    if (myVar3.E.containsKey(str2 + "_ct") && inputMedia.video_cover == null) {
                        boolean z15 = s2.a;
                        a8.b("cover media not ready");
                        return;
                    }
                }
                r4++;
            }
            my y10 = y(myVar3.G, j3);
            if (y10 != null) {
                y10.a(myVar3.c, myVar3.x, myVar3.B, myVar3.y, myVar3, myVar3.H);
                ArrayList arrayList5 = myVar3.b;
                if (arrayList5 != null) {
                    y10.b.addAll(arrayList5);
                }
                boolean z16 = s2.a;
                a8.b("has maxDelayedMessage, delay");
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
                                TLRPC.InputMedia e10 = sh.d.e(tL_inputMediaPoll, r4);
                                r4 = ((e10 instanceof TLRPC.TL_inputMediaUploadedPhoto) || (e10 instanceof TLRPC.TL_inputMediaUploadedDocument)) ? 0 : r4 + 1;
                            }
                            my y11 = y(myVar3.G, j3);
                            if (y11 != null) {
                                y11.a(myVar3.c, myVar3.x, myVar3.B, myVar3.y, myVar3, myVar3.H);
                                ArrayList arrayList6 = myVar3.b;
                                if (arrayList6 != null) {
                                    y11.b.addAll(arrayList6);
                                }
                                boolean z18 = s2.a;
                                a8.b("has maxDelayedMessage, delay");
                                return;
                            }
                        }
                    }
                    boolean z19 = s2.a;
                    a8.b("multi media not ready");
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
                            boolean z20 = s2.a;
                            a8.b("multi media not ready");
                            return;
                        }
                        r4++;
                    }
                    my y12 = y(myVar3.G, j3);
                    if (y12 != null) {
                        y12.a(myVar3.c, myVar3.x, myVar3.B, myVar3.y, myVar3, myVar3.H);
                        ArrayList arrayList7 = myVar3.b;
                        if (arrayList7 != null) {
                            y12.b.addAll(arrayList7);
                        }
                        boolean z21 = s2.a;
                        a8.b("has maxDelayedMessage, delay");
                        return;
                    }
                }
            }
            TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) myVar3.d;
            while (r4 < tL_messages_sendEncryptedMultiMedia.files.size()) {
                if (tL_messages_sendEncryptedMultiMedia.files.get(r4) instanceof TLRPC.TL_inputEncryptedFile) {
                    return;
                } else {
                    r4++;
                }
            }
        }
        TLObject tLObject2 = myVar3.c;
        if (tLObject2 instanceof TLRPC.TL_messages_sendMultiMedia) {
            myVar2 = myVar3;
            P((TLRPC.TL_messages_sendMultiMedia) tLObject2, myVar3.x, myVar3.B, myVar3.y, myVar2, myVar2.H);
        } else if (!(tLObject2 instanceof TLRPC.TL_messages_sendMedia)) {
            getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) myVar3.d, myVar3);
            myVar3.d();
        } else {
            myVar2 = myVar3;
            P((TLRPC.TL_messages_sendMedia) tLObject2, myVar3.x, myVar3.B, myVar3.y, myVar2, myVar2.H);
        }
        myVar3 = myVar2;
        myVar3.d();
    }

    public final void u(gj gjVar, org.telegram.ui.ActionBar.g2 g2Var, int i7, int i10) {
        TLRPC.TL_messages_editMessage tL_messages_editMessage;
        if (g2Var == null || g2Var.getParentActivity() == null) {
            return;
        }
        if (gj.c3(gjVar.k)) {
            TL_ephemeral.TL_editMessage tL_editMessage = new TL_ephemeral.TL_editMessage();
            tL_editMessage.id = gj.S(gjVar.e1());
            tL_editMessage.receiver_id = new TLRPC.TL_inputUserEmpty();
            tL_editMessage.welcome = true;
            tL_messages_editMessage = tL_editMessage;
        } else {
            TLRPC.TL_messages_editMessage tL_messages_editMessage2 = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage2.id = gjVar.e1();
            tL_messages_editMessage = tL_messages_editMessage2;
        }
        tL_messages_editMessage.peer = getMessagesController().l1(gj.B0(gjVar.k));
        TLRPC.Message message = gjVar.k;
        if (message != null && (message.flags & TLObject.FLAG_30) != 0) {
            tL_messages_editMessage.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
            tL_messages_editMessage.flags |= 131072;
        }
        if (i7 != 0) {
            tL_messages_editMessage.schedule_date = i7;
            int i11 = tL_messages_editMessage.flags;
            tL_messages_editMessage.flags = 32768 | i11;
            if (i10 != 0) {
                tL_messages_editMessage.schedule_repeat_period = i10;
                tL_messages_editMessage.flags = i11 | 294912;
            }
        }
        getConnectionsManager().sendRequest(tL_messages_editMessage, new di(this, g2Var, tL_messages_editMessage, 11));
    }

    public final void u0(TLRPC.Document document, String str, final long j3, final CharSequence charSequence, final f20 f20Var, final gj gjVar, final gj gjVar2, final TL_stories.StoryItem storyItem, final org.telegram.ui.rm rmVar, final cj cjVar, final boolean z10, final int i7, final int i10, boolean z11, final Object obj, final cw cwVar, final long j10, final long j11, final lj ljVar, final boolean z12) {
        final TLRPC.Document document2;
        TLRPC.PhotoSize photoSize;
        byte[] bArr;
        if (document == null) {
            return;
        }
        HashMap hashMap = null;
        if (n5.C(j3)) {
            if (getMessagesController().c1(Integer.valueOf((int) (j3 & 4294967295L))) == null) {
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
            for (int i11 = 0; i11 < document.attributes.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
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
            TLRPC.PhotoSize w10 = w7.w(document.thumbs, 10, false, null, false);
            if ((w10 instanceof TLRPC.TL_photoSize) || (w10 instanceof TLRPC.TL_photoSizeProgressive) || (w10 instanceof TLRPC.TL_photoStrippedSize)) {
                w7.G(this.currentAccount);
                File J2 = w7.J(w10, null, true, true);
                if ((w10 instanceof TLRPC.TL_photoStrippedSize) || J2.exists()) {
                    try {
                        if (w10 instanceof TLRPC.TL_photoStrippedSize) {
                            photoSize = new TLRPC.TL_photoStrippedSize();
                            bArr = w10.bytes;
                        } else {
                            TLRPC.TL_photoCachedSize tL_photoCachedSize = new TLRPC.TL_photoCachedSize();
                            J2.length();
                            byte[] bArr3 = new byte[(int) J2.length()];
                            new RandomAccessFile(J2, "r").readFully(bArr3);
                            photoSize = tL_photoCachedSize;
                            bArr = bArr3;
                        }
                        TLRPC.TL_fileLocation_layer82 tL_fileLocation_layer82 = new TLRPC.TL_fileLocation_layer82();
                        TLRPC.FileLocation fileLocation = w10.location;
                        tL_fileLocation_layer82.dc_id = fileLocation.dc_id;
                        tL_fileLocation_layer82.volume_id = fileLocation.volume_id;
                        tL_fileLocation_layer82.local_id = fileLocation.local_id;
                        tL_fileLocation_layer82.secret = fileLocation.secret;
                        photoSize.location = tL_fileLocation_layer82;
                        photoSize.size = w10.size;
                        photoSize.w = w10.w;
                        photoSize.h = w10.h;
                        photoSize.type = w10.type;
                        photoSize.bytes = bArr;
                        document2.thumbs.add(photoSize);
                        document2.flags |= 1;
                    } catch (Exception e10) {
                        a8.g(e10, true);
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
        if (gj.s3(document2, false)) {
            J.c(new Runnable() { // from class: org.telegram.messenger.ay
                @Override // java.lang.Runnable
                public final void run() {
                    final Bitmap[] bitmapArr = new Bitmap[1];
                    final TLRPC.Document document3 = document2;
                    String q10 = gc.b(document3).q(null, null, false);
                    String str2 = "video/mp4".equals(document3.mime_type) ? ".mp4" : "video/x-matroska".equals(document3.mime_type) ? ".mkv" : "";
                    File file = new File(w7.z(3), p5.c.v(q10, str2));
                    if (!file.exists()) {
                        file = new File(w7.z(2), p5.c.v(q10, str2));
                    }
                    final az azVar = az.this;
                    az.w(azVar.getAccountInstance(), false, document3, file.getAbsolutePath(), null, 0L, false);
                    final String[] strArr = {az.D(azVar.getAccountInstance(), w7.w(document3.thumbs, ls.r5, false, null, false), bitmapArr, true, true)};
                    final long j12 = j3;
                    final f20 f20Var2 = f20Var;
                    final gj gjVar3 = gjVar;
                    final gj gjVar4 = gjVar2;
                    final boolean z13 = z10;
                    final int i12 = i7;
                    final int i13 = i10;
                    final Object obj2 = obj;
                    final cj cjVar2 = cjVar;
                    final TL_stories.StoryItem storyItem2 = storyItem;
                    final org.telegram.ui.rm rmVar2 = rmVar;
                    final cw cwVar2 = cwVar;
                    final long j13 = j10;
                    final long j14 = j11;
                    final lj ljVar2 = ljVar;
                    final CharSequence charSequence2 = charSequence;
                    final boolean z14 = z12;
                    g0.g3(new Runnable() { // from class: org.telegram.messenger.vw
                        @Override // java.lang.Runnable
                        public final void run() {
                            az azVar2 = az.this;
                            azVar2.getClass();
                            Bitmap[] bitmapArr2 = bitmapArr;
                            if (bitmapArr2[0] != null) {
                                String[] strArr2 = strArr;
                                if (strArr2[0] != null) {
                                    fc.D().O(new BitmapDrawable(bitmapArr2[0]), strArr2[0], false);
                                }
                            }
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document3;
                            long j15 = j12;
                            yy f10 = yy.f(tL_document, n5.C(j15) ? null : f20Var2, null, j15, gjVar3, gjVar4, null, null, null, null, z13, i12, i13, 0, obj2, cjVar2, false);
                            f10.H = storyItem2;
                            f10.J = rmVar2;
                            f10.K = cwVar2;
                            f10.Q = j13;
                            f10.R = j14;
                            f10.T = ljVar2;
                            CharSequence charSequence3 = charSequence2;
                            f10.b = charSequence3 != null ? charSequence3.toString() : null;
                            f10.L = z14;
                            azVar2.r0(f10);
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
        yy f10 = yy.f((TLRPC.TL_document) document2, null, null, j3, gjVar, gjVar2, null, null, null, hashMap, z10, i7, i10, 0, obj, cjVar, z11);
        f10.H = storyItem;
        f10.J = rmVar;
        f10.K = cwVar;
        f10.Q = j10;
        f10.R = j11;
        f10.T = ljVar;
        f10.L = z12;
        r0(f10);
    }

    public final void v(gj gjVar, TL_iv.RichMessage richMessage, ArrayList arrayList, org.telegram.ui.ActionBar.g2 g2Var, boolean z10) {
        TLRPC.TL_messages_editMessage tL_messages_editMessage;
        if (gjVar == null || richMessage == null || gjVar.k == null) {
            return;
        }
        if (gjVar.Y2() && gjVar.k.reqId != 0) {
            getConnectionsManager().cancelRequest(gjVar.k.reqId, true);
            gjVar.k.reqId = 0;
        }
        if (gj.c3(gjVar.k)) {
            TL_ephemeral.TL_editMessage tL_editMessage = new TL_ephemeral.TL_editMessage();
            tL_editMessage.id = gj.S(gjVar.e1());
            tL_editMessage.receiver_id = new TLRPC.TL_inputUserEmpty();
            tL_editMessage.welcome = true;
            tL_messages_editMessage = tL_editMessage;
        } else {
            TLRPC.TL_messages_editMessage tL_messages_editMessage2 = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage2.id = gjVar.e1();
            tL_messages_editMessage = tL_messages_editMessage2;
        }
        TLRPC.TL_messages_editMessage tL_messages_editMessage3 = tL_messages_editMessage;
        tL_messages_editMessage3.peer = getMessagesController().l1(gj.B0(gjVar.k));
        tL_messages_editMessage3.rich_message = m0(arrayList, richMessage);
        int i7 = tL_messages_editMessage3.flags;
        tL_messages_editMessage3.flags = 8388608 | i7;
        if (gjVar.r1) {
            tL_messages_editMessage3.schedule_date = gjVar.k.date;
            tL_messages_editMessage3.flags = i7 | 8421376;
        }
        TLRPC.Message message = gjVar.k;
        if ((message.flags & TLObject.FLAG_30) != 0) {
            tL_messages_editMessage3.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
            tL_messages_editMessage3.flags |= 131072;
        }
        message.rich_message = richMessage;
        message.send_state = 3;
        int sendRequest = getConnectionsManager().sendRequest(tL_messages_editMessage3, new r4(gjVar, this, tL_messages_editMessage3, g2Var, z10));
        TLRPC.Message message2 = gjVar.k;
        if (message2 != null) {
            message2.reqId = sendRequest;
        }
        getNotificationCenter().k(ls.m0, Long.valueOf(gj.B0(gjVar.k)), f3.i(gjVar));
    }

    public final void v0(TLRPC.Document document, String str, long j3, gj gjVar, gj gjVar2, TL_stories.StoryItem storyItem, org.telegram.ui.rm rmVar, cj cjVar, boolean z10, int i7, int i10, boolean z11, Object obj, cw cwVar, long j10, long j11, lj ljVar) {
        u0(document, str, j3, null, null, gjVar, gjVar2, storyItem, rmVar, cjVar, z10, i7, i10, z11, obj, cwVar, j10, j11, ljVar, false);
    }

    public final int w0(gj gjVar, ArrayList arrayList, Runnable runnable) {
        byte[] bArr;
        if (gjVar != null) {
            String str = "poll_" + gjVar.D1();
            if (!this.r.containsKey(str)) {
                TLRPC.TL_messages_sendVote tL_messages_sendVote = new TLRPC.TL_messages_sendVote();
                tL_messages_sendVote.msg_id = gjVar.e1();
                tL_messages_sendVote.peer = getMessagesController().l1(gj.B0(gjVar.k));
                if (arrayList != null) {
                    bArr = new byte[arrayList.size()];
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) arrayList.get(i7);
                        if (pollAnswer != null) {
                            tL_messages_sendVote.options.add(pollAnswer.option);
                            bArr[i7] = pollAnswer.option[0];
                        }
                    }
                } else {
                    bArr = new byte[0];
                }
                this.w.put(str, bArr);
                return getConnectionsManager().sendRequest(tL_messages_sendVote, new q6(this, gjVar, str, runnable, 5));
            }
        }
        return 0;
    }

    public final my y(int i7, long j3) {
        int e12;
        Iterator it = this.a.entrySet().iterator();
        my myVar = null;
        int i10 = TLObject.FLAG_31;
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) ((Map.Entry) it.next()).getValue();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                my myVar2 = (my) arrayList.get(i11);
                int i12 = myVar2.e;
                if ((i12 == 4 || i12 == 0) && myVar2.a == j3) {
                    gj gjVar = myVar2.m;
                    if (gjVar != null) {
                        e12 = gjVar.e1();
                    } else {
                        ArrayList arrayList2 = myVar2.x;
                        e12 = (arrayList2 == null || arrayList2.isEmpty()) ? 0 : ((gj) i5.c.h(1, myVar2.x)).e1();
                    }
                    if (e12 != 0 && e12 > i7 && myVar == null && i10 < e12) {
                        myVar = myVar2;
                        i10 = e12;
                    }
                }
            }
        }
        return myVar;
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
    public final void z0(gj gjVar, TLRPC.Message message, int i7, List list, boolean z10, int i10, HashMap hashMap) {
        List list2;
        String str;
        az azVar;
        gj gjVar2;
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
        gj gjVar3;
        TLRPC.Photo photo;
        boolean z13;
        TLRPC.Photo photo2;
        String str7;
        String str8;
        String str9;
        TLRPC.PhotoSize photoSize2;
        TLRPC.Photo photo3;
        TLRPC.PhotoSize photoSize3;
        int i11;
        boolean z14;
        TLRPC.Photo photo4;
        int i12;
        String str10;
        File file;
        f20 f20Var;
        TLRPC.MessageMedia messageMedia2;
        String str11;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia5;
        TLRPC.PhotoSize photoSize4;
        int i13;
        TLRPC.Message message4;
        int i14;
        int i15;
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
        TLRPC.PhotoSize w10;
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
        az azVar2 = this;
        TLRPC.Message message5 = message;
        TLRPC.Message message6 = gjVar.k;
        if (list.isEmpty() || Math.max(0, i10) >= list.size()) {
            list2 = list;
            str = null;
        } else {
            list2 = list;
            str = (String) list2.get(Math.max(0, i10));
        }
        TLRPC.MessageMedia messageMedia8 = message5 == null ? null : message5.media;
        TLRPC.MessageMedia messageMedia9 = message6 == null ? null : message6.media;
        TLRPC.MessageMedia messageMedia10 = message6.media;
        if (messageMedia10 != null) {
            if (messageMedia10.storyItem != null) {
                message5.media = messageMedia10;
            } else if (!(messageMedia10 instanceof TLRPC.TL_messageMediaWidget)) {
                if (gjVar.C3()) {
                    TLRPC.MessageMedia messageMedia11 = message5.media;
                    if (messageMedia11 instanceof TLRPC.TL_messageMediaGeoLive) {
                        message6.media.period = messageMedia11.period;
                    }
                }
                if (gjVar.T2()) {
                    TLRPC.TL_messageMediaDice tL_messageMediaDice = (TLRPC.TL_messageMediaDice) message6.media;
                    TLRPC.TL_messageMediaDice tL_messageMediaDice2 = (TLRPC.TL_messageMediaDice) message5.media;
                    tL_messageMediaDice.value = tL_messageMediaDice2.value;
                    tL_messageMediaDice.flags = tL_messageMediaDice2.flags;
                    tL_messageMediaDice.game_outcome = tL_messageMediaDice2.game_outcome;
                    di.y8.y(azVar2.currentAccount, true).N();
                } else {
                    TLRPC.MessageMedia messageMedia12 = message6.media;
                    TLRPC.Photo photo8 = messageMedia12.photo;
                    if (photo8 != null) {
                        photoSize5 = w7.w(photo8.sizes, 40, false, null, false);
                        w10 = (message5 == null || (messageMedia6 = message5.media) == null || (photo7 = messageMedia6.photo) == null) ? photoSize5 : w7.w(photo7.sizes, 40, false, null, false);
                        tLObject = message6.media.photo;
                    } else {
                        TLRPC.Document document4 = messageMedia12.document;
                        if (document4 != null) {
                            photoSize5 = w7.w(document4.thumbs, 40, false, null, false);
                            w10 = (message5 == null || (messageMedia5 = message5.media) == null || (document3 = messageMedia5.document) == null) ? photoSize5 : w7.w(document3.thumbs, 40, false, null, false);
                            tLObject = message6.media.document;
                        } else {
                            TLRPC.WebPage webPage3 = messageMedia12.webpage;
                            if (webPage3 != null) {
                                TLRPC.Photo photo9 = webPage3.photo;
                                if (photo9 != null) {
                                    photoSize5 = w7.w(photo9.sizes, 40, false, null, false);
                                    w10 = (message5 == null || (messageMedia4 = message5.media) == null || (webPage2 = messageMedia4.webpage) == null || (photo6 = webPage2.photo) == null) ? photoSize5 : w7.w(photo6.sizes, 40, false, null, false);
                                    tLObject = message6.media.webpage.photo;
                                } else {
                                    TLRPC.Document document5 = webPage3.document;
                                    if (document5 != null) {
                                        photoSize5 = w7.w(document5.thumbs, 40, false, null, false);
                                        w10 = (message5 == null || (messageMedia3 = message5.media) == null || (webPage = messageMedia3.webpage) == null || (document2 = webPage.document) == null) ? photoSize5 : w7.w(document2.thumbs, 40, false, null, false);
                                        tLObject = message6.media.webpage.document;
                                    }
                                }
                            } else if ((messageMedia12 instanceof TLRPC.TL_messageMediaPaidMedia) && (messageMedia8 instanceof TLRPC.TL_messageMediaPaidMedia)) {
                                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia12;
                                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageMedia8;
                                if (!tL_messageMediaPaidMedia.extended_media.isEmpty() && !tL_messageMediaPaidMedia2.extended_media.isEmpty()) {
                                    if (i10 == -1) {
                                        int i16 = 0;
                                        while (i16 < tL_messageMediaPaidMedia.extended_media.size()) {
                                            azVar2.z0(gjVar, message5, i7, list2, z10, i16, message5.params);
                                            i16++;
                                            azVar2 = azVar2;
                                            list2 = list;
                                        }
                                    } else {
                                        azVar = azVar2;
                                        gjVar2 = gjVar;
                                        z11 = z10;
                                        boolean z16 = tL_messageMediaPaidMedia2.extended_media.size() > 1;
                                        if (i10 < 0 || i10 >= tL_messageMediaPaidMedia2.extended_media.size()) {
                                            return;
                                        }
                                        TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia2.extended_media.get(i10);
                                        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                            TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia10 = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia;
                                            tL_messageExtendedMedia7 = tL_messageExtendedMedia10;
                                            messageMedia8 = tL_messageExtendedMedia10.media;
                                        } else {
                                            tL_messageExtendedMedia7 = null;
                                        }
                                        TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia.extended_media.get(i10);
                                        if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                                            TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia11 = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia2;
                                            messageMedia9 = tL_messageExtendedMedia11.media;
                                            TLRPC.Photo photo10 = messageMedia9.photo;
                                            if (photo10 != null) {
                                                z15 = z16;
                                                TLRPC.PhotoSize w11 = w7.w(photo10.sizes, 40, false, null, false);
                                                photoSize = (messageMedia8 == null || (photo5 = messageMedia8.photo) == null) ? w11 : w7.w(photo5.sizes, 40, false, null, false);
                                                tLObject2 = messageMedia9.photo;
                                                photoSize6 = w11;
                                            } else {
                                                z15 = z16;
                                                TLRPC.Document document6 = messageMedia9.document;
                                                if (document6 != null) {
                                                    TLRPC.PhotoSize w12 = w7.w(document6.thumbs, 40, false, null, false);
                                                    if (messageMedia8 == null || (document = messageMedia8.document) == null) {
                                                        photoSize7 = w12;
                                                        photoSize = photoSize7;
                                                    } else {
                                                        photoSize7 = w12;
                                                        photoSize = w7.w(document.thumbs, 40, false, null, false);
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
                                            sb3.append(r8.o(gjVar2));
                                            String sb4 = sb3.toString();
                                            if (message5 != null) {
                                                sb2 = "stripped" + r8.o(message5);
                                                messageMedia7 = messageMedia8;
                                                message2 = message6;
                                            } else {
                                                StringBuilder m10 = i5.c.m(i7, "strippedmessage", "_");
                                                messageMedia7 = messageMedia8;
                                                message2 = message6;
                                                m10.append(gj.v0(gjVar2.k));
                                                m10.append("_");
                                                m10.append(gjVar2.r1);
                                                sb2 = m10.toString();
                                            }
                                            fc.D().R(sb4, sb2, gc.f(photoSize, tLObject), z11);
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
                    photoSize = w10;
                    tL_messageExtendedMedia2 = null;
                    azVar = azVar2;
                    gjVar2 = gjVar;
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
            azVar = azVar2;
            gjVar2 = gjVar;
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
            azVar = azVar2;
            gjVar2 = gjVar;
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
                if (messageMedia.ttl_seconds != 0 || gjVar2.r1 || gj.c3(message5)) {
                    str11 = "";
                    tL_messageExtendedMedia5 = tL_messageExtendedMedia;
                    photoSize4 = photoSize;
                } else {
                    boolean z17 = gjVar2.v1;
                    int i17 = messageMedia.document != null ? z17 ? 8 : 2 : z17 ? 6 : 0;
                    str11 = "";
                    ur messagesStorage = azVar.getMessagesStorage();
                    tL_messageExtendedMedia5 = tL_messageExtendedMedia;
                    TLRPC.Photo photo11 = messageMedia.photo;
                    StringBuilder sb5 = new StringBuilder("sent_");
                    photoSize4 = photoSize;
                    sb5.append(message5.peer_id.channel_id);
                    sb5.append("_");
                    sb5.append(message5.id);
                    sb5.append("_");
                    sb5.append(n5.o(message5.peer_id));
                    sb5.append("_1_");
                    sb5.append(gj.p1(messageMedia9));
                    messagesStorage.l1(str, photo11, i17, sb5.toString());
                }
                if (messageMedia9.photo.sizes.size() == 1 && (messageMedia9.photo.sizes.get(0).location instanceof TLRPC.TL_fileLocationUnavailable)) {
                    messageMedia9.photo.sizes = messageMedia.photo.sizes;
                } else {
                    int i18 = 0;
                    while (i18 < messageMedia9.photo.sizes.size()) {
                        TLRPC.PhotoSize photoSize8 = messageMedia9.photo.sizes.get(i18);
                        if (photoSize8 == null || photoSize8.location == null || photoSize8.type == null) {
                            i13 = i18;
                            message4 = message5;
                        } else {
                            int i19 = 0;
                            while (i19 < messageMedia.photo.sizes.size()) {
                                TLRPC.PhotoSize photoSize9 = messageMedia.photo.sizes.get(i19);
                                if (photoSize9 == null || photoSize9.location == null || (photoSize9 instanceof TLRPC.TL_photoSizeEmpty) || (str12 = photoSize9.type) == null) {
                                    i15 = i18;
                                } else {
                                    int i20 = i18;
                                    if ((photoSize8.location.volume_id == -2147483648L && str12.equals(photoSize8.type)) || (photoSize9.w == photoSize8.w && photoSize9.h == photoSize8.h)) {
                                        String str14 = photoSize8.location.volume_id + "_" + photoSize8.location.local_id;
                                        String str15 = photoSize9.location.volume_id + "_" + photoSize9.location.local_id;
                                        if (str14.equals(str15)) {
                                            i14 = i20;
                                        } else {
                                            File file3 = new File(w7.z(4), str14.concat(".jpg"));
                                            if (messageMedia.ttl_seconds != 0 || ((messageMedia.photo.sizes.size() != 1 && photoSize9.w <= 90 && photoSize9.h <= 90) || z12)) {
                                                i14 = i20;
                                                file2 = new File(w7.z(4), p5.c.v(str15, ".jpg"));
                                            } else {
                                                w7.G(azVar.currentAccount);
                                                file2 = w7.I(photoSize9);
                                                i14 = i20;
                                            }
                                            file3.renameTo(file2);
                                            fc.D().R(str14, str15, gc.i(photoSize9, messageMedia.photo), z11);
                                            photoSize8.location = photoSize9.location;
                                            photoSize8.size = photoSize9.size;
                                        }
                                        message4 = message;
                                        i13 = i14;
                                    } else {
                                        i15 = i20;
                                    }
                                }
                                i19++;
                                i18 = i15;
                            }
                            i14 = i18;
                            String str16 = photoSize8.location.volume_id + "_" + photoSize8.location.local_id;
                            new File(w7.z(4), p5.c.v(str16, ".jpg")).delete();
                            if ("s".equals(photoSize8.type) && photoSize4 != null) {
                                i13 = i14;
                                TLRPC.PhotoSize photoSize10 = photoSize4;
                                messageMedia9.photo.sizes.set(i13, photoSize10);
                                gc i21 = gc.i(photoSize10, messageMedia.photo);
                                message4 = message;
                                fc.D().R(str16, i21.q(message4, null, false), i21, z11);
                            }
                            message4 = message;
                            i13 = i14;
                        }
                        i18 = i13 + 1;
                        message5 = message4;
                    }
                }
                TLRPC.Message message7 = message5;
                if (!gjVar2.D3()) {
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
                String str17 = gjVar2.k.attachPath;
                String str18 = hashMap != null ? (String) Map.-EL.getOrDefault(hashMap, "imagePath", null) : null;
                TLRPC.Photo photo14 = messageMedia9.photo;
                TLRPC.Photo photo15 = messageMedia.photo;
                photo14.id = photo15.id;
                photo14.dc_id = photo15.dc_id;
                photo14.access_hash = photo15.access_hash;
                if (str18 != null && str18.startsWith(w7.z(4).getAbsolutePath())) {
                    File file4 = new File(str18);
                    w7.G(azVar.currentAccount);
                    if (file4.renameTo(w7.J(messageMedia.photo, null, messageMedia.ttl_seconds != 0, true))) {
                        gjVar2.z0 = gjVar2.y0;
                        gjVar2.y0 = false;
                    }
                }
                TLRPC.Document document7 = message7.media.document;
                if (document7 != null) {
                    TLRPC.MessageMedia messageMedia13 = gjVar2.k.media;
                    messageMedia13.flags |= 16;
                    messageMedia13.document = document7;
                }
                if (str17 == null || !str17.startsWith(w7.z(4).getAbsolutePath())) {
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
                w7.G(azVar.currentAccount);
                File J2 = w7.J(messageMedia.document, null, messageMedia.ttl_seconds != 0, true);
                if (file5.renameTo(J2)) {
                    TLRPC.Message message10 = message2;
                    TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia15 = tL_messageExtendedMedia5;
                    gjVar2.z0 = gjVar2.y0;
                    gjVar2.y0 = false;
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
                        gjVar2.y0 = false;
                    }
                } else if (tL_messageExtendedMedia5 != null) {
                    tL_messageExtendedMedia6 = tL_messageExtendedMedia5;
                    tL_messageExtendedMedia6.attachPath = str17;
                } else {
                    tL_messageExtendedMedia6 = tL_messageExtendedMedia5;
                    message7.attachPath = str17;
                }
                if (tL_messageExtendedMedia6 == null) {
                    gjVar2.z0 = J2.exists();
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
        if (messageMedia.ttl_seconds == 0 && ((f20Var = gjVar2.r0) == null || (f20Var.G == null && TextUtils.isEmpty(f20Var.B) && gjVar2.r0.H == null))) {
            boolean L4 = gj.L4(message5);
            if (L4 || gj.t3(message5)) {
                str2 = "";
                if (gj.s3(messageMedia.document, false) == gj.s3(messageMedia9.document, false)) {
                    if (gjVar2.r1 || gj.c3(message5)) {
                        str3 = ".jpg";
                        messageMedia2 = messageMedia;
                        tL_messageExtendedMedia3 = tL_messageExtendedMedia16;
                    } else {
                        gj gjVar4 = new gj(azVar.currentAccount, message5, false, false);
                        ur messagesStorage2 = azVar.getMessagesStorage();
                        TLRPC.Document document8 = messageMedia.document;
                        tL_messageExtendedMedia3 = tL_messageExtendedMedia16;
                        StringBuilder sb6 = new StringBuilder("sent_");
                        str3 = ".jpg";
                        messageMedia2 = messageMedia;
                        sb6.append(message5.peer_id.channel_id);
                        sb6.append("_");
                        sb6.append(message5.id);
                        sb6.append("_");
                        sb6.append(n5.o(message5.peer_id));
                        sb6.append("_");
                        sb6.append(gjVar4.D);
                        sb6.append("_");
                        sb6.append(gjVar4.S1());
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
            if (!gj.R4(message5) && !gj.j4(message5) && !gjVar2.r1 && !gj.c3(message5)) {
                gj gjVar5 = new gj(azVar.currentAccount, message5, false, false);
                messageMedia = messageMedia2;
                azVar.getMessagesStorage().l1(str, messageMedia.document, 1, "sent_" + message5.peer_id.channel_id + "_" + message5.id + "_" + n5.o(message5.peer_id) + "_" + gjVar5.D + "_" + gjVar5.S1());
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
            TLRPC.PhotoSize w13 = w7.w(messageMedia9.document.thumbs, ls.r5, false, null, false);
            TLRPC.PhotoSize w14 = w7.w(messageMedia.document.thumbs, ls.r5, false, null, false);
            if (w13 != null && (fileLocation2 = w13.location) != null && fileLocation2.volume_id == -2147483648L && w14 != null && w14.location != null && !(w14 instanceof TLRPC.TL_photoSizeEmpty) && !(w13 instanceof TLRPC.TL_photoSizeEmpty)) {
                String str20 = w13.location.volume_id + "_" + w13.location.local_id;
                String str21 = w14.location.volume_id + "_" + w14.location.local_id;
                if (!str20.equals(str21)) {
                    new File(w7.z(4), str20.concat(str19)).renameTo(new File(w7.z(4), p5.c.v(str21, str19)));
                    fc.D().R(str20, str21, gc.c(w14, messageMedia.document), z18);
                    w13.location = w14.location;
                    w13.size = w14.size;
                }
            } else if (w14 != null && w13 != null && gj.w4(message5) && (fileLocation = w13.location) != null) {
                w14.location = fileLocation;
            } else if (w13 == null || (w13.location instanceof TLRPC.TL_fileLocationUnavailable) || (w13 instanceof TLRPC.TL_photoSizeEmpty)) {
                messageMedia9.document.thumbs = messageMedia.document.thumbs;
            }
        } else {
            w7.w(photo16.sizes, 40, false, null, false);
            TLRPC.PhotoSize w15 = w7.w(photo.sizes, 40, false, null, false);
            if (photo16.sizes.size() == 1 && (photo16.sizes.get(0).location instanceof TLRPC.TL_fileLocationUnavailable)) {
                photo16.sizes = photo.sizes;
            } else {
                int i22 = 0;
                while (i22 < photo16.sizes.size()) {
                    TLRPC.PhotoSize photoSize11 = photo16.sizes.get(i22);
                    if (photoSize11 == null || photoSize11.location == null || photoSize11.type == null) {
                        z13 = z11;
                        photo2 = photo16;
                        str7 = str13;
                        str8 = str;
                        str9 = str3;
                        photoSize2 = w15;
                    } else {
                        str8 = str;
                        int i23 = 0;
                        while (i23 < photo.sizes.size()) {
                            TLRPC.PhotoSize photoSize12 = photo.sizes.get(i23);
                            if (photoSize12 != null) {
                                i12 = i23;
                                if (photoSize12.location == null || (photoSize12 instanceof TLRPC.TL_photoSizeEmpty) || (str10 = photoSize12.type) == null) {
                                    z14 = z11;
                                    photo4 = photo16;
                                    photoSize3 = w15;
                                    i11 = i22;
                                } else {
                                    photoSize3 = w15;
                                    i11 = i22;
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
                                            File file6 = new File(w7.z(4), sb8.concat(str9));
                                            if (messageMedia.ttl_seconds == 0) {
                                                if (photo.sizes.size() != 1) {
                                                    if (photoSize12.w <= 90) {
                                                    }
                                                }
                                                if (!z12) {
                                                    w7.G(azVar.currentAccount);
                                                    file = w7.J(photoSize12, null, true, true);
                                                    file6.renameTo(file);
                                                    z13 = z10;
                                                    fc.D().R(sb8, str22, gc.i(photoSize12, photo), z13);
                                                    photoSize11.location = photoSize12.location;
                                                    photoSize11.size = photoSize12.size;
                                                }
                                            }
                                            file = new File(w7.z(4), p5.c.v(str22, str9));
                                            file6.renameTo(file);
                                            z13 = z10;
                                            fc.D().R(sb8, str22, gc.i(photoSize12, photo), z13);
                                            photoSize11.location = photoSize12.location;
                                            photoSize11.size = photoSize12.size;
                                        }
                                        photoSize2 = photoSize3;
                                        i22 = i11;
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
                                photoSize3 = w15;
                                i11 = i22;
                                i12 = i23;
                            }
                            w15 = photoSize3;
                            i22 = i11;
                            photo16 = photo4;
                            str3 = str3;
                            i23 = i12 + 1;
                            z11 = z14;
                            azVar = this;
                        }
                        z13 = z11;
                        photo3 = photo16;
                        photoSize3 = w15;
                        i11 = i22;
                        str9 = str3;
                        String str23 = photoSize11.location.volume_id + "_" + photoSize11.location.local_id;
                        new File(w7.z(4), p5.c.v(str23, str9)).delete();
                        if (str13.equals(photoSize11.type) && photoSize3 != null) {
                            photo2 = photo3;
                            i22 = i11;
                            photo2.sizes.set(i22, photoSize3);
                            gc i24 = gc.i(photoSize3, photo);
                            str7 = str13;
                            photoSize2 = photoSize3;
                            fc.D().R(str23, i24.q(message5, null, false), i24, z13);
                        }
                        photoSize2 = photoSize3;
                        i22 = i11;
                        photo2 = photo3;
                        str7 = str13;
                    }
                    i22++;
                    str13 = str7;
                    z11 = z13;
                    photo16 = photo2;
                    str = str8;
                    w15 = photoSize2;
                    azVar = this;
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
        int i25 = 0;
        while (true) {
            if (i25 >= messageMedia9.document.attributes.size()) {
                bArr = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = messageMedia9.document.attributes.get(i25);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                bArr = documentAttribute.waveform;
                break;
            }
            i25++;
        }
        messageMedia9.document.attributes = messageMedia.document.attributes;
        if (bArr != null) {
            for (int i26 = 0; i26 < messageMedia9.document.attributes.size(); i26++) {
                TLRPC.DocumentAttribute documentAttribute2 = messageMedia9.document.attributes.get(i26);
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
        if ((message5.flags & 4) == 0 && ((message5.out || message5.dialog_id == getUserConfig().e()) && !gj.b4(message5))) {
            if (gj.M3(messageMedia.document)) {
                if (gj.V2(messageMedia.document) ? getMessagesController().T3 : true) {
                    getMediaDataController().c(messageMedia.document, message5.date, true);
                }
            } else if (gj.u4(messageMedia.document) || gj.K2(messageMedia.document, true)) {
                si mediaDataController = getMediaDataController();
                TLRPC.Document document13 = messageMedia.document;
                int i27 = message5.date;
                message3 = message5;
                str5 = str2;
                mediaDataController.d(0, message3, document13, i27, false);
                tL_messageExtendedMedia4 = tL_messageExtendedMedia3;
                str6 = tL_messageExtendedMedia3 == null ? tL_messageExtendedMedia4.attachPath : message11.attachPath;
                if (str6 != null || !str6.startsWith(w7.z(4).getAbsolutePath()) || gj.s3(messageMedia.document, false)) {
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
                w7.G(this.currentAccount);
                File J3 = w7.J(messageMedia.document, null, messageMedia.ttl_seconds != 0, true);
                if (!file7.renameTo(J3)) {
                    if (file7.exists()) {
                        if (tL_messageExtendedMedia4 != null) {
                            tL_messageExtendedMedia4.attachPath = str6;
                        } else {
                            message3.attachPath = str6;
                        }
                    } else if (tL_messageExtendedMedia4 == null) {
                        gjVar3 = gjVar;
                        gjVar3.y0 = false;
                        if (tL_messageExtendedMedia4 == null) {
                            gjVar3.z0 = J3.exists();
                        }
                        message3.message = message11.message;
                        return;
                    }
                    gjVar3 = gjVar;
                    if (tL_messageExtendedMedia4 == null) {
                    }
                    message3.message = message11.message;
                    return;
                }
                if (gj.L4(message3)) {
                    gjVar.y0 = true;
                    return;
                }
                gjVar.z0 = gjVar.y0;
                gjVar.y0 = false;
                if (tL_messageExtendedMedia4 != null) {
                    tL_messageExtendedMedia4.attachPath = str5;
                } else {
                    message11.attachPath = str5;
                }
                if (str4 != null) {
                    String str24 = str4;
                    if (str24.startsWith("http")) {
                        ur messagesStorage3 = getMessagesStorage();
                        String file8 = J3.toString();
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
