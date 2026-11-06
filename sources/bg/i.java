package bg;

import a8.ra;
import a8.wa;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
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
import org.telegram.messenger.a8;
import org.telegram.messenger.iz;
import org.telegram.messenger.r2;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.zg0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class i {
    public static int A;
    public static wa B;
    public static boolean v;
    public static volatile boolean x;
    public static ThreadPoolExecutor z;
    public final BitmapDrawable a;
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
    public final int l;
    public final File m;
    public int n;
    public final AtomicBoolean o;
    public final ra p;
    public volatile boolean q;
    public volatile boolean r;
    public RandomAccessFile s;
    public BitmapFactory.Options t;
    public Bitmap u;
    public static final ConcurrentHashMap w = new ConcurrentHashMap();
    public static final int y = Utilities.j(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    /* JADX WARN: Multi-variable type inference failed */
    public i(File file, g gVar, f fVar, int i7, int i10, boolean z9, int i11) {
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.h = new Object();
        this.o = new AtomicBoolean(false);
        this.p = new ra(this, 11);
        this.a = (BitmapDrawable) gVar;
        this.b = i7;
        this.c = i10;
        this.l = fVar.a;
        String name = file.getName();
        if (z == null) {
            int i12 = y;
            z = new ThreadPoolExecutor(i12, i12, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        File file2 = new File(w7.j(4), "acache");
        if (!v) {
            file2.mkdir();
            v = true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.append("_");
        sb2.append(i7);
        sb2.append("_");
        sb2.append(i10);
        sb2.append(z9 ? "_nolimit" : " ");
        File file3 = new File(file2, a8.p0.s(sb2, i11 != 0 ? jg.g.j(i11, "_fitz") : "", ".pcache2"));
        this.m = file3;
        this.f = i7 < org.telegram.messenger.g0.L(60.0f) && i10 < org.telegram.messenger.g0.L(60.0f);
        if (iz.o() < 2) {
            this.k = false;
            this.q = false;
            return;
        }
        this.k = file3.exists();
        try {
            if (!this.k) {
                return;
            }
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
                } catch (Throwable th2) {
                    th = th2;
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
            } catch (Throwable th3) {
                th = th3;
                randomAccessFile = null;
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public static void c() {
        int i7 = A - 1;
        A = i7;
        if (i7 <= 0) {
            A = 0;
            zg0.T0.postRunnable(new ai.m0(1));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.s;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x006f, code lost:
    
        if (r16.s != r0) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b4 A[Catch: all -> 0x0057, IOException -> 0x005a, FileNotFoundException -> 0x005d, TRY_LEAVE, TryCatch #12 {FileNotFoundException -> 0x005d, IOException -> 0x005a, blocks: (B:3:0x0002, B:97:0x004a, B:107:0x006d, B:116:0x007b, B:6:0x0082, B:8:0x008f, B:9:0x0096, B:10:0x00c6, B:79:0x00ca, B:12:0x00d2, B:14:0x00da, B:16:0x00e2, B:52:0x00ed, B:28:0x00f4, B:30:0x00f8, B:33:0x00fc, B:36:0x0104, B:38:0x0101, B:42:0x0107, B:43:0x0127, B:45:0x012d, B:47:0x014a, B:20:0x0185, B:23:0x019f, B:56:0x01a6, B:57:0x01b0, B:59:0x01b4, B:71:0x01b8, B:61:0x01c0, B:74:0x01bd, B:76:0x01ca, B:82:0x00cf), top: B:2:0x0002, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008f A[Catch: all -> 0x0057, IOException -> 0x005a, FileNotFoundException -> 0x005d, TryCatch #12 {FileNotFoundException -> 0x005d, IOException -> 0x005a, blocks: (B:3:0x0002, B:97:0x004a, B:107:0x006d, B:116:0x007b, B:6:0x0082, B:8:0x008f, B:9:0x0096, B:10:0x00c6, B:79:0x00ca, B:12:0x00d2, B:14:0x00da, B:16:0x00e2, B:52:0x00ed, B:28:0x00f4, B:30:0x00f8, B:33:0x00fc, B:36:0x0104, B:38:0x0101, B:42:0x0107, B:43:0x0127, B:45:0x012d, B:47:0x014a, B:20:0x0185, B:23:0x019f, B:56:0x01a6, B:57:0x01b0, B:59:0x01b4, B:71:0x01b8, B:61:0x01c0, B:74:0x01bd, B:76:0x01ca, B:82:0x00cf), top: B:2:0x0002, outer: #6 }] */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.graphics.drawable.BitmapDrawable, bg.g] */
    /* JADX WARN: Type inference failed for: r0v24, types: [android.graphics.drawable.BitmapDrawable, bg.g] */
    /* JADX WARN: Type inference failed for: r0v29, types: [android.graphics.drawable.BitmapDrawable, bg.g] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.BitmapDrawable, bg.g] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.graphics.drawable.BitmapDrawable, bg.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        int i7;
        RandomAccessFile randomAccessFile;
        Bitmap[] bitmapArr;
        CountDownLatch[] countDownLatchArr;
        int i10;
        CountDownLatch countDownLatch;
        int a10;
        try {
            try {
                i7 = 0;
            } finally {
                this.a.c();
            }
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
        if (this.m.exists()) {
            try {
                randomAccessFile = new RandomAccessFile(this.m, "r");
            } catch (Throwable unused) {
                randomAccessFile = null;
            }
            try {
                this.q = randomAccessFile.readBoolean();
            } catch (Throwable unused2) {
                try {
                    this.m.delete();
                } catch (Throwable unused3) {
                }
                if (this.s != randomAccessFile && randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable unused4) {
                    }
                }
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.m, "rw");
                if (B == null) {
                }
                B.b(this.c, this.b);
                wa waVar = B;
                bitmapArr = (Bitmap[]) waVar.d;
                d0[] d0VarArr = (d0[]) waVar.c;
                countDownLatchArr = new CountDownLatch[y];
                ArrayList arrayList = new ArrayList();
                randomAccessFile2.writeBoolean(false);
                randomAccessFile2.writeInt(0);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                this.a.b();
                i10 = 0;
                int i11 = 0;
                while (true) {
                    countDownLatch = countDownLatchArr[i10];
                    if (countDownLatch != null) {
                    }
                    if (!this.o.get()) {
                        break;
                    }
                    a10 = this.a.a(bitmapArr[i10]);
                    if (a10 != -1) {
                    }
                }
                boolean z9 = r2.a;
                a8.b("cancelled cache generation");
                atomicBoolean.set(true);
                while (i7 < y) {
                }
                randomAccessFile2.close();
                this.a.c();
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
        }
        RandomAccessFile randomAccessFile22 = new RandomAccessFile(this.m, "rw");
        if (B == null) {
            B = new wa(1, (byte) 0);
        }
        B.b(this.c, this.b);
        wa waVar2 = B;
        bitmapArr = (Bitmap[]) waVar2.d;
        d0[] d0VarArr2 = (d0[]) waVar2.c;
        countDownLatchArr = new CountDownLatch[y];
        ArrayList arrayList2 = new ArrayList();
        randomAccessFile22.writeBoolean(false);
        randomAccessFile22.writeInt(0);
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        this.a.b();
        i10 = 0;
        int i112 = 0;
        while (true) {
            countDownLatch = countDownLatchArr[i10];
            if (countDownLatch != null) {
                try {
                    countDownLatch.await();
                } catch (InterruptedException e12) {
                    e12.printStackTrace();
                }
            }
            if (!this.o.get() || atomicBoolean2.get()) {
                break;
                break;
            }
            a10 = this.a.a(bitmapArr[i10]);
            if (a10 != -1) {
                atomicBoolean2.set(true);
            } else if (a10 != 1) {
                for (int i12 = 0; i12 < y; i12++) {
                    CountDownLatch countDownLatch2 = countDownLatchArr[i12];
                    if (countDownLatch2 != null) {
                        try {
                            countDownLatch2.await();
                        } catch (InterruptedException e13) {
                            e13.printStackTrace();
                        }
                    }
                }
                int length = (int) randomAccessFile22.length();
                Collections.sort(arrayList2, Comparator$-CC.comparingInt(new d(i7)));
                d0VarArr2[0].b();
                int size = arrayList2.size();
                d0VarArr2[0].c(size);
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    d0VarArr2[0].c(((h) arrayList2.get(i13)).c);
                    d0VarArr2[0].c(((h) arrayList2.get(i13)).b);
                }
                randomAccessFile22.write(d0VarArr2[0].a, 0, (size * 8) + 4);
                d0VarArr2[0].b();
                randomAccessFile22.seek(0L);
                randomAccessFile22.writeBoolean(true);
                randomAccessFile22.writeInt(length);
                atomicBoolean2.set(true);
                randomAccessFile22.close();
                this.e.clear();
                this.e.addAll(arrayList2);
                a();
                this.s = new RandomAccessFile(this.m, "r");
                this.q = true;
                this.k = true;
            } else {
                countDownLatchArr[i10] = new CountDownLatch(1);
                z.execute(new c(this, atomicBoolean2, bitmapArr, i10, d0VarArr2, i112, randomAccessFile22, arrayList2, countDownLatchArr));
                i10++;
                i112++;
                if (i10 >= y) {
                    i10 = 0;
                }
                this.d.set(i112);
            }
        }
        boolean z92 = r2.a;
        a8.b("cancelled cache generation");
        atomicBoolean2.set(true);
        while (i7 < y) {
            CountDownLatch countDownLatch3 = countDownLatchArr[i7];
            if (countDownLatch3 != null) {
                try {
                    countDownLatch3.await();
                } catch (InterruptedException e14) {
                    e14.printStackTrace();
                }
            }
            Bitmap bitmap = bitmapArr[i7];
            if (bitmap != null) {
                try {
                    bitmap.recycle();
                } catch (Exception unused6) {
                }
            }
            i7++;
        }
        randomAccessFile22.close();
        this.a.c();
    }

    public final void d(RandomAccessFile randomAccessFile, int i7) {
        if (i7 == 0) {
            return;
        }
        byte[] bArr = new byte[i7 * 8];
        randomAccessFile.read(bArr);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        for (int i10 = 0; i10 < i7; i10++) {
            h hVar = new h(i10);
            hVar.c = wrap.getInt();
            hVar.b = wrap.getInt();
            this.e.add(hVar);
        }
    }

    public final byte[] e(h hVar) {
        boolean z9 = this.f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_");
        byte[] bArr = z9 ? (byte[]) w.get(Thread.currentThread()) : this.g;
        if (bArr != null && bArr.length >= hVar.b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (hVar.b * 1.3f)];
        if (!z9) {
            this.g = bArr2;
            return bArr2;
        }
        w.put(Thread.currentThread(), bArr2);
        if (!x) {
            x = true;
            org.telegram.messenger.g0.i3(this.p, 5000L);
        }
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x011a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(Bitmap bitmap, int i7) {
        RandomAccessFile randomAccessFile;
        int i10;
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
                            if (this.j) {
                            }
                            return -1;
                        } catch (Throwable th2) {
                            th = th2;
                            a8.g(th, false);
                            i10 = this.n + 1;
                            this.n = i10;
                            if (i10 > 10) {
                            }
                            if (this.j) {
                            }
                            return -1;
                        }
                    }
                    try {
                        if (this.e.size() != 0) {
                            h hVar = (h) this.e.get(Utilities.j(i7, this.e.size() - 1, 0));
                            randomAccessFile.seek(hVar.c);
                            byte[] e10 = e(hVar);
                            randomAccessFile.readFully(e10, 0, hVar.b);
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
                            boolean z9 = bitmap.getConfig() == Bitmap.Config.ALPHA_8;
                            if (z9) {
                                Bitmap bitmap2 = this.u;
                                if (bitmap2 == null || bitmap2.getWidth() != bitmap.getWidth() || this.u.getHeight() != bitmap.getHeight()) {
                                    this.u = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                                }
                                this.t.inBitmap = this.u;
                            } else {
                                this.t.inBitmap = bitmap;
                            }
                            BitmapFactory.decodeByteArray(e10, 0, hVar.b, this.t);
                            if (z9) {
                                Utilities.extractAlpha(this.u, bitmap);
                            }
                            this.t.inBitmap = null;
                            return 0;
                        }
                    } catch (FileNotFoundException unused2) {
                        randomAccessFile2 = randomAccessFile;
                        randomAccessFile = randomAccessFile2;
                        if (this.j && randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException e11) {
                                e11.printStackTrace();
                            }
                        }
                        return -1;
                    } catch (Throwable th3) {
                        th = th3;
                        randomAccessFile2 = randomAccessFile;
                        randomAccessFile = randomAccessFile2;
                        a8.g(th, false);
                        i10 = this.n + 1;
                        this.n = i10;
                        if (i10 > 10) {
                            this.j = true;
                        }
                        if (this.j) {
                            randomAccessFile.close();
                        }
                        return -1;
                    }
                }
            } catch (FileNotFoundException unused3) {
            } catch (Throwable th4) {
                th = th4;
            }
        }
        return -1;
    }

    public final boolean g() {
        return (this.q && this.k) ? false : true;
    }
}
