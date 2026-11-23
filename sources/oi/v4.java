package oi;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gc;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class v4 {
    public static ColorMatrixColorFilter f;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public Bitmap c;
    public final RadialProgress2 d;
    public r e;

    public v4(s4 s4Var, h6 h6Var) {
        this.a = new ImageReceiver(s4Var);
        this.b = new ImageReceiver(s4Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(s4Var, h6Var);
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
        r rVar = this.e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.a;
        if (rVar == null) {
            imageReceiver.w0(null);
            return;
        }
        int i7 = org.telegram.messenger.g0.q.x;
        String j3 = com.google.android.gms.internal.vision.e2.j(i7, "_", i7);
        StringBuilder sb3 = new StringBuilder();
        r rVar2 = this.e;
        if (rVar2 == null) {
            sb2 = "null";
        } else {
            String str = rVar2.b ? "v" : rVar2.c ? "a" : "p";
            if (rVar2.e != null) {
                StringBuilder n10 = p5.c.n(str, ":local:");
                n10.append(this.e.e);
                sb2 = n10.toString();
            } else {
                long j10 = 0;
                if (rVar2.b()) {
                    r rVar3 = this.e;
                    TLRPC.Document document2 = rVar3.h;
                    if (document2 != null) {
                        j10 = document2.id;
                    } else {
                        TLRPC.Photo photo2 = rVar3.g;
                        if (photo2 != null) {
                            j10 = photo2.id;
                        }
                    }
                }
                StringBuilder n11 = p5.c.n(str, ":");
                n11.append(this.e.a);
                n11.append(":");
                n11.append(j10);
                sb2 = n11.toString();
            }
        }
        sb3.append(sb2);
        sb3.append("@");
        sb3.append(j3);
        if (sb3.toString().equals(null)) {
            return;
        }
        this.e.getClass();
        r rVar4 = this.e;
        if (!rVar4.b) {
            if (rVar4.e != null) {
                imageReceiver.G0(rVar4.l, rVar4.m, true);
                imageReceiver.q0(gc.g(this.e.e), j3, null, null, null, 0);
                return;
            } else {
                if (!rVar4.b() || (photo = this.e.g) == null) {
                    imageReceiver.w0(null);
                    return;
                }
                TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
                TLRPC.PhotoSize w11 = w7.w(this.e.g.sizes, 100, false, null, false);
                imageReceiver.G0(0, 0, false);
                imageReceiver.r0(gc.i(w10, this.e.g), j3, gc.i(w11, this.e.g), j3, null, 0L, null, this.e.g, 0);
                return;
            }
        }
        if (rVar4.e != null) {
            imageReceiver.G0(0, 0, false);
            imageReceiver.u0(gc.o(this.e.e), "g", null, j3, null, j3, null, 0L, null, null, 0);
            return;
        }
        if (!rVar4.b() || (document = this.e.h) == null) {
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
        imageReceiver.u0(gc.b(this.e.h), "g", gc.c(photoSize, this.e.h), j3, gc.c(photoSize2, this.e.h), j3, null, 0L, null, this.e.h, 0);
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
                imageReceiver2.p1 = f;
            }
            if (imageReceiver2.n() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        r rVar = this.e;
        if (rVar != null) {
            return rVar.e != null || rVar.b();
        }
        return false;
    }

    public final boolean d() {
        r rVar = this.e;
        if (rVar == null || rVar.b || rVar.b()) {
            return false;
        }
        int i7 = this.e.l;
        return i7 == 90 || i7 == 270;
    }
}
