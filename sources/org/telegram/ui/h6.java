package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b7 b;
    public final /* synthetic */ p6 c;
    public final /* synthetic */ q6 d;

    public /* synthetic */ h6(b7 b7Var, p6 p6Var, q6 q6Var, int i10) {
        this.a = i10;
        this.b = b7Var;
        this.c = p6Var;
        this.d = q6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.globalQueue.postRunnable(new h6(this.b, this.c, this.d, 1));
                break;
            default:
                b7.W(this.b, this.c, this.d);
                break;
        }
    }
}
