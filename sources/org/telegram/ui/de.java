package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class de implements org.telegram.ui.Components.l40, org.telegram.ui.Components.o40, org.telegram.ui.ActionBar.p1, org.telegram.ui.Components.nn, org.telegram.messenger.ir, org.telegram.ui.Components.rh0, ResultCallback, pi.m, zh.c, mh.a, m40, kr, mh.b, org.telegram.ui.Components.hj0, mh.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;

    public /* synthetic */ de(wm wmVar, int i3) {
        this.a = i3;
        this.b = wmVar;
    }

    @Override // org.telegram.ui.kr
    public void a() {
        wm wmVar = this.b;
        if (wmVar.N3 != null || wmVar.getParentActivity() == null) {
            return;
        }
        wmVar.f8();
        wmVar.N3.m(wmVar.k6, wmVar.f, 8);
    }

    @Override // org.telegram.ui.Components.nn
    public void b(TLRPC.Document document) {
        switch (this.a) {
            case 4:
                wm.n0(this.b, document);
                break;
            default:
                wm.v0(this.b, document);
                break;
        }
    }

    @Override // zh.c
    public void c(boolean z10, boolean z11) {
        wm wmVar = this.b;
        wmVar.b1.i(wmVar.za.b(), z10, z11);
    }

    @Override // mh.a
    public void d(int i3) {
        wm wmVar = this.b;
        if (i3 == 1) {
            wmVar.ua();
            return;
        }
        if (i3 == 2) {
            wmVar.ha();
            return;
        }
        if (i3 == 3) {
            wmVar.Q4 = true;
            wmVar.getMessagesController().w1(wmVar.k6, wmVar.b(), wmVar.A1, true, new pf(wmVar, 0));
            return;
        }
        if (i3 == 4) {
            wmVar.Q4 = true;
            wmVar.getMessagesController().w1(wmVar.k6, wmVar.b(), wmVar.B1, false, new pf(wmVar, 1));
            return;
        }
        if (i3 == 6) {
            wmVar.v9(true);
            return;
        }
        if (i3 == 5) {
            wmVar.v9(false);
        } else if (i3 == 0) {
            ei.x2 x2Var = wmVar.Y1;
            if (x2Var != null) {
                x2Var.w1(0, null);
            }
            wmVar.xa();
        }
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        wm wmVar = this.b;
        boolean z10 = false;
        if (wmVar.getParentActivity() != null) {
            kg.e1 adapter = wmVar.X1.getAdapter();
            if ((adapter.J != null || adapter.K != null) && i3 != 0) {
                kg.e1 adapter2 = wmVar.X1.getAdapter();
                if (adapter2.x0 != null && !adapter2.i0) {
                    return false;
                }
                Object J = wmVar.X1.getAdapter().J(i3 - 1);
                if (J instanceof kg.b1) {
                    kg.b1 b1Var = (kg.b1) J;
                    if (wmVar.X1.getAdapter().K != null && org.telegram.ui.Components.s31.h) {
                        wmVar.a0.setFieldText("");
                        mj mjVar = wmVar.a0;
                        String str = b1Var.a;
                        TLRPC.Chat chat = wmVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        mjVar.Z0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (wmVar.X1.getAdapter().K == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar.getParentActivity(), wmVar.ya);
                        String M0 = org.telegram.messenger.bd.M0(R.string.AppName, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.S = M0;
                        s1Var.U = org.telegram.messenger.bd.M0(2131752062, null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752099, null), new de(wmVar, 12));
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        wmVar.showDialog(s1Var);
                        return true;
                    }
                    if (org.telegram.ui.Components.s31.h) {
                        wmVar.a0.setFieldText("");
                        mj mjVar2 = wmVar.a0;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = wmVar.e;
                        if (chat2 != null && chat2.megagroup) {
                            z10 = true;
                        }
                        mjVar2.Z0(null, str2, true, z10);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 2:
                rj rjVar = this.b.E0;
                if (rjVar != null) {
                    rjVar.callOnClick();
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
                wm wmVar = this.b;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) wmVar.W4.get(Integer.valueOf(wmVar.Y4));
                if (ziVar == null) {
                    ziVar = (org.telegram.messenger.zi) wmVar.F6[0].get(wmVar.Y4);
                }
                wmVar.Gc(ziVar);
                break;
            case 6:
                wm wmVar2 = this.b;
                org.telegram.messenger.dj djVar = wmVar2.w5;
                if (djVar != null) {
                    djVar.d(null, wmVar2.k6);
                }
                wmVar2.z8();
                break;
            case 7:
                this.b.Ca(1);
                break;
            case 8:
                wm wmVar3 = this.b;
                wmVar3.getMessagesController().f5(null, wmVar3.f.id);
                break;
            case 10:
                this.b.finishFragment();
                break;
            case 12:
                kg.e1 adapter = this.b.X1.getAdapter();
                adapter.x.c();
                adapter.J.clear();
                adapter.f();
                org.telegram.ui.Components.x80 x80Var = adapter.W;
                if (x80Var != null) {
                    x80Var.a(false);
                    break;
                }
                break;
            case 15:
                wm wmVar4 = this.b;
                wmVar4.showDialog(new uk(wmVar4, wmVar4.getParentActivity(), wmVar4));
                break;
            case 16:
                wm wmVar5 = this.b;
                wmVar5.f8();
                UndoView undoView = wmVar5.N3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 18:
                wm wmVar6 = this.b;
                org.telegram.messenger.dj djVar2 = wmVar6.w5;
                if (djVar2 != null && djVar2.d != null) {
                    wmVar6.Ca(0);
                    break;
                }
                break;
            case 19:
                this.b.B9(true);
                break;
        }
    }

    @Override // org.telegram.ui.m40
    public void h(int i3, ArrayList arrayList) {
        wm wmVar = this.b;
        wmVar.getMessagesController().o(wmVar.e, wmVar, arrayList, i3, null, null, null);
        wmVar.getMessagesController().i2(wmVar.k6, wmVar.f, wmVar.e);
        wmVar.vd(true);
        wmVar.Sc(true);
    }

    @Override // org.telegram.ui.Components.rh0
    public void k(ArrayList arrayList) {
        switch (this.a) {
            case 11:
                wm wmVar = this.b;
                if (wmVar.getParentActivity() != null && wmVar.getParentActivity() != null) {
                    mh mhVar = new mh(wmVar, wmVar, wmVar.getParentActivity(), wmVar.ya, arrayList);
                    boolean T9 = wmVar.T9();
                    mhVar.i0 = T9;
                    mhVar.n = T9;
                    mhVar.p0 = false;
                    wmVar.O7(false);
                    wmVar.showDialog(mhVar);
                    break;
                }
                break;
            default:
                wm wmVar2 = this.b;
                if (wmVar2.getParentActivity() != null && wmVar2.getParentActivity() != null) {
                    hi hiVar = new hi(wmVar2, wmVar2, wmVar2.getParentActivity(), wmVar2.ya, arrayList);
                    boolean T92 = wmVar2.T9();
                    hiVar.i0 = T92;
                    hiVar.n = T92;
                    hiVar.p0 = false;
                    wmVar2.O7(false);
                    wmVar2.showDialog(hiVar);
                    break;
                }
                break;
        }
    }

    @Override // pi.m
    public void l(int i3) {
        wm.b1(this.b, i3);
    }

    @Override // org.telegram.messenger.ir
    public void o(boolean z10) {
        wm wmVar = this.b;
        org.telegram.messenger.hs notificationCenter = wmVar.getNotificationCenter();
        int i3 = org.telegram.messenger.hs.t;
        notificationCenter.n(wmVar, i3);
        wmVar.getNotificationCenter().k(i3, new Object[0]);
        wmVar.finishFragment();
        wmVar.getNotificationCenter().k(org.telegram.messenger.hs.K2, Long.valueOf(wmVar.k6), wmVar.f, wmVar.e, Boolean.valueOf(z10));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.p3 p3Var = (org.telegram.ui.ActionBar.p3) obj;
        wm wmVar = this.b;
        um umVar = wmVar.ya;
        umVar.r(p3Var, umVar.g, wmVar.g6 != 0, null, false);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override // org.telegram.ui.m40
    public /* synthetic */ void e(TLRPC.User user) {
    }
}
