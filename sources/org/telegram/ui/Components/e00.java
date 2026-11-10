package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FragmentContextView b;

    public /* synthetic */ e00(FragmentContextView fragmentContextView, int i7) {
        this.a = i7;
        this.b = fragmentContextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        FragmentContextView fragmentContextView = this.b;
        switch (i7) {
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
