package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import c8.ma;
import java.util.Iterator;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public abstract class m extends FrameLayout implements te.i {
    public final i6 a;
    public final ab.q b;
    public final te.j c;

    public m(Context context, i6 i6Var, ab.q qVar) {
        super(context);
        this.c = new te.j(this, lr.h, 350L);
        this.a = i6Var;
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
        int i7 = n6.Xl;
        i6 i6Var = this.a;
        u6.U(lVar, i7, i6Var);
        u6.G(lVar, i7, i6Var);
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
            int i7 = n6.Xl;
            i6 i6Var = this.a;
            lVar.setTextColor(n6.w0(i7, i6Var));
            ((l) eVar.a).setLinkTextColor(n6.w0(i7, i6Var));
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
