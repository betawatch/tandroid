package ag;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
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
    public /* synthetic */ d(k kVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, i0[] i0VarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.e = kVar;
        this.f = atomicBoolean;
        this.h = bitmapArr;
        this.b = i10;
        this.n = i0VarArr;
        this.d = i11;
        this.r = randomAccessFile;
        this.c = arrayList;
        this.s = countDownLatchArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k kVar = (k) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.b;
                i0[] i0VarArr = (i0[]) this.n;
                int i11 = this.d;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.r;
                ArrayList arrayList = this.c;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.s;
                if (kVar.o.get() || atomicBoolean.get()) {
                    return;
                }
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                if (Build.VERSION.SDK_INT <= 28) {
                    compressFormat = Bitmap.CompressFormat.PNG;
                }
                bitmapArr[i10].compress(compressFormat, kVar.l, i0VarArr[i10]);
                int i12 = i0VarArr[i10].b;
                try {
                    synchronized (kVar.h) {
                        i iVar = new i(i11);
                        iVar.c = (int) randomAccessFile.length();
                        arrayList.add(iVar);
                        randomAccessFile.write(i0VarArr[i10].a, 0, i12);
                        iVar.b = i12;
                        i0VarArr[i10].b();
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
            default:
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$173(this.b, this.c, this.d, (a0.h) this.f, (a0.h) this.h, (ArrayList) this.n, (ArrayList) this.r, (CountDownLatch) this.s);
                return;
        }
    }

    public /* synthetic */ d(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
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
