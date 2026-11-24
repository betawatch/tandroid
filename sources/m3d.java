// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.Objects;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class m3d implements b38 {
    public final /* synthetic */ BasePendingResult a;
    public final /* synthetic */ aec b;

    public m3d(aec aecVar, BasePendingResult basePendingResult) {
        this.a = basePendingResult;
        Objects.requireNonNull(aecVar);
        this.b = aecVar;
    }

    @Override // b38
    public final void a(Status status) {
        ((Map) this.b.b).remove(this.a);
    }
}
