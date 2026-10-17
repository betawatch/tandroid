package ai;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ l2(k7 k7Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.d = k7Var;
        this.e = tLObject;
        this.b = z10;
        this.f = document;
        this.c = z11;
        this.h = tL_error;
        this.n = savestargift;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k7.Z0((k7) this.d, (TLObject) this.e, this.b, (TLRPC.Document) this.f, this.c, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.n);
                break;
            case 1:
                sn snVar = (sn) this.d;
                String str = (String) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.n;
                if (!str.startsWith("video?")) {
                    if (this.b && !this.c) {
                        snVar.getParentActivity();
                        pf.d.m(str);
                        break;
                    } else {
                        snVar.O9(messageObject, false, false);
                        snVar.ea(characterStyle, str, false, u1Var, messageObject);
                        break;
                    }
                } else {
                    snVar.X7(characterStyle, false, messageObject, u1Var);
                    break;
                }
                break;
            default:
                xh.k kVar = (xh.k) this.d;
                Runnable runnable = (Runnable) this.f;
                String str2 = (String) this.n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.e;
                kVar.w = false;
                kVar.z = true;
                if (this.b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                xh.k.k(kVar.q, false, false);
                if (TextUtils.equals(str2, kVar.t) && tL_error == null) {
                    kVar.z = true;
                    kVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.c, false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ l2(sn snVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11) {
        this.d = snVar;
        this.e = str;
        this.f = characterStyle;
        this.h = messageObject;
        this.n = u1Var;
        this.b = z10;
        this.c = z11;
    }

    public /* synthetic */ l2(xh.k kVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.d = kVar;
        this.b = z10;
        this.f = runnable;
        this.n = str;
        this.h = tL_error;
        this.e = tLObject;
        this.c = z11;
    }
}
