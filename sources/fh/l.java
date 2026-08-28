package fh;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x b;

    public /* synthetic */ l(x xVar, int i9) {
        this.a = i9;
        this.b = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                x.P(this.b);
                break;
            default:
                x xVar = this.b;
                xVar.Y.setValueAnimated((int) xVar.h0.getMinimumBid());
                break;
        }
    }
}
