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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.z90;
import org.telegram.ui.Components.zq;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class yc extends LinearLayout {
    public static HashMap E;
    public final int a;
    public final org.telegram.ui.Components.j9 b;
    public final org.telegram.ui.Components.y9 c;
    public final org.telegram.ui.Components.y9 d;
    public int e;
    public final TextView f;
    public final LinearLayout.LayoutParams h;
    public final z90 n;
    public final TextView r;
    public final TextView s;
    public final SpannableString v;
    public final SpannableString w;
    public boolean x;
    public boolean y;

    public yc(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.e = 1;
        this.a = i10;
        setOrientation(0);
        t1 t1Var = new t1(this, context, u6Var);
        addView(t1Var, gb1.s(72, -1, 0.0f, 115));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.d = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        t1Var.addView(y9Var, gb1.h(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.b = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context);
        this.c = y9Var2;
        y9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        t1Var.addView(y9Var2, gb1.h(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, gb1.s(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(textView, i11, u6Var);
        textView.setTextSize(1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams o10 = gb1.o(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = o10;
        linearLayout.addView(textView, o10);
        z90 z90Var = new z90(context, null);
        this.n = z90Var;
        org.telegram.ui.ActionBar.f7.V(z90Var, i11, u6Var);
        z90Var.setTextSize(1, 13.0f);
        z90Var.setEllipsize(truncateAt);
        z90Var.setSingleLine(true);
        linearLayout.addView(z90Var, gb1.o(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.r = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.z6, u6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        linearLayout.addView(textView2, gb1.r(-1, -2));
        TextView textView3 = new TextView(context);
        this.s = textView3;
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 15.3f);
        textView3.setGravity(5);
        addView(textView3, gb1.t(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.v = spannableString;
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        mutate.setBounds(0, 0, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f));
        spannableString.setSpan(new ImageSpan(mutate), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.w = spannableString2;
        zq zqVar = new zq(0, context.getResources().getDrawable(R.drawable.mini_gram_72).mutate());
        zqVar.recolorDrawable = false;
        zqVar.setSize(AndroidUtilities.dp(18.0f));
        zqVar.setTranslateY(AndroidUtilities.dp(0.5f));
        spannableString2.setSpan(zqVar, 0, spannableString2.length(), 33);
    }

    public static ar a(int i10, String str) {
        if (i10 != 44) {
            return org.telegram.ui.Cells.z6.a(i10, str);
        }
        if (E == null) {
            E = new HashMap();
        }
        ar arVar = (ar) E.get(str);
        if (arVar != null) {
            return arVar;
        }
        HashMap hashMap = E;
        ar a2 = org.telegram.ui.Cells.z6.a(44, str);
        hashMap.put(str, a2);
        return a2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.y) {
            canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), getMeasuredHeight(), org.telegram.ui.ActionBar.y6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.x ? 71.0f : 58.0f), TLObject.FLAG_30));
    }
}
