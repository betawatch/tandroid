package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class jk extends org.telegram.ui.Components.q81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ zn b;

    public jk(zn znVar, Context context) {
        this.b = znVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.q81
    public final void b(View view, int i10, int i11) {
        if (view instanceof bo) {
            ((bo) view).a.Jc(this.b.u3);
        }
        WeakHashMap weakHashMap = r0.i0.a;
        r0.y.c(view);
    }

    @Override // org.telegram.ui.Components.q81
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
        ik ikVar = new ik(context, znVar.getParentLayout(), bundle, 0);
        ikVar.h = false;
        ao aoVar = ikVar.a;
        aoVar.L.a = znVar.L;
        aoVar.ca = znVar.ea;
        aoVar.da = znVar;
        aoVar.V8 = new g(this, 13);
        return ikVar;
    }

    @Override // org.telegram.ui.Components.q81
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.q81
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.SearchThisChat) : LocaleController.getString(R.string.SearchPublicPosts) : LocaleController.getString(R.string.SearchMyMessages);
    }

    @Override // org.telegram.ui.Components.q81
    public final int h(int i10) {
        return i10;
    }
}
