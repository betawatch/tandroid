package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class n extends FrameLayout implements vd.j {
    public final c6 a;
    public final ab.m b;
    public final vd.k c;

    public n(Context context, c6 c6Var, ab.m mVar) {
        super(context);
        this.c = new vd.k(this, jr.h, 350L);
        this.a = c6Var;
        this.b = mVar;
    }

    public void b(vd.k kVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            vd.f fVar = (vd.f) it.next();
            float c3 = fVar.c();
            Object obj = fVar.a;
            float lerp = AndroidUtilities.lerp(0.85f, 1.0f, c3);
            m mVar = (m) obj;
            mVar.setAlpha(c3);
            mVar.setScaleX(lerp);
            mVar.setScaleY(lerp);
            mVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(!fVar.h ? 9.0f : -9.0f), 0, c3));
        }
    }

    public final void c(CharSequence charSequence) {
        boolean z10;
        CharSequence charSequence2;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        vd.k kVar = this.c;
        if (isEmpty) {
            kVar.a.r(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        ab.m mVar = this.b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            mVar.u(valueOf, indexOf);
            z10 = true;
            charSequence2 = valueOf;
        } else {
            z10 = false;
            charSequence2 = charSequence;
        }
        m mVar2 = new m(this, getContext());
        int i10 = g6.gl;
        c6 c6Var = this.a;
        mVar2.setTextColor(g6.v0(i10, c6Var));
        mVar2.setLinkTextColor(g6.v0(i10, c6Var));
        mVar2.setTextSize(1, 14.0f);
        mVar2.setAlpha(0.0f);
        mVar2.setText(charSequence2);
        if (z10) {
            mVar.c(mVar2);
        }
        addView(mVar2, i7.f6.c(-2.0f, -2));
        kVar.i(mVar2, true);
    }

    public final void d() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            vd.f fVar = (vd.f) it.next();
            m mVar = (m) fVar.a;
            int i10 = g6.gl;
            c6 c6Var = this.a;
            mVar.setTextColor(g6.v0(i10, c6Var));
            ((m) fVar.a).setLinkTextColor(g6.v0(i10, c6Var));
        }
    }

    public float getTotalVisibility() {
        return this.c.a.d.c.a;
    }

    @Override // vd.j
    public final /* synthetic */ void a() {
    }
}
