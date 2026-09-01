package ig;

import android.text.TextUtils;
import android.view.View;
import dg.n;
import hg.i2;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pq;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class g extends cg.b {
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
    public i2 o;
    public i2 p;
    public View q;
    public pq r;

    public g(int i10, boolean z4) {
        super(i10, z4);
        this.l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z4) {
        g gVar = new g(3, true);
        gVar.c = user;
        gVar.d = null;
        gVar.e = null;
        gVar.k = z4;
        return gVar;
    }

    @Override // cg.b
    public final boolean a(cg.b bVar) {
        if (this != bVar) {
            if (g.class == bVar.getClass()) {
                g gVar = (g) bVar;
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
