package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fi.m3 b;

    public /* synthetic */ a3(fi.m3 m3Var, int i7) {
        this.a = i7;
        this.b = m3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        fi.m3 m3Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.E2(m3Var);
                break;
            default:
                float[] fArr = FragmentContextView.W0;
                org.telegram.messenger.g0.E2(m3Var);
                break;
        }
    }
}
