// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class baa extends b6c {
    static {
        b6c.h(new baa());
    }

    public static c6c i(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        c6c K = c6c.K(baa.class);
        K.m = str;
        K.n = charSequence;
        K.o = str2;
        K.E = onClickListener;
        K.p = charSequence2;
        K.F = onClickListener2;
        return K;
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        caa caaVar = (caa) view;
        CharSequence charSequence = c6cVar.m;
        CharSequence charSequence2 = c6cVar.n;
        CharSequence charSequence3 = c6cVar.o;
        View.OnClickListener onClickListener = c6cVar.E;
        CharSequence charSequence4 = c6cVar.p;
        View.OnClickListener onClickListener2 = c6cVar.F;
        b61 b61Var = caaVar.e;
        l66 l66Var = caaVar.b;
        l66Var.setText(gw3.m(charSequence, l66Var.getPaint().getFontMetricsInt(), false, null, 0));
        l66 l66Var2 = caaVar.c;
        l66Var2.setText(gw3.m(charSequence2, l66Var2.getPaint().getFontMetricsInt(), false, null, 0));
        b61 b61Var2 = caaVar.d;
        b61Var2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        b61Var2.setText(charSequence3);
        b61Var2.setOnClickListener(onClickListener);
        b61Var.setText(charSequence4);
        b61Var.setOnClickListener(onClickListener2);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new caa(context, ylbVar);
    }

    @Override // b6c
    public final boolean f() {
        return false;
    }
}
