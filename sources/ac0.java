// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class ac0 {
    public final zb0 a = new zb0(this, 0);
    public final jn7 b = jn7.f(yac.t0);
    public final TLObject c;
    public final int d;
    public final int e;
    public cc0 f;
    public boolean g;

    public ac0(int i, int i2, TLObject tLObject) {
        this.c = tLObject;
        this.d = i;
        this.e = i2;
    }

    public void a() {
        uc7.s1(yac.t0).e3(this.d, ((TLRPC.Chat) this.c).id, false);
    }

    public void b(Object... objArr) {
        boolean z;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.id == ((TLRPC.Chat) this.c).id && (z = this.g)) {
            if (z) {
                this.g = false;
                this.b.n(this.a, this.e);
            }
            this.f.accept(chatFull);
        }
    }
}
