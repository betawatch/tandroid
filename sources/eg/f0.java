package eg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TableRow;
import android.widget.TextView;
import cg.l1;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.p80;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class f0 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final n9 f;
    public final n9 h;
    public final c6 n;
    public final Paint r;
    public final Path s;
    public final RectF v;
    public final FrameLayout w;
    public final FrameLayout x;
    public final TableRow y;

    public f0(Context context, c6 c6Var) {
        super(context);
        boolean z10;
        Paint paint = new Paint();
        this.r = paint;
        this.s = new Path();
        this.v = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        this.n = c6Var;
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
        n9 n9Var = new n9(context);
        this.f = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
        n9 n9Var2 = new n9(context);
        this.h = n9Var2;
        n9Var2.setRoundRadius(AndroidUtilities.dp(12.0f));
        TableRow tableRow = new TableRow(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.w = frameLayout;
        boolean z11 = LocaleController.isRTL;
        frameLayout.addView(n9Var, z5.d(24, 24.0f, z11 ? 5 : 3, z11 ? 0.0f : 12.0f, 0.0f, z11 ? 12.0f : 0.0f, 0.0f));
        boolean z12 = LocaleController.isRTL;
        frameLayout.addView(a13, z5.d(-2, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 0.0f : 29.0f, 0.0f, z12 ? 29.0f : 0.0f, 0.0f));
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
        frameLayout2.addView(n9Var2, z5.d(24, 24.0f, z13 ? 5 : 3, z13 ? 0.0f : 12.0f, 0.0f, z13 ? 12.0f : 0.0f, 0.0f));
        boolean z14 = LocaleController.isRTL;
        frameLayout2.addView(a14, z5.d(-2, -2.0f, (z14 ? 5 : 3) | 16, z14 ? 0.0f : 29.0f, 0.0f, z14 ? 29.0f : 0.0f, 0.0f));
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
        e0 e0Var = new e0(this, context, c6Var);
        e0Var.addView(tableRow);
        e0Var.addView(tableRow2);
        e0Var.addView(tableRow3);
        e0Var.addView(tableRow4);
        e0Var.addView(tableRow5);
        if (LocaleController.isRTL) {
            z10 = true;
            e0Var.setColumnShrinkable(0, true);
        } else {
            z10 = true;
            e0Var.setColumnShrinkable(1, true);
        }
        addView(e0Var, z5.c(-2.0f, -1));
        e0Var.setOutlineProvider(new l1(1));
        e0Var.setClipToOutline(z10);
        setPaddingRelative(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), 0);
    }

    public final TextView a(String str, boolean z10) {
        TextView textView;
        c6 c6Var = this.n;
        if (z10) {
            textView = new p80(getContext(), c6Var);
            textView.setLinkTextColor(g6.v0(g6.J6, c6Var));
        } else {
            textView = new TextView(getContext());
        }
        rl.l(z10 ? g6.m5 : g6.j5, c6Var, textView, 1, 14.0f);
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
        textView.setBackgroundColor(g6.v0(g6.e7, c6Var));
        textView.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 32.0f : 12.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(LocaleController.isRTL ? 12.0f : 32.0f), AndroidUtilities.dp(11.0f));
        return textView;
    }
}
