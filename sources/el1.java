// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class el1 implements x92, fd, bf7, xq5, br5, l39, ry4, oz1, w41, x41, ResultCallback, t69, lc5, bu2, ev1, kk4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;

    public /* synthetic */ el1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override // bf7
    public final void A(boolean z) {
        zu1 zu1Var = this.b;
        jn7 notificationCenter = zu1Var.getNotificationCenter();
        int i = jn7.s;
        notificationCenter.n(zu1Var, i);
        zu1Var.getNotificationCenter().k(i, new Object[0]);
        zu1Var.finishFragment();
        zu1Var.getNotificationCenter().k(jn7.K2, Long.valueOf(zu1Var.l6), zu1Var.f, zu1Var.e, Boolean.valueOf(z));
    }

    @Override // bu2
    public final void a() {
        zu1 zu1Var = this.b;
        if (zu1Var.N3 != null || zu1Var.getParentActivity() == null) {
            return;
        }
        zu1Var.i6();
        zu1Var.N3.m(zu1Var.l6, zu1Var.f, 8);
    }

    @Override // x92
    public final void b(TLRPC.Document document) {
        byte b = this.a;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                zu1Var.s8(document);
                break;
            default:
                zu1Var.t8(document);
                break;
        }
    }

    @Override // l39
    public final void c(ArrayList arrayList) {
        switch (this.a) {
            case 9:
                zu1 zu1Var = this.b;
                if (zu1Var.getParentActivity() != null && zu1Var.getParentActivity() != null) {
                    hq1 hq1Var = new hq1(zu1Var, zu1Var, zu1Var.getParentActivity(), zu1Var.Ba, arrayList);
                    boolean Y7 = zu1Var.Y7();
                    hq1Var.i0 = Y7;
                    hq1Var.n = Y7;
                    hq1Var.p0 = false;
                    zu1Var.M5(false);
                    zu1Var.showDialog(hq1Var);
                    break;
                }
                break;
            default:
                zu1 zu1Var2 = this.b;
                if (zu1Var2.getParentActivity() != null && zu1Var2.getParentActivity() != null) {
                    mp1 mp1Var = new mp1(zu1Var2, zu1Var2, zu1Var2.getParentActivity(), zu1Var2.Ba, arrayList);
                    boolean Y72 = zu1Var2.Y7();
                    mp1Var.i0 = Y72;
                    mp1Var.n = Y72;
                    mp1Var.p0 = false;
                    zu1Var2.M5(false);
                    zu1Var2.showDialog(mp1Var);
                    break;
                }
                break;
        }
    }

    @Override // t69
    public final boolean e(int i, View view) {
        zu1 zu1Var = this.b;
        boolean z = false;
        if (zu1Var.getParentActivity() != null) {
            r17 adapter = zu1Var.X1.getAdapter();
            if ((adapter.J != null || adapter.K != null) && i != 0) {
                r17 adapter2 = zu1Var.X1.getAdapter();
                if (adapter2.x0 != null && !adapter2.i0) {
                    return false;
                }
                Object J = zu1Var.X1.getAdapter().J(i - 1);
                if (J instanceof o17) {
                    o17 o17Var = (o17) J;
                    if (zu1Var.X1.getAdapter().K != null && c8c.h) {
                        zu1Var.a0.setFieldText("");
                        nr1 nr1Var = zu1Var.a0;
                        String str = o17Var.a;
                        TLRPC.Chat chat = zu1Var.e;
                        if (chat != null && chat.megagroup) {
                            z = true;
                        }
                        nr1Var.L1(null, str, true, z);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (zu1Var.X1.getAdapter().K == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zu1Var.Ba, zu1Var.getParentActivity());
                        String M0 = ob6.M0(R.string.AppName, null);
                        id idVar = alertDialog$Builder.a;
                        idVar.S = M0;
                        idVar.U = ob6.M0(2131752027, null);
                        alertDialog$Builder.j(ob6.M0(2131752064, null), new el1(zu1Var, (byte) 22));
                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                        zu1Var.showDialog(idVar);
                        return true;
                    }
                    if (c8c.h) {
                        zu1Var.a0.setFieldText("");
                        nr1 nr1Var2 = zu1Var.a0;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = zu1Var.e;
                        if (chat2 != null && chat2.megagroup) {
                            z = true;
                        }
                        nr1Var2.L1(null, str2, true, z);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // lc5
    public final void f(int i, ArrayList arrayList) {
        zu1 zu1Var = this.b;
        zu1Var.getMessagesController().l(zu1Var.e, zu1Var, arrayList, i, null, null, null);
        zu1Var.getMessagesController().f2(zu1Var.l6, zu1Var.f, zu1Var.e);
        zu1Var.zd(true);
        zu1Var.Wc(true);
    }

    @Override // oz1
    public final void g(boolean z, boolean z2) {
        zu1 zu1Var = this.b;
        zu1Var.b1.j(zu1Var.Ca.b(), z, z2);
    }

    @Override // w41
    public final void h(int i) {
        zu1 zu1Var = this.b;
        byte b = 1;
        if (i == 1) {
            zu1Var.ka();
            return;
        }
        if (i == 2) {
            zu1Var.X9();
            return;
        }
        byte b2 = 0;
        if (i == 3) {
            zu1Var.R4 = true;
            zu1Var.getMessagesController().v1(zu1Var.l6, zu1Var.c(), zu1Var.A1, true, new tm1(zu1Var, b2));
            return;
        }
        if (i == 4) {
            zu1Var.R4 = true;
            zu1Var.getMessagesController().v1(zu1Var.l6, zu1Var.c(), zu1Var.B1, false, new tm1(zu1Var, b));
            return;
        }
        if (i == 6) {
            zu1Var.y7(true);
            return;
        }
        if (i == 5) {
            zu1Var.y7(false);
        } else if (i == 0) {
            f41 f41Var = zu1Var.Y1;
            if (f41Var != null) {
                f41Var.s1(0, null);
            }
            zu1Var.na();
        }
    }

    @Override // ry4
    public final void k(int i) {
        this.b.N7(i);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        ez3 ez3Var = (ez3) obj;
        zu1 zu1Var = this.b;
        xu1 xu1Var = zu1Var.Ba;
        xu1Var.q(ez3Var, xu1Var.g, zu1Var.h6 != 0, null, false);
    }

    @Override // kk4
    public final boolean run() {
        zu1 zu1Var = this.b;
        return zu1Var.h != null || zu1Var.a8();
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        zu1 zu1Var = this.b;
        switch (b) {
            case 2:
                v47 v47Var = zu1Var.x5;
                if (v47Var != null) {
                    v47Var.d(null, zu1Var.l6);
                }
                zu1Var.D6();
                break;
            case 3:
                zu1Var.sa(1);
                break;
            case 4:
                zu1Var.getMessagesController().t5(null, zu1Var.f.id);
                break;
            case 5:
            case 7:
            case 8:
            case 9:
            case 12:
            case 14:
            case 17:
            case 18:
            default:
                r17 adapter = zu1Var.X1.getAdapter();
                adapter.x.c();
                adapter.J.clear();
                adapter.f();
                w17 w17Var = adapter.W;
                if (w17Var != null) {
                    w17Var.a(false);
                    break;
                }
                break;
            case 6:
                zu1Var.finishFragment();
                break;
            case 10:
                zu1Var.getClass();
                zu1Var.showDialog(new xs1(zu1Var, zu1Var.getParentActivity(), zu1Var));
                break;
            case 11:
                zu1Var.i6();
                UndoView undoView = zu1Var.N3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 13:
                zu1Var.getLocationController().k(zu1Var.l6);
                break;
            case 15:
                v47 v47Var2 = zu1Var.x5;
                if (v47Var2 != null && v47Var2.d != null) {
                    zu1Var.sa(0);
                    break;
                }
                break;
            case 16:
                zu1Var.E7(true);
                break;
            case 19:
                r47 r47Var = (r47) zu1Var.X4.get(Integer.valueOf(zu1Var.Z4));
                if (r47Var == null) {
                    r47Var = (r47) zu1Var.G6[0].get(zu1Var.Z4);
                }
                zu1Var.Jc(r47Var);
                break;
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(TLRPC.TL_error tL_error) {
    }

    @Override // lc5
    public final void d(TLRPC.User user) {
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(Throwable th) {
    }
}
