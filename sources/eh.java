// default package

import android.app.ApplicationExitInfo;
import android.system.OsConstants;
import j$.util.function.Predicate$-CC;
import java.util.function.Predicate;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class eh implements Predicate {
    public final /* synthetic */ byte a;

    public /* synthetic */ eh(byte b) {
        this.a = b;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        byte b = this.a;
        return Predicate$-CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        byte b = this.a;
        return Predicate$-CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        byte b = this.a;
        return Predicate$-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                if (((String) obj) != null) {
                    break;
                }
                break;
            case 3:
                if (((Integer) obj).intValue() != 0) {
                    break;
                }
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                if (((ApplicationExitInfo) obj).getReason() == 6) {
                    break;
                }
                break;
            default:
                ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) obj;
                boolean z = applicationExitInfo.getReason() == 3 && applicationExitInfo.getDescription() != null && applicationExitInfo.getDescription().contains("OOM");
                boolean z2 = applicationExitInfo.getReason() == 2 && applicationExitInfo.getStatus() == OsConstants.SIGKILL;
                if (z || z2) {
                    break;
                }
                break;
        }
        return true;
    }
}
