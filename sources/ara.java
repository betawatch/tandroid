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
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ara implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ara(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0208  */
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
        byte b2 = 4;
        byte b3 = 22;
        byte b4 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                gm.c3(new hw9(tLObject, (e) obj2, (String) obj, b3));
                break;
            case 1:
                gm.c3(new uh1((jva) obj2, tLObject, tL_error, (qac) obj));
                break;
            case 2:
                gm.c3(new hw9(obj2, (Object) tLObject, obj, (byte) 23));
                break;
            case 3:
                jza jzaVar = (jza) obj2;
                iac iacVar = (iac) obj;
                byte b5 = jzaVar.i;
                String str4 = null;
                if (tL_error == null) {
                    if (tLObject instanceof TL_stats.TL_statsGraph) {
                        try {
                            nl1 f0 = xza.f0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), b5, jzaVar.m);
                            try {
                                str4 = ((TL_stats.TL_statsGraph) tLObject).zoom_token;
                                if (b5 == 4 && (jArr = f0.a) != null && jArr.length > 0) {
                                    long j = jArr[jArr.length - 1];
                                    jzaVar.e = new moa(f0, j);
                                    jzaVar.c = j;
                                }
                                str3 = str4;
                                str4 = f0;
                            } catch (JSONException e) {
                                jSONException = e;
                                str3 = str4;
                                str4 = f0;
                                jSONException.printStackTrace();
                                if (tLObject instanceof TL_stats.TL_statsGraphError) {
                                }
                                str = str4;
                                str2 = str3;
                                gm.c3(new hza((Object) jzaVar, (Object) str, (Object) str2, (Object) iacVar, (byte) 1));
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
                        jzaVar.l = false;
                        jzaVar.a = true;
                        jzaVar.b = ((TL_stats.TL_statsGraphError) tLObject).error;
                    }
                    str = str4;
                    str2 = str3;
                } else {
                    str = null;
                    str2 = null;
                }
                gm.c3(new hza((Object) jzaVar, (Object) str, (Object) str2, (Object) iacVar, (byte) 1));
                break;
            case 4:
                gm.c3(new hza(obj2, (Object) tLObject, obj, (Object) tL_error, (byte) 3));
                break;
            case 5:
                gm.c3(new hza(obj2, (Object) tL_error, (Object) tLObject, obj, (byte) 4));
                break;
            case 6:
                gm.c3(new hza(obj2, (Object) tL_error, (Object) tLObject, obj, (byte) 5));
                break;
            case 7:
                d3b d3bVar = (d3b) obj2;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) obj;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    gm.c3(new j2b(d3bVar, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, b4));
                    break;
                }
                break;
            case 8:
                gm.c3(new j2b((t3b) obj2, tLObject, (Runnable) obj, b2));
                break;
            case 9:
                gm.c3(new hza(obj2, (Object) tLObject, obj, (Object) tL_error, (byte) 6));
                break;
            case 10:
                gm.c3(new j2b((v7b) obj2, tLObject, (oc7) obj, (byte) 8));
                break;
            case 11:
                gm.c3(new hza(obj2, obj, (Object) tLObject, (Object) tL_error, (byte) 9));
                break;
            case 12:
                gm.c3(new j2b((bmb) obj2, tLObject, (bmb) obj, (byte) 14));
                break;
            case 13:
                gm.c3(new j2b((zob) obj2, (String) obj, tL_error, (byte) 16));
                break;
            case 14:
                zob zobVar = (zob) obj2;
                TL_account.updateTheme updatetheme = (TL_account.updateTheme) obj;
                zobVar.getClass();
                if (!(tLObject instanceof TLRPC.TL_theme)) {
                    gm.c3(new j2b(zobVar, tL_error, updatetheme, (byte) 15));
                    break;
                } else {
                    gm.c3(new b7b((Object) zobVar, tLObject, (byte) 12));
                    break;
                }
            case 15:
                gm.c3(new j2b((xqb) obj2, tLObject, (SharedPreferences) obj, (byte) 18));
                break;
            case 16:
                gm.c3(new j2b((nxb) obj2, (String) obj, tLObject, b3));
                break;
            case 17:
                gm.c3(new hza(obj2, (Object) tL_error, (Object) tLObject, obj, (byte) 14));
                break;
            case 18:
                gm.c3(new hza(obj2, (Object) tLObject, obj, (Object) tL_error, (byte) 18));
                break;
            case 19:
                p5c p5cVar = (p5c) obj2;
                byte[] bArr = (byte[]) obj;
                if (tL_error != null) {
                    gm.c3(new l5c(p5cVar, tL_error, (byte) 3));
                    break;
                } else {
                    gm.c3(new j5c(p5cVar, bArr, b4));
                    break;
                }
            case 20:
                gm.d3(new hza(obj2, (String) obj, (Object) tL_error, (Object) tLObject, (byte) 21), 2L);
                break;
            case 21:
                gm.c3(new gcc((ihc) obj2, tLObject, (TL_stories.TL_stories_getStoriesViews) obj, (byte) 6));
                break;
            case 22:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) obj2, (Runnable) obj, tLObject, tL_error);
                break;
            case 23:
                ((VoIPService) obj2).lambda$startGroupCheckShortpoll$67((TL_phone.checkGroupCall) obj, tLObject, tL_error);
                break;
            case 24:
                ((VoIPService) obj2).lambda$startOutgoingCall$10((byte[]) obj, tLObject, tL_error);
                break;
            case 25:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$35((j5) obj, tLObject, tL_error);
                break;
            case 26:
                gm.c3(new tpc((zsc) obj2, tLObject, (ysc) obj, tL_error, (byte) 5));
                break;
            default:
                gm.c3(new qhc(obj2, obj, (byte) 28));
                break;
        }
    }
}
