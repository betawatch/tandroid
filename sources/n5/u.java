package n5;

import a8.p0;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class u {
    public final long a;

    public u(long j3) {
        this.a = j3;
    }

    public static u a(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new u(Long.parseLong(jsonReader.nextString())) : new u(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof u) && this.a == ((u) obj).a;
    }

    public final int hashCode() {
        long j3 = this.a;
        return ((int) (j3 ^ (j3 >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return p0.r(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.a, "}");
    }
}
