package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c7 b;
    public final /* synthetic */ q6 c;
    public final /* synthetic */ r6 d;

    public /* synthetic */ i6(c7 c7Var, q6 q6Var, r6 r6Var, int i10) {
        this.a = i10;
        this.b = c7Var;
        this.c = q6Var;
        this.d = r6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.globalQueue.postRunnable(new i6(this.b, this.c, this.d, 1));
                break;
            default:
                c7.X(this.b, this.c, this.d);
                break;
        }
    }
}
