package com.microsoft.appcenter;

import com.microsoft.appcenter.utils.AppCenterLog;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class CustomProperties {
    private static final Pattern KEY_PATTERN = Pattern.compile("^[a-zA-Z][a-zA-Z0-9]*$");
    private final Map mProperties = new HashMap();

    synchronized Map getProperties() {
        return new HashMap(this.mProperties);
    }

    public synchronized CustomProperties set(String str, String str2) {
        if (isValidKey(str) && isValidStringValue(str, str2)) {
            addProperty(str, str2);
        }
        return this;
    }

    private void addProperty(String str, Object obj) {
        if (this.mProperties.containsKey(str) || this.mProperties.size() < 60) {
            this.mProperties.put(str, obj);
        } else {
            AppCenterLog.error("AppCenter", "Custom properties cannot contain more than 60 items");
        }
    }

    private boolean isValidKey(String str) {
        if (str == null || !KEY_PATTERN.matcher(str).matches()) {
            AppCenterLog.error("AppCenter", "Custom property \"" + str + "\" must match \"" + KEY_PATTERN + "\"");
            return false;
        }
        if (str.length() > 128) {
            AppCenterLog.error("AppCenter", "Custom property \"" + str + "\" length cannot be longer than 128 characters.");
            return false;
        }
        if (!this.mProperties.containsKey(str)) {
            return true;
        }
        AppCenterLog.warn("AppCenter", "Custom property \"" + str + "\" is already set or cleared and will be overridden.");
        return true;
    }

    private boolean isValidStringValue(String str, String str2) {
        if (str2 == null) {
            AppCenterLog.error("AppCenter", "Custom property value cannot be null, did you mean to call clear?");
            return false;
        }
        if (str2.length() <= 128) {
            return true;
        }
        AppCenterLog.error("AppCenter", "Custom property \"" + str + "\" value length cannot be longer than 128 characters.");
        return false;
    }
}
