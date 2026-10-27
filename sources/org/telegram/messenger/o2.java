package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.qn;
import org.telegram.ui.un;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class o2 implements org.telegram.ui.ActionBar.b2, ResultCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o2(FactCheckController factCheckController, ju juVar, int i10, MessageObject messageObject, boolean z10) {
        this.c = factCheckController;
        this.d = juVar;
        this.b = i10;
        this.e = messageObject;
        this.a = z10;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        ((FactCheckController) this.c).lambda$openFactCheckEditor$8((ju) this.d, this.b, (MessageObject) this.e, this.a, e2Var, i10);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        un unVar = (un) this.c;
        org.telegram.ui.ActionBar.h4 h4Var = (org.telegram.ui.ActionBar.h4) this.d;
        vc0 vc0Var = (vc0) this.e;
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((fg.a) pair.second).b;
        org.telegram.ui.ActionBar.h4 h4Var2 = unVar.f;
        if (h4Var2 == null || longValue != h4Var2.h(unVar.q ? 1 : 0) || bitmap == null) {
            return;
        }
        ValueAnimator valueAnimator = unVar.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = h4Var.j(this.a ? 1 : 0).settings.intensity;
        List list = ((fg.a) pair.second).c;
        vc0Var.R = list;
        long j10 = unVar.F.hb;
        if (list != null) {
            vc0Var.S = new Random(j10).nextInt(vc0Var.R.size());
        }
        vc0Var.s(bitmap, i10);
        vc0Var.t(this.b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        unVar.i = ofFloat;
        ofFloat.addUpdateListener(new qn(vc0Var, 2));
        unVar.i.setDuration(250L);
        unVar.i.start();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public /* synthetic */ o2(un unVar, org.telegram.ui.ActionBar.h4 h4Var, boolean z10, vc0 vc0Var, int i10) {
        this.c = unVar;
        this.d = h4Var;
        this.a = z10;
        this.e = vc0Var;
        this.b = i10;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }
}
