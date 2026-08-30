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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class f3 extends FrameLayout {
    public final LinearLayout a;
    public boolean b;
    public final org.telegram.ui.Components.p9 c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final ph.d h;
    public ValueAnimator n;
    public boolean r;

    public f3(Context context) {
        super(context);
        this.r = true;
        setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(3);
        addView(linearLayout, k7.b6.e(-2, -2, 17));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.c = p9Var;
        linearLayout.addView(p9Var, k7.b6.n(100, 100));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 19.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        TextView j10 = yh.j(linearLayout, textView, k7.b6.t(-2, -2, 3, 0, 4, 0, 2), context);
        this.e = j10;
        j10.setTextSize(1, 15.0f);
        j10.setTextColor(-1);
        j10.setSingleLine(false);
        j10.setMaxLines(3);
        TextView j11 = yh.j(linearLayout, j10, k7.b6.t(-2, -2, 3, 0, 0, 0, 1), context);
        this.f = j11;
        j11.setTextSize(1, 12.0f);
        j11.setTextColor(-1);
        j11.setAlpha(0.4f);
        linearLayout.addView(j11, k7.b6.q(-2, -2, 3));
        ph.d dVar = new ph.d(context, null, true);
        this.h = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(140.0f));
        dVar.g(LocaleController.getString(R.string.Refresh), false, true);
        linearLayout.addView(dVar, k7.b6.t(-2, 40, 3, 0, 12, 0, 0));
    }

    public final void a(String str, String str2) {
        this.d.setText(LocaleController.getString(R.string.WebErrorTitle));
        b.o(R.string.WebErrorInfoBot, new Object[]{str}, this.e);
        this.f.setText(str2);
    }

    public final void b(boolean z4, boolean z10) {
        if (this.r == z4) {
            return;
        }
        this.r = z4;
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            this.d.setTextColor(!z4 ? -16777216 : -1);
            this.e.setTextColor(!z4 ? -16777216 : -1);
            this.f.setTextColor(z4 ? -1 : -16777216);
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(z4 ? 0.0f : 1.0f, z4 ? 1.0f : 0.0f);
            this.n = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 0));
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
