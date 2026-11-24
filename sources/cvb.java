// default package

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class cvb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ cvb(Toolbar toolbar, byte b) {
        this.a = b;
        this.b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Toolbar toolbar = this.b;
        switch (b) {
            case 0:
                evb evbVar = toolbar.f0;
                c27 c27Var = evbVar == null ? null : evbVar.b;
                if (c27Var != null) {
                    c27Var.collapseActionView();
                    break;
                }
                break;
            default:
                toolbar.m();
                break;
        }
    }
}
