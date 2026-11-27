// default package

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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class gn2 {
    public static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX WARN: Can't wrap try/catch for region: R(75:0|1|(3:2|3|(1:5))|233|7|8|(3:209|210|(73:212|(66:214|(1:216)|11|(1:13)|14|(1:16)|17|(57:19|(1:195)|23|(1:25)|26|(1:28)(2:185|(1:190)(1:189))|29|(1:31)|32|(1:34)(5:173|(1:175)|176|(1:178)(1:184)|(1:180)(2:181|(1:183)))|35|(1:37)(6:152|(4:155|(2:162|163)(1:165)|164|153)|168|169|(1:171)|172)|38|(1:40)(1:151)|(1:42)|43|(39:147|148|(1:49)|50|(1:52)|53|(33:138|(1:142)|(1:57)|58|(29:133|(1:137)|(1:62)|63|(25:130|(1:132)|(1:67)|68|(21:126|127|(1:72)|73|(3:116|117|(18:119|(1:121)|122|(1:77)|78|(4:80|81|82|(2:84|(12:86|(3:88|(1:91)|92)|93|(1:95)|96|(1:98)|99|(1:101)|102|(1:104)|105|106)(2:108|109))(2:110|111))|115|(0)|93|(0)|96|(0)|99|(0)|102|(0)|105|106)(2:123|124))|75|(0)|78|(0)|115|(0)|93|(0)|96|(0)|99|(0)|102|(0)|105|106)|70|(0)|73|(0)|75|(0)|78|(0)|115|(0)|93|(0)|96|(0)|99|(0)|102|(0)|105|106)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|115|(0)|93|(0)|96|(0)|99|(0)|102|(0)|105|106)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|115|(0)|93|(0)|96|(0)|99|(0)|102|(0)|105|106)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|115|(0)|93|(0)|96|(0)|99|(0)|102|(0)|105|106)|45|(39:143|144|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|115|(0)|93|(0)|96|(0)|99|(0)|102|(0)|105|106)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|115|(0)|93|(0)|96|(0)|99|(0)|102|(0)|105|106)|196|(2:204|205)|(1:203)|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|115|(0)|93|(0)|96|(0)|99|(0)|102|(0)|105|106)|217|(69:219|(1:221)|11|(0)|14|(0)|17|(0)|196|(1:198)|204|205|(1:201)|203|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|115|(0)|93|(0)|96|(0)|99|(0)|102|(0)|105|106)(1:229)|222|(3:224|(1:226)(1:228)|227)|11|(0)|14|(0)|17|(0)|196|(0)|204|205|(0)|203|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|115|(0)|93|(0)|96|(0)|99|(0)|102|(0)|105|106))|10|11|(0)|14|(0)|17|(0)|196|(0)|204|205|(0)|203|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|115|(0)|93|(0)|96|(0)|99|(0)|102|(0)|105|106) */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0156, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0157, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r0 != null) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0421 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0301 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0501  */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v146 */
    /* JADX WARN: Type inference failed for: r0v147 */
    /* JADX WARN: Type inference failed for: r0v94, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static lh2 a(FirebaseMessagingService firebaseMessagingService, ot6 ot6Var) {
        Bundle bundle;
        String string;
        String packageName;
        PackageManager packageManager;
        String d;
        String d2;
        String e;
        int i;
        String e2;
        Uri defaultUri;
        String e3;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String e4;
        Integer valueOf;
        String e5;
        Integer b;
        Integer b2;
        Integer b3;
        String e6;
        Long valueOf2;
        JSONArray c;
        long[] jArr;
        JSONArray c2;
        int[] iArr;
        ?? r0;
        String e7;
        int i2;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
        } catch (PackageManager.NameNotFoundException e8) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e8);
        }
        bundle = Bundle.EMPTY;
        Bundle bundle2 = bundle;
        String e9 = ot6Var.e("gcm.n.android_channel_id");
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(e9)) {
                    if (notificationManager.getNotificationChannel(e9) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + e9 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    }
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    wn7 wn7Var = new wn7(firebaseMessagingService, e9);
                    d = ot6Var.d(resources, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(d)) {
                        wn7Var.e(d);
                    }
                    d2 = ot6Var.d(resources, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(d2)) {
                        wn7Var.d(d2);
                        rn7 rn7Var = new rn7((byte) 0);
                        rn7Var.f = wn7.c(d2);
                        wn7Var.i(rn7Var);
                    }
                    e = ot6Var.e("gcm.n.icon");
                    if (!TextUtils.isEmpty(e)) {
                        i = resources.getIdentifier(e, "drawable", packageName);
                        if ((i == 0 || !b(resources, i)) && ((i = resources.getIdentifier(e, "mipmap", packageName)) == 0 || !b(resources, i))) {
                            Log.w("FirebaseMessaging", "Icon resource " + e + " not found. Notification will use default icon.");
                        }
                        Notification notification = wn7Var.F;
                        notification.icon = i;
                        e2 = ot6Var.e("gcm.n.sound2");
                        if (TextUtils.isEmpty(e2)) {
                            e2 = ot6Var.e("gcm.n.sound");
                        }
                        if (TextUtils.isEmpty(e2)) {
                            defaultUri = null;
                        } else if ("default".equals(e2) || resources.getIdentifier(e2, "raw", packageName) == 0) {
                            defaultUri = RingtoneManager.getDefaultUri(2);
                        } else {
                            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + e2);
                        }
                        if (defaultUri != null) {
                            notification.sound = defaultUri;
                            notification.audioStreamType = -1;
                            notification.audioAttributes = vn7.a(vn7.e(vn7.c(vn7.b(), 4), 5));
                        }
                        e3 = ot6Var.e("gcm.n.click_action");
                        if (TextUtils.isEmpty(e3)) {
                            String e10 = ot6Var.e("gcm.n.link_android");
                            if (TextUtils.isEmpty(e10)) {
                                e10 = ot6Var.e("gcm.n.link");
                            }
                            Uri parse = !TextUtils.isEmpty(e10) ? Uri.parse(e10) : null;
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
                            launchIntentForPackage = new Intent(e3);
                            launchIntentForPackage.setPackage(packageName);
                            launchIntentForPackage.setFlags(TLObject.FLAG_28);
                        }
                        AtomicInteger atomicInteger = a;
                        if (launchIntentForPackage == null) {
                            activity = null;
                        } else {
                            launchIntentForPackage.addFlags(67108864);
                            Bundle bundle3 = ot6Var.a;
                            Bundle bundle4 = new Bundle(bundle3);
                            for (String str : bundle3.keySet()) {
                                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                    bundle4.remove(str);
                                }
                            }
                            launchIntentForPackage.putExtras(bundle4);
                            if (ot6Var.a("google.c.a.e")) {
                                launchIntentForPackage.putExtra("gcm.n.analytics_data", ot6Var.g());
                            }
                            activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
                        }
                        wn7Var.g = activity;
                        broadcast = !ot6Var.a("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(ot6Var.g())), 1140850688);
                        if (broadcast != null) {
                            notification.deleteIntent = broadcast;
                        }
                        e4 = ot6Var.e("gcm.n.color");
                        if (!TextUtils.isEmpty(e4)) {
                            try {
                                valueOf = Integer.valueOf(Color.parseColor(e4));
                            } catch (IllegalArgumentException unused) {
                                Log.w("FirebaseMessaging", "Color is invalid: " + e4 + ". Notification will use default color.");
                            }
                            if (valueOf != null) {
                                wn7Var.w = valueOf.intValue();
                            }
                            wn7Var.f(16, !ot6Var.a("gcm.n.sticky"));
                            wn7Var.t = ot6Var.a("gcm.n.local_only");
                            e5 = ot6Var.e("gcm.n.ticker");
                            if (e5 != null) {
                                wn7Var.k(e5);
                            }
                            b = ot6Var.b("gcm.n.notification_priority");
                            if (b != null) {
                                if (b.intValue() < -2 || b.intValue() > 2) {
                                    Log.w("FirebaseMessaging", "notificationPriority is invalid " + b + ". Skipping setting notificationPriority.");
                                }
                                if (b != null) {
                                    wn7Var.j = b.intValue();
                                }
                                b2 = ot6Var.b("gcm.n.visibility");
                                if (b2 != null) {
                                    if (b2.intValue() < -1 || b2.intValue() > 1) {
                                        Log.w("NotificationParams", "visibility is invalid: " + b2 + ". Skipping setting visibility.");
                                    }
                                    if (b2 != null) {
                                        wn7Var.x = b2.intValue();
                                    }
                                    b3 = ot6Var.b("gcm.n.notification_count");
                                    if (b3 != null) {
                                        if (b3.intValue() < 0) {
                                            Log.w("FirebaseMessaging", "notificationCount is invalid: " + b3 + ". Skipping setting notificationCount.");
                                        }
                                        if (b3 != null) {
                                            wn7Var.i = b3.intValue();
                                        }
                                        e6 = ot6Var.e("gcm.n.event_time");
                                        if (!TextUtils.isEmpty(e6)) {
                                            try {
                                                valueOf2 = Long.valueOf(Long.parseLong(e6));
                                            } catch (NumberFormatException unused2) {
                                                Log.w("NotificationParams", "Couldn't parse value of " + ot6.m("gcm.n.event_time") + "(" + e6 + ") into a long");
                                            }
                                            if (valueOf2 != null) {
                                                wn7Var.k = true;
                                                notification.when = valueOf2.longValue();
                                            }
                                            c = ot6Var.c("gcm.n.vibrate_timings");
                                            if (c != null) {
                                                try {
                                                } catch (NumberFormatException | JSONException unused3) {
                                                    Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + c + ". Skipping setting vibrateTimings.");
                                                }
                                                if (c.length() <= 1) {
                                                    throw new JSONException("vibrateTimings have invalid length");
                                                }
                                                int length = c.length();
                                                jArr = new long[length];
                                                for (int i4 = 0; i4 < length; i4++) {
                                                    jArr[i4] = c.optLong(i4);
                                                }
                                                if (jArr != null) {
                                                    notification.vibrate = jArr;
                                                }
                                                c2 = ot6Var.c("gcm.n.light_settings");
                                                if (c2 != null) {
                                                    int[] iArr2 = new int[3];
                                                    try {
                                                    } catch (IllegalArgumentException e11) {
                                                        Log.w("NotificationParams", "LightSettings is invalid: " + c2 + ". " + e11.getMessage() + ". Skipping setting LightSettings");
                                                    } catch (JSONException unused4) {
                                                        Log.w("NotificationParams", "LightSettings is invalid: " + c2 + ". Skipping setting LightSettings");
                                                    }
                                                    if (c2.length() != 3) {
                                                        throw new JSONException("lightSettings don't have all three fields");
                                                    }
                                                    int parseColor = Color.parseColor(c2.optString(0));
                                                    if (parseColor == -16777216) {
                                                        throw new IllegalArgumentException("Transparent color is invalid");
                                                    }
                                                    iArr2[0] = parseColor;
                                                    iArr2[1] = c2.optInt(1);
                                                    iArr2[2] = c2.optInt(2);
                                                    iArr = iArr2;
                                                    if (iArr != null) {
                                                        int i5 = iArr[0];
                                                        int i6 = iArr[1];
                                                        int i7 = iArr[2];
                                                        notification.ledARGB = i5;
                                                        notification.ledOnMS = i6;
                                                        notification.ledOffMS = i7;
                                                        if (i6 != 0 && i7 != 0) {
                                                            i3 = 1;
                                                        }
                                                        notification.flags = (notification.flags & (-2)) | i3;
                                                    }
                                                    boolean a2 = ot6Var.a("gcm.n.default_sound");
                                                    boolean z = a2;
                                                    if (ot6Var.a("gcm.n.default_vibrate_timings")) {
                                                        z = (a2 ? 1 : 0) | 2;
                                                    }
                                                    r0 = z;
                                                    if (ot6Var.a("gcm.n.default_light_settings")) {
                                                        r0 = (z ? 1 : 0) | 4;
                                                    }
                                                    notification.defaults = r0;
                                                    if ((r0 & 4) != 0) {
                                                        notification.flags |= 1;
                                                    }
                                                    e7 = ot6Var.e("gcm.n.tag");
                                                    if (TextUtils.isEmpty(e7)) {
                                                        e7 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                                    }
                                                    return new lh2(wn7Var, e7, (byte) 16);
                                                }
                                                iArr = null;
                                                if (iArr != null) {
                                                }
                                                boolean a22 = ot6Var.a("gcm.n.default_sound");
                                                boolean z2 = a22;
                                                if (ot6Var.a("gcm.n.default_vibrate_timings")) {
                                                }
                                                r0 = z2;
                                                if (ot6Var.a("gcm.n.default_light_settings")) {
                                                }
                                                notification.defaults = r0;
                                                if ((r0 & 4) != 0) {
                                                }
                                                e7 = ot6Var.e("gcm.n.tag");
                                                if (TextUtils.isEmpty(e7)) {
                                                }
                                                return new lh2(wn7Var, e7, (byte) 16);
                                            }
                                            jArr = null;
                                            if (jArr != null) {
                                            }
                                            c2 = ot6Var.c("gcm.n.light_settings");
                                            if (c2 != null) {
                                            }
                                            iArr = null;
                                            if (iArr != null) {
                                            }
                                            boolean a222 = ot6Var.a("gcm.n.default_sound");
                                            boolean z22 = a222;
                                            if (ot6Var.a("gcm.n.default_vibrate_timings")) {
                                            }
                                            r0 = z22;
                                            if (ot6Var.a("gcm.n.default_light_settings")) {
                                            }
                                            notification.defaults = r0;
                                            if ((r0 & 4) != 0) {
                                            }
                                            e7 = ot6Var.e("gcm.n.tag");
                                            if (TextUtils.isEmpty(e7)) {
                                            }
                                            return new lh2(wn7Var, e7, (byte) 16);
                                        }
                                        valueOf2 = null;
                                        if (valueOf2 != null) {
                                        }
                                        c = ot6Var.c("gcm.n.vibrate_timings");
                                        if (c != null) {
                                        }
                                        jArr = null;
                                        if (jArr != null) {
                                        }
                                        c2 = ot6Var.c("gcm.n.light_settings");
                                        if (c2 != null) {
                                        }
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                        boolean a2222 = ot6Var.a("gcm.n.default_sound");
                                        boolean z222 = a2222;
                                        if (ot6Var.a("gcm.n.default_vibrate_timings")) {
                                        }
                                        r0 = z222;
                                        if (ot6Var.a("gcm.n.default_light_settings")) {
                                        }
                                        notification.defaults = r0;
                                        if ((r0 & 4) != 0) {
                                        }
                                        e7 = ot6Var.e("gcm.n.tag");
                                        if (TextUtils.isEmpty(e7)) {
                                        }
                                        return new lh2(wn7Var, e7, (byte) 16);
                                    }
                                    b3 = null;
                                    if (b3 != null) {
                                    }
                                    e6 = ot6Var.e("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(e6)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    c = ot6Var.c("gcm.n.vibrate_timings");
                                    if (c != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    c2 = ot6Var.c("gcm.n.light_settings");
                                    if (c2 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean a22222 = ot6Var.a("gcm.n.default_sound");
                                    boolean z2222 = a22222;
                                    if (ot6Var.a("gcm.n.default_vibrate_timings")) {
                                    }
                                    r0 = z2222;
                                    if (ot6Var.a("gcm.n.default_light_settings")) {
                                    }
                                    notification.defaults = r0;
                                    if ((r0 & 4) != 0) {
                                    }
                                    e7 = ot6Var.e("gcm.n.tag");
                                    if (TextUtils.isEmpty(e7)) {
                                    }
                                    return new lh2(wn7Var, e7, (byte) 16);
                                }
                                b2 = null;
                                if (b2 != null) {
                                }
                                b3 = ot6Var.b("gcm.n.notification_count");
                                if (b3 != null) {
                                }
                                b3 = null;
                                if (b3 != null) {
                                }
                                e6 = ot6Var.e("gcm.n.event_time");
                                if (!TextUtils.isEmpty(e6)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                c = ot6Var.c("gcm.n.vibrate_timings");
                                if (c != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                c2 = ot6Var.c("gcm.n.light_settings");
                                if (c2 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean a222222 = ot6Var.a("gcm.n.default_sound");
                                boolean z22222 = a222222;
                                if (ot6Var.a("gcm.n.default_vibrate_timings")) {
                                }
                                r0 = z22222;
                                if (ot6Var.a("gcm.n.default_light_settings")) {
                                }
                                notification.defaults = r0;
                                if ((r0 & 4) != 0) {
                                }
                                e7 = ot6Var.e("gcm.n.tag");
                                if (TextUtils.isEmpty(e7)) {
                                }
                                return new lh2(wn7Var, e7, (byte) 16);
                            }
                            b = null;
                            if (b != null) {
                            }
                            b2 = ot6Var.b("gcm.n.visibility");
                            if (b2 != null) {
                            }
                            b2 = null;
                            if (b2 != null) {
                            }
                            b3 = ot6Var.b("gcm.n.notification_count");
                            if (b3 != null) {
                            }
                            b3 = null;
                            if (b3 != null) {
                            }
                            e6 = ot6Var.e("gcm.n.event_time");
                            if (!TextUtils.isEmpty(e6)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            c = ot6Var.c("gcm.n.vibrate_timings");
                            if (c != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            c2 = ot6Var.c("gcm.n.light_settings");
                            if (c2 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean a2222222 = ot6Var.a("gcm.n.default_sound");
                            boolean z222222 = a2222222;
                            if (ot6Var.a("gcm.n.default_vibrate_timings")) {
                            }
                            r0 = z222222;
                            if (ot6Var.a("gcm.n.default_light_settings")) {
                            }
                            notification.defaults = r0;
                            if ((r0 & 4) != 0) {
                            }
                            e7 = ot6Var.e("gcm.n.tag");
                            if (TextUtils.isEmpty(e7)) {
                            }
                            return new lh2(wn7Var, e7, (byte) 16);
                        }
                        i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i2 != 0) {
                            try {
                                valueOf = Integer.valueOf(firebaseMessagingService.getColor(i2));
                            } catch (Resources.NotFoundException unused5) {
                                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                            }
                            if (valueOf != null) {
                            }
                            wn7Var.f(16, !ot6Var.a("gcm.n.sticky"));
                            wn7Var.t = ot6Var.a("gcm.n.local_only");
                            e5 = ot6Var.e("gcm.n.ticker");
                            if (e5 != null) {
                            }
                            b = ot6Var.b("gcm.n.notification_priority");
                            if (b != null) {
                            }
                            b = null;
                            if (b != null) {
                            }
                            b2 = ot6Var.b("gcm.n.visibility");
                            if (b2 != null) {
                            }
                            b2 = null;
                            if (b2 != null) {
                            }
                            b3 = ot6Var.b("gcm.n.notification_count");
                            if (b3 != null) {
                            }
                            b3 = null;
                            if (b3 != null) {
                            }
                            e6 = ot6Var.e("gcm.n.event_time");
                            if (!TextUtils.isEmpty(e6)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            c = ot6Var.c("gcm.n.vibrate_timings");
                            if (c != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            c2 = ot6Var.c("gcm.n.light_settings");
                            if (c2 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean a22222222 = ot6Var.a("gcm.n.default_sound");
                            boolean z2222222 = a22222222;
                            if (ot6Var.a("gcm.n.default_vibrate_timings")) {
                            }
                            r0 = z2222222;
                            if (ot6Var.a("gcm.n.default_light_settings")) {
                            }
                            notification.defaults = r0;
                            if ((r0 & 4) != 0) {
                            }
                            e7 = ot6Var.e("gcm.n.tag");
                            if (TextUtils.isEmpty(e7)) {
                            }
                            return new lh2(wn7Var, e7, (byte) 16);
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        wn7Var.f(16, !ot6Var.a("gcm.n.sticky"));
                        wn7Var.t = ot6Var.a("gcm.n.local_only");
                        e5 = ot6Var.e("gcm.n.ticker");
                        if (e5 != null) {
                        }
                        b = ot6Var.b("gcm.n.notification_priority");
                        if (b != null) {
                        }
                        b = null;
                        if (b != null) {
                        }
                        b2 = ot6Var.b("gcm.n.visibility");
                        if (b2 != null) {
                        }
                        b2 = null;
                        if (b2 != null) {
                        }
                        b3 = ot6Var.b("gcm.n.notification_count");
                        if (b3 != null) {
                        }
                        b3 = null;
                        if (b3 != null) {
                        }
                        e6 = ot6Var.e("gcm.n.event_time");
                        if (!TextUtils.isEmpty(e6)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        c = ot6Var.c("gcm.n.vibrate_timings");
                        if (c != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        c2 = ot6Var.c("gcm.n.light_settings");
                        if (c2 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean a222222222 = ot6Var.a("gcm.n.default_sound");
                        boolean z22222222 = a222222222;
                        if (ot6Var.a("gcm.n.default_vibrate_timings")) {
                        }
                        r0 = z22222222;
                        if (ot6Var.a("gcm.n.default_light_settings")) {
                        }
                        notification.defaults = r0;
                        if ((r0 & 4) != 0) {
                        }
                        e7 = ot6Var.e("gcm.n.tag");
                        if (TextUtils.isEmpty(e7)) {
                        }
                        return new lh2(wn7Var, e7, (byte) 16);
                    }
                    i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i != 0 || !b(resources, i)) {
                        i = packageManager.getApplicationInfo(packageName, 0).icon;
                    }
                    if (i != 0 || !b(resources, i)) {
                        i = 17301651;
                    }
                    Notification notification2 = wn7Var.F;
                    notification2.icon = i;
                    e2 = ot6Var.e("gcm.n.sound2");
                    if (TextUtils.isEmpty(e2)) {
                    }
                    if (TextUtils.isEmpty(e2)) {
                    }
                    if (defaultUri != null) {
                    }
                    e3 = ot6Var.e("gcm.n.click_action");
                    if (TextUtils.isEmpty(e3)) {
                    }
                    AtomicInteger atomicInteger2 = a;
                    if (launchIntentForPackage == null) {
                    }
                    wn7Var.g = activity;
                    if (!ot6Var.a("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    e4 = ot6Var.e("gcm.n.color");
                    if (!TextUtils.isEmpty(e4)) {
                    }
                    i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i2 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    wn7Var.f(16, !ot6Var.a("gcm.n.sticky"));
                    wn7Var.t = ot6Var.a("gcm.n.local_only");
                    e5 = ot6Var.e("gcm.n.ticker");
                    if (e5 != null) {
                    }
                    b = ot6Var.b("gcm.n.notification_priority");
                    if (b != null) {
                    }
                    b = null;
                    if (b != null) {
                    }
                    b2 = ot6Var.b("gcm.n.visibility");
                    if (b2 != null) {
                    }
                    b2 = null;
                    if (b2 != null) {
                    }
                    b3 = ot6Var.b("gcm.n.notification_count");
                    if (b3 != null) {
                    }
                    b3 = null;
                    if (b3 != null) {
                    }
                    e6 = ot6Var.e("gcm.n.event_time");
                    if (!TextUtils.isEmpty(e6)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    c = ot6Var.c("gcm.n.vibrate_timings");
                    if (c != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    c2 = ot6Var.c("gcm.n.light_settings");
                    if (c2 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean a2222222222 = ot6Var.a("gcm.n.default_sound");
                    boolean z222222222 = a2222222222;
                    if (ot6Var.a("gcm.n.default_vibrate_timings")) {
                    }
                    r0 = z222222222;
                    if (ot6Var.a("gcm.n.default_light_settings")) {
                    }
                    notification2.defaults = r0;
                    if ((r0 & 4) != 0) {
                    }
                    e7 = ot6Var.e("gcm.n.tag");
                    if (TextUtils.isEmpty(e7)) {
                    }
                    return new lh2(wn7Var, e7, (byte) 16);
                }
                e9 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(e9)) {
                    if (notificationManager.getNotificationChannel(e9) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources2 = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    wn7 wn7Var2 = new wn7(firebaseMessagingService, e9);
                    d = ot6Var.d(resources2, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(d)) {
                    }
                    d2 = ot6Var.d(resources2, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(d2)) {
                    }
                    e = ot6Var.e("gcm.n.icon");
                    if (!TextUtils.isEmpty(e)) {
                    }
                    i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i != 0) {
                    }
                    i = packageManager.getApplicationInfo(packageName, 0).icon;
                    if (i != 0) {
                    }
                    i = 17301651;
                    Notification notification22 = wn7Var2.F;
                    notification22.icon = i;
                    e2 = ot6Var.e("gcm.n.sound2");
                    if (TextUtils.isEmpty(e2)) {
                    }
                    if (TextUtils.isEmpty(e2)) {
                    }
                    if (defaultUri != null) {
                    }
                    e3 = ot6Var.e("gcm.n.click_action");
                    if (TextUtils.isEmpty(e3)) {
                    }
                    AtomicInteger atomicInteger22 = a;
                    if (launchIntentForPackage == null) {
                    }
                    wn7Var2.g = activity;
                    if (!ot6Var.a("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    e4 = ot6Var.e("gcm.n.color");
                    if (!TextUtils.isEmpty(e4)) {
                    }
                    i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i2 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    wn7Var2.f(16, !ot6Var.a("gcm.n.sticky"));
                    wn7Var2.t = ot6Var.a("gcm.n.local_only");
                    e5 = ot6Var.e("gcm.n.ticker");
                    if (e5 != null) {
                    }
                    b = ot6Var.b("gcm.n.notification_priority");
                    if (b != null) {
                    }
                    b = null;
                    if (b != null) {
                    }
                    b2 = ot6Var.b("gcm.n.visibility");
                    if (b2 != null) {
                    }
                    b2 = null;
                    if (b2 != null) {
                    }
                    b3 = ot6Var.b("gcm.n.notification_count");
                    if (b3 != null) {
                    }
                    b3 = null;
                    if (b3 != null) {
                    }
                    e6 = ot6Var.e("gcm.n.event_time");
                    if (!TextUtils.isEmpty(e6)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    c = ot6Var.c("gcm.n.vibrate_timings");
                    if (c != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    c2 = ot6Var.c("gcm.n.light_settings");
                    if (c2 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean a22222222222 = ot6Var.a("gcm.n.default_sound");
                    boolean z2222222222 = a22222222222;
                    if (ot6Var.a("gcm.n.default_vibrate_timings")) {
                    }
                    r0 = z2222222222;
                    if (ot6Var.a("gcm.n.default_light_settings")) {
                    }
                    notification22.defaults = r0;
                    if ((r0 & 4) != 0) {
                    }
                    e7 = ot6Var.e("gcm.n.tag");
                    if (TextUtils.isEmpty(e7)) {
                    }
                    return new lh2(wn7Var2, e7, (byte) 16);
                }
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                e9 = "fcm_fallback_notification_channel";
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
                wn7 wn7Var22 = new wn7(firebaseMessagingService, e9);
                d = ot6Var.d(resources22, packageName, "gcm.n.title");
                if (!TextUtils.isEmpty(d)) {
                }
                d2 = ot6Var.d(resources22, packageName, "gcm.n.body");
                if (!TextUtils.isEmpty(d2)) {
                }
                e = ot6Var.e("gcm.n.icon");
                if (!TextUtils.isEmpty(e)) {
                }
                i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                if (i != 0) {
                }
                i = packageManager.getApplicationInfo(packageName, 0).icon;
                if (i != 0) {
                }
                i = 17301651;
                Notification notification222 = wn7Var22.F;
                notification222.icon = i;
                e2 = ot6Var.e("gcm.n.sound2");
                if (TextUtils.isEmpty(e2)) {
                }
                if (TextUtils.isEmpty(e2)) {
                }
                if (defaultUri != null) {
                }
                e3 = ot6Var.e("gcm.n.click_action");
                if (TextUtils.isEmpty(e3)) {
                }
                AtomicInteger atomicInteger222 = a;
                if (launchIntentForPackage == null) {
                }
                wn7Var22.g = activity;
                if (!ot6Var.a("google.c.a.e")) {
                }
                if (broadcast != null) {
                }
                e4 = ot6Var.e("gcm.n.color");
                if (!TextUtils.isEmpty(e4)) {
                }
                i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i2 != 0) {
                }
                valueOf = null;
                if (valueOf != null) {
                }
                wn7Var22.f(16, !ot6Var.a("gcm.n.sticky"));
                wn7Var22.t = ot6Var.a("gcm.n.local_only");
                e5 = ot6Var.e("gcm.n.ticker");
                if (e5 != null) {
                }
                b = ot6Var.b("gcm.n.notification_priority");
                if (b != null) {
                }
                b = null;
                if (b != null) {
                }
                b2 = ot6Var.b("gcm.n.visibility");
                if (b2 != null) {
                }
                b2 = null;
                if (b2 != null) {
                }
                b3 = ot6Var.b("gcm.n.notification_count");
                if (b3 != null) {
                }
                b3 = null;
                if (b3 != null) {
                }
                e6 = ot6Var.e("gcm.n.event_time");
                if (!TextUtils.isEmpty(e6)) {
                }
                valueOf2 = null;
                if (valueOf2 != null) {
                }
                c = ot6Var.c("gcm.n.vibrate_timings");
                if (c != null) {
                }
                jArr = null;
                if (jArr != null) {
                }
                c2 = ot6Var.c("gcm.n.light_settings");
                if (c2 != null) {
                }
                iArr = null;
                if (iArr != null) {
                }
                boolean a222222222222 = ot6Var.a("gcm.n.default_sound");
                boolean z22222222222 = a222222222222;
                if (ot6Var.a("gcm.n.default_vibrate_timings")) {
                }
                r0 = z22222222222;
                if (ot6Var.a("gcm.n.default_light_settings")) {
                }
                notification222.defaults = r0;
                if ((r0 & 4) != 0) {
                }
                e7 = ot6Var.e("gcm.n.tag");
                if (TextUtils.isEmpty(e7)) {
                }
                return new lh2(wn7Var22, e7, (byte) 16);
            }
        }
        e9 = null;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources222 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        wn7 wn7Var222 = new wn7(firebaseMessagingService, e9);
        d = ot6Var.d(resources222, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(d)) {
        }
        d2 = ot6Var.d(resources222, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(d2)) {
        }
        e = ot6Var.e("gcm.n.icon");
        if (!TextUtils.isEmpty(e)) {
        }
        i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i != 0) {
        }
        i = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i != 0) {
        }
        i = 17301651;
        Notification notification2222 = wn7Var222.F;
        notification2222.icon = i;
        e2 = ot6Var.e("gcm.n.sound2");
        if (TextUtils.isEmpty(e2)) {
        }
        if (TextUtils.isEmpty(e2)) {
        }
        if (defaultUri != null) {
        }
        e3 = ot6Var.e("gcm.n.click_action");
        if (TextUtils.isEmpty(e3)) {
        }
        AtomicInteger atomicInteger2222 = a;
        if (launchIntentForPackage == null) {
        }
        wn7Var222.g = activity;
        if (!ot6Var.a("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        e4 = ot6Var.e("gcm.n.color");
        if (!TextUtils.isEmpty(e4)) {
        }
        i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i2 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        wn7Var222.f(16, !ot6Var.a("gcm.n.sticky"));
        wn7Var222.t = ot6Var.a("gcm.n.local_only");
        e5 = ot6Var.e("gcm.n.ticker");
        if (e5 != null) {
        }
        b = ot6Var.b("gcm.n.notification_priority");
        if (b != null) {
        }
        b = null;
        if (b != null) {
        }
        b2 = ot6Var.b("gcm.n.visibility");
        if (b2 != null) {
        }
        b2 = null;
        if (b2 != null) {
        }
        b3 = ot6Var.b("gcm.n.notification_count");
        if (b3 != null) {
        }
        b3 = null;
        if (b3 != null) {
        }
        e6 = ot6Var.e("gcm.n.event_time");
        if (!TextUtils.isEmpty(e6)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        c = ot6Var.c("gcm.n.vibrate_timings");
        if (c != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        c2 = ot6Var.c("gcm.n.light_settings");
        if (c2 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean a2222222222222 = ot6Var.a("gcm.n.default_sound");
        boolean z222222222222 = a2222222222222;
        if (ot6Var.a("gcm.n.default_vibrate_timings")) {
        }
        r0 = z222222222222;
        if (ot6Var.a("gcm.n.default_light_settings")) {
        }
        notification2222.defaults = r0;
        if ((r0 & 4) != 0) {
        }
        e7 = ot6Var.e("gcm.n.tag");
        if (TextUtils.isEmpty(e7)) {
        }
        return new lh2(wn7Var222, e7, (byte) 16);
    }

    public static boolean b(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }
}
