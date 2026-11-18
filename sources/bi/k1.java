package bi;

import android.content.Context;
import android.content.SharedPreferences;
import di.ga;
import fi.o9;
import org.telegram.messenger.mp;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.jw0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new aa.r((a2) this.b, (String) this.c, tLObject, 7));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new aa.r((eq0) this.b, tL_error, (org.telegram.ui.ActionBar.h2) this.c, 10));
                break;
            case 2:
                org.telegram.messenger.g0.g3(new aa.r((u7) this.b, tLObject, (TL_stars.getResaleStarGifts) this.c, 13));
                break;
            case 3:
                org.telegram.messenger.g0.g3(new aa.r((di.t) this.b, tLObject, (Context) this.c, 17));
                break;
            case 4:
                org.telegram.messenger.g0.g3(new ai.s(this.b, (Object) tLObject, (String) this.c, (Object) tL_error, 7));
                break;
            case 5:
                di.f6 f6Var = (di.f6) this.b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.c;
                if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    mp.u1(f6Var.a).f4(tL_payments_uniqueStarGift.users, false);
                    mp.u1(f6Var.a).Z3(tL_payments_uniqueStarGift.chats, false);
                    if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        org.telegram.messenger.g0.g3(new di.w2(7, f6Var, tL_payments_uniqueStarGift));
                        break;
                    }
                }
                org.telegram.messenger.g0.g3(new di.w2(8, u1Var, tL_error));
                break;
            case 6:
                org.telegram.messenger.g0.g3(new ai.s((di.f6) this.b, tLObject, (aa.r) this.c, tL_error, 11));
                break;
            case 7:
                di.f6 f6Var2 = (di.f6) this.b;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    mp.u1(f6Var2.a).f4(updates.users, false);
                    mp.u1(f6Var2.a).Z3(updates.chats, false);
                }
                org.telegram.messenger.g0.g3(new ai.s(f6Var2, tL_error, tLObject, inputSavedStarGift, 13));
                break;
            case 8:
                org.telegram.messenger.g0.g3(new aa.r((Object) tLObject, this.b, (String) this.c, 26));
                break;
            case 9:
                org.telegram.messenger.g0.g3(new aa.r((di.x8) this.b, tLObject, tL_error, (x10) this.c, 27));
                break;
            case 10:
                org.telegram.messenger.g0.g3(new aa.r((di.x8) this.b, tLObject, (Runnable) this.c, 28));
                break;
            case 11:
                fi.r3 r3Var = (fi.r3) this.b;
                hi.q8 q8Var = (hi.q8) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    mp.u1(r3Var.x.m2).V3((TLRPC.Updates) tLObject, false);
                }
                org.telegram.messenger.g0.g3(new fi.o3(q8Var, 0));
                break;
            case 12:
                org.telegram.messenger.g0.g3(new ga((fi.z5) this.b, tLObject, (Runnable) this.c, 6));
                break;
            case 13:
                org.telegram.messenger.g0.g3(new ai.s((fi.d6) this.b, tLObject, (x10) this.c, tL_error, 17));
                break;
            case 14:
                org.telegram.messenger.g0.g3(new ga((o9) this.b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.c, 8));
                break;
            case 15:
                org.telegram.messenger.g0.g3(new ga((hi.y1) this.b, (String) this.c, tLObject, 11));
                break;
            case 16:
                org.telegram.messenger.g0.g3(new ga((hi.d3) this.b, tLObject, (mp) this.c, 14));
                break;
            case 17:
                org.telegram.messenger.g0.g3(new ga((hi.l8) this.b, tLObject, (mp) this.c, 17));
                break;
            case 18:
                org.telegram.messenger.g0.g3(new ga((jg.h1) this.b, (String) this.c, tLObject, 22));
                break;
            case 19:
                jg.a2 a2Var = (jg.a2) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    org.telegram.messenger.g0.g3(new ga(a2Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 25));
                    break;
                }
                break;
            case 20:
                org.telegram.messenger.g0.g3(new ga((kg.y) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, 28));
                break;
            case 21:
                org.telegram.messenger.g0.g3(new kg.h0(0, (kg.l0) this.b, (jw0) this.c));
                break;
            case 22:
                org.telegram.messenger.g0.g3(new kg.i0((kg.z1) this.b, tLObject, (SharedPreferences) this.c, 3));
                break;
            case 23:
                org.telegram.messenger.g0.g3(new ai.s((Object) tLObject, this.b, (String) this.c, (Object) tL_error, 24));
                break;
            case 24:
                org.telegram.messenger.g0.g3(new kg.i0((boolean[]) this.b, tLObject, (r3) this.c, 5));
                break;
            case 25:
                org.telegram.messenger.g0.g3(new kg.i0((ki.i3) this.b, tLObject, (org.telegram.ui.ActionBar.u1) this.c, 8));
                break;
            case 26:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.b, (Runnable) this.c, tLObject, tL_error);
                break;
            case 27:
                ((VoIPService) this.b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.c, tLObject, tL_error);
                break;
            case 28:
                ((VoIPService) this.b).lambda$startOutgoingCall$10((byte[]) this.c, tLObject, tL_error);
                break;
            default:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$32((org.telegram.messenger.c) this.c, tLObject, tL_error);
                break;
        }
    }
}
