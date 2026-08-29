package hh;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import jh.h5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ k(v vVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.f = vVar;
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
                v vVar = (v) this.f;
                Runnable runnable = (Runnable) this.h;
                String str = (String) this.n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject = (TLObject) this.b;
                vVar.w = false;
                vVar.z = true;
                if (this.c) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                v.k(vVar.q, false, false);
                if (TextUtils.equals(str, vVar.t) && tL_error == null) {
                    vVar.z = true;
                    vVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str, this.d, false);
                    break;
                }
                break;
            case 1:
                h5.z0((h5) this.f, (TLObject) this.b, this.c, (TLRPC.Document) this.h, this.d, (TLRPC.TL_error) this.e, (TL_stars.saveStarGift) this.n);
                break;
            default:
                tn tnVar = (tn) this.f;
                String str2 = (String) this.n;
                CharacterStyle characterStyle = (CharacterStyle) this.h;
                MessageObject messageObject = (MessageObject) this.e;
                s1 s1Var = (s1) this.b;
                if (!str2.startsWith("video?")) {
                    if (this.c && !this.d) {
                        tnVar.getParentActivity();
                        ye.d.n(str2);
                        break;
                    } else {
                        tnVar.J9(messageObject, false, false);
                        tnVar.Z9(characterStyle, str2, false, s1Var, messageObject);
                        break;
                    }
                } else {
                    tnVar.U7(characterStyle, false, messageObject, s1Var);
                    break;
                }
        }
    }

    public /* synthetic */ k(h5 h5Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.f = h5Var;
        this.b = tLObject;
        this.c = z10;
        this.h = document;
        this.d = z11;
        this.e = tL_error;
        this.n = savestargift;
    }

    public /* synthetic */ k(tn tnVar, String str, CharacterStyle characterStyle, MessageObject messageObject, s1 s1Var, boolean z10, boolean z11) {
        this.f = tnVar;
        this.n = str;
        this.h = characterStyle;
        this.e = messageObject;
        this.b = s1Var;
        this.c = z10;
        this.d = z11;
    }
}
