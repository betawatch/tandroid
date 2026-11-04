package ci;

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
import org.telegram.messenger.hi;
import org.telegram.messenger.ii;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.v60;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.g11;
import org.telegram.ui.id0;
import org.telegram.ui.tu0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r6 implements org.telegram.messenger.q1, ei.l9, OnFailureListener, org.telegram.ui.ActionBar.p1, ab0, e5.m, ii {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override // e5.m
    public void a(e5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new s6((id0) this.a, fVar, list, (String) this.b, (TLRPC.TL_inputStorePaymentAuthCode) this.c, (TLRPC.TL_payments_canPurchaseStore) this.d, (v60) this.e, 8));
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) this.a;
        boolean[] zArr = (boolean[]) this.b;
        org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.c;
        u10 u10Var = (u10) this.d;
        org.telegram.ui.ActionBar.s1[] s1VarArr = (org.telegram.ui.ActionBar.s1[]) this.e;
        zArr[0] = true;
        b3Var.h(b3Var.x, a3Var, true);
        u10Var.a(Boolean.TRUE);
        s1VarArr[0].dismiss();
    }

    @Override // org.telegram.messenger.ii
    public void h(String str, ArrayList arrayList) {
        TLRPC.TL_availableReaction tL_availableReaction;
        g11 g11Var = (g11) this.a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        HashMap hashMap = (HashMap) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.e;
        g11Var.getClass();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            try {
                if (((hi) arrayList.get(i3)).a.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((hi) arrayList.get(i3)).a.substring(9))));
                } else {
                    int i10 = g11Var.a0;
                    if ((i10 == 1 || i10 == 11 || i10 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((hi) arrayList.get(i3)).a)) != null) {
                        arrayList2.add(dh.n0.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override // ei.l9
    public void i(float f10, Canvas canvas, RectF rectF, boolean z10) {
        c6.i iVar = (c6.i) this.a;
        RectF rectF2 = (RectF) this.b;
        ei.l4 l4Var = (ei.l4) this.c;
        RectF rectF3 = (RectF) this.d;
        ei.l4 l4Var2 = (ei.l4) this.e;
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
        tu0 tu0Var = (tu0) iVar.b;
        int i3 = ProfileStoriesView.t0;
        tu0Var.a(canvas, l4Var, l4Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override // org.telegram.messenger.q1
    public void k(e5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new s6((e9) this.a, list, (ai.d6) this.b, (TLRPC.TL_inputStorePaymentStarsGift) this.c, (TL_stars.TL_starsGiftOption) this.d, fVar, (Activity) this.e, 1));
    }

    @Override // org.telegram.ui.Components.ab0
    public void l(cb0 cb0Var, int i3) {
        org.telegram.ui.Components.t4.c((gi.d) this.a, (cb0) this.b, (cb0) this.c, (cb0) this.d, (cb0) this.e);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e10) {
        v0.m request = (v0.m) this.a;
        f1.a aVar = (f1.a) this.b;
        v0.h hVar = (v0.h) this.c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.e;
        kotlin.jvm.internal.j.e(e10, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        kotlin.jvm.internal.j.e(request, "request");
        for (v0.o oVar : request.a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new c1.e(aVar.e).g(request, cancellationSignal, executor, hVar);
    }
}
