package ah;

import android.text.TextUtils;
import android.view.View;
import ki.c6;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                ai.s sVar = ((ai.x) this.b).M;
                float f7 = z10 ? 1.0f : 0.0f;
                sVar.b(f7, f7, true);
                break;
            case 2:
                ((ai.b1) this.b).d0.c(z10, !TextUtils.isEmpty(r2.e0.getText()));
                break;
            case 3:
                ((ai.h1) this.b).f.c(z10, !TextUtils.isEmpty(r2.h.getText()));
                break;
            case 4:
                ((ai.l1) this.b).b.c(z10, !TextUtils.isEmpty(r2.c.getText()));
                break;
            case 5:
                c6.a((c6) this.b, z10);
                break;
            case 6:
                EditTextBoldCursor editTextBoldCursor = ((qg.w) this.b).c;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    break;
                }
                break;
            default:
                EditTextBoldCursor editTextBoldCursor2 = ((qg.x) this.b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    break;
                }
                break;
        }
    }
}
