package androidx.car.app;

import androidx.car.app.navigation.model.NavigationTemplate;
import j$.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class SessionInfo {
    private static final bp5 CLUSTER_SUPPORTED_TEMPLATES_API_6;
    private static final bp5 CLUSTER_SUPPORTED_TEMPLATES_LESS_THAN_API_6;
    public static final SessionInfo DEFAULT_SESSION_INFO;
    public static final int DISPLAY_TYPE_CLUSTER = 1;
    public static final int DISPLAY_TYPE_MAIN = 0;
    private static final char DIVIDER = '/';
    private final int mDisplayType;
    private final String mSessionId;

    static {
        int i = bp5.c;
        CLUSTER_SUPPORTED_TEMPLATES_API_6 = new oma(NavigationTemplate.class);
        CLUSTER_SUPPORTED_TEMPLATES_LESS_THAN_API_6 = q99.s;
        DEFAULT_SESSION_INFO = new SessionInfo(0, "main");
    }

    private SessionInfo() {
        this.mSessionId = "main";
        this.mDisplayType = 0;
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

    public Set<Class<? extends kkb>> getSupportedTemplates(int i) {
        if (this.mDisplayType == 1) {
            return i >= 6 ? CLUSTER_SUPPORTED_TEMPLATES_API_6 : CLUSTER_SUPPORTED_TEMPLATES_LESS_THAN_API_6;
        }
        return null;
    }

    public int hashCode() {
        return Objects.hash(this.mSessionId, Integer.valueOf(this.mDisplayType));
    }

    public String toString() {
        return String.valueOf(this.mDisplayType) + DIVIDER + this.mSessionId;
    }

    public SessionInfo(int i, String str) {
        this.mDisplayType = i;
        this.mSessionId = str;
    }
}
