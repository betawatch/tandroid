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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class vh0 extends sp {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public p9 g;
    public final /* synthetic */ wh0 h;

    public vh0(wh0 wh0Var, Context context, org.telegram.ui.a01 a01Var) {
        this.h = wh0Var;
        this.e = context;
        this.g = a01Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // m2.a
    public final void a(m2.h hVar, Object obj) {
        sh0 sh0Var = (sh0) obj;
        View view = sh0Var.b;
        if (view != null) {
            hVar.removeView(view);
        }
        if (sh0Var.a) {
            return;
        }
        qh0 qh0Var = sh0Var.c;
        if (qh0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = qh0Var.getImageReceiver().getDrawable();
            if (drawable instanceof y5) {
                ((y5) drawable).w(qh0Var);
            }
        }
        qh0Var.setRoundRadius(0);
        hVar.removeView(qh0Var);
        qh0Var.getImageReceiver().cancelLoadImage();
    }

    @Override // m2.a
    public final int b() {
        return this.c.size();
    }

    @Override // m2.a
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((sh0) obj);
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
        sh0 sh0Var = (sh0) this.c.get(i10);
        int k10 = k(i10);
        wh0 wh0Var = this.h;
        boolean z11 = wh0Var.f1;
        SparseArray sparseArray2 = wh0Var.a1;
        ArrayList arrayList = wh0Var.Y0;
        ArrayList arrayList2 = wh0Var.X0;
        ArrayList arrayList3 = wh0Var.U0;
        ArrayList arrayList4 = wh0Var.V0;
        ArrayList arrayList5 = wh0Var.W0;
        ArrayList arrayList6 = wh0Var.T0;
        Context context = this.e;
        if (z11 && k10 == 0) {
            sh0Var.a = true;
            if (sh0Var.b == null) {
                sh0Var.b = new th0(context);
            }
            if (sh0Var.b.getParent() == null) {
                hVar.addView(sh0Var.b);
            }
            return sh0Var;
        }
        sh0Var.a = false;
        th0 th0Var = sh0Var.b;
        if (th0Var != null && th0Var.getParent() != null) {
            hVar.removeView(sh0Var.b);
        }
        if (sh0Var.c == null) {
            qh0 qh0Var = new qh0(wh0Var, context, i10, this.f);
            sh0Var.c = qh0Var;
            this.d.set(i10, qh0Var);
        }
        if (sh0Var.c.getParent() == null) {
            hVar.addView(sh0Var.c);
        }
        sh0Var.c.getImageReceiver().setAllowDecodeSingleFrame(true);
        int i12 = wh0Var.f1 ? k10 - 1 : k10;
        if (i12 != 0) {
            i11 = k10;
            sparseArray = sparseArray2;
            if (i12 >= 0 && i12 < arrayList6.size()) {
                ImageLocation imageLocation = (ImageLocation) arrayList6.get(i12);
                sh0Var.c.I = imageLocation != null;
                z4 = arrayList5.get(i12) == null;
                ImageLocation imageLocation2 = (ImageLocation) arrayList4.get(i12);
                sh0Var.c.o((s61) arrayList5.get(i12), imageLocation, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation2 == null || !(imageLocation2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), "avatar_" + wh0Var.B0);
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z4 : true) {
                }
                sh0Var.c.getImageReceiver().setDelegate(new uh0(this));
                sh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                qh0 qh0Var2 = sh0Var.c;
                int i13 = wh0Var.j1;
                int i14 = wh0Var.k1;
                qh0Var2.r(i13, i13, i14, i14);
                sh0Var.c.setTag(Integer.valueOf(i11));
                return sh0Var;
            }
            z4 = false;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z4 : true) {
            }
            sh0Var.c.getImageReceiver().setDelegate(new uh0(this));
            sh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            qh0 qh0Var22 = sh0Var.c;
            int i132 = wh0Var.j1;
            int i142 = wh0Var.k1;
            qh0Var22.r(i132, i132, i142, i142);
            sh0Var.c.setTag(Integer.valueOf(i11));
            return sh0Var;
        }
        p9 p9Var = this.g;
        Drawable drawable = p9Var == null ? null : p9Var.getImageReceiver().getDrawable();
        if (drawable instanceof y5) {
            y5 y5Var = (y5) drawable;
            if (y5Var.s()) {
                sh0Var.c.setImageDrawable(drawable);
                y5Var.f(sh0Var.c);
                y5Var.O = true;
                i11 = k10;
                sparseArray = sparseArray2;
                z4 = false;
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z4 : true) {
                    SparseArray sparseArray3 = sparseArray;
                    sh0Var.c.E = (RadialProgress2) sparseArray3.get(i12);
                    qh0 qh0Var3 = sh0Var.c;
                    if (qh0Var3.E == null) {
                        qh0Var3.E = new RadialProgress2(qh0Var3, null);
                        RadialProgress2 radialProgress2 = sh0Var.c.E;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        sh0Var.c.E.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i12, sh0Var.c.E);
                    }
                    if (wh0Var.d1) {
                        wh0Var.invalidate();
                    } else {
                        wh0Var.postInvalidateOnAnimation();
                    }
                }
                sh0Var.c.getImageReceiver().setDelegate(new uh0(this));
                sh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                qh0 qh0Var222 = sh0Var.c;
                int i1322 = wh0Var.j1;
                int i1422 = wh0Var.k1;
                qh0Var222.r(i1322, i1322, i1422, i1422);
                sh0Var.c.setTag(Integer.valueOf(i11));
                return sh0Var;
            }
        }
        if (i12 >= 0 && i12 < arrayList6.size()) {
            ImageLocation imageLocation3 = (ImageLocation) arrayList6.get(i12);
            sh0Var.c.I = imageLocation3 != null;
            boolean z12 = arrayList5.get(i12) == null;
            if (!wh0Var.G0 || imageLocation3 == null) {
                z10 = z12;
            } else {
                z10 = z12;
                if (imageLocation3.imageType == 2) {
                    str = "avatar";
                    ImageLocation imageLocation4 = (ImageLocation) arrayList4.get(i12);
                    p9 p9Var2 = this.g;
                    i11 = k10;
                    bitmap = (p9Var2 == null && wh0Var.b1) ? p9Var2.getImageReceiver().getBitmap() : null;
                    StringBuilder sb = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb.append(wh0Var.B0);
                    String sb2 = sb.toString();
                    if (bitmap == null && arrayList5.get(i12) == null) {
                        qh0 qh0Var4 = sh0Var.c;
                        ImageLocation imageLocation5 = (ImageLocation) arrayList6.get(i12);
                        ImageLocation imageLocation6 = (ImageLocation) arrayList3.get(i12);
                        int intValue = ((Integer) arrayList2.get(i12)).intValue();
                        qh0Var4.getClass();
                        qh0Var4.a.setImage(imageLocation5, str, imageLocation6, null, null, null, new BitmapDrawable((Resources) null, bitmap), intValue, null, sb2, 1);
                        qh0Var4.d();
                    } else if (wh0Var.H0 == null) {
                        sh0Var.c.o((s61) arrayList5.get(i12), (ImageLocation) arrayList6.get(i12), str, (ImageLocation) arrayList3.get(i12), wh0Var.H0, null, ((Integer) arrayList2.get(i12)).intValue(), sb2);
                    } else {
                        sh0Var.c.o((s61) arrayList5.get(i12), imageLocation3, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation4 == null || !(imageLocation4.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), sb2);
                    }
                    z4 = z10;
                    if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z4 : true) {
                    }
                    sh0Var.c.getImageReceiver().setDelegate(new uh0(this));
                    sh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                    qh0 qh0Var2222 = sh0Var.c;
                    int i13222 = wh0Var.j1;
                    int i14222 = wh0Var.k1;
                    qh0Var2222.r(i13222, i13222, i14222, i14222);
                    sh0Var.c.setTag(Integer.valueOf(i11));
                    return sh0Var;
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
            sb3.append(wh0Var.B0);
            String sb22 = sb3.toString();
            if (bitmap == null) {
            }
            if (wh0Var.H0 == null) {
            }
            z4 = z10;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z4 : true) {
            }
            sh0Var.c.getImageReceiver().setDelegate(new uh0(this));
            sh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            qh0 qh0Var22222 = sh0Var.c;
            int i132222 = wh0Var.j1;
            int i142222 = wh0Var.k1;
            qh0Var22222.r(i132222, i132222, i142222, i142222);
            sh0Var.c.setTag(Integer.valueOf(i11));
            return sh0Var;
        }
        i11 = k10;
        sparseArray = sparseArray2;
        z4 = false;
        if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z4 : true) {
        }
        sh0Var.c.getImageReceiver().setDelegate(new uh0(this));
        sh0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
        qh0 qh0Var222222 = sh0Var.c;
        int i1322222 = wh0Var.j1;
        int i1422222 = wh0Var.k1;
        qh0Var222222.r(i1322222, i1322222, i1422222, i1422222);
        sh0Var.c.setTag(Integer.valueOf(i11));
        return sh0Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        sh0 sh0Var = (sh0) obj;
        return sh0Var.a ? view == sh0Var.b : view == sh0Var.c;
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
        wh0 wh0Var = this.h;
        int size = wh0Var.U0.size();
        if (wh0Var.f1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = wh0Var.P0;
        int j10 = (j() * 2) + Math.max(dialogPhotos == null ? 0 : dialogPhotos.getCount(), size);
        for (int i11 = 0; i11 < j10; i11++) {
            arrayList2.add(new sh0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // org.telegram.ui.Components.sp
    public final int j() {
        wh0 wh0Var = this.h;
        int size = wh0Var.U0.size();
        if (wh0Var.f1) {
            size++;
        }
        if (size >= 2) {
            return wh0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
