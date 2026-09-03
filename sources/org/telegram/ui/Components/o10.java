package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                fragmentContextView.K.g = 0.0f;
                fragmentContextView.I.invalidate();
                break;
            default:
                float[] fArr = FragmentContextView.J0;
                fragmentContextView.n(true);
                break;
        }
    }
}
