package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.m5;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.p80;
import org.telegram.ui.eu0;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h1 extends LinearLayout {
    public int a;
    public final TextView b;
    public final p80 c;
    public LinearLayout d;
    public final t0 e;
    public final ViewGroup f;
    public boolean h;
    public final /* synthetic */ i1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, kg.h1] */
    /* JADX WARN: Type inference failed for: r15v10, types: [kg.z1] */
    /* JADX WARN: Type inference failed for: r15v9, types: [kg.v0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [kg.k2] */
    public h1(i1 i1Var, Context context, int i10) {
        super(context);
        a aVar;
        this.n = i1Var;
        setOrientation(1);
        eu0 eu0Var = (eu0) i1Var.k1.get(i10);
        int i11 = eu0Var.a;
        if (i11 == 0) {
            a bVar = new b(context, i1Var.I0);
            bVar.b.setOnScrollListener(new a1(i1Var, 1));
            aVar = bVar;
        } else if (i11 == 14 || i11 == 28) {
            a lVar = new l(i11 == 28 ? 1 : 0, context, i1Var.I0);
            lVar.b.setOnScrollListener(new a1(i1Var, 0));
            aVar = lVar;
        } else {
            aVar = i11 == 5 ? new b1(context, i1Var.a) : i11 == 10 ? new v0(context, i1Var.I0) : new k2(context, i1Var.t1, i1Var.a, eu0Var.a, i1Var.I0);
        }
        this.f = aVar;
        addView(aVar);
        this.e = aVar;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setGravity(1);
        int i12 = t6.j5;
        m5.m(textView, i12, i1Var.I0, 1, 20.0f);
        addView(textView, b6.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        p80 p80Var = new p80(context, null);
        this.c = p80Var;
        p80Var.setGravity(1);
        p80Var.setTextSize(1, 15.0f);
        a7.V(p80Var, i12, i1Var.I0);
        if (!i1Var.v1) {
            p80Var.setLines(2);
        }
        addView(p80Var, b6.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.f) {
            return super.drawChild(canvas, view, j10);
        }
        boolean z10 = view instanceof a;
        if (z10) {
            setTranslationY(0.0f);
        } else {
            setTranslationY(this.n.C1);
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
        boolean z10 = viewGroup instanceof a;
        i1 i1Var = this.n;
        if (z10) {
            ((a) viewGroup).setTopOffset(i1Var.C1);
        }
        viewGroup.getLayoutParams().height = i1Var.q1;
        p80 p80Var = this.c;
        p80Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - org.telegram.messenger.i0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(16.0f);
            textView.setVisibility(8);
            p80Var.setVisibility(8);
            super.onMeasure(i10, i11);
        }
    }
}
