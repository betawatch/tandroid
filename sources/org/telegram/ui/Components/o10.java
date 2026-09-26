package org.telegram.ui.Components;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FragmentContextView b;

    public /* synthetic */ o10(FragmentContextView fragmentContextView, int i10) {
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
                float[] fArr = FragmentContextView.O0;
                fragmentContextView.o(true);
                break;
        }
    }
}
