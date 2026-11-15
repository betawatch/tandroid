package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class i00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FragmentContextView b;

    public /* synthetic */ i00(FragmentContextView fragmentContextView, int i7) {
        this.a = i7;
        this.b = fragmentContextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        FragmentContextView fragmentContextView = this.b;
        switch (i7) {
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
