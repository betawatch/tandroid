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
import b2.p1;
import b2.x;
import com.google.android.gms.tasks.OnFailureListener;
import e2.l0;
import e9.k0;
import e9.n0;
import e9.x1;
import ih.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import kotlin.jvm.internal.i;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.cs;
import org.telegram.messenger.d20;
import org.telegram.messenger.gs;
import org.telegram.messenger.h20;
import org.telegram.messenger.i0;
import org.telegram.messenger.jj;
import org.telegram.messenger.k20;
import org.telegram.messenger.k6;
import org.telegram.messenger.m5;
import org.telegram.messenger.o5;
import org.telegram.messenger.oz;
import org.telegram.messenger.qi;
import org.telegram.messenger.qz;
import org.telegram.messenger.ri;
import org.telegram.messenger.t1;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.w4;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ay;
import org.telegram.ui.b50;
import org.telegram.ui.gi0;
import org.telegram.ui.h4;
import org.telegram.ui.hf0;
import org.telegram.ui.i31;
import org.telegram.ui.jt;
import org.telegram.ui.k41;
import org.telegram.ui.l30;
import org.telegram.ui.m30;
import org.telegram.ui.na1;
import org.telegram.ui.pb1;
import org.telegram.ui.s31;
import org.telegram.ui.un;
import org.telegram.ui.ux;
import org.telegram.ui.v8;
import rh.e6;
import rh.r4;
import sg.o0;
import w7.b6;
import x2.j;
import x2.l;
import x2.n;
import xh.h2;
import xh.m2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements OnFailureListener, u1, q4, ux, yb0, ri, cs, k20, t1, l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(CancellationSignal cancellationSignal, e1.d dVar, Executor executor, v0.h hVar) {
        this.a = 1;
        this.b = cancellationSignal;
        this.e = dVar;
        this.c = executor;
        this.d = hVar;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean G() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 3:
                un.K0((un) this.e, (TLRPC.TL_document) this.b, (String) this.c, this.d, z10, i10);
                break;
            case 7:
                jn jnVar = (jn) this.e;
                jnVar.j0.e((TLRPC.TL_messageMediaPoll) this.b, jnVar.O, jnVar.m1, (ArrayList) this.c, z10, i10, ((Long) this.d).longValue());
                jnVar.b.a(true);
                break;
            case 8:
                jt jtVar = (jt) this.e;
                TLRPC.Document document = (TLRPC.Document) this.b;
                jtVar.r(i10, i11, this.d, document != null ? document : (TLRPC.BotInlineResult) this.c, z10);
                break;
            default:
                ((jt) this.e).l((TLRPC.Document) this.b, (String) this.c, this.d, z10, i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean N(ay ayVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.messenger.t1
    public void a(c5.g gVar, List list) {
        switch (this.a) {
            case 19:
                i0.g3(new r4((Object) list, this.e, this.b, this.c, this.d, 4));
                break;
            default:
                i0.g3(new v8((e6) this.e, list, (s) this.b, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.c, gVar, (Activity) this.d, 20));
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    @Override // x2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x1 b(int i10, p1 p1Var, int[] iArr) {
        int i11;
        int i12;
        int i13;
        int i14;
        Point point;
        int i15;
        int i16;
        p1 p1Var2 = p1Var;
        j jVar = (j) this.e;
        String str = (String) this.b;
        int[] iArr2 = (int[]) this.c;
        Point point2 = (Point) this.d;
        int i17 = iArr2[i10];
        int i18 = point2 != null ? point2.x : jVar.i;
        int i19 = point2 != null ? point2.y : jVar.j;
        boolean z10 = jVar.l;
        if (i18 == Integer.MAX_VALUE || i19 == Integer.MAX_VALUE) {
            i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        } else {
            int i20 = Integer.MAX_VALUE;
            for (int i21 = 0; i21 < p1Var2.a; i21++) {
                x xVar = p1Var2.d[i21];
                int i22 = xVar.z;
                int i23 = xVar.A;
                if (i22 > 0 && i23 > 0) {
                    if (z10) {
                        if ((i22 > i23) != (i18 > i19)) {
                            i14 = i18;
                            i13 = i19;
                            int i24 = i22 * i14;
                            int i25 = i23 * i13;
                            point = i24 < i25 ? new Point(i13, l0.g(i25, i22)) : new Point(l0.g(i24, i23), i14);
                            i15 = xVar.z;
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
                    i15 = xVar.z;
                    i16 = i15 * i23;
                    if (i15 >= ((int) (point.x * 0.98f))) {
                        i20 = i16;
                    }
                }
            }
            i11 = i20;
        }
        k0 t10 = n0.t();
        int i26 = 0;
        while (i26 < p1Var2.a) {
            x xVar2 = p1Var2.d[i26];
            int i27 = xVar2.z;
            int i28 = (i27 == -1 || (i12 = xVar2.A) == -1) ? -1 : i27 * i12;
            t10.c(new n(i10, p1Var2, i26, jVar, iArr[i26], str, i17, i11 == Integer.MAX_VALUE || (i28 != -1 && i28 <= i11)));
            i26++;
            p1Var2 = p1Var;
        }
        return t10.f();
    }

    @Override // org.telegram.messenger.ri
    public void c(String str, ArrayList arrayList) {
        switch (this.a) {
            case 14:
                i31 i31Var = (i31) this.e;
                ArrayList arrayList2 = (ArrayList) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                Runnable runnable = (Runnable) this.d;
                TLRPC.messages_AvailableEffects E0 = vp.r1(i31Var.V).E0();
                HashSet hashSet = new HashSet();
                if (E0 != null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            if (!((qi) arrayList.get(i10)).a.startsWith("animated_")) {
                                String c10 = k6.c(((qi) arrayList.get(i10)).a);
                                for (int i11 = 0; i11 < E0.effects.size(); i11++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = E0.effects.get(i11);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.id)) && (tL_availableEffect.emoticon.contains(c10) || c10.contains(tL_availableEffect.emoticon))) {
                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList2 : arrayList3).add(o0.e(tL_availableEffect));
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
                    String str2 = ((qi) arrayList.get(i12)).a;
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

    @Override // org.telegram.messenger.k20
    public Object d(Number number, Object obj) {
        Context context = (Context) this.e;
        int[] iArr = (int[]) this.b;
        p6 p6Var = (p6) this.c;
        wy0 wy0Var = (wy0) this.d;
        Integer num = (Integer) number;
        Float f7 = (Float) obj;
        LinearLayout f10 = m5.f(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        f10.addView(linearLayout, b6.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, b6.o(24, 24));
        if (num.intValue() == 7) {
            for (int i10 = 0; i10 < 2; i10++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, b6.o(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(i0.o1("fonts/num.otf"));
        a7.V(textView, t6.j5, p6Var);
        StringBuilder sb2 = new StringBuilder("x");
        float floatValue = f7.floatValue();
        Object obj2 = f7;
        if (floatValue <= 0.0f) {
            obj2 = "0";
        }
        sb2.append(obj2);
        textView.setText(sb2.toString());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        f10.addView(textView, b6.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new ty0(wy0Var, f10, false);
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.e;
        switch (i11) {
            case 2:
                ((h4) obj4).P((String) obj3, (String) obj2, (gf.e) obj);
                break;
            case 4:
                un.e1((un) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 11:
                String str = (String) obj;
                Pattern pattern = LaunchActivity.D1;
                gi0 gi0Var = new gi0((LaunchActivity) obj4, (k2) obj3);
                gi0Var.N0((String) obj2, false);
                if (str != null) {
                    String[] split = str.split(" ", 2);
                    String str2 = split[0];
                    String str3 = split.length > 1 ? split[1] : null;
                    dc0 dc0Var = gi0Var.j1;
                    if (dc0Var != null) {
                        dc0Var.getEditText().setText(str2);
                    } else {
                        gi0Var.A1 = str2;
                    }
                    dc0 dc0Var2 = gi0Var.k1;
                    if (dc0Var2 != null) {
                        dc0Var2.getEditText().setText(str3);
                    } else {
                        gi0Var.B1 = str3;
                    }
                }
                gi0Var.show();
                break;
            case 12:
                hf0.Y((hf0) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 13:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj4;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor edit = ((SharedPreferences) obj3).edit();
                edit.putBoolean((String) obj2, ((boolean[]) obj)[0]);
                edit.apply();
                notificationsCustomSettingsActivity.p0(true);
                notificationsCustomSettingsActivity.getNotificationsController().b0(notificationsCustomSettingsActivity.s);
                break;
            default:
                pb1 pb1Var = (pb1) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                pb1Var.A0 = hashSet2;
                hashSet2.addAll(hashSet);
                pb1Var.Y0(true, false);
                cc.a0(pb1Var).U(cd.J0(hashSet.size(), "TopicsDeleted"), false, new na1(pb1Var, 4), new k41(pb1Var, (ArrayList) obj2, (Runnable) obj, 7)).j();
                pb1Var.F0();
                x1Var.dismiss();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e) {
        switch (this.a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) this.e, (CancellationSignal) this.b, (Executor) this.c, (v0.h) this.d, e);
                break;
            default:
                CancellationSignal cancellationSignal = (CancellationSignal) this.b;
                e1.d dVar = (e1.d) this.e;
                Executor executor = (Executor) this.c;
                v0.h hVar = (v0.h) this.d;
                i.e(e, "e");
                b1.b bVar = new b1.b(dVar, e, executor, hVar);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!h.a(cancellationSignal)) {
                    bVar.invoke();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.cs
    public void run(long j10) {
        s31 s31Var = (s31) this.e;
        TLRPC.User user = (TLRPC.User) this.b;
        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.c;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
        if (j10 == 0) {
            s31Var.getClass();
        } else {
            s31Var.P1 = vp.r1(s31Var.a).L0(Long.valueOf(j10));
            s31Var.e1(user, inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    @Override // org.telegram.ui.Components.yb0
    public void t(ac0 ac0Var, int i10) {
        b50 b50Var = (b50) this.e;
        ac0 ac0Var2 = (ac0) this.b;
        l30 l30Var = (l30) this.c;
        m30 m30Var = (m30) this.d;
        try {
            b50Var.c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        s4.g(b50Var.K1, b50Var.J1, 0L, 604800L, 2, ac0Var2, l30Var, m30Var);
    }

    @Override // org.telegram.ui.ux
    public boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        long j10;
        TLRPC.TL_document tL_document;
        int i12 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.e;
        switch (i12) {
            case 5:
                w7 w7Var = (w7) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) obj2;
                jj jjVar = (jj) obj;
                if (arrayList.size() <= 1 && ((gs) arrayList.get(0)).a != d20.i(w7Var.a).e() && charSequence == null && arrayList2 != null) {
                    gs gsVar = (gs) arrayList.get(0);
                    long j11 = gsVar.a;
                    Bundle g10 = g.g("scrollToTopOnResume", true);
                    if (o5.C(j11)) {
                        g10.putInt("enc_id", (int) (j11 & 4294967295L));
                    } else if (o5.E(j11)) {
                        g10.putLong("user_id", j11);
                    } else {
                        g10.putLong("chat_id", -j11);
                    }
                    un unVar = new un(g10);
                    if (gsVar.b != 0) {
                        gg.e.a(unVar, gsVar);
                    }
                    if (!w7Var.w2.u0(unVar, true, false)) {
                        ayVar.finishFragment();
                        break;
                    } else {
                        unVar.Tb(arrayList2);
                        if (gsVar.b != 0) {
                            ayVar.removeSelfFromStack();
                            break;
                        }
                    }
                } else {
                    int i13 = 0;
                    while (i13 < arrayList.size()) {
                        long j12 = ((gs) arrayList.get(i13)).a;
                        if (charSequence != null) {
                            j10 = j12;
                            qz.C(w7Var.a).r0(oz.b(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j10 = j12;
                        }
                        if (arrayList2 != null) {
                            qz.C(w7Var.a).q0(arrayList2, j10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                            tL_document = tL_document2;
                        } else {
                            tL_document = tL_document2;
                            qz.C(w7Var.a).r0(oz.e(tL_document, null, jjVar.k.attachPath, j10, null, null, null, null, null, z11, i10, 0, 0, w7Var.m2, false));
                        }
                        i13++;
                        tL_document2 = tL_document;
                    }
                    ayVar.finishFragment();
                    k2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        cc.a0(Q).Q(R.raw.forward, 36, (arrayList.size() == 1 && ((gs) arrayList.get(0)).a == d20.i(w7Var.a).e()) ? cd.L0(2131750507, null) : (arrayList.size() != 1 || ((gs) arrayList.get(0)).a <= 0) ? (arrayList.size() != 1 || ((gs) arrayList.get(0)).a >= 0) ? cd.H(',', "FwdMessageToManyChats", arrayList.size()) : cd.a0(null, null, 2131750511, o5.t(((gs) arrayList.get(0)).a)) : cd.a0(null, null, 2131750506, o5.t(((gs) arrayList.get(0)).a))).j();
                        break;
                    }
                }
                break;
            case 6:
                TLRPC.User user = (TLRPC.User) obj3;
                String str = (String) obj2;
                fc0 fc0Var = (fc0) obj;
                bi biVar = ((gh) obj4).e;
                long j13 = ((gs) arrayList.get(0)).a;
                Bundle g11 = g.g("scrollToTopOnResume", true);
                if (o5.C(j13)) {
                    g11.putInt("enc_id", (int) (j13 & 4294967295L));
                } else if (o5.E(j13)) {
                    g11.putLong("user_id", j13);
                } else {
                    g11.putLong("chat_id", -j13);
                }
                g11.putString("start_text", "@" + h20.n(user) + " " + str);
                k2 k2Var = biVar.W1;
                if (vp.r1(biVar.D3).E(g11, k2Var, null, null)) {
                    fc0Var.dismiss();
                    biVar.a(true);
                    w4 w4Var = new w4(new un(g11));
                    w4Var.b = true;
                    k2Var.presentFragment(w4Var);
                    break;
                }
                break;
            default:
                TLRPC.User user2 = (TLRPC.User) obj3;
                String str2 = (String) obj2;
                fc0 fc0Var2 = (fc0) obj;
                m2 m2Var = ((h2) obj4).d;
                long j14 = ((gs) arrayList.get(0)).a;
                Bundle g12 = g.g("scrollToTopOnResume", true);
                if (o5.C(j14)) {
                    g12.putInt("enc_id", (int) (j14 & 4294967295L));
                } else if (o5.E(j14)) {
                    g12.putLong("user_id", j14);
                } else {
                    g12.putLong("chat_id", -j14);
                }
                g12.putString("start_text", "@" + h20.n(user2) + " " + str2);
                Activity activity = m2Var.l0;
                if (activity instanceof LaunchActivity) {
                    k2 lastFragment = ((LaunchActivity) activity).M().getLastFragment();
                    if (vp.r1(m2Var.H).E(g12, lastFragment, null, null)) {
                        fc0Var2.dismiss();
                        m2Var.d0 = true;
                        i0.r(m2Var.u0);
                        m2Var.D.h();
                        zs.f(m2Var.H).n(m2Var, zs.z1);
                        zs.e().n(m2Var, zs.n4);
                        zs.f(m2Var.H).n(m2Var, zs.J3);
                        if (!m2Var.Q0) {
                            super/*android.app.Dialog*/.dismiss();
                            m2Var.Q0 = true;
                        }
                        w4 w4Var2 = new w4(new un(g12));
                        w4Var2.b = true;
                        lastFragment.presentFragment(w4Var2);
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
}
