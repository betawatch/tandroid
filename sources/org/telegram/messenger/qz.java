package org.telegram.messenger;

import java.util.HashMap;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class qz {
    public final HashMap a = new HashMap();

    public qz(String str) {
        for (String str2 : str.split(";")) {
            String[] split = str2.split(":");
            if (split.length == 2) {
                this.a.put(split[0].trim(), split[1].trim());
            }
        }
    }
}
