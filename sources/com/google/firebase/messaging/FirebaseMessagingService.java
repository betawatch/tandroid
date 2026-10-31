package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import c5.s;
import com.google.android.gms.tasks.Tasks;
import j6.a;
import j6.k;
import j6.m;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k2.k0;
import l5.q;
import l9.h;
import l9.j;
import r2.y;
import ra.c;
import ra.d;
import th.m1;
import w7.y8;
import xa.f;
import xa.l;
import ya.b;
import ya.e;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class FirebaseMessagingService extends f {
    public static final ArrayDeque h = new ArrayDeque(10);
    public a f;

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0284 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x026c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0250 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01eb  */
    @Override // xa.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Intent intent) {
        String stringExtra;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        boolean z10;
        Bundle extras;
        char c10;
        int parseInt;
        int i10;
        String string;
        String string2;
        String string3;
        long parseLong;
        String str;
        String str2;
        a aVar;
        int i11;
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                d(intent.getStringExtra("token"));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
            return;
        }
        String stringExtra2 = intent.getStringExtra("google.message_id");
        if (!TextUtils.isEmpty(stringExtra2)) {
            ArrayDeque arrayDeque = h;
            if (arrayDeque.contains(stringExtra2)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received duplicate message: " + stringExtra2);
                }
                if (this.f == null) {
                    this.f = new a(getApplicationContext());
                }
                aVar = this.f;
                if (aVar.c.h() >= 233700000) {
                    Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                    return;
                }
                Bundle bundle2 = new Bundle();
                String stringExtra3 = intent.getStringExtra("google.message_id");
                if (stringExtra3 == null) {
                    stringExtra3 = intent.getStringExtra("message_id");
                }
                bundle2.putString("google.message_id", stringExtra3);
                Integer valueOf = intent.hasExtra("google.product_id") ? Integer.valueOf(intent.getIntExtra("google.product_id", 0)) : null;
                if (valueOf != null) {
                    bundle2.putInt("google.product_id", valueOf.intValue());
                }
                m j10 = m.j(aVar.b);
                synchronized (j10) {
                    i11 = j10.a;
                    j10.a = i11 + 1;
                }
                j10.k(new k(i11, 3, bundle2, 0));
                return;
            }
            if (arrayDeque.size() >= 10) {
                arrayDeque.remove();
            }
            arrayDeque.add(stringExtra2);
        }
        stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                break;
            case "gcm":
                if (y8.b(intent)) {
                    y8.a("_nr", intent.getExtras());
                }
                if (!"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
                    try {
                        h.c();
                        h c11 = h.c();
                        c11.a();
                        Context context = c11.a;
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
                        if (sharedPreferences.contains("export_to_big_query")) {
                            z10 = sharedPreferences.getBoolean("export_to_big_query", false);
                        } else {
                            try {
                                PackageManager packageManager = context.getPackageManager();
                                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                                    z10 = applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                        }
                    } catch (IllegalStateException unused2) {
                        Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
                    }
                    if (z10) {
                        i5.f fVar = FirebaseMessaging.m;
                        if (fVar == null) {
                            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                        } else {
                            Bundle extras2 = intent.getExtras();
                            if (extras2 == null) {
                                extras2 = Bundle.EMPTY;
                            }
                            Object obj = extras2.get("google.ttl");
                            try {
                                if (obj instanceof Integer) {
                                    parseInt = ((Integer) obj).intValue();
                                } else {
                                    if (obj instanceof String) {
                                        try {
                                            parseInt = Integer.parseInt((String) obj);
                                        } catch (NumberFormatException unused3) {
                                            c10 = 1;
                                            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                                        }
                                    } else {
                                        c10 = 1;
                                    }
                                    i10 = 0;
                                    string = extras2.getString("google.to");
                                    if (TextUtils.isEmpty(string)) {
                                        try {
                                            h c12 = h.c();
                                            Object obj2 = c.m;
                                            string = (String) Tasks.await(((c) c12.b(d.class)).d());
                                        } catch (InterruptedException | ExecutionException e) {
                                            throw new RuntimeException(e);
                                        }
                                    }
                                    String str3 = string;
                                    h c13 = h.c();
                                    c13.a();
                                    String packageName = c13.a.getPackageName();
                                    b bVar = !y.Y(extras2) ? b.c : b.b;
                                    string2 = extras2.getString("google.message_id");
                                    if (string2 == null) {
                                        string2 = extras2.getString("message_id");
                                    }
                                    String str4 = string2 == null ? string2 : "";
                                    string3 = extras2.getString("from");
                                    if (string3 != null || !string3.startsWith("/topics/")) {
                                        string3 = null;
                                    }
                                    String str5 = string3 == null ? string3 : "";
                                    String string4 = extras2.getString("collapse_key");
                                    String str6 = string4 == null ? string4 : "";
                                    String string5 = extras2.getString("google.c.a.m_l");
                                    String str7 = string5 == null ? string5 : "";
                                    String string6 = extras2.getString("google.c.a.c_l");
                                    String str8 = string6 == null ? string6 : "";
                                    if (extras2.containsKey("google.c.sender.id")) {
                                        try {
                                            parseLong = Long.parseLong(extras2.getString("google.c.sender.id"));
                                        } catch (NumberFormatException e7) {
                                            Log.w("FirebaseMessaging", "error parsing project number", e7);
                                        }
                                        ((q) fVar).a("FCM_CLIENT_EVENT_LOGGING", new i5.c("proto"), new m1(27)).a(new i5.a(null, new e(new ya.d(parseLong <= 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i10, str5, str7, str8)), i5.d.a, new i5.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new k0(5));
                                    }
                                    h c14 = h.c();
                                    j jVar = c14.c;
                                    c14.a();
                                    str = jVar.e;
                                    if (str != null) {
                                        try {
                                            parseLong = Long.parseLong(str);
                                        } catch (NumberFormatException e10) {
                                            Log.w("FirebaseMessaging", "error parsing sender ID", e10);
                                        }
                                        ((q) fVar).a("FCM_CLIENT_EVENT_LOGGING", new i5.c("proto"), new m1(27)).a(new i5.a(null, new e(new ya.d(parseLong <= 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i10, str5, str7, str8)), i5.d.a, new i5.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new k0(5));
                                    }
                                    c14.a();
                                    str2 = jVar.b;
                                    if (str2.startsWith("1:")) {
                                        try {
                                            parseLong = Long.parseLong(str2);
                                        } catch (NumberFormatException e11) {
                                            Log.w("FirebaseMessaging", "error parsing app ID", e11);
                                        }
                                    } else {
                                        String[] split = str2.split(":");
                                        if (split.length >= 2) {
                                            String str9 = split[c10];
                                            if (!str9.isEmpty()) {
                                                try {
                                                    parseLong = Long.parseLong(str9);
                                                } catch (NumberFormatException e12) {
                                                    Log.w("FirebaseMessaging", "error parsing app ID", e12);
                                                }
                                            }
                                        }
                                        parseLong = 0;
                                    }
                                    ((q) fVar).a("FCM_CLIENT_EVENT_LOGGING", new i5.c("proto"), new m1(27)).a(new i5.a(null, new e(new ya.d(parseLong <= 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i10, str5, str7, str8)), i5.d.a, new i5.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new k0(5));
                                }
                                ((q) fVar).a("FCM_CLIENT_EVENT_LOGGING", new i5.c("proto"), new m1(27)).a(new i5.a(null, new e(new ya.d(parseLong <= 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i10, str5, str7, str8)), i5.d.a, new i5.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new k0(5));
                            } catch (RuntimeException e13) {
                                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e13);
                            }
                            i10 = parseInt;
                            c10 = 1;
                            string = extras2.getString("google.to");
                            if (TextUtils.isEmpty(string)) {
                            }
                            String str32 = string;
                            h c132 = h.c();
                            c132.a();
                            String packageName2 = c132.a.getPackageName();
                            b bVar2 = !y.Y(extras2) ? b.c : b.b;
                            string2 = extras2.getString("google.message_id");
                            if (string2 == null) {
                            }
                            if (string2 == null) {
                            }
                            string3 = extras2.getString("from");
                            if (string3 != null) {
                            }
                            string3 = null;
                            if (string3 == null) {
                            }
                            String string42 = extras2.getString("collapse_key");
                            if (string42 == null) {
                            }
                            String string52 = extras2.getString("google.c.a.m_l");
                            if (string52 == null) {
                            }
                            String string62 = extras2.getString("google.c.a.c_l");
                            if (string62 == null) {
                            }
                            if (extras2.containsKey("google.c.sender.id")) {
                            }
                            h c142 = h.c();
                            j jVar2 = c142.c;
                            c142.a();
                            str = jVar2.e;
                            if (str != null) {
                            }
                            c142.a();
                            str2 = jVar2.b;
                            if (str2.startsWith("1:")) {
                            }
                        }
                    }
                    extras = intent.getExtras();
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    extras.remove("androidx.content.wakelockid");
                    if (y.Y(extras)) {
                        y yVar = new y(extras);
                        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new s("Firebase-Messaging-Network-Io"));
                        try {
                            if (new q5.d(this, yVar, newSingleThreadExecutor).s()) {
                                break;
                            } else {
                                newSingleThreadExecutor.shutdown();
                                if (y8.b(intent)) {
                                    y8.a("_nf", intent.getExtras());
                                }
                            }
                        } finally {
                            newSingleThreadExecutor.shutdown();
                        }
                    }
                    c(new l(extras));
                    break;
                }
                z10 = false;
                if (z10) {
                }
                extras = intent.getExtras();
                if (extras == null) {
                }
                extras.remove("androidx.content.wakelockid");
                if (y.Y(extras)) {
                }
                c(new l(extras));
                break;
            case "send_error":
                if (intent.getStringExtra("google.message_id") == null) {
                    intent.getStringExtra("message_id");
                }
                String stringExtra4 = intent.getStringExtra("error");
                new j6.l(stringExtra4);
                if (stringExtra4 != null) {
                    stringExtra4.toLowerCase(Locale.US).getClass();
                    break;
                }
                break;
            case "send_event":
                intent.getStringExtra("google.message_id");
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra));
                break;
        }
        if (this.f == null) {
        }
        aVar = this.f;
        if (aVar.c.h() >= 233700000) {
        }
    }

    public void c(l lVar) {
    }

    public void d(String str) {
    }
}
