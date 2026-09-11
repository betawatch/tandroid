package ah;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.z5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ o(b0 b0Var, int i10) {
        this.a = i10;
        this.b = b0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        w8 w8Var;
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                b0 b0Var = this.b;
                l lVar = b0Var.U;
                if (!b0Var.a0()) {
                    int editTextSelectionEnd = b0Var.n.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b0Var.n.getText());
                    for (z5 z5Var : (z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5.class)) {
                        if (spannableStringBuilder.getSpanEnd(z5Var) == editTextSelectionEnd) {
                            b0Var.E.remove(Long.valueOf(z5Var.documentId));
                            b0Var.F.remove(Long.valueOf(z5Var.documentId));
                            b0Var.b.A(Long.valueOf(z5Var.documentId));
                            if (z5Var.documentId == -1 && (w8Var = b0Var.s) != null) {
                                w8Var.setChecked(false);
                                b0Var.n.setMaxLength(b0Var.J);
                            }
                            if (bool.booleanValue()) {
                                b0Var.n.dispatchKeyEvent(new KeyEvent(0, 67));
                                AndroidUtilities.cancelRunOnUIThread(lVar);
                                AndroidUtilities.runOnUIThread(lVar, 350L);
                                break;
                            } else {
                                z5Var.setRemoved(new p(b0Var, z5Var, editTextSelectionEnd, 0));
                                b0Var.W(z5Var);
                                b0Var.Y(false);
                                break;
                            }
                        }
                    }
                    break;
                }
                break;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                b0 b0Var2 = this.b;
                if (!b0Var2.isFinishing()) {
                    b0Var2.v.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        b0Var2.finishFragment();
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new a1.e(6, b0Var2, tL_error), b0Var2.Q == null ? 200L : 0L);
                        break;
                    }
                }
                break;
            default:
                b0 b0Var3 = this.b;
                b0Var3.getClass();
                b0Var3.O = ((Integer) obj).intValue();
                break;
        }
    }
}
