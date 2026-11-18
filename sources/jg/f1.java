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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.q9;
import org.telegram.ui.iz;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class f1 extends LinearLayout implements c6 {
    public ShapeDrawable a;
    public final i6 b;
    public final q9 c;
    public final b9 d;
    public final TextView e;
    public final TextView f;

    public f1(Context context, i6 i6Var, boolean z10) {
        super(context);
        this.d = new b9((i6) null);
        this.b = i6Var;
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
        int i7 = n6.G6;
        u6.U(textView, i7, i6Var);
        linearLayout.addView(textView, ma.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 13.0f);
        u6.V(textView2, z10 ? u6.K(0.5f, i7) : u6.M(n6.z6), i6Var);
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
            ShapeDrawable d02 = n6.d0(org.telegram.messenger.g0.L(28.0f), n6.w0(n6.Fi, this.b));
            this.a = d02;
            mq mqVar = new mq(d02, getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            mqVar.s = org.telegram.messenger.g0.L(-0.66f);
            mqVar.w = 0;
            int L = org.telegram.messenger.g0.L(20.0f);
            int L2 = org.telegram.messenger.g0.L(20.0f);
            mqVar.e = L;
            mqVar.f = L2;
            q9Var.setImageDrawable(mqVar);
            textView2.setText(gd.a0(null, null, 2131749152, str));
            textView.setText(gd.M0(2131749153, null));
            return;
        }
        b9 b9Var = this.d;
        b9Var.q(chat);
        q9Var.f(chat, b9Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.a0(null, null, 2131749150, str + "@" + v3.K(chat, false)));
        spannableStringBuilder.append((CharSequence) "  d");
        iz izVar = new iz(8);
        izVar.f = n6.x0(null, n6.Ck, false);
        izVar.n = false;
        spannableStringBuilder.setSpan(izVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(gd.M0(2131749151, null));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.a;
            if (shapeDrawable != null) {
                n6.C1(n6.w0(n6.Fi, this.b), shapeDrawable);
                q9 q9Var = this.c;
                if (q9Var != null) {
                    q9Var.invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
