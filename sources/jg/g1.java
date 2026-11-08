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
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xp;
import org.telegram.ui.ez;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class g1 extends LinearLayout implements a6 {
    public ShapeDrawable a;
    public final f6 b;
    public final l9 c;
    public final w8 d;
    public final TextView e;
    public final TextView f;

    public g1(Context context, f6 f6Var, boolean z9) {
        super(context);
        this.d = new w8((f6) null);
        this.b = f6Var;
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
        int i7 = k6.G6;
        r6.V(textView, i7, f6Var);
        linearLayout.addView(textView, ha.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 13.0f);
        r6.W(textView2, z9 ? r6.L(0.5f, i7) : r6.N(k6.z6), f6Var);
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
            ShapeDrawable d02 = k6.d0(org.telegram.messenger.g0.L(28.0f), k6.w0(k6.Ci, this.b));
            this.a = d02;
            xp xpVar = new xp(d02, getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            xpVar.s = org.telegram.messenger.g0.L(-0.66f);
            xpVar.w = 0;
            int L = org.telegram.messenger.g0.L(20.0f);
            int L2 = org.telegram.messenger.g0.L(20.0f);
            xpVar.e = L;
            xpVar.f = L2;
            l9Var.setImageDrawable(xpVar);
            textView2.setText(id.a0(null, null, 2131749345, str));
            textView.setText(id.M0(2131749346, null));
            return;
        }
        w8 w8Var = this.d;
        w8Var.q(chat);
        l9Var.e(chat, w8Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(id.a0(null, null, 2131749343, str + "@" + t3.K(chat, false)));
        spannableStringBuilder.append((CharSequence) "  d");
        ez ezVar = new ez(8);
        ezVar.f = k6.x0(null, k6.zk, false);
        ezVar.n = false;
        spannableStringBuilder.setSpan(ezVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(id.M0(2131749344, null));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.a;
            if (shapeDrawable != null) {
                k6.C1(k6.w0(k6.Ci, this.b), shapeDrawable);
                l9 l9Var = this.c;
                if (l9Var != null) {
                    l9Var.invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
