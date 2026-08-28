package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ui extends FrameLayout implements org.telegram.ui.ActionBar.w5 {
    public final org.telegram.ui.ActionBar.b6 a;
    public final TextView b;
    public final TextView c;

    public ui(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.a = b6Var;
        setPadding(0, AndroidUtilities.dp(42.0f), 0, AndroidUtilities.dp(42.0f));
        setTag(-33024);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, g7.e6.q(-1, -2, 17));
        o9 o9Var = new o9(context);
        o9Var.setImageDrawable(new mi0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), "utyan_empty", AndroidUtilities.dp(120.0f)));
        linearLayout.addView(o9Var, g7.e6.t(120, 120, 17, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        TextView h = j3.r0.h(linearLayout, textView, g7.e6.t(-1, -2, 17, 32, 12, 32, 8), context);
        this.c = h;
        h.setTextSize(1, 14.0f);
        h.setGravity(17);
        linearLayout.addView(h, g7.e6.t(-1, -2, 17, 32, 0, 32, 0));
        d();
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        this.b.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        this.c.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.y6, b6Var));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), i10);
    }
}
