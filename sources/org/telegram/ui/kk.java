package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class kk extends org.telegram.ui.Components.f91 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ zn b;

    public kk(zn znVar, Context context) {
        this.b = znVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.f91
    public final void b(View view, int i10, int i11) {
        if (view instanceof bo) {
            ((bo) view).a.Nc(this.b.u3);
        }
        WeakHashMap weakHashMap = r0.i0.a;
        r0.y.c(view);
    }

    @Override // org.telegram.ui.Components.f91
    public final View d(int i10) {
        Context context = this.a;
        zn znVar = this.b;
        if (i10 == 0) {
            return new nn(znVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", znVar.u3);
        jk jkVar = new jk(context, znVar.getParentLayout(), bundle, 0);
        jkVar.h = false;
        ao aoVar = jkVar.a;
        aoVar.L.a = znVar.L;
        aoVar.ca = znVar.ea;
        aoVar.da = znVar;
        aoVar.V8 = new g(this, 13);
        return jkVar;
    }

    @Override // org.telegram.ui.Components.f91
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.f91
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.SearchThisChat) : LocaleController.getString(R.string.SearchPublicPosts) : LocaleController.getString(R.string.SearchMyMessages);
    }

    @Override // org.telegram.ui.Components.f91
    public final int h(int i10) {
        return i10;
    }
}
