package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jb0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class u6 implements org.telegram.ui.ActionBar.u1, ResultCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u6(a7 a7Var, w6 w6Var, int i10, jj jjVar, boolean z10) {
        this.c = a7Var;
        this.d = w6Var;
        this.b = i10;
        this.e = jjVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        a7 a7Var = (a7) this.c;
        w6 w6Var = (w6) this.d;
        jj jjVar = (jj) this.e;
        if (w6Var.getText().toString().length() > this.b) {
            i0.E3(w6Var);
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {w6Var.getText()};
        tL_textWithEntities.entities = ui.b0(a7Var.a).W(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        a7Var.a(jjVar, tL_textWithEntities, this.a);
        x1Var.dismiss();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.sn snVar = (org.telegram.ui.sn) this.c;
        org.telegram.ui.ActionBar.y3 y3Var = (org.telegram.ui.ActionBar.y3) this.d;
        jb0 jb0Var = (jb0) this.e;
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((wf.a) pair.second).a;
        org.telegram.ui.ActionBar.y3 y3Var2 = snVar.f;
        if (y3Var2 == null || longValue != y3Var2.h(snVar.q ? 1 : 0) || bitmap == null) {
            return;
        }
        ValueAnimator valueAnimator = snVar.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = y3Var.j(this.a ? 1 : 0).settings.intensity;
        List list = ((wf.a) pair.second).b;
        jb0Var.R = list;
        long j10 = snVar.G.kb;
        if (list != null) {
            jb0Var.S = new Random(j10).nextInt(jb0Var.R.size());
        }
        jb0Var.s(bitmap, i10);
        jb0Var.t(this.b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        snVar.i = ofFloat;
        ofFloat.addUpdateListener(new org.telegram.ui.on(jb0Var, 2));
        snVar.i.setDuration(250L);
        snVar.i.start();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public /* synthetic */ u6(org.telegram.ui.sn snVar, org.telegram.ui.ActionBar.y3 y3Var, boolean z10, jb0 jb0Var, int i10) {
        this.c = snVar;
        this.d = y3Var;
        this.a = z10;
        this.e = jb0Var;
        this.b = i10;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
