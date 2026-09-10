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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class xh0 extends bq {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public w9 g;
    public final /* synthetic */ yh0 h;

    public xh0(yh0 yh0Var, Context context, org.telegram.ui.s01 s01Var) {
        this.h = yh0Var;
        this.e = context;
        this.g = s01Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        uh0 uh0Var = (uh0) obj;
        View view = uh0Var.b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (uh0Var.a) {
            return;
        }
        sh0 sh0Var = uh0Var.c;
        if (sh0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = sh0Var.getImageReceiver().getDrawable();
            if (drawable instanceof c6) {
                ((c6) drawable).w(sh0Var);
            }
        }
        sh0Var.setRoundRadius(0);
        gVar.removeView(sh0Var);
        sh0Var.getImageReceiver().cancelLoadImage();
    }

    @Override // z4.a
    public final int b() {
        return this.c.size();
    }

    @Override // z4.a
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((uh0) obj);
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
        uh0 uh0Var = (uh0) this.c.get(i10);
        int k10 = k(i10);
        yh0 yh0Var = this.h;
        boolean z12 = yh0Var.i1;
        SparseArray sparseArray2 = yh0Var.d1;
        ArrayList arrayList = yh0Var.b1;
        ArrayList arrayList2 = yh0Var.a1;
        ArrayList arrayList3 = yh0Var.X0;
        ArrayList arrayList4 = yh0Var.Y0;
        ArrayList arrayList5 = yh0Var.Z0;
        ArrayList arrayList6 = yh0Var.W0;
        Context context = this.e;
        if (z12 && k10 == 0) {
            uh0Var.a = true;
            if (uh0Var.b == null) {
                uh0Var.b = new vh0(context);
            }
            if (uh0Var.b.getParent() == null) {
                gVar.addView(uh0Var.b);
            }
            return uh0Var;
        }
        uh0Var.a = false;
        vh0 vh0Var = uh0Var.b;
        if (vh0Var != null && vh0Var.getParent() != null) {
            gVar.removeView(uh0Var.b);
        }
        if (uh0Var.c == null) {
            sh0 sh0Var = new sh0(yh0Var, context, i10, this.f);
            uh0Var.c = sh0Var;
            this.d.set(i10, sh0Var);
        }
        if (uh0Var.c.getParent() == null) {
            gVar.addView(uh0Var.c);
        }
        uh0Var.c.getImageReceiver().setAllowDecodeSingleFrame(true);
        int i12 = yh0Var.i1 ? k10 - 1 : k10;
        if (i12 != 0) {
            i11 = k10;
            sparseArray = sparseArray2;
            if (i12 >= 0 && i12 < arrayList6.size()) {
                ImageLocation imageLocation = (ImageLocation) arrayList6.get(i12);
                uh0Var.c.L = imageLocation != null;
                z10 = arrayList5.get(i12) == null;
                ImageLocation imageLocation2 = (ImageLocation) arrayList4.get(i12);
                uh0Var.c.o((d71) arrayList5.get(i12), imageLocation, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation2 == null || !(imageLocation2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), "avatar_" + yh0Var.E0);
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                }
                uh0Var.c.getImageReceiver().setDelegate(new wh0(this));
                uh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                sh0 sh0Var2 = uh0Var.c;
                int i13 = yh0Var.m1;
                int i14 = yh0Var.n1;
                sh0Var2.r(i13, i13, i14, i14);
                uh0Var.c.setTag(Integer.valueOf(i11));
                return uh0Var;
            }
            z10 = false;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            uh0Var.c.getImageReceiver().setDelegate(new wh0(this));
            uh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            sh0 sh0Var22 = uh0Var.c;
            int i132 = yh0Var.m1;
            int i142 = yh0Var.n1;
            sh0Var22.r(i132, i132, i142, i142);
            uh0Var.c.setTag(Integer.valueOf(i11));
            return uh0Var;
        }
        w9 w9Var = this.g;
        Drawable drawable = w9Var == null ? null : w9Var.getImageReceiver().getDrawable();
        if (drawable instanceof c6) {
            c6 c6Var = (c6) drawable;
            if (c6Var.s()) {
                uh0Var.c.setImageDrawable(drawable);
                c6Var.f(uh0Var.c);
                c6Var.R = true;
                i11 = k10;
                sparseArray = sparseArray2;
                z10 = false;
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    SparseArray sparseArray3 = sparseArray;
                    uh0Var.c.H = (RadialProgress2) sparseArray3.get(i12);
                    sh0 sh0Var3 = uh0Var.c;
                    if (sh0Var3.H == null) {
                        sh0Var3.H = new RadialProgress2(sh0Var3, null);
                        RadialProgress2 radialProgress2 = uh0Var.c.H;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        uh0Var.c.H.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i12, uh0Var.c.H);
                    }
                    if (yh0Var.g1) {
                        yh0Var.invalidate();
                    } else {
                        yh0Var.postInvalidateOnAnimation();
                    }
                }
                uh0Var.c.getImageReceiver().setDelegate(new wh0(this));
                uh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                sh0 sh0Var222 = uh0Var.c;
                int i1322 = yh0Var.m1;
                int i1422 = yh0Var.n1;
                sh0Var222.r(i1322, i1322, i1422, i1422);
                uh0Var.c.setTag(Integer.valueOf(i11));
                return uh0Var;
            }
        }
        if (i12 >= 0 && i12 < arrayList6.size()) {
            ImageLocation imageLocation3 = (ImageLocation) arrayList6.get(i12);
            uh0Var.c.L = imageLocation3 != null;
            boolean z13 = arrayList5.get(i12) == null;
            if (!yh0Var.J0 || imageLocation3 == null) {
                z11 = z13;
            } else {
                z11 = z13;
                if (imageLocation3.imageType == 2) {
                    str = "avatar";
                    ImageLocation imageLocation4 = (ImageLocation) arrayList4.get(i12);
                    w9 w9Var2 = this.g;
                    i11 = k10;
                    bitmap = (w9Var2 == null && yh0Var.e1) ? w9Var2.getImageReceiver().getBitmap() : null;
                    StringBuilder sb2 = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb2.append(yh0Var.E0);
                    String sb3 = sb2.toString();
                    if (bitmap == null && arrayList5.get(i12) == null) {
                        sh0 sh0Var4 = uh0Var.c;
                        ImageLocation imageLocation5 = (ImageLocation) arrayList6.get(i12);
                        ImageLocation imageLocation6 = (ImageLocation) arrayList3.get(i12);
                        int intValue = ((Integer) arrayList2.get(i12)).intValue();
                        sh0Var4.getClass();
                        sh0Var4.a.setImage(imageLocation5, str, imageLocation6, null, null, null, new BitmapDrawable((Resources) null, bitmap), intValue, null, sb3, 1);
                        sh0Var4.d();
                    } else if (yh0Var.K0 == null) {
                        uh0Var.c.o((d71) arrayList5.get(i12), (ImageLocation) arrayList6.get(i12), str, (ImageLocation) arrayList3.get(i12), yh0Var.K0, null, ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    } else {
                        uh0Var.c.o((d71) arrayList5.get(i12), imageLocation3, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation4 == null || !(imageLocation4.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    }
                    z10 = z11;
                    if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    }
                    uh0Var.c.getImageReceiver().setDelegate(new wh0(this));
                    uh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                    sh0 sh0Var2222 = uh0Var.c;
                    int i13222 = yh0Var.m1;
                    int i14222 = yh0Var.n1;
                    sh0Var2222.r(i13222, i13222, i14222, i14222);
                    uh0Var.c.setTag(Integer.valueOf(i11));
                    return uh0Var;
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
            sb22.append(yh0Var.E0);
            String sb32 = sb22.toString();
            if (bitmap == null) {
            }
            if (yh0Var.K0 == null) {
            }
            z10 = z11;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            uh0Var.c.getImageReceiver().setDelegate(new wh0(this));
            uh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            sh0 sh0Var22222 = uh0Var.c;
            int i132222 = yh0Var.m1;
            int i142222 = yh0Var.n1;
            sh0Var22222.r(i132222, i132222, i142222, i142222);
            uh0Var.c.setTag(Integer.valueOf(i11));
            return uh0Var;
        }
        i11 = k10;
        sparseArray = sparseArray2;
        z10 = false;
        if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
        }
        uh0Var.c.getImageReceiver().setDelegate(new wh0(this));
        uh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
        sh0 sh0Var222222 = uh0Var.c;
        int i1322222 = yh0Var.m1;
        int i1422222 = yh0Var.n1;
        sh0Var222222.r(i1322222, i1322222, i1422222, i1422222);
        uh0Var.c.setTag(Integer.valueOf(i11));
        return uh0Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        uh0 uh0Var = (uh0) obj;
        return uh0Var.a ? view == uh0Var.b : view == uh0Var.c;
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
        yh0 yh0Var = this.h;
        int size = yh0Var.X0.size();
        if (yh0Var.i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = yh0Var.S0;
        int j3 = (j() * 2) + Math.max(dialogPhotos == null ? 0 : dialogPhotos.getCount(), size);
        for (int i11 = 0; i11 < j3; i11++) {
            arrayList2.add(new uh0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // org.telegram.ui.Components.bq
    public final int j() {
        yh0 yh0Var = this.h;
        int size = yh0Var.X0.size();
        if (yh0Var.i1) {
            size++;
        }
        if (size >= 2) {
            return yh0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
