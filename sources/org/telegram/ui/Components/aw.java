package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class aw extends xy {
    public final /* synthetic */ yy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(yy yyVar) {
        super(yyVar, 2);
        this.d = yyVar;
    }

    @Override // org.telegram.ui.Components.xy, f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        yy yyVar;
        jg.e eVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT < 31 || (eVar = (yyVar = this.d).f2) == null) {
            return;
        }
        eVar.f(i10, i11);
        yyVar.D();
    }
}
