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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ju implements org.telegram.ui.Components.dp0, org.telegram.ui.Components.rj0, org.telegram.ui.Components.sj0, tz, org.telegram.ui.ActionBar.q1, ri.m, r0.m, ri.n, org.telegram.ui.Components.gj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cx b;

    public /* synthetic */ ju(cx cxVar, int i7) {
        this.a = i7;
        this.b = cxVar;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        cx cxVar = this.b;
        cxVar.w.j(l1Var);
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        cxVar.j4 = I0.b;
        cxVar.k4 = I0.d;
        int i7 = l1Var.a.f(8).d;
        if (cxVar.l4 != i7) {
            cxVar.l4 = i7;
            cxVar.fragmentView.requestLayout();
        }
        cxVar.G0.setPadding(0, cxVar.j4, 0, 0);
        cxVar.s5();
        for (UndoView undoView : cxVar.z0) {
            if (undoView != null) {
                int i10 = cxVar.k4 + cxVar.m4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i10) {
                    marginLayoutParams.bottomMargin = i10;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        xv xvVar = cxVar.H3;
        if (xvVar != null) {
            r0.i0.b(xvVar, l1Var);
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean b1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean c(int i7, View view) {
        cx.n0(this.b, i7);
        return false;
    }

    @Override // ri.n
    public int e() {
        cx cxVar = this.b;
        cxVar.getClass();
        return cxVar.getThemedColor(org.telegram.ui.ActionBar.m6.d6);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100 A[SYNTHETIC] */
    @Override // org.telegram.ui.Components.rj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(float f10, float f11, int i7, View view) {
        TLRPC.Chat chat;
        switch (this.a) {
            case 1:
                cx cxVar = this.b;
                org.telegram.ui.Components.o41 G = cxVar.D0.m0.G(i7);
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
                        cx.r4(bnVar, fjVar);
                        cxVar.presentFragment(bnVar);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    bn bnVar2 = new bn(bundle2);
                    org.telegram.ui.Components.pm0 pm0Var = cxVar.D0.m0;
                    pm0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i7++;
                        if (i7 >= pm0Var.E.size()) {
                            bnVar2.Fb = arrayList;
                            cxVar.presentFragment(bnVar2);
                            break;
                        } else {
                            org.telegram.ui.Components.o41 G2 = pm0Var.G(i7);
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
                cx cxVar2 = this.b;
                org.telegram.ui.Components.o41 G3 = cxVar2.D0.r0.G(i7);
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
                        cx.r4(bnVar3, fjVar2);
                        cxVar2.presentFragment(bnVar3);
                        break;
                    }
                } else {
                    cxVar2.presentFragment(ProfileActivity.D4(((TLRPC.User) obj3).id));
                    break;
                }
                break;
            default:
                cx cxVar3 = this.b;
                Object I = cxVar3.D0.e0.I(i7);
                if (!(I instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof org.telegram.ui.Cells.h6) {
                        org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                        if (h6Var.o0) {
                            cxVar3.h5(h6Var.getDialogId(), view);
                            break;
                        }
                    }
                    if (cxVar3.T0 != 10) {
                        cxVar3.E4(view, i7, cxVar3.D0.e0);
                        break;
                    } else {
                        kw kwVar = cxVar3.D0;
                        di.b1 b1Var = kwVar.b0;
                        cxVar3.F4(view, i7, f10, kwVar.e0);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) I;
                    cxVar3.presentFragment(bn.ua(org.telegram.messenger.n5.o(tL_sponsoredPeer.peer)));
                    org.telegram.ui.Components.nm0 nm0Var = cxVar3.D0.e0;
                    nm0Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(nm0Var.t0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    public void g(int i7) {
        nv nvVar = this.b.D1;
        if (nvVar == null) {
            return;
        }
        if (i7 == 0) {
            nvVar.O0(true);
        } else {
            nvVar.c2(true, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 6:
                cx.E0(this.b);
                break;
            case 7:
                cx cxVar = this.b;
                cxVar.getMessagesController().l2();
                cxVar.p4(false);
                break;
            case 8:
            case 9:
            default:
                cx cxVar2 = this.b;
                Intent intent = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                try {
                    cxVar2.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            case 10:
                cx cxVar3 = this.b;
                Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent2.setPackage("com.miui.securitycenter");
                intent2.putExtra("extra_package_uid", Process.myUid());
                intent2.putExtra("extra_pkgname", org.telegram.messenger.t0.b.getPackageName());
                try {
                    try {
                        cxVar3.getParentActivity().startActivity(intent2);
                        break;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        return;
                    }
                } catch (Exception unused) {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    cxVar3.getParentActivity().startActivity(intent3);
                    return;
                }
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public void i() {
        cx cxVar = this.b;
        cxVar.R = true;
        cxVar.fragmentView.invalidate();
    }

    public void j(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.b.r5(z10, arrayList, arrayList2, z11, true);
    }

    @Override // ri.m
    public void l(int i7) {
        cx.D0(this.b, i7);
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
        int i7 = this.a;
    }

    private final /* synthetic */ void a(View view, float f10, float f11) {
    }

    private final /* synthetic */ void b(View view, float f10, float f11) {
    }

    private final /* synthetic */ void d(View view, float f10, float f11) {
    }
}
