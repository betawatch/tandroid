package ch;

import ai.a1;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.x5;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ i(p pVar, int i7) {
        this.a = i7;
        this.b = pVar;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        r8 r8Var;
        switch (this.a) {
            case 0:
                p pVar = this.b;
                pVar.X = (TL_stories.TL_premium_boostsStatus) obj;
                if (!pVar.I.keySet().equals(pVar.K.keySet())) {
                    pVar.e0(false);
                    break;
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                p pVar2 = this.b;
                h hVar = pVar2.b0;
                if (!pVar2.g0()) {
                    int editTextSelectionEnd = pVar2.h.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(pVar2.h.getText());
                    for (x5 x5Var : (x5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), x5.class)) {
                        if (spannableStringBuilder.getSpanEnd(x5Var) == editTextSelectionEnd) {
                            pVar2.I.remove(Long.valueOf(x5Var.documentId));
                            pVar2.J.remove(Long.valueOf(x5Var.documentId));
                            pVar2.b.A(Long.valueOf(x5Var.documentId));
                            if (x5Var.documentId == -1 && (r8Var = pVar2.r) != null) {
                                r8Var.setChecked(false);
                                pVar2.h.setMaxLength(pVar2.O);
                            }
                            if (bool.booleanValue()) {
                                pVar2.h.dispatchKeyEvent(new KeyEvent(0, 67));
                                org.telegram.messenger.g0.r(hVar);
                                org.telegram.messenger.g0.h3(hVar, 350L);
                                break;
                            } else {
                                x5Var.setRemoved(new a1(pVar2, x5Var, editTextSelectionEnd, 4));
                                pVar2.c0(x5Var);
                                pVar2.e0(false);
                                break;
                            }
                        }
                    }
                    break;
                }
                break;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                p pVar3 = this.b;
                if (!pVar3.isFinishing()) {
                    pVar3.s.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        pVar3.finishFragment();
                        break;
                    } else {
                        org.telegram.messenger.g0.h3(new c1.c(2, pVar3, tL_error), pVar3.X == null ? 200L : 0L);
                        break;
                    }
                }
                break;
            default:
                p pVar4 = this.b;
                pVar4.getClass();
                pVar4.V = ((Integer) obj).intValue();
                break;
        }
    }
}
