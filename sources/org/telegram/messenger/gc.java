package org.telegram.messenger;

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
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ah0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class gc {
    public static Bitmap M;
    public final ConcurrentHashMap A;
    public final LinkedList B;
    public final HashMap C;
    public final HashMap D;
    public int E;
    public String F;
    public int G;
    public File H;
    public final kb b;
    public final kb c;
    public final kb d;
    public final kb e;
    public final com.google.android.gms.internal.cast.b0 p;
    public final p5 q;
    public final p5 r;
    public final p5 s;
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
    public static volatile gc N = null;
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

    public gc() {
        com.google.android.gms.internal.cast.b0 b0Var = new com.google.android.gms.internal.cast.b0(2);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b0Var.b = new of.a(b0Var, new PriorityBlockingQueue(10, new c5.b(4)));
        this.p = b0Var;
        this.q = new p5("cacheThumbOutQueue");
        p5 p5Var = new p5("thumbGeneratingQueue");
        this.r = p5Var;
        this.s = new p5("imageLoadQueue");
        this.t = new HashMap();
        this.u = new ConcurrentHashMap();
        this.v = new HashMap();
        this.w = new HashMap();
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
        p5Var.setPriority(1);
        int memoryClass = ((ActivityManager) t0.b.getSystemService("activity")).getMemoryClass();
        boolean z9 = memoryClass >= 192;
        this.z = z9;
        int min = Math.min(z9 ? 30 : 15, memoryClass / 7) * TLObject.FLAG_20;
        float f10 = min;
        this.c = new kb(this, (int) (0.8f * f10), 0);
        this.b = new kb(this, (int) (f10 * 0.2f), 1);
        this.d = new kb(this, min / 4, 2);
        this.e = new kb(this);
        SparseArray sparseArray = new SparseArray();
        File E0 = g0.E0();
        if (!E0.isDirectory()) {
            try {
                E0.mkdirs();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        g0.G(new File(E0, ".nomedia"));
        sparseArray.put(4, E0);
        for (int i7 = 0; i7 < 4; i7++) {
            w7.G(i7).E = new qb(this, i7);
        }
        w7.K = sparseArray;
        androidx.mediarouter.app.f fVar = new androidx.mediarouter.app.f(this, 6);
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
                t0.b.registerReceiver(fVar, intentFilter, 4);
            } else {
                t0.b.registerReceiver(fVar, intentFilter);
            }
        } catch (Throwable unused) {
        }
        i(null);
    }

    public static File A(String str) {
        String B = B(str, "jpg");
        return new File(w7.z(4), Utilities.a(str) + "." + B);
    }

    public static String B(String str, String str2) {
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.length() > 1) {
            str = lastPathSegment;
        }
        int lastIndexOf = str.lastIndexOf(46);
        String substring = lastIndexOf != -1 ? str.substring(lastIndexOf + 1) : null;
        return (substring == null || substring.length() == 0 || substring.length() > 4) ? str2 : substring;
    }

    public static gc D() {
        gc gcVar;
        gc gcVar2 = N;
        if (gcVar2 != null) {
            return gcVar2;
        }
        synchronized (gc.class) {
            try {
                gcVar = N;
                if (gcVar == null) {
                    gcVar = new gc();
                    N = gcVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gcVar;
    }

    public static File E() {
        File file = t0.b.getExternalMediaDirs()[0];
        if (!TextUtils.isEmpty(iz.h0)) {
            for (int i7 = 0; i7 < t0.b.getExternalMediaDirs().length; i7++) {
                File file2 = t0.b.getExternalMediaDirs()[i7];
                if (file2 != null && file2.getPath().startsWith(iz.h0)) {
                    file = t0.b.getExternalMediaDirs()[i7];
                }
            }
        }
        return file;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0074 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:6:0x0009, B:8:0x001b, B:12:0x0025, B:13:0x002a, B:15:0x0053, B:18:0x005e, B:22:0x0067, B:23:0x006c, B:25:0x0074, B:29:0x007b, B:30:0x00dc, B:32:0x00e2, B:34:0x00ea, B:36:0x006a), top: B:5:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap F(String str, byte[] bArr) {
        Bitmap.Config config;
        Bitmap decodeByteArray;
        if (bArr == null || bArr.length < 3) {
            return G();
        }
        try {
            int length = bArr.length;
            byte[] bArr2 = as.c;
            byte[] bArr3 = as.d;
            int i7 = length + 622;
            ThreadLocal threadLocal = I;
            byte[] bArr4 = (byte[]) threadLocal.get();
            if (bArr4 == null || bArr4.length < i7) {
                bArr4 = null;
            }
            if (bArr4 == null) {
                bArr4 = new byte[i7];
                threadLocal.set(bArr4);
            }
            System.arraycopy(bArr2, 0, bArr4, 0, 623);
            System.arraycopy(bArr, 3, bArr4, 623, bArr.length - 3);
            System.arraycopy(bArr3, 0, bArr4, bArr.length + 620, 2);
            bArr4[164] = bArr[1];
            bArr4[166] = bArr[2];
            BitmapFactory.Options options = new BitmapFactory.Options();
            boolean z9 = !TextUtils.isEmpty(str) && str.contains("r");
            if (!iz.j() && !z9) {
                config = Bitmap.Config.RGB_565;
                options.inPreferredConfig = config;
                decodeByteArray = BitmapFactory.decodeByteArray(bArr4, 0, i7, options);
                if (decodeByteArray != null) {
                    return G();
                }
                if (z9) {
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
            }
            config = Bitmap.Config.ARGB_8888;
            options.inPreferredConfig = config;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr4, 0, i7, options);
            if (decodeByteArray != null) {
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            return G();
        }
    }

    public static synchronized Bitmap G() {
        Bitmap bitmap;
        synchronized (gc.class) {
            try {
                Bitmap bitmap2 = M;
                if (bitmap2 != null) {
                    if (bitmap2.isRecycled()) {
                    }
                    bitmap = M;
                }
                Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                M = createBitmap;
                createBitmap.eraseColor(-16777216);
                bitmap = M;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bitmap;
    }

    public static boolean I(String str) {
        return str != null && str.endsWith("avatar");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:0|1|(27:6|(1:8)(2:157|(2:161|162))|9|10|(1:12)(1:(24:150|151|152|14|(1:16)(1:148)|17|(1:19)|20|(3:22|(2:23|(1:25)(1:26))|27)|28|29|(4:33|34|36|37)|45|(7:47|(1:49)|50|51|(2:(1:54)|55)|56|(5:94|95|(3:99|100|(3:102|103|104))|97|98)(1:(7:59|60|(3:71|72|(5:74|75|63|64|66))|62|63|64|66)(1:93)))|128|130|131|(5:133|(1:135)(1:141)|136|(1:138)(1:140)|139)|142|(1:144)|51|(0)|56|(0)(0)))|13|14|(0)(0)|17|(0)|20|(0)|28|29|(5:31|33|34|36|37)|45|(0)|128|130|131|(0)|142|(0)|51|(0)|56|(0)(0))|166|10|(0)(0)|13|14|(0)(0)|17|(0)|20|(0)|28|29|(0)|45|(0)|128|130|131|(0)|142|(0)|51|(0)|56|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
    
        if (r10 == null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00f5 A[Catch: all -> 0x0129, TryCatch #5 {all -> 0x0129, blocks: (B:131:0x00eb, B:133:0x00f5, B:136:0x0104, B:139:0x0110, B:142:0x0113, B:144:0x011d), top: B:130:0x00eb }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x011d A[Catch: all -> 0x0129, TRY_LEAVE, TryCatch #5 {all -> 0x0129, blocks: (B:131:0x00eb, B:133:0x00f5, B:136:0x0104, B:139:0x0110, B:142:0x0113, B:144:0x011d), top: B:130:0x00eb }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad A[Catch: all -> 0x00e4, TRY_LEAVE, TryCatch #2 {all -> 0x00e4, blocks: (B:29:0x009f, B:31:0x00ad, B:39:0x00c7, B:45:0x00cf, B:47:0x00d9, B:128:0x00e6), top: B:28:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9 A[Catch: all -> 0x00e4, TryCatch #2 {all -> 0x00e4, blocks: (B:29:0x009f, B:31:0x00ad, B:39:0x00c7, B:45:0x00cf, B:47:0x00d9, B:128:0x00e6), top: B:28:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0140 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap K(String str, Uri uri, float f10, float f11, boolean z9) {
        String str2;
        InputStream openInputStream;
        float max;
        int i7;
        Matrix matrix;
        float f12;
        Bitmap bitmap;
        Bitmap decodeStream;
        Bitmap createBitmap;
        Pair N0;
        InputStream inputStream;
        String T0;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (str == null && uri != null && uri.getScheme() != null) {
            if (uri.getScheme().contains("file")) {
                T0 = uri.getPath();
            } else if (Build.VERSION.SDK_INT < 30 || !"content".equals(uri.getScheme())) {
                try {
                    T0 = g0.T0(uri);
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
            str2 = T0;
            Bitmap bitmap2 = null;
            if (str2 == null) {
                BitmapFactory.decodeFile(str2, options);
            } else if (uri != null) {
                try {
                    InputStream openInputStream2 = t0.b.getContentResolver().openInputStream(uri);
                    BitmapFactory.decodeStream(openInputStream2, null, options);
                    openInputStream2.close();
                    openInputStream = t0.b.getContentResolver().openInputStream(uri);
                    float f13 = options.outWidth / f10;
                    float f14 = options.outHeight / f11;
                    max = z9 ? Math.max(f13, f14) : Math.min(f13, f14);
                    if (max < 1.0f) {
                        max = 1.0f;
                    }
                    options.inJustDecodeBounds = false;
                    i7 = (int) max;
                    options.inSampleSize = i7;
                    if (i7 % 2 != 0) {
                        int i10 = 1;
                        while (true) {
                            int i11 = i10 * 2;
                            if (i11 >= options.inSampleSize) {
                                break;
                            }
                            i10 = i11;
                        }
                        options.inSampleSize = i10;
                    }
                    N0 = g0.N0(str2);
                    if (((Integer) N0.first).intValue() == 0 && ((Integer) N0.second).intValue() == 0) {
                        try {
                            inputStream = t0.b.getContentResolver().openInputStream(uri);
                        } catch (Throwable unused) {
                            inputStream = null;
                        }
                        try {
                            N0 = g0.M0(inputStream);
                        } catch (Throwable unused2) {
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (((Integer) N0.first).intValue() == 0) {
                            }
                            matrix = new Matrix();
                            if (((Integer) N0.second).intValue() != 0) {
                            }
                            if (((Integer) N0.first).intValue() != 0) {
                            }
                            f12 = max / options.inSampleSize;
                            if (f12 > 1.0f) {
                            }
                            Matrix matrix2 = matrix;
                            if (str2 != null) {
                            }
                        }
                    }
                    if (((Integer) N0.first).intValue() == 0) {
                        if (((Integer) N0.second).intValue() == 0) {
                        }
                        matrix = null;
                        f12 = max / options.inSampleSize;
                        if (f12 > 1.0f) {
                            if (matrix == null) {
                                matrix = new Matrix();
                            }
                            float f15 = 1.0f / f12;
                            matrix.postScale(f15, f15);
                        }
                        Matrix matrix22 = matrix;
                        if (str2 != null) {
                            try {
                                bitmap = BitmapFactory.decodeFile(str2, options);
                                if (bitmap != null) {
                                    try {
                                        Bitmap createBitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix22, true);
                                        if (createBitmap2 != bitmap) {
                                            bitmap.recycle();
                                            return createBitmap2;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        bitmap2 = bitmap;
                                        a8.g(th, true);
                                        D().j();
                                        if (bitmap2 == null) {
                                            try {
                                                bitmap2 = BitmapFactory.decodeFile(str2, options);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                a8.g(th, true);
                                                return bitmap2;
                                            }
                                        }
                                        bitmap = bitmap2;
                                        if (bitmap != null) {
                                            try {
                                                Bitmap createBitmap3 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix22, true);
                                                if (createBitmap3 != bitmap) {
                                                    bitmap.recycle();
                                                    bitmap = createBitmap3;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                bitmap2 = bitmap;
                                                a8.g(th, true);
                                                return bitmap2;
                                            }
                                        }
                                        return bitmap;
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                            return bitmap;
                        }
                        if (uri == null) {
                            return null;
                        }
                        try {
                            decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                        } catch (Throwable th7) {
                            th = th7;
                        }
                        try {
                            if (decodeStream != null) {
                                try {
                                    createBitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix22, true);
                                } catch (Throwable th8) {
                                    th = th8;
                                    bitmap2 = decodeStream;
                                    try {
                                        a8.g(th, true);
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
                        } catch (Throwable th9) {
                            a8.g(th9, true);
                            return bitmap2;
                        }
                        bitmap2 = decodeStream;
                    }
                    matrix = new Matrix();
                    if (((Integer) N0.second).intValue() != 0) {
                        float f16 = -1.0f;
                        float f17 = ((Integer) N0.second).intValue() == 1 ? -1.0f : 1.0f;
                        if (((Integer) N0.second).intValue() != 2) {
                            f16 = 1.0f;
                        }
                        matrix.postScale(f17, f16);
                    }
                    if (((Integer) N0.first).intValue() != 0) {
                        matrix.postRotate(((Integer) N0.first).intValue());
                    }
                    f12 = max / options.inSampleSize;
                    if (f12 > 1.0f) {
                    }
                    Matrix matrix222 = matrix;
                    if (str2 != null) {
                    }
                } catch (Throwable th10) {
                    a8.g(th10, true);
                    return null;
                }
            }
            openInputStream = null;
            float f132 = options.outWidth / f10;
            float f142 = options.outHeight / f11;
            if (z9) {
            }
            if (max < 1.0f) {
            }
            options.inJustDecodeBounds = false;
            i7 = (int) max;
            options.inSampleSize = i7;
            if (i7 % 2 != 0) {
            }
            N0 = g0.N0(str2);
            if (((Integer) N0.first).intValue() == 0) {
                inputStream = t0.b.getContentResolver().openInputStream(uri);
                N0 = g0.M0(inputStream);
            }
            if (((Integer) N0.first).intValue() == 0) {
            }
            matrix = new Matrix();
            if (((Integer) N0.second).intValue() != 0) {
            }
            if (((Integer) N0.first).intValue() != 0) {
            }
            f12 = max / options.inSampleSize;
            if (f12 > 1.0f) {
            }
            Matrix matrix2222 = matrix;
            if (str2 != null) {
            }
        }
        str2 = str;
        Bitmap bitmap22 = null;
        if (str2 == null) {
        }
        openInputStream = null;
        float f1322 = options.outWidth / f10;
        float f1422 = options.outHeight / f11;
        if (z9) {
        }
        if (max < 1.0f) {
        }
        options.inJustDecodeBounds = false;
        i7 = (int) max;
        options.inSampleSize = i7;
        if (i7 % 2 != 0) {
        }
        N0 = g0.N0(str2);
        if (((Integer) N0.first).intValue() == 0) {
        }
        if (((Integer) N0.first).intValue() == 0) {
        }
        matrix = new Matrix();
        if (((Integer) N0.second).intValue() != 0) {
        }
        if (((Integer) N0.first).intValue() != 0) {
        }
        f12 = max / options.inSampleSize;
        if (f12 > 1.0f) {
        }
        Matrix matrix22222 = matrix;
        if (str2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void W(TLRPC.Message message) {
        byte[] bArr;
        boolean z9;
        TLRPC.PhotoSize tL_photoSize_layer127;
        TLRPC.MessageMedia messageMedia;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        byte[] bArr2;
        TLRPC.FileLocation fileLocation;
        File J2;
        int i7;
        TLRPC.PhotoSize tL_photoSize_layer1272;
        TLRPC.MessageMedia messageMedia3 = message.media;
        if (messageMedia3 == null) {
            return;
        }
        long j3 = -2147483648L;
        int i10 = 50;
        int i11 = 0;
        if (!(messageMedia3 instanceof TLRPC.TL_messageMediaPaidMedia)) {
            TLRPC.PhotoSize t6 = t(message);
            if (t6 == null || (bArr = t6.bytes) == null || bArr.length == 0) {
                return;
            }
            TLRPC.FileLocation fileLocation2 = t6.location;
            if (fileLocation2 == null || (fileLocation2 instanceof TLRPC.TL_fileLocationUnavailable)) {
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
                t6.location = tL_fileLocationToBeDeprecated;
                tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
                tL_fileLocationToBeDeprecated.local_id = iz.p();
            }
            if (t6.h > 50 || t6.w > 50) {
                w7.G(p10.s0);
                File J3 = w7.J(t6, null, true, true);
                if (ij.R5(message)) {
                    J3 = new File(J3.getAbsolutePath() + ".enc");
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (J3.exists()) {
                    i10 = 0;
                } else {
                    try {
                        if (z9) {
                            try {
                                RandomAccessFile randomAccessFile = new RandomAccessFile(new File(t0.b.getCacheDir(), J3.getName() + ".key"), "rws");
                                long length = randomAccessFile.length();
                                byte[] bArr3 = new byte[32];
                                byte[] bArr4 = new byte[16];
                                if (length > 0) {
                                    if (length % 48 == 0) {
                                        i10 = 0;
                                        randomAccessFile.read(bArr3, 0, 32);
                                        randomAccessFile.read(bArr4, 0, 16);
                                        randomAccessFile.close();
                                        Utilities.aesCtrDecryptionByteArray(t6.bytes, bArr3, bArr4, 0, r4.length, 0);
                                    }
                                }
                                i10 = 0;
                                SecureRandom secureRandom = Utilities.b;
                                secureRandom.nextBytes(bArr3);
                                secureRandom.nextBytes(bArr4);
                                randomAccessFile.write(bArr3);
                                randomAccessFile.write(bArr4);
                                randomAccessFile.close();
                                Utilities.aesCtrDecryptionByteArray(t6.bytes, bArr3, bArr4, 0, r4.length, 0);
                            } catch (Exception e10) {
                                e = e10;
                                i10 = 0;
                                a8.g(e, true);
                                tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
                                tL_photoSize_layer127.w = t6.w;
                                tL_photoSize_layer127.h = t6.h;
                                tL_photoSize_layer127.location = t6.location;
                                tL_photoSize_layer127.size = t6.size;
                                tL_photoSize_layer127.type = t6.type;
                                messageMedia = message.media;
                                if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto)) {
                                }
                            }
                        } else {
                            i10 = 0;
                        }
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(J3, "rws");
                        randomAccessFile2.write(t6.bytes);
                        randomAccessFile2.close();
                    } catch (Exception e11) {
                        e = e11;
                    }
                }
                tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
                tL_photoSize_layer127.w = t6.w;
                tL_photoSize_layer127.h = t6.h;
                tL_photoSize_layer127.location = t6.location;
                tL_photoSize_layer127.size = t6.size;
                tL_photoSize_layer127.type = t6.type;
            } else {
                tL_photoSize_layer127 = new TLRPC.TL_photoStrippedSize();
                tL_photoSize_layer127.location = t6.location;
                tL_photoSize_layer127.bytes = t6.bytes;
                tL_photoSize_layer127.h = t6.h;
                tL_photoSize_layer127.w = t6.w;
                i10 = 0;
            }
            messageMedia = message.media;
            if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto)) {
                int size = messageMedia.photo.sizes.size();
                for (int i12 = i10; i12 < size; i12++) {
                    if (message.media.photo.sizes.get(i12) instanceof TLRPC.TL_photoCachedSize) {
                        message.media.photo.sizes.set(i12, tL_photoSize_layer127);
                        return;
                    }
                }
                return;
            }
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                int size2 = messageMedia.document.thumbs.size();
                for (int i13 = i10; i13 < size2; i13++) {
                    if (message.media.document.thumbs.get(i13) instanceof TLRPC.TL_photoCachedSize) {
                        message.media.document.thumbs.set(i13, tL_photoSize_layer127);
                        return;
                    }
                }
                return;
            }
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                int size3 = messageMedia.webpage.photo.sizes.size();
                for (int i14 = i10; i14 < size3; i14++) {
                    if (message.media.webpage.photo.sizes.get(i14) instanceof TLRPC.TL_photoCachedSize) {
                        message.media.webpage.photo.sizes.set(i14, tL_photoSize_layer127);
                        return;
                    }
                }
                return;
            }
            return;
        }
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia3;
        int i15 = 0;
        while (i15 < tL_messageMediaPaidMedia.extended_media.size()) {
            TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i15);
            if ((messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) && (messageMedia2 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media) != null) {
                boolean z10 = messageMedia2 instanceof TLRPC.TL_messageMediaPhoto;
                if (z10) {
                    int size4 = messageMedia2.photo.sizes.size();
                    for (int i16 = i11; i16 < size4; i16++) {
                        photoSize = messageMedia2.photo.sizes.get(i16);
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
                            tL_fileLocationToBeDeprecated2.volume_id = j3;
                            tL_fileLocationToBeDeprecated2.local_id = iz.p();
                        }
                        if (photoSize.h <= i10 || photoSize.w > i10) {
                            w7.G(p10.s0);
                            J2 = w7.J(photoSize, null, true, true);
                            if (ij.R5(message)) {
                                i7 = i11;
                            } else {
                                J2 = new File(J2.getAbsolutePath() + ".enc");
                                i7 = 1;
                            }
                            if (!J2.exists()) {
                                if (i7 != 0) {
                                    try {
                                        RandomAccessFile randomAccessFile3 = new RandomAccessFile(new File(t0.b.getCacheDir(), J2.getName() + ".key"), "rws");
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
                                    } catch (Exception e12) {
                                        a8.g(e12, true);
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
                        if (!z10) {
                            int size5 = messageMedia2.photo.sizes.size();
                            int i17 = 0;
                            while (true) {
                                if (i17 >= size5) {
                                    break;
                                }
                                if (messageMedia2.photo.sizes.get(i17) instanceof TLRPC.TL_photoCachedSize) {
                                    messageMedia2.photo.sizes.set(i17, tL_photoSize_layer1272);
                                    break;
                                }
                                i17++;
                            }
                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                            int size6 = messageMedia2.document.thumbs.size();
                            int i18 = 0;
                            while (true) {
                                if (i18 >= size6) {
                                    break;
                                }
                                if (messageMedia2.document.thumbs.get(i18) instanceof TLRPC.TL_photoCachedSize) {
                                    messageMedia2.document.thumbs.set(i18, tL_photoSize_layer1272);
                                    break;
                                }
                                i18++;
                            }
                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                            int size7 = messageMedia2.webpage.photo.sizes.size();
                            int i19 = 0;
                            while (true) {
                                if (i19 >= size7) {
                                    break;
                                }
                                if (messageMedia2.webpage.photo.sizes.get(i19) instanceof TLRPC.TL_photoCachedSize) {
                                    messageMedia2.webpage.photo.sizes.set(i19, tL_photoSize_layer1272);
                                    break;
                                }
                                i19++;
                            }
                        }
                    }
                } else {
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                        TLRPC.Document document = messageMedia2.document;
                        if (document != null) {
                            int size8 = document.thumbs.size();
                            for (int i20 = i11; i20 < size8; i20++) {
                                photoSize2 = messageMedia2.document.thumbs.get(i20);
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
                                for (int i21 = i11; i21 < size9; i21++) {
                                    photoSize2 = messageMedia2.webpage.photo.sizes.get(i21);
                                    if (photoSize2 instanceof TLRPC.TL_photoCachedSize) {
                                        photoSize = photoSize2;
                                        break;
                                    }
                                }
                            }
                        } else if ((messageMedia2 instanceof TLRPC.TL_messageMediaInvoice) && !messageMedia2.extended_media.isEmpty() && (messageMedia2.extended_media.get(i11) instanceof TLRPC.TL_messageExtendedMediaPreview)) {
                            photoSize = ((TLRPC.TL_messageExtendedMediaPreview) messageMedia2.extended_media.get(i11)).thumb;
                        }
                        photoSize = null;
                    }
                    if (photoSize != null) {
                        fileLocation = photoSize.location;
                        if (fileLocation != null) {
                        }
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated22 = new TLRPC.TL_fileLocationToBeDeprecated();
                        photoSize.location = tL_fileLocationToBeDeprecated22;
                        tL_fileLocationToBeDeprecated22.volume_id = j3;
                        tL_fileLocationToBeDeprecated22.local_id = iz.p();
                        if (photoSize.h <= i10) {
                        }
                        w7.G(p10.s0);
                        J2 = w7.J(photoSize, null, true, true);
                        if (ij.R5(message)) {
                        }
                        if (!J2.exists()) {
                        }
                        tL_photoSize_layer1272 = new TLRPC.TL_photoSize_layer127();
                        tL_photoSize_layer1272.w = photoSize.w;
                        tL_photoSize_layer1272.h = photoSize.h;
                        tL_photoSize_layer1272.location = photoSize.location;
                        tL_photoSize_layer1272.size = photoSize.size;
                        tL_photoSize_layer1272.type = photoSize.type;
                        if (!z10) {
                        }
                    }
                }
            }
            i15++;
            i11 = 0;
            j3 = -2147483648L;
            i10 = 50;
        }
    }

    public static void X(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            W((TLRPC.Message) arrayList.get(i7));
        }
    }

    public static TLRPC.PhotoSize Y(Bitmap bitmap, float f10, float f11, int i7, int i10, int i11) {
        return b0(null, bitmap, Bitmap.CompressFormat.JPEG, f10, f11, i7, false, i10, i11, false);
    }

    public static TLRPC.PhotoSize Z(Bitmap bitmap, float f10, float f11, int i7, boolean z9) {
        return b0(null, bitmap, Bitmap.CompressFormat.JPEG, f10, f11, i7, z9, 0, 0, false);
    }

    public static TLRPC.PhotoSize a0(Bitmap bitmap, Bitmap.CompressFormat compressFormat, float f10, float f11, int i7) {
        return b0(null, bitmap, compressFormat, f10, f11, i7, false, 101, 101, false);
    }

    public static TLRPC.PhotoSize b0(TLRPC.PhotoSize photoSize, Bitmap bitmap, Bitmap.CompressFormat compressFormat, float f10, float f11, int i7, boolean z9, int i10, int i11, boolean z10) {
        boolean z11;
        float f12;
        int i12;
        int i13;
        float max;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            if (width != 0.0f && height != 0.0f) {
                float max2 = Math.max(width / f10, height / f11);
                if (i10 != 0 && i11 != 0) {
                    float f13 = i10;
                    if (width < f13 || height < i11) {
                        if (width >= f13 || height <= i11) {
                            if (width > f13) {
                                float f14 = i11;
                                if (height < f14) {
                                    max = height / f14;
                                }
                            }
                            max = Math.max(width / f13, height / i11);
                        } else {
                            max = width / f13;
                        }
                        max2 = max;
                        z11 = true;
                        f12 = max2;
                        i12 = (int) (width / f12);
                        i13 = (int) (height / f12);
                        if (i13 != 0 && i12 != 0) {
                            try {
                                return c0(photoSize, bitmap, compressFormat, i12, i13, f12, i7, z9, z11, z10);
                            } catch (Throwable th2) {
                                a8.g(th2, true);
                                D().j();
                                System.gc();
                                try {
                                    return c0(photoSize, bitmap, compressFormat, i12, i13, f12, i7, z9, z11, z10);
                                } catch (Throwable th3) {
                                    a8.g(th3, true);
                                }
                            }
                        }
                    }
                }
                z11 = false;
                f12 = max2;
                i12 = (int) (width / f12);
                i13 = (int) (height / f12);
                if (i13 != 0) {
                    return c0(photoSize, bitmap, compressFormat, i12, i13, f12, i7, z9, z11, z10);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TLRPC.PhotoSize c0(TLRPC.PhotoSize photoSize, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i7, int i10, float f10, int i11, boolean z9, boolean z10, boolean z11) {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        Bitmap createScaledBitmap = (f10 > 1.0f || z10) ? Bitmap.createScaledBitmap(bitmap, i7, i10, true) : bitmap;
        if (photoSize != null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            if (fileLocation instanceof TLRPC.TL_fileLocationToBeDeprecated) {
                tL_fileLocationToBeDeprecated = (TLRPC.TL_fileLocationToBeDeprecated) fileLocation;
                int i12 = rb.a[compressFormat.ordinal()];
                String str = (i12 != 1 || i12 == 2 || i12 == 3) ? ".webp" : ".jpg";
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_fileLocationToBeDeprecated.volume_id);
                sb2.append("_");
                FileOutputStream fileOutputStream = new FileOutputStream(new File(!z11 ? w7.z(4) : tL_fileLocationToBeDeprecated.volume_id != -2147483648L ? w7.z(0) : w7.z(4), a8.p0.n(tL_fileLocationToBeDeprecated.local_id, str, sb2)));
                createScaledBitmap.compress(compressFormat, i11, fileOutputStream);
                if (!z9) {
                    photoSize.size = (int) fileOutputStream.getChannel().size();
                }
                fileOutputStream.close();
                if (z9) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    createScaledBitmap.compress(compressFormat, i11, byteArrayOutputStream);
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
        tL_fileLocationToBeDeprecated.local_id = iz.p();
        tL_fileLocationToBeDeprecated.file_reference = new byte[0];
        photoSize = new TLRPC.TL_photoSize_layer127();
        photoSize.location = tL_fileLocationToBeDeprecated;
        photoSize.w = createScaledBitmap.getWidth();
        int height = createScaledBitmap.getHeight();
        photoSize.h = height;
        int i13 = photoSize.w;
        if (i13 <= 100 && height <= 100) {
            photoSize.type = "s";
        } else if (i13 <= 320 && height <= 320) {
            photoSize.type = "m";
        } else if (i13 <= 800 && height <= 800) {
            photoSize.type = "x";
        } else if (i13 > 1280 || height > 1280) {
            photoSize.type = "w";
        } else {
            photoSize.type = "y";
        }
        int i122 = rb.a[compressFormat.ordinal()];
        if (i122 != 1) {
        }
        StringBuilder sb22 = new StringBuilder();
        sb22.append(tL_fileLocationToBeDeprecated.volume_id);
        sb22.append("_");
        FileOutputStream fileOutputStream2 = new FileOutputStream(new File(!z11 ? w7.z(4) : tL_fileLocationToBeDeprecated.volume_id != -2147483648L ? w7.z(0) : w7.z(4), a8.p0.n(tL_fileLocationToBeDeprecated.local_id, str, sb22)));
        createScaledBitmap.compress(compressFormat, i11, fileOutputStream2);
        if (!z9) {
        }
        fileOutputStream2.close();
        if (z9) {
        }
        if (createScaledBitmap != bitmap) {
        }
        return photoSize;
    }

    public static int d(gc gcVar, BitmapDrawable bitmapDrawable) {
        if (bitmapDrawable instanceof org.telegram.ui.Components.v5) {
            org.telegram.ui.Components.v5 v5Var = (org.telegram.ui.Components.v5) bitmapDrawable;
            return Math.max(v5Var.getIntrinsicHeight() * v5Var.getIntrinsicWidth(), v5Var.j0 * v5Var.i0) * 12;
        }
        if (!(bitmapDrawable instanceof ah0)) {
            return bitmapDrawable.getBitmap().getByteCount();
        }
        ah0 ah0Var = (ah0) bitmapDrawable;
        int i7 = ah0Var.b * ah0Var.c;
        return ah0Var.G ? i7 * 2 : i7 * 8;
    }

    public static boolean d0(Uri uri, String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (str == null && uri != null && uri.getScheme() != null) {
            if (uri.getScheme().contains("file")) {
                str = uri.getPath();
            } else {
                try {
                    str = g0.T0(uri);
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
        }
        if (str != null) {
            BitmapFactory.decodeFile(str, options);
        } else if (uri != null) {
            try {
                InputStream openInputStream = t0.b.getContentResolver().openInputStream(uri);
                BitmapFactory.decodeStream(openInputStream, null, options);
                openInputStream.close();
            } catch (Throwable th3) {
                a8.g(th3, true);
                return false;
            }
        }
        float f10 = options.outWidth;
        float f11 = options.outHeight;
        return f10 / f11 > 10.0f || f11 / f10 > 10.0f;
    }

    public static boolean e0(hc hcVar, String str) {
        if (str.endsWith("_firstframe") || str.endsWith("_lastframe")) {
            return false;
        }
        return (hcVar != null && (ij.K2(hcVar.i, true) || hcVar.p == 1 || ij.N4(hcVar.i))) || I(str);
    }

    public static boolean f(File file, File file2, int i7) {
        File file3;
        File file4;
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                if (i7 == 0) {
                    file3 = new File(file, "000000000_999999_temp.f");
                    file4 = new File(file2, "000000000_999999.f");
                } else {
                    if (i7 != 3 && i7 != 5 && i7 != 6) {
                        if (i7 == 1) {
                            file3 = new File(file, "000000000_999999_temp.f");
                            file4 = new File(file2, "000000000_999999.f");
                        } else if (i7 == 2) {
                            file3 = new File(file, "000000000_999999_temp.f");
                            file4 = new File(file2, "000000000_999999.f");
                        } else {
                            file4 = null;
                            file3 = null;
                        }
                    }
                    file3 = new File(file, "000000000_999999_temp.f");
                    file4 = new File(file2, "000000000_999999.f");
                }
                bArr = new byte[1024];
                file3.createNewFile();
                randomAccessFile = new RandomAccessFile(file3, "rws");
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            randomAccessFile.write(bArr);
            randomAccessFile.close();
            boolean renameTo = file3.renameTo(file4);
            file3.delete();
            file4.delete();
            return renameTo;
        } catch (Exception e11) {
            e = e11;
            randomAccessFile2 = randomAccessFile;
            a8.g(e, true);
            if (randomAccessFile2 == null) {
                return false;
            }
            try {
                randomAccessFile2.close();
                return false;
            } catch (Exception e12) {
                a8.g(e12, true);
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (Exception e13) {
                    a8.g(e13, true);
                }
            }
            throw th;
        }
    }

    public static BitmapDrawable m(ArrayList arrayList) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (arrayList.get(i7) instanceof TLRPC.TL_photoStrippedSize) {
                return new BitmapDrawable(t0.b.getResources(), F("b", ((TLRPC.TL_photoStrippedSize) arrayList.get(i7)).bytes));
            }
        }
        return null;
    }

    public static String n(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(64);
        return indexOf >= 0 ? str.substring(0, indexOf) : str;
    }

    public static String o(File file) {
        StringBuilder sb2 = new StringBuilder();
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
                            String sb3 = sb2.toString();
                            bufferedReader.close();
                            gZIPInputStream.close();
                            return sb3;
                        }
                        sb2.append(readLine);
                    } finally {
                    }
                }
            } finally {
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public static TLRPC.TL_photoSize_layer127 q(String str) {
        if (str == null) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i7 = options.outWidth;
            int i10 = options.outHeight;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
            tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
            tL_fileLocationToBeDeprecated.dc_id = TLObject.FLAG_31;
            tL_fileLocationToBeDeprecated.local_id = iz.p();
            tL_fileLocationToBeDeprecated.file_reference = new byte[0];
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.location = tL_fileLocationToBeDeprecated;
            tL_photoSize_layer127.w = i7;
            tL_photoSize_layer127.h = i10;
            if (i7 <= 100 && i10 <= 100) {
                tL_photoSize_layer127.type = "s";
            } else if (i7 <= 320 && i10 <= 320) {
                tL_photoSize_layer127.type = "m";
            } else if (i7 <= 800 && i10 <= 800) {
                tL_photoSize_layer127.type = "x";
            } else if (i7 > 1280 || i10 > 1280) {
                tL_photoSize_layer127.type = "w";
            } else {
                tL_photoSize_layer127.type = "y";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_fileLocationToBeDeprecated.volume_id);
            sb2.append("_");
            File file = new File(tL_fileLocationToBeDeprecated.volume_id != -2147483648L ? w7.z(0) : w7.z(4), a8.p0.n(tL_fileLocationToBeDeprecated.local_id, ".jpg", sb2));
            new File(str).renameTo(file);
            tL_photoSize_layer127.size = (int) file.length();
            return tL_photoSize_layer127;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static void r(TLRPC.PhotoSize photoSize) {
        if (photoSize != null) {
            byte[] bArr = photoSize.bytes;
            if (bArr == null || bArr.length == 0) {
                w7.G(p10.s0);
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(w7.J(photoSize, null, true, true), "r");
                    if (((int) randomAccessFile.length()) < 20000) {
                        int length = (int) randomAccessFile.length();
                        byte[] bArr2 = new byte[length];
                        photoSize.bytes = bArr2;
                        randomAccessFile.readFully(bArr2, 0, length);
                    }
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
        }
    }

    public static Drawable s(String str, List list) {
        if (list == null) {
            return null;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            ImageReceiver imageReceiver = (ImageReceiver) list.get(i7);
            if (str.equals(imageReceiver.Q)) {
                return imageReceiver.S;
            }
            if (str.equals(imageReceiver.h0)) {
                return imageReceiver.j0;
            }
        }
        return null;
    }

    public static TLRPC.PhotoSize t(TLRPC.Message message) {
        TLRPC.MessageMedia messageMedia = message.media;
        int i7 = 0;
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia.photo.sizes.size();
            while (i7 < size) {
                TLRPC.PhotoSize photoSize = message.media.photo.sizes.get(i7);
                if (photoSize instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize;
                }
                i7++;
            }
            return null;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = messageMedia.document;
            if (document == null) {
                return null;
            }
            int size2 = document.thumbs.size();
            while (i7 < size2) {
                TLRPC.PhotoSize photoSize2 = message.media.document.thumbs.get(i7);
                if (photoSize2 instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize2;
                }
                i7++;
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
        while (i7 < size3) {
            TLRPC.PhotoSize photoSize3 = message.media.webpage.photo.sizes.get(i7);
            if (photoSize3 instanceof TLRPC.TL_photoCachedSize) {
                return photoSize3;
            }
            i7++;
        }
        return null;
    }

    public static cc u(TLRPC.Message message) {
        int i7;
        int i10;
        Bitmap F;
        byte[] bArr;
        TLRPC.PhotoSize t6 = t(message);
        if (t6 == null || (bArr = t6.bytes) == null || bArr.length == 0) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                int size = messageMedia.document.thumbs.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.PhotoSize photoSize = message.media.document.thumbs.get(i11);
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        TLRPC.PhotoSize w10 = w7.w(message.media.document.thumbs, qs.r5, false, null, false);
                        if (w10 == null) {
                            int i12 = 0;
                            while (true) {
                                if (i12 >= message.media.document.attributes.size()) {
                                    i7 = 0;
                                    i10 = 0;
                                    break;
                                }
                                if (message.media.document.attributes.get(i12) instanceof TLRPC.TL_documentAttributeVideo) {
                                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) message.media.document.attributes.get(i12);
                                    i10 = tL_documentAttributeVideo.h;
                                    i7 = tL_documentAttributeVideo.w;
                                    break;
                                }
                                i12++;
                            }
                        } else {
                            i10 = w10.h;
                            i7 = w10.w;
                        }
                        PointF P1 = org.telegram.ui.Cells.q1.P1(i7, i10, 0, 0);
                        Locale locale = Locale.US;
                        String s5 = hc.s(message, message, photoSize);
                        float f10 = P1.x;
                        float f11 = g0.p;
                        String str = s5 + "_false@" + ((int) (f10 / f11)) + "_" + ((int) (P1.y / f11)) + "_b";
                        if (!D().J(str, false) && (F = F(null, photoSize.bytes)) != null) {
                            Utilities.blurBitmap(F, 3);
                            float f12 = P1.x;
                            float f13 = g0.p;
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(F, (int) (f12 / f13), (int) (P1.y / f13), true);
                            if (createScaledBitmap != F) {
                                F.recycle();
                                F = createScaledBitmap;
                            }
                            return new cc(str, new BitmapDrawable(F));
                        }
                    }
                }
            }
        } else {
            w7.G(p10.s0);
            File J2 = w7.J(t6, null, true, true);
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.w = t6.w;
            tL_photoSize_layer127.h = t6.h;
            tL_photoSize_layer127.location = t6.location;
            tL_photoSize_layer127.size = t6.size;
            tL_photoSize_layer127.type = t6.type;
            if (J2.exists() && message.grouped_id == 0) {
                PointF P12 = org.telegram.ui.Cells.q1.P1(t6.w, t6.h, 0, 0);
                Locale locale2 = Locale.US;
                TLRPC.FileLocation fileLocation = t6.location;
                long j3 = fileLocation.volume_id;
                int i13 = fileLocation.local_id;
                float f14 = P12.x;
                float f15 = g0.p;
                String str2 = j3 + "_" + i13 + "@" + ((int) (f14 / f15)) + "_" + ((int) (P12.y / f15)) + "_b";
                if (!D().J(str2, false)) {
                    String path = J2.getPath();
                    float f16 = P12.x;
                    float f17 = g0.p;
                    Bitmap K2 = K(path, null, (int) (f16 / f17), (int) (P12.y / f17), false);
                    if (K2 != null) {
                        Utilities.blurBitmap(K2, 3);
                        float f18 = P12.x;
                        float f19 = g0.p;
                        Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(K2, (int) (f18 / f19), (int) (P12.y / f19), true);
                        if (createScaledBitmap2 != K2) {
                            K2.recycle();
                            K2 = createScaledBitmap2;
                        }
                        return new cc(str2, new BitmapDrawable(K2));
                    }
                }
            }
        }
        return null;
    }

    public final BitmapDrawable C(TLObject tLObject) {
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
        } else if (tLObject instanceof ew) {
            TLRPC.TL_secureFile tL_secureFile = ((ew) tLObject).b;
            str = tL_secureFile.dc_id + "_" + tL_secureFile.id;
        } else if (tLObject instanceof m20) {
            str = Utilities.a(((m20) tLObject).a);
        }
        return z(str + "@50_50");
    }

    public final void H(String str) {
        HashMap hashMap = this.a;
        Integer num = (Integer) hashMap.get(str);
        if (num == null) {
            hashMap.put(str, 1);
        } else {
            hashMap.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public final boolean J(String str, boolean z9) {
        return z9 ? y(str) != null : z(str) != null;
    }

    public final void L(int i7, String str, String str2) {
        if (str != null && str.length() != 0) {
            HashMap hashMap = this.C;
            if (!hashMap.containsKey(str)) {
                String B = B(str, str2);
                File file = new File(w7.z(4), Utilities.a(str) + "_temp." + B);
                file.delete();
                xb xbVar = new xb(this, str, file, B, i7);
                this.B.add(xbVar);
                hashMap.put(str, xbVar);
                U(null, 0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0234, code lost:
    
        if (r4.local_id >= 0) goto L201;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x030c A[EDGE_INSN: B:184:0x030c->B:185:0x030c BREAK  A[LOOP:0: B:98:0x01ae->B:106:0x0300], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0366 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x036e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0376 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0385 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0397 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(ImageReceiver imageReceiver, List list) {
        int i7;
        String str;
        boolean z9;
        boolean z10;
        String str2;
        boolean z11;
        String str3;
        int i10;
        boolean z12;
        Object obj;
        hc hcVar;
        String str4;
        hc hcVar2;
        hc hcVar3;
        hc hcVar4;
        boolean z13;
        String str5;
        String str6;
        hc hcVar5;
        String str7;
        String str8;
        int i11;
        int i12;
        hc hcVar6;
        String str9;
        int i13;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        int i14;
        String str18;
        ImageReceiver imageReceiver2;
        int i15;
        String str19;
        hc hcVar7;
        boolean z14;
        boolean z15;
        hc hcVar8;
        hc hcVar9;
        String str20;
        Drawable drawable;
        Drawable s5;
        String str21 = imageReceiver.h0;
        int i16 = imageReceiver.p0 + 1;
        imageReceiver.p0 = i16;
        kb kbVar = this.d;
        kb kbVar2 = this.b;
        kb kbVar3 = this.c;
        if (str21 != null) {
            hc hcVar10 = imageReceiver.f0;
            Drawable s9 = s(str21, list);
            if (s9 == null) {
                if (e0(hcVar10, str21)) {
                    s9 = y(str21);
                } else {
                    Drawable drawable2 = (Drawable) kbVar3.f(str21);
                    if (drawable2 != null) {
                        kbVar3.g(str21);
                    }
                    if (drawable2 == null && (drawable2 = (Drawable) kbVar2.f(str21)) != null) {
                        kbVar2.g(str21);
                    }
                    s9 = drawable2;
                    if (s9 == null && (s9 = (Drawable) kbVar.f(str21)) != null) {
                        kbVar.g(str21);
                    }
                }
            }
            Drawable drawable3 = s9;
            if ((drawable3 instanceof ah0 ? ((ah0) drawable3).u() : drawable3 instanceof org.telegram.ui.Components.v5 ? ((org.telegram.ui.Components.v5) drawable3).s() : true) && drawable3 != null) {
                h(imageReceiver, true);
                imageReceiver.x0(drawable3, str21, 3, true, i16);
                if (!imageReceiver.S0) {
                    return;
                }
                z9 = true;
                i7 = i16;
                z10 = false;
                str = str21;
            } else if (drawable3 != null) {
                i7 = i16;
                imageReceiver.x0(drawable3, str21, 3, true, i7);
                str = str21;
                z10 = true;
                z9 = false;
            }
            str2 = imageReceiver.Q;
            if (!z9 && str2 != null) {
                hc hcVar11 = imageReceiver.O;
                s5 = s(str2, list);
                if (s5 == null && e0(hcVar11, str2)) {
                    s5 = y(str2);
                }
                if (s5 == null) {
                    Drawable drawable4 = (Drawable) kbVar3.f(str2);
                    if (drawable4 != null) {
                        kbVar3.g(str2);
                    }
                    if (drawable4 == null && (drawable4 = (Drawable) kbVar2.f(str2)) != null) {
                        kbVar2.g(str2);
                    }
                    s5 = drawable4;
                    if (s5 == null && (s5 = (Drawable) kbVar.f(str2)) != null) {
                        kbVar.g(str2);
                    }
                }
                if (s5 != null) {
                    h(imageReceiver, true);
                    imageReceiver.x0(s5, str2, 0, true, i7);
                    if (!imageReceiver.S0 && (str == null || z10)) {
                        return;
                    }
                    z11 = true;
                    str3 = imageReceiver.Y;
                    if (str3 != null) {
                        if (e0(imageReceiver.W, str3)) {
                            drawable = y(str3);
                        } else {
                            drawable = (Drawable) kbVar3.f(str3);
                            if (drawable != null) {
                                kbVar3.g(str3);
                            }
                            if (drawable == null && (drawable = (Drawable) kbVar2.f(str3)) != null) {
                                kbVar2.g(str3);
                            }
                            if (drawable == null && (drawable = (Drawable) kbVar.f(str3)) != null) {
                                kbVar.g(str3);
                            }
                        }
                        if (drawable != null) {
                            imageReceiver.x0(drawable, str3, 1, true, i7);
                            i10 = i7;
                            h(imageReceiver, false);
                            if (z11 && imageReceiver.S0) {
                                return;
                            }
                            z12 = true;
                            obj = imageReceiver.h;
                            TLRPC.Document document = imageReceiver.H0;
                            hcVar = imageReceiver.W;
                            str4 = imageReceiver.X;
                            hcVar2 = imageReceiver.f0;
                            String str22 = imageReceiver.g0;
                            hcVar3 = imageReceiver.O;
                            String str23 = imageReceiver.P;
                            if (hcVar3 == null && imageReceiver.F0 && imageReceiver.I0) {
                                if (!(obj instanceof ij)) {
                                    hcVar4 = hc.b(((ij) obj).F0());
                                } else if (document != null) {
                                    hcVar4 = hc.b(document);
                                }
                                z13 = true;
                                String str24 = null;
                                String str25 = (hcVar4 == null && hcVar4.p == 2) ? "mp4" : null;
                                str5 = (hcVar2 == null && hcVar2.p == 2) ? "mp4" : null;
                                str6 = imageReceiver.n0;
                                if (str6 == null) {
                                    str6 = "jpg";
                                }
                                String str26 = str25 != null ? str6 : str25;
                                if (str5 == null) {
                                    str5 = str6;
                                }
                                boolean z16 = z12;
                                hcVar5 = hcVar2;
                                boolean z17 = z13;
                                hc hcVar12 = hcVar3;
                                str7 = null;
                                str8 = null;
                                String str27 = null;
                                String str28 = null;
                                i11 = 0;
                                boolean z18 = false;
                                while (true) {
                                    i12 = i10;
                                    if (i11 < 2) {
                                        break;
                                    }
                                    if (i11 == 0) {
                                        hcVar7 = hcVar4;
                                        i15 = i11;
                                        str19 = str26;
                                    } else {
                                        i15 = i11;
                                        str19 = str5;
                                        hcVar7 = hcVar5;
                                    }
                                    if (hcVar7 == null) {
                                        z14 = z10;
                                        z15 = z11;
                                    } else {
                                        z14 = z10;
                                        z15 = z11;
                                        String q10 = hcVar7.q(obj, hcVar5 != null ? hcVar5 : hcVar4, false);
                                        if (q10 != null) {
                                            if (hcVar5 != null) {
                                                hcVar9 = hcVar4;
                                                hcVar8 = hcVar5;
                                            } else {
                                                hcVar8 = hcVar4;
                                                hcVar9 = hcVar8;
                                            }
                                            String q11 = hcVar7.q(obj, hcVar8, true);
                                            if (hcVar7.g != null) {
                                                StringBuilder j3 = rf.b.j(q11, ".");
                                                j3.append(B(hcVar7.g, "jpg"));
                                                q11 = j3.toString();
                                                str20 = str4;
                                            } else {
                                                TLRPC.PhotoSize photoSize = hcVar7.k;
                                                str20 = str4;
                                                if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                                                    q11 = a8.p0.D(q11, ".", str19);
                                                } else {
                                                    if (hcVar7.f != null) {
                                                        q11 = a8.p0.D(q11, ".", str19);
                                                        if (imageReceiver.n0 == null) {
                                                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = hcVar7.f;
                                                            if (tL_fileLocationToBeDeprecated.key == null) {
                                                                if (tL_fileLocationToBeDeprecated.volume_id == -2147483648L) {
                                                                }
                                                            }
                                                        }
                                                        z18 = true;
                                                    } else {
                                                        m20 m20Var = hcVar7.v;
                                                        if (m20Var != null) {
                                                            String H = w7.H(m20Var.e);
                                                            StringBuilder j10 = rf.b.j(q11, ".");
                                                            j10.append(B(hcVar7.v.a, H));
                                                            q11 = j10.toString();
                                                        } else if (hcVar7.h != null) {
                                                            q11 = a8.p0.D(q11, ".", str19);
                                                        } else if (hcVar7.i != null) {
                                                            if (i15 == 0 && z17) {
                                                                q10 = "q_".concat(q10);
                                                            }
                                                            String B = w7.B(hcVar7.i);
                                                            int lastIndexOf = B.lastIndexOf(46);
                                                            String str29 = "";
                                                            String substring = lastIndexOf == -1 ? "" : B.substring(lastIndexOf);
                                                            if (substring.length() > 1) {
                                                                str29 = substring;
                                                            } else if ("video/mp4".equals(hcVar7.i.mime_type)) {
                                                                str29 = ".mp4";
                                                            } else if ("video/x-matroska".equals(hcVar7.i.mime_type)) {
                                                                str29 = ".mkv";
                                                            }
                                                            q11 = rf.b.r(q11, str29);
                                                            if (ij.K4(hcVar7.i) || ij.s3(hcVar7.i, false) || ij.i4(hcVar7.i) || ij.y(hcVar7.i)) {
                                                                z18 = false;
                                                            }
                                                            z18 = true;
                                                        } else if (obj instanceof TLRPC.StickerSet) {
                                                            q11 = a8.p0.D(q11, ".", str19);
                                                        }
                                                    }
                                                    i11 = i15 + 1;
                                                    i10 = i12;
                                                    z10 = z14;
                                                    z11 = z15;
                                                    str4 = str20;
                                                }
                                            }
                                            if (i15 == 0) {
                                                str8 = q10;
                                                str27 = q11;
                                            } else {
                                                str7 = q10;
                                                str28 = q11;
                                            }
                                            if (hcVar7 == hcVar) {
                                                if (i15 == 0) {
                                                    hcVar4 = null;
                                                    str8 = null;
                                                    str27 = null;
                                                    i11 = i15 + 1;
                                                    i10 = i12;
                                                    z10 = z14;
                                                    z11 = z15;
                                                    str4 = str20;
                                                } else {
                                                    str7 = null;
                                                    hcVar5 = null;
                                                    str28 = null;
                                                }
                                            }
                                            hcVar4 = hcVar9;
                                            i11 = i15 + 1;
                                            i10 = i12;
                                            z10 = z14;
                                            z11 = z15;
                                            str4 = str20;
                                        }
                                    }
                                    str20 = str4;
                                    i11 = i15 + 1;
                                    i10 = i12;
                                    z10 = z14;
                                    z11 = z15;
                                    str4 = str20;
                                }
                                hcVar6 = hcVar4;
                                str9 = str4;
                                boolean z19 = z10;
                                boolean z20 = z11;
                                if (hcVar == null) {
                                    hc hcVar13 = imageReceiver.N;
                                    if (hcVar13 == null) {
                                        if (hcVar5 != null) {
                                            hcVar12 = hcVar5;
                                        }
                                        hcVar13 = hcVar12;
                                    }
                                    String q12 = hcVar.q(obj, hcVar13, false);
                                    i13 = 1;
                                    String q13 = hcVar.q(obj, hcVar13, true);
                                    if (hcVar.g != null) {
                                        StringBuilder j11 = rf.b.j(q13, ".");
                                        j11.append(B(hcVar.g, "jpg"));
                                        q13 = j11.toString();
                                    } else {
                                        TLRPC.PhotoSize photoSize2 = hcVar.k;
                                        if ((photoSize2 instanceof TLRPC.TL_photoStrippedSize) || (photoSize2 instanceof TLRPC.TL_photoPathSize)) {
                                            q13 = a8.p0.D(q13, ".", str6);
                                        } else if (hcVar.f != null) {
                                            q13 = a8.p0.D(q13, ".", str6);
                                        }
                                    }
                                    str24 = q13;
                                    str10 = q12;
                                } else {
                                    i13 = 1;
                                    str10 = null;
                                }
                                if (str7 != null && str22 != null) {
                                    str7 = a8.p0.D(str7, "@", str22);
                                }
                                if (str8 != null && str23 != null) {
                                    str8 = a8.p0.D(str8, "@", str23);
                                }
                                if (str10 != null || str9 == null) {
                                    str11 = str9;
                                } else {
                                    str11 = str9;
                                    str10 = a8.p0.D(str10, "@", str11);
                                }
                                if (imageReceiver.v1 != null && str8 != null) {
                                    str8 = a8.p0.s(new StringBuilder(), imageReceiver.v1, str8);
                                }
                                String str30 = str8;
                                if (imageReceiver.v1 != null && str7 != null) {
                                    str7 = a8.p0.s(new StringBuilder(), imageReceiver.v1, str7);
                                }
                                String str31 = str7;
                                if (hcVar6 != null) {
                                    str12 = str6;
                                    str13 = str10;
                                    str14 = str30;
                                    str15 = str24;
                                    str16 = str26;
                                    str17 = str27;
                                    i14 = i12;
                                } else {
                                    if (hcVar6.g != null) {
                                        k(imageReceiver, str10, str24, str6, hcVar, str11, 0L, 1, 1, z16 ? 2 : i13, i12);
                                        k(imageReceiver, str30, str27, str26, hcVar6, str23, imageReceiver.q0, 1, 0, 0, i12);
                                        return;
                                    }
                                    hcVar6 = hcVar6;
                                    str13 = str10;
                                    str14 = str30;
                                    str15 = str24;
                                    str16 = str26;
                                    str17 = str27;
                                    i14 = i12;
                                    str12 = str6;
                                }
                                if (hcVar5 != null) {
                                    int i17 = imageReceiver.r0;
                                    int i18 = (i17 == 0 && z18) ? i13 : i17;
                                    k(imageReceiver, str13, str15, str12, hcVar, str11, 0L, i18 == 0 ? i13 : i18, 1, z16 ? 2 : i13, i14);
                                    k(imageReceiver, str14, str17, str16, hcVar6, str23, imageReceiver.q0, i18, 0, 0, i14);
                                    return;
                                }
                                int i19 = imageReceiver.r0;
                                int i20 = (i19 == 0 && z18) ? i13 : i19;
                                int i21 = i20 == 0 ? i13 : i20;
                                if (z16) {
                                    str18 = str22;
                                } else {
                                    str18 = str22;
                                    k(imageReceiver, str13, str15, str12, hcVar, str11, 0L, i21, 1, 1, i14);
                                }
                                if (z20) {
                                    imageReceiver2 = imageReceiver;
                                } else {
                                    imageReceiver2 = imageReceiver;
                                    k(imageReceiver2, str14, str17, str16, hcVar6, str23, 0L, 1, 0, 0, i14);
                                }
                                if (z19) {
                                    return;
                                }
                                k(imageReceiver2, str31, str28, str5, hcVar5, str18, imageReceiver2.q0, i20, 3, 0, i14);
                                return;
                            }
                            hcVar4 = hcVar3;
                            z13 = false;
                            String str242 = null;
                            String str252 = (hcVar4 == null && hcVar4.p == 2) ? "mp4" : null;
                            if (hcVar2 == null) {
                            }
                            str6 = imageReceiver.n0;
                            if (str6 == null) {
                            }
                            if (str252 != null) {
                            }
                            if (str5 == null) {
                            }
                            boolean z162 = z12;
                            hcVar5 = hcVar2;
                            boolean z172 = z13;
                            hc hcVar122 = hcVar3;
                            str7 = null;
                            str8 = null;
                            String str272 = null;
                            String str282 = null;
                            i11 = 0;
                            boolean z182 = false;
                            while (true) {
                                i12 = i10;
                                if (i11 < 2) {
                                }
                                i11 = i15 + 1;
                                i10 = i12;
                                z10 = z14;
                                z11 = z15;
                                str4 = str20;
                            }
                            hcVar6 = hcVar4;
                            str9 = str4;
                            boolean z192 = z10;
                            boolean z202 = z11;
                            if (hcVar == null) {
                            }
                            if (str7 != null) {
                                str7 = a8.p0.D(str7, "@", str22);
                            }
                            if (str8 != null) {
                                str8 = a8.p0.D(str8, "@", str23);
                            }
                            if (str10 != null) {
                            }
                            str11 = str9;
                            if (imageReceiver.v1 != null) {
                                str8 = a8.p0.s(new StringBuilder(), imageReceiver.v1, str8);
                            }
                            String str302 = str8;
                            if (imageReceiver.v1 != null) {
                                str7 = a8.p0.s(new StringBuilder(), imageReceiver.v1, str7);
                            }
                            String str312 = str7;
                            if (hcVar6 != null) {
                            }
                            if (hcVar5 != null) {
                            }
                        }
                    }
                    i10 = i7;
                    z12 = false;
                    obj = imageReceiver.h;
                    TLRPC.Document document2 = imageReceiver.H0;
                    hcVar = imageReceiver.W;
                    str4 = imageReceiver.X;
                    hcVar2 = imageReceiver.f0;
                    String str222 = imageReceiver.g0;
                    hcVar3 = imageReceiver.O;
                    String str232 = imageReceiver.P;
                    if (hcVar3 == null) {
                        if (!(obj instanceof ij)) {
                        }
                        z13 = true;
                        String str2422 = null;
                        String str2522 = (hcVar4 == null && hcVar4.p == 2) ? "mp4" : null;
                        if (hcVar2 == null) {
                        }
                        str6 = imageReceiver.n0;
                        if (str6 == null) {
                        }
                        if (str2522 != null) {
                        }
                        if (str5 == null) {
                        }
                        boolean z1622 = z12;
                        hcVar5 = hcVar2;
                        boolean z1722 = z13;
                        hc hcVar1222 = hcVar3;
                        str7 = null;
                        str8 = null;
                        String str2722 = null;
                        String str2822 = null;
                        i11 = 0;
                        boolean z1822 = false;
                        while (true) {
                            i12 = i10;
                            if (i11 < 2) {
                            }
                            i11 = i15 + 1;
                            i10 = i12;
                            z10 = z14;
                            z11 = z15;
                            str4 = str20;
                        }
                        hcVar6 = hcVar4;
                        str9 = str4;
                        boolean z1922 = z10;
                        boolean z2022 = z11;
                        if (hcVar == null) {
                        }
                        if (str7 != null) {
                        }
                        if (str8 != null) {
                        }
                        if (str10 != null) {
                        }
                        str11 = str9;
                        if (imageReceiver.v1 != null) {
                        }
                        String str3022 = str8;
                        if (imageReceiver.v1 != null) {
                        }
                        String str3122 = str7;
                        if (hcVar6 != null) {
                        }
                        if (hcVar5 != null) {
                        }
                    }
                    hcVar4 = hcVar3;
                    z13 = false;
                    String str24222 = null;
                    String str25222 = (hcVar4 == null && hcVar4.p == 2) ? "mp4" : null;
                    if (hcVar2 == null) {
                    }
                    str6 = imageReceiver.n0;
                    if (str6 == null) {
                    }
                    if (str25222 != null) {
                    }
                    if (str5 == null) {
                    }
                    boolean z16222 = z12;
                    hcVar5 = hcVar2;
                    boolean z17222 = z13;
                    hc hcVar12222 = hcVar3;
                    str7 = null;
                    str8 = null;
                    String str27222 = null;
                    String str28222 = null;
                    i11 = 0;
                    boolean z18222 = false;
                    while (true) {
                        i12 = i10;
                        if (i11 < 2) {
                        }
                        i11 = i15 + 1;
                        i10 = i12;
                        z10 = z14;
                        z11 = z15;
                        str4 = str20;
                    }
                    hcVar6 = hcVar4;
                    str9 = str4;
                    boolean z19222 = z10;
                    boolean z20222 = z11;
                    if (hcVar == null) {
                    }
                    if (str7 != null) {
                    }
                    if (str8 != null) {
                    }
                    if (str10 != null) {
                    }
                    str11 = str9;
                    if (imageReceiver.v1 != null) {
                    }
                    String str30222 = str8;
                    if (imageReceiver.v1 != null) {
                    }
                    String str31222 = str7;
                    if (hcVar6 != null) {
                    }
                    if (hcVar5 != null) {
                    }
                }
            }
            z11 = z9;
            str3 = imageReceiver.Y;
            if (str3 != null) {
            }
            i10 = i7;
            z12 = false;
            obj = imageReceiver.h;
            TLRPC.Document document22 = imageReceiver.H0;
            hcVar = imageReceiver.W;
            str4 = imageReceiver.X;
            hcVar2 = imageReceiver.f0;
            String str2222 = imageReceiver.g0;
            hcVar3 = imageReceiver.O;
            String str2322 = imageReceiver.P;
            if (hcVar3 == null) {
            }
            hcVar4 = hcVar3;
            z13 = false;
            String str242222 = null;
            String str252222 = (hcVar4 == null && hcVar4.p == 2) ? "mp4" : null;
            if (hcVar2 == null) {
            }
            str6 = imageReceiver.n0;
            if (str6 == null) {
            }
            if (str252222 != null) {
            }
            if (str5 == null) {
            }
            boolean z162222 = z12;
            hcVar5 = hcVar2;
            boolean z172222 = z13;
            hc hcVar122222 = hcVar3;
            str7 = null;
            str8 = null;
            String str272222 = null;
            String str282222 = null;
            i11 = 0;
            boolean z182222 = false;
            while (true) {
                i12 = i10;
                if (i11 < 2) {
                }
                i11 = i15 + 1;
                i10 = i12;
                z10 = z14;
                z11 = z15;
                str4 = str20;
            }
            hcVar6 = hcVar4;
            str9 = str4;
            boolean z192222 = z10;
            boolean z202222 = z11;
            if (hcVar == null) {
            }
            if (str7 != null) {
            }
            if (str8 != null) {
            }
            if (str10 != null) {
            }
            str11 = str9;
            if (imageReceiver.v1 != null) {
            }
            String str302222 = str8;
            if (imageReceiver.v1 != null) {
            }
            String str312222 = str7;
            if (hcVar6 != null) {
            }
            if (hcVar5 != null) {
            }
        }
        i7 = i16;
        str = str21;
        z9 = false;
        z10 = false;
        str2 = imageReceiver.Q;
        if (!z9) {
            hc hcVar112 = imageReceiver.O;
            s5 = s(str2, list);
            if (s5 == null) {
                s5 = y(str2);
            }
            if (s5 == null) {
            }
            if (s5 != null) {
            }
        }
        z11 = z9;
        str3 = imageReceiver.Y;
        if (str3 != null) {
        }
        i10 = i7;
        z12 = false;
        obj = imageReceiver.h;
        TLRPC.Document document222 = imageReceiver.H0;
        hcVar = imageReceiver.W;
        str4 = imageReceiver.X;
        hcVar2 = imageReceiver.f0;
        String str22222 = imageReceiver.g0;
        hcVar3 = imageReceiver.O;
        String str23222 = imageReceiver.P;
        if (hcVar3 == null) {
        }
        hcVar4 = hcVar3;
        z13 = false;
        String str2422222 = null;
        String str2522222 = (hcVar4 == null && hcVar4.p == 2) ? "mp4" : null;
        if (hcVar2 == null) {
        }
        str6 = imageReceiver.n0;
        if (str6 == null) {
        }
        if (str2522222 != null) {
        }
        if (str5 == null) {
        }
        boolean z1622222 = z12;
        hcVar5 = hcVar2;
        boolean z1722222 = z13;
        hc hcVar1222222 = hcVar3;
        str7 = null;
        str8 = null;
        String str2722222 = null;
        String str2822222 = null;
        i11 = 0;
        boolean z1822222 = false;
        while (true) {
            i12 = i10;
            if (i11 < 2) {
            }
            i11 = i15 + 1;
            i10 = i12;
            z10 = z14;
            z11 = z15;
            str4 = str20;
        }
        hcVar6 = hcVar4;
        str9 = str4;
        boolean z1922222 = z10;
        boolean z2022222 = z11;
        if (hcVar == null) {
        }
        if (str7 != null) {
        }
        if (str8 != null) {
        }
        if (str10 != null) {
        }
        str11 = str9;
        if (imageReceiver.v1 != null) {
        }
        String str3022222 = str8;
        if (imageReceiver.v1 != null) {
        }
        String str3122222 = str7;
        if (hcVar6 != null) {
        }
        if (hcVar5 != null) {
        }
    }

    public final void N(String str, String str2) {
        kb kbVar = this.c;
        BitmapDrawable bitmapDrawable = (BitmapDrawable) kbVar.f(str);
        if (bitmapDrawable == null) {
            kbVar = this.b;
            bitmapDrawable = (BitmapDrawable) kbVar.f(str);
        }
        this.t.put(str, str2);
        if (bitmapDrawable != null) {
            BitmapDrawable bitmapDrawable2 = (BitmapDrawable) kbVar.f(str2);
            if (bitmapDrawable2 != null && bitmapDrawable2.getBitmap() != null && bitmapDrawable.getBitmap() != null) {
                Bitmap bitmap = bitmapDrawable2.getBitmap();
                Bitmap bitmap2 = bitmapDrawable.getBitmap();
                if (bitmap.getWidth() > bitmap2.getWidth() || bitmap.getHeight() > bitmap2.getHeight()) {
                    kbVar.n(str);
                }
            }
            this.F = str;
            kbVar.n(str);
            kbVar.l(str2, bitmapDrawable);
            this.F = null;
        }
        HashMap hashMap = this.a;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            hashMap.put(str2, num);
            hashMap.remove(str);
        }
    }

    public final void O(BitmapDrawable bitmapDrawable, String str, boolean z9) {
        if (str.endsWith("_nocache")) {
            return;
        }
        if (z9) {
            this.b.l(str, bitmapDrawable);
        } else {
            this.c.l(str, bitmapDrawable);
        }
    }

    public final void P(ArrayList arrayList) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            O(((cc) arrayList.get(i7)).a, ((cc) arrayList.get(i7)).b, true);
        }
    }

    public final void Q(String str) {
        this.a.remove(str);
        this.c.n(str);
        this.b.n(str);
    }

    public final void R(String str, String str2, hc hcVar, boolean z9) {
        if (z9) {
            g0.h3(new em(this, str, str2, hcVar, 9));
        } else {
            S(str, str2, hcVar);
        }
    }

    public final void S(String str, String str2, hc hcVar) {
        for (int i7 = 0; i7 < 2; i7++) {
            ArrayList arrayList = null;
            if (i7 == 0) {
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
            int i10 = qs.m4;
            if (arrayList != null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    String str3 = (String) arrayList.get(i11);
                    String D = a8.p0.D(str, "@", str3);
                    String str4 = str2 + "@" + str3;
                    N(D, str4);
                    qs.e().k(i10, D, str4, hcVar);
                }
            } else {
                N(str, str2);
                qs.e().k(i10, str, str2, hcVar);
            }
        }
    }

    public final void T(boolean z9) {
        if (z9) {
            this.y--;
        }
        while (this.y < 4) {
            LinkedList linkedList = this.o;
            if (linkedList.isEmpty()) {
                return;
            }
            try {
                ((tb) linkedList.poll()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                this.y++;
            } catch (Throwable unused) {
                T(false);
            }
        }
    }

    public final void U(xb xbVar, int i7) {
        g0.h3(new l7(this, xbVar, i7, 4));
    }

    public final void V(boolean z9) {
        if (z9) {
            this.x--;
        }
        while (this.x < 4) {
            LinkedList linkedList = this.n;
            if (linkedList.isEmpty()) {
                return;
            }
            bc bcVar = (bc) linkedList.poll();
            if (bcVar != null) {
                bcVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                this.x++;
            }
        }
    }

    public final void e(String str, m20 m20Var) {
        if (str == null || m20Var == null) {
            return;
        }
        this.A.put(str, m20Var);
    }

    public final void g(String str) {
        HashMap hashMap = this.C;
        xb xbVar = (xb) hashMap.get(str);
        if (xbVar != null) {
            xbVar.cancel(true);
            hashMap.remove(str);
            this.B.remove(xbVar);
        }
        Runnable runnable = (Runnable) this.D.get(str);
        if (runnable != null) {
            g0.r(runnable);
        }
        U(null, 0);
    }

    public final void h(ImageReceiver imageReceiver, boolean z9) {
        ArrayList arrayList = imageReceiver.w1;
        HashMap hashMap = org.telegram.ui.web.w1.f;
        if (hashMap != null) {
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                ArrayList arrayList2 = (ArrayList) entry.getValue();
                int i7 = 0;
                while (true) {
                    if (i7 >= arrayList2.size()) {
                        break;
                    }
                    if (((Pair) arrayList2.get(i7)).first == imageReceiver) {
                        arrayList2.remove(i7);
                        break;
                    }
                    i7++;
                }
                if (arrayList2.isEmpty()) {
                    org.telegram.ui.web.w1.f.remove(str);
                    break;
                }
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        p5 p5Var = this.s;
        if (!isEmpty) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                p5Var.a((Runnable) arrayList.get(i10));
            }
            arrayList.clear();
        }
        arrayList.add(null);
        p5Var.c(new yf(this, z9, imageReceiver, 5));
    }

    public final void i(Runnable runnable) {
        ((of.a) this.p.b).execute(new x4(15, this, runnable));
    }

    public final void j() {
        this.b.r(-1, null);
        this.c.r(-1, null);
        this.e.r(-1, null);
    }

    public final void k(final ImageReceiver imageReceiver, final String str, final String str2, final String str3, final hc hcVar, final String str4, final long j3, final int i7, final int i10, final int i11, final int i12) {
        if (str2 == null || str == null || hcVar == null) {
            return;
        }
        int G = imageReceiver.G(i10);
        if (G == 0) {
            G = this.G;
            if (i10 == 1) {
                imageReceiver.Z = G;
            } else if (i10 == 3) {
                imageReceiver.i0 = G;
            } else {
                imageReceiver.R = G;
            }
            int i13 = G + 1;
            this.G = i13;
            if (i13 == Integer.MAX_VALUE) {
                this.G = 0;
            }
        }
        final int i14 = G;
        final boolean z9 = imageReceiver.F0;
        final Object obj = imageReceiver.h;
        final TLRPC.Document document = imageReceiver.H0;
        final boolean z10 = imageReceiver.G0;
        final int i15 = imageReceiver.d;
        final boolean z11 = i10 == 0 && imageReceiver.I0;
        Runnable runnable = new Runnable() { // from class: org.telegram.messenger.jb
            /* JADX WARN: Code restructure failed: missing block: B:274:0x058b, code lost:
            
                if (r1.equals(r7) != false) goto L272;
             */
            /* JADX WARN: Code restructure failed: missing block: B:280:0x0598, code lost:
            
                if (r15.exists() == false) goto L280;
             */
            /* JADX WARN: Removed duplicated region for block: B:13:0x00c1 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:142:0x079f  */
            /* JADX WARN: Removed duplicated region for block: B:144:0x07a7  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x00cf A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:287:0x0639  */
            /* JADX WARN: Removed duplicated region for block: B:296:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:320:0x0226  */
            /* JADX WARN: Removed duplicated region for block: B:324:0x0236  */
            /* JADX WARN: Removed duplicated region for block: B:326:0x023a  */
            /* JADX WARN: Removed duplicated region for block: B:339:0x028e  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x02ba  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x034b  */
            /* JADX WARN: Removed duplicated region for block: B:88:0x066c  */
            /* JADX WARN: Removed duplicated region for block: B:91:0x0671  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x0694 A[ADDED_TO_REGION] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                boolean z12;
                long j10;
                boolean z13;
                String str5;
                String str6;
                String str7;
                int i16;
                int i17;
                String str8;
                Object obj2;
                String str9;
                File file;
                boolean z14;
                boolean z15;
                String str10;
                int i18;
                TLRPC.Document document2;
                File file2;
                File file3;
                boolean z16;
                File file4;
                String str11;
                gc gcVar;
                int i19;
                ImageReceiver imageReceiver2;
                String str12;
                int i20;
                String str13;
                long j11;
                File file5;
                boolean z17;
                int i21;
                int i22;
                String str14;
                String str15;
                boolean z18;
                File file6;
                long j12;
                String str16;
                boolean z19;
                int i23;
                String str17;
                String str18;
                File file7;
                File file8;
                ub ubVar;
                gc gcVar2 = gc.this;
                int i24 = i11;
                String str19 = str2;
                String str20 = str;
                int i25 = i14;
                ImageReceiver imageReceiver3 = imageReceiver;
                int i26 = i12;
                String str21 = str4;
                int i27 = i10;
                hc hcVar2 = hcVar;
                boolean z20 = z11;
                Object obj3 = obj;
                int i28 = i15;
                TLRPC.Document document3 = document;
                boolean z21 = z9;
                boolean z22 = z10;
                String str22 = str3;
                int i29 = i7;
                long j13 = j3;
                if (i24 != 2) {
                    ub ubVar2 = (ub) gcVar2.g.get(str19);
                    z12 = z21;
                    ub ubVar3 = (ub) gcVar2.i.get(str20);
                    ub ubVar4 = (ub) gcVar2.k.get(i25);
                    if (ubVar4 != null) {
                        j10 = j13;
                        if (ubVar4 == ubVar3) {
                            int indexOf = ubVar4.v.indexOf(imageReceiver3);
                            if (indexOf != -1) {
                                ubVar4.w.set(indexOf, Integer.valueOf(i26));
                            }
                        } else if (ubVar4 != ubVar2) {
                            ubVar = ubVar2;
                            ubVar4.b(imageReceiver3);
                        } else if (ubVar3 == null) {
                            ArrayList arrayList = ubVar4.v;
                            ubVar = ubVar2;
                            int indexOf2 = arrayList.indexOf(imageReceiver3);
                            if (indexOf2 != -1 && (((Integer) ubVar4.z.get(indexOf2)).intValue() == i27 || (indexOf2 = arrayList.subList(indexOf2 + 1, arrayList.size()).indexOf(imageReceiver3)) != -1)) {
                                ubVar4.w.set(indexOf2, Integer.valueOf(i26));
                                ubVar4.x.set(indexOf2, str20);
                                ubVar4.y.set(indexOf2, str21);
                            }
                            z13 = true;
                            if (!z13 || ubVar3 == null) {
                                i26 = i26;
                            } else {
                                i26 = i26;
                                ubVar3.a(imageReceiver3, str20, str21, i27, i26);
                                z13 = true;
                            }
                            if (!z13 && ubVar != null) {
                                ubVar.a(imageReceiver3, str20, str21, i27, i26);
                                z13 = true;
                            }
                        }
                        ubVar = ubVar2;
                        z13 = true;
                        if (z13) {
                        }
                        i26 = i26;
                        if (!z13) {
                            ubVar.a(imageReceiver3, str20, str21, i27, i26);
                            z13 = true;
                        }
                    } else {
                        ubVar = ubVar2;
                        j10 = j13;
                    }
                    z13 = false;
                    if (z13) {
                    }
                    i26 = i26;
                    if (!z13) {
                    }
                } else {
                    z12 = z21;
                    j10 = j13;
                    z13 = false;
                }
                if (z13) {
                    return;
                }
                String str23 = hcVar2.g;
                if (str23 != null) {
                    if (str23.startsWith("http") || str23.startsWith("athumb")) {
                        z14 = false;
                        file = null;
                    } else if (str23.startsWith("thumb://")) {
                        int indexOf3 = str23.indexOf(":", 8);
                        if (indexOf3 >= 0) {
                            file = new File(str23.substring(indexOf3 + 1));
                            z14 = true;
                        }
                        file = null;
                        z14 = true;
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
                        z14 = true;
                    }
                    str5 = str19;
                    str6 = "_";
                    str7 = str20;
                    i16 = i27;
                    i17 = i26;
                    str8 = str22;
                    obj2 = obj3;
                    str9 = "athumb";
                } else if (i24 == 0 && z20) {
                    if (obj3 instanceof ij) {
                        ij ijVar = (ij) obj3;
                        TLRPC.Document F0 = ijVar.F0();
                        i17 = i26;
                        String str24 = ijVar.k.attachPath;
                        w7.G(i28);
                        str9 = "athumb";
                        file2 = w7.M(ijVar.k, false, true);
                        str10 = str24;
                        i18 = ij.L4(ijVar.k) ? 2 : ij.R4(ijVar.k) ? 1 : ij.n1(ijVar.k) instanceof TLRPC.TL_messageMediaDocument ? 3 : ij.n1(ijVar.k) instanceof TLRPC.TL_messageMediaPhoto ? 0 : 4;
                        document2 = F0;
                        z15 = false;
                    } else {
                        i17 = i26;
                        str9 = "athumb";
                        if (document3 != null) {
                            w7.G(i28);
                            File J2 = w7.J(document3, null, true, true);
                            int i30 = ij.K4(document3) ? 2 : 3;
                            document2 = document3;
                            file2 = J2;
                            z15 = true;
                            i18 = i30;
                            str10 = null;
                        } else {
                            z15 = false;
                            str10 = null;
                            i18 = 0;
                            document2 = null;
                            file2 = null;
                        }
                    }
                    if (document2 != null) {
                        if (z12) {
                            obj2 = obj3;
                            str7 = str20;
                            File z23 = w7.z(4);
                            i16 = i27;
                            str5 = str19;
                            StringBuilder sb2 = new StringBuilder("q_");
                            sb2.append(document2.dc_id);
                            sb2.append("_");
                            str6 = "_";
                            str8 = str22;
                            file3 = new File(z23, a8.p0.r(sb2, document2.id, ".jpg"));
                            if (file3.exists()) {
                                z16 = true;
                                if (!TextUtils.isEmpty(str10)) {
                                    File file9 = new File(str10);
                                    if (file9.exists()) {
                                        file4 = file9;
                                        if (file4 == null) {
                                            file4 = file2;
                                        }
                                        if (file3 == null) {
                                            String r10 = w7.r(null, document2);
                                            ec ecVar = (ec) gcVar2.l.get(r10);
                                            if (ecVar == null) {
                                                ecVar = new ec();
                                                ecVar.c = new ArrayList();
                                                ecVar.d = new ArrayList();
                                                ecVar.a = document2;
                                                ecVar.b = str21;
                                                ecVar.e = z15;
                                                gcVar2.l.put(r10, ecVar);
                                            }
                                            if (!ecVar.c.contains(imageReceiver3)) {
                                                ecVar.c.add(imageReceiver3);
                                                ecVar.d.add(Integer.valueOf(i17));
                                            }
                                            gcVar2.m.put(i25, r10);
                                            if (file4.exists() && z22) {
                                                gcVar2.v(i18, file4, ecVar);
                                                return;
                                            }
                                            return;
                                        }
                                        file = file3;
                                        z14 = true;
                                        if (i24 != 2) {
                                            return;
                                        }
                                        boolean z24 = hcVar2.c != null;
                                        ub ubVar5 = new ub(gcVar2);
                                        ubVar5.a = imageReceiver3.w == 0 ? 0 : 1;
                                        if (!z20) {
                                            int i31 = 2;
                                            if (hcVar2.p == 2) {
                                                str11 = str8;
                                            } else if (ij.r3(hcVar2.v) || ij.s3(hcVar2.i, false) || ij.i4(hcVar2.i) || ij.N4(hcVar2.i)) {
                                                str11 = str8;
                                                i31 = 2;
                                            } else {
                                                String str25 = hcVar2.g;
                                                if (str25 != null && !str25.startsWith("vthumb") && !str25.startsWith("thumb")) {
                                                    String B = gc.B(str25, "jpg");
                                                    if (B.equalsIgnoreCase("webm") || B.equalsIgnoreCase("mp4") || B.equalsIgnoreCase("gif")) {
                                                        str11 = str8;
                                                        ubVar5.l = 2;
                                                    } else {
                                                        str11 = str8;
                                                        if ("tgs".equals(str11)) {
                                                            ubVar5.l = 1;
                                                        }
                                                    }
                                                    if (file == null) {
                                                        TLRPC.PhotoSize photoSize = hcVar2.k;
                                                        j11 = 0;
                                                        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                                                            gcVar = gcVar2;
                                                            i19 = i24;
                                                            imageReceiver2 = imageReceiver3;
                                                            str14 = "gl";
                                                            str12 = str11;
                                                            i20 = i29;
                                                            str13 = str5;
                                                            str15 = str6;
                                                            z18 = z16;
                                                            file6 = file;
                                                            j12 = 0;
                                                            z17 = true;
                                                        } else {
                                                            ew ewVar = hcVar2.h;
                                                            if (ewVar != null) {
                                                                ubVar5.h = ewVar;
                                                                boolean z25 = ewVar.b.dc_id == Integer.MIN_VALUE;
                                                                str13 = str5;
                                                                gcVar = gcVar2;
                                                                i19 = i24;
                                                                z18 = z16;
                                                                imageReceiver2 = imageReceiver3;
                                                                str14 = "gl";
                                                                str12 = str11;
                                                                file6 = new File(w7.z(4), str13);
                                                                j12 = 0;
                                                                i20 = i29;
                                                                str15 = str6;
                                                                z17 = z25;
                                                            } else {
                                                                str13 = str5;
                                                                boolean z26 = z14;
                                                                i19 = i24;
                                                                z18 = z16;
                                                                if ("g".equals(str21) || "gl".equals(str21) || gc.I(str21) || (i29 == 0 && j10 > 0 && hcVar2.g == null && !z24)) {
                                                                    imageReceiver2 = imageReceiver3;
                                                                    TLRPC.Document document4 = hcVar2.i;
                                                                    if (document4 != null) {
                                                                        if (document4 instanceof TLRPC.TL_documentEncrypted) {
                                                                            gcVar = gcVar2;
                                                                            file7 = new File(w7.z(4), str13);
                                                                        } else {
                                                                            gcVar = gcVar2;
                                                                            file7 = ij.K4(document4) ? new File(w7.z(2), str13) : new File(w7.z(3), str13);
                                                                        }
                                                                        if ((gc.I(str21) || "g".equals(str21) || "gl".equals(str21)) && !file7.exists()) {
                                                                            File z27 = w7.z(4);
                                                                            str12 = str11;
                                                                            StringBuilder sb3 = new StringBuilder();
                                                                            str14 = "gl";
                                                                            sb3.append(document4.dc_id);
                                                                            str15 = str6;
                                                                            sb3.append(str15);
                                                                            str17 = str21;
                                                                            i23 = i29;
                                                                            file8 = new File(z27, a8.p0.r(sb3, document4.id, ".temp"));
                                                                        } else {
                                                                            i23 = i29;
                                                                            str14 = "gl";
                                                                            str12 = str11;
                                                                            str15 = str6;
                                                                            str17 = str21;
                                                                            file8 = file7;
                                                                        }
                                                                        if (document4 instanceof s5) {
                                                                            if (((s5) document4).b == null) {
                                                                                z26 = true;
                                                                            }
                                                                            ubVar5.l = 5;
                                                                        } else if ("application/x-tgsdice".equals(hcVar2.i.mime_type)) {
                                                                            ubVar5.l = 1;
                                                                            z26 = true;
                                                                        } else if ("application/x-tgsticker".equals(document4.mime_type)) {
                                                                            ubVar5.l = 1;
                                                                        } else {
                                                                            if ("application/x-tgwallpattern".equals(document4.mime_type)) {
                                                                                ubVar5.l = 3;
                                                                            } else if (w7.B(hcVar2.i).endsWith(".svg")) {
                                                                                ubVar5.l = 3;
                                                                            }
                                                                            j12 = document4.size;
                                                                            file6 = file8;
                                                                        }
                                                                        j12 = document4.size;
                                                                        file6 = file8;
                                                                    } else {
                                                                        gcVar = gcVar2;
                                                                        i23 = i29;
                                                                        str14 = "gl";
                                                                        str12 = str11;
                                                                        str15 = str6;
                                                                        str17 = str21;
                                                                        if (hcVar2.v != null) {
                                                                            file6 = new File(w7.z(3), str13);
                                                                            j12 = 0;
                                                                        } else {
                                                                            i20 = i23;
                                                                            File file10 = i20 == 1 ? new File(w7.z(4), str13) : new File(w7.z(0), str13);
                                                                            str21 = str17;
                                                                            if (gc.I(str17)) {
                                                                                str18 = str14;
                                                                            } else {
                                                                                if ("g".equals(str21)) {
                                                                                    str18 = str14;
                                                                                } else {
                                                                                    str18 = str14;
                                                                                }
                                                                                if (hcVar2.f != null) {
                                                                                }
                                                                                str14 = str18;
                                                                                file6 = file10;
                                                                                j12 = 0;
                                                                                z17 = z26;
                                                                            }
                                                                            File z28 = w7.z(4);
                                                                            StringBuilder sb4 = new StringBuilder();
                                                                            str14 = str18;
                                                                            sb4.append(hcVar2.f.volume_id);
                                                                            sb4.append(str15);
                                                                            file10 = new File(z28, a8.p0.n(hcVar2.f.local_id, ".temp", sb4));
                                                                            file6 = file10;
                                                                            j12 = 0;
                                                                            z17 = z26;
                                                                        }
                                                                    }
                                                                    z17 = z26;
                                                                    str21 = str17;
                                                                    i20 = i23;
                                                                } else {
                                                                    file6 = new File(w7.z(4), str13);
                                                                    if (file6.exists()) {
                                                                        imageReceiver2 = imageReceiver3;
                                                                        i20 = i29;
                                                                        z18 = true;
                                                                    } else {
                                                                        i20 = i29;
                                                                        if (i20 == 2) {
                                                                            imageReceiver2 = imageReceiver3;
                                                                            file6 = new File(w7.z(4), rf.b.r(str13, ".enc"));
                                                                        } else {
                                                                            imageReceiver2 = imageReceiver3;
                                                                        }
                                                                    }
                                                                    TLRPC.Document document5 = hcVar2.i;
                                                                    if (document5 != null) {
                                                                        if (document5 instanceof s5) {
                                                                            if (((s5) document5).b == null) {
                                                                                z26 = true;
                                                                            }
                                                                            ubVar5.l = 5;
                                                                        } else if ("application/x-tgsdice".equals(document5.mime_type)) {
                                                                            ubVar5.l = 1;
                                                                            gcVar = gcVar2;
                                                                            z17 = true;
                                                                            str14 = "gl";
                                                                            str12 = str11;
                                                                            j12 = 0;
                                                                            str15 = str6;
                                                                        } else if ("application/x-tgsticker".equals(hcVar2.i.mime_type)) {
                                                                            ubVar5.l = 1;
                                                                        } else if ("application/x-tgwallpattern".equals(hcVar2.i.mime_type)) {
                                                                            ubVar5.l = 3;
                                                                        } else if (w7.B(hcVar2.i).endsWith(".svg")) {
                                                                            ubVar5.l = 3;
                                                                        }
                                                                    }
                                                                    gcVar = gcVar2;
                                                                    str14 = "gl";
                                                                    str12 = str11;
                                                                    j12 = 0;
                                                                    z17 = z26;
                                                                    str15 = str6;
                                                                }
                                                            }
                                                        }
                                                        if (str21 != null) {
                                                            String[] split = str21.split(str15);
                                                            int i32 = 0;
                                                            while (i32 < split.length) {
                                                                if ("g".equals(split[i32])) {
                                                                    str16 = str14;
                                                                } else {
                                                                    str16 = str14;
                                                                    if (!str16.equals(split[i32]) && !"pframe".equals(split[i32])) {
                                                                        i32++;
                                                                        str14 = str16;
                                                                    }
                                                                }
                                                                z19 = true;
                                                            }
                                                        }
                                                        str16 = str14;
                                                        z19 = false;
                                                        if (z19 || gc.I(str21)) {
                                                            ubVar5.l = 2;
                                                            ubVar5.k = j12;
                                                            ubVar5.c = str21 != null && str21.endsWith("pframe");
                                                            if ("g".equals(str21) || str16.equals(str21) || gc.I(str21)) {
                                                                file5 = file6;
                                                                i21 = i16;
                                                                z16 = z18;
                                                                z17 = true;
                                                            }
                                                        }
                                                        file5 = file6;
                                                        i21 = i16;
                                                        z16 = z18;
                                                    } else {
                                                        boolean z29 = z14;
                                                        gcVar = gcVar2;
                                                        i19 = i24;
                                                        imageReceiver2 = imageReceiver3;
                                                        str12 = str11;
                                                        i20 = i29;
                                                        str13 = str5;
                                                        j11 = 0;
                                                        file5 = file;
                                                        z17 = z29;
                                                        i21 = i16;
                                                    }
                                                    ubVar5.m = i21;
                                                    String str26 = str7;
                                                    ubVar5.d = str26;
                                                    ubVar5.n = i20;
                                                    ubVar5.f = str21;
                                                    ubVar5.i = hcVar2;
                                                    String str27 = str12;
                                                    ubVar5.g = str27;
                                                    ubVar5.o = i28;
                                                    Object obj4 = obj2;
                                                    ubVar5.j = obj4;
                                                    i22 = hcVar2.p;
                                                    if (i22 != 0) {
                                                        ubVar5.l = i22;
                                                    }
                                                    if (i20 == 2) {
                                                        Pattern pattern = w7.I;
                                                        ubVar5.r = new File(t0.b.getCacheDir(), rf.b.r(str13, ".enc.key"));
                                                    }
                                                    int i33 = i20;
                                                    ImageReceiver imageReceiver4 = imageReceiver2;
                                                    ubVar5.a(imageReceiver4, str26, str21, i21, i17);
                                                    if (!z17 || z16 || file5.exists()) {
                                                        gc gcVar3 = gcVar;
                                                        ubVar5.p = file5;
                                                        ubVar5.i = hcVar2;
                                                        ubVar5.u = new vb(gcVar3, ubVar5);
                                                        gcVar3.i.put(str26, ubVar5);
                                                        gcVar3.j.add(gc.n(str26));
                                                        if (i19 != 0) {
                                                            gcVar3.q.c(ubVar5.u);
                                                            return;
                                                        }
                                                        com.google.android.gms.internal.cast.b0 b0Var = gcVar3.p;
                                                        Runnable runnable2 = ubVar5.u;
                                                        int i34 = ubVar5.a;
                                                        if (i34 != 1) {
                                                            b0Var.getClass();
                                                            runnable2 = new of.b(i34, runnable2);
                                                        }
                                                        ((of.a) b0Var.b).execute(runnable2);
                                                        ubVar5.b = runnable2;
                                                        return;
                                                    }
                                                    ubVar5.e = str13;
                                                    gc gcVar4 = gcVar;
                                                    gcVar4.g.put(str13, ubVar5);
                                                    if (ubVar5.c) {
                                                        gcVar4.h.put(str13, ubVar5);
                                                    }
                                                    String str28 = hcVar2.g;
                                                    if (str28 != null) {
                                                        ubVar5.q = new File(w7.z(4), rf.b.r(Utilities.a(str28), "_temp.jpg"));
                                                        ubVar5.p = file5;
                                                        if (hcVar2.g.startsWith(str9)) {
                                                            tb tbVar = new tb(gcVar4, ubVar5);
                                                            ubVar5.s = tbVar;
                                                            gcVar4.o.add(tbVar);
                                                            gcVar4.T(false);
                                                            return;
                                                        }
                                                        bc bcVar = new bc(gcVar4, ubVar5, j10);
                                                        ubVar5.t = bcVar;
                                                        gcVar4.n.add(bcVar);
                                                        gcVar4.V(false);
                                                        return;
                                                    }
                                                    long j14 = j10;
                                                    int i35 = i19 != 0 ? 3 : imageReceiver4.w;
                                                    if (hcVar2.f != null) {
                                                        w7.G(i28).V(hcVar2, obj4, str27, i35, (i33 != 0 || (j14 > j11 && hcVar2.c == null)) ? i33 : 1);
                                                    } else if (hcVar2.i != null) {
                                                        w7.G(i28).W(hcVar2.i, obj4, i35, i33);
                                                    } else if (hcVar2.h != null) {
                                                        w7 G2 = w7.G(i28);
                                                        ew ewVar2 = hcVar2.h;
                                                        if (ewVar2 != null) {
                                                            G2.X(null, ewVar2, null, null, null, null, null, 0L, i35, 1);
                                                        }
                                                    } else if (hcVar2.v != null) {
                                                        w7.G(i28).X(null, null, hcVar2.v, null, null, null, null, 0L, i35, i33);
                                                    }
                                                    if (imageReceiver4.r) {
                                                        gcVar4.w.put(ubVar5.d, 0);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            }
                                            ubVar5.l = i31;
                                            if (file == null) {
                                            }
                                            ubVar5.m = i21;
                                            String str262 = str7;
                                            ubVar5.d = str262;
                                            ubVar5.n = i20;
                                            ubVar5.f = str21;
                                            ubVar5.i = hcVar2;
                                            String str272 = str12;
                                            ubVar5.g = str272;
                                            ubVar5.o = i28;
                                            Object obj42 = obj2;
                                            ubVar5.j = obj42;
                                            i22 = hcVar2.p;
                                            if (i22 != 0) {
                                            }
                                            if (i20 == 2) {
                                            }
                                            int i332 = i20;
                                            ImageReceiver imageReceiver42 = imageReceiver2;
                                            ubVar5.a(imageReceiver42, str262, str21, i21, i17);
                                            if (z17) {
                                            }
                                            gc gcVar32 = gcVar;
                                            ubVar5.p = file5;
                                            ubVar5.i = hcVar2;
                                            ubVar5.u = new vb(gcVar32, ubVar5);
                                            gcVar32.i.put(str262, ubVar5);
                                            gcVar32.j.add(gc.n(str262));
                                            if (i19 != 0) {
                                            }
                                        }
                                        str11 = str8;
                                        if (file == null) {
                                        }
                                        ubVar5.m = i21;
                                        String str2622 = str7;
                                        ubVar5.d = str2622;
                                        ubVar5.n = i20;
                                        ubVar5.f = str21;
                                        ubVar5.i = hcVar2;
                                        String str2722 = str12;
                                        ubVar5.g = str2722;
                                        ubVar5.o = i28;
                                        Object obj422 = obj2;
                                        ubVar5.j = obj422;
                                        i22 = hcVar2.p;
                                        if (i22 != 0) {
                                        }
                                        if (i20 == 2) {
                                        }
                                        int i3322 = i20;
                                        ImageReceiver imageReceiver422 = imageReceiver2;
                                        ubVar5.a(imageReceiver422, str2622, str21, i21, i17);
                                        if (z17) {
                                        }
                                        gc gcVar322 = gcVar;
                                        ubVar5.p = file5;
                                        ubVar5.i = hcVar2;
                                        ubVar5.u = new vb(gcVar322, ubVar5);
                                        gcVar322.i.put(str2622, ubVar5);
                                        gcVar322.j.add(gc.n(str2622));
                                        if (i19 != 0) {
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
                            i16 = i27;
                            str8 = str22;
                            obj2 = obj3;
                        }
                        z16 = false;
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
                        i16 = i27;
                        str8 = str22;
                        obj2 = obj3;
                        file = null;
                        z14 = true;
                    }
                } else {
                    str5 = str19;
                    str6 = "_";
                    str7 = str20;
                    i16 = i27;
                    i17 = i26;
                    str8 = str22;
                    obj2 = obj3;
                    str9 = "athumb";
                    file = null;
                    z14 = false;
                }
                z16 = false;
                if (i24 != 2) {
                }
            }
        };
        this.s.d(runnable, imageReceiver.w == 0 ? 0L : 1L);
        imageReceiver.w1.add(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x0159, code lost:
    
        if (r2.canWrite() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0153, code lost:
    
        if (r2.mkdirs() != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03cc A[Catch: Exception -> 0x03df, TRY_LEAVE, TryCatch #11 {Exception -> 0x03df, blocks: (B:100:0x03af, B:102:0x03bd, B:104:0x03c3, B:106:0x03cc), top: B:99:0x03af, outer: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0208 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018f A[Catch: Exception -> 0x009f, TryCatch #12 {Exception -> 0x009f, blocks: (B:8:0x0047, B:10:0x0053, B:12:0x0061, B:16:0x006e, B:18:0x009c, B:21:0x00a2, B:23:0x00ae, B:26:0x00b7, B:28:0x00ba, B:32:0x00db, B:33:0x00bf, B:37:0x00de, B:201:0x011f, B:46:0x0182, B:48:0x018f, B:51:0x0198, B:53:0x019b, B:57:0x01af, B:58:0x01a0, B:60:0x01a5, B:61:0x01aa, B:65:0x01b4, B:66:0x01b9, B:68:0x01bf, B:69:0x01c6, B:71:0x01cd, B:73:0x01d5, B:75:0x01dd, B:78:0x01e9, B:80:0x01f4, B:84:0x01f7, B:171:0x0370, B:173:0x032f, B:175:0x02ee, B:177:0x02ad, B:179:0x026d, B:88:0x0375, B:109:0x03e0, B:111:0x03ac, B:112:0x03ed, B:181:0x0239, B:204:0x011c, B:40:0x012d, B:42:0x0135, B:45:0x017a, B:182:0x0142, B:184:0x0148, B:187:0x0155, B:189:0x015b, B:190:0x014f, B:211:0x03e4, B:213:0x03e8, B:162:0x0332, B:164:0x0344, B:166:0x034b, B:168:0x035a, B:153:0x02f1, B:155:0x0303, B:157:0x030a, B:159:0x0319, B:144:0x02b0, B:146:0x02c2, B:148:0x02c9, B:150:0x02d8, B:135:0x0270, B:137:0x0282, B:139:0x0288, B:141:0x0297, B:126:0x023c, B:128:0x024c, B:130:0x0252, B:132:0x0259, B:91:0x037b, B:93:0x0389, B:95:0x038f, B:97:0x0398, B:117:0x0208, B:119:0x0218, B:121:0x021e, B:123:0x0225, B:100:0x03af, B:102:0x03bd, B:104:0x03c3, B:106:0x03cc), top: B:7:0x0047, inners: #1, #2, #3, #4, #5, #6, #7, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0398 A[Catch: Exception -> 0x03ab, TRY_LEAVE, TryCatch #6 {Exception -> 0x03ab, blocks: (B:91:0x037b, B:93:0x0389, B:95:0x038f, B:97:0x0398), top: B:90:0x037b, outer: #12 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SparseArray l() {
        File file;
        File file2;
        File file3;
        File[] externalFilesDirs;
        SparseArray sparseArray = new SparseArray();
        File E0 = g0.E0();
        if (!E0.isDirectory()) {
            try {
                E0.mkdirs();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        g0.G(new File(E0, ".nomedia"));
        sparseArray.put(4, E0);
        if (r2.a) {
            a8.b("cache path = " + E0);
        }
        org.telegram.ui.Cells.f1.u(iz.h0, new StringBuilder("selected SD card = "));
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                ArrayList arrayList = null;
                if (!TextUtils.isEmpty(iz.h0)) {
                    ArrayList d12 = g0.d1();
                    int size = d12.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size) {
                            break;
                        }
                        File file4 = (File) d12.get(i7);
                        a8.b("root dir " + i7 + " " + file4);
                        if (file4.getAbsolutePath().startsWith(iz.h0)) {
                            externalStorageDirectory = file4;
                            break;
                        }
                        i7++;
                    }
                    if (!externalStorageDirectory.getAbsolutePath().startsWith(iz.h0) && (externalFilesDirs = t0.b.getExternalFilesDirs(null)) != null) {
                        for (int i10 = 0; i10 < externalFilesDirs.length; i10++) {
                            if (externalFilesDirs[i10] != null) {
                                a8.b("dirsDebug " + i10 + " " + externalFilesDirs[i10]);
                            }
                        }
                    }
                }
                a8.b("external storage = " + externalStorageDirectory);
                if (Build.VERSION.SDK_INT >= 30) {
                    try {
                        if (t0.b.getExternalMediaDirs().length > 0) {
                            File E = E();
                            try {
                                file = new File(E, "Telegram");
                                try {
                                    file.mkdirs();
                                } catch (Exception e11) {
                                    e = e11;
                                    a8.g(e, true);
                                    this.H = new File(t0.b.getExternalFilesDir(null), "Telegram");
                                    this.H.mkdirs();
                                    if (!this.H.isDirectory()) {
                                    }
                                    if (this.H.isDirectory()) {
                                    }
                                    if (file != null) {
                                        try {
                                            file3 = new File(file, "Telegram Images");
                                            file3.mkdir();
                                            if (file3.isDirectory()) {
                                                sparseArray.put(100, file3);
                                                if (r2.a) {
                                                }
                                            }
                                        } catch (Exception e12) {
                                            a8.g(e12, true);
                                        }
                                        try {
                                            file2 = new File(file, "Telegram Video");
                                            file2.mkdir();
                                            if (file2.isDirectory()) {
                                                sparseArray.put(101, file2);
                                                if (r2.a) {
                                                }
                                            }
                                        } catch (Exception e13) {
                                            a8.g(e13, true);
                                        }
                                    }
                                    Utilities.e.c(new rc(9));
                                    return sparseArray;
                                }
                            } catch (Exception e14) {
                                file = E;
                                e = e14;
                            }
                        } else {
                            file = null;
                        }
                    } catch (Exception e15) {
                        e = e15;
                        file = null;
                    }
                    this.H = new File(t0.b.getExternalFilesDir(null), "Telegram");
                } else {
                    if (TextUtils.isEmpty(iz.h0) || !externalStorageDirectory.getAbsolutePath().startsWith(iz.h0)) {
                        if (externalStorageDirectory.exists()) {
                            if (externalStorageDirectory.isDirectory()) {
                            }
                            a8.b("can't write to this directory = " + externalStorageDirectory + " use files dir");
                            externalStorageDirectory = t0.b.getExternalFilesDir(null);
                        }
                    }
                    this.H = new File(externalStorageDirectory, "Telegram");
                    file = null;
                }
                this.H.mkdirs();
                if (!this.H.isDirectory()) {
                    File[] externalFilesDirs2 = t0.b.getExternalFilesDirs(null);
                    if (externalFilesDirs2 != null) {
                        for (int i11 = 0; i11 < externalFilesDirs2.length; i11++) {
                            File file5 = externalFilesDirs2[i11];
                            if (file5 != null) {
                                file5.getAbsolutePath();
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(externalFilesDirs2[i11]);
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
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        File file6 = (File) arrayList.get(i12);
                        if (file6 != null && !TextUtils.isEmpty(iz.h0) && file6.getAbsolutePath().startsWith(iz.h0)) {
                            File file7 = new File(file6, "Telegram");
                            this.H = file7;
                            file7.mkdirs();
                            break;
                        }
                        i12++;
                    }
                }
                if (this.H.isDirectory()) {
                    try {
                        File file8 = new File(this.H, "Telegram Images");
                        file8.mkdir();
                        if (file8.isDirectory() && f(E0, file8, 0)) {
                            sparseArray.put(0, file8);
                            if (r2.a) {
                                a8.b("image path = " + file8);
                            }
                        }
                    } catch (Exception e16) {
                        a8.g(e16, true);
                    }
                    try {
                        File file9 = new File(this.H, "Telegram Video");
                        file9.mkdir();
                        if (file9.isDirectory() && f(E0, file9, 2)) {
                            sparseArray.put(2, file9);
                            if (r2.a) {
                                a8.b("video path = " + file9);
                            }
                        }
                    } catch (Exception e17) {
                        a8.g(e17, true);
                    }
                    try {
                        File file10 = new File(this.H, "Telegram Audio");
                        file10.mkdir();
                        if (file10.isDirectory() && f(E0, file10, 1)) {
                            g0.G(new File(file10, ".nomedia"));
                            sparseArray.put(1, file10);
                            if (r2.a) {
                                a8.b("audio path = " + file10);
                            }
                        }
                    } catch (Exception e18) {
                        a8.g(e18, true);
                    }
                    try {
                        File file11 = new File(this.H, "Telegram Documents");
                        file11.mkdir();
                        if (file11.isDirectory() && f(E0, file11, 3)) {
                            g0.G(new File(file11, ".nomedia"));
                            sparseArray.put(3, file11);
                            if (r2.a) {
                                a8.b("documents path = " + file11);
                            }
                        }
                    } catch (Exception e19) {
                        a8.g(e19, true);
                    }
                    try {
                        File file12 = new File(this.H, "Telegram Files");
                        file12.mkdir();
                        if (file12.isDirectory() && f(E0, file12, 5)) {
                            g0.G(new File(file12, ".nomedia"));
                            sparseArray.put(5, file12);
                            if (r2.a) {
                                a8.b("files path = " + file12);
                            }
                        }
                    } catch (Exception e20) {
                        a8.g(e20, true);
                    }
                    try {
                        File file13 = new File(this.H, "Telegram Stories");
                        file13.mkdir();
                        if (file13.isDirectory() && f(E0, file13, 6)) {
                            g0.G(new File(file13, ".nomedia"));
                            sparseArray.put(6, file13);
                            if (r2.a) {
                                a8.b("stories path = " + file13);
                            }
                        }
                    } catch (Exception e21) {
                        a8.g(e21, true);
                    }
                }
                if (file != null && file.isDirectory()) {
                    file3 = new File(file, "Telegram Images");
                    file3.mkdir();
                    if (file3.isDirectory() && f(E0, file3, 0)) {
                        sparseArray.put(100, file3);
                        if (r2.a) {
                            a8.b("image path = " + file3);
                        }
                    }
                    file2 = new File(file, "Telegram Video");
                    file2.mkdir();
                    if (file2.isDirectory() && f(E0, file2, 2)) {
                        sparseArray.put(101, file2);
                        if (r2.a) {
                            a8.b("video path = " + file2);
                        }
                    }
                }
            } else if (r2.a) {
                a8.b("this Android can't rename files");
            }
            Utilities.e.c(new rc(9));
        } catch (Exception e22) {
            a8.g(e22, true);
        }
        return sparseArray;
    }

    public final boolean p(String str) {
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

    public final void v(int i7, File file, ec ecVar) {
        if ((i7 == 0 || i7 == 2 || i7 == 3) && file != null) {
            if (((fc) this.v.get(w7.r(null, ecVar.a))) == null) {
                this.r.c(new fc(this, i7, file, ecVar));
            }
        }
    }

    public final Float w(String str) {
        long[] jArr;
        if (str == null || (jArr = (long[]) this.u.get(str)) == null) {
            return null;
        }
        long j3 = jArr[1];
        return j3 == 0 ? Float.valueOf(0.0f) : Float.valueOf(Math.min(1.0f, jArr[0] / j3));
    }

    public final long[] x(String str) {
        if (str == null) {
            return null;
        }
        return (long[]) this.u.get(str);
    }

    public final BitmapDrawable y(String str) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) this.e.f(str);
        if (!(bitmapDrawable instanceof org.telegram.ui.Components.v5)) {
            return bitmapDrawable;
        }
        org.telegram.ui.Components.v5 v5Var = (org.telegram.ui.Components.v5) bitmapDrawable;
        if (!v5Var.c0 && v5Var.G0 < 15) {
            return bitmapDrawable;
        }
        this.e.n(str);
        return null;
    }

    public final BitmapDrawable z(String str) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) this.c.f(str);
        if (bitmapDrawable == null) {
            bitmapDrawable = (BitmapDrawable) this.b.f(str);
        }
        if (bitmapDrawable == null) {
            bitmapDrawable = (BitmapDrawable) this.d.f(str);
        }
        return bitmapDrawable == null ? y(str) : bitmapDrawable;
    }
}
