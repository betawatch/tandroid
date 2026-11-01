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
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.e00;
import org.telegram.messenger.jc;
import org.telegram.messenger.jf;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.ke1;
import org.telegram.ui.le1;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ta extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final ag.d2 a;
    public final ImageView b;
    public final CheckBox c;
    public final View d;
    public boolean e;
    public AnimatorSet f;
    public Object h;
    public int n;
    public int r;
    public final /* synthetic */ ua s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta(ua uaVar, Context context) {
        super(context);
        this.s = uaVar;
        setWillNotDraw(false);
        ag.d2 d2Var = new ag.d2(this, context, 3);
        this.a = d2Var;
        addView(d2Var, w7.b6.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.b6.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
        addView(view, w7.b6.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.i7, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.k7, false));
        addView(checkBox, w7.b6.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        int V0;
        int V02;
        ag.d2 d2Var;
        this.h = obj;
        ag.d2 d2Var2 = this.a;
        d2Var2.setVisibility(0);
        this.b.setVisibility(4);
        d2Var2.setBackgroundDrawable(null);
        d2Var2.getImageReceiver().o1 = null;
        d2Var2.getImageReceiver().setAlpha(1.0f);
        d2Var2.getImageReceiver().Z(null);
        d2Var2.getImageReceiver().m0(null);
        this.e = obj == obj2;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(tL_wallPaper.document.thumbs, org.telegram.messenger.i0.L(100), false, null, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(tL_wallPaper.document.thumbs, org.telegram.messenger.i0.L(at.K2), false, null, false);
            TLRPC.PhotoSize photoSize = w10 != w9 ? w10 : null;
            long j10 = photoSize != null ? photoSize.size : tL_wallPaper.document.size;
            if (!tL_wallPaper.pattern) {
                if (photoSize != null) {
                    d2Var2.g(1, j10, tL_wallPaper, "180_180", "100_100_b", "jpg", jc.c(photoSize, tL_wallPaper.document), jc.c(w9, tL_wallPaper.document));
                    return;
                } else {
                    d2Var2.g(1, j10, tL_wallPaper, "180_180", "100_100_b", "jpg", jc.b(tL_wallPaper.document), jc.c(w9, tL_wallPaper.document));
                    return;
                }
            }
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
            if (wallPaperSettings.third_background_color != 0) {
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                jb0 jb0Var = new jb0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                if (tL_wallPaper.settings.intensity >= 0 || !org.telegram.ui.ActionBar.t6.I.q()) {
                    d2Var2.setBackground(jb0Var);
                    if (Build.VERSION.SDK_INT >= 29) {
                        d2Var2.getImageReceiver().Z(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    d2Var2.getImageReceiver().m0(jb0Var.k);
                }
                TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                V02 = jb0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            } else {
                d2Var2.setBackgroundColor(org.telegram.ui.ActionBar.t6.a1(wallPaperSettings.background_color));
                V02 = org.telegram.messenger.i0.V0(tL_wallPaper.settings.background_color, false);
            }
            if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                d2Var2.getImageReceiver().o1 = new PorterDuffColorFilter(org.telegram.messenger.i0.V0(V02, false), PorterDuff.Mode.SRC_IN);
            }
            if (photoSize != null) {
                jc c10 = jc.c(photoSize, tL_wallPaper.document);
                jc c11 = jc.c(w9, tL_wallPaper.document);
                d2Var = d2Var2;
                d2Var.g(1, j10, tL_wallPaper, "180_180", null, "jpg", c10, c11);
            } else {
                jc c12 = jc.c(w9, tL_wallPaper.document);
                d2Var = d2Var2;
                d2Var.g(1, j10, tL_wallPaper, "180_180", null, "jpg", c12, null);
            }
            d2Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            return;
        }
        if (!(obj instanceof ke1)) {
            if (obj instanceof le1) {
                le1 le1Var = (le1) obj;
                File file = le1Var.e;
                if (file != null) {
                    d2Var2.h(file.getAbsolutePath(), "180_180", null);
                    return;
                }
                File file2 = le1Var.d;
                if (file2 != null) {
                    d2Var2.h(file2.getAbsolutePath(), "180_180", null);
                    return;
                } else if ("t".equals(le1Var.a)) {
                    d2Var2.setImageDrawable(org.telegram.ui.ActionBar.t6.Z0(d2Var2, true));
                    return;
                } else {
                    d2Var2.setImageResource(le1Var.c);
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
                d2Var2.h(jfVar.D, "180_180", null);
                return;
            }
            TLRPC.PhotoSize w11 = org.telegram.messenger.b8.w(photo.sizes, org.telegram.messenger.i0.L(100), false, null, false);
            TLRPC.PhotoSize w12 = org.telegram.messenger.b8.w(jfVar.K.sizes, org.telegram.messenger.i0.L(at.K2), false, null, false);
            if (w12 == w11) {
                w12 = null;
            }
            d2Var2.g(1, w12 != null ? w12.size : 0, jfVar, "180_180", "100_100_b", "jpg", jc.i(w12, jfVar.K), jc.i(w11, jfVar.K));
            return;
        }
        ke1 ke1Var = (ke1) obj;
        File file3 = ke1Var.i;
        int i10 = ke1Var.d;
        int i11 = ke1Var.c;
        int i12 = ke1Var.b;
        if (file3 == null && ke1Var.g == null && !"d".equals(ke1Var.a)) {
            d2Var2.setImageBitmap(null);
            if (ke1Var.k) {
                d2Var2.setBackground(new jb0(true, ke1Var.b, ke1Var.c, ke1Var.d, ke1Var.e));
                return;
            } else if (i11 != 0) {
                d2Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i12 | (-16777216), i11 | (-16777216)}));
                return;
            } else {
                d2Var2.setBackgroundColor(i12 | (-16777216));
                return;
            }
        }
        if (i10 != 0) {
            jb0 jb0Var2 = new jb0(true, ke1Var.b, ke1Var.c, ke1Var.d, ke1Var.e);
            if (ke1Var.h >= 0.0f) {
                d2Var2.setBackground(new jb0(true, ke1Var.b, ke1Var.c, ke1Var.d, ke1Var.e));
                if (Build.VERSION.SDK_INT >= 29) {
                    d2Var2.getImageReceiver().Z(BlendMode.SOFT_LIGHT);
                }
            } else {
                d2Var2.getImageReceiver().m0(jb0Var2.k);
            }
            V0 = jb0.g(i12, i11, i10, ke1Var.e);
        } else {
            V0 = org.telegram.messenger.i0.V0(i12, false);
        }
        int i13 = V0;
        if ("d".equals(ke1Var.a)) {
            if (ke1Var.m == null) {
                ke1Var.m = e00.d(R.raw.default_pattern, 100, at.K2, -16777216);
            }
            d2Var2.setImageBitmap(ke1Var.m);
            d2Var2.getImageReceiver().setAlpha(Math.abs(ke1Var.h));
            return;
        }
        if (file3 != null) {
            d2Var2.h(file3.getAbsolutePath(), "180_180", null);
            return;
        }
        TLRPC.PhotoSize w13 = org.telegram.messenger.b8.w(ke1Var.g.document.thumbs, 100, false, null, false);
        d2Var2.g(1, w13 != null ? w13.size : ke1Var.g.document.size, ke1Var.g, "180_180", null, "jpg", jc.c(w13, ke1Var.g.document), null);
        d2Var2.getImageReceiver().setAlpha(Math.abs(ke1Var.h));
        if (Build.VERSION.SDK_INT < 29 || i10 == 0) {
            d2Var2.getImageReceiver().o1 = new PorterDuffColorFilter(org.telegram.messenger.i0.V0(i13, false), PorterDuff.Mode.SRC_IN);
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
        ua uaVar = this.s;
        if (!uaVar.b || !this.c.y) {
            ag.d2 d2Var = this.a;
            if (d2Var.getImageReceiver().I() && d2Var.getImageReceiver().h1 == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), uaVar.s);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.i7, false);
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.k7, false);
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
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
