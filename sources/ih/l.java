package ih;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ l(t tVar, int i10) {
        this.a = i10;
        this.b = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                t.Q(this.b);
                break;
            default:
                t tVar = this.b;
                tVar.Y.setValueAnimated((int) tVar.h0.getMinimumBid());
                break;
        }
    }
}
