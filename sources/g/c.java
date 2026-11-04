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
import gi.f7;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import k2.p1;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.camera.Size;
import org.telegram.messenger.g0;
import org.telegram.messenger.r2;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.a40;
import org.telegram.ui.Components.c40;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.k30;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.l30;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.z30;
import r4.n0;
import r4.o0;
import r4.p0;
import r4.q0;
import r4.s0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends Handler {
    public final /* synthetic */ int a;
    public WeakReference b;

    public /* synthetic */ c(int i3) {
        this.a = i3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:176|(2:178|(2:180|(1:182))(11:(7:185|(2:(2:195|(3:203|204|(1:206))(3:197|(2:199|200)(1:202)|201))(3:191|192|(1:194))|186)|289|290|(1:292)|293|(1:295)(1:296))|207|(1:209)|210|(1:212)|213|214|215|216|(4:218|219|(15:221|(2:222|(4:(2:225|(2:256|(2:272|273)(1:258)))(1:274)|259|(4:261|(1:263)|264|(2:266|267)(2:269|270))(1:271)|268)(2:275|276))|232|(2:234|(1:236)(1:237))|238|239|240|(1:242)(1:254)|243|(1:245)|246|(1:248)(1:253)|249|250|251)(2:277|278)|252)|284))|298|207|(0)|210|(0)|213|214|215|216|(0)|284) */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x035c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x035d, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x04f2, code lost:
    
        if (r9 < 0) goto L292;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:209:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0363 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0524  */
    /* JADX WARN: Type inference failed for: r2v99, types: [r4.o0] */
    /* JADX WARN: Type inference failed for: r44v1 */
    /* JADX WARN: Type inference failed for: r44v2 */
    /* JADX WARN: Type inference failed for: r44v3 */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        boolean z10;
        boolean z11;
        long j10;
        boolean z12;
        long j11;
        boolean z13;
        FloatBuffer floatBuffer;
        FloatBuffer floatBuffer2;
        ?? r44;
        int i3;
        int i10;
        float f10;
        float f11;
        int i11;
        float f12;
        int i12;
        long j12;
        t30 t30Var;
        long j13;
        long j14;
        r4.o oVar;
        o0 o0Var = null;
        q0 q0Var = null;
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
                c40 c40Var = (c40) this.b.get();
                if (c40Var != null) {
                    if (i16 == 0) {
                        try {
                            if (r2.a) {
                                a8.d("InstantCamera start encoder");
                            }
                            c40.a(c40Var, message.arg1 == 1);
                            break;
                        } catch (Exception e10) {
                            a8.g(e10, true);
                            c40.b(c40Var, 0, null);
                            Looper.myLooper().quit();
                            return;
                        }
                    } else if (i16 == 1) {
                        if (r2.a) {
                            a8.d("InstantCamera stop encoder");
                        }
                        c40.b(c40Var, message.arg1, (z30) message.obj);
                        break;
                    } else {
                        int i17 = 5;
                        long j15 = 0;
                        long j16 = -1;
                        if (i16 == 2) {
                            long j17 = (message.arg1 << 32) | (message.arg2 & 4294967295L);
                            Integer num = (Integer) message.obj;
                            if (!c40Var.E0 && c40Var.I0.W) {
                                try {
                                    c40Var.e(false);
                                } catch (Exception e11) {
                                    a8.g(e11, true);
                                }
                                if (c40Var.x0.equals(num)) {
                                    z10 = false;
                                } else {
                                    c40Var.x0 = num;
                                    z10 = true;
                                }
                                long j18 = c40Var.h0;
                                if (j18 >= 0) {
                                    if (c40Var.g0 == -1) {
                                        c40Var.g0 = j17 - j18;
                                    }
                                    j17 -= c40Var.g0;
                                }
                                if (!z10) {
                                    long j19 = c40Var.T;
                                    if (j19 != -1) {
                                        j10 = j17 - j19;
                                        c40Var.T = j17;
                                        j11 = j10;
                                        z13 = 3;
                                        c40Var.R = false;
                                        c40Var.P = System.currentTimeMillis();
                                        if (!c40Var.b0) {
                                            long j20 = c40Var.a0 + j10;
                                            c40Var.a0 = j20;
                                            if (j20 >= 200000000) {
                                                c40Var.b0 = true;
                                            }
                                        }
                                        c40Var.S += j10;
                                        if (c40Var.d0 == -1) {
                                            c40Var.d0 = j17 / 1000;
                                            if (r2.a) {
                                                p1.r(c40Var.d0, new StringBuilder("InstantCamera first video frame was at "));
                                            }
                                        }
                                        c40Var.f0 = j17 - c40Var.e0;
                                        c40Var.e0 = j17;
                                        k40 k40Var = c40Var.I0;
                                        floatBuffer = k40Var.J0;
                                        floatBuffer2 = k40Var.I0;
                                        FloatBuffer floatBuffer3 = k40Var.K0;
                                        if (floatBuffer != null || floatBuffer2 == null) {
                                            a8.b("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                                            break;
                                        } else {
                                            l30 l30Var = c40Var.y0;
                                            int i18 = 3553;
                                            if (l30Var != null) {
                                                r44 = z13;
                                                GLES20.glBindFramebuffer(36160, l30Var.j[0]);
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, l30Var.k[0], 0);
                                                GLES20.glViewport(0, 0, l30Var.a, l30Var.b);
                                            } else {
                                                r44 = z13;
                                            }
                                            GLES20.glUseProgram(c40Var.n0);
                                            GLES20.glActiveTexture(33984);
                                            GLES20.glVertexAttribPointer(c40Var.q0, 3, 5126, false, 12, (Buffer) floatBuffer2);
                                            GLES20.glEnableVertexAttribArray(c40Var.q0);
                                            GLES20.glVertexAttribPointer(c40Var.r0, 2, 5126, false, 8, (Buffer) floatBuffer);
                                            GLES20.glEnableVertexAttribArray(c40Var.r0);
                                            GLES20.glUniformMatrix4fv(c40Var.o0, 1, false, c40Var.I0.F0, 0);
                                            GLES20.glUniform2f(c40Var.s0, c40Var.d, c40Var.e);
                                            k40 k40Var2 = c40Var.I0;
                                            if (k40Var2.c0[0] == 0 || floatBuffer3 == null || k40Var2.u0) {
                                                i3 = 33984;
                                                i10 = 36197;
                                                f10 = 1.0f;
                                            } else {
                                                if (!c40Var.n) {
                                                    GLES20.glEnable(3042);
                                                    c40Var.n = true;
                                                }
                                                if (c40Var.I0.N0 != null) {
                                                    i3 = 33984;
                                                    GLES20.glUniform2f(c40Var.t0, r4.getWidth(), c40Var.I0.N0.getHeight());
                                                } else {
                                                    i3 = 33984;
                                                }
                                                i10 = 36197;
                                                f10 = 1.0f;
                                                GLES20.glVertexAttribPointer(c40Var.r0, 2, 5126, false, 8, (Buffer) floatBuffer3);
                                                GLES20.glUniformMatrix4fv(c40Var.p0, 1, false, c40Var.I0.H0, 0);
                                                GLES20.glUniform1f(c40Var.v0, 1.0f);
                                                GLES20.glBindTexture(36197, c40Var.I0.c0[0]);
                                                GLES20.glDrawArrays(5, 0, 4);
                                            }
                                            k40 k40Var3 = c40Var.I0;
                                            Size[] sizeArr = k40Var3.n0;
                                            if (sizeArr != null) {
                                                int i19 = c40Var.t0;
                                                float width = sizeArr[k40Var3.k1].getWidth();
                                                k40 k40Var4 = c40Var.I0;
                                                f11 = 2.0f;
                                                GLES20.glUniform2f(i19, width, k40Var4.n0[k40Var4.k1].getHeight());
                                                int i20 = c40Var.u0;
                                                k40 k40Var5 = c40Var.I0;
                                                float width2 = (f10 / k40Var5.n0[k40Var5.k1].getWidth()) / 2.0f;
                                                k40 k40Var6 = c40Var.I0;
                                                GLES20.glUniform2f(i20, width2, (f10 / k40Var6.n0[k40Var6.k1].getHeight()) / 2.0f);
                                            } else {
                                                f11 = 2.0f;
                                            }
                                            k40 k40Var7 = c40Var.I0;
                                            int i21 = k40Var7.b0[k40Var7.k1];
                                            if (i21 != Integer.MIN_VALUE) {
                                                i11 = 0;
                                                GLES20.glUniformMatrix4fv(c40Var.p0, 1, false, c40Var.I0.G0, 0);
                                                GLES20.glUniform1f(c40Var.v0, c40Var.I0.d0);
                                                GLES20.glBindTexture(i10, i21);
                                                GLES20.glDrawArrays(5, 0, 4);
                                            } else {
                                                i11 = 0;
                                            }
                                            GLES20.glDisableVertexAttribArray(c40Var.q0);
                                            GLES20.glDisableVertexAttribArray(c40Var.r0);
                                            GLES20.glBindTexture(i10, i11);
                                            GLES20.glUseProgram(i11);
                                            l30 l30Var2 = c40Var.y0;
                                            if (l30Var2 != null) {
                                                GLES20.glDisable(3042);
                                                d4.b bVar = l30Var2.c;
                                                int[] iArr = l30Var2.k;
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], i11);
                                                GLES20.glViewport(i11, i11, 48, 48);
                                                f12 = f10;
                                                GLES20.glUseProgram(bVar.a);
                                                int i22 = bVar.d;
                                                FloatBuffer floatBuffer4 = l30Var2.g;
                                                GLES20.glVertexAttribPointer(i22, 3, 5126, false, 12, floatBuffer4.position(i11));
                                                int i23 = bVar.d;
                                                GLES20.glEnableVertexAttribArray(i23);
                                                int i24 = bVar.e;
                                                FloatBuffer floatBuffer5 = l30Var2.h;
                                                GLES20.glVertexAttribPointer(i24, 2, 5126, false, 8, floatBuffer5.position(i11));
                                                int i25 = bVar.e;
                                                GLES20.glEnableVertexAttribArray(i25);
                                                GLES20.glActiveTexture(i3);
                                                GLES20.glBindTexture(3553, iArr[i11]);
                                                GLES20.glUniform1i(bVar.f, i11);
                                                GLES20.glDrawArrays(5, i11, 4);
                                                GLES20.glBindTexture(3553, i11);
                                                GLES20.glDisableVertexAttribArray(i25);
                                                GLES20.glDisableVertexAttribArray(i23);
                                                GLES20.glUseProgram(i11);
                                                int i26 = i11;
                                                for (int i27 = 2; i26 < i27; i27 = 2) {
                                                    j30 j30Var = l30Var2.e;
                                                    GLES20.glFramebufferTexture2D(36160, 36064, i18, iArr[i26 == 0 ? i27 : 1], i11);
                                                    GLES20.glViewport(i11, i11, 48, 48);
                                                    int i28 = j30Var.a;
                                                    int i29 = j30Var.e;
                                                    int i30 = j30Var.d;
                                                    GLES20.glUseProgram(i28);
                                                    GLES20.glVertexAttribPointer(j30Var.d, 3, 5126, false, 12, floatBuffer4.position(i11));
                                                    GLES20.glEnableVertexAttribArray(i30);
                                                    GLES20.glVertexAttribPointer(j30Var.e, 2, 5126, false, 8, floatBuffer5.position(i11));
                                                    GLES20.glEnableVertexAttribArray(i29);
                                                    GLES20.glActiveTexture(i3);
                                                    GLES20.glBindTexture(i18, iArr[i26 == 0 ? (char) 1 : (char) 2]);
                                                    i11 = 0;
                                                    GLES20.glUniform1i(j30Var.f, 0);
                                                    GLES20.glUniform2f(j30Var.g, i26 == 0 ? 0.020833334f : 0.0f, i26 == 1 ? 0.020833334f : 0.0f);
                                                    GLES20.glDrawArrays(5, 0, 4);
                                                    GLES20.glBindTexture(3553, 0);
                                                    GLES20.glDisableVertexAttribArray(i29);
                                                    GLES20.glDisableVertexAttribArray(i30);
                                                    GLES20.glUseProgram(0);
                                                    i26++;
                                                    i18 = 3553;
                                                }
                                                k30 k30Var = l30Var2.f;
                                                GLES20.glBindFramebuffer(36160, i11);
                                                GLES20.glFramebufferTexture2D(36160, 36064, i18, iArr[1], i11);
                                                GLES20.glViewport(i11, i11, l30Var2.a, l30Var2.b);
                                                GLES20.glUseProgram(k30Var.a);
                                                GLES20.glVertexAttribPointer(k30Var.d, 3, 5126, false, 12, floatBuffer4.position(i11));
                                                GLES20.glEnableVertexAttribArray(k30Var.d);
                                                GLES20.glVertexAttribPointer(k30Var.e, 2, 5126, false, 8, floatBuffer5.position(i11));
                                                GLES20.glEnableVertexAttribArray(k30Var.e);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, iArr[1]);
                                                GLES20.glActiveTexture(i3);
                                                GLES20.glBindTexture(3553, iArr[0]);
                                                GLES20.glUniform1i(k30Var.f, 0);
                                                GLES20.glUniform1i(k30Var.g, 1);
                                                GLES20.glUniform2f(k30Var.h, l30Var2.a / f11, l30Var2.b / f11);
                                                GLES20.glDrawArrays(5, 0, 4);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glActiveTexture(i3);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glDisableVertexAttribArray(k30Var.e);
                                                GLES20.glDisableVertexAttribArray(k30Var.d);
                                                GLES20.glUseProgram(0);
                                                d4.b bVar2 = l30Var2.d;
                                                GLES20.glEnable(3042);
                                                int i31 = bVar2.a;
                                                int i32 = bVar2.e;
                                                int i33 = bVar2.d;
                                                GLES20.glUseProgram(i31);
                                                GLES20.glActiveTexture(i3);
                                                for (int i34 = 0; i34 < 2; i34++) {
                                                    if (i34 == 0) {
                                                        GLES20.glVertexAttribPointer(bVar2.d, 3, 5126, false, 12, floatBuffer4.position(12));
                                                        GLES20.glEnableVertexAttribArray(i33);
                                                        GLES20.glVertexAttribPointer(bVar2.e, 2, 5126, false, 8, floatBuffer5.position(8));
                                                        GLES20.glEnableVertexAttribArray(i32);
                                                        GLES20.glBindTexture(3553, iArr[r44]);
                                                        i12 = 4;
                                                    } else {
                                                        int i35 = l30Var2.i;
                                                        l30Var2.i = i35 + 1;
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
                                                if (c40Var.n) {
                                                    GLES20.glEnable(3042);
                                                }
                                            } else {
                                                f12 = f10;
                                            }
                                            EGLExt.eglPresentationTimeANDROID(c40Var.s, c40Var.E, c40Var.S);
                                            EGL14.eglSwapBuffers(c40Var.s, c40Var.E);
                                            if (c40Var.C0 != null && az.o() == 2 && c40Var.D0 % 33 == 0) {
                                                c40Var.C0.postRunnable(new lt(c40Var, 4));
                                            }
                                            c40Var.D0++;
                                            k40 k40Var8 = c40Var.I0;
                                            if (k40Var8.c0[0] != 0) {
                                                float f13 = k40Var8.d0;
                                                if (f13 < f12 && !k40Var8.u0) {
                                                    float f14 = (j11 / 2.0E8f) + f13;
                                                    k40Var8.d0 = f14;
                                                    if (f14 > f12) {
                                                        GLES20.glDisable(3042);
                                                        c40Var.n = false;
                                                        k40 k40Var9 = c40Var.I0;
                                                        k40Var9.d0 = f12;
                                                        GLES20.glDeleteTextures(1, k40Var9.c0, 0);
                                                        k40 k40Var10 = c40Var.I0;
                                                        k40Var10.c0[0] = 0;
                                                        if (!k40Var10.K) {
                                                            c40Var.I0.K = true;
                                                            g0.h3(new a40(c40Var, 4));
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!k40Var8.K) {
                                                c40Var.I0.K = true;
                                                g0.h3(new a40(c40Var, i17));
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (c40Var.S != 0 && !c40Var.R) {
                                    j10 = j17 - c40Var.T;
                                    boolean z14 = 3;
                                    long currentTimeMillis = (System.currentTimeMillis() - c40Var.P) * 1000000;
                                    if (j10 < 0 || Math.abs(currentTimeMillis - j10) > 100000000) {
                                        j10 = currentTimeMillis;
                                    }
                                    z12 = z14;
                                    z11 = z14;
                                    break;
                                } else {
                                    z11 = 3;
                                }
                                j10 = 0;
                                z12 = z11;
                                c40Var.T = j17;
                                j11 = 0;
                                z13 = z12;
                                c40Var.R = false;
                                c40Var.P = System.currentTimeMillis();
                                if (!c40Var.b0) {
                                }
                                c40Var.S += j10;
                                if (c40Var.d0 == -1) {
                                }
                                c40Var.f0 = j17 - c40Var.e0;
                                c40Var.e0 = j17;
                                k40 k40Var11 = c40Var.I0;
                                floatBuffer = k40Var11.J0;
                                floatBuffer2 = k40Var11.I0;
                                FloatBuffer floatBuffer32 = k40Var11.K0;
                                if (floatBuffer != null) {
                                }
                                a8.b("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                            }
                        } else if (i16 == 3) {
                            t30 t30Var2 = (t30) message.obj;
                            if (!c40Var.E0 && !c40Var.m0) {
                                c40Var.M.add(t30Var2);
                                if (c40Var.i0 == -1) {
                                    if (c40Var.d0 == -1) {
                                        if (r2.a) {
                                            a8.b("InstantCamera video record not yet started");
                                            break;
                                        }
                                    } else {
                                        while (true) {
                                            int i36 = 0;
                                            while (i36 < t30Var2.d) {
                                                if (i36 != 0 || Math.abs(c40Var.d0 - t30Var2.b[i36]) <= 10000000) {
                                                    long j21 = t30Var2.b[i36];
                                                    j12 = j16;
                                                    if (j21 >= c40Var.d0) {
                                                        t30Var2.e = i36;
                                                        c40Var.i0 = j21;
                                                        if (r2.a) {
                                                            p1.r(t30Var2.b[i36], p1.m(i36, "InstantCamera found first audio frame at ", " timestamp = "));
                                                        }
                                                    } else {
                                                        if (r2.a) {
                                                            p1.r(t30Var2.b[i36], p1.m(i36, "InstantCamera ignore first audio frame at ", " timestamp = "));
                                                        }
                                                        i36++;
                                                        j16 = j12;
                                                    }
                                                } else {
                                                    long j22 = c40Var.d0;
                                                    long j23 = t30Var2.b[i36];
                                                    c40Var.c0 = j22 - j23;
                                                    c40Var.i0 = j23;
                                                    if (r2.a) {
                                                        p1.r(c40Var.c0, new StringBuilder("InstantCamera detected desync between audio and video "));
                                                    }
                                                }
                                            }
                                            long j24 = j16;
                                            if (r2.a) {
                                                p1.q(t30Var2.d, new StringBuilder("InstantCamera first audio frame not found, removing buffers "));
                                            }
                                            c40Var.M.remove(t30Var2);
                                            if (c40Var.M.isEmpty()) {
                                                break;
                                            } else {
                                                t30Var2 = (t30) c40Var.M.get(0);
                                                j16 = j24;
                                            }
                                        }
                                        if (c40Var.Q == j12) {
                                            c40Var.Q = t30Var2.b[t30Var2.e];
                                        }
                                        if (c40Var.M.size() > 1) {
                                            t30Var2 = (t30) c40Var.M.get(0);
                                        }
                                        t30Var = t30Var2;
                                        c40Var.e(false);
                                        boolean z15 = false;
                                        while (t30Var != null) {
                                            try {
                                                int dequeueInputBuffer = c40Var.G.dequeueInputBuffer(j15);
                                                if (dequeueInputBuffer >= 0) {
                                                    ByteBuffer inputBuffer = c40Var.G.getInputBuffer(dequeueInputBuffer);
                                                    long[] jArr = t30Var.b;
                                                    int i37 = t30Var.e;
                                                    long j25 = jArr[i37];
                                                    while (true) {
                                                        int i38 = t30Var.d;
                                                        if (i37 <= i38) {
                                                            if (i37 < i38) {
                                                                j13 = j15;
                                                                j14 = t30Var.b[i37] - c40Var.Q;
                                                                if (c40Var.X || (t30Var.b[i37] < c40Var.e0 - c40Var.c0 && j14 < 60000000)) {
                                                                    if (inputBuffer.remaining() < t30Var.c[i37]) {
                                                                        t30Var.e = i37;
                                                                    } else {
                                                                        inputBuffer.put(t30Var.a[i37]);
                                                                    }
                                                                }
                                                            } else {
                                                                j13 = j15;
                                                            }
                                                            if (i37 >= t30Var.d - 1) {
                                                                c40Var.M.remove(t30Var);
                                                                if (c40Var.X) {
                                                                    c40Var.A0.put(t30Var);
                                                                }
                                                                if (c40Var.M.isEmpty()) {
                                                                    z15 = t30Var.f;
                                                                } else {
                                                                    t30Var = (t30) c40Var.M.get(0);
                                                                }
                                                            }
                                                            i37++;
                                                            j15 = j13;
                                                        } else {
                                                            j13 = j15;
                                                        }
                                                    }
                                                    if (r2.a) {
                                                        if (j14 >= 60000000) {
                                                            a8.b("InstantCamera stop audio encoding because recorded time more than 60s");
                                                        } else {
                                                            a8.b("InstantCamera stop audio encoding because of stoped video recording at " + t30Var.b[i37] + " last video " + c40Var.e0);
                                                        }
                                                    }
                                                    c40Var.m0 = true;
                                                    c40Var.M.clear();
                                                    z15 = true;
                                                    t30Var = null;
                                                    long j26 = j25 == j13 ? j13 : j25 - c40Var.Q;
                                                    long j27 = c40Var.l0;
                                                    if (j27 >= j13) {
                                                        j26 += j27;
                                                    }
                                                    c40Var.k0 = j26 - c40Var.j0;
                                                    c40Var.j0 = j26;
                                                    c40Var.G.queueInputBuffer(dequeueInputBuffer, 0, inputBuffer.position(), j26, z15 ? 4 : 0);
                                                } else {
                                                    j13 = j15;
                                                }
                                                j15 = j13;
                                            } catch (Throwable th2) {
                                                a8.g(th2, true);
                                                return;
                                            }
                                        }
                                        break;
                                    }
                                }
                                j12 = j16;
                                if (c40Var.Q == j12) {
                                }
                                if (c40Var.M.size() > 1) {
                                }
                                t30Var = t30Var2;
                                c40Var.e(false);
                                boolean z152 = false;
                                while (t30Var != null) {
                                }
                            }
                        } else if (i16 == 4) {
                            if (r2.a) {
                                a8.d("InstantCamera pause encoder");
                            }
                            c40Var.E0 = true;
                            File file = c40Var.I0.g0;
                            if (file != null) {
                                file.delete();
                                c40Var.I0.g0 = null;
                            }
                            k40 k40Var12 = c40Var.I0;
                            k40Var12.g0 = f7.x(k40Var12.e, true);
                            try {
                                a8.b("InstantCamera handlePauseRecording drain encoders");
                                c40Var.e(false);
                            } catch (Exception e12) {
                                a8.g(e12, true);
                            }
                            MP4Builder mP4Builder = c40Var.L;
                            if (mP4Builder != null) {
                                try {
                                    mP4Builder.finishMovie(c40Var.I0.g0);
                                } catch (Exception e13) {
                                    a8.g(e13, true);
                                }
                            }
                            g0.h3(new a40(c40Var, i14));
                            break;
                        } else if (i16 == 5) {
                            if (r2.a) {
                                a8.d("InstantCamera resume encoder");
                            }
                            c40Var.E0 = false;
                            break;
                        }
                    }
                }
                break;
            default:
                n0 n0Var = (n0) this.b.get();
                if (n0Var != null) {
                    SparseArray sparseArray = n0Var.h;
                    s0 s0Var = n0Var.i;
                    ArrayList arrayList = s0Var.w;
                    int i39 = message.what;
                    int i40 = message.arg1;
                    int i41 = message.arg2;
                    Object obj = message.obj;
                    Bundle peekData = message.peekData();
                    switch (i39) {
                        case 0:
                            if (i40 == n0Var.g) {
                                n0Var.g = 0;
                                if (s0Var.E == n0Var) {
                                    s0Var.q();
                                }
                            }
                            if (((p0) sparseArray.get(i40)) != null) {
                                sparseArray.remove(i40);
                                p0.a(null, null);
                                break;
                            }
                            break;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (n0Var.f == 0 && i40 == n0Var.g && i41 >= 1) {
                                    n0Var.g = 0;
                                    n0Var.f = i41;
                                    ba.i g7 = ba.i.g(bundle);
                                    if (s0Var.E == n0Var) {
                                        s0Var.g(g7);
                                    }
                                    if (s0Var.E == n0Var) {
                                        s0Var.F = true;
                                        int size = arrayList.size();
                                        while (i13 < size) {
                                            ((o0) arrayList.get(i13)).b(s0Var.E);
                                            i13++;
                                        }
                                        r4.n nVar = (r4.n) s0Var.h;
                                        if (nVar != null) {
                                            n0 n0Var2 = s0Var.E;
                                            int i42 = n0Var2.d;
                                            n0Var2.d = i42 + 1;
                                            n0Var2.b(10, i42, 0, nVar.a, null);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                p0 p0Var = (p0) sparseArray.get(i40);
                                if (p0Var != null) {
                                    sparseArray.remove(i40);
                                    p0Var.b(bundle2);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                String string = peekData != null ? peekData.getString("error") : null;
                                Bundle bundle3 = (Bundle) obj;
                                if (((p0) sparseArray.get(i40)) != null) {
                                    sparseArray.remove(i40);
                                    p0.a(string, bundle3);
                                    break;
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (n0Var.f != 0) {
                                    ba.i g10 = ba.i.g(bundle4);
                                    if (s0Var.E == n0Var) {
                                        s0Var.g(g10);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 6:
                            if (obj instanceof Bundle) {
                                Bundle bundle5 = (Bundle) obj;
                                p0 p0Var2 = (p0) sparseArray.get(i40);
                                if (bundle5.containsKey("routeId")) {
                                    sparseArray.remove(i40);
                                    p0Var2.b(bundle5);
                                    break;
                                } else {
                                    p0Var2.getClass();
                                    p0.a("DynamicGroupRouteController is created without valid route id.", bundle5);
                                    break;
                                }
                            } else {
                                Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                                break;
                            }
                        case 7:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle6 = (Bundle) obj;
                                if (n0Var.f != 0) {
                                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                    r4.m mVar = bundle7 != null ? new r4.m(bundle7) : null;
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
                                            oVar = new r4.o(bundle9 != null ? new r4.m(bundle9) : null, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                        }
                                        arrayList2.add(oVar);
                                    }
                                    if (s0Var.E == n0Var) {
                                        int size3 = arrayList.size();
                                        while (true) {
                                            if (i13 < size3) {
                                                Object obj3 = arrayList.get(i13);
                                                i13++;
                                                ?? r22 = (o0) obj3;
                                                if (r22.a() == i41) {
                                                    q0Var = r22;
                                                }
                                            }
                                        }
                                        if (q0Var instanceof q0) {
                                            q0Var.l(mVar, arrayList2);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 8:
                            if (s0Var.E == n0Var) {
                                int size4 = arrayList.size();
                                while (true) {
                                    if (i13 < size4) {
                                        Object obj4 = arrayList.get(i13);
                                        i13++;
                                        o0 o0Var2 = (o0) obj4;
                                        if (o0Var2.a() == i41) {
                                            o0Var = o0Var2;
                                        }
                                    }
                                }
                                e3 e3Var = s0Var.G;
                                if (e3Var != null && (o0Var instanceof r4.q)) {
                                    r4.q qVar = (r4.q) o0Var;
                                    r4.e eVar = (r4.e) ((ne.h) e3Var.b).c;
                                    if (eVar.e == qVar) {
                                        eVar.i(eVar.c(), 2);
                                    }
                                }
                                arrayList.remove(o0Var);
                                o0Var.c();
                                s0Var.r();
                                break;
                            }
                            break;
                    }
                    int i44 = s0.H;
                    break;
                }
                break;
        }
    }

    public c(n0 n0Var) {
        this.a = 2;
        this.b = new WeakReference(n0Var);
    }
}
