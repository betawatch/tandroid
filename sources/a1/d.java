package a1;

import a3.n;
import a3.p;
import a3.r;
import a8.p0;
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
import bi.a3;
import bi.ea;
import bi.u0;
import c8.ha;
import ch.o0;
import com.google.android.gms.tasks.OnFailureListener;
import e2.m1;
import e2.u;
import h2.m0;
import h9.f0;
import h9.i0;
import hi.v2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.j;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ez;
import org.telegram.messenger.g0;
import org.telegram.messenger.gz;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.k5;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.q1;
import org.telegram.messenger.qi;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ri;
import org.telegram.messenger.t10;
import org.telegram.messenger.tr;
import org.telegram.messenger.v10;
import org.telegram.messenger.w10;
import org.telegram.messenger.xr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o4;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.v4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.t1;
import org.telegram.ui.c21;
import org.telegram.ui.ch0;
import org.telegram.ui.cn;
import org.telegram.ui.e40;
import org.telegram.ui.ee0;
import org.telegram.ui.g4;
import org.telegram.ui.ks;
import org.telegram.ui.o20;
import org.telegram.ui.p20;
import org.telegram.ui.s11;
import org.telegram.ui.sw;
import org.telegram.ui.v21;
import org.telegram.ui.y81;
import org.telegram.ui.y91;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements OnFailureListener, p, q1, sw, r1, t4, gb0, ri, tr, w10 {
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
    public /* synthetic */ boolean G() {
        switch (this.a) {
            case 5:
                break;
            case 9:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        switch (this.a) {
            case 7:
                cn.J0((cn) this.b, (TLRPC.TL_document) this.c, (String) this.d, this.e, z9, i7);
                break;
            case 11:
                bn bnVar = (bn) this.b;
                bnVar.j0.b((TLRPC.TL_messageMediaPoll) this.c, bnVar.O, bnVar.m1, (ArrayList) this.d, z9, i7, ((Long) this.e).longValue());
                bnVar.b.a(true);
                break;
            case 12:
                ks ksVar = (ks) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                ksVar.s(i7, i10, this.e, document != null ? document : (TLRPC.BotInlineResult) this.d, z9);
                break;
            default:
                ((ks) this.b).l((TLRPC.Document) this.c, (String) this.d, this.e, z9, i7, i10);
                break;
        }
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean N(yw ywVar) {
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
                g0.h3(new u0(list, (v10) this.b, (TLRPC.TL_inputStorePaymentStarsTopup) this.c, (TL_stars.TL_starsTopupOption) this.d, (Activity) this.e, 5));
                break;
            default:
                g0.h3(new a3((ea) this.b, list, (t1) this.c, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.d, fVar, (Activity) this.e, 2));
                break;
        }
    }

    @Override // org.telegram.messenger.w10
    public Object d(Number number, Object obj) {
        Context context = (Context) this.b;
        int[] iArr = (int[]) this.c;
        g6 g6Var = (g6) this.d;
        ux0 ux0Var = (ux0) this.e;
        Integer num = (Integer) number;
        Float f10 = (Float) obj;
        LinearLayout f11 = k5.f(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        f11.addView(linearLayout, ha.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, ha.o(24, 24));
        if (num.intValue() == 7) {
            for (int i7 = 0; i7 < 2; i7++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, ha.o(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(g0.o1("fonts/num.otf"));
        s6.U(textView, l6.j5, g6Var);
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
        f11.addView(textView, ha.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new rx0(ux0Var, f11, false);
    }

    @Override // org.telegram.messenger.ri
    public void e(String str, ArrayList arrayList) {
        switch (this.a) {
            case 18:
                s11 s11Var = (s11) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                TLRPC.messages_AvailableEffects E0 = qp.s1(s11Var.V).E0();
                HashSet hashSet = new HashSet();
                if (E0 != null) {
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        try {
                            if (!((qi) arrayList.get(i7)).a.startsWith("animated_")) {
                                String c10 = i6.c(((qi) arrayList.get(i7)).a);
                                for (int i10 = 0; i10 < E0.effects.size(); i10++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = E0.effects.get(i10);
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
                HashMap hashMap = (HashMap) this.b;
                HashMap hashMap2 = (HashMap) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                Runnable runnable2 = (Runnable) this.e;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    String str2 = ((qi) arrayList.get(i11)).a;
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

    @Override // org.telegram.ui.ActionBar.r1
    public void g(u1 u1Var, int i7) {
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
                cn.D0((cn) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 15:
                String str = (String) obj;
                String str2 = LaunchActivity.B1;
                ch0 ch0Var = new ch0((LaunchActivity) obj4, (f2) obj3);
                ch0Var.N0((String) obj2, false);
                if (str != null) {
                    String[] split = str.split(" ", 2);
                    String str3 = split[0];
                    String str4 = split.length > 1 ? split[1] : null;
                    lb0 lb0Var = ch0Var.j1;
                    if (lb0Var != null) {
                        lb0Var.getEditText().setText(str3);
                    } else {
                        ch0Var.A1 = str3;
                    }
                    lb0 lb0Var2 = ch0Var.k1;
                    if (lb0Var2 != null) {
                        lb0Var2.getEditText().setText(str4);
                    } else {
                        ch0Var.B1 = str4;
                    }
                }
                ch0Var.show();
                break;
            case 16:
                ee0.Z((ee0) obj4, (String) obj3, (String) obj2, (String) obj);
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
                y91 y91Var = (y91) obj4;
                HashSet hashSet = (HashSet) obj3;
                HashSet hashSet2 = new HashSet();
                y91Var.A0 = hashSet2;
                hashSet2.addAll(hashSet);
                y91Var.Z0(true, false);
                hc.a0(y91Var).U(id.K0(hashSet.size(), "TopicsDeleted"), false, new y81(y91Var, 4), new v21(y91Var, (ArrayList) obj2, (Runnable) obj, 7)).j();
                y91Var.G0();
                u1Var.dismiss();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    @Override // a3.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h9.t1 h(int i7, m1 m1Var, int[] iArr) {
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
        boolean z9 = nVar.l;
        if (i17 == Integer.MAX_VALUE || i18 == Integer.MAX_VALUE) {
            i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        } else {
            int i19 = Integer.MAX_VALUE;
            for (int i20 = 0; i20 < m1Var2.a; i20++) {
                u uVar = m1Var2.d[i20];
                int i21 = uVar.z;
                int i22 = uVar.A;
                if (i21 > 0 && i22 > 0) {
                    if (z9) {
                        if ((i21 > i22) != (i17 > i18)) {
                            i13 = i17;
                            i12 = i18;
                            int i23 = i21 * i13;
                            int i24 = i22 * i12;
                            point = i23 < i24 ? new Point(i12, m0.g(i24, i21)) : new Point(m0.g(i23, i22), i13);
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

    @Override // org.telegram.ui.Components.gb0
    public void n(ib0 ib0Var, int i7) {
        e40 e40Var = (e40) this.b;
        ib0 ib0Var2 = (ib0) this.c;
        o20 o20Var = (o20) this.d;
        p20 p20Var = (p20) this.e;
        try {
            e40Var.c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        v4.g(e40Var.K1, e40Var.J1, 0L, 604800L, 2, ib0Var2, o20Var, p20Var);
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

    @Override // org.telegram.messenger.tr
    public void run(long j3) {
        c21 c21Var = (c21) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.d;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
        if (j3 == 0) {
            c21Var.getClass();
        } else {
            c21Var.P1 = qp.s1(c21Var.a).M0(Long.valueOf(j3));
            c21Var.e1(user, inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    @Override // org.telegram.ui.sw
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, y91 y91Var) {
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
                hi.a3 a3Var = ((v2) obj4).d;
                long j10 = ((xr) arrayList.get(0)).a;
                Bundle k10 = p0.k("scrollToTopOnResume", true);
                if (m5.C(j10)) {
                    k10.putInt("enc_id", (int) (j10 & 4294967295L));
                } else if (m5.E(j10)) {
                    k10.putLong("user_id", j10);
                } else {
                    k10.putLong("chat_id", -j10);
                }
                k10.putString("start_text", "@" + t10.n(user) + " " + str);
                Activity activity = a3Var.l0;
                if (activity instanceof LaunchActivity) {
                    f2 lastFragment = ((LaunchActivity) activity).M().getLastFragment();
                    if (qp.s1(a3Var.H).E(k10, lastFragment, null, null)) {
                        nb0Var.dismiss();
                        a3Var.d0 = true;
                        g0.r(a3Var.u0);
                        a3Var.D.h();
                        qs.f(a3Var.H).n(a3Var, qs.z1);
                        qs.e().n(a3Var, qs.n4);
                        qs.f(a3Var.H).n(a3Var, qs.J3);
                        if (!a3Var.Q0) {
                            super/*android.app.Dialog*/.dismiss();
                            a3Var.Q0 = true;
                        }
                        o4 o4Var = new o4(new cn(k10));
                        o4Var.b = true;
                        lastFragment.presentFragment(o4Var);
                        break;
                    }
                }
                break;
            case 9:
                b8 b8Var = (b8) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) obj2;
                ij ijVar = (ij) obj;
                if (arrayList.size() <= 1 && ((xr) arrayList.get(0)).a != p10.i(b8Var.a).e() && charSequence == null && arrayList2 != null) {
                    xr xrVar = (xr) arrayList.get(0);
                    long j11 = xrVar.a;
                    Bundle k11 = p0.k("scrollToTopOnResume", true);
                    if (m5.C(j11)) {
                        k11.putInt("enc_id", (int) (j11 & 4294967295L));
                    } else if (m5.E(j11)) {
                        k11.putLong("user_id", j11);
                    } else {
                        k11.putLong("chat_id", -j11);
                    }
                    cn cnVar = new cn(k11);
                    if (xrVar.b != 0) {
                        qg.d.a(cnVar, xrVar);
                    }
                    if (!b8Var.w2.u0(cnVar, true, false)) {
                        ywVar.finishFragment();
                        break;
                    } else {
                        cnVar.gc(arrayList2);
                        if (xrVar.b != 0) {
                            ywVar.removeSelfFromStack();
                            break;
                        }
                    }
                } else {
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        long j12 = ((xr) arrayList.get(i12)).a;
                        if (charSequence != null) {
                            j3 = j12;
                            gz.C(b8Var.a).r0(ez.b(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j3 = j12;
                        }
                        if (arrayList2 != null) {
                            gz.C(b8Var.a).q0(arrayList2, j3, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                            tL_document = tL_document2;
                        } else {
                            tL_document = tL_document2;
                            gz.C(b8Var.a).r0(ez.e(tL_document, null, ijVar.k.attachPath, j3, null, null, null, null, null, z10, i7, 0, 0, b8Var.m2, false));
                        }
                        i12++;
                        tL_document2 = tL_document;
                    }
                    ywVar.finishFragment();
                    f2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        hc.a0(Q).Q(R.raw.forward, 36, (arrayList.size() == 1 && ((xr) arrayList.get(0)).a == p10.i(b8Var.a).e()) ? id.M0(2131750498, null) : (arrayList.size() != 1 || ((xr) arrayList.get(0)).a <= 0) ? (arrayList.size() != 1 || ((xr) arrayList.get(0)).a >= 0) ? id.H(',', "FwdMessageToManyChats", arrayList.size()) : id.a0(null, null, 2131750502, m5.t(((xr) arrayList.get(0)).a)) : id.a0(null, null, 2131750497, m5.t(((xr) arrayList.get(0)).a))).j();
                        break;
                    }
                }
                break;
            default:
                TLRPC.User user2 = (TLRPC.User) obj3;
                String str2 = (String) obj2;
                nb0 nb0Var2 = (nb0) obj;
                di diVar = ((jh) obj4).e;
                long j13 = ((xr) arrayList.get(0)).a;
                Bundle k12 = p0.k("scrollToTopOnResume", true);
                if (m5.C(j13)) {
                    k12.putInt("enc_id", (int) (j13 & 4294967295L));
                } else if (m5.E(j13)) {
                    k12.putLong("user_id", j13);
                } else {
                    k12.putLong("chat_id", -j13);
                }
                k12.putString("start_text", "@" + t10.n(user2) + " " + str2);
                f2 f2Var = diVar.W1;
                if (qp.s1(diVar.D3).E(k12, f2Var, null, null)) {
                    nb0Var2.dismiss();
                    diVar.a(true);
                    o4 o4Var2 = new o4(new cn(k12));
                    o4Var2.b = true;
                    f2Var.presentFragment(o4Var2);
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
