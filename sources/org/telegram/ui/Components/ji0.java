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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ji0 extends fq {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public w9 g;
    public final /* synthetic */ ki0 h;

    public ji0(ki0 ki0Var, Context context, org.telegram.ui.oz0 oz0Var) {
        this.h = ki0Var;
        this.e = context;
        this.g = oz0Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        gi0 gi0Var = (gi0) obj;
        View view = gi0Var.b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (gi0Var.a) {
            return;
        }
        ei0 ei0Var = gi0Var.c;
        if (ei0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = ei0Var.getImageReceiver().getDrawable();
            if (drawable instanceof e6) {
                ((e6) drawable).w(ei0Var);
            }
        }
        ei0Var.setRoundRadius(0);
        gVar.removeView(ei0Var);
        ei0Var.getImageReceiver().cancelLoadImage();
    }

    @Override // z4.a
    public final int b() {
        return this.c.size();
    }

    @Override // z4.a
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((gi0) obj);
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
        gi0 gi0Var = (gi0) this.c.get(i10);
        int k10 = k(i10);
        ki0 ki0Var = this.h;
        boolean z12 = ki0Var.i1;
        SparseArray sparseArray2 = ki0Var.d1;
        ArrayList arrayList = ki0Var.b1;
        ArrayList arrayList2 = ki0Var.a1;
        ArrayList arrayList3 = ki0Var.X0;
        ArrayList arrayList4 = ki0Var.Y0;
        ArrayList arrayList5 = ki0Var.Z0;
        ArrayList arrayList6 = ki0Var.W0;
        Context context = this.e;
        if (z12 && k10 == 0) {
            gi0Var.a = true;
            if (gi0Var.b == null) {
                gi0Var.b = new hi0(context);
            }
            if (gi0Var.b.getParent() == null) {
                gVar.addView(gi0Var.b);
            }
            return gi0Var;
        }
        gi0Var.a = false;
        hi0 hi0Var = gi0Var.b;
        if (hi0Var != null && hi0Var.getParent() != null) {
            gVar.removeView(gi0Var.b);
        }
        if (gi0Var.c == null) {
            ei0 ei0Var = new ei0(ki0Var, context, i10, this.f);
            gi0Var.c = ei0Var;
            this.d.set(i10, ei0Var);
        }
        if (gi0Var.c.getParent() == null) {
            gVar.addView(gi0Var.c);
        }
        gi0Var.c.getImageReceiver().setAllowDecodeSingleFrame(true);
        int i12 = ki0Var.i1 ? k10 - 1 : k10;
        if (i12 != 0) {
            i11 = k10;
            sparseArray = sparseArray2;
            if (i12 >= 0 && i12 < arrayList6.size()) {
                ImageLocation imageLocation = (ImageLocation) arrayList6.get(i12);
                gi0Var.c.L = imageLocation != null;
                z10 = arrayList5.get(i12) == null;
                ImageLocation imageLocation2 = (ImageLocation) arrayList4.get(i12);
                gi0Var.c.o((m71) arrayList5.get(i12), imageLocation, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation2 == null || !(imageLocation2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), "avatar_" + ki0Var.E0);
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                }
                gi0Var.c.getImageReceiver().setDelegate(new ii0(this));
                gi0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                ei0 ei0Var2 = gi0Var.c;
                int i13 = ki0Var.m1;
                int i14 = ki0Var.n1;
                ei0Var2.r(i13, i13, i14, i14);
                gi0Var.c.setTag(Integer.valueOf(i11));
                return gi0Var;
            }
            z10 = false;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            gi0Var.c.getImageReceiver().setDelegate(new ii0(this));
            gi0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            ei0 ei0Var22 = gi0Var.c;
            int i132 = ki0Var.m1;
            int i142 = ki0Var.n1;
            ei0Var22.r(i132, i132, i142, i142);
            gi0Var.c.setTag(Integer.valueOf(i11));
            return gi0Var;
        }
        w9 w9Var = this.g;
        Drawable drawable = w9Var == null ? null : w9Var.getImageReceiver().getDrawable();
        if (drawable instanceof e6) {
            e6 e6Var = (e6) drawable;
            if (e6Var.s()) {
                gi0Var.c.setImageDrawable(drawable);
                e6Var.f(gi0Var.c);
                e6Var.R = true;
                i11 = k10;
                sparseArray = sparseArray2;
                z10 = false;
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    SparseArray sparseArray3 = sparseArray;
                    gi0Var.c.H = (RadialProgress2) sparseArray3.get(i12);
                    ei0 ei0Var3 = gi0Var.c;
                    if (ei0Var3.H == null) {
                        ei0Var3.H = new RadialProgress2(ei0Var3, null);
                        RadialProgress2 radialProgress2 = gi0Var.c.H;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        gi0Var.c.H.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i12, gi0Var.c.H);
                    }
                    if (ki0Var.g1) {
                        ki0Var.invalidate();
                    } else {
                        ki0Var.postInvalidateOnAnimation();
                    }
                }
                gi0Var.c.getImageReceiver().setDelegate(new ii0(this));
                gi0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                ei0 ei0Var222 = gi0Var.c;
                int i1322 = ki0Var.m1;
                int i1422 = ki0Var.n1;
                ei0Var222.r(i1322, i1322, i1422, i1422);
                gi0Var.c.setTag(Integer.valueOf(i11));
                return gi0Var;
            }
        }
        if (i12 >= 0 && i12 < arrayList6.size()) {
            ImageLocation imageLocation3 = (ImageLocation) arrayList6.get(i12);
            gi0Var.c.L = imageLocation3 != null;
            boolean z13 = arrayList5.get(i12) == null;
            if (!ki0Var.J0 || imageLocation3 == null) {
                z11 = z13;
            } else {
                z11 = z13;
                if (imageLocation3.imageType == 2) {
                    str = "avatar";
                    ImageLocation imageLocation4 = (ImageLocation) arrayList4.get(i12);
                    w9 w9Var2 = this.g;
                    i11 = k10;
                    bitmap = (w9Var2 == null && ki0Var.e1) ? w9Var2.getImageReceiver().getBitmap() : null;
                    StringBuilder sb2 = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb2.append(ki0Var.E0);
                    String sb3 = sb2.toString();
                    if (bitmap == null && arrayList5.get(i12) == null) {
                        ei0 ei0Var4 = gi0Var.c;
                        ImageLocation imageLocation5 = (ImageLocation) arrayList6.get(i12);
                        ImageLocation imageLocation6 = (ImageLocation) arrayList3.get(i12);
                        int intValue = ((Integer) arrayList2.get(i12)).intValue();
                        ei0Var4.getClass();
                        ei0Var4.a.setImage(imageLocation5, str, imageLocation6, null, null, null, new BitmapDrawable((Resources) null, bitmap), intValue, null, sb3, 1);
                        ei0Var4.d();
                    } else if (ki0Var.K0 == null) {
                        gi0Var.c.o((m71) arrayList5.get(i12), (ImageLocation) arrayList6.get(i12), str, (ImageLocation) arrayList3.get(i12), ki0Var.K0, null, ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    } else {
                        gi0Var.c.o((m71) arrayList5.get(i12), imageLocation3, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation4 == null || !(imageLocation4.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    }
                    z10 = z11;
                    if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    }
                    gi0Var.c.getImageReceiver().setDelegate(new ii0(this));
                    gi0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                    ei0 ei0Var2222 = gi0Var.c;
                    int i13222 = ki0Var.m1;
                    int i14222 = ki0Var.n1;
                    ei0Var2222.r(i13222, i13222, i14222, i14222);
                    gi0Var.c.setTag(Integer.valueOf(i11));
                    return gi0Var;
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
            sb22.append(ki0Var.E0);
            String sb32 = sb22.toString();
            if (bitmap == null) {
            }
            if (ki0Var.K0 == null) {
            }
            z10 = z11;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            gi0Var.c.getImageReceiver().setDelegate(new ii0(this));
            gi0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            ei0 ei0Var22222 = gi0Var.c;
            int i132222 = ki0Var.m1;
            int i142222 = ki0Var.n1;
            ei0Var22222.r(i132222, i132222, i142222, i142222);
            gi0Var.c.setTag(Integer.valueOf(i11));
            return gi0Var;
        }
        i11 = k10;
        sparseArray = sparseArray2;
        z10 = false;
        if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
        }
        gi0Var.c.getImageReceiver().setDelegate(new ii0(this));
        gi0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
        ei0 ei0Var222222 = gi0Var.c;
        int i1322222 = ki0Var.m1;
        int i1422222 = ki0Var.n1;
        ei0Var222222.r(i1322222, i1322222, i1422222, i1422222);
        gi0Var.c.setTag(Integer.valueOf(i11));
        return gi0Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        gi0 gi0Var = (gi0) obj;
        return gi0Var.a ? view == gi0Var.b : view == gi0Var.c;
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
        ki0 ki0Var = this.h;
        int size = ki0Var.X0.size();
        if (ki0Var.i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = ki0Var.S0;
        int j10 = (j() * 2) + Math.max(dialogPhotos == null ? 0 : dialogPhotos.getCount(), size);
        for (int i11 = 0; i11 < j10; i11++) {
            arrayList2.add(new gi0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // org.telegram.ui.Components.fq
    public final int j() {
        ki0 ki0Var = this.h;
        int size = ki0Var.X0.size();
        if (ki0Var.i1) {
            size++;
        }
        if (size >= 2) {
            return ki0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
