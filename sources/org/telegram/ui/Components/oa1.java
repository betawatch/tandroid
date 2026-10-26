package org.telegram.ui.Components;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oa1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ CountDownLatch c;

    public /* synthetic */ oa1(Runnable runnable, CountDownLatch countDownLatch, int i10) {
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
