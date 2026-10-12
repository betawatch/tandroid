package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ok extends org.telegram.ui.Components.c91 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ fo b;

    public ok(fo foVar, Context context) {
        this.b = foVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.c91
    public final void b(View view, int i10, int i11) {
        if (view instanceof ho) {
            ((ho) view).a.Nc(this.b.u3);
        }
        WeakHashMap weakHashMap = r0.j0.a;
        r0.z.c(view);
    }

    @Override // org.telegram.ui.Components.c91
    public final View d(int i10) {
        Context context = this.a;
        fo foVar = this.b;
        if (i10 == 0) {
            return new sn(foVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", foVar.u3);
        nk nkVar = new nk(context, foVar.getParentLayout(), bundle, 0);
        nkVar.h = false;
        go goVar = nkVar.a;
        goVar.L.a = foVar.L;
        goVar.ca = foVar.ea;
        goVar.da = foVar;
        goVar.V8 = new g(this, 13);
        return nkVar;
    }

    @Override // org.telegram.ui.Components.c91
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.c91
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.SearchThisChat) : LocaleController.getString(R.string.SearchPublicPosts) : LocaleController.getString(R.string.SearchMyMessages);
    }

    @Override // org.telegram.ui.Components.c91
    public final int h(int i10) {
        return i10;
    }
}
