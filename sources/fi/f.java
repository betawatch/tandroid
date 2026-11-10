package fi;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class f extends gh.b {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, h6Var);
        this.s = 2;
    }

    @Override // gh.b, gh.a
    public int A() {
        switch (this.s) {
            case 2:
                return c() ? 117440511 : 285212672;
            default:
                return super.A();
        }
    }

    @Override // gh.b, gh.a
    public int O() {
        switch (this.s) {
            case 2:
                if (c()) {
                    return 301989887;
                }
                return TLObject.FLAG_29;
            default:
                return super.O();
        }
    }

    @Override // gh.b, gh.a
    public int R0() {
        switch (this.s) {
            case 2:
                if (c()) {
                    return 83886079;
                }
                return TLObject.FLAG_29;
            default:
                return super.R0();
        }
    }

    @Override // gh.b
    public boolean c() {
        switch (this.s) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(org.telegram.ui.ActionBar.h6 h6Var, int i7, float f10, int i10) {
        super(h6Var, i7, f10);
        this.s = i10;
    }
}
