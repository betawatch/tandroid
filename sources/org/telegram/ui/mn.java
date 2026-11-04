package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mn implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ mn(bo boVar, int i3) {
        this.a = i3;
        this.b = boVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.g0.h3(new nn(this.b, 3));
                    break;
                }
                break;
            case 1:
                final int i3 = 0;
                final bo boVar = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.pn
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                bo boVar2 = boVar;
                                ArrayList arrayList = boVar2.g0;
                                boVar2.e0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && boVar2.getParentActivity() != null) {
                                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                        boVar2.n.removeView((View) arrayList.get(i10));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i11 = 0; i11 < tL_messages_chats.chats.size(); i11++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(boVar2.getParentActivity(), new qn(boVar2, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i11);
                                        boolean z10 = true;
                                        if (i11 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        boVar2.y.addView(nVar, b8.mf.o(-1, 72));
                                    }
                                    boVar2.h0();
                                    break;
                                }
                                break;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                                bo boVar3 = boVar;
                                if (z11) {
                                    for (int i12 = 0; i12 < boVar3.Y.usernames.size(); i12++) {
                                        TLRPC.TL_username tL_username = boVar3.Y.usernames.get(i12);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                boVar3.t0 = false;
                                org.telegram.messenger.g0.h3(new nn(boVar3, 4));
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i10 = 1;
                final bo boVar2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.pn
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                bo boVar22 = boVar2;
                                ArrayList arrayList = boVar22.g0;
                                boVar22.e0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && boVar22.getParentActivity() != null) {
                                    for (int i102 = 0; i102 < arrayList.size(); i102++) {
                                        boVar22.n.removeView((View) arrayList.get(i102));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i11 = 0; i11 < tL_messages_chats.chats.size(); i11++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(boVar22.getParentActivity(), new qn(boVar22, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i11);
                                        boolean z10 = true;
                                        if (i11 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        boVar22.y.addView(nVar, b8.mf.o(-1, 72));
                                    }
                                    boVar22.h0();
                                    break;
                                }
                                break;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                                bo boVar3 = boVar2;
                                if (z11) {
                                    for (int i12 = 0; i12 < boVar3.Y.usernames.size(); i12++) {
                                        TLRPC.TL_username tL_username = boVar3.Y.usernames.get(i12);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                boVar3.t0 = false;
                                org.telegram.messenger.g0.h3(new nn(boVar3, 4));
                                break;
                        }
                    }
                });
                break;
            default:
                org.telegram.messenger.g0.h3(new sc(26, this.b, tL_error));
                break;
        }
    }
}
