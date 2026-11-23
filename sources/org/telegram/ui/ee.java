package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ee implements org.telegram.ui.Components.d50, org.telegram.ui.Components.g50, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.ho, org.telegram.messenger.mr, org.telegram.ui.Components.di0, ResultCallback, ri.m, zh.c, lh.a, u40, pr, lh.b, org.telegram.ui.Components.sj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;

    public /* synthetic */ ee(bn bnVar, int i7) {
        this.a = i7;
        this.b = bnVar;
    }

    @Override // org.telegram.ui.pr
    public void a() {
        bn bnVar = this.b;
        if (bnVar.N3 != null || bnVar.getParentActivity() == null) {
            return;
        }
        bnVar.h8();
        bnVar.N3.m(bnVar.l6, bnVar.f, 8);
    }

    @Override // org.telegram.ui.Components.ho
    public void b(TLRPC.Document document) {
        switch (this.a) {
            case 4:
                bn.K0(this.b, document);
                break;
            default:
                bn.H1(this.b, document);
                break;
        }
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean c(int i7, View view) {
        bn bnVar = this.b;
        boolean z10 = false;
        if (bnVar.getParentActivity() != null) {
            jg.h1 adapter = bnVar.X1.getAdapter();
            if ((adapter.J != null || adapter.K != null) && i7 != 0) {
                jg.h1 adapter2 = bnVar.X1.getAdapter();
                if (adapter2.x0 != null && !adapter2.i0) {
                    return false;
                }
                Object J = bnVar.X1.getAdapter().J(i7 - 1);
                if (J instanceof jg.e1) {
                    jg.e1 e1Var = (jg.e1) J;
                    if (bnVar.X1.getAdapter().K != null && org.telegram.ui.Components.p41.h) {
                        bnVar.a0.setFieldText("");
                        rj rjVar = bnVar.a0;
                        String str = e1Var.a;
                        TLRPC.Chat chat = bnVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        rjVar.C1(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (bnVar.X1.getAdapter().K == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), bnVar.Ba);
                        String N0 = org.telegram.messenger.hd.N0(R.string.AppName, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.hd.N0(2131752050, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752087, null), new ee(bnVar, 12));
                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                        bnVar.showDialog(t1Var);
                        return true;
                    }
                    if (org.telegram.ui.Components.p41.h) {
                        bnVar.a0.setFieldText("");
                        rj rjVar2 = bnVar.a0;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = bnVar.e;
                        if (chat2 != null && chat2.megagroup) {
                            z10 = true;
                        }
                        rjVar2.C1(null, str2, true, z10);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.mr
    public void d(boolean z10) {
        bn bnVar = this.b;
        org.telegram.messenger.ls notificationCenter = bnVar.getNotificationCenter();
        int i7 = org.telegram.messenger.ls.t;
        notificationCenter.n(bnVar, i7);
        bnVar.getNotificationCenter().k(i7, new Object[0]);
        bnVar.finishFragment();
        bnVar.getNotificationCenter().k(org.telegram.messenger.ls.K2, Long.valueOf(bnVar.l6), bnVar.f, bnVar.e, Boolean.valueOf(z10));
    }

    @Override // org.telegram.ui.Components.di0
    public void e(ArrayList arrayList) {
        switch (this.a) {
            case 11:
                bn bnVar = this.b;
                if (bnVar.getParentActivity() != null && bnVar.getParentActivity() != null) {
                    qh qhVar = new qh(bnVar, bnVar, bnVar.getParentActivity(), bnVar.Ba, arrayList);
                    boolean V9 = bnVar.V9();
                    qhVar.i0 = V9;
                    qhVar.n = V9;
                    qhVar.p0 = false;
                    bnVar.P7(false);
                    bnVar.showDialog(qhVar);
                    break;
                }
                break;
            default:
                bn bnVar2 = this.b;
                if (bnVar2.getParentActivity() != null && bnVar2.getParentActivity() != null) {
                    mi miVar = new mi(bnVar2, bnVar2, bnVar2.getParentActivity(), bnVar2.Ba, arrayList);
                    boolean V92 = bnVar2.V9();
                    miVar.i0 = V92;
                    miVar.n = V92;
                    miVar.p0 = false;
                    bnVar2.P7(false);
                    bnVar2.showDialog(miVar);
                    break;
                }
                break;
        }
    }

    @Override // zh.c
    public void g(boolean z10, boolean z11) {
        bn bnVar = this.b;
        bnVar.b1.j(bnVar.Ca.b(), z10, z11);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 2:
                wj wjVar = this.b.E0;
                if (wjVar != null) {
                    wjVar.callOnClick();
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
                bn bnVar = this.b;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) bnVar.X4.get(Integer.valueOf(bnVar.Z4));
                if (gjVar == null) {
                    gjVar = (org.telegram.messenger.gj) bnVar.G6[0].get(bnVar.Z4);
                }
                bnVar.Kc(gjVar);
                break;
            case 6:
                bn bnVar2 = this.b;
                org.telegram.messenger.kj kjVar = bnVar2.x5;
                if (kjVar != null) {
                    kjVar.d(null, bnVar2.l6);
                }
                bnVar2.B8();
                break;
            case 7:
                this.b.Fa(1);
                break;
            case 8:
                bn bnVar3 = this.b;
                bnVar3.getMessagesController().r5(null, bnVar3.f.id);
                break;
            case 10:
                this.b.finishFragment();
                break;
            case 12:
                jg.h1 adapter = this.b.X1.getAdapter();
                adapter.x.c();
                adapter.J.clear();
                adapter.f();
                org.telegram.ui.Components.q90 q90Var = adapter.W;
                if (q90Var != null) {
                    q90Var.a(false);
                    break;
                }
                break;
            case 15:
                bn bnVar4 = this.b;
                bnVar4.showDialog(new zk(bnVar4, bnVar4.getParentActivity(), bnVar4));
                break;
            case 16:
                bn bnVar5 = this.b;
                bnVar5.h8();
                UndoView undoView = bnVar5.N3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 17:
                bn bnVar6 = this.b;
                bnVar6.getLocationController().k(bnVar6.l6);
                break;
            case 19:
                bn bnVar7 = this.b;
                org.telegram.messenger.kj kjVar2 = bnVar7.x5;
                if (kjVar2 != null && kjVar2.d != null) {
                    bnVar7.Fa(0);
                    break;
                }
                break;
            case 20:
                this.b.D9(true);
                break;
        }
    }

    @Override // org.telegram.ui.u40
    public void i(int i7, ArrayList arrayList) {
        bn bnVar = this.b;
        bnVar.getMessagesController().o(bnVar.e, bnVar, arrayList, i7, null, null, null);
        bnVar.getMessagesController().k2(bnVar.l6, bnVar.f, bnVar.e);
        bnVar.zd(true);
        bnVar.Wc(true);
    }

    @Override // lh.a
    public void j(int i7) {
        bn bnVar = this.b;
        if (i7 == 1) {
            bnVar.xa();
            return;
        }
        if (i7 == 2) {
            bnVar.ka();
            return;
        }
        if (i7 == 3) {
            bnVar.R4 = true;
            bnVar.getMessagesController().y1(bnVar.l6, bnVar.d(), bnVar.A1, true, new sf(bnVar, 0));
            return;
        }
        if (i7 == 4) {
            bnVar.R4 = true;
            bnVar.getMessagesController().y1(bnVar.l6, bnVar.d(), bnVar.B1, false, new sf(bnVar, 1));
            return;
        }
        if (i7 == 6) {
            bnVar.x9(true);
            return;
        }
        if (i7 == 5) {
            bnVar.x9(false);
        } else if (i7 == 0) {
            fi.n2 n2Var = bnVar.Y1;
            if (n2Var != null) {
                n2Var.x1(0, null);
            }
            bnVar.Aa();
        }
    }

    @Override // ri.m
    public void l(int i7) {
        bn.i1(this.b, i7);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.s3 s3Var = (org.telegram.ui.ActionBar.s3) obj;
        bn bnVar = this.b;
        zm zmVar = bnVar.Ba;
        zmVar.r(s3Var, zmVar.g, bnVar.h6 != 0, null, false);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override // org.telegram.ui.u40
    public /* synthetic */ void f(TLRPC.User user) {
    }
}
