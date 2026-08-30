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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ao extends Drawable {
    public final boolean a;
    public View b;
    public int c = 255;
    public final float d;
    public final nh.y2 e;
    public final org.telegram.ui.Components.dc0 f;
    public final TLRPC.WallPaper g;
    public boolean h;
    public boolean i;
    public final ArrayList j;

    public ao(TLRPC.WallPaper wallPaper, boolean z4, boolean z10) {
        TLRPC.WallPaperSettings wallPaperSettings;
        String m9;
        TLRPC.WallPaperSettings wallPaperSettings2;
        nh.y2 y2Var = new nh.y2(this, 2);
        this.e = y2Var;
        this.j = new ArrayList();
        y2Var.setInvalidateAll(true);
        boolean z11 = wallPaper.pattern;
        this.g = wallPaper;
        this.a = z4;
        if (z4 && ((wallPaper.document != null || wallPaper.uploadingImage != null) && !z11 && (wallPaperSettings2 = wallPaper.settings) != null)) {
            this.d = wallPaperSettings2.intensity / 100.0f;
        }
        if ((z11 || wallPaper.document == null) && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.second_background_color != 0 && wallPaperSettings.third_background_color != 0) {
            org.telegram.ui.Components.dc0 dc0Var = new org.telegram.ui.Components.dc0();
            this.f = dc0Var;
            TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper.settings;
            dc0Var.n(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            int i10 = UserConfig.selectedAccount;
            long j10 = wallPaper.id;
            kh.a1 a1Var = new kh.a1(26, this, wallPaper);
            int[] iArr = org.telegram.ui.ActionBar.e4.h;
            boolean z12 = wallPaper.pattern;
            ChatThemeController.getInstance(i10).loadWallpaperBitmap(j10, z12 ? 1 : 0, new org.telegram.ui.ActionBar.b4(a1Var, wallPaper, z12 ? 1 : 0, i10, j10));
            return;
        }
        Point point = AndroidUtilities.displaySize;
        int min = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int max = Math.max(point2.x, point2.y);
        if (z10) {
            m9 = "150_150_wallpaper";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append((int) (min / AndroidUtilities.density));
            sb.append("_");
            m9 = android.support.v4.media.a.m((int) (max / AndroidUtilities.density), "_wallpaper", sb);
        }
        StringBuilder l10 = e2.c.l(m9);
        l10.append(wallPaper.id);
        StringBuilder l11 = e2.c.l(l10.toString());
        l11.append(e(wallPaper.settings));
        String sb2 = l11.toString();
        Drawable b10 = b(wallPaper);
        String str = wallPaper.uploadingImage;
        if (str != null) {
            y2Var.setImage(ImageLocation.getForPath(str), sb2, b10, null, wallPaper, 1);
            return;
        }
        TLRPC.Document document = wallPaper.document;
        if (document != null) {
            y2Var.setImage(ImageLocation.getForDocument(document), sb2, b10, null, wallPaper, 1);
        } else {
            y2Var.setImageBitmap(b10);
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
        BitmapDrawable a2;
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
            a2 = null;
            while (r2 < wallPaper.document.thumbs.size()) {
                if (wallPaper.document.thumbs.get(r2) instanceof TLRPC.TL_photoStrippedSize) {
                    a2 = new BitmapDrawable(ImageLoader.getStrippedPhotoBitmap(wallPaper.document.thumbs.get(r2).bytes, "b"));
                }
                r2++;
            }
        } else {
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            if (wallPaperSettings == null || wallPaperSettings.intensity < 0) {
                a2 = a(new ColorDrawable(-16777216));
            } else if (wallPaperSettings.second_background_color == 0) {
                a2 = a(new ColorDrawable(i0.a.k(wallPaper.settings.background_color, 255)));
            } else if (wallPaperSettings.third_background_color == 0) {
                a2 = a(new GradientDrawable(org.telegram.ui.Components.o9.d(wallPaper.settings.rotation), new int[]{i0.a.k(wallPaperSettings.background_color, 255), i0.a.k(wallPaper.settings.second_background_color, 255)}));
            } else {
                int k10 = i0.a.k(wallPaperSettings.background_color, 255);
                int k11 = i0.a.k(wallPaper.settings.second_background_color, 255);
                int k12 = i0.a.k(wallPaper.settings.third_background_color, 255);
                int i10 = wallPaper.settings.fourth_background_color;
                r2 = i10 != 0 ? i0.a.k(i10, 255) : 0;
                org.telegram.ui.Components.dc0 dc0Var = new org.telegram.ui.Components.dc0();
                dc0Var.n(k10, k11, k12, r2);
                a2 = new BitmapDrawable(dc0Var.k);
            }
        }
        wallPaper.thumbDrawable = a2;
        return a2;
    }

    public static ao d(Drawable drawable, TLRPC.WallPaper wallPaper, boolean z4) {
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaperSettings wallPaperSettings2;
        if (drawable instanceof ao) {
            ao aoVar = (ao) drawable;
            boolean z10 = aoVar.a;
            TLRPC.WallPaper wallPaper2 = aoVar.g;
            String str = wallPaper.uploadingImage;
            if (str == null ? !(wallPaper.id != wallPaper2.id || !TextUtils.equals(e(wallPaper.settings), e(wallPaper2.settings)) || (wallPaper.document != null && !wallPaper.pattern && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.intensity > 0 && z10 != z4)) : !(!str.equals(wallPaper2.uploadingImage) || ((wallPaperSettings2 = wallPaper.settings) != null && wallPaper2.settings != null && wallPaperSettings2.intensity > 0 && z10 != z4))) {
                return aoVar;
            }
        }
        return new ao(wallPaper, z4, false);
    }

    public static String e(TLRPC.WallPaperSettings wallPaperSettings) {
        return wallPaperSettings == null ? "" : String.valueOf(Objects.hash(Boolean.valueOf(wallPaperSettings.blur), Boolean.valueOf(wallPaperSettings.motion), Integer.valueOf(wallPaperSettings.intensity), Integer.valueOf(wallPaperSettings.background_color), Integer.valueOf(wallPaperSettings.second_background_color), Integer.valueOf(wallPaperSettings.third_background_color), Integer.valueOf(wallPaperSettings.fourth_background_color)));
    }

    public final Drawable c(boolean z4) {
        org.telegram.ui.Components.dc0 dc0Var = this.f;
        if (dc0Var != null) {
            return dc0Var;
        }
        nh.y2 y2Var = this.e;
        return (!z4 || y2Var.getStaticThumb() == null) ? y2Var.getThumb() != null ? y2Var.getThumb() : y2Var.getDrawable() != null ? y2Var.getDrawable() : y2Var.getStaticThumb() : y2Var.getStaticThumb();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        org.telegram.ui.Components.dc0 dc0Var = this.f;
        if (dc0Var != null) {
            dc0Var.setBounds(getBounds());
            dc0Var.setAlpha(this.c);
            dc0Var.draw(canvas);
            return;
        }
        nh.y2 y2Var = this.e;
        boolean hasImageLoaded = y2Var.hasImageLoaded();
        float f10 = this.d;
        boolean z4 = true;
        if (hasImageLoaded && y2Var.getCurrentAlpha() == 1.0f) {
            if (!this.h) {
                this.h = true;
                y2Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(-16777216, (int) (f10 * 255.0f)), PorterDuff.Mode.DARKEN));
            }
            z4 = false;
        }
        y2Var.setImageCoords(getBounds());
        y2Var.setAlpha(this.c / 255.0f);
        y2Var.draw(canvas);
        if (!z4 || f10 == 0.0f) {
            return;
        }
        canvas.drawColor(i0.a.k(-16777216, (int) (f10 * 255.0f)));
    }

    public final void f(View view) {
        ArrayList arrayList = this.j;
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
        int size = arrayList.size();
        nh.y2 y2Var = this.e;
        if (size > 0 && !this.i) {
            this.i = true;
            y2Var.onAttachedToWindow();
        } else if (arrayList.size() <= 0 && this.i) {
            this.i = false;
            y2Var.onDetachedFromWindow();
        }
        org.telegram.ui.Components.dc0 dc0Var = this.f;
        if (dc0Var != null) {
            dc0Var.k();
        }
    }

    public final void g(View view) {
        ArrayList arrayList = this.j;
        if (!arrayList.contains(view)) {
            arrayList.remove(view);
        }
        int size = arrayList.size();
        nh.y2 y2Var = this.e;
        if (size > 0 && !this.i) {
            this.i = true;
            y2Var.onAttachedToWindow();
        } else if (arrayList.size() <= 0 && this.i) {
            this.i = false;
            y2Var.onDetachedFromWindow();
        }
        org.telegram.ui.Components.dc0 dc0Var = this.f;
        if (dc0Var != null) {
            dc0Var.l();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.c != i10) {
            this.c = i10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
