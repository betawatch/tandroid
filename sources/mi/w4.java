package mi;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ac;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class w4 {
    public static ColorMatrixColorFilter f;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public Bitmap c;
    public final RadialProgress2 d;
    public s e;

    public w4(t4 t4Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = new ImageReceiver(t4Var);
        this.b = new ImageReceiver(t4Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(t4Var, e6Var);
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
        s sVar = this.e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.a;
        if (sVar == null) {
            imageReceiver.w0(null);
            return;
        }
        int i3 = org.telegram.messenger.g0.q.x;
        String i10 = com.google.android.recaptcha.internal.a.i(i3, "_", i3);
        StringBuilder sb3 = new StringBuilder();
        s sVar2 = this.e;
        if (sVar2 == null) {
            sb2 = "null";
        } else {
            String str = sVar2.b ? "v" : sVar2.c ? "a" : "p";
            if (sVar2.e != null) {
                StringBuilder h = t4.c.h(str, ":local:");
                h.append(this.e.e);
                sb2 = h.toString();
            } else {
                long j10 = 0;
                if (sVar2.b()) {
                    s sVar3 = this.e;
                    TLRPC.Document document2 = sVar3.h;
                    if (document2 != null) {
                        j10 = document2.id;
                    } else {
                        TLRPC.Photo photo2 = sVar3.g;
                        if (photo2 != null) {
                            j10 = photo2.id;
                        }
                    }
                }
                StringBuilder h7 = t4.c.h(str, ":");
                h7.append(this.e.a);
                h7.append(":");
                h7.append(j10);
                sb2 = h7.toString();
            }
        }
        sb3.append(sb2);
        sb3.append("@");
        sb3.append(i10);
        if (sb3.toString().equals(null)) {
            return;
        }
        this.e.getClass();
        s sVar4 = this.e;
        if (!sVar4.b) {
            if (sVar4.e != null) {
                imageReceiver.G0(sVar4.l, sVar4.m, true);
                imageReceiver.q0(ac.g(this.e.e), i10, null, null, null, 0);
                return;
            } else {
                if (!sVar4.b() || (photo = this.e.g) == null) {
                    imageReceiver.w0(null);
                    return;
                }
                TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
                TLRPC.PhotoSize w11 = w7.w(this.e.g.sizes, 100, false, null, false);
                imageReceiver.G0(0, 0, false);
                imageReceiver.r0(ac.i(w10, this.e.g), i10, ac.i(w11, this.e.g), i10, null, 0L, null, this.e.g, 0);
                return;
            }
        }
        if (sVar4.e != null) {
            imageReceiver.G0(0, 0, false);
            imageReceiver.u0(ac.o(this.e.e), "g", null, i10, null, i10, null, 0L, null, null, 0);
            return;
        }
        if (!sVar4.b() || (document = this.e.h) == null) {
            imageReceiver.w0(null);
            return;
        }
        ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
        int Z0 = org.telegram.messenger.g0.Z0(false);
        if (arrayList == null) {
            photoSize = null;
        } else {
            int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            photoSize = null;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.PhotoSize photoSize3 = arrayList.get(i12);
                if (!(photoSize3 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize3 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize3.w, photoSize3.h) - Z0)) < i11) {
                    photoSize = photoSize3;
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
        imageReceiver.G0(0, 0, false);
        imageReceiver.u0(ac.b(this.e.h), "g", ac.c(photoSize, this.e.h), i10, ac.c(photoSize2, this.e.h), i10, null, 0L, null, this.e.h, 0);
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap n4;
        if (c() && (n4 = (imageReceiver = this.a).n()) != null && !n4.isRecycled()) {
            ImageReceiver imageReceiver2 = this.b;
            if ((imageReceiver2.n() == null || imageReceiver.m() == null) && (n4 != this.c || imageReceiver2.n() == null)) {
                this.c = n4;
                imageReceiver2.v0(Utilities.D(n4, false));
                if (f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    org.telegram.messenger.g0.n2(colorMatrix, 0.9f);
                    org.telegram.messenger.g0.i(colorMatrix, 0.6f);
                    f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.p1 = f;
            }
            if (imageReceiver2.n() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        s sVar = this.e;
        if (sVar != null) {
            return sVar.e != null || sVar.b();
        }
        return false;
    }

    public final boolean d() {
        s sVar = this.e;
        if (sVar == null || sVar.b || sVar.b()) {
            return false;
        }
        int i3 = this.e.l;
        return i3 == 90 || i3 == 270;
    }
}
