package fi;

import android.content.Context;
import di.fc;
import org.telegram.messenger.z10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class s extends fc {
    public final /* synthetic */ z10[] n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, b bVar, z10[] z10VarArr) {
        super(context, bVar);
        this.n0 = z10VarArr;
    }

    @Override // di.fc
    public final void e(int i7) {
        this.n0[0].a(Integer.valueOf(i7));
    }
}
