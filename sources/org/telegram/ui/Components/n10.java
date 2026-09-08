package org.telegram.ui.Components;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class n10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FragmentContextView b;

    public /* synthetic */ n10(FragmentContextView fragmentContextView, int i10) {
        this.a = i10;
        this.b = fragmentContextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        FragmentContextView fragmentContextView = this.b;
        switch (i10) {
            case 0:
                fragmentContextView.N.g = 0.0f;
                fragmentContextView.L.invalidate();
                break;
            default:
                float[] fArr = FragmentContextView.M0;
                fragmentContextView.n(true);
                break;
        }
    }
}
