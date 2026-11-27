// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class enb {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final /* synthetic */ fnb E;
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

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c3, code lost:
    
        if (r6.getTransitionParams().x0 != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0219, code lost:
    
        if ((r7 & 1) != 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d0, code lost:
    
        if (r7.c != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x022d, code lost:
    
        if (r2.d.size() != 1) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0211  */
    /* JADX WARN: Type inference failed for: r0v0, types: [enb, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public enb(fnb fnbVar, ArrayList arrayList, Runnable runnable) {
        d79 d79Var;
        nt1 nt1Var;
        int i;
        float f;
        float f2;
        ArrayList arrayList2;
        int i2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i3;
        int i4;
        float f3;
        float f4;
        ArrayList arrayList5;
        int i5;
        ?? obj = new Object();
        obj.E = fnbVar;
        ArrayList arrayList6 = new ArrayList();
        obj.a = arrayList6;
        obj.b = -1L;
        obj.c = 0.0f;
        obj.d = true;
        obj.g = 0.0f;
        obj.h = 0.0f;
        obj.i = 0.0f;
        obj.j = 0.0f;
        obj.k = hl.p;
        obj.l = 1.5f;
        obj.m = 1.15f;
        obj.n = true;
        obj.o = false;
        byte b = 9;
        obj.p = new float[9];
        obj.q = new float[9];
        obj.r = new Matrix();
        obj.y = (float) (Math.random() * 2.0d);
        obj.A = new int[1];
        obj.B = new int[2];
        arrayList6.addAll(arrayList);
        int i6 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i7 = Integer.MIN_VALUE;
        int i8 = Integer.MIN_VALUE;
        int i9 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View view = (View) arrayList.get(i10);
            i9 = Math.min(i9, (int) view.getX());
            i7 = Math.max(i7, view.getWidth() + ((int) view.getX()));
            i6 = Math.min(i6, (int) view.getY());
            i8 = Math.max(i8, view.getHeight() + ((int) view.getY()));
        }
        float f5 = i6;
        obj.j = f5;
        float f6 = i9;
        obj.i = f6;
        obj.t = i7 - i9;
        obj.u = i8 - i6;
        obj.f = runnable;
        obj.e = new se(arrayList, b);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (arrayList.get(i11) instanceof wb2) {
                ((wb2) arrayList.get(i11)).Tc = true;
            }
        }
        obj.C = Bitmap.createBitmap(obj.t, obj.u, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(obj.C);
        if (arrayList.size() <= 0 || !(((View) arrayList.get(0)).getParent() instanceof d79)) {
            return;
        }
        d79 d79Var2 = (d79) ((View) arrayList.get(0)).getParent();
        if (d79Var2.getParent() instanceof nt1) {
            nt1 nt1Var2 = (nt1) d79Var2.getParent();
            zu1 chatActivity = nt1Var2.getChatActivity();
            ArrayList arrayList7 = new ArrayList(10);
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            ArrayList arrayList10 = new ArrayList();
            ArrayList arrayList11 = new ArrayList();
            int save = canvas.save();
            int i12 = 0;
            enb enbVar = obj;
            while (i12 < 3) {
                arrayList7.clear();
                if (i12 != 2 || d79Var2.W1) {
                    d79Var = d79Var2;
                    int i13 = 0;
                    while (true) {
                        nt1Var = nt1Var2;
                        if (i13 >= arrayList.size()) {
                            break;
                        }
                        View view2 = (View) arrayList.get(i13);
                        if (view2 instanceof wb2) {
                            wb2 wb2Var = (wb2) view2;
                            if (view2.getY() <= d79Var.getHeight() && view2.getY() + view2.getHeight() >= 0.0f) {
                                i4 = i13;
                                if (wb2Var.getVisibility() == 4 || wb2Var.getVisibility() == 8) {
                                    i3 = i12;
                                    f3 = f5;
                                    f4 = f6;
                                    arrayList5 = arrayList9;
                                    i13 = i4 + 1;
                                    arrayList9 = arrayList5;
                                    nt1Var2 = nt1Var;
                                    f5 = f3;
                                    f6 = f4;
                                    i12 = i3;
                                } else {
                                    m47 currentMessagesGroup = wb2Var.getCurrentMessagesGroup();
                                    j47 d = currentMessagesGroup != null ? currentMessagesGroup.d(wb2Var.getMessageObject()) : null;
                                    f3 = f5;
                                    if (i12 == 0) {
                                        if (d != null) {
                                            if (!d.h) {
                                                if (d.a == 0) {
                                                }
                                                if (d == null || wb2Var.getTransitionParams().D0 || wb2Var.getTransitionParams().x0) {
                                                    if (d != null || (d.l & wb2Var.G()) != 0) {
                                                        arrayList10.add(wb2Var);
                                                    }
                                                    if (d != null) {
                                                        int i14 = d.l;
                                                        if ((i14 & 8) != 0) {
                                                        }
                                                    }
                                                    arrayList11.add(wb2Var);
                                                }
                                            }
                                        }
                                        if (d == null || d.h) {
                                            arrayList8.add(wb2Var);
                                        }
                                        if ((d == null || (d.a == 0 && d.c == 0)) && wb2Var.k2()) {
                                            arrayList9.add(wb2Var);
                                        }
                                        if (d == null) {
                                        }
                                        if (d != null) {
                                        }
                                        arrayList10.add(wb2Var);
                                        if (d != null) {
                                        }
                                        arrayList11.add(wb2Var);
                                    }
                                    if (currentMessagesGroup != null) {
                                        l47 l47Var = currentMessagesGroup.m;
                                        if (i12 == 0) {
                                            f4 = f6;
                                            i5 = 1;
                                        } else {
                                            f4 = f6;
                                            i5 = 1;
                                        }
                                        if ((i12 != i5 || l47Var.i) && ((i12 != 0 || !wb2Var.getMessageObject().Z) && (i12 != 1 || wb2Var.getMessageObject().Z))) {
                                            boolean z = wb2Var.La;
                                            if (i12 != 2 ? !z : z) {
                                                if (!arrayList7.contains(currentMessagesGroup)) {
                                                    l47Var.a = 0;
                                                    l47Var.b = 0;
                                                    l47Var.c = 0;
                                                    l47Var.d = 0;
                                                    l47Var.l = false;
                                                    l47Var.k = false;
                                                    l47Var.m = wb2Var;
                                                    arrayList7.add(currentMessagesGroup);
                                                }
                                                l47Var.k = wb2Var.L2();
                                                l47Var.l = wb2Var.K2();
                                                int backgroundDrawableLeft = wb2Var.getBackgroundDrawableLeft() + wb2Var.getLeft();
                                                int backgroundDrawableRight = wb2Var.getBackgroundDrawableRight() + wb2Var.getLeft();
                                                int backgroundDrawableTop = wb2Var.getBackgroundDrawableTop() + wb2Var.getPaddingTop() + wb2Var.getTop();
                                                int backgroundDrawableBottom = wb2Var.getBackgroundDrawableBottom() + wb2Var.getPaddingTop() + wb2Var.getTop();
                                                int L = (wb2Var.getCurrentPosition().l & 4) == 0 ? backgroundDrawableTop - hl.L(10.0f) : backgroundDrawableTop;
                                                i3 = i12;
                                                arrayList5 = arrayList9;
                                                int L2 = (wb2Var.getCurrentPosition().l & 8) == 0 ? hl.L(10.0f) + backgroundDrawableBottom : backgroundDrawableBottom;
                                                if (wb2Var.La) {
                                                    l47Var.m = wb2Var;
                                                }
                                                int i15 = l47Var.b;
                                                if (i15 == 0 || L < i15) {
                                                    l47Var.b = L;
                                                }
                                                int i16 = l47Var.d;
                                                if (i16 == 0 || L2 > i16) {
                                                    l47Var.d = L2;
                                                }
                                                int i17 = l47Var.a;
                                                if (i17 == 0 || backgroundDrawableLeft < i17) {
                                                    l47Var.a = backgroundDrawableLeft;
                                                }
                                                int i18 = l47Var.c;
                                                if (i18 == 0 || backgroundDrawableRight > i18) {
                                                    l47Var.c = backgroundDrawableRight;
                                                }
                                                i13 = i4 + 1;
                                                arrayList9 = arrayList5;
                                                nt1Var2 = nt1Var;
                                                f5 = f3;
                                                f6 = f4;
                                                i12 = i3;
                                            }
                                        }
                                        i3 = i12;
                                        arrayList5 = arrayList9;
                                        i13 = i4 + 1;
                                        arrayList9 = arrayList5;
                                        nt1Var2 = nt1Var;
                                        f5 = f3;
                                        f6 = f4;
                                        i12 = i3;
                                    } else {
                                        i3 = i12;
                                        f4 = f6;
                                        arrayList5 = arrayList9;
                                        i13 = i4 + 1;
                                        arrayList9 = arrayList5;
                                        nt1Var2 = nt1Var;
                                        f5 = f3;
                                        f6 = f4;
                                        i12 = i3;
                                    }
                                }
                            }
                        }
                        i3 = i12;
                        i4 = i13;
                        f3 = f5;
                        f4 = f6;
                        arrayList5 = arrayList9;
                        i13 = i4 + 1;
                        arrayList9 = arrayList5;
                        nt1Var2 = nt1Var;
                        f5 = f3;
                        f6 = f4;
                        i12 = i3;
                    }
                    i = i12;
                    f = f5;
                    f2 = f6;
                    ArrayList arrayList12 = arrayList9;
                    int i19 = 0;
                    enb enbVar2 = enbVar;
                    while (i19 < arrayList7.size()) {
                        m47 m47Var = (m47) arrayList7.get(i19);
                        l47 l47Var2 = m47Var.m;
                        float U1 = l47Var2.m.U1(true);
                        float f7 = l47Var2.a + U1 + l47Var2.e;
                        float f8 = l47Var2.b + l47Var2.f;
                        float f9 = l47Var2.c + U1 + l47Var2.g;
                        int i20 = i19;
                        float f10 = l47Var2.d + l47Var2.h;
                        if (!l47Var2.j) {
                            f8 += l47Var2.m.getTranslationY();
                            f10 += l47Var2.m.getTranslationY();
                        }
                        f8 = f8 < (chatActivity.P9 - ((float) chatActivity.R9)) - ((float) hl.L(20.0f)) ? (chatActivity.P9 - chatActivity.R9) - hl.L(20.0f) : f8;
                        f10 = f10 > ((float) (hl.L(20.0f) + d79Var.getMeasuredHeight())) ? hl.L(20.0f) + d79Var.getMeasuredHeight() : f10;
                        float f11 = enbVar2.j;
                        float f12 = f8 - f11;
                        float f13 = f10 - f11;
                        float f14 = enbVar2.i;
                        float f15 = f7 - f14;
                        float f16 = f9 - f14;
                        boolean z2 = (l47Var2.m.getScaleX() == 1.0f && l47Var2.m.getScaleY() == 1.0f) ? false : true;
                        if (z2) {
                            canvas.save();
                            arrayList3 = arrayList7;
                            arrayList4 = arrayList10;
                            i2 = save;
                            canvas.scale(l47Var2.m.getScaleX(), l47Var2.m.getScaleY(), bp1.z(f16, f15, 2.0f, f15), bp1.z(f13, f12, 2.0f, f12));
                        } else {
                            i2 = save;
                            arrayList3 = arrayList7;
                            arrayList4 = arrayList10;
                        }
                        ArrayList arrayList13 = arrayList12;
                        ArrayList arrayList14 = arrayList4;
                        float f17 = 2.0f;
                        l47Var2.m.K0(canvas, (int) f15, (int) f12, (int) f16, (int) f13, l47Var2.k, l47Var2.l, false, nt1Var.getKeyboardHeight());
                        l47Var2.m = null;
                        l47Var2.o = m47Var.c;
                        if (z2) {
                            canvas.restore();
                            int i21 = 0;
                            while (i21 < arrayList.size()) {
                                View view3 = (View) arrayList.get(i21);
                                float f18 = f17;
                                if (view3 instanceof wb2) {
                                    wb2 wb2Var2 = (wb2) view3;
                                    if (wb2Var2.getCurrentMessagesGroup() == m47Var) {
                                        int left = wb2Var2.getLeft();
                                        int top = wb2Var2.getTop();
                                        view3.setPivotX(((f16 - f15) / f18) + (f15 - left));
                                        view3.setPivotY(((f13 - f12) / f18) + (f12 - top));
                                    }
                                }
                                i21++;
                                f17 = f18;
                            }
                        }
                        i19 = i20 + 1;
                        arrayList12 = arrayList13;
                        arrayList10 = arrayList14;
                        arrayList7 = arrayList3;
                        save = i2;
                        enbVar2 = this;
                    }
                    arrayList2 = arrayList12;
                } else {
                    d79Var = d79Var2;
                    i = i12;
                    nt1Var = nt1Var2;
                    f = f5;
                    f2 = f6;
                    arrayList2 = arrayList9;
                }
                i12 = i + 1;
                d79Var2 = d79Var;
                arrayList9 = arrayList2;
                arrayList10 = arrayList10;
                nt1Var2 = nt1Var;
                f5 = f;
                f6 = f2;
                arrayList7 = arrayList7;
                save = save;
                enbVar = this;
            }
            d79 d79Var3 = d79Var2;
            int i22 = save;
            float f19 = f5;
            float f20 = f6;
            ArrayList arrayList15 = arrayList9;
            ArrayList arrayList16 = arrayList10;
            for (int i23 = 0; i23 < arrayList.size(); i23++) {
                View view4 = (View) arrayList.get(i23);
                canvas.save();
                canvas.translate(view4.getX() - f20, view4.getY() - f19);
                view4.draw(canvas);
                if (view4 instanceof wb2) {
                    ((wb2) view4).i1(canvas);
                } else if (view4 instanceof dl1) {
                    ((dl1) view4).K(canvas);
                }
                canvas.restore();
            }
            d79Var3.getY();
            float f21 = chatActivity.P9;
            hl.L(4.0f);
            int size = arrayList8.size();
            if (size > 0) {
                for (int i24 = 0; i24 < size; i24++) {
                    wb2 wb2Var3 = (wb2) arrayList8.get(i24);
                    b(canvas, wb2Var3, 0, wb2Var3.getX() - f20, wb2Var3.getY() - f19);
                }
                arrayList8.clear();
            }
            int size2 = arrayList15.size();
            if (size2 > 0) {
                for (int i25 = 0; i25 < size2; i25++) {
                    wb2 wb2Var4 = (wb2) arrayList15.get(i25);
                    b(canvas, wb2Var4, 1, wb2Var4.getX() - f20, wb2Var4.getY() - f19);
                }
                arrayList15.clear();
            }
            int size3 = arrayList16.size();
            if (size3 > 0) {
                for (int i26 = 0; i26 < size3; i26++) {
                    wb2 wb2Var5 = (wb2) arrayList16.get(i26);
                    if (wb2Var5.getCurrentPosition() != null || wb2Var5.getTransitionParams().x0) {
                        b(canvas, wb2Var5, 2, wb2Var5.getX() - f20, wb2Var5.getY() - f19);
                    }
                }
                arrayList16.clear();
            }
            int size4 = arrayList11.size();
            if (size4 > 0) {
                for (int i27 = 0; i27 < size4; i27++) {
                    wb2 wb2Var6 = (wb2) arrayList11.get(i27);
                    if (wb2Var6.getCurrentPosition() != null || wb2Var6.getTransitionParams().x0) {
                        b(canvas, wb2Var6, 3, wb2Var6.getX() - f20, wb2Var6.getY() - f19);
                    }
                }
                arrayList11.clear();
            }
            try {
                canvas.restoreToCount(i22);
            } catch (Exception e) {
                cc4.g(e, true);
            }
            for (int i28 = 0; i28 < arrayList.size(); i28++) {
                if (arrayList.get(i28) instanceof wb2) {
                    ((wb2) arrayList.get(i28)).Tc = false;
                }
            }
        }
    }

    public static void b(Canvas canvas, wb2 wb2Var, int i, float f, float f2) {
        canvas.save();
        float alpha = wb2Var.a() ? wb2Var.getAlpha() : 1.0f;
        canvas.translate(f, f2);
        wb2Var.setInvalidatesParent(true);
        if (i == 0) {
            wb2Var.A1(alpha, canvas, true);
        } else if (i == 1) {
            wb2Var.h1(canvas, alpha);
        } else if (i == 2) {
            wb2Var.Q0(alpha, canvas, wb2Var.getCurrentPosition() != null && (wb2Var.getCurrentPosition().l & 1) == 0);
        } else if (wb2Var.getCurrentPosition() == null || (wb2Var.getCurrentPosition().l & 1) != 0) {
            wb2Var.q1(canvas, alpha, null);
            wb2Var.V0(canvas, alpha);
        }
        wb2Var.setInvalidatesParent(false);
        canvas.restore();
    }

    public final void a() {
        try {
            GLES20.glDeleteBuffers(2, this.B, 0);
        } catch (Exception e) {
            cc4.g(e, true);
        }
        fnb fnbVar = this.E;
        int i = fnbVar.x;
        if (i != 0) {
            try {
                GLES20.glDeleteProgram(i);
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
            fnbVar.x = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e3) {
            cc4.g(e3, true);
        }
        Runnable runnable = this.f;
        if (runnable != null) {
            hnb.b(runnable);
            this.f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.r;
        float[] fArr = this.q;
        matrix.getValues(fArr);
        float f = fArr[0];
        float[] fArr2 = this.p;
        fArr2[0] = f;
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

    public enb(fnb fnbVar, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = fnbVar;
        this.a = new ArrayList();
        this.b = -1L;
        this.c = 0.0f;
        this.d = true;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = hl.p;
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
        this.t = (int) dte.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.u = (int) dte.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f = runnable2;
        this.l = 4.0f;
        this.c = -0.1f;
        this.C = bitmap;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(1:3)(1:36)|4|(1:6)|7|(2:9|(8:11|12|(3:14|(1:18)|19)|(1:21)(1:(1:31))|22|23|24|25))|(2:33|(1:35))|12|(0)|(0)(0)|22|23|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0153, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0154, code lost:
    
        cc4.g(r11, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public enb(fnb fnbVar, View view, float f, Runnable runnable) {
        float f2;
        this.E = fnbVar;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = -1L;
        this.c = 0.0f;
        this.d = true;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = hl.p;
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
        int width = view.getWidth();
        this.t = width;
        int height = view.getHeight();
        this.u = height;
        this.j = view.getY();
        this.i = 0.0f;
        if (view instanceof jf0) {
            jf0 jf0Var = (jf0) view;
            int max = Math.max(1, jf0Var.getBoundsRight() - jf0Var.getBoundsLeft());
            this.t = max;
            float boundsLeft = jf0Var.getBoundsLeft() + 0.0f;
            this.i = boundsLeft;
            f2 = boundsLeft;
            width = max;
        } else {
            f2 = 0.0f;
        }
        this.f = runnable;
        this.e = new s8b(this, (byte) 20);
        this.l = 1.5f * f;
        this.m = 1.15f / (((f - 1.0f) / 3.0f) + 1.0f);
        this.C = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.C);
        int save = canvas.save();
        canvas.translate(-f2, 0.0f);
        boolean z = view instanceof wb2;
        if (z) {
            ((wb2) view).Tc = true;
        }
        boolean z2 = view instanceof dl1;
        if (z2) {
            dl1 dl1Var = (dl1) view;
            if (dl1Var.S()) {
                canvas.save();
                canvas.translate(dl1Var.k0 / 2.0f, view.getPaddingTop());
                dl1Var.I(canvas, true);
                dl1Var.L(canvas, true);
                canvas.restore();
                view.draw(canvas);
                if (z) {
                    wb2 wb2Var = (wb2) view;
                    ImageReceiver avatarImage = wb2Var.getAvatarImage();
                    if (avatarImage != null && avatarImage.R0) {
                        canvas.save();
                        canvas.translate(0.0f, -view.getY());
                        avatarImage.h(canvas, null);
                        canvas.restore();
                    }
                    wb2Var.Tc = false;
                }
                if (!z) {
                    canvas.save();
                    canvas.translate(0.0f, view.getPaddingTop());
                    ((wb2) view).i1(canvas);
                    canvas.restore();
                } else if (z2) {
                    ((dl1) view).K(canvas);
                }
                canvas.restoreToCount(save);
                this.i = view.getX() + this.i;
            }
        }
        if (z) {
            wb2 wb2Var2 = (wb2) view;
            if (wb2Var2.L0()) {
                canvas.save();
                canvas.translate(0.0f, view.getPaddingTop());
                wb2Var2.M0(canvas, true, false);
                canvas.restore();
            }
        }
        view.draw(canvas);
        if (z) {
        }
        if (!z) {
        }
        canvas.restoreToCount(save);
        this.i = view.getX() + this.i;
    }
}
