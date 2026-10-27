package androidx.car.app;

import androidx.car.app.model.x0;
import androidx.car.app.navigation.model.NavigationTemplate;
import f9.e2;
import f9.t0;
import f9.z1;
import j$.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class SessionInfo {
    private static final t0 CLUSTER_SUPPORTED_TEMPLATES_API_6;
    private static final t0 CLUSTER_SUPPORTED_TEMPLATES_LESS_THAN_API_6;
    public static final SessionInfo DEFAULT_SESSION_INFO;
    public static final int DISPLAY_TYPE_CLUSTER = 1;
    public static final int DISPLAY_TYPE_MAIN = 0;
    private static final char DIVIDER = '/';
    private final int mDisplayType;
    private final String mSessionId;

    static {
        int i10 = t0.c;
        CLUSTER_SUPPORTED_TEMPLATES_API_6 = new e2(NavigationTemplate.class);
        CLUSTER_SUPPORTED_TEMPLATES_LESS_THAN_API_6 = z1.s;
        DEFAULT_SESSION_INFO = new SessionInfo(0, "main");
    }

    public SessionInfo(int i10, String str) {
        this.mDisplayType = i10;
        this.mSessionId = str;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SessionInfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        SessionInfo sessionInfo = (SessionInfo) obj;
        return getSessionId().equals(sessionInfo.getSessionId()) && getDisplayType() == sessionInfo.getDisplayType();
    }

    public int getDisplayType() {
        return this.mDisplayType;
    }

    public String getSessionId() {
        return this.mSessionId;
    }

    public Set<Class<? extends x0>> getSupportedTemplates(int i10) {
        if (this.mDisplayType == 1) {
            return i10 >= 6 ? CLUSTER_SUPPORTED_TEMPLATES_API_6 : CLUSTER_SUPPORTED_TEMPLATES_LESS_THAN_API_6;
        }
        return null;
    }

    public int hashCode() {
        return Objects.hash(this.mSessionId, Integer.valueOf(this.mDisplayType));
    }

    public String toString() {
        return String.valueOf(this.mDisplayType) + DIVIDER + this.mSessionId;
    }

    private SessionInfo() {
        this.mSessionId = "main";
        this.mDisplayType = 0;
    }
}
