package gh;

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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class ba extends FrameLayout {
    public final org.telegram.ui.ActionBar.b6 a;
    public final Drawable b;
    public final Drawable c;
    public final TextView d;
    public final org.telegram.ui.Components.j6 e;
    public SpannableString f;
    public boolean h;
    public int n;
    public final org.telegram.ui.Components.y5 r;

    public ba(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.r = new org.telegram.ui.Components.y5(this, 0L, 500L, gr.h);
        this.a = b6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_outline).mutate();
        this.b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, b6Var), PorterDuff.Mode.SRC_IN));
        this.c = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.d = textView;
        ll.k(15.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        addView(textView, g7.e6.i(-2.0f, -2.0f, 8388627, 48.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.e = j6Var;
        j6Var.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.z6, b6Var));
        j6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(j6Var, g7.e6.i(-2.0f, 21.0f, 8388629, 0.0f, 0.0f, 19.0f, 0.0f));
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
            int i9 = (int) f11;
            int i10 = (int) measuredHeight;
            int i11 = (int) (f11 + dp);
            int i12 = (int) (measuredHeight + dp2);
            Drawable drawable = this.b;
            drawable.setBounds(i9, i10, i11, i12);
            int i13 = (int) (clamp * 255.0f);
            drawable.setAlpha(i13);
            drawable.draw(canvas);
            Drawable drawable2 = this.c;
            drawable2.setBounds(i9, i10, i11, i12);
            drawable2.setAlpha(i13);
            drawable2.draw(canvas);
        }
        if (this.h) {
            org.telegram.ui.ActionBar.b6 b6Var = this.a;
            Paint O = b6Var != null ? b6Var.O("paintDivider") : null;
            if (O == null) {
                O = org.telegram.ui.ActionBar.f6.k0;
            }
            canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : 0), getMeasuredHeight(), O);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }
}
