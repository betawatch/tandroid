package ng;

import ag.t0;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import mg.y1;
import org.telegram.messenger.o5;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h extends hg.b {
    public TLRPC.User c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f;
    public CharSequence g;
    public CharSequence h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public t0 m;
    public t0 n;
    public y1 o;
    public y1 p;
    public View q;
    public Drawable r;

    public h(int i10, boolean z10) {
        super(i10, z10);
        this.l = -1;
    }

    public static h b(CharSequence charSequence) {
        h hVar = new h(8, false);
        hVar.g = charSequence;
        return hVar;
    }

    public static h c(TLRPC.User user, boolean z10) {
        h hVar = new h(3, true);
        hVar.c = user;
        hVar.d = null;
        hVar.e = null;
        hVar.k = z10;
        return hVar;
    }

    @Override // hg.b
    public final boolean a(hg.b bVar) {
        if (this != bVar) {
            if (h.class == bVar.getClass()) {
                h hVar = (h) bVar;
                if (this.k == hVar.k) {
                    if (this.a == 8) {
                        if (TextUtils.equals(this.h, hVar.h)) {
                            if ((this.m == null) == (hVar.m == null)) {
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
        long n10;
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        int i10 = this.a;
        if (i10 != hVar.a) {
            return false;
        }
        if (i10 == -1 && this.l != hVar.l) {
            return false;
        }
        if (i10 == 3) {
            TLRPC.User user = this.c;
            long j10 = 0;
            if (user != null) {
                n10 = user.id;
            } else {
                TLRPC.Chat chat = this.e;
                if (chat != null) {
                    n10 = -chat.id;
                } else {
                    TLRPC.InputPeer inputPeer = this.d;
                    n10 = inputPeer != null ? o5.n(inputPeer) : 0L;
                }
            }
            TLRPC.User user2 = hVar.c;
            if (user2 != null) {
                j10 = user2.id;
            } else {
                TLRPC.Chat chat2 = hVar.e;
                if (chat2 != null) {
                    j10 = -chat2.id;
                } else {
                    TLRPC.InputPeer inputPeer2 = hVar.d;
                    if (inputPeer2 != null) {
                        j10 = o5.n(inputPeer2);
                    }
                }
            }
            if (n10 != j10) {
                return false;
            }
        }
        int i11 = this.a;
        if (i11 == 6 && this.f != hVar.f) {
            return false;
        }
        if (i11 == 7 && !TextUtils.equals(this.g, hVar.g)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.g, hVar.g)) {
            return false;
        }
        if (this.a != 9 || (TextUtils.equals(this.g, hVar.g) && this.i == hVar.i && this.j == hVar.j)) {
            return this.a != 10 || this.q == hVar.q;
        }
        return false;
    }
}
