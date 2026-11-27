// default package

import android.os.SystemClock;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gn1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;

    public /* synthetic */ gn1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b8 b8Var;
        kg5 kg5Var;
        byte b = this.a;
        byte b2 = 8;
        byte b3 = 4;
        byte b4 = 3;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                zu1Var.Pc(false);
                break;
            case 1:
                zu1Var.Z4();
                break;
            case 2:
                zu1Var.a = (zu1Var.a + 1) % 3;
                break;
            case 3:
                zu1Var.b = !zu1Var.b;
                break;
            case 4:
                zu1Var.Y5 = null;
                zu1Var.D6();
                break;
            case 5:
                zu1Var.Y5 = null;
                zu1Var.D6();
                break;
            case 6:
                zu1Var.getClass();
                id idVar = new id(3, zu1Var.Ba, zu1Var.getParentActivity());
                zu1Var.ec = idVar;
                idVar.setOnShowListener(new rl1(zu1Var, (byte) 1));
                zu1Var.ec.setOnCancelListener(zu1Var.Ja);
                zu1Var.ec.q(500L);
                break;
            case 7:
                zu1Var.finishFragment();
                break;
            case 8:
                zu1Var.Hc(true);
                zu1Var.yd(true);
                d31.z(zu1Var, 4, 0, zu1Var.Ba).j();
                break;
            case 9:
                zu1Var.Wb = null;
                break;
            case 10:
                nr1 nr1Var = zu1Var.a0;
                if (nr1Var != null && zu1Var.yd != null) {
                    boolean U0 = nr1Var.U0();
                    nr1 nr1Var2 = zu1Var.a0;
                    if (!U0) {
                        nr1Var2.G1(false, false, false);
                        zu1Var.a0.h2();
                        ((fm0) zu1Var.yd.b.b).a(true, true);
                        break;
                    } else {
                        nr1Var2.N0(false);
                        hl.E3(zu1Var.yd.a);
                        ((fm0) zu1Var.yd.b.b).a(false, true);
                        break;
                    }
                }
                break;
            case 11:
                zu1Var.Ka();
                break;
            case 12:
                zu1Var.M5(true);
                break;
            case 13:
                zu1Var.M5(true);
                break;
            case 14:
                zu1Var.M5(false);
                xk8 xk8Var = new xk8((e) zu1Var, 24, true);
                xk8Var.p0 = false;
                xk8Var.I0 = new kl1(zu1Var, b2);
                xk8Var.show();
                break;
            case 15:
                zu1Var.y6(false, true, 0.0f);
                break;
            case 16:
                b8[] b8VarArr = zu1Var.k9;
                if (b8VarArr != null && b8VarArr.length > 0 && (b8Var = b8VarArr[0]) != null) {
                    b8Var.requestFocus();
                    zu1Var.k9[0].performAccessibilityAction(64, null);
                    zu1Var.k9[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 17:
                zu1Var.O7();
                zu1Var.Q7();
                zu1Var.D5();
                zu1Var.F5();
                break;
            case 18:
                zu1Var.D0.N.clear();
                it1 it1Var = zu1Var.D0;
                it1Var.M = false;
                it1Var.J(true);
                zu1Var.sc(false);
                break;
            case 19:
                zu1Var.y6(false, true, 0.0f);
                break;
            case 20:
                zu1Var.y6(false, true, 0.0f);
                break;
            case 21:
                zu1Var.M5(true);
                bs2.v(null, 2131743625, d31.b0(zu1Var), R.raw.chats_infotip, 36);
                break;
            case 22:
                zu1Var.D0.N.clear();
                it1 it1Var2 = zu1Var.D0;
                it1Var2.M = false;
                it1Var2.J(true);
                zu1Var.sc(false);
                break;
            case 23:
                zu1Var.dd = 0;
                zu1Var.ed = false;
                zu1Var.A0.i1();
                break;
            case 24:
                zu1Var.Va = false;
                zu1Var.cd();
                break;
            case 25:
                qr1 qr1Var = zu1Var.g3;
                if ((qr1Var == null || qr1Var.getVisibility() != 0) && (kg5Var = zu1Var.L1) != null) {
                    kg5Var.v();
                    break;
                }
                break;
            case 26:
                zu1Var.w5();
                break;
            case 27:
                zu1Var.gd(0, zu1Var.h6 != 0 && SystemClock.elapsedRealtime() >= zu1Var.h6 + 150);
                break;
            case 28:
                zu1Var.d6 = null;
                if (zu1Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zu1Var.Ba, zu1Var.getParentActivity());
                    boolean T = xc2.T(zu1Var.e);
                    id idVar2 = alertDialog$Builder.a;
                    if (!T || zu1Var.e.megagroup) {
                        idVar2.U = ob6.M0(2131748837, null);
                        idVar2.S = ob6.M0(2131748836, null);
                    } else {
                        idVar2.U = ob6.M0(2131748839, null);
                        idVar2.S = ob6.M0(2131748838, null);
                    }
                    alertDialog$Builder.j(ob6.M0(2131748835, null), new uo1(zu1Var, b4));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), new uo1(zu1Var, b3));
                    zu1Var.showDialog(idVar2);
                    break;
                }
                break;
            default:
                zu1Var.k5();
                break;
        }
    }
}
