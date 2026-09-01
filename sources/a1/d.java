package a1;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.tasks.OnFailureListener;
import eh.w;
import hg.j0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import k7.c6;
import kotlin.jvm.internal.j;
import lh.e1;
import mh.t7;
import ng.q0;
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
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.rh;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.tz0;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c71;
import org.telegram.ui.d60;
import org.telegram.ui.gd1;
import org.telegram.ui.j40;
import org.telegram.ui.jy;
import org.telegram.ui.k40;
import org.telegram.ui.ke1;
import org.telegram.ui.l4;
import org.telegram.ui.mf1;
import org.telegram.ui.og0;
import org.telegram.ui.ot;
import org.telegram.ui.py;
import org.telegram.ui.r61;
import org.telegram.ui.uj0;
import org.telegram.ui.xn;
import p2.h;
import sh.k2;
import v0.i;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, c2, y4, jy, wc0, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback, Utilities.Callback2Return {
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

    @Override // org.telegram.ui.jy
    public /* synthetic */ boolean C() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.y4
    public void I(int i10, int i11, boolean z4) {
        switch (this.a) {
            case 5:
                xn.y0((xn) this.e, (TLRPC.TL_document) this.b, (String) this.c, this.d, z4, i10);
                break;
            case 9:
                sn snVar = (sn) this.e;
                snVar.g0.b((TLRPC.TL_messageMediaPoll) this.b, snVar.L, snVar.i1, (ArrayList) this.c, z4, i10, ((Long) this.d).longValue());
                snVar.b.dismiss(true);
                break;
            case 10:
                ot otVar = (ot) this.e;
                TLRPC.Document document = (TLRPC.Document) this.b;
                otVar.r(i10, i11, this.d, document != null ? document : (TLRPC.BotInlineResult) this.c, z4);
                break;
            default:
                ((ot) this.e).l((TLRPC.Document) this.b, (String) this.c, this.d, z4, i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.jy
    public /* synthetic */ boolean J(py pyVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(d2 d2Var, int i10) {
        int i11 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.e;
        switch (i11) {
            case 4:
                ((l4) obj4).R((String) obj3, (String) obj2, (af.f) obj);
                break;
            case 6:
                xn.T0((xn) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 13:
                String str = (String) obj;
                Pattern pattern = LaunchActivity.y1;
                uj0 uj0Var = new uj0((LaunchActivity) obj4, (p2) obj3);
                uj0Var.v((String) obj2, false);
                if (str != null) {
                    String[] split = str.split(" ", 2);
                    String str2 = split[0];
                    String str3 = split.length > 1 ? split[1] : null;
                    bd0 bd0Var = uj0Var.d;
                    if (bd0Var != null) {
                        bd0Var.getEditText().setText(str2);
                    } else {
                        uj0Var.H = str2;
                    }
                    bd0 bd0Var2 = uj0Var.e;
                    if (bd0Var2 != null) {
                        bd0Var2.getEditText().setText(str3);
                    } else {
                        uj0Var.I = str3;
                    }
                }
                uj0Var.show();
                break;
            case 14:
                og0.W((og0) obj4, (String) obj3, (String) obj2, (String) obj);
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
                mf1 mf1Var = (mf1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                mf1Var.x0 = hashSet2;
                hashSet2.addAll(hashSet);
                mf1Var.U0(true, false);
                int i12 = 4;
                qc.a0(mf1Var).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new ke1(mf1Var, i12), new gd1(mf1Var, (ArrayList) obj2, (Runnable) obj, i12)).j();
                mf1Var.C0();
                d2Var.dismiss();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e6) {
        switch (this.a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) this.e, (CancellationSignal) this.b, (Executor) this.c, (i) this.d, e6);
                break;
            default:
                CancellationSignal cancellationSignal = (CancellationSignal) this.b;
                e1.d dVar = (e1.d) this.e;
                Executor executor = (Executor) this.c;
                i iVar = (i) this.d;
                j.e(e6, "e");
                b1.b bVar = new b1.b(dVar, e6, executor, iVar);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!g.a(cancellationSignal)) {
                    bVar.invoke();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(h hVar, List list) {
        switch (this.a) {
            case 2:
                AndroidUtilities.runOnUIThread(new j0(list, (Utilities.Callback2) this.e, (TLRPC.TL_inputStorePaymentStarsTopup) this.b, (TL_stars.TL_starsTopupOption) this.c, (Activity) this.d, 12));
                break;
            default:
                AndroidUtilities.runOnUIThread(new e1((t7) this.e, list, (w) this.b, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.c, hVar, (Activity) this.d, 3));
                break;
        }
    }

    @Override // org.telegram.ui.Components.wc0
    public void q(yc0 yc0Var, int i10) {
        d60 d60Var = (d60) this.e;
        yc0 yc0Var2 = (yc0) this.b;
        j40 j40Var = (j40) this.c;
        k40 k40Var = (k40) this.d;
        try {
            d60Var.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        z4.g(d60Var.Q, d60Var.P, 0L, 604800L, 2, yc0Var2, j40Var, k40Var);
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        c71.P((c71) this.e, (TLRPC.User) this.b, (TLRPC.InputCheckPasswordSRP) this.c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override // org.telegram.ui.jy
    public boolean v(py pyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, mf1 mf1Var) {
        switch (this.a) {
            case 7:
                c8.t((c8) this.e, (ArrayList) this.b, (TLRPC.TL_document) this.c, (MessageObject) this.d, pyVar, arrayList, charSequence, z10, i10);
                break;
            case 8:
                rh rhVar = (rh) this.e;
                TLRPC.User user = (TLRPC.User) this.b;
                String str = (String) this.c;
                dd0 dd0Var = (dd0) this.d;
                mi miVar = rhVar.e;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i12 = android.support.v4.media.a.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    i12.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else if (DialogObject.isUserDialog(j10)) {
                    i12.putLong("user_id", j10);
                } else {
                    i12.putLong("chat_id", -j10);
                }
                i12.putString("start_text", "@" + UserObject.getPublicUsername(user) + " " + str);
                p2 p2Var = miVar.c0;
                if (MessagesController.getInstance(miVar.G1).checkCanOpenChat(i12, p2Var)) {
                    dd0Var.dismiss();
                    miVar.dismiss(true);
                    d5 d5Var = new d5(new xn(i12));
                    d5Var.b = true;
                    p2Var.presentFragment(d5Var);
                    break;
                }
                break;
            default:
                k2 k2Var = (k2) this.e;
                TLRPC.User user2 = (TLRPC.User) this.b;
                String str2 = (String) this.c;
                dd0 dd0Var2 = (dd0) this.d;
                sh.p2 p2Var2 = k2Var.d;
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i13 = android.support.v4.media.a.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j11)) {
                    i13.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                } else if (DialogObject.isUserDialog(j11)) {
                    i13.putLong("user_id", j11);
                } else {
                    i13.putLong("chat_id", -j11);
                }
                i13.putString("start_text", "@" + UserObject.getPublicUsername(user2) + " " + str2);
                Activity activity = p2Var2.h0;
                if (activity instanceof LaunchActivity) {
                    p2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                    if (MessagesController.getInstance(p2Var2.D).checkCanOpenChat(i13, lastFragment)) {
                        dd0Var2.dismiss();
                        p2Var2.Z = true;
                        AndroidUtilities.cancelRunOnUIThread(p2Var2.q0);
                        p2Var2.x.h();
                        NotificationCenter.getInstance(p2Var2.D).removeObserver(p2Var2, NotificationCenter.webViewResultSent);
                        NotificationCenter.getGlobalInstance().removeObserver(p2Var2, NotificationCenter.didSetNewTheme);
                        if (!p2Var2.J0) {
                            super/*android.app.Dialog*/.dismiss();
                            p2Var2.J0 = true;
                        }
                        d5 d5Var2 = new d5(new xn(i13));
                        d5Var2.b = true;
                        lastFragment.presentFragment(d5Var2);
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
        g6 g6Var = (g6) this.c;
        tz0 tz0Var = (tz0) this.d;
        Integer num = (Integer) obj;
        Float f10 = (Float) obj2;
        LinearLayout f11 = y3.f(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        f11.addView(linearLayout, c6.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, c6.n(24, 24));
        if (num.intValue() == 7) {
            for (int i10 = 0; i10 < 2; i10++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, c6.n(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        textView.setTextColor(k6.v0(k6.j5, g6Var));
        StringBuilder sb = new StringBuilder("x");
        float floatValue = f10.floatValue();
        Object obj3 = f10;
        if (floatValue <= 0.0f) {
            obj3 = "0";
        }
        sb.append(obj3);
        textView.setText(sb.toString());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        f11.addView(textView, c6.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new qz0(tz0Var, f11, false);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        switch (this.a) {
            case 16:
                r61 r61Var = (r61) this.e;
                ArrayList arrayList2 = (ArrayList) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                Runnable runnable = (Runnable) this.d;
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(r61Var.S).getAvailableEffects();
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
