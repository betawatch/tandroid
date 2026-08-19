package com.microsoft.appcenter.ingestion.models;

import java.util.List;

/* loaded from: classes3.dex */
public class LogContainer {
    private List logs;

    public List getLogs() {
        return this.logs;
    }

    public void setLogs(List list) {
        this.logs = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            List list = this.logs;
            List list2 = ((LogContainer) obj).logs;
            if (list != null) {
                return list.equals(list2);
            }
            if (list2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        List list = this.logs;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }
}
