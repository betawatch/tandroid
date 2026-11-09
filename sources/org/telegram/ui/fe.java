package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fe implements org.telegram.ui.Components.q40, org.telegram.ui.Components.t40, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.on, org.telegram.messenger.qr, org.telegram.ui.Components.ph0, ResultCallback, oi.m, yh.c, lh.a, lh.b, t40, or, org.telegram.ui.Components.ej0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;

    public /* synthetic */ fe(cn cnVar, int i7) {
        this.a = i7;
        this.b = cnVar;
    }

    @Override // org.telegram.ui.or
    public void a() {
        cn cnVar = this.b;
        if (cnVar.M3 != null || cnVar.getParentActivity() == null) {
            return;
        }
        cnVar.g8();
        cnVar.M3.m(cnVar.j6, cnVar.f, 8);
    }

    @Override // org.telegram.ui.Components.on
    public void b(TLRPC.Document document) {
        switch (this.a) {
            case 4:
                cn.K0(this.b, document);
                break;
            default:
                cn.H1(this.b, document);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean c(int i7, View view) {
        cn cnVar = this.b;
        boolean z9 = false;
        if (cnVar.getParentActivity() != null) {
            jg.i1 adapter = cnVar.W1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i7 != 0) {
                jg.i1 adapter2 = cnVar.W1.getAdapter();
                if (adapter2.w0 != null && !adapter2.h0) {
                    return false;
                }
                Object J = cnVar.W1.getAdapter().J(i7 - 1);
                if (J instanceof jg.f1) {
                    jg.f1 f1Var = (jg.f1) J;
                    if (cnVar.W1.getAdapter().J != null && org.telegram.ui.Components.z31.h) {
                        cnVar.Z.setFieldText("");
                        sj sjVar = cnVar.Z;
                        String str = f1Var.a;
                        TLRPC.Chat chat = cnVar.e;
                        if (chat != null && chat.megagroup) {
                            z9 = true;
                        }
                        sjVar.a1(null, str, true, z9);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (cnVar.W1.getAdapter().J == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cnVar.getParentActivity(), cnVar.za);
                        String M0 = org.telegram.messenger.id.M0(R.string.AppName, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131752062, null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752099, null), new fe(cnVar, 12));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        cnVar.showDialog(u1Var);
                        return true;
                    }
                    if (org.telegram.ui.Components.z31.h) {
                        cnVar.Z.setFieldText("");
                        sj sjVar2 = cnVar.Z;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = cnVar.e;
                        if (chat2 != null && chat2.megagroup) {
                            z9 = true;
                        }
                        sjVar2.a1(null, str2, true, z9);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // yh.c
    public void d(boolean z9, boolean z10) {
        cn cnVar = this.b;
        cnVar.a1.i(cnVar.Aa.b(), z9, z10);
    }

    @Override // org.telegram.ui.t40
    public void f(int i7, ArrayList arrayList) {
        cn cnVar = this.b;
        cnVar.getMessagesController().o(cnVar.e, cnVar, arrayList, i7, null, null, null);
        cnVar.getMessagesController().i2(cnVar.j6, cnVar.f, cnVar.e);
        cnVar.yd(true);
        cnVar.Vc(true);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 2:
                xj xjVar = this.b.D0;
                if (xjVar != null) {
                    xjVar.callOnClick();
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
                cn cnVar = this.b;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) cnVar.V4.get(Integer.valueOf(cnVar.X4));
                if (ijVar == null) {
                    ijVar = (org.telegram.messenger.ij) cnVar.E6[0].get(cnVar.X4);
                }
                cnVar.Jc(ijVar);
                break;
            case 6:
                cn cnVar2 = this.b;
                org.telegram.messenger.mj mjVar = cnVar2.v5;
                if (mjVar != null) {
                    mjVar.d(null, cnVar2.j6);
                }
                cnVar2.A8();
                break;
            case 7:
                this.b.Ea(1);
                break;
            case 8:
                cn cnVar3 = this.b;
                cnVar3.getMessagesController().f5(null, cnVar3.f.id);
                break;
            case 10:
                this.b.finishFragment();
                break;
            case 12:
                jg.i1 adapter = this.b.W1.getAdapter();
                adapter.x.c();
                adapter.I.clear();
                adapter.f();
                org.telegram.ui.Components.c90 c90Var = adapter.V;
                if (c90Var != null) {
                    c90Var.a(false);
                    break;
                }
                break;
            case 15:
                cn cnVar4 = this.b;
                cnVar4.showDialog(new al(cnVar4, cnVar4.getParentActivity(), cnVar4));
                break;
            case 16:
                cn cnVar5 = this.b;
                cnVar5.g8();
                UndoView undoView = cnVar5.M3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 17:
                cn cnVar6 = this.b;
                cnVar6.getLocationController().k(cnVar6.j6);
                break;
            case 19:
                cn cnVar7 = this.b;
                org.telegram.messenger.mj mjVar2 = cnVar7.v5;
                if (mjVar2 != null && mjVar2.d != null) {
                    cnVar7.Ea(0);
                    break;
                }
                break;
            case 20:
                this.b.C9(true);
                break;
        }
    }

    @Override // lh.a
    public void h(int i7) {
        cn cnVar = this.b;
        if (i7 == 1) {
            cnVar.wa();
            return;
        }
        if (i7 == 2) {
            cnVar.ja();
            return;
        }
        if (i7 == 3) {
            cnVar.P4 = true;
            cnVar.getMessagesController().w1(cnVar.j6, cnVar.b(), cnVar.z1, true, new tf(cnVar, 0));
            return;
        }
        if (i7 == 4) {
            cnVar.P4 = true;
            cnVar.getMessagesController().w1(cnVar.j6, cnVar.b(), cnVar.A1, false, new tf(cnVar, 1));
            return;
        }
        if (i7 == 6) {
            cnVar.w9(true);
            return;
        }
        if (i7 == 5) {
            cnVar.w9(false);
        } else if (i7 == 0) {
            di.u2 u2Var = cnVar.X1;
            if (u2Var != null) {
                u2Var.w1(0, null);
            }
            cnVar.za();
        }
    }

    @Override // org.telegram.ui.Components.ph0
    public void j(ArrayList arrayList) {
        switch (this.a) {
            case 11:
                cn cnVar = this.b;
                if (cnVar.getParentActivity() != null && cnVar.getParentActivity() != null) {
                    sh shVar = new sh(cnVar, cnVar, cnVar.getParentActivity(), cnVar.za, arrayList);
                    boolean U9 = cnVar.U9();
                    shVar.h0 = U9;
                    shVar.n = U9;
                    shVar.o0 = false;
                    cnVar.P7(false);
                    cnVar.showDialog(shVar);
                    break;
                }
                break;
            default:
                cn cnVar2 = this.b;
                if (cnVar2.getParentActivity() != null && cnVar2.getParentActivity() != null) {
                    ni niVar = new ni(cnVar2, cnVar2, cnVar2.getParentActivity(), cnVar2.za, arrayList);
                    boolean U92 = cnVar2.U9();
                    niVar.h0 = U92;
                    niVar.n = U92;
                    niVar.o0 = false;
                    cnVar2.P7(false);
                    cnVar2.showDialog(niVar);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.qr
    public void k(boolean z9) {
        cn cnVar = this.b;
        org.telegram.messenger.qs notificationCenter = cnVar.getNotificationCenter();
        int i7 = org.telegram.messenger.qs.t;
        notificationCenter.n(cnVar, i7);
        cnVar.getNotificationCenter().k(i7, new Object[0]);
        cnVar.finishFragment();
        cnVar.getNotificationCenter().k(org.telegram.messenger.qs.K2, Long.valueOf(cnVar.j6), cnVar.f, cnVar.e, Boolean.valueOf(z9));
    }

    @Override // oi.m
    public void l(int i7) {
        cn.i1(this.b, i7);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) obj;
        cn cnVar = this.b;
        an anVar = cnVar.za;
        anVar.r(r3Var, anVar.g, cnVar.f6 != 0, null, false);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override // org.telegram.ui.t40
    public /* synthetic */ void e(TLRPC.User user) {
    }
}
