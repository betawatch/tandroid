package dg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TableRow;
import android.widget.TextView;
import bg.q1;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.o9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g0 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final o9 f;
    public final o9 h;
    public final b6 n;
    public final Paint r;
    public final Path s;
    public final RectF v;
    public final FrameLayout w;
    public final FrameLayout x;
    public final TableRow y;

    public g0(Context context, b6 b6Var) {
        super(context);
        boolean z10;
        Paint paint = new Paint();
        this.r = paint;
        this.s = new Path();
        this.v = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        this.n = b6Var;
        TextView a2 = a(LocaleController.getString(R.string.BoostingFrom), false);
        TextView a3 = a(LocaleController.getString(R.string.BoostingTo), false);
        TextView a10 = a(LocaleController.getString(R.string.BoostingGift), false);
        TextView a11 = a(LocaleController.getString(R.string.BoostingReason), false);
        TextView a12 = a(LocaleController.getString(R.string.BoostingDate), false);
        TextView a13 = a(null, true);
        this.a = a13;
        TextView a14 = a(null, true);
        this.b = a14;
        TextView a15 = a(null, false);
        this.c = a15;
        TextView a16 = a(null, true);
        this.d = a16;
        TextView a17 = a(null, false);
        this.e = a17;
        o9 o9Var = new o9(context);
        this.f = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
        o9 o9Var2 = new o9(context);
        this.h = o9Var2;
        o9Var2.setRoundRadius(AndroidUtilities.dp(12.0f));
        TableRow tableRow = new TableRow(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.w = frameLayout;
        boolean z11 = LocaleController.isRTL;
        frameLayout.addView(o9Var, e6.d(24, 24.0f, z11 ? 5 : 3, z11 ? 0.0f : 12.0f, 0.0f, z11 ? 12.0f : 0.0f, 0.0f));
        boolean z12 = LocaleController.isRTL;
        frameLayout.addView(a13, e6.d(-2, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 0.0f : 29.0f, 0.0f, z12 ? 29.0f : 0.0f, 0.0f));
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
        boolean z13 = LocaleController.isRTL;
        frameLayout2.addView(o9Var2, e6.d(24, 24.0f, z13 ? 5 : 3, z13 ? 0.0f : 12.0f, 0.0f, z13 ? 12.0f : 0.0f, 0.0f));
        boolean z14 = LocaleController.isRTL;
        frameLayout2.addView(a14, e6.d(-2, -2.0f, (z14 ? 5 : 3) | 16, z14 ? 0.0f : 29.0f, 0.0f, z14 ? 29.0f : 0.0f, 0.0f));
        TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(-2, -2, LocaleController.isRTL ? 1.0f : 0.0f);
        layoutParams2.gravity = 16;
        if (LocaleController.isRTL) {
            tableRow2.addView(frameLayout2, layoutParams2);
            tableRow2.addView(a3, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow2.addView(a3, new TableRow.LayoutParams(-2, -2));
            tableRow2.addView(frameLayout2, layoutParams2);
        }
        frameLayout2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        TableRow tableRow3 = new TableRow(context);
        if (LocaleController.isRTL) {
            tableRow3.addView(a15, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow3.addView(a10, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow3.addView(a10, new TableRow.LayoutParams(-2, -2));
            tableRow3.addView(a15, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow4 = new TableRow(context);
        this.y = tableRow4;
        if (LocaleController.isRTL) {
            tableRow4.addView(a16, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow4.addView(a11, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow4.addView(a11, new TableRow.LayoutParams(-2, -2));
            tableRow4.addView(a16, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow5 = new TableRow(context);
        if (LocaleController.isRTL) {
            tableRow5.addView(a17, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow5.addView(a12, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow5.addView(a12, new TableRow.LayoutParams(-2, -2));
            tableRow5.addView(a17, new TableRow.LayoutParams(-2, -2));
        }
        f0 f0Var = new f0(this, context, b6Var);
        f0Var.addView(tableRow);
        f0Var.addView(tableRow2);
        f0Var.addView(tableRow3);
        f0Var.addView(tableRow4);
        f0Var.addView(tableRow5);
        if (LocaleController.isRTL) {
            z10 = true;
            f0Var.setColumnShrinkable(0, true);
        } else {
            z10 = true;
            f0Var.setColumnShrinkable(1, true);
        }
        addView(f0Var, e6.c(-2.0f, -1));
        f0Var.setOutlineProvider(new q1(1));
        f0Var.setClipToOutline(z10);
        setPaddingRelative(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), 0);
    }

    public final TextView a(String str, boolean z10) {
        TextView textView;
        b6 b6Var = this.n;
        if (z10) {
            textView = new l80(getContext(), b6Var);
            textView.setLinkTextColor(f6.v0(f6.J6, b6Var));
        } else {
            textView = new TextView(getContext());
        }
        ll.n(z10 ? f6.m5 : f6.j5, b6Var, textView, 1, 14.0f);
        if (!z10) {
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
        textView.setBackgroundColor(f6.v0(f6.e7, b6Var));
        textView.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 32.0f : 12.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(LocaleController.isRTL ? 12.0f : 32.0f), AndroidUtilities.dp(11.0f));
        return textView;
    }
}
