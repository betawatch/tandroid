// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
