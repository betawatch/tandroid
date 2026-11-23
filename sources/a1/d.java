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
import bi.l2;
import c8.ma;
import ch.p0;
import com.google.android.gms.tasks.OnFailureListener;
import di.y8;
import e2.m1;
import e2.u;
import h2.l0;
import h9.f0;
import h9.i0;
import h9.t1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import ki.n2;
import ki.s2;
import kotlin.jvm.internal.j;
import org.telegram.messenger.az;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.k10;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.oi;
import org.telegram.messenger.p10;
import org.telegram.messenger.pi;
import org.telegram.messenger.pr;
import org.telegram.messenger.q1;
import org.telegram.messenger.r10;
import org.telegram.messenger.s10;
import org.telegram.messenger.tr;
import org.telegram.messenger.yy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p4;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a5;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.e0;
import org.telegram.ui.bn;
import org.telegram.ui.c21;
import org.telegram.ui.cx;
import org.telegram.ui.de0;
import org.telegram.ui.f40;
import org.telegram.ui.fh0;
import org.telegram.ui.g4;
import org.telegram.ui.ls;
import org.telegram.ui.p20;
import org.telegram.ui.q20;
import org.telegram.ui.s11;
import org.telegram.ui.v21;
import org.telegram.ui.ww;
import org.telegram.ui.y81;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements OnFailureListener, p, q1, ww, org.telegram.ui.ActionBar.q1, a5, rb0, pi, pr, s10 {
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

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean G() {
        switch (this.a) {
            case 5:
                break;
            case 9:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.a5
    public void O(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 7:
                bn.J0((bn) this.b, (TLRPC.TL_document) this.c, (String) this.d, this.e, z10, i7);
                break;
            case 11:
                tn tnVar = (tn) this.b;
                tnVar.k0.d((TLRPC.TL_messageMediaPoll) this.c, tnVar.P, tnVar.n1, (ArrayList) this.d, z10, i7, ((Long) this.e).longValue());
                tnVar.b.a(true);
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

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean P(cx cxVar) {
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
                g0.g3(new ai.b(list, (r10) this.b, (TLRPC.TL_inputStorePaymentStarsTopup) this.c, (TL_stars.TL_starsTopupOption) this.d, (Activity) this.e, 8));
                break;
            default:
                g0.g3(new l2((y8) this.b, list, (e0) this.c, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.d, fVar, (Activity) this.e, 3));
                break;
        }
    }

    @Override // org.telegram.messenger.pi
    public void e(String str, ArrayList arrayList) {
        switch (this.a) {
            case 18:
                s11 s11Var = (s11) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                TLRPC.messages_AvailableEffects G0 = np.u1(s11Var.W).G0();
                HashSet hashSet = new HashSet();
                if (G0 != null) {
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        try {
                            if (!((oi) arrayList.get(i7)).a.startsWith("animated_")) {
                                String c10 = j6.c(((oi) arrayList.get(i7)).a);
                                for (int i10 = 0; i10 < G0.effects.size(); i10++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = G0.effects.get(i10);
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

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    @Override // a3.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t1 f(int i7, m1 m1Var, int[] iArr) {
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

    @Override // org.telegram.messenger.s10
    public Object g(Number number, Object obj) {
        Context context = (Context) this.b;
        int[] iArr = (int[]) this.c;
        h6 h6Var = (h6) this.d;
        ey0 ey0Var = (ey0) this.e;
        Integer num = (Integer) number;
        Float f10 = (Float) obj;
        LinearLayout g10 = f3.g(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        g10.addView(linearLayout, ma.t(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, ma.o(24, 24));
        if (num.intValue() == 7) {
            for (int i7 = 0; i7 < 2; i7++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, ma.o(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(g0.o1("fonts/num.otf"));
        t6.U(textView, m6.j5, h6Var);
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
        g10.addView(textView, ma.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new by0(ey0Var, g10, false);
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
                bn.D0((bn) obj4, (TLRPC.User) obj3, (AtomicBoolean) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 15:
                String str = (String) obj;
                String str2 = LaunchActivity.C1;
                fh0 fh0Var = new fh0((LaunchActivity) obj4, (g2) obj3);
                fh0Var.O0((String) obj2, false);
                if (str != null) {
                    String[] split = str.split(" ", 2);
                    String str3 = split[0];
                    String str4 = split.length > 1 ? split[1] : null;
                    wb0 wb0Var = fh0Var.n1;
                    if (wb0Var != null) {
                        wb0Var.getEditText().setText(str3);
                    } else {
                        fh0Var.E1 = str3;
                    }
                    wb0 wb0Var2 = fh0Var.o1;
                    if (wb0Var2 != null) {
                        wb0Var2.getEditText().setText(str4);
                    } else {
                        fh0Var.F1 = str4;
                    }
                }
                fh0Var.show();
                break;
            case 16:
                de0.Z((de0) obj4, (String) obj3, (String) obj2, (String) obj);
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
                y91Var.B0 = hashSet2;
                hashSet2.addAll(hashSet);
                y91Var.Z0(true, false);
                lc.b0(y91Var).U(hd.K0(hashSet.size(), "TopicsDeleted"), false, new y81(y91Var, 4), new v21(y91Var, (ArrayList) obj2, (Runnable) obj, 7)).j();
                y91Var.G0();
                t1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.rb0
    public void n(tb0 tb0Var, int i7) {
        f40 f40Var = (f40) this.b;
        tb0 tb0Var2 = (tb0) this.c;
        p20 p20Var = (p20) this.d;
        q20 q20Var = (q20) this.e;
        try {
            f40Var.c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        c5.g(f40Var.O1, f40Var.N1, 0L, 604800L, 2, tb0Var2, p20Var, q20Var);
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

    @Override // org.telegram.messenger.pr
    public void run(long j3) {
        c21 c21Var = (c21) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.d;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
        if (j3 == 0) {
            c21Var.getClass();
        } else {
            c21Var.T1 = np.u1(c21Var.a).O0(Long.valueOf(j3));
            c21Var.f1(user, inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    @Override // org.telegram.ui.ww
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
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
                zb0 zb0Var = (zb0) obj;
                s2 s2Var = ((n2) obj4).d;
                long j10 = ((tr) arrayList.get(0)).a;
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                if (n5.C(j10)) {
                    k10.putInt("enc_id", (int) (j10 & 4294967295L));
                } else if (n5.E(j10)) {
                    k10.putLong("user_id", j10);
                } else {
                    k10.putLong("chat_id", -j10);
                }
                k10.putString("start_text", "@" + p10.o(user) + " " + str);
                Activity activity = s2Var.m0;
                if (activity instanceof LaunchActivity) {
                    g2 lastFragment = ((LaunchActivity) activity).M().getLastFragment();
                    if (np.u1(s2Var.I).E(k10, lastFragment, null, null)) {
                        zb0Var.dismiss();
                        s2Var.e0 = true;
                        g0.r(s2Var.v0);
                        s2Var.E.h();
                        org.telegram.messenger.ls.f(s2Var.I).n(s2Var, org.telegram.messenger.ls.z1);
                        org.telegram.messenger.ls.e().n(s2Var, org.telegram.messenger.ls.q4);
                        org.telegram.messenger.ls.f(s2Var.I).n(s2Var, org.telegram.messenger.ls.M3);
                        if (!s2Var.R0) {
                            super/*android.app.Dialog*/.dismiss();
                            s2Var.R0 = true;
                        }
                        p4 p4Var = new p4(new bn(k10));
                        p4Var.b = true;
                        lastFragment.presentFragment(p4Var);
                        break;
                    }
                }
                break;
            case 9:
                f8 f8Var = (f8) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) obj2;
                gj gjVar = (gj) obj;
                if (arrayList.size() <= 1 && ((tr) arrayList.get(0)).a != k10.i(f8Var.a).e() && charSequence == null && arrayList2 != null) {
                    tr trVar = (tr) arrayList.get(0);
                    long j11 = trVar.a;
                    Bundle k11 = a8.p0.k("scrollToTopOnResume", true);
                    if (n5.C(j11)) {
                        k11.putInt("enc_id", (int) (j11 & 4294967295L));
                    } else if (n5.E(j11)) {
                        k11.putLong("user_id", j11);
                    } else {
                        k11.putLong("chat_id", -j11);
                    }
                    bn bnVar = new bn(k11);
                    if (trVar.b != 0) {
                        qg.c.a(bnVar, trVar);
                    }
                    if (!f8Var.A2.u0(bnVar, true, false)) {
                        cxVar.finishFragment();
                        break;
                    } else {
                        bnVar.hc(arrayList2);
                        if (trVar.b != 0) {
                            cxVar.removeSelfFromStack();
                            break;
                        }
                    }
                } else {
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        long j12 = ((tr) arrayList.get(i12)).a;
                        if (charSequence != null) {
                            j3 = j12;
                            az.C(f8Var.a).r0(yy.b(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j3 = j12;
                        }
                        if (arrayList2 != null) {
                            az.C(f8Var.a).q0(arrayList2, j3, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                            tL_document = tL_document2;
                        } else {
                            tL_document = tL_document2;
                            az.C(f8Var.a).r0(yy.e(tL_document, null, gjVar.k.attachPath, j3, null, null, null, null, null, z11, i7, 0, 0, f8Var.q2, false));
                        }
                        i12++;
                        tL_document2 = tL_document;
                    }
                    cxVar.finishFragment();
                    g2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        lc.b0(Q).Q(R.raw.forward, 36, (arrayList.size() == 1 && ((tr) arrayList.get(0)).a == k10.i(f8Var.a).e()) ? hd.N0(2131750481, null) : (arrayList.size() != 1 || ((tr) arrayList.get(0)).a <= 0) ? (arrayList.size() != 1 || ((tr) arrayList.get(0)).a >= 0) ? hd.H(',', "FwdMessageToManyChats", arrayList.size()) : hd.a0(null, null, 2131750485, n5.t(((tr) arrayList.get(0)).a)) : hd.a0(null, null, 2131750480, n5.t(((tr) arrayList.get(0)).a))).j();
                        break;
                    }
                }
                break;
            default:
                TLRPC.User user2 = (TLRPC.User) obj3;
                String str2 = (String) obj2;
                zb0 zb0Var2 = (zb0) obj;
                ui uiVar = ((ai) obj4).e;
                long j13 = ((tr) arrayList.get(0)).a;
                Bundle k12 = a8.p0.k("scrollToTopOnResume", true);
                if (n5.C(j13)) {
                    k12.putInt("enc_id", (int) (j13 & 4294967295L));
                } else if (n5.E(j13)) {
                    k12.putLong("user_id", j13);
                } else {
                    k12.putLong("chat_id", -j13);
                }
                k12.putString("start_text", "@" + p10.o(user2) + " " + str2);
                g2 g2Var = uiVar.a2;
                if (np.u1(uiVar.H3).E(k12, g2Var, null, null)) {
                    zb0Var2.dismiss();
                    uiVar.a(true);
                    p4 p4Var2 = new p4(new bn(k12));
                    p4Var2.b = true;
                    g2Var.presentFragment(p4Var2);
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
