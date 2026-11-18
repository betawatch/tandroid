package fi;

import android.content.Context;
import di.jc;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
