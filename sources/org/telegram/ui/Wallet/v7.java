package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class v7 {
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
    public final ci.g3 c;
    public float c0;
    public final ImageReceiver d;
    public final /* synthetic */ w7 d0;
    public final u7 e;
    public final u7 f;
    public final u7 g;
    public final u7 h;
    public final u7 i;
    public final u7 j;
    public final u7 k;
    public final u7 l;
    public final u7 m;
    public final u7 n;
    public final u7 o;
    public final u7 p;
    public final u7 q;
    public final u7 r;
    public final u7[] s;
    public final TL_stars.starGiftAttributeBackdrop t;
    public Bitmap u;
    public Bitmap v;
    public Bitmap w;
    public Canvas x;
    public int[] y;
    public int[] z;

    public v7(w7 w7Var, TL_wallet.nftItem nftitem) {
        org.telegram.ui.ActionBar.n2 n2Var = w7Var.a;
        this.d0 = w7Var;
        this.c = new ci.g3(this, w7Var, 6);
        this.d = new ImageReceiver(w7Var.M);
        u7 u7Var = new u7(0.0f, 900.0f, 0.86f);
        this.e = u7Var;
        u7 u7Var2 = new u7(0.0f, 900.0f, 0.86f);
        this.f = u7Var2;
        u7 u7Var3 = new u7(1.0f, 420.0f, 0.78f);
        this.g = u7Var3;
        u7 u7Var4 = new u7(1.0f, 700.0f, 0.9f);
        this.h = u7Var4;
        u7 u7Var5 = new u7(0.0f, 700.0f, 0.9f);
        this.i = u7Var5;
        u7 u7Var6 = new u7(0.0f, 380.0f, 0.82f);
        this.j = u7Var6;
        u7 u7Var7 = new u7(0.0f, 30.0f, 1.0f);
        this.k = u7Var7;
        u7 u7Var8 = new u7(0.0f, 520.0f, 0.62f);
        this.l = u7Var8;
        u7 u7Var9 = new u7(0.0f, 300.0f, 1.0f);
        this.m = u7Var9;
        u7 u7Var10 = new u7(0.0f, 150.0f, 0.82f);
        this.n = u7Var10;
        u7 u7Var11 = new u7(0.0f, 150.0f, 0.82f);
        this.o = u7Var11;
        u7 u7Var12 = new u7(0.0f, 240.0f, 1.0f);
        this.p = u7Var12;
        u7 u7Var13 = new u7(0.0f, 700.0f, 1.0f);
        this.q = u7Var13;
        u7 u7Var14 = new u7(1.0f, 260.0f, 1.0f);
        this.r = u7Var14;
        int i10 = 5;
        this.s = new u7[]{u7Var, u7Var2, u7Var3, u7Var4, u7Var5, u7Var6, u7Var7, u7Var8, u7Var9, u7Var10, u7Var11, u7Var12, u7Var13, u7Var14};
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
                this.d.setImage(ImageLocation.getForDocument(((TL_stars.starGiftAttributePattern) starGiftAttribute2).document), "60_60_firstframe", null, null, nftitem.gift, 1);
            }
        }
        o2 o2Var = new o2(this, i10);
        this.c.setDelegate(o2Var);
        this.d.setDelegate(o2Var);
        this.c.setCurrentAccount(n2Var.getCurrentAccount());
        this.d.setCurrentAccount(n2Var.getCurrentAccount());
        this.c.setAllowStartLottieAnimation(false);
        this.c.setAutoRepeat(1);
        this.c.setImage(ImageLocation.getForDocument(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (w7Var.isAttachedToWindow()) {
            this.c.onAttachedToWindow();
            this.d.onAttachedToWindow();
        }
    }

    public final Bitmap a() {
        w7 w7Var = this.d0;
        RectF rectF = w7Var.E;
        ci.g3 g3Var = this.c;
        Bitmap bitmap = g3Var.getBitmap();
        if (bitmap == null || bitmap.isRecycled()) {
            return this.u;
        }
        uj0 lottieAnimation = g3Var.getLottieAnimation();
        int i10 = lottieAnimation == null ? 0 : lottieAnimation.a0;
        Bitmap bitmap2 = this.v;
        if (bitmap2 != null && this.G == bitmap && this.E == i10) {
            return this.u;
        }
        this.G = bitmap;
        this.E = i10;
        if (bitmap2 == null) {
            this.v = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
            this.x = new Canvas(this.v);
        }
        this.v.eraseColor(0);
        rectF.set(10.0f, 10.0f, 278.0f, 278.0f);
        this.x.drawBitmap(bitmap, (Rect) null, rectF, w7Var.y);
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
            this.B = new int[945];
        }
        this.v.getPixels(this.y, 0, 288, 0, 0, 288, 288);
        this.C = true;
        this.D = false;
        boolean z10 = this.w == null;
        int[] iArr = this.y;
        int[] iArr2 = this.z;
        int[] iArr3 = this.A;
        int[] iArr4 = this.B;
        if (w7.k6.a == null) {
            w7.k6.a = new DispatchQueue("walletStickerOutline");
        }
        w7.k6.a.postRunnable(new i2.d1(this, iArr, iArr2, iArr3, iArr4, z10, 12));
    }
}
