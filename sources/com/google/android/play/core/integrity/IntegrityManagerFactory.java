package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
