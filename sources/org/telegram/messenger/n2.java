package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.mn;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final /* synthetic */ class n2 implements org.telegram.ui.ActionBar.z1, ResultCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n2(FactCheckController factCheckController, iu iuVar, int i10, MessageObject messageObject, boolean z10) {
        this.c = factCheckController;
        this.d = iuVar;
        this.b = i10;
        this.e = messageObject;
        this.a = z10;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ((FactCheckController) this.c).lambda$openFactCheckEditor$8((iu) this.d, this.b, (MessageObject) this.e, this.a, c2Var, i10);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        qn qnVar = (qn) this.c;
        org.telegram.ui.ActionBar.f4 f4Var = (org.telegram.ui.ActionBar.f4) this.d;
        yc0 yc0Var = (yc0) this.e;
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((eg.a) pair.second).b;
        org.telegram.ui.ActionBar.f4 f4Var2 = qnVar.f;
        if (f4Var2 == null || longValue != f4Var2.h(qnVar.q ? 1 : 0) || bitmap == null) {
            return;
        }
        ValueAnimator valueAnimator = qnVar.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = f4Var.j(this.a ? 1 : 0).settings.intensity;
        List list = ((eg.a) pair.second).c;
        yc0Var.R = list;
        long j10 = qnVar.F.db;
        if (list != null) {
            yc0Var.S = new Random(j10).nextInt(yc0Var.R.size());
        }
        yc0Var.s(bitmap, i10);
        yc0Var.t(this.b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        qnVar.i = ofFloat;
        ofFloat.addUpdateListener(new mn(yc0Var, 2));
        qnVar.i.setDuration(250L);
        qnVar.i.start();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public /* synthetic */ n2(qn qnVar, org.telegram.ui.ActionBar.f4 f4Var, boolean z10, yc0 yc0Var, int i10) {
        this.c = qnVar;
        this.d = f4Var;
        this.a = z10;
        this.e = yc0Var;
        this.b = i10;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }
}
