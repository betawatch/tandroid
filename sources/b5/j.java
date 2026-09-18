package b5;

import j$.util.Objects;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class j implements WebMessagePayloadBoundaryInterface {
    public final byte[] a;

    public j(byte[] bArr) {
        this.a = bArr;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final byte[] getAsArrayBuffer() {
        byte[] bArr = this.a;
        Objects.requireNonNull(bArr);
        return bArr;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final String getAsString() {
        throw new IllegalStateException("Expected 0, but type is 1");
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[0];
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final int getType() {
        return 1;
    }
}
