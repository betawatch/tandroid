package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class lk extends org.telegram.ui.Components.n81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ eo b;

    public lk(eo eoVar, Context context) {
        this.b = eoVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.n81
    public final void b(View view, int i10, int i11) {
        if (view instanceof go) {
            ((go) view).a.Jc(this.b.u3);
        }
        WeakHashMap weakHashMap = r0.i0.a;
        r0.y.c(view);
    }

    @Override // org.telegram.ui.Components.n81
    public final View d(int i10) {
        Context context = this.a;
        eo eoVar = this.b;
        if (i10 == 0) {
            return new rn(eoVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", eoVar.u3);
        kk kkVar = new kk(context, eoVar.getParentLayout(), bundle, 0);
        kkVar.h = false;
        fo foVar = kkVar.a;
        foVar.L.a = eoVar.L;
        foVar.ca = eoVar.ea;
        foVar.da = eoVar;
        foVar.V8 = new g(this, 13);
        return kkVar;
    }

    @Override // org.telegram.ui.Components.n81
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.n81
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.SearchThisChat) : LocaleController.getString(R.string.SearchPublicPosts) : LocaleController.getString(R.string.SearchMyMessages);
    }

    @Override // org.telegram.ui.Components.n81
    public final int h(int i10) {
        return i10;
    }
}
