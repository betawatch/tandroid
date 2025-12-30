package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class zzgn {
    private zzgn() {
        throw null;
    }

    public /* synthetic */ zzgn(DefaultConstructorMarker defaultConstructorMarker) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int zzc(String str) {
        return Integer.parseInt(StringsKt.substringBefore$default(StringsKt.replace$default("18.7.1", ".", "", false, 4, null), "-", null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzd(String str) {
        return "cesdb".concat(String.valueOf(StringsKt.substringAfter("18.7.1", "-", "")));
    }
}
