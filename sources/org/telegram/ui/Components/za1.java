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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class za1 {
    public final Context a;
    public final File b;
    public final int c;
    public final boolean d;
    public final String e;
    public final org.telegram.ui.hl0 f;
    public final Handler g = new Handler(Looper.getMainLooper());

    public za1(WidgetConformanceActivity widgetConformanceActivity, int i10, boolean z10, String str, org.telegram.ui.hl0 hl0Var) {
        this.a = widgetConformanceActivity.getApplicationContext();
        this.b = new File(widgetConformanceActivity.getExternalFilesDir(null), "conformance");
        this.c = i10;
        this.d = z10;
        this.e = str;
        this.f = hl0Var;
    }

    public static JSONArray b(JSONArray jSONArray, ya1 ya1Var, yb1 yb1Var) {
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
                synchronized (ya1Var.c) {
                    try {
                        ArrayList arrayList = ya1Var.c;
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
                double min = yb1Var.D == null ? 0.0d : Math.min(600.0f, r5.e / AndroidUtilities.density);
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

    public static float[] f(ya1 ya1Var, String str) {
        JSONObject optJSONObject = ya1Var.a == null ? null : ya1Var.a.optJSONObject("targets");
        JSONArray optJSONArray = optJSONObject == null ? null : optJSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        return new float[]{(float) ((optJSONArray.optDouble(2) / 2.0d) + optJSONArray.optDouble(0)), (float) ((optJSONArray.optDouble(3) / 2.0d) + optJSONArray.optDouble(1))};
    }

    public final String a(final yb1 yb1Var, xa1 xa1Var, ya1 ya1Var, final JSONObject jSONObject) {
        float[] f7;
        char c10;
        int i10;
        int i11;
        if (jSONObject.has("wait")) {
            Thread.sleep(jSONObject.optLong("wait"));
        } else if (jSONObject.has("theme")) {
            final int i12 = 0;
            g(new Runnable() { // from class: org.telegram.ui.Components.va1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            yb1Var.d(zb1.d("dark".equals(jSONObject.optString("theme"))));
                            break;
                        default:
                            yb1Var.e(jSONObject.optBoolean("visible"));
                            break;
                    }
                }
            });
        } else if (jSONObject.has("visible")) {
            final int i13 = 1;
            g(new Runnable() { // from class: org.telegram.ui.Components.va1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            yb1Var.d(zb1.d("dark".equals(jSONObject.optString("theme"))));
                            break;
                        default:
                            yb1Var.e(jSONObject.optBoolean("visible"));
                            break;
                    }
                }
            });
        } else if (jSONObject.has("tap")) {
            float[] f10 = f(ya1Var, jSONObject.optString("tap"));
            if (f10 == null) {
                return "tap " + jSONObject.optString("tap") + " (no target)";
            }
            xa1Var.c(f10, 60L);
        } else if (jSONObject.has("press")) {
            float[] f11 = f(ya1Var, jSONObject.optString("press"));
            if (f11 == null) {
                return "press " + jSONObject.optString("press") + " (no target)";
            }
            xa1Var.c(f11, jSONObject.optLong("ms", 400L));
        } else if (jSONObject.has("dblclick")) {
            float[] f12 = f(ya1Var, jSONObject.optString("dblclick"));
            if (f12 == null) {
                return "dblclick (no target)";
            }
            xa1Var.c(f12, 40L);
            Thread.sleep(80L);
            xa1Var.c(f12, 40L);
        } else if (jSONObject.has("drag")) {
            float[] f13 = f(ya1Var, jSONObject.optString("drag"));
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
                f7 = f(ya1Var, String.valueOf(opt));
                if (f7 == null) {
                    return "drag to " + opt + " (no target)";
                }
            }
            int max = Math.max(1, jSONObject.optInt("steps", 10));
            xa1Var.b(f13[0], f13[1]);
            int i15 = 1;
            while (i15 <= max) {
                Thread.sleep(16L);
                float f14 = i15 / max;
                float f15 = f13[c11];
                float z10 = c3.h0.z(f7[c11], f15, f14, f15);
                float f16 = f13[i14];
                float z11 = c3.h0.z(f7[i14], f16, f14, f16);
                if (xa1Var.d) {
                    i11 = max;
                    c10 = c11;
                    i10 = i14;
                } else {
                    xa1Var.e.g(new wa1(xa1Var.a, i14, z10, z11));
                    c3.s sVar = xa1Var.c;
                    double uptimeMillis = SystemClock.uptimeMillis();
                    double d = z10;
                    c10 = c11;
                    i10 = i14;
                    double d10 = z11;
                    i11 = max;
                    long j10 = sVar.a;
                    xa1Var.a(z10, z11, j10 == 0 ? -1 : WidgetSandboxNative.arbiterMove(j10, uptimeMillis, d, d10));
                }
                i15++;
                c11 = c10;
                max = i11;
                i14 = i10;
            }
            xa1Var.d(f7[c11], f7[i14]);
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
                            handler.post(new c71(8, this, sb3));
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
                    handler.post(new c71(8, this, str2));
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
            handler.post(new c71(8, this, str3));
            WidgetSandboxNative.conformance(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [int] */
    /* JADX WARN: Type inference failed for: r8v21 */
    public final JSONObject e(JSONObject jSONObject) {
        boolean z10;
        JSONArray jSONArray;
        String optString;
        long j10;
        JSONObject put = new JSONObject().put("id", jSONObject.optString("id"));
        String c10 = c(new File(this.b, jSONObject.optString("file")));
        ya1 ya1Var = new ya1();
        boolean z11 = this.d;
        JSONArray optJSONArray = jSONObject.optJSONArray("themes");
        boolean z12 = false;
        if (optJSONArray != null && optJSONArray.length() > 0) {
            boolean z13 = false;
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                z13 |= optJSONArray.optString(i10).equals(this.d ? "dark" : "light");
            }
            if (!z13) {
                z11 = "dark".equals(optJSONArray.optString(0));
            }
        }
        put.put("theme", z11 ? "dark" : "light");
        yb1 yb1Var = new yb1(this.a, c10, zb1.d(z11), 1, "en-US", null);
        yb1Var.I = new b3(ya1Var, 14);
        xa1 xa1Var = new xa1(this, yb1Var, ya1Var);
        g(new c71(9, yb1Var, ya1Var));
        try {
            yb1Var.f(Math.round(this.c * AndroidUtilities.density));
            JSONArray jSONArray2 = new JSONArray();
            HashSet hashSet = new HashSet();
            long j11 = 0;
            ya1Var.h(new ai.d0(9), 15000L);
            JSONArray optJSONArray2 = jSONObject.optJSONArray("actions");
            int i11 = 0;
            while (optJSONArray2 != null) {
                try {
                    if (i11 >= optJSONArray2.length()) {
                        break;
                    }
                    String a2 = a(yb1Var, xa1Var, ya1Var, optJSONArray2.getJSONObject(i11));
                    if (a2 != null) {
                        jSONArray2.put(a2);
                        JSONArray optJSONArray3 = optJSONArray2.getJSONObject(i11).optJSONArray("ids");
                        int i12 = 0;
                        while (optJSONArray3 != null) {
                            j10 = j11;
                            if (i12 < optJSONArray3.length()) {
                                hashSet.add(optJSONArray3.optString(i12));
                                i12++;
                                j11 = j10;
                            }
                        }
                    }
                    j10 = j11;
                    i11++;
                    j11 = j10;
                } catch (Throwable th2) {
                    th = th2;
                    yb1Var.I = null;
                    c3.s sVar = xa1Var.c;
                    long j12 = sVar.a;
                    if (j12 != 0) {
                        WidgetSandboxNative.arbiterDestroy(j12);
                        sVar.a = 0L;
                    }
                    g(new na1(yb1Var, 2));
                    throw th;
                }
            }
            long j13 = j11;
            ya1Var.h(new ai.d0(10), 25000L);
            JSONObject jSONObject2 = ya1Var.a;
            JSONArray jSONArray3 = new JSONArray();
            JSONArray jSONArray4 = new JSONArray();
            boolean z14 = jSONObject2 != null && "done".equals(jSONObject2.optString("status"));
            if (jSONObject2 != null) {
                JSONArray optJSONArray4 = jSONObject2.optJSONArray("checks");
                int i13 = 0;
                while (true) {
                    if (optJSONArray4 == null) {
                        z10 = z14;
                        break;
                    }
                    z10 = z14;
                    if (i13 >= optJSONArray4.length()) {
                        break;
                    }
                    JSONArray optJSONArray5 = optJSONArray4.optJSONArray(i13);
                    if (optJSONArray5 == null) {
                        optString = "";
                        jSONArray = optJSONArray4;
                    } else {
                        jSONArray = optJSONArray4;
                        optString = optJSONArray5.optString(2);
                    }
                    String str = optString;
                    int i14 = i13;
                    if (str.equals("fail") || str.equals("xpass") || str.equals("pending")) {
                        if (hashSet.contains(optJSONArray5.optString(0))) {
                            jSONArray4.put(optJSONArray5);
                        } else {
                            jSONArray3.put(optJSONArray5);
                            z14 = false;
                            i13 = i14 + 1;
                            optJSONArray4 = jSONArray;
                        }
                    }
                    z14 = z10;
                    i13 = i14 + 1;
                    optJSONArray4 = jSONArray;
                }
                z12 = false;
                z14 = z10;
            }
            ?? b10 = b(jSONObject.optJSONArray("host"), ya1Var, yb1Var);
            for (?? r42 = z12; r42 < b10.length(); r42++) {
                if (!b10.getJSONObject(r42).optBoolean("ok")) {
                    z14 = z12;
                }
            }
            JSONObject jSONObject3 = jSONObject2 == null ? new JSONObject() : jSONObject2.optJSONObject("n");
            put.put("ok", z14).put("status", jSONObject2 == null ? "no verdict" : jSONObject2.optString("status")).put("n", jSONObject3).put("failures", jSONArray3).put("host", b10).put("skipped", jSONArray2).put("notApplicable", jSONArray4);
            StringBuilder sb2 = new StringBuilder(put.optString("status"));
            if (jSONObject3 != null) {
                String[] strArr = {"pass", "fail", "xfail", "xpass", "skip", "pending"};
                for (?? r82 = z12; r82 < 6; r82++) {
                    String str2 = strArr[r82];
                    if (jSONObject3.optInt(str2) > 0) {
                        sb2.append(" · ");
                        sb2.append(str2);
                        sb2.append(' ');
                        sb2.append(jSONObject3.optInt(str2));
                    }
                }
            }
            for (int i15 = 0; i15 < jSONArray3.length(); i15++) {
                JSONArray jSONArray5 = jSONArray3.getJSONArray(i15);
                sb2.append("\n    ");
                sb2.append(jSONArray5.optString(2));
                sb2.append(" · ");
                sb2.append(jSONArray5.optString(1));
                sb2.append(" · ");
                sb2.append(jSONArray5.optString(3));
            }
            for (int i16 = 0; i16 < b10.length(); i16++) {
                JSONObject jSONObject4 = b10.getJSONObject(i16);
                if (!jSONObject4.optBoolean("ok")) {
                    sb2.append("\n    host fail · ");
                    sb2.append(jSONObject4.optString("name"));
                    sb2.append(" · ");
                    sb2.append(jSONObject4.optString("got"));
                }
            }
            if (jSONArray2.length() > 0) {
                sb2.append("\n    not on touch: ");
                sb2.append(jSONArray2.join(", "));
            }
            for (int i17 = 0; i17 < jSONArray4.length(); i17++) {
                JSONArray jSONArray6 = jSONArray4.getJSONArray(i17);
                sb2.append("\n    n/a on touch · ");
                sb2.append(jSONArray6.optString(1));
            }
            put.put("summary", sb2.toString());
            yb1Var.I = null;
            c3.s sVar2 = xa1Var.c;
            long j14 = sVar2.a;
            if (j14 != j13) {
                WidgetSandboxNative.arbiterDestroy(j14);
                sVar2.a = j13;
            }
            g(new na1(yb1Var, 2));
            return put;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void g(Runnable runnable) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.g.post(new oa1(runnable, countDownLatch, 1));
        countDownLatch.await(5L, TimeUnit.SECONDS);
    }
}
