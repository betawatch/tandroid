package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FragmentContextView b;

    public /* synthetic */ a00(FragmentContextView fragmentContextView, int i3) {
        this.a = i3;
        this.b = fragmentContextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        FragmentContextView fragmentContextView = this.b;
        switch (i3) {
            case 0:
                fragmentContextView.P.g = 0.0f;
                fragmentContextView.N.invalidate();
                break;
            default:
                float[] fArr = FragmentContextView.X0;
                fragmentContextView.o(true);
                break;
        }
    }
}
