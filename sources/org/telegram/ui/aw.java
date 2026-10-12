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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class aw implements org.telegram.ui.Components.nr0, org.telegram.ui.Components.bm0, org.telegram.ui.Components.cm0, t10, org.telegram.ui.ActionBar.z1, r0.o, org.telegram.ui.Components.ol0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;

    public /* synthetic */ aw(yy yyVar, int i10) {
        this.a = i10;
        this.b = yyVar;
    }

    @Override // r0.o
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        yy yyVar = this.b;
        yyVar.v.j(l1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        yyVar.e4 = defaultWindowInsets.b;
        yyVar.f4 = defaultWindowInsets.d;
        int i10 = l1Var.a.f(8).d;
        if (yyVar.g4 != i10) {
            yyVar.g4 = i10;
            yyVar.fragmentView.requestLayout();
        }
        yyVar.F0.setPadding(0, yyVar.e4, 0, 0);
        yyVar.U4();
        for (UndoView undoView : yyVar.y0) {
            if (undoView != null) {
                int i11 = yyVar.f4 + yyVar.h4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        sx sxVar = yyVar.F3;
        if (sxVar != null) {
            r0.j0.b(sxVar, l1Var);
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean a(int i10, View view) {
        yy.m0(this.b, i10);
        return false;
    }

    @Override // org.telegram.ui.Components.ol0
    public void c() {
        yy yyVar = this.b;
        yyVar.Q = true;
        yyVar.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        switch (this.a) {
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa A[SYNTHETIC] */
    @Override // org.telegram.ui.Components.bm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(float f7, float f10, int i10, View view) {
        TLRPC.Chat chat;
        switch (this.a) {
            case 1:
                yy yyVar = this.b;
                org.telegram.ui.Components.l61 G = yyVar.C0.j0.G(i10);
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
                        fo foVar = new fo(bundle);
                        yy.a4(foVar, messageObject);
                        yyVar.presentFragment(foVar);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    fo foVar2 = new fo(bundle2);
                    org.telegram.ui.Components.uo0 uo0Var = yyVar.C0.j0;
                    uo0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i10++;
                        if (i10 >= uo0Var.x.size()) {
                            foVar2.fb = arrayList;
                            yyVar.presentFragment(foVar2);
                            break;
                        } else {
                            org.telegram.ui.Components.l61 G2 = uo0Var.G(i10);
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
                yy yyVar2 = this.b;
                org.telegram.ui.Components.l61 G3 = yyVar2.C0.o0.G(i10);
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
                        fo foVar3 = new fo(bundle3);
                        yy.a4(foVar3, messageObject2);
                        yyVar2.presentFragment(foVar3);
                        break;
                    }
                } else {
                    yyVar2.presentFragment(ProfileActivity.m4(((TLRPC.User) obj3).id));
                    break;
                }
                break;
            default:
                yy yyVar3 = this.b;
                Object J = yyVar3.C0.b0.J(i10);
                if (!(J instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof org.telegram.ui.Cells.i6) {
                        org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                        if (i6Var.n0) {
                            yyVar3.K4(i6Var.getDialogId(), view);
                            break;
                        }
                    }
                    if (yyVar3.R0 != 10) {
                        yyVar3.k4(view, i10, yyVar3.C0.b0);
                        break;
                    } else {
                        iy iyVar = yyVar3.C0;
                        bi.o0 o0Var = iyVar.V;
                        yyVar3.l4(view, i10, f7, iyVar.b0);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) J;
                    yyVar3.presentFragment(fo.W9(DialogObject.getPeerDialogId(tL_sponsoredPeer.peer)));
                    org.telegram.ui.Components.so0 so0Var = yyVar3.C0.b0;
                    so0Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(so0Var.s0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 6:
                yy.d0(this.b);
                break;
            case 7:
            default:
                yy yyVar = this.b;
                yyVar.getMessagesController().hidePromoDialog();
                yyVar.Y3(false);
                break;
            case 8:
                yy yyVar2 = this.b;
                yyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            yyVar2.getParentActivity().startActivity(permissionManagerIntent);
                            break;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            yyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 9:
                yy yyVar3 = this.b;
                yyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    yyVar3.getParentActivity().startActivity(intent2);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }

    public void h(int i10) {
        ix ixVar = this.b.B1;
        if (ixVar == null) {
            return;
        }
        if (i10 == 0) {
            ixVar.o0(true);
        } else {
            ixVar.v1(true, false);
        }
    }

    public void i(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.b.T4(z10, arrayList, arrayList2, z11, true);
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void p0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    private final /* synthetic */ void b(View view, float f7, float f10) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }

    private final /* synthetic */ void f(View view, float f7, float f10) {
    }
}
