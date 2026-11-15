package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ce implements org.telegram.ui.Components.s40, org.telegram.ui.Components.v40, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.wn, org.telegram.messenger.nr, org.telegram.ui.Components.sh0, ResultCallback, ri.m, zh.c, lh.a, lh.b, r40, or, org.telegram.ui.Components.ij0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ ce(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // org.telegram.ui.or
    public void a() {
        an anVar = this.b;
        if (anVar.N3 != null || anVar.getParentActivity() == null) {
            return;
        }
        anVar.h8();
        anVar.N3.m(anVar.k6, anVar.f, 8);
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        an anVar = this.b;
        boolean z10 = false;
        if (anVar.getParentActivity() != null) {
            jg.h1 adapter = anVar.X1.getAdapter();
            if ((adapter.J != null || adapter.K != null) && i7 != 0) {
                jg.h1 adapter2 = anVar.X1.getAdapter();
                if (adapter2.x0 != null && !adapter2.i0) {
                    return false;
                }
                Object J = anVar.X1.getAdapter().J(i7 - 1);
                if (J instanceof jg.e1) {
                    jg.e1 e1Var = (jg.e1) J;
                    if (anVar.X1.getAdapter().K != null && org.telegram.ui.Components.c41.h) {
                        anVar.a0.setFieldText("");
                        qj qjVar = anVar.a0;
                        String str = e1Var.a;
                        TLRPC.Chat chat = anVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        qjVar.q1(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (anVar.X1.getAdapter().K == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.Aa);
                        String M0 = org.telegram.messenger.hd.M0(R.string.AppName, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = M0;
                        t1Var.U = org.telegram.messenger.hd.M0(2131752062, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752099, null), new ce(anVar, 12));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        anVar.showDialog(t1Var);
                        return true;
                    }
                    if (org.telegram.ui.Components.c41.h) {
                        anVar.a0.setFieldText("");
                        qj qjVar2 = anVar.a0;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = anVar.e;
                        if (chat2 != null && chat2.megagroup) {
                            z10 = true;
                        }
                        qjVar2.q1(null, str2, true, z10);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.wn
    public void c(TLRPC.Document document) {
        switch (this.a) {
            case 4:
                an.K0(this.b, document);
                break;
            default:
                an.H1(this.b, document);
                break;
        }
    }

    @Override // org.telegram.ui.Components.sh0
    public void d(ArrayList arrayList) {
        switch (this.a) {
            case 11:
                an anVar = this.b;
                if (anVar.getParentActivity() != null && anVar.getParentActivity() != null) {
                    qh qhVar = new qh(anVar, anVar, anVar.getParentActivity(), anVar.Aa, arrayList);
                    boolean V9 = anVar.V9();
                    qhVar.i0 = V9;
                    qhVar.n = V9;
                    qhVar.p0 = false;
                    anVar.P7(false);
                    anVar.showDialog(qhVar);
                    break;
                }
                break;
            default:
                an anVar2 = this.b;
                if (anVar2.getParentActivity() != null && anVar2.getParentActivity() != null) {
                    li liVar = new li(anVar2, anVar2, anVar2.getParentActivity(), anVar2.Aa, arrayList);
                    boolean V92 = anVar2.V9();
                    liVar.i0 = V92;
                    liVar.n = V92;
                    liVar.p0 = false;
                    anVar2.P7(false);
                    anVar2.showDialog(liVar);
                    break;
                }
                break;
        }
    }

    @Override // zh.c
    public void e(boolean z10, boolean z11) {
        an anVar = this.b;
        anVar.b1.i(anVar.Ba.b(), z10, z11);
    }

    @Override // lh.a
    public void g(int i7) {
        an anVar = this.b;
        if (i7 == 1) {
            anVar.xa();
            return;
        }
        if (i7 == 2) {
            anVar.ka();
            return;
        }
        if (i7 == 3) {
            anVar.Q4 = true;
            anVar.getMessagesController().w1(anVar.k6, anVar.b(), anVar.A1, true, new qf(anVar, 0));
            return;
        }
        if (i7 == 4) {
            anVar.Q4 = true;
            anVar.getMessagesController().w1(anVar.k6, anVar.b(), anVar.B1, false, new qf(anVar, 1));
            return;
        }
        if (i7 == 6) {
            anVar.x9(true);
            return;
        }
        if (i7 == 5) {
            anVar.x9(false);
        } else if (i7 == 0) {
            fi.p2 p2Var = anVar.Y1;
            if (p2Var != null) {
                p2Var.w1(0, null);
            }
            anVar.Aa();
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 2:
                vj vjVar = this.b.E0;
                if (vjVar != null) {
                    vjVar.callOnClick();
                    break;
                }
                break;
            case 3:
                this.b.finishFragment();
                break;
            case 4:
            case 5:
            case 9:
            case 11:
            case 13:
            case 14:
            case 18:
            default:
                an anVar = this.b;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) anVar.W4.get(Integer.valueOf(anVar.Y4));
                if (gjVar == null) {
                    gjVar = (org.telegram.messenger.gj) anVar.F6[0].get(anVar.Y4);
                }
                anVar.Kc(gjVar);
                break;
            case 6:
                an anVar2 = this.b;
                org.telegram.messenger.kj kjVar = anVar2.w5;
                if (kjVar != null) {
                    kjVar.d(null, anVar2.k6);
                }
                anVar2.B8();
                break;
            case 7:
                this.b.Fa(1);
                break;
            case 8:
                an anVar3 = this.b;
                anVar3.getMessagesController().g5(null, anVar3.f.id);
                break;
            case 10:
                this.b.finishFragment();
                break;
            case 12:
                jg.h1 adapter = this.b.X1.getAdapter();
                adapter.x.c();
                adapter.J.clear();
                adapter.f();
                org.telegram.ui.Components.e90 e90Var = adapter.W;
                if (e90Var != null) {
                    e90Var.a(false);
                    break;
                }
                break;
            case 15:
                an anVar4 = this.b;
                anVar4.showDialog(new yk(anVar4, anVar4.getParentActivity(), anVar4));
                break;
            case 16:
                an anVar5 = this.b;
                anVar5.h8();
                UndoView undoView = anVar5.N3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 17:
                an anVar6 = this.b;
                anVar6.getLocationController().k(anVar6.k6);
                break;
            case 19:
                an anVar7 = this.b;
                org.telegram.messenger.kj kjVar2 = anVar7.w5;
                if (kjVar2 != null && kjVar2.d != null) {
                    anVar7.Fa(0);
                    break;
                }
                break;
            case 20:
                this.b.D9(true);
                break;
        }
    }

    @Override // org.telegram.ui.r40
    public void i(int i7, ArrayList arrayList) {
        an anVar = this.b;
        anVar.getMessagesController().o(anVar.e, anVar, arrayList, i7, null, null, null);
        anVar.getMessagesController().i2(anVar.k6, anVar.f, anVar.e);
        anVar.zd(true);
        anVar.Wc(true);
    }

    @Override // org.telegram.messenger.nr
    public void j(boolean z10) {
        an anVar = this.b;
        org.telegram.messenger.ns notificationCenter = anVar.getNotificationCenter();
        int i7 = org.telegram.messenger.ns.t;
        notificationCenter.n(anVar, i7);
        anVar.getNotificationCenter().k(i7, new Object[0]);
        anVar.finishFragment();
        anVar.getNotificationCenter().k(org.telegram.messenger.ns.K2, Long.valueOf(anVar.k6), anVar.f, anVar.e, Boolean.valueOf(z10));
    }

    @Override // ri.m
    public void l(int i7) {
        an.i1(this.b, i7);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.p3 p3Var = (org.telegram.ui.ActionBar.p3) obj;
        an anVar = this.b;
        ym ymVar = anVar.Aa;
        ymVar.r(p3Var, ymVar.g, anVar.g6 != 0, null, false);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override // org.telegram.ui.r40
    public /* synthetic */ void f(TLRPC.User user) {
    }
}
