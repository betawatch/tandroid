package kg;

import android.os.Bundle;
import java.io.Serializable;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.l41;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements org.telegram.ui.ActionBar.r1, v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ u0(v0 v0Var, int i7) {
        this.a = i7;
        this.b = v0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.c0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        l41 l41Var = (l41) obj;
        v0 v0Var = this.b;
        if (v0Var.c.h(l41Var)) {
            return;
        }
        int i7 = l41Var.d;
        if (i7 == 2 || l41Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", v0Var.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            v0Var.presentFragment(new bn(bundle));
            return;
        }
        if (i7 == 1) {
            v0Var.r = !v0Var.r;
            v0Var.b.g3.O(true);
            v0Var.a0(true);
        } else {
            if (i7 == 3) {
                a0 a0Var = v0Var.c;
                v0Var.s = true;
                a0Var.h = true;
                v0Var.b.g3.O(true);
                v0Var.a0(true);
                return;
            }
            if (i7 == 4) {
                a0 a0Var2 = v0Var.c;
                v0Var.s = false;
                a0Var2.h = false;
                v0Var.b.g3.O(true);
                v0Var.a0(true);
            }
        }
    }
}
