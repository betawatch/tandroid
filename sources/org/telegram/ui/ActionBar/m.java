package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class m extends FrameLayout implements xd.i {
    public final f6 a;
    public final cb.m b;
    public final xd.j c;

    public m(Context context, f6 f6Var, cb.m mVar) {
        super(context);
        this.c = new xd.j(this, mr.h, 350L);
        this.a = f6Var;
        this.b = mVar;
    }

    public final void b(CharSequence charSequence) {
        boolean z4;
        CharSequence charSequence2;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        xd.j jVar = this.c;
        if (isEmpty) {
            jVar.a.r(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        cb.m mVar = this.b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            mVar.x(valueOf, indexOf);
            z4 = true;
            charSequence2 = valueOf;
        } else {
            z4 = false;
            charSequence2 = charSequence;
        }
        l lVar = new l(this, getContext());
        int i10 = j6.gl;
        f6 f6Var = this.a;
        lVar.setTextColor(j6.v0(i10, f6Var));
        lVar.setLinkTextColor(j6.v0(i10, f6Var));
        lVar.setTextSize(1, 14.0f);
        lVar.setAlpha(0.0f);
        lVar.setText(charSequence2);
        if (z4) {
            mVar.c(lVar);
        }
        addView(lVar, k7.b6.c(-2.0f, -2));
        jVar.i(lVar, true);
    }

    public final void c() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            xd.e eVar = (xd.e) it.next();
            l lVar = (l) eVar.a;
            int i10 = j6.gl;
            f6 f6Var = this.a;
            lVar.setTextColor(j6.v0(i10, f6Var));
            ((l) eVar.a).setLinkTextColor(j6.v0(i10, f6Var));
        }
    }

    public void e(xd.j jVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            xd.e eVar = (xd.e) it.next();
            float c3 = eVar.c();
            Object obj = eVar.a;
            float lerp = AndroidUtilities.lerp(0.85f, 1.0f, c3);
            l lVar = (l) obj;
            lVar.setAlpha(c3);
            lVar.setScaleX(lerp);
            lVar.setScaleY(lerp);
            lVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(!eVar.h ? 9.0f : -9.0f), 0, c3));
        }
    }

    public float getTotalVisibility() {
        return this.c.a.d.c.a;
    }

    @Override // xd.i
    public final /* synthetic */ void a() {
    }
}
