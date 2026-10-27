package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fk extends org.telegram.ui.Components.n91 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ wn b;

    public fk(wn wnVar, Context context) {
        this.b = wnVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.n91
    public final void b(View view, int i10, int i11) {
        if (view instanceof yn) {
            ((yn) view).a.ad(this.b.G3);
        }
        WeakHashMap weakHashMap = r0.i0.a;
        r0.y.c(view);
    }

    @Override // org.telegram.ui.Components.n91
    public final View d(int i10) {
        Context context = this.a;
        wn wnVar = this.b;
        if (i10 == 0) {
            return new jn(wnVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", wnVar.G3);
        ek ekVar = new ek(context, wnVar.getParentLayout(), bundle, 0);
        ekVar.h = false;
        xn xnVar = ekVar.a;
        xnVar.L.a = wnVar.L;
        xnVar.sa = wnVar.ua;
        xnVar.ta = wnVar;
        xnVar.l9 = new f(this, 13);
        return ekVar;
    }

    @Override // org.telegram.ui.Components.n91
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.n91
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.SearchThisChat) : LocaleController.getString(R.string.SearchPublicPosts) : LocaleController.getString(R.string.SearchMyMessages);
    }

    @Override // org.telegram.ui.Components.n91
    public final int h(int i10) {
        return i10;
    }
}
