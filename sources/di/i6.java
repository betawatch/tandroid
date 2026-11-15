package di;

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
import org.telegram.messenger.oi;
import org.telegram.messenger.pi;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.av0;
import org.telegram.ui.kd0;
import org.telegram.ui.n11;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class i6 implements org.telegram.messenger.q1, OnFailureListener, fi.c9, org.telegram.ui.ActionBar.q1, gb0, f5.n, pi {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override // org.telegram.messenger.q1
    public void a(f5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new j6((v8) this.a, list, (bi.v5) this.b, (TLRPC.TL_inputStorePaymentStarsGift) this.c, (TL_stars.TL_starsGiftOption) this.d, fVar, (Activity) this.e, 1));
    }

    @Override // org.telegram.messenger.pi
    public void c(String str, ArrayList arrayList) {
        TLRPC.TL_availableReaction tL_availableReaction;
        n11 n11Var = (n11) this.a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        HashMap hashMap = (HashMap) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.e;
        n11Var.getClass();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (((oi) arrayList.get(i7)).a.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((oi) arrayList.get(i7)).a.substring(9))));
                } else {
                    int i10 = n11Var.a0;
                    if ((i10 == 1 || i10 == 11 || i10 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((oi) arrayList.get(i7)).a)) != null) {
                        arrayList2.add(ch.p0.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override // f5.n
    public void f(f5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new j6((kd0) this.a, fVar, list, (String) this.b, (TLRPC.TL_inputStorePaymentAuthCode) this.c, (TLRPC.TL_payments_canPurchaseStore) this.d, (ma0) this.e, 8));
    }

    @Override // fi.c9
    public void g(float f10, Canvas canvas, RectF rectF, boolean z10) {
        cb.c cVar = (cb.c) this.a;
        RectF rectF2 = (RectF) this.b;
        fi.d4 d4Var = (fi.d4) this.c;
        RectF rectF3 = (RectF) this.d;
        fi.d4 d4Var2 = (fi.d4) this.e;
        RectF rectF4 = d4Var.m;
        rectF2.set(rectF4);
        RectF rectF5 = d4Var2.m;
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
        av0 av0Var = (av0) cVar.b;
        int i7 = ProfileStoriesView.t0;
        av0Var.a(canvas, d4Var, d4Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) this.a;
        boolean[] zArr = (boolean[]) this.b;
        org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) this.c;
        z10 z10Var = (z10) this.d;
        org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.e;
        zArr[0] = true;
        c3Var.h(c3Var.x, b3Var, true);
        z10Var.a(Boolean.TRUE);
        t1VarArr[0].dismiss();
    }

    @Override // org.telegram.ui.Components.gb0
    public void m(ib0 ib0Var, int i7) {
        org.telegram.ui.Components.t4.c((hi.d) this.a, (ib0) this.b, (ib0) this.c, (ib0) this.d, (ib0) this.e);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e10) {
        v0.m request = (v0.m) this.a;
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
        new c1.f(aVar.e).h(request, cancellationSignal, executor, gVar);
    }
}
