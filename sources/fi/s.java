package fi;

import android.content.Context;
import di.jc;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class s extends jc {
    public final /* synthetic */ x10[] n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, b bVar, x10[] x10VarArr) {
        super(context, bVar);
        this.n0 = x10VarArr;
    }

    @Override // di.jc
    public final void e(int i7) {
        this.n0[0].a(Integer.valueOf(i7));
    }
}
