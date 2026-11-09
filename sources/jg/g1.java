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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xp;
import org.telegram.ui.gz;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class g1 extends LinearLayout implements b6 {
    public ShapeDrawable a;
    public final g6 b;
    public final l9 c;
    public final w8 d;
    public final TextView e;
    public final TextView f;

    public g1(Context context, g6 g6Var, boolean z9) {
        super(context);
        this.d = new w8((g6) null);
        this.b = g6Var;
        setOrientation(0);
        l9 l9Var = new l9(context);
        this.c = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        addView(l9Var, ha.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ha.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 15.0f);
        int i7 = l6.G6;
        s6.U(textView, i7, g6Var);
        linearLayout.addView(textView, ha.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 13.0f);
        s6.V(textView2, z9 ? s6.K(0.5f, i7) : s6.M(l6.z6), g6Var);
        linearLayout.addView(textView2, ha.o(-1, -2));
    }

    public final void a(int i7, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.f;
        TextView textView2 = this.e;
        l9 l9Var = this.c;
        if (i7 == 0) {
            ShapeDrawable d02 = l6.d0(org.telegram.messenger.g0.L(28.0f), l6.w0(l6.Ci, this.b));
            this.a = d02;
            xp xpVar = new xp(d02, getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            xpVar.s = org.telegram.messenger.g0.L(-0.66f);
            xpVar.w = 0;
            int L = org.telegram.messenger.g0.L(20.0f);
            int L2 = org.telegram.messenger.g0.L(20.0f);
            xpVar.e = L;
            xpVar.f = L2;
            l9Var.setImageDrawable(xpVar);
            textView2.setText(id.a0(null, null, 2131749344, str));
            textView.setText(id.M0(2131749345, null));
            return;
        }
        w8 w8Var = this.d;
        w8Var.q(chat);
        l9Var.e(chat, w8Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(id.a0(null, null, 2131749342, str + "@" + t3.K(chat, false)));
        spannableStringBuilder.append((CharSequence) "  d");
        gz gzVar = new gz(8);
        gzVar.f = l6.x0(null, l6.zk, false);
        gzVar.n = false;
        spannableStringBuilder.setSpan(gzVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(id.M0(2131749343, null));
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
                l6.C1(l6.w0(l6.Ci, this.b), shapeDrawable);
                l9 l9Var = this.c;
                if (l9Var != null) {
                    l9Var.invalidate();
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
