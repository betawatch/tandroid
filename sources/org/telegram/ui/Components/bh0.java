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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class bh0 extends jp {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public n9 g;
    public final /* synthetic */ ch0 h;

    public bh0(ch0 ch0Var, Context context, org.telegram.ui.iz0 iz0Var) {
        this.h = ch0Var;
        this.e = context;
        this.g = iz0Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // m2.a
    public final void a(m2.g gVar, Object obj) {
        yg0 yg0Var = (yg0) obj;
        View view = yg0Var.b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (yg0Var.a) {
            return;
        }
        wg0 wg0Var = yg0Var.c;
        if (wg0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = wg0Var.getImageReceiver().getDrawable();
            if (drawable instanceof x5) {
                ((x5) drawable).w(wg0Var);
            }
        }
        wg0Var.setRoundRadius(0);
        gVar.removeView(wg0Var);
        wg0Var.getImageReceiver().cancelLoadImage();
    }

    @Override // m2.a
    public final int b() {
        return this.c.size();
    }

    @Override // m2.a
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((yg0) obj);
        if (indexOf == -1) {
            return -2;
        }
        return indexOf;
    }

    @Override // m2.a
    public final CharSequence d(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k(i10) + 1);
        sb2.append("/");
        MessagesController.DialogPhotos dialogPhotos = this.h.O0;
        sb2.append(dialogPhotos == null ? 0 : dialogPhotos.getCount());
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a1  */
    @Override // m2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(m2.g gVar, int i10) {
        int i11;
        SparseArray sparseArray;
        boolean z10;
        boolean z11;
        String str;
        Bitmap bitmap;
        yg0 yg0Var = (yg0) this.c.get(i10);
        int k10 = k(i10);
        ch0 ch0Var = this.h;
        boolean z12 = ch0Var.e1;
        SparseArray sparseArray2 = ch0Var.Z0;
        ArrayList arrayList = ch0Var.X0;
        ArrayList arrayList2 = ch0Var.W0;
        ArrayList arrayList3 = ch0Var.T0;
        ArrayList arrayList4 = ch0Var.U0;
        ArrayList arrayList5 = ch0Var.V0;
        ArrayList arrayList6 = ch0Var.S0;
        Context context = this.e;
        if (z12 && k10 == 0) {
            yg0Var.a = true;
            if (yg0Var.b == null) {
                yg0Var.b = new zg0(context);
            }
            if (yg0Var.b.getParent() == null) {
                gVar.addView(yg0Var.b);
            }
            return yg0Var;
        }
        yg0Var.a = false;
        zg0 zg0Var = yg0Var.b;
        if (zg0Var != null && zg0Var.getParent() != null) {
            gVar.removeView(yg0Var.b);
        }
        if (yg0Var.c == null) {
            wg0 wg0Var = new wg0(ch0Var, context, i10, this.f);
            yg0Var.c = wg0Var;
            this.d.set(i10, wg0Var);
        }
        if (yg0Var.c.getParent() == null) {
            gVar.addView(yg0Var.c);
        }
        yg0Var.c.getImageReceiver().setAllowDecodeSingleFrame(true);
        int i12 = ch0Var.e1 ? k10 - 1 : k10;
        if (i12 != 0) {
            i11 = k10;
            sparseArray = sparseArray2;
            if (i12 >= 0 && i12 < arrayList6.size()) {
                ImageLocation imageLocation = (ImageLocation) arrayList6.get(i12);
                yg0Var.c.H = imageLocation != null;
                z10 = arrayList5.get(i12) == null;
                ImageLocation imageLocation2 = (ImageLocation) arrayList4.get(i12);
                yg0Var.c.o((w51) arrayList5.get(i12), imageLocation, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation2 == null || !(imageLocation2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), "avatar_" + ch0Var.A0);
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                }
                yg0Var.c.getImageReceiver().setDelegate(new ah0(this));
                yg0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                wg0 wg0Var2 = yg0Var.c;
                int i13 = ch0Var.i1;
                int i14 = ch0Var.j1;
                wg0Var2.r(i13, i13, i14, i14);
                yg0Var.c.setTag(Integer.valueOf(i11));
                return yg0Var;
            }
            z10 = false;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            yg0Var.c.getImageReceiver().setDelegate(new ah0(this));
            yg0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            wg0 wg0Var22 = yg0Var.c;
            int i132 = ch0Var.i1;
            int i142 = ch0Var.j1;
            wg0Var22.r(i132, i132, i142, i142);
            yg0Var.c.setTag(Integer.valueOf(i11));
            return yg0Var;
        }
        n9 n9Var = this.g;
        Drawable drawable = n9Var == null ? null : n9Var.getImageReceiver().getDrawable();
        if (drawable instanceof x5) {
            x5 x5Var = (x5) drawable;
            if (x5Var.s()) {
                yg0Var.c.setImageDrawable(drawable);
                x5Var.f(yg0Var.c);
                x5Var.N = true;
                i11 = k10;
                sparseArray = sparseArray2;
                z10 = false;
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    SparseArray sparseArray3 = sparseArray;
                    yg0Var.c.D = (RadialProgress2) sparseArray3.get(i12);
                    wg0 wg0Var3 = yg0Var.c;
                    if (wg0Var3.D == null) {
                        wg0Var3.D = new RadialProgress2(wg0Var3, null);
                        RadialProgress2 radialProgress2 = yg0Var.c.D;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        yg0Var.c.D.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i12, yg0Var.c.D);
                    }
                    if (ch0Var.c1) {
                        ch0Var.invalidate();
                    } else {
                        ch0Var.postInvalidateOnAnimation();
                    }
                }
                yg0Var.c.getImageReceiver().setDelegate(new ah0(this));
                yg0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                wg0 wg0Var222 = yg0Var.c;
                int i1322 = ch0Var.i1;
                int i1422 = ch0Var.j1;
                wg0Var222.r(i1322, i1322, i1422, i1422);
                yg0Var.c.setTag(Integer.valueOf(i11));
                return yg0Var;
            }
        }
        if (i12 >= 0 && i12 < arrayList6.size()) {
            ImageLocation imageLocation3 = (ImageLocation) arrayList6.get(i12);
            yg0Var.c.H = imageLocation3 != null;
            boolean z13 = arrayList5.get(i12) == null;
            if (!ch0Var.F0 || imageLocation3 == null) {
                z11 = z13;
            } else {
                z11 = z13;
                if (imageLocation3.imageType == 2) {
                    str = "avatar";
                    ImageLocation imageLocation4 = (ImageLocation) arrayList4.get(i12);
                    n9 n9Var2 = this.g;
                    i11 = k10;
                    bitmap = (n9Var2 == null && ch0Var.a1) ? n9Var2.getImageReceiver().getBitmap() : null;
                    StringBuilder sb2 = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb2.append(ch0Var.A0);
                    String sb3 = sb2.toString();
                    if (bitmap == null && arrayList5.get(i12) == null) {
                        wg0 wg0Var4 = yg0Var.c;
                        ImageLocation imageLocation5 = (ImageLocation) arrayList6.get(i12);
                        ImageLocation imageLocation6 = (ImageLocation) arrayList3.get(i12);
                        int intValue = ((Integer) arrayList2.get(i12)).intValue();
                        wg0Var4.getClass();
                        wg0Var4.a.setImage(imageLocation5, str, imageLocation6, null, null, null, new BitmapDrawable((Resources) null, bitmap), intValue, null, sb3, 1);
                        wg0Var4.d();
                    } else if (ch0Var.G0 == null) {
                        yg0Var.c.o((w51) arrayList5.get(i12), (ImageLocation) arrayList6.get(i12), str, (ImageLocation) arrayList3.get(i12), ch0Var.G0, null, ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    } else {
                        yg0Var.c.o((w51) arrayList5.get(i12), imageLocation3, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation4 == null || !(imageLocation4.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    }
                    z10 = z11;
                    if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    }
                    yg0Var.c.getImageReceiver().setDelegate(new ah0(this));
                    yg0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                    wg0 wg0Var2222 = yg0Var.c;
                    int i13222 = ch0Var.i1;
                    int i14222 = ch0Var.j1;
                    wg0Var2222.r(i13222, i13222, i14222, i14222);
                    yg0Var.c.setTag(Integer.valueOf(i11));
                    return yg0Var;
                }
            }
            str = null;
            ImageLocation imageLocation42 = (ImageLocation) arrayList4.get(i12);
            n9 n9Var22 = this.g;
            i11 = k10;
            if (n9Var22 == null) {
            }
            StringBuilder sb22 = new StringBuilder("avatar_");
            sparseArray = sparseArray2;
            sb22.append(ch0Var.A0);
            String sb32 = sb22.toString();
            if (bitmap == null) {
            }
            if (ch0Var.G0 == null) {
            }
            z10 = z11;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            yg0Var.c.getImageReceiver().setDelegate(new ah0(this));
            yg0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            wg0 wg0Var22222 = yg0Var.c;
            int i132222 = ch0Var.i1;
            int i142222 = ch0Var.j1;
            wg0Var22222.r(i132222, i132222, i142222, i142222);
            yg0Var.c.setTag(Integer.valueOf(i11));
            return yg0Var;
        }
        i11 = k10;
        sparseArray = sparseArray2;
        z10 = false;
        if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
        }
        yg0Var.c.getImageReceiver().setDelegate(new ah0(this));
        yg0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
        wg0 wg0Var222222 = yg0Var.c;
        int i1322222 = ch0Var.i1;
        int i1422222 = ch0Var.j1;
        wg0Var222222.r(i1322222, i1322222, i1422222, i1422222);
        yg0Var.c.setTag(Integer.valueOf(i11));
        return yg0Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        yg0 yg0Var = (yg0) obj;
        return yg0Var.a ? view == yg0Var.b : view == yg0Var.c;
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
                ((n9) arrayList.get(i10)).getImageReceiver().cancelLoadImage();
            }
            i10++;
        }
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList.clear();
        ch0 ch0Var = this.h;
        int size = ch0Var.T0.size();
        if (ch0Var.e1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = ch0Var.O0;
        int j10 = (j() * 2) + Math.max(dialogPhotos == null ? 0 : dialogPhotos.getCount(), size);
        for (int i11 = 0; i11 < j10; i11++) {
            arrayList2.add(new yg0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // org.telegram.ui.Components.jp
    public final int j() {
        ch0 ch0Var = this.h;
        int size = ch0Var.T0.size();
        if (ch0Var.e1) {
            size++;
        }
        if (size >= 2) {
            return ch0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
