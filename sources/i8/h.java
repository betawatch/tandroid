package i8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class h {
    public static final m6.c[] a = {new m6.c("name_ulr_private", 1), new m6.c("name_sleep_segment_request", 1), new m6.c("get_last_activity_feature_id", 1), new m6.c("support_context_feature_id", 1), new m6.c("get_current_location", 2), new m6.c("get_last_location_with_request", 1), new m6.c("set_mock_mode_with_callback", 1), new m6.c("set_mock_location_with_callback", 1), new m6.c("inject_location_with_callback", 1), new m6.c("location_updates_with_callback", 1), new m6.c("use_safe_parcelable_in_intents", 1)};

    public static String a(int i3) {
        if (i3 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i3 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i3 == 104) {
            return "LOW_POWER";
        }
        if (i3 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}
