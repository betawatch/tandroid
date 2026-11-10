package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.qs;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.zg0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class c8 {
    public int[] A;
    public int[] B;
    public boolean C;
    public boolean D;
    public int E;
    public Path F;
    public Bitmap G;
    public int H;
    public long I;
    public long J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public float U;
    public float V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public final String a;
    public float a0;
    public TL_wallet.nftItem b;
    public float b0;
    public final di.z2 c;
    public float c0;
    public final ImageReceiver d;
    public final /* synthetic */ d8 d0;
    public final b8 e;
    public final b8 f;
    public final b8 g;
    public final b8 h;
    public final b8 i;
    public final b8 j;
    public final b8 k;
    public final b8 l;
    public final b8 m;
    public final b8 n;
    public final b8 o;
    public final b8 p;
    public final b8 q;
    public final b8 r;
    public final b8[] s;
    public final TL_stars.starGiftAttributeBackdrop t;
    public Bitmap u;
    public Bitmap v;
    public Bitmap w;
    public Canvas x;
    public int[] y;
    public int[] z;

    public c8(d8 d8Var, TL_wallet.nftItem nftitem) {
        org.telegram.ui.ActionBar.f2 f2Var = d8Var.a;
        this.d0 = d8Var;
        this.c = new di.z2(this, d8Var, 6);
        this.d = new ImageReceiver(d8Var.M);
        b8 b8Var = new b8(0.0f, 900.0f, 0.86f);
        this.e = b8Var;
        b8 b8Var2 = new b8(0.0f, 900.0f, 0.86f);
        this.f = b8Var2;
        b8 b8Var3 = new b8(1.0f, 420.0f, 0.78f);
        this.g = b8Var3;
        b8 b8Var4 = new b8(1.0f, 700.0f, 0.9f);
        this.h = b8Var4;
        b8 b8Var5 = new b8(0.0f, 700.0f, 0.9f);
        this.i = b8Var5;
        b8 b8Var6 = new b8(0.0f, 380.0f, 0.82f);
        this.j = b8Var6;
        b8 b8Var7 = new b8(0.0f, 30.0f, 1.0f);
        this.k = b8Var7;
        b8 b8Var8 = new b8(0.0f, 520.0f, 0.62f);
        this.l = b8Var8;
        b8 b8Var9 = new b8(0.0f, 300.0f, 1.0f);
        this.m = b8Var9;
        b8 b8Var10 = new b8(0.0f, 150.0f, 0.82f);
        this.n = b8Var10;
        b8 b8Var11 = new b8(0.0f, 150.0f, 0.82f);
        this.o = b8Var11;
        b8 b8Var12 = new b8(0.0f, 240.0f, 1.0f);
        this.p = b8Var12;
        b8 b8Var13 = new b8(0.0f, 700.0f, 1.0f);
        this.q = b8Var13;
        b8 b8Var14 = new b8(1.0f, 260.0f, 1.0f);
        this.r = b8Var14;
        int i7 = 5;
        this.s = new b8[]{b8Var, b8Var2, b8Var3, b8Var4, b8Var5, b8Var6, b8Var7, b8Var8, b8Var9, b8Var10, b8Var11, b8Var12, b8Var13, b8Var14};
        this.E = -2;
        this.V = 1.0f;
        this.c0 = 1.0f;
        this.b = nftitem;
        this.a = nftitem.address;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = nftitem.gift.attributes;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i10);
            i10++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                this.t = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
            }
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                this.d.q0(hc.b(((TL_stars.starGiftAttributePattern) starGiftAttribute2).document), "60_60_firstframe", null, null, nftitem.gift, 1);
            }
        }
        c3 c3Var = new c3(this, i7);
        di.z2 z2Var = this.c;
        z2Var.g1 = c3Var;
        this.d.g1 = c3Var;
        z2Var.d = f2Var.getCurrentAccount();
        this.d.d = f2Var.getCurrentAccount();
        di.z2 z2Var2 = this.c;
        z2Var2.u0 = false;
        z2Var2.W(1);
        this.c.q0(hc.b(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (d8Var.isAttachedToWindow()) {
            this.c.P();
            this.d.P();
        }
    }

    public final Bitmap a() {
        d8 d8Var = this.d0;
        RectF rectF = d8Var.E;
        di.z2 z2Var = this.c;
        Bitmap n10 = z2Var.n();
        if (n10 == null || n10.isRecycled()) {
            return this.u;
        }
        zg0 B = z2Var.B();
        int i7 = B == null ? 0 : B.a0;
        Bitmap bitmap = this.v;
        if (bitmap != null && this.G == n10 && this.E == i7) {
            return this.u;
        }
        this.G = n10;
        this.E = i7;
        if (bitmap == null) {
            this.v = Bitmap.createBitmap(qs.L4, qs.L4, Bitmap.Config.ARGB_8888);
            this.x = new Canvas(this.v);
        }
        this.v.eraseColor(0);
        rectF.set(10.0f, 10.0f, 278.0f, 278.0f);
        this.x.drawBitmap(n10, (Rect) null, rectF, d8Var.D);
        if (this.C) {
            this.D = true;
        } else {
            c();
        }
        return this.u;
    }

    public final boolean b() {
        int i7 = this.H;
        return i7 == 2 || i7 == 1;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [int[], java.io.Serializable] */
    public final void c() {
        if (this.y == null) {
            this.y = new int[82944];
            this.z = new int[82944];
            this.A = new int[82944];
            org.telegram.messenger.q5 q5Var = da.a;
            this.B = new int[qs.L4];
        }
        this.v.getPixels(this.y, 0, qs.L4, 0, 0, qs.L4, qs.L4);
        this.C = true;
        this.D = false;
        boolean z9 = this.w == null;
        int[] iArr = this.y;
        int[] iArr2 = this.z;
        int[] iArr3 = this.A;
        ?? r82 = this.B;
        if (da.a == null) {
            da.a = new org.telegram.messenger.q5("walletStickerOutline", true);
        }
        da.a.postRunnable(new bi.l4(this, iArr, iArr2, iArr3, (Serializable) r82, z9, 9));
    }
}
