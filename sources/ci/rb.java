package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import java.util.HashMap;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rb extends LinearLayout {
    public static HashMap F;
    public boolean E;
    public final int a;
    public final org.telegram.ui.Components.u8 b;
    public final org.telegram.ui.Components.k9 c;
    public final org.telegram.ui.Components.k9 d;
    public int e;
    public final TextView f;
    public final LinearLayout.LayoutParams h;
    public final s70 n;
    public final TextView r;
    public final TextView s;
    public final SpannableString w;
    public final SpannableString x;
    public boolean y;

    public rb(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = 1;
        this.a = i3;
        setOrientation(0);
        l1 l1Var = new l1(this, context, e6Var);
        addView(l1Var, mf.p(72, -1, 0.0f, hs.A1));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.d = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        l1Var.addView(k9Var, mf.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.b = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.k9 k9Var2 = new org.telegram.ui.Components.k9(context);
        this.c = k9Var2;
        k9Var2.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        l1Var.addView(k9Var2, mf.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, mf.p(-2, -1, 1.0f, hs.E1));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i10, e6Var);
        textView.setTextSize(1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = mf.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        s70 s70Var = new s70(context, null);
        this.n = s70Var;
        org.telegram.ui.ActionBar.r6.V(s70Var, i10, e6Var);
        s70Var.setTextSize(1, 13.0f);
        s70Var.setEllipsize(truncateAt);
        s70Var.setSingleLine(true);
        linearLayout.addView(s70Var, mf.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.r = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.z6, e6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        linearLayout.addView(textView2, mf.o(-1, -2));
        TextView textView3 = new TextView(context);
        this.s = textView3;
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 15.3f);
        textView3.setGravity(5);
        addView(textView3, mf.q(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.w = spannableString;
        Drawable g7 = k2.p1.g(context, R.drawable.star_small_inner);
        g7.setBounds(0, 0, org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(21.0f));
        spannableString.setSpan(new ImageSpan(g7), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.x = spannableString2;
        wp wpVar = new wp(0, k2.p1.g(context, R.drawable.mini_gram_72));
        wpVar.d = false;
        wpVar.c(org.telegram.messenger.g0.L(18.0f));
        wpVar.s = org.telegram.messenger.g0.L(0.5f);
        spannableString2.setSpan(wpVar, 0, spannableString2.length(), 33);
    }

    public static xp a(int i3, String str) {
        if (i3 != 44) {
            return org.telegram.ui.Cells.r6.a(i3, str);
        }
        if (F == null) {
            F = new HashMap();
        }
        xp xpVar = (xp) F.get(str);
        if (xpVar != null) {
            return xpVar;
        }
        HashMap hashMap = F;
        xp a10 = org.telegram.ui.Cells.r6.a(44, str);
        hashMap.put(str, a10);
        return a10;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.E) {
            canvas.drawRect(bd.a0 ? 0.0f : org.telegram.messenger.g0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (bd.a0 ? org.telegram.messenger.g0.L(72.0f) : 0), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.y ? 71.0f : 58.0f), TLObject.FLAG_30));
    }
}
