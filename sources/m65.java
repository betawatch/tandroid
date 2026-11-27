// default package

import android.view.KeyEvent;
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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class m65 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m65(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i;
        byte b = this.a;
        ok1 ok1Var = null;
        int i2 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                hl.c3(new g65(tLObject, (ArrayList) obj3, (ArrayList) obj2, (tw4) obj, (byte) 2));
                break;
            case 1:
                md5 md5Var = (md5) obj3;
                String str = (String) obj;
                nd5 nd5Var = md5Var.r;
                if (Objects.equals(md5Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
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
                        if (!nd5Var.O || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    i = ((e) nd5Var).currentAccount;
                    ArrayList t0 = ls6.d0(i).t0(nd5Var.d0());
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
                    hl.c3(new g65(md5Var, arrayList, arrayList3, str, (byte) 5));
                    break;
                }
                break;
            case 2:
                String str3 = LaunchActivity.C1;
                hl.c3(new tw4(obj3, (Object) tLObject, obj2, obj, (Object) tL_error, (byte) 12));
                break;
            case 3:
                String str4 = LaunchActivity.C1;
                hl.c3(new tw4(obj3, obj2, tLObject, (TLObject) obj, tL_error, (byte) 10));
                break;
            case 4:
                String str5 = LaunchActivity.C1;
                hl.c3(new tw4(obj3, (Object) tLObject, obj2, obj, (Object) tL_error, (byte) 13));
                break;
            case 5:
                hl.c3(new tw4(obj3, tL_error, (Object) tLObject, obj2, obj, (byte) 14));
                break;
            case 6:
                hl.c3(new ls5(obj3, obj2, obj, (byte) 19));
                break;
            case 7:
                hl.c3(new tw4((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, (byte) 16));
                break;
            case 8:
                hl.c3(new tw4((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, (byte) 18));
                break;
            case 9:
                hl.c3(new tw4((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, (byte) 17));
                break;
            case 10:
                hl.c3(new tw4(obj3, (Object) tLObject, obj2, obj, (Object) tL_error, (byte) 19));
                break;
            case 11:
                ls6 ls6Var = (ls6) obj3;
                TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj;
                if (tL_error != null && xc4.r(tL_error.text) && obj2 != null) {
                    ls6Var.getFileRefController().u(new Object[]{tL_messages_faveSticker}, obj2);
                    break;
                } else {
                    hl.c3(new ip6(ls6Var, (byte) 7));
                    break;
                }
                break;
            case 12:
                ls6 ls6Var2 = (ls6) obj3;
                TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) obj;
                if (tL_error != null && xc4.r(tL_error.text) && obj2 != null) {
                    ls6Var2.getFileRefController().u(new Object[]{tL_messages_saveRecentSticker}, obj2);
                    break;
                }
                break;
            case 13:
                hl.c3(new oy6(tL_error, (c51) obj3, (q61) obj2, (Runnable) obj, (byte) 4));
                break;
            case 14:
                z67 z67Var = (z67) obj3;
                String str6 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                z67Var.getClass();
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        ok1Var = w1b.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    hl.c3(new mn6((Object) z67Var, tLObject, (byte) 18));
                }
                hl.c3(new tw4((Object) z67Var, tL_error, (Object) ok1Var, (Object) str6, (Object) tL_loadAsyncGraph, (byte) 21));
                break;
            case 15:
                w67 w67Var = (w67) obj3;
                String str7 = (String) obj2;
                v1b v1bVar = (v1b) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        ok1Var = w1b.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), w67Var.r.i, false);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(w67Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                hl.c3(new oy6(w67Var, ok1Var, str7, v1bVar, (byte) 5));
                break;
            case 16:
                uc7 uc7Var = (uc7) obj3;
                e eVar = (e) obj2;
                TLRPC.TL_messages_createChat tL_messages_createChat = (TLRPC.TL_messages_createChat) obj;
                if (tL_error == null) {
                    if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject;
                        uc7Var.Y3(tL_messages_invitedUsers.updates, false);
                        hl.c3(new ve2(uc7Var, tL_messages_invitedUsers, (byte) 9));
                        break;
                    }
                } else {
                    hl.c3(new o97(uc7Var, tL_error, eVar, tL_messages_createChat, (byte) 1));
                    break;
                }
                break;
            case 17:
                uc7 uc7Var2 = (uc7) obj3;
                e eVar2 = (e) obj2;
                TLRPC.TL_channels_createChannel tL_channels_createChannel = (TLRPC.TL_channels_createChannel) obj;
                if (tL_error == null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    uc7Var2.Y3(updates, false);
                    hl.c3(new t87(uc7Var2, updates, (byte) 5));
                    break;
                } else {
                    hl.c3(new o97(uc7Var2, tL_error, eVar2, tL_channels_createChannel, (byte) 2));
                    break;
                }
            case 18:
                uc7 uc7Var3 = (uc7) obj3;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj;
                if (tL_error != null && xc4.r(tL_error.text)) {
                    uc7Var3.getFileRefController().u(new Object[]{tL_messages_saveGif}, obj2);
                    break;
                }
                break;
            case 19:
                hl.c3(new tw4(obj3, tL_error, (Object) tLObject, obj2, obj, (byte) 24));
                break;
            case 20:
                uc7 uc7Var4 = (uc7) obj3;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) obj2;
                String str8 = (String) obj;
                if ((tLObject instanceof TLRPC.TL_boolTrue) && chatFull != null) {
                    hl.c3(new yg6(uc7Var4, chatFull, str8, (byte) 28));
                    break;
                }
                break;
            case 21:
                uc7 uc7Var5 = (uc7) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    boolean T = xc2.T(chat);
                    int i4 = tL_messages_affectedHistory.pts;
                    int i5 = tL_messages_affectedHistory.pts_count;
                    if (T) {
                        uc7Var5.V3(i4, i5, chat.id);
                    } else {
                        uc7Var5.W3(i4, -1, i5);
                    }
                    uc7Var5.getMessagesStorage().Z1(chat != null ? -chat.id : user.id, null, false, 0, 0, false, null);
                    break;
                }
                break;
            case 22:
                uc7 uc7Var6 = (uc7) obj3;
                ds6 ds6Var = (ds6) obj2;
                ea2 ea2Var = (ea2) obj;
                uc7Var6.getClass();
                if (tLObject == null) {
                    if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                        if (ea2Var != null) {
                            ea2Var.run();
                            break;
                        }
                    } else if (ds6Var != null) {
                        ds6Var.run();
                        break;
                    }
                } else {
                    uc7Var6.Y3((TLRPC.Updates) tLObject, false);
                    hl.c3(new pa7(uc7Var6, (byte) 11));
                    if (ds6Var != null) {
                        ds6Var.run();
                        break;
                    }
                }
                break;
            case 23:
                hl.c3(new tw4((KeyEvent.Callback) obj3, tLObject, obj2, tL_error, (TLObject) obj, (byte) 29));
                break;
            case 24:
                hl.c3(new cp7(obj3, (Object) tL_error, obj2, (Object) tLObject, obj, (byte) 2));
                break;
            case 25:
                p pVar = (p) obj3;
                pl7 pl7Var = (pl7) obj2;
                TLObject tLObject2 = (TLObject) obj;
                pVar.getClass();
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    hl.c3(new c28(pVar, tL_error, tLObject2, (byte) 2));
                    break;
                } else {
                    hl.c3(new fd7((Object) pVar, tLObject, (Object) pl7Var, (byte) 21));
                    break;
                }
            case 26:
                p pVar2 = (p) obj3;
                pVar2.getClass();
                hl.c3(new cp7((Object) pVar2, (Object) tL_error, (Object) tLObject, obj2, obj, (byte) 3));
                break;
            case 27:
                hl.c3(new oy6((j68) obj3, tLObject, (TL_stories.StoryItem) obj2, (pcc) obj, (byte) 18));
                break;
            case 28:
                hl.c3(new oy6((gb8) obj3, tLObject, (yac) obj2, (TLRPC.Photo) obj, (byte) 22));
                break;
            default:
                hl.c3(new cp7(obj3, (Object) tLObject, obj2, obj, (Object) tL_error, (byte) 9));
                break;
        }
    }
}
