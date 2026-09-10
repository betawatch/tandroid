package bi;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.ui.Components.v51;
import org.telegram.ui.s60;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class g5 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g5(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        m4.l lVar;
        m4.l lVar2;
        int i10 = this.a;
        int i11 = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                p5 p5Var = (p5) obj2;
                View view = (View) obj;
                k5 k5Var = p5Var.b;
                if (view instanceof o5) {
                    k5Var.getClass();
                    int R = RecyclerView.R(view);
                    v51 G = k5Var.Y2.G(R);
                    if (G != null) {
                        o5 o5Var = (o5) view;
                        o5Var.setPosition(p5Var.b(R));
                        o5Var.b(i11 == G.d, true);
                        view.setPressed(false);
                        break;
                    }
                }
                break;
            case 1:
                m4.r rVar = (m4.r) obj2;
                try {
                    try {
                        lVar2 = (m4.l) ((i9.w) obj).get();
                        e2.d.e(lVar2, "LibraryResult must not be null");
                    } catch (InterruptedException e) {
                        e = e;
                        e2.a.o("MediaSessionStub", "Library operation failed", e);
                        String str = m4.l.d;
                        m4.p1 p1Var = new m4.p1("no error message provided", -1, Bundle.EMPTY);
                        lVar = new m4.l(p1Var.a, SystemClock.elapsedRealtime(), p1Var);
                        lVar2 = lVar;
                        m4.q qVar = rVar.d;
                        e2.d.h(qVar);
                        qVar.a(i11, lVar2);
                        return;
                    } catch (CancellationException e7) {
                        e2.a.o("MediaSessionStub", "Library operation cancelled", e7);
                        String str2 = m4.l.d;
                        m4.p1 p1Var2 = new m4.p1("no error message provided", 1, Bundle.EMPTY);
                        lVar = new m4.l(p1Var2.a, SystemClock.elapsedRealtime(), p1Var2);
                        lVar2 = lVar;
                        m4.q qVar2 = rVar.d;
                        e2.d.h(qVar2);
                        qVar2.a(i11, lVar2);
                        return;
                    } catch (ExecutionException e10) {
                        e = e10;
                        e2.a.o("MediaSessionStub", "Library operation failed", e);
                        String str3 = m4.l.d;
                        m4.p1 p1Var3 = new m4.p1("no error message provided", -1, Bundle.EMPTY);
                        lVar = new m4.l(p1Var3.a, SystemClock.elapsedRealtime(), p1Var3);
                        lVar2 = lVar;
                        m4.q qVar22 = rVar.d;
                        e2.d.h(qVar22);
                        qVar22.a(i11, lVar2);
                        return;
                    }
                    m4.q qVar222 = rVar.d;
                    e2.d.h(qVar222);
                    qVar222.a(i11, lVar2);
                } catch (RemoteException e11) {
                    e2.a.o("MediaSessionStub", "Failed to send result to browser " + rVar, e11);
                    return;
                }
            default:
                s60.e1((s60) obj2, i11, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
