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
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.si;
import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.z70;
import org.telegram.ui.fy0;
import org.telegram.ui.xi0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class p8 extends r41 implements is {
    public final ArrayList e = new ArrayList();
    public boolean f;

    public static void d0(p8 p8Var, z10 z10Var, p0 p0Var, i0 i0Var) {
        if (i0Var == null) {
            z10Var.a("STORAGE_FAILED");
            return;
        }
        z10Var.a(null);
        ArrayList f10 = i0Var.f();
        Activity parentActivity = p8Var.getParentActivity();
        org.telegram.ui.ActionBar.e6 e6Var = p8Var.resourceProvider;
        boolean z10 = org.telegram.messenger.r2.a;
        k0(parentActivity, f10, e6Var, new r(17, p8Var, p0Var));
    }

    public static void e0(p8 p8Var, org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        vf.b h = t1Var.h(i7, true, true);
        h.d();
        int i10 = p8Var.currentAccount;
        l8 l8Var = new l8(p8Var, h, 0);
        l0 x10 = l0.x(i10);
        x10.m0(new u11(i10, l8Var, x10));
    }

    public static void f0(p8 p8Var, Boolean bool) {
        l0 x10 = l0.x(p8Var.currentAccount);
        if (bool.booleanValue()) {
            boolean z10 = org.telegram.messenger.r2.a;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, p8Var.getParentActivity(), p8Var.getResourceProvider());
        alertDialog$Builder.a.S = hd.M0(2131743030, null);
        alertDialog$Builder.k(hd.M0(2131743151, null), new j8(p8Var, bool, x10, 0));
        alertDialog$Builder.h(hd.M0(2131743092, null), new xi0(29, p8Var, bool));
        alertDialog$Builder.p();
    }

    public static void g0(p8 p8Var, z10 z10Var, i0 i0Var, String str) {
        if (str != null) {
            z10Var.a(str);
        } else if (i0Var == null) {
            z10Var.a("WORDS_NULL");
        } else {
            z10Var.a(null);
            k0(p8Var.getParentActivity(), i0Var.f(), p8Var.resourceProvider, null);
        }
    }

    public static LinearLayout i0(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7, String str) {
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        f10.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.s(imageView, i10, e6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(i7);
        f10.addView(imageView, c8.ja.t(28, 28, 16, 0, 0, 14, 0));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(textView, i10, e6Var);
        textView.setText(org.telegram.messenger.g0.X2(str));
        f10.addView(textView, c8.ja.p(-1, -2, 1.0f, 16));
        return f10;
    }

    public static LinearLayout j0(int i7, int i10, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.e6 e6Var) {
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
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
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.z6, e6Var);
            StringBuilder sb2 = new StringBuilder();
            int i12 = i11 + 1;
            sb2.append(i12);
            sb2.append(".");
            textView.setText(sb2.toString());
            TextView f11 = i20.f(linearLayout, textView, c8.ja.t(26, -2, 8388613, 0, 0, 6, 0), context);
            f11.setTextSize(1, 15.0f);
            f11.setTypeface(org.telegram.messenger.g0.o());
            f11.setIncludeFontPadding(false);
            f11.setLineSpacing(0.0f, 1.0f);
            org.telegram.ui.ActionBar.q6.U(f11, org.telegram.ui.ActionBar.j6.G6, e6Var);
            f11.setText((CharSequence) arrayList.get(i11));
            linearLayout.addView(f11, c8.ja.o(-2, -2));
            f10.addView(linearLayout, c8.ja.t(-2, -2, 8388611, 0, i11 != i7 ? 10 : 0, 0, 0));
            i11 = i12;
        }
        return f10;
    }

    public static void k0(Activity activity, ArrayList arrayList, org.telegram.ui.ActionBar.e6 e6Var, r rVar) {
        org.telegram.ui.ActionBar.u2 u2Var;
        int i7 = 1;
        org.telegram.ui.ActionBar.u2 i10 = i20.i(activity, false, 1, e6Var);
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(24.0f), 0, 0);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(activity);
        i9Var.setAspectFit(true);
        i9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        si.b0(org.telegram.messenger.g0.t0()).c2(i9Var, "RestrictedEmoji", "📝", "100_100");
        linearLayout.addView(i9Var, c8.ja.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        i20.q(textView, org.telegram.ui.ActionBar.j6.G6, e6Var, null, 2131742955);
        linearLayout.addView(textView, c8.ja.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        i20.q(textView2, org.telegram.ui.ActionBar.j6.z6, e6Var, null, 2131743037);
        textView2.setMaxWidth(org.telegram.messenger.g0.L(330.0f));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), 0);
        textView2.setGravity(1);
        linearLayout.addView(textView2, c8.ja.r(-2, -2, 1));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(1);
        int size = (arrayList.size() + 1) / 2;
        LinearLayout j02 = j0(0, size, activity, arrayList, e6Var);
        LinearLayout j03 = j0(size, arrayList.size(), activity, arrayList, e6Var);
        linearLayout3.addView(j02, c8.ja.p(0, -2, 1.0f, 48));
        linearLayout3.addView(new View(activity), c8.ja.o(10, 0));
        linearLayout3.addView(j03, c8.ja.p(0, -2, 1.0f, 48));
        linearLayout2.addView(linearLayout3, c8.ja.r(-1, -2, 1));
        linearLayout.addView(linearLayout2, c8.ja.k(40.0f, 32.0f, 40.0f, 28.0f, -1, -2));
        e10.addView(linearLayout, c8.ja.o(-1, -2));
        hi.d dVar = new hi.d(activity, e6Var, true);
        dVar.setRoundRadius(24);
        e10.addView(dVar, c8.ja.d(-1, 48.0f, 1, 14.0f, 14.0f, 14.0f, 14.0f));
        i10.O = e10;
        i10.O();
        if (rVar != null) {
            int i11 = org.telegram.ui.ActionBar.j6.q7;
            dVar.setColor(org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
            if (dVar.getBackground() != null) {
                Drawable background = dVar.getBackground();
                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
                dVar.setBackground(background);
                org.telegram.ui.ActionBar.q6.j(dVar, background, M, null, e6Var);
            }
            dVar.setText(hd.M0(2131743142, null));
            u2Var = i10;
            dVar.setOnClickListener(new i8(activity, e6Var, rVar, i10, 0));
        } else {
            u2Var = i10;
            dVar.setText(hd.M0(2131743128, null));
            dVar.setOnClickListener(new d4(u2Var, i7));
        }
        u2Var.show();
    }

    public static void l0(Activity activity, org.telegram.ui.ActionBar.e6 e6Var, z10 z10Var) {
        org.telegram.ui.ActionBar.u2 i7 = i20.i(activity, false, 1, e6Var);
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        e10.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        LinearLayout e11 = org.telegram.messenger.k5.e(activity, 1);
        e11.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), 0);
        g01 g01Var = new g01(activity, e6Var);
        g01Var.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(4.0f));
        g01Var.setEmojiSize(100);
        org.telegram.ui.Components.i9 i9Var = g01Var.b;
        i9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        si.b0(org.telegram.messenger.g0.t0()).c2(i9Var, "RestrictedEmoji", "📝", "100_100");
        e11.addView(g01Var, c8.ja.r(-1, -2, 7));
        String M0 = hd.M0(2131743034, null);
        z70 z70Var = g01Var.c;
        CharSequence m10 = org.telegram.messenger.j6.m(M0, z70Var.getPaint().getFontMetricsInt(), false, null, 0);
        String M02 = hd.M0(2131743035, null);
        z70 z70Var2 = g01Var.d;
        g01Var.a(m10, org.telegram.messenger.j6.m(M02, z70Var2.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.G6, e6Var);
        org.telegram.ui.ActionBar.q6.U(z70Var2, org.telegram.ui.ActionBar.j6.z6, e6Var);
        ns.i(z70Var);
        ns.i(z70Var2);
        e11.addView(i0(activity, e6Var, R.drawable.wallet_learn_hidden, hd.M0(2131743033, null)));
        e11.addView(i0(activity, e6Var, R.drawable.wallet_learn_warn, hd.M0(2131743038, null)));
        e11.addView(i0(activity, e6Var, R.drawable.wallet_learn_protected, hd.M0(2131743032, null)));
        e10.addView(e11, c8.ja.o(-1, -2));
        hi.d dVar = new hi.d(activity, e6Var, true);
        dVar.setRoundRadius(24);
        dVar.i(hd.M0(2131743036, null), false, true);
        e10.addView(dVar, c8.ja.d(-1, 48.0f, 7, 14.0f, 14.0f, 14.0f, 0.0f));
        i7.O = e10;
        i7.O();
        dVar.setOnClickListener(new i8(dVar, z10Var, i7, e6Var, 1));
        i7.show();
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
    @Override // org.telegram.ui.Components.r41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(ArrayList arrayList, p41 p41Var) {
        List<h0> list;
        l0 x10 = l0.x(this.currentAccount);
        TL_wallet.WalletState walletState = x10.e;
        boolean z10 = true;
        if (walletState instanceof TL_wallet.TL_walletState) {
            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
            if (!tL_walletState.can_export_phrase) {
                p0 p0Var = x10.c;
                if (p0Var != null) {
                }
            }
            arrayList.add(b41.u(hd.M0(2131743034, null)));
            b41 e10 = b41.e(1, hd.M0(2131743036, null));
            e10.q = true;
            arrayList.add(e10);
            arrayList.add(b41.C(hd.M0(2131743031, null)));
            TL_wallet.WalletState walletState2 = x10.e;
            if (!(!(walletState2 instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState2).backup_enabled)) {
                if (walletState2 instanceof TL_wallet.TL_walletState) {
                    TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState2;
                    if (tL_walletState2.can_enable_backup) {
                        p0 p0Var2 = x10.c;
                        if (p0Var2 != null) {
                        }
                    }
                }
                b41 e11 = b41.e(4, hd.M0(2131743140, null));
                e11.r = true;
                arrayList.add(e11);
                list = x10.H;
                if (list.isEmpty()) {
                    for (h0 h0Var : list) {
                        if (h0Var.e) {
                            boolean z11 = org.telegram.messenger.r2.a;
                        } else {
                            if (z10) {
                                arrayList.add(b41.C(null));
                                arrayList.add(b41.u(hd.M0(2131743049, null)));
                                z10 = false;
                            }
                            String str = h0Var.a;
                            long j3 = h0Var.c;
                            int i7 = h0Var.b;
                            boolean z12 = h0Var.e;
                            int i10 = n8.b;
                            b41 K = b41.K(n8.class);
                            K.l = str;
                            K.B = j3;
                            K.z = i7;
                            K.q = z12;
                            arrayList.add(K);
                        }
                    }
                    if (z10) {
                        return;
                    }
                    arrayList.add(b41.C(hd.M0(2131743048, null)));
                    return;
                }
                return;
            }
            arrayList.add(b41.u(hd.M0(2131743126, null)));
            TL_wallet.WalletState walletState3 = x10.e;
            if (!(walletState3 instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState3).backup_enabled) {
                b41 e12 = b41.e(3, hd.M0(2131743135, null));
                e12.r = true;
                arrayList.add(e12);
                arrayList.add(b41.C(hd.M0(2131743187, null)));
            } else {
                b41 e13 = b41.e(2, hd.M0(2131743127, null));
                e13.q = true;
                arrayList.add(e13);
                arrayList.add(b41.C(hd.M0(2131743190, null)));
            }
            b41 e112 = b41.e(4, hd.M0(2131743140, null));
            e112.r = true;
            arrayList.add(e112);
            list = x10.H;
            if (list.isEmpty()) {
            }
        }
    }

    @Override // org.telegram.ui.Components.r41
    public final CharSequence a0() {
        return hd.M0(2131743080, null);
    }

    @Override // org.telegram.ui.Components.r41
    public final void b0(b41 b41Var, View view) {
        int i7 = b41Var.d;
        int i10 = 0;
        int i11 = 1;
        if (i7 == 1) {
            l0 x10 = l0.x(this.currentAccount);
            if (!x10.f()) {
                l0(getParentActivity(), getResourceProvider(), new g8(this, i10));
                return;
            }
            f8 f8Var = new f8();
            f8Var.s = x10.y();
            presentFragment(f8Var);
            return;
        }
        if (i7 == 3) {
            l0 x11 = l0.x(this.currentAccount);
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
            t1Var.r(500L);
            j jVar = new j(this, t1Var, x11);
            l0.H("emulate disable backup: when ready");
            r rVar = new r(i10, x11, jVar);
            if (!x11.G() || x11.f == null) {
                x11.w.add(new WeakReference(rVar));
                return;
            } else {
                rVar.run();
                return;
            }
        }
        int i12 = 2;
        if (i7 == 2) {
            l0 x12 = l0.x(this.currentAccount);
            g8 g8Var = new g8(this, i11);
            l0.H("enable backup: when ready...");
            x12.m0(new fy0(28, x12, g8Var));
            return;
        }
        if (i7 != 4) {
            if (b41Var.H(n8.class)) {
                String charSequence = b41Var.l.toString();
                l0(getParentActivity(), getResourceProvider(), new p(this, l0.x(this.currentAccount), charSequence, new p0(this.currentAccount, getParentActivity(), charSequence)));
                return;
            }
            return;
        }
        Activity parentActivity = getParentActivity();
        String M0 = hd.M0(2131743138, null);
        String M02 = hd.M0(2131743139, null);
        boolean z10 = org.telegram.messenger.r2.a;
        org.telegram.ui.ActionBar.t1 f02 = org.telegram.ui.Components.t4.f0(parentActivity, M0, M02, null, hd.M0(2131743141, null), new g8(this, i12), getResourceProvider(), false);
        TextView textView = (TextView) f02.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, f02.j1);
        }
    }

    @Override // org.telegram.ui.Components.r41
    public final boolean c0(b41 b41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.r41, org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.r1();
        this.a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        bi.v3 v3Var;
        if (i7 != ns.a4 || (v3Var = this.a) == null) {
            return;
        }
        v3Var.g3.O(true);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ns.a4);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ns.a4);
        this.f = true;
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((g0) obj).close();
        }
        arrayList.clear();
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.a.setPadding(0, 0, 0, i12);
        this.a.setClipToPadding(false);
    }
}
