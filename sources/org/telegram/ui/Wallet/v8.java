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
import org.telegram.messenger.i10;
import org.telegram.messenger.ri;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.e21;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kc;
import org.telegram.ui.a31;
import org.telegram.ui.ao0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class v8 extends org.telegram.ui.ActionBar.g2 {
    public int a;
    public j6 b;
    public LinearLayout c;
    public hi.e d;
    public ImageView e;
    public ScrollView f;
    public j80 h;
    public int n;
    public boolean r;
    public byte[] s;
    public final ArrayList w;

    public v8() {
        super(null);
        this.a = 12;
        this.w = new ArrayList();
    }

    public static void Z(v8 v8Var, String str, v0 v0Var, org.telegram.ui.ActionBar.g2 g2Var, String str2) {
        v8Var.d.setLoading(false);
        if ("WRONG_CONTRACT".equalsIgnoreCase(str2) || "INVALID_PHRASE".equalsIgnoreCase(str2)) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, v8Var.getParentActivity(), v8Var.getResourceProvider());
            String N0 = gd.N0(2131742831, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = gd.N0(2131742830, null);
            org.telegram.messenger.f3.m(null, 2131742811, alertDialog$Builder, null);
            return;
        }
        if (str2 != null) {
            kc.b0(v8Var).f0(str2, false);
            return;
        }
        if (v8Var.r && !TextUtils.isEmpty(str) && !TextUtils.equals(str, v0Var.y())) {
            new a1(v8Var.currentAccount, v8Var.getParentActivity(), str).C();
        }
        org.telegram.messenger.g0.h3(new r(14, v8Var, g2Var), 300L);
    }

    public static void a0(v8 v8Var) {
        byte[] bArr;
        String str;
        FrameLayout frameLayout;
        if (v8Var.d.R) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = v8Var.w;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            arrayList.add(((eb) obj).getWord().toLowerCase().trim());
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
            s0 s0Var = new s0(bArr2);
            Arrays.fill(bArr2, (byte) 0);
            int size3 = arrayList3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList3.get(i13);
                i13++;
                Arrays.fill((byte[]) obj3, (byte) 0);
            }
            try {
                v8Var.d.setLoading(true);
                org.telegram.ui.ActionBar.g2 g2Var = null;
                if (v8Var.s == null) {
                    v8Var.d.setLoading(true);
                    v0 D = v0.D(v8Var.currentAccount);
                    String y10 = D.y();
                    if (v8Var.getParentLayout() != null && v8Var.getParentLayout().getFragmentStack().size() > 1) {
                        g2Var = (org.telegram.ui.ActionBar.g2) v8Var.getParentLayout().getFragmentStack().get(v8Var.getParentLayout().getFragmentStack().size() - 2);
                    }
                    D.I(false, true, s0Var, new s(v8Var, y10, D, g2Var));
                    s0Var.close();
                    return;
                }
                try {
                    bArr = WalletEngine2.secretPhraseToPublicKey(s0Var);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    bArr = null;
                }
                if (bArr == null) {
                    v8Var.d.setLoading(false);
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, v8Var.getParentActivity(), v8Var.getResourceProvider());
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.S = gd.N0(2131742831, null);
                    t1Var.U = gd.N0(2131742830, null);
                    alertDialog$Builder.k(gd.N0(2131742811, null), null);
                    alertDialog$Builder.p();
                } else if (Arrays.equals(bArr, v8Var.s)) {
                    v0 D2 = v0.D(v8Var.currentAccount);
                    D2.c.q(i10.i(v8Var.currentAccount).e(), bArr, s0Var, new a31(14, v8Var, D2));
                } else {
                    try {
                        str = WalletEngine2.secretPhraseToAddress(s0Var);
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        str = null;
                    }
                    if (TextUtils.isEmpty(str)) {
                        frameLayout = null;
                    } else {
                        frameLayout = new FrameLayout(v8Var.getParentActivity());
                        TextView textView = new TextView(v8Var.getParentActivity());
                        textView.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, v8Var.resourceProvider);
                        textView.setText(c0(str));
                        textView.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f));
                        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                        int L = org.telegram.messenger.g0.L(10.0f);
                        int i14 = org.telegram.ui.ActionBar.n6.a7;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i14, v8Var.resourceProvider));
                        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i14);
                        org.telegram.ui.ActionBar.i6 i6Var = v8Var.resourceProvider;
                        textView.setBackground(d02);
                        org.telegram.ui.ActionBar.u6.j(textView, d02, M, null, i6Var);
                        textView.setGravity(17);
                        frameLayout.addView(textView, c8.na.d(-1, -2.0f, 7, 16.0f, 0.0f, 16.0f, 0.0f));
                    }
                    v8Var.d.setLoading(false);
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, v8Var.getParentActivity(), v8Var.getResourceProvider());
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                    t1Var2.S = gd.N0(2131742686, null);
                    t1Var2.U = gd.N0(2131742685, null);
                    alertDialog$Builder2.o(frameLayout);
                    alertDialog$Builder2.k(gd.N0(2131747637, null), null);
                    alertDialog$Builder2.p();
                }
                s0Var.close();
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
            arrayList.add(((eb) obj).getWord());
        }
        this.c.removeAllViews();
        arrayList2.clear();
        int i10 = 0;
        while (i10 < this.a) {
            eb ebVar = new eb(i10, context, this.resourceProvider, i10 == 0);
            ebVar.setOnTextChangedListener(new u8(this, 1));
            ebVar.setOnPasteListener(new ao0(this, i10, 11));
            ebVar.setOnNextListener(new e21(this, i10, ebVar, 20));
            this.c.addView(ebVar, c8.na.t(-1, 50, 1, 0, i10 == 0 ? 0 : 12, 0, 0));
            arrayList2.add(ebVar);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size() && i11 < arrayList2.size(); i11++) {
            if (!((String) arrayList.get(i11)).isEmpty()) {
                ((eb) arrayList2.get(i11)).setText((String) arrayList.get(i11));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        final int i7 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        cu0 cu0Var = new cu0(context, null);
        this.fragmentView = cu0Var;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, cu0Var, this.resourceProvider);
        ScrollView scrollView = new ScrollView(context);
        final int i10 = 1;
        scrollView.setFillViewport(true);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setClipToPadding(false);
        scrollView.setPadding(0, org.telegram.messenger.g0.L(96.0f), 0, 0);
        this.f = scrollView;
        scrollView.addOnLayoutChangeListener(new i8(this, 1));
        ((FrameLayout) this.fragmentView).addView(scrollView, c8.na.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(24.0f));
        linearLayout.setClipToPadding(false);
        scrollView.addView(linearLayout, c8.na.o(-1, -2));
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
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.t8
            public final /* synthetic */ v8 b;

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
                        v8.a0(this.b);
                        break;
                }
            }
        });
        ((FrameLayout) this.fragmentView).addView(this.e, c8.na.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        p9Var.setAspectFit(true);
        p9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        ri.d0(org.telegram.messenger.g0.t0()).h2(p9Var, "RestrictedEmoji", "📝", "100_100");
        p9Var.getImageReceiver().Y(1);
        linearLayout.addView(p9Var, c8.na.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        org.telegram.ui.ActionBar.u6.U(textView, i11, this.resourceProvider);
        textView.setText(gd.N0(this.s != null ? 2131742753 : 2131742843, null));
        linearLayout.addView(textView, c8.na.t(-1, -2, 1, 32, 0, 32, 10));
        j80 j80Var = new j80(context, null);
        this.h = j80Var;
        j80Var.setTextSize(1, 14.0f);
        this.h.setGravity(1);
        org.telegram.ui.ActionBar.u6.U(this.h, org.telegram.ui.ActionBar.n6.z6, this.resourceProvider);
        org.telegram.ui.ActionBar.u6.G(this.h, org.telegram.ui.ActionBar.n6.Xc, this.resourceProvider);
        if (this.s != null) {
            this.h.setText(org.telegram.messenger.g0.T2(gd.N0(2131742874, null), new u8(this, 0)));
        } else {
            this.h.setText(gd.V(null, null, 2131742839, 12));
        }
        linearLayout.addView(this.h, c8.na.t(-1, -2, 1, 32, 0, 32, 8));
        j6 j6Var = new j6(context, new CharSequence[]{gd.G(12, "WalletPhraseWords", new Object[0]), gd.G(24, "WalletPhraseWords", new Object[0])}, new k(this, 4), this.resourceProvider);
        this.b = j6Var;
        j6Var.e = true;
        j6Var.updateColors();
        this.b.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.b.setClipToPadding(false);
        linearLayout.addView(this.b, c8.na.t(-1, -2, 1, 0, 0, 0, 4));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.c = linearLayout2;
        linearLayout2.setOrientation(1);
        this.c.setGravity(1);
        this.c.setClipChildren(false);
        linearLayout.addView(this.c, c8.na.t(-1, -2, 1, 0, 16, 0, 0));
        hi.e eVar = new hi.e(context, this.resourceProvider, true);
        this.d = eVar;
        eVar.f();
        this.d.setText(gd.N0(2131742842, null));
        this.d.setEnabled(false);
        this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.t8
            public final /* synthetic */ v8 b;

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
                        v8.a0(this.b);
                        break;
                }
            }
        });
        linearLayout.addView(this.d, c8.na.t(-1, 48, 1, 0, 24, 0, 0));
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
            if (((eb) obj).getWord().isEmpty()) {
                break;
            }
        }
        this.d.setEnabled(z10);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
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

    @Override // org.telegram.ui.ActionBar.g2
    public final r0.l1 onInsetsInternal(View view, r0.l1 l1Var) {
        this.n = l1Var.a.f(8).d;
        return super.onInsetsInternal(view, l1Var);
    }
}
