package f5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class h extends com.googlecode.mp4parser.b {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(String str, int i10) {
        super(str);
        this.f = i10;
    }

    @Override // com.googlecode.mp4parser.b, f5.b
    public void getBox(WritableByteChannel writableByteChannel) {
        switch (this.f) {
            case 1:
                writableByteChannel.write(d());
                ByteBuffer allocate = ByteBuffer.allocate(8);
                e5.b.r(0, allocate);
                e5.b.q(0, allocate);
                allocate.putInt(this.b.size());
                writableByteChannel.write((ByteBuffer) allocate.rewind());
                c(writableByteChannel);
                break;
            default:
                super.getBox(writableByteChannel);
                break;
        }
    }

    @Override // com.googlecode.mp4parser.b, f5.b
    public long getSize() {
        switch (this.f) {
            case 1:
                long b10 = b();
                return 8 + b10 + (b10 + 16 >= 4294967296L ? 16 : 8);
            default:
                return super.getSize();
        }
    }
}
