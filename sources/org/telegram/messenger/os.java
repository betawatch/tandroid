package org.telegram.messenger;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class os {
    public static final LinkedList a;
    public static boolean b;
    public static ls c;
    public static ComponentName d;

    static {
        LinkedList linkedList = new LinkedList();
        a = linkedList;
        linkedList.add(NotificationBadge$AdwHomeBadger.class);
        linkedList.add(NotificationBadge$ApexHomeBadger.class);
        linkedList.add(NotificationBadge$NewHtcHomeBadger.class);
        linkedList.add(NotificationBadge$NovaHomeBadger.class);
        linkedList.add(NotificationBadge$SonyHomeBadger.class);
        linkedList.add(NotificationBadge$XiaomiHomeBadger.class);
        linkedList.add(NotificationBadge$AsusHomeBadger.class);
        linkedList.add(NotificationBadge$HuaweiHomeBadger.class);
        linkedList.add(NotificationBadge$OPPOHomeBader.class);
        linkedList.add(NotificationBadge$SamsungHomeBadger.class);
        linkedList.add(NotificationBadge$ZukHomeBadger.class);
        linkedList.add(NotificationBadge$VivoHomeBadger.class);
    }

    public static boolean a(Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = w0.b.getPackageManager().queryBroadcastReceivers(intent, 0);
        return queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0;
    }

    public static void b() {
        ls lsVar;
        ls lsVar2;
        Context context = w0.b;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            return;
        }
        d = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity != null) {
            String str = resolveActivity.activityInfo.packageName;
            Iterator it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                try {
                    lsVar2 = (ls) ((Class) it.next()).newInstance();
                } catch (Exception unused) {
                    lsVar2 = null;
                }
                if (lsVar2 != null && lsVar2.b().contains(str)) {
                    c = lsVar2;
                    break;
                }
            }
            if (c != null) {
                return;
            }
        }
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        if (queryIntentActivities != null) {
            for (int i10 = 0; i10 < queryIntentActivities.size(); i10++) {
                String str2 = queryIntentActivities.get(i10).activityInfo.packageName;
                Iterator it2 = a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    try {
                        lsVar = (ls) ((Class) it2.next()).newInstance();
                    } catch (Exception unused2) {
                        lsVar = null;
                    }
                    if (lsVar != null && lsVar.b().contains(str2)) {
                        c = lsVar;
                        break;
                    }
                }
                if (c != null) {
                    break;
                }
            }
        }
        if (c == null) {
            String str3 = Build.MANUFACTURER;
            if (str3.equalsIgnoreCase("Xiaomi")) {
                c = new ls() { // from class: org.telegram.messenger.NotificationBadge$XiaomiHomeBadger
                    @Override // org.telegram.messenger.ls
                    public final void a(int i11) {
                        try {
                            Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
                            Field declaredField = newInstance.getClass().getDeclaredField("messageCount");
                            declaredField.setAccessible(true);
                            declaredField.set(newInstance, String.valueOf(i11 == 0 ? "" : Integer.valueOf(i11)));
                        } catch (Throwable unused3) {
                            Intent intent2 = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
                            intent2.putExtra("android.intent.extra.update_application_component_name", os.d.getPackageName() + "/" + os.d.getClassName());
                            intent2.putExtra("android.intent.extra.update_application_message_text", String.valueOf(i11 != 0 ? Integer.valueOf(i11) : ""));
                            if (os.a(intent2)) {
                                i0.g3(new mg.c2(intent2, 7));
                            }
                        }
                    }

                    @Override // org.telegram.messenger.ls
                    public final List b() {
                        return Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2");
                    }
                };
                return;
            }
            if (str3.equalsIgnoreCase("ZUK")) {
                c = new NotificationBadge$ZukHomeBadger();
                return;
            }
            if (str3.equalsIgnoreCase("OPPO")) {
                c = new ls() { // from class: org.telegram.messenger.NotificationBadge$OPPOHomeBader
                    public int a = -1;

                    @Override // org.telegram.messenger.ls
                    public final void a(int i11) {
                        if (this.a == i11) {
                            return;
                        }
                        this.a = i11;
                        try {
                            Bundle bundle = new Bundle();
                            bundle.putInt("app_badge_count", i11);
                            w0.b.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
                        } catch (Throwable unused3) {
                        }
                    }

                    @Override // org.telegram.messenger.ls
                    public final List b() {
                        return Collections.singletonList("com.oppo.launcher");
                    }
                };
            } else if (str3.equalsIgnoreCase("VIVO")) {
                c = new ls() { // from class: org.telegram.messenger.NotificationBadge$VivoHomeBadger
                    @Override // org.telegram.messenger.ls
                    public final void a(int i11) {
                        Intent intent2 = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
                        intent2.setPackage("com.vivo.launcher");
                        intent2.putExtra("packageName", w0.b.getPackageName());
                        intent2.putExtra("className", os.d.getClassName());
                        intent2.putExtra("notificationNum", i11);
                        w0.b.sendBroadcast(intent2);
                    }

                    @Override // org.telegram.messenger.ls
                    public final List b() {
                        return Arrays.asList("com.vivo.launcher");
                    }
                };
            } else {
                c = new NotificationBadge$DefaultBadger();
            }
        }
    }
}
