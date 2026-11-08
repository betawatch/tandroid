package aa;

import android.app.ApplicationExitInfo;
import android.system.OsConstants;
import j$.util.Objects;
import j$.util.function.Predicate$-CC;
import java.io.File;
import java.util.function.Predicate;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ m(int i7) {
        this.a = i7;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        int i7 = this.a;
        return Predicate$-CC.$default$and(this, predicate);
    }

    public /* synthetic */ Predicate negate() {
        switch (this.a) {
        }
        return Predicate$-CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        int i7 = this.a;
        return Predicate$-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((Integer) obj).intValue() != 0;
            case 1:
                return ((ApplicationExitInfo) obj).getReason() == 6;
            case 2:
                ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) obj;
                return (applicationExitInfo.getReason() == 3 && applicationExitInfo.getDescription() != null && applicationExitInfo.getDescription().contains("OOM")) || (applicationExitInfo.getReason() == 2 && applicationExitInfo.getStatus() == OsConstants.SIGKILL);
            case 3:
                return ((File) obj).exists();
            case 4:
                return ((String) obj) != null;
            case 5:
                return !ij.d3(((ij) obj).k);
            case 6:
                return Objects.nonNull((TLObject) obj);
            default:
                return !((TL_stars.StarGift) obj).auction;
        }
    }
}
