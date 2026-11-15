package ch;

import android.text.TextUtils;
import android.view.View;
import di.v0;
import oi.y5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.t4;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                if (!z10) {
                    lVar.J();
                    break;
                } else {
                    lVar.K(true);
                    Runnable runnable = lVar.g2;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 1:
                di.p pVar = ((di.t) this.b).W;
                float f10 = z10 ? 1.0f : 0.0f;
                pVar.b(f10, f10, true);
                break;
            case 2:
                ((di.p0) this.b).Z1.c(z10, !TextUtils.isEmpty(r2.a2.getText()));
                break;
            case 3:
                ((di.s0) this.b).q1.c(z10, !TextUtils.isEmpty(r2.r1.getText()));
                break;
            case 4:
                ((v0) this.b).m1.c(z10, !TextUtils.isEmpty(r2.n1.getText()));
                break;
            case 5:
                y5.a((y5) this.b, z10);
                break;
            case 6:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) ((t4) this.b).f;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    break;
                }
                break;
            default:
                EditTextBoldCursor editTextBoldCursor2 = ((sg.p) this.b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    break;
                }
                break;
        }
    }
}
