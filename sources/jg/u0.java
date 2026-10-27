package jg;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.u61;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements org.telegram.ui.ActionBar.b2, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ u0(v0 v0Var, int i10) {
        this.a = i10;
        this.b = v0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.Y();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        u61 u61Var = (u61) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        v0 v0Var = this.b;
        if (v0Var.c.h(u61Var)) {
            return;
        }
        int i10 = u61Var.d;
        if (i10 == 2 || u61Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", v0Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            v0Var.presentFragment(new wn(bundle));
            return;
        }
        if (i10 == 1) {
            v0Var.r = !v0Var.r;
            v0Var.b.g3.O(true);
            v0Var.W(true);
        } else {
            if (i10 == 3) {
                b0 b0Var = v0Var.c;
                v0Var.s = true;
                b0Var.h = true;
                v0Var.b.g3.O(true);
                v0Var.W(true);
                return;
            }
            if (i10 == 4) {
                b0 b0Var2 = v0Var.c;
                v0Var.s = false;
                b0Var2.h = false;
                v0Var.b.g3.O(true);
                v0Var.W(true);
            }
        }
    }
}
