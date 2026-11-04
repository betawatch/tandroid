package org.telegram.ui.Wallet;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.d01;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.s70;
import org.telegram.ui.ma1;
import org.telegram.ui.na1;
import org.telegram.ui.rw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n8 extends h41 implements cs {
    public final ArrayList e = new ArrayList();
    public boolean f;

    public static void d0(n8 n8Var, u10 u10Var, o0 o0Var, h0 h0Var) {
        if (h0Var == null) {
            u10Var.a("STORAGE_FAILED");
            return;
        }
        u10Var.a(null);
        ArrayList f10 = h0Var.f();
        Activity parentActivity = n8Var.getParentActivity();
        org.telegram.ui.ActionBar.e6 e6Var = n8Var.resourceProvider;
        boolean z10 = org.telegram.messenger.r2.a;
        k0(parentActivity, f10, e6Var, new ma1(26, n8Var, o0Var));
    }

    public static void e0(n8 n8Var, org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        sf.b h = s1Var.h(i3, true, true);
        h.d();
        int i10 = n8Var.currentAccount;
        j8 j8Var = new j8(n8Var, h, 0);
        k0 x10 = k0.x(i10);
        x10.m0(new rw(i10, j8Var, x10));
    }

    public static void f0(n8 n8Var, Boolean bool) {
        k0 x10 = k0.x(n8Var.currentAccount);
        if (bool.booleanValue()) {
            boolean z10 = org.telegram.messenger.r2.a;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, n8Var.getParentActivity(), n8Var.getResourceProvider());
        alertDialog$Builder.a.S = bd.M0(2131743040, null);
        alertDialog$Builder.k(bd.M0(2131743161, null), new i8(n8Var, bool, x10, 0));
        alertDialog$Builder.h(bd.M0(2131743102, null), new na1(3, n8Var, bool));
        alertDialog$Builder.p();
    }

    public static void g0(n8 n8Var, u10 u10Var, h0 h0Var, String str) {
        if (str != null) {
            u10Var.a(str);
        } else if (h0Var == null) {
            u10Var.a("WORDS_NULL");
        } else {
            u10Var.a(null);
            k0(n8Var.getParentActivity(), h0Var.f(), n8Var.resourceProvider, null);
        }
    }

    public static LinearLayout i0(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3, String str) {
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        f10.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(i3);
        f10.addView(imageView, mf.t(28, 28, 16, 0, 0, 14, 0));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i10, e6Var);
        textView.setText(org.telegram.messenger.g0.X2(str));
        f10.addView(textView, mf.p(-1, -2, 1.0f, 16));
        return f10;
    }

    public static LinearLayout j0(int i3, int i10, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.e6 e6Var) {
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        int i11 = i3;
        while (i11 < i10) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            TextView textView = new TextView(context);
            textView.setTextSize(1, 15.0f);
            textView.setGravity(8388613);
            textView.setIncludeFontPadding(false);
            textView.setLineSpacing(0.0f, 1.0f);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.z6, e6Var);
            StringBuilder sb2 = new StringBuilder();
            int i12 = i11 + 1;
            sb2.append(i12);
            sb2.append(".");
            textView.setText(sb2.toString());
            TextView f11 = org.telegram.messenger.camera.q.f(linearLayout, textView, mf.t(26, -2, 8388613, 0, 0, 6, 0), context);
            f11.setTextSize(1, 15.0f);
            f11.setTypeface(org.telegram.messenger.g0.o());
            f11.setIncludeFontPadding(false);
            f11.setLineSpacing(0.0f, 1.0f);
            org.telegram.ui.ActionBar.r6.V(f11, org.telegram.ui.ActionBar.k6.G6, e6Var);
            f11.setText((CharSequence) arrayList.get(i11));
            linearLayout.addView(f11, mf.o(-2, -2));
            f10.addView(linearLayout, mf.t(-2, -2, 8388611, 0, i11 != i3 ? 10 : 0, 0, 0));
            i11 = i12;
        }
        return f10;
    }

    public static void k0(Activity activity, ArrayList arrayList, org.telegram.ui.ActionBar.e6 e6Var, ma1 ma1Var) {
        org.telegram.ui.ActionBar.t2 t2Var;
        int i3 = 1;
        org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(activity, false, 1, e6Var);
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(24.0f), 0, 0);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(activity);
        k9Var.setAspectFit(true);
        k9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        li.b0(org.telegram.messenger.g0.t0()).c2(k9Var, "RestrictedEmoji", "📝", "100_100");
        linearLayout.addView(k9Var, mf.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        org.telegram.messenger.camera.q.o(textView, org.telegram.ui.ActionBar.k6.G6, e6Var, null, 2131742965);
        linearLayout.addView(textView, mf.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        org.telegram.messenger.camera.q.o(textView2, org.telegram.ui.ActionBar.k6.z6, e6Var, null, 2131743047);
        textView2.setMaxWidth(org.telegram.messenger.g0.L(330.0f));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), 0);
        textView2.setGravity(1);
        linearLayout.addView(textView2, mf.r(-2, -2, 1));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(1);
        int size = (arrayList.size() + 1) / 2;
        LinearLayout j02 = j0(0, size, activity, arrayList, e6Var);
        LinearLayout j03 = j0(size, arrayList.size(), activity, arrayList, e6Var);
        linearLayout3.addView(j02, mf.p(0, -2, 1.0f, 48));
        linearLayout3.addView(new View(activity), mf.o(10, 0));
        linearLayout3.addView(j03, mf.p(0, -2, 1.0f, 48));
        linearLayout2.addView(linearLayout3, mf.r(-1, -2, 1));
        linearLayout.addView(linearLayout2, mf.k(40.0f, 32.0f, 40.0f, 28.0f, -1, -2));
        e10.addView(linearLayout, mf.o(-1, -2));
        gi.d dVar = new gi.d(activity, e6Var, true);
        dVar.setRoundRadius(24);
        e10.addView(dVar, mf.d(-1, 48.0f, 1, 14.0f, 14.0f, 14.0f, 14.0f));
        h.O = e10;
        h.N();
        if (ma1Var != null) {
            int i10 = org.telegram.ui.ActionBar.k6.q7;
            dVar.setColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
            if (dVar.getBackground() != null) {
                Drawable background = dVar.getBackground();
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
                dVar.setBackground(background);
                org.telegram.ui.ActionBar.r6.k(dVar, background, N, null, e6Var);
            }
            dVar.setText(bd.M0(2131743152, null));
            t2Var = h;
            dVar.setOnClickListener(new h8(activity, e6Var, ma1Var, h, 0));
        } else {
            t2Var = h;
            dVar.setText(bd.M0(2131743138, null));
            dVar.setOnClickListener(new c4(t2Var, i3));
        }
        t2Var.show();
    }

    public static void l0(Activity activity, org.telegram.ui.ActionBar.e6 e6Var, u10 u10Var) {
        org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(activity, false, 1, e6Var);
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        e10.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        LinearLayout e11 = org.telegram.messenger.k5.e(activity, 1);
        e11.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), 0);
        d01 d01Var = new d01(activity, e6Var);
        d01Var.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(4.0f));
        d01Var.setEmojiSize(100);
        org.telegram.ui.Components.k9 k9Var = d01Var.b;
        k9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        li.b0(org.telegram.messenger.g0.t0()).c2(k9Var, "RestrictedEmoji", "📝", "100_100");
        e11.addView(d01Var, mf.r(-1, -2, 7));
        String M0 = bd.M0(2131743044, null);
        s70 s70Var = d01Var.c;
        CharSequence m10 = org.telegram.messenger.i6.m(M0, s70Var.getPaint().getFontMetricsInt(), false, null, 0);
        String M02 = bd.M0(2131743045, null);
        s70 s70Var2 = d01Var.d;
        d01Var.a(m10, org.telegram.messenger.i6.m(M02, s70Var2.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.G6, e6Var);
        org.telegram.ui.ActionBar.r6.V(s70Var2, org.telegram.ui.ActionBar.k6.z6, e6Var);
        hs.i(s70Var);
        hs.i(s70Var2);
        e11.addView(i0(activity, e6Var, R.drawable.wallet_learn_hidden, bd.M0(2131743043, null)));
        e11.addView(i0(activity, e6Var, R.drawable.wallet_learn_warn, bd.M0(2131743048, null)));
        e11.addView(i0(activity, e6Var, R.drawable.wallet_learn_protected, bd.M0(2131743042, null)));
        e10.addView(e11, mf.o(-1, -2));
        gi.d dVar = new gi.d(activity, e6Var, true);
        dVar.setRoundRadius(24);
        dVar.i(bd.M0(2131743046, null), false, true);
        e10.addView(dVar, mf.d(-1, 48.0f, 7, 14.0f, 14.0f, 14.0f, 0.0f));
        h.O = e10;
        h.N();
        dVar.setOnClickListener(new h8(dVar, u10Var, h, e6Var, 1));
        h.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        if (r1.f(r0.public_key) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0026, code lost:
    
        if (r11.f() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r1.f(r0.public_key) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.h41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(ArrayList arrayList, f41 f41Var) {
        List<g0> list;
        k0 x10 = k0.x(this.currentAccount);
        TL_wallet.WalletState walletState = x10.e;
        boolean z10 = true;
        if (walletState instanceof TL_wallet.TL_walletState) {
            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
            if (!tL_walletState.can_export_phrase) {
                o0 o0Var = x10.c;
                if (o0Var != null) {
                }
            }
            arrayList.add(r31.u(bd.M0(2131743044, null)));
            r31 e10 = r31.e(1, bd.M0(2131743046, null));
            e10.q = true;
            arrayList.add(e10);
            arrayList.add(r31.C(bd.M0(2131743041, null)));
            TL_wallet.WalletState walletState2 = x10.e;
            if (!(!(walletState2 instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState2).backup_enabled)) {
                if (walletState2 instanceof TL_wallet.TL_walletState) {
                    TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState2;
                    if (tL_walletState2.can_enable_backup) {
                        o0 o0Var2 = x10.c;
                        if (o0Var2 != null) {
                        }
                    }
                }
                r31 e11 = r31.e(4, bd.M0(2131743150, null));
                e11.r = true;
                arrayList.add(e11);
                list = x10.H;
                if (list.isEmpty()) {
                    for (g0 g0Var : list) {
                        if (g0Var.e) {
                            boolean z11 = org.telegram.messenger.r2.a;
                        } else {
                            if (z10) {
                                arrayList.add(r31.C(null));
                                arrayList.add(r31.u(bd.M0(2131743059, null)));
                                z10 = false;
                            }
                            String str = g0Var.a;
                            long j10 = g0Var.c;
                            int i3 = g0Var.b;
                            boolean z12 = g0Var.e;
                            int i10 = l8.b;
                            r31 K = r31.K(l8.class);
                            K.l = str;
                            K.B = j10;
                            K.z = i3;
                            K.q = z12;
                            arrayList.add(K);
                        }
                    }
                    if (z10) {
                        return;
                    }
                    arrayList.add(r31.C(bd.M0(2131743058, null)));
                    return;
                }
                return;
            }
            arrayList.add(r31.u(bd.M0(2131743136, null)));
            TL_wallet.WalletState walletState3 = x10.e;
            if (!(walletState3 instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState3).backup_enabled) {
                r31 e12 = r31.e(3, bd.M0(2131743145, null));
                e12.r = true;
                arrayList.add(e12);
                arrayList.add(r31.C(bd.M0(2131743197, null)));
            } else {
                r31 e13 = r31.e(2, bd.M0(2131743137, null));
                e13.q = true;
                arrayList.add(e13);
                arrayList.add(r31.C(bd.M0(2131743200, null)));
            }
            r31 e112 = r31.e(4, bd.M0(2131743150, null));
            e112.r = true;
            arrayList.add(e112);
            list = x10.H;
            if (list.isEmpty()) {
            }
        }
    }

    @Override // org.telegram.ui.Components.h41
    public final CharSequence a0() {
        return bd.M0(2131743090, null);
    }

    @Override // org.telegram.ui.Components.h41
    public final void b0(r31 r31Var, View view) {
        int i3 = r31Var.d;
        int i10 = 1;
        if (i3 == 1) {
            k0 x10 = k0.x(this.currentAccount);
            if (!x10.f()) {
                l0(getParentActivity(), getResourceProvider(), new f8(this, 0));
                return;
            }
            e8 e8Var = new e8();
            e8Var.s = x10.y();
            presentFragment(e8Var);
            return;
        }
        if (i3 == 3) {
            k0 x11 = k0.x(this.currentAccount);
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, getParentActivity(), null);
            s1Var.r(500L);
            j jVar = new j(this, s1Var, x11);
            k0.H("emulate disable backup: when ready");
            ma1 ma1Var = new ma1(8, x11, jVar);
            if (!x11.G() || x11.f == null) {
                x11.w.add(new WeakReference(ma1Var));
                return;
            } else {
                ma1Var.run();
                return;
            }
        }
        int i11 = 2;
        if (i3 == 2) {
            k0 x12 = k0.x(this.currentAccount);
            f8 f8Var = new f8(this, i10);
            k0.H("enable backup: when ready...");
            x12.m0(new ma1(6, x12, f8Var));
            return;
        }
        if (i3 != 4) {
            if (r31Var.H(l8.class)) {
                String charSequence = r31Var.l.toString();
                l0(getParentActivity(), getResourceProvider(), new p(this, k0.x(this.currentAccount), charSequence, new o0(this.currentAccount, getParentActivity(), charSequence)));
                return;
            }
            return;
        }
        Activity parentActivity = getParentActivity();
        String M0 = bd.M0(2131743148, null);
        String M02 = bd.M0(2131743149, null);
        boolean z10 = org.telegram.messenger.r2.a;
        org.telegram.ui.ActionBar.s1 h02 = org.telegram.ui.Components.t4.h0(parentActivity, M0, M02, null, bd.M0(2131743151, null), new f8(this, i11), getResourceProvider(), false);
        TextView textView = (TextView) h02.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, h02.l1);
        }
    }

    @Override // org.telegram.ui.Components.h41
    public final boolean c0(r31 r31Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.h41, org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.r1();
        this.a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        ai.h4 h4Var;
        if (i3 != hs.a4 || (h4Var = this.a) == null) {
            return;
        }
        h4Var.g3.O(true);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, hs.a4);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, hs.a4);
        this.f = true;
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((f0) obj).close();
        }
        arrayList.clear();
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.a.setPadding(0, 0, 0, i12);
        this.a.setClipToPadding(false);
    }
}
