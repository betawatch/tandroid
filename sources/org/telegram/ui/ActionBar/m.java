package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class m extends FrameLayout implements le.k {
    public final f6 a;
    public final com.google.firebase.messaging.m b;
    public final le.l c;

    public m(Context context, f6 f6Var, com.google.firebase.messaging.m mVar) {
        super(context);
        this.c = new le.l(this, pr.h, 350L);
        this.a = f6Var;
        this.b = mVar;
    }

    public final void a(CharSequence charSequence) {
        boolean z10;
        CharSequence charSequence2;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        le.l lVar = this.c;
        if (isEmpty) {
            lVar.a.r(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        com.google.firebase.messaging.m mVar = this.b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            mVar.x(valueOf, indexOf);
            z10 = true;
            charSequence2 = valueOf;
        } else {
            z10 = false;
            charSequence2 = charSequence;
        }
        l lVar2 = new l(this, getContext());
        int i10 = j6.gl;
        f6 f6Var = this.a;
        lVar2.setTextColor(j6.v0(i10, f6Var));
        lVar2.setLinkTextColor(j6.v0(i10, f6Var));
        lVar2.setTextSize(1, 14.0f);
        lVar2.setAlpha(0.0f);
        lVar2.setText(charSequence2);
        if (z10) {
            mVar.c(lVar2);
        }
        addView(lVar2, w7.x5.c(-2.0f, -2));
        lVar.i(lVar2, true);
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            l lVar = (l) gVar.a;
            int i10 = j6.gl;
            f6 f6Var = this.a;
            lVar.setTextColor(j6.v0(i10, f6Var));
            ((l) gVar.a).setLinkTextColor(j6.v0(i10, f6Var));
        }
    }

    public void e(le.l lVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
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

    @Override // le.k
    public final /* synthetic */ void c() {
    }
}
