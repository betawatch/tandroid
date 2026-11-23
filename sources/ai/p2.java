package ai;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import bi.d8;
import bi.g5;
import bi.j5;
import bi.k8;
import bi.l8;
import bi.m8;
import bi.o7;
import bi.o8;
import bi.q8;
import bi.u3;
import bi.v3;
import di.b5;
import di.f6;
import di.p8;
import di.pb;
import fi.a8;
import fi.f9;
import fi.r3;
import fi.s3;
import fi.s7;
import fi.w8;
import fi.z3;
import hi.f8;
import hi.m3;
import hi.n9;
import hi.nb;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import ki.t2;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.n5;
import org.telegram.messenger.ue;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Cells.l3;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p2(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04b1  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        TL_stars.SavedStarGift savedStarGift;
        Integer num;
        s3 s3Var;
        int i7 = this.a;
        di.c1 c1Var = null;
        CharSequence charSequence = null;
        c1Var = null;
        final int i10 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                r2 r2Var = (r2) obj2;
                q2 q2Var = (q2) obj;
                r2Var.getClass();
                String str = q2Var.a;
                if (q2Var.P) {
                    if (DictationAsr.z()) {
                        DictationAsr.a0(str);
                    } else {
                        boolean B = DictationAsr.B(str);
                        StringBuilder sb2 = new StringBuilder();
                        String[] H = DictationAsr.H();
                        int length = H.length;
                        while (r8 < length) {
                            String str2 = H[r8];
                            if (str2.equals(str)) {
                                r8 = B ? r8 + 1 : 0;
                                if (sb2.length() > 0) {
                                    sb2.append(',');
                                }
                                sb2.append(str2);
                            } else {
                                if (!DictationAsr.B(str2)) {
                                }
                                if (sb2.length() > 0) {
                                }
                                sb2.append(str2);
                            }
                        }
                        SharedPreferences.Editor putString = mp.g1().edit().putString("asr_langs", sb2.toString());
                        if (sb2.length() == 0) {
                            putString.putBoolean("asr_auto", true);
                        }
                        putString.apply();
                    }
                } else if (!q2Var.Q) {
                    DictationAsr.v(q2Var.f);
                }
                q2Var.c();
                r2Var.e0();
                break;
            case 1:
                bi.e eVar = (bi.e) obj2;
                eVar.getClass();
                long o4 = n5.o(((TL_stars.TL_StarGiftAuctionAcquiredGift) obj).peer);
                eVar.dismiss();
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null && !n10.B(o4)) {
                    Bundle bundle = new Bundle();
                    if (o4 > 0) {
                        bundle.putLong("user_id", o4);
                        if (o4 == i10.i(eVar.a).e()) {
                            bundle.putBoolean("my_profile", true);
                        }
                    } else {
                        bundle.putLong("chat_id", -o4);
                    }
                    bundle.putBoolean("open_gifts", true);
                    T.presentFragment(new ProfileActivity(bundle, null));
                    break;
                }
                break;
            case 2:
                final bi.f2 f2Var = (bi.f2) obj2;
                final TLRPC.User user = (TLRPC.User) obj;
                x60 G = x60.G(f2Var.c, f2Var.J0, (View) view.getParent());
                G.c(R.drawable.profile_discuss, gd.N0(2131745405, null), new Runnable() { // from class: bi.r1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r3) {
                            case 0:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("user_id", user.id);
                                bn bnVar = new bn(bundle2);
                                org.telegram.ui.ActionBar.g2 g2Var = f2Var.s1;
                                if (g2Var == null) {
                                    org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                                    if (T2 != null) {
                                        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
                                        e2Var.a = true;
                                        T2.showAsSheet(bnVar, e2Var);
                                        break;
                                    }
                                } else {
                                    g2Var.presentFragment(bnVar);
                                    break;
                                }
                                break;
                            default:
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", user.id);
                                ProfileActivity profileActivity = new ProfileActivity(bundle3, null);
                                org.telegram.ui.ActionBar.g2 g2Var2 = f2Var.s1;
                                if (g2Var2 == null) {
                                    org.telegram.ui.ActionBar.g2 T3 = LaunchActivity.T();
                                    if (T3 != null) {
                                        org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2();
                                        e2Var2.a = true;
                                        T3.showAsSheet(profileActivity, e2Var2);
                                        break;
                                    }
                                } else {
                                    g2Var2.presentFragment(profileActivity);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                G.c(R.drawable.msg_openprofile, gd.N0(2131747592, null), new Runnable() { // from class: bi.r1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("user_id", user.id);
                                bn bnVar = new bn(bundle2);
                                org.telegram.ui.ActionBar.g2 g2Var = f2Var.s1;
                                if (g2Var == null) {
                                    org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                                    if (T2 != null) {
                                        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
                                        e2Var.a = true;
                                        T2.showAsSheet(bnVar, e2Var);
                                        break;
                                    }
                                } else {
                                    g2Var.presentFragment(bnVar);
                                    break;
                                }
                                break;
                            default:
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", user.id);
                                ProfileActivity profileActivity = new ProfileActivity(bundle3, null);
                                org.telegram.ui.ActionBar.g2 g2Var2 = f2Var.s1;
                                if (g2Var2 == null) {
                                    org.telegram.ui.ActionBar.g2 T3 = LaunchActivity.T();
                                    if (T3 != null) {
                                        org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2();
                                        e2Var2.a = true;
                                        T3.showAsSheet(profileActivity, e2Var2);
                                        break;
                                    }
                                } else {
                                    g2Var2.presentFragment(profileActivity);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                G.a0();
                break;
            case 3:
                v3 v3Var = (v3) obj;
                if (!((u3) obj2).h2) {
                    v3Var.run();
                    break;
                }
                break;
            case 4:
                g5 g5Var = (g5) obj2;
                w10 w10Var = (w10) obj;
                hi.e eVar2 = g5Var.r1;
                if (eVar2.e0 && !eVar2.R) {
                    org.telegram.messenger.g0.v1(g5Var.o1);
                    w10Var.a(Long.valueOf(g5Var.t1));
                    break;
                }
                break;
            case 5:
                m8 m8Var = (m8) obj2;
                m8Var.getClass();
                if (((o7) obj).n > 0) {
                    m8Var.presentFragment(new pb());
                    break;
                }
                break;
            case 6:
                l8 l8Var = (l8) obj2;
                k8 k8Var = (k8) obj;
                x60 G2 = x60.G(l8Var.c, l8Var.J0, l8Var.W1);
                G2.c(R.drawable.menu_sort_value, gd.N0(2131745943, null), new d8(k8Var, 3), false);
                G2.c(R.drawable.menu_sort_date, gd.N0(2131745947, null), new d8(k8Var, 4), false);
                G2.c(R.drawable.menu_sort_number, gd.N0(2131745945, null), new d8(k8Var, 5), false);
                G2.t = false;
                G2.b0 = true;
                G2.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                G2.a0();
                break;
            case 7:
                q8 q8Var = (q8) obj2;
                j5 j5Var = (j5) obj;
                HashSet hashSet = q8Var.V1;
                if (!hashSet.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList2 = q8Var.U1.l;
                        int size = arrayList2.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                Object obj3 = arrayList2.get(i11);
                                i11++;
                                savedStarGift = (TL_stars.SavedStarGift) obj3;
                                int i12 = savedStarGift.msg_id;
                                if ((i12 == 0 || i12 != longValue) && savedStarGift.saved_id != longValue) {
                                }
                            } else {
                                savedStarGift = null;
                            }
                        }
                        if (savedStarGift != null) {
                            arrayList.add(savedStarGift);
                        }
                    }
                    j5Var.a(arrayList);
                    q8Var.dismiss();
                    break;
                }
                break;
            case 8:
                p8 p8Var = ((bi.p8) obj2).c.U1;
                p8Var.e = !p8Var.e;
                ((o8) obj).run();
                p8Var.k(true);
                break;
            case 9:
                di.t.c0((di.t) obj2, (Context) obj, view);
                break;
            case 10:
                di.u0 u0Var = (di.u0) obj2;
                s1 s1Var = (s1) obj;
                hi.e eVar3 = u0Var.q1;
                if (eVar3.e0 && !eVar3.R) {
                    org.telegram.messenger.g0.v1(u0Var.n1);
                    eVar3.setLoading(true);
                    s1Var.a(u0Var.z1);
                    break;
                }
                break;
            case 11:
                di.h1 h1Var = (di.h1) obj2;
                ArrayList<TL_stars.StarGiftAttribute> arrayList3 = (ArrayList) obj;
                di.z0 z0Var = h1Var.k2;
                int i13 = h1Var.v2;
                if (i13 != 2) {
                    if (i13 == 1) {
                        di.c1 c1Var2 = new di.c1(z0Var.getUpgradeBackdropAttribute(), z0Var.getUpgradePatternAttribute(), z0Var.getUpgradeImageViewAttribute());
                        h1Var.p2 = c1Var2;
                        z0Var.setPreviewAttributes(c1Var2);
                        h1Var.h1(2);
                        break;
                    }
                } else {
                    z0Var.setPreviewingAttributes(arrayList3);
                    h1Var.h1(1);
                    break;
                }
                break;
            case 12:
                di.c1 c1Var3 = (di.c1) obj;
                di.h1 h1Var2 = ((di.a1) obj2).Q;
                int i14 = h1Var2.v2;
                di.z0 z0Var2 = h1Var2.k2;
                if (i14 == 1) {
                    h1Var2.p2 = new di.c1(z0Var2.getUpgradeBackdropAttribute(), z0Var2.getUpgradePatternAttribute(), z0Var2.getUpgradeImageViewAttribute());
                    h1Var2.h1(2);
                }
                int i15 = h1Var2.f2.s;
                di.c1 c1Var4 = h1Var2.p2;
                if (c1Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = c1Var4.a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = c1Var4.c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = c1Var4.b;
                    if (i15 == 1) {
                        c1Var = new di.c1(c1Var3.a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i15 == 2) {
                        c1Var = new di.c1(stargiftattributebackdrop, c1Var3.b, stargiftattributemodel);
                    } else if (i15 == 0) {
                        c1Var = new di.c1(stargiftattributebackdrop, stargiftattributepattern, c1Var3.c);
                    }
                }
                h1Var2.p2 = c1Var;
                z0Var2.setPreviewAttributes(c1Var);
                h1Var2.j1();
                break;
            case 13:
                f6 f6Var = (f6) obj2;
                boolean z10 = !f6Var.w3;
                f6Var.w3 = z10;
                ((org.telegram.ui.Cells.d2) obj).c(z10, true);
                break;
            case 14:
                vf.c.v(((f6) obj2).getContext(), ((TL_stars.UniqueStarGiftValueInfo) obj).fragment_listed_url, false);
                break;
            case 15:
                ((f6) obj2).B2((CharSequence) obj);
                break;
            case 16:
                b5 b5Var = (b5) obj2;
                i6 i6Var = (i6) obj;
                if (b5Var.F.getAlpha() >= 1.0f && !b5Var.i0 && !b5Var.k0 && b5Var.e0 != null) {
                    new di.h1(b5Var.getContext(), i6Var, b5Var.a0, b5Var.d0, b5Var.e0, true).show();
                    break;
                }
                break;
            case 17:
                vf.c.t((Context) obj2, ((TL_stars.StarsTransaction) obj).transaction_url);
                break;
            case 18:
                z3 z3Var = (z3) obj2;
                s7 s7Var = (s7) obj;
                f9 f9Var = z3Var.t0;
                if (s7Var.b == null) {
                    fc Q = new kc(z3Var.M0, z3Var.l0).Q(R.raw.error, 36, gd.N0(2131744420, null));
                    Q.a = 3;
                    Q.k(true);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    if (s7Var.b.longValue() >= 0) {
                        bundle2.putLong("user_id", s7Var.b.longValue());
                    } else {
                        bundle2.putLong("chat_id", -s7Var.b.longValue());
                    }
                    if (s7Var.e && (num = s7Var.d) != null) {
                        bundle2.putInt("message_id", num.intValue());
                        f9Var.N(new bn(bundle2));
                        break;
                    } else {
                        f9Var.N(new ProfileActivity(bundle2, null));
                        break;
                    }
                }
                break;
            case 19:
                z3 z3Var2 = (z3) obj2;
                ((w8) z3Var2.A1).h(new ug.y0(z3Var2.t0.f, 14, false));
                ((w2) obj).dismiss();
                break;
            case 20:
                z3 z3Var3 = ((r3) obj2).x;
                bv alert = ((a8) obj).getAlert();
                if (alert != null && (s3Var = z3Var3.A1) != null) {
                    ((w8) s3Var).h(alert);
                    z3Var3.d1.a();
                    break;
                }
                break;
            case 21:
                m3 m3Var = (m3) obj2;
                m3Var.e((ue) obj, false);
                m3Var.G.p();
                break;
            case 22:
                f8 f8Var = (f8) obj2;
                hi.c cVar = (hi.c) obj;
                l3 l3Var = f8Var.U1;
                try {
                    charSequence = ((ClipboardManager) f8Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(f8Var.getContext());
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (charSequence != null) {
                    l3Var.d.setText(charSequence.toString());
                    j3 j3Var = l3Var.d;
                    j3Var.setSelection(0, j3Var.getText().length());
                }
                cVar.run();
                break;
            case 23:
                nb nbVar = (nb) obj2;
                new hi.o8((Context) obj, nbVar.c, true, nbVar.y0, new n9(nbVar, 20), nbVar.a).show();
                break;
            case 24:
                org.telegram.messenger.g0.g(((TL_account.TL_businessChatLink) obj2).link);
                kc.b0((bn) obj).k(false).j();
                break;
            case 25:
                kg.k0 k0Var = (kg.k0) obj2;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) obj;
                kg.b0 b0Var = k0Var.V1;
                hi.e eVar4 = k0Var.Z1;
                if (!eVar4.R) {
                    eVar4.setLoading(true);
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.bot = mp.u1(k0Var.a).q1(tL_connectedBot.bot_id);
                    updateconnectedbot.recipients = b0Var.b();
                    ConnectionsManager.getInstance(k0Var.a).sendRequest(updateconnectedbot, new bi.q1(k0Var, tL_connectedBot, b0Var.c(), 11));
                    break;
                }
                break;
            case 26:
                ki.j.A0((ki.j) obj2, (Context) obj);
                break;
            case 27:
                t2 t2Var = (t2) obj2;
                ki.f0 f0Var = (ki.f0) obj;
                if (f0Var.c()) {
                    f0Var.a();
                } else {
                    File file = f0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = f0Var.d;
                        org.telegram.messenger.g0.t2(file2, file2.getName(), null, LaunchActivity.H1, null, true);
                    }
                }
                x60 x60Var = t2Var.P0;
                if (x60Var != null) {
                    x60Var.v();
                    t2Var.P0 = null;
                    break;
                }
                break;
            case 28:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                ((w2) obj2).dismiss();
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(ProfileActivity.D4(connectedbotstarref.bot_id));
                    break;
                }
                break;
            default:
                ni.b bVar = (ni.b) obj2;
                bVar.getClass();
                ((Runnable) obj).run();
                bVar.dismiss();
                break;
        }
    }
}
