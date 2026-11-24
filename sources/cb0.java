// default package

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cb0 {
    public final long a;

    public cb0(long j) {
        this.a = j;
    }

    public static cb0 a(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new cb0(Long.parseLong(jsonReader.nextString())) : new cb0(jsonReader.nextLong());
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
        return (obj instanceof cb0) && this.a == ((cb0) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return 1000003 ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return kt6.q(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.a, "}");
    }
}
