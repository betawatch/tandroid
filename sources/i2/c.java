package i2;

import android.media.MediaFormat;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class c {
    public static final c b = new c(new HashMap());
    public final Map a;

    public c(HashMap hashMap) {
        this.a = DesugarCollections.unmodifiableMap(hashMap);
    }

    public static ag.b a(MediaFormat mediaFormat, Set set) {
        ag.b bVar = new ag.b(22);
        HashMap hashMap = (HashMap) bVar.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (mediaFormat.containsKey(str)) {
                int valueTypeForKey = mediaFormat.getValueTypeForKey(str);
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
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.a.equals(((c) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
