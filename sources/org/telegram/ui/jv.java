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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jv implements org.telegram.ui.Components.hr0, org.telegram.ui.Components.xl0, org.telegram.ui.Components.yl0, x00, org.telegram.ui.ActionBar.a2, r0.n, org.telegram.ui.Components.kl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey b;

    public /* synthetic */ jv(ey eyVar, int i10) {
        this.a = i10;
        this.b = eyVar;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
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
        eyVar.V4();
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
        yw ywVar = eyVar.G3;
        if (ywVar != null) {
            r0.i0.b(ywVar, k1Var);
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ boolean P0(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.yl0
    public boolean a(int i10, View view) {
        ey.G0(this.b, i10);
        return false;
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ void a0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.kl0
    public void b() {
        ey eyVar = this.b;
        eyVar.Q = true;
        eyVar.fragmentView.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa A[SYNTHETIC] */
    @Override // org.telegram.ui.Components.xl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(float f7, float f10, int i10, View view) {
        TLRPC.Chat chat;
        switch (this.a) {
            case 1:
                ey eyVar = this.b;
                org.telegram.ui.Components.f61 G = eyVar.C0.j0.G(i10);
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
                        sn snVar = new sn(bundle);
                        ey.b4(snVar, messageObject);
                        eyVar.presentFragment(snVar);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    sn snVar2 = new sn(bundle2);
                    org.telegram.ui.Components.qo0 qo0Var = eyVar.C0.j0;
                    qo0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i10++;
                        if (i10 >= qo0Var.x.size()) {
                            snVar2.fb = arrayList;
                            eyVar.presentFragment(snVar2);
                            break;
                        } else {
                            org.telegram.ui.Components.f61 G2 = qo0Var.G(i10);
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
                org.telegram.ui.Components.f61 G3 = eyVar2.C0.o0.G(i10);
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
                        sn snVar3 = new sn(bundle3);
                        ey.b4(snVar3, messageObject2);
                        eyVar2.presentFragment(snVar3);
                        break;
                    }
                } else {
                    eyVar2.presentFragment(ProfileActivity.m4(((TLRPC.User) obj3).id));
                    break;
                }
                break;
            default:
                ey eyVar3 = this.b;
                Object J = eyVar3.C0.b0.J(i10);
                if (!(J instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof org.telegram.ui.Cells.h6) {
                        org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                        if (h6Var.n0) {
                            eyVar3.L4(h6Var.getDialogId(), view);
                            break;
                        }
                    }
                    if (eyVar3.R0 != 10) {
                        eyVar3.l4(view, i10, eyVar3.C0.b0);
                        break;
                    } else {
                        nx nxVar = eyVar3.C0;
                        ai.u1 u1Var = nxVar.V;
                        eyVar3.m4(view, i10, f7, nxVar.b0);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) J;
                    eyVar3.presentFragment(sn.W9(DialogObject.getPeerDialogId(tL_sponsoredPeer.peer)));
                    org.telegram.ui.Components.oo0 oo0Var = eyVar3.C0.b0;
                    oo0Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(oo0Var.s0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 6:
                ey.g0(this.b);
                break;
            case 7:
            default:
                ey eyVar = this.b;
                eyVar.getMessagesController().hidePromoDialog();
                eyVar.Z3(false);
                break;
            case 8:
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
            case 9:
                ey eyVar3 = this.b;
                eyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    eyVar3.getParentActivity().startActivity(intent2);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }

    public void h(int i10) {
        ow owVar = this.b.B1;
        if (owVar == null) {
            return;
        }
        if (i10 == 0) {
            owVar.o0(true);
        } else {
            owVar.v1(true, false);
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
