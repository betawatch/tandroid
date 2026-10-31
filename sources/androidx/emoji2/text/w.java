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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        int i10;
        str.getClass();
        i10 = 0;
        switch (str) {
            case "col-resize":
            case "ew-resize":
            case "e-resize":
            case "w-resize":
                i10 = 1014;
                break;
            case "se-resize":
            case "nw-resize":
            case "nwse-resize":
                i10 = 1017;
                break;
            case "n-resize":
            case "s-resize":
            case "row-resize":
            case "ns-resize":
                i10 = 1015;
                break;
            case "vertical-text":
                i10 = 1009;
                break;
            case "progress":
            case "wait":
                i10 = 1004;
                break;
            case "ne-resize":
            case "sw-resize":
            case "nesw-resize":
                i10 = 1016;
                break;
            case "pointer":
                i10 = 1002;
                break;
            case "zoom-in":
                i10 = 1018;
                break;
            case "cell":
                i10 = 1006;
                break;
            case "copy":
                i10 = 1011;
                break;
            case "grab":
                i10 = 1020;
                break;
            case "help":
                i10 = 1003;
                break;
            case "move":
            case "all-scroll":
                i10 = 1013;
                break;
            case "none":
                break;
            case "text":
                i10 = 1008;
                break;
            case "grabbing":
                i10 = 1021;
                break;
            case "alias":
                i10 = 1010;
                break;
            case "not-allowed":
            case "no-drop":
                i10 = 1012;
                break;
            case "zoom-out":
                i10 = 1019;
                break;
            case "context-menu":
                i10 = 1001;
                break;
            case "crosshair":
                i10 = 1007;
                break;
            default:
                view.setPointerIcon(null);
                return;
        }
        view.setPointerIcon(PointerIcon.getSystemIcon(view.getContext(), i10));
    }

    public static void i(Notification.Action.Builder builder, boolean z10) {
        builder.setAllowGeneratedReplies(z10);
    }

    public static void j(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }
}
