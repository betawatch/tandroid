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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hv implements org.telegram.ui.Components.jr0, org.telegram.ui.Components.yl0, org.telegram.ui.Components.zl0, v00, org.telegram.ui.ActionBar.a2, r0.n, org.telegram.ui.Components.ll0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cy b;

    public /* synthetic */ hv(cy cyVar, int i10) {
        this.a = i10;
        this.b = cyVar;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        cy cyVar = this.b;
        cyVar.v.j(k1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        cyVar.f4 = defaultWindowInsets.b;
        cyVar.g4 = defaultWindowInsets.d;
        int i10 = k1Var.a.f(8).d;
        if (cyVar.h4 != i10) {
            cyVar.h4 = i10;
            cyVar.fragmentView.requestLayout();
        }
        cyVar.F0.setPadding(0, cyVar.f4, 0, 0);
        cyVar.V4();
        for (UndoView undoView : cyVar.y0) {
            if (undoView != null) {
                int i11 = cyVar.g4 + cyVar.i4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        ww wwVar = cyVar.G3;
        if (wwVar != null) {
            r0.i0.b(wwVar, k1Var);
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.yl0
    public /* synthetic */ boolean P0(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.zl0
    public boolean a(int i10, View view) {
        cy.G0(this.b, i10);
        return false;
    }

    @Override // org.telegram.ui.Components.yl0
    public /* synthetic */ void a0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.ll0
    public void b() {
        cy cyVar = this.b;
        cyVar.Q = true;
        cyVar.fragmentView.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa A[SYNTHETIC] */
    @Override // org.telegram.ui.Components.yl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(float f7, float f10, int i10, View view) {
        TLRPC.Chat chat;
        switch (this.a) {
            case 1:
                cy cyVar = this.b;
                org.telegram.ui.Components.h61 G = cyVar.C0.j0.G(i10);
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
                        qn qnVar = new qn(bundle);
                        cy.b4(qnVar, messageObject);
                        cyVar.presentFragment(qnVar);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    qn qnVar2 = new qn(bundle2);
                    org.telegram.ui.Components.ro0 ro0Var = cyVar.C0.j0;
                    ro0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i10++;
                        if (i10 >= ro0Var.x.size()) {
                            qnVar2.fb = arrayList;
                            cyVar.presentFragment(qnVar2);
                            break;
                        } else {
                            org.telegram.ui.Components.h61 G2 = ro0Var.G(i10);
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
                cy cyVar2 = this.b;
                org.telegram.ui.Components.h61 G3 = cyVar2.C0.o0.G(i10);
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
                        qn qnVar3 = new qn(bundle3);
                        cy.b4(qnVar3, messageObject2);
                        cyVar2.presentFragment(qnVar3);
                        break;
                    }
                } else {
                    cyVar2.presentFragment(ProfileActivity.m4(((TLRPC.User) obj3).id));
                    break;
                }
                break;
            default:
                cy cyVar3 = this.b;
                Object J = cyVar3.C0.b0.J(i10);
                if (!(J instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof org.telegram.ui.Cells.h6) {
                        org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                        if (h6Var.n0) {
                            cyVar3.L4(h6Var.getDialogId(), view);
                            break;
                        }
                    }
                    if (cyVar3.R0 != 10) {
                        cyVar3.l4(view, i10, cyVar3.C0.b0);
                        break;
                    } else {
                        lx lxVar = cyVar3.C0;
                        ai.u1 u1Var = lxVar.V;
                        cyVar3.m4(view, i10, f7, lxVar.b0);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) J;
                    cyVar3.presentFragment(qn.W9(DialogObject.getPeerDialogId(tL_sponsoredPeer.peer)));
                    org.telegram.ui.Components.po0 po0Var = cyVar3.C0.b0;
                    po0Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(po0Var.s0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 6:
                cy.g0(this.b);
                break;
            case 7:
            default:
                cy cyVar = this.b;
                cyVar.getMessagesController().hidePromoDialog();
                cyVar.Z3(false);
                break;
            case 8:
                cy cyVar2 = this.b;
                cyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            cyVar2.getParentActivity().startActivity(permissionManagerIntent);
                            break;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            cyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 9:
                cy cyVar3 = this.b;
                cyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    cyVar3.getParentActivity().startActivity(intent2);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }

    public void h(int i10) {
        mw mwVar = this.b.B1;
        if (mwVar == null) {
            return;
        }
        if (i10 == 0) {
            mwVar.o0(true);
        } else {
            mwVar.u1(true, false);
        }
    }

    public void i(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.b.U4(z10, arrayList, arrayList2, z11, true);
    }

    private final /* synthetic */ void c(View view, float f7, float f10) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }

    private final /* synthetic */ void f(View view, float f7, float f10) {
    }
}
