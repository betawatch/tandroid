package ai;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.fc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b2 extends d7 {
    public final /* synthetic */ b3 s2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(b3 b3Var, Context context, int i3, TL_stars.StarGift starGift, long j10, l1 l1Var, boolean z10, boolean z11) {
        super(context, i3, starGift, null, j10, l1Var, z10, z11);
        this.s2 = b3Var;
    }

    @Override // ai.d7
    public final fc e1() {
        b3 b3Var = this.s2;
        return new fc(b3Var.c, b3Var.J0);
    }
}
