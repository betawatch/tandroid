package bi;

import java.io.Serializable;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class b7 implements di.m4, v10 {
    public final /* synthetic */ h8 a;

    @Override // di.m4
    public void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        h8.c0(this.a, tL_starGiftUnique, j3, z10);
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        h8.e0(this.a, (l41) obj);
    }
}
