package org.telegram.messenger;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class sf implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Cloneable n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ sf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.b = i10;
        this.d = arrayList;
        this.c = i11;
        this.n = hVar;
        this.r = hVar2;
        this.f = arrayList2;
        this.h = arrayList3;
        this.s = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$169(this.b, this.d, this.c, (a0.h) this.n, (a0.h) this.r, (ArrayList) this.f, (ArrayList) this.h, (CountDownLatch) this.s);
                return;
            default:
                zf.f fVar = (zf.f) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.b;
                zf.a0[] a0VarArr = (zf.a0[]) this.n;
                int i11 = this.c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.s;
                if (fVar.o.get() || atomicBoolean.get()) {
                    return;
                }
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                if (Build.VERSION.SDK_INT <= 28) {
                    compressFormat = Bitmap.CompressFormat.PNG;
                }
                bitmapArr[i10].compress(compressFormat, fVar.l, a0VarArr[i10]);
                int i12 = a0VarArr[i10].b;
                try {
                    synchronized (fVar.h) {
                        zf.e eVar = new zf.e(i11);
                        eVar.c = (int) randomAccessFile.length();
                        arrayList.add(eVar);
                        randomAccessFile.write(a0VarArr[i10].a, 0, i12);
                        eVar.b = i12;
                        a0VarArr[i10].b();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    try {
                        randomAccessFile.close();
                    } catch (Exception unused) {
                    } catch (Throwable th2) {
                        atomicBoolean.set(true);
                        throw th2;
                    }
                    atomicBoolean.set(true);
                }
                countDownLatchArr[i10].countDown();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ sf(zf.f fVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, zf.a0[] a0VarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.e = fVar;
        this.f = atomicBoolean;
        this.h = bitmapArr;
        this.b = i10;
        this.n = a0VarArr;
        this.c = i11;
        this.r = randomAccessFile;
        this.d = arrayList;
        this.s = countDownLatchArr;
    }
}
