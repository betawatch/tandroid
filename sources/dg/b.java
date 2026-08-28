package dg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.fq;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b extends FrameLayout {
    public final h5 a;
    public final ImageView b;

    public b(Context context, b6 b6Var) {
        super(context);
        h5 h5Var = new h5(context);
        this.a = h5Var;
        h5Var.setTextSize(16);
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        int i9 = f6.L6;
        h5Var.setTextColor(f6.v0(i9, b6Var));
        h5Var.setTag(Integer.valueOf(i9));
        addView(h5Var);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        h5Var.k(LocaleController.getString(R.string.BoostingAddChannelOrGroup));
        Drawable drawable = getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = getResources().getDrawable(R.drawable.poll_add_plus);
        int v02 = f6.v0(f6.N6, b6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.k7, b6Var), mode));
        imageView.setImageDrawable(new fq(drawable, drawable2));
        setBackgroundColor(f6.v0(f6.h5, b6Var));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int dp;
        int i13 = i11 - i9;
        h5 h5Var = this.a;
        int textHeight = ((i12 - i10) - h5Var.getTextHeight()) / 2;
        boolean z11 = LocaleController.isRTL;
        ImageView imageView = this.b;
        if (z11) {
            dp = (getMeasuredWidth() - h5Var.getMeasuredWidth()) - AndroidUtilities.dp(imageView.getVisibility() == 0 ? 68.0f : 23.0f);
        } else {
            dp = AndroidUtilities.dp(imageView.getVisibility() == 0 ? 68.0f : 23.0f);
        }
        h5Var.layout(dp, textHeight, h5Var.getMeasuredWidth() + dp, h5Var.getMeasuredHeight() + textHeight);
        int dp2 = !LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : (i13 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(24.0f);
        imageView.layout(dp2, 0, imageView.getMeasuredWidth() + dp2, imageView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        this.a.measure(ll.d(94.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f));
    }
}
