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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class uh0 extends tp {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public p9 g;
    public final /* synthetic */ vh0 h;

    public uh0(vh0 vh0Var, Context context, org.telegram.ui.tz0 tz0Var) {
        this.h = vh0Var;
        this.e = context;
        this.g = tz0Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // m2.a
    public final void a(m2.h hVar, Object obj) {
        rh0 rh0Var = (rh0) obj;
        View view = rh0Var.b;
        if (view != null) {
            hVar.removeView(view);
        }
        if (rh0Var.a) {
            return;
        }
        ph0 ph0Var = rh0Var.c;
        if (ph0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = ph0Var.getImageReceiver().getDrawable();
            if (drawable instanceof y5) {
                ((y5) drawable).w(ph0Var);
            }
        }
        ph0Var.setRoundRadius(0);
        hVar.removeView(ph0Var);
        ph0Var.getImageReceiver().cancelLoadImage();
    }

    @Override // m2.a
    public final int b() {
        return this.c.size();
    }

    @Override // m2.a
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((rh0) obj);
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
        rh0 rh0Var = (rh0) this.c.get(i10);
        int k10 = k(i10);
        vh0 vh0Var = this.h;
        boolean z11 = vh0Var.f1;
        SparseArray sparseArray2 = vh0Var.a1;
        ArrayList arrayList = vh0Var.Y0;
        ArrayList arrayList2 = vh0Var.X0;
        ArrayList arrayList3 = vh0Var.U0;
        ArrayList arrayList4 = vh0Var.V0;
        ArrayList arrayList5 = vh0Var.W0;
        ArrayList arrayList6 = vh0Var.T0;
        Context context = this.e;
        if (z11 && k10 == 0) {
            rh0Var.a = true;
            if (rh0Var.b == null) {
                rh0Var.b = new sh0(context);
            }
            if (rh0Var.b.getParent() == null) {
                hVar.addView(rh0Var.b);
            }
            return rh0Var;
        }
        rh0Var.a = false;
        sh0 sh0Var = rh0Var.b;
        if (sh0Var != null && sh0Var.getParent() != null) {
            hVar.removeView(rh0Var.b);
        }
        if (rh0Var.c == null) {
            ph0 ph0Var = new ph0(vh0Var, context, i10, this.f);
            rh0Var.c = ph0Var;
            this.d.set(i10, ph0Var);
        }
        if (rh0Var.c.getParent() == null) {
            hVar.addView(rh0Var.c);
        }
        rh0Var.c.getImageReceiver().setAllowDecodeSingleFrame(true);
        int i12 = vh0Var.f1 ? k10 - 1 : k10;
        if (i12 != 0) {
            i11 = k10;
            sparseArray = sparseArray2;
            if (i12 >= 0 && i12 < arrayList6.size()) {
                ImageLocation imageLocation = (ImageLocation) arrayList6.get(i12);
                rh0Var.c.I = imageLocation != null;
                z4 = arrayList5.get(i12) == null;
                ImageLocation imageLocation2 = (ImageLocation) arrayList4.get(i12);
                rh0Var.c.o((s61) arrayList5.get(i12), imageLocation, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation2 == null || !(imageLocation2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), "avatar_" + vh0Var.B0);
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z4 : true) {
                }
                rh0Var.c.getImageReceiver().setDelegate(new th0(this));
                rh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                ph0 ph0Var2 = rh0Var.c;
                int i13 = vh0Var.j1;
                int i14 = vh0Var.k1;
                ph0Var2.r(i13, i13, i14, i14);
                rh0Var.c.setTag(Integer.valueOf(i11));
                return rh0Var;
            }
            z4 = false;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z4 : true) {
            }
            rh0Var.c.getImageReceiver().setDelegate(new th0(this));
            rh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            ph0 ph0Var22 = rh0Var.c;
            int i132 = vh0Var.j1;
            int i142 = vh0Var.k1;
            ph0Var22.r(i132, i132, i142, i142);
            rh0Var.c.setTag(Integer.valueOf(i11));
            return rh0Var;
        }
        p9 p9Var = this.g;
        Drawable drawable = p9Var == null ? null : p9Var.getImageReceiver().getDrawable();
        if (drawable instanceof y5) {
            y5 y5Var = (y5) drawable;
            if (y5Var.s()) {
                rh0Var.c.setImageDrawable(drawable);
                y5Var.f(rh0Var.c);
                y5Var.O = true;
                i11 = k10;
                sparseArray = sparseArray2;
                z4 = false;
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z4 : true) {
                    SparseArray sparseArray3 = sparseArray;
                    rh0Var.c.E = (RadialProgress2) sparseArray3.get(i12);
                    ph0 ph0Var3 = rh0Var.c;
                    if (ph0Var3.E == null) {
                        ph0Var3.E = new RadialProgress2(ph0Var3, null);
                        RadialProgress2 radialProgress2 = rh0Var.c.E;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        rh0Var.c.E.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i12, rh0Var.c.E);
                    }
                    if (vh0Var.d1) {
                        vh0Var.invalidate();
                    } else {
                        vh0Var.postInvalidateOnAnimation();
                    }
                }
                rh0Var.c.getImageReceiver().setDelegate(new th0(this));
                rh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                ph0 ph0Var222 = rh0Var.c;
                int i1322 = vh0Var.j1;
                int i1422 = vh0Var.k1;
                ph0Var222.r(i1322, i1322, i1422, i1422);
                rh0Var.c.setTag(Integer.valueOf(i11));
                return rh0Var;
            }
        }
        if (i12 >= 0 && i12 < arrayList6.size()) {
            ImageLocation imageLocation3 = (ImageLocation) arrayList6.get(i12);
            rh0Var.c.I = imageLocation3 != null;
            boolean z12 = arrayList5.get(i12) == null;
            if (!vh0Var.G0 || imageLocation3 == null) {
                z10 = z12;
            } else {
                z10 = z12;
                if (imageLocation3.imageType == 2) {
                    str = "avatar";
                    ImageLocation imageLocation4 = (ImageLocation) arrayList4.get(i12);
                    p9 p9Var2 = this.g;
                    i11 = k10;
                    bitmap = (p9Var2 == null && vh0Var.b1) ? p9Var2.getImageReceiver().getBitmap() : null;
                    StringBuilder sb = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb.append(vh0Var.B0);
                    String sb2 = sb.toString();
                    if (bitmap == null && arrayList5.get(i12) == null) {
                        ph0 ph0Var4 = rh0Var.c;
                        ImageLocation imageLocation5 = (ImageLocation) arrayList6.get(i12);
                        ImageLocation imageLocation6 = (ImageLocation) arrayList3.get(i12);
                        int intValue = ((Integer) arrayList2.get(i12)).intValue();
                        ph0Var4.getClass();
                        ph0Var4.a.setImage(imageLocation5, str, imageLocation6, null, null, null, new BitmapDrawable((Resources) null, bitmap), intValue, null, sb2, 1);
                        ph0Var4.d();
                    } else if (vh0Var.H0 == null) {
                        rh0Var.c.o((s61) arrayList5.get(i12), (ImageLocation) arrayList6.get(i12), str, (ImageLocation) arrayList3.get(i12), vh0Var.H0, null, ((Integer) arrayList2.get(i12)).intValue(), sb2);
                    } else {
                        rh0Var.c.o((s61) arrayList5.get(i12), imageLocation3, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation4 == null || !(imageLocation4.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), sb2);
                    }
                    z4 = z10;
                    if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z4 : true) {
                    }
                    rh0Var.c.getImageReceiver().setDelegate(new th0(this));
                    rh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                    ph0 ph0Var2222 = rh0Var.c;
                    int i13222 = vh0Var.j1;
                    int i14222 = vh0Var.k1;
                    ph0Var2222.r(i13222, i13222, i14222, i14222);
                    rh0Var.c.setTag(Integer.valueOf(i11));
                    return rh0Var;
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
            sb3.append(vh0Var.B0);
            String sb22 = sb3.toString();
            if (bitmap == null) {
            }
            if (vh0Var.H0 == null) {
            }
            z4 = z10;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z4 : true) {
            }
            rh0Var.c.getImageReceiver().setDelegate(new th0(this));
            rh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            ph0 ph0Var22222 = rh0Var.c;
            int i132222 = vh0Var.j1;
            int i142222 = vh0Var.k1;
            ph0Var22222.r(i132222, i132222, i142222, i142222);
            rh0Var.c.setTag(Integer.valueOf(i11));
            return rh0Var;
        }
        i11 = k10;
        sparseArray = sparseArray2;
        z4 = false;
        if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z4 : true) {
        }
        rh0Var.c.getImageReceiver().setDelegate(new th0(this));
        rh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
        ph0 ph0Var222222 = rh0Var.c;
        int i1322222 = vh0Var.j1;
        int i1422222 = vh0Var.k1;
        ph0Var222222.r(i1322222, i1322222, i1422222, i1422222);
        rh0Var.c.setTag(Integer.valueOf(i11));
        return rh0Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        rh0 rh0Var = (rh0) obj;
        return rh0Var.a ? view == rh0Var.b : view == rh0Var.c;
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
        vh0 vh0Var = this.h;
        int size = vh0Var.U0.size();
        if (vh0Var.f1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = vh0Var.P0;
        int j10 = (j() * 2) + Math.max(dialogPhotos == null ? 0 : dialogPhotos.getCount(), size);
        for (int i11 = 0; i11 < j10; i11++) {
            arrayList2.add(new rh0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // org.telegram.ui.Components.tp
    public final int j() {
        vh0 vh0Var = this.h;
        int size = vh0Var.U0.size();
        if (vh0Var.f1) {
            size++;
        }
        if (size >= 2) {
            return vh0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
