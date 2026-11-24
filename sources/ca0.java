// default package

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ca0 {
    public final long a;

    public ca0(long j) {
        this.a = j;
    }

    public static ca0 a(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new ca0(Long.parseLong(jsonReader.nextString())) : new ca0(jsonReader.nextLong());
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
        return (obj instanceof ca0) && this.a == ((ca0) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return 1000003 ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return ls6.p(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.a, "}");
    }
}
