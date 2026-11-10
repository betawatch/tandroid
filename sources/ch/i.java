package ch;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import bi.a4;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.q5;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ i(o oVar, int i7) {
        this.a = i7;
        this.b = oVar;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        r8 r8Var;
        switch (this.a) {
            case 0:
                o oVar = this.b;
                oVar.W = (TL_stories.TL_premium_boostsStatus) obj;
                if (!oVar.H.keySet().equals(oVar.J.keySet())) {
                    oVar.e0(false);
                    break;
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                o oVar2 = this.b;
                h hVar = oVar2.a0;
                if (!oVar2.g0()) {
                    int editTextSelectionEnd = oVar2.h.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oVar2.h.getText());
                    for (q5 q5Var : (q5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), q5.class)) {
                        if (spannableStringBuilder.getSpanEnd(q5Var) == editTextSelectionEnd) {
                            oVar2.H.remove(Long.valueOf(q5Var.documentId));
                            oVar2.I.remove(Long.valueOf(q5Var.documentId));
                            oVar2.b.A(Long.valueOf(q5Var.documentId));
                            if (q5Var.documentId == -1 && (r8Var = oVar2.r) != null) {
                                r8Var.setChecked(false);
                                oVar2.h.setMaxLength(oVar2.N);
                            }
                            if (bool.booleanValue()) {
                                oVar2.h.dispatchKeyEvent(new KeyEvent(0, 67));
                                org.telegram.messenger.g0.r(hVar);
                                org.telegram.messenger.g0.i3(hVar, 350L);
                                break;
                            } else {
                                q5Var.setRemoved(new ai.e0(oVar2, q5Var, editTextSelectionEnd, 5));
                                oVar2.c0(q5Var);
                                oVar2.e0(false);
                                break;
                            }
                        }
                    }
                    break;
                }
                break;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                o oVar3 = this.b;
                if (!oVar3.isFinishing()) {
                    oVar3.s.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        oVar3.finishFragment();
                        break;
                    } else {
                        org.telegram.messenger.g0.i3(new a4(16, oVar3, tL_error), oVar3.W == null ? 200L : 0L);
                        break;
                    }
                }
                break;
            default:
                o oVar4 = this.b;
                oVar4.getClass();
                oVar4.U = ((Integer) obj).intValue();
                break;
        }
    }
}
