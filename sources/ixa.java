// default package

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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ixa extends LinearLayout {
    public static HashMap F;
    public boolean E;
    public final int a;
    public final pc0 b;
    public final bf0 c;
    public final bf0 d;
    public int e;
    public final TextView f;
    public final LinearLayout.LayoutParams h;
    public final l66 n;
    public final TextView r;
    public final TextView s;
    public final SpannableString w;
    public final SpannableString x;
    public boolean y;

    public ixa(int i, ylb ylbVar, Context context) {
        super(context);
        this.e = 1;
        this.a = i;
        setOrientation(0);
        ec0 ec0Var = new ec0(this, context, ylbVar);
        addView(ec0Var, qoe.p(72, -1, 0.0f, nm7.z1));
        bf0 bf0Var = new bf0(context);
        this.d = bf0Var;
        bf0Var.setRoundRadius(gm.L(46.0f));
        ec0Var.addView(bf0Var, qoe.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.b = new pc0((ylb) null);
        bf0 bf0Var2 = new bf0(context);
        this.c = bf0Var2;
        bf0Var2.setRoundRadius(gm.L(46.0f));
        ec0Var.addView(bf0Var2, qoe.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, qoe.p(-2, -1, 1.0f, nm7.D1));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTypeface(gm.o());
        int i2 = cmb.F6;
        anb.X(textView, i2, ylbVar);
        textView.setTextSize(1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k = qoe.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k;
        linearLayout.addView(textView, k);
        l66 l66Var = new l66(context, null);
        this.n = l66Var;
        anb.X(l66Var, i2, ylbVar);
        l66Var.setTextSize(1, 13.0f);
        l66Var.setEllipsize(truncateAt);
        l66Var.setSingleLine(true);
        linearLayout.addView(l66Var, qoe.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.r = textView2;
        anb.X(textView2, cmb.y6, ylbVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        linearLayout.addView(textView2, qoe.o(-1, -2));
        TextView textView3 = new TextView(context);
        this.s = textView3;
        textView3.setTypeface(gm.o());
        textView3.setTextSize(1, 15.3f);
        textView3.setGravity(5);
        addView(textView3, qoe.q(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.w = spannableString;
        Drawable d = b10.d(context, R.drawable.star_small_inner);
        d.setBounds(0, 0, gm.L(21.0f), gm.L(21.0f));
        spannableString.setSpan(new ImageSpan(d), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.x = spannableString2;
        pn2 pn2Var = new pn2(0, b10.d(context, R.drawable.mini_gram_72));
        pn2Var.d = false;
        pn2Var.c(gm.L(18.0f));
        pn2Var.s = gm.L(0.5f);
        spannableString2.setSpan(pn2Var, 0, spannableString2.length(), 33);
    }

    public static sn2 a(int i, String str) {
        if (i != 44) {
            return q7a.a(i, str);
        }
        HashMap hashMap = F;
        if (hashMap == null) {
            hashMap = new HashMap();
            F = hashMap;
        }
        sn2 sn2Var = (sn2) hashMap.get(str);
        if (sn2Var != null) {
            return sn2Var;
        }
        HashMap hashMap2 = F;
        sn2 a = q7a.a(44, str);
        hashMap2.put(str, a);
        return a;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.E) {
            canvas.drawRect(jb6.a0 ? 0.0f : gm.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(72.0f) : 0), getMeasuredHeight(), cmb.j0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(this.y ? 71.0f : 58.0f), TLObject.FLAG_30));
    }
}
