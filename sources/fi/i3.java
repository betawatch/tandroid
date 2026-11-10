package fi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.we;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i3 extends f3 {
    public final /* synthetic */ int k0 = 0;
    public final /* synthetic */ Object l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(int i7, Context context, di.b bVar, float f10, String str) {
        super(i7, context, bVar, null, true, f10, false, false);
        this.l0 = str;
    }

    @Override // fi.f3
    public void a() {
        switch (this.k0) {
            case 1:
                va vaVar = (va) this.l0;
                vaVar.M0.setTranslationY(vaVar.n.getMeasuredHeight() - vaVar.M0.g());
                e9 e9Var = vaVar.q2;
                if (e9Var != null) {
                    e9Var.run();
                    vaVar.q2 = null;
                    break;
                }
                break;
        }
    }

    @Override // fi.f3
    public void c(boolean z9) {
        switch (this.k0) {
            case 1:
                if (((va) this.l0).f0 == 0 && z9) {
                    org.telegram.messenger.g0.h3(new v9(this, 0));
                    break;
                }
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.k0) {
            case 1:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= g()) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                va vaVar = (va) this.l0;
                vaVar.L0 = true;
                vaVar.e(false);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // fi.f3
    public String getTitle() {
        switch (this.k0) {
            case 0:
                return (String) this.l0;
            default:
                return super.getTitle();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.k0) {
            case 1:
                super.setTranslationY(f10);
                va vaVar = (va) this.l0;
                if (vaVar.k2) {
                    float i7 = Utilities.i(1.0f - (f10 / (vaVar.n.getMeasuredHeight() - vaVar.M0.g())), 1.0f, 0.0f);
                    vaVar.r.b(org.telegram.messenger.g0.L(-32.0f) * i7);
                    vaVar.r.setAlpha(1.0f - (0.6f * i7));
                    vaVar.i0.setAlpha(1.0f - i7);
                    break;
                }
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(va vaVar, int i7, Context context, di.b bVar, we weVar, boolean z9, boolean z10, boolean z11) {
        super(i7, context, bVar, weVar, z9, 1.39f, z10, z11);
        this.l0 = vaVar;
    }
}
