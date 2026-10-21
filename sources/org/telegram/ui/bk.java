package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class bk extends org.telegram.ui.Components.w81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ qn b;

    public bk(qn qnVar, Context context) {
        this.b = qnVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.w81
    public final void b(View view, int i10, int i11) {
        if (view instanceof sn) {
            ((sn) view).a.Oc(this.b.u3);
        }
        WeakHashMap weakHashMap = r0.i0.a;
        r0.y.c(view);
    }

    @Override // org.telegram.ui.Components.w81
    public final View d(int i10) {
        Context context = this.a;
        qn qnVar = this.b;
        if (i10 == 0) {
            return new en(qnVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", qnVar.u3);
        ak akVar = new ak(context, qnVar.getParentLayout(), bundle, 0);
        akVar.h = false;
        rn rnVar = akVar.a;
        rnVar.L.a = qnVar.L;
        rnVar.ca = qnVar.ea;
        rnVar.da = qnVar;
        rnVar.V8 = new g(this, 13);
        return akVar;
    }

    @Override // org.telegram.ui.Components.w81
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.w81
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.SearchThisChat) : LocaleController.getString(R.string.SearchPublicPosts) : LocaleController.getString(R.string.SearchMyMessages);
    }

    @Override // org.telegram.ui.Components.w81
    public final int h(int i10) {
        return i10;
    }
}
