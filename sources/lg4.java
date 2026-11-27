// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class lg4 extends tk4 {
    public final /* synthetic */ byte V;
    public final /* synthetic */ Object W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lg4(byte b, Context context, Object obj) {
        super(context, null);
        this.V = b;
        this.W = obj;
    }

    @Override // tk4
    public final int getColumnsCount() {
        byte b = this.V;
        Object obj = this.W;
        switch (b) {
            case 0:
                return ((yg4) obj).s;
            default:
                return ((wg4) obj).d.s;
        }
    }
}
