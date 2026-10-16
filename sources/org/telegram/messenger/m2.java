package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.nu;
import org.telegram.ui.co;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class m2 implements org.telegram.ui.ActionBar.z1, ResultCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m2(FactCheckController factCheckController, nu nuVar, int i10, MessageObject messageObject, boolean z10) {
        this.c = factCheckController;
        this.d = nuVar;
        this.b = i10;
        this.e = messageObject;
        this.a = z10;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ((FactCheckController) this.c).lambda$openFactCheckEditor$8((nu) this.d, this.b, (MessageObject) this.e, this.a, a2Var, i10);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        co coVar = (co) this.c;
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) this.d;
        cd0 cd0Var = (cd0) this.e;
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((eg.a) pair.second).b;
        org.telegram.ui.ActionBar.b4 b4Var2 = coVar.f;
        if (b4Var2 == null || longValue != b4Var2.i(coVar.G ? 1 : 0) || bitmap == null) {
            return;
        }
        ValueAnimator valueAnimator = coVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = b4Var.k(this.a ? 1 : 0).settings.intensity;
        List list = ((eg.a) pair.second).c;
        cd0Var.R = list;
        long j10 = coVar.V.Ra;
        if (list != null) {
            cd0Var.S = new Random(j10).nextInt(cd0Var.R.size());
        }
        cd0Var.t(bitmap, i10);
        cd0Var.u(this.b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        coVar.r = ofFloat;
        ofFloat.addUpdateListener(new yn(cd0Var, 2));
        coVar.r.setDuration(250L);
        coVar.r.start();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public /* synthetic */ m2(co coVar, org.telegram.ui.ActionBar.b4 b4Var, boolean z10, cd0 cd0Var, int i10) {
        this.c = coVar;
        this.d = b4Var;
        this.a = z10;
        this.e = cd0Var;
        this.b = i10;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
