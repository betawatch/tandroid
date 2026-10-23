package ah;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.a6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ m(a0 a0Var, int i10) {
        this.a = i10;
        this.b = a0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        w8 w8Var;
        switch (this.a) {
            case 0:
                a0 a0Var = this.b;
                a0Var.Q = (TL_stories.TL_premium_boostsStatus) obj;
                if (!a0Var.E.keySet().equals(a0Var.G.keySet())) {
                    a0Var.Y(false);
                    break;
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                a0 a0Var2 = this.b;
                l lVar = a0Var2.U;
                if (!a0Var2.a0()) {
                    int editTextSelectionEnd = a0Var2.n.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a0Var2.n.getText());
                    for (a6 a6Var : (a6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a6.class)) {
                        if (spannableStringBuilder.getSpanEnd(a6Var) == editTextSelectionEnd) {
                            a0Var2.E.remove(Long.valueOf(a6Var.documentId));
                            a0Var2.F.remove(Long.valueOf(a6Var.documentId));
                            a0Var2.b.A(Long.valueOf(a6Var.documentId));
                            if (a6Var.documentId == -1 && (w8Var = a0Var2.s) != null) {
                                w8Var.setChecked(false);
                                a0Var2.n.setMaxLength(a0Var2.J);
                            }
                            if (bool.booleanValue()) {
                                a0Var2.n.dispatchKeyEvent(new KeyEvent(0, 67));
                                AndroidUtilities.cancelRunOnUIThread(lVar);
                                AndroidUtilities.runOnUIThread(lVar, 350L);
                                break;
                            } else {
                                a6Var.setRemoved(new o(a0Var2, a6Var, editTextSelectionEnd, 0));
                                a0Var2.W(a6Var);
                                a0Var2.Y(false);
                                break;
                            }
                        }
                    }
                    break;
                }
                break;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                a0 a0Var3 = this.b;
                if (!a0Var3.isFinishing()) {
                    a0Var3.v.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        a0Var3.finishFragment();
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new a1.f(8, a0Var3, tL_error), a0Var3.Q == null ? 200L : 0L);
                        break;
                    }
                }
                break;
            default:
                a0 a0Var4 = this.b;
                a0Var4.getClass();
                a0Var4.O = ((Integer) obj).intValue();
                break;
        }
    }
}
