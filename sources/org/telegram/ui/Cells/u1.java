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
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class u1 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final TextView a;
    public final ImageView b;
    public final FrameLayout c;
    public final org.telegram.ui.ActionBar.u6 d;
    public int e;

    public u1(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.d = u6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setBackgroundResource(R.drawable.newmsg_divider);
        Drawable background = frameLayout.getBackground();
        int i10 = org.telegram.ui.ActionBar.y6.Fe;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.y(frameLayout, background, i10, u6Var, mode);
        addView(frameLayout, kb1.h(-1, 27.0f, 51, 0.0f, 7.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(R.drawable.ic_ab_new);
        int i11 = org.telegram.ui.ActionBar.y6.De;
        Integer valueOf = u6Var != null ? Integer.valueOf(u6Var.g(i11)) : null;
        imageView.setColorFilter(new PorterDuffColorFilter(valueOf != null ? valueOf.intValue() : org.telegram.ui.ActionBar.y6.x0(null, i11, false), mode));
        imageView.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        frameLayout.addView(imageView, kb1.h(-2, -2.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setPadding(0, 0, 0, AndroidUtilities.dp(1.0f));
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Ee, u6Var);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, kb1.h(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            int i10 = org.telegram.ui.ActionBar.y6.De;
            org.telegram.ui.ActionBar.u6 u6Var = this.d;
            Integer valueOf = u6Var != null ? Integer.valueOf(u6Var.g(i10)) : null;
            int intValue = valueOf != null ? valueOf.intValue() : org.telegram.ui.ActionBar.y6.x0(null, i10, false);
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

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
