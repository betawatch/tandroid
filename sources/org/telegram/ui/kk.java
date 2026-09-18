package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class kk extends org.telegram.ui.Components.b81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ bo b;

    public kk(bo boVar, Context context) {
        this.b = boVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.b81
    public final void b(View view, int i10, int i11) {
        if (view instanceof eo) {
            ((eo) view).a.Jc(this.b.u3);
        }
        WeakHashMap weakHashMap = r0.i0.a;
        r0.y.c(view);
    }

    @Override // org.telegram.ui.Components.b81
    public final View d(int i10) {
        Context context = this.a;
        bo boVar = this.b;
        if (i10 == 0) {
            return new pn(boVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", boVar.u3);
        jk jkVar = new jk(context, boVar.getParentLayout(), bundle, 0);
        jkVar.h = false;
        co coVar = jkVar.a;
        coVar.L.a = boVar.L;
        coVar.ca = boVar.ea;
        coVar.da = boVar;
        coVar.V8 = new g(this, 13);
        return jkVar;
    }

    @Override // org.telegram.ui.Components.b81
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.b81
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.SearchThisChat) : LocaleController.getString(R.string.SearchPublicPosts) : LocaleController.getString(R.string.SearchMyMessages);
    }

    @Override // org.telegram.ui.Components.b81
    public final int h(int i10) {
        return i10;
    }
}
