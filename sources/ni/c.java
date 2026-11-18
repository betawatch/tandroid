package ni;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import c8.ma;
import di.za;
import hi.d;
import hi.e7;
import hi.o0;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class c extends sa {
    public final za T1;
    public z41 U1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, TLRPC.Chat chat, Runnable runnable) {
        super(context, (i6) null, false);
        int i7 = 0;
        this.F1 = g0.L(30.0f);
        ck0 ck0Var = this.o1;
        int i10 = this.u0;
        ck0Var.setPadding(i10, 0, i10, g0.L(130.0f) + g0.n);
        this.o1.setClipToPadding(false);
        d dVar = new d(context, this.J0, true);
        dVar.setText(gd.M0(2131752578, null));
        dVar.e();
        dVar.f();
        dVar.setOnClickListener(new o0(this, 17));
        boolean V = v3.V(chat);
        d dVar2 = new d(context, this.J0, true);
        dVar2.setText(gd.M0(V ? 2131751913 : 2131751911, null));
        dVar2.f();
        dVar2.setOnClickListener(new b(i7, this, runnable));
        za zaVar = new za(context, 3);
        TextView textView = (TextView) zaVar.d;
        TextView textView2 = (TextView) zaVar.c;
        this.T1 = zaVar;
        zaVar.setPadding(g0.L(20.0f), 0, g0.L(20.0f), g0.L(17.0f));
        ((q9) zaVar.b).f(chat, new b9(chat));
        textView2.setText(n5.m(chat));
        int i11 = n6.G6;
        u6.U(textView2, i11, this.J0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new lq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) gd.M0(V ? 2131751914 : 2131751912, null));
        u6.U(textView, i11, this.J0);
        textView.setText(spannableStringBuilder);
        this.b.addView(dVar2, ma.f(48.0f, -1, 80, g0.L(12.0f) + this.u0, 0, g0.L(12.0f) + this.u0, g0.L(70.0f) + g0.n));
        this.b.addView(dVar, ma.f(48.0f, -1, 80, g0.L(12.0f) + this.u0, 0, g0.L(12.0f) + this.u0, g0.L(12.0f) + g0.n));
        this.U1.O(false);
    }

    @Override // org.telegram.ui.Components.sa
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(this.o1, getContext(), this.a, 0, true, new e7(this, 25), this.J0);
        this.U1 = z41Var;
        z41Var.r = false;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return null;
    }
}
