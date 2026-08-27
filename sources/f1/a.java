package f1;

import a9.i;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import c1.e;
import cg.h0;
import com.google.android.gms.tasks.OnFailureListener;
import gh.p5;
import hh.u7;
import ig.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import jh.c9;
import jh.g4;
import kotlin.jvm.internal.j;
import lh.d;
import n2.g;
import n2.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.l3;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.a61;
import org.telegram.ui.oy0;
import org.telegram.ui.rf0;
import v0.o;
import v0.q;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, c9, a2, dc0, m, MediaDataController.KeywordResultCallback {
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
        AndroidUtilities.runOnUIThread(new h0((rf0) this.a, gVar, list, (String) this.b, (TLRPC.TL_inputStorePaymentAuthCode) this.c, (TLRPC.TL_payments_canPurchaseStore) this.d, (l11) this.e, 10));
    }

    @Override // jh.c9
    public void d(float f10, Canvas canvas, RectF rectF, boolean z10) {
        i iVar = (i) this.a;
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
            float centerX = rectF.centerX() - ((((1.0f - f10) * 2.0f) + width) * (rectF2.centerX() - rectF3.centerX()));
            float centerY = rectF.centerY();
            float width2 = (rectF3.width() / 2.0f) * width;
            float height = (rectF3.height() / 2.0f) * width;
            rectF5.set(centerX - width2, centerY - height, centerX + width2, centerY + height);
        } catch (Exception unused) {
        }
        oy0 oy0Var = (oy0) iVar.b;
        int i10 = ProfileStoriesView.o0;
        oy0Var.a(canvas, g4Var, g4Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        m3 m3Var = (m3) this.a;
        boolean[] zArr = (boolean[]) this.b;
        l3 l3Var = (l3) this.c;
        Utilities.Callback callback = (Utilities.Callback) this.d;
        b2[] b2VarArr = (b2[]) this.e;
        zArr[0] = true;
        m3Var.h(m3Var.w, l3Var, true);
        callback.run(Boolean.TRUE);
        b2VarArr[0].dismiss();
    }

    @Override // org.telegram.ui.Components.dc0
    public void m(fc0 fc0Var, int i10) {
        y4.c((d) this.a, (fc0) this.b, (fc0) this.c, (fc0) this.d, (fc0) this.e);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e9) {
        o request = (o) this.a;
        b bVar = (b) this.b;
        v0.i iVar = (v0.i) this.c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.e;
        j.e(e9, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        j.e(request, "request");
        for (q qVar : request.a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new e(bVar.e).g(request, cancellationSignal, executor, iVar);
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(g gVar, List list) {
        AndroidUtilities.runOnUIThread(new h0((u7) this.a, list, (p5) this.b, (TLRPC.TL_inputStorePaymentStarsGift) this.c, (TL_stars.TL_starsGiftOption) this.d, gVar, (Activity) this.e, 4));
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        TLRPC.TL_availableReaction tL_availableReaction;
        a61 a61Var = (a61) this.a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        HashMap hashMap = (HashMap) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.e;
        a61Var.getClass();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.substring(9))));
                } else {
                    int i11 = a61Var.S;
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
