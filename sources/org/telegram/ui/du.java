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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class du implements org.telegram.ui.Components.qo0, org.telegram.ui.Components.gj0, org.telegram.ui.Components.hj0, nz, org.telegram.ui.ActionBar.p1, pi.m, r0.m, pi.n, org.telegram.ui.Components.ui0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uw b;

    public /* synthetic */ du(uw uwVar, int i3) {
        this.a = i3;
        this.b = uwVar;
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        uw uwVar = this.b;
        uwVar.w.j(k1Var);
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        uwVar.f4 = I0.b;
        uwVar.g4 = I0.d;
        int i3 = k1Var.a.f(8).d;
        if (uwVar.h4 != i3) {
            uwVar.h4 = i3;
            uwVar.fragmentView.requestLayout();
        }
        uwVar.G0.setPadding(0, uwVar.f4, 0, 0);
        uwVar.k5();
        for (UndoView undoView : uwVar.z0) {
            if (undoView != null) {
                int i10 = uwVar.g4 + uwVar.i4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i10) {
                    marginLayoutParams.bottomMargin = i10;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        pv pvVar = uwVar.G3;
        if (pvVar != null) {
            r0.i0.b(pvVar, k1Var);
        }
        return r0.k1.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100 A[SYNTHETIC] */
    @Override // org.telegram.ui.Components.gj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(float f10, float f11, int i3, View view) {
        TLRPC.Chat chat;
        switch (this.a) {
            case 1:
                uw uwVar = this.b;
                org.telegram.ui.Components.r31 G = uwVar.D0.m0.G(i3);
                Object obj = G != null ? G.G : null;
                if (!(obj instanceof TLRPC.Chat)) {
                    if (obj instanceof org.telegram.messenger.zi) {
                        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                        Bundle bundle = new Bundle();
                        if (org.telegram.messenger.zi.B0(ziVar.k) >= 0) {
                            bundle.putLong("user_id", org.telegram.messenger.zi.B0(ziVar.k));
                        } else {
                            bundle.putLong("chat_id", -org.telegram.messenger.zi.B0(ziVar.k));
                        }
                        bundle.putInt("message_id", ziVar.f1());
                        wm wmVar = new wm(bundle);
                        uw.p4(wmVar, ziVar);
                        uwVar.presentFragment(wmVar);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    wm wmVar2 = new wm(bundle2);
                    org.telegram.ui.Components.dm0 dm0Var = uwVar.D0.m0;
                    dm0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i3++;
                        if (i3 >= dm0Var.E.size()) {
                            wmVar2.Cb = arrayList;
                            uwVar.presentFragment(wmVar2);
                            break;
                        } else {
                            org.telegram.ui.Components.r31 G2 = dm0Var.G(i3);
                            if (G2 != null) {
                                Object obj2 = G2.G;
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
                uw uwVar2 = this.b;
                org.telegram.ui.Components.r31 G3 = uwVar2.D0.r0.G(i3);
                Object obj3 = G3 != null ? G3.G : null;
                if (!(obj3 instanceof TLRPC.User)) {
                    if (obj3 instanceof org.telegram.messenger.zi) {
                        org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) obj3;
                        Bundle bundle3 = new Bundle();
                        if (org.telegram.messenger.zi.B0(ziVar2.k) >= 0) {
                            bundle3.putLong("user_id", org.telegram.messenger.zi.B0(ziVar2.k));
                        } else {
                            bundle3.putLong("chat_id", -org.telegram.messenger.zi.B0(ziVar2.k));
                        }
                        bundle3.putInt("message_id", ziVar2.f1());
                        wm wmVar3 = new wm(bundle3);
                        uw.p4(wmVar3, ziVar2);
                        uwVar2.presentFragment(wmVar3);
                        break;
                    }
                } else {
                    uwVar2.presentFragment(ProfileActivity.A4(((TLRPC.User) obj3).id));
                    break;
                }
                break;
            default:
                uw uwVar3 = this.b;
                Object I = uwVar3.D0.e0.I(i3);
                if (!(I instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof org.telegram.ui.Cells.f6) {
                        org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
                        if (f6Var.o0) {
                            uwVar3.Z4(f6Var.getDialogId(), view);
                            break;
                        }
                    }
                    if (uwVar3.S0 != 10) {
                        uwVar3.z4(view, i3, uwVar3.D0.e0);
                        break;
                    } else {
                        cw cwVar = uwVar3.D0;
                        ci.j1 j1Var = cwVar.b0;
                        uwVar3.A4(view, i3, f10, cwVar.e0);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) I;
                    uwVar3.presentFragment(wm.ra(org.telegram.messenger.m5.o(tL_sponsoredPeer.peer)));
                    org.telegram.ui.Components.bm0 bm0Var = uwVar3.D0.e0;
                    bm0Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(bm0Var.t0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ boolean b1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // pi.n
    public int e() {
        uw uwVar = this.b;
        uwVar.getClass();
        return uwVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6);
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        uw.q0(this.b, i3);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 6:
                uw.h0(this.b);
                break;
            case 7:
                uw uwVar = this.b;
                uwVar.getMessagesController().j2();
                uwVar.n4(false);
                break;
            case 8:
            case 9:
            default:
                uw uwVar2 = this.b;
                Intent intent = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                try {
                    uwVar2.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            case 10:
                uw uwVar3 = this.b;
                Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent2.setPackage("com.miui.securitycenter");
                intent2.putExtra("extra_package_uid", Process.myUid());
                intent2.putExtra("extra_pkgname", org.telegram.messenger.t0.b.getPackageName());
                try {
                    try {
                        uwVar3.getParentActivity().startActivity(intent2);
                        break;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        return;
                    }
                } catch (Exception unused) {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    uwVar3.getParentActivity().startActivity(intent3);
                    return;
                }
        }
    }

    @Override // org.telegram.ui.Components.ui0
    public void h() {
        uw uwVar = this.b;
        uwVar.R = true;
        uwVar.fragmentView.invalidate();
    }

    public void i(int i3) {
        gv gvVar = this.b.C1;
        if (gvVar == null) {
            return;
        }
        if (i3 == 0) {
            gvVar.n0(true);
        } else {
            gvVar.x1(true, false);
        }
    }

    public void j(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.b.j5(z10, arrayList, arrayList2, z11, true);
    }

    @Override // pi.m
    public void l(int i3) {
        uw.C0(this.b, i3);
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
        int i3 = this.a;
    }

    private final /* synthetic */ void a(View view, float f10, float f11) {
    }

    private final /* synthetic */ void c(View view, float f10, float f11) {
    }

    private final /* synthetic */ void d(View view, float f10, float f11) {
    }
}
