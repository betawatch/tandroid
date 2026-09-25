package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public abstract class m extends FrameLayout implements le.l {
    public final d6 a;
    public final com.google.firebase.messaging.m b;
    public final le.m c;

    public m(Context context, d6 d6Var, com.google.firebase.messaging.m mVar) {
        super(context);
        this.c = new le.m(this, rr.h, 350L);
        this.a = d6Var;
        this.b = mVar;
    }

    public final void b(CharSequence charSequence) {
        boolean z10;
        CharSequence charSequence2;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        le.m mVar = this.c;
        if (isEmpty) {
            mVar.a.r(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        com.google.firebase.messaging.m mVar2 = this.b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            mVar2.x(valueOf, indexOf);
            z10 = true;
            charSequence2 = valueOf;
        } else {
            z10 = false;
            charSequence2 = charSequence;
        }
        l lVar = new l(this, getContext());
        int i10 = h6.gl;
        d6 d6Var = this.a;
        lVar.setTextColor(h6.v0(i10, d6Var));
        lVar.setLinkTextColor(h6.v0(i10, d6Var));
        lVar.setTextSize(1, 14.0f);
        lVar.setAlpha(0.0f);
        lVar.setText(charSequence2);
        if (z10) {
            mVar2.c(lVar);
        }
        addView(lVar, w7.y5.c(-2.0f, -2));
        mVar.i(lVar, true);
    }

    public void c(le.m mVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            le.h hVar = (le.h) it.next();
            float c10 = hVar.c();
            Object obj = hVar.a;
            float lerp = AndroidUtilities.lerp(0.85f, 1.0f, c10);
            l lVar = (l) obj;
            lVar.setAlpha(c10);
            lVar.setScaleX(lerp);
            lVar.setScaleY(lerp);
            lVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(!hVar.h ? 9.0f : -9.0f), 0, c10));
        }
    }

    public final void d() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            le.h hVar = (le.h) it.next();
            l lVar = (l) hVar.a;
            int i10 = h6.gl;
            d6 d6Var = this.a;
            lVar.setTextColor(h6.v0(i10, d6Var));
            ((l) hVar.a).setLinkTextColor(h6.v0(i10, d6Var));
        }
    }

    public float getTotalVisibility() {
        return this.c.a.d.c.a;
    }

    @Override // le.l
    public final /* synthetic */ void a() {
    }
}
