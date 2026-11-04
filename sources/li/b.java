package li;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import b8.mf;
import ci.gb;
import gi.d;
import gi.q4;
import ii.m;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b extends ma {
    public final gb Q1;
    public f41 R1;

    public b(Context context, TLRPC.Chat chat, Runnable runnable) {
        super(context, (e6) null, false);
        this.C1 = g0.L(30.0f);
        tj0 tj0Var = this.l1;
        int i3 = this.u0;
        tj0Var.setPadding(i3, 0, i3, g0.L(130.0f) + g0.n);
        this.l1.setClipToPadding(false);
        d dVar = new d(context, this.J0, true);
        dVar.setText(bd.M0(2131752589, null));
        dVar.e();
        dVar.f();
        dVar.setOnClickListener(new m(this, 12));
        boolean V = t3.V(chat);
        d dVar2 = new d(context, this.J0, true);
        dVar2.setText(bd.M0(V ? 2131751924 : 2131751922, null));
        dVar2.f();
        dVar2.setOnClickListener(new ai.d(27, this, runnable));
        gb gbVar = new gb(context, 3);
        TextView textView = (TextView) gbVar.d;
        TextView textView2 = (TextView) gbVar.c;
        this.Q1 = gbVar;
        gbVar.setPadding(g0.L(20.0f), 0, g0.L(20.0f), g0.L(17.0f));
        ((k9) gbVar.b).e(chat, new u8(chat));
        textView2.setText(m5.m(chat));
        int i10 = k6.G6;
        r6.V(textView2, i10, this.J0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new wp(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) bd.M0(V ? 2131751925 : 2131751923, null));
        r6.V(textView, i10, this.J0);
        textView.setText(spannableStringBuilder);
        this.b.addView(dVar2, mf.f(48.0f, -1, 80, g0.L(12.0f) + this.u0, 0, g0.L(12.0f) + this.u0, g0.L(70.0f) + g0.n));
        this.b.addView(dVar, mf.f(48.0f, -1, 80, g0.L(12.0f) + this.u0, 0, g0.L(12.0f) + this.u0, g0.L(12.0f) + g0.n));
        this.R1.O(false);
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(this.l1, getContext(), this.a, 0, true, new q4(this, 25), this.J0);
        this.R1 = f41Var;
        f41Var.r = false;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return null;
    }
}
