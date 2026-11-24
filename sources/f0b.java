// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class f0b extends BasePendingResult {
    public final /* synthetic */ byte o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0b(z3d z3dVar, byte b) {
        super(z3dVar);
        this.o = b;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ uc9 d(Status status) {
        switch (this.o) {
            case 0:
                return status;
            default:
                return new xed(status, (byte) 0);
        }
    }
}
