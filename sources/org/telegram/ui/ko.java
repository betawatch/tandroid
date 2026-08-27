package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ xo b;

    public /* synthetic */ ko(xo xoVar, int i10) {
        this.a = i10;
        this.b = xoVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new mo(this.b, 3));
                    break;
                }
                break;
            case 1:
                final int i10 = 0;
                final xo xoVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.no
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                xo xoVar2 = xoVar;
                                if (z10) {
                                    for (int i11 = 0; i11 < xoVar2.T.usernames.size(); i11++) {
                                        TLRPC.TL_username tL_username = xoVar2.T.usernames.get(i11);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                xoVar2.p0 = false;
                                AndroidUtilities.runOnUIThread(new mo(xoVar2, 4));
                                break;
                            default:
                                xo xoVar3 = xoVar;
                                ArrayList arrayList = xoVar3.b0;
                                xoVar3.Z = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && xoVar3.getParentActivity() != null) {
                                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                        xoVar3.h.removeView((View) arrayList.get(i12));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i13 = 0; i13 < tL_messages_chats.chats.size(); i13++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(xoVar3.getParentActivity(), new oo(xoVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i13);
                                        boolean z11 = true;
                                        if (i13 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        xoVar3.x.addView(nVar, h7.z5.n(-1, 72));
                                    }
                                    xoVar3.b0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 1;
                final xo xoVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.no
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                xo xoVar22 = xoVar2;
                                if (z10) {
                                    for (int i112 = 0; i112 < xoVar22.T.usernames.size(); i112++) {
                                        TLRPC.TL_username tL_username = xoVar22.T.usernames.get(i112);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                xoVar22.p0 = false;
                                AndroidUtilities.runOnUIThread(new mo(xoVar22, 4));
                                break;
                            default:
                                xo xoVar3 = xoVar2;
                                ArrayList arrayList = xoVar3.b0;
                                xoVar3.Z = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && xoVar3.getParentActivity() != null) {
                                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                        xoVar3.h.removeView((View) arrayList.get(i12));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i13 = 0; i13 < tL_messages_chats.chats.size(); i13++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(xoVar3.getParentActivity(), new oo(xoVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i13);
                                        boolean z11 = true;
                                        if (i13 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        xoVar3.x.addView(nVar, h7.z5.n(-1, 72));
                                    }
                                    xoVar3.b0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                AndroidUtilities.runOnUIThread(new rd(22, this.b, tL_error));
                break;
        }
    }
}
