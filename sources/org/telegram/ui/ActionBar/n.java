package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import c8.ha;
import java.util.Iterator;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class n extends FrameLayout implements te.i {
    public final h6 a;
    public final ab.q b;
    public final te.j c;

    public n(Context context, h6 h6Var, ab.q qVar) {
        super(context);
        this.c = new te.j(this, wq.h, 350L);
        this.a = h6Var;
        this.b = qVar;
    }

    public final void b(CharSequence charSequence, boolean z9) {
        boolean z10;
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
            qVar.E(valueOf, indexOf);
            z10 = true;
            charSequence2 = valueOf;
        } else {
            z10 = false;
            charSequence2 = charSequence;
        }
        m mVar = new m(this, getContext());
        int i7 = m6.Ul;
        h6 h6Var = this.a;
        t6.U(mVar, i7, h6Var);
        t6.G(mVar, i7, h6Var);
        mVar.setTextSize(1, 14.0f);
        mVar.setAlpha(0.0f);
        mVar.setText(charSequence2);
        if (z10) {
            qVar.c(mVar);
        }
        addView(mVar, ha.c(-2.0f, -2));
        jVar.f(mVar, true);
    }

    public final void c() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            m mVar = (m) eVar.a;
            int i7 = m6.Ul;
            h6 h6Var = this.a;
            mVar.setTextColor(m6.w0(i7, h6Var));
            ((m) eVar.a).setLinkTextColor(m6.w0(i7, h6Var));
        }
    }

    public void f(te.j jVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            float c10 = eVar.c();
            Object obj = eVar.a;
            float T1 = org.telegram.messenger.g0.T1(0.85f, 1.0f, c10);
            m mVar = (m) obj;
            mVar.setAlpha(c10);
            mVar.setScaleX(T1);
            mVar.setScaleY(T1);
            mVar.setTranslationY(org.telegram.messenger.g0.W1(c10, org.telegram.messenger.g0.L(!eVar.h ? 9.0f : -9.0f), 0));
        }
    }

    public float getTotalVisibility() {
        return this.c.a.d.c.a;
    }

    @Override // te.i
    public final /* synthetic */ void a() {
    }
}
