package f1;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import c1.f;
import com.google.android.gms.tasks.OnFailureListener;
import hg.g0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import lh.i5;
import mh.t7;
import ng.q0;
import oh.c9;
import oh.h4;
import oh.i4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.ActionBar.o3;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.b30;
import org.telegram.ui.fz0;
import org.telegram.ui.w61;
import org.telegram.ui.xf0;
import p2.h;
import p2.n;
import qh.d;
import v0.i;
import v0.p;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, c9, c2, wc0, n, MediaDataController.KeywordResultCallback {
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

    @Override // p2.n
    public void b(h hVar, List list) {
        AndroidUtilities.runOnUIThread(new g0((xf0) this.a, hVar, list, (String) this.b, (TLRPC.TL_inputStorePaymentAuthCode) this.c, (TLRPC.TL_payments_canPurchaseStore) this.d, (b30) this.e, 10));
    }

    @Override // oh.c9
    public void g(float f10, Canvas canvas, RectF rectF, boolean z4) {
        h4 h4Var = (h4) this.a;
        RectF rectF2 = (RectF) this.b;
        i4 i4Var = (i4) this.c;
        RectF rectF3 = (RectF) this.d;
        i4 i4Var2 = (i4) this.e;
        RectF rectF4 = i4Var.m;
        rectF2.set(rectF4);
        RectF rectF5 = i4Var2.m;
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
        fz0 fz0Var = (fz0) h4Var.b;
        int i10 = ProfileStoriesView.p0;
        fz0Var.a(canvas, i4Var, i4Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(d2 d2Var, int i10) {
        o3 o3Var = (o3) this.a;
        boolean[] zArr = (boolean[]) this.b;
        n3 n3Var = (n3) this.c;
        Utilities.Callback callback = (Utilities.Callback) this.d;
        d2[] d2VarArr = (d2[]) this.e;
        zArr[0] = true;
        o3Var.h(o3Var.w, n3Var, true);
        callback.run(Boolean.TRUE);
        d2VarArr[0].dismiss();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e6) {
        v0.n request = (v0.n) this.a;
        b bVar = (b) this.b;
        i iVar = (i) this.c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.e;
        j.e(e6, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        j.e(request, "request");
        for (p pVar : request.a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new f(bVar.e).g(request, cancellationSignal, executor, iVar);
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(h hVar, List list) {
        AndroidUtilities.runOnUIThread(new g0((t7) this.a, list, (i5) this.b, (TLRPC.TL_inputStorePaymentStarsGift) this.c, (TL_stars.TL_starsGiftOption) this.d, hVar, (Activity) this.e, 4));
    }

    @Override // org.telegram.ui.Components.wc0
    public void q(yc0 yc0Var, int i10) {
        z4.c((d) this.a, (yc0) this.b, (yc0) this.c, (yc0) this.d, (yc0) this.e);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        TLRPC.TL_availableReaction tL_availableReaction;
        w61 w61Var = (w61) this.a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        HashMap hashMap = (HashMap) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.e;
        w61Var.getClass();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.substring(9))));
                } else {
                    int i11 = w61Var.T;
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
