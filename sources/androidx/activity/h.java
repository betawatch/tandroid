package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.e0;
import androidx.fragment.app.j0;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h extends androidx.activity.result.f {
    public final /* synthetic */ m h;

    public h(m mVar) {
        this.h = mVar;
    }

    @Override // androidx.activity.result.f
    public final void b(int i9, e0 e0Var, Object obj) {
        e.a aVar;
        Intent input;
        Bundle bundleExtra;
        Bundle bundle;
        int i10;
        int i11 = e0Var.a;
        m mVar = this.h;
        switch (i11) {
            case 1:
                String[] input2 = (String[]) obj;
                kotlin.jvm.internal.i.e(input2, "input");
                if (input2.length == 0) {
                    aVar = new e.a(pc.p.a);
                    break;
                } else {
                    for (String str : input2) {
                        if (f0.e.b(mVar, str) == 0) {
                        }
                    }
                    int a2 = pc.r.a(input2.length);
                    if (a2 < 16) {
                        a2 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(a2);
                    for (String str2 : input2) {
                        linkedHashMap.put(str2, Boolean.TRUE);
                    }
                    aVar = new e.a(linkedHashMap);
                    break;
                }
            default:
                aVar = null;
                break;
        }
        if (aVar != null) {
            new Handler(Looper.getMainLooper()).post(new g(this, i9, aVar, 0));
            return;
        }
        switch (e0Var.a) {
            case 0:
                androidx.activity.result.g gVar = (androidx.activity.result.g) obj;
                input = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent = gVar.b;
                if (intent != null && (bundleExtra = intent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    input.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = gVar.a;
                        kotlin.jvm.internal.i.e(intentSender, "intentSender");
                        gVar = new androidx.activity.result.g(intentSender, null, gVar.c, gVar.d);
                    }
                }
                input.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", gVar);
                if (j0.K(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + input);
                    break;
                }
                break;
            case 1:
                String[] input3 = (String[]) obj;
                kotlin.jvm.internal.i.e(input3, "input");
                input = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input3);
                kotlin.jvm.internal.i.d(input, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                break;
            case 2:
                input = (Intent) obj;
                kotlin.jvm.internal.i.e(input, "input");
                break;
            default:
                androidx.activity.result.g input4 = (androidx.activity.result.g) obj;
                kotlin.jvm.internal.i.e(input4, "input");
                input = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input4);
                kotlin.jvm.internal.i.d(input, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
                break;
        }
        if (input.getExtras() != null && input.getExtras().getClassLoader() == null) {
            input.setExtrasClassLoader(mVar.getClassLoader());
        }
        if (input.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = input.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            input.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(input.getAction())) {
            String[] stringArrayExtra = input.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            e0.e.g(mVar, stringArrayExtra, i9);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(input.getAction())) {
            mVar.startActivityForResult(input, i9, bundle2);
            return;
        }
        androidx.activity.result.g gVar2 = (androidx.activity.result.g) input.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            i10 = i9;
            try {
                mVar.startIntentSenderForResult(gVar2.a, i10, gVar2.b, gVar2.c, gVar2.d, 0, bundle2);
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                new Handler(Looper.getMainLooper()).post(new g(this, i10, e, 1));
            }
        } catch (IntentSender.SendIntentException e11) {
            e = e11;
            i10 = i9;
        }
    }
}
