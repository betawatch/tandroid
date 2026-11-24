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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class hu4 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hu4(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ww0 ww0Var;
        cj3 cj3Var;
        fx0 fx0Var;
        byte b = 3;
        byte b2 = 5;
        byte b3 = 2;
        final byte b4 = 1;
        final byte b5 = 0;
        switch (this.a) {
            case 0:
                lu4 lu4Var = (lu4) this.b;
                Context context = (Context) this.c;
                wjb wjbVar = (wjb) this.d;
                if (lu4Var.A1.a == oj.a) {
                    new ava(context, wjbVar).show();
                    break;
                }
                break;
            case 1:
                wv4 wv4Var = (wv4) this.b;
                Activity activity = (Activity) this.c;
                d dVar = (d) this.d;
                wv4Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                alertDialog$Builder.a.S = k96.M0(2131749386, null);
                alertDialog$Builder.a.U = gl.S2(k96.M0(2131749387, null));
                alertDialog$Builder.j(k96.M0(2131749388, null), new kx3(wv4Var, (byte) 27));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                dVar.showDialog(alertDialog$Builder.a);
                break;
            case 2:
                JSONObject jSONObject = (JSONObject) this.b;
                ki7 ki7Var = (ki7) this.c;
                wjb wjbVar2 = (wjb) this.d;
                if (gl.g(jSONObject.optString("text"))) {
                    new u21(ki7Var.F, wjbVar2).i(k96.M0(2131742746, null)).j();
                    break;
                }
                break;
            case 3:
                i18 i18Var = (i18) this.b;
                long[] jArr = (long[]) this.c;
                fx0 fx0Var2 = (fx0) this.d;
                i18Var.a(Long.valueOf(jArr[0]));
                fx0Var2.dismiss();
                break;
            case 4:
                q88 q88Var = (q88) this.b;
                Context context2 = (Context) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (!q88Var.B1) {
                    Runnable runnable = q88Var.K1;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                } else {
                    yl2 yl2Var = new yl2(context2, q88Var.G1);
                    yl2Var.D0(q88Var.A1.a, 2);
                    yl2Var.r1 = new qx(q88Var, bitmap, b2);
                    yl2Var.q1 = new vv5(q88Var, (byte) 1);
                    yl2Var.show();
                    break;
                }
                break;
            case 5:
                f36 f36Var = (f36) this.b;
                fx0 fx0Var3 = (fx0) this.c;
                d dVar2 = (d) this.d;
                try {
                    if (f36Var.b != null) {
                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", f36Var.b));
                        if (fx0Var3 == null || (ww0Var = fx0Var3.c) == null) {
                            u21.j(dVar2).j();
                        } else {
                            new u21(ww0Var, null).k(false).j();
                        }
                    }
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
                break;
            case 6:
                ah6 ah6Var = (ah6) this.b;
                cs5 cs5Var = (cs5) this.c;
                t97 t97Var = (t97) this.d;
                ah6Var.getClass();
                cs5Var.u();
                int i = t97Var.a;
                if (ah6Var.c.getCurrentPosition() == 0 && (cj3Var = ah6Var.K) != null) {
                    cj3Var.M4(i);
                    break;
                } else {
                    if (ah6Var.K == null) {
                        ah6Var.q0(null);
                    }
                    ah6Var.J = Integer.valueOf(i);
                    ah6Var.r0(0, true);
                    ah6Var.c.E(0);
                    break;
                }
                break;
            case 7:
                f37 f37Var = (f37) this.b;
                k37 k37Var = (k37) this.c;
                k37 k37Var2 = (k37) this.d;
                l37 l37Var = f37Var.d0;
                o27 o27Var = l37Var.d;
                boolean z = o27Var.l;
                boolean z2 = !z;
                o27Var.l = z2;
                if (z) {
                    if (l37Var.y) {
                        o27Var.k = false;
                    }
                    l37Var.y = false;
                } else if (!o27Var.k) {
                    o27Var.k = true;
                    l37Var.y = true;
                }
                k37Var.a(z2, true);
                k37Var2.a(o27Var.k, true);
                f37Var.i();
                f37Var.l(true);
                break;
            case 8:
                t47 t47Var = (t47) this.b;
                ij.Q((Context) this.c, t47Var.w1, new im6(t47Var, (byte) 8), (wjb) this.d, 0).M2();
                break;
            case 9:
                fx0[] fx0VarArr = (fx0[]) this.b;
                p8c p8cVar = (p8c) this.c;
                String str = (String) this.d;
                fx0 fx0Var4 = fx0VarArr[0];
                if (fx0Var4 != null) {
                    fx0Var4.dismiss();
                    fx0VarArr[0] = null;
                    p8cVar.a(str);
                    break;
                }
                break;
            case 10:
                u41 u41Var = (u41) this.b;
                fx0[] fx0VarArr2 = (fx0[]) this.c;
                Runnable runnable2 = (Runnable) this.d;
                if (!u41Var.R && (fx0Var = fx0VarArr2[0]) != null) {
                    fx0Var.dismiss();
                    fx0VarArr2[0] = null;
                    runnable2.run();
                    break;
                }
                break;
            case 11:
                x6b x6bVar = (x6b) this.b;
                Context context3 = (Context) this.c;
                k38 k38Var = (k38) this.d;
                if (!x6bVar.r1) {
                    Runnable runnable3 = x6bVar.A1;
                    if (runnable3 != null) {
                        runnable3.run();
                        break;
                    }
                } else {
                    yl2 yl2Var2 = new yl2(context3, x6bVar.w1);
                    x6bVar.J1 = yl2Var2;
                    yl2Var2.D0(x6bVar.q1.a, 2);
                    yl2Var2.r1 = new qx((dja) x6bVar, (Object) k38Var, (byte) 6);
                    yl2Var2.q1 = new ac0(x6bVar, k38Var, b);
                    yl2Var2.show();
                    break;
                }
                break;
            case 12:
                s28 s28Var = (s28) this.b;
                w5b w5bVar = (w5b) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                y28 y28Var = s28Var.x;
                y28Var.x0(w5bVar, storyItem);
                s28 s28Var2 = y28Var.j1;
                if (s28Var2 != null) {
                    s28Var2.a();
                    break;
                }
                break;
            case 13:
                s28 s28Var3 = (s28) this.b;
                a8 a8Var = (a8) this.c;
                m8b m8bVar = (m8b) this.d;
                a8Var.performHapticFeedback(3);
                u21 Y = u21.Y();
                if (Y != null) {
                    Y.Q(R.raw.ic_save_to_gallery, 36, gl.N2(k96.M0(2131745741, null), -1, 0, new h18(s28Var3, m8bVar, b3), null)).j();
                    break;
                }
                break;
            case 14:
                ((g38) this.b).E0((TLRPC.ChatFull) this.c, (qa5) this.d);
                break;
            case 15:
                v98 v98Var = (v98) this.b;
                Context context4 = (Context) this.c;
                wjb wjbVar3 = (wjb) this.d;
                wr4 wr4Var = v98Var.h;
                if (wr4Var == null) {
                    wr4 wr4Var2 = new wr4(context4, wjbVar3, k96.M0(2131743368, null), v98Var.f);
                    v98Var.h = wr4Var2;
                    wr4Var2.n(new w88(v98Var, b2));
                    wr4Var = v98Var.h;
                    wr4Var.p1 = v98Var.n;
                }
                wr4Var.show();
                break;
            case 16:
                pq8 pq8Var = (pq8) this.b;
                cs5 cs5Var2 = (cs5) this.c;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.d;
                cs5Var2.u();
                lca lcaVar = pq8Var.a;
                hq8 hq8Var = new hq8(pq8Var, savedStarGift, b5);
                HashMap hashMap = tq8.V;
                lcaVar.h(hq8Var, null);
                break;
            case 17:
                eq2 eq2Var = (eq2) this.b;
                wi9 wi9Var = (wi9) this.c;
                ub9 ub9Var = (ub9) this.d;
                eq2Var.n();
                wi9Var.C(ub9Var);
                break;
            case 18:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.b;
                m8 m8Var = (m8) this.c;
                qp9 qp9Var = (qp9) this.d;
                m8Var.d(true);
                LongSparseArray l = saveToGallerySettingsActivity.getUserConfig().l(saveToGallerySettingsActivity.a);
                l.remove(qp9Var.d);
                saveToGallerySettingsActivity.getUserConfig().z(saveToGallerySettingsActivity.a, l);
                saveToGallerySettingsActivity.d0();
                break;
            case 19:
                ((hz9) this.b).a(view, (HashSet) this.c, (Runnable) this.d);
                break;
            case 20:
                rz9 rz9Var = (rz9) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                cs5 cs5Var3 = (cs5) this.d;
                hu0 hu0Var = new hu0(rz9Var, (byte) 11);
                g0a g0aVar = rz9Var.b;
                new qx3(hu0Var, g0aVar.getContext(), g0aVar.s, arrayList).show();
                cs5Var3.u();
                break;
            case 21:
                ssa ssaVar = (ssa) this.b;
                final fx0 fx0Var5 = (fx0) this.c;
                final u41 u41Var2 = (u41) this.d;
                fx0Var5.c0 = false;
                u41Var2.setLoading(true);
                ssaVar.a(new p8c() { // from class: hta
                    @Override // p8c
                    public final void a(Object obj) {
                        byte b6 = b4;
                        final u41 u41Var3 = u41Var2;
                        final fx0 fx0Var6 = fx0Var5;
                        Boolean bool = (Boolean) obj;
                        switch (b6) {
                            case 0:
                                if (!bool.booleanValue()) {
                                    final byte b7 = 0;
                                    gl.d3(new Runnable() { // from class: jta
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b8 = b7;
                                            u41 u41Var4 = u41Var3;
                                            fx0 fx0Var7 = fx0Var6;
                                            switch (b8) {
                                                case 0:
                                                    fx0Var7.c0 = false;
                                                    u41Var4.setLoading(false);
                                                    break;
                                                default:
                                                    fx0Var7.c0 = false;
                                                    u41Var4.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    fx0Var6.dismiss();
                                    break;
                                }
                            default:
                                if (!bool.booleanValue()) {
                                    final byte b8 = 1;
                                    gl.d3(new Runnable() { // from class: jta
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b82 = b8;
                                            u41 u41Var4 = u41Var3;
                                            fx0 fx0Var7 = fx0Var6;
                                            switch (b82) {
                                                case 0:
                                                    fx0Var7.c0 = false;
                                                    u41Var4.setLoading(false);
                                                    break;
                                                default:
                                                    fx0Var7.c0 = false;
                                                    u41Var4.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    fx0Var6.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 22:
                qsa qsaVar = (qsa) this.b;
                final fx0 fx0Var6 = (fx0) this.c;
                final u41 u41Var3 = (u41) this.d;
                fx0Var6.c0 = false;
                u41Var3.setLoading(true);
                qsaVar.a(new p8c() { // from class: hta
                    @Override // p8c
                    public final void a(Object obj) {
                        byte b6 = b5;
                        final u41 u41Var32 = u41Var3;
                        final fx0 fx0Var62 = fx0Var6;
                        Boolean bool = (Boolean) obj;
                        switch (b6) {
                            case 0:
                                if (!bool.booleanValue()) {
                                    final byte b7 = 0;
                                    gl.d3(new Runnable() { // from class: jta
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b82 = b7;
                                            u41 u41Var4 = u41Var32;
                                            fx0 fx0Var7 = fx0Var62;
                                            switch (b82) {
                                                case 0:
                                                    fx0Var7.c0 = false;
                                                    u41Var4.setLoading(false);
                                                    break;
                                                default:
                                                    fx0Var7.c0 = false;
                                                    u41Var4.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    fx0Var62.dismiss();
                                    break;
                                }
                            default:
                                if (!bool.booleanValue()) {
                                    final byte b8 = 1;
                                    gl.d3(new Runnable() { // from class: jta
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b82 = b8;
                                            u41 u41Var4 = u41Var32;
                                            fx0 fx0Var7 = fx0Var62;
                                            switch (b82) {
                                                case 0:
                                                    fx0Var7.c0 = false;
                                                    u41Var4.setLoading(false);
                                                    break;
                                                default:
                                                    fx0Var7.c0 = false;
                                                    u41Var4.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    fx0Var62.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 23:
                ozb ozbVar = (ozb) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                i96 i96Var = (i96) this.d;
                rzb rzbVar = ozbVar.n;
                Runnable runnable4 = runnableArr[0];
                if (runnable4 != null) {
                    runnable4.run();
                }
                String str2 = rzbVar.u1;
                qzb qzbVar = rzbVar.H1;
                if (!TextUtils.equals(str2, i96Var.f)) {
                    View view2 = qzbVar.d;
                    if (view2 == rzbVar.y1 || view2 == rzbVar.s1) {
                        rzbVar.v1 = rzbVar.u1;
                    }
                    mzb mzbVar = ozbVar.e;
                    String str3 = i96Var.f;
                    rzbVar.u1 = str3;
                    mzbVar.setText(rzb.E0(rzb.J0(str3, null, null)));
                    qzbVar.D(rzbVar.q1 != null ? rzbVar.r1 : rzbVar.x1);
                    rzb.O0(rzbVar.u1);
                    rzbVar.S0();
                    break;
                }
                break;
            case 24:
                mr1 mr1Var = (mr1) this.b;
                b1c b1cVar = (b1c) this.c;
                m8 m8Var2 = (m8) this.d;
                long j = mr1Var.b;
                b1cVar.J(j, true, false);
                TLRPC.Chat K0 = na7.q1(mr1Var.a).K0(Long.valueOf(-j));
                u21.b0(mr1Var.c).K(R.raw.msg_translate, gl.S2(K0 != null ? hc2.V(K0) ? k96.M0(2131743711, null) : k96.M0(2131743709, null) : k96.M0(2131743710, null)), k96.M0(2131743646, null), new a5b((Object) mr1Var, (Object) b1cVar, (byte) 26)).j();
                m8Var2.d(true);
                break;
            case 25:
                ((hmc) this.b).x0((Context) this.c, (xha) this.d, view);
                break;
            case 26:
                c cVar = (c) this.b;
                TL_wallet.currencyRate currencyrate = (TL_wallet.currencyRate) this.c;
                cs5 cs5Var4 = (cs5) this.d;
                a43 a43Var = cVar.h;
                String str4 = currencyrate.currency;
                if (!TextUtils.equals(a43Var.f, str4)) {
                    a43Var.f = str4;
                    try {
                        a.b.getSharedPreferences("gram_wallet", 0).edit().putString("currency", a43Var.g()).apply();
                    } catch (Exception e2) {
                        fa4.e("[gram-wallet] failed to save currency prefs", e2);
                    }
                    a43Var.b.S();
                }
                cs5Var4.u();
                break;
            default:
                xoc xocVar = (xoc) this.b;
                hd[] hdVarArr = (hd[]) this.c;
                Runnable runnable5 = (Runnable) this.d;
                hdVarArr[0].dismiss();
                gl.g(xocVar.s);
                runnable5.run();
                break;
        }
    }
}
