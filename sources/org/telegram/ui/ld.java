package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ld implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ld(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new o1((zd) this.b, tLObject, (Context) this.c, 13));
                break;
            case 1:
                an anVar = (an) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    org.telegram.messenger.g0.h3(new qe(anVar, !messages_messages.messages.isEmpty() ? ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset : ((TLRPC.messages_Messages) tLObject2).offset_id_offset, 6));
                    break;
                }
                break;
            case 2:
                org.telegram.messenger.g0.h3(new o1((an) this.b, tLObject, (TLRPC.User) this.c, 21));
                break;
            case 3:
                an anVar2 = (an) this.b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.c;
                if (tL_error != null) {
                    if (tL_error.text != null) {
                        org.telegram.messenger.g0.h3(new qf(10, anVar2, tL_error));
                        break;
                    }
                } else {
                    anVar2.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(new qf(9, anVar2, tL_messages_sendScheduledMessages));
                    break;
                }
                break;
            case 4:
                org.telegram.messenger.g0.h3(new m6((an) this.b, tLObject, tL_error, (org.telegram.messenger.yr) this.c, 8));
                break;
            case 5:
                org.telegram.messenger.g0.h3(new o1((dl) this.b, tLObject, (org.telegram.messenger.ij) this.c, 23));
                break;
            case 6:
                pn pnVar = (pn) this.b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.c;
                TLRPC.UserFull userFull = pnVar.D0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    pnVar.getMessagesStorage().j2(pnVar.D0, false);
                }
                org.telegram.messenger.g0.h3(new ln(pnVar, 2));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new qf(22, (so) this.b, (org.telegram.ui.ActionBar.u1[]) this.c));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new m6((kp) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.c, 11));
                break;
            case 9:
                org.telegram.ui.Components.e5 e5Var = (org.telegram.ui.Components.e5) this.b;
                org.telegram.messenger.qs.f(e5Var.e).d(new org.telegram.ui.Components.d5(e5Var, (ArrayList) this.c, tLObject, 0));
                break;
            case 10:
                org.telegram.messenger.g0.h3(new l2.z0((org.telegram.ui.Components.b8) this.b, (org.telegram.ui.ActionBar.u1) this.c, tLObject, 26));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.f(15, (org.telegram.ui.Components.di) this.b, (TLRPC.TL_attachMenuBot) this.c));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.f(14, (org.telegram.ui.Components.di) this.b, (org.telegram.ui.Components.wh) this.c));
                break;
            case 13:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ng((org.telegram.ui.Components.to) this.b, tLObject, (org.telegram.ui.ActionBar.j6) this.c, 2));
                break;
            case 14:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.fq(18, (org.telegram.ui.Components.vz) this.b, (Pair) this.c));
                break;
            case 15:
                org.telegram.messenger.g0.h3(new m6((org.telegram.ui.Components.vz) this.b, tL_error, tLObject, (org.telegram.messenger.c20) this.c, 21));
                break;
            case 16:
                org.telegram.messenger.g0.h3(new m6((org.telegram.ui.Components.h20) this.b, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.c, 23));
                break;
            case 17:
                org.telegram.messenger.g0.h3(new m6((org.telegram.ui.Components.q70) this.b, (TLRPC.TL_chatInviteExported) this.c, tL_error, tLObject, 25));
                break;
            case 18:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ng((org.telegram.ui.Components.qe0) this.b, (org.telegram.ui.Components.pe0) this.c, tLObject, 16));
                break;
            case 19:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.v80((org.telegram.ui.Components.mo0) this.b, tLObject, (Context) this.c, 12));
                break;
            case 20:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0((org.telegram.ui.Components.yv0) this.b, tL_error, tLObject, (org.telegram.messenger.ui) this.c, 1));
                break;
            case 21:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0((po0) this.b, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) this.c, 2));
                break;
            case 22:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0((org.telegram.ui.Components.ly0) this.b, (org.telegram.ui.ActionBar.u1) this.c, tLObject, tL_error, 3));
                break;
            case 23:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0((org.telegram.ui.Components.k21) this.b, tL_error, tLObject, (TLRPC.TL_textWithEntities) this.c, 5));
                break;
            case 24:
                org.telegram.messenger.g0.h3(new rp((ix) this.b, tLObject, (org.telegram.messenger.ij) this.c, 4));
                break;
            case 25:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.l51(20, (ey) this.b, (org.telegram.ui.ActionBar.u1) this.c));
                break;
            case 26:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.l51(24, (gz) this.b, (org.telegram.ui.ActionBar.u1) this.c));
                break;
            case 27:
                org.telegram.messenger.g0.h3(new rp((az) this.b, tL_error, (zy) this.c, 8));
                break;
            case 28:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.l51(26, (FiltersSetupActivity) this.b, (TLRPC.TL_messages_toggleDialogFilterTags) this.c));
                break;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0((l30) this.b, tL_error, tLObject, (String) this.c, 9));
                break;
        }
    }
}
