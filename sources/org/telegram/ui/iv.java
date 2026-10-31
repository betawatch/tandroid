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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class iv implements org.telegram.ui.Components.rp0, org.telegram.ui.Components.hk0, org.telegram.ui.Components.ik0, q00, org.telegram.ui.ActionBar.u1, ei.n, r0.m, ei.o, org.telegram.ui.Components.uj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ay b;

    public /* synthetic */ iv(ay ayVar, int i10) {
        this.a = i10;
        this.b = ayVar;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        ay ayVar = this.b;
        ayVar.w.j(j1Var);
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        ayVar.e4 = I0.b;
        ayVar.f4 = I0.d;
        int i10 = j1Var.a.f(8).d;
        if (ayVar.g4 != i10) {
            ayVar.g4 = i10;
            ayVar.fragmentView.requestLayout();
        }
        ayVar.F0.setPadding(0, ayVar.e4, 0, 0);
        ayVar.j5();
        for (UndoView undoView : ayVar.y0) {
            if (undoView != null) {
                int i11 = ayVar.f4 + ayVar.h4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        xw xwVar = ayVar.F3;
        if (xwVar != null) {
            r0.h0.b(xwVar, j1Var);
        }
        return r0.j1.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100 A[SYNTHETIC] */
    @Override // org.telegram.ui.Components.hk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(float f7, float f10, int i10, View view) {
        TLRPC.Chat chat;
        switch (this.a) {
            case 1:
                ay ayVar = this.b;
                org.telegram.ui.Components.a51 G = ayVar.C0.l0.G(i10);
                Object obj = G != null ? G.G : null;
                if (!(obj instanceof TLRPC.Chat)) {
                    if (obj instanceof org.telegram.messenger.jj) {
                        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
                        Bundle bundle = new Bundle();
                        if (org.telegram.messenger.jj.B0(jjVar.k) >= 0) {
                            bundle.putLong("user_id", org.telegram.messenger.jj.B0(jjVar.k));
                        } else {
                            bundle.putLong("chat_id", -org.telegram.messenger.jj.B0(jjVar.k));
                        }
                        bundle.putInt("message_id", jjVar.f1());
                        un unVar = new un(bundle);
                        ay.o4(unVar, jjVar);
                        ayVar.presentFragment(unVar);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    un unVar2 = new un(bundle2);
                    org.telegram.ui.Components.bn0 bn0Var = ayVar.C0.l0;
                    bn0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i10++;
                        if (i10 >= bn0Var.D.size()) {
                            unVar2.Ab = arrayList;
                            ayVar.presentFragment(unVar2);
                            break;
                        } else {
                            org.telegram.ui.Components.a51 G2 = bn0Var.G(i10);
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
                ay ayVar2 = this.b;
                org.telegram.ui.Components.a51 G3 = ayVar2.C0.q0.G(i10);
                Object obj3 = G3 != null ? G3.G : null;
                if (!(obj3 instanceof TLRPC.User)) {
                    if (obj3 instanceof org.telegram.messenger.jj) {
                        org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) obj3;
                        Bundle bundle3 = new Bundle();
                        if (org.telegram.messenger.jj.B0(jjVar2.k) >= 0) {
                            bundle3.putLong("user_id", org.telegram.messenger.jj.B0(jjVar2.k));
                        } else {
                            bundle3.putLong("chat_id", -org.telegram.messenger.jj.B0(jjVar2.k));
                        }
                        bundle3.putInt("message_id", jjVar2.f1());
                        un unVar3 = new un(bundle3);
                        ay.o4(unVar3, jjVar2);
                        ayVar2.presentFragment(unVar3);
                        break;
                    }
                } else {
                    ayVar2.presentFragment(ProfileActivity.z4(((TLRPC.User) obj3).id));
                    break;
                }
                break;
            default:
                ay ayVar3 = this.b;
                Object I = ayVar3.C0.d0.I(i10);
                if (!(I instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof org.telegram.ui.Cells.k6) {
                        org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
                        if (k6Var.n0) {
                            ayVar3.Y4(k6Var.getDialogId(), view);
                            break;
                        }
                    }
                    if (ayVar3.R0 != 10) {
                        ayVar3.y4(view, i10, ayVar3.C0.d0);
                        break;
                    } else {
                        kx kxVar = ayVar3.C0;
                        ag.b1 b1Var = kxVar.a0;
                        ayVar3.z4(view, i10, f7, kxVar.d0);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) I;
                    ayVar3.presentFragment(un.ha(org.telegram.messenger.o5.o(tL_sponsoredPeer.peer)));
                    org.telegram.ui.Components.zm0 zm0Var = ayVar3.C0.d0;
                    zm0Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(zm0Var.s0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    @Override // ei.o
    public int c() {
        ay ayVar = this.b;
        ayVar.getClass();
        return ayVar.getThemedColor(org.telegram.ui.ActionBar.t6.d6);
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        ay.p0(this.b, i10);
        return false;
    }

    @Override // org.telegram.ui.Components.uj0
    public void g() {
        ay ayVar = this.b;
        ayVar.Q = true;
        ayVar.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 6:
                ay.g0(this.b);
                break;
            case 7:
                ay ayVar = this.b;
                ayVar.getMessagesController().i2();
                ayVar.m4(false);
                break;
            case 8:
            case 9:
            default:
                ay ayVar2 = this.b;
                Intent intent = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.b.getPackageName()));
                try {
                    ayVar2.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            case 10:
                ay ayVar3 = this.b;
                Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent2.setPackage("com.miui.securitycenter");
                intent2.putExtra("extra_package_uid", Process.myUid());
                intent2.putExtra("extra_pkgname", org.telegram.messenger.w0.b.getPackageName());
                try {
                    try {
                        ayVar3.getParentActivity().startActivity(intent2);
                        break;
                    } catch (Exception e7) {
                        org.telegram.messenger.f8.g(e7, true);
                        return;
                    }
                } catch (Exception unused) {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.w0.b.getPackageName()));
                    ayVar3.getParentActivity().startActivity(intent3);
                    return;
                }
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ boolean h1(View view) {
        switch (this.a) {
        }
        return false;
    }

    public void i(int i10) {
        ow owVar = this.b.B1;
        if (owVar == null) {
            return;
        }
        if (i10 == 0) {
            owVar.m0(true);
        } else {
            owVar.v1(true, false);
        }
    }

    @Override // ei.n
    public void j(int i10) {
        ay.B0(this.b, i10);
    }

    public void k(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.b.i5(z10, arrayList, arrayList2, z11, true);
    }

    @Override // org.telegram.ui.Components.hk0
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
