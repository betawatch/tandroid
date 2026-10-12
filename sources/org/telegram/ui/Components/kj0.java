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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public class kj0 extends org.telegram.ui.ActionBar.e3 {
    public final Bitmap b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final int f;
    public final bk0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj0(Context context, String str, String str2, String str3, boolean z10) {
        super(1, context, (org.telegram.ui.ActionBar.c6) null, false);
        Bitmap bitmap = null;
        fixNavigationBar();
        setTitle(str, true);
        ig.k kVar = new ig.k(context, 3);
        kVar.setScaleType(ImageView.ScaleType.FIT_XY);
        kVar.setOutlineProvider(new bi.a2(15));
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
        org.telegram.ui.nm0 nm0Var = new org.telegram.ui.nm0(this, context, kVar);
        nm0Var.addView(kVar, w7.a6.d(-1.0f, -1));
        nm0Var.addView(bk0Var, w7.a6.e(60, 60, 17));
        linearLayout.addView(nm0Var, w7.a6.t(220, 220, 1, 30, 0, 30, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setText(str3);
        textView.setGravity(1);
        linearLayout.addView(textView, w7.a6.a(-2.0f, 40.0f, 8.0f, 40.0f, 8.0f, -1, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setOnClickListener(new rt(12, this, context));
        linearLayout.addView(textView2, w7.a6.t(-1, 48, 80, 16, 15, 16, 3));
        if (z10) {
            TextView textView3 = new TextView(context);
            this.e = textView3;
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setText(LocaleController.getString(R.string.ShareLink));
            textView3.setOnClickListener(new rt(13, str2, context));
            linearLayout.addView(textView3, w7.a6.t(-1, 48, 80, 16, 3, 16, 16));
        }
        d();
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
    }

    public final void d() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.Sh);
        TextView textView = this.d;
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(24.0f);
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        int themedColor2 = getThemedColor(i10);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.g6.Qh);
        textView.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, themedColor2, themedColor3, themedColor3));
        TextView textView2 = this.e;
        if (textView2 != null) {
            textView2.setTextColor(getThemedColor(i10));
            textView2.setBackground(org.telegram.ui.ActionBar.g6.g0(i0.a.k(getThemedColor(i10), Math.min(255, Color.alpha(getThemedColor(org.telegram.ui.ActionBar.g6.i6)) * 2)), 7, -1));
        }
        int i11 = org.telegram.ui.ActionBar.g6.y6;
        int themedColor4 = getThemedColor(i11);
        TextView textView3 = this.c;
        textView3.setTextColor(themedColor4);
        textView3.setTextColor(getThemedColor(i11));
        if (getTitleView() != null) {
            getTitleView().setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
        }
        setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.h5));
    }

    public final void n(int i10) {
        bk0 bk0Var = this.h;
        bk0Var.setAutoRepeat(true);
        bk0Var.f(i10, 60, 60, null);
        bk0Var.d();
    }
}
