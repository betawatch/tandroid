package bi;

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
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class yc extends LinearLayout {
    public static HashMap E;
    public boolean D;
    public final int a;
    public final org.telegram.ui.Components.w8 b;
    public final org.telegram.ui.Components.l9 c;
    public final org.telegram.ui.Components.l9 d;
    public int e;
    public final TextView f;
    public final LinearLayout.LayoutParams h;
    public final w70 n;
    public final TextView r;
    public final TextView s;
    public final SpannableString w;
    public final SpannableString x;
    public boolean y;

    public yc(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = 1;
        this.a = i7;
        setOrientation(0);
        s1 s1Var = new s1(this, context, f6Var);
        addView(s1Var, c8.ha.p(72, -1, 0.0f, qs.A1));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.d = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        s1Var.addView(l9Var, c8.ha.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.b = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.l9 l9Var2 = new org.telegram.ui.Components.l9(context);
        this.c = l9Var2;
        l9Var2.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        s1Var.addView(l9Var2, c8.ha.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, c8.ha.p(-2, -1, 1.0f, qs.E1));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i10, f6Var);
        textView.setTextSize(1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = c8.ha.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        w70 w70Var = new w70(context, null);
        this.n = w70Var;
        org.telegram.ui.ActionBar.r6.V(w70Var, i10, f6Var);
        w70Var.setTextSize(1, 13.0f);
        w70Var.setEllipsize(truncateAt);
        w70Var.setSingleLine(true);
        linearLayout.addView(w70Var, c8.ha.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.r = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.z6, f6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        linearLayout.addView(textView2, c8.ha.o(-1, -2));
        TextView textView3 = new TextView(context);
        this.s = textView3;
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 15.3f);
        textView3.setGravity(5);
        addView(textView3, c8.ha.q(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.w = spannableString;
        Drawable h = jg.g.h(context, R.drawable.star_small_inner);
        h.setBounds(0, 0, org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(21.0f));
        spannableString.setSpan(new ImageSpan(h), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.x = spannableString2;
        wp wpVar = new wp(0, jg.g.h(context, R.drawable.mini_gram_72));
        wpVar.d = false;
        wpVar.c(org.telegram.messenger.g0.L(18.0f));
        wpVar.s = org.telegram.messenger.g0.L(0.5f);
        spannableString2.setSpan(wpVar, 0, spannableString2.length(), 33);
    }

    public static xp a(int i7, String str) {
        if (i7 != 44) {
            return org.telegram.ui.Cells.s6.a(i7, str);
        }
        if (E == null) {
            E = new HashMap();
        }
        xp xpVar = (xp) E.get(str);
        if (xpVar != null) {
            return xpVar;
        }
        HashMap hashMap = E;
        xp a10 = org.telegram.ui.Cells.s6.a(44, str);
        hashMap.put(str, a10);
        return a10;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.D) {
            canvas.drawRect(org.telegram.messenger.id.a0 ? 0.0f : org.telegram.messenger.g0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(72.0f) : 0), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.y ? 71.0f : 58.0f), TLObject.FLAG_30));
    }
}
