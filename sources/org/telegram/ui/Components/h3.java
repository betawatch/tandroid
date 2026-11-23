package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class h3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hi.u3 b;

    public /* synthetic */ h3(hi.u3 u3Var, int i7) {
        this.a = i7;
        this.b = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        hi.u3 u3Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.E2(u3Var);
                break;
            default:
                float[] fArr = FragmentContextView.X0;
                org.telegram.messenger.g0.E2(u3Var);
                break;
        }
    }
}
