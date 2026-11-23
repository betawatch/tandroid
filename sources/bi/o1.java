package bi;

import android.content.Context;
import android.content.SharedPreferences;
import fi.o9;
import org.telegram.messenger.np;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.y10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.jw0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                org.telegram.messenger.g0.g3(new aa.r((e2) this.b, (String) this.c, tLObject, 8));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new aa.r((gq0) this.b, tL_error, (org.telegram.ui.ActionBar.g2) this.c, 11));
                break;
            case 2:
                org.telegram.messenger.g0.g3(new aa.r((x7) this.b, tLObject, (TL_stars.getResaleStarGifts) this.c, 14));
                break;
            case 3:
                org.telegram.messenger.g0.g3(new aa.r((di.t) this.b, tLObject, (Context) this.c, 18));
                break;
            case 4:
                org.telegram.messenger.g0.g3(new ai.r(this.b, (Object) tLObject, (String) this.c, (Object) tL_error, 7));
                break;
            case 5:
                di.f6 f6Var = (di.f6) this.b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.c;
                if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    np.u1(f6Var.a).f4(tL_payments_uniqueStarGift.users, false);
                    np.u1(f6Var.a).Z3(tL_payments_uniqueStarGift.chats, false);
                    if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        org.telegram.messenger.g0.g3(new di.f2(9, f6Var, tL_payments_uniqueStarGift));
                        break;
                    }
                }
                org.telegram.messenger.g0.g3(new di.f2(10, t1Var, tL_error));
                break;
            case 6:
                org.telegram.messenger.g0.g3(new ai.r((di.f6) this.b, tLObject, (aa.r) this.c, tL_error, 11));
                break;
            case 7:
                di.f6 f6Var2 = (di.f6) this.b;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    np.u1(f6Var2.a).f4(updates.users, false);
                    np.u1(f6Var2.a).Z3(updates.chats, false);
                }
                org.telegram.messenger.g0.g3(new ai.r(f6Var2, tL_error, tLObject, inputSavedStarGift, 13));
                break;
            case 8:
                org.telegram.messenger.g0.g3(new aa.r((Object) tLObject, this.b, (String) this.c, 27));
                break;
            case 9:
                org.telegram.messenger.g0.g3(new aa.r((di.y8) this.b, tLObject, tL_error, (y10) this.c, 28));
                break;
            case 10:
                org.telegram.messenger.g0.g3(new aa.r((di.y8) this.b, tLObject, (Runnable) this.c, 29));
                break;
            case 11:
                fi.r3 r3Var = (fi.r3) this.b;
                hi.p8 p8Var = (hi.p8) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    np.u1(r3Var.x.m2).V3((TLRPC.Updates) tLObject, false);
                }
                org.telegram.messenger.g0.g3(new fi.o3(p8Var, 0));
                break;
            case 12:
                org.telegram.messenger.g0.g3(new di.a8((fi.a6) this.b, tLObject, (Runnable) this.c, 7));
                break;
            case 13:
                org.telegram.messenger.g0.g3(new ai.r((fi.d6) this.b, tLObject, (y10) this.c, tL_error, 17));
                break;
            case 14:
                org.telegram.messenger.g0.g3(new di.a8((o9) this.b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.c, 9));
                break;
            case 15:
                org.telegram.messenger.g0.g3(new di.a8((hi.x1) this.b, (String) this.c, tLObject, 12));
                break;
            case 16:
                org.telegram.messenger.g0.g3(new di.a8((hi.c3) this.b, tLObject, (np) this.c, 15));
                break;
            case 17:
                org.telegram.messenger.g0.g3(new di.a8((hi.k8) this.b, tLObject, (np) this.c, 18));
                break;
            case 18:
                org.telegram.messenger.g0.g3(new di.a8((jg.h1) this.b, (String) this.c, tLObject, 23));
                break;
            case 19:
                jg.a2 a2Var = (jg.a2) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    org.telegram.messenger.g0.g3(new di.a8(a2Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 26));
                    break;
                }
                break;
            case 20:
                org.telegram.messenger.g0.g3(new di.a8((kg.z) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, 29));
                break;
            case 21:
                org.telegram.messenger.g0.g3(new ji.i(2, (kg.k0) this.b, (jw0) this.c));
                break;
            case 22:
                org.telegram.messenger.g0.g3(new kg.y((kg.z1) this.b, tLObject, (SharedPreferences) this.c, 4));
                break;
            case 23:
                org.telegram.messenger.g0.g3(new ai.r((Object) tLObject, this.b, (String) this.c, (Object) tL_error, 24));
                break;
            case 24:
                org.telegram.messenger.g0.g3(new kg.y((boolean[]) this.b, tLObject, (v3) this.c, 6));
                break;
            case 25:
                org.telegram.messenger.g0.g3(new kg.y((ki.h3) this.b, tLObject, (org.telegram.ui.ActionBar.t1) this.c, 9));
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
