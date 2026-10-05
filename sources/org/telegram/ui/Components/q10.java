package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FragmentContextView b;

    public /* synthetic */ q10(FragmentContextView fragmentContextView, int i10) {
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
                float[] fArr = FragmentContextView.P0;
                fragmentContextView.o(true);
                break;
        }
    }
}
