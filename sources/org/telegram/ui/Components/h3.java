package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hi.m3 b;

    public /* synthetic */ h3(hi.m3 m3Var, int i7) {
        this.a = i7;
        this.b = m3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        hi.m3 m3Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.E2(m3Var);
                break;
            default:
                float[] fArr = FragmentContextView.X0;
                org.telegram.messenger.g0.E2(m3Var);
                break;
        }
    }
}
