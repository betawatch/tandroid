package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class m extends FrameLayout implements oe.k {
    public final u6 a;
    public final c2.b b;
    public final oe.l c;

    public m(Context context, u6 u6Var, c2.b bVar) {
        super(context);
        this.c = new oe.l(this, ds.h, 350L);
        this.a = u6Var;
        this.b = bVar;
    }

    public void b(oe.l lVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            oe.g gVar = (oe.g) it.next();
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

    public final void c(CharSequence charSequence, boolean z10) {
        boolean z11;
        CharSequence charSequence2;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        oe.l lVar = this.c;
        if (isEmpty) {
            lVar.a.q(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        c2.b bVar = this.b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            bVar.A(valueOf, indexOf);
            z11 = true;
            charSequence2 = valueOf;
        } else {
            z11 = false;
            charSequence2 = charSequence;
        }
        l lVar2 = new l(this, getContext());
        int i10 = y6.gl;
        u6 u6Var = this.a;
        f7.V(lVar2, i10, u6Var);
        f7.H(lVar2, i10, u6Var);
        lVar2.setTextSize(1, 14.0f);
        lVar2.setAlpha(0.0f);
        lVar2.setText(charSequence2);
        if (z11) {
            bVar.c(lVar2);
        }
        addView(lVar2, gb1.g(-2.0f, -2));
        lVar.h(lVar2, true);
    }

    public final void d() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            oe.g gVar = (oe.g) it.next();
            l lVar = (l) gVar.a;
            int i10 = y6.gl;
            u6 u6Var = this.a;
            lVar.setTextColor(y6.w0(i10, u6Var));
            ((l) gVar.a).setLinkTextColor(y6.w0(i10, u6Var));
        }
    }

    public float getTotalVisibility() {
        return this.c.a.d.c.a;
    }

    @Override // oe.k
    public final /* synthetic */ void a() {
    }
}
