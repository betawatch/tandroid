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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iu implements org.telegram.ui.Components.oo0, org.telegram.ui.Components.cj0, org.telegram.ui.Components.dj0, sz, org.telegram.ui.ActionBar.r1, oi.m, r0.m, oi.n, org.telegram.ui.Components.qi0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zw b;

    public /* synthetic */ iu(zw zwVar, int i7) {
        this.a = i7;
        this.b = zwVar;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        zw zwVar = this.b;
        zwVar.w.j(k1Var);
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        zwVar.f4 = I0.b;
        zwVar.g4 = I0.d;
        int i7 = k1Var.a.f(8).d;
        if (zwVar.h4 != i7) {
            zwVar.h4 = i7;
            zwVar.fragmentView.requestLayout();
        }
        zwVar.F0.setPadding(0, zwVar.f4, 0, 0);
        zwVar.k5();
        for (UndoView undoView : zwVar.y0) {
            if (undoView != null) {
                int i10 = zwVar.g4 + zwVar.i4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i10) {
                    marginLayoutParams.bottomMargin = i10;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        vv vvVar = zwVar.G3;
        if (vvVar != null) {
            r0.i0.b(vvVar, k1Var);
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        zw.q0(this.b, i7);
        return false;
    }

    @Override // org.telegram.ui.Components.qi0
    public void e() {
        zw zwVar = this.b;
        zwVar.Q = true;
        zwVar.fragmentView.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100 A[SYNTHETIC] */
    @Override // org.telegram.ui.Components.cj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(float f10, float f11, int i7, View view) {
        TLRPC.Chat chat;
        switch (this.a) {
            case 1:
                zw zwVar = this.b;
                org.telegram.ui.Components.x31 G = zwVar.C0.l0.G(i7);
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
                        zw.p4(cnVar, ijVar);
                        zwVar.presentFragment(cnVar);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    cn cnVar2 = new cn(bundle2);
                    org.telegram.ui.Components.am0 am0Var = zwVar.C0.l0;
                    am0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i7++;
                        if (i7 >= am0Var.D.size()) {
                            cnVar2.Db = arrayList;
                            zwVar.presentFragment(cnVar2);
                            break;
                        } else {
                            org.telegram.ui.Components.x31 G2 = am0Var.G(i7);
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
                zw zwVar2 = this.b;
                org.telegram.ui.Components.x31 G3 = zwVar2.C0.q0.G(i7);
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
                        zw.p4(cnVar3, ijVar2);
                        zwVar2.presentFragment(cnVar3);
                        break;
                    }
                } else {
                    zwVar2.presentFragment(ProfileActivity.D4(((TLRPC.User) obj3).id));
                    break;
                }
                break;
            default:
                zw zwVar3 = this.b;
                Object I = zwVar3.C0.d0.I(i7);
                if (!(I instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof org.telegram.ui.Cells.g6) {
                        org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
                        if (g6Var.n0) {
                            zwVar3.Z4(g6Var.getDialogId(), view);
                            break;
                        }
                    }
                    if (zwVar3.S0 != 10) {
                        zwVar3.z4(view, i7, zwVar3.C0.d0);
                        break;
                    } else {
                        iw iwVar = zwVar3.C0;
                        bi.q1 q1Var = iwVar.a0;
                        zwVar3.A4(view, i7, f10, iwVar.d0);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) I;
                    zwVar3.presentFragment(cn.ta(org.telegram.messenger.m5.o(tL_sponsoredPeer.peer)));
                    org.telegram.ui.Components.yl0 yl0Var = zwVar3.C0.d0;
                    yl0Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(yl0Var.s0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 6:
                zw.h0(this.b);
                break;
            case 7:
                zw zwVar = this.b;
                zwVar.getMessagesController().j2();
                zwVar.n4(false);
                break;
            case 8:
            case 9:
            default:
                zw zwVar2 = this.b;
                Intent intent = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                try {
                    zwVar2.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            case 10:
                zw zwVar3 = this.b;
                Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent2.setPackage("com.miui.securitycenter");
                intent2.putExtra("extra_package_uid", Process.myUid());
                intent2.putExtra("extra_pkgname", org.telegram.messenger.t0.b.getPackageName());
                try {
                    try {
                        zwVar3.getParentActivity().startActivity(intent2);
                        break;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        return;
                    }
                } catch (Exception unused) {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    zwVar3.getParentActivity().startActivity(intent3);
                    return;
                }
        }
    }

    @Override // oi.n
    public int h() {
        zw zwVar = this.b;
        zwVar.getClass();
        return zwVar.getThemedColor(org.telegram.ui.ActionBar.m6.d6);
    }

    public void i(int i7) {
        mv mvVar = this.b.C1;
        if (mvVar == null) {
            return;
        }
        if (i7 == 0) {
            mvVar.o0(true);
        } else {
            mvVar.y1(true, false);
        }
    }

    public void j(boolean z9, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        this.b.j5(z9, arrayList, arrayList2, z10, true);
    }

    @Override // oi.m
    public void l(int i7) {
        zw.C0(this.b, i7);
    }

    @Override // org.telegram.ui.Components.cj0
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
