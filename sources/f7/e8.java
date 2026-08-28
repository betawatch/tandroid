package f7;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class e8 {
    public static boolean a(int i9, CharSequence charSequence) {
        if (i9 >= charSequence.length()) {
            return false;
        }
        char charAt = charSequence.charAt(i9);
        switch (charAt) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case Maneuver.TYPE_DESTINATION /* 39 */:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                return true;
            default:
                switch (charAt) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                        return true;
                    default:
                        switch (charAt) {
                            case '[':
                            case '\\':
                            case ']':
                            case '^':
                            case '_':
                            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                                return true;
                            default:
                                switch (charAt) {
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public static int b(char c10, CharSequence charSequence, int i9, int i10) {
        while (i9 < i10) {
            if (charSequence.charAt(i9) != c10) {
                return i9;
            }
            i9++;
        }
        return i10;
    }

    public static int c(int i9, int i10, CharSequence charSequence) {
        while (i9 < i10) {
            char charAt = charSequence.charAt(i9);
            if (charAt != '\t' && charAt != ' ') {
                return i9;
            }
            i9++;
        }
        return i10;
    }
}
