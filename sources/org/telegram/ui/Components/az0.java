package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class az0 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final /* synthetic */ bz0 E;
    public final ArrayList a;
    public long b;
    public float c;
    public boolean d;
    public final Runnable e;
    public Runnable f;
    public float g;
    public float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public boolean n;
    public final boolean o;
    public final float[] p;
    public final float[] q;
    public final Matrix r;
    public int s;
    public final int t;
    public final int u;
    public int v;
    public int w;
    public float x;
    public final float y;
    public int z;

    public az0(bz0 bz0Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = bz0Var;
        this.a = new ArrayList();
        this.b = -1L;
        this.c = 0.0f;
        this.d = true;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = org.telegram.messenger.g0.p;
        this.l = 1.5f;
        this.m = 1.15f;
        this.n = true;
        this.o = false;
        this.p = new float[9];
        this.q = new float[9];
        Matrix matrix2 = new Matrix();
        this.r = matrix2;
        this.y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.i = fArr[0];
        this.j = fArr[1];
        this.t = (int) a8.r9.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.u = (int) a8.r9.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f = runnable2;
        this.l = 4.0f;
        this.c = -0.1f;
        this.C = bitmap;
    }

    public static void b(Canvas canvas, org.telegram.ui.Cells.q1 q1Var, int i7, float f10, float f11) {
        canvas.save();
        float alpha = q1Var.b() ? q1Var.getAlpha() : 1.0f;
        canvas.translate(f10, f11);
        q1Var.setInvalidatesParent(true);
        if (i7 == 0) {
            q1Var.x1(alpha, canvas, true);
        } else if (i7 == 1) {
            q1Var.h1(canvas, alpha);
        } else if (i7 == 2) {
            q1Var.Q0(alpha, canvas, q1Var.getCurrentPosition() != null && (q1Var.getCurrentPosition().l & 1) == 0);
        } else if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().l & 1) != 0) {
            q1Var.o1(canvas, alpha, null);
            q1Var.V0(canvas, alpha);
        }
        q1Var.setInvalidatesParent(false);
        canvas.restore();
    }

    public final void a() {
        try {
            GLES20.glDeleteBuffers(2, this.B, 0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        bz0 bz0Var = this.E;
        int i7 = bz0Var.x;
        if (i7 != 0) {
            try {
                GLES20.glDeleteProgram(i7);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            bz0Var.x = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
        Runnable runnable = this.f;
        if (runnable != null) {
            dz0.b(runnable);
            this.f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.r;
        float[] fArr = this.q;
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float[] fArr2 = this.p;
        fArr2[0] = f10;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.n = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x022f, code lost:
    
        if ((r6 & 1) != 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0243, code lost:
    
        if (r0.d.size() != 1) goto L102;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, org.telegram.ui.Components.az0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public az0(bz0 bz0Var, ArrayList arrayList, Runnable runnable) {
        pj0 pj0Var;
        org.telegram.ui.ol olVar;
        int i7;
        float f10;
        float f11;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i10;
        int i11;
        float f12;
        float f13;
        ArrayList arrayList6;
        int i12;
        ?? obj = new Object();
        obj.E = bz0Var;
        ArrayList arrayList7 = new ArrayList();
        obj.a = arrayList7;
        obj.b = -1L;
        obj.c = 0.0f;
        obj.d = true;
        obj.g = 0.0f;
        obj.h = 0.0f;
        obj.i = 0.0f;
        obj.j = 0.0f;
        obj.k = org.telegram.messenger.g0.p;
        obj.l = 1.5f;
        obj.m = 1.15f;
        obj.n = true;
        obj.o = false;
        obj.p = new float[9];
        obj.q = new float[9];
        obj.r = new Matrix();
        obj.y = (float) (Math.random() * 2.0d);
        obj.A = new int[1];
        obj.B = new int[2];
        arrayList7.addAll(arrayList);
        int i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MIN_VALUE;
        int i16 = Integer.MAX_VALUE;
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            View view = (View) arrayList.get(i17);
            i16 = Math.min(i16, (int) view.getX());
            i14 = Math.max(i14, view.getWidth() + ((int) view.getX()));
            i13 = Math.min(i13, (int) view.getY());
            i15 = Math.max(i15, view.getHeight() + ((int) view.getY()));
        }
        float f14 = i13;
        obj.j = f14;
        float f15 = i16;
        obj.i = f15;
        obj.t = i14 - i16;
        obj.u = i15 - i13;
        obj.f = runnable;
        obj.e = new f1(1, arrayList);
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            if (arrayList.get(i18) instanceof org.telegram.ui.Cells.q1) {
                ((org.telegram.ui.Cells.q1) arrayList.get(i18)).Fc = true;
            }
        }
        obj.C = Bitmap.createBitmap(obj.t, obj.u, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(obj.C);
        if (arrayList.size() > 0 && (((View) arrayList.get(0)).getParent() instanceof pj0)) {
            pj0 pj0Var2 = (pj0) ((View) arrayList.get(0)).getParent();
            if (pj0Var2.getParent() instanceof org.telegram.ui.ol) {
                org.telegram.ui.ol olVar2 = (org.telegram.ui.ol) pj0Var2.getParent();
                org.telegram.ui.an chatActivity = olVar2.getChatActivity();
                ArrayList arrayList8 = new ArrayList(10);
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                int save = canvas.save();
                int i19 = 0;
                az0 az0Var = obj;
                while (i19 < 3) {
                    arrayList8.clear();
                    if (i19 != 2 || pj0Var2.V1) {
                        pj0Var = pj0Var2;
                        int i20 = 0;
                        while (true) {
                            olVar = olVar2;
                            if (i20 >= arrayList.size()) {
                                break;
                            }
                            View view2 = (View) arrayList.get(i20);
                            if (view2 instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view2;
                                if (view2.getY() <= pj0Var.getHeight() && view2.getY() + view2.getHeight() >= 0.0f) {
                                    i11 = i20;
                                    if (q1Var.getVisibility() == 4 || q1Var.getVisibility() == 8) {
                                        i10 = i19;
                                        f12 = f14;
                                        f13 = f15;
                                        arrayList6 = arrayList9;
                                        i20 = i11 + 1;
                                        arrayList9 = arrayList6;
                                        olVar2 = olVar;
                                        f14 = f12;
                                        f15 = f13;
                                        i19 = i10;
                                    } else {
                                        org.telegram.messenger.dj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                                        org.telegram.messenger.aj d = (currentMessagesGroup == null || currentMessagesGroup.f == null) ? null : currentMessagesGroup.d(q1Var.getMessageObject());
                                        f12 = f14;
                                        if (i19 == 0 && (d != null || q1Var.getTransitionParams().x0)) {
                                            if (d == null || d.h || (d.a == 0 && d.c == 0)) {
                                                if (d == null || d.h) {
                                                    arrayList9.add(q1Var);
                                                }
                                                if ((d == null || (d.a == 0 && d.c == 0)) && q1Var.i2()) {
                                                    arrayList10.add(q1Var);
                                                }
                                            }
                                            if (d != null || q1Var.getTransitionParams().D0 || q1Var.getTransitionParams().x0) {
                                                if (d == null || (d.l & q1Var.B()) != 0) {
                                                    arrayList11.add(q1Var);
                                                }
                                                if (d != null) {
                                                    int i21 = d.l;
                                                    if ((i21 & 8) != 0) {
                                                    }
                                                }
                                                arrayList12.add(q1Var);
                                            }
                                        }
                                        if (currentMessagesGroup != null) {
                                            org.telegram.messenger.cj cjVar = currentMessagesGroup.m;
                                            if (i19 == 0) {
                                                f13 = f15;
                                                i12 = 1;
                                            } else {
                                                f13 = f15;
                                                i12 = 1;
                                            }
                                            if ((i19 != i12 || cjVar.i) && ((i19 != 0 || !q1Var.getMessageObject().Z) && ((i19 != 1 || q1Var.getMessageObject().Z) && ((i19 != 2 || q1Var.ya) && (i19 == 2 || !q1Var.ya))))) {
                                                if (!arrayList8.contains(currentMessagesGroup)) {
                                                    cjVar.a = 0;
                                                    cjVar.b = 0;
                                                    cjVar.c = 0;
                                                    cjVar.d = 0;
                                                    cjVar.l = false;
                                                    cjVar.k = false;
                                                    cjVar.m = q1Var;
                                                    arrayList8.add(currentMessagesGroup);
                                                }
                                                cjVar.k = q1Var.I2();
                                                cjVar.l = q1Var.H2();
                                                int backgroundDrawableLeft = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                                                int backgroundDrawableRight = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                                                int backgroundDrawableTop = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                                                int backgroundDrawableBottom = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                                                int L = (q1Var.getCurrentPosition().l & 4) == 0 ? backgroundDrawableTop - org.telegram.messenger.g0.L(10.0f) : backgroundDrawableTop;
                                                i10 = i19;
                                                arrayList6 = arrayList9;
                                                int L2 = (q1Var.getCurrentPosition().l & 8) == 0 ? org.telegram.messenger.g0.L(10.0f) + backgroundDrawableBottom : backgroundDrawableBottom;
                                                if (q1Var.ya) {
                                                    cjVar.m = q1Var;
                                                }
                                                int i22 = cjVar.b;
                                                if (i22 == 0 || L < i22) {
                                                    cjVar.b = L;
                                                }
                                                int i23 = cjVar.d;
                                                if (i23 == 0 || L2 > i23) {
                                                    cjVar.d = L2;
                                                }
                                                int i24 = cjVar.a;
                                                if (i24 == 0 || backgroundDrawableLeft < i24) {
                                                    cjVar.a = backgroundDrawableLeft;
                                                }
                                                int i25 = cjVar.c;
                                                if (i25 == 0 || backgroundDrawableRight > i25) {
                                                    cjVar.c = backgroundDrawableRight;
                                                }
                                                i20 = i11 + 1;
                                                arrayList9 = arrayList6;
                                                olVar2 = olVar;
                                                f14 = f12;
                                                f15 = f13;
                                                i19 = i10;
                                            }
                                            i10 = i19;
                                            arrayList6 = arrayList9;
                                            i20 = i11 + 1;
                                            arrayList9 = arrayList6;
                                            olVar2 = olVar;
                                            f14 = f12;
                                            f15 = f13;
                                            i19 = i10;
                                        } else {
                                            i10 = i19;
                                            f13 = f15;
                                            arrayList6 = arrayList9;
                                            i20 = i11 + 1;
                                            arrayList9 = arrayList6;
                                            olVar2 = olVar;
                                            f14 = f12;
                                            f15 = f13;
                                            i19 = i10;
                                        }
                                    }
                                }
                            }
                            i10 = i19;
                            i11 = i20;
                            f12 = f14;
                            f13 = f15;
                            arrayList6 = arrayList9;
                            i20 = i11 + 1;
                            arrayList9 = arrayList6;
                            olVar2 = olVar;
                            f14 = f12;
                            f15 = f13;
                            i19 = i10;
                        }
                        i7 = i19;
                        f10 = f14;
                        f11 = f15;
                        ArrayList arrayList13 = arrayList9;
                        int i26 = 0;
                        az0 az0Var2 = az0Var;
                        while (i26 < arrayList8.size()) {
                            org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) arrayList8.get(i26);
                            org.telegram.messenger.cj cjVar2 = djVar.m;
                            float R1 = cjVar2.m.R1(true);
                            float f16 = cjVar2.a + R1 + cjVar2.e;
                            float f17 = cjVar2.b + cjVar2.f;
                            float f18 = cjVar2.c + R1 + cjVar2.g;
                            int i27 = i26;
                            float f19 = cjVar2.d + cjVar2.h;
                            if (!cjVar2.j) {
                                f17 += cjVar2.m.getTranslationY();
                                f19 += cjVar2.m.getTranslationY();
                            }
                            f17 = f17 < (chatActivity.L9 - ((float) chatActivity.N9)) - ((float) org.telegram.messenger.g0.L(20.0f)) ? (chatActivity.L9 - chatActivity.N9) - org.telegram.messenger.g0.L(20.0f) : f17;
                            f19 = f19 > ((float) (org.telegram.messenger.g0.L(20.0f) + pj0Var.getMeasuredHeight())) ? org.telegram.messenger.g0.L(20.0f) + pj0Var.getMeasuredHeight() : f19;
                            float f20 = az0Var2.j;
                            float f21 = f17 - f20;
                            float f22 = f19 - f20;
                            float f23 = az0Var2.i;
                            float f24 = f16 - f23;
                            float f25 = f18 - f23;
                            boolean z9 = (cjVar2.m.getScaleX() == 1.0f && cjVar2.m.getScaleY() == 1.0f) ? false : true;
                            if (z9) {
                                canvas.save();
                                arrayList3 = arrayList8;
                                arrayList4 = arrayList10;
                                arrayList5 = arrayList11;
                                canvas.scale(cjVar2.m.getScaleX(), cjVar2.m.getScaleY(), com.google.android.recaptcha.internal.a.A(f25, f24, 2.0f, f24), com.google.android.recaptcha.internal.a.A(f22, f21, 2.0f, f21));
                            } else {
                                arrayList3 = arrayList8;
                                arrayList4 = arrayList10;
                                arrayList5 = arrayList11;
                            }
                            ArrayList arrayList14 = arrayList5;
                            ArrayList arrayList15 = arrayList4;
                            ArrayList arrayList16 = arrayList13;
                            cjVar2.m.K0(canvas, (int) f24, (int) f21, (int) f25, (int) f22, cjVar2.k, cjVar2.l, false, olVar.getKeyboardHeight());
                            cjVar2.m = null;
                            cjVar2.o = djVar.c;
                            if (z9) {
                                canvas.restore();
                                for (int i28 = 0; i28 < arrayList.size(); i28++) {
                                    View view3 = (View) arrayList.get(i28);
                                    if (view3 instanceof org.telegram.ui.Cells.q1) {
                                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view3;
                                        if (q1Var2.getCurrentMessagesGroup() == djVar) {
                                            int left = q1Var2.getLeft();
                                            int top = q1Var2.getTop();
                                            view3.setPivotX(((f25 - f24) / 2.0f) + (f24 - left));
                                            view3.setPivotY(((f22 - f21) / 2.0f) + (f21 - top));
                                        }
                                    }
                                }
                            }
                            arrayList13 = arrayList16;
                            arrayList10 = arrayList15;
                            i26 = i27 + 1;
                            arrayList11 = arrayList14;
                            arrayList8 = arrayList3;
                            az0Var2 = this;
                        }
                        arrayList2 = arrayList13;
                    } else {
                        pj0Var = pj0Var2;
                        i7 = i19;
                        olVar = olVar2;
                        f10 = f14;
                        f11 = f15;
                        arrayList2 = arrayList9;
                    }
                    i19 = i7 + 1;
                    arrayList9 = arrayList2;
                    arrayList10 = arrayList10;
                    arrayList11 = arrayList11;
                    olVar2 = olVar;
                    f14 = f10;
                    f15 = f11;
                    arrayList8 = arrayList8;
                    az0Var = this;
                    pj0Var2 = pj0Var;
                }
                pj0 pj0Var3 = pj0Var2;
                float f26 = f14;
                float f27 = f15;
                ArrayList arrayList17 = arrayList9;
                ArrayList arrayList18 = arrayList10;
                ArrayList arrayList19 = arrayList11;
                for (int i29 = 0; i29 < arrayList.size(); i29++) {
                    View view4 = (View) arrayList.get(i29);
                    canvas.save();
                    canvas.translate(view4.getX() - f27, view4.getY() - f26);
                    view4.draw(canvas);
                    if (view4 instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) view4).i1(canvas);
                    } else if (view4 instanceof org.telegram.ui.Cells.t0) {
                        ((org.telegram.ui.Cells.t0) view4).G(canvas);
                    }
                    canvas.restore();
                }
                pj0Var3.getY();
                float f28 = chatActivity.L9;
                org.telegram.messenger.g0.L(4.0f);
                int size = arrayList17.size();
                if (size > 0) {
                    for (int i30 = 0; i30 < size; i30++) {
                        org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) arrayList17.get(i30);
                        b(canvas, q1Var3, 0, q1Var3.getX() - f27, q1Var3.getY() - f26);
                    }
                    arrayList17.clear();
                }
                int size2 = arrayList18.size();
                if (size2 > 0) {
                    for (int i31 = 0; i31 < size2; i31++) {
                        org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) arrayList18.get(i31);
                        b(canvas, q1Var4, 1, q1Var4.getX() - f27, q1Var4.getY() - f26);
                    }
                    arrayList18.clear();
                }
                int size3 = arrayList19.size();
                if (size3 > 0) {
                    for (int i32 = 0; i32 < size3; i32++) {
                        org.telegram.ui.Cells.q1 q1Var5 = (org.telegram.ui.Cells.q1) arrayList19.get(i32);
                        if (q1Var5.getCurrentPosition() != null || q1Var5.getTransitionParams().x0) {
                            b(canvas, q1Var5, 2, q1Var5.getX() - f27, q1Var5.getY() - f26);
                        }
                    }
                    arrayList19.clear();
                }
                int size4 = arrayList12.size();
                if (size4 > 0) {
                    for (int i33 = 0; i33 < size4; i33++) {
                        org.telegram.ui.Cells.q1 q1Var6 = (org.telegram.ui.Cells.q1) arrayList12.get(i33);
                        if (q1Var6.getCurrentPosition() != null || q1Var6.getTransitionParams().x0) {
                            b(canvas, q1Var6, 3, q1Var6.getX() - f27, q1Var6.getY() - f26);
                        }
                    }
                    arrayList12.clear();
                }
                try {
                    canvas.restoreToCount(save);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                for (int i34 = 0; i34 < arrayList.size(); i34++) {
                    if (arrayList.get(i34) instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) arrayList.get(i34)).Fc = false;
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(1:3)|4|(1:6)|7|(2:9|(8:11|12|(3:14|(1:18)|19)|(1:21)(1:(1:31))|22|23|24|25))|(2:33|(1:35))|12|(0)|(0)(0)|22|23|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0152, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0153, code lost:
    
        org.telegram.messenger.a8.g(r10, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public az0(bz0 bz0Var, View view, float f10, Runnable runnable) {
        this.E = bz0Var;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = -1L;
        this.c = 0.0f;
        this.d = true;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = org.telegram.messenger.g0.p;
        this.l = 1.5f;
        this.m = 1.15f;
        this.n = true;
        this.o = false;
        this.p = new float[9];
        this.q = new float[9];
        this.r = new Matrix();
        this.y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        arrayList.add(view);
        this.t = view.getWidth();
        int height = view.getHeight();
        this.u = height;
        this.j = view.getY();
        this.i = 0.0f;
        if (view instanceof org.telegram.ui.Cells.z) {
            org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) view;
            this.t = Math.max(1, zVar.getBoundsRight() - zVar.getBoundsLeft());
            this.i = zVar.getBoundsLeft() + 0.0f;
        }
        this.f = runnable;
        this.e = new ir0(this, 13);
        this.l = 1.5f * f10;
        this.m = 1.15f / (((f10 - 1.0f) / 3.0f) + 1.0f);
        this.C = Bitmap.createBitmap(this.t, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.C);
        int save = canvas.save();
        canvas.translate(-this.i, 0.0f);
        boolean z9 = view instanceof org.telegram.ui.Cells.q1;
        if (z9) {
            ((org.telegram.ui.Cells.q1) view).Fc = true;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.t0;
        if (z10) {
            org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
            if (t0Var.Q()) {
                canvas.save();
                canvas.translate(t0Var.j0 / 2.0f, view.getPaddingTop());
                t0Var.E(canvas, true);
                t0Var.H(canvas, true);
                canvas.restore();
                view.draw(canvas);
                if (z9) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                    ImageReceiver avatarImage = q1Var.getAvatarImage();
                    if (avatarImage != null && avatarImage.Q0) {
                        canvas.save();
                        canvas.translate(0.0f, -view.getY());
                        avatarImage.h(canvas, null);
                        canvas.restore();
                    }
                    q1Var.Fc = false;
                }
                if (!z9) {
                    canvas.save();
                    canvas.translate(0.0f, view.getPaddingTop());
                    ((org.telegram.ui.Cells.q1) view).i1(canvas);
                    canvas.restore();
                } else if (z10) {
                    ((org.telegram.ui.Cells.t0) view).G(canvas);
                }
                canvas.restoreToCount(save);
                this.i = view.getX() + this.i;
            }
        }
        if (z9) {
            org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
            if (q1Var2.L0()) {
                canvas.save();
                canvas.translate(0.0f, view.getPaddingTop());
                q1Var2.M0(canvas, true, false);
                canvas.restore();
            }
        }
        view.draw(canvas);
        if (z9) {
        }
        if (!z9) {
        }
        canvas.restoreToCount(save);
        this.i = view.getX() + this.i;
    }
}
