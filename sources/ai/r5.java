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
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.sc0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.bo;
import org.telegram.ui.fg1;
import org.telegram.ui.qo;
import org.telegram.ui.qy;
import org.telegram.ui.wy;
import org.telegram.ui.xo0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r5 implements MessagesStorage.StringCallback, ec, androidx.car.app.utils.b, MediaDataController.KeywordResultCallback, org.telegram.ui.ActionBar.b2, SuccessContinuation, xo0, bl, m4.k0, i9.p, sc0, org.telegram.ui.ActionBar.s0, qy, org.telegram.ui.Components.b5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r5(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.qy
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.b5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 25:
                gl glVar = (gl) this.b;
                glVar.x0.b((TLRPC.TL_messageMediaGeo) this.c, glVar.y0, z10, i10, ((Long) this.d).longValue());
                glVar.b.dismiss(true);
                break;
            default:
                un unVar = (un) this.b;
                unVar.j0.e((TLRPC.TL_messageMediaToDo) this.c, null, null, null, z10, i10, ((Long) this.d).longValue());
                unVar.b.dismiss(true);
                break;
        }
    }

    @Override // org.telegram.ui.qy
    public /* synthetic */ boolean K(wy wyVar) {
        return false;
    }

    @Override // org.telegram.ui.xo0
    public void a(int i10) {
        switch (this.a) {
            case 8:
                ei.f3 f3Var = (ei.f3) this.b;
                zc0 zc0Var = (zc0) this.c;
                String str = (String) this.d;
                if (i10 != 3) {
                    zc0Var.dismiss();
                }
                f3Var.d.x.G(str, org.telegram.ui.Cells.p6.w(i10).toLowerCase(Locale.ROOT), false);
                break;
            default:
                zc0 zc0Var2 = (zc0) this.b;
                ei.q4 q4Var = (ei.q4) this.c;
                String str2 = (String) this.d;
                if (i10 != 3) {
                    zc0Var2.dismiss();
                }
                q4Var.getWebViewContainer().G(str2, org.telegram.ui.Cells.p6.w(i10).toLowerCase(Locale.ROOT), false);
                break;
        }
    }

    @Override // i9.p
    public i9.w apply(Object obj) {
        int i10 = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        int i11 = 23;
        switch (i10) {
            case 14:
                m4.a0 a0Var = (m4.a0) obj4;
                Handler handler = a0Var.l;
                gg.x1 x1Var = new gg.x1(a0Var, (m4.r) obj3, new gg.t(a0Var, (m4.u0) obj2, (m4.s) obj, i11));
                m4.q1 q1Var = new m4.q1(0);
                String str = e2.d0.a;
                i9.c0 c0Var = new i9.c0();
                e2.d0.U(handler, new a3.k0(c0Var, x1Var, q1Var, i11));
                return c0Var;
            default:
                m4.a0 a0Var2 = (m4.a0) obj4;
                m4.r rVar = (m4.r) obj3;
                List list = (List) obj;
                Handler handler2 = a0Var2.l;
                gg.x1 x1Var2 = new gg.x1(a0Var2, rVar, new i5(a0Var2, (m4.e1) obj2, rVar, list, 24));
                m4.q1 q1Var2 = new m4.q1(0);
                String str2 = e2.d0.a;
                i9.c0 c0Var2 = new i9.c0();
                e2.d0.U(handler2, new a3.k0(c0Var2, x1Var2, q1Var2, i11));
                return c0Var2;
        }
    }

    @Override // org.telegram.ui.Components.bl
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        switch (this.a) {
            case 10:
                ii.r rVar = (ii.r) this.b;
                ii.a aVar = (ii.a) this.c;
                vi viVar = (vi) this.d;
                ii.w3 w3Var = rVar.r;
                if (messageMedia != null && messageMedia.geo != null) {
                    ii.h2 h2Var = w3Var.J3;
                    if (h2Var != null) {
                        h2Var.d();
                    }
                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) aVar.b;
                    pageblockmap.geo = messageMedia.geo;
                    pageblockmap.zoom = 15;
                    if (pageblockmap.w <= 0 || pageblockmap.h <= 0) {
                        pageblockmap.w = 600;
                        pageblockmap.h = 400;
                    }
                    ii.h2 h2Var2 = w3Var.J3;
                    if (h2Var2 != null) {
                        h2Var2.h();
                    }
                    rVar.V(true);
                    viVar.dismiss(true);
                    w3Var.post(new ii.f(rVar, aVar, 0));
                    break;
                }
                break;
            default:
                ii.d2 d2Var = (ii.d2) this.b;
                ii.a aVar2 = (ii.a) this.c;
                vi viVar2 = (vi) this.d;
                if (messageMedia != null && messageMedia.geo != null) {
                    ii.h2 h2Var3 = d2Var.P.J3;
                    if (h2Var3 != null) {
                        h2Var3.d();
                    }
                    TL_iv.pageBlockMap pageblockmap2 = (TL_iv.pageBlockMap) aVar2.b;
                    pageblockmap2.geo = messageMedia.geo;
                    pageblockmap2.zoom = 15;
                    if (pageblockmap2.w <= 0 || pageblockmap2.h <= 0) {
                        pageblockmap2.w = 600;
                        pageblockmap2.h = 400;
                    }
                    ii.h2 h2Var4 = d2Var.P.J3;
                    if (h2Var4 != null) {
                        h2Var4.h();
                    }
                    viVar2.dismiss(true);
                    d2Var.P.post(new ii.n1(d2Var, aVar2, 9));
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
                    } catch (w.g e) {
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
                } catch (w.g e7) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e7);
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 5:
                ((ci.ia) this.b).g1((ci.ga) this.c, (Runnable) this.d, true);
                break;
            case 7:
                Activity activity = (Activity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) this.d;
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
                ii.e4 e4Var = (ii.e4) this.d;
                String trim = editTextBoldCursor.getText().toString().trim();
                String trim2 = editTextBoldCursor2.getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
                    int i11 = e4Var.a;
                    ii.t3 t3Var = e4Var.b;
                    switch (i11) {
                        case 1:
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                            tL_inlineButtonTypeUrl.url = trim2;
                            t3Var.a(trim, tL_inlineButtonTypeUrl);
                            break;
                        default:
                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                            tL_inlineButtonTypeCopy.copy_text = trim2;
                            t3Var.a(trim, tL_inlineButtonTypeCopy);
                            break;
                    }
                }
                break;
            case 16:
                boolean[] zArr3 = (boolean[]) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.d;
                zArr3[0] = true;
                callback.run(Boolean.FALSE);
                c2VarArr[0].dismiss();
                break;
            case 20:
                ChatActivityEnterView.i((ChatActivityEnterView) this.b, (MessageObject) this.c, (TL_keyboard.KeyboardButtonProto) this.d);
                break;
            case 23:
                vi viVar = (vi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.c;
                TLRPC.User user2 = (TLRPC.User) this.d;
                int i12 = viVar.J1;
                if (tL_attachMenuBot == null) {
                    MediaDataController.getInstance(i12).removeInline(user2.id);
                    break;
                } else {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i12).getInputUser(user2);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new qo(6, viVar, tL_attachMenuBot), 66);
                    break;
                }
            default:
                un unVar = (un) this.b;
                View view = (View) this.c;
                org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) this.d;
                unVar.getClass();
                view.setTag(null);
                unVar.X(view, c6Var, false);
                break;
        }
    }

    @Override // m4.k0
    public void g(m4.r rVar) {
        m4.l0 l0Var = (m4.l0) this.b;
        Bundle bundle = (Bundle) this.c;
        ResultReceiver resultReceiver = (ResultReceiver) this.d;
        m4.a0 a0Var = l0Var.g;
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        i9.u n10 = a0Var.n(rVar);
        if (resultReceiver != null) {
            n10.a(new m4.g0(0, n10, resultReceiver), i9.q.a);
        }
    }

    @Override // ai.ec
    public void h(Canvas canvas, RectF rectF, float f7) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.b;
        tk0 tk0Var = (tk0) this.c;
        int[] iArr = (int[]) this.d;
        t7Var.c(canvas, rectF, f7);
        t7Var.f(canvas, rectF, f7);
        if (t7Var.h) {
            t7Var.b(canvas, rectF, f7);
        } else {
            t7Var.e(canvas, rectF, f7);
        }
        if (tk0Var != null && tk0Var.a0 && tk0Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f7 * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            tk0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void m(int i10) {
        Runnable runnable;
        org.telegram.ui.Components.b5 b5Var = (org.telegram.ui.Components.b5) this.b;
        boolean[] zArr = (boolean[]) this.c;
        org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) this.d;
        if (i10 == 1) {
            b5Var.J(2147483646, 0, zArr[0]);
            runnable = b3Var.a.dismissRunnable;
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.sc0
    public void q(uc0 uc0Var, int i10) {
        switch (this.a) {
            case 17:
                org.telegram.ui.Components.c5.g(null, null, 0L, 0L, 0, (uc0) this.b, (org.telegram.ui.Components.e4) this.c, (org.telegram.ui.Components.f4) this.d);
                break;
            default:
                org.telegram.ui.Components.c5.g(null, null, 0L, 0L, 0, (uc0) this.b, (org.telegram.ui.Components.v3) this.c, (org.telegram.ui.Components.x3) this.d);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        w5 w5Var = (w5) this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.d;
        f6 f6Var2 = w5Var.l;
        f6Var2.getStoriesController().r(f6Var2.B1, str, new d5(w5Var, storyItem, f6Var, 2));
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str = (String) this.c;
        com.google.firebase.messaging.u uVar = (com.google.firebase.messaging.u) this.d;
        String str2 = (String) obj;
        com.google.firebase.messaging.v c10 = FirebaseMessaging.c(firebaseMessaging.b);
        k9.h hVar = firebaseMessaging.a;
        hVar.a();
        String d = "[DEFAULT]".equals(hVar.b) ? "" : hVar.d();
        String a2 = firebaseMessaging.i.a();
        synchronized (c10) {
            String a10 = com.google.firebase.messaging.u.a(System.currentTimeMillis(), str2, a2);
            if (a10 != null) {
                SharedPreferences.Editor edit = c10.a.edit();
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

    @Override // org.telegram.ui.qy
    public boolean u(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
        MessageObject messageObject = (MessageObject) this.c;
        TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.d;
        bo boVar = chatActivityEnterView.O2;
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
            if (!boVar.presentFragment(new bo(bundle), true)) {
                wyVar.finishFragment();
                return true;
            }
            if (!AndroidUtilities.isTablet()) {
                boVar.removeSelfFromStack();
            }
        }
        return true;
    }

    public /* synthetic */ r5(m4.l0 l0Var, m4.m1 m1Var, Bundle bundle, ResultReceiver resultReceiver) {
        this.a = 13;
        this.b = l0Var;
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
                            if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.w1.w(" ", translitSafe, translitSafe2)) {
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
                    ci.p1.x1(e2Var.b, 0, 0);
                    e2Var.f.c(false);
                    e2Var.e.n(false);
                    break;
                }
                break;
            case 28:
                iy iyVar = (iy) this.b;
                String str6 = (String) this.c;
                Runnable runnable = (Runnable) this.d;
                jy jyVar = iyVar.a;
                if (str6.equals(jyVar.v)) {
                    jyVar.w = str;
                    jyVar.n.addAll(arrayList5);
                    runnable.run();
                    break;
                }
                break;
            default:
                dz dzVar = (dz) this.b;
                HashMap hashMap = (HashMap) this.c;
                Runnable runnable2 = (Runnable) this.d;
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
