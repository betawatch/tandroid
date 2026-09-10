package f1;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.util.Log;
import android.view.KeyEvent;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.d;
import c1.e;
import c5.h;
import c5.p;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.p3;
import org.telegram.ui.ActionBar.q3;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bf;
import org.telegram.ui.l71;
import org.telegram.ui.vz0;
import v0.i;
import v0.n;
import xh.v5;
import yg.p0;
import zh.d3;
import zh.e3;
import zh.o7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements OnFailureListener, c2, bd0, p, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, o7 {
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

    @Override // c5.p
    public void a(h hVar, List list) {
        AndroidUtilities.runOnUIThread(new bf((KeyEvent.Callback) this.a, (Object) hVar, (Object) list, (String) this.b, this.c, (TLObject) this.d, this.e, 4));
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(d2 d2Var, int i10) {
        q3 q3Var = (q3) this.a;
        boolean[] zArr = (boolean[]) this.b;
        p3 p3Var = (p3) this.c;
        Utilities.Callback callback = (Utilities.Callback) this.d;
        d2[] d2VarArr = (d2[]) this.e;
        zArr[0] = true;
        q3Var.h(q3Var.w, p3Var, true);
        callback.run(Boolean.TRUE);
        d2VarArr[0].dismiss();
    }

    @Override // zh.o7
    public void g(float f7, Canvas canvas, RectF rectF, boolean z10) {
        d3 d3Var = (d3) this.a;
        RectF rectF2 = (RectF) this.b;
        e3 e3Var = (e3) this.c;
        RectF rectF3 = (RectF) this.d;
        e3 e3Var2 = (e3) this.e;
        RectF rectF4 = e3Var.m;
        rectF2.set(rectF4);
        RectF rectF5 = e3Var2.m;
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
        vz0 vz0Var = (vz0) d3Var.a;
        int i10 = ProfileStoriesView.s0;
        vz0Var.a(canvas, e3Var, e3Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e) {
        n request = (n) this.a;
        b bVar = (b) this.b;
        i iVar = (i) this.c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.e;
        kotlin.jvm.internal.i.e(e, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        kotlin.jvm.internal.i.e(request, "request");
        for (v0.p pVar : request.a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new e(bVar.e).g(request, cancellationSignal, executor, iVar);
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(h hVar, List list) {
        AndroidUtilities.runOnUIThread(new bf((v5) this.a, list, (n80) this.b, (TLRPC.TL_inputStorePaymentStarsGift) this.c, (TL_stars.TL_starsGiftOption) this.d, hVar, (Activity) this.e, 12));
    }

    @Override // org.telegram.ui.Components.bd0
    public void q(dd0 dd0Var, int i10) {
        d5.c((d) this.a, (dd0) this.b, (dd0) this.c, (dd0) this.d, (dd0) this.e);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        TLRPC.TL_availableReaction tL_availableReaction;
        l71 l71Var = (l71) this.a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        HashMap hashMap = (HashMap) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.e;
        l71Var.getClass();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.substring(9))));
                } else {
                    int i11 = l71Var.W;
                    if ((i11 == 1 || i11 == 11 || i11 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji)) != null) {
                        arrayList2.add(p0.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }
}
