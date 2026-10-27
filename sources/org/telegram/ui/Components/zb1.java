package org.telegram.ui.Components;

import android.os.Trace;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zb1 implements Runnable {
    public final /* synthetic */ long a;

    @Override // java.lang.Runnable
    public final void run() {
        long j10 = this.a;
        Trace.beginSection("WidgetSandbox:Destroy");
        try {
            WidgetSandboxNative.destroy(j10);
        } finally {
            Trace.endSection();
        }
    }
}
