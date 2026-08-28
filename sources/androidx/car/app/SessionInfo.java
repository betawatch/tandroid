package androidx.car.app;

import androidx.car.app.model.x0;
import androidx.car.app.navigation.model.NavigationTemplate;
import j$.util.Objects;
import java.util.Set;
import o8.c0;
import o8.r0;
import o8.w0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class SessionInfo {
    private static final c0 CLUSTER_SUPPORTED_TEMPLATES_API_6;
    private static final c0 CLUSTER_SUPPORTED_TEMPLATES_LESS_THAN_API_6;
    public static final SessionInfo DEFAULT_SESSION_INFO;
    public static final int DISPLAY_TYPE_CLUSTER = 1;
    public static final int DISPLAY_TYPE_MAIN = 0;
    private static final char DIVIDER = '/';
    private final int mDisplayType;
    private final String mSessionId;

    static {
        int i9 = c0.c;
        CLUSTER_SUPPORTED_TEMPLATES_API_6 = new w0(NavigationTemplate.class);
        CLUSTER_SUPPORTED_TEMPLATES_LESS_THAN_API_6 = r0.s;
        DEFAULT_SESSION_INFO = new SessionInfo(0, "main");
    }

    public SessionInfo(int i9, String str) {
        this.mDisplayType = i9;
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

    public Set<Class<? extends x0>> getSupportedTemplates(int i9) {
        if (this.mDisplayType == 1) {
            return i9 >= 6 ? CLUSTER_SUPPORTED_TEMPLATES_API_6 : CLUSTER_SUPPORTED_TEMPLATES_LESS_THAN_API_6;
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
