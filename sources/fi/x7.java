package fi;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8 b;

    public /* synthetic */ x7(f8 f8Var, int i10) {
        this.a = i10;
        this.b = f8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.U();
                break;
            default:
                this.b.X();
                break;
        }
    }
}
