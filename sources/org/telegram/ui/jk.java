package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class jk extends org.telegram.ui.Components.a81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ bo b;

    public jk(bo boVar, Context context) {
        this.b = boVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.a81
    public final void b(View view, int i10, int i11) {
        if (view instanceof eo) {
            ((eo) view).a.Jc(this.b.u3);
        }
        WeakHashMap weakHashMap = r0.i0.a;
        r0.y.c(view);
    }

    @Override // org.telegram.ui.Components.a81
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
        ik ikVar = new ik(context, boVar.getParentLayout(), bundle, 0);
        ikVar.h = false;
        co coVar = ikVar.a;
        coVar.L.a = boVar.L;
        coVar.ca = boVar.ea;
        coVar.da = boVar;
        coVar.V8 = new g(this, 13);
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
