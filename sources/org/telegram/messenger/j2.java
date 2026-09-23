package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.cu;
import org.telegram.ui.rn;
import org.telegram.ui.vn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class j2 implements org.telegram.ui.ActionBar.a2, ResultCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j2(FactCheckController factCheckController, cu cuVar, int i10, MessageObject messageObject, boolean z10) {
        this.c = factCheckController;
        this.d = cuVar;
        this.b = i10;
        this.e = messageObject;
        this.a = z10;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ((FactCheckController) this.c).lambda$openFactCheckEditor$8((cu) this.d, this.b, (MessageObject) this.e, this.a, b2Var, i10);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        vn vnVar = (vn) this.c;
        org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) this.d;
        bc0 bc0Var = (bc0) this.e;
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((dg.a) pair.second).b;
        org.telegram.ui.ActionBar.c4 c4Var2 = vnVar.f;
        if (c4Var2 == null || longValue != c4Var2.i(vnVar.G ? 1 : 0) || bitmap == null) {
            return;
        }
        ValueAnimator valueAnimator = vnVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = c4Var.k(this.a ? 1 : 0).settings.intensity;
        List list = ((dg.a) pair.second).c;
        bc0Var.R = list;
        long j3 = vnVar.V.Qa;
        if (list != null) {
            bc0Var.S = new Random(j3).nextInt(bc0Var.R.size());
        }
        bc0Var.t(bitmap, i10);
        bc0Var.u(this.b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        vnVar.r = ofFloat;
        ofFloat.addUpdateListener(new rn(bc0Var, 2));
        vnVar.r.setDuration(250L);
        vnVar.r.start();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public /* synthetic */ j2(vn vnVar, org.telegram.ui.ActionBar.c4 c4Var, boolean z10, bc0 bc0Var, int i10) {
        this.c = vnVar;
        this.d = c4Var;
        this.a = z10;
        this.e = bc0Var;
        this.b = i10;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
