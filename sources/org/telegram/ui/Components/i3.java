package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class i3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hi.l3 b;

    public /* synthetic */ i3(hi.l3 l3Var, int i7) {
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
