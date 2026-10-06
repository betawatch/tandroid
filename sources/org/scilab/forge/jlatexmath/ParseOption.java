package org.scilab.forge.jlatexmath;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class ParseOption {
    public static final Map<String, String> parseMap(String str) {
        HashMap hashMap = new HashMap();
        if (str != null && str.length() != 0) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
            while (stringTokenizer.hasMoreTokens()) {
                String[] split = stringTokenizer.nextToken().trim().split("=");
                if (split != null) {
                    if (split.length == 2) {
                        hashMap.put(split[0].trim(), split[1].trim());
                    } else if (split.length == 1) {
                        hashMap.put(split[0].trim(), null);
                    }
                }
            }
        }
        return hashMap;
    }
}
