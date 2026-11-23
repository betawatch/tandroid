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
import java.io.File;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fc;
import org.telegram.messenger.hf;
import org.telegram.messenger.ks;
import org.telegram.messenger.lz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.za0;
import org.telegram.ui.pc1;
import org.telegram.ui.qc1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class va extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final fi.t3 a;
    public final ImageView b;
    public final CheckBox c;
    public final View d;
    public boolean e;
    public AnimatorSet f;
    public Object h;
    public int n;
    public int r;
    public final /* synthetic */ wa s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(wa waVar, Context context) {
        super(context);
        this.s = waVar;
        setWillNotDraw(false);
        fi.t3 t3Var = new fi.t3(4, context, this);
        this.a = t3Var;
        addView(t3Var, c8.na.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.na.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
        addView(view, c8.na.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.i7, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.k7, false));
        addView(checkBox, c8.na.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        int V0;
        int V02;
        fi.t3 t3Var;
        this.h = obj;
        fi.t3 t3Var2 = this.a;
        t3Var2.setVisibility(0);
        this.b.setVisibility(4);
        t3Var2.setBackgroundDrawable(null);
        t3Var2.getImageReceiver().p1 = null;
        t3Var2.getImageReceiver().setAlpha(1.0f);
        t3Var2.getImageReceiver().a0(null);
        t3Var2.getImageReceiver().n0(null);
        this.e = obj == obj2;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(tL_wallPaper.document.thumbs, org.telegram.messenger.g0.L(100), false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(tL_wallPaper.document.thumbs, org.telegram.messenger.g0.L(ks.K2), false, null, false);
            TLRPC.PhotoSize photoSize = w11 != w10 ? w11 : null;
            long j3 = photoSize != null ? photoSize.size : tL_wallPaper.document.size;
            if (!tL_wallPaper.pattern) {
                if (photoSize != null) {
                    t3Var2.g(1, j3, tL_wallPaper, "180_180", "100_100_b", "jpg", fc.c(photoSize, tL_wallPaper.document), fc.c(w10, tL_wallPaper.document));
                    return;
                } else {
                    t3Var2.g(1, j3, tL_wallPaper, "180_180", "100_100_b", "jpg", fc.b(tL_wallPaper.document), fc.c(w10, tL_wallPaper.document));
                    return;
                }
            }
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
            if (wallPaperSettings.third_background_color != 0) {
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                za0 za0Var = new za0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                if (tL_wallPaper.settings.intensity >= 0 || !org.telegram.ui.ActionBar.n6.I.q()) {
                    t3Var2.setBackground(za0Var);
                    if (Build.VERSION.SDK_INT >= 29) {
                        t3Var2.getImageReceiver().a0(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    t3Var2.getImageReceiver().n0(za0Var.k);
                }
                TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                V02 = za0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            } else {
                t3Var2.setBackgroundColor(org.telegram.ui.ActionBar.n6.a1(wallPaperSettings.background_color));
                V02 = org.telegram.messenger.g0.V0(tL_wallPaper.settings.background_color, false);
            }
            if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                t3Var2.getImageReceiver().p1 = new PorterDuffColorFilter(org.telegram.messenger.g0.V0(V02, false), PorterDuff.Mode.SRC_IN);
            }
            if (photoSize != null) {
                fc c10 = fc.c(photoSize, tL_wallPaper.document);
                fc c11 = fc.c(w10, tL_wallPaper.document);
                t3Var = t3Var2;
                t3Var.g(1, j3, tL_wallPaper, "180_180", null, "jpg", c10, c11);
            } else {
                fc c12 = fc.c(w10, tL_wallPaper.document);
                t3Var = t3Var2;
                t3Var.g(1, j3, tL_wallPaper, "180_180", null, "jpg", c12, null);
            }
            t3Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            return;
        }
        if (!(obj instanceof pc1)) {
            if (obj instanceof qc1) {
                qc1 qc1Var = (qc1) obj;
                File file = qc1Var.e;
                if (file != null) {
                    t3Var2.h(file.getAbsolutePath(), "180_180", null);
                    return;
                }
                File file2 = qc1Var.d;
                if (file2 != null) {
                    t3Var2.h(file2.getAbsolutePath(), "180_180", null);
                    return;
                } else if ("t".equals(qc1Var.a)) {
                    t3Var2.setImageDrawable(org.telegram.ui.ActionBar.n6.Z0(t3Var2, true));
                    return;
                } else {
                    t3Var2.setImageResource(qc1Var.c);
                    return;
                }
            }
            if (!(obj instanceof hf)) {
                this.e = false;
                return;
            }
            hf hfVar = (hf) obj;
            TLRPC.Photo photo = hfVar.K;
            if (photo == null) {
                t3Var2.h(hfVar.D, "180_180", null);
                return;
            }
            TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(100), false, null, false);
            TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(hfVar.K.sizes, org.telegram.messenger.g0.L(ks.K2), false, null, false);
            if (w13 == w12) {
                w13 = null;
            }
            t3Var2.g(1, w13 != null ? w13.size : 0, hfVar, "180_180", "100_100_b", "jpg", fc.i(w13, hfVar.K), fc.i(w12, hfVar.K));
            return;
        }
        pc1 pc1Var = (pc1) obj;
        File file3 = pc1Var.i;
        int i7 = pc1Var.d;
        int i10 = pc1Var.c;
        int i11 = pc1Var.b;
        if (file3 == null && pc1Var.g == null && !"d".equals(pc1Var.a)) {
            t3Var2.setImageBitmap(null);
            if (pc1Var.k) {
                t3Var2.setBackground(new za0(true, pc1Var.b, pc1Var.c, pc1Var.d, pc1Var.e));
                return;
            } else if (i10 != 0) {
                t3Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i11 | (-16777216), i10 | (-16777216)}));
                return;
            } else {
                t3Var2.setBackgroundColor(i11 | (-16777216));
                return;
            }
        }
        if (i7 != 0) {
            za0 za0Var2 = new za0(true, pc1Var.b, pc1Var.c, pc1Var.d, pc1Var.e);
            if (pc1Var.h >= 0.0f) {
                t3Var2.setBackground(new za0(true, pc1Var.b, pc1Var.c, pc1Var.d, pc1Var.e));
                if (Build.VERSION.SDK_INT >= 29) {
                    t3Var2.getImageReceiver().a0(BlendMode.SOFT_LIGHT);
                }
            } else {
                t3Var2.getImageReceiver().n0(za0Var2.k);
            }
            V0 = za0.g(i11, i10, i7, pc1Var.e);
        } else {
            V0 = org.telegram.messenger.g0.V0(i11, false);
        }
        int i12 = V0;
        if ("d".equals(pc1Var.a)) {
            if (pc1Var.m == null) {
                pc1Var.m = lz.d(R.raw.default_pattern, 100, ks.K2, -16777216);
            }
            t3Var2.setImageBitmap(pc1Var.m);
            t3Var2.getImageReceiver().setAlpha(Math.abs(pc1Var.h));
            return;
        }
        if (file3 != null) {
            t3Var2.h(file3.getAbsolutePath(), "180_180", null);
            return;
        }
        TLRPC.PhotoSize w14 = org.telegram.messenger.w7.w(pc1Var.g.document.thumbs, 100, false, null, false);
        t3Var2.g(1, w14 != null ? w14.size : pc1Var.g.document.size, pc1Var.g, "180_180", null, "jpg", fc.c(w14, pc1Var.g.document), null);
        t3Var2.getImageReceiver().setAlpha(Math.abs(pc1Var.h));
        if (Build.VERSION.SDK_INT < 29 || i7 == 0) {
            t3Var2.getImageReceiver().p1 = new PorterDuffColorFilter(org.telegram.messenger.g0.V0(i12, false), PorterDuff.Mode.SRC_IN);
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
        wa waVar = this.s;
        if (!waVar.b || !this.c.y) {
            fi.t3 t3Var = this.a;
            if (t3Var.getImageReceiver().J() && t3Var.getImageReceiver().i1 == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), waVar.s);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.i7, false);
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.k7, false);
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

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
