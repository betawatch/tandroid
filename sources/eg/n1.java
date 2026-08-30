package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.e90;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class n1 extends LinearLayout {
    public int a;
    public final TextView b;
    public final e90 c;
    public LinearLayout d;
    public final x0 e;
    public final ViewGroup f;
    public boolean h;
    public final /* synthetic */ o1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n1(o1 o1Var, Context context, int i10) {
        super(context);
        this.n = o1Var;
        setOrientation(1);
        ViewGroup A = o1Var.A(context, i10);
        this.f = A;
        addView(A);
        this.e = (x0) A;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setGravity(1);
        int i11 = j6.j5;
        textView.setTextColor(o1Var.getThemedColor(i11));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, b6.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        e90 e90Var = new e90(context, null);
        this.c = e90Var;
        e90Var.setGravity(1);
        e90Var.setTextSize(1, 15.0f);
        e90Var.setTextColor(o1Var.getThemedColor(i11));
        if (!o1Var.B) {
            e90Var.setLines(2);
        }
        addView(e90Var, b6.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.f) {
            return super.drawChild(canvas, view, j10);
        }
        boolean z4 = view instanceof b;
        if (z4) {
            setTranslationY(0.0f);
        } else {
            setTranslationY(this.n.I);
        }
        if (z4) {
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
        boolean z4 = viewGroup instanceof b;
        o1 o1Var = this.n;
        if (z4) {
            ((b) viewGroup).setTopOffset(o1Var.I);
        }
        viewGroup.getLayoutParams().height = o1Var.s;
        e90 e90Var = this.c;
        e90Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
            textView.setVisibility(8);
            e90Var.setVisibility(8);
            super.onMeasure(i10, i11);
        }
    }
}
