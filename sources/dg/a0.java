package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a0 extends FrameLayout {
    public final RadioButton a;
    public final Drawable b;
    public final Drawable c;
    public final j6 d;
    public final j6 e;
    public final TextView f;
    public final SpannableString h;
    public final SpannableString n;
    public TL_stars.TL_starsGiveawayOption r;
    public int s;
    public final y5 v;

    public a0(Context context, b6 b6Var) {
        super(context);
        this.v = new y5(this, 0L, 500L, gr.h);
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_outline).mutate();
        this.b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.h5, b6Var), PorterDuff.Mode.SRC_IN));
        this.c = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        setWillNotDraw(false);
        j6 j6Var = new j6(context, false, false, false);
        this.d = j6Var;
        j6Var.setTextColor(f6.v0(f6.G6, b6Var));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setTextSize(AndroidUtilities.dp(16.0f));
        addView(j6Var, e6.d(-1, 20.0f, 51, 64.0f, 8.0f, 80.0f, 0.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new q80(AndroidUtilities.dp(90.0f), j6Var), 0, 1, 33);
        j6 j6Var2 = new j6(context, false, true, true);
        this.e = j6Var2;
        int i9 = f6.z6;
        j6Var2.setTextColor(f6.v0(i9, b6Var));
        j6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        addView(j6Var2, e6.d(-1, 14.0f, 51, 64.0f, 31.0f, 80.0f, 0.0f));
        SpannableString spannableString2 = new SpannableString("x");
        this.n = spannableString2;
        spannableString2.setSpan(new q80(AndroidUtilities.dp(70.0f), j6Var2), 0, 1, 33);
        TextView textView = new TextView(context);
        this.f = textView;
        ll.n(i9, b6Var, textView, 1, 16.0f);
        textView.setGravity(5);
        addView(textView, e6.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.a = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(f6.v0(f6.j7, b6Var), f6.v0(f6.E5, b6Var));
        addView(radioButton, e6.d(20, 20.0f, 19, 22.0f, 0.0f, 0.0f, 0.0f));
    }

    public TL_stars.TL_starsGiveawayOption getOption() {
        return this.r;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float d = this.v.d(this.s, false);
        float dp = AndroidUtilities.dp(24.0f);
        float dp2 = AndroidUtilities.dp(24.0f);
        float dp3 = AndroidUtilities.dp(2.5f);
        float dp4 = AndroidUtilities.dp(64.0f);
        float dp5 = AndroidUtilities.dp(8.0f);
        for (int ceil = ((int) Math.ceil(d)) - 1; ceil >= 0; ceil--) {
            float clamp = Utilities.clamp(d - ceil, 1.0f, 0.0f);
            float f10 = (((ceil - 1) - (1.0f - clamp)) * dp3 * 1.0f) + dp4;
            int i9 = (int) f10;
            int i10 = (int) dp5;
            int i11 = (int) (f10 + dp);
            int i12 = (int) (dp5 + dp2);
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
        this.d.setTranslationX((dp3 * d) + AndroidUtilities.dp(22.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
    }
}
