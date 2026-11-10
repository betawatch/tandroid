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
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.h10;
import org.telegram.ui.sb1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class g8 extends org.telegram.ui.ActionBar.f2 {
    public int a;
    public u5 b;
    public LinearLayout c;
    public fi.d d;
    public ImageView e;
    public ScrollView f;
    public w70 h;
    public int n;
    public boolean r;
    public byte[] s;
    public final ArrayList w;

    public g8() {
        super(null);
        this.a = 12;
        this.w = new ArrayList();
    }

    public static void Z(g8 g8Var, String str, l0 l0Var, org.telegram.ui.ActionBar.f2 f2Var, String str2) {
        g8Var.d.setLoading(false);
        if ("WRONG_CONTRACT".equalsIgnoreCase(str2) || "INVALID_PHRASE".equalsIgnoreCase(str2)) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g8Var.getParentActivity(), g8Var.getResourceProvider());
            String M0 = id.M0(2131743083, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = id.M0(2131743082, null);
            jg.g.C(null, 2131743063, alertDialog$Builder, null);
            return;
        }
        if (str2 != null) {
            gc.a0(g8Var).e0(str2, false);
            return;
        }
        if (g8Var.r && !TextUtils.isEmpty(str) && !TextUtils.equals(str, l0Var.t())) {
            new p0(g8Var.currentAccount, g8Var.getParentActivity(), str).B();
        }
        org.telegram.messenger.g0.i3(new sb1(21, g8Var, f2Var), 300L);
    }

    public static void a0(g8 g8Var) {
        byte[] bArr;
        String str;
        FrameLayout frameLayout;
        if (g8Var.d.Q) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = g8Var.w;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            arrayList.add(((pa) obj).getWord().toLowerCase().trim());
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
            i0 i0Var = new i0(bArr2);
            Arrays.fill(bArr2, (byte) 0);
            int size3 = arrayList3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList3.get(i13);
                i13++;
                Arrays.fill((byte[]) obj3, (byte) 0);
            }
            try {
                g8Var.d.setLoading(true);
                org.telegram.ui.ActionBar.f2 f2Var = null;
                if (g8Var.s == null) {
                    g8Var.d.setLoading(true);
                    l0 x10 = l0.x(g8Var.currentAccount);
                    String t6 = x10.t();
                    if (g8Var.getParentLayout() != null && g8Var.getParentLayout().getFragmentStack().size() > 1) {
                        f2Var = (org.telegram.ui.ActionBar.f2) g8Var.getParentLayout().getFragmentStack().get(g8Var.getParentLayout().getFragmentStack().size() - 2);
                    }
                    x10.C(false, true, i0Var, new p(g8Var, t6, x10, f2Var));
                    i0Var.close();
                    return;
                }
                try {
                    bArr = WalletEngine2.secretPhraseToPublicKey(i0Var);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    bArr = null;
                }
                if (bArr == null) {
                    g8Var.d.setLoading(false);
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g8Var.getParentActivity(), g8Var.getResourceProvider());
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.R = id.M0(2131743083, null);
                    u1Var.T = id.M0(2131743082, null);
                    alertDialog$Builder.k(id.M0(2131743063, null), null);
                    alertDialog$Builder.p();
                } else if (Arrays.equals(bArr, g8Var.s)) {
                    l0 x11 = l0.x(g8Var.currentAccount);
                    x11.c.p(p10.i(g8Var.currentAccount).e(), bArr, i0Var, new s(9, g8Var, x11));
                } else {
                    try {
                        str = WalletEngine2.secretPhraseToAddress(i0Var);
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        str = null;
                    }
                    if (TextUtils.isEmpty(str)) {
                        frameLayout = null;
                    } else {
                        frameLayout = new FrameLayout(g8Var.getParentActivity());
                        TextView textView = new TextView(g8Var.getParentActivity());
                        textView.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, g8Var.resourceProvider);
                        textView.setText(c0(str));
                        textView.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f));
                        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                        int L = org.telegram.messenger.g0.L(10.0f);
                        int i14 = org.telegram.ui.ActionBar.m6.a7;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i14, g8Var.resourceProvider));
                        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i14);
                        org.telegram.ui.ActionBar.h6 h6Var = g8Var.resourceProvider;
                        textView.setBackground(d02);
                        org.telegram.ui.ActionBar.t6.j(textView, d02, M, null, h6Var);
                        textView.setGravity(17);
                        frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 7, 16.0f, 0.0f, 16.0f, 0.0f));
                    }
                    g8Var.d.setLoading(false);
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, g8Var.getParentActivity(), g8Var.getResourceProvider());
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                    u1Var2.R = id.M0(2131742957, null);
                    u1Var2.T = id.M0(2131742956, null);
                    alertDialog$Builder2.o(frameLayout);
                    alertDialog$Builder2.k(id.M0(2131747831, null), null);
                    alertDialog$Builder2.p();
                }
                i0Var.close();
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
            arrayList.add(((pa) obj).getWord());
        }
        this.c.removeAllViews();
        arrayList2.clear();
        int i10 = 0;
        while (i10 < this.a) {
            pa paVar = new pa(i10, context, this.resourceProvider, i10 == 0);
            paVar.setOnTextChangedListener(new f8(this, 1));
            paVar.setOnPasteListener(new f2(this, i10, 3));
            paVar.setOnNextListener(new h10(this, i10, paVar, 17));
            this.c.addView(paVar, c8.ha.t(-1, 50, 1, 0, i10 == 0 ? 0 : 12, 0, 0));
            arrayList2.add(paVar);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size() && i11 < arrayList2.size(); i11++) {
            if (!((String) arrayList.get(i11)).isEmpty()) {
                ((pa) arrayList2.get(i11)).setText((String) arrayList.get(i11));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        final int i7 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        st0 st0Var = new st0(context, null);
        this.fragmentView = st0Var;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, st0Var, this.resourceProvider);
        ScrollView scrollView = new ScrollView(context);
        final int i10 = 1;
        scrollView.setFillViewport(true);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setClipToPadding(false);
        scrollView.setPadding(0, org.telegram.messenger.g0.L(96.0f), 0, 0);
        this.f = scrollView;
        scrollView.addOnLayoutChangeListener(new s7(this, 1));
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
        int i11 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.s(imageView2, i11, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.e.setImageResource(R.drawable.ic_ab_close);
        ImageView imageView3 = this.e;
        int i12 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.ActionBar.t6.Q(imageView3, org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i12, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.t6.M(i12), this.resourceProvider);
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.e8
            public final /* synthetic */ g8 b;

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
                        g8.a0(this.b);
                        break;
                }
            }
        });
        ((FrameLayout) this.fragmentView).addView(this.e, c8.ha.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        k9Var.setAspectFit(true);
        k9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        ui.b0(org.telegram.messenger.g0.t0()).c2(k9Var, "RestrictedEmoji", "📝", "100_100");
        k9Var.getImageReceiver().X(1);
        linearLayout.addView(k9Var, c8.ha.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        org.telegram.ui.ActionBar.t6.U(textView, i11, this.resourceProvider);
        textView.setText(id.M0(this.s != null ? 2131743024 : 2131743095, null));
        linearLayout.addView(textView, c8.ha.t(-1, -2, 1, 32, 0, 32, 10));
        w70 w70Var = new w70(context, null);
        this.h = w70Var;
        w70Var.setTextSize(1, 14.0f);
        this.h.setGravity(1);
        org.telegram.ui.ActionBar.t6.U(this.h, org.telegram.ui.ActionBar.m6.z6, this.resourceProvider);
        org.telegram.ui.ActionBar.t6.G(this.h, org.telegram.ui.ActionBar.m6.Uc, this.resourceProvider);
        if (this.s != null) {
            this.h.setText(org.telegram.messenger.g0.U2(id.M0(2131743125, null), new f8(this, 0)));
        } else {
            this.h.setText(id.V(null, null, 2131743091, 12));
        }
        linearLayout.addView(this.h, c8.ha.t(-1, -2, 1, 32, 0, 32, 8));
        u5 u5Var = new u5(context, new CharSequence[]{id.G(12, "WalletPhraseWords", new Object[0]), id.G(24, "WalletPhraseWords", new Object[0])}, new k(this, 5), this.resourceProvider);
        this.b = u5Var;
        u5Var.e = true;
        u5Var.updateColors();
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
        this.d.setText(id.M0(2131743094, null));
        this.d.setEnabled(false);
        this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.e8
            public final /* synthetic */ g8 b;

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
                        g8.a0(this.b);
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
            if (((pa) obj).getWord().isEmpty()) {
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
