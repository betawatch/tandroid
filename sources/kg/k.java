package kg;

import ag.v0;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import jh.w2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ k(s sVar, int i10) {
        this.a = i10;
        this.b = sVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        q8 q8Var;
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                s sVar = this.b;
                h hVar = sVar.Q;
                if (!sVar.a0()) {
                    int editTextSelectionEnd = sVar.n.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.n.getText());
                    for (y5 y5Var : (y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y5.class)) {
                        if (spannableStringBuilder.getSpanEnd(y5Var) == editTextSelectionEnd) {
                            sVar.A.remove(Long.valueOf(y5Var.documentId));
                            sVar.B.remove(Long.valueOf(y5Var.documentId));
                            sVar.b.A(Long.valueOf(y5Var.documentId));
                            if (y5Var.documentId == -1 && (q8Var = sVar.s) != null) {
                                q8Var.setChecked(false);
                                sVar.n.setMaxLength(sVar.F);
                            }
                            if (bool.booleanValue()) {
                                sVar.n.dispatchKeyEvent(new KeyEvent(0, 67));
                                AndroidUtilities.cancelRunOnUIThread(hVar);
                                AndroidUtilities.runOnUIThread(hVar, 350L);
                                break;
                            } else {
                                y5Var.setRemoved(new v0(sVar, y5Var, editTextSelectionEnd, 9));
                                sVar.W(y5Var);
                                sVar.Y(false);
                                break;
                            }
                        }
                    }
                    break;
                }
                break;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                s sVar2 = this.b;
                if (!sVar2.isFinishing()) {
                    sVar2.v.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        sVar2.finishFragment();
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new w2(15, sVar2, tL_error), sVar2.M == null ? 200L : 0L);
                        break;
                    }
                }
                break;
            default:
                s sVar3 = this.b;
                sVar3.getClass();
                sVar3.K = ((Integer) obj).intValue();
                break;
        }
    }
}
