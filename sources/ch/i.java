package ch;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import bi.a4;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.r5;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                    for (r5 r5Var : (r5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), r5.class)) {
                        if (spannableStringBuilder.getSpanEnd(r5Var) == editTextSelectionEnd) {
                            oVar2.H.remove(Long.valueOf(r5Var.documentId));
                            oVar2.I.remove(Long.valueOf(r5Var.documentId));
                            oVar2.b.A(Long.valueOf(r5Var.documentId));
                            if (r5Var.documentId == -1 && (r8Var = oVar2.r) != null) {
                                r8Var.setChecked(false);
                                oVar2.h.setMaxLength(oVar2.N);
                            }
                            if (bool.booleanValue()) {
                                oVar2.h.dispatchKeyEvent(new KeyEvent(0, 67));
                                org.telegram.messenger.g0.r(hVar);
                                org.telegram.messenger.g0.i3(hVar, 350L);
                                break;
                            } else {
                                r5Var.setRemoved(new ai.e0(oVar2, r5Var, editTextSelectionEnd, 5));
                                oVar2.c0(r5Var);
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
