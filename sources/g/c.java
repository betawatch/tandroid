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
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.camera.Size;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.tz;
import org.telegram.messenger.v2;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.f40;
import org.telegram.ui.Components.g40;
import org.telegram.ui.Components.h40;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.u40;
import org.telegram.ui.Components.v40;
import org.telegram.ui.Components.x40;
import p4.n0;
import p4.o0;
import p4.p0;
import p4.q0;
import p4.s0;
import p4.t0;
import vh.n5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c extends Handler {
    public final /* synthetic */ int a;
    public WeakReference b;

    public /* synthetic */ c(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:176|(2:178|(2:180|(1:182))(11:(7:185|(2:(2:195|(3:203|204|(1:206))(3:197|(2:199|200)(1:202)|201))(3:191|192|(1:194))|186)|288|289|(1:291)|292|(1:294)(1:295))|207|(1:209)|210|(1:212)|213|214|215|216|(4:218|219|(11:221|(2:222|(4:(2:225|(2:255|(2:271|272)(1:257)))(1:273)|258|(4:260|(1:262)|263|(2:265|266)(2:268|269))(1:270)|267)(2:274|275))|239|240|(1:242)(1:253)|243|(1:245)|246|(1:248)(1:252)|249|250)(2:276|277)|251)|283))|297|207|(0)|210|(0)|213|214|215|216|(0)|283) */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x039b, code lost:
    
        if (org.telegram.messenger.v2.a == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x039f, code lost:
    
        if (r17 < 60000000) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x03a1, code lost:
    
        org.telegram.messenger.f8.b("InstantCamera stop audio encoding because recorded time more than 60s");
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x03aa, code lost:
    
        org.telegram.messenger.f8.b("InstantCamera stop audio encoding because of stoped video recording at " + r2.b[r10] + " last video " + r7.d0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x03cc, code lost:
    
        r7.l0 = true;
        r7.L.clear();
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0356, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0357, code lost:
    
        org.telegram.messenger.f8.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x04e8, code lost:
    
        if (r11 < 0) goto L291;
     */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x035d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x051a  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        boolean z10;
        int i10;
        long j10;
        long j11;
        FloatBuffer floatBuffer;
        FloatBuffer floatBuffer2;
        int i11;
        int i12;
        float f7;
        int i13;
        float f10;
        int i14;
        long j12;
        o40 o40Var;
        long j13;
        p4.o oVar;
        int i15 = 2;
        o0 o0Var = null;
        o0 o0Var2 = null;
        int i16 = 0;
        int i17 = 1;
        switch (this.a) {
            case 0:
                int i18 = message.what;
                if (i18 == -3 || i18 == -2 || i18 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.b.get(), message.what);
                    break;
                } else if (i18 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            case 1:
                int i19 = message.what;
                x40 x40Var = (x40) this.b.get();
                if (x40Var != null) {
                    if (i19 == 0) {
                        try {
                            if (v2.a) {
                                f8.d("InstantCamera start encoder");
                            }
                            x40.a(x40Var, message.arg1 == 1);
                            break;
                        } catch (Exception e) {
                            f8.g(e, true);
                            x40.b(x40Var, 0, null);
                            Looper.myLooper().quit();
                            return;
                        }
                    } else if (i19 == 1) {
                        if (v2.a) {
                            f8.d("InstantCamera stop encoder");
                        }
                        x40.b(x40Var, message.arg1, (u40) message.obj);
                        break;
                    } else {
                        long j14 = 0;
                        long j15 = -1;
                        if (i19 == 2) {
                            long j16 = (message.arg1 << 32) | (message.arg2 & 4294967295L);
                            Integer num = (Integer) message.obj;
                            if (!x40Var.D0 && x40Var.H0.V) {
                                try {
                                    x40Var.d(false);
                                } catch (Exception e7) {
                                    f8.g(e7, true);
                                }
                                if (x40Var.w0.equals(num)) {
                                    z10 = false;
                                } else {
                                    x40Var.w0 = num;
                                    z10 = true;
                                }
                                long j17 = x40Var.g0;
                                if (j17 >= 0) {
                                    if (x40Var.f0 == -1) {
                                        x40Var.f0 = j16 - j17;
                                    }
                                    j16 -= x40Var.f0;
                                }
                                if (!z10) {
                                    long j18 = x40Var.S;
                                    if (j18 != -1) {
                                        j10 = j16 - j18;
                                        x40Var.S = j16;
                                        i10 = 3;
                                        j11 = j10;
                                        x40Var.Q = false;
                                        x40Var.O = System.currentTimeMillis();
                                        if (!x40Var.a0) {
                                            long j19 = x40Var.Z + j10;
                                            x40Var.Z = j19;
                                            if (j19 >= 200000000) {
                                                x40Var.a0 = true;
                                            }
                                        }
                                        x40Var.R += j10;
                                        if (x40Var.c0 == -1) {
                                            x40Var.c0 = j16 / 1000;
                                            if (v2.a) {
                                                i0.a.q(x40Var.c0, new StringBuilder("InstantCamera first video frame was at "));
                                            }
                                        }
                                        x40Var.e0 = j16 - x40Var.d0;
                                        x40Var.d0 = j16;
                                        e50 e50Var = x40Var.H0;
                                        floatBuffer = e50Var.I0;
                                        floatBuffer2 = e50Var.H0;
                                        FloatBuffer floatBuffer3 = e50Var.J0;
                                        if (floatBuffer != null || floatBuffer2 == null) {
                                            f8.b("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                                            break;
                                        } else {
                                            h40 h40Var = x40Var.x0;
                                            if (h40Var != null) {
                                                i11 = i10;
                                                GLES20.glBindFramebuffer(36160, h40Var.j[0]);
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, h40Var.k[0], 0);
                                                GLES20.glViewport(0, 0, h40Var.a, h40Var.b);
                                            } else {
                                                i11 = i10;
                                            }
                                            GLES20.glUseProgram(x40Var.m0);
                                            GLES20.glActiveTexture(33984);
                                            int i20 = 36160;
                                            GLES20.glVertexAttribPointer(x40Var.p0, 3, 5126, false, 12, (Buffer) floatBuffer2);
                                            GLES20.glEnableVertexAttribArray(x40Var.p0);
                                            GLES20.glVertexAttribPointer(x40Var.q0, 2, 5126, false, 8, (Buffer) floatBuffer);
                                            GLES20.glEnableVertexAttribArray(x40Var.q0);
                                            GLES20.glUniformMatrix4fv(x40Var.n0, 1, false, x40Var.H0.E0, 0);
                                            GLES20.glUniform2f(x40Var.r0, x40Var.d, x40Var.e);
                                            e50 e50Var2 = x40Var.H0;
                                            if (e50Var2.b0[0] == 0 || floatBuffer3 == null || e50Var2.t0) {
                                                i12 = 36197;
                                                f7 = 1.0f;
                                            } else {
                                                if (!x40Var.n) {
                                                    GLES20.glEnable(3042);
                                                    x40Var.n = true;
                                                }
                                                if (x40Var.H0.M0 != null) {
                                                    GLES20.glUniform2f(x40Var.s0, r4.getWidth(), x40Var.H0.M0.getHeight());
                                                }
                                                i12 = 36197;
                                                f7 = 1.0f;
                                                GLES20.glVertexAttribPointer(x40Var.q0, 2, 5126, false, 8, (Buffer) floatBuffer3);
                                                GLES20.glUniformMatrix4fv(x40Var.o0, 1, false, x40Var.H0.G0, 0);
                                                GLES20.glUniform1f(x40Var.u0, 1.0f);
                                                GLES20.glBindTexture(36197, x40Var.H0.b0[0]);
                                                GLES20.glDrawArrays(5, 0, 4);
                                            }
                                            e50 e50Var3 = x40Var.H0;
                                            Size[] sizeArr = e50Var3.m0;
                                            if (sizeArr != null) {
                                                int i21 = x40Var.s0;
                                                float width = sizeArr[e50Var3.j1].getWidth();
                                                e50 e50Var4 = x40Var.H0;
                                                GLES20.glUniform2f(i21, width, e50Var4.m0[e50Var4.j1].getHeight());
                                                int i22 = x40Var.t0;
                                                e50 e50Var5 = x40Var.H0;
                                                e50 e50Var6 = x40Var.H0;
                                                GLES20.glUniform2f(i22, (f7 / e50Var5.m0[e50Var5.j1].getWidth()) / 2.0f, (f7 / e50Var6.m0[e50Var6.j1].getHeight()) / 2.0f);
                                            }
                                            e50 e50Var7 = x40Var.H0;
                                            int i23 = e50Var7.a0[e50Var7.j1];
                                            if (i23 != Integer.MIN_VALUE) {
                                                i13 = 0;
                                                GLES20.glUniformMatrix4fv(x40Var.o0, 1, false, x40Var.H0.F0, 0);
                                                GLES20.glUniform1f(x40Var.u0, x40Var.H0.c0);
                                                GLES20.glBindTexture(i12, i23);
                                                GLES20.glDrawArrays(5, 0, 4);
                                            } else {
                                                i13 = 0;
                                            }
                                            GLES20.glDisableVertexAttribArray(x40Var.p0);
                                            GLES20.glDisableVertexAttribArray(x40Var.q0);
                                            GLES20.glBindTexture(i12, i13);
                                            GLES20.glUseProgram(i13);
                                            h40 h40Var2 = x40Var.x0;
                                            if (h40Var2 != null) {
                                                GLES20.glDisable(3042);
                                                b4.b bVar = h40Var2.c;
                                                int[] iArr = h40Var2.k;
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], i13);
                                                GLES20.glViewport(i13, i13, 48, 48);
                                                GLES20.glUseProgram(bVar.a);
                                                int i24 = bVar.d;
                                                f10 = f7;
                                                FloatBuffer floatBuffer4 = h40Var2.g;
                                                GLES20.glVertexAttribPointer(i24, 3, 5126, false, 12, floatBuffer4.position(i13));
                                                int i25 = bVar.d;
                                                GLES20.glEnableVertexAttribArray(i25);
                                                int i26 = bVar.e;
                                                FloatBuffer floatBuffer5 = h40Var2.h;
                                                GLES20.glVertexAttribPointer(i26, 2, 5126, false, 8, floatBuffer5.position(i13));
                                                int i27 = bVar.e;
                                                GLES20.glEnableVertexAttribArray(i27);
                                                GLES20.glActiveTexture(33984);
                                                GLES20.glBindTexture(3553, iArr[i13]);
                                                GLES20.glUniform1i(bVar.f, i13);
                                                GLES20.glDrawArrays(5, i13, 4);
                                                GLES20.glBindTexture(3553, i13);
                                                GLES20.glDisableVertexAttribArray(i27);
                                                GLES20.glDisableVertexAttribArray(i25);
                                                GLES20.glUseProgram(i13);
                                                int i28 = i13;
                                                while (i28 < i15) {
                                                    f40 f40Var = h40Var2.e;
                                                    GLES20.glFramebufferTexture2D(i20, 36064, 3553, iArr[i28 == 0 ? i15 : 1], i13);
                                                    GLES20.glViewport(i13, i13, 48, 48);
                                                    int i29 = f40Var.a;
                                                    int i30 = f40Var.e;
                                                    int i31 = f40Var.d;
                                                    GLES20.glUseProgram(i29);
                                                    GLES20.glVertexAttribPointer(f40Var.d, 3, 5126, false, 12, floatBuffer4.position(i13));
                                                    GLES20.glEnableVertexAttribArray(i31);
                                                    GLES20.glVertexAttribPointer(f40Var.e, 2, 5126, false, 8, floatBuffer5.position(i13));
                                                    GLES20.glEnableVertexAttribArray(i30);
                                                    GLES20.glActiveTexture(33984);
                                                    GLES20.glBindTexture(3553, iArr[i28 == 0 ? (char) 1 : (char) 2]);
                                                    i13 = 0;
                                                    GLES20.glUniform1i(f40Var.f, 0);
                                                    GLES20.glUniform2f(f40Var.g, i28 == 0 ? 0.020833334f : 0.0f, i28 == 1 ? 0.020833334f : 0.0f);
                                                    GLES20.glDrawArrays(5, 0, 4);
                                                    GLES20.glBindTexture(3553, 0);
                                                    GLES20.glDisableVertexAttribArray(i30);
                                                    GLES20.glDisableVertexAttribArray(i31);
                                                    GLES20.glUseProgram(0);
                                                    i28++;
                                                    i15 = 2;
                                                    i20 = 36160;
                                                }
                                                g40 g40Var = h40Var2.f;
                                                GLES20.glBindFramebuffer(36160, i13);
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], i13);
                                                GLES20.glViewport(i13, i13, h40Var2.a, h40Var2.b);
                                                GLES20.glUseProgram(g40Var.a);
                                                GLES20.glVertexAttribPointer(g40Var.d, 3, 5126, false, 12, floatBuffer4.position(i13));
                                                GLES20.glEnableVertexAttribArray(g40Var.d);
                                                GLES20.glVertexAttribPointer(g40Var.e, 2, 5126, false, 8, floatBuffer5.position(i13));
                                                GLES20.glEnableVertexAttribArray(g40Var.e);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, iArr[1]);
                                                GLES20.glActiveTexture(33984);
                                                GLES20.glBindTexture(3553, iArr[0]);
                                                GLES20.glUniform1i(g40Var.f, 0);
                                                GLES20.glUniform1i(g40Var.g, 1);
                                                GLES20.glUniform2f(g40Var.h, h40Var2.a / 2.0f, h40Var2.b / 2.0f);
                                                GLES20.glDrawArrays(5, 0, 4);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glActiveTexture(33984);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glDisableVertexAttribArray(g40Var.e);
                                                GLES20.glDisableVertexAttribArray(g40Var.d);
                                                GLES20.glUseProgram(0);
                                                b4.b bVar2 = h40Var2.d;
                                                GLES20.glEnable(3042);
                                                int i32 = bVar2.a;
                                                int i33 = bVar2.e;
                                                int i34 = bVar2.d;
                                                GLES20.glUseProgram(i32);
                                                GLES20.glActiveTexture(33984);
                                                for (int i35 = 0; i35 < 2; i35++) {
                                                    if (i35 == 0) {
                                                        GLES20.glVertexAttribPointer(bVar2.d, 3, 5126, false, 12, floatBuffer4.position(12));
                                                        GLES20.glEnableVertexAttribArray(i34);
                                                        GLES20.glVertexAttribPointer(bVar2.e, 2, 5126, false, 8, floatBuffer5.position(8));
                                                        GLES20.glEnableVertexAttribArray(i33);
                                                        GLES20.glBindTexture(3553, iArr[i11]);
                                                        i14 = 4;
                                                    } else {
                                                        int i36 = h40Var2.i;
                                                        h40Var2.i = i36 + 1;
                                                        GLES20.glVertexAttribPointer(bVar2.d, 3, 5126, false, 12, floatBuffer4.position(24));
                                                        GLES20.glEnableVertexAttribArray(i34);
                                                        GLES20.glVertexAttribPointer(bVar2.e, 2, 5126, false, 8, floatBuffer5.position(((i36 % 27) * 8) + 16));
                                                        GLES20.glEnableVertexAttribArray(i33);
                                                        i14 = 4;
                                                        GLES20.glBindTexture(3553, iArr[4]);
                                                    }
                                                    GLES20.glUniform1i(bVar2.f, 0);
                                                    GLES20.glDrawArrays(5, 0, i14);
                                                    GLES20.glBindTexture(3553, 0);
                                                    GLES20.glDisableVertexAttribArray(i33);
                                                    GLES20.glDisableVertexAttribArray(i34);
                                                }
                                                GLES20.glUseProgram(0);
                                                GLES20.glDisable(3042);
                                                if (x40Var.n) {
                                                    GLES20.glEnable(3042);
                                                }
                                            } else {
                                                f10 = f7;
                                            }
                                            EGLExt.eglPresentationTimeANDROID(x40Var.s, x40Var.D, x40Var.R);
                                            EGL14.eglSwapBuffers(x40Var.s, x40Var.D);
                                            if (x40Var.B0 != null && tz.o() == 2 && x40Var.C0 % 33 == 0) {
                                                x40Var.B0.postRunnable(new ew(x40Var, i11));
                                            }
                                            x40Var.C0++;
                                            e50 e50Var8 = x40Var.H0;
                                            if (e50Var8.b0[0] != 0) {
                                                float f11 = e50Var8.c0;
                                                if (f11 < f10 && !e50Var8.t0) {
                                                    float f12 = (j11 / 2.0E8f) + f11;
                                                    e50Var8.c0 = f12;
                                                    if (f12 > f10) {
                                                        GLES20.glDisable(3042);
                                                        x40Var.n = false;
                                                        e50 e50Var9 = x40Var.H0;
                                                        e50Var9.c0 = f10;
                                                        GLES20.glDeleteTextures(1, e50Var9.b0, 0);
                                                        e50 e50Var10 = x40Var.H0;
                                                        e50Var10.b0[0] = 0;
                                                        if (!e50Var10.J) {
                                                            x40Var.H0.J = true;
                                                            i0.g3(new v40(x40Var, 4));
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!e50Var8.J) {
                                                x40Var.H0.J = true;
                                                i0.g3(new v40(x40Var, 5));
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (x40Var.R != 0 && !x40Var.Q) {
                                    j10 = j16 - x40Var.S;
                                    i10 = 3;
                                    long currentTimeMillis = (System.currentTimeMillis() - x40Var.O) * 1000000;
                                    if (j10 < 0 || Math.abs(currentTimeMillis - j10) > 100000000) {
                                        j10 = currentTimeMillis;
                                    }
                                    break;
                                } else {
                                    i10 = 3;
                                }
                                j10 = 0;
                                x40Var.S = j16;
                                j11 = 0;
                                x40Var.Q = false;
                                x40Var.O = System.currentTimeMillis();
                                if (!x40Var.a0) {
                                }
                                x40Var.R += j10;
                                if (x40Var.c0 == -1) {
                                }
                                x40Var.e0 = j16 - x40Var.d0;
                                x40Var.d0 = j16;
                                e50 e50Var11 = x40Var.H0;
                                floatBuffer = e50Var11.I0;
                                floatBuffer2 = e50Var11.H0;
                                FloatBuffer floatBuffer32 = e50Var11.J0;
                                if (floatBuffer != null) {
                                }
                                f8.b("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                            }
                        } else if (i19 == 3) {
                            o40 o40Var2 = (o40) message.obj;
                            if (!x40Var.D0 && !x40Var.l0) {
                                x40Var.L.add(o40Var2);
                                if (x40Var.h0 == -1) {
                                    if (x40Var.c0 == -1) {
                                        if (v2.a) {
                                            f8.b("InstantCamera video record not yet started");
                                            break;
                                        }
                                    } else {
                                        while (true) {
                                            int i37 = 0;
                                            while (i37 < o40Var2.d) {
                                                if (i37 != 0 || Math.abs(x40Var.c0 - o40Var2.b[i37]) <= 10000000) {
                                                    long j20 = o40Var2.b[i37];
                                                    j12 = j15;
                                                    if (j20 >= x40Var.c0) {
                                                        o40Var2.e = i37;
                                                        x40Var.h0 = j20;
                                                        if (v2.a) {
                                                            i0.a.q(o40Var2.b[i37], i0.a.l(i37, "InstantCamera found first audio frame at ", " timestamp = "));
                                                        }
                                                    } else {
                                                        if (v2.a) {
                                                            i0.a.q(o40Var2.b[i37], i0.a.l(i37, "InstantCamera ignore first audio frame at ", " timestamp = "));
                                                        }
                                                        i37++;
                                                        j15 = j12;
                                                    }
                                                } else {
                                                    long j21 = x40Var.c0;
                                                    long j22 = o40Var2.b[i37];
                                                    x40Var.b0 = j21 - j22;
                                                    x40Var.h0 = j22;
                                                    if (v2.a) {
                                                        i0.a.q(x40Var.b0, new StringBuilder("InstantCamera detected desync between audio and video "));
                                                    }
                                                }
                                            }
                                            long j23 = j15;
                                            if (v2.a) {
                                                i0.a.p(o40Var2.d, new StringBuilder("InstantCamera first audio frame not found, removing buffers "));
                                            }
                                            x40Var.L.remove(o40Var2);
                                            if (x40Var.L.isEmpty()) {
                                                break;
                                            } else {
                                                o40Var2 = (o40) x40Var.L.get(0);
                                                j15 = j23;
                                            }
                                        }
                                        if (x40Var.P == j12) {
                                            x40Var.P = o40Var2.b[o40Var2.e];
                                        }
                                        if (x40Var.L.size() > 1) {
                                            o40Var2 = (o40) x40Var.L.get(0);
                                        }
                                        o40Var = o40Var2;
                                        x40Var.d(false);
                                        boolean z11 = false;
                                        while (o40Var != null) {
                                            try {
                                                int dequeueInputBuffer = x40Var.F.dequeueInputBuffer(j14);
                                                if (dequeueInputBuffer >= 0) {
                                                    ByteBuffer inputBuffer = x40Var.F.getInputBuffer(dequeueInputBuffer);
                                                    long[] jArr = o40Var.b;
                                                    int i38 = o40Var.e;
                                                    long j24 = jArr[i38];
                                                    while (true) {
                                                        int i39 = o40Var.d;
                                                        if (i38 <= i39) {
                                                            if (i38 < i39) {
                                                                j13 = j14;
                                                                long j25 = o40Var.b[i38] - x40Var.P;
                                                                if (x40Var.W || (o40Var.b[i38] < x40Var.d0 - x40Var.b0 && j25 < 60000000)) {
                                                                    if (inputBuffer.remaining() < o40Var.c[i38]) {
                                                                        o40Var.e = i38;
                                                                    } else {
                                                                        inputBuffer.put(o40Var.a[i38]);
                                                                    }
                                                                }
                                                            } else {
                                                                j13 = j14;
                                                            }
                                                            if (i38 >= o40Var.d - 1) {
                                                                x40Var.L.remove(o40Var);
                                                                if (x40Var.W) {
                                                                    x40Var.z0.put(o40Var);
                                                                }
                                                                if (x40Var.L.isEmpty()) {
                                                                    z11 = o40Var.f;
                                                                } else {
                                                                    o40Var = (o40) x40Var.L.get(0);
                                                                }
                                                            }
                                                            i38++;
                                                            j14 = j13;
                                                        } else {
                                                            j13 = j14;
                                                        }
                                                    }
                                                    o40Var = null;
                                                    long j26 = j24 == j13 ? j13 : j24 - x40Var.P;
                                                    long j27 = x40Var.k0;
                                                    if (j27 >= j13) {
                                                        j26 += j27;
                                                    }
                                                    long j28 = j26;
                                                    x40Var.j0 = j28 - x40Var.i0;
                                                    x40Var.i0 = j28;
                                                    x40Var.F.queueInputBuffer(dequeueInputBuffer, 0, inputBuffer.position(), j28, z11 ? 4 : 0);
                                                } else {
                                                    j13 = j14;
                                                }
                                                j14 = j13;
                                            } catch (Throwable th2) {
                                                f8.g(th2, true);
                                                return;
                                            }
                                        }
                                        break;
                                    }
                                }
                                j12 = j15;
                                if (x40Var.P == j12) {
                                }
                                if (x40Var.L.size() > 1) {
                                }
                                o40Var = o40Var2;
                                x40Var.d(false);
                                boolean z112 = false;
                                while (o40Var != null) {
                                }
                            }
                        } else if (i19 == 4) {
                            if (v2.a) {
                                f8.d("InstantCamera pause encoder");
                            }
                            x40Var.D0 = true;
                            File file = x40Var.H0.f0;
                            if (file != null) {
                                file.delete();
                                x40Var.H0.f0 = null;
                            }
                            e50 e50Var12 = x40Var.H0;
                            e50Var12.f0 = n5.x(e50Var12.e, true);
                            try {
                                f8.b("InstantCamera handlePauseRecording drain encoders");
                                x40Var.d(false);
                            } catch (Exception e10) {
                                f8.g(e10, true);
                            }
                            MP4Builder mP4Builder = x40Var.K;
                            if (mP4Builder != null) {
                                try {
                                    mP4Builder.finishMovie(x40Var.H0.f0);
                                } catch (Exception e11) {
                                    f8.g(e11, true);
                                }
                            }
                            i0.g3(new v40(x40Var, i17));
                            break;
                        } else if (i19 == 5) {
                            if (v2.a) {
                                f8.d("InstantCamera resume encoder");
                            }
                            x40Var.D0 = false;
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
                    int i40 = message.what;
                    int i41 = message.arg1;
                    int i42 = message.arg2;
                    Object obj = message.obj;
                    Bundle peekData = message.peekData();
                    switch (i40) {
                        case 0:
                            if (i41 == n0Var.g) {
                                n0Var.g = 0;
                                if (s0Var.D == n0Var) {
                                    s0Var.q();
                                }
                            }
                            if (((p0) sparseArray.get(i41)) != null) {
                                sparseArray.remove(i41);
                                p0.a(null, null);
                                break;
                            }
                            break;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (n0Var.f == 0 && i41 == n0Var.g && i42 >= 1) {
                                    n0Var.g = 0;
                                    n0Var.f = i42;
                                    b2.u g10 = b2.u.g(bundle);
                                    if (s0Var.D == n0Var) {
                                        s0Var.g(g10);
                                    }
                                    if (s0Var.D == n0Var) {
                                        s0Var.E = true;
                                        int size = arrayList.size();
                                        while (i16 < size) {
                                            ((o0) arrayList.get(i16)).a(s0Var.D);
                                            i16++;
                                        }
                                        p4.n nVar = (p4.n) s0Var.h;
                                        if (nVar != null) {
                                            n0 n0Var2 = s0Var.D;
                                            int i43 = n0Var2.d;
                                            n0Var2.d = i43 + 1;
                                            n0Var2.b(10, i43, 0, nVar.a, null);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                p0 p0Var = (p0) sparseArray.get(i41);
                                if (p0Var != null) {
                                    sparseArray.remove(i41);
                                    p0Var.b(bundle2);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                String string = peekData != null ? peekData.getString("error") : null;
                                Bundle bundle3 = (Bundle) obj;
                                if (((p0) sparseArray.get(i41)) != null) {
                                    sparseArray.remove(i41);
                                    p0.a(string, bundle3);
                                    break;
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (n0Var.f != 0) {
                                    b2.u g11 = b2.u.g(bundle4);
                                    if (s0Var.D == n0Var) {
                                        s0Var.g(g11);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 6:
                            if (obj instanceof Bundle) {
                                Bundle bundle5 = (Bundle) obj;
                                p0 p0Var2 = (p0) sparseArray.get(i41);
                                if (bundle5.containsKey("routeId")) {
                                    sparseArray.remove(i41);
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
                                    if (s0Var.D == n0Var) {
                                        int size3 = arrayList.size();
                                        while (true) {
                                            if (i16 < size3) {
                                                Object obj3 = arrayList.get(i16);
                                                i16++;
                                                o0 o0Var3 = (o0) obj3;
                                                if (o0Var3.b() == i42) {
                                                    o0Var2 = o0Var3;
                                                }
                                            }
                                        }
                                        if (o0Var2 instanceof q0) {
                                            ((q0) o0Var2).l(mVar, arrayList2);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 8:
                            if (s0Var.D == n0Var) {
                                int size4 = arrayList.size();
                                while (true) {
                                    if (i16 < size4) {
                                        Object obj4 = arrayList.get(i16);
                                        i16++;
                                        o0 o0Var4 = (o0) obj4;
                                        if (o0Var4.b() == i42) {
                                            o0Var = o0Var4;
                                        }
                                    }
                                }
                                mg.l lVar = s0Var.F;
                                if (lVar != null && (o0Var instanceof p4.q)) {
                                    p4.q qVar = (p4.q) o0Var;
                                    p4.e eVar = (p4.e) ((t0) lVar.b).c;
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
                    int i45 = s0.G;
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
