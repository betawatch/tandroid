package fi;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class v4 extends kv0 {
    public final /* synthetic */ int L = 0;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(kk kkVar, Context context, wz wzVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, wzVar, 1, i6Var);
        this.M = kkVar;
    }

    @Override // org.telegram.ui.Components.kv0
    public void e(boolean z10, boolean z11) {
        switch (this.L) {
            case 2:
                y91 y91Var = (y91) this.M;
                super.e(z10, z11);
                if (!z11) {
                    ((TextView) y91Var.n.d).animate().cancel();
                    ((TextView) y91Var.n.d).setAlpha(z10 ? 0.0f : 1.0f);
                    break;
                } else {
                    ((TextView) y91Var.n.d).animate().alpha(z10 ? 0.0f : 1.0f).start();
                    break;
                }
            default:
                super.e(z10, z11);
                break;
        }
    }

    @Override // android.view.View
    public float getTranslationY() {
        switch (this.L) {
            case 1:
                return super.getTranslationY() - ((kk) this.M).N;
            default:
                return super.getTranslationY();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.L) {
            case 0:
                a5 a5Var = ((w4) this.M).d;
                super.onMeasure(i7, n10.c(a5Var.e, a5Var.n - a5Var.r.getPaddingTop(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.L) {
            case 1:
                super.setTranslationY(f10 + ((kk) this.M).N);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(int i7, Context context, b bVar, w4 w4Var) {
        super(context, null, i7, bVar);
        this.M = w4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(y91 y91Var, Context context, wz wzVar) {
        super(context, wzVar, 0, null);
        this.M = y91Var;
    }
}
