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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jh0 extends pp {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public t9 g;
    public final /* synthetic */ kh0 h;

    public jh0(kh0 kh0Var, Context context, org.telegram.ui.iz0 iz0Var) {
        this.h = kh0Var;
        this.e = context;
        this.g = iz0Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // m2.a
    public final void a(m2.g gVar, Object obj) {
        gh0 gh0Var = (gh0) obj;
        View view = gh0Var.b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (gh0Var.a) {
            return;
        }
        eh0 eh0Var = gh0Var.c;
        if (eh0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = eh0Var.getImageReceiver().getDrawable();
            if (drawable instanceof c6) {
                ((c6) drawable).w(eh0Var);
            }
        }
        eh0Var.setRoundRadius(0);
        gVar.removeView(eh0Var);
        eh0Var.getImageReceiver().cancelLoadImage();
    }

    @Override // m2.a
    public final int b() {
        return this.c.size();
    }

    @Override // m2.a
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((gh0) obj);
        if (indexOf == -1) {
            return -2;
        }
        return indexOf;
    }

    @Override // m2.a
    public final CharSequence d(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k(i10) + 1);
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
    public final Object e(m2.g gVar, int i10) {
        int i11;
        SparseArray sparseArray;
        boolean z10;
        boolean z11;
        String str;
        Bitmap bitmap;
        gh0 gh0Var = (gh0) this.c.get(i10);
        int k9 = k(i10);
        kh0 kh0Var = this.h;
        boolean z12 = kh0Var.e1;
        SparseArray sparseArray2 = kh0Var.Z0;
        ArrayList arrayList = kh0Var.X0;
        ArrayList arrayList2 = kh0Var.W0;
        ArrayList arrayList3 = kh0Var.T0;
        ArrayList arrayList4 = kh0Var.U0;
        ArrayList arrayList5 = kh0Var.V0;
        ArrayList arrayList6 = kh0Var.S0;
        Context context = this.e;
        if (z12 && k9 == 0) {
            gh0Var.a = true;
            if (gh0Var.b == null) {
                gh0Var.b = new hh0(context);
            }
            if (gh0Var.b.getParent() == null) {
                gVar.addView(gh0Var.b);
            }
            return gh0Var;
        }
        gh0Var.a = false;
        hh0 hh0Var = gh0Var.b;
        if (hh0Var != null && hh0Var.getParent() != null) {
            gVar.removeView(gh0Var.b);
        }
        if (gh0Var.c == null) {
            eh0 eh0Var = new eh0(kh0Var, context, i10, this.f);
            gh0Var.c = eh0Var;
            this.d.set(i10, eh0Var);
        }
        if (gh0Var.c.getParent() == null) {
            gVar.addView(gh0Var.c);
        }
        gh0Var.c.getImageReceiver().setAllowDecodeSingleFrame(true);
        int i12 = kh0Var.e1 ? k9 - 1 : k9;
        if (i12 != 0) {
            i11 = k9;
            sparseArray = sparseArray2;
            if (i12 >= 0 && i12 < arrayList6.size()) {
                ImageLocation imageLocation = (ImageLocation) arrayList6.get(i12);
                gh0Var.c.H = imageLocation != null;
                z10 = arrayList5.get(i12) == null;
                ImageLocation imageLocation2 = (ImageLocation) arrayList4.get(i12);
                gh0Var.c.o((h61) arrayList5.get(i12), imageLocation, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation2 == null || !(imageLocation2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), "avatar_" + kh0Var.A0);
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                }
                gh0Var.c.getImageReceiver().setDelegate(new ih0(this));
                gh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                eh0 eh0Var2 = gh0Var.c;
                int i13 = kh0Var.i1;
                int i14 = kh0Var.j1;
                eh0Var2.r(i13, i13, i14, i14);
                gh0Var.c.setTag(Integer.valueOf(i11));
                return gh0Var;
            }
            z10 = false;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            gh0Var.c.getImageReceiver().setDelegate(new ih0(this));
            gh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            eh0 eh0Var22 = gh0Var.c;
            int i132 = kh0Var.i1;
            int i142 = kh0Var.j1;
            eh0Var22.r(i132, i132, i142, i142);
            gh0Var.c.setTag(Integer.valueOf(i11));
            return gh0Var;
        }
        t9 t9Var = this.g;
        Drawable drawable = t9Var == null ? null : t9Var.getImageReceiver().getDrawable();
        if (drawable instanceof c6) {
            c6 c6Var = (c6) drawable;
            if (c6Var.s()) {
                gh0Var.c.setImageDrawable(drawable);
                c6Var.f(gh0Var.c);
                c6Var.N = true;
                i11 = k9;
                sparseArray = sparseArray2;
                z10 = false;
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    SparseArray sparseArray3 = sparseArray;
                    gh0Var.c.D = (RadialProgress2) sparseArray3.get(i12);
                    eh0 eh0Var3 = gh0Var.c;
                    if (eh0Var3.D == null) {
                        eh0Var3.D = new RadialProgress2(eh0Var3, null);
                        RadialProgress2 radialProgress2 = gh0Var.c.D;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        gh0Var.c.D.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i12, gh0Var.c.D);
                    }
                    if (kh0Var.c1) {
                        kh0Var.invalidate();
                    } else {
                        kh0Var.postInvalidateOnAnimation();
                    }
                }
                gh0Var.c.getImageReceiver().setDelegate(new ih0(this));
                gh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                eh0 eh0Var222 = gh0Var.c;
                int i1322 = kh0Var.i1;
                int i1422 = kh0Var.j1;
                eh0Var222.r(i1322, i1322, i1422, i1422);
                gh0Var.c.setTag(Integer.valueOf(i11));
                return gh0Var;
            }
        }
        if (i12 >= 0 && i12 < arrayList6.size()) {
            ImageLocation imageLocation3 = (ImageLocation) arrayList6.get(i12);
            gh0Var.c.H = imageLocation3 != null;
            boolean z13 = arrayList5.get(i12) == null;
            if (!kh0Var.F0 || imageLocation3 == null) {
                z11 = z13;
            } else {
                z11 = z13;
                if (imageLocation3.imageType == 2) {
                    str = "avatar";
                    ImageLocation imageLocation4 = (ImageLocation) arrayList4.get(i12);
                    t9 t9Var2 = this.g;
                    i11 = k9;
                    bitmap = (t9Var2 == null && kh0Var.a1) ? t9Var2.getImageReceiver().getBitmap() : null;
                    StringBuilder sb2 = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb2.append(kh0Var.A0);
                    String sb3 = sb2.toString();
                    if (bitmap == null && arrayList5.get(i12) == null) {
                        eh0 eh0Var4 = gh0Var.c;
                        ImageLocation imageLocation5 = (ImageLocation) arrayList6.get(i12);
                        ImageLocation imageLocation6 = (ImageLocation) arrayList3.get(i12);
                        int intValue = ((Integer) arrayList2.get(i12)).intValue();
                        eh0Var4.getClass();
                        eh0Var4.a.setImage(imageLocation5, str, imageLocation6, null, null, null, new BitmapDrawable((Resources) null, bitmap), intValue, null, sb3, 1);
                        eh0Var4.d();
                    } else if (kh0Var.G0 == null) {
                        gh0Var.c.o((h61) arrayList5.get(i12), (ImageLocation) arrayList6.get(i12), str, (ImageLocation) arrayList3.get(i12), kh0Var.G0, null, ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    } else {
                        gh0Var.c.o((h61) arrayList5.get(i12), imageLocation3, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation4 == null || !(imageLocation4.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    }
                    z10 = z11;
                    if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    }
                    gh0Var.c.getImageReceiver().setDelegate(new ih0(this));
                    gh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                    eh0 eh0Var2222 = gh0Var.c;
                    int i13222 = kh0Var.i1;
                    int i14222 = kh0Var.j1;
                    eh0Var2222.r(i13222, i13222, i14222, i14222);
                    gh0Var.c.setTag(Integer.valueOf(i11));
                    return gh0Var;
                }
            }
            str = null;
            ImageLocation imageLocation42 = (ImageLocation) arrayList4.get(i12);
            t9 t9Var22 = this.g;
            i11 = k9;
            if (t9Var22 == null) {
            }
            StringBuilder sb22 = new StringBuilder("avatar_");
            sparseArray = sparseArray2;
            sb22.append(kh0Var.A0);
            String sb32 = sb22.toString();
            if (bitmap == null) {
            }
            if (kh0Var.G0 == null) {
            }
            z10 = z11;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            gh0Var.c.getImageReceiver().setDelegate(new ih0(this));
            gh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            eh0 eh0Var22222 = gh0Var.c;
            int i132222 = kh0Var.i1;
            int i142222 = kh0Var.j1;
            eh0Var22222.r(i132222, i132222, i142222, i142222);
            gh0Var.c.setTag(Integer.valueOf(i11));
            return gh0Var;
        }
        i11 = k9;
        sparseArray = sparseArray2;
        z10 = false;
        if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
        }
        gh0Var.c.getImageReceiver().setDelegate(new ih0(this));
        gh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
        eh0 eh0Var222222 = gh0Var.c;
        int i1322222 = kh0Var.i1;
        int i1422222 = kh0Var.j1;
        eh0Var222222.r(i1322222, i1322222, i1422222, i1422222);
        gh0Var.c.setTag(Integer.valueOf(i11));
        return gh0Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        gh0 gh0Var = (gh0) obj;
        return gh0Var.a ? view == gh0Var.b : view == gh0Var.c;
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
                ((t9) arrayList.get(i10)).getImageReceiver().cancelLoadImage();
            }
            i10++;
        }
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList.clear();
        kh0 kh0Var = this.h;
        int size = kh0Var.T0.size();
        if (kh0Var.e1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = kh0Var.O0;
        int j10 = (j() * 2) + Math.max(dialogPhotos == null ? 0 : dialogPhotos.getCount(), size);
        for (int i11 = 0; i11 < j10; i11++) {
            arrayList2.add(new gh0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // org.telegram.ui.Components.pp
    public final int j() {
        kh0 kh0Var = this.h;
        int size = kh0Var.T0.size();
        if (kh0Var.e1) {
            size++;
        }
        if (size >= 2) {
            return kh0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
