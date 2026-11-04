package ai;

import android.widget.TextView;
import ci.e9;
import gi.o8;
import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bx;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.v60;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.xx;
import org.telegram.ui.lq;
import org.telegram.ui.xt0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r6 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r6(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0367  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        zi ziVar;
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new t6(this.b, (Object) tLObject, this.c, (Object) tL_error, this.d, 0));
                break;
            case 1:
                ci.l6 l6Var = (ci.l6) this.b;
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) this.c;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.d;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    hp.s1(l6Var.a).Y3(messages_messages.users, false);
                    hp.s1(l6Var.a).S3(messages_messages.chats, false);
                    for (int i3 = 0; i3 < messages_messages.messages.size(); i3++) {
                        TLRPC.Message message = messages_messages.messages.get(i3);
                        if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.id == tL_messageActionStarGift.upgrade_msg_id) {
                            ziVar = new zi(l6Var.a, message, false, false);
                            ziVar.M5();
                            if (ziVar == null) {
                                org.telegram.messenger.g0.h3(new k3(l6Var, s1Var, ziVar, 17));
                                break;
                            } else {
                                org.telegram.messenger.g0.h3(new ci.b4(s1Var, 0));
                                break;
                            }
                        }
                    }
                }
                ziVar = null;
                if (ziVar == null) {
                }
                break;
            case 2:
                ci.l6 l6Var2 = (ci.l6) this.b;
                sf.b bVar = (sf.b) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                if (tLObject instanceof TLRPC.Updates) {
                    hp.s1(l6Var2.a).O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(new k3(l6Var2, bVar, tL_starGiftUnique, 12));
                    break;
                } else if (tL_error == null || !tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                    if (tL_error != null) {
                        org.telegram.messenger.g0.h3(new k3((Object) l6Var2, (Object) bVar, tL_error, 13));
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.h3(new r1(l6Var2, bVar, Long.parseLong(tL_error.text.substring(26)), 2));
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.g0.h3(new t6((e9) this.b, tL_error, (n10) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 5));
                break;
            case 4:
                org.telegram.messenger.g0.h3(new t6((e9) this.b, tL_error, (n10) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 8));
                break;
            case 5:
                org.telegram.messenger.g0.h3(new t6((e9) this.b, tL_error, (n10) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 2));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new z3((ei.b4) this.b, tLObject, (TL_stories.StoryItem) this.c, (u10) this.d, 12));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new t6((o8) this.b, (org.telegram.ui.ActionBar.s1) this.c, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.d, tL_error));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new z3((gi.d) this.b, tLObject, (org.telegram.ui.ActionBar.t2) this.c, (ii.p1) this.d, 18));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new z3(tLObject, (boolean[]) this.b, (org.telegram.ui.web.p) this.c, (TLRPC.UserFull) this.d, 21));
                break;
            case 10:
                org.telegram.messenger.g0.h3(new z3((lg.z) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, (Runnable) this.d, 22));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new lg.y((lg.j0) this.b, (TL_account.TL_connectedBot) this.c, (TL_account.TL_businessBotRecipients) this.d, 1));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new t6(this.b, (Object) tLObject, this.c, this.d, tL_error, 17));
                break;
            case 13:
                org.telegram.messenger.g0.h3(new o4.b1(tLObject, (org.telegram.ui.ActionBar.g6) this.b, (org.telegram.ui.ActionBar.j6) this.c, (TLRPC.TL_theme) this.d, 4));
                break;
            case 14:
                org.telegram.messenger.g0.h3(new o4.b1((bx) this.b, (org.telegram.ui.ActionBar.s1[]) this.c, tLObject, (hi.d) this.d, 25));
                break;
            case 15:
                org.telegram.messenger.g0.h3(new o4.b1((xx) this.b, (TLRPC.TL_messages_getStickers) this.c, tLObject, (Runnable) this.d, 26));
                break;
            case 16:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.e7((rz) this.b, (org.telegram.ui.ActionBar.d2) this.c, (ArrayList) this.d, 10));
                break;
            case 17:
                org.telegram.messenger.g0.h3(new v60(tL_error, (gi.d) this.b, (org.telegram.ui.q6) this.c, (Runnable) this.d));
                break;
            case 18:
                org.telegram.messenger.g0.h3(new lq((xv0) this.b, (String) this.c, tL_error, tLObject, (TextView) this.d, 2));
                break;
            case 19:
                org.telegram.messenger.g0.h3(new lq((iw0) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 3));
                break;
            case 20:
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.y((org.telegram.ui.web.w0) this.b, tL_error, (String) this.c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                break;
            case 21:
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.y((org.telegram.ui.web.w0) this.b, tLObject, (String[]) this.c, tL_error, (org.telegram.ui.ActionBar.s1) this.d));
                break;
            case 22:
                org.telegram.messenger.g0.h3(new xt0(tL_error, (u10) this.b, tLObject, (hp) this.c, (u10) this.d, 11));
                break;
            case 23:
                org.telegram.messenger.g0.h3(new xt0(tLObject, (hp) this.b, (v1) this.c, (xg.g) this.d, tL_error));
                break;
            case 24:
                xg.v vVar = (xg.v) this.b;
                hp hpVar = (hp) this.c;
                xg.y yVar = (xg.y) this.d;
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new u9.a(24, vVar, tL_error));
                    break;
                } else if (tLObject != null) {
                    hpVar.O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(new xf.c(yVar, 2));
                    break;
                }
                break;
            case 25:
                org.telegram.messenger.g0.h3(new xt0(tL_error, (u10) this.b, tLObject, (hp) this.c, (u10) this.d, 10));
                break;
            default:
                org.telegram.messenger.g0.h3(new xt0((xg.e1) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 13));
                break;
        }
    }
}
