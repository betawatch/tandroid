package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class no implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap b;

    public /* synthetic */ no(ap apVar, int i10) {
        this.a = i10;
        this.b = apVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new po(this.b, 3));
                    break;
                }
                break;
            case 1:
                final int i10 = 1;
                final ap apVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.qo
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                ap apVar2 = apVar;
                                ArrayList arrayList = apVar2.f0;
                                apVar2.d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && apVar2.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        apVar2.n.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(apVar2.getParentActivity(), new ro(apVar2, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z10 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        apVar2.x.addView(nVar, org.telegram.ui.Components.gb1.r(-1, 72));
                                    }
                                    apVar2.d0();
                                    break;
                                }
                                break;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                                ap apVar3 = apVar;
                                if (z11) {
                                    for (int i13 = 0; i13 < apVar3.X.usernames.size(); i13++) {
                                        TLRPC.TL_username tL_username = apVar3.X.usernames.get(i13);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                apVar3.s0 = false;
                                AndroidUtilities.runOnUIThread(new po(apVar3, 4));
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 0;
                final ap apVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.qo
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                ap apVar22 = apVar2;
                                ArrayList arrayList = apVar22.f0;
                                apVar22.d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && apVar22.getParentActivity() != null) {
                                    for (int i112 = 0; i112 < arrayList.size(); i112++) {
                                        apVar22.n.removeView((View) arrayList.get(i112));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(apVar22.getParentActivity(), new ro(apVar22, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z10 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        apVar22.x.addView(nVar, org.telegram.ui.Components.gb1.r(-1, 72));
                                    }
                                    apVar22.d0();
                                    break;
                                }
                                break;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                                ap apVar3 = apVar2;
                                if (z11) {
                                    for (int i13 = 0; i13 < apVar3.X.usernames.size(); i13++) {
                                        TLRPC.TL_username tL_username = apVar3.X.usernames.get(i13);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                apVar3.s0 = false;
                                AndroidUtilities.runOnUIThread(new po(apVar3, 4));
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
