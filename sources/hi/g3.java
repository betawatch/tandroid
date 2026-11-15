package hi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ve;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class g3 extends d3 {
    public final /* synthetic */ int l0 = 0;
    public final /* synthetic */ Object m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(int i7, Context context, fi.b bVar, float f10, String str) {
        super(i7, context, bVar, null, true, f10, false, false);
        this.m0 = str;
    }

    @Override // hi.d3
    public void a() {
        switch (this.l0) {
            case 1:
                sa saVar = (sa) this.m0;
                saVar.N0.setTranslationY(saVar.n.getMeasuredHeight() - saVar.N0.g());
                c9 c9Var = saVar.r2;
                if (c9Var != null) {
                    c9Var.run();
                    saVar.r2 = null;
                    break;
                }
                break;
        }
    }

    @Override // hi.d3
    public void c(boolean z10) {
        switch (this.l0) {
            case 1:
                if (((sa) this.m0).g0 == 0 && z10) {
                    org.telegram.messenger.g0.h3(new e1(this, 14));
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
                sa saVar = (sa) this.m0;
                saVar.M0 = true;
                saVar.e(false);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // hi.d3
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
                sa saVar = (sa) this.m0;
                if (saVar.l2) {
                    float i7 = Utilities.i(1.0f - (f10 / (saVar.n.getMeasuredHeight() - saVar.N0.g())), 1.0f, 0.0f);
                    saVar.r.b(org.telegram.messenger.g0.L(-32.0f) * i7);
                    saVar.r.setAlpha(1.0f - (0.6f * i7));
                    saVar.j0.setAlpha(1.0f - i7);
                    break;
                }
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(sa saVar, int i7, Context context, fi.b bVar, ve veVar, boolean z10, boolean z11, boolean z12) {
        super(i7, context, bVar, veVar, z10, 1.39f, z11, z12);
        this.m0 = saVar;
    }
}
