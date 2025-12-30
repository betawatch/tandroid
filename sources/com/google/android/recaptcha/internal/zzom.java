package com.google.android.recaptcha.internal;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzom implements Comparator {
    zzom() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
    }
}
