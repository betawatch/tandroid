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
import org.telegram.messenger.ns;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class b8 {
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
    public final fi.u2 c;
    public float c0;
    public final ImageReceiver d;
    public final /* synthetic */ c8 d0;
    public final a8 e;
    public final a8 f;
    public final a8 g;
    public final a8 h;
    public final a8 i;
    public final a8 j;
    public final a8 k;
    public final a8 l;
    public final a8 m;
    public final a8 n;
    public final a8 o;
    public final a8 p;
    public final a8 q;
    public final a8 r;
    public final a8[] s;
    public final TL_stars.starGiftAttributeBackdrop t;
    public Bitmap u;
    public Bitmap v;
    public Bitmap w;
    public Canvas x;
    public int[] y;
    public int[] z;

    public b8(c8 c8Var, TL_wallet.nftItem nftitem) {
        org.telegram.ui.ActionBar.e2 e2Var = c8Var.a;
        this.d0 = c8Var;
        this.c = new fi.u2(this, c8Var, 6);
        this.d = new ImageReceiver(c8Var.N);
        a8 a8Var = new a8(0.0f, 900.0f, 0.86f);
        this.e = a8Var;
        a8 a8Var2 = new a8(0.0f, 900.0f, 0.86f);
        this.f = a8Var2;
        a8 a8Var3 = new a8(1.0f, 420.0f, 0.78f);
        this.g = a8Var3;
        a8 a8Var4 = new a8(1.0f, 700.0f, 0.9f);
        this.h = a8Var4;
        a8 a8Var5 = new a8(0.0f, 700.0f, 0.9f);
        this.i = a8Var5;
        a8 a8Var6 = new a8(0.0f, 380.0f, 0.82f);
        this.j = a8Var6;
        a8 a8Var7 = new a8(0.0f, 30.0f, 1.0f);
        this.k = a8Var7;
        a8 a8Var8 = new a8(0.0f, 520.0f, 0.62f);
        this.l = a8Var8;
        a8 a8Var9 = new a8(0.0f, 300.0f, 1.0f);
        this.m = a8Var9;
        a8 a8Var10 = new a8(0.0f, 150.0f, 0.82f);
        this.n = a8Var10;
        a8 a8Var11 = new a8(0.0f, 150.0f, 0.82f);
        this.o = a8Var11;
        a8 a8Var12 = new a8(0.0f, 240.0f, 1.0f);
        this.p = a8Var12;
        a8 a8Var13 = new a8(0.0f, 700.0f, 1.0f);
        this.q = a8Var13;
        a8 a8Var14 = new a8(1.0f, 260.0f, 1.0f);
        this.r = a8Var14;
        int i7 = 5;
        this.s = new a8[]{a8Var, a8Var2, a8Var3, a8Var4, a8Var5, a8Var6, a8Var7, a8Var8, a8Var9, a8Var10, a8Var11, a8Var12, a8Var13, a8Var14};
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
        b3 b3Var = new b3(this, i7);
        fi.u2 u2Var = this.c;
        u2Var.h1 = b3Var;
        this.d.h1 = b3Var;
        u2Var.d = e2Var.getCurrentAccount();
        this.d.d = e2Var.getCurrentAccount();
        fi.u2 u2Var2 = this.c;
        u2Var2.v0 = false;
        u2Var2.W(1);
        this.c.q0(gc.b(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (c8Var.isAttachedToWindow()) {
            this.c.P();
            this.d.P();
        }
    }

    public final Bitmap a() {
        c8 c8Var = this.d0;
        RectF rectF = c8Var.F;
        fi.u2 u2Var = this.c;
        Bitmap n10 = u2Var.n();
        if (n10 == null || n10.isRecycled()) {
            return this.u;
        }
        ch0 B = u2Var.B();
        int i7 = B == null ? 0 : B.b0;
        Bitmap bitmap = this.v;
        if (bitmap != null && this.G == n10 && this.E == i7) {
            return this.u;
        }
        this.G = n10;
        this.E = i7;
        if (bitmap == null) {
            this.v = Bitmap.createBitmap(ns.L4, ns.L4, Bitmap.Config.ARGB_8888);
            this.x = new Canvas(this.v);
        }
        this.v.eraseColor(0);
        rectF.set(10.0f, 10.0f, 278.0f, 278.0f);
        this.x.drawBitmap(n10, (Rect) null, rectF, c8Var.E);
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
            org.telegram.messenger.q5 q5Var = ea.a;
            this.B = new int[ns.L4];
        }
        this.v.getPixels(this.y, 0, ns.L4, 0, 0, ns.L4, ns.L4);
        this.C = true;
        this.D = false;
        boolean z10 = this.w == null;
        int[] iArr = this.y;
        int[] iArr2 = this.z;
        int[] iArr3 = this.A;
        ?? r82 = this.B;
        if (ea.a == null) {
            ea.a = new org.telegram.messenger.q5("walletStickerOutline", true);
        }
        ea.a.postRunnable(new di.m3(this, iArr, iArr2, iArr3, (Serializable) r82, z10, 9));
    }
}
