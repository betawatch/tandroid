package mb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import b8.kg;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import x7.i5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class j {
    public static final m6.c[] a = new m6.c[0];
    public static final m6.c b;
    public static final m6.c c;
    public static final v7.l d;

    static {
        m6.c cVar = new m6.c("vision.barcode", 1L);
        m6.c cVar2 = new m6.c("vision.custom.ica", 1L);
        m6.c cVar3 = new m6.c("vision.face", 1L);
        m6.c cVar4 = new m6.c("vision.ica", 1L);
        m6.c cVar5 = new m6.c("vision.ocr", 1L);
        m6.c cVar6 = new m6.c("mlkit.langid", 1L);
        b = cVar6;
        m6.c cVar7 = new m6.c("mlkit.nlclassifier", 1L);
        m6.c cVar8 = new m6.c("tflite_dynamite", 1L);
        m6.c cVar9 = new m6.c("mlkit.barcode.ui", 1L);
        m6.c cVar10 = new m6.c("mlkit.smartreply", 1L);
        c = new m6.c("mlkit.segmentation.subject", 1L);
        kg kgVar = new kg(23, (byte) 0);
        kgVar.C("barcode", cVar);
        kgVar.C("custom_ica", cVar2);
        kgVar.C("face", cVar3);
        kgVar.C("ica", cVar4);
        kgVar.C("ocr", cVar5);
        kgVar.C("langid", cVar6);
        kgVar.C("nlclassifier", cVar7);
        kgVar.C("tflite_dynamite", cVar8);
        kgVar.C("barcode_ui", cVar9);
        kgVar.C("smart_reply", cVar10);
        v7.e eVar = (v7.e) kgVar.d;
        if (eVar != null) {
            throw eVar.a();
        }
        v7.l c2 = v7.l.c(kgVar.b, (Object[]) kgVar.c, kgVar);
        v7.e eVar2 = (v7.e) kgVar.d;
        if (eVar2 != null) {
            throw eVar2.a();
        }
        d = c2;
        kg kgVar2 = new kg(23, (byte) 0);
        kgVar2.C("com.google.android.gms.vision.barcode", cVar);
        kgVar2.C("com.google.android.gms.vision.custom.ica", cVar2);
        kgVar2.C("com.google.android.gms.vision.face", cVar3);
        kgVar2.C("com.google.android.gms.vision.ica", cVar4);
        kgVar2.C("com.google.android.gms.vision.ocr", cVar5);
        kgVar2.C("com.google.android.gms.mlkit.langid", cVar6);
        kgVar2.C("com.google.android.gms.mlkit.nlclassifier", cVar7);
        kgVar2.C("com.google.android.gms.tflite_dynamite", cVar8);
        kgVar2.C("com.google.android.gms.mlkit_smartreply", cVar10);
        v7.e eVar3 = (v7.e) kgVar2.d;
        if (eVar3 != null) {
            throw eVar3.a();
        }
        v7.l.c(kgVar2.b, (Object[]) kgVar2.c, kgVar2);
        v7.e eVar4 = (v7.e) kgVar2.d;
        if (eVar4 != null) {
            throw eVar4.a();
        }
    }

    public static boolean a(Context context, m6.c[] cVarArr) {
        try {
            return ((t6.a) Tasks.await(new u6.e(context, u6.e.l, com.google.android.gms.common.api.b.j, com.google.android.gms.common.api.i.c).f(new r(cVarArr, 1)).addOnFailureListener(new ra.e(14)))).a;
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e10);
            return false;
        }
    }

    public static void b(Context context) {
        v7.b bVar = v7.d.b;
        Object[] objArr = {"ica"};
        i5.a(1, objArr);
        v7.g gVar = new v7.g(1, objArr);
        m6.e.b.getClass();
        if (m6.e.a(context) < 221500000) {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", gVar));
            intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
            context.sendBroadcast(intent);
            return;
        }
        int i3 = gVar.d;
        m6.c[] cVarArr = new m6.c[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            m6.c cVar = (m6.c) d.get(gVar.get(i10));
            p6.m.g(cVar);
            cVarArr[i10] = cVar;
        }
        c(context, cVarArr);
    }

    public static void c(Context context, m6.c[] cVarArr) {
        Task e10;
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        arrayList.add(new r(cVarArr, 0));
        p6.m.a("APIs must not be empty.", !arrayList.isEmpty());
        u6.e eVar = new u6.e(context, u6.e.l, com.google.android.gms.common.api.b.j, com.google.android.gms.common.api.i.c);
        u6.a b10 = u6.a.b(arrayList, true);
        if (b10.a.isEmpty()) {
            e10 = Tasks.forResult(new t6.c(0, false));
        } else {
            com.google.android.gms.common.api.internal.s b11 = t.b();
            b11.d = new m6.c[]{m7.b.d};
            b11.b = true;
            b11.a = 27304;
            b11.c = new m2.t(eVar, b10, z10, 29);
            e10 = eVar.e(0, b11.a());
        }
        e10.addOnFailureListener(new nb.a(14));
    }
}
