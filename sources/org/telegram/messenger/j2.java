package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.zt;
import org.telegram.ui.ao;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class j2 implements org.telegram.ui.ActionBar.a2, ResultCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j2(FactCheckController factCheckController, zt ztVar, int i10, MessageObject messageObject, boolean z10) {
        this.c = factCheckController;
        this.d = ztVar;
        this.b = i10;
        this.e = messageObject;
        this.a = z10;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ((FactCheckController) this.c).lambda$openFactCheckEditor$8((zt) this.d, this.b, (MessageObject) this.e, this.a, b2Var, i10);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        ao aoVar = (ao) this.c;
        org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) this.d;
        dc0 dc0Var = (dc0) this.e;
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((dg.a) pair.second).b;
        org.telegram.ui.ActionBar.d4 d4Var2 = aoVar.f;
        if (d4Var2 == null || longValue != d4Var2.i(aoVar.G ? 1 : 0) || bitmap == null) {
            return;
        }
        ValueAnimator valueAnimator = aoVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = d4Var.k(this.a ? 1 : 0).settings.intensity;
        List list = ((dg.a) pair.second).c;
        dc0Var.R = list;
        long j3 = aoVar.V.Qa;
        if (list != null) {
            dc0Var.S = new Random(j3).nextInt(dc0Var.R.size());
        }
        dc0Var.t(bitmap, i10);
        dc0Var.u(this.b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        aoVar.r = ofFloat;
        ofFloat.addUpdateListener(new wn(dc0Var, 2));
        aoVar.r.setDuration(250L);
        aoVar.r.start();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public /* synthetic */ j2(ao aoVar, org.telegram.ui.ActionBar.d4 d4Var, boolean z10, dc0 dc0Var, int i10) {
        this.c = aoVar;
        this.d = d4Var;
        this.a = z10;
        this.e = dc0Var;
        this.b = i10;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
