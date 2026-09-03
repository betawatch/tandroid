package jh;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import lh.g5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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

    public /* synthetic */ k(v vVar, boolean z4, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f = vVar;
        this.c = z4;
        this.h = runnable;
        this.n = str;
        this.e = tL_error;
        this.b = tLObject;
        this.d = z10;
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
                g5.z0((g5) this.f, (TLObject) this.b, this.c, (TLRPC.Document) this.h, this.d, (TLRPC.TL_error) this.e, (TL_stars.saveStarGift) this.n);
                break;
            default:
                zn znVar = (zn) this.f;
                String str2 = (String) this.n;
                CharacterStyle characterStyle = (CharacterStyle) this.h;
                MessageObject messageObject = (MessageObject) this.e;
                s1 s1Var = (s1) this.b;
                if (!str2.startsWith("video?")) {
                    if (this.c && !this.d) {
                        znVar.getParentActivity();
                        ze.d.n(str2);
                        break;
                    } else {
                        znVar.J9(messageObject, false, false);
                        znVar.Z9(characterStyle, str2, false, s1Var, messageObject);
                        break;
                    }
                } else {
                    znVar.U7(characterStyle, false, messageObject, s1Var);
                    break;
                }
        }
    }

    public /* synthetic */ k(g5 g5Var, TLObject tLObject, boolean z4, TLRPC.Document document, boolean z10, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.f = g5Var;
        this.b = tLObject;
        this.c = z4;
        this.h = document;
        this.d = z10;
        this.e = tL_error;
        this.n = savestargift;
    }

    public /* synthetic */ k(zn znVar, String str, CharacterStyle characterStyle, MessageObject messageObject, s1 s1Var, boolean z4, boolean z10) {
        this.f = znVar;
        this.n = str;
        this.h = characterStyle;
        this.e = messageObject;
        this.b = s1Var;
        this.c = z4;
        this.d = z10;
    }
}
