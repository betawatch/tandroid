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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class oh0 extends vp {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public u9 g;
    public final /* synthetic */ ph0 h;

    public oh0(ph0 ph0Var, Context context, org.telegram.ui.o01 o01Var) {
        this.h = ph0Var;
        this.e = context;
        this.g = o01Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        lh0 lh0Var = (lh0) obj;
        View view = lh0Var.b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (lh0Var.a) {
            return;
        }
        jh0 jh0Var = lh0Var.c;
        if (jh0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = jh0Var.getImageReceiver().getDrawable();
            if (drawable instanceof b6) {
                ((b6) drawable).w(jh0Var);
            }
        }
        jh0Var.setRoundRadius(0);
        gVar.removeView(jh0Var);
        jh0Var.getImageReceiver().cancelLoadImage();
    }

    @Override // z4.a
    public final int b() {
        return this.c.size();
    }

    @Override // z4.a
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((lh0) obj);
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
        lh0 lh0Var = (lh0) this.c.get(i10);
        int k10 = k(i10);
        ph0 ph0Var = this.h;
        boolean z12 = ph0Var.i1;
        SparseArray sparseArray2 = ph0Var.d1;
        ArrayList arrayList = ph0Var.b1;
        ArrayList arrayList2 = ph0Var.a1;
        ArrayList arrayList3 = ph0Var.X0;
        ArrayList arrayList4 = ph0Var.Y0;
        ArrayList arrayList5 = ph0Var.Z0;
        ArrayList arrayList6 = ph0Var.W0;
        Context context = this.e;
        if (z12 && k10 == 0) {
            lh0Var.a = true;
            if (lh0Var.b == null) {
                lh0Var.b = new mh0(context);
            }
            if (lh0Var.b.getParent() == null) {
                gVar.addView(lh0Var.b);
            }
            return lh0Var;
        }
        lh0Var.a = false;
        mh0 mh0Var = lh0Var.b;
        if (mh0Var != null && mh0Var.getParent() != null) {
            gVar.removeView(lh0Var.b);
        }
        if (lh0Var.c == null) {
            jh0 jh0Var = new jh0(ph0Var, context, i10, this.f);
            lh0Var.c = jh0Var;
            this.d.set(i10, jh0Var);
        }
        if (lh0Var.c.getParent() == null) {
            gVar.addView(lh0Var.c);
        }
        lh0Var.c.getImageReceiver().setAllowDecodeSingleFrame(true);
        int i12 = ph0Var.i1 ? k10 - 1 : k10;
        if (i12 != 0) {
            i11 = k10;
            sparseArray = sparseArray2;
            if (i12 >= 0 && i12 < arrayList6.size()) {
                ImageLocation imageLocation = (ImageLocation) arrayList6.get(i12);
                lh0Var.c.L = imageLocation != null;
                z10 = arrayList5.get(i12) == null;
                ImageLocation imageLocation2 = (ImageLocation) arrayList4.get(i12);
                lh0Var.c.o((r61) arrayList5.get(i12), imageLocation, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation2 == null || !(imageLocation2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), "avatar_" + ph0Var.E0);
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                }
                lh0Var.c.getImageReceiver().setDelegate(new nh0(this));
                lh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                jh0 jh0Var2 = lh0Var.c;
                int i13 = ph0Var.m1;
                int i14 = ph0Var.n1;
                jh0Var2.r(i13, i13, i14, i14);
                lh0Var.c.setTag(Integer.valueOf(i11));
                return lh0Var;
            }
            z10 = false;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            lh0Var.c.getImageReceiver().setDelegate(new nh0(this));
            lh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            jh0 jh0Var22 = lh0Var.c;
            int i132 = ph0Var.m1;
            int i142 = ph0Var.n1;
            jh0Var22.r(i132, i132, i142, i142);
            lh0Var.c.setTag(Integer.valueOf(i11));
            return lh0Var;
        }
        u9 u9Var = this.g;
        Drawable drawable = u9Var == null ? null : u9Var.getImageReceiver().getDrawable();
        if (drawable instanceof b6) {
            b6 b6Var = (b6) drawable;
            if (b6Var.s()) {
                lh0Var.c.setImageDrawable(drawable);
                b6Var.f(lh0Var.c);
                b6Var.R = true;
                i11 = k10;
                sparseArray = sparseArray2;
                z10 = false;
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    SparseArray sparseArray3 = sparseArray;
                    lh0Var.c.H = (RadialProgress2) sparseArray3.get(i12);
                    jh0 jh0Var3 = lh0Var.c;
                    if (jh0Var3.H == null) {
                        jh0Var3.H = new RadialProgress2(jh0Var3, null);
                        RadialProgress2 radialProgress2 = lh0Var.c.H;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        lh0Var.c.H.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i12, lh0Var.c.H);
                    }
                    if (ph0Var.g1) {
                        ph0Var.invalidate();
                    } else {
                        ph0Var.postInvalidateOnAnimation();
                    }
                }
                lh0Var.c.getImageReceiver().setDelegate(new nh0(this));
                lh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                jh0 jh0Var222 = lh0Var.c;
                int i1322 = ph0Var.m1;
                int i1422 = ph0Var.n1;
                jh0Var222.r(i1322, i1322, i1422, i1422);
                lh0Var.c.setTag(Integer.valueOf(i11));
                return lh0Var;
            }
        }
        if (i12 >= 0 && i12 < arrayList6.size()) {
            ImageLocation imageLocation3 = (ImageLocation) arrayList6.get(i12);
            lh0Var.c.L = imageLocation3 != null;
            boolean z13 = arrayList5.get(i12) == null;
            if (!ph0Var.J0 || imageLocation3 == null) {
                z11 = z13;
            } else {
                z11 = z13;
                if (imageLocation3.imageType == 2) {
                    str = "avatar";
                    ImageLocation imageLocation4 = (ImageLocation) arrayList4.get(i12);
                    u9 u9Var2 = this.g;
                    i11 = k10;
                    bitmap = (u9Var2 == null && ph0Var.e1) ? u9Var2.getImageReceiver().getBitmap() : null;
                    StringBuilder sb2 = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb2.append(ph0Var.E0);
                    String sb3 = sb2.toString();
                    if (bitmap == null && arrayList5.get(i12) == null) {
                        jh0 jh0Var4 = lh0Var.c;
                        ImageLocation imageLocation5 = (ImageLocation) arrayList6.get(i12);
                        ImageLocation imageLocation6 = (ImageLocation) arrayList3.get(i12);
                        int intValue = ((Integer) arrayList2.get(i12)).intValue();
                        jh0Var4.getClass();
                        jh0Var4.a.setImage(imageLocation5, str, imageLocation6, null, null, null, new BitmapDrawable((Resources) null, bitmap), intValue, null, sb3, 1);
                        jh0Var4.d();
                    } else if (ph0Var.K0 == null) {
                        lh0Var.c.o((r61) arrayList5.get(i12), (ImageLocation) arrayList6.get(i12), str, (ImageLocation) arrayList3.get(i12), ph0Var.K0, null, ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    } else {
                        lh0Var.c.o((r61) arrayList5.get(i12), imageLocation3, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation4 == null || !(imageLocation4.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    }
                    z10 = z11;
                    if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    }
                    lh0Var.c.getImageReceiver().setDelegate(new nh0(this));
                    lh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                    jh0 jh0Var2222 = lh0Var.c;
                    int i13222 = ph0Var.m1;
                    int i14222 = ph0Var.n1;
                    jh0Var2222.r(i13222, i13222, i14222, i14222);
                    lh0Var.c.setTag(Integer.valueOf(i11));
                    return lh0Var;
                }
            }
            str = null;
            ImageLocation imageLocation42 = (ImageLocation) arrayList4.get(i12);
            u9 u9Var22 = this.g;
            i11 = k10;
            if (u9Var22 == null) {
            }
            StringBuilder sb22 = new StringBuilder("avatar_");
            sparseArray = sparseArray2;
            sb22.append(ph0Var.E0);
            String sb32 = sb22.toString();
            if (bitmap == null) {
            }
            if (ph0Var.K0 == null) {
            }
            z10 = z11;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            lh0Var.c.getImageReceiver().setDelegate(new nh0(this));
            lh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            jh0 jh0Var22222 = lh0Var.c;
            int i132222 = ph0Var.m1;
            int i142222 = ph0Var.n1;
            jh0Var22222.r(i132222, i132222, i142222, i142222);
            lh0Var.c.setTag(Integer.valueOf(i11));
            return lh0Var;
        }
        i11 = k10;
        sparseArray = sparseArray2;
        z10 = false;
        if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
        }
        lh0Var.c.getImageReceiver().setDelegate(new nh0(this));
        lh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
        jh0 jh0Var222222 = lh0Var.c;
        int i1322222 = ph0Var.m1;
        int i1422222 = ph0Var.n1;
        jh0Var222222.r(i1322222, i1322222, i1422222, i1422222);
        lh0Var.c.setTag(Integer.valueOf(i11));
        return lh0Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        lh0 lh0Var = (lh0) obj;
        return lh0Var.a ? view == lh0Var.b : view == lh0Var.c;
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
                ((u9) arrayList.get(i10)).getImageReceiver().cancelLoadImage();
            }
            i10++;
        }
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList.clear();
        ph0 ph0Var = this.h;
        int size = ph0Var.X0.size();
        if (ph0Var.i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = ph0Var.S0;
        int j3 = (j() * 2) + Math.max(dialogPhotos == null ? 0 : dialogPhotos.getCount(), size);
        for (int i11 = 0; i11 < j3; i11++) {
            arrayList2.add(new lh0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // org.telegram.ui.Components.vp
    public final int j() {
        ph0 ph0Var = this.h;
        int size = ph0Var.X0.size();
        if (ph0Var.i1) {
            size++;
        }
        if (size >= 2) {
            return ph0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
