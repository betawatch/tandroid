package bh;

import android.text.TextUtils;
import android.view.View;
import bi.g1;
import bi.k1;
import li.d6;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                q qVar = (q) this.b;
                if (!z10) {
                    qVar.m();
                    break;
                } else {
                    qVar.n(true);
                    Runnable runnable = qVar.e;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 1:
                bi.s sVar = ((bi.y) this.b).V;
                float f7 = z10 ? 1.0f : 0.0f;
                sVar.b(f7, f7, true);
                break;
            case 2:
                ((bi.b1) this.b).d0.c(z10, !TextUtils.isEmpty(r2.e0.getText()));
                break;
            case 3:
                ((g1) this.b).f.c(z10, !TextUtils.isEmpty(r2.h.getText()));
                break;
            case 4:
                ((k1) this.b).b.c(z10, !TextUtils.isEmpty(r2.c.getText()));
                break;
            case 5:
                d6.a((d6) this.b, z10);
                break;
            case 6:
                EditTextBoldCursor editTextBoldCursor = ((rg.w) this.b).c;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    break;
                }
                break;
            default:
                EditTextBoldCursor editTextBoldCursor2 = ((rg.x) this.b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    break;
                }
                break;
        }
    }
}
