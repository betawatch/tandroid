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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hw7 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public dlb D;
    public boolean E;
    public final sm0 F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public x59 a;
    public f08 b;
    public dba c;
    public dba d;
    public e99 f;
    public final xka g;
    public RectF h;
    public u11 i;
    public dlb k;
    public dlb l;
    public final ByteBuffer m;
    public final ByteBuffer n;
    public int o;
    public int p;
    public int q;
    public Map r;
    public int s;
    public final ByteBuffer u;
    public boolean v;
    public ry w;
    public final float[] x;
    public float[] y;
    public dlb z;
    public final HashMap j = new HashMap();
    public final int[] t = new int[1];
    public boolean G = false;
    public final w89 e = new w89();

    public hw7(xka xkaVar, Bitmap bitmap, int i, sm0 sm0Var) {
        this.F = sm0Var;
        this.g = xkaVar;
        this.A = bitmap;
        this.B = i;
        this.u = ByteBuffer.allocateDirect((((int) xkaVar.a) * ((int) xkaVar.b)) << 2);
        this.x = pke.b(xkaVar.a, xkaVar.b);
        if (this.m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.m.putFloat(0.0f);
        this.m.putFloat(0.0f);
        this.m.putFloat(xkaVar.a);
        this.m.putFloat(0.0f);
        this.m.putFloat(0.0f);
        this.m.putFloat(xkaVar.b);
        this.m.putFloat(xkaVar.a);
        this.m.putFloat(xkaVar.b);
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
        dlb dlbVar = this.k;
        if (dlbVar != null) {
            dlbVar.a(z);
        }
        dlb dlbVar2 = this.D;
        if (dlbVar2 != null) {
            dlbVar2.a(z);
        }
        int i2 = this.p;
        if (i2 != 0) {
            iArr[0] = i2;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.p = 0;
        }
        HashMap hashMap = this.j;
        for (dlb dlbVar3 : hashMap.values()) {
            if (dlbVar3 != null) {
                dlbVar3.a(true);
            }
        }
        hashMap.clear();
        int i3 = this.q;
        if (i3 != 0) {
            iArr[0] = i3;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.q = 0;
        }
        dlb dlbVar4 = this.z;
        if (dlbVar4 != null) {
            dlbVar4.a(true);
        }
        dlb dlbVar5 = this.l;
        if (dlbVar5 != null) {
            dlbVar5.a(true);
        }
        Map map = this.r;
        if (map != null) {
            for (zaa zaaVar : map.values()) {
                if (zaaVar.a != 0) {
                    GLES20.glDeleteProgram(0);
                    zaaVar.a = 0;
                }
            }
            this.r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        sze.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            xka xkaVar = this.g;
            GLES20.glViewport(0, 0, (int) xkaVar.a, (int) xkaVar.b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(TLObject.FLAG_14);
        }
        GLES20.glBindFramebuffer(36160, 0);
        x59 x59Var = this.a;
        if (x59Var != null) {
            x59Var.f0();
        }
        w89 w89Var = this.e;
        w89Var.h = 0;
        w89Var.g = 0.0d;
        ByteBuffer byteBuffer = w89Var.j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.b = null;
        this.J = 0.0f;
    }

    public final void c(f08 f08Var, int i, boolean z, vp5 vp5Var) {
        if (this.r == null || this.i == null) {
            return;
        }
        this.f.f(new al3(this, f08Var, i, z, vp5Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ry d(f08 f08Var, int i, RectF rectF) {
        ry m;
        x59 x59Var;
        Object obj;
        boolean z;
        u11 u11Var = this.i;
        if (f08Var != null) {
            u11Var = f08Var.e;
        }
        u11 u11Var2 = u11Var;
        if (this.F == null || !(((z = u11Var2 instanceof o11)) || (u11Var2 instanceof q11))) {
            m = m(rectF, false);
        } else {
            boolean z2 = this.E;
            if (rectF == null || !rectF.setIntersect(rectF, f())) {
                m = null;
            } else {
                ByteBuffer byteBuffer = (ByteBuffer) h(rectF, true, false, false).c;
                Object obj2 = this.a.b;
                ry ryVar = new ry(byteBuffer, 0, rectF);
                ByteBuffer byteBuffer2 = (ByteBuffer) h(rectF, true, true, false).c;
                Object obj3 = this.a.b;
                ((e99) this.a.b).b.b(UUID.randomUUID(), new eb7((Object) this, (Object) ryVar, (Object) new ry(byteBuffer2, 1, rectF), z2, (byte) 4));
                m = ryVar;
            }
            this.E = z;
        }
        this.s++;
        int i2 = (this.F == null || !((u11Var2 instanceof o11) || (u11Var2 instanceof q11))) ? 1 : 2;
        for (int i3 = 0; i3 < i2; i3++) {
            GLES20.glBindFramebuffer(36160, i());
            int j = j();
            if (this.F != null && (((u11Var2 instanceof o11) && i3 == 0) || ((u11Var2 instanceof q11) && i3 == 1))) {
                dlb dlbVar = this.D;
                j = dlbVar != null ? dlbVar.c() : 0;
            }
            if (i3 == 1 && (u11Var2 instanceof o11)) {
                u11Var2 = new q11();
            }
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, j, 0);
            xka xkaVar = this.g;
            GLES20.glViewport(0, 0, (int) xkaVar.a, (int) xkaVar.b);
            zaa zaaVar = (zaa) this.r.get(u11Var2.h(1));
            if (zaaVar == null) {
                return null;
            }
            GLES20.glUseProgram(zaaVar.a);
            GLES20.glUniformMatrix4fv(zaaVar.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
            GLES20.glUniform1i(zaaVar.d("texture"), 0);
            GLES20.glUniform1i(zaaVar.d("mask"), 1);
            zaa.a(zaaVar.d("color"), on2.p(i, (int) (u11Var2.e() * Color.alpha(i))));
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, j);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, g());
            if (u11Var2 instanceof o11) {
                GLES20.glUniform1i(zaaVar.d("blured"), 2);
                GLES20.glActiveTexture(33986);
                sm0 sm0Var = this.F;
                if (sm0Var != null) {
                    obj = sm0Var.h;
                    xm0 xm0Var = sm0Var.m;
                    GLES20.glBindTexture(3553, xm0Var != null ? xm0Var.s[2] : -1);
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
        if (this.s <= 0 && (x59Var = this.a) != null) {
            x59Var.f0();
        }
        this.s--;
        w89 w89Var = this.e;
        w89Var.h = 0;
        w89Var.g = 0.0d;
        ByteBuffer byteBuffer3 = w89Var.j;
        if (byteBuffer3 != null) {
            byteBuffer3.position(0);
        }
        this.b = null;
        this.c = null;
        return m;
    }

    public final ry e(dba dbaVar, int i, RectF rectF) {
        u11 u11Var = dbaVar.a;
        if (u11Var == null) {
            u11Var = this.i;
        }
        ry m = m(rectF, this.F != null && (u11Var instanceof o11));
        this.s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        xka xkaVar = this.g;
        GLES20.glViewport(0, 0, (int) xkaVar.a, (int) xkaVar.b);
        zaa zaaVar = (zaa) this.r.get(u11Var.h(1));
        if (zaaVar == null) {
            return null;
        }
        GLES20.glUseProgram(zaaVar.a);
        GLES20.glUniformMatrix4fv(zaaVar.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
        GLES20.glUniform1i(zaaVar.d("texture"), 0);
        GLES20.glUniform1i(zaaVar.d("mask"), 1);
        zaa.a(zaaVar.d("color"), i);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((u11Var instanceof o11) && this.z != null) {
            GLES20.glUniform1i(zaaVar.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.z.c());
        }
        if (u11Var instanceof t11) {
            GLES20.glUniform1i(zaaVar.d(TeXSymbolParser.TYPE_ATTR), dbaVar.a.n());
            GLES20.glUniform2f(zaaVar.d("resolution"), xkaVar.a, xkaVar.b);
            GLES20.glUniform2f(zaaVar.d("center"), dbaVar.b, dbaVar.c);
            GLES20.glUniform2f(zaaVar.d("radius"), dbaVar.d, dbaVar.e);
            GLES20.glUniform1f(zaaVar.d("thickness"), dbaVar.f);
            GLES20.glUniform1f(zaaVar.d("rounding"), dbaVar.g);
            GLES20.glUniform2f(zaaVar.d("middle"), dbaVar.i, dbaVar.j);
            GLES20.glUniform1f(zaaVar.d("rotation"), dbaVar.h);
            GLES20.glUniform1i(zaaVar.d("fill"), dbaVar.l ? 1 : 0);
            GLES20.glUniform1f(zaaVar.d("arrowTriangleLength"), dbaVar.k);
            GLES20.glUniform1i(zaaVar.d("composite"), 1);
            GLES20.glUniform1i(zaaVar.d("clear"), 0);
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
        x59 x59Var = this.a;
        if (x59Var != null && this.s <= 0) {
            x59Var.f0();
        }
        this.s--;
        w89 w89Var = this.e;
        w89Var.h = 0;
        w89Var.g = 0.0d;
        ByteBuffer byteBuffer = w89Var.j;
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
        xka xkaVar = this.g;
        return new RectF(0.0f, 0.0f, xkaVar.a, xkaVar.b);
    }

    public final int g() {
        int i = this.p;
        if (i != 0) {
            return i;
        }
        int b = dlb.b(this.g);
        this.p = b;
        return b;
    }

    public final mj4 h(RectF rectF, boolean z, boolean z2, boolean z3) {
        dlb dlbVar;
        mj4 mj4Var;
        zaa zaaVar;
        dlb dlbVar2;
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
        xka xkaVar = this.g;
        GLES20.glViewport(0, 0, (int) xkaVar.a, (int) xkaVar.b);
        Map map = this.r;
        Object obj = null;
        if (map != null) {
            zaa zaaVar2 = (zaa) map.get(z ? "nonPremultipliedBlit" : this.G ? "maskingBlit" : "blit");
            if (zaaVar2 != null) {
                GLES20.glUseProgram(zaaVar2.a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i, -i2);
                float[] c = pke.c(this.x, pke.a(matrix));
                GLES20.glUniformMatrix4fv(zaaVar2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c));
                if (z || !this.G) {
                    GLES20.glUniform1i(zaaVar2.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z2 || (dlbVar = this.D) == null) ? j() : dlbVar.c());
                } else {
                    GLES20.glUniform1i(zaaVar2.d("texture"), 1);
                    GLES20.glUniform1i(zaaVar2.d("mask"), 0);
                    GLES20.glUniform1f(zaaVar2.d("preview"), 0.0f);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z2 || (dlbVar2 = this.D) == null) ? j() : dlbVar2.c());
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
                if (z3 && !z2 && (zaaVar = (zaa) this.r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(zaaVar.a);
                    GLES20.glUniformMatrix4fv(zaaVar.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c));
                    GLES20.glUniform1f(zaaVar.d("flipy"), 0.0f);
                    GLES20.glUniform1i(zaaVar.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(zaaVar.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    xm0 xm0Var = this.F.m;
                    GLES20.glBindTexture(3553, xm0Var != null ? xm0Var.s[2] : -1);
                    GLES20.glUniform1f(zaaVar.d("eraser"), 0.0f);
                    GLES20.glUniform1i(zaaVar.d("mask"), 2);
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
                byte b = 14;
                if (z) {
                    mj4Var = new mj4(obj, this.u, b);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.u);
                    mj4Var = new mj4(createBitmap, obj, b);
                }
                this.u.rewind();
                int[] iArr = this.t;
                iArr[0] = i3;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.t;
                iArr2[0] = i4;
                GLES20.glDeleteTextures(1, iArr2, 0);
                return mj4Var;
            }
        }
        return null;
    }

    public final int i() {
        if (this.o == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.o = iArr[0];
            sze.a();
        }
        return this.o;
    }

    public final int j() {
        dlb dlbVar = this.k;
        if (dlbVar != null) {
            return dlbVar.c();
        }
        return 0;
    }

    public final void k(dba dbaVar) {
        if (dbaVar == null) {
            return;
        }
        this.f.f(new dw7(this, dbaVar, (byte) 0));
    }

    public final void l(f08 f08Var, boolean z, boolean z2) {
        int i;
        int i2;
        double d;
        jf8[] jf8VarArr;
        double d2;
        double d3;
        float atan2;
        jf8 jf8Var;
        float f;
        double d4;
        boolean z3;
        jf8 jf8Var2;
        double d5;
        float f2;
        float f3;
        float f4;
        char c;
        char c2;
        this.b = f08Var;
        if (f08Var != null) {
            GLES20.glBindFramebuffer(36160, i());
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
            sze.a();
            RectF rectF = null;
            if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
                xka xkaVar = this.g;
                GLES20.glViewport(0, 0, (int) xkaVar.a, (int) xkaVar.b);
                float f5 = 0.0f;
                if (z) {
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(TLObject.FLAG_14);
                }
                Map map = this.r;
                if (map == null) {
                    return;
                }
                u11 u11Var = f08Var.e;
                int i3 = 2;
                zaa zaaVar = (zaa) map.get(u11Var.h(2));
                if (zaaVar == null) {
                    return;
                }
                GLES20.glUseProgram(zaaVar.a);
                dlb dlbVar = (dlb) this.j.get(Integer.valueOf(u11Var.k()));
                if (dlbVar == null) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = false;
                    dlbVar = new dlb(BitmapFactory.decodeResource(a.b.getResources(), u11Var.k(), options));
                    this.j.put(Integer.valueOf(u11Var.k()), dlbVar);
                }
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, dlbVar.c());
                GLES20.glUniformMatrix4fv(zaaVar.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.x));
                GLES20.glUniform1i(zaaVar.d("texture"), 0);
                w89 w89Var = this.e;
                if (z2) {
                    w89Var.f = 1.0f;
                } else {
                    w89Var.f = this.f.getScaleX();
                }
                w89 w89Var2 = this.e;
                w89Var2.a = f08Var.d;
                w89Var2.b = f08Var.e.j();
                w89Var2.c = z2 ? 1.0f : f08Var.e.a();
                f08Var.e.getClass();
                w89Var2.d = 0.0f;
                w89Var2.e = f08Var.e.g();
                Vector vector = f08Var.b;
                int size = vector == null ? 0 : vector.size();
                if (size == 0) {
                    i = 0;
                } else {
                    Vector vector2 = f08Var.b;
                    if (size == 1) {
                        jf8[] jf8VarArr2 = new jf8[vector2.size()];
                        vector2.toArray(jf8VarArr2);
                        jf8 jf8Var3 = jf8VarArr2[0];
                        float f6 = ((w89Var2.a * w89Var2.e) * 1.0f) / w89Var2.f;
                        jf8Var3.getClass();
                        PointF pointF = new PointF((float) jf8Var3.a, (float) jf8Var3.b);
                        float f7 = Math.abs(w89Var2.d) > 0.0f ? w89Var2.d : 0.0f;
                        float f8 = w89Var2.c;
                        w89Var2.c();
                        w89Var2.b(1);
                        w89Var2.a(pointF, f6, f7, f8, 0);
                    } else {
                        int size2 = vector2.size();
                        jf8[] jf8VarArr3 = new jf8[size2];
                        vector2.toArray(jf8VarArr3);
                        w89Var2.c();
                        int i4 = 0;
                        while (i4 < size2 - 1) {
                            jf8 jf8Var4 = jf8VarArr3[i4];
                            int i5 = i4 + 1;
                            jf8 jf8Var5 = jf8VarArr3[i5];
                            double a = jf8Var4.a(jf8Var5);
                            int i6 = size2;
                            double d6 = jf8Var5.a - jf8Var4.a;
                            int i7 = i3;
                            double d7 = jf8Var5.b - jf8Var4.b;
                            double d8 = jf8Var5.c;
                            float f9 = f5;
                            double d9 = d8 - jf8Var4.c;
                            jf8 jf8Var6 = new jf8(1.0d, 1.0d, 0.0d);
                            if (Math.abs(w89Var2.d) > f9) {
                                jf8[] jf8VarArr4 = jf8VarArr3;
                                atan2 = w89Var2.d;
                                jf8VarArr = jf8VarArr4;
                                d = d9;
                                d2 = d6;
                                d3 = d8;
                            } else {
                                d = d9;
                                jf8VarArr = jf8VarArr3;
                                d2 = d6;
                                d3 = d8;
                                atan2 = (float) Math.atan2(d7, d2);
                            }
                            double d10 = d2;
                            float f10 = (float) ((((w89Var2.a * d3) * w89Var2.e) * 1.0d) / w89Var2.f);
                            double max = Math.max(1.0f, w89Var2.b * f10);
                            if (a > 0.0d) {
                                double d11 = 1.0d / a;
                                jf8Var = new jf8(d10 * d11, d7 * d11, d * d11);
                            } else {
                                jf8Var = jf8Var6;
                            }
                            float min = Math.min(1.0f, w89Var2.c * 1.15f);
                            boolean z4 = jf8Var4.d;
                            boolean z5 = jf8Var5.d;
                            jf8[] jf8VarArr5 = jf8VarArr;
                            int ceil = (int) Math.ceil((a - w89Var2.g) / max);
                            int i8 = w89Var2.h;
                            w89Var2.b(ceil);
                            ByteBuffer byteBuffer = w89Var2.j;
                            if (byteBuffer == null || i8 < 0) {
                                f = f10;
                            } else {
                                f = f10;
                                if (i8 < w89Var2.i) {
                                    byteBuffer.position(i8 * 20);
                                }
                            }
                            double d12 = w89Var2.g;
                            jf8 jf8Var7 = new jf8(jf8Var4.a + (jf8Var.a * d12), jf8Var4.b + (jf8Var.b * d12), jf8Var4.c + (jf8Var.c * d12));
                            double d13 = d12;
                            jf8 jf8Var8 = jf8Var7;
                            boolean z6 = true;
                            while (true) {
                                if (d13 > a) {
                                    d4 = d13;
                                    z3 = z5;
                                    jf8Var2 = jf8Var5;
                                    d5 = a;
                                    f2 = f;
                                    f3 = atan2;
                                    break;
                                }
                                d4 = d13;
                                z3 = z5;
                                jf8Var2 = jf8Var5;
                                f2 = f;
                                double d14 = a;
                                f3 = atan2;
                                jf8 jf8Var9 = jf8Var8;
                                boolean a2 = w89Var2.a(new PointF((float) jf8Var8.a, (float) jf8Var8.b), f2, f3, z4 ? min : w89Var2.c, -1);
                                d5 = d14;
                                if (!a2) {
                                    z6 = a2;
                                    break;
                                }
                                jf8 jf8Var10 = new jf8(jf8Var9.a + (jf8Var.a * max), jf8Var9.b + (jf8Var.b * max), jf8Var9.c + (jf8Var.c * max));
                                z6 = a2;
                                f = f2;
                                atan2 = f3;
                                z5 = z3;
                                a = d5;
                                jf8Var8 = jf8Var10;
                                jf8Var5 = jf8Var2;
                                d13 = d4 + max;
                                z4 = false;
                            }
                            if (z6 && z3) {
                                w89Var2.b(1);
                                w89Var2.a(new PointF((float) jf8Var2.a, (float) jf8Var2.b), f2, f3, min, -1);
                            }
                            w89Var2.g = d4 - d5;
                            size2 = i6;
                            i4 = i5;
                            i3 = i7;
                            f5 = f9;
                            jf8VarArr3 = jf8VarArr5;
                        }
                    }
                    float f11 = f5;
                    int i9 = i3;
                    f08Var.a = w89Var2.g;
                    rectF = new RectF(f11, f11, f11, f11);
                    int i10 = w89Var2.h;
                    if (i10 <= 0) {
                        i = 0;
                    } else {
                        int i11 = i10 - 1;
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((i10 << 2) + (i11 << 1)) * 20);
                        allocateDirect.order(ByteOrder.nativeOrder());
                        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
                        asFloatBuffer.position(0);
                        ByteBuffer byteBuffer2 = w89Var2.j;
                        if (byteBuffer2 != null && w89Var2.i > 0) {
                            byteBuffer2.position(0);
                        }
                        int i12 = 0;
                        for (int i13 = 0; i13 < i10; i13++) {
                            float f12 = w89Var2.j.getFloat();
                            float f13 = w89Var2.j.getFloat();
                            float f14 = w89Var2.j.getFloat();
                            float f15 = w89Var2.j.getFloat();
                            float f16 = w89Var2.j.getFloat();
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
            x59 x59Var = this.a;
            if (x59Var != null) {
                x59Var.f0();
            }
            RectF rectF3 = this.h;
            if (rectF3 != null) {
                rectF3.union(rectF);
            } else {
                this.h = rectF;
            }
        }
    }

    public final ry m(RectF rectF, boolean z) {
        if (rectF == null || !rectF.setIntersect(rectF, f())) {
            return null;
        }
        ByteBuffer byteBuffer = (ByteBuffer) h(rectF, true, z, false).c;
        Object obj = this.a.b;
        ry ryVar = new ry(byteBuffer, z ? 1 : 0, rectF);
        ((e99) this.a.b).b.b(UUID.randomUUID(), new fw7(this, ryVar, (byte) 1));
        return ryVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i, f08 f08Var, float f) {
        Object obj;
        if (f08Var != null) {
            u11 u11Var = f08Var.e;
            if (u11Var == null) {
                u11Var = this.i;
            }
            boolean z = this.G && ((u11Var instanceof s11) || (u11Var instanceof q11));
            Map map = this.r;
            StringBuilder sb = new StringBuilder();
            sb.append(u11Var.h(0));
            sb.append(z ? "_masking" : "");
            zaa zaaVar = (zaa) map.get(sb.toString());
            if (zaaVar == null) {
                return;
            }
            GLES20.glUseProgram(zaaVar.a);
            GLES20.glUniformMatrix4fv(zaaVar.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.y));
            GLES20.glUniform1i(zaaVar.d("texture"), 0);
            GLES20.glUniform1i(zaaVar.d("mask"), 1);
            zaa.a(zaaVar.d("color"), on2.p(f08Var.c, (int) (u11Var.e() * Color.alpha(r1) * f)));
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, j());
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, i);
            if (z) {
                GLES20.glUniform1i(zaaVar.d("otexture"), 2);
                GLES20.glUniform1f(zaaVar.d("preview"), 0.4f);
                GLES20.glActiveTexture(33986);
                GLES20.glBindTexture(3553, this.l.c());
            }
            if (u11Var instanceof o11) {
                GLES20.glUniform1i(zaaVar.d("blured"), 2);
                GLES20.glActiveTexture(33986);
                sm0 sm0Var = this.F;
                if (sm0Var != null) {
                    obj = sm0Var.h;
                    xm0 xm0Var = sm0Var.m;
                    GLES20.glBindTexture(3553, xm0Var != null ? xm0Var.s[2] : -1);
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
                    sze.a();
                }
                dlb dlbVar = this.z;
                if (dlbVar != null) {
                    GLES20.glBindTexture(3553, dlbVar.c());
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
            sze.a();
        }
    }

    public final void o(int i, int i2, dba dbaVar, float f) {
        zaa zaaVar;
        if (dbaVar != null) {
            u11 u11Var = this.i;
            t11 t11Var = dbaVar.a;
            if (t11Var != null && i == this.q) {
                u11Var = t11Var;
            }
            if (u11Var == null || this.f == null || (zaaVar = (zaa) this.r.get(u11Var.h(0))) == null) {
                return;
            }
            GLES20.glUseProgram(zaaVar.a);
            GLES20.glUniformMatrix4fv(zaaVar.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.y));
            GLES20.glUniform1i(zaaVar.d("texture"), 0);
            GLES20.glUniform1i(zaaVar.d("mask"), 1);
            zaa.a(zaaVar.d("color"), on2.p(this.f.getCurrentColor(), (int) (Color.alpha(r6) * f)));
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, i2);
            if (u11Var instanceof t11) {
                GLES20.glUniform1i(zaaVar.d(TeXSymbolParser.TYPE_ATTR), ((t11) u11Var).n());
                int d = zaaVar.d("resolution");
                xka xkaVar = this.g;
                GLES20.glUniform2f(d, xkaVar.a, xkaVar.b);
                GLES20.glUniform2f(zaaVar.d("center"), dbaVar.b, dbaVar.c);
                GLES20.glUniform2f(zaaVar.d("radius"), dbaVar.d, dbaVar.e);
                GLES20.glUniform1f(zaaVar.d("thickness"), dbaVar.f);
                GLES20.glUniform1f(zaaVar.d("rounding"), dbaVar.g);
                GLES20.glUniform2f(zaaVar.d("middle"), dbaVar.i, dbaVar.j);
                GLES20.glUniform1f(zaaVar.d("rotation"), dbaVar.h);
                GLES20.glUniform1i(zaaVar.d("fill"), dbaVar.l ? 1 : 0);
                GLES20.glUniform1f(zaaVar.d("arrowTriangleLength"), dbaVar.k);
                GLES20.glUniform1i(zaaVar.d("composite"), 0);
                GLES20.glUniform1i(zaaVar.d("clear"), dbaVar == this.d ? 1 : 0);
            }
            GLES20.glBlendFunc(1, 771);
            GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.m);
            GLES20.glEnableVertexAttribArray(0);
            GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.n);
            GLES20.glEnableVertexAttribArray(1);
            GLES20.glDrawArrays(5, 0, 4);
            sze.a();
        }
    }

    public final void p(ry ryVar, boolean z) {
        ByteBuffer byteBuffer;
        File file;
        x59 x59Var;
        dlb dlbVar;
        if (ryVar != null) {
            try {
                byte[] bArr = new byte[1024];
                byte[] bArr2 = new byte[1024];
                FileInputStream fileInputStream = new FileInputStream((File) ryVar.d);
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
                fc4.g(e, true);
                byteBuffer = null;
            }
            int j = j();
            if (ryVar.b && (dlbVar = this.D) != null) {
                j = dlbVar.c();
            }
            GLES20.glBindTexture(3553, j);
            RectF rectF = (RectF) ryVar.c;
            GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) ryVar.c).height(), 6408, 5121, byteBuffer);
            if (this.s <= 0 && (x59Var = this.a) != null) {
                x59Var.f0();
            }
            if (!z || (file = (File) ryVar.d) == null) {
                return;
            }
            file.delete();
            ryVar.d = null;
        }
    }

    public final void q(u11 u11Var) {
        Bitmap bitmap;
        Bitmap c;
        this.i = u11Var;
        if ((u11Var instanceof o11) && (bitmap = this.A) != null && this.F == null) {
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
            e99 e99Var = this.f;
            if (e99Var != null && (c = e99Var.c(false, false)) != null) {
                canvas.scale(width / c.getWidth(), height / c.getHeight());
                canvas.drawBitmap(c, 0.0f, 0.0f, this.M);
                c.recycle();
            }
            Utilities.stackBlurBitmap(this.C, 8);
            dlb dlbVar = this.z;
            if (dlbVar != null) {
                dlbVar.a(false);
            }
            this.z = new dlb(this.C);
        }
    }
}
