package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import b8.mf;
import java.util.Iterator;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class m extends FrameLayout implements qe.i {
    public final e6 a;
    public final b4.n b;
    public final qe.j c;

    public m(Context context, e6 e6Var, b4.n nVar) {
        super(context);
        this.c = new qe.j(this, xq.h, 350L);
        this.a = e6Var;
        this.b = nVar;
    }

    public void b(qe.j jVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            qe.e eVar = (qe.e) it.next();
            float c2 = eVar.c();
            Object obj = eVar.a;
            float T1 = org.telegram.messenger.g0.T1(0.85f, 1.0f, c2);
            l lVar = (l) obj;
            lVar.setAlpha(c2);
            lVar.setScaleX(T1);
            lVar.setScaleY(T1);
            lVar.setTranslationY(org.telegram.messenger.g0.W1(c2, org.telegram.messenger.g0.L(!eVar.h ? 9.0f : -9.0f), 0));
        }
    }

    public final void c(CharSequence charSequence, boolean z10) {
        boolean z11;
        CharSequence charSequence2;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        qe.j jVar = this.c;
        if (isEmpty) {
            jVar.a.m(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        b4.n nVar = this.b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            nVar.E(valueOf, indexOf);
            z11 = true;
            charSequence2 = valueOf;
        } else {
            z11 = false;
            charSequence2 = charSequence;
        }
        l lVar = new l(this, getContext());
        int i3 = k6.Ul;
        e6 e6Var = this.a;
        r6.V(lVar, i3, e6Var);
        r6.H(lVar, i3, e6Var);
        lVar.setTextSize(1, 14.0f);
        lVar.setAlpha(0.0f);
        lVar.setText(charSequence2);
        if (z11) {
            nVar.c(lVar);
        }
        addView(lVar, mf.c(-2.0f, -2));
        jVar.h(lVar, true);
    }

    public final void d() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            qe.e eVar = (qe.e) it.next();
            l lVar = (l) eVar.a;
            int i3 = k6.Ul;
            e6 e6Var = this.a;
            lVar.setTextColor(k6.w0(i3, e6Var));
            ((l) eVar.a).setLinkTextColor(k6.w0(i3, e6Var));
        }
    }

    public float getTotalVisibility() {
        return this.c.a.d.c.a;
    }

    @Override // qe.i
    public final /* synthetic */ void a() {
    }
}
