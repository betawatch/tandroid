package ai;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import bi.a8;
import bi.d5;
import bi.g5;
import bi.h8;
import bi.i8;
import bi.j8;
import bi.l7;
import bi.l8;
import bi.m8;
import bi.n8;
import bi.t3;
import di.b5;
import di.f6;
import di.p8;
import di.pb;
import fi.f9;
import fi.r3;
import fi.s3;
import fi.s7;
import fi.w8;
import fi.z3;
import hi.d3;
import hi.k7;
import hi.s8;
import hi.sa;
import hi.t7;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.ve;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Cells.l3;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.ev;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y2(int i7, Object obj, Object obj2) {
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
                a3 a3Var = (a3) obj2;
                z2 z2Var = (z2) obj;
                a3Var.getClass();
                String str = z2Var.a;
                if (z2Var.P) {
                    if (DictationAsr.x()) {
                        DictationAsr.X(str);
                    } else {
                        boolean A = DictationAsr.A(str);
                        StringBuilder sb2 = new StringBuilder();
                        String[] E = DictationAsr.E();
                        int length = E.length;
                        while (r8 < length) {
                            String str2 = E[r8];
                            if (str2.equals(str)) {
                                r8 = A ? r8 + 1 : 0;
                                if (sb2.length() > 0) {
                                    sb2.append(',');
                                }
                                sb2.append(str2);
                            } else {
                                if (!DictationAsr.A(str2)) {
                                }
                                if (sb2.length() > 0) {
                                }
                                sb2.append(str2);
                            }
                        }
                        SharedPreferences.Editor putString = np.g1().edit().putString("asr_langs", sb2.toString());
                        if (sb2.length() == 0) {
                            putString.putBoolean("asr_auto", true);
                        }
                        putString.apply();
                    }
                } else if (!z2Var.Q) {
                    DictationAsr.t(z2Var.f);
                }
                z2Var.c();
                a3Var.e0();
                break;
            case 1:
                bi.e eVar = (bi.e) obj2;
                eVar.getClass();
                long o4 = n5.o(((TL_stars.TL_StarGiftAuctionAcquiredGift) obj).peer);
                eVar.dismiss();
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null && !p10.B(o4)) {
                    Bundle bundle = new Bundle();
                    if (o4 > 0) {
                        bundle.putLong("user_id", o4);
                        if (o4 == k10.i(eVar.a).e()) {
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
                final bi.e2 e2Var = (bi.e2) obj2;
                final TLRPC.User user = (TLRPC.User) obj;
                a70 G = a70.G(e2Var.c, e2Var.J0, (View) view.getParent());
                G.c(R.drawable.profile_discuss, hd.N0(2131745405, null), new Runnable() { // from class: bi.r1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r3) {
                            case 0:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("user_id", user.id);
                                bn bnVar = new bn(bundle2);
                                org.telegram.ui.ActionBar.g2 g2Var = e2Var.s1;
                                if (g2Var == null) {
                                    org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                                    if (T2 != null) {
                                        org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2();
                                        e2Var2.a = true;
                                        T2.showAsSheet(bnVar, e2Var2);
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
                                org.telegram.ui.ActionBar.g2 g2Var2 = e2Var.s1;
                                if (g2Var2 == null) {
                                    org.telegram.ui.ActionBar.g2 T3 = LaunchActivity.T();
                                    if (T3 != null) {
                                        org.telegram.ui.ActionBar.e2 e2Var3 = new org.telegram.ui.ActionBar.e2();
                                        e2Var3.a = true;
                                        T3.showAsSheet(profileActivity, e2Var3);
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
                G.c(R.drawable.msg_openprofile, hd.N0(2131747592, null), new Runnable() { // from class: bi.r1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("user_id", user.id);
                                bn bnVar = new bn(bundle2);
                                org.telegram.ui.ActionBar.g2 g2Var = e2Var.s1;
                                if (g2Var == null) {
                                    org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                                    if (T2 != null) {
                                        org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2();
                                        e2Var2.a = true;
                                        T2.showAsSheet(bnVar, e2Var2);
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
                                org.telegram.ui.ActionBar.g2 g2Var2 = e2Var.s1;
                                if (g2Var2 == null) {
                                    org.telegram.ui.ActionBar.g2 T3 = LaunchActivity.T();
                                    if (T3 != null) {
                                        org.telegram.ui.ActionBar.e2 e2Var3 = new org.telegram.ui.ActionBar.e2();
                                        e2Var3.a = true;
                                        T3.showAsSheet(profileActivity, e2Var3);
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
                t3 t3Var = (t3) obj;
                if (!((bi.s3) obj2).h2) {
                    t3Var.run();
                    break;
                }
                break;
            case 4:
                d5 d5Var = (d5) obj2;
                y10 y10Var = (y10) obj;
                hi.e eVar2 = d5Var.r1;
                if (eVar2.e0 && !eVar2.R) {
                    org.telegram.messenger.g0.v1(d5Var.o1);
                    y10Var.a(Long.valueOf(d5Var.t1));
                    break;
                }
                break;
            case 5:
                j8 j8Var = (j8) obj2;
                j8Var.getClass();
                if (((l7) obj).n > 0) {
                    j8Var.presentFragment(new pb());
                    break;
                }
                break;
            case 6:
                i8 i8Var = (i8) obj2;
                h8 h8Var = (h8) obj;
                a70 G2 = a70.G(i8Var.c, i8Var.J0, i8Var.W1);
                G2.c(R.drawable.menu_sort_value, hd.N0(2131745943, null), new a8(h8Var, 3), false);
                G2.c(R.drawable.menu_sort_date, hd.N0(2131745947, null), new a8(h8Var, 4), false);
                G2.c(R.drawable.menu_sort_number, hd.N0(2131745945, null), new a8(h8Var, 5), false);
                G2.t = false;
                G2.b0 = true;
                G2.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                G2.a0();
                break;
            case 7:
                n8 n8Var = (n8) obj2;
                g5 g5Var = (g5) obj;
                HashSet hashSet = n8Var.V1;
                if (!hashSet.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList2 = n8Var.U1.l;
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
                    g5Var.a(arrayList);
                    n8Var.dismiss();
                    break;
                }
                break;
            case 8:
                p8 p8Var = ((m8) obj2).c.U1;
                p8Var.e = !p8Var.e;
                ((l8) obj).run();
                p8Var.k(true);
                break;
            case 9:
                di.t.c0((di.t) obj2, (Context) obj, view);
                break;
            case 10:
                di.u0 u0Var = (di.u0) obj2;
                y1 y1Var = (y1) obj;
                hi.e eVar3 = u0Var.q1;
                if (eVar3.e0 && !eVar3.R) {
                    org.telegram.messenger.g0.v1(u0Var.n1);
                    eVar3.setLoading(true);
                    y1Var.a(u0Var.z1);
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
                h6 h6Var = (h6) obj;
                if (b5Var.F.getAlpha() >= 1.0f && !b5Var.i0 && !b5Var.k0 && b5Var.e0 != null) {
                    new di.h1(b5Var.getContext(), h6Var, b5Var.a0, b5Var.d0, b5Var.e0, true).show();
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
                    gc Q = new lc(z3Var.M0, z3Var.l0).Q(R.raw.error, 36, hd.N0(2131744421, null));
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
                ((org.telegram.ui.ActionBar.w2) obj).dismiss();
                break;
            case 20:
                z3 z3Var3 = ((r3) obj2).x;
                ev alert = ((fi.a8) obj).getAlert();
                if (alert != null && (s3Var = z3Var3.A1) != null) {
                    ((w8) s3Var).h(alert);
                    z3Var3.d1.a();
                    break;
                }
                break;
            case 21:
                d3 d3Var = (d3) obj2;
                d3Var.e((ve) obj, false);
                d3Var.G.p();
                break;
            case 22:
                k7 k7Var = (k7) obj2;
                hi.c cVar = (hi.c) obj;
                l3 l3Var = k7Var.U1;
                try {
                    charSequence = ((ClipboardManager) k7Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(k7Var.getContext());
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
                sa saVar = (sa) obj2;
                new t7((Context) obj, saVar.c, true, saVar.y0, new s8(saVar, 20), saVar.a).show();
                break;
            case 24:
                org.telegram.messenger.g0.g(((TL_account.TL_businessChatLink) obj2).link);
                lc.b0((bn) obj).k(false).j();
                break;
            case 25:
                kg.k0 k0Var = (kg.k0) obj2;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) obj;
                kg.b0 b0Var = k0Var.V1;
                hi.e eVar4 = k0Var.Z1;
                if (!eVar4.R) {
                    eVar4.setLoading(true);
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.bot = np.u1(k0Var.a).q1(tL_connectedBot.bot_id);
                    updateconnectedbot.recipients = b0Var.b();
                    ConnectionsManager.getInstance(k0Var.a).sendRequest(updateconnectedbot, new bi.q1(k0Var, tL_connectedBot, b0Var.c(), 11));
                    break;
                }
                break;
            case 26:
                ki.j.A0((ki.j) obj2, (Context) obj);
                break;
            case 27:
                ki.s2 s2Var = (ki.s2) obj2;
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
                a70 a70Var = s2Var.P0;
                if (a70Var != null) {
                    a70Var.v();
                    s2Var.P0 = null;
                    break;
                }
                break;
            case 28:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                ((org.telegram.ui.ActionBar.w2) obj2).dismiss();
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
