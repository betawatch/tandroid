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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ni0 extends iq {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public y9 g;
    public final /* synthetic */ oi0 h;

    public ni0(oi0 oi0Var, Context context, org.telegram.ui.yz0 yz0Var) {
        this.h = oi0Var;
        this.e = context;
        this.g = yz0Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // a5.a
    public final void a(a5.m mVar, Object obj) {
        ki0 ki0Var = (ki0) obj;
        View view = ki0Var.b;
        if (view != null) {
            mVar.removeView(view);
        }
        if (ki0Var.a) {
            return;
        }
        ii0 ii0Var = ki0Var.c;
        if (ii0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = ii0Var.getImageReceiver().getDrawable();
            if (drawable instanceof g6) {
                ((g6) drawable).w(ii0Var);
            }
        }
        ii0Var.setRoundRadius(0);
        mVar.removeView(ii0Var);
        ii0Var.getImageReceiver().cancelLoadImage();
    }

    @Override // a5.a
    public final int b() {
        return this.c.size();
    }

    @Override // a5.a
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((ki0) obj);
        if (indexOf == -1) {
            return -2;
        }
        return indexOf;
    }

    @Override // a5.a
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
    @Override // a5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(a5.m mVar, int i10) {
        int i11;
        SparseArray sparseArray;
        boolean z10;
        boolean z11;
        String str;
        Bitmap bitmap;
        ki0 ki0Var = (ki0) this.c.get(i10);
        int k10 = k(i10);
        oi0 oi0Var = this.h;
        boolean z12 = oi0Var.i1;
        SparseArray sparseArray2 = oi0Var.d1;
        ArrayList arrayList = oi0Var.b1;
        ArrayList arrayList2 = oi0Var.a1;
        ArrayList arrayList3 = oi0Var.X0;
        ArrayList arrayList4 = oi0Var.Y0;
        ArrayList arrayList5 = oi0Var.Z0;
        ArrayList arrayList6 = oi0Var.W0;
        Context context = this.e;
        if (z12 && k10 == 0) {
            ki0Var.a = true;
            if (ki0Var.b == null) {
                ki0Var.b = new li0(context);
            }
            if (ki0Var.b.getParent() == null) {
                mVar.addView(ki0Var.b);
            }
            return ki0Var;
        }
        ki0Var.a = false;
        li0 li0Var = ki0Var.b;
        if (li0Var != null && li0Var.getParent() != null) {
            mVar.removeView(ki0Var.b);
        }
        if (ki0Var.c == null) {
            ii0 ii0Var = new ii0(oi0Var, context, i10, this.f);
            ki0Var.c = ii0Var;
            this.d.set(i10, ii0Var);
        }
        if (ki0Var.c.getParent() == null) {
            mVar.addView(ki0Var.c);
        }
        ki0Var.c.getImageReceiver().setAllowDecodeSingleFrame(true);
        int i12 = oi0Var.i1 ? k10 - 1 : k10;
        if (i12 != 0) {
            i11 = k10;
            sparseArray = sparseArray2;
            if (i12 >= 0 && i12 < arrayList6.size()) {
                ImageLocation imageLocation = (ImageLocation) arrayList6.get(i12);
                ki0Var.c.L = imageLocation != null;
                z10 = arrayList5.get(i12) == null;
                ImageLocation imageLocation2 = (ImageLocation) arrayList4.get(i12);
                ki0Var.c.o((e81) arrayList5.get(i12), imageLocation, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation2 == null || !(imageLocation2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), "avatar_" + oi0Var.E0);
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                }
                ki0Var.c.getImageReceiver().setDelegate(new mi0(this));
                ki0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                ii0 ii0Var2 = ki0Var.c;
                int i13 = oi0Var.m1;
                int i14 = oi0Var.n1;
                ii0Var2.r(i13, i13, i14, i14);
                ki0Var.c.setTag(Integer.valueOf(i11));
                return ki0Var;
            }
            z10 = false;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            ki0Var.c.getImageReceiver().setDelegate(new mi0(this));
            ki0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            ii0 ii0Var22 = ki0Var.c;
            int i132 = oi0Var.m1;
            int i142 = oi0Var.n1;
            ii0Var22.r(i132, i132, i142, i142);
            ki0Var.c.setTag(Integer.valueOf(i11));
            return ki0Var;
        }
        y9 y9Var = this.g;
        Drawable drawable = y9Var == null ? null : y9Var.getImageReceiver().getDrawable();
        if (drawable instanceof g6) {
            g6 g6Var = (g6) drawable;
            if (g6Var.s()) {
                ki0Var.c.setImageDrawable(drawable);
                g6Var.f(ki0Var.c);
                g6Var.R = true;
                i11 = k10;
                sparseArray = sparseArray2;
                z10 = false;
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    SparseArray sparseArray3 = sparseArray;
                    ki0Var.c.H = (RadialProgress2) sparseArray3.get(i12);
                    ii0 ii0Var3 = ki0Var.c;
                    if (ii0Var3.H == null) {
                        ii0Var3.H = new RadialProgress2(ii0Var3, null);
                        RadialProgress2 radialProgress2 = ki0Var.c.H;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        ki0Var.c.H.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i12, ki0Var.c.H);
                    }
                    if (oi0Var.g1) {
                        oi0Var.invalidate();
                    } else {
                        oi0Var.postInvalidateOnAnimation();
                    }
                }
                ki0Var.c.getImageReceiver().setDelegate(new mi0(this));
                ki0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                ii0 ii0Var222 = ki0Var.c;
                int i1322 = oi0Var.m1;
                int i1422 = oi0Var.n1;
                ii0Var222.r(i1322, i1322, i1422, i1422);
                ki0Var.c.setTag(Integer.valueOf(i11));
                return ki0Var;
            }
        }
        if (i12 >= 0 && i12 < arrayList6.size()) {
            ImageLocation imageLocation3 = (ImageLocation) arrayList6.get(i12);
            ki0Var.c.L = imageLocation3 != null;
            boolean z13 = arrayList5.get(i12) == null;
            if (!oi0Var.J0 || imageLocation3 == null) {
                z11 = z13;
            } else {
                z11 = z13;
                if (imageLocation3.imageType == 2) {
                    str = "avatar";
                    ImageLocation imageLocation4 = (ImageLocation) arrayList4.get(i12);
                    y9 y9Var2 = this.g;
                    i11 = k10;
                    bitmap = (y9Var2 == null && oi0Var.e1) ? y9Var2.getImageReceiver().getBitmap() : null;
                    StringBuilder sb2 = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb2.append(oi0Var.E0);
                    String sb3 = sb2.toString();
                    if (bitmap == null && arrayList5.get(i12) == null) {
                        ii0 ii0Var4 = ki0Var.c;
                        ImageLocation imageLocation5 = (ImageLocation) arrayList6.get(i12);
                        ImageLocation imageLocation6 = (ImageLocation) arrayList3.get(i12);
                        int intValue = ((Integer) arrayList2.get(i12)).intValue();
                        ii0Var4.getClass();
                        ii0Var4.a.setImage(imageLocation5, str, imageLocation6, null, null, null, new BitmapDrawable((Resources) null, bitmap), intValue, null, sb3, 1);
                        ii0Var4.d();
                    } else if (oi0Var.K0 == null) {
                        ki0Var.c.o((e81) arrayList5.get(i12), (ImageLocation) arrayList6.get(i12), str, (ImageLocation) arrayList3.get(i12), oi0Var.K0, null, ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    } else {
                        ki0Var.c.o((e81) arrayList5.get(i12), imageLocation3, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation4 == null || !(imageLocation4.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    }
                    z10 = z11;
                    if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    }
                    ki0Var.c.getImageReceiver().setDelegate(new mi0(this));
                    ki0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                    ii0 ii0Var2222 = ki0Var.c;
                    int i13222 = oi0Var.m1;
                    int i14222 = oi0Var.n1;
                    ii0Var2222.r(i13222, i13222, i14222, i14222);
                    ki0Var.c.setTag(Integer.valueOf(i11));
                    return ki0Var;
                }
            }
            str = null;
            ImageLocation imageLocation42 = (ImageLocation) arrayList4.get(i12);
            y9 y9Var22 = this.g;
            i11 = k10;
            if (y9Var22 == null) {
            }
            StringBuilder sb22 = new StringBuilder("avatar_");
            sparseArray = sparseArray2;
            sb22.append(oi0Var.E0);
            String sb32 = sb22.toString();
            if (bitmap == null) {
            }
            if (oi0Var.K0 == null) {
            }
            z10 = z11;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            ki0Var.c.getImageReceiver().setDelegate(new mi0(this));
            ki0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            ii0 ii0Var22222 = ki0Var.c;
            int i132222 = oi0Var.m1;
            int i142222 = oi0Var.n1;
            ii0Var22222.r(i132222, i132222, i142222, i142222);
            ki0Var.c.setTag(Integer.valueOf(i11));
            return ki0Var;
        }
        i11 = k10;
        sparseArray = sparseArray2;
        z10 = false;
        if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
        }
        ki0Var.c.getImageReceiver().setDelegate(new mi0(this));
        ki0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
        ii0 ii0Var222222 = ki0Var.c;
        int i1322222 = oi0Var.m1;
        int i1422222 = oi0Var.n1;
        ii0Var222222.r(i1322222, i1322222, i1422222, i1422222);
        ki0Var.c.setTag(Integer.valueOf(i11));
        return ki0Var;
    }

    @Override // a5.a
    public final boolean f(View view, Object obj) {
        ki0 ki0Var = (ki0) obj;
        return ki0Var.a ? view == ki0Var.b : view == ki0Var.c;
    }

    @Override // a5.a
    public final void g() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((y9) arrayList.get(i10)).getImageReceiver().cancelLoadImage();
            }
            i10++;
        }
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList.clear();
        oi0 oi0Var = this.h;
        int size = oi0Var.X0.size();
        if (oi0Var.i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = oi0Var.S0;
        int j10 = (j() * 2) + Math.max(dialogPhotos == null ? 0 : dialogPhotos.getCount(), size);
        for (int i11 = 0; i11 < j10; i11++) {
            arrayList2.add(new ki0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // org.telegram.ui.Components.iq
    public final int j() {
        oi0 oi0Var = this.h;
        int size = oi0Var.X0.size();
        if (oi0Var.i1) {
            size++;
        }
        if (size >= 2) {
            return oi0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
