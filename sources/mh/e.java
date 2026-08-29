package mh;

import android.view.View;
import lh.c6;
import org.telegram.ui.Components.fr0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ e(r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                r rVar = this.b;
                fr0 fr0Var = rVar.S;
                c6 c6Var = rVar.a;
                fr0Var.a(c6Var == null ? "" : c6Var.E);
                break;
            default:
                r rVar2 = this.b;
                rVar2.S.b(rVar2.a.E);
                break;
        }
    }
}
