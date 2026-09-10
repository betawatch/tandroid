package g8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class l {
    public static final k6.c[] a = {new k6.c("name_ulr_private", 1), new k6.c("name_sleep_segment_request", 1), new k6.c("get_last_activity_feature_id", 1), new k6.c("support_context_feature_id", 1), new k6.c("get_current_location", 2), new k6.c("get_last_location_with_request", 1), new k6.c("set_mock_mode_with_callback", 1), new k6.c("set_mock_location_with_callback", 1), new k6.c("inject_location_with_callback", 1), new k6.c("location_updates_with_callback", 1), new k6.c("use_safe_parcelable_in_intents", 1)};

    public static String a(int i10) {
        if (i10 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i10 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i10 == 104) {
            return "LOW_POWER";
        }
        if (i10 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}
