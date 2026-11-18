package org.telegram.messenger;

import java.util.HashMap;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class kz {
    public final HashMap a = new HashMap();

    public kz(String str) {
        for (String str2 : str.split(";")) {
            String[] split = str2.split(":");
            if (split.length == 2) {
                this.a.put(split[0].trim(), split[1].trim());
            }
        }
    }
}
