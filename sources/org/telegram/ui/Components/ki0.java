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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ki0 extends fq {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public w9 g;
    public final /* synthetic */ li0 h;

    public ki0(li0 li0Var, Context context, org.telegram.ui.oz0 oz0Var) {
        this.h = li0Var;
        this.e = context;
        this.g = oz0Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        hi0 hi0Var = (hi0) obj;
        View view = hi0Var.b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (hi0Var.a) {
            return;
        }
        fi0 fi0Var = hi0Var.c;
        if (fi0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = fi0Var.getImageReceiver().getDrawable();
            if (drawable instanceof e6) {
                ((e6) drawable).w(fi0Var);
            }
        }
        fi0Var.setRoundRadius(0);
        gVar.removeView(fi0Var);
        fi0Var.getImageReceiver().cancelLoadImage();
    }

    @Override // z4.a
    public final int b() {
        return this.c.size();
    }

    @Override // z4.a
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((hi0) obj);
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
        hi0 hi0Var = (hi0) this.c.get(i10);
        int k10 = k(i10);
        li0 li0Var = this.h;
        boolean z12 = li0Var.i1;
        SparseArray sparseArray2 = li0Var.d1;
        ArrayList arrayList = li0Var.b1;
        ArrayList arrayList2 = li0Var.a1;
        ArrayList arrayList3 = li0Var.X0;
        ArrayList arrayList4 = li0Var.Y0;
        ArrayList arrayList5 = li0Var.Z0;
        ArrayList arrayList6 = li0Var.W0;
        Context context = this.e;
        if (z12 && k10 == 0) {
            hi0Var.a = true;
            if (hi0Var.b == null) {
                hi0Var.b = new ii0(context);
            }
            if (hi0Var.b.getParent() == null) {
                gVar.addView(hi0Var.b);
            }
            return hi0Var;
        }
        hi0Var.a = false;
        ii0 ii0Var = hi0Var.b;
        if (ii0Var != null && ii0Var.getParent() != null) {
            gVar.removeView(hi0Var.b);
        }
        if (hi0Var.c == null) {
            fi0 fi0Var = new fi0(li0Var, context, i10, this.f);
            hi0Var.c = fi0Var;
            this.d.set(i10, fi0Var);
        }
        if (hi0Var.c.getParent() == null) {
            gVar.addView(hi0Var.c);
        }
        hi0Var.c.getImageReceiver().setAllowDecodeSingleFrame(true);
        int i12 = li0Var.i1 ? k10 - 1 : k10;
        if (i12 != 0) {
            i11 = k10;
            sparseArray = sparseArray2;
            if (i12 >= 0 && i12 < arrayList6.size()) {
                ImageLocation imageLocation = (ImageLocation) arrayList6.get(i12);
                hi0Var.c.L = imageLocation != null;
                z10 = arrayList5.get(i12) == null;
                ImageLocation imageLocation2 = (ImageLocation) arrayList4.get(i12);
                hi0Var.c.o((n71) arrayList5.get(i12), imageLocation, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation2 == null || !(imageLocation2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), "avatar_" + li0Var.E0);
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                }
                hi0Var.c.getImageReceiver().setDelegate(new ji0(this));
                hi0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                fi0 fi0Var2 = hi0Var.c;
                int i13 = li0Var.m1;
                int i14 = li0Var.n1;
                fi0Var2.r(i13, i13, i14, i14);
                hi0Var.c.setTag(Integer.valueOf(i11));
                return hi0Var;
            }
            z10 = false;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            hi0Var.c.getImageReceiver().setDelegate(new ji0(this));
            hi0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            fi0 fi0Var22 = hi0Var.c;
            int i132 = li0Var.m1;
            int i142 = li0Var.n1;
            fi0Var22.r(i132, i132, i142, i142);
            hi0Var.c.setTag(Integer.valueOf(i11));
            return hi0Var;
        }
        w9 w9Var = this.g;
        Drawable drawable = w9Var == null ? null : w9Var.getImageReceiver().getDrawable();
        if (drawable instanceof e6) {
            e6 e6Var = (e6) drawable;
            if (e6Var.s()) {
                hi0Var.c.setImageDrawable(drawable);
                e6Var.f(hi0Var.c);
                e6Var.R = true;
                i11 = k10;
                sparseArray = sparseArray2;
                z10 = false;
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    SparseArray sparseArray3 = sparseArray;
                    hi0Var.c.H = (RadialProgress2) sparseArray3.get(i12);
                    fi0 fi0Var3 = hi0Var.c;
                    if (fi0Var3.H == null) {
                        fi0Var3.H = new RadialProgress2(fi0Var3, null);
                        RadialProgress2 radialProgress2 = hi0Var.c.H;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        hi0Var.c.H.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i12, hi0Var.c.H);
                    }
                    if (li0Var.g1) {
                        li0Var.invalidate();
                    } else {
                        li0Var.postInvalidateOnAnimation();
                    }
                }
                hi0Var.c.getImageReceiver().setDelegate(new ji0(this));
                hi0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                fi0 fi0Var222 = hi0Var.c;
                int i1322 = li0Var.m1;
                int i1422 = li0Var.n1;
                fi0Var222.r(i1322, i1322, i1422, i1422);
                hi0Var.c.setTag(Integer.valueOf(i11));
                return hi0Var;
            }
        }
        if (i12 >= 0 && i12 < arrayList6.size()) {
            ImageLocation imageLocation3 = (ImageLocation) arrayList6.get(i12);
            hi0Var.c.L = imageLocation3 != null;
            boolean z13 = arrayList5.get(i12) == null;
            if (!li0Var.J0 || imageLocation3 == null) {
                z11 = z13;
            } else {
                z11 = z13;
                if (imageLocation3.imageType == 2) {
                    str = "avatar";
                    ImageLocation imageLocation4 = (ImageLocation) arrayList4.get(i12);
                    w9 w9Var2 = this.g;
                    i11 = k10;
                    bitmap = (w9Var2 == null && li0Var.e1) ? w9Var2.getImageReceiver().getBitmap() : null;
                    StringBuilder sb2 = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb2.append(li0Var.E0);
                    String sb3 = sb2.toString();
                    if (bitmap == null && arrayList5.get(i12) == null) {
                        fi0 fi0Var4 = hi0Var.c;
                        ImageLocation imageLocation5 = (ImageLocation) arrayList6.get(i12);
                        ImageLocation imageLocation6 = (ImageLocation) arrayList3.get(i12);
                        int intValue = ((Integer) arrayList2.get(i12)).intValue();
                        fi0Var4.getClass();
                        fi0Var4.a.setImage(imageLocation5, str, imageLocation6, null, null, null, new BitmapDrawable((Resources) null, bitmap), intValue, null, sb3, 1);
                        fi0Var4.d();
                    } else if (li0Var.K0 == null) {
                        hi0Var.c.o((n71) arrayList5.get(i12), (ImageLocation) arrayList6.get(i12), str, (ImageLocation) arrayList3.get(i12), li0Var.K0, null, ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    } else {
                        hi0Var.c.o((n71) arrayList5.get(i12), imageLocation3, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation4 == null || !(imageLocation4.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    }
                    z10 = z11;
                    if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    }
                    hi0Var.c.getImageReceiver().setDelegate(new ji0(this));
                    hi0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
                    fi0 fi0Var2222 = hi0Var.c;
                    int i13222 = li0Var.m1;
                    int i14222 = li0Var.n1;
                    fi0Var2222.r(i13222, i13222, i14222, i14222);
                    hi0Var.c.setTag(Integer.valueOf(i11));
                    return hi0Var;
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
            sb22.append(li0Var.E0);
            String sb32 = sb22.toString();
            if (bitmap == null) {
            }
            if (li0Var.K0 == null) {
            }
            z10 = z11;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            hi0Var.c.getImageReceiver().setDelegate(new ji0(this));
            hi0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
            fi0 fi0Var22222 = hi0Var.c;
            int i132222 = li0Var.m1;
            int i142222 = li0Var.n1;
            fi0Var22222.r(i132222, i132222, i142222, i142222);
            hi0Var.c.setTag(Integer.valueOf(i11));
            return hi0Var;
        }
        i11 = k10;
        sparseArray = sparseArray2;
        z10 = false;
        if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
        }
        hi0Var.c.getImageReceiver().setDelegate(new ji0(this));
        hi0Var.c.getImageReceiver().setCrossfadeAlpha((byte) 2);
        fi0 fi0Var222222 = hi0Var.c;
        int i1322222 = li0Var.m1;
        int i1422222 = li0Var.n1;
        fi0Var222222.r(i1322222, i1322222, i1422222, i1422222);
        hi0Var.c.setTag(Integer.valueOf(i11));
        return hi0Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        hi0 hi0Var = (hi0) obj;
        return hi0Var.a ? view == hi0Var.b : view == hi0Var.c;
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
        li0 li0Var = this.h;
        int size = li0Var.X0.size();
        if (li0Var.i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = li0Var.S0;
        int j10 = (j() * 2) + Math.max(dialogPhotos == null ? 0 : dialogPhotos.getCount(), size);
        for (int i11 = 0; i11 < j10; i11++) {
            arrayList2.add(new hi0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // org.telegram.ui.Components.fq
    public final int j() {
        li0 li0Var = this.h;
        int size = li0Var.X0.size();
        if (li0Var.i1) {
            size++;
        }
        if (size >= 2) {
            return li0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
