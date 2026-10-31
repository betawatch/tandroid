package bi;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.ic;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class i5 {
    public static ColorMatrixColorFilter f;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public Bitmap c;
    public final RadialProgress2 d;
    public w e;

    public i5(f5 f5Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.a = new ImageReceiver(f5Var);
        this.b = new ImageReceiver(f5Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(f5Var, p6Var);
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
        w wVar = this.e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.a;
        if (wVar == null) {
            imageReceiver.w0(null);
            return;
        }
        int i10 = org.telegram.messenger.i0.q.x;
        String i11 = a1.g.i(i10, i10, "_");
        StringBuilder sb3 = new StringBuilder();
        w wVar2 = this.e;
        if (wVar2 == null) {
            sb2 = "null";
        } else {
            String str = wVar2.b ? "v" : wVar2.c ? "a" : "p";
            if (wVar2.e != null) {
                StringBuilder i12 = sc.e.i(str, ":local:");
                i12.append(this.e.e);
                sb2 = i12.toString();
            } else {
                long j10 = 0;
                if (wVar2.b()) {
                    w wVar3 = this.e;
                    TLRPC.Document document2 = wVar3.h;
                    if (document2 != null) {
                        j10 = document2.id;
                    } else {
                        TLRPC.Photo photo2 = wVar3.g;
                        if (photo2 != null) {
                            j10 = photo2.id;
                        }
                    }
                }
                StringBuilder i13 = sc.e.i(str, ":");
                i13.append(this.e.a);
                i13.append(":");
                i13.append(j10);
                sb2 = i13.toString();
            }
        }
        sb3.append(sb2);
        sb3.append("@");
        sb3.append(i11);
        if (sb3.toString().equals(null)) {
            return;
        }
        this.e.getClass();
        w wVar4 = this.e;
        if (!wVar4.b) {
            if (wVar4.e != null) {
                imageReceiver.G0(wVar4.l, wVar4.m, true);
                imageReceiver.q0(ic.g(this.e.e), i11, null, null, null, 0);
                return;
            } else {
                if (!wVar4.b() || (photo = this.e.g) == null) {
                    imageReceiver.w0(null);
                    return;
                }
                TLRPC.PhotoSize w9 = b8.w(photo.sizes, org.telegram.messenger.i0.Z0(false), false, null, false);
                TLRPC.PhotoSize w10 = b8.w(this.e.g.sizes, 100, false, null, false);
                imageReceiver.G0(0, 0, false);
                imageReceiver.r0(ic.i(w9, this.e.g), i11, ic.i(w10, this.e.g), i11, null, 0L, null, this.e.g, 0);
                return;
            }
        }
        if (wVar4.e != null) {
            imageReceiver.G0(0, 0, false);
            imageReceiver.u0(ic.o(this.e.e), "g", null, i11, null, i11, null, 0L, null, null, 0);
            return;
        }
        if (!wVar4.b() || (document = this.e.h) == null) {
            imageReceiver.w0(null);
            return;
        }
        ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
        int Z0 = org.telegram.messenger.i0.Z0(false);
        if (arrayList == null) {
            photoSize = null;
        } else {
            int i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            photoSize = null;
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                TLRPC.PhotoSize photoSize3 = arrayList.get(i15);
                if (!(photoSize3 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize3 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize3.w, photoSize3.h) - Z0)) < i14) {
                    photoSize = photoSize3;
                    i14 = abs;
                }
            }
        }
        ArrayList<TLRPC.PhotoSize> arrayList2 = this.e.h.thumbs;
        if (arrayList2 != null) {
            int i16 = 0;
            while (true) {
                if (i16 >= arrayList2.size()) {
                    break;
                }
                if (arrayList2.get(i16) instanceof TLRPC.TL_photoStrippedSize) {
                    photoSize2 = arrayList2.get(i16);
                    break;
                }
                i16++;
            }
        }
        imageReceiver.G0(0, 0, false);
        imageReceiver.u0(ic.b(this.e.h), "g", ic.c(photoSize, this.e.h), i11, ic.c(photoSize2, this.e.h), i11, null, 0L, null, this.e.h, 0);
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap n10;
        if (c() && (n10 = (imageReceiver = this.a).n()) != null && !n10.isRecycled()) {
            ImageReceiver imageReceiver2 = this.b;
            if ((imageReceiver2.n() == null || imageReceiver.m() == null) && (n10 != this.c || imageReceiver2.n() == null)) {
                this.c = n10;
                imageReceiver2.v0(Utilities.D(n10, false));
                if (f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    org.telegram.messenger.i0.n2(colorMatrix, 0.9f);
                    org.telegram.messenger.i0.i(colorMatrix, 0.6f);
                    f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.o1 = f;
            }
            if (imageReceiver2.n() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        w wVar = this.e;
        if (wVar != null) {
            return wVar.e != null || wVar.b();
        }
        return false;
    }

    public final boolean d() {
        w wVar = this.e;
        if (wVar == null || wVar.b || wVar.b()) {
            return false;
        }
        int i10 = this.e.l;
        return i10 == 90 || i10 == 270;
    }
}
