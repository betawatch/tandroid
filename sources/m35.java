// default package

import android.os.Bundle;
import java.io.Serializable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class m35 implements ed, n8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o35 b;

    public /* synthetic */ m35(o35 o35Var, byte b) {
        this.a = b;
        this.b = o35Var;
    }

    @Override // n8c
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        c4c c4cVar = (c4c) obj;
        o35 o35Var = this.b;
        if (o35Var.c.h(c4cVar)) {
            return;
        }
        int i = c4cVar.d;
        if (i == 2 || c4cVar.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", o35Var.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            o35Var.presentFragment(new mu1(bundle));
            return;
        }
        if (i == 1) {
            o35Var.r = !o35Var.r;
            o35Var.b.g3.O(true);
            o35Var.Y(true);
        } else {
            if (i == 3) {
                m41 m41Var = o35Var.c;
                o35Var.s = true;
                m41Var.h = true;
                o35Var.b.g3.O(true);
                o35Var.Y(true);
                return;
            }
            if (i == 4) {
                m41 m41Var2 = o35Var.c;
                o35Var.s = false;
                m41Var2.h = false;
                o35Var.b.g3.O(true);
                o35Var.Y(true);
            }
        }
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        o35 o35Var = this.b;
        switch (b) {
            case 0:
                o35Var.b0();
                break;
            default:
                o35Var.finishFragment();
                break;
        }
    }
}
