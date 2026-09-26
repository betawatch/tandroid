package ai;

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
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.ed0;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.hl;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.wi;
import org.telegram.ui.ky;
import org.telegram.ui.lo;
import org.telegram.ui.no0;
import org.telegram.ui.qy;
import org.telegram.ui.wf1;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q5 implements MessagesStorage.StringCallback, ec, androidx.car.app.utils.b, MediaDataController.KeywordResultCallback, org.telegram.ui.ActionBar.z1, SuccessContinuation, no0, cl, m4.j0, i9.p, cd0, org.telegram.ui.ActionBar.q0, ky, org.telegram.ui.Components.d5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q5(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 25:
                hl hlVar = (hl) this.b;
                hlVar.x0.b((TLRPC.TL_messageMediaGeo) this.c, hlVar.y0, z10, i10, ((Long) this.d).longValue());
                hlVar.b.dismiss(true);
                break;
            default:
                vn vnVar = (vn) this.b;
                vnVar.j0.e((TLRPC.TL_messageMediaToDo) this.c, null, null, null, z10, i10, ((Long) this.d).longValue());
                vnVar.b.dismiss(true);
                break;
        }
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean K(qy qyVar) {
        return false;
    }

    @Override // org.telegram.ui.no0
    public void a(int i10) {
        switch (this.a) {
            case 8:
                ei.f3 f3Var = (ei.f3) this.b;
                kd0 kd0Var = (kd0) this.c;
                String str = (String) this.d;
                if (i10 != 3) {
                    kd0Var.dismiss();
                }
                f3Var.d.x.G(str, org.telegram.ui.Cells.c1.w(i10).toLowerCase(Locale.ROOT), false);
                break;
            default:
                kd0 kd0Var2 = (kd0) this.b;
                ei.q4 q4Var = (ei.q4) this.c;
                String str2 = (String) this.d;
                if (i10 != 3) {
                    kd0Var2.dismiss();
                }
                q4Var.getWebViewContainer().G(str2, org.telegram.ui.Cells.c1.w(i10).toLowerCase(Locale.ROOT), false);
                break;
        }
    }

    @Override // i9.p
    public i9.w apply(Object obj) {
        int i10 = this.a;
        int i11 = 23;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i10) {
            case 14:
                m4.a0 a0Var = (m4.a0) obj4;
                Handler handler = a0Var.l;
                ki.h0 h0Var = new ki.h0(a0Var, (m4.r) obj3, new gg.t(a0Var, (m4.o0) obj2, (m4.s) obj, 26));
                m4.k1 k1Var = new m4.k1(0);
                String str = e2.d0.a;
                i9.c0 c0Var = new i9.c0();
                e2.d0.U(handler, new a3.k0(c0Var, h0Var, k1Var, i11));
                return c0Var;
            default:
                m4.a0 a0Var2 = (m4.a0) obj4;
                m4.r rVar = (m4.r) obj3;
                List list = (List) obj;
                Handler handler2 = a0Var2.l;
                ki.h0 h0Var2 = new ki.h0(a0Var2, rVar, new h5(a0Var2, (m4.y0) obj2, rVar, list, 25));
                m4.k1 k1Var2 = new m4.k1(0);
                String str2 = e2.d0.a;
                i9.c0 c0Var2 = new i9.c0();
                e2.d0.U(handler2, new a3.k0(c0Var2, h0Var2, k1Var2, i11));
                return c0Var2;
        }
    }

    @Override // org.telegram.ui.Components.cl
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        switch (this.a) {
            case 10:
                ii.r rVar = (ii.r) this.b;
                ii.a aVar = (ii.a) this.c;
                wi wiVar = (wi) this.d;
                ii.x3 x3Var = rVar.r;
                if (messageMedia != null && messageMedia.geo != null) {
                    ii.i2 i2Var = x3Var.J3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) aVar.b;
                    pageblockmap.geo = messageMedia.geo;
                    pageblockmap.zoom = 15;
                    if (pageblockmap.w <= 0 || pageblockmap.h <= 0) {
                        pageblockmap.w = 600;
                        pageblockmap.h = 400;
                    }
                    ii.i2 i2Var2 = x3Var.J3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                    rVar.V(true);
                    wiVar.dismiss(true);
                    x3Var.post(new ii.f(rVar, aVar, 0));
                    break;
                }
                break;
            default:
                ii.e2 e2Var = (ii.e2) this.b;
                ii.a aVar2 = (ii.a) this.c;
                wi wiVar2 = (wi) this.d;
                if (messageMedia != null && messageMedia.geo != null) {
                    ii.i2 i2Var3 = e2Var.P.J3;
                    if (i2Var3 != null) {
                        i2Var3.d();
                    }
                    TL_iv.pageBlockMap pageblockmap2 = (TL_iv.pageBlockMap) aVar2.b;
                    pageblockmap2.geo = messageMedia.geo;
                    pageblockmap2.zoom = 15;
                    if (pageblockmap2.w <= 0 || pageblockmap2.h <= 0) {
                        pageblockmap2.w = 600;
                        pageblockmap2.h = 400;
                    }
                    ii.i2 i2Var4 = e2Var.P.J3;
                    if (i2Var4 != null) {
                        i2Var4.h();
                    }
                    wiVar2.dismiss(true);
                    e2Var.P.post(new ii.n1(e2Var, aVar2, 9));
                    break;
                }
                break;
        }
    }

    @Override // androidx.car.app.utils.b
    public void call() {
        w.b bVar;
        switch (this.a) {
            case 2:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
                String str = (String) this.d;
                Object obj = this.c;
                if (obj == null) {
                    bVar = null;
                } else {
                    try {
                        bVar = new w.b(obj);
                    } catch (w.f e) {
                        androidx.car.app.utils.g.f(iOnDoneCallback, str, e);
                        return;
                    }
                }
                iOnDoneCallback.onSuccess(bVar);
                break;
            default:
                IOnDoneCallback iOnDoneCallback2 = (IOnDoneCallback) this.b;
                Exception exc = (Exception) this.c;
                String str2 = (String) this.d;
                try {
                    iOnDoneCallback2.onFailure(new w.b(new FailureResponse(exc)));
                    break;
                } catch (w.f e7) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e7);
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 5:
                ((ci.fa) this.b).g1((ci.da) this.c, (Runnable) this.d, true);
                break;
            case 7:
                Activity activity = (Activity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.d;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                qVar.run(bool, bool);
                break;
            case 9:
                gg.k1 k1Var = (gg.k1) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
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
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.c;
                ii.f4 f4Var = (ii.f4) this.d;
                String trim = editTextBoldCursor.getText().toString().trim();
                String trim2 = editTextBoldCursor2.getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
                    int i11 = f4Var.a;
                    ii.u3 u3Var = f4Var.b;
                    switch (i11) {
                        case 1:
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                            tL_inlineButtonTypeUrl.url = trim2;
                            u3Var.a(trim, tL_inlineButtonTypeUrl);
                            break;
                        default:
                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                            tL_inlineButtonTypeCopy.copy_text = trim2;
                            u3Var.a(trim, tL_inlineButtonTypeCopy);
                            break;
                    }
                }
                break;
            case 16:
                boolean[] zArr3 = (boolean[]) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) this.d;
                zArr3[0] = true;
                callback.run(Boolean.FALSE);
                a2VarArr[0].dismiss();
                break;
            case 20:
                ChatActivityEnterView.i((ChatActivityEnterView) this.b, (MessageObject) this.c, (TL_keyboard.KeyboardButtonProto) this.d);
                break;
            case 23:
                wi wiVar = (wi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.c;
                TLRPC.User user2 = (TLRPC.User) this.d;
                int i12 = wiVar.J1;
                if (tL_attachMenuBot == null) {
                    MediaDataController.getInstance(i12).removeInline(user2.id);
                    break;
                } else {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i12).getInputUser(user2);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new lo(6, wiVar, tL_attachMenuBot), 66);
                    break;
                }
            default:
                vn vnVar = (vn) this.b;
                View view = (View) this.c;
                org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) this.d;
                vnVar.getClass();
                view.setTag(null);
                vnVar.X(view, d6Var, false);
                break;
        }
    }

    @Override // m4.j0
    public void g(m4.r rVar) {
        m4.k0 k0Var = (m4.k0) this.b;
        Bundle bundle = (Bundle) this.c;
        ResultReceiver resultReceiver = (ResultReceiver) this.d;
        m4.a0 a0Var = k0Var.g;
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        i9.u n10 = a0Var.n(rVar);
        if (resultReceiver != null) {
            n10.a(new ki.h0(5, n10, resultReceiver), i9.q.a);
        }
    }

    @Override // ai.ec
    public void i(Canvas canvas, RectF rectF, float f7) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.b;
        dl0 dl0Var = (dl0) this.c;
        int[] iArr = (int[]) this.d;
        t7Var.c(canvas, rectF, f7);
        t7Var.f(canvas, rectF, f7);
        if (t7Var.h) {
            t7Var.b(canvas, rectF, f7);
        } else {
            t7Var.e(canvas, rectF, f7);
        }
        if (dl0Var != null && dl0Var.a0 && dl0Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f7 * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            dl0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void m(int i10) {
        Runnable runnable;
        org.telegram.ui.Components.d5 d5Var = (org.telegram.ui.Components.d5) this.b;
        boolean[] zArr = (boolean[]) this.c;
        org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.d;
        if (i10 == 1) {
            d5Var.J(2147483646, 0, zArr[0]);
            runnable = z2Var.a.dismissRunnable;
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.cd0
    public void q(ed0 ed0Var, int i10) {
        switch (this.a) {
            case 17:
                org.telegram.ui.Components.e5.g(null, null, 0L, 0L, 0, (ed0) this.b, (org.telegram.ui.Components.g4) this.c, (org.telegram.ui.Components.h4) this.d);
                break;
            default:
                org.telegram.ui.Components.e5.g(null, null, 0L, 0L, 0, (ed0) this.b, (org.telegram.ui.Components.x3) this.c, (org.telegram.ui.Components.z3) this.d);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        v5 v5Var = (v5) this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
        org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
        e6 e6Var = v5Var.l;
        e6Var.getStoriesController().r(e6Var.B1, str, new c5(v5Var, storyItem, d6Var, 2));
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str = (String) this.c;
        com.google.firebase.messaging.u uVar = (com.google.firebase.messaging.u) this.d;
        String str2 = (String) obj;
        a4.m c10 = FirebaseMessaging.c(firebaseMessaging.b);
        k9.h hVar = firebaseMessaging.a;
        hVar.a();
        String d = "[DEFAULT]".equals(hVar.b) ? "" : hVar.d();
        String a2 = firebaseMessaging.i.a();
        synchronized (c10) {
            String a10 = com.google.firebase.messaging.u.a(System.currentTimeMillis(), str2, a2);
            if (a10 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c10.b).edit();
                edit.putString(d + "|T|" + str + "|*", a10);
                edit.commit();
            }
        }
        if (uVar == null || !str2.equals(uVar.a)) {
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

    @Override // org.telegram.ui.ky
    public boolean u(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
        MessageObject messageObject = (MessageObject) this.c;
        TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.d;
        wn wnVar = chatActivityEnterView.P2;
        TLRPC.Message message = messageObject.messageOwner;
        long j3 = message.from_id.user_id;
        long j10 = message.via_bot_id;
        if (j10 != 0) {
            j3 = j10;
        }
        TLRPC.User user = chatActivityEnterView.R.getMessagesController().getUser(Long.valueOf(j3));
        if (user == null) {
            qyVar.finishFragment();
            return true;
        }
        long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        MediaDataController.getInstance(chatActivityEnterView.Q).saveDraft(j11, 0, "@" + UserObject.getPublicUsername(user) + " " + tL_inlineButtonTypeSwitchInline.query, null, null, true, 0L);
        if (j11 == chatActivityEnterView.Q2) {
            qyVar.finishFragment();
            return true;
        }
        if (DialogObject.isEncryptedDialog(j11)) {
            qyVar.finishFragment();
            return true;
        }
        Bundle bundle = new Bundle();
        if (DialogObject.isUserDialog(j11)) {
            bundle.putLong("user_id", j11);
        } else {
            bundle.putLong("chat_id", -j11);
        }
        if (chatActivityEnterView.R.getMessagesController().checkCanOpenChat(bundle, qyVar)) {
            if (!wnVar.presentFragment(new wn(bundle), true)) {
                qyVar.finishFragment();
                return true;
            }
            if (!AndroidUtilities.isTablet()) {
                wnVar.removeSelfFromStack();
            }
        }
        return true;
    }

    public /* synthetic */ q5(m4.k0 k0Var, m4.g1 g1Var, Bundle bundle, ResultReceiver resultReceiver) {
        this.a = 13;
        this.b = k0Var;
        this.c = bundle;
        this.d = resultReceiver;
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5 = arrayList;
        switch (this.a) {
            case 4:
                ci.d2 d2Var = (ci.d2) this.b;
                String str2 = (String) this.c;
                MediaDataController mediaDataController = (MediaDataController) this.d;
                ArrayList arrayList6 = d2Var.h;
                SparseIntArray sparseIntArray = d2Var.y;
                ArrayList arrayList7 = d2Var.n;
                ci.e2 e2Var = d2Var.N;
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
                            if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, translitSafe2)) {
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
                    ci.p1.w1(e2Var.b, 0, 0);
                    e2Var.f.c(false);
                    e2Var.e.n(false);
                    break;
                }
                break;
            case 28:
                org.telegram.ui.Components.ky kyVar = (org.telegram.ui.Components.ky) this.b;
                String str6 = (String) this.c;
                Runnable runnable = (Runnable) this.d;
                ly lyVar = kyVar.a;
                if (str6.equals(lyVar.v)) {
                    lyVar.w = str;
                    lyVar.n.addAll(arrayList5);
                    runnable.run();
                    break;
                }
                break;
            default:
                ez ezVar = (ez) this.b;
                HashMap hashMap = (HashMap) this.c;
                Runnable runnable2 = (Runnable) this.d;
                HashMap hashMap2 = ezVar.f;
                if (ezVar.w.M == ezVar.b) {
                    int size2 = arrayList5.size();
                    for (int i19 = 0; i19 < size2; i19++) {
                        String str7 = ((MediaDataController.KeywordResult) arrayList5.get(i19)).emoji;
                        ArrayList arrayList11 = (ArrayList) hashMap.get(str7);
                        if (arrayList11 != null && !arrayList11.isEmpty() && !hashMap2.containsKey(arrayList11)) {
                            hashMap2.put(arrayList11, str7);
                            ezVar.h.add(arrayList11);
                        }
                    }
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
