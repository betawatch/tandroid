// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class glb {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final /* synthetic */ hlb E;
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
    /* JADX WARN: Type inference failed for: r0v0, types: [glb, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public glb(hlb hlbVar, ArrayList arrayList, Runnable runnable) {
        r59 r59Var;
        mu1 mu1Var;
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
        obj.E = hlbVar;
        ArrayList arrayList6 = new ArrayList();
        obj.a = arrayList6;
        obj.b = -1L;
        obj.c = 0.0f;
        obj.d = true;
        obj.g = 0.0f;
        obj.h = 0.0f;
        obj.i = 0.0f;
        obj.j = 0.0f;
        obj.k = gm.p;
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
        obj.e = new sf(arrayList, b);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (arrayList.get(i11) instanceof rc2) {
                ((rc2) arrayList.get(i11)).Tc = true;
            }
        }
        obj.C = Bitmap.createBitmap(obj.t, obj.u, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(obj.C);
        if (arrayList.size() <= 0 || !(((View) arrayList.get(0)).getParent() instanceof r59)) {
            return;
        }
        r59 r59Var2 = (r59) ((View) arrayList.get(0)).getParent();
        if (r59Var2.getParent() instanceof mu1) {
            mu1 mu1Var2 = (mu1) r59Var2.getParent();
            yv1 chatActivity = mu1Var2.getChatActivity();
            ArrayList arrayList7 = new ArrayList(10);
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            ArrayList arrayList10 = new ArrayList();
            ArrayList arrayList11 = new ArrayList();
            int save = canvas.save();
            int i12 = 0;
            glb glbVar = obj;
            while (i12 < 3) {
                arrayList7.clear();
                if (i12 != 2 || r59Var2.W1) {
                    r59Var = r59Var2;
                    int i13 = 0;
                    while (true) {
                        mu1Var = mu1Var2;
                        if (i13 >= arrayList.size()) {
                            break;
                        }
                        View view2 = (View) arrayList.get(i13);
                        if (view2 instanceof rc2) {
                            rc2 rc2Var = (rc2) view2;
                            if (view2.getY() <= r59Var.getHeight() && view2.getY() + view2.getHeight() >= 0.0f) {
                                i4 = i13;
                                if (rc2Var.getVisibility() == 4 || rc2Var.getVisibility() == 8) {
                                    i3 = i12;
                                    f3 = f5;
                                    f4 = f6;
                                    arrayList5 = arrayList9;
                                    i13 = i4 + 1;
                                    arrayList9 = arrayList5;
                                    mu1Var2 = mu1Var;
                                    f5 = f3;
                                    f6 = f4;
                                    i12 = i3;
                                } else {
                                    f47 currentMessagesGroup = rc2Var.getCurrentMessagesGroup();
                                    c47 d = currentMessagesGroup != null ? currentMessagesGroup.d(rc2Var.getMessageObject()) : null;
                                    f3 = f5;
                                    if (i12 == 0) {
                                        if (d != null) {
                                            if (!d.h) {
                                                if (d.a == 0) {
                                                }
                                                if (d == null || rc2Var.getTransitionParams().D0 || rc2Var.getTransitionParams().x0) {
                                                    if (d != null || (d.l & rc2Var.C()) != 0) {
                                                        arrayList10.add(rc2Var);
                                                    }
                                                    if (d != null) {
                                                        int i14 = d.l;
                                                        if ((i14 & 8) != 0) {
                                                        }
                                                    }
                                                    arrayList11.add(rc2Var);
                                                }
                                            }
                                        }
                                        if (d == null || d.h) {
                                            arrayList8.add(rc2Var);
                                        }
                                        if ((d == null || (d.a == 0 && d.c == 0)) && rc2Var.k2()) {
                                            arrayList9.add(rc2Var);
                                        }
                                        if (d == null) {
                                        }
                                        if (d != null) {
                                        }
                                        arrayList10.add(rc2Var);
                                        if (d != null) {
                                        }
                                        arrayList11.add(rc2Var);
                                    }
                                    if (currentMessagesGroup != null) {
                                        e47 e47Var = currentMessagesGroup.m;
                                        if (i12 == 0) {
                                            f4 = f6;
                                            i5 = 1;
                                        } else {
                                            f4 = f6;
                                            i5 = 1;
                                        }
                                        if ((i12 != i5 || e47Var.i) && ((i12 != 0 || !rc2Var.getMessageObject().Z) && (i12 != 1 || rc2Var.getMessageObject().Z))) {
                                            boolean z = rc2Var.La;
                                            if (i12 != 2 ? !z : z) {
                                                if (!arrayList7.contains(currentMessagesGroup)) {
                                                    e47Var.a = 0;
                                                    e47Var.b = 0;
                                                    e47Var.c = 0;
                                                    e47Var.d = 0;
                                                    e47Var.l = false;
                                                    e47Var.k = false;
                                                    e47Var.m = rc2Var;
                                                    arrayList7.add(currentMessagesGroup);
                                                }
                                                e47Var.k = rc2Var.L2();
                                                e47Var.l = rc2Var.K2();
                                                int backgroundDrawableLeft = rc2Var.getBackgroundDrawableLeft() + rc2Var.getLeft();
                                                int backgroundDrawableRight = rc2Var.getBackgroundDrawableRight() + rc2Var.getLeft();
                                                int backgroundDrawableTop = rc2Var.getBackgroundDrawableTop() + rc2Var.getPaddingTop() + rc2Var.getTop();
                                                int backgroundDrawableBottom = rc2Var.getBackgroundDrawableBottom() + rc2Var.getPaddingTop() + rc2Var.getTop();
                                                int L = (rc2Var.getCurrentPosition().l & 4) == 0 ? backgroundDrawableTop - gm.L(10.0f) : backgroundDrawableTop;
                                                i3 = i12;
                                                arrayList5 = arrayList9;
                                                int L2 = (rc2Var.getCurrentPosition().l & 8) == 0 ? gm.L(10.0f) + backgroundDrawableBottom : backgroundDrawableBottom;
                                                if (rc2Var.La) {
                                                    e47Var.m = rc2Var;
                                                }
                                                int i15 = e47Var.b;
                                                if (i15 == 0 || L < i15) {
                                                    e47Var.b = L;
                                                }
                                                int i16 = e47Var.d;
                                                if (i16 == 0 || L2 > i16) {
                                                    e47Var.d = L2;
                                                }
                                                int i17 = e47Var.a;
                                                if (i17 == 0 || backgroundDrawableLeft < i17) {
                                                    e47Var.a = backgroundDrawableLeft;
                                                }
                                                int i18 = e47Var.c;
                                                if (i18 == 0 || backgroundDrawableRight > i18) {
                                                    e47Var.c = backgroundDrawableRight;
                                                }
                                                i13 = i4 + 1;
                                                arrayList9 = arrayList5;
                                                mu1Var2 = mu1Var;
                                                f5 = f3;
                                                f6 = f4;
                                                i12 = i3;
                                            }
                                        }
                                        i3 = i12;
                                        arrayList5 = arrayList9;
                                        i13 = i4 + 1;
                                        arrayList9 = arrayList5;
                                        mu1Var2 = mu1Var;
                                        f5 = f3;
                                        f6 = f4;
                                        i12 = i3;
                                    } else {
                                        i3 = i12;
                                        f4 = f6;
                                        arrayList5 = arrayList9;
                                        i13 = i4 + 1;
                                        arrayList9 = arrayList5;
                                        mu1Var2 = mu1Var;
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
                        mu1Var2 = mu1Var;
                        f5 = f3;
                        f6 = f4;
                        i12 = i3;
                    }
                    i = i12;
                    f = f5;
                    f2 = f6;
                    ArrayList arrayList12 = arrayList9;
                    int i19 = 0;
                    glb glbVar2 = glbVar;
                    while (i19 < arrayList7.size()) {
                        f47 f47Var = (f47) arrayList7.get(i19);
                        e47 e47Var2 = f47Var.m;
                        float U1 = e47Var2.m.U1(true);
                        float f7 = e47Var2.a + U1 + e47Var2.e;
                        float f8 = e47Var2.b + e47Var2.f;
                        float f9 = e47Var2.c + U1 + e47Var2.g;
                        int i20 = i19;
                        float f10 = e47Var2.d + e47Var2.h;
                        if (!e47Var2.j) {
                            f8 += e47Var2.m.getTranslationY();
                            f10 += e47Var2.m.getTranslationY();
                        }
                        f8 = f8 < (chatActivity.P9 - ((float) chatActivity.R9)) - ((float) gm.L(20.0f)) ? (chatActivity.P9 - chatActivity.R9) - gm.L(20.0f) : f8;
                        f10 = f10 > ((float) (gm.L(20.0f) + r59Var.getMeasuredHeight())) ? gm.L(20.0f) + r59Var.getMeasuredHeight() : f10;
                        float f11 = glbVar2.j;
                        float f12 = f8 - f11;
                        float f13 = f10 - f11;
                        float f14 = glbVar2.i;
                        float f15 = f7 - f14;
                        float f16 = f9 - f14;
                        boolean z2 = (e47Var2.m.getScaleX() == 1.0f && e47Var2.m.getScaleY() == 1.0f) ? false : true;
                        if (z2) {
                            canvas.save();
                            arrayList3 = arrayList7;
                            arrayList4 = arrayList10;
                            i2 = save;
                            canvas.scale(e47Var2.m.getScaleX(), e47Var2.m.getScaleY(), aq1.z(f16, f15, 2.0f, f15), aq1.z(f13, f12, 2.0f, f12));
                        } else {
                            i2 = save;
                            arrayList3 = arrayList7;
                            arrayList4 = arrayList10;
                        }
                        ArrayList arrayList13 = arrayList12;
                        ArrayList arrayList14 = arrayList4;
                        float f17 = 2.0f;
                        e47Var2.m.K0(canvas, (int) f15, (int) f12, (int) f16, (int) f13, e47Var2.k, e47Var2.l, false, mu1Var.getKeyboardHeight());
                        e47Var2.m = null;
                        e47Var2.o = f47Var.c;
                        if (z2) {
                            canvas.restore();
                            int i21 = 0;
                            while (i21 < arrayList.size()) {
                                View view3 = (View) arrayList.get(i21);
                                float f18 = f17;
                                if (view3 instanceof rc2) {
                                    rc2 rc2Var2 = (rc2) view3;
                                    if (rc2Var2.getCurrentMessagesGroup() == f47Var) {
                                        int left = rc2Var2.getLeft();
                                        int top = rc2Var2.getTop();
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
                        glbVar2 = this;
                    }
                    arrayList2 = arrayList12;
                } else {
                    r59Var = r59Var2;
                    i = i12;
                    mu1Var = mu1Var2;
                    f = f5;
                    f2 = f6;
                    arrayList2 = arrayList9;
                }
                i12 = i + 1;
                r59Var2 = r59Var;
                arrayList9 = arrayList2;
                arrayList10 = arrayList10;
                mu1Var2 = mu1Var;
                f5 = f;
                f6 = f2;
                arrayList7 = arrayList7;
                save = save;
                glbVar = this;
            }
            r59 r59Var3 = r59Var2;
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
                if (view4 instanceof rc2) {
                    ((rc2) view4).i1(canvas);
                } else if (view4 instanceof cm1) {
                    ((cm1) view4).H(canvas);
                }
                canvas.restore();
            }
            r59Var3.getY();
            float f21 = chatActivity.P9;
            gm.L(4.0f);
            int size = arrayList8.size();
            if (size > 0) {
                for (int i24 = 0; i24 < size; i24++) {
                    rc2 rc2Var3 = (rc2) arrayList8.get(i24);
                    b(canvas, rc2Var3, 0, rc2Var3.getX() - f20, rc2Var3.getY() - f19);
                }
                arrayList8.clear();
            }
            int size2 = arrayList15.size();
            if (size2 > 0) {
                for (int i25 = 0; i25 < size2; i25++) {
                    rc2 rc2Var4 = (rc2) arrayList15.get(i25);
                    b(canvas, rc2Var4, 1, rc2Var4.getX() - f20, rc2Var4.getY() - f19);
                }
                arrayList15.clear();
            }
            int size3 = arrayList16.size();
            if (size3 > 0) {
                for (int i26 = 0; i26 < size3; i26++) {
                    rc2 rc2Var5 = (rc2) arrayList16.get(i26);
                    if (rc2Var5.getCurrentPosition() != null || rc2Var5.getTransitionParams().x0) {
                        b(canvas, rc2Var5, 2, rc2Var5.getX() - f20, rc2Var5.getY() - f19);
                    }
                }
                arrayList16.clear();
            }
            int size4 = arrayList11.size();
            if (size4 > 0) {
                for (int i27 = 0; i27 < size4; i27++) {
                    rc2 rc2Var6 = (rc2) arrayList11.get(i27);
                    if (rc2Var6.getCurrentPosition() != null || rc2Var6.getTransitionParams().x0) {
                        b(canvas, rc2Var6, 3, rc2Var6.getX() - f20, rc2Var6.getY() - f19);
                    }
                }
                arrayList11.clear();
            }
            try {
                canvas.restoreToCount(i22);
            } catch (Exception e) {
                fc4.g(e, true);
            }
            for (int i28 = 0; i28 < arrayList.size(); i28++) {
                if (arrayList.get(i28) instanceof rc2) {
                    ((rc2) arrayList.get(i28)).Tc = false;
                }
            }
        }
    }

    public static void b(Canvas canvas, rc2 rc2Var, int i, float f, float f2) {
        canvas.save();
        float alpha = rc2Var.a() ? rc2Var.getAlpha() : 1.0f;
        canvas.translate(f, f2);
        rc2Var.setInvalidatesParent(true);
        if (i == 0) {
            rc2Var.A1(alpha, canvas, true);
        } else if (i == 1) {
            rc2Var.h1(canvas, alpha);
        } else if (i == 2) {
            rc2Var.Q0(alpha, canvas, rc2Var.getCurrentPosition() != null && (rc2Var.getCurrentPosition().l & 1) == 0);
        } else if (rc2Var.getCurrentPosition() == null || (rc2Var.getCurrentPosition().l & 1) != 0) {
            rc2Var.q1(canvas, alpha, null);
            rc2Var.V0(canvas, alpha);
        }
        rc2Var.setInvalidatesParent(false);
        canvas.restore();
    }

    public final void a() {
        try {
            GLES20.glDeleteBuffers(2, this.B, 0);
        } catch (Exception e) {
            fc4.g(e, true);
        }
        hlb hlbVar = this.E;
        int i = hlbVar.x;
        if (i != 0) {
            try {
                GLES20.glDeleteProgram(i);
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
            hlbVar.x = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e3) {
            fc4.g(e3, true);
        }
        Runnable runnable = this.f;
        if (runnable != null) {
            jlb.b(runnable);
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

    public glb(hlb hlbVar, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = hlbVar;
        this.a = new ArrayList();
        this.b = -1L;
        this.c = 0.0f;
        this.d = true;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = gm.p;
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
        this.t = (int) oqe.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.u = (int) oqe.a(fArr[4], fArr[5], fArr[6], fArr[7]);
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
    
        fc4.g(r11, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public glb(hlb hlbVar, View view, float f, Runnable runnable) {
        float f2;
        this.E = hlbVar;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = -1L;
        this.c = 0.0f;
        this.d = true;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = gm.p;
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
        if (view instanceof hg0) {
            hg0 hg0Var = (hg0) view;
            int max = Math.max(1, hg0Var.getBoundsRight() - hg0Var.getBoundsLeft());
            this.t = max;
            float boundsLeft = hg0Var.getBoundsLeft() + 0.0f;
            this.i = boundsLeft;
            f2 = boundsLeft;
            width = max;
        } else {
            f2 = 0.0f;
        }
        this.f = runnable;
        this.e = new zcb(this, (byte) 11);
        this.l = 1.5f * f;
        this.m = 1.15f / (((f - 1.0f) / 3.0f) + 1.0f);
        this.C = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.C);
        int save = canvas.save();
        canvas.translate(-f2, 0.0f);
        boolean z = view instanceof rc2;
        if (z) {
            ((rc2) view).Tc = true;
        }
        boolean z2 = view instanceof cm1;
        if (z2) {
            cm1 cm1Var = (cm1) view;
            if (cm1Var.Q()) {
                canvas.save();
                canvas.translate(cm1Var.k0 / 2.0f, view.getPaddingTop());
                cm1Var.F(canvas, true);
                cm1Var.I(canvas, true);
                canvas.restore();
                view.draw(canvas);
                if (z) {
                    rc2 rc2Var = (rc2) view;
                    ImageReceiver avatarImage = rc2Var.getAvatarImage();
                    if (avatarImage != null && avatarImage.R0) {
                        canvas.save();
                        canvas.translate(0.0f, -view.getY());
                        avatarImage.h(canvas, null);
                        canvas.restore();
                    }
                    rc2Var.Tc = false;
                }
                if (!z) {
                    canvas.save();
                    canvas.translate(0.0f, view.getPaddingTop());
                    ((rc2) view).i1(canvas);
                    canvas.restore();
                } else if (z2) {
                    ((cm1) view).H(canvas);
                }
                canvas.restoreToCount(save);
                this.i = view.getX() + this.i;
            }
        }
        if (z) {
            rc2 rc2Var2 = (rc2) view;
            if (rc2Var2.L0()) {
                canvas.save();
                canvas.translate(0.0f, view.getPaddingTop());
                rc2Var2.M0(canvas, true, false);
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
