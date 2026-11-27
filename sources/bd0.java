// default package

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bd0 implements ncc, fd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dd0 b;

    public /* synthetic */ bd0(dd0 dd0Var, byte b) {
        this.a = b;
        this.b = dd0Var;
    }

    @Override // ncc
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        b8c b8cVar = (b8c) obj;
        final View view = (View) obj2;
        final dd0 dd0Var = this.b;
        if (dd0Var.c.h(b8cVar)) {
            return;
        }
        int i = b8cVar.d;
        if (i == 2 || b8cVar.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", dd0Var.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            dd0Var.presentFragment(new zu1(bundle));
            return;
        }
        final byte b = 1;
        if (i == 1) {
            dd0Var.r = !dd0Var.r;
            dd0Var.b.g3.O(true);
            dd0Var.Y(true);
            return;
        }
        if (i == 6) {
            u41 u41Var = dd0Var.c;
            dd0Var.s = true;
            u41Var.h = true;
            dd0Var.b.g3.O(true);
            dd0Var.Y(true);
            return;
        }
        final byte b2 = 0;
        if (i == 7) {
            u41 u41Var2 = dd0Var.c;
            dd0Var.s = false;
            u41Var2.h = false;
            dd0Var.b.g3.O(true);
            dd0Var.Y(true);
            return;
        }
        if (i == 3) {
            dd0Var.x = (byte) 0;
            dd0Var.b.g3.O(true);
            dd0Var.Y(true);
            return;
        }
        if (i == 4) {
            dd0Var.x = (byte) 1;
            dd0Var.b.g3.O(true);
            dd0Var.Y(true);
            return;
        }
        if (i == 5) {
            dd0Var.x = (byte) 2;
            dd0Var.b.g3.O(true);
            dd0Var.Y(true);
        } else {
            if (i == 8) {
                jj.x(dd0Var.getParentActivity(), ob6.M0(2131752804, null), ob6.M0(2131752806, null), dd0Var.F, new hj() { // from class: cd0
                    @Override // hj
                    public final void y(int i2, int i3, boolean z) {
                        byte b3 = b2;
                        View view2 = view;
                        dd0 dd0Var2 = dd0Var;
                        switch (b3) {
                            case 0:
                                dd0Var2.F = i2;
                                ((skb) view2).w(ob6.Q(i2), true);
                                dd0Var2.Y(true);
                                break;
                            default:
                                dd0Var2.G = i2;
                                ((skb) view2).w(ob6.Q(i2), true);
                                dd0Var2.Y(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i == 9) {
                jj.x(dd0Var.getParentActivity(), ob6.M0(2131752807, null), ob6.M0(2131752806, null), dd0Var.G, new hj() { // from class: cd0
                    @Override // hj
                    public final void y(int i2, int i3, boolean z) {
                        byte b3 = b;
                        View view2 = view;
                        dd0 dd0Var2 = dd0Var;
                        switch (b3) {
                            case 0:
                                dd0Var2.F = i2;
                                ((skb) view2).w(ob6.Q(i2), true);
                                dd0Var2.Y(true);
                                break;
                            default:
                                dd0Var2.G = i2;
                                ((skb) view2).w(ob6.Q(i2), true);
                                dd0Var2.Y(true);
                                break;
                        }
                    }
                });
            } else if (i == 10) {
                boolean z = !dd0Var.w;
                dd0Var.w = z;
                ((wkb) view).setChecked(z);
                dd0Var.Y(true);
            }
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        dd0 dd0Var = this.b;
        switch (b) {
            case 1:
                dd0Var.b0();
                break;
            default:
                dd0Var.finishFragment();
                break;
        }
    }
}
