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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class nh0 extends up {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public x9 g;
    public final /* synthetic */ oh0 h;

    public nh0(oh0 oh0Var, Context context, org.telegram.ui.n01 n01Var) {
        this.h = oh0Var;
        this.e = context;
        this.g = n01Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        kh0 kh0Var = (kh0) obj;
        View view = kh0Var.b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (kh0Var.a) {
            return;
        }
        ih0 ih0Var = kh0Var.c;
        if (ih0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = ih0Var.getImageReceiver().getDrawable();
            if (drawable instanceof d6) {
                ((d6) drawable).w(ih0Var);
            }
        }
        ih0Var.setRoundRadius(0);
        gVar.removeView(ih0Var);
        ih0Var.getImageReceiver().cancelLoadImage();
    }

    @Override // z4.a
    public final int b() {
        return this.c.size();
    }

    @Override // z4.a
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((kh0) obj);
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
        kh0 kh0Var = (kh0) this.c.get(i10);
        int k10 = k(i10);
        oh0 oh0Var = this.h;
        boolean z12 = oh0Var.i1;
        SparseArray sparseArray2 = oh0Var.d1;
        ArrayList arrayList = oh0Var.b1;
        ArrayList arrayList2 = oh0Var.a1;
        ArrayList arrayList3 = oh0Var.X0;
        ArrayList arrayList4 = oh0Var.Y0;
        ArrayList arrayList5 = oh0Var.Z0;
        ArrayList arrayList6 = oh0Var.W0;
        Context context = this.e;
        if (z12 && k10 == 0) {
            kh0Var.a = true;
            if (kh0Var.b == null) {
                kh0Var.b = new lh0(context);
            }
            if (kh0Var.b.getParent() == null) {
                gVar.addView(kh0Var.b);
            }
            return kh0Var;
        }
        kh0Var.a = false;
        lh0 lh0Var = kh0Var.b;
        if (lh0Var != null && lh0Var.getParent() != null) {
            gVar.removeView(kh0Var.b);
        }
        if (kh0Var.c == null) {
            ih0 ih0Var = new ih0(oh0Var, context, i10, this.f);
            kh0Var.c = ih0Var;
            this.d.set(i10, ih0Var);
        }
        if (kh0Var.c.getParent() == null) {
            gVar.addView(kh0Var.c);
        }
        kh0Var.c.getImageReceiver().setAllowDecodeSingleFrame(true);
        int i12 = oh0Var.i1 ? k10 - 1 : k10;
        if (i12 != 0) {
            i11 = k10;
            sparseArray = sparseArray2;
            if (i12 >= 0 && i12 < arrayList6.size()) {
                ImageLocation imageLocation = (ImageLocation) arrayList6.get(i12);
                kh0Var.c.L = imageLocation != null;
                z10 = arrayList5.get(i12) == null;
                ImageLocation imageLocation2 = (ImageLocation) arrayList4.get(i12);
                kh0Var.c.o((q61) arrayList5.get(i12), imageLocation, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation2 == null || !(imageLocation2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), "avatar_" + oh0Var.E0);
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                }
                kh0Var.c.getImageReceiver().setDelegate(new mh0(this));
                kh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                ih0 ih0Var2 = kh0Var.c;
                int i13 = oh0Var.m1;
                int i14 = oh0Var.n1;
                ih0Var2.r(i13, i13, i14, i14);
                kh0Var.c.setTag(Integer.valueOf(i11));
                return kh0Var;
            }
            z10 = false;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            kh0Var.c.getImageReceiver().setDelegate(new mh0(this));
            kh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            ih0 ih0Var22 = kh0Var.c;
            int i132 = oh0Var.m1;
            int i142 = oh0Var.n1;
            ih0Var22.r(i132, i132, i142, i142);
            kh0Var.c.setTag(Integer.valueOf(i11));
            return kh0Var;
        }
        x9 x9Var = this.g;
        Drawable drawable = x9Var == null ? null : x9Var.getImageReceiver().getDrawable();
        if (drawable instanceof d6) {
            d6 d6Var = (d6) drawable;
            if (d6Var.s()) {
                kh0Var.c.setImageDrawable(drawable);
                d6Var.f(kh0Var.c);
                d6Var.R = true;
                i11 = k10;
                sparseArray = sparseArray2;
                z10 = false;
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    SparseArray sparseArray3 = sparseArray;
                    kh0Var.c.H = (RadialProgress2) sparseArray3.get(i12);
                    ih0 ih0Var3 = kh0Var.c;
                    if (ih0Var3.H == null) {
                        ih0Var3.H = new RadialProgress2(ih0Var3, null);
                        RadialProgress2 radialProgress2 = kh0Var.c.H;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        kh0Var.c.H.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i12, kh0Var.c.H);
                    }
                    if (oh0Var.g1) {
                        oh0Var.invalidate();
                    } else {
                        oh0Var.postInvalidateOnAnimation();
                    }
                }
                kh0Var.c.getImageReceiver().setDelegate(new mh0(this));
                kh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                ih0 ih0Var222 = kh0Var.c;
                int i1322 = oh0Var.m1;
                int i1422 = oh0Var.n1;
                ih0Var222.r(i1322, i1322, i1422, i1422);
                kh0Var.c.setTag(Integer.valueOf(i11));
                return kh0Var;
            }
        }
        if (i12 >= 0 && i12 < arrayList6.size()) {
            ImageLocation imageLocation3 = (ImageLocation) arrayList6.get(i12);
            kh0Var.c.L = imageLocation3 != null;
            boolean z13 = arrayList5.get(i12) == null;
            if (!oh0Var.J0 || imageLocation3 == null) {
                z11 = z13;
            } else {
                z11 = z13;
                if (imageLocation3.imageType == 2) {
                    str = "avatar";
                    ImageLocation imageLocation4 = (ImageLocation) arrayList4.get(i12);
                    x9 x9Var2 = this.g;
                    i11 = k10;
                    bitmap = (x9Var2 == null && oh0Var.e1) ? x9Var2.getImageReceiver().getBitmap() : null;
                    StringBuilder sb2 = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb2.append(oh0Var.E0);
                    String sb3 = sb2.toString();
                    if (bitmap == null && arrayList5.get(i12) == null) {
                        ih0 ih0Var4 = kh0Var.c;
                        ImageLocation imageLocation5 = (ImageLocation) arrayList6.get(i12);
                        ImageLocation imageLocation6 = (ImageLocation) arrayList3.get(i12);
                        int intValue = ((Integer) arrayList2.get(i12)).intValue();
                        ih0Var4.getClass();
                        ih0Var4.a.setImage(imageLocation5, str, imageLocation6, null, null, null, new BitmapDrawable((Resources) null, bitmap), intValue, null, sb3, 1);
                        ih0Var4.d();
                    } else if (oh0Var.K0 == null) {
                        kh0Var.c.o((q61) arrayList5.get(i12), (ImageLocation) arrayList6.get(i12), str, (ImageLocation) arrayList3.get(i12), oh0Var.K0, null, ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    } else {
                        kh0Var.c.o((q61) arrayList5.get(i12), imageLocation3, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation4 == null || !(imageLocation4.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    }
                    z10 = z11;
                    if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    }
                    kh0Var.c.getImageReceiver().setDelegate(new mh0(this));
                    kh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                    ih0 ih0Var2222 = kh0Var.c;
                    int i13222 = oh0Var.m1;
                    int i14222 = oh0Var.n1;
                    ih0Var2222.r(i13222, i13222, i14222, i14222);
                    kh0Var.c.setTag(Integer.valueOf(i11));
                    return kh0Var;
                }
            }
            str = null;
            ImageLocation imageLocation42 = (ImageLocation) arrayList4.get(i12);
            x9 x9Var22 = this.g;
            i11 = k10;
            if (x9Var22 == null) {
            }
            StringBuilder sb22 = new StringBuilder("avatar_");
            sparseArray = sparseArray2;
            sb22.append(oh0Var.E0);
            String sb32 = sb22.toString();
            if (bitmap == null) {
            }
            if (oh0Var.K0 == null) {
            }
            z10 = z11;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            kh0Var.c.getImageReceiver().setDelegate(new mh0(this));
            kh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            ih0 ih0Var22222 = kh0Var.c;
            int i132222 = oh0Var.m1;
            int i142222 = oh0Var.n1;
            ih0Var22222.r(i132222, i132222, i142222, i142222);
            kh0Var.c.setTag(Integer.valueOf(i11));
            return kh0Var;
        }
        i11 = k10;
        sparseArray = sparseArray2;
        z10 = false;
        if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
        }
        kh0Var.c.getImageReceiver().setDelegate(new mh0(this));
        kh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
        ih0 ih0Var222222 = kh0Var.c;
        int i1322222 = oh0Var.m1;
        int i1422222 = oh0Var.n1;
        ih0Var222222.r(i1322222, i1322222, i1422222, i1422222);
        kh0Var.c.setTag(Integer.valueOf(i11));
        return kh0Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        kh0 kh0Var = (kh0) obj;
        return kh0Var.a ? view == kh0Var.b : view == kh0Var.c;
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
                ((x9) arrayList.get(i10)).getImageReceiver().cancelLoadImage();
            }
            i10++;
        }
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList.clear();
        oh0 oh0Var = this.h;
        int size = oh0Var.X0.size();
        if (oh0Var.i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = oh0Var.S0;
        int j3 = (j() * 2) + Math.max(dialogPhotos == null ? 0 : dialogPhotos.getCount(), size);
        for (int i11 = 0; i11 < j3; i11++) {
            arrayList2.add(new kh0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // org.telegram.ui.Components.up
    public final int j() {
        oh0 oh0Var = this.h;
        int size = oh0Var.X0.size();
        if (oh0Var.i1) {
            size++;
        }
        if (size >= 2) {
            return oh0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
