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
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.WidgetConformanceActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ra1 {
    public final Context a;
    public final File b;
    public final String c;
    public final org.telegram.ui.jl0 d;
    public final Handler e = new Handler(Looper.getMainLooper());

    public ra1(WidgetConformanceActivity widgetConformanceActivity, String str, org.telegram.ui.jl0 jl0Var) {
        this.a = widgetConformanceActivity.getApplicationContext();
        this.b = new File(widgetConformanceActivity.getExternalFilesDir(null), "attacks");
        this.c = str;
        this.d = jl0Var;
    }

    public final void a(String str) {
        Log.i("WidgetAttacks", str);
        this.e.post(new d71(7, this, str));
    }

    public final void b() {
        boolean z10;
        int i10;
        File file = this.b;
        JSONArray jSONArray = new JSONArray();
        try {
            try {
                int i11 = 2;
                File[] listFiles = file.listFiles(new da.a(2));
                try {
                    if (listFiles == null) {
                        throw new IllegalStateException("no " + file);
                    }
                    Arrays.sort(listFiles);
                    boolean z11 = true;
                    WidgetSandboxNative.attackScan(true);
                    int length = listFiles.length;
                    int i12 = 0;
                    int i13 = 0;
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        String str = "dead";
                        if (i12 < length) {
                            File file2 = listFiles[i12];
                            String str2 = this.c;
                            if (str2 == null || str2.isEmpty()) {
                                z10 = z11;
                            } else {
                                z10 = z11;
                                if (!file2.getName().contains(str2)) {
                                    i10 = i11;
                                    i12++;
                                    z11 = z10;
                                    i11 = i10;
                                }
                            }
                            JSONObject c10 = c(file2);
                            jSONArray.put(c10);
                            i13++;
                            if (!c10.optBoolean("ok")) {
                                i14++;
                            }
                            if (!c10.optString("dead").isEmpty()) {
                                i15++;
                            }
                            String name = file2.getName();
                            if (!c10.optBoolean("ok")) {
                                str = "FAIL";
                            } else if (c10.optString("dead").isEmpty()) {
                                str = "ok";
                            }
                            String optString = c10.optString("summary");
                            i10 = i11;
                            Object[] objArr = new Object[3];
                            objArr[0] = name;
                            objArr[z10 ? 1 : 0] = str;
                            objArr[i10] = optString;
                            a(String.format("%-40s %-6s %s", objArr));
                            JSONArray optJSONArray = c10.optJSONArray("problems");
                            for (int i16 = 0; optJSONArray != null && i16 < optJSONArray.length(); i16++) {
                                a("    " + optJSONArray.optString(i16));
                            }
                            i12++;
                            z11 = z10;
                            i11 = i10;
                        } else {
                            int i17 = i11;
                            JSONObject put = new JSONObject().put("width", 390).put("files", i13).put("failed", i14).put("dead", i15).put("results", jSONArray);
                            File file3 = new File(file, "report.json");
                            FileOutputStream fileOutputStream = new FileOutputStream(file3);
                            try {
                                fileOutputStream.write(put.toString(i17).getBytes(StandardCharsets.UTF_8));
                                fileOutputStream.close();
                                a("done · " + i13 + " attacks · " + i14 + " failed · " + i15 + " runtimes killed by limits · " + file3);
                                WidgetSandboxNative.attackScan(false);
                                return;
                            } finally {
                            }
                        }
                    }
                } catch (Exception e) {
                    e = e;
                    a("error · " + e);
                    WidgetSandboxNative.attackScan(false);
                }
            } catch (Throwable th2) {
                th = th2;
                WidgetSandboxNative.attackScan(false);
                throw th;
            }
        } catch (Exception e10) {
            e = e10;
        } catch (Throwable th3) {
            th = th3;
            WidgetSandboxNative.attackScan(false);
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    public final JSONObject c(File file) {
        int i10;
        long j10;
        String str;
        String str2;
        JSONObject put = new JSONObject().put("file", file.getName());
        qa1 qa1Var = new qa1();
        Context context = this.a;
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[16384];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
            fileInputStream.close();
            dc1 dc1Var = new dc1(context, byteArrayOutputStream2, ec1.d(false), 1, "en-US", null);
            dc1Var.K = new b3(qa1Var, 13);
            d(new d71(6, dc1Var, qa1Var));
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                try {
                    dc1Var.g(Math.round(AndroidUtilities.density * 390.0f));
                } catch (Exception e) {
                    qa1Var.b = String.valueOf(e.getMessage());
                }
                qa1Var.m();
                int k10 = qa1Var.k();
                d(new oa1(dc1Var, 0));
                Thread.sleep(80L);
                d(new oa1(dc1Var, 1));
                long uptimeMillis2 = SystemClock.uptimeMillis();
                Thread.sleep(1500L);
                int k11 = (qa1Var.k() - k10) - qa1Var.o(k10);
                if (qa1Var.n() > 0) {
                    Thread.sleep(Math.max(0L, (uptimeMillis2 + 6500) - SystemClock.uptimeMillis()));
                    int n10 = qa1Var.n();
                    Thread.sleep(2000L);
                    i10 = qa1Var.n() - n10;
                } else {
                    i10 = 0;
                }
                JSONArray jSONArray = new JSONArray();
                synchronized (qa1Var.d) {
                    try {
                        ArrayList arrayList = qa1Var.d;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            jSONArray.put("LEAK " + ((String) obj));
                            uptimeMillis = uptimeMillis;
                        }
                        j10 = uptimeMillis;
                    } finally {
                    }
                }
                if (k10 > qa1Var.p(k10)) {
                    jSONArray.put("ACTION before the tap: " + qa1Var.l());
                }
                boolean z10 = true;
                if (k11 > 1) {
                    jSONArray.put("ACTIONS after one tap: " + qa1Var.l());
                }
                if (i10 > 0) {
                    jSONArray.put("HAPTICS " + i10 + " outside a touch after its series");
                }
                JSONObject jSONObject = qa1Var.a;
                String optString = jSONObject == null ? "" : jSONObject.optString("dead");
                JSONObject put2 = put.put("ok", jSONArray.length() == 0).put("problems", jSONArray).put("dead", optString);
                if (jSONObject == null || !jSONObject.optBoolean("loaded")) {
                    z10 = false;
                }
                put2.put("loaded", z10).put("actions", qa1Var.k()).put("ms", SystemClock.uptimeMillis() - j10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(jSONObject == null ? "no diagnostics" : jSONObject.optString("diagnostic"));
                if (optString.isEmpty()) {
                    str = "";
                } else {
                    str = " — " + optString;
                }
                sb2.append(str);
                if (qa1Var.b != null) {
                    str2 = " — failure: " + qa1Var.b;
                } else {
                    str2 = "";
                }
                sb2.append(str2);
                String sb3 = sb2.toString();
                if (sb3.length() > 140) {
                    sb3 = sb3.substring(0, 140);
                }
                put.put("summary", sb3);
                return put;
            } finally {
                d(new oa1(dc1Var, 2));
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public final void d(Runnable runnable) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.e.post(new pa1(runnable, countDownLatch, 0));
        countDownLatch.await(5L, TimeUnit.SECONDS);
    }
}
