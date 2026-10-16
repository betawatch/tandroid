package ah;

import android.text.TextUtils;
import android.view.View;
import ji.i6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.fe;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                w wVar = (w) this.b;
                if (!z10) {
                    wVar.m();
                    break;
                } else {
                    wVar.n(true);
                    Runnable runnable = wVar.e;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 1:
                i6.a((i6) this.b, z10);
                break;
            case 2:
                EditTextBoldCursor editTextBoldCursor = ((qg.v) this.b).c;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    break;
                }
                break;
            case 3:
                EditTextBoldCursor editTextBoldCursor2 = ((qg.w) this.b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    break;
                }
                break;
            case 4:
                fe feVar = ((zh.g) this.b).M;
                float f7 = z10 ? 1.0f : 0.0f;
                feVar.b(f7, f7, true);
                break;
            case 5:
                ((zh.z) this.b).c0.c(z10, !TextUtils.isEmpty(r2.d0.getText()));
                break;
            case 6:
                ((zh.d0) this.b).f.c(z10, !TextUtils.isEmpty(r2.h.getText()));
                break;
            default:
                ((zh.h0) this.b).b.c(z10, !TextUtils.isEmpty(r2.c.getText()));
                break;
        }
    }
}
