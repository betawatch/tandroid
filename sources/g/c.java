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
import hi.d7;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.Size;
import org.telegram.messenger.g0;
import org.telegram.messenger.gz;
import org.telegram.messenger.r2;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.ui.Components.a40;
import org.telegram.ui.Components.g40;
import org.telegram.ui.Components.h40;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.r30;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.s30;
import org.telegram.ui.Components.zj;
import s4.m0;
import s4.n0;
import s4.o0;
import s4.p0;
import s4.r0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
    /* JADX WARN: Code restructure failed: missing block: B:439:0x04f0, code lost:
    
        if (r10 < 0) goto L292;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:209:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0363 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0522  */
    /* JADX WARN: Type inference failed for: r2v100, types: [s4.n0] */
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
        long j3;
        boolean z12;
        long j10;
        boolean z13;
        FloatBuffer floatBuffer;
        FloatBuffer floatBuffer2;
        ?? r44;
        int i7;
        int i10;
        float f10;
        float f11;
        int i11;
        float f12;
        int i12;
        long j11;
        a40 a40Var;
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
                j40 j40Var = (j40) this.b.get();
                if (j40Var != null) {
                    if (i16 == 0) {
                        try {
                            if (r2.a) {
                                a8.d("InstantCamera start encoder");
                            }
                            j40.a(j40Var, message.arg1 == 1);
                            break;
                        } catch (Exception e10) {
                            a8.g(e10, true);
                            j40.b(j40Var, 0, null);
                            Looper.myLooper().quit();
                            return;
                        }
                    } else if (i16 == 1) {
                        if (r2.a) {
                            a8.d("InstantCamera stop encoder");
                        }
                        j40.b(j40Var, message.arg1, (g40) message.obj);
                        break;
                    } else {
                        int i17 = 5;
                        long j14 = 0;
                        long j15 = -1;
                        if (i16 == 2) {
                            long j16 = (message.arg1 << 32) | (message.arg2 & 4294967295L);
                            Integer num = (Integer) message.obj;
                            if (!j40Var.E0 && j40Var.I0.W) {
                                try {
                                    j40Var.d(false);
                                } catch (Exception e11) {
                                    a8.g(e11, true);
                                }
                                if (j40Var.x0.equals(num)) {
                                    z10 = false;
                                } else {
                                    j40Var.x0 = num;
                                    z10 = true;
                                }
                                long j17 = j40Var.h0;
                                if (j17 >= 0) {
                                    if (j40Var.g0 == -1) {
                                        j40Var.g0 = j16 - j17;
                                    }
                                    j16 -= j40Var.g0;
                                }
                                if (!z10) {
                                    long j18 = j40Var.T;
                                    if (j18 != -1) {
                                        j3 = j16 - j18;
                                        j40Var.T = j16;
                                        j10 = j3;
                                        z13 = 3;
                                        j40Var.R = false;
                                        j40Var.P = System.currentTimeMillis();
                                        if (!j40Var.b0) {
                                            long j19 = j40Var.a0 + j3;
                                            j40Var.a0 = j19;
                                            if (j19 >= 200000000) {
                                                j40Var.b0 = true;
                                            }
                                        }
                                        j40Var.S += j3;
                                        if (j40Var.d0 == -1) {
                                            j40Var.d0 = j16 / 1000;
                                            if (r2.a) {
                                                i5.c.t(j40Var.d0, new StringBuilder("InstantCamera first video frame was at "));
                                            }
                                        }
                                        j40Var.f0 = j16 - j40Var.e0;
                                        j40Var.e0 = j16;
                                        r40 r40Var = j40Var.I0;
                                        floatBuffer = r40Var.J0;
                                        floatBuffer2 = r40Var.I0;
                                        FloatBuffer floatBuffer3 = r40Var.K0;
                                        if (floatBuffer != null || floatBuffer2 == null) {
                                            a8.b("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                                            break;
                                        } else {
                                            s30 s30Var = j40Var.y0;
                                            int i18 = 3553;
                                            if (s30Var != null) {
                                                r44 = z13;
                                                GLES20.glBindFramebuffer(36160, s30Var.j[0]);
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, s30Var.k[0], 0);
                                                GLES20.glViewport(0, 0, s30Var.a, s30Var.b);
                                            } else {
                                                r44 = z13;
                                            }
                                            GLES20.glUseProgram(j40Var.n0);
                                            GLES20.glActiveTexture(33984);
                                            GLES20.glVertexAttribPointer(j40Var.q0, 3, 5126, false, 12, (Buffer) floatBuffer2);
                                            GLES20.glEnableVertexAttribArray(j40Var.q0);
                                            GLES20.glVertexAttribPointer(j40Var.r0, 2, 5126, false, 8, (Buffer) floatBuffer);
                                            GLES20.glEnableVertexAttribArray(j40Var.r0);
                                            GLES20.glUniformMatrix4fv(j40Var.o0, 1, false, j40Var.I0.F0, 0);
                                            GLES20.glUniform2f(j40Var.s0, j40Var.d, j40Var.e);
                                            r40 r40Var2 = j40Var.I0;
                                            if (r40Var2.c0[0] == 0 || floatBuffer3 == null || r40Var2.u0) {
                                                i7 = 33984;
                                                i10 = 36197;
                                                f10 = 1.0f;
                                            } else {
                                                if (!j40Var.n) {
                                                    GLES20.glEnable(3042);
                                                    j40Var.n = true;
                                                }
                                                if (j40Var.I0.N0 != null) {
                                                    i7 = 33984;
                                                    GLES20.glUniform2f(j40Var.t0, r4.getWidth(), j40Var.I0.N0.getHeight());
                                                } else {
                                                    i7 = 33984;
                                                }
                                                i10 = 36197;
                                                f10 = 1.0f;
                                                GLES20.glVertexAttribPointer(j40Var.r0, 2, 5126, false, 8, (Buffer) floatBuffer3);
                                                GLES20.glUniformMatrix4fv(j40Var.p0, 1, false, j40Var.I0.H0, 0);
                                                GLES20.glUniform1f(j40Var.v0, 1.0f);
                                                GLES20.glBindTexture(36197, j40Var.I0.c0[0]);
                                                GLES20.glDrawArrays(5, 0, 4);
                                            }
                                            r40 r40Var3 = j40Var.I0;
                                            Size[] sizeArr = r40Var3.n0;
                                            if (sizeArr != null) {
                                                int i19 = j40Var.t0;
                                                float width = sizeArr[r40Var3.k1].getWidth();
                                                r40 r40Var4 = j40Var.I0;
                                                f11 = 2.0f;
                                                GLES20.glUniform2f(i19, width, r40Var4.n0[r40Var4.k1].getHeight());
                                                int i20 = j40Var.u0;
                                                r40 r40Var5 = j40Var.I0;
                                                float width2 = (f10 / r40Var5.n0[r40Var5.k1].getWidth()) / 2.0f;
                                                r40 r40Var6 = j40Var.I0;
                                                GLES20.glUniform2f(i20, width2, (f10 / r40Var6.n0[r40Var6.k1].getHeight()) / 2.0f);
                                            } else {
                                                f11 = 2.0f;
                                            }
                                            r40 r40Var7 = j40Var.I0;
                                            int i21 = r40Var7.b0[r40Var7.k1];
                                            if (i21 != Integer.MIN_VALUE) {
                                                i11 = 0;
                                                GLES20.glUniformMatrix4fv(j40Var.p0, 1, false, j40Var.I0.G0, 0);
                                                GLES20.glUniform1f(j40Var.v0, j40Var.I0.d0);
                                                GLES20.glBindTexture(i10, i21);
                                                GLES20.glDrawArrays(5, 0, 4);
                                            } else {
                                                i11 = 0;
                                            }
                                            GLES20.glDisableVertexAttribArray(j40Var.q0);
                                            GLES20.glDisableVertexAttribArray(j40Var.r0);
                                            GLES20.glBindTexture(i10, i11);
                                            GLES20.glUseProgram(i11);
                                            s30 s30Var2 = j40Var.y0;
                                            if (s30Var2 != null) {
                                                GLES20.glDisable(3042);
                                                e4.b bVar = s30Var2.c;
                                                int[] iArr = s30Var2.k;
                                                f12 = f10;
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], i11);
                                                GLES20.glViewport(i11, i11, 48, 48);
                                                GLES20.glUseProgram(bVar.a);
                                                int i22 = bVar.d;
                                                FloatBuffer floatBuffer4 = s30Var2.g;
                                                GLES20.glVertexAttribPointer(i22, 3, 5126, false, 12, floatBuffer4.position(i11));
                                                int i23 = bVar.d;
                                                GLES20.glEnableVertexAttribArray(i23);
                                                int i24 = bVar.e;
                                                FloatBuffer floatBuffer5 = s30Var2.h;
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
                                                    q30 q30Var = s30Var2.e;
                                                    GLES20.glFramebufferTexture2D(36160, 36064, i18, iArr[i26 == 0 ? i27 : 1], i11);
                                                    GLES20.glViewport(i11, i11, 48, 48);
                                                    int i28 = q30Var.a;
                                                    int i29 = q30Var.e;
                                                    int i30 = q30Var.d;
                                                    GLES20.glUseProgram(i28);
                                                    GLES20.glVertexAttribPointer(q30Var.d, 3, 5126, false, 12, floatBuffer4.position(i11));
                                                    GLES20.glEnableVertexAttribArray(i30);
                                                    GLES20.glVertexAttribPointer(q30Var.e, 2, 5126, false, 8, floatBuffer5.position(i11));
                                                    GLES20.glEnableVertexAttribArray(i29);
                                                    GLES20.glActiveTexture(i7);
                                                    GLES20.glBindTexture(i18, iArr[i26 == 0 ? (char) 1 : (char) 2]);
                                                    i11 = 0;
                                                    GLES20.glUniform1i(q30Var.f, 0);
                                                    GLES20.glUniform2f(q30Var.g, i26 == 0 ? 0.020833334f : 0.0f, i26 == 1 ? 0.020833334f : 0.0f);
                                                    GLES20.glDrawArrays(5, 0, 4);
                                                    GLES20.glBindTexture(3553, 0);
                                                    GLES20.glDisableVertexAttribArray(i29);
                                                    GLES20.glDisableVertexAttribArray(i30);
                                                    GLES20.glUseProgram(0);
                                                    i26++;
                                                    i18 = 3553;
                                                }
                                                r30 r30Var = s30Var2.f;
                                                GLES20.glBindFramebuffer(36160, i11);
                                                GLES20.glFramebufferTexture2D(36160, 36064, i18, iArr[1], i11);
                                                GLES20.glViewport(i11, i11, s30Var2.a, s30Var2.b);
                                                GLES20.glUseProgram(r30Var.a);
                                                GLES20.glVertexAttribPointer(r30Var.d, 3, 5126, false, 12, floatBuffer4.position(i11));
                                                GLES20.glEnableVertexAttribArray(r30Var.d);
                                                GLES20.glVertexAttribPointer(r30Var.e, 2, 5126, false, 8, floatBuffer5.position(i11));
                                                GLES20.glEnableVertexAttribArray(r30Var.e);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, iArr[1]);
                                                GLES20.glActiveTexture(i7);
                                                GLES20.glBindTexture(3553, iArr[0]);
                                                GLES20.glUniform1i(r30Var.f, 0);
                                                GLES20.glUniform1i(r30Var.g, 1);
                                                GLES20.glUniform2f(r30Var.h, s30Var2.a / f11, s30Var2.b / f11);
                                                GLES20.glDrawArrays(5, 0, 4);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glActiveTexture(i7);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glDisableVertexAttribArray(r30Var.e);
                                                GLES20.glDisableVertexAttribArray(r30Var.d);
                                                GLES20.glUseProgram(0);
                                                e4.b bVar2 = s30Var2.d;
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
                                                        GLES20.glBindTexture(3553, iArr[r44]);
                                                        i12 = 4;
                                                    } else {
                                                        int i35 = s30Var2.i;
                                                        s30Var2.i = i35 + 1;
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
                                                if (j40Var.n) {
                                                    GLES20.glEnable(3042);
                                                }
                                            } else {
                                                f12 = f10;
                                            }
                                            EGLExt.eglPresentationTimeANDROID(j40Var.s, j40Var.E, j40Var.S);
                                            EGL14.eglSwapBuffers(j40Var.s, j40Var.E);
                                            if (j40Var.C0 != null && gz.o() == 2 && j40Var.D0 % 33 == 0) {
                                                j40Var.C0.postRunnable(new zj(j40Var, 8));
                                            }
                                            j40Var.D0++;
                                            r40 r40Var8 = j40Var.I0;
                                            if (r40Var8.c0[0] != 0) {
                                                float f13 = r40Var8.d0;
                                                if (f13 < f12 && !r40Var8.u0) {
                                                    float f14 = (j10 / 2.0E8f) + f13;
                                                    r40Var8.d0 = f14;
                                                    if (f14 > f12) {
                                                        GLES20.glDisable(3042);
                                                        j40Var.n = false;
                                                        r40 r40Var9 = j40Var.I0;
                                                        r40Var9.d0 = f12;
                                                        GLES20.glDeleteTextures(1, r40Var9.c0, 0);
                                                        r40 r40Var10 = j40Var.I0;
                                                        r40Var10.c0[0] = 0;
                                                        if (!r40Var10.K) {
                                                            j40Var.I0.K = true;
                                                            g0.h3(new h40(j40Var, 4));
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!r40Var8.K) {
                                                j40Var.I0.K = true;
                                                g0.h3(new h40(j40Var, i17));
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (j40Var.S != 0 && !j40Var.R) {
                                    j3 = j16 - j40Var.T;
                                    boolean z14 = 3;
                                    long currentTimeMillis = (System.currentTimeMillis() - j40Var.P) * 1000000;
                                    if (j3 < 0 || Math.abs(currentTimeMillis - j3) > 100000000) {
                                        j3 = currentTimeMillis;
                                    }
                                    z12 = z14;
                                    z11 = z14;
                                    break;
                                } else {
                                    z11 = 3;
                                }
                                j3 = 0;
                                z12 = z11;
                                j40Var.T = j16;
                                j10 = 0;
                                z13 = z12;
                                j40Var.R = false;
                                j40Var.P = System.currentTimeMillis();
                                if (!j40Var.b0) {
                                }
                                j40Var.S += j3;
                                if (j40Var.d0 == -1) {
                                }
                                j40Var.f0 = j16 - j40Var.e0;
                                j40Var.e0 = j16;
                                r40 r40Var11 = j40Var.I0;
                                floatBuffer = r40Var11.J0;
                                floatBuffer2 = r40Var11.I0;
                                FloatBuffer floatBuffer32 = r40Var11.K0;
                                if (floatBuffer != null) {
                                }
                                a8.b("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                            }
                        } else if (i16 == 3) {
                            a40 a40Var2 = (a40) message.obj;
                            if (!j40Var.E0 && !j40Var.m0) {
                                j40Var.M.add(a40Var2);
                                if (j40Var.i0 == -1) {
                                    if (j40Var.d0 == -1) {
                                        if (r2.a) {
                                            a8.b("InstantCamera video record not yet started");
                                            break;
                                        }
                                    } else {
                                        while (true) {
                                            int i36 = 0;
                                            while (i36 < a40Var2.d) {
                                                if (i36 != 0 || Math.abs(j40Var.d0 - a40Var2.b[i36]) <= 10000000) {
                                                    long j20 = a40Var2.b[i36];
                                                    j11 = j15;
                                                    if (j20 >= j40Var.d0) {
                                                        a40Var2.e = i36;
                                                        j40Var.i0 = j20;
                                                        if (r2.a) {
                                                            i5.c.t(a40Var2.b[i36], i5.c.m(i36, "InstantCamera found first audio frame at ", " timestamp = "));
                                                        }
                                                    } else {
                                                        if (r2.a) {
                                                            i5.c.t(a40Var2.b[i36], i5.c.m(i36, "InstantCamera ignore first audio frame at ", " timestamp = "));
                                                        }
                                                        i36++;
                                                        j15 = j11;
                                                    }
                                                } else {
                                                    long j21 = j40Var.d0;
                                                    long j22 = a40Var2.b[i36];
                                                    j40Var.c0 = j21 - j22;
                                                    j40Var.i0 = j22;
                                                    if (r2.a) {
                                                        i5.c.t(j40Var.c0, new StringBuilder("InstantCamera detected desync between audio and video "));
                                                    }
                                                }
                                            }
                                            long j23 = j15;
                                            if (r2.a) {
                                                i5.c.r(a40Var2.d, new StringBuilder("InstantCamera first audio frame not found, removing buffers "));
                                            }
                                            j40Var.M.remove(a40Var2);
                                            if (j40Var.M.isEmpty()) {
                                                break;
                                            } else {
                                                a40Var2 = (a40) j40Var.M.get(0);
                                                j15 = j23;
                                            }
                                        }
                                        if (j40Var.Q == j11) {
                                            j40Var.Q = a40Var2.b[a40Var2.e];
                                        }
                                        if (j40Var.M.size() > 1) {
                                            a40Var2 = (a40) j40Var.M.get(0);
                                        }
                                        a40Var = a40Var2;
                                        j40Var.d(false);
                                        boolean z15 = false;
                                        while (a40Var != null) {
                                            try {
                                                int dequeueInputBuffer = j40Var.G.dequeueInputBuffer(j14);
                                                if (dequeueInputBuffer >= 0) {
                                                    ByteBuffer inputBuffer = j40Var.G.getInputBuffer(dequeueInputBuffer);
                                                    long[] jArr = a40Var.b;
                                                    int i37 = a40Var.e;
                                                    long j24 = jArr[i37];
                                                    while (true) {
                                                        int i38 = a40Var.d;
                                                        if (i37 <= i38) {
                                                            if (i37 < i38) {
                                                                j12 = j14;
                                                                j13 = a40Var.b[i37] - j40Var.Q;
                                                                if (j40Var.X || (a40Var.b[i37] < j40Var.e0 - j40Var.c0 && j13 < 60000000)) {
                                                                    if (inputBuffer.remaining() < a40Var.c[i37]) {
                                                                        a40Var.e = i37;
                                                                    } else {
                                                                        inputBuffer.put(a40Var.a[i37]);
                                                                    }
                                                                }
                                                            } else {
                                                                j12 = j14;
                                                            }
                                                            if (i37 >= a40Var.d - 1) {
                                                                j40Var.M.remove(a40Var);
                                                                if (j40Var.X) {
                                                                    j40Var.A0.put(a40Var);
                                                                }
                                                                if (j40Var.M.isEmpty()) {
                                                                    z15 = a40Var.f;
                                                                } else {
                                                                    a40Var = (a40) j40Var.M.get(0);
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
                                                            a8.b("InstantCamera stop audio encoding because of stoped video recording at " + a40Var.b[i37] + " last video " + j40Var.e0);
                                                        }
                                                    }
                                                    j40Var.m0 = true;
                                                    j40Var.M.clear();
                                                    z15 = true;
                                                    a40Var = null;
                                                    long j25 = j24 == j12 ? j12 : j24 - j40Var.Q;
                                                    long j26 = j40Var.l0;
                                                    if (j26 >= j12) {
                                                        j25 += j26;
                                                    }
                                                    j40Var.k0 = j25 - j40Var.j0;
                                                    j40Var.j0 = j25;
                                                    j40Var.G.queueInputBuffer(dequeueInputBuffer, 0, inputBuffer.position(), j25, z15 ? 4 : 0);
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
                                if (j40Var.Q == j11) {
                                }
                                if (j40Var.M.size() > 1) {
                                }
                                a40Var = a40Var2;
                                j40Var.d(false);
                                boolean z152 = false;
                                while (a40Var != null) {
                                }
                            }
                        } else if (i16 == 4) {
                            if (r2.a) {
                                a8.d("InstantCamera pause encoder");
                            }
                            j40Var.E0 = true;
                            File file = j40Var.I0.g0;
                            if (file != null) {
                                file.delete();
                                j40Var.I0.g0 = null;
                            }
                            r40 r40Var12 = j40Var.I0;
                            r40Var12.g0 = d7.x(r40Var12.e, true);
                            try {
                                a8.b("InstantCamera handlePauseRecording drain encoders");
                                j40Var.d(false);
                            } catch (Exception e12) {
                                a8.g(e12, true);
                            }
                            MP4Builder mP4Builder = j40Var.L;
                            if (mP4Builder != null) {
                                try {
                                    mP4Builder.finishMovie(j40Var.I0.g0);
                                } catch (Exception e13) {
                                    a8.g(e13, true);
                                }
                            }
                            g0.h3(new h40(j40Var, i14));
                            break;
                        } else if (i16 == 5) {
                            if (r2.a) {
                                a8.d("InstantCamera resume encoder");
                            }
                            j40Var.E0 = false;
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
                                if (r0Var.E == m0Var) {
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
                                    if (r0Var.E == m0Var) {
                                        r0Var.g(g10);
                                    }
                                    if (r0Var.E == m0Var) {
                                        r0Var.F = true;
                                        int size = arrayList.size();
                                        while (i13 < size) {
                                            ((n0) arrayList.get(i13)).a(r0Var.E);
                                            i13++;
                                        }
                                        s4.n nVar = (s4.n) r0Var.h;
                                        if (nVar != null) {
                                            m0 m0Var2 = r0Var.E;
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
                                    if (r0Var.E == m0Var) {
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
                                    if (r0Var.E == m0Var) {
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
                            if (r0Var.E == m0Var) {
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
                                org.telegram.ui.ActionBar.z zVar = r0Var.G;
                                if (zVar != null && (n0Var instanceof s4.q)) {
                                    s4.q qVar = (s4.q) n0Var;
                                    s4.e eVar = (s4.e) ((qe.h) zVar.b).c;
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
                    int i44 = r0.H;
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
