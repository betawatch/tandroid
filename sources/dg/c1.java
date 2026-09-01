package dg;

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
import j7.b7;
import j7.z6;
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
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.kv0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class c1 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public f2 D;
    public boolean E;
    public final ba F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public o5.i a;
    public d1 b;
    public r1 c;
    public r1 d;
    public o1 f;
    public final kv0 g;
    public RectF h;
    public m i;
    public f2 k;
    public f2 l;
    public final ByteBuffer m;
    public final ByteBuffer n;
    public int o;
    public int p;
    public int q;
    public Map r;
    public int s;
    public final ByteBuffer u;
    public boolean v;
    public b4.e0 w;
    public final float[] x;
    public float[] y;
    public f2 z;
    public final HashMap j = new HashMap();
    public final int[] t = new int[1];
    public boolean G = false;
    public final h1 e = new h1();

    public c1(kv0 kv0Var, Bitmap bitmap, int i10, ba baVar) {
        this.F = baVar;
        this.g = kv0Var;
        this.A = bitmap;
        this.B = i10;
        this.u = ByteBuffer.allocateDirect(((int) kv0Var.a) * ((int) kv0Var.b) * 4);
        this.x = z6.b(kv0Var.a, kv0Var.b);
        if (this.m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.m.putFloat(0.0f);
        this.m.putFloat(0.0f);
        this.m.putFloat(kv0Var.a);
        this.m.putFloat(0.0f);
        this.m.putFloat(0.0f);
        this.m.putFloat(kv0Var.b);
        this.m.putFloat(kv0Var.a);
        this.m.putFloat(kv0Var.b);
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

    public final void a(boolean z4) {
        int i10 = this.o;
        int[] iArr = this.t;
        if (i10 != 0) {
            iArr[0] = i10;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.o = 0;
        }
        f2 f2Var = this.k;
        if (f2Var != null) {
            f2Var.a(z4);
        }
        f2 f2Var2 = this.D;
        if (f2Var2 != null) {
            f2Var2.a(z4);
        }
        int i11 = this.p;
        if (i11 != 0) {
            iArr[0] = i11;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.p = 0;
        }
        HashMap hashMap = this.j;
        for (f2 f2Var3 : hashMap.values()) {
            if (f2Var3 != null) {
                f2Var3.a(true);
            }
        }
        hashMap.clear();
        int i12 = this.q;
        if (i12 != 0) {
            iArr[0] = i12;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.q = 0;
        }
        f2 f2Var4 = this.z;
        if (f2Var4 != null) {
            f2Var4.a(true);
        }
        f2 f2Var5 = this.l;
        if (f2Var5 != null) {
            f2Var5.a(true);
        }
        Map map = this.r;
        if (map != null) {
            for (p1 p1Var : map.values()) {
                if (p1Var.a != 0) {
                    GLES20.glDeleteProgram(0);
                    p1Var.a = 0;
                }
            }
            this.r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        b7.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            kv0 kv0Var = this.g;
            GLES20.glViewport(0, 0, (int) kv0Var.a, (int) kv0Var.b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        o5.i iVar = this.a;
        if (iVar != null) {
            iVar.c();
        }
        h1 h1Var = this.e;
        h1Var.h = 0;
        h1Var.g = 0.0d;
        ByteBuffer byteBuffer = h1Var.j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.b = null;
        this.J = 0.0f;
    }

    public final void c(d1 d1Var, int i10, boolean z4, g0 g0Var) {
        if (this.r == null || this.i == null) {
            return;
        }
        this.f.f(new a1(this, d1Var, i10, z4, g0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b4.e0 d(d1 d1Var, int i10, RectF rectF) {
        b4.e0 m9;
        o5.i iVar;
        Object obj;
        boolean z4;
        m mVar = this.i;
        if (d1Var != null) {
            mVar = d1Var.e;
        }
        m mVar2 = mVar;
        if (this.F == null || !(((z4 = mVar2 instanceof b)) || (mVar2 instanceof d))) {
            m9 = m(rectF, false);
        } else {
            boolean z10 = this.E;
            if (rectF != null && rectF.setIntersect(rectF, f())) {
                ByteBuffer byteBuffer = (ByteBuffer) h(rectF, true, false, false).c;
                Object obj2 = this.a.b;
                b4.e0 e0Var = new b4.e0(byteBuffer, 0, rectF);
                ByteBuffer byteBuffer2 = (ByteBuffer) h(rectF, true, true, false).c;
                Object obj3 = this.a.b;
                ((o1) this.a.b).b.b(UUID.randomUUID(), new t0(this, e0Var, new b4.e0(byteBuffer2, 1, rectF), z10, 0));
                m9 = e0Var;
            } else {
                m9 = null;
            }
            this.E = z4;
        }
        this.s++;
        int i11 = (this.F == null || !((mVar2 instanceof b) || (mVar2 instanceof d))) ? 1 : 2;
        for (int i12 = 0; i12 < i11; i12++) {
            GLES20.glBindFramebuffer(36160, i());
            int j10 = j();
            if (this.F != null && (((mVar2 instanceof b) && i12 == 0) || ((mVar2 instanceof d) && i12 == 1))) {
                f2 f2Var = this.D;
                j10 = f2Var != null ? f2Var.c() : 0;
            }
            if (i12 == 1 && (mVar2 instanceof b)) {
                mVar2 = new d();
            }
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, j10, 0);
            kv0 kv0Var = this.g;
            GLES20.glViewport(0, 0, (int) kv0Var.a, (int) kv0Var.b);
            p1 p1Var = (p1) this.r.get(mVar2.i(1));
            if (p1Var == null) {
                return null;
            }
            GLES20.glUseProgram(p1Var.a);
            GLES20.glUniformMatrix4fv(p1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
            GLES20.glUniform1i(p1Var.d("texture"), 0);
            GLES20.glUniform1i(p1Var.d("mask"), 1);
            p1.a(p1Var.d("color"), i0.a.k(i10, (int) (mVar2.f() * Color.alpha(i10))));
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, j10);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, g());
            if (mVar2 instanceof b) {
                GLES20.glUniform1i(p1Var.d("blured"), 2);
                GLES20.glActiveTexture(33986);
                ba baVar = this.F;
                if (baVar != null) {
                    obj = baVar.h;
                    ha haVar = baVar.m;
                    GLES20.glBindTexture(3553, haVar != null ? haVar.s[2] : -1);
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
        if (this.s <= 0 && (iVar = this.a) != null) {
            iVar.c();
        }
        this.s--;
        h1 h1Var = this.e;
        h1Var.h = 0;
        h1Var.g = 0.0d;
        ByteBuffer byteBuffer3 = h1Var.j;
        if (byteBuffer3 != null) {
            byteBuffer3.position(0);
        }
        this.b = null;
        this.c = null;
        return m9;
    }

    public final b4.e0 e(r1 r1Var, int i10, RectF rectF) {
        m mVar = r1Var.a;
        if (mVar == null) {
            mVar = this.i;
        }
        b4.e0 m9 = m(rectF, this.F != null && (mVar instanceof b));
        this.s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        kv0 kv0Var = this.g;
        GLES20.glViewport(0, 0, (int) kv0Var.a, (int) kv0Var.b);
        p1 p1Var = (p1) this.r.get(mVar.i(1));
        if (p1Var == null) {
            return null;
        }
        GLES20.glUseProgram(p1Var.a);
        GLES20.glUniformMatrix4fv(p1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
        GLES20.glUniform1i(p1Var.d("texture"), 0);
        GLES20.glUniform1i(p1Var.d("mask"), 1);
        p1.a(p1Var.d("color"), i10);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((mVar instanceof b) && this.z != null) {
            GLES20.glUniform1i(p1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.z.c());
        }
        if (mVar instanceof l) {
            GLES20.glUniform1i(p1Var.d(TeXSymbolParser.TYPE_ATTR), r1Var.a.o());
            GLES20.glUniform2f(p1Var.d("resolution"), kv0Var.a, kv0Var.b);
            GLES20.glUniform2f(p1Var.d("center"), r1Var.b, r1Var.c);
            GLES20.glUniform2f(p1Var.d("radius"), r1Var.d, r1Var.e);
            GLES20.glUniform1f(p1Var.d("thickness"), r1Var.f);
            GLES20.glUniform1f(p1Var.d("rounding"), r1Var.g);
            GLES20.glUniform2f(p1Var.d("middle"), r1Var.i, r1Var.j);
            GLES20.glUniform1f(p1Var.d("rotation"), r1Var.h);
            GLES20.glUniform1i(p1Var.d("fill"), r1Var.l ? 1 : 0);
            GLES20.glUniform1f(p1Var.d("arrowTriangleLength"), r1Var.k);
            GLES20.glUniform1i(p1Var.d("composite"), 1);
            GLES20.glUniform1i(p1Var.d("clear"), 0);
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
        o5.i iVar = this.a;
        if (iVar != null && this.s <= 0) {
            iVar.c();
        }
        this.s--;
        h1 h1Var = this.e;
        h1Var.h = 0;
        h1Var.g = 0.0d;
        ByteBuffer byteBuffer = h1Var.j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.J = 0.0f;
        this.H = false;
        this.I = 0.0f;
        this.d = null;
        this.b = null;
        this.c = null;
        return m9;
    }

    public final RectF f() {
        kv0 kv0Var = this.g;
        return new RectF(0.0f, 0.0f, kv0Var.a, kv0Var.b);
    }

    public final int g() {
        if (this.p == 0) {
            this.p = f2.b(this.g);
        }
        return this.p;
    }

    public final bf.b h(RectF rectF, boolean z4, boolean z10, boolean z11) {
        f2 f2Var;
        bf.b bVar;
        p1 p1Var;
        f2 f2Var2;
        int i10 = (int) rectF.left;
        int i11 = (int) rectF.top;
        int width = (int) rectF.width();
        int height = (int) rectF.height();
        GLES20.glGenFramebuffers(1, this.t, 0);
        int i12 = this.t[0];
        GLES20.glBindFramebuffer(36160, i12);
        GLES20.glGenTextures(1, this.t, 0);
        int i13 = this.t[0];
        GLES20.glBindTexture(3553, i13);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i13, 0);
        kv0 kv0Var = this.g;
        GLES20.glViewport(0, 0, (int) kv0Var.a, (int) kv0Var.b);
        Map map = this.r;
        Object obj = null;
        if (map != null) {
            p1 p1Var2 = (p1) map.get(z4 ? "nonPremultipliedBlit" : this.G ? "maskingBlit" : "blit");
            if (p1Var2 != null) {
                GLES20.glUseProgram(p1Var2.a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i10, -i11);
                float[] c3 = z6.c(this.x, z6.a(matrix));
                GLES20.glUniformMatrix4fv(p1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c3));
                if (z4 || !this.G) {
                    GLES20.glUniform1i(p1Var2.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z10 || (f2Var = this.D) == null) ? j() : f2Var.c());
                } else {
                    GLES20.glUniform1i(p1Var2.d("texture"), 1);
                    GLES20.glUniform1i(p1Var2.d("mask"), 0);
                    GLES20.glUniform1f(p1Var2.d("preview"), 0.0f);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z10 || (f2Var2 = this.D) == null) ? j() : f2Var2.c());
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(3553, this.l.c());
                }
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                GLES20.glBlendFunc(1, 0);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                if (z11 && !z10 && (p1Var = (p1) this.r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(p1Var.a);
                    GLES20.glUniformMatrix4fv(p1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c3));
                    GLES20.glUniform1f(p1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(p1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(p1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    ha haVar = this.F.m;
                    GLES20.glBindTexture(3553, haVar != null ? haVar.s[2] : -1);
                    GLES20.glUniform1f(p1Var.d("eraser"), 0.0f);
                    GLES20.glUniform1i(p1Var.d("mask"), 2);
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
                this.u.limit(width * height * 4);
                GLES20.glReadPixels(0, 0, width, height, 6408, 5121, this.u);
                if (z4) {
                    bVar = new bf.b(25, obj, this.u);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.u);
                    bVar = new bf.b(25, createBitmap, obj);
                }
                this.u.rewind();
                int[] iArr = this.t;
                iArr[0] = i12;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.t;
                iArr2[0] = i13;
                GLES20.glDeleteTextures(1, iArr2, 0);
                return bVar;
            }
        }
        return null;
    }

    public final int i() {
        if (this.o == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.o = iArr[0];
            b7.a();
        }
        return this.o;
    }

    public final int j() {
        f2 f2Var = this.k;
        if (f2Var != null) {
            return f2Var.c();
        }
        return 0;
    }

    public final void k(r1 r1Var) {
        if (r1Var == null) {
            return;
        }
        this.f.f(new x0(this, r1Var, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(d1 d1Var, boolean z4, boolean z10) {
        int i10;
        o5.i iVar;
        RectF rectF;
        g1 g1Var;
        float f10;
        double d;
        boolean z11;
        g1 g1Var2;
        float f11;
        g1[] g1VarArr;
        double d10;
        float f12;
        float f13;
        char c3;
        char c10;
        this.b = d1Var;
        if (d1Var == null) {
            return;
        }
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        b7.a();
        RectF rectF2 = null;
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            kv0 kv0Var = this.g;
            GLES20.glViewport(0, 0, (int) kv0Var.a, (int) kv0Var.b);
            if (z4) {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
            }
            Map map = this.r;
            if (map == null) {
                return;
            }
            m mVar = d1Var.e;
            p1 p1Var = (p1) map.get(mVar.i(2));
            if (p1Var == null) {
                return;
            }
            GLES20.glUseProgram(p1Var.a);
            f2 f2Var = (f2) this.j.get(Integer.valueOf(mVar.l()));
            if (f2Var == null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = false;
                f2Var = new f2(BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), mVar.l(), options));
                this.j.put(Integer.valueOf(mVar.l()), f2Var);
            }
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, f2Var.c());
            GLES20.glUniformMatrix4fv(p1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
            GLES20.glUniform1i(p1Var.d("texture"), 0);
            if (z10) {
                this.e.f = 1.0f;
            } else {
                this.e.f = this.f.getScaleX();
            }
            h1 h1Var = this.e;
            h1Var.a = d1Var.d;
            h1Var.b = d1Var.e.k();
            h1Var.c = z10 ? 1.0f : d1Var.e.a();
            h1Var.d = d1Var.e.b();
            h1Var.e = d1Var.e.h();
            Vector vector = d1Var.b;
            int size = vector == null ? 0 : vector.size();
            if (size != 0) {
                if (size == 1) {
                    Vector vector2 = d1Var.b;
                    g1[] g1VarArr2 = new g1[vector2.size()];
                    vector2.toArray(g1VarArr2);
                    g1 g1Var3 = g1VarArr2[0];
                    float f14 = ((h1Var.a * h1Var.e) * 1.0f) / h1Var.f;
                    g1Var3.getClass();
                    PointF pointF = new PointF((float) g1Var3.a, (float) g1Var3.b);
                    float f15 = Math.abs(h1Var.d) > 0.0f ? h1Var.d : 0.0f;
                    float f16 = h1Var.c;
                    h1Var.c();
                    h1Var.b(1);
                    h1Var.a(pointF, f14, f15, f16, 0);
                } else {
                    Vector vector3 = d1Var.b;
                    int size2 = vector3.size();
                    g1[] g1VarArr3 = new g1[size2];
                    vector3.toArray(g1VarArr3);
                    h1Var.c();
                    int i11 = 0;
                    while (i11 < size2 - 1) {
                        g1 g1Var4 = g1VarArr3[i11];
                        int i12 = i11 + 1;
                        g1 g1Var5 = g1VarArr3[i12];
                        double a2 = g1Var4.a(g1Var5);
                        int i13 = size2;
                        double d11 = g1Var5.a - g1Var4.a;
                        double d12 = g1Var5.b - g1Var4.b;
                        double d13 = g1Var5.c;
                        double d14 = d13 - g1Var4.c;
                        g1 g1Var6 = new g1(1.0d, 1.0d, 0.0d);
                        float atan2 = Math.abs(h1Var.d) > 0.0f ? h1Var.d : (float) Math.atan2(d12, d11);
                        float f17 = (float) ((((h1Var.a * d13) * h1Var.e) * 1.0d) / h1Var.f);
                        double max = Math.max(1.0f, h1Var.b * f17);
                        if (a2 > 0.0d) {
                            double d15 = 1.0d / a2;
                            g1Var = new g1(d11 * d15, d12 * d15, d14 * d15);
                        } else {
                            g1Var = g1Var6;
                        }
                        float min = Math.min(1.0f, h1Var.c * 1.15f);
                        boolean z12 = g1Var4.d;
                        boolean z13 = g1Var5.d;
                        float f18 = atan2;
                        int ceil = (int) Math.ceil((a2 - h1Var.g) / max);
                        int i14 = h1Var.h;
                        h1Var.b(ceil);
                        ByteBuffer byteBuffer = h1Var.j;
                        if (byteBuffer == null || i14 < 0) {
                            f10 = f17;
                        } else {
                            f10 = f17;
                            if (i14 < h1Var.i) {
                                byteBuffer.position(i14 * 20);
                            }
                        }
                        double d16 = h1Var.g;
                        g1 g1Var7 = new g1(g1Var4.a + (g1Var.a * d16), g1Var4.b + (g1Var.b * d16), g1Var4.c + (g1Var.c * d16));
                        double d17 = d16;
                        g1 g1Var8 = g1Var7;
                        boolean z14 = true;
                        while (true) {
                            if (d17 > a2) {
                                d = d17;
                                z11 = z13;
                                g1Var2 = g1Var5;
                                f11 = f10;
                                g1VarArr = g1VarArr3;
                                d10 = a2;
                                f12 = f18;
                                break;
                            }
                            float f19 = z12 ? min : h1Var.c;
                            d = d17;
                            z11 = z13;
                            g1[] g1VarArr4 = g1VarArr3;
                            d10 = a2;
                            f12 = f18;
                            float f20 = f19;
                            g1 g1Var9 = g1Var8;
                            g1Var2 = g1Var5;
                            f11 = f10;
                            boolean a10 = h1Var.a(new PointF((float) g1Var8.a, (float) g1Var8.b), f11, f12, f20, -1);
                            if (!a10) {
                                g1VarArr = g1VarArr4;
                                z14 = a10;
                                break;
                            }
                            g1 g1Var10 = new g1(g1Var9.a + (g1Var.a * max), g1Var9.b + (g1Var.b * max), g1Var9.c + (g1Var.c * max));
                            z14 = a10;
                            f18 = f12;
                            g1Var8 = g1Var10;
                            a2 = d10;
                            g1VarArr3 = g1VarArr4;
                            z13 = z11;
                            f10 = f11;
                            g1Var5 = g1Var2;
                            d17 = d + max;
                            z12 = false;
                        }
                        if (z14 && z11) {
                            h1Var.b(1);
                            h1Var.a(new PointF((float) g1Var2.a, (float) g1Var2.b), f11, f12, min, -1);
                        }
                        h1Var.g = d - d10;
                        size2 = i13;
                        i11 = i12;
                        g1VarArr3 = g1VarArr;
                    }
                }
                d1Var.a = h1Var.g;
                rectF2 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
                int i15 = h1Var.h;
                if (i15 > 0) {
                    int i16 = i15 - 1;
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((i16 * 2) + (i15 * 4)) * 20);
                    allocateDirect.order(ByteOrder.nativeOrder());
                    FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
                    asFloatBuffer.position(0);
                    ByteBuffer byteBuffer2 = h1Var.j;
                    if (byteBuffer2 != null && h1Var.i > 0) {
                        byteBuffer2.position(0);
                    }
                    int i17 = 0;
                    for (int i18 = 0; i18 < i15; i18++) {
                        float f21 = h1Var.j.getFloat();
                        float f22 = h1Var.j.getFloat();
                        float f23 = h1Var.j.getFloat();
                        float f24 = h1Var.j.getFloat();
                        float f25 = h1Var.j.getFloat();
                        RectF rectF3 = new RectF(f21 - f23, f22 - f23, f21 + f23, f22 + f23);
                        float f26 = rectF3.left;
                        float f27 = rectF3.top;
                        float f28 = rectF3.right;
                        float f29 = rectF3.bottom;
                        float[] fArr = {f26, f27, f28, f27, f26, f29, f28, f29};
                        float centerX = rectF3.centerX();
                        float centerY = rectF3.centerY();
                        Matrix matrix = new Matrix();
                        matrix.setRotate((float) Math.toDegrees(f24), centerX, centerY);
                        matrix.mapPoints(fArr);
                        matrix.mapRect(rectF3);
                        rectF3.left = (int) Math.floor(rectF3.left);
                        rectF3.top = (int) Math.floor(rectF3.top);
                        rectF3.right = (int) Math.ceil(rectF3.right);
                        rectF3.bottom = (int) Math.ceil(rectF3.bottom);
                        rectF2.union(rectF3);
                        if (i17 != 0) {
                            c3 = 0;
                            asFloatBuffer.put(fArr[0]);
                            c10 = 1;
                            asFloatBuffer.put(fArr[1]);
                            f13 = 0.0f;
                            asFloatBuffer.put(0.0f);
                            asFloatBuffer.put(0.0f);
                            asFloatBuffer.put(f25);
                            i17++;
                        } else {
                            f13 = 0.0f;
                            c3 = 0;
                            c10 = 1;
                        }
                        asFloatBuffer.put(fArr[c3]);
                        asFloatBuffer.put(fArr[c10]);
                        asFloatBuffer.put(f13);
                        asFloatBuffer.put(f13);
                        asFloatBuffer.put(f25);
                        asFloatBuffer.put(fArr[2]);
                        asFloatBuffer.put(fArr[3]);
                        asFloatBuffer.put(1.0f);
                        asFloatBuffer.put(f13);
                        asFloatBuffer.put(f25);
                        asFloatBuffer.put(fArr[4]);
                        asFloatBuffer.put(fArr[5]);
                        asFloatBuffer.put(f13);
                        asFloatBuffer.put(1.0f);
                        asFloatBuffer.put(f25);
                        asFloatBuffer.put(fArr[6]);
                        asFloatBuffer.put(fArr[7]);
                        asFloatBuffer.put(1.0f);
                        asFloatBuffer.put(1.0f);
                        asFloatBuffer.put(f25);
                        int i19 = i17 + 4;
                        if (i18 != i16) {
                            asFloatBuffer.put(fArr[6]);
                            asFloatBuffer.put(fArr[7]);
                            asFloatBuffer.put(1.0f);
                            asFloatBuffer.put(1.0f);
                            asFloatBuffer.put(f25);
                            i17 += 5;
                        } else {
                            i17 = i19;
                        }
                    }
                    asFloatBuffer.position(0);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 20, (Buffer) asFloatBuffer.slice());
                    GLES20.glEnableVertexAttribArray(0);
                    asFloatBuffer.position(2);
                    GLES20.glVertexAttribPointer(1, 2, 5126, true, 20, (Buffer) asFloatBuffer.slice());
                    GLES20.glEnableVertexAttribArray(1);
                    asFloatBuffer.position(4);
                    GLES20.glVertexAttribPointer(2, 1, 5126, true, 20, (Buffer) asFloatBuffer.slice());
                    GLES20.glEnableVertexAttribArray(2);
                    i10 = 0;
                    GLES20.glDrawArrays(5, 0, i17);
                    GLES20.glBindFramebuffer(36160, i10);
                    iVar = this.a;
                    if (iVar != null) {
                        iVar.c();
                    }
                    rectF = this.h;
                    if (rectF == null) {
                        rectF.union(rectF2);
                        return;
                    } else {
                        this.h = rectF2;
                        return;
                    }
                }
            }
        }
        i10 = 0;
        GLES20.glBindFramebuffer(36160, i10);
        iVar = this.a;
        if (iVar != null) {
        }
        rectF = this.h;
        if (rectF == null) {
        }
    }

    public final b4.e0 m(RectF rectF, boolean z4) {
        if (rectF == null || !rectF.setIntersect(rectF, f())) {
            return null;
        }
        ByteBuffer byteBuffer = (ByteBuffer) h(rectF, true, z4, false).c;
        Object obj = this.a.b;
        b4.e0 e0Var = new b4.e0(byteBuffer, z4 ? 1 : 0, rectF);
        ((o1) this.a.b).b.b(UUID.randomUUID(), new z0(this, e0Var, 1));
        return e0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i10, d1 d1Var, float f10) {
        Object obj;
        if (d1Var == null) {
            return;
        }
        m mVar = d1Var.e;
        if (mVar == null) {
            mVar = this.i;
        }
        boolean z4 = this.G && ((mVar instanceof f) || (mVar instanceof d));
        Map map = this.r;
        StringBuilder sb = new StringBuilder();
        sb.append(mVar.i(0));
        sb.append(z4 ? "_masking" : "");
        p1 p1Var = (p1) map.get(sb.toString());
        if (p1Var == null) {
            return;
        }
        GLES20.glUseProgram(p1Var.a);
        GLES20.glUniformMatrix4fv(p1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.y));
        GLES20.glUniform1i(p1Var.d("texture"), 0);
        GLES20.glUniform1i(p1Var.d("mask"), 1);
        p1.a(p1Var.d("color"), i0.a.k(d1Var.c, (int) (mVar.f() * Color.alpha(r0) * f10)));
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, i10);
        if (z4) {
            GLES20.glUniform1i(p1Var.d("otexture"), 2);
            GLES20.glUniform1f(p1Var.d("preview"), 0.4f);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.l.c());
        }
        if (mVar instanceof b) {
            GLES20.glUniform1i(p1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            ba baVar = this.F;
            if (baVar != null) {
                obj = baVar.h;
                ha haVar = baVar.m;
                GLES20.glBindTexture(3553, haVar != null ? haVar.s[2] : -1);
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
                b7.a();
            }
            f2 f2Var = this.z;
            if (f2Var != null) {
                GLES20.glBindTexture(3553, f2Var.c());
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
        b7.a();
    }

    public final void o(int i10, int i11, r1 r1Var, float f10) {
        p1 p1Var;
        if (r1Var == null) {
            return;
        }
        m mVar = this.i;
        l lVar = r1Var.a;
        if (lVar != null && i10 == this.q) {
            mVar = lVar;
        }
        if (mVar == null || this.f == null || (p1Var = (p1) this.r.get(mVar.i(0))) == null) {
            return;
        }
        GLES20.glUseProgram(p1Var.a);
        GLES20.glUniformMatrix4fv(p1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.y));
        GLES20.glUniform1i(p1Var.d("texture"), 0);
        GLES20.glUniform1i(p1Var.d("mask"), 1);
        p1.a(p1Var.d("color"), i0.a.k(this.f.getCurrentColor(), (int) (Color.alpha(r6) * f10)));
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i10);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, i11);
        if (mVar instanceof l) {
            GLES20.glUniform1i(p1Var.d(TeXSymbolParser.TYPE_ATTR), ((l) mVar).o());
            int d = p1Var.d("resolution");
            kv0 kv0Var = this.g;
            GLES20.glUniform2f(d, kv0Var.a, kv0Var.b);
            GLES20.glUniform2f(p1Var.d("center"), r1Var.b, r1Var.c);
            GLES20.glUniform2f(p1Var.d("radius"), r1Var.d, r1Var.e);
            GLES20.glUniform1f(p1Var.d("thickness"), r1Var.f);
            GLES20.glUniform1f(p1Var.d("rounding"), r1Var.g);
            GLES20.glUniform2f(p1Var.d("middle"), r1Var.i, r1Var.j);
            GLES20.glUniform1f(p1Var.d("rotation"), r1Var.h);
            GLES20.glUniform1i(p1Var.d("fill"), r1Var.l ? 1 : 0);
            GLES20.glUniform1f(p1Var.d("arrowTriangleLength"), r1Var.k);
            GLES20.glUniform1i(p1Var.d("composite"), 0);
            GLES20.glUniform1i(p1Var.d("clear"), r1Var == this.d ? 1 : 0);
        }
        GLES20.glBlendFunc(1, 771);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        b7.a();
    }

    public final void p(b4.e0 e0Var, boolean z4) {
        ByteBuffer byteBuffer;
        File file;
        o5.i iVar;
        f2 f2Var;
        if (e0Var == null) {
            return;
        }
        try {
            byte[] bArr = new byte[1024];
            byte[] bArr2 = new byte[1024];
            FileInputStream fileInputStream = new FileInputStream((File) e0Var.d);
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
        } catch (Exception e6) {
            FileLog.e(e6);
            byteBuffer = null;
        }
        int j10 = j();
        if (e0Var.b == 1 && (f2Var = this.D) != null) {
            j10 = f2Var.c();
        }
        GLES20.glBindTexture(3553, j10);
        RectF rectF = (RectF) e0Var.c;
        GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) e0Var.c).height(), 6408, 5121, byteBuffer);
        if (this.s <= 0 && (iVar = this.a) != null) {
            iVar.c();
        }
        if (!z4 || (file = (File) e0Var.d) == null) {
            return;
        }
        file.delete();
        e0Var.d = null;
    }

    public final void q(m mVar) {
        Bitmap bitmap;
        Bitmap c3;
        this.i = mVar;
        if ((mVar instanceof b) && (bitmap = this.A) != null && this.F == null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = this.B;
            if (i10 == 90 || i10 == 270 || i10 == -90) {
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
            canvas.rotate(i10);
            if (i10 == 90) {
                canvas.translate(0.0f, -width);
            } else if (i10 == 180) {
                canvas.translate(-width, -height);
            } else if (i10 == 270) {
                canvas.translate(-height, 0.0f);
            }
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.M);
            canvas.restore();
            o1 o1Var = this.f;
            if (o1Var != null && (c3 = o1Var.c(false, false)) != null) {
                canvas.scale(width / c3.getWidth(), height / c3.getHeight());
                canvas.drawBitmap(c3, 0.0f, 0.0f, this.M);
                c3.recycle();
            }
            Utilities.stackBlurBitmap(this.C, (int) 8.0f);
            f2 f2Var = this.z;
            if (f2Var != null) {
                f2Var.a(false);
            }
            this.z = new f2(this.C);
        }
    }
}
