package cg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.y80;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o1 extends LinearLayout {
    public int a;
    public final TextView b;
    public final y80 c;
    public LinearLayout d;
    public final y0 e;
    public final ViewGroup f;
    public boolean h;
    public final /* synthetic */ p1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o1(p1 p1Var, Context context, int i10) {
        super(context);
        this.n = p1Var;
        setOrientation(1);
        ViewGroup A = p1Var.A(context, i10);
        this.f = A;
        addView(A);
        this.e = (y0) A;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setGravity(1);
        int i11 = g6.j5;
        textView.setTextColor(p1Var.getThemedColor(i11));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, f6.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        y80 y80Var = new y80(context, null);
        this.c = y80Var;
        y80Var.setGravity(1);
        y80Var.setTextSize(1, 15.0f);
        y80Var.setTextColor(p1Var.getThemedColor(i11));
        if (!p1Var.A) {
            y80Var.setLines(2);
        }
        addView(y80Var, f6.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.f) {
            return super.drawChild(canvas, view, j10);
        }
        boolean z10 = view instanceof b;
        if (z10) {
            setTranslationY(0.0f);
        } else {
            setTranslationY(this.n.H);
        }
        if (z10) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        TextView textView = this.b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f;
        boolean z10 = viewGroup instanceof b;
        p1 p1Var = this.n;
        if (z10) {
            ((b) viewGroup).setTopOffset(p1Var.H);
        }
        viewGroup.getLayoutParams().height = p1Var.s;
        y80 y80Var = this.c;
        y80Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
            textView.setVisibility(8);
            y80Var.setVisibility(8);
            super.onMeasure(i10, i11);
        }
    }
}
