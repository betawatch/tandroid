// default package

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class isa implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ isa(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0214  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        String str2;
        String str3;
        JSONException jSONException;
        long[] jArr;
        byte b = this.a;
        byte b2 = 7;
        byte b3 = 28;
        byte b4 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                wua wuaVar = (wua) obj2;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    uc7.s1(wuaVar.a).j4(updates.users, false);
                    uc7.s1(wuaVar.a).c4(updates.chats, false);
                }
                hl.c3(new vp8((Object) wuaVar, (Object) tL_error, (Object) tLObject, (Object) inputSavedStarGift, (byte) 29));
                break;
            case 1:
                hl.c3(new jr9(tLObject, (f) obj2, (String) obj, b3));
                break;
            case 2:
                hl.c3(new jr9(obj2, (Object) tLObject, obj, (byte) 29));
                break;
            case 3:
                hl.c3(new vg1((jxa) obj2, tLObject, tL_error, (pcc) obj));
                break;
            case 4:
                i1b i1bVar = (i1b) obj2;
                hcc hccVar = (hcc) obj;
                byte b5 = i1bVar.i;
                String str4 = null;
                if (tL_error == null) {
                    if (tLObject instanceof TL_stats.TL_statsGraph) {
                        try {
                            ok1 e0 = w1b.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), b5, i1bVar.m);
                            try {
                                str4 = ((TL_stats.TL_statsGraph) tLObject).zoom_token;
                                if (b5 == 4 && (jArr = e0.a) != null && jArr.length > 0) {
                                    long j = jArr[jArr.length - 1];
                                    i1bVar.e = new iqa(e0, j);
                                    i1bVar.c = j;
                                }
                                str3 = str4;
                                str4 = e0;
                            } catch (JSONException e) {
                                jSONException = e;
                                str3 = str4;
                                str4 = e0;
                                jSONException.printStackTrace();
                                if (tLObject instanceof TL_stats.TL_statsGraphError) {
                                }
                                str = str4;
                                str2 = str3;
                                hl.c3(new kta((Object) i1bVar, (Object) str, (Object) str2, (Object) hccVar, (byte) 2));
                                return;
                            }
                        } catch (JSONException e2) {
                            jSONException = e2;
                            str3 = null;
                        }
                    } else {
                        str3 = null;
                    }
                    if (tLObject instanceof TL_stats.TL_statsGraphError) {
                        i1bVar.l = false;
                        i1bVar.a = true;
                        i1bVar.b = ((TL_stats.TL_statsGraphError) tLObject).error;
                    }
                    str = str4;
                    str2 = str3;
                } else {
                    str = null;
                    str2 = null;
                }
                hl.c3(new kta((Object) i1bVar, (Object) str, (Object) str2, (Object) hccVar, (byte) 2));
                break;
            case 5:
                hl.c3(new kta(obj2, (Object) tLObject, obj, (Object) tL_error, (byte) 3));
                break;
            case 6:
                hl.c3(new kta(obj2, (Object) tL_error, (Object) tLObject, obj, (byte) 6));
                break;
            case 7:
                hl.c3(new kta(obj2, (Object) tL_error, (Object) tLObject, obj, (byte) 5));
                break;
            case 8:
                y4b y4bVar = (y4b) obj2;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) obj;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    hl.c3(new pwa(y4bVar, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, b2));
                    break;
                }
                break;
            case 9:
                hl.c3(new pwa((o5b) obj2, tLObject, (Runnable) obj, (byte) 9));
                break;
            case 10:
                hl.c3(new kta(obj2, (Object) tLObject, obj, (Object) tL_error, (byte) 7));
                break;
            case 11:
                hl.c3(new pwa((r9b) obj2, tLObject, (uc7) obj, (byte) 14));
                break;
            case 12:
                hl.c3(new kta(obj2, obj, (Object) tLObject, (Object) tL_error, (byte) 10));
                break;
            case 13:
                hl.c3(new pwa((znb) obj2, tLObject, (znb) obj, (byte) 20));
                break;
            case 14:
                hl.c3(new pwa((xqb) obj2, (String) obj, tL_error, (byte) 22));
                break;
            case 15:
                xqb xqbVar = (xqb) obj2;
                TL_account.updateTheme updatetheme = (TL_account.updateTheme) obj;
                xqbVar.getClass();
                if (!(tLObject instanceof TLRPC.TL_theme)) {
                    hl.c3(new pwa(xqbVar, tL_error, updatetheme, (byte) 21));
                    break;
                } else {
                    hl.c3(new bcb(xqbVar, (TLRPC.TL_theme) tLObject, b2));
                    break;
                }
            case 16:
                hl.c3(new pwa((wsb) obj2, tLObject, (SharedPreferences) obj, (byte) 24));
                break;
            case 17:
                hl.c3(new pwa((ozb) obj2, (String) obj, tLObject, b3));
                break;
            case 18:
                hl.c3(new kta(obj2, (Object) tL_error, (Object) tLObject, obj, (byte) 15));
                break;
            case 19:
                hl.c3(new kta(obj2, (Object) tLObject, obj, (Object) tL_error, (byte) 19));
                break;
            case 20:
                o7c o7cVar = (o7c) obj2;
                byte[] bArr = (byte[]) obj;
                if (tL_error != null) {
                    hl.c3(new k7c(o7cVar, tL_error, (byte) 3));
                    break;
                } else {
                    hl.c3(new i7c(o7cVar, bArr, b4));
                    break;
                }
            case 21:
                hl.d3(new kta(obj2, obj, (Object) tL_error, (Object) tLObject, (byte) 22), 2L);
                break;
            case 22:
                hl.c3(new b6c((hjc) obj2, tLObject, (TL_stories.TL_stories_getStoriesViews) obj));
                break;
            case 23:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) obj2, (Runnable) obj, tLObject, tL_error);
                break;
            case 24:
                ((VoIPService) obj2).lambda$startGroupCheckShortpoll$67((TL_phone.checkGroupCall) obj, tLObject, tL_error);
                break;
            case 25:
                ((VoIPService) obj2).lambda$startOutgoingCall$10((byte[]) obj, tLObject, tL_error);
                break;
            case 26:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$35((k5) obj, tLObject, tL_error);
                break;
            case 27:
                hl.c3(new ipc((lvc) obj2, tLObject, (kvc) obj, tL_error, (byte) 6));
                break;
            default:
                hl.c3(new vlc((wvc) obj2, (int[]) obj, (byte) 25));
                break;
        }
    }
}
