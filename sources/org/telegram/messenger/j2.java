package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.tn;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        kc0 kc0Var = (kc0) this.e;
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
        kc0Var.R = list;
        long j3 = xnVar.V.Qa;
        if (list != null) {
            kc0Var.S = new Random(j3).nextInt(kc0Var.R.size());
        }
        kc0Var.t(bitmap, i10);
        kc0Var.u(this.b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        xnVar.r = ofFloat;
        ofFloat.addUpdateListener(new tn(kc0Var, 2));
        xnVar.r.setDuration(250L);
        xnVar.r.start();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public /* synthetic */ j2(xn xnVar, org.telegram.ui.ActionBar.d4 d4Var, boolean z10, kc0 kc0Var, int i10) {
        this.c = xnVar;
        this.d = d4Var;
        this.a = z10;
        this.e = kc0Var;
        this.b = i10;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
