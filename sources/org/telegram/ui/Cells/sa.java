package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import java.io.File;
import java.util.HashSet;
import org.telegram.messenger.ac;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bf;
import org.telegram.messenger.hs;
import org.telegram.messenger.kz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.la0;
import org.telegram.ui.kc1;
import org.telegram.ui.lc1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sa extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final ei.d4 a;
    public final ImageView b;
    public final CheckBox c;
    public final View d;
    public boolean e;
    public AnimatorSet f;
    public Object h;
    public int n;
    public int r;
    public final /* synthetic */ ta s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(ta taVar, Context context) {
        super(context);
        this.s = taVar;
        setWillNotDraw(false);
        ei.d4 d4Var = new ei.d4(4, context, this);
        this.a = d4Var;
        addView(d4Var, mf.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, mf.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
        addView(view, mf.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.k7, false));
        addView(checkBox, mf.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        int V0;
        int V02;
        ei.d4 d4Var;
        this.h = obj;
        ei.d4 d4Var2 = this.a;
        d4Var2.setVisibility(0);
        this.b.setVisibility(4);
        d4Var2.setBackgroundDrawable(null);
        d4Var2.getImageReceiver().p1 = null;
        d4Var2.getImageReceiver().setAlpha(1.0f);
        d4Var2.getImageReceiver().Z(null);
        d4Var2.getImageReceiver().m0(null);
        this.e = obj == obj2;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(tL_wallPaper.document.thumbs, org.telegram.messenger.g0.L(100), false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(tL_wallPaper.document.thumbs, org.telegram.messenger.g0.L(hs.K2), false, null, false);
            TLRPC.PhotoSize photoSize = w11 != w10 ? w11 : null;
            long j10 = photoSize != null ? photoSize.size : tL_wallPaper.document.size;
            if (!tL_wallPaper.pattern) {
                if (photoSize != null) {
                    d4Var2.g(1, j10, tL_wallPaper, "180_180", "100_100_b", "jpg", ac.c(photoSize, tL_wallPaper.document), ac.c(w10, tL_wallPaper.document));
                    return;
                } else {
                    d4Var2.g(1, j10, tL_wallPaper, "180_180", "100_100_b", "jpg", ac.b(tL_wallPaper.document), ac.c(w10, tL_wallPaper.document));
                    return;
                }
            }
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
            if (wallPaperSettings.third_background_color != 0) {
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                la0 la0Var = new la0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                if (tL_wallPaper.settings.intensity >= 0 || !org.telegram.ui.ActionBar.k6.I.q()) {
                    d4Var2.setBackground(la0Var);
                    if (Build.VERSION.SDK_INT >= 29) {
                        d4Var2.getImageReceiver().Z(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    d4Var2.getImageReceiver().m0(la0Var.k);
                }
                TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                V02 = la0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            } else {
                d4Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.a1(wallPaperSettings.background_color));
                V02 = org.telegram.messenger.g0.V0(tL_wallPaper.settings.background_color, false);
            }
            if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                d4Var2.getImageReceiver().p1 = new PorterDuffColorFilter(org.telegram.messenger.g0.V0(V02, false), PorterDuff.Mode.SRC_IN);
            }
            if (photoSize != null) {
                ac c2 = ac.c(photoSize, tL_wallPaper.document);
                ac c10 = ac.c(w10, tL_wallPaper.document);
                d4Var = d4Var2;
                d4Var.g(1, j10, tL_wallPaper, "180_180", null, "jpg", c2, c10);
            } else {
                ac c11 = ac.c(w10, tL_wallPaper.document);
                d4Var = d4Var2;
                d4Var.g(1, j10, tL_wallPaper, "180_180", null, "jpg", c11, null);
            }
            d4Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            return;
        }
        if (!(obj instanceof kc1)) {
            if (obj instanceof lc1) {
                lc1 lc1Var = (lc1) obj;
                File file = lc1Var.e;
                if (file != null) {
                    d4Var2.h(file.getAbsolutePath(), "180_180", null);
                    return;
                }
                File file2 = lc1Var.d;
                if (file2 != null) {
                    d4Var2.h(file2.getAbsolutePath(), "180_180", null);
                    return;
                } else if ("t".equals(lc1Var.a)) {
                    d4Var2.setImageDrawable(org.telegram.ui.ActionBar.k6.Z0(d4Var2, true));
                    return;
                } else {
                    d4Var2.setImageResource(lc1Var.c);
                    return;
                }
            }
            if (!(obj instanceof bf)) {
                this.e = false;
                return;
            }
            bf bfVar = (bf) obj;
            TLRPC.Photo photo = bfVar.K;
            if (photo == null) {
                d4Var2.h(bfVar.D, "180_180", null);
                return;
            }
            TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(100), false, null, false);
            TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(bfVar.K.sizes, org.telegram.messenger.g0.L(hs.K2), false, null, false);
            if (w13 == w12) {
                w13 = null;
            }
            d4Var2.g(1, w13 != null ? w13.size : 0, bfVar, "180_180", "100_100_b", "jpg", ac.i(w13, bfVar.K), ac.i(w12, bfVar.K));
            return;
        }
        kc1 kc1Var = (kc1) obj;
        File file3 = kc1Var.i;
        int i3 = kc1Var.d;
        int i10 = kc1Var.c;
        int i11 = kc1Var.b;
        if (file3 == null && kc1Var.g == null && !"d".equals(kc1Var.a)) {
            d4Var2.setImageBitmap(null);
            if (kc1Var.k) {
                d4Var2.setBackground(new la0(true, kc1Var.b, kc1Var.c, kc1Var.d, kc1Var.e));
                return;
            } else if (i10 != 0) {
                d4Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i11 | (-16777216), i10 | (-16777216)}));
                return;
            } else {
                d4Var2.setBackgroundColor(i11 | (-16777216));
                return;
            }
        }
        if (i3 != 0) {
            la0 la0Var2 = new la0(true, kc1Var.b, kc1Var.c, kc1Var.d, kc1Var.e);
            if (kc1Var.h >= 0.0f) {
                d4Var2.setBackground(new la0(true, kc1Var.b, kc1Var.c, kc1Var.d, kc1Var.e));
                if (Build.VERSION.SDK_INT >= 29) {
                    d4Var2.getImageReceiver().Z(BlendMode.SOFT_LIGHT);
                }
            } else {
                d4Var2.getImageReceiver().m0(la0Var2.k);
            }
            V0 = la0.g(i11, i10, i3, kc1Var.e);
        } else {
            V0 = org.telegram.messenger.g0.V0(i11, false);
        }
        int i12 = V0;
        if ("d".equals(kc1Var.a)) {
            if (kc1Var.m == null) {
                kc1Var.m = kz.d(R.raw.default_pattern, 100, hs.K2, -16777216);
            }
            d4Var2.setImageBitmap(kc1Var.m);
            d4Var2.getImageReceiver().setAlpha(Math.abs(kc1Var.h));
            return;
        }
        if (file3 != null) {
            d4Var2.h(file3.getAbsolutePath(), "180_180", null);
            return;
        }
        TLRPC.PhotoSize w14 = org.telegram.messenger.w7.w(kc1Var.g.document.thumbs, 100, false, null, false);
        d4Var2.g(1, w14 != null ? w14.size : kc1Var.g.document.size, kc1Var.g, "180_180", null, "jpg", ac.c(w14, kc1Var.g.document), null);
        d4Var2.getImageReceiver().setAlpha(Math.abs(kc1Var.h));
        if (Build.VERSION.SDK_INT < 29 || i3 == 0) {
            d4Var2.getImageReceiver().p1 = new PorterDuffColorFilter(org.telegram.messenger.g0.V0(i12, false), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // android.view.View
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f = null;
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ta taVar = this.s;
        if (!taVar.b || !this.c.y) {
            ei.d4 d4Var = this.a;
            if (d4Var.getImageReceiver().I() && d4Var.getImageReceiver().i1 == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), taVar.s);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i7, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.k7, false);
            CheckBox checkBox = this.c;
            if (checkBox != null) {
                if (x02 == this.n) {
                    if (x03 != this.r) {
                    }
                }
                this.n = x02;
                this.r = x03;
                checkBox.c(x02, x03);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
