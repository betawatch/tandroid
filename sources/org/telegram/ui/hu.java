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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class hu implements org.telegram.ui.Components.po0, org.telegram.ui.Components.dj0, org.telegram.ui.Components.ej0, rz, org.telegram.ui.ActionBar.r1, oi.m, r0.m, oi.n, org.telegram.ui.Components.ri0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yw b;

    public /* synthetic */ hu(yw ywVar, int i7) {
        this.a = i7;
        this.b = ywVar;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        yw ywVar = this.b;
        ywVar.w.j(k1Var);
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        ywVar.f4 = I0.b;
        ywVar.g4 = I0.d;
        int i7 = k1Var.a.f(8).d;
        if (ywVar.h4 != i7) {
            ywVar.h4 = i7;
            ywVar.fragmentView.requestLayout();
        }
        ywVar.F0.setPadding(0, ywVar.f4, 0, 0);
        ywVar.k5();
        for (UndoView undoView : ywVar.y0) {
            if (undoView != null) {
                int i10 = ywVar.g4 + ywVar.i4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i10) {
                    marginLayoutParams.bottomMargin = i10;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        uv uvVar = ywVar.G3;
        if (uvVar != null) {
            r0.i0.b(uvVar, k1Var);
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean c(int i7, View view) {
        yw.q0(this.b, i7);
        return false;
    }

    @Override // org.telegram.ui.Components.ri0
    public void e() {
        yw ywVar = this.b;
        ywVar.Q = true;
        ywVar.fragmentView.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100 A[SYNTHETIC] */
    @Override // org.telegram.ui.Components.dj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(float f10, float f11, int i7, View view) {
        TLRPC.Chat chat;
        switch (this.a) {
            case 1:
                yw ywVar = this.b;
                org.telegram.ui.Components.y31 G = ywVar.C0.l0.G(i7);
                Object obj = G != null ? G.G : null;
                if (!(obj instanceof TLRPC.Chat)) {
                    if (obj instanceof org.telegram.messenger.ij) {
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                        Bundle bundle = new Bundle();
                        if (org.telegram.messenger.ij.B0(ijVar.k) >= 0) {
                            bundle.putLong("user_id", org.telegram.messenger.ij.B0(ijVar.k));
                        } else {
                            bundle.putLong("chat_id", -org.telegram.messenger.ij.B0(ijVar.k));
                        }
                        bundle.putInt("message_id", ijVar.e1());
                        cn cnVar = new cn(bundle);
                        yw.p4(cnVar, ijVar);
                        ywVar.presentFragment(cnVar);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    cn cnVar2 = new cn(bundle2);
                    org.telegram.ui.Components.bm0 bm0Var = ywVar.C0.l0;
                    bm0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i7++;
                        if (i7 >= bm0Var.D.size()) {
                            cnVar2.Db = arrayList;
                            ywVar.presentFragment(cnVar2);
                            break;
                        } else {
                            org.telegram.ui.Components.y31 G2 = bm0Var.G(i7);
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
                org.telegram.ui.Components.y31 G3 = ywVar2.C0.q0.G(i7);
                Object obj3 = G3 != null ? G3.G : null;
                if (!(obj3 instanceof TLRPC.User)) {
                    if (obj3 instanceof org.telegram.messenger.ij) {
                        org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) obj3;
                        Bundle bundle3 = new Bundle();
                        if (org.telegram.messenger.ij.B0(ijVar2.k) >= 0) {
                            bundle3.putLong("user_id", org.telegram.messenger.ij.B0(ijVar2.k));
                        } else {
                            bundle3.putLong("chat_id", -org.telegram.messenger.ij.B0(ijVar2.k));
                        }
                        bundle3.putInt("message_id", ijVar2.e1());
                        cn cnVar3 = new cn(bundle3);
                        yw.p4(cnVar3, ijVar2);
                        ywVar2.presentFragment(cnVar3);
                        break;
                    }
                } else {
                    ywVar2.presentFragment(ProfileActivity.D4(((TLRPC.User) obj3).id));
                    break;
                }
                break;
            default:
                yw ywVar3 = this.b;
                Object I = ywVar3.C0.d0.I(i7);
                if (!(I instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof org.telegram.ui.Cells.g6) {
                        org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
                        if (g6Var.n0) {
                            ywVar3.Z4(g6Var.getDialogId(), view);
                            break;
                        }
                    }
                    if (ywVar3.S0 != 10) {
                        ywVar3.z4(view, i7, ywVar3.C0.d0);
                        break;
                    } else {
                        hw hwVar = ywVar3.C0;
                        bi.q1 q1Var = hwVar.a0;
                        ywVar3.A4(view, i7, f10, hwVar.d0);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) I;
                    ywVar3.presentFragment(cn.ta(org.telegram.messenger.m5.o(tL_sponsoredPeer.peer)));
                    org.telegram.ui.Components.zl0 zl0Var = ywVar3.C0.d0;
                    zl0Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(zl0Var.s0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.Components.dj0
    public /* synthetic */ boolean f1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
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

    @Override // oi.n
    public int h() {
        yw ywVar = this.b;
        ywVar.getClass();
        return ywVar.getThemedColor(org.telegram.ui.ActionBar.l6.d6);
    }

    public void i(int i7) {
        lv lvVar = this.b.C1;
        if (lvVar == null) {
            return;
        }
        if (i7 == 0) {
            lvVar.o0(true);
        } else {
            lvVar.y1(true, false);
        }
    }

    public void j(boolean z9, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        this.b.j5(z9, arrayList, arrayList2, z10, true);
    }

    @Override // oi.m
    public void l(int i7) {
        yw.C0(this.b, i7);
    }

    @Override // org.telegram.ui.Components.dj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
        int i7 = this.a;
    }

    private final /* synthetic */ void a(View view, float f10, float f11) {
    }

    private final /* synthetic */ void b(View view, float f10, float f11) {
    }

    private final /* synthetic */ void d(View view, float f10, float f11) {
    }
}
