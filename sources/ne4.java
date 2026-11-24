// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ne4 extends pi4 {
    public final /* synthetic */ byte V;
    public final /* synthetic */ Object W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ne4(byte b, Context context, Object obj) {
        super(context, null);
        this.V = b;
        this.W = obj;
    }

    @Override // pi4
    public final int getColumnsCount() {
        byte b = this.V;
        Object obj = this.W;
        switch (b) {
            case 0:
                return ((af4) obj).s;
            default:
                return ((ye4) obj).d.s;
        }
    }
}
