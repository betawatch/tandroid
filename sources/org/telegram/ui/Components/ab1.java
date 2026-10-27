package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationBadge;
import org.telegram.ui.WidgetConformanceActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ab1 {
    public static final String[][] h = {new String[]{"private", "0", "1", "1", "0"}, new String[]{"group", "0", "1", "0", "0"}, new String[]{"via-bot", "0", "1", "0", "0"}, new String[]{"no-queries", "0", "0", "0", "0"}, new String[]{"live-copy", "1", "1", "0", "0"}, new String[]{"copy", "1", "0", "0", "0"}, new String[]{"preview", "0", "0", "0", "1"}};
    public final Context a;
    public final File b;
    public final int c;
    public final boolean d;
    public final String e;
    public final org.telegram.ui.jl0 f;
    public final Handler g = new Handler(Looper.getMainLooper());

    public ab1(WidgetConformanceActivity widgetConformanceActivity, int i10, boolean z10, String str, org.telegram.ui.jl0 jl0Var) {
        this.a = widgetConformanceActivity.getApplicationContext();
        this.b = new File(widgetConformanceActivity.getExternalFilesDir(null), "conformance");
        this.c = i10;
        this.d = z10;
        this.e = str;
        this.f = jl0Var;
    }

    public static JSONArray b(JSONArray jSONArray, za1 za1Var, dc1 dc1Var) {
        int i10;
        JSONArray jSONArray2 = new JSONArray();
        for (int i11 = 0; jSONArray != null && i11 < jSONArray.length(); i11++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            JSONObject put = new JSONObject().put("id", jSONObject.optString("id")).put("name", jSONObject.optString("name"));
            JSONObject optJSONObject = jSONObject.optJSONObject("bridge");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("height");
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("method");
                String optString2 = optJSONObject.optString("arg", null);
                synchronized (za1Var.e) {
                    try {
                        ArrayList arrayList = za1Var.e;
                        int size = arrayList.size();
                        i10 = 0;
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList.get(i12);
                            i12++;
                            JSONObject jSONObject2 = (JSONObject) obj;
                            if (optString.equals(jSONObject2.optString("kind")) && (optString2 == null || optString2.equals(jSONObject2.optString("url")))) {
                                i10++;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                put.put("ok", i10 == optJSONObject.optInt(NotificationBadge.NewHtcHomeBadger.COUNT)).put("got", i10 + " call(s), want " + optJSONObject.optInt(NotificationBadge.NewHtcHomeBadger.COUNT));
            } else if (optJSONObject2 != null) {
                double min = dc1Var.E == null ? 0.0d : Math.min(600.0f, r5.e / AndroidUtilities.density);
                put.put("ok", min >= optJSONObject2.optDouble("min") && min <= optJSONObject2.optDouble("max")).put("got", Math.round(min) + " px");
            } else if ("chat".equals(jSONObject.optString("focus"))) {
                put.put("ok", true).put("got", "no keyboard");
            } else {
                put.put("ok", true).put("got", "not checked");
            }
            jSONArray2.put(put);
        }
        return jSONArray2;
    }

    public static String c(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[16384];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                    fileInputStream.close();
                    return byteArrayOutputStream2;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static float[] f(za1 za1Var, String str) {
        JSONObject optJSONObject = za1Var.a == null ? null : za1Var.a.optJSONObject("targets");
        JSONArray optJSONArray = optJSONObject == null ? null : optJSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        return new float[]{(float) ((optJSONArray.optDouble(2) / 2.0d) + optJSONArray.optDouble(0)), (float) ((optJSONArray.optDouble(3) / 2.0d) + optJSONArray.optDouble(1))};
    }

    public final String a(final dc1 dc1Var, ya1 ya1Var, za1 za1Var, final JSONObject jSONObject) {
        float[] f7;
        char c10;
        int i10;
        int i11;
        if (jSONObject.has("wait")) {
            Thread.sleep(jSONObject.optLong("wait"));
        } else if (jSONObject.has("theme")) {
            final int i12 = 0;
            g(new Runnable() { // from class: org.telegram.ui.Components.wa1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            dc1Var.e(ec1.d("dark".equals(jSONObject.optString("theme"))));
                            break;
                        default:
                            dc1Var.f(jSONObject.optBoolean("visible"));
                            break;
                    }
                }
            });
        } else if (jSONObject.has("visible")) {
            final int i13 = 1;
            g(new Runnable() { // from class: org.telegram.ui.Components.wa1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            dc1Var.e(ec1.d("dark".equals(jSONObject.optString("theme"))));
                            break;
                        default:
                            dc1Var.f(jSONObject.optBoolean("visible"));
                            break;
                    }
                }
            });
        } else if (jSONObject.has("tap")) {
            float[] f10 = f(za1Var, jSONObject.optString("tap"));
            if (f10 == null) {
                return "tap " + jSONObject.optString("tap") + " (no target)";
            }
            ya1Var.c(f10, 60L);
        } else if (jSONObject.has("press")) {
            float[] f11 = f(za1Var, jSONObject.optString("press"));
            if (f11 == null) {
                return "press " + jSONObject.optString("press") + " (no target)";
            }
            ya1Var.c(f11, jSONObject.optLong("ms", 400L));
        } else if (jSONObject.has("dblclick")) {
            float[] f12 = f(za1Var, jSONObject.optString("dblclick"));
            if (f12 == null) {
                return "dblclick (no target)";
            }
            ya1Var.c(f12, 40L);
            Thread.sleep(80L);
            ya1Var.c(f12, 40L);
        } else if (jSONObject.has("drag")) {
            float[] f13 = f(za1Var, jSONObject.optString("drag"));
            if (f13 == null) {
                return "drag " + jSONObject.optString("drag") + " (no target)";
            }
            Object opt = jSONObject.opt("to");
            char c11 = 0;
            int i14 = 1;
            if (opt instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) opt;
                f7 = jSONObject.optBoolean("by") ? new float[]{f13[0] + ((float) jSONArray.optDouble(0)), f13[1] + ((float) jSONArray.optDouble(1))} : new float[]{(float) jSONArray.optDouble(0), (float) jSONArray.optDouble(1)};
            } else {
                f7 = f(za1Var, String.valueOf(opt));
                if (f7 == null) {
                    return "drag to " + opt + " (no target)";
                }
            }
            int max = Math.max(1, jSONObject.optInt("steps", 10));
            ya1Var.b(f13[0], f13[1]);
            int i15 = 1;
            while (i15 <= max) {
                Thread.sleep(16L);
                float f14 = i15 / max;
                float f15 = f13[c11];
                float z10 = c3.h0.z(f7[c11], f15, f14, f15);
                float f16 = f13[i14];
                float z11 = c3.h0.z(f7[i14], f16, f14, f16);
                if (ya1Var.d) {
                    i11 = max;
                    c10 = c11;
                    i10 = i14;
                } else {
                    ya1Var.e.g(new xa1(ya1Var.a, i14, z10, z11));
                    c3.s sVar = ya1Var.c;
                    double uptimeMillis = SystemClock.uptimeMillis();
                    double d = z10;
                    c10 = c11;
                    i10 = i14;
                    double d10 = z11;
                    i11 = max;
                    long j10 = sVar.a;
                    ya1Var.a(z10, z11, j10 == 0 ? -1 : WidgetSandboxNative.arbiterMove(j10, uptimeMillis, d, d10));
                }
                i15++;
                c11 = c10;
                max = i11;
                i14 = i10;
            }
            ya1Var.d(f7[c11], f7[i14]);
        } else {
            if (jSONObject.has("key")) {
                return "key " + jSONObject.optString("key");
            }
            if (jSONObject.has("wheel")) {
                return "wheel";
            }
            if (jSONObject.has("hover")) {
                return "hover";
            }
            if (jSONObject.has("rightclick")) {
                return "rightclick";
            }
        }
        Thread.sleep(120L);
        return null;
    }

    public final void d() {
        Handler handler = this.g;
        File file = this.b;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            try {
                JSONArray jSONArray2 = new JSONObject(c(new File(file, "manifest.json"))).getJSONArray("tests");
                WidgetSandboxNative.conformance(true);
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i12);
                    if ("auto".equals(jSONObject2.optString("set"))) {
                        String optString = jSONObject2.optString("id");
                        String str = this.e;
                        if (str == null || str.isEmpty() || optString.contains(str)) {
                            JSONObject e = e(jSONObject2);
                            jSONArray.put(e);
                            boolean optBoolean = e.optBoolean("ok");
                            if (optBoolean) {
                                i10++;
                            } else {
                                i11++;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(optBoolean ? "PASS " : "FAIL ");
                            sb2.append(optString);
                            sb2.append(" · ");
                            sb2.append(e.optString("summary"));
                            String sb3 = sb2.toString();
                            Log.i("WidgetConformance", sb3);
                            handler.post(new d71(8, this, sb3));
                        }
                    }
                }
                jSONObject.put("width", this.c).put("theme", this.d ? "dark" : "light").put("passed", i10).put("failed", i11).put("results", jSONArray);
                FileOutputStream fileOutputStream = new FileOutputStream(new File(file, "report.json"));
                try {
                    fileOutputStream.write(jSONObject.toString(2).getBytes(StandardCharsets.UTF_8));
                    fileOutputStream.close();
                    String str2 = "done · " + i10 + " passed · " + i11 + " failed · " + new File(file, "report.json");
                    Log.i("WidgetConformance", str2);
                    handler.post(new d71(8, this, str2));
                    WidgetSandboxNative.conformance(false);
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                WidgetSandboxNative.conformance(false);
                throw th4;
            }
        } catch (Exception e10) {
            String str3 = "error · " + e10;
            Log.i("WidgetConformance", str3);
            handler.post(new d71(8, this, str3));
            WidgetSandboxNative.conformance(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [int] */
    /* JADX WARN: Type inference failed for: r5v8, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20, types: [int] */
    /* JADX WARN: Type inference failed for: r9v39 */
    public final JSONObject e(JSONObject jSONObject) {
        boolean z10;
        boolean z11;
        int i10;
        String optString;
        JSONObject put = new JSONObject().put("id", jSONObject.optString("id"));
        String c10 = c(new File(this.b, jSONObject.optString("file")));
        za1 za1Var = new za1();
        boolean z12 = this.d;
        JSONArray optJSONArray = jSONObject.optJSONArray("themes");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            boolean z13 = false;
            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                z13 |= optJSONArray.optString(i11).equals(this.d ? "dark" : "light");
            }
            if (!z13) {
                z12 = "dark".equals(optJSONArray.optString(0));
            }
        }
        put.put("theme", z12 ? "dark" : "light");
        dc1 dc1Var = new dc1(this.a, c10, ec1.d(z12), 1, "en-US", null);
        JSONArray optJSONArray2 = jSONObject.optJSONArray("message");
        JSONObject jSONObject2 = (optJSONArray2 == null || optJSONArray2.length() <= 0) ? new JSONObject() : optJSONArray2.getJSONObject(0);
        String optString2 = jSONObject2.optString("kind", "private");
        String[][] strArr = h;
        String[] strArr2 = strArr[0];
        for (int i12 = 0; i12 < 7; i12++) {
            String[] strArr3 = strArr[i12];
            if (strArr3[0].equals(optString2)) {
                strArr2 = strArr3;
            }
        }
        int i13 = 1;
        JSONObject put2 = new JSONObject().put("isCopy", "1".equals(strArr2[1])).put("canQuery", "1".equals(strArr2[2])).put("backgroundQuery", "1".equals(strArr2[3])).put("preview", "1".equals(strArr2[4]));
        boolean equals = "1".equals(strArr2[1]);
        boolean equals2 = "1".equals(strArr2[4]);
        if (!equals && !equals2) {
            put2.put("chatType", "group".equals(optString2) ? jSONObject2.optString("chat", "group") : "private");
        }
        if ("1".equals(strArr2[2])) {
            put2.put("viewer", new JSONObject().put("id", 1000001).put("firstName", "Tester").put("username", "conformance_tester"));
        }
        String jSONObject3 = new JSONObject().put("data", new JSONObject().put("chatData", jSONObject2.has("chat_data") ? jSONObject2.getString("chat_data") : JSONObject.NULL).put("publicData", jSONObject2.has("public_data") ? jSONObject2.getString("public_data") : JSONObject.NULL)).put("context", put2).toString();
        if (jSONObject3 != null) {
            dc1Var.h = jSONObject3;
        }
        za1Var.b = dc1Var;
        za1Var.c = jSONObject.optJSONObject("bot");
        dc1Var.J = new b3(za1Var, 14);
        ya1 ya1Var = new ya1(this, dc1Var, za1Var);
        g(new d71(9, dc1Var, za1Var));
        try {
            dc1Var.g(Math.round(this.c * AndroidUtilities.density));
            JSONArray jSONArray = new JSONArray();
            HashSet hashSet = new HashSet();
            za1Var.k(new ai.d0(9), 15000L);
            JSONArray optJSONArray3 = jSONObject.optJSONArray("actions");
            int i14 = 0;
            while (optJSONArray3 != null) {
                try {
                    if (i14 >= optJSONArray3.length()) {
                        break;
                    }
                    String a2 = a(dc1Var, ya1Var, za1Var, optJSONArray3.getJSONObject(i14));
                    if (a2 != null) {
                        jSONArray.put(a2);
                        JSONArray optJSONArray4 = optJSONArray3.getJSONObject(i14).optJSONArray("ids");
                        for (int i15 = 0; optJSONArray4 != null && i15 < optJSONArray4.length(); i15++) {
                            hashSet.add(optJSONArray4.optString(i15));
                        }
                    }
                    i14++;
                } catch (Throwable th2) {
                    th = th2;
                    dc1Var.J = null;
                    c3.s sVar = ya1Var.c;
                    long j10 = sVar.a;
                    if (j10 != 0) {
                        WidgetSandboxNative.arbiterDestroy(j10);
                        sVar.a = 0L;
                    }
                    g(new oa1(dc1Var, 2));
                    throw th;
                }
            }
            za1Var.k(new ai.d0(10), 25000L);
            JSONObject jSONObject4 = za1Var.a;
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            boolean z14 = jSONObject4 != null && "done".equals(jSONObject4.optString("status"));
            if (jSONObject4 != null) {
                JSONArray optJSONArray5 = jSONObject4.optJSONArray("checks");
                int i16 = 0;
                while (true) {
                    if (optJSONArray5 == null) {
                        z11 = z14;
                        break;
                    }
                    z11 = z14;
                    if (i16 >= optJSONArray5.length()) {
                        break;
                    }
                    JSONArray optJSONArray6 = optJSONArray5.optJSONArray(i16);
                    if (optJSONArray6 == null) {
                        optString = "";
                        i10 = i16;
                    } else {
                        i10 = i16;
                        optString = optJSONArray6.optString(2);
                    }
                    String str = optString;
                    JSONArray jSONArray4 = optJSONArray5;
                    if (str.equals("fail") || str.equals("xpass") || str.equals("pending")) {
                        if (hashSet.contains(optJSONArray6.optString(0))) {
                            jSONArray3.put(optJSONArray6);
                        } else {
                            jSONArray2.put(optJSONArray6);
                            z14 = false;
                            i16 = i10 + 1;
                            optJSONArray5 = jSONArray4;
                        }
                    }
                    z14 = z11;
                    i16 = i10 + 1;
                    optJSONArray5 = jSONArray4;
                }
                z10 = false;
                z14 = z11;
            } else {
                z10 = false;
            }
            ?? b10 = b(jSONObject.optJSONArray("host"), za1Var, dc1Var);
            for (?? r52 = z10; r52 < b10.length(); r52++) {
                if (!b10.getJSONObject(r52).optBoolean("ok")) {
                    z14 = z10;
                }
            }
            JSONObject jSONObject5 = jSONObject4 == null ? new JSONObject() : jSONObject4.optJSONObject("n");
            put.put("ok", z14).put("status", jSONObject4 == null ? "no verdict" : jSONObject4.optString("status")).put("n", jSONObject5).put("failures", jSONArray2).put("host", b10).put("skipped", jSONArray).put("notApplicable", jSONArray3);
            StringBuilder sb2 = new StringBuilder(put.optString("status"));
            if (jSONObject5 != null) {
                String[] strArr4 = {"pass", "fail", "xfail", "xpass", "skip", "pending"};
                for (?? r92 = z10; r92 < 6; r92++) {
                    String str2 = strArr4[r92];
                    if (jSONObject5.optInt(str2) > 0) {
                        sb2.append(" · ");
                        sb2.append(str2);
                        sb2.append(' ');
                        sb2.append(jSONObject5.optInt(str2));
                    }
                }
            }
            int i17 = 0;
            while (i17 < jSONArray2.length()) {
                JSONArray jSONArray5 = jSONArray2.getJSONArray(i17);
                sb2.append("\n    ");
                sb2.append(jSONArray5.optString(2));
                sb2.append(" · ");
                sb2.append(jSONArray5.optString(i13));
                sb2.append(" · ");
                sb2.append(jSONArray5.optString(3));
                i17++;
                i13 = 1;
            }
            for (int i18 = 0; i18 < b10.length(); i18++) {
                JSONObject jSONObject6 = b10.getJSONObject(i18);
                if (!jSONObject6.optBoolean("ok")) {
                    sb2.append("\n    host fail · ");
                    sb2.append(jSONObject6.optString("name"));
                    sb2.append(" · ");
                    sb2.append(jSONObject6.optString("got"));
                }
            }
            if (jSONArray.length() > 0) {
                sb2.append("\n    not on touch: ");
                sb2.append(jSONArray.join(", "));
            }
            for (int i19 = 0; i19 < jSONArray3.length(); i19++) {
                JSONArray jSONArray6 = jSONArray3.getJSONArray(i19);
                sb2.append("\n    n/a on touch · ");
                sb2.append(jSONArray6.optString(1));
            }
            put.put("summary", sb2.toString());
            dc1Var.J = null;
            c3.s sVar2 = ya1Var.c;
            long j11 = sVar2.a;
            if (j11 != 0) {
                WidgetSandboxNative.arbiterDestroy(j11);
                sVar2.a = 0L;
            }
            g(new oa1(dc1Var, 2));
            return put;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void g(Runnable runnable) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.g.post(new pa1(runnable, countDownLatch, 1));
        countDownLatch.await(5L, TimeUnit.SECONDS);
    }
}
