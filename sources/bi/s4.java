package bi;

import java.io.Serializable;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b41;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class s4 implements di.j4, x10 {
    public final /* synthetic */ a6 a;

    public /* synthetic */ s4(a6 a6Var) {
        this.a = a6Var;
    }

    @Override // di.j4
    public void c(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        a6.b0(this.a, tL_starGiftUnique, j3, z10);
    }

    @Override // org.telegram.messenger.x10
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        a6.e0(this.a, (b41) obj);
    }
}
