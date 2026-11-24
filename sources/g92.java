// default package

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class g92 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n92 b;

    public /* synthetic */ g92(n92 n92Var, byte b) {
        this.a = b;
        this.b = n92Var;
    }

    @Override // qac
    public final void a(Object obj) {
        bjb bjbVar;
        byte b = this.a;
        n92 n92Var = this.b;
        switch (b) {
            case 0:
                n92Var.X = (TL_stories.TL_premium_boostsStatus) obj;
                if (!n92Var.I.keySet().equals(n92Var.K.keySet())) {
                    n92Var.e0(false);
                    break;
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                f92 f92Var = n92Var.b0;
                if (!n92Var.g0()) {
                    int editTextSelectionEnd = n92Var.h.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(n92Var.h.getText());
                    for (gn gnVar : (gn[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gn.class)) {
                        if (spannableStringBuilder.getSpanEnd(gnVar) == editTextSelectionEnd) {
                            n92Var.I.remove(Long.valueOf(gnVar.documentId));
                            n92Var.J.remove(Long.valueOf(gnVar.documentId));
                            n92Var.b.A(Long.valueOf(gnVar.documentId));
                            if (gnVar.documentId == -1 && (bjbVar = n92Var.r) != null) {
                                bjbVar.setChecked(false);
                                n92Var.h.setMaxLength(n92Var.O);
                            }
                            if (bool.booleanValue()) {
                                n92Var.h.dispatchKeyEvent(new KeyEvent(0, 67));
                                gm.r(f92Var);
                                gm.d3(f92Var, 350L);
                                break;
                            } else {
                                gnVar.setRemoved(new wc7((Object) n92Var, (Object) gnVar, editTextSelectionEnd, (byte) 17));
                                n92Var.c0(gnVar);
                                n92Var.e0(false);
                                break;
                            }
                        }
                    }
                    break;
                }
                break;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (!n92Var.isFinishing()) {
                    n92Var.s.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        n92Var.finishFragment();
                        break;
                    } else {
                        gm.d3(new lx1(n92Var, tL_error, (byte) 25), n92Var.X == null ? 200L : 0L);
                        break;
                    }
                }
                break;
            default:
                n92Var.V = ((Integer) obj).intValue();
                break;
        }
    }
}
