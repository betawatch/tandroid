package bi;

import android.content.Context;
import android.content.SharedPreferences;
import fi.o9;
import hi.k9;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.w10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.ao0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new aa.r((f2) this.b, (String) this.c, tLObject, 8));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new aa.r((fq0) this.b, tL_error, (org.telegram.ui.ActionBar.g2) this.c, 11));
                break;
            case 2:
                org.telegram.messenger.g0.g3(new aa.r((a8) this.b, tLObject, (TL_stars.getResaleStarGifts) this.c, 14));
                break;
            case 3:
                org.telegram.messenger.g0.g3(new aa.r((di.t) this.b, tLObject, (Context) this.c, 18));
                break;
            case 4:
                org.telegram.messenger.g0.g3(new ai.j((di.s) this.b, tLObject, (String) this.c, tL_error, 8));
                break;
            case 5:
                di.f6 f6Var = (di.f6) this.b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.c;
                if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    mp.u1(f6Var.a).f4(tL_payments_uniqueStarGift.users, false);
                    mp.u1(f6Var.a).Z3(tL_payments_uniqueStarGift.chats, false);
                    if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        org.telegram.messenger.g0.g3(new di.f2(9, f6Var, tL_payments_uniqueStarGift));
                        break;
                    }
                }
                org.telegram.messenger.g0.g3(new di.f2(10, t1Var, tL_error));
                break;
            case 6:
                org.telegram.messenger.g0.g3(new ai.j((di.f6) this.b, tLObject, (aa.r) this.c, tL_error, 12));
                break;
            case 7:
                di.f6 f6Var2 = (di.f6) this.b;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    mp.u1(f6Var2.a).f4(updates.users, false);
                    mp.u1(f6Var2.a).Z3(updates.chats, false);
                }
                org.telegram.messenger.g0.g3(new ai.j(f6Var2, tL_error, tLObject, inputSavedStarGift, 14));
                break;
            case 8:
                org.telegram.messenger.g0.g3(new aa.r((Object) tLObject, this.b, (String) this.c, 27));
                break;
            case 9:
                org.telegram.messenger.g0.g3(new aa.r((di.y8) this.b, tLObject, tL_error, (w10) this.c, 28));
                break;
            case 10:
                org.telegram.messenger.g0.g3(new aa.r((di.y8) this.b, tLObject, (Runnable) this.c, 29));
                break;
            case 11:
                fi.r3 r3Var = (fi.r3) this.b;
                k9 k9Var = (k9) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    mp.u1(r3Var.x.m2).V3((TLRPC.Updates) tLObject, false);
                }
                org.telegram.messenger.g0.g3(new fi.o3(k9Var, 0));
                break;
            case 12:
                org.telegram.messenger.g0.g3(new di.a8((fi.a6) this.b, tLObject, (Runnable) this.c, 7));
                break;
            case 13:
                org.telegram.messenger.g0.g3(new ai.j((fi.d6) this.b, tLObject, (w10) this.c, tL_error, 18));
                break;
            case 14:
                org.telegram.messenger.g0.g3(new di.a8((o9) this.b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.c, 9));
                break;
            case 15:
                org.telegram.messenger.g0.g3(new di.a8((hi.f2) this.b, (String) this.c, tLObject, 12));
                break;
            case 16:
                org.telegram.messenger.g0.g3(new di.a8((hi.l3) this.b, tLObject, (mp) this.c, 15));
                break;
            case 17:
                org.telegram.messenger.g0.g3(new di.a8((hi.f9) this.b, tLObject, (mp) this.c, 19));
                break;
            case 18:
                org.telegram.messenger.g0.g3(new di.a8((jg.h1) this.b, (String) this.c, tLObject, 24));
                break;
            case 19:
                jg.a2 a2Var = (jg.a2) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    org.telegram.messenger.g0.g3(new di.a8(a2Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 27));
                    break;
                }
                break;
            case 20:
                org.telegram.messenger.g0.g3(new kg.x((kg.z) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, 0));
                break;
            case 21:
                org.telegram.messenger.g0.g3(new ji.f(4, (kg.k0) this.b, (ao0) this.c));
                break;
            case 22:
                org.telegram.messenger.g0.g3(new kg.x((kg.z1) this.b, tLObject, (SharedPreferences) this.c, 5));
                break;
            case 23:
                org.telegram.messenger.g0.g3(new ai.j(tLObject, (ArrayList) this.b, (String) this.c, tL_error, 25));
                break;
            case 24:
                org.telegram.messenger.g0.g3(new kg.x((boolean[]) this.b, tLObject, (x3) this.c, 7));
                break;
            case 25:
                org.telegram.messenger.g0.g3(new kg.x((ki.i3) this.b, tLObject, (org.telegram.ui.ActionBar.t1) this.c, 10));
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
