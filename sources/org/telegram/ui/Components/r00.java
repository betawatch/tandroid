package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FragmentContextView b;

    public /* synthetic */ r00(FragmentContextView fragmentContextView, int i7) {
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
