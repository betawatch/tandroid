// default package

import java.io.IOException;

/* loaded from: classes.dex */
public final class mpd extends IOException {
    public static mpd a() {
        return new mpd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static mpd b() {
        return new mpd("Failed to parse the message.");
    }
}
