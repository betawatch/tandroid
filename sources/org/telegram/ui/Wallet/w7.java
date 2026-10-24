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
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y90;
import org.telegram.ui.wg1;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class w7 extends org.telegram.ui.ActionBar.o2 {
    public int a;
    public i5 b;
    public LinearLayout c;
    public ei.d d;
    public ImageView e;
    public ScrollView f;
    public y90 h;
    public int n;
    public boolean r;
    public byte[] s;
    public final ArrayList v;

    public w7() {
        super(null);
        this.a = 12;
        this.v = new ArrayList();
    }

    public static void U(w7 w7Var, String str, l0 l0Var, org.telegram.ui.ActionBar.o2 o2Var, String str2) {
        w7Var.d.setLoading(false);
        if ("WRONG_CONTRACT".equalsIgnoreCase(str2) || "INVALID_PHRASE".equalsIgnoreCase(str2)) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w7Var.getParentActivity(), 0, w7Var.getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.WalletInvalidRecoveryPhrase);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.WalletInvalidRecoveryPhraseInfo);
            org.telegram.messenger.v0.o(R.string.WalletOK, alertDialog$Builder, null);
            return;
        }
        if (str2 != null) {
            xc.a0(w7Var).e0(str2, false);
            return;
        }
        if (w7Var.r && !TextUtils.isEmpty(str) && !TextUtils.equals(str, l0Var.s())) {
            new p0(w7Var.getParentActivity(), str, w7Var.currentAccount).B();
        }
        AndroidUtilities.runOnUIThread(new y3(12, w7Var, o2Var), 300L);
    }

    public static void V(w7 w7Var) {
        byte[] bArr;
        String str;
        FrameLayout frameLayout;
        if (w7Var.d.Q) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = w7Var.v;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(((ia) obj).getWord().toLowerCase().trim());
        }
        i0 d = i0.d(arrayList);
        try {
            w7Var.d.setLoading(true);
            org.telegram.ui.ActionBar.o2 o2Var = null;
            if (w7Var.s == null) {
                w7Var.d.setLoading(true);
                l0 w9 = l0.w(w7Var.currentAccount);
                String s10 = w9.s();
                if (w7Var.getParentLayout() != null && w7Var.getParentLayout().getFragmentStack().size() > 1) {
                    o2Var = (org.telegram.ui.ActionBar.o2) w7Var.getParentLayout().getFragmentStack().get(w7Var.getParentLayout().getFragmentStack().size() - 2);
                }
                w9.B(false, true, d, new n(w7Var, s10, w9, o2Var));
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
                w7Var.d.setLoading(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w7Var.getParentActivity(), 0, w7Var.getResourceProvider());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.WalletInvalidRecoveryPhrase);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.WalletInvalidRecoveryPhraseInfo);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletOK), null);
                alertDialog$Builder.p();
            } else if (Arrays.equals(bArr, w7Var.s)) {
                l0 w10 = l0.w(w7Var.currentAccount);
                w10.c.p(UserConfig.getInstance(w7Var.currentAccount).getClientUserId(), bArr, d, new w(7, w7Var, w10));
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
                    frameLayout = new FrameLayout(w7Var.getParentActivity());
                    TextView textView = new TextView(w7Var.getParentActivity());
                    textView.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, w7Var.resourceProvider);
                    textView.setText(X(str));
                    textView.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f));
                    textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
                    int dp = AndroidUtilities.dp(10.0f);
                    int i11 = org.telegram.ui.ActionBar.k6.a7;
                    ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.w0(i11, w7Var.resourceProvider));
                    org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
                    org.telegram.ui.ActionBar.g6 g6Var = w7Var.resourceProvider;
                    textView.setBackground(c02);
                    org.telegram.ui.ActionBar.r6.k(textView, c02, O, null, g6Var);
                    textView.setGravity(17);
                    frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 7, 16.0f, 0.0f, 16.0f, 0.0f));
                }
                w7Var.d.setLoading(false);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(w7Var.getParentActivity(), 0, w7Var.getResourceProvider());
                alertDialog$Builder2.a.R = LocaleController.getString(R.string.WalletWrongSecretPhrase);
                alertDialog$Builder2.a.T = LocaleController.getString(R.string.WalletWrongSecretPhraseInfo);
                alertDialog$Builder2.o(frameLayout);
                alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                alertDialog$Builder2.p();
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
                    su suVar = new su(false);
                    suVar.b = (int) 191.25f;
                    spannableStringBuilder.setSpan(suVar, i10, spannableStringBuilder.length(), 33);
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
            arrayList.add(((ia) obj).getWord());
        }
        this.c.removeAllViews();
        arrayList2.clear();
        int i11 = 0;
        while (i11 < this.a) {
            ia iaVar = new ia(i11, context, this.resourceProvider, i11 == 0);
            iaVar.setOnTextChangedListener(new v7(this, 1));
            iaVar.setOnPasteListener(new wg1(this, i11, 5));
            iaVar.setOnNextListener(new c41(this, i11, iaVar, 20));
            this.c.addView(iaVar, w7.z5.t(-1, 50, 1, 0, i11 == 0 ? 0 : 12, 0, 0));
            arrayList2.add(iaVar);
            i11++;
        }
        for (int i12 = 0; i12 < arrayList.size() && i12 < arrayList2.size(); i12++) {
            if (!((String) arrayList.get(i12)).isEmpty()) {
                ((ia) arrayList2.get(i12)).setText((String) arrayList.get(i12));
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
            if (((ia) obj).getWord().isEmpty()) {
                break;
            }
        }
        this.d.setEnabled(z10);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        final int i10 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        ow0 ow0Var = new ow0(context, null);
        this.fragmentView = ow0Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, ow0Var, this.resourceProvider);
        ScrollView scrollView = new ScrollView(context);
        final int i11 = 1;
        scrollView.setFillViewport(true);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setClipToPadding(false);
        scrollView.setPadding(0, AndroidUtilities.dp(96.0f), 0, 0);
        this.f = scrollView;
        scrollView.addOnLayoutChangeListener(new i7(this, 1));
        ((FrameLayout) this.fragmentView).addView(scrollView, w7.z5.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setClipToPadding(false);
        scrollView.addView(linearLayout, w7.z5.n(-1, -2));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.e;
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView2, i12, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.e.setImageResource(R.drawable.ic_ab_close);
        ImageView imageView3 = this.e;
        int i13 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.r6.S(imageView3, org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i13, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.r6.O(i13), this.resourceProvider);
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.u7
            public final /* synthetic */ w7 b;

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
                        w7.V(this.b);
                        break;
                }
            }
        });
        ((FrameLayout) this.fragmentView).addView(this.e, w7.z5.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        w9Var.setAspectFit(true);
        w9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(w9Var, "RestrictedEmoji", "📝", "100_100");
        w9Var.getImageReceiver().setAutoRepeatCount(1);
        linearLayout.addView(w9Var, w7.z5.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        org.telegram.ui.ActionBar.r6.W(textView, i12, this.resourceProvider);
        textView.setText(LocaleController.getString(this.s != null ? R.string.WalletSecretPhrase : R.string.WalletImport));
        linearLayout.addView(textView, w7.z5.t(-1, -2, 1, 32, 0, 32, 10));
        y90 y90Var = new y90(context, null);
        this.h = y90Var;
        y90Var.setTextSize(1, 14.0f);
        this.h.setGravity(1);
        org.telegram.ui.ActionBar.r6.W(this.h, org.telegram.ui.ActionBar.k6.z6, this.resourceProvider);
        org.telegram.ui.ActionBar.r6.I(this.h, org.telegram.ui.ActionBar.k6.gc, this.resourceProvider);
        if (this.s != null) {
            this.h.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.WalletEnterSecretPhrase), new v7(this, i10)));
        } else {
            this.h.setText(LocaleController.formatSpannable(R.string.WalletImportPhraseInfo, 12));
        }
        linearLayout.addView(this.h, w7.z5.t(-1, -2, 1, 32, 0, 32, 8));
        i5 i5Var = new i5(context, new CharSequence[]{LocaleController.formatPluralString("WalletPhraseWords", 12, new Object[0]), LocaleController.formatPluralString("WalletPhraseWords", 24, new Object[0])}, new k(this, 5), this.resourceProvider);
        this.b = i5Var;
        i5Var.e = true;
        i5Var.updateColors();
        this.b.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.b.setClipToPadding(false);
        linearLayout.addView(this.b, w7.z5.t(-1, -2, 1, 0, 0, 0, 4));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.c = linearLayout2;
        linearLayout2.setOrientation(1);
        this.c.setGravity(1);
        this.c.setClipChildren(false);
        linearLayout.addView(this.c, w7.z5.t(-1, -2, 1, 0, 16, 0, 0));
        ei.d dVar = new ei.d(context, this.resourceProvider, true);
        this.d = dVar;
        dVar.f();
        this.d.setText(LocaleController.getString(R.string.WalletImportButton));
        this.d.setEnabled(false);
        this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.u7
            public final /* synthetic */ w7 b;

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
                        w7.V(this.b);
                        break;
                }
            }
        });
        linearLayout.addView(this.d, w7.z5.t(-1, 48, 1, 0, 24, 0, 0));
        W(context);
        Y();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
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

    @Override // org.telegram.ui.ActionBar.o2
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.n = k1Var.a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }
}
