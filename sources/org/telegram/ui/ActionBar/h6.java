package org.telegram.ui.ActionBar;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.e7;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.re0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.se0;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.v60;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.z7;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ez;
import org.telegram.ui.fx;
import org.telegram.ui.go0;
import org.telegram.ui.hn;
import org.telegram.ui.i8;
import org.telegram.ui.ip;
import org.telegram.ui.ln;
import org.telegram.ui.lo;
import org.telegram.ui.nc;
import org.telegram.ui.ne;
import org.telegram.ui.pp;
import org.telegram.ui.qo;
import org.telegram.ui.sc;
import org.telegram.ui.wm;
import org.telegram.ui.xd;
import org.telegram.ui.zk;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h6 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h6(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new lg.y((j6) this.b, tLObject, (j6) this.c, 25));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new o4.b1((i8) this.b, tL_error, tLObject, (Calendar) this.c, 8));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new org.telegram.ui.p1((nc) this.c, tLObject, (j6) this.b, 10));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new org.telegram.ui.p1((xd) this.b, tLObject, (Context) this.c, 13));
                break;
            case 4:
                wm wmVar = (wm) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    org.telegram.messenger.g0.h3(new ne(wmVar, !messages_messages.messages.isEmpty() ? ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset : ((TLRPC.messages_Messages) tLObject2).offset_id_offset, 6));
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.g0.h3(new org.telegram.ui.p1((wm) this.b, tLObject, (TLRPC.User) this.c, 21));
                break;
            case 6:
                wm wmVar2 = (wm) this.b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.c;
                if (tL_error != null) {
                    if (tL_error.text != null) {
                        org.telegram.messenger.g0.h3(new sc(15, wmVar2, tL_error));
                        break;
                    }
                } else {
                    wmVar2.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(new sc(14, wmVar2, tL_messages_sendScheduledMessages));
                    break;
                }
                break;
            case 7:
                org.telegram.messenger.g0.h3(new o4.b1((wm) this.b, tLObject, tL_error, (qr) this.c, 14));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new org.telegram.ui.p1((zk) this.b, tLObject, (zi) this.c, 23));
                break;
            case 9:
                ln lnVar = (ln) this.b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.c;
                TLRPC.UserFull userFull = lnVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    lnVar.getMessagesStorage().j2(lnVar.E0, false);
                }
                org.telegram.messenger.g0.h3(new hn(lnVar, 2));
                break;
            case 10:
                org.telegram.messenger.g0.h3(new sc(27, (qo) this.b, (s1[]) this.c));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new o4.b1((ip) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.c, 17));
                break;
            case 12:
                org.telegram.ui.Components.c5 c5Var = (org.telegram.ui.Components.c5) this.b;
                hs.f(c5Var.e).d(new org.telegram.ui.Components.b5(c5Var, (ArrayList) this.c, tLObject, 0));
                break;
            case 13:
                org.telegram.messenger.g0.h3(new e7((z7) this.b, (s1) this.c, tLObject, 0));
                break;
            case 14:
                org.telegram.messenger.g0.h3(new lo(20, (bi) this.b, (TLRPC.TL_attachMenuBot) this.c));
                break;
            case 15:
                org.telegram.messenger.g0.h3(new lo(19, (bi) this.b, (uh) this.c));
                break;
            case 16:
                org.telegram.messenger.g0.h3(new e7(this.c, tLObject, this.b, 6));
                break;
            case 17:
                org.telegram.messenger.g0.h3(new cl(23, (rz) this.b, (Pair) this.c));
                break;
            case 18:
                org.telegram.messenger.g0.h3(new o4.b1((rz) this.b, tL_error, tLObject, (u10) this.c, 27));
                break;
            case 19:
                org.telegram.messenger.g0.h3(new o4.b1((d20) this.b, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.c, 29));
                break;
            case 20:
                org.telegram.messenger.g0.h3(new v60((m70) this.b, (TLRPC.TL_chatInviteExported) this.c, tL_error, tLObject));
                break;
            case 21:
                org.telegram.messenger.g0.h3(new e7((se0) this.b, (re0) this.c, tLObject, 20));
                break;
            case 22:
                org.telegram.messenger.g0.h3(new j50((oo0) this.b, tLObject, (Context) this.c, 17));
                break;
            case 23:
                org.telegram.messenger.g0.h3(new v60((xv0) this.b, tL_error, tLObject, (li) this.c, 7));
                break;
            case 24:
                org.telegram.messenger.g0.h3(new v60((go0) this.b, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) this.c, 8));
                break;
            case 25:
                org.telegram.messenger.g0.h3(new v60(this.b, this.c, (Object) tLObject, tL_error, 9));
                break;
            case 26:
                org.telegram.messenger.g0.h3(new v60((f21) this.b, tL_error, tLObject, (TLRPC.TL_textWithEntities) this.c, 11));
                break;
            case 27:
                org.telegram.messenger.g0.h3(new pp((fx) this.b, tLObject, (zi) this.c, 4));
                break;
            case 28:
                org.telegram.messenger.g0.h3(new p11(25, (zx) this.b, (s1) this.c));
                break;
            default:
                org.telegram.messenger.g0.h3(new p11(29, (ez) this.b, (s1) this.c));
                break;
        }
    }

    public /* synthetic */ h6(Object obj, j6 j6Var, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = j6Var;
    }
}
