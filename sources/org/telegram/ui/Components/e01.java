package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e01 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final /* synthetic */ f01 E;
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

    public e01(f01 f01Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = f01Var;
        this.a = new ArrayList();
        this.b = -1L;
        this.c = 0.0f;
        this.d = true;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = org.telegram.messenger.i0.p;
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
        this.t = (int) w7.z8.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.u = (int) w7.z8.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f = runnable2;
        this.l = 4.0f;
        this.c = -0.1f;
        this.C = bitmap;
    }

    public static void b(Canvas canvas, org.telegram.ui.Cells.q1 q1Var, int i10, float f7, float f10) {
        canvas.save();
        float alpha = q1Var.a() ? q1Var.getAlpha() : 1.0f;
        canvas.translate(f7, f10);
        q1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            q1Var.v1(alpha, canvas, true);
        } else if (i10 == 1) {
            q1Var.f1(canvas, alpha);
        } else if (i10 == 2) {
            q1Var.O0(alpha, canvas, q1Var.getCurrentPosition() != null && (q1Var.getCurrentPosition().l & 1) == 0);
        } else if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().l & 1) != 0) {
            q1Var.m1(canvas, alpha, null);
            q1Var.T0(canvas, alpha);
        }
        q1Var.setInvalidatesParent(false);
        canvas.restore();
    }

    public final void a() {
        try {
            GLES20.glDeleteBuffers(2, this.B, 0);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        f01 f01Var = this.E;
        int i10 = f01Var.x;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
            f01Var.x = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e10) {
            org.telegram.messenger.f8.g(e10, true);
        }
        Runnable runnable = this.f;
        if (runnable != null) {
            h01.b(runnable);
            this.f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.r;
        float[] fArr = this.q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.p;
        fArr2[0] = f7;
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
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, org.telegram.ui.Components.e01] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e01(f01 f01Var, ArrayList arrayList, Runnable runnable) {
        tk0 tk0Var;
        org.telegram.ui.km kmVar;
        int i10;
        float f7;
        float f10;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i11;
        int i12;
        float f11;
        float f12;
        ArrayList arrayList6;
        int i13;
        ?? obj = new Object();
        obj.E = f01Var;
        ArrayList arrayList7 = new ArrayList();
        obj.a = arrayList7;
        obj.b = -1L;
        obj.c = 0.0f;
        obj.d = true;
        obj.g = 0.0f;
        obj.h = 0.0f;
        obj.i = 0.0f;
        obj.j = 0.0f;
        obj.k = org.telegram.messenger.i0.p;
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
        int i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i15 = Integer.MIN_VALUE;
        int i16 = Integer.MIN_VALUE;
        int i17 = Integer.MAX_VALUE;
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            View view = (View) arrayList.get(i18);
            i17 = Math.min(i17, (int) view.getX());
            i15 = Math.max(i15, view.getWidth() + ((int) view.getX()));
            i14 = Math.min(i14, (int) view.getY());
            i16 = Math.max(i16, view.getHeight() + ((int) view.getY()));
        }
        float f13 = i14;
        obj.j = f13;
        float f14 = i17;
        obj.i = f14;
        obj.t = i15 - i17;
        obj.u = i16 - i14;
        obj.f = runnable;
        obj.e = new f1(1, arrayList);
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            if (arrayList.get(i19) instanceof org.telegram.ui.Cells.q1) {
                ((org.telegram.ui.Cells.q1) arrayList.get(i19)).Ec = true;
            }
        }
        obj.C = Bitmap.createBitmap(obj.t, obj.u, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(obj.C);
        if (arrayList.size() > 0 && (((View) arrayList.get(0)).getParent() instanceof tk0)) {
            tk0 tk0Var2 = (tk0) ((View) arrayList.get(0)).getParent();
            if (tk0Var2.getParent() instanceof org.telegram.ui.km) {
                org.telegram.ui.km kmVar2 = (org.telegram.ui.km) tk0Var2.getParent();
                org.telegram.ui.un chatActivity = kmVar2.getChatActivity();
                ArrayList arrayList8 = new ArrayList(10);
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                int save = canvas.save();
                int i20 = 0;
                e01 e01Var = obj;
                while (i20 < 3) {
                    arrayList8.clear();
                    if (i20 != 2 || tk0Var2.V1) {
                        tk0Var = tk0Var2;
                        int i21 = 0;
                        while (true) {
                            kmVar = kmVar2;
                            if (i21 >= arrayList.size()) {
                                break;
                            }
                            View view2 = (View) arrayList.get(i21);
                            if (view2 instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view2;
                                if (view2.getY() <= tk0Var.getHeight() && view2.getY() + view2.getHeight() >= 0.0f) {
                                    i12 = i21;
                                    if (q1Var.getVisibility() == 4 || q1Var.getVisibility() == 8) {
                                        i11 = i20;
                                        f11 = f13;
                                        f12 = f14;
                                        arrayList6 = arrayList9;
                                        i21 = i12 + 1;
                                        arrayList9 = arrayList6;
                                        kmVar2 = kmVar;
                                        f13 = f11;
                                        f14 = f12;
                                        i20 = i11;
                                    } else {
                                        org.telegram.messenger.ej currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                                        org.telegram.messenger.bj d = (currentMessagesGroup == null || currentMessagesGroup.f == null) ? null : currentMessagesGroup.d(q1Var.getMessageObject());
                                        f11 = f13;
                                        if (i20 == 0 && (d != null || q1Var.getTransitionParams().x0)) {
                                            if (d == null || d.h || (d.a == 0 && d.c == 0)) {
                                                if (d == null || d.h) {
                                                    arrayList9.add(q1Var);
                                                }
                                                if ((d == null || (d.a == 0 && d.c == 0)) && q1Var.g2()) {
                                                    arrayList10.add(q1Var);
                                                }
                                            }
                                            if (d != null || q1Var.getTransitionParams().D0 || q1Var.getTransitionParams().x0) {
                                                if (d == null || (d.l & q1Var.F()) != 0) {
                                                    arrayList11.add(q1Var);
                                                }
                                                if (d != null) {
                                                    int i22 = d.l;
                                                    if ((i22 & 8) != 0) {
                                                    }
                                                }
                                                arrayList12.add(q1Var);
                                            }
                                        }
                                        if (currentMessagesGroup != null) {
                                            org.telegram.messenger.dj djVar = currentMessagesGroup.m;
                                            if (i20 == 0) {
                                                f12 = f14;
                                                i13 = 1;
                                            } else {
                                                f12 = f14;
                                                i13 = 1;
                                            }
                                            if ((i20 != i13 || djVar.i) && ((i20 != 0 || !q1Var.getMessageObject().Z) && ((i20 != 1 || q1Var.getMessageObject().Z) && ((i20 != 2 || q1Var.xa) && (i20 == 2 || !q1Var.xa))))) {
                                                if (!arrayList8.contains(currentMessagesGroup)) {
                                                    djVar.a = 0;
                                                    djVar.b = 0;
                                                    djVar.c = 0;
                                                    djVar.d = 0;
                                                    djVar.l = false;
                                                    djVar.k = false;
                                                    djVar.m = q1Var;
                                                    arrayList8.add(currentMessagesGroup);
                                                }
                                                djVar.k = q1Var.F2();
                                                djVar.l = q1Var.E2();
                                                int backgroundDrawableLeft = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                                                int backgroundDrawableRight = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                                                int backgroundDrawableTop = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                                                int backgroundDrawableBottom = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                                                int L = (q1Var.getCurrentPosition().l & 4) == 0 ? backgroundDrawableTop - org.telegram.messenger.i0.L(10.0f) : backgroundDrawableTop;
                                                i11 = i20;
                                                arrayList6 = arrayList9;
                                                int L2 = (q1Var.getCurrentPosition().l & 8) == 0 ? org.telegram.messenger.i0.L(10.0f) + backgroundDrawableBottom : backgroundDrawableBottom;
                                                if (q1Var.xa) {
                                                    djVar.m = q1Var;
                                                }
                                                int i23 = djVar.b;
                                                if (i23 == 0 || L < i23) {
                                                    djVar.b = L;
                                                }
                                                int i24 = djVar.d;
                                                if (i24 == 0 || L2 > i24) {
                                                    djVar.d = L2;
                                                }
                                                int i25 = djVar.a;
                                                if (i25 == 0 || backgroundDrawableLeft < i25) {
                                                    djVar.a = backgroundDrawableLeft;
                                                }
                                                int i26 = djVar.c;
                                                if (i26 == 0 || backgroundDrawableRight > i26) {
                                                    djVar.c = backgroundDrawableRight;
                                                }
                                                i21 = i12 + 1;
                                                arrayList9 = arrayList6;
                                                kmVar2 = kmVar;
                                                f13 = f11;
                                                f14 = f12;
                                                i20 = i11;
                                            }
                                            i11 = i20;
                                            arrayList6 = arrayList9;
                                            i21 = i12 + 1;
                                            arrayList9 = arrayList6;
                                            kmVar2 = kmVar;
                                            f13 = f11;
                                            f14 = f12;
                                            i20 = i11;
                                        } else {
                                            i11 = i20;
                                            f12 = f14;
                                            arrayList6 = arrayList9;
                                            i21 = i12 + 1;
                                            arrayList9 = arrayList6;
                                            kmVar2 = kmVar;
                                            f13 = f11;
                                            f14 = f12;
                                            i20 = i11;
                                        }
                                    }
                                }
                            }
                            i11 = i20;
                            i12 = i21;
                            f11 = f13;
                            f12 = f14;
                            arrayList6 = arrayList9;
                            i21 = i12 + 1;
                            arrayList9 = arrayList6;
                            kmVar2 = kmVar;
                            f13 = f11;
                            f14 = f12;
                            i20 = i11;
                        }
                        i10 = i20;
                        f7 = f13;
                        f10 = f14;
                        ArrayList arrayList13 = arrayList9;
                        int i27 = 0;
                        e01 e01Var2 = e01Var;
                        while (i27 < arrayList8.size()) {
                            org.telegram.messenger.ej ejVar = (org.telegram.messenger.ej) arrayList8.get(i27);
                            org.telegram.messenger.dj djVar2 = ejVar.m;
                            float P1 = djVar2.m.P1(true);
                            float f15 = djVar2.a + P1 + djVar2.e;
                            float f16 = djVar2.b + djVar2.f;
                            float f17 = djVar2.c + P1 + djVar2.g;
                            int i28 = i27;
                            float f18 = djVar2.d + djVar2.h;
                            if (!djVar2.j) {
                                f16 += djVar2.m.getTranslationY();
                                f18 += djVar2.m.getTranslationY();
                            }
                            f16 = f16 < (chatActivity.L9 - ((float) chatActivity.N9)) - ((float) org.telegram.messenger.i0.L(20.0f)) ? (chatActivity.L9 - chatActivity.N9) - org.telegram.messenger.i0.L(20.0f) : f16;
                            f18 = f18 > ((float) (org.telegram.messenger.i0.L(20.0f) + tk0Var.getMeasuredHeight())) ? org.telegram.messenger.i0.L(20.0f) + tk0Var.getMeasuredHeight() : f18;
                            float f19 = e01Var2.j;
                            float f20 = f16 - f19;
                            float f21 = f18 - f19;
                            float f22 = e01Var2.i;
                            float f23 = f15 - f22;
                            float f24 = f17 - f22;
                            boolean z10 = (djVar2.m.getScaleX() == 1.0f && djVar2.m.getScaleY() == 1.0f) ? false : true;
                            if (z10) {
                                canvas.save();
                                arrayList3 = arrayList8;
                                arrayList4 = arrayList10;
                                arrayList5 = arrayList11;
                                canvas.scale(djVar2.m.getScaleX(), djVar2.m.getScaleY(), c3.i0.B(f24, f23, 2.0f, f23), c3.i0.B(f21, f20, 2.0f, f20));
                            } else {
                                arrayList3 = arrayList8;
                                arrayList4 = arrayList10;
                                arrayList5 = arrayList11;
                            }
                            ArrayList arrayList14 = arrayList5;
                            ArrayList arrayList15 = arrayList4;
                            ArrayList arrayList16 = arrayList13;
                            djVar2.m.I0(canvas, (int) f23, (int) f20, (int) f24, (int) f21, djVar2.k, djVar2.l, false, kmVar.getKeyboardHeight());
                            djVar2.m = null;
                            djVar2.o = ejVar.c;
                            if (z10) {
                                canvas.restore();
                                for (int i29 = 0; i29 < arrayList.size(); i29++) {
                                    View view3 = (View) arrayList.get(i29);
                                    if (view3 instanceof org.telegram.ui.Cells.q1) {
                                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view3;
                                        if (q1Var2.getCurrentMessagesGroup() == ejVar) {
                                            int left = q1Var2.getLeft();
                                            int top = q1Var2.getTop();
                                            view3.setPivotX(((f24 - f23) / 2.0f) + (f23 - left));
                                            view3.setPivotY(((f21 - f20) / 2.0f) + (f20 - top));
                                        }
                                    }
                                }
                            }
                            arrayList13 = arrayList16;
                            arrayList10 = arrayList15;
                            i27 = i28 + 1;
                            arrayList11 = arrayList14;
                            arrayList8 = arrayList3;
                            e01Var2 = this;
                        }
                        arrayList2 = arrayList13;
                    } else {
                        tk0Var = tk0Var2;
                        i10 = i20;
                        kmVar = kmVar2;
                        f7 = f13;
                        f10 = f14;
                        arrayList2 = arrayList9;
                    }
                    i20 = i10 + 1;
                    arrayList9 = arrayList2;
                    arrayList10 = arrayList10;
                    arrayList11 = arrayList11;
                    kmVar2 = kmVar;
                    f13 = f7;
                    f14 = f10;
                    arrayList8 = arrayList8;
                    e01Var = this;
                    tk0Var2 = tk0Var;
                }
                tk0 tk0Var3 = tk0Var2;
                float f25 = f13;
                float f26 = f14;
                ArrayList arrayList17 = arrayList9;
                ArrayList arrayList18 = arrayList10;
                ArrayList arrayList19 = arrayList11;
                for (int i30 = 0; i30 < arrayList.size(); i30++) {
                    View view4 = (View) arrayList.get(i30);
                    canvas.save();
                    canvas.translate(view4.getX() - f26, view4.getY() - f25);
                    view4.draw(canvas);
                    if (view4 instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) view4).g1(canvas);
                    } else if (view4 instanceof org.telegram.ui.Cells.s0) {
                        ((org.telegram.ui.Cells.s0) view4).I(canvas);
                    }
                    canvas.restore();
                }
                tk0Var3.getY();
                float f27 = chatActivity.L9;
                org.telegram.messenger.i0.L(4.0f);
                int size = arrayList17.size();
                if (size > 0) {
                    for (int i31 = 0; i31 < size; i31++) {
                        org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) arrayList17.get(i31);
                        b(canvas, q1Var3, 0, q1Var3.getX() - f26, q1Var3.getY() - f25);
                    }
                    arrayList17.clear();
                }
                int size2 = arrayList18.size();
                if (size2 > 0) {
                    for (int i32 = 0; i32 < size2; i32++) {
                        org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) arrayList18.get(i32);
                        b(canvas, q1Var4, 1, q1Var4.getX() - f26, q1Var4.getY() - f25);
                    }
                    arrayList18.clear();
                }
                int size3 = arrayList19.size();
                if (size3 > 0) {
                    for (int i33 = 0; i33 < size3; i33++) {
                        org.telegram.ui.Cells.q1 q1Var5 = (org.telegram.ui.Cells.q1) arrayList19.get(i33);
                        if (q1Var5.getCurrentPosition() != null || q1Var5.getTransitionParams().x0) {
                            b(canvas, q1Var5, 2, q1Var5.getX() - f26, q1Var5.getY() - f25);
                        }
                    }
                    arrayList19.clear();
                }
                int size4 = arrayList12.size();
                if (size4 > 0) {
                    for (int i34 = 0; i34 < size4; i34++) {
                        org.telegram.ui.Cells.q1 q1Var6 = (org.telegram.ui.Cells.q1) arrayList12.get(i34);
                        if (q1Var6.getCurrentPosition() != null || q1Var6.getTransitionParams().x0) {
                            b(canvas, q1Var6, 3, q1Var6.getX() - f26, q1Var6.getY() - f25);
                        }
                    }
                    arrayList12.clear();
                }
                try {
                    canvas.restoreToCount(save);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                for (int i35 = 0; i35 < arrayList.size(); i35++) {
                    if (arrayList.get(i35) instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) arrayList.get(i35)).Ec = false;
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
    
        org.telegram.messenger.f8.g(r10, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e01(f01 f01Var, View view, float f7, Runnable runnable) {
        this.E = f01Var;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = -1L;
        this.c = 0.0f;
        this.d = true;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = org.telegram.messenger.i0.p;
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
        this.e = new uo0(this, 18);
        this.l = 1.5f * f7;
        this.m = 1.15f / (((f7 - 1.0f) / 3.0f) + 1.0f);
        this.C = Bitmap.createBitmap(this.t, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.C);
        int save = canvas.save();
        canvas.translate(-this.i, 0.0f);
        boolean z10 = view instanceof org.telegram.ui.Cells.q1;
        if (z10) {
            ((org.telegram.ui.Cells.q1) view).Ec = true;
        }
        boolean z11 = view instanceof org.telegram.ui.Cells.s0;
        if (z11) {
            org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) view;
            if (s0Var.R()) {
                canvas.save();
                canvas.translate(s0Var.j0 / 2.0f, view.getPaddingTop());
                s0Var.H(canvas, true);
                s0Var.J(canvas, true);
                canvas.restore();
                view.draw(canvas);
                if (z10) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                    ImageReceiver avatarImage = q1Var.getAvatarImage();
                    if (avatarImage != null && avatarImage.Q0) {
                        canvas.save();
                        canvas.translate(0.0f, -view.getY());
                        avatarImage.h(canvas, null);
                        canvas.restore();
                    }
                    q1Var.Ec = false;
                }
                if (!z10) {
                    canvas.save();
                    canvas.translate(0.0f, view.getPaddingTop());
                    ((org.telegram.ui.Cells.q1) view).g1(canvas);
                    canvas.restore();
                } else if (z11) {
                    ((org.telegram.ui.Cells.s0) view).I(canvas);
                }
                canvas.restoreToCount(save);
                this.i = view.getX() + this.i;
            }
        }
        if (z10) {
            org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
            if (q1Var2.J0()) {
                canvas.save();
                canvas.translate(0.0f, view.getPaddingTop());
                q1Var2.K0(canvas, true, false);
                canvas.restore();
            }
        }
        view.draw(canvas);
        if (z10) {
        }
        if (!z10) {
        }
        canvas.restoreToCount(save);
        this.i = view.getX() + this.i;
    }
}
