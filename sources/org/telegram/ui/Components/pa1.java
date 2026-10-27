package org.telegram.ui.Components;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pa1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ CountDownLatch c;

    public /* synthetic */ pa1(Runnable runnable, CountDownLatch countDownLatch, int i10) {
        this.a = i10;
        this.b = runnable;
        this.c = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        switch (this.a) {
            case 0:
                Runnable runnable = this.b;
                countDownLatch = this.c;
                try {
                    runnable.run();
                    return;
                } finally {
                }
            default:
                Runnable runnable2 = this.b;
                countDownLatch = this.c;
                try {
                    runnable2.run();
                    return;
                } finally {
                }
        }
    }
}
