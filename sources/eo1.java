// default package

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class eo1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Serializable h;
    public final /* synthetic */ TLRPC.InputPeer n;
    public final /* synthetic */ int[] r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ do1 w;
    public final /* synthetic */ Object x;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ eo1(zu1 zu1Var, int i, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z, do1 do1Var) {
        this.a = (byte) 2;
        this.b = zu1Var;
        this.c = i;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f = str2;
        this.n = inputPeer;
        this.r = iArr;
        this.x = charSequence;
        this.s = z;
        this.w = do1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.x;
        Object obj2 = this.h;
        switch (b) {
            case 0:
                this.b.v8(this.c, this.d, this.e, this.f, (String) obj2, this.n, this.r, (TL_iv.RichMessage) obj, this.s, this.w);
                break;
            case 1:
                this.b.w8(this.c, this.d, this.e, this.f, (String) obj2, this.n, this.r, (CharSequence) obj, this.s, this.w);
                break;
            default:
                boolean z = this.s;
                do1 do1Var = this.w;
                this.b.x8(this.c, this.d, (String[]) obj2, this.e, this.f, this.n, this.r, (CharSequence) obj, z, do1Var);
                break;
        }
    }

    public /* synthetic */ eo1(zu1 zu1Var, int i, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z, do1 do1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = i;
        this.d = arrayList;
        this.e = str;
        this.f = str2;
        this.h = str3;
        this.n = inputPeer;
        this.r = iArr;
        this.x = obj;
        this.s = z;
        this.w = do1Var;
    }
}
