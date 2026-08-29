package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lo implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ yo b;

    public /* synthetic */ lo(yo yoVar, int i10) {
        this.a = i10;
        this.b = yoVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new no(this.b, 3));
                    break;
                }
                break;
            case 1:
                final int i10 = 0;
                final yo yoVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.oo
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                yo yoVar2 = yoVar;
                                if (z10) {
                                    for (int i11 = 0; i11 < yoVar2.T.usernames.size(); i11++) {
                                        TLRPC.TL_username tL_username = yoVar2.T.usernames.get(i11);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                yoVar2.p0 = false;
                                AndroidUtilities.runOnUIThread(new no(yoVar2, 4));
                                break;
                            default:
                                yo yoVar3 = yoVar;
                                ArrayList arrayList = yoVar3.b0;
                                yoVar3.Z = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && yoVar3.getParentActivity() != null) {
                                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                        yoVar3.h.removeView((View) arrayList.get(i12));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i13 = 0; i13 < tL_messages_chats.chats.size(); i13++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(yoVar3.getParentActivity(), new po(yoVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i13);
                                        boolean z11 = true;
                                        if (i13 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        yoVar3.x.addView(nVar, i7.f6.n(-1, 72));
                                    }
                                    yoVar3.b0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 1;
                final yo yoVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.oo
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                yo yoVar22 = yoVar2;
                                if (z10) {
                                    for (int i112 = 0; i112 < yoVar22.T.usernames.size(); i112++) {
                                        TLRPC.TL_username tL_username = yoVar22.T.usernames.get(i112);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                yoVar22.p0 = false;
                                AndroidUtilities.runOnUIThread(new no(yoVar22, 4));
                                break;
                            default:
                                yo yoVar3 = yoVar2;
                                ArrayList arrayList = yoVar3.b0;
                                yoVar3.Z = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && yoVar3.getParentActivity() != null) {
                                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                        yoVar3.h.removeView((View) arrayList.get(i12));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i13 = 0; i13 < tL_messages_chats.chats.size(); i13++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(yoVar3.getParentActivity(), new po(yoVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i13);
                                        boolean z11 = true;
                                        if (i13 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        yoVar3.x.addView(nVar, i7.f6.n(-1, 72));
                                    }
                                    yoVar3.b0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                AndroidUtilities.runOnUIThread(new vf(19, this.b, tL_error));
                break;
        }
    }
}
