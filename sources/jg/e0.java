package jg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TableRow;
import android.widget.TextView;
import hg.j1;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.p9;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class e0 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final p9 f;
    public final p9 h;
    public final g6 n;
    public final Paint r;
    public final Path s;
    public final RectF v;
    public final FrameLayout w;
    public final FrameLayout x;
    public final TableRow y;

    public e0(Context context, g6 g6Var) {
        super(context);
        boolean z4;
        Paint paint = new Paint();
        this.r = paint;
        this.s = new Path();
        this.v = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        this.n = g6Var;
        TextView a2 = a(LocaleController.getString(R.string.BoostingFrom), false);
        TextView a10 = a(LocaleController.getString(R.string.BoostingTo), false);
        TextView a11 = a(LocaleController.getString(R.string.BoostingGift), false);
        TextView a12 = a(LocaleController.getString(R.string.BoostingReason), false);
        TextView a13 = a(LocaleController.getString(R.string.BoostingDate), false);
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
        p9 p9Var = new p9(context);
        this.f = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
        p9 p9Var2 = new p9(context);
        this.h = p9Var2;
        p9Var2.setRoundRadius(AndroidUtilities.dp(12.0f));
        TableRow tableRow = new TableRow(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.w = frameLayout;
        boolean z10 = LocaleController.isRTL;
        frameLayout.addView(p9Var, c6.d(24, 24.0f, z10 ? 5 : 3, z10 ? 0.0f : 12.0f, 0.0f, z10 ? 12.0f : 0.0f, 0.0f));
        boolean z11 = LocaleController.isRTL;
        frameLayout.addView(a14, c6.d(-2, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 0.0f : 29.0f, 0.0f, z11 ? 29.0f : 0.0f, 0.0f));
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -2, LocaleController.isRTL ? 1.0f : 0.0f);
        layoutParams.gravity = 16;
        if (LocaleController.isRTL) {
            tableRow.addView(frameLayout, layoutParams);
            tableRow.addView(a2, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow.addView(a2, new TableRow.LayoutParams(-2, -2));
            tableRow.addView(frameLayout, layoutParams);
        }
        frameLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        TableRow tableRow2 = new TableRow(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.x = frameLayout2;
        boolean z12 = LocaleController.isRTL;
        frameLayout2.addView(p9Var2, c6.d(24, 24.0f, z12 ? 5 : 3, z12 ? 0.0f : 12.0f, 0.0f, z12 ? 12.0f : 0.0f, 0.0f));
        boolean z13 = LocaleController.isRTL;
        frameLayout2.addView(a15, c6.d(-2, -2.0f, (z13 ? 5 : 3) | 16, z13 ? 0.0f : 29.0f, 0.0f, z13 ? 29.0f : 0.0f, 0.0f));
        TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(-2, -2, LocaleController.isRTL ? 1.0f : 0.0f);
        layoutParams2.gravity = 16;
        if (LocaleController.isRTL) {
            tableRow2.addView(frameLayout2, layoutParams2);
            tableRow2.addView(a10, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow2.addView(a10, new TableRow.LayoutParams(-2, -2));
            tableRow2.addView(frameLayout2, layoutParams2);
        }
        frameLayout2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        TableRow tableRow3 = new TableRow(context);
        if (LocaleController.isRTL) {
            tableRow3.addView(a16, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow3.addView(a11, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow3.addView(a11, new TableRow.LayoutParams(-2, -2));
            tableRow3.addView(a16, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow4 = new TableRow(context);
        this.y = tableRow4;
        if (LocaleController.isRTL) {
            tableRow4.addView(a17, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow4.addView(a12, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow4.addView(a12, new TableRow.LayoutParams(-2, -2));
            tableRow4.addView(a17, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow5 = new TableRow(context);
        if (LocaleController.isRTL) {
            tableRow5.addView(a18, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow5.addView(a13, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow5.addView(a13, new TableRow.LayoutParams(-2, -2));
            tableRow5.addView(a18, new TableRow.LayoutParams(-2, -2));
        }
        d0 d0Var = new d0(this, context, g6Var);
        d0Var.addView(tableRow);
        d0Var.addView(tableRow2);
        d0Var.addView(tableRow3);
        d0Var.addView(tableRow4);
        d0Var.addView(tableRow5);
        if (LocaleController.isRTL) {
            z4 = true;
            d0Var.setColumnShrinkable(0, true);
        } else {
            z4 = true;
            d0Var.setColumnShrinkable(1, true);
        }
        addView(d0Var, c6.c(-2.0f, -1));
        d0Var.setOutlineProvider(new j1(1));
        d0Var.setClipToOutline(z4);
        setPaddingRelative(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), 0);
    }

    public final TextView a(String str, boolean z4) {
        TextView textView;
        g6 g6Var = this.n;
        if (z4) {
            textView = new g90(getContext(), g6Var);
            textView.setLinkTextColor(k6.v0(k6.J6, g6Var));
        } else {
            textView = new TextView(getContext());
        }
        org.telegram.ui.b.l(z4 ? k6.m5 : k6.j5, g6Var, textView, 1, 14.0f);
        if (!z4) {
            textView.setGravity(LocaleController.isRTL ? 5 : 3);
        }
        if (str == null) {
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
            return textView;
        }
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(str);
        textView.setBackgroundColor(k6.v0(k6.e7, g6Var));
        textView.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 32.0f : 12.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(LocaleController.isRTL ? 12.0f : 32.0f), AndroidUtilities.dp(11.0f));
        return textView;
    }
}
