// default package

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class kn1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Serializable h;
    public final /* synthetic */ TLRPC.InputPeer n;
    public final /* synthetic */ int[] r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ jn1 w;
    public final /* synthetic */ Object x;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ kn1(yv1 yv1Var, int i, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z, jn1 jn1Var) {
        this.a = (byte) 2;
        this.b = yv1Var;
        this.c = i;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f = str2;
        this.n = inputPeer;
        this.r = iArr;
        this.x = charSequence;
        this.s = z;
        this.w = jn1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.x;
        Object obj2 = this.h;
        switch (b) {
            case 0:
                this.b.u8(this.c, this.d, this.e, this.f, (String) obj2, this.n, this.r, (TL_iv.RichMessage) obj, this.s, this.w);
                break;
            case 1:
                this.b.v8(this.c, this.d, this.e, this.f, (String) obj2, this.n, this.r, (CharSequence) obj, this.s, this.w);
                break;
            default:
                boolean z = this.s;
                jn1 jn1Var = this.w;
                this.b.w8(this.c, this.d, (String[]) obj2, this.e, this.f, this.n, this.r, (CharSequence) obj, z, jn1Var);
                break;
        }
    }

    public /* synthetic */ kn1(yv1 yv1Var, int i, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z, jn1 jn1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = i;
        this.d = arrayList;
        this.e = str;
        this.f = str2;
        this.h = str3;
        this.n = inputPeer;
        this.r = iArr;
        this.x = obj;
        this.s = z;
        this.w = jn1Var;
    }
}
