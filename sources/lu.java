// default package

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class lu implements ee, hk3, gk, OnFailureListener, ce3, jp7, es6, xe7, kac, bj0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lu(LaunchActivity launchActivity, d dVar, String str, String str2) {
        this.a = (byte) 13;
        this.b = launchActivity;
        this.e = dVar;
        this.c = str;
        this.d = str2;
    }

    @Override // hk3
    public final boolean E() {
        byte b = this.a;
        return false;
    }

    @Override // bj0
    public final void b(fj0 fj0Var, List list) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 22:
                gm.c3(new hz7((Object) list, obj4, obj3, obj2, obj, (byte) 28));
                break;
            default:
                gm.c3(new fqa((jva) obj4, list, (lf2) obj3, (TLRPC.TL_inputStorePaymentStarsGiveaway) obj2, fj0Var, (Activity) obj, (byte) 2));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // es6
    public final void f(String str, ArrayList arrayList) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object[] objArr = 0;
        switch (b) {
            case 15:
                hs6 hs6Var = (hs6) obj4;
                fs6 fs6Var = (fs6) obj3;
                gs6 gs6Var = (gs6) obj2;
                qac qacVar = (qac) obj;
                HashMap hashMap = hs6Var.S1;
                if (hashMap.containsKey(fs6Var)) {
                    StringBuilder sb = new StringBuilder();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj5 = arrayList.get(i);
                        i++;
                        ds6 ds6Var = (ds6) obj5;
                        if (!TextUtils.isEmpty(ds6Var.a) && !ds6Var.a.startsWith("animated_")) {
                            sb.append(ds6Var.a);
                        }
                    }
                    TLRPC.TL_messages_searchStickers tL_messages_searchStickers = new TLRPC.TL_messages_searchStickers();
                    boolean z = fs6Var.a;
                    String str2 = fs6Var.b;
                    tL_messages_searchStickers.emojis = z;
                    if (!TextUtils.isEmpty(str2)) {
                        tL_messages_searchStickers.lang_code.add(str2);
                    }
                    tL_messages_searchStickers.emoticon = sb.toString();
                    tL_messages_searchStickers.q = fs6Var.c;
                    tL_messages_searchStickers.limit = 100;
                    tL_messages_searchStickers.offset = gs6Var == null ? 0 : gs6Var.b.intValue();
                    hashMap.put(fs6Var, Integer.valueOf(hs6Var.getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new kc(objArr == true ? 1 : 0), new nv0((Object) hs6Var, (Object) fs6Var, (Object) gs6Var, (Object) qacVar, (byte) 11))));
                    break;
                }
                break;
            case 16:
            default:
                HashMap hashMap2 = (HashMap) obj4;
                HashMap hashMap3 = (HashMap) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str3 = ((ds6) arrayList.get(i2)).a;
                    ArrayList arrayList3 = (ArrayList) hashMap2.get(str3);
                    if (arrayList3 != null && !arrayList3.isEmpty() && !hashMap3.containsKey(arrayList3)) {
                        hashMap3.put(arrayList3, str3);
                        arrayList2.add(arrayList3);
                    }
                }
                runnable.run();
                break;
            case 17:
                ArrayList arrayList4 = (ArrayList) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                Runnable runnable2 = (Runnable) obj;
                TLRPC.messages_AvailableEffects D0 = oc7.r1(((vz9) obj4).W).D0();
                HashSet hashSet = new HashSet();
                if (D0 != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        try {
                            if (!((ds6) arrayList.get(i3)).a.startsWith("animated_")) {
                                String c = gw3.c(((ds6) arrayList.get(i3)).a);
                                for (int i4 = 0; i4 < D0.effects.size(); i4++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = D0.effects.get(i4);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.id)) && (tL_availableEffect.emoticon.contains(c) || c.contains(tL_availableEffect.emoticon))) {
                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList4 : arrayList5).add(k39.e(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.id));
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                runnable2.run();
                break;
        }
    }

    @Override // jp7
    public final void g(lp7 lp7Var, int i) {
        g95 g95Var = (g95) this.b;
        lp7 lp7Var2 = (lp7) this.c;
        r75 r75Var = (r75) this.d;
        s75 s75Var = (s75) this.e;
        try {
            g95Var.c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ik.g(g95Var.M1, g95Var.L1, 0L, 604800L, 2, lp7Var2, r75Var, s75Var);
    }

    @Override // kac
    public final Object j(Integer num, Object obj) {
        Context context = (Context) this.b;
        int[] iArr = (int[]) this.c;
        ylb ylbVar = (ylb) this.d;
        mhb mhbVar = (mhb) this.e;
        Float f = (Float) obj;
        LinearLayout i = hg9.i(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        i.addView(linearLayout, qoe.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, qoe.o(24, 24));
        if (num.intValue() == 7) {
            for (int i2 = 0; i2 < 2; i2++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, qoe.o(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(gm.n1("fonts/num.otf"));
        anb.X(textView, cmb.i5, ylbVar);
        StringBuilder sb = new StringBuilder("x");
        float floatValue = f.floatValue();
        Object obj2 = f;
        if (floatValue <= 0.0f) {
            obj2 = "0";
        }
        sb.append(obj2);
        textView.setText(sb.toString());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        i.addView(textView, qoe.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new jhb(mhbVar, i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    @Override // ce3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y79 n(int i, uzb uzbVar, int[] iArr) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Point point;
        int i8;
        int i9;
        uzb uzbVar2 = uzbVar;
        ae3 ae3Var = (ae3) this.b;
        String str = (String) this.c;
        int[] iArr2 = (int[]) this.d;
        Point point2 = (Point) this.e;
        int i10 = iArr2[i];
        if (point2 != null) {
            i2 = point2.x;
            i3 = point2.y;
        } else {
            i2 = ae3Var.i;
            i3 = ae3Var.j;
        }
        boolean z = ae3Var.l;
        if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
            i4 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        } else {
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < uzbVar2.a; i12++) {
                go4 go4Var = uzbVar2.d[i12];
                int i13 = go4Var.A;
                int i14 = go4Var.B;
                if (i13 > 0 && i14 > 0) {
                    if (z) {
                        if ((i13 > i14) != (i2 > i3)) {
                            i7 = i3;
                            i6 = i2;
                            int i15 = i13 * i6;
                            int i16 = i14 * i7;
                            point = i15 < i16 ? new Point(i7, hac.g(i16, i13)) : new Point(hac.g(i15, i14), i6);
                            i8 = go4Var.A;
                            i9 = i8 * i14;
                            if (i8 >= ((int) (point.x * 0.98f)) && i14 >= ((int) (point.y * 0.98f)) && i9 < i11) {
                                i11 = i9;
                            }
                        }
                    }
                    i6 = i3;
                    i7 = i2;
                    int i152 = i13 * i6;
                    int i162 = i14 * i7;
                    if (i152 < i162) {
                    }
                    i8 = go4Var.A;
                    i9 = i8 * i14;
                    if (i8 >= ((int) (point.x * 0.98f))) {
                        i11 = i9;
                    }
                }
            }
            i4 = i11;
        }
        jo5 p = mo5.p();
        int i17 = 0;
        while (i17 < uzbVar2.a) {
            go4 go4Var2 = uzbVar2.d[i17];
            int i18 = go4Var2.A;
            int i19 = (i18 == -1 || (i5 = go4Var2.B) == -1) ? -1 : i18 * i5;
            p.c(new ee3(i, uzbVar2, i17, ae3Var, iArr[i17], str, i10, i4 == Integer.MAX_VALUE || (i19 != -1 && i19 <= i4)));
            i17++;
            uzbVar2 = uzbVar;
        }
        return p.f();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(final Exception exc) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 9:
                final k23 k23Var = (k23) obj3;
                final Executor executor = (Executor) obj2;
                final a33 a33Var = (a33) obj;
                exc.getClass();
                pr4 pr4Var = new pr4(k23Var, exc, executor, a33Var) { // from class: h23
                    public final /* synthetic */ Exception a;
                    public final /* synthetic */ Executor b;
                    public final /* synthetic */ a33 c;

                    {
                        this.a = exc;
                        this.b = executor;
                        this.c = a33Var;
                    }

                    @Override // pr4
                    public final Object invoke() {
                        Object n13Var;
                        Exception exc2 = this.a;
                        if (exc2 instanceof ap) {
                            int statusCode = ((ap) exc2).getStatusCode();
                            if (statusCode == 16) {
                                n13Var = new m13(exc2.getMessage());
                            } else if (statusCode == 17) {
                                n13Var = new n13("API is not supported: " + exc2.getMessage(), (byte) 3);
                            } else if (statusCode == 8) {
                                n13Var = new r13(exc2.getMessage());
                            } else if (j33.b.contains(Integer.valueOf(statusCode))) {
                                n13Var = new q13(exc2.getMessage());
                            } else {
                                n13Var = new n13("Conditional create failed, failure: " + exc2.getMessage(), (byte) 2);
                            }
                        } else if (exc2 instanceof e8c) {
                            n13Var = new n13("API is unsupported", (byte) 3);
                        } else {
                            n13Var = new n13("Conditional create failed, failure: " + exc2, (byte) 2);
                        }
                        this.b.execute(new mv2(this.c, n13Var, (byte) 15));
                        return g7c.a;
                    }
                };
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!w33.a((CancellationSignal) obj4)) {
                    pr4Var.invoke();
                    break;
                }
                break;
            default:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) obj4, (CancellationSignal) obj3, (Executor) obj2, (a33) obj, exc);
                break;
        }
    }

    @Override // hk3
    public final boolean q(nk3 nk3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, sxb sxbVar) {
        long j;
        long j2;
        TLRPC.TL_document tL_document;
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (b) {
            case 1:
                i30 i30Var = (i30) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) obj3;
                k47 k47Var = (k47) obj;
                if (arrayList.size() <= 1) {
                    j = 0;
                    if (((bf7) arrayList.get(0)).a != z8c.h(i30Var.a).e() && charSequence == null && arrayList2 != null) {
                        bf7 bf7Var = (bf7) arrayList.get(0);
                        long j3 = bf7Var.a;
                        Bundle l = ts2.l("scrollToTopOnResume", true);
                        if (pg3.B(j3)) {
                            l.putInt("enc_id", (int) (j3 & 4294967295L));
                        } else if (pg3.D(j3)) {
                            l.putLong("user_id", j3);
                        } else {
                            l.putLong("chat_id", -j3);
                        }
                        yv1 yv1Var = new yv1(l);
                        if (bf7Var.b != 0) {
                            no4.a(yv1Var, bf7Var);
                        }
                        if (!i30Var.z2.u0(yv1Var, true, false)) {
                            nk3Var.finishFragment();
                            break;
                        } else {
                            yv1Var.cc(arrayList2);
                            if (bf7Var.b != 0) {
                                nk3Var.removeSelfFromStack();
                                break;
                            }
                        }
                    }
                } else {
                    j = 0;
                }
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    long j4 = ((bf7) arrayList.get(i3)).a;
                    if (charSequence != null) {
                        j2 = j4;
                        a6a.B(i30Var.a).q0(y5a.b(charSequence.toString(), j2, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    } else {
                        j2 = j4;
                    }
                    int i4 = i30Var.a;
                    if (arrayList2 != null) {
                        a6a.B(i4).p0(arrayList2, j2, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                        tL_document = tL_document2;
                    } else {
                        tL_document = tL_document2;
                        a6a.B(i4).q0(y5a.e(tL_document, null, k47Var.k.attachPath, j2, null, null, null, null, null, z2, i, 0, 0, i30Var.p2, false));
                    }
                    i3++;
                    tL_document2 = tL_document;
                }
                nk3Var.finishFragment();
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    c41.b0(Q).Q(R.raw.forward, 36, (arrayList.size() == 1 && ((bf7) arrayList.get(0)).a == z8c.h(i30Var.a).e()) ? jb6.M0(2131750431, null) : (arrayList.size() != 1 || ((bf7) arrayList.get(0)).a <= j) ? (arrayList.size() != 1 || ((bf7) arrayList.get(0)).a >= j) ? jb6.H(',', "FwdMessageToManyChats", arrayList.size()) : jb6.a0(null, null, 2131750435, pg3.s(((bf7) arrayList.get(0)).a)) : jb6.a0(null, null, 2131750430, pg3.s(((bf7) arrayList.get(0)).a))).j();
                    break;
                }
                break;
            case 2:
                TLRPC.User user = (TLRPC.User) obj3;
                String str = (String) obj2;
                ht7 ht7Var = (ht7) obj;
                wx0 wx0Var = ((rx0) obj4).d;
                long j5 = ((bf7) arrayList.get(0)).a;
                Bundle l2 = ts2.l("scrollToTopOnResume", true);
                if (pg3.B(j5)) {
                    l2.putInt("enc_id", (int) (j5 & 4294967295L));
                } else if (pg3.D(j5)) {
                    l2.putLong("user_id", j5);
                } else {
                    l2.putLong("chat_id", -j5);
                }
                l2.putString("start_text", "@" + m9c.p(user) + " " + str);
                Activity activity = wx0Var.m0;
                if (activity instanceof LaunchActivity) {
                    d lastFragment = ((LaunchActivity) activity).N().getLastFragment();
                    if (oc7.r1(wx0Var.I).A(l2, lastFragment, null, null)) {
                        ht7Var.dismiss();
                        wx0Var.e0 = true;
                        gm.r(wx0Var.v0);
                        wx0Var.E.f();
                        nm7.f(wx0Var.I).n(wx0Var, nm7.z1);
                        nm7.e().n(wx0Var, nm7.r4);
                        nm7.f(wx0Var.I).n(wx0Var, nm7.M3);
                        if (!wx0Var.R0) {
                            super/*android.app.Dialog*/.dismiss();
                            wx0Var.R0 = true;
                        }
                        qk5 qk5Var = new qk5(new yv1(l2));
                        qk5Var.b = true;
                        lastFragment.presentFragment(qk5Var);
                        break;
                    }
                }
                break;
            default:
                TLRPC.User user2 = (TLRPC.User) obj3;
                String str2 = (String) obj2;
                ht7 ht7Var2 = (ht7) obj;
                i22 i22Var = ((n12) obj4).e;
                long j6 = ((bf7) arrayList.get(0)).a;
                Bundle l3 = ts2.l("scrollToTopOnResume", true);
                if (pg3.B(j6)) {
                    l3.putInt("enc_id", (int) (j6 & 4294967295L));
                } else if (pg3.D(j6)) {
                    l3.putLong("user_id", j6);
                } else {
                    l3.putLong("chat_id", -j6);
                }
                l3.putString("start_text", "@" + m9c.p(user2) + " " + str2);
                d dVar = i22Var.Z1;
                if (oc7.r1(i22Var.G3).A(l3, dVar, null, null)) {
                    ht7Var2.dismiss();
                    i22Var.a(true);
                    qk5 qk5Var2 = new qk5(new yv1(l3));
                    qk5Var2.b = true;
                    dVar.presentFragment(qk5Var2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        byte b2 = 0;
        byte b3 = 1;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((o) obj4).P((String) obj3, (String) obj2, (vu) obj);
                break;
            case 4:
                ((yv1) obj4).l9((TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 13:
                String str = (String) obj2;
                String str2 = LaunchActivity.C1;
                ml7 ml7Var = new ml7((d) obj, (LaunchActivity) obj4);
                ml7Var.H0((String) obj3, false);
                if (str != null) {
                    String[] split = str.split(" ", 2);
                    String str3 = split[0];
                    String str4 = split.length > 1 ? split[1] : null;
                    ft7 ft7Var = ml7Var.m1;
                    if (ft7Var != null) {
                        ft7Var.getEditText().setText(str3);
                    } else {
                        ml7Var.D1 = str3;
                    }
                    ft7 ft7Var2 = ml7Var.n1;
                    if (ft7Var2 != null) {
                        ft7Var2.getEditText().setText(str4);
                    } else {
                        ml7Var.E1 = str4;
                    }
                }
                ml7Var.show();
                break;
            case 14:
                ((mh6) obj4).w1((String) obj3, (String) obj2, (String) obj);
                break;
            case 16:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj2).edit();
                edit.putBoolean((String) obj3, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.q0(true);
                notificationsCustomSettingsActivity.getNotificationsController().b0(notificationsCustomSettingsActivity.s);
                break;
            case 24:
                sxb sxbVar = (sxb) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                sxbVar.B0 = hashSet2;
                hashSet2.addAll(hashSet);
                sxbVar.Z0(true, false);
                c41.b0(sxbVar).U(jb6.J0(hashSet.size(), "TopicsDeleted"), false, new lo4(sxbVar, (byte) 5), new j2b(sxbVar, (ArrayList) obj2, (Runnable) obj, (byte) 21)).j();
                sxbVar.D0();
                heVar.dismiss();
                break;
            default:
                vqc vqcVar = (vqc) obj4;
                oh2 oh2Var = (oh2) obj3;
                c cVar = (c) obj2;
                Long l = (Long) obj;
                if (oh2Var.isEnabled()) {
                    boolean b4 = oh2Var.b();
                    oh2Var.setEnabled(false);
                    k11 g = heVar.g(i, true, true);
                    g.d();
                    if (!b4) {
                        cVar.E(false, true, false, new rqc(vqcVar, g, cVar, b2));
                        break;
                    } else if (cVar.z() >= l.longValue()) {
                        rqc rqcVar = new rqc(vqcVar, g, cVar, b3);
                        c.O("prepare disable backup");
                        cVar.E(true, false, false, new lf2((Object) cVar, (Object) rqcVar, (byte) 20));
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vqcVar.getResourceProvider(), vqcVar.getParentActivity());
                        String M0 = jb6.M0(2131742748, null);
                        he heVar2 = alertDialog$Builder.a;
                        heVar2.S = M0;
                        heVar2.U = jb6.V(null, null, 2131742629, c.r(l.longValue(), false), cVar.q(l.longValue(), true));
                        alertDialog$Builder.g(jb6.M0(2131742746, null), new dq9((byte) 14));
                        alertDialog$Builder.j(jb6.M0(2131742653, null), new lcc(vqcVar, (byte) 8));
                        alertDialog$Builder.o();
                        break;
                    }
                }
                break;
        }
    }

    @Override // xe7
    public final void run(long j) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 19:
                k0a k0aVar = (k0a) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP = (TLRPC.TL_inputCheckPasswordSRP) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (j != 0) {
                    k0aVar.S1 = oc7.r1(k0aVar.a).L0(Long.valueOf(j));
                    k0aVar.Y0(user, tL_inputCheckPasswordSRP, twoStepVerificationActivity);
                    break;
                }
                break;
            default:
                a6a a6aVar = (a6a) obj4;
                Uri uri = (Uri) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                e16 e16Var = (e16) obj;
                if (j == 0) {
                    e16Var.run(0L);
                    break;
                } else {
                    a6aVar.P(-j, uri, arrayList, e16Var);
                    break;
                }
        }
    }

    @Override // hk3
    public final boolean s(nk3 nk3Var) {
        byte b = this.a;
        return false;
    }

    @Override // gk
    public final void y(int i, int i2, boolean z) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (b) {
            case 3:
                ((yv1) obj3).H8((TLRPC.TL_document) obj2, (String) obj, this.e, z, i);
                break;
            case 4:
            case 5:
            default:
                ((fx2) obj3).k((TLRPC.Document) obj2, (String) obj, this.e, z, i, i2);
                break;
            case 6:
                v72 v72Var = (v72) obj3;
                v72Var.k0.a((TLRPC.TL_messageMediaPoll) obj, v72Var.P, v72Var.n1, (ArrayList) obj2, z, i, ((Long) this.e).longValue());
                v72Var.b.a(true);
                break;
            case 7:
                TLRPC.Document document = (TLRPC.Document) obj;
                ((fx2) obj3).u(document != null ? document : (TLRPC.BotInlineResult) obj2, this.e, z, i, i2);
                break;
        }
    }

    public /* synthetic */ lu(Object obj, Object obj2, Object obj3, String str, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = str;
        this.e = obj3;
    }

    public /* synthetic */ lu(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
