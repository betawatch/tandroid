package bi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.dz0;
import org.telegram.ui.f61;
import org.telegram.ui.qf0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p7 implements BillingController.ProductDetailsResponseListenerLegacy, di.s9, OnFailureListener, org.telegram.ui.ActionBar.b2, ld0, d5.p, MediaDataController.KeywordResultCallback {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override // d5.p
    public void a(d5.i iVar, List list) {
        AndroidUtilities.runOnUIThread(new r7((qf0) this.a, iVar, list, (String) this.b, (TLRPC.TL_inputStorePaymentAuthCode) this.c, (TLRPC.TL_payments_canPurchaseStore) this.d, (e10) this.e, 8));
    }

    @Override // di.s9
    public void d(float f7, Canvas canvas, RectF rectF, boolean z10) {
        rb.c cVar = (rb.c) this.a;
        RectF rectF2 = (RectF) this.b;
        di.s4 s4Var = (di.s4) this.c;
        RectF rectF3 = (RectF) this.d;
        di.s4 s4Var2 = (di.s4) this.e;
        RectF rectF4 = s4Var.m;
        rectF2.set(rectF4);
        RectF rectF5 = s4Var2.m;
        rectF3.set(rectF5);
        rectF4.set(rectF);
        try {
            float width = rectF.width() / rectF2.width();
            float centerX = rectF.centerX() - ((((1.0f - f7) * 2.0f) + width) * (rectF2.centerX() - rectF3.centerX()));
            float centerY = rectF.centerY();
            float width2 = (rectF3.width() / 2.0f) * width;
            float height = (rectF3.height() / 2.0f) * width;
            rectF5.set(centerX - width2, centerY - height, centerX + width2, centerY + height);
        } catch (Exception unused) {
        }
        dz0 dz0Var = (dz0) cVar.b;
        int i10 = ProfileStoriesView.s0;
        dz0Var.a(canvas, s4Var, s4Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        org.telegram.ui.ActionBar.s3 s3Var = (org.telegram.ui.ActionBar.s3) this.a;
        boolean[] zArr = (boolean[]) this.b;
        org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) this.c;
        Utilities.Callback callback = (Utilities.Callback) this.d;
        org.telegram.ui.ActionBar.e2[] e2VarArr = (org.telegram.ui.ActionBar.e2[]) this.e;
        zArr[0] = true;
        s3Var.h(s3Var.w, r3Var, true);
        callback.run(Boolean.TRUE);
        e2VarArr[0].dismiss();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e) {
        v0.n request = (v0.n) this.a;
        f1.a aVar = (f1.a) this.b;
        v0.i iVar = (v0.i) this.c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.e;
        kotlin.jvm.internal.i.e(e, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        kotlin.jvm.internal.i.e(request, "request");
        for (v0.p pVar : request.a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new c1.e(aVar.e).g(request, cancellationSignal, executor, iVar);
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(d5.i iVar, List list) {
        AndroidUtilities.runOnUIThread(new r7((ca) this.a, list, (lc) this.b, (TLRPC.TL_inputStorePaymentStarsGift) this.c, (TL_stars.TL_starsGiftOption) this.d, iVar, (Activity) this.e, 2));
    }

    @Override // org.telegram.ui.Components.ld0
    public void q(nd0 nd0Var, int i10) {
        org.telegram.ui.Components.g5.c((fi.d) this.a, (nd0) this.b, (nd0) this.c, (nd0) this.d, (nd0) this.e);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        TLRPC.TL_availableReaction tL_availableReaction;
        f61 f61Var = (f61) this.a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        HashMap hashMap = (HashMap) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.e;
        f61Var.getClass();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.substring(9))));
                } else {
                    int i11 = f61Var.W;
                    if ((i11 == 1 || i11 == 11 || i11 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji)) != null) {
                        arrayList2.add(bh.x0.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }
}
