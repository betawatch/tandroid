package fi;

import android.content.Context;
import di.gc;
import org.telegram.messenger.z10;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class s extends gc {
    public final /* synthetic */ z10[] n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, b bVar, z10[] z10VarArr) {
        super(context, bVar);
        this.n0 = z10VarArr;
    }

    @Override // di.gc
    public final void e(int i7) {
        this.n0[0].a(Integer.valueOf(i7));
    }
}
