package kh;

import android.view.View;
import jh.b6;
import org.telegram.ui.Components.vq0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ f(r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                r rVar = this.b;
                vq0 vq0Var = rVar.S;
                b6 b6Var = rVar.a;
                vq0Var.a(b6Var == null ? "" : b6Var.E);
                break;
            default:
                r rVar2 = this.b;
                rVar2.S.b(rVar2.a.E);
                break;
        }
    }
}
