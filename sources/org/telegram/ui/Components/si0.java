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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class si0 extends lq {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public y9 g;
    public final /* synthetic */ ti0 h;

    public si0(ti0 ti0Var, Context context, org.telegram.ui.l01 l01Var) {
        this.h = ti0Var;
        this.e = context;
        this.g = l01Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        pi0 pi0Var = (pi0) obj;
        View view = pi0Var.b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (pi0Var.a) {
            return;
        }
        ni0 ni0Var = pi0Var.c;
        if (ni0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = ni0Var.getImageReceiver().getDrawable();
            if (drawable instanceof f6) {
                ((f6) drawable).w(ni0Var);
            }
        }
        ni0Var.setRoundRadius(0);
        gVar.removeView(ni0Var);
        ni0Var.getImageReceiver().cancelLoadImage();
    }

    @Override // z4.a
    public final int b() {
        return this.c.size();
    }

    @Override // z4.a
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((pi0) obj);
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
        pi0 pi0Var = (pi0) this.c.get(i10);
        int k10 = k(i10);
        ti0 ti0Var = this.h;
        boolean z12 = ti0Var.i1;
        SparseArray sparseArray2 = ti0Var.d1;
        ArrayList arrayList = ti0Var.b1;
        ArrayList arrayList2 = ti0Var.a1;
        ArrayList arrayList3 = ti0Var.X0;
        ArrayList arrayList4 = ti0Var.Y0;
        ArrayList arrayList5 = ti0Var.Z0;
        ArrayList arrayList6 = ti0Var.W0;
        Context context = this.e;
        if (z12 && k10 == 0) {
            pi0Var.a = true;
            if (pi0Var.b == null) {
                pi0Var.b = new qi0(context);
            }
            if (pi0Var.b.getParent() == null) {
                gVar.addView(pi0Var.b);
            }
            return pi0Var;
        }
        pi0Var.a = false;
        qi0 qi0Var = pi0Var.b;
        if (qi0Var != null && qi0Var.getParent() != null) {
            gVar.removeView(pi0Var.b);
        }
        if (pi0Var.c == null) {
            ni0 ni0Var = new ni0(ti0Var, context, i10, this.f);
            pi0Var.c = ni0Var;
            this.d.set(i10, ni0Var);
        }
        if (pi0Var.c.getParent() == null) {
            gVar.addView(pi0Var.c);
        }
        pi0Var.c.getImageReceiver().setAllowDecodeSingleFrame(true);
        int i12 = ti0Var.i1 ? k10 - 1 : k10;
        if (i12 != 0) {
            i11 = k10;
            sparseArray = sparseArray2;
            if (i12 >= 0 && i12 < arrayList6.size()) {
                ImageLocation imageLocation = (ImageLocation) arrayList6.get(i12);
                pi0Var.c.L = imageLocation != null;
                z10 = arrayList5.get(i12) == null;
                ImageLocation imageLocation2 = (ImageLocation) arrayList4.get(i12);
                pi0Var.c.o((v71) arrayList5.get(i12), imageLocation, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation2 == null || !(imageLocation2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), "avatar_" + ti0Var.E0);
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                }
                pi0Var.c.getImageReceiver().setDelegate(new ri0(this));
                pi0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                ni0 ni0Var2 = pi0Var.c;
                int i13 = ti0Var.m1;
                int i14 = ti0Var.n1;
                ni0Var2.r(i13, i13, i14, i14);
                pi0Var.c.setTag(Integer.valueOf(i11));
                return pi0Var;
            }
            z10 = false;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            pi0Var.c.getImageReceiver().setDelegate(new ri0(this));
            pi0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            ni0 ni0Var22 = pi0Var.c;
            int i132 = ti0Var.m1;
            int i142 = ti0Var.n1;
            ni0Var22.r(i132, i132, i142, i142);
            pi0Var.c.setTag(Integer.valueOf(i11));
            return pi0Var;
        }
        y9 y9Var = this.g;
        Drawable drawable = y9Var == null ? null : y9Var.getImageReceiver().getDrawable();
        if (drawable instanceof f6) {
            f6 f6Var = (f6) drawable;
            if (f6Var.s()) {
                pi0Var.c.setImageDrawable(drawable);
                f6Var.f(pi0Var.c);
                f6Var.R = true;
                i11 = k10;
                sparseArray = sparseArray2;
                z10 = false;
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    SparseArray sparseArray3 = sparseArray;
                    pi0Var.c.H = (RadialProgress2) sparseArray3.get(i12);
                    ni0 ni0Var3 = pi0Var.c;
                    if (ni0Var3.H == null) {
                        ni0Var3.H = new RadialProgress2(ni0Var3, null);
                        RadialProgress2 radialProgress2 = pi0Var.c.H;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        pi0Var.c.H.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i12, pi0Var.c.H);
                    }
                    if (ti0Var.g1) {
                        ti0Var.invalidate();
                    } else {
                        ti0Var.postInvalidateOnAnimation();
                    }
                }
                pi0Var.c.getImageReceiver().setDelegate(new ri0(this));
                pi0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                ni0 ni0Var222 = pi0Var.c;
                int i1322 = ti0Var.m1;
                int i1422 = ti0Var.n1;
                ni0Var222.r(i1322, i1322, i1422, i1422);
                pi0Var.c.setTag(Integer.valueOf(i11));
                return pi0Var;
            }
        }
        if (i12 >= 0 && i12 < arrayList6.size()) {
            ImageLocation imageLocation3 = (ImageLocation) arrayList6.get(i12);
            pi0Var.c.L = imageLocation3 != null;
            boolean z13 = arrayList5.get(i12) == null;
            if (!ti0Var.J0 || imageLocation3 == null) {
                z11 = z13;
            } else {
                z11 = z13;
                if (imageLocation3.imageType == 2) {
                    str = "avatar";
                    ImageLocation imageLocation4 = (ImageLocation) arrayList4.get(i12);
                    y9 y9Var2 = this.g;
                    i11 = k10;
                    bitmap = (y9Var2 == null && ti0Var.e1) ? y9Var2.getImageReceiver().getBitmap() : null;
                    StringBuilder sb2 = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb2.append(ti0Var.E0);
                    String sb3 = sb2.toString();
                    if (bitmap == null && arrayList5.get(i12) == null) {
                        ni0 ni0Var4 = pi0Var.c;
                        ImageLocation imageLocation5 = (ImageLocation) arrayList6.get(i12);
                        ImageLocation imageLocation6 = (ImageLocation) arrayList3.get(i12);
                        int intValue = ((Integer) arrayList2.get(i12)).intValue();
                        ni0Var4.getClass();
                        ni0Var4.a.setImage(imageLocation5, str, imageLocation6, null, null, null, new BitmapDrawable((Resources) null, bitmap), intValue, null, sb3, 1);
                        ni0Var4.d();
                    } else if (ti0Var.K0 == null) {
                        pi0Var.c.o((v71) arrayList5.get(i12), (ImageLocation) arrayList6.get(i12), str, (ImageLocation) arrayList3.get(i12), ti0Var.K0, null, ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    } else {
                        pi0Var.c.o((v71) arrayList5.get(i12), imageLocation3, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation4 == null || !(imageLocation4.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    }
                    z10 = z11;
                    if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    }
                    pi0Var.c.getImageReceiver().setDelegate(new ri0(this));
                    pi0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                    ni0 ni0Var2222 = pi0Var.c;
                    int i13222 = ti0Var.m1;
                    int i14222 = ti0Var.n1;
                    ni0Var2222.r(i13222, i13222, i14222, i14222);
                    pi0Var.c.setTag(Integer.valueOf(i11));
                    return pi0Var;
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
            sb22.append(ti0Var.E0);
            String sb32 = sb22.toString();
            if (bitmap == null) {
            }
            if (ti0Var.K0 == null) {
            }
            z10 = z11;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            pi0Var.c.getImageReceiver().setDelegate(new ri0(this));
            pi0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            ni0 ni0Var22222 = pi0Var.c;
            int i132222 = ti0Var.m1;
            int i142222 = ti0Var.n1;
            ni0Var22222.r(i132222, i132222, i142222, i142222);
            pi0Var.c.setTag(Integer.valueOf(i11));
            return pi0Var;
        }
        i11 = k10;
        sparseArray = sparseArray2;
        z10 = false;
        if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
        }
        pi0Var.c.getImageReceiver().setDelegate(new ri0(this));
        pi0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
        ni0 ni0Var222222 = pi0Var.c;
        int i1322222 = ti0Var.m1;
        int i1422222 = ti0Var.n1;
        ni0Var222222.r(i1322222, i1322222, i1422222, i1422222);
        pi0Var.c.setTag(Integer.valueOf(i11));
        return pi0Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        pi0 pi0Var = (pi0) obj;
        return pi0Var.a ? view == pi0Var.b : view == pi0Var.c;
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
                ((y9) arrayList.get(i10)).getImageReceiver().cancelLoadImage();
            }
            i10++;
        }
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList.clear();
        ti0 ti0Var = this.h;
        int size = ti0Var.X0.size();
        if (ti0Var.i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = ti0Var.S0;
        int j3 = (j() * 2) + Math.max(dialogPhotos == null ? 0 : dialogPhotos.getCount(), size);
        for (int i11 = 0; i11 < j3; i11++) {
            arrayList2.add(new pi0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // org.telegram.ui.Components.lq
    public final int j() {
        ti0 ti0Var = this.h;
        int size = ti0Var.X0.size();
        if (ti0Var.i1) {
            size++;
        }
        if (size >= 2) {
            return ti0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
