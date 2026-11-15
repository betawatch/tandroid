package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class z2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hi.l3 b;

    public /* synthetic */ z2(hi.l3 l3Var, int i7) {
        this.a = i7;
        this.b = l3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        hi.l3 l3Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.E2(l3Var);
                break;
            default:
                float[] fArr = FragmentContextView.X0;
                org.telegram.messenger.g0.E2(l3Var);
                break;
        }
    }
}
