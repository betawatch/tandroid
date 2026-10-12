package androidx.car.app.utils;

import a3.l0;
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
import bi.h5;
import bi.nb;
import bi.q5;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import di.c2;
import di.ca;
import di.ea;
import di.o1;
import e2.m0;
import fi.f3;
import fi.q4;
import hg.j1;
import hg.t;
import ig.b1;
import j9.e0;
import j9.q;
import j9.y;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import ji.d2;
import ji.g4;
import ji.h2;
import ji.m1;
import ji.r;
import ji.u3;
import ji.v2;
import ji.x3;
import m4.f0;
import m4.g1;
import m4.p0;
import m4.p1;
import m4.t1;
import m4.w;
import m4.w0;
import m4.x;
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
import org.telegram.messenger.yh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.q0;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Cells.d0;
import org.telegram.ui.Cells.d6;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b4;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.i4;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.j4;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.ul;
import org.telegram.ui.Components.uy;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.z3;
import org.telegram.ui.Components.zd0;
import org.telegram.ui.bp0;
import org.telegram.ui.fo;
import org.telegram.ui.lg1;
import org.telegram.ui.sy;
import org.telegram.ui.to;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements d, MessagesStorage.StringCallback, nb, SuccessContinuation, MediaDataController.KeywordResultCallback, z1, bp0, pl, p0, q, sd0, q0, sy, f5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(int i10, Object obj, Object obj2, String str) {
        this.a = i10;
        this.b = obj;
        this.c = str;
        this.d = obj2;
    }

    @Override // org.telegram.ui.sy
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 26:
                ul ulVar = (ul) this.b;
                ulVar.x0.b((TLRPC.TL_messageMediaGeo) this.d, ulVar.y0, z10, i10, ((Long) this.c).longValue());
                ulVar.b.dismiss(true);
                break;
            default:
                io ioVar = (io) this.b;
                ioVar.j0.d((TLRPC.TL_messageMediaToDo) this.d, null, null, null, z10, i10, ((Long) this.c).longValue());
                ioVar.b.dismiss(true);
                break;
        }
    }

    @Override // org.telegram.ui.sy
    public /* synthetic */ boolean L(yy yyVar) {
        return false;
    }

    @Override // org.telegram.ui.bp0
    public void a(int i10) {
        switch (this.a) {
            case 8:
                f3 f3Var = (f3) this.b;
                zd0 zd0Var = (zd0) this.d;
                String str = (String) this.c;
                if (i10 != 3) {
                    zd0Var.dismiss();
                }
                f3Var.d.x.F(str, d0.z(i10).toLowerCase(Locale.ROOT), false);
                break;
            default:
                zd0 zd0Var2 = (zd0) this.b;
                q4 q4Var = (q4) this.d;
                String str2 = (String) this.c;
                if (i10 != 3) {
                    zd0Var2.dismiss();
                }
                q4Var.getWebViewContainer().F(str2, d0.z(i10).toLowerCase(Locale.ROOT), false);
                break;
        }
    }

    @Override // j9.q
    public y apply(Object obj) {
        int i10 = this.a;
        int i11 = 23;
        Object obj2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (i10) {
            case 14:
                f0 f0Var = (f0) obj4;
                Handler handler = f0Var.l;
                v2 v2Var = new v2(f0Var, (w) obj3, new t(f0Var, (w0) obj2, (x) obj, 28));
                t1 t1Var = new t1(0);
                String str = m0.a;
                e0 e0Var = new e0();
                m0.W(handler, new l0(e0Var, v2Var, t1Var, i11));
                return e0Var;
            default:
                f0 f0Var2 = (f0) obj4;
                w wVar = (w) obj3;
                List list = (List) obj;
                Handler handler2 = f0Var2.l;
                v2 v2Var2 = new v2(f0Var2, wVar, new b(f0Var2, (g1) obj2, wVar, list, 24));
                t1 t1Var2 = new t1(0);
                String str2 = m0.a;
                e0 e0Var2 = new e0();
                m0.W(handler2, new l0(e0Var2, v2Var2, t1Var2, i11));
                return e0Var2;
        }
    }

    @Override // org.telegram.ui.Components.pl
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        switch (this.a) {
            case 10:
                r rVar = (r) this.b;
                ji.a aVar = (ji.a) this.d;
                vi viVar = (vi) this.c;
                x3 x3Var = rVar.r;
                if (messageMedia != null && messageMedia.geo != null) {
                    h2 h2Var = x3Var.H3;
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
                    h2 h2Var2 = x3Var.H3;
                    if (h2Var2 != null) {
                        h2Var2.h();
                    }
                    rVar.Y(true);
                    viVar.dismiss(true);
                    x3Var.post(new ji.f(rVar, aVar, 0));
                    break;
                }
                break;
            default:
                d2 d2Var = (d2) this.b;
                ji.a aVar2 = (ji.a) this.d;
                vi viVar2 = (vi) this.c;
                if (messageMedia != null && messageMedia.geo != null) {
                    h2 h2Var3 = d2Var.P.H3;
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
                    h2 h2Var4 = d2Var.P.H3;
                    if (h2Var4 != null) {
                        h2Var4.h();
                    }
                    viVar2.dismiss(true);
                    d2Var.P.post(new m1(d2Var, aVar2, 9));
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
                    } catch (w.f e) {
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
                } catch (w.f e7) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e7);
                }
        }
    }

    @Override // m4.p0
    public void f(w wVar) {
        m4.q0 q0Var = (m4.q0) this.b;
        Bundle bundle = (Bundle) this.d;
        ResultReceiver resultReceiver = (ResultReceiver) this.c;
        f0 f0Var = q0Var.g;
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        j9.w n10 = f0Var.n(wVar);
        if (resultReceiver != null) {
            n10.a(new v2(17, n10, resultReceiver), j9.r.a);
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(a2 a2Var, int i10) {
        switch (this.a) {
            case 6:
                ((ea) this.b).h1((ca) this.d, (Runnable) this.c, true);
                break;
            case 7:
                Activity activity = (Activity) this.b;
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.c;
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
            case 12:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                g4 g4Var = (g4) this.c;
                String trim = editTextBoldCursor.getText().toString().trim();
                String trim2 = editTextBoldCursor2.getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
                    int i11 = g4Var.a;
                    u3 u3Var = g4Var.b;
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
                Utilities.Callback callback = (Utilities.Callback) this.d;
                a2[] a2VarArr = (a2[]) this.c;
                zArr3[0] = true;
                callback.run(Boolean.FALSE);
                a2VarArr[0].dismiss();
                break;
            case 20:
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
            case 23:
                vi viVar = (vi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.d;
                TLRPC.User user2 = (TLRPC.User) this.c;
                int i12 = viVar.M1;
                if (tL_attachMenuBot == null) {
                    MediaDataController.getInstance(i12).removeInline(user2.id);
                    break;
                } else {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i12).getInputUser(user2);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new to(6, viVar, tL_attachMenuBot), 66);
                    break;
                }
            case 25:
                dl dlVar = (dl) this.b;
                b1 b1Var = (b1) this.d;
                org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) this.c;
                TextView textView = dlVar.R;
                if (b1Var.getText().toString().getBytes(StandardCharsets.UTF_8).length <= 960) {
                    String trim3 = b1Var.getText().toString().trim();
                    if (TextUtils.isEmpty(trim3)) {
                        trim3 = null;
                    }
                    dlVar.p0 = trim3;
                    dlVar.q0 = !a2Var2.b();
                    if (TextUtils.isEmpty(dlVar.p0)) {
                        textView.setVisibility(8);
                    } else {
                        textView.setText(dlVar.p0);
                        textView.setVisibility(0);
                    }
                    dlVar.i0();
                    a2Var.dismiss();
                    dlVar.Y();
                    break;
                } else {
                    int i13 = -dlVar.s0;
                    dlVar.s0 = i13;
                    AndroidUtilities.shakeViewSpring(b1Var, i13);
                    break;
                }
            default:
                io ioVar = (io) this.b;
                View view = (View) this.d;
                d6 d6Var = (d6) this.c;
                ioVar.getClass();
                view.setTag(null);
                ioVar.a0(view, d6Var, false);
                break;
        }
    }

    @Override // bi.nb
    public void h(Canvas canvas, RectF rectF, float f7) {
        t7 t7Var = (t7) this.b;
        tl0 tl0Var = (tl0) this.d;
        int[] iArr = (int[]) this.c;
        t7Var.c(canvas, rectF, f7);
        t7Var.f(canvas, rectF, f7);
        if (t7Var.h) {
            t7Var.b(canvas, rectF, f7);
        } else {
            t7Var.e(canvas, rectF, f7);
        }
        if (tl0Var != null && tl0Var.a0 && tl0Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f7 * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            tl0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void l(int i10) {
        Runnable runnable;
        f5 f5Var = (f5) this.b;
        boolean[] zArr = (boolean[]) this.d;
        z2 z2Var = (z2) this.c;
        if (i10 == 1) {
            f5Var.J(2147483646, 0, zArr[0]);
            runnable = z2Var.a.dismissRunnable;
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.sd0
    public void r(ud0 ud0Var, int i10) {
        switch (this.a) {
            case 17:
                g5.f(null, null, 0L, 0L, 0, (ud0) this.b, (i4) this.d, (j4) this.c);
                break;
            default:
                g5.f(null, null, 0L, 0L, 0, (ud0) this.b, (z3) this.d, (b4) this.c);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        h5 h5Var = (h5) this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
        c6 c6Var = (c6) this.c;
        q5 q5Var = h5Var.l;
        q5Var.getStoriesController().r(q5Var.B1, str, new bi.q4(h5Var, storyItem, c6Var, 2));
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str = (String) this.c;
        com.google.firebase.messaging.t tVar = (com.google.firebase.messaging.t) this.d;
        String str2 = (String) obj;
        ya.c c10 = FirebaseMessaging.c(firebaseMessaging.b);
        l9.h hVar = firebaseMessaging.a;
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
            l9.h hVar2 = firebaseMessaging.a;
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

    @Override // org.telegram.ui.sy
    public boolean w(yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, lg1 lg1Var) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
        MessageObject messageObject = (MessageObject) this.d;
        TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.c;
        fo foVar = chatActivityEnterView.P2;
        TLRPC.Message message = messageObject.messageOwner;
        long j10 = message.from_id.user_id;
        long j11 = message.via_bot_id;
        if (j11 != 0) {
            j10 = j11;
        }
        TLRPC.User user = chatActivityEnterView.R.getMessagesController().getUser(Long.valueOf(j10));
        if (user == null) {
            yyVar.finishFragment();
            return true;
        }
        long j12 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        MediaDataController.getInstance(chatActivityEnterView.Q).saveDraft(j12, 0, "@" + UserObject.getPublicUsername(user) + " " + tL_inlineButtonTypeSwitchInline.query, null, null, true, 0L);
        if (j12 == chatActivityEnterView.Q2) {
            yyVar.finishFragment();
            return true;
        }
        if (DialogObject.isEncryptedDialog(j12)) {
            yyVar.finishFragment();
            return true;
        }
        Bundle bundle = new Bundle();
        if (DialogObject.isUserDialog(j12)) {
            bundle.putLong("user_id", j12);
        } else {
            bundle.putLong("chat_id", -j12);
        }
        if (chatActivityEnterView.R.getMessagesController().checkCanOpenChat(bundle, yyVar)) {
            if (!foVar.presentFragment(new fo(bundle), true)) {
                yyVar.finishFragment();
                return true;
            }
            if (!AndroidUtilities.isTablet()) {
                foVar.removeSelfFromStack();
            }
        }
        return true;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    public /* synthetic */ a(m4.q0 q0Var, p1 p1Var, Bundle bundle, ResultReceiver resultReceiver) {
        this.a = 13;
        this.b = q0Var;
        this.d = bundle;
        this.c = resultReceiver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        int i10;
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5 = arrayList;
        switch (this.a) {
            case 5:
                c2 c2Var = (c2) this.b;
                String str2 = (String) this.c;
                MediaDataController mediaDataController = (MediaDataController) this.d;
                ArrayList arrayList6 = c2Var.h;
                SparseIntArray sparseIntArray = c2Var.y;
                ArrayList arrayList7 = c2Var.n;
                di.d2 d2Var = c2Var.N;
                ArrayList arrayList8 = c2Var.v;
                HashSet hashSet = c2Var.L;
                ArrayList arrayList9 = c2Var.s;
                if (TextUtils.equals(str2, c2Var.H)) {
                    ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(c2Var.H);
                    for (int i11 = 0; i11 < parseEmojis.size(); i11++) {
                        try {
                            MediaDataController.KeywordResult keywordResult = new MediaDataController.KeywordResult();
                            keywordResult.emoji = parseEmojis.get(i11).code.toString();
                            arrayList5.add(keywordResult);
                        } catch (Exception unused) {
                        }
                    }
                    c2Var.x = 0;
                    arrayList9.clear();
                    arrayList8.clear();
                    sparseIntArray.clear();
                    arrayList7.clear();
                    int i12 = 1;
                    c2Var.x++;
                    arrayList9.add(null);
                    arrayList8.add(0L);
                    if (d2Var.a == 0) {
                        hashSet.clear();
                        for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                            MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) arrayList5.get(i13);
                            String str3 = keywordResult2.emoji;
                            if (str3 != null && !str3.startsWith("animated_") && (arrayList4 = (ArrayList) c2Var.d.get(keywordResult2.emoji)) != null) {
                                hashSet.addAll(arrayList4);
                            }
                        }
                        arrayList8.addAll(hashSet);
                        for (int i14 = 0; i14 < hashSet.size(); i14++) {
                            arrayList9.add(null);
                        }
                        c2Var.x = hashSet.size() + c2Var.x;
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
                                        c2Var.x++;
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
                                            c2Var.x++;
                                        }
                                    }
                                }
                            }
                            i18++;
                            arrayList5 = arrayList;
                        }
                    }
                    String translitSafe = AndroidUtilities.translitSafe((c2Var.H + "").toLowerCase());
                    for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList6.get(i21);
                        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                            String translitSafe2 = AndroidUtilities.translitSafe((tL_messages_stickerSet.set.title + "").toLowerCase());
                            if (translitSafe2.startsWith(translitSafe) || yh.v(" ", translitSafe, translitSafe2)) {
                                int size = arrayList7.size();
                                arrayList7.add(tL_messages_stickerSet);
                                sparseIntArray.put(c2Var.x, size);
                                arrayList9.add(null);
                                c2Var.x++;
                                arrayList9.addAll(tL_messages_stickerSet.documents);
                                c2Var.x = tL_messages_stickerSet.documents.size() + c2Var.x;
                            }
                        }
                    }
                    int i22 = i10;
                    boolean z10 = (arrayList8.size() > i22 || arrayList9.size() > i22) ? 0 : i22;
                    c2Var.w = z10;
                    if (z10 != 0) {
                        c2Var.x += i22;
                    }
                    if (z10 == 0) {
                        c2Var.K += i22;
                    }
                    c2Var.I = c2Var.H;
                    c2Var.l();
                    o1.x1(d2Var.b, 0, 0);
                    d2Var.f.c(false);
                    d2Var.e.n(false);
                    break;
                }
                break;
            default:
                uy uyVar = (uy) this.b;
                String str6 = (String) this.c;
                Runnable runnable = (Runnable) this.d;
                vy vyVar = uyVar.a;
                if (str6.equals(vyVar.v)) {
                    vyVar.w = str;
                    vyVar.n.addAll(arrayList5);
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
