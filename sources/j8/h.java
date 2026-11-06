package j8;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class h {
    public static final n6.c[] a = {new n6.c("name_ulr_private", 1), new n6.c("name_sleep_segment_request", 1), new n6.c("get_last_activity_feature_id", 1), new n6.c("support_context_feature_id", 1), new n6.c("get_current_location", 2), new n6.c("get_last_location_with_request", 1), new n6.c("set_mock_mode_with_callback", 1), new n6.c("set_mock_location_with_callback", 1), new n6.c("inject_location_with_callback", 1), new n6.c("location_updates_with_callback", 1), new n6.c("use_safe_parcelable_in_intents", 1)};

    public static String a(int i7) {
        if (i7 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i7 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i7 == 104) {
            return "LOW_POWER";
        }
        if (i7 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}
