// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ona implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qna b;

    public /* synthetic */ ona(qna qnaVar, byte b) {
        this.a = b;
        this.b = qnaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qna qnaVar = this.b;
        switch (b) {
            case 0:
                if (qnaVar.j.isEmpty()) {
                    qnaVar.i = true;
                    qna.n = null;
                    pna pnaVar = qnaVar.f;
                    if (pnaVar != null) {
                        pnaVar.a = false;
                        qnaVar.f = null;
                    }
                    qnaVar.d.removeView(qnaVar.e);
                    if (qnaVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) qnaVar.d.getParent()).removeView(qnaVar.d);
                        break;
                    }
                }
                break;
            default:
                ArrayList arrayList = qnaVar.j;
                for (int i = 0; i < arrayList.size(); i++) {
                    ((View) arrayList.get(i)).invalidate();
                }
                break;
        }
    }
}
