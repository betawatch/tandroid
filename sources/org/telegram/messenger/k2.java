package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.ut;
import org.telegram.ui.tn;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class k2 implements org.telegram.ui.ActionBar.c2, ResultCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k2(FactCheckController factCheckController, ut utVar, int i10, MessageObject messageObject, boolean z4) {
        this.c = factCheckController;
        this.d = utVar;
        this.b = i10;
        this.e = messageObject;
        this.a = z4;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ((FactCheckController) this.c).lambda$openFactCheckEditor$8((ut) this.d, this.b, (MessageObject) this.e, this.a, d2Var, i10);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        xn xnVar = (xn) this.c;
        org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) this.d;
        ec0 ec0Var = (ec0) this.e;
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((pf.a) pair.second).b;
        org.telegram.ui.ActionBar.e4 e4Var2 = xnVar.f;
        if (e4Var2 == null || longValue != e4Var2.i(xnVar.D ? 1 : 0) || bitmap == null) {
            return;
        }
        ValueAnimator valueAnimator = xnVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = e4Var.k(this.a ? 1 : 0).settings.intensity;
        List list = ((pf.a) pair.second).c;
        ec0Var.R = list;
        long j10 = xnVar.S.Na;
        if (list != null) {
            ec0Var.S = new Random(j10).nextInt(ec0Var.R.size());
        }
        ec0Var.t(bitmap, i10);
        ec0Var.u(this.b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        xnVar.r = ofFloat;
        ofFloat.addUpdateListener(new tn(ec0Var, 2));
        xnVar.r.setDuration(250L);
        xnVar.r.start();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public /* synthetic */ k2(xn xnVar, org.telegram.ui.ActionBar.e4 e4Var, boolean z4, ec0 ec0Var, int i10) {
        this.c = xnVar;
        this.d = e4Var;
        this.a = z4;
        this.e = ec0Var;
        this.b = i10;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }
}
