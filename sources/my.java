// default package

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class my implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;

    public /* synthetic */ my(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ar1 ar1Var;
        gb2 gb2Var;
        k27 messageObject;
        byte b = this.a;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                mu1Var.pc();
                break;
            case 1:
                mu1Var.d6 = null;
                if (mu1Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mu1Var.Ba, mu1Var.getParentActivity());
                    boolean T = hc2.T(mu1Var.e);
                    hd hdVar = alertDialog$Builder.a;
                    if (!T || mu1Var.e.megagroup) {
                        hdVar.U = k96.M0(2131748891, null);
                        hdVar.S = k96.M0(2131748890, null);
                    } else {
                        hdVar.U = k96.M0(2131748893, null);
                        hdVar.S = k96.M0(2131748892, null);
                    }
                    alertDialog$Builder.j(k96.M0(2131748889, null), new yk1(mu1Var, (byte) 2));
                    alertDialog$Builder.g(k96.M0(2131752577, null), new yk1(mu1Var, (byte) 3));
                    mu1Var.showDialog(hdVar);
                    break;
                }
                break;
            case 2:
                mu1Var.d5();
                break;
            case 3:
                FrameLayout.LayoutParams e = nme.e(-1, -2, 87);
                e.bottomMargin = mu1Var.a0.getMeasuredHeight();
                mu1Var.m1.addView(mu1Var.N1, e);
                mu1Var.N1.setTranslationY(-gl.n);
                mu1Var.N1.o(0.0f, mu1Var.a0.getEmojiButton().getX() + gl.L(22.0f));
                mu1Var.N1.v();
                break;
            case 4:
            case 24:
                mu1Var.P4();
                break;
            case 5:
                gl.B2(mu1Var.Z0);
                break;
            case 6:
                if (!d.hasSheets(mu1Var) && (ar1Var = mu1Var.a0) != null) {
                    ar1Var.setFieldFocused(true);
                    mu1Var.a0.h1();
                    break;
                }
                break;
            case 7:
                mu1Var.pd();
                mu1Var.E7();
                gl.d0(mu1Var.A0, new hl1(mu1Var, (byte) 5));
                mu1Var.z5();
                rq1 rq1Var = mu1Var.m3;
                if (rq1Var != null) {
                    rq1Var.setTranslationX(mu1Var.e7() / 2.0f);
                }
                qq1 qq1Var = mu1Var.n3;
                if (qq1Var != null) {
                    qq1Var.setTranslationX(mu1Var.e7() / 2.0f);
                }
                FrameLayout frameLayout = mu1Var.f1;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(mu1Var.e7() / 2.0f);
                }
                mu1Var.X4();
                mu1Var.y5();
                break;
            case 8:
                mu1Var.ta(null, mu1Var.I8);
                mu1Var.I8 = null;
                break;
            case 9:
                vtb e0 = vtb.e0(-mu1Var.l6, 0L);
                e0.E = mu1Var;
                mu1Var.presentFragment(e0);
                break;
            case 10:
                mu1Var.tc(true);
                break;
            case 11:
                mu1Var.y1.d(true);
                break;
            case 12:
                mu1Var.resumeDelayedFragmentAnimation();
                ir1 ir1Var = mu1Var.ta;
                gl.r(ir1Var);
                ir1Var.run();
                mu1Var.getNotificationCenter().o();
                break;
            case 13:
                int childCount = mu1Var.A0.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = mu1Var.A0.getChildAt(i);
                    if (childAt instanceof gb2) {
                        gb2 gb2Var2 = (gb2) childAt;
                        if (gb2Var2.getMessageObject().D == 4) {
                            gb2Var2.J1();
                        }
                    }
                }
                break;
            case 14:
                mu1Var.fc = true;
                mu1Var.Rc(true);
                break;
            case 15:
                sr1 sr1Var = mu1Var.Bb;
                if (sr1Var != null) {
                    sr1Var.requestLayout();
                    break;
                }
                break;
            case 16:
                mu1Var.getNotificationCenter().j(mu1Var.ca);
                break;
            case 17:
                TLRPC.UserFull userFull = mu1Var.s8;
                mu1Var.ub(userFull != null ? userFull.theme : null);
                break;
            case 18:
                mu1Var.s9();
                break;
            case 19:
                mu1Var.d8 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                mu1Var.f8 = false;
                mu1Var.g8 = 0L;
                mu1Var.h8 = null;
                mu1Var.i8 = null;
                mu1Var.j8 = null;
                mu1Var.k8 = -1;
                mu1Var.e8 = false;
                mu1Var.sd(false);
                mu1Var.m8 = null;
                break;
            case 20:
                mu1Var.R8();
                break;
            case 21:
                mu1Var.Jb(false, true);
                break;
            case 22:
                my myVar = new my(mu1Var, (byte) 12);
                if (vvc.z()) {
                    myVar.run();
                    break;
                } else {
                    xia xiaVar = new xia((Object) myVar, (byte) 18);
                    vvc.h.add(xiaVar);
                    gl.e3(xiaVar, 150L);
                    break;
                }
            case 23:
                mu1Var.V8();
                break;
            case 25:
                mu1Var.e5();
                break;
            case 26:
                mu1Var.a0.h1();
                break;
            case 27:
                mu1 mu1Var2 = this.b;
                int i2 = mu1Var2.Ub;
                if (i2 != 0) {
                    mu1Var2.J(i2, mu1Var2.Vb, mu1Var2.Xb ? 1 : 0, mu1Var2.Zb, mu1Var2.Wb, mu1Var2.Yb);
                    mu1Var2.Ub = 0;
                    break;
                }
                break;
            case 28:
                if (!mu1Var.A3 && mu1Var.A0 != null && mu1Var.getParentActivity() != null && mu1Var.fragmentView != null) {
                    cg2 cg2Var = mu1Var.K2;
                    if (cg2Var == null) {
                        at1 at1Var = mu1Var.m1;
                        int indexOfChild = at1Var.indexOfChild(mu1Var.U);
                        if (indexOfChild != -1) {
                            cg2 cg2Var2 = new cg2(mu1Var.getParentActivity());
                            mu1Var.K2 = cg2Var2;
                            cg2Var2.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                            mu1Var.K2.k(mu1Var.L);
                            at1Var.addView(mu1Var.K2, indexOfChild + 1, nme.e(-1, kk7.f2, 55));
                        }
                    } else if (cg2Var.W) {
                    }
                    int childCount2 = mu1Var.A0.getChildCount();
                    for (int i3 = 0; i3 < childCount2; i3++) {
                        View childAt2 = mu1Var.A0.getChildAt(i3);
                        if ((childAt2 instanceof gb2) && (messageObject = (gb2Var = (gb2) childAt2).getMessageObject()) != null && messageObject.O3() && messageObject.p4()) {
                            cg2 cg2Var3 = mu1Var.K2;
                            int[] iArr = (int[]) cg2Var3.Z0;
                            if (cg2Var3.getParent() instanceof View) {
                                gb2Var.getLocationInWindow(iArr);
                                int i4 = iArr[0];
                                int i5 = iArr[1];
                                ((View) cg2Var3.getParent()).getLocationInWindow(iArr);
                                float f = i5 - iArr[1];
                                if (f > gl.L(80.0f)) {
                                    for (oy8 oy8Var : (oy8[]) cg2Var3.Y0) {
                                        oy8Var.I(0, false, false);
                                        oy8Var.start();
                                    }
                                    cg2Var3.w(gl.L(5.0f) + gb2Var.getChecksX() + (i4 - iArr[0]), f + gb2Var.getChecksY() + gl.L(6.0f), true);
                                    mu1Var.getMessagesController().m4(0L, "NEWCOMER_TICKS");
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
            default:
                mu1Var.S8();
                break;
        }
    }
}
