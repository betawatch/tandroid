package androidx.emoji2.text;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Configuration;
import android.icu.text.DecimalFormatSymbols;
import android.os.LocaleList;
import android.os.UserManager;
import android.view.PointerIcon;
import android.view.View;
import j$.util.stream.IntStream;
import java.util.Locale;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class x {
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

    public static LocaleList d(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static DecimalFormatSymbols e(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    public static LocaleList f(Configuration configuration) {
        return configuration.getLocales();
    }

    public static boolean g(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static void h(View view, String str) {
        int i3;
        str.getClass();
        i3 = 0;
        switch (str) {
            case "col-resize":
            case "ew-resize":
            case "e-resize":
            case "w-resize":
                i3 = 1014;
                break;
            case "se-resize":
            case "nw-resize":
            case "nwse-resize":
                i3 = 1017;
                break;
            case "n-resize":
            case "s-resize":
            case "row-resize":
            case "ns-resize":
                i3 = 1015;
                break;
            case "vertical-text":
                i3 = 1009;
                break;
            case "progress":
            case "wait":
                i3 = 1004;
                break;
            case "ne-resize":
            case "sw-resize":
            case "nesw-resize":
                i3 = 1016;
                break;
            case "pointer":
                i3 = 1002;
                break;
            case "zoom-in":
                i3 = 1018;
                break;
            case "cell":
                i3 = 1006;
                break;
            case "copy":
                i3 = 1011;
                break;
            case "grab":
                i3 = 1020;
                break;
            case "help":
                i3 = 1003;
                break;
            case "move":
            case "all-scroll":
                i3 = 1013;
                break;
            case "none":
                break;
            case "text":
                i3 = 1008;
                break;
            case "grabbing":
                i3 = 1021;
                break;
            case "alias":
                i3 = 1010;
                break;
            case "not-allowed":
            case "no-drop":
                i3 = 1012;
                break;
            case "zoom-out":
                i3 = 1019;
                break;
            case "context-menu":
                i3 = 1001;
                break;
            case "crosshair":
                i3 = 1007;
                break;
            default:
                view.setPointerIcon(null);
                return;
        }
        view.setPointerIcon(PointerIcon.getSystemIcon(view.getContext(), i3));
    }

    public static void i(Notification.Action.Builder builder, boolean z10) {
        builder.setAllowGeneratedReplies(z10);
    }

    public static void j(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }
}
