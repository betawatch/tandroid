package jf;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Cloneable h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c(g gVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, c0[] c0VarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.e = gVar;
        this.f = atomicBoolean;
        this.h = bitmapArr;
        this.b = i10;
        this.n = c0VarArr;
        this.d = i11;
        this.r = randomAccessFile;
        this.c = arrayList;
        this.s = countDownLatchArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g gVar = (g) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.b;
                c0[] c0VarArr = (c0[]) this.n;
                int i11 = this.d;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.r;
                ArrayList arrayList = this.c;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.s;
                if (gVar.o.get() || atomicBoolean.get()) {
                    return;
                }
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                if (Build.VERSION.SDK_INT <= 28) {
                    compressFormat = Bitmap.CompressFormat.PNG;
                }
                bitmapArr[i10].compress(compressFormat, gVar.l, c0VarArr[i10]);
                int i12 = c0VarArr[i10].b;
                try {
                    synchronized (gVar.h) {
                        f fVar = new f(i11);
                        fVar.c = (int) randomAccessFile.length();
                        arrayList.add(fVar);
                        randomAccessFile.write(c0VarArr[i10].a, 0, i12);
                        fVar.b = i12;
                        c0VarArr[i10].b();
                    }
                } catch (IOException e10) {
                    e10.printStackTrace();
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
            default:
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$169(this.b, this.c, this.d, (a0.h) this.f, (a0.h) this.h, (ArrayList) this.n, (ArrayList) this.r, (CountDownLatch) this.s);
                return;
        }
    }

    public /* synthetic */ c(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.b = i10;
        this.c = arrayList;
        this.d = i11;
        this.f = hVar;
        this.h = hVar2;
        this.n = arrayList2;
        this.r = arrayList3;
        this.s = countDownLatch;
    }
}
