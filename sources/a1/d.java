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
import b2.l1;
import b2.s;
import bi.k6;
import bi.te;
import c5.h;
import com.google.android.gms.tasks.OnFailureListener;
import di.i3;
import di.n3;
import e2.d0;
import e9.a1;
import e9.f0;
import e9.i0;
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
import org.telegram.messenger.em;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.b01;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.id0;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.Components.zn;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ce1;
import org.telegram.ui.ek0;
import org.telegram.ui.eo;
import org.telegram.ui.gf1;
import org.telegram.ui.ig1;
import org.telegram.ui.j4;
import org.telegram.ui.j60;
import org.telegram.ui.l71;
import org.telegram.ui.o40;
import org.telegram.ui.p40;
import org.telegram.ui.qy;
import org.telegram.ui.rt;
import org.telegram.ui.v71;
import org.telegram.ui.wy;
import org.telegram.ui.xg0;
import v0.i;
import w7.a6;
import x2.m;
import x2.o;
import xh.v5;
import xh.x4;
import yg.p0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements OnFailureListener, qy, c2, c5, bd0, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback, Utilities.Callback2Return, m, BillingController.ProductDetailsResponseListenerLegacy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(CancellationSignal cancellationSignal, e1.d dVar, Executor executor, i iVar) {
        this.a = 2;
        this.c = cancellationSignal;
        this.b = dVar;
        this.d = executor;
        this.e = iVar;
    }

    @Override // org.telegram.ui.qy
    public /* synthetic */ boolean A() {
        switch (this.a) {
            case 1:
                break;
            case 6:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.c5
    public void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 4:
                eo.y0((eo) this.b, (TLRPC.TL_document) this.c, (String) this.d, this.e, z10, i10);
                break;
            case 8:
                zn znVar = (zn) this.b;
                znVar.j0.c((TLRPC.TL_messageMediaPoll) this.c, znVar.O, znVar.l1, (ArrayList) this.d, z10, i10, ((Long) this.e).longValue());
                znVar.b.dismiss(true);
                break;
            case 9:
                rt rtVar = (rt) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                rtVar.r(i10, i11, this.e, document != null ? document : (TLRPC.BotInlineResult) this.d, z10);
                break;
            default:
                ((rt) this.b).l((TLRPC.Document) this.c, (String) this.d, this.e, z10, i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.qy
    public /* synthetic */ boolean J(wy wyVar) {
        switch (this.a) {
            case 1:
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
    public a1 e(int i10, l1 l1Var, int[] iArr) {
        int i11;
        int i12;
        int i13;
        int i14;
        Point point;
        int i15;
        int i16;
        l1 l1Var2 = l1Var;
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

    @Override // org.telegram.ui.ActionBar.c2
    public void f(d2 d2Var, int i10) {
        int i11 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i11) {
            case 3:
                ((j4) obj4).R((String) obj3, (String) obj2, (nf.e) obj);
                break;
            case 5:
                eo.T0((eo) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 12:
                String str = (String) obj;
                Pattern pattern = LaunchActivity.B1;
                ek0 ek0Var = new ek0((LaunchActivity) obj4, (p2) obj3);
                ek0Var.v((String) obj2, false);
                if (str != null) {
                    String[] split = str.split(" ", 2);
                    String str2 = split[0];
                    String str3 = split.length > 1 ? split[1] : null;
                    gd0 gd0Var = ek0Var.d;
                    if (gd0Var != null) {
                        gd0Var.getEditText().setText(str2);
                    } else {
                        ek0Var.K = str2;
                    }
                    gd0 gd0Var2 = ek0Var.e;
                    if (gd0Var2 != null) {
                        gd0Var2.getEditText().setText(str3);
                    } else {
                        ek0Var.L = str3;
                    }
                }
                ek0Var.show();
                break;
            case 13:
                xg0.W((xg0) obj4, (String) obj3, (String) obj2, (String) obj);
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
                ig1 ig1Var = (ig1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                ig1Var.A0 = hashSet2;
                hashSet2.addAll(hashSet);
                ig1Var.U0(true, false);
                int i12 = 4;
                wc.a0(ig1Var).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new gf1(ig1Var, i12), new ce1(ig1Var, (ArrayList) obj2, (Runnable) obj, i12)).j();
                ig1Var.C0();
                d2Var.dismiss();
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
                e1.d dVar = (e1.d) this.b;
                Executor executor = (Executor) this.d;
                i iVar = (i) this.e;
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
                AndroidUtilities.runOnUIThread(new x4(list, (Utilities.Callback2) this.b, (TLRPC.TL_inputStorePaymentStarsTopup) this.c, (TL_stars.TL_starsTopupOption) this.d, (Activity) this.e, 3));
                break;
            default:
                AndroidUtilities.runOnUIThread(new te((v5) this.b, list, (k6) this.c, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.d, hVar, (Activity) this.e, 17));
                break;
        }
    }

    @Override // org.telegram.ui.Components.bd0
    public void q(dd0 dd0Var, int i10) {
        j60 j60Var = (j60) this.b;
        dd0 dd0Var2 = (dd0) this.c;
        o40 o40Var = (o40) this.d;
        p40 p40Var = (p40) this.e;
        try {
            j60Var.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        d5.g(j60Var.T, j60Var.S, 0L, 604800L, 2, dd0Var2, o40Var, p40Var);
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        v71.P((v71) this.b, (TLRPC.User) this.c, (TLRPC.InputCheckPasswordSRP) this.d, (TwoStepVerificationActivity) this.e, j3);
    }

    @Override // org.telegram.ui.qy
    public boolean v(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ig1 ig1Var) {
        switch (this.a) {
            case 1:
                i3 i3Var = (i3) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                String str = (String) this.d;
                id0 id0Var = (id0) this.e;
                n3 n3Var = i3Var.d;
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
                Activity activity = n3Var.k0;
                if (activity instanceof LaunchActivity) {
                    p2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                    if (MessagesController.getInstance(n3Var.G).checkCanOpenChat(i12, lastFragment)) {
                        id0Var.dismiss();
                        n3Var.c0 = true;
                        AndroidUtilities.cancelRunOnUIThread(n3Var.t0);
                        n3Var.x.i();
                        NotificationCenter.getInstance(n3Var.G).removeObserver(n3Var, NotificationCenter.webViewResultSent);
                        NotificationCenter.getGlobalInstance().removeObserver(n3Var, NotificationCenter.didSetNewTheme);
                        if (!n3Var.M0) {
                            super/*android.app.Dialog*/.dismiss();
                            n3Var.M0 = true;
                        }
                        org.telegram.ui.ActionBar.d5 d5Var = new org.telegram.ui.ActionBar.d5(new eo(i12));
                        d5Var.b = true;
                        lastFragment.presentFragment(d5Var);
                        break;
                    }
                }
                break;
            case 6:
                j8.t((j8) this.b, (ArrayList) this.c, (TLRPC.TL_document) this.d, (MessageObject) this.e, wyVar, arrayList, charSequence, z11, i10);
                break;
            default:
                ei eiVar = (ei) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                String str2 = (String) this.d;
                id0 id0Var2 = (id0) this.e;
                yi yiVar = eiVar.e;
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
                p2 p2Var = yiVar.f0;
                if (MessagesController.getInstance(yiVar.J1).checkCanOpenChat(i13, p2Var)) {
                    id0Var2.dismiss();
                    yiVar.dismiss(true);
                    org.telegram.ui.ActionBar.d5 d5Var2 = new org.telegram.ui.ActionBar.d5(new eo(i13));
                    d5Var2.b = true;
                    p2Var.presentFragment(d5Var2);
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
        f6 f6Var = (f6) this.d;
        b01 b01Var = (b01) this.e;
        Integer num = (Integer) obj;
        Float f7 = (Float) obj2;
        LinearLayout f10 = em.f(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        f10.addView(linearLayout, a6.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, a6.n(24, 24));
        if (num.intValue() == 7) {
            for (int i10 = 0; i10 < 2; i10++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, a6.n(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        textView.setTextColor(j6.v0(j6.j5, f6Var));
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
        f10.addView(textView, a6.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new yz0(b01Var, f10, false);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        switch (this.a) {
            case 15:
                l71 l71Var = (l71) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(l71Var.V).getAvailableEffects();
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
