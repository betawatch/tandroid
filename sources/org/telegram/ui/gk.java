package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class gk extends org.telegram.ui.Components.n81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ wn b;

    public gk(wn wnVar, Context context) {
        this.b = wnVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.n81
    public final void b(View view, int i10, int i11) {
        if (view instanceof yn) {
            ((yn) view).a.Jc(this.b.u3);
        }
        WeakHashMap weakHashMap = r0.i0.a;
        r0.y.c(view);
    }

    @Override // org.telegram.ui.Components.n81
    public final View d(int i10) {
        Context context = this.a;
        wn wnVar = this.b;
        if (i10 == 0) {
            return new kn(wnVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", wnVar.u3);
        fk fkVar = new fk(context, wnVar.getParentLayout(), bundle, 0);
        fkVar.h = false;
        xn xnVar = fkVar.a;
        xnVar.L.a = wnVar.L;
        xnVar.ca = wnVar.ea;
        xnVar.da = wnVar;
        xnVar.V8 = new g(this, 13);
        return fkVar;
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
