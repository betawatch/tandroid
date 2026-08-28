package f1;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bg.k0;
import c1.e;
import com.google.android.gms.tasks.OnFailureListener;
import fh.w5;
import gh.v7;
import hg.r0;
import ih.g9;
import ih.k4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import k5.i;
import kh.d;
import n2.g;
import n2.m;
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
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.b61;
import org.telegram.ui.of0;
import org.telegram.ui.oy0;
import v0.o;
import v0.q;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, g9, b2, zb0, m, MediaDataController.KeywordResultCallback {
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

    @Override // n2.m
    public void c(g gVar, List list) {
        AndroidUtilities.runOnUIThread(new k0((of0) this.a, gVar, list, (String) this.b, (TLRPC.TL_inputStorePaymentAuthCode) this.c, (TLRPC.TL_payments_canPurchaseStore) this.d, (no0) this.e, 10));
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i9) {
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

    @Override // ih.g9
    public void g(float f10, Canvas canvas, RectF rectF, boolean z10) {
        i iVar = (i) this.a;
        RectF rectF2 = (RectF) this.b;
        k4 k4Var = (k4) this.c;
        RectF rectF3 = (RectF) this.d;
        k4 k4Var2 = (k4) this.e;
        RectF rectF4 = k4Var.m;
        rectF2.set(rectF4);
        RectF rectF5 = k4Var2.m;
        rectF3.set(rectF5);
        rectF4.set(rectF);
        try {
            float width = rectF.width() / rectF2.width();
            float centerX = rectF.centerX() - ((((1.0f - f10) * 2.0f) + width) * (rectF2.centerX() - rectF3.centerX()));
            float centerY = rectF.centerY();
            float width2 = (rectF3.width() / 2.0f) * width;
            float height = (rectF3.height() / 2.0f) * width;
            rectF5.set(centerX - width2, centerY - height, centerX + width2, centerY + height);
        } catch (Exception unused) {
        }
        oy0 oy0Var = (oy0) iVar.b;
        int i9 = ProfileStoriesView.o0;
        oy0Var.a(canvas, k4Var, k4Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override // org.telegram.ui.Components.zb0
    public void m(bc0 bc0Var, int i9) {
        y4.c((d) this.a, (bc0) this.b, (bc0) this.c, (bc0) this.d, (bc0) this.e);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e10) {
        o request = (o) this.a;
        b bVar = (b) this.b;
        v0.i iVar = (v0.i) this.c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.e;
        kotlin.jvm.internal.i.e(e10, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        kotlin.jvm.internal.i.e(request, "request");
        for (q qVar : request.a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new e(bVar.e).g(request, cancellationSignal, executor, iVar);
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(g gVar, List list) {
        AndroidUtilities.runOnUIThread(new k0((v7) this.a, list, (w5) this.b, (TLRPC.TL_inputStorePaymentStarsGift) this.c, (TL_stars.TL_starsGiftOption) this.d, gVar, (Activity) this.e, 4));
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        TLRPC.TL_availableReaction tL_availableReaction;
        b61 b61Var = (b61) this.a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        HashMap hashMap = (HashMap) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.e;
        b61Var.getClass();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            try {
                if (((MediaDataController.KeywordResult) arrayList.get(i9)).emoji.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((MediaDataController.KeywordResult) arrayList.get(i9)).emoji.substring(9))));
                } else {
                    int i10 = b61Var.S;
                    if ((i10 == 1 || i10 == 11 || i10 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((MediaDataController.KeywordResult) arrayList.get(i9)).emoji)) != null) {
                        arrayList2.add(r0.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }
}
