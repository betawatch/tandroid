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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kv implements org.telegram.ui.Components.hq0, org.telegram.ui.Components.al0, org.telegram.ui.Components.bl0, y00, org.telegram.ui.ActionBar.b2, r0.o, org.telegram.ui.Components.nk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fy b;

    public /* synthetic */ kv(fy fyVar, int i10) {
        this.a = i10;
        this.b = fyVar;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        fy fyVar = this.b;
        fyVar.v.i(m1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        fyVar.b4 = defaultWindowInsets.b;
        fyVar.c4 = defaultWindowInsets.d;
        int i10 = m1Var.a.f(8).d;
        if (fyVar.d4 != i10) {
            fyVar.d4 = i10;
            fyVar.fragmentView.requestLayout();
        }
        fyVar.B0.setPadding(0, fyVar.b4, 0, 0);
        fyVar.X4();
        for (UndoView undoView : fyVar.u0) {
            if (undoView != null) {
                int i11 = fyVar.c4 + fyVar.e4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        ax axVar = fyVar.B3;
        if (axVar != null) {
            r0.j0.b(axVar, m1Var);
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.nk0
    public void a() {
        fy fyVar = this.b;
        fyVar.M = true;
        fyVar.fragmentView.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa A[SYNTHETIC] */
    @Override // org.telegram.ui.Components.al0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(float f9, float f10, int i10, View view) {
        TLRPC.Chat chat;
        switch (this.a) {
            case 1:
                fy fyVar = this.b;
                org.telegram.ui.Components.w41 G = fyVar.y0.f0.G(i10);
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
                        tn tnVar = new tn(bundle);
                        fy.d4(tnVar, messageObject);
                        fyVar.presentFragment(tnVar);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    tn tnVar2 = new tn(bundle2);
                    org.telegram.ui.Components.on0 on0Var = fyVar.y0.f0;
                    on0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i10++;
                        if (i10 >= on0Var.x.size()) {
                            tnVar2.bb = arrayList;
                            fyVar.presentFragment(tnVar2);
                            break;
                        } else {
                            org.telegram.ui.Components.w41 G2 = on0Var.G(i10);
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
                fy fyVar2 = this.b;
                org.telegram.ui.Components.w41 G3 = fyVar2.y0.k0.G(i10);
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
                        tn tnVar3 = new tn(bundle3);
                        fy.d4(tnVar3, messageObject2);
                        fyVar2.presentFragment(tnVar3);
                        break;
                    }
                } else {
                    fyVar2.presentFragment(ProfileActivity.m4(((TLRPC.User) obj3).id));
                    break;
                }
                break;
            default:
                fy fyVar3 = this.b;
                Object J = fyVar3.y0.U.J(i10);
                if (!(J instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof org.telegram.ui.Cells.f6) {
                        org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
                        if (f6Var.j0) {
                            fyVar3.N4(f6Var.getDialogId(), view);
                            break;
                        }
                    }
                    if (fyVar3.N0 != 10) {
                        fyVar3.n4(view, i10, fyVar3.y0.U);
                        break;
                    } else {
                        ox oxVar = fyVar3.y0;
                        jh.e1 e1Var = oxVar.R;
                        fyVar3.o4(view, i10, f9, oxVar.U);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) J;
                    fyVar3.presentFragment(tn.R9(DialogObject.getPeerDialogId(tL_sponsoredPeer.peer)));
                    org.telegram.ui.Components.mn0 mn0Var = fyVar3.y0.U;
                    mn0Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(mn0Var.o0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean b1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        fy.n0(this.b, i10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 6:
                fy.f0(this.b);
                break;
            case 7:
            default:
                fy fyVar = this.b;
                fyVar.getMessagesController().hidePromoDialog();
                fyVar.b4(false);
                break;
            case 8:
                fy fyVar2 = this.b;
                fyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            fyVar2.getParentActivity().startActivity(permissionManagerIntent);
                            break;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            fyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                break;
            case 9:
                fy fyVar3 = this.b;
                fyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    fyVar3.getParentActivity().startActivity(intent2);
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }

    public void h(int i10) {
        qw qwVar = this.b.x1;
        if (qwVar == null) {
            return;
        }
        if (i10 == 0) {
            qwVar.q0(true);
        } else {
            qwVar.x1(true, false);
        }
    }

    public void i(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.b.W4(z10, arrayList, arrayList2, z11, true);
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void o0(View view, float f9, float f10) {
        int i10 = this.a;
    }

    private final /* synthetic */ void d(View view, float f9, float f10) {
    }

    private final /* synthetic */ void e(View view, float f9, float f10) {
    }

    private final /* synthetic */ void f(View view, float f9, float f10) {
    }
}
