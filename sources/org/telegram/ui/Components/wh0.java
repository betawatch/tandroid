package org.telegram.ui.Components;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class wh0 extends vp {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public p9 g;
    public final /* synthetic */ xh0 h;

    public wh0(xh0 xh0Var, Context context, org.telegram.ui.vz0 vz0Var) {
        this.h = xh0Var;
        this.e = context;
        this.g = vz0Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // m2.a
    public final void a(m2.h hVar, Object obj) {
        th0 th0Var = (th0) obj;
        View view = th0Var.b;
        if (view != null) {
            hVar.removeView(view);
        }
        if (th0Var.a) {
            return;
        }
        rh0 rh0Var = th0Var.c;
        if (rh0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = rh0Var.getImageReceiver().getDrawable();
            if (drawable instanceof y5) {
                ((y5) drawable).w(rh0Var);
            }
        }
        rh0Var.setRoundRadius(0);
        hVar.removeView(rh0Var);
        rh0Var.getImageReceiver().cancelLoadImage();
    }

    @Override // m2.a
    public final int b() {
        return this.c.size();
    }

    @Override // m2.a
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((th0) obj);
        if (indexOf == -1) {
            return -2;
        }
        return indexOf;
    }

    @Override // m2.a
    public final CharSequence d(int i10) {
        StringBuilder sb = new StringBuilder();
        sb.append(k(i10) + 1);
        sb.append("/");
        MessagesController.DialogPhotos dialogPhotos = this.h.P0;
        sb.append(dialogPhotos == null ? 0 : dialogPhotos.getCount());
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a1  */
    @Override // m2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(m2.h hVar, int i10) {
        int i11;
        SparseArray sparseArray;
        boolean z4;
        boolean z10;
        String str;
        Bitmap bitmap;
        th0 th0Var = (th0) this.c.get(i10);
        int k10 = k(i10);
        xh0 xh0Var = this.h;
        boolean z11 = xh0Var.f1;
        SparseArray sparseArray2 = xh0Var.a1;
        ArrayList arrayList = xh0Var.Y0;
        ArrayList arrayList2 = xh0Var.X0;
        ArrayList arrayList3 = xh0Var.U0;
        ArrayList arrayList4 = xh0Var.V0;
        ArrayList arrayList5 = xh0Var.W0;
        ArrayList arrayList6 = xh0Var.T0;
        Context context = this.e;
        if (z11 && k10 == 0) {
            th0Var.a = true;
            if (th0Var.b == null) {
                th0Var.b = new uh0(context);
            }
            if (th0Var.b.getParent() == null) {
                hVar.addView(th0Var.b);
            }
            return th0Var;
        }
        th0Var.a = false;
        uh0 uh0Var = th0Var.b;
        if (uh0Var != null && uh0Var.getParent() != null) {
            hVar.removeView(th0Var.b);
        }
        if (th0Var.c == null) {
            rh0 rh0Var = new rh0(xh0Var, context, i10, this.f);
            th0Var.c = rh0Var;
            this.d.set(i10, rh0Var);
        }
        if (th0Var.c.getParent() == null) {
            hVar.addView(th0Var.c);
        }
        th0Var.c.getImageReceiver().setAllowDecodeSingleFrame(true);
        int i12 = xh0Var.f1 ? k10 - 1 : k10;
        if (i12 != 0) {
            i11 = k10;
            sparseArray = sparseArray2;
            if (i12 >= 0 && i12 < arrayList6.size()) {
                ImageLocation imageLocation = (ImageLocation) arrayList6.get(i12);
                th0Var.c.I = imageLocation != null;
                z4 = arrayList5.get(i12) == null;
                ImageLocation imageLocation2 = (ImageLocation) arrayList4.get(i12);
                th0Var.c.o((u61) arrayList5.get(i12), imageLocation, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation2 == null || !(imageLocation2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), "avatar_" + xh0Var.B0);
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z4 : true) {
                }
                th0Var.c.getImageReceiver().setDelegate(new vh0(this));
                th0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                rh0 rh0Var2 = th0Var.c;
                int i13 = xh0Var.j1;
                int i14 = xh0Var.k1;
                rh0Var2.r(i13, i13, i14, i14);
                th0Var.c.setTag(Integer.valueOf(i11));
                return th0Var;
            }
            z4 = false;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z4 : true) {
            }
            th0Var.c.getImageReceiver().setDelegate(new vh0(this));
            th0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            rh0 rh0Var22 = th0Var.c;
            int i132 = xh0Var.j1;
            int i142 = xh0Var.k1;
            rh0Var22.r(i132, i132, i142, i142);
            th0Var.c.setTag(Integer.valueOf(i11));
            return th0Var;
        }
        p9 p9Var = this.g;
        Drawable drawable = p9Var == null ? null : p9Var.getImageReceiver().getDrawable();
        if (drawable instanceof y5) {
            y5 y5Var = (y5) drawable;
            if (y5Var.s()) {
                th0Var.c.setImageDrawable(drawable);
                y5Var.f(th0Var.c);
                y5Var.O = true;
                i11 = k10;
                sparseArray = sparseArray2;
                z4 = false;
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z4 : true) {
                    SparseArray sparseArray3 = sparseArray;
                    th0Var.c.E = (RadialProgress2) sparseArray3.get(i12);
                    rh0 rh0Var3 = th0Var.c;
                    if (rh0Var3.E == null) {
                        rh0Var3.E = new RadialProgress2(rh0Var3, null);
                        RadialProgress2 radialProgress2 = th0Var.c.E;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        th0Var.c.E.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i12, th0Var.c.E);
                    }
                    if (xh0Var.d1) {
                        xh0Var.invalidate();
                    } else {
                        xh0Var.postInvalidateOnAnimation();
                    }
                }
                th0Var.c.getImageReceiver().setDelegate(new vh0(this));
                th0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                rh0 rh0Var222 = th0Var.c;
                int i1322 = xh0Var.j1;
                int i1422 = xh0Var.k1;
                rh0Var222.r(i1322, i1322, i1422, i1422);
                th0Var.c.setTag(Integer.valueOf(i11));
                return th0Var;
            }
        }
        if (i12 >= 0 && i12 < arrayList6.size()) {
            ImageLocation imageLocation3 = (ImageLocation) arrayList6.get(i12);
            th0Var.c.I = imageLocation3 != null;
            boolean z12 = arrayList5.get(i12) == null;
            if (!xh0Var.G0 || imageLocation3 == null) {
                z10 = z12;
            } else {
                z10 = z12;
                if (imageLocation3.imageType == 2) {
                    str = "avatar";
                    ImageLocation imageLocation4 = (ImageLocation) arrayList4.get(i12);
                    p9 p9Var2 = this.g;
                    i11 = k10;
                    bitmap = (p9Var2 == null && xh0Var.b1) ? p9Var2.getImageReceiver().getBitmap() : null;
                    StringBuilder sb = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb.append(xh0Var.B0);
                    String sb2 = sb.toString();
                    if (bitmap == null && arrayList5.get(i12) == null) {
                        rh0 rh0Var4 = th0Var.c;
                        ImageLocation imageLocation5 = (ImageLocation) arrayList6.get(i12);
                        ImageLocation imageLocation6 = (ImageLocation) arrayList3.get(i12);
                        int intValue = ((Integer) arrayList2.get(i12)).intValue();
                        rh0Var4.getClass();
                        rh0Var4.a.setImage(imageLocation5, str, imageLocation6, null, null, null, new BitmapDrawable((Resources) null, bitmap), intValue, null, sb2, 1);
                        rh0Var4.d();
                    } else if (xh0Var.H0 == null) {
                        th0Var.c.o((u61) arrayList5.get(i12), (ImageLocation) arrayList6.get(i12), str, (ImageLocation) arrayList3.get(i12), xh0Var.H0, null, ((Integer) arrayList2.get(i12)).intValue(), sb2);
                    } else {
                        th0Var.c.o((u61) arrayList5.get(i12), imageLocation3, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation4 == null || !(imageLocation4.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), sb2);
                    }
                    z4 = z10;
                    if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z4 : true) {
                    }
                    th0Var.c.getImageReceiver().setDelegate(new vh0(this));
                    th0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                    rh0 rh0Var2222 = th0Var.c;
                    int i13222 = xh0Var.j1;
                    int i14222 = xh0Var.k1;
                    rh0Var2222.r(i13222, i13222, i14222, i14222);
                    th0Var.c.setTag(Integer.valueOf(i11));
                    return th0Var;
                }
            }
            str = null;
            ImageLocation imageLocation42 = (ImageLocation) arrayList4.get(i12);
            p9 p9Var22 = this.g;
            i11 = k10;
            if (p9Var22 == null) {
            }
            StringBuilder sb3 = new StringBuilder("avatar_");
            sparseArray = sparseArray2;
            sb3.append(xh0Var.B0);
            String sb22 = sb3.toString();
            if (bitmap == null) {
            }
            if (xh0Var.H0 == null) {
            }
            z4 = z10;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z4 : true) {
            }
            th0Var.c.getImageReceiver().setDelegate(new vh0(this));
            th0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            rh0 rh0Var22222 = th0Var.c;
            int i132222 = xh0Var.j1;
            int i142222 = xh0Var.k1;
            rh0Var22222.r(i132222, i132222, i142222, i142222);
            th0Var.c.setTag(Integer.valueOf(i11));
            return th0Var;
        }
        i11 = k10;
        sparseArray = sparseArray2;
        z4 = false;
        if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z4 : true) {
        }
        th0Var.c.getImageReceiver().setDelegate(new vh0(this));
        th0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
        rh0 rh0Var222222 = th0Var.c;
        int i1322222 = xh0Var.j1;
        int i1422222 = xh0Var.k1;
        rh0Var222222.r(i1322222, i1322222, i1422222, i1422222);
        th0Var.c.setTag(Integer.valueOf(i11));
        return th0Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        th0 th0Var = (th0) obj;
        return th0Var.a ? view == th0Var.b : view == th0Var.c;
    }

    @Override // m2.a
    public final void g() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((p9) arrayList.get(i10)).getImageReceiver().cancelLoadImage();
            }
            i10++;
        }
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList.clear();
        xh0 xh0Var = this.h;
        int size = xh0Var.U0.size();
        if (xh0Var.f1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = xh0Var.P0;
        int j10 = (j() * 2) + Math.max(dialogPhotos == null ? 0 : dialogPhotos.getCount(), size);
        for (int i11 = 0; i11 < j10; i11++) {
            arrayList2.add(new th0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // org.telegram.ui.Components.vp
    public final int j() {
        xh0 xh0Var = this.h;
        int size = xh0Var.U0.size();
        if (xh0Var.f1) {
            size++;
        }
        if (size >= 2) {
            return xh0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
