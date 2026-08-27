package a1;

import a9.p;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import cg.k0;
import cg.u0;
import com.google.android.gms.tasks.OnFailureListener;
import gh.i1;
import h7.z5;
import hh.u7;
import ig.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import kotlin.jvm.internal.j;
import nh.b3;
import nh.w2;
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
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a61;
import org.telegram.ui.gy;
import org.telegram.ui.ht;
import org.telegram.ui.ig0;
import org.telegram.ui.k61;
import org.telegram.ui.m4;
import org.telegram.ui.oj0;
import org.telegram.ui.pc1;
import org.telegram.ui.rn;
import org.telegram.ui.s50;
import org.telegram.ui.ud1;
import org.telegram.ui.w30;
import org.telegram.ui.we1;
import org.telegram.ui.x30;
import org.telegram.ui.zx;
import v0.i;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, zx, a2, x4, dc0, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback, Utilities.Callback2Return {
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

    @Override // org.telegram.ui.zx
    public /* synthetic */ boolean D() {
        switch (this.a) {
            case 4:
                break;
            case 8:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.x4
    public void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 6:
                rn.y0((rn) this.e, (TLRPC.TL_document) this.b, (String) this.c, this.d, z10, i10);
                break;
            case 10:
                in inVar = (in) this.e;
                inVar.f0.e((TLRPC.TL_messageMediaPoll) this.b, inVar.K, inVar.h1, (ArrayList) this.c, z10, i10, ((Long) this.d).longValue());
                inVar.b.dismiss(true);
                break;
            case 11:
                ht htVar = (ht) this.e;
                TLRPC.Document document = (TLRPC.Document) this.b;
                htVar.r(i10, i11, this.d, document != null ? document : (TLRPC.BotInlineResult) this.c, z10);
                break;
            default:
                ((ht) this.e).l((TLRPC.Document) this.b, (String) this.c, this.d, z10, i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.zx
    public /* synthetic */ boolean K(gy gyVar) {
        switch (this.a) {
            case 4:
                break;
            case 8:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        int i11 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.e;
        switch (i11) {
            case 5:
                ((m4) obj4).R((String) obj3, (String) obj2, (we.d) obj);
                break;
            case 7:
                rn.T0((rn) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 14:
                String str = (String) obj;
                Pattern pattern = LaunchActivity.x1;
                oj0 oj0Var = new oj0((LaunchActivity) obj4, (n2) obj3);
                oj0Var.w((String) obj2, false);
                if (str != null) {
                    String[] split = str.split(" ", 2);
                    String str2 = split[0];
                    String str3 = split.length > 1 ? split[1] : null;
                    ic0 ic0Var = oj0Var.d;
                    if (ic0Var != null) {
                        ic0Var.getEditText().setText(str2);
                    } else {
                        oj0Var.G = str2;
                    }
                    ic0 ic0Var2 = oj0Var.e;
                    if (ic0Var2 != null) {
                        ic0Var2.getEditText().setText(str3);
                    } else {
                        oj0Var.H = str3;
                    }
                }
                oj0Var.show();
                break;
            case 15:
                ig0.W((ig0) obj4, (String) obj3, (String) obj2, (String) obj);
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
                we1 we1Var = (we1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                we1Var.w0 = hashSet2;
                hashSet2.addAll(hashSet);
                we1Var.U0(true, false);
                int i12 = 4;
                mc.a0(we1Var).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new ud1(we1Var, i12), new pc1(we1Var, (ArrayList) obj2, (Runnable) obj, i12)).j();
                we1Var.C0();
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.dc0
    public void m(fc0 fc0Var, int i10) {
        s50 s50Var = (s50) this.e;
        fc0 fc0Var2 = (fc0) this.b;
        w30 w30Var = (w30) this.c;
        x30 x30Var = (x30) this.d;
        try {
            s50Var.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        y4.g(s50Var.P, s50Var.O, 0L, 604800L, 2, fc0Var2, w30Var, x30Var);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e9) {
        switch (this.a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) this.e, (CancellationSignal) this.b, (Executor) this.c, (i) this.d, e9);
                break;
            default:
                CancellationSignal cancellationSignal = (CancellationSignal) this.b;
                e1.d dVar = (e1.d) this.e;
                Executor executor = (Executor) this.c;
                i iVar = (i) this.d;
                j.e(e9, "e");
                b1.b bVar = new b1.b(dVar, e9, executor, iVar);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!g.a(cancellationSignal)) {
                    bVar.invoke();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(n2.g gVar, List list) {
        switch (this.a) {
            case 2:
                AndroidUtilities.runOnUIThread(new k0(list, (Utilities.Callback2) this.e, (TLRPC.TL_inputStorePaymentStarsTopup) this.b, (TL_stars.TL_starsTopupOption) this.c, (Activity) this.d, 12));
                break;
            default:
                AndroidUtilities.runOnUIThread(new i1((u7) this.e, list, (u0) this.b, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.c, gVar, (Activity) this.d, 3));
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        k61.P((k61) this.e, (TLRPC.User) this.b, (TLRPC.InputCheckPasswordSRP) this.c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override // org.telegram.ui.zx
    public boolean w(gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        switch (this.a) {
            case 4:
                w2 w2Var = (w2) this.e;
                TLRPC.User user = (TLRPC.User) this.b;
                String str = (String) this.c;
                kc0 kc0Var = (kc0) this.d;
                b3 b3Var = w2Var.d;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle h = p.h("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    h.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else if (DialogObject.isUserDialog(j10)) {
                    h.putLong("user_id", j10);
                } else {
                    h.putLong("chat_id", -j10);
                }
                h.putString("start_text", "@" + UserObject.getPublicUsername(user) + " " + str);
                Activity activity = b3Var.g0;
                if (activity instanceof LaunchActivity) {
                    n2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                    if (MessagesController.getInstance(b3Var.C).checkCanOpenChat(h, lastFragment)) {
                        kc0Var.dismiss();
                        b3Var.Y = true;
                        AndroidUtilities.cancelRunOnUIThread(b3Var.p0);
                        b3Var.x.h();
                        NotificationCenter.getInstance(b3Var.C).removeObserver(b3Var, NotificationCenter.webViewResultSent);
                        NotificationCenter.getGlobalInstance().removeObserver(b3Var, NotificationCenter.didSetNewTheme);
                        if (!b3Var.I0) {
                            super/*android.app.Dialog*/.dismiss();
                            b3Var.I0 = true;
                        }
                        z4 z4Var = new z4(new rn(h));
                        z4Var.b = true;
                        lastFragment.presentFragment(z4Var);
                        break;
                    }
                }
                break;
            case 8:
                b8.u((b8) this.e, (ArrayList) this.b, (TLRPC.TL_document) this.c, (MessageObject) this.d, gyVar, arrayList, charSequence, z11, i10);
                break;
            default:
                nh nhVar = (nh) this.e;
                TLRPC.User user2 = (TLRPC.User) this.b;
                String str2 = (String) this.c;
                kc0 kc0Var2 = (kc0) this.d;
                gi giVar = nhVar.e;
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle h10 = p.h("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j11)) {
                    h10.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                } else if (DialogObject.isUserDialog(j11)) {
                    h10.putLong("user_id", j11);
                } else {
                    h10.putLong("chat_id", -j11);
                }
                h10.putString("start_text", "@" + UserObject.getPublicUsername(user2) + " " + str2);
                n2 n2Var = giVar.b0;
                if (MessagesController.getInstance(giVar.F1).checkCanOpenChat(h10, n2Var)) {
                    kc0Var2.dismiss();
                    giVar.dismiss(true);
                    z4 z4Var2 = new z4(new rn(h10));
                    z4Var2.b = true;
                    n2Var.presentFragment(z4Var2);
                    break;
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
        yy0 yy0Var = (yy0) this.d;
        Integer num = (Integer) obj;
        Float f10 = (Float) obj2;
        LinearLayout g10 = y1.g(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        g10.addView(linearLayout, z5.t(-2, -2, 1, 0, 0, 0, 0));
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
        textView.setTextColor(g6.v0(g6.j5, c6Var));
        StringBuilder sb2 = new StringBuilder("x");
        float floatValue = f10.floatValue();
        Object obj3 = f10;
        if (floatValue <= 0.0f) {
            obj3 = "0";
        }
        sb2.append(obj3);
        textView.setText(sb2.toString());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        g10.addView(textView, z5.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new vy0(yy0Var, g10, false);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        switch (this.a) {
            case 17:
                a61 a61Var = (a61) this.e;
                ArrayList arrayList2 = (ArrayList) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                Runnable runnable = (Runnable) this.d;
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(a61Var.R).getAvailableEffects();
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
