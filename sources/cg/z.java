package cg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import vh.v5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        switch (this.a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = ((c0) this.b).c;
                if (!z4 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    break;
                }
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = ((d0) this.b).d;
                if (!z4 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    break;
                }
                break;
            case 2:
                lh.m mVar = ((lh.q) this.b).J;
                float f10 = z4 ? 1.0f : 0.0f;
                mVar.b(f10, f10, true);
                break;
            case 3:
                ((lh.n0) this.b).Z.c(z4, !TextUtils.isEmpty(r2.a0.getText()));
                break;
            case 4:
                ((lh.s0) this.b).f.c(z4, !TextUtils.isEmpty(r2.h.getText()));
                break;
            case 5:
                ((lh.w0) this.b).b.c(z4, !TextUtils.isEmpty(r2.c.getText()));
                break;
            case 6:
                mg.p pVar = (mg.p) this.b;
                if (!z4) {
                    pVar.m();
                    break;
                } else {
                    pVar.n(true);
                    Runnable runnable = pVar.e;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            default:
                v5.a((v5) this.b, z4);
                break;
        }
    }
}
