package com.google.firebase.messaging;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class e {
    public static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX WARN: Can't wrap try/catch for region: R(75:0|1|(3:2|3|(1:5))|239|7|8|(3:215|216|(73:218|(66:220|(1:222)|11|(1:13)|14|(1:16)|17|(57:19|(1:201)|23|(1:25)|26|(1:28)(2:191|(1:196)(1:195))|29|(1:31)|32|(1:34)(5:179|(1:181)|182|(1:184)(1:190)|(1:186)(2:187|(1:189)))|35|(1:37)(8:157|(4:160|(2:168|169)(1:166)|167|158)|170|171|(1:173)|174|(1:176)(1:178)|177)|38|(1:40)(3:152|(1:154)(1:156)|155)|(1:42)|43|(39:148|149|(1:49)|50|(1:52)|53|(33:139|(1:143)|(1:57)|58|(29:134|(1:138)|(1:62)|63|(25:131|(1:133)|(1:67)|68|(21:127|128|(1:72)|73|(3:117|118|(18:120|(1:122)|123|(1:77)|78|(4:102|103|104|(2:106|(12:108|(3:82|(1:85)|86)|87|(1:89)|90|(1:92)|93|(1:95)|96|(1:98)|99|100)(2:109|110))(2:111|112))|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)(2:124|125))|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|45|(39:144|145|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|202|(2:210|211)|(1:209)|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|223|(69:225|(1:227)|11|(0)|14|(0)|17|(0)|202|(1:204)|210|211|(1:207)|209|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)(1:235)|228|(3:230|(1:232)(1:234)|233)|11|(0)|14|(0)|17|(0)|202|(0)|210|211|(0)|209|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100))|10|11|(0)|14|(0)|17|(0)|202|(0)|210|211|(0)|209|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100) */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0162, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0163, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r0 != null) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x044a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0408 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0328 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0301 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0550  */
    /* JADX WARN: Type inference failed for: r0v107, types: [int] */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v153 */
    /* JADX WARN: Type inference failed for: r0v154 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j a(FirebaseMessagingService firebaseMessagingService, android.support.v4.media.c cVar) {
        Bundle bundle;
        String string;
        String packageName;
        PackageManager packageManager;
        String d;
        String d10;
        String e;
        int i10;
        String e7;
        Uri defaultUri;
        String e10;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String e11;
        Integer valueOf;
        String e12;
        Integer b10;
        Integer b11;
        Integer b12;
        String e13;
        Long valueOf2;
        JSONArray c10;
        long[] jArr;
        JSONArray c11;
        int[] iArr;
        ?? r02;
        String e14;
        int i11;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
        } catch (PackageManager.NameNotFoundException e15) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e15);
        }
        bundle = Bundle.EMPTY;
        Bundle bundle2 = bundle;
        String e16 = cVar.e("gcm.n.android_channel_id");
        int i12 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(e16)) {
                    if (notificationManager.getNotificationChannel(e16) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + e16 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    }
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    e0.t tVar = new e0.t(firebaseMessagingService, e16);
                    d = cVar.d(resources, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(d)) {
                        tVar.g(d);
                    }
                    d10 = cVar.d(resources, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(d10)) {
                        tVar.f(d10);
                        e0.o oVar = new e0.o(false);
                        oVar.f = e0.t.d(d10);
                        tVar.n(oVar);
                    }
                    e = cVar.e("gcm.n.icon");
                    if (!TextUtils.isEmpty(e)) {
                        i10 = resources.getIdentifier(e, "drawable", packageName);
                        if ((i10 == 0 || !b(resources, i10)) && ((i10 = resources.getIdentifier(e, "mipmap", packageName)) == 0 || !b(resources, i10))) {
                            Log.w("FirebaseMessaging", "Icon resource " + e + " not found. Notification will use default icon.");
                        }
                        tVar.E.icon = i10;
                        e7 = cVar.e("gcm.n.sound2");
                        if (TextUtils.isEmpty(e7)) {
                            e7 = cVar.e("gcm.n.sound");
                        }
                        if (TextUtils.isEmpty(e7)) {
                            defaultUri = null;
                        } else if ("default".equals(e7) || resources.getIdentifier(e7, "raw", packageName) == 0) {
                            defaultUri = RingtoneManager.getDefaultUri(2);
                        } else {
                            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + e7);
                        }
                        if (defaultUri != null) {
                            Notification notification = tVar.E;
                            notification.sound = defaultUri;
                            notification.audioStreamType = -1;
                            notification.audioAttributes = e0.s.a(e0.s.e(e0.s.c(e0.s.b(), 4), 5));
                        }
                        e10 = cVar.e("gcm.n.click_action");
                        if (TextUtils.isEmpty(e10)) {
                            String e17 = cVar.e("gcm.n.link_android");
                            if (TextUtils.isEmpty(e17)) {
                                e17 = cVar.e("gcm.n.link");
                            }
                            Uri parse = !TextUtils.isEmpty(e17) ? Uri.parse(e17) : null;
                            if (parse != null) {
                                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                                launchIntentForPackage.setPackage(packageName);
                                launchIntentForPackage.setData(parse);
                            } else {
                                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                                if (launchIntentForPackage == null) {
                                    Log.w("FirebaseMessaging", "No activity found to launch app");
                                }
                            }
                        } else {
                            launchIntentForPackage = new Intent(e10);
                            launchIntentForPackage.setPackage(packageName);
                            launchIntentForPackage.setFlags(TLObject.FLAG_28);
                        }
                        AtomicInteger atomicInteger = a;
                        if (launchIntentForPackage == null) {
                            activity = null;
                        } else {
                            launchIntentForPackage.addFlags(67108864);
                            Bundle bundle3 = cVar.a;
                            Bundle bundle4 = new Bundle(bundle3);
                            for (String str : bundle3.keySet()) {
                                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                    bundle4.remove(str);
                                }
                            }
                            launchIntentForPackage.putExtras(bundle4);
                            if (cVar.a("google.c.a.e")) {
                                launchIntentForPackage.putExtra("gcm.n.analytics_data", cVar.g());
                            }
                            activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, Build.VERSION.SDK_INT >= 23 ? 1140850688 : TLObject.FLAG_30);
                        }
                        tVar.g = activity;
                        if (cVar.a("google.c.a.e")) {
                            broadcast = PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(cVar.g())), Build.VERSION.SDK_INT >= 23 ? 1140850688 : TLObject.FLAG_30);
                        } else {
                            broadcast = null;
                        }
                        if (broadcast != null) {
                            tVar.E.deleteIntent = broadcast;
                        }
                        e11 = cVar.e("gcm.n.color");
                        if (!TextUtils.isEmpty(e11)) {
                            try {
                                valueOf = Integer.valueOf(Color.parseColor(e11));
                            } catch (IllegalArgumentException unused) {
                                Log.w("FirebaseMessaging", "Color is invalid: " + e11 + ". Notification will use default color.");
                            }
                            if (valueOf != null) {
                                tVar.w = valueOf.intValue();
                            }
                            tVar.h(16, !cVar.a("gcm.n.sticky"));
                            tVar.t = cVar.a("gcm.n.local_only");
                            e12 = cVar.e("gcm.n.ticker");
                            if (e12 != null) {
                                tVar.p(e12);
                            }
                            b10 = cVar.b("gcm.n.notification_priority");
                            if (b10 != null) {
                                if (b10.intValue() < -2 || b10.intValue() > 2) {
                                    Log.w("FirebaseMessaging", "notificationPriority is invalid " + b10 + ". Skipping setting notificationPriority.");
                                }
                                if (b10 != null) {
                                    tVar.j = b10.intValue();
                                }
                                b11 = cVar.b("gcm.n.visibility");
                                if (b11 != null) {
                                    if (b11.intValue() < -1 || b11.intValue() > 1) {
                                        Log.w("NotificationParams", "visibility is invalid: " + b11 + ". Skipping setting visibility.");
                                    }
                                    if (b11 != null) {
                                        tVar.x = b11.intValue();
                                    }
                                    b12 = cVar.b("gcm.n.notification_count");
                                    if (b12 != null) {
                                        if (b12.intValue() < 0) {
                                            Log.w("FirebaseMessaging", "notificationCount is invalid: " + b12 + ". Skipping setting notificationCount.");
                                        }
                                        if (b12 != null) {
                                            tVar.i = b12.intValue();
                                        }
                                        e13 = cVar.e("gcm.n.event_time");
                                        if (!TextUtils.isEmpty(e13)) {
                                            try {
                                                valueOf2 = Long.valueOf(Long.parseLong(e13));
                                            } catch (NumberFormatException unused2) {
                                                Log.w("NotificationParams", "Couldn't parse value of " + android.support.v4.media.c.k("gcm.n.event_time") + "(" + e13 + ") into a long");
                                            }
                                            if (valueOf2 != null) {
                                                tVar.k = true;
                                                tVar.E.when = valueOf2.longValue();
                                            }
                                            c10 = cVar.c("gcm.n.vibrate_timings");
                                            if (c10 != null) {
                                                try {
                                                } catch (NumberFormatException | JSONException unused3) {
                                                    Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + c10 + ". Skipping setting vibrateTimings.");
                                                }
                                                if (c10.length() <= 1) {
                                                    throw new JSONException("vibrateTimings have invalid length");
                                                }
                                                int length = c10.length();
                                                jArr = new long[length];
                                                for (int i13 = 0; i13 < length; i13++) {
                                                    jArr[i13] = c10.optLong(i13);
                                                }
                                                if (jArr != null) {
                                                    tVar.E.vibrate = jArr;
                                                }
                                                c11 = cVar.c("gcm.n.light_settings");
                                                if (c11 != null) {
                                                    int[] iArr2 = new int[3];
                                                    try {
                                                    } catch (IllegalArgumentException e18) {
                                                        Log.w("NotificationParams", "LightSettings is invalid: " + c11 + ". " + e18.getMessage() + ". Skipping setting LightSettings");
                                                    } catch (JSONException unused4) {
                                                        Log.w("NotificationParams", "LightSettings is invalid: " + c11 + ". Skipping setting LightSettings");
                                                    }
                                                    if (c11.length() != 3) {
                                                        throw new JSONException("lightSettings don't have all three fields");
                                                    }
                                                    int parseColor = Color.parseColor(c11.optString(0));
                                                    if (parseColor == -16777216) {
                                                        throw new IllegalArgumentException("Transparent color is invalid");
                                                    }
                                                    iArr2[0] = parseColor;
                                                    iArr2[1] = c11.optInt(1);
                                                    iArr2[2] = c11.optInt(2);
                                                    iArr = iArr2;
                                                    if (iArr != null) {
                                                        int i14 = iArr[0];
                                                        int i15 = iArr[1];
                                                        int i16 = iArr[2];
                                                        Notification notification2 = tVar.E;
                                                        notification2.ledARGB = i14;
                                                        notification2.ledOnMS = i15;
                                                        notification2.ledOffMS = i16;
                                                        if (i15 != 0 && i16 != 0) {
                                                            i12 = 1;
                                                        }
                                                        notification2.flags = (notification2.flags & (-2)) | i12;
                                                    }
                                                    boolean a2 = cVar.a("gcm.n.default_sound");
                                                    boolean z10 = a2;
                                                    if (cVar.a("gcm.n.default_vibrate_timings")) {
                                                        z10 = (a2 ? 1 : 0) | 2;
                                                    }
                                                    r02 = z10;
                                                    if (cVar.a("gcm.n.default_light_settings")) {
                                                        r02 = (z10 ? 1 : 0) | 4;
                                                    }
                                                    Notification notification3 = tVar.E;
                                                    notification3.defaults = r02;
                                                    if ((r02 & 4) != 0) {
                                                        notification3.flags |= 1;
                                                    }
                                                    e14 = cVar.e("gcm.n.tag");
                                                    if (TextUtils.isEmpty(e14)) {
                                                        e14 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                                    }
                                                    return new j(tVar, e14);
                                                }
                                                iArr = null;
                                                if (iArr != null) {
                                                }
                                                boolean a22 = cVar.a("gcm.n.default_sound");
                                                boolean z102 = a22;
                                                if (cVar.a("gcm.n.default_vibrate_timings")) {
                                                }
                                                r02 = z102;
                                                if (cVar.a("gcm.n.default_light_settings")) {
                                                }
                                                Notification notification32 = tVar.E;
                                                notification32.defaults = r02;
                                                if ((r02 & 4) != 0) {
                                                }
                                                e14 = cVar.e("gcm.n.tag");
                                                if (TextUtils.isEmpty(e14)) {
                                                }
                                                return new j(tVar, e14);
                                            }
                                            jArr = null;
                                            if (jArr != null) {
                                            }
                                            c11 = cVar.c("gcm.n.light_settings");
                                            if (c11 != null) {
                                            }
                                            iArr = null;
                                            if (iArr != null) {
                                            }
                                            boolean a222 = cVar.a("gcm.n.default_sound");
                                            boolean z1022 = a222;
                                            if (cVar.a("gcm.n.default_vibrate_timings")) {
                                            }
                                            r02 = z1022;
                                            if (cVar.a("gcm.n.default_light_settings")) {
                                            }
                                            Notification notification322 = tVar.E;
                                            notification322.defaults = r02;
                                            if ((r02 & 4) != 0) {
                                            }
                                            e14 = cVar.e("gcm.n.tag");
                                            if (TextUtils.isEmpty(e14)) {
                                            }
                                            return new j(tVar, e14);
                                        }
                                        valueOf2 = null;
                                        if (valueOf2 != null) {
                                        }
                                        c10 = cVar.c("gcm.n.vibrate_timings");
                                        if (c10 != null) {
                                        }
                                        jArr = null;
                                        if (jArr != null) {
                                        }
                                        c11 = cVar.c("gcm.n.light_settings");
                                        if (c11 != null) {
                                        }
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                        boolean a2222 = cVar.a("gcm.n.default_sound");
                                        boolean z10222 = a2222;
                                        if (cVar.a("gcm.n.default_vibrate_timings")) {
                                        }
                                        r02 = z10222;
                                        if (cVar.a("gcm.n.default_light_settings")) {
                                        }
                                        Notification notification3222 = tVar.E;
                                        notification3222.defaults = r02;
                                        if ((r02 & 4) != 0) {
                                        }
                                        e14 = cVar.e("gcm.n.tag");
                                        if (TextUtils.isEmpty(e14)) {
                                        }
                                        return new j(tVar, e14);
                                    }
                                    b12 = null;
                                    if (b12 != null) {
                                    }
                                    e13 = cVar.e("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(e13)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    c10 = cVar.c("gcm.n.vibrate_timings");
                                    if (c10 != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    c11 = cVar.c("gcm.n.light_settings");
                                    if (c11 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean a22222 = cVar.a("gcm.n.default_sound");
                                    boolean z102222 = a22222;
                                    if (cVar.a("gcm.n.default_vibrate_timings")) {
                                    }
                                    r02 = z102222;
                                    if (cVar.a("gcm.n.default_light_settings")) {
                                    }
                                    Notification notification32222 = tVar.E;
                                    notification32222.defaults = r02;
                                    if ((r02 & 4) != 0) {
                                    }
                                    e14 = cVar.e("gcm.n.tag");
                                    if (TextUtils.isEmpty(e14)) {
                                    }
                                    return new j(tVar, e14);
                                }
                                b11 = null;
                                if (b11 != null) {
                                }
                                b12 = cVar.b("gcm.n.notification_count");
                                if (b12 != null) {
                                }
                                b12 = null;
                                if (b12 != null) {
                                }
                                e13 = cVar.e("gcm.n.event_time");
                                if (!TextUtils.isEmpty(e13)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                c10 = cVar.c("gcm.n.vibrate_timings");
                                if (c10 != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                c11 = cVar.c("gcm.n.light_settings");
                                if (c11 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean a222222 = cVar.a("gcm.n.default_sound");
                                boolean z1022222 = a222222;
                                if (cVar.a("gcm.n.default_vibrate_timings")) {
                                }
                                r02 = z1022222;
                                if (cVar.a("gcm.n.default_light_settings")) {
                                }
                                Notification notification322222 = tVar.E;
                                notification322222.defaults = r02;
                                if ((r02 & 4) != 0) {
                                }
                                e14 = cVar.e("gcm.n.tag");
                                if (TextUtils.isEmpty(e14)) {
                                }
                                return new j(tVar, e14);
                            }
                            b10 = null;
                            if (b10 != null) {
                            }
                            b11 = cVar.b("gcm.n.visibility");
                            if (b11 != null) {
                            }
                            b11 = null;
                            if (b11 != null) {
                            }
                            b12 = cVar.b("gcm.n.notification_count");
                            if (b12 != null) {
                            }
                            b12 = null;
                            if (b12 != null) {
                            }
                            e13 = cVar.e("gcm.n.event_time");
                            if (!TextUtils.isEmpty(e13)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            c10 = cVar.c("gcm.n.vibrate_timings");
                            if (c10 != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            c11 = cVar.c("gcm.n.light_settings");
                            if (c11 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean a2222222 = cVar.a("gcm.n.default_sound");
                            boolean z10222222 = a2222222;
                            if (cVar.a("gcm.n.default_vibrate_timings")) {
                            }
                            r02 = z10222222;
                            if (cVar.a("gcm.n.default_light_settings")) {
                            }
                            Notification notification3222222 = tVar.E;
                            notification3222222.defaults = r02;
                            if ((r02 & 4) != 0) {
                            }
                            e14 = cVar.e("gcm.n.tag");
                            if (TextUtils.isEmpty(e14)) {
                            }
                            return new j(tVar, e14);
                        }
                        i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i11 != 0) {
                            try {
                                valueOf = Integer.valueOf(f0.e.c(firebaseMessagingService, i11));
                            } catch (Resources.NotFoundException unused5) {
                                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                            }
                            if (valueOf != null) {
                            }
                            tVar.h(16, !cVar.a("gcm.n.sticky"));
                            tVar.t = cVar.a("gcm.n.local_only");
                            e12 = cVar.e("gcm.n.ticker");
                            if (e12 != null) {
                            }
                            b10 = cVar.b("gcm.n.notification_priority");
                            if (b10 != null) {
                            }
                            b10 = null;
                            if (b10 != null) {
                            }
                            b11 = cVar.b("gcm.n.visibility");
                            if (b11 != null) {
                            }
                            b11 = null;
                            if (b11 != null) {
                            }
                            b12 = cVar.b("gcm.n.notification_count");
                            if (b12 != null) {
                            }
                            b12 = null;
                            if (b12 != null) {
                            }
                            e13 = cVar.e("gcm.n.event_time");
                            if (!TextUtils.isEmpty(e13)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            c10 = cVar.c("gcm.n.vibrate_timings");
                            if (c10 != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            c11 = cVar.c("gcm.n.light_settings");
                            if (c11 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean a22222222 = cVar.a("gcm.n.default_sound");
                            boolean z102222222 = a22222222;
                            if (cVar.a("gcm.n.default_vibrate_timings")) {
                            }
                            r02 = z102222222;
                            if (cVar.a("gcm.n.default_light_settings")) {
                            }
                            Notification notification32222222 = tVar.E;
                            notification32222222.defaults = r02;
                            if ((r02 & 4) != 0) {
                            }
                            e14 = cVar.e("gcm.n.tag");
                            if (TextUtils.isEmpty(e14)) {
                            }
                            return new j(tVar, e14);
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        tVar.h(16, !cVar.a("gcm.n.sticky"));
                        tVar.t = cVar.a("gcm.n.local_only");
                        e12 = cVar.e("gcm.n.ticker");
                        if (e12 != null) {
                        }
                        b10 = cVar.b("gcm.n.notification_priority");
                        if (b10 != null) {
                        }
                        b10 = null;
                        if (b10 != null) {
                        }
                        b11 = cVar.b("gcm.n.visibility");
                        if (b11 != null) {
                        }
                        b11 = null;
                        if (b11 != null) {
                        }
                        b12 = cVar.b("gcm.n.notification_count");
                        if (b12 != null) {
                        }
                        b12 = null;
                        if (b12 != null) {
                        }
                        e13 = cVar.e("gcm.n.event_time");
                        if (!TextUtils.isEmpty(e13)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        c10 = cVar.c("gcm.n.vibrate_timings");
                        if (c10 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        c11 = cVar.c("gcm.n.light_settings");
                        if (c11 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean a222222222 = cVar.a("gcm.n.default_sound");
                        boolean z1022222222 = a222222222;
                        if (cVar.a("gcm.n.default_vibrate_timings")) {
                        }
                        r02 = z1022222222;
                        if (cVar.a("gcm.n.default_light_settings")) {
                        }
                        Notification notification322222222 = tVar.E;
                        notification322222222.defaults = r02;
                        if ((r02 & 4) != 0) {
                        }
                        e14 = cVar.e("gcm.n.tag");
                        if (TextUtils.isEmpty(e14)) {
                        }
                        return new j(tVar, e14);
                    }
                    i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i10 != 0 || !b(resources, i10)) {
                        i10 = packageManager.getApplicationInfo(packageName, 0).icon;
                    }
                    if (i10 != 0 || !b(resources, i10)) {
                        i10 = R.drawable.sym_def_app_icon;
                    }
                    tVar.E.icon = i10;
                    e7 = cVar.e("gcm.n.sound2");
                    if (TextUtils.isEmpty(e7)) {
                    }
                    if (TextUtils.isEmpty(e7)) {
                    }
                    if (defaultUri != null) {
                    }
                    e10 = cVar.e("gcm.n.click_action");
                    if (TextUtils.isEmpty(e10)) {
                    }
                    AtomicInteger atomicInteger2 = a;
                    if (launchIntentForPackage == null) {
                    }
                    tVar.g = activity;
                    if (cVar.a("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    e11 = cVar.e("gcm.n.color");
                    if (!TextUtils.isEmpty(e11)) {
                    }
                    i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i11 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    tVar.h(16, !cVar.a("gcm.n.sticky"));
                    tVar.t = cVar.a("gcm.n.local_only");
                    e12 = cVar.e("gcm.n.ticker");
                    if (e12 != null) {
                    }
                    b10 = cVar.b("gcm.n.notification_priority");
                    if (b10 != null) {
                    }
                    b10 = null;
                    if (b10 != null) {
                    }
                    b11 = cVar.b("gcm.n.visibility");
                    if (b11 != null) {
                    }
                    b11 = null;
                    if (b11 != null) {
                    }
                    b12 = cVar.b("gcm.n.notification_count");
                    if (b12 != null) {
                    }
                    b12 = null;
                    if (b12 != null) {
                    }
                    e13 = cVar.e("gcm.n.event_time");
                    if (!TextUtils.isEmpty(e13)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    c10 = cVar.c("gcm.n.vibrate_timings");
                    if (c10 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    c11 = cVar.c("gcm.n.light_settings");
                    if (c11 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean a2222222222 = cVar.a("gcm.n.default_sound");
                    boolean z10222222222 = a2222222222;
                    if (cVar.a("gcm.n.default_vibrate_timings")) {
                    }
                    r02 = z10222222222;
                    if (cVar.a("gcm.n.default_light_settings")) {
                    }
                    Notification notification3222222222 = tVar.E;
                    notification3222222222.defaults = r02;
                    if ((r02 & 4) != 0) {
                    }
                    e14 = cVar.e("gcm.n.tag");
                    if (TextUtils.isEmpty(e14)) {
                    }
                    return new j(tVar, e14);
                }
                e16 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(e16)) {
                    if (notificationManager.getNotificationChannel(e16) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources2 = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    e0.t tVar2 = new e0.t(firebaseMessagingService, e16);
                    d = cVar.d(resources2, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(d)) {
                    }
                    d10 = cVar.d(resources2, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(d10)) {
                    }
                    e = cVar.e("gcm.n.icon");
                    if (!TextUtils.isEmpty(e)) {
                    }
                    i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i10 != 0) {
                    }
                    i10 = packageManager.getApplicationInfo(packageName, 0).icon;
                    if (i10 != 0) {
                    }
                    i10 = R.drawable.sym_def_app_icon;
                    tVar2.E.icon = i10;
                    e7 = cVar.e("gcm.n.sound2");
                    if (TextUtils.isEmpty(e7)) {
                    }
                    if (TextUtils.isEmpty(e7)) {
                    }
                    if (defaultUri != null) {
                    }
                    e10 = cVar.e("gcm.n.click_action");
                    if (TextUtils.isEmpty(e10)) {
                    }
                    AtomicInteger atomicInteger22 = a;
                    if (launchIntentForPackage == null) {
                    }
                    tVar2.g = activity;
                    if (cVar.a("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    e11 = cVar.e("gcm.n.color");
                    if (!TextUtils.isEmpty(e11)) {
                    }
                    i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i11 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    tVar2.h(16, !cVar.a("gcm.n.sticky"));
                    tVar2.t = cVar.a("gcm.n.local_only");
                    e12 = cVar.e("gcm.n.ticker");
                    if (e12 != null) {
                    }
                    b10 = cVar.b("gcm.n.notification_priority");
                    if (b10 != null) {
                    }
                    b10 = null;
                    if (b10 != null) {
                    }
                    b11 = cVar.b("gcm.n.visibility");
                    if (b11 != null) {
                    }
                    b11 = null;
                    if (b11 != null) {
                    }
                    b12 = cVar.b("gcm.n.notification_count");
                    if (b12 != null) {
                    }
                    b12 = null;
                    if (b12 != null) {
                    }
                    e13 = cVar.e("gcm.n.event_time");
                    if (!TextUtils.isEmpty(e13)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    c10 = cVar.c("gcm.n.vibrate_timings");
                    if (c10 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    c11 = cVar.c("gcm.n.light_settings");
                    if (c11 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean a22222222222 = cVar.a("gcm.n.default_sound");
                    boolean z102222222222 = a22222222222;
                    if (cVar.a("gcm.n.default_vibrate_timings")) {
                    }
                    r02 = z102222222222;
                    if (cVar.a("gcm.n.default_light_settings")) {
                    }
                    Notification notification32222222222 = tVar2.E;
                    notification32222222222.defaults = r02;
                    if ((r02 & 4) != 0) {
                    }
                    e14 = cVar.e("gcm.n.tag");
                    if (TextUtils.isEmpty(e14)) {
                    }
                    return new j(tVar2, e14);
                }
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                e16 = "fcm_fallback_notification_channel";
                if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                    int identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                    if (identifier == 0) {
                        Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                        string = "Misc";
                    } else {
                        string = firebaseMessagingService.getString(identifier);
                    }
                    notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                }
                packageName = firebaseMessagingService.getPackageName();
                Resources resources22 = firebaseMessagingService.getResources();
                packageManager = firebaseMessagingService.getPackageManager();
                e0.t tVar22 = new e0.t(firebaseMessagingService, e16);
                d = cVar.d(resources22, packageName, "gcm.n.title");
                if (!TextUtils.isEmpty(d)) {
                }
                d10 = cVar.d(resources22, packageName, "gcm.n.body");
                if (!TextUtils.isEmpty(d10)) {
                }
                e = cVar.e("gcm.n.icon");
                if (!TextUtils.isEmpty(e)) {
                }
                i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                if (i10 != 0) {
                }
                i10 = packageManager.getApplicationInfo(packageName, 0).icon;
                if (i10 != 0) {
                }
                i10 = R.drawable.sym_def_app_icon;
                tVar22.E.icon = i10;
                e7 = cVar.e("gcm.n.sound2");
                if (TextUtils.isEmpty(e7)) {
                }
                if (TextUtils.isEmpty(e7)) {
                }
                if (defaultUri != null) {
                }
                e10 = cVar.e("gcm.n.click_action");
                if (TextUtils.isEmpty(e10)) {
                }
                AtomicInteger atomicInteger222 = a;
                if (launchIntentForPackage == null) {
                }
                tVar22.g = activity;
                if (cVar.a("google.c.a.e")) {
                }
                if (broadcast != null) {
                }
                e11 = cVar.e("gcm.n.color");
                if (!TextUtils.isEmpty(e11)) {
                }
                i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i11 != 0) {
                }
                valueOf = null;
                if (valueOf != null) {
                }
                tVar22.h(16, !cVar.a("gcm.n.sticky"));
                tVar22.t = cVar.a("gcm.n.local_only");
                e12 = cVar.e("gcm.n.ticker");
                if (e12 != null) {
                }
                b10 = cVar.b("gcm.n.notification_priority");
                if (b10 != null) {
                }
                b10 = null;
                if (b10 != null) {
                }
                b11 = cVar.b("gcm.n.visibility");
                if (b11 != null) {
                }
                b11 = null;
                if (b11 != null) {
                }
                b12 = cVar.b("gcm.n.notification_count");
                if (b12 != null) {
                }
                b12 = null;
                if (b12 != null) {
                }
                e13 = cVar.e("gcm.n.event_time");
                if (!TextUtils.isEmpty(e13)) {
                }
                valueOf2 = null;
                if (valueOf2 != null) {
                }
                c10 = cVar.c("gcm.n.vibrate_timings");
                if (c10 != null) {
                }
                jArr = null;
                if (jArr != null) {
                }
                c11 = cVar.c("gcm.n.light_settings");
                if (c11 != null) {
                }
                iArr = null;
                if (iArr != null) {
                }
                boolean a222222222222 = cVar.a("gcm.n.default_sound");
                boolean z1022222222222 = a222222222222;
                if (cVar.a("gcm.n.default_vibrate_timings")) {
                }
                r02 = z1022222222222;
                if (cVar.a("gcm.n.default_light_settings")) {
                }
                Notification notification322222222222 = tVar22.E;
                notification322222222222.defaults = r02;
                if ((r02 & 4) != 0) {
                }
                e14 = cVar.e("gcm.n.tag");
                if (TextUtils.isEmpty(e14)) {
                }
                return new j(tVar22, e14);
            }
        }
        e16 = null;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources222 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        e0.t tVar222 = new e0.t(firebaseMessagingService, e16);
        d = cVar.d(resources222, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(d)) {
        }
        d10 = cVar.d(resources222, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(d10)) {
        }
        e = cVar.e("gcm.n.icon");
        if (!TextUtils.isEmpty(e)) {
        }
        i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 != 0) {
        }
        i10 = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i10 != 0) {
        }
        i10 = R.drawable.sym_def_app_icon;
        tVar222.E.icon = i10;
        e7 = cVar.e("gcm.n.sound2");
        if (TextUtils.isEmpty(e7)) {
        }
        if (TextUtils.isEmpty(e7)) {
        }
        if (defaultUri != null) {
        }
        e10 = cVar.e("gcm.n.click_action");
        if (TextUtils.isEmpty(e10)) {
        }
        AtomicInteger atomicInteger2222 = a;
        if (launchIntentForPackage == null) {
        }
        tVar222.g = activity;
        if (cVar.a("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        e11 = cVar.e("gcm.n.color");
        if (!TextUtils.isEmpty(e11)) {
        }
        i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i11 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        tVar222.h(16, !cVar.a("gcm.n.sticky"));
        tVar222.t = cVar.a("gcm.n.local_only");
        e12 = cVar.e("gcm.n.ticker");
        if (e12 != null) {
        }
        b10 = cVar.b("gcm.n.notification_priority");
        if (b10 != null) {
        }
        b10 = null;
        if (b10 != null) {
        }
        b11 = cVar.b("gcm.n.visibility");
        if (b11 != null) {
        }
        b11 = null;
        if (b11 != null) {
        }
        b12 = cVar.b("gcm.n.notification_count");
        if (b12 != null) {
        }
        b12 = null;
        if (b12 != null) {
        }
        e13 = cVar.e("gcm.n.event_time");
        if (!TextUtils.isEmpty(e13)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        c10 = cVar.c("gcm.n.vibrate_timings");
        if (c10 != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        c11 = cVar.c("gcm.n.light_settings");
        if (c11 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean a2222222222222 = cVar.a("gcm.n.default_sound");
        boolean z10222222222222 = a2222222222222;
        if (cVar.a("gcm.n.default_vibrate_timings")) {
        }
        r02 = z10222222222222;
        if (cVar.a("gcm.n.default_light_settings")) {
        }
        Notification notification3222222222222 = tVar222.E;
        notification3222222222222.defaults = r02;
        if ((r02 & 4) != 0) {
        }
        e14 = cVar.e("gcm.n.tag");
        if (TextUtils.isEmpty(e14)) {
        }
        return new j(tVar222, e14);
    }

    public static boolean b(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i10, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
            return false;
        }
    }
}
