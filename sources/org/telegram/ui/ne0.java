package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf0 b;
    public final /* synthetic */ TLRPC.TL_chatInviteExported c;

    public /* synthetic */ ne0(cf0 cf0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i7) {
        this.a = i7;
        this.b = cf0Var;
        this.c = tL_chatInviteExported;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final cf0 cf0Var = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.oe0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        cf0 cf0Var2 = cf0Var;
                        switch (i10) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    cf0Var2.e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = cf0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (cf0Var2.getParentActivity() != null) {
                                        tL_chatInviteExported2.revoked = true;
                                        ue0 l02 = cf0Var2.l0();
                                        cf0Var2.j0.add(0, tL_chatInviteExported2);
                                        cf0Var2.n0(l02);
                                        org.telegram.messenger.k5.o(null, 2131749116, org.telegram.ui.Components.hc.a0(cf0Var2), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ArrayList arrayList = cf0Var2.i0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!cf0Var2.o0) {
                                            cf0Var2.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported2.revoked = true;
                                        ue0 l03 = cf0Var2.l0();
                                        if (cf0Var2.o0 && cf0Var2.f == org.telegram.messenger.p10.i(cf0Var2.getAccountInstance().a).e()) {
                                            arrayList.remove(tL_chatInviteExported2);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (cf0Var2.e != null) {
                                            cf0Var2.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        cf0Var2.j0.add(0, tL_chatInviteExported2);
                                        cf0Var2.n0(l03);
                                    } else {
                                        cf0Var2.s0.b(tL_chatInviteExported2, tLObject2);
                                        TLRPC.ChatFull chatFull2 = cf0Var2.d;
                                        if (chatFull2 != null) {
                                            int i11 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i11;
                                            if (i11 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            cf0Var2.getMessagesStorage().w1(cf0Var2.d.invitesCount, cf0Var2.n);
                                        }
                                    }
                                    if (cf0Var2.getParentActivity() != null) {
                                        org.telegram.messenger.k5.o(null, 2131749116, org.telegram.ui.Components.hc.a0(cf0Var2), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                cf0 cf0Var2 = this.b;
                cf0Var2.getClass();
                org.telegram.messenger.g0.h3(new mc0(cf0Var2, tL_error, this.c, 7));
                break;
            default:
                final int i10 = 1;
                final cf0 cf0Var3 = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.oe0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        cf0 cf0Var22 = cf0Var3;
                        switch (i102) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    cf0Var22.e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = cf0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (cf0Var22.getParentActivity() != null) {
                                        tL_chatInviteExported22.revoked = true;
                                        ue0 l02 = cf0Var22.l0();
                                        cf0Var22.j0.add(0, tL_chatInviteExported22);
                                        cf0Var22.n0(l02);
                                        org.telegram.messenger.k5.o(null, 2131749116, org.telegram.ui.Components.hc.a0(cf0Var22), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ArrayList arrayList = cf0Var22.i0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!cf0Var22.o0) {
                                            cf0Var22.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported22.revoked = true;
                                        ue0 l03 = cf0Var22.l0();
                                        if (cf0Var22.o0 && cf0Var22.f == org.telegram.messenger.p10.i(cf0Var22.getAccountInstance().a).e()) {
                                            arrayList.remove(tL_chatInviteExported22);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (cf0Var22.e != null) {
                                            cf0Var22.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        cf0Var22.j0.add(0, tL_chatInviteExported22);
                                        cf0Var22.n0(l03);
                                    } else {
                                        cf0Var22.s0.b(tL_chatInviteExported22, tLObject2);
                                        TLRPC.ChatFull chatFull2 = cf0Var22.d;
                                        if (chatFull2 != null) {
                                            int i11 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i11;
                                            if (i11 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            cf0Var22.getMessagesStorage().w1(cf0Var22.d.invitesCount, cf0Var22.n);
                                        }
                                    }
                                    if (cf0Var22.getParentActivity() != null) {
                                        org.telegram.messenger.k5.o(null, 2131749116, org.telegram.ui.Components.hc.a0(cf0Var22), R.raw.linkbroken, 36);
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
