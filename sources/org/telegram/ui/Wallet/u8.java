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
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ri;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lc;
import org.telegram.ui.jw0;
import org.telegram.ui.p51;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class u8 extends org.telegram.ui.ActionBar.h2 {
    public int a;
    public i6 b;
    public LinearLayout c;
    public hi.d d;
    public ImageView e;
    public ScrollView f;
    public k80 h;
    public int n;
    public boolean r;
    public byte[] s;
    public final ArrayList w;

    public u8() {
        super(null);
        this.a = 12;
        this.w = new ArrayList();
    }

    public static void Z(u8 u8Var, String str, u0 u0Var, org.telegram.ui.ActionBar.h2 h2Var, String str2) {
        u8Var.d.setLoading(false);
        if ("WRONG_CONTRACT".equalsIgnoreCase(str2) || "INVALID_PHRASE".equalsIgnoreCase(str2)) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, u8Var.getParentActivity(), u8Var.getResourceProvider());
            String M0 = gd.M0(2131742844, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.S = M0;
            u1Var.U = gd.M0(2131742843, null);
            org.telegram.messenger.f3.m(null, 2131742824, alertDialog$Builder, null);
            return;
        }
        if (str2 != null) {
            lc.b0(u8Var).f0(str2, false);
            return;
        }
        if (u8Var.r && !TextUtils.isEmpty(str) && !TextUtils.equals(str, u0Var.y())) {
            new z0(u8Var.currentAccount, u8Var.getParentActivity(), str).C();
        }
        org.telegram.messenger.g0.h3(new c5(8, u8Var, h2Var), 300L);
    }

    public static void a0(u8 u8Var) {
        byte[] bArr;
        String str;
        FrameLayout frameLayout;
        if (u8Var.d.R) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = u8Var.w;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            arrayList.add(((db) obj).getWord().toLowerCase().trim());
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
            r0 r0Var = new r0(bArr2);
            Arrays.fill(bArr2, (byte) 0);
            int size3 = arrayList3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList3.get(i13);
                i13++;
                Arrays.fill((byte[]) obj3, (byte) 0);
            }
            try {
                u8Var.d.setLoading(true);
                org.telegram.ui.ActionBar.h2 h2Var = null;
                if (u8Var.s == null) {
                    u8Var.d.setLoading(true);
                    u0 D = u0.D(u8Var.currentAccount);
                    String y10 = D.y();
                    if (u8Var.getParentLayout() != null && u8Var.getParentLayout().getFragmentStack().size() > 1) {
                        h2Var = (org.telegram.ui.ActionBar.h2) u8Var.getParentLayout().getFragmentStack().get(u8Var.getParentLayout().getFragmentStack().size() - 2);
                    }
                    D.I(false, true, r0Var, new r(u8Var, y10, D, h2Var));
                    r0Var.close();
                    return;
                }
                try {
                    bArr = WalletEngine2.secretPhraseToPublicKey(r0Var);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    bArr = null;
                }
                if (bArr == null) {
                    u8Var.d.setLoading(false);
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, u8Var.getParentActivity(), u8Var.getResourceProvider());
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.S = gd.M0(2131742844, null);
                    u1Var.U = gd.M0(2131742843, null);
                    alertDialog$Builder.k(gd.M0(2131742824, null), null);
                    alertDialog$Builder.p();
                } else if (Arrays.equals(bArr, u8Var.s)) {
                    u0 D2 = u0.D(u8Var.currentAccount);
                    D2.c.q(j10.i(u8Var.currentAccount).e(), bArr, r0Var, new p51(13, u8Var, D2));
                } else {
                    try {
                        str = WalletEngine2.secretPhraseToAddress(r0Var);
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        str = null;
                    }
                    if (TextUtils.isEmpty(str)) {
                        frameLayout = null;
                    } else {
                        frameLayout = new FrameLayout(u8Var.getParentActivity());
                        TextView textView = new TextView(u8Var.getParentActivity());
                        textView.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, u8Var.resourceProvider);
                        textView.setText(c0(str));
                        textView.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f));
                        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                        int L = org.telegram.messenger.g0.L(10.0f);
                        int i14 = org.telegram.ui.ActionBar.n6.a7;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i14, u8Var.resourceProvider));
                        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i14);
                        org.telegram.ui.ActionBar.i6 i6Var = u8Var.resourceProvider;
                        textView.setBackground(d02);
                        org.telegram.ui.ActionBar.u6.j(textView, d02, M, null, i6Var);
                        textView.setGravity(17);
                        frameLayout.addView(textView, c8.ma.d(-1, -2.0f, 7, 16.0f, 0.0f, 16.0f, 0.0f));
                    }
                    u8Var.d.setLoading(false);
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, u8Var.getParentActivity(), u8Var.getResourceProvider());
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                    u1Var2.S = gd.M0(2131742699, null);
                    u1Var2.U = gd.M0(2131742698, null);
                    alertDialog$Builder2.o(frameLayout);
                    alertDialog$Builder2.k(gd.M0(2131747638, null), null);
                    alertDialog$Builder2.p();
                }
                r0Var.close();
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
            arrayList.add(((db) obj).getWord());
        }
        this.c.removeAllViews();
        arrayList2.clear();
        int i10 = 0;
        while (i10 < this.a) {
            db dbVar = new db(i10, context, this.resourceProvider, i10 == 0);
            dbVar.setOnTextChangedListener(new t8(this, 1));
            dbVar.setOnPasteListener(new jw0(this, i10, 9));
            dbVar.setOnNextListener(new h01(this, i10, dbVar, 21));
            this.c.addView(dbVar, c8.ma.t(-1, 50, 1, 0, i10 == 0 ? 0 : 12, 0, 0));
            arrayList2.add(dbVar);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size() && i11 < arrayList2.size(); i11++) {
            if (!((String) arrayList.get(i11)).isEmpty()) {
                ((db) arrayList2.get(i11)).setText((String) arrayList.get(i11));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        final int i7 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        au0 au0Var = new au0(context, null);
        this.fragmentView = au0Var;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, au0Var, this.resourceProvider);
        ScrollView scrollView = new ScrollView(context);
        final int i10 = 1;
        scrollView.setFillViewport(true);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setClipToPadding(false);
        scrollView.setPadding(0, org.telegram.messenger.g0.L(96.0f), 0, 0);
        this.f = scrollView;
        scrollView.addOnLayoutChangeListener(new h8(this, 1));
        ((FrameLayout) this.fragmentView).addView(scrollView, c8.ma.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(24.0f));
        linearLayout.setClipToPadding(false);
        scrollView.addView(linearLayout, c8.ma.o(-1, -2));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.e;
        int i11 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.s(imageView2, i11, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.e.setImageResource(R.drawable.ic_ab_close);
        ImageView imageView3 = this.e;
        int i12 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.ActionBar.u6.Q(imageView3, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i12, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.u6.M(i12), this.resourceProvider);
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.s8
            public final /* synthetic */ u8 b;

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
                        u8.a0(this.b);
                        break;
                }
            }
        });
        ((FrameLayout) this.fragmentView).addView(this.e, c8.ma.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        q9Var.setAspectFit(true);
        q9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        ri.d0(org.telegram.messenger.g0.t0()).h2(q9Var, "RestrictedEmoji", "📝", "100_100");
        q9Var.getImageReceiver().X(1);
        linearLayout.addView(q9Var, c8.ma.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        org.telegram.ui.ActionBar.u6.U(textView, i11, this.resourceProvider);
        textView.setText(gd.M0(this.s != null ? 2131742766 : 2131742856, null));
        linearLayout.addView(textView, c8.ma.t(-1, -2, 1, 32, 0, 32, 10));
        k80 k80Var = new k80(context, null);
        this.h = k80Var;
        k80Var.setTextSize(1, 14.0f);
        this.h.setGravity(1);
        org.telegram.ui.ActionBar.u6.U(this.h, org.telegram.ui.ActionBar.n6.z6, this.resourceProvider);
        org.telegram.ui.ActionBar.u6.G(this.h, org.telegram.ui.ActionBar.n6.Xc, this.resourceProvider);
        if (this.s != null) {
            this.h.setText(org.telegram.messenger.g0.T2(gd.M0(2131742887, null), new t8(this, 0)));
        } else {
            this.h.setText(gd.V(null, null, 2131742852, 12));
        }
        linearLayout.addView(this.h, c8.ma.t(-1, -2, 1, 32, 0, 32, 8));
        i6 i6Var = new i6(context, new CharSequence[]{gd.G(12, "WalletPhraseWords", new Object[0]), gd.G(24, "WalletPhraseWords", new Object[0])}, new k(this, 4), this.resourceProvider);
        this.b = i6Var;
        i6Var.e = true;
        i6Var.updateColors();
        this.b.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.b.setClipToPadding(false);
        linearLayout.addView(this.b, c8.ma.t(-1, -2, 1, 0, 0, 0, 4));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.c = linearLayout2;
        linearLayout2.setOrientation(1);
        this.c.setGravity(1);
        this.c.setClipChildren(false);
        linearLayout.addView(this.c, c8.ma.t(-1, -2, 1, 0, 16, 0, 0));
        hi.d dVar = new hi.d(context, this.resourceProvider, true);
        this.d = dVar;
        dVar.f();
        this.d.setText(gd.M0(2131742855, null));
        this.d.setEnabled(false);
        this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.s8
            public final /* synthetic */ u8 b;

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
                        u8.a0(this.b);
                        break;
                }
            }
        });
        linearLayout.addView(this.d, c8.ma.t(-1, 48, 1, 0, 24, 0, 0));
        b0(context);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        boolean z10 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                z10 = true;
                break;
            }
            Object obj = arrayList.get(i7);
            i7++;
            if (((db) obj).getWord().isEmpty()) {
                break;
            }
        }
        this.d.setEnabled(z10);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
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

    @Override // org.telegram.ui.ActionBar.h2
    public final r0.l1 onInsetsInternal(View view, r0.l1 l1Var) {
        this.n = l1Var.a.f(8).d;
        return super.onInsetsInternal(view, l1Var);
    }
}
