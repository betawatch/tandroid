package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.TelegramQRCodeWriter;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public class jj0 extends org.telegram.ui.ActionBar.h3 {
    public final Bitmap b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final int f;
    public final bk0 h;
    public boolean n;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj0(Context context, String str, String str2, String str3, boolean z10) {
        super(1, context, (org.telegram.ui.ActionBar.g6) null, false);
        Bitmap bitmap = null;
        fixNavigationBar();
        setTitle(str, true);
        ig.k kVar = new ig.k(context, 3);
        kVar.setScaleType(ImageView.ScaleType.FIT_XY);
        kVar.setOutlineProvider(new ci.n1(15));
        kVar.setClipToOutline(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        Bitmap bitmap2 = this.b;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(dc.b.a, ic.c.c);
            hashMap.put(dc.b.c, 0);
            TelegramQRCodeWriter telegramQRCodeWriter = new TelegramQRCodeWriter();
            Bitmap encode = telegramQRCodeWriter.encode(str2, 768, 768, hashMap, bitmap2);
            this.f = telegramQRCodeWriter.getImageSize();
            bitmap = encode;
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.b = bitmap;
        kVar.setImageBitmap(bitmap);
        bk0 bk0Var = new bk0(context);
        this.h = bk0Var;
        bk0Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        bk0Var.setBackgroundColor(-1);
        org.telegram.ui.ul0 ul0Var = new org.telegram.ui.ul0(this, context, kVar);
        ul0Var.addView(kVar, w7.z5.c(-1.0f, -1));
        ul0Var.addView(bk0Var, w7.z5.e(60, 60, 17));
        linearLayout.addView(ul0Var, w7.z5.t(220, 220, 1, 30, 0, 30, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setText(str3);
        textView.setGravity(1);
        linearLayout.addView(textView, w7.z5.d(-1, -2.0f, 0, 40.0f, 8.0f, 40.0f, 8.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setOnClickListener(new ca(23, this, context));
        linearLayout.addView(textView2, w7.z5.t(-1, 48, 80, 16, 15, 16, 3));
        if (z10) {
            TextView textView3 = new TextView(context);
            this.e = textView3;
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setText(LocaleController.getString(R.string.ShareLink));
            textView3.setOnClickListener(new ca(24, str2, context));
            linearLayout.addView(textView3, w7.z5.t(-1, 48, 80, 16, 3, 16, 16));
        }
        updateColors();
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
    }

    public final void m(int i10) {
        bk0 bk0Var = this.h;
        bk0Var.setAutoRepeat(true);
        bk0Var.f(i10, 60, 60, null);
        bk0Var.d();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int i10 = org.telegram.ui.ActionBar.k6.Sh;
            int themedColor = getThemedColor(i10) * 31;
            int i11 = org.telegram.ui.ActionBar.k6.Oh;
            int themedColor2 = (getThemedColor(i11) * 17) + themedColor;
            int i12 = org.telegram.ui.ActionBar.k6.Qh;
            int themedColor3 = (getThemedColor(i12) * 13) + themedColor2;
            int i13 = org.telegram.ui.ActionBar.k6.i6;
            int themedColor4 = (getThemedColor(i13) * 7) + themedColor3;
            int i14 = org.telegram.ui.ActionBar.k6.y6;
            int themedColor5 = (getThemedColor(i14) * 5) + themedColor4;
            int i15 = org.telegram.ui.ActionBar.k6.G6;
            int themedColor6 = (getThemedColor(i15) * 3) + themedColor5;
            int i16 = org.telegram.ui.ActionBar.k6.h5;
            int themedColor7 = themedColor6 + getThemedColor(i16);
            if (this.n && themedColor7 == this.r) {
                return;
            }
            this.n = true;
            this.r = themedColor7;
            TextView textView = this.d;
            if (textView != null) {
                textView.setTextColor(getThemedColor(i10));
                org.telegram.ui.ActionBar.k6.E1(textView.getBackground(), getThemedColor(i11), false);
                org.telegram.ui.ActionBar.k6.E1(textView.getBackground(), getThemedColor(i12), true);
            }
            TextView textView2 = this.e;
            if (textView2 != null) {
                textView2.setTextColor(getThemedColor(i11));
                org.telegram.ui.ActionBar.k6.E1(textView2.getBackground(), i0.a.o(getThemedColor(i11), Math.min(255, Color.alpha(getThemedColor(i13)) * 2)), true);
            }
            TextView textView3 = this.c;
            if (textView3 != null) {
                textView3.setTextColor(getThemedColor(i14));
            }
            if (getTitleView() != null) {
                getTitleView().setTextColor(getThemedColor(i15));
            }
            setBackgroundColor(getThemedColor(i16));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void updateColors() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Sh);
        TextView textView = this.d;
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(24.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        int themedColor2 = getThemedColor(i10);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.k6.Qh);
        textView.setBackground(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, themedColor2, themedColor3, themedColor3));
        TextView textView2 = this.e;
        if (textView2 != null) {
            textView2.setTextColor(getThemedColor(i10));
            textView2.setBackground(org.telegram.ui.ActionBar.k6.g0(i0.a.o(getThemedColor(i10), Math.min(255, Color.alpha(getThemedColor(org.telegram.ui.ActionBar.k6.i6)) * 2)), 7, -1));
        }
        int i11 = org.telegram.ui.ActionBar.k6.y6;
        int themedColor4 = getThemedColor(i11);
        TextView textView3 = this.c;
        textView3.setTextColor(themedColor4);
        textView3.setTextColor(getThemedColor(i11));
        if (getTitleView() != null) {
            getTitleView().setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.G6));
        }
        setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.h5));
    }
}
