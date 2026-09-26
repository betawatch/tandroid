package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.qn;
import org.telegram.ui.un;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class j2 implements org.telegram.ui.ActionBar.z1, ResultCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j2(FactCheckController factCheckController, cu cuVar, int i10, MessageObject messageObject, boolean z10) {
        this.c = factCheckController;
        this.d = cuVar;
        this.b = i10;
        this.e = messageObject;
        this.a = z10;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ((FactCheckController) this.c).lambda$openFactCheckEditor$8((cu) this.d, this.b, (MessageObject) this.e, this.a, a2Var, i10);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        un unVar = (un) this.c;
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) this.d;
        mc0 mc0Var = (mc0) this.e;
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((dg.a) pair.second).b;
        org.telegram.ui.ActionBar.b4 b4Var2 = unVar.f;
        if (b4Var2 == null || longValue != b4Var2.i(unVar.G ? 1 : 0) || bitmap == null) {
            return;
        }
        ValueAnimator valueAnimator = unVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = b4Var.k(this.a ? 1 : 0).settings.intensity;
        List list = ((dg.a) pair.second).c;
        mc0Var.R = list;
        long j3 = unVar.V.Qa;
        if (list != null) {
            mc0Var.S = new Random(j3).nextInt(mc0Var.R.size());
        }
        mc0Var.t(bitmap, i10);
        mc0Var.u(this.b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        unVar.r = ofFloat;
        ofFloat.addUpdateListener(new qn(mc0Var, 2));
        unVar.r.setDuration(250L);
        unVar.r.start();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public /* synthetic */ j2(un unVar, org.telegram.ui.ActionBar.b4 b4Var, boolean z10, mc0 mc0Var, int i10) {
        this.c = unVar;
        this.d = b4Var;
        this.a = z10;
        this.e = mc0Var;
        this.b = i10;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
