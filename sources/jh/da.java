package jh;

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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.y80;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class da extends LinearLayout {
    public static HashMap A;
    public final int a;
    public final org.telegram.ui.Components.e9 b;
    public final org.telegram.ui.Components.t9 c;
    public final org.telegram.ui.Components.t9 d;
    public int e;
    public final TextView f;
    public final LinearLayout.LayoutParams h;
    public final y80 n;
    public final TextView r;
    public final TextView s;
    public final SpannableString v;
    public final SpannableString w;
    public boolean x;
    public boolean y;

    public da(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.e = 1;
        this.a = i10;
        setOrientation(0);
        bg.z3 z3Var = new bg.z3(this, context, c6Var);
        addView(z3Var, i7.f6.o(72, -1, 0.0f, 115));
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.d = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        z3Var.addView(t9Var, i7.f6.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.b = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.t9 t9Var2 = new org.telegram.ui.Components.t9(context);
        this.c = t9Var2;
        t9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        z3Var.addView(t9Var2, i7.f6.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, i7.f6.o(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.b.m(i11, c6Var, textView, 1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k9 = i7.f6.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k9;
        linearLayout.addView(textView, k9);
        y80 y80Var = new y80(context, null);
        this.n = y80Var;
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        y80Var.setTextSize(1, 13.0f);
        y80Var.setEllipsize(truncateAt);
        y80Var.setSingleLine(true);
        linearLayout.addView(y80Var, i7.f6.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.r = textView2;
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.z6, c6Var, textView2, 1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        TextView i12 = th.i(linearLayout, textView2, i7.f6.n(-1, -2), context);
        this.s = i12;
        i12.setTypeface(AndroidUtilities.bold());
        i12.setTextSize(1, 15.3f);
        i12.setGravity(5);
        addView(i12, i7.f6.p(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.v = spannableString;
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        mutate.setBounds(0, 0, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f));
        spannableString.setSpan(new ImageSpan(mutate), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.w = spannableString2;
        iq iqVar = new iq(0, context.getResources().getDrawable(R.drawable.mini_gram_72).mutate());
        iqVar.setSize(AndroidUtilities.dp(18.0f));
        iqVar.setTranslateY(AndroidUtilities.dp(0.5f));
        spannableString2.setSpan(iqVar, 0, spannableString2.length(), 33);
    }

    public static jq a(int i10, String str) {
        if (i10 != 44) {
            return org.telegram.ui.Cells.r6.a(i10, str);
        }
        if (A == null) {
            A = new HashMap();
        }
        jq jqVar = (jq) A.get(str);
        if (jqVar != null) {
            return jqVar;
        }
        HashMap hashMap = A;
        jq a2 = org.telegram.ui.Cells.r6.a(44, str);
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
