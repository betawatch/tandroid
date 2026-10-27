package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class g8 extends LinearLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;

    public g8(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        setOrientation(0);
        this.a = u6Var;
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(13.0f), 0);
        LinearLayout d = wh.d(context, 1);
        d.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f));
        addView(d, kb1.t(0, -2, 1.0f, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        TextView e = wh.e(d, textView, kb1.x(-1, -2, 55, 0, 0, 0, 2), context);
        this.c = e;
        e.setTextSize(1, 14.0f);
        d.addView(e, kb1.x(-1, -2, 55, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, kb1.x(21, 21, 21, 9, 0, 0, 0));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z6));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        this.b.setTextColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        int i11 = org.telegram.ui.ActionBar.y6.z6;
        this.c.setTextColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        this.d.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(i11, u6Var), PorterDuff.Mode.SRC_IN));
    }
}
