package ig;

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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Components.mq;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class b extends FrameLayout {
    public final k5 a;
    public final ImageView b;

    public b(Context context, f6 f6Var) {
        super(context);
        k5 k5Var = new k5(context);
        this.a = k5Var;
        k5Var.setTextSize(16);
        k5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        int i10 = j6.L6;
        k5Var.setTextColor(j6.v0(i10, f6Var));
        k5Var.setTag(Integer.valueOf(i10));
        addView(k5Var);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        k5Var.k(LocaleController.getString(R.string.BoostingAddChannelOrGroup));
        Drawable drawable = getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = getResources().getDrawable(R.drawable.poll_add_plus);
        int v02 = j6.v0(j6.N6, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.k7, f6Var), mode));
        imageView.setImageDrawable(new mq(drawable, drawable2));
        setBackgroundColor(j6.v0(j6.h5, f6Var));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int dp;
        int i14 = i12 - i10;
        k5 k5Var = this.a;
        int textHeight = ((i13 - i11) - k5Var.getTextHeight()) / 2;
        boolean z10 = LocaleController.isRTL;
        ImageView imageView = this.b;
        if (z10) {
            dp = (getMeasuredWidth() - k5Var.getMeasuredWidth()) - AndroidUtilities.dp(imageView.getVisibility() == 0 ? 68.0f : 23.0f);
        } else {
            dp = AndroidUtilities.dp(imageView.getVisibility() == 0 ? 68.0f : 23.0f);
        }
        k5Var.layout(dp, textHeight, k5Var.getMeasuredWidth() + dp, k5Var.getMeasuredHeight() + textHeight);
        int dp2 = !LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : (i14 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(24.0f);
        imageView.layout(dp2, 0, imageView.getMeasuredWidth() + dp2, imageView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        this.a.measure(org.telegram.ui.b.d(94.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f));
    }
}
