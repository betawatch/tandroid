package lc;

import com.googlecode.mp4parser.c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import mc.k;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public abstract class a extends c {
    public static final Logger f;
    public static final /* synthetic */ ka.c h;
    public ByteBuffer e;

    static {
        re.a aVar = new re.a(a.class, "AbstractDescriptorBox.java");
        aVar.e(aVar.d("getData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "java.nio.ByteBuffer"));
        aVar.e(aVar.d("getDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor"));
        aVar.e(aVar.d("getDescriptorAsString", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor", "descriptor", "void"));
        h = aVar.e(aVar.d("setData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "java.nio.ByteBuffer", "data", "void"));
        f = Logger.getLogger(a.class.getName());
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        Logger logger = f;
        f(byteBuffer);
        this.e = byteBuffer.slice();
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
        try {
            this.e.rewind();
            k.a(-1, this.e);
        } catch (IOException e) {
            logger.log(Level.WARNING, "Error parsing ObjectDescriptor", (Throwable) e);
        } catch (IndexOutOfBoundsException e7) {
            logger.log(Level.WARNING, "Error parsing ObjectDescriptor", (Throwable) e7);
        }
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        this.e.rewind();
        byteBuffer.put(this.e);
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return this.e.limit() + 4;
    }
}
