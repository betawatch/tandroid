package org.telegram.messenger;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class qf implements Runnable {
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

    public /* synthetic */ qf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.i iVar, a0.i iVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.b = i10;
        this.d = arrayList;
        this.c = i11;
        this.n = iVar;
        this.r = iVar2;
        this.f = arrayList2;
        this.h = arrayList3;
        this.s = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$169(this.b, this.d, this.c, (a0.i) this.n, (a0.i) this.r, (ArrayList) this.f, (ArrayList) this.h, (CountDownLatch) this.s);
                return;
            default:
                yf.e eVar = (yf.e) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.b;
                yf.a0[] a0VarArr = (yf.a0[]) this.n;
                int i11 = this.c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.s;
                if (eVar.o.get() || atomicBoolean.get()) {
                    return;
                }
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                if (Build.VERSION.SDK_INT <= 28) {
                    compressFormat = Bitmap.CompressFormat.PNG;
                }
                bitmapArr[i10].compress(compressFormat, eVar.l, a0VarArr[i10]);
                int i12 = a0VarArr[i10].b;
                try {
                    synchronized (eVar.h) {
                        yf.d dVar = new yf.d(i11);
                        dVar.c = (int) randomAccessFile.length();
                        arrayList.add(dVar);
                        randomAccessFile.write(a0VarArr[i10].a, 0, i12);
                        dVar.b = i12;
                        a0VarArr[i10].b();
                    }
                } catch (IOException e7) {
                    e7.printStackTrace();
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
    public /* synthetic */ qf(yf.e eVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, yf.a0[] a0VarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.e = eVar;
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
