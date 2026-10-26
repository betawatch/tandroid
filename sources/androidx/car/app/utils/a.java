package androidx.car.app.utils;

import a4.l;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import bi.h7;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import di.h4;
import di.q4;
import di.t9;
import e2.m0;
import e2.n0;
import fi.l9;
import fi.n1;
import fi.n9;
import fi.z1;
import hi.h3;
import hi.o4;
import ig.j1;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import jg.a1;
import jg.f1;
import k2.e0;
import k9.q;
import k9.y;
import li.e4;
import li.f2;
import li.l1;
import li.s3;
import li.v3;
import m4.f0;
import m4.o0;
import m4.p0;
import m4.p1;
import m4.t1;
import m4.v0;
import m4.w;
import m4.x;
import m4.x0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.r0;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.w7;
import org.telegram.ui.Cells.y1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.b4;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.i4;
import org.telegram.ui.Components.j4;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.nl;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.z3;
import org.telegram.ui.af1;
import org.telegram.ui.cy;
import org.telegram.ui.oo0;
import org.telegram.ui.un;
import org.telegram.ui.ux;
import org.telegram.ui.web.r;
import org.telegram.ui.z7;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements c, ux, SuccessContinuation, MessagesStorage.StringCallback, t9, MediaDataController.KeywordResultCallback, b2, oo0, nl, o0, q, kd0, r0, e5 {
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

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean C() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 27:
                sl slVar = (sl) this.b;
                slVar.u0.d((TLRPC.TL_messageMediaGeo) this.d, slVar.v0, z10, i10, ((Long) this.c).longValue());
                slVar.b.dismiss(true);
                break;
            default:
                go goVar = (go) this.b;
                goVar.j0.e((TLRPC.TL_messageMediaToDo) this.d, null, null, null, z10, i10, ((Long) this.c).longValue());
                goVar.b.dismiss(true);
                break;
        }
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean K(cy cyVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.oo0
    public void a(int i10) {
        switch (this.a) {
            case 9:
                h3 h3Var = (h3) this.b;
                sd0 sd0Var = (sd0) this.d;
                String str = (String) this.c;
                if (i10 != 3) {
                    sd0Var.dismiss();
                }
                h3Var.d.y.F(str, b10.v(i10).toLowerCase(Locale.ROOT), false);
                break;
            default:
                sd0 sd0Var2 = (sd0) this.b;
                o4 o4Var = (o4) this.d;
                String str2 = (String) this.c;
                if (i10 != 3) {
                    sd0Var2.dismiss();
                }
                o4Var.getWebViewContainer().F(str2, b10.v(i10).toLowerCase(Locale.ROOT), false);
                break;
        }
    }

    @Override // k9.q
    public y apply(Object obj) {
        int i10 = this.a;
        Object obj2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.b;
        int i11 = 0;
        switch (i10) {
            case 15:
                f0 f0Var = (f0) obj4;
                Handler handler = f0Var.l;
                e0 e0Var = new e0(f0Var, (w) obj3, new f1(f0Var, (x0) obj2, (x) obj, 9));
                t1 t1Var = new t1(0);
                String str = n0.a;
                k9.e0 e0Var2 = new k9.e0();
                n0.W(handler, new m0(e0Var2, e0Var, t1Var, i11));
                return e0Var2;
            default:
                f0 f0Var2 = (f0) obj4;
                w wVar = (w) obj3;
                List list = (List) obj;
                Handler handler2 = f0Var2.l;
                e0 e0Var3 = new e0(f0Var2, wVar, new v0(f0Var2, obj2, (Object) wVar, (Object) list, 2));
                t1 t1Var2 = new t1(0);
                String str2 = n0.a;
                k9.e0 e0Var4 = new k9.e0();
                n0.W(handler2, new m0(e0Var4, e0Var3, t1Var2, i11));
                return e0Var4;
        }
    }

    @Override // androidx.car.app.utils.c
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
                    } catch (w.f e) {
                        h.f(iOnDoneCallback, str, e);
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
                } catch (w.f e10) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e10);
                }
        }
    }

    @Override // org.telegram.ui.Components.nl
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        switch (this.a) {
            case 11:
                li.q qVar = (li.q) this.b;
                li.a aVar = (li.a) this.d;
                ti tiVar = (ti) this.c;
                v3 v3Var = qVar.r;
                if (messageMedia != null && messageMedia.geo != null) {
                    f2 f2Var = v3Var.R3;
                    if (f2Var != null) {
                        f2Var.d();
                    }
                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) aVar.b;
                    pageblockmap.geo = messageMedia.geo;
                    pageblockmap.zoom = 15;
                    if (pageblockmap.w <= 0 || pageblockmap.h <= 0) {
                        pageblockmap.w = 600;
                        pageblockmap.h = 400;
                    }
                    f2 f2Var2 = v3Var.R3;
                    if (f2Var2 != null) {
                        f2Var2.h();
                    }
                    qVar.Y(true);
                    tiVar.dismiss(true);
                    v3Var.post(new li.f(qVar, aVar, 0));
                    break;
                }
                break;
            default:
                li.b2 b2Var = (li.b2) this.b;
                li.a aVar2 = (li.a) this.d;
                ti tiVar2 = (ti) this.c;
                if (messageMedia != null && messageMedia.geo != null) {
                    f2 f2Var3 = b2Var.P.R3;
                    if (f2Var3 != null) {
                        f2Var3.d();
                    }
                    TL_iv.pageBlockMap pageblockmap2 = (TL_iv.pageBlockMap) aVar2.b;
                    pageblockmap2.geo = messageMedia.geo;
                    pageblockmap2.zoom = 15;
                    if (pageblockmap2.w <= 0 || pageblockmap2.h <= 0) {
                        pageblockmap2.w = 600;
                        pageblockmap2.h = 400;
                    }
                    f2 f2Var4 = b2Var.P.R3;
                    if (f2Var4 != null) {
                        f2Var4.h();
                    }
                    tiVar2.dismiss(true);
                    b2Var.P.post(new l1(b2Var, aVar2, 9));
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void g(int i10) {
        Runnable runnable;
        e5 e5Var = (e5) this.b;
        boolean[] zArr = (boolean[]) this.d;
        e3 e3Var = (e3) this.c;
        if (i10 == 1) {
            e5Var.G(2147483646, 0, zArr[0]);
            runnable = e3Var.a.dismissRunnable;
            runnable.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(e2 e2Var, int i10) {
        switch (this.a) {
            case 7:
                ((n9) this.b).h1((l9) this.d, (Runnable) this.c, true);
                break;
            case 8:
                Activity activity = (Activity) this.b;
                boolean[] zArr = (boolean[]) this.d;
                r rVar = (r) this.c;
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
            case 10:
                j1 j1Var = (j1) this.b;
                boolean[] zArr2 = (boolean[]) this.d;
                TLRPC.User user = (TLRPC.User) this.c;
                j1Var.getClass();
                zArr2[0] = true;
                if (user != null) {
                    MessagesController.getNotificationsSettings(j1Var.f).edit().putBoolean("inlinegeo_" + user.id, true).commit();
                    j1Var.G();
                    break;
                }
                break;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                e4 e4Var = (e4) this.c;
                String trim = editTextBoldCursor.getText().toString().trim();
                String trim2 = editTextBoldCursor2.getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
                    int i11 = e4Var.a;
                    s3 s3Var = e4Var.b;
                    switch (i11) {
                        case 1:
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                            tL_inlineButtonTypeUrl.url = trim2;
                            s3Var.a(trim, tL_inlineButtonTypeUrl);
                            break;
                        default:
                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                            tL_inlineButtonTypeCopy.copy_text = trim2;
                            s3Var.a(trim, tL_inlineButtonTypeCopy);
                            break;
                    }
                }
                break;
            case 17:
                boolean[] zArr3 = (boolean[]) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                e2[] e2VarArr = (e2[]) this.c;
                zArr3[0] = true;
                callback.run(Boolean.FALSE);
                e2VarArr[0].dismiss();
                break;
            case 21:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                MessageObject messageObject = (MessageObject) this.d;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.c;
                Activity activity2 = chatActivityEnterView.O2;
                if (activity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendCurrentLocation(messageObject, keyboardButtonProto);
                    break;
                } else {
                    activity2.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                    chatActivityEnterView.i3 = messageObject;
                    chatActivityEnterView.j3 = keyboardButtonProto;
                    break;
                }
            case 24:
                ti tiVar = (ti) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.d;
                TLRPC.User user2 = (TLRPC.User) this.c;
                int i12 = tiVar.M1;
                if (tL_attachMenuBot == null) {
                    MediaDataController.getInstance(i12).removeInline(user2.id);
                    break;
                } else {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i12).getInputUser(user2);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new z7(13, tiVar, tL_attachMenuBot), 66);
                    break;
                }
            case 26:
                al alVar = (al) this.b;
                a1 a1Var = (a1) this.d;
                y1 y1Var = (y1) this.c;
                TextView textView = alVar.U;
                if (a1Var.getText().toString().getBytes(StandardCharsets.UTF_8).length <= 960) {
                    String trim3 = a1Var.getText().toString().trim();
                    if (TextUtils.isEmpty(trim3)) {
                        trim3 = null;
                    }
                    alVar.s0 = trim3;
                    alVar.t0 = !y1Var.b();
                    if (TextUtils.isEmpty(alVar.s0)) {
                        textView.setVisibility(8);
                    } else {
                        textView.setText(alVar.s0);
                        textView.setVisibility(0);
                    }
                    alVar.i0();
                    e2Var.dismiss();
                    alVar.Y();
                    break;
                } else {
                    int i13 = -alVar.v0;
                    alVar.v0 = i13;
                    AndroidUtilities.shakeViewSpring(a1Var, i13);
                    break;
                }
            default:
                go goVar = (go) this.b;
                View view = (View) this.d;
                h6 h6Var = (h6) this.c;
                goVar.getClass();
                view.setTag(null);
                goVar.a0(view, h6Var, false);
                break;
        }
    }

    @Override // m4.o0
    public void i(w wVar) {
        p0 p0Var = (p0) this.b;
        Bundle bundle = (Bundle) this.d;
        ResultReceiver resultReceiver = (ResultReceiver) this.c;
        f0 f0Var = p0Var.g;
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        k9.w n10 = f0Var.n(wVar);
        if (resultReceiver != null) {
            n10.a(new e0(13, n10, resultReceiver), k9.r.a);
        }
    }

    @Override // di.t9
    public void k(Canvas canvas, RectF rectF, float f7) {
        w7 w7Var = (w7) this.b;
        sl0 sl0Var = (sl0) this.d;
        int[] iArr = (int[]) this.c;
        w7Var.c(canvas, rectF, f7);
        w7Var.f(canvas, rectF, f7);
        if (w7Var.h) {
            w7Var.b(canvas, rectF, f7);
        } else {
            w7Var.e(canvas, rectF, f7);
        }
        if (sl0Var != null && sl0Var.a0 && sl0Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f7 * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            sl0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.kd0
    public void q(md0 md0Var, int i10) {
        switch (this.a) {
            case 18:
                g5.g(null, null, 0L, 0L, 0, (md0) this.b, (i4) this.d, (j4) this.c);
                break;
            default:
                g5.g(null, null, 0L, 0L, 0, (md0) this.b, (z3) this.d, (b4) this.c);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        int i10;
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5 = arrayList;
        fi.y1 y1Var = (fi.y1) this.b;
        String str2 = (String) this.c;
        MediaDataController mediaDataController = (MediaDataController) this.d;
        ArrayList arrayList6 = y1Var.h;
        SparseIntArray sparseIntArray = y1Var.y;
        ArrayList arrayList7 = y1Var.n;
        z1 z1Var = y1Var.N;
        ArrayList arrayList8 = y1Var.v;
        HashSet hashSet = y1Var.L;
        ArrayList arrayList9 = y1Var.s;
        if (TextUtils.equals(str2, y1Var.H)) {
            ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(y1Var.H);
            for (int i11 = 0; i11 < parseEmojis.size(); i11++) {
                try {
                    MediaDataController.KeywordResult keywordResult = new MediaDataController.KeywordResult();
                    keywordResult.emoji = parseEmojis.get(i11).code.toString();
                    arrayList5.add(keywordResult);
                } catch (Exception unused) {
                }
            }
            y1Var.x = 0;
            arrayList9.clear();
            arrayList8.clear();
            sparseIntArray.clear();
            arrayList7.clear();
            int i12 = 1;
            y1Var.x++;
            arrayList9.add(null);
            arrayList8.add(0L);
            if (z1Var.a == 0) {
                hashSet.clear();
                for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                    MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) arrayList5.get(i13);
                    String str3 = keywordResult2.emoji;
                    if (str3 != null && !str3.startsWith("animated_") && (arrayList4 = (ArrayList) y1Var.d.get(keywordResult2.emoji)) != null) {
                        hashSet.addAll(arrayList4);
                    }
                }
                arrayList8.addAll(hashSet);
                for (int i14 = 0; i14 < hashSet.size(); i14++) {
                    arrayList9.add(null);
                }
                y1Var.x = hashSet.size() + y1Var.x;
                i10 = 1;
            } else {
                HashMap<String, ArrayList<TLRPC.Document>> allStickers = mediaDataController.getAllStickers();
                int i15 = 0;
                while (i15 < arrayList5.size()) {
                    MediaDataController.KeywordResult keywordResult3 = (MediaDataController.KeywordResult) arrayList5.get(i15);
                    int i16 = i12;
                    String str4 = keywordResult3.emoji;
                    if (str4 != null && !str4.startsWith("animated_") && (arrayList3 = allStickers.get(keywordResult3.emoji)) != null && !arrayList3.isEmpty()) {
                        for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                            TLRPC.Document document = arrayList3.get(i17);
                            if (document != null && !arrayList9.contains(document)) {
                                arrayList9.add(document);
                                y1Var.x++;
                            }
                        }
                    }
                    i15++;
                    i12 = i16;
                }
                i10 = i12;
                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
                int i18 = 0;
                while (i18 < arrayList5.size()) {
                    MediaDataController.KeywordResult keywordResult4 = (MediaDataController.KeywordResult) arrayList5.get(i18);
                    String str5 = keywordResult4.emoji;
                    if (str5 != null && !str5.startsWith("animated_")) {
                        for (int i19 = 0; i19 < featuredStickerSets.size(); i19++) {
                            TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i19);
                            if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                            } else if (!stickerSetCovered.covers.isEmpty()) {
                                arrayList2 = stickerSetCovered.covers;
                            } else if (stickerSetCovered.cover != null) {
                                ArrayList<TLRPC.Document> arrayList10 = new ArrayList<>();
                                arrayList10.add(stickerSetCovered.cover);
                                arrayList2 = arrayList10;
                            }
                            for (int i20 = 0; i20 < arrayList2.size(); i20++) {
                                String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i20), null);
                                if (findAnimatedEmojiEmoticon != null && findAnimatedEmojiEmoticon.contains(keywordResult4.emoji)) {
                                    arrayList9.add(arrayList2.get(i20));
                                    y1Var.x++;
                                }
                            }
                        }
                    }
                    i18++;
                    arrayList5 = arrayList;
                }
            }
            String translitSafe = AndroidUtilities.translitSafe((y1Var.H + "").toLowerCase());
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList6.get(i21);
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    String translitSafe2 = AndroidUtilities.translitSafe((tL_messages_stickerSet.set.title + "").toLowerCase());
                    if (translitSafe2.startsWith(translitSafe) || vh.u(" ", translitSafe, translitSafe2)) {
                        int size = arrayList7.size();
                        arrayList7.add(tL_messages_stickerSet);
                        sparseIntArray.put(y1Var.x, size);
                        arrayList9.add(null);
                        y1Var.x++;
                        arrayList9.addAll(tL_messages_stickerSet.documents);
                        y1Var.x = tL_messages_stickerSet.documents.size() + y1Var.x;
                    }
                }
            }
            int i22 = i10;
            boolean z10 = (arrayList8.size() > i22 || arrayList9.size() > i22) ? 0 : i22;
            y1Var.w = z10;
            if (z10 != 0) {
                y1Var.x += i22;
            }
            if (z10 == 0) {
                y1Var.K += i22;
            }
            y1Var.I = y1Var.H;
            y1Var.l();
            n1.C1(z1Var.b, 0, 0);
            z1Var.f.c(false);
            z1Var.e.n(false);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str = (String) this.c;
        com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.d;
        String str2 = (String) obj;
        l c10 = FirebaseMessaging.c(firebaseMessaging.b);
        m9.h hVar = firebaseMessaging.a;
        hVar.a();
        String d = "[DEFAULT]".equals(hVar.b) ? "" : hVar.d();
        String a2 = firebaseMessaging.i.a();
        synchronized (c10) {
            String a10 = com.google.firebase.messaging.r.a(System.currentTimeMillis(), str2, a2);
            if (a10 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c10.b).edit();
                edit.putString(d + "|T|" + str + "|*", a10);
                edit.commit();
            }
        }
        if (rVar == null || !str2.equals(rVar.a)) {
            m9.h hVar2 = firebaseMessaging.a;
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
                new com.google.firebase.messaging.i(firebaseMessaging.b).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }

    @Override // org.telegram.ui.ux
    public boolean v(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, af1 af1Var) {
        switch (this.a) {
            case 2:
                return h7.R0((h7) this.b, (TL_stars.TL_starGiftUnique) this.d, (cy) this.c, arrayList);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                MessageObject messageObject = (MessageObject) this.d;
                TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.c;
                un unVar = chatActivityEnterView.P2;
                TLRPC.Message message = messageObject.messageOwner;
                long j10 = message.from_id.user_id;
                long j11 = message.via_bot_id;
                if (j11 != 0) {
                    j10 = j11;
                }
                TLRPC.User user = chatActivityEnterView.R.getMessagesController().getUser(Long.valueOf(j10));
                if (user == null) {
                    cyVar.finishFragment();
                } else {
                    long j12 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                    MediaDataController.getInstance(chatActivityEnterView.Q).saveDraft(j12, 0, "@" + UserObject.getPublicUsername(user) + " " + tL_inlineButtonTypeSwitchInline.query, null, null, true, 0L);
                    if (j12 == chatActivityEnterView.Q2) {
                        cyVar.finishFragment();
                    } else if (DialogObject.isEncryptedDialog(j12)) {
                        cyVar.finishFragment();
                    } else {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(j12)) {
                            bundle.putLong("user_id", j12);
                        } else {
                            bundle.putLong("chat_id", -j12);
                        }
                        if (chatActivityEnterView.R.getMessagesController().checkCanOpenChat(bundle, cyVar)) {
                            if (!unVar.presentFragment(new un(bundle), true)) {
                                cyVar.finishFragment();
                            } else if (!AndroidUtilities.isTablet()) {
                                unVar.removeSelfFromStack();
                            }
                        }
                    }
                }
                return true;
        }
    }

    public /* synthetic */ a(Object obj, String str, Object obj2, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = str;
        this.d = obj2;
    }

    public /* synthetic */ a(p0 p0Var, p1 p1Var, Bundle bundle, ResultReceiver resultReceiver) {
        this.a = 14;
        this.b = p0Var;
        this.d = bundle;
        this.c = resultReceiver;
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        h4 h4Var = (h4) this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
        u6 u6Var = (u6) this.c;
        q4 q4Var = h4Var.l;
        q4Var.getStoriesController().r(q4Var.q1, str, new bi.v3(h4Var, storyItem, u6Var, 3));
    }
}
