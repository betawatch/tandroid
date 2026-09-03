package mg;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import lh.n2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.u5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        r8 r8Var;
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                s sVar = this.b;
                h hVar = sVar.R;
                if (!sVar.a0()) {
                    int editTextSelectionEnd = sVar.n.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.n.getText());
                    for (u5 u5Var : (u5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), u5.class)) {
                        if (spannableStringBuilder.getSpanEnd(u5Var) == editTextSelectionEnd) {
                            sVar.B.remove(Long.valueOf(u5Var.documentId));
                            sVar.C.remove(Long.valueOf(u5Var.documentId));
                            sVar.b.A(Long.valueOf(u5Var.documentId));
                            if (u5Var.documentId == -1 && (r8Var = sVar.s) != null) {
                                r8Var.setChecked(false);
                                sVar.n.setMaxLength(sVar.G);
                            }
                            if (bool.booleanValue()) {
                                sVar.n.dispatchKeyEvent(new KeyEvent(0, 67));
                                AndroidUtilities.cancelRunOnUIThread(hVar);
                                AndroidUtilities.runOnUIThread(hVar, 350L);
                                break;
                            } else {
                                u5Var.setRemoved(new ah.a(sVar, u5Var, editTextSelectionEnd, 11));
                                sVar.W(u5Var);
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
                        AndroidUtilities.runOnUIThread(new n2(17, sVar2, tL_error), sVar2.N == null ? 200L : 0L);
                        break;
                    }
                }
                break;
            default:
                s sVar3 = this.b;
                sVar3.getClass();
                sVar3.L = ((Integer) obj).intValue();
                break;
        }
    }
}
