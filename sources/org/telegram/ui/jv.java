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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jv implements org.telegram.ui.Components.vp0, org.telegram.ui.Components.nk0, org.telegram.ui.Components.ok0, w00, org.telegram.ui.ActionBar.b2, r0.o, org.telegram.ui.Components.ck0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dy b;

    public /* synthetic */ jv(dy dyVar, int i9) {
        this.a = i9;
        this.b = dyVar;
    }

    @Override // r0.o
    public r0.m1 L0(View view, r0.m1 m1Var) {
        dy dyVar = this.b;
        dyVar.v.i(m1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        dyVar.b4 = defaultWindowInsets.b;
        dyVar.c4 = defaultWindowInsets.d;
        int i9 = m1Var.a.f(8).d;
        if (dyVar.d4 != i9) {
            dyVar.d4 = i9;
            dyVar.fragmentView.requestLayout();
        }
        dyVar.B0.setPadding(0, dyVar.b4, 0, 0);
        dyVar.X4();
        for (UndoView undoView : dyVar.u0) {
            if (undoView != null) {
                int i10 = dyVar.c4 + dyVar.e4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i10) {
                    marginLayoutParams.bottomMargin = i10;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        yw ywVar = dyVar.B3;
        if (ywVar != null) {
            r0.j0.b(ywVar, m1Var);
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        dy.m0(this.b, i9);
        return false;
    }

    @Override // org.telegram.ui.Components.ck0
    public void b() {
        dy dyVar = this.b;
        dyVar.M = true;
        dyVar.fragmentView.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa A[SYNTHETIC] */
    @Override // org.telegram.ui.Components.nk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(float f10, float f11, int i9, View view) {
        TLRPC.Chat chat;
        switch (this.a) {
            case 1:
                dy dyVar = this.b;
                org.telegram.ui.Components.l41 G = dyVar.y0.f0.G(i9);
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
                        dy.d4(qnVar, messageObject);
                        dyVar.presentFragment(qnVar);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    qn qnVar2 = new qn(bundle2);
                    org.telegram.ui.Components.cn0 cn0Var = dyVar.y0.f0;
                    cn0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i9++;
                        if (i9 >= cn0Var.x.size()) {
                            qnVar2.bb = arrayList;
                            dyVar.presentFragment(qnVar2);
                            break;
                        } else {
                            org.telegram.ui.Components.l41 G2 = cn0Var.G(i9);
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
                dy dyVar2 = this.b;
                org.telegram.ui.Components.l41 G3 = dyVar2.y0.k0.G(i9);
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
                        dy.d4(qnVar3, messageObject2);
                        dyVar2.presentFragment(qnVar3);
                        break;
                    }
                } else {
                    dyVar2.presentFragment(ProfileActivity.m4(((TLRPC.User) obj3).id));
                    break;
                }
                break;
            default:
                dy dyVar3 = this.b;
                Object J = dyVar3.y0.U.J(i9);
                if (!(J instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof org.telegram.ui.Cells.h6) {
                        org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                        if (h6Var.j0) {
                            dyVar3.N4(h6Var.getDialogId(), view);
                            break;
                        }
                    }
                    if (dyVar3.N0 != 10) {
                        dyVar3.n4(view, i9, dyVar3.y0.U);
                        break;
                    } else {
                        mx mxVar = dyVar3.y0;
                        gh.f1 f1Var = mxVar.R;
                        dyVar3.o4(view, i9, f10, mxVar.U);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) J;
                    dyVar3.presentFragment(qn.R9(DialogObject.getPeerDialogId(tL_sponsoredPeer.peer)));
                    org.telegram.ui.Components.an0 an0Var = dyVar3.y0.U;
                    an0Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(an0Var.o0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 6:
                dy.e0(this.b);
                break;
            case 7:
            default:
                dy dyVar = this.b;
                dyVar.getMessagesController().hidePromoDialog();
                dyVar.b4(false);
                break;
            case 8:
                dy dyVar2 = this.b;
                dyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            dyVar2.getParentActivity().startActivity(permissionManagerIntent);
                            break;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            dyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                break;
            case 9:
                dy dyVar3 = this.b;
                dyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    dyVar3.getParentActivity().startActivity(intent2);
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ boolean f1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ void g0(View view, float f10, float f11) {
        int i9 = this.a;
    }

    public void h(int i9) {
        ow owVar = this.b.x1;
        if (owVar == null) {
            return;
        }
        if (i9 == 0) {
            owVar.p0(true);
        } else {
            owVar.x1(true, false);
        }
    }

    public void i(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.b.W4(z10, arrayList, arrayList2, z11, true);
    }

    private final /* synthetic */ void d(View view, float f10, float f11) {
    }

    private final /* synthetic */ void e(View view, float f10, float f11) {
    }

    private final /* synthetic */ void g(View view, float f10, float f11) {
    }
}
