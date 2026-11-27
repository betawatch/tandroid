// default package

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class gtb implements View.OnClickListener {
    public final /* synthetic */ a67 a;
    public final /* synthetic */ zu1 b;
    public final /* synthetic */ d79 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ fu5 e;
    public final /* synthetic */ fu5 f;
    public final /* synthetic */ ktb h;

    public gtb(ktb ktbVar, a67 a67Var, zu1 zu1Var, d79 d79Var, LinearLayout linearLayout, fu5 fu5Var, fu5 fu5Var2) {
        this.h = ktbVar;
        this.a = a67Var;
        this.b = zu1Var;
        this.c = d79Var;
        this.d = linearLayout;
        this.e = fu5Var;
        this.f = fu5Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a67 a67Var = this.a;
        ArrayList arrayList = a67Var.b;
        ArrayList arrayList2 = a67Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        ktb ktbVar = this.h;
        zu1 zu1Var = this.b;
        if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
            TLObject tLObject = (TLObject) arrayList2.get(0);
            if (tLObject == null) {
                return;
            }
            Bundle bundle = new Bundle();
            if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
            } else if (tLObject instanceof TLRPC.Chat) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
            }
            zu1Var.presentFragment(new ProfileActivity(bundle, null));
            ktbVar.b(false);
            return;
        }
        if (xea.Y0 > 0 && zu1Var.m1.getKeyboardHeight() < hl.L(20.0f)) {
            v21 t = new d31(o11.a(ktbVar.getContext()), ktbVar.a).t(hl.S2(ob6.M0(2131748242, null)), null);
            zu1Var.C1 = t;
            t.j = 4000;
            t.j();
            xea.P(xea.Y0 - 1);
        }
        d79 d79Var = this.c;
        d79Var.requestLayout();
        this.d.requestLayout();
        d79Var.getAdapter().f();
        this.e.L(this.f);
    }
}
