package hi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ue;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class p3 extends m3 {
    public final /* synthetic */ int l0 = 0;
    public final /* synthetic */ Object m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(int i7, Context context, fi.b bVar, float f10, String str) {
        super(i7, context, bVar, null, true, f10, false, false);
        this.m0 = str;
    }

    @Override // hi.m3
    public void a() {
        switch (this.l0) {
            case 1:
                nb nbVar = (nb) this.m0;
                nbVar.N0.setTranslationY(nbVar.n.getMeasuredHeight() - nbVar.N0.g());
                w9 w9Var = nbVar.r2;
                if (w9Var != null) {
                    w9Var.run();
                    nbVar.r2 = null;
                    break;
                }
                break;
        }
    }

    @Override // hi.m3
    public void c(boolean z10) {
        switch (this.l0) {
            case 1:
                if (((nb) this.m0).g0 == 0 && z10) {
                    org.telegram.messenger.g0.g3(new w(this, 19));
                    break;
                }
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.l0) {
            case 1:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= g()) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                nb nbVar = (nb) this.m0;
                nbVar.M0 = true;
                nbVar.e(false);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // hi.m3
    public String getTitle() {
        switch (this.l0) {
            case 0:
                return (String) this.m0;
            default:
                return super.getTitle();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.l0) {
            case 1:
                super.setTranslationY(f10);
                nb nbVar = (nb) this.m0;
                if (nbVar.l2) {
                    float i7 = Utilities.i(1.0f - (f10 / (nbVar.n.getMeasuredHeight() - nbVar.N0.g())), 1.0f, 0.0f);
                    nbVar.r.b(org.telegram.messenger.g0.L(-32.0f) * i7);
                    nbVar.r.setAlpha(1.0f - (0.6f * i7));
                    nbVar.j0.setAlpha(1.0f - i7);
                    break;
                }
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(nb nbVar, int i7, Context context, fi.b bVar, ue ueVar, boolean z10, boolean z11, boolean z12) {
        super(i7, context, bVar, ueVar, z10, 1.39f, z11, z12);
        this.m0 = nbVar;
    }
}
