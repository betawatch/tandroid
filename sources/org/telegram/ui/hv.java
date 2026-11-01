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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hv implements org.telegram.ui.Components.sp0, org.telegram.ui.Components.ik0, org.telegram.ui.Components.jk0, p00, org.telegram.ui.ActionBar.u1, ei.n, r0.m, ei.o, org.telegram.ui.Components.vj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zx b;

    public /* synthetic */ hv(zx zxVar, int i10) {
        this.a = i10;
        this.b = zxVar;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        zx zxVar = this.b;
        zxVar.w.j(j1Var);
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        zxVar.e4 = I0.b;
        zxVar.f4 = I0.d;
        int i10 = j1Var.a.f(8).d;
        if (zxVar.g4 != i10) {
            zxVar.g4 = i10;
            zxVar.fragmentView.requestLayout();
        }
        zxVar.F0.setPadding(0, zxVar.e4, 0, 0);
        zxVar.k5();
        for (UndoView undoView : zxVar.y0) {
            if (undoView != null) {
                int i11 = zxVar.f4 + zxVar.h4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        ww wwVar = zxVar.F3;
        if (wwVar != null) {
            r0.h0.b(wwVar, j1Var);
        }
        return r0.j1.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100 A[SYNTHETIC] */
    @Override // org.telegram.ui.Components.ik0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(float f7, float f10, int i10, View view) {
        TLRPC.Chat chat;
        switch (this.a) {
            case 1:
                zx zxVar = this.b;
                org.telegram.ui.Components.b51 G = zxVar.C0.l0.G(i10);
                Object obj = G != null ? G.G : null;
                if (!(obj instanceof TLRPC.Chat)) {
                    if (obj instanceof org.telegram.messenger.kj) {
                        org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) obj;
                        Bundle bundle = new Bundle();
                        if (org.telegram.messenger.kj.B0(kjVar.k) >= 0) {
                            bundle.putLong("user_id", org.telegram.messenger.kj.B0(kjVar.k));
                        } else {
                            bundle.putLong("chat_id", -org.telegram.messenger.kj.B0(kjVar.k));
                        }
                        bundle.putInt("message_id", kjVar.f1());
                        un unVar = new un(bundle);
                        zx.p4(unVar, kjVar);
                        zxVar.presentFragment(unVar);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    un unVar2 = new un(bundle2);
                    org.telegram.ui.Components.cn0 cn0Var = zxVar.C0.l0;
                    cn0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i10++;
                        if (i10 >= cn0Var.D.size()) {
                            unVar2.Bb = arrayList;
                            zxVar.presentFragment(unVar2);
                            break;
                        } else {
                            org.telegram.ui.Components.b51 G2 = cn0Var.G(i10);
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
                zx zxVar2 = this.b;
                org.telegram.ui.Components.b51 G3 = zxVar2.C0.q0.G(i10);
                Object obj3 = G3 != null ? G3.G : null;
                if (!(obj3 instanceof TLRPC.User)) {
                    if (obj3 instanceof org.telegram.messenger.kj) {
                        org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) obj3;
                        Bundle bundle3 = new Bundle();
                        if (org.telegram.messenger.kj.B0(kjVar2.k) >= 0) {
                            bundle3.putLong("user_id", org.telegram.messenger.kj.B0(kjVar2.k));
                        } else {
                            bundle3.putLong("chat_id", -org.telegram.messenger.kj.B0(kjVar2.k));
                        }
                        bundle3.putInt("message_id", kjVar2.f1());
                        un unVar3 = new un(bundle3);
                        zx.p4(unVar3, kjVar2);
                        zxVar2.presentFragment(unVar3);
                        break;
                    }
                } else {
                    zxVar2.presentFragment(ProfileActivity.A4(((TLRPC.User) obj3).id));
                    break;
                }
                break;
            default:
                zx zxVar3 = this.b;
                Object I = zxVar3.C0.d0.I(i10);
                if (!(I instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof org.telegram.ui.Cells.k6) {
                        org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
                        if (k6Var.n0) {
                            zxVar3.Z4(k6Var.getDialogId(), view);
                            break;
                        }
                    }
                    if (zxVar3.R0 != 10) {
                        zxVar3.z4(view, i10, zxVar3.C0.d0);
                        break;
                    } else {
                        jx jxVar = zxVar3.C0;
                        ag.b1 b1Var = jxVar.a0;
                        zxVar3.A4(view, i10, f7, jxVar.d0);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) I;
                    zxVar3.presentFragment(un.ma(org.telegram.messenger.o5.o(tL_sponsoredPeer.peer)));
                    org.telegram.ui.Components.an0 an0Var = zxVar3.C0.d0;
                    an0Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(an0Var.s0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    @Override // ei.o
    public int c() {
        zx zxVar = this.b;
        zxVar.getClass();
        return zxVar.getThemedColor(org.telegram.ui.ActionBar.t6.d6);
    }

    @Override // org.telegram.ui.Components.jk0
    public boolean f(int i10, View view) {
        zx.q0(this.b, i10);
        return false;
    }

    @Override // org.telegram.ui.Components.vj0
    public void g() {
        zx zxVar = this.b;
        zxVar.Q = true;
        zxVar.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 6:
                zx.h0(this.b);
                break;
            case 7:
                zx zxVar = this.b;
                zxVar.getMessagesController().i2();
                zxVar.n4(false);
                break;
            case 8:
            case 9:
            default:
                zx zxVar2 = this.b;
                Intent intent = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.b.getPackageName()));
                try {
                    zxVar2.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            case 10:
                zx zxVar3 = this.b;
                Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent2.setPackage("com.miui.securitycenter");
                intent2.putExtra("extra_package_uid", Process.myUid());
                intent2.putExtra("extra_pkgname", org.telegram.messenger.w0.b.getPackageName());
                try {
                    try {
                        zxVar3.getParentActivity().startActivity(intent2);
                        break;
                    } catch (Exception e7) {
                        org.telegram.messenger.f8.g(e7, true);
                        return;
                    }
                } catch (Exception unused) {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.w0.b.getPackageName()));
                    zxVar3.getParentActivity().startActivity(intent3);
                    return;
                }
        }
    }

    @Override // org.telegram.ui.Components.ik0
    public /* synthetic */ boolean h1(View view) {
        switch (this.a) {
        }
        return false;
    }

    public void i(int i10) {
        nw nwVar = this.b.B1;
        if (nwVar == null) {
            return;
        }
        if (i10 == 0) {
            nwVar.m0(true);
        } else {
            nwVar.v1(true, false);
        }
    }

    @Override // ei.n
    public void j(int i10) {
        zx.C0(this.b, i10);
    }

    public void k(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.b.j5(z10, arrayList, arrayList2, z11, true);
    }

    @Override // org.telegram.ui.Components.ik0
    public /* synthetic */ void q0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    private final /* synthetic */ void a(View view, float f7, float f10) {
    }

    private final /* synthetic */ void d(View view, float f7, float f10) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }
}
