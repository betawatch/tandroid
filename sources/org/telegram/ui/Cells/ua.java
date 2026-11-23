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
import org.telegram.messenger.gc;
import org.telegram.messenger.jf;
import org.telegram.messenger.ls;
import org.telegram.messenger.nz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.rc1;
import org.telegram.ui.sc1;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ua extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final fi.t3 a;
    public final ImageView b;
    public final CheckBox c;
    public final View d;
    public boolean e;
    public AnimatorSet f;
    public Object h;
    public int n;
    public int r;
    public final /* synthetic */ va s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(va vaVar, Context context) {
        super(context);
        this.s = vaVar;
        setWillNotDraw(false);
        fi.t3 t3Var = new fi.t3(4, context, this);
        this.a = t3Var;
        addView(t3Var, c8.ma.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ma.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.N0(false));
        addView(view, c8.ma.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.i7, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.k7, false));
        addView(checkBox, c8.ma.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
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
        t3Var2.getImageReceiver().Z(null);
        t3Var2.getImageReceiver().m0(null);
        this.e = obj == obj2;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(tL_wallPaper.document.thumbs, org.telegram.messenger.g0.L(100), false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(tL_wallPaper.document.thumbs, org.telegram.messenger.g0.L(ls.K2), false, null, false);
            TLRPC.PhotoSize photoSize = w11 != w10 ? w11 : null;
            long j3 = photoSize != null ? photoSize.size : tL_wallPaper.document.size;
            if (!tL_wallPaper.pattern) {
                if (photoSize != null) {
                    t3Var2.g(1, j3, tL_wallPaper, "180_180", "100_100_b", "jpg", gc.c(photoSize, tL_wallPaper.document), gc.c(w10, tL_wallPaper.document));
                    return;
                } else {
                    t3Var2.g(1, j3, tL_wallPaper, "180_180", "100_100_b", "jpg", gc.b(tL_wallPaper.document), gc.c(w10, tL_wallPaper.document));
                    return;
                }
            }
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
            if (wallPaperSettings.third_background_color != 0) {
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                cb0 cb0Var = new cb0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                if (tL_wallPaper.settings.intensity >= 0 || !org.telegram.ui.ActionBar.m6.I.q()) {
                    t3Var2.setBackground(cb0Var);
                    if (Build.VERSION.SDK_INT >= 29) {
                        t3Var2.getImageReceiver().Z(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    t3Var2.getImageReceiver().m0(cb0Var.k);
                }
                TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                V02 = cb0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            } else {
                t3Var2.setBackgroundColor(org.telegram.ui.ActionBar.m6.a1(wallPaperSettings.background_color));
                V02 = org.telegram.messenger.g0.V0(tL_wallPaper.settings.background_color, false);
            }
            if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                t3Var2.getImageReceiver().p1 = new PorterDuffColorFilter(org.telegram.messenger.g0.V0(V02, false), PorterDuff.Mode.SRC_IN);
            }
            if (photoSize != null) {
                gc c10 = gc.c(photoSize, tL_wallPaper.document);
                gc c11 = gc.c(w10, tL_wallPaper.document);
                t3Var = t3Var2;
                t3Var.g(1, j3, tL_wallPaper, "180_180", null, "jpg", c10, c11);
            } else {
                gc c12 = gc.c(w10, tL_wallPaper.document);
                t3Var = t3Var2;
                t3Var.g(1, j3, tL_wallPaper, "180_180", null, "jpg", c12, null);
            }
            t3Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            return;
        }
        if (!(obj instanceof rc1)) {
            if (obj instanceof sc1) {
                sc1 sc1Var = (sc1) obj;
                File file = sc1Var.e;
                if (file != null) {
                    t3Var2.h(file.getAbsolutePath(), "180_180", null);
                    return;
                }
                File file2 = sc1Var.d;
                if (file2 != null) {
                    t3Var2.h(file2.getAbsolutePath(), "180_180", null);
                    return;
                } else if ("t".equals(sc1Var.a)) {
                    t3Var2.setImageDrawable(org.telegram.ui.ActionBar.m6.Z0(t3Var2, true));
                    return;
                } else {
                    t3Var2.setImageResource(sc1Var.c);
                    return;
                }
            }
            if (!(obj instanceof jf)) {
                this.e = false;
                return;
            }
            jf jfVar = (jf) obj;
            TLRPC.Photo photo = jfVar.K;
            if (photo == null) {
                t3Var2.h(jfVar.D, "180_180", null);
                return;
            }
            TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(100), false, null, false);
            TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(jfVar.K.sizes, org.telegram.messenger.g0.L(ls.K2), false, null, false);
            if (w13 == w12) {
                w13 = null;
            }
            t3Var2.g(1, w13 != null ? w13.size : 0, jfVar, "180_180", "100_100_b", "jpg", gc.i(w13, jfVar.K), gc.i(w12, jfVar.K));
            return;
        }
        rc1 rc1Var = (rc1) obj;
        File file3 = rc1Var.i;
        int i7 = rc1Var.d;
        int i10 = rc1Var.c;
        int i11 = rc1Var.b;
        if (file3 == null && rc1Var.g == null && !"d".equals(rc1Var.a)) {
            t3Var2.setImageBitmap(null);
            if (rc1Var.k) {
                t3Var2.setBackground(new cb0(true, rc1Var.b, rc1Var.c, rc1Var.d, rc1Var.e));
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
            cb0 cb0Var2 = new cb0(true, rc1Var.b, rc1Var.c, rc1Var.d, rc1Var.e);
            if (rc1Var.h >= 0.0f) {
                t3Var2.setBackground(new cb0(true, rc1Var.b, rc1Var.c, rc1Var.d, rc1Var.e));
                if (Build.VERSION.SDK_INT >= 29) {
                    t3Var2.getImageReceiver().Z(BlendMode.SOFT_LIGHT);
                }
            } else {
                t3Var2.getImageReceiver().m0(cb0Var2.k);
            }
            V0 = cb0.g(i11, i10, i7, rc1Var.e);
        } else {
            V0 = org.telegram.messenger.g0.V0(i11, false);
        }
        int i12 = V0;
        if ("d".equals(rc1Var.a)) {
            if (rc1Var.m == null) {
                rc1Var.m = nz.d(R.raw.default_pattern, 100, ls.K2, -16777216);
            }
            t3Var2.setImageBitmap(rc1Var.m);
            t3Var2.getImageReceiver().setAlpha(Math.abs(rc1Var.h));
            return;
        }
        if (file3 != null) {
            t3Var2.h(file3.getAbsolutePath(), "180_180", null);
            return;
        }
        TLRPC.PhotoSize w14 = org.telegram.messenger.w7.w(rc1Var.g.document.thumbs, 100, false, null, false);
        t3Var2.g(1, w14 != null ? w14.size : rc1Var.g.document.size, rc1Var.g, "180_180", null, "jpg", gc.c(w14, rc1Var.g.document), null);
        t3Var2.getImageReceiver().setAlpha(Math.abs(rc1Var.h));
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
        va vaVar = this.s;
        if (!vaVar.b || !this.c.y) {
            fi.t3 t3Var = this.a;
            if (t3Var.getImageReceiver().I() && t3Var.getImageReceiver().i1 == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), vaVar.s);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.i7, false);
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.k7, false);
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

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
