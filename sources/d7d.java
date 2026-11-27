// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class d7d extends BasePendingResult {
    public final Status o;

    public d7d(Status status) {
        super(null);
        this.o = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final ie9 d(Status status) {
        return this.o;
    }
}
