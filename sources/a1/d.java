package a1;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b2.q1;
import b2.x;
import bh.x0;
import bi.c3;
import bi.ca;
import bi.u0;
import com.google.android.gms.tasks.OnFailureListener;
import e2.n0;
import f9.f0;
import f9.i0;
import f9.s1;
import hi.h3;
import hi.m3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.u01;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.x01;
import org.telegram.ui.Components.zh;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.r1;
import org.telegram.ui.ae1;
import org.telegram.ui.b40;
import org.telegram.ui.c40;
import org.telegram.ui.cf1;
import org.telegram.ui.ey;
import org.telegram.ui.f61;
import org.telegram.ui.ft;
import org.telegram.ui.ig0;
import org.telegram.ui.j4;
import org.telegram.ui.p61;
import org.telegram.ui.qj0;
import org.telegram.ui.t31;
import org.telegram.ui.wn;
import org.telegram.ui.x50;
import org.telegram.ui.xx;
import v0.i;
import x2.j;
import x2.l;
import x2.n;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, xx, b2, e5, ld0, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback, Utilities.Callback2Return, l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(CancellationSignal cancellationSignal, e1.e eVar, Executor executor, i iVar) {
        this.a = 3;
        this.c = cancellationSignal;
        this.b = eVar;
        this.d = executor;
        this.e = iVar;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean C() {
        switch (this.a) {
            case 4:
                break;
            case 8:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 6:
                wn.C0((wn) this.b, (TLRPC.TL_document) this.c, (String) this.d, this.e, z10, i10);
                break;
            case 10:
                go goVar = (go) this.b;
                goVar.j0.e((TLRPC.TL_messageMediaPoll) this.c, goVar.O, goVar.m1, (ArrayList) this.d, z10, i10, ((Long) this.e).longValue());
                goVar.b.dismiss(true);
                break;
            case 11:
                ft ftVar = (ft) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                ftVar.s(i10, i11, this.e, document != null ? document : (TLRPC.BotInlineResult) this.d, z10);
                break;
            default:
                ((ft) this.b).m((TLRPC.Document) this.c, (String) this.d, this.e, z10, i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean K(ey eyVar) {
        switch (this.a) {
            case 4:
                break;
            case 8:
                break;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    @Override // x2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s1 a(int i10, q1 q1Var, int[] iArr) {
        int i11;
        int i12;
        int i13;
        int i14;
        Point point;
        int i15;
        int i16;
        q1 q1Var2 = q1Var;
        j jVar = (j) this.b;
        String str = (String) this.c;
        int[] iArr2 = (int[]) this.d;
        Point point2 = (Point) this.e;
        int i17 = iArr2[i10];
        int i18 = point2 != null ? point2.x : jVar.i;
        int i19 = point2 != null ? point2.y : jVar.j;
        boolean z10 = jVar.l;
        if (i18 == Integer.MAX_VALUE || i19 == Integer.MAX_VALUE) {
            i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        } else {
            int i20 = Integer.MAX_VALUE;
            for (int i21 = 0; i21 < q1Var2.a; i21++) {
                x xVar = q1Var2.d[i21];
                int i22 = xVar.z;
                int i23 = xVar.A;
                if (i22 > 0 && i23 > 0) {
                    if (z10) {
                        if ((i22 > i23) != (i18 > i19)) {
                            i14 = i18;
                            i13 = i19;
                            int i24 = i22 * i14;
                            int i25 = i23 * i13;
                            point = i24 < i25 ? new Point(i13, n0.g(i25, i22)) : new Point(n0.g(i24, i23), i14);
                            i15 = xVar.z;
                            i16 = i15 * i23;
                            if (i15 >= ((int) (point.x * 0.98f)) && i23 >= ((int) (point.y * 0.98f)) && i16 < i20) {
                                i20 = i16;
                            }
                        }
                    }
                    i13 = i18;
                    i14 = i19;
                    int i242 = i22 * i14;
                    int i252 = i23 * i13;
                    if (i242 < i252) {
                    }
                    i15 = xVar.z;
                    i16 = i15 * i23;
                    if (i15 >= ((int) (point.x * 0.98f))) {
                        i20 = i16;
                    }
                }
            }
            i11 = i20;
        }
        f0 t10 = i0.t();
        int i26 = 0;
        while (i26 < q1Var2.a) {
            x xVar2 = q1Var2.d[i26];
            int i27 = xVar2.z;
            int i28 = (i27 == -1 || (i12 = xVar2.A) == -1) ? -1 : i27 * i12;
            t10.c(new n(i10, q1Var2, i26, jVar, iArr[i26], str, i17, i11 == Integer.MAX_VALUE || (i28 != -1 && i28 <= i11)));
            i26++;
            q1Var2 = q1Var;
        }
        return t10.f();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(e2 e2Var, int i10) {
        int i11 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i11) {
            case 5:
                ((j4) obj4).R((String) obj3, (String) obj2, (qf.c) obj);
                break;
            case 7:
                wn.U0((wn) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 14:
                String str = (String) obj;
                Pattern pattern = LaunchActivity.D1;
                qj0 qj0Var = new qj0((LaunchActivity) obj4, (r2) obj3);
                qj0Var.w((String) obj2, false);
                if (str != null) {
                    String[] split = str.split(" ", 2);
                    String str2 = split[0];
                    String str3 = split.length > 1 ? split[1] : null;
                    qd0 qd0Var = qj0Var.c;
                    if (qd0Var != null) {
                        qd0Var.getEditText().setText(str2);
                    } else {
                        qj0Var.J = str2;
                    }
                    qd0 qd0Var2 = qj0Var.d;
                    if (qd0Var2 != null) {
                        qd0Var2.getEditText().setText(str3);
                    } else {
                        qj0Var.K = str3;
                    }
                }
                qj0Var.show();
                break;
            case 15:
                ig0.V((ig0) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 16:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.m0(true);
                notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(notificationsCustomSettingsActivity.s);
                break;
            default:
                cf1 cf1Var = (cf1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                cf1Var.A0 = hashSet2;
                hashSet2.addAll(hashSet);
                cf1Var.V0(true, false);
                wc.b0(cf1Var).V(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new ae1(cf1Var, 4), new t31(cf1Var, (ArrayList) obj2, (Runnable) obj)).j();
                cf1Var.C0();
                e2Var.dismiss();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e) {
        switch (this.a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) this.b, (CancellationSignal) this.c, (Executor) this.d, (i) this.e, e);
                break;
            default:
                CancellationSignal cancellationSignal = (CancellationSignal) this.c;
                e1.e eVar = (e1.e) this.b;
                Executor executor = (Executor) this.d;
                i iVar = (i) this.e;
                kotlin.jvm.internal.i.e(e, "e");
                b1.b bVar = new b1.b(eVar, e, executor, iVar);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!h.a(cancellationSignal)) {
                    bVar.invoke();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(d5.i iVar, List list) {
        switch (this.a) {
            case 1:
                AndroidUtilities.runOnUIThread(new u0(list, (Utilities.Callback2) this.b, (TLRPC.TL_inputStorePaymentStarsTopup) this.c, (TL_stars.TL_starsTopupOption) this.d, (Activity) this.e, 7));
                break;
            default:
                AndroidUtilities.runOnUIThread(new c3((ca) this.b, list, (r1) this.c, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.d, iVar, (Activity) this.e, 2));
                break;
        }
    }

    @Override // org.telegram.ui.Components.ld0
    public void q(nd0 nd0Var, int i10) {
        x50 x50Var = (x50) this.b;
        nd0 nd0Var2 = (nd0) this.c;
        b40 b40Var = (b40) this.d;
        c40 c40Var = (c40) this.e;
        try {
            x50Var.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        g5.g(x50Var.T, x50Var.S, 0L, 604800L, 2, nd0Var2, b40Var, c40Var);
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        p61.P((p61) this.b, (TLRPC.User) this.c, (TLRPC.InputCheckPasswordSRP) this.d, (TwoStepVerificationActivity) this.e, j10);
    }

    @Override // org.telegram.ui.xx
    public boolean v(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, cf1 cf1Var) {
        switch (this.a) {
            case 4:
                h3 h3Var = (h3) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                String str = (String) this.d;
                td0 td0Var = (td0) this.e;
                m3 m3Var = h3Var.d;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i12 = g.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    i12.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else if (DialogObject.isUserDialog(j10)) {
                    i12.putLong("user_id", j10);
                } else {
                    i12.putLong("chat_id", -j10);
                }
                i12.putString("start_text", "@" + UserObject.getPublicUsername(user) + " " + str);
                Activity activity = m3Var.l0;
                if (activity instanceof LaunchActivity) {
                    r2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                    if (MessagesController.getInstance(m3Var.H).checkCanOpenChat(i12, lastFragment)) {
                        td0Var.dismiss();
                        m3Var.d0 = true;
                        AndroidUtilities.cancelRunOnUIThread(m3Var.u0);
                        m3Var.y.h();
                        NotificationCenter.getInstance(m3Var.H).removeObserver(m3Var, NotificationCenter.webViewResultSent);
                        NotificationCenter.getGlobalInstance().removeObserver(m3Var, NotificationCenter.didSetNewTheme);
                        NotificationCenter.getInstance(m3Var.H).removeObserver(m3Var, NotificationCenter.botDownloadsUpdate);
                        if (!m3Var.Q0) {
                            super/*android.app.Dialog*/.dismiss();
                            m3Var.Q0 = true;
                        }
                        org.telegram.ui.ActionBar.g5 g5Var = new org.telegram.ui.ActionBar.g5(new wn(i12));
                        g5Var.b = true;
                        lastFragment.presentFragment(g5Var);
                        break;
                    }
                }
                break;
            case 8:
                m8.r((m8) this.b, (ArrayList) this.c, (TLRPC.TL_document) this.d, (MessageObject) this.e, eyVar, arrayList, charSequence, z11, i10);
                break;
            default:
                zh zhVar = (zh) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                String str2 = (String) this.d;
                td0 td0Var2 = (td0) this.e;
                ti tiVar = zhVar.e;
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i13 = g.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j11)) {
                    i13.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                } else if (DialogObject.isUserDialog(j11)) {
                    i13.putLong("user_id", j11);
                } else {
                    i13.putLong("chat_id", -j11);
                }
                i13.putString("start_text", "@" + UserObject.getPublicUsername(user2) + " " + str2);
                r2 r2Var = tiVar.f0;
                if (MessagesController.getInstance(tiVar.M1).checkCanOpenChat(i13, r2Var)) {
                    td0Var2.dismiss();
                    tiVar.dismiss(true);
                    org.telegram.ui.ActionBar.g5 g5Var2 = new org.telegram.ui.ActionBar.g5(new wn(i13));
                    g5Var2.b = true;
                    r2Var.presentFragment(g5Var2);
                    break;
                }
                break;
        }
        return true;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Context context = (Context) this.b;
        int[] iArr = (int[]) this.c;
        u6 u6Var = (u6) this.d;
        x01 x01Var = (x01) this.e;
        Integer num = (Integer) obj;
        Float f7 = (Float) obj2;
        LinearLayout d = wh.d(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        d.addView(linearLayout, kb1.x(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, kb1.r(24, 24));
        if (num.intValue() == 7) {
            for (int i10 = 0; i10 < 2; i10++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, kb1.r(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        f7.V(textView, y6.j5, u6Var);
        StringBuilder sb2 = new StringBuilder("x");
        float floatValue = f7.floatValue();
        Object obj3 = f7;
        if (floatValue <= 0.0f) {
            obj3 = "0";
        }
        sb2.append(obj3);
        textView.setText(sb2.toString());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        d.addView(textView, kb1.o(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new u01(x01Var, d, false);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        switch (this.a) {
            case 17:
                f61 f61Var = (f61) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(f61Var.V).getAvailableEffects();
                HashSet hashSet = new HashSet();
                if (availableEffects != null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                                String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                                for (int i11 = 0; i11 < availableEffects.effects.size(); i11++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i11);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.id)) && (tL_availableEffect.emoticon.contains(fixEmoji) || fixEmoji.contains(tL_availableEffect.emoticon))) {
                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList3).add(x0.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.id));
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                runnable.run();
                break;
            default:
                HashMap hashMap = (HashMap) this.b;
                HashMap hashMap2 = (HashMap) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                Runnable runnable2 = (Runnable) this.e;
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    String str2 = ((MediaDataController.KeywordResult) arrayList.get(i12)).emoji;
                    ArrayList arrayList5 = hashMap != null ? (ArrayList) hashMap.get(str2) : null;
                    if (arrayList5 != null && !arrayList5.isEmpty() && !hashMap2.containsKey(arrayList5)) {
                        hashMap2.put(arrayList5, str2);
                        arrayList4.add(arrayList5);
                    }
                }
                runnable2.run();
                break;
        }
    }
}
