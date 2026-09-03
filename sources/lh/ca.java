package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class ca extends LinearLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.f6 b;
    public final org.telegram.ui.Components.p9 c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final TextView n;
    public boolean r;
    public boolean s;

    public ca(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = i10;
        this.b = f6Var;
        setOrientation(0);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.c = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(p9Var, k7.b6.p(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, k7.b6.p(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        k5Var.setTextSize(16);
        k5Var.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(k5Var);
        linearLayout.addView(k5Var, k7.b6.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.e = textView;
        org.telegram.ui.b.l(i11, f6Var, textView, 1, 13.0f);
        textView.setVisibility(8);
        TextView i12 = ai.i(linearLayout, textView, k7.b6.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f = i12;
        int i13 = org.telegram.ui.ActionBar.j6.z6;
        org.telegram.ui.b.l(i13, f6Var, i12, 1, 14.0f);
        linearLayout.addView(i12, k7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, k7.b6.p(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        org.telegram.ui.b.w(i11, f6Var, textView2, 1, 16.0f);
        textView2.setGravity(5);
        TextView i14 = ai.i(linearLayout2, textView2, k7.b6.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.n = i14;
        org.telegram.ui.b.l(i13, f6Var, i14, 1, 13.0f);
        i14.setGravity(5);
        linearLayout2.addView(i14, k7.b6.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.r ? 68.0f : 58.0f), TLObject.FLAG_30));
    }
}
