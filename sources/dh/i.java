package dh;

import ai.e3;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.p5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ i(o oVar, int i3) {
        this.a = i3;
        this.b = oVar;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        q8 q8Var;
        switch (this.a) {
            case 0:
                o oVar = this.b;
                oVar.X = (TL_stories.TL_premium_boostsStatus) obj;
                if (!oVar.I.keySet().equals(oVar.K.keySet())) {
                    oVar.e0(false);
                    break;
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                o oVar2 = this.b;
                h hVar = oVar2.b0;
                if (!oVar2.g0()) {
                    int editTextSelectionEnd = oVar2.h.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oVar2.h.getText());
                    for (p5 p5Var : (p5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), p5.class)) {
                        if (spannableStringBuilder.getSpanEnd(p5Var) == editTextSelectionEnd) {
                            oVar2.I.remove(Long.valueOf(p5Var.documentId));
                            oVar2.J.remove(Long.valueOf(p5Var.documentId));
                            oVar2.b.A(Long.valueOf(p5Var.documentId));
                            if (p5Var.documentId == -1 && (q8Var = oVar2.r) != null) {
                                q8Var.setChecked(false);
                                oVar2.h.setMaxLength(oVar2.O);
                            }
                            if (bool.booleanValue()) {
                                oVar2.h.dispatchKeyEvent(new KeyEvent(0, 67));
                                org.telegram.messenger.g0.r(hVar);
                                org.telegram.messenger.g0.i3(hVar, 350L);
                                break;
                            } else {
                                p5Var.setRemoved(new e3(oVar2, p5Var, editTextSelectionEnd, 6));
                                oVar2.c0(p5Var);
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
                        org.telegram.messenger.g0.i3(new ci.e0(21, oVar3, tL_error), oVar3.X == null ? 200L : 0L);
                        break;
                    }
                }
                break;
            default:
                o oVar4 = this.b;
                oVar4.getClass();
                oVar4.V = ((Integer) obj).intValue();
                break;
        }
    }
}
