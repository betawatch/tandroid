package androidx.car.app.utils;

import a3.k0;
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
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import bi.f5;
import bi.kb;
import bi.o4;
import bi.o5;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import di.d2;
import di.e2;
import di.ga;
import di.ia;
import e2.d0;
import fi.f3;
import fi.r4;
import hg.k1;
import hg.t;
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
import ji.b5;
import ji.c2;
import ji.e4;
import ji.g2;
import ji.m1;
import ji.s3;
import ji.v3;
import m4.a0;
import m4.d1;
import m4.j0;
import m4.l1;
import m4.p1;
import m4.r;
import m4.s;
import m4.t0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.w1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.a3;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.r0;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.g4;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.h4;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tc0;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.x3;
import org.telegram.ui.Components.z3;
import org.telegram.ui.co;
import org.telegram.ui.eg1;
import org.telegram.ui.oy;
import org.telegram.ui.ro;
import org.telegram.ui.uy;
import org.telegram.ui.wo0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements d, MessagesStorage.StringCallback, kb, SuccessContinuation, MediaDataController.KeywordResultCallback, a2, wo0, bl, j0, p, tc0, r0, oy, d5 {
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

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 25:
                gl glVar = (gl) this.b;
                glVar.x0.b((TLRPC.TL_messageMediaGeo) this.d, glVar.y0, z10, i10, ((Long) this.c).longValue());
                glVar.b.dismiss(true);
                break;
            default:
                tn tnVar = (tn) this.b;
                tnVar.j0.d((TLRPC.TL_messageMediaToDo) this.d, null, null, null, z10, i10, ((Long) this.c).longValue());
                tnVar.b.dismiss(true);
                break;
        }
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean K(uy uyVar) {
        return false;
    }

    @Override // org.telegram.ui.wo0
    public void a(int i10) {
        switch (this.a) {
            case 8:
                f3 f3Var = (f3) this.b;
                ad0 ad0Var = (ad0) this.d;
                String str = (String) this.c;
                if (i10 != 3) {
                    ad0Var.dismiss();
                }
                f3Var.d.x.G(str, p6.w(i10).toLowerCase(Locale.ROOT), false);
                break;
            default:
                ad0 ad0Var2 = (ad0) this.b;
                r4 r4Var = (r4) this.d;
                String str2 = (String) this.c;
                if (i10 != 3) {
                    ad0Var2.dismiss();
                }
                r4Var.getWebViewContainer().G(str2, p6.w(i10).toLowerCase(Locale.ROOT), false);
                break;
        }
    }

    @Override // i9.p
    public w apply(Object obj) {
        int i10 = this.a;
        Object obj2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.b;
        int i11 = 23;
        switch (i10) {
            case 14:
                a0 a0Var = (a0) obj4;
                Handler handler = a0Var.l;
                b5 b5Var = new b5(a0Var, (r) obj3, new t(a0Var, (t0) obj2, (s) obj, i11));
                p1 p1Var = new p1(0);
                String str = d0.a;
                c0 c0Var = new c0();
                d0.U(handler, new k0(c0Var, b5Var, p1Var, i11));
                return c0Var;
            default:
                a0 a0Var2 = (a0) obj4;
                r rVar = (r) obj3;
                List list = (List) obj;
                Handler handler2 = a0Var2.l;
                b5 b5Var2 = new b5(a0Var2, rVar, new b(a0Var2, (d1) obj2, rVar, list, 25));
                p1 p1Var2 = new p1(0);
                String str2 = d0.a;
                c0 c0Var2 = new c0();
                d0.U(handler2, new k0(c0Var2, b5Var2, p1Var2, i11));
                return c0Var2;
        }
    }

    @Override // org.telegram.ui.Components.bl
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        switch (this.a) {
            case 10:
                ji.r rVar = (ji.r) this.b;
                ji.a aVar = (ji.a) this.d;
                vi viVar = (vi) this.c;
                v3 v3Var = rVar.r;
                if (messageMedia != null && messageMedia.geo != null) {
                    g2 g2Var = v3Var.J3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) aVar.b;
                    pageblockmap.geo = messageMedia.geo;
                    pageblockmap.zoom = 15;
                    if (pageblockmap.w <= 0 || pageblockmap.h <= 0) {
                        pageblockmap.w = 600;
                        pageblockmap.h = 400;
                    }
                    g2 g2Var2 = v3Var.J3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                    rVar.V(true);
                    viVar.dismiss(true);
                    v3Var.post(new ji.f(rVar, aVar, 0));
                    break;
                }
                break;
            default:
                c2 c2Var = (c2) this.b;
                ji.a aVar2 = (ji.a) this.d;
                vi viVar2 = (vi) this.c;
                if (messageMedia != null && messageMedia.geo != null) {
                    g2 g2Var3 = c2Var.P.J3;
                    if (g2Var3 != null) {
                        g2Var3.d();
                    }
                    TL_iv.pageBlockMap pageblockmap2 = (TL_iv.pageBlockMap) aVar2.b;
                    pageblockmap2.geo = messageMedia.geo;
                    pageblockmap2.zoom = 15;
                    if (pageblockmap2.w <= 0 || pageblockmap2.h <= 0) {
                        pageblockmap2.w = 600;
                        pageblockmap2.h = 400;
                    }
                    g2 g2Var4 = c2Var.P.J3;
                    if (g2Var4 != null) {
                        g2Var4.h();
                    }
                    viVar2.dismiss(true);
                    c2Var.P.post(new m1(c2Var, aVar2, 9));
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
                    } catch (w.g e7) {
                        i.f(iOnDoneCallback, str, e7);
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
                } catch (w.g e10) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e10);
                }
        }
    }

    @Override // m4.j0
    public void f(r rVar) {
        m4.k0 k0Var = (m4.k0) this.b;
        Bundle bundle = (Bundle) this.d;
        ResultReceiver resultReceiver = (ResultReceiver) this.c;
        a0 a0Var = k0Var.g;
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        u n10 = a0Var.n(rVar);
        if (resultReceiver != null) {
            n10.a(new b5(8, n10, resultReceiver), q.a);
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(b2 b2Var, int i10) {
        switch (this.a) {
            case 6:
                ((ia) this.b).g1((ga) this.d, (Runnable) this.c, true);
                break;
            case 7:
                Activity activity = (Activity) this.b;
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.c;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                sVar.run(bool, bool);
                break;
            case 9:
                k1 k1Var = (k1) this.b;
                boolean[] zArr2 = (boolean[]) this.d;
                TLRPC.User user = (TLRPC.User) this.c;
                k1Var.getClass();
                zArr2[0] = true;
                if (user != null) {
                    MessagesController.getNotificationsSettings(k1Var.f).edit().putBoolean("inlinegeo_" + user.id, true).commit();
                    k1Var.G();
                    break;
                }
                break;
            case 12:
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
            case 16:
                boolean[] zArr3 = (boolean[]) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                b2[] b2VarArr = (b2[]) this.c;
                zArr3[0] = true;
                callback.run(Boolean.FALSE);
                b2VarArr[0].dismiss();
                break;
            case 20:
                ChatActivityEnterView.i((ChatActivityEnterView) this.b, (MessageObject) this.d, (TL_keyboard.KeyboardButtonProto) this.c);
                break;
            case 23:
                vi viVar = (vi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.d;
                TLRPC.User user2 = (TLRPC.User) this.c;
                int i12 = viVar.J1;
                if (tL_attachMenuBot == null) {
                    MediaDataController.getInstance(i12).removeInline(user2.id);
                    break;
                } else {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i12).getInputUser(user2);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new ro(6, viVar, tL_attachMenuBot), 66);
                    break;
                }
            default:
                tn tnVar = (tn) this.b;
                View view = (View) this.d;
                c6 c6Var = (c6) this.c;
                tnVar.getClass();
                view.setTag(null);
                tnVar.X(view, c6Var, false);
                break;
        }
    }

    @Override // bi.kb
    public void h(Canvas canvas, RectF rectF, float f7) {
        t7 t7Var = (t7) this.b;
        sk0 sk0Var = (sk0) this.d;
        int[] iArr = (int[]) this.c;
        t7Var.c(canvas, rectF, f7);
        t7Var.f(canvas, rectF, f7);
        if (t7Var.h) {
            t7Var.b(canvas, rectF, f7);
        } else {
            t7Var.e(canvas, rectF, f7);
        }
        if (sk0Var != null && sk0Var.a0 && sk0Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f7 * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            sk0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        Runnable runnable;
        d5 d5Var = (d5) this.b;
        boolean[] zArr = (boolean[]) this.d;
        a3 a3Var = (a3) this.c;
        if (i10 == 1) {
            d5Var.J(2147483646, 0, zArr[0]);
            runnable = a3Var.a.dismissRunnable;
            runnable.run();
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        f5 f5Var = (f5) this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
        f6 f6Var = (f6) this.c;
        o5 o5Var = f5Var.l;
        o5Var.getStoriesController().r(o5Var.B1, str, new o4(f5Var, storyItem, f6Var, 2));
    }

    @Override // org.telegram.ui.Components.tc0
    public void s(vc0 vc0Var, int i10) {
        switch (this.a) {
            case 17:
                e5.g(null, null, 0L, 0L, 0, (vc0) this.b, (g4) this.d, (h4) this.c);
                break;
            default:
                e5.g(null, null, 0L, 0L, 0, (vc0) this.b, (x3) this.d, (z3) this.c);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str = (String) this.c;
        com.google.firebase.messaging.t tVar = (com.google.firebase.messaging.t) this.d;
        String str2 = (String) obj;
        a6.i c10 = FirebaseMessaging.c(firebaseMessaging.b);
        k9.h hVar = firebaseMessaging.a;
        hVar.a();
        String d = "[DEFAULT]".equals(hVar.b) ? "" : hVar.d();
        String a2 = firebaseMessaging.i.a();
        synchronized (c10) {
            String a10 = com.google.firebase.messaging.t.a(System.currentTimeMillis(), str2, a2);
            if (a10 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c10.b).edit();
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

    @Override // org.telegram.ui.oy
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
        MessageObject messageObject = (MessageObject) this.d;
        TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.c;
        co coVar = chatActivityEnterView.O2;
        TLRPC.Message message = messageObject.messageOwner;
        long j3 = message.from_id.user_id;
        long j10 = message.via_bot_id;
        if (j10 != 0) {
            j3 = j10;
        }
        TLRPC.User user = chatActivityEnterView.R.getMessagesController().getUser(Long.valueOf(j3));
        if (user == null) {
            uyVar.finishFragment();
            return true;
        }
        long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        MediaDataController.getInstance(chatActivityEnterView.Q).saveDraft(j11, 0, "@" + UserObject.getPublicUsername(user) + " " + tL_inlineButtonTypeSwitchInline.query, null, null, true, 0L);
        if (j11 == chatActivityEnterView.P2) {
            uyVar.finishFragment();
            return true;
        }
        if (DialogObject.isEncryptedDialog(j11)) {
            uyVar.finishFragment();
            return true;
        }
        Bundle bundle = new Bundle();
        if (DialogObject.isUserDialog(j11)) {
            bundle.putLong("user_id", j11);
        } else {
            bundle.putLong("chat_id", -j11);
        }
        if (chatActivityEnterView.R.getMessagesController().checkCanOpenChat(bundle, uyVar)) {
            if (!coVar.presentFragment(new co(bundle), true)) {
                uyVar.finishFragment();
                return true;
            }
            if (!AndroidUtilities.isTablet()) {
                coVar.removeSelfFromStack();
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

    public /* synthetic */ a(m4.k0 k0Var, l1 l1Var, Bundle bundle, ResultReceiver resultReceiver) {
        this.a = 13;
        this.b = k0Var;
        this.d = bundle;
        this.c = resultReceiver;
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5 = arrayList;
        switch (this.a) {
            case 5:
                d2 d2Var = (d2) this.b;
                String str2 = (String) this.c;
                MediaDataController mediaDataController = (MediaDataController) this.d;
                ArrayList arrayList6 = d2Var.h;
                SparseIntArray sparseIntArray = d2Var.y;
                ArrayList arrayList7 = d2Var.n;
                e2 e2Var = d2Var.N;
                ArrayList arrayList8 = d2Var.v;
                HashSet hashSet = d2Var.L;
                ArrayList arrayList9 = d2Var.s;
                if (TextUtils.equals(str2, d2Var.H)) {
                    ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(d2Var.H);
                    for (int i10 = 0; i10 < parseEmojis.size(); i10++) {
                        try {
                            MediaDataController.KeywordResult keywordResult = new MediaDataController.KeywordResult();
                            keywordResult.emoji = parseEmojis.get(i10).code.toString();
                            arrayList5.add(keywordResult);
                        } catch (Exception unused) {
                        }
                    }
                    d2Var.x = 0;
                    arrayList9.clear();
                    arrayList8.clear();
                    sparseIntArray.clear();
                    arrayList7.clear();
                    d2Var.x++;
                    arrayList9.add(null);
                    arrayList8.add(0L);
                    if (e2Var.a == 0) {
                        hashSet.clear();
                        for (int i11 = 0; i11 < arrayList5.size(); i11++) {
                            MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) arrayList5.get(i11);
                            String str3 = keywordResult2.emoji;
                            if (str3 != null && !str3.startsWith("animated_") && (arrayList4 = (ArrayList) d2Var.d.get(keywordResult2.emoji)) != null) {
                                hashSet.addAll(arrayList4);
                            }
                        }
                        arrayList8.addAll(hashSet);
                        for (int i12 = 0; i12 < hashSet.size(); i12++) {
                            arrayList9.add(null);
                        }
                        d2Var.x = hashSet.size() + d2Var.x;
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
                                        d2Var.x++;
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
                                            d2Var.x++;
                                        }
                                    }
                                }
                            }
                            i15++;
                            arrayList5 = arrayList;
                        }
                    }
                    String translitSafe = AndroidUtilities.translitSafe((d2Var.H + "").toLowerCase());
                    for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList6.get(i18);
                        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                            String translitSafe2 = AndroidUtilities.translitSafe((tL_messages_stickerSet.set.title + "").toLowerCase());
                            if (translitSafe2.startsWith(translitSafe) || w1.w(" ", translitSafe, translitSafe2)) {
                                int size = arrayList7.size();
                                arrayList7.add(tL_messages_stickerSet);
                                sparseIntArray.put(d2Var.x, size);
                                arrayList9.add(null);
                                d2Var.x++;
                                arrayList9.addAll(tL_messages_stickerSet.documents);
                                d2Var.x = tL_messages_stickerSet.documents.size() + d2Var.x;
                            }
                        }
                    }
                    boolean z10 = arrayList8.size() <= 1 && arrayList9.size() <= 1;
                    d2Var.w = z10;
                    if (z10) {
                        d2Var.x++;
                    }
                    if (!z10) {
                        d2Var.K++;
                    }
                    d2Var.I = d2Var.H;
                    d2Var.l();
                    di.p1.v1(e2Var.b, 0, 0);
                    e2Var.f.c(false);
                    e2Var.e.n(false);
                    break;
                }
                break;
            case 28:
                jy jyVar = (jy) this.b;
                String str6 = (String) this.c;
                Runnable runnable = (Runnable) this.d;
                ky kyVar = jyVar.a;
                if (str6.equals(kyVar.v)) {
                    kyVar.w = str;
                    kyVar.n.addAll(arrayList5);
                    runnable.run();
                    break;
                }
                break;
            default:
                dz dzVar = (dz) this.b;
                HashMap hashMap = (HashMap) this.d;
                Runnable runnable2 = (Runnable) this.c;
                HashMap hashMap2 = dzVar.f;
                if (dzVar.w.M == dzVar.b) {
                    int size2 = arrayList5.size();
                    for (int i19 = 0; i19 < size2; i19++) {
                        String str7 = ((MediaDataController.KeywordResult) arrayList5.get(i19)).emoji;
                        ArrayList arrayList11 = (ArrayList) hashMap.get(str7);
                        if (arrayList11 != null && !arrayList11.isEmpty() && !hashMap2.containsKey(arrayList11)) {
                            hashMap2.put(arrayList11, str7);
                            dzVar.h.add(arrayList11);
                        }
                    }
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
