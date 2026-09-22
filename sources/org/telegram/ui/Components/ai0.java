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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ai0 extends vp {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public v9 g;
    public final /* synthetic */ bi0 h;

    public ai0(bi0 bi0Var, Context context, org.telegram.ui.m01 m01Var) {
        this.h = bi0Var;
        this.e = context;
        this.g = m01Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        xh0 xh0Var = (xh0) obj;
        View view = xh0Var.b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (xh0Var.a) {
            return;
        }
        vh0 vh0Var = xh0Var.c;
        if (vh0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = vh0Var.getImageReceiver().getDrawable();
            if (drawable instanceof c6) {
                ((c6) drawable).w(vh0Var);
            }
        }
        vh0Var.setRoundRadius(0);
        gVar.removeView(vh0Var);
        vh0Var.getImageReceiver().cancelLoadImage();
    }

    @Override // z4.a
    public final int b() {
        return this.c.size();
    }

    @Override // z4.a
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((xh0) obj);
        if (indexOf == -1) {
            return -2;
        }
        return indexOf;
    }

    @Override // z4.a
    public final CharSequence d(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k(i10) + 1);
        sb2.append("/");
        MessagesController.DialogPhotos dialogPhotos = this.h.S0;
        sb2.append(dialogPhotos == null ? 0 : dialogPhotos.getCount());
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a1  */
    @Override // z4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(z4.g gVar, int i10) {
        int i11;
        SparseArray sparseArray;
        boolean z10;
        boolean z11;
        String str;
        Bitmap bitmap;
        xh0 xh0Var = (xh0) this.c.get(i10);
        int k10 = k(i10);
        bi0 bi0Var = this.h;
        boolean z12 = bi0Var.i1;
        SparseArray sparseArray2 = bi0Var.d1;
        ArrayList arrayList = bi0Var.b1;
        ArrayList arrayList2 = bi0Var.a1;
        ArrayList arrayList3 = bi0Var.X0;
        ArrayList arrayList4 = bi0Var.Y0;
        ArrayList arrayList5 = bi0Var.Z0;
        ArrayList arrayList6 = bi0Var.W0;
        Context context = this.e;
        if (z12 && k10 == 0) {
            xh0Var.a = true;
            if (xh0Var.b == null) {
                xh0Var.b = new yh0(context);
            }
            if (xh0Var.b.getParent() == null) {
                gVar.addView(xh0Var.b);
            }
            return xh0Var;
        }
        xh0Var.a = false;
        yh0 yh0Var = xh0Var.b;
        if (yh0Var != null && yh0Var.getParent() != null) {
            gVar.removeView(xh0Var.b);
        }
        if (xh0Var.c == null) {
            vh0 vh0Var = new vh0(bi0Var, context, i10, this.f);
            xh0Var.c = vh0Var;
            this.d.set(i10, vh0Var);
        }
        if (xh0Var.c.getParent() == null) {
            gVar.addView(xh0Var.c);
        }
        xh0Var.c.getImageReceiver().setAllowDecodeSingleFrame(true);
        int i12 = bi0Var.i1 ? k10 - 1 : k10;
        if (i12 != 0) {
            i11 = k10;
            sparseArray = sparseArray2;
            if (i12 >= 0 && i12 < arrayList6.size()) {
                ImageLocation imageLocation = (ImageLocation) arrayList6.get(i12);
                xh0Var.c.L = imageLocation != null;
                z10 = arrayList5.get(i12) == null;
                ImageLocation imageLocation2 = (ImageLocation) arrayList4.get(i12);
                xh0Var.c.o((g71) arrayList5.get(i12), imageLocation, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation2 == null || !(imageLocation2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), "avatar_" + bi0Var.E0);
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                }
                xh0Var.c.getImageReceiver().setDelegate(new zh0(this));
                xh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                vh0 vh0Var2 = xh0Var.c;
                int i13 = bi0Var.m1;
                int i14 = bi0Var.n1;
                vh0Var2.r(i13, i13, i14, i14);
                xh0Var.c.setTag(Integer.valueOf(i11));
                return xh0Var;
            }
            z10 = false;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            xh0Var.c.getImageReceiver().setDelegate(new zh0(this));
            xh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            vh0 vh0Var22 = xh0Var.c;
            int i132 = bi0Var.m1;
            int i142 = bi0Var.n1;
            vh0Var22.r(i132, i132, i142, i142);
            xh0Var.c.setTag(Integer.valueOf(i11));
            return xh0Var;
        }
        v9 v9Var = this.g;
        Drawable drawable = v9Var == null ? null : v9Var.getImageReceiver().getDrawable();
        if (drawable instanceof c6) {
            c6 c6Var = (c6) drawable;
            if (c6Var.s()) {
                xh0Var.c.setImageDrawable(drawable);
                c6Var.f(xh0Var.c);
                c6Var.R = true;
                i11 = k10;
                sparseArray = sparseArray2;
                z10 = false;
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    SparseArray sparseArray3 = sparseArray;
                    xh0Var.c.H = (RadialProgress2) sparseArray3.get(i12);
                    vh0 vh0Var3 = xh0Var.c;
                    if (vh0Var3.H == null) {
                        vh0Var3.H = new RadialProgress2(vh0Var3, null);
                        RadialProgress2 radialProgress2 = xh0Var.c.H;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        xh0Var.c.H.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i12, xh0Var.c.H);
                    }
                    if (bi0Var.g1) {
                        bi0Var.invalidate();
                    } else {
                        bi0Var.postInvalidateOnAnimation();
                    }
                }
                xh0Var.c.getImageReceiver().setDelegate(new zh0(this));
                xh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                vh0 vh0Var222 = xh0Var.c;
                int i1322 = bi0Var.m1;
                int i1422 = bi0Var.n1;
                vh0Var222.r(i1322, i1322, i1422, i1422);
                xh0Var.c.setTag(Integer.valueOf(i11));
                return xh0Var;
            }
        }
        if (i12 >= 0 && i12 < arrayList6.size()) {
            ImageLocation imageLocation3 = (ImageLocation) arrayList6.get(i12);
            xh0Var.c.L = imageLocation3 != null;
            boolean z13 = arrayList5.get(i12) == null;
            if (!bi0Var.J0 || imageLocation3 == null) {
                z11 = z13;
            } else {
                z11 = z13;
                if (imageLocation3.imageType == 2) {
                    str = "avatar";
                    ImageLocation imageLocation4 = (ImageLocation) arrayList4.get(i12);
                    v9 v9Var2 = this.g;
                    i11 = k10;
                    bitmap = (v9Var2 == null && bi0Var.e1) ? v9Var2.getImageReceiver().getBitmap() : null;
                    StringBuilder sb2 = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb2.append(bi0Var.E0);
                    String sb3 = sb2.toString();
                    if (bitmap == null && arrayList5.get(i12) == null) {
                        vh0 vh0Var4 = xh0Var.c;
                        ImageLocation imageLocation5 = (ImageLocation) arrayList6.get(i12);
                        ImageLocation imageLocation6 = (ImageLocation) arrayList3.get(i12);
                        int intValue = ((Integer) arrayList2.get(i12)).intValue();
                        vh0Var4.getClass();
                        vh0Var4.a.setImage(imageLocation5, str, imageLocation6, null, null, null, new BitmapDrawable((Resources) null, bitmap), intValue, null, sb3, 1);
                        vh0Var4.d();
                    } else if (bi0Var.K0 == null) {
                        xh0Var.c.o((g71) arrayList5.get(i12), (ImageLocation) arrayList6.get(i12), str, (ImageLocation) arrayList3.get(i12), bi0Var.K0, null, ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    } else {
                        xh0Var.c.o((g71) arrayList5.get(i12), imageLocation3, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation4 == null || !(imageLocation4.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    }
                    z10 = z11;
                    if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    }
                    xh0Var.c.getImageReceiver().setDelegate(new zh0(this));
                    xh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                    vh0 vh0Var2222 = xh0Var.c;
                    int i13222 = bi0Var.m1;
                    int i14222 = bi0Var.n1;
                    vh0Var2222.r(i13222, i13222, i14222, i14222);
                    xh0Var.c.setTag(Integer.valueOf(i11));
                    return xh0Var;
                }
            }
            str = null;
            ImageLocation imageLocation42 = (ImageLocation) arrayList4.get(i12);
            v9 v9Var22 = this.g;
            i11 = k10;
            if (v9Var22 == null) {
            }
            StringBuilder sb22 = new StringBuilder("avatar_");
            sparseArray = sparseArray2;
            sb22.append(bi0Var.E0);
            String sb32 = sb22.toString();
            if (bitmap == null) {
            }
            if (bi0Var.K0 == null) {
            }
            z10 = z11;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            xh0Var.c.getImageReceiver().setDelegate(new zh0(this));
            xh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            vh0 vh0Var22222 = xh0Var.c;
            int i132222 = bi0Var.m1;
            int i142222 = bi0Var.n1;
            vh0Var22222.r(i132222, i132222, i142222, i142222);
            xh0Var.c.setTag(Integer.valueOf(i11));
            return xh0Var;
        }
        i11 = k10;
        sparseArray = sparseArray2;
        z10 = false;
        if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
        }
        xh0Var.c.getImageReceiver().setDelegate(new zh0(this));
        xh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
        vh0 vh0Var222222 = xh0Var.c;
        int i1322222 = bi0Var.m1;
        int i1422222 = bi0Var.n1;
        vh0Var222222.r(i1322222, i1322222, i1422222, i1422222);
        xh0Var.c.setTag(Integer.valueOf(i11));
        return xh0Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        xh0 xh0Var = (xh0) obj;
        return xh0Var.a ? view == xh0Var.b : view == xh0Var.c;
    }

    @Override // z4.a
    public final void g() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((v9) arrayList.get(i10)).getImageReceiver().cancelLoadImage();
            }
            i10++;
        }
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList.clear();
        bi0 bi0Var = this.h;
        int size = bi0Var.X0.size();
        if (bi0Var.i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = bi0Var.S0;
        int j3 = (j() * 2) + Math.max(dialogPhotos == null ? 0 : dialogPhotos.getCount(), size);
        for (int i11 = 0; i11 < j3; i11++) {
            arrayList2.add(new xh0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // org.telegram.ui.Components.vp
    public final int j() {
        bi0 bi0Var = this.h;
        int size = bi0Var.X0.size();
        if (bi0Var.i1) {
            size++;
        }
        if (size >= 2) {
            return bi0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
