// default package

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ny implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;

    public /* synthetic */ ny(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        wb2 wb2Var;
        r47 messageObject;
        byte b = this.a;
        byte b2 = 5;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                zu1Var.Dc();
                break;
            case 1:
                zu1Var.Ca("");
                break;
            case 2:
                zu1Var.qc = true;
                zu1Var.fd(true);
                break;
            case 3:
                gs1 gs1Var = zu1Var.Mb;
                if (gs1Var != null) {
                    gs1Var.requestLayout();
                    break;
                }
                break;
            case 4:
                zu1Var.F9();
                break;
            case 5:
                zu1Var.d8 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                zu1Var.f8 = false;
                zu1Var.g8 = 0L;
                zu1Var.h8 = null;
                zu1Var.i8 = null;
                zu1Var.j8 = null;
                zu1Var.k8 = -1;
                zu1Var.e8 = false;
                zu1Var.Gd(false);
                zu1Var.m8 = null;
                break;
            case 6:
                FrameLayout.LayoutParams e = tre.e(-1, -2, 87);
                e.bottomMargin = zu1Var.a0.getMeasuredHeight();
                zu1Var.m1.addView(zu1Var.N1, e);
                zu1Var.N1.setTranslationY(-hl.n);
                zu1Var.N1.o(0.0f, zu1Var.a0.getEmojiButton().getX() + hl.L(22.0f));
                zu1Var.N1.v();
                break;
            case 7:
                zu1Var.Wb(false, true);
                break;
            case 8:
                zu1Var.getNotificationCenter().j(zu1Var.ca);
                break;
            case 9:
                zu1Var.e9();
                break;
            case 10:
                hm1 hm1Var = new hm1(zu1Var, (byte) 13);
                if (k0d.A()) {
                    hm1Var.run();
                    break;
                } else {
                    bva bvaVar = new bva((Object) hm1Var, (byte) 17);
                    k0d.h.add(bvaVar);
                    hl.d3(bvaVar, 150L);
                    break;
                }
            case 11:
                zu1Var.W4();
                break;
            case 12:
                zu1Var.Ga(null, zu1Var.I8);
                zu1Var.I8 = null;
                break;
            case 13:
                hl.d0(zu1Var.A0, new bm0(b2));
                it1 it1Var = zu1Var.D0;
                if (it1Var != null) {
                    it1Var.J(true);
                    break;
                }
                break;
            case 14:
                hl.d0(zu1Var.A0, new bm0((byte) 4));
                it1 it1Var2 = zu1Var.D0;
                if (it1Var2 != null) {
                    it1Var2.J(false);
                    break;
                }
                break;
            case 15:
                zu1Var.cd();
                break;
            case 16:
                zu1Var.l5();
                break;
            case 17:
                zu1Var.a0.o1();
                break;
            case 18:
                zu1 zu1Var2 = this.b;
                int i = zu1Var2.fc;
                if (i != 0) {
                    zu1Var2.J(i, zu1Var2.gc, zu1Var2.ic ? 1 : 0, zu1Var2.kc, zu1Var2.hc, zu1Var2.jc);
                    zu1Var2.fc = 0;
                    break;
                }
                break;
            case 19:
                if (!zu1Var.A3 && zu1Var.A0 != null && zu1Var.getParentActivity() != null && zu1Var.fragmentView != null) {
                    ug2 ug2Var = zu1Var.K2;
                    if (ug2Var == null) {
                        nt1 nt1Var = zu1Var.m1;
                        int indexOfChild = nt1Var.indexOfChild(zu1Var.U);
                        if (indexOfChild != -1) {
                            ug2 ug2Var2 = new ug2(zu1Var.getParentActivity());
                            zu1Var.K2 = ug2Var2;
                            ug2Var2.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                            zu1Var.K2.k(zu1Var.L);
                            nt1Var.addView(zu1Var.K2, indexOfChild + 1, tre.e(-1, jn7.f2, 55));
                        }
                    } else if (ug2Var.W) {
                    }
                    int childCount = zu1Var.A0.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = zu1Var.A0.getChildAt(i2);
                        if ((childAt instanceof wb2) && (messageObject = (wb2Var = (wb2) childAt).getMessageObject()) != null && messageObject.O3() && messageObject.p4()) {
                            ug2 ug2Var3 = zu1Var.K2;
                            int[] iArr = (int[]) ug2Var3.Z0;
                            if (ug2Var3.getParent() instanceof View) {
                                wb2Var.getLocationInWindow(iArr);
                                int i3 = iArr[0];
                                int i4 = iArr[1];
                                ((View) ug2Var3.getParent()).getLocationInWindow(iArr);
                                float f = i4 - iArr[1];
                                if (f > hl.L(80.0f)) {
                                    for (b29 b29Var : (b29[]) ug2Var3.Y0) {
                                        b29Var.I(0, false, false);
                                        b29Var.start();
                                    }
                                    ug2Var3.w(hl.L(5.0f) + wb2Var.getChecksX() + (i3 - iArr[0]), f + wb2Var.getChecksY() + hl.L(6.0f), true);
                                    zu1Var.getMessagesController().v4(0L, "NEWCOMER_TICKS");
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    break;
                }
                break;
            case 20:
                zu1Var.f9();
                break;
            case 21:
                zu1Var.i9();
                break;
            case 22:
                nr1 nr1Var = zu1Var.a0;
                if (nr1Var != null && zu1Var.dc != 5) {
                    nr1Var.o1();
                    break;
                }
                break;
            case 23:
                fd2 fd2Var = ((fd2[]) zu1Var.c0.b)[0];
                ema emaVar = fd2Var.d;
                ema emaVar2 = fd2Var.e;
                zu1Var.U1 = !zu1Var.U1;
                emaVar.setPivotX(0.0f);
                emaVar2.setPivotX(0.0f);
                if (zu1Var.U1) {
                    emaVar.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    emaVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    emaVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    emaVar2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                hl.d3(zu1Var.V1, 6000L);
                break;
            case 24:
                d31.b0(zu1Var).I(R.raw.chats_infotip, ob6.M0(2131753283, null), ob6.M0(2131753284, null)).j();
                break;
            case 25:
                zu1Var.m5(false);
                break;
            case 26:
                zu1Var.R9();
                break;
            case 27:
                if (zu1Var.getUserConfig().p()) {
                    zu1Var.Bc = null;
                    zu1Var.zd(true);
                    d31.b0(zu1Var).c(ob6.M0(2131754481, null)).j();
                    zu1Var.getMessagesController().n0(true);
                    break;
                } else {
                    zu1Var.showDialog(new xk8((e) zu1Var, 3, true));
                    break;
                }
            case 28:
                hl.B2(zu1Var.Z0);
                break;
            default:
                zu1Var.I9();
                break;
        }
    }
}
