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
import ci.o8;
import hg.k0;
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
import org.telegram.ui.Components.a50;
import org.telegram.ui.Components.b50;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.p50;
import org.telegram.ui.Components.q50;
import org.telegram.ui.Components.u50;
import org.telegram.ui.Components.y40;
import org.telegram.ui.Components.z40;
import p4.m0;
import p4.n0;
import p4.o0;
import p4.p0;
import p4.r0;
import p4.s0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
                u50 u50Var = (u50) this.b.get();
                if (u50Var != null) {
                    if (i15 == 0) {
                        try {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera start encoder");
                            }
                            u50.a(u50Var, message.arg1 == 1);
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                            u50.b(u50Var, 0, null);
                            Looper.myLooper().quit();
                            return;
                        }
                    } else if (i15 == 1) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("InstantCamera stop encoder");
                        }
                        u50.b(u50Var, message.arg1, (p50) message.obj);
                        break;
                    } else {
                        long j14 = 0;
                        long j15 = -1;
                        if (i15 == 2) {
                            long j16 = (message.arg1 << 32) | (message.arg2 & 4294967295L);
                            Integer num = (Integer) message.obj;
                            if (!u50Var.D0 && u50Var.H0.U) {
                                try {
                                    u50Var.e(false);
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                }
                                if (u50Var.w0.equals(num)) {
                                    z10 = false;
                                } else {
                                    u50Var.w0 = num;
                                    z10 = true;
                                }
                                long j17 = u50Var.g0;
                                if (j17 >= 0) {
                                    if (u50Var.f0 == -1) {
                                        u50Var.f0 = j16 - j17;
                                    }
                                    j16 -= u50Var.f0;
                                }
                                if (!z10) {
                                    long j18 = u50Var.S;
                                    if (j18 != -1) {
                                        j3 = j16 - j18;
                                        u50Var.S = j16;
                                        j10 = j3;
                                        c10 = 3;
                                        u50Var.Q = false;
                                        u50Var.O = System.currentTimeMillis();
                                        if (!u50Var.a0) {
                                            long j19 = u50Var.Z + j3;
                                            u50Var.Z = j19;
                                            if (j19 >= 200000000) {
                                                u50Var.a0 = true;
                                            }
                                        }
                                        u50Var.R += j3;
                                        if (u50Var.c0 == -1) {
                                            u50Var.c0 = j16 / 1000;
                                            if (BuildVars.LOGS_ENABLED) {
                                                org.telegram.messenger.q.s(new StringBuilder("InstantCamera first video frame was at "), u50Var.c0);
                                            }
                                        }
                                        u50Var.e0 = j16 - u50Var.d0;
                                        u50Var.d0 = j16;
                                        b60 b60Var = u50Var.H0;
                                        floatBuffer = b60Var.C0;
                                        floatBuffer2 = b60Var.B0;
                                        FloatBuffer floatBuffer3 = b60Var.D0;
                                        if (floatBuffer != null || floatBuffer2 == null) {
                                            FileLog.d("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                                            break;
                                        } else {
                                            b50 b50Var = u50Var.x0;
                                            int i16 = 3553;
                                            int i17 = 36160;
                                            if (b50Var != null) {
                                                GLES20.glBindFramebuffer(36160, b50Var.j[0]);
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, b50Var.k[0], 0);
                                                GLES20.glViewport(0, 0, b50Var.a, b50Var.b);
                                            }
                                            GLES20.glUseProgram(u50Var.m0);
                                            GLES20.glActiveTexture(33984);
                                            GLES20.glVertexAttribPointer(u50Var.p0, 3, 5126, false, 12, (Buffer) floatBuffer2);
                                            GLES20.glEnableVertexAttribArray(u50Var.p0);
                                            GLES20.glVertexAttribPointer(u50Var.q0, 2, 5126, false, 8, (Buffer) floatBuffer);
                                            GLES20.glEnableVertexAttribArray(u50Var.q0);
                                            GLES20.glUniformMatrix4fv(u50Var.n0, 1, false, u50Var.H0.y0, 0);
                                            GLES20.glUniform2f(u50Var.r0, u50Var.d, u50Var.e);
                                            b60 b60Var2 = u50Var.H0;
                                            if (b60Var2.a0[0] != 0 && floatBuffer3 != null && !b60Var2.s0) {
                                                if (!u50Var.n) {
                                                    GLES20.glEnable(3042);
                                                    u50Var.n = true;
                                                }
                                                if (u50Var.H0.G0 != null) {
                                                    GLES20.glUniform2f(u50Var.s0, r2.getWidth(), u50Var.H0.G0.getHeight());
                                                }
                                                GLES20.glVertexAttribPointer(u50Var.q0, 2, 5126, false, 8, (Buffer) floatBuffer3);
                                                GLES20.glUniformMatrix4fv(u50Var.o0, 1, false, u50Var.H0.A0, 0);
                                                GLES20.glUniform1f(u50Var.u0, 1.0f);
                                                GLES20.glBindTexture(36197, u50Var.H0.a0[0]);
                                                GLES20.glDrawArrays(5, 0, 4);
                                            }
                                            b60 b60Var3 = u50Var.H0;
                                            Size[] sizeArr = b60Var3.l0;
                                            if (sizeArr != null) {
                                                int i18 = u50Var.s0;
                                                float width = sizeArr[b60Var3.d1].getWidth();
                                                b60 b60Var4 = u50Var.H0;
                                                GLES20.glUniform2f(i18, width, b60Var4.l0[b60Var4.d1].getHeight());
                                                int i19 = u50Var.t0;
                                                b60 b60Var5 = u50Var.H0;
                                                b60 b60Var6 = u50Var.H0;
                                                GLES20.glUniform2f(i19, (1.0f / b60Var5.l0[b60Var5.d1].getWidth()) / 2.0f, (1.0f / b60Var6.l0[b60Var6.d1].getHeight()) / 2.0f);
                                            }
                                            b60 b60Var7 = u50Var.H0;
                                            int i20 = b60Var7.W[b60Var7.d1];
                                            if (i20 != Integer.MIN_VALUE) {
                                                GLES20.glUniformMatrix4fv(u50Var.o0, 1, false, u50Var.H0.z0, 0);
                                                GLES20.glUniform1f(u50Var.u0, u50Var.H0.b0);
                                                GLES20.glBindTexture(36197, i20);
                                                GLES20.glDrawArrays(5, 0, 4);
                                            }
                                            GLES20.glDisableVertexAttribArray(u50Var.p0);
                                            GLES20.glDisableVertexAttribArray(u50Var.q0);
                                            GLES20.glBindTexture(36197, 0);
                                            GLES20.glUseProgram(0);
                                            b50 b50Var2 = u50Var.x0;
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
                                                if (u50Var.n) {
                                                    GLES20.glEnable(3042);
                                                }
                                            } else {
                                                f7 = 1.0f;
                                            }
                                            EGLExt.eglPresentationTimeANDROID(u50Var.s, u50Var.y, u50Var.R);
                                            EGL14.eglSwapBuffers(u50Var.s, u50Var.y);
                                            if (u50Var.B0 != null && SharedConfig.getDevicePerformanceClass() == 2 && u50Var.C0 % 33 == 0) {
                                                u50Var.B0.postRunnable(new t6(u50Var, 15));
                                            }
                                            u50Var.C0++;
                                            b60 b60Var8 = u50Var.H0;
                                            if (b60Var8.a0[0] != 0) {
                                                float f10 = b60Var8.b0;
                                                if (f10 < f7 && !b60Var8.s0) {
                                                    float f11 = (j10 / 2.0E8f) + f10;
                                                    b60Var8.b0 = f11;
                                                    if (f11 > f7) {
                                                        GLES20.glDisable(3042);
                                                        u50Var.n = false;
                                                        b60 b60Var9 = u50Var.H0;
                                                        b60Var9.b0 = 1.0f;
                                                        GLES20.glDeleteTextures(1, b60Var9.a0, 0);
                                                        b60 b60Var10 = u50Var.H0;
                                                        b60Var10.a0[0] = 0;
                                                        if (!b60Var10.I) {
                                                            u50Var.H0.I = true;
                                                            AndroidUtilities.runOnUIThread(new q50(u50Var, 6));
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!b60Var8.I) {
                                                u50Var.H0.I = true;
                                                AndroidUtilities.runOnUIThread(new q50(u50Var, 7));
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (u50Var.R != 0 && !u50Var.Q) {
                                    j3 = j16 - u50Var.S;
                                    c10 = 3;
                                    long currentTimeMillis = (System.currentTimeMillis() - u50Var.O) * 1000000;
                                    if (j3 < 0 || Math.abs(currentTimeMillis - j3) > 100000000) {
                                        j3 = currentTimeMillis;
                                    }
                                    break;
                                } else {
                                    c10 = 3;
                                }
                                j3 = 0;
                                u50Var.S = j16;
                                j10 = 0;
                                u50Var.Q = false;
                                u50Var.O = System.currentTimeMillis();
                                if (!u50Var.a0) {
                                }
                                u50Var.R += j3;
                                if (u50Var.c0 == -1) {
                                }
                                u50Var.e0 = j16 - u50Var.d0;
                                u50Var.d0 = j16;
                                b60 b60Var11 = u50Var.H0;
                                floatBuffer = b60Var11.C0;
                                floatBuffer2 = b60Var11.B0;
                                FloatBuffer floatBuffer32 = b60Var11.D0;
                                if (floatBuffer != null) {
                                }
                                FileLog.d("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                            }
                        } else if (i15 == 3) {
                            j50 j50Var = (j50) message.obj;
                            if (!u50Var.D0 && !u50Var.l0) {
                                u50Var.L.add(j50Var);
                                if (u50Var.h0 == -1) {
                                    if (u50Var.c0 == -1) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("InstantCamera video record not yet started");
                                            break;
                                        }
                                    } else {
                                        while (true) {
                                            int i34 = 0;
                                            while (i34 < j50Var.d) {
                                                if (i34 != 0 || Math.abs(u50Var.c0 - j50Var.b[i34]) <= 10000000) {
                                                    j11 = j15;
                                                    long j20 = j50Var.b[i34];
                                                    if (j20 >= u50Var.c0) {
                                                        j50Var.e = i34;
                                                        u50Var.h0 = j20;
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            org.telegram.messenger.q.s(k0.j(i34, "InstantCamera found first audio frame at ", " timestamp = "), j50Var.b[i34]);
                                                        }
                                                    } else {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            org.telegram.messenger.q.s(k0.j(i34, "InstantCamera ignore first audio frame at ", " timestamp = "), j50Var.b[i34]);
                                                        }
                                                        i34++;
                                                        j15 = j11;
                                                    }
                                                } else {
                                                    long j21 = u50Var.c0;
                                                    j11 = j15;
                                                    long j22 = j50Var.b[i34];
                                                    u50Var.b0 = j21 - j22;
                                                    u50Var.h0 = j22;
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        org.telegram.messenger.q.s(new StringBuilder("InstantCamera detected desync between audio and video "), u50Var.b0);
                                                    }
                                                }
                                            }
                                            long j23 = j15;
                                            if (BuildVars.LOGS_ENABLED) {
                                                org.telegram.messenger.q.o(j50Var.d, new StringBuilder("InstantCamera first audio frame not found, removing buffers "));
                                            }
                                            u50Var.L.remove(j50Var);
                                            if (u50Var.L.isEmpty()) {
                                                break;
                                            } else {
                                                j50Var = (j50) u50Var.L.get(0);
                                                j15 = j23;
                                            }
                                        }
                                    }
                                } else {
                                    j11 = -1;
                                }
                                if (u50Var.P == j11) {
                                    u50Var.P = j50Var.b[j50Var.e];
                                }
                                if (u50Var.L.size() > 1) {
                                    j50Var = (j50) u50Var.L.get(0);
                                }
                                j50 j50Var2 = j50Var;
                                try {
                                    u50Var.e(false);
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                                boolean z11 = false;
                                while (j50Var2 != null) {
                                    try {
                                        int dequeueInputBuffer = u50Var.F.dequeueInputBuffer(j14);
                                        if (dequeueInputBuffer >= 0) {
                                            ByteBuffer inputBuffer = u50Var.F.getInputBuffer(dequeueInputBuffer);
                                            long[] jArr = j50Var2.b;
                                            int i35 = j50Var2.e;
                                            long j24 = jArr[i35];
                                            while (true) {
                                                int i36 = j50Var2.d;
                                                if (i35 <= i36) {
                                                    if (i35 < i36) {
                                                        j12 = j14;
                                                        long j25 = j50Var2.b[i35] - u50Var.P;
                                                        if (u50Var.W) {
                                                            j13 = j24;
                                                        } else {
                                                            j13 = j24;
                                                            if (j50Var2.b[i35] >= u50Var.d0 - u50Var.b0 || j25 >= 60000000) {
                                                            }
                                                        }
                                                        if (inputBuffer.remaining() < j50Var2.c[i35]) {
                                                            j50Var2.e = i35;
                                                            break;
                                                        } else {
                                                            inputBuffer.put(j50Var2.a[i35]);
                                                        }
                                                    } else {
                                                        j12 = j14;
                                                        j13 = j24;
                                                    }
                                                    if (i35 >= j50Var2.d - 1) {
                                                        u50Var.L.remove(j50Var2);
                                                        if (u50Var.W) {
                                                            u50Var.z0.put(j50Var2);
                                                        }
                                                        if (u50Var.L.isEmpty()) {
                                                            z11 = j50Var2.f;
                                                            break;
                                                        } else {
                                                            j50Var2 = (j50) u50Var.L.get(0);
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
                                            long j26 = j13 == j12 ? j12 : j13 - u50Var.P;
                                            long j27 = u50Var.k0;
                                            if (j27 >= j12) {
                                                j26 += j27;
                                            }
                                            long j28 = j26;
                                            u50Var.j0 = j28 - u50Var.i0;
                                            u50Var.i0 = j28;
                                            u50Var.F.queueInputBuffer(dequeueInputBuffer, 0, inputBuffer.position(), j28, z11 ? 4 : 0);
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
                            u50Var.D0 = true;
                            File file = u50Var.H0.e0;
                            if (file != null) {
                                file.delete();
                                u50Var.H0.e0 = null;
                            }
                            b60 b60Var12 = u50Var.H0;
                            b60Var12.e0 = o8.x(b60Var12.d, true);
                            try {
                                FileLog.d("InstantCamera handlePauseRecording drain encoders");
                                u50Var.e(false);
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            MP4Builder mP4Builder = u50Var.K;
                            if (mP4Builder != null) {
                                try {
                                    mP4Builder.finishMovie(u50Var.H0.e0);
                                } catch (Exception e12) {
                                    FileLog.e(e12);
                                }
                            }
                            AndroidUtilities.runOnUIThread(new q50(u50Var, i13));
                            break;
                        } else if (i15 == 5) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera resume encoder");
                            }
                            u50Var.D0 = false;
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
