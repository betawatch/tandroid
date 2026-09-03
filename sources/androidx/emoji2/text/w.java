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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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

    public static void h(Notification.Action.Builder builder, boolean z4) {
        builder.setAllowGeneratedReplies(z4);
    }

    public static void i(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }
}
