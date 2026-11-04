package ai;

import android.app.ApplicationExitInfo;
import android.system.OsConstants;
import j$.util.Objects;
import j$.util.function.Predicate$-CC;
import java.io.File;
import java.util.function.Predicate;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t1 implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ t1(int i3) {
        this.a = i3;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        int i3 = this.a;
        return Predicate$-CC.$default$and(this, predicate);
    }

    public /* synthetic */ Predicate negate() {
        switch (this.a) {
        }
        return Predicate$-CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        int i3 = this.a;
        return Predicate$-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return !((TL_stars.StarGift) obj).auction;
            case 1:
                return ((File) obj).exists();
            case 2:
                return ((String) obj) != null;
            case 3:
                return !zi.d3(((zi) obj).k);
            case 4:
                return Objects.nonNull((TLObject) obj);
            case 5:
                return ((Integer) obj).intValue() != 0;
            case 6:
                return ((ApplicationExitInfo) obj).getReason() == 6;
            default:
                ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) obj;
                return (applicationExitInfo.getReason() == 3 && applicationExitInfo.getDescription() != null && applicationExitInfo.getDescription().contains("OOM")) || (applicationExitInfo.getReason() == 2 && applicationExitInfo.getStatus() == OsConstants.SIGKILL);
        }
    }
}
