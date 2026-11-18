package hi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ue;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class h3 extends e3 {
    public final /* synthetic */ int l0 = 0;
    public final /* synthetic */ Object m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(int i7, Context context, fi.b bVar, float f10, String str) {
        super(i7, context, bVar, null, true, f10, false, false);
        this.m0 = str;
    }

    @Override // hi.e3
    public void a() {
        switch (this.l0) {
            case 1:
                ta taVar = (ta) this.m0;
                taVar.N0.setTranslationY(taVar.n.getMeasuredHeight() - taVar.N0.g());
                c9 c9Var = taVar.r2;
                if (c9Var != null) {
                    c9Var.run();
                    taVar.r2 = null;
                    break;
                }
                break;
        }
    }

    @Override // hi.e3
    public void c(boolean z10) {
        switch (this.l0) {
            case 1:
                if (((ta) this.m0).g0 == 0 && z10) {
                    org.telegram.messenger.g0.g3(new k(this, 18));
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
                ta taVar = (ta) this.m0;
                taVar.M0 = true;
                taVar.e(false);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // hi.e3
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
                ta taVar = (ta) this.m0;
                if (taVar.l2) {
                    float i7 = Utilities.i(1.0f - (f10 / (taVar.n.getMeasuredHeight() - taVar.N0.g())), 1.0f, 0.0f);
                    taVar.r.b(org.telegram.messenger.g0.L(-32.0f) * i7);
                    taVar.r.setAlpha(1.0f - (0.6f * i7));
                    taVar.j0.setAlpha(1.0f - i7);
                    break;
                }
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(ta taVar, int i7, Context context, fi.b bVar, ue ueVar, boolean z10, boolean z11, boolean z12) {
        super(i7, context, bVar, ueVar, z10, 1.39f, z11, z12);
        this.m0 = taVar;
    }
}
