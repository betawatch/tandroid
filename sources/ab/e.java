package ab;

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
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class e {
    public static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX WARN: Can't wrap try/catch for region: R(77:0|1|2|3|(1:5)|231|7|8|(3:207|208|(73:210|(66:212|(1:214)|11|(1:13)|14|(1:16)|17|(57:19|(1:193)|23|(1:25)|26|(1:28)(2:183|(1:188)(1:187))|29|(1:31)|32|(1:34)(5:171|(1:173)|174|(1:176)(1:182)|(1:178)(2:179|(1:181)))|35|(1:37)(6:153|(4:156|(2:164|165)(1:162)|163|154)|166|167|(1:169)|170)|38|(1:40)(1:152)|(1:42)|43|(39:148|149|(1:49)|50|(1:52)|53|(33:139|(1:143)|(1:57)|58|(29:134|(1:138)|(1:62)|63|(25:131|(1:133)|(1:67)|68|(21:127|128|(1:72)|73|(3:117|118|(18:120|(1:122)|123|(1:77)|78|(4:102|103|104|(2:106|(12:108|(3:82|(1:85)|86)|87|(1:89)|90|(1:92)|93|(1:95)|96|(1:98)|99|100)(2:109|110))(2:111|112))|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)(2:124|125))|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|45|(39:144|145|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|194|(2:202|203)|(1:201)|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|215|(69:217|(1:219)|11|(0)|14|(0)|17|(0)|194|(1:196)|202|203|(1:199)|201|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)(1:227)|220|(3:222|(1:224)(1:226)|225)|11|(0)|14|(0)|17|(0)|194|(0)|202|203|(0)|201|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100))|10|11|(0)|14|(0)|17|(0)|194|(0)|202|203|(0)|201|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100) */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x015d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x015e, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r0 != null) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x042e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x030d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0533  */
    /* JADX WARN: Type inference failed for: r0v103, types: [int] */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v149 */
    /* JADX WARN: Type inference failed for: r0v150 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k a(FirebaseMessagingService firebaseMessagingService, w wVar) {
        Bundle bundle;
        String string;
        String packageName;
        PackageManager packageManager;
        String d;
        String d2;
        String e10;
        int i7;
        String e11;
        Uri defaultUri;
        String e12;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String e13;
        Integer valueOf;
        String e14;
        Integer b10;
        Integer b11;
        Integer b12;
        String e15;
        Long valueOf2;
        JSONArray c10;
        long[] jArr;
        JSONArray c11;
        int[] iArr;
        ?? r02;
        String e16;
        int i10;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
        } catch (PackageManager.NameNotFoundException e17) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e17);
        }
        bundle = Bundle.EMPTY;
        Bundle bundle2 = bundle;
        String e18 = wVar.e("gcm.n.android_channel_id");
        int i11 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(e18)) {
                    if (notificationManager.getNotificationChannel(e18) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + e18 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    }
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    e0.q qVar = new e0.q(firebaseMessagingService, e18);
                    d = wVar.d(resources, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(d)) {
                        qVar.g(d);
                    }
                    d2 = wVar.d(resources, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(d2)) {
                        qVar.f(d2);
                        e0.l lVar = new e0.l(false);
                        lVar.f = e0.q.d(d2);
                        qVar.n(lVar);
                    }
                    e10 = wVar.e("gcm.n.icon");
                    if (!TextUtils.isEmpty(e10)) {
                        i7 = resources.getIdentifier(e10, "drawable", packageName);
                        if ((i7 == 0 || !b(resources, i7)) && ((i7 = resources.getIdentifier(e10, "mipmap", packageName)) == 0 || !b(resources, i7))) {
                            Log.w("FirebaseMessaging", "Icon resource " + e10 + " not found. Notification will use default icon.");
                        }
                        qVar.F.icon = i7;
                        e11 = wVar.e("gcm.n.sound2");
                        if (TextUtils.isEmpty(e11)) {
                            e11 = wVar.e("gcm.n.sound");
                        }
                        if (TextUtils.isEmpty(e11)) {
                            defaultUri = null;
                        } else if ("default".equals(e11) || resources.getIdentifier(e11, "raw", packageName) == 0) {
                            defaultUri = RingtoneManager.getDefaultUri(2);
                        } else {
                            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + e11);
                        }
                        if (defaultUri != null) {
                            Notification notification = qVar.F;
                            notification.sound = defaultUri;
                            notification.audioStreamType = -1;
                            notification.audioAttributes = e0.p.a(e0.p.e(e0.p.c(e0.p.b(), 4), 5));
                        }
                        e12 = wVar.e("gcm.n.click_action");
                        if (TextUtils.isEmpty(e12)) {
                            String e19 = wVar.e("gcm.n.link_android");
                            if (TextUtils.isEmpty(e19)) {
                                e19 = wVar.e("gcm.n.link");
                            }
                            Uri parse = !TextUtils.isEmpty(e19) ? Uri.parse(e19) : null;
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
                            launchIntentForPackage = new Intent(e12);
                            launchIntentForPackage.setPackage(packageName);
                            launchIntentForPackage.setFlags(TLObject.FLAG_28);
                        }
                        AtomicInteger atomicInteger = a;
                        if (launchIntentForPackage == null) {
                            activity = null;
                        } else {
                            launchIntentForPackage.addFlags(67108864);
                            Bundle bundle3 = wVar.a;
                            Bundle bundle4 = new Bundle(bundle3);
                            for (String str : bundle3.keySet()) {
                                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                    bundle4.remove(str);
                                }
                            }
                            launchIntentForPackage.putExtras(bundle4);
                            if (wVar.a("google.c.a.e")) {
                                launchIntentForPackage.putExtra("gcm.n.analytics_data", wVar.g());
                            }
                            activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
                        }
                        qVar.g = activity;
                        broadcast = !wVar.a("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(wVar.g())), 1140850688);
                        if (broadcast != null) {
                            qVar.F.deleteIntent = broadcast;
                        }
                        e13 = wVar.e("gcm.n.color");
                        if (!TextUtils.isEmpty(e13)) {
                            try {
                                valueOf = Integer.valueOf(Color.parseColor(e13));
                            } catch (IllegalArgumentException unused) {
                                Log.w("FirebaseMessaging", "Color is invalid: " + e13 + ". Notification will use default color.");
                            }
                            if (valueOf != null) {
                                qVar.w = valueOf.intValue();
                            }
                            qVar.h(16, !wVar.a("gcm.n.sticky"));
                            qVar.t = wVar.a("gcm.n.local_only");
                            e14 = wVar.e("gcm.n.ticker");
                            if (e14 != null) {
                                qVar.p(e14);
                            }
                            b10 = wVar.b("gcm.n.notification_priority");
                            if (b10 != null) {
                                if (b10.intValue() < -2 || b10.intValue() > 2) {
                                    Log.w("FirebaseMessaging", "notificationPriority is invalid " + b10 + ". Skipping setting notificationPriority.");
                                }
                                if (b10 != null) {
                                    qVar.j = b10.intValue();
                                }
                                b11 = wVar.b("gcm.n.visibility");
                                if (b11 != null) {
                                    if (b11.intValue() < -1 || b11.intValue() > 1) {
                                        Log.w("NotificationParams", "visibility is invalid: " + b11 + ". Skipping setting visibility.");
                                    }
                                    if (b11 != null) {
                                        qVar.x = b11.intValue();
                                    }
                                    b12 = wVar.b("gcm.n.notification_count");
                                    if (b12 != null) {
                                        if (b12.intValue() < 0) {
                                            Log.w("FirebaseMessaging", "notificationCount is invalid: " + b12 + ". Skipping setting notificationCount.");
                                        }
                                        if (b12 != null) {
                                            qVar.i = b12.intValue();
                                        }
                                        e15 = wVar.e("gcm.n.event_time");
                                        if (!TextUtils.isEmpty(e15)) {
                                            try {
                                                valueOf2 = Long.valueOf(Long.parseLong(e15));
                                            } catch (NumberFormatException unused2) {
                                                Log.w("NotificationParams", "Couldn't parse value of " + w.k("gcm.n.event_time") + "(" + e15 + ") into a long");
                                            }
                                            if (valueOf2 != null) {
                                                qVar.k = true;
                                                qVar.F.when = valueOf2.longValue();
                                            }
                                            c10 = wVar.c("gcm.n.vibrate_timings");
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
                                                for (int i12 = 0; i12 < length; i12++) {
                                                    jArr[i12] = c10.optLong(i12);
                                                }
                                                if (jArr != null) {
                                                    qVar.F.vibrate = jArr;
                                                }
                                                c11 = wVar.c("gcm.n.light_settings");
                                                if (c11 != null) {
                                                    int[] iArr2 = new int[3];
                                                    try {
                                                    } catch (IllegalArgumentException e20) {
                                                        Log.w("NotificationParams", "LightSettings is invalid: " + c11 + ". " + e20.getMessage() + ". Skipping setting LightSettings");
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
                                                        int i13 = iArr[0];
                                                        int i14 = iArr[1];
                                                        int i15 = iArr[2];
                                                        Notification notification2 = qVar.F;
                                                        notification2.ledARGB = i13;
                                                        notification2.ledOnMS = i14;
                                                        notification2.ledOffMS = i15;
                                                        if (i14 != 0 && i15 != 0) {
                                                            i11 = 1;
                                                        }
                                                        notification2.flags = (notification2.flags & (-2)) | i11;
                                                    }
                                                    boolean a10 = wVar.a("gcm.n.default_sound");
                                                    boolean z10 = a10;
                                                    if (wVar.a("gcm.n.default_vibrate_timings")) {
                                                        z10 = (a10 ? 1 : 0) | 2;
                                                    }
                                                    r02 = z10;
                                                    if (wVar.a("gcm.n.default_light_settings")) {
                                                        r02 = (z10 ? 1 : 0) | 4;
                                                    }
                                                    Notification notification3 = qVar.F;
                                                    notification3.defaults = r02;
                                                    if ((r02 & 4) != 0) {
                                                        notification3.flags |= 1;
                                                    }
                                                    e16 = wVar.e("gcm.n.tag");
                                                    if (TextUtils.isEmpty(e16)) {
                                                        e16 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                                    }
                                                    return new k(qVar, e16);
                                                }
                                                iArr = null;
                                                if (iArr != null) {
                                                }
                                                boolean a102 = wVar.a("gcm.n.default_sound");
                                                boolean z102 = a102;
                                                if (wVar.a("gcm.n.default_vibrate_timings")) {
                                                }
                                                r02 = z102;
                                                if (wVar.a("gcm.n.default_light_settings")) {
                                                }
                                                Notification notification32 = qVar.F;
                                                notification32.defaults = r02;
                                                if ((r02 & 4) != 0) {
                                                }
                                                e16 = wVar.e("gcm.n.tag");
                                                if (TextUtils.isEmpty(e16)) {
                                                }
                                                return new k(qVar, e16);
                                            }
                                            jArr = null;
                                            if (jArr != null) {
                                            }
                                            c11 = wVar.c("gcm.n.light_settings");
                                            if (c11 != null) {
                                            }
                                            iArr = null;
                                            if (iArr != null) {
                                            }
                                            boolean a1022 = wVar.a("gcm.n.default_sound");
                                            boolean z1022 = a1022;
                                            if (wVar.a("gcm.n.default_vibrate_timings")) {
                                            }
                                            r02 = z1022;
                                            if (wVar.a("gcm.n.default_light_settings")) {
                                            }
                                            Notification notification322 = qVar.F;
                                            notification322.defaults = r02;
                                            if ((r02 & 4) != 0) {
                                            }
                                            e16 = wVar.e("gcm.n.tag");
                                            if (TextUtils.isEmpty(e16)) {
                                            }
                                            return new k(qVar, e16);
                                        }
                                        valueOf2 = null;
                                        if (valueOf2 != null) {
                                        }
                                        c10 = wVar.c("gcm.n.vibrate_timings");
                                        if (c10 != null) {
                                        }
                                        jArr = null;
                                        if (jArr != null) {
                                        }
                                        c11 = wVar.c("gcm.n.light_settings");
                                        if (c11 != null) {
                                        }
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                        boolean a10222 = wVar.a("gcm.n.default_sound");
                                        boolean z10222 = a10222;
                                        if (wVar.a("gcm.n.default_vibrate_timings")) {
                                        }
                                        r02 = z10222;
                                        if (wVar.a("gcm.n.default_light_settings")) {
                                        }
                                        Notification notification3222 = qVar.F;
                                        notification3222.defaults = r02;
                                        if ((r02 & 4) != 0) {
                                        }
                                        e16 = wVar.e("gcm.n.tag");
                                        if (TextUtils.isEmpty(e16)) {
                                        }
                                        return new k(qVar, e16);
                                    }
                                    b12 = null;
                                    if (b12 != null) {
                                    }
                                    e15 = wVar.e("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(e15)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    c10 = wVar.c("gcm.n.vibrate_timings");
                                    if (c10 != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    c11 = wVar.c("gcm.n.light_settings");
                                    if (c11 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean a102222 = wVar.a("gcm.n.default_sound");
                                    boolean z102222 = a102222;
                                    if (wVar.a("gcm.n.default_vibrate_timings")) {
                                    }
                                    r02 = z102222;
                                    if (wVar.a("gcm.n.default_light_settings")) {
                                    }
                                    Notification notification32222 = qVar.F;
                                    notification32222.defaults = r02;
                                    if ((r02 & 4) != 0) {
                                    }
                                    e16 = wVar.e("gcm.n.tag");
                                    if (TextUtils.isEmpty(e16)) {
                                    }
                                    return new k(qVar, e16);
                                }
                                b11 = null;
                                if (b11 != null) {
                                }
                                b12 = wVar.b("gcm.n.notification_count");
                                if (b12 != null) {
                                }
                                b12 = null;
                                if (b12 != null) {
                                }
                                e15 = wVar.e("gcm.n.event_time");
                                if (!TextUtils.isEmpty(e15)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                c10 = wVar.c("gcm.n.vibrate_timings");
                                if (c10 != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                c11 = wVar.c("gcm.n.light_settings");
                                if (c11 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean a1022222 = wVar.a("gcm.n.default_sound");
                                boolean z1022222 = a1022222;
                                if (wVar.a("gcm.n.default_vibrate_timings")) {
                                }
                                r02 = z1022222;
                                if (wVar.a("gcm.n.default_light_settings")) {
                                }
                                Notification notification322222 = qVar.F;
                                notification322222.defaults = r02;
                                if ((r02 & 4) != 0) {
                                }
                                e16 = wVar.e("gcm.n.tag");
                                if (TextUtils.isEmpty(e16)) {
                                }
                                return new k(qVar, e16);
                            }
                            b10 = null;
                            if (b10 != null) {
                            }
                            b11 = wVar.b("gcm.n.visibility");
                            if (b11 != null) {
                            }
                            b11 = null;
                            if (b11 != null) {
                            }
                            b12 = wVar.b("gcm.n.notification_count");
                            if (b12 != null) {
                            }
                            b12 = null;
                            if (b12 != null) {
                            }
                            e15 = wVar.e("gcm.n.event_time");
                            if (!TextUtils.isEmpty(e15)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            c10 = wVar.c("gcm.n.vibrate_timings");
                            if (c10 != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            c11 = wVar.c("gcm.n.light_settings");
                            if (c11 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean a10222222 = wVar.a("gcm.n.default_sound");
                            boolean z10222222 = a10222222;
                            if (wVar.a("gcm.n.default_vibrate_timings")) {
                            }
                            r02 = z10222222;
                            if (wVar.a("gcm.n.default_light_settings")) {
                            }
                            Notification notification3222222 = qVar.F;
                            notification3222222.defaults = r02;
                            if ((r02 & 4) != 0) {
                            }
                            e16 = wVar.e("gcm.n.tag");
                            if (TextUtils.isEmpty(e16)) {
                            }
                            return new k(qVar, e16);
                        }
                        i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i10 != 0) {
                            try {
                                valueOf = Integer.valueOf(firebaseMessagingService.getColor(i10));
                            } catch (Resources.NotFoundException unused5) {
                                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                            }
                            if (valueOf != null) {
                            }
                            qVar.h(16, !wVar.a("gcm.n.sticky"));
                            qVar.t = wVar.a("gcm.n.local_only");
                            e14 = wVar.e("gcm.n.ticker");
                            if (e14 != null) {
                            }
                            b10 = wVar.b("gcm.n.notification_priority");
                            if (b10 != null) {
                            }
                            b10 = null;
                            if (b10 != null) {
                            }
                            b11 = wVar.b("gcm.n.visibility");
                            if (b11 != null) {
                            }
                            b11 = null;
                            if (b11 != null) {
                            }
                            b12 = wVar.b("gcm.n.notification_count");
                            if (b12 != null) {
                            }
                            b12 = null;
                            if (b12 != null) {
                            }
                            e15 = wVar.e("gcm.n.event_time");
                            if (!TextUtils.isEmpty(e15)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            c10 = wVar.c("gcm.n.vibrate_timings");
                            if (c10 != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            c11 = wVar.c("gcm.n.light_settings");
                            if (c11 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean a102222222 = wVar.a("gcm.n.default_sound");
                            boolean z102222222 = a102222222;
                            if (wVar.a("gcm.n.default_vibrate_timings")) {
                            }
                            r02 = z102222222;
                            if (wVar.a("gcm.n.default_light_settings")) {
                            }
                            Notification notification32222222 = qVar.F;
                            notification32222222.defaults = r02;
                            if ((r02 & 4) != 0) {
                            }
                            e16 = wVar.e("gcm.n.tag");
                            if (TextUtils.isEmpty(e16)) {
                            }
                            return new k(qVar, e16);
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        qVar.h(16, !wVar.a("gcm.n.sticky"));
                        qVar.t = wVar.a("gcm.n.local_only");
                        e14 = wVar.e("gcm.n.ticker");
                        if (e14 != null) {
                        }
                        b10 = wVar.b("gcm.n.notification_priority");
                        if (b10 != null) {
                        }
                        b10 = null;
                        if (b10 != null) {
                        }
                        b11 = wVar.b("gcm.n.visibility");
                        if (b11 != null) {
                        }
                        b11 = null;
                        if (b11 != null) {
                        }
                        b12 = wVar.b("gcm.n.notification_count");
                        if (b12 != null) {
                        }
                        b12 = null;
                        if (b12 != null) {
                        }
                        e15 = wVar.e("gcm.n.event_time");
                        if (!TextUtils.isEmpty(e15)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        c10 = wVar.c("gcm.n.vibrate_timings");
                        if (c10 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        c11 = wVar.c("gcm.n.light_settings");
                        if (c11 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean a1022222222 = wVar.a("gcm.n.default_sound");
                        boolean z1022222222 = a1022222222;
                        if (wVar.a("gcm.n.default_vibrate_timings")) {
                        }
                        r02 = z1022222222;
                        if (wVar.a("gcm.n.default_light_settings")) {
                        }
                        Notification notification322222222 = qVar.F;
                        notification322222222.defaults = r02;
                        if ((r02 & 4) != 0) {
                        }
                        e16 = wVar.e("gcm.n.tag");
                        if (TextUtils.isEmpty(e16)) {
                        }
                        return new k(qVar, e16);
                    }
                    i7 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i7 != 0 || !b(resources, i7)) {
                        i7 = packageManager.getApplicationInfo(packageName, 0).icon;
                    }
                    if (i7 != 0 || !b(resources, i7)) {
                        i7 = 17301651;
                    }
                    qVar.F.icon = i7;
                    e11 = wVar.e("gcm.n.sound2");
                    if (TextUtils.isEmpty(e11)) {
                    }
                    if (TextUtils.isEmpty(e11)) {
                    }
                    if (defaultUri != null) {
                    }
                    e12 = wVar.e("gcm.n.click_action");
                    if (TextUtils.isEmpty(e12)) {
                    }
                    AtomicInteger atomicInteger2 = a;
                    if (launchIntentForPackage == null) {
                    }
                    qVar.g = activity;
                    if (!wVar.a("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    e13 = wVar.e("gcm.n.color");
                    if (!TextUtils.isEmpty(e13)) {
                    }
                    i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i10 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    qVar.h(16, !wVar.a("gcm.n.sticky"));
                    qVar.t = wVar.a("gcm.n.local_only");
                    e14 = wVar.e("gcm.n.ticker");
                    if (e14 != null) {
                    }
                    b10 = wVar.b("gcm.n.notification_priority");
                    if (b10 != null) {
                    }
                    b10 = null;
                    if (b10 != null) {
                    }
                    b11 = wVar.b("gcm.n.visibility");
                    if (b11 != null) {
                    }
                    b11 = null;
                    if (b11 != null) {
                    }
                    b12 = wVar.b("gcm.n.notification_count");
                    if (b12 != null) {
                    }
                    b12 = null;
                    if (b12 != null) {
                    }
                    e15 = wVar.e("gcm.n.event_time");
                    if (!TextUtils.isEmpty(e15)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    c10 = wVar.c("gcm.n.vibrate_timings");
                    if (c10 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    c11 = wVar.c("gcm.n.light_settings");
                    if (c11 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean a10222222222 = wVar.a("gcm.n.default_sound");
                    boolean z10222222222 = a10222222222;
                    if (wVar.a("gcm.n.default_vibrate_timings")) {
                    }
                    r02 = z10222222222;
                    if (wVar.a("gcm.n.default_light_settings")) {
                    }
                    Notification notification3222222222 = qVar.F;
                    notification3222222222.defaults = r02;
                    if ((r02 & 4) != 0) {
                    }
                    e16 = wVar.e("gcm.n.tag");
                    if (TextUtils.isEmpty(e16)) {
                    }
                    return new k(qVar, e16);
                }
                e18 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(e18)) {
                    if (notificationManager.getNotificationChannel(e18) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources2 = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    e0.q qVar2 = new e0.q(firebaseMessagingService, e18);
                    d = wVar.d(resources2, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(d)) {
                    }
                    d2 = wVar.d(resources2, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(d2)) {
                    }
                    e10 = wVar.e("gcm.n.icon");
                    if (!TextUtils.isEmpty(e10)) {
                    }
                    i7 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i7 != 0) {
                    }
                    i7 = packageManager.getApplicationInfo(packageName, 0).icon;
                    if (i7 != 0) {
                    }
                    i7 = 17301651;
                    qVar2.F.icon = i7;
                    e11 = wVar.e("gcm.n.sound2");
                    if (TextUtils.isEmpty(e11)) {
                    }
                    if (TextUtils.isEmpty(e11)) {
                    }
                    if (defaultUri != null) {
                    }
                    e12 = wVar.e("gcm.n.click_action");
                    if (TextUtils.isEmpty(e12)) {
                    }
                    AtomicInteger atomicInteger22 = a;
                    if (launchIntentForPackage == null) {
                    }
                    qVar2.g = activity;
                    if (!wVar.a("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    e13 = wVar.e("gcm.n.color");
                    if (!TextUtils.isEmpty(e13)) {
                    }
                    i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i10 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    qVar2.h(16, !wVar.a("gcm.n.sticky"));
                    qVar2.t = wVar.a("gcm.n.local_only");
                    e14 = wVar.e("gcm.n.ticker");
                    if (e14 != null) {
                    }
                    b10 = wVar.b("gcm.n.notification_priority");
                    if (b10 != null) {
                    }
                    b10 = null;
                    if (b10 != null) {
                    }
                    b11 = wVar.b("gcm.n.visibility");
                    if (b11 != null) {
                    }
                    b11 = null;
                    if (b11 != null) {
                    }
                    b12 = wVar.b("gcm.n.notification_count");
                    if (b12 != null) {
                    }
                    b12 = null;
                    if (b12 != null) {
                    }
                    e15 = wVar.e("gcm.n.event_time");
                    if (!TextUtils.isEmpty(e15)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    c10 = wVar.c("gcm.n.vibrate_timings");
                    if (c10 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    c11 = wVar.c("gcm.n.light_settings");
                    if (c11 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean a102222222222 = wVar.a("gcm.n.default_sound");
                    boolean z102222222222 = a102222222222;
                    if (wVar.a("gcm.n.default_vibrate_timings")) {
                    }
                    r02 = z102222222222;
                    if (wVar.a("gcm.n.default_light_settings")) {
                    }
                    Notification notification32222222222 = qVar2.F;
                    notification32222222222.defaults = r02;
                    if ((r02 & 4) != 0) {
                    }
                    e16 = wVar.e("gcm.n.tag");
                    if (TextUtils.isEmpty(e16)) {
                    }
                    return new k(qVar2, e16);
                }
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                e18 = "fcm_fallback_notification_channel";
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
                e0.q qVar22 = new e0.q(firebaseMessagingService, e18);
                d = wVar.d(resources22, packageName, "gcm.n.title");
                if (!TextUtils.isEmpty(d)) {
                }
                d2 = wVar.d(resources22, packageName, "gcm.n.body");
                if (!TextUtils.isEmpty(d2)) {
                }
                e10 = wVar.e("gcm.n.icon");
                if (!TextUtils.isEmpty(e10)) {
                }
                i7 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                if (i7 != 0) {
                }
                i7 = packageManager.getApplicationInfo(packageName, 0).icon;
                if (i7 != 0) {
                }
                i7 = 17301651;
                qVar22.F.icon = i7;
                e11 = wVar.e("gcm.n.sound2");
                if (TextUtils.isEmpty(e11)) {
                }
                if (TextUtils.isEmpty(e11)) {
                }
                if (defaultUri != null) {
                }
                e12 = wVar.e("gcm.n.click_action");
                if (TextUtils.isEmpty(e12)) {
                }
                AtomicInteger atomicInteger222 = a;
                if (launchIntentForPackage == null) {
                }
                qVar22.g = activity;
                if (!wVar.a("google.c.a.e")) {
                }
                if (broadcast != null) {
                }
                e13 = wVar.e("gcm.n.color");
                if (!TextUtils.isEmpty(e13)) {
                }
                i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i10 != 0) {
                }
                valueOf = null;
                if (valueOf != null) {
                }
                qVar22.h(16, !wVar.a("gcm.n.sticky"));
                qVar22.t = wVar.a("gcm.n.local_only");
                e14 = wVar.e("gcm.n.ticker");
                if (e14 != null) {
                }
                b10 = wVar.b("gcm.n.notification_priority");
                if (b10 != null) {
                }
                b10 = null;
                if (b10 != null) {
                }
                b11 = wVar.b("gcm.n.visibility");
                if (b11 != null) {
                }
                b11 = null;
                if (b11 != null) {
                }
                b12 = wVar.b("gcm.n.notification_count");
                if (b12 != null) {
                }
                b12 = null;
                if (b12 != null) {
                }
                e15 = wVar.e("gcm.n.event_time");
                if (!TextUtils.isEmpty(e15)) {
                }
                valueOf2 = null;
                if (valueOf2 != null) {
                }
                c10 = wVar.c("gcm.n.vibrate_timings");
                if (c10 != null) {
                }
                jArr = null;
                if (jArr != null) {
                }
                c11 = wVar.c("gcm.n.light_settings");
                if (c11 != null) {
                }
                iArr = null;
                if (iArr != null) {
                }
                boolean a1022222222222 = wVar.a("gcm.n.default_sound");
                boolean z1022222222222 = a1022222222222;
                if (wVar.a("gcm.n.default_vibrate_timings")) {
                }
                r02 = z1022222222222;
                if (wVar.a("gcm.n.default_light_settings")) {
                }
                Notification notification322222222222 = qVar22.F;
                notification322222222222.defaults = r02;
                if ((r02 & 4) != 0) {
                }
                e16 = wVar.e("gcm.n.tag");
                if (TextUtils.isEmpty(e16)) {
                }
                return new k(qVar22, e16);
            }
        }
        e18 = null;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources222 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        e0.q qVar222 = new e0.q(firebaseMessagingService, e18);
        d = wVar.d(resources222, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(d)) {
        }
        d2 = wVar.d(resources222, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(d2)) {
        }
        e10 = wVar.e("gcm.n.icon");
        if (!TextUtils.isEmpty(e10)) {
        }
        i7 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i7 != 0) {
        }
        i7 = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i7 != 0) {
        }
        i7 = 17301651;
        qVar222.F.icon = i7;
        e11 = wVar.e("gcm.n.sound2");
        if (TextUtils.isEmpty(e11)) {
        }
        if (TextUtils.isEmpty(e11)) {
        }
        if (defaultUri != null) {
        }
        e12 = wVar.e("gcm.n.click_action");
        if (TextUtils.isEmpty(e12)) {
        }
        AtomicInteger atomicInteger2222 = a;
        if (launchIntentForPackage == null) {
        }
        qVar222.g = activity;
        if (!wVar.a("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        e13 = wVar.e("gcm.n.color");
        if (!TextUtils.isEmpty(e13)) {
        }
        i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        qVar222.h(16, !wVar.a("gcm.n.sticky"));
        qVar222.t = wVar.a("gcm.n.local_only");
        e14 = wVar.e("gcm.n.ticker");
        if (e14 != null) {
        }
        b10 = wVar.b("gcm.n.notification_priority");
        if (b10 != null) {
        }
        b10 = null;
        if (b10 != null) {
        }
        b11 = wVar.b("gcm.n.visibility");
        if (b11 != null) {
        }
        b11 = null;
        if (b11 != null) {
        }
        b12 = wVar.b("gcm.n.notification_count");
        if (b12 != null) {
        }
        b12 = null;
        if (b12 != null) {
        }
        e15 = wVar.e("gcm.n.event_time");
        if (!TextUtils.isEmpty(e15)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        c10 = wVar.c("gcm.n.vibrate_timings");
        if (c10 != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        c11 = wVar.c("gcm.n.light_settings");
        if (c11 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean a10222222222222 = wVar.a("gcm.n.default_sound");
        boolean z10222222222222 = a10222222222222;
        if (wVar.a("gcm.n.default_vibrate_timings")) {
        }
        r02 = z10222222222222;
        if (wVar.a("gcm.n.default_light_settings")) {
        }
        Notification notification3222222222222 = qVar222.F;
        notification3222222222222.defaults = r02;
        if ((r02 & 4) != 0) {
        }
        e16 = wVar.e("gcm.n.tag");
        if (TextUtils.isEmpty(e16)) {
        }
        return new k(qVar222, e16);
    }

    public static boolean b(Resources resources, int i7) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i7, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i7);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i7 + ", treating it as an invalid icon");
            return false;
        }
    }
}
