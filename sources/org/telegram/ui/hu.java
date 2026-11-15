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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class hu implements org.telegram.ui.Components.so0, org.telegram.ui.Components.hj0, org.telegram.ui.Components.ij0, qz, org.telegram.ui.ActionBar.q1, ri.m, r0.m, ri.n, org.telegram.ui.Components.vi0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yw b;

    public /* synthetic */ hu(yw ywVar, int i7) {
        this.a = i7;
        this.b = ywVar;
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        yw ywVar = this.b;
        ywVar.w.j(k1Var);
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        ywVar.g4 = I0.b;
        ywVar.h4 = I0.d;
        int i7 = k1Var.a.f(8).d;
        if (ywVar.i4 != i7) {
            ywVar.i4 = i7;
            ywVar.fragmentView.requestLayout();
        }
        ywVar.G0.setPadding(0, ywVar.g4, 0, 0);
        ywVar.k5();
        for (UndoView undoView : ywVar.z0) {
            if (undoView != null) {
                int i10 = ywVar.h4 + ywVar.j4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i10) {
                    marginLayoutParams.bottomMargin = i10;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        uv uvVar = ywVar.H3;
        if (uvVar != null) {
            r0.i0.b(uvVar, k1Var);
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        yw.q0(this.b, i7);
        return false;
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ boolean c1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // ri.n
    public int e() {
        yw ywVar = this.b;
        ywVar.getClass();
        return ywVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100 A[SYNTHETIC] */
    @Override // org.telegram.ui.Components.hj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(float f10, float f11, int i7, View view) {
        TLRPC.Chat chat;
        switch (this.a) {
            case 1:
                yw ywVar = this.b;
                org.telegram.ui.Components.b41 G = ywVar.D0.m0.G(i7);
                Object obj = G != null ? G.G : null;
                if (!(obj instanceof TLRPC.Chat)) {
                    if (obj instanceof org.telegram.messenger.gj) {
                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                        Bundle bundle = new Bundle();
                        if (org.telegram.messenger.gj.B0(gjVar.k) >= 0) {
                            bundle.putLong("user_id", org.telegram.messenger.gj.B0(gjVar.k));
                        } else {
                            bundle.putLong("chat_id", -org.telegram.messenger.gj.B0(gjVar.k));
                        }
                        bundle.putInt("message_id", gjVar.e1());
                        an anVar = new an(bundle);
                        yw.p4(anVar, gjVar);
                        ywVar.presentFragment(anVar);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    an anVar2 = new an(bundle2);
                    org.telegram.ui.Components.em0 em0Var = ywVar.D0.m0;
                    em0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i7++;
                        if (i7 >= em0Var.E.size()) {
                            anVar2.Eb = arrayList;
                            ywVar.presentFragment(anVar2);
                            break;
                        } else {
                            org.telegram.ui.Components.b41 G2 = em0Var.G(i7);
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
                yw ywVar2 = this.b;
                org.telegram.ui.Components.b41 G3 = ywVar2.D0.r0.G(i7);
                Object obj3 = G3 != null ? G3.G : null;
                if (!(obj3 instanceof TLRPC.User)) {
                    if (obj3 instanceof org.telegram.messenger.gj) {
                        org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) obj3;
                        Bundle bundle3 = new Bundle();
                        if (org.telegram.messenger.gj.B0(gjVar2.k) >= 0) {
                            bundle3.putLong("user_id", org.telegram.messenger.gj.B0(gjVar2.k));
                        } else {
                            bundle3.putLong("chat_id", -org.telegram.messenger.gj.B0(gjVar2.k));
                        }
                        bundle3.putInt("message_id", gjVar2.e1());
                        an anVar3 = new an(bundle3);
                        yw.p4(anVar3, gjVar2);
                        ywVar2.presentFragment(anVar3);
                        break;
                    }
                } else {
                    ywVar2.presentFragment(ProfileActivity.C4(((TLRPC.User) obj3).id));
                    break;
                }
                break;
            default:
                yw ywVar3 = this.b;
                Object I = ywVar3.D0.e0.I(i7);
                if (!(I instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof org.telegram.ui.Cells.f6) {
                        org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
                        if (f6Var.o0) {
                            ywVar3.Z4(f6Var.getDialogId(), view);
                            break;
                        }
                    }
                    if (ywVar3.T0 != 10) {
                        ywVar3.z4(view, i7, ywVar3.D0.e0);
                        break;
                    } else {
                        hw hwVar = ywVar3.D0;
                        di.c1 c1Var = hwVar.b0;
                        ywVar3.A4(view, i7, f10, hwVar.e0);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) I;
                    ywVar3.presentFragment(an.ua(org.telegram.messenger.m5.o(tL_sponsoredPeer.peer)));
                    org.telegram.ui.Components.cm0 cm0Var = ywVar3.D0.e0;
                    cm0Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(cm0Var.t0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    public void g(int i7) {
        kv kvVar = this.b.D1;
        if (kvVar == null) {
            return;
        }
        if (i7 == 0) {
            kvVar.C0(true);
        } else {
            kvVar.Q1(true, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 6:
                yw.h0(this.b);
                break;
            case 7:
                yw ywVar = this.b;
                ywVar.getMessagesController().j2();
                ywVar.n4(false);
                break;
            case 8:
            case 9:
            default:
                yw ywVar2 = this.b;
                Intent intent = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                try {
                    ywVar2.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            case 10:
                yw ywVar3 = this.b;
                Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent2.setPackage("com.miui.securitycenter");
                intent2.putExtra("extra_package_uid", Process.myUid());
                intent2.putExtra("extra_pkgname", org.telegram.messenger.t0.b.getPackageName());
                try {
                    try {
                        ywVar3.getParentActivity().startActivity(intent2);
                        break;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        return;
                    }
                } catch (Exception unused) {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    ywVar3.getParentActivity().startActivity(intent3);
                    return;
                }
        }
    }

    @Override // org.telegram.ui.Components.vi0
    public void i() {
        yw ywVar = this.b;
        ywVar.R = true;
        ywVar.fragmentView.invalidate();
    }

    public void j(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.b.j5(z10, arrayList, arrayList2, z11, true);
    }

    @Override // ri.m
    public void l(int i7) {
        yw.C0(this.b, i7);
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
        int i7 = this.a;
    }

    private final /* synthetic */ void a(View view, float f10, float f11) {
    }

    private final /* synthetic */ void c(View view, float f10, float f11) {
    }

    private final /* synthetic */ void d(View view, float f10, float f11) {
    }
}
