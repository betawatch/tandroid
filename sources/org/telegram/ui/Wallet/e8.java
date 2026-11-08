package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.ui;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.d10;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class e8 extends org.telegram.ui.ActionBar.f2 {
    public int a;
    public s5 b;
    public LinearLayout c;
    public fi.d d;
    public ImageView e;
    public ScrollView f;
    public w70 h;
    public int n;
    public boolean r;
    public byte[] s;
    public final ArrayList w;

    public e8() {
        super(null);
        this.a = 12;
        this.w = new ArrayList();
    }

    public static void Z(e8 e8Var, String str, m0 m0Var, org.telegram.ui.ActionBar.f2 f2Var, String str2) {
        e8Var.d.setLoading(false);
        if ("WRONG_CONTRACT".equalsIgnoreCase(str2) || "INVALID_PHRASE".equalsIgnoreCase(str2)) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e8Var.getParentActivity(), e8Var.getResourceProvider());
            String M0 = id.M0(2131743086, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = id.M0(2131743085, null);
            jg.g.C(null, 2131743066, alertDialog$Builder, null);
            return;
        }
        if (str2 != null) {
            hc.a0(e8Var).e0(str2, false);
            return;
        }
        if (e8Var.r && !TextUtils.isEmpty(str) && !TextUtils.equals(str, m0Var.t())) {
            new q0(e8Var.currentAccount, e8Var.getParentActivity(), str).B();
        }
        org.telegram.messenger.g0.i3(new n(20, e8Var, f2Var), 300L);
    }

    public static void a0(e8 e8Var) {
        byte[] bArr;
        String str;
        FrameLayout frameLayout;
        if (e8Var.d.Q) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = e8Var.w;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            arrayList.add(((na) obj).getWord().toLowerCase().trim());
        }
        int max = Math.max(0, arrayList.size() - 1);
        ArrayList arrayList3 = new ArrayList();
        try {
            int size2 = arrayList.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                arrayList3.add(((String) obj2).getBytes(StandardCharsets.UTF_8));
                long length = max + r8.length;
                max = (int) length;
                if (length != max) {
                    throw new ArithmeticException();
                }
            }
            byte[] bArr2 = new byte[max];
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                try {
                    if (i12 > 0) {
                        bArr2[i11] = 32;
                        i11++;
                    }
                    byte[] bArr3 = (byte[]) arrayList3.get(i12);
                    System.arraycopy(bArr3, 0, bArr2, i11, bArr3.length);
                    i11 += bArr3.length;
                } finally {
                    Arrays.fill(bArr2, (byte) 0);
                }
            }
            j0 j0Var = new j0(bArr2);
            Arrays.fill(bArr2, (byte) 0);
            int size3 = arrayList3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList3.get(i13);
                i13++;
                Arrays.fill((byte[]) obj3, (byte) 0);
            }
            try {
                e8Var.d.setLoading(true);
                org.telegram.ui.ActionBar.f2 f2Var = null;
                if (e8Var.s == null) {
                    e8Var.d.setLoading(true);
                    m0 x10 = m0.x(e8Var.currentAccount);
                    String t6 = x10.t();
                    if (e8Var.getParentLayout() != null && e8Var.getParentLayout().getFragmentStack().size() > 1) {
                        f2Var = (org.telegram.ui.ActionBar.f2) e8Var.getParentLayout().getFragmentStack().get(e8Var.getParentLayout().getFragmentStack().size() - 2);
                    }
                    x10.C(false, true, j0Var, new q(e8Var, t6, x10, f2Var));
                    j0Var.close();
                    return;
                }
                try {
                    bArr = WalletEngine2.secretPhraseToPublicKey(j0Var);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    bArr = null;
                }
                if (bArr == null) {
                    e8Var.d.setLoading(false);
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e8Var.getParentActivity(), e8Var.getResourceProvider());
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.R = id.M0(2131743086, null);
                    u1Var.T = id.M0(2131743085, null);
                    alertDialog$Builder.k(id.M0(2131743066, null), null);
                    alertDialog$Builder.p();
                } else if (Arrays.equals(bArr, e8Var.s)) {
                    m0 x11 = m0.x(e8Var.currentAccount);
                    x11.c.p(p10.i(e8Var.currentAccount).e(), bArr, j0Var, new t(9, e8Var, x11));
                } else {
                    try {
                        str = WalletEngine2.secretPhraseToAddress(j0Var);
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        str = null;
                    }
                    if (TextUtils.isEmpty(str)) {
                        frameLayout = null;
                    } else {
                        frameLayout = new FrameLayout(e8Var.getParentActivity());
                        TextView textView = new TextView(e8Var.getParentActivity());
                        textView.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, e8Var.resourceProvider);
                        textView.setText(c0(str));
                        textView.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f));
                        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                        int L = org.telegram.messenger.g0.L(10.0f);
                        int i14 = org.telegram.ui.ActionBar.k6.a7;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i14, e8Var.resourceProvider));
                        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
                        org.telegram.ui.ActionBar.f6 f6Var = e8Var.resourceProvider;
                        textView.setBackground(d02);
                        org.telegram.ui.ActionBar.r6.k(textView, d02, N, null, f6Var);
                        textView.setGravity(17);
                        frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 7, 16.0f, 0.0f, 16.0f, 0.0f));
                    }
                    e8Var.d.setLoading(false);
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, e8Var.getParentActivity(), e8Var.getResourceProvider());
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                    u1Var2.R = id.M0(2131742960, null);
                    u1Var2.T = id.M0(2131742959, null);
                    alertDialog$Builder2.o(frameLayout);
                    alertDialog$Builder2.k(id.M0(2131747832, null), null);
                    alertDialog$Builder2.p();
                }
                j0Var.close();
            } finally {
            }
        } catch (Throwable th2) {
            int size4 = arrayList3.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList3.get(i15);
                i15++;
                Arrays.fill((byte[]) obj4, (byte) 0);
            }
            throw th2;
        }
    }

    public static SpannableStringBuilder c0(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (i11 > 0 && i11 % 4 == 0) {
                int i12 = i11 % 24;
                spannableStringBuilder.append(i12 == 0 ? '\n' : ' ');
                if (i12 == 0) {
                    i10++;
                }
                i7 = spannableStringBuilder.length();
            }
            spannableStringBuilder.append(str.charAt(i11));
            if (i11 % 4 == 3) {
                int i13 = i10 + 1;
                if (i10 % 2 == 1) {
                    org.telegram.messenger.t tVar = new org.telegram.messenger.t(false);
                    tVar.b = (int) 191.25f;
                    spannableStringBuilder.setSpan(tVar, i7, spannableStringBuilder.length(), 33);
                }
                i7 = spannableStringBuilder.length();
                i10 = i13;
            }
        }
        return spannableStringBuilder;
    }

    public final void b0(Context context) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.w;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            arrayList.add(((na) obj).getWord());
        }
        this.c.removeAllViews();
        arrayList2.clear();
        int i10 = 0;
        while (i10 < this.a) {
            na naVar = new na(i10, context, this.resourceProvider, i10 == 0);
            naVar.setOnTextChangedListener(new d8(this, 1));
            naVar.setOnPasteListener(new g2(this, i10, 3));
            naVar.setOnNextListener(new d10(this, i10, naVar, 17));
            this.c.addView(naVar, c8.ha.t(-1, 50, 1, 0, i10 == 0 ? 0 : 12, 0, 0));
            arrayList2.add(naVar);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size() && i11 < arrayList2.size(); i11++) {
            if (!((String) arrayList.get(i11)).isEmpty()) {
                ((na) arrayList2.get(i11)).setText((String) arrayList.get(i11));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        final int i7 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        rt0 rt0Var = new rt0(context, null);
        this.fragmentView = rt0Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, rt0Var, this.resourceProvider);
        ScrollView scrollView = new ScrollView(context);
        final int i10 = 1;
        scrollView.setFillViewport(true);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setClipToPadding(false);
        scrollView.setPadding(0, org.telegram.messenger.g0.L(96.0f), 0, 0);
        this.f = scrollView;
        scrollView.addOnLayoutChangeListener(new q7(this, 1));
        ((FrameLayout) this.fragmentView).addView(scrollView, c8.ha.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(24.0f));
        linearLayout.setClipToPadding(false);
        scrollView.addView(linearLayout, c8.ha.o(-1, -2));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.e;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView2, i11, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.e.setImageResource(R.drawable.ic_ab_close);
        ImageView imageView3 = this.e;
        int i12 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.r6.R(imageView3, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.r6.N(i12), this.resourceProvider);
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.c8
            public final /* synthetic */ e8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    default:
                        e8.a0(this.b);
                        break;
                }
            }
        });
        ((FrameLayout) this.fragmentView).addView(this.e, c8.ha.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        l9Var.setAspectFit(true);
        l9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        ui.b0(org.telegram.messenger.g0.t0()).c2(l9Var, "RestrictedEmoji", "📝", "100_100");
        l9Var.getImageReceiver().X(1);
        linearLayout.addView(l9Var, c8.ha.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(textView, i11, this.resourceProvider);
        textView.setText(id.M0(this.s != null ? 2131743027 : 2131743098, null));
        linearLayout.addView(textView, c8.ha.t(-1, -2, 1, 32, 0, 32, 10));
        w70 w70Var = new w70(context, null);
        this.h = w70Var;
        w70Var.setTextSize(1, 14.0f);
        this.h.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(this.h, org.telegram.ui.ActionBar.k6.z6, this.resourceProvider);
        org.telegram.ui.ActionBar.r6.H(this.h, org.telegram.ui.ActionBar.k6.Uc, this.resourceProvider);
        if (this.s != null) {
            this.h.setText(org.telegram.messenger.g0.U2(id.M0(2131743128, null), new d8(this, 0)));
        } else {
            this.h.setText(id.V(null, null, 2131743094, 12));
        }
        linearLayout.addView(this.h, c8.ha.t(-1, -2, 1, 32, 0, 32, 8));
        s5 s5Var = new s5(context, new CharSequence[]{id.G(12, "WalletPhraseWords", new Object[0]), id.G(24, "WalletPhraseWords", new Object[0])}, new k(this, 5), this.resourceProvider);
        this.b = s5Var;
        s5Var.e = true;
        s5Var.updateColors();
        this.b.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.b.setClipToPadding(false);
        linearLayout.addView(this.b, c8.ha.t(-1, -2, 1, 0, 0, 0, 4));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.c = linearLayout2;
        linearLayout2.setOrientation(1);
        this.c.setGravity(1);
        this.c.setClipChildren(false);
        linearLayout.addView(this.c, c8.ha.t(-1, -2, 1, 0, 16, 0, 0));
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        this.d = dVar;
        dVar.f();
        this.d.setText(id.M0(2131743097, null));
        this.d.setEnabled(false);
        this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.c8
            public final /* synthetic */ e8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    default:
                        e8.a0(this.b);
                        break;
                }
            }
        });
        linearLayout.addView(this.d, c8.ha.t(-1, 48, 1, 0, 24, 0, 0));
        b0(context);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        boolean z9 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                z9 = true;
                break;
            }
            Object obj = arrayList.get(i7);
            i7++;
            if (((na) obj).getWord().isEmpty()) {
                break;
            }
        }
        this.d.setEnabled(z9);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        FrameLayout.LayoutParams layoutParams;
        ScrollView scrollView = this.f;
        if (scrollView != null) {
            scrollView.setPadding(i7, org.telegram.messenger.g0.L(96.0f) + i10, i11, 0);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
            int max = Math.max(i12, this.n);
            if (layoutParams2.bottomMargin != max) {
                layoutParams2.bottomMargin = max;
                this.f.setLayoutParams(layoutParams2);
            }
        }
        ImageView imageView = this.e;
        if (imageView == null || (layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams()) == null) {
            return;
        }
        layoutParams.topMargin = org.telegram.messenger.g0.L(12.0f) + i10;
        this.e.setLayoutParams(layoutParams);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.n = k1Var.a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }
}
