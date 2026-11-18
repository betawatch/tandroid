package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class p00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FragmentContextView b;

    public /* synthetic */ p00(FragmentContextView fragmentContextView, int i7) {
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
