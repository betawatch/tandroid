package org.telegram.ui;

import com.google.android.gms.cast.MediaError;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class aa extends f6.g {
    @Override // f6.g
    public final void b(MediaError mediaError) {
        FileLog.e("Chromecast Media Error: " + mediaError);
    }

    @Override // f6.g
    public final void g() {
        FileLog.d("onStatusUpdated");
        c5.d.C();
    }
}
