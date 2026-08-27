package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class m extends FrameLayout implements ud.i {
    public final c6 a;
    public final com.google.firebase.messaging.l b;
    public final ud.j c;

    public m(Context context, c6 c6Var, com.google.firebase.messaging.l lVar) {
        super(context);
        this.c = new ud.j(this, er.h, 350L);
        this.a = c6Var;
        this.b = lVar;
    }

    public final void a(CharSequence charSequence) {
        boolean z10;
        CharSequence charSequence2;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        ud.j jVar = this.c;
        if (isEmpty) {
            jVar.a.r(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        com.google.firebase.messaging.l lVar = this.b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            lVar.u(valueOf, indexOf);
            z10 = true;
            charSequence2 = valueOf;
        } else {
            z10 = false;
            charSequence2 = charSequence;
        }
        l lVar2 = new l(this, getContext());
        int i10 = g6.gl;
        c6 c6Var = this.a;
        lVar2.setTextColor(g6.v0(i10, c6Var));
        lVar2.setLinkTextColor(g6.v0(i10, c6Var));
        lVar2.setTextSize(1, 14.0f);
        lVar2.setAlpha(0.0f);
        lVar2.setText(charSequence2);
        if (z10) {
            lVar.c(lVar2);
        }
        addView(lVar2, h7.z5.c(-2.0f, -2));
        jVar.i(lVar2, true);
    }

    public void c(ud.j jVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ud.e eVar = (ud.e) it.next();
            float c10 = eVar.c();
            Object obj = eVar.a;
            float lerp = AndroidUtilities.lerp(0.85f, 1.0f, c10);
            l lVar = (l) obj;
            lVar.setAlpha(c10);
            lVar.setScaleX(lerp);
            lVar.setScaleY(lerp);
            lVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(!eVar.h ? 9.0f : -9.0f), 0, c10));
        }
    }

    public final void d() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ud.e eVar = (ud.e) it.next();
            l lVar = (l) eVar.a;
            int i10 = g6.gl;
            c6 c6Var = this.a;
            lVar.setTextColor(g6.v0(i10, c6Var));
            ((l) eVar.a).setLinkTextColor(g6.v0(i10, c6Var));
        }
    }

    public float getTotalVisibility() {
        return this.c.a.d.c.a;
    }

    @Override // ud.i
    public final /* synthetic */ void b() {
    }
}
