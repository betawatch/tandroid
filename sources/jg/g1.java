package jg;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.xp;
import org.telegram.ui.hz;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g1 extends LinearLayout implements c6 {
    public ShapeDrawable a;
    public final h6 b;
    public final k9 c;
    public final v8 d;
    public final TextView e;
    public final TextView f;

    public g1(Context context, h6 h6Var, boolean z9) {
        super(context);
        this.d = new v8((h6) null);
        this.b = h6Var;
        setOrientation(0);
        k9 k9Var = new k9(context);
        this.c = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        addView(k9Var, ha.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ha.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 15.0f);
        int i7 = m6.G6;
        t6.U(textView, i7, h6Var);
        linearLayout.addView(textView, ha.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 13.0f);
        t6.V(textView2, z9 ? t6.K(0.5f, i7) : t6.M(m6.z6), h6Var);
        linearLayout.addView(textView2, ha.o(-1, -2));
    }

    public final void a(int i7, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.f;
        TextView textView2 = this.e;
        k9 k9Var = this.c;
        if (i7 == 0) {
            ShapeDrawable d02 = m6.d0(org.telegram.messenger.g0.L(28.0f), m6.w0(m6.Ci, this.b));
            this.a = d02;
            xp xpVar = new xp(d02, getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            xpVar.s = org.telegram.messenger.g0.L(-0.66f);
            xpVar.w = 0;
            int L = org.telegram.messenger.g0.L(20.0f);
            int L2 = org.telegram.messenger.g0.L(20.0f);
            xpVar.e = L;
            xpVar.f = L2;
            k9Var.setImageDrawable(xpVar);
            textView2.setText(id.a0(null, null, 2131749344, str));
            textView.setText(id.M0(2131749345, null));
            return;
        }
        v8 v8Var = this.d;
        v8Var.q(chat);
        k9Var.e(chat, v8Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(id.a0(null, null, 2131749342, str + "@" + t3.K(chat, false)));
        spannableStringBuilder.append((CharSequence) "  d");
        hz hzVar = new hz(8);
        hzVar.f = m6.x0(null, m6.zk, false);
        hzVar.n = false;
        spannableStringBuilder.setSpan(hzVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(id.M0(2131749343, null));
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
                m6.C1(m6.w0(m6.Ci, this.b), shapeDrawable);
                k9 k9Var = this.c;
                if (k9Var != null) {
                    k9Var.invalidate();
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
