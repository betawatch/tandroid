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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mv implements org.telegram.ui.Components.wp0, org.telegram.ui.Components.qk0, org.telegram.ui.Components.rk0, z00, org.telegram.ui.ActionBar.a2, r0.o, org.telegram.ui.Components.ek0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gy b;

    public /* synthetic */ mv(gy gyVar, int i10) {
        this.a = i10;
        this.b = gyVar;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        gy gyVar = this.b;
        gyVar.v.i(m1Var);
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        gyVar.b4 = defaultWindowInsets.b;
        gyVar.c4 = defaultWindowInsets.d;
        int i10 = m1Var.a.f(8).d;
        if (gyVar.d4 != i10) {
            gyVar.d4 = i10;
            gyVar.fragmentView.requestLayout();
        }
        gyVar.B0.setPadding(0, gyVar.b4, 0, 0);
        gyVar.X4();
        for (UndoView undoView : gyVar.u0) {
            if (undoView != null) {
                int i11 = gyVar.c4 + gyVar.e4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        bx bxVar = gyVar.B3;
        if (bxVar != null) {
            r0.j0.b(bxVar, m1Var);
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        gy.n0(this.b, i10);
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public void b() {
        gy gyVar = this.b;
        gyVar.M = true;
        gyVar.fragmentView.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa A[SYNTHETIC] */
    @Override // org.telegram.ui.Components.qk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(float f10, float f11, int i10, View view) {
        TLRPC.Chat chat;
        switch (this.a) {
            case 1:
                gy gyVar = this.b;
                org.telegram.ui.Components.n41 G = gyVar.y0.f0.G(i10);
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
                        rn rnVar = new rn(bundle);
                        gy.d4(rnVar, messageObject);
                        gyVar.presentFragment(rnVar);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    rn rnVar2 = new rn(bundle2);
                    org.telegram.ui.Components.en0 en0Var = gyVar.y0.f0;
                    en0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i10++;
                        if (i10 >= en0Var.x.size()) {
                            rnVar2.bb = arrayList;
                            gyVar.presentFragment(rnVar2);
                            break;
                        } else {
                            org.telegram.ui.Components.n41 G2 = en0Var.G(i10);
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
                gy gyVar2 = this.b;
                org.telegram.ui.Components.n41 G3 = gyVar2.y0.k0.G(i10);
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
                        rn rnVar3 = new rn(bundle3);
                        gy.d4(rnVar3, messageObject2);
                        gyVar2.presentFragment(rnVar3);
                        break;
                    }
                } else {
                    gyVar2.presentFragment(ProfileActivity.m4(((TLRPC.User) obj3).id));
                    break;
                }
                break;
            default:
                gy gyVar3 = this.b;
                Object J = gyVar3.y0.U.J(i10);
                if (!(J instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof org.telegram.ui.Cells.e6) {
                        org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
                        if (e6Var.j0) {
                            gyVar3.N4(e6Var.getDialogId(), view);
                            break;
                        }
                    }
                    if (gyVar3.N0 != 10) {
                        gyVar3.n4(view, i10, gyVar3.y0.U);
                        break;
                    } else {
                        px pxVar = gyVar3.y0;
                        hh.f1 f1Var = pxVar.R;
                        gyVar3.o4(view, i10, f10, pxVar.U);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) J;
                    gyVar3.presentFragment(rn.R9(DialogObject.getPeerDialogId(tL_sponsoredPeer.peer)));
                    org.telegram.ui.Components.cn0 cn0Var = gyVar3.y0.U;
                    cn0Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(cn0Var.o0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ void c0(View view, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 6:
                gy.f0(this.b);
                break;
            case 7:
            default:
                gy gyVar = this.b;
                gyVar.getMessagesController().hidePromoDialog();
                gyVar.b4(false);
                break;
            case 8:
                gy gyVar2 = this.b;
                gyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            gyVar2.getParentActivity().startActivity(permissionManagerIntent);
                            break;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            gyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        return;
                    }
                }
                break;
            case 9:
                gy gyVar3 = this.b;
                gyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    gyVar3.getParentActivity().startActivity(intent2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean f1(View view) {
        switch (this.a) {
        }
        return false;
    }

    public void h(int i10) {
        rw rwVar = this.b.x1;
        if (rwVar == null) {
            return;
        }
        if (i10 == 0) {
            rwVar.q0(true);
        } else {
            rwVar.w1(true, false);
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
