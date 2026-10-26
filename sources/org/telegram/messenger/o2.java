package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.on;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        sn snVar = (sn) this.c;
        org.telegram.ui.ActionBar.h4 h4Var = (org.telegram.ui.ActionBar.h4) this.d;
        uc0 uc0Var = (uc0) this.e;
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((fg.a) pair.second).b;
        org.telegram.ui.ActionBar.h4 h4Var2 = snVar.f;
        if (h4Var2 == null || longValue != h4Var2.h(snVar.q ? 1 : 0) || bitmap == null) {
            return;
        }
        ValueAnimator valueAnimator = snVar.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = h4Var.j(this.a ? 1 : 0).settings.intensity;
        List list = ((fg.a) pair.second).c;
        uc0Var.R = list;
        long j10 = snVar.F.db;
        if (list != null) {
            uc0Var.S = new Random(j10).nextInt(uc0Var.R.size());
        }
        uc0Var.s(bitmap, i10);
        uc0Var.t(this.b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        snVar.i = ofFloat;
        ofFloat.addUpdateListener(new on(uc0Var, 2));
        snVar.i.setDuration(250L);
        snVar.i.start();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public /* synthetic */ o2(sn snVar, org.telegram.ui.ActionBar.h4 h4Var, boolean z10, uc0 uc0Var, int i10) {
        this.c = snVar;
        this.d = h4Var;
        this.a = z10;
        this.e = uc0Var;
        this.b = i10;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }
}
