package kg;

import android.os.Bundle;
import java.io.Serializable;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.b41;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements org.telegram.ui.ActionBar.q1, x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ r0(s0 s0Var, int i7) {
        this.a = i7;
        this.b = s0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.c0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.x10
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        b41 b41Var = (b41) obj;
        s0 s0Var = this.b;
        if (s0Var.c.h(b41Var)) {
            return;
        }
        int i7 = b41Var.d;
        if (i7 == 2 || b41Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", s0Var.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            s0Var.presentFragment(new an(bundle));
            return;
        }
        if (i7 == 1) {
            s0Var.r = !s0Var.r;
            s0Var.b.g3.O(true);
            s0Var.a0(true);
        } else {
            if (i7 == 3) {
                a0 a0Var = s0Var.c;
                s0Var.s = true;
                a0Var.h = true;
                s0Var.b.g3.O(true);
                s0Var.a0(true);
                return;
            }
            if (i7 == 4) {
                a0 a0Var2 = s0Var.c;
                s0Var.s = false;
                a0Var2.h = false;
                s0Var.b.g3.O(true);
                s0Var.a0(true);
            }
        }
    }
}
