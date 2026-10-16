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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class oi0 extends iq {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public z9 g;
    public final /* synthetic */ pi0 h;

    public oi0(pi0 pi0Var, Context context, org.telegram.ui.r01 r01Var) {
        this.h = pi0Var;
        this.e = context;
        this.g = r01Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        li0 li0Var = (li0) obj;
        View view = li0Var.b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (li0Var.a) {
            return;
        }
        ji0 ji0Var = li0Var.c;
        if (ji0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = ji0Var.getImageReceiver().getDrawable();
            if (drawable instanceof f6) {
                ((f6) drawable).w(ji0Var);
            }
        }
        ji0Var.setRoundRadius(0);
        gVar.removeView(ji0Var);
        ji0Var.getImageReceiver().cancelLoadImage();
    }

    @Override // z4.a
    public final int b() {
        return this.c.size();
    }

    @Override // z4.a
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((li0) obj);
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
        li0 li0Var = (li0) this.c.get(i10);
        int k10 = k(i10);
        pi0 pi0Var = this.h;
        boolean z12 = pi0Var.i1;
        SparseArray sparseArray2 = pi0Var.d1;
        ArrayList arrayList = pi0Var.b1;
        ArrayList arrayList2 = pi0Var.a1;
        ArrayList arrayList3 = pi0Var.X0;
        ArrayList arrayList4 = pi0Var.Y0;
        ArrayList arrayList5 = pi0Var.Z0;
        ArrayList arrayList6 = pi0Var.W0;
        Context context = this.e;
        if (z12 && k10 == 0) {
            li0Var.a = true;
            if (li0Var.b == null) {
                li0Var.b = new mi0(context);
            }
            if (li0Var.b.getParent() == null) {
                gVar.addView(li0Var.b);
            }
            return li0Var;
        }
        li0Var.a = false;
        mi0 mi0Var = li0Var.b;
        if (mi0Var != null && mi0Var.getParent() != null) {
            gVar.removeView(li0Var.b);
        }
        if (li0Var.c == null) {
            ji0 ji0Var = new ji0(pi0Var, context, i10, this.f);
            li0Var.c = ji0Var;
            this.d.set(i10, ji0Var);
        }
        if (li0Var.c.getParent() == null) {
            gVar.addView(li0Var.c);
        }
        li0Var.c.getImageReceiver().setAllowDecodeSingleFrame(true);
        int i12 = pi0Var.i1 ? k10 - 1 : k10;
        if (i12 != 0) {
            i11 = k10;
            sparseArray = sparseArray2;
            if (i12 >= 0 && i12 < arrayList6.size()) {
                ImageLocation imageLocation = (ImageLocation) arrayList6.get(i12);
                li0Var.c.L = imageLocation != null;
                z10 = arrayList5.get(i12) == null;
                ImageLocation imageLocation2 = (ImageLocation) arrayList4.get(i12);
                li0Var.c.o((t71) arrayList5.get(i12), imageLocation, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation2 == null || !(imageLocation2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), "avatar_" + pi0Var.E0);
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                }
                li0Var.c.getImageReceiver().setDelegate(new ni0(this));
                li0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                ji0 ji0Var2 = li0Var.c;
                int i13 = pi0Var.m1;
                int i14 = pi0Var.n1;
                ji0Var2.r(i13, i13, i14, i14);
                li0Var.c.setTag(Integer.valueOf(i11));
                return li0Var;
            }
            z10 = false;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            li0Var.c.getImageReceiver().setDelegate(new ni0(this));
            li0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            ji0 ji0Var22 = li0Var.c;
            int i132 = pi0Var.m1;
            int i142 = pi0Var.n1;
            ji0Var22.r(i132, i132, i142, i142);
            li0Var.c.setTag(Integer.valueOf(i11));
            return li0Var;
        }
        z9 z9Var = this.g;
        Drawable drawable = z9Var == null ? null : z9Var.getImageReceiver().getDrawable();
        if (drawable instanceof f6) {
            f6 f6Var = (f6) drawable;
            if (f6Var.s()) {
                li0Var.c.setImageDrawable(drawable);
                f6Var.f(li0Var.c);
                f6Var.R = true;
                i11 = k10;
                sparseArray = sparseArray2;
                z10 = false;
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    SparseArray sparseArray3 = sparseArray;
                    li0Var.c.H = (RadialProgress2) sparseArray3.get(i12);
                    ji0 ji0Var3 = li0Var.c;
                    if (ji0Var3.H == null) {
                        ji0Var3.H = new RadialProgress2(ji0Var3, null);
                        RadialProgress2 radialProgress2 = li0Var.c.H;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        li0Var.c.H.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i12, li0Var.c.H);
                    }
                    if (pi0Var.g1) {
                        pi0Var.invalidate();
                    } else {
                        pi0Var.postInvalidateOnAnimation();
                    }
                }
                li0Var.c.getImageReceiver().setDelegate(new ni0(this));
                li0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                ji0 ji0Var222 = li0Var.c;
                int i1322 = pi0Var.m1;
                int i1422 = pi0Var.n1;
                ji0Var222.r(i1322, i1322, i1422, i1422);
                li0Var.c.setTag(Integer.valueOf(i11));
                return li0Var;
            }
        }
        if (i12 >= 0 && i12 < arrayList6.size()) {
            ImageLocation imageLocation3 = (ImageLocation) arrayList6.get(i12);
            li0Var.c.L = imageLocation3 != null;
            boolean z13 = arrayList5.get(i12) == null;
            if (!pi0Var.J0 || imageLocation3 == null) {
                z11 = z13;
            } else {
                z11 = z13;
                if (imageLocation3.imageType == 2) {
                    str = "avatar";
                    ImageLocation imageLocation4 = (ImageLocation) arrayList4.get(i12);
                    z9 z9Var2 = this.g;
                    i11 = k10;
                    bitmap = (z9Var2 == null && pi0Var.e1) ? z9Var2.getImageReceiver().getBitmap() : null;
                    StringBuilder sb2 = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb2.append(pi0Var.E0);
                    String sb3 = sb2.toString();
                    if (bitmap == null && arrayList5.get(i12) == null) {
                        ji0 ji0Var4 = li0Var.c;
                        ImageLocation imageLocation5 = (ImageLocation) arrayList6.get(i12);
                        ImageLocation imageLocation6 = (ImageLocation) arrayList3.get(i12);
                        int intValue = ((Integer) arrayList2.get(i12)).intValue();
                        ji0Var4.getClass();
                        ji0Var4.a.setImage(imageLocation5, str, imageLocation6, null, null, null, new BitmapDrawable((Resources) null, bitmap), intValue, null, sb3, 1);
                        ji0Var4.d();
                    } else if (pi0Var.K0 == null) {
                        li0Var.c.o((t71) arrayList5.get(i12), (ImageLocation) arrayList6.get(i12), str, (ImageLocation) arrayList3.get(i12), pi0Var.K0, null, ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    } else {
                        li0Var.c.o((t71) arrayList5.get(i12), imageLocation3, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation4 == null || !(imageLocation4.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    }
                    z10 = z11;
                    if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    }
                    li0Var.c.getImageReceiver().setDelegate(new ni0(this));
                    li0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                    ji0 ji0Var2222 = li0Var.c;
                    int i13222 = pi0Var.m1;
                    int i14222 = pi0Var.n1;
                    ji0Var2222.r(i13222, i13222, i14222, i14222);
                    li0Var.c.setTag(Integer.valueOf(i11));
                    return li0Var;
                }
            }
            str = null;
            ImageLocation imageLocation42 = (ImageLocation) arrayList4.get(i12);
            z9 z9Var22 = this.g;
            i11 = k10;
            if (z9Var22 == null) {
            }
            StringBuilder sb22 = new StringBuilder("avatar_");
            sparseArray = sparseArray2;
            sb22.append(pi0Var.E0);
            String sb32 = sb22.toString();
            if (bitmap == null) {
            }
            if (pi0Var.K0 == null) {
            }
            z10 = z11;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            li0Var.c.getImageReceiver().setDelegate(new ni0(this));
            li0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            ji0 ji0Var22222 = li0Var.c;
            int i132222 = pi0Var.m1;
            int i142222 = pi0Var.n1;
            ji0Var22222.r(i132222, i132222, i142222, i142222);
            li0Var.c.setTag(Integer.valueOf(i11));
            return li0Var;
        }
        i11 = k10;
        sparseArray = sparseArray2;
        z10 = false;
        if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
        }
        li0Var.c.getImageReceiver().setDelegate(new ni0(this));
        li0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
        ji0 ji0Var222222 = li0Var.c;
        int i1322222 = pi0Var.m1;
        int i1422222 = pi0Var.n1;
        ji0Var222222.r(i1322222, i1322222, i1422222, i1422222);
        li0Var.c.setTag(Integer.valueOf(i11));
        return li0Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        li0 li0Var = (li0) obj;
        return li0Var.a ? view == li0Var.b : view == li0Var.c;
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
                ((z9) arrayList.get(i10)).getImageReceiver().cancelLoadImage();
            }
            i10++;
        }
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList.clear();
        pi0 pi0Var = this.h;
        int size = pi0Var.X0.size();
        if (pi0Var.i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = pi0Var.S0;
        int j10 = (j() * 2) + Math.max(dialogPhotos == null ? 0 : dialogPhotos.getCount(), size);
        for (int i11 = 0; i11 < j10; i11++) {
            arrayList2.add(new li0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // org.telegram.ui.Components.iq
    public final int j() {
        pi0 pi0Var = this.h;
        int size = pi0Var.X0.size();
        if (pi0Var.i1) {
            size++;
        }
        if (size >= 2) {
            return pi0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
