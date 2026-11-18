package di;

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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mq;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class kb extends LinearLayout {
    public static HashMap F;
    public boolean E;
    public final int a;
    public final org.telegram.ui.Components.b9 b;
    public final org.telegram.ui.Components.q9 c;
    public final org.telegram.ui.Components.q9 d;
    public int e;
    public final TextView f;
    public final LinearLayout.LayoutParams h;
    public final k80 n;
    public final TextView r;
    public final TextView s;
    public final SpannableString w;
    public final SpannableString x;
    public boolean y;

    public kb(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.e = 1;
        this.a = i7;
        setOrientation(0);
        d1 d1Var = new d1(this, context, i6Var);
        addView(d1Var, c8.ma.p(72, -1, 0.0f, ks.A1));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.d = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        d1Var.addView(q9Var, c8.ma.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.b = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        org.telegram.ui.Components.q9 q9Var2 = new org.telegram.ui.Components.q9(context);
        this.c = q9Var2;
        q9Var2.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        d1Var.addView(q9Var2, c8.ma.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, c8.ma.p(-2, -1, 1.0f, ks.E1));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
        textView.setTextSize(1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = c8.ma.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        k80 k80Var = new k80(context, null);
        this.n = k80Var;
        org.telegram.ui.ActionBar.u6.U(k80Var, i10, i6Var);
        k80Var.setTextSize(1, 13.0f);
        k80Var.setEllipsize(truncateAt);
        k80Var.setSingleLine(true);
        linearLayout.addView(k80Var, c8.ma.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.r = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.z6, i6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        linearLayout.addView(textView2, c8.ma.o(-1, -2));
        TextView textView3 = new TextView(context);
        this.s = textView3;
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 15.3f);
        textView3.setGravity(5);
        addView(textView3, c8.ma.q(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.w = spannableString;
        Drawable g10 = i5.c.g(context, R.drawable.star_small_inner);
        g10.setBounds(0, 0, org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(21.0f));
        spannableString.setSpan(new ImageSpan(g10), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.x = spannableString2;
        lq lqVar = new lq(0, i5.c.g(context, R.drawable.mini_gram_72));
        lqVar.d = false;
        lqVar.c(org.telegram.messenger.g0.L(18.0f));
        lqVar.s = org.telegram.messenger.g0.L(0.5f);
        spannableString2.setSpan(lqVar, 0, spannableString2.length(), 33);
    }

    public static mq a(int i7, String str) {
        if (i7 != 44) {
            return org.telegram.ui.Cells.s6.a(i7, str);
        }
        if (F == null) {
            F = new HashMap();
        }
        mq mqVar = (mq) F.get(str);
        if (mqVar != null) {
            return mqVar;
        }
        HashMap hashMap = F;
        mq a10 = org.telegram.ui.Cells.s6.a(44, str);
        hashMap.put(str, a10);
        return a10;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.E) {
            canvas.drawRect(gd.a0 ? 0.0f : org.telegram.messenger.g0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (gd.a0 ? org.telegram.messenger.g0.L(72.0f) : 0), getMeasuredHeight(), org.telegram.ui.ActionBar.n6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.y ? 71.0f : 58.0f), TLObject.FLAG_30));
    }
}
