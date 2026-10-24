package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ck extends org.telegram.ui.Components.d91 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ sn b;

    public ck(sn snVar, Context context) {
        this.b = snVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.d91
    public final void b(View view, int i10, int i11) {
        if (view instanceof un) {
            ((un) view).a.Qc(this.b.G3);
        }
        WeakHashMap weakHashMap = r0.i0.a;
        r0.y.c(view);
    }

    @Override // org.telegram.ui.Components.d91
    public final View d(int i10) {
        Context context = this.a;
        sn snVar = this.b;
        if (i10 == 0) {
            return new fn(snVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", snVar.G3);
        bk bkVar = new bk(context, snVar.getParentLayout(), bundle, 0);
        bkVar.h = false;
        tn tnVar = bkVar.a;
        tnVar.L.a = snVar.L;
        tnVar.oa = snVar.qa;
        tnVar.pa = snVar;
        tnVar.h9 = new f(this, 13);
        return bkVar;
    }

    @Override // org.telegram.ui.Components.d91
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.d91
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.SearchThisChat) : LocaleController.getString(R.string.SearchPublicPosts) : LocaleController.getString(R.string.SearchMyMessages);
    }

    @Override // org.telegram.ui.Components.d91
    public final int h(int i10) {
        return i10;
    }
}
