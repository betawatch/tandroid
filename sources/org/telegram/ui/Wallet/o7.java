package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.z9;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class o7 extends org.telegram.ui.ActionBar.m2 {
    public final ArrayList a;
    public ScrollView b;
    public ImageView c;
    public LinearLayout d;
    public di.d e;
    public Runnable f;
    public boolean h;

    public o7() {
        super(null);
        this.a = new ArrayList();
    }

    public static void U(o7 o7Var) {
        ArrayList arrayList = o7Var.a;
        if (arrayList.size() == 12 || arrayList.size() == 24) {
            z8 z8Var = new z8(arrayList, new m(o7Var, 12));
            z8Var.setCurrentAccount(o7Var.currentAccount);
            o7Var.presentFragment(z8Var);
        }
    }

    public final void V() {
        LinearLayout linearLayout = this.d;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        Context context = this.d.getContext();
        ArrayList arrayList = this.a;
        boolean z10 = true;
        int size = (arrayList.size() + 1) / 2;
        this.d.addView(k7.e0(0, size, context, arrayList, this.resourceProvider), w7.a6.o(0, -2, 1.0f, 48));
        this.d.addView(new View(context), w7.a6.n(10, 0));
        this.d.addView(k7.e0(size, arrayList.size(), context, arrayList, this.resourceProvider), w7.a6.o(0, -2, 1.0f, 48));
        di.d dVar = this.e;
        if (dVar != null) {
            if (arrayList.size() != 12 && arrayList.size() != 24) {
                z10 = false;
            }
            dVar.setEnabled(z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, this.resourceProvider));
        this.fragmentView = frameLayout;
        ScrollView scrollView = new ScrollView(context);
        this.b = scrollView;
        scrollView.setFillViewport(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setClipToPadding(false);
        this.b.setPadding(0, AndroidUtilities.dp(96.0f), 0, 0);
        frameLayout.addView(this.b, w7.a6.d(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setClipToPadding(false);
        this.b.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.c;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i10, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        this.c.setImageResource(R.drawable.ic_ab_close);
        this.c.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i6, this.resourceProvider), 3, -1));
        final int i11 = 0;
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.n7
            public final /* synthetic */ o7 b;

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
                        o7.U(this.b);
                        break;
                }
            }
        });
        frameLayout.addView(this.c, w7.a6.a(48.0f, 4.0f, 12.0f, 0.0f, 0.0f, 48, 51));
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
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, this.resourceProvider));
        textView.setText(LocaleController.getString(this.h ? R.string.WalletCurrentSecretPhrase : R.string.WalletNewSecretPhrase));
        TextView i12 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.a6.t(-1, -2, 1, 32, 0, 32, 10), context);
        i12.setTextSize(1, 14.0f);
        i12.setGravity(1);
        i12.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.z6, this.resourceProvider));
        i12.setText(LocaleController.getString(this.h ? R.string.WalletCurrentSecretPhraseInfo : R.string.WalletNewSecretPhraseInfo));
        linearLayout.addView(i12, w7.a6.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.d = linearLayout2;
        linearLayout2.setOrientation(0);
        this.d.setGravity(1);
        linearLayout.addView(this.d, w7.a6.t(-1, -2, 1, 4, 24, 4, 0));
        linearLayout.addView(new View(context), w7.a6.l(1.0f, -1, 0));
        di.d dVar = new di.d(context, this.resourceProvider, true);
        this.e = dVar;
        dVar.e();
        this.e.setText(LocaleController.getString(R.string.WalletContinue));
        final int i13 = 1;
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.n7
            public final /* synthetic */ o7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    default:
                        o7.U(this.b);
                        break;
                }
            }
        });
        linearLayout.addView(this.e, w7.a6.t(-1, 48, 1, 0, 24, 0, 0));
        V();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        ScrollView scrollView = this.b;
        if (scrollView != null) {
            scrollView.setPadding(i10, AndroidUtilities.dp(96.0f) + i11, i12, i13);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = AndroidUtilities.dp(4.0f) + i10;
            layoutParams.topMargin = AndroidUtilities.dp(12.0f) + i11;
            this.c.setLayoutParams(layoutParams);
        }
    }
}
