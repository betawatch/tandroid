package cb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.biometric.f0;
import b4.e0;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j7.t7;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class k {
    public static final y5.c[] a = new y5.c[0];
    public static final y5.c b;
    public static final y5.c c;
    public static final h7.l d;

    static {
        y5.c cVar = new y5.c("vision.barcode", 1L);
        y5.c cVar2 = new y5.c("vision.custom.ica", 1L);
        y5.c cVar3 = new y5.c("vision.face", 1L);
        y5.c cVar4 = new y5.c("vision.ica", 1L);
        y5.c cVar5 = new y5.c("vision.ocr", 1L);
        y5.c cVar6 = new y5.c("mlkit.langid", 1L);
        b = cVar6;
        y5.c cVar7 = new y5.c("mlkit.nlclassifier", 1L);
        y5.c cVar8 = new y5.c("tflite_dynamite", 1L);
        y5.c cVar9 = new y5.c("mlkit.barcode.ui", 1L);
        y5.c cVar10 = new y5.c("mlkit.smartreply", 1L);
        c = new y5.c("mlkit.segmentation.subject", 1L);
        e0 e0Var = new e0(8, (byte) 0);
        e0Var.C("barcode", cVar);
        e0Var.C("custom_ica", cVar2);
        e0Var.C("face", cVar3);
        e0Var.C("ica", cVar4);
        e0Var.C("ocr", cVar5);
        e0Var.C("langid", cVar6);
        e0Var.C("nlclassifier", cVar7);
        e0Var.C("tflite_dynamite", cVar8);
        e0Var.C("barcode_ui", cVar9);
        e0Var.C("smart_reply", cVar10);
        h7.e eVar = (h7.e) e0Var.d;
        if (eVar != null) {
            throw eVar.a();
        }
        h7.l b10 = h7.l.b(e0Var.b, (Object[]) e0Var.c, e0Var);
        h7.e eVar2 = (h7.e) e0Var.d;
        if (eVar2 != null) {
            throw eVar2.a();
        }
        d = b10;
        e0 e0Var2 = new e0(8, (byte) 0);
        e0Var2.C("com.google.android.gms.vision.barcode", cVar);
        e0Var2.C("com.google.android.gms.vision.custom.ica", cVar2);
        e0Var2.C("com.google.android.gms.vision.face", cVar3);
        e0Var2.C("com.google.android.gms.vision.ica", cVar4);
        e0Var2.C("com.google.android.gms.vision.ocr", cVar5);
        e0Var2.C("com.google.android.gms.mlkit.langid", cVar6);
        e0Var2.C("com.google.android.gms.mlkit.nlclassifier", cVar7);
        e0Var2.C("com.google.android.gms.tflite_dynamite", cVar8);
        e0Var2.C("com.google.android.gms.mlkit_smartreply", cVar10);
        h7.e eVar3 = (h7.e) e0Var2.d;
        if (eVar3 != null) {
            throw eVar3.a();
        }
        h7.l.b(e0Var2.b, (Object[]) e0Var2.c, e0Var2);
        h7.e eVar4 = (h7.e) e0Var2.d;
        if (eVar4 != null) {
            throw eVar4.a();
        }
    }

    public static boolean a(Context context, y5.c[] cVarArr) {
        try {
            return ((f6.a) Tasks.await(new g6.g(context, g6.g.k, com.google.android.gms.common.api.b.i, com.google.android.gms.common.api.i.c).f(new t(cVarArr, 1)).addOnFailureListener(new ab.a(4)))).a;
        } catch (InterruptedException | ExecutionException e6) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e6);
            return false;
        }
    }

    public static void b(Context context) {
        h7.b bVar = h7.d.b;
        Object[] objArr = {"ica"};
        t7.a(1, objArr);
        h7.g gVar = new h7.g(1, objArr);
        y5.e.b.getClass();
        if (y5.e.a(context) < 221500000) {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", gVar));
            intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
            context.sendBroadcast(intent);
            return;
        }
        int i10 = gVar.d;
        y5.c[] cVarArr = new y5.c[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            y5.c cVar = (y5.c) d.get(gVar.get(i11));
            b6.m.h(cVar);
            cVarArr[i11] = cVar;
        }
        c(context, cVarArr);
    }

    public static void c(Context context, y5.c[] cVarArr) {
        Task e6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new t(cVarArr, 0));
        b6.m.a("APIs must not be empty.", !arrayList.isEmpty());
        g6.g gVar = new g6.g(context, g6.g.k, com.google.android.gms.common.api.b.i, com.google.android.gms.common.api.i.c);
        g6.a e10 = g6.a.e(arrayList, true);
        if (e10.a.isEmpty()) {
            e6 = Tasks.forResult(new f6.c(0, false));
        } else {
            v e11 = w.e();
            e11.d = new y5.c[]{y6.b.c};
            e11.b = true;
            e11.a = 27304;
            e11.c = new f0(gVar, e10);
            e6 = gVar.e(0, e11.e());
        }
        e6.addOnFailureListener(new z9.d(3));
    }
}
