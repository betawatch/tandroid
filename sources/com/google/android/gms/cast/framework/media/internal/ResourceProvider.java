package com.google.android.gms.cast.framework.media.internal;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Cells.j2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class ResourceProvider {
    public static final Map a;

    static {
        HashMap hashMap = new HashMap();
        j2.n(R.drawable.cast_ic_notification_small_icon, hashMap, "smallIconDrawableResId", R.drawable.cast_ic_notification_stop_live_stream, "stopLiveStreamDrawableResId");
        j2.n(R.drawable.cast_ic_notification_pause, hashMap, "pauseDrawableResId", R.drawable.cast_ic_notification_play, "playDrawableResId");
        j2.n(R.drawable.cast_ic_notification_skip_next, hashMap, "skipNextDrawableResId", R.drawable.cast_ic_notification_skip_prev, "skipPrevDrawableResId");
        j2.n(R.drawable.cast_ic_notification_forward, hashMap, "forwardDrawableResId", R.drawable.cast_ic_notification_forward10, "forward10DrawableResId");
        j2.n(R.drawable.cast_ic_notification_forward30, hashMap, "forward30DrawableResId", R.drawable.cast_ic_notification_rewind, "rewindDrawableResId");
        j2.n(R.drawable.cast_ic_notification_rewind10, hashMap, "rewind10DrawableResId", R.drawable.cast_ic_notification_rewind30, "rewind30DrawableResId");
        j2.n(R.drawable.cast_ic_notification_disconnect, hashMap, "disconnectDrawableResId", R.dimen.cast_notification_image_size, "notificationImageSizeDimenResId");
        j2.n(R.string.cast_casting_to_device, hashMap, "castingToDeviceStringResId", R.string.cast_stop_live_stream, "stopLiveStreamStringResId");
        j2.n(R.string.cast_pause, hashMap, "pauseStringResId", R.string.cast_play, "playStringResId");
        j2.n(R.string.cast_skip_next, hashMap, "skipNextStringResId", R.string.cast_skip_prev, "skipPrevStringResId");
        j2.n(R.string.cast_forward, hashMap, "forwardStringResId", R.string.cast_forward_10, "forward10StringResId");
        j2.n(R.string.cast_forward_30, hashMap, "forward30StringResId", R.string.cast_rewind, "rewindStringResId");
        j2.n(R.string.cast_rewind_10, hashMap, "rewind10StringResId", R.string.cast_rewind_30, "rewind30StringResId");
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
