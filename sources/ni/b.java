package ni;

import ai.v2;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import di.va;
import hi.d;
import hi.p5;
import hi.q4;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class b extends ja {
    public final va T1;
    public p41 U1;

    public b(Context context, TLRPC.Chat chat, Runnable runnable) {
        super(context, (e6) null, false);
        this.F1 = g0.L(30.0f);
        uj0 uj0Var = this.o1;
        int i7 = this.u0;
        uj0Var.setPadding(i7, 0, i7, g0.L(130.0f) + g0.n);
        this.o1.setClipToPadding(false);
        d dVar = new d(context, this.J0, true);
        dVar.setText(hd.M0(2131752589, null));
        dVar.e();
        dVar.f();
        dVar.setOnClickListener(new p5(this, 15));
        boolean V = t3.V(chat);
        d dVar2 = new d(context, this.J0, true);
        dVar2.setText(hd.M0(V ? 2131751924 : 2131751922, null));
        dVar2.f();
        dVar2.setOnClickListener(new v2(28, this, runnable));
        va vaVar = new va(context, 3);
        TextView textView = (TextView) vaVar.d;
        TextView textView2 = (TextView) vaVar.c;
        this.T1 = vaVar;
        vaVar.setPadding(g0.L(20.0f), 0, g0.L(20.0f), g0.L(17.0f));
        ((i9) vaVar.b).f(chat, new t8(chat));
        textView2.setText(m5.m(chat));
        int i10 = j6.G6;
        q6.U(textView2, i10, this.J0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new eq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) hd.M0(V ? 2131751925 : 2131751923, null));
        q6.U(textView, i10, this.J0);
        textView.setText(spannableStringBuilder);
        this.b.addView(dVar2, c8.ja.f(48.0f, -1, 80, g0.L(12.0f) + this.u0, 0, g0.L(12.0f) + this.u0, g0.L(70.0f) + g0.n));
        this.b.addView(dVar, c8.ja.f(48.0f, -1, 80, g0.L(12.0f) + this.u0, 0, g0.L(12.0f) + this.u0, g0.L(12.0f) + g0.n));
        this.U1.O(false);
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(this.o1, getContext(), this.a, 0, true, new q4(this, 25), this.J0);
        this.U1 = p41Var;
        p41Var.r = false;
        return p41Var;
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        return null;
    }
}
