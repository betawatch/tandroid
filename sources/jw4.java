// default package

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jw4 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jw4(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dy0 dy0Var;
        nk3 nk3Var;
        my0 my0Var;
        byte b = 11;
        byte b2 = 3;
        final byte b3 = 1;
        final byte b4 = 0;
        switch (this.a) {
            case 0:
                mw4 mw4Var = (mw4) this.b;
                Context context = (Context) this.c;
                ylb ylbVar = (ylb) this.d;
                if (mw4Var.A1.a == ok.a) {
                    new exa(context, ylbVar).show();
                    break;
                }
                break;
            case 1:
                yx4 yx4Var = (yx4) this.b;
                Activity activity = (Activity) this.c;
                d dVar = (d) this.d;
                yx4Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                alertDialog$Builder.a.S = jb6.M0(2131749335, null);
                alertDialog$Builder.a.U = gm.S2(jb6.M0(2131749336, null));
                alertDialog$Builder.j(jb6.M0(2131749337, null), new wx4(yx4Var, b4));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                dVar.showDialog(alertDialog$Builder.a);
                break;
            case 2:
                JSONObject jSONObject = (JSONObject) this.b;
                mk7 mk7Var = (mk7) this.c;
                ylb ylbVar2 = (ylb) this.d;
                if (gm.g(jSONObject.optString("text"))) {
                    new c41(mk7Var.F, ylbVar2).i(jb6.M0(2131742672, null)).j();
                    break;
                }
                break;
            case 3:
                k38 k38Var = (k38) this.b;
                long[] jArr = (long[]) this.c;
                my0 my0Var2 = (my0) this.d;
                k38Var.a(Long.valueOf(jArr[0]));
                my0Var2.dismiss();
                break;
            case 4:
                sa8 sa8Var = (sa8) this.b;
                Context context2 = (Context) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (!sa8Var.B1) {
                    Runnable runnable = sa8Var.K1;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                } else {
                    ln2 ln2Var = new ln2(context2, sa8Var.G1);
                    ln2Var.D0(sa8Var.A1.a, 2);
                    ln2Var.r1 = new ry((fla) sa8Var, (Object) bitmap, (byte) 5);
                    ln2Var.q1 = new vx5(sa8Var, (byte) 1);
                    ln2Var.show();
                    break;
                }
                break;
            case 5:
                f56 f56Var = (f56) this.b;
                my0 my0Var3 = (my0) this.c;
                d dVar2 = (d) this.d;
                try {
                    if (f56Var.b != null) {
                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", f56Var.b));
                        if (my0Var3 == null || (dy0Var = my0Var3.c) == null) {
                            c41.j(dVar2).j();
                        } else {
                            new c41(dy0Var, null).k(false).j();
                        }
                    }
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
                break;
            case 6:
                bj6 bj6Var = (bj6) this.b;
                bu5 bu5Var = (bu5) this.c;
                ub7 ub7Var = (ub7) this.d;
                bj6Var.getClass();
                bu5Var.u();
                int i = ub7Var.a;
                if (bj6Var.c.getCurrentPosition() == 0 && (nk3Var = bj6Var.J) != null) {
                    nk3Var.Q4(i);
                    break;
                } else {
                    if (bj6Var.J == null) {
                        bj6Var.n0(null);
                    }
                    bj6Var.I = Integer.valueOf(i);
                    bj6Var.o0(0, true);
                    bj6Var.c.E(0);
                    break;
                }
                break;
            case 7:
                f57 f57Var = (f57) this.b;
                k57 k57Var = (k57) this.c;
                k57 k57Var2 = (k57) this.d;
                l57 l57Var = f57Var.d0;
                o47 o47Var = l57Var.d;
                boolean z = o47Var.l;
                boolean z2 = !z;
                o47Var.l = z2;
                if (z) {
                    if (l57Var.y) {
                        o47Var.k = false;
                    }
                    l57Var.y = false;
                } else if (!o47Var.k) {
                    o47Var.k = true;
                    l57Var.y = true;
                }
                k57Var.a(z2, true);
                k57Var2.a(o47Var.k, true);
                f57Var.i();
                f57Var.l(true);
                break;
            case 8:
                u67 u67Var = (u67) this.b;
                ik.Q((Context) this.c, u67Var.w1, new cj6(u67Var, b), (ylb) this.d, 0).h1();
                break;
            case 9:
                my0[] my0VarArr = (my0[]) this.b;
                qac qacVar = (qac) this.c;
                String str = (String) this.d;
                my0 my0Var4 = my0VarArr[0];
                if (my0Var4 != null) {
                    my0Var4.dismiss();
                    my0VarArr[0] = null;
                    qacVar.a(str);
                    break;
                }
                break;
            case 10:
                b61 b61Var = (b61) this.b;
                my0[] my0VarArr2 = (my0[]) this.c;
                Runnable runnable2 = (Runnable) this.d;
                if (!b61Var.R && (my0Var = my0VarArr2[0]) != null) {
                    my0Var.dismiss();
                    my0VarArr2[0] = null;
                    runnable2.run();
                    break;
                }
                break;
            case 11:
                z8b z8bVar = (z8b) this.b;
                Context context3 = (Context) this.c;
                m58 m58Var = (m58) this.d;
                if (!z8bVar.r1) {
                    Runnable runnable3 = z8bVar.A1;
                    if (runnable3 != null) {
                        runnable3.run();
                        break;
                    }
                } else {
                    ln2 ln2Var2 = new ln2(context3, z8bVar.w1);
                    z8bVar.J1 = ln2Var2;
                    ln2Var2.D0(z8bVar.q1.a, 2);
                    ln2Var2.r1 = new ry((fla) z8bVar, (Object) m58Var, (byte) 6);
                    ln2Var2.q1 = new ad0(z8bVar, m58Var, b2);
                    ln2Var2.show();
                    break;
                }
                break;
            case 12:
                v48 v48Var = (v48) this.b;
                y7b y7bVar = (y7b) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                a58 a58Var = v48Var.x;
                a58Var.x0(y7bVar, storyItem);
                v48 v48Var2 = a58Var.j1;
                if (v48Var2 != null) {
                    v48Var2.a();
                    break;
                }
                break;
            case 13:
                v48 v48Var3 = (v48) this.b;
                a8 a8Var = (a8) this.c;
                oab oabVar = (oab) this.d;
                a8Var.performHapticFeedback(3);
                c41 Y = c41.Y();
                if (Y != null) {
                    Y.Q(R.raw.ic_save_to_gallery, 36, gm.N2(jb6.M0(2131745667, null), -1, 0, new a18(v48Var3, oabVar, b2), null)).j();
                    break;
                }
                break;
            case 14:
                ((i58) this.b).E0((TLRPC.ChatFull) this.c, (oc5) this.d);
                break;
            case 15:
                wb8 wb8Var = (wb8) this.b;
                Context context4 = (Context) this.c;
                ylb ylbVar3 = (ylb) this.d;
                xt4 xt4Var = wb8Var.h;
                if (xt4Var == null) {
                    xt4 xt4Var2 = new xt4(context4, ylbVar3, jb6.M0(2131743294, null), wb8Var.f);
                    wb8Var.h = xt4Var2;
                    xt4Var2.n(new q78(wb8Var, (byte) 12));
                    xt4Var = wb8Var.h;
                    xt4Var.p1 = wb8Var.n;
                }
                xt4Var.show();
                break;
            case 16:
                rs8 rs8Var = (rs8) this.b;
                bu5 bu5Var2 = (bu5) this.c;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.d;
                bu5Var2.u();
                lea leaVar = rs8Var.a;
                ks8 ks8Var = new ks8(rs8Var, savedStarGift, b4);
                HashMap hashMap = vs8.V;
                leaVar.h(ks8Var, null);
                break;
            case 17:
                pr2 pr2Var = (pr2) this.b;
                xk9 xk9Var = (xk9) this.c;
                ud9 ud9Var = (ud9) this.d;
                pr2Var.m();
                xk9Var.C(ud9Var);
                break;
            case 18:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.b;
                m8 m8Var = (m8) this.c;
                rr9 rr9Var = (rr9) this.d;
                m8Var.d(true);
                LongSparseArray l = saveToGallerySettingsActivity.getUserConfig().l(saveToGallerySettingsActivity.a);
                l.remove(rr9Var.d);
                saveToGallerySettingsActivity.getUserConfig().z(saveToGallerySettingsActivity.a, l);
                saveToGallerySettingsActivity.e0();
                break;
            case 19:
                ((j1a) this.b).a(view, (HashSet) this.c, (Runnable) this.d);
                break;
            case 20:
                t1a t1aVar = (t1a) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                bu5 bu5Var3 = (bu5) this.d;
                qv0 qv0Var = new qv0(t1aVar, b);
                i2a i2aVar = t1aVar.b;
                new az3(qv0Var, i2aVar.getContext(), i2aVar.s, arrayList).show();
                bu5Var3.u();
                break;
            case 21:
                uua uuaVar = (uua) this.b;
                final my0 my0Var5 = (my0) this.c;
                final b61 b61Var2 = (b61) this.d;
                my0Var5.c0 = false;
                b61Var2.setLoading(true);
                uuaVar.a(new qac() { // from class: kva
                    @Override // qac
                    public final void a(Object obj) {
                        byte b5 = b3;
                        final b61 b61Var3 = b61Var2;
                        final my0 my0Var6 = my0Var5;
                        Boolean bool = (Boolean) obj;
                        switch (b5) {
                            case 0:
                                if (!bool.booleanValue()) {
                                    final byte b6 = 0;
                                    gm.d3(new Runnable() { // from class: mva
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b7 = b6;
                                            b61 b61Var4 = b61Var3;
                                            my0 my0Var7 = my0Var6;
                                            switch (b7) {
                                                case 0:
                                                    my0Var7.c0 = false;
                                                    b61Var4.setLoading(false);
                                                    break;
                                                default:
                                                    my0Var7.c0 = false;
                                                    b61Var4.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    my0Var6.dismiss();
                                    break;
                                }
                            default:
                                if (!bool.booleanValue()) {
                                    final byte b7 = 1;
                                    gm.d3(new Runnable() { // from class: mva
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b72 = b7;
                                            b61 b61Var4 = b61Var3;
                                            my0 my0Var7 = my0Var6;
                                            switch (b72) {
                                                case 0:
                                                    my0Var7.c0 = false;
                                                    b61Var4.setLoading(false);
                                                    break;
                                                default:
                                                    my0Var7.c0 = false;
                                                    b61Var4.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    my0Var6.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 22:
                sua suaVar = (sua) this.b;
                final my0 my0Var6 = (my0) this.c;
                final b61 b61Var3 = (b61) this.d;
                my0Var6.c0 = false;
                b61Var3.setLoading(true);
                suaVar.a(new qac() { // from class: kva
                    @Override // qac
                    public final void a(Object obj) {
                        byte b5 = b4;
                        final b61 b61Var32 = b61Var3;
                        final my0 my0Var62 = my0Var6;
                        Boolean bool = (Boolean) obj;
                        switch (b5) {
                            case 0:
                                if (!bool.booleanValue()) {
                                    final byte b6 = 0;
                                    gm.d3(new Runnable() { // from class: mva
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b72 = b6;
                                            b61 b61Var4 = b61Var32;
                                            my0 my0Var7 = my0Var62;
                                            switch (b72) {
                                                case 0:
                                                    my0Var7.c0 = false;
                                                    b61Var4.setLoading(false);
                                                    break;
                                                default:
                                                    my0Var7.c0 = false;
                                                    b61Var4.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    my0Var62.dismiss();
                                    break;
                                }
                            default:
                                if (!bool.booleanValue()) {
                                    final byte b7 = 1;
                                    gm.d3(new Runnable() { // from class: mva
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b72 = b7;
                                            b61 b61Var4 = b61Var32;
                                            my0 my0Var7 = my0Var62;
                                            switch (b72) {
                                                case 0:
                                                    my0Var7.c0 = false;
                                                    b61Var4.setLoading(false);
                                                    break;
                                                default:
                                                    my0Var7.c0 = false;
                                                    b61Var4.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    my0Var62.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 23:
                p1c p1cVar = (p1c) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                hb6 hb6Var = (hb6) this.d;
                s1c s1cVar = p1cVar.n;
                Runnable runnable4 = runnableArr[0];
                if (runnable4 != null) {
                    runnable4.run();
                }
                String str2 = s1cVar.u1;
                r1c r1cVar = s1cVar.H1;
                if (!TextUtils.equals(str2, hb6Var.f)) {
                    View view2 = r1cVar.d;
                    if (view2 == s1cVar.y1 || view2 == s1cVar.s1) {
                        s1cVar.v1 = s1cVar.u1;
                    }
                    n1c n1cVar = p1cVar.e;
                    String str3 = hb6Var.f;
                    s1cVar.u1 = str3;
                    n1cVar.setText(s1c.E0(s1c.J0(str3, null, null)));
                    r1cVar.D(s1cVar.q1 != null ? s1cVar.r1 : s1cVar.x1);
                    s1c.O0(s1cVar.u1);
                    s1cVar.S0();
                    break;
                }
                break;
            case 24:
                zs1 zs1Var = (zs1) this.b;
                b3c b3cVar = (b3c) this.c;
                m8 m8Var2 = (m8) this.d;
                long j = zs1Var.b;
                b3cVar.J(j, true, false);
                TLRPC.Chat L0 = oc7.r1(zs1Var.a).L0(Long.valueOf(-j));
                c41.b0(zs1Var.c).K(R.raw.msg_translate, gm.S2(L0 != null ? sd2.V(L0) ? jb6.M0(2131743637, null) : jb6.M0(2131743635, null) : jb6.M0(2131743636, null)), jb6.M0(2131743572, null), new b7b((Object) zs1Var, (Object) b3cVar, (byte) 28)).j();
                m8Var2.d(true);
                break;
            case 25:
                ((goc) this.b).y0((Context) this.c, (zja) this.d, view);
                break;
            case 26:
                c cVar = (c) this.b;
                TL_wallet.currencyRate currencyrate = (TL_wallet.currencyRate) this.c;
                bu5 bu5Var4 = (bu5) this.d;
                l53 l53Var = cVar.h;
                String str4 = currencyrate.currency;
                if (!TextUtils.equals(l53Var.f, str4)) {
                    l53Var.f = str4;
                    try {
                        a.b.getSharedPreferences("gram_wallet", 0).edit().putString("currency", l53Var.g()).apply();
                    } catch (Exception e2) {
                        fc4.e("[gram-wallet] failed to save currency prefs", e2);
                    }
                    l53Var.b.S();
                }
                bu5Var4.u();
                break;
            default:
                zqc zqcVar = (zqc) this.b;
                he[] heVarArr = (he[]) this.c;
                Runnable runnable5 = (Runnable) this.d;
                heVarArr[0].dismiss();
                gm.g(zqcVar.s);
                runnable5.run();
                break;
        }
    }
}
