package a1;

import ai.t6;
import ai.w1;
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
import b8.mf;
import ci.e9;
import com.google.android.gms.tasks.OnFailureListener;
import d2.o1;
import d2.v;
import g2.n0;
import g9.f0;
import g9.i0;
import g9.s1;
import ii.a3;
import ii.v2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.j;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hi;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.ii;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.messenger.lr;
import org.telegram.messenger.m5;
import org.telegram.messenger.o10;
import org.telegram.messenger.pr;
import org.telegram.messenger.q1;
import org.telegram.messenger.wy;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o4;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.z7;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.g11;
import org.telegram.ui.gs;
import org.telegram.ui.h20;
import org.telegram.ui.i20;
import org.telegram.ui.i4;
import org.telegram.ui.m91;
import org.telegram.ui.n81;
import org.telegram.ui.nw;
import org.telegram.ui.q11;
import org.telegram.ui.uw;
import org.telegram.ui.vg0;
import org.telegram.ui.wm;
import org.telegram.ui.wy0;
import org.telegram.ui.x30;
import org.telegram.ui.xd0;
import z2.i;
import z2.k;
import z2.m;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements OnFailureListener, q1, nw, p1, r4, ab0, ii, lr, o10, k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(CancellationSignal cancellationSignal, e1.d dVar, Executor executor, v0.h hVar) {
        this.a = 3;
        this.c = cancellationSignal;
        this.b = dVar;
        this.d = executor;
        this.e = hVar;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean G() {
        switch (this.a) {
            case 4:
                break;
            case 8:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i3, int i10, boolean z10) {
        switch (this.a) {
            case 6:
                wm.G0((wm) this.b, (TLRPC.TL_document) this.c, (String) this.d, this.e, z10, i3);
                break;
            case 10:
                an anVar = (an) this.b;
                anVar.k0.c((TLRPC.TL_messageMediaPoll) this.c, anVar.P, anVar.n1, (ArrayList) this.d, z10, i3, ((Long) this.e).longValue());
                anVar.b.a(true);
                break;
            case 11:
                gs gsVar = (gs) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                gsVar.s(i3, i10, this.e, document != null ? document : (TLRPC.BotInlineResult) this.d, z10);
                break;
            default:
                ((gs) this.b).l((TLRPC.Document) this.c, (String) this.d, this.e, z10, i3, i10);
                break;
        }
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean N(uw uwVar) {
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
    @Override // z2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s1 c(int i3, o1 o1Var, int[] iArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        Point point;
        int i14;
        int i15;
        o1 o1Var2 = o1Var;
        i iVar = (i) this.b;
        String str = (String) this.c;
        int[] iArr2 = (int[]) this.d;
        Point point2 = (Point) this.e;
        int i16 = iArr2[i3];
        int i17 = point2 != null ? point2.x : iVar.i;
        int i18 = point2 != null ? point2.y : iVar.j;
        boolean z10 = iVar.l;
        if (i17 == Integer.MAX_VALUE || i18 == Integer.MAX_VALUE) {
            i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        } else {
            int i19 = Integer.MAX_VALUE;
            for (int i20 = 0; i20 < o1Var2.a; i20++) {
                v vVar = o1Var2.d[i20];
                int i21 = vVar.z;
                int i22 = vVar.A;
                if (i21 > 0 && i22 > 0) {
                    if (z10) {
                        if ((i21 > i22) != (i17 > i18)) {
                            i13 = i17;
                            i12 = i18;
                            int i23 = i21 * i13;
                            int i24 = i22 * i12;
                            point = i23 < i24 ? new Point(i12, n0.g(i24, i21)) : new Point(n0.g(i23, i22), i13);
                            i14 = vVar.z;
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
                    i14 = vVar.z;
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
        while (i25 < o1Var2.a) {
            v vVar2 = o1Var2.d[i25];
            int i26 = vVar2.z;
            int i27 = (i26 == -1 || (i11 = vVar2.A) == -1) ? -1 : i26 * i11;
            p10.c(new m(i3, o1Var2, i25, iVar, iArr[i25], str, i16, i10 == Integer.MAX_VALUE || (i27 != -1 && i27 <= i10)));
            i25++;
            o1Var2 = o1Var;
        }
        return p10.f();
    }

    @Override // org.telegram.messenger.o10
    public Object d(Number number, Object obj) {
        Context context = (Context) this.b;
        int[] iArr = (int[]) this.c;
        e6 e6Var = (e6) this.d;
        rx0 rx0Var = (rx0) this.e;
        Integer num = (Integer) number;
        Float f10 = (Float) obj;
        LinearLayout f11 = k5.f(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        f11.addView(linearLayout, mf.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, mf.o(24, 24));
        if (num.intValue() == 7) {
            for (int i3 = 0; i3 < 2; i3++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, mf.o(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(g0.o1("fonts/num.otf"));
        r6.V(textView, k6.j5, e6Var);
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
        f11.addView(textView, mf.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new ox0(rx0Var, f11, false);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        int i10 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i10) {
            case 5:
                ((i4) obj4).P((String) obj3, (String) obj2, (sf.b) obj);
                break;
            case 7:
                wm.z0((wm) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 14:
                String str = (String) obj;
                String str2 = LaunchActivity.E1;
                vg0 vg0Var = new vg0((LaunchActivity) obj4, (d2) obj3);
                vg0Var.N0((String) obj2, false);
                if (str != null) {
                    String[] split = str.split(" ", 2);
                    String str3 = split[0];
                    String str4 = split.length > 1 ? split[1] : null;
                    fb0 fb0Var = vg0Var.k1;
                    if (fb0Var != null) {
                        fb0Var.getEditText().setText(str3);
                    } else {
                        vg0Var.B1 = str3;
                    }
                    fb0 fb0Var2 = vg0Var.l1;
                    if (fb0Var2 != null) {
                        fb0Var2.getEditText().setText(str4);
                    } else {
                        vg0Var.C1 = str4;
                    }
                }
                vg0Var.show();
                break;
            case 15:
                xd0.Z((xd0) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 16:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.q0(true);
                notificationsCustomSettingsActivity.getNotificationsController().b0(notificationsCustomSettingsActivity.s);
                break;
            default:
                m91 m91Var = (m91) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                m91Var.B0 = hashSet2;
                hashSet2.addAll(hashSet);
                m91Var.Z0(true, false);
                fc.a0(m91Var).U(bd.K0(hashSet.size(), "TopicsDeleted"), false, new n81(m91Var, 4), new wy0(m91Var, (ArrayList) obj2, (Runnable) obj)).j();
                m91Var.G0();
                s1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.messenger.ii
    public void h(String str, ArrayList arrayList) {
        switch (this.a) {
            case 17:
                g11 g11Var = (g11) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                TLRPC.messages_AvailableEffects E0 = hp.s1(g11Var.W).E0();
                HashSet hashSet = new HashSet();
                if (E0 != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        try {
                            if (!((hi) arrayList.get(i3)).a.startsWith("animated_")) {
                                String c2 = i6.c(((hi) arrayList.get(i3)).a);
                                for (int i10 = 0; i10 < E0.effects.size(); i10++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = E0.effects.get(i10);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.id)) && (tL_availableEffect.emoticon.contains(c2) || c2.contains(tL_availableEffect.emoticon))) {
                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList3).add(dh.n0.e(tL_availableEffect));
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
                    String str2 = ((hi) arrayList.get(i11)).a;
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

    @Override // org.telegram.messenger.q1
    public void k(e5.f fVar, List list) {
        switch (this.a) {
            case 1:
                g0.h3(new t6((Object) list, this.b, this.c, this.d, this.e, 6));
                break;
            default:
                g0.h3(new w1((e9) this.b, list, (org.telegram.ui.Wallet.s1) this.c, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.d, fVar, (Activity) this.e, 3));
                break;
        }
    }

    @Override // org.telegram.ui.Components.ab0
    public void l(cb0 cb0Var, int i3) {
        x30 x30Var = (x30) this.b;
        cb0 cb0Var2 = (cb0) this.c;
        h20 h20Var = (h20) this.d;
        i20 i20Var = (i20) this.e;
        try {
            x30Var.c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        t4.g(x30Var.L1, x30Var.K1, 0L, 604800L, 2, cb0Var2, h20Var, i20Var);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e10) {
        switch (this.a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) this.b, (CancellationSignal) this.c, (Executor) this.d, (v0.h) this.e, e10);
                break;
            default:
                CancellationSignal cancellationSignal = (CancellationSignal) this.c;
                e1.d dVar = (e1.d) this.b;
                Executor executor = (Executor) this.d;
                v0.h hVar = (v0.h) this.e;
                j.e(e10, "e");
                b1.b bVar = new b1.b(dVar, e10, executor, hVar);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!h.a(cancellationSignal)) {
                    bVar.invoke();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.lr
    public void run(long j10) {
        q11 q11Var = (q11) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.d;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
        if (j10 == 0) {
            q11Var.getClass();
        } else {
            q11Var.Q1 = hp.s1(q11Var.a).M0(Long.valueOf(j10));
            q11Var.e1(user, inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    @Override // org.telegram.ui.nw
    public boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        long j10;
        TLRPC.TL_document tL_document;
        int i11 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i11) {
            case 4:
                TLRPC.User user = (TLRPC.User) obj3;
                String str = (String) obj2;
                hb0 hb0Var = (hb0) obj;
                a3 a3Var = ((v2) obj4).d;
                long j11 = ((pr) arrayList.get(0)).a;
                Bundle k10 = g.k("scrollToTopOnResume", true);
                if (m5.C(j11)) {
                    k10.putInt("enc_id", (int) (j11 & 4294967295L));
                } else if (m5.E(j11)) {
                    k10.putLong("user_id", j11);
                } else {
                    k10.putLong("chat_id", -j11);
                }
                k10.putString("start_text", "@" + l10.n(user) + " " + str);
                Activity activity = a3Var.m0;
                if (activity instanceof LaunchActivity) {
                    d2 lastFragment = ((LaunchActivity) activity).M().getLastFragment();
                    if (hp.s1(a3Var.I).E(k10, lastFragment, null, null)) {
                        hb0Var.dismiss();
                        a3Var.e0 = true;
                        g0.r(a3Var.v0);
                        a3Var.E.h();
                        hs.f(a3Var.I).n(a3Var, hs.z1);
                        hs.e().n(a3Var, hs.n4);
                        hs.f(a3Var.I).n(a3Var, hs.J3);
                        if (!a3Var.R0) {
                            super/*android.app.Dialog*/.dismiss();
                            a3Var.R0 = true;
                        }
                        o4 o4Var = new o4(new wm(k10));
                        o4Var.b = true;
                        lastFragment.presentFragment(o4Var);
                        break;
                    }
                }
                break;
            case 8:
                z7 z7Var = (z7) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) obj2;
                zi ziVar = (zi) obj;
                if (arrayList.size() <= 1 && ((pr) arrayList.get(0)).a != h10.i(z7Var.a).e() && charSequence == null && arrayList2 != null) {
                    pr prVar = (pr) arrayList.get(0);
                    long j12 = prVar.a;
                    Bundle k11 = g.k("scrollToTopOnResume", true);
                    if (m5.C(j12)) {
                        k11.putInt("enc_id", (int) (j12 & 4294967295L));
                    } else if (m5.E(j12)) {
                        k11.putLong("user_id", j12);
                    } else {
                        k11.putLong("chat_id", -j12);
                    }
                    wm wmVar = new wm(k11);
                    if (prVar.b != 0) {
                        rg.c.a(wmVar, prVar);
                    }
                    if (!z7Var.x2.u0(wmVar, true, false)) {
                        uwVar.finishFragment();
                        break;
                    } else {
                        wmVar.dc(arrayList2);
                        if (prVar.b != 0) {
                            uwVar.removeSelfFromStack();
                            break;
                        }
                    }
                } else {
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        long j13 = ((pr) arrayList.get(i12)).a;
                        if (charSequence != null) {
                            j10 = j13;
                            yy.C(z7Var.a).r0(wy.b(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j10 = j13;
                        }
                        if (arrayList2 != null) {
                            yy.C(z7Var.a).q0(arrayList2, j10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                            tL_document = tL_document2;
                        } else {
                            tL_document = tL_document2;
                            yy.C(z7Var.a).r0(wy.e(tL_document, null, ziVar.k.attachPath, j10, null, null, null, null, null, z11, i3, 0, 0, z7Var.n2, false));
                        }
                        i12++;
                        tL_document2 = tL_document;
                    }
                    uwVar.finishFragment();
                    d2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        fc.a0(Q).Q(R.raw.forward, 36, (arrayList.size() == 1 && ((pr) arrayList.get(0)).a == h10.i(z7Var.a).e()) ? bd.M0(2131750506, null) : (arrayList.size() != 1 || ((pr) arrayList.get(0)).a <= 0) ? (arrayList.size() != 1 || ((pr) arrayList.get(0)).a >= 0) ? bd.H(',', "FwdMessageToManyChats", arrayList.size()) : bd.a0(null, null, 2131750510, m5.t(((pr) arrayList.get(0)).a)) : bd.a0(null, null, 2131750505, m5.t(((pr) arrayList.get(0)).a))).j();
                        break;
                    }
                }
                break;
            default:
                TLRPC.User user2 = (TLRPC.User) obj3;
                String str2 = (String) obj2;
                hb0 hb0Var2 = (hb0) obj;
                bi biVar = ((gh) obj4).e;
                long j14 = ((pr) arrayList.get(0)).a;
                Bundle k12 = g.k("scrollToTopOnResume", true);
                if (m5.C(j14)) {
                    k12.putInt("enc_id", (int) (j14 & 4294967295L));
                } else if (m5.E(j14)) {
                    k12.putLong("user_id", j14);
                } else {
                    k12.putLong("chat_id", -j14);
                }
                k12.putString("start_text", "@" + l10.n(user2) + " " + str2);
                d2 d2Var = biVar.X1;
                if (hp.s1(biVar.E3).E(k12, d2Var, null, null)) {
                    hb0Var2.dismiss();
                    biVar.a(true);
                    o4 o4Var2 = new o4(new wm(k12));
                    o4Var2.b = true;
                    d2Var.presentFragment(o4Var2);
                    break;
                }
                break;
        }
        return true;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
