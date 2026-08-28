package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class ha extends LinearLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.b6 b;
    public final org.telegram.ui.Components.o9 c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final TextView n;
    public boolean r;
    public boolean s;

    public ha(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.a = i9;
        this.b = b6Var;
        setOrientation(0);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.c = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(o9Var, g7.e6.p(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, g7.e6.p(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var;
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        h5Var.setTextSize(16);
        h5Var.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(h5Var);
        linearLayout.addView(h5Var, g7.e6.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.e = textView;
        ll.n(i10, b6Var, textView, 1, 13.0f);
        textView.setVisibility(8);
        TextView h = j3.r0.h(linearLayout, textView, g7.e6.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f = h;
        int i11 = org.telegram.ui.ActionBar.f6.z6;
        ll.n(i11, b6Var, h, 1, 14.0f);
        linearLayout.addView(h, g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, g7.e6.p(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        org.telegram.ui.Cells.j2.o(i10, b6Var, textView2, 1, 16.0f);
        textView2.setGravity(5);
        TextView h10 = j3.r0.h(linearLayout2, textView2, g7.e6.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.n = h10;
        ll.n(i11, b6Var, h10, 1, 13.0f);
        h10.setGravity(5);
        linearLayout2.addView(h10, g7.e6.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.f6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.r ? 68.0f : 58.0f), TLObject.FLAG_30));
    }
}
