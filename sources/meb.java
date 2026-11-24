// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TableRow;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class meb extends FrameLayout {
    public final TableRow E;
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final be0 f;
    public final be0 h;
    public final wjb n;
    public final Paint r;
    public final Path s;
    public final RectF w;
    public final FrameLayout x;
    public final FrameLayout y;

    public meb(Context context, wjb wjbVar) {
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
        this.n = wjbVar;
        TextView a = a(k96.M0(2131753520, null), false);
        TextView a2 = a(k96.M0(2131753176, null), false);
        TextView a3 = a(k96.M0(2131753498, null), false);
        TextView a4 = a(k96.M0(2131753319, null), false);
        TextView a5 = a(k96.M0(2131753537, null), false);
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
        be0 be0Var = new be0(context);
        this.f = be0Var;
        be0Var.setRoundRadius(gl.L(12.0f));
        be0 be0Var2 = new be0(context);
        this.h = be0Var2;
        be0Var2.setRoundRadius(gl.L(12.0f));
        TableRow tableRow = new TableRow(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        boolean z2 = k96.a0;
        if (z2) {
            i = 5;
            f = 0.0f;
        } else {
            f = 12.0f;
            i = 3;
        }
        frameLayout.addView(be0Var, nme.d(24, 24.0f, i, f, 0.0f, z2 ? 12.0f : 0.0f, 0.0f));
        boolean z3 = k96.a0;
        frameLayout.addView(a6, nme.d(-2, -2.0f, (z3 ? 5 : 3) | 16, z3 ? 0.0f : 29.0f, 0.0f, z3 ? 29.0f : 0.0f, 0.0f));
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -2, k96.a0 ? 1.0f : 0.0f);
        layoutParams.gravity = 16;
        if (k96.a0) {
            tableRow.addView(frameLayout, layoutParams);
            tableRow.addView(a, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow.addView(a, new TableRow.LayoutParams(-2, -2));
            tableRow.addView(frameLayout, layoutParams);
        }
        frameLayout.setPadding(0, gl.L(6.0f), 0, gl.L(6.0f));
        TableRow tableRow2 = new TableRow(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.y = frameLayout2;
        boolean z4 = k96.a0;
        if (z4) {
            i2 = 5;
            f2 = 0.0f;
        } else {
            f2 = 12.0f;
            i2 = 3;
        }
        frameLayout2.addView(be0Var2, nme.d(24, 24.0f, i2, f2, 0.0f, z4 ? 12.0f : 0.0f, 0.0f));
        boolean z5 = k96.a0;
        frameLayout2.addView(a7, nme.d(-2, -2.0f, (z5 ? 5 : 3) | 16, z5 ? 0.0f : 29.0f, 0.0f, z5 ? 29.0f : 0.0f, 0.0f));
        TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(-2, -2, k96.a0 ? 1.0f : 0.0f);
        layoutParams2.gravity = 16;
        if (k96.a0) {
            tableRow2.addView(frameLayout2, layoutParams2);
            tableRow2.addView(a2, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow2.addView(a2, new TableRow.LayoutParams(-2, -2));
            tableRow2.addView(frameLayout2, layoutParams2);
        }
        frameLayout2.setPadding(0, gl.L(6.0f), 0, gl.L(6.0f));
        TableRow tableRow3 = new TableRow(context);
        if (k96.a0) {
            tableRow3.addView(a8, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow3.addView(a3, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow3.addView(a3, new TableRow.LayoutParams(-2, -2));
            tableRow3.addView(a8, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow4 = new TableRow(context);
        this.E = tableRow4;
        if (k96.a0) {
            tableRow4.addView(a9, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow4.addView(a4, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow4.addView(a4, new TableRow.LayoutParams(-2, -2));
            tableRow4.addView(a9, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow5 = new TableRow(context);
        if (k96.a0) {
            tableRow5.addView(a10, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow5.addView(a5, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow5.addView(a5, new TableRow.LayoutParams(-2, -2));
            tableRow5.addView(a10, new TableRow.LayoutParams(-2, -2));
        }
        keb kebVar = new keb(this, context, wjbVar);
        kebVar.addView(tableRow);
        kebVar.addView(tableRow2);
        kebVar.addView(tableRow3);
        kebVar.addView(tableRow4);
        kebVar.addView(tableRow5);
        if (k96.a0) {
            z = true;
            kebVar.setColumnShrinkable(0, true);
        } else {
            z = true;
            kebVar.setColumnShrinkable(1, true);
        }
        addView(kebVar, nme.c(-2.0f, -1));
        kebVar.setOutlineProvider(new xi((byte) 19));
        kebVar.setClipToOutline(z);
        setPaddingRelative(gl.L(14.0f), gl.L(18.0f), gl.L(14.0f), 0);
    }

    public final TextView a(String str, boolean z) {
        TextView textView;
        int i;
        wjb wjbVar = this.n;
        if (z) {
            textView = new l46(getContext(), wjbVar);
            zkb.G(textView, bkb.I6, wjbVar);
            i = bkb.l5;
        } else {
            textView = new TextView(getContext());
            i = bkb.i5;
        }
        zkb.X(textView, i, wjbVar);
        textView.setTextSize(1, 14.0f);
        if (!z) {
            textView.setGravity(k96.a0 ? 5 : 3);
        }
        if (str == null) {
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
            return textView;
        }
        textView.setTypeface(gl.o());
        textView.setText(str);
        zkb.h(bkb.d7, wjbVar, textView);
        textView.setPadding(gl.L(k96.a0 ? 32.0f : 12.0f), gl.L(11.0f), gl.L(k96.a0 ? 12.0f : 32.0f), gl.L(11.0f));
        return textView;
    }
}
