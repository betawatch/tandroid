package ni;

import ai.p2;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import c8.na;
import di.za;
import hi.e;
import hi.y7;
import hi.z4;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.ra;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class b extends ra {
    public final za T1;
    public b51 U1;

    public b(Context context, TLRPC.Chat chat, Runnable runnable) {
        super(context, (i6) null, false);
        this.F1 = g0.L(30.0f);
        ek0 ek0Var = this.o1;
        int i7 = this.u0;
        ek0Var.setPadding(i7, 0, i7, g0.L(130.0f) + g0.n);
        this.o1.setClipToPadding(false);
        e eVar = new e(context, this.J0, true);
        eVar.setText(gd.N0(2131752577, null));
        eVar.e();
        eVar.f();
        eVar.setOnClickListener(new z4(this, 16));
        boolean V = v3.V(chat);
        e eVar2 = new e(context, this.J0, true);
        eVar2.setText(gd.N0(V ? 2131751912 : 2131751910, null));
        eVar2.f();
        eVar2.setOnClickListener(new p2(29, this, runnable));
        za zaVar = new za(context, 3);
        TextView textView = (TextView) zaVar.d;
        TextView textView2 = (TextView) zaVar.c;
        this.T1 = zaVar;
        zaVar.setPadding(g0.L(20.0f), 0, g0.L(20.0f), g0.L(17.0f));
        ((p9) zaVar.b).f(chat, new a9(chat));
        textView2.setText(n5.m(chat));
        int i10 = n6.G6;
        u6.U(textView2, i10, this.J0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new kq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) gd.N0(V ? 2131751913 : 2131751911, null));
        u6.U(textView, i10, this.J0);
        textView.setText(spannableStringBuilder);
        this.b.addView(eVar2, na.f(48.0f, -1, 80, g0.L(12.0f) + this.u0, 0, g0.L(12.0f) + this.u0, g0.L(70.0f) + g0.n));
        this.b.addView(eVar, na.f(48.0f, -1, 80, g0.L(12.0f) + this.u0, 0, g0.L(12.0f) + this.u0, g0.L(12.0f) + g0.n));
        this.U1.O(false);
    }

    @Override // org.telegram.ui.Components.ra
    public final dk0 M0(ek0 ek0Var) {
        b51 b51Var = new b51(this.o1, getContext(), this.a, 0, true, new y7(this, 25), this.J0);
        this.U1 = b51Var;
        b51Var.r = false;
        return b51Var;
    }

    @Override // org.telegram.ui.Components.ra
    public final CharSequence P0() {
        return null;
    }
}
