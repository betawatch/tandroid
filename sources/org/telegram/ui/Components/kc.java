package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class kc extends nb {
    public final yj0 a;
    public final q6 b;
    public final q6 c;
    public final int d;

    public kc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        int i10 = org.telegram.ui.ActionBar.h6.Hi;
        this.d = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
        yj0 yj0Var = new yj0(context);
        this.a = yj0Var;
        yj0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(yj0Var, w7.z5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        getThemedColor(org.telegram.ui.ActionBar.h6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        q6 q6Var = new q6(context, true, true, true);
        this.b = q6Var;
        q6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        q6Var.setTextColor(themedColor);
        q6Var.setTextSize(AndroidUtilities.dp(14.0f));
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setEllipsizeByGradient(true);
        linearLayout.addView(q6Var, w7.z5.n(-1, 20));
        q6 q6Var2 = new q6(context, true, true, true);
        this.c = q6Var2;
        q6Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        q6Var2.setTextColor(themedColor);
        q6Var2.setTypeface(Typeface.SANS_SERIF);
        q6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        q6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(q6Var2, w7.z5.n(-1, 18));
    }

    public final void c(int i10, String... strArr) {
        yj0 yj0Var = this.a;
        yj0Var.f(i10, 32, 32, null);
        for (String str : strArr) {
            yj0Var.h(this.d, str);
        }
    }

    @Override // org.telegram.ui.Components.ub
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }

    @Override // org.telegram.ui.Components.ub
    public final void onShow() {
        super.onShow();
        this.a.d();
    }
}
