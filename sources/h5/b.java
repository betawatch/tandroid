package h5;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public interface b {
    void getBox(WritableByteChannel writableByteChannel);

    f getParent();

    long getSize();

    String getType();

    void setParent(f fVar);
}
