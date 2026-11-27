// default package

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class m82 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t82 b;

    public /* synthetic */ m82(t82 t82Var, byte b) {
        this.a = b;
        this.b = t82Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        wkb wkbVar;
        byte b = this.a;
        t82 t82Var = this.b;
        switch (b) {
            case 0:
                t82Var.X = (TL_stories.TL_premium_boostsStatus) obj;
                if (!t82Var.I.keySet().equals(t82Var.K.keySet())) {
                    t82Var.d0(false);
                    break;
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                l82 l82Var = t82Var.b0;
                if (!t82Var.f0()) {
                    int editTextSelectionEnd = t82Var.h.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(t82Var.h.getText());
                    for (hm hmVar : (hm[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), hm.class)) {
                        if (spannableStringBuilder.getSpanEnd(hmVar) == editTextSelectionEnd) {
                            t82Var.I.remove(Long.valueOf(hmVar.documentId));
                            t82Var.J.remove(Long.valueOf(hmVar.documentId));
                            t82Var.b.A(Long.valueOf(hmVar.documentId));
                            if (hmVar.documentId == -1 && (wkbVar = t82Var.r) != null) {
                                wkbVar.setChecked(false);
                                t82Var.h.setMaxLength(t82Var.O);
                            }
                            if (bool.booleanValue()) {
                                t82Var.h.dispatchKeyEvent(new KeyEvent(0, 67));
                                hl.r(l82Var);
                                hl.d3(l82Var, 350L);
                                break;
                            } else {
                                hmVar.setRemoved(new ze7((Object) t82Var, (Object) hmVar, editTextSelectionEnd, (byte) 17));
                                t82Var.b0(hmVar);
                                t82Var.d0(false);
                                break;
                            }
                        }
                    }
                    break;
                }
                break;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (!t82Var.isFinishing()) {
                    t82Var.s.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        t82Var.finishFragment();
                        break;
                    } else {
                        hl.d3(new dy1(t82Var, tL_error, (byte) 23), t82Var.X == null ? 200L : 0L);
                        break;
                    }
                }
                break;
            default:
                t82Var.V = ((Integer) obj).intValue();
                break;
        }
    }
}
