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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class q51 extends Drawable implements u5, v6, org.telegram.messenger.fs {
    public final p10 a;
    public final int b;
    public float c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f;
    public final o5 h;
    public final p51 n;
    public final ImageReceiver r;
    public final int s;
    public boolean w;
    public final TLRPC.TL_videoSizeStickerMarkup x;

    public q51(TLRPC.VideoSize videoSize, boolean z10, int i7) {
        p10 p10Var = new p10();
        this.a = p10Var;
        this.f = new HashSet();
        this.r = new ImageReceiver(null);
        this.s = org.telegram.messenger.j10.t0;
        this.b = i7;
        this.d = z10;
        p10Var.d(i0.a.o(videoSize.background_colors.get(0).intValue(), org.telegram.messenger.ks.e4), videoSize.background_colors.size() > 1 ? i0.a.o(videoSize.background_colors.get(1).intValue(), org.telegram.messenger.ks.e4) : 0, videoSize.background_colors.size() > 2 ? i0.a.o(videoSize.background_colors.get(2).intValue(), org.telegram.messenger.ks.e4) : 0, videoSize.background_colors.size() > 3 ? i0.a.o(videoSize.background_colors.get(3).intValue(), org.telegram.messenger.ks.e4) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            o5 o5Var = new o5((i7 == 1 && z10) ? 7 : i7 == 2 ? 15 : 8, org.telegram.messenger.j10.t0, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id);
            this.h = o5Var;
            o5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            return;
        }
        if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.x = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            p51 p51Var = new p51(this);
            this.n = p51Var;
            p51Var.K0 = true;
            if (i7 == 1) {
                p51Var.X(2);
            }
            d();
        }
    }

    @Override // org.telegram.ui.Components.v6
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            o5 o5Var = this.h;
            if (o5Var != null) {
                o5Var.o(this);
            }
            p51 p51Var = this.n;
            if (p51Var != null) {
                p51Var.R();
            }
            ImageReceiver imageReceiver2 = this.r;
            if (imageReceiver2 != null) {
                imageReceiver2.R();
            }
        }
        if (this.x != null) {
            org.telegram.messenger.ks.f(this.s).n(this, org.telegram.messenger.ks.B0);
        }
    }

    @Override // org.telegram.ui.Components.v6
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.c = imageReceiver.X0[0];
        HashSet hashSet = this.f;
        if (hashSet.isEmpty()) {
            o5 o5Var = this.h;
            if (o5Var != null) {
                o5Var.b(this);
            }
            p51 p51Var = this.n;
            if (p51Var != null) {
                p51Var.P();
            }
            ImageReceiver imageReceiver2 = this.r;
            if (imageReceiver2 != null) {
                imageReceiver2.P();
            }
        }
        hashSet.add(imageReceiver);
        if (this.x != null) {
            org.telegram.messenger.ks.f(this.s).c(this, org.telegram.messenger.ks.B0);
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
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(this.s);
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = this.x;
        TLRPC.TL_messages_stickerSet o02 = d02.o0(tL_videoSizeStickerMarkup.stickerset, false);
        if (o02 != null) {
            this.w = true;
            for (int i7 = 0; i7 < o02.documents.size(); i7++) {
                if (o02.documents.get(i7).id == tL_videoSizeStickerMarkup.sticker_id) {
                    TLRPC.Document document2 = o02.documents.get(i7);
                    boolean z10 = this.d;
                    int i10 = this.b;
                    if (z10 && i10 == 1) {
                        str3 = "50_50";
                    } else {
                        if (i10 != 2) {
                            document = null;
                            str = null;
                            str2 = "50_50_firstframe";
                            this.n.u0(org.telegram.messenger.fc.b(document2), str2, org.telegram.messenger.fc.b(document), str, null, null, org.telegram.messenger.u5.f(document2, org.telegram.ui.ActionBar.n6.m6, 0.2f, null), 0L, "tgs", document2, 0);
                            if (i10 != 3) {
                                this.r.r0(org.telegram.messenger.fc.b(document2), "100_100", null, null, null, 0L, "tgs", document2, 0);
                                return;
                            }
                            return;
                        }
                        str3 = "100_100";
                    }
                    str2 = str3;
                    str = "50_50_firstframe";
                    document = document2;
                    this.n.u0(org.telegram.messenger.fc.b(document2), str2, org.telegram.messenger.fc.b(document), str, null, null, org.telegram.messenger.u5.f(document2, org.telegram.ui.ActionBar.n6.m6, 0.2f, null), 0L, "tgs", document2, 0);
                    if (i10 != 3) {
                    }
                }
            }
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.ks.B0 || this.w) {
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
        p10 p10Var = this.a;
        p10Var.b(f10, f11, f12, f13);
        Paint paint = p10Var.c;
        if (this.e != null) {
            this.c = r1.X0[0];
        }
        float f14 = this.c;
        if (f14 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(p10Var.h, f14, f14, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        o5 o5Var = this.h;
        if (o5Var != null) {
            fi.s2 s2Var = o5Var.k;
            if (s2Var != null) {
                s2Var.J0((int) (width * 2 * 0.13f));
            }
            o5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            o5Var.draw(canvas);
        }
        p51 p51Var = this.n;
        if (p51Var != null) {
            float f15 = width * 2;
            p51Var.J0((int) (0.13f * f15));
            p51Var.y0(centerX - width, centerY - width, f15, f15);
            p51Var.h(canvas, null);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj == null || q51.class != obj.getClass()) {
            return false;
        }
        q51 q51Var = (q51) obj;
        o5 o5Var = q51Var.h;
        if (this.b != q51Var.b) {
            return false;
        }
        p10 p10Var = this.a;
        int i7 = p10Var.d;
        p10 p10Var2 = q51Var.a;
        if (i7 != p10Var2.d || p10Var.e != p10Var2.e || p10Var.f != p10Var2.f || p10Var.g != p10Var2.g) {
            return false;
        }
        o5 o5Var2 = this.h;
        if (o5Var2 != null && o5Var != null) {
            return o5Var2.h() == o5Var.h();
        }
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.x;
        return tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = q51Var.x) != null && tL_videoSizeStickerMarkup2.stickerset.id == tL_videoSizeStickerMarkup.stickerset.id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // org.telegram.ui.Components.u5
    public final void invalidate() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.a.c.setAlpha(i7);
        o5 o5Var = this.h;
        if (o5Var != null) {
            o5Var.setAlpha(i7);
        }
    }

    @Override // org.telegram.ui.Components.v6
    public final /* synthetic */ void a(ph0 ph0Var) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
