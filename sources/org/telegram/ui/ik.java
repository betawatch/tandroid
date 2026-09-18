package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ik extends org.telegram.ui.Components.o81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ zn b;

    public ik(zn znVar, Context context) {
        this.b = znVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.o81
    public final void b(View view, int i10, int i11) {
        if (view instanceof bo) {
            ((bo) view).a.Jc(this.b.u3);
        }
        WeakHashMap weakHashMap = r0.i0.a;
        r0.y.c(view);
    }

    @Override // org.telegram.ui.Components.o81
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
        hk hkVar = new hk(context, znVar.getParentLayout(), bundle, 0);
        hkVar.h = false;
        ao aoVar = hkVar.a;
        aoVar.L.a = znVar.L;
        aoVar.ca = znVar.ea;
        aoVar.da = znVar;
        aoVar.V8 = new g(this, 13);
        return hkVar;
    }

    @Override // org.telegram.ui.Components.o81
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.o81
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.SearchThisChat) : LocaleController.getString(R.string.SearchPublicPosts) : LocaleController.getString(R.string.SearchMyMessages);
    }

    @Override // org.telegram.ui.Components.o81
    public final int h(int i10) {
        return i10;
    }
}
