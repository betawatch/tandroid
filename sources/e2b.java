// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class e2b extends BasePendingResult {
    public final /* synthetic */ byte o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2b(o6d o6dVar, byte b) {
        super(o6dVar);
        this.o = b;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ ie9 d(Status status) {
        switch (this.o) {
            case 0:
                return status;
            default:
                return new ohd(status, (byte) 0);
        }
    }
}
