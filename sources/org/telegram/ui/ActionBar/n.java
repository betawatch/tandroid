package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class n extends FrameLayout implements le.k {
    public final f6 a;
    public final com.google.firebase.messaging.m b;
    public final le.l c;

    public n(Context context, f6 f6Var, com.google.firebase.messaging.m mVar) {
        super(context);
        this.c = new le.l(this, wr.h, 350L);
        this.a = f6Var;
        this.b = mVar;
    }

    public final void b(CharSequence charSequence) {
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
        m mVar2 = new m(this, getContext());
        int i10 = j6.gl;
        f6 f6Var = this.a;
        mVar2.setTextColor(j6.v0(i10, f6Var));
        mVar2.setLinkTextColor(j6.v0(i10, f6Var));
        mVar2.setTextSize(1, 14.0f);
        mVar2.setAlpha(0.0f);
        mVar2.setText(charSequence2);
        if (z10) {
            mVar.c(mVar2);
        }
        addView(mVar2, w7.a6.c(-2.0f, -2));
        lVar.i(mVar2, true);
    }

    public final void c() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            m mVar = (m) gVar.a;
            int i10 = j6.gl;
            f6 f6Var = this.a;
            mVar.setTextColor(j6.v0(i10, f6Var));
            ((m) gVar.a).setLinkTextColor(j6.v0(i10, f6Var));
        }
    }

    public void e(le.l lVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.a;
            float lerp = AndroidUtilities.lerp(0.85f, 1.0f, c10);
            m mVar = (m) obj;
            mVar.setAlpha(c10);
            mVar.setScaleX(lerp);
            mVar.setScaleY(lerp);
            mVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(!gVar.h ? 9.0f : -9.0f), 0, c10));
        }
    }

    public float getTotalVisibility() {
        return this.c.a.d.c.a;
    }

    @Override // le.k
    public final /* synthetic */ void a() {
    }
}
