package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class gk extends org.telegram.ui.Components.c81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ xn b;

    public gk(xn xnVar, Context context) {
        this.b = xnVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.c81
    public final void b(View view, int i10, int i11) {
        if (view instanceof zn) {
            ((zn) view).a.Jc(this.b.r3);
        }
        WeakHashMap weakHashMap = r0.j0.a;
        r0.z.c(view);
    }

    @Override // org.telegram.ui.Components.c81
    public final View d(int i10) {
        Context context = this.a;
        xn xnVar = this.b;
        if (i10 == 0) {
            return new ln(xnVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", xnVar.r3);
        fk fkVar = new fk(context, xnVar.getParentLayout(), bundle, 0);
        fkVar.h = false;
        yn ynVar = fkVar.a;
        ynVar.I.a = xnVar.I;
        ynVar.Z9 = xnVar.ba;
        ynVar.aa = xnVar;
        ynVar.S8 = new h(this, 13);
        return fkVar;
    }

    @Override // org.telegram.ui.Components.c81
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.c81
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.SearchThisChat) : LocaleController.getString(R.string.SearchPublicPosts) : LocaleController.getString(R.string.SearchMyMessages);
    }

    @Override // org.telegram.ui.Components.c81
    public final int h(int i10) {
        return i10;
    }
}
