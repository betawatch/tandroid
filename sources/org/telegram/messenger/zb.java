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
import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class zb {
    public static Bitmap M;
    public final ConcurrentHashMap A;
    public final LinkedList B;
    public final HashMap C;
    public final HashMap D;
    public int E;
    public String F;
    public int G;
    public File H;
    public final db b;
    public final db c;
    public final db d;
    public final db e;
    public final com.google.android.gms.internal.cast.c0 p;
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
    public static volatile zb N = null;
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

    public zb() {
        com.google.android.gms.internal.cast.c0 c0Var = new com.google.android.gms.internal.cast.c0(2);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c0Var.b = new lf.a(c0Var, new PriorityBlockingQueue(10, new b5.b(4)));
        this.p = c0Var;
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
        boolean z10 = memoryClass >= 192;
        this.z = z10;
        int min = Math.min(z10 ? 30 : 15, memoryClass / 7) * TLObject.FLAG_20;
        float f10 = min;
        this.c = new db(this, (int) (0.8f * f10), 0);
        this.b = new db(this, (int) (f10 * 0.2f), 1);
        this.d = new db(this, min / 4, 2);
        this.e = new db(this);
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
        for (int i3 = 0; i3 < 4; i3++) {
            w7.G(i3).F = new jb(this, i3);
        }
        w7.L = sparseArray;
        androidx.mediarouter.app.f fVar = new androidx.mediarouter.app.f(this, 8);
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

    public static zb D() {
        zb zbVar;
        zb zbVar2 = N;
        if (zbVar2 != null) {
            return zbVar2;
        }
        synchronized (zb.class) {
            try {
                zbVar = N;
                if (zbVar == null) {
                    zbVar = new zb();
                    N = zbVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zbVar;
    }

    public static File E() {
        File file = t0.b.getExternalMediaDirs()[0];
        if (!TextUtils.isEmpty(az.h0)) {
            for (int i3 = 0; i3 < t0.b.getExternalMediaDirs().length; i3++) {
                File file2 = t0.b.getExternalMediaDirs()[i3];
                if (file2 != null && file2.getPath().startsWith(az.h0)) {
                    file = t0.b.getExternalMediaDirs()[i3];
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
            byte[] bArr2 = sr.c;
            byte[] bArr3 = sr.d;
            int i3 = length + 622;
            ThreadLocal threadLocal = I;
            byte[] bArr4 = (byte[]) threadLocal.get();
            if (bArr4 == null || bArr4.length < i3) {
                bArr4 = null;
            }
            if (bArr4 == null) {
                bArr4 = new byte[i3];
                threadLocal.set(bArr4);
            }
            System.arraycopy(bArr2, 0, bArr4, 0, 623);
            System.arraycopy(bArr, 3, bArr4, 623, bArr.length - 3);
            System.arraycopy(bArr3, 0, bArr4, bArr.length + 620, 2);
            bArr4[164] = bArr[1];
            bArr4[166] = bArr[2];
            BitmapFactory.Options options = new BitmapFactory.Options();
            boolean z10 = !TextUtils.isEmpty(str) && str.contains("r");
            if (!az.j() && !z10) {
                config = Bitmap.Config.RGB_565;
                options.inPreferredConfig = config;
                decodeByteArray = BitmapFactory.decodeByteArray(bArr4, 0, i3, options);
                if (decodeByteArray != null) {
                    return G();
                }
                if (z10) {
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
            decodeByteArray = BitmapFactory.decodeByteArray(bArr4, 0, i3, options);
            if (decodeByteArray != null) {
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            return G();
        }
    }

    public static synchronized Bitmap G() {
        Bitmap bitmap;
        synchronized (zb.class) {
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
    public static Bitmap K(String str, Uri uri, float f10, float f11, boolean z10) {
        String str2;
        InputStream openInputStream;
        float max;
        int i3;
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
                    max = z10 ? Math.max(f13, f14) : Math.min(f13, f14);
                    if (max < 1.0f) {
                        max = 1.0f;
                    }
                    options.inJustDecodeBounds = false;
                    i3 = (int) max;
                    options.inSampleSize = i3;
                    if (i3 % 2 != 0) {
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
            if (z10) {
            }
            if (max < 1.0f) {
            }
            options.inJustDecodeBounds = false;
            i3 = (int) max;
            options.inSampleSize = i3;
            if (i3 % 2 != 0) {
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
        if (z10) {
        }
        if (max < 1.0f) {
        }
        options.inJustDecodeBounds = false;
        i3 = (int) max;
        options.inSampleSize = i3;
        if (i3 % 2 != 0) {
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
        boolean z10;
        TLRPC.PhotoSize tL_photoSize_layer127;
        TLRPC.MessageMedia messageMedia;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        byte[] bArr2;
        TLRPC.FileLocation fileLocation;
        File K2;
        int i3;
        TLRPC.PhotoSize tL_photoSize_layer1272;
        TLRPC.MessageMedia messageMedia3 = message.media;
        if (messageMedia3 == null) {
            return;
        }
        long j10 = -2147483648L;
        int i10 = 50;
        int i11 = 0;
        if (!(messageMedia3 instanceof TLRPC.TL_messageMediaPaidMedia)) {
            TLRPC.PhotoSize t10 = t(message);
            if (t10 == null || (bArr = t10.bytes) == null || bArr.length == 0) {
                return;
            }
            TLRPC.FileLocation fileLocation2 = t10.location;
            if (fileLocation2 == null || (fileLocation2 instanceof TLRPC.TL_fileLocationUnavailable)) {
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
                t10.location = tL_fileLocationToBeDeprecated;
                tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
                tL_fileLocationToBeDeprecated.local_id = az.p();
            }
            if (t10.h > 50 || t10.w > 50) {
                w7.G(h10.t0);
                File K3 = w7.K(t10, null, true, true);
                if (zi.S5(message)) {
                    K3 = new File(K3.getAbsolutePath() + ".enc");
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (K3.exists()) {
                    i10 = 0;
                } else {
                    try {
                        if (z10) {
                            try {
                                RandomAccessFile randomAccessFile = new RandomAccessFile(new File(t0.b.getCacheDir(), K3.getName() + ".key"), "rws");
                                long length = randomAccessFile.length();
                                byte[] bArr3 = new byte[32];
                                byte[] bArr4 = new byte[16];
                                if (length > 0) {
                                    if (length % 48 == 0) {
                                        i10 = 0;
                                        randomAccessFile.read(bArr3, 0, 32);
                                        randomAccessFile.read(bArr4, 0, 16);
                                        randomAccessFile.close();
                                        Utilities.aesCtrDecryptionByteArray(t10.bytes, bArr3, bArr4, 0, r4.length, 0);
                                    }
                                }
                                i10 = 0;
                                SecureRandom secureRandom = Utilities.b;
                                secureRandom.nextBytes(bArr3);
                                secureRandom.nextBytes(bArr4);
                                randomAccessFile.write(bArr3);
                                randomAccessFile.write(bArr4);
                                randomAccessFile.close();
                                Utilities.aesCtrDecryptionByteArray(t10.bytes, bArr3, bArr4, 0, r4.length, 0);
                            } catch (Exception e10) {
                                e = e10;
                                i10 = 0;
                                a8.g(e, true);
                                tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
                                tL_photoSize_layer127.w = t10.w;
                                tL_photoSize_layer127.h = t10.h;
                                tL_photoSize_layer127.location = t10.location;
                                tL_photoSize_layer127.size = t10.size;
                                tL_photoSize_layer127.type = t10.type;
                                messageMedia = message.media;
                                if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto)) {
                                }
                            }
                        } else {
                            i10 = 0;
                        }
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(K3, "rws");
                        randomAccessFile2.write(t10.bytes);
                        randomAccessFile2.close();
                    } catch (Exception e11) {
                        e = e11;
                    }
                }
                tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
                tL_photoSize_layer127.w = t10.w;
                tL_photoSize_layer127.h = t10.h;
                tL_photoSize_layer127.location = t10.location;
                tL_photoSize_layer127.size = t10.size;
                tL_photoSize_layer127.type = t10.type;
            } else {
                tL_photoSize_layer127 = new TLRPC.TL_photoStrippedSize();
                tL_photoSize_layer127.location = t10.location;
                tL_photoSize_layer127.bytes = t10.bytes;
                tL_photoSize_layer127.h = t10.h;
                tL_photoSize_layer127.w = t10.w;
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
                boolean z11 = messageMedia2 instanceof TLRPC.TL_messageMediaPhoto;
                if (z11) {
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
                            tL_fileLocationToBeDeprecated2.volume_id = j10;
                            tL_fileLocationToBeDeprecated2.local_id = az.p();
                        }
                        if (photoSize.h <= i10 || photoSize.w > i10) {
                            w7.G(h10.t0);
                            K2 = w7.K(photoSize, null, true, true);
                            if (zi.S5(message)) {
                                i3 = i11;
                            } else {
                                K2 = new File(K2.getAbsolutePath() + ".enc");
                                i3 = 1;
                            }
                            if (!K2.exists()) {
                                if (i3 != 0) {
                                    try {
                                        RandomAccessFile randomAccessFile3 = new RandomAccessFile(new File(t0.b.getCacheDir(), K2.getName() + ".key"), "rws");
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
                                RandomAccessFile randomAccessFile4 = new RandomAccessFile(K2, "rws");
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
                        if (!z11) {
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
                        tL_fileLocationToBeDeprecated22.volume_id = j10;
                        tL_fileLocationToBeDeprecated22.local_id = az.p();
                        if (photoSize.h <= i10) {
                        }
                        w7.G(h10.t0);
                        K2 = w7.K(photoSize, null, true, true);
                        if (zi.S5(message)) {
                        }
                        if (!K2.exists()) {
                        }
                        tL_photoSize_layer1272 = new TLRPC.TL_photoSize_layer127();
                        tL_photoSize_layer1272.w = photoSize.w;
                        tL_photoSize_layer1272.h = photoSize.h;
                        tL_photoSize_layer1272.location = photoSize.location;
                        tL_photoSize_layer1272.size = photoSize.size;
                        tL_photoSize_layer1272.type = photoSize.type;
                        if (!z11) {
                        }
                    }
                }
            }
            i15++;
            i11 = 0;
            j10 = -2147483648L;
            i10 = 50;
        }
    }

    public static void X(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            W((TLRPC.Message) arrayList.get(i3));
        }
    }

    public static TLRPC.PhotoSize Y(Bitmap bitmap, float f10, float f11, int i3, int i10, int i11) {
        return b0(null, bitmap, Bitmap.CompressFormat.JPEG, f10, f11, i3, false, i10, i11, false);
    }

    public static TLRPC.PhotoSize Z(Bitmap bitmap, float f10, float f11, int i3, boolean z10) {
        return b0(null, bitmap, Bitmap.CompressFormat.JPEG, f10, f11, i3, z10, 0, 0, false);
    }

    public static TLRPC.PhotoSize a0(Bitmap bitmap, Bitmap.CompressFormat compressFormat, float f10, float f11, int i3) {
        return b0(null, bitmap, compressFormat, f10, f11, i3, false, 101, 101, false);
    }

    public static TLRPC.PhotoSize b0(TLRPC.PhotoSize photoSize, Bitmap bitmap, Bitmap.CompressFormat compressFormat, float f10, float f11, int i3, boolean z10, int i10, int i11, boolean z11) {
        boolean z12;
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
                        z12 = true;
                        f12 = max2;
                        i12 = (int) (width / f12);
                        i13 = (int) (height / f12);
                        if (i13 != 0 && i12 != 0) {
                            try {
                                return c0(photoSize, bitmap, compressFormat, i12, i13, f12, i3, z10, z12, z11);
                            } catch (Throwable th2) {
                                a8.g(th2, true);
                                D().j();
                                System.gc();
                                try {
                                    return c0(photoSize, bitmap, compressFormat, i12, i13, f12, i3, z10, z12, z11);
                                } catch (Throwable th3) {
                                    a8.g(th3, true);
                                }
                            }
                        }
                    }
                }
                z12 = false;
                f12 = max2;
                i12 = (int) (width / f12);
                i13 = (int) (height / f12);
                if (i13 != 0) {
                    return c0(photoSize, bitmap, compressFormat, i12, i13, f12, i3, z10, z12, z11);
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
    public static TLRPC.PhotoSize c0(TLRPC.PhotoSize photoSize, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i3, int i10, float f10, int i11, boolean z10, boolean z11, boolean z12) {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        Bitmap createScaledBitmap = (f10 > 1.0f || z11) ? Bitmap.createScaledBitmap(bitmap, i3, i10, true) : bitmap;
        if (photoSize != null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            if (fileLocation instanceof TLRPC.TL_fileLocationToBeDeprecated) {
                tL_fileLocationToBeDeprecated = (TLRPC.TL_fileLocationToBeDeprecated) fileLocation;
                int i12 = kb.a[compressFormat.ordinal()];
                String str = (i12 != 1 || i12 == 2 || i12 == 3) ? ".webp" : ".jpg";
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_fileLocationToBeDeprecated.volume_id);
                sb2.append("_");
                FileOutputStream fileOutputStream = new FileOutputStream(new File(!z12 ? w7.z(4) : tL_fileLocationToBeDeprecated.volume_id != -2147483648L ? w7.z(0) : w7.z(4), a1.g.o(tL_fileLocationToBeDeprecated.local_id, str, sb2)));
                createScaledBitmap.compress(compressFormat, i11, fileOutputStream);
                if (!z10) {
                    photoSize.size = (int) fileOutputStream.getChannel().size();
                }
                fileOutputStream.close();
                if (z10) {
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
        tL_fileLocationToBeDeprecated.local_id = az.p();
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
        int i122 = kb.a[compressFormat.ordinal()];
        if (i122 != 1) {
        }
        StringBuilder sb22 = new StringBuilder();
        sb22.append(tL_fileLocationToBeDeprecated.volume_id);
        sb22.append("_");
        FileOutputStream fileOutputStream2 = new FileOutputStream(new File(!z12 ? w7.z(4) : tL_fileLocationToBeDeprecated.volume_id != -2147483648L ? w7.z(0) : w7.z(4), a1.g.o(tL_fileLocationToBeDeprecated.local_id, str, sb22)));
        createScaledBitmap.compress(compressFormat, i11, fileOutputStream2);
        if (!z10) {
        }
        fileOutputStream2.close();
        if (z10) {
        }
        if (createScaledBitmap != bitmap) {
        }
        return photoSize;
    }

    public static int d(zb zbVar, BitmapDrawable bitmapDrawable) {
        if (bitmapDrawable instanceof org.telegram.ui.Components.t5) {
            org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) bitmapDrawable;
            return Math.max(t5Var.getIntrinsicHeight() * t5Var.getIntrinsicWidth(), t5Var.k0 * t5Var.j0) * 12;
        }
        if (!(bitmapDrawable instanceof ch0)) {
            return bitmapDrawable.getBitmap().getByteCount();
        }
        ch0 ch0Var = (ch0) bitmapDrawable;
        int i3 = ch0Var.b * ch0Var.c;
        return ch0Var.H ? i3 * 2 : i3 * 8;
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

    public static boolean e0(ac acVar, String str) {
        if (str.endsWith("_firstframe") || str.endsWith("_lastframe")) {
            return false;
        }
        return (acVar != null && (zi.L2(acVar.i, true) || acVar.p == 1 || zi.O4(acVar.i))) || I(str);
    }

    public static boolean f(File file, File file2, int i3) {
        File file3;
        File file4;
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                if (i3 == 0) {
                    file3 = new File(file, "000000000_999999_temp.f");
                    file4 = new File(file2, "000000000_999999.f");
                } else {
                    if (i3 != 3 && i3 != 5 && i3 != 6) {
                        if (i3 == 1) {
                            file3 = new File(file, "000000000_999999_temp.f");
                            file4 = new File(file2, "000000000_999999.f");
                        } else if (i3 == 2) {
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
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (arrayList.get(i3) instanceof TLRPC.TL_photoStrippedSize) {
                return new BitmapDrawable(t0.b.getResources(), F("b", ((TLRPC.TL_photoStrippedSize) arrayList.get(i3)).bytes));
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
            int i3 = options.outWidth;
            int i10 = options.outHeight;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
            tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
            tL_fileLocationToBeDeprecated.dc_id = TLObject.FLAG_31;
            tL_fileLocationToBeDeprecated.local_id = az.p();
            tL_fileLocationToBeDeprecated.file_reference = new byte[0];
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.location = tL_fileLocationToBeDeprecated;
            tL_photoSize_layer127.w = i3;
            tL_photoSize_layer127.h = i10;
            if (i3 <= 100 && i10 <= 100) {
                tL_photoSize_layer127.type = "s";
            } else if (i3 <= 320 && i10 <= 320) {
                tL_photoSize_layer127.type = "m";
            } else if (i3 <= 800 && i10 <= 800) {
                tL_photoSize_layer127.type = "x";
            } else if (i3 > 1280 || i10 > 1280) {
                tL_photoSize_layer127.type = "w";
            } else {
                tL_photoSize_layer127.type = "y";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_fileLocationToBeDeprecated.volume_id);
            sb2.append("_");
            File file = new File(tL_fileLocationToBeDeprecated.volume_id != -2147483648L ? w7.z(0) : w7.z(4), a1.g.o(tL_fileLocationToBeDeprecated.local_id, ".jpg", sb2));
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
                w7.G(h10.t0);
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(w7.K(photoSize, null, true, true), "r");
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
        for (int i3 = 0; i3 < list.size(); i3++) {
            ImageReceiver imageReceiver = (ImageReceiver) list.get(i3);
            if (str.equals(imageReceiver.R)) {
                return imageReceiver.T;
            }
            if (str.equals(imageReceiver.i0)) {
                return imageReceiver.k0;
            }
        }
        return null;
    }

    public static TLRPC.PhotoSize t(TLRPC.Message message) {
        TLRPC.MessageMedia messageMedia = message.media;
        int i3 = 0;
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia.photo.sizes.size();
            while (i3 < size) {
                TLRPC.PhotoSize photoSize = message.media.photo.sizes.get(i3);
                if (photoSize instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize;
                }
                i3++;
            }
            return null;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = messageMedia.document;
            if (document == null) {
                return null;
            }
            int size2 = document.thumbs.size();
            while (i3 < size2) {
                TLRPC.PhotoSize photoSize2 = message.media.document.thumbs.get(i3);
                if (photoSize2 instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize2;
                }
                i3++;
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
        while (i3 < size3) {
            TLRPC.PhotoSize photoSize3 = message.media.webpage.photo.sizes.get(i3);
            if (photoSize3 instanceof TLRPC.TL_photoCachedSize) {
                return photoSize3;
            }
            i3++;
        }
        return null;
    }

    public static vb u(TLRPC.Message message) {
        int i3;
        int i10;
        Bitmap F;
        byte[] bArr;
        TLRPC.PhotoSize t10 = t(message);
        if (t10 == null || (bArr = t10.bytes) == null || bArr.length == 0) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                int size = messageMedia.document.thumbs.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.PhotoSize photoSize = message.media.document.thumbs.get(i11);
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        TLRPC.PhotoSize w10 = w7.w(message.media.document.thumbs, hs.r5, false, null, false);
                        if (w10 == null) {
                            int i12 = 0;
                            while (true) {
                                if (i12 >= message.media.document.attributes.size()) {
                                    i3 = 0;
                                    i10 = 0;
                                    break;
                                }
                                if (message.media.document.attributes.get(i12) instanceof TLRPC.TL_documentAttributeVideo) {
                                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) message.media.document.attributes.get(i12);
                                    i10 = tL_documentAttributeVideo.h;
                                    i3 = tL_documentAttributeVideo.w;
                                    break;
                                }
                                i12++;
                            }
                        } else {
                            i10 = w10.h;
                            i3 = w10.w;
                        }
                        PointF P1 = org.telegram.ui.Cells.q1.P1(i3, i10, 0, 0);
                        Locale locale = Locale.US;
                        String s6 = ac.s(message, message, photoSize);
                        float f10 = P1.x;
                        float f11 = g0.p;
                        String str = s6 + "_false@" + ((int) (f10 / f11)) + "_" + ((int) (P1.y / f11)) + "_b";
                        if (!D().J(str, false) && (F = F(null, photoSize.bytes)) != null) {
                            Utilities.blurBitmap(F, 3);
                            float f12 = P1.x;
                            float f13 = g0.p;
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(F, (int) (f12 / f13), (int) (P1.y / f13), true);
                            if (createScaledBitmap != F) {
                                F.recycle();
                                F = createScaledBitmap;
                            }
                            return new vb(str, new BitmapDrawable(F));
                        }
                    }
                }
            }
        } else {
            w7.G(h10.t0);
            File K2 = w7.K(t10, null, true, true);
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.w = t10.w;
            tL_photoSize_layer127.h = t10.h;
            tL_photoSize_layer127.location = t10.location;
            tL_photoSize_layer127.size = t10.size;
            tL_photoSize_layer127.type = t10.type;
            if (K2.exists() && message.grouped_id == 0) {
                PointF P12 = org.telegram.ui.Cells.q1.P1(t10.w, t10.h, 0, 0);
                Locale locale2 = Locale.US;
                TLRPC.FileLocation fileLocation = t10.location;
                long j10 = fileLocation.volume_id;
                int i13 = fileLocation.local_id;
                float f14 = P12.x;
                float f15 = g0.p;
                String str2 = j10 + "_" + i13 + "@" + ((int) (f14 / f15)) + "_" + ((int) (P12.y / f15)) + "_b";
                if (!D().J(str2, false)) {
                    String path = K2.getPath();
                    float f16 = P12.x;
                    float f17 = g0.p;
                    Bitmap K3 = K(path, null, (int) (f16 / f17), (int) (P12.y / f17), false);
                    if (K3 != null) {
                        Utilities.blurBitmap(K3, 3);
                        float f18 = P12.x;
                        float f19 = g0.p;
                        Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(K3, (int) (f18 / f19), (int) (P12.y / f19), true);
                        if (createScaledBitmap2 != K3) {
                            K3.recycle();
                            K3 = createScaledBitmap2;
                        }
                        return new vb(str2, new BitmapDrawable(K3));
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
        } else if (tLObject instanceof wv) {
            TLRPC.TL_secureFile tL_secureFile = ((wv) tLObject).b;
            str = tL_secureFile.dc_id + "_" + tL_secureFile.id;
        } else if (tLObject instanceof e20) {
            str = Utilities.a(((e20) tLObject).a);
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

    public final boolean J(String str, boolean z10) {
        return z10 ? y(str) != null : z(str) != null;
    }

    public final void L(int i3, String str, String str2) {
        if (str != null && str.length() != 0) {
            HashMap hashMap = this.C;
            if (!hashMap.containsKey(str)) {
                String B = B(str, str2);
                File file = new File(w7.z(4), Utilities.a(str) + "_temp." + B);
                file.delete();
                qb qbVar = new qb(this, str, file, B, i3);
                this.B.add(qbVar);
                hashMap.put(str, qbVar);
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
        int i3;
        String str;
        boolean z10;
        boolean z11;
        String str2;
        boolean z12;
        String str3;
        int i10;
        boolean z13;
        Object obj;
        ac acVar;
        String str4;
        ac acVar2;
        ac acVar3;
        ac acVar4;
        boolean z14;
        String str5;
        String str6;
        ac acVar5;
        String str7;
        String str8;
        int i11;
        int i12;
        ac acVar6;
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
        ac acVar7;
        boolean z15;
        boolean z16;
        ac acVar8;
        ac acVar9;
        String str20;
        Drawable drawable;
        Drawable s6;
        String str21 = imageReceiver.i0;
        int i16 = imageReceiver.q0 + 1;
        imageReceiver.q0 = i16;
        db dbVar = this.d;
        db dbVar2 = this.b;
        db dbVar3 = this.c;
        if (str21 != null) {
            ac acVar10 = imageReceiver.g0;
            Drawable s10 = s(str21, list);
            if (s10 == null) {
                if (e0(acVar10, str21)) {
                    s10 = y(str21);
                } else {
                    Drawable drawable2 = (Drawable) dbVar3.f(str21);
                    if (drawable2 != null) {
                        dbVar3.g(str21);
                    }
                    if (drawable2 == null && (drawable2 = (Drawable) dbVar2.f(str21)) != null) {
                        dbVar2.g(str21);
                    }
                    s10 = drawable2;
                    if (s10 == null && (s10 = (Drawable) dbVar.f(str21)) != null) {
                        dbVar.g(str21);
                    }
                }
            }
            Drawable drawable3 = s10;
            if ((drawable3 instanceof ch0 ? ((ch0) drawable3).u() : drawable3 instanceof org.telegram.ui.Components.t5 ? ((org.telegram.ui.Components.t5) drawable3).s() : true) && drawable3 != null) {
                h(imageReceiver, true);
                imageReceiver.x0(drawable3, str21, 3, true, i16);
                if (!imageReceiver.T0) {
                    return;
                }
                z10 = true;
                i3 = i16;
                z11 = false;
                str = str21;
            } else if (drawable3 != null) {
                i3 = i16;
                imageReceiver.x0(drawable3, str21, 3, true, i3);
                str = str21;
                z11 = true;
                z10 = false;
            }
            str2 = imageReceiver.R;
            if (!z10 && str2 != null) {
                ac acVar11 = imageReceiver.P;
                s6 = s(str2, list);
                if (s6 == null && e0(acVar11, str2)) {
                    s6 = y(str2);
                }
                if (s6 == null) {
                    Drawable drawable4 = (Drawable) dbVar3.f(str2);
                    if (drawable4 != null) {
                        dbVar3.g(str2);
                    }
                    if (drawable4 == null && (drawable4 = (Drawable) dbVar2.f(str2)) != null) {
                        dbVar2.g(str2);
                    }
                    s6 = drawable4;
                    if (s6 == null && (s6 = (Drawable) dbVar.f(str2)) != null) {
                        dbVar.g(str2);
                    }
                }
                if (s6 != null) {
                    h(imageReceiver, true);
                    imageReceiver.x0(s6, str2, 0, true, i3);
                    if (!imageReceiver.T0 && (str == null || z11)) {
                        return;
                    }
                    z12 = true;
                    str3 = imageReceiver.Z;
                    if (str3 != null) {
                        if (e0(imageReceiver.X, str3)) {
                            drawable = y(str3);
                        } else {
                            drawable = (Drawable) dbVar3.f(str3);
                            if (drawable != null) {
                                dbVar3.g(str3);
                            }
                            if (drawable == null && (drawable = (Drawable) dbVar2.f(str3)) != null) {
                                dbVar2.g(str3);
                            }
                            if (drawable == null && (drawable = (Drawable) dbVar.f(str3)) != null) {
                                dbVar.g(str3);
                            }
                        }
                        if (drawable != null) {
                            imageReceiver.x0(drawable, str3, 1, true, i3);
                            i10 = i3;
                            h(imageReceiver, false);
                            if (z12 && imageReceiver.T0) {
                                return;
                            }
                            z13 = true;
                            obj = imageReceiver.h;
                            TLRPC.Document document = imageReceiver.I0;
                            acVar = imageReceiver.X;
                            str4 = imageReceiver.Y;
                            acVar2 = imageReceiver.g0;
                            String str22 = imageReceiver.h0;
                            acVar3 = imageReceiver.P;
                            String str23 = imageReceiver.Q;
                            if (acVar3 == null && imageReceiver.G0 && imageReceiver.J0) {
                                if (!(obj instanceof zi)) {
                                    acVar4 = ac.b(((zi) obj).F0());
                                } else if (document != null) {
                                    acVar4 = ac.b(document);
                                }
                                z14 = true;
                                String str24 = null;
                                String str25 = (acVar4 == null && acVar4.p == 2) ? "mp4" : null;
                                str5 = (acVar2 == null && acVar2.p == 2) ? "mp4" : null;
                                str6 = imageReceiver.o0;
                                if (str6 == null) {
                                    str6 = "jpg";
                                }
                                String str26 = str25 != null ? str6 : str25;
                                if (str5 == null) {
                                    str5 = str6;
                                }
                                boolean z17 = z13;
                                acVar5 = acVar2;
                                boolean z18 = z14;
                                ac acVar12 = acVar3;
                                str7 = null;
                                str8 = null;
                                String str27 = null;
                                String str28 = null;
                                i11 = 0;
                                boolean z19 = false;
                                while (true) {
                                    i12 = i10;
                                    if (i11 < 2) {
                                        break;
                                    }
                                    if (i11 == 0) {
                                        acVar7 = acVar4;
                                        i15 = i11;
                                        str19 = str26;
                                    } else {
                                        i15 = i11;
                                        str19 = str5;
                                        acVar7 = acVar5;
                                    }
                                    if (acVar7 == null) {
                                        z15 = z11;
                                        z16 = z12;
                                    } else {
                                        z15 = z11;
                                        z16 = z12;
                                        String q10 = acVar7.q(obj, acVar5 != null ? acVar5 : acVar4, false);
                                        if (q10 != null) {
                                            if (acVar5 != null) {
                                                acVar9 = acVar4;
                                                acVar8 = acVar5;
                                            } else {
                                                acVar8 = acVar4;
                                                acVar9 = acVar8;
                                            }
                                            String q11 = acVar7.q(obj, acVar8, true);
                                            if (acVar7.g != null) {
                                                StringBuilder h = t4.c.h(q11, ".");
                                                h.append(B(acVar7.g, "jpg"));
                                                q11 = h.toString();
                                                str20 = str4;
                                            } else {
                                                TLRPC.PhotoSize photoSize = acVar7.k;
                                                str20 = str4;
                                                if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                                                    q11 = a1.g.C(q11, ".", str19);
                                                } else {
                                                    if (acVar7.f != null) {
                                                        q11 = a1.g.C(q11, ".", str19);
                                                        if (imageReceiver.o0 == null) {
                                                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = acVar7.f;
                                                            if (tL_fileLocationToBeDeprecated.key == null) {
                                                                if (tL_fileLocationToBeDeprecated.volume_id == -2147483648L) {
                                                                }
                                                            }
                                                        }
                                                        z19 = true;
                                                    } else {
                                                        e20 e20Var = acVar7.v;
                                                        if (e20Var != null) {
                                                            String H = w7.H(e20Var.e);
                                                            StringBuilder h7 = t4.c.h(q11, ".");
                                                            h7.append(B(acVar7.v.a, H));
                                                            q11 = h7.toString();
                                                        } else if (acVar7.h != null) {
                                                            q11 = a1.g.C(q11, ".", str19);
                                                        } else if (acVar7.i != null) {
                                                            if (i15 == 0 && z18) {
                                                                q10 = "q_".concat(q10);
                                                            }
                                                            String B = w7.B(acVar7.i);
                                                            int lastIndexOf = B.lastIndexOf(46);
                                                            String str29 = "";
                                                            String substring = lastIndexOf == -1 ? "" : B.substring(lastIndexOf);
                                                            if (substring.length() > 1) {
                                                                str29 = substring;
                                                            } else if ("video/mp4".equals(acVar7.i.mime_type)) {
                                                                str29 = ".mp4";
                                                            } else if ("video/x-matroska".equals(acVar7.i.mime_type)) {
                                                                str29 = ".mkv";
                                                            }
                                                            q11 = t4.c.q(q11, str29);
                                                            if (zi.L4(acVar7.i) || zi.t3(acVar7.i, false) || zi.j4(acVar7.i) || zi.y(acVar7.i)) {
                                                                z19 = false;
                                                            }
                                                            z19 = true;
                                                        } else if (obj instanceof TLRPC.StickerSet) {
                                                            q11 = a1.g.C(q11, ".", str19);
                                                        }
                                                    }
                                                    i11 = i15 + 1;
                                                    i10 = i12;
                                                    z11 = z15;
                                                    z12 = z16;
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
                                            if (acVar7 == acVar) {
                                                if (i15 == 0) {
                                                    acVar4 = null;
                                                    str8 = null;
                                                    str27 = null;
                                                    i11 = i15 + 1;
                                                    i10 = i12;
                                                    z11 = z15;
                                                    z12 = z16;
                                                    str4 = str20;
                                                } else {
                                                    str7 = null;
                                                    acVar5 = null;
                                                    str28 = null;
                                                }
                                            }
                                            acVar4 = acVar9;
                                            i11 = i15 + 1;
                                            i10 = i12;
                                            z11 = z15;
                                            z12 = z16;
                                            str4 = str20;
                                        }
                                    }
                                    str20 = str4;
                                    i11 = i15 + 1;
                                    i10 = i12;
                                    z11 = z15;
                                    z12 = z16;
                                    str4 = str20;
                                }
                                acVar6 = acVar4;
                                str9 = str4;
                                boolean z20 = z11;
                                boolean z21 = z12;
                                if (acVar == null) {
                                    ac acVar13 = imageReceiver.O;
                                    if (acVar13 == null) {
                                        if (acVar5 != null) {
                                            acVar12 = acVar5;
                                        }
                                        acVar13 = acVar12;
                                    }
                                    String q12 = acVar.q(obj, acVar13, false);
                                    i13 = 1;
                                    String q13 = acVar.q(obj, acVar13, true);
                                    if (acVar.g != null) {
                                        StringBuilder h10 = t4.c.h(q13, ".");
                                        h10.append(B(acVar.g, "jpg"));
                                        q13 = h10.toString();
                                    } else {
                                        TLRPC.PhotoSize photoSize2 = acVar.k;
                                        if ((photoSize2 instanceof TLRPC.TL_photoStrippedSize) || (photoSize2 instanceof TLRPC.TL_photoPathSize)) {
                                            q13 = a1.g.C(q13, ".", str6);
                                        } else if (acVar.f != null) {
                                            q13 = a1.g.C(q13, ".", str6);
                                        }
                                    }
                                    str24 = q13;
                                    str10 = q12;
                                } else {
                                    i13 = 1;
                                    str10 = null;
                                }
                                if (str7 != null && str22 != null) {
                                    str7 = a1.g.C(str7, "@", str22);
                                }
                                if (str8 != null && str23 != null) {
                                    str8 = a1.g.C(str8, "@", str23);
                                }
                                if (str10 != null || str9 == null) {
                                    str11 = str9;
                                } else {
                                    str11 = str9;
                                    str10 = a1.g.C(str10, "@", str11);
                                }
                                if (imageReceiver.w1 != null && str8 != null) {
                                    str8 = a1.g.s(new StringBuilder(), imageReceiver.w1, str8);
                                }
                                String str30 = str8;
                                if (imageReceiver.w1 != null && str7 != null) {
                                    str7 = a1.g.s(new StringBuilder(), imageReceiver.w1, str7);
                                }
                                String str31 = str7;
                                if (acVar6 != null) {
                                    str12 = str6;
                                    str13 = str10;
                                    str14 = str30;
                                    str15 = str24;
                                    str16 = str26;
                                    str17 = str27;
                                    i14 = i12;
                                } else {
                                    if (acVar6.g != null) {
                                        k(imageReceiver, str10, str24, str6, acVar, str11, 0L, 1, 1, z17 ? 2 : i13, i12);
                                        k(imageReceiver, str30, str27, str26, acVar6, str23, imageReceiver.r0, 1, 0, 0, i12);
                                        return;
                                    }
                                    acVar6 = acVar6;
                                    str13 = str10;
                                    str14 = str30;
                                    str15 = str24;
                                    str16 = str26;
                                    str17 = str27;
                                    i14 = i12;
                                    str12 = str6;
                                }
                                if (acVar5 != null) {
                                    int i17 = imageReceiver.s0;
                                    int i18 = (i17 == 0 && z19) ? i13 : i17;
                                    k(imageReceiver, str13, str15, str12, acVar, str11, 0L, i18 == 0 ? i13 : i18, 1, z17 ? 2 : i13, i14);
                                    k(imageReceiver, str14, str17, str16, acVar6, str23, imageReceiver.r0, i18, 0, 0, i14);
                                    return;
                                }
                                int i19 = imageReceiver.s0;
                                int i20 = (i19 == 0 && z19) ? i13 : i19;
                                int i21 = i20 == 0 ? i13 : i20;
                                if (z17) {
                                    str18 = str22;
                                } else {
                                    str18 = str22;
                                    k(imageReceiver, str13, str15, str12, acVar, str11, 0L, i21, 1, 1, i14);
                                }
                                if (z21) {
                                    imageReceiver2 = imageReceiver;
                                } else {
                                    imageReceiver2 = imageReceiver;
                                    k(imageReceiver2, str14, str17, str16, acVar6, str23, 0L, 1, 0, 0, i14);
                                }
                                if (z20) {
                                    return;
                                }
                                k(imageReceiver2, str31, str28, str5, acVar5, str18, imageReceiver2.r0, i20, 3, 0, i14);
                                return;
                            }
                            acVar4 = acVar3;
                            z14 = false;
                            String str242 = null;
                            String str252 = (acVar4 == null && acVar4.p == 2) ? "mp4" : null;
                            if (acVar2 == null) {
                            }
                            str6 = imageReceiver.o0;
                            if (str6 == null) {
                            }
                            if (str252 != null) {
                            }
                            if (str5 == null) {
                            }
                            boolean z172 = z13;
                            acVar5 = acVar2;
                            boolean z182 = z14;
                            ac acVar122 = acVar3;
                            str7 = null;
                            str8 = null;
                            String str272 = null;
                            String str282 = null;
                            i11 = 0;
                            boolean z192 = false;
                            while (true) {
                                i12 = i10;
                                if (i11 < 2) {
                                }
                                i11 = i15 + 1;
                                i10 = i12;
                                z11 = z15;
                                z12 = z16;
                                str4 = str20;
                            }
                            acVar6 = acVar4;
                            str9 = str4;
                            boolean z202 = z11;
                            boolean z212 = z12;
                            if (acVar == null) {
                            }
                            if (str7 != null) {
                                str7 = a1.g.C(str7, "@", str22);
                            }
                            if (str8 != null) {
                                str8 = a1.g.C(str8, "@", str23);
                            }
                            if (str10 != null) {
                            }
                            str11 = str9;
                            if (imageReceiver.w1 != null) {
                                str8 = a1.g.s(new StringBuilder(), imageReceiver.w1, str8);
                            }
                            String str302 = str8;
                            if (imageReceiver.w1 != null) {
                                str7 = a1.g.s(new StringBuilder(), imageReceiver.w1, str7);
                            }
                            String str312 = str7;
                            if (acVar6 != null) {
                            }
                            if (acVar5 != null) {
                            }
                        }
                    }
                    i10 = i3;
                    z13 = false;
                    obj = imageReceiver.h;
                    TLRPC.Document document2 = imageReceiver.I0;
                    acVar = imageReceiver.X;
                    str4 = imageReceiver.Y;
                    acVar2 = imageReceiver.g0;
                    String str222 = imageReceiver.h0;
                    acVar3 = imageReceiver.P;
                    String str232 = imageReceiver.Q;
                    if (acVar3 == null) {
                        if (!(obj instanceof zi)) {
                        }
                        z14 = true;
                        String str2422 = null;
                        String str2522 = (acVar4 == null && acVar4.p == 2) ? "mp4" : null;
                        if (acVar2 == null) {
                        }
                        str6 = imageReceiver.o0;
                        if (str6 == null) {
                        }
                        if (str2522 != null) {
                        }
                        if (str5 == null) {
                        }
                        boolean z1722 = z13;
                        acVar5 = acVar2;
                        boolean z1822 = z14;
                        ac acVar1222 = acVar3;
                        str7 = null;
                        str8 = null;
                        String str2722 = null;
                        String str2822 = null;
                        i11 = 0;
                        boolean z1922 = false;
                        while (true) {
                            i12 = i10;
                            if (i11 < 2) {
                            }
                            i11 = i15 + 1;
                            i10 = i12;
                            z11 = z15;
                            z12 = z16;
                            str4 = str20;
                        }
                        acVar6 = acVar4;
                        str9 = str4;
                        boolean z2022 = z11;
                        boolean z2122 = z12;
                        if (acVar == null) {
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
                        if (acVar6 != null) {
                        }
                        if (acVar5 != null) {
                        }
                    }
                    acVar4 = acVar3;
                    z14 = false;
                    String str24222 = null;
                    String str25222 = (acVar4 == null && acVar4.p == 2) ? "mp4" : null;
                    if (acVar2 == null) {
                    }
                    str6 = imageReceiver.o0;
                    if (str6 == null) {
                    }
                    if (str25222 != null) {
                    }
                    if (str5 == null) {
                    }
                    boolean z17222 = z13;
                    acVar5 = acVar2;
                    boolean z18222 = z14;
                    ac acVar12222 = acVar3;
                    str7 = null;
                    str8 = null;
                    String str27222 = null;
                    String str28222 = null;
                    i11 = 0;
                    boolean z19222 = false;
                    while (true) {
                        i12 = i10;
                        if (i11 < 2) {
                        }
                        i11 = i15 + 1;
                        i10 = i12;
                        z11 = z15;
                        z12 = z16;
                        str4 = str20;
                    }
                    acVar6 = acVar4;
                    str9 = str4;
                    boolean z20222 = z11;
                    boolean z21222 = z12;
                    if (acVar == null) {
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
                    if (acVar6 != null) {
                    }
                    if (acVar5 != null) {
                    }
                }
            }
            z12 = z10;
            str3 = imageReceiver.Z;
            if (str3 != null) {
            }
            i10 = i3;
            z13 = false;
            obj = imageReceiver.h;
            TLRPC.Document document22 = imageReceiver.I0;
            acVar = imageReceiver.X;
            str4 = imageReceiver.Y;
            acVar2 = imageReceiver.g0;
            String str2222 = imageReceiver.h0;
            acVar3 = imageReceiver.P;
            String str2322 = imageReceiver.Q;
            if (acVar3 == null) {
            }
            acVar4 = acVar3;
            z14 = false;
            String str242222 = null;
            String str252222 = (acVar4 == null && acVar4.p == 2) ? "mp4" : null;
            if (acVar2 == null) {
            }
            str6 = imageReceiver.o0;
            if (str6 == null) {
            }
            if (str252222 != null) {
            }
            if (str5 == null) {
            }
            boolean z172222 = z13;
            acVar5 = acVar2;
            boolean z182222 = z14;
            ac acVar122222 = acVar3;
            str7 = null;
            str8 = null;
            String str272222 = null;
            String str282222 = null;
            i11 = 0;
            boolean z192222 = false;
            while (true) {
                i12 = i10;
                if (i11 < 2) {
                }
                i11 = i15 + 1;
                i10 = i12;
                z11 = z15;
                z12 = z16;
                str4 = str20;
            }
            acVar6 = acVar4;
            str9 = str4;
            boolean z202222 = z11;
            boolean z212222 = z12;
            if (acVar == null) {
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
            if (acVar6 != null) {
            }
            if (acVar5 != null) {
            }
        }
        i3 = i16;
        str = str21;
        z10 = false;
        z11 = false;
        str2 = imageReceiver.R;
        if (!z10) {
            ac acVar112 = imageReceiver.P;
            s6 = s(str2, list);
            if (s6 == null) {
                s6 = y(str2);
            }
            if (s6 == null) {
            }
            if (s6 != null) {
            }
        }
        z12 = z10;
        str3 = imageReceiver.Z;
        if (str3 != null) {
        }
        i10 = i3;
        z13 = false;
        obj = imageReceiver.h;
        TLRPC.Document document222 = imageReceiver.I0;
        acVar = imageReceiver.X;
        str4 = imageReceiver.Y;
        acVar2 = imageReceiver.g0;
        String str22222 = imageReceiver.h0;
        acVar3 = imageReceiver.P;
        String str23222 = imageReceiver.Q;
        if (acVar3 == null) {
        }
        acVar4 = acVar3;
        z14 = false;
        String str2422222 = null;
        String str2522222 = (acVar4 == null && acVar4.p == 2) ? "mp4" : null;
        if (acVar2 == null) {
        }
        str6 = imageReceiver.o0;
        if (str6 == null) {
        }
        if (str2522222 != null) {
        }
        if (str5 == null) {
        }
        boolean z1722222 = z13;
        acVar5 = acVar2;
        boolean z1822222 = z14;
        ac acVar1222222 = acVar3;
        str7 = null;
        str8 = null;
        String str2722222 = null;
        String str2822222 = null;
        i11 = 0;
        boolean z1922222 = false;
        while (true) {
            i12 = i10;
            if (i11 < 2) {
            }
            i11 = i15 + 1;
            i10 = i12;
            z11 = z15;
            z12 = z16;
            str4 = str20;
        }
        acVar6 = acVar4;
        str9 = str4;
        boolean z2022222 = z11;
        boolean z2122222 = z12;
        if (acVar == null) {
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
        if (acVar6 != null) {
        }
        if (acVar5 != null) {
        }
    }

    public final void N(String str, String str2) {
        db dbVar = this.c;
        BitmapDrawable bitmapDrawable = (BitmapDrawable) dbVar.f(str);
        if (bitmapDrawable == null) {
            dbVar = this.b;
            bitmapDrawable = (BitmapDrawable) dbVar.f(str);
        }
        this.t.put(str, str2);
        if (bitmapDrawable != null) {
            BitmapDrawable bitmapDrawable2 = (BitmapDrawable) dbVar.f(str2);
            if (bitmapDrawable2 != null && bitmapDrawable2.getBitmap() != null && bitmapDrawable.getBitmap() != null) {
                Bitmap bitmap = bitmapDrawable2.getBitmap();
                Bitmap bitmap2 = bitmapDrawable.getBitmap();
                if (bitmap.getWidth() > bitmap2.getWidth() || bitmap.getHeight() > bitmap2.getHeight()) {
                    dbVar.n(str);
                }
            }
            this.F = str;
            dbVar.n(str);
            dbVar.l(str2, bitmapDrawable);
            this.F = null;
        }
        HashMap hashMap = this.a;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            hashMap.put(str2, num);
            hashMap.remove(str);
        }
    }

    public final void O(BitmapDrawable bitmapDrawable, String str, boolean z10) {
        if (str.endsWith("_nocache")) {
            return;
        }
        if (z10) {
            this.b.l(str, bitmapDrawable);
        } else {
            this.c.l(str, bitmapDrawable);
        }
    }

    public final void P(ArrayList arrayList) {
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            O(((vb) arrayList.get(i3)).a, ((vb) arrayList.get(i3)).b, true);
        }
    }

    public final void Q(String str) {
        this.a.remove(str);
        this.c.n(str);
        this.b.n(str);
    }

    public final void R(String str, String str2, ac acVar, boolean z10) {
        if (z10) {
            g0.h3(new ul(this, str, str2, acVar, 9));
        } else {
            S(str, str2, acVar);
        }
    }

    public final void S(String str, String str2, ac acVar) {
        for (int i3 = 0; i3 < 2; i3++) {
            ArrayList arrayList = null;
            if (i3 == 0) {
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
            int i10 = hs.m4;
            if (arrayList != null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    String str3 = (String) arrayList.get(i11);
                    String C = a1.g.C(str, "@", str3);
                    String str4 = str2 + "@" + str3;
                    N(C, str4);
                    hs.e().k(i10, C, str4, acVar);
                }
            } else {
                N(str, str2);
                hs.e().k(i10, str, str2, acVar);
            }
        }
    }

    public final void T(boolean z10) {
        if (z10) {
            this.y--;
        }
        while (this.y < 4) {
            LinkedList linkedList = this.o;
            if (linkedList.isEmpty()) {
                return;
            }
            try {
                ((mb) linkedList.poll()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                this.y++;
            } catch (Throwable unused) {
                T(false);
            }
        }
    }

    public final void U(qb qbVar, int i3) {
        g0.h3(new k7(this, qbVar, i3, 4));
    }

    public final void V(boolean z10) {
        if (z10) {
            this.x--;
        }
        while (this.x < 4) {
            LinkedList linkedList = this.n;
            if (linkedList.isEmpty()) {
                return;
            }
            ub ubVar = (ub) linkedList.poll();
            if (ubVar != null) {
                ubVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                this.x++;
            }
        }
    }

    public final void e(String str, e20 e20Var) {
        if (str == null || e20Var == null) {
            return;
        }
        this.A.put(str, e20Var);
    }

    public final void g(String str) {
        HashMap hashMap = this.C;
        qb qbVar = (qb) hashMap.get(str);
        if (qbVar != null) {
            qbVar.cancel(true);
            hashMap.remove(str);
            this.B.remove(qbVar);
        }
        Runnable runnable = (Runnable) this.D.get(str);
        if (runnable != null) {
            g0.r(runnable);
        }
        U(null, 0);
    }

    public final void h(ImageReceiver imageReceiver, boolean z10) {
        ArrayList arrayList = imageReceiver.x1;
        HashMap hashMap = org.telegram.ui.web.u1.f;
        if (hashMap != null) {
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                ArrayList arrayList2 = (ArrayList) entry.getValue();
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayList2.size()) {
                        break;
                    }
                    if (((Pair) arrayList2.get(i3)).first == imageReceiver) {
                        arrayList2.remove(i3);
                        break;
                    }
                    i3++;
                }
                if (arrayList2.isEmpty()) {
                    org.telegram.ui.web.u1.f.remove(str);
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
        p5Var.c(new qf(this, z10, imageReceiver, 5));
    }

    public final void i(Runnable runnable) {
        ((lf.a) this.p.b).execute(new y4(15, this, runnable));
    }

    public final void j() {
        this.b.r(-1, null);
        this.c.r(-1, null);
        this.e.r(-1, null);
    }

    public final void k(final ImageReceiver imageReceiver, final String str, final String str2, final String str3, final ac acVar, final String str4, final long j10, final int i3, final int i10, final int i11, final int i12) {
        if (str2 == null || str == null || acVar == null) {
            return;
        }
        int G = imageReceiver.G(i10);
        if (G == 0) {
            G = this.G;
            if (i10 == 1) {
                imageReceiver.a0 = G;
            } else if (i10 == 3) {
                imageReceiver.j0 = G;
            } else {
                imageReceiver.S = G;
            }
            int i13 = G + 1;
            this.G = i13;
            if (i13 == Integer.MAX_VALUE) {
                this.G = 0;
            }
        }
        final int i14 = G;
        final boolean z10 = imageReceiver.G0;
        final Object obj = imageReceiver.h;
        final TLRPC.Document document = imageReceiver.I0;
        final boolean z11 = imageReceiver.H0;
        final int i15 = imageReceiver.d;
        final boolean z12 = i10 == 0 && imageReceiver.J0;
        Runnable runnable = new Runnable() { // from class: org.telegram.messenger.cb
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
                boolean z13;
                long j11;
                boolean z14;
                String str5;
                String str6;
                String str7;
                int i16;
                int i17;
                String str8;
                Object obj2;
                String str9;
                File file;
                boolean z15;
                boolean z16;
                String str10;
                int i18;
                TLRPC.Document document2;
                File file2;
                File file3;
                boolean z17;
                File file4;
                String str11;
                zb zbVar;
                int i19;
                ImageReceiver imageReceiver2;
                String str12;
                int i20;
                String str13;
                long j12;
                File file5;
                boolean z18;
                int i21;
                int i22;
                String str14;
                String str15;
                boolean z19;
                File file6;
                long j13;
                String str16;
                boolean z20;
                int i23;
                String str17;
                String str18;
                File file7;
                File file8;
                nb nbVar;
                zb zbVar2 = zb.this;
                int i24 = i11;
                String str19 = str2;
                String str20 = str;
                int i25 = i14;
                ImageReceiver imageReceiver3 = imageReceiver;
                int i26 = i12;
                String str21 = str4;
                int i27 = i10;
                ac acVar2 = acVar;
                boolean z21 = z12;
                Object obj3 = obj;
                int i28 = i15;
                TLRPC.Document document3 = document;
                boolean z22 = z10;
                boolean z23 = z11;
                String str22 = str3;
                int i29 = i3;
                long j14 = j10;
                if (i24 != 2) {
                    nb nbVar2 = (nb) zbVar2.g.get(str19);
                    z13 = z22;
                    nb nbVar3 = (nb) zbVar2.i.get(str20);
                    nb nbVar4 = (nb) zbVar2.k.get(i25);
                    if (nbVar4 != null) {
                        j11 = j14;
                        if (nbVar4 == nbVar3) {
                            int indexOf = nbVar4.v.indexOf(imageReceiver3);
                            if (indexOf != -1) {
                                nbVar4.w.set(indexOf, Integer.valueOf(i26));
                            }
                        } else if (nbVar4 != nbVar2) {
                            nbVar = nbVar2;
                            nbVar4.b(imageReceiver3);
                        } else if (nbVar3 == null) {
                            ArrayList arrayList = nbVar4.v;
                            nbVar = nbVar2;
                            int indexOf2 = arrayList.indexOf(imageReceiver3);
                            if (indexOf2 != -1 && (((Integer) nbVar4.z.get(indexOf2)).intValue() == i27 || (indexOf2 = arrayList.subList(indexOf2 + 1, arrayList.size()).indexOf(imageReceiver3)) != -1)) {
                                nbVar4.w.set(indexOf2, Integer.valueOf(i26));
                                nbVar4.x.set(indexOf2, str20);
                                nbVar4.y.set(indexOf2, str21);
                            }
                            z14 = true;
                            if (!z14 || nbVar3 == null) {
                                i26 = i26;
                            } else {
                                i26 = i26;
                                nbVar3.a(imageReceiver3, str20, str21, i27, i26);
                                z14 = true;
                            }
                            if (!z14 && nbVar != null) {
                                nbVar.a(imageReceiver3, str20, str21, i27, i26);
                                z14 = true;
                            }
                        }
                        nbVar = nbVar2;
                        z14 = true;
                        if (z14) {
                        }
                        i26 = i26;
                        if (!z14) {
                            nbVar.a(imageReceiver3, str20, str21, i27, i26);
                            z14 = true;
                        }
                    } else {
                        nbVar = nbVar2;
                        j11 = j14;
                    }
                    z14 = false;
                    if (z14) {
                    }
                    i26 = i26;
                    if (!z14) {
                    }
                } else {
                    z13 = z22;
                    j11 = j14;
                    z14 = false;
                }
                if (z14) {
                    return;
                }
                String str23 = acVar2.g;
                if (str23 != null) {
                    if (str23.startsWith("http") || str23.startsWith("athumb")) {
                        z15 = false;
                        file = null;
                    } else if (str23.startsWith("thumb://")) {
                        int indexOf3 = str23.indexOf(":", 8);
                        if (indexOf3 >= 0) {
                            file = new File(str23.substring(indexOf3 + 1));
                            z15 = true;
                        }
                        file = null;
                        z15 = true;
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
                        z15 = true;
                    }
                    str5 = str19;
                    str6 = "_";
                    str7 = str20;
                    i16 = i27;
                    i17 = i26;
                    str8 = str22;
                    obj2 = obj3;
                    str9 = "athumb";
                } else if (i24 == 0 && z21) {
                    if (obj3 instanceof zi) {
                        zi ziVar = (zi) obj3;
                        TLRPC.Document F0 = ziVar.F0();
                        i17 = i26;
                        String str24 = ziVar.k.attachPath;
                        w7.G(i28);
                        str9 = "athumb";
                        file2 = w7.N(ziVar.k, false, true);
                        str10 = str24;
                        i18 = zi.M4(ziVar.k) ? 2 : zi.S4(ziVar.k) ? 1 : zi.o1(ziVar.k) instanceof TLRPC.TL_messageMediaDocument ? 3 : zi.o1(ziVar.k) instanceof TLRPC.TL_messageMediaPhoto ? 0 : 4;
                        document2 = F0;
                        z16 = false;
                    } else {
                        i17 = i26;
                        str9 = "athumb";
                        if (document3 != null) {
                            w7.G(i28);
                            File K2 = w7.K(document3, null, true, true);
                            int i30 = zi.L4(document3) ? 2 : 3;
                            document2 = document3;
                            file2 = K2;
                            z16 = true;
                            i18 = i30;
                            str10 = null;
                        } else {
                            z16 = false;
                            str10 = null;
                            i18 = 0;
                            document2 = null;
                            file2 = null;
                        }
                    }
                    if (document2 != null) {
                        if (z13) {
                            obj2 = obj3;
                            str7 = str20;
                            File z24 = w7.z(4);
                            i16 = i27;
                            str5 = str19;
                            StringBuilder sb2 = new StringBuilder("q_");
                            sb2.append(document2.dc_id);
                            sb2.append("_");
                            str6 = "_";
                            str8 = str22;
                            file3 = new File(z24, a1.g.r(sb2, document2.id, ".jpg"));
                            if (file3.exists()) {
                                z17 = true;
                                if (!TextUtils.isEmpty(str10)) {
                                    File file9 = new File(str10);
                                    if (file9.exists()) {
                                        file4 = file9;
                                        if (file4 == null) {
                                            file4 = file2;
                                        }
                                        if (file3 == null) {
                                            String r5 = w7.r(null, document2);
                                            xb xbVar = (xb) zbVar2.l.get(r5);
                                            if (xbVar == null) {
                                                xbVar = new xb();
                                                xbVar.c = new ArrayList();
                                                xbVar.d = new ArrayList();
                                                xbVar.a = document2;
                                                xbVar.b = str21;
                                                xbVar.e = z16;
                                                zbVar2.l.put(r5, xbVar);
                                            }
                                            if (!xbVar.c.contains(imageReceiver3)) {
                                                xbVar.c.add(imageReceiver3);
                                                xbVar.d.add(Integer.valueOf(i17));
                                            }
                                            zbVar2.m.put(i25, r5);
                                            if (file4.exists() && z23) {
                                                zbVar2.v(i18, file4, xbVar);
                                                return;
                                            }
                                            return;
                                        }
                                        file = file3;
                                        z15 = true;
                                        if (i24 != 2) {
                                            return;
                                        }
                                        boolean z25 = acVar2.c != null;
                                        nb nbVar5 = new nb(zbVar2);
                                        nbVar5.a = imageReceiver3.w == 0 ? 0 : 1;
                                        if (!z21) {
                                            int i31 = 2;
                                            if (acVar2.p == 2) {
                                                str11 = str8;
                                            } else if (zi.s3(acVar2.v) || zi.t3(acVar2.i, false) || zi.j4(acVar2.i) || zi.O4(acVar2.i)) {
                                                str11 = str8;
                                                i31 = 2;
                                            } else {
                                                String str25 = acVar2.g;
                                                if (str25 != null && !str25.startsWith("vthumb") && !str25.startsWith("thumb")) {
                                                    String B = zb.B(str25, "jpg");
                                                    if (B.equalsIgnoreCase("webm") || B.equalsIgnoreCase("mp4") || B.equalsIgnoreCase("gif")) {
                                                        str11 = str8;
                                                        nbVar5.l = 2;
                                                    } else {
                                                        str11 = str8;
                                                        if ("tgs".equals(str11)) {
                                                            nbVar5.l = 1;
                                                        }
                                                    }
                                                    if (file == null) {
                                                        TLRPC.PhotoSize photoSize = acVar2.k;
                                                        j12 = 0;
                                                        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                                                            zbVar = zbVar2;
                                                            i19 = i24;
                                                            imageReceiver2 = imageReceiver3;
                                                            str14 = "gl";
                                                            str12 = str11;
                                                            i20 = i29;
                                                            str13 = str5;
                                                            str15 = str6;
                                                            z19 = z17;
                                                            file6 = file;
                                                            j13 = 0;
                                                            z18 = true;
                                                        } else {
                                                            wv wvVar = acVar2.h;
                                                            if (wvVar != null) {
                                                                nbVar5.h = wvVar;
                                                                boolean z26 = wvVar.b.dc_id == Integer.MIN_VALUE;
                                                                str13 = str5;
                                                                zbVar = zbVar2;
                                                                i19 = i24;
                                                                z19 = z17;
                                                                imageReceiver2 = imageReceiver3;
                                                                str14 = "gl";
                                                                str12 = str11;
                                                                file6 = new File(w7.z(4), str13);
                                                                j13 = 0;
                                                                i20 = i29;
                                                                str15 = str6;
                                                                z18 = z26;
                                                            } else {
                                                                str13 = str5;
                                                                boolean z27 = z15;
                                                                i19 = i24;
                                                                z19 = z17;
                                                                if ("g".equals(str21) || "gl".equals(str21) || zb.I(str21) || (i29 == 0 && j11 > 0 && acVar2.g == null && !z25)) {
                                                                    imageReceiver2 = imageReceiver3;
                                                                    TLRPC.Document document4 = acVar2.i;
                                                                    if (document4 != null) {
                                                                        if (document4 instanceof TLRPC.TL_documentEncrypted) {
                                                                            zbVar = zbVar2;
                                                                            file7 = new File(w7.z(4), str13);
                                                                        } else {
                                                                            zbVar = zbVar2;
                                                                            file7 = zi.L4(document4) ? new File(w7.z(2), str13) : new File(w7.z(3), str13);
                                                                        }
                                                                        if ((zb.I(str21) || "g".equals(str21) || "gl".equals(str21)) && !file7.exists()) {
                                                                            File z28 = w7.z(4);
                                                                            str12 = str11;
                                                                            StringBuilder sb3 = new StringBuilder();
                                                                            str14 = "gl";
                                                                            sb3.append(document4.dc_id);
                                                                            str15 = str6;
                                                                            sb3.append(str15);
                                                                            str17 = str21;
                                                                            i23 = i29;
                                                                            file8 = new File(z28, a1.g.r(sb3, document4.id, ".temp"));
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
                                                                                z27 = true;
                                                                            }
                                                                            nbVar5.l = 5;
                                                                        } else if ("application/x-tgsdice".equals(acVar2.i.mime_type)) {
                                                                            nbVar5.l = 1;
                                                                            z27 = true;
                                                                        } else if ("application/x-tgsticker".equals(document4.mime_type)) {
                                                                            nbVar5.l = 1;
                                                                        } else {
                                                                            if ("application/x-tgwallpattern".equals(document4.mime_type)) {
                                                                                nbVar5.l = 3;
                                                                            } else if (w7.B(acVar2.i).endsWith(".svg")) {
                                                                                nbVar5.l = 3;
                                                                            }
                                                                            j13 = document4.size;
                                                                            file6 = file8;
                                                                        }
                                                                        j13 = document4.size;
                                                                        file6 = file8;
                                                                    } else {
                                                                        zbVar = zbVar2;
                                                                        i23 = i29;
                                                                        str14 = "gl";
                                                                        str12 = str11;
                                                                        str15 = str6;
                                                                        str17 = str21;
                                                                        if (acVar2.v != null) {
                                                                            file6 = new File(w7.z(3), str13);
                                                                            j13 = 0;
                                                                        } else {
                                                                            i20 = i23;
                                                                            File file10 = i20 == 1 ? new File(w7.z(4), str13) : new File(w7.z(0), str13);
                                                                            str21 = str17;
                                                                            if (zb.I(str17)) {
                                                                                str18 = str14;
                                                                            } else {
                                                                                if ("g".equals(str21)) {
                                                                                    str18 = str14;
                                                                                } else {
                                                                                    str18 = str14;
                                                                                }
                                                                                if (acVar2.f != null) {
                                                                                }
                                                                                str14 = str18;
                                                                                file6 = file10;
                                                                                j13 = 0;
                                                                                z18 = z27;
                                                                            }
                                                                            File z29 = w7.z(4);
                                                                            StringBuilder sb4 = new StringBuilder();
                                                                            str14 = str18;
                                                                            sb4.append(acVar2.f.volume_id);
                                                                            sb4.append(str15);
                                                                            file10 = new File(z29, a1.g.o(acVar2.f.local_id, ".temp", sb4));
                                                                            file6 = file10;
                                                                            j13 = 0;
                                                                            z18 = z27;
                                                                        }
                                                                    }
                                                                    z18 = z27;
                                                                    str21 = str17;
                                                                    i20 = i23;
                                                                } else {
                                                                    file6 = new File(w7.z(4), str13);
                                                                    if (file6.exists()) {
                                                                        imageReceiver2 = imageReceiver3;
                                                                        i20 = i29;
                                                                        z19 = true;
                                                                    } else {
                                                                        i20 = i29;
                                                                        if (i20 == 2) {
                                                                            imageReceiver2 = imageReceiver3;
                                                                            file6 = new File(w7.z(4), t4.c.q(str13, ".enc"));
                                                                        } else {
                                                                            imageReceiver2 = imageReceiver3;
                                                                        }
                                                                    }
                                                                    TLRPC.Document document5 = acVar2.i;
                                                                    if (document5 != null) {
                                                                        if (document5 instanceof s5) {
                                                                            if (((s5) document5).b == null) {
                                                                                z27 = true;
                                                                            }
                                                                            nbVar5.l = 5;
                                                                        } else if ("application/x-tgsdice".equals(document5.mime_type)) {
                                                                            nbVar5.l = 1;
                                                                            zbVar = zbVar2;
                                                                            z18 = true;
                                                                            str14 = "gl";
                                                                            str12 = str11;
                                                                            j13 = 0;
                                                                            str15 = str6;
                                                                        } else if ("application/x-tgsticker".equals(acVar2.i.mime_type)) {
                                                                            nbVar5.l = 1;
                                                                        } else if ("application/x-tgwallpattern".equals(acVar2.i.mime_type)) {
                                                                            nbVar5.l = 3;
                                                                        } else if (w7.B(acVar2.i).endsWith(".svg")) {
                                                                            nbVar5.l = 3;
                                                                        }
                                                                    }
                                                                    zbVar = zbVar2;
                                                                    str14 = "gl";
                                                                    str12 = str11;
                                                                    j13 = 0;
                                                                    z18 = z27;
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
                                                                z20 = true;
                                                            }
                                                        }
                                                        str16 = str14;
                                                        z20 = false;
                                                        if (z20 || zb.I(str21)) {
                                                            nbVar5.l = 2;
                                                            nbVar5.k = j13;
                                                            nbVar5.c = str21 != null && str21.endsWith("pframe");
                                                            if ("g".equals(str21) || str16.equals(str21) || zb.I(str21)) {
                                                                file5 = file6;
                                                                i21 = i16;
                                                                z17 = z19;
                                                                z18 = true;
                                                            }
                                                        }
                                                        file5 = file6;
                                                        i21 = i16;
                                                        z17 = z19;
                                                    } else {
                                                        boolean z30 = z15;
                                                        zbVar = zbVar2;
                                                        i19 = i24;
                                                        imageReceiver2 = imageReceiver3;
                                                        str12 = str11;
                                                        i20 = i29;
                                                        str13 = str5;
                                                        j12 = 0;
                                                        file5 = file;
                                                        z18 = z30;
                                                        i21 = i16;
                                                    }
                                                    nbVar5.m = i21;
                                                    String str26 = str7;
                                                    nbVar5.d = str26;
                                                    nbVar5.n = i20;
                                                    nbVar5.f = str21;
                                                    nbVar5.i = acVar2;
                                                    String str27 = str12;
                                                    nbVar5.g = str27;
                                                    nbVar5.o = i28;
                                                    Object obj4 = obj2;
                                                    nbVar5.j = obj4;
                                                    i22 = acVar2.p;
                                                    if (i22 != 0) {
                                                        nbVar5.l = i22;
                                                    }
                                                    if (i20 == 2) {
                                                        Pattern pattern = w7.J;
                                                        nbVar5.r = new File(t0.b.getCacheDir(), t4.c.q(str13, ".enc.key"));
                                                    }
                                                    int i33 = i20;
                                                    ImageReceiver imageReceiver4 = imageReceiver2;
                                                    nbVar5.a(imageReceiver4, str26, str21, i21, i17);
                                                    if (!z18 || z17 || file5.exists()) {
                                                        zb zbVar3 = zbVar;
                                                        nbVar5.p = file5;
                                                        nbVar5.i = acVar2;
                                                        nbVar5.u = new ob(zbVar3, nbVar5);
                                                        zbVar3.i.put(str26, nbVar5);
                                                        zbVar3.j.add(zb.n(str26));
                                                        if (i19 != 0) {
                                                            zbVar3.q.c(nbVar5.u);
                                                            return;
                                                        }
                                                        com.google.android.gms.internal.cast.c0 c0Var = zbVar3.p;
                                                        Runnable runnable2 = nbVar5.u;
                                                        int i34 = nbVar5.a;
                                                        if (i34 != 1) {
                                                            c0Var.getClass();
                                                            runnable2 = new lf.b(i34, runnable2);
                                                        }
                                                        ((lf.a) c0Var.b).execute(runnable2);
                                                        nbVar5.b = runnable2;
                                                        return;
                                                    }
                                                    nbVar5.e = str13;
                                                    zb zbVar4 = zbVar;
                                                    zbVar4.g.put(str13, nbVar5);
                                                    if (nbVar5.c) {
                                                        zbVar4.h.put(str13, nbVar5);
                                                    }
                                                    String str28 = acVar2.g;
                                                    if (str28 != null) {
                                                        nbVar5.q = new File(w7.z(4), t4.c.q(Utilities.a(str28), "_temp.jpg"));
                                                        nbVar5.p = file5;
                                                        if (acVar2.g.startsWith(str9)) {
                                                            mb mbVar = new mb(zbVar4, nbVar5);
                                                            nbVar5.s = mbVar;
                                                            zbVar4.o.add(mbVar);
                                                            zbVar4.T(false);
                                                            return;
                                                        }
                                                        ub ubVar = new ub(zbVar4, nbVar5, j11);
                                                        nbVar5.t = ubVar;
                                                        zbVar4.n.add(ubVar);
                                                        zbVar4.V(false);
                                                        return;
                                                    }
                                                    long j15 = j11;
                                                    int i35 = i19 != 0 ? 3 : imageReceiver4.w;
                                                    if (acVar2.f != null) {
                                                        w7.G(i28).W(acVar2, obj4, str27, i35, (i33 != 0 || (j15 > j12 && acVar2.c == null)) ? i33 : 1);
                                                    } else if (acVar2.i != null) {
                                                        w7.G(i28).X(acVar2.i, obj4, i35, i33);
                                                    } else if (acVar2.h != null) {
                                                        w7 G2 = w7.G(i28);
                                                        wv wvVar2 = acVar2.h;
                                                        if (wvVar2 != null) {
                                                            G2.Y(null, wvVar2, null, null, null, null, null, 0L, i35, 1);
                                                        }
                                                    } else if (acVar2.v != null) {
                                                        w7.G(i28).Y(null, null, acVar2.v, null, null, null, null, 0L, i35, i33);
                                                    }
                                                    if (imageReceiver4.r) {
                                                        zbVar4.w.put(nbVar5.d, 0);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            }
                                            nbVar5.l = i31;
                                            if (file == null) {
                                            }
                                            nbVar5.m = i21;
                                            String str262 = str7;
                                            nbVar5.d = str262;
                                            nbVar5.n = i20;
                                            nbVar5.f = str21;
                                            nbVar5.i = acVar2;
                                            String str272 = str12;
                                            nbVar5.g = str272;
                                            nbVar5.o = i28;
                                            Object obj42 = obj2;
                                            nbVar5.j = obj42;
                                            i22 = acVar2.p;
                                            if (i22 != 0) {
                                            }
                                            if (i20 == 2) {
                                            }
                                            int i332 = i20;
                                            ImageReceiver imageReceiver42 = imageReceiver2;
                                            nbVar5.a(imageReceiver42, str262, str21, i21, i17);
                                            if (z18) {
                                            }
                                            zb zbVar32 = zbVar;
                                            nbVar5.p = file5;
                                            nbVar5.i = acVar2;
                                            nbVar5.u = new ob(zbVar32, nbVar5);
                                            zbVar32.i.put(str262, nbVar5);
                                            zbVar32.j.add(zb.n(str262));
                                            if (i19 != 0) {
                                            }
                                        }
                                        str11 = str8;
                                        if (file == null) {
                                        }
                                        nbVar5.m = i21;
                                        String str2622 = str7;
                                        nbVar5.d = str2622;
                                        nbVar5.n = i20;
                                        nbVar5.f = str21;
                                        nbVar5.i = acVar2;
                                        String str2722 = str12;
                                        nbVar5.g = str2722;
                                        nbVar5.o = i28;
                                        Object obj422 = obj2;
                                        nbVar5.j = obj422;
                                        i22 = acVar2.p;
                                        if (i22 != 0) {
                                        }
                                        if (i20 == 2) {
                                        }
                                        int i3322 = i20;
                                        ImageReceiver imageReceiver422 = imageReceiver2;
                                        nbVar5.a(imageReceiver422, str2622, str21, i21, i17);
                                        if (z18) {
                                        }
                                        zb zbVar322 = zbVar;
                                        nbVar5.p = file5;
                                        nbVar5.i = acVar2;
                                        nbVar5.u = new ob(zbVar322, nbVar5);
                                        zbVar322.i.put(str2622, nbVar5);
                                        zbVar322.j.add(zb.n(str2622));
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
                        z17 = false;
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
                        z15 = true;
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
                    z15 = false;
                }
                z17 = false;
                if (i24 != 2) {
                }
            }
        };
        this.s.e(runnable, imageReceiver.w == 0 ? 0L : 1L);
        imageReceiver.x1.add(runnable);
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
        k2.p1.w(az.h0, new StringBuilder("selected SD card = "));
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                ArrayList arrayList = null;
                if (!TextUtils.isEmpty(az.h0)) {
                    ArrayList d12 = g0.d1();
                    int size = d12.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        File file4 = (File) d12.get(i3);
                        a8.b("root dir " + i3 + " " + file4);
                        if (file4.getAbsolutePath().startsWith(az.h0)) {
                            externalStorageDirectory = file4;
                            break;
                        }
                        i3++;
                    }
                    if (!externalStorageDirectory.getAbsolutePath().startsWith(az.h0) && (externalFilesDirs = t0.b.getExternalFilesDirs(null)) != null) {
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
                                    Utilities.e.c(new hc(11));
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
                    if (TextUtils.isEmpty(az.h0) || !externalStorageDirectory.getAbsolutePath().startsWith(az.h0)) {
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
                        if (file6 != null && !TextUtils.isEmpty(az.h0) && file6.getAbsolutePath().startsWith(az.h0)) {
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
            Utilities.e.c(new hc(11));
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

    public final void v(int i3, File file, xb xbVar) {
        if ((i3 == 0 || i3 == 2 || i3 == 3) && file != null) {
            if (((yb) this.v.get(w7.r(null, xbVar.a))) == null) {
                this.r.c(new yb(this, i3, file, xbVar));
            }
        }
    }

    public final Float w(String str) {
        long[] jArr;
        if (str == null || (jArr = (long[]) this.u.get(str)) == null) {
            return null;
        }
        long j10 = jArr[1];
        return j10 == 0 ? Float.valueOf(0.0f) : Float.valueOf(Math.min(1.0f, jArr[0] / j10));
    }

    public final long[] x(String str) {
        if (str == null) {
            return null;
        }
        return (long[]) this.u.get(str);
    }

    public final BitmapDrawable y(String str) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) this.e.f(str);
        if (!(bitmapDrawable instanceof org.telegram.ui.Components.t5)) {
            return bitmapDrawable;
        }
        org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) bitmapDrawable;
        if (!t5Var.d0 && t5Var.H0 < 15) {
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
