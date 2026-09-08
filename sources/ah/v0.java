package ah;

import android.text.TextUtils;
import android.view.View;
import ji.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.zd;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                x xVar = (x) this.b;
                if (!z10) {
                    xVar.m();
                    break;
                } else {
                    xVar.n(true);
                    Runnable runnable = xVar.e;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 1:
                g6.a((g6) this.b, z10);
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
                zd zdVar = ((zh.g) this.b).M;
                float f7 = z10 ? 1.0f : 0.0f;
                zdVar.b(f7, f7, true);
                break;
            case 5:
                ((zh.a0) this.b).c0.c(z10, !TextUtils.isEmpty(r2.d0.getText()));
                break;
            case 6:
                ((zh.e0) this.b).f.c(z10, !TextUtils.isEmpty(r2.h.getText()));
                break;
            default:
                ((zh.i0) this.b).b.c(z10, !TextUtils.isEmpty(r2.c.getText()));
                break;
        }
    }
}
