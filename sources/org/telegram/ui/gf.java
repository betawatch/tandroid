package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Serializable h;
    public final /* synthetic */ TLRPC.InputPeer n;
    public final /* synthetic */ int[] r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ ff w;
    public final /* synthetic */ Object x;

    public /* synthetic */ gf(cn cnVar, int i7, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z9, ff ffVar, int i10) {
        this.a = i10;
        this.b = cnVar;
        this.c = i7;
        this.d = arrayList;
        this.e = str;
        this.f = str2;
        this.h = str3;
        this.n = inputPeer;
        this.r = iArr;
        this.x = obj;
        this.s = z9;
        this.w = ffVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                cn.s0(this.b, this.c, this.d, this.e, this.f, (String) this.h, this.n, this.r, (TL_iv.RichMessage) this.x, this.s, this.w);
                break;
            case 1:
                cn.E0(this.b, this.c, this.d, this.e, this.f, (String) this.h, this.n, this.r, (CharSequence) this.x, this.s, this.w);
                break;
            default:
                cn.z0(this.b, this.c, this.d, (String[]) this.h, this.e, this.f, this.n, this.r, (CharSequence) this.x, this.s, this.w);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ gf(cn cnVar, int i7, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z9, ff ffVar) {
        this.a = 2;
        this.b = cnVar;
        this.c = i7;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f = str2;
        this.n = inputPeer;
        this.r = iArr;
        this.x = charSequence;
        this.s = z9;
        this.w = ffVar;
    }
}
