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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class gu7 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public cjb D;
    public boolean E;
    public final sl0 F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public u39 a;
    public dy7 b;
    public d9a c;
    public d9a d;
    public c79 f;
    public final via g;
    public RectF h;
    public m01 i;
    public cjb k;
    public cjb l;
    public final ByteBuffer m;
    public final ByteBuffer n;
    public int o;
    public int p;
    public int q;
    public Map r;
    public int s;
    public final ByteBuffer u;
    public boolean v;
    public qx w;
    public final float[] x;
    public float[] y;
    public cjb z;
    public final HashMap j = new HashMap();
    public final int[] t = new int[1];
    public boolean G = false;
    public final u69 e = new u69();

    public gu7(via viaVar, Bitmap bitmap, int i, sl0 sl0Var) {
        this.F = sl0Var;
        this.g = viaVar;
        this.A = bitmap;
        this.B = i;
        this.u = ByteBuffer.allocateDirect((((int) viaVar.a) * ((int) viaVar.b)) << 2);
        this.x = oie.b(viaVar.a, viaVar.b);
        if (this.m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.m.putFloat(0.0f);
        this.m.putFloat(0.0f);
        this.m.putFloat(viaVar.a);
        this.m.putFloat(0.0f);
        this.m.putFloat(0.0f);
        this.m.putFloat(viaVar.b);
        this.m.putFloat(viaVar.a);
        this.m.putFloat(viaVar.b);
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
        cjb cjbVar = this.k;
        if (cjbVar != null) {
            cjbVar.a(z);
        }
        cjb cjbVar2 = this.D;
        if (cjbVar2 != null) {
            cjbVar2.a(z);
        }
        int i2 = this.p;
        if (i2 != 0) {
            iArr[0] = i2;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.p = 0;
        }
        HashMap hashMap = this.j;
        for (cjb cjbVar3 : hashMap.values()) {
            if (cjbVar3 != null) {
                cjbVar3.a(true);
            }
        }
        hashMap.clear();
        int i3 = this.q;
        if (i3 != 0) {
            iArr[0] = i3;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.q = 0;
        }
        cjb cjbVar4 = this.z;
        if (cjbVar4 != null) {
            cjbVar4.a(true);
        }
        cjb cjbVar5 = this.l;
        if (cjbVar5 != null) {
            cjbVar5.a(true);
        }
        Map map = this.r;
        if (map != null) {
            for (z8a z8aVar : map.values()) {
                if (z8aVar.a != 0) {
                    GLES20.glDeleteProgram(0);
                    z8aVar.a = 0;
                }
            }
            this.r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        qxe.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            via viaVar = this.g;
            GLES20.glViewport(0, 0, (int) viaVar.a, (int) viaVar.b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(TLObject.FLAG_14);
        }
        GLES20.glBindFramebuffer(36160, 0);
        u39 u39Var = this.a;
        if (u39Var != null) {
            u39Var.i0();
        }
        u69 u69Var = this.e;
        u69Var.h = 0;
        u69Var.g = 0.0d;
        ByteBuffer byteBuffer = u69Var.j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.b = null;
        this.J = 0.0f;
    }

    public final void c(dy7 dy7Var, int i, boolean z, vn5 vn5Var) {
        if (this.r == null || this.i == null) {
            return;
        }
        this.f.f(new pj3(this, dy7Var, i, z, vn5Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qx d(dy7 dy7Var, int i, RectF rectF) {
        qx m;
        u39 u39Var;
        Object obj;
        boolean z;
        m01 m01Var = this.i;
        if (dy7Var != null) {
            m01Var = dy7Var.e;
        }
        m01 m01Var2 = m01Var;
        if (this.F == null || !(((z = m01Var2 instanceof g01)) || (m01Var2 instanceof i01))) {
            m = m(rectF, false);
        } else {
            boolean z2 = this.E;
            if (rectF == null || !rectF.setIntersect(rectF, f())) {
                m = null;
            } else {
                ByteBuffer byteBuffer = (ByteBuffer) h(rectF, true, false, false).c;
                Object obj2 = this.a.b;
                qx qxVar = new qx(byteBuffer, 0, rectF);
                ByteBuffer byteBuffer2 = (ByteBuffer) h(rectF, true, true, false).c;
                Object obj3 = this.a.b;
                ((c79) this.a.b).b.b(UUID.randomUUID(), new d97((Object) this, (Object) qxVar, (Object) new qx(byteBuffer2, 1, rectF), z2, (byte) 4));
                m = qxVar;
            }
            this.E = z;
        }
        this.s++;
        int i2 = (this.F == null || !((m01Var2 instanceof g01) || (m01Var2 instanceof i01))) ? 1 : 2;
        for (int i3 = 0; i3 < i2; i3++) {
            GLES20.glBindFramebuffer(36160, i());
            int j = j();
            if (this.F != null && (((m01Var2 instanceof g01) && i3 == 0) || ((m01Var2 instanceof i01) && i3 == 1))) {
                cjb cjbVar = this.D;
                j = cjbVar != null ? cjbVar.c() : 0;
            }
            if (i3 == 1 && (m01Var2 instanceof g01)) {
                m01Var2 = new i01();
            }
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, j, 0);
            via viaVar = this.g;
            GLES20.glViewport(0, 0, (int) viaVar.a, (int) viaVar.b);
            z8a z8aVar = (z8a) this.r.get(m01Var2.h(1));
            if (z8aVar == null) {
                return null;
            }
            GLES20.glUseProgram(z8aVar.a);
            GLES20.glUniformMatrix4fv(z8aVar.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
            GLES20.glUniform1i(z8aVar.d("texture"), 0);
            GLES20.glUniform1i(z8aVar.d("mask"), 1);
            z8a.a(z8aVar.d("color"), bm2.o(i, (int) (m01Var2.e() * Color.alpha(i))));
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, j);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, g());
            if (m01Var2 instanceof g01) {
                GLES20.glUniform1i(z8aVar.d("blured"), 2);
                GLES20.glActiveTexture(33986);
                sl0 sl0Var = this.F;
                if (sl0Var != null) {
                    obj = sl0Var.h;
                    xl0 xl0Var = sl0Var.m;
                    GLES20.glBindTexture(3553, xl0Var != null ? xl0Var.s[2] : -1);
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
        if (this.s <= 0 && (u39Var = this.a) != null) {
            u39Var.i0();
        }
        this.s--;
        u69 u69Var = this.e;
        u69Var.h = 0;
        u69Var.g = 0.0d;
        ByteBuffer byteBuffer3 = u69Var.j;
        if (byteBuffer3 != null) {
            byteBuffer3.position(0);
        }
        this.b = null;
        this.c = null;
        return m;
    }

    public final qx e(d9a d9aVar, int i, RectF rectF) {
        m01 m01Var = d9aVar.a;
        if (m01Var == null) {
            m01Var = this.i;
        }
        qx m = m(rectF, this.F != null && (m01Var instanceof g01));
        this.s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        via viaVar = this.g;
        GLES20.glViewport(0, 0, (int) viaVar.a, (int) viaVar.b);
        z8a z8aVar = (z8a) this.r.get(m01Var.h(1));
        if (z8aVar == null) {
            return null;
        }
        GLES20.glUseProgram(z8aVar.a);
        GLES20.glUniformMatrix4fv(z8aVar.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
        GLES20.glUniform1i(z8aVar.d("texture"), 0);
        GLES20.glUniform1i(z8aVar.d("mask"), 1);
        z8a.a(z8aVar.d("color"), i);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((m01Var instanceof g01) && this.z != null) {
            GLES20.glUniform1i(z8aVar.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.z.c());
        }
        if (m01Var instanceof l01) {
            GLES20.glUniform1i(z8aVar.d(TeXSymbolParser.TYPE_ATTR), d9aVar.a.n());
            GLES20.glUniform2f(z8aVar.d("resolution"), viaVar.a, viaVar.b);
            GLES20.glUniform2f(z8aVar.d("center"), d9aVar.b, d9aVar.c);
            GLES20.glUniform2f(z8aVar.d("radius"), d9aVar.d, d9aVar.e);
            GLES20.glUniform1f(z8aVar.d("thickness"), d9aVar.f);
            GLES20.glUniform1f(z8aVar.d("rounding"), d9aVar.g);
            GLES20.glUniform2f(z8aVar.d("middle"), d9aVar.i, d9aVar.j);
            GLES20.glUniform1f(z8aVar.d("rotation"), d9aVar.h);
            GLES20.glUniform1i(z8aVar.d("fill"), d9aVar.l ? 1 : 0);
            GLES20.glUniform1f(z8aVar.d("arrowTriangleLength"), d9aVar.k);
            GLES20.glUniform1i(z8aVar.d("composite"), 1);
            GLES20.glUniform1i(z8aVar.d("clear"), 0);
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
        u39 u39Var = this.a;
        if (u39Var != null && this.s <= 0) {
            u39Var.i0();
        }
        this.s--;
        u69 u69Var = this.e;
        u69Var.h = 0;
        u69Var.g = 0.0d;
        ByteBuffer byteBuffer = u69Var.j;
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
        via viaVar = this.g;
        return new RectF(0.0f, 0.0f, viaVar.a, viaVar.b);
    }

    public final int g() {
        int i = this.p;
        if (i != 0) {
            return i;
        }
        int b = cjb.b(this.g);
        this.p = b;
        return b;
    }

    public final sk4 h(RectF rectF, boolean z, boolean z2, boolean z3) {
        cjb cjbVar;
        sk4 sk4Var;
        z8a z8aVar;
        cjb cjbVar2;
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
        via viaVar = this.g;
        GLES20.glViewport(0, 0, (int) viaVar.a, (int) viaVar.b);
        Map map = this.r;
        Object obj = null;
        if (map != null) {
            z8a z8aVar2 = (z8a) map.get(z ? "nonPremultipliedBlit" : this.G ? "maskingBlit" : "blit");
            if (z8aVar2 != null) {
                GLES20.glUseProgram(z8aVar2.a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i, -i2);
                float[] c = oie.c(this.x, oie.a(matrix));
                GLES20.glUniformMatrix4fv(z8aVar2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c));
                if (z || !this.G) {
                    GLES20.glUniform1i(z8aVar2.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z2 || (cjbVar = this.D) == null) ? j() : cjbVar.c());
                } else {
                    GLES20.glUniform1i(z8aVar2.d("texture"), 1);
                    GLES20.glUniform1i(z8aVar2.d("mask"), 0);
                    GLES20.glUniform1f(z8aVar2.d("preview"), 0.0f);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z2 || (cjbVar2 = this.D) == null) ? j() : cjbVar2.c());
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
                if (z3 && !z2 && (z8aVar = (z8a) this.r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(z8aVar.a);
                    GLES20.glUniformMatrix4fv(z8aVar.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c));
                    GLES20.glUniform1f(z8aVar.d("flipy"), 0.0f);
                    GLES20.glUniform1i(z8aVar.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(z8aVar.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    xl0 xl0Var = this.F.m;
                    GLES20.glBindTexture(3553, xl0Var != null ? xl0Var.s[2] : -1);
                    GLES20.glUniform1f(z8aVar.d("eraser"), 0.0f);
                    GLES20.glUniform1i(z8aVar.d("mask"), 2);
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
                    sk4Var = new sk4(obj, this.u, b);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.u);
                    sk4Var = new sk4(createBitmap, obj, b);
                }
                this.u.rewind();
                int[] iArr = this.t;
                iArr[0] = i3;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.t;
                iArr2[0] = i4;
                GLES20.glDeleteTextures(1, iArr2, 0);
                return sk4Var;
            }
        }
        return null;
    }

    public final int i() {
        if (this.o == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.o = iArr[0];
            qxe.a();
        }
        return this.o;
    }

    public final int j() {
        cjb cjbVar = this.k;
        if (cjbVar != null) {
            return cjbVar.c();
        }
        return 0;
    }

    public final void k(d9a d9aVar) {
        if (d9aVar == null) {
            return;
        }
        this.f.f(new cu7(this, d9aVar, (byte) 0));
    }

    public final void l(dy7 dy7Var, boolean z, boolean z2) {
        int i;
        int i2;
        double d;
        hd8[] hd8VarArr;
        double d2;
        double d3;
        float atan2;
        hd8 hd8Var;
        float f;
        double d4;
        boolean z3;
        hd8 hd8Var2;
        double d5;
        float f2;
        float f3;
        float f4;
        char c;
        char c2;
        this.b = dy7Var;
        if (dy7Var != null) {
            GLES20.glBindFramebuffer(36160, i());
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
            qxe.a();
            RectF rectF = null;
            if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
                via viaVar = this.g;
                GLES20.glViewport(0, 0, (int) viaVar.a, (int) viaVar.b);
                float f5 = 0.0f;
                if (z) {
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(TLObject.FLAG_14);
                }
                Map map = this.r;
                if (map == null) {
                    return;
                }
                m01 m01Var = dy7Var.e;
                int i3 = 2;
                z8a z8aVar = (z8a) map.get(m01Var.h(2));
                if (z8aVar == null) {
                    return;
                }
                GLES20.glUseProgram(z8aVar.a);
                cjb cjbVar = (cjb) this.j.get(Integer.valueOf(m01Var.k()));
                if (cjbVar == null) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = false;
                    cjbVar = new cjb(BitmapFactory.decodeResource(a.b.getResources(), m01Var.k(), options));
                    this.j.put(Integer.valueOf(m01Var.k()), cjbVar);
                }
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, cjbVar.c());
                GLES20.glUniformMatrix4fv(z8aVar.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
                GLES20.glUniform1i(z8aVar.d("texture"), 0);
                u69 u69Var = this.e;
                if (z2) {
                    u69Var.f = 1.0f;
                } else {
                    u69Var.f = this.f.getScaleX();
                }
                u69 u69Var2 = this.e;
                u69Var2.a = dy7Var.d;
                u69Var2.b = dy7Var.e.j();
                u69Var2.c = z2 ? 1.0f : dy7Var.e.a();
                dy7Var.e.getClass();
                u69Var2.d = 0.0f;
                u69Var2.e = dy7Var.e.g();
                Vector vector = dy7Var.b;
                int size = vector == null ? 0 : vector.size();
                if (size == 0) {
                    i = 0;
                } else {
                    Vector vector2 = dy7Var.b;
                    if (size == 1) {
                        hd8[] hd8VarArr2 = new hd8[vector2.size()];
                        vector2.toArray(hd8VarArr2);
                        hd8 hd8Var3 = hd8VarArr2[0];
                        float f6 = ((u69Var2.a * u69Var2.e) * 1.0f) / u69Var2.f;
                        hd8Var3.getClass();
                        PointF pointF = new PointF((float) hd8Var3.a, (float) hd8Var3.b);
                        float f7 = Math.abs(u69Var2.d) > 0.0f ? u69Var2.d : 0.0f;
                        float f8 = u69Var2.c;
                        u69Var2.c();
                        u69Var2.b(1);
                        u69Var2.a(pointF, f6, f7, f8, 0);
                    } else {
                        int size2 = vector2.size();
                        hd8[] hd8VarArr3 = new hd8[size2];
                        vector2.toArray(hd8VarArr3);
                        u69Var2.c();
                        int i4 = 0;
                        while (i4 < size2 - 1) {
                            hd8 hd8Var4 = hd8VarArr3[i4];
                            int i5 = i4 + 1;
                            hd8 hd8Var5 = hd8VarArr3[i5];
                            double a = hd8Var4.a(hd8Var5);
                            int i6 = size2;
                            double d6 = hd8Var5.a - hd8Var4.a;
                            int i7 = i3;
                            double d7 = hd8Var5.b - hd8Var4.b;
                            double d8 = hd8Var5.c;
                            float f9 = f5;
                            double d9 = d8 - hd8Var4.c;
                            hd8 hd8Var6 = new hd8(1.0d, 1.0d, 0.0d);
                            if (Math.abs(u69Var2.d) > f9) {
                                hd8[] hd8VarArr4 = hd8VarArr3;
                                atan2 = u69Var2.d;
                                hd8VarArr = hd8VarArr4;
                                d = d9;
                                d2 = d6;
                                d3 = d8;
                            } else {
                                d = d9;
                                hd8VarArr = hd8VarArr3;
                                d2 = d6;
                                d3 = d8;
                                atan2 = (float) Math.atan2(d7, d2);
                            }
                            double d10 = d2;
                            float f10 = (float) ((((u69Var2.a * d3) * u69Var2.e) * 1.0d) / u69Var2.f);
                            double max = Math.max(1.0f, u69Var2.b * f10);
                            if (a > 0.0d) {
                                double d11 = 1.0d / a;
                                hd8Var = new hd8(d10 * d11, d7 * d11, d * d11);
                            } else {
                                hd8Var = hd8Var6;
                            }
                            float min = Math.min(1.0f, u69Var2.c * 1.15f);
                            boolean z4 = hd8Var4.d;
                            boolean z5 = hd8Var5.d;
                            hd8[] hd8VarArr5 = hd8VarArr;
                            int ceil = (int) Math.ceil((a - u69Var2.g) / max);
                            int i8 = u69Var2.h;
                            u69Var2.b(ceil);
                            ByteBuffer byteBuffer = u69Var2.j;
                            if (byteBuffer == null || i8 < 0) {
                                f = f10;
                            } else {
                                f = f10;
                                if (i8 < u69Var2.i) {
                                    byteBuffer.position(i8 * 20);
                                }
                            }
                            double d12 = u69Var2.g;
                            hd8 hd8Var7 = new hd8(hd8Var4.a + (hd8Var.a * d12), hd8Var4.b + (hd8Var.b * d12), hd8Var4.c + (hd8Var.c * d12));
                            double d13 = d12;
                            hd8 hd8Var8 = hd8Var7;
                            boolean z6 = true;
                            while (true) {
                                if (d13 > a) {
                                    d4 = d13;
                                    z3 = z5;
                                    hd8Var2 = hd8Var5;
                                    d5 = a;
                                    f2 = f;
                                    f3 = atan2;
                                    break;
                                }
                                d4 = d13;
                                z3 = z5;
                                hd8Var2 = hd8Var5;
                                f2 = f;
                                double d14 = a;
                                f3 = atan2;
                                hd8 hd8Var9 = hd8Var8;
                                boolean a2 = u69Var2.a(new PointF((float) hd8Var8.a, (float) hd8Var8.b), f2, f3, z4 ? min : u69Var2.c, -1);
                                d5 = d14;
                                if (!a2) {
                                    z6 = a2;
                                    break;
                                }
                                hd8 hd8Var10 = new hd8(hd8Var9.a + (hd8Var.a * max), hd8Var9.b + (hd8Var.b * max), hd8Var9.c + (hd8Var.c * max));
                                z6 = a2;
                                f = f2;
                                atan2 = f3;
                                z5 = z3;
                                a = d5;
                                hd8Var8 = hd8Var10;
                                hd8Var5 = hd8Var2;
                                d13 = d4 + max;
                                z4 = false;
                            }
                            if (z6 && z3) {
                                u69Var2.b(1);
                                u69Var2.a(new PointF((float) hd8Var2.a, (float) hd8Var2.b), f2, f3, min, -1);
                            }
                            u69Var2.g = d4 - d5;
                            size2 = i6;
                            i4 = i5;
                            i3 = i7;
                            f5 = f9;
                            hd8VarArr3 = hd8VarArr5;
                        }
                    }
                    float f11 = f5;
                    int i9 = i3;
                    dy7Var.a = u69Var2.g;
                    rectF = new RectF(f11, f11, f11, f11);
                    int i10 = u69Var2.h;
                    if (i10 <= 0) {
                        i = 0;
                    } else {
                        int i11 = i10 - 1;
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((i10 << 2) + (i11 << 1)) * 20);
                        allocateDirect.order(ByteOrder.nativeOrder());
                        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
                        asFloatBuffer.position(0);
                        ByteBuffer byteBuffer2 = u69Var2.j;
                        if (byteBuffer2 != null && u69Var2.i > 0) {
                            byteBuffer2.position(0);
                        }
                        int i12 = 0;
                        for (int i13 = 0; i13 < i10; i13++) {
                            float f12 = u69Var2.j.getFloat();
                            float f13 = u69Var2.j.getFloat();
                            float f14 = u69Var2.j.getFloat();
                            float f15 = u69Var2.j.getFloat();
                            float f16 = u69Var2.j.getFloat();
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
            u39 u39Var = this.a;
            if (u39Var != null) {
                u39Var.i0();
            }
            RectF rectF3 = this.h;
            if (rectF3 != null) {
                rectF3.union(rectF);
            } else {
                this.h = rectF;
            }
        }
    }

    public final qx m(RectF rectF, boolean z) {
        if (rectF == null || !rectF.setIntersect(rectF, f())) {
            return null;
        }
        ByteBuffer byteBuffer = (ByteBuffer) h(rectF, true, z, false).c;
        Object obj = this.a.b;
        qx qxVar = new qx(byteBuffer, z ? 1 : 0, rectF);
        ((c79) this.a.b).b.b(UUID.randomUUID(), new eu7(this, qxVar, (byte) 1));
        return qxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i, dy7 dy7Var, float f) {
        Object obj;
        if (dy7Var != null) {
            m01 m01Var = dy7Var.e;
            if (m01Var == null) {
                m01Var = this.i;
            }
            boolean z = this.G && ((m01Var instanceof k01) || (m01Var instanceof i01));
            Map map = this.r;
            StringBuilder sb = new StringBuilder();
            sb.append(m01Var.h(0));
            sb.append(z ? "_masking" : "");
            z8a z8aVar = (z8a) map.get(sb.toString());
            if (z8aVar == null) {
                return;
            }
            GLES20.glUseProgram(z8aVar.a);
            GLES20.glUniformMatrix4fv(z8aVar.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.y));
            GLES20.glUniform1i(z8aVar.d("texture"), 0);
            GLES20.glUniform1i(z8aVar.d("mask"), 1);
            z8a.a(z8aVar.d("color"), bm2.o(dy7Var.c, (int) (m01Var.e() * Color.alpha(r1) * f)));
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, j());
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, i);
            if (z) {
                GLES20.glUniform1i(z8aVar.d("otexture"), 2);
                GLES20.glUniform1f(z8aVar.d("preview"), 0.4f);
                GLES20.glActiveTexture(33986);
                GLES20.glBindTexture(3553, this.l.c());
            }
            if (m01Var instanceof g01) {
                GLES20.glUniform1i(z8aVar.d("blured"), 2);
                GLES20.glActiveTexture(33986);
                sl0 sl0Var = this.F;
                if (sl0Var != null) {
                    obj = sl0Var.h;
                    xl0 xl0Var = sl0Var.m;
                    GLES20.glBindTexture(3553, xl0Var != null ? xl0Var.s[2] : -1);
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
                    qxe.a();
                }
                cjb cjbVar = this.z;
                if (cjbVar != null) {
                    GLES20.glBindTexture(3553, cjbVar.c());
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
            qxe.a();
        }
    }

    public final void o(int i, int i2, d9a d9aVar, float f) {
        z8a z8aVar;
        if (d9aVar != null) {
            m01 m01Var = this.i;
            l01 l01Var = d9aVar.a;
            if (l01Var != null && i == this.q) {
                m01Var = l01Var;
            }
            if (m01Var == null || this.f == null || (z8aVar = (z8a) this.r.get(m01Var.h(0))) == null) {
                return;
            }
            GLES20.glUseProgram(z8aVar.a);
            GLES20.glUniformMatrix4fv(z8aVar.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.y));
            GLES20.glUniform1i(z8aVar.d("texture"), 0);
            GLES20.glUniform1i(z8aVar.d("mask"), 1);
            z8a.a(z8aVar.d("color"), bm2.o(this.f.getCurrentColor(), (int) (Color.alpha(r6) * f)));
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, i2);
            if (m01Var instanceof l01) {
                GLES20.glUniform1i(z8aVar.d(TeXSymbolParser.TYPE_ATTR), ((l01) m01Var).n());
                int d = z8aVar.d("resolution");
                via viaVar = this.g;
                GLES20.glUniform2f(d, viaVar.a, viaVar.b);
                GLES20.glUniform2f(z8aVar.d("center"), d9aVar.b, d9aVar.c);
                GLES20.glUniform2f(z8aVar.d("radius"), d9aVar.d, d9aVar.e);
                GLES20.glUniform1f(z8aVar.d("thickness"), d9aVar.f);
                GLES20.glUniform1f(z8aVar.d("rounding"), d9aVar.g);
                GLES20.glUniform2f(z8aVar.d("middle"), d9aVar.i, d9aVar.j);
                GLES20.glUniform1f(z8aVar.d("rotation"), d9aVar.h);
                GLES20.glUniform1i(z8aVar.d("fill"), d9aVar.l ? 1 : 0);
                GLES20.glUniform1f(z8aVar.d("arrowTriangleLength"), d9aVar.k);
                GLES20.glUniform1i(z8aVar.d("composite"), 0);
                GLES20.glUniform1i(z8aVar.d("clear"), d9aVar == this.d ? 1 : 0);
            }
            GLES20.glBlendFunc(1, 771);
            GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
            GLES20.glEnableVertexAttribArray(0);
            GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
            GLES20.glEnableVertexAttribArray(1);
            GLES20.glDrawArrays(5, 0, 4);
            qxe.a();
        }
    }

    public final void p(qx qxVar, boolean z) {
        ByteBuffer byteBuffer;
        File file;
        u39 u39Var;
        cjb cjbVar;
        if (qxVar != null) {
            try {
                byte[] bArr = new byte[1024];
                byte[] bArr2 = new byte[1024];
                FileInputStream fileInputStream = new FileInputStream((File) qxVar.d);
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
                fa4.g(e, true);
                byteBuffer = null;
            }
            int j = j();
            if (qxVar.b && (cjbVar = this.D) != null) {
                j = cjbVar.c();
            }
            GLES20.glBindTexture(3553, j);
            RectF rectF = (RectF) qxVar.c;
            GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) qxVar.c).height(), 6408, 5121, byteBuffer);
            if (this.s <= 0 && (u39Var = this.a) != null) {
                u39Var.i0();
            }
            if (!z || (file = (File) qxVar.d) == null) {
                return;
            }
            file.delete();
            qxVar.d = null;
        }
    }

    public final void q(m01 m01Var) {
        Bitmap bitmap;
        Bitmap c;
        this.i = m01Var;
        if ((m01Var instanceof g01) && (bitmap = this.A) != null && this.F == null) {
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
            c79 c79Var = this.f;
            if (c79Var != null && (c = c79Var.c(false, false)) != null) {
                canvas.scale(width / c.getWidth(), height / c.getHeight());
                canvas.drawBitmap(c, 0.0f, 0.0f, this.M);
                c.recycle();
            }
            Utilities.stackBlurBitmap(this.C, 8);
            cjb cjbVar = this.z;
            if (cjbVar != null) {
                cjbVar.a(false);
            }
            this.z = new cjb(this.C);
        }
    }
}
