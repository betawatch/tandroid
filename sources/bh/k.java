package bh;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Components.c6;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ k(u uVar, int i10) {
        this.a = i10;
        this.b = uVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        a9 a9Var;
        switch (this.a) {
            case 0:
                u uVar = this.b;
                uVar.V = (TL_stories.TL_premium_boostsStatus) obj;
                if (!uVar.H.keySet().equals(uVar.J.keySet())) {
                    uVar.a0(false);
                    break;
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                u uVar2 = this.b;
                j jVar = uVar2.Z;
                if (!uVar2.c0()) {
                    int editTextSelectionEnd = uVar2.h.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(uVar2.h.getText());
                    for (c6 c6Var : (c6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), c6.class)) {
                        if (spannableStringBuilder.getSpanEnd(c6Var) == editTextSelectionEnd) {
                            uVar2.H.remove(Long.valueOf(c6Var.documentId));
                            uVar2.I.remove(Long.valueOf(c6Var.documentId));
                            uVar2.b.A(Long.valueOf(c6Var.documentId));
                            if (c6Var.documentId == -1 && (a9Var = uVar2.r) != null) {
                                a9Var.setChecked(false);
                                uVar2.h.setMaxLength(uVar2.M);
                            }
                            if (bool.booleanValue()) {
                                uVar2.h.dispatchKeyEvent(new KeyEvent(0, 67));
                                AndroidUtilities.cancelRunOnUIThread(jVar);
                                AndroidUtilities.runOnUIThread(jVar, 350L);
                                break;
                            } else {
                                c6Var.setRemoved(new ai.h0(uVar2, c6Var, editTextSelectionEnd, 1));
                                uVar2.Y(c6Var);
                                uVar2.a0(false);
                                break;
                            }
                        }
                    }
                    break;
                }
                break;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                u uVar3 = this.b;
                if (!uVar3.isFinishing()) {
                    uVar3.s.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        uVar3.finishFragment();
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new a1.f(22, uVar3, tL_error), uVar3.V == null ? 200L : 0L);
                        break;
                    }
                }
                break;
            default:
                u uVar4 = this.b;
                uVar4.getClass();
                uVar4.T = ((Integer) obj).intValue();
                break;
        }
    }
}
