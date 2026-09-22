package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.vn;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ((FactCheckController) this.c).lambda$openFactCheckEditor$8((bu) this.d, this.b, (MessageObject) this.e, this.a, b2Var, i10);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        zn znVar = (zn) this.c;
        org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) this.d;
        cc0 cc0Var = (cc0) this.e;
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((dg.a) pair.second).b;
        org.telegram.ui.ActionBar.d4 d4Var2 = znVar.f;
        if (d4Var2 == null || longValue != d4Var2.i(znVar.G ? 1 : 0) || bitmap == null) {
            return;
        }
        ValueAnimator valueAnimator = znVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = d4Var.k(this.a ? 1 : 0).settings.intensity;
        List list = ((dg.a) pair.second).c;
        cc0Var.R = list;
        long j3 = znVar.V.Qa;
        if (list != null) {
            cc0Var.S = new Random(j3).nextInt(cc0Var.R.size());
        }
        cc0Var.t(bitmap, i10);
        cc0Var.u(this.b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        znVar.r = ofFloat;
        ofFloat.addUpdateListener(new vn(cc0Var, 2));
        znVar.r.setDuration(250L);
        znVar.r.start();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public /* synthetic */ j2(zn znVar, org.telegram.ui.ActionBar.d4 d4Var, boolean z10, cc0 cc0Var, int i10) {
        this.c = znVar;
        this.d = d4Var;
        this.a = z10;
        this.e = cc0Var;
        this.b = i10;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
