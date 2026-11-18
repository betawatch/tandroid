package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
