package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ic;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.bi0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g8 {
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
    public final ag.c2 c;
    public float c0;
    public final ImageReceiver d;
    public final /* synthetic */ h8 d0;
    public final f8 e;
    public final f8 f;
    public final f8 g;
    public final f8 h;
    public final f8 i;
    public final f8 j;
    public final f8 k;
    public final f8 l;
    public final f8 m;
    public final f8 n;
    public final f8 o;
    public final f8 p;
    public final f8 q;
    public final f8 r;
    public final f8[] s;
    public final TL_stars.starGiftAttributeBackdrop t;
    public Bitmap u;
    public Bitmap v;
    public Bitmap w;
    public Canvas x;
    public int[] y;
    public int[] z;

    public g8(h8 h8Var, TL_wallet.nftItem nftitem) {
        org.telegram.ui.ActionBar.k2 k2Var = h8Var.a;
        this.d0 = h8Var;
        int i10 = 5;
        this.c = new ag.c2(i10, h8Var, this);
        this.d = new ImageReceiver(h8Var.M);
        f8 f8Var = new f8(0.0f, 900.0f, 0.86f);
        this.e = f8Var;
        f8 f8Var2 = new f8(0.0f, 900.0f, 0.86f);
        this.f = f8Var2;
        f8 f8Var3 = new f8(1.0f, 420.0f, 0.78f);
        this.g = f8Var3;
        f8 f8Var4 = new f8(1.0f, 700.0f, 0.9f);
        this.h = f8Var4;
        f8 f8Var5 = new f8(0.0f, 700.0f, 0.9f);
        this.i = f8Var5;
        f8 f8Var6 = new f8(0.0f, 380.0f, 0.82f);
        this.j = f8Var6;
        f8 f8Var7 = new f8(0.0f, 30.0f, 1.0f);
        this.k = f8Var7;
        f8 f8Var8 = new f8(0.0f, 520.0f, 0.62f);
        this.l = f8Var8;
        f8 f8Var9 = new f8(0.0f, 300.0f, 1.0f);
        this.m = f8Var9;
        f8 f8Var10 = new f8(0.0f, 150.0f, 0.82f);
        this.n = f8Var10;
        f8 f8Var11 = new f8(0.0f, 150.0f, 0.82f);
        this.o = f8Var11;
        f8 f8Var12 = new f8(0.0f, 240.0f, 1.0f);
        this.p = f8Var12;
        f8 f8Var13 = new f8(0.0f, 700.0f, 1.0f);
        this.q = f8Var13;
        f8 f8Var14 = new f8(1.0f, 260.0f, 1.0f);
        this.r = f8Var14;
        this.s = new f8[]{f8Var, f8Var2, f8Var3, f8Var4, f8Var5, f8Var6, f8Var7, f8Var8, f8Var9, f8Var10, f8Var11, f8Var12, f8Var13, f8Var14};
        this.E = -2;
        this.V = 1.0f;
        this.c0 = 1.0f;
        this.b = nftitem;
        this.a = nftitem.address;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = nftitem.gift.attributes;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i11);
            i11++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                this.t = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
            }
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                this.d.q0(ic.b(((TL_stars.starGiftAttributePattern) starGiftAttribute2).document), "60_60_firstframe", null, null, nftitem.gift, 1);
            }
        }
        d3 d3Var = new d3(this, i10);
        ag.c2 c2Var = this.c;
        c2Var.g1 = d3Var;
        this.d.g1 = d3Var;
        c2Var.d = k2Var.getCurrentAccount();
        this.d.d = k2Var.getCurrentAccount();
        ag.c2 c2Var2 = this.c;
        c2Var2.u0 = false;
        c2Var2.W(1);
        this.c.q0(ic.b(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (h8Var.isAttachedToWindow()) {
            this.c.P();
            this.d.P();
        }
    }

    public final Bitmap a() {
        h8 h8Var = this.d0;
        RectF rectF = h8Var.E;
        ag.c2 c2Var = this.c;
        Bitmap n10 = c2Var.n();
        if (n10 == null || n10.isRecycled()) {
            return this.u;
        }
        bi0 B = c2Var.B();
        int i10 = B == null ? 0 : B.a0;
        Bitmap bitmap = this.v;
        if (bitmap != null && this.G == n10 && this.E == i10) {
            return this.u;
        }
        this.G = n10;
        this.E = i10;
        if (bitmap == null) {
            this.v = Bitmap.createBitmap(zs.L4, zs.L4, Bitmap.Config.ARGB_8888);
            this.x = new Canvas(this.v);
        }
        this.v.eraseColor(0);
        rectF.set(10.0f, 10.0f, 278.0f, 278.0f);
        this.x.drawBitmap(n10, (Rect) null, rectF, h8Var.D);
        if (this.C) {
            this.D = true;
        } else {
            c();
        }
        return this.u;
    }

    public final boolean b() {
        int i10 = this.H;
        return i10 == 2 || i10 == 1;
    }

    public final void c() {
        if (this.y == null) {
            this.y = new int[82944];
            this.z = new int[82944];
            this.A = new int[82944];
            org.telegram.messenger.s5 s5Var = ga.a;
            this.B = new int[zs.L4];
        }
        this.v.getPixels(this.y, 0, zs.L4, 0, 0, zs.L4, zs.L4);
        this.C = true;
        this.D = false;
        boolean z10 = this.w == null;
        int[] iArr = this.y;
        int[] iArr2 = this.z;
        int[] iArr3 = this.A;
        int[] iArr4 = this.B;
        if (ga.a == null) {
            ga.a = new org.telegram.messenger.s5("walletStickerOutline", true);
        }
        ga.a.postRunnable(new i2.h1(this, iArr, iArr2, iArr3, iArr4, z10, 8));
    }
}
