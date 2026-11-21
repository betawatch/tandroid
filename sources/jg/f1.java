package jg;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.q9;
import org.telegram.ui.iz;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class f1 extends LinearLayout implements b6 {
    public ShapeDrawable a;
    public final h6 b;
    public final q9 c;
    public final b9 d;
    public final TextView e;
    public final TextView f;

    public f1(Context context, h6 h6Var, boolean z10) {
        super(context);
        this.d = new b9((h6) null);
        this.b = h6Var;
        setOrientation(0);
        q9 q9Var = new q9(context);
        this.c = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        addView(q9Var, ma.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ma.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 15.0f);
        int i7 = m6.G6;
        t6.U(textView, i7, h6Var);
        linearLayout.addView(textView, ma.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 13.0f);
        t6.V(textView2, z10 ? t6.K(0.5f, i7) : t6.M(m6.z6), h6Var);
        linearLayout.addView(textView2, ma.o(-1, -2));
    }

    public final void a(int i7, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.f;
        TextView textView2 = this.e;
        q9 q9Var = this.c;
        if (i7 == 0) {
            ShapeDrawable d02 = m6.d0(org.telegram.messenger.g0.L(28.0f), m6.w0(m6.Fi, this.b));
            this.a = d02;
            oq oqVar = new oq(d02, getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            oqVar.s = org.telegram.messenger.g0.L(-0.66f);
            oqVar.w = 0;
            int L = org.telegram.messenger.g0.L(20.0f);
            int L2 = org.telegram.messenger.g0.L(20.0f);
            oqVar.e = L;
            oqVar.f = L2;
            q9Var.setImageDrawable(oqVar);
            textView2.setText(gd.a0(null, null, 2131749151, str));
            textView.setText(gd.N0(2131749152, null));
            return;
        }
        b9 b9Var = this.d;
        b9Var.q(chat);
        q9Var.f(chat, b9Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.a0(null, null, 2131749149, str + "@" + v3.K(chat, false)));
        spannableStringBuilder.append((CharSequence) "  d");
        iz izVar = new iz(8);
        izVar.f = m6.x0(null, m6.Ck, false);
        izVar.n = false;
        spannableStringBuilder.setSpan(izVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(gd.N0(2131749150, null));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.a;
            if (shapeDrawable != null) {
                m6.C1(m6.w0(m6.Fi, this.b), shapeDrawable);
                q9 q9Var = this.c;
                if (q9Var != null) {
                    q9Var.invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
