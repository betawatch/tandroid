// default package

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ea0 {
    public final long a;

    public ea0(long j) {
        this.a = j;
    }

    public static ea0 a(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new ea0(Long.parseLong(jsonReader.nextString())) : new ea0(jsonReader.nextLong());
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
        return (obj instanceof ea0) && this.a == ((ea0) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return 1000003 ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return qu6.p(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.a, "}");
    }
}
