// default package

import android.app.ActivityManager;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class in5 {
    public static Bitmap M;
    public final ConcurrentHashMap A;
    public final LinkedList B;
    public final HashMap C;
    public final HashMap D;
    public int E;
    public String F;
    public int G;
    public File H;
    public final om5 b;
    public final om5 c;
    public final pm5 d;
    public final om5 e;
    public final sw2 p;
    public final to3 q;
    public final to3 r;
    public final to3 s;
    public final HashMap t;
    public final ConcurrentHashMap u;
    public final HashMap v;
    public final HashMap w;
    public int x;
    public int y;
    public final boolean z;
    public static final ThreadLocal I = new ThreadLocal();
    public static final ThreadLocal J = new ThreadLocal();
    public static final byte[] K = new byte[12];
    public static final byte[] L = new byte[12];
    public static volatile in5 N = null;
    public final HashMap a = new HashMap();
    public final ArrayList f = new ArrayList();
    public final HashMap g = new HashMap();
    public final HashMap h = new HashMap();
    public final ConcurrentHashMap i = new ConcurrentHashMap();
    public final HashSet j = new HashSet();
    public final SparseArray k = new SparseArray();
    public final HashMap l = new HashMap();
    public final SparseArray m = new SparseArray();
    public final LinkedList n = new LinkedList();
    public final LinkedList o = new LinkedList();

    /* JADX WARN: Multi-variable type inference failed */
    public in5() {
        byte b = 1;
        sw2 sw2Var = new sw2(b);
        sw2Var.b = new wo3(sw2Var, new PriorityBlockingQueue(10, new nu6((byte) 6)));
        this.p = sw2Var;
        this.q = new to3("cacheThumbOutQueue");
        to3 to3Var = new to3("thumbGeneratingQueue");
        this.r = to3Var;
        this.s = new to3("imageLoadQueue");
        this.t = new HashMap();
        this.u = new ConcurrentHashMap();
        this.v = new HashMap();
        this.w = new HashMap();
        Object[] objArr = 0;
        this.x = 0;
        this.y = 0;
        this.A = new ConcurrentHashMap();
        this.B = new LinkedList();
        this.C = new HashMap();
        this.D = new HashMap();
        this.E = 0;
        this.F = null;
        this.G = 0;
        this.H = null;
        to3Var.setPriority(1);
        int memoryClass = ((ActivityManager) a.b.getSystemService("activity")).getMemoryClass();
        boolean z = memoryClass >= 192;
        this.z = z;
        int min = Math.min(z ? 30 : 15, memoryClass / 7) << 20;
        float f = min;
        this.c = new om5(this, (int) (0.8f * f), objArr == true ? 1 : 0);
        this.b = new om5(this, (int) (f * 0.2f), b);
        this.d = new pm5(min / 4);
        this.e = new om5(this);
        SparseArray sparseArray = new SparseArray();
        File D0 = hl.D0();
        if (!D0.isDirectory()) {
            try {
                D0.mkdirs();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        hl.G(new File(D0, ".nomedia"));
        sparseArray.put(4, D0);
        for (int i = 0; i < 4; i++) {
            xb4.G(i).F = new sm5(this, i);
        }
        xb4.L = sparseArray;
        ak akVar = new ak(this, (byte) 5);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_BAD_REMOVAL");
        intentFilter.addAction("android.intent.action.MEDIA_CHECKING");
        intentFilter.addAction("android.intent.action.MEDIA_EJECT");
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_NOFS");
        intentFilter.addAction("android.intent.action.MEDIA_REMOVED");
        intentFilter.addAction("android.intent.action.MEDIA_SHARED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTABLE");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme("file");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                a.b.registerReceiver(akVar, intentFilter, 4);
            } else {
                a.b.registerReceiver(akVar, intentFilter);
            }
        } catch (Throwable unused) {
        }
        e(null);
    }

    public static File A() {
        File file = a.b.getExternalMediaDirs()[0];
        if (!TextUtils.isEmpty(xea.e0)) {
            for (int i = 0; i < a.b.getExternalMediaDirs().length; i++) {
                File file2 = a.b.getExternalMediaDirs()[i];
                if (file2 != null && file2.getPath().startsWith(xea.e0)) {
                    file = a.b.getExternalMediaDirs()[i];
                }
            }
        }
        return file;
    }

    public static Bitmap B(String str, byte[] bArr) {
        if (bArr == null || bArr.length < 3) {
            return C();
        }
        try {
            int length = bArr.length;
            byte[] bArr2 = lc1.a;
            byte[] bArr3 = lc1.b;
            int i = length + 622;
            ThreadLocal threadLocal = I;
            byte[] bArr4 = (byte[]) threadLocal.get();
            if (bArr4 == null || bArr4.length < i) {
                bArr4 = null;
            }
            if (bArr4 == null) {
                bArr4 = new byte[i];
                threadLocal.set(bArr4);
            }
            System.arraycopy(bArr2, 0, bArr4, 0, 623);
            System.arraycopy(bArr, 3, bArr4, 623, bArr.length - 3);
            System.arraycopy(bArr3, 0, bArr4, bArr.length + 620, 2);
            bArr4[164] = bArr[1];
            bArr4[166] = bArr[2];
            BitmapFactory.Options options = new BitmapFactory.Options();
            boolean z = !TextUtils.isEmpty(str) && str.contains("r");
            options.inPreferredConfig = (xea.j() || z) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr4, 0, i, options);
            if (decodeByteArray == null) {
                return C();
            }
            if (z) {
                Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray.getWidth(), decodeByteArray.getHeight(), decodeByteArray.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.scale(1.2f, 1.2f, decodeByteArray.getWidth() / 2.0f, decodeByteArray.getHeight() / 2.0f);
                canvas.drawBitmap(decodeByteArray, 0.0f, 0.0f, (Paint) null);
                canvas.restore();
                Path path = new Path();
                path.addCircle(decodeByteArray.getWidth() / 2.0f, decodeByteArray.getHeight() / 2.0f, Math.min(decodeByteArray.getWidth(), decodeByteArray.getHeight()) / 2.0f, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawBitmap(decodeByteArray, 0.0f, 0.0f, (Paint) null);
                decodeByteArray.recycle();
                decodeByteArray = createBitmap;
            }
            if (!TextUtils.isEmpty(str) && str.contains("b")) {
                Utilities.blurBitmap(decodeByteArray, 3);
            }
            return decodeByteArray;
        } catch (Exception e) {
            cc4.g(e, true);
            return C();
        }
    }

    public static synchronized Bitmap C() {
        Bitmap bitmap;
        synchronized (in5.class) {
            Bitmap bitmap2 = M;
            if (bitmap2 == null || bitmap2.isRecycled()) {
                Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                M = createBitmap;
                createBitmap.eraseColor(-16777216);
            }
            bitmap = M;
        }
        return bitmap;
    }

    public static boolean E(String str) {
        return str != null && str.endsWith("avatar");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:0|1|(27:6|(1:8)(2:154|(2:158|159))|9|10|(1:12)(1:(19:147|148|149|14|(1:16)(1:145)|17|(1:19)|20|(3:22|(2:23|(1:25)(1:26))|27)|28|29|(4:33|34|36|37)|44|(10:126|128|129|(5:131|(1:133)(1:138)|134|(1:136)|137)|139|(1:141)|49|(2:(1:52)|53)|54|(5:92|93|(3:97|98|(3:100|101|102))|95|96)(1:(7:57|58|(3:69|70|(5:72|73|61|62|64))|60|61|62|64)(1:91)))|48|49|(0)|54|(0)(0)))|13|14|(0)(0)|17|(0)|20|(0)|28|29|(5:31|33|34|36|37)|44|(1:46)|126|128|129|(0)|139|(0)|49|(0)|54|(0)(0))|163|10|(0)(0)|13|14|(0)(0)|17|(0)|20|(0)|28|29|(0)|44|(0)|126|128|129|(0)|139|(0)|49|(0)|54|(0)(0)|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
    
        if (r10 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c9, code lost:
    
        if (r10 == null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00f1 A[Catch: all -> 0x0126, TryCatch #3 {all -> 0x0126, blocks: (B:129:0x00e7, B:131:0x00f1, B:134:0x0100, B:137:0x010b, B:139:0x010e, B:141:0x0118), top: B:128:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0118 A[Catch: all -> 0x0126, TRY_LEAVE, TryCatch #3 {all -> 0x0126, blocks: (B:129:0x00e7, B:131:0x00f1, B:134:0x0100, B:137:0x010b, B:139:0x010e, B:141:0x0118), top: B:128:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad A[Catch: all -> 0x0125, TRY_LEAVE, TryCatch #1 {all -> 0x0125, blocks: (B:29:0x009f, B:31:0x00ad, B:39:0x00cb, B:44:0x00ce, B:46:0x00d8, B:126:0x00e2), top: B:28:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8 A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:29:0x009f, B:31:0x00ad, B:39:0x00cb, B:44:0x00ce, B:46:0x00d8, B:126:0x00e2), top: B:28:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap G(String str, Uri uri, float f, float f2, boolean z) {
        String str2;
        InputStream openInputStream;
        float max;
        int i;
        Matrix matrix;
        float f3;
        Bitmap bitmap;
        Bitmap decodeStream;
        Bitmap createBitmap;
        Pair N0;
        InputStream inputStream;
        String S0;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (str == null && uri != null && uri.getScheme() != null) {
            if (uri.getScheme().contains("file")) {
                S0 = uri.getPath();
            } else if (Build.VERSION.SDK_INT < 30 || !"content".equals(uri.getScheme())) {
                try {
                    S0 = hl.S0(uri);
                } catch (Throwable th) {
                    cc4.g(th, true);
                }
            }
            str2 = S0;
            Bitmap bitmap2 = null;
            if (str2 == null) {
                BitmapFactory.decodeFile(str2, options);
            } else if (uri != null) {
                try {
                    InputStream openInputStream2 = a.b.getContentResolver().openInputStream(uri);
                    BitmapFactory.decodeStream(openInputStream2, null, options);
                    openInputStream2.close();
                    openInputStream = a.b.getContentResolver().openInputStream(uri);
                    float f4 = options.outWidth / f;
                    float f5 = options.outHeight / f2;
                    max = z ? Math.max(f4, f5) : Math.min(f4, f5);
                    if (max < 1.0f) {
                        max = 1.0f;
                    }
                    options.inJustDecodeBounds = false;
                    i = (int) max;
                    options.inSampleSize = i;
                    if (i % 2 != 0) {
                        int i2 = 1;
                        while (true) {
                            int i3 = i2 << 1;
                            if (i3 >= options.inSampleSize) {
                                break;
                            }
                            i2 = i3;
                        }
                        options.inSampleSize = i2;
                    }
                    N0 = hl.N0(str2);
                    if (((Integer) N0.first).intValue() == 0 && ((Integer) N0.second).intValue() == 0) {
                        try {
                            inputStream = a.b.getContentResolver().openInputStream(uri);
                            try {
                                N0 = hl.M0(inputStream);
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            inputStream = null;
                        }
                    }
                    if (((Integer) N0.first).intValue() == 0 || ((Integer) N0.second).intValue() != 0) {
                        matrix = new Matrix();
                        if (((Integer) N0.second).intValue() != 0) {
                            matrix.postScale(((Integer) N0.second).intValue() == 1 ? -1.0f : 1.0f, ((Integer) N0.second).intValue() != 2 ? 1.0f : -1.0f);
                        }
                        if (((Integer) N0.first).intValue() != 0) {
                            matrix.postRotate(((Integer) N0.first).intValue());
                        }
                        f3 = max / options.inSampleSize;
                        if (f3 > 1.0f) {
                            if (matrix == null) {
                                matrix = new Matrix();
                            }
                            float f6 = 1.0f / f3;
                            matrix.postScale(f6, f6);
                        }
                        Matrix matrix2 = matrix;
                        if (str2 == null) {
                            try {
                                bitmap = BitmapFactory.decodeFile(str2, options);
                                if (bitmap != null) {
                                    try {
                                        Bitmap createBitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix2, true);
                                        if (createBitmap2 != bitmap) {
                                            bitmap.recycle();
                                            return createBitmap2;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bitmap2 = bitmap;
                                        cc4.g(th, true);
                                        z().f();
                                        if (bitmap2 == null) {
                                            try {
                                                bitmap2 = BitmapFactory.decodeFile(str2, options);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                cc4.g(th, true);
                                                return bitmap2;
                                            }
                                        }
                                        bitmap = bitmap2;
                                        if (bitmap != null) {
                                            try {
                                                Bitmap createBitmap3 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix2, true);
                                                if (createBitmap3 != bitmap) {
                                                    bitmap.recycle();
                                                    bitmap = createBitmap3;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                bitmap2 = bitmap;
                                                cc4.g(th, true);
                                                return bitmap2;
                                            }
                                        }
                                        return bitmap;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                            return bitmap;
                        }
                        if (uri == null) {
                            return null;
                        }
                        try {
                            decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                        } catch (Throwable th6) {
                            th = th6;
                        }
                        try {
                            if (decodeStream != null) {
                                try {
                                    createBitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix2, true);
                                } catch (Throwable th7) {
                                    th = th7;
                                    bitmap2 = decodeStream;
                                    try {
                                        cc4.g(th, true);
                                        openInputStream.close();
                                        return bitmap2;
                                    } finally {
                                    }
                                }
                                if (createBitmap != decodeStream) {
                                    decodeStream.recycle();
                                    bitmap2 = createBitmap;
                                    openInputStream.close();
                                    return bitmap2;
                                }
                            }
                            openInputStream.close();
                            return bitmap2;
                        } catch (Throwable th8) {
                            cc4.g(th8, true);
                            return bitmap2;
                        }
                        bitmap2 = decodeStream;
                    }
                    matrix = null;
                    f3 = max / options.inSampleSize;
                    if (f3 > 1.0f) {
                    }
                    Matrix matrix22 = matrix;
                    if (str2 == null) {
                    }
                } catch (Throwable th9) {
                    cc4.g(th9, true);
                    return null;
                }
            }
            openInputStream = null;
            float f42 = options.outWidth / f;
            float f52 = options.outHeight / f2;
            if (z) {
            }
            if (max < 1.0f) {
            }
            options.inJustDecodeBounds = false;
            i = (int) max;
            options.inSampleSize = i;
            if (i % 2 != 0) {
            }
            N0 = hl.N0(str2);
            if (((Integer) N0.first).intValue() == 0) {
                inputStream = a.b.getContentResolver().openInputStream(uri);
                N0 = hl.M0(inputStream);
            }
            if (((Integer) N0.first).intValue() == 0) {
            }
            matrix = new Matrix();
            if (((Integer) N0.second).intValue() != 0) {
            }
            if (((Integer) N0.first).intValue() != 0) {
            }
            f3 = max / options.inSampleSize;
            if (f3 > 1.0f) {
            }
            Matrix matrix222 = matrix;
            if (str2 == null) {
            }
        }
        str2 = str;
        Bitmap bitmap22 = null;
        if (str2 == null) {
        }
        openInputStream = null;
        float f422 = options.outWidth / f;
        float f522 = options.outHeight / f2;
        if (z) {
        }
        if (max < 1.0f) {
        }
        options.inJustDecodeBounds = false;
        i = (int) max;
        options.inSampleSize = i;
        if (i % 2 != 0) {
        }
        N0 = hl.N0(str2);
        if (((Integer) N0.first).intValue() == 0) {
        }
        if (((Integer) N0.first).intValue() == 0) {
        }
        matrix = new Matrix();
        if (((Integer) N0.second).intValue() != 0) {
        }
        if (((Integer) N0.first).intValue() != 0) {
        }
        f3 = max / options.inSampleSize;
        if (f3 > 1.0f) {
        }
        Matrix matrix2222 = matrix;
        if (str2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void R(TLRPC.Message message) {
        byte[] bArr;
        boolean z;
        TLRPC.PhotoSize tL_photoSize_layer127;
        TLRPC.MessageMedia messageMedia;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        byte[] bArr2;
        TLRPC.FileLocation fileLocation;
        File J2;
        int i;
        TLRPC.PhotoSize tL_photoSize_layer1272;
        TLRPC.MessageMedia messageMedia3 = message.media;
        if (messageMedia3 != null) {
            long j = -2147483648L;
            int i2 = 50;
            int i3 = 0;
            if (!(messageMedia3 instanceof TLRPC.TL_messageMediaPaidMedia)) {
                TLRPC.PhotoSize p = p(message);
                if (p == null || (bArr = p.bytes) == null || bArr.length == 0) {
                    return;
                }
                TLRPC.FileLocation fileLocation2 = p.location;
                if (fileLocation2 == null || (fileLocation2 instanceof TLRPC.TL_fileLocationUnavailable)) {
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
                    p.location = tL_fileLocationToBeDeprecated;
                    tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
                    tL_fileLocationToBeDeprecated.local_id = xea.p();
                }
                if (p.h > 50 || p.w > 50) {
                    xb4.G(yac.t0);
                    File J3 = xb4.J(p, null, true, true);
                    if (r47.Q5(message)) {
                        J3 = new File(J3.getAbsolutePath() + ".enc");
                        z = true;
                    } else {
                        z = false;
                    }
                    if (J3.exists()) {
                        i2 = 0;
                    } else {
                        try {
                            if (z) {
                                try {
                                    RandomAccessFile randomAccessFile = new RandomAccessFile(new File(a.b.getCacheDir(), J3.getName() + ".key"), "rws");
                                    long length = randomAccessFile.length();
                                    byte[] bArr3 = new byte[32];
                                    byte[] bArr4 = new byte[16];
                                    if (length > 0) {
                                        if (length % 48 == 0) {
                                            i2 = 0;
                                            randomAccessFile.read(bArr3, 0, 32);
                                            randomAccessFile.read(bArr4, 0, 16);
                                            randomAccessFile.close();
                                            Utilities.aesCtrDecryptionByteArray(p.bytes, bArr3, bArr4, 0, r4.length, 0);
                                        }
                                    }
                                    i2 = 0;
                                    SecureRandom secureRandom = Utilities.b;
                                    secureRandom.nextBytes(bArr3);
                                    secureRandom.nextBytes(bArr4);
                                    randomAccessFile.write(bArr3);
                                    randomAccessFile.write(bArr4);
                                    randomAccessFile.close();
                                    Utilities.aesCtrDecryptionByteArray(p.bytes, bArr3, bArr4, 0, r4.length, 0);
                                } catch (Exception e) {
                                    e = e;
                                    i2 = 0;
                                    cc4.g(e, true);
                                    tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
                                    tL_photoSize_layer127.w = p.w;
                                    tL_photoSize_layer127.h = p.h;
                                    tL_photoSize_layer127.location = p.location;
                                    tL_photoSize_layer127.size = p.size;
                                    tL_photoSize_layer127.type = p.type;
                                    messageMedia = message.media;
                                    if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto)) {
                                    }
                                }
                            } else {
                                i2 = 0;
                            }
                            RandomAccessFile randomAccessFile2 = new RandomAccessFile(J3, "rws");
                            randomAccessFile2.write(p.bytes);
                            randomAccessFile2.close();
                        } catch (Exception e2) {
                            e = e2;
                        }
                    }
                    tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
                    tL_photoSize_layer127.w = p.w;
                    tL_photoSize_layer127.h = p.h;
                    tL_photoSize_layer127.location = p.location;
                    tL_photoSize_layer127.size = p.size;
                    tL_photoSize_layer127.type = p.type;
                } else {
                    tL_photoSize_layer127 = new TLRPC.TL_photoStrippedSize();
                    tL_photoSize_layer127.location = p.location;
                    tL_photoSize_layer127.bytes = p.bytes;
                    tL_photoSize_layer127.h = p.h;
                    tL_photoSize_layer127.w = p.w;
                    i2 = 0;
                }
                messageMedia = message.media;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto)) {
                    int size = messageMedia.photo.sizes.size();
                    for (int i4 = i2; i4 < size; i4++) {
                        if (message.media.photo.sizes.get(i4) instanceof TLRPC.TL_photoCachedSize) {
                            message.media.photo.sizes.set(i4, tL_photoSize_layer127);
                            return;
                        }
                    }
                    return;
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    int size2 = messageMedia.document.thumbs.size();
                    for (int i5 = i2; i5 < size2; i5++) {
                        if (message.media.document.thumbs.get(i5) instanceof TLRPC.TL_photoCachedSize) {
                            message.media.document.thumbs.set(i5, tL_photoSize_layer127);
                            return;
                        }
                    }
                    return;
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                    int size3 = messageMedia.webpage.photo.sizes.size();
                    for (int i6 = i2; i6 < size3; i6++) {
                        if (message.media.webpage.photo.sizes.get(i6) instanceof TLRPC.TL_photoCachedSize) {
                            message.media.webpage.photo.sizes.set(i6, tL_photoSize_layer127);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia3;
            int i7 = 0;
            while (i7 < tL_messageMediaPaidMedia.extended_media.size()) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i7);
                if ((messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) && (messageMedia2 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media) != null) {
                    boolean z2 = messageMedia2 instanceof TLRPC.TL_messageMediaPhoto;
                    if (z2) {
                        int size4 = messageMedia2.photo.sizes.size();
                        for (int i8 = i3; i8 < size4; i8++) {
                            photoSize = messageMedia2.photo.sizes.get(i8);
                            if (photoSize instanceof TLRPC.TL_photoCachedSize) {
                                break;
                            }
                        }
                        photoSize = null;
                        if (photoSize != null && (bArr2 = photoSize.bytes) != null && bArr2.length != 0) {
                            fileLocation = photoSize.location;
                            if (fileLocation != null || (fileLocation instanceof TLRPC.TL_fileLocationUnavailable)) {
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = new TLRPC.TL_fileLocationToBeDeprecated();
                                photoSize.location = tL_fileLocationToBeDeprecated2;
                                tL_fileLocationToBeDeprecated2.volume_id = j;
                                tL_fileLocationToBeDeprecated2.local_id = xea.p();
                            }
                            if (photoSize.h <= i2 || photoSize.w > i2) {
                                xb4.G(yac.t0);
                                J2 = xb4.J(photoSize, null, true, true);
                                if (r47.Q5(message)) {
                                    i = i3;
                                } else {
                                    J2 = new File(J2.getAbsolutePath() + ".enc");
                                    i = 1;
                                }
                                if (!J2.exists()) {
                                    if (i != 0) {
                                        try {
                                            RandomAccessFile randomAccessFile3 = new RandomAccessFile(new File(a.b.getCacheDir(), J2.getName() + ".key"), "rws");
                                            long length2 = randomAccessFile3.length();
                                            byte[] bArr5 = new byte[32];
                                            byte[] bArr6 = new byte[16];
                                            if (length2 <= 0 || length2 % 48 != 0) {
                                                SecureRandom secureRandom2 = Utilities.b;
                                                secureRandom2.nextBytes(bArr5);
                                                secureRandom2.nextBytes(bArr6);
                                                randomAccessFile3.write(bArr5);
                                                randomAccessFile3.write(bArr6);
                                            } else {
                                                randomAccessFile3.read(bArr5, 0, 32);
                                                randomAccessFile3.read(bArr6, 0, 16);
                                            }
                                            randomAccessFile3.close();
                                            Utilities.aesCtrDecryptionByteArray(photoSize.bytes, bArr5, bArr6, 0, r4.length, 0);
                                        } catch (Exception e3) {
                                            cc4.g(e3, true);
                                        }
                                    }
                                    RandomAccessFile randomAccessFile4 = new RandomAccessFile(J2, "rws");
                                    randomAccessFile4.write(photoSize.bytes);
                                    randomAccessFile4.close();
                                }
                                tL_photoSize_layer1272 = new TLRPC.TL_photoSize_layer127();
                                tL_photoSize_layer1272.w = photoSize.w;
                                tL_photoSize_layer1272.h = photoSize.h;
                                tL_photoSize_layer1272.location = photoSize.location;
                                tL_photoSize_layer1272.size = photoSize.size;
                                tL_photoSize_layer1272.type = photoSize.type;
                            } else {
                                tL_photoSize_layer1272 = new TLRPC.TL_photoStrippedSize();
                                tL_photoSize_layer1272.location = photoSize.location;
                                tL_photoSize_layer1272.bytes = photoSize.bytes;
                                tL_photoSize_layer1272.h = photoSize.h;
                                tL_photoSize_layer1272.w = photoSize.w;
                            }
                            if (!z2) {
                                int size5 = messageMedia2.photo.sizes.size();
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= size5) {
                                        break;
                                    }
                                    if (messageMedia2.photo.sizes.get(i9) instanceof TLRPC.TL_photoCachedSize) {
                                        messageMedia2.photo.sizes.set(i9, tL_photoSize_layer1272);
                                        break;
                                    }
                                    i9++;
                                }
                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                                int size6 = messageMedia2.document.thumbs.size();
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= size6) {
                                        break;
                                    }
                                    if (messageMedia2.document.thumbs.get(i10) instanceof TLRPC.TL_photoCachedSize) {
                                        messageMedia2.document.thumbs.set(i10, tL_photoSize_layer1272);
                                        break;
                                    }
                                    i10++;
                                }
                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                                int size7 = messageMedia2.webpage.photo.sizes.size();
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= size7) {
                                        break;
                                    }
                                    if (messageMedia2.webpage.photo.sizes.get(i11) instanceof TLRPC.TL_photoCachedSize) {
                                        messageMedia2.webpage.photo.sizes.set(i11, tL_photoSize_layer1272);
                                        break;
                                    }
                                    i11++;
                                }
                            }
                        }
                    } else {
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                            TLRPC.Document document = messageMedia2.document;
                            if (document != null) {
                                int size8 = document.thumbs.size();
                                for (int i12 = i3; i12 < size8; i12++) {
                                    photoSize2 = messageMedia2.document.thumbs.get(i12);
                                    if (photoSize2 instanceof TLRPC.TL_photoCachedSize) {
                                        photoSize = photoSize2;
                                        break;
                                    }
                                }
                            }
                            photoSize = null;
                        } else {
                            if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                                TLRPC.Photo photo = messageMedia2.webpage.photo;
                                if (photo != null) {
                                    int size9 = photo.sizes.size();
                                    for (int i13 = i3; i13 < size9; i13++) {
                                        photoSize2 = messageMedia2.webpage.photo.sizes.get(i13);
                                        if (photoSize2 instanceof TLRPC.TL_photoCachedSize) {
                                            photoSize = photoSize2;
                                            break;
                                        }
                                    }
                                }
                            } else if ((messageMedia2 instanceof TLRPC.TL_messageMediaInvoice) && !messageMedia2.extended_media.isEmpty() && (messageMedia2.extended_media.get(i3) instanceof TLRPC.TL_messageExtendedMediaPreview)) {
                                photoSize = ((TLRPC.TL_messageExtendedMediaPreview) messageMedia2.extended_media.get(i3)).thumb;
                            }
                            photoSize = null;
                        }
                        if (photoSize != null) {
                            fileLocation = photoSize.location;
                            if (fileLocation != null) {
                            }
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated22 = new TLRPC.TL_fileLocationToBeDeprecated();
                            photoSize.location = tL_fileLocationToBeDeprecated22;
                            tL_fileLocationToBeDeprecated22.volume_id = j;
                            tL_fileLocationToBeDeprecated22.local_id = xea.p();
                            if (photoSize.h <= i2) {
                            }
                            xb4.G(yac.t0);
                            J2 = xb4.J(photoSize, null, true, true);
                            if (r47.Q5(message)) {
                            }
                            if (!J2.exists()) {
                            }
                            tL_photoSize_layer1272 = new TLRPC.TL_photoSize_layer127();
                            tL_photoSize_layer1272.w = photoSize.w;
                            tL_photoSize_layer1272.h = photoSize.h;
                            tL_photoSize_layer1272.location = photoSize.location;
                            tL_photoSize_layer1272.size = photoSize.size;
                            tL_photoSize_layer1272.type = photoSize.type;
                            if (!z2) {
                            }
                        }
                    }
                }
                i7++;
                i3 = 0;
                j = -2147483648L;
                i2 = 50;
            }
        }
    }

    public static void S(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            R((TLRPC.Message) arrayList.get(i));
        }
    }

    public static TLRPC.PhotoSize T(Bitmap bitmap, float f, float f2, int i, int i2, int i3) {
        return W(null, bitmap, Bitmap.CompressFormat.JPEG, f, f2, i, false, i2, i3, false);
    }

    public static TLRPC.PhotoSize U(Bitmap bitmap, float f, float f2, int i, boolean z) {
        return W(null, bitmap, Bitmap.CompressFormat.JPEG, f, f2, i, z, 0, 0, false);
    }

    public static TLRPC.PhotoSize V(Bitmap bitmap, Bitmap.CompressFormat compressFormat, float f, float f2, int i) {
        return W(null, bitmap, compressFormat, f, f2, i, false, 101, 101, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r4 < r25) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TLRPC.PhotoSize W(TLRPC.PhotoSize photoSize, Bitmap bitmap, Bitmap.CompressFormat compressFormat, float f, float f2, int i, boolean z, int i2, int i3, boolean z2) {
        boolean z3;
        float f3;
        int i4;
        int i5;
        float f4;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            if (width != 0.0f && height != 0.0f) {
                float max = Math.max(width / f, height / f2);
                if (i2 != 0 && i3 != 0) {
                    float f5 = i2;
                    if (width < f5) {
                        if (height > i3) {
                            f4 = width / f5;
                            max = f4;
                            z3 = true;
                            f3 = max;
                            i4 = (int) (width / f3);
                            i5 = (int) (height / f3);
                            if (i5 != 0 && i4 != 0) {
                                try {
                                    return X(photoSize, bitmap, compressFormat, i4, i5, f3, i, z, z3, z2);
                                } catch (Throwable th) {
                                    cc4.g(th, true);
                                    z().f();
                                    System.gc();
                                    try {
                                        return X(photoSize, bitmap, compressFormat, i4, i5, f3, i, z, z3, z2);
                                    } catch (Throwable th2) {
                                        cc4.g(th2, true);
                                    }
                                }
                            }
                        }
                    }
                    if (width > f5) {
                        float f6 = i3;
                        if (height < f6) {
                            f4 = height / f6;
                            max = f4;
                            z3 = true;
                            f3 = max;
                            i4 = (int) (width / f3);
                            i5 = (int) (height / f3);
                            if (i5 != 0) {
                                return X(photoSize, bitmap, compressFormat, i4, i5, f3, i, z, z3, z2);
                            }
                        }
                    }
                    f4 = Math.max(width / f5, height / i3);
                    max = f4;
                    z3 = true;
                    f3 = max;
                    i4 = (int) (width / f3);
                    i5 = (int) (height / f3);
                    if (i5 != 0) {
                    }
                }
                z3 = false;
                f3 = max;
                i4 = (int) (width / f3);
                i5 = (int) (height / f3);
                if (i5 != 0) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TLRPC.PhotoSize X(TLRPC.PhotoSize photoSize, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i, int i2, float f, int i3, boolean z, boolean z2, boolean z3) {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        Bitmap createScaledBitmap = (f > 1.0f || z2) ? Bitmap.createScaledBitmap(bitmap, i, i2, true) : bitmap;
        if (photoSize != null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            if (fileLocation instanceof TLRPC.TL_fileLocationToBeDeprecated) {
                tL_fileLocationToBeDeprecated = (TLRPC.TL_fileLocationToBeDeprecated) fileLocation;
                int i4 = tm5.a[compressFormat.ordinal()];
                String str = (i4 != 1 || i4 == 2 || i4 == 3) ? ".webp" : ".jpg";
                StringBuilder sb = new StringBuilder();
                sb.append(tL_fileLocationToBeDeprecated.volume_id);
                sb.append("_");
                FileOutputStream fileOutputStream = new FileOutputStream(new File(!z3 ? xb4.z(4) : tL_fileLocationToBeDeprecated.volume_id != -2147483648L ? xb4.z(0) : xb4.z(4), uh9.l(sb, tL_fileLocationToBeDeprecated.local_id, str)));
                createScaledBitmap.compress(compressFormat, i3, fileOutputStream);
                if (!z) {
                    photoSize.size = (int) fileOutputStream.getChannel().size();
                }
                fileOutputStream.close();
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    createScaledBitmap.compress(compressFormat, i3, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    photoSize.bytes = byteArray;
                    photoSize.size = byteArray.length;
                    byteArrayOutputStream.close();
                }
                if (createScaledBitmap != bitmap) {
                    createScaledBitmap.recycle();
                }
                return photoSize;
            }
        }
        tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
        tL_fileLocationToBeDeprecated.dc_id = TLObject.FLAG_31;
        tL_fileLocationToBeDeprecated.local_id = xea.p();
        tL_fileLocationToBeDeprecated.file_reference = new byte[0];
        photoSize = new TLRPC.TL_photoSize_layer127();
        photoSize.location = tL_fileLocationToBeDeprecated;
        photoSize.w = createScaledBitmap.getWidth();
        int height = createScaledBitmap.getHeight();
        photoSize.h = height;
        int i5 = photoSize.w;
        if (i5 <= 100 && height <= 100) {
            photoSize.type = "s";
        } else if (i5 <= 320 && height <= 320) {
            photoSize.type = "m";
        } else if (i5 <= 800 && height <= 800) {
            photoSize.type = "x";
        } else if (i5 > 1280 || height > 1280) {
            photoSize.type = "w";
        } else {
            photoSize.type = "y";
        }
        int i42 = tm5.a[compressFormat.ordinal()];
        if (i42 != 1) {
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_fileLocationToBeDeprecated.volume_id);
        sb2.append("_");
        FileOutputStream fileOutputStream2 = new FileOutputStream(new File(!z3 ? xb4.z(4) : tL_fileLocationToBeDeprecated.volume_id != -2147483648L ? xb4.z(0) : xb4.z(4), uh9.l(sb2, tL_fileLocationToBeDeprecated.local_id, str)));
        createScaledBitmap.compress(compressFormat, i3, fileOutputStream2);
        if (!z) {
        }
        fileOutputStream2.close();
        if (z) {
        }
        if (createScaledBitmap != bitmap) {
        }
        return photoSize;
    }

    public static boolean Y(Uri uri, String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (str == null && uri != null && uri.getScheme() != null) {
            if (uri.getScheme().contains("file")) {
                str = uri.getPath();
            } else {
                try {
                    str = hl.S0(uri);
                } catch (Throwable th) {
                    cc4.g(th, true);
                }
            }
        }
        if (str != null) {
            BitmapFactory.decodeFile(str, options);
        } else if (uri != null) {
            try {
                InputStream openInputStream = a.b.getContentResolver().openInputStream(uri);
                BitmapFactory.decodeStream(openInputStream, null, options);
                openInputStream.close();
            } catch (Throwable th2) {
                cc4.g(th2, true);
                return false;
            }
        }
        float f = options.outWidth;
        float f2 = options.outHeight;
        return f / f2 > 10.0f || f2 / f > 10.0f;
    }

    public static int Z(BitmapDrawable bitmapDrawable) {
        if (bitmapDrawable instanceof lm) {
            lm lmVar = (lm) bitmapDrawable;
            return (Math.max(lmVar.getIntrinsicHeight() * lmVar.getIntrinsicWidth(), lmVar.k0 * lmVar.j0) << 2) * 3;
        }
        if (!(bitmapDrawable instanceof b29)) {
            return bitmapDrawable.getBitmap().getByteCount();
        }
        b29 b29Var = (b29) bitmapDrawable;
        int i = b29Var.b * b29Var.c;
        return b29Var.H ? i << 1 : i << 3;
    }

    public static boolean a0(jn5 jn5Var, String str) {
        if (str.endsWith("_firstframe") || str.endsWith("_lastframe")) {
            return false;
        }
        return (jn5Var != null && (r47.K2(jn5Var.i, true) || jn5Var.p == 1 || r47.M4(jn5Var.i))) || E(str);
    }

    public static boolean b(File file, File file2, int i) {
        File file3;
        File file4;
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                if (i == 0) {
                    file3 = new File(file, "000000000_999999_temp.f");
                    file4 = new File(file2, "000000000_999999.f");
                } else if (i == 3 || i == 5 || i == 6) {
                    file3 = new File(file, "000000000_999999_temp.f");
                    file4 = new File(file2, "000000000_999999.f");
                } else if (i == 1) {
                    file3 = new File(file, "000000000_999999_temp.f");
                    file4 = new File(file2, "000000000_999999.f");
                } else if (i == 2) {
                    file3 = new File(file, "000000000_999999_temp.f");
                    file4 = new File(file2, "000000000_999999.f");
                } else {
                    file4 = null;
                    file3 = null;
                }
                bArr = new byte[1024];
                file3.createNewFile();
                randomAccessFile = new RandomAccessFile(file3, "rws");
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            randomAccessFile.write(bArr);
            randomAccessFile.close();
            boolean renameTo = file3.renameTo(file4);
            file3.delete();
            file4.delete();
            return renameTo;
        } catch (Exception e2) {
            e = e2;
            randomAccessFile2 = randomAccessFile;
            cc4.g(e, true);
            if (randomAccessFile2 == null) {
                return false;
            }
            try {
                randomAccessFile2.close();
                return false;
            } catch (Exception e3) {
                cc4.g(e3, true);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (Exception e4) {
                    cc4.g(e4, true);
                }
            }
            throw th;
        }
    }

    public static BitmapDrawable i(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof TLRPC.TL_photoStrippedSize) {
                return new BitmapDrawable(a.b.getResources(), B("b", ((TLRPC.TL_photoStrippedSize) arrayList.get(i)).bytes));
            }
        }
        return null;
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(64);
        return indexOf >= 0 ? str.substring(0, indexOf) : str;
    }

    public static String k(File file) {
        StringBuilder sb = new StringBuilder();
        if (file == null) {
            return "";
        }
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(file));
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, "UTF-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            String sb2 = sb.toString();
                            bufferedReader.close();
                            gZIPInputStream.close();
                            return sb2;
                        }
                        sb.append(readLine);
                    } finally {
                    }
                }
            } finally {
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public static TLRPC.TL_photoSize_layer127 m(String str) {
        if (str == null) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
            tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
            tL_fileLocationToBeDeprecated.dc_id = TLObject.FLAG_31;
            tL_fileLocationToBeDeprecated.local_id = xea.p();
            tL_fileLocationToBeDeprecated.file_reference = new byte[0];
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.location = tL_fileLocationToBeDeprecated;
            tL_photoSize_layer127.w = i;
            tL_photoSize_layer127.h = i2;
            if (i <= 100 && i2 <= 100) {
                tL_photoSize_layer127.type = "s";
            } else if (i <= 320 && i2 <= 320) {
                tL_photoSize_layer127.type = "m";
            } else if (i <= 800 && i2 <= 800) {
                tL_photoSize_layer127.type = "x";
            } else if (i > 1280 || i2 > 1280) {
                tL_photoSize_layer127.type = "w";
            } else {
                tL_photoSize_layer127.type = "y";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(tL_fileLocationToBeDeprecated.volume_id);
            sb.append("_");
            File file = new File(tL_fileLocationToBeDeprecated.volume_id != -2147483648L ? xb4.z(0) : xb4.z(4), uh9.l(sb, tL_fileLocationToBeDeprecated.local_id, ".jpg"));
            new File(str).renameTo(file);
            tL_photoSize_layer127.size = (int) file.length();
            return tL_photoSize_layer127;
        } catch (Exception e) {
            cc4.g(e, true);
            return null;
        }
    }

    public static void n(TLRPC.PhotoSize photoSize) {
        if (photoSize != null) {
            byte[] bArr = photoSize.bytes;
            if (bArr == null || bArr.length == 0) {
                xb4.G(yac.t0);
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(xb4.J(photoSize, null, true, true), "r");
                    if (((int) randomAccessFile.length()) < 20000) {
                        int length = (int) randomAccessFile.length();
                        byte[] bArr2 = new byte[length];
                        photoSize.bytes = bArr2;
                        randomAccessFile.readFully(bArr2, 0, length);
                    }
                } catch (Throwable th) {
                    cc4.g(th, true);
                }
            }
        }
    }

    public static Drawable o(String str, List list) {
        if (list == null) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            ImageReceiver imageReceiver = (ImageReceiver) list.get(i);
            if (str.equals(imageReceiver.R)) {
                return imageReceiver.T;
            }
            if (str.equals(imageReceiver.i0)) {
                return imageReceiver.k0;
            }
        }
        return null;
    }

    public static TLRPC.PhotoSize p(TLRPC.Message message) {
        TLRPC.MessageMedia messageMedia = message.media;
        int i = 0;
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia.photo.sizes.size();
            while (i < size) {
                TLRPC.PhotoSize photoSize = message.media.photo.sizes.get(i);
                if (photoSize instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize;
                }
                i++;
            }
            return null;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = messageMedia.document;
            if (document == null) {
                return null;
            }
            int size2 = document.thumbs.size();
            while (i < size2) {
                TLRPC.PhotoSize photoSize2 = message.media.document.thumbs.get(i);
                if (photoSize2 instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize2;
                }
                i++;
            }
            return null;
        }
        if (!(messageMedia instanceof TLRPC.TL_messageMediaWebPage)) {
            if ((messageMedia instanceof TLRPC.TL_messageMediaInvoice) && !messageMedia.extended_media.isEmpty() && (message.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview)) {
                return ((TLRPC.TL_messageExtendedMediaPreview) message.media.extended_media.get(0)).thumb;
            }
            return null;
        }
        TLRPC.Photo photo = messageMedia.webpage.photo;
        if (photo == null) {
            return null;
        }
        int size3 = photo.sizes.size();
        while (i < size3) {
            TLRPC.PhotoSize photoSize3 = message.media.webpage.photo.sizes.get(i);
            if (photoSize3 instanceof TLRPC.TL_photoCachedSize) {
                return photoSize3;
            }
            i++;
        }
        return null;
    }

    public static en5 q(TLRPC.Message message) {
        int i;
        int i2;
        Bitmap B;
        byte[] bArr;
        TLRPC.PhotoSize p = p(message);
        if (p == null || (bArr = p.bytes) == null || bArr.length == 0) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                int size = messageMedia.document.thumbs.size();
                for (int i3 = 0; i3 < size; i3++) {
                    TLRPC.PhotoSize photoSize = message.media.document.thumbs.get(i3);
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        TLRPC.PhotoSize w = xb4.w(message.media.document.thumbs, jn7.q5, false, null, false);
                        if (w == null) {
                            int i4 = 0;
                            while (true) {
                                if (i4 >= message.media.document.attributes.size()) {
                                    i = 0;
                                    i2 = 0;
                                    break;
                                }
                                if (message.media.document.attributes.get(i4) instanceof TLRPC.TL_documentAttributeVideo) {
                                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) message.media.document.attributes.get(i4);
                                    i2 = tL_documentAttributeVideo.h;
                                    i = tL_documentAttributeVideo.w;
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            i2 = w.h;
                            i = w.w;
                        }
                        PointF S1 = wb2.S1(i, i2, 0, 0);
                        Locale locale = Locale.US;
                        String s = jn5.s(message, message, photoSize);
                        float f = S1.x;
                        float f2 = hl.p;
                        String str = s + "_false@" + ((int) (f / f2)) + "_" + ((int) (S1.y / f2)) + "_b";
                        if (!z().F(str, false) && (B = B(null, photoSize.bytes)) != null) {
                            Utilities.blurBitmap(B, 3);
                            float f3 = S1.x;
                            float f4 = hl.p;
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(B, (int) (f3 / f4), (int) (S1.y / f4), true);
                            if (createScaledBitmap != B) {
                                B.recycle();
                                B = createScaledBitmap;
                            }
                            return new en5(str, new BitmapDrawable(B));
                        }
                    }
                }
            }
        } else {
            xb4.G(yac.t0);
            File J2 = xb4.J(p, null, true, true);
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.w = p.w;
            tL_photoSize_layer127.h = p.h;
            tL_photoSize_layer127.location = p.location;
            tL_photoSize_layer127.size = p.size;
            tL_photoSize_layer127.type = p.type;
            if (J2.exists() && message.grouped_id == 0) {
                PointF S12 = wb2.S1(p.w, p.h, 0, 0);
                Locale locale2 = Locale.US;
                TLRPC.FileLocation fileLocation = p.location;
                long j = fileLocation.volume_id;
                int i5 = fileLocation.local_id;
                float f5 = S12.x;
                float f6 = hl.p;
                String str2 = j + "_" + i5 + "@" + ((int) (f5 / f6)) + "_" + ((int) (S12.y / f6)) + "_b";
                if (!z().F(str2, false)) {
                    String path = J2.getPath();
                    float f7 = S12.x;
                    float f8 = hl.p;
                    Bitmap G = G(path, null, (int) (f7 / f8), (int) (S12.y / f8), false);
                    if (G != null) {
                        Utilities.blurBitmap(G, 3);
                        float f9 = S12.x;
                        float f10 = hl.p;
                        Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(G, (int) (f9 / f10), (int) (S12.y / f10), true);
                        if (createScaledBitmap2 != G) {
                            G.recycle();
                            G = createScaledBitmap2;
                        }
                        return new en5(str2, new BitmapDrawable(G));
                    }
                }
            }
        }
        return null;
    }

    public static File w(String str) {
        String x = x(str, "jpg");
        return new File(xb4.z(4), Utilities.a(str) + "." + x);
    }

    public static String x(String str, String str2) {
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.length() > 1) {
            str = lastPathSegment;
        }
        int lastIndexOf = str.lastIndexOf(46);
        String substring = lastIndexOf != -1 ? str.substring(lastIndexOf + 1) : null;
        return (substring == null || substring.length() == 0 || substring.length() > 4) ? str2 : substring;
    }

    public static in5 z() {
        in5 in5Var;
        in5 in5Var2 = N;
        if (in5Var2 != null) {
            return in5Var2;
        }
        synchronized (in5.class) {
            in5Var = N;
            if (in5Var == null) {
                in5Var = new in5();
                N = in5Var;
            }
        }
        return in5Var;
    }

    public final void D(String str) {
        HashMap hashMap = this.a;
        Integer num = (Integer) hashMap.get(str);
        if (num == null) {
            hashMap.put(str, 1);
        } else {
            hashMap.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public final boolean F(String str, boolean z) {
        return z ? u(str) != null : v(str) != null;
    }

    public final void H(int i, String str, String str2) {
        if (str == null || str.length() == 0) {
            return;
        }
        HashMap hashMap = this.C;
        if (hashMap.containsKey(str)) {
            return;
        }
        String x = x(str, str2);
        File file = new File(xb4.z(4), Utilities.a(str) + "_temp." + x);
        file.delete();
        zm5 zm5Var = new zm5(this, str, file, x, i);
        this.B.add(zm5Var);
        hashMap.put(str, zm5Var);
        hl.c3(new sb4((Object) this, (Object) null, 0, (byte) 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x022f, code lost:
    
        if (r4.local_id >= 0) goto L193;
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x030d A[EDGE_INSN: B:182:0x030d->B:183:0x030d BREAK  A[LOOP:0: B:96:0x01a6->B:105:0x0301], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x036d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0375 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x037d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x038c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x039e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(ImageReceiver imageReceiver, List list) {
        int i;
        String str;
        boolean z;
        boolean z2;
        String str2;
        boolean z3;
        String str3;
        int i2;
        boolean z4;
        Object obj;
        jn5 jn5Var;
        String str4;
        jn5 jn5Var2;
        jn5 jn5Var3;
        jn5 jn5Var4;
        boolean z5;
        String str5;
        String str6;
        jn5 jn5Var5;
        String str7;
        String str8;
        int i3;
        int i4;
        jn5 jn5Var6;
        String str9;
        int i5;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        int i6;
        String str18;
        ImageReceiver imageReceiver2;
        int i7;
        String str19;
        jn5 jn5Var7;
        boolean z6;
        jn5 jn5Var8;
        jn5 jn5Var9;
        String str20;
        Drawable drawable;
        Drawable o;
        String str21 = imageReceiver.i0;
        int i8 = imageReceiver.q0 + 1;
        imageReceiver.q0 = i8;
        pm5 pm5Var = this.d;
        om5 om5Var = this.b;
        om5 om5Var2 = this.c;
        if (str21 != null) {
            jn5 jn5Var10 = imageReceiver.g0;
            Drawable o2 = o(str21, list);
            if (o2 == null) {
                if (a0(jn5Var10, str21)) {
                    o2 = u(str21);
                } else {
                    Drawable drawable2 = (Drawable) om5Var2.f(str21);
                    if (drawable2 != null) {
                        om5Var2.g(str21);
                    } else {
                        drawable2 = (Drawable) om5Var.f(str21);
                        if (drawable2 != null) {
                            om5Var.g(str21);
                        }
                    }
                    o2 = drawable2;
                    if (o2 == null && (o2 = (Drawable) pm5Var.f(str21)) != null) {
                        pm5Var.g(str21);
                    }
                }
            }
            Drawable drawable3 = o2;
            if ((drawable3 instanceof b29 ? ((b29) drawable3).p() : drawable3 instanceof lm ? ((lm) drawable3).s() : true) && drawable3 != null) {
                d(imageReceiver, true);
                imageReceiver.h0(drawable3, str21, 3, true, i8);
                if (!imageReceiver.T0) {
                    return;
                }
                z = true;
                i = i8;
                z2 = false;
                str = str21;
            } else if (drawable3 != null) {
                i = i8;
                imageReceiver.h0(drawable3, str21, 3, true, i);
                str = str21;
                z2 = true;
                z = false;
            }
            str2 = imageReceiver.R;
            if (!z && str2 != null) {
                jn5 jn5Var11 = imageReceiver.P;
                o = o(str2, list);
                if (o == null && a0(jn5Var11, str2)) {
                    o = u(str2);
                }
                if (o == null) {
                    Drawable drawable4 = (Drawable) om5Var2.f(str2);
                    if (drawable4 != null) {
                        om5Var2.g(str2);
                    } else {
                        drawable4 = (Drawable) om5Var.f(str2);
                        if (drawable4 != null) {
                            om5Var.g(str2);
                        }
                    }
                    o = drawable4;
                    if (o == null && (o = (Drawable) pm5Var.f(str2)) != null) {
                        pm5Var.g(str2);
                    }
                }
                if (o != null) {
                    d(imageReceiver, true);
                    imageReceiver.h0(o, str2, 0, true, i);
                    if (!imageReceiver.T0 && (str == null || z2)) {
                        return;
                    }
                    z3 = true;
                    str3 = imageReceiver.Z;
                    if (str3 != null) {
                        if (a0(imageReceiver.X, str3)) {
                            drawable = u(str3);
                        } else {
                            drawable = (Drawable) om5Var2.f(str3);
                            if (drawable != null) {
                                om5Var2.g(str3);
                            } else {
                                drawable = (Drawable) om5Var.f(str3);
                                if (drawable != null) {
                                    om5Var.g(str3);
                                }
                            }
                            if (drawable == null && (drawable = (Drawable) pm5Var.f(str3)) != null) {
                                pm5Var.g(str3);
                            }
                        }
                        if (drawable != null) {
                            imageReceiver.h0(drawable, str3, 1, true, i);
                            i2 = i;
                            d(imageReceiver, false);
                            if (z3 && imageReceiver.T0) {
                                return;
                            }
                            z4 = true;
                            obj = imageReceiver.h;
                            TLRPC.Document document = imageReceiver.I0;
                            jn5Var = imageReceiver.X;
                            str4 = imageReceiver.Y;
                            jn5Var2 = imageReceiver.g0;
                            String str22 = imageReceiver.h0;
                            jn5Var3 = imageReceiver.P;
                            String str23 = imageReceiver.Q;
                            if (jn5Var3 == null && imageReceiver.G0 && imageReceiver.J0) {
                                if (!(obj instanceof r47)) {
                                    jn5Var4 = jn5.b(((r47) obj).F0());
                                } else if (document != null) {
                                    jn5Var4 = jn5.b(document);
                                }
                                z5 = true;
                                String str24 = null;
                                String str25 = (jn5Var4 == null && jn5Var4.p == 2) ? "mp4" : null;
                                str5 = (jn5Var2 == null && jn5Var2.p == 2) ? "mp4" : null;
                                str6 = imageReceiver.o0;
                                if (str6 == null) {
                                    str6 = "jpg";
                                }
                                String str26 = str25 != null ? str6 : str25;
                                if (str5 == null) {
                                    str5 = str6;
                                }
                                boolean z7 = z4;
                                jn5Var5 = jn5Var2;
                                boolean z8 = z5;
                                jn5 jn5Var12 = jn5Var3;
                                str7 = null;
                                str8 = null;
                                String str27 = null;
                                String str28 = null;
                                i3 = 0;
                                boolean z9 = false;
                                while (true) {
                                    i4 = i2;
                                    if (i3 < 2) {
                                        break;
                                    }
                                    if (i3 == 0) {
                                        jn5Var7 = jn5Var4;
                                        i7 = i3;
                                        str19 = str26;
                                    } else {
                                        i7 = i3;
                                        str19 = str5;
                                        jn5Var7 = jn5Var5;
                                    }
                                    boolean z10 = z2;
                                    if (jn5Var7 == null) {
                                        z6 = z3;
                                    } else {
                                        z6 = z3;
                                        String q = jn5Var7.q(obj, jn5Var5 != null ? jn5Var5 : jn5Var4, false);
                                        if (q != null) {
                                            if (jn5Var5 != null) {
                                                jn5Var9 = jn5Var4;
                                                jn5Var8 = jn5Var5;
                                            } else {
                                                jn5Var8 = jn5Var4;
                                                jn5Var9 = jn5Var8;
                                            }
                                            String q2 = jn5Var7.q(obj, jn5Var8, true);
                                            if (jn5Var7.g != null) {
                                                q2 = q2 + "." + x(jn5Var7.g, "jpg");
                                                str20 = str4;
                                            } else {
                                                TLRPC.PhotoSize photoSize = jn5Var7.k;
                                                str20 = str4;
                                                if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                                                    q2 = qd4.p(q2, ".", str19);
                                                } else {
                                                    if (jn5Var7.f != null) {
                                                        q2 = qd4.p(q2, ".", str19);
                                                        if (imageReceiver.o0 == null) {
                                                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = jn5Var7.f;
                                                            if (tL_fileLocationToBeDeprecated.key == null) {
                                                                if (tL_fileLocationToBeDeprecated.volume_id == -2147483648L) {
                                                                }
                                                            }
                                                        }
                                                        z9 = true;
                                                    } else {
                                                        jxc jxcVar = jn5Var7.v;
                                                        if (jxcVar != null) {
                                                            q2 = q2 + "." + x(jn5Var7.v.a, xb4.H(jxcVar.e));
                                                        } else if (jn5Var7.h != null) {
                                                            q2 = qd4.p(q2, ".", str19);
                                                        } else if (jn5Var7.i != null) {
                                                            if (i7 == 0 && z8) {
                                                                q = "q_".concat(q);
                                                            }
                                                            String B = xb4.B(jn5Var7.i);
                                                            int lastIndexOf = B.lastIndexOf(46);
                                                            String str29 = "";
                                                            String substring = lastIndexOf == -1 ? "" : B.substring(lastIndexOf);
                                                            if (substring.length() > 1) {
                                                                str29 = substring;
                                                            } else if ("video/mp4".equals(jn5Var7.i.mime_type)) {
                                                                str29 = ".mp4";
                                                            } else if ("video/x-matroska".equals(jn5Var7.i.mime_type)) {
                                                                str29 = ".mkv";
                                                            }
                                                            q2 = qd4.o(q2, str29);
                                                            if (r47.J4(jn5Var7.i) || r47.s3(jn5Var7.i, false) || r47.h4(jn5Var7.i) || r47.y(jn5Var7.i)) {
                                                                z9 = false;
                                                            }
                                                            z9 = true;
                                                        } else if (obj instanceof TLRPC.StickerSet) {
                                                            q2 = qd4.p(q2, ".", str19);
                                                        }
                                                    }
                                                    i3 = i7 + 1;
                                                    i2 = i4;
                                                    z2 = z10;
                                                    z3 = z6;
                                                    str4 = str20;
                                                }
                                            }
                                            if (i7 == 0) {
                                                str8 = q;
                                                str27 = q2;
                                            } else {
                                                str7 = q;
                                                str28 = q2;
                                            }
                                            if (jn5Var7 == jn5Var) {
                                                if (i7 == 0) {
                                                    jn5Var4 = null;
                                                    str8 = null;
                                                    str27 = null;
                                                    i3 = i7 + 1;
                                                    i2 = i4;
                                                    z2 = z10;
                                                    z3 = z6;
                                                    str4 = str20;
                                                } else {
                                                    str7 = null;
                                                    jn5Var5 = null;
                                                    str28 = null;
                                                }
                                            }
                                            jn5Var4 = jn5Var9;
                                            i3 = i7 + 1;
                                            i2 = i4;
                                            z2 = z10;
                                            z3 = z6;
                                            str4 = str20;
                                        }
                                    }
                                    str20 = str4;
                                    i3 = i7 + 1;
                                    i2 = i4;
                                    z2 = z10;
                                    z3 = z6;
                                    str4 = str20;
                                }
                                jn5Var6 = jn5Var4;
                                str9 = str4;
                                boolean z11 = z2;
                                boolean z12 = z3;
                                if (jn5Var == null) {
                                    jn5 jn5Var13 = imageReceiver.O;
                                    if (jn5Var13 == null) {
                                        if (jn5Var5 != null) {
                                            jn5Var12 = jn5Var5;
                                        }
                                        jn5Var13 = jn5Var12;
                                    }
                                    String q3 = jn5Var.q(obj, jn5Var13, false);
                                    i5 = 1;
                                    String q4 = jn5Var.q(obj, jn5Var13, true);
                                    if (jn5Var.g != null) {
                                        q4 = q4 + "." + x(jn5Var.g, "jpg");
                                    } else {
                                        TLRPC.PhotoSize photoSize2 = jn5Var.k;
                                        if ((photoSize2 instanceof TLRPC.TL_photoStrippedSize) || (photoSize2 instanceof TLRPC.TL_photoPathSize)) {
                                            q4 = qd4.p(q4, ".", str6);
                                        } else if (jn5Var.f != null) {
                                            q4 = qd4.p(q4, ".", str6);
                                        }
                                    }
                                    str24 = q4;
                                    str10 = q3;
                                } else {
                                    i5 = 1;
                                    str10 = null;
                                }
                                if (str7 != null && str22 != null) {
                                    str7 = qd4.y(str7, "@", str22);
                                }
                                if (str8 != null && str23 != null) {
                                    str8 = qd4.y(str8, "@", str23);
                                }
                                if (str10 != null || str9 == null) {
                                    str11 = str9;
                                } else {
                                    str11 = str9;
                                    str10 = qd4.y(str10, "@", str11);
                                }
                                if (imageReceiver.w1 != null && str8 != null) {
                                    str8 = c00.k(new StringBuilder(), imageReceiver.w1, str8);
                                }
                                String str30 = str8;
                                if (imageReceiver.w1 != null && str7 != null) {
                                    str7 = c00.k(new StringBuilder(), imageReceiver.w1, str7);
                                }
                                String str31 = str7;
                                if (jn5Var6 != null) {
                                    str12 = str6;
                                    str13 = str10;
                                    str14 = str30;
                                    str15 = str24;
                                    str16 = str26;
                                    str17 = str27;
                                    i6 = i4;
                                } else {
                                    if (jn5Var6.g != null) {
                                        g(imageReceiver, str10, str24, str6, jn5Var, str11, 0L, 1, 1, z7 ? 2 : i5, i4);
                                        g(imageReceiver, str30, str27, str26, jn5Var6, str23, imageReceiver.r0, 1, 0, 0, i4);
                                        return;
                                    }
                                    jn5Var6 = jn5Var6;
                                    str13 = str10;
                                    str14 = str30;
                                    str15 = str24;
                                    str16 = str26;
                                    str17 = str27;
                                    i6 = i4;
                                    str12 = str6;
                                }
                                int i9 = imageReceiver.s0;
                                if (jn5Var5 != null) {
                                    int i10 = (i9 == 0 && z9) ? i5 : i9;
                                    g(imageReceiver, str13, str15, str12, jn5Var, str11, 0L, i10 == 0 ? i5 : i10, 1, z7 ? 2 : i5, i6);
                                    g(imageReceiver, str14, str17, str16, jn5Var6, str23, imageReceiver.r0, i10, 0, 0, i6);
                                    return;
                                }
                                int i11 = (i9 == 0 && z9) ? i5 : i9;
                                int i12 = i11 == 0 ? i5 : i11;
                                if (z7) {
                                    str18 = str22;
                                } else {
                                    str18 = str22;
                                    g(imageReceiver, str13, str15, str12, jn5Var, str11, 0L, i12, 1, 1, i6);
                                }
                                if (z12) {
                                    imageReceiver2 = imageReceiver;
                                } else {
                                    imageReceiver2 = imageReceiver;
                                    g(imageReceiver2, str14, str17, str16, jn5Var6, str23, 0L, 1, 0, 0, i6);
                                }
                                if (z11) {
                                    return;
                                }
                                g(imageReceiver2, str31, str28, str5, jn5Var5, str18, imageReceiver2.r0, i11, 3, 0, i6);
                                return;
                            }
                            jn5Var4 = jn5Var3;
                            z5 = false;
                            String str242 = null;
                            String str252 = (jn5Var4 == null && jn5Var4.p == 2) ? "mp4" : null;
                            if (jn5Var2 == null) {
                            }
                            str6 = imageReceiver.o0;
                            if (str6 == null) {
                            }
                            if (str252 != null) {
                            }
                            if (str5 == null) {
                            }
                            boolean z72 = z4;
                            jn5Var5 = jn5Var2;
                            boolean z82 = z5;
                            jn5 jn5Var122 = jn5Var3;
                            str7 = null;
                            str8 = null;
                            String str272 = null;
                            String str282 = null;
                            i3 = 0;
                            boolean z92 = false;
                            while (true) {
                                i4 = i2;
                                if (i3 < 2) {
                                }
                                i3 = i7 + 1;
                                i2 = i4;
                                z2 = z10;
                                z3 = z6;
                                str4 = str20;
                            }
                            jn5Var6 = jn5Var4;
                            str9 = str4;
                            boolean z112 = z2;
                            boolean z122 = z3;
                            if (jn5Var == null) {
                            }
                            if (str7 != null) {
                                str7 = qd4.y(str7, "@", str22);
                            }
                            if (str8 != null) {
                                str8 = qd4.y(str8, "@", str23);
                            }
                            if (str10 != null) {
                            }
                            str11 = str9;
                            if (imageReceiver.w1 != null) {
                                str8 = c00.k(new StringBuilder(), imageReceiver.w1, str8);
                            }
                            String str302 = str8;
                            if (imageReceiver.w1 != null) {
                                str7 = c00.k(new StringBuilder(), imageReceiver.w1, str7);
                            }
                            String str312 = str7;
                            if (jn5Var6 != null) {
                            }
                            int i92 = imageReceiver.s0;
                            if (jn5Var5 != null) {
                            }
                        }
                    }
                    i2 = i;
                    z4 = false;
                    obj = imageReceiver.h;
                    TLRPC.Document document2 = imageReceiver.I0;
                    jn5Var = imageReceiver.X;
                    str4 = imageReceiver.Y;
                    jn5Var2 = imageReceiver.g0;
                    String str222 = imageReceiver.h0;
                    jn5Var3 = imageReceiver.P;
                    String str232 = imageReceiver.Q;
                    if (jn5Var3 == null) {
                        if (!(obj instanceof r47)) {
                        }
                        z5 = true;
                        String str2422 = null;
                        String str2522 = (jn5Var4 == null && jn5Var4.p == 2) ? "mp4" : null;
                        if (jn5Var2 == null) {
                        }
                        str6 = imageReceiver.o0;
                        if (str6 == null) {
                        }
                        if (str2522 != null) {
                        }
                        if (str5 == null) {
                        }
                        boolean z722 = z4;
                        jn5Var5 = jn5Var2;
                        boolean z822 = z5;
                        jn5 jn5Var1222 = jn5Var3;
                        str7 = null;
                        str8 = null;
                        String str2722 = null;
                        String str2822 = null;
                        i3 = 0;
                        boolean z922 = false;
                        while (true) {
                            i4 = i2;
                            if (i3 < 2) {
                            }
                            i3 = i7 + 1;
                            i2 = i4;
                            z2 = z10;
                            z3 = z6;
                            str4 = str20;
                        }
                        jn5Var6 = jn5Var4;
                        str9 = str4;
                        boolean z1122 = z2;
                        boolean z1222 = z3;
                        if (jn5Var == null) {
                        }
                        if (str7 != null) {
                        }
                        if (str8 != null) {
                        }
                        if (str10 != null) {
                        }
                        str11 = str9;
                        if (imageReceiver.w1 != null) {
                        }
                        String str3022 = str8;
                        if (imageReceiver.w1 != null) {
                        }
                        String str3122 = str7;
                        if (jn5Var6 != null) {
                        }
                        int i922 = imageReceiver.s0;
                        if (jn5Var5 != null) {
                        }
                    }
                    jn5Var4 = jn5Var3;
                    z5 = false;
                    String str24222 = null;
                    String str25222 = (jn5Var4 == null && jn5Var4.p == 2) ? "mp4" : null;
                    if (jn5Var2 == null) {
                    }
                    str6 = imageReceiver.o0;
                    if (str6 == null) {
                    }
                    if (str25222 != null) {
                    }
                    if (str5 == null) {
                    }
                    boolean z7222 = z4;
                    jn5Var5 = jn5Var2;
                    boolean z8222 = z5;
                    jn5 jn5Var12222 = jn5Var3;
                    str7 = null;
                    str8 = null;
                    String str27222 = null;
                    String str28222 = null;
                    i3 = 0;
                    boolean z9222 = false;
                    while (true) {
                        i4 = i2;
                        if (i3 < 2) {
                        }
                        i3 = i7 + 1;
                        i2 = i4;
                        z2 = z10;
                        z3 = z6;
                        str4 = str20;
                    }
                    jn5Var6 = jn5Var4;
                    str9 = str4;
                    boolean z11222 = z2;
                    boolean z12222 = z3;
                    if (jn5Var == null) {
                    }
                    if (str7 != null) {
                    }
                    if (str8 != null) {
                    }
                    if (str10 != null) {
                    }
                    str11 = str9;
                    if (imageReceiver.w1 != null) {
                    }
                    String str30222 = str8;
                    if (imageReceiver.w1 != null) {
                    }
                    String str31222 = str7;
                    if (jn5Var6 != null) {
                    }
                    int i9222 = imageReceiver.s0;
                    if (jn5Var5 != null) {
                    }
                }
            }
            z3 = z;
            str3 = imageReceiver.Z;
            if (str3 != null) {
            }
            i2 = i;
            z4 = false;
            obj = imageReceiver.h;
            TLRPC.Document document22 = imageReceiver.I0;
            jn5Var = imageReceiver.X;
            str4 = imageReceiver.Y;
            jn5Var2 = imageReceiver.g0;
            String str2222 = imageReceiver.h0;
            jn5Var3 = imageReceiver.P;
            String str2322 = imageReceiver.Q;
            if (jn5Var3 == null) {
            }
            jn5Var4 = jn5Var3;
            z5 = false;
            String str242222 = null;
            String str252222 = (jn5Var4 == null && jn5Var4.p == 2) ? "mp4" : null;
            if (jn5Var2 == null) {
            }
            str6 = imageReceiver.o0;
            if (str6 == null) {
            }
            if (str252222 != null) {
            }
            if (str5 == null) {
            }
            boolean z72222 = z4;
            jn5Var5 = jn5Var2;
            boolean z82222 = z5;
            jn5 jn5Var122222 = jn5Var3;
            str7 = null;
            str8 = null;
            String str272222 = null;
            String str282222 = null;
            i3 = 0;
            boolean z92222 = false;
            while (true) {
                i4 = i2;
                if (i3 < 2) {
                }
                i3 = i7 + 1;
                i2 = i4;
                z2 = z10;
                z3 = z6;
                str4 = str20;
            }
            jn5Var6 = jn5Var4;
            str9 = str4;
            boolean z112222 = z2;
            boolean z122222 = z3;
            if (jn5Var == null) {
            }
            if (str7 != null) {
            }
            if (str8 != null) {
            }
            if (str10 != null) {
            }
            str11 = str9;
            if (imageReceiver.w1 != null) {
            }
            String str302222 = str8;
            if (imageReceiver.w1 != null) {
            }
            String str312222 = str7;
            if (jn5Var6 != null) {
            }
            int i92222 = imageReceiver.s0;
            if (jn5Var5 != null) {
            }
        }
        i = i8;
        str = str21;
        z = false;
        z2 = false;
        str2 = imageReceiver.R;
        if (!z) {
            jn5 jn5Var112 = imageReceiver.P;
            o = o(str2, list);
            if (o == null) {
                o = u(str2);
            }
            if (o == null) {
            }
            if (o != null) {
            }
        }
        z3 = z;
        str3 = imageReceiver.Z;
        if (str3 != null) {
        }
        i2 = i;
        z4 = false;
        obj = imageReceiver.h;
        TLRPC.Document document222 = imageReceiver.I0;
        jn5Var = imageReceiver.X;
        str4 = imageReceiver.Y;
        jn5Var2 = imageReceiver.g0;
        String str22222 = imageReceiver.h0;
        jn5Var3 = imageReceiver.P;
        String str23222 = imageReceiver.Q;
        if (jn5Var3 == null) {
        }
        jn5Var4 = jn5Var3;
        z5 = false;
        String str2422222 = null;
        String str2522222 = (jn5Var4 == null && jn5Var4.p == 2) ? "mp4" : null;
        if (jn5Var2 == null) {
        }
        str6 = imageReceiver.o0;
        if (str6 == null) {
        }
        if (str2522222 != null) {
        }
        if (str5 == null) {
        }
        boolean z722222 = z4;
        jn5Var5 = jn5Var2;
        boolean z822222 = z5;
        jn5 jn5Var1222222 = jn5Var3;
        str7 = null;
        str8 = null;
        String str2722222 = null;
        String str2822222 = null;
        i3 = 0;
        boolean z922222 = false;
        while (true) {
            i4 = i2;
            if (i3 < 2) {
            }
            i3 = i7 + 1;
            i2 = i4;
            z2 = z10;
            z3 = z6;
            str4 = str20;
        }
        jn5Var6 = jn5Var4;
        str9 = str4;
        boolean z1122222 = z2;
        boolean z1222222 = z3;
        if (jn5Var == null) {
        }
        if (str7 != null) {
        }
        if (str8 != null) {
        }
        if (str10 != null) {
        }
        str11 = str9;
        if (imageReceiver.w1 != null) {
        }
        String str3022222 = str8;
        if (imageReceiver.w1 != null) {
        }
        String str3122222 = str7;
        if (jn5Var6 != null) {
        }
        int i922222 = imageReceiver.s0;
        if (jn5Var5 != null) {
        }
    }

    public final void J(String str, String str2) {
        om5 om5Var = this.c;
        BitmapDrawable bitmapDrawable = (BitmapDrawable) om5Var.f(str);
        if (bitmapDrawable == null) {
            om5Var = this.b;
            bitmapDrawable = (BitmapDrawable) om5Var.f(str);
        }
        this.t.put(str, str2);
        if (bitmapDrawable != null) {
            BitmapDrawable bitmapDrawable2 = (BitmapDrawable) om5Var.f(str2);
            if (bitmapDrawable2 != null && bitmapDrawable2.getBitmap() != null && bitmapDrawable.getBitmap() != null) {
                Bitmap bitmap = bitmapDrawable2.getBitmap();
                Bitmap bitmap2 = bitmapDrawable.getBitmap();
                if (bitmap.getWidth() > bitmap2.getWidth() || bitmap.getHeight() > bitmap2.getHeight()) {
                    om5Var.n(str);
                }
            }
            this.F = str;
            om5Var.n(str);
            om5Var.l(str2, bitmapDrawable);
            this.F = null;
        }
        HashMap hashMap = this.a;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            hashMap.put(str2, num);
            hashMap.remove(str);
        }
    }

    public final void K(BitmapDrawable bitmapDrawable, String str, boolean z) {
        if (str.endsWith("_nocache")) {
            return;
        }
        if (z) {
            this.b.l(str, bitmapDrawable);
        } else {
            this.c.l(str, bitmapDrawable);
        }
    }

    public final void L(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            K(((en5) arrayList.get(i)).a, ((en5) arrayList.get(i)).b, true);
        }
    }

    public final void M(String str) {
        this.a.remove(str);
        this.c.n(str);
        this.b.n(str);
    }

    public final void N(String str, String str2, jn5 jn5Var, boolean z) {
        if (z) {
            hl.c3(new g65(this, str, str2, jn5Var, (byte) 7));
        } else {
            O(str, str2, jn5Var);
        }
    }

    public final void O(String str, String str2, jn5 jn5Var) {
        for (int i = 0; i < 2; i++) {
            ArrayList arrayList = null;
            if (i == 0) {
                ArrayList arrayList2 = (ArrayList) ((LinkedHashMap) this.c.d).get(str);
                if (arrayList2 != null) {
                    arrayList = new ArrayList(arrayList2);
                }
            } else {
                ArrayList arrayList3 = (ArrayList) ((LinkedHashMap) this.b.d).get(str);
                if (arrayList3 != null) {
                    arrayList = new ArrayList(arrayList3);
                }
            }
            int i2 = jn7.p4;
            if (arrayList != null) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    String str3 = (String) arrayList.get(i3);
                    String y = qd4.y(str, "@", str3);
                    String str4 = str2 + "@" + str3;
                    J(y, str4);
                    jn7.e().k(i2, y, str4, jn5Var);
                }
            } else {
                J(str, str2);
                jn7.e().k(i2, str, str2, jn5Var);
            }
        }
    }

    public final void P(boolean z) {
        if (z) {
            this.y--;
        }
        while (this.y < 4) {
            LinkedList linkedList = this.o;
            if (linkedList.isEmpty()) {
                return;
            }
            try {
                ((vm5) linkedList.poll()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                this.y++;
            } catch (Throwable unused) {
                P(false);
            }
        }
    }

    public final void Q(boolean z) {
        if (z) {
            this.x--;
        }
        while (this.x < 4) {
            LinkedList linkedList = this.n;
            if (linkedList.isEmpty()) {
                return;
            }
            dn5 dn5Var = (dn5) linkedList.poll();
            if (dn5Var != null) {
                dn5Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                this.x++;
            }
        }
    }

    public final void a(String str, jxc jxcVar) {
        if (str == null || jxcVar == null) {
            return;
        }
        this.A.put(str, jxcVar);
    }

    public final void c(String str) {
        HashMap hashMap = this.C;
        zm5 zm5Var = (zm5) hashMap.get(str);
        if (zm5Var != null) {
            zm5Var.cancel(true);
            hashMap.remove(str);
            this.B.remove(zm5Var);
        }
        Runnable runnable = (Runnable) this.D.get(str);
        if (runnable != null) {
            hl.r(runnable);
        }
        hl.c3(new sb4((Object) this, (Object) null, 0, (byte) 4));
    }

    public final void d(ImageReceiver imageReceiver, boolean z) {
        ArrayList arrayList = imageReceiver.x1;
        HashMap hashMap = rxc.f;
        if (hashMap != null) {
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                ArrayList arrayList2 = (ArrayList) entry.getValue();
                int i = 0;
                while (true) {
                    if (i >= arrayList2.size()) {
                        break;
                    }
                    if (((Pair) arrayList2.get(i)).first == imageReceiver) {
                        arrayList2.remove(i);
                        break;
                    }
                    i++;
                }
                if (arrayList2.isEmpty()) {
                    rxc.f.remove(str);
                    break;
                }
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        to3 to3Var = this.s;
        if (!isEmpty) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                to3Var.a((Runnable) arrayList.get(i2));
            }
            arrayList.clear();
        }
        arrayList.add(null);
        to3Var.c(new ds6((Object) this, z, (Object) imageReceiver, (byte) 25));
    }

    public final void e(Runnable runnable) {
        ((wo3) this.p.b).execute(new tg5(this, runnable, (byte) 3));
    }

    public final void f() {
        this.b.r(-1, null);
        this.c.r(-1, null);
        this.e.r(-1, null);
    }

    public final void g(final ImageReceiver imageReceiver, final String str, final String str2, final String str3, final jn5 jn5Var, final String str4, final long j, final int i, final int i2, final int i3, final int i4) {
        if (str2 == null || str == null || jn5Var == null) {
            return;
        }
        int A = imageReceiver.A(i2);
        if (A == 0) {
            A = this.G;
            if (i2 == 1) {
                imageReceiver.a0 = A;
            } else if (i2 == 3) {
                imageReceiver.j0 = A;
            } else {
                imageReceiver.S = A;
            }
            int i5 = A + 1;
            this.G = i5;
            if (i5 == Integer.MAX_VALUE) {
                this.G = 0;
            }
        }
        final int i6 = A;
        final boolean z = imageReceiver.G0;
        final Object obj = imageReceiver.h;
        final TLRPC.Document document = imageReceiver.I0;
        final boolean z2 = imageReceiver.H0;
        final int i7 = imageReceiver.d;
        final boolean z3 = i2 == 0 && imageReceiver.J0;
        Runnable runnable = new Runnable() { // from class: nm5
            /* JADX WARN: Code restructure failed: missing block: B:100:0x0611, code lost:
            
                if (r13.equals(r7) != false) goto L298;
             */
            /* JADX WARN: Code restructure failed: missing block: B:102:0x0617, code lost:
            
                if (in5.E(r7) == false) goto L299;
             */
            /* JADX WARN: Code restructure failed: missing block: B:103:0x0620, code lost:
            
                r0 = r4;
                r1 = r32;
                r3 = r33;
             */
            /* JADX WARN: Code restructure failed: missing block: B:166:0x0619, code lost:
            
                r0 = r4;
                r1 = r32;
                r3 = r33;
                r15 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:167:0x0604, code lost:
            
                r0 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:173:0x05f3, code lost:
            
                if (in5.E(r7) != false) goto L286;
             */
            /* JADX WARN: Code restructure failed: missing block: B:267:0x056d, code lost:
            
                if (r1.equals(r7) != false) goto L262;
             */
            /* JADX WARN: Code restructure failed: missing block: B:273:0x057a, code lost:
            
                if (r15.exists() == false) goto L269;
             */
            /* JADX WARN: Code restructure failed: missing block: B:92:0x05f5, code lost:
            
                r6.l = 2;
                r6.k = r2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:93:0x05fa, code lost:
            
                if (r7 == null) goto L291;
             */
            /* JADX WARN: Code restructure failed: missing block: B:95:0x0600, code lost:
            
                if (r7.endsWith("pframe") == false) goto L291;
             */
            /* JADX WARN: Code restructure failed: missing block: B:96:0x0602, code lost:
            
                r0 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:97:0x0605, code lost:
            
                r6.c = r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:98:0x060b, code lost:
            
                if ("g".equals(r7) != false) goto L298;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:106:0x0657  */
            /* JADX WARN: Removed duplicated region for block: B:109:0x065c  */
            /* JADX WARN: Removed duplicated region for block: B:112:0x067f A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:13:0x00be A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:159:0x078e  */
            /* JADX WARN: Removed duplicated region for block: B:161:0x0796  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x00cc A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:279:0x0626  */
            /* JADX WARN: Removed duplicated region for block: B:287:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:311:0x0223  */
            /* JADX WARN: Removed duplicated region for block: B:315:0x0233  */
            /* JADX WARN: Removed duplicated region for block: B:317:0x0237  */
            /* JADX WARN: Removed duplicated region for block: B:330:0x028b  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x02b7  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x0347  */
            /* JADX WARN: Type inference failed for: r3v16, types: [xo3] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                boolean z4;
                long j2;
                boolean z5;
                String str5;
                String str6;
                String str7;
                byte b;
                int i8;
                String str8;
                Object obj2;
                String str9;
                File file;
                boolean z6;
                boolean z7;
                String str10;
                int i9;
                TLRPC.Document document2;
                File file2;
                File file3;
                boolean z8;
                File file4;
                String str11;
                in5 in5Var;
                byte b2;
                ImageReceiver imageReceiver2;
                String str12;
                int i10;
                String str13;
                long j3;
                File file5;
                boolean z9;
                byte b3;
                byte b4;
                String str14;
                String str15;
                boolean z10;
                File file6;
                long j4;
                String str16;
                int i11;
                String str17;
                String str18;
                File file7;
                File file8;
                wm5 wm5Var;
                in5 in5Var2 = in5.this;
                byte b5 = i3;
                String str19 = str2;
                String str20 = str;
                int i12 = i6;
                ImageReceiver imageReceiver3 = imageReceiver;
                int i13 = i4;
                String str21 = str4;
                byte b6 = i2;
                jn5 jn5Var2 = jn5Var;
                boolean z11 = z3;
                Object obj3 = obj;
                int i14 = i7;
                TLRPC.Document document3 = document;
                boolean z12 = z;
                boolean z13 = z2;
                String str22 = str3;
                int i15 = i;
                long j5 = j;
                if (b5 != 2) {
                    wm5 wm5Var2 = (wm5) in5Var2.g.get(str19);
                    z4 = z12;
                    wm5 wm5Var3 = (wm5) in5Var2.i.get(str20);
                    wm5 wm5Var4 = (wm5) in5Var2.k.get(i12);
                    if (wm5Var4 != null) {
                        j2 = j5;
                        if (wm5Var4 == wm5Var3) {
                            int indexOf = wm5Var4.v.indexOf(imageReceiver3);
                            if (indexOf != -1) {
                                wm5Var4.w.set(indexOf, Integer.valueOf(i13));
                            }
                        } else if (wm5Var4 != wm5Var2) {
                            wm5Var = wm5Var2;
                            wm5Var4.b(imageReceiver3);
                        } else if (wm5Var3 == null) {
                            ArrayList arrayList = wm5Var4.v;
                            wm5Var = wm5Var2;
                            int indexOf2 = arrayList.indexOf(imageReceiver3);
                            if (indexOf2 != -1 && (((Integer) wm5Var4.z.get(indexOf2)).intValue() == b6 || (indexOf2 = arrayList.subList(indexOf2 + 1, arrayList.size()).indexOf(imageReceiver3)) != -1)) {
                                wm5Var4.w.set(indexOf2, Integer.valueOf(i13));
                                wm5Var4.x.set(indexOf2, str20);
                                wm5Var4.y.set(indexOf2, str21);
                            }
                            z5 = true;
                            if (!z5 || wm5Var3 == null) {
                                i13 = i13;
                            } else {
                                i13 = i13;
                                wm5Var3.a(imageReceiver3, str20, str21, b6, i13);
                                z5 = true;
                            }
                            if (!z5 && wm5Var != null) {
                                wm5Var.a(imageReceiver3, str20, str21, b6, i13);
                                z5 = true;
                            }
                        }
                        wm5Var = wm5Var2;
                        z5 = true;
                        if (z5) {
                        }
                        i13 = i13;
                        if (!z5) {
                            wm5Var.a(imageReceiver3, str20, str21, b6, i13);
                            z5 = true;
                        }
                    } else {
                        wm5Var = wm5Var2;
                        j2 = j5;
                    }
                    z5 = false;
                    if (z5) {
                    }
                    i13 = i13;
                    if (!z5) {
                    }
                } else {
                    z4 = z12;
                    j2 = j5;
                    z5 = false;
                }
                if (z5) {
                    return;
                }
                String str23 = jn5Var2.g;
                if (str23 != null) {
                    if (str23.startsWith("http") || str23.startsWith("athumb")) {
                        z6 = false;
                        file = null;
                    } else if (str23.startsWith("thumb://")) {
                        int indexOf3 = str23.indexOf(":", 8);
                        if (indexOf3 >= 0) {
                            file = new File(str23.substring(indexOf3 + 1));
                            z6 = true;
                        }
                        file = null;
                        z6 = true;
                    } else {
                        if (str23.startsWith("vthumb://")) {
                            int indexOf4 = str23.indexOf(":", 9);
                            if (indexOf4 >= 0) {
                                file = new File(str23.substring(indexOf4 + 1));
                            }
                            file = null;
                        } else {
                            file = new File(str23);
                        }
                        z6 = true;
                    }
                    str5 = str19;
                    str6 = "_";
                    str7 = str20;
                    b = b6;
                    i8 = i13;
                    str8 = str22;
                    obj2 = obj3;
                    str9 = "athumb";
                } else if (b5 == 0 && z11) {
                    if (obj3 instanceof r47) {
                        r47 r47Var = (r47) obj3;
                        TLRPC.Document F0 = r47Var.F0();
                        i8 = i13;
                        String str24 = r47Var.k.attachPath;
                        xb4.G(i14);
                        str9 = "athumb";
                        file2 = xb4.M(r47Var.k, false, true);
                        str10 = str24;
                        i9 = r47.K4(r47Var.k) ? 2 : r47.Q4(r47Var.k) ? 1 : r47.n1(r47Var.k) instanceof TLRPC.TL_messageMediaDocument ? 3 : r47.n1(r47Var.k) instanceof TLRPC.TL_messageMediaPhoto ? 0 : 4;
                        document2 = F0;
                        z7 = false;
                    } else {
                        i8 = i13;
                        str9 = "athumb";
                        if (document3 != null) {
                            xb4.G(i14);
                            File J2 = xb4.J(document3, null, true, true);
                            int i16 = r47.J4(document3) ? 2 : 3;
                            document2 = document3;
                            file2 = J2;
                            z7 = true;
                            i9 = i16;
                            str10 = null;
                        } else {
                            z7 = false;
                            str10 = null;
                            i9 = 0;
                            document2 = null;
                            file2 = null;
                        }
                    }
                    if (document2 != null) {
                        if (z4) {
                            obj2 = obj3;
                            str7 = str20;
                            File z14 = xb4.z(4);
                            b = b6;
                            str5 = str19;
                            StringBuilder sb = new StringBuilder("q_");
                            sb.append(document2.dc_id);
                            sb.append("_");
                            str6 = "_";
                            str8 = str22;
                            file3 = new File(z14, qu6.p(sb, document2.id, ".jpg"));
                            if (file3.exists()) {
                                z8 = true;
                                if (!TextUtils.isEmpty(str10)) {
                                    File file9 = new File(str10);
                                    if (file9.exists()) {
                                        file4 = file9;
                                        if (file4 == null) {
                                            file4 = file2;
                                        }
                                        if (file3 == null) {
                                            String r = xb4.r(null, document2);
                                            gn5 gn5Var = (gn5) in5Var2.l.get(r);
                                            if (gn5Var == null) {
                                                gn5Var = new gn5();
                                                gn5Var.c = new ArrayList();
                                                gn5Var.d = new ArrayList();
                                                gn5Var.a = document2;
                                                gn5Var.b = str21;
                                                gn5Var.e = z7;
                                                in5Var2.l.put(r, gn5Var);
                                            }
                                            if (!gn5Var.c.contains(imageReceiver3)) {
                                                gn5Var.c.add(imageReceiver3);
                                                gn5Var.d.add(Integer.valueOf(i8));
                                            }
                                            in5Var2.m.put(i12, r);
                                            if (file4.exists() && z13) {
                                                in5Var2.r(i9, file4, gn5Var);
                                                return;
                                            }
                                            return;
                                        }
                                        file = file3;
                                        z6 = true;
                                        if (b5 != 2) {
                                            return;
                                        }
                                        boolean z15 = jn5Var2.c != null;
                                        wm5 wm5Var5 = new wm5(in5Var2);
                                        wm5Var5.a = imageReceiver3.w != 0;
                                        if (!z11) {
                                            byte b7 = 2;
                                            if (jn5Var2.p == 2) {
                                                str11 = str8;
                                            } else if (r47.r3(jn5Var2.v) || r47.s3(jn5Var2.i, false) || r47.h4(jn5Var2.i) || r47.M4(jn5Var2.i)) {
                                                str11 = str8;
                                                b7 = 2;
                                            } else {
                                                String str25 = jn5Var2.g;
                                                if (str25 != null && !str25.startsWith("vthumb") && !str25.startsWith("thumb")) {
                                                    String x = in5.x(str25, "jpg");
                                                    if (x.equalsIgnoreCase("webm") || x.equalsIgnoreCase("mp4") || x.equalsIgnoreCase("gif")) {
                                                        str11 = str8;
                                                        wm5Var5.l = (byte) 2;
                                                    } else {
                                                        str11 = str8;
                                                        if ("tgs".equals(str11)) {
                                                            wm5Var5.l = (byte) 1;
                                                        }
                                                    }
                                                    if (file == null) {
                                                        TLRPC.PhotoSize photoSize = jn5Var2.k;
                                                        j3 = 0;
                                                        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                                                            in5Var = in5Var2;
                                                            b2 = b5;
                                                            imageReceiver2 = imageReceiver3;
                                                            str14 = "gl";
                                                            str12 = str11;
                                                            i10 = i15;
                                                            str13 = str5;
                                                            str15 = str6;
                                                            z10 = z8;
                                                            file6 = file;
                                                            j4 = 0;
                                                            z9 = true;
                                                        } else {
                                                            oy9 oy9Var = jn5Var2.h;
                                                            if (oy9Var != null) {
                                                                wm5Var5.h = oy9Var;
                                                                boolean z16 = oy9Var.b.dc_id == Integer.MIN_VALUE;
                                                                str13 = str5;
                                                                in5Var = in5Var2;
                                                                b2 = b5;
                                                                z10 = z8;
                                                                imageReceiver2 = imageReceiver3;
                                                                str14 = "gl";
                                                                str12 = str11;
                                                                file6 = new File(xb4.z(4), str13);
                                                                j4 = 0;
                                                                i10 = i15;
                                                                str15 = str6;
                                                                z9 = z16;
                                                            } else {
                                                                str13 = str5;
                                                                boolean z17 = z6;
                                                                b2 = b5;
                                                                z10 = z8;
                                                                if ("g".equals(str21) || "gl".equals(str21) || in5.E(str21) || (i15 == 0 && j2 > 0 && jn5Var2.g == null && !z15)) {
                                                                    imageReceiver2 = imageReceiver3;
                                                                    TLRPC.Document document4 = jn5Var2.i;
                                                                    if (document4 != null) {
                                                                        if (document4 instanceof TLRPC.TL_documentEncrypted) {
                                                                            in5Var = in5Var2;
                                                                            file7 = new File(xb4.z(4), str13);
                                                                        } else {
                                                                            in5Var = in5Var2;
                                                                            file7 = r47.J4(document4) ? new File(xb4.z(2), str13) : new File(xb4.z(3), str13);
                                                                        }
                                                                        if ((in5.E(str21) || "g".equals(str21) || "gl".equals(str21)) && !file7.exists()) {
                                                                            File z18 = xb4.z(4);
                                                                            str12 = str11;
                                                                            StringBuilder sb2 = new StringBuilder();
                                                                            str14 = "gl";
                                                                            sb2.append(document4.dc_id);
                                                                            str15 = str6;
                                                                            sb2.append(str15);
                                                                            str17 = str21;
                                                                            i11 = i15;
                                                                            file8 = new File(z18, qu6.p(sb2, document4.id, ".temp"));
                                                                        } else {
                                                                            i11 = i15;
                                                                            str14 = "gl";
                                                                            str12 = str11;
                                                                            str15 = str6;
                                                                            str17 = str21;
                                                                            file8 = file7;
                                                                        }
                                                                        if (document4 instanceof kp3) {
                                                                            if (((kp3) document4).b == null) {
                                                                                z17 = true;
                                                                            }
                                                                            wm5Var5.l = (byte) 5;
                                                                        } else if ("application/x-tgsdice".equals(jn5Var2.i.mime_type)) {
                                                                            wm5Var5.l = (byte) 1;
                                                                            z17 = true;
                                                                        } else if ("application/x-tgsticker".equals(document4.mime_type)) {
                                                                            wm5Var5.l = (byte) 1;
                                                                        } else if ("application/x-tgwallpattern".equals(document4.mime_type)) {
                                                                            wm5Var5.l = (byte) 3;
                                                                        } else if (xb4.B(jn5Var2.i).endsWith(".svg")) {
                                                                            wm5Var5.l = (byte) 3;
                                                                        }
                                                                        j4 = document4.size;
                                                                        file6 = file8;
                                                                    } else {
                                                                        in5Var = in5Var2;
                                                                        i11 = i15;
                                                                        str14 = "gl";
                                                                        str12 = str11;
                                                                        str15 = str6;
                                                                        str17 = str21;
                                                                        if (jn5Var2.v != null) {
                                                                            file6 = new File(xb4.z(3), str13);
                                                                            j4 = 0;
                                                                        } else {
                                                                            i10 = i11;
                                                                            File file10 = i10 == 1 ? new File(xb4.z(4), str13) : new File(xb4.z(0), str13);
                                                                            str21 = str17;
                                                                            if (in5.E(str17)) {
                                                                                str18 = str14;
                                                                            } else {
                                                                                if ("g".equals(str21)) {
                                                                                    str18 = str14;
                                                                                } else {
                                                                                    str18 = str14;
                                                                                }
                                                                                if (jn5Var2.f != null) {
                                                                                }
                                                                                str14 = str18;
                                                                                file6 = file10;
                                                                                j4 = 0;
                                                                                z9 = z17;
                                                                            }
                                                                            File z19 = xb4.z(4);
                                                                            StringBuilder sb3 = new StringBuilder();
                                                                            str14 = str18;
                                                                            sb3.append(jn5Var2.f.volume_id);
                                                                            sb3.append(str15);
                                                                            file10 = new File(z19, uh9.l(sb3, jn5Var2.f.local_id, ".temp"));
                                                                            file6 = file10;
                                                                            j4 = 0;
                                                                            z9 = z17;
                                                                        }
                                                                    }
                                                                    z9 = z17;
                                                                    str21 = str17;
                                                                    i10 = i11;
                                                                } else {
                                                                    file6 = new File(xb4.z(4), str13);
                                                                    if (file6.exists()) {
                                                                        imageReceiver2 = imageReceiver3;
                                                                        i10 = i15;
                                                                        z10 = true;
                                                                    } else {
                                                                        i10 = i15;
                                                                        if (i10 == 2) {
                                                                            imageReceiver2 = imageReceiver3;
                                                                            file6 = new File(xb4.z(4), qd4.o(str13, ".enc"));
                                                                        } else {
                                                                            imageReceiver2 = imageReceiver3;
                                                                        }
                                                                    }
                                                                    TLRPC.Document document5 = jn5Var2.i;
                                                                    if (document5 != null) {
                                                                        if (document5 instanceof kp3) {
                                                                            if (((kp3) document5).b == null) {
                                                                                z17 = true;
                                                                            }
                                                                            wm5Var5.l = (byte) 5;
                                                                        } else if ("application/x-tgsdice".equals(document5.mime_type)) {
                                                                            wm5Var5.l = (byte) 1;
                                                                            in5Var = in5Var2;
                                                                            z9 = true;
                                                                            str14 = "gl";
                                                                            str12 = str11;
                                                                            j4 = 0;
                                                                            str15 = str6;
                                                                        } else if ("application/x-tgsticker".equals(jn5Var2.i.mime_type)) {
                                                                            wm5Var5.l = (byte) 1;
                                                                        } else if ("application/x-tgwallpattern".equals(jn5Var2.i.mime_type)) {
                                                                            wm5Var5.l = (byte) 3;
                                                                        } else if (xb4.B(jn5Var2.i).endsWith(".svg")) {
                                                                            wm5Var5.l = (byte) 3;
                                                                        }
                                                                    }
                                                                    in5Var = in5Var2;
                                                                    str14 = "gl";
                                                                    str12 = str11;
                                                                    j4 = 0;
                                                                    z9 = z17;
                                                                    str15 = str6;
                                                                }
                                                            }
                                                        }
                                                        if (str21 != null) {
                                                            String[] split = str21.split(str15);
                                                            int i17 = 0;
                                                            while (i17 < split.length) {
                                                                if (!"g".equals(split[i17])) {
                                                                    str16 = str14;
                                                                    if (str16.equals(split[i17]) || "pframe".equals(split[i17])) {
                                                                        break;
                                                                    }
                                                                    i17++;
                                                                    str14 = str16;
                                                                } else {
                                                                    str16 = str14;
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        str16 = str14;
                                                    } else {
                                                        boolean z20 = z6;
                                                        in5Var = in5Var2;
                                                        b2 = b5;
                                                        imageReceiver2 = imageReceiver3;
                                                        str12 = str11;
                                                        i10 = i15;
                                                        str13 = str5;
                                                        j3 = 0;
                                                        file5 = file;
                                                        z9 = z20;
                                                        b3 = b;
                                                    }
                                                    wm5Var5.m = b3;
                                                    String str26 = str7;
                                                    wm5Var5.d = str26;
                                                    wm5Var5.n = i10;
                                                    wm5Var5.f = str21;
                                                    wm5Var5.i = jn5Var2;
                                                    String str27 = str12;
                                                    wm5Var5.g = str27;
                                                    wm5Var5.o = i14;
                                                    Object obj4 = obj2;
                                                    wm5Var5.j = obj4;
                                                    b4 = jn5Var2.p;
                                                    if (b4 != 0) {
                                                        wm5Var5.l = b4;
                                                    }
                                                    if (i10 == 2) {
                                                        Pattern pattern = xb4.J;
                                                        wm5Var5.r = new File(a.b.getCacheDir(), qd4.o(str13, ".enc.key"));
                                                    }
                                                    int i18 = i10;
                                                    ImageReceiver imageReceiver4 = imageReceiver2;
                                                    wm5Var5.a(imageReceiver4, str26, str21, b3, i8);
                                                    if (!z9 || z8 || file5.exists()) {
                                                        in5 in5Var3 = in5Var;
                                                        wm5Var5.p = file5;
                                                        wm5Var5.i = jn5Var2;
                                                        wm5Var5.u = new xm5(in5Var3, wm5Var5);
                                                        in5Var3.i.put(str26, wm5Var5);
                                                        in5Var3.j.add(in5.j(str26));
                                                        if (b2 != 0) {
                                                            in5Var3.q.c(wm5Var5.u);
                                                            return;
                                                        }
                                                        sw2 sw2Var = in5Var3.p;
                                                        xm5 xm5Var = wm5Var5.u;
                                                        boolean z21 = wm5Var5.a;
                                                        if (!z21) {
                                                            sw2Var.getClass();
                                                            xm5Var = new xo3(z21 ? 1 : 0, xm5Var);
                                                        }
                                                        ((wo3) sw2Var.b).execute(xm5Var);
                                                        wm5Var5.b = xm5Var;
                                                        return;
                                                    }
                                                    wm5Var5.e = str13;
                                                    in5 in5Var4 = in5Var;
                                                    in5Var4.g.put(str13, wm5Var5);
                                                    if (wm5Var5.c) {
                                                        in5Var4.h.put(str13, wm5Var5);
                                                    }
                                                    String str28 = jn5Var2.g;
                                                    if (str28 != null) {
                                                        wm5Var5.q = new File(xb4.z(4), qd4.o(Utilities.a(str28), "_temp.jpg"));
                                                        wm5Var5.p = file5;
                                                        if (jn5Var2.g.startsWith(str9)) {
                                                            vm5 vm5Var = new vm5(in5Var4, wm5Var5);
                                                            wm5Var5.s = vm5Var;
                                                            in5Var4.o.add(vm5Var);
                                                            in5Var4.P(false);
                                                            return;
                                                        }
                                                        dn5 dn5Var = new dn5(in5Var4, wm5Var5, j2);
                                                        wm5Var5.t = dn5Var;
                                                        in5Var4.n.add(dn5Var);
                                                        in5Var4.Q(false);
                                                        return;
                                                    }
                                                    long j6 = j2;
                                                    byte b8 = b2 != 0 ? (byte) 3 : imageReceiver4.w;
                                                    if (jn5Var2.f != null) {
                                                        xb4.G(i14).V(jn5Var2, obj4, str27, b8, (i18 != 0 || (j6 > j3 && jn5Var2.c == null)) ? i18 : 1);
                                                    } else {
                                                        byte b9 = b8;
                                                        if (jn5Var2.i != null) {
                                                            xb4.G(i14).X(jn5Var2.i, obj4, b9, i18);
                                                        } else if (jn5Var2.h != null) {
                                                            xb4 G = xb4.G(i14);
                                                            oy9 oy9Var2 = jn5Var2.h;
                                                            if (oy9Var2 != null) {
                                                                G.W(null, oy9Var2, null, null, null, null, null, 0L, b9, 1);
                                                            }
                                                        } else if (jn5Var2.v != null) {
                                                            xb4.G(i14).W(null, null, jn5Var2.v, null, null, null, null, 0L, b9, i18);
                                                        }
                                                    }
                                                    if (imageReceiver4.r) {
                                                        in5Var4.w.put(wm5Var5.d, 0);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            }
                                            wm5Var5.l = b7;
                                            if (file == null) {
                                            }
                                            wm5Var5.m = b3;
                                            String str262 = str7;
                                            wm5Var5.d = str262;
                                            wm5Var5.n = i10;
                                            wm5Var5.f = str21;
                                            wm5Var5.i = jn5Var2;
                                            String str272 = str12;
                                            wm5Var5.g = str272;
                                            wm5Var5.o = i14;
                                            Object obj42 = obj2;
                                            wm5Var5.j = obj42;
                                            b4 = jn5Var2.p;
                                            if (b4 != 0) {
                                            }
                                            if (i10 == 2) {
                                            }
                                            int i182 = i10;
                                            ImageReceiver imageReceiver42 = imageReceiver2;
                                            wm5Var5.a(imageReceiver42, str262, str21, b3, i8);
                                            if (z9) {
                                            }
                                            in5 in5Var32 = in5Var;
                                            wm5Var5.p = file5;
                                            wm5Var5.i = jn5Var2;
                                            wm5Var5.u = new xm5(in5Var32, wm5Var5);
                                            in5Var32.i.put(str262, wm5Var5);
                                            in5Var32.j.add(in5.j(str262));
                                            if (b2 != 0) {
                                            }
                                        }
                                        str11 = str8;
                                        if (file == null) {
                                        }
                                        wm5Var5.m = b3;
                                        String str2622 = str7;
                                        wm5Var5.d = str2622;
                                        wm5Var5.n = i10;
                                        wm5Var5.f = str21;
                                        wm5Var5.i = jn5Var2;
                                        String str2722 = str12;
                                        wm5Var5.g = str2722;
                                        wm5Var5.o = i14;
                                        Object obj422 = obj2;
                                        wm5Var5.j = obj422;
                                        b4 = jn5Var2.p;
                                        if (b4 != 0) {
                                        }
                                        if (i10 == 2) {
                                        }
                                        int i1822 = i10;
                                        ImageReceiver imageReceiver422 = imageReceiver2;
                                        wm5Var5.a(imageReceiver422, str2622, str21, b3, i8);
                                        if (z9) {
                                        }
                                        in5 in5Var322 = in5Var;
                                        wm5Var5.p = file5;
                                        wm5Var5.i = jn5Var2;
                                        wm5Var5.u = new xm5(in5Var322, wm5Var5);
                                        in5Var322.i.put(str2622, wm5Var5);
                                        in5Var322.j.add(in5.j(str2622));
                                        if (b2 != 0) {
                                        }
                                    }
                                }
                                file4 = null;
                                if (file4 == null) {
                                }
                                if (file3 == null) {
                                }
                            }
                        } else {
                            str5 = str19;
                            str6 = "_";
                            str7 = str20;
                            b = b6;
                            str8 = str22;
                            obj2 = obj3;
                        }
                        z8 = false;
                        file3 = null;
                        if (!TextUtils.isEmpty(str10)) {
                        }
                        file4 = null;
                        if (file4 == null) {
                        }
                        if (file3 == null) {
                        }
                    } else {
                        str5 = str19;
                        str6 = "_";
                        str7 = str20;
                        b = b6;
                        str8 = str22;
                        obj2 = obj3;
                        file = null;
                        z6 = true;
                    }
                } else {
                    str5 = str19;
                    str6 = "_";
                    str7 = str20;
                    b = b6;
                    i8 = i13;
                    str8 = str22;
                    obj2 = obj3;
                    str9 = "athumb";
                    file = null;
                    z6 = false;
                }
                z8 = false;
                if (b5 != 2) {
                }
            }
        };
        this.s.d(runnable, imageReceiver.w == 0 ? 0L : 1L);
        imageReceiver.x1.add(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x0153, code lost:
    
        if (r2.canWrite() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x014d, code lost:
    
        if (r2.mkdirs() != false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03c3 A[Catch: Exception -> 0x03d6, TRY_LEAVE, TryCatch #3 {Exception -> 0x03d6, blocks: (B:97:0x03a6, B:99:0x03b4, B:101:0x03ba, B:103:0x03c3), top: B:96:0x03a6, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0187 A[Catch: Exception -> 0x03f1, TryCatch #6 {Exception -> 0x03f1, blocks: (B:8:0x0047, B:10:0x0053, B:12:0x0061, B:16:0x006e, B:18:0x009c, B:21:0x009f, B:23:0x00ab, B:26:0x00b4, B:28:0x00b7, B:30:0x00bb, B:32:0x00d7, B:36:0x00da, B:198:0x011a, B:44:0x017c, B:46:0x0187, B:49:0x0190, B:51:0x0193, B:53:0x0197, B:55:0x019c, B:56:0x01a1, B:58:0x01a6, B:62:0x01ab, B:63:0x01b0, B:65:0x01b6, B:66:0x01bd, B:68:0x01c4, B:70:0x01cc, B:72:0x01d4, B:75:0x01e0, B:77:0x01eb, B:81:0x01ee, B:168:0x0367, B:170:0x0326, B:172:0x02e5, B:174:0x02a4, B:176:0x0264, B:85:0x036c, B:106:0x03d7, B:108:0x03a3, B:109:0x03e4, B:178:0x0230, B:201:0x0117, B:39:0x0128, B:41:0x0130, B:43:0x0174, B:179:0x013c, B:181:0x0142, B:184:0x014f, B:186:0x0155, B:187:0x0149, B:208:0x03db, B:210:0x03df, B:114:0x01ff, B:116:0x020f, B:118:0x0215, B:120:0x021c, B:97:0x03a6, B:99:0x03b4, B:101:0x03ba, B:103:0x03c3, B:159:0x0329, B:161:0x033b, B:163:0x0342, B:165:0x0351, B:150:0x02e8, B:152:0x02fa, B:154:0x0301, B:156:0x0310, B:141:0x02a7, B:143:0x02b9, B:145:0x02c0, B:147:0x02cf, B:132:0x0267, B:134:0x0279, B:136:0x027f, B:138:0x028e, B:123:0x0233, B:125:0x0243, B:127:0x0249, B:129:0x0250, B:88:0x0372, B:90:0x0380, B:92:0x0386, B:94:0x038f), top: B:7:0x0047, inners: #0, #3, #7, #8, #9, #10, #11, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x038f A[Catch: Exception -> 0x03a2, TRY_LEAVE, TryCatch #12 {Exception -> 0x03a2, blocks: (B:88:0x0372, B:90:0x0380, B:92:0x0386, B:94:0x038f), top: B:87:0x0372, outer: #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SparseArray h() {
        File file;
        File file2;
        File file3;
        File file4;
        File[] externalFilesDirs;
        SparseArray sparseArray = new SparseArray();
        File D0 = hl.D0();
        if (!D0.isDirectory()) {
            try {
                D0.mkdirs();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        hl.G(new File(D0, ".nomedia"));
        sparseArray.put(4, D0);
        if (f11.a) {
            cc4.b("cache path = " + D0);
        }
        uh9.s(xea.e0, new StringBuilder("selected SD card = "));
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                ArrayList arrayList = null;
                if (!TextUtils.isEmpty(xea.e0)) {
                    ArrayList c1 = hl.c1();
                    int size = c1.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        File file5 = (File) c1.get(i);
                        cc4.b("root dir " + i + " " + file5);
                        if (file5.getAbsolutePath().startsWith(xea.e0)) {
                            externalStorageDirectory = file5;
                            break;
                        }
                        i++;
                    }
                    if (!externalStorageDirectory.getAbsolutePath().startsWith(xea.e0) && (externalFilesDirs = a.b.getExternalFilesDirs(null)) != null) {
                        for (int i2 = 0; i2 < externalFilesDirs.length; i2++) {
                            if (externalFilesDirs[i2] != null) {
                                cc4.b("dirsDebug " + i2 + " " + externalFilesDirs[i2]);
                            }
                        }
                    }
                }
                cc4.b("external storage = " + externalStorageDirectory);
                if (Build.VERSION.SDK_INT >= 30) {
                    try {
                        if (a.b.getExternalMediaDirs().length > 0) {
                            File A = A();
                            try {
                                file = new File(A, "Telegram");
                            } catch (Exception e2) {
                                file = A;
                                e = e2;
                            }
                            try {
                                file.mkdirs();
                            } catch (Exception e3) {
                                e = e3;
                                cc4.g(e, true);
                                file2 = new File(a.b.getExternalFilesDir(null), "Telegram");
                                this.H = file2;
                                file2.mkdirs();
                                if (!this.H.isDirectory()) {
                                }
                                if (this.H.isDirectory()) {
                                }
                                if (file != null) {
                                    try {
                                        file4 = new File(file, "Telegram Images");
                                        file4.mkdir();
                                        if (file4.isDirectory()) {
                                            sparseArray.put(100, file4);
                                            if (f11.a) {
                                            }
                                        }
                                    } catch (Exception e4) {
                                        cc4.g(e4, true);
                                    }
                                    try {
                                        file3 = new File(file, "Telegram Video");
                                        file3.mkdir();
                                        if (file3.isDirectory()) {
                                            sparseArray.put(101, file3);
                                            if (f11.a) {
                                            }
                                        }
                                    } catch (Exception e5) {
                                        cc4.g(e5, true);
                                    }
                                }
                                Utilities.e.c(new pg6((byte) 26));
                                return sparseArray;
                            }
                        } else {
                            file = null;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        file = null;
                    }
                    file2 = new File(a.b.getExternalFilesDir(null), "Telegram");
                    this.H = file2;
                } else {
                    if (TextUtils.isEmpty(xea.e0) || !externalStorageDirectory.getAbsolutePath().startsWith(xea.e0)) {
                        if (externalStorageDirectory.exists()) {
                            if (externalStorageDirectory.isDirectory()) {
                            }
                            cc4.b("can't write to this directory = " + externalStorageDirectory + " use files dir");
                            externalStorageDirectory = a.b.getExternalFilesDir(null);
                        }
                    }
                    file2 = new File(externalStorageDirectory, "Telegram");
                    this.H = file2;
                    file = null;
                }
                file2.mkdirs();
                if (!this.H.isDirectory()) {
                    File[] externalFilesDirs2 = a.b.getExternalFilesDirs(null);
                    if (externalFilesDirs2 != null) {
                        for (int i3 = 0; i3 < externalFilesDirs2.length; i3++) {
                            File file6 = externalFilesDirs2[i3];
                            if (file6 != null) {
                                file6.getAbsolutePath();
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(externalFilesDirs2[i3]);
                            }
                        }
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    if (arrayList.isEmpty()) {
                        arrayList.add(Environment.getExternalStorageDirectory());
                    }
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            break;
                        }
                        File file7 = (File) arrayList.get(i4);
                        if (file7 != null && !TextUtils.isEmpty(xea.e0) && file7.getAbsolutePath().startsWith(xea.e0)) {
                            File file8 = new File(file7, "Telegram");
                            this.H = file8;
                            file8.mkdirs();
                            break;
                        }
                        i4++;
                    }
                }
                if (this.H.isDirectory()) {
                    try {
                        File file9 = new File(this.H, "Telegram Images");
                        file9.mkdir();
                        if (file9.isDirectory() && b(D0, file9, 0)) {
                            sparseArray.put(0, file9);
                            if (f11.a) {
                                cc4.b("image path = " + file9);
                            }
                        }
                    } catch (Exception e7) {
                        cc4.g(e7, true);
                    }
                    try {
                        File file10 = new File(this.H, "Telegram Video");
                        file10.mkdir();
                        if (file10.isDirectory() && b(D0, file10, 2)) {
                            sparseArray.put(2, file10);
                            if (f11.a) {
                                cc4.b("video path = " + file10);
                            }
                        }
                    } catch (Exception e8) {
                        cc4.g(e8, true);
                    }
                    try {
                        File file11 = new File(this.H, "Telegram Audio");
                        file11.mkdir();
                        if (file11.isDirectory() && b(D0, file11, 1)) {
                            hl.G(new File(file11, ".nomedia"));
                            sparseArray.put(1, file11);
                            if (f11.a) {
                                cc4.b("audio path = " + file11);
                            }
                        }
                    } catch (Exception e9) {
                        cc4.g(e9, true);
                    }
                    try {
                        File file12 = new File(this.H, "Telegram Documents");
                        file12.mkdir();
                        if (file12.isDirectory() && b(D0, file12, 3)) {
                            hl.G(new File(file12, ".nomedia"));
                            sparseArray.put(3, file12);
                            if (f11.a) {
                                cc4.b("documents path = " + file12);
                            }
                        }
                    } catch (Exception e10) {
                        cc4.g(e10, true);
                    }
                    try {
                        File file13 = new File(this.H, "Telegram Files");
                        file13.mkdir();
                        if (file13.isDirectory() && b(D0, file13, 5)) {
                            hl.G(new File(file13, ".nomedia"));
                            sparseArray.put(5, file13);
                            if (f11.a) {
                                cc4.b("files path = " + file13);
                            }
                        }
                    } catch (Exception e11) {
                        cc4.g(e11, true);
                    }
                    try {
                        File file14 = new File(this.H, "Telegram Stories");
                        file14.mkdir();
                        if (file14.isDirectory() && b(D0, file14, 6)) {
                            hl.G(new File(file14, ".nomedia"));
                            sparseArray.put(6, file14);
                            if (f11.a) {
                                cc4.b("stories path = " + file14);
                            }
                        }
                    } catch (Exception e12) {
                        cc4.g(e12, true);
                    }
                }
                if (file != null && file.isDirectory()) {
                    file4 = new File(file, "Telegram Images");
                    file4.mkdir();
                    if (file4.isDirectory() && b(D0, file4, 0)) {
                        sparseArray.put(100, file4);
                        if (f11.a) {
                            cc4.b("image path = " + file4);
                        }
                    }
                    file3 = new File(file, "Telegram Video");
                    file3.mkdir();
                    if (file3.isDirectory() && b(D0, file3, 2)) {
                        sparseArray.put(101, file3);
                        if (f11.a) {
                            cc4.b("video path = " + file3);
                        }
                    }
                }
            } else if (f11.a) {
                cc4.b("this Android can't rename files");
            }
            Utilities.e.c(new pg6((byte) 26));
        } catch (Exception e13) {
            cc4.g(e13, true);
        }
        return sparseArray;
    }

    public final boolean l(String str) {
        HashMap hashMap = this.a;
        Integer num = (Integer) hashMap.get(str);
        if (num == null) {
            return true;
        }
        if (num.intValue() == 1) {
            hashMap.remove(str);
            return true;
        }
        hashMap.put(str, Integer.valueOf(num.intValue() - 1));
        return false;
    }

    public final void r(int i, File file, gn5 gn5Var) {
        if ((i == 0 || i == 2 || i == 3) && file != null) {
            if (((hn5) this.v.get(xb4.r(null, gn5Var.a))) == null) {
                this.r.c(new hn5(this, i, file, gn5Var));
            }
        }
    }

    public final Float s(String str) {
        long[] jArr;
        if (str == null || (jArr = (long[]) this.u.get(str)) == null) {
            return null;
        }
        long j = jArr[1];
        return j == 0 ? Float.valueOf(0.0f) : Float.valueOf(Math.min(1.0f, jArr[0] / j));
    }

    public final long[] t(String str) {
        if (str == null) {
            return null;
        }
        return (long[]) this.u.get(str);
    }

    public final BitmapDrawable u(String str) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) this.e.f(str);
        if (!(bitmapDrawable instanceof lm)) {
            return bitmapDrawable;
        }
        lm lmVar = (lm) bitmapDrawable;
        if (!lmVar.d0 && lmVar.H0 < 15) {
            return bitmapDrawable;
        }
        this.e.n(str);
        return null;
    }

    public final BitmapDrawable v(String str) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) this.c.f(str);
        if (bitmapDrawable == null) {
            bitmapDrawable = (BitmapDrawable) this.b.f(str);
        }
        if (bitmapDrawable == null) {
            bitmapDrawable = (BitmapDrawable) this.d.f(str);
        }
        return bitmapDrawable == null ? u(str) : bitmapDrawable;
    }

    public final BitmapDrawable y(TLObject tLObject) {
        String str = null;
        if (tLObject == null) {
            return null;
        }
        if (tLObject instanceof TLRPC.FileLocation) {
            TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) tLObject;
            str = fileLocation.volume_id + "_" + fileLocation.local_id;
        } else if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            str = document.dc_id + "_" + document.id;
        } else if (tLObject instanceof oy9) {
            TLRPC.TL_secureFile tL_secureFile = ((oy9) tLObject).b;
            str = tL_secureFile.dc_id + "_" + tL_secureFile.id;
        } else if (tLObject instanceof jxc) {
            str = Utilities.a(((jxc) tLObject).a);
        }
        return v(str + "@50_50");
    }
}
