package li;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hc;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class v4 {
    public static ColorMatrixColorFilter f;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public Bitmap c;
    public final RadialProgress2 d;
    public s e;

    public v4(s4 s4Var, g6 g6Var) {
        this.a = new ImageReceiver(s4Var);
        this.b = new ImageReceiver(s4Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(s4Var, g6Var);
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
        int i7 = org.telegram.messenger.g0.q.x;
        String j3 = com.google.android.recaptcha.internal.a.j(i7, "_", i7);
        StringBuilder sb3 = new StringBuilder();
        s sVar2 = this.e;
        if (sVar2 == null) {
            sb2 = "null";
        } else {
            String str = sVar2.b ? "v" : sVar2.c ? "a" : "p";
            if (sVar2.e != null) {
                StringBuilder j10 = rf.b.j(str, ":local:");
                j10.append(this.e.e);
                sb2 = j10.toString();
            } else {
                long j11 = 0;
                if (sVar2.b()) {
                    s sVar3 = this.e;
                    TLRPC.Document document2 = sVar3.h;
                    if (document2 != null) {
                        j11 = document2.id;
                    } else {
                        TLRPC.Photo photo2 = sVar3.g;
                        if (photo2 != null) {
                            j11 = photo2.id;
                        }
                    }
                }
                StringBuilder j12 = rf.b.j(str, ":");
                j12.append(this.e.a);
                j12.append(":");
                j12.append(j11);
                sb2 = j12.toString();
            }
        }
        sb3.append(sb2);
        sb3.append("@");
        sb3.append(j3);
        if (sb3.toString().equals(null)) {
            return;
        }
        this.e.getClass();
        s sVar4 = this.e;
        if (!sVar4.b) {
            if (sVar4.e != null) {
                imageReceiver.G0(sVar4.l, sVar4.m, true);
                imageReceiver.q0(hc.g(this.e.e), j3, null, null, null, 0);
                return;
            } else {
                if (!sVar4.b() || (photo = this.e.g) == null) {
                    imageReceiver.w0(null);
                    return;
                }
                TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
                TLRPC.PhotoSize w11 = w7.w(this.e.g.sizes, 100, false, null, false);
                imageReceiver.G0(0, 0, false);
                imageReceiver.r0(hc.i(w10, this.e.g), j3, hc.i(w11, this.e.g), j3, null, 0L, null, this.e.g, 0);
                return;
            }
        }
        if (sVar4.e != null) {
            imageReceiver.G0(0, 0, false);
            imageReceiver.u0(hc.o(this.e.e), "g", null, j3, null, j3, null, 0L, null, null, 0);
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
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            photoSize = null;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.PhotoSize photoSize3 = arrayList.get(i11);
                if (!(photoSize3 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize3 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize3.w, photoSize3.h) - Z0)) < i10) {
                    photoSize = photoSize3;
                    i10 = abs;
                }
            }
        }
        ArrayList<TLRPC.PhotoSize> arrayList2 = this.e.h.thumbs;
        if (arrayList2 != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    break;
                }
                if (arrayList2.get(i12) instanceof TLRPC.TL_photoStrippedSize) {
                    photoSize2 = arrayList2.get(i12);
                    break;
                }
                i12++;
            }
        }
        imageReceiver.G0(0, 0, false);
        imageReceiver.u0(hc.b(this.e.h), "g", hc.c(photoSize, this.e.h), j3, hc.c(photoSize2, this.e.h), j3, null, 0L, null, this.e.h, 0);
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
                    org.telegram.messenger.g0.n2(colorMatrix, 0.9f);
                    org.telegram.messenger.g0.i(colorMatrix, 0.6f);
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
        int i7 = this.e.l;
        return i7 == 90 || i7 == 270;
    }
}
