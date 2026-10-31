package f1;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import c1.d;
import c5.g;
import c5.n;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import mg.c0;
import org.telegram.messenger.i0;
import org.telegram.messenger.q20;
import org.telegram.messenger.qi;
import org.telegram.messenger.ri;
import org.telegram.messenger.t1;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.i3;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.i31;
import org.telegram.ui.mw0;
import org.telegram.ui.se0;
import org.telegram.ui.w50;
import r2.y;
import rh.e6;
import sg.o0;
import th.c3;
import th.i7;
import v0.h;
import v0.m;
import v0.o;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements OnFailureListener, u1, yb0, n, ri, t1, i7 {
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

    @Override // org.telegram.messenger.t1
    public void a(g gVar, List list) {
        i0.g3(new c0((e6) this.a, list, (q70) this.b, (TLRPC.TL_inputStorePaymentStarsGift) this.c, (TL_stars.TL_starsGiftOption) this.d, gVar, (Activity) this.e, 15));
    }

    @Override // c5.n
    public void b(g gVar, List list) {
        i0.g3(new c0((se0) this.a, gVar, list, (String) this.b, (TLRPC.TL_inputStorePaymentAuthCode) this.c, (TLRPC.TL_payments_canPurchaseStore) this.d, (w50) this.e, 6));
    }

    @Override // org.telegram.messenger.ri
    public void c(String str, ArrayList arrayList) {
        TLRPC.TL_availableReaction tL_availableReaction;
        i31 i31Var = (i31) this.a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        HashMap hashMap = (HashMap) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.e;
        i31Var.getClass();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (((qi) arrayList.get(i10)).a.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((qi) arrayList.get(i10)).a.substring(9))));
                } else {
                    int i11 = i31Var.W;
                    if ((i11 == 1 || i11 == 11 || i11 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((qi) arrayList.get(i10)).a)) != null) {
                        arrayList2.add(o0.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(x1 x1Var, int i10) {
        i3 i3Var = (i3) this.a;
        boolean[] zArr = (boolean[]) this.b;
        h3 h3Var = (h3) this.c;
        q20 q20Var = (q20) this.d;
        x1[] x1VarArr = (x1[]) this.e;
        zArr[0] = true;
        i3Var.h(i3Var.x, h3Var, true);
        q20Var.a(Boolean.TRUE);
        x1VarArr[0].dismiss();
    }

    @Override // th.i7
    public void j(float f7, Canvas canvas, RectF rectF, boolean z10) {
        y yVar = (y) this.a;
        RectF rectF2 = (RectF) this.b;
        c3 c3Var = (c3) this.c;
        RectF rectF3 = (RectF) this.d;
        c3 c3Var2 = (c3) this.e;
        RectF rectF4 = c3Var.m;
        rectF2.set(rectF4);
        RectF rectF5 = c3Var2.m;
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
        mw0 mw0Var = (mw0) yVar.b;
        int i10 = ProfileStoriesView.s0;
        mw0Var.a(canvas, c3Var, c3Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e) {
        m request = (m) this.a;
        b bVar = (b) this.b;
        h hVar = (h) this.c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.e;
        i.e(e, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        i.e(request, "request");
        for (o oVar : request.a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new d(bVar.e).g(request, cancellationSignal, executor, hVar);
    }

    @Override // org.telegram.ui.Components.yb0
    public void t(ac0 ac0Var, int i10) {
        s4.c((vh.d) this.a, (ac0) this.b, (ac0) this.c, (ac0) this.d, (ac0) this.e);
    }
}
