package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ra0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class r6 implements org.telegram.ui.ActionBar.q1, ResultCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r6(x6 x6Var, t6 t6Var, int i7, gj gjVar, boolean z10) {
        this.c = x6Var;
        this.d = t6Var;
        this.b = i7;
        this.e = gjVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        x6 x6Var = (x6) this.c;
        t6 t6Var = (t6) this.d;
        gj gjVar = (gj) this.e;
        if (t6Var.getText().toString().length() > this.b) {
            g0.E3(t6Var);
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {t6Var.getText()};
        tL_textWithEntities.entities = si.b0(x6Var.a).W(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        x6Var.a(gjVar, tL_textWithEntities, this.a);
        t1Var.dismiss();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ym ymVar = (org.telegram.ui.ym) this.c;
        org.telegram.ui.ActionBar.p3 p3Var = (org.telegram.ui.ActionBar.p3) this.d;
        ra0 ra0Var = (ra0) this.e;
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((gg.a) pair.second).a;
        org.telegram.ui.ActionBar.p3 p3Var2 = ymVar.f;
        if (p3Var2 == null || longValue != p3Var2.h(ymVar.q ? 1 : 0) || bitmap == null) {
            return;
        }
        ValueAnimator valueAnimator = ymVar.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i7 = p3Var.j(this.a ? 1 : 0).settings.intensity;
        List list = ((gg.a) pair.second).b;
        ra0Var.R = list;
        long j3 = ymVar.G.nb;
        if (list != null) {
            ra0Var.S = new Random(j3).nextInt(ra0Var.R.size());
        }
        ra0Var.s(i7, bitmap);
        ra0Var.t(this.b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ymVar.i = ofFloat;
        ofFloat.addUpdateListener(new org.telegram.ui.um(ra0Var, 2));
        ymVar.i.setDuration(250L);
        ymVar.i.start();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public /* synthetic */ r6(org.telegram.ui.ym ymVar, org.telegram.ui.ActionBar.p3 p3Var, boolean z10, ra0 ra0Var, int i7) {
        this.c = ymVar;
        this.d = p3Var;
        this.a = z10;
        this.e = ra0Var;
        this.b = i7;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }
}
