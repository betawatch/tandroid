// default package

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nh3 implements ada, g59, h59, sg4, ee, oy4, qq7, py4, v49 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nk3 b;

    public /* synthetic */ nh3(nk3 nk3Var, byte b) {
        this.a = b;
        this.b = nk3Var;
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        nk3 nk3Var = this.b;
        nk3Var.w.j(wzcVar);
        iq5 H0 = gm.H0(wzcVar, false);
        nk3Var.l4 = H0.b;
        nk3Var.m4 = H0.d;
        int i = wzcVar.a.f(8).d;
        if (nk3Var.n4 != i) {
            nk3Var.n4 = i;
            nk3Var.fragmentView.requestLayout();
        }
        nk3Var.G0.setPadding(0, nk3Var.l4, 0, 0);
        nk3Var.u5();
        for (UndoView undoView : nk3Var.z0) {
            if (undoView != null) {
                int i2 = nk3Var.m4 + nk3Var.o4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i2) {
                    marginLayoutParams.bottomMargin = i2;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        dj3 dj3Var = nk3Var.H3;
        if (dj3Var != null) {
            kfc.b(dj3Var, wzcVar);
        }
        return wzc.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b A[SYNTHETIC] */
    @Override // g59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(float f, float f2, int i, View view) {
        TLRPC.Chat chat;
        byte b = this.a;
        nk3 nk3Var = this.b;
        switch (b) {
            case 1:
                c6c G = nk3Var.D0.m0.G(i);
                Object obj = G != null ? G.H : null;
                if (!(obj instanceof TLRPC.Chat)) {
                    if (obj instanceof k47) {
                        k47 k47Var = (k47) obj;
                        Bundle bundle = new Bundle();
                        long B0 = k47.B0(k47Var.k);
                        TLRPC.Message message = k47Var.k;
                        if (B0 >= 0) {
                            bundle.putLong("user_id", k47.B0(message));
                        } else {
                            bundle.putLong("chat_id", -k47.B0(message));
                        }
                        bundle.putInt("message_id", k47Var.e1());
                        yv1 yv1Var = new yv1(bundle);
                        nk3.C3(yv1Var, k47Var);
                        nk3Var.presentFragment(yv1Var);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    yv1 yv1Var2 = new yv1(bundle2);
                    qv9 qv9Var = nk3Var.D0.m0;
                    qv9Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i++;
                        if (i >= qv9Var.E.size()) {
                            yv1Var2.Nb = arrayList;
                            nk3Var.presentFragment(yv1Var2);
                            break;
                        } else {
                            c6c G2 = qv9Var.G(i);
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
                nk3Var.M3(i);
                break;
            default:
                Object I = nk3Var.D0.e0.I(i);
                if (!(I instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof ut8) {
                        ut8 ut8Var = (ut8) view;
                        if (ut8Var.o0) {
                            nk3Var.i5(ut8Var.getDialogId(), view);
                            break;
                        }
                    }
                    int i2 = nk3Var.T0;
                    sj3 sj3Var = nk3Var.D0;
                    if (i2 != 10) {
                        nk3Var.C4(view, i, sj3Var.e0);
                        break;
                    } else {
                        pu9 pu9Var = sj3Var.b0;
                        nk3Var.D4(view, i, f, sj3Var.e0);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) I;
                    nk3Var.presentFragment(yv1.ga(pg3.n(tL_sponsoredPeer.peer)));
                    ov9 ov9Var = nk3Var.D0.e0;
                    ov9Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(ov9Var.t0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    @Override // v49
    public final void e() {
        nk3 nk3Var = this.b;
        nk3Var.R = true;
        nk3Var.fragmentView.invalidate();
    }

    public final void f(int i) {
        ti3 ti3Var = this.b.D1;
        if (ti3Var == null) {
            return;
        }
        if (i == 0) {
            ti3Var.N0(true);
        } else {
            ti3Var.e2(true, false);
        }
    }

    @Override // h59
    public final boolean g(int i, View view) {
        this.b.N3(i);
        return false;
    }

    public final void h(boolean z, ArrayList arrayList, ArrayList arrayList2, boolean z2) {
        this.b.t5(z, arrayList, arrayList2, z2, true);
    }

    @Override // py4
    public final int i() {
        return this.b.getThemedColor(cmb.c6);
    }

    @Override // g59
    public final void p(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        nk3 nk3Var = this.b;
        switch (b) {
            case 6:
                nk3Var.g4();
                break;
            case 7:
                nk3Var.getMessagesController().f2();
                nk3Var.A3(false);
                break;
            case 8:
            case 9:
            default:
                Intent intent = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                try {
                    nk3Var.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            case 10:
                Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent2.setPackage("com.miui.securitycenter");
                intent2.putExtra("extra_package_uid", Process.myUid());
                intent2.putExtra("extra_pkgname", a.b.getPackageName());
                try {
                    try {
                        nk3Var.getParentActivity().startActivity(intent2);
                        break;
                    } catch (Exception unused) {
                        Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent3.setData(Uri.parse("package:" + a.b.getPackageName()));
                        nk3Var.getParentActivity().startActivity(intent3);
                        return;
                    }
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
        }
    }

    @Override // oy4
    public final void s(int i) {
        this.b.D3(i);
    }

    @Override // g59
    public final boolean u(View view) {
        byte b = this.a;
        return false;
    }

    private final void a(View view, float f, float f2) {
    }

    private final void b(View view, float f, float f2) {
    }

    private final void c(View view, float f, float f2) {
    }
}
