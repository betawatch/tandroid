package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class m extends FrameLayout implements td.i {
    public final b6 a;
    public final com.google.firebase.messaging.l b;
    public final td.j c;

    public m(Context context, b6 b6Var, com.google.firebase.messaging.l lVar) {
        super(context);
        this.c = new td.j(this, gr.h, 350L);
        this.a = b6Var;
        this.b = lVar;
    }

    public final void a(CharSequence charSequence) {
        boolean z10;
        CharSequence charSequence2;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        td.j jVar = this.c;
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
        int i9 = f6.gl;
        b6 b6Var = this.a;
        lVar2.setTextColor(f6.v0(i9, b6Var));
        lVar2.setLinkTextColor(f6.v0(i9, b6Var));
        lVar2.setTextSize(1, 14.0f);
        lVar2.setAlpha(0.0f);
        lVar2.setText(charSequence2);
        if (z10) {
            lVar.c(lVar2);
        }
        addView(lVar2, g7.e6.c(-2.0f, -2));
        jVar.i(lVar2, true);
    }

    public void c(td.j jVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            td.e eVar = (td.e) it.next();
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
            td.e eVar = (td.e) it.next();
            l lVar = (l) eVar.a;
            int i9 = f6.gl;
            b6 b6Var = this.a;
            lVar.setTextColor(f6.v0(i9, b6Var));
            ((l) eVar.a).setLinkTextColor(f6.v0(i9, b6Var));
        }
    }

    public float getTotalVisibility() {
        return this.c.a.d.c.a;
    }

    @Override // td.i
    public final /* synthetic */ void b() {
    }
}
