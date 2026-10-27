package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class wc extends LinearLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.u6 b;
    public final org.telegram.ui.Components.y9 c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final TextView n;
    public boolean r;
    public boolean s;

    public wc(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.a = i10;
        this.b = u6Var;
        setOrientation(0);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(y9Var, kb1.t(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, kb1.t(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.d = b6Var;
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.Y(b6Var, i11, u6Var);
        b6Var.setTextSize(16);
        b6Var.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(b6Var);
        linearLayout.addView(b6Var, kb1.o(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.e = textView;
        org.telegram.ui.ActionBar.f7.V(textView, i11, u6Var);
        textView.setTextSize(1, 13.0f);
        textView.setVisibility(8);
        TextView e = wh.e(linearLayout, textView, kb1.o(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f = e;
        int i12 = org.telegram.ui.ActionBar.y6.z6;
        org.telegram.ui.ActionBar.f7.V(e, i12, u6Var);
        e.setTextSize(1, 14.0f);
        linearLayout.addView(e, kb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, kb1.t(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        org.telegram.messenger.t.r(textView2, i11, u6Var, 1, 16.0f);
        textView2.setGravity(5);
        TextView e10 = wh.e(linearLayout2, textView2, kb1.x(-1, -2, 5, 0, 0, 0, 1), context);
        this.n = e10;
        org.telegram.ui.ActionBar.f7.V(e10, i12, u6Var);
        e10.setTextSize(1, 13.0f);
        e10.setGravity(5);
        linearLayout2.addView(e10, kb1.x(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.y6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.r ? 68.0f : 58.0f), TLObject.FLAG_30));
    }
}
