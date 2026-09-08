package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ih0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ yh0 b;
    public final /* synthetic */ TLRPC.TL_chatInviteExported c;

    public /* synthetic */ ih0(yh0 yh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.a = i10;
        this.b = yh0Var;
        this.c = tL_chatInviteExported;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final yh0 yh0Var = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.jh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    yh0 yh0Var2 = yh0Var;
                                    yh0Var2.e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = yh0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (yh0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        ph0 f02 = yh0Var2.f0();
                                        yh0Var2.j0.add(0, tL_chatInviteExported3);
                                        yh0Var2.h0(f02);
                                        org.telegram.messenger.w1.o(R.string.InviteRevokedHint, org.telegram.ui.Components.yc.a0(yh0Var2), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                yh0 yh0Var3 = yh0Var;
                                ArrayList arrayList = yh0Var3.i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!yh0Var3.o0) {
                                            yh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        ph0 f03 = yh0Var3.f0();
                                        if (yh0Var3.o0 && yh0Var3.f == yh0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (yh0Var3.e != null) {
                                            yh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        yh0Var3.j0.add(0, tL_chatInviteExported4);
                                        yh0Var3.h0(f03);
                                    } else {
                                        yh0Var3.s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = yh0Var3.d;
                                        if (chatFull2 != null) {
                                            int i11 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i11;
                                            if (i11 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            yh0Var3.getMessagesStorage().saveChatLinksCount(yh0Var3.n, yh0Var3.d.invitesCount);
                                        }
                                    }
                                    if (yh0Var3.getParentActivity() != null) {
                                        org.telegram.messenger.w1.o(R.string.InviteRevokedHint, org.telegram.ui.Components.yc.a0(yh0Var3), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                yh0 yh0Var2 = this.b;
                yh0Var2.getClass();
                AndroidUtilities.runOnUIThread(new pf0(yh0Var2, tL_error, this.c, 5));
                break;
            default:
                final int i11 = 1;
                final yh0 yh0Var3 = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.jh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    yh0 yh0Var22 = yh0Var3;
                                    yh0Var22.e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = yh0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (yh0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
                                        tL_chatInviteExported3.revoked = true;
                                        ph0 f02 = yh0Var22.f0();
                                        yh0Var22.j0.add(0, tL_chatInviteExported3);
                                        yh0Var22.h0(f02);
                                        org.telegram.messenger.w1.o(R.string.InviteRevokedHint, org.telegram.ui.Components.yc.a0(yh0Var22), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                yh0 yh0Var32 = yh0Var3;
                                ArrayList arrayList = yh0Var32.i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!yh0Var32.o0) {
                                            yh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        ph0 f03 = yh0Var32.f0();
                                        if (yh0Var32.o0 && yh0Var32.f == yh0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (yh0Var32.e != null) {
                                            yh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        yh0Var32.j0.add(0, tL_chatInviteExported4);
                                        yh0Var32.h0(f03);
                                    } else {
                                        yh0Var32.s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = yh0Var32.d;
                                        if (chatFull2 != null) {
                                            int i112 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i112;
                                            if (i112 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            yh0Var32.getMessagesStorage().saveChatLinksCount(yh0Var32.n, yh0Var32.d.invitesCount);
                                        }
                                    }
                                    if (yh0Var32.getParentActivity() != null) {
                                        org.telegram.messenger.w1.o(R.string.InviteRevokedHint, org.telegram.ui.Components.yc.a0(yh0Var32), R.raw.linkbroken, 36);
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
