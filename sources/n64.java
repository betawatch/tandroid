// default package

import java.io.InputStream;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class n64 extends j64 {
    public n64(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.a.mark(ConnectionsManager.DEFAULT_DATACENTER_ID);
        } else {
            u36.j("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    public final void b(long j) {
        int i = this.c;
        if (i > j) {
            this.c = 0;
            this.a.reset();
        } else {
            j -= i;
        }
        a((int) j);
    }

    public n64(byte[] bArr) {
        super(bArr);
        this.a.mark(ConnectionsManager.DEFAULT_DATACENTER_ID);
    }
}
