// default package

import android.widget.Toast;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class i65 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i65(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i;
        byte b = this.a;
        nl1 nl1Var = null;
        byte b2 = 9;
        byte b3 = 2;
        int i2 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                gm.c3(new d65(tLObject, (ArrayList) obj3, (ArrayList) obj2, (v15) obj, (byte) 2));
                break;
            case 1:
                jd5 jd5Var = (jd5) obj3;
                String str = (String) obj;
                kd5 kd5Var = jd5Var.r;
                if (Objects.equals(jd5Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList<TLRPC.StickerSetCovered> arrayList2 = ((TLRPC.TL_messages_foundStickerSets) tLObject).sets;
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList2.get(i3);
                        i3++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = new TLRPC.TL_messages_stickerSet();
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        tL_messages_stickerSet.set = stickerSet;
                        tL_messages_stickerSet.documents = stickerSetCovered2.covers;
                        if (!kd5Var.O || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    i = ((d) kd5Var).currentAccount;
                    ArrayList t0 = hs6.d0(i).t0(kd5Var.e0());
                    int size2 = t0.size();
                    while (i2 < size2) {
                        Object obj4 = t0.get(i2);
                        i2++;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj4;
                        String str2 = tL_messages_stickerSet2.set.short_name;
                        Locale locale = Locale.ROOT;
                        if (str2.toLowerCase(locale).contains(trim) || tL_messages_stickerSet2.set.title.toLowerCase(locale).contains(trim)) {
                            arrayList3.add(tL_messages_stickerSet2);
                        }
                    }
                    gm.c3(new d65(jd5Var, arrayList, arrayList3, str, (byte) 5));
                    break;
                }
                break;
            case 2:
                String str3 = LaunchActivity.C1;
                gm.c3(new v15(obj3, (Object) tLObject, obj2, (String) obj, (Object) tL_error, (byte) 11));
                break;
            case 3:
                String str4 = LaunchActivity.C1;
                gm.c3(new v15(obj3, obj2, (Object) tLObject, obj, (Object) tL_error, (byte) 9));
                break;
            case 4:
                String str5 = LaunchActivity.C1;
                gm.c3(new v15(obj3, (Object) tLObject, obj2, obj, (Object) tL_error, (byte) 12));
                break;
            case 5:
                gm.c3(new v15(obj3, (Object) tL_error, (Object) tLObject, obj2, obj, (byte) 13));
                break;
            case 6:
                gm.c3(new dt5((pc6) obj3, (he[]) obj2, (TLRPC.TL_messageMediaVenue) obj, (byte) 16));
                break;
            case 7:
                gm.c3(new v15(obj3, (Object) tLObject, obj2, (Object) tL_error, obj, (byte) 15));
                break;
            case 8:
                gm.c3(new v15(obj3, (Object) tLObject, obj2, (Object) tL_error, obj, (byte) 17));
                break;
            case 9:
                gm.c3(new v15(obj3, (Object) tLObject, obj2, (Object) tL_error, obj, (byte) 16));
                break;
            case 10:
                gm.c3(new v15(obj3, (Object) tLObject, obj2, obj, (Object) tL_error, (byte) 18));
                break;
            case 11:
                hs6 hs6Var = (hs6) obj3;
                TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj;
                if (tL_error != null && ad4.r(tL_error.text) && obj2 != null) {
                    hs6Var.getFileRefController().u(new Object[]{tL_messages_faveSticker}, obj2);
                    break;
                } else {
                    gm.c3(new vp6(hs6Var, b3));
                    break;
                }
                break;
            case 12:
                hs6 hs6Var2 = (hs6) obj3;
                TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) obj;
                if (tL_error != null && ad4.r(tL_error.text) && obj2 != null) {
                    hs6Var2.getFileRefController().u(new Object[]{tL_messages_saveRecentSticker}, obj2);
                    break;
                }
                break;
            case 13:
                gm.c3(new jy6(tL_error, (b61) obj3, (p71) obj2, (Runnable) obj, (byte) 4));
                break;
            case 14:
                t67 t67Var = (t67) obj3;
                String str6 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                t67Var.getClass();
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        nl1Var = xza.f0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    gm.c3(new lj6((Object) t67Var, tLObject, (byte) 22));
                }
                gm.c3(new v15((Object) t67Var, (Object) tL_error, (Object) nl1Var, str6, (Object) tL_loadAsyncGraph, (byte) 20));
                break;
            case 15:
                q67 q67Var = (q67) obj3;
                String str7 = (String) obj2;
                wza wzaVar = (wza) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        nl1Var = xza.f0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), q67Var.r.i, false);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(q67Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                gm.c3(new jy6(q67Var, nl1Var, str7, wzaVar, (byte) 5));
                break;
            case 16:
                gm.c3(new v15(obj3, (Object) tL_error, (Object) tLObject, obj2, obj, (byte) 24));
                break;
            case 17:
                oc7 oc7Var = (oc7) obj3;
                d dVar = (d) obj2;
                TLRPC.TL_messages_createChat tL_messages_createChat = (TLRPC.TL_messages_createChat) obj;
                if (tL_error == null) {
                    if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject;
                        oc7Var.T3(tL_messages_invitedUsers.updates, false);
                        gm.c3(new pf2(oc7Var, tL_messages_invitedUsers, b2));
                        break;
                    }
                } else {
                    gm.c3(new l97(oc7Var, tL_error, dVar, tL_messages_createChat, (byte) 2));
                    break;
                }
                break;
            case 18:
                oc7 oc7Var2 = (oc7) obj3;
                d dVar2 = (d) obj2;
                TLRPC.TL_channels_createChannel tL_channels_createChannel = (TLRPC.TL_channels_createChannel) obj;
                if (tL_error == null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    oc7Var2.T3(updates, false);
                    gm.c3(new q87(oc7Var2, updates, b2));
                    break;
                } else {
                    gm.c3(new l97(oc7Var2, tL_error, dVar2, tL_channels_createChannel, (byte) 1));
                    break;
                }
            case 19:
                oc7 oc7Var3 = (oc7) obj3;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj;
                if (tL_error != null && ad4.r(tL_error.text)) {
                    oc7Var3.getFileRefController().u(new Object[]{tL_messages_saveGif}, obj2);
                    break;
                }
                break;
            case 20:
                oc7 oc7Var4 = (oc7) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    boolean T = sd2.T(chat);
                    int i4 = tL_messages_affectedHistory.pts;
                    int i5 = tL_messages_affectedHistory.pts_count;
                    if (T) {
                        oc7Var4.Q3(i4, i5, chat.id);
                    } else {
                        oc7Var4.R3(i4, -1, i5);
                    }
                    oc7Var4.getMessagesStorage().Z1(chat != null ? -chat.id : user.id, null, false, 0, 0, false, null);
                    break;
                }
                break;
            case 21:
                oc7 oc7Var5 = (oc7) obj3;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) obj2;
                String str8 = (String) obj;
                if ((tLObject instanceof TLRPC.TL_boolTrue) && chatFull != null) {
                    gm.c3(new fp6((Object) oc7Var5, (Object) chatFull, (Object) str8, (byte) 25));
                    break;
                }
                break;
            case 22:
                oc7 oc7Var6 = (oc7) obj3;
                np6 np6Var = (np6) obj2;
                ra2 ra2Var = (ra2) obj;
                oc7Var6.getClass();
                if (tLObject == null) {
                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                        if (ra2Var != null) {
                            ra2Var.run();
                            break;
                        }
                    } else if (np6Var != null) {
                        np6Var.run();
                        break;
                    }
                } else {
                    oc7Var6.T3((TLRPC.Updates) tLObject, false);
                    gm.c3(new ba7(oc7Var6, (byte) 11));
                    if (np6Var != null) {
                        np6Var.run();
                        break;
                    }
                }
                break;
            case 23:
                gm.c3(new v15(obj3, tLObject, obj2, (Object) tL_error, obj, (byte) 28));
                break;
            case 24:
                gm.c3(new hz7(obj3, (Object) tL_error, obj2, (Object) tLObject, obj, (byte) 1));
                break;
            case 25:
                p pVar = (p) obj3;
                pVar.getClass();
                gm.c3(new hz7((Object) pVar, (Object) tL_error, (Object) tLObject, obj2, obj, (byte) 2));
                break;
            case 26:
                p pVar2 = (p) obj3;
                bl7 bl7Var = (bl7) obj2;
                TLObject tLObject2 = (TLObject) obj;
                pVar2.getClass();
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    gm.c3(new z08(pVar2, tL_error, tLObject2, b3));
                    break;
                } else {
                    gm.c3(new ud7((Object) pVar2, tLObject, (Object) bl7Var, (byte) 18));
                    break;
                }
            case 27:
                gm.c3(new jy6((v48) obj3, tLObject, (TL_stories.StoryItem) obj2, (qac) obj, (byte) 16));
                break;
            case 28:
                gm.c3(new jy6((r98) obj3, tLObject, (z8c) obj2, (TLRPC.Photo) obj, (byte) 21));
                break;
            default:
                gm.c3(new hz7(obj3, tLObject, obj2, obj, tL_error, (byte) 8));
                break;
        }
    }
}
