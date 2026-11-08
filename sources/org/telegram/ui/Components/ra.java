package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ra implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gb b;

    public /* synthetic */ ra(gb gbVar, int i7) {
        this.a = i7;
        this.b = gbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.onExitTransitionStart();
                break;
            default:
                this.b.onEnterTransitionStart();
                break;
        }
    }
}
