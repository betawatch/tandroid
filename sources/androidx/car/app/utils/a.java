package androidx.car.app.utils;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import bi.p2;
import bi.pb;
import bi.q2;
import bi.rb;
import bi.w1;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.t;
import di.i3;
import di.u4;
import e2.d0;
import fg.l1;
import gg.a0;
import hi.g2;
import hi.h4;
import hi.k2;
import hi.p1;
import hi.w3;
import hi.z3;
import i9.c0;
import i9.p;
import i9.q;
import i9.u;
import i9.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import m4.b0;
import m4.f1;
import m4.k0;
import m4.l0;
import m4.n1;
import m4.r;
import m4.r1;
import m4.s;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.a2;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.s0;
import org.telegram.ui.Cells.e6;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.f4;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.g4;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.id0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.y3;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.zn;
import org.telegram.ui.eo;
import org.telegram.ui.ig1;
import org.telegram.ui.qy;
import org.telegram.ui.vo0;
import org.telegram.ui.wy;
import zh.s4;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements d, MediaDataController.KeywordResultCallback, c2, SuccessContinuation, vo0, gl, k0, p, bd0, s0, qy, c5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    @Override // org.telegram.ui.qy
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.c5
    public void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 23:
                ll llVar = (ll) this.b;
                llVar.x0.b((TLRPC.TL_messageMediaGeo) this.d, llVar.y0, z10, i10, ((Long) this.c).longValue());
                llVar.b.dismiss(true);
                break;
            case 24:
                zn znVar = (zn) this.b;
                znVar.j0.c((TLRPC.TL_messageMediaToDo) this.d, null, null, null, z10, i10, ((Long) this.c).longValue());
                znVar.b.dismiss(true);
                break;
            default:
                e60 e60Var = (e60) this.b;
                a60 a60Var = (a60) this.d;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) this.c;
                f60 f60Var = e60Var.H0;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, e60Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (a60Var != null) {
                    photoEntry.ttl = a60Var.c;
                    photoEntry.effectId = a60Var.d;
                }
                f60Var.c.q(photoEntry, videoEditedInfo, z10 || a60Var == null || a60Var.a, i10 != 0 ? i10 : a60Var != null ? a60Var.b : 0, i11 != 0 ? i11 : 0, false, a60Var != null ? a60Var.e : 0L);
                f60Var.m(false, false);
                break;
        }
    }

    @Override // org.telegram.ui.qy
    public /* synthetic */ boolean J(wy wyVar) {
        return false;
    }

    @Override // org.telegram.ui.vo0
    public void a(int i10) {
        switch (this.a) {
            case 6:
                i3 i3Var = (i3) this.b;
                id0 id0Var = (id0) this.d;
                String str = (String) this.c;
                if (i10 != 3) {
                    id0Var.dismiss();
                }
                i3Var.d.x.G(str, r6.w(i10).toLowerCase(Locale.ROOT), false);
                break;
            default:
                id0 id0Var2 = (id0) this.b;
                u4 u4Var = (u4) this.d;
                String str2 = (String) this.c;
                if (i10 != 3) {
                    id0Var2.dismiss();
                }
                u4Var.getWebViewContainer().G(str2, r6.w(i10).toLowerCase(Locale.ROOT), false);
                break;
        }
    }

    @Override // i9.p
    public w apply(Object obj) {
        int i10 = this.a;
        int i11 = 20;
        Object obj2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (i10) {
            case 12:
                b0 b0Var = (b0) obj4;
                Handler handler = b0Var.l;
                m4.w wVar = new m4.w(b0Var, (r) obj3, new a0(b0Var, (j2.h) obj2, (s) obj, 15));
                r1 r1Var = new r1(0);
                String str = d0.a;
                c0 c0Var = new c0();
                d0.U(handler, new a3.k0(c0Var, wVar, r1Var, i11));
                return c0Var;
            default:
                b0 b0Var2 = (b0) obj4;
                r rVar = (r) obj3;
                List list = (List) obj;
                Handler handler2 = b0Var2.l;
                m4.w wVar2 = new m4.w(b0Var2, rVar, new b(b0Var2, (f1) obj2, rVar, list, 21));
                r1 r1Var2 = new r1(0);
                String str2 = d0.a;
                c0 c0Var2 = new c0();
                d0.U(handler2, new a3.k0(c0Var2, wVar2, r1Var2, i11));
                return c0Var2;
        }
    }

    @Override // org.telegram.ui.Components.gl
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        switch (this.a) {
            case 8:
                hi.s sVar = (hi.s) this.b;
                hi.a aVar = (hi.a) this.d;
                yi yiVar = (yi) this.c;
                z3 z3Var = sVar.r;
                if (messageMedia != null && messageMedia.geo != null) {
                    k2 k2Var = z3Var.J3;
                    if (k2Var != null) {
                        k2Var.d();
                    }
                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) aVar.b;
                    pageblockmap.geo = messageMedia.geo;
                    pageblockmap.zoom = 15;
                    if (pageblockmap.w <= 0 || pageblockmap.h <= 0) {
                        pageblockmap.w = 600;
                        pageblockmap.h = 400;
                    }
                    k2 k2Var2 = z3Var.J3;
                    if (k2Var2 != null) {
                        k2Var2.h();
                    }
                    sVar.V(true);
                    yiVar.dismiss(true);
                    z3Var.post(new hi.g(sVar, aVar, 0));
                    break;
                }
                break;
            default:
                g2 g2Var = (g2) this.b;
                hi.a aVar2 = (hi.a) this.d;
                yi yiVar2 = (yi) this.c;
                if (messageMedia != null && messageMedia.geo != null) {
                    k2 k2Var3 = g2Var.P.J3;
                    if (k2Var3 != null) {
                        k2Var3.d();
                    }
                    TL_iv.pageBlockMap pageblockmap2 = (TL_iv.pageBlockMap) aVar2.b;
                    pageblockmap2.geo = messageMedia.geo;
                    pageblockmap2.zoom = 15;
                    if (pageblockmap2.w <= 0 || pageblockmap2.h <= 0) {
                        pageblockmap2.w = 600;
                        pageblockmap2.h = 400;
                    }
                    k2 k2Var4 = g2Var.P.J3;
                    if (k2Var4 != null) {
                        k2Var4.h();
                    }
                    yiVar2.dismiss(true);
                    g2Var.P.post(new p1(g2Var, aVar2, 9));
                    break;
                }
                break;
        }
    }

    @Override // androidx.car.app.utils.d
    public void call() {
        w.b bVar;
        switch (this.a) {
            case 0:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
                String str = (String) this.c;
                Object obj = this.d;
                if (obj == null) {
                    bVar = null;
                } else {
                    try {
                        bVar = new w.b(obj);
                    } catch (w.g e) {
                        i.f(iOnDoneCallback, str, e);
                        return;
                    }
                }
                iOnDoneCallback.onSuccess(bVar);
                break;
            default:
                IOnDoneCallback iOnDoneCallback2 = (IOnDoneCallback) this.b;
                Exception exc = (Exception) this.d;
                String str2 = (String) this.c;
                try {
                    iOnDoneCallback2.onFailure(new w.b(new FailureResponse(exc)));
                    break;
                } catch (w.g e7) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e7);
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(d2 d2Var, int i10) {
        switch (this.a) {
            case 3:
                ((rb) this.b).g1((pb) this.d, (Runnable) this.c, true);
                break;
            case 5:
                Activity activity = (Activity) this.b;
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) this.c;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                rVar.run(bool, bool);
                break;
            case 7:
                l1 l1Var = (l1) this.b;
                boolean[] zArr2 = (boolean[]) this.d;
                TLRPC.User user = (TLRPC.User) this.c;
                l1Var.getClass();
                zArr2[0] = true;
                if (user != null) {
                    MessagesController.getNotificationsSettings(l1Var.f).edit().putBoolean("inlinegeo_" + user.id, true).commit();
                    l1Var.G();
                    break;
                }
                break;
            case 10:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                h4 h4Var = (h4) this.c;
                String trim = editTextBoldCursor.getText().toString().trim();
                String trim2 = editTextBoldCursor2.getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
                    int i11 = h4Var.a;
                    w3 w3Var = h4Var.b;
                    switch (i11) {
                        case 1:
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                            tL_inlineButtonTypeUrl.url = trim2;
                            w3Var.a(trim, tL_inlineButtonTypeUrl);
                            break;
                        default:
                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                            tL_inlineButtonTypeCopy.copy_text = trim2;
                            w3Var.a(trim, tL_inlineButtonTypeCopy);
                            break;
                    }
                }
                break;
            case 14:
                boolean[] zArr3 = (boolean[]) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                d2[] d2VarArr = (d2[]) this.c;
                zArr3[0] = true;
                callback.run(Boolean.FALSE);
                d2VarArr[0].dismiss();
                break;
            case 18:
                ChatActivityEnterView.i((ChatActivityEnterView) this.b, (MessageObject) this.d, (TL_keyboard.KeyboardButtonProto) this.c);
                break;
            case 21:
                yi yiVar = (yi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.d;
                TLRPC.User user2 = (TLRPC.User) this.c;
                int i12 = yiVar.J1;
                if (tL_attachMenuBot == null) {
                    MediaDataController.getInstance(i12).removeInline(user2.id);
                    break;
                } else {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i12).getInputUser(user2);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new th(1, yiVar, tL_attachMenuBot), 66);
                    break;
                }
            case 25:
                zn znVar = (zn) this.b;
                View view = (View) this.d;
                e6 e6Var = (e6) this.c;
                znVar.getClass();
                view.setTag(null);
                znVar.X(view, e6Var, false);
                break;
            default:
                iv0 iv0Var = (iv0) this.b;
                s4 s4Var = (s4) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                s4Var.F(arrayList);
                wc.a0(iv0Var.v1).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).j();
                iv0Var.L(false);
                break;
        }
    }

    @Override // m4.k0
    public void h(r rVar) {
        l0 l0Var = (l0) this.b;
        Bundle bundle = (Bundle) this.d;
        ResultReceiver resultReceiver = (ResultReceiver) this.c;
        b0 b0Var = l0Var.g;
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        u n10 = b0Var.n(rVar);
        if (resultReceiver != null) {
            n10.a(new m4.w(3, n10, resultReceiver), q.a);
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void m(int i10) {
        Runnable runnable;
        c5 c5Var = (c5) this.b;
        boolean[] zArr = (boolean[]) this.d;
        c3 c3Var = (c3) this.c;
        if (i10 == 1) {
            c5Var.I(2147483646, 0, zArr[0]);
            runnable = c3Var.a.dismissRunnable;
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.bd0
    public void q(dd0 dd0Var, int i10) {
        switch (this.a) {
            case 15:
                d5.g(null, null, 0L, 0L, 0, (dd0) this.b, (f4) this.d, (g4) this.c);
                break;
            default:
                d5.g(null, null, 0L, 0L, 0, (dd0) this.b, (org.telegram.ui.Components.w3) this.d, (y3) this.c);
                break;
        }
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5 = arrayList;
        switch (this.a) {
            case 2:
                p2 p2Var = (p2) this.b;
                String str2 = (String) this.c;
                MediaDataController mediaDataController = (MediaDataController) this.d;
                ArrayList arrayList6 = p2Var.h;
                SparseIntArray sparseIntArray = p2Var.y;
                ArrayList arrayList7 = p2Var.n;
                q2 q2Var = p2Var.N;
                ArrayList arrayList8 = p2Var.v;
                HashSet hashSet = p2Var.L;
                ArrayList arrayList9 = p2Var.s;
                if (TextUtils.equals(str2, p2Var.H)) {
                    ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(p2Var.H);
                    for (int i10 = 0; i10 < parseEmojis.size(); i10++) {
                        try {
                            MediaDataController.KeywordResult keywordResult = new MediaDataController.KeywordResult();
                            keywordResult.emoji = parseEmojis.get(i10).code.toString();
                            arrayList5.add(keywordResult);
                        } catch (Exception unused) {
                        }
                    }
                    p2Var.x = 0;
                    arrayList9.clear();
                    arrayList8.clear();
                    sparseIntArray.clear();
                    arrayList7.clear();
                    p2Var.x++;
                    arrayList9.add(null);
                    arrayList8.add(0L);
                    if (q2Var.a == 0) {
                        hashSet.clear();
                        for (int i11 = 0; i11 < arrayList5.size(); i11++) {
                            MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) arrayList5.get(i11);
                            String str3 = keywordResult2.emoji;
                            if (str3 != null && !str3.startsWith("animated_") && (arrayList4 = (ArrayList) p2Var.d.get(keywordResult2.emoji)) != null) {
                                hashSet.addAll(arrayList4);
                            }
                        }
                        arrayList8.addAll(hashSet);
                        for (int i12 = 0; i12 < hashSet.size(); i12++) {
                            arrayList9.add(null);
                        }
                        p2Var.x = hashSet.size() + p2Var.x;
                    } else {
                        HashMap<String, ArrayList<TLRPC.Document>> allStickers = mediaDataController.getAllStickers();
                        for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                            MediaDataController.KeywordResult keywordResult3 = (MediaDataController.KeywordResult) arrayList5.get(i13);
                            String str4 = keywordResult3.emoji;
                            if (str4 != null && !str4.startsWith("animated_") && (arrayList3 = allStickers.get(keywordResult3.emoji)) != null && !arrayList3.isEmpty()) {
                                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                    TLRPC.Document document = arrayList3.get(i14);
                                    if (document != null && !arrayList9.contains(document)) {
                                        arrayList9.add(document);
                                        p2Var.x++;
                                    }
                                }
                            }
                        }
                        ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
                        int i15 = 0;
                        while (i15 < arrayList5.size()) {
                            MediaDataController.KeywordResult keywordResult4 = (MediaDataController.KeywordResult) arrayList5.get(i15);
                            String str5 = keywordResult4.emoji;
                            if (str5 != null && !str5.startsWith("animated_")) {
                                for (int i16 = 0; i16 < featuredStickerSets.size(); i16++) {
                                    TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i16);
                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                        arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                    } else if (!stickerSetCovered.covers.isEmpty()) {
                                        arrayList2 = stickerSetCovered.covers;
                                    } else if (stickerSetCovered.cover != null) {
                                        ArrayList<TLRPC.Document> arrayList10 = new ArrayList<>();
                                        arrayList10.add(stickerSetCovered.cover);
                                        arrayList2 = arrayList10;
                                    }
                                    for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                                        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i17), null);
                                        if (findAnimatedEmojiEmoticon != null && findAnimatedEmojiEmoticon.contains(keywordResult4.emoji)) {
                                            arrayList9.add(arrayList2.get(i17));
                                            p2Var.x++;
                                        }
                                    }
                                }
                            }
                            i15++;
                            arrayList5 = arrayList;
                        }
                    }
                    String translitSafe = AndroidUtilities.translitSafe((p2Var.H + "").toLowerCase());
                    for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList6.get(i18);
                        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                            String translitSafe2 = AndroidUtilities.translitSafe((tL_messages_stickerSet.set.title + "").toLowerCase());
                            if (translitSafe2.startsWith(translitSafe) || a2.w(" ", translitSafe, translitSafe2)) {
                                int size = arrayList7.size();
                                arrayList7.add(tL_messages_stickerSet);
                                sparseIntArray.put(p2Var.x, size);
                                arrayList9.add(null);
                                p2Var.x++;
                                arrayList9.addAll(tL_messages_stickerSet.documents);
                                p2Var.x = tL_messages_stickerSet.documents.size() + p2Var.x;
                            }
                        }
                    }
                    boolean z10 = arrayList8.size() <= 1 && arrayList9.size() <= 1;
                    p2Var.w = z10;
                    if (z10) {
                        p2Var.x++;
                    }
                    if (!z10) {
                        p2Var.K++;
                    }
                    p2Var.I = p2Var.H;
                    p2Var.l();
                    w1.v1(q2Var.b, 0, 0);
                    q2Var.f.c(false);
                    q2Var.e.n(false);
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.qy qyVar = (org.telegram.ui.Components.qy) this.b;
                String str6 = (String) this.c;
                Runnable runnable = (Runnable) this.d;
                ry ryVar = qyVar.a;
                if (str6.equals(ryVar.v)) {
                    ryVar.w = str;
                    ryVar.n.addAll(arrayList5);
                    runnable.run();
                    break;
                }
                break;
            default:
                kz kzVar = (kz) this.b;
                HashMap hashMap = (HashMap) this.d;
                Runnable runnable2 = (Runnable) this.c;
                HashMap hashMap2 = kzVar.f;
                if (kzVar.w.M == kzVar.b) {
                    int size2 = arrayList5.size();
                    for (int i19 = 0; i19 < size2; i19++) {
                        String str7 = ((MediaDataController.KeywordResult) arrayList5.get(i19)).emoji;
                        ArrayList arrayList11 = (ArrayList) hashMap.get(str7);
                        if (arrayList11 != null && !arrayList11.isEmpty() && !hashMap2.containsKey(arrayList11)) {
                            hashMap2.put(arrayList11, str7);
                            kzVar.h.add(arrayList11);
                        }
                    }
                    runnable2.run();
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str = (String) this.c;
        t tVar = (t) this.d;
        String str2 = (String) obj;
        com.google.firebase.messaging.u c10 = FirebaseMessaging.c(firebaseMessaging.b);
        k9.h hVar = firebaseMessaging.a;
        hVar.a();
        String d = "[DEFAULT]".equals(hVar.b) ? "" : hVar.d();
        String a2 = firebaseMessaging.i.a();
        synchronized (c10) {
            String a10 = t.a(System.currentTimeMillis(), str2, a2);
            if (a10 != null) {
                SharedPreferences.Editor edit = c10.a.edit();
                edit.putString(d + "|T|" + str + "|*", a10);
                edit.commit();
            }
        }
        if (tVar == null || !str2.equals(tVar.a)) {
            k9.h hVar2 = firebaseMessaging.a;
            hVar2.a();
            if ("[DEFAULT]".equals(hVar2.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    hVar2.a();
                    sb2.append(hVar2.b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new com.google.firebase.messaging.j(firebaseMessaging.b).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }

    @Override // org.telegram.ui.qy
    public boolean v(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ig1 ig1Var) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
        MessageObject messageObject = (MessageObject) this.d;
        TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.c;
        eo eoVar = chatActivityEnterView.O2;
        TLRPC.Message message = messageObject.messageOwner;
        long j3 = message.from_id.user_id;
        long j10 = message.via_bot_id;
        if (j10 != 0) {
            j3 = j10;
        }
        TLRPC.User user = chatActivityEnterView.R.getMessagesController().getUser(Long.valueOf(j3));
        if (user == null) {
            wyVar.finishFragment();
            return true;
        }
        long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        MediaDataController.getInstance(chatActivityEnterView.Q).saveDraft(j11, 0, "@" + UserObject.getPublicUsername(user) + " " + tL_inlineButtonTypeSwitchInline.query, null, null, true, 0L);
        if (j11 == chatActivityEnterView.P2) {
            wyVar.finishFragment();
            return true;
        }
        if (DialogObject.isEncryptedDialog(j11)) {
            wyVar.finishFragment();
            return true;
        }
        Bundle bundle = new Bundle();
        if (DialogObject.isUserDialog(j11)) {
            bundle.putLong("user_id", j11);
        } else {
            bundle.putLong("chat_id", -j11);
        }
        if (chatActivityEnterView.R.getMessagesController().checkCanOpenChat(bundle, wyVar)) {
            if (!eoVar.presentFragment(new eo(bundle), true)) {
                wyVar.finishFragment();
                return true;
            }
            if (!AndroidUtilities.isTablet()) {
                eoVar.removeSelfFromStack();
            }
        }
        return true;
    }

    public /* synthetic */ a(Object obj, String str, Object obj2, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = str;
        this.d = obj2;
    }

    public /* synthetic */ a(l0 l0Var, n1 n1Var, Bundle bundle, ResultReceiver resultReceiver) {
        this.a = 11;
        this.b = l0Var;
        this.d = bundle;
        this.c = resultReceiver;
    }
}
