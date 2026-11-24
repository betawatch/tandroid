// default package

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class o73 extends a2 {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o73(String str, byte b) {
        super(str);
        this.f = b;
    }

    @Override // a2, pz0
    public final void getBox(WritableByteChannel writableByteChannel) {
        switch (this.f) {
            case 1:
                writableByteChannel.write(d());
                ByteBuffer allocate = ByteBuffer.allocate(8);
                kne.f(0, allocate);
                kne.e(0, allocate);
                allocate.putInt(this.b.size());
                writableByteChannel.write((ByteBuffer) allocate.rewind());
                c(writableByteChannel);
                break;
            default:
                super.getBox(writableByteChannel);
                break;
        }
    }

    @Override // a2, pz0
    public final long getSize() {
        switch (this.f) {
            case 1:
                long b = b();
                return 8 + b + (b + 16 >= 4294967296L ? 16 : 8);
            default:
                return super.getSize();
        }
    }
}
