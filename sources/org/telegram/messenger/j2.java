package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.sn;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final /* synthetic */ class j2 implements org.telegram.ui.ActionBar.a2, ResultCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j2(FactCheckController factCheckController, eu euVar, int i10, MessageObject messageObject, boolean z10) {
        this.c = factCheckController;
        this.d = euVar;
        this.b = i10;
        this.e = messageObject;
        this.a = z10;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ((FactCheckController) this.c).lambda$openFactCheckEditor$8((eu) this.d, this.b, (MessageObject) this.e, this.a, b2Var, i10);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        wn wnVar = (wn) this.c;
        org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) this.d;
        pc0 pc0Var = (pc0) this.e;
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((dg.a) pair.second).b;
        org.telegram.ui.ActionBar.c4 c4Var2 = wnVar.f;
        if (c4Var2 == null || longValue != c4Var2.i(wnVar.G ? 1 : 0) || bitmap == null) {
            return;
        }
        ValueAnimator valueAnimator = wnVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = c4Var.k(this.a ? 1 : 0).settings.intensity;
        List list = ((dg.a) pair.second).c;
        pc0Var.R = list;
        long j3 = wnVar.V.Oa;
        if (list != null) {
            pc0Var.S = new Random(j3).nextInt(pc0Var.R.size());
        }
        pc0Var.t(bitmap, i10);
        pc0Var.u(this.b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        wnVar.r = ofFloat;
        ofFloat.addUpdateListener(new sn(pc0Var, 2));
        wnVar.r.setDuration(250L);
        wnVar.r.start();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public /* synthetic */ j2(wn wnVar, org.telegram.ui.ActionBar.c4 c4Var, boolean z10, pc0 pc0Var, int i10) {
        this.c = wnVar;
        this.d = c4Var;
        this.a = z10;
        this.e = pc0Var;
        this.b = i10;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
