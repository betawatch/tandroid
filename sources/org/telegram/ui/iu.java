package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class iu implements org.telegram.ui.Components.cp0, org.telegram.ui.Components.rj0, org.telegram.ui.Components.sj0, sz, org.telegram.ui.ActionBar.q1, ri.m, r0.m, ri.n, org.telegram.ui.Components.gj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bx b;

    public /* synthetic */ iu(bx bxVar, int i7) {
        this.a = i7;
        this.b = bxVar;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean U0(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean b(int i7, View view) {
        bx.n0(this.b, i7);
        return false;
    }

    public void e(int i7) {
        mv mvVar = this.b.D1;
        if (mvVar == null) {
            return;
        }
        if (i7 == 0) {
            mvVar.P0(true);
        } else {
            mvVar.e2(true, false);
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public void f() {
        bx bxVar = this.b;
        bxVar.R = true;
        bxVar.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void f0(View view, float f10, float f11) {
        int i7 = this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100 A[SYNTHETIC] */
    @Override // org.telegram.ui.Components.rj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(float f10, float f11, int i7, View view) {
        TLRPC.Chat chat;
        switch (this.a) {
            case 1:
                bx bxVar = this.b;
                org.telegram.ui.Components.n41 G = bxVar.D0.m0.G(i7);
                Object obj = G != null ? G.H : null;
                if (!(obj instanceof TLRPC.Chat)) {
                    if (obj instanceof org.telegram.messenger.fj) {
                        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                        Bundle bundle = new Bundle();
                        if (org.telegram.messenger.fj.B0(fjVar.k) >= 0) {
                            bundle.putLong("user_id", org.telegram.messenger.fj.B0(fjVar.k));
                        } else {
                            bundle.putLong("chat_id", -org.telegram.messenger.fj.B0(fjVar.k));
                        }
                        bundle.putInt("message_id", fjVar.e1());
                        bn bnVar = new bn(bundle);
                        bx.r4(bnVar, fjVar);
                        bxVar.presentFragment(bnVar);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    bn bnVar2 = new bn(bundle2);
                    org.telegram.ui.Components.om0 om0Var = bxVar.D0.m0;
                    om0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i7++;
                        if (i7 >= om0Var.E.size()) {
                            bnVar2.Fb = arrayList;
                            bxVar.presentFragment(bnVar2);
                            break;
                        } else {
                            org.telegram.ui.Components.n41 G2 = om0Var.G(i7);
                            if (G2 != null) {
                                Object obj2 = G2.H;
                                if (obj2 instanceof TLRPC.Chat) {
                                    chat = (TLRPC.Chat) obj2;
                                    if (chat == null) {
                                        arrayList.add(chat);
                                    }
                                }
                            }
                            chat = null;
                            if (chat == null) {
                            }
                        }
                    }
                }
                break;
            case 2:
                bx bxVar2 = this.b;
                org.telegram.ui.Components.n41 G3 = bxVar2.D0.r0.G(i7);
                Object obj3 = G3 != null ? G3.H : null;
                if (!(obj3 instanceof TLRPC.User)) {
                    if (obj3 instanceof org.telegram.messenger.fj) {
                        org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) obj3;
                        Bundle bundle3 = new Bundle();
                        if (org.telegram.messenger.fj.B0(fjVar2.k) >= 0) {
                            bundle3.putLong("user_id", org.telegram.messenger.fj.B0(fjVar2.k));
                        } else {
                            bundle3.putLong("chat_id", -org.telegram.messenger.fj.B0(fjVar2.k));
                        }
                        bundle3.putInt("message_id", fjVar2.e1());
                        bn bnVar3 = new bn(bundle3);
                        bx.r4(bnVar3, fjVar2);
                        bxVar2.presentFragment(bnVar3);
                        break;
                    }
                } else {
                    bxVar2.presentFragment(ProfileActivity.D4(((TLRPC.User) obj3).id));
                    break;
                }
                break;
            default:
                bx bxVar3 = this.b;
                Object I = bxVar3.D0.e0.I(i7);
                if (!(I instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof org.telegram.ui.Cells.g6) {
                        org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
                        if (g6Var.o0) {
                            bxVar3.h5(g6Var.getDialogId(), view);
                            break;
                        }
                    }
                    if (bxVar3.T0 != 10) {
                        bxVar3.E4(view, i7, bxVar3.D0.e0);
                        break;
                    } else {
                        jw jwVar = bxVar3.D0;
                        di.b1 b1Var = jwVar.b0;
                        bxVar3.F4(view, i7, f10, jwVar.e0);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) I;
                    bxVar3.presentFragment(bn.ua(org.telegram.messenger.n5.o(tL_sponsoredPeer.peer)));
                    org.telegram.ui.Components.mm0 mm0Var = bxVar3.D0.e0;
                    mm0Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(mm0Var.t0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    public void h(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.b.r5(z10, arrayList, arrayList2, z11, true);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 6:
                bx.E0(this.b);
                break;
            case 7:
                bx bxVar = this.b;
                bxVar.getMessagesController().l2();
                bxVar.p4(false);
                break;
            case 8:
            case 9:
            default:
                bx bxVar2 = this.b;
                Intent intent = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                try {
                    bxVar2.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            case 10:
                bx bxVar3 = this.b;
                Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent2.setPackage("com.miui.securitycenter");
                intent2.putExtra("extra_package_uid", Process.myUid());
                intent2.putExtra("extra_pkgname", org.telegram.messenger.t0.b.getPackageName());
                try {
                    try {
                        bxVar3.getParentActivity().startActivity(intent2);
                        break;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        return;
                    }
                } catch (Exception unused) {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    bxVar3.getParentActivity().startActivity(intent3);
                    return;
                }
        }
    }

    @Override // ri.n
    public int j() {
        bx bxVar = this.b;
        bxVar.getClass();
        return bxVar.getThemedColor(org.telegram.ui.ActionBar.n6.d6);
    }

    @Override // ri.m
    public void k(int i7) {
        bx.D0(this.b, i7);
    }

    @Override // r0.m
    public r0.l1 l1(View view, r0.l1 l1Var) {
        bx bxVar = this.b;
        bxVar.w.j(l1Var);
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        bxVar.j4 = I0.b;
        bxVar.k4 = I0.d;
        int i7 = l1Var.a.f(8).d;
        if (bxVar.l4 != i7) {
            bxVar.l4 = i7;
            bxVar.fragmentView.requestLayout();
        }
        bxVar.G0.setPadding(0, bxVar.j4, 0, 0);
        bxVar.s5();
        for (UndoView undoView : bxVar.z0) {
            if (undoView != null) {
                int i10 = bxVar.k4 + bxVar.m4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i10) {
                    marginLayoutParams.bottomMargin = i10;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        wv wvVar = bxVar.H3;
        if (wvVar != null) {
            r0.i0.b(wvVar, l1Var);
        }
        return r0.l1.b;
    }

    private final /* synthetic */ void a(View view, float f10, float f11) {
    }

    private final /* synthetic */ void c(View view, float f10, float f11) {
    }

    private final /* synthetic */ void d(View view, float f10, float f11) {
    }
}
