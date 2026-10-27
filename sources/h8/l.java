package h8;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class l {
    public static final l6.c[] a = {new l6.c("name_ulr_private", 1), new l6.c("name_sleep_segment_request", 1), new l6.c("get_last_activity_feature_id", 1), new l6.c("support_context_feature_id", 1), new l6.c("get_current_location", 2), new l6.c("get_last_location_with_request", 1), new l6.c("set_mock_mode_with_callback", 1), new l6.c("set_mock_location_with_callback", 1), new l6.c("inject_location_with_callback", 1), new l6.c("location_updates_with_callback", 1), new l6.c("use_safe_parcelable_in_intents", 1)};

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
