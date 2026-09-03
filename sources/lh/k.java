package lh;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
