package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class e0 {
    public static Bundle a(PlaybackState playbackState) {
        return playbackState.getExtras();
    }

    public static void b(PlaybackState.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }
}
