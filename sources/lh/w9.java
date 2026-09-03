package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class w9 extends FrameLayout {
    public final org.telegram.ui.ActionBar.f6 a;
    public final Drawable b;
    public final Drawable c;
    public final TextView d;
    public final org.telegram.ui.Components.k6 e;
    public SpannableString f;
    public boolean h;
    public int n;
    public final org.telegram.ui.Components.z5 r;

    public w9(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.r = new org.telegram.ui.Components.z5(this, 0L, 500L, mr.h);
        this.a = f6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_outline).mutate();
        this.b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var), PorterDuff.Mode.SRC_IN));
        this.c = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.ui.b.g(15.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        addView(textView, k7.b6.i(-2.0f, -2.0f, 8388627, 48.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, false, false);
        this.e = k6Var;
        k6Var.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var));
        k6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(k6Var, k7.b6.i(-2.0f, 21.0f, 8388629, 0.0f, 0.0f, 19.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float d = this.r.d(this.n, false);
        float f10 = LocaleController.isRTL ? -1.0f : 1.0f;
        float dp = AndroidUtilities.dp(24.0f);
        float dp2 = AndroidUtilities.dp(24.0f);
        float dp3 = AndroidUtilities.dp(2.5f);
        float width = LocaleController.isRTL ? (getWidth() - AndroidUtilities.dp(19.0f)) - dp : AndroidUtilities.dp(19.0f);
        for (int ceil = ((int) Math.ceil(d)) - 1; ceil >= 0; ceil--) {
            float clamp = Utilities.clamp(d - ceil, 1.0f, 0.0f);
            float f11 = (((ceil - 1) - (1.0f - clamp)) * dp3 * f10) + width;
            float measuredHeight = (getMeasuredHeight() - dp2) / 2.0f;
            int i10 = (int) f11;
            int i11 = (int) measuredHeight;
            int i12 = (int) (f11 + dp);
            int i13 = (int) (measuredHeight + dp2);
            Drawable drawable = this.b;
            drawable.setBounds(i10, i11, i12, i13);
            int i14 = (int) (clamp * 255.0f);
            drawable.setAlpha(i14);
            drawable.draw(canvas);
            Drawable drawable2 = this.c;
            drawable2.setBounds(i10, i11, i12, i13);
            drawable2.setAlpha(i14);
            drawable2.draw(canvas);
        }
        if (this.h) {
            org.telegram.ui.ActionBar.f6 f6Var = this.a;
            Paint G = f6Var != null ? f6Var.G("paintDivider") : null;
            if (G == null) {
                G = org.telegram.ui.ActionBar.j6.k0;
            }
            canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : 0), getMeasuredHeight(), G);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }
}
