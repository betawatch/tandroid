package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class wa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lb b;

    public /* synthetic */ wa(lb lbVar, int i7) {
        this.a = i7;
        this.b = lbVar;
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
