package a8;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class b1 {
    public static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            o9.g.c();
            o9.g c10 = o9.g.c();
            c10.a();
            Context context = c10.a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0175 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Intent intent) {
        int parseInt;
        int i7;
        String string;
        String string2;
        char c10;
        int i10;
        String string3;
        String string4;
        long parseLong;
        bb.d dVar;
        String str;
        String str2;
        if (d(intent)) {
            c("_nr", intent.getExtras());
        }
        int i11 = 0;
        if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : a()) {
            l5.f fVar = (l5.f) FirebaseMessaging.n.get();
            if (fVar == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            int i12 = 10;
            if (intent == null) {
                dVar = null;
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    parseInt = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        try {
                            parseInt = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused) {
                            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                        }
                    }
                    i7 = 0;
                    string = extras.getString("google.to");
                    if (TextUtils.isEmpty(string)) {
                        try {
                            o9.g c11 = o9.g.c();
                            try {
                                Object obj2 = va.c.m;
                                string = (String) Tasks.await(((va.c) c11.b(va.d.class)).e());
                            } catch (InterruptedException e10) {
                                e = e10;
                                throw new RuntimeException(e);
                            }
                        } catch (InterruptedException | ExecutionException e11) {
                            e = e11;
                        }
                    }
                    String str3 = string;
                    o9.g c12 = o9.g.c();
                    c12.a();
                    String packageName = c12.a.getPackageName();
                    bb.b bVar = !d6.i.l0(extras) ? bb.b.c : bb.b.b;
                    string2 = extras.getString("google.delivered_priority");
                    if (string2 == null) {
                        if (!"1".equals(extras.getString("google.priority_reduced"))) {
                            string2 = extras.getString("google.priority");
                        }
                        c10 = 2;
                        if (c10 == 2) {
                            i11 = 5;
                        } else if (c10 == 1) {
                            i10 = 10;
                            string3 = extras.getString("google.message_id");
                            if (string3 == null) {
                                string3 = extras.getString("message_id");
                            }
                            String str4 = string3 == null ? string3 : "";
                            string4 = extras.getString("from");
                            if (string4 != null || !string4.startsWith("/topics/")) {
                                string4 = null;
                            }
                            String str5 = string4 == null ? string4 : "";
                            String string5 = extras.getString("collapse_key");
                            String str6 = string5 == null ? string5 : "";
                            String string6 = extras.getString("google.c.a.m_l");
                            String str7 = string6 == null ? string6 : "";
                            String string7 = extras.getString("google.c.a.c_l");
                            String str8 = string7 == null ? string7 : "";
                            if (extras.containsKey("google.c.sender.id")) {
                                try {
                                    parseLong = Long.parseLong(extras.getString("google.c.sender.id"));
                                } catch (NumberFormatException e12) {
                                    Log.w("FirebaseMessaging", "error parsing project number", e12);
                                }
                                dVar = new bb.d(parseLong <= 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i10, i7, str5, str7, str8);
                            }
                            o9.g c13 = o9.g.c();
                            o9.i iVar = c13.c;
                            c13.a();
                            str = iVar.e;
                            if (str != null) {
                                try {
                                    parseLong = Long.parseLong(str);
                                } catch (NumberFormatException e13) {
                                    Log.w("FirebaseMessaging", "error parsing sender ID", e13);
                                }
                                dVar = new bb.d(parseLong <= 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i10, i7, str5, str7, str8);
                            }
                            c13.a();
                            str2 = iVar.b;
                            if (str2.startsWith("1:")) {
                                try {
                                    parseLong = Long.parseLong(str2);
                                } catch (NumberFormatException e14) {
                                    Log.w("FirebaseMessaging", "error parsing app ID", e14);
                                }
                            } else {
                                String[] split = str2.split(":");
                                if (split.length >= 2) {
                                    String str9 = split[1];
                                    if (!str9.isEmpty()) {
                                        try {
                                            parseLong = Long.parseLong(str9);
                                        } catch (NumberFormatException e15) {
                                            Log.w("FirebaseMessaging", "error parsing app ID", e15);
                                        }
                                    }
                                }
                                parseLong = 0;
                            }
                            dVar = new bb.d(parseLong <= 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i10, i7, str5, str7, str8);
                        }
                        i10 = i11;
                        string3 = extras.getString("google.message_id");
                        if (string3 == null) {
                        }
                        if (string3 == null) {
                        }
                        string4 = extras.getString("from");
                        if (string4 != null) {
                        }
                        string4 = null;
                        if (string4 == null) {
                        }
                        String string52 = extras.getString("collapse_key");
                        if (string52 == null) {
                        }
                        String string62 = extras.getString("google.c.a.m_l");
                        if (string62 == null) {
                        }
                        String string72 = extras.getString("google.c.a.c_l");
                        if (string72 == null) {
                        }
                        if (extras.containsKey("google.c.sender.id")) {
                        }
                        o9.g c132 = o9.g.c();
                        o9.i iVar2 = c132.c;
                        c132.a();
                        str = iVar2.e;
                        if (str != null) {
                        }
                        c132.a();
                        str2 = iVar2.b;
                        if (str2.startsWith("1:")) {
                        }
                        dVar = new bb.d(parseLong <= 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i10, i7, str5, str7, str8);
                    }
                    if ("high".equals(string2)) {
                        if (!"normal".equals(string2)) {
                            c10 = 0;
                        }
                        c10 = 2;
                    } else {
                        c10 = 1;
                    }
                    if (c10 == 2) {
                    }
                    i10 = i11;
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                    }
                    if (string3 == null) {
                    }
                    string4 = extras.getString("from");
                    if (string4 != null) {
                    }
                    string4 = null;
                    if (string4 == null) {
                    }
                    String string522 = extras.getString("collapse_key");
                    if (string522 == null) {
                    }
                    String string622 = extras.getString("google.c.a.m_l");
                    if (string622 == null) {
                    }
                    String string722 = extras.getString("google.c.a.c_l");
                    if (string722 == null) {
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                    }
                    o9.g c1322 = o9.g.c();
                    o9.i iVar22 = c1322.c;
                    c1322.a();
                    str = iVar22.e;
                    if (str != null) {
                    }
                    c1322.a();
                    str2 = iVar22.b;
                    if (str2.startsWith("1:")) {
                    }
                    dVar = new bb.d(parseLong <= 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i10, i7, str5, str7, str8);
                }
                i7 = parseInt;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                }
                String str32 = string;
                o9.g c122 = o9.g.c();
                c122.a();
                String packageName2 = c122.a.getPackageName();
                bb.b bVar2 = !d6.i.l0(extras) ? bb.b.c : bb.b.b;
                string2 = extras.getString("google.delivered_priority");
                if (string2 == null) {
                }
                if ("high".equals(string2)) {
                }
                if (c10 == 2) {
                }
                i10 = i11;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                }
                if (string3 == null) {
                }
                string4 = extras.getString("from");
                if (string4 != null) {
                }
                string4 = null;
                if (string4 == null) {
                }
                String string5222 = extras.getString("collapse_key");
                if (string5222 == null) {
                }
                String string6222 = extras.getString("google.c.a.m_l");
                if (string6222 == null) {
                }
                String string7222 = extras.getString("google.c.a.c_l");
                if (string7222 == null) {
                }
                if (extras.containsKey("google.c.sender.id")) {
                }
                o9.g c13222 = o9.g.c();
                o9.i iVar222 = c13222.c;
                c13222.a();
                str = iVar222.e;
                if (str != null) {
                }
                c13222.a();
                str2 = iVar222.b;
                if (str2.startsWith("1:")) {
                }
                dVar = new bb.d(parseLong <= 0 ? parseLong : 0L, str4, str32, bVar2, packageName2, str6, i10, i7, str5, str7, str8);
            }
            if (dVar == null) {
                return;
            }
            try {
                ((o5.q) fVar).a("FCM_CLIENT_EVENT_LOGGING", new l5.c("proto"), new a3.l(i12)).a(new l5.a(null, new bb.e(dVar), l5.d.a, new l5.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new ni.a(3));
            } catch (RuntimeException e16) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e16);
            }
        }
    }

    public static void c(String str, Bundle bundle) {
        try {
            o9.g.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e10);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e11) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e11);
                }
            }
            String str2 = d6.i.l0(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            if (o9.g.c().b(p9.a.class) != null) {
                throw new ClassCastException();
            }
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static boolean d(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }
}
