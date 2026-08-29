package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ak extends org.telegram.ui.Components.q71 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ tn b;

    public ak(tn tnVar, Context context) {
        this.b = tnVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.q71
    public final void b(View view, int i10, int i11) {
        if (view instanceof vn) {
            ((vn) view).a.Jc(this.b.q3);
        }
        WeakHashMap weakHashMap = r0.j0.a;
        r0.z.c(view);
    }

    @Override // org.telegram.ui.Components.q71
    public final View d(int i10) {
        Context context = this.a;
        tn tnVar = this.b;
        if (i10 == 0) {
            return new hn(tnVar, context);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", i10);
        bundle.putString("searchHashtag", tnVar.q3);
        zj zjVar = new zj(context, tnVar.getParentLayout(), bundle, 0);
        zjVar.h = false;
        un unVar = zjVar.a;
        unVar.H.a = tnVar.H;
        unVar.Y9 = tnVar.aa;
        unVar.Z9 = tnVar;
        unVar.R8 = new h(this, 13);
        return zjVar;
    }

    @Override // org.telegram.ui.Components.q71
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.q71
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.SearchThisChat) : LocaleController.getString(R.string.SearchPublicPosts) : LocaleController.getString(R.string.SearchMyMessages);
    }

    @Override // org.telegram.ui.Components.q71
    public final int h(int i10) {
        return i10;
    }
}
