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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class a8 {
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
    public final /* synthetic */ b8 d0;
    public final z7 e;
    public final z7 f;
    public final z7 g;
    public final z7 h;
    public final z7 i;
    public final z7 j;
    public final z7 k;
    public final z7 l;
    public final z7 m;
    public final z7 n;
    public final z7 o;
    public final z7 p;
    public final z7 q;
    public final z7 r;
    public final z7[] s;
    public final TL_stars.starGiftAttributeBackdrop t;
    public Bitmap u;
    public Bitmap v;
    public Bitmap w;
    public Canvas x;
    public int[] y;
    public int[] z;

    public a8(b8 b8Var, TL_wallet.nftItem nftitem) {
        org.telegram.ui.ActionBar.f2 f2Var = b8Var.a;
        this.d0 = b8Var;
        this.c = new di.z2(this, b8Var, 6);
        this.d = new ImageReceiver(b8Var.M);
        z7 z7Var = new z7(0.0f, 900.0f, 0.86f);
        this.e = z7Var;
        z7 z7Var2 = new z7(0.0f, 900.0f, 0.86f);
        this.f = z7Var2;
        z7 z7Var3 = new z7(1.0f, 420.0f, 0.78f);
        this.g = z7Var3;
        z7 z7Var4 = new z7(1.0f, 700.0f, 0.9f);
        this.h = z7Var4;
        z7 z7Var5 = new z7(0.0f, 700.0f, 0.9f);
        this.i = z7Var5;
        z7 z7Var6 = new z7(0.0f, 380.0f, 0.82f);
        this.j = z7Var6;
        z7 z7Var7 = new z7(0.0f, 30.0f, 1.0f);
        this.k = z7Var7;
        z7 z7Var8 = new z7(0.0f, 520.0f, 0.62f);
        this.l = z7Var8;
        z7 z7Var9 = new z7(0.0f, 300.0f, 1.0f);
        this.m = z7Var9;
        z7 z7Var10 = new z7(0.0f, 150.0f, 0.82f);
        this.n = z7Var10;
        z7 z7Var11 = new z7(0.0f, 150.0f, 0.82f);
        this.o = z7Var11;
        z7 z7Var12 = new z7(0.0f, 240.0f, 1.0f);
        this.p = z7Var12;
        z7 z7Var13 = new z7(0.0f, 700.0f, 1.0f);
        this.q = z7Var13;
        z7 z7Var14 = new z7(1.0f, 260.0f, 1.0f);
        this.r = z7Var14;
        int i7 = 5;
        this.s = new z7[]{z7Var, z7Var2, z7Var3, z7Var4, z7Var5, z7Var6, z7Var7, z7Var8, z7Var9, z7Var10, z7Var11, z7Var12, z7Var13, z7Var14};
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
        d3 d3Var = new d3(this, i7);
        di.z2 z2Var = this.c;
        z2Var.g1 = d3Var;
        this.d.g1 = d3Var;
        z2Var.d = f2Var.getCurrentAccount();
        this.d.d = f2Var.getCurrentAccount();
        di.z2 z2Var2 = this.c;
        z2Var2.u0 = false;
        z2Var2.W(1);
        this.c.q0(hc.b(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (b8Var.isAttachedToWindow()) {
            this.c.P();
            this.d.P();
        }
    }

    public final Bitmap a() {
        b8 b8Var = this.d0;
        RectF rectF = b8Var.E;
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
        this.x.drawBitmap(n10, (Rect) null, rectF, b8Var.D);
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
            org.telegram.messenger.q5 q5Var = ba.a;
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
        if (ba.a == null) {
            ba.a = new org.telegram.messenger.q5("walletStickerOutline", true);
        }
        ba.a.postRunnable(new bi.l4(this, iArr, iArr2, iArr3, (Serializable) r82, z9, 9));
    }
}
