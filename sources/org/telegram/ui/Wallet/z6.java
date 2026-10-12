package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.xu;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zc;
import org.telegram.ui.c90;
import org.telegram.ui.je1;
import org.telegram.ui.li1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class z6 extends org.telegram.ui.ActionBar.m2 {
    public int a;
    public u4 b;
    public LinearLayout c;
    public di.d d;
    public ImageView e;
    public ScrollView f;
    public da0 h;
    public int n;
    public boolean r;
    public byte[] s;
    public final ArrayList v;

    public z6() {
        super(null);
        this.a = 12;
        this.v = new ArrayList();
    }

    public static void U(z6 z6Var, String str, j0 j0Var, org.telegram.ui.ActionBar.m2 m2Var, String str2) {
        z6Var.d.setLoading(false);
        if ("WRONG_CONTRACT".equalsIgnoreCase(str2) || "INVALID_PHRASE".equalsIgnoreCase(str2)) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z6Var.getParentActivity(), 0, z6Var.getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.WalletInvalidRecoveryPhrase);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.WalletInvalidRecoveryPhraseInfo);
            org.telegram.messenger.q.A(R.string.WalletOK, alertDialog$Builder, null);
            return;
        }
        if (str2 != null) {
            zc.a0(z6Var).e0(str2, false);
            return;
        }
        if (z6Var.r && !TextUtils.isEmpty(str) && !TextUtils.equals(str, j0Var.r())) {
            new o0(z6Var.getParentActivity(), str, z6Var.currentAccount).B();
        }
        AndroidUtilities.runOnUIThread(new je1(26, z6Var, m2Var), 300L);
    }

    public static void V(z6 z6Var) {
        byte[] bArr;
        String str;
        FrameLayout frameLayout;
        if (z6Var.d.N) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = z6Var.v;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(((h9) obj).getWord().toLowerCase().trim());
        }
        g0 d = g0.d(arrayList);
        try {
            z6Var.d.setLoading(true);
            org.telegram.ui.ActionBar.m2 m2Var = null;
            if (z6Var.s == null) {
                z6Var.d.setLoading(true);
                j0 v = j0.v(z6Var.currentAccount);
                String r10 = v.r();
                if (z6Var.getParentLayout() != null && z6Var.getParentLayout().getFragmentStack().size() > 1) {
                    m2Var = (org.telegram.ui.ActionBar.m2) z6Var.getParentLayout().getFragmentStack().get(z6Var.getParentLayout().getFragmentStack().size() - 2);
                }
                v.A(false, true, d, new q(z6Var, r10, v, m2Var));
                d.close();
                return;
            }
            try {
                bArr = WalletEngine2.secretPhraseToPublicKey(d);
            } catch (Exception e) {
                FileLog.e(e);
                bArr = null;
            }
            if (bArr == null) {
                z6Var.d.setLoading(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z6Var.getParentActivity(), 0, z6Var.getResourceProvider());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.WalletInvalidRecoveryPhrase);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.WalletInvalidRecoveryPhraseInfo);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletOK), null);
                alertDialog$Builder.o();
            } else if (Arrays.equals(bArr, z6Var.s)) {
                j0 v10 = j0.v(z6Var.currentAccount);
                v10.c.p(UserConfig.getInstance(z6Var.currentAccount).getClientUserId(), bArr, d, new y6(0, z6Var, v10));
            } else {
                try {
                    str = WalletEngine2.secretPhraseToAddress(d);
                } catch (Exception e7) {
                    FileLog.e(e7);
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    frameLayout = null;
                } else {
                    frameLayout = new FrameLayout(z6Var.getParentActivity());
                    TextView textView = new TextView(z6Var.getParentActivity());
                    textView.setTextSize(1, 14.0f);
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, z6Var.resourceProvider));
                    textView.setText(X(str));
                    textView.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f));
                    textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
                    textView.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.a7, z6Var.resourceProvider)));
                    textView.setGravity(17);
                    frameLayout.addView(textView, w7.a6.a(-2.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 7));
                }
                z6Var.d.setLoading(false);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(z6Var.getParentActivity(), 0, z6Var.getResourceProvider());
                alertDialog$Builder2.a.R = LocaleController.getString(R.string.WalletWrongSecretPhrase);
                alertDialog$Builder2.a.T = LocaleController.getString(R.string.WalletWrongSecretPhraseInfo);
                alertDialog$Builder2.n(frameLayout);
                alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                alertDialog$Builder2.o();
            }
            d.close();
        } finally {
        }
    }

    public static SpannableStringBuilder X(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            if (i12 > 0 && i12 % 4 == 0) {
                int i13 = i12 % 24;
                spannableStringBuilder.append(i13 == 0 ? '\n' : ' ');
                if (i13 == 0) {
                    i11++;
                }
                i10 = spannableStringBuilder.length();
            }
            spannableStringBuilder.append(str.charAt(i12));
            if (i12 % 4 == 3) {
                int i14 = i11 + 1;
                if (i11 % 2 == 1) {
                    xu xuVar = new xu(false);
                    xuVar.b = (int) 191.25f;
                    spannableStringBuilder.setSpan(xuVar, i10, spannableStringBuilder.length(), 33);
                }
                i10 = spannableStringBuilder.length();
                i11 = i14;
            }
        }
        return spannableStringBuilder;
    }

    public final void W(Context context) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.v;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(((h9) obj).getWord());
        }
        this.c.removeAllViews();
        arrayList2.clear();
        int i11 = 0;
        while (i11 < this.a) {
            h9 h9Var = new h9(i11, context, this.resourceProvider, i11 == 0);
            h9Var.setOnTextChangedListener(new x6(this, 1));
            h9Var.setOnPasteListener(new li1(this, i11, 4));
            h9Var.setOnNextListener(new c90(this, i11, h9Var, 15));
            this.c.addView(h9Var, w7.a6.t(-1, 50, 1, 0, i11 == 0 ? 0 : 12, 0, 0));
            arrayList2.add(h9Var);
            i11++;
        }
        for (int i12 = 0; i12 < arrayList.size() && i12 < arrayList2.size(); i12++) {
            if (!((String) arrayList.get(i12)).isEmpty()) {
                ((h9) arrayList2.get(i12)).setText((String) arrayList.get(i12));
            }
        }
    }

    public final void Y() {
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            if (((h9) obj).getWord().isEmpty()) {
                break;
            }
        }
        this.d.setEnabled(z10);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        final int i10 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        ow0 ow0Var = new ow0(context, null);
        this.fragmentView = ow0Var;
        ow0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, this.resourceProvider));
        ScrollView scrollView = new ScrollView(context);
        final int i11 = 1;
        scrollView.setFillViewport(true);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setClipToPadding(false);
        scrollView.setPadding(0, AndroidUtilities.dp(96.0f), 0, 0);
        this.f = scrollView;
        scrollView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Wallet.v6
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                int i20 = i15 - i13;
                int i21 = i19 - i17;
                z6 z6Var = z6.this;
                if (i20 >= i21) {
                    z6Var.getClass();
                    return;
                }
                ArrayList arrayList = z6Var.v;
                int size = arrayList.size();
                int i22 = 0;
                while (i22 < size) {
                    Object obj = arrayList.get(i22);
                    i22++;
                    h9 h9Var = (h9) obj;
                    if (h9Var.hasFocus()) {
                        h9Var.requestRectangleOnScreen(new Rect(0, 0, h9Var.getWidth(), h9Var.getHeight()), true);
                        return;
                    }
                }
            }
        });
        ((FrameLayout) this.fragmentView).addView(scrollView, w7.a6.d(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setClipToPadding(false);
        scrollView.addView(linearLayout, w7.a6.n(-1, -2));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.e;
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i12, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        this.e.setImageResource(R.drawable.ic_ab_close);
        this.e.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i6, this.resourceProvider), 3, -1));
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.w6
            public final /* synthetic */ z6 b;

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
                        z6.V(this.b);
                        break;
                }
            }
        });
        ((FrameLayout) this.fragmentView).addView(this.e, w7.a6.a(48.0f, 4.0f, 12.0f, 0.0f, 0.0f, 48, 51));
        z9 z9Var = new z9(context);
        z9Var.setAspectFit(true);
        z9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(z9Var, "RestrictedEmoji", "📝", "100_100");
        z9Var.getImageReceiver().setAutoRepeatCount(1);
        linearLayout.addView(z9Var, w7.a6.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i12, this.resourceProvider));
        textView.setText(LocaleController.getString(this.s != null ? R.string.WalletSecretPhrase : R.string.WalletImport));
        linearLayout.addView(textView, w7.a6.t(-1, -2, 1, 32, 0, 32, 10));
        da0 da0Var = new da0(context, null);
        this.h = da0Var;
        da0Var.setTextSize(1, 14.0f);
        this.h.setGravity(1);
        this.h.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.z6, this.resourceProvider));
        this.h.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.gc, this.resourceProvider));
        if (this.s != null) {
            this.h.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.WalletEnterSecretPhrase), new x6(this, i10)));
        } else {
            this.h.setText(LocaleController.formatSpannable(R.string.WalletImportPhraseInfo, 12));
        }
        linearLayout.addView(this.h, w7.a6.t(-1, -2, 1, 32, 0, 32, 8));
        u4 u4Var = new u4(context, new CharSequence[]{LocaleController.formatPluralString("WalletPhraseWords", 12, new Object[0]), LocaleController.formatPluralString("WalletPhraseWords", 24, new Object[0])}, new j(this, 4), this.resourceProvider);
        this.b = u4Var;
        u4Var.e = true;
        u4Var.d();
        this.b.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.b.setClipToPadding(false);
        linearLayout.addView(this.b, w7.a6.t(-1, -2, 1, 0, 0, 0, 4));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.c = linearLayout2;
        linearLayout2.setOrientation(1);
        this.c.setGravity(1);
        this.c.setClipChildren(false);
        linearLayout.addView(this.c, w7.a6.t(-1, -2, 1, 0, 16, 0, 0));
        di.d dVar = new di.d(context, this.resourceProvider, true);
        this.d = dVar;
        dVar.e();
        this.d.setText(LocaleController.getString(R.string.WalletImportButton));
        this.d.setEnabled(false);
        this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.w6
            public final /* synthetic */ z6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    default:
                        z6.V(this.b);
                        break;
                }
            }
        });
        linearLayout.addView(this.d, w7.a6.t(-1, 48, 1, 0, 24, 0, 0));
        W(context);
        Y();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        FrameLayout.LayoutParams layoutParams;
        ScrollView scrollView = this.f;
        if (scrollView != null) {
            scrollView.setPadding(i10, AndroidUtilities.dp(96.0f) + i11, i12, 0);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
            int max = Math.max(i13, this.n);
            if (layoutParams2.bottomMargin != max) {
                layoutParams2.bottomMargin = max;
                this.f.setLayoutParams(layoutParams2);
            }
        }
        ImageView imageView = this.e;
        if (imageView == null || (layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams()) == null) {
            return;
        }
        layoutParams.topMargin = AndroidUtilities.dp(12.0f) + i11;
        this.e.setLayoutParams(layoutParams);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final r0.l1 onInsetsInternal(View view, r0.l1 l1Var) {
        this.n = l1Var.a.f(8).d;
        return super.onInsetsInternal(view, l1Var);
    }
}
