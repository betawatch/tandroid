package gf;

import ag.l3;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.oi0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h {
    public static int A;
    public static b6.a B;
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
    public final a8.b p;
    public volatile boolean q;
    public volatile boolean r;
    public RandomAccessFile s;
    public BitmapFactory.Options t;
    public Bitmap u;
    public static final ConcurrentHashMap w = new ConcurrentHashMap();
    public static final int y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    /* JADX WARN: Multi-variable type inference failed */
    public h(File file, f fVar, ge.i iVar, int i10, int i11, boolean z10, int i12) {
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.h = new Object();
        this.o = new AtomicBoolean(false);
        this.p = new a8.b(this, 20);
        this.a = (BitmapDrawable) fVar;
        this.b = i10;
        this.c = i11;
        this.l = iVar.a;
        String name = file.getName();
        if (z == null) {
            int i13 = y;
            z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        File file2 = new File(FileLoader.checkDirectory(4), "acache");
        if (!v) {
            file2.mkdir();
            v = true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.append("_");
        sb2.append(i10);
        sb2.append("_");
        sb2.append(i11);
        sb2.append(z10 ? "_nolimit" : " ");
        File file3 = new File(file2, a9.p.p(sb2, i12 != 0 ? i0.a.k(i12, "_fitz") : "", ".pcache2"));
        this.m = file3;
        this.f = i10 < AndroidUtilities.dp(60.0f) && i11 < AndroidUtilities.dp(60.0f);
        if (SharedConfig.getDevicePerformanceClass() < 2) {
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
            } catch (IOException e9) {
                e9.printStackTrace();
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    public static void c() {
        int i10 = A - 1;
        A = i10;
        if (i10 <= 0) {
            A = 0;
            oi0.P0.postRunnable(new l3(3));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.s;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e9) {
                e9.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01be, code lost:
    
        r0 = r9[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c0, code lost:
    
        if (r0 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c2, code lost:
    
        r0.await();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01c6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01c7, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01d4, code lost:
    
        r7.close();
        r16.a.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b0, code lost:
    
        if (org.telegram.messenger.BuildVars.DEBUG_VERSION == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b2, code lost:
    
        org.telegram.messenger.FileLog.d("cancelled cache generation");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b7, code lost:
    
        r2.set(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01bc, code lost:
    
        if (r14 >= gf.h.y) goto L137;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096 A[Catch: all -> 0x005c, IOException -> 0x005f, FileNotFoundException -> 0x0062, TryCatch #12 {FileNotFoundException -> 0x0062, IOException -> 0x005f, blocks: (B:3:0x0002, B:20:0x004f, B:33:0x0072, B:41:0x007f, B:50:0x0088, B:52:0x0096, B:53:0x00a0, B:54:0x00d0, B:120:0x00d4, B:56:0x00dc, B:58:0x00e4, B:60:0x00ec, B:70:0x00f7, B:72:0x00fb, B:75:0x00ff, B:78:0x0107, B:80:0x0104, B:84:0x010a, B:85:0x012b, B:87:0x0131, B:89:0x014e, B:62:0x018d, B:66:0x01a7, B:94:0x01ae, B:96:0x01b2, B:97:0x01b7, B:98:0x01ba, B:100:0x01be, B:112:0x01c2, B:102:0x01ca, B:115:0x01c7, B:117:0x01d4, B:123:0x00d9), top: B:2:0x0002, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018d A[Catch: all -> 0x005c, IOException -> 0x005f, FileNotFoundException -> 0x0062, TRY_ENTER, TryCatch #12 {FileNotFoundException -> 0x0062, IOException -> 0x005f, blocks: (B:3:0x0002, B:20:0x004f, B:33:0x0072, B:41:0x007f, B:50:0x0088, B:52:0x0096, B:53:0x00a0, B:54:0x00d0, B:120:0x00d4, B:56:0x00dc, B:58:0x00e4, B:60:0x00ec, B:70:0x00f7, B:72:0x00fb, B:75:0x00ff, B:78:0x0107, B:80:0x0104, B:84:0x010a, B:85:0x012b, B:87:0x0131, B:89:0x014e, B:62:0x018d, B:66:0x01a7, B:94:0x01ae, B:96:0x01b2, B:97:0x01b7, B:98:0x01ba, B:100:0x01be, B:112:0x01c2, B:102:0x01ca, B:115:0x01c7, B:117:0x01d4, B:123:0x00d9), top: B:2:0x0002, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v12, types: [android.graphics.drawable.BitmapDrawable, gf.f] */
    /* JADX WARN: Type inference failed for: r0v19, types: [android.graphics.drawable.BitmapDrawable, gf.f] */
    /* JADX WARN: Type inference failed for: r0v25, types: [android.graphics.drawable.BitmapDrawable, gf.f] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.BitmapDrawable, gf.f] */
    /* JADX WARN: Type inference failed for: r0v39, types: [android.graphics.drawable.BitmapDrawable, gf.f] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.graphics.drawable.BitmapDrawable, gf.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        int i10;
        Bitmap[] bitmapArr;
        CountDownLatch[] countDownLatchArr;
        int i11;
        int i12;
        CountDownLatch countDownLatch;
        RandomAccessFile randomAccessFile;
        try {
            try {
                i10 = 0;
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
                            RandomAccessFile randomAccessFile3 = new RandomAccessFile(this.m, "rw");
                            if (B == null) {
                            }
                            B.a(this.c, this.b);
                            b6.a aVar = B;
                            bitmapArr = (Bitmap[]) aVar.d;
                            d0[] d0VarArr = (d0[]) aVar.b;
                            countDownLatchArr = new CountDownLatch[y];
                            ArrayList arrayList = new ArrayList();
                            randomAccessFile3.writeBoolean(false);
                            randomAccessFile3.writeInt(0);
                            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                            this.a.b();
                            i11 = 0;
                            i12 = 0;
                            while (true) {
                                countDownLatch = countDownLatchArr[i11];
                                if (countDownLatch != null) {
                                }
                                if (!this.o.get()) {
                                    break;
                                } else if (this.a.a(bitmapArr[i11]) == 1) {
                                }
                                this.d.set(i12);
                            }
                            return;
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
                            return;
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
                RandomAccessFile randomAccessFile32 = new RandomAccessFile(this.m, "rw");
                if (B == null) {
                    B = new b6.a(8, (byte) 0);
                }
                B.a(this.c, this.b);
                b6.a aVar2 = B;
                bitmapArr = (Bitmap[]) aVar2.d;
                d0[] d0VarArr2 = (d0[]) aVar2.b;
                countDownLatchArr = new CountDownLatch[y];
                ArrayList arrayList2 = new ArrayList();
                randomAccessFile32.writeBoolean(false);
                randomAccessFile32.writeInt(0);
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                this.a.b();
                i11 = 0;
                i12 = 0;
                while (true) {
                    countDownLatch = countDownLatchArr[i11];
                    if (countDownLatch != null) {
                        try {
                            countDownLatch.await();
                        } catch (InterruptedException e9) {
                            e9.printStackTrace();
                        }
                    }
                    if (!this.o.get() || atomicBoolean2.get()) {
                        break;
                        break;
                    }
                    if (this.a.a(bitmapArr[i11]) == 1) {
                        for (int i13 = 0; i13 < y; i13++) {
                            CountDownLatch countDownLatch2 = countDownLatchArr[i13];
                            if (countDownLatch2 != null) {
                                try {
                                    countDownLatch2.await();
                                } catch (InterruptedException e10) {
                                    e10.printStackTrace();
                                }
                            }
                        }
                        int length = (int) randomAccessFile32.length();
                        Collections.sort(arrayList2, Comparator$-CC.comparingInt(new d(0)));
                        d0VarArr2[0].b();
                        int size = arrayList2.size();
                        d0VarArr2[0].c(size);
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            d0VarArr2[0].c(((g) arrayList2.get(i14)).c);
                            d0VarArr2[0].c(((g) arrayList2.get(i14)).b);
                        }
                        randomAccessFile32.write(d0VarArr2[0].a, 0, (size * 8) + 4);
                        d0VarArr2[0].b();
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
                        countDownLatchArr[i11] = new CountDownLatch(1);
                        z.execute(new c(this, atomicBoolean2, bitmapArr, i11, d0VarArr2, i12, randomAccessFile32, arrayList2, countDownLatchArr));
                        i11++;
                        i12++;
                        if (i11 >= y) {
                            i11 = 0;
                        }
                        this.d.set(i12);
                    }
                }
            } finally {
                this.a.c();
            }
        } catch (FileNotFoundException e11) {
            e11.printStackTrace();
        } catch (IOException e12) {
            e12.printStackTrace();
        }
        return;
        i10++;
        Bitmap bitmap = bitmapArr[i10];
        if (bitmap != null) {
            try {
                bitmap.recycle();
            } catch (Exception unused6) {
            }
        }
        i10++;
    }

    public final void d(RandomAccessFile randomAccessFile, int i10) {
        if (i10 == 0) {
            return;
        }
        byte[] bArr = new byte[i10 * 8];
        randomAccessFile.read(bArr);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        for (int i11 = 0; i11 < i10; i11++) {
            g gVar = new g(i11);
            gVar.c = wrap.getInt();
            gVar.b = wrap.getInt();
            this.e.add(gVar);
        }
    }

    public final byte[] e(g gVar) {
        boolean z10 = this.f && Thread.currentThread().getName().startsWith(DispatchQueuePoolBackground.THREAD_PREFIX);
        byte[] bArr = z10 ? (byte[]) w.get(Thread.currentThread()) : this.g;
        if (bArr != null && bArr.length >= gVar.b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (gVar.b * 1.3f)];
        if (!z10) {
            this.g = bArr2;
            return bArr2;
        }
        w.put(Thread.currentThread(), bArr2);
        if (!x) {
            x = true;
            AndroidUtilities.runOnUIThread(this.p, 5000L);
        }
        return bArr2;
    }

    public final int f(Bitmap bitmap, int i10) {
        RandomAccessFile randomAccessFile;
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
                                } catch (IOException e9) {
                                    e9.printStackTrace();
                                }
                            }
                            return -1;
                        } catch (Throwable th) {
                            th = th;
                            randomAccessFile2 = randomAccessFile;
                            FileLog.e(th, false);
                            int i11 = this.n + 1;
                            this.n = i11;
                            if (i11 > 10) {
                                this.j = true;
                            }
                            if (this.j) {
                                randomAccessFile2.close();
                            }
                            return -1;
                        }
                    }
                    if (this.e.size() != 0) {
                        g gVar = (g) this.e.get(Utilities.clamp(i10, this.e.size() - 1, 0));
                        randomAccessFile.seek(gVar.c);
                        byte[] e10 = e(gVar);
                        randomAccessFile.readFully(e10, 0, gVar.b);
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
                        boolean z10 = bitmap.getConfig() == Bitmap.Config.ALPHA_8;
                        if (z10) {
                            Bitmap bitmap2 = this.u;
                            if (bitmap2 == null || bitmap2.getWidth() != bitmap.getWidth() || this.u.getHeight() != bitmap.getHeight()) {
                                this.u = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                            }
                            this.t.inBitmap = this.u;
                        } else {
                            this.t.inBitmap = bitmap;
                        }
                        BitmapFactory.decodeByteArray(e10, 0, gVar.b, this.t);
                        if (z10) {
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
