package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cb0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class r6 implements org.telegram.ui.ActionBar.q1, ResultCallback {
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

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
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
        t1Var.dismiss();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.zm zmVar = (org.telegram.ui.zm) this.c;
        org.telegram.ui.ActionBar.s3 s3Var = (org.telegram.ui.ActionBar.s3) this.d;
        cb0 cb0Var = (cb0) this.e;
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((gg.a) pair.second).a;
        org.telegram.ui.ActionBar.s3 s3Var2 = zmVar.f;
        if (s3Var2 == null || longValue != s3Var2.h(zmVar.q ? 1 : 0) || bitmap == null) {
            return;
        }
        ValueAnimator valueAnimator = zmVar.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i7 = s3Var.j(this.a ? 1 : 0).settings.intensity;
        List list = ((gg.a) pair.second).b;
        cb0Var.R = list;
        long j3 = zmVar.G.ob;
        if (list != null) {
            cb0Var.S = new Random(j3).nextInt(cb0Var.R.size());
        }
        cb0Var.s(i7, bitmap);
        cb0Var.t(this.b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        zmVar.i = ofFloat;
        ofFloat.addUpdateListener(new org.telegram.ui.vm(cb0Var, 2));
        zmVar.i.setDuration(250L);
        zmVar.i.start();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public /* synthetic */ r6(org.telegram.ui.zm zmVar, org.telegram.ui.ActionBar.s3 s3Var, boolean z10, cb0 cb0Var, int i7) {
        this.c = zmVar;
        this.d = s3Var;
        this.a = z10;
        this.e = cb0Var;
        this.b = i7;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }
}
