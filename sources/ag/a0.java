package ag;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import th.t5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = ((d0) this.b).c;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    break;
                }
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = ((e0) this.b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    break;
                }
                break;
            case 2:
                jh.l lVar = ((jh.q) this.b).I;
                float f9 = z10 ? 1.0f : 0.0f;
                lVar.b(f9, f9, true);
                break;
            case 3:
                ((jh.n0) this.b).Y.c(z10, !TextUtils.isEmpty(r2.Z.getText()));
                break;
            case 4:
                ((jh.s0) this.b).f.c(z10, !TextUtils.isEmpty(r2.h.getText()));
                break;
            case 5:
                ((jh.w0) this.b).b.c(z10, !TextUtils.isEmpty(r2.c.getText()));
                break;
            case 6:
                kg.p pVar = (kg.p) this.b;
                if (!z10) {
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
                t5.a((t5) this.b, z10);
                break;
        }
    }
}
