package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.la0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class r6 implements org.telegram.ui.ActionBar.p1, ResultCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r6(x6 x6Var, t6 t6Var, int i3, zi ziVar, boolean z10) {
        this.c = x6Var;
        this.d = t6Var;
        this.b = i3;
        this.e = ziVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        x6 x6Var = (x6) this.c;
        t6 t6Var = (t6) this.d;
        zi ziVar = (zi) this.e;
        if (t6Var.getText().toString().length() > this.b) {
            g0.F3(t6Var);
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {t6Var.getText()};
        tL_textWithEntities.entities = li.b0(x6Var.a).W(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        x6Var.a(ziVar, tL_textWithEntities, this.a);
        s1Var.dismiss();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.um umVar = (org.telegram.ui.um) this.c;
        org.telegram.ui.ActionBar.p3 p3Var = (org.telegram.ui.ActionBar.p3) this.d;
        la0 la0Var = (la0) this.e;
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((hg.a) pair.second).a;
        org.telegram.ui.ActionBar.p3 p3Var2 = umVar.f;
        if (p3Var2 == null || longValue != p3Var2.h(umVar.q ? 1 : 0) || bitmap == null) {
            return;
        }
        ValueAnimator valueAnimator = umVar.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i3 = p3Var.j(this.a ? 1 : 0).settings.intensity;
        List list = ((hg.a) pair.second).b;
        la0Var.R = list;
        long j10 = umVar.G.lb;
        if (list != null) {
            la0Var.S = new Random(j10).nextInt(la0Var.R.size());
        }
        la0Var.s(bitmap, i3);
        la0Var.t(this.b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        umVar.i = ofFloat;
        ofFloat.addUpdateListener(new org.telegram.ui.qm(la0Var, 2));
        umVar.i.setDuration(250L);
        umVar.i.start();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public /* synthetic */ r6(org.telegram.ui.um umVar, org.telegram.ui.ActionBar.p3 p3Var, boolean z10, la0 la0Var, int i3) {
        this.c = umVar;
        this.d = p3Var;
        this.a = z10;
        this.e = la0Var;
        this.b = i3;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }
}
