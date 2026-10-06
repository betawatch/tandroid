package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class h6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a7 b;
    public final /* synthetic */ o6 c;
    public final /* synthetic */ p6 d;

    public /* synthetic */ h6(a7 a7Var, o6 o6Var, p6 p6Var, int i10) {
        this.a = i10;
        this.b = a7Var;
        this.c = o6Var;
        this.d = p6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.globalQueue.postRunnable(new h6(this.b, this.c, this.d, 1));
                break;
            default:
                a7.X(this.b, this.c, this.d);
                break;
        }
    }
}
