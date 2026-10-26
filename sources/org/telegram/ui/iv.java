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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iv implements org.telegram.ui.Components.pr0, org.telegram.ui.Components.am0, org.telegram.ui.Components.bm0, x00, org.telegram.ui.ActionBar.b2, oi.m, r0.n, oi.n, org.telegram.ui.Components.ol0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cy b;

    public /* synthetic */ iv(cy cyVar, int i10) {
        this.a = i10;
        this.b = cyVar;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
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
        cyVar.g5();
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
        tw twVar = cyVar.G3;
        if (twVar != null) {
            r0.i0.b(twVar, k1Var);
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.bm0
    public boolean c(int i10, View view) {
        cy.m0(this.b, i10);
        return false;
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ boolean c1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ol0
    public void d() {
        cy cyVar = this.b;
        cyVar.Q = true;
        cyVar.fragmentView.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa A[SYNTHETIC] */
    @Override // org.telegram.ui.Components.am0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(float f7, float f10, int i10, View view) {
        TLRPC.Chat chat;
        switch (this.a) {
            case 1:
                cy cyVar = this.b;
                org.telegram.ui.Components.t61 G = cyVar.C0.l0.G(i10);
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
                        un unVar = new un(bundle);
                        cy.l4(unVar, messageObject);
                        cyVar.presentFragment(unVar);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    un unVar2 = new un(bundle2);
                    org.telegram.ui.Components.yo0 yo0Var = cyVar.C0.l0;
                    yo0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i10++;
                        if (i10 >= yo0Var.y.size()) {
                            unVar2.Bb = arrayList;
                            cyVar.presentFragment(unVar2);
                            break;
                        } else {
                            org.telegram.ui.Components.t61 G2 = yo0Var.G(i10);
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
                org.telegram.ui.Components.t61 G3 = cyVar2.C0.q0.G(i10);
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
                        un unVar3 = new un(bundle3);
                        cy.l4(unVar3, messageObject2);
                        cyVar2.presentFragment(unVar3);
                        break;
                    }
                } else {
                    cyVar2.presentFragment(ProfileActivity.t4(((TLRPC.User) obj3).id));
                    break;
                }
                break;
            default:
                cy cyVar3 = this.b;
                Object I = cyVar3.C0.d0.I(i10);
                if (!(I instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof org.telegram.ui.Cells.m6) {
                        org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) view;
                        if (m6Var.n0) {
                            cyVar3.V4(m6Var.getDialogId(), view);
                            break;
                        }
                    }
                    if (cyVar3.R0 != 10) {
                        cyVar3.v4(view, i10, cyVar3.C0.d0);
                        break;
                    } else {
                        jx jxVar = cyVar3.C0;
                        bi.r1 r1Var = jxVar.a0;
                        cyVar3.w4(view, i10, f7, jxVar.d0);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) I;
                    cyVar3.presentFragment(un.ba(DialogObject.getPeerDialogId(tL_sponsoredPeer.peer)));
                    org.telegram.ui.Components.wo0 wo0Var = cyVar3.C0.d0;
                    wo0Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(wo0Var.s0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    @Override // oi.n
    public int f() {
        cy cyVar = this.b;
        cyVar.getClass();
        return cyVar.getThemedColor(org.telegram.ui.ActionBar.y6.d6);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 6:
                cy.f0(this.b);
                break;
            case 7:
            case 8:
            default:
                cy cyVar = this.b;
                cyVar.getMessagesController().hidePromoDialog();
                cyVar.j4(false);
                break;
            case 9:
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
            case 10:
                cy cyVar3 = this.b;
                cyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    cyVar3.getParentActivity().startActivity(intent2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }

    public void i(int i10) {
        jw jwVar = this.b.B1;
        if (jwVar == null) {
            return;
        }
        if (i10 == 0) {
            jwVar.n0(true);
        } else {
            jwVar.u1(true, false);
        }
    }

    public void j(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.b.f5(z10, arrayList, arrayList2, z11, true);
    }

    @Override // oi.m
    public void k(int i10) {
        cy.z0(this.b, i10);
    }

    @Override // org.telegram.ui.Components.am0
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
