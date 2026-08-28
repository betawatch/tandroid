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
import bg.o0;
import bg.y0;
import com.google.android.gms.tasks.OnFailureListener;
import fh.k1;
import g7.e6;
import gh.v7;
import hg.r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import mh.c3;
import mh.x2;
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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.gc0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.rh;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b61;
import org.telegram.ui.dy;
import org.telegram.ui.fg0;
import org.telegram.ui.ft;
import org.telegram.ui.l4;
import org.telegram.ui.l61;
import org.telegram.ui.nj0;
import org.telegram.ui.o50;
import org.telegram.ui.qc1;
import org.telegram.ui.qn;
import org.telegram.ui.t30;
import org.telegram.ui.td1;
import org.telegram.ui.u30;
import org.telegram.ui.we1;
import org.telegram.ui.wx;
import v0.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, wx, b2, x4, zb0, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback, Utilities.Callback2Return {
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

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        switch (this.a) {
            case 6:
                qn.x0((qn) this.e, (TLRPC.TL_document) this.b, (String) this.c, this.d, z10, i9);
                break;
            case 10:
                jn jnVar = (jn) this.e;
                jnVar.f0.e((TLRPC.TL_messageMediaPoll) this.b, jnVar.K, jnVar.h1, (ArrayList) this.c, z10, i9, ((Long) this.d).longValue());
                jnVar.b.dismiss(true);
                break;
            case 11:
                ft ftVar = (ft) this.e;
                TLRPC.Document document = (TLRPC.Document) this.b;
                ftVar.s(i9, i10, this.d, document != null ? document : (TLRPC.BotInlineResult) this.c, z10);
                break;
            default:
                ((ft) this.e).l((TLRPC.Document) this.b, (String) this.c, this.d, z10, i9, i10);
                break;
        }
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean C() {
        switch (this.a) {
            case 4:
                break;
            case 8:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean I(dy dyVar) {
        switch (this.a) {
            case 4:
                break;
            case 8:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i9) {
        int i10 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.e;
        switch (i10) {
            case 5:
                ((l4) obj4).R((String) obj3, (String) obj2, (ve.d) obj);
                break;
            case 7:
                qn.T0((qn) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 14:
                String str = (String) obj;
                Pattern pattern = LaunchActivity.x1;
                nj0 nj0Var = new nj0((LaunchActivity) obj4, (o2) obj3);
                nj0Var.v((String) obj2, false);
                if (str != null) {
                    String[] split = str.split(" ", 2);
                    String str2 = split[0];
                    String str3 = split.length > 1 ? split[1] : null;
                    ec0 ec0Var = nj0Var.d;
                    if (ec0Var != null) {
                        ec0Var.getEditText().setText(str2);
                    } else {
                        nj0Var.G = str2;
                    }
                    ec0 ec0Var2 = nj0Var.e;
                    if (ec0Var2 != null) {
                        ec0Var2.getEditText().setText(str3);
                    } else {
                        nj0Var.H = str3;
                    }
                }
                nj0Var.show();
                break;
            case 15:
                fg0.V((fg0) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 16:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.k0(true);
                notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(notificationsCustomSettingsActivity.s);
                break;
            default:
                we1 we1Var = (we1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                we1Var.w0 = hashSet2;
                hashSet2.addAll(hashSet);
                we1Var.U0(true, false);
                int i11 = 4;
                oc.a0(we1Var).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new td1(we1Var, i11), new qc1(we1Var, (ArrayList) obj2, (Runnable) obj, i11)).j();
                we1Var.B0();
                c2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.zb0
    public void m(bc0 bc0Var, int i9) {
        o50 o50Var = (o50) this.e;
        bc0 bc0Var2 = (bc0) this.b;
        t30 t30Var = (t30) this.c;
        u30 u30Var = (u30) this.d;
        try {
            o50Var.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        y4.g(o50Var.P, o50Var.O, 0L, 604800L, 2, bc0Var2, t30Var, u30Var);
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
                kotlin.jvm.internal.i.e(e10, "e");
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
    public void onProductDetailsResponse(n2.g gVar, List list) {
        switch (this.a) {
            case 2:
                AndroidUtilities.runOnUIThread(new o0(list, (Utilities.Callback2) this.e, (TLRPC.TL_inputStorePaymentStarsTopup) this.b, (TL_stars.TL_starsTopupOption) this.c, (Activity) this.d, 12));
                break;
            default:
                AndroidUtilities.runOnUIThread(new k1((v7) this.e, list, (y0) this.b, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.c, gVar, (Activity) this.d, 3));
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        l61.O((l61) this.e, (TLRPC.User) this.b, (TLRPC.InputCheckPasswordSRP) this.c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override // org.telegram.ui.wx
    public boolean v(dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        switch (this.a) {
            case 4:
                x2 x2Var = (x2) this.e;
                TLRPC.User user = (TLRPC.User) this.b;
                String str = (String) this.c;
                gc0 gc0Var = (gc0) this.d;
                c3 c3Var = x2Var.d;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i11 = aa.d.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    i11.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else if (DialogObject.isUserDialog(j10)) {
                    i11.putLong("user_id", j10);
                } else {
                    i11.putLong("chat_id", -j10);
                }
                i11.putString("start_text", "@" + UserObject.getPublicUsername(user) + " " + str);
                Activity activity = c3Var.g0;
                if (activity instanceof LaunchActivity) {
                    o2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                    if (MessagesController.getInstance(c3Var.C).checkCanOpenChat(i11, lastFragment)) {
                        gc0Var.dismiss();
                        c3Var.Y = true;
                        AndroidUtilities.cancelRunOnUIThread(c3Var.p0);
                        c3Var.x.h();
                        NotificationCenter.getInstance(c3Var.C).removeObserver(c3Var, NotificationCenter.webViewResultSent);
                        NotificationCenter.getGlobalInstance().removeObserver(c3Var, NotificationCenter.didSetNewTheme);
                        if (!c3Var.I0) {
                            super/*android.app.Dialog*/.dismiss();
                            c3Var.I0 = true;
                        }
                        z4 z4Var = new z4(new qn(i11));
                        z4Var.b = true;
                        lastFragment.presentFragment(z4Var);
                        break;
                    }
                }
                break;
            case 8:
                c8.t((c8) this.e, (ArrayList) this.b, (TLRPC.TL_document) this.c, (MessageObject) this.d, dyVar, arrayList, charSequence, z11, i9);
                break;
            default:
                rh rhVar = (rh) this.e;
                TLRPC.User user2 = (TLRPC.User) this.b;
                String str2 = (String) this.c;
                gc0 gc0Var2 = (gc0) this.d;
                ki kiVar = rhVar.e;
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i12 = aa.d.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j11)) {
                    i12.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                } else if (DialogObject.isUserDialog(j11)) {
                    i12.putLong("user_id", j11);
                } else {
                    i12.putLong("chat_id", -j11);
                }
                i12.putString("start_text", "@" + UserObject.getPublicUsername(user2) + " " + str2);
                o2 o2Var = kiVar.b0;
                if (MessagesController.getInstance(kiVar.F1).checkCanOpenChat(i12, o2Var)) {
                    gc0Var2.dismiss();
                    kiVar.dismiss(true);
                    z4 z4Var2 = new z4(new qn(i12));
                    z4Var2.b = true;
                    o2Var.presentFragment(z4Var2);
                    break;
                }
                break;
        }
        return true;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.a = i9;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Context context = (Context) this.e;
        int[] iArr = (int[]) this.b;
        b6 b6Var = (b6) this.c;
        wy0 wy0Var = (wy0) this.d;
        Integer num = (Integer) obj;
        Float f10 = (Float) obj2;
        LinearLayout f11 = ll.f(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        f11.addView(linearLayout, e6.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, e6.n(24, 24));
        if (num.intValue() == 7) {
            for (int i9 = 0; i9 < 2; i9++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, e6.n(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        textView.setTextColor(f6.v0(f6.j5, b6Var));
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
        f11.addView(textView, e6.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new ty0(wy0Var, f11, false);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        switch (this.a) {
            case 17:
                b61 b61Var = (b61) this.e;
                ArrayList arrayList2 = (ArrayList) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                Runnable runnable = (Runnable) this.d;
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(b61Var.R).getAvailableEffects();
                HashSet hashSet = new HashSet();
                if (availableEffects != null) {
                    for (int i9 = 0; i9 < arrayList.size(); i9++) {
                        try {
                            if (!((MediaDataController.KeywordResult) arrayList.get(i9)).emoji.startsWith("animated_")) {
                                String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i9)).emoji);
                                for (int i10 = 0; i10 < availableEffects.effects.size(); i10++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i10);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.id)) && (tL_availableEffect.emoticon.contains(fixEmoji) || fixEmoji.contains(tL_availableEffect.emoticon))) {
                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList3).add(r0.e(tL_availableEffect));
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
                for (int i11 = 0; i11 < size; i11++) {
                    String str2 = ((MediaDataController.KeywordResult) arrayList.get(i11)).emoji;
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
