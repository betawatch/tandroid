package ai;

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
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.yq;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class id extends LinearLayout {
    public static HashMap E;
    public final int a;
    public final org.telegram.ui.Components.h9 b;
    public final org.telegram.ui.Components.w9 c;
    public final org.telegram.ui.Components.w9 d;
    public int e;
    public final TextView f;
    public final LinearLayout.LayoutParams h;
    public final y90 n;
    public final TextView r;
    public final TextView s;
    public final SpannableString v;
    public final SpannableString w;
    public boolean x;
    public boolean y;

    public id(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.e = 1;
        this.a = i10;
        setOrientation(0);
        w1 w1Var = new w1(this, context, g6Var);
        addView(w1Var, w7.z5.o(72, -1, 0.0f, 115));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        w1Var.addView(w9Var, w7.z5.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.b = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(context);
        this.c = w9Var2;
        w9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        w1Var.addView(w9Var2, w7.z5.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, w7.z5.o(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(textView, i11, g6Var);
        textView.setTextSize(1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = w7.z5.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        y90 y90Var = new y90(context, null);
        this.n = y90Var;
        org.telegram.ui.ActionBar.r6.W(y90Var, i11, g6Var);
        y90Var.setTextSize(1, 13.0f);
        y90Var.setEllipsize(truncateAt);
        y90Var.setSingleLine(true);
        linearLayout.addView(y90Var, w7.z5.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.r = textView2;
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.z6, g6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        linearLayout.addView(textView2, w7.z5.n(-1, -2));
        TextView textView3 = new TextView(context);
        this.s = textView3;
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 15.3f);
        textView3.setGravity(5);
        addView(textView3, w7.z5.p(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.v = spannableString;
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        mutate.setBounds(0, 0, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f));
        spannableString.setSpan(new ImageSpan(mutate), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.w = spannableString2;
        xq xqVar = new xq(0, context.getResources().getDrawable(R.drawable.mini_gram_72).mutate());
        xqVar.recolorDrawable = false;
        xqVar.setSize(AndroidUtilities.dp(18.0f));
        xqVar.setTranslateY(AndroidUtilities.dp(0.5f));
        spannableString2.setSpan(xqVar, 0, spannableString2.length(), 33);
    }

    public static yq a(int i10, String str) {
        if (i10 != 44) {
            return org.telegram.ui.Cells.v6.a(i10, str);
        }
        if (E == null) {
            E = new HashMap();
        }
        yq yqVar = (yq) E.get(str);
        if (yqVar != null) {
            return yqVar;
        }
        HashMap hashMap = E;
        yq a2 = org.telegram.ui.Cells.v6.a(44, str);
        hashMap.put(str, a2);
        return a2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.y) {
            canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.x ? 71.0f : 58.0f), TLObject.FLAG_30));
    }
}
