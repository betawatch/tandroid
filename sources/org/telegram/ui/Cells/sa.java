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
import org.telegram.messenger.ns;
import org.telegram.messenger.qz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.oc1;
import org.telegram.ui.pc1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class sa extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final fi.v3 a;
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
        fi.v3 v3Var = new fi.v3(4, context, this);
        this.a = v3Var;
        addView(v3Var, c8.ja.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ja.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
        addView(view, c8.ja.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.i7, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.k7, false));
        addView(checkBox, c8.ja.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        int V0;
        int V02;
        fi.v3 v3Var;
        this.h = obj;
        fi.v3 v3Var2 = this.a;
        v3Var2.setVisibility(0);
        this.b.setVisibility(4);
        v3Var2.setBackgroundDrawable(null);
        v3Var2.getImageReceiver().p1 = null;
        v3Var2.getImageReceiver().setAlpha(1.0f);
        v3Var2.getImageReceiver().Z(null);
        v3Var2.getImageReceiver().m0(null);
        this.e = obj == obj2;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(tL_wallPaper.document.thumbs, org.telegram.messenger.g0.L(100), false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(tL_wallPaper.document.thumbs, org.telegram.messenger.g0.L(ns.K2), false, null, false);
            TLRPC.PhotoSize photoSize = w11 != w10 ? w11 : null;
            long j3 = photoSize != null ? photoSize.size : tL_wallPaper.document.size;
            if (!tL_wallPaper.pattern) {
                if (photoSize != null) {
                    v3Var2.g(1, j3, tL_wallPaper, "180_180", "100_100_b", "jpg", gc.c(photoSize, tL_wallPaper.document), gc.c(w10, tL_wallPaper.document));
                    return;
                } else {
                    v3Var2.g(1, j3, tL_wallPaper, "180_180", "100_100_b", "jpg", gc.b(tL_wallPaper.document), gc.c(w10, tL_wallPaper.document));
                    return;
                }
            }
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
            if (wallPaperSettings.third_background_color != 0) {
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                ra0 ra0Var = new ra0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                if (tL_wallPaper.settings.intensity >= 0 || !org.telegram.ui.ActionBar.j6.I.q()) {
                    v3Var2.setBackground(ra0Var);
                    if (Build.VERSION.SDK_INT >= 29) {
                        v3Var2.getImageReceiver().Z(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    v3Var2.getImageReceiver().m0(ra0Var.k);
                }
                TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                V02 = ra0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            } else {
                v3Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.a1(wallPaperSettings.background_color));
                V02 = org.telegram.messenger.g0.V0(tL_wallPaper.settings.background_color, false);
            }
            if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                v3Var2.getImageReceiver().p1 = new PorterDuffColorFilter(org.telegram.messenger.g0.V0(V02, false), PorterDuff.Mode.SRC_IN);
            }
            if (photoSize != null) {
                gc c10 = gc.c(photoSize, tL_wallPaper.document);
                gc c11 = gc.c(w10, tL_wallPaper.document);
                v3Var = v3Var2;
                v3Var.g(1, j3, tL_wallPaper, "180_180", null, "jpg", c10, c11);
            } else {
                gc c12 = gc.c(w10, tL_wallPaper.document);
                v3Var = v3Var2;
                v3Var.g(1, j3, tL_wallPaper, "180_180", null, "jpg", c12, null);
            }
            v3Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            return;
        }
        if (!(obj instanceof oc1)) {
            if (obj instanceof pc1) {
                pc1 pc1Var = (pc1) obj;
                File file = pc1Var.e;
                if (file != null) {
                    v3Var2.h(file.getAbsolutePath(), "180_180", null);
                    return;
                }
                File file2 = pc1Var.d;
                if (file2 != null) {
                    v3Var2.h(file2.getAbsolutePath(), "180_180", null);
                    return;
                } else if ("t".equals(pc1Var.a)) {
                    v3Var2.setImageDrawable(org.telegram.ui.ActionBar.j6.Z0(v3Var2, true));
                    return;
                } else {
                    v3Var2.setImageResource(pc1Var.c);
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
                v3Var2.h(jfVar.D, "180_180", null);
                return;
            }
            TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(100), false, null, false);
            TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(jfVar.K.sizes, org.telegram.messenger.g0.L(ns.K2), false, null, false);
            if (w13 == w12) {
                w13 = null;
            }
            v3Var2.g(1, w13 != null ? w13.size : 0, jfVar, "180_180", "100_100_b", "jpg", gc.i(w13, jfVar.K), gc.i(w12, jfVar.K));
            return;
        }
        oc1 oc1Var = (oc1) obj;
        File file3 = oc1Var.i;
        int i7 = oc1Var.d;
        int i10 = oc1Var.c;
        int i11 = oc1Var.b;
        if (file3 == null && oc1Var.g == null && !"d".equals(oc1Var.a)) {
            v3Var2.setImageBitmap(null);
            if (oc1Var.k) {
                v3Var2.setBackground(new ra0(true, oc1Var.b, oc1Var.c, oc1Var.d, oc1Var.e));
                return;
            } else if (i10 != 0) {
                v3Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i11 | (-16777216), i10 | (-16777216)}));
                return;
            } else {
                v3Var2.setBackgroundColor(i11 | (-16777216));
                return;
            }
        }
        if (i7 != 0) {
            ra0 ra0Var2 = new ra0(true, oc1Var.b, oc1Var.c, oc1Var.d, oc1Var.e);
            if (oc1Var.h >= 0.0f) {
                v3Var2.setBackground(new ra0(true, oc1Var.b, oc1Var.c, oc1Var.d, oc1Var.e));
                if (Build.VERSION.SDK_INT >= 29) {
                    v3Var2.getImageReceiver().Z(BlendMode.SOFT_LIGHT);
                }
            } else {
                v3Var2.getImageReceiver().m0(ra0Var2.k);
            }
            V0 = ra0.g(i11, i10, i7, oc1Var.e);
        } else {
            V0 = org.telegram.messenger.g0.V0(i11, false);
        }
        int i12 = V0;
        if ("d".equals(oc1Var.a)) {
            if (oc1Var.m == null) {
                oc1Var.m = qz.d(R.raw.default_pattern, 100, ns.K2, -16777216);
            }
            v3Var2.setImageBitmap(oc1Var.m);
            v3Var2.getImageReceiver().setAlpha(Math.abs(oc1Var.h));
            return;
        }
        if (file3 != null) {
            v3Var2.h(file3.getAbsolutePath(), "180_180", null);
            return;
        }
        TLRPC.PhotoSize w14 = org.telegram.messenger.w7.w(oc1Var.g.document.thumbs, 100, false, null, false);
        v3Var2.g(1, w14 != null ? w14.size : oc1Var.g.document.size, oc1Var.g, "180_180", null, "jpg", gc.c(w14, oc1Var.g.document), null);
        v3Var2.getImageReceiver().setAlpha(Math.abs(oc1Var.h));
        if (Build.VERSION.SDK_INT < 29 || i7 == 0) {
            v3Var2.getImageReceiver().p1 = new PorterDuffColorFilter(org.telegram.messenger.g0.V0(i12, false), PorterDuff.Mode.SRC_IN);
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
            fi.v3 v3Var = this.a;
            if (v3Var.getImageReceiver().I() && v3Var.getImageReceiver().i1 == 1.0f) {
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
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.i7, false);
            int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.k7, false);
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
