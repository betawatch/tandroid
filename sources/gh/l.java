package gh;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;

    public /* synthetic */ l(v vVar, int i10) {
        this.a = i10;
        this.b = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                v.Q(this.b);
                break;
            default:
                v vVar = this.b;
                vVar.Y.setValueAnimated((int) vVar.h0.getMinimumBid());
                break;
        }
    }
}
