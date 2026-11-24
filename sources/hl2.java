// default package

import android.media.MediaFormat;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hl2 {
    public static final hl2 b = new hl2(new HashMap());
    public final Map a;

    public hl2(HashMap hashMap) {
        this.a = DesugarCollections.unmodifiableMap(hashMap);
    }

    public static n89 a(MediaFormat mediaFormat, Set set) {
        n89 n89Var = new n89();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (mediaFormat.containsKey(str)) {
                int valueTypeForKey = mediaFormat.getValueTypeForKey(str);
                HashMap hashMap = n89Var.a;
                if (valueTypeForKey == 1) {
                    hashMap.put(str, Integer.valueOf(mediaFormat.getInteger(str)));
                } else if (valueTypeForKey == 2) {
                    hashMap.put(str, Long.valueOf(mediaFormat.getLong(str)));
                } else if (valueTypeForKey == 3) {
                    hashMap.put(str, Float.valueOf(mediaFormat.getFloat(str)));
                } else if (valueTypeForKey == 4) {
                    hashMap.put(str, mediaFormat.getString(str));
                } else if (valueTypeForKey == 5) {
                    ByteBuffer byteBuffer = mediaFormat.getByteBuffer(str);
                    if (byteBuffer == null) {
                        hashMap.put(str, null);
                    } else {
                        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                        allocate.put(byteBuffer.duplicate());
                        allocate.flip();
                        hashMap.put(str, allocate);
                    }
                }
            }
        }
        return n89Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hl2) {
            return this.a.equals(((hl2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
