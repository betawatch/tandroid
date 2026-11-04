package gi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.pe;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g3 extends d3 {
    public final /* synthetic */ int l0 = 0;
    public final /* synthetic */ Object m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(int i3, Context context, ei.b bVar, float f10, String str) {
        super(i3, context, bVar, null, true, f10, false, false);
        this.m0 = str;
    }

    @Override // gi.d3
    public void a() {
        switch (this.l0) {
            case 1:
                va vaVar = (va) this.m0;
                vaVar.N0.setTranslationY(vaVar.n.getMeasuredHeight() - vaVar.N0.g());
                f9 f9Var = vaVar.r2;
                if (f9Var != null) {
                    f9Var.run();
                    vaVar.r2 = null;
                    break;
                }
                break;
        }
    }

    @Override // gi.d3
    public void c(boolean z10) {
        switch (this.l0) {
            case 1:
                if (((va) this.m0).g0 == 0 && z10) {
                    org.telegram.messenger.g0.h3(new f6(this, 5));
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
                va vaVar = (va) this.m0;
                vaVar.M0 = true;
                vaVar.e(false);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // gi.d3
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
                va vaVar = (va) this.m0;
                if (vaVar.l2) {
                    float i3 = Utilities.i(1.0f - (f10 / (vaVar.n.getMeasuredHeight() - vaVar.N0.g())), 1.0f, 0.0f);
                    vaVar.r.b(org.telegram.messenger.g0.L(-32.0f) * i3);
                    vaVar.r.setAlpha(1.0f - (0.6f * i3));
                    vaVar.j0.setAlpha(1.0f - i3);
                    break;
                }
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(va vaVar, int i3, Context context, ei.b bVar, pe peVar, boolean z10, boolean z11, boolean z12) {
        super(i3, context, bVar, peVar, z10, 1.39f, z11, z12);
        this.m0 = vaVar;
    }
}
