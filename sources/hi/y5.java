package hi;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ae;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class y5 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                g6.a((g6) this.b, z10);
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor = ((og.y) this.b).c;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    break;
                }
                break;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = ((og.z) this.b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    break;
                }
                break;
            case 3:
                ae aeVar = ((xh.h) this.b).M;
                float f7 = z10 ? 1.0f : 0.0f;
                aeVar.b(f7, f7, true);
                break;
            case 4:
                ((xh.a0) this.b).c0.c(z10, !TextUtils.isEmpty(r2.d0.getText()));
                break;
            case 5:
                ((xh.e0) this.b).f.c(z10, !TextUtils.isEmpty(r2.h.getText()));
                break;
            case 6:
                ((xh.i0) this.b).b.c(z10, !TextUtils.isEmpty(r2.c.getText()));
                break;
            default:
                yg.p pVar = (yg.p) this.b;
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
        }
    }
}
