package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ie0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ xe0 b;
    public final /* synthetic */ TLRPC.TL_chatInviteExported c;

    public /* synthetic */ ie0(xe0 xe0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i3) {
        this.a = i3;
        this.b = xe0Var;
        this.c = tL_chatInviteExported;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i3 = 0;
                final xe0 xe0Var = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.je0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i3;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        xe0 xe0Var2 = xe0Var;
                        switch (i10) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    xe0Var2.e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = xe0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (xe0Var2.getParentActivity() != null) {
                                        tL_chatInviteExported2.revoked = true;
                                        pe0 l02 = xe0Var2.l0();
                                        xe0Var2.k0.add(0, tL_chatInviteExported2);
                                        xe0Var2.n0(l02);
                                        org.telegram.messenger.k5.o(null, 2131749125, org.telegram.ui.Components.fc.a0(xe0Var2), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ArrayList arrayList = xe0Var2.j0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!xe0Var2.p0) {
                                            xe0Var2.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported2.revoked = true;
                                        pe0 l03 = xe0Var2.l0();
                                        if (xe0Var2.p0 && xe0Var2.f == org.telegram.messenger.h10.i(xe0Var2.getAccountInstance().a).e()) {
                                            arrayList.remove(tL_chatInviteExported2);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (xe0Var2.e != null) {
                                            xe0Var2.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        xe0Var2.k0.add(0, tL_chatInviteExported2);
                                        xe0Var2.n0(l03);
                                    } else {
                                        xe0Var2.t0.b(tL_chatInviteExported2, tLObject2);
                                        TLRPC.ChatFull chatFull2 = xe0Var2.d;
                                        if (chatFull2 != null) {
                                            int i11 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i11;
                                            if (i11 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            xe0Var2.getMessagesStorage().w1(xe0Var2.d.invitesCount, xe0Var2.n);
                                        }
                                    }
                                    if (xe0Var2.getParentActivity() != null) {
                                        org.telegram.messenger.k5.o(null, 2131749125, org.telegram.ui.Components.fc.a0(xe0Var2), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                xe0 xe0Var2 = this.b;
                xe0Var2.getClass();
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.c;
                org.telegram.messenger.g0.h3(new hc0(xe0Var2, tL_error, tL_chatInviteExported2, false, 8));
                break;
            default:
                final int i10 = 1;
                final xe0 xe0Var3 = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.je0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        xe0 xe0Var22 = xe0Var3;
                        switch (i102) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported32 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    xe0Var22.e = tL_chatInviteExported32;
                                    TLRPC.ChatFull chatFull = xe0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported32;
                                    }
                                    if (xe0Var22.getParentActivity() != null) {
                                        tL_chatInviteExported22.revoked = true;
                                        pe0 l02 = xe0Var22.l0();
                                        xe0Var22.k0.add(0, tL_chatInviteExported22);
                                        xe0Var22.n0(l02);
                                        org.telegram.messenger.k5.o(null, 2131749125, org.telegram.ui.Components.fc.a0(xe0Var22), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ArrayList arrayList = xe0Var22.j0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!xe0Var22.p0) {
                                            xe0Var22.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported22.revoked = true;
                                        pe0 l03 = xe0Var22.l0();
                                        if (xe0Var22.p0 && xe0Var22.f == org.telegram.messenger.h10.i(xe0Var22.getAccountInstance().a).e()) {
                                            arrayList.remove(tL_chatInviteExported22);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (xe0Var22.e != null) {
                                            xe0Var22.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        xe0Var22.k0.add(0, tL_chatInviteExported22);
                                        xe0Var22.n0(l03);
                                    } else {
                                        xe0Var22.t0.b(tL_chatInviteExported22, tLObject2);
                                        TLRPC.ChatFull chatFull2 = xe0Var22.d;
                                        if (chatFull2 != null) {
                                            int i11 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i11;
                                            if (i11 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            xe0Var22.getMessagesStorage().w1(xe0Var22.d.invitesCount, xe0Var22.n);
                                        }
                                    }
                                    if (xe0Var22.getParentActivity() != null) {
                                        org.telegram.messenger.k5.o(null, 2131749125, org.telegram.ui.Components.fc.a0(xe0Var22), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
