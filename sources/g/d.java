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
import ci.k8;
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
import org.telegram.ui.Cells.t6;
import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.n50;
import org.telegram.ui.Components.t50;
import org.telegram.ui.Components.u50;
import org.telegram.ui.Components.y50;
import p4.m0;
import p4.n0;
import p4.o0;
import p4.p0;
import p4.r0;
import p4.s0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class d extends Handler {
    public final /* synthetic */ int a;
    public WeakReference b;

    public /* synthetic */ d(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:440:0x04f3, code lost:
    
        if (r10 < 0) goto L292;
     */
    /* JADX WARN: Removed duplicated region for block: B:324:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0525  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        boolean z10;
        long j3;
        long j10;
        FloatBuffer floatBuffer;
        FloatBuffer floatBuffer2;
        char c10;
        int i10;
        float f7;
        int i11;
        float f10;
        int i12;
        float f11;
        int i13;
        long j11;
        long j12;
        long j13;
        p4.o oVar;
        int i14 = 2;
        n0 n0Var = null;
        n0 n0Var2 = null;
        int i15 = 0;
        int i16 = 1;
        switch (this.a) {
            case 0:
                int i17 = message.what;
                if (i17 == -3 || i17 == -2 || i17 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.b.get(), message.what);
                    break;
                } else if (i17 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            case 1:
                int i18 = message.what;
                y50 y50Var = (y50) this.b.get();
                if (y50Var != null) {
                    if (i18 == 0) {
                        try {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera start encoder");
                            }
                            y50.a(y50Var, message.arg1 == 1);
                            break;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            y50.b(y50Var, 0, null);
                            Looper.myLooper().quit();
                            return;
                        }
                    } else if (i18 == 1) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("InstantCamera stop encoder");
                        }
                        y50.b(y50Var, message.arg1, (t50) message.obj);
                        break;
                    } else {
                        int i19 = 5;
                        long j14 = 0;
                        long j15 = -1;
                        if (i18 == 2) {
                            long j16 = (message.arg1 << 32) | (message.arg2 & 4294967295L);
                            Integer num = (Integer) message.obj;
                            if (!y50Var.D0 && y50Var.H0.W) {
                                try {
                                    y50Var.e(false);
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                                if (y50Var.w0.equals(num)) {
                                    z10 = false;
                                } else {
                                    y50Var.w0 = num;
                                    z10 = true;
                                }
                                long j17 = y50Var.g0;
                                if (j17 >= 0) {
                                    if (y50Var.f0 == -1) {
                                        y50Var.f0 = j16 - j17;
                                    }
                                    j16 -= y50Var.f0;
                                }
                                if (!z10) {
                                    long j18 = y50Var.S;
                                    if (j18 != -1) {
                                        j3 = j16 - j18;
                                        y50Var.S = j16;
                                        j10 = j3;
                                        y50Var.Q = false;
                                        y50Var.O = System.currentTimeMillis();
                                        if (!y50Var.a0) {
                                            long j19 = y50Var.Z + j3;
                                            y50Var.Z = j19;
                                            if (j19 >= 200000000) {
                                                y50Var.a0 = true;
                                            }
                                        }
                                        y50Var.R += j3;
                                        if (y50Var.c0 == -1) {
                                            y50Var.c0 = j16 / 1000;
                                            if (BuildVars.LOGS_ENABLED) {
                                                org.telegram.messenger.q.r(new StringBuilder("InstantCamera first video frame was at "), y50Var.c0);
                                            }
                                        }
                                        y50Var.e0 = j16 - y50Var.d0;
                                        y50Var.d0 = j16;
                                        f60 f60Var = y50Var.H0;
                                        floatBuffer = f60Var.E0;
                                        floatBuffer2 = f60Var.D0;
                                        FloatBuffer floatBuffer3 = f60Var.F0;
                                        if (floatBuffer != null || floatBuffer2 == null) {
                                            FileLog.d("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                                            break;
                                        } else {
                                            f50 f50Var = y50Var.x0;
                                            int i20 = 3553;
                                            if (f50Var != null) {
                                                c10 = 3;
                                                GLES20.glBindFramebuffer(36160, f50Var.j[0]);
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, f50Var.k[0], 0);
                                                GLES20.glViewport(0, 0, f50Var.a, f50Var.b);
                                            } else {
                                                c10 = 3;
                                            }
                                            GLES20.glUseProgram(y50Var.m0);
                                            GLES20.glActiveTexture(33984);
                                            GLES20.glVertexAttribPointer(y50Var.p0, 3, 5126, false, 12, (Buffer) floatBuffer2);
                                            GLES20.glEnableVertexAttribArray(y50Var.p0);
                                            GLES20.glVertexAttribPointer(y50Var.q0, 2, 5126, false, 8, (Buffer) floatBuffer);
                                            GLES20.glEnableVertexAttribArray(y50Var.q0);
                                            GLES20.glUniformMatrix4fv(y50Var.n0, 1, false, y50Var.H0.A0, 0);
                                            GLES20.glUniform2f(y50Var.r0, y50Var.d, y50Var.e);
                                            f60 f60Var2 = y50Var.H0;
                                            if (f60Var2.c0[0] == 0 || floatBuffer3 == null || f60Var2.u0) {
                                                i10 = 36197;
                                                f7 = 1.0f;
                                                i11 = 33984;
                                            } else {
                                                if (!y50Var.n) {
                                                    GLES20.glEnable(3042);
                                                    y50Var.n = true;
                                                }
                                                if (y50Var.H0.I0 != null) {
                                                    i11 = 33984;
                                                    GLES20.glUniform2f(y50Var.s0, r4.getWidth(), y50Var.H0.I0.getHeight());
                                                } else {
                                                    i11 = 33984;
                                                }
                                                i10 = 36197;
                                                f7 = 1.0f;
                                                GLES20.glVertexAttribPointer(y50Var.q0, 2, 5126, false, 8, (Buffer) floatBuffer3);
                                                GLES20.glUniformMatrix4fv(y50Var.o0, 1, false, y50Var.H0.C0, 0);
                                                GLES20.glUniform1f(y50Var.u0, 1.0f);
                                                GLES20.glBindTexture(36197, y50Var.H0.c0[0]);
                                                GLES20.glDrawArrays(5, 0, 4);
                                            }
                                            f60 f60Var3 = y50Var.H0;
                                            Size[] sizeArr = f60Var3.n0;
                                            if (sizeArr != null) {
                                                int i21 = y50Var.s0;
                                                float width = sizeArr[f60Var3.f1].getWidth();
                                                f60 f60Var4 = y50Var.H0;
                                                f10 = 2.0f;
                                                GLES20.glUniform2f(i21, width, f60Var4.n0[f60Var4.f1].getHeight());
                                                int i22 = y50Var.t0;
                                                f60 f60Var5 = y50Var.H0;
                                                float width2 = (f7 / f60Var5.n0[f60Var5.f1].getWidth()) / 2.0f;
                                                f60 f60Var6 = y50Var.H0;
                                                GLES20.glUniform2f(i22, width2, (f7 / f60Var6.n0[f60Var6.f1].getHeight()) / 2.0f);
                                            } else {
                                                f10 = 2.0f;
                                            }
                                            f60 f60Var7 = y50Var.H0;
                                            int i23 = f60Var7.b0[f60Var7.f1];
                                            if (i23 != Integer.MIN_VALUE) {
                                                i12 = 0;
                                                GLES20.glUniformMatrix4fv(y50Var.o0, 1, false, y50Var.H0.B0, 0);
                                                GLES20.glUniform1f(y50Var.u0, y50Var.H0.d0);
                                                GLES20.glBindTexture(i10, i23);
                                                GLES20.glDrawArrays(5, 0, 4);
                                            } else {
                                                i12 = 0;
                                            }
                                            GLES20.glDisableVertexAttribArray(y50Var.p0);
                                            GLES20.glDisableVertexAttribArray(y50Var.q0);
                                            GLES20.glBindTexture(i10, i12);
                                            GLES20.glUseProgram(i12);
                                            f50 f50Var2 = y50Var.x0;
                                            if (f50Var2 != null) {
                                                GLES20.glDisable(3042);
                                                e50 e50Var = f50Var2.c;
                                                int[] iArr = f50Var2.k;
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], i12);
                                                GLES20.glViewport(i12, i12, 48, 48);
                                                f11 = 1.0f;
                                                GLES20.glUseProgram(e50Var.a);
                                                int i24 = e50Var.d;
                                                FloatBuffer floatBuffer4 = f50Var2.g;
                                                GLES20.glVertexAttribPointer(i24, 3, 5126, false, 12, floatBuffer4.position(i12));
                                                int i25 = e50Var.d;
                                                GLES20.glEnableVertexAttribArray(i25);
                                                int i26 = e50Var.e;
                                                FloatBuffer floatBuffer5 = f50Var2.h;
                                                GLES20.glVertexAttribPointer(i26, 2, 5126, false, 8, floatBuffer5.position(i12));
                                                int i27 = e50Var.e;
                                                GLES20.glEnableVertexAttribArray(i27);
                                                GLES20.glActiveTexture(i11);
                                                GLES20.glBindTexture(3553, iArr[i12]);
                                                GLES20.glUniform1i(e50Var.f, i12);
                                                GLES20.glDrawArrays(5, i12, 4);
                                                GLES20.glBindTexture(3553, i12);
                                                GLES20.glDisableVertexAttribArray(i27);
                                                GLES20.glDisableVertexAttribArray(i25);
                                                GLES20.glUseProgram(i12);
                                                int i28 = 0;
                                                while (i28 < i14) {
                                                    c50 c50Var = f50Var2.e;
                                                    GLES20.glFramebufferTexture2D(36160, 36064, i20, iArr[i28 == 0 ? (char) 2 : (char) 1], i12);
                                                    GLES20.glViewport(i12, i12, 48, 48);
                                                    int i29 = c50Var.a;
                                                    int i30 = c50Var.e;
                                                    int i31 = c50Var.d;
                                                    GLES20.glUseProgram(i29);
                                                    GLES20.glVertexAttribPointer(c50Var.d, 3, 5126, false, 12, floatBuffer4.position(i12));
                                                    GLES20.glEnableVertexAttribArray(i31);
                                                    GLES20.glVertexAttribPointer(c50Var.e, 2, 5126, false, 8, floatBuffer5.position(i12));
                                                    GLES20.glEnableVertexAttribArray(i30);
                                                    GLES20.glActiveTexture(i11);
                                                    GLES20.glBindTexture(i20, iArr[i28 == 0 ? (char) 1 : (char) 2]);
                                                    i12 = 0;
                                                    GLES20.glUniform1i(c50Var.f, 0);
                                                    GLES20.glUniform2f(c50Var.g, i28 == 0 ? 0.020833334f : 0.0f, i28 == 1 ? 0.020833334f : 0.0f);
                                                    GLES20.glDrawArrays(5, 0, 4);
                                                    GLES20.glBindTexture(3553, 0);
                                                    GLES20.glDisableVertexAttribArray(i30);
                                                    GLES20.glDisableVertexAttribArray(i31);
                                                    GLES20.glUseProgram(0);
                                                    i28++;
                                                    i14 = 2;
                                                    i20 = 3553;
                                                }
                                                d50 d50Var = f50Var2.f;
                                                GLES20.glBindFramebuffer(36160, i12);
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], i12);
                                                GLES20.glViewport(i12, i12, f50Var2.a, f50Var2.b);
                                                GLES20.glUseProgram(d50Var.a);
                                                GLES20.glVertexAttribPointer(d50Var.d, 3, 5126, false, 12, floatBuffer4.position(i12));
                                                GLES20.glEnableVertexAttribArray(d50Var.d);
                                                GLES20.glVertexAttribPointer(d50Var.e, 2, 5126, false, 8, floatBuffer5.position(i12));
                                                GLES20.glEnableVertexAttribArray(d50Var.e);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, iArr[1]);
                                                GLES20.glActiveTexture(i11);
                                                GLES20.glBindTexture(3553, iArr[0]);
                                                GLES20.glUniform1i(d50Var.f, 0);
                                                GLES20.glUniform1i(d50Var.g, 1);
                                                GLES20.glUniform2f(d50Var.h, f50Var2.a / f10, f50Var2.b / f10);
                                                GLES20.glDrawArrays(5, 0, 4);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glActiveTexture(i11);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glDisableVertexAttribArray(d50Var.e);
                                                GLES20.glDisableVertexAttribArray(d50Var.d);
                                                GLES20.glUseProgram(0);
                                                e50 e50Var2 = f50Var2.d;
                                                GLES20.glEnable(3042);
                                                int i32 = e50Var2.a;
                                                int i33 = e50Var2.e;
                                                int i34 = e50Var2.d;
                                                GLES20.glUseProgram(i32);
                                                GLES20.glActiveTexture(i11);
                                                for (int i35 = 0; i35 < 2; i35++) {
                                                    if (i35 == 0) {
                                                        GLES20.glVertexAttribPointer(e50Var2.d, 3, 5126, false, 12, floatBuffer4.position(12));
                                                        GLES20.glEnableVertexAttribArray(i34);
                                                        GLES20.glVertexAttribPointer(e50Var2.e, 2, 5126, false, 8, floatBuffer5.position(8));
                                                        GLES20.glEnableVertexAttribArray(i33);
                                                        GLES20.glBindTexture(3553, iArr[c10]);
                                                        i13 = 4;
                                                    } else {
                                                        int i36 = f50Var2.i;
                                                        f50Var2.i = i36 + 1;
                                                        GLES20.glVertexAttribPointer(e50Var2.d, 3, 5126, false, 12, floatBuffer4.position(24));
                                                        GLES20.glEnableVertexAttribArray(i34);
                                                        GLES20.glVertexAttribPointer(e50Var2.e, 2, 5126, false, 8, floatBuffer5.position(((i36 % 27) * 8) + 16));
                                                        GLES20.glEnableVertexAttribArray(i33);
                                                        i13 = 4;
                                                        GLES20.glBindTexture(3553, iArr[4]);
                                                    }
                                                    GLES20.glUniform1i(e50Var2.f, 0);
                                                    GLES20.glDrawArrays(5, 0, i13);
                                                    GLES20.glBindTexture(3553, 0);
                                                    GLES20.glDisableVertexAttribArray(i33);
                                                    GLES20.glDisableVertexAttribArray(i34);
                                                }
                                                GLES20.glUseProgram(0);
                                                GLES20.glDisable(3042);
                                                if (y50Var.n) {
                                                    GLES20.glEnable(3042);
                                                }
                                            } else {
                                                f11 = 1.0f;
                                            }
                                            EGLExt.eglPresentationTimeANDROID(y50Var.s, y50Var.y, y50Var.R);
                                            EGL14.eglSwapBuffers(y50Var.s, y50Var.y);
                                            if (y50Var.B0 != null && SharedConfig.getDevicePerformanceClass() == 2 && y50Var.C0 % 33 == 0) {
                                                y50Var.B0.postRunnable(new t6(y50Var, 15));
                                            }
                                            y50Var.C0++;
                                            f60 f60Var8 = y50Var.H0;
                                            if (f60Var8.c0[0] != 0) {
                                                float f12 = f60Var8.d0;
                                                if (f12 < f11 && !f60Var8.u0) {
                                                    float f13 = (j10 / 2.0E8f) + f12;
                                                    f60Var8.d0 = f13;
                                                    if (f13 > f11) {
                                                        GLES20.glDisable(3042);
                                                        y50Var.n = false;
                                                        f60 f60Var9 = y50Var.H0;
                                                        f60Var9.d0 = 1.0f;
                                                        GLES20.glDeleteTextures(1, f60Var9.c0, 0);
                                                        f60 f60Var10 = y50Var.H0;
                                                        f60Var10.c0[0] = 0;
                                                        if (!f60Var10.K) {
                                                            y50Var.H0.K = true;
                                                            AndroidUtilities.runOnUIThread(new u50(y50Var, 4));
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!f60Var8.K) {
                                                y50Var.H0.K = true;
                                                AndroidUtilities.runOnUIThread(new u50(y50Var, i19));
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (y50Var.R != 0 && !y50Var.Q) {
                                    j3 = j16 - y50Var.S;
                                    long currentTimeMillis = (System.currentTimeMillis() - y50Var.O) * 1000000;
                                    if (j3 < 0 || Math.abs(currentTimeMillis - j3) > 100000000) {
                                        j3 = currentTimeMillis;
                                    }
                                    break;
                                }
                                j3 = 0;
                                y50Var.S = j16;
                                j10 = 0;
                                y50Var.Q = false;
                                y50Var.O = System.currentTimeMillis();
                                if (!y50Var.a0) {
                                }
                                y50Var.R += j3;
                                if (y50Var.c0 == -1) {
                                }
                                y50Var.e0 = j16 - y50Var.d0;
                                y50Var.d0 = j16;
                                f60 f60Var11 = y50Var.H0;
                                floatBuffer = f60Var11.E0;
                                floatBuffer2 = f60Var11.D0;
                                FloatBuffer floatBuffer32 = f60Var11.F0;
                                if (floatBuffer != null) {
                                }
                                FileLog.d("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                            }
                        } else if (i18 == 3) {
                            n50 n50Var = (n50) message.obj;
                            if (!y50Var.D0 && !y50Var.l0) {
                                y50Var.L.add(n50Var);
                                if (y50Var.h0 == -1) {
                                    if (y50Var.c0 == -1) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("InstantCamera video record not yet started");
                                            break;
                                        }
                                    } else {
                                        while (true) {
                                            int i37 = 0;
                                            while (i37 < n50Var.d) {
                                                if (i37 != 0 || Math.abs(y50Var.c0 - n50Var.b[i37]) <= 10000000) {
                                                    long j20 = n50Var.b[i37];
                                                    j11 = j15;
                                                    if (j20 >= y50Var.c0) {
                                                        n50Var.e = i37;
                                                        y50Var.h0 = j20;
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            org.telegram.messenger.q.r(hg.c.j(i37, "InstantCamera found first audio frame at ", " timestamp = "), n50Var.b[i37]);
                                                        }
                                                    } else {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            org.telegram.messenger.q.r(hg.c.j(i37, "InstantCamera ignore first audio frame at ", " timestamp = "), n50Var.b[i37]);
                                                        }
                                                        i37++;
                                                        j15 = j11;
                                                    }
                                                } else {
                                                    long j21 = y50Var.c0;
                                                    long j22 = n50Var.b[i37];
                                                    y50Var.b0 = j21 - j22;
                                                    y50Var.h0 = j22;
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        org.telegram.messenger.q.r(new StringBuilder("InstantCamera detected desync between audio and video "), y50Var.b0);
                                                    }
                                                }
                                            }
                                            long j23 = j15;
                                            if (BuildVars.LOGS_ENABLED) {
                                                org.telegram.messenger.q.n(n50Var.d, new StringBuilder("InstantCamera first audio frame not found, removing buffers "));
                                            }
                                            y50Var.L.remove(n50Var);
                                            if (y50Var.L.isEmpty()) {
                                                break;
                                            } else {
                                                n50Var = (n50) y50Var.L.get(0);
                                                j15 = j23;
                                            }
                                        }
                                    }
                                }
                                j11 = j15;
                                if (y50Var.P == j11) {
                                    y50Var.P = n50Var.b[n50Var.e];
                                }
                                if (y50Var.L.size() > 1) {
                                    n50Var = (n50) y50Var.L.get(0);
                                }
                                n50 n50Var2 = n50Var;
                                try {
                                    y50Var.e(false);
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                }
                                boolean z11 = false;
                                while (n50Var2 != null) {
                                    try {
                                        int dequeueInputBuffer = y50Var.F.dequeueInputBuffer(j14);
                                        if (dequeueInputBuffer >= 0) {
                                            ByteBuffer inputBuffer = y50Var.F.getInputBuffer(dequeueInputBuffer);
                                            long[] jArr = n50Var2.b;
                                            int i38 = n50Var2.e;
                                            long j24 = jArr[i38];
                                            while (true) {
                                                int i39 = n50Var2.d;
                                                if (i38 <= i39) {
                                                    if (i38 < i39) {
                                                        j12 = j14;
                                                        j13 = n50Var2.b[i38] - y50Var.P;
                                                        if (y50Var.W || (n50Var2.b[i38] < y50Var.d0 - y50Var.b0 && j13 < 60000000)) {
                                                            if (inputBuffer.remaining() < n50Var2.c[i38]) {
                                                                n50Var2.e = i38;
                                                            } else {
                                                                inputBuffer.put(n50Var2.a[i38]);
                                                            }
                                                        }
                                                    } else {
                                                        j12 = j14;
                                                    }
                                                    if (i38 >= n50Var2.d - 1) {
                                                        y50Var.L.remove(n50Var2);
                                                        if (y50Var.W) {
                                                            y50Var.z0.put(n50Var2);
                                                        }
                                                        if (y50Var.L.isEmpty()) {
                                                            z11 = n50Var2.f;
                                                        } else {
                                                            n50Var2 = (n50) y50Var.L.get(0);
                                                        }
                                                    }
                                                    i38++;
                                                    j14 = j12;
                                                } else {
                                                    j12 = j14;
                                                }
                                            }
                                            if (BuildVars.LOGS_ENABLED) {
                                                if (j13 >= 60000000) {
                                                    FileLog.d("InstantCamera stop audio encoding because recorded time more than 60s");
                                                } else {
                                                    FileLog.d("InstantCamera stop audio encoding because of stoped video recording at " + n50Var2.b[i38] + " last video " + y50Var.d0);
                                                }
                                            }
                                            y50Var.l0 = true;
                                            y50Var.L.clear();
                                            z11 = true;
                                            n50Var2 = null;
                                            long j25 = j24 == j12 ? j12 : j24 - y50Var.P;
                                            long j26 = y50Var.k0;
                                            if (j26 >= j12) {
                                                j25 += j26;
                                            }
                                            y50Var.j0 = j25 - y50Var.i0;
                                            y50Var.i0 = j25;
                                            y50Var.F.queueInputBuffer(dequeueInputBuffer, 0, inputBuffer.position(), j25, z11 ? 4 : 0);
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
                        } else if (i18 == 4) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera pause encoder");
                            }
                            y50Var.D0 = true;
                            File file = y50Var.H0.g0;
                            if (file != null) {
                                file.delete();
                                y50Var.H0.g0 = null;
                            }
                            f60 f60Var12 = y50Var.H0;
                            f60Var12.g0 = k8.x(f60Var12.f, true);
                            try {
                                FileLog.d("InstantCamera handlePauseRecording drain encoders");
                                y50Var.e(false);
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                            MP4Builder mP4Builder = y50Var.K;
                            if (mP4Builder != null) {
                                try {
                                    mP4Builder.finishMovie(y50Var.H0.g0);
                                } catch (Exception e13) {
                                    FileLog.e(e13);
                                }
                            }
                            AndroidUtilities.runOnUIThread(new u50(y50Var, i16));
                            break;
                        } else if (i18 == 5) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera resume encoder");
                            }
                            y50Var.D0 = false;
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
                                    b2.p g10 = b2.p.g(bundle);
                                    if (r0Var.y == m0Var) {
                                        r0Var.g(g10);
                                    }
                                    if (r0Var.y == m0Var) {
                                        r0Var.E = true;
                                        int size = arrayList.size();
                                        while (i15 < size) {
                                            ((n0) arrayList.get(i15)).a(r0Var.y);
                                            i15++;
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
                                            if (i15 < size3) {
                                                Object obj3 = arrayList.get(i15);
                                                i15++;
                                                n0 n0Var3 = (n0) obj3;
                                                if (n0Var3.b() == i42) {
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
                                    if (i15 < size4) {
                                        Object obj4 = arrayList.get(i15);
                                        i15++;
                                        n0 n0Var4 = (n0) obj4;
                                        if (n0Var4.b() == i42) {
                                            n0Var = n0Var4;
                                        }
                                    }
                                }
                                k2.v vVar = r0Var.F;
                                if (vVar != null && (n0Var instanceof p4.q)) {
                                    p4.q qVar = (p4.q) n0Var;
                                    p4.e eVar = (p4.e) ((s0) vVar.b).c;
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

    public d(m0 m0Var) {
        this.a = 2;
        this.b = new WeakReference(m0Var);
    }
}
