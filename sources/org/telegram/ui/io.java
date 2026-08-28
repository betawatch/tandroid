package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class io implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo b;

    public /* synthetic */ io(vo voVar, int i9) {
        this.a = i9;
        this.b = voVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new ko(this.b, 3));
                    break;
                }
                break;
            case 1:
                final int i9 = 0;
                final vo voVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.lo
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                vo voVar2 = voVar;
                                if (z10) {
                                    for (int i10 = 0; i10 < voVar2.T.usernames.size(); i10++) {
                                        TLRPC.TL_username tL_username = voVar2.T.usernames.get(i10);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                voVar2.p0 = false;
                                AndroidUtilities.runOnUIThread(new ko(voVar2, 4));
                                break;
                            default:
                                vo voVar3 = voVar;
                                ArrayList arrayList = voVar3.b0;
                                voVar3.Z = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && voVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        voVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(voVar3.getParentActivity(), new mo(voVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z11 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        voVar3.x.addView(nVar, g7.e6.n(-1, 72));
                                    }
                                    voVar3.a0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i10 = 1;
                final vo voVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.lo
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                vo voVar22 = voVar2;
                                if (z10) {
                                    for (int i102 = 0; i102 < voVar22.T.usernames.size(); i102++) {
                                        TLRPC.TL_username tL_username = voVar22.T.usernames.get(i102);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                voVar22.p0 = false;
                                AndroidUtilities.runOnUIThread(new ko(voVar22, 4));
                                break;
                            default:
                                vo voVar3 = voVar2;
                                ArrayList arrayList = voVar3.b0;
                                voVar3.Z = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && voVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        voVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(voVar3.getParentActivity(), new mo(voVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z11 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        voVar3.x.addView(nVar, g7.e6.n(-1, 72));
                                    }
                                    voVar3.a0();
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
