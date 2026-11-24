// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class mu implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ bx b;
    public final /* synthetic */ View c;

    public /* synthetic */ mu(bx bxVar, View view) {
        this.b = bxVar;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        View view = this.c;
        bx bxVar = this.b;
        switch (b) {
            case 0:
                view.post(new mu(bxVar, view));
                break;
            default:
                bxVar.J.clear();
                bxVar.L.set(null);
                view.invalidate();
                break;
        }
    }

    public /* synthetic */ mu(View view, bx bxVar) {
        this.c = view;
        this.b = bxVar;
    }
}
