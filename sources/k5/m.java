package k5;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class m {
    public final long a;

    public m(long j3) {
        this.a = j3;
    }

    public static m a(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new m(Long.parseLong(jsonReader.nextString())) : new m(jsonReader.nextLong());
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
        return (obj instanceof m) && this.a == ((m) obj).a;
    }

    public final int hashCode() {
        long j3 = this.a;
        return ((int) (j3 ^ (j3 >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return a4.a.r(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.a, "}");
    }
}
