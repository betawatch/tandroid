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
import fi.w7;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import m.g3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.camera.Size;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.l50;
import org.telegram.ui.Components.m50;
import org.telegram.ui.Components.n50;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.voip.j1;
import org.telegram.ui.Components.w50;
import p4.m0;
import p4.n0;
import p4.o0;
import p4.p0;
import p4.r0;
import p4.s0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class c extends Handler {
    public final /* synthetic */ int a;
    public WeakReference b;

    public /* synthetic */ c(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:440:0x04f2, code lost:
    
        if (r10 < 0) goto L292;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0524  */
    /* JADX WARN: Type inference failed for: r2v101, types: [p4.n0] */
    /* JADX WARN: Type inference failed for: r43v1 */
    /* JADX WARN: Type inference failed for: r43v2 */
    /* JADX WARN: Type inference failed for: r43v3 */
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
        ?? r43;
        int i10;
        int i11;
        float f7;
        float f10;
        int i12;
        float f11;
        int i13;
        long j12;
        long j13;
        long j14;
        p4.o oVar;
        n0 n0Var = null;
        p0 p0Var = null;
        int i14 = 0;
        int i15 = 1;
        switch (this.a) {
            case 0:
                int i16 = message.what;
                if (i16 == -3 || i16 == -2 || i16 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.b.get(), message.what);
                    break;
                } else if (i16 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            case 1:
                int i17 = message.what;
                h60 h60Var = (h60) this.b.get();
                if (h60Var != null) {
                    if (i17 == 0) {
                        try {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera start encoder");
                            }
                            h60.a(h60Var, message.arg1 == 1);
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                            h60.b(h60Var, 0, null);
                            Looper.myLooper().quit();
                            return;
                        }
                    } else if (i17 == 1) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("InstantCamera stop encoder");
                        }
                        h60.b(h60Var, message.arg1, (c60) message.obj);
                        break;
                    } else {
                        int i18 = 5;
                        long j15 = 0;
                        long j16 = -1;
                        if (i17 == 2) {
                            long j17 = (message.arg1 << 32) | (message.arg2 & 4294967295L);
                            Integer num = (Integer) message.obj;
                            if (!h60Var.D0 && h60Var.H0.W) {
                                try {
                                    h60Var.d(false);
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                                if (h60Var.w0.equals(num)) {
                                    z10 = false;
                                } else {
                                    h60Var.w0 = num;
                                    z10 = true;
                                }
                                long j18 = h60Var.g0;
                                if (j18 >= 0) {
                                    if (h60Var.f0 == -1) {
                                        h60Var.f0 = j17 - j18;
                                    }
                                    j17 -= h60Var.f0;
                                }
                                if (!z10) {
                                    long j19 = h60Var.S;
                                    if (j19 != -1) {
                                        j10 = j17 - j19;
                                        h60Var.S = j17;
                                        j11 = j10;
                                        z13 = 3;
                                        h60Var.Q = false;
                                        h60Var.O = System.currentTimeMillis();
                                        if (!h60Var.a0) {
                                            long j20 = h60Var.Z + j10;
                                            h60Var.Z = j20;
                                            if (j20 >= 200000000) {
                                                h60Var.a0 = true;
                                            }
                                        }
                                        h60Var.R += j10;
                                        if (h60Var.c0 == -1) {
                                            h60Var.c0 = j17 / 1000;
                                            if (BuildVars.LOGS_ENABLED) {
                                                org.telegram.messenger.t.s(new StringBuilder("InstantCamera first video frame was at "), h60Var.c0);
                                            }
                                        }
                                        h60Var.e0 = j17 - h60Var.d0;
                                        h60Var.d0 = j17;
                                        o60 o60Var = h60Var.H0;
                                        floatBuffer = o60Var.J0;
                                        floatBuffer2 = o60Var.I0;
                                        FloatBuffer floatBuffer3 = o60Var.K0;
                                        if (floatBuffer != null || floatBuffer2 == null) {
                                            FileLog.d("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                                            break;
                                        } else {
                                            n50 n50Var = h60Var.x0;
                                            int i19 = 3553;
                                            if (n50Var != null) {
                                                r43 = z13;
                                                GLES20.glBindFramebuffer(36160, n50Var.j[0]);
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, n50Var.k[0], 0);
                                                GLES20.glViewport(0, 0, n50Var.a, n50Var.b);
                                            } else {
                                                r43 = z13;
                                            }
                                            GLES20.glUseProgram(h60Var.m0);
                                            GLES20.glActiveTexture(33984);
                                            GLES20.glVertexAttribPointer(h60Var.p0, 3, 5126, false, 12, (Buffer) floatBuffer2);
                                            GLES20.glEnableVertexAttribArray(h60Var.p0);
                                            GLES20.glVertexAttribPointer(h60Var.q0, 2, 5126, false, 8, (Buffer) floatBuffer);
                                            GLES20.glEnableVertexAttribArray(h60Var.q0);
                                            GLES20.glUniformMatrix4fv(h60Var.n0, 1, false, h60Var.H0.F0, 0);
                                            GLES20.glUniform2f(h60Var.r0, h60Var.d, h60Var.e);
                                            o60 o60Var2 = h60Var.H0;
                                            if (o60Var2.c0[0] == 0 || floatBuffer3 == null || o60Var2.u0) {
                                                i10 = 33984;
                                                i11 = 36197;
                                                f7 = 1.0f;
                                            } else {
                                                if (!h60Var.n) {
                                                    GLES20.glEnable(3042);
                                                    h60Var.n = true;
                                                }
                                                if (h60Var.H0.N0 != null) {
                                                    i10 = 33984;
                                                    GLES20.glUniform2f(h60Var.s0, r4.getWidth(), h60Var.H0.N0.getHeight());
                                                } else {
                                                    i10 = 33984;
                                                }
                                                i11 = 36197;
                                                f7 = 1.0f;
                                                GLES20.glVertexAttribPointer(h60Var.q0, 2, 5126, false, 8, (Buffer) floatBuffer3);
                                                GLES20.glUniformMatrix4fv(h60Var.o0, 1, false, h60Var.H0.H0, 0);
                                                GLES20.glUniform1f(h60Var.u0, 1.0f);
                                                GLES20.glBindTexture(36197, h60Var.H0.c0[0]);
                                                GLES20.glDrawArrays(5, 0, 4);
                                            }
                                            o60 o60Var3 = h60Var.H0;
                                            Size[] sizeArr = o60Var3.n0;
                                            if (sizeArr != null) {
                                                int i20 = h60Var.s0;
                                                float width = sizeArr[o60Var3.k1].getWidth();
                                                o60 o60Var4 = h60Var.H0;
                                                f10 = 2.0f;
                                                GLES20.glUniform2f(i20, width, o60Var4.n0[o60Var4.k1].getHeight());
                                                int i21 = h60Var.t0;
                                                o60 o60Var5 = h60Var.H0;
                                                float width2 = (f7 / o60Var5.n0[o60Var5.k1].getWidth()) / 2.0f;
                                                o60 o60Var6 = h60Var.H0;
                                                GLES20.glUniform2f(i21, width2, (f7 / o60Var6.n0[o60Var6.k1].getHeight()) / 2.0f);
                                            } else {
                                                f10 = 2.0f;
                                            }
                                            o60 o60Var7 = h60Var.H0;
                                            int i22 = o60Var7.b0[o60Var7.k1];
                                            if (i22 != Integer.MIN_VALUE) {
                                                i12 = 0;
                                                GLES20.glUniformMatrix4fv(h60Var.o0, 1, false, h60Var.H0.G0, 0);
                                                GLES20.glUniform1f(h60Var.u0, h60Var.H0.d0);
                                                GLES20.glBindTexture(i11, i22);
                                                GLES20.glDrawArrays(5, 0, 4);
                                            } else {
                                                i12 = 0;
                                            }
                                            GLES20.glDisableVertexAttribArray(h60Var.p0);
                                            GLES20.glDisableVertexAttribArray(h60Var.q0);
                                            GLES20.glBindTexture(i11, i12);
                                            GLES20.glUseProgram(i12);
                                            n50 n50Var2 = h60Var.x0;
                                            if (n50Var2 != null) {
                                                GLES20.glDisable(3042);
                                                m50 m50Var = n50Var2.c;
                                                int[] iArr = n50Var2.k;
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], i12);
                                                GLES20.glViewport(i12, i12, 48, 48);
                                                f11 = f7;
                                                GLES20.glUseProgram(m50Var.a);
                                                int i23 = m50Var.d;
                                                FloatBuffer floatBuffer4 = n50Var2.g;
                                                GLES20.glVertexAttribPointer(i23, 3, 5126, false, 12, floatBuffer4.position(i12));
                                                int i24 = m50Var.d;
                                                GLES20.glEnableVertexAttribArray(i24);
                                                int i25 = m50Var.e;
                                                FloatBuffer floatBuffer5 = n50Var2.h;
                                                GLES20.glVertexAttribPointer(i25, 2, 5126, false, 8, floatBuffer5.position(i12));
                                                int i26 = m50Var.e;
                                                GLES20.glEnableVertexAttribArray(i26);
                                                GLES20.glActiveTexture(i10);
                                                GLES20.glBindTexture(3553, iArr[i12]);
                                                GLES20.glUniform1i(m50Var.f, i12);
                                                GLES20.glDrawArrays(5, i12, 4);
                                                GLES20.glBindTexture(3553, i12);
                                                GLES20.glDisableVertexAttribArray(i26);
                                                GLES20.glDisableVertexAttribArray(i24);
                                                GLES20.glUseProgram(i12);
                                                int i27 = i12;
                                                for (int i28 = 2; i27 < i28; i28 = 2) {
                                                    k50 k50Var = n50Var2.e;
                                                    GLES20.glFramebufferTexture2D(36160, 36064, i19, iArr[i27 == 0 ? i28 : 1], i12);
                                                    GLES20.glViewport(i12, i12, 48, 48);
                                                    int i29 = k50Var.a;
                                                    int i30 = k50Var.e;
                                                    int i31 = k50Var.d;
                                                    GLES20.glUseProgram(i29);
                                                    GLES20.glVertexAttribPointer(k50Var.d, 3, 5126, false, 12, floatBuffer4.position(i12));
                                                    GLES20.glEnableVertexAttribArray(i31);
                                                    GLES20.glVertexAttribPointer(k50Var.e, 2, 5126, false, 8, floatBuffer5.position(i12));
                                                    GLES20.glEnableVertexAttribArray(i30);
                                                    GLES20.glActiveTexture(i10);
                                                    GLES20.glBindTexture(i19, iArr[i27 == 0 ? (char) 1 : (char) 2]);
                                                    i12 = 0;
                                                    GLES20.glUniform1i(k50Var.f, 0);
                                                    GLES20.glUniform2f(k50Var.g, i27 == 0 ? 0.020833334f : 0.0f, i27 == 1 ? 0.020833334f : 0.0f);
                                                    GLES20.glDrawArrays(5, 0, 4);
                                                    GLES20.glBindTexture(3553, 0);
                                                    GLES20.glDisableVertexAttribArray(i30);
                                                    GLES20.glDisableVertexAttribArray(i31);
                                                    GLES20.glUseProgram(0);
                                                    i27++;
                                                    i19 = 3553;
                                                }
                                                l50 l50Var = n50Var2.f;
                                                GLES20.glBindFramebuffer(36160, i12);
                                                GLES20.glFramebufferTexture2D(36160, 36064, i19, iArr[1], i12);
                                                GLES20.glViewport(i12, i12, n50Var2.a, n50Var2.b);
                                                GLES20.glUseProgram(l50Var.a);
                                                GLES20.glVertexAttribPointer(l50Var.d, 3, 5126, false, 12, floatBuffer4.position(i12));
                                                GLES20.glEnableVertexAttribArray(l50Var.d);
                                                GLES20.glVertexAttribPointer(l50Var.e, 2, 5126, false, 8, floatBuffer5.position(i12));
                                                GLES20.glEnableVertexAttribArray(l50Var.e);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, iArr[1]);
                                                GLES20.glActiveTexture(i10);
                                                GLES20.glBindTexture(3553, iArr[0]);
                                                GLES20.glUniform1i(l50Var.f, 0);
                                                GLES20.glUniform1i(l50Var.g, 1);
                                                GLES20.glUniform2f(l50Var.h, n50Var2.a / f10, n50Var2.b / f10);
                                                GLES20.glDrawArrays(5, 0, 4);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glActiveTexture(i10);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glDisableVertexAttribArray(l50Var.e);
                                                GLES20.glDisableVertexAttribArray(l50Var.d);
                                                GLES20.glUseProgram(0);
                                                m50 m50Var2 = n50Var2.d;
                                                GLES20.glEnable(3042);
                                                int i32 = m50Var2.a;
                                                int i33 = m50Var2.e;
                                                int i34 = m50Var2.d;
                                                GLES20.glUseProgram(i32);
                                                GLES20.glActiveTexture(i10);
                                                for (int i35 = 0; i35 < 2; i35++) {
                                                    if (i35 == 0) {
                                                        GLES20.glVertexAttribPointer(m50Var2.d, 3, 5126, false, 12, floatBuffer4.position(12));
                                                        GLES20.glEnableVertexAttribArray(i34);
                                                        GLES20.glVertexAttribPointer(m50Var2.e, 2, 5126, false, 8, floatBuffer5.position(8));
                                                        GLES20.glEnableVertexAttribArray(i33);
                                                        GLES20.glBindTexture(3553, iArr[r43]);
                                                        i13 = 4;
                                                    } else {
                                                        int i36 = n50Var2.i;
                                                        n50Var2.i = i36 + 1;
                                                        GLES20.glVertexAttribPointer(m50Var2.d, 3, 5126, false, 12, floatBuffer4.position(24));
                                                        GLES20.glEnableVertexAttribArray(i34);
                                                        GLES20.glVertexAttribPointer(m50Var2.e, 2, 5126, false, 8, floatBuffer5.position(((i36 % 27) * 8) + 16));
                                                        GLES20.glEnableVertexAttribArray(i33);
                                                        i13 = 4;
                                                        GLES20.glBindTexture(3553, iArr[4]);
                                                    }
                                                    GLES20.glUniform1i(m50Var2.f, 0);
                                                    GLES20.glDrawArrays(5, 0, i13);
                                                    GLES20.glBindTexture(3553, 0);
                                                    GLES20.glDisableVertexAttribArray(i33);
                                                    GLES20.glDisableVertexAttribArray(i34);
                                                }
                                                GLES20.glUseProgram(0);
                                                GLES20.glDisable(3042);
                                                if (h60Var.n) {
                                                    GLES20.glEnable(3042);
                                                }
                                            } else {
                                                f11 = f7;
                                            }
                                            EGLExt.eglPresentationTimeANDROID(h60Var.s, h60Var.y, h60Var.R);
                                            EGL14.eglSwapBuffers(h60Var.s, h60Var.y);
                                            if (h60Var.B0 != null && SharedConfig.getDevicePerformanceClass() == 2 && h60Var.C0 % 33 == 0) {
                                                h60Var.B0.postRunnable(new g3(h60Var, 19));
                                            }
                                            h60Var.C0++;
                                            o60 o60Var8 = h60Var.H0;
                                            if (o60Var8.c0[0] != 0) {
                                                float f12 = o60Var8.d0;
                                                if (f12 < f11 && !o60Var8.u0) {
                                                    float f13 = (j11 / 2.0E8f) + f12;
                                                    o60Var8.d0 = f13;
                                                    if (f13 > f11) {
                                                        GLES20.glDisable(3042);
                                                        h60Var.n = false;
                                                        o60 o60Var9 = h60Var.H0;
                                                        o60Var9.d0 = f11;
                                                        GLES20.glDeleteTextures(1, o60Var9.c0, 0);
                                                        o60 o60Var10 = h60Var.H0;
                                                        o60Var10.c0[0] = 0;
                                                        if (!o60Var10.K) {
                                                            h60Var.H0.K = true;
                                                            AndroidUtilities.runOnUIThread(new e60(h60Var, 4));
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!o60Var8.K) {
                                                h60Var.H0.K = true;
                                                AndroidUtilities.runOnUIThread(new e60(h60Var, i18));
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (h60Var.R != 0 && !h60Var.Q) {
                                    j10 = j17 - h60Var.S;
                                    boolean z14 = 3;
                                    long currentTimeMillis = (System.currentTimeMillis() - h60Var.O) * 1000000;
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
                                h60Var.S = j17;
                                j11 = 0;
                                z13 = z12;
                                h60Var.Q = false;
                                h60Var.O = System.currentTimeMillis();
                                if (!h60Var.a0) {
                                }
                                h60Var.R += j10;
                                if (h60Var.c0 == -1) {
                                }
                                h60Var.e0 = j17 - h60Var.d0;
                                h60Var.d0 = j17;
                                o60 o60Var11 = h60Var.H0;
                                floatBuffer = o60Var11.J0;
                                floatBuffer2 = o60Var11.I0;
                                FloatBuffer floatBuffer32 = o60Var11.K0;
                                if (floatBuffer != null) {
                                }
                                FileLog.d("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                            }
                        } else if (i17 == 3) {
                            w50 w50Var = (w50) message.obj;
                            if (!h60Var.D0 && !h60Var.l0) {
                                h60Var.L.add(w50Var);
                                if (h60Var.h0 == -1) {
                                    if (h60Var.c0 == -1) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("InstantCamera video record not yet started");
                                            break;
                                        }
                                    } else {
                                        while (true) {
                                            int i37 = 0;
                                            while (i37 < w50Var.d) {
                                                if (i37 != 0 || Math.abs(h60Var.c0 - w50Var.b[i37]) <= 10000000) {
                                                    long j21 = w50Var.b[i37];
                                                    j12 = j16;
                                                    if (j21 >= h60Var.c0) {
                                                        w50Var.e = i37;
                                                        h60Var.h0 = j21;
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            org.telegram.messenger.t.s(ic.a.k(i37, "InstantCamera found first audio frame at ", " timestamp = "), w50Var.b[i37]);
                                                        }
                                                    } else {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            org.telegram.messenger.t.s(ic.a.k(i37, "InstantCamera ignore first audio frame at ", " timestamp = "), w50Var.b[i37]);
                                                        }
                                                        i37++;
                                                        j16 = j12;
                                                    }
                                                } else {
                                                    long j22 = h60Var.c0;
                                                    long j23 = w50Var.b[i37];
                                                    h60Var.b0 = j22 - j23;
                                                    h60Var.h0 = j23;
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        org.telegram.messenger.t.s(new StringBuilder("InstantCamera detected desync between audio and video "), h60Var.b0);
                                                    }
                                                }
                                            }
                                            long j24 = j16;
                                            if (BuildVars.LOGS_ENABLED) {
                                                org.telegram.messenger.t.o(w50Var.d, new StringBuilder("InstantCamera first audio frame not found, removing buffers "));
                                            }
                                            h60Var.L.remove(w50Var);
                                            if (h60Var.L.isEmpty()) {
                                                break;
                                            } else {
                                                w50Var = (w50) h60Var.L.get(0);
                                                j16 = j24;
                                            }
                                        }
                                    }
                                }
                                j12 = j16;
                                if (h60Var.P == j12) {
                                    h60Var.P = w50Var.b[w50Var.e];
                                }
                                if (h60Var.L.size() > 1) {
                                    w50Var = (w50) h60Var.L.get(0);
                                }
                                w50 w50Var2 = w50Var;
                                try {
                                    h60Var.d(false);
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                }
                                boolean z15 = false;
                                while (w50Var2 != null) {
                                    try {
                                        int dequeueInputBuffer = h60Var.F.dequeueInputBuffer(j15);
                                        if (dequeueInputBuffer >= 0) {
                                            ByteBuffer inputBuffer = h60Var.F.getInputBuffer(dequeueInputBuffer);
                                            long[] jArr = w50Var2.b;
                                            int i38 = w50Var2.e;
                                            long j25 = jArr[i38];
                                            while (true) {
                                                int i39 = w50Var2.d;
                                                if (i38 <= i39) {
                                                    if (i38 < i39) {
                                                        j13 = j15;
                                                        j14 = w50Var2.b[i38] - h60Var.P;
                                                        if (h60Var.W || (w50Var2.b[i38] < h60Var.d0 - h60Var.b0 && j14 < 60000000)) {
                                                            if (inputBuffer.remaining() < w50Var2.c[i38]) {
                                                                w50Var2.e = i38;
                                                            } else {
                                                                inputBuffer.put(w50Var2.a[i38]);
                                                            }
                                                        }
                                                    } else {
                                                        j13 = j15;
                                                    }
                                                    if (i38 >= w50Var2.d - 1) {
                                                        h60Var.L.remove(w50Var2);
                                                        if (h60Var.W) {
                                                            h60Var.z0.put(w50Var2);
                                                        }
                                                        if (h60Var.L.isEmpty()) {
                                                            z15 = w50Var2.f;
                                                        } else {
                                                            w50Var2 = (w50) h60Var.L.get(0);
                                                        }
                                                    }
                                                    i38++;
                                                    j15 = j13;
                                                } else {
                                                    j13 = j15;
                                                }
                                            }
                                            if (BuildVars.LOGS_ENABLED) {
                                                if (j14 >= 60000000) {
                                                    FileLog.d("InstantCamera stop audio encoding because recorded time more than 60s");
                                                } else {
                                                    FileLog.d("InstantCamera stop audio encoding because of stoped video recording at " + w50Var2.b[i38] + " last video " + h60Var.d0);
                                                }
                                            }
                                            h60Var.l0 = true;
                                            h60Var.L.clear();
                                            z15 = true;
                                            w50Var2 = null;
                                            long j26 = j25 == j13 ? j13 : j25 - h60Var.P;
                                            long j27 = h60Var.k0;
                                            if (j27 >= j13) {
                                                j26 += j27;
                                            }
                                            h60Var.j0 = j26 - h60Var.i0;
                                            h60Var.i0 = j26;
                                            h60Var.F.queueInputBuffer(dequeueInputBuffer, 0, inputBuffer.position(), j26, z15 ? 4 : 0);
                                        } else {
                                            j13 = j15;
                                        }
                                        j15 = j13;
                                    } catch (Throwable th2) {
                                        FileLog.e(th2);
                                        return;
                                    }
                                }
                                break;
                            }
                        } else if (i17 == 4) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera pause encoder");
                            }
                            h60Var.D0 = true;
                            File file = h60Var.H0.g0;
                            if (file != null) {
                                file.delete();
                                h60Var.H0.g0 = null;
                            }
                            o60 o60Var12 = h60Var.H0;
                            o60Var12.g0 = w7.x(o60Var12.f, true);
                            try {
                                FileLog.d("InstantCamera handlePauseRecording drain encoders");
                                h60Var.d(false);
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                            MP4Builder mP4Builder = h60Var.K;
                            if (mP4Builder != null) {
                                try {
                                    mP4Builder.finishMovie(h60Var.H0.g0);
                                } catch (Exception e13) {
                                    FileLog.e(e13);
                                }
                            }
                            AndroidUtilities.runOnUIThread(new e60(h60Var, i15));
                            break;
                        } else if (i17 == 5) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera resume encoder");
                            }
                            h60Var.D0 = false;
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
                    ArrayList arrayList = r0Var.v;
                    int i40 = message.what;
                    int i41 = message.arg1;
                    int i42 = message.arg2;
                    Object obj = message.obj;
                    Bundle peekData = message.peekData();
                    switch (i40) {
                        case 0:
                            if (i41 == m0Var.g) {
                                m0Var.g = 0;
                                if (r0Var.y == m0Var) {
                                    r0Var.q();
                                }
                            }
                            if (((o0) sparseArray.get(i41)) != null) {
                                sparseArray.remove(i41);
                                o0.a(null, null);
                                break;
                            }
                            break;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (m0Var.f == 0 && i41 == m0Var.g && i42 >= 1) {
                                    m0Var.g = 0;
                                    m0Var.f = i42;
                                    b2.u g7 = b2.u.g(bundle);
                                    if (r0Var.y == m0Var) {
                                        r0Var.g(g7);
                                    }
                                    if (r0Var.y == m0Var) {
                                        r0Var.E = true;
                                        int size = arrayList.size();
                                        while (i14 < size) {
                                            ((n0) arrayList.get(i14)).a(r0Var.y);
                                            i14++;
                                        }
                                        p4.n nVar = (p4.n) r0Var.h;
                                        if (nVar != null) {
                                            m0 m0Var2 = r0Var.y;
                                            int i43 = m0Var2.d;
                                            m0Var2.d = i43 + 1;
                                            m0Var2.b(10, i43, 0, nVar.a, null);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                o0 o0Var = (o0) sparseArray.get(i41);
                                if (o0Var != null) {
                                    sparseArray.remove(i41);
                                    o0Var.b(bundle2);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                String string = peekData != null ? peekData.getString("error") : null;
                                Bundle bundle3 = (Bundle) obj;
                                if (((o0) sparseArray.get(i41)) != null) {
                                    sparseArray.remove(i41);
                                    o0.a(string, bundle3);
                                    break;
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (m0Var.f != 0) {
                                    b2.u g10 = b2.u.g(bundle4);
                                    if (r0Var.y == m0Var) {
                                        r0Var.g(g10);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 6:
                            if (obj instanceof Bundle) {
                                Bundle bundle5 = (Bundle) obj;
                                o0 o0Var2 = (o0) sparseArray.get(i41);
                                if (bundle5.containsKey("routeId")) {
                                    sparseArray.remove(i41);
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
                                    p4.m mVar = bundle7 != null ? new p4.m(bundle7) : null;
                                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                    ArrayList arrayList2 = new ArrayList();
                                    int size2 = parcelableArrayList.size();
                                    int i44 = 0;
                                    while (i44 < size2) {
                                        Object obj2 = parcelableArrayList.get(i44);
                                        i44++;
                                        Bundle bundle8 = (Bundle) obj2;
                                        if (bundle8 == null) {
                                            oVar = null;
                                        } else {
                                            Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                            oVar = new p4.o(bundle9 != null ? new p4.m(bundle9) : null, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                        }
                                        arrayList2.add(oVar);
                                    }
                                    if (r0Var.y == m0Var) {
                                        int size3 = arrayList.size();
                                        while (true) {
                                            if (i14 < size3) {
                                                Object obj3 = arrayList.get(i14);
                                                i14++;
                                                ?? r22 = (n0) obj3;
                                                if (r22.b() == i42) {
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
                            if (r0Var.y == m0Var) {
                                int size4 = arrayList.size();
                                while (true) {
                                    if (i14 < size4) {
                                        Object obj4 = arrayList.get(i14);
                                        i14++;
                                        n0 n0Var2 = (n0) obj4;
                                        if (n0Var2.b() == i42) {
                                            n0Var = n0Var2;
                                        }
                                    }
                                }
                                j1 j1Var = r0Var.F;
                                if (j1Var != null && (n0Var instanceof p4.q)) {
                                    p4.q qVar = (p4.q) n0Var;
                                    p4.e eVar = (p4.e) ((s0) j1Var.b).c;
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
                    int i45 = r0.G;
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
