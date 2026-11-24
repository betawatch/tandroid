// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class gm1 implements uq5, yq5, ee, ta2, ue7, z19, ResultCallback, oy4, j02, v51, w51, ic5, su2, h59 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;

    public /* synthetic */ gm1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override // su2
    public final void a() {
        yv1 yv1Var = this.b;
        if (yv1Var.N3 != null || yv1Var.getParentActivity() == null) {
            return;
        }
        yv1Var.i6();
        yv1Var.N3.m(yv1Var.f, 8, yv1Var.l6);
    }

    @Override // ta2
    public final void b(TLRPC.Document document) {
        byte b = this.a;
        yv1 yv1Var = this.b;
        switch (b) {
            case 4:
                yv1Var.r8(document);
                break;
            default:
                yv1Var.s8(document);
                break;
        }
    }

    @Override // z19
    public final void c(ArrayList arrayList) {
        switch (this.a) {
            case 11:
                yv1 yv1Var = this.b;
                if (yv1Var.getParentActivity() != null && yv1Var.getParentActivity() != null) {
                    lq1 lq1Var = new lq1(yv1Var, yv1Var, yv1Var.getParentActivity(), yv1Var.Ba, arrayList);
                    boolean Y7 = yv1Var.Y7();
                    lq1Var.i0 = Y7;
                    lq1Var.n = Y7;
                    lq1Var.p0 = false;
                    yv1Var.N5(false);
                    yv1Var.showDialog(lq1Var);
                    break;
                }
                break;
            default:
                yv1 yv1Var2 = this.b;
                if (yv1Var2.getParentActivity() != null && yv1Var2.getParentActivity() != null) {
                    gr1 gr1Var = new gr1(yv1Var2, yv1Var2, yv1Var2.getParentActivity(), yv1Var2.Ba, arrayList);
                    boolean Y72 = yv1Var2.Y7();
                    gr1Var.i0 = Y72;
                    gr1Var.n = Y72;
                    gr1Var.p0 = false;
                    yv1Var2.N5(false);
                    yv1Var2.showDialog(gr1Var);
                    break;
                }
                break;
        }
    }

    @Override // j02
    public final void e(boolean z, boolean z2) {
        yv1 yv1Var = this.b;
        yv1Var.b1.j(yv1Var.Ca.b(), z, z2);
    }

    @Override // ic5
    public final void f(int i, ArrayList arrayList) {
        yv1 yv1Var = this.b;
        yv1Var.getMessagesController().l(yv1Var.e, yv1Var, arrayList, i, null, null, null);
        yv1Var.getMessagesController().e2(yv1Var.l6, yv1Var.f, yv1Var.e);
        yv1Var.zd(true);
        yv1Var.Wc(true);
    }

    @Override // h59
    public final boolean g(int i, View view) {
        yv1 yv1Var = this.b;
        boolean z = false;
        if (yv1Var.getParentActivity() != null) {
            k17 adapter = yv1Var.X1.getAdapter();
            if ((adapter.J != null || adapter.K != null) && i != 0) {
                k17 adapter2 = yv1Var.X1.getAdapter();
                if (adapter2.x0 != null && !adapter2.i0) {
                    return false;
                }
                Object J = yv1Var.X1.getAdapter().J(i - 1);
                if (J instanceof h17) {
                    h17 h17Var = (h17) J;
                    if (yv1Var.X1.getAdapter().K != null && d6c.h) {
                        yv1Var.a0.setFieldText("");
                        ms1 ms1Var = yv1Var.a0;
                        String str = h17Var.a;
                        TLRPC.Chat chat = yv1Var.e;
                        if (chat != null && chat.megagroup) {
                            z = true;
                        }
                        ms1Var.E1(null, str, true, z);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (yv1Var.X1.getAdapter().K == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, yv1Var.Ba, yv1Var.getParentActivity());
                        String M0 = jb6.M0(R.string.AppName, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        heVar.U = jb6.M0(2131751999, null);
                        alertDialog$Builder.j(jb6.M0(2131752036, null), new gm1(yv1Var, (byte) 12));
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        yv1Var.showDialog(heVar);
                        return true;
                    }
                    if (d6c.h) {
                        yv1Var.a0.setFieldText("");
                        ms1 ms1Var2 = yv1Var.a0;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = yv1Var.e;
                        if (chat2 != null && chat2.megagroup) {
                            z = true;
                        }
                        ms1Var2.E1(null, str2, true, z);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // v51
    public final void h(int i) {
        yv1 yv1Var = this.b;
        byte b = 1;
        if (i == 1) {
            yv1Var.ja();
            return;
        }
        if (i == 2) {
            yv1Var.W9();
            return;
        }
        byte b2 = 0;
        if (i == 3) {
            yv1Var.R4 = true;
            yv1Var.getMessagesController().u1(yv1Var.l6, yv1Var.d(), yv1Var.A1, true, new io1(yv1Var, b2));
            return;
        }
        if (i == 4) {
            yv1Var.R4 = true;
            yv1Var.getMessagesController().u1(yv1Var.l6, yv1Var.d(), yv1Var.B1, false, new io1(yv1Var, b));
            return;
        }
        if (i == 6) {
            yv1Var.y7(true);
            return;
        }
        if (i == 5) {
            yv1Var.y7(false);
        } else if (i == 0) {
            e51 e51Var = yv1Var.Y1;
            if (e51Var != null) {
                e51Var.r1(0, null);
            }
            yv1Var.ma();
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        tz3 tz3Var = (tz3) obj;
        yv1 yv1Var = this.b;
        wv1 wv1Var = yv1Var.Ba;
        wv1Var.q(tz3Var, wv1Var.g, yv1Var.h6 != 0, null, false);
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        yv1 yv1Var = this.b;
        switch (b) {
            case 2:
                rs1 rs1Var = yv1Var.E0;
                if (rs1Var != null) {
                    rs1Var.callOnClick();
                    break;
                }
                break;
            case 3:
                yv1Var.finishFragment();
                break;
            case 4:
            case 5:
            case 9:
            case 11:
            case 13:
            case 14:
            case 18:
            case 19:
            default:
                k47 k47Var = (k47) yv1Var.X4.get(Integer.valueOf(yv1Var.Z4));
                if (k47Var == null) {
                    k47Var = (k47) yv1Var.G6[0].get(yv1Var.Z4);
                }
                yv1Var.Jc(k47Var);
                break;
            case 6:
                o47 o47Var = yv1Var.x5;
                if (o47Var != null) {
                    o47Var.d(null, yv1Var.l6);
                }
                yv1Var.D6();
                break;
            case 7:
                yv1Var.ra(1);
                break;
            case 8:
                yv1Var.getMessagesController().n5(null, yv1Var.f.id);
                break;
            case 10:
                yv1Var.finishFragment();
                break;
            case 12:
                k17 adapter = yv1Var.X1.getAdapter();
                adapter.x.c();
                adapter.J.clear();
                adapter.f();
                p17 p17Var = adapter.W;
                if (p17Var != null) {
                    p17Var.a(false);
                    break;
                }
                break;
            case 15:
                yv1Var.getClass();
                yv1Var.showDialog(new wt1(yv1Var, yv1Var.getParentActivity(), yv1Var));
                break;
            case 16:
                yv1Var.i6();
                UndoView undoView = yv1Var.N3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 17:
                yv1Var.getLocationController().k(yv1Var.l6);
                break;
            case 20:
                o47 o47Var2 = yv1Var.x5;
                if (o47Var2 != null && o47Var2.d != null) {
                    yv1Var.ra(0);
                    break;
                }
                break;
            case 21:
                yv1Var.E7(true);
                break;
        }
    }

    @Override // oy4
    public final void s(int i) {
        this.b.N7(i);
    }

    @Override // ue7
    public final void z(boolean z) {
        yv1 yv1Var = this.b;
        nm7 notificationCenter = yv1Var.getNotificationCenter();
        int i = nm7.s;
        notificationCenter.n(yv1Var, i);
        yv1Var.getNotificationCenter().k(i, new Object[0]);
        yv1Var.finishFragment();
        yv1Var.getNotificationCenter().k(nm7.K2, Long.valueOf(yv1Var.l6), yv1Var.f, yv1Var.e, Boolean.valueOf(z));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(TLRPC.TL_error tL_error) {
    }

    @Override // ic5
    public final void d(TLRPC.User user) {
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(Throwable th) {
    }
}
