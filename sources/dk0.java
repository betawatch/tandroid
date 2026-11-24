// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import j$.util.Comparator$-CC;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class dk0 {
    public static int A;
    public static kp B;
    public static boolean v;
    public static volatile boolean x;
    public static ThreadPoolExecutor z;
    public final bk0 a;
    public final int b;
    public final int c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList e;
    public final boolean f;
    public byte[] g;
    public final Object h;
    public int i;
    public boolean j;
    public volatile boolean k;
    public final byte l;
    public final File m;
    public int n;
    public final AtomicBoolean o;
    public final o1 p;
    public volatile boolean q;
    public volatile boolean r;
    public RandomAccessFile s;
    public BitmapFactory.Options t;
    public Bitmap u;
    public static final ConcurrentHashMap w = new ConcurrentHashMap();
    public static final int y = Utilities.j(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public dk0(File file, bk0 bk0Var, ak0 ak0Var, int i, int i2, boolean z2, int i3) {
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.h = new Object();
        this.o = new AtomicBoolean(false);
        this.p = new o1(this, (byte) 8);
        this.a = bk0Var;
        this.b = i;
        this.c = i2;
        this.l = ak0Var.a;
        String name = file.getName();
        if (z == null) {
            int i4 = y;
            z = new ThreadPoolExecutor(i4, i4, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        File file2 = new File(ba4.j(4), "acache");
        if (!v) {
            file2.mkdir();
            v = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("_");
        sb.append(i);
        sb.append("_");
        sb.append(i2);
        sb.append(z2 ? "_nolimit" : " ");
        File file3 = new File(file2, b00.j(sb, i3 != 0 ? de9.k(i3, "_fitz") : "", ".pcache2"));
        this.m = file3;
        this.f = i < gl.L(60.0f) && i2 < gl.L(60.0f);
        if (gba.o() < 2) {
            this.k = false;
            this.q = false;
            return;
        }
        this.k = file3.exists();
        if (!this.k) {
            return;
        }
        try {
            try {
                randomAccessFile = new RandomAccessFile(file3, "r");
                try {
                    this.q = randomAccessFile.readBoolean();
                    if (this.q && arrayList.isEmpty()) {
                        randomAccessFile.seek(randomAccessFile.readInt());
                        int readInt = randomAccessFile.readInt();
                        d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                        if (arrayList.size() == 0) {
                            this.q = false;
                            this.k = false;
                            file3.delete();
                        } else {
                            if (this.s != randomAccessFile) {
                                a();
                            }
                            this.s = randomAccessFile;
                        }
                    }
                    if (this.s != randomAccessFile) {
                        randomAccessFile.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        th.printStackTrace();
                        this.m.delete();
                        this.k = false;
                        if (this.s == randomAccessFile || randomAccessFile == null) {
                            return;
                        }
                        randomAccessFile.close();
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void c() {
        int i = A - 1;
        A = i;
        if (i <= 0) {
            A = 0;
            oy8.U0.postRunnable(new jc((byte) 9));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.s;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a6 A[Catch: IOException -> 0x01c3, FileNotFoundException -> 0x01c8, all -> 0x01d2, TRY_LEAVE, TryCatch #3 {IOException -> 0x01c3, blocks: (B:3:0x0002, B:20:0x004b, B:33:0x0061, B:41:0x006f, B:50:0x0078, B:52:0x0085, B:53:0x008c, B:54:0x00ba, B:116:0x00be, B:56:0x00c6, B:58:0x00ce, B:60:0x00d4, B:95:0x00df, B:72:0x00e6, B:74:0x00ea, B:77:0x00ee, B:80:0x00f6, B:82:0x00f3, B:86:0x00f9, B:87:0x011a, B:89:0x0120, B:91:0x013d, B:64:0x0177, B:67:0x0191, B:98:0x0198, B:99:0x01a2, B:101:0x01a6, B:104:0x01aa, B:107:0x01b2, B:109:0x01af, B:113:0x01b5, B:119:0x00c3), top: B:2:0x0002, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0085 A[Catch: IOException -> 0x01c3, FileNotFoundException -> 0x01c8, all -> 0x01d2, TryCatch #3 {IOException -> 0x01c3, blocks: (B:3:0x0002, B:20:0x004b, B:33:0x0061, B:41:0x006f, B:50:0x0078, B:52:0x0085, B:53:0x008c, B:54:0x00ba, B:116:0x00be, B:56:0x00c6, B:58:0x00ce, B:60:0x00d4, B:95:0x00df, B:72:0x00e6, B:74:0x00ea, B:77:0x00ee, B:80:0x00f6, B:82:0x00f3, B:86:0x00f9, B:87:0x011a, B:89:0x0120, B:91:0x013d, B:64:0x0177, B:67:0x0191, B:98:0x0198, B:99:0x01a2, B:101:0x01a6, B:104:0x01aa, B:107:0x01b2, B:109:0x01af, B:113:0x01b5, B:119:0x00c3), top: B:2:0x0002, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        kp kpVar;
        final CountDownLatch[] countDownLatchArr;
        final int i;
        CountDownLatch countDownLatch;
        RandomAccessFile randomAccessFile;
        try {
            try {
                try {
                    if (this.m.exists()) {
                        RandomAccessFile randomAccessFile2 = null;
                        try {
                            try {
                                randomAccessFile = new RandomAccessFile(this.m, "r");
                            } catch (Throwable unused) {
                            }
                            try {
                                this.q = randomAccessFile.readBoolean();
                            } catch (Throwable unused2) {
                                randomAccessFile2 = randomAccessFile;
                                try {
                                    this.m.delete();
                                } catch (Throwable unused3) {
                                }
                                if (this.s != randomAccessFile2 && randomAccessFile2 != null) {
                                    randomAccessFile2.close();
                                }
                                final RandomAccessFile randomAccessFile3 = new RandomAccessFile(this.m, "rw");
                                kpVar = B;
                                if (kpVar == null) {
                                }
                                kpVar.a(this.c, this.b);
                                kp kpVar2 = B;
                                final Bitmap[] bitmapArr = (Bitmap[]) kpVar2.d;
                                final dm5[] dm5VarArr = (dm5[]) kpVar2.c;
                                countDownLatchArr = new CountDownLatch[y];
                                final ArrayList arrayList = new ArrayList();
                                randomAccessFile3.writeBoolean(false);
                                randomAccessFile3.writeInt(0);
                                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                                this.a.b();
                                i = 0;
                                final int i2 = 0;
                                while (true) {
                                    countDownLatch = countDownLatchArr[i];
                                    if (countDownLatch != null) {
                                    }
                                    if (this.o.get()) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                boolean z2 = w01.a;
                                fa4.b("cancelled cache generation");
                                atomicBoolean.set(true);
                                while (r14 < y) {
                                }
                                randomAccessFile3.close();
                                this.a.c();
                            }
                        } catch (Throwable unused4) {
                        }
                        if (this.q) {
                            this.e.clear();
                            randomAccessFile.seek(randomAccessFile.readInt());
                            int readInt = randomAccessFile.readInt();
                            if (readInt > 10000) {
                                readInt = 0;
                            }
                            if (readInt > 0) {
                                d(randomAccessFile, readInt);
                                randomAccessFile.seek(0L);
                                if (this.s != randomAccessFile) {
                                    a();
                                }
                                this.s = randomAccessFile;
                                this.k = true;
                                if (this.s != randomAccessFile) {
                                    try {
                                        randomAccessFile.close();
                                    } catch (Throwable unused5) {
                                    }
                                }
                            }
                            this.k = false;
                            this.q = false;
                        }
                        if (!this.q) {
                            this.m.delete();
                        }
                        if (this.s != randomAccessFile) {
                            randomAccessFile.close();
                        }
                    }
                    final RandomAccessFile randomAccessFile32 = new RandomAccessFile(this.m, "rw");
                    kpVar = B;
                    if (kpVar == null) {
                        kpVar = new kp((byte) 1);
                        B = kpVar;
                    }
                    kpVar.a(this.c, this.b);
                    kp kpVar22 = B;
                    final Bitmap[] bitmapArr2 = (Bitmap[]) kpVar22.d;
                    final dm5[] dm5VarArr2 = (dm5[]) kpVar22.c;
                    countDownLatchArr = new CountDownLatch[y];
                    final ArrayList arrayList2 = new ArrayList();
                    randomAccessFile32.writeBoolean(false);
                    randomAccessFile32.writeInt(0);
                    final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                    this.a.b();
                    i = 0;
                    final int i22 = 0;
                    while (true) {
                        countDownLatch = countDownLatchArr[i];
                        if (countDownLatch != null) {
                            try {
                                countDownLatch.await();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        if (this.o.get() || atomicBoolean2.get()) {
                            break;
                        }
                        int a = this.a.a(bitmapArr2[i]);
                        if (a == -1) {
                            atomicBoolean2.set(true);
                        } else if (a != 1) {
                            for (int i3 = 0; i3 < y; i3++) {
                                CountDownLatch countDownLatch2 = countDownLatchArr[i3];
                                if (countDownLatch2 != null) {
                                    try {
                                        countDownLatch2.await();
                                    } catch (InterruptedException e2) {
                                        e2.printStackTrace();
                                    }
                                }
                            }
                            int length = (int) randomAccessFile32.length();
                            Collections.sort(arrayList2, Comparator$-CC.comparingInt(new mm((byte) 2)));
                            dm5VarArr2[0].b();
                            int size = arrayList2.size();
                            dm5VarArr2[0].c(size);
                            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                dm5VarArr2[0].c(((ck0) arrayList2.get(i4)).c);
                                dm5VarArr2[0].c(((ck0) arrayList2.get(i4)).b);
                            }
                            randomAccessFile32.write(dm5VarArr2[0].a, 0, (size << 3) + 4);
                            dm5VarArr2[0].b();
                            randomAccessFile32.seek(0L);
                            randomAccessFile32.writeBoolean(true);
                            randomAccessFile32.writeInt(length);
                            atomicBoolean2.set(true);
                            randomAccessFile32.close();
                            this.e.clear();
                            this.e.addAll(arrayList2);
                            a();
                            this.s = new RandomAccessFile(this.m, "r");
                            this.q = true;
                            this.k = true;
                        } else {
                            countDownLatchArr[i] = new CountDownLatch(1);
                            z.execute(new Runnable() { // from class: zj0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    dk0 dk0Var = dk0.this;
                                    AtomicBoolean atomicBoolean3 = atomicBoolean2;
                                    CountDownLatch[] countDownLatchArr2 = countDownLatchArr;
                                    int i5 = i;
                                    Bitmap[] bitmapArr3 = bitmapArr2;
                                    dm5[] dm5VarArr3 = dm5VarArr2;
                                    int i6 = i22;
                                    RandomAccessFile randomAccessFile4 = randomAccessFile32;
                                    ArrayList arrayList3 = arrayList2;
                                    if (dk0Var.o.get() || atomicBoolean3.get()) {
                                        countDownLatchArr2[i5].countDown();
                                        return;
                                    }
                                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                                    if (Build.VERSION.SDK_INT <= 28) {
                                        compressFormat = Bitmap.CompressFormat.PNG;
                                    }
                                    bitmapArr3[i5].compress(compressFormat, dk0Var.l, dm5VarArr3[i5]);
                                    int i7 = dm5VarArr3[i5].b;
                                    try {
                                        synchronized (dk0Var.h) {
                                            ck0 ck0Var = new ck0(i6);
                                            ck0Var.c = (int) randomAccessFile4.length();
                                            arrayList3.add(ck0Var);
                                            randomAccessFile4.write(dm5VarArr3[i5].a, 0, i7);
                                            ck0Var.b = i7;
                                            dm5VarArr3[i5].b();
                                        }
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                        try {
                                            randomAccessFile4.close();
                                        } catch (Exception unused6) {
                                        } catch (Throwable th) {
                                            atomicBoolean3.set(true);
                                            throw th;
                                        }
                                        atomicBoolean3.set(true);
                                    }
                                    countDownLatchArr2[i5].countDown();
                                }
                            });
                            i++;
                            i22++;
                            if (i >= y) {
                                i = 0;
                            }
                            this.d.set(i22);
                        }
                    }
                    boolean z22 = w01.a;
                    fa4.b("cancelled cache generation");
                    atomicBoolean2.set(true);
                    for (int i5 = 0; i5 < y; i5++) {
                        CountDownLatch countDownLatch3 = countDownLatchArr[i5];
                        if (countDownLatch3 != null) {
                            try {
                                countDownLatch3.await();
                            } catch (InterruptedException e3) {
                                e3.printStackTrace();
                            }
                        }
                    }
                    randomAccessFile32.close();
                    this.a.c();
                } finally {
                    this.a.c();
                }
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        } catch (FileNotFoundException e5) {
            e5.printStackTrace();
        }
    }

    public final void d(RandomAccessFile randomAccessFile, int i) {
        if (i != 0) {
            byte[] bArr = new byte[i << 3];
            randomAccessFile.read(bArr);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            for (int i2 = 0; i2 < i; i2++) {
                ck0 ck0Var = new ck0(i2);
                ck0Var.c = wrap.getInt();
                ck0Var.b = wrap.getInt();
                this.e.add(ck0Var);
            }
        }
    }

    public final byte[] e(ck0 ck0Var) {
        boolean z2 = this.f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_");
        byte[] bArr = z2 ? (byte[]) w.get(Thread.currentThread()) : this.g;
        if (bArr != null && bArr.length >= ck0Var.b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (ck0Var.b * 1.3f)];
        if (!z2) {
            this.g = bArr2;
            return bArr2;
        }
        w.put(Thread.currentThread(), bArr2);
        if (!x) {
            x = true;
            gl.e3(this.p, 5000L);
        }
        return bArr2;
    }

    public final int f(int i, Bitmap bitmap) {
        RandomAccessFile randomAccessFile;
        BitmapFactory.Options options;
        if (!this.j) {
            RandomAccessFile randomAccessFile2 = null;
            try {
                if (this.q || this.k) {
                    if (!this.q || (randomAccessFile = this.s) == null) {
                        randomAccessFile = new RandomAccessFile(this.m, "r");
                        try {
                            this.q = randomAccessFile.readBoolean();
                            if (this.q && this.e.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                d(randomAccessFile, randomAccessFile.readInt());
                            }
                            if (this.e.size() == 0) {
                                this.q = false;
                            }
                            if (!this.q) {
                                randomAccessFile.close();
                                return -1;
                            }
                        } catch (FileNotFoundException unused) {
                            randomAccessFile2 = randomAccessFile;
                            if (this.j && randomAccessFile2 != null) {
                                try {
                                    randomAccessFile2.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                            return -1;
                        } catch (Throwable th) {
                            th = th;
                            randomAccessFile2 = randomAccessFile;
                            fa4.g(th, false);
                            int i2 = this.n + 1;
                            this.n = i2;
                            if (i2 > 10) {
                                this.j = true;
                            }
                            if (this.j) {
                                randomAccessFile2.close();
                            }
                            return -1;
                        }
                    }
                    if (this.e.size() != 0) {
                        ck0 ck0Var = (ck0) this.e.get(Utilities.j(i, this.e.size() - 1, 0));
                        randomAccessFile.seek(ck0Var.c);
                        byte[] e2 = e(ck0Var);
                        randomAccessFile.readFully(e2, 0, ck0Var.b);
                        if (this.r) {
                            this.s = null;
                            randomAccessFile.close();
                        } else {
                            if (this.s != randomAccessFile) {
                                a();
                            }
                            this.s = randomAccessFile;
                        }
                        if (this.t == null) {
                            this.t = new BitmapFactory.Options();
                        }
                        boolean z2 = bitmap.getConfig() == Bitmap.Config.ALPHA_8;
                        if (z2) {
                            Bitmap bitmap2 = this.u;
                            if (bitmap2 == null || bitmap2.getWidth() != bitmap.getWidth() || this.u.getHeight() != bitmap.getHeight()) {
                                this.u = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                            }
                            options = this.t;
                            options.inBitmap = this.u;
                        } else {
                            options = this.t;
                            options.inBitmap = bitmap;
                        }
                        BitmapFactory.decodeByteArray(e2, 0, ck0Var.b, options);
                        if (z2) {
                            Utilities.extractAlpha(this.u, bitmap);
                        }
                        this.t.inBitmap = null;
                        return 0;
                    }
                }
            } catch (FileNotFoundException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return -1;
    }

    public final boolean g() {
        return (this.q && this.k) ? false : true;
    }
}
