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
import org.telegram.messenger.c20;
import org.telegram.messenger.qi;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.fv0;
import org.telegram.ui.od0;
import org.telegram.ui.t11;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q7 implements org.telegram.messenger.q1, di.k9, OnFailureListener, org.telegram.ui.ActionBar.r1, fb0, f5.m, ri {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override // org.telegram.messenger.q1
    public void a(f5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new r7((ea) this.a, list, (mc) this.b, (TLRPC.TL_inputStorePaymentStarsGift) this.c, (TL_stars.TL_starsGiftOption) this.d, fVar, (Activity) this.e, 1));
    }

    @Override // f5.m
    public void b(f5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new r7((od0) this.a, fVar, list, (String) this.b, (TLRPC.TL_inputStorePaymentAuthCode) this.c, (TLRPC.TL_payments_canPurchaseStore) this.d, (kn0) this.e, 8));
    }

    @Override // org.telegram.messenger.ri
    public void e(String str, ArrayList arrayList) {
        TLRPC.TL_availableReaction tL_availableReaction;
        t11 t11Var = (t11) this.a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        HashMap hashMap = (HashMap) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.e;
        t11Var.getClass();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (((qi) arrayList.get(i7)).a.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((qi) arrayList.get(i7)).a.substring(9))));
                } else {
                    int i10 = t11Var.W;
                    if ((i10 == 1 || i10 == 11 || i10 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((qi) arrayList.get(i7)).a)) != null) {
                        arrayList2.add(ch.o0.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.a;
        boolean[] zArr = (boolean[]) this.b;
        org.telegram.ui.ActionBar.d3 d3Var = (org.telegram.ui.ActionBar.d3) this.c;
        c20 c20Var = (c20) this.d;
        org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.e;
        zArr[0] = true;
        e3Var.h(e3Var.x, d3Var, true);
        c20Var.a(Boolean.TRUE);
        u1VarArr[0].dismiss();
    }

    @Override // di.k9
    public void k(float f10, Canvas canvas, RectF rectF, boolean z9) {
        aa.n nVar = (aa.n) this.a;
        RectF rectF2 = (RectF) this.b;
        di.l4 l4Var = (di.l4) this.c;
        RectF rectF3 = (RectF) this.d;
        di.l4 l4Var2 = (di.l4) this.e;
        RectF rectF4 = l4Var.m;
        rectF2.set(rectF4);
        RectF rectF5 = l4Var2.m;
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
        fv0 fv0Var = (fv0) nVar.b;
        int i7 = ProfileStoriesView.s0;
        fv0Var.a(canvas, l4Var, l4Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override // org.telegram.ui.Components.fb0
    public void n(hb0 hb0Var, int i7) {
        org.telegram.ui.Components.u4.c((fi.d) this.a, (hb0) this.b, (hb0) this.c, (hb0) this.d, (hb0) this.e);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e10) {
        v0.n request = (v0.n) this.a;
        f1.a aVar = (f1.a) this.b;
        v0.g gVar = (v0.g) this.c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.e;
        kotlin.jvm.internal.j.e(e10, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        kotlin.jvm.internal.j.e(request, "request");
        for (v0.h hVar : request.a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new c1.e(aVar.e).h(request, cancellationSignal, executor, gVar);
    }
}
