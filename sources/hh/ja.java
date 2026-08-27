package hh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.p80;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class ja extends LinearLayout {
    public static HashMap A;
    public final int a;
    public final org.telegram.ui.Components.y8 b;
    public final org.telegram.ui.Components.n9 c;
    public final org.telegram.ui.Components.n9 d;
    public int e;
    public final TextView f;
    public final LinearLayout.LayoutParams h;
    public final p80 n;
    public final TextView r;
    public final TextView s;
    public final SpannableString v;
    public final SpannableString w;
    public boolean x;
    public boolean y;

    public ja(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.e = 1;
        this.a = i10;
        setOrientation(0);
        h1 h1Var = new h1(this, context, c6Var);
        addView(h1Var, h7.z5.o(72, -1, 0.0f, 115));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.d = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        h1Var.addView(n9Var, h7.z5.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.b = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.n9 n9Var2 = new org.telegram.ui.Components.n9(context);
        this.c = n9Var2;
        n9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        h1Var.addView(n9Var2, h7.z5.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, h7.z5.o(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        rl.l(i11, c6Var, textView, 1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = h7.z5.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        p80 p80Var = new p80(context, null);
        this.n = p80Var;
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        p80Var.setTextSize(1, 13.0f);
        p80Var.setEllipsize(truncateAt);
        p80Var.setSingleLine(true);
        linearLayout.addView(p80Var, h7.z5.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.r = textView2;
        rl.l(org.telegram.ui.ActionBar.g6.z6, c6Var, textView2, 1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        TextView i12 = org.telegram.ui.Cells.pa.i(linearLayout, textView2, h7.z5.n(-1, -2), context);
        this.s = i12;
        i12.setTypeface(AndroidUtilities.bold());
        i12.setTextSize(1, 15.3f);
        i12.setGravity(5);
        addView(i12, h7.z5.p(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.v = spannableString;
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        mutate.setBounds(0, 0, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f));
        spannableString.setSpan(new ImageSpan(mutate), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.w = spannableString2;
        cq cqVar = new cq(0, context.getResources().getDrawable(R.drawable.mini_gram_72).mutate());
        cqVar.setSize(AndroidUtilities.dp(18.0f));
        cqVar.setTranslateY(AndroidUtilities.dp(0.5f));
        spannableString2.setSpan(cqVar, 0, spannableString2.length(), 33);
    }

    public static dq a(int i10, String str) {
        if (i10 != 44) {
            return org.telegram.ui.Cells.q6.a(i10, str);
        }
        if (A == null) {
            A = new HashMap();
        }
        dq dqVar = (dq) A.get(str);
        if (dqVar != null) {
            return dqVar;
        }
        HashMap hashMap = A;
        dq a2 = org.telegram.ui.Cells.q6.a(44, str);
        hashMap.put(str, a2);
        return a2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.y) {
            canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), getMeasuredHeight(), org.telegram.ui.ActionBar.g6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.x ? 71.0f : 58.0f), TLObject.FLAG_30));
    }
}
