package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public abstract class m extends FrameLayout implements ne.k {
    public final c6 a;
    public final c2.b b;
    public final ne.l c;

    public m(Context context, c6 c6Var, c2.b bVar) {
        super(context);
        this.c = new ne.l(this, es.h, 350L);
        this.a = c6Var;
        this.b = bVar;
    }

    public final void a(CharSequence charSequence) {
        boolean z10;
        CharSequence charSequence2;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        ne.l lVar = this.c;
        if (isEmpty) {
            lVar.a.q(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        c2.b bVar = this.b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            bVar.A(valueOf, indexOf);
            z10 = true;
            charSequence2 = valueOf;
        } else {
            z10 = false;
            charSequence2 = charSequence;
        }
        l lVar2 = new l(this, getContext());
        int i10 = g6.gl;
        c6 c6Var = this.a;
        lVar2.setTextColor(g6.w0(i10, c6Var));
        lVar2.setLinkTextColor(g6.w0(i10, c6Var));
        lVar2.setTextSize(1, 14.0f);
        lVar2.setAlpha(0.0f);
        lVar2.setText(charSequence2);
        if (z10) {
            bVar.c(lVar2);
        }
        addView(lVar2, w7.a6.d(-2.0f, -2));
        lVar.h(lVar2, true);
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ne.g gVar = (ne.g) it.next();
            l lVar = (l) gVar.a;
            int i10 = g6.gl;
            c6 c6Var = this.a;
            lVar.setTextColor(g6.w0(i10, c6Var));
            ((l) gVar.a).setLinkTextColor(g6.w0(i10, c6Var));
        }
    }

    public void e(ne.l lVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ne.g gVar = (ne.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.a;
            float lerp = AndroidUtilities.lerp(0.85f, 1.0f, c10);
            l lVar2 = (l) obj;
            lVar2.setAlpha(c10);
            lVar2.setScaleX(lerp);
            lVar2.setScaleY(lerp);
            lVar2.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(!gVar.h ? 9.0f : -9.0f), 0, c10));
        }
    }

    public float getTotalVisibility() {
        return this.c.a.d.c.a;
    }

    @Override // ne.k
    public final /* synthetic */ void c() {
    }
}
