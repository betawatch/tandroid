package com.google.android.gms.common.api;

import org.telegram.messenger.R;
/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
/* loaded from: classes.dex */
public class CommonStatusCodes {
    public static String getStatusCodeString(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unknown status code: ");
                sb.append(i);
                return sb.toString();
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case R.styleable.MapAttrs_uiTiltGestures /* 19 */:
                return "REMOTE_EXCEPTION";
            case R.styleable.MapAttrs_uiZoomControls /* 20 */:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case R.styleable.MapAttrs_uiZoomGestures /* 21 */:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case R.styleable.MapAttrs_useViewLifecycle /* 22 */:
                return "RECONNECTION_TIMED_OUT";
        }
    }
}
