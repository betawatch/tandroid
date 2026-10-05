package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class gk extends org.telegram.ui.Components.y81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ yn b;

    public gk(yn ynVar, Context context) {
        this.b = ynVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.y81
    public final void b(View view, int i10, int i11) {
        if (view instanceof ao) {
            ((ao) view).a.Ic(this.b.s3);
        }
        WeakHashMap weakHashMap = r0.i0.a;
        r0.y.c(view);
    }

    @Override // org.telegram.ui.Components.y81
    public final View d(int i10) {
        Context context = this.a;
        yn ynVar = this.b;
        if (i10 == 0) {
            return new mn(ynVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", ynVar.s3);
        fk fkVar = new fk(context, ynVar.getParentLayout(), bundle, 0);
        fkVar.h = false;
        zn znVar = fkVar.a;
        znVar.J.a = ynVar.J;
        znVar.aa = ynVar.ca;
        znVar.ba = ynVar;
        znVar.T8 = new g(this, 13);
        return fkVar;
    }

    @Override // org.telegram.ui.Components.y81
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.y81
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.SearchThisChat) : LocaleController.getString(R.string.SearchPublicPosts) : LocaleController.getString(R.string.SearchMyMessages);
    }

    @Override // org.telegram.ui.Components.y81
    public final int h(int i10) {
        return i10;
    }
}
