package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.bo;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class n2 implements org.telegram.ui.ActionBar.c2, ResultCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n2(FactCheckController factCheckController, fu fuVar, int i10, MessageObject messageObject, boolean z10) {
        this.c = factCheckController;
        this.d = fuVar;
        this.b = i10;
        this.e = messageObject;
        this.a = z10;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ((FactCheckController) this.c).lambda$openFactCheckEditor$8((fu) this.d, this.b, (MessageObject) this.e, this.a, d2Var, i10);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        bo boVar = (bo) this.c;
        org.telegram.ui.ActionBar.f4 f4Var = (org.telegram.ui.ActionBar.f4) this.d;
        lc0 lc0Var = (lc0) this.e;
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((cg.a) pair.second).b;
        org.telegram.ui.ActionBar.f4 f4Var2 = boVar.f;
        if (f4Var2 == null || longValue != f4Var2.i(boVar.G ? 1 : 0) || bitmap == null) {
            return;
        }
        ValueAnimator valueAnimator = boVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = f4Var.k(this.a ? 1 : 0).settings.intensity;
        List list = ((cg.a) pair.second).c;
        lc0Var.R = list;
        long j3 = boVar.V.Qa;
        if (list != null) {
            lc0Var.S = new Random(j3).nextInt(lc0Var.R.size());
        }
        lc0Var.t(bitmap, i10);
        lc0Var.u(this.b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        boVar.r = ofFloat;
        ofFloat.addUpdateListener(new xn(lc0Var, 2));
        boVar.r.setDuration(250L);
        boVar.r.start();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.o.a(this, th2);
    }

    public /* synthetic */ n2(bo boVar, org.telegram.ui.ActionBar.f4 f4Var, boolean z10, lc0 lc0Var, int i10) {
        this.c = boVar;
        this.d = f4Var;
        this.a = z10;
        this.e = lc0Var;
        this.b = i10;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.o.b(this, tL_error);
    }
}
