package fg;

import ag.n;
import android.text.TextUtils;
import android.view.View;
import eg.j2;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jq;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g extends zf.a {
    public TLRPC.User c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f;
    public CharSequence g;
    public String h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public n m;
    public n n;
    public j2 o;
    public j2 p;
    public View q;
    public jq r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.c = user;
        gVar.d = null;
        gVar.e = null;
        gVar.k = z10;
        return gVar;
    }

    @Override // zf.a
    public final boolean a(zf.a aVar) {
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.k == gVar.k) {
                    if (this.a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if ((this.m == null) == (gVar.m == null)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        long peerDialogId;
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        int i10 = this.a;
        if (i10 != gVar.a) {
            return false;
        }
        if (i10 == -1 && this.l != gVar.l) {
            return false;
        }
        if (i10 == 3) {
            TLRPC.User user = this.c;
            long j10 = 0;
            if (user != null) {
                peerDialogId = user.id;
            } else {
                TLRPC.Chat chat = this.e;
                if (chat != null) {
                    peerDialogId = -chat.id;
                } else {
                    TLRPC.InputPeer inputPeer = this.d;
                    peerDialogId = inputPeer != null ? DialogObject.getPeerDialogId(inputPeer) : 0L;
                }
            }
            TLRPC.User user2 = gVar.c;
            if (user2 != null) {
                j10 = user2.id;
            } else {
                TLRPC.Chat chat2 = gVar.e;
                if (chat2 != null) {
                    j10 = -chat2.id;
                } else {
                    TLRPC.InputPeer inputPeer2 = gVar.d;
                    if (inputPeer2 != null) {
                        j10 = DialogObject.getPeerDialogId(inputPeer2);
                    }
                }
            }
            if (peerDialogId != j10) {
                return false;
            }
        }
        int i11 = this.a;
        if (i11 == 6 && this.f != gVar.f) {
            return false;
        }
        if (i11 == 7 && !TextUtils.equals(this.g, gVar.g)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.g, gVar.g)) {
            return false;
        }
        if (this.a != 9 || (TextUtils.equals(this.g, gVar.g) && this.i == gVar.i && this.j == gVar.j)) {
            return this.a != 10 || this.q == gVar.q;
        }
        return false;
    }
}
