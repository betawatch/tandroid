package eh;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import gh.k5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ m(x xVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.f = xVar;
        this.c = z10;
        this.h = runnable;
        this.n = str;
        this.e = tL_error;
        this.b = tLObject;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x xVar = (x) this.f;
                Runnable runnable = (Runnable) this.h;
                String str = (String) this.n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject = (TLObject) this.b;
                xVar.w = false;
                xVar.z = true;
                if (this.c) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                x.k(xVar.q, false, false);
                if (TextUtils.equals(str, xVar.t) && tL_error == null) {
                    xVar.z = true;
                    xVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str, this.d, false);
                    break;
                }
                break;
            case 1:
                k5.y0((k5) this.f, (TLObject) this.b, this.c, (TLRPC.Document) this.h, this.d, (TLRPC.TL_error) this.e, (TL_stars.saveStarGift) this.n);
                break;
            default:
                qn qnVar = (qn) this.f;
                String str2 = (String) this.n;
                CharacterStyle characterStyle = (CharacterStyle) this.h;
                MessageObject messageObject = (MessageObject) this.e;
                t1 t1Var = (t1) this.b;
                if (!str2.startsWith("video?")) {
                    if (this.c && !this.d) {
                        qnVar.getParentActivity();
                        ve.e.n(str2);
                        break;
                    } else {
                        qnVar.J9(messageObject, false, false);
                        qnVar.Z9(characterStyle, str2, false, t1Var, messageObject);
                        break;
                    }
                } else {
                    qnVar.U7(characterStyle, false, messageObject, t1Var);
                    break;
                }
        }
    }

    public /* synthetic */ m(k5 k5Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.f = k5Var;
        this.b = tLObject;
        this.c = z10;
        this.h = document;
        this.d = z11;
        this.e = tL_error;
        this.n = savestargift;
    }

    public /* synthetic */ m(qn qnVar, String str, CharacterStyle characterStyle, MessageObject messageObject, t1 t1Var, boolean z10, boolean z11) {
        this.f = qnVar;
        this.n = str;
        this.h = characterStyle;
        this.e = messageObject;
        this.b = t1Var;
        this.c = z10;
        this.d = z11;
    }
}
