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
import di.o8;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import ji.k5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.camera.Size;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Components.a50;
import org.telegram.ui.Components.b50;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.q50;
import org.telegram.ui.Components.r50;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.w50;
import org.telegram.ui.Components.y40;
import org.telegram.ui.Components.z40;
import p4.m0;
import p4.n0;
import p4.o0;
import p4.p0;
import p4.r0;
import p4.s0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
        int i11;
        long j11;
        long j12;
        long j13;
        p4.o oVar;
        n0 n0Var = null;
        n0 n0Var2 = null;
        int i12 = 0;
        int i13 = 2;
        switch (this.a) {
            case 0:
                int i14 = message.what;
                if (i14 == -3 || i14 == -2 || i14 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.b.get(), message.what);
                    break;
                } else if (i14 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            case 1:
                int i15 = message.what;
                v50 v50Var = (v50) this.b.get();
                if (v50Var != null) {
                    if (i15 == 0) {
                        try {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera start encoder");
                            }
                            v50.a(v50Var, message.arg1 == 1);
                            break;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            v50.b(v50Var, 0, null);
                            Looper.myLooper().quit();
                            return;
                        }
                    } else if (i15 == 1) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("InstantCamera stop encoder");
                        }
                        v50.b(v50Var, message.arg1, (q50) message.obj);
                        break;
                    } else {
                        long j14 = 0;
                        long j15 = -1;
                        if (i15 == 2) {
                            long j16 = (message.arg1 << 32) | (message.arg2 & 4294967295L);
                            Integer num = (Integer) message.obj;
                            if (!v50Var.D0 && v50Var.H0.R) {
                                try {
                                    v50Var.e(false);
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                                if (v50Var.w0.equals(num)) {
                                    z10 = false;
                                } else {
                                    v50Var.w0 = num;
                                    z10 = true;
                                }
                                long j17 = v50Var.g0;
                                if (j17 >= 0) {
                                    if (v50Var.f0 == -1) {
                                        v50Var.f0 = j16 - j17;
                                    }
                                    j16 -= v50Var.f0;
                                }
                                if (!z10) {
                                    long j18 = v50Var.S;
                                    if (j18 != -1) {
                                        j3 = j16 - j18;
                                        v50Var.S = j16;
                                        j10 = j3;
                                        c10 = 3;
                                        v50Var.Q = false;
                                        v50Var.O = System.currentTimeMillis();
                                        if (!v50Var.a0) {
                                            long j19 = v50Var.Z + j3;
                                            v50Var.Z = j19;
                                            if (j19 >= 200000000) {
                                                v50Var.a0 = true;
                                            }
                                        }
                                        v50Var.R += j3;
                                        if (v50Var.c0 == -1) {
                                            v50Var.c0 = j16 / 1000;
                                            if (BuildVars.LOGS_ENABLED) {
                                                i2.g.w(new StringBuilder("InstantCamera first video frame was at "), v50Var.c0);
                                            }
                                        }
                                        v50Var.e0 = j16 - v50Var.d0;
                                        v50Var.d0 = j16;
                                        w50 w50Var = v50Var.H0;
                                        floatBuffer = w50Var.z0;
                                        floatBuffer2 = w50Var.y0;
                                        FloatBuffer floatBuffer3 = w50Var.A0;
                                        if (floatBuffer != null || floatBuffer2 == null) {
                                            FileLog.d("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                                            break;
                                        } else {
                                            b50 b50Var = v50Var.x0;
                                            int i16 = 3553;
                                            int i17 = 36160;
                                            if (b50Var != null) {
                                                GLES20.glBindFramebuffer(36160, b50Var.j[0]);
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, b50Var.k[0], 0);
                                                GLES20.glViewport(0, 0, b50Var.a, b50Var.b);
                                            }
                                            GLES20.glUseProgram(v50Var.m0);
                                            GLES20.glActiveTexture(33984);
                                            GLES20.glVertexAttribPointer(v50Var.p0, 3, 5126, false, 12, (Buffer) floatBuffer2);
                                            GLES20.glEnableVertexAttribArray(v50Var.p0);
                                            GLES20.glVertexAttribPointer(v50Var.q0, 2, 5126, false, 8, (Buffer) floatBuffer);
                                            GLES20.glEnableVertexAttribArray(v50Var.q0);
                                            GLES20.glUniformMatrix4fv(v50Var.n0, 1, false, v50Var.H0.v0, 0);
                                            GLES20.glUniform2f(v50Var.r0, v50Var.d, v50Var.e);
                                            w50 w50Var2 = v50Var.H0;
                                            if (w50Var2.U[0] != 0 && floatBuffer3 != null && !w50Var2.p0) {
                                                if (!v50Var.n) {
                                                    GLES20.glEnable(3042);
                                                    v50Var.n = true;
                                                }
                                                if (v50Var.H0.D0 != null) {
                                                    GLES20.glUniform2f(v50Var.s0, r2.getWidth(), v50Var.H0.D0.getHeight());
                                                }
                                                GLES20.glVertexAttribPointer(v50Var.q0, 2, 5126, false, 8, (Buffer) floatBuffer3);
                                                GLES20.glUniformMatrix4fv(v50Var.o0, 1, false, v50Var.H0.x0, 0);
                                                GLES20.glUniform1f(v50Var.u0, 1.0f);
                                                GLES20.glBindTexture(36197, v50Var.H0.U[0]);
                                                GLES20.glDrawArrays(5, 0, 4);
                                            }
                                            w50 w50Var3 = v50Var.H0;
                                            Size[] sizeArr = w50Var3.i0;
                                            if (sizeArr != null) {
                                                int i18 = v50Var.s0;
                                                float width = sizeArr[w50Var3.a1].getWidth();
                                                w50 w50Var4 = v50Var.H0;
                                                GLES20.glUniform2f(i18, width, w50Var4.i0[w50Var4.a1].getHeight());
                                                int i19 = v50Var.t0;
                                                w50 w50Var5 = v50Var.H0;
                                                w50 w50Var6 = v50Var.H0;
                                                GLES20.glUniform2f(i19, (1.0f / w50Var5.i0[w50Var5.a1].getWidth()) / 2.0f, (1.0f / w50Var6.i0[w50Var6.a1].getHeight()) / 2.0f);
                                            }
                                            w50 w50Var7 = v50Var.H0;
                                            int i20 = w50Var7.T[w50Var7.a1];
                                            if (i20 != Integer.MIN_VALUE) {
                                                GLES20.glUniformMatrix4fv(v50Var.o0, 1, false, v50Var.H0.w0, 0);
                                                GLES20.glUniform1f(v50Var.u0, v50Var.H0.V);
                                                GLES20.glBindTexture(36197, i20);
                                                GLES20.glDrawArrays(5, 0, 4);
                                            }
                                            GLES20.glDisableVertexAttribArray(v50Var.p0);
                                            GLES20.glDisableVertexAttribArray(v50Var.q0);
                                            GLES20.glBindTexture(36197, 0);
                                            GLES20.glUseProgram(0);
                                            b50 b50Var2 = v50Var.x0;
                                            if (b50Var2 != null) {
                                                GLES20.glDisable(3042);
                                                a50 a50Var = b50Var2.c;
                                                int[] iArr = b50Var2.k;
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], 0);
                                                GLES20.glViewport(0, 0, 48, 48);
                                                GLES20.glUseProgram(a50Var.a);
                                                int i21 = a50Var.d;
                                                f7 = 1.0f;
                                                FloatBuffer floatBuffer4 = b50Var2.g;
                                                GLES20.glVertexAttribPointer(i21, 3, 5126, false, 12, floatBuffer4.position(0));
                                                int i22 = a50Var.d;
                                                GLES20.glEnableVertexAttribArray(i22);
                                                int i23 = a50Var.e;
                                                FloatBuffer floatBuffer5 = b50Var2.h;
                                                GLES20.glVertexAttribPointer(i23, 2, 5126, false, 8, floatBuffer5.position(0));
                                                int i24 = a50Var.e;
                                                GLES20.glEnableVertexAttribArray(i24);
                                                GLES20.glActiveTexture(33984);
                                                GLES20.glBindTexture(3553, iArr[0]);
                                                GLES20.glUniform1i(a50Var.f, 0);
                                                GLES20.glDrawArrays(5, 0, 4);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glDisableVertexAttribArray(i24);
                                                GLES20.glDisableVertexAttribArray(i22);
                                                GLES20.glUseProgram(0);
                                                int i25 = 0;
                                                while (i25 < 2) {
                                                    y40 y40Var = b50Var2.e;
                                                    GLES20.glFramebufferTexture2D(i17, 36064, i16, iArr[i25 == 0 ? (char) 2 : (char) 1], 0);
                                                    GLES20.glViewport(0, 0, 48, 48);
                                                    int i26 = y40Var.a;
                                                    int i27 = y40Var.e;
                                                    int i28 = y40Var.d;
                                                    GLES20.glUseProgram(i26);
                                                    GLES20.glVertexAttribPointer(y40Var.d, 3, 5126, false, 12, floatBuffer4.position(0));
                                                    GLES20.glEnableVertexAttribArray(i28);
                                                    GLES20.glVertexAttribPointer(y40Var.e, 2, 5126, false, 8, floatBuffer5.position(0));
                                                    GLES20.glEnableVertexAttribArray(i27);
                                                    GLES20.glActiveTexture(33984);
                                                    GLES20.glBindTexture(i16, iArr[i25 == 0 ? (char) 1 : (char) 2]);
                                                    GLES20.glUniform1i(y40Var.f, 0);
                                                    GLES20.glUniform2f(y40Var.g, i25 == 0 ? 0.020833334f : 0.0f, i25 == 1 ? 0.020833334f : 0.0f);
                                                    GLES20.glDrawArrays(5, 0, 4);
                                                    GLES20.glBindTexture(3553, 0);
                                                    GLES20.glDisableVertexAttribArray(i27);
                                                    GLES20.glDisableVertexAttribArray(i28);
                                                    GLES20.glUseProgram(0);
                                                    i25++;
                                                    i16 = 3553;
                                                    i17 = 36160;
                                                }
                                                z40 z40Var = b50Var2.f;
                                                GLES20.glBindFramebuffer(36160, 0);
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], 0);
                                                GLES20.glViewport(0, 0, b50Var2.a, b50Var2.b);
                                                GLES20.glUseProgram(z40Var.a);
                                                GLES20.glVertexAttribPointer(z40Var.d, 3, 5126, false, 12, floatBuffer4.position(0));
                                                GLES20.glEnableVertexAttribArray(z40Var.d);
                                                GLES20.glVertexAttribPointer(z40Var.e, 2, 5126, false, 8, floatBuffer5.position(0));
                                                GLES20.glEnableVertexAttribArray(z40Var.e);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, iArr[1]);
                                                GLES20.glActiveTexture(33984);
                                                GLES20.glBindTexture(3553, iArr[0]);
                                                GLES20.glUniform1i(z40Var.f, 0);
                                                GLES20.glUniform1i(z40Var.g, 1);
                                                GLES20.glUniform2f(z40Var.h, b50Var2.a / 2.0f, b50Var2.b / 2.0f);
                                                GLES20.glDrawArrays(5, 0, 4);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glActiveTexture(33984);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glDisableVertexAttribArray(z40Var.e);
                                                GLES20.glDisableVertexAttribArray(z40Var.d);
                                                GLES20.glUseProgram(0);
                                                a50 a50Var2 = b50Var2.d;
                                                GLES20.glEnable(3042);
                                                int i29 = a50Var2.a;
                                                int i30 = a50Var2.e;
                                                int i31 = a50Var2.d;
                                                GLES20.glUseProgram(i29);
                                                GLES20.glActiveTexture(33984);
                                                for (int i32 = 0; i32 < 2; i32++) {
                                                    if (i32 == 0) {
                                                        GLES20.glVertexAttribPointer(a50Var2.d, 3, 5126, false, 12, floatBuffer4.position(12));
                                                        GLES20.glEnableVertexAttribArray(i31);
                                                        GLES20.glVertexAttribPointer(a50Var2.e, 2, 5126, false, 8, floatBuffer5.position(8));
                                                        GLES20.glEnableVertexAttribArray(i30);
                                                        i11 = 3553;
                                                        GLES20.glBindTexture(3553, iArr[c10]);
                                                        i10 = 4;
                                                    } else {
                                                        int i33 = b50Var2.i;
                                                        b50Var2.i = i33 + 1;
                                                        GLES20.glVertexAttribPointer(a50Var2.d, 3, 5126, false, 12, floatBuffer4.position(24));
                                                        GLES20.glEnableVertexAttribArray(i31);
                                                        GLES20.glVertexAttribPointer(a50Var2.e, 2, 5126, false, 8, floatBuffer5.position(((i33 % 27) * 8) + 16));
                                                        GLES20.glEnableVertexAttribArray(i30);
                                                        i10 = 4;
                                                        i11 = 3553;
                                                        GLES20.glBindTexture(3553, iArr[4]);
                                                    }
                                                    GLES20.glUniform1i(a50Var2.f, 0);
                                                    GLES20.glDrawArrays(5, 0, i10);
                                                    GLES20.glBindTexture(i11, 0);
                                                    GLES20.glDisableVertexAttribArray(i30);
                                                    GLES20.glDisableVertexAttribArray(i31);
                                                }
                                                GLES20.glUseProgram(0);
                                                GLES20.glDisable(3042);
                                                if (v50Var.n) {
                                                    GLES20.glEnable(3042);
                                                }
                                            } else {
                                                f7 = 1.0f;
                                            }
                                            EGLExt.eglPresentationTimeANDROID(v50Var.s, v50Var.y, v50Var.R);
                                            EGL14.eglSwapBuffers(v50Var.s, v50Var.y);
                                            if (v50Var.B0 != null && SharedConfig.getDevicePerformanceClass() == 2 && v50Var.C0 % 33 == 0) {
                                                v50Var.B0.postRunnable(new l7(v50Var, 14));
                                            }
                                            v50Var.C0++;
                                            w50 w50Var8 = v50Var.H0;
                                            if (w50Var8.U[0] != 0) {
                                                float f10 = w50Var8.V;
                                                if (f10 < f7 && !w50Var8.p0) {
                                                    float f11 = (j10 / 2.0E8f) + f10;
                                                    w50Var8.V = f11;
                                                    if (f11 > f7) {
                                                        GLES20.glDisable(3042);
                                                        v50Var.n = false;
                                                        w50 w50Var9 = v50Var.H0;
                                                        w50Var9.V = 1.0f;
                                                        GLES20.glDeleteTextures(1, w50Var9.U, 0);
                                                        w50 w50Var10 = v50Var.H0;
                                                        w50Var10.U[0] = 0;
                                                        if (!w50Var10.F) {
                                                            v50Var.H0.F = true;
                                                            AndroidUtilities.runOnUIThread(new r50(v50Var, 6));
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!w50Var8.F) {
                                                v50Var.H0.F = true;
                                                AndroidUtilities.runOnUIThread(new r50(v50Var, 7));
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (v50Var.R != 0 && !v50Var.Q) {
                                    j3 = j16 - v50Var.S;
                                    c10 = 3;
                                    long currentTimeMillis = (System.currentTimeMillis() - v50Var.O) * 1000000;
                                    if (j3 < 0 || Math.abs(currentTimeMillis - j3) > 100000000) {
                                        j3 = currentTimeMillis;
                                    }
                                    break;
                                } else {
                                    c10 = 3;
                                }
                                j3 = 0;
                                v50Var.S = j16;
                                j10 = 0;
                                v50Var.Q = false;
                                v50Var.O = System.currentTimeMillis();
                                if (!v50Var.a0) {
                                }
                                v50Var.R += j3;
                                if (v50Var.c0 == -1) {
                                }
                                v50Var.e0 = j16 - v50Var.d0;
                                v50Var.d0 = j16;
                                w50 w50Var11 = v50Var.H0;
                                floatBuffer = w50Var11.z0;
                                floatBuffer2 = w50Var11.y0;
                                FloatBuffer floatBuffer32 = w50Var11.A0;
                                if (floatBuffer != null) {
                                }
                                FileLog.d("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                            }
                        } else if (i15 == 3) {
                            k50 k50Var = (k50) message.obj;
                            if (!v50Var.D0 && !v50Var.l0) {
                                v50Var.L.add(k50Var);
                                if (v50Var.h0 == -1) {
                                    if (v50Var.c0 == -1) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("InstantCamera video record not yet started");
                                            break;
                                        }
                                    } else {
                                        while (true) {
                                            int i34 = 0;
                                            while (i34 < k50Var.d) {
                                                if (i34 != 0 || Math.abs(v50Var.c0 - k50Var.b[i34]) <= 10000000) {
                                                    j11 = j15;
                                                    long j20 = k50Var.b[i34];
                                                    if (j20 >= v50Var.c0) {
                                                        k50Var.e = i34;
                                                        v50Var.h0 = j20;
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            i2.g.w(i2.g.l(i34, "InstantCamera found first audio frame at ", " timestamp = "), k50Var.b[i34]);
                                                        }
                                                    } else {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            i2.g.w(i2.g.l(i34, "InstantCamera ignore first audio frame at ", " timestamp = "), k50Var.b[i34]);
                                                        }
                                                        i34++;
                                                        j15 = j11;
                                                    }
                                                } else {
                                                    long j21 = v50Var.c0;
                                                    j11 = j15;
                                                    long j22 = k50Var.b[i34];
                                                    v50Var.b0 = j21 - j22;
                                                    v50Var.h0 = j22;
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        i2.g.w(new StringBuilder("InstantCamera detected desync between audio and video "), v50Var.b0);
                                                    }
                                                }
                                            }
                                            long j23 = j15;
                                            if (BuildVars.LOGS_ENABLED) {
                                                i2.g.o(k50Var.d, new StringBuilder("InstantCamera first audio frame not found, removing buffers "));
                                            }
                                            v50Var.L.remove(k50Var);
                                            if (v50Var.L.isEmpty()) {
                                                break;
                                            } else {
                                                k50Var = (k50) v50Var.L.get(0);
                                                j15 = j23;
                                            }
                                        }
                                    }
                                } else {
                                    j11 = -1;
                                }
                                if (v50Var.P == j11) {
                                    v50Var.P = k50Var.b[k50Var.e];
                                }
                                if (v50Var.L.size() > 1) {
                                    k50Var = (k50) v50Var.L.get(0);
                                }
                                k50 k50Var2 = k50Var;
                                try {
                                    v50Var.e(false);
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                }
                                boolean z11 = false;
                                while (k50Var2 != null) {
                                    try {
                                        int dequeueInputBuffer = v50Var.F.dequeueInputBuffer(j14);
                                        if (dequeueInputBuffer >= 0) {
                                            ByteBuffer inputBuffer = v50Var.F.getInputBuffer(dequeueInputBuffer);
                                            long[] jArr = k50Var2.b;
                                            int i35 = k50Var2.e;
                                            long j24 = jArr[i35];
                                            while (true) {
                                                int i36 = k50Var2.d;
                                                if (i35 <= i36) {
                                                    if (i35 < i36) {
                                                        j12 = j14;
                                                        long j25 = k50Var2.b[i35] - v50Var.P;
                                                        if (v50Var.W) {
                                                            j13 = j24;
                                                        } else {
                                                            j13 = j24;
                                                            if (k50Var2.b[i35] >= v50Var.d0 - v50Var.b0 || j25 >= 60000000) {
                                                            }
                                                        }
                                                        if (inputBuffer.remaining() < k50Var2.c[i35]) {
                                                            k50Var2.e = i35;
                                                            break;
                                                        } else {
                                                            inputBuffer.put(k50Var2.a[i35]);
                                                        }
                                                    } else {
                                                        j12 = j14;
                                                        j13 = j24;
                                                    }
                                                    if (i35 >= k50Var2.d - 1) {
                                                        v50Var.L.remove(k50Var2);
                                                        if (v50Var.W) {
                                                            v50Var.z0.put(k50Var2);
                                                        }
                                                        if (v50Var.L.isEmpty()) {
                                                            z11 = k50Var2.f;
                                                            break;
                                                        } else {
                                                            k50Var2 = (k50) v50Var.L.get(0);
                                                        }
                                                    }
                                                    i35++;
                                                    j14 = j12;
                                                    j24 = j13;
                                                } else {
                                                    j12 = j14;
                                                    j13 = j24;
                                                }
                                            }
                                            long j26 = j13 == j12 ? j12 : j13 - v50Var.P;
                                            long j27 = v50Var.k0;
                                            if (j27 >= j12) {
                                                j26 += j27;
                                            }
                                            long j28 = j26;
                                            v50Var.j0 = j28 - v50Var.i0;
                                            v50Var.i0 = j28;
                                            v50Var.F.queueInputBuffer(dequeueInputBuffer, 0, inputBuffer.position(), j28, z11 ? 4 : 0);
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
                        } else if (i15 == 4) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera pause encoder");
                            }
                            v50Var.D0 = true;
                            File file = v50Var.H0.b0;
                            if (file != null) {
                                file.delete();
                                v50Var.H0.b0 = null;
                            }
                            w50 w50Var12 = v50Var.H0;
                            w50Var12.b0 = o8.x(w50Var12.a, true);
                            try {
                                FileLog.d("InstantCamera handlePauseRecording drain encoders");
                                v50Var.e(false);
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                            MP4Builder mP4Builder = v50Var.K;
                            if (mP4Builder != null) {
                                try {
                                    mP4Builder.finishMovie(v50Var.H0.b0);
                                } catch (Exception e13) {
                                    FileLog.e(e13);
                                }
                            }
                            AndroidUtilities.runOnUIThread(new r50(v50Var, i13));
                            break;
                        } else if (i15 == 5) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera resume encoder");
                            }
                            v50Var.D0 = false;
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
                    int i37 = message.what;
                    int i38 = message.arg1;
                    int i39 = message.arg2;
                    Object obj = message.obj;
                    Bundle peekData = message.peekData();
                    switch (i37) {
                        case 0:
                            if (i38 == m0Var.g) {
                                m0Var.g = 0;
                                if (r0Var.y == m0Var) {
                                    r0Var.q();
                                }
                            }
                            if (((o0) sparseArray.get(i38)) != null) {
                                sparseArray.remove(i38);
                                o0.a(null, null);
                                break;
                            }
                            break;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (m0Var.f == 0 && i38 == m0Var.g && i39 >= 1) {
                                    m0Var.g = 0;
                                    m0Var.f = i39;
                                    b2.p g10 = b2.p.g(bundle);
                                    if (r0Var.y == m0Var) {
                                        r0Var.g(g10);
                                    }
                                    if (r0Var.y == m0Var) {
                                        r0Var.E = true;
                                        int size = arrayList.size();
                                        while (i12 < size) {
                                            ((n0) arrayList.get(i12)).a(r0Var.y);
                                            i12++;
                                        }
                                        p4.n nVar = (p4.n) r0Var.h;
                                        if (nVar != null) {
                                            m0 m0Var2 = r0Var.y;
                                            int i40 = m0Var2.d;
                                            m0Var2.d = i40 + 1;
                                            m0Var2.b(10, i40, 0, nVar.a, null);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                o0 o0Var = (o0) sparseArray.get(i38);
                                if (o0Var != null) {
                                    sparseArray.remove(i38);
                                    o0Var.b(bundle2);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                String string = peekData != null ? peekData.getString("error") : null;
                                Bundle bundle3 = (Bundle) obj;
                                if (((o0) sparseArray.get(i38)) != null) {
                                    sparseArray.remove(i38);
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
                                o0 o0Var2 = (o0) sparseArray.get(i38);
                                if (bundle5.containsKey("routeId")) {
                                    sparseArray.remove(i38);
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
                                    int i41 = 0;
                                    while (i41 < size2) {
                                        Object obj2 = parcelableArrayList.get(i41);
                                        i41++;
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
                                            if (i12 < size3) {
                                                Object obj3 = arrayList.get(i12);
                                                i12++;
                                                n0 n0Var3 = (n0) obj3;
                                                if (n0Var3.b() == i39) {
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
                                    if (i12 < size4) {
                                        Object obj4 = arrayList.get(i12);
                                        i12++;
                                        n0 n0Var4 = (n0) obj4;
                                        if (n0Var4.b() == i39) {
                                            n0Var = n0Var4;
                                        }
                                    }
                                }
                                k5 k5Var = r0Var.F;
                                if (k5Var != null && (n0Var instanceof p4.q)) {
                                    p4.q qVar = (p4.q) n0Var;
                                    p4.e eVar = (p4.e) ((s0) k5Var.b).c;
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
                    int i42 = r0.G;
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
