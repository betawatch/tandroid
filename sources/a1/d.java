package a1;

import ah.i1;
import ai.ga;
import ai.j3;
import ai.t0;
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
import b2.p1;
import b2.w;
import com.google.android.gms.tasks.OnFailureListener;
import e2.m0;
import e9.k0;
import e9.n0;
import e9.x1;
import gi.d3;
import gi.y2;
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
import org.telegram.messenger.lk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.rd0;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.s1;
import org.telegram.ui.eg0;
import org.telegram.ui.et;
import org.telegram.ui.ey;
import org.telegram.ui.h71;
import org.telegram.ui.j61;
import org.telegram.ui.l4;
import org.telegram.ui.oj0;
import org.telegram.ui.rd1;
import org.telegram.ui.s50;
import org.telegram.ui.sn;
import org.telegram.ui.te1;
import org.telegram.ui.w30;
import org.telegram.ui.x30;
import org.telegram.ui.xx;
import org.telegram.ui.z51;
import v0.i;
import w7.z5;
import x2.k;
import x2.m;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, xx, a2, e5, md0, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback, Utilities.Callback2Return, k {
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

    @Override // org.telegram.ui.Components.e5
    public void C(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 6:
                sn.Z((sn) this.b, (TLRPC.TL_document) this.c, (String) this.d, this.e, z10, i10);
                break;
            case 10:
                fo foVar = (fo) this.b;
                foVar.j0.d((TLRPC.TL_messageMediaPoll) this.c, foVar.O, foVar.l1, (ArrayList) this.d, z10, i10, ((Long) this.e).longValue());
                foVar.b.dismiss(true);
                break;
            case 11:
                et etVar = (et) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                etVar.r(i10, i11, this.e, document != null ? document : (TLRPC.BotInlineResult) this.d, z10);
                break;
            default:
                ((et) this.b).l((TLRPC.Document) this.c, (String) this.d, this.e, z10, i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean D() {
        switch (this.a) {
            case 4:
                break;
            case 8:
                break;
        }
        return false;
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
    @Override // x2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x1 b(int i10, p1 p1Var, int[] iArr) {
        int i11;
        int i12;
        int i13;
        int i14;
        Point point;
        int i15;
        int i16;
        p1 p1Var2 = p1Var;
        x2.i iVar = (x2.i) this.b;
        String str = (String) this.c;
        int[] iArr2 = (int[]) this.d;
        Point point2 = (Point) this.e;
        int i17 = iArr2[i10];
        int i18 = point2 != null ? point2.x : iVar.i;
        int i19 = point2 != null ? point2.y : iVar.j;
        boolean z10 = iVar.l;
        if (i18 == Integer.MAX_VALUE || i19 == Integer.MAX_VALUE) {
            i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        } else {
            int i20 = Integer.MAX_VALUE;
            for (int i21 = 0; i21 < p1Var2.a; i21++) {
                w wVar = p1Var2.d[i21];
                int i22 = wVar.z;
                int i23 = wVar.A;
                if (i22 > 0 && i23 > 0) {
                    if (z10) {
                        if ((i22 > i23) != (i18 > i19)) {
                            i14 = i18;
                            i13 = i19;
                            int i24 = i22 * i14;
                            int i25 = i23 * i13;
                            point = i24 < i25 ? new Point(i13, m0.g(i25, i22)) : new Point(m0.g(i24, i23), i14);
                            i15 = wVar.z;
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
                    i15 = wVar.z;
                    i16 = i15 * i23;
                    if (i15 >= ((int) (point.x * 0.98f))) {
                        i20 = i16;
                    }
                }
            }
            i11 = i20;
        }
        k0 t10 = n0.t();
        int i26 = 0;
        while (i26 < p1Var2.a) {
            w wVar2 = p1Var2.d[i26];
            int i27 = wVar2.z;
            int i28 = (i27 == -1 || (i12 = wVar2.A) == -1) ? -1 : i27 * i12;
            t10.c(new m(i10, p1Var2, i26, iVar, iArr[i26], str, i17, i11 == Integer.MAX_VALUE || (i28 != -1 && i28 <= i11)));
            i26++;
            p1Var2 = p1Var;
        }
        return t10.f();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(b2 b2Var, int i10) {
        int i11 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i11) {
            case 5:
                ((l4) obj4).R((String) obj3, (String) obj2, (pf.c) obj);
                break;
            case 7:
                sn.E0((sn) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 14:
                String str = (String) obj;
                Pattern pattern = LaunchActivity.C1;
                oj0 oj0Var = new oj0((LaunchActivity) obj4, (n2) obj3);
                oj0Var.x((String) obj2, false);
                if (str != null) {
                    String[] split = str.split(" ", 2);
                    String str2 = split[0];
                    String str3 = split.length > 1 ? split[1] : null;
                    rd0 rd0Var = oj0Var.d;
                    if (rd0Var != null) {
                        rd0Var.getEditText().setText(str2);
                    } else {
                        oj0Var.K = str2;
                    }
                    rd0 rd0Var2 = oj0Var.e;
                    if (rd0Var2 != null) {
                        rd0Var2.getEditText().setText(str3);
                    } else {
                        oj0Var.L = str3;
                    }
                }
                oj0Var.show();
                break;
            case 15:
                eg0.W((eg0) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 16:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.l0(true);
                notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(notificationsCustomSettingsActivity.s);
                break;
            default:
                te1 te1Var = (te1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                te1Var.A0 = hashSet2;
                hashSet2.addAll(hashSet);
                te1Var.U0(true, false);
                xc.a0(te1Var).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new rd1(te1Var, 4), new h71(te1Var, (ArrayList) obj2, (Runnable) obj, 5)).j();
                te1Var.C0();
                b2Var.dismiss();
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
    public void onProductDetailsResponse(c5.i iVar, List list) {
        switch (this.a) {
            case 1:
                AndroidUtilities.runOnUIThread(new t0(list, (Utilities.Callback2) this.b, (TLRPC.TL_inputStorePaymentStarsTopup) this.c, (TL_stars.TL_starsTopupOption) this.d, (Activity) this.e, 7));
                break;
            default:
                AndroidUtilities.runOnUIThread(new j3((ga) this.b, list, (s1) this.c, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.d, iVar, (Activity) this.e, 2));
                break;
        }
    }

    @Override // org.telegram.ui.Components.md0
    public void q(od0 od0Var, int i10) {
        s50 s50Var = (s50) this.b;
        od0 od0Var2 = (od0) this.c;
        w30 w30Var = (w30) this.d;
        x30 x30Var = (x30) this.e;
        try {
            s50Var.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        f5.f(s50Var.T, s50Var.S, 0L, 604800L, 2, od0Var2, w30Var, x30Var);
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        j61.Q((j61) this.b, (TLRPC.User) this.c, (TLRPC.InputCheckPasswordSRP) this.d, (TwoStepVerificationActivity) this.e, j10);
    }

    @Override // org.telegram.ui.xx
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, te1 te1Var) {
        switch (this.a) {
            case 4:
                y2 y2Var = (y2) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                String str = (String) this.d;
                td0 td0Var = (td0) this.e;
                d3 d3Var = y2Var.d;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle h = g.h("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    h.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else if (DialogObject.isUserDialog(j10)) {
                    h.putLong("user_id", j10);
                } else {
                    h.putLong("chat_id", -j10);
                }
                h.putString("start_text", "@" + UserObject.getPublicUsername(user) + " " + str);
                Activity activity = d3Var.k0;
                if (activity instanceof LaunchActivity) {
                    n2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                    if (MessagesController.getInstance(d3Var.G).checkCanOpenChat(h, lastFragment)) {
                        td0Var.dismiss();
                        d3Var.c0 = true;
                        AndroidUtilities.cancelRunOnUIThread(d3Var.t0);
                        d3Var.x.h();
                        NotificationCenter.getInstance(d3Var.G).removeObserver(d3Var, NotificationCenter.webViewResultSent);
                        NotificationCenter.getGlobalInstance().removeObserver(d3Var, NotificationCenter.didSetNewTheme);
                        if (!d3Var.M0) {
                            super/*android.app.Dialog*/.dismiss();
                            d3Var.M0 = true;
                        }
                        b5 b5Var = new b5(new sn(h));
                        b5Var.b = true;
                        lastFragment.presentFragment(b5Var);
                        break;
                    }
                }
                break;
            case 8:
                k8.v((k8) this.b, (ArrayList) this.c, (TLRPC.TL_document) this.d, (MessageObject) this.e, eyVar, arrayList, charSequence, z11, i10);
                break;
            default:
                ai aiVar = (ai) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                String str2 = (String) this.d;
                td0 td0Var2 = (td0) this.e;
                ti tiVar = aiVar.e;
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle h10 = g.h("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j11)) {
                    h10.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                } else if (DialogObject.isUserDialog(j11)) {
                    h10.putLong("user_id", j11);
                } else {
                    h10.putLong("chat_id", -j11);
                }
                h10.putString("start_text", "@" + UserObject.getPublicUsername(user2) + " " + str2);
                n2 n2Var = tiVar.f0;
                if (MessagesController.getInstance(tiVar.M1).checkCanOpenChat(h10, n2Var)) {
                    td0Var2.dismiss();
                    tiVar.dismiss(true);
                    b5 b5Var2 = new b5(new sn(h10));
                    b5Var2.b = true;
                    n2Var.presentFragment(b5Var2);
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
        d6 d6Var = (d6) this.d;
        j01 j01Var = (j01) this.e;
        Integer num = (Integer) obj;
        Float f7 = (Float) obj2;
        LinearLayout e = lk.e(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        e.addView(linearLayout, z5.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, z5.n(24, 24));
        if (num.intValue() == 7) {
            for (int i10 = 0; i10 < 2; i10++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, z5.n(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        textView.setTextColor(h6.w0(h6.j5, d6Var));
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
        e.addView(textView, z5.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new g01(j01Var, e, false);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        switch (this.a) {
            case 17:
                z51 z51Var = (z51) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(z51Var.V).getAvailableEffects();
                HashSet hashSet = new HashSet();
                if (availableEffects != null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                                String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                                for (int i11 = 0; i11 < availableEffects.effects.size(); i11++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i11);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.id)) && (tL_availableEffect.emoticon.contains(fixEmoji) || fixEmoji.contains(tL_availableEffect.emoticon))) {
                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList3).add(i1.e(tL_availableEffect));
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
