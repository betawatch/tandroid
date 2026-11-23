package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import c8.ma;
import java.util.Iterator;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public abstract class m extends FrameLayout implements te.i {
    public final h6 a;
    public final ab.q b;
    public final te.j c;

    public m(Context context, h6 h6Var, ab.q qVar) {
        super(context);
        this.c = new te.j(this, nr.h, 350L);
        this.a = h6Var;
        this.b = qVar;
    }

    public final void b(CharSequence charSequence, boolean z10) {
        boolean z11;
        CharSequence charSequence2;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        te.j jVar = this.c;
        if (isEmpty) {
            jVar.a.m(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        ab.q qVar = this.b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            qVar.F(valueOf, indexOf);
            z11 = true;
            charSequence2 = valueOf;
        } else {
            z11 = false;
            charSequence2 = charSequence;
        }
        l lVar = new l(this, getContext());
        int i7 = m6.Xl;
        h6 h6Var = this.a;
        t6.U(lVar, i7, h6Var);
        t6.G(lVar, i7, h6Var);
        lVar.setTextSize(1, 14.0f);
        lVar.setAlpha(0.0f);
        lVar.setText(charSequence2);
        if (z11) {
            qVar.c(lVar);
        }
        addView(lVar, ma.c(-2.0f, -2));
        jVar.f(lVar, true);
    }

    public final void c() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            l lVar = (l) eVar.a;
            int i7 = m6.Xl;
            h6 h6Var = this.a;
            lVar.setTextColor(m6.w0(i7, h6Var));
            ((l) eVar.a).setLinkTextColor(m6.w0(i7, h6Var));
        }
    }

    public void f(te.j jVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            float c10 = eVar.c();
            Object obj = eVar.a;
            float T1 = org.telegram.messenger.g0.T1(0.85f, 1.0f, c10);
            l lVar = (l) obj;
            lVar.setAlpha(c10);
            lVar.setScaleX(T1);
            lVar.setScaleY(T1);
            lVar.setTranslationY(org.telegram.messenger.g0.W1(c10, org.telegram.messenger.g0.L(!eVar.h ? 9.0f : -9.0f), 0));
        }
    }

    public float getTotalVisibility() {
        return this.c.a.d.c.a;
    }

    @Override // te.i
    public final /* synthetic */ void a() {
    }
}
