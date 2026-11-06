package g;

import android.content.DialogInterface;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import fi.e7;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.Size;
import org.telegram.messenger.g0;
import org.telegram.messenger.iz;
import org.telegram.messenger.r2;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.d40;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.g40;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.p30;
import org.telegram.ui.Components.x30;
import s4.m0;
import s4.n0;
import s4.o0;
import s4.p0;
import s4.r0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class c extends Handler {
    public final /* synthetic */ int a;
    public WeakReference b;

    public /* synthetic */ c(int i7) {
        this.a = i7;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:176|(2:178|(2:180|(1:182))(11:(7:185|(2:(2:195|(3:203|204|(1:206))(3:197|(2:199|200)(1:202)|201))(3:191|192|(1:194))|186)|289|290|(1:292)|293|(1:295)(1:296))|207|(1:209)|210|(1:212)|213|214|215|216|(4:218|219|(15:221|(2:222|(4:(2:225|(2:256|(2:272|273)(1:258)))(1:274)|259|(4:261|(1:263)|264|(2:266|267)(2:269|270))(1:271)|268)(2:275|276))|232|(2:234|(1:236)(1:237))|238|239|240|(1:242)(1:254)|243|(1:245)|246|(1:248)(1:253)|249|250|251)(2:277|278)|252)|284))|298|207|(0)|210|(0)|213|214|215|216|(0)|284) */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x035c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x035d, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x04f0, code lost:
    
        if (r10 < 0) goto L292;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:209:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0363 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0522  */
    /* JADX WARN: Type inference failed for: r2v100, types: [s4.n0] */
    /* JADX WARN: Type inference failed for: r43v1 */
    /* JADX WARN: Type inference failed for: r43v2 */
    /* JADX WARN: Type inference failed for: r43v3 */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        boolean z9;
        boolean z10;
        long j3;
        boolean z11;
        long j10;
        boolean z12;
        FloatBuffer floatBuffer;
        FloatBuffer floatBuffer2;
        ?? r43;
        int i7;
        int i10;
        float f10;
        float f11;
        int i11;
        float f12;
        int i12;
        long j11;
        x30 x30Var;
        long j12;
        long j13;
        s4.o oVar;
        n0 n0Var = null;
        p0 p0Var = null;
        int i13 = 0;
        int i14 = 1;
        switch (this.a) {
            case 0:
                int i15 = message.what;
                if (i15 == -3 || i15 == -2 || i15 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.b.get(), message.what);
                    break;
                } else if (i15 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            case 1:
                int i16 = message.what;
                g40 g40Var = (g40) this.b.get();
                if (g40Var != null) {
                    if (i16 == 0) {
                        try {
                            if (r2.a) {
                                a8.d("InstantCamera start encoder");
                            }
                            g40.a(g40Var, message.arg1 == 1);
                            break;
                        } catch (Exception e10) {
                            a8.g(e10, true);
                            g40.b(g40Var, 0, null);
                            Looper.myLooper().quit();
                            return;
                        }
                    } else if (i16 == 1) {
                        if (r2.a) {
                            a8.d("InstantCamera stop encoder");
                        }
                        g40.b(g40Var, message.arg1, (d40) message.obj);
                        break;
                    } else {
                        int i17 = 5;
                        long j14 = 0;
                        long j15 = -1;
                        if (i16 == 2) {
                            long j16 = (message.arg1 << 32) | (message.arg2 & 4294967295L);
                            Integer num = (Integer) message.obj;
                            if (!g40Var.D0 && g40Var.H0.V) {
                                try {
                                    g40Var.d(false);
                                } catch (Exception e11) {
                                    a8.g(e11, true);
                                }
                                if (g40Var.w0.equals(num)) {
                                    z9 = false;
                                } else {
                                    g40Var.w0 = num;
                                    z9 = true;
                                }
                                long j17 = g40Var.g0;
                                if (j17 >= 0) {
                                    if (g40Var.f0 == -1) {
                                        g40Var.f0 = j16 - j17;
                                    }
                                    j16 -= g40Var.f0;
                                }
                                if (!z9) {
                                    long j18 = g40Var.S;
                                    if (j18 != -1) {
                                        j3 = j16 - j18;
                                        g40Var.S = j16;
                                        j10 = j3;
                                        z12 = 3;
                                        g40Var.Q = false;
                                        g40Var.O = System.currentTimeMillis();
                                        if (!g40Var.a0) {
                                            long j19 = g40Var.Z + j3;
                                            g40Var.Z = j19;
                                            if (j19 >= 200000000) {
                                                g40Var.a0 = true;
                                            }
                                        }
                                        g40Var.R += j3;
                                        if (g40Var.c0 == -1) {
                                            g40Var.c0 = j16 / 1000;
                                            if (r2.a) {
                                                jg.g.u(g40Var.c0, new StringBuilder("InstantCamera first video frame was at "));
                                            }
                                        }
                                        g40Var.e0 = j16 - g40Var.d0;
                                        g40Var.d0 = j16;
                                        o40 o40Var = g40Var.H0;
                                        floatBuffer = o40Var.I0;
                                        floatBuffer2 = o40Var.H0;
                                        FloatBuffer floatBuffer3 = o40Var.J0;
                                        if (floatBuffer != null || floatBuffer2 == null) {
                                            a8.b("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                                            break;
                                        } else {
                                            p30 p30Var = g40Var.x0;
                                            int i18 = 3553;
                                            if (p30Var != null) {
                                                r43 = z12;
                                                GLES20.glBindFramebuffer(36160, p30Var.j[0]);
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, p30Var.k[0], 0);
                                                GLES20.glViewport(0, 0, p30Var.a, p30Var.b);
                                            } else {
                                                r43 = z12;
                                            }
                                            GLES20.glUseProgram(g40Var.m0);
                                            GLES20.glActiveTexture(33984);
                                            GLES20.glVertexAttribPointer(g40Var.p0, 3, 5126, false, 12, (Buffer) floatBuffer2);
                                            GLES20.glEnableVertexAttribArray(g40Var.p0);
                                            GLES20.glVertexAttribPointer(g40Var.q0, 2, 5126, false, 8, (Buffer) floatBuffer);
                                            GLES20.glEnableVertexAttribArray(g40Var.q0);
                                            GLES20.glUniformMatrix4fv(g40Var.n0, 1, false, g40Var.H0.E0, 0);
                                            GLES20.glUniform2f(g40Var.r0, g40Var.d, g40Var.e);
                                            o40 o40Var2 = g40Var.H0;
                                            if (o40Var2.b0[0] == 0 || floatBuffer3 == null || o40Var2.t0) {
                                                i7 = 33984;
                                                i10 = 36197;
                                                f10 = 1.0f;
                                            } else {
                                                if (!g40Var.n) {
                                                    GLES20.glEnable(3042);
                                                    g40Var.n = true;
                                                }
                                                if (g40Var.H0.M0 != null) {
                                                    i7 = 33984;
                                                    GLES20.glUniform2f(g40Var.s0, r4.getWidth(), g40Var.H0.M0.getHeight());
                                                } else {
                                                    i7 = 33984;
                                                }
                                                i10 = 36197;
                                                f10 = 1.0f;
                                                GLES20.glVertexAttribPointer(g40Var.q0, 2, 5126, false, 8, (Buffer) floatBuffer3);
                                                GLES20.glUniformMatrix4fv(g40Var.o0, 1, false, g40Var.H0.G0, 0);
                                                GLES20.glUniform1f(g40Var.u0, 1.0f);
                                                GLES20.glBindTexture(36197, g40Var.H0.b0[0]);
                                                GLES20.glDrawArrays(5, 0, 4);
                                            }
                                            o40 o40Var3 = g40Var.H0;
                                            Size[] sizeArr = o40Var3.m0;
                                            if (sizeArr != null) {
                                                int i19 = g40Var.s0;
                                                float width = sizeArr[o40Var3.j1].getWidth();
                                                o40 o40Var4 = g40Var.H0;
                                                f11 = 2.0f;
                                                GLES20.glUniform2f(i19, width, o40Var4.m0[o40Var4.j1].getHeight());
                                                int i20 = g40Var.t0;
                                                o40 o40Var5 = g40Var.H0;
                                                float width2 = (f10 / o40Var5.m0[o40Var5.j1].getWidth()) / 2.0f;
                                                o40 o40Var6 = g40Var.H0;
                                                GLES20.glUniform2f(i20, width2, (f10 / o40Var6.m0[o40Var6.j1].getHeight()) / 2.0f);
                                            } else {
                                                f11 = 2.0f;
                                            }
                                            o40 o40Var7 = g40Var.H0;
                                            int i21 = o40Var7.a0[o40Var7.j1];
                                            if (i21 != Integer.MIN_VALUE) {
                                                i11 = 0;
                                                GLES20.glUniformMatrix4fv(g40Var.o0, 1, false, g40Var.H0.F0, 0);
                                                GLES20.glUniform1f(g40Var.u0, g40Var.H0.c0);
                                                GLES20.glBindTexture(i10, i21);
                                                GLES20.glDrawArrays(5, 0, 4);
                                            } else {
                                                i11 = 0;
                                            }
                                            GLES20.glDisableVertexAttribArray(g40Var.p0);
                                            GLES20.glDisableVertexAttribArray(g40Var.q0);
                                            GLES20.glBindTexture(i10, i11);
                                            GLES20.glUseProgram(i11);
                                            p30 p30Var2 = g40Var.x0;
                                            if (p30Var2 != null) {
                                                GLES20.glDisable(3042);
                                                e4.b bVar = p30Var2.c;
                                                int[] iArr = p30Var2.k;
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], i11);
                                                GLES20.glViewport(i11, i11, 48, 48);
                                                f12 = f10;
                                                GLES20.glUseProgram(bVar.a);
                                                int i22 = bVar.d;
                                                FloatBuffer floatBuffer4 = p30Var2.g;
                                                GLES20.glVertexAttribPointer(i22, 3, 5126, false, 12, floatBuffer4.position(i11));
                                                int i23 = bVar.d;
                                                GLES20.glEnableVertexAttribArray(i23);
                                                int i24 = bVar.e;
                                                FloatBuffer floatBuffer5 = p30Var2.h;
                                                GLES20.glVertexAttribPointer(i24, 2, 5126, false, 8, floatBuffer5.position(i11));
                                                int i25 = bVar.e;
                                                GLES20.glEnableVertexAttribArray(i25);
                                                GLES20.glActiveTexture(i7);
                                                GLES20.glBindTexture(3553, iArr[i11]);
                                                GLES20.glUniform1i(bVar.f, i11);
                                                GLES20.glDrawArrays(5, i11, 4);
                                                GLES20.glBindTexture(3553, i11);
                                                GLES20.glDisableVertexAttribArray(i25);
                                                GLES20.glDisableVertexAttribArray(i23);
                                                GLES20.glUseProgram(i11);
                                                int i26 = i11;
                                                for (int i27 = 2; i26 < i27; i27 = 2) {
                                                    n30 n30Var = p30Var2.e;
                                                    GLES20.glFramebufferTexture2D(36160, 36064, i18, iArr[i26 == 0 ? i27 : 1], i11);
                                                    GLES20.glViewport(i11, i11, 48, 48);
                                                    int i28 = n30Var.a;
                                                    int i29 = n30Var.e;
                                                    int i30 = n30Var.d;
                                                    GLES20.glUseProgram(i28);
                                                    GLES20.glVertexAttribPointer(n30Var.d, 3, 5126, false, 12, floatBuffer4.position(i11));
                                                    GLES20.glEnableVertexAttribArray(i30);
                                                    GLES20.glVertexAttribPointer(n30Var.e, 2, 5126, false, 8, floatBuffer5.position(i11));
                                                    GLES20.glEnableVertexAttribArray(i29);
                                                    GLES20.glActiveTexture(i7);
                                                    GLES20.glBindTexture(i18, iArr[i26 == 0 ? (char) 1 : (char) 2]);
                                                    i11 = 0;
                                                    GLES20.glUniform1i(n30Var.f, 0);
                                                    GLES20.glUniform2f(n30Var.g, i26 == 0 ? 0.020833334f : 0.0f, i26 == 1 ? 0.020833334f : 0.0f);
                                                    GLES20.glDrawArrays(5, 0, 4);
                                                    GLES20.glBindTexture(3553, 0);
                                                    GLES20.glDisableVertexAttribArray(i29);
                                                    GLES20.glDisableVertexAttribArray(i30);
                                                    GLES20.glUseProgram(0);
                                                    i26++;
                                                    i18 = 3553;
                                                }
                                                o30 o30Var = p30Var2.f;
                                                GLES20.glBindFramebuffer(36160, i11);
                                                GLES20.glFramebufferTexture2D(36160, 36064, i18, iArr[1], i11);
                                                GLES20.glViewport(i11, i11, p30Var2.a, p30Var2.b);
                                                GLES20.glUseProgram(o30Var.a);
                                                GLES20.glVertexAttribPointer(o30Var.d, 3, 5126, false, 12, floatBuffer4.position(i11));
                                                GLES20.glEnableVertexAttribArray(o30Var.d);
                                                GLES20.glVertexAttribPointer(o30Var.e, 2, 5126, false, 8, floatBuffer5.position(i11));
                                                GLES20.glEnableVertexAttribArray(o30Var.e);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, iArr[1]);
                                                GLES20.glActiveTexture(i7);
                                                GLES20.glBindTexture(3553, iArr[0]);
                                                GLES20.glUniform1i(o30Var.f, 0);
                                                GLES20.glUniform1i(o30Var.g, 1);
                                                GLES20.glUniform2f(o30Var.h, p30Var2.a / f11, p30Var2.b / f11);
                                                GLES20.glDrawArrays(5, 0, 4);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glActiveTexture(i7);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glDisableVertexAttribArray(o30Var.e);
                                                GLES20.glDisableVertexAttribArray(o30Var.d);
                                                GLES20.glUseProgram(0);
                                                e4.b bVar2 = p30Var2.d;
                                                GLES20.glEnable(3042);
                                                int i31 = bVar2.a;
                                                int i32 = bVar2.e;
                                                int i33 = bVar2.d;
                                                GLES20.glUseProgram(i31);
                                                GLES20.glActiveTexture(i7);
                                                for (int i34 = 0; i34 < 2; i34++) {
                                                    if (i34 == 0) {
                                                        GLES20.glVertexAttribPointer(bVar2.d, 3, 5126, false, 12, floatBuffer4.position(12));
                                                        GLES20.glEnableVertexAttribArray(i33);
                                                        GLES20.glVertexAttribPointer(bVar2.e, 2, 5126, false, 8, floatBuffer5.position(8));
                                                        GLES20.glEnableVertexAttribArray(i32);
                                                        GLES20.glBindTexture(3553, iArr[r43]);
                                                        i12 = 4;
                                                    } else {
                                                        int i35 = p30Var2.i;
                                                        p30Var2.i = i35 + 1;
                                                        GLES20.glVertexAttribPointer(bVar2.d, 3, 5126, false, 12, floatBuffer4.position(24));
                                                        GLES20.glEnableVertexAttribArray(i33);
                                                        GLES20.glVertexAttribPointer(bVar2.e, 2, 5126, false, 8, floatBuffer5.position(((i35 % 27) * 8) + 16));
                                                        GLES20.glEnableVertexAttribArray(i32);
                                                        i12 = 4;
                                                        GLES20.glBindTexture(3553, iArr[4]);
                                                    }
                                                    GLES20.glUniform1i(bVar2.f, 0);
                                                    GLES20.glDrawArrays(5, 0, i12);
                                                    GLES20.glBindTexture(3553, 0);
                                                    GLES20.glDisableVertexAttribArray(i32);
                                                    GLES20.glDisableVertexAttribArray(i33);
                                                }
                                                GLES20.glUseProgram(0);
                                                GLES20.glDisable(3042);
                                                if (g40Var.n) {
                                                    GLES20.glEnable(3042);
                                                }
                                            } else {
                                                f12 = f10;
                                            }
                                            EGLExt.eglPresentationTimeANDROID(g40Var.s, g40Var.D, g40Var.R);
                                            EGL14.eglSwapBuffers(g40Var.s, g40Var.D);
                                            if (g40Var.B0 != null && iz.o() == 2 && g40Var.C0 % 33 == 0) {
                                                g40Var.B0.postRunnable(new dt(g40Var, i17));
                                            }
                                            g40Var.C0++;
                                            o40 o40Var8 = g40Var.H0;
                                            if (o40Var8.b0[0] != 0) {
                                                float f13 = o40Var8.c0;
                                                if (f13 < f12 && !o40Var8.t0) {
                                                    float f14 = (j10 / 2.0E8f) + f13;
                                                    o40Var8.c0 = f14;
                                                    if (f14 > f12) {
                                                        GLES20.glDisable(3042);
                                                        g40Var.n = false;
                                                        o40 o40Var9 = g40Var.H0;
                                                        o40Var9.c0 = f12;
                                                        GLES20.glDeleteTextures(1, o40Var9.b0, 0);
                                                        o40 o40Var10 = g40Var.H0;
                                                        o40Var10.b0[0] = 0;
                                                        if (!o40Var10.J) {
                                                            g40Var.H0.J = true;
                                                            g0.h3(new e40(g40Var, 4));
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!o40Var8.J) {
                                                g40Var.H0.J = true;
                                                g0.h3(new e40(g40Var, i17));
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (g40Var.R != 0 && !g40Var.Q) {
                                    j3 = j16 - g40Var.S;
                                    boolean z13 = 3;
                                    long currentTimeMillis = (System.currentTimeMillis() - g40Var.O) * 1000000;
                                    if (j3 < 0 || Math.abs(currentTimeMillis - j3) > 100000000) {
                                        j3 = currentTimeMillis;
                                    }
                                    z11 = z13;
                                    z10 = z13;
                                    break;
                                } else {
                                    z10 = 3;
                                }
                                j3 = 0;
                                z11 = z10;
                                g40Var.S = j16;
                                j10 = 0;
                                z12 = z11;
                                g40Var.Q = false;
                                g40Var.O = System.currentTimeMillis();
                                if (!g40Var.a0) {
                                }
                                g40Var.R += j3;
                                if (g40Var.c0 == -1) {
                                }
                                g40Var.e0 = j16 - g40Var.d0;
                                g40Var.d0 = j16;
                                o40 o40Var11 = g40Var.H0;
                                floatBuffer = o40Var11.I0;
                                floatBuffer2 = o40Var11.H0;
                                FloatBuffer floatBuffer32 = o40Var11.J0;
                                if (floatBuffer != null) {
                                }
                                a8.b("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                            }
                        } else if (i16 == 3) {
                            x30 x30Var2 = (x30) message.obj;
                            if (!g40Var.D0 && !g40Var.l0) {
                                g40Var.L.add(x30Var2);
                                if (g40Var.h0 == -1) {
                                    if (g40Var.c0 == -1) {
                                        if (r2.a) {
                                            a8.b("InstantCamera video record not yet started");
                                            break;
                                        }
                                    } else {
                                        while (true) {
                                            int i36 = 0;
                                            while (i36 < x30Var2.d) {
                                                if (i36 != 0 || Math.abs(g40Var.c0 - x30Var2.b[i36]) <= 10000000) {
                                                    long j20 = x30Var2.b[i36];
                                                    j11 = j15;
                                                    if (j20 >= g40Var.c0) {
                                                        x30Var2.e = i36;
                                                        g40Var.h0 = j20;
                                                        if (r2.a) {
                                                            jg.g.u(x30Var2.b[i36], jg.g.n(i36, "InstantCamera found first audio frame at ", " timestamp = "));
                                                        }
                                                    } else {
                                                        if (r2.a) {
                                                            jg.g.u(x30Var2.b[i36], jg.g.n(i36, "InstantCamera ignore first audio frame at ", " timestamp = "));
                                                        }
                                                        i36++;
                                                        j15 = j11;
                                                    }
                                                } else {
                                                    long j21 = g40Var.c0;
                                                    long j22 = x30Var2.b[i36];
                                                    g40Var.b0 = j21 - j22;
                                                    g40Var.h0 = j22;
                                                    if (r2.a) {
                                                        jg.g.u(g40Var.b0, new StringBuilder("InstantCamera detected desync between audio and video "));
                                                    }
                                                }
                                            }
                                            long j23 = j15;
                                            if (r2.a) {
                                                jg.g.s(x30Var2.d, new StringBuilder("InstantCamera first audio frame not found, removing buffers "));
                                            }
                                            g40Var.L.remove(x30Var2);
                                            if (g40Var.L.isEmpty()) {
                                                break;
                                            } else {
                                                x30Var2 = (x30) g40Var.L.get(0);
                                                j15 = j23;
                                            }
                                        }
                                        if (g40Var.P == j11) {
                                            g40Var.P = x30Var2.b[x30Var2.e];
                                        }
                                        if (g40Var.L.size() > 1) {
                                            x30Var2 = (x30) g40Var.L.get(0);
                                        }
                                        x30Var = x30Var2;
                                        g40Var.d(false);
                                        boolean z14 = false;
                                        while (x30Var != null) {
                                            try {
                                                int dequeueInputBuffer = g40Var.F.dequeueInputBuffer(j14);
                                                if (dequeueInputBuffer >= 0) {
                                                    ByteBuffer inputBuffer = g40Var.F.getInputBuffer(dequeueInputBuffer);
                                                    long[] jArr = x30Var.b;
                                                    int i37 = x30Var.e;
                                                    long j24 = jArr[i37];
                                                    while (true) {
                                                        int i38 = x30Var.d;
                                                        if (i37 <= i38) {
                                                            if (i37 < i38) {
                                                                j12 = j14;
                                                                j13 = x30Var.b[i37] - g40Var.P;
                                                                if (g40Var.W || (x30Var.b[i37] < g40Var.d0 - g40Var.b0 && j13 < 60000000)) {
                                                                    if (inputBuffer.remaining() < x30Var.c[i37]) {
                                                                        x30Var.e = i37;
                                                                    } else {
                                                                        inputBuffer.put(x30Var.a[i37]);
                                                                    }
                                                                }
                                                            } else {
                                                                j12 = j14;
                                                            }
                                                            if (i37 >= x30Var.d - 1) {
                                                                g40Var.L.remove(x30Var);
                                                                if (g40Var.W) {
                                                                    g40Var.z0.put(x30Var);
                                                                }
                                                                if (g40Var.L.isEmpty()) {
                                                                    z14 = x30Var.f;
                                                                } else {
                                                                    x30Var = (x30) g40Var.L.get(0);
                                                                }
                                                            }
                                                            i37++;
                                                            j14 = j12;
                                                        } else {
                                                            j12 = j14;
                                                        }
                                                    }
                                                    if (r2.a) {
                                                        if (j13 >= 60000000) {
                                                            a8.b("InstantCamera stop audio encoding because recorded time more than 60s");
                                                        } else {
                                                            a8.b("InstantCamera stop audio encoding because of stoped video recording at " + x30Var.b[i37] + " last video " + g40Var.d0);
                                                        }
                                                    }
                                                    g40Var.l0 = true;
                                                    g40Var.L.clear();
                                                    z14 = true;
                                                    x30Var = null;
                                                    long j25 = j24 == j12 ? j12 : j24 - g40Var.P;
                                                    long j26 = g40Var.k0;
                                                    if (j26 >= j12) {
                                                        j25 += j26;
                                                    }
                                                    g40Var.j0 = j25 - g40Var.i0;
                                                    g40Var.i0 = j25;
                                                    g40Var.F.queueInputBuffer(dequeueInputBuffer, 0, inputBuffer.position(), j25, z14 ? 4 : 0);
                                                } else {
                                                    j12 = j14;
                                                }
                                                j14 = j12;
                                            } catch (Throwable th2) {
                                                a8.g(th2, true);
                                                return;
                                            }
                                        }
                                        break;
                                    }
                                }
                                j11 = j15;
                                if (g40Var.P == j11) {
                                }
                                if (g40Var.L.size() > 1) {
                                }
                                x30Var = x30Var2;
                                g40Var.d(false);
                                boolean z142 = false;
                                while (x30Var != null) {
                                }
                            }
                        } else if (i16 == 4) {
                            if (r2.a) {
                                a8.d("InstantCamera pause encoder");
                            }
                            g40Var.D0 = true;
                            File file = g40Var.H0.f0;
                            if (file != null) {
                                file.delete();
                                g40Var.H0.f0 = null;
                            }
                            o40 o40Var12 = g40Var.H0;
                            o40Var12.f0 = e7.x(o40Var12.e, true);
                            try {
                                a8.b("InstantCamera handlePauseRecording drain encoders");
                                g40Var.d(false);
                            } catch (Exception e12) {
                                a8.g(e12, true);
                            }
                            MP4Builder mP4Builder = g40Var.K;
                            if (mP4Builder != null) {
                                try {
                                    mP4Builder.finishMovie(g40Var.H0.f0);
                                } catch (Exception e13) {
                                    a8.g(e13, true);
                                }
                            }
                            g0.h3(new e40(g40Var, i14));
                            break;
                        } else if (i16 == 5) {
                            if (r2.a) {
                                a8.d("InstantCamera resume encoder");
                            }
                            g40Var.D0 = false;
                            break;
                        }
                    }
                }
                break;
            default:
                m0 m0Var = (m0) this.b.get();
                if (m0Var != null) {
                    SparseArray sparseArray = m0Var.h;
                    r0 r0Var = m0Var.i;
                    ArrayList arrayList = r0Var.w;
                    int i39 = message.what;
                    int i40 = message.arg1;
                    int i41 = message.arg2;
                    Object obj = message.obj;
                    Bundle peekData = message.peekData();
                    switch (i39) {
                        case 0:
                            if (i40 == m0Var.g) {
                                m0Var.g = 0;
                                if (r0Var.D == m0Var) {
                                    r0Var.q();
                                }
                            }
                            if (((o0) sparseArray.get(i40)) != null) {
                                sparseArray.remove(i40);
                                o0.a(null, null);
                                break;
                            }
                            break;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (m0Var.f == 0 && i40 == m0Var.g && i41 >= 1) {
                                    m0Var.g = 0;
                                    m0Var.f = i41;
                                    ca.i g10 = ca.i.g(bundle);
                                    if (r0Var.D == m0Var) {
                                        r0Var.g(g10);
                                    }
                                    if (r0Var.D == m0Var) {
                                        r0Var.E = true;
                                        int size = arrayList.size();
                                        while (i13 < size) {
                                            ((n0) arrayList.get(i13)).a(r0Var.D);
                                            i13++;
                                        }
                                        s4.n nVar = (s4.n) r0Var.h;
                                        if (nVar != null) {
                                            m0 m0Var2 = r0Var.D;
                                            int i42 = m0Var2.d;
                                            m0Var2.d = i42 + 1;
                                            m0Var2.b(10, i42, 0, nVar.a, null);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                o0 o0Var = (o0) sparseArray.get(i40);
                                if (o0Var != null) {
                                    sparseArray.remove(i40);
                                    o0Var.b(bundle2);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                String string = peekData != null ? peekData.getString("error") : null;
                                Bundle bundle3 = (Bundle) obj;
                                if (((o0) sparseArray.get(i40)) != null) {
                                    sparseArray.remove(i40);
                                    o0.a(string, bundle3);
                                    break;
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (m0Var.f != 0) {
                                    ca.i g11 = ca.i.g(bundle4);
                                    if (r0Var.D == m0Var) {
                                        r0Var.g(g11);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 6:
                            if (obj instanceof Bundle) {
                                Bundle bundle5 = (Bundle) obj;
                                o0 o0Var2 = (o0) sparseArray.get(i40);
                                if (bundle5.containsKey("routeId")) {
                                    sparseArray.remove(i40);
                                    o0Var2.b(bundle5);
                                    break;
                                } else {
                                    o0Var2.getClass();
                                    o0.a("DynamicGroupRouteController is created without valid route id.", bundle5);
                                    break;
                                }
                            } else {
                                Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                                break;
                            }
                        case 7:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle6 = (Bundle) obj;
                                if (m0Var.f != 0) {
                                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                    s4.m mVar = bundle7 != null ? new s4.m(bundle7) : null;
                                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                    ArrayList arrayList2 = new ArrayList();
                                    int size2 = parcelableArrayList.size();
                                    int i43 = 0;
                                    while (i43 < size2) {
                                        Object obj2 = parcelableArrayList.get(i43);
                                        i43++;
                                        Bundle bundle8 = (Bundle) obj2;
                                        if (bundle8 == null) {
                                            oVar = null;
                                        } else {
                                            Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                            oVar = new s4.o(bundle9 != null ? new s4.m(bundle9) : null, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                        }
                                        arrayList2.add(oVar);
                                    }
                                    if (r0Var.D == m0Var) {
                                        int size3 = arrayList.size();
                                        while (true) {
                                            if (i13 < size3) {
                                                Object obj3 = arrayList.get(i13);
                                                i13++;
                                                ?? r22 = (n0) obj3;
                                                if (r22.b() == i41) {
                                                    p0Var = r22;
                                                }
                                            }
                                        }
                                        if (p0Var instanceof p0) {
                                            p0Var.l(mVar, arrayList2);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 8:
                            if (r0Var.D == m0Var) {
                                int size4 = arrayList.size();
                                while (true) {
                                    if (i13 < size4) {
                                        Object obj4 = arrayList.get(i13);
                                        i13++;
                                        n0 n0Var2 = (n0) obj4;
                                        if (n0Var2.b() == i41) {
                                            n0Var = n0Var2;
                                        }
                                    }
                                }
                                m3 m3Var = r0Var.F;
                                if (m3Var != null && (n0Var instanceof s4.q)) {
                                    s4.q qVar = (s4.q) n0Var;
                                    s4.e eVar = (s4.e) ((qe.h) m3Var.b).c;
                                    if (eVar.e == qVar) {
                                        eVar.i(eVar.c(), 2);
                                    }
                                }
                                arrayList.remove(n0Var);
                                n0Var.c();
                                r0Var.r();
                                break;
                            }
                            break;
                    }
                    int i44 = r0.G;
                    break;
                }
                break;
        }
    }

    public c(m0 m0Var) {
        this.a = 2;
        this.b = new WeakReference(m0Var);
    }
}
