package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ef0 b;
    public final /* synthetic */ TLRPC.TL_chatInviteExported c;

    public /* synthetic */ pe0(ef0 ef0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i7) {
        this.a = i7;
        this.b = ef0Var;
        this.c = tL_chatInviteExported;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final ef0 ef0Var = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.qe0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ef0 ef0Var2 = ef0Var;
                        switch (i10) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    ef0Var2.e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = ef0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (ef0Var2.getParentActivity() != null) {
                                        tL_chatInviteExported2.revoked = true;
                                        we0 l02 = ef0Var2.l0();
                                        ef0Var2.j0.add(0, tL_chatInviteExported2);
                                        ef0Var2.n0(l02);
                                        org.telegram.messenger.k5.o(null, 2131749117, org.telegram.ui.Components.hc.a0(ef0Var2), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ArrayList arrayList = ef0Var2.i0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!ef0Var2.o0) {
                                            ef0Var2.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported2.revoked = true;
                                        we0 l03 = ef0Var2.l0();
                                        if (ef0Var2.o0 && ef0Var2.f == org.telegram.messenger.p10.i(ef0Var2.getAccountInstance().a).e()) {
                                            arrayList.remove(tL_chatInviteExported2);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (ef0Var2.e != null) {
                                            ef0Var2.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        ef0Var2.j0.add(0, tL_chatInviteExported2);
                                        ef0Var2.n0(l03);
                                    } else {
                                        ef0Var2.s0.b(tL_chatInviteExported2, tLObject2);
                                        TLRPC.ChatFull chatFull2 = ef0Var2.d;
                                        if (chatFull2 != null) {
                                            int i11 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i11;
                                            if (i11 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            ef0Var2.getMessagesStorage().w1(ef0Var2.d.invitesCount, ef0Var2.n);
                                        }
                                    }
                                    if (ef0Var2.getParentActivity() != null) {
                                        org.telegram.messenger.k5.o(null, 2131749117, org.telegram.ui.Components.hc.a0(ef0Var2), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                ef0 ef0Var2 = this.b;
                ef0Var2.getClass();
                org.telegram.messenger.g0.h3(new oc0(ef0Var2, tL_error, this.c, 7));
                break;
            default:
                final int i10 = 1;
                final ef0 ef0Var3 = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.qe0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ef0 ef0Var22 = ef0Var3;
                        switch (i102) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    ef0Var22.e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = ef0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (ef0Var22.getParentActivity() != null) {
                                        tL_chatInviteExported22.revoked = true;
                                        we0 l02 = ef0Var22.l0();
                                        ef0Var22.j0.add(0, tL_chatInviteExported22);
                                        ef0Var22.n0(l02);
                                        org.telegram.messenger.k5.o(null, 2131749117, org.telegram.ui.Components.hc.a0(ef0Var22), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ArrayList arrayList = ef0Var22.i0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!ef0Var22.o0) {
                                            ef0Var22.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported22.revoked = true;
                                        we0 l03 = ef0Var22.l0();
                                        if (ef0Var22.o0 && ef0Var22.f == org.telegram.messenger.p10.i(ef0Var22.getAccountInstance().a).e()) {
                                            arrayList.remove(tL_chatInviteExported22);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (ef0Var22.e != null) {
                                            ef0Var22.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        ef0Var22.j0.add(0, tL_chatInviteExported22);
                                        ef0Var22.n0(l03);
                                    } else {
                                        ef0Var22.s0.b(tL_chatInviteExported22, tLObject2);
                                        TLRPC.ChatFull chatFull2 = ef0Var22.d;
                                        if (chatFull2 != null) {
                                            int i11 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i11;
                                            if (i11 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            ef0Var22.getMessagesStorage().w1(ef0Var22.d.invitesCount, ef0Var22.n);
                                        }
                                    }
                                    if (ef0Var22.getParentActivity() != null) {
                                        org.telegram.messenger.k5.o(null, 2131749117, org.telegram.ui.Components.hc.a0(ef0Var22), R.raw.linkbroken, 36);
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
