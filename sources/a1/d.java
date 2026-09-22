package a1;

import ai.m0;
import ai.z8;
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
import b2.l1;
import b2.s;
import c5.h;
import com.google.android.gms.tasks.OnFailureListener;
import e2.d0;
import e9.a1;
import e9.f0;
import e9.i0;
import ei.f3;
import ei.k3;
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
import org.telegram.messenger.vl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.mz0;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.sc0;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xc0;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bo;
import org.telegram.ui.cf1;
import org.telegram.ui.ck0;
import org.telegram.ui.eg1;
import org.telegram.ui.h4;
import org.telegram.ui.h71;
import org.telegram.ui.i60;
import org.telegram.ui.n40;
import org.telegram.ui.o40;
import org.telegram.ui.oy;
import org.telegram.ui.qt;
import org.telegram.ui.r71;
import org.telegram.ui.uy;
import org.telegram.ui.wg0;
import org.telegram.ui.yd1;
import v0.i;
import w7.x5;
import x2.m;
import x2.o;
import yh.u;
import yh.u5;
import zg.p0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements OnFailureListener, oy, a2, b5, sc0, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback, Utilities.Callback2Return, m, BillingController.ProductDetailsResponseListenerLegacy {
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

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean A() {
        switch (this.a) {
            case 2:
                break;
            case 6:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.b5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 4:
                bo.y0((bo) this.e, (TLRPC.TL_document) this.b, (String) this.c, this.d, z10, i10);
                break;
            case 8:
                un unVar = (un) this.e;
                unVar.j0.e((TLRPC.TL_messageMediaPoll) this.b, unVar.O, unVar.l1, (ArrayList) this.c, z10, i10, ((Long) this.d).longValue());
                unVar.b.dismiss(true);
                break;
            case 9:
                qt qtVar = (qt) this.e;
                TLRPC.Document document = (TLRPC.Document) this.b;
                qtVar.s(i10, i11, this.d, document != null ? document : (TLRPC.BotInlineResult) this.c, z10);
                break;
            default:
                ((qt) this.e).m((TLRPC.Document) this.b, (String) this.c, this.d, z10, i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean K(uy uyVar) {
        switch (this.a) {
            case 2:
                break;
            case 6:
                break;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    @Override // x2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a1 b(int i10, l1 l1Var, int[] iArr) {
        int i11;
        int i12;
        int i13;
        int i14;
        Point point;
        int i15;
        int i16;
        l1 l1Var2 = l1Var;
        x2.i iVar = (x2.i) this.e;
        String str = (String) this.b;
        int[] iArr2 = (int[]) this.c;
        Point point2 = (Point) this.d;
        int i17 = iArr2[i10];
        int i18 = point2 != null ? point2.x : iVar.i;
        int i19 = point2 != null ? point2.y : iVar.j;
        boolean z10 = iVar.l;
        if (i18 == Integer.MAX_VALUE || i19 == Integer.MAX_VALUE) {
            i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        } else {
            int i20 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i21 = 0; i21 < l1Var2.a; i21++) {
                s sVar = l1Var2.d[i21];
                int i22 = sVar.y;
                int i23 = sVar.z;
                if (i22 > 0 && i23 > 0) {
                    if (z10) {
                        if ((i22 > i23) != (i18 > i19)) {
                            i14 = i18;
                            i13 = i19;
                            int i24 = i22 * i14;
                            int i25 = i23 * i13;
                            point = i24 < i25 ? new Point(i13, d0.f(i25, i22)) : new Point(d0.f(i24, i23), i14);
                            i15 = sVar.y;
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
                    i15 = sVar.y;
                    i16 = i15 * i23;
                    if (i15 >= ((int) (point.x * 0.98f))) {
                        i20 = i16;
                    }
                }
            }
            i11 = i20;
        }
        f0 u10 = i0.u();
        int i26 = 0;
        while (i26 < l1Var2.a) {
            s sVar2 = l1Var2.d[i26];
            int i27 = sVar2.y;
            int i28 = (i27 == -1 || (i12 = sVar2.z) == -1) ? -1 : i27 * i12;
            u10.b(new o(i10, l1Var2, i26, iVar, iArr[i26], str, i17, i11 == Integer.MAX_VALUE || (i28 != -1 && i28 <= i11)));
            i26++;
            l1Var2 = l1Var;
        }
        return u10.i();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        int i11 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.e;
        switch (i11) {
            case 3:
                ((h4) obj4).R((String) obj3, (String) obj2, (nf.e) obj);
                break;
            case 5:
                bo.T0((bo) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 12:
                String str = (String) obj;
                Pattern pattern = LaunchActivity.B1;
                ck0 ck0Var = new ck0((LaunchActivity) obj4, (n2) obj3);
                ck0Var.v((String) obj2, false);
                if (str != null) {
                    String[] split = str.split(" ", 2);
                    String str2 = split[0];
                    String str3 = split.length > 1 ? split[1] : null;
                    xc0 xc0Var = ck0Var.d;
                    if (xc0Var != null) {
                        xc0Var.getEditText().setText(str2);
                    } else {
                        ck0Var.K = str2;
                    }
                    xc0 xc0Var2 = ck0Var.e;
                    if (xc0Var2 != null) {
                        xc0Var2.getEditText().setText(str3);
                    } else {
                        ck0Var.L = str3;
                    }
                }
                ck0Var.show();
                break;
            case 13:
                wg0.W((wg0) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 14:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.l0(true);
                notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(notificationsCustomSettingsActivity.s);
                break;
            default:
                eg1 eg1Var = (eg1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                eg1Var.A0 = hashSet2;
                hashSet2.addAll(hashSet);
                eg1Var.U0(true, false);
                int i12 = 4;
                vc.a0(eg1Var).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new cf1(eg1Var, i12), new yd1(eg1Var, (ArrayList) obj2, (Runnable) obj, i12)).j();
                eg1Var.C0();
                b2Var.dismiss();
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
                kotlin.jvm.internal.i.e(e, "e");
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
            case 21:
                AndroidUtilities.runOnUIThread(new u(list, (Utilities.Callback2) this.e, (TLRPC.TL_inputStorePaymentStarsTopup) this.b, (TL_stars.TL_starsTopupOption) this.c, (Activity) this.d, 7));
                break;
            default:
                AndroidUtilities.runOnUIThread(new z8((u5) this.e, list, (m0) this.b, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.c, hVar, (Activity) this.d, 18));
                break;
        }
    }

    @Override // org.telegram.ui.Components.sc0
    public void q(uc0 uc0Var, int i10) {
        i60 i60Var = (i60) this.e;
        uc0 uc0Var2 = (uc0) this.b;
        n40 n40Var = (n40) this.c;
        o40 o40Var = (o40) this.d;
        try {
            i60Var.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        c5.g(i60Var.T, i60Var.S, 0L, 604800L, 2, uc0Var2, n40Var, o40Var);
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        r71.P((r71) this.e, (TLRPC.User) this.b, (TLRPC.InputCheckPasswordSRP) this.c, (TwoStepVerificationActivity) this.d, j3);
    }

    @Override // org.telegram.ui.oy
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        switch (this.a) {
            case 2:
                f3 f3Var = (f3) this.e;
                TLRPC.User user = (TLRPC.User) this.b;
                String str = (String) this.c;
                zc0 zc0Var = (zc0) this.d;
                k3 k3Var = f3Var.d;
                long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i12 = a4.a.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j3)) {
                    i12.putInt("enc_id", DialogObject.getEncryptedChatId(j3));
                } else if (DialogObject.isUserDialog(j3)) {
                    i12.putLong("user_id", j3);
                } else {
                    i12.putLong("chat_id", -j3);
                }
                i12.putString("start_text", "@" + UserObject.getPublicUsername(user) + " " + str);
                Activity activity = k3Var.k0;
                if (activity instanceof LaunchActivity) {
                    n2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                    if (MessagesController.getInstance(k3Var.G).checkCanOpenChat(i12, lastFragment)) {
                        zc0Var.dismiss();
                        k3Var.c0 = true;
                        AndroidUtilities.cancelRunOnUIThread(k3Var.t0);
                        k3Var.x.i();
                        NotificationCenter.getInstance(k3Var.G).removeObserver(k3Var, NotificationCenter.webViewResultSent);
                        NotificationCenter.getGlobalInstance().removeObserver(k3Var, NotificationCenter.didSetNewTheme);
                        if (!k3Var.M0) {
                            super/*android.app.Dialog*/.dismiss();
                            k3Var.M0 = true;
                        }
                        org.telegram.ui.ActionBar.b5 b5Var = new org.telegram.ui.ActionBar.b5(new bo(i12));
                        b5Var.b = true;
                        lastFragment.presentFragment(b5Var);
                        break;
                    }
                }
                break;
            case 6:
                h8.t((h8) this.e, (ArrayList) this.b, (TLRPC.TL_document) this.c, (MessageObject) this.d, uyVar, arrayList, charSequence, z11, i10);
                break;
            default:
                bi biVar = (bi) this.e;
                TLRPC.User user2 = (TLRPC.User) this.b;
                String str2 = (String) this.c;
                zc0 zc0Var2 = (zc0) this.d;
                vi viVar = biVar.e;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i13 = a4.a.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    i13.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else if (DialogObject.isUserDialog(j10)) {
                    i13.putLong("user_id", j10);
                } else {
                    i13.putLong("chat_id", -j10);
                }
                i13.putString("start_text", "@" + UserObject.getPublicUsername(user2) + " " + str2);
                n2 n2Var = viVar.f0;
                if (MessagesController.getInstance(viVar.J1).checkCanOpenChat(i13, n2Var)) {
                    zc0Var2.dismiss();
                    viVar.dismiss(true);
                    org.telegram.ui.ActionBar.b5 b5Var2 = new org.telegram.ui.ActionBar.b5(new bo(i13));
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
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Context context = (Context) this.e;
        int[] iArr = (int[]) this.b;
        e6 e6Var = (e6) this.c;
        pz0 pz0Var = (pz0) this.d;
        Integer num = (Integer) obj;
        Float f7 = (Float) obj2;
        LinearLayout f10 = vl.f(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        f10.addView(linearLayout, x5.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, x5.n(24, 24));
        if (num.intValue() == 7) {
            for (int i10 = 0; i10 < 2; i10++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, x5.n(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        textView.setTextColor(i6.v0(i6.j5, e6Var));
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
        f10.addView(textView, x5.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new mz0(pz0Var, f10, false);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        switch (this.a) {
            case 15:
                h71 h71Var = (h71) this.e;
                ArrayList arrayList2 = (ArrayList) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                Runnable runnable = (Runnable) this.d;
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(h71Var.V).getAvailableEffects();
                HashSet hashSet = new HashSet();
                if (availableEffects != null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                                String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                                for (int i11 = 0; i11 < availableEffects.effects.size(); i11++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i11);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.id)) && (tL_availableEffect.emoticon.contains(fixEmoji) || fixEmoji.contains(tL_availableEffect.emoticon))) {
                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList3).add(p0.e(tL_availableEffect));
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
