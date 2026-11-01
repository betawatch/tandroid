package ai;

import ag.g;
import ag.t0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.messenger.o5;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uk0;
import vh.d;
import w7.b6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class c extends ha {
    public final b P1;
    public q51 Q1;

    public c(Context context, TLRPC.Chat chat, Runnable runnable) {
        super(context, (p6) null, false);
        this.B1 = i0.L(30.0f);
        uk0 uk0Var = this.k1;
        int i10 = this.t0;
        uk0Var.setPadding(i10, 0, i10, i0.L(130.0f) + i0.n);
        this.k1.setClipToPadding(false);
        d dVar = new d(context, this.I0, true);
        dVar.setText(dd.L0(2131752589, null));
        dVar.e();
        dVar.f();
        dVar.setOnClickListener(new g(this, 2));
        boolean V = w3.V(chat);
        d dVar2 = new d(context, this.I0, true);
        dVar2.setText(dd.L0(V ? 2131751924 : 2131751922, null));
        dVar2.f();
        dVar2.setOnClickListener(new t0(2, this, runnable));
        b bVar = new b(context, 0);
        TextView textView = (TextView) bVar.d;
        TextView textView2 = (TextView) bVar.c;
        this.P1 = bVar;
        bVar.setPadding(i0.L(20.0f), 0, i0.L(20.0f), i0.L(17.0f));
        ((g9) bVar.b).e(chat, new r8(chat));
        textView2.setText(o5.m(chat));
        int i11 = t6.G6;
        a7.V(textView2, i11, this.I0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new dq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) dd.L0(V ? 2131751925 : 2131751923, null));
        a7.V(textView, i11, this.I0);
        textView.setText(spannableStringBuilder);
        this.b.addView(dVar2, b6.f(48.0f, -1, 80, i0.L(12.0f) + this.t0, 0, i0.L(12.0f) + this.t0, i0.L(70.0f) + i0.n));
        this.b.addView(dVar, b6.f(48.0f, -1, 80, i0.L(12.0f) + this.t0, 0, i0.L(12.0f) + this.t0, i0.L(12.0f) + i0.n));
        this.Q1.O(false);
    }

    @Override // org.telegram.ui.Components.ha
    public final tk0 L0(uk0 uk0Var) {
        q51 q51Var = new q51(this.k1, getContext(), this.a, 0, true, new ag.a(this, 10), this.I0);
        this.Q1 = q51Var;
        q51Var.r = false;
        return q51Var;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return null;
    }
}
