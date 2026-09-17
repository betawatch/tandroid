package androidx.emoji2.text;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Configuration;
import android.icu.text.DecimalFormatSymbols;
import android.os.LocaleList;
import android.os.UserManager;
import j$.util.stream.IntStream;
import java.util.Locale;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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

    public static void h(Notification.Action.Builder builder, boolean z10) {
        builder.setAllowGeneratedReplies(z10);
    }

    public static void i(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }
}
