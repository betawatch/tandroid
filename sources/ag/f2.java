package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.p80;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class f2 extends LinearLayout {
    public int a;
    public final TextView b;
    public final p80 c;
    public LinearLayout d;
    public final l1 e;
    public final ViewGroup f;
    public boolean h;
    public final /* synthetic */ g2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f2(g2 g2Var, Context context, int i10) {
        super(context);
        this.n = g2Var;
        setOrientation(1);
        ViewGroup B = g2Var.B(context, i10);
        this.f = B;
        addView(B);
        this.e = (l1) B;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setGravity(1);
        int i11 = g6.j5;
        textView.setTextColor(g2Var.getThemedColor(i11));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, z5.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        p80 p80Var = new p80(context, null);
        this.c = p80Var;
        p80Var.setGravity(1);
        p80Var.setTextSize(1, 15.0f);
        p80Var.setTextColor(g2Var.getThemedColor(i11));
        if (!g2Var.A) {
            p80Var.setLines(2);
        }
        addView(p80Var, z5.t(-1, -2, 1, 21, 10, 21, 16));
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
        g2 g2Var = this.n;
        if (z10) {
            ((b) viewGroup).setTopOffset(g2Var.H);
        }
        viewGroup.getLayoutParams().height = g2Var.s;
        p80 p80Var = this.c;
        p80Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
            textView.setVisibility(8);
            p80Var.setVisibility(8);
            super.onMeasure(i10, i11);
        }
    }
}
