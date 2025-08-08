package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
class KeysMap {
    private final Map keys = new HashMap();
    private final int maxEntries;
    private final int maxEntryLength;

    public KeysMap(int i, int i2) {
        this.maxEntries = i;
        this.maxEntryLength = i2;
    }

    public synchronized Map getKeys() {
        return Collections.unmodifiableMap(new HashMap(this.keys));
    }

    public synchronized boolean setKey(String str, String str2) {
        String sanitizeKey = sanitizeKey(str);
        if (this.keys.size() >= this.maxEntries && !this.keys.containsKey(sanitizeKey)) {
            Logger.getLogger().w("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.maxEntries);
            return false;
        }
        String sanitizeString = sanitizeString(str2, this.maxEntryLength);
        if (CommonUtils.nullSafeEquals((String) this.keys.get(sanitizeKey), sanitizeString)) {
            return false;
        }
        Map map = this.keys;
        if (str2 == null) {
            sanitizeString = "";
        }
        map.put(sanitizeKey, sanitizeString);
        return true;
    }

    public synchronized void setKeys(Map map) {
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String sanitizeKey = sanitizeKey((String) entry.getKey());
                if (this.keys.size() >= this.maxEntries && !this.keys.containsKey(sanitizeKey)) {
                    i++;
                }
                String str = (String) entry.getValue();
                this.keys.put(sanitizeKey, str == null ? "" : sanitizeString(str, this.maxEntryLength));
            }
            if (i > 0) {
                Logger.getLogger().w("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.maxEntries);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private String sanitizeKey(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Custom attribute key must not be null.");
        }
        return sanitizeString(str, this.maxEntryLength);
    }

    public static String sanitizeString(String str, int i) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > i ? trim.substring(0, i) : trim;
    }
}
