package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.ls;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.oh0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class q8 {
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
    public final fi.s2 c;
    public float c0;
    public final ImageReceiver d;
    public final /* synthetic */ r8 d0;
    public final p8 e;
    public final p8 f;
    public final p8 g;
    public final p8 h;
    public final p8 i;
    public final p8 j;
    public final p8 k;
    public final p8 l;
    public final p8 m;
    public final p8 n;
    public final p8 o;
    public final p8 p;
    public final p8 q;
    public final p8 r;
    public final p8[] s;
    public final TL_stars.starGiftAttributeBackdrop t;
    public Bitmap u;
    public Bitmap v;
    public Bitmap w;
    public Canvas x;
    public int[] y;
    public int[] z;

    public q8(r8 r8Var, TL_wallet.nftItem nftitem) {
        org.telegram.ui.ActionBar.g2 g2Var = r8Var.a;
        this.d0 = r8Var;
        this.c = new fi.s2(this, r8Var, 6);
        this.d = new ImageReceiver(r8Var.N);
        p8 p8Var = new p8(0.0f, 900.0f, 0.86f);
        this.e = p8Var;
        p8 p8Var2 = new p8(0.0f, 900.0f, 0.86f);
        this.f = p8Var2;
        p8 p8Var3 = new p8(1.0f, 420.0f, 0.78f);
        this.g = p8Var3;
        p8 p8Var4 = new p8(1.0f, 700.0f, 0.9f);
        this.h = p8Var4;
        p8 p8Var5 = new p8(0.0f, 700.0f, 0.9f);
        this.i = p8Var5;
        p8 p8Var6 = new p8(0.0f, 380.0f, 0.82f);
        this.j = p8Var6;
        p8 p8Var7 = new p8(0.0f, 30.0f, 1.0f);
        this.k = p8Var7;
        p8 p8Var8 = new p8(0.0f, 520.0f, 0.62f);
        this.l = p8Var8;
        p8 p8Var9 = new p8(0.0f, 300.0f, 1.0f);
        this.m = p8Var9;
        p8 p8Var10 = new p8(0.0f, 150.0f, 0.82f);
        this.n = p8Var10;
        p8 p8Var11 = new p8(0.0f, 150.0f, 0.82f);
        this.o = p8Var11;
        p8 p8Var12 = new p8(0.0f, 240.0f, 1.0f);
        this.p = p8Var12;
        p8 p8Var13 = new p8(0.0f, 700.0f, 1.0f);
        this.q = p8Var13;
        p8 p8Var14 = new p8(1.0f, 260.0f, 1.0f);
        this.r = p8Var14;
        int i7 = 5;
        this.s = new p8[]{p8Var, p8Var2, p8Var3, p8Var4, p8Var5, p8Var6, p8Var7, p8Var8, p8Var9, p8Var10, p8Var11, p8Var12, p8Var13, p8Var14};
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
                this.d.q0(gc.b(((TL_stars.starGiftAttributePattern) starGiftAttribute2).document), "60_60_firstframe", null, null, nftitem.gift, 1);
            }
        }
        h3 h3Var = new h3(this, i7);
        fi.s2 s2Var = this.c;
        s2Var.h1 = h3Var;
        this.d.h1 = h3Var;
        s2Var.d = g2Var.getCurrentAccount();
        this.d.d = g2Var.getCurrentAccount();
        fi.s2 s2Var2 = this.c;
        s2Var2.v0 = false;
        s2Var2.W(1);
        this.c.q0(gc.b(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (r8Var.isAttachedToWindow()) {
            this.c.P();
            this.d.P();
        }
    }

    public final Bitmap a() {
        r8 r8Var = this.d0;
        RectF rectF = r8Var.F;
        fi.s2 s2Var = this.c;
        Bitmap n10 = s2Var.n();
        if (n10 == null || n10.isRecycled()) {
            return this.u;
        }
        oh0 B = s2Var.B();
        int i7 = B == null ? 0 : B.b0;
        Bitmap bitmap = this.v;
        if (bitmap != null && this.G == n10 && this.E == i7) {
            return this.u;
        }
        this.G = n10;
        this.E = i7;
        if (bitmap == null) {
            this.v = Bitmap.createBitmap(ls.L4, ls.L4, Bitmap.Config.ARGB_8888);
            this.x = new Canvas(this.v);
        }
        this.v.eraseColor(0);
        rectF.set(10.0f, 10.0f, 278.0f, 278.0f);
        this.x.drawBitmap(n10, (Rect) null, rectF, r8Var.E);
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
            org.telegram.messenger.r5 r5Var = sa.a;
            this.B = new int[ls.L4];
        }
        this.v.getPixels(this.y, 0, ls.L4, 0, 0, ls.L4, ls.L4);
        this.C = true;
        this.D = false;
        boolean z10 = this.w == null;
        int[] iArr = this.y;
        int[] iArr2 = this.z;
        int[] iArr3 = this.A;
        ?? r82 = this.B;
        if (sa.a == null) {
            sa.a = new org.telegram.messenger.r5("walletStickerOutline", true);
        }
        sa.a.postRunnable(new di.o3(this, iArr, iArr2, iArr3, (Serializable) r82, z10, 9));
    }
}
