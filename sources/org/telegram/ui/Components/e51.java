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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class e51 extends Drawable implements o5, r6, org.telegram.messenger.ls {
    public final f10 a;
    public final int b;
    public float c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f;
    public final i5 h;
    public final d51 n;
    public final ImageReceiver r;
    public final int s;
    public boolean w;
    public final TLRPC.TL_videoSizeStickerMarkup x;

    public e51(TLRPC.VideoSize videoSize, boolean z9, int i7) {
        f10 f10Var = new f10();
        this.a = f10Var;
        this.f = new HashSet();
        this.r = new ImageReceiver(null);
        this.s = org.telegram.messenger.p10.s0;
        this.b = i7;
        this.d = z9;
        f10Var.d(i0.a.o(videoSize.background_colors.get(0).intValue(), org.telegram.messenger.qs.e4), videoSize.background_colors.size() > 1 ? i0.a.o(videoSize.background_colors.get(1).intValue(), org.telegram.messenger.qs.e4) : 0, videoSize.background_colors.size() > 2 ? i0.a.o(videoSize.background_colors.get(2).intValue(), org.telegram.messenger.qs.e4) : 0, videoSize.background_colors.size() > 3 ? i0.a.o(videoSize.background_colors.get(3).intValue(), org.telegram.messenger.qs.e4) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            i5 i5Var = new i5((i7 == 1 && z9) ? 7 : i7 == 2 ? 15 : 8, org.telegram.messenger.p10.s0, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id);
            this.h = i5Var;
            i5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            return;
        }
        if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.x = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            d51 d51Var = new d51(this);
            this.n = d51Var;
            d51Var.J0 = true;
            if (i7 == 1) {
                d51Var.X(2);
            }
            d();
        }
    }

    @Override // org.telegram.ui.Components.r6
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            i5 i5Var = this.h;
            if (i5Var != null) {
                i5Var.o(this);
            }
            d51 d51Var = this.n;
            if (d51Var != null) {
                d51Var.R();
            }
            ImageReceiver imageReceiver2 = this.r;
            if (imageReceiver2 != null) {
                imageReceiver2.R();
            }
        }
        if (this.x != null) {
            org.telegram.messenger.qs.f(this.s).n(this, org.telegram.messenger.qs.B0);
        }
    }

    @Override // org.telegram.ui.Components.r6
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.c = imageReceiver.W0[0];
        HashSet hashSet = this.f;
        if (hashSet.isEmpty()) {
            i5 i5Var = this.h;
            if (i5Var != null) {
                i5Var.b(this);
            }
            d51 d51Var = this.n;
            if (d51Var != null) {
                d51Var.P();
            }
            ImageReceiver imageReceiver2 = this.r;
            if (imageReceiver2 != null) {
                imageReceiver2.P();
            }
        }
        hashSet.add(imageReceiver);
        if (this.x != null) {
            org.telegram.messenger.qs.f(this.s).c(this, org.telegram.messenger.qs.B0);
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
            for (int i7 = 0; i7 < m0.documents.size(); i7++) {
                if (m0.documents.get(i7).id == tL_videoSizeStickerMarkup.sticker_id) {
                    TLRPC.Document document2 = m0.documents.get(i7);
                    boolean z9 = this.d;
                    int i10 = this.b;
                    if (z9 && i10 == 1) {
                        str3 = "50_50";
                    } else {
                        if (i10 != 2) {
                            document = null;
                            str = null;
                            str2 = "50_50_firstframe";
                            this.n.u0(org.telegram.messenger.hc.b(document2), str2, org.telegram.messenger.hc.b(document), str, null, null, org.telegram.messenger.t5.f(document2, org.telegram.ui.ActionBar.l6.m6, 0.2f, null), 0L, "tgs", document2, 0);
                            if (i10 != 3) {
                                this.r.r0(org.telegram.messenger.hc.b(document2), "100_100", null, null, null, 0L, "tgs", document2, 0);
                                return;
                            }
                            return;
                        }
                        str3 = "100_100";
                    }
                    str2 = str3;
                    str = "50_50_firstframe";
                    document = document2;
                    this.n.u0(org.telegram.messenger.hc.b(document2), str2, org.telegram.messenger.hc.b(document), str, null, null, org.telegram.messenger.t5.f(document2, org.telegram.ui.ActionBar.l6.m6, 0.2f, null), 0L, "tgs", document2, 0);
                    if (i10 != 3) {
                    }
                }
            }
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.qs.B0 || this.w) {
            return;
        }
        d();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f10 = getBounds().left;
        float f11 = getBounds().top;
        float f12 = getBounds().right;
        float f13 = getBounds().bottom;
        f10 f10Var = this.a;
        f10Var.b(f10, f11, f12, f13);
        Paint paint = f10Var.c;
        if (this.e != null) {
            this.c = r1.W0[0];
        }
        float f14 = this.c;
        if (f14 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(f10Var.h, f14, f14, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        i5 i5Var = this.h;
        if (i5Var != null) {
            di.z2 z2Var = i5Var.k;
            if (z2Var != null) {
                z2Var.J0((int) (width * 2 * 0.13f));
            }
            i5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            i5Var.draw(canvas);
        }
        d51 d51Var = this.n;
        if (d51Var != null) {
            float f15 = width * 2;
            d51Var.J0((int) (0.13f * f15));
            d51Var.y0(centerX - width, centerY - width, f15, f15);
            d51Var.h(canvas, null);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj == null || e51.class != obj.getClass()) {
            return false;
        }
        e51 e51Var = (e51) obj;
        i5 i5Var = e51Var.h;
        if (this.b != e51Var.b) {
            return false;
        }
        f10 f10Var = this.a;
        int i7 = f10Var.d;
        f10 f10Var2 = e51Var.a;
        if (i7 != f10Var2.d || f10Var.e != f10Var2.e || f10Var.f != f10Var2.f || f10Var.g != f10Var2.g) {
            return false;
        }
        i5 i5Var2 = this.h;
        if (i5Var2 != null && i5Var != null) {
            return i5Var2.h() == i5Var.h();
        }
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.x;
        return tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = e51Var.x) != null && tL_videoSizeStickerMarkup2.stickerset.id == tL_videoSizeStickerMarkup.stickerset.id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // org.telegram.ui.Components.o5
    public final void invalidate() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.a.c.setAlpha(i7);
        i5 i5Var = this.h;
        if (i5Var != null) {
            i5Var.setAlpha(i7);
        }
    }

    @Override // org.telegram.ui.Components.r6
    public final /* synthetic */ void a(dh0 dh0Var) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
