package ai;

import ci.e9;
import ci.s8;
import ci.v8;
import ei.p7;
import gi.f7;
import gi.r8;
import java.util.HashMap;
import org.telegram.messenger.hp;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ey0;
import org.telegram.ui.fb;
import org.telegram.ui.go0;
import org.telegram.ui.hj0;
import org.telegram.ui.ip;
import org.telegram.ui.kb;
import org.telegram.ui.lq;
import org.telegram.ui.pj0;
import org.telegram.ui.qo;
import org.telegram.ui.sg0;
import org.telegram.ui.xd0;
import org.telegram.ui.xg;
import org.telegram.ui.yj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q1(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite;
        int i3 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i3) {
            case 0:
                org.telegram.messenger.g0.h3(new w1((b3) obj4, (org.telegram.ui.ActionBar.s1) obj3, tLObject, (p1) obj2, (u10) obj, tL_error, 0));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new w1((ci.l6) obj4, tLObject, (xg.e1[]) obj3, (Long) obj2, (k3) obj, tL_error, 1, false));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new w1((ci.l6) obj4, tLObject, (CharSequence) obj3, (TL_stars.TL_starGiftUnique) obj2, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj, tL_error, 2, false));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new w1((e9) obj4, tLObject, (zi) obj3, (TLRPC.TL_inputInvoiceMessage) obj2, (xg) obj, tL_error, 5, false));
                break;
            case 4:
                org.telegram.messenger.g0.h3(new t6(obj4, obj3, tLObject, obj2, obj, 7));
                break;
            case 5:
                s8 s8Var = (s8) obj4;
                s8Var.getClass();
                org.telegram.messenger.g0.h3(new w1(s8Var, tLObject, (TL_stars.TL_starGiftCollection) obj3, (v8) obj2, (u10) obj, tL_error, 7, false));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new t6((ei.j4) obj4, (Runnable) obj3, tL_error, (TL_stories.StoryItem) obj2, (r8) obj));
                break;
            case 7:
                f7 f7Var = (f7) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                ci.d0 d0Var = (ci.d0) obj;
                if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text) && storyItem != null) {
                    org.telegram.messenger.r8.n(f7Var.a).u(new Object[]{tL_messages_getAttachedStickers, d0Var}, storyItem);
                    break;
                } else {
                    d0Var.run(tLObject, tL_error);
                    break;
                }
            case 8:
                org.telegram.messenger.g0.h3(new w1((kg.w0) obj4, (String) obj3, tL_error, tLObject, (hp) obj2, (qr) obj));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new t6(obj4, obj3, tLObject, obj2, obj, 15));
                break;
            case 10:
                fb fbVar = (fb) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj2;
                boolean[] zArr = (boolean[]) obj;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj3;
                kb kbVar = fbVar.a.n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i10 = 0; i10 < tL_messages_exportedChatInvite.users.size(); i10++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i10);
                        if (kbVar.A0 == null) {
                            kbVar.A0 = new HashMap();
                        }
                        kbVar.A0.put(Long.valueOf(user.id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                org.telegram.messenger.g0.h3(new t6((Object) fbVar, (Object) tL_chatInviteExported, (Object) tL_messages_exportedChatInvite, (Object) zArr, (Object) s1Var, 23));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new o4.b1((qo) obj4, (org.telegram.ui.ActionBar.s1[]) obj3, (TLRPC.Chat) obj2, (org.telegram.ui.ActionBar.d2) obj, 16));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new t6((ip) obj4, tL_error, (TLRPC.InputCheckPasswordSRP) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj));
                break;
            case 13:
                go0 go0Var = (go0) obj4;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers2 = (TLRPC.TL_messages_getAttachedStickers) obj2;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text) && obj3 != null) {
                    org.telegram.messenger.r8.n(go0Var.a).u(new Object[]{tL_messages_getAttachedStickers2, h6Var}, obj3);
                    break;
                } else {
                    h6Var.run(tLObject, tL_error);
                    break;
                }
            case 14:
                org.telegram.messenger.g0.h3(new lq((xd0) obj4, tL_error, (String) obj3, (String) obj2, (String) obj, 14));
                break;
            case 15:
                org.telegram.messenger.g0.h3(new w1((yj0) obj4, tL_error, (String) obj3, (pj0) obj2, tLObject, (TL_account.sendVerifyPhoneCode) obj));
                break;
            case 16:
                org.telegram.messenger.g0.h3(new lq((hj0) obj4, tL_error, (sg0) obj3, (m2.t) obj2, (TL_account.verifyEmail) obj, 21));
                break;
            case 17:
                org.telegram.messenger.g0.h3(new lq((PrivacyControlActivity) obj4, tL_error, (boolean[]) obj3, (TLRPC.GlobalPrivacySettings) obj2, (TL_account.setGlobalPrivacySettings) obj, 25));
                break;
            case 18:
                ey0 ey0Var = (ey0) obj4;
                ey0Var.getClass();
                org.telegram.messenger.g0.h3(new w1(ey0Var, tLObject, (CharSequence) obj3, tL_error, (byte[]) obj2, (String) obj));
                break;
            case 19:
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.y((org.telegram.ui.web.w0) obj4, tLObject, (p7) obj3, (String) obj2, (String) obj));
                break;
            default:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) obj4;
                w0Var.getClass();
                org.telegram.messenger.g0.h3(new w1(w0Var, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj3, (String) obj2, tL_error, (String) obj));
                break;
        }
    }

    public /* synthetic */ q1(fb fbVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, boolean[] zArr, org.telegram.ui.ActionBar.s1 s1Var) {
        this.a = 10;
        this.b = fbVar;
        this.d = tL_chatInviteExported;
        this.e = zArr;
        this.c = s1Var;
    }
}
