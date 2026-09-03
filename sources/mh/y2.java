package mh;

import android.content.DialogInterface;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y2 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;

    public /* synthetic */ y2(g5 g5Var, int i10) {
        this.a = i10;
        this.b = g5Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.g0.setLoading(false);
                break;
            default:
                this.b.g0.setLoading(false);
                break;
        }
    }
}
