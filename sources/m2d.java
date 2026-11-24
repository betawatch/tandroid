// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
