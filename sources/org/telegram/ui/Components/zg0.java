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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zg0 extends lp {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public o9 g;
    public final /* synthetic */ ah0 h;

    public zg0(ah0 ah0Var, Context context, org.telegram.ui.iz0 iz0Var) {
        this.h = ah0Var;
        this.e = context;
        this.g = iz0Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // m2.a
    public final void a(m2.g gVar, Object obj) {
        wg0 wg0Var = (wg0) obj;
        View view = wg0Var.b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (wg0Var.a) {
            return;
        }
        ug0 ug0Var = wg0Var.c;
        if (ug0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = ug0Var.getImageReceiver().getDrawable();
            if (drawable instanceof x5) {
                ((x5) drawable).w(ug0Var);
            }
        }
        ug0Var.setRoundRadius(0);
        gVar.removeView(ug0Var);
        ug0Var.getImageReceiver().cancelLoadImage();
    }

    @Override // m2.a
    public final int b() {
        return this.c.size();
    }

    @Override // m2.a
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((wg0) obj);
        if (indexOf == -1) {
            return -2;
        }
        return indexOf;
    }

    @Override // m2.a
    public final CharSequence d(int i9) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k(i9) + 1);
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
    public final Object e(m2.g gVar, int i9) {
        int i10;
        SparseArray sparseArray;
        boolean z10;
        boolean z11;
        String str;
        Bitmap bitmap;
        wg0 wg0Var = (wg0) this.c.get(i9);
        int k10 = k(i9);
        ah0 ah0Var = this.h;
        boolean z12 = ah0Var.e1;
        SparseArray sparseArray2 = ah0Var.Z0;
        ArrayList arrayList = ah0Var.X0;
        ArrayList arrayList2 = ah0Var.W0;
        ArrayList arrayList3 = ah0Var.T0;
        ArrayList arrayList4 = ah0Var.U0;
        ArrayList arrayList5 = ah0Var.V0;
        ArrayList arrayList6 = ah0Var.S0;
        Context context = this.e;
        if (z12 && k10 == 0) {
            wg0Var.a = true;
            if (wg0Var.b == null) {
                wg0Var.b = new xg0(context);
            }
            if (wg0Var.b.getParent() == null) {
                gVar.addView(wg0Var.b);
            }
            return wg0Var;
        }
        wg0Var.a = false;
        xg0 xg0Var = wg0Var.b;
        if (xg0Var != null && xg0Var.getParent() != null) {
            gVar.removeView(wg0Var.b);
        }
        if (wg0Var.c == null) {
            ug0 ug0Var = new ug0(ah0Var, context, i9, this.f);
            wg0Var.c = ug0Var;
            this.d.set(i9, ug0Var);
        }
        if (wg0Var.c.getParent() == null) {
            gVar.addView(wg0Var.c);
        }
        wg0Var.c.getImageReceiver().setAllowDecodeSingleFrame(true);
        int i11 = ah0Var.e1 ? k10 - 1 : k10;
        if (i11 != 0) {
            i10 = k10;
            sparseArray = sparseArray2;
            if (i11 >= 0 && i11 < arrayList6.size()) {
                ImageLocation imageLocation = (ImageLocation) arrayList6.get(i11);
                wg0Var.c.H = imageLocation != null;
                z10 = arrayList5.get(i11) == null;
                ImageLocation imageLocation2 = (ImageLocation) arrayList4.get(i11);
                wg0Var.c.o((u51) arrayList5.get(i11), imageLocation, null, (ImageLocation) arrayList3.get(i11), (ImageLocation) arrayList4.get(i11), (imageLocation2 == null || !(imageLocation2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i11)).intValue(), "avatar_" + ah0Var.A0);
                if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
                }
                wg0Var.c.getImageReceiver().setDelegate(new yg0(this));
                wg0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                ug0 ug0Var2 = wg0Var.c;
                int i12 = ah0Var.i1;
                int i13 = ah0Var.j1;
                ug0Var2.r(i12, i12, i13, i13);
                wg0Var.c.setTag(Integer.valueOf(i10));
                return wg0Var;
            }
            z10 = false;
            if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
            }
            wg0Var.c.getImageReceiver().setDelegate(new yg0(this));
            wg0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            ug0 ug0Var22 = wg0Var.c;
            int i122 = ah0Var.i1;
            int i132 = ah0Var.j1;
            ug0Var22.r(i122, i122, i132, i132);
            wg0Var.c.setTag(Integer.valueOf(i10));
            return wg0Var;
        }
        o9 o9Var = this.g;
        Drawable drawable = o9Var == null ? null : o9Var.getImageReceiver().getDrawable();
        if (drawable instanceof x5) {
            x5 x5Var = (x5) drawable;
            if (x5Var.s()) {
                wg0Var.c.setImageDrawable(drawable);
                x5Var.f(wg0Var.c);
                x5Var.N = true;
                i10 = k10;
                sparseArray = sparseArray2;
                z10 = false;
                if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
                    SparseArray sparseArray3 = sparseArray;
                    wg0Var.c.D = (RadialProgress2) sparseArray3.get(i11);
                    ug0 ug0Var3 = wg0Var.c;
                    if (ug0Var3.D == null) {
                        ug0Var3.D = new RadialProgress2(ug0Var3, null);
                        RadialProgress2 radialProgress2 = wg0Var.c.D;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        wg0Var.c.D.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i11, wg0Var.c.D);
                    }
                    if (ah0Var.c1) {
                        ah0Var.invalidate();
                    } else {
                        ah0Var.postInvalidateOnAnimation();
                    }
                }
                wg0Var.c.getImageReceiver().setDelegate(new yg0(this));
                wg0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                ug0 ug0Var222 = wg0Var.c;
                int i1222 = ah0Var.i1;
                int i1322 = ah0Var.j1;
                ug0Var222.r(i1222, i1222, i1322, i1322);
                wg0Var.c.setTag(Integer.valueOf(i10));
                return wg0Var;
            }
        }
        if (i11 >= 0 && i11 < arrayList6.size()) {
            ImageLocation imageLocation3 = (ImageLocation) arrayList6.get(i11);
            wg0Var.c.H = imageLocation3 != null;
            boolean z13 = arrayList5.get(i11) == null;
            if (!ah0Var.F0 || imageLocation3 == null) {
                z11 = z13;
            } else {
                z11 = z13;
                if (imageLocation3.imageType == 2) {
                    str = "avatar";
                    ImageLocation imageLocation4 = (ImageLocation) arrayList4.get(i11);
                    o9 o9Var2 = this.g;
                    i10 = k10;
                    bitmap = (o9Var2 == null && ah0Var.a1) ? o9Var2.getImageReceiver().getBitmap() : null;
                    StringBuilder sb2 = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb2.append(ah0Var.A0);
                    String sb3 = sb2.toString();
                    if (bitmap == null && arrayList5.get(i11) == null) {
                        ug0 ug0Var4 = wg0Var.c;
                        ImageLocation imageLocation5 = (ImageLocation) arrayList6.get(i11);
                        ImageLocation imageLocation6 = (ImageLocation) arrayList3.get(i11);
                        int intValue = ((Integer) arrayList2.get(i11)).intValue();
                        ug0Var4.getClass();
                        ug0Var4.a.setImage(imageLocation5, str, imageLocation6, null, null, null, new BitmapDrawable((Resources) null, bitmap), intValue, null, sb3, 1);
                        ug0Var4.d();
                    } else if (ah0Var.G0 == null) {
                        wg0Var.c.o((u51) arrayList5.get(i11), (ImageLocation) arrayList6.get(i11), str, (ImageLocation) arrayList3.get(i11), ah0Var.G0, null, ((Integer) arrayList2.get(i11)).intValue(), sb3);
                    } else {
                        wg0Var.c.o((u51) arrayList5.get(i11), imageLocation3, null, (ImageLocation) arrayList3.get(i11), (ImageLocation) arrayList4.get(i11), (imageLocation4 == null || !(imageLocation4.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i11)).intValue(), sb3);
                    }
                    z10 = z11;
                    if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
                    }
                    wg0Var.c.getImageReceiver().setDelegate(new yg0(this));
                    wg0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                    ug0 ug0Var2222 = wg0Var.c;
                    int i12222 = ah0Var.i1;
                    int i13222 = ah0Var.j1;
                    ug0Var2222.r(i12222, i12222, i13222, i13222);
                    wg0Var.c.setTag(Integer.valueOf(i10));
                    return wg0Var;
                }
            }
            str = null;
            ImageLocation imageLocation42 = (ImageLocation) arrayList4.get(i11);
            o9 o9Var22 = this.g;
            i10 = k10;
            if (o9Var22 == null) {
            }
            StringBuilder sb22 = new StringBuilder("avatar_");
            sparseArray = sparseArray2;
            sb22.append(ah0Var.A0);
            String sb32 = sb22.toString();
            if (bitmap == null) {
            }
            if (ah0Var.G0 == null) {
            }
            z10 = z11;
            if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
            }
            wg0Var.c.getImageReceiver().setDelegate(new yg0(this));
            wg0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            ug0 ug0Var22222 = wg0Var.c;
            int i122222 = ah0Var.i1;
            int i132222 = ah0Var.j1;
            ug0Var22222.r(i122222, i122222, i132222, i132222);
            wg0Var.c.setTag(Integer.valueOf(i10));
            return wg0Var;
        }
        i10 = k10;
        sparseArray = sparseArray2;
        z10 = false;
        if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
        }
        wg0Var.c.getImageReceiver().setDelegate(new yg0(this));
        wg0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
        ug0 ug0Var222222 = wg0Var.c;
        int i1222222 = ah0Var.i1;
        int i1322222 = ah0Var.j1;
        ug0Var222222.r(i1222222, i1222222, i1322222, i1322222);
        wg0Var.c.setTag(Integer.valueOf(i10));
        return wg0Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        wg0 wg0Var = (wg0) obj;
        return wg0Var.a ? view == wg0Var.b : view == wg0Var.c;
    }

    @Override // m2.a
    public final void g() {
        ArrayList arrayList;
        int i9 = 0;
        while (true) {
            arrayList = this.d;
            if (i9 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i9) != null) {
                ((o9) arrayList.get(i9)).getImageReceiver().cancelLoadImage();
            }
            i9++;
        }
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList.clear();
        ah0 ah0Var = this.h;
        int size = ah0Var.T0.size();
        if (ah0Var.e1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = ah0Var.O0;
        int j10 = (j() * 2) + Math.max(dialogPhotos == null ? 0 : dialogPhotos.getCount(), size);
        for (int i10 = 0; i10 < j10; i10++) {
            arrayList2.add(new wg0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // org.telegram.ui.Components.lp
    public final int j() {
        ah0 ah0Var = this.h;
        int size = ah0Var.T0.size();
        if (ah0Var.e1) {
            size++;
        }
        if (size >= 2) {
            return ah0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
