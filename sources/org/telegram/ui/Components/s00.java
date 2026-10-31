package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FragmentContextView b;

    public /* synthetic */ s00(FragmentContextView fragmentContextView, int i10) {
        this.a = i10;
        this.b = fragmentContextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        FragmentContextView fragmentContextView = this.b;
        switch (i10) {
            case 0:
                fragmentContextView.O.g = 0.0f;
                fragmentContextView.M.invalidate();
                break;
            default:
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.o(true);
                break;
        }
    }
}
