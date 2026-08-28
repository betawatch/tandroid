package ff;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public /* synthetic */ c(h hVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i9, d0[] d0VarArr, int i10, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.e = hVar;
        this.f = atomicBoolean;
        this.h = bitmapArr;
        this.b = i9;
        this.n = d0VarArr;
        this.d = i10;
        this.r = randomAccessFile;
        this.c = arrayList;
        this.s = countDownLatchArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h hVar = (h) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i9 = this.b;
                d0[] d0VarArr = (d0[]) this.n;
                int i10 = this.d;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.r;
                ArrayList arrayList = this.c;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.s;
                if (hVar.o.get() || atomicBoolean.get()) {
                    return;
                }
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                if (Build.VERSION.SDK_INT <= 28) {
                    compressFormat = Bitmap.CompressFormat.PNG;
                }
                bitmapArr[i9].compress(compressFormat, hVar.l, d0VarArr[i9]);
                int i11 = d0VarArr[i9].b;
                try {
                    synchronized (hVar.h) {
                        g gVar = new g(i10);
                        gVar.c = (int) randomAccessFile.length();
                        arrayList.add(gVar);
                        randomAccessFile.write(d0VarArr[i9].a, 0, i11);
                        gVar.b = i11;
                        d0VarArr[i9].b();
                    }
                } catch (IOException e10) {
                    e10.printStackTrace();
                    try {
                        randomAccessFile.close();
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        atomicBoolean.set(true);
                        throw th;
                    }
                    atomicBoolean.set(true);
                }
                countDownLatchArr[i9].countDown();
                return;
            default:
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$169(this.b, this.c, this.d, (a0.h) this.f, (a0.h) this.h, (ArrayList) this.n, (ArrayList) this.r, (CountDownLatch) this.s);
                return;
        }
    }

    public /* synthetic */ c(MessagesStorage messagesStorage, int i9, ArrayList arrayList, int i10, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.b = i9;
        this.c = arrayList;
        this.d = i10;
        this.f = hVar;
        this.h = hVar2;
        this.n = arrayList2;
        this.r = arrayList3;
        this.s = countDownLatch;
    }
}
