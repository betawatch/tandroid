// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class cya extends BasePendingResult {
    public final /* synthetic */ byte o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cya(x1d x1dVar, byte b) {
        super(x1dVar);
        this.o = b;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ ua9 d(Status status) {
        switch (this.o) {
            case 0:
                return status;
            default:
                return new vcd(status, (byte) 0);
        }
    }
}
