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
import bi.r9;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.camera.Size;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.i50;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.l50;
import org.telegram.ui.Components.u50;
import p4.m0;
import p4.n0;
import p4.o0;
import p4.p0;
import p4.r0;
import p4.s0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class d extends Handler {
    public final /* synthetic */ int a;
    public WeakReference b;

    public /* synthetic */ d(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:234:0x03e9, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x03a0, code lost:
    
        if (org.telegram.messenger.BuildVars.LOGS_ENABLED == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x03a4, code lost:
    
        if (r17 < 60000000) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x03a6, code lost:
    
        org.telegram.messenger.FileLog.d("InstantCamera stop audio encoding because recorded time more than 60s");
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x03af, code lost:
    
        org.telegram.messenger.FileLog.d("InstantCamera stop audio encoding because of stoped video recording at " + r2.b[r12] + " last video " + r7.d0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x03d1, code lost:
    
        r7.l0 = true;
        r7.L.clear();
        r2 = null;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x04fa, code lost:
    
        if (r8 < 0) goto L291;
     */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x052c  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        boolean z10;
        char c10;
        long j3;
        long j10;
        FloatBuffer floatBuffer;
        FloatBuffer floatBuffer2;
        float f7;
        int i10;
        long j11;
        long j12;
        long j13;
        p4.o oVar;
        n0 n0Var = null;
        n0 n0Var2 = null;
        int i11 = 0;
        int i12 = 2;
        switch (this.a) {
            case 0:
                int i13 = message.what;
                if (i13 == -3 || i13 == -2 || i13 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.b.get(), message.what);
                    break;
                } else if (i13 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            case 1:
                int i14 = message.what;
                e60 e60Var = (e60) this.b.get();
                if (e60Var != null) {
                    if (i14 == 0) {
                        try {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera start encoder");
                            }
                            e60.a(e60Var, message.arg1 == 1);
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                            e60.b(e60Var, 0, null);
                            Looper.myLooper().quit();
                            return;
                        }
                    } else if (i14 == 1) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("InstantCamera stop encoder");
                        }
                        e60.b(e60Var, message.arg1, (a60) message.obj);
                        break;
                    } else {
                        long j14 = 0;
                        long j15 = -1;
                        if (i14 == 2) {
                            long j16 = (message.arg1 << 32) | (message.arg2 & 4294967295L);
                            Integer num = (Integer) message.obj;
                            if (!e60Var.D0 && e60Var.H0.R) {
                                try {
                                    e60Var.e(false);
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                }
                                if (e60Var.w0.equals(num)) {
                                    z10 = false;
                                } else {
                                    e60Var.w0 = num;
                                    z10 = true;
                                }
                                long j17 = e60Var.g0;
                                if (j17 >= 0) {
                                    if (e60Var.f0 == -1) {
                                        e60Var.f0 = j16 - j17;
                                    }
                                    j16 -= e60Var.f0;
                                }
                                if (!z10) {
                                    long j18 = e60Var.S;
                                    if (j18 != -1) {
                                        j3 = j16 - j18;
                                        e60Var.S = j16;
                                        j10 = j3;
                                        c10 = 3;
                                        e60Var.Q = false;
                                        e60Var.O = System.currentTimeMillis();
                                        if (!e60Var.a0) {
                                            long j19 = e60Var.Z + j3;
                                            e60Var.Z = j19;
                                            if (j19 >= 200000000) {
                                                e60Var.a0 = true;
                                            }
                                        }
                                        e60Var.R += j3;
                                        if (e60Var.c0 == -1) {
                                            e60Var.c0 = j16 / 1000;
                                            if (BuildVars.LOGS_ENABLED) {
                                                hc.b.x(new StringBuilder("InstantCamera first video frame was at "), e60Var.c0);
                                            }
                                        }
                                        e60Var.e0 = j16 - e60Var.d0;
                                        e60Var.d0 = j16;
                                        f60 f60Var = e60Var.H0;
                                        floatBuffer = f60Var.z0;
                                        floatBuffer2 = f60Var.y0;
                                        FloatBuffer floatBuffer3 = f60Var.A0;
                                        if (floatBuffer != null || floatBuffer2 == null) {
                                            FileLog.d("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                                            break;
                                        } else {
                                            l50 l50Var = e60Var.x0;
                                            int i15 = 36160;
                                            if (l50Var != null) {
                                                GLES20.glBindFramebuffer(36160, l50Var.j[0]);
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, l50Var.k[0], 0);
                                                GLES20.glViewport(0, 0, l50Var.a, l50Var.b);
                                            }
                                            GLES20.glUseProgram(e60Var.m0);
                                            GLES20.glActiveTexture(33984);
                                            GLES20.glVertexAttribPointer(e60Var.p0, 3, 5126, false, 12, (Buffer) floatBuffer2);
                                            GLES20.glEnableVertexAttribArray(e60Var.p0);
                                            GLES20.glVertexAttribPointer(e60Var.q0, 2, 5126, false, 8, (Buffer) floatBuffer);
                                            GLES20.glEnableVertexAttribArray(e60Var.q0);
                                            GLES20.glUniformMatrix4fv(e60Var.n0, 1, false, e60Var.H0.v0, 0);
                                            GLES20.glUniform2f(e60Var.r0, e60Var.d, e60Var.e);
                                            f60 f60Var2 = e60Var.H0;
                                            if (f60Var2.U[0] != 0 && floatBuffer3 != null && !f60Var2.p0) {
                                                if (!e60Var.n) {
                                                    GLES20.glEnable(3042);
                                                    e60Var.n = true;
                                                }
                                                if (e60Var.H0.D0 != null) {
                                                    GLES20.glUniform2f(e60Var.s0, r2.getWidth(), e60Var.H0.D0.getHeight());
                                                }
                                                GLES20.glVertexAttribPointer(e60Var.q0, 2, 5126, false, 8, (Buffer) floatBuffer3);
                                                GLES20.glUniformMatrix4fv(e60Var.o0, 1, false, e60Var.H0.x0, 0);
                                                GLES20.glUniform1f(e60Var.u0, 1.0f);
                                                GLES20.glBindTexture(36197, e60Var.H0.U[0]);
                                                GLES20.glDrawArrays(5, 0, 4);
                                            }
                                            f60 f60Var3 = e60Var.H0;
                                            Size[] sizeArr = f60Var3.i0;
                                            if (sizeArr != null) {
                                                int i16 = e60Var.s0;
                                                float width = sizeArr[f60Var3.a1].getWidth();
                                                f60 f60Var4 = e60Var.H0;
                                                GLES20.glUniform2f(i16, width, f60Var4.i0[f60Var4.a1].getHeight());
                                                int i17 = e60Var.t0;
                                                f60 f60Var5 = e60Var.H0;
                                                f60 f60Var6 = e60Var.H0;
                                                GLES20.glUniform2f(i17, (1.0f / f60Var5.i0[f60Var5.a1].getWidth()) / 2.0f, (1.0f / f60Var6.i0[f60Var6.a1].getHeight()) / 2.0f);
                                            }
                                            f60 f60Var7 = e60Var.H0;
                                            int i18 = f60Var7.T[f60Var7.a1];
                                            if (i18 != Integer.MIN_VALUE) {
                                                GLES20.glUniformMatrix4fv(e60Var.o0, 1, false, e60Var.H0.w0, 0);
                                                GLES20.glUniform1f(e60Var.u0, e60Var.H0.V);
                                                GLES20.glBindTexture(36197, i18);
                                                GLES20.glDrawArrays(5, 0, 4);
                                            }
                                            GLES20.glDisableVertexAttribArray(e60Var.p0);
                                            GLES20.glDisableVertexAttribArray(e60Var.q0);
                                            GLES20.glBindTexture(36197, 0);
                                            GLES20.glUseProgram(0);
                                            l50 l50Var2 = e60Var.x0;
                                            if (l50Var2 != null) {
                                                GLES20.glDisable(3042);
                                                k50 k50Var = l50Var2.c;
                                                int[] iArr = l50Var2.k;
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], 0);
                                                GLES20.glViewport(0, 0, 48, 48);
                                                GLES20.glUseProgram(k50Var.a);
                                                int i19 = k50Var.d;
                                                f7 = 1.0f;
                                                FloatBuffer floatBuffer4 = l50Var2.g;
                                                GLES20.glVertexAttribPointer(i19, 3, 5126, false, 12, floatBuffer4.position(0));
                                                int i20 = k50Var.d;
                                                GLES20.glEnableVertexAttribArray(i20);
                                                int i21 = k50Var.e;
                                                FloatBuffer floatBuffer5 = l50Var2.h;
                                                GLES20.glVertexAttribPointer(i21, 2, 5126, false, 8, floatBuffer5.position(0));
                                                int i22 = k50Var.e;
                                                GLES20.glEnableVertexAttribArray(i22);
                                                GLES20.glActiveTexture(33984);
                                                GLES20.glBindTexture(3553, iArr[0]);
                                                GLES20.glUniform1i(k50Var.f, 0);
                                                GLES20.glDrawArrays(5, 0, 4);
                                                int i23 = 48;
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glDisableVertexAttribArray(i22);
                                                GLES20.glDisableVertexAttribArray(i20);
                                                GLES20.glUseProgram(0);
                                                int i24 = 0;
                                                while (i24 < 2) {
                                                    i50 i50Var = l50Var2.e;
                                                    GLES20.glFramebufferTexture2D(i15, 36064, 3553, iArr[i24 == 0 ? (char) 2 : (char) 1], 0);
                                                    GLES20.glViewport(0, 0, i23, i23);
                                                    int i25 = i50Var.a;
                                                    int i26 = i50Var.e;
                                                    int i27 = i50Var.d;
                                                    GLES20.glUseProgram(i25);
                                                    GLES20.glVertexAttribPointer(i50Var.d, 3, 5126, false, 12, floatBuffer4.position(0));
                                                    GLES20.glEnableVertexAttribArray(i27);
                                                    GLES20.glVertexAttribPointer(i50Var.e, 2, 5126, false, 8, floatBuffer5.position(0));
                                                    GLES20.glEnableVertexAttribArray(i26);
                                                    GLES20.glActiveTexture(33984);
                                                    GLES20.glBindTexture(3553, iArr[i24 == 0 ? (char) 1 : (char) 2]);
                                                    GLES20.glUniform1i(i50Var.f, 0);
                                                    GLES20.glUniform2f(i50Var.g, i24 == 0 ? 0.020833334f : 0.0f, i24 == 1 ? 0.020833334f : 0.0f);
                                                    GLES20.glDrawArrays(5, 0, 4);
                                                    GLES20.glBindTexture(3553, 0);
                                                    GLES20.glDisableVertexAttribArray(i26);
                                                    GLES20.glDisableVertexAttribArray(i27);
                                                    GLES20.glUseProgram(0);
                                                    i24++;
                                                    i23 = 48;
                                                    i15 = 36160;
                                                }
                                                j50 j50Var = l50Var2.f;
                                                GLES20.glBindFramebuffer(36160, 0);
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], 0);
                                                GLES20.glViewport(0, 0, l50Var2.a, l50Var2.b);
                                                GLES20.glUseProgram(j50Var.a);
                                                GLES20.glVertexAttribPointer(j50Var.d, 3, 5126, false, 12, floatBuffer4.position(0));
                                                GLES20.glEnableVertexAttribArray(j50Var.d);
                                                GLES20.glVertexAttribPointer(j50Var.e, 2, 5126, false, 8, floatBuffer5.position(0));
                                                GLES20.glEnableVertexAttribArray(j50Var.e);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, iArr[1]);
                                                GLES20.glActiveTexture(33984);
                                                GLES20.glBindTexture(3553, iArr[0]);
                                                GLES20.glUniform1i(j50Var.f, 0);
                                                GLES20.glUniform1i(j50Var.g, 1);
                                                GLES20.glUniform2f(j50Var.h, l50Var2.a / 2.0f, l50Var2.b / 2.0f);
                                                GLES20.glDrawArrays(5, 0, 4);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glActiveTexture(33984);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glDisableVertexAttribArray(j50Var.e);
                                                GLES20.glDisableVertexAttribArray(j50Var.d);
                                                GLES20.glUseProgram(0);
                                                k50 k50Var2 = l50Var2.d;
                                                GLES20.glEnable(3042);
                                                int i28 = k50Var2.a;
                                                int i29 = k50Var2.e;
                                                int i30 = k50Var2.d;
                                                GLES20.glUseProgram(i28);
                                                GLES20.glActiveTexture(33984);
                                                for (int i31 = 0; i31 < 2; i31++) {
                                                    if (i31 == 0) {
                                                        GLES20.glVertexAttribPointer(k50Var2.d, 3, 5126, false, 12, floatBuffer4.position(12));
                                                        GLES20.glEnableVertexAttribArray(i30);
                                                        GLES20.glVertexAttribPointer(k50Var2.e, 2, 5126, false, 8, floatBuffer5.position(8));
                                                        GLES20.glEnableVertexAttribArray(i29);
                                                        GLES20.glBindTexture(3553, iArr[c10]);
                                                        i10 = 4;
                                                    } else {
                                                        int i32 = l50Var2.i;
                                                        l50Var2.i = i32 + 1;
                                                        GLES20.glVertexAttribPointer(k50Var2.d, 3, 5126, false, 12, floatBuffer4.position(24));
                                                        GLES20.glEnableVertexAttribArray(i30);
                                                        GLES20.glVertexAttribPointer(k50Var2.e, 2, 5126, false, 8, floatBuffer5.position(((i32 % 27) * 8) + 16));
                                                        GLES20.glEnableVertexAttribArray(i29);
                                                        i10 = 4;
                                                        GLES20.glBindTexture(3553, iArr[4]);
                                                    }
                                                    GLES20.glUniform1i(k50Var2.f, 0);
                                                    GLES20.glDrawArrays(5, 0, i10);
                                                    GLES20.glBindTexture(3553, 0);
                                                    GLES20.glDisableVertexAttribArray(i29);
                                                    GLES20.glDisableVertexAttribArray(i30);
                                                }
                                                GLES20.glUseProgram(0);
                                                GLES20.glDisable(3042);
                                                if (e60Var.n) {
                                                    GLES20.glEnable(3042);
                                                }
                                            } else {
                                                f7 = 1.0f;
                                            }
                                            EGLExt.eglPresentationTimeANDROID(e60Var.s, e60Var.y, e60Var.R);
                                            EGL14.eglSwapBuffers(e60Var.s, e60Var.y);
                                            if (e60Var.B0 != null && SharedConfig.getDevicePerformanceClass() == 2 && e60Var.C0 % 33 == 0) {
                                                e60Var.B0.postRunnable(new l9(e60Var, 12));
                                            }
                                            e60Var.C0++;
                                            f60 f60Var8 = e60Var.H0;
                                            if (f60Var8.U[0] != 0) {
                                                float f10 = f60Var8.V;
                                                if (f10 < f7 && !f60Var8.p0) {
                                                    float f11 = (j10 / 2.0E8f) + f10;
                                                    f60Var8.V = f11;
                                                    if (f11 > f7) {
                                                        GLES20.glDisable(3042);
                                                        e60Var.n = false;
                                                        f60 f60Var9 = e60Var.H0;
                                                        f60Var9.V = 1.0f;
                                                        GLES20.glDeleteTextures(1, f60Var9.U, 0);
                                                        f60 f60Var10 = e60Var.H0;
                                                        f60Var10.U[0] = 0;
                                                        if (!f60Var10.F) {
                                                            e60Var.H0.F = true;
                                                            AndroidUtilities.runOnUIThread(new b60(e60Var, 6));
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!f60Var8.F) {
                                                e60Var.H0.F = true;
                                                AndroidUtilities.runOnUIThread(new b60(e60Var, 7));
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (e60Var.R != 0 && !e60Var.Q) {
                                    j3 = j16 - e60Var.S;
                                    c10 = 3;
                                    long currentTimeMillis = (System.currentTimeMillis() - e60Var.O) * 1000000;
                                    if (j3 < 0 || Math.abs(currentTimeMillis - j3) > 100000000) {
                                        j3 = currentTimeMillis;
                                    }
                                    break;
                                } else {
                                    c10 = 3;
                                }
                                j3 = 0;
                                e60Var.S = j16;
                                j10 = 0;
                                e60Var.Q = false;
                                e60Var.O = System.currentTimeMillis();
                                if (!e60Var.a0) {
                                }
                                e60Var.R += j3;
                                if (e60Var.c0 == -1) {
                                }
                                e60Var.e0 = j16 - e60Var.d0;
                                e60Var.d0 = j16;
                                f60 f60Var11 = e60Var.H0;
                                floatBuffer = f60Var11.z0;
                                floatBuffer2 = f60Var11.y0;
                                FloatBuffer floatBuffer32 = f60Var11.A0;
                                if (floatBuffer != null) {
                                }
                                FileLog.d("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                            }
                        } else if (i14 == 3) {
                            u50 u50Var = (u50) message.obj;
                            if (!e60Var.D0 && !e60Var.l0) {
                                e60Var.L.add(u50Var);
                                if (e60Var.h0 == -1) {
                                    if (e60Var.c0 == -1) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("InstantCamera video record not yet started");
                                            break;
                                        }
                                    } else {
                                        while (true) {
                                            int i33 = 0;
                                            while (i33 < u50Var.d) {
                                                if (i33 != 0 || Math.abs(e60Var.c0 - u50Var.b[i33]) <= 10000000) {
                                                    j11 = j15;
                                                    long j20 = u50Var.b[i33];
                                                    if (j20 >= e60Var.c0) {
                                                        u50Var.e = i33;
                                                        e60Var.h0 = j20;
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            hc.b.x(hc.b.m(i33, "InstantCamera found first audio frame at ", " timestamp = "), u50Var.b[i33]);
                                                        }
                                                    } else {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            hc.b.x(hc.b.m(i33, "InstantCamera ignore first audio frame at ", " timestamp = "), u50Var.b[i33]);
                                                        }
                                                        i33++;
                                                        j15 = j11;
                                                    }
                                                } else {
                                                    long j21 = e60Var.c0;
                                                    j11 = j15;
                                                    long j22 = u50Var.b[i33];
                                                    e60Var.b0 = j21 - j22;
                                                    e60Var.h0 = j22;
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        hc.b.x(new StringBuilder("InstantCamera detected desync between audio and video "), e60Var.b0);
                                                    }
                                                }
                                            }
                                            long j23 = j15;
                                            if (BuildVars.LOGS_ENABLED) {
                                                hc.b.q(u50Var.d, new StringBuilder("InstantCamera first audio frame not found, removing buffers "));
                                            }
                                            e60Var.L.remove(u50Var);
                                            if (e60Var.L.isEmpty()) {
                                                break;
                                            } else {
                                                u50Var = (u50) e60Var.L.get(0);
                                                j15 = j23;
                                            }
                                        }
                                    }
                                } else {
                                    j11 = -1;
                                }
                                if (e60Var.P == j11) {
                                    e60Var.P = u50Var.b[u50Var.e];
                                }
                                if (e60Var.L.size() > 1) {
                                    u50Var = (u50) e60Var.L.get(0);
                                }
                                u50 u50Var2 = u50Var;
                                try {
                                    e60Var.e(false);
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                                boolean z11 = false;
                                while (u50Var2 != null) {
                                    try {
                                        int dequeueInputBuffer = e60Var.F.dequeueInputBuffer(j14);
                                        if (dequeueInputBuffer >= 0) {
                                            ByteBuffer inputBuffer = e60Var.F.getInputBuffer(dequeueInputBuffer);
                                            long[] jArr = u50Var2.b;
                                            int i34 = u50Var2.e;
                                            long j24 = jArr[i34];
                                            while (true) {
                                                int i35 = u50Var2.d;
                                                if (i34 <= i35) {
                                                    if (i34 < i35) {
                                                        j12 = j14;
                                                        long j25 = u50Var2.b[i34] - e60Var.P;
                                                        if (e60Var.W) {
                                                            j13 = j24;
                                                        } else {
                                                            j13 = j24;
                                                            if (u50Var2.b[i34] >= e60Var.d0 - e60Var.b0 || j25 >= 60000000) {
                                                            }
                                                        }
                                                        if (inputBuffer.remaining() < u50Var2.c[i34]) {
                                                            u50Var2.e = i34;
                                                            break;
                                                        } else {
                                                            inputBuffer.put(u50Var2.a[i34]);
                                                        }
                                                    } else {
                                                        j12 = j14;
                                                        j13 = j24;
                                                    }
                                                    if (i34 >= u50Var2.d - 1) {
                                                        e60Var.L.remove(u50Var2);
                                                        if (e60Var.W) {
                                                            e60Var.z0.put(u50Var2);
                                                        }
                                                        if (e60Var.L.isEmpty()) {
                                                            z11 = u50Var2.f;
                                                            break;
                                                        } else {
                                                            u50Var2 = (u50) e60Var.L.get(0);
                                                        }
                                                    }
                                                    i34++;
                                                    j14 = j12;
                                                    j24 = j13;
                                                } else {
                                                    j12 = j14;
                                                    j13 = j24;
                                                }
                                            }
                                            long j26 = j13 == j12 ? j12 : j13 - e60Var.P;
                                            long j27 = e60Var.k0;
                                            if (j27 >= j12) {
                                                j26 += j27;
                                            }
                                            long j28 = j26;
                                            e60Var.j0 = j28 - e60Var.i0;
                                            e60Var.i0 = j28;
                                            e60Var.F.queueInputBuffer(dequeueInputBuffer, 0, inputBuffer.position(), j28, z11 ? 4 : 0);
                                        } else {
                                            j12 = j14;
                                        }
                                        j14 = j12;
                                    } catch (Throwable th2) {
                                        FileLog.e(th2);
                                        return;
                                    }
                                }
                                break;
                            }
                        } else if (i14 == 4) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera pause encoder");
                            }
                            e60Var.D0 = true;
                            File file = e60Var.H0.b0;
                            if (file != null) {
                                file.delete();
                                e60Var.H0.b0 = null;
                            }
                            f60 f60Var12 = e60Var.H0;
                            f60Var12.b0 = r9.x(f60Var12.a, true);
                            try {
                                FileLog.d("InstantCamera handlePauseRecording drain encoders");
                                e60Var.e(false);
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            MP4Builder mP4Builder = e60Var.K;
                            if (mP4Builder != null) {
                                try {
                                    mP4Builder.finishMovie(e60Var.H0.b0);
                                } catch (Exception e12) {
                                    FileLog.e(e12);
                                }
                            }
                            AndroidUtilities.runOnUIThread(new b60(e60Var, i12));
                            break;
                        } else if (i14 == 5) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera resume encoder");
                            }
                            e60Var.D0 = false;
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
                    int i36 = message.what;
                    int i37 = message.arg1;
                    int i38 = message.arg2;
                    Object obj = message.obj;
                    Bundle peekData = message.peekData();
                    switch (i36) {
                        case 0:
                            if (i37 == m0Var.g) {
                                m0Var.g = 0;
                                if (r0Var.y == m0Var) {
                                    r0Var.q();
                                }
                            }
                            if (((o0) sparseArray.get(i37)) != null) {
                                sparseArray.remove(i37);
                                o0.a(null, null);
                                break;
                            }
                            break;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (m0Var.f == 0 && i37 == m0Var.g && i38 >= 1) {
                                    m0Var.g = 0;
                                    m0Var.f = i38;
                                    b2.p g10 = b2.p.g(bundle);
                                    if (r0Var.y == m0Var) {
                                        r0Var.g(g10);
                                    }
                                    if (r0Var.y == m0Var) {
                                        r0Var.E = true;
                                        int size = arrayList.size();
                                        while (i11 < size) {
                                            ((n0) arrayList.get(i11)).a(r0Var.y);
                                            i11++;
                                        }
                                        p4.n nVar = (p4.n) r0Var.h;
                                        if (nVar != null) {
                                            m0 m0Var2 = r0Var.y;
                                            int i39 = m0Var2.d;
                                            m0Var2.d = i39 + 1;
                                            m0Var2.b(10, i39, 0, nVar.a, null);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                o0 o0Var = (o0) sparseArray.get(i37);
                                if (o0Var != null) {
                                    sparseArray.remove(i37);
                                    o0Var.b(bundle2);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                String string = peekData != null ? peekData.getString("error") : null;
                                Bundle bundle3 = (Bundle) obj;
                                if (((o0) sparseArray.get(i37)) != null) {
                                    sparseArray.remove(i37);
                                    o0.a(string, bundle3);
                                    break;
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (m0Var.f != 0) {
                                    b2.p g11 = b2.p.g(bundle4);
                                    if (r0Var.y == m0Var) {
                                        r0Var.g(g11);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 6:
                            if (obj instanceof Bundle) {
                                Bundle bundle5 = (Bundle) obj;
                                o0 o0Var2 = (o0) sparseArray.get(i37);
                                if (bundle5.containsKey("routeId")) {
                                    sparseArray.remove(i37);
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
                                    int i40 = 0;
                                    while (i40 < size2) {
                                        Object obj2 = parcelableArrayList.get(i40);
                                        i40++;
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
                                            if (i11 < size3) {
                                                Object obj3 = arrayList.get(i11);
                                                i11++;
                                                n0 n0Var3 = (n0) obj3;
                                                if (n0Var3.b() == i38) {
                                                    n0Var2 = n0Var3;
                                                }
                                            }
                                        }
                                        if (n0Var2 instanceof p0) {
                                            ((p0) n0Var2).l(mVar, arrayList2);
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
                                    if (i11 < size4) {
                                        Object obj4 = arrayList.get(i11);
                                        i11++;
                                        n0 n0Var4 = (n0) obj4;
                                        if (n0Var4.b() == i38) {
                                            n0Var = n0Var4;
                                        }
                                    }
                                }
                                org.telegram.tgnet.j jVar = r0Var.F;
                                if (jVar != null && (n0Var instanceof p4.q)) {
                                    p4.q qVar = (p4.q) n0Var;
                                    p4.e eVar = (p4.e) ((s0) jVar.b).c;
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
                    int i41 = r0.G;
                    break;
                }
                break;
        }
    }

    public d(m0 m0Var) {
        this.a = 2;
        this.b = new WeakReference(m0Var);
    }
}
