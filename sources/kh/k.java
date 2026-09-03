package kh;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ k(s sVar, int i10) {
        this.a = i10;
        this.b = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                s.Q(this.b);
                break;
            default:
                s sVar = this.b;
                sVar.Z.setValueAnimated((int) sVar.i0.getMinimumBid());
                break;
        }
    }
}
