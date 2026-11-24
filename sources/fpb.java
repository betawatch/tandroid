// default package

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fpb implements View.OnClickListener {
    public final /* synthetic */ t37 a;
    public final /* synthetic */ mu1 b;
    public final /* synthetic */ o39 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ cs5 e;
    public final /* synthetic */ cs5 f;
    public final /* synthetic */ jpb h;

    public fpb(jpb jpbVar, t37 t37Var, mu1 mu1Var, o39 o39Var, LinearLayout linearLayout, cs5 cs5Var, cs5 cs5Var2) {
        this.h = jpbVar;
        this.a = t37Var;
        this.b = mu1Var;
        this.c = o39Var;
        this.d = linearLayout;
        this.e = cs5Var;
        this.f = cs5Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        t37 t37Var = this.a;
        ArrayList arrayList = t37Var.b;
        ArrayList arrayList2 = t37Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        jpb jpbVar = this.h;
        mu1 mu1Var = this.b;
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
            mu1Var.presentFragment(new ProfileActivity(bundle, null));
            jpbVar.b(false);
            return;
        }
        if (gba.Y0 > 0 && mu1Var.m1.getKeyboardHeight() < gl.L(20.0f)) {
            m21 t = new u21(f11.a(jpbVar.getContext()), jpbVar.a).t(gl.S2(k96.M0(2131748296, null)), null);
            mu1Var.C1 = t;
            t.j = 4000;
            t.j();
            gba.P(gba.Y0 - 1);
        }
        o39 o39Var = this.c;
        o39Var.requestLayout();
        this.d.requestLayout();
        o39Var.getAdapter().f();
        this.e.L(this.f);
    }
}
