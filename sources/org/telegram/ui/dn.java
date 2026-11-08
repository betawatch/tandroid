package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class dn extends Drawable {
    public final boolean a;
    public View b;
    public int c = org.telegram.messenger.qs.e4;
    public final float d;
    public final di.z2 e;
    public final org.telegram.ui.Components.qa0 f;
    public final TLRPC.WallPaper g;
    public boolean h;
    public boolean i;
    public final ArrayList j;

    public dn(TLRPC.WallPaper wallPaper, boolean z9, boolean z10) {
        TLRPC.WallPaperSettings wallPaperSettings;
        String n10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        di.z2 z2Var = new di.z2(this, 3);
        this.e = z2Var;
        this.j = new ArrayList();
        z2Var.J0 = true;
        boolean z11 = wallPaper.pattern;
        this.g = wallPaper;
        this.a = z9;
        if (z9 && ((wallPaper.document != null || wallPaper.uploadingImage != null) && !z11 && (wallPaperSettings2 = wallPaper.settings) != null)) {
            this.d = wallPaperSettings2.intensity / 100.0f;
        }
        if ((z11 || wallPaper.document == null) && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.second_background_color != 0 && wallPaperSettings.third_background_color != 0) {
            org.telegram.ui.Components.qa0 qa0Var = new org.telegram.ui.Components.qa0();
            this.f = qa0Var;
            TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper.settings;
            qa0Var.n(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            org.telegram.ui.ActionBar.r3.o(org.telegram.messenger.p10.s0, wallPaper.id, wallPaper, new org.telegram.messenger.voip.k(21, this, wallPaper));
            return;
        }
        Point point = org.telegram.messenger.g0.q;
        int min = Math.min(point.x, point.y);
        int max = Math.max(point.x, point.y);
        if (z10) {
            n10 = "150_150_wallpaper";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / org.telegram.messenger.g0.p));
            sb2.append("_");
            n10 = a8.p0.n((int) (max / org.telegram.messenger.g0.p), "_wallpaper", sb2);
        }
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m(n10);
        m10.append(wallPaper.id);
        StringBuilder m11 = com.google.android.recaptcha.internal.a.m(m10.toString());
        m11.append(e(wallPaper.settings));
        String sb3 = m11.toString();
        Drawable b10 = b(wallPaper);
        String str = wallPaper.uploadingImage;
        if (str != null) {
            z2Var.q0(org.telegram.messenger.hc.g(str), sb3, b10, null, wallPaper, 1);
            return;
        }
        TLRPC.Document document = wallPaper.document;
        if (document != null) {
            z2Var.q0(org.telegram.messenger.hc.b(document), sb3, b10, null, wallPaper, 1);
        } else {
            z2Var.w0(b10);
        }
    }

    public static BitmapDrawable a(Drawable drawable) {
        Bitmap createBitmap = Bitmap.createBitmap(20, 20, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, 20, 20);
        drawable.draw(canvas);
        return new BitmapDrawable(createBitmap);
    }

    public static Drawable b(TLRPC.WallPaper wallPaper) {
        BitmapDrawable a10;
        Drawable drawable = wallPaper.thumbDrawable;
        if (drawable != null) {
            return drawable;
        }
        if (wallPaper.stripedThumb != null) {
            return new BitmapDrawable(wallPaper.stripedThumb);
        }
        if (wallPaper.pattern && wallPaper.settings == null) {
            return new ColorDrawable(-16777216);
        }
        if (wallPaper.document != null) {
            a10 = null;
            while (r2 < wallPaper.document.thumbs.size()) {
                if (wallPaper.document.thumbs.get(r2) instanceof TLRPC.TL_photoStrippedSize) {
                    a10 = new BitmapDrawable(org.telegram.messenger.gc.F("b", wallPaper.document.thumbs.get(r2).bytes));
                }
                r2++;
            }
        } else {
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            if (wallPaperSettings == null || wallPaperSettings.intensity < 0) {
                a10 = a(new ColorDrawable(-16777216));
            } else if (wallPaperSettings.second_background_color == 0) {
                a10 = a(new ColorDrawable(i0.a.o(wallPaper.settings.background_color, org.telegram.messenger.qs.e4)));
            } else if (wallPaperSettings.third_background_color == 0) {
                a10 = a(new GradientDrawable(org.telegram.ui.Components.k9.d(wallPaper.settings.rotation), new int[]{i0.a.o(wallPaperSettings.background_color, org.telegram.messenger.qs.e4), i0.a.o(wallPaper.settings.second_background_color, org.telegram.messenger.qs.e4)}));
            } else {
                int o4 = i0.a.o(wallPaperSettings.background_color, org.telegram.messenger.qs.e4);
                int o10 = i0.a.o(wallPaper.settings.second_background_color, org.telegram.messenger.qs.e4);
                int o11 = i0.a.o(wallPaper.settings.third_background_color, org.telegram.messenger.qs.e4);
                int i7 = wallPaper.settings.fourth_background_color;
                r2 = i7 != 0 ? i0.a.o(i7, org.telegram.messenger.qs.e4) : 0;
                org.telegram.ui.Components.qa0 qa0Var = new org.telegram.ui.Components.qa0();
                qa0Var.n(o4, o10, o11, r2);
                a10 = new BitmapDrawable(qa0Var.k);
            }
        }
        wallPaper.thumbDrawable = a10;
        return a10;
    }

    public static dn d(Drawable drawable, TLRPC.WallPaper wallPaper, boolean z9) {
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaperSettings wallPaperSettings2;
        if (drawable instanceof dn) {
            dn dnVar = (dn) drawable;
            boolean z10 = dnVar.a;
            TLRPC.WallPaper wallPaper2 = dnVar.g;
            String str = wallPaper.uploadingImage;
            if (str == null ? !(wallPaper.id != wallPaper2.id || !TextUtils.equals(e(wallPaper.settings), e(wallPaper2.settings)) || (wallPaper.document != null && !wallPaper.pattern && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.intensity > 0 && z10 != z9)) : !(!str.equals(wallPaper2.uploadingImage) || ((wallPaperSettings2 = wallPaper.settings) != null && wallPaper2.settings != null && wallPaperSettings2.intensity > 0 && z10 != z9))) {
                return dnVar;
            }
        }
        return new dn(wallPaper, z9, false);
    }

    public static String e(TLRPC.WallPaperSettings wallPaperSettings) {
        return wallPaperSettings == null ? "" : String.valueOf(Objects.hash(Boolean.valueOf(wallPaperSettings.blur), Boolean.valueOf(wallPaperSettings.motion), Integer.valueOf(wallPaperSettings.intensity), Integer.valueOf(wallPaperSettings.background_color), Integer.valueOf(wallPaperSettings.second_background_color), Integer.valueOf(wallPaperSettings.third_background_color), Integer.valueOf(wallPaperSettings.fourth_background_color)));
    }

    public final Drawable c(boolean z9) {
        Drawable drawable;
        org.telegram.ui.Components.qa0 qa0Var = this.f;
        if (qa0Var != null) {
            return qa0Var;
        }
        di.z2 z2Var = this.e;
        if (z9 && (drawable = z2Var.m0) != null) {
            return drawable;
        }
        Drawable drawable2 = z2Var.a0;
        return drawable2 != null ? drawable2 : z2Var.t() != null ? z2Var.t() : z2Var.m0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        org.telegram.ui.Components.qa0 qa0Var = this.f;
        if (qa0Var != null) {
            qa0Var.setBounds(getBounds());
            qa0Var.setAlpha(this.c);
            qa0Var.draw(canvas);
            return;
        }
        di.z2 z2Var = this.e;
        boolean J = z2Var.J();
        float f10 = this.d;
        boolean z9 = true;
        if (J && z2Var.h1 == 1.0f) {
            if (!this.h) {
                this.h = true;
                z2Var.o1 = new PorterDuffColorFilter(i0.a.o(-16777216, (int) (f10 * 255.0f)), PorterDuff.Mode.DARKEN);
            }
            z9 = false;
        }
        z2Var.z0(getBounds());
        z2Var.setAlpha(this.c / 255.0f);
        z2Var.h(canvas, null);
        if (!z9 || f10 == 0.0f) {
            return;
        }
        canvas.drawColor(i0.a.o(-16777216, (int) (f10 * 255.0f)));
    }

    public final void f(View view) {
        ArrayList arrayList = this.j;
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
        int size = arrayList.size();
        di.z2 z2Var = this.e;
        if (size > 0 && !this.i) {
            this.i = true;
            z2Var.P();
        } else if (arrayList.size() <= 0 && this.i) {
            this.i = false;
            z2Var.R();
        }
        org.telegram.ui.Components.qa0 qa0Var = this.f;
        if (qa0Var != null) {
            qa0Var.k();
        }
    }

    public final void g(View view) {
        ArrayList arrayList = this.j;
        arrayList.remove(view);
        int size = arrayList.size();
        di.z2 z2Var = this.e;
        if (size > 0 && !this.i) {
            this.i = true;
            z2Var.P();
        } else if (arrayList.size() <= 0 && this.i) {
            this.i = false;
            z2Var.R();
        }
        org.telegram.ui.Components.qa0 qa0Var = this.f;
        if (qa0Var != null) {
            qa0Var.l();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (this.c != i7) {
            this.c = i7;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
