package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class e3 extends FrameLayout {
    public final LinearLayout a;
    public boolean b;
    public final org.telegram.ui.Components.w9 c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final bi.d h;
    public ValueAnimator n;
    public boolean r;

    public e3(Context context) {
        super(context);
        this.r = true;
        setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(3);
        addView(linearLayout, w7.a6.e(-2, -2, 17));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.c = w9Var;
        linearLayout.addView(w9Var, w7.a6.n(100, 100));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 19.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        TextView g10 = com.google.android.gms.internal.vision.e2.g(linearLayout, textView, w7.a6.t(-2, -2, 3, 0, 4, 0, 2), context);
        this.e = g10;
        g10.setTextSize(1, 15.0f);
        g10.setTextColor(-1);
        g10.setSingleLine(false);
        g10.setMaxLines(3);
        TextView g11 = com.google.android.gms.internal.vision.e2.g(linearLayout, g10, w7.a6.t(-2, -2, 3, 0, 0, 0, 1), context);
        this.f = g11;
        g11.setTextSize(1, 12.0f);
        g11.setTextColor(-1);
        g11.setAlpha(0.4f);
        linearLayout.addView(g11, w7.a6.q(-2, -2, 3));
        bi.d dVar = new bi.d(context, null, true);
        this.h = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(140.0f));
        dVar.g(LocaleController.getString(R.string.Refresh), false, true);
        linearLayout.addView(dVar, w7.a6.t(-2, 40, 3, 0, 12, 0, 0));
    }

    public final void a(String str, String str2) {
        this.d.setText(LocaleController.getString(R.string.WebErrorTitle));
        org.telegram.messenger.em.p(R.string.WebErrorInfoBot, new Object[]{str}, this.e);
        this.f.setText(str2);
    }

    public final void b(boolean z10, boolean z11) {
        if (this.r == z10) {
            return;
        }
        this.r = z10;
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z11) {
            this.d.setTextColor(!z10 ? -16777216 : -1);
            this.e.setTextColor(!z10 ? -16777216 : -1);
            this.f.setTextColor(z10 ? -1 : -16777216);
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            this.n = ofFloat;
            ofFloat.addUpdateListener(new d3(this, 0));
            this.n.start();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 0 || this.b) {
            return;
        }
        this.b = true;
        MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(this.c, AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME, "🧐", "100_100");
    }
}
