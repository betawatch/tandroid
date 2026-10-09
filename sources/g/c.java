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
import ci.l8;
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
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.q50;
import org.telegram.ui.Components.r50;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.t50;
import org.telegram.ui.Components.t60;
import p4.m0;
import p4.n0;
import p4.o0;
import p4.p0;
import p4.r0;
import p4.s0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        long j3;
        boolean z12;
        long j10;
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
        long j11;
        long j12;
        long j13;
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
                l60 l60Var = (l60) this.b.get();
                if (l60Var != null) {
                    if (i17 == 0) {
                        try {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera start encoder");
                            }
                            l60.a(l60Var, message.arg1 == 1);
                            break;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            l60.b(l60Var, 0, null);
                            Looper.myLooper().quit();
                            return;
                        }
                    } else if (i17 == 1) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("InstantCamera stop encoder");
                        }
                        l60.b(l60Var, message.arg1, (h60) message.obj);
                        break;
                    } else {
                        int i18 = 5;
                        long j14 = 0;
                        long j15 = -1;
                        if (i17 == 2) {
                            long j16 = (message.arg1 << 32) | (message.arg2 & 4294967295L);
                            Integer num = (Integer) message.obj;
                            if (!l60Var.D0 && l60Var.H0.W) {
                                try {
                                    l60Var.e(false);
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                                if (l60Var.w0.equals(num)) {
                                    z10 = false;
                                } else {
                                    l60Var.w0 = num;
                                    z10 = true;
                                }
                                long j17 = l60Var.g0;
                                if (j17 >= 0) {
                                    if (l60Var.f0 == -1) {
                                        l60Var.f0 = j16 - j17;
                                    }
                                    j16 -= l60Var.f0;
                                }
                                if (!z10) {
                                    long j18 = l60Var.S;
                                    if (j18 != -1) {
                                        j3 = j16 - j18;
                                        l60Var.S = j16;
                                        j10 = j3;
                                        z13 = 3;
                                        l60Var.Q = false;
                                        l60Var.O = System.currentTimeMillis();
                                        if (!l60Var.a0) {
                                            long j19 = l60Var.Z + j3;
                                            l60Var.Z = j19;
                                            if (j19 >= 200000000) {
                                                l60Var.a0 = true;
                                            }
                                        }
                                        l60Var.R += j3;
                                        if (l60Var.c0 == -1) {
                                            l60Var.c0 = j16 / 1000;
                                            if (BuildVars.LOGS_ENABLED) {
                                                org.telegram.messenger.q.r(new StringBuilder("InstantCamera first video frame was at "), l60Var.c0);
                                            }
                                        }
                                        l60Var.e0 = j16 - l60Var.d0;
                                        l60Var.d0 = j16;
                                        t60 t60Var = l60Var.H0;
                                        floatBuffer = t60Var.J0;
                                        floatBuffer2 = t60Var.I0;
                                        FloatBuffer floatBuffer3 = t60Var.K0;
                                        if (floatBuffer != null || floatBuffer2 == null) {
                                            FileLog.d("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                                            break;
                                        } else {
                                            t50 t50Var = l60Var.x0;
                                            int i19 = 3553;
                                            if (t50Var != null) {
                                                r43 = z13;
                                                GLES20.glBindFramebuffer(36160, t50Var.j[0]);
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, t50Var.k[0], 0);
                                                GLES20.glViewport(0, 0, t50Var.a, t50Var.b);
                                            } else {
                                                r43 = z13;
                                            }
                                            GLES20.glUseProgram(l60Var.m0);
                                            GLES20.glActiveTexture(33984);
                                            GLES20.glVertexAttribPointer(l60Var.p0, 3, 5126, false, 12, (Buffer) floatBuffer2);
                                            GLES20.glEnableVertexAttribArray(l60Var.p0);
                                            GLES20.glVertexAttribPointer(l60Var.q0, 2, 5126, false, 8, (Buffer) floatBuffer);
                                            GLES20.glEnableVertexAttribArray(l60Var.q0);
                                            GLES20.glUniformMatrix4fv(l60Var.n0, 1, false, l60Var.H0.F0, 0);
                                            GLES20.glUniform2f(l60Var.r0, l60Var.d, l60Var.e);
                                            t60 t60Var2 = l60Var.H0;
                                            if (t60Var2.c0[0] == 0 || floatBuffer3 == null || t60Var2.u0) {
                                                i10 = 33984;
                                                i11 = 36197;
                                                f7 = 1.0f;
                                            } else {
                                                if (!l60Var.n) {
                                                    GLES20.glEnable(3042);
                                                    l60Var.n = true;
                                                }
                                                if (l60Var.H0.N0 != null) {
                                                    i10 = 33984;
                                                    GLES20.glUniform2f(l60Var.s0, r4.getWidth(), l60Var.H0.N0.getHeight());
                                                } else {
                                                    i10 = 33984;
                                                }
                                                i11 = 36197;
                                                f7 = 1.0f;
                                                GLES20.glVertexAttribPointer(l60Var.q0, 2, 5126, false, 8, (Buffer) floatBuffer3);
                                                GLES20.glUniformMatrix4fv(l60Var.o0, 1, false, l60Var.H0.H0, 0);
                                                GLES20.glUniform1f(l60Var.u0, 1.0f);
                                                GLES20.glBindTexture(36197, l60Var.H0.c0[0]);
                                                GLES20.glDrawArrays(5, 0, 4);
                                            }
                                            t60 t60Var3 = l60Var.H0;
                                            Size[] sizeArr = t60Var3.n0;
                                            if (sizeArr != null) {
                                                int i20 = l60Var.s0;
                                                float width = sizeArr[t60Var3.k1].getWidth();
                                                t60 t60Var4 = l60Var.H0;
                                                f10 = 2.0f;
                                                GLES20.glUniform2f(i20, width, t60Var4.n0[t60Var4.k1].getHeight());
                                                int i21 = l60Var.t0;
                                                t60 t60Var5 = l60Var.H0;
                                                float width2 = (f7 / t60Var5.n0[t60Var5.k1].getWidth()) / 2.0f;
                                                t60 t60Var6 = l60Var.H0;
                                                GLES20.glUniform2f(i21, width2, (f7 / t60Var6.n0[t60Var6.k1].getHeight()) / 2.0f);
                                            } else {
                                                f10 = 2.0f;
                                            }
                                            t60 t60Var7 = l60Var.H0;
                                            int i22 = t60Var7.b0[t60Var7.k1];
                                            if (i22 != Integer.MIN_VALUE) {
                                                i12 = 0;
                                                GLES20.glUniformMatrix4fv(l60Var.o0, 1, false, l60Var.H0.G0, 0);
                                                GLES20.glUniform1f(l60Var.u0, l60Var.H0.d0);
                                                GLES20.glBindTexture(i11, i22);
                                                GLES20.glDrawArrays(5, 0, 4);
                                            } else {
                                                i12 = 0;
                                            }
                                            GLES20.glDisableVertexAttribArray(l60Var.p0);
                                            GLES20.glDisableVertexAttribArray(l60Var.q0);
                                            GLES20.glBindTexture(i11, i12);
                                            GLES20.glUseProgram(i12);
                                            t50 t50Var2 = l60Var.x0;
                                            if (t50Var2 != null) {
                                                GLES20.glDisable(3042);
                                                s50 s50Var = t50Var2.c;
                                                int[] iArr = t50Var2.k;
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], i12);
                                                GLES20.glViewport(i12, i12, 48, 48);
                                                f11 = f7;
                                                GLES20.glUseProgram(s50Var.a);
                                                int i23 = s50Var.d;
                                                FloatBuffer floatBuffer4 = t50Var2.g;
                                                GLES20.glVertexAttribPointer(i23, 3, 5126, false, 12, floatBuffer4.position(i12));
                                                int i24 = s50Var.d;
                                                GLES20.glEnableVertexAttribArray(i24);
                                                int i25 = s50Var.e;
                                                FloatBuffer floatBuffer5 = t50Var2.h;
                                                GLES20.glVertexAttribPointer(i25, 2, 5126, false, 8, floatBuffer5.position(i12));
                                                int i26 = s50Var.e;
                                                GLES20.glEnableVertexAttribArray(i26);
                                                GLES20.glActiveTexture(i10);
                                                GLES20.glBindTexture(3553, iArr[i12]);
                                                GLES20.glUniform1i(s50Var.f, i12);
                                                GLES20.glDrawArrays(5, i12, 4);
                                                GLES20.glBindTexture(3553, i12);
                                                GLES20.glDisableVertexAttribArray(i26);
                                                GLES20.glDisableVertexAttribArray(i24);
                                                GLES20.glUseProgram(i12);
                                                int i27 = i12;
                                                for (int i28 = 2; i27 < i28; i28 = 2) {
                                                    q50 q50Var = t50Var2.e;
                                                    GLES20.glFramebufferTexture2D(36160, 36064, i19, iArr[i27 == 0 ? i28 : 1], i12);
                                                    GLES20.glViewport(i12, i12, 48, 48);
                                                    int i29 = q50Var.a;
                                                    int i30 = q50Var.e;
                                                    int i31 = q50Var.d;
                                                    GLES20.glUseProgram(i29);
                                                    GLES20.glVertexAttribPointer(q50Var.d, 3, 5126, false, 12, floatBuffer4.position(i12));
                                                    GLES20.glEnableVertexAttribArray(i31);
                                                    GLES20.glVertexAttribPointer(q50Var.e, 2, 5126, false, 8, floatBuffer5.position(i12));
                                                    GLES20.glEnableVertexAttribArray(i30);
                                                    GLES20.glActiveTexture(i10);
                                                    GLES20.glBindTexture(i19, iArr[i27 == 0 ? (char) 1 : (char) 2]);
                                                    i12 = 0;
                                                    GLES20.glUniform1i(q50Var.f, 0);
                                                    GLES20.glUniform2f(q50Var.g, i27 == 0 ? 0.020833334f : 0.0f, i27 == 1 ? 0.020833334f : 0.0f);
                                                    GLES20.glDrawArrays(5, 0, 4);
                                                    GLES20.glBindTexture(3553, 0);
                                                    GLES20.glDisableVertexAttribArray(i30);
                                                    GLES20.glDisableVertexAttribArray(i31);
                                                    GLES20.glUseProgram(0);
                                                    i27++;
                                                    i19 = 3553;
                                                }
                                                r50 r50Var = t50Var2.f;
                                                GLES20.glBindFramebuffer(36160, i12);
                                                GLES20.glFramebufferTexture2D(36160, 36064, i19, iArr[1], i12);
                                                GLES20.glViewport(i12, i12, t50Var2.a, t50Var2.b);
                                                GLES20.glUseProgram(r50Var.a);
                                                GLES20.glVertexAttribPointer(r50Var.d, 3, 5126, false, 12, floatBuffer4.position(i12));
                                                GLES20.glEnableVertexAttribArray(r50Var.d);
                                                GLES20.glVertexAttribPointer(r50Var.e, 2, 5126, false, 8, floatBuffer5.position(i12));
                                                GLES20.glEnableVertexAttribArray(r50Var.e);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, iArr[1]);
                                                GLES20.glActiveTexture(i10);
                                                GLES20.glBindTexture(3553, iArr[0]);
                                                GLES20.glUniform1i(r50Var.f, 0);
                                                GLES20.glUniform1i(r50Var.g, 1);
                                                GLES20.glUniform2f(r50Var.h, t50Var2.a / f10, t50Var2.b / f10);
                                                GLES20.glDrawArrays(5, 0, 4);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glActiveTexture(i10);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glDisableVertexAttribArray(r50Var.e);
                                                GLES20.glDisableVertexAttribArray(r50Var.d);
                                                GLES20.glUseProgram(0);
                                                s50 s50Var2 = t50Var2.d;
                                                GLES20.glEnable(3042);
                                                int i32 = s50Var2.a;
                                                int i33 = s50Var2.e;
                                                int i34 = s50Var2.d;
                                                GLES20.glUseProgram(i32);
                                                GLES20.glActiveTexture(i10);
                                                for (int i35 = 0; i35 < 2; i35++) {
                                                    if (i35 == 0) {
                                                        GLES20.glVertexAttribPointer(s50Var2.d, 3, 5126, false, 12, floatBuffer4.position(12));
                                                        GLES20.glEnableVertexAttribArray(i34);
                                                        GLES20.glVertexAttribPointer(s50Var2.e, 2, 5126, false, 8, floatBuffer5.position(8));
                                                        GLES20.glEnableVertexAttribArray(i33);
                                                        GLES20.glBindTexture(3553, iArr[r43]);
                                                        i13 = 4;
                                                    } else {
                                                        int i36 = t50Var2.i;
                                                        t50Var2.i = i36 + 1;
                                                        GLES20.glVertexAttribPointer(s50Var2.d, 3, 5126, false, 12, floatBuffer4.position(24));
                                                        GLES20.glEnableVertexAttribArray(i34);
                                                        GLES20.glVertexAttribPointer(s50Var2.e, 2, 5126, false, 8, floatBuffer5.position(((i36 % 27) * 8) + 16));
                                                        GLES20.glEnableVertexAttribArray(i33);
                                                        i13 = 4;
                                                        GLES20.glBindTexture(3553, iArr[4]);
                                                    }
                                                    GLES20.glUniform1i(s50Var2.f, 0);
                                                    GLES20.glDrawArrays(5, 0, i13);
                                                    GLES20.glBindTexture(3553, 0);
                                                    GLES20.glDisableVertexAttribArray(i33);
                                                    GLES20.glDisableVertexAttribArray(i34);
                                                }
                                                GLES20.glUseProgram(0);
                                                GLES20.glDisable(3042);
                                                if (l60Var.n) {
                                                    GLES20.glEnable(3042);
                                                }
                                            } else {
                                                f11 = f7;
                                            }
                                            EGLExt.eglPresentationTimeANDROID(l60Var.s, l60Var.y, l60Var.R);
                                            EGL14.eglSwapBuffers(l60Var.s, l60Var.y);
                                            if (l60Var.B0 != null && SharedConfig.getDevicePerformanceClass() == 2 && l60Var.C0 % 33 == 0) {
                                                l60Var.B0.postRunnable(new t6(l60Var, 14));
                                            }
                                            l60Var.C0++;
                                            t60 t60Var8 = l60Var.H0;
                                            if (t60Var8.c0[0] != 0) {
                                                float f12 = t60Var8.d0;
                                                if (f12 < f11 && !t60Var8.u0) {
                                                    float f13 = (j10 / 2.0E8f) + f12;
                                                    t60Var8.d0 = f13;
                                                    if (f13 > f11) {
                                                        GLES20.glDisable(3042);
                                                        l60Var.n = false;
                                                        t60 t60Var9 = l60Var.H0;
                                                        t60Var9.d0 = f11;
                                                        GLES20.glDeleteTextures(1, t60Var9.c0, 0);
                                                        t60 t60Var10 = l60Var.H0;
                                                        t60Var10.c0[0] = 0;
                                                        if (!t60Var10.K) {
                                                            l60Var.H0.K = true;
                                                            AndroidUtilities.runOnUIThread(new i60(l60Var, 4));
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!t60Var8.K) {
                                                l60Var.H0.K = true;
                                                AndroidUtilities.runOnUIThread(new i60(l60Var, i18));
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (l60Var.R != 0 && !l60Var.Q) {
                                    j3 = j16 - l60Var.S;
                                    boolean z14 = 3;
                                    long currentTimeMillis = (System.currentTimeMillis() - l60Var.O) * 1000000;
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
                                l60Var.S = j16;
                                j10 = 0;
                                z13 = z12;
                                l60Var.Q = false;
                                l60Var.O = System.currentTimeMillis();
                                if (!l60Var.a0) {
                                }
                                l60Var.R += j3;
                                if (l60Var.c0 == -1) {
                                }
                                l60Var.e0 = j16 - l60Var.d0;
                                l60Var.d0 = j16;
                                t60 t60Var11 = l60Var.H0;
                                floatBuffer = t60Var11.J0;
                                floatBuffer2 = t60Var11.I0;
                                FloatBuffer floatBuffer32 = t60Var11.K0;
                                if (floatBuffer != null) {
                                }
                                FileLog.d("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                            }
                        } else if (i17 == 3) {
                            b60 b60Var = (b60) message.obj;
                            if (!l60Var.D0 && !l60Var.l0) {
                                l60Var.L.add(b60Var);
                                if (l60Var.h0 == -1) {
                                    if (l60Var.c0 == -1) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("InstantCamera video record not yet started");
                                            break;
                                        }
                                    } else {
                                        while (true) {
                                            int i37 = 0;
                                            while (i37 < b60Var.d) {
                                                if (i37 != 0 || Math.abs(l60Var.c0 - b60Var.b[i37]) <= 10000000) {
                                                    long j20 = b60Var.b[i37];
                                                    j11 = j15;
                                                    if (j20 >= l60Var.c0) {
                                                        b60Var.e = i37;
                                                        l60Var.h0 = j20;
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            org.telegram.messenger.q.r(hg.c.j(i37, "InstantCamera found first audio frame at ", " timestamp = "), b60Var.b[i37]);
                                                        }
                                                    } else {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            org.telegram.messenger.q.r(hg.c.j(i37, "InstantCamera ignore first audio frame at ", " timestamp = "), b60Var.b[i37]);
                                                        }
                                                        i37++;
                                                        j15 = j11;
                                                    }
                                                } else {
                                                    long j21 = l60Var.c0;
                                                    long j22 = b60Var.b[i37];
                                                    l60Var.b0 = j21 - j22;
                                                    l60Var.h0 = j22;
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        org.telegram.messenger.q.r(new StringBuilder("InstantCamera detected desync between audio and video "), l60Var.b0);
                                                    }
                                                }
                                            }
                                            long j23 = j15;
                                            if (BuildVars.LOGS_ENABLED) {
                                                org.telegram.messenger.q.o(b60Var.d, new StringBuilder("InstantCamera first audio frame not found, removing buffers "));
                                            }
                                            l60Var.L.remove(b60Var);
                                            if (l60Var.L.isEmpty()) {
                                                break;
                                            } else {
                                                b60Var = (b60) l60Var.L.get(0);
                                                j15 = j23;
                                            }
                                        }
                                    }
                                }
                                j11 = j15;
                                if (l60Var.P == j11) {
                                    l60Var.P = b60Var.b[b60Var.e];
                                }
                                if (l60Var.L.size() > 1) {
                                    b60Var = (b60) l60Var.L.get(0);
                                }
                                b60 b60Var2 = b60Var;
                                try {
                                    l60Var.e(false);
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                }
                                boolean z15 = false;
                                while (b60Var2 != null) {
                                    try {
                                        int dequeueInputBuffer = l60Var.F.dequeueInputBuffer(j14);
                                        if (dequeueInputBuffer >= 0) {
                                            ByteBuffer inputBuffer = l60Var.F.getInputBuffer(dequeueInputBuffer);
                                            long[] jArr = b60Var2.b;
                                            int i38 = b60Var2.e;
                                            long j24 = jArr[i38];
                                            while (true) {
                                                int i39 = b60Var2.d;
                                                if (i38 <= i39) {
                                                    if (i38 < i39) {
                                                        j12 = j14;
                                                        j13 = b60Var2.b[i38] - l60Var.P;
                                                        if (l60Var.W || (b60Var2.b[i38] < l60Var.d0 - l60Var.b0 && j13 < 60000000)) {
                                                            if (inputBuffer.remaining() < b60Var2.c[i38]) {
                                                                b60Var2.e = i38;
                                                            } else {
                                                                inputBuffer.put(b60Var2.a[i38]);
                                                            }
                                                        }
                                                    } else {
                                                        j12 = j14;
                                                    }
                                                    if (i38 >= b60Var2.d - 1) {
                                                        l60Var.L.remove(b60Var2);
                                                        if (l60Var.W) {
                                                            l60Var.z0.put(b60Var2);
                                                        }
                                                        if (l60Var.L.isEmpty()) {
                                                            z15 = b60Var2.f;
                                                        } else {
                                                            b60Var2 = (b60) l60Var.L.get(0);
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
                                                    FileLog.d("InstantCamera stop audio encoding because of stoped video recording at " + b60Var2.b[i38] + " last video " + l60Var.d0);
                                                }
                                            }
                                            l60Var.l0 = true;
                                            l60Var.L.clear();
                                            z15 = true;
                                            b60Var2 = null;
                                            long j25 = j24 == j12 ? j12 : j24 - l60Var.P;
                                            long j26 = l60Var.k0;
                                            if (j26 >= j12) {
                                                j25 += j26;
                                            }
                                            l60Var.j0 = j25 - l60Var.i0;
                                            l60Var.i0 = j25;
                                            l60Var.F.queueInputBuffer(dequeueInputBuffer, 0, inputBuffer.position(), j25, z15 ? 4 : 0);
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
                        } else if (i17 == 4) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera pause encoder");
                            }
                            l60Var.D0 = true;
                            File file = l60Var.H0.g0;
                            if (file != null) {
                                file.delete();
                                l60Var.H0.g0 = null;
                            }
                            t60 t60Var12 = l60Var.H0;
                            t60Var12.g0 = l8.x(t60Var12.f, true);
                            try {
                                FileLog.d("InstantCamera handlePauseRecording drain encoders");
                                l60Var.e(false);
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                            MP4Builder mP4Builder = l60Var.K;
                            if (mP4Builder != null) {
                                try {
                                    mP4Builder.finishMovie(l60Var.H0.g0);
                                } catch (Exception e13) {
                                    FileLog.e(e13);
                                }
                            }
                            AndroidUtilities.runOnUIThread(new i60(l60Var, i15));
                            break;
                        } else if (i17 == 5) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera resume encoder");
                            }
                            l60Var.D0 = false;
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
                                m4.w wVar = r0Var.F;
                                if (wVar != null && (n0Var instanceof p4.q)) {
                                    p4.q qVar = (p4.q) n0Var;
                                    p4.e eVar = (p4.e) ((s0) wVar.b).c;
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
