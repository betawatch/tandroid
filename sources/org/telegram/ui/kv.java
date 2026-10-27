package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kv implements org.telegram.ui.Components.qr0, org.telegram.ui.Components.bm0, org.telegram.ui.Components.cm0, z00, org.telegram.ui.ActionBar.b2, oi.m, r0.n, oi.n, org.telegram.ui.Components.pl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey b;

    public /* synthetic */ kv(ey eyVar, int i10) {
        this.a = i10;
        this.b = eyVar;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        ey eyVar = this.b;
        eyVar.v.j(k1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        eyVar.f4 = defaultWindowInsets.b;
        eyVar.g4 = defaultWindowInsets.d;
        int i10 = k1Var.a.f(8).d;
        if (eyVar.h4 != i10) {
            eyVar.h4 = i10;
            eyVar.fragmentView.requestLayout();
        }
        eyVar.F0.setPadding(0, eyVar.f4, 0, 0);
        eyVar.g5();
        for (UndoView undoView : eyVar.y0) {
            if (undoView != null) {
                int i11 = eyVar.g4 + eyVar.i4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        vw vwVar = eyVar.G3;
        if (vwVar != null) {
            r0.i0.b(vwVar, k1Var);
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
        ey.m0(this.b, i10);
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.pl0
    public void d() {
        ey eyVar = this.b;
        eyVar.Q = true;
        eyVar.fragmentView.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa A[SYNTHETIC] */
    @Override // org.telegram.ui.Components.bm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(float f7, float f10, int i10, View view) {
        TLRPC.Chat chat;
        switch (this.a) {
            case 1:
                ey eyVar = this.b;
                org.telegram.ui.Components.u61 G = eyVar.C0.l0.G(i10);
                Object obj = G != null ? G.G : null;
                if (!(obj instanceof TLRPC.Chat)) {
                    if (obj instanceof MessageObject) {
                        MessageObject messageObject = (MessageObject) obj;
                        Bundle bundle = new Bundle();
                        if (messageObject.getDialogId() >= 0) {
                            bundle.putLong("user_id", messageObject.getDialogId());
                        } else {
                            bundle.putLong("chat_id", -messageObject.getDialogId());
                        }
                        bundle.putInt("message_id", messageObject.getId());
                        wn wnVar = new wn(bundle);
                        ey.l4(wnVar, messageObject);
                        eyVar.presentFragment(wnVar);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    wn wnVar2 = new wn(bundle2);
                    org.telegram.ui.Components.zo0 zo0Var = eyVar.C0.l0;
                    zo0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i10++;
                        if (i10 >= zo0Var.y.size()) {
                            wnVar2.Fb = arrayList;
                            eyVar.presentFragment(wnVar2);
                            break;
                        } else {
                            org.telegram.ui.Components.u61 G2 = zo0Var.G(i10);
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
                ey eyVar2 = this.b;
                org.telegram.ui.Components.u61 G3 = eyVar2.C0.q0.G(i10);
                Object obj3 = G3 != null ? G3.G : null;
                if (!(obj3 instanceof TLRPC.User)) {
                    if (obj3 instanceof MessageObject) {
                        MessageObject messageObject2 = (MessageObject) obj3;
                        Bundle bundle3 = new Bundle();
                        if (messageObject2.getDialogId() >= 0) {
                            bundle3.putLong("user_id", messageObject2.getDialogId());
                        } else {
                            bundle3.putLong("chat_id", -messageObject2.getDialogId());
                        }
                        bundle3.putInt("message_id", messageObject2.getId());
                        wn wnVar3 = new wn(bundle3);
                        ey.l4(wnVar3, messageObject2);
                        eyVar2.presentFragment(wnVar3);
                        break;
                    }
                } else {
                    eyVar2.presentFragment(ProfileActivity.t4(((TLRPC.User) obj3).id));
                    break;
                }
                break;
            default:
                ey eyVar3 = this.b;
                Object I = eyVar3.C0.d0.I(i10);
                if (!(I instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof org.telegram.ui.Cells.m6) {
                        org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) view;
                        if (m6Var.n0) {
                            eyVar3.V4(m6Var.getDialogId(), view);
                            break;
                        }
                    }
                    if (eyVar3.R0 != 10) {
                        eyVar3.v4(view, i10, eyVar3.C0.d0);
                        break;
                    } else {
                        mx mxVar = eyVar3.C0;
                        bi.r1 r1Var = mxVar.a0;
                        eyVar3.w4(view, i10, f7, mxVar.d0);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) I;
                    eyVar3.presentFragment(wn.ea(DialogObject.getPeerDialogId(tL_sponsoredPeer.peer)));
                    org.telegram.ui.Components.xo0 xo0Var = eyVar3.C0.d0;
                    xo0Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(xo0Var.s0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    @Override // oi.n
    public int f() {
        ey eyVar = this.b;
        eyVar.getClass();
        return eyVar.getThemedColor(org.telegram.ui.ActionBar.y6.d6);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 6:
                ey.f0(this.b);
                break;
            case 7:
            case 8:
            default:
                ey eyVar = this.b;
                eyVar.getMessagesController().hidePromoDialog();
                eyVar.j4(false);
                break;
            case 9:
                ey eyVar2 = this.b;
                eyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            eyVar2.getParentActivity().startActivity(permissionManagerIntent);
                            break;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            eyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 10:
                ey eyVar3 = this.b;
                eyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    eyVar3.getParentActivity().startActivity(intent2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }

    public void i(int i10) {
        lw lwVar = this.b.B1;
        if (lwVar == null) {
            return;
        }
        if (i10 == 0) {
            lwVar.m0(true);
        } else {
            lwVar.t1(true, false);
        }
    }

    public void j(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.b.f5(z10, arrayList, arrayList2, z11, true);
    }

    @Override // oi.m
    public void k(int i10) {
        ey.z0(this.b, i10);
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void l0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    private final /* synthetic */ void a(View view, float f7, float f10) {
    }

    private final /* synthetic */ void b(View view, float f7, float f10) {
    }

    private final /* synthetic */ void g(View view, float f7, float f10) {
    }
}
