package org.telegram.ui.Wallet;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.ri;
import org.telegram.messenger.w10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o01;
import org.telegram.ui.iy0;
import org.telegram.ui.yi0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class e9 extends d51 implements fs {
    public final ArrayList e = new ArrayList();
    public boolean f;

    public static void d0(e9 e9Var, Boolean bool) {
        v0 D = v0.D(e9Var.currentAccount);
        if (bool.booleanValue()) {
            boolean z10 = org.telegram.messenger.s2.a;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e9Var.getParentActivity(), e9Var.getResourceProvider());
        alertDialog$Builder.a.S = gd.N0(2131742759, null);
        alertDialog$Builder.k(gd.N0(2131742900, null), new y8(e9Var, bool, D, 0));
        alertDialog$Builder.h(gd.N0(2131742840, null), new yi0(27, e9Var, bool));
        alertDialog$Builder.p();
    }

    public static void e0(e9 e9Var) {
        o6.N0(e9Var.currentAccount, e9Var.getParentActivity(), e9Var.getResourceProvider());
    }

    public static void f0(e9 e9Var, w10 w10Var, a1 a1Var, s0 s0Var) {
        if (s0Var == null) {
            w10Var.a("STORAGE_FAILED");
            return;
        }
        w10Var.a(null);
        ArrayList f10 = s0Var.f();
        Activity parentActivity = e9Var.getParentActivity();
        org.telegram.ui.ActionBar.i6 i6Var = e9Var.resourceProvider;
        boolean z10 = org.telegram.messenger.s2.a;
        k0(parentActivity, f10, i6Var, new r(15, e9Var, a1Var));
    }

    public static void g0(e9 e9Var, w10 w10Var, s0 s0Var, String str) {
        if (str != null) {
            w10Var.a(str);
        } else if (s0Var == null) {
            w10Var.a("WORDS_NULL");
        } else {
            w10Var.a(null);
            k0(e9Var.getParentActivity(), s0Var.f(), e9Var.resourceProvider, null);
        }
    }

    public static void h0(e9 e9Var, w10 w10Var) {
        v0.D(e9Var.currentAccount).F(true, false, false, new f0(6, e9Var, w10Var));
    }

    public static LinearLayout i0(Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7, String str) {
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
        g10.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(i7);
        g10.addView(imageView, c8.na.t(28, 28, 16, 0, 0, 14, 0));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
        textView.setText(org.telegram.messenger.g0.W2(str));
        g10.addView(textView, c8.na.p(-1, -2, 1.0f, 16));
        return g10;
    }

    public static LinearLayout j0(int i7, int i10, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.i6 i6Var) {
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        int i11 = i7;
        while (i11 < i10) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            TextView textView = new TextView(context);
            textView.setTextSize(1, 15.0f);
            textView.setGravity(8388613);
            textView.setIncludeFontPadding(false);
            textView.setLineSpacing(0.0f, 1.0f);
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.z6, i6Var);
            StringBuilder sb2 = new StringBuilder();
            int i12 = i11 + 1;
            sb2.append(i12);
            sb2.append(".");
            textView.setText(sb2.toString());
            TextView f10 = m10.f(linearLayout, textView, c8.na.t(26, -2, 8388613, 0, 0, 6, 0), context);
            f10.setTextSize(1, 15.0f);
            f10.setTypeface(org.telegram.messenger.g0.o());
            f10.setIncludeFontPadding(false);
            f10.setLineSpacing(0.0f, 1.0f);
            org.telegram.ui.ActionBar.u6.U(f10, org.telegram.ui.ActionBar.n6.G6, i6Var);
            f10.setText((CharSequence) arrayList.get(i11));
            linearLayout.addView(f10, c8.na.o(-2, -2));
            g10.addView(linearLayout, c8.na.t(-2, -2, 8388611, 0, i11 != i7 ? 10 : 0, 0, 0));
            i11 = i12;
        }
        return g10;
    }

    public static void k0(Activity activity, ArrayList arrayList, org.telegram.ui.ActionBar.i6 i6Var, r rVar) {
        org.telegram.ui.ActionBar.w2 w2Var;
        int i7 = 1;
        org.telegram.ui.ActionBar.w2 j3 = m10.j(activity, false, 1, i6Var);
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(24.0f), 0, 0);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(activity);
        p9Var.setAspectFit(true);
        p9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        ri.d0(org.telegram.messenger.g0.t0()).h2(p9Var, "RestrictedEmoji", "📝", "100_100");
        linearLayout.addView(p9Var, c8.na.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        m10.r(textView, org.telegram.ui.ActionBar.n6.G6, i6Var, null, 2131742684);
        linearLayout.addView(textView, c8.na.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        m10.r(textView2, org.telegram.ui.ActionBar.n6.z6, i6Var, null, 2131742766);
        textView2.setMaxWidth(org.telegram.messenger.g0.L(330.0f));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), 0);
        textView2.setGravity(1);
        linearLayout.addView(textView2, c8.na.r(-2, -2, 1));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(1);
        int size = (arrayList.size() + 1) / 2;
        LinearLayout j02 = j0(0, size, activity, arrayList, i6Var);
        LinearLayout j03 = j0(size, arrayList.size(), activity, arrayList, i6Var);
        linearLayout3.addView(j02, c8.na.p(0, -2, 1.0f, 48));
        linearLayout3.addView(new View(activity), c8.na.o(10, 0));
        linearLayout3.addView(j03, c8.na.p(0, -2, 1.0f, 48));
        linearLayout2.addView(linearLayout3, c8.na.r(-1, -2, 1));
        linearLayout.addView(linearLayout2, c8.na.k(40.0f, 32.0f, 40.0f, 28.0f, -1, -2));
        f10.addView(linearLayout, c8.na.o(-1, -2));
        hi.e eVar = new hi.e(activity, i6Var, true);
        eVar.setRoundRadius(24);
        f10.addView(eVar, c8.na.d(-1, 48.0f, 1, 14.0f, 14.0f, 14.0f, 14.0f));
        j3.O = f10;
        j3.O();
        if (rVar != null) {
            int i10 = org.telegram.ui.ActionBar.n6.q7;
            eVar.setColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
            if (eVar.getBackground() != null) {
                Drawable background = eVar.getBackground();
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
                eVar.setBackground(background);
                org.telegram.ui.ActionBar.u6.j(eVar, background, M, null, i6Var);
            }
            eVar.setText(gd.N0(2131742891, null));
            w2Var = j3;
            eVar.setOnClickListener(new x8(activity, i6Var, rVar, j3, 0));
        } else {
            w2Var = j3;
            eVar.setText(gd.N0(2131742877, null));
            eVar.setOnClickListener(new s4(w2Var, i7));
        }
        w2Var.show();
    }

    public static void l0(Activity activity, org.telegram.ui.ActionBar.i6 i6Var, w10 w10Var) {
        org.telegram.ui.ActionBar.w2 j3 = m10.j(activity, false, 1, i6Var);
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
        f10.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        LinearLayout f11 = org.telegram.messenger.f3.f(activity, 1);
        f11.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), 0);
        o01 o01Var = new o01(activity, i6Var);
        o01Var.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(4.0f));
        o01Var.setEmojiSize(100);
        org.telegram.ui.Components.p9 p9Var = o01Var.b;
        p9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        ri.d0(org.telegram.messenger.g0.t0()).h2(p9Var, "RestrictedEmoji", "📝", "100_100");
        f11.addView(o01Var, c8.na.r(-1, -2, 7));
        String N0 = gd.N0(2131742763, null);
        j80 j80Var = o01Var.c;
        CharSequence m10 = org.telegram.messenger.j6.m(N0, j80Var.getPaint().getFontMetricsInt(), false, null, 0);
        String N02 = gd.N0(2131742764, null);
        j80 j80Var2 = o01Var.d;
        o01Var.a(m10, org.telegram.messenger.j6.m(N02, j80Var2.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.ActionBar.u6.U(j80Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        org.telegram.ui.ActionBar.u6.U(j80Var2, org.telegram.ui.ActionBar.n6.z6, i6Var);
        ks.i(j80Var);
        ks.i(j80Var2);
        f11.addView(i0(activity, i6Var, R.drawable.wallet_learn_hidden, gd.N0(2131742762, null)));
        f11.addView(i0(activity, i6Var, R.drawable.wallet_learn_warn, gd.N0(2131742767, null)));
        f11.addView(i0(activity, i6Var, R.drawable.wallet_learn_protected, gd.N0(2131742761, null)));
        f10.addView(f11, c8.na.o(-1, -2));
        hi.e eVar = new hi.e(activity, i6Var, true);
        eVar.setRoundRadius(24);
        eVar.i(gd.N0(2131742765, null), false, true);
        f10.addView(eVar, c8.na.d(-1, 48.0f, 7, 14.0f, 14.0f, 14.0f, 0.0f));
        j3.O = f10;
        j3.O();
        eVar.setOnClickListener(new x8(eVar, w10Var, j3, i6Var, 1));
        j3.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        if (r1.f(r0.public_key) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0026, code lost:
    
        if (r11.g() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r1.f(r0.public_key) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.d51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(ArrayList arrayList, b51 b51Var) {
        List<r0> list;
        v0 D = v0.D(this.currentAccount);
        TL_wallet.WalletState walletState = D.e;
        boolean z10 = true;
        if (walletState instanceof TL_wallet.TL_walletState) {
            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
            if (!tL_walletState.can_export_phrase) {
                a1 a1Var = D.c;
                if (a1Var != null) {
                }
            }
            arrayList.add(n41.u(gd.N0(2131742763, null)));
            n41 e10 = n41.e(1, gd.N0(2131742765, null));
            e10.r = true;
            arrayList.add(e10);
            arrayList.add(n41.C(gd.N0(2131742760, null)));
            TL_wallet.WalletState walletState2 = D.e;
            if (!(!(walletState2 instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState2).backup_enabled)) {
                if (walletState2 instanceof TL_wallet.TL_walletState) {
                    TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState2;
                    if (tL_walletState2.can_enable_backup) {
                        a1 a1Var2 = D.c;
                        if (a1Var2 != null) {
                        }
                    }
                }
                n41 e11 = n41.e(4, gd.N0(2131742889, null));
                e11.s = true;
                arrayList.add(e11);
                list = D.K;
                if (list.isEmpty()) {
                    for (r0 r0Var : list) {
                        if (r0Var.e) {
                            boolean z11 = org.telegram.messenger.s2.a;
                        } else {
                            if (z10) {
                                arrayList.add(n41.C(null));
                                arrayList.add(n41.u(gd.N0(2131742778, null)));
                                z10 = false;
                            }
                            String str = r0Var.a;
                            long j3 = r0Var.c;
                            int i7 = r0Var.b;
                            boolean z12 = r0Var.e;
                            int i10 = c9.b;
                            n41 K = n41.K(c9.class);
                            K.m = str;
                            K.C = j3;
                            K.A = i7;
                            K.r = z12;
                            arrayList.add(K);
                        }
                    }
                    if (z10) {
                        return;
                    }
                    arrayList.add(n41.C(gd.N0(2131742777, null)));
                    return;
                }
                return;
            }
            i5.c.s(2131742875, null, arrayList);
            TL_wallet.WalletState walletState3 = D.e;
            if (!(walletState3 instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState3).backup_enabled) {
                n41 e12 = n41.e(3, gd.N0(2131742884, null));
                e12.s = true;
                arrayList.add(e12);
                arrayList.add(n41.C(gd.N0(2131742936, null)));
            } else {
                n41 e13 = n41.e(2, gd.N0(2131742876, null));
                e13.r = true;
                arrayList.add(e13);
                arrayList.add(n41.C(gd.N0(2131742939, null)));
            }
            n41 e112 = n41.e(4, gd.N0(2131742889, null));
            e112.s = true;
            arrayList.add(e112);
            list = D.K;
            if (list.isEmpty()) {
            }
        }
    }

    @Override // org.telegram.ui.Components.d51
    public final CharSequence a0() {
        return gd.N0(2131742828, null);
    }

    @Override // org.telegram.ui.Components.d51
    public final void b0(n41 n41Var, View view) {
        int i7 = n41Var.d;
        int i10 = 0;
        int i11 = 1;
        if (i7 == 1) {
            v0 D = v0.D(this.currentAccount);
            if (!D.g()) {
                l0(getParentActivity(), getResourceProvider(), new w8(this, i10));
                return;
            }
            v8 v8Var = new v8();
            v8Var.s = D.E();
            presentFragment(v8Var);
            return;
        }
        if (i7 == 3) {
            v0 D2 = v0.D(this.currentAccount);
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
            t1Var.r(500L);
            j jVar = new j(this, t1Var, D2);
            v0.P("emulate disable backup: when ready");
            r rVar = new r(i10, D2, jVar);
            if (!D2.N() || D2.f == null) {
                D2.x.add(new WeakReference(rVar));
                return;
            } else {
                rVar.run();
                return;
            }
        }
        int i12 = 2;
        if (i7 == 2) {
            v0 D3 = v0.D(this.currentAccount);
            w8 w8Var = new w8(this, i11);
            v0.P("enable backup: when ready...");
            D3.x0(new iy0(28, D3, w8Var));
            return;
        }
        if (i7 != 4) {
            if (n41Var.H(c9.class)) {
                String charSequence = n41Var.m.toString();
                l0(getParentActivity(), getResourceProvider(), new s(this, v0.D(this.currentAccount), charSequence, new a1(this.currentAccount, getParentActivity(), charSequence)));
                return;
            }
            return;
        }
        Activity parentActivity = getParentActivity();
        String N0 = gd.N0(2131742887, null);
        String N02 = gd.N0(2131742888, null);
        boolean z10 = org.telegram.messenger.s2.a;
        org.telegram.ui.ActionBar.t1 f02 = org.telegram.ui.Components.b5.f0(parentActivity, N0, N02, null, gd.N0(2131742890, null), new w8(this, i12), getResourceProvider(), false);
        TextView textView = (TextView) f02.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, f02.j1);
        }
    }

    @Override // org.telegram.ui.Components.d51
    public final boolean c0(n41 n41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.d51, org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.r1();
        this.a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        bi.i6 i6Var;
        if (i7 != ks.d4 || (i6Var = this.a) == null) {
            return;
        }
        i6Var.g3.O(true);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ks.d4);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ks.d4);
        this.f = true;
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((p0) obj).close();
        }
        arrayList.clear();
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.a.setPadding(0, 0, 0, i12);
        this.a.setClipToPadding(false);
    }
}
