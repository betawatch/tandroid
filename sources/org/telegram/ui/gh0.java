package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ wh0 b;
    public final /* synthetic */ TLRPC.TL_chatInviteExported c;

    public /* synthetic */ gh0(wh0 wh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.a = i10;
        this.b = wh0Var;
        this.c = tL_chatInviteExported;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final wh0 wh0Var = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.hh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    wh0 wh0Var2 = wh0Var;
                                    wh0Var2.e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = wh0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (wh0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        nh0 f02 = wh0Var2.f0();
                                        wh0Var2.j0.add(0, tL_chatInviteExported3);
                                        wh0Var2.h0(f02);
                                        org.telegram.messenger.f0.p(R.string.InviteRevokedHint, org.telegram.ui.Components.yc.a0(wh0Var2), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                wh0 wh0Var3 = wh0Var;
                                ArrayList arrayList = wh0Var3.i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!wh0Var3.o0) {
                                            wh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        nh0 f03 = wh0Var3.f0();
                                        if (wh0Var3.o0 && wh0Var3.f == wh0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (wh0Var3.e != null) {
                                            wh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        wh0Var3.j0.add(0, tL_chatInviteExported4);
                                        wh0Var3.h0(f03);
                                    } else {
                                        wh0Var3.s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = wh0Var3.d;
                                        if (chatFull2 != null) {
                                            int i11 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i11;
                                            if (i11 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            wh0Var3.getMessagesStorage().saveChatLinksCount(wh0Var3.n, wh0Var3.d.invitesCount);
                                        }
                                    }
                                    if (wh0Var3.getParentActivity() != null) {
                                        org.telegram.messenger.f0.p(R.string.InviteRevokedHint, org.telegram.ui.Components.yc.a0(wh0Var3), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                wh0 wh0Var2 = this.b;
                wh0Var2.getClass();
                AndroidUtilities.runOnUIThread(new nf0(wh0Var2, tL_error, this.c, 5));
                break;
            default:
                final int i11 = 1;
                final wh0 wh0Var3 = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.hh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    wh0 wh0Var22 = wh0Var3;
                                    wh0Var22.e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = wh0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (wh0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
                                        tL_chatInviteExported3.revoked = true;
                                        nh0 f02 = wh0Var22.f0();
                                        wh0Var22.j0.add(0, tL_chatInviteExported3);
                                        wh0Var22.h0(f02);
                                        org.telegram.messenger.f0.p(R.string.InviteRevokedHint, org.telegram.ui.Components.yc.a0(wh0Var22), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                wh0 wh0Var32 = wh0Var3;
                                ArrayList arrayList = wh0Var32.i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!wh0Var32.o0) {
                                            wh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        nh0 f03 = wh0Var32.f0();
                                        if (wh0Var32.o0 && wh0Var32.f == wh0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (wh0Var32.e != null) {
                                            wh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        wh0Var32.j0.add(0, tL_chatInviteExported4);
                                        wh0Var32.h0(f03);
                                    } else {
                                        wh0Var32.s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = wh0Var32.d;
                                        if (chatFull2 != null) {
                                            int i112 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i112;
                                            if (i112 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            wh0Var32.getMessagesStorage().saveChatLinksCount(wh0Var32.n, wh0Var32.d.invitesCount);
                                        }
                                    }
                                    if (wh0Var32.getParentActivity() != null) {
                                        org.telegram.messenger.f0.p(R.string.InviteRevokedHint, org.telegram.ui.Components.yc.a0(wh0Var32), R.raw.linkbroken, 36);
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
