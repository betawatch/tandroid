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
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.z70;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class gb extends LinearLayout {
    public static HashMap F;
    public boolean E;
    public final int a;
    public final org.telegram.ui.Components.t8 b;
    public final org.telegram.ui.Components.i9 c;
    public final org.telegram.ui.Components.i9 d;
    public int e;
    public final TextView f;
    public final LinearLayout.LayoutParams h;
    public final z70 n;
    public final TextView r;
    public final TextView s;
    public final SpannableString w;
    public final SpannableString x;
    public boolean y;

    public gb(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = 1;
        this.a = i7;
        setOrientation(0);
        e1 e1Var = new e1(this, context, e6Var);
        addView(e1Var, c8.ja.p(72, -1, 0.0f, ns.A1));
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.d = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        e1Var.addView(i9Var, c8.ja.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.b = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.i9 i9Var2 = new org.telegram.ui.Components.i9(context);
        this.c = i9Var2;
        i9Var2.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        e1Var.addView(i9Var2, c8.ja.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, c8.ja.p(-2, -1, 1.0f, ns.E1));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(textView, i10, e6Var);
        textView.setTextSize(1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = c8.ja.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        z70 z70Var = new z70(context, null);
        this.n = z70Var;
        org.telegram.ui.ActionBar.q6.U(z70Var, i10, e6Var);
        z70Var.setTextSize(1, 13.0f);
        z70Var.setEllipsize(truncateAt);
        z70Var.setSingleLine(true);
        linearLayout.addView(z70Var, c8.ja.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.r = textView2;
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.z6, e6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        linearLayout.addView(textView2, c8.ja.o(-1, -2));
        TextView textView3 = new TextView(context);
        this.s = textView3;
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 15.3f);
        textView3.setGravity(5);
        addView(textView3, c8.ja.q(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.w = spannableString;
        Drawable g10 = i5.c.g(context, R.drawable.star_small_inner);
        g10.setBounds(0, 0, org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(21.0f));
        spannableString.setSpan(new ImageSpan(g10), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.x = spannableString2;
        eq eqVar = new eq(0, i5.c.g(context, R.drawable.mini_gram_72));
        eqVar.d = false;
        eqVar.c(org.telegram.messenger.g0.L(18.0f));
        eqVar.s = org.telegram.messenger.g0.L(0.5f);
        spannableString2.setSpan(eqVar, 0, spannableString2.length(), 33);
    }

    public static fq a(int i7, String str) {
        if (i7 != 44) {
            return org.telegram.ui.Cells.r6.a(i7, str);
        }
        if (F == null) {
            F = new HashMap();
        }
        fq fqVar = (fq) F.get(str);
        if (fqVar != null) {
            return fqVar;
        }
        HashMap hashMap = F;
        fq a10 = org.telegram.ui.Cells.r6.a(44, str);
        hashMap.put(str, a10);
        return a10;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.E) {
            canvas.drawRect(hd.a0 ? 0.0f : org.telegram.messenger.g0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (hd.a0 ? org.telegram.messenger.g0.L(72.0f) : 0), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.y ? 71.0f : 58.0f), TLObject.FLAG_30));
    }
}
