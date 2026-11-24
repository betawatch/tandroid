// default package

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class e6 extends FrameLayout implements l99 {
    public final ylb a;
    public final yh4 b;
    public final m99 c;

    public e6(Context context, ylb ylbVar, yh4 yh4Var) {
        super(context);
        this.c = new m99(this, d53.h, 350L);
        this.a = ylbVar;
        this.b = yh4Var;
    }

    public final void a(CharSequence charSequence, boolean z) {
        boolean z2;
        CharSequence charSequence2;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        m99 m99Var = this.c;
        if (isEmpty) {
            m99Var.a.m(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        yh4 yh4Var = this.b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            yh4Var.M(valueOf, indexOf);
            z2 = true;
            charSequence2 = valueOf;
        } else {
            z2 = false;
            charSequence2 = charSequence;
        }
        d6 d6Var = new d6(this, getContext());
        int i = cmb.Wl;
        ylb ylbVar = this.a;
        anb.X(d6Var, i, ylbVar);
        anb.G(d6Var, i, ylbVar);
        d6Var.setTextSize(1, 14.0f);
        d6Var.setAlpha(0.0f);
        d6Var.setText(charSequence2);
        if (z2) {
            yh4Var.d(d6Var);
        }
        addView(d6Var, qoe.c(-2.0f, -2));
        m99Var.h(d6Var, true);
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            u66 u66Var = (u66) it.next();
            d6 d6Var = (d6) u66Var.a;
            int i = cmb.Wl;
            ylb ylbVar = this.a;
            d6Var.setTextColor(cmb.v0(i, ylbVar));
            ((d6) u66Var.a).setLinkTextColor(cmb.v0(i, ylbVar));
        }
    }

    public void e(m99 m99Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            u66 u66Var = (u66) it.next();
            float c = u66Var.c();
            Object obj = u66Var.a;
            float R1 = gm.R1(0.85f, 1.0f, c);
            d6 d6Var = (d6) obj;
            d6Var.setAlpha(c);
            d6Var.setScaleX(R1);
            d6Var.setScaleY(R1);
            d6Var.setTranslationY(gm.U1(c, gm.L(!u66Var.h ? 9.0f : -9.0f), 0));
        }
    }

    public float getTotalVisibility() {
        return this.c.a.d.c.a;
    }

    @Override // l99
    public final void c() {
    }
}
