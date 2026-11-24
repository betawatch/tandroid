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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class apa implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ apa(Object obj, Object obj2, byte b) {
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
        byte b2 = 3;
        byte b3 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                gl.c3(new q3a(tLObject, (e) obj2, (String) obj));
                break;
            case 1:
                gl.c3(new mg1((gta) obj2, tLObject, tL_error, (p8c) obj));
                break;
            case 2:
                gl.c3(new q3a(obj2, (Object) tLObject, obj, (byte) 20));
                break;
            case 3:
                gxa gxaVar = (gxa) obj2;
                h8c h8cVar = (h8c) obj;
                byte b4 = gxaVar.i;
                String str4 = null;
                if (tL_error == null) {
                    if (tLObject instanceof TL_stats.TL_statsGraph) {
                        try {
                            fk1 e0 = uxa.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), b4, gxaVar.m);
                            try {
                                str4 = ((TL_stats.TL_statsGraph) tLObject).zoom_token;
                                if (b4 == 4 && (jArr = e0.a) != null && jArr.length > 0) {
                                    long j = jArr[jArr.length - 1];
                                    gxaVar.e = new lma(e0, j);
                                    gxaVar.c = j;
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
                                gl.c3(new exa((Object) gxaVar, (Object) str, (Object) str2, (Object) h8cVar, (byte) 1));
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
                        gxaVar.l = false;
                        gxaVar.a = true;
                        gxaVar.b = ((TL_stats.TL_statsGraphError) tLObject).error;
                    }
                    str = str4;
                    str2 = str3;
                } else {
                    str = null;
                    str2 = null;
                }
                gl.c3(new exa((Object) gxaVar, (Object) str, (Object) str2, (Object) h8cVar, (byte) 1));
                break;
            case 4:
                gl.c3(new exa(obj2, (Object) tLObject, obj, (Object) tL_error, (byte) 3));
                break;
            case 5:
                gl.c3(new exa(obj2, (Object) tL_error, (Object) tLObject, obj, (byte) 4));
                break;
            case 6:
                gl.c3(new exa(obj2, (Object) tL_error, (Object) tLObject, obj, (byte) 5));
                break;
            case 7:
                b1b b1bVar = (b1b) obj2;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) obj;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    gl.c3(new q3a((Object) b1bVar, (Object) tL_messages_searchStickerSets, tLObject, (byte) 28));
                    break;
                }
                break;
            case 8:
                gl.c3(new r1b((s1b) obj2, tLObject, (Runnable) obj, b3));
                break;
            case 9:
                gl.c3(new exa(obj2, (Object) tLObject, obj, (Object) tL_error, (byte) 6));
                break;
            case 10:
                gl.c3(new r1b((t5b) obj2, tLObject, (na7) obj, (byte) 5));
                break;
            case 11:
                gl.c3(new exa(obj2, obj, (Object) tLObject, (Object) tL_error, (byte) 9));
                break;
            case 12:
                gl.c3(new r1b((akb) obj2, tLObject, (akb) obj, (byte) 11));
                break;
            case 13:
                gl.c3(new r1b((ymb) obj2, (String) obj, tL_error, (byte) 13));
                break;
            case 14:
                ymb ymbVar = (ymb) obj2;
                TL_account.updateTheme updatetheme = (TL_account.updateTheme) obj;
                ymbVar.getClass();
                if (!(tLObject instanceof TLRPC.TL_theme)) {
                    gl.c3(new r1b(ymbVar, tL_error, updatetheme, (byte) 12));
                    break;
                } else {
                    gl.c3(new a5b((Object) ymbVar, tLObject, (byte) 10));
                    break;
                }
            case 15:
                gl.c3(new r1b((wob) obj2, tLObject, (SharedPreferences) obj, (byte) 15));
                break;
            case 16:
                gl.c3(new r1b((mvb) obj2, (String) obj, tLObject, (byte) 19));
                break;
            case 17:
                gl.c3(new exa(obj2, (Object) tL_error, (Object) tLObject, obj, (byte) 14));
                break;
            case 18:
                gl.c3(new exa(obj2, (Object) tLObject, obj, (Object) tL_error, (byte) 18));
                break;
            case 19:
                p3c p3cVar = (p3c) obj2;
                byte[] bArr = (byte[]) obj;
                if (tL_error != null) {
                    gl.c3(new k3c(p3cVar, tL_error, b2));
                    break;
                } else {
                    gl.c3(new i3c(p3cVar, bArr, b3));
                    break;
                }
            case 20:
                gl.d3(new exa(obj2, (String) obj, (Object) tL_error, (Object) tLObject, (byte) 21), 2L);
                break;
            case 21:
                gl.c3(new wbc((ifc) obj2, tLObject, (TL_stories.TL_stories_getStoriesViews) obj, b2));
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
                gl.c3(new rnc((xqc) obj2, tLObject, (wqc) obj, tL_error, (byte) 5));
                break;
            default:
                gl.c3(new mhc((irc) obj2, (int[]) obj, (byte) 26));
                break;
        }
    }
}
