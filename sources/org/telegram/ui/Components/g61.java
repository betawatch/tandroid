package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g61 extends Drawable implements l5, n6, org.telegram.messenger.us {
    public final u10 a;
    public final int b;
    public float c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f;
    public final f5 h;
    public final f61 n;
    public final ImageReceiver r;
    public final int s;
    public boolean w;
    public final TLRPC.TL_videoSizeStickerMarkup x;

    public g61(TLRPC.VideoSize videoSize, boolean z10, int i10) {
        u10 u10Var = new u10();
        this.a = u10Var;
        this.f = new HashSet();
        this.r = new ImageReceiver(null);
        this.s = org.telegram.messenger.d20.s0;
        this.b = i10;
        this.d = z10;
        u10Var.d(i0.b.o(videoSize.background_colors.get(0).intValue(), org.telegram.messenger.zs.e4), videoSize.background_colors.size() > 1 ? i0.b.o(videoSize.background_colors.get(1).intValue(), org.telegram.messenger.zs.e4) : 0, videoSize.background_colors.size() > 2 ? i0.b.o(videoSize.background_colors.get(2).intValue(), org.telegram.messenger.zs.e4) : 0, videoSize.background_colors.size() > 3 ? i0.b.o(videoSize.background_colors.get(3).intValue(), org.telegram.messenger.zs.e4) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            f5 f5Var = new f5((i10 == 1 && z10) ? 7 : i10 == 2 ? 15 : 8, org.telegram.messenger.d20.s0, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id);
            this.h = f5Var;
            f5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            return;
        }
        if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.x = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            f61 f61Var = new f61(this);
            this.n = f61Var;
            f61Var.J0 = true;
            if (i10 == 1) {
                f61Var.X(2);
            }
            d();
        }
    }

    @Override // org.telegram.ui.Components.n6
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            f5 f5Var = this.h;
            if (f5Var != null) {
                f5Var.o(this);
            }
            f61 f61Var = this.n;
            if (f61Var != null) {
                f61Var.R();
            }
            ImageReceiver imageReceiver2 = this.r;
            if (imageReceiver2 != null) {
                imageReceiver2.R();
            }
        }
        if (this.x != null) {
            org.telegram.messenger.zs.f(this.s).n(this, org.telegram.messenger.zs.B0);
        }
    }

    @Override // org.telegram.ui.Components.n6
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.c = imageReceiver.W0[0];
        HashSet hashSet = this.f;
        if (hashSet.isEmpty()) {
            f5 f5Var = this.h;
            if (f5Var != null) {
                f5Var.b(this);
            }
            f61 f61Var = this.n;
            if (f61Var != null) {
                f61Var.P();
            }
            ImageReceiver imageReceiver2 = this.r;
            if (imageReceiver2 != null) {
                imageReceiver2.P();
            }
        }
        hashSet.add(imageReceiver);
        if (this.x != null) {
            org.telegram.messenger.zs.f(this.s).c(this, org.telegram.messenger.zs.B0);
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
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.s);
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = this.x;
        TLRPC.TL_messages_stickerSet m0 = b02.m0(tL_videoSizeStickerMarkup.stickerset, false);
        if (m0 != null) {
            this.w = true;
            for (int i10 = 0; i10 < m0.documents.size(); i10++) {
                if (m0.documents.get(i10).id == tL_videoSizeStickerMarkup.sticker_id) {
                    TLRPC.Document document2 = m0.documents.get(i10);
                    boolean z10 = this.d;
                    int i11 = this.b;
                    if (z10 && i11 == 1) {
                        str3 = "50_50";
                    } else {
                        if (i11 != 2) {
                            document = null;
                            str = null;
                            str2 = "50_50_firstframe";
                            this.n.u0(org.telegram.messenger.ic.b(document2), str2, org.telegram.messenger.ic.b(document), str, null, null, org.telegram.messenger.v5.f(document2, org.telegram.ui.ActionBar.t6.m6, 0.2f, null), 0L, "tgs", document2, 0);
                            if (i11 != 3) {
                                this.r.r0(org.telegram.messenger.ic.b(document2), "100_100", null, null, null, 0L, "tgs", document2, 0);
                                return;
                            }
                            return;
                        }
                        str3 = "100_100";
                    }
                    str2 = str3;
                    str = "50_50_firstframe";
                    document = document2;
                    this.n.u0(org.telegram.messenger.ic.b(document2), str2, org.telegram.messenger.ic.b(document), str, null, null, org.telegram.messenger.v5.f(document2, org.telegram.ui.ActionBar.t6.m6, 0.2f, null), 0L, "tgs", document2, 0);
                    if (i11 != 3) {
                    }
                }
            }
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != org.telegram.messenger.zs.B0 || this.w) {
            return;
        }
        d();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f7 = getBounds().left;
        float f10 = getBounds().top;
        float f11 = getBounds().right;
        float f12 = getBounds().bottom;
        u10 u10Var = this.a;
        u10Var.b(f7, f10, f11, f12);
        Paint paint = u10Var.c;
        if (this.e != null) {
            this.c = r1.W0[0];
        }
        float f13 = this.c;
        if (f13 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(u10Var.h, f13, f13, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        f5 f5Var = this.h;
        if (f5Var != null) {
            ag.c2 c2Var = f5Var.k;
            if (c2Var != null) {
                c2Var.J0((int) (width * 2 * 0.13f));
            }
            f5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            f5Var.draw(canvas);
        }
        f61 f61Var = this.n;
        if (f61Var != null) {
            float f14 = width * 2;
            f61Var.J0((int) (0.13f * f14));
            f61Var.y0(centerX - width, centerY - width, f14, f14);
            f61Var.h(canvas, null);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj == null || g61.class != obj.getClass()) {
            return false;
        }
        g61 g61Var = (g61) obj;
        f5 f5Var = g61Var.h;
        if (this.b != g61Var.b) {
            return false;
        }
        u10 u10Var = this.a;
        int i10 = u10Var.d;
        u10 u10Var2 = g61Var.a;
        if (i10 != u10Var2.d || u10Var.e != u10Var2.e || u10Var.f != u10Var2.f || u10Var.g != u10Var2.g) {
            return false;
        }
        f5 f5Var2 = this.h;
        if (f5Var2 != null && f5Var != null) {
            return f5Var2.h() == f5Var.h();
        }
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.x;
        return tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = g61Var.x) != null && tL_videoSizeStickerMarkup2.stickerset.id == tL_videoSizeStickerMarkup.stickerset.id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // org.telegram.ui.Components.l5
    public final void invalidate() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.a.c.setAlpha(i10);
        f5 f5Var = this.h;
        if (f5Var != null) {
            f5Var.setAlpha(i10);
        }
    }

    @Override // org.telegram.ui.Components.n6
    public final /* synthetic */ void a(ei0 ei0Var) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
