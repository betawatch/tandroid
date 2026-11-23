package jg;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
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
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.hz;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f1 extends LinearLayout implements c6 {
    public ShapeDrawable a;
    public final i6 b;
    public final p9 c;
    public final a9 d;
    public final TextView e;
    public final TextView f;

    public f1(Context context, i6 i6Var, boolean z10) {
        super(context);
        this.d = new a9((i6) null);
        this.b = i6Var;
        setOrientation(0);
        p9 p9Var = new p9(context);
        this.c = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        addView(p9Var, na.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, na.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 15.0f);
        int i7 = n6.G6;
        u6.U(textView, i7, i6Var);
        linearLayout.addView(textView, na.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 13.0f);
        u6.V(textView2, z10 ? u6.K(0.5f, i7) : u6.M(n6.z6), i6Var);
        linearLayout.addView(textView2, na.o(-1, -2));
    }

    public final void a(int i7, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.f;
        TextView textView2 = this.e;
        p9 p9Var = this.c;
        if (i7 == 0) {
            ShapeDrawable d02 = n6.d0(org.telegram.messenger.g0.L(28.0f), n6.w0(n6.Fi, this.b));
            this.a = d02;
            lq lqVar = new lq(d02, getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            lqVar.s = org.telegram.messenger.g0.L(-0.66f);
            lqVar.w = 0;
            int L = org.telegram.messenger.g0.L(20.0f);
            int L2 = org.telegram.messenger.g0.L(20.0f);
            lqVar.e = L;
            lqVar.f = L2;
            p9Var.setImageDrawable(lqVar);
            textView2.setText(gd.a0(null, null, 2131749151, str));
            textView.setText(gd.N0(2131749152, null));
            return;
        }
        a9 a9Var = this.d;
        a9Var.q(chat);
        p9Var.f(chat, a9Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.a0(null, null, 2131749149, str + "@" + v3.K(chat, false)));
        spannableStringBuilder.append((CharSequence) "  d");
        hz hzVar = new hz(8);
        hzVar.f = n6.x0(null, n6.Ck, false);
        hzVar.n = false;
        spannableStringBuilder.setSpan(hzVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(gd.N0(2131749150, null));
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
                p9 p9Var = this.c;
                if (p9Var != null) {
                    p9Var.invalidate();
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
