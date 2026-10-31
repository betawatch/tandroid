package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class n extends FrameLayout implements fe.l {
    public final p6 a;
    public final ac.a b;
    public final fe.m c;

    public n(Context context, p6 p6Var, ac.a aVar) {
        super(context);
        this.c = new fe.m(this, gr.h, 350L);
        this.a = p6Var;
        this.b = aVar;
    }

    public void b(fe.m mVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            fe.h hVar = (fe.h) it.next();
            float c10 = hVar.c();
            Object obj = hVar.a;
            float T1 = org.telegram.messenger.i0.T1(0.85f, 1.0f, c10);
            m mVar2 = (m) obj;
            mVar2.setAlpha(c10);
            mVar2.setScaleX(T1);
            mVar2.setScaleY(T1);
            mVar2.setTranslationY(org.telegram.messenger.i0.W1(c10, org.telegram.messenger.i0.L(!hVar.h ? 9.0f : -9.0f), 0));
        }
    }

    public final void c(CharSequence charSequence, boolean z10) {
        boolean z11;
        CharSequence charSequence2;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        fe.m mVar = this.c;
        if (isEmpty) {
            mVar.a.q(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        ac.a aVar = this.b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            aVar.D(valueOf, indexOf);
            z11 = true;
            charSequence2 = valueOf;
        } else {
            z11 = false;
            charSequence2 = charSequence;
        }
        m mVar2 = new m(this, getContext());
        int i10 = t6.Ul;
        p6 p6Var = this.a;
        a7.V(mVar2, i10, p6Var);
        a7.H(mVar2, i10, p6Var);
        mVar2.setTextSize(1, 14.0f);
        mVar2.setAlpha(0.0f);
        mVar2.setText(charSequence2);
        if (z11) {
            aVar.c(mVar2);
        }
        addView(mVar2, w7.b6.c(-2.0f, -2));
        mVar.l(mVar2, true);
    }

    public final void d() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            fe.h hVar = (fe.h) it.next();
            m mVar = (m) hVar.a;
            int i10 = t6.Ul;
            p6 p6Var = this.a;
            mVar.setTextColor(t6.w0(i10, p6Var));
            ((m) hVar.a).setLinkTextColor(t6.w0(i10, p6Var));
        }
    }

    public float getTotalVisibility() {
        return this.c.a.d.c.a;
    }

    @Override // fe.l
    public final /* synthetic */ void a() {
    }
}
