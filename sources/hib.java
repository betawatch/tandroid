// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TableRow;
import android.widget.TextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class hib extends FrameLayout {
    public final TableRow E;
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final de0 f;
    public final de0 h;
    public final vnb n;
    public final Paint r;
    public final Path s;
    public final RectF w;
    public final FrameLayout x;
    public final FrameLayout y;

    public hib(Context context, vnb vnbVar) {
        super(context);
        float f;
        int i;
        float f2;
        int i2;
        boolean z;
        Paint paint = new Paint();
        this.r = paint;
        this.s = new Path();
        this.w = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        this.n = vnbVar;
        TextView a = a(ob6.M0(2131753516, null), false);
        TextView a2 = a(ob6.M0(2131753172, null), false);
        TextView a3 = a(ob6.M0(2131753494, null), false);
        TextView a4 = a(ob6.M0(2131753315, null), false);
        TextView a5 = a(ob6.M0(2131753533, null), false);
        TextView a6 = a(null, true);
        this.a = a6;
        TextView a7 = a(null, true);
        this.b = a7;
        TextView a8 = a(null, false);
        this.c = a8;
        TextView a9 = a(null, true);
        this.d = a9;
        TextView a10 = a(null, false);
        this.e = a10;
        de0 de0Var = new de0(context);
        this.f = de0Var;
        de0Var.setRoundRadius(hl.L(12.0f));
        de0 de0Var2 = new de0(context);
        this.h = de0Var2;
        de0Var2.setRoundRadius(hl.L(12.0f));
        TableRow tableRow = new TableRow(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        boolean z2 = ob6.a0;
        if (z2) {
            i = 5;
            f = 0.0f;
        } else {
            f = 12.0f;
            i = 3;
        }
        frameLayout.addView(de0Var, tre.d(24, 24.0f, i, f, 0.0f, z2 ? 12.0f : 0.0f, 0.0f));
        boolean z3 = ob6.a0;
        frameLayout.addView(a6, tre.d(-2, -2.0f, (z3 ? 5 : 3) | 16, z3 ? 0.0f : 29.0f, 0.0f, z3 ? 29.0f : 0.0f, 0.0f));
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -2, ob6.a0 ? 1.0f : 0.0f);
        layoutParams.gravity = 16;
        if (ob6.a0) {
            tableRow.addView(frameLayout, layoutParams);
            tableRow.addView(a, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow.addView(a, new TableRow.LayoutParams(-2, -2));
            tableRow.addView(frameLayout, layoutParams);
        }
        frameLayout.setPadding(0, hl.L(6.0f), 0, hl.L(6.0f));
        TableRow tableRow2 = new TableRow(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.y = frameLayout2;
        boolean z4 = ob6.a0;
        if (z4) {
            i2 = 5;
            f2 = 0.0f;
        } else {
            f2 = 12.0f;
            i2 = 3;
        }
        frameLayout2.addView(de0Var2, tre.d(24, 24.0f, i2, f2, 0.0f, z4 ? 12.0f : 0.0f, 0.0f));
        boolean z5 = ob6.a0;
        frameLayout2.addView(a7, tre.d(-2, -2.0f, (z5 ? 5 : 3) | 16, z5 ? 0.0f : 29.0f, 0.0f, z5 ? 29.0f : 0.0f, 0.0f));
        TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(-2, -2, ob6.a0 ? 1.0f : 0.0f);
        layoutParams2.gravity = 16;
        if (ob6.a0) {
            tableRow2.addView(frameLayout2, layoutParams2);
            tableRow2.addView(a2, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow2.addView(a2, new TableRow.LayoutParams(-2, -2));
            tableRow2.addView(frameLayout2, layoutParams2);
        }
        frameLayout2.setPadding(0, hl.L(6.0f), 0, hl.L(6.0f));
        TableRow tableRow3 = new TableRow(context);
        if (ob6.a0) {
            tableRow3.addView(a8, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow3.addView(a3, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow3.addView(a3, new TableRow.LayoutParams(-2, -2));
            tableRow3.addView(a8, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow4 = new TableRow(context);
        this.E = tableRow4;
        if (ob6.a0) {
            tableRow4.addView(a9, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow4.addView(a4, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow4.addView(a4, new TableRow.LayoutParams(-2, -2));
            tableRow4.addView(a9, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow5 = new TableRow(context);
        if (ob6.a0) {
            tableRow5.addView(a10, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow5.addView(a5, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow5.addView(a5, new TableRow.LayoutParams(-2, -2));
            tableRow5.addView(a10, new TableRow.LayoutParams(-2, -2));
        }
        fib fibVar = new fib(this, context, vnbVar);
        fibVar.addView(tableRow);
        fibVar.addView(tableRow2);
        fibVar.addView(tableRow3);
        fibVar.addView(tableRow4);
        fibVar.addView(tableRow5);
        if (ob6.a0) {
            z = true;
            fibVar.setColumnShrinkable(0, true);
        } else {
            z = true;
            fibVar.setColumnShrinkable(1, true);
        }
        addView(fibVar, tre.c(-2.0f, -1));
        fibVar.setOutlineProvider(new yi((byte) 18));
        fibVar.setClipToOutline(z);
        setPaddingRelative(hl.L(14.0f), hl.L(18.0f), hl.L(14.0f), 0);
    }

    public final TextView a(String str, boolean z) {
        TextView textView;
        int i;
        vnb vnbVar = this.n;
        if (z) {
            textView = new p66(getContext(), vnbVar);
            yob.G(textView, aob.J6, vnbVar);
            i = aob.m5;
        } else {
            textView = new TextView(getContext());
            i = aob.j5;
        }
        yob.X(textView, i, vnbVar);
        textView.setTextSize(1, 14.0f);
        if (!z) {
            textView.setGravity(ob6.a0 ? 5 : 3);
        }
        if (str == null) {
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
            return textView;
        }
        textView.setTypeface(hl.o());
        textView.setText(str);
        yob.h(aob.e7, vnbVar, textView);
        textView.setPadding(hl.L(ob6.a0 ? 32.0f : 12.0f), hl.L(11.0f), hl.L(ob6.a0 ? 12.0f : 32.0f), hl.L(11.0f));
        return textView;
    }
}
