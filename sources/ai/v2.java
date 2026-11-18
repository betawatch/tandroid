package ai;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import bi.b5;
import bi.e5;
import bi.f8;
import bi.g8;
import bi.h8;
import bi.j7;
import bi.j8;
import bi.k8;
import bi.l8;
import bi.o3;
import bi.p3;
import bi.y7;
import di.f6;
import di.o8;
import di.pb;
import fi.a8;
import fi.f9;
import fi.r3;
import fi.s3;
import fi.s7;
import fi.w8;
import fi.z3;
import hi.e3;
import hi.l7;
import hi.t8;
import hi.ta;
import hi.u7;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.o10;
import org.telegram.messenger.ue;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Cells.k3;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class v2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v2(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04ab  */
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
                x2 x2Var = (x2) obj2;
                w2 w2Var = (w2) obj;
                x2Var.getClass();
                String str = w2Var.a;
                if (w2Var.O) {
                    if (DictationAsr.v()) {
                        DictationAsr.S(str);
                    } else {
                        boolean y10 = DictationAsr.y(str);
                        StringBuilder sb2 = new StringBuilder();
                        String[] C = DictationAsr.C();
                        int length = C.length;
                        while (r8 < length) {
                            String str2 = C[r8];
                            if (str2.equals(str)) {
                                r8 = y10 ? r8 + 1 : 0;
                                if (sb2.length() > 0) {
                                    sb2.append(',');
                                }
                                sb2.append(str2);
                            } else {
                                if (!DictationAsr.y(str2)) {
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
                } else if (!w2Var.P) {
                    DictationAsr.r(w2Var.e);
                }
                w2Var.b();
                x2Var.e0();
                break;
            case 1:
                bi.e eVar = (bi.e) obj2;
                eVar.getClass();
                long o4 = n5.o(((TL_stars.TL_StarGiftAuctionAcquiredGift) obj).peer);
                eVar.dismiss();
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null && !o10.B(o4)) {
                    Bundle bundle = new Bundle();
                    if (o4 > 0) {
                        bundle.putLong("user_id", o4);
                        if (o4 == j10.i(eVar.a).e()) {
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
                ((bi.x0) obj2).c((Runnable) obj);
                break;
            case 3:
                final bi.a2 a2Var = (bi.a2) obj2;
                final TLRPC.User user = (TLRPC.User) obj;
                y60 G = y60.G(a2Var.c, a2Var.J0, (View) view.getParent());
                G.c(R.drawable.profile_discuss, gd.M0(2131745406, null), new Runnable() { // from class: bi.n1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r3) {
                            case 0:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("user_id", user.id);
                                bn bnVar = new bn(bundle2);
                                org.telegram.ui.ActionBar.h2 h2Var = a2Var.s1;
                                if (h2Var == null) {
                                    org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                                    if (T2 != null) {
                                        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2();
                                        f2Var.a = true;
                                        T2.showAsSheet(bnVar, f2Var);
                                        break;
                                    }
                                } else {
                                    h2Var.presentFragment(bnVar);
                                    break;
                                }
                                break;
                            default:
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", user.id);
                                ProfileActivity profileActivity = new ProfileActivity(bundle3, null);
                                org.telegram.ui.ActionBar.h2 h2Var2 = a2Var.s1;
                                if (h2Var2 == null) {
                                    org.telegram.ui.ActionBar.h2 T3 = LaunchActivity.T();
                                    if (T3 != null) {
                                        org.telegram.ui.ActionBar.f2 f2Var2 = new org.telegram.ui.ActionBar.f2();
                                        f2Var2.a = true;
                                        T3.showAsSheet(profileActivity, f2Var2);
                                        break;
                                    }
                                } else {
                                    h2Var2.presentFragment(profileActivity);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                G.c(R.drawable.msg_openprofile, gd.M0(2131747593, null), new Runnable() { // from class: bi.n1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("user_id", user.id);
                                bn bnVar = new bn(bundle2);
                                org.telegram.ui.ActionBar.h2 h2Var = a2Var.s1;
                                if (h2Var == null) {
                                    org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                                    if (T2 != null) {
                                        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2();
                                        f2Var.a = true;
                                        T2.showAsSheet(bnVar, f2Var);
                                        break;
                                    }
                                } else {
                                    h2Var.presentFragment(bnVar);
                                    break;
                                }
                                break;
                            default:
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", user.id);
                                ProfileActivity profileActivity = new ProfileActivity(bundle3, null);
                                org.telegram.ui.ActionBar.h2 h2Var2 = a2Var.s1;
                                if (h2Var2 == null) {
                                    org.telegram.ui.ActionBar.h2 T3 = LaunchActivity.T();
                                    if (T3 != null) {
                                        org.telegram.ui.ActionBar.f2 f2Var2 = new org.telegram.ui.ActionBar.f2();
                                        f2Var2.a = true;
                                        T3.showAsSheet(profileActivity, f2Var2);
                                        break;
                                    }
                                } else {
                                    h2Var2.presentFragment(profileActivity);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                G.a0();
                break;
            case 4:
                p3 p3Var = (p3) obj;
                if (!((o3) obj2).h2) {
                    p3Var.run();
                    break;
                }
                break;
            case 5:
                b5 b5Var = (b5) obj2;
                x10 x10Var = (x10) obj;
                hi.d dVar = b5Var.r1;
                if (dVar.e0 && !dVar.R) {
                    org.telegram.messenger.g0.v1(b5Var.o1);
                    x10Var.a(Long.valueOf(b5Var.t1));
                    break;
                }
                break;
            case 6:
                h8 h8Var = (h8) obj2;
                h8Var.getClass();
                if (((j7) obj).n > 0) {
                    h8Var.presentFragment(new pb());
                    break;
                }
                break;
            case 7:
                g8 g8Var = (g8) obj2;
                f8 f8Var = (f8) obj;
                y60 G2 = y60.G(g8Var.c, g8Var.J0, g8Var.W1);
                G2.c(R.drawable.menu_sort_value, gd.M0(2131745944, null), new y7(f8Var, 3), false);
                G2.c(R.drawable.menu_sort_date, gd.M0(2131745948, null), new y7(f8Var, 4), false);
                G2.c(R.drawable.menu_sort_number, gd.M0(2131745946, null), new y7(f8Var, 5), false);
                G2.t = false;
                G2.b0 = true;
                G2.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                G2.a0();
                break;
            case 8:
                l8 l8Var = (l8) obj2;
                e5 e5Var = (e5) obj;
                HashSet hashSet = l8Var.V1;
                if (!hashSet.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList2 = l8Var.U1.l;
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
                    e5Var.a(arrayList);
                    l8Var.dismiss();
                    break;
                }
                break;
            case 9:
                o8 o8Var = ((k8) obj2).c.U1;
                o8Var.e = !o8Var.e;
                ((j8) obj).run();
                o8Var.k(true);
                break;
            case 10:
                di.t.c0((di.t) obj2, (Context) obj, view);
                break;
            case 11:
                di.u0 u0Var = (di.u0) obj2;
                v1 v1Var = (v1) obj;
                hi.d dVar2 = u0Var.q1;
                if (dVar2.e0 && !dVar2.R) {
                    org.telegram.messenger.g0.v1(u0Var.n1);
                    dVar2.setLoading(true);
                    v1Var.a(u0Var.z1);
                    break;
                }
                break;
            case 12:
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
            case 13:
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
            case 14:
                f6 f6Var = (f6) obj2;
                boolean z10 = !f6Var.w3;
                f6Var.w3 = z10;
                ((org.telegram.ui.Cells.c2) obj).c(z10, true);
                break;
            case 15:
                vf.c.v(((f6) obj2).getContext(), ((TL_stars.UniqueStarGiftValueInfo) obj).fragment_listed_url, false);
                break;
            case 16:
                ((f6) obj2).B2((CharSequence) obj);
                break;
            case 17:
                di.b5 b5Var2 = (di.b5) obj2;
                i6 i6Var = (i6) obj;
                if (b5Var2.F.getAlpha() >= 1.0f && !b5Var2.i0 && !b5Var2.k0 && b5Var2.e0 != null) {
                    new di.h1(b5Var2.getContext(), i6Var, b5Var2.a0, b5Var2.d0, b5Var2.e0, true).show();
                    break;
                }
                break;
            case 18:
                vf.c.t((Context) obj2, ((TL_stars.StarsTransaction) obj).transaction_url);
                break;
            case 19:
                z3 z3Var = (z3) obj2;
                s7 s7Var = (s7) obj;
                f9 f9Var = z3Var.t0;
                if (s7Var.b == null) {
                    gc Q = new lc(z3Var.M0, z3Var.l0).Q(R.raw.error, 36, gd.M0(2131744429, null));
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
            case 20:
                z3 z3Var2 = (z3) obj2;
                ((w8) z3Var2.A1).h(new ug.z0(z3Var2.t0.f, 14, false));
                ((org.telegram.ui.ActionBar.x2) obj).dismiss();
                break;
            case 21:
                z3 z3Var3 = ((r3) obj2).x;
                bv alert = ((a8) obj).getAlert();
                if (alert != null && (s3Var = z3Var3.A1) != null) {
                    ((w8) s3Var).h(alert);
                    z3Var3.d1.a();
                    break;
                }
                break;
            case 22:
                e3 e3Var = (e3) obj2;
                e3Var.e((ue) obj, false);
                e3Var.G.p();
                break;
            case 23:
                l7 l7Var = (l7) obj2;
                hi.r1 r1Var = (hi.r1) obj;
                k3 k3Var = l7Var.U1;
                try {
                    charSequence = ((ClipboardManager) l7Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(l7Var.getContext());
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (charSequence != null) {
                    k3Var.d.setText(charSequence.toString());
                    i3 i3Var = k3Var.d;
                    i3Var.setSelection(0, i3Var.getText().length());
                }
                r1Var.run();
                break;
            case 24:
                ta taVar = (ta) obj2;
                new u7((Context) obj, taVar.c, true, taVar.y0, new t8(taVar, 20), taVar.a).show();
                break;
            case 25:
                org.telegram.messenger.g0.g(((TL_account.TL_businessChatLink) obj2).link);
                lc.b0((bn) obj).k(false).j();
                break;
            case 26:
                kg.l0 l0Var = (kg.l0) obj2;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) obj;
                kg.a0 a0Var = l0Var.V1;
                hi.d dVar3 = l0Var.Z1;
                if (!dVar3.R) {
                    dVar3.setLoading(true);
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.bot = mp.u1(l0Var.a).q1(tL_connectedBot.bot_id);
                    updateconnectedbot.recipients = a0Var.b();
                    ConnectionsManager.getInstance(l0Var.a).sendRequest(updateconnectedbot, new bi.m1(l0Var, tL_connectedBot, a0Var.c(), 11));
                    break;
                }
                break;
            case 27:
                ki.k.A0((ki.k) obj2, (Context) obj);
                break;
            case 28:
                ki.t2 t2Var = (ki.t2) obj2;
                ki.g0 g0Var = (ki.g0) obj;
                if (g0Var.c()) {
                    g0Var.a();
                } else {
                    File file = g0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = g0Var.d;
                        org.telegram.messenger.g0.t2(file2, file2.getName(), null, LaunchActivity.H1, null, true);
                    }
                }
                y60 y60Var = t2Var.P0;
                if (y60Var != null) {
                    y60Var.v();
                    t2Var.P0 = null;
                    break;
                }
                break;
            default:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                ((org.telegram.ui.ActionBar.x2) obj2).dismiss();
                org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(ProfileActivity.D4(connectedbotstarref.bot_id));
                    break;
                }
                break;
        }
    }
}
