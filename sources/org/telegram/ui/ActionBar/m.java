package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import c8.ha;
import java.util.Iterator;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class m extends FrameLayout implements te.i {
    public final f6 a;
    public final ab.q b;
    public final te.j c;

    public m(Context context, f6 f6Var, ab.q qVar) {
        super(context);
        this.c = new te.j(this, xq.h, 350L);
        this.a = f6Var;
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
        l lVar = new l(this, getContext());
        int i7 = k6.Ul;
        f6 f6Var = this.a;
        r6.V(lVar, i7, f6Var);
        r6.H(lVar, i7, f6Var);
        lVar.setTextSize(1, 14.0f);
        lVar.setAlpha(0.0f);
        lVar.setText(charSequence2);
        if (z10) {
            qVar.c(lVar);
        }
        addView(lVar, ha.c(-2.0f, -2));
        jVar.f(lVar, true);
    }

    public final void c() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            l lVar = (l) eVar.a;
            int i7 = k6.Ul;
            f6 f6Var = this.a;
            lVar.setTextColor(k6.w0(i7, f6Var));
            ((l) eVar.a).setLinkTextColor(k6.w0(i7, f6Var));
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
