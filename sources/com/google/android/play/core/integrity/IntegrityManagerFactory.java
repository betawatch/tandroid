package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public class IntegrityManagerFactory {
    private IntegrityManagerFactory() {
    }

    public static IntegrityManager create(Context context) {
        return z.a(context).a();
    }

    public static StandardIntegrityManager createStandard(Context context) {
        return ax.a(context).a();
    }
}
