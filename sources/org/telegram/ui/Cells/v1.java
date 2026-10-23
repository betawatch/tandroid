package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class v1 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final TextView a;
    public final ImageView b;
    public final FrameLayout c;
    public final org.telegram.ui.ActionBar.g6 d;
    public int e;

    public v1(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = g6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setBackgroundResource(R.drawable.newmsg_divider);
        Drawable background = frameLayout.getBackground();
        int i10 = org.telegram.ui.ActionBar.k6.Fe;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.z(frameLayout, background, i10, g6Var, mode);
        addView(frameLayout, w7.z5.d(-1, 27.0f, 51, 0.0f, 7.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(R.drawable.ic_ab_new);
        int i11 = org.telegram.ui.ActionBar.k6.De;
        Integer valueOf = g6Var != null ? Integer.valueOf(g6Var.g(i11)) : null;
        imageView.setColorFilter(new PorterDuffColorFilter(valueOf != null ? valueOf.intValue() : org.telegram.ui.ActionBar.k6.x0(null, i11, false), mode));
        imageView.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        frameLayout.addView(imageView, w7.z5.d(-2, -2.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setPadding(0, 0, 0, AndroidUtilities.dp(1.0f));
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.Ee, g6Var);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, w7.z5.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
    }

    public FrameLayout getBackgroundLayout() {
        return this.c;
    }

    public ImageView getImageView() {
        return this.b;
    }

    public TextView getTextView() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), TLObject.FLAG_30));
    }

    public void setText(String str) {
        this.a.setText(str);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            int i10 = org.telegram.ui.ActionBar.k6.De;
            org.telegram.ui.ActionBar.g6 g6Var = this.d;
            Integer valueOf = g6Var != null ? Integer.valueOf(g6Var.g(i10)) : null;
            int intValue = valueOf != null ? valueOf.intValue() : org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            ImageView imageView = this.b;
            if (imageView != null && intValue != this.e) {
                this.e = intValue;
                imageView.setColorFilter(new PorterDuffColorFilter(intValue, PorterDuff.Mode.MULTIPLY));
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
