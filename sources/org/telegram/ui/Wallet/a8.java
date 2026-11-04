package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.hs;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
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
    public final ei.c3 c;
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
        org.telegram.ui.ActionBar.d2 d2Var = b8Var.a;
        this.d0 = b8Var;
        this.c = new ei.c3(this, b8Var, 6);
        this.d = new ImageReceiver(b8Var.N);
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
        int i3 = 5;
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
                this.d.q0(ac.b(((TL_stars.starGiftAttributePattern) starGiftAttribute2).document), "60_60_firstframe", null, null, nftitem.gift, 1);
            }
        }
        c3 c3Var = new c3(this, i3);
        ei.c3 c3Var2 = this.c;
        c3Var2.h1 = c3Var;
        this.d.h1 = c3Var;
        c3Var2.d = d2Var.getCurrentAccount();
        this.d.d = d2Var.getCurrentAccount();
        ei.c3 c3Var3 = this.c;
        c3Var3.v0 = false;
        c3Var3.W(1);
        this.c.q0(ac.b(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (b8Var.isAttachedToWindow()) {
            this.c.P();
            this.d.P();
        }
    }

    public final Bitmap a() {
        b8 b8Var = this.d0;
        RectF rectF = b8Var.F;
        ei.c3 c3Var = this.c;
        Bitmap n4 = c3Var.n();
        if (n4 == null || n4.isRecycled()) {
            return this.u;
        }
        ch0 B = c3Var.B();
        int i3 = B == null ? 0 : B.b0;
        Bitmap bitmap = this.v;
        if (bitmap != null && this.G == n4 && this.E == i3) {
            return this.u;
        }
        this.G = n4;
        this.E = i3;
        if (bitmap == null) {
            this.v = Bitmap.createBitmap(hs.L4, hs.L4, Bitmap.Config.ARGB_8888);
            this.x = new Canvas(this.v);
        }
        this.v.eraseColor(0);
        rectF.set(10.0f, 10.0f, 278.0f, 278.0f);
        this.x.drawBitmap(n4, (Rect) null, rectF, b8Var.E);
        if (this.C) {
            this.D = true;
        } else {
            c();
        }
        return this.u;
    }

    public final boolean b() {
        int i3 = this.H;
        return i3 == 2 || i3 == 1;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [int[], java.io.Serializable] */
    public final void c() {
        if (this.y == null) {
            this.y = new int[82944];
            this.z = new int[82944];
            this.A = new int[82944];
            org.telegram.messenger.q5 q5Var = ba.a;
            this.B = new int[hs.L4];
        }
        this.v.getPixels(this.y, 0, hs.L4, 0, 0, hs.L4, hs.L4);
        this.C = true;
        this.D = false;
        boolean z10 = this.w == null;
        int[] iArr = this.y;
        int[] iArr2 = this.z;
        int[] iArr3 = this.A;
        ?? r82 = this.B;
        if (ba.a == null) {
            ba.a = new org.telegram.messenger.q5("walletStickerOutline", true);
        }
        ba.a.postRunnable(new ci.v3(this, iArr, iArr2, iArr3, (Serializable) r82, z10, 9));
    }
}
