package lh;

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
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mq;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class ea extends LinearLayout {
    public static HashMap B;
    public final int a;
    public final org.telegram.ui.Components.z8 b;
    public final org.telegram.ui.Components.p9 c;
    public final org.telegram.ui.Components.p9 d;
    public int e;
    public final TextView f;
    public final LinearLayout.LayoutParams h;
    public final f90 n;
    public final TextView r;
    public final TextView s;
    public final SpannableString v;
    public final SpannableString w;
    public boolean x;
    public boolean y;

    public ea(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = 1;
        this.a = i10;
        setOrientation(0);
        dg.v3 v3Var = new dg.v3(this, context, f6Var);
        addView(v3Var, k7.b6.o(72, -1, 0.0f, 115));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.d = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        v3Var.addView(p9Var, k7.b6.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.b = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(context);
        this.c = p9Var2;
        p9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        v3Var.addView(p9Var2, k7.b6.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, k7.b6.o(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.b.l(i11, f6Var, textView, 1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = k7.b6.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        f90 f90Var = new f90(context, null);
        this.n = f90Var;
        f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        f90Var.setTextSize(1, 13.0f);
        f90Var.setEllipsize(truncateAt);
        f90Var.setSingleLine(true);
        linearLayout.addView(f90Var, k7.b6.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.r = textView2;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.z6, f6Var, textView2, 1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        TextView i12 = ai.i(linearLayout, textView2, k7.b6.n(-1, -2), context);
        this.s = i12;
        i12.setTypeface(AndroidUtilities.bold());
        i12.setTextSize(1, 15.3f);
        i12.setGravity(5);
        addView(i12, k7.b6.p(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.v = spannableString;
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        mutate.setBounds(0, 0, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f));
        spannableString.setSpan(new ImageSpan(mutate), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.w = spannableString2;
        lq lqVar = new lq(0, context.getResources().getDrawable(R.drawable.mini_gram_72).mutate());
        lqVar.setSize(AndroidUtilities.dp(18.0f));
        lqVar.setTranslateY(AndroidUtilities.dp(0.5f));
        spannableString2.setSpan(lqVar, 0, spannableString2.length(), 33);
    }

    public static mq a(int i10, String str) {
        if (i10 != 44) {
            return org.telegram.ui.Cells.s6.a(i10, str);
        }
        if (B == null) {
            B = new HashMap();
        }
        mq mqVar = (mq) B.get(str);
        if (mqVar != null) {
            return mqVar;
        }
        HashMap hashMap = B;
        mq a2 = org.telegram.ui.Cells.s6.a(44, str);
        hashMap.put(str, a2);
        return a2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.y) {
            canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.x ? 71.0f : 58.0f), TLObject.FLAG_30));
    }
}
