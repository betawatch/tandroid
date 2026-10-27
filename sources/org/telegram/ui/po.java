package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class po implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ cp b;

    public /* synthetic */ po(cp cpVar, int i10) {
        this.a = i10;
        this.b = cpVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new ro(this.b, 3));
                    break;
                }
                break;
            case 1:
                final int i10 = 1;
                final cp cpVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.so
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                cp cpVar2 = cpVar;
                                ArrayList arrayList = cpVar2.f0;
                                cpVar2.d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && cpVar2.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        cpVar2.n.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(cpVar2.getParentActivity(), new to(cpVar2, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z10 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        cpVar2.x.addView(nVar, org.telegram.ui.Components.kb1.r(-1, 72));
                                    }
                                    cpVar2.d0();
                                    break;
                                }
                                break;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                                cp cpVar3 = cpVar;
                                if (z11) {
                                    for (int i13 = 0; i13 < cpVar3.X.usernames.size(); i13++) {
                                        TLRPC.TL_username tL_username = cpVar3.X.usernames.get(i13);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                cpVar3.s0 = false;
                                AndroidUtilities.runOnUIThread(new ro(cpVar3, 4));
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 0;
                final cp cpVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.so
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                cp cpVar22 = cpVar2;
                                ArrayList arrayList = cpVar22.f0;
                                cpVar22.d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && cpVar22.getParentActivity() != null) {
                                    for (int i112 = 0; i112 < arrayList.size(); i112++) {
                                        cpVar22.n.removeView((View) arrayList.get(i112));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(cpVar22.getParentActivity(), new to(cpVar22, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z10 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        cpVar22.x.addView(nVar, org.telegram.ui.Components.kb1.r(-1, 72));
                                    }
                                    cpVar22.d0();
                                    break;
                                }
                                break;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                                cp cpVar3 = cpVar2;
                                if (z11) {
                                    for (int i13 = 0; i13 < cpVar3.X.usernames.size(); i13++) {
                                        TLRPC.TL_username tL_username = cpVar3.X.usernames.get(i13);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                cpVar3.s0 = false;
                                AndroidUtilities.runOnUIThread(new ro(cpVar3, 4));
                                break;
                        }
                    }
                });
                break;
            default:
                AndroidUtilities.runOnUIThread(new ed(24, this.b, tL_error));
                break;
        }
    }
}
