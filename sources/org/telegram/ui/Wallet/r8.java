package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.ks;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.nh0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class r8 {
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
    public final /* synthetic */ s8 d0;
    public final q8 e;
    public final q8 f;
    public final q8 g;
    public final q8 h;
    public final q8 i;
    public final q8 j;
    public final q8 k;
    public final q8 l;
    public final q8 m;
    public final q8 n;
    public final q8 o;
    public final q8 p;
    public final q8 q;
    public final q8 r;
    public final q8[] s;
    public final TL_stars.starGiftAttributeBackdrop t;
    public Bitmap u;
    public Bitmap v;
    public Bitmap w;
    public Canvas x;
    public int[] y;
    public int[] z;

    public r8(s8 s8Var, TL_wallet.nftItem nftitem) {
        org.telegram.ui.ActionBar.g2 g2Var = s8Var.a;
        this.d0 = s8Var;
        this.c = new fi.s2(this, s8Var, 6);
        this.d = new ImageReceiver(s8Var.N);
        q8 q8Var = new q8(0.0f, 900.0f, 0.86f);
        this.e = q8Var;
        q8 q8Var2 = new q8(0.0f, 900.0f, 0.86f);
        this.f = q8Var2;
        q8 q8Var3 = new q8(1.0f, 420.0f, 0.78f);
        this.g = q8Var3;
        q8 q8Var4 = new q8(1.0f, 700.0f, 0.9f);
        this.h = q8Var4;
        q8 q8Var5 = new q8(0.0f, 700.0f, 0.9f);
        this.i = q8Var5;
        q8 q8Var6 = new q8(0.0f, 380.0f, 0.82f);
        this.j = q8Var6;
        q8 q8Var7 = new q8(0.0f, 30.0f, 1.0f);
        this.k = q8Var7;
        q8 q8Var8 = new q8(0.0f, 520.0f, 0.62f);
        this.l = q8Var8;
        q8 q8Var9 = new q8(0.0f, 300.0f, 1.0f);
        this.m = q8Var9;
        q8 q8Var10 = new q8(0.0f, 150.0f, 0.82f);
        this.n = q8Var10;
        q8 q8Var11 = new q8(0.0f, 150.0f, 0.82f);
        this.o = q8Var11;
        q8 q8Var12 = new q8(0.0f, 240.0f, 1.0f);
        this.p = q8Var12;
        q8 q8Var13 = new q8(0.0f, 700.0f, 1.0f);
        this.q = q8Var13;
        q8 q8Var14 = new q8(1.0f, 260.0f, 1.0f);
        this.r = q8Var14;
        int i7 = 5;
        this.s = new q8[]{q8Var, q8Var2, q8Var3, q8Var4, q8Var5, q8Var6, q8Var7, q8Var8, q8Var9, q8Var10, q8Var11, q8Var12, q8Var13, q8Var14};
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
                this.d.r0(fc.b(((TL_stars.starGiftAttributePattern) starGiftAttribute2).document), "60_60_firstframe", null, null, nftitem.gift, 1);
            }
        }
        i3 i3Var = new i3(this, i7);
        fi.s2 s2Var = this.c;
        s2Var.h1 = i3Var;
        this.d.h1 = i3Var;
        s2Var.d = g2Var.getCurrentAccount();
        this.d.d = g2Var.getCurrentAccount();
        fi.s2 s2Var2 = this.c;
        s2Var2.v0 = false;
        s2Var2.X(1);
        this.c.r0(fc.b(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (s8Var.isAttachedToWindow()) {
            this.c.Q();
            this.d.Q();
        }
    }

    public final Bitmap a() {
        s8 s8Var = this.d0;
        RectF rectF = s8Var.F;
        fi.s2 s2Var = this.c;
        Bitmap n10 = s2Var.n();
        if (n10 == null || n10.isRecycled()) {
            return this.u;
        }
        nh0 C = s2Var.C();
        int i7 = C == null ? 0 : C.b0;
        Bitmap bitmap = this.v;
        if (bitmap != null && this.G == n10 && this.E == i7) {
            return this.u;
        }
        this.G = n10;
        this.E = i7;
        if (bitmap == null) {
            this.v = Bitmap.createBitmap(ks.L4, ks.L4, Bitmap.Config.ARGB_8888);
            this.x = new Canvas(this.v);
        }
        this.v.eraseColor(0);
        rectF.set(10.0f, 10.0f, 278.0f, 278.0f);
        this.x.drawBitmap(n10, (Rect) null, rectF, s8Var.E);
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
            org.telegram.messenger.r5 r5Var = ta.a;
            this.B = new int[ks.L4];
        }
        this.v.getPixels(this.y, 0, ks.L4, 0, 0, ks.L4, ks.L4);
        this.C = true;
        this.D = false;
        boolean z10 = this.w == null;
        int[] iArr = this.y;
        int[] iArr2 = this.z;
        int[] iArr3 = this.A;
        ?? r82 = this.B;
        if (ta.a == null) {
            ta.a = new org.telegram.messenger.r5("walletStickerOutline", true);
        }
        ta.a.postRunnable(new di.o3(this, iArr, iArr2, iArr3, (Serializable) r82, z10, 9));
    }
}
