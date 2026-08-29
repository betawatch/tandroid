package f1;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import c1.e;
import com.google.android.gms.tasks.OnFailureListener;
import eg.h0;
import ha.c;
import ih.i5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import jh.s7;
import kg.q0;
import kotlin.jvm.internal.j;
import lh.c9;
import lh.g4;
import nh.d;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.l3;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.d61;
import org.telegram.ui.n20;
import org.telegram.ui.of0;
import org.telegram.ui.oy0;
import p2.g;
import p2.m;
import v0.i;
import v0.n;
import v0.p;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, c9, b2, oc0, m, MediaDataController.KeywordResultCallback {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override // p2.m
    public void b(g gVar, List list) {
        AndroidUtilities.runOnUIThread(new h0((of0) this.a, gVar, list, (String) this.b, (TLRPC.TL_inputStorePaymentAuthCode) this.c, (TLRPC.TL_payments_canPurchaseStore) this.d, (n20) this.e, 10));
    }

    @Override // lh.c9
    public void f(float f9, Canvas canvas, RectF rectF, boolean z10) {
        c cVar = (c) this.a;
        RectF rectF2 = (RectF) this.b;
        g4 g4Var = (g4) this.c;
        RectF rectF3 = (RectF) this.d;
        g4 g4Var2 = (g4) this.e;
        RectF rectF4 = g4Var.m;
        rectF2.set(rectF4);
        RectF rectF5 = g4Var2.m;
        rectF3.set(rectF5);
        rectF4.set(rectF);
        try {
            float width = rectF.width() / rectF2.width();
            float centerX = rectF.centerX() - ((((1.0f - f9) * 2.0f) + width) * (rectF2.centerX() - rectF3.centerX()));
            float centerY = rectF.centerY();
            float width2 = (rectF3.width() / 2.0f) * width;
            float height = (rectF3.height() / 2.0f) * width;
            rectF5.set(centerX - width2, centerY - height, centerX + width2, centerY + height);
        } catch (Exception unused) {
        }
        oy0 oy0Var = (oy0) cVar.b;
        int i10 = ProfileStoriesView.o0;
        oy0Var.a(canvas, g4Var, g4Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(c2 c2Var, int i10) {
        m3 m3Var = (m3) this.a;
        boolean[] zArr = (boolean[]) this.b;
        l3 l3Var = (l3) this.c;
        Utilities.Callback callback = (Utilities.Callback) this.d;
        c2[] c2VarArr = (c2[]) this.e;
        zArr[0] = true;
        m3Var.h(m3Var.w, l3Var, true);
        callback.run(Boolean.TRUE);
        c2VarArr[0].dismiss();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e10) {
        n request = (n) this.a;
        b bVar = (b) this.b;
        i iVar = (i) this.c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.e;
        j.e(e10, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        j.e(request, "request");
        for (p pVar : request.a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new e(bVar.e).g(request, cancellationSignal, executor, iVar);
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(g gVar, List list) {
        AndroidUtilities.runOnUIThread(new h0((s7) this.a, list, (i5) this.b, (TLRPC.TL_inputStorePaymentStarsGift) this.c, (TL_stars.TL_starsGiftOption) this.d, gVar, (Activity) this.e, 4));
    }

    @Override // org.telegram.ui.Components.oc0
    public void q(qc0 qc0Var, int i10) {
        c5.c((d) this.a, (qc0) this.b, (qc0) this.c, (qc0) this.d, (qc0) this.e);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        TLRPC.TL_availableReaction tL_availableReaction;
        d61 d61Var = (d61) this.a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        HashMap hashMap = (HashMap) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.e;
        d61Var.getClass();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.substring(9))));
                } else {
                    int i11 = d61Var.S;
                    if ((i11 == 1 || i11 == 11 || i11 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji)) != null) {
                        arrayList2.add(q0.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }
}
