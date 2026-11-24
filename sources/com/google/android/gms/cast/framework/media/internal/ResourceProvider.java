package com.google.android.gms.cast.framework.media.internal;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ResourceProvider {
    public static final Map a;

    static {
        HashMap hashMap = new HashMap();
        aq1.q(R.drawable.cast_ic_notification_small_icon, hashMap, "smallIconDrawableResId", R.drawable.cast_ic_notification_stop_live_stream, "stopLiveStreamDrawableResId");
        aq1.q(R.drawable.cast_ic_notification_pause, hashMap, "pauseDrawableResId", R.drawable.cast_ic_notification_play, "playDrawableResId");
        aq1.q(R.drawable.cast_ic_notification_skip_next, hashMap, "skipNextDrawableResId", R.drawable.cast_ic_notification_skip_prev, "skipPrevDrawableResId");
        aq1.q(R.drawable.cast_ic_notification_forward, hashMap, "forwardDrawableResId", R.drawable.cast_ic_notification_forward10, "forward10DrawableResId");
        aq1.q(R.drawable.cast_ic_notification_forward30, hashMap, "forward30DrawableResId", R.drawable.cast_ic_notification_rewind, "rewindDrawableResId");
        aq1.q(R.drawable.cast_ic_notification_rewind10, hashMap, "rewind10DrawableResId", R.drawable.cast_ic_notification_rewind30, "rewind30DrawableResId");
        aq1.q(R.drawable.cast_ic_notification_disconnect, hashMap, "disconnectDrawableResId", R.dimen.cast_notification_image_size, "notificationImageSizeDimenResId");
        aq1.q(R.string.cast_casting_to_device, hashMap, "castingToDeviceStringResId", R.string.cast_stop_live_stream, "stopLiveStreamStringResId");
        aq1.q(R.string.cast_pause, hashMap, "pauseStringResId", R.string.cast_play, "playStringResId");
        aq1.q(R.string.cast_skip_next, hashMap, "skipNextStringResId", R.string.cast_skip_prev, "skipPrevStringResId");
        aq1.q(R.string.cast_forward, hashMap, "forwardStringResId", R.string.cast_forward_10, "forward10StringResId");
        aq1.q(R.string.cast_forward_30, hashMap, "forward30StringResId", R.string.cast_rewind, "rewindStringResId");
        aq1.q(R.string.cast_rewind_10, hashMap, "rewind10StringResId", R.string.cast_rewind_30, "rewind30StringResId");
        hashMap.put("disconnectStringResId", Integer.valueOf(R.string.cast_disconnect));
        a = DesugarCollections.unmodifiableMap(hashMap);
    }

    public static Integer findResourceByName(String str) {
        if (str == null) {
            return null;
        }
        return (Integer) a.get(str);
    }
}
