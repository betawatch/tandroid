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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class w {
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
        int i7;
        str.getClass();
        i7 = 0;
        switch (str) {
            case "col-resize":
            case "ew-resize":
            case "e-resize":
            case "w-resize":
                i7 = 1014;
                break;
            case "se-resize":
            case "nw-resize":
            case "nwse-resize":
                i7 = 1017;
                break;
            case "n-resize":
            case "s-resize":
            case "row-resize":
            case "ns-resize":
                i7 = 1015;
                break;
            case "vertical-text":
                i7 = 1009;
                break;
            case "progress":
            case "wait":
                i7 = 1004;
                break;
            case "ne-resize":
            case "sw-resize":
            case "nesw-resize":
                i7 = 1016;
                break;
            case "pointer":
                i7 = 1002;
                break;
            case "zoom-in":
                i7 = 1018;
                break;
            case "cell":
                i7 = 1006;
                break;
            case "copy":
                i7 = 1011;
                break;
            case "grab":
                i7 = 1020;
                break;
            case "help":
                i7 = 1003;
                break;
            case "move":
            case "all-scroll":
                i7 = 1013;
                break;
            case "none":
                break;
            case "text":
                i7 = 1008;
                break;
            case "grabbing":
                i7 = 1021;
                break;
            case "alias":
                i7 = 1010;
                break;
            case "not-allowed":
            case "no-drop":
                i7 = 1012;
                break;
            case "zoom-out":
                i7 = 1019;
                break;
            case "context-menu":
                i7 = 1001;
                break;
            case "crosshair":
                i7 = 1007;
                break;
            default:
                view.setPointerIcon(null);
                return;
        }
        view.setPointerIcon(PointerIcon.getSystemIcon(view.getContext(), i7));
    }

    public static void i(Notification.Action.Builder builder, boolean z9) {
        builder.setAllowGeneratedReplies(z9);
    }

    public static void j(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }
}
