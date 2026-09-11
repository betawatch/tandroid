package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class jk extends org.telegram.ui.Components.a81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ co b;

    public jk(co coVar, Context context) {
        this.b = coVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.a81
    public final void b(View view, int i10, int i11) {
        if (view instanceof fo) {
            ((fo) view).a.Jc(this.b.u3);
        }
        WeakHashMap weakHashMap = r0.i0.a;
        r0.y.c(view);
    }

    @Override // org.telegram.ui.Components.a81
    public final View d(int i10) {
        Context context = this.a;
        co coVar = this.b;
        if (i10 == 0) {
            return new qn(coVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", coVar.u3);
        ik ikVar = new ik(context, coVar.getParentLayout(), bundle, 0);
        ikVar.h = false;
        eo eoVar = ikVar.a;
        eoVar.L.a = coVar.L;
        eoVar.ca = coVar.ea;
        eoVar.da = coVar;
        eoVar.V8 = new g(this, 13);
        return ikVar;
    }

    @Override // org.telegram.ui.Components.a81
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.a81
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.SearchThisChat) : LocaleController.getString(R.string.SearchPublicPosts) : LocaleController.getString(R.string.SearchMyMessages);
    }

    @Override // org.telegram.ui.Components.a81
    public final int h(int i10) {
        return i10;
    }
}
