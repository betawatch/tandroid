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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class mi0 extends iq {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public y9 g;
    public final /* synthetic */ ni0 h;

    public mi0(ni0 ni0Var, Context context, org.telegram.ui.wz0 wz0Var) {
        this.h = ni0Var;
        this.e = context;
        this.g = wz0Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // a5.a
    public final void a(a5.m mVar, Object obj) {
        ji0 ji0Var = (ji0) obj;
        View view = ji0Var.b;
        if (view != null) {
            mVar.removeView(view);
        }
        if (ji0Var.a) {
            return;
        }
        hi0 hi0Var = ji0Var.c;
        if (hi0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = hi0Var.getImageReceiver().getDrawable();
            if (drawable instanceof g6) {
                ((g6) drawable).w(hi0Var);
            }
        }
        hi0Var.setRoundRadius(0);
        mVar.removeView(hi0Var);
        hi0Var.getImageReceiver().cancelLoadImage();
    }

    @Override // a5.a
    public final int b() {
        return this.c.size();
    }

    @Override // a5.a
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((ji0) obj);
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
        ji0 ji0Var = (ji0) this.c.get(i10);
        int k10 = k(i10);
        ni0 ni0Var = this.h;
        boolean z12 = ni0Var.i1;
        SparseArray sparseArray2 = ni0Var.d1;
        ArrayList arrayList = ni0Var.b1;
        ArrayList arrayList2 = ni0Var.a1;
        ArrayList arrayList3 = ni0Var.X0;
        ArrayList arrayList4 = ni0Var.Y0;
        ArrayList arrayList5 = ni0Var.Z0;
        ArrayList arrayList6 = ni0Var.W0;
        Context context = this.e;
        if (z12 && k10 == 0) {
            ji0Var.a = true;
            if (ji0Var.b == null) {
                ji0Var.b = new ki0(context);
            }
            if (ji0Var.b.getParent() == null) {
                mVar.addView(ji0Var.b);
            }
            return ji0Var;
        }
        ji0Var.a = false;
        ki0 ki0Var = ji0Var.b;
        if (ki0Var != null && ki0Var.getParent() != null) {
            mVar.removeView(ji0Var.b);
        }
        if (ji0Var.c == null) {
            hi0 hi0Var = new hi0(ni0Var, context, i10, this.f);
            ji0Var.c = hi0Var;
            this.d.set(i10, hi0Var);
        }
        if (ji0Var.c.getParent() == null) {
            mVar.addView(ji0Var.c);
        }
        ji0Var.c.getImageReceiver().setAllowDecodeSingleFrame(true);
        int i12 = ni0Var.i1 ? k10 - 1 : k10;
        if (i12 != 0) {
            i11 = k10;
            sparseArray = sparseArray2;
            if (i12 >= 0 && i12 < arrayList6.size()) {
                ImageLocation imageLocation = (ImageLocation) arrayList6.get(i12);
                ji0Var.c.L = imageLocation != null;
                z10 = arrayList5.get(i12) == null;
                ImageLocation imageLocation2 = (ImageLocation) arrayList4.get(i12);
                ji0Var.c.o((d81) arrayList5.get(i12), imageLocation, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation2 == null || !(imageLocation2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), "avatar_" + ni0Var.E0);
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                }
                ji0Var.c.getImageReceiver().setDelegate(new li0(this));
                ji0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                hi0 hi0Var2 = ji0Var.c;
                int i13 = ni0Var.m1;
                int i14 = ni0Var.n1;
                hi0Var2.r(i13, i13, i14, i14);
                ji0Var.c.setTag(Integer.valueOf(i11));
                return ji0Var;
            }
            z10 = false;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            ji0Var.c.getImageReceiver().setDelegate(new li0(this));
            ji0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            hi0 hi0Var22 = ji0Var.c;
            int i132 = ni0Var.m1;
            int i142 = ni0Var.n1;
            hi0Var22.r(i132, i132, i142, i142);
            ji0Var.c.setTag(Integer.valueOf(i11));
            return ji0Var;
        }
        y9 y9Var = this.g;
        Drawable drawable = y9Var == null ? null : y9Var.getImageReceiver().getDrawable();
        if (drawable instanceof g6) {
            g6 g6Var = (g6) drawable;
            if (g6Var.s()) {
                ji0Var.c.setImageDrawable(drawable);
                g6Var.f(ji0Var.c);
                g6Var.R = true;
                i11 = k10;
                sparseArray = sparseArray2;
                z10 = false;
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    SparseArray sparseArray3 = sparseArray;
                    ji0Var.c.H = (RadialProgress2) sparseArray3.get(i12);
                    hi0 hi0Var3 = ji0Var.c;
                    if (hi0Var3.H == null) {
                        hi0Var3.H = new RadialProgress2(hi0Var3, null);
                        RadialProgress2 radialProgress2 = ji0Var.c.H;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        ji0Var.c.H.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i12, ji0Var.c.H);
                    }
                    if (ni0Var.g1) {
                        ni0Var.invalidate();
                    } else {
                        ni0Var.postInvalidateOnAnimation();
                    }
                }
                ji0Var.c.getImageReceiver().setDelegate(new li0(this));
                ji0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                hi0 hi0Var222 = ji0Var.c;
                int i1322 = ni0Var.m1;
                int i1422 = ni0Var.n1;
                hi0Var222.r(i1322, i1322, i1422, i1422);
                ji0Var.c.setTag(Integer.valueOf(i11));
                return ji0Var;
            }
        }
        if (i12 >= 0 && i12 < arrayList6.size()) {
            ImageLocation imageLocation3 = (ImageLocation) arrayList6.get(i12);
            ji0Var.c.L = imageLocation3 != null;
            boolean z13 = arrayList5.get(i12) == null;
            if (!ni0Var.J0 || imageLocation3 == null) {
                z11 = z13;
            } else {
                z11 = z13;
                if (imageLocation3.imageType == 2) {
                    str = "avatar";
                    ImageLocation imageLocation4 = (ImageLocation) arrayList4.get(i12);
                    y9 y9Var2 = this.g;
                    i11 = k10;
                    bitmap = (y9Var2 == null && ni0Var.e1) ? y9Var2.getImageReceiver().getBitmap() : null;
                    StringBuilder sb2 = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb2.append(ni0Var.E0);
                    String sb3 = sb2.toString();
                    if (bitmap == null && arrayList5.get(i12) == null) {
                        hi0 hi0Var4 = ji0Var.c;
                        ImageLocation imageLocation5 = (ImageLocation) arrayList6.get(i12);
                        ImageLocation imageLocation6 = (ImageLocation) arrayList3.get(i12);
                        int intValue = ((Integer) arrayList2.get(i12)).intValue();
                        hi0Var4.getClass();
                        hi0Var4.a.setImage(imageLocation5, str, imageLocation6, null, null, null, new BitmapDrawable((Resources) null, bitmap), intValue, null, sb3, 1);
                        hi0Var4.d();
                    } else if (ni0Var.K0 == null) {
                        ji0Var.c.o((d81) arrayList5.get(i12), (ImageLocation) arrayList6.get(i12), str, (ImageLocation) arrayList3.get(i12), ni0Var.K0, null, ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    } else {
                        ji0Var.c.o((d81) arrayList5.get(i12), imageLocation3, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation4 == null || !(imageLocation4.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    }
                    z10 = z11;
                    if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    }
                    ji0Var.c.getImageReceiver().setDelegate(new li0(this));
                    ji0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                    hi0 hi0Var2222 = ji0Var.c;
                    int i13222 = ni0Var.m1;
                    int i14222 = ni0Var.n1;
                    hi0Var2222.r(i13222, i13222, i14222, i14222);
                    ji0Var.c.setTag(Integer.valueOf(i11));
                    return ji0Var;
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
            sb22.append(ni0Var.E0);
            String sb32 = sb22.toString();
            if (bitmap == null) {
            }
            if (ni0Var.K0 == null) {
            }
            z10 = z11;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            ji0Var.c.getImageReceiver().setDelegate(new li0(this));
            ji0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            hi0 hi0Var22222 = ji0Var.c;
            int i132222 = ni0Var.m1;
            int i142222 = ni0Var.n1;
            hi0Var22222.r(i132222, i132222, i142222, i142222);
            ji0Var.c.setTag(Integer.valueOf(i11));
            return ji0Var;
        }
        i11 = k10;
        sparseArray = sparseArray2;
        z10 = false;
        if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
        }
        ji0Var.c.getImageReceiver().setDelegate(new li0(this));
        ji0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
        hi0 hi0Var222222 = ji0Var.c;
        int i1322222 = ni0Var.m1;
        int i1422222 = ni0Var.n1;
        hi0Var222222.r(i1322222, i1322222, i1422222, i1422222);
        ji0Var.c.setTag(Integer.valueOf(i11));
        return ji0Var;
    }

    @Override // a5.a
    public final boolean f(View view, Object obj) {
        ji0 ji0Var = (ji0) obj;
        return ji0Var.a ? view == ji0Var.b : view == ji0Var.c;
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
        ni0 ni0Var = this.h;
        int size = ni0Var.X0.size();
        if (ni0Var.i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = ni0Var.S0;
        int j10 = (j() * 2) + Math.max(dialogPhotos == null ? 0 : dialogPhotos.getCount(), size);
        for (int i11 = 0; i11 < j10; i11++) {
            arrayList2.add(new ji0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // org.telegram.ui.Components.iq
    public final int j() {
        ni0 ni0Var = this.h;
        int size = ni0Var.X0.size();
        if (ni0Var.i1) {
            size++;
        }
        if (size >= 2) {
            return ni0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
