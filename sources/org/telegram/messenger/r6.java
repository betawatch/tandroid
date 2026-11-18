package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bb0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class r6 implements org.telegram.ui.ActionBar.r1, ResultCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r6(x6 x6Var, t6 t6Var, int i7, fj fjVar, boolean z10) {
        this.c = x6Var;
        this.d = t6Var;
        this.b = i7;
        this.e = fjVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        x6 x6Var = (x6) this.c;
        t6 t6Var = (t6) this.d;
        fj fjVar = (fj) this.e;
        if (t6Var.getText().toString().length() > this.b) {
            g0.D3(t6Var);
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {t6Var.getText()};
        tL_textWithEntities.entities = ri.d0(x6Var.a).Y(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        x6Var.a(fjVar, tL_textWithEntities, this.a);
        u1Var.dismiss();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.zm zmVar = (org.telegram.ui.zm) this.c;
        org.telegram.ui.ActionBar.t3 t3Var = (org.telegram.ui.ActionBar.t3) this.d;
        bb0 bb0Var = (bb0) this.e;
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((gg.a) pair.second).a;
        org.telegram.ui.ActionBar.t3 t3Var2 = zmVar.f;
        if (t3Var2 == null || longValue != t3Var2.h(zmVar.q ? 1 : 0) || bitmap == null) {
            return;
        }
        ValueAnimator valueAnimator = zmVar.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i7 = t3Var.j(this.a ? 1 : 0).settings.intensity;
        List list = ((gg.a) pair.second).b;
        bb0Var.R = list;
        long j3 = zmVar.G.ob;
        if (list != null) {
            bb0Var.S = new Random(j3).nextInt(bb0Var.R.size());
        }
        bb0Var.s(i7, bitmap);
        bb0Var.t(this.b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        zmVar.i = ofFloat;
        ofFloat.addUpdateListener(new org.telegram.ui.vm(bb0Var, 2));
        zmVar.i.setDuration(250L);
        zmVar.i.start();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public /* synthetic */ r6(org.telegram.ui.zm zmVar, org.telegram.ui.ActionBar.t3 t3Var, boolean z10, bb0 bb0Var, int i7) {
        this.c = zmVar;
        this.d = t3Var;
        this.a = z10;
        this.e = bb0Var;
        this.b = i7;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }
}
