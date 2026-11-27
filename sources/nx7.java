// default package

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLES20;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.Vector;
import java.util.zip.Inflater;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class nx7 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public ymb D;
    public boolean E;
    public final tl0 F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public xh4 a;
    public j18 b;
    public uca c;
    public uca d;
    public pa9 f;
    public final qma g;
    public RectF h;
    public v01 i;
    public ymb k;
    public ymb l;
    public final ByteBuffer m;
    public final ByteBuffer n;
    public int o;
    public int p;
    public int q;
    public Map r;
    public int s;
    public final ByteBuffer u;
    public boolean v;
    public rx w;
    public final float[] x;
    public float[] y;
    public ymb z;
    public final HashMap j = new HashMap();
    public final int[] t = new int[1];
    public boolean G = false;
    public final ha9 e = new ha9();

    public nx7(qma qmaVar, Bitmap bitmap, int i, tl0 tl0Var) {
        this.F = tl0Var;
        this.g = qmaVar;
        this.A = bitmap;
        this.B = i;
        this.u = ByteBuffer.allocateDirect((((int) qmaVar.a) * ((int) qmaVar.b)) << 2);
        this.x = gne.b(qmaVar.a, qmaVar.b);
        if (this.m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.m.putFloat(0.0f);
        this.m.putFloat(0.0f);
        this.m.putFloat(qmaVar.a);
        this.m.putFloat(0.0f);
        this.m.putFloat(0.0f);
        this.m.putFloat(qmaVar.b);
        this.m.putFloat(qmaVar.a);
        this.m.putFloat(qmaVar.b);
        this.m.rewind();
        if (this.n == null) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
            this.n = allocateDirect2;
            allocateDirect2.order(ByteOrder.nativeOrder());
            allocateDirect2.putFloat(0.0f);
            allocateDirect2.putFloat(0.0f);
            allocateDirect2.putFloat(1.0f);
            allocateDirect2.putFloat(0.0f);
            allocateDirect2.putFloat(0.0f);
            allocateDirect2.putFloat(1.0f);
            allocateDirect2.putFloat(1.0f);
            allocateDirect2.putFloat(1.0f);
            allocateDirect2.rewind();
        }
    }

    public final void a(boolean z) {
        int i = this.o;
        int[] iArr = this.t;
        if (i != 0) {
            iArr[0] = i;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.o = 0;
        }
        ymb ymbVar = this.k;
        if (ymbVar != null) {
            ymbVar.a(z);
        }
        ymb ymbVar2 = this.D;
        if (ymbVar2 != null) {
            ymbVar2.a(z);
        }
        int i2 = this.p;
        if (i2 != 0) {
            iArr[0] = i2;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.p = 0;
        }
        HashMap hashMap = this.j;
        for (ymb ymbVar3 : hashMap.values()) {
            if (ymbVar3 != null) {
                ymbVar3.a(true);
            }
        }
        hashMap.clear();
        int i3 = this.q;
        if (i3 != 0) {
            iArr[0] = i3;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.q = 0;
        }
        ymb ymbVar4 = this.z;
        if (ymbVar4 != null) {
            ymbVar4.a(true);
        }
        ymb ymbVar5 = this.l;
        if (ymbVar5 != null) {
            ymbVar5.a(true);
        }
        Map map = this.r;
        if (map != null) {
            for (qca qcaVar : map.values()) {
                if (qcaVar.a != 0) {
                    GLES20.glDeleteProgram(0);
                    qcaVar.a = 0;
                }
            }
            this.r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        k2f.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            qma qmaVar = this.g;
            GLES20.glViewport(0, 0, (int) qmaVar.a, (int) qmaVar.b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(TLObject.FLAG_14);
        }
        GLES20.glBindFramebuffer(36160, 0);
        xh4 xh4Var = this.a;
        if (xh4Var != null) {
            xh4Var.v();
        }
        ha9 ha9Var = this.e;
        ha9Var.h = 0;
        ha9Var.g = 0.0d;
        ByteBuffer byteBuffer = ha9Var.j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.b = null;
        this.J = 0.0f;
    }

    public final void c(j18 j18Var, int i, boolean z, yp5 yp5Var) {
        if (this.r == null || this.i == null) {
            return;
        }
        this.f.f(new hk3(this, j18Var, i, z, yp5Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final rx d(j18 j18Var, int i, RectF rectF) {
        rx m;
        xh4 xh4Var;
        Object obj;
        boolean z;
        v01 v01Var = this.i;
        if (j18Var != null) {
            v01Var = j18Var.e;
        }
        v01 v01Var2 = v01Var;
        if (this.F == null || !(((z = v01Var2 instanceof p01)) || (v01Var2 instanceof r01))) {
            m = m(rectF, false);
        } else {
            boolean z2 = this.E;
            if (rectF == null || !rectF.setIntersect(rectF, f())) {
                m = null;
            } else {
                ByteBuffer byteBuffer = (ByteBuffer) h(rectF, true, false, false).c;
                Object obj2 = this.a.b;
                rx rxVar = new rx(byteBuffer, 0, rectF);
                ByteBuffer byteBuffer2 = (ByteBuffer) h(rectF, true, true, false).c;
                Object obj3 = this.a.b;
                ((pa9) this.a.b).b.b(UUID.randomUUID(), new lb7((Object) this, (Object) rxVar, (Object) new rx(byteBuffer2, 1, rectF), z2, (byte) 4));
                m = rxVar;
            }
            this.E = z;
        }
        this.s++;
        int i2 = (this.F == null || !((v01Var2 instanceof p01) || (v01Var2 instanceof r01))) ? 1 : 2;
        for (int i3 = 0; i3 < i2; i3++) {
            GLES20.glBindFramebuffer(36160, i());
            int j = j();
            if (this.F != null && (((v01Var2 instanceof p01) && i3 == 0) || ((v01Var2 instanceof r01) && i3 == 1))) {
                ymb ymbVar = this.D;
                j = ymbVar != null ? ymbVar.c() : 0;
            }
            if (i3 == 1 && (v01Var2 instanceof p01)) {
                v01Var2 = new r01();
            }
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, j, 0);
            qma qmaVar = this.g;
            GLES20.glViewport(0, 0, (int) qmaVar.a, (int) qmaVar.b);
            qca qcaVar = (qca) this.r.get(v01Var2.h(1));
            if (qcaVar == null) {
                return null;
            }
            GLES20.glUseProgram(qcaVar.a);
            GLES20.glUniformMatrix4fv(qcaVar.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
            GLES20.glUniform1i(qcaVar.d("texture"), 0);
            GLES20.glUniform1i(qcaVar.d("mask"), 1);
            qca.a(qcaVar.d("color"), vm2.o(i, (int) (v01Var2.e() * Color.alpha(i))));
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, j);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, g());
            if (v01Var2 instanceof p01) {
                GLES20.glUniform1i(qcaVar.d("blured"), 2);
                GLES20.glActiveTexture(33986);
                tl0 tl0Var = this.F;
                if (tl0Var != null) {
                    obj = tl0Var.h;
                    yl0 yl0Var = tl0Var.m;
                    GLES20.glBindTexture(3553, yl0Var != null ? yl0Var.s[2] : -1);
                    GLES20.glBlendFunc(1, 0);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
                    GLES20.glEnableVertexAttribArray(1);
                    if (obj == null) {
                        synchronized (obj) {
                            GLES20.glDrawArrays(5, 0, 4);
                        }
                    } else {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                    GLES20.glBindTexture(3553, j());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                } else {
                    GLES20.glBindTexture(3553, this.z.c());
                }
            }
            obj = null;
            GLES20.glBlendFunc(1, 0);
            GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
            GLES20.glEnableVertexAttribArray(0);
            GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
            GLES20.glEnableVertexAttribArray(1);
            if (obj == null) {
            }
            GLES20.glBindTexture(3553, j());
            GLES20.glTexParameteri(3553, 10241, 9729);
        }
        GLES20.glBindFramebuffer(36160, 0);
        if (this.s <= 0 && (xh4Var = this.a) != null) {
            xh4Var.v();
        }
        this.s--;
        ha9 ha9Var = this.e;
        ha9Var.h = 0;
        ha9Var.g = 0.0d;
        ByteBuffer byteBuffer3 = ha9Var.j;
        if (byteBuffer3 != null) {
            byteBuffer3.position(0);
        }
        this.b = null;
        this.c = null;
        return m;
    }

    public final rx e(uca ucaVar, int i, RectF rectF) {
        v01 v01Var = ucaVar.a;
        if (v01Var == null) {
            v01Var = this.i;
        }
        rx m = m(rectF, this.F != null && (v01Var instanceof p01));
        this.s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        qma qmaVar = this.g;
        GLES20.glViewport(0, 0, (int) qmaVar.a, (int) qmaVar.b);
        qca qcaVar = (qca) this.r.get(v01Var.h(1));
        if (qcaVar == null) {
            return null;
        }
        GLES20.glUseProgram(qcaVar.a);
        GLES20.glUniformMatrix4fv(qcaVar.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
        GLES20.glUniform1i(qcaVar.d("texture"), 0);
        GLES20.glUniform1i(qcaVar.d("mask"), 1);
        qca.a(qcaVar.d("color"), i);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((v01Var instanceof p01) && this.z != null) {
            GLES20.glUniform1i(qcaVar.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.z.c());
        }
        if (v01Var instanceof u01) {
            GLES20.glUniform1i(qcaVar.d(TeXSymbolParser.TYPE_ATTR), ucaVar.a.n());
            GLES20.glUniform2f(qcaVar.d("resolution"), qmaVar.a, qmaVar.b);
            GLES20.glUniform2f(qcaVar.d("center"), ucaVar.b, ucaVar.c);
            GLES20.glUniform2f(qcaVar.d("radius"), ucaVar.d, ucaVar.e);
            GLES20.glUniform1f(qcaVar.d("thickness"), ucaVar.f);
            GLES20.glUniform1f(qcaVar.d("rounding"), ucaVar.g);
            GLES20.glUniform2f(qcaVar.d("middle"), ucaVar.i, ucaVar.j);
            GLES20.glUniform1f(qcaVar.d("rotation"), ucaVar.h);
            GLES20.glUniform1i(qcaVar.d("fill"), ucaVar.l ? 1 : 0);
            GLES20.glUniform1f(qcaVar.d("arrowTriangleLength"), ucaVar.k);
            GLES20.glUniform1i(qcaVar.d("composite"), 1);
            GLES20.glUniform1i(qcaVar.d("clear"), 0);
        }
        GLES20.glBlendFunc(1, 0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glBindFramebuffer(36160, 0);
        xh4 xh4Var = this.a;
        if (xh4Var != null && this.s <= 0) {
            xh4Var.v();
        }
        this.s--;
        ha9 ha9Var = this.e;
        ha9Var.h = 0;
        ha9Var.g = 0.0d;
        ByteBuffer byteBuffer = ha9Var.j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.J = 0.0f;
        this.H = false;
        this.I = 0.0f;
        this.d = null;
        this.b = null;
        this.c = null;
        return m;
    }

    public final RectF f() {
        qma qmaVar = this.g;
        return new RectF(0.0f, 0.0f, qmaVar.a, qmaVar.b);
    }

    public final int g() {
        int i = this.p;
        if (i != 0) {
            return i;
        }
        int b = ymb.b(this.g);
        this.p = b;
        return b;
    }

    public final ym4 h(RectF rectF, boolean z, boolean z2, boolean z3) {
        ymb ymbVar;
        ym4 ym4Var;
        qca qcaVar;
        ymb ymbVar2;
        int i = (int) rectF.left;
        int i2 = (int) rectF.top;
        int width = (int) rectF.width();
        int height = (int) rectF.height();
        GLES20.glGenFramebuffers(1, this.t, 0);
        int i3 = this.t[0];
        GLES20.glBindFramebuffer(36160, i3);
        GLES20.glGenTextures(1, this.t, 0);
        int i4 = this.t[0];
        GLES20.glBindTexture(3553, i4);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i4, 0);
        qma qmaVar = this.g;
        GLES20.glViewport(0, 0, (int) qmaVar.a, (int) qmaVar.b);
        Map map = this.r;
        Object obj = null;
        if (map != null) {
            qca qcaVar2 = (qca) map.get(z ? "nonPremultipliedBlit" : this.G ? "maskingBlit" : "blit");
            if (qcaVar2 != null) {
                GLES20.glUseProgram(qcaVar2.a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i, -i2);
                float[] c = gne.c(this.x, gne.a(matrix));
                GLES20.glUniformMatrix4fv(qcaVar2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c));
                if (z || !this.G) {
                    GLES20.glUniform1i(qcaVar2.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z2 || (ymbVar = this.D) == null) ? j() : ymbVar.c());
                } else {
                    GLES20.glUniform1i(qcaVar2.d("texture"), 1);
                    GLES20.glUniform1i(qcaVar2.d("mask"), 0);
                    GLES20.glUniform1f(qcaVar2.d("preview"), 0.0f);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z2 || (ymbVar2 = this.D) == null) ? j() : ymbVar2.c());
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(3553, this.l.c());
                }
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(TLObject.FLAG_14);
                GLES20.glBlendFunc(1, 0);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                if (z3 && !z2 && (qcaVar = (qca) this.r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(qcaVar.a);
                    GLES20.glUniformMatrix4fv(qcaVar.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c));
                    GLES20.glUniform1f(qcaVar.d("flipy"), 0.0f);
                    GLES20.glUniform1i(qcaVar.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(qcaVar.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    yl0 yl0Var = this.F.m;
                    GLES20.glBindTexture(3553, yl0Var != null ? yl0Var.s[2] : -1);
                    GLES20.glUniform1f(qcaVar.d("eraser"), 0.0f);
                    GLES20.glUniform1i(qcaVar.d("mask"), 2);
                    GLES20.glActiveTexture(33986);
                    GLES20.glBindTexture(3553, j());
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (this.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
                this.u.limit((width * height) << 2);
                GLES20.glReadPixels(0, 0, width, height, 6408, 5121, this.u);
                byte b = 12;
                if (z) {
                    ym4Var = new ym4(obj, this.u, b);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.u);
                    ym4Var = new ym4(createBitmap, obj, b);
                }
                this.u.rewind();
                int[] iArr = this.t;
                iArr[0] = i3;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.t;
                iArr2[0] = i4;
                GLES20.glDeleteTextures(1, iArr2, 0);
                return ym4Var;
            }
        }
        return null;
    }

    public final int i() {
        if (this.o == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.o = iArr[0];
            k2f.a();
        }
        return this.o;
    }

    public final int j() {
        ymb ymbVar = this.k;
        if (ymbVar != null) {
            return ymbVar.c();
        }
        return 0;
    }

    public final void k(uca ucaVar) {
        if (ucaVar == null) {
            return;
        }
        this.f.f(new jx7(this, ucaVar, (byte) 0));
    }

    public final void l(j18 j18Var, boolean z, boolean z2) {
        int i;
        int i2;
        double d;
        vg8[] vg8VarArr;
        double d2;
        double d3;
        float atan2;
        vg8 vg8Var;
        float f;
        double d4;
        boolean z3;
        vg8 vg8Var2;
        double d5;
        float f2;
        float f3;
        float f4;
        char c;
        char c2;
        this.b = j18Var;
        if (j18Var != null) {
            GLES20.glBindFramebuffer(36160, i());
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
            k2f.a();
            RectF rectF = null;
            if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
                qma qmaVar = this.g;
                GLES20.glViewport(0, 0, (int) qmaVar.a, (int) qmaVar.b);
                float f5 = 0.0f;
                if (z) {
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(TLObject.FLAG_14);
                }
                Map map = this.r;
                if (map == null) {
                    return;
                }
                v01 v01Var = j18Var.e;
                int i3 = 2;
                qca qcaVar = (qca) map.get(v01Var.h(2));
                if (qcaVar == null) {
                    return;
                }
                GLES20.glUseProgram(qcaVar.a);
                ymb ymbVar = (ymb) this.j.get(Integer.valueOf(v01Var.k()));
                if (ymbVar == null) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = false;
                    ymbVar = new ymb(BitmapFactory.decodeResource(a.b.getResources(), v01Var.k(), options));
                    this.j.put(Integer.valueOf(v01Var.k()), ymbVar);
                }
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, ymbVar.c());
                GLES20.glUniformMatrix4fv(qcaVar.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
                GLES20.glUniform1i(qcaVar.d("texture"), 0);
                ha9 ha9Var = this.e;
                if (z2) {
                    ha9Var.f = 1.0f;
                } else {
                    ha9Var.f = this.f.getScaleX();
                }
                ha9 ha9Var2 = this.e;
                ha9Var2.a = j18Var.d;
                ha9Var2.b = j18Var.e.j();
                ha9Var2.c = z2 ? 1.0f : j18Var.e.a();
                j18Var.e.getClass();
                ha9Var2.d = 0.0f;
                ha9Var2.e = j18Var.e.g();
                Vector vector = j18Var.b;
                int size = vector == null ? 0 : vector.size();
                if (size == 0) {
                    i = 0;
                } else {
                    Vector vector2 = j18Var.b;
                    if (size == 1) {
                        vg8[] vg8VarArr2 = new vg8[vector2.size()];
                        vector2.toArray(vg8VarArr2);
                        vg8 vg8Var3 = vg8VarArr2[0];
                        float f6 = ((ha9Var2.a * ha9Var2.e) * 1.0f) / ha9Var2.f;
                        vg8Var3.getClass();
                        PointF pointF = new PointF((float) vg8Var3.a, (float) vg8Var3.b);
                        float f7 = Math.abs(ha9Var2.d) > 0.0f ? ha9Var2.d : 0.0f;
                        float f8 = ha9Var2.c;
                        ha9Var2.c();
                        ha9Var2.b(1);
                        ha9Var2.a(pointF, f6, f7, f8, 0);
                    } else {
                        int size2 = vector2.size();
                        vg8[] vg8VarArr3 = new vg8[size2];
                        vector2.toArray(vg8VarArr3);
                        ha9Var2.c();
                        int i4 = 0;
                        while (i4 < size2 - 1) {
                            vg8 vg8Var4 = vg8VarArr3[i4];
                            int i5 = i4 + 1;
                            vg8 vg8Var5 = vg8VarArr3[i5];
                            double a = vg8Var4.a(vg8Var5);
                            int i6 = size2;
                            double d6 = vg8Var5.a - vg8Var4.a;
                            int i7 = i3;
                            double d7 = vg8Var5.b - vg8Var4.b;
                            double d8 = vg8Var5.c;
                            float f9 = f5;
                            double d9 = d8 - vg8Var4.c;
                            vg8 vg8Var6 = new vg8(1.0d, 1.0d, 0.0d);
                            if (Math.abs(ha9Var2.d) > f9) {
                                vg8[] vg8VarArr4 = vg8VarArr3;
                                atan2 = ha9Var2.d;
                                vg8VarArr = vg8VarArr4;
                                d = d9;
                                d2 = d6;
                                d3 = d8;
                            } else {
                                d = d9;
                                vg8VarArr = vg8VarArr3;
                                d2 = d6;
                                d3 = d8;
                                atan2 = (float) Math.atan2(d7, d2);
                            }
                            double d10 = d2;
                            float f10 = (float) ((((ha9Var2.a * d3) * ha9Var2.e) * 1.0d) / ha9Var2.f);
                            double max = Math.max(1.0f, ha9Var2.b * f10);
                            if (a > 0.0d) {
                                double d11 = 1.0d / a;
                                vg8Var = new vg8(d10 * d11, d7 * d11, d * d11);
                            } else {
                                vg8Var = vg8Var6;
                            }
                            float min = Math.min(1.0f, ha9Var2.c * 1.15f);
                            boolean z4 = vg8Var4.d;
                            boolean z5 = vg8Var5.d;
                            vg8[] vg8VarArr5 = vg8VarArr;
                            int ceil = (int) Math.ceil((a - ha9Var2.g) / max);
                            int i8 = ha9Var2.h;
                            ha9Var2.b(ceil);
                            ByteBuffer byteBuffer = ha9Var2.j;
                            if (byteBuffer == null || i8 < 0) {
                                f = f10;
                            } else {
                                f = f10;
                                if (i8 < ha9Var2.i) {
                                    byteBuffer.position(i8 * 20);
                                }
                            }
                            double d12 = ha9Var2.g;
                            vg8 vg8Var7 = new vg8(vg8Var4.a + (vg8Var.a * d12), vg8Var4.b + (vg8Var.b * d12), vg8Var4.c + (vg8Var.c * d12));
                            double d13 = d12;
                            vg8 vg8Var8 = vg8Var7;
                            boolean z6 = true;
                            while (true) {
                                if (d13 > a) {
                                    d4 = d13;
                                    z3 = z5;
                                    vg8Var2 = vg8Var5;
                                    d5 = a;
                                    f2 = f;
                                    f3 = atan2;
                                    break;
                                }
                                d4 = d13;
                                z3 = z5;
                                vg8Var2 = vg8Var5;
                                f2 = f;
                                double d14 = a;
                                f3 = atan2;
                                vg8 vg8Var9 = vg8Var8;
                                boolean a2 = ha9Var2.a(new PointF((float) vg8Var8.a, (float) vg8Var8.b), f2, f3, z4 ? min : ha9Var2.c, -1);
                                d5 = d14;
                                if (!a2) {
                                    z6 = a2;
                                    break;
                                }
                                vg8 vg8Var10 = new vg8(vg8Var9.a + (vg8Var.a * max), vg8Var9.b + (vg8Var.b * max), vg8Var9.c + (vg8Var.c * max));
                                z6 = a2;
                                f = f2;
                                atan2 = f3;
                                z5 = z3;
                                a = d5;
                                vg8Var8 = vg8Var10;
                                vg8Var5 = vg8Var2;
                                d13 = d4 + max;
                                z4 = false;
                            }
                            if (z6 && z3) {
                                ha9Var2.b(1);
                                ha9Var2.a(new PointF((float) vg8Var2.a, (float) vg8Var2.b), f2, f3, min, -1);
                            }
                            ha9Var2.g = d4 - d5;
                            size2 = i6;
                            i4 = i5;
                            i3 = i7;
                            f5 = f9;
                            vg8VarArr3 = vg8VarArr5;
                        }
                    }
                    float f11 = f5;
                    int i9 = i3;
                    j18Var.a = ha9Var2.g;
                    rectF = new RectF(f11, f11, f11, f11);
                    int i10 = ha9Var2.h;
                    if (i10 <= 0) {
                        i = 0;
                    } else {
                        int i11 = i10 - 1;
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((i10 << 2) + (i11 << 1)) * 20);
                        allocateDirect.order(ByteOrder.nativeOrder());
                        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
                        asFloatBuffer.position(0);
                        ByteBuffer byteBuffer2 = ha9Var2.j;
                        if (byteBuffer2 != null && ha9Var2.i > 0) {
                            byteBuffer2.position(0);
                        }
                        int i12 = 0;
                        for (int i13 = 0; i13 < i10; i13++) {
                            float f12 = ha9Var2.j.getFloat();
                            float f13 = ha9Var2.j.getFloat();
                            float f14 = ha9Var2.j.getFloat();
                            float f15 = ha9Var2.j.getFloat();
                            float f16 = ha9Var2.j.getFloat();
                            RectF rectF2 = new RectF(f12 - f14, f13 - f14, f12 + f14, f13 + f14);
                            float f17 = rectF2.left;
                            float f18 = rectF2.top;
                            float f19 = rectF2.right;
                            float f20 = rectF2.bottom;
                            float[] fArr = new float[8];
                            fArr[0] = f17;
                            fArr[1] = f18;
                            fArr[i9] = f19;
                            fArr[3] = f18;
                            fArr[4] = f17;
                            fArr[5] = f20;
                            fArr[6] = f19;
                            fArr[7] = f20;
                            float centerX = rectF2.centerX();
                            float centerY = rectF2.centerY();
                            Matrix matrix = new Matrix();
                            matrix.setRotate((float) Math.toDegrees(f15), centerX, centerY);
                            matrix.mapPoints(fArr);
                            matrix.mapRect(rectF2);
                            rectF2.left = (int) Math.floor(rectF2.left);
                            rectF2.top = (int) Math.floor(rectF2.top);
                            rectF2.right = (int) Math.ceil(rectF2.right);
                            rectF2.bottom = (int) Math.ceil(rectF2.bottom);
                            rectF.union(rectF2);
                            if (i12 != 0) {
                                c = 0;
                                asFloatBuffer.put(fArr[0]);
                                c2 = 1;
                                asFloatBuffer.put(fArr[1]);
                                f4 = 0.0f;
                                asFloatBuffer.put(0.0f);
                                asFloatBuffer.put(0.0f);
                                asFloatBuffer.put(f16);
                                i12++;
                            } else {
                                f4 = 0.0f;
                                c = 0;
                                c2 = 1;
                            }
                            asFloatBuffer.put(fArr[c]);
                            asFloatBuffer.put(fArr[c2]);
                            asFloatBuffer.put(f4);
                            asFloatBuffer.put(f4);
                            asFloatBuffer.put(f16);
                            asFloatBuffer.put(fArr[i9]);
                            asFloatBuffer.put(fArr[3]);
                            asFloatBuffer.put(1.0f);
                            asFloatBuffer.put(f4);
                            asFloatBuffer.put(f16);
                            asFloatBuffer.put(fArr[4]);
                            asFloatBuffer.put(fArr[5]);
                            asFloatBuffer.put(f4);
                            asFloatBuffer.put(1.0f);
                            asFloatBuffer.put(f16);
                            asFloatBuffer.put(fArr[6]);
                            asFloatBuffer.put(fArr[7]);
                            asFloatBuffer.put(1.0f);
                            asFloatBuffer.put(1.0f);
                            asFloatBuffer.put(f16);
                            int i14 = i12 + 4;
                            if (i13 != i11) {
                                asFloatBuffer.put(fArr[6]);
                                asFloatBuffer.put(fArr[7]);
                                asFloatBuffer.put(1.0f);
                                asFloatBuffer.put(1.0f);
                                asFloatBuffer.put(f16);
                                i12 += 5;
                            } else {
                                i12 = i14;
                            }
                        }
                        asFloatBuffer.position(0);
                        GLES20.glVertexAttribPointer(0, 2, 5126, false, 20, (Buffer) asFloatBuffer.slice());
                        GLES20.glEnableVertexAttribArray(0);
                        asFloatBuffer.position(i9);
                        GLES20.glVertexAttribPointer(1, 2, 5126, true, 20, (Buffer) asFloatBuffer.slice());
                        GLES20.glEnableVertexAttribArray(1);
                        asFloatBuffer.position(4);
                        GLES20.glVertexAttribPointer(2, 1, 5126, true, 20, (Buffer) asFloatBuffer.slice());
                        GLES20.glEnableVertexAttribArray(2);
                        i = 0;
                        GLES20.glDrawArrays(5, 0, i12);
                    }
                }
                i2 = 36160;
            } else {
                i = 0;
                i2 = 36160;
            }
            GLES20.glBindFramebuffer(i2, i);
            xh4 xh4Var = this.a;
            if (xh4Var != null) {
                xh4Var.v();
            }
            RectF rectF3 = this.h;
            if (rectF3 != null) {
                rectF3.union(rectF);
            } else {
                this.h = rectF;
            }
        }
    }

    public final rx m(RectF rectF, boolean z) {
        if (rectF == null || !rectF.setIntersect(rectF, f())) {
            return null;
        }
        ByteBuffer byteBuffer = (ByteBuffer) h(rectF, true, z, false).c;
        Object obj = this.a.b;
        rx rxVar = new rx(byteBuffer, z ? 1 : 0, rectF);
        ((pa9) this.a.b).b.b(UUID.randomUUID(), new lx7(this, rxVar, (byte) 1));
        return rxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i, j18 j18Var, float f) {
        Object obj;
        if (j18Var != null) {
            v01 v01Var = j18Var.e;
            if (v01Var == null) {
                v01Var = this.i;
            }
            boolean z = this.G && ((v01Var instanceof t01) || (v01Var instanceof r01));
            Map map = this.r;
            StringBuilder sb = new StringBuilder();
            sb.append(v01Var.h(0));
            sb.append(z ? "_masking" : "");
            qca qcaVar = (qca) map.get(sb.toString());
            if (qcaVar == null) {
                return;
            }
            GLES20.glUseProgram(qcaVar.a);
            GLES20.glUniformMatrix4fv(qcaVar.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.y));
            GLES20.glUniform1i(qcaVar.d("texture"), 0);
            GLES20.glUniform1i(qcaVar.d("mask"), 1);
            qca.a(qcaVar.d("color"), vm2.o(j18Var.c, (int) (v01Var.e() * Color.alpha(r1) * f)));
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, j());
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, i);
            if (z) {
                GLES20.glUniform1i(qcaVar.d("otexture"), 2);
                GLES20.glUniform1f(qcaVar.d("preview"), 0.4f);
                GLES20.glActiveTexture(33986);
                GLES20.glBindTexture(3553, this.l.c());
            }
            if (v01Var instanceof p01) {
                GLES20.glUniform1i(qcaVar.d("blured"), 2);
                GLES20.glActiveTexture(33986);
                tl0 tl0Var = this.F;
                if (tl0Var != null) {
                    obj = tl0Var.h;
                    yl0 yl0Var = tl0Var.m;
                    GLES20.glBindTexture(3553, yl0Var != null ? yl0Var.s[2] : -1);
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
                    GLES20.glEnableVertexAttribArray(1);
                    if (obj == null) {
                        synchronized (obj) {
                            GLES20.glDrawArrays(5, 0, 4);
                        }
                    } else {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                    k2f.a();
                }
                ymb ymbVar = this.z;
                if (ymbVar != null) {
                    GLES20.glBindTexture(3553, ymbVar.c());
                }
            }
            obj = null;
            GLES20.glBlendFunc(1, 771);
            GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
            GLES20.glEnableVertexAttribArray(0);
            GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
            GLES20.glEnableVertexAttribArray(1);
            if (obj == null) {
            }
            k2f.a();
        }
    }

    public final void o(int i, int i2, uca ucaVar, float f) {
        qca qcaVar;
        if (ucaVar != null) {
            v01 v01Var = this.i;
            u01 u01Var = ucaVar.a;
            if (u01Var != null && i == this.q) {
                v01Var = u01Var;
            }
            if (v01Var == null || this.f == null || (qcaVar = (qca) this.r.get(v01Var.h(0))) == null) {
                return;
            }
            GLES20.glUseProgram(qcaVar.a);
            GLES20.glUniformMatrix4fv(qcaVar.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.y));
            GLES20.glUniform1i(qcaVar.d("texture"), 0);
            GLES20.glUniform1i(qcaVar.d("mask"), 1);
            qca.a(qcaVar.d("color"), vm2.o(this.f.getCurrentColor(), (int) (Color.alpha(r6) * f)));
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, i2);
            if (v01Var instanceof u01) {
                GLES20.glUniform1i(qcaVar.d(TeXSymbolParser.TYPE_ATTR), ((u01) v01Var).n());
                int d = qcaVar.d("resolution");
                qma qmaVar = this.g;
                GLES20.glUniform2f(d, qmaVar.a, qmaVar.b);
                GLES20.glUniform2f(qcaVar.d("center"), ucaVar.b, ucaVar.c);
                GLES20.glUniform2f(qcaVar.d("radius"), ucaVar.d, ucaVar.e);
                GLES20.glUniform1f(qcaVar.d("thickness"), ucaVar.f);
                GLES20.glUniform1f(qcaVar.d("rounding"), ucaVar.g);
                GLES20.glUniform2f(qcaVar.d("middle"), ucaVar.i, ucaVar.j);
                GLES20.glUniform1f(qcaVar.d("rotation"), ucaVar.h);
                GLES20.glUniform1i(qcaVar.d("fill"), ucaVar.l ? 1 : 0);
                GLES20.glUniform1f(qcaVar.d("arrowTriangleLength"), ucaVar.k);
                GLES20.glUniform1i(qcaVar.d("composite"), 0);
                GLES20.glUniform1i(qcaVar.d("clear"), ucaVar == this.d ? 1 : 0);
            }
            GLES20.glBlendFunc(1, 771);
            GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
            GLES20.glEnableVertexAttribArray(0);
            GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
            GLES20.glEnableVertexAttribArray(1);
            GLES20.glDrawArrays(5, 0, 4);
            k2f.a();
        }
    }

    public final void p(rx rxVar, boolean z) {
        ByteBuffer byteBuffer;
        File file;
        xh4 xh4Var;
        ymb ymbVar;
        if (rxVar != null) {
            try {
                byte[] bArr = new byte[1024];
                byte[] bArr2 = new byte[1024];
                FileInputStream fileInputStream = new FileInputStream((File) rxVar.d);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Inflater inflater = new Inflater(true);
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read != -1) {
                        inflater.setInput(bArr, 0, read);
                    }
                    while (true) {
                        int inflate = inflater.inflate(bArr2, 0, 1024);
                        if (inflate == 0) {
                            break;
                        } else {
                            byteArrayOutputStream.write(bArr2, 0, inflate);
                        }
                    }
                    if (inflater.finished()) {
                        break;
                    } else {
                        inflater.needsInput();
                    }
                }
                inflater.end();
                ByteBuffer wrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                byteArrayOutputStream.close();
                fileInputStream.close();
                byteBuffer = wrap;
            } catch (Exception e) {
                cc4.g(e, true);
                byteBuffer = null;
            }
            int j = j();
            if (rxVar.b && (ymbVar = this.D) != null) {
                j = ymbVar.c();
            }
            GLES20.glBindTexture(3553, j);
            RectF rectF = (RectF) rxVar.c;
            GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) rxVar.c).height(), 6408, 5121, byteBuffer);
            if (this.s <= 0 && (xh4Var = this.a) != null) {
                xh4Var.v();
            }
            if (!z || (file = (File) rxVar.d) == null) {
                return;
            }
            file.delete();
            rxVar.d = null;
        }
    }

    public final void q(v01 v01Var) {
        Bitmap bitmap;
        Bitmap c;
        this.i = v01Var;
        if ((v01Var instanceof p01) && (bitmap = this.A) != null && this.F == null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = this.B;
            if (i == 90 || i == 270 || i == -90) {
                height = width;
                width = height;
            }
            if (this.C == null) {
                this.C = Bitmap.createBitmap((int) (width / 8.0f), (int) (height / 8.0f), Bitmap.Config.ARGB_8888);
            }
            Canvas canvas = new Canvas(this.C);
            canvas.save();
            canvas.scale(0.125f, 0.125f);
            if (this.M != null) {
                this.M = new Paint(1);
            }
            canvas.save();
            canvas.rotate(i);
            if (i == 90) {
                canvas.translate(0.0f, -width);
            } else if (i == 180) {
                canvas.translate(-width, -height);
            } else if (i == 270) {
                canvas.translate(-height, 0.0f);
            }
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.M);
            canvas.restore();
            pa9 pa9Var = this.f;
            if (pa9Var != null && (c = pa9Var.c(false, false)) != null) {
                canvas.scale(width / c.getWidth(), height / c.getHeight());
                canvas.drawBitmap(c, 0.0f, 0.0f, this.M);
                c.recycle();
            }
            Utilities.stackBlurBitmap(this.C, 8);
            ymb ymbVar = this.z;
            if (ymbVar != null) {
                ymbVar.a(false);
            }
            this.z = new ymb(this.C);
        }
    }
}
