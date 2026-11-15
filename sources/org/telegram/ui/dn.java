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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class dn extends Drawable {
    public final boolean a;
    public View b;
    public int c = org.telegram.messenger.ns.e4;
    public final float d;
    public final fi.u2 e;
    public final org.telegram.ui.Components.ra0 f;
    public final TLRPC.WallPaper g;
    public boolean h;
    public boolean i;
    public final ArrayList j;

    public dn(TLRPC.WallPaper wallPaper, boolean z10, boolean z11) {
        TLRPC.WallPaperSettings wallPaperSettings;
        String n10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        fi.u2 u2Var = new fi.u2(this, 3);
        this.e = u2Var;
        this.j = new ArrayList();
        u2Var.K0 = true;
        boolean z12 = wallPaper.pattern;
        this.g = wallPaper;
        this.a = z10;
        if (z10 && ((wallPaper.document != null || wallPaper.uploadingImage != null) && !z12 && (wallPaperSettings2 = wallPaper.settings) != null)) {
            this.d = wallPaperSettings2.intensity / 100.0f;
        }
        if ((z12 || wallPaper.document == null) && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.second_background_color != 0 && wallPaperSettings.third_background_color != 0) {
            org.telegram.ui.Components.ra0 ra0Var = new org.telegram.ui.Components.ra0();
            this.f = ra0Var;
            TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper.settings;
            ra0Var.n(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            org.telegram.ui.ActionBar.p3.o(org.telegram.messenger.m10.t0, wallPaper.id, wallPaper, new li.v(26, this, wallPaper));
            return;
        }
        Point point = org.telegram.messenger.g0.q;
        int min = Math.min(point.x, point.y);
        int max = Math.max(point.x, point.y);
        if (z11) {
            n10 = "150_150_wallpaper";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / org.telegram.messenger.g0.p));
            sb2.append("_");
            n10 = a8.p0.n((int) (max / org.telegram.messenger.g0.p), "_wallpaper", sb2);
        }
        StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(n10);
        m10.append(wallPaper.id);
        StringBuilder m11 = com.google.android.gms.internal.vision.e2.m(m10.toString());
        m11.append(e(wallPaper.settings));
        String sb3 = m11.toString();
        Drawable b10 = b(wallPaper);
        String str = wallPaper.uploadingImage;
        if (str != null) {
            u2Var.q0(org.telegram.messenger.gc.g(str), sb3, b10, null, wallPaper, 1);
            return;
        }
        TLRPC.Document document = wallPaper.document;
        if (document != null) {
            u2Var.q0(org.telegram.messenger.gc.b(document), sb3, b10, null, wallPaper, 1);
        } else {
            u2Var.w0(b10);
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
                    a10 = new BitmapDrawable(org.telegram.messenger.fc.F("b", wallPaper.document.thumbs.get(r2).bytes));
                }
                r2++;
            }
        } else {
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            if (wallPaperSettings == null || wallPaperSettings.intensity < 0) {
                a10 = a(new ColorDrawable(-16777216));
            } else if (wallPaperSettings.second_background_color == 0) {
                a10 = a(new ColorDrawable(i0.a.o(wallPaper.settings.background_color, org.telegram.messenger.ns.e4)));
            } else if (wallPaperSettings.third_background_color == 0) {
                a10 = a(new GradientDrawable(org.telegram.ui.Components.h9.d(wallPaper.settings.rotation), new int[]{i0.a.o(wallPaperSettings.background_color, org.telegram.messenger.ns.e4), i0.a.o(wallPaper.settings.second_background_color, org.telegram.messenger.ns.e4)}));
            } else {
                int o4 = i0.a.o(wallPaperSettings.background_color, org.telegram.messenger.ns.e4);
                int o10 = i0.a.o(wallPaper.settings.second_background_color, org.telegram.messenger.ns.e4);
                int o11 = i0.a.o(wallPaper.settings.third_background_color, org.telegram.messenger.ns.e4);
                int i7 = wallPaper.settings.fourth_background_color;
                r2 = i7 != 0 ? i0.a.o(i7, org.telegram.messenger.ns.e4) : 0;
                org.telegram.ui.Components.ra0 ra0Var = new org.telegram.ui.Components.ra0();
                ra0Var.n(o4, o10, o11, r2);
                a10 = new BitmapDrawable(ra0Var.k);
            }
        }
        wallPaper.thumbDrawable = a10;
        return a10;
    }

    public static dn d(Drawable drawable, TLRPC.WallPaper wallPaper, boolean z10) {
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaperSettings wallPaperSettings2;
        if (drawable instanceof dn) {
            dn dnVar = (dn) drawable;
            boolean z11 = dnVar.a;
            TLRPC.WallPaper wallPaper2 = dnVar.g;
            String str = wallPaper.uploadingImage;
            if (str == null ? !(wallPaper.id != wallPaper2.id || !TextUtils.equals(e(wallPaper.settings), e(wallPaper2.settings)) || (wallPaper.document != null && !wallPaper.pattern && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.intensity > 0 && z11 != z10)) : !(!str.equals(wallPaper2.uploadingImage) || ((wallPaperSettings2 = wallPaper.settings) != null && wallPaper2.settings != null && wallPaperSettings2.intensity > 0 && z11 != z10))) {
                return dnVar;
            }
        }
        return new dn(wallPaper, z10, false);
    }

    public static String e(TLRPC.WallPaperSettings wallPaperSettings) {
        return wallPaperSettings == null ? "" : String.valueOf(Objects.hash(Boolean.valueOf(wallPaperSettings.blur), Boolean.valueOf(wallPaperSettings.motion), Integer.valueOf(wallPaperSettings.intensity), Integer.valueOf(wallPaperSettings.background_color), Integer.valueOf(wallPaperSettings.second_background_color), Integer.valueOf(wallPaperSettings.third_background_color), Integer.valueOf(wallPaperSettings.fourth_background_color)));
    }

    public final Drawable c(boolean z10) {
        Drawable drawable;
        org.telegram.ui.Components.ra0 ra0Var = this.f;
        if (ra0Var != null) {
            return ra0Var;
        }
        fi.u2 u2Var = this.e;
        if (z10 && (drawable = u2Var.n0) != null) {
            return drawable;
        }
        Drawable drawable2 = u2Var.b0;
        return drawable2 != null ? drawable2 : u2Var.t() != null ? u2Var.t() : u2Var.n0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        org.telegram.ui.Components.ra0 ra0Var = this.f;
        if (ra0Var != null) {
            ra0Var.setBounds(getBounds());
            ra0Var.setAlpha(this.c);
            ra0Var.draw(canvas);
            return;
        }
        fi.u2 u2Var = this.e;
        boolean J = u2Var.J();
        float f10 = this.d;
        boolean z10 = true;
        if (J && u2Var.i1 == 1.0f) {
            if (!this.h) {
                this.h = true;
                u2Var.p1 = new PorterDuffColorFilter(i0.a.o(-16777216, (int) (f10 * 255.0f)), PorterDuff.Mode.DARKEN);
            }
            z10 = false;
        }
        u2Var.z0(getBounds());
        u2Var.setAlpha(this.c / 255.0f);
        u2Var.h(canvas, null);
        if (!z10 || f10 == 0.0f) {
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
        fi.u2 u2Var = this.e;
        if (size > 0 && !this.i) {
            this.i = true;
            u2Var.P();
        } else if (arrayList.size() <= 0 && this.i) {
            this.i = false;
            u2Var.R();
        }
        org.telegram.ui.Components.ra0 ra0Var = this.f;
        if (ra0Var != null) {
            ra0Var.k();
        }
    }

    public final void g(View view) {
        ArrayList arrayList = this.j;
        arrayList.remove(view);
        int size = arrayList.size();
        fi.u2 u2Var = this.e;
        if (size > 0 && !this.i) {
            this.i = true;
            u2Var.P();
        } else if (arrayList.size() <= 0 && this.i) {
            this.i = false;
            u2Var.R();
        }
        org.telegram.ui.Components.ra0 ra0Var = this.f;
        if (ra0Var != null) {
            ra0Var.l();
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
