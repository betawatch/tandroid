package com.google.android.gms.cast.framework.media.internal;

import c3.h0;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class ResourceProvider {
    public static final Map a;

    static {
        HashMap hashMap = new HashMap();
        h0.o(R.drawable.cast_ic_notification_small_icon, hashMap, "smallIconDrawableResId", R.drawable.cast_ic_notification_stop_live_stream, "stopLiveStreamDrawableResId");
        h0.o(R.drawable.cast_ic_notification_pause, hashMap, "pauseDrawableResId", R.drawable.cast_ic_notification_play, "playDrawableResId");
        h0.o(R.drawable.cast_ic_notification_skip_next, hashMap, "skipNextDrawableResId", R.drawable.cast_ic_notification_skip_prev, "skipPrevDrawableResId");
        h0.o(R.drawable.cast_ic_notification_forward, hashMap, "forwardDrawableResId", R.drawable.cast_ic_notification_forward10, "forward10DrawableResId");
        h0.o(R.drawable.cast_ic_notification_forward30, hashMap, "forward30DrawableResId", R.drawable.cast_ic_notification_rewind, "rewindDrawableResId");
        h0.o(R.drawable.cast_ic_notification_rewind10, hashMap, "rewind10DrawableResId", R.drawable.cast_ic_notification_rewind30, "rewind30DrawableResId");
        h0.o(R.drawable.cast_ic_notification_disconnect, hashMap, "disconnectDrawableResId", R.dimen.cast_notification_image_size, "notificationImageSizeDimenResId");
        h0.o(R.string.cast_casting_to_device, hashMap, "castingToDeviceStringResId", R.string.cast_stop_live_stream, "stopLiveStreamStringResId");
        h0.o(R.string.cast_pause, hashMap, "pauseStringResId", R.string.cast_play, "playStringResId");
        h0.o(R.string.cast_skip_next, hashMap, "skipNextStringResId", R.string.cast_skip_prev, "skipPrevStringResId");
        h0.o(R.string.cast_forward, hashMap, "forwardStringResId", R.string.cast_forward_10, "forward10StringResId");
        h0.o(R.string.cast_forward_30, hashMap, "forward30StringResId", R.string.cast_rewind, "rewindStringResId");
        h0.o(R.string.cast_rewind_10, hashMap, "rewind10StringResId", R.string.cast_rewind_30, "rewind30StringResId");
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
