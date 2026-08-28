package jh;

import android.view.View;
import ih.f6;
import org.telegram.ui.Components.uq0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ e(q qVar, int i9) {
        this.a = i9;
        this.b = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                q qVar = this.b;
                uq0 uq0Var = qVar.S;
                f6 f6Var = qVar.a;
                uq0Var.a(f6Var == null ? "" : f6Var.E);
                break;
            default:
                q qVar2 = this.b;
                qVar2.S.b(qVar2.a.E);
                break;
        }
    }
}
