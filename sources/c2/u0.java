package c2;

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
import kh.a2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.camera.Size;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.ui.Components.a50;
import org.telegram.ui.Components.b50;
import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.m50;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.t50;
import org.telegram.ui.Components.w50;
import org.telegram.ui.Components.x50;
import ph.u6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class u0 extends Handler {
    public final /* synthetic */ int a;
    public WeakReference b;

    public /* synthetic */ u0(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x01b4, code lost:
    
        if (org.telegram.messenger.BuildVars.LOGS_ENABLED == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01b8, code lost:
    
        if (r17 < 60000000) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01ba, code lost:
    
        org.telegram.messenger.FileLog.d("InstantCamera stop audio encoding because recorded time more than 60s");
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01c3, code lost:
    
        org.telegram.messenger.FileLog.d("InstantCamera stop audio encoding because of stoped video recording at " + r2.b[r12] + " last video " + r7.a0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01e5, code lost:
    
        r7.i0 = true;
        r7.I.clear();
        r2 = null;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x030c, code lost:
    
        if (r10 < 0) goto L179;
     */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x033c  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        q qVar;
        boolean z4;
        long j10;
        long j11;
        FloatBuffer floatBuffer;
        FloatBuffer floatBuffer2;
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        long j12;
        long j13;
        long j14;
        t0 t0Var = null;
        t0 t0Var2 = null;
        int i14 = 2;
        switch (this.a) {
            case 0:
                s0 s0Var = (s0) this.b.get();
                if (s0Var != null) {
                    SparseArray sparseArray = s0Var.h;
                    y0 y0Var = s0Var.i;
                    ArrayList arrayList = y0Var.v;
                    int i15 = message.what;
                    int i16 = message.arg1;
                    int i17 = message.arg2;
                    Object obj = message.obj;
                    Bundle peekData = message.peekData();
                    switch (i15) {
                        case 0:
                            if (i16 == s0Var.g) {
                                s0Var.g = 0;
                                if (y0Var.y == s0Var) {
                                    y0Var.q();
                                }
                            }
                            if (((v0) sparseArray.get(i16)) != null) {
                                sparseArray.remove(i16);
                                v0.a(null, null);
                                break;
                            }
                            break;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (s0Var.f == 0 && i16 == s0Var.g && i17 >= 1) {
                                    s0Var.g = 0;
                                    s0Var.f = i17;
                                    u f11 = u.f(bundle);
                                    if (y0Var.y == s0Var) {
                                        y0Var.g(f11);
                                    }
                                    if (y0Var.y == s0Var) {
                                        y0Var.B = true;
                                        int size = arrayList.size();
                                        for (int i18 = 0; i18 < size; i18++) {
                                            ((t0) arrayList.get(i18)).a(y0Var.y);
                                        }
                                        o oVar = (o) y0Var.h;
                                        if (oVar != null) {
                                            s0 s0Var2 = y0Var.y;
                                            int i19 = s0Var2.d;
                                            s0Var2.d = i19 + 1;
                                            s0Var2.b(10, i19, 0, oVar.a, null);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                v0 v0Var = (v0) sparseArray.get(i16);
                                if (v0Var != null) {
                                    sparseArray.remove(i16);
                                    v0Var.b(bundle2);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                String string = peekData != null ? peekData.getString("error") : null;
                                Bundle bundle3 = (Bundle) obj;
                                if (((v0) sparseArray.get(i16)) != null) {
                                    sparseArray.remove(i16);
                                    v0.a(string, bundle3);
                                    break;
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (s0Var.f != 0) {
                                    u f12 = u.f(bundle4);
                                    if (y0Var.y == s0Var) {
                                        y0Var.g(f12);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 6:
                            if (obj instanceof Bundle) {
                                Bundle bundle5 = (Bundle) obj;
                                v0 v0Var2 = (v0) sparseArray.get(i16);
                                if (bundle5.containsKey("routeId")) {
                                    sparseArray.remove(i16);
                                    v0Var2.b(bundle5);
                                    break;
                                } else {
                                    v0Var2.getClass();
                                    v0.a("DynamicGroupRouteController is created without valid route id.", bundle5);
                                    break;
                                }
                            } else {
                                Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                                break;
                            }
                        case 7:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle6 = (Bundle) obj;
                                if (s0Var.f != 0) {
                                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                    n nVar = bundle7 != null ? new n(bundle7) : null;
                                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                    ArrayList arrayList2 = new ArrayList();
                                    int size2 = parcelableArrayList.size();
                                    int i20 = 0;
                                    while (i20 < size2) {
                                        Object obj2 = parcelableArrayList.get(i20);
                                        i20++;
                                        Bundle bundle8 = (Bundle) obj2;
                                        if (bundle8 == null) {
                                            qVar = null;
                                        } else {
                                            Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                            qVar = new q(bundle9 != null ? new n(bundle9) : null, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                        }
                                        arrayList2.add(qVar);
                                    }
                                    if (y0Var.y == s0Var) {
                                        int size3 = arrayList.size();
                                        int i21 = 0;
                                        while (true) {
                                            if (i21 < size3) {
                                                Object obj3 = arrayList.get(i21);
                                                i21++;
                                                t0 t0Var3 = (t0) obj3;
                                                if (t0Var3.b() == i17) {
                                                    t0Var2 = t0Var3;
                                                }
                                            }
                                        }
                                        if (t0Var2 instanceof w0) {
                                            ((w0) t0Var2).l(nVar, arrayList2);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 8:
                            if (y0Var.y == s0Var) {
                                int size4 = arrayList.size();
                                int i22 = 0;
                                while (true) {
                                    if (i22 < size4) {
                                        Object obj4 = arrayList.get(i22);
                                        i22++;
                                        t0 t0Var4 = (t0) obj4;
                                        if (t0Var4.b() == i17) {
                                            t0Var = t0Var4;
                                        }
                                    }
                                }
                                a1.c cVar = y0Var.C;
                                if (cVar != null && (t0Var instanceof s)) {
                                    s sVar = (s) t0Var;
                                    e eVar = (e) ((z0) cVar.b).c;
                                    if (eVar.e == sVar) {
                                        eVar.i(eVar.c(), 2);
                                    }
                                }
                                arrayList.remove(t0Var);
                                t0Var.c();
                                y0Var.r();
                                break;
                            }
                            break;
                    }
                    int i23 = y0.D;
                    break;
                }
                break;
            case 1:
                int i24 = message.what;
                if (i24 == -3 || i24 == -2 || i24 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.b.get(), message.what);
                    break;
                } else if (i24 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            default:
                int i25 = message.what;
                w50 w50Var = (w50) this.b.get();
                if (w50Var != null) {
                    if (i25 == 0) {
                        try {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera start encoder");
                            }
                            w50.a(w50Var, message.arg1 == 1);
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                            w50.b(w50Var, 0, null);
                            Looper.myLooper().quit();
                        }
                    } else if (i25 == 1) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("InstantCamera stop encoder");
                        }
                        w50.b(w50Var, message.arg1, (s50) message.obj);
                        break;
                    } else {
                        long j15 = 0;
                        long j16 = -1;
                        if (i25 == 2) {
                            long j17 = (message.arg1 << 32) | (message.arg2 & 4294967295L);
                            Integer num = (Integer) message.obj;
                            if (!w50Var.A0 && w50Var.E0.O) {
                                try {
                                    w50Var.e(false);
                                } catch (Exception e6) {
                                    FileLog.e(e6);
                                }
                                if (w50Var.t0.equals(num)) {
                                    z4 = false;
                                } else {
                                    w50Var.t0 = num;
                                    z4 = true;
                                }
                                long j18 = w50Var.d0;
                                if (j18 >= 0) {
                                    if (w50Var.c0 == -1) {
                                        w50Var.c0 = j17 - j18;
                                    }
                                    j17 -= w50Var.c0;
                                }
                                if (!z4) {
                                    long j19 = w50Var.P;
                                    if (j19 != -1) {
                                        j10 = j17 - j19;
                                        w50Var.P = j17;
                                        j11 = j10;
                                        w50Var.N = false;
                                        w50Var.L = System.currentTimeMillis();
                                        if (!w50Var.X) {
                                            long j20 = w50Var.W + j10;
                                            w50Var.W = j20;
                                            if (j20 >= 200000000) {
                                                w50Var.X = true;
                                            }
                                        }
                                        w50Var.O += j10;
                                        if (w50Var.Z == -1) {
                                            w50Var.Z = j17 / 1000;
                                            if (BuildVars.LOGS_ENABLED) {
                                                a2.x(new StringBuilder("InstantCamera first video frame was at "), w50Var.Z);
                                            }
                                        }
                                        w50Var.b0 = j17 - w50Var.a0;
                                        w50Var.a0 = j17;
                                        x50 x50Var = w50Var.E0;
                                        floatBuffer = x50Var.w0;
                                        floatBuffer2 = x50Var.v0;
                                        FloatBuffer floatBuffer3 = x50Var.x0;
                                        if (floatBuffer != null || floatBuffer2 == null) {
                                            FileLog.d("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                                            break;
                                        } else {
                                            d50 d50Var = w50Var.u0;
                                            int i26 = 36160;
                                            if (d50Var != null) {
                                                GLES20.glBindFramebuffer(36160, d50Var.j[0]);
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, d50Var.k[0], 0);
                                                GLES20.glViewport(0, 0, d50Var.a, d50Var.b);
                                            }
                                            GLES20.glUseProgram(w50Var.j0);
                                            GLES20.glActiveTexture(33984);
                                            GLES20.glVertexAttribPointer(w50Var.m0, 3, 5126, false, 12, (Buffer) floatBuffer2);
                                            GLES20.glEnableVertexAttribArray(w50Var.m0);
                                            GLES20.glVertexAttribPointer(w50Var.n0, 2, 5126, false, 8, (Buffer) floatBuffer);
                                            GLES20.glEnableVertexAttribArray(w50Var.n0);
                                            GLES20.glUniformMatrix4fv(w50Var.k0, 1, false, w50Var.E0.s0, 0);
                                            GLES20.glUniform2f(w50Var.o0, w50Var.d, w50Var.e);
                                            x50 x50Var2 = w50Var.E0;
                                            if (x50Var2.R[0] == 0 || floatBuffer3 == null || x50Var2.m0) {
                                                i10 = 36197;
                                                i11 = 33984;
                                            } else {
                                                if (!w50Var.n) {
                                                    GLES20.glEnable(3042);
                                                    w50Var.n = true;
                                                }
                                                if (w50Var.E0.A0 != null) {
                                                    i11 = 33984;
                                                    GLES20.glUniform2f(w50Var.p0, r2.getWidth(), w50Var.E0.A0.getHeight());
                                                } else {
                                                    i11 = 33984;
                                                }
                                                GLES20.glVertexAttribPointer(w50Var.n0, 2, 5126, false, 8, (Buffer) floatBuffer3);
                                                GLES20.glUniformMatrix4fv(w50Var.l0, 1, false, w50Var.E0.u0, 0);
                                                GLES20.glUniform1f(w50Var.r0, 1.0f);
                                                GLES20.glBindTexture(36197, w50Var.E0.R[0]);
                                                i10 = 36197;
                                                GLES20.glDrawArrays(5, 0, 4);
                                            }
                                            x50 x50Var3 = w50Var.E0;
                                            Size[] sizeArr = x50Var3.f0;
                                            if (sizeArr != null) {
                                                int i27 = w50Var.p0;
                                                float width = sizeArr[x50Var3.X0].getWidth();
                                                x50 x50Var4 = w50Var.E0;
                                                GLES20.glUniform2f(i27, width, x50Var4.f0[x50Var4.X0].getHeight());
                                                int i28 = w50Var.q0;
                                                x50 x50Var5 = w50Var.E0;
                                                x50 x50Var6 = w50Var.E0;
                                                GLES20.glUniform2f(i28, (1.0f / x50Var5.f0[x50Var5.X0].getWidth()) / 2.0f, (1.0f / x50Var6.f0[x50Var6.X0].getHeight()) / 2.0f);
                                            }
                                            x50 x50Var7 = w50Var.E0;
                                            int i29 = x50Var7.Q[x50Var7.X0];
                                            if (i29 != Integer.MIN_VALUE) {
                                                i12 = 0;
                                                GLES20.glUniformMatrix4fv(w50Var.l0, 1, false, w50Var.E0.t0, 0);
                                                GLES20.glUniform1f(w50Var.r0, w50Var.E0.S);
                                                GLES20.glBindTexture(i10, i29);
                                                GLES20.glDrawArrays(5, 0, 4);
                                            } else {
                                                i12 = 0;
                                            }
                                            GLES20.glDisableVertexAttribArray(w50Var.m0);
                                            GLES20.glDisableVertexAttribArray(w50Var.n0);
                                            GLES20.glBindTexture(i10, i12);
                                            GLES20.glUseProgram(i12);
                                            d50 d50Var2 = w50Var.u0;
                                            if (d50Var2 != null) {
                                                GLES20.glDisable(3042);
                                                c50 c50Var = d50Var2.c;
                                                int[] iArr = d50Var2.k;
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], i12);
                                                GLES20.glViewport(i12, i12, 48, 48);
                                                GLES20.glUseProgram(c50Var.a);
                                                int i30 = c50Var.d;
                                                f10 = 1.0f;
                                                FloatBuffer floatBuffer4 = d50Var2.g;
                                                GLES20.glVertexAttribPointer(i30, 3, 5126, false, 12, floatBuffer4.position(i12));
                                                int i31 = c50Var.d;
                                                GLES20.glEnableVertexAttribArray(i31);
                                                int i32 = c50Var.e;
                                                FloatBuffer floatBuffer5 = d50Var2.h;
                                                GLES20.glVertexAttribPointer(i32, 2, 5126, false, 8, floatBuffer5.position(i12));
                                                int i33 = c50Var.e;
                                                GLES20.glEnableVertexAttribArray(i33);
                                                GLES20.glActiveTexture(i11);
                                                GLES20.glBindTexture(3553, iArr[i12]);
                                                GLES20.glUniform1i(c50Var.f, i12);
                                                GLES20.glDrawArrays(5, i12, 4);
                                                GLES20.glBindTexture(3553, i12);
                                                GLES20.glDisableVertexAttribArray(i33);
                                                GLES20.glDisableVertexAttribArray(i31);
                                                GLES20.glUseProgram(i12);
                                                int i34 = 0;
                                                while (i34 < i14) {
                                                    a50 a50Var = d50Var2.e;
                                                    GLES20.glFramebufferTexture2D(i26, 36064, 3553, iArr[i34 == 0 ? (char) 2 : (char) 1], i12);
                                                    GLES20.glViewport(i12, i12, 48, 48);
                                                    int i35 = a50Var.a;
                                                    int i36 = a50Var.e;
                                                    int i37 = a50Var.d;
                                                    GLES20.glUseProgram(i35);
                                                    GLES20.glVertexAttribPointer(a50Var.d, 3, 5126, false, 12, floatBuffer4.position(i12));
                                                    GLES20.glEnableVertexAttribArray(i37);
                                                    GLES20.glVertexAttribPointer(a50Var.e, 2, 5126, false, 8, floatBuffer5.position(i12));
                                                    GLES20.glEnableVertexAttribArray(i36);
                                                    GLES20.glActiveTexture(i11);
                                                    GLES20.glBindTexture(3553, iArr[i34 == 0 ? (char) 1 : (char) 2]);
                                                    i12 = 0;
                                                    GLES20.glUniform1i(a50Var.f, 0);
                                                    GLES20.glUniform2f(a50Var.g, i34 == 0 ? 0.020833334f : 0.0f, i34 == 1 ? 0.020833334f : 0.0f);
                                                    GLES20.glDrawArrays(5, 0, 4);
                                                    GLES20.glBindTexture(3553, 0);
                                                    GLES20.glDisableVertexAttribArray(i36);
                                                    GLES20.glDisableVertexAttribArray(i37);
                                                    GLES20.glUseProgram(0);
                                                    i34++;
                                                    i14 = 2;
                                                    i26 = 36160;
                                                }
                                                b50 b50Var = d50Var2.f;
                                                GLES20.glBindFramebuffer(36160, i12);
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], i12);
                                                GLES20.glViewport(i12, i12, d50Var2.a, d50Var2.b);
                                                GLES20.glUseProgram(b50Var.a);
                                                GLES20.glVertexAttribPointer(b50Var.d, 3, 5126, false, 12, floatBuffer4.position(i12));
                                                GLES20.glEnableVertexAttribArray(b50Var.d);
                                                GLES20.glVertexAttribPointer(b50Var.e, 2, 5126, false, 8, floatBuffer5.position(i12));
                                                GLES20.glEnableVertexAttribArray(b50Var.e);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, iArr[1]);
                                                GLES20.glActiveTexture(i11);
                                                GLES20.glBindTexture(3553, iArr[0]);
                                                GLES20.glUniform1i(b50Var.f, 0);
                                                GLES20.glUniform1i(b50Var.g, 1);
                                                GLES20.glUniform2f(b50Var.h, d50Var2.a / 2.0f, d50Var2.b / 2.0f);
                                                GLES20.glDrawArrays(5, 0, 4);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glActiveTexture(i11);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glDisableVertexAttribArray(b50Var.e);
                                                GLES20.glDisableVertexAttribArray(b50Var.d);
                                                GLES20.glUseProgram(0);
                                                c50 c50Var2 = d50Var2.d;
                                                GLES20.glEnable(3042);
                                                int i38 = c50Var2.a;
                                                int i39 = c50Var2.e;
                                                int i40 = c50Var2.d;
                                                GLES20.glUseProgram(i38);
                                                GLES20.glActiveTexture(i11);
                                                for (int i41 = 0; i41 < 2; i41++) {
                                                    if (i41 == 0) {
                                                        GLES20.glVertexAttribPointer(c50Var2.d, 3, 5126, false, 12, floatBuffer4.position(12));
                                                        GLES20.glEnableVertexAttribArray(i40);
                                                        GLES20.glVertexAttribPointer(c50Var2.e, 2, 5126, false, 8, floatBuffer5.position(8));
                                                        GLES20.glEnableVertexAttribArray(i39);
                                                        GLES20.glBindTexture(3553, iArr[3]);
                                                        i13 = 4;
                                                    } else {
                                                        int i42 = d50Var2.i;
                                                        d50Var2.i = i42 + 1;
                                                        GLES20.glVertexAttribPointer(c50Var2.d, 3, 5126, false, 12, floatBuffer4.position(24));
                                                        GLES20.glEnableVertexAttribArray(i40);
                                                        GLES20.glVertexAttribPointer(c50Var2.e, 2, 5126, false, 8, floatBuffer5.position(((i42 % 27) * 8) + 16));
                                                        GLES20.glEnableVertexAttribArray(i39);
                                                        i13 = 4;
                                                        GLES20.glBindTexture(3553, iArr[4]);
                                                    }
                                                    GLES20.glUniform1i(c50Var2.f, 0);
                                                    GLES20.glDrawArrays(5, 0, i13);
                                                    GLES20.glBindTexture(3553, 0);
                                                    GLES20.glDisableVertexAttribArray(i39);
                                                    GLES20.glDisableVertexAttribArray(i40);
                                                }
                                                GLES20.glUseProgram(0);
                                                GLES20.glDisable(3042);
                                                if (w50Var.n) {
                                                    GLES20.glEnable(3042);
                                                }
                                            } else {
                                                f10 = 1.0f;
                                            }
                                            EGLExt.eglPresentationTimeANDROID(w50Var.s, w50Var.y, w50Var.O);
                                            EGL14.eglSwapBuffers(w50Var.s, w50Var.y);
                                            if (w50Var.y0 != null && SharedConfig.getDevicePerformanceClass() == 2 && w50Var.z0 % 33 == 0) {
                                                w50Var.y0.postRunnable(new m2.b(w50Var, 23));
                                            }
                                            w50Var.z0++;
                                            x50 x50Var8 = w50Var.E0;
                                            if (x50Var8.R[0] != 0) {
                                                float f13 = x50Var8.S;
                                                if (f13 < f10 && !x50Var8.m0) {
                                                    float f14 = (j11 / 2.0E8f) + f13;
                                                    x50Var8.S = f14;
                                                    if (f14 > f10) {
                                                        GLES20.glDisable(3042);
                                                        w50Var.n = false;
                                                        x50 x50Var9 = w50Var.E0;
                                                        x50Var9.S = 1.0f;
                                                        GLES20.glDeleteTextures(1, x50Var9.R, 0);
                                                        x50 x50Var10 = w50Var.E0;
                                                        x50Var10.R[0] = 0;
                                                        if (!x50Var10.C) {
                                                            w50Var.E0.C = true;
                                                            AndroidUtilities.runOnUIThread(new t50(w50Var, 6));
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!x50Var8.C) {
                                                w50Var.E0.C = true;
                                                AndroidUtilities.runOnUIThread(new t50(w50Var, 7));
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (w50Var.O != 0 && !w50Var.N) {
                                    j10 = j17 - w50Var.P;
                                    long currentTimeMillis = (System.currentTimeMillis() - w50Var.L) * 1000000;
                                    if (j10 < 0 || Math.abs(currentTimeMillis - j10) > 100000000) {
                                        j10 = currentTimeMillis;
                                    }
                                    break;
                                }
                                j10 = 0;
                                w50Var.P = j17;
                                j11 = 0;
                                w50Var.N = false;
                                w50Var.L = System.currentTimeMillis();
                                if (!w50Var.X) {
                                }
                                w50Var.O += j10;
                                if (w50Var.Z == -1) {
                                }
                                w50Var.b0 = j17 - w50Var.a0;
                                w50Var.a0 = j17;
                                x50 x50Var11 = w50Var.E0;
                                floatBuffer = x50Var11.w0;
                                floatBuffer2 = x50Var11.v0;
                                FloatBuffer floatBuffer32 = x50Var11.x0;
                                if (floatBuffer != null) {
                                }
                                FileLog.d("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                            }
                        } else if (i25 == 3) {
                            m50 m50Var = (m50) message.obj;
                            if (!w50Var.A0 && !w50Var.i0) {
                                w50Var.I.add(m50Var);
                                if (w50Var.e0 == -1) {
                                    if (w50Var.Z == -1) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("InstantCamera video record not yet started");
                                            break;
                                        }
                                    } else {
                                        while (true) {
                                            int i43 = 0;
                                            while (i43 < m50Var.d) {
                                                if (i43 != 0 || Math.abs(w50Var.Z - m50Var.b[i43]) <= 10000000) {
                                                    j12 = j16;
                                                    long j21 = m50Var.b[i43];
                                                    if (j21 >= w50Var.Z) {
                                                        m50Var.e = i43;
                                                        w50Var.e0 = j21;
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            a2.x(a2.m(i43, "InstantCamera found first audio frame at ", " timestamp = "), m50Var.b[i43]);
                                                        }
                                                    } else {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            a2.x(a2.m(i43, "InstantCamera ignore first audio frame at ", " timestamp = "), m50Var.b[i43]);
                                                        }
                                                        i43++;
                                                        j16 = j12;
                                                    }
                                                } else {
                                                    long j22 = w50Var.Z;
                                                    j12 = j16;
                                                    long j23 = m50Var.b[i43];
                                                    w50Var.Y = j22 - j23;
                                                    w50Var.e0 = j23;
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        a2.x(new StringBuilder("InstantCamera detected desync between audio and video "), w50Var.Y);
                                                    }
                                                }
                                            }
                                            long j24 = j16;
                                            if (BuildVars.LOGS_ENABLED) {
                                                a2.t(m50Var.d, new StringBuilder("InstantCamera first audio frame not found, removing buffers "));
                                            }
                                            w50Var.I.remove(m50Var);
                                            if (w50Var.I.isEmpty()) {
                                                break;
                                            } else {
                                                m50Var = (m50) w50Var.I.get(0);
                                                j16 = j24;
                                            }
                                        }
                                    }
                                } else {
                                    j12 = -1;
                                }
                                if (w50Var.M == j12) {
                                    w50Var.M = m50Var.b[m50Var.e];
                                }
                                if (w50Var.I.size() > 1) {
                                    m50Var = (m50) w50Var.I.get(0);
                                }
                                m50 m50Var2 = m50Var;
                                try {
                                    w50Var.e(false);
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                                boolean z10 = false;
                                while (m50Var2 != null) {
                                    try {
                                        int dequeueInputBuffer = w50Var.C.dequeueInputBuffer(j15);
                                        if (dequeueInputBuffer >= 0) {
                                            ByteBuffer inputBuffer = w50Var.C.getInputBuffer(dequeueInputBuffer);
                                            long[] jArr = m50Var2.b;
                                            int i44 = m50Var2.e;
                                            long j25 = jArr[i44];
                                            while (true) {
                                                int i45 = m50Var2.d;
                                                if (i44 <= i45) {
                                                    if (i44 < i45) {
                                                        j13 = j15;
                                                        long j26 = m50Var2.b[i44] - w50Var.M;
                                                        if (w50Var.T) {
                                                            j14 = j25;
                                                        } else {
                                                            j14 = j25;
                                                            if (m50Var2.b[i44] >= w50Var.a0 - w50Var.Y || j26 >= 60000000) {
                                                            }
                                                        }
                                                        if (inputBuffer.remaining() < m50Var2.c[i44]) {
                                                            m50Var2.e = i44;
                                                        } else {
                                                            inputBuffer.put(m50Var2.a[i44]);
                                                        }
                                                    } else {
                                                        j13 = j15;
                                                        j14 = j25;
                                                    }
                                                    if (i44 >= m50Var2.d - 1) {
                                                        w50Var.I.remove(m50Var2);
                                                        if (w50Var.T) {
                                                            w50Var.w0.put(m50Var2);
                                                        }
                                                        if (w50Var.I.isEmpty()) {
                                                            z10 = m50Var2.f;
                                                        } else {
                                                            m50Var2 = (m50) w50Var.I.get(0);
                                                        }
                                                    }
                                                    i44++;
                                                    j15 = j13;
                                                    j25 = j14;
                                                } else {
                                                    j13 = j15;
                                                    j14 = j25;
                                                }
                                            }
                                            m50Var2 = null;
                                            long j27 = j14 == j13 ? j13 : j14 - w50Var.M;
                                            long j28 = w50Var.h0;
                                            if (j28 >= j13) {
                                                j27 += j28;
                                            }
                                            long j29 = j27;
                                            w50Var.g0 = j29 - w50Var.f0;
                                            w50Var.f0 = j29;
                                            w50Var.C.queueInputBuffer(dequeueInputBuffer, 0, inputBuffer.position(), j29, z10 ? 4 : 0);
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
                        } else if (i25 == 4) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera pause encoder");
                            }
                            w50Var.A0 = true;
                            File file = w50Var.E0.V;
                            if (file != null) {
                                file.delete();
                                w50Var.E0.V = null;
                            }
                            x50 x50Var12 = w50Var.E0;
                            x50Var12.V = u6.x(x50Var12.a, true);
                            try {
                                FileLog.d("InstantCamera handlePauseRecording drain encoders");
                                w50Var.e(false);
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            MP4Builder mP4Builder = w50Var.H;
                            if (mP4Builder != null) {
                                try {
                                    mP4Builder.finishMovie(w50Var.E0.V);
                                } catch (Exception e12) {
                                    FileLog.e(e12);
                                }
                            }
                            AndroidUtilities.runOnUIThread(new t50(w50Var, i14));
                            break;
                        } else if (i25 == 5) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera resume encoder");
                            }
                            w50Var.A0 = false;
                            break;
                        }
                    }
                }
                break;
        }
    }

    public u0(s0 s0Var) {
        this.a = 0;
        this.b = new WeakReference(s0Var);
    }
}
