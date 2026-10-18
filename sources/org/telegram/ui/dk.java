package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class dk extends org.telegram.ui.Components.u81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ sn b;

    public dk(sn snVar, Context context) {
        this.b = snVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.u81
    public final void b(View view, int i10, int i11) {
        if (view instanceof un) {
            ((un) view).a.Nc(this.b.u3);
        }
        WeakHashMap weakHashMap = r0.i0.a;
        r0.y.c(view);
    }

    @Override // org.telegram.ui.Components.u81
    public final View d(int i10) {
        Context context = this.a;
        sn snVar = this.b;
        if (i10 == 0) {
            return new gn(snVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", snVar.u3);
        ck ckVar = new ck(context, snVar.getParentLayout(), bundle, 0);
        ckVar.h = false;
        tn tnVar = ckVar.a;
        tnVar.L.a = snVar.L;
        tnVar.ca = snVar.ea;
        tnVar.da = snVar;
        tnVar.V8 = new g(this, 13);
        return ckVar;
    }

    @Override // org.telegram.ui.Components.u81
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.u81
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.SearchThisChat) : LocaleController.getString(R.string.SearchPublicPosts) : LocaleController.getString(R.string.SearchMyMessages);
    }

    @Override // org.telegram.ui.Components.u81
    public final int h(int i10) {
        return i10;
    }
}
