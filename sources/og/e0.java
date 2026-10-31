package og;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TableRow;
import android.widget.TextView;
import bi.d2;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.p80;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e0 extends FrameLayout {
    public final TableRow D;
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final g9 f;
    public final g9 h;
    public final p6 n;
    public final Paint r;
    public final Path s;
    public final RectF w;
    public final FrameLayout x;
    public final FrameLayout y;

    public e0(Context context, p6 p6Var) {
        super(context);
        boolean z10;
        Paint paint = new Paint();
        this.r = paint;
        this.s = new Path();
        this.w = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        this.n = p6Var;
        TextView a2 = a(cd.L0(2131753523, null), false);
        TextView a10 = a(cd.L0(2131753179, null), false);
        TextView a11 = a(cd.L0(2131753501, null), false);
        TextView a12 = a(cd.L0(2131753322, null), false);
        TextView a13 = a(cd.L0(2131753540, null), false);
        TextView a14 = a(null, true);
        this.a = a14;
        TextView a15 = a(null, true);
        this.b = a15;
        TextView a16 = a(null, false);
        this.c = a16;
        TextView a17 = a(null, true);
        this.d = a17;
        TextView a18 = a(null, false);
        this.e = a18;
        g9 g9Var = new g9(context);
        this.f = g9Var;
        g9Var.setRoundRadius(i0.L(12.0f));
        g9 g9Var2 = new g9(context);
        this.h = g9Var2;
        g9Var2.setRoundRadius(i0.L(12.0f));
        TableRow tableRow = new TableRow(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        boolean z11 = cd.X;
        frameLayout.addView(g9Var, b6.d(24, 24.0f, z11 ? 5 : 3, z11 ? 0.0f : 12.0f, 0.0f, z11 ? 12.0f : 0.0f, 0.0f));
        boolean z12 = cd.X;
        frameLayout.addView(a14, b6.d(-2, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 0.0f : 29.0f, 0.0f, z12 ? 29.0f : 0.0f, 0.0f));
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -2, cd.X ? 1.0f : 0.0f);
        layoutParams.gravity = 16;
        if (cd.X) {
            tableRow.addView(frameLayout, layoutParams);
            tableRow.addView(a2, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow.addView(a2, new TableRow.LayoutParams(-2, -2));
            tableRow.addView(frameLayout, layoutParams);
        }
        frameLayout.setPadding(0, i0.L(6.0f), 0, i0.L(6.0f));
        TableRow tableRow2 = new TableRow(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.y = frameLayout2;
        boolean z13 = cd.X;
        frameLayout2.addView(g9Var2, b6.d(24, 24.0f, z13 ? 5 : 3, z13 ? 0.0f : 12.0f, 0.0f, z13 ? 12.0f : 0.0f, 0.0f));
        boolean z14 = cd.X;
        frameLayout2.addView(a15, b6.d(-2, -2.0f, (z14 ? 5 : 3) | 16, z14 ? 0.0f : 29.0f, 0.0f, z14 ? 29.0f : 0.0f, 0.0f));
        TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(-2, -2, cd.X ? 1.0f : 0.0f);
        layoutParams2.gravity = 16;
        if (cd.X) {
            tableRow2.addView(frameLayout2, layoutParams2);
            tableRow2.addView(a10, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow2.addView(a10, new TableRow.LayoutParams(-2, -2));
            tableRow2.addView(frameLayout2, layoutParams2);
        }
        frameLayout2.setPadding(0, i0.L(6.0f), 0, i0.L(6.0f));
        TableRow tableRow3 = new TableRow(context);
        if (cd.X) {
            tableRow3.addView(a16, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow3.addView(a11, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow3.addView(a11, new TableRow.LayoutParams(-2, -2));
            tableRow3.addView(a16, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow4 = new TableRow(context);
        this.D = tableRow4;
        if (cd.X) {
            tableRow4.addView(a17, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow4.addView(a12, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow4.addView(a12, new TableRow.LayoutParams(-2, -2));
            tableRow4.addView(a17, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow5 = new TableRow(context);
        if (cd.X) {
            tableRow5.addView(a18, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow5.addView(a13, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow5.addView(a13, new TableRow.LayoutParams(-2, -2));
            tableRow5.addView(a18, new TableRow.LayoutParams(-2, -2));
        }
        d0 d0Var = new d0(this, context, p6Var);
        d0Var.addView(tableRow);
        d0Var.addView(tableRow2);
        d0Var.addView(tableRow3);
        d0Var.addView(tableRow4);
        d0Var.addView(tableRow5);
        if (cd.X) {
            z10 = true;
            d0Var.setColumnShrinkable(0, true);
        } else {
            z10 = true;
            d0Var.setColumnShrinkable(1, true);
        }
        addView(d0Var, b6.c(-2.0f, -1));
        d0Var.setOutlineProvider(new d2(5));
        d0Var.setClipToOutline(z10);
        setPaddingRelative(i0.L(14.0f), i0.L(18.0f), i0.L(14.0f), 0);
    }

    public final TextView a(String str, boolean z10) {
        TextView textView;
        p6 p6Var = this.n;
        if (z10) {
            textView = new p80(getContext(), p6Var);
            a7.H(textView, t6.J6, p6Var);
        } else {
            textView = new TextView(getContext());
        }
        a7.V(textView, z10 ? t6.m5 : t6.j5, p6Var);
        textView.setTextSize(1, 14.0f);
        if (!z10) {
            textView.setGravity(cd.X ? 5 : 3);
        }
        if (str == null) {
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(i0.L(14.0f), 0, i0.L(14.0f), 0);
            return textView;
        }
        textView.setTypeface(i0.o());
        textView.setText(str);
        a7.i(t6.e7, textView, p6Var);
        textView.setPadding(i0.L(cd.X ? 32.0f : 12.0f), i0.L(11.0f), i0.L(cd.X ? 12.0f : 32.0f), i0.L(11.0f));
        return textView;
    }
}
