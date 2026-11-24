// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ih8 extends LinearLayout {
    public int a;
    public final TextView b;
    public final l46 c;
    public LinearLayout d;
    public final qr7 e;
    public final ViewGroup f;
    public boolean h;
    public final /* synthetic */ jh8 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, ih8] */
    /* JADX WARN: Type inference failed for: r15v10, types: [qi8] */
    /* JADX WARN: Type inference failed for: r15v9, types: [xg8] */
    /* JADX WARN: Type inference failed for: r3v5, types: [acc] */
    public ih8(jh8 jh8Var, Context context, int i) {
        super(context);
        kg0 kg0Var;
        this.n = jh8Var;
        byte b = 1;
        setOrientation(1);
        fi8 fi8Var = (fi8) jh8Var.n1.get(i);
        byte b2 = fi8Var.a;
        byte b3 = 0;
        if (b2 == 0) {
            kg0 ap3Var = new ap3(context, jh8Var.J0);
            ap3Var.b.setOnScrollListener(new ch8(jh8Var, b));
            kg0Var = ap3Var;
        } else if (b2 == 14 || b2 == 28) {
            kg0 r84Var = new r84(b2 == 28 ? 1 : 0, jh8Var.J0, context);
            r84Var.b.setOnScrollListener(new ch8(jh8Var, b3));
            kg0Var = r84Var;
        } else {
            kg0Var = b2 == 5 ? new dh8(context, jh8Var.a) : b2 == 10 ? new xg8(context, jh8Var.J0) : new acc(context, jh8Var.w1, jh8Var.a, fi8Var.a, jh8Var.J0);
        }
        this.f = kg0Var;
        addView(kg0Var);
        this.e = kg0Var;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setGravity(1);
        int i2 = bkb.i5;
        tb4.w(textView, i2, jh8Var.J0, 1, 20.0f);
        addView(textView, nme.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        l46 l46Var = new l46(context, null);
        this.c = l46Var;
        l46Var.setGravity(1);
        l46Var.setTextSize(1, 15.0f);
        zkb.X(l46Var, i2, jh8Var.J0);
        if (!jh8Var.y1) {
            l46Var.setLines(2);
        }
        addView(l46Var, nme.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.f) {
            return super.drawChild(canvas, view, j);
        }
        if (view instanceof kg0) {
            setTranslationY(0.0f);
            return super.drawChild(canvas, view, j);
        }
        setTranslationY(this.n.F1);
        canvas.save();
        canvas.clipRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        TextView textView = this.b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f;
        boolean z = viewGroup instanceof kg0;
        jh8 jh8Var = this.n;
        if (z) {
            ((kg0) viewGroup).setTopOffset(jh8Var.F1);
        }
        viewGroup.getLayoutParams().height = jh8Var.t1;
        l46 l46Var = this.c;
        l46Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i, i2);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - gl.L(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = gl.L(16.0f);
            textView.setVisibility(8);
            l46Var.setVisibility(8);
            super.onMeasure(i, i2);
        }
    }
}
