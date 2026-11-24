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
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ag3 implements aba, d39, e39, qe4, ed, mw4, no7, nw4, s29 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cj3 b;

    public /* synthetic */ ag3(cj3 cj3Var, byte b) {
        this.a = b;
        this.b = cj3Var;
    }

    @Override // no7
    public final vxc W(View view, vxc vxcVar) {
        cj3 cj3Var = this.b;
        cj3Var.w.j(vxcVar);
        io5 H0 = gl.H0(vxcVar, false);
        cj3Var.j4 = H0.b;
        cj3Var.k4 = H0.d;
        int i = vxcVar.a.f(8).d;
        if (cj3Var.l4 != i) {
            cj3Var.l4 = i;
            cj3Var.fragmentView.requestLayout();
        }
        cj3Var.G0.setPadding(0, cj3Var.j4, 0, 0);
        cj3Var.q5();
        for (UndoView undoView : cj3Var.z0) {
            if (undoView != null) {
                int i2 = cj3Var.k4 + cj3Var.m4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i2) {
                    marginLayoutParams.bottomMargin = i2;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        rh3 rh3Var = cj3Var.H3;
        if (rh3Var != null) {
            jdc.b(rh3Var, vxcVar);
        }
        return vxc.b;
    }

    @Override // e39
    public final boolean d(int i, View view) {
        this.b.K3(i);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x010f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3 A[SYNTHETIC] */
    @Override // d39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f, float f2, int i, View view) {
        TLRPC.Chat chat;
        byte b = this.a;
        cj3 cj3Var = this.b;
        switch (b) {
            case 1:
                c4c G = cj3Var.D0.m0.G(i);
                Object obj = G != null ? G.H : null;
                if (!(obj instanceof TLRPC.Chat)) {
                    if (obj instanceof k27) {
                        k27 k27Var = (k27) obj;
                        Bundle bundle = new Bundle();
                        long B0 = k27.B0(k27Var.k);
                        TLRPC.Message message = k27Var.k;
                        if (B0 >= 0) {
                            bundle.putLong("user_id", k27.B0(message));
                        } else {
                            bundle.putLong("chat_id", -k27.B0(message));
                        }
                        bundle.putInt("message_id", k27Var.e1());
                        mu1 mu1Var = new mu1(bundle);
                        cj3.A3(mu1Var, k27Var);
                        cj3Var.presentFragment(mu1Var);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    mu1 mu1Var2 = new mu1(bundle2);
                    ot9 ot9Var = cj3Var.D0.m0;
                    ot9Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i++;
                        if (i >= ot9Var.E.size()) {
                            mu1Var2.Fb = arrayList;
                            cj3Var.presentFragment(mu1Var2);
                            break;
                        } else {
                            c4c G2 = ot9Var.G(i);
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
                c4c G3 = cj3Var.D0.r0.G(i);
                Object obj3 = G3 != null ? G3.H : null;
                if (!(obj3 instanceof TLRPC.User)) {
                    if (obj3 instanceof k27) {
                        k27 k27Var2 = (k27) obj3;
                        Bundle bundle3 = new Bundle();
                        long B02 = k27.B0(k27Var2.k);
                        TLRPC.Message message2 = k27Var2.k;
                        if (B02 >= 0) {
                            bundle3.putLong("user_id", k27.B0(message2));
                        } else {
                            bundle3.putLong("chat_id", -k27.B0(message2));
                        }
                        bundle3.putInt("message_id", k27Var2.e1());
                        mu1 mu1Var3 = new mu1(bundle3);
                        cj3.A3(mu1Var3, k27Var2);
                        cj3Var.presentFragment(mu1Var3);
                        break;
                    }
                } else {
                    cj3Var.presentFragment(ProfileActivity.P2(((TLRPC.User) obj3).id));
                    break;
                }
                break;
            default:
                Object I = cj3Var.D0.e0.I(i);
                if (!(I instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof rr8) {
                        rr8 rr8Var = (rr8) view;
                        if (rr8Var.o0) {
                            cj3Var.e5(rr8Var.getDialogId(), view);
                            break;
                        }
                    }
                    int i2 = cj3Var.T0;
                    hi3 hi3Var = cj3Var.D0;
                    if (i2 != 10) {
                        cj3Var.y4(view, i, hi3Var.e0);
                        break;
                    } else {
                        ns9 ns9Var = hi3Var.b0;
                        cj3Var.z4(view, i, f, hi3Var.e0);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) I;
                    cj3Var.presentFragment(mu1.U9(cf3.n(tL_sponsoredPeer.peer)));
                    mt9 mt9Var = cj3Var.D0.e0;
                    mt9Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(mt9Var.t0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    @Override // s29
    public final void f() {
        cj3 cj3Var = this.b;
        cj3Var.R = true;
        cj3Var.fragmentView.invalidate();
    }

    public final void g(int i) {
        hh3 hh3Var = this.b.D1;
        if (hh3Var == null) {
            return;
        }
        if (i == 0) {
            hh3Var.N0(true);
        } else {
            hh3Var.b2(true, false);
        }
    }

    public final void h(boolean z, ArrayList arrayList, ArrayList arrayList2, boolean z2) {
        this.b.p5(z, arrayList, arrayList2, z2, true);
    }

    @Override // nw4
    public final int i() {
        return this.b.getThemedColor(bkb.c6);
    }

    @Override // mw4
    public final void j(int i) {
        this.b.B3(i);
    }

    @Override // d39
    public final void l(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override // d39
    public final boolean q(View view) {
        byte b = this.a;
        return false;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        cj3 cj3Var = this.b;
        switch (b) {
            case 6:
                cj3Var.d4();
                break;
            case 7:
                cj3Var.getMessagesController().e2();
                cj3Var.y3(false);
                break;
            case 8:
            case 9:
            default:
                Intent intent = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                try {
                    cj3Var.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            case 10:
                Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent2.setPackage("com.miui.securitycenter");
                intent2.putExtra("extra_package_uid", Process.myUid());
                intent2.putExtra("extra_pkgname", a.b.getPackageName());
                try {
                    try {
                        cj3Var.getParentActivity().startActivity(intent2);
                        break;
                    } catch (Exception unused) {
                        Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent3.setData(Uri.parse("package:" + a.b.getPackageName()));
                        cj3Var.getParentActivity().startActivity(intent3);
                        return;
                    }
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
        }
    }

    private final void a(View view, float f, float f2) {
    }

    private final void b(View view, float f, float f2) {
    }

    private final void c(View view, float f, float f2) {
    }
}
