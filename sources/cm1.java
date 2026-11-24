// default package

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cm1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Serializable h;
    public final /* synthetic */ TLRPC.InputPeer n;
    public final /* synthetic */ int[] r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ bm1 w;
    public final /* synthetic */ Object x;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ cm1(mu1 mu1Var, int i, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z, bm1 bm1Var) {
        this.a = (byte) 2;
        this.b = mu1Var;
        this.c = i;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f = str2;
        this.n = inputPeer;
        this.r = iArr;
        this.x = charSequence;
        this.s = z;
        this.w = bm1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.x;
        Object obj2 = this.h;
        switch (b) {
            case 0:
                this.b.i8(this.c, this.d, this.e, this.f, (String) obj2, this.n, this.r, (TL_iv.RichMessage) obj, this.s, this.w);
                break;
            case 1:
                this.b.j8(this.c, this.d, this.e, this.f, (String) obj2, this.n, this.r, (CharSequence) obj, this.s, this.w);
                break;
            default:
                boolean z = this.s;
                bm1 bm1Var = this.w;
                this.b.k8(this.c, this.d, (String[]) obj2, this.e, this.f, this.n, this.r, (CharSequence) obj, z, bm1Var);
                break;
        }
    }

    public /* synthetic */ cm1(mu1 mu1Var, int i, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z, bm1 bm1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = i;
        this.d = arrayList;
        this.e = str;
        this.f = str2;
        this.h = str3;
        this.n = inputPeer;
        this.r = iArr;
        this.x = obj;
        this.s = z;
        this.w = bm1Var;
    }
}
