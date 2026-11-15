package a1;

import a3.n;
import a3.p;
import a3.r;
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
import bi.p1;
import c8.ja;
import ch.p0;
import com.google.android.gms.tasks.OnFailureListener;
import di.v8;
import e2.m1;
import e2.u;
import h2.l0;
import h9.f0;
import h9.i0;
import h9.s1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import ki.s2;
import ki.x2;
import kotlin.jvm.internal.j;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cz;
import org.telegram.messenger.ez;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.oi;
import org.telegram.messenger.pi;
import org.telegram.messenger.q1;
import org.telegram.messenger.q10;
import org.telegram.messenger.qr;
import org.telegram.messenger.s10;
import org.telegram.messenger.t10;
import org.telegram.messenger.ur;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.m4;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.qh;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.y7;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.t1;
import org.telegram.ui.an;
import org.telegram.ui.bh0;
import org.telegram.ui.c40;
import org.telegram.ui.ce0;
import org.telegram.ui.g4;
import org.telegram.ui.ls;
import org.telegram.ui.m20;
import org.telegram.ui.n11;
import org.telegram.ui.n20;
import org.telegram.ui.q21;
import org.telegram.ui.sw;
import org.telegram.ui.u81;
import org.telegram.ui.u91;
import org.telegram.ui.x11;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements OnFailureListener, p, q1, sw, org.telegram.ui.ActionBar.q1, r4, gb0, pi, qr, t10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(CancellationSignal cancellationSignal, e1.d dVar, Executor executor, v0.g gVar) {
        this.a = 4;
        this.c = cancellationSignal;
        this.b = dVar;
        this.d = executor;
        this.e = gVar;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean H() {
        switch (this.a) {
            case 5:
                break;
            case 9:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 7:
                an.J0((an) this.b, (TLRPC.TL_document) this.c, (String) this.d, this.e, z10, i7);
                break;
            case 11:
                jn jnVar = (jn) this.b;
                jnVar.k0.c((TLRPC.TL_messageMediaPoll) this.c, jnVar.P, jnVar.n1, (ArrayList) this.d, z10, i7, ((Long) this.e).longValue());
                jnVar.b.a(true);
                break;
            case 12:
                ls lsVar = (ls) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                lsVar.r(i7, i10, this.e, document != null ? document : (TLRPC.BotInlineResult) this.d, z10);
                break;
            default:
                ((ls) this.b).l((TLRPC.Document) this.c, (String) this.d, this.e, z10, i7, i10);
                break;
        }
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean P(yw ywVar) {
        switch (this.a) {
            case 5:
                break;
            case 9:
                break;
        }
        return false;
    }

    @Override // org.telegram.messenger.q1
    public void a(f5.f fVar, List list) {
        switch (this.a) {
            case 2:
                g0.h3(new ai.b(list, (s10) this.b, (TLRPC.TL_inputStorePaymentStarsTopup) this.c, (TL_stars.TL_starsTopupOption) this.d, (Activity) this.e, 7));
                break;
            default:
                g0.h3(new p1((v8) this.b, list, (t1) this.c, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.d, fVar, (Activity) this.e, 3));
                break;
        }
    }

    @Override // org.telegram.messenger.pi
    public void c(String str, ArrayList arrayList) {
        switch (this.a) {
            case 18:
                n11 n11Var = (n11) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                TLRPC.messages_AvailableEffects E0 = np.s1(n11Var.W).E0();
                HashSet hashSet = new HashSet();
                if (E0 != null) {
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        try {
                            if (!((oi) arrayList.get(i7)).a.startsWith("animated_")) {
                                String c10 = j6.c(((oi) arrayList.get(i7)).a);
                                for (int i10 = 0; i10 < E0.effects.size(); i10++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = E0.effects.get(i10);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.id)) && (tL_availableEffect.emoticon.contains(c10) || c10.contains(tL_availableEffect.emoticon))) {
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
                for (int i11 = 0; i11 < size; i11++) {
                    String str2 = ((oi) arrayList.get(i11)).a;
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

    @Override // org.telegram.messenger.t10
    public Object d(Number number, Object obj) {
        Context context = (Context) this.b;
        int[] iArr = (int[]) this.c;
        e6 e6Var = (e6) this.d;
        vx0 vx0Var = (vx0) this.e;
        Integer num = (Integer) number;
        Float f10 = (Float) obj;
        LinearLayout f11 = k5.f(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        f11.addView(linearLayout, ja.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, ja.o(24, 24));
        if (num.intValue() == 7) {
            for (int i7 = 0; i7 < 2; i7++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, ja.o(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(g0.o1("fonts/num.otf"));
        q6.U(textView, org.telegram.ui.ActionBar.j6.j5, e6Var);
        StringBuilder sb2 = new StringBuilder("x");
        float floatValue = f10.floatValue();
        Object obj2 = f10;
        if (floatValue <= 0.0f) {
            obj2 = "0";
        }
        sb2.append(obj2);
        textView.setText(sb2.toString());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        f11.addView(textView, ja.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new sx0(vx0Var, f11, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    @Override // a3.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s1 f(int i7, m1 m1Var, int[] iArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        Point point;
        int i14;
        int i15;
        m1 m1Var2 = m1Var;
        n nVar = (n) this.b;
        String str = (String) this.c;
        int[] iArr2 = (int[]) this.d;
        Point point2 = (Point) this.e;
        int i16 = iArr2[i7];
        int i17 = point2 != null ? point2.x : nVar.i;
        int i18 = point2 != null ? point2.y : nVar.j;
        boolean z10 = nVar.l;
        if (i17 == Integer.MAX_VALUE || i18 == Integer.MAX_VALUE) {
            i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        } else {
            int i19 = Integer.MAX_VALUE;
            for (int i20 = 0; i20 < m1Var2.a; i20++) {
                u uVar = m1Var2.d[i20];
                int i21 = uVar.z;
                int i22 = uVar.A;
                if (i21 > 0 && i22 > 0) {
                    if (z10) {
                        if ((i21 > i22) != (i17 > i18)) {
                            i13 = i17;
                            i12 = i18;
                            int i23 = i21 * i13;
                            int i24 = i22 * i12;
                            point = i23 < i24 ? new Point(i12, l0.g(i24, i21)) : new Point(l0.g(i23, i22), i13);
                            i14 = uVar.z;
                            i15 = i14 * i22;
                            if (i14 >= ((int) (point.x * 0.98f)) && i22 >= ((int) (point.y * 0.98f)) && i15 < i19) {
                                i19 = i15;
                            }
                        }
                    }
                    i12 = i17;
                    i13 = i18;
                    int i232 = i21 * i13;
                    int i242 = i22 * i12;
                    if (i232 < i242) {
                    }
                    i14 = uVar.z;
                    i15 = i14 * i22;
                    if (i14 >= ((int) (point.x * 0.98f))) {
                        i19 = i15;
                    }
                }
            }
            i10 = i19;
        }
        f0 p10 = i0.p();
        int i25 = 0;
        while (i25 < m1Var2.a) {
            u uVar2 = m1Var2.d[i25];
            int i26 = uVar2.z;
            int i27 = (i26 == -1 || (i11 = uVar2.A) == -1) ? -1 : i26 * i11;
            p10.c(new r(i7, m1Var2, i25, nVar, iArr[i25], str, i16, i10 == Integer.MAX_VALUE || (i27 != -1 && i27 <= i10)));
            i25++;
            m1Var2 = m1Var;
        }
        return p10.f();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i10) {
            case 6:
                ((g4) obj4).P((String) obj3, (String) obj2, (vf.b) obj);
                break;
            case 8:
                an.D0((an) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 15:
                String str = (String) obj;
                String str2 = LaunchActivity.C1;
                bh0 bh0Var = new bh0((LaunchActivity) obj4, (e2) obj3);
                bh0Var.N0((String) obj2, false);
                if (str != null) {
                    String[] split = str.split(" ", 2);
                    String str3 = split[0];
                    String str4 = split.length > 1 ? split[1] : null;
                    lb0 lb0Var = bh0Var.n1;
                    if (lb0Var != null) {
                        lb0Var.getEditText().setText(str3);
                    } else {
                        bh0Var.E1 = str3;
                    }
                    lb0 lb0Var2 = bh0Var.o1;
                    if (lb0Var2 != null) {
                        lb0Var2.getEditText().setText(str4);
                    } else {
                        bh0Var.F1 = str4;
                    }
                }
                bh0Var.show();
                break;
            case 16:
                ce0.Z((ce0) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.q0(true);
                notificationsCustomSettingsActivity.getNotificationsController().b0(notificationsCustomSettingsActivity.s);
                break;
            default:
                u91 u91Var = (u91) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                u91Var.B0 = hashSet2;
                hashSet2.addAll(hashSet);
                u91Var.Z0(true, false);
                cc.a0(u91Var).U(hd.K0(hashSet.size(), "TopicsDeleted"), false, new u81(u91Var, 4), new q21(u91Var, (ArrayList) obj2, (Runnable) obj, 7)).j();
                u91Var.G0();
                t1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.gb0
    public void m(ib0 ib0Var, int i7) {
        c40 c40Var = (c40) this.b;
        ib0 ib0Var2 = (ib0) this.c;
        m20 m20Var = (m20) this.d;
        n20 n20Var = (n20) this.e;
        try {
            c40Var.c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        t4.g(c40Var.O1, c40Var.N1, 0L, 604800L, 2, ib0Var2, m20Var, n20Var);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e10) {
        switch (this.a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) this.b, (CancellationSignal) this.c, (Executor) this.d, (v0.g) this.e, e10);
                break;
            default:
                CancellationSignal cancellationSignal = (CancellationSignal) this.c;
                e1.d dVar = (e1.d) this.b;
                Executor executor = (Executor) this.d;
                v0.g gVar = (v0.g) this.e;
                j.e(e10, "e");
                b1.b bVar = new b1.b(dVar, e10, executor, gVar);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!g.a(cancellationSignal)) {
                    bVar.invoke();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.qr
    public void run(long j3) {
        x11 x11Var = (x11) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.d;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
        if (j3 == 0) {
            x11Var.getClass();
        } else {
            x11Var.T1 = np.s1(x11Var.a).M0(Long.valueOf(j3));
            x11Var.e1(user, inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    @Override // org.telegram.ui.sw
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        long j3;
        TLRPC.TL_document tL_document;
        int i11 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i11) {
            case 5:
                TLRPC.User user = (TLRPC.User) obj3;
                String str = (String) obj2;
                nb0 nb0Var = (nb0) obj;
                x2 x2Var = ((s2) obj4).d;
                long j10 = ((ur) arrayList.get(0)).a;
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                if (m5.C(j10)) {
                    k10.putInt("enc_id", (int) (j10 & 4294967295L));
                } else if (m5.E(j10)) {
                    k10.putLong("user_id", j10);
                } else {
                    k10.putLong("chat_id", -j10);
                }
                k10.putString("start_text", "@" + q10.n(user) + " " + str);
                Activity activity = x2Var.m0;
                if (activity instanceof LaunchActivity) {
                    e2 lastFragment = ((LaunchActivity) activity).M().getLastFragment();
                    if (np.s1(x2Var.I).E(k10, lastFragment, null, null)) {
                        nb0Var.dismiss();
                        x2Var.e0 = true;
                        g0.r(x2Var.v0);
                        x2Var.E.h();
                        ns.f(x2Var.I).n(x2Var, ns.z1);
                        ns.e().n(x2Var, ns.n4);
                        ns.f(x2Var.I).n(x2Var, ns.J3);
                        if (!x2Var.R0) {
                            super/*android.app.Dialog*/.dismiss();
                            x2Var.R0 = true;
                        }
                        m4 m4Var = new m4(new an(k10));
                        m4Var.b = true;
                        lastFragment.presentFragment(m4Var);
                        break;
                    }
                }
                break;
            case 9:
                y7 y7Var = (y7) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) obj2;
                gj gjVar = (gj) obj;
                if (arrayList.size() <= 1 && ((ur) arrayList.get(0)).a != m10.i(y7Var.a).e() && charSequence == null && arrayList2 != null) {
                    ur urVar = (ur) arrayList.get(0);
                    long j11 = urVar.a;
                    Bundle k11 = a8.p0.k("scrollToTopOnResume", true);
                    if (m5.C(j11)) {
                        k11.putInt("enc_id", (int) (j11 & 4294967295L));
                    } else if (m5.E(j11)) {
                        k11.putLong("user_id", j11);
                    } else {
                        k11.putLong("chat_id", -j11);
                    }
                    an anVar = new an(k11);
                    if (urVar.b != 0) {
                        qg.c.a(anVar, urVar);
                    }
                    if (!y7Var.A2.u0(anVar, true, false)) {
                        ywVar.finishFragment();
                        break;
                    } else {
                        anVar.hc(arrayList2);
                        if (urVar.b != 0) {
                            ywVar.removeSelfFromStack();
                            break;
                        }
                    }
                } else {
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        long j12 = ((ur) arrayList.get(i12)).a;
                        if (charSequence != null) {
                            j3 = j12;
                            ez.C(y7Var.a).r0(cz.b(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j3 = j12;
                        }
                        if (arrayList2 != null) {
                            ez.C(y7Var.a).q0(arrayList2, j3, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                            tL_document = tL_document2;
                        } else {
                            tL_document = tL_document2;
                            ez.C(y7Var.a).r0(cz.e(tL_document, null, gjVar.k.attachPath, j3, null, null, null, null, null, z11, i7, 0, 0, y7Var.q2, false));
                        }
                        i12++;
                        tL_document2 = tL_document;
                    }
                    ywVar.finishFragment();
                    e2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        cc.a0(Q).Q(R.raw.forward, 36, (arrayList.size() == 1 && ((ur) arrayList.get(0)).a == m10.i(y7Var.a).e()) ? hd.M0(2131750498, null) : (arrayList.size() != 1 || ((ur) arrayList.get(0)).a <= 0) ? (arrayList.size() != 1 || ((ur) arrayList.get(0)).a >= 0) ? hd.H(',', "FwdMessageToManyChats", arrayList.size()) : hd.a0(null, null, 2131750502, m5.t(((ur) arrayList.get(0)).a)) : hd.a0(null, null, 2131750497, m5.t(((ur) arrayList.get(0)).a))).j();
                        break;
                    }
                }
                break;
            default:
                TLRPC.User user2 = (TLRPC.User) obj3;
                String str2 = (String) obj2;
                nb0 nb0Var2 = (nb0) obj;
                ki kiVar = ((qh) obj4).e;
                long j13 = ((ur) arrayList.get(0)).a;
                Bundle k12 = a8.p0.k("scrollToTopOnResume", true);
                if (m5.C(j13)) {
                    k12.putInt("enc_id", (int) (j13 & 4294967295L));
                } else if (m5.E(j13)) {
                    k12.putLong("user_id", j13);
                } else {
                    k12.putLong("chat_id", -j13);
                }
                k12.putString("start_text", "@" + q10.n(user2) + " " + str2);
                e2 e2Var = kiVar.a2;
                if (np.s1(kiVar.H3).E(k12, e2Var, null, null)) {
                    nb0Var2.dismiss();
                    kiVar.a(true);
                    m4 m4Var2 = new m4(new an(k12));
                    m4Var2.b = true;
                    e2Var.presentFragment(m4Var2);
                    break;
                }
                break;
        }
        return true;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
