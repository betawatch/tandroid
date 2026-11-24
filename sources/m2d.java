// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class m2d extends BasePendingResult {
    public final Status o;

    public m2d(Status status) {
        super(null);
        this.o = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final ua9 d(Status status) {
        return this.o;
    }
}
