package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class dk extends org.telegram.ui.Components.m91 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ un b;

    public dk(un unVar, Context context) {
        this.b = unVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.m91
    public final void b(View view, int i10, int i11) {
        if (view instanceof wn) {
            ((wn) view).a.Wc(this.b.G3);
        }
        WeakHashMap weakHashMap = r0.i0.a;
        r0.y.c(view);
    }

    @Override // org.telegram.ui.Components.m91
    public final View d(int i10) {
        Context context = this.a;
        un unVar = this.b;
        if (i10 == 0) {
            return new hn(unVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", unVar.G3);
        ck ckVar = new ck(context, unVar.getParentLayout(), bundle, 0);
        ckVar.h = false;
        vn vnVar = ckVar.a;
        vnVar.L.a = unVar.L;
        vnVar.oa = unVar.qa;
        vnVar.pa = unVar;
        vnVar.h9 = new f(this, 13);
        return ckVar;
    }

    @Override // org.telegram.ui.Components.m91
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.m91
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.SearchThisChat) : LocaleController.getString(R.string.SearchPublicPosts) : LocaleController.getString(R.string.SearchMyMessages);
    }

    @Override // org.telegram.ui.Components.m91
    public final int h(int i10) {
        return i10;
    }
}
