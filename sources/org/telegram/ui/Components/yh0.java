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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class yh0 extends vp {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public w9 g;
    public final /* synthetic */ zh0 h;

    public yh0(zh0 zh0Var, Context context, org.telegram.ui.m01 m01Var) {
        this.h = zh0Var;
        this.e = context;
        this.g = m01Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        vh0 vh0Var = (vh0) obj;
        View view = vh0Var.b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (vh0Var.a) {
            return;
        }
        th0 th0Var = vh0Var.c;
        if (th0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = th0Var.getImageReceiver().getDrawable();
            if (drawable instanceof d6) {
                ((d6) drawable).w(th0Var);
            }
        }
        th0Var.setRoundRadius(0);
        gVar.removeView(th0Var);
        th0Var.getImageReceiver().cancelLoadImage();
    }

    @Override // z4.a
    public final int b() {
        return this.c.size();
    }

    @Override // z4.a
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((vh0) obj);
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
        vh0 vh0Var = (vh0) this.c.get(i10);
        int k10 = k(i10);
        zh0 zh0Var = this.h;
        boolean z12 = zh0Var.i1;
        SparseArray sparseArray2 = zh0Var.d1;
        ArrayList arrayList = zh0Var.b1;
        ArrayList arrayList2 = zh0Var.a1;
        ArrayList arrayList3 = zh0Var.X0;
        ArrayList arrayList4 = zh0Var.Y0;
        ArrayList arrayList5 = zh0Var.Z0;
        ArrayList arrayList6 = zh0Var.W0;
        Context context = this.e;
        if (z12 && k10 == 0) {
            vh0Var.a = true;
            if (vh0Var.b == null) {
                vh0Var.b = new wh0(context);
            }
            if (vh0Var.b.getParent() == null) {
                gVar.addView(vh0Var.b);
            }
            return vh0Var;
        }
        vh0Var.a = false;
        wh0 wh0Var = vh0Var.b;
        if (wh0Var != null && wh0Var.getParent() != null) {
            gVar.removeView(vh0Var.b);
        }
        if (vh0Var.c == null) {
            th0 th0Var = new th0(zh0Var, context, i10, this.f);
            vh0Var.c = th0Var;
            this.d.set(i10, th0Var);
        }
        if (vh0Var.c.getParent() == null) {
            gVar.addView(vh0Var.c);
        }
        vh0Var.c.getImageReceiver().setAllowDecodeSingleFrame(true);
        int i12 = zh0Var.i1 ? k10 - 1 : k10;
        if (i12 != 0) {
            i11 = k10;
            sparseArray = sparseArray2;
            if (i12 >= 0 && i12 < arrayList6.size()) {
                ImageLocation imageLocation = (ImageLocation) arrayList6.get(i12);
                vh0Var.c.L = imageLocation != null;
                z10 = arrayList5.get(i12) == null;
                ImageLocation imageLocation2 = (ImageLocation) arrayList4.get(i12);
                vh0Var.c.o((f71) arrayList5.get(i12), imageLocation, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation2 == null || !(imageLocation2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), "avatar_" + zh0Var.E0);
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                }
                vh0Var.c.getImageReceiver().setDelegate(new xh0(this));
                vh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                th0 th0Var2 = vh0Var.c;
                int i13 = zh0Var.m1;
                int i14 = zh0Var.n1;
                th0Var2.r(i13, i13, i14, i14);
                vh0Var.c.setTag(Integer.valueOf(i11));
                return vh0Var;
            }
            z10 = false;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            vh0Var.c.getImageReceiver().setDelegate(new xh0(this));
            vh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            th0 th0Var22 = vh0Var.c;
            int i132 = zh0Var.m1;
            int i142 = zh0Var.n1;
            th0Var22.r(i132, i132, i142, i142);
            vh0Var.c.setTag(Integer.valueOf(i11));
            return vh0Var;
        }
        w9 w9Var = this.g;
        Drawable drawable = w9Var == null ? null : w9Var.getImageReceiver().getDrawable();
        if (drawable instanceof d6) {
            d6 d6Var = (d6) drawable;
            if (d6Var.s()) {
                vh0Var.c.setImageDrawable(drawable);
                d6Var.f(vh0Var.c);
                d6Var.R = true;
                i11 = k10;
                sparseArray = sparseArray2;
                z10 = false;
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    SparseArray sparseArray3 = sparseArray;
                    vh0Var.c.H = (RadialProgress2) sparseArray3.get(i12);
                    th0 th0Var3 = vh0Var.c;
                    if (th0Var3.H == null) {
                        th0Var3.H = new RadialProgress2(th0Var3, null);
                        RadialProgress2 radialProgress2 = vh0Var.c.H;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        vh0Var.c.H.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i12, vh0Var.c.H);
                    }
                    if (zh0Var.g1) {
                        zh0Var.invalidate();
                    } else {
                        zh0Var.postInvalidateOnAnimation();
                    }
                }
                vh0Var.c.getImageReceiver().setDelegate(new xh0(this));
                vh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                th0 th0Var222 = vh0Var.c;
                int i1322 = zh0Var.m1;
                int i1422 = zh0Var.n1;
                th0Var222.r(i1322, i1322, i1422, i1422);
                vh0Var.c.setTag(Integer.valueOf(i11));
                return vh0Var;
            }
        }
        if (i12 >= 0 && i12 < arrayList6.size()) {
            ImageLocation imageLocation3 = (ImageLocation) arrayList6.get(i12);
            vh0Var.c.L = imageLocation3 != null;
            boolean z13 = arrayList5.get(i12) == null;
            if (!zh0Var.J0 || imageLocation3 == null) {
                z11 = z13;
            } else {
                z11 = z13;
                if (imageLocation3.imageType == 2) {
                    str = "avatar";
                    ImageLocation imageLocation4 = (ImageLocation) arrayList4.get(i12);
                    w9 w9Var2 = this.g;
                    i11 = k10;
                    bitmap = (w9Var2 == null && zh0Var.e1) ? w9Var2.getImageReceiver().getBitmap() : null;
                    StringBuilder sb2 = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb2.append(zh0Var.E0);
                    String sb3 = sb2.toString();
                    if (bitmap == null && arrayList5.get(i12) == null) {
                        th0 th0Var4 = vh0Var.c;
                        ImageLocation imageLocation5 = (ImageLocation) arrayList6.get(i12);
                        ImageLocation imageLocation6 = (ImageLocation) arrayList3.get(i12);
                        int intValue = ((Integer) arrayList2.get(i12)).intValue();
                        th0Var4.getClass();
                        th0Var4.a.setImage(imageLocation5, str, imageLocation6, null, null, null, new BitmapDrawable((Resources) null, bitmap), intValue, null, sb3, 1);
                        th0Var4.d();
                    } else if (zh0Var.K0 == null) {
                        vh0Var.c.o((f71) arrayList5.get(i12), (ImageLocation) arrayList6.get(i12), str, (ImageLocation) arrayList3.get(i12), zh0Var.K0, null, ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    } else {
                        vh0Var.c.o((f71) arrayList5.get(i12), imageLocation3, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation4 == null || !(imageLocation4.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    }
                    z10 = z11;
                    if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    }
                    vh0Var.c.getImageReceiver().setDelegate(new xh0(this));
                    vh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                    th0 th0Var2222 = vh0Var.c;
                    int i13222 = zh0Var.m1;
                    int i14222 = zh0Var.n1;
                    th0Var2222.r(i13222, i13222, i14222, i14222);
                    vh0Var.c.setTag(Integer.valueOf(i11));
                    return vh0Var;
                }
            }
            str = null;
            ImageLocation imageLocation42 = (ImageLocation) arrayList4.get(i12);
            w9 w9Var22 = this.g;
            i11 = k10;
            if (w9Var22 == null) {
            }
            StringBuilder sb22 = new StringBuilder("avatar_");
            sparseArray = sparseArray2;
            sb22.append(zh0Var.E0);
            String sb32 = sb22.toString();
            if (bitmap == null) {
            }
            if (zh0Var.K0 == null) {
            }
            z10 = z11;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            vh0Var.c.getImageReceiver().setDelegate(new xh0(this));
            vh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            th0 th0Var22222 = vh0Var.c;
            int i132222 = zh0Var.m1;
            int i142222 = zh0Var.n1;
            th0Var22222.r(i132222, i132222, i142222, i142222);
            vh0Var.c.setTag(Integer.valueOf(i11));
            return vh0Var;
        }
        i11 = k10;
        sparseArray = sparseArray2;
        z10 = false;
        if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
        }
        vh0Var.c.getImageReceiver().setDelegate(new xh0(this));
        vh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
        th0 th0Var222222 = vh0Var.c;
        int i1322222 = zh0Var.m1;
        int i1422222 = zh0Var.n1;
        th0Var222222.r(i1322222, i1322222, i1422222, i1422222);
        vh0Var.c.setTag(Integer.valueOf(i11));
        return vh0Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        vh0 vh0Var = (vh0) obj;
        return vh0Var.a ? view == vh0Var.b : view == vh0Var.c;
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
                ((w9) arrayList.get(i10)).getImageReceiver().cancelLoadImage();
            }
            i10++;
        }
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList.clear();
        zh0 zh0Var = this.h;
        int size = zh0Var.X0.size();
        if (zh0Var.i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = zh0Var.S0;
        int j3 = (j() * 2) + Math.max(dialogPhotos == null ? 0 : dialogPhotos.getCount(), size);
        for (int i11 = 0; i11 < j3; i11++) {
            arrayList2.add(new vh0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // org.telegram.ui.Components.vp
    public final int j() {
        zh0 zh0Var = this.h;
        int size = zh0Var.X0.size();
        if (zh0Var.i1) {
            size++;
        }
        if (size >= 2) {
            return zh0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
