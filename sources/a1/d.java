package a1;

import a4.w;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bh.v;
import com.google.android.gms.tasks.OnFailureListener;
import eg.k0;
import i7.f6;
import ih.f1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import jh.s7;
import kg.q0;
import kotlin.jvm.internal.j;
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
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.tc0;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.d61;
import org.telegram.ui.fg0;
import org.telegram.ui.ft;
import org.telegram.ui.fy;
import org.telegram.ui.kj0;
import org.telegram.ui.m4;
import org.telegram.ui.n61;
import org.telegram.ui.r50;
import org.telegram.ui.sc1;
import org.telegram.ui.tn;
import org.telegram.ui.vd1;
import org.telegram.ui.w30;
import org.telegram.ui.x30;
import org.telegram.ui.yx;
import org.telegram.ui.ze1;
import ph.k2;
import ph.p2;
import v0.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, b2, b5, yx, oc0, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback, Utilities.Callback2Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(CancellationSignal cancellationSignal, e1.d dVar, Executor executor, i iVar) {
        this.a = 1;
        this.b = cancellationSignal;
        this.e = dVar;
        this.c = executor;
        this.d = iVar;
    }

    @Override // org.telegram.ui.yx
    public /* synthetic */ boolean C() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.b5
    public void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 5:
                tn.y0((tn) this.e, (TLRPC.TL_document) this.b, (String) this.c, this.d, z10, i10);
                break;
            case 9:
                on onVar = (on) this.e;
                onVar.f0.e((TLRPC.TL_messageMediaPoll) this.b, onVar.K, onVar.h1, (ArrayList) this.c, z10, i10, ((Long) this.d).longValue());
                onVar.b.dismiss(true);
                break;
            case 10:
                ft ftVar = (ft) this.e;
                TLRPC.Document document = (TLRPC.Document) this.b;
                ftVar.r(i10, i11, this.d, document != null ? document : (TLRPC.BotInlineResult) this.c, z10);
                break;
            default:
                ((ft) this.e).l((TLRPC.Document) this.b, (String) this.c, this.d, z10, i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.yx
    public /* synthetic */ boolean J(fy fyVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(c2 c2Var, int i10) {
        int i11 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.e;
        switch (i11) {
            case 4:
                ((m4) obj4).R((String) obj3, (String) obj2, (ye.c) obj);
                break;
            case 6:
                tn.T0((tn) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 13:
                String str = (String) obj;
                Pattern pattern = LaunchActivity.x1;
                kj0 kj0Var = new kj0((LaunchActivity) obj4, (o2) obj3);
                kj0Var.v((String) obj2, false);
                if (str != null) {
                    String[] split = str.split(" ", 2);
                    String str2 = split[0];
                    String str3 = split.length > 1 ? split[1] : null;
                    tc0 tc0Var = kj0Var.d;
                    if (tc0Var != null) {
                        tc0Var.getEditText().setText(str2);
                    } else {
                        kj0Var.G = str2;
                    }
                    tc0 tc0Var2 = kj0Var.e;
                    if (tc0Var2 != null) {
                        tc0Var2.getEditText().setText(str3);
                    } else {
                        kj0Var.H = str3;
                    }
                }
                kj0Var.show();
                break;
            case 14:
                fg0.W((fg0) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 15:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.l0(true);
                notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(notificationsCustomSettingsActivity.s);
                break;
            default:
                ze1 ze1Var = (ze1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                ze1Var.w0 = hashSet2;
                hashSet2.addAll(hashSet);
                ze1Var.U0(true, false);
                int i12 = 4;
                tc.a0(ze1Var).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new vd1(ze1Var, i12), new sc1(ze1Var, (ArrayList) obj2, (Runnable) obj, i12)).j();
                ze1Var.C0();
                c2Var.dismiss();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e10) {
        switch (this.a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) this.e, (CancellationSignal) this.b, (Executor) this.c, (i) this.d, e10);
                break;
            default:
                CancellationSignal cancellationSignal = (CancellationSignal) this.b;
                e1.d dVar = (e1.d) this.e;
                Executor executor = (Executor) this.c;
                i iVar = (i) this.d;
                j.e(e10, "e");
                b1.b bVar = new b1.b(dVar, e10, executor, iVar);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!g.a(cancellationSignal)) {
                    bVar.invoke();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(p2.g gVar, List list) {
        switch (this.a) {
            case 2:
                AndroidUtilities.runOnUIThread(new k0(list, (Utilities.Callback2) this.e, (TLRPC.TL_inputStorePaymentStarsTopup) this.b, (TL_stars.TL_starsTopupOption) this.c, (Activity) this.d, 12));
                break;
            default:
                AndroidUtilities.runOnUIThread(new f1((s7) this.e, list, (v) this.b, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.c, gVar, (Activity) this.d, 3));
                break;
        }
    }

    @Override // org.telegram.ui.Components.oc0
    public void q(qc0 qc0Var, int i10) {
        r50 r50Var = (r50) this.e;
        qc0 qc0Var2 = (qc0) this.b;
        w30 w30Var = (w30) this.c;
        x30 x30Var = (x30) this.d;
        try {
            r50Var.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        c5.g(r50Var.P, r50Var.O, 0L, 604800L, 2, qc0Var2, w30Var, x30Var);
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        n61.P((n61) this.e, (TLRPC.User) this.b, (TLRPC.InputCheckPasswordSRP) this.c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override // org.telegram.ui.yx
    public boolean v(fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
        switch (this.a) {
            case 7:
                g8.t((g8) this.e, (ArrayList) this.b, (TLRPC.TL_document) this.c, (MessageObject) this.d, fyVar, arrayList, charSequence, z11, i10);
                break;
            case 8:
                uh uhVar = (uh) this.e;
                TLRPC.User user = (TLRPC.User) this.b;
                String str = (String) this.c;
                vc0 vc0Var = (vc0) this.d;
                ni niVar = uhVar.e;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i12 = w.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    i12.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else if (DialogObject.isUserDialog(j10)) {
                    i12.putLong("user_id", j10);
                } else {
                    i12.putLong("chat_id", -j10);
                }
                i12.putString("start_text", "@" + UserObject.getPublicUsername(user) + " " + str);
                o2 o2Var = niVar.b0;
                if (MessagesController.getInstance(niVar.F1).checkCanOpenChat(i12, o2Var)) {
                    vc0Var.dismiss();
                    niVar.dismiss(true);
                    z4 z4Var = new z4(new tn(i12));
                    z4Var.b = true;
                    o2Var.presentFragment(z4Var);
                    break;
                }
                break;
            default:
                k2 k2Var = (k2) this.e;
                TLRPC.User user2 = (TLRPC.User) this.b;
                String str2 = (String) this.c;
                vc0 vc0Var2 = (vc0) this.d;
                p2 p2Var = k2Var.d;
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i13 = w.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j11)) {
                    i13.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                } else if (DialogObject.isUserDialog(j11)) {
                    i13.putLong("user_id", j11);
                } else {
                    i13.putLong("chat_id", -j11);
                }
                i13.putString("start_text", "@" + UserObject.getPublicUsername(user2) + " " + str2);
                Activity activity = p2Var.g0;
                if (activity instanceof LaunchActivity) {
                    o2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                    if (MessagesController.getInstance(p2Var.C).checkCanOpenChat(i13, lastFragment)) {
                        vc0Var2.dismiss();
                        p2Var.Y = true;
                        AndroidUtilities.cancelRunOnUIThread(p2Var.p0);
                        p2Var.x.h();
                        NotificationCenter.getInstance(p2Var.C).removeObserver(p2Var, NotificationCenter.webViewResultSent);
                        NotificationCenter.getGlobalInstance().removeObserver(p2Var, NotificationCenter.didSetNewTheme);
                        if (!p2Var.I0) {
                            super/*android.app.Dialog*/.dismiss();
                            p2Var.I0 = true;
                        }
                        z4 z4Var2 = new z4(new tn(i13));
                        z4Var2.b = true;
                        lastFragment.presentFragment(z4Var2);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Context context = (Context) this.e;
        int[] iArr = (int[]) this.b;
        c6 c6Var = (c6) this.c;
        hz0 hz0Var = (hz0) this.d;
        Integer num = (Integer) obj;
        Float f9 = (Float) obj2;
        LinearLayout g10 = x3.g(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        g10.addView(linearLayout, f6.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, f6.n(24, 24));
        if (num.intValue() == 7) {
            for (int i10 = 0; i10 < 2; i10++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, f6.n(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        textView.setTextColor(g6.v0(g6.j5, c6Var));
        StringBuilder sb2 = new StringBuilder("x");
        float floatValue = f9.floatValue();
        Object obj3 = f9;
        if (floatValue <= 0.0f) {
            obj3 = "0";
        }
        sb2.append(obj3);
        textView.setText(sb2.toString());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        g10.addView(textView, f6.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new ez0(hz0Var, g10, false);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        switch (this.a) {
            case 16:
                d61 d61Var = (d61) this.e;
                ArrayList arrayList2 = (ArrayList) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                Runnable runnable = (Runnable) this.d;
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(d61Var.R).getAvailableEffects();
                HashSet hashSet = new HashSet();
                if (availableEffects != null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                                String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                                for (int i11 = 0; i11 < availableEffects.effects.size(); i11++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i11);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.id)) && (tL_availableEffect.emoticon.contains(fixEmoji) || fixEmoji.contains(tL_availableEffect.emoticon))) {
                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList3).add(q0.e(tL_availableEffect));
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
                HashMap hashMap = (HashMap) this.e;
                HashMap hashMap2 = (HashMap) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                Runnable runnable2 = (Runnable) this.d;
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
