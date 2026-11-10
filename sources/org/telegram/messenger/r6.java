package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qa0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class r6 implements org.telegram.ui.ActionBar.r1, ResultCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r6(x6 x6Var, t6 t6Var, int i7, ij ijVar, boolean z9) {
        this.c = x6Var;
        this.d = t6Var;
        this.b = i7;
        this.e = ijVar;
        this.a = z9;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        x6 x6Var = (x6) this.c;
        t6 t6Var = (t6) this.d;
        ij ijVar = (ij) this.e;
        if (t6Var.getText().toString().length() > this.b) {
            g0.F3(t6Var);
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {t6Var.getText()};
        tL_textWithEntities.entities = ui.b0(x6Var.a).W(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        x6Var.a(ijVar, tL_textWithEntities, this.a);
        u1Var.dismiss();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.an anVar = (org.telegram.ui.an) this.c;
        org.telegram.ui.ActionBar.s3 s3Var = (org.telegram.ui.ActionBar.s3) this.d;
        qa0 qa0Var = (qa0) this.e;
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((gg.a) pair.second).a;
        org.telegram.ui.ActionBar.s3 s3Var2 = anVar.f;
        if (s3Var2 == null || longValue != s3Var2.h(anVar.q ? 1 : 0) || bitmap == null) {
            return;
        }
        ValueAnimator valueAnimator = anVar.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i7 = s3Var.j(this.a ? 1 : 0).settings.intensity;
        List list = ((gg.a) pair.second).b;
        qa0Var.R = list;
        long j3 = anVar.G.mb;
        if (list != null) {
            qa0Var.S = new Random(j3).nextInt(qa0Var.R.size());
        }
        qa0Var.s(i7, bitmap);
        qa0Var.t(this.b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        anVar.i = ofFloat;
        ofFloat.addUpdateListener(new org.telegram.ui.wm(qa0Var, 2));
        anVar.i.setDuration(250L);
        anVar.i.start();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public /* synthetic */ r6(org.telegram.ui.an anVar, org.telegram.ui.ActionBar.s3 s3Var, boolean z9, qa0 qa0Var, int i7) {
        this.c = anVar;
        this.d = s3Var;
        this.a = z9;
        this.e = qa0Var;
        this.b = i7;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }
}
