// default package

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Configuration;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.RelativeDateTimeFormatter;
import android.os.LocaleList;
import android.os.UserManager;
import android.view.PointerIcon;
import android.view.View;
import j$.util.stream.IntStream;
import java.io.File;
import java.util.Locale;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class kh0 {
    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static IntStream b(CharSequence charSequence) {
        IntStream convert;
        convert = IntStream.VivifiedWrapper.convert(charSequence.chars());
        return convert;
    }

    public static IntStream c(CharSequence charSequence) {
        IntStream convert;
        convert = IntStream.VivifiedWrapper.convert(charSequence.codePoints());
        return convert;
    }

    public static Context d(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static LocaleList e(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static String f(long j, Locale locale) {
        RelativeDateTimeFormatter.RelativeUnit relativeUnit;
        RelativeDateTimeFormatter relativeDateTimeFormatter = RelativeDateTimeFormatter.getInstance(locale);
        boolean z = j > 0;
        long max = Math.max(1L, Math.round(Math.abs(j) / 1000.0d));
        if (max < 60) {
            relativeUnit = RelativeDateTimeFormatter.RelativeUnit.SECONDS;
        } else if (max < 3600) {
            relativeUnit = RelativeDateTimeFormatter.RelativeUnit.MINUTES;
            max = Math.round(max / 60.0d);
        } else if (max < 86400) {
            relativeUnit = RelativeDateTimeFormatter.RelativeUnit.HOURS;
            max = Math.round(max / 3600.0d);
        } else if (max < 2592000) {
            relativeUnit = RelativeDateTimeFormatter.RelativeUnit.DAYS;
            max = Math.round(max / 86400.0d);
        } else if (max < 31536000) {
            relativeUnit = RelativeDateTimeFormatter.RelativeUnit.MONTHS;
            max = Math.round(max / 2592000.0d);
        } else {
            relativeUnit = RelativeDateTimeFormatter.RelativeUnit.YEARS;
            max = Math.round(max / 3.1536E7d);
        }
        return relativeDateTimeFormatter.format(max, z ? RelativeDateTimeFormatter.Direction.NEXT : RelativeDateTimeFormatter.Direction.LAST, relativeUnit);
    }

    public static File g(Context context) {
        return context.createDeviceProtectedStorageContext().getCodeCacheDir();
    }

    public static DecimalFormatSymbols h(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    public static LocaleList i(Configuration configuration) {
        return configuration.getLocales();
    }

    public static boolean j(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static void k(View view, String str) {
        int i;
        str.getClass();
        i = 0;
        switch (str) {
            case "col-resize":
            case "ew-resize":
            case "e-resize":
            case "w-resize":
                i = 1014;
                break;
            case "se-resize":
            case "nw-resize":
            case "nwse-resize":
                i = 1017;
                break;
            case "n-resize":
            case "s-resize":
            case "row-resize":
            case "ns-resize":
                i = 1015;
                break;
            case "vertical-text":
                i = 1009;
                break;
            case "progress":
            case "wait":
                i = 1004;
                break;
            case "ne-resize":
            case "sw-resize":
            case "nesw-resize":
                i = 1016;
                break;
            case "pointer":
                i = 1002;
                break;
            case "zoom-in":
                i = 1018;
                break;
            case "cell":
                i = 1006;
                break;
            case "copy":
                i = 1011;
                break;
            case "grab":
                i = 1020;
                break;
            case "help":
                i = 1003;
                break;
            case "move":
            case "all-scroll":
                i = 1013;
                break;
            case "none":
                break;
            case "text":
                i = 1008;
                break;
            case "grabbing":
                i = 1021;
                break;
            case "alias":
                i = 1010;
                break;
            case "not-allowed":
            case "no-drop":
                i = 1012;
                break;
            case "zoom-out":
                i = 1019;
                break;
            case "context-menu":
                i = 1001;
                break;
            case "crosshair":
                i = 1007;
                break;
            default:
                view.setPointerIcon(null);
                return;
        }
        view.setPointerIcon(PointerIcon.getSystemIcon(view.getContext(), i));
    }

    public static void l(Notification.Action.Builder builder, boolean z) {
        builder.setAllowGeneratedReplies(z);
    }

    public static void m(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }
}
