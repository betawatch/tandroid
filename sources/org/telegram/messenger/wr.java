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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class wr {
    public static final LinkedList a;
    public static boolean b;
    public static ur c;
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
        List<ResolveInfo> queryBroadcastReceivers = t0.b.getPackageManager().queryBroadcastReceivers(intent, 0);
        return queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0;
    }

    public static void b() {
        ur urVar;
        ur urVar2;
        Context context = t0.b;
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
                    urVar2 = (ur) ((Class) it.next()).newInstance();
                } catch (Exception unused) {
                    urVar2 = null;
                }
                if (urVar2 != null && urVar2.b().contains(str)) {
                    c = urVar2;
                    break;
                }
            }
            if (c != null) {
                return;
            }
        }
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        if (queryIntentActivities != null) {
            for (int i3 = 0; i3 < queryIntentActivities.size(); i3++) {
                String str2 = queryIntentActivities.get(i3).activityInfo.packageName;
                Iterator it2 = a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    try {
                        urVar = (ur) ((Class) it2.next()).newInstance();
                    } catch (Exception unused2) {
                        urVar = null;
                    }
                    if (urVar != null && urVar.b().contains(str2)) {
                        c = urVar;
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
                c = new ur() { // from class: org.telegram.messenger.NotificationBadge$XiaomiHomeBadger
                    @Override // org.telegram.messenger.ur
                    public final void a(int i10) {
                        try {
                            Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
                            Field declaredField = newInstance.getClass().getDeclaredField("messageCount");
                            declaredField.setAccessible(true);
                            declaredField.set(newInstance, String.valueOf(i10 == 0 ? "" : Integer.valueOf(i10)));
                        } catch (Throwable unused3) {
                            Intent intent2 = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
                            intent2.putExtra("android.intent.extra.update_application_component_name", wr.d.getPackageName() + "/" + wr.d.getClassName());
                            intent2.putExtra("android.intent.extra.update_application_message_text", String.valueOf(i10 != 0 ? Integer.valueOf(i10) : ""));
                            if (wr.a(intent2)) {
                                g0.h3(new mi.b0(intent2, 8));
                            }
                        }
                    }

                    @Override // org.telegram.messenger.ur
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
                c = new ur() { // from class: org.telegram.messenger.NotificationBadge$OPPOHomeBader
                    public int a = -1;

                    @Override // org.telegram.messenger.ur
                    public final void a(int i10) {
                        if (this.a == i10) {
                            return;
                        }
                        this.a = i10;
                        try {
                            Bundle bundle = new Bundle();
                            bundle.putInt("app_badge_count", i10);
                            t0.b.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
                        } catch (Throwable unused3) {
                        }
                    }

                    @Override // org.telegram.messenger.ur
                    public final List b() {
                        return Collections.singletonList("com.oppo.launcher");
                    }
                };
            } else if (str3.equalsIgnoreCase("VIVO")) {
                c = new ur() { // from class: org.telegram.messenger.NotificationBadge$VivoHomeBadger
                    @Override // org.telegram.messenger.ur
                    public final void a(int i10) {
                        Intent intent2 = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
                        intent2.setPackage("com.vivo.launcher");
                        intent2.putExtra("packageName", t0.b.getPackageName());
                        intent2.putExtra("className", wr.d.getClassName());
                        intent2.putExtra("notificationNum", i10);
                        t0.b.sendBroadcast(intent2);
                    }

                    @Override // org.telegram.messenger.ur
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
