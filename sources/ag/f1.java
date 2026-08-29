package ag;

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
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.ga;
import org.telegram.ui.Components.ma;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f1 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public l2 D;
    public boolean E;
    public final ga F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public o1 a;
    public g1 b;
    public w1 c;
    public w1 d;
    public t1 f;
    public final bv0 g;
    public RectF h;
    public m i;
    public l2 k;
    public l2 l;
    public final ByteBuffer m;
    public final ByteBuffer n;
    public int o;
    public int p;
    public int q;
    public Map r;
    public int s;
    public final ByteBuffer u;
    public boolean v;
    public j2 w;
    public final float[] x;
    public float[] y;
    public l2 z;
    public final HashMap j = new HashMap();
    public final int[] t = new int[1];
    public boolean G = false;
    public final k1 e = new k1();

    public f1(bv0 bv0Var, Bitmap bitmap, int i10, ga gaVar) {
        this.F = gaVar;
        this.g = bv0Var;
        this.A = bitmap;
        this.B = i10;
        this.u = ByteBuffer.allocateDirect(((int) bv0Var.a) * ((int) bv0Var.b) * 4);
        this.x = h7.r.b(bv0Var.a, bv0Var.b);
        if (this.m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.m.putFloat(0.0f);
        this.m.putFloat(0.0f);
        this.m.putFloat(bv0Var.a);
        this.m.putFloat(0.0f);
        this.m.putFloat(0.0f);
        this.m.putFloat(bv0Var.b);
        this.m.putFloat(bv0Var.a);
        this.m.putFloat(bv0Var.b);
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

    public final void a(boolean z10) {
        int i10 = this.o;
        int[] iArr = this.t;
        if (i10 != 0) {
            iArr[0] = i10;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.o = 0;
        }
        l2 l2Var = this.k;
        if (l2Var != null) {
            l2Var.a(z10);
        }
        l2 l2Var2 = this.D;
        if (l2Var2 != null) {
            l2Var2.a(z10);
        }
        int i11 = this.p;
        if (i11 != 0) {
            iArr[0] = i11;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.p = 0;
        }
        HashMap hashMap = this.j;
        for (l2 l2Var3 : hashMap.values()) {
            if (l2Var3 != null) {
                l2Var3.a(true);
            }
        }
        hashMap.clear();
        int i12 = this.q;
        if (i12 != 0) {
            iArr[0] = i12;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.q = 0;
        }
        l2 l2Var4 = this.z;
        if (l2Var4 != null) {
            l2Var4.a(true);
        }
        l2 l2Var5 = this.l;
        if (l2Var5 != null) {
            l2Var5.a(true);
        }
        Map map = this.r;
        if (map != null) {
            for (u1 u1Var : map.values()) {
                if (u1Var.a != 0) {
                    GLES20.glDeleteProgram(0);
                    u1Var.a = 0;
                }
            }
            this.r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        h7.t.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            bv0 bv0Var = this.g;
            GLES20.glViewport(0, 0, (int) bv0Var.a, (int) bv0Var.b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        o1 o1Var = this.a;
        if (o1Var != null) {
            o1Var.c();
        }
        k1 k1Var = this.e;
        k1Var.h = 0;
        k1Var.g = 0.0d;
        ByteBuffer byteBuffer = k1Var.j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.b = null;
        this.J = 0.0f;
    }

    public final void c(g1 g1Var, int i10, boolean z10, h0 h0Var) {
        if (this.r == null || this.i == null) {
            return;
        }
        this.f.f(new d1(this, g1Var, i10, z10, h0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j2 d(g1 g1Var, int i10, RectF rectF) {
        j2 m10;
        o1 o1Var;
        Object obj;
        boolean z10;
        m mVar = this.i;
        if (g1Var != null) {
            mVar = g1Var.e;
        }
        m mVar2 = mVar;
        if (this.F == null || !(((z10 = mVar2 instanceof b)) || (mVar2 instanceof d))) {
            m10 = m(rectF, false);
        } else {
            boolean z11 = this.E;
            if (rectF != null && rectF.setIntersect(rectF, f())) {
                ByteBuffer byteBuffer = (ByteBuffer) h(rectF, true, false, false).b;
                Object obj2 = this.a.b;
                j2 j2Var = new j2(byteBuffer, 0, rectF);
                ByteBuffer byteBuffer2 = (ByteBuffer) h(rectF, true, true, false).b;
                Object obj3 = this.a.b;
                ((t1) this.a.b).b.b(UUID.randomUUID(), new w0(this, j2Var, new j2(byteBuffer2, 1, rectF), z11, 0));
                m10 = j2Var;
            } else {
                m10 = null;
            }
            this.E = z10;
        }
        this.s++;
        int i11 = (this.F == null || !((mVar2 instanceof b) || (mVar2 instanceof d))) ? 1 : 2;
        for (int i12 = 0; i12 < i11; i12++) {
            GLES20.glBindFramebuffer(36160, i());
            int j10 = j();
            if (this.F != null && (((mVar2 instanceof b) && i12 == 0) || ((mVar2 instanceof d) && i12 == 1))) {
                l2 l2Var = this.D;
                j10 = l2Var != null ? l2Var.c() : 0;
            }
            if (i12 == 1 && (mVar2 instanceof b)) {
                mVar2 = new d();
            }
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, j10, 0);
            bv0 bv0Var = this.g;
            GLES20.glViewport(0, 0, (int) bv0Var.a, (int) bv0Var.b);
            u1 u1Var = (u1) this.r.get(mVar2.i(1));
            if (u1Var == null) {
                return null;
            }
            GLES20.glUseProgram(u1Var.a);
            GLES20.glUniformMatrix4fv(u1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
            GLES20.glUniform1i(u1Var.d("texture"), 0);
            GLES20.glUniform1i(u1Var.d("mask"), 1);
            u1.a(u1Var.d("color"), i0.a.k(i10, (int) (mVar2.f() * Color.alpha(i10))));
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, j10);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, g());
            if (mVar2 instanceof b) {
                GLES20.glUniform1i(u1Var.d("blured"), 2);
                GLES20.glActiveTexture(33986);
                ga gaVar = this.F;
                if (gaVar != null) {
                    obj = gaVar.h;
                    ma maVar = gaVar.m;
                    GLES20.glBindTexture(3553, maVar != null ? maVar.s[2] : -1);
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
        if (this.s <= 0 && (o1Var = this.a) != null) {
            o1Var.c();
        }
        this.s--;
        k1 k1Var = this.e;
        k1Var.h = 0;
        k1Var.g = 0.0d;
        ByteBuffer byteBuffer3 = k1Var.j;
        if (byteBuffer3 != null) {
            byteBuffer3.position(0);
        }
        this.b = null;
        this.c = null;
        return m10;
    }

    public final j2 e(w1 w1Var, int i10, RectF rectF) {
        m mVar = w1Var.a;
        if (mVar == null) {
            mVar = this.i;
        }
        j2 m10 = m(rectF, this.F != null && (mVar instanceof b));
        this.s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        bv0 bv0Var = this.g;
        GLES20.glViewport(0, 0, (int) bv0Var.a, (int) bv0Var.b);
        u1 u1Var = (u1) this.r.get(mVar.i(1));
        if (u1Var == null) {
            return null;
        }
        GLES20.glUseProgram(u1Var.a);
        GLES20.glUniformMatrix4fv(u1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
        GLES20.glUniform1i(u1Var.d("texture"), 0);
        GLES20.glUniform1i(u1Var.d("mask"), 1);
        u1.a(u1Var.d("color"), i10);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((mVar instanceof b) && this.z != null) {
            GLES20.glUniform1i(u1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.z.c());
        }
        if (mVar instanceof l) {
            GLES20.glUniform1i(u1Var.d(TeXSymbolParser.TYPE_ATTR), w1Var.a.o());
            GLES20.glUniform2f(u1Var.d("resolution"), bv0Var.a, bv0Var.b);
            GLES20.glUniform2f(u1Var.d("center"), w1Var.b, w1Var.c);
            GLES20.glUniform2f(u1Var.d("radius"), w1Var.d, w1Var.e);
            GLES20.glUniform1f(u1Var.d("thickness"), w1Var.f);
            GLES20.glUniform1f(u1Var.d("rounding"), w1Var.g);
            GLES20.glUniform2f(u1Var.d("middle"), w1Var.i, w1Var.j);
            GLES20.glUniform1f(u1Var.d("rotation"), w1Var.h);
            GLES20.glUniform1i(u1Var.d("fill"), w1Var.l ? 1 : 0);
            GLES20.glUniform1f(u1Var.d("arrowTriangleLength"), w1Var.k);
            GLES20.glUniform1i(u1Var.d("composite"), 1);
            GLES20.glUniform1i(u1Var.d("clear"), 0);
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
        o1 o1Var = this.a;
        if (o1Var != null && this.s <= 0) {
            o1Var.c();
        }
        this.s--;
        k1 k1Var = this.e;
        k1Var.h = 0;
        k1Var.g = 0.0d;
        ByteBuffer byteBuffer = k1Var.j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.J = 0.0f;
        this.H = false;
        this.I = 0.0f;
        this.d = null;
        this.b = null;
        this.c = null;
        return m10;
    }

    public final RectF f() {
        bv0 bv0Var = this.g;
        return new RectF(0.0f, 0.0f, bv0Var.a, bv0Var.b);
    }

    public final int g() {
        if (this.p == 0) {
            this.p = l2.b(this.g);
        }
        return this.p;
    }

    public final ze.b h(RectF rectF, boolean z10, boolean z11, boolean z12) {
        l2 l2Var;
        ze.b bVar;
        u1 u1Var;
        l2 l2Var2;
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
        bv0 bv0Var = this.g;
        GLES20.glViewport(0, 0, (int) bv0Var.a, (int) bv0Var.b);
        Map map = this.r;
        Object obj = null;
        if (map != null) {
            u1 u1Var2 = (u1) map.get(z10 ? "nonPremultipliedBlit" : this.G ? "maskingBlit" : "blit");
            if (u1Var2 != null) {
                GLES20.glUseProgram(u1Var2.a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i10, -i11);
                float[] c3 = h7.r.c(this.x, h7.r.a(matrix));
                GLES20.glUniformMatrix4fv(u1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c3));
                if (z10 || !this.G) {
                    GLES20.glUniform1i(u1Var2.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z11 || (l2Var = this.D) == null) ? j() : l2Var.c());
                } else {
                    GLES20.glUniform1i(u1Var2.d("texture"), 1);
                    GLES20.glUniform1i(u1Var2.d("mask"), 0);
                    GLES20.glUniform1f(u1Var2.d("preview"), 0.0f);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z11 || (l2Var2 = this.D) == null) ? j() : l2Var2.c());
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
                if (z12 && !z11 && (u1Var = (u1) this.r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(u1Var.a);
                    GLES20.glUniformMatrix4fv(u1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c3));
                    GLES20.glUniform1f(u1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(u1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(u1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    ma maVar = this.F.m;
                    GLES20.glBindTexture(3553, maVar != null ? maVar.s[2] : -1);
                    GLES20.glUniform1f(u1Var.d("eraser"), 0.0f);
                    GLES20.glUniform1i(u1Var.d("mask"), 2);
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
                if (z10) {
                    bVar = new ze.b(obj, this.u);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.u);
                    bVar = new ze.b(createBitmap, obj);
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
            h7.t.a();
        }
        return this.o;
    }

    public final int j() {
        l2 l2Var = this.k;
        if (l2Var != null) {
            return l2Var.c();
        }
        return 0;
    }

    public final void k(w1 w1Var) {
        if (w1Var == null) {
            return;
        }
        this.f.f(new a1(this, w1Var, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(g1 g1Var, boolean z10, boolean z11) {
        int i10;
        o1 o1Var;
        RectF rectF;
        j1 j1Var;
        float f9;
        double d;
        boolean z12;
        j1 j1Var2;
        float f10;
        j1[] j1VarArr;
        double d10;
        float f11;
        float f12;
        char c3;
        char c6;
        this.b = g1Var;
        if (g1Var == null) {
            return;
        }
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        h7.t.a();
        RectF rectF2 = null;
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            bv0 bv0Var = this.g;
            GLES20.glViewport(0, 0, (int) bv0Var.a, (int) bv0Var.b);
            if (z10) {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
            }
            Map map = this.r;
            if (map == null) {
                return;
            }
            m mVar = g1Var.e;
            u1 u1Var = (u1) map.get(mVar.i(2));
            if (u1Var == null) {
                return;
            }
            GLES20.glUseProgram(u1Var.a);
            l2 l2Var = (l2) this.j.get(Integer.valueOf(mVar.l()));
            if (l2Var == null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = false;
                l2Var = new l2(BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), mVar.l(), options));
                this.j.put(Integer.valueOf(mVar.l()), l2Var);
            }
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, l2Var.c());
            GLES20.glUniformMatrix4fv(u1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
            GLES20.glUniform1i(u1Var.d("texture"), 0);
            if (z11) {
                this.e.f = 1.0f;
            } else {
                this.e.f = this.f.getScaleX();
            }
            k1 k1Var = this.e;
            k1Var.a = g1Var.d;
            k1Var.b = g1Var.e.k();
            k1Var.c = z11 ? 1.0f : g1Var.e.a();
            k1Var.d = g1Var.e.b();
            k1Var.e = g1Var.e.h();
            Vector vector = g1Var.b;
            int size = vector == null ? 0 : vector.size();
            if (size != 0) {
                if (size == 1) {
                    Vector vector2 = g1Var.b;
                    j1[] j1VarArr2 = new j1[vector2.size()];
                    vector2.toArray(j1VarArr2);
                    j1 j1Var3 = j1VarArr2[0];
                    float f13 = ((k1Var.a * k1Var.e) * 1.0f) / k1Var.f;
                    j1Var3.getClass();
                    PointF pointF = new PointF((float) j1Var3.a, (float) j1Var3.b);
                    float f14 = Math.abs(k1Var.d) > 0.0f ? k1Var.d : 0.0f;
                    float f15 = k1Var.c;
                    k1Var.c();
                    k1Var.b(1);
                    k1Var.a(pointF, f13, f14, f15, 0);
                } else {
                    Vector vector3 = g1Var.b;
                    int size2 = vector3.size();
                    j1[] j1VarArr3 = new j1[size2];
                    vector3.toArray(j1VarArr3);
                    k1Var.c();
                    int i11 = 0;
                    while (i11 < size2 - 1) {
                        j1 j1Var4 = j1VarArr3[i11];
                        int i12 = i11 + 1;
                        j1 j1Var5 = j1VarArr3[i12];
                        double a2 = j1Var4.a(j1Var5);
                        int i13 = size2;
                        double d11 = j1Var5.a - j1Var4.a;
                        double d12 = j1Var5.b - j1Var4.b;
                        double d13 = j1Var5.c;
                        double d14 = d13 - j1Var4.c;
                        j1 j1Var6 = new j1(1.0d, 1.0d, 0.0d);
                        float atan2 = Math.abs(k1Var.d) > 0.0f ? k1Var.d : (float) Math.atan2(d12, d11);
                        float f16 = (float) ((((k1Var.a * d13) * k1Var.e) * 1.0d) / k1Var.f);
                        double max = Math.max(1.0f, k1Var.b * f16);
                        if (a2 > 0.0d) {
                            double d15 = 1.0d / a2;
                            j1Var = new j1(d11 * d15, d12 * d15, d14 * d15);
                        } else {
                            j1Var = j1Var6;
                        }
                        float min = Math.min(1.0f, k1Var.c * 1.15f);
                        boolean z13 = j1Var4.d;
                        boolean z14 = j1Var5.d;
                        float f17 = atan2;
                        int ceil = (int) Math.ceil((a2 - k1Var.g) / max);
                        int i14 = k1Var.h;
                        k1Var.b(ceil);
                        ByteBuffer byteBuffer = k1Var.j;
                        if (byteBuffer == null || i14 < 0) {
                            f9 = f16;
                        } else {
                            f9 = f16;
                            if (i14 < k1Var.i) {
                                byteBuffer.position(i14 * 20);
                            }
                        }
                        double d16 = k1Var.g;
                        j1 j1Var7 = new j1(j1Var4.a + (j1Var.a * d16), j1Var4.b + (j1Var.b * d16), j1Var4.c + (j1Var.c * d16));
                        double d17 = d16;
                        j1 j1Var8 = j1Var7;
                        boolean z15 = true;
                        while (true) {
                            if (d17 > a2) {
                                d = d17;
                                z12 = z14;
                                j1Var2 = j1Var5;
                                f10 = f9;
                                j1VarArr = j1VarArr3;
                                d10 = a2;
                                f11 = f17;
                                break;
                            }
                            float f18 = z13 ? min : k1Var.c;
                            d = d17;
                            z12 = z14;
                            j1[] j1VarArr4 = j1VarArr3;
                            d10 = a2;
                            f11 = f17;
                            float f19 = f18;
                            j1 j1Var9 = j1Var8;
                            j1Var2 = j1Var5;
                            f10 = f9;
                            boolean a10 = k1Var.a(new PointF((float) j1Var8.a, (float) j1Var8.b), f10, f11, f19, -1);
                            if (!a10) {
                                j1VarArr = j1VarArr4;
                                z15 = a10;
                                break;
                            }
                            j1 j1Var10 = new j1(j1Var9.a + (j1Var.a * max), j1Var9.b + (j1Var.b * max), j1Var9.c + (j1Var.c * max));
                            z15 = a10;
                            f17 = f11;
                            j1Var8 = j1Var10;
                            a2 = d10;
                            j1VarArr3 = j1VarArr4;
                            z14 = z12;
                            f9 = f10;
                            j1Var5 = j1Var2;
                            d17 = d + max;
                            z13 = false;
                        }
                        if (z15 && z12) {
                            k1Var.b(1);
                            k1Var.a(new PointF((float) j1Var2.a, (float) j1Var2.b), f10, f11, min, -1);
                        }
                        k1Var.g = d - d10;
                        size2 = i13;
                        i11 = i12;
                        j1VarArr3 = j1VarArr;
                    }
                }
                g1Var.a = k1Var.g;
                rectF2 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
                int i15 = k1Var.h;
                if (i15 > 0) {
                    int i16 = i15 - 1;
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((i16 * 2) + (i15 * 4)) * 20);
                    allocateDirect.order(ByteOrder.nativeOrder());
                    FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
                    asFloatBuffer.position(0);
                    ByteBuffer byteBuffer2 = k1Var.j;
                    if (byteBuffer2 != null && k1Var.i > 0) {
                        byteBuffer2.position(0);
                    }
                    int i17 = 0;
                    for (int i18 = 0; i18 < i15; i18++) {
                        float f20 = k1Var.j.getFloat();
                        float f21 = k1Var.j.getFloat();
                        float f22 = k1Var.j.getFloat();
                        float f23 = k1Var.j.getFloat();
                        float f24 = k1Var.j.getFloat();
                        RectF rectF3 = new RectF(f20 - f22, f21 - f22, f20 + f22, f21 + f22);
                        float f25 = rectF3.left;
                        float f26 = rectF3.top;
                        float f27 = rectF3.right;
                        float f28 = rectF3.bottom;
                        float[] fArr = {f25, f26, f27, f26, f25, f28, f27, f28};
                        float centerX = rectF3.centerX();
                        float centerY = rectF3.centerY();
                        Matrix matrix = new Matrix();
                        matrix.setRotate((float) Math.toDegrees(f23), centerX, centerY);
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
                            c6 = 1;
                            asFloatBuffer.put(fArr[1]);
                            f12 = 0.0f;
                            asFloatBuffer.put(0.0f);
                            asFloatBuffer.put(0.0f);
                            asFloatBuffer.put(f24);
                            i17++;
                        } else {
                            f12 = 0.0f;
                            c3 = 0;
                            c6 = 1;
                        }
                        asFloatBuffer.put(fArr[c3]);
                        asFloatBuffer.put(fArr[c6]);
                        asFloatBuffer.put(f12);
                        asFloatBuffer.put(f12);
                        asFloatBuffer.put(f24);
                        asFloatBuffer.put(fArr[2]);
                        asFloatBuffer.put(fArr[3]);
                        asFloatBuffer.put(1.0f);
                        asFloatBuffer.put(f12);
                        asFloatBuffer.put(f24);
                        asFloatBuffer.put(fArr[4]);
                        asFloatBuffer.put(fArr[5]);
                        asFloatBuffer.put(f12);
                        asFloatBuffer.put(1.0f);
                        asFloatBuffer.put(f24);
                        asFloatBuffer.put(fArr[6]);
                        asFloatBuffer.put(fArr[7]);
                        asFloatBuffer.put(1.0f);
                        asFloatBuffer.put(1.0f);
                        asFloatBuffer.put(f24);
                        int i19 = i17 + 4;
                        if (i18 != i16) {
                            asFloatBuffer.put(fArr[6]);
                            asFloatBuffer.put(fArr[7]);
                            asFloatBuffer.put(1.0f);
                            asFloatBuffer.put(1.0f);
                            asFloatBuffer.put(f24);
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
                    o1Var = this.a;
                    if (o1Var != null) {
                        o1Var.c();
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
        o1Var = this.a;
        if (o1Var != null) {
        }
        rectF = this.h;
        if (rectF == null) {
        }
    }

    public final j2 m(RectF rectF, boolean z10) {
        if (rectF == null || !rectF.setIntersect(rectF, f())) {
            return null;
        }
        ByteBuffer byteBuffer = (ByteBuffer) h(rectF, true, z10, false).b;
        Object obj = this.a.b;
        j2 j2Var = new j2(byteBuffer, z10 ? 1 : 0, rectF);
        ((t1) this.a.b).b.b(UUID.randomUUID(), new c1(this, j2Var, 1));
        return j2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i10, g1 g1Var, float f9) {
        Object obj;
        if (g1Var == null) {
            return;
        }
        m mVar = g1Var.e;
        if (mVar == null) {
            mVar = this.i;
        }
        boolean z10 = this.G && ((mVar instanceof f) || (mVar instanceof d));
        Map map = this.r;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mVar.i(0));
        sb2.append(z10 ? "_masking" : "");
        u1 u1Var = (u1) map.get(sb2.toString());
        if (u1Var == null) {
            return;
        }
        GLES20.glUseProgram(u1Var.a);
        GLES20.glUniformMatrix4fv(u1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.y));
        GLES20.glUniform1i(u1Var.d("texture"), 0);
        GLES20.glUniform1i(u1Var.d("mask"), 1);
        u1.a(u1Var.d("color"), i0.a.k(g1Var.c, (int) (mVar.f() * Color.alpha(r0) * f9)));
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, i10);
        if (z10) {
            GLES20.glUniform1i(u1Var.d("otexture"), 2);
            GLES20.glUniform1f(u1Var.d("preview"), 0.4f);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.l.c());
        }
        if (mVar instanceof b) {
            GLES20.glUniform1i(u1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            ga gaVar = this.F;
            if (gaVar != null) {
                obj = gaVar.h;
                ma maVar = gaVar.m;
                GLES20.glBindTexture(3553, maVar != null ? maVar.s[2] : -1);
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
                h7.t.a();
            }
            l2 l2Var = this.z;
            if (l2Var != null) {
                GLES20.glBindTexture(3553, l2Var.c());
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
        h7.t.a();
    }

    public final void o(int i10, int i11, w1 w1Var, float f9) {
        u1 u1Var;
        if (w1Var == null) {
            return;
        }
        m mVar = this.i;
        l lVar = w1Var.a;
        if (lVar != null && i10 == this.q) {
            mVar = lVar;
        }
        if (mVar == null || this.f == null || (u1Var = (u1) this.r.get(mVar.i(0))) == null) {
            return;
        }
        GLES20.glUseProgram(u1Var.a);
        GLES20.glUniformMatrix4fv(u1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.y));
        GLES20.glUniform1i(u1Var.d("texture"), 0);
        GLES20.glUniform1i(u1Var.d("mask"), 1);
        u1.a(u1Var.d("color"), i0.a.k(this.f.getCurrentColor(), (int) (Color.alpha(r6) * f9)));
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i10);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, i11);
        if (mVar instanceof l) {
            GLES20.glUniform1i(u1Var.d(TeXSymbolParser.TYPE_ATTR), ((l) mVar).o());
            int d = u1Var.d("resolution");
            bv0 bv0Var = this.g;
            GLES20.glUniform2f(d, bv0Var.a, bv0Var.b);
            GLES20.glUniform2f(u1Var.d("center"), w1Var.b, w1Var.c);
            GLES20.glUniform2f(u1Var.d("radius"), w1Var.d, w1Var.e);
            GLES20.glUniform1f(u1Var.d("thickness"), w1Var.f);
            GLES20.glUniform1f(u1Var.d("rounding"), w1Var.g);
            GLES20.glUniform2f(u1Var.d("middle"), w1Var.i, w1Var.j);
            GLES20.glUniform1f(u1Var.d("rotation"), w1Var.h);
            GLES20.glUniform1i(u1Var.d("fill"), w1Var.l ? 1 : 0);
            GLES20.glUniform1f(u1Var.d("arrowTriangleLength"), w1Var.k);
            GLES20.glUniform1i(u1Var.d("composite"), 0);
            GLES20.glUniform1i(u1Var.d("clear"), w1Var == this.d ? 1 : 0);
        }
        GLES20.glBlendFunc(1, 771);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        h7.t.a();
    }

    public final void p(j2 j2Var, boolean z10) {
        ByteBuffer byteBuffer;
        File file;
        o1 o1Var;
        l2 l2Var;
        if (j2Var == null) {
            return;
        }
        try {
            byte[] bArr = new byte[1024];
            byte[] bArr2 = new byte[1024];
            FileInputStream fileInputStream = new FileInputStream((File) j2Var.d);
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
        } catch (Exception e10) {
            FileLog.e(e10);
            byteBuffer = null;
        }
        int j10 = j();
        if (j2Var.b == 1 && (l2Var = this.D) != null) {
            j10 = l2Var.c();
        }
        GLES20.glBindTexture(3553, j10);
        RectF rectF = (RectF) j2Var.c;
        GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) j2Var.c).height(), 6408, 5121, byteBuffer);
        if (this.s <= 0 && (o1Var = this.a) != null) {
            o1Var.c();
        }
        if (!z10 || (file = (File) j2Var.d) == null) {
            return;
        }
        file.delete();
        j2Var.d = null;
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
            t1 t1Var = this.f;
            if (t1Var != null && (c3 = t1Var.c(false, false)) != null) {
                canvas.scale(width / c3.getWidth(), height / c3.getHeight());
                canvas.drawBitmap(c3, 0.0f, 0.0f, this.M);
                c3.recycle();
            }
            Utilities.stackBlurBitmap(this.C, (int) 8.0f);
            l2 l2Var = this.z;
            if (l2Var != null) {
                l2Var.a(false);
            }
            this.z = new l2(this.C);
        }
    }
}
