package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fe implements org.telegram.ui.Components.p40, org.telegram.ui.Components.s40, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.on, org.telegram.messenger.qr, org.telegram.ui.Components.oh0, ResultCallback, oi.m, yh.c, lh.a, r40, mr, lh.b, org.telegram.ui.Components.dj0, lh.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ fe(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // org.telegram.ui.mr
    public void a() {
        an anVar = this.b;
        if (anVar.M3 != null || anVar.getParentActivity() == null) {
            return;
        }
        anVar.f8();
        anVar.M3.m(anVar.j6, anVar.f, 8);
    }

    @Override // org.telegram.ui.Components.on
    public void b(TLRPC.Document document) {
        switch (this.a) {
            case 4:
                an.n0(this.b, document);
                break;
            default:
                an.v0(this.b, document);
                break;
        }
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        an anVar = this.b;
        boolean z9 = false;
        if (anVar.getParentActivity() != null) {
            jg.i1 adapter = anVar.W1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i7 != 0) {
                jg.i1 adapter2 = anVar.W1.getAdapter();
                if (adapter2.w0 != null && !adapter2.h0) {
                    return false;
                }
                Object J = anVar.W1.getAdapter().J(i7 - 1);
                if (J instanceof jg.f1) {
                    jg.f1 f1Var = (jg.f1) J;
                    if (anVar.W1.getAdapter().J != null && org.telegram.ui.Components.y31.h) {
                        anVar.Z.setFieldText("");
                        qj qjVar = anVar.Z;
                        String str = f1Var.a;
                        TLRPC.Chat chat = anVar.e;
                        if (chat != null && chat.megagroup) {
                            z9 = true;
                        }
                        qjVar.Z0(null, str, true, z9);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (anVar.W1.getAdapter().J == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.xa);
                        String M0 = org.telegram.messenger.id.M0(R.string.AppName, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131752062, null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752099, null), new fe(anVar, 12));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        anVar.showDialog(u1Var);
                        return true;
                    }
                    if (org.telegram.ui.Components.y31.h) {
                        anVar.Z.setFieldText("");
                        qj qjVar2 = anVar.Z;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = anVar.e;
                        if (chat2 != null && chat2.megagroup) {
                            z9 = true;
                        }
                        qjVar2.Z0(null, str2, true, z9);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // yh.c
    public void d(boolean z9, boolean z10) {
        an anVar = this.b;
        anVar.a1.i(anVar.ya.b(), z9, z10);
    }

    @Override // org.telegram.ui.r40
    public void f(int i7, ArrayList arrayList) {
        an anVar = this.b;
        anVar.getMessagesController().o(anVar.e, anVar, arrayList, i7, null, null, null);
        anVar.getMessagesController().i2(anVar.j6, anVar.f, anVar.e);
        anVar.vd(true);
        anVar.Sc(true);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 2:
                vj vjVar = this.b.D0;
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
            case 17:
            default:
                an anVar = this.b;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) anVar.V4.get(Integer.valueOf(anVar.X4));
                if (ijVar == null) {
                    ijVar = (org.telegram.messenger.ij) anVar.E6[0].get(anVar.X4);
                }
                anVar.Gc(ijVar);
                break;
            case 6:
                an anVar2 = this.b;
                org.telegram.messenger.mj mjVar = anVar2.v5;
                if (mjVar != null) {
                    mjVar.d(null, anVar2.j6);
                }
                anVar2.z8();
                break;
            case 7:
                this.b.Ca(1);
                break;
            case 8:
                an anVar3 = this.b;
                anVar3.getMessagesController().f5(null, anVar3.f.id);
                break;
            case 10:
                this.b.finishFragment();
                break;
            case 12:
                jg.i1 adapter = this.b.W1.getAdapter();
                adapter.x.c();
                adapter.I.clear();
                adapter.f();
                org.telegram.ui.Components.b90 b90Var = adapter.V;
                if (b90Var != null) {
                    b90Var.a(false);
                    break;
                }
                break;
            case 15:
                an anVar4 = this.b;
                anVar4.showDialog(new yk(anVar4, anVar4.getParentActivity(), anVar4));
                break;
            case 16:
                an anVar5 = this.b;
                anVar5.f8();
                UndoView undoView = anVar5.M3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 18:
                an anVar6 = this.b;
                org.telegram.messenger.mj mjVar2 = anVar6.v5;
                if (mjVar2 != null && mjVar2.d != null) {
                    anVar6.Ca(0);
                    break;
                }
                break;
            case 19:
                this.b.B9(true);
                break;
        }
    }

    @Override // lh.a
    public void h(int i7) {
        an anVar = this.b;
        if (i7 == 1) {
            anVar.ua();
            return;
        }
        if (i7 == 2) {
            anVar.ha();
            return;
        }
        if (i7 == 3) {
            anVar.P4 = true;
            anVar.getMessagesController().w1(anVar.j6, anVar.b(), anVar.z1, true, new tf(anVar, 0));
            return;
        }
        if (i7 == 4) {
            anVar.P4 = true;
            anVar.getMessagesController().w1(anVar.j6, anVar.b(), anVar.A1, false, new tf(anVar, 1));
            return;
        }
        if (i7 == 6) {
            anVar.v9(true);
            return;
        }
        if (i7 == 5) {
            anVar.v9(false);
        } else if (i7 == 0) {
            di.u2 u2Var = anVar.X1;
            if (u2Var != null) {
                u2Var.w1(0, null);
            }
            anVar.xa();
        }
    }

    @Override // org.telegram.ui.Components.oh0
    public void j(ArrayList arrayList) {
        switch (this.a) {
            case 11:
                an anVar = this.b;
                if (anVar.getParentActivity() != null && anVar.getParentActivity() != null) {
                    qh qhVar = new qh(anVar, anVar, anVar.getParentActivity(), anVar.xa, arrayList);
                    boolean T9 = anVar.T9();
                    qhVar.h0 = T9;
                    qhVar.n = T9;
                    qhVar.o0 = false;
                    anVar.O7(false);
                    anVar.showDialog(qhVar);
                    break;
                }
                break;
            default:
                an anVar2 = this.b;
                if (anVar2.getParentActivity() != null && anVar2.getParentActivity() != null) {
                    li liVar = new li(anVar2, anVar2, anVar2.getParentActivity(), anVar2.xa, arrayList);
                    boolean T92 = anVar2.T9();
                    liVar.h0 = T92;
                    liVar.n = T92;
                    liVar.o0 = false;
                    anVar2.O7(false);
                    anVar2.showDialog(liVar);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.qr
    public void k(boolean z9) {
        an anVar = this.b;
        org.telegram.messenger.qs notificationCenter = anVar.getNotificationCenter();
        int i7 = org.telegram.messenger.qs.t;
        notificationCenter.n(anVar, i7);
        anVar.getNotificationCenter().k(i7, new Object[0]);
        anVar.finishFragment();
        anVar.getNotificationCenter().k(org.telegram.messenger.qs.K2, Long.valueOf(anVar.j6), anVar.f, anVar.e, Boolean.valueOf(z9));
    }

    @Override // oi.m
    public void l(int i7) {
        an.b1(this.b, i7);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) obj;
        an anVar = this.b;
        ym ymVar = anVar.xa;
        ymVar.r(r3Var, ymVar.g, anVar.f6 != 0, null, false);
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
    public /* synthetic */ void e(TLRPC.User user) {
    }
}
