package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FragmentContextView b;

    public /* synthetic */ y00(FragmentContextView fragmentContextView, int i9) {
        this.a = i9;
        this.b = fragmentContextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        FragmentContextView fragmentContextView = this.b;
        switch (i9) {
            case 0:
                fragmentContextView.J.g = 0.0f;
                fragmentContextView.H.invalidate();
                break;
            default:
                float[] fArr = FragmentContextView.I0;
                fragmentContextView.n(true);
                break;
        }
    }
}
