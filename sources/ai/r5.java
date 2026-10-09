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
import android.widget.TextView;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.nio.charset.StandardCharsets;
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
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.xl;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.zy;
import org.telegram.ui.fg1;
import org.telegram.ui.ny;
import org.telegram.ui.oo;
import org.telegram.ui.ty;
import org.telegram.ui.uo0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r5 implements MessagesStorage.StringCallback, fc, androidx.car.app.utils.b, MediaDataController.KeywordResultCallback, org.telegram.ui.ActionBar.a2, SuccessContinuation, uo0, sl, m4.k0, i9.p, sd0, org.telegram.ui.ActionBar.r0, ny, org.telegram.ui.Components.f5 {
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

    @Override // org.telegram.ui.ny
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 26:
                xl xlVar = (xl) this.b;
                xlVar.x0.b((TLRPC.TL_messageMediaGeo) this.c, xlVar.y0, z10, i10, ((Long) this.d).longValue());
                xlVar.b.dismiss(true);
                break;
            default:
                lo loVar = (lo) this.b;
                loVar.j0.e((TLRPC.TL_messageMediaToDo) this.c, null, null, null, z10, i10, ((Long) this.d).longValue());
                loVar.b.dismiss(true);
                break;
        }
    }

    @Override // org.telegram.ui.ny
    public /* synthetic */ boolean K(ty tyVar) {
        return false;
    }

    @Override // org.telegram.ui.uo0
    public void a(int i10) {
        switch (this.a) {
            case 8:
                ei.f3 f3Var = (ei.f3) this.b;
                ae0 ae0Var = (ae0) this.c;
                String str = (String) this.d;
                if (i10 != 3) {
                    ae0Var.dismiss();
                }
                f3Var.d.x.F(str, org.telegram.ui.Cells.c1.x(i10).toLowerCase(Locale.ROOT), false);
                break;
            default:
                ae0 ae0Var2 = (ae0) this.b;
                ei.p4 p4Var = (ei.p4) this.c;
                String str2 = (String) this.d;
                if (i10 != 3) {
                    ae0Var2.dismiss();
                }
                p4Var.getWebViewContainer().F(str2, org.telegram.ui.Cells.c1.x(i10).toLowerCase(Locale.ROOT), false);
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
                m4.b0 b0Var = (m4.b0) obj4;
                Handler handler = b0Var.l;
                ki.i0 i0Var = new ki.i0(b0Var, (m4.r) obj3, new gg.t(b0Var, (m4.q0) obj2, (m4.s) obj, 26));
                m4.l1 l1Var = new m4.l1(0);
                String str = e2.d0.a;
                i9.c0 c0Var = new i9.c0();
                e2.d0.T(handler, new a3.k0(c0Var, i0Var, l1Var, i11));
                return c0Var;
            default:
                m4.b0 b0Var2 = (m4.b0) obj4;
                m4.r rVar = (m4.r) obj3;
                List list = (List) obj;
                Handler handler2 = b0Var2.l;
                ki.i0 i0Var2 = new ki.i0(b0Var2, rVar, new i5(b0Var2, (m4.z0) obj2, rVar, list, 25));
                m4.l1 l1Var2 = new m4.l1(0);
                String str2 = e2.d0.a;
                i9.c0 c0Var2 = new i9.c0();
                e2.d0.T(handler2, new a3.k0(c0Var2, i0Var2, l1Var2, i11));
                return c0Var2;
        }
    }

    @Override // org.telegram.ui.Components.sl
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        switch (this.a) {
            case 10:
                ii.r rVar = (ii.r) this.b;
                ii.a aVar = (ii.a) this.c;
                yi yiVar = (yi) this.d;
                ii.x3 x3Var = rVar.r;
                if (messageMedia != null && messageMedia.geo != null) {
                    ii.i2 i2Var = x3Var.H3;
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
                    ii.i2 i2Var2 = x3Var.H3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                    rVar.Y(true);
                    yiVar.dismiss(true);
                    x3Var.post(new ii.f(rVar, aVar, 0));
                    break;
                }
                break;
            default:
                ii.e2 e2Var = (ii.e2) this.b;
                ii.a aVar2 = (ii.a) this.c;
                yi yiVar2 = (yi) this.d;
                if (messageMedia != null && messageMedia.geo != null) {
                    ii.i2 i2Var3 = e2Var.P.H3;
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
                    ii.i2 i2Var4 = e2Var.P.H3;
                    if (i2Var4 != null) {
                        i2Var4.h();
                    }
                    yiVar2.dismiss(true);
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
                    } catch (w.f e7) {
                        androidx.car.app.utils.g.f(iOnDoneCallback, str, e7);
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
                } catch (w.f e10) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e10);
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 5:
                ((ci.fa) this.b).h1((ci.da) this.c, (Runnable) this.d, true);
                break;
            case 7:
                Activity activity = (Activity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.d;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                qVar.run(bool, bool);
                break;
            case 9:
                gg.j1 j1Var = (gg.j1) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
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
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.c;
                ii.g4 g4Var = (ii.g4) this.d;
                String trim = editTextBoldCursor.getText().toString().trim();
                String trim2 = editTextBoldCursor2.getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
                    int i11 = g4Var.a;
                    ii.u3 u3Var = g4Var.b;
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
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.d;
                zArr3[0] = true;
                callback.run(Boolean.FALSE);
                b2VarArr[0].dismiss();
                break;
            case 20:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.d;
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
                yi yiVar = (yi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.c;
                TLRPC.User user2 = (TLRPC.User) this.d;
                int i12 = yiVar.M1;
                if (tL_attachMenuBot == null) {
                    MediaDataController.getInstance(i12).removeInline(user2.id);
                    break;
                } else {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i12).getInputUser(user2);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new oo(6, yiVar, tL_attachMenuBot), 66);
                    break;
                }
            case 25:
                gl glVar = (gl) this.b;
                hg.b1 b1Var = (hg.b1) this.c;
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.d;
                TextView textView = glVar.R;
                if (b1Var.getText().toString().getBytes(StandardCharsets.UTF_8).length <= 960) {
                    String trim3 = b1Var.getText().toString().trim();
                    if (TextUtils.isEmpty(trim3)) {
                        trim3 = null;
                    }
                    glVar.p0 = trim3;
                    glVar.q0 = !a2Var.b();
                    if (TextUtils.isEmpty(glVar.p0)) {
                        textView.setVisibility(8);
                    } else {
                        textView.setText(glVar.p0);
                        textView.setVisibility(0);
                    }
                    glVar.i0();
                    b2Var.dismiss();
                    glVar.Y();
                    break;
                } else {
                    int i13 = -glVar.s0;
                    glVar.s0 = i13;
                    AndroidUtilities.shakeViewSpring(b1Var, i13);
                    break;
                }
            default:
                lo loVar = (lo) this.b;
                View view = (View) this.c;
                org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) this.d;
                loVar.getClass();
                view.setTag(null);
                loVar.a0(view, d6Var, false);
                break;
        }
    }

    @Override // m4.k0
    public void g(m4.r rVar) {
        m4.l0 l0Var = (m4.l0) this.b;
        Bundle bundle = (Bundle) this.c;
        ResultReceiver resultReceiver = (ResultReceiver) this.d;
        m4.b0 b0Var = l0Var.g;
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        i9.u n10 = b0Var.n(rVar);
        if (resultReceiver != null) {
            n10.a(new ki.i0(5, n10, resultReceiver), i9.q.a);
        }
    }

    @Override // ai.fc
    public void h(Canvas canvas, RectF rectF, float f7) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.b;
        xl0 xl0Var = (xl0) this.c;
        int[] iArr = (int[]) this.d;
        t7Var.c(canvas, rectF, f7);
        t7Var.f(canvas, rectF, f7);
        if (t7Var.h) {
            t7Var.b(canvas, rectF, f7);
        } else {
            t7Var.e(canvas, rectF, f7);
        }
        if (xl0Var != null && xl0Var.a0 && xl0Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f7 * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            xl0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        Runnable runnable;
        org.telegram.ui.Components.f5 f5Var = (org.telegram.ui.Components.f5) this.b;
        boolean[] zArr = (boolean[]) this.c;
        org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.d;
        if (i10 == 1) {
            f5Var.J(2147483646, 0, zArr[0]);
            runnable = a3Var.a.dismissRunnable;
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.sd0
    public void r(ud0 ud0Var, int i10) {
        switch (this.a) {
            case 17:
                org.telegram.ui.Components.g5.f(null, null, 0L, 0L, 0, (ud0) this.b, (org.telegram.ui.Components.i4) this.c, (org.telegram.ui.Components.j4) this.d);
                break;
            default:
                org.telegram.ui.Components.g5.f(null, null, 0L, 0L, 0, (ud0) this.b, (org.telegram.ui.Components.z3) this.c, (org.telegram.ui.Components.b4) this.d);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        w5 w5Var = (w5) this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
        f6 f6Var = w5Var.l;
        f6Var.getStoriesController().r(f6Var.B1, str, new d5(w5Var, storyItem, e6Var, 2));
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str = (String) this.c;
        com.google.firebase.messaging.t tVar = (com.google.firebase.messaging.t) this.d;
        String str2 = (String) obj;
        com.google.firebase.messaging.u c10 = FirebaseMessaging.c(firebaseMessaging.b);
        k9.h hVar = firebaseMessaging.a;
        hVar.a();
        String d = "[DEFAULT]".equals(hVar.b) ? "" : hVar.d();
        String a2 = firebaseMessaging.i.a();
        synchronized (c10) {
            String a10 = com.google.firebase.messaging.t.a(System.currentTimeMillis(), str2, a2);
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

    @Override // org.telegram.ui.ny
    public boolean w(ty tyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
        MessageObject messageObject = (MessageObject) this.c;
        TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.d;
        zn znVar = chatActivityEnterView.P2;
        TLRPC.Message message = messageObject.messageOwner;
        long j3 = message.from_id.user_id;
        long j10 = message.via_bot_id;
        if (j10 != 0) {
            j3 = j10;
        }
        TLRPC.User user = chatActivityEnterView.R.getMessagesController().getUser(Long.valueOf(j3));
        if (user == null) {
            tyVar.finishFragment();
            return true;
        }
        long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        MediaDataController.getInstance(chatActivityEnterView.Q).saveDraft(j11, 0, "@" + UserObject.getPublicUsername(user) + " " + tL_inlineButtonTypeSwitchInline.query, null, null, true, 0L);
        if (j11 == chatActivityEnterView.Q2) {
            tyVar.finishFragment();
            return true;
        }
        if (DialogObject.isEncryptedDialog(j11)) {
            tyVar.finishFragment();
            return true;
        }
        Bundle bundle = new Bundle();
        if (DialogObject.isUserDialog(j11)) {
            bundle.putLong("user_id", j11);
        } else {
            bundle.putLong("chat_id", -j11);
        }
        if (chatActivityEnterView.R.getMessagesController().checkCanOpenChat(bundle, tyVar)) {
            if (!znVar.presentFragment(new zn(bundle), true)) {
                tyVar.finishFragment();
                return true;
            }
            if (!AndroidUtilities.isTablet()) {
                znVar.removeSelfFromStack();
            }
        }
        return true;
    }

    public /* synthetic */ r5(m4.l0 l0Var, m4.h1 h1Var, Bundle bundle, ResultReceiver resultReceiver) {
        this.a = 13;
        this.b = l0Var;
        this.c = bundle;
        this.d = resultReceiver;
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
            case 4:
                ci.c2 c2Var = (ci.c2) this.b;
                String str2 = (String) this.c;
                MediaDataController mediaDataController = (MediaDataController) this.d;
                ArrayList arrayList6 = c2Var.h;
                SparseIntArray sparseIntArray = c2Var.y;
                ArrayList arrayList7 = c2Var.n;
                ci.d2 d2Var = c2Var.N;
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
                            if (translitSafe2.startsWith(translitSafe) || bi.w(" ", translitSafe, translitSafe2)) {
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
                    ci.o1.x1(d2Var.b, 0, 0);
                    d2Var.f.c(false);
                    d2Var.e.n(false);
                    break;
                }
                break;
            default:
                yy yyVar = (yy) this.b;
                String str6 = (String) this.c;
                Runnable runnable = (Runnable) this.d;
                zy zyVar = yyVar.a;
                if (str6.equals(zyVar.v)) {
                    zyVar.w = str;
                    zyVar.n.addAll(arrayList5);
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
