// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jbc extends Drawable implements dn, zy, jm7 {
    public final j15 a;
    public final byte b;
    public float c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f;
    public final vm h;
    public final ibc n;
    public final ImageReceiver r;
    public final int s;
    public boolean w;
    public final TLRPC.TL_videoSizeStickerMarkup x;

    /* JADX WARN: Multi-variable type inference failed */
    public jbc(TLRPC.VideoSize videoSize, boolean z, int i) {
        j15 j15Var = new j15();
        this.a = j15Var;
        this.f = new HashSet();
        this.r = new ImageReceiver(null);
        this.s = z8c.t0;
        this.b = i;
        this.d = z;
        j15Var.d(on2.p(videoSize.background_colors.get(0).intValue(), nm7.d4), videoSize.background_colors.size() > 1 ? on2.p(videoSize.background_colors.get(1).intValue(), nm7.d4) : 0, videoSize.background_colors.size() > 2 ? on2.p(videoSize.background_colors.get(2).intValue(), nm7.d4) : 0, videoSize.background_colors.size() > 3 ? on2.p(videoSize.background_colors.get(3).intValue(), nm7.d4) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            vm vmVar = new vm((i == 1 && z) ? 7 : i == 2 ? 15 : 8, z8c.t0, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id);
            this.h = vmVar;
            vmVar.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            return;
        }
        if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.x = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            ibc ibcVar = new ibc(this);
            this.n = ibcVar;
            ibcVar.K0 = true;
            if (i == 1) {
                ibcVar.N(2);
            }
            d();
        }
    }

    @Override // zy
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            vm vmVar = this.h;
            if (vmVar != null) {
                vmVar.n(this);
            }
            ibc ibcVar = this.n;
            if (ibcVar != null) {
                ibcVar.K();
            }
            ImageReceiver imageReceiver2 = this.r;
            if (imageReceiver2 != null) {
                imageReceiver2.K();
            }
        }
        if (this.x != null) {
            nm7.f(this.s).n(this, nm7.B0);
        }
    }

    @Override // zy
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.c = imageReceiver.X0[0];
            HashSet hashSet = this.f;
            if (hashSet.isEmpty()) {
                vm vmVar = this.h;
                if (vmVar != null) {
                    vmVar.a(this);
                }
                ibc ibcVar = this.n;
                if (ibcVar != null) {
                    ibcVar.I();
                }
                ImageReceiver imageReceiver2 = this.r;
                if (imageReceiver2 != null) {
                    imageReceiver2.I();
                }
            }
            hashSet.add(imageReceiver);
            if (this.x != null) {
                nm7.f(this.s).b(this, nm7.B0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        TLRPC.Document document;
        String str;
        String str2;
        String str3;
        hs6 d0 = hs6.d0(this.s);
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = this.x;
        TLRPC.TL_messages_stickerSet n0 = d0.n0(tL_videoSizeStickerMarkup.stickerset, false);
        if (n0 != null) {
            this.w = true;
            for (int i = 0; i < n0.documents.size(); i++) {
                if (n0.documents.get(i).id == tL_videoSizeStickerMarkup.sticker_id) {
                    TLRPC.Document document2 = n0.documents.get(i);
                    boolean z = this.d;
                    byte b = this.b;
                    if (z && b == 1) {
                        str3 = "50_50";
                    } else {
                        if (b != 2) {
                            document = null;
                            str = null;
                            str2 = "50_50_firstframe";
                            this.n.Y(gn5.b(document2), str2, gn5.b(document), str, null, null, eq3.f(document2, cmb.l6, 0.2f, null), 0L, "tgs", document2, 0);
                            if (b != 3) {
                                this.r.Z(gn5.b(document2), "100_100", null, null, null, 0L, "tgs", document2, 0);
                                return;
                            }
                            return;
                        }
                        str3 = "100_100";
                    }
                    str2 = str3;
                    str = "50_50_firstframe";
                    document = document2;
                    this.n.Y(gn5.b(document2), str2, gn5.b(document), str, null, null, eq3.f(document2, cmb.l6, 0.2f, null), 0L, "tgs", document2, 0);
                    if (b != 3) {
                    }
                }
            }
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != nm7.B0 || this.w) {
            return;
        }
        d();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = getBounds().left;
        float f2 = getBounds().top;
        float f3 = getBounds().right;
        float f4 = getBounds().bottom;
        j15 j15Var = this.a;
        j15Var.b(f, f2, f3, f4);
        Paint paint = j15Var.c;
        if (this.e != null) {
            this.c = r1.X0[0];
        }
        float f5 = this.c;
        if (f5 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(j15Var.h, f5, f5, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        vm vmVar = this.h;
        if (vmVar != null) {
            mm mmVar = vmVar.k;
            if (mmVar != null) {
                mmVar.q0((int) ((width << 1) * 0.13f));
            }
            vmVar.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            vmVar.draw(canvas);
        }
        ibc ibcVar = this.n;
        if (ibcVar != null) {
            float f6 = width << 1;
            ibcVar.q0((int) (0.13f * f6));
            ibcVar.i0(centerX - width, centerY - width, f6, f6);
            ibcVar.h(canvas, null);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj == null || jbc.class != obj.getClass()) {
            return false;
        }
        jbc jbcVar = (jbc) obj;
        vm vmVar = jbcVar.h;
        if (this.b != jbcVar.b) {
            return false;
        }
        j15 j15Var = this.a;
        int i = j15Var.d;
        j15 j15Var2 = jbcVar.a;
        if (i != j15Var2.d || j15Var.e != j15Var2.e || j15Var.f != j15Var2.f || j15Var.g != j15Var2.g) {
            return false;
        }
        vm vmVar2 = this.h;
        if (vmVar2 != null && vmVar != null) {
            return vmVar2.h() == vmVar.h();
        }
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.x;
        return tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = jbcVar.x) != null && tL_videoSizeStickerMarkup2.stickerset.id == tL_videoSizeStickerMarkup.stickerset.id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // dn
    public final void invalidate() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.c.setAlpha(i);
        vm vmVar = this.h;
        if (vmVar != null) {
            vmVar.setAlpha(i);
        }
    }

    @Override // zy
    public final void a(s09 s09Var) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
