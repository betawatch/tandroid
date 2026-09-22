package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.tn;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class j2 implements org.telegram.ui.ActionBar.a2, ResultCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j2(FactCheckController factCheckController, bu buVar, int i10, MessageObject messageObject, boolean z10) {
        this.c = factCheckController;
        this.d = buVar;
        this.b = i10;
        this.e = messageObject;
        this.a = z10;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ((FactCheckController) this.c).lambda$openFactCheckEditor$8((bu) this.d, this.b, (MessageObject) this.e, this.a, b2Var, i10);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        xn xnVar = (xn) this.c;
        org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) this.d;
        nc0 nc0Var = (nc0) this.e;
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((dg.a) pair.second).b;
        org.telegram.ui.ActionBar.d4 d4Var2 = xnVar.f;
        if (d4Var2 == null || longValue != d4Var2.i(xnVar.G ? 1 : 0) || bitmap == null) {
            return;
        }
        ValueAnimator valueAnimator = xnVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = d4Var.k(this.a ? 1 : 0).settings.intensity;
        List list = ((dg.a) pair.second).c;
        nc0Var.R = list;
        long j3 = xnVar.V.Qa;
        if (list != null) {
            nc0Var.S = new Random(j3).nextInt(nc0Var.R.size());
        }
        nc0Var.t(bitmap, i10);
        nc0Var.u(this.b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        xnVar.r = ofFloat;
        ofFloat.addUpdateListener(new tn(nc0Var, 2));
        xnVar.r.setDuration(250L);
        xnVar.r.start();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public /* synthetic */ j2(xn xnVar, org.telegram.ui.ActionBar.d4 d4Var, boolean z10, nc0 nc0Var, int i10) {
        this.c = xnVar;
        this.d = d4Var;
        this.a = z10;
        this.e = nc0Var;
        this.b = i10;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
