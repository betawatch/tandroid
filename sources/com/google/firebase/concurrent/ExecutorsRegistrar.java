package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final i26 a = new i26(new vq2((byte) 1));
    public static final i26 b = new i26(new vq2((byte) 2));
    public static final i26 c = new i26(new vq2((byte) 3));
    public static final i26 d = new i26(new vq2((byte) 4));

    public static be3 a() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        detectNetwork.detectResourceMismatches();
        if (Build.VERSION.SDK_INT >= 26) {
            detectNetwork.detectUnbufferedIo();
        }
        return new be3(Executors.newFixedThreadPool(4, new q53("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        i09 i09Var = new i09(od0.class, ScheduledExecutorService.class);
        i09[] i09VarArr = {new i09(od0.class, ExecutorService.class), new i09(od0.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(i09Var);
        for (int i = 0; i < 2; i++) {
            bwe.a(i09VarArr[i], "Null interface");
        }
        Collections.addAll(hashSet, i09VarArr);
        fq2 fq2Var = new fq2(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new su3((byte) 10), hashSet3);
        i09 i09Var2 = new i09(ok0.class, ScheduledExecutorService.class);
        i09[] i09VarArr2 = {new i09(ok0.class, ExecutorService.class), new i09(ok0.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(i09Var2);
        for (int i2 = 0; i2 < 2; i2++) {
            bwe.a(i09VarArr2[i2], "Null interface");
        }
        Collections.addAll(hashSet4, i09VarArr2);
        fq2 fq2Var2 = new fq2(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new su3((byte) 11), hashSet6);
        i09 i09Var3 = new i09(m36.class, ScheduledExecutorService.class);
        i09[] i09VarArr3 = {new i09(m36.class, ExecutorService.class), new i09(m36.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(i09Var3);
        for (int i3 = 0; i3 < 2; i3++) {
            bwe.a(i09VarArr3[i3], "Null interface");
        }
        Collections.addAll(hashSet7, i09VarArr3);
        fq2 fq2Var3 = new fq2(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new su3((byte) 12), hashSet9);
        eq2 a2 = fq2.a(new i09(m8c.class, Executor.class));
        a2.f = new su3((byte) 13);
        return Arrays.asList(fq2Var, fq2Var2, fq2Var3, a2.b());
    }
}
