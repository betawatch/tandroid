package ki;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import bi.nc;
import bi.r;
import c8.ha;
import fi.d;
import hi.u1;
import ii.g;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class b extends ma {
    public final nc S1;
    public m41 T1;

    public b(Context context, TLRPC.Chat chat, Runnable runnable) {
        super(context, (h6) null, false);
        this.E1 = g0.L(30.0f);
        pj0 pj0Var = this.n1;
        int i7 = this.t0;
        pj0Var.setPadding(i7, 0, i7, g0.L(130.0f) + g0.n);
        this.n1.setClipToPadding(false);
        d dVar = new d(context, this.I0, true);
        dVar.setText(id.M0(2131752589, null));
        dVar.e();
        dVar.f();
        dVar.setOnClickListener(new g(this, 9));
        boolean V = t3.V(chat);
        d dVar2 = new d(context, this.I0, true);
        dVar2.setText(id.M0(V ? 2131751924 : 2131751922, null));
        dVar2.f();
        dVar2.setOnClickListener(new r(21, this, runnable));
        nc ncVar = new nc(context, 3);
        TextView textView = (TextView) ncVar.d;
        TextView textView2 = (TextView) ncVar.c;
        this.S1 = ncVar;
        ncVar.setPadding(g0.L(20.0f), 0, g0.L(20.0f), g0.L(17.0f));
        ((k9) ncVar.b).e(chat, new v8(chat));
        textView2.setText(m5.m(chat));
        int i10 = m6.G6;
        t6.U(textView2, i10, this.I0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new wp(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) id.M0(V ? 2131751925 : 2131751923, null));
        t6.U(textView, i10, this.I0);
        textView.setText(spannableStringBuilder);
        this.b.addView(dVar2, ha.f(48.0f, -1, 80, g0.L(12.0f) + this.t0, 0, g0.L(12.0f) + this.t0, g0.L(70.0f) + g0.n));
        this.b.addView(dVar, ha.f(48.0f, -1, 80, g0.L(12.0f) + this.t0, 0, g0.L(12.0f) + this.t0, g0.L(12.0f) + g0.n));
        this.T1.O(false);
    }

    @Override // org.telegram.ui.Components.ma
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(this.n1, getContext(), this.a, 0, true, new u1(this, 15), this.I0);
        this.T1 = m41Var;
        m41Var.r = false;
        return m41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return null;
    }
}
