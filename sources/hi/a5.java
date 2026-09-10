package hi;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class a5 {
    public static ColorMatrixColorFilter f;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public Bitmap c;
    public final RadialProgress2 d;
    public v e;

    public a5(x4 x4Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = new ImageReceiver(x4Var);
        this.b = new ImageReceiver(x4Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(x4Var, f6Var);
        this.d = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        radialProgress2.setIcon(3, false, false);
    }

    public final void a() {
        String sb2;
        TLRPC.Photo photo;
        TLRPC.Document document;
        TLRPC.PhotoSize photoSize;
        int abs;
        v vVar = this.e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.a;
        if (vVar == null) {
            imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        int i10 = AndroidUtilities.displaySize.x;
        String k10 = a4.a.k(i10, i10, "_");
        StringBuilder sb3 = new StringBuilder();
        v vVar2 = this.e;
        if (vVar2 == null) {
            sb2 = BuildConfig.BETA_URL;
        } else {
            String str = vVar2.b ? "v" : vVar2.c ? "a" : "p";
            if (vVar2.e != null) {
                StringBuilder g10 = w.f.g(str, ":local:");
                g10.append(this.e.e);
                sb2 = g10.toString();
            } else {
                long j3 = 0;
                if (vVar2.b()) {
                    v vVar3 = this.e;
                    TLRPC.Document document2 = vVar3.h;
                    if (document2 != null) {
                        j3 = document2.id;
                    } else {
                        TLRPC.Photo photo2 = vVar3.g;
                        if (photo2 != null) {
                            j3 = photo2.id;
                        }
                    }
                }
                StringBuilder g11 = w.f.g(str, ":");
                g11.append(this.e.a);
                g11.append(":");
                g11.append(j3);
                sb2 = g11.toString();
            }
        }
        sb3.append(sb2);
        sb3.append("@");
        sb3.append(k10);
        if (sb3.toString().equals(null)) {
            return;
        }
        this.e.getClass();
        v vVar4 = this.e;
        if (!vVar4.b) {
            if (vVar4.e != null) {
                imageReceiver.setOrientation(vVar4.l, vVar4.m, true);
                imageReceiver.setImage(ImageLocation.getForPath(this.e.e), k10, null, null, null, 0);
                return;
            } else {
                if (!vVar4.b() || (photo = this.e.g) == null) {
                    imageReceiver.setImageBitmap((Drawable) null);
                    return;
                }
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.e.g.sizes, 100);
                imageReceiver.setOrientation(0, 0, false);
                imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.e.g), k10, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, this.e.g), k10, null, 0L, null, this.e.g, 0);
                return;
            }
        }
        if (vVar4.e != null) {
            imageReceiver.setOrientation(0, 0, false);
            imageReceiver.setImage(ImageLocation.getForVideoPath(this.e.e), ImageLoader.AUTOPLAY_FILTER, null, k10, null, k10, null, 0L, null, null, 0);
            return;
        }
        if (!vVar4.b() || (document = this.e.h) == null) {
            imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
        int photoSize3 = AndroidUtilities.getPhotoSize();
        if (arrayList == null) {
            photoSize = null;
        } else {
            int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            photoSize = null;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.PhotoSize photoSize4 = arrayList.get(i12);
                if (!(photoSize4 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize4 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize4.w, photoSize4.h) - photoSize3)) < i11) {
                    photoSize = photoSize4;
                    i11 = abs;
                }
            }
        }
        ArrayList<TLRPC.PhotoSize> arrayList2 = this.e.h.thumbs;
        if (arrayList2 != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList2.size()) {
                    break;
                }
                if (arrayList2.get(i13) instanceof TLRPC.TL_photoStrippedSize) {
                    photoSize2 = arrayList2.get(i13);
                    break;
                }
                i13++;
            }
        }
        imageReceiver.setOrientation(0, 0, false);
        imageReceiver.setImage(ImageLocation.getForDocument(this.e.h), ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForDocument(photoSize, this.e.h), k10, ImageLocation.getForDocument(photoSize2, this.e.h), k10, null, 0L, null, this.e.h, 0);
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        if (c() && (bitmap = (imageReceiver = this.a).getBitmap()) != null && !bitmap.isRecycled()) {
            ImageReceiver imageReceiver2 = this.b;
            if ((imageReceiver2.getBitmap() == null || imageReceiver.getAnimation() == null) && (bitmap != this.c || imageReceiver2.getBitmap() == null)) {
                this.c = bitmap;
                imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap, false));
                if (f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                    f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.setColorFilter(f);
            }
            if (imageReceiver2.getBitmap() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        v vVar = this.e;
        if (vVar != null) {
            return vVar.e != null || vVar.b();
        }
        return false;
    }

    public final boolean d() {
        v vVar = this.e;
        if (vVar == null || vVar.b || vVar.b()) {
            return false;
        }
        int i10 = this.e.l;
        return i10 == 90 || i10 == 270;
    }
}
