// default package

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lw4 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lw4(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ex0 ex0Var;
        uj3 uj3Var;
        nx0 nx0Var;
        byte b = 3;
        byte b2 = 11;
        final byte b3 = 1;
        final byte b4 = 0;
        switch (this.a) {
            case 0:
                ow4 ow4Var = (ow4) this.b;
                Context context = (Context) this.c;
                vnb vnbVar = (vnb) this.d;
                if (ow4Var.A1.a == pj.a) {
                    new eza(context, vnbVar).show();
                    break;
                }
                break;
            case 1:
                yx4 yx4Var = (yx4) this.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                qc9 qc9Var = (qc9) this.d;
                e Q = LaunchActivity.Q();
                if (Q != null) {
                    fu5 G = fu5.G(frameLayout, yx4Var.J0, qc9Var);
                    qc9Var.b(G, new gx4(Q, b4), new re4(yx4Var, qc9Var, G, b2));
                    break;
                }
                break;
            case 2:
                by4 by4Var = (by4) this.b;
                Activity activity = (Activity) this.c;
                e eVar = (e) this.d;
                by4Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                alertDialog$Builder.a.S = ob6.M0(2131749332, null);
                alertDialog$Builder.a.U = hl.S2(ob6.M0(2131749333, null));
                alertDialog$Builder.j(ob6.M0(2131749334, null), new lu3(by4Var, (byte) 29));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                eVar.showDialog(alertDialog$Builder.a);
                break;
            case 3:
                JSONObject jSONObject = (JSONObject) this.b;
                tk7 tk7Var = (tk7) this.c;
                vnb vnbVar2 = (vnb) this.d;
                if (hl.g(jSONObject.optString("text"))) {
                    new d31(tk7Var.F, vnbVar2).i(ob6.M0(2131742640, null)).j();
                    break;
                }
                break;
            case 4:
                b58 b58Var = (b58) this.b;
                long[] jArr = (long[]) this.c;
                nx0 nx0Var2 = (nx0) this.d;
                b58Var.a(Long.valueOf(jArr[0]));
                nx0Var2.dismiss();
                break;
            case 5:
                hc8 hc8Var = (hc8) this.b;
                Context context2 = (Context) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (!hc8Var.v1) {
                    Runnable runnable = hc8Var.E1;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                } else {
                    sm2 sm2Var = new sm2(context2, hc8Var.A1);
                    sm2Var.E0(hc8Var.u1.a, 2);
                    sm2Var.r1 = new rx((xma) hc8Var, (Object) bitmap, (byte) 6);
                    sm2Var.q1 = new ay5(hc8Var, (byte) 1);
                    sm2Var.show();
                    break;
                }
                break;
            case 6:
                i56 i56Var = (i56) this.b;
                nx0 nx0Var3 = (nx0) this.c;
                e eVar2 = (e) this.d;
                try {
                    if (i56Var.b != null) {
                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", i56Var.b));
                        if (nx0Var3 == null || (ex0Var = nx0Var3.c) == null) {
                            d31.j(eVar2).j();
                        } else {
                            new d31(ex0Var, null).k(false).j();
                        }
                    }
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
                break;
            case 7:
                fj6 fj6Var = (fj6) this.b;
                fu5 fu5Var = (fu5) this.c;
                ac7 ac7Var = (ac7) this.d;
                fj6Var.getClass();
                fu5Var.u();
                int i = ac7Var.a;
                if (fj6Var.c.getCurrentPosition() == 0 && (uj3Var = fj6Var.M) != null) {
                    uj3Var.Q4(i);
                    break;
                } else {
                    if (fj6Var.M == null) {
                        fj6Var.s0(null);
                    }
                    fj6Var.L = Integer.valueOf(i);
                    fj6Var.t0(0, true);
                    fj6Var.c.F(0);
                    break;
                }
                break;
            case 8:
                m57 m57Var = (m57) this.b;
                r57 r57Var = (r57) this.c;
                r57 r57Var2 = (r57) this.d;
                s57 s57Var = m57Var.d0;
                v47 v47Var = s57Var.d;
                boolean z = v47Var.l;
                boolean z2 = !z;
                v47Var.l = z2;
                if (z) {
                    if (s57Var.y) {
                        v47Var.k = false;
                    }
                    s57Var.y = false;
                } else if (!v47Var.k) {
                    v47Var.k = true;
                    s57Var.y = true;
                }
                r57Var.a(z2, true);
                r57Var2.a(v47Var.k, true);
                m57Var.i();
                m57Var.l(true);
                break;
            case 9:
                a77 a77Var = (a77) this.b;
                jj.Q((Context) this.c, a77Var.w1, new bm6(a77Var, (byte) 12), (vnb) this.d, 0).o1();
                break;
            case 10:
                nx0[] nx0VarArr = (nx0[]) this.b;
                pcc pccVar = (pcc) this.c;
                String str = (String) this.d;
                nx0 nx0Var4 = nx0VarArr[0];
                if (nx0Var4 != null) {
                    nx0Var4.dismiss();
                    nx0VarArr[0] = null;
                    pccVar.a(str);
                    break;
                }
                break;
            case 11:
                c51 c51Var = (c51) this.b;
                nx0[] nx0VarArr2 = (nx0[]) this.c;
                Runnable runnable2 = (Runnable) this.d;
                if (!c51Var.R && (nx0Var = nx0VarArr2[0]) != null) {
                    nx0Var.dismiss();
                    nx0VarArr2[0] = null;
                    runnable2.run();
                    break;
                }
                break;
            case 12:
                wab wabVar = (wab) this.b;
                Context context3 = (Context) this.c;
                a78 a78Var = (a78) this.d;
                if (!wabVar.l1) {
                    Runnable runnable3 = wabVar.u1;
                    if (runnable3 != null) {
                        runnable3.run();
                        break;
                    }
                } else {
                    sm2 sm2Var2 = new sm2(context3, wabVar.q1);
                    wabVar.D1 = sm2Var2;
                    sm2Var2.E0(wabVar.k1.a, 2);
                    sm2Var2.r1 = new rx((xma) wabVar, (Object) a78Var, (byte) 7);
                    sm2Var2.q1 = new cc0(wabVar, a78Var, b);
                    sm2Var2.show();
                    break;
                }
                break;
            case 13:
                j68 j68Var = (j68) this.b;
                u9b u9bVar = (u9b) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                o68 o68Var = j68Var.x;
                o68Var.x0(u9bVar, storyItem);
                j68 j68Var2 = o68Var.d1;
                if (j68Var2 != null) {
                    j68Var2.a();
                    break;
                }
                break;
            case 14:
                j68 j68Var3 = (j68) this.b;
                b8 b8Var = (b8) this.c;
                lcb lcbVar = (lcb) this.d;
                b8Var.performHapticFeedback(3);
                d31 Y = d31.Y();
                if (Y != null) {
                    Y.Q(R.raw.ic_save_to_gallery, 36, hl.N2(ob6.M0(2131745661, null), -1, 0, new a58(j68Var3, lcbVar, b3), null)).j();
                    break;
                }
                break;
            case 15:
                ((w68) this.b).F0((TLRPC.ChatFull) this.c, (rc5) this.d);
                break;
            case 16:
                ld8 ld8Var = (ld8) this.b;
                Context context4 = (Context) this.c;
                vnb vnbVar3 = (vnb) this.d;
                au4 au4Var = ld8Var.h;
                if (au4Var == null) {
                    au4 au4Var2 = new au4(context4, vnbVar3, ob6.M0(2131743262, null), ld8Var.f);
                    ld8Var.h = au4Var2;
                    au4Var2.n(new x38(ld8Var, (byte) 20));
                    au4Var = ld8Var.h;
                    au4Var.p1 = ld8Var.n;
                }
                au4Var.show();
                break;
            case 17:
                au8 au8Var = (au8) this.b;
                fu5 fu5Var2 = (fu5) this.c;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.d;
                fu5Var2.u();
                cga cgaVar = au8Var.a;
                tt8 tt8Var = new tt8(au8Var, savedStarGift, b4);
                HashMap hashMap = eu8.V;
                cgaVar.h(tt8Var, null);
                break;
            case 18:
                xq2 xq2Var = (xq2) this.b;
                km9 km9Var = (km9) this.c;
                kf9 kf9Var = (kf9) this.d;
                xq2Var.n();
                km9Var.C(kf9Var);
                break;
            case 19:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.b;
                n8 n8Var = (n8) this.c;
                it9 it9Var = (it9) this.d;
                n8Var.d(true);
                LongSparseArray l = saveToGallerySettingsActivity.getUserConfig().l(saveToGallerySettingsActivity.a);
                l.remove(it9Var.d);
                saveToGallerySettingsActivity.getUserConfig().z(saveToGallerySettingsActivity.a, l);
                saveToGallerySettingsActivity.d0();
                break;
            case 20:
                ((b3a) this.b).a(view, (HashSet) this.c, (Runnable) this.d);
                break;
            case 21:
                l3a l3aVar = (l3a) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                fu5 fu5Var3 = (fu5) this.d;
                qu0 qu0Var = new qu0(l3aVar, b2);
                z3a z3aVar = l3aVar.b;
                new ly3(qu0Var, z3aVar.getContext(), z3aVar.s, arrayList).show();
                fu5Var3.u();
                break;
            case 22:
                wwa wwaVar = (wwa) this.b;
                final nx0 nx0Var5 = (nx0) this.c;
                final c51 c51Var2 = (c51) this.d;
                nx0Var5.c0 = false;
                c51Var2.setLoading(true);
                wwaVar.a(new pcc() { // from class: kxa
                    @Override // pcc
                    public final void a(Object obj) {
                        byte b5 = b3;
                        final c51 c51Var3 = c51Var2;
                        final nx0 nx0Var6 = nx0Var5;
                        Boolean bool = (Boolean) obj;
                        switch (b5) {
                            case 0:
                                if (!bool.booleanValue()) {
                                    final byte b6 = 0;
                                    hl.d3(new Runnable() { // from class: mxa
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b7 = b6;
                                            c51 c51Var4 = c51Var3;
                                            nx0 nx0Var7 = nx0Var6;
                                            switch (b7) {
                                                case 0:
                                                    nx0Var7.c0 = false;
                                                    c51Var4.setLoading(false);
                                                    break;
                                                default:
                                                    nx0Var7.c0 = false;
                                                    c51Var4.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    nx0Var6.dismiss();
                                    break;
                                }
                            default:
                                if (!bool.booleanValue()) {
                                    final byte b7 = 1;
                                    hl.d3(new Runnable() { // from class: mxa
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b72 = b7;
                                            c51 c51Var4 = c51Var3;
                                            nx0 nx0Var7 = nx0Var6;
                                            switch (b72) {
                                                case 0:
                                                    nx0Var7.c0 = false;
                                                    c51Var4.setLoading(false);
                                                    break;
                                                default:
                                                    nx0Var7.c0 = false;
                                                    c51Var4.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    nx0Var6.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 23:
                twa twaVar = (twa) this.b;
                final nx0 nx0Var6 = (nx0) this.c;
                final c51 c51Var3 = (c51) this.d;
                nx0Var6.c0 = false;
                c51Var3.setLoading(true);
                twaVar.a(new pcc() { // from class: kxa
                    @Override // pcc
                    public final void a(Object obj) {
                        byte b5 = b4;
                        final c51 c51Var32 = c51Var3;
                        final nx0 nx0Var62 = nx0Var6;
                        Boolean bool = (Boolean) obj;
                        switch (b5) {
                            case 0:
                                if (!bool.booleanValue()) {
                                    final byte b6 = 0;
                                    hl.d3(new Runnable() { // from class: mxa
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b72 = b6;
                                            c51 c51Var4 = c51Var32;
                                            nx0 nx0Var7 = nx0Var62;
                                            switch (b72) {
                                                case 0:
                                                    nx0Var7.c0 = false;
                                                    c51Var4.setLoading(false);
                                                    break;
                                                default:
                                                    nx0Var7.c0 = false;
                                                    c51Var4.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    nx0Var62.dismiss();
                                    break;
                                }
                            default:
                                if (!bool.booleanValue()) {
                                    final byte b7 = 1;
                                    hl.d3(new Runnable() { // from class: mxa
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b72 = b7;
                                            c51 c51Var4 = c51Var32;
                                            nx0 nx0Var7 = nx0Var62;
                                            switch (b72) {
                                                case 0:
                                                    nx0Var7.c0 = false;
                                                    c51Var4.setLoading(false);
                                                    break;
                                                default:
                                                    nx0Var7.c0 = false;
                                                    c51Var4.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    nx0Var62.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 24:
                o3c o3cVar = (o3c) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                mb6 mb6Var = (mb6) this.d;
                r3c r3cVar = o3cVar.n;
                Runnable runnable4 = runnableArr[0];
                if (runnable4 != null) {
                    runnable4.run();
                }
                String str2 = r3cVar.u1;
                q3c q3cVar = r3cVar.H1;
                if (!TextUtils.equals(str2, mb6Var.f)) {
                    View view2 = q3cVar.d;
                    if (view2 == r3cVar.y1 || view2 == r3cVar.s1) {
                        r3cVar.v1 = r3cVar.u1;
                    }
                    m3c m3cVar = o3cVar.e;
                    String str3 = mb6Var.f;
                    r3cVar.u1 = str3;
                    m3cVar.setText(r3c.F0(r3c.K0(str3, null, null)));
                    q3cVar.D(r3cVar.q1 != null ? r3cVar.r1 : r3cVar.x1);
                    r3c.P0(r3cVar.u1);
                    r3cVar.T0();
                    break;
                }
                break;
            case 25:
                as1 as1Var = (as1) this.b;
                a5c a5cVar = (a5c) this.c;
                n8 n8Var2 = (n8) this.d;
                long j = as1Var.b;
                a5cVar.J(j, true, false);
                TLRPC.Chat M0 = uc7.s1(as1Var.a).M0(Long.valueOf(-j));
                d31.b0(as1Var.c).K(R.raw.msg_translate, hl.S2(M0 != null ? xc2.V(M0) ? ob6.M0(2131743605, null) : ob6.M0(2131743603, null) : ob6.M0(2131743604, null)), ob6.M0(2131743540, null), new hab((Object) as1Var, (Object) a5cVar, (byte) 24)).j();
                n8Var2.d(true);
                break;
            case 26:
                ((uqc) this.b).y0((Context) this.c, (sla) this.d, view);
                break;
            case 27:
                c cVar = (c) this.b;
                TL_wallet.currencyRate currencyrate = (TL_wallet.currencyRate) this.c;
                fu5 fu5Var4 = (fu5) this.d;
                s43 s43Var = cVar.h;
                String str4 = currencyrate.currency;
                if (!TextUtils.equals(s43Var.f, str4)) {
                    s43Var.f = str4;
                    try {
                        a.b.getSharedPreferences("gram_wallet", 0).edit().putString("currency", s43Var.g()).apply();
                    } catch (Exception e2) {
                        cc4.e("[gram-wallet] failed to save currency prefs", e2);
                    }
                    s43Var.b.T();
                }
                fu5Var4.u();
                break;
            default:
                ktc ktcVar = (ktc) this.b;
                id[] idVarArr = (id[]) this.c;
                Runnable runnable5 = (Runnable) this.d;
                idVarArr[0].dismiss();
                hl.g(ktcVar.s);
                runnable5.run();
                break;
        }
    }
}
