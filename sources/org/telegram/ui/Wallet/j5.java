package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TelegramQRCodeWriter;
import org.telegram.ui.Components.bs;
import org.telegram.ui.vf1;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class j5 extends FrameLayout {
    public final TextView a;
    public final FrameLayout b;
    public final FrameLayout c;
    public final FrameLayout d;
    public r0 e;
    public boolean f;
    public boolean h;
    public ValueAnimator n;

    public j5(Context context, String str) {
        super(context);
        Bitmap bitmap;
        ActivityManager activityManager;
        addView(new a5(context, str), w7.z5.e(-1, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(20.0f), -1));
        frameLayout.setCameraDistance(AndroidUtilities.dp(8000.0f));
        addView(frameLayout, w7.z5.a(244.0f, 0.0f, 22.0f, 0.0f, 0.0f, 212, 49));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.c = frameLayout2;
        frameLayout.addView(frameLayout2, w7.z5.d(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, w7.z5.a(164.0f, 0.0f, 24.0f, 0.0f, 0.0f, 164, 49));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        boolean z10 = SharedConfig.getDevicePerformanceClass() == 0 || LiteMode.isPowerSaverApplied() || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || activityManager.getDeviceConfigurationInfo().reqGlEsVersion < 196608;
        float[] fArr = new float[1];
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(dc.b.a, ic.c.d);
            hashMap.put(dc.b.c, 0);
            TelegramQRCodeWriter telegramQRCodeWriter = new TelegramQRCodeWriter();
            telegramQRCodeWriter.setCenterDrawable(!z10 ? new ColorDrawable(0) : context.getResources().getDrawable(R.drawable.mini_gram_72).mutate());
            bitmap = telegramQRCodeWriter.encode("ton://transfer/".concat(str), 768, 768, hashMap, null);
            fArr[0] = telegramQRCodeWriter.getImageSize() / bitmap.getWidth();
        } catch (Exception e) {
            FileLog.e(e);
            bitmap = null;
        }
        imageView.setImageBitmap(bitmap);
        frameLayout3.addView(imageView, w7.z5.d(-1.0f, -1));
        if (!z10) {
            float f7 = fArr[0];
            if (f7 > 0.0f) {
                int round = Math.round(f7 * 164.0f * 1.35f);
                frameLayout3.addView(new l8(context), w7.z5.e(round, round, 17));
            }
        }
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setText(LocaleController.getString(R.string.WalletCopyAddress));
        textView.setTextColor(-15556886);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int dp = AndroidUtilities.dp(18.0f);
        textView.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, -984578, -1903620, -1903620));
        Drawable mutate = context.getResources().getDrawable(R.drawable.wallet_copy).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        mutate.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView.setCompoundDrawables(mutate, null, null, null);
        w7.b6.a(textView);
        this.c.addView(textView, w7.z5.a(28.0f, 0.0f, 202.0f, 0.0f, 0.0f, -2, 49));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.d = frameLayout4;
        frameLayout4.setVisibility(4);
        frameLayout4.setRotationY(180.0f);
        this.b.addView(frameLayout4, w7.z5.d(-1.0f, -1));
        TextView textView2 = new TextView(context);
        String replace = str.replace(" ", "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = 0;
        int i11 = 0;
        while (i10 < replace.length()) {
            if (i11 > 0) {
                spannableStringBuilder.append(i11 % 3 == 0 ? '\n' : ' ');
            }
            int length = spannableStringBuilder.length();
            int i12 = i10 + 4;
            spannableStringBuilder.append((CharSequence) replace, i10, Math.min(i12, replace.length()));
            if ((i11 & 1) != 0) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(-7434605), length, spannableStringBuilder.length(), 33);
            }
            i11++;
            i10 = i12;
        }
        textView2.setText(spannableStringBuilder);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(1, 18.0f);
        textView2.setTypeface(l5.m0(context));
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setMaxLines(4);
        textView2.setLineSpacing(0.0f, 1.0f);
        TextView k10 = org.telegram.ui.Cells.t0.k(this.d, textView2, w7.z5.a(112.0f, 8.0f, 32.0f, 8.0f, 0.0f, -1, 55), context);
        k10.setText(LocaleController.getString(R.string.WalletAddressCopiedShort));
        k10.setTextColor(-15556886);
        k10.setTextSize(1, 14.0f);
        k10.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        k10.setGravity(17);
        k10.setCompoundDrawablePadding(AndroidUtilities.dp(3.0f));
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.msg_text_check).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        mutate2.setBounds(0, 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        k10.setCompoundDrawables(mutate2, null, null, null);
        TextView k11 = org.telegram.ui.Cells.t0.k(this.d, k10, w7.z5.a(28.0f, 0.0f, 149.0f, 0.0f, 0.0f, -2, 49), context);
        k11.setText(LocaleController.getString(R.string.WalletShowMyQR));
        k11.setTextColor(-15556886);
        k11.setTextSize(1, 14.0f);
        k11.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        k11.setGravity(17);
        k11.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int dp2 = AndroidUtilities.dp(18.0f);
        k11.setBackground(org.telegram.ui.ActionBar.h6.j0(dp2, dp2, dp2, dp2, -984578, -1903620, -1903620));
        w7.b6.a(k11);
        this.d.addView(k11, w7.z5.a(28.0f, 0.0f, 202.0f, 0.0f, 0.0f, -2, 49));
        final int i13 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.i5
            public final /* synthetic */ j5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        j5 j5Var = this.b;
                        if (!j5Var.f && !j5Var.h) {
                            r0 r0Var = j5Var.e;
                            if (r0Var != null) {
                                r0Var.run();
                            }
                            j5Var.a(true);
                            break;
                        }
                        break;
                    default:
                        this.b.a(false);
                        break;
                }
            }
        };
        frameLayout3.setOnClickListener(onClickListener);
        this.a.setOnClickListener(onClickListener);
        final int i14 = 1;
        k11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.i5
            public final /* synthetic */ j5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        j5 j5Var = this.b;
                        if (!j5Var.f && !j5Var.h) {
                            r0 r0Var = j5Var.e;
                            if (r0Var != null) {
                                r0Var.run();
                            }
                            j5Var.a(true);
                            break;
                        }
                        break;
                    default:
                        this.b.a(false);
                        break;
                }
            }
        });
    }

    public final void a(boolean z10) {
        if (this.f == z10 || this.h) {
            return;
        }
        this.h = true;
        this.f = z10;
        FrameLayout frameLayout = this.b;
        frameLayout.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(frameLayout.getRotationY(), z10 ? 180.0f : 0.0f);
        this.n = ofFloat;
        ofFloat.setDuration(420L);
        this.n.setInterpolator(bs.h);
        this.n.addUpdateListener(new u2(this, 3));
        this.n.addListener(new vf1(this, 5));
        this.n.start();
    }
}
