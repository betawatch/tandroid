// default package

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class gu1 implements ResultCallback, ed {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gu1(ku1 ku1Var, jy3 jy3Var, boolean z, ye7 ye7Var, int i) {
        this.c = ku1Var;
        this.d = jy3Var;
        this.b = z;
        this.e = ye7Var;
        this.a = i;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        ku1 ku1Var = (ku1) this.c;
        jy3 jy3Var = (jy3) this.d;
        ye7 ye7Var = (ye7) this.e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((mqc) pair.second).a;
            jy3 jy3Var2 = ku1Var.f;
            if (jy3Var2 == null || longValue != jy3Var2.h(ku1Var.q ? 1 : 0) || bitmap == null) {
                return;
            }
            ValueAnimator valueAnimator = ku1Var.i;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i = jy3Var.j(this.b ? 1 : 0).settings.intensity;
            List list = ((mqc) pair.second).b;
            ye7Var.R = list;
            long j = ku1Var.G.ob;
            if (list != null) {
                ye7Var.S = new Random(j).nextInt(ye7Var.R.size());
            }
            ye7Var.r(i, bitmap);
            ye7Var.s(this.a);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ku1Var.i = ofFloat;
            ofFloat.addUpdateListener(new fu1(ye7Var, (byte) 2));
            ku1Var.i.setDuration(250L);
            ku1Var.i.start();
        }
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        v74 v74Var = (v74) this.c;
        r74 r74Var = (r74) this.d;
        k27 k27Var = (k27) this.e;
        if (r74Var.getText().toString().length() > this.a) {
            gl.z3(r74Var);
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {r74Var.getText()};
        tL_textWithEntities.entities = hq6.d0(v74Var.a).Y(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        v74Var.a(k27Var, tL_textWithEntities, this.b);
        hdVar.dismiss();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(TLRPC.TL_error tL_error) {
    }

    public /* synthetic */ gu1(v74 v74Var, r74 r74Var, int i, k27 k27Var, boolean z) {
        this.c = v74Var;
        this.d = r74Var;
        this.a = i;
        this.e = k27Var;
        this.b = z;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(Throwable th) {
    }
}
