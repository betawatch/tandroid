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
import dh.v;
import gg.j0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import k7.b6;
import kh.e1;
import kotlin.jvm.internal.j;
import lh.t7;
import mg.q0;
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
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rh;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.xc0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.e60;
import org.telegram.ui.i71;
import org.telegram.ui.k40;
import org.telegram.ui.ky;
import org.telegram.ui.l40;
import org.telegram.ui.ld1;
import org.telegram.ui.n4;
import org.telegram.ui.pe1;
import org.telegram.ui.pg0;
import org.telegram.ui.pt;
import org.telegram.ui.qy;
import org.telegram.ui.sf1;
import org.telegram.ui.uj0;
import org.telegram.ui.x61;
import org.telegram.ui.zn;
import p2.h;
import rh.k2;
import v0.i;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, c2, y4, ky, vc0, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback, Utilities.Callback2Return {
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

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean C() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean I(qy qyVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        switch (this.a) {
            case 5:
                zn.y0((zn) this.e, (TLRPC.TL_document) this.b, (String) this.c, this.d, z4, i10);
                break;
            case 9:
                pn pnVar = (pn) this.e;
                pnVar.g0.c((TLRPC.TL_messageMediaPoll) this.b, pnVar.L, pnVar.i1, (ArrayList) this.c, z4, i10, ((Long) this.d).longValue());
                pnVar.b.dismiss(true);
                break;
            case 10:
                pt ptVar = (pt) this.e;
                TLRPC.Document document = (TLRPC.Document) this.b;
                ptVar.s(i10, i11, this.d, document != null ? document : (TLRPC.BotInlineResult) this.c, z4);
                break;
            default:
                ((pt) this.e).m((TLRPC.Document) this.b, (String) this.c, this.d, z4, i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(d2 d2Var, int i10) {
        int i11 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.e;
        switch (i11) {
            case 4:
                ((n4) obj4).R((String) obj3, (String) obj2, (ze.c) obj);
                break;
            case 6:
                zn.T0((zn) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
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
                    ad0 ad0Var = uj0Var.d;
                    if (ad0Var != null) {
                        ad0Var.getEditText().setText(str2);
                    } else {
                        uj0Var.H = str2;
                    }
                    ad0 ad0Var2 = uj0Var.e;
                    if (ad0Var2 != null) {
                        ad0Var2.getEditText().setText(str3);
                    } else {
                        uj0Var.I = str3;
                    }
                }
                uj0Var.show();
                break;
            case 14:
                pg0.W((pg0) obj4, (String) obj3, (String) obj2, (String) obj);
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
                sf1 sf1Var = (sf1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                sf1Var.x0 = hashSet2;
                hashSet2.addAll(hashSet);
                sf1Var.U0(true, false);
                int i12 = 4;
                qc.a0(sf1Var).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new pe1(sf1Var, i12), new ld1(sf1Var, (ArrayList) obj2, (Runnable) obj, i12)).j();
                sf1Var.C0();
                d2Var.dismiss();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e) {
        switch (this.a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) this.e, (CancellationSignal) this.b, (Executor) this.c, (i) this.d, e);
                break;
            default:
                CancellationSignal cancellationSignal = (CancellationSignal) this.b;
                e1.d dVar = (e1.d) this.e;
                Executor executor = (Executor) this.c;
                i iVar = (i) this.d;
                j.e(e, "e");
                b1.b bVar = new b1.b(dVar, e, executor, iVar);
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
                AndroidUtilities.runOnUIThread(new e1((t7) this.e, list, (v) this.b, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.c, hVar, (Activity) this.d, 3));
                break;
        }
    }

    @Override // org.telegram.ui.Components.vc0
    public void q(xc0 xc0Var, int i10) {
        e60 e60Var = (e60) this.e;
        xc0 xc0Var2 = (xc0) this.b;
        k40 k40Var = (k40) this.c;
        l40 l40Var = (l40) this.d;
        try {
            e60Var.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        z4.g(e60Var.Q, e60Var.P, 0L, 604800L, 2, xc0Var2, k40Var, l40Var);
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        i71.P((i71) this.e, (TLRPC.User) this.b, (TLRPC.InputCheckPasswordSRP) this.c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override // org.telegram.ui.ky
    public boolean w(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        switch (this.a) {
            case 7:
                c8.t((c8) this.e, (ArrayList) this.b, (TLRPC.TL_document) this.c, (MessageObject) this.d, qyVar, arrayList, charSequence, z10, i10);
                break;
            case 8:
                rh rhVar = (rh) this.e;
                TLRPC.User user = (TLRPC.User) this.b;
                String str = (String) this.c;
                cd0 cd0Var = (cd0) this.d;
                li liVar = rhVar.e;
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
                p2 p2Var = liVar.c0;
                if (MessagesController.getInstance(liVar.G1).checkCanOpenChat(i12, p2Var)) {
                    cd0Var.dismiss();
                    liVar.dismiss(true);
                    c5 c5Var = new c5(new zn(i12));
                    c5Var.b = true;
                    p2Var.presentFragment(c5Var);
                    break;
                }
                break;
            default:
                k2 k2Var = (k2) this.e;
                TLRPC.User user2 = (TLRPC.User) this.b;
                String str2 = (String) this.c;
                cd0 cd0Var2 = (cd0) this.d;
                rh.p2 p2Var2 = k2Var.d;
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
                        cd0Var2.dismiss();
                        p2Var2.Z = true;
                        AndroidUtilities.cancelRunOnUIThread(p2Var2.q0);
                        p2Var2.x.i();
                        NotificationCenter.getInstance(p2Var2.D).removeObserver(p2Var2, NotificationCenter.webViewResultSent);
                        NotificationCenter.getGlobalInstance().removeObserver(p2Var2, NotificationCenter.didSetNewTheme);
                        if (!p2Var2.J0) {
                            super/*android.app.Dialog*/.dismiss();
                            p2Var2.J0 = true;
                        }
                        c5 c5Var2 = new c5(new zn(i13));
                        c5Var2.b = true;
                        lastFragment.presentFragment(c5Var2);
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
        f6 f6Var = (f6) this.c;
        sz0 sz0Var = (sz0) this.d;
        Integer num = (Integer) obj;
        Float f10 = (Float) obj2;
        LinearLayout f11 = y3.f(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        f11.addView(linearLayout, b6.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, b6.n(24, 24));
        if (num.intValue() == 7) {
            for (int i10 = 0; i10 < 2; i10++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, b6.n(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        textView.setTextColor(j6.v0(j6.j5, f6Var));
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
        f11.addView(textView, b6.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new pz0(sz0Var, f11, false);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        switch (this.a) {
            case 16:
                x61 x61Var = (x61) this.e;
                ArrayList arrayList2 = (ArrayList) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                Runnable runnable = (Runnable) this.d;
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(x61Var.S).getAvailableEffects();
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
