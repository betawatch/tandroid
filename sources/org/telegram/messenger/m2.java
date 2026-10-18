package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.mn;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class m2 implements org.telegram.ui.ActionBar.a2, ResultCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m2(FactCheckController factCheckController, iu iuVar, int i10, MessageObject messageObject, boolean z10) {
        this.c = factCheckController;
        this.d = iuVar;
        this.b = i10;
        this.e = messageObject;
        this.a = z10;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ((FactCheckController) this.c).lambda$openFactCheckEditor$8((iu) this.d, this.b, (MessageObject) this.e, this.a, b2Var, i10);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        qn qnVar = (qn) this.c;
        org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) this.d;
        wc0 wc0Var = (wc0) this.e;
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((eg.a) pair.second).b;
        org.telegram.ui.ActionBar.c4 c4Var2 = qnVar.f;
        if (c4Var2 == null || longValue != c4Var2.h(qnVar.G ? 1 : 0) || bitmap == null) {
            return;
        }
        ValueAnimator valueAnimator = qnVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = c4Var.j(this.a ? 1 : 0).settings.intensity;
        List list = ((eg.a) pair.second).c;
        wc0Var.R = list;
        long j10 = qnVar.V.Ra;
        if (list != null) {
            wc0Var.S = new Random(j10).nextInt(wc0Var.R.size());
        }
        wc0Var.s(bitmap, i10);
        wc0Var.t(this.b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        qnVar.r = ofFloat;
        ofFloat.addUpdateListener(new mn(wc0Var, 2));
        qnVar.r.setDuration(250L);
        qnVar.r.start();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public /* synthetic */ m2(qn qnVar, org.telegram.ui.ActionBar.c4 c4Var, boolean z10, wc0 wc0Var, int i10) {
        this.c = qnVar;
        this.d = c4Var;
        this.a = z10;
        this.e = wc0Var;
        this.b = i10;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }
}
