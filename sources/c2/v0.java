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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.camera.Size;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.ui.Components.b50;
import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.n50;
import org.telegram.ui.Components.t50;
import org.telegram.ui.Components.u50;
import org.telegram.ui.Components.x50;
import org.telegram.ui.Components.y50;
import ph.t6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class v0 extends Handler {
    public final /* synthetic */ int a;
    public WeakReference b;

    public /* synthetic */ v0(int i10) {
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
        u0 u0Var = null;
        u0 u0Var2 = null;
        int i14 = 2;
        switch (this.a) {
            case 0:
                t0 t0Var = (t0) this.b.get();
                if (t0Var != null) {
                    SparseArray sparseArray = t0Var.h;
                    z0 z0Var = t0Var.i;
                    ArrayList arrayList = z0Var.v;
                    int i15 = message.what;
                    int i16 = message.arg1;
                    int i17 = message.arg2;
                    Object obj = message.obj;
                    Bundle peekData = message.peekData();
                    switch (i15) {
                        case 0:
                            if (i16 == t0Var.g) {
                                t0Var.g = 0;
                                if (z0Var.y == t0Var) {
                                    z0Var.q();
                                }
                            }
                            if (((w0) sparseArray.get(i16)) != null) {
                                sparseArray.remove(i16);
                                w0.a(null, null);
                                break;
                            }
                            break;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (t0Var.f == 0 && i16 == t0Var.g && i17 >= 1) {
                                    t0Var.g = 0;
                                    t0Var.f = i17;
                                    u f11 = u.f(bundle);
                                    if (z0Var.y == t0Var) {
                                        z0Var.g(f11);
                                    }
                                    if (z0Var.y == t0Var) {
                                        z0Var.B = true;
                                        int size = arrayList.size();
                                        for (int i18 = 0; i18 < size; i18++) {
                                            ((u0) arrayList.get(i18)).a(z0Var.y);
                                        }
                                        o oVar = (o) z0Var.h;
                                        if (oVar != null) {
                                            t0 t0Var2 = z0Var.y;
                                            int i19 = t0Var2.d;
                                            t0Var2.d = i19 + 1;
                                            t0Var2.b(10, i19, 0, oVar.a, null);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                w0 w0Var = (w0) sparseArray.get(i16);
                                if (w0Var != null) {
                                    sparseArray.remove(i16);
                                    w0Var.b(bundle2);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                String string = peekData != null ? peekData.getString("error") : null;
                                Bundle bundle3 = (Bundle) obj;
                                if (((w0) sparseArray.get(i16)) != null) {
                                    sparseArray.remove(i16);
                                    w0.a(string, bundle3);
                                    break;
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (t0Var.f != 0) {
                                    u f12 = u.f(bundle4);
                                    if (z0Var.y == t0Var) {
                                        z0Var.g(f12);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 6:
                            if (obj instanceof Bundle) {
                                Bundle bundle5 = (Bundle) obj;
                                w0 w0Var2 = (w0) sparseArray.get(i16);
                                if (bundle5.containsKey("routeId")) {
                                    sparseArray.remove(i16);
                                    w0Var2.b(bundle5);
                                    break;
                                } else {
                                    w0Var2.getClass();
                                    w0.a("DynamicGroupRouteController is created without valid route id.", bundle5);
                                    break;
                                }
                            } else {
                                Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                                break;
                            }
                        case 7:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle6 = (Bundle) obj;
                                if (t0Var.f != 0) {
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
                                    if (z0Var.y == t0Var) {
                                        int size3 = arrayList.size();
                                        int i21 = 0;
                                        while (true) {
                                            if (i21 < size3) {
                                                Object obj3 = arrayList.get(i21);
                                                i21++;
                                                u0 u0Var3 = (u0) obj3;
                                                if (u0Var3.b() == i17) {
                                                    u0Var2 = u0Var3;
                                                }
                                            }
                                        }
                                        if (u0Var2 instanceof x0) {
                                            ((x0) u0Var2).l(nVar, arrayList2);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 8:
                            if (z0Var.y == t0Var) {
                                int size4 = arrayList.size();
                                int i22 = 0;
                                while (true) {
                                    if (i22 < size4) {
                                        Object obj4 = arrayList.get(i22);
                                        i22++;
                                        u0 u0Var4 = (u0) obj4;
                                        if (u0Var4.b() == i17) {
                                            u0Var = u0Var4;
                                        }
                                    }
                                }
                                a1.c cVar = z0Var.C;
                                if (cVar != null && (u0Var instanceof s)) {
                                    s sVar = (s) u0Var;
                                    e eVar = (e) ((a1) cVar.b).c;
                                    if (eVar.e == sVar) {
                                        eVar.i(eVar.c(), 2);
                                    }
                                }
                                arrayList.remove(u0Var);
                                u0Var.c();
                                z0Var.r();
                                break;
                            }
                            break;
                    }
                    int i23 = z0.D;
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
                x50 x50Var = (x50) this.b.get();
                if (x50Var != null) {
                    if (i25 == 0) {
                        try {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera start encoder");
                            }
                            x50.a(x50Var, message.arg1 == 1);
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                            x50.b(x50Var, 0, null);
                            Looper.myLooper().quit();
                        }
                    } else if (i25 == 1) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("InstantCamera stop encoder");
                        }
                        x50.b(x50Var, message.arg1, (t50) message.obj);
                        break;
                    } else {
                        long j15 = 0;
                        long j16 = -1;
                        if (i25 == 2) {
                            long j17 = (message.arg1 << 32) | (message.arg2 & 4294967295L);
                            Integer num = (Integer) message.obj;
                            if (!x50Var.A0 && x50Var.E0.O) {
                                try {
                                    x50Var.e(false);
                                } catch (Exception e6) {
                                    FileLog.e(e6);
                                }
                                if (x50Var.t0.equals(num)) {
                                    z4 = false;
                                } else {
                                    x50Var.t0 = num;
                                    z4 = true;
                                }
                                long j18 = x50Var.d0;
                                if (j18 >= 0) {
                                    if (x50Var.c0 == -1) {
                                        x50Var.c0 = j17 - j18;
                                    }
                                    j17 -= x50Var.c0;
                                }
                                if (!z4) {
                                    long j19 = x50Var.P;
                                    if (j19 != -1) {
                                        j10 = j17 - j19;
                                        x50Var.P = j17;
                                        j11 = j10;
                                        x50Var.N = false;
                                        x50Var.L = System.currentTimeMillis();
                                        if (!x50Var.X) {
                                            long j20 = x50Var.W + j10;
                                            x50Var.W = j20;
                                            if (j20 >= 200000000) {
                                                x50Var.X = true;
                                            }
                                        }
                                        x50Var.O += j10;
                                        if (x50Var.Z == -1) {
                                            x50Var.Z = j17 / 1000;
                                            if (BuildVars.LOGS_ENABLED) {
                                                kf.k0.x(new StringBuilder("InstantCamera first video frame was at "), x50Var.Z);
                                            }
                                        }
                                        x50Var.b0 = j17 - x50Var.a0;
                                        x50Var.a0 = j17;
                                        y50 y50Var = x50Var.E0;
                                        floatBuffer = y50Var.w0;
                                        floatBuffer2 = y50Var.v0;
                                        FloatBuffer floatBuffer3 = y50Var.x0;
                                        if (floatBuffer != null || floatBuffer2 == null) {
                                            FileLog.d("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                                            break;
                                        } else {
                                            e50 e50Var = x50Var.u0;
                                            int i26 = 36160;
                                            if (e50Var != null) {
                                                GLES20.glBindFramebuffer(36160, e50Var.j[0]);
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, e50Var.k[0], 0);
                                                GLES20.glViewport(0, 0, e50Var.a, e50Var.b);
                                            }
                                            GLES20.glUseProgram(x50Var.j0);
                                            GLES20.glActiveTexture(33984);
                                            GLES20.glVertexAttribPointer(x50Var.m0, 3, 5126, false, 12, (Buffer) floatBuffer2);
                                            GLES20.glEnableVertexAttribArray(x50Var.m0);
                                            GLES20.glVertexAttribPointer(x50Var.n0, 2, 5126, false, 8, (Buffer) floatBuffer);
                                            GLES20.glEnableVertexAttribArray(x50Var.n0);
                                            GLES20.glUniformMatrix4fv(x50Var.k0, 1, false, x50Var.E0.s0, 0);
                                            GLES20.glUniform2f(x50Var.o0, x50Var.d, x50Var.e);
                                            y50 y50Var2 = x50Var.E0;
                                            if (y50Var2.R[0] == 0 || floatBuffer3 == null || y50Var2.m0) {
                                                i10 = 36197;
                                                i11 = 33984;
                                            } else {
                                                if (!x50Var.n) {
                                                    GLES20.glEnable(3042);
                                                    x50Var.n = true;
                                                }
                                                if (x50Var.E0.A0 != null) {
                                                    i11 = 33984;
                                                    GLES20.glUniform2f(x50Var.p0, r2.getWidth(), x50Var.E0.A0.getHeight());
                                                } else {
                                                    i11 = 33984;
                                                }
                                                GLES20.glVertexAttribPointer(x50Var.n0, 2, 5126, false, 8, (Buffer) floatBuffer3);
                                                GLES20.glUniformMatrix4fv(x50Var.l0, 1, false, x50Var.E0.u0, 0);
                                                GLES20.glUniform1f(x50Var.r0, 1.0f);
                                                GLES20.glBindTexture(36197, x50Var.E0.R[0]);
                                                i10 = 36197;
                                                GLES20.glDrawArrays(5, 0, 4);
                                            }
                                            y50 y50Var3 = x50Var.E0;
                                            Size[] sizeArr = y50Var3.f0;
                                            if (sizeArr != null) {
                                                int i27 = x50Var.p0;
                                                float width = sizeArr[y50Var3.X0].getWidth();
                                                y50 y50Var4 = x50Var.E0;
                                                GLES20.glUniform2f(i27, width, y50Var4.f0[y50Var4.X0].getHeight());
                                                int i28 = x50Var.q0;
                                                y50 y50Var5 = x50Var.E0;
                                                y50 y50Var6 = x50Var.E0;
                                                GLES20.glUniform2f(i28, (1.0f / y50Var5.f0[y50Var5.X0].getWidth()) / 2.0f, (1.0f / y50Var6.f0[y50Var6.X0].getHeight()) / 2.0f);
                                            }
                                            y50 y50Var7 = x50Var.E0;
                                            int i29 = y50Var7.Q[y50Var7.X0];
                                            if (i29 != Integer.MIN_VALUE) {
                                                i12 = 0;
                                                GLES20.glUniformMatrix4fv(x50Var.l0, 1, false, x50Var.E0.t0, 0);
                                                GLES20.glUniform1f(x50Var.r0, x50Var.E0.S);
                                                GLES20.glBindTexture(i10, i29);
                                                GLES20.glDrawArrays(5, 0, 4);
                                            } else {
                                                i12 = 0;
                                            }
                                            GLES20.glDisableVertexAttribArray(x50Var.m0);
                                            GLES20.glDisableVertexAttribArray(x50Var.n0);
                                            GLES20.glBindTexture(i10, i12);
                                            GLES20.glUseProgram(i12);
                                            e50 e50Var2 = x50Var.u0;
                                            if (e50Var2 != null) {
                                                GLES20.glDisable(3042);
                                                d50 d50Var = e50Var2.c;
                                                int[] iArr = e50Var2.k;
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], i12);
                                                GLES20.glViewport(i12, i12, 48, 48);
                                                GLES20.glUseProgram(d50Var.a);
                                                int i30 = d50Var.d;
                                                f10 = 1.0f;
                                                FloatBuffer floatBuffer4 = e50Var2.g;
                                                GLES20.glVertexAttribPointer(i30, 3, 5126, false, 12, floatBuffer4.position(i12));
                                                int i31 = d50Var.d;
                                                GLES20.glEnableVertexAttribArray(i31);
                                                int i32 = d50Var.e;
                                                FloatBuffer floatBuffer5 = e50Var2.h;
                                                GLES20.glVertexAttribPointer(i32, 2, 5126, false, 8, floatBuffer5.position(i12));
                                                int i33 = d50Var.e;
                                                GLES20.glEnableVertexAttribArray(i33);
                                                GLES20.glActiveTexture(i11);
                                                GLES20.glBindTexture(3553, iArr[i12]);
                                                GLES20.glUniform1i(d50Var.f, i12);
                                                GLES20.glDrawArrays(5, i12, 4);
                                                GLES20.glBindTexture(3553, i12);
                                                GLES20.glDisableVertexAttribArray(i33);
                                                GLES20.glDisableVertexAttribArray(i31);
                                                GLES20.glUseProgram(i12);
                                                int i34 = 0;
                                                while (i34 < i14) {
                                                    b50 b50Var = e50Var2.e;
                                                    GLES20.glFramebufferTexture2D(i26, 36064, 3553, iArr[i34 == 0 ? (char) 2 : (char) 1], i12);
                                                    GLES20.glViewport(i12, i12, 48, 48);
                                                    int i35 = b50Var.a;
                                                    int i36 = b50Var.e;
                                                    int i37 = b50Var.d;
                                                    GLES20.glUseProgram(i35);
                                                    GLES20.glVertexAttribPointer(b50Var.d, 3, 5126, false, 12, floatBuffer4.position(i12));
                                                    GLES20.glEnableVertexAttribArray(i37);
                                                    GLES20.glVertexAttribPointer(b50Var.e, 2, 5126, false, 8, floatBuffer5.position(i12));
                                                    GLES20.glEnableVertexAttribArray(i36);
                                                    GLES20.glActiveTexture(i11);
                                                    GLES20.glBindTexture(3553, iArr[i34 == 0 ? (char) 1 : (char) 2]);
                                                    i12 = 0;
                                                    GLES20.glUniform1i(b50Var.f, 0);
                                                    GLES20.glUniform2f(b50Var.g, i34 == 0 ? 0.020833334f : 0.0f, i34 == 1 ? 0.020833334f : 0.0f);
                                                    GLES20.glDrawArrays(5, 0, 4);
                                                    GLES20.glBindTexture(3553, 0);
                                                    GLES20.glDisableVertexAttribArray(i36);
                                                    GLES20.glDisableVertexAttribArray(i37);
                                                    GLES20.glUseProgram(0);
                                                    i34++;
                                                    i14 = 2;
                                                    i26 = 36160;
                                                }
                                                c50 c50Var = e50Var2.f;
                                                GLES20.glBindFramebuffer(36160, i12);
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], i12);
                                                GLES20.glViewport(i12, i12, e50Var2.a, e50Var2.b);
                                                GLES20.glUseProgram(c50Var.a);
                                                GLES20.glVertexAttribPointer(c50Var.d, 3, 5126, false, 12, floatBuffer4.position(i12));
                                                GLES20.glEnableVertexAttribArray(c50Var.d);
                                                GLES20.glVertexAttribPointer(c50Var.e, 2, 5126, false, 8, floatBuffer5.position(i12));
                                                GLES20.glEnableVertexAttribArray(c50Var.e);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, iArr[1]);
                                                GLES20.glActiveTexture(i11);
                                                GLES20.glBindTexture(3553, iArr[0]);
                                                GLES20.glUniform1i(c50Var.f, 0);
                                                GLES20.glUniform1i(c50Var.g, 1);
                                                GLES20.glUniform2f(c50Var.h, e50Var2.a / 2.0f, e50Var2.b / 2.0f);
                                                GLES20.glDrawArrays(5, 0, 4);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glActiveTexture(i11);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glDisableVertexAttribArray(c50Var.e);
                                                GLES20.glDisableVertexAttribArray(c50Var.d);
                                                GLES20.glUseProgram(0);
                                                d50 d50Var2 = e50Var2.d;
                                                GLES20.glEnable(3042);
                                                int i38 = d50Var2.a;
                                                int i39 = d50Var2.e;
                                                int i40 = d50Var2.d;
                                                GLES20.glUseProgram(i38);
                                                GLES20.glActiveTexture(i11);
                                                for (int i41 = 0; i41 < 2; i41++) {
                                                    if (i41 == 0) {
                                                        GLES20.glVertexAttribPointer(d50Var2.d, 3, 5126, false, 12, floatBuffer4.position(12));
                                                        GLES20.glEnableVertexAttribArray(i40);
                                                        GLES20.glVertexAttribPointer(d50Var2.e, 2, 5126, false, 8, floatBuffer5.position(8));
                                                        GLES20.glEnableVertexAttribArray(i39);
                                                        GLES20.glBindTexture(3553, iArr[3]);
                                                        i13 = 4;
                                                    } else {
                                                        int i42 = e50Var2.i;
                                                        e50Var2.i = i42 + 1;
                                                        GLES20.glVertexAttribPointer(d50Var2.d, 3, 5126, false, 12, floatBuffer4.position(24));
                                                        GLES20.glEnableVertexAttribArray(i40);
                                                        GLES20.glVertexAttribPointer(d50Var2.e, 2, 5126, false, 8, floatBuffer5.position(((i42 % 27) * 8) + 16));
                                                        GLES20.glEnableVertexAttribArray(i39);
                                                        i13 = 4;
                                                        GLES20.glBindTexture(3553, iArr[4]);
                                                    }
                                                    GLES20.glUniform1i(d50Var2.f, 0);
                                                    GLES20.glDrawArrays(5, 0, i13);
                                                    GLES20.glBindTexture(3553, 0);
                                                    GLES20.glDisableVertexAttribArray(i39);
                                                    GLES20.glDisableVertexAttribArray(i40);
                                                }
                                                GLES20.glUseProgram(0);
                                                GLES20.glDisable(3042);
                                                if (x50Var.n) {
                                                    GLES20.glEnable(3042);
                                                }
                                            } else {
                                                f10 = 1.0f;
                                            }
                                            EGLExt.eglPresentationTimeANDROID(x50Var.s, x50Var.y, x50Var.O);
                                            EGL14.eglSwapBuffers(x50Var.s, x50Var.y);
                                            if (x50Var.y0 != null && SharedConfig.getDevicePerformanceClass() == 2 && x50Var.z0 % 33 == 0) {
                                                x50Var.y0.postRunnable(new m2.b(x50Var, 23));
                                            }
                                            x50Var.z0++;
                                            y50 y50Var8 = x50Var.E0;
                                            if (y50Var8.R[0] != 0) {
                                                float f13 = y50Var8.S;
                                                if (f13 < f10 && !y50Var8.m0) {
                                                    float f14 = (j11 / 2.0E8f) + f13;
                                                    y50Var8.S = f14;
                                                    if (f14 > f10) {
                                                        GLES20.glDisable(3042);
                                                        x50Var.n = false;
                                                        y50 y50Var9 = x50Var.E0;
                                                        y50Var9.S = 1.0f;
                                                        GLES20.glDeleteTextures(1, y50Var9.R, 0);
                                                        y50 y50Var10 = x50Var.E0;
                                                        y50Var10.R[0] = 0;
                                                        if (!y50Var10.C) {
                                                            x50Var.E0.C = true;
                                                            AndroidUtilities.runOnUIThread(new u50(x50Var, 6));
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!y50Var8.C) {
                                                x50Var.E0.C = true;
                                                AndroidUtilities.runOnUIThread(new u50(x50Var, 7));
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (x50Var.O != 0 && !x50Var.N) {
                                    j10 = j17 - x50Var.P;
                                    long currentTimeMillis = (System.currentTimeMillis() - x50Var.L) * 1000000;
                                    if (j10 < 0 || Math.abs(currentTimeMillis - j10) > 100000000) {
                                        j10 = currentTimeMillis;
                                    }
                                    break;
                                }
                                j10 = 0;
                                x50Var.P = j17;
                                j11 = 0;
                                x50Var.N = false;
                                x50Var.L = System.currentTimeMillis();
                                if (!x50Var.X) {
                                }
                                x50Var.O += j10;
                                if (x50Var.Z == -1) {
                                }
                                x50Var.b0 = j17 - x50Var.a0;
                                x50Var.a0 = j17;
                                y50 y50Var11 = x50Var.E0;
                                floatBuffer = y50Var11.w0;
                                floatBuffer2 = y50Var11.v0;
                                FloatBuffer floatBuffer32 = y50Var11.x0;
                                if (floatBuffer != null) {
                                }
                                FileLog.d("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                            }
                        } else if (i25 == 3) {
                            n50 n50Var = (n50) message.obj;
                            if (!x50Var.A0 && !x50Var.i0) {
                                x50Var.I.add(n50Var);
                                if (x50Var.e0 == -1) {
                                    if (x50Var.Z == -1) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("InstantCamera video record not yet started");
                                            break;
                                        }
                                    } else {
                                        while (true) {
                                            int i43 = 0;
                                            while (i43 < n50Var.d) {
                                                if (i43 != 0 || Math.abs(x50Var.Z - n50Var.b[i43]) <= 10000000) {
                                                    j12 = j16;
                                                    long j21 = n50Var.b[i43];
                                                    if (j21 >= x50Var.Z) {
                                                        n50Var.e = i43;
                                                        x50Var.e0 = j21;
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            kf.k0.x(kf.k0.m(i43, "InstantCamera found first audio frame at ", " timestamp = "), n50Var.b[i43]);
                                                        }
                                                    } else {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            kf.k0.x(kf.k0.m(i43, "InstantCamera ignore first audio frame at ", " timestamp = "), n50Var.b[i43]);
                                                        }
                                                        i43++;
                                                        j16 = j12;
                                                    }
                                                } else {
                                                    long j22 = x50Var.Z;
                                                    j12 = j16;
                                                    long j23 = n50Var.b[i43];
                                                    x50Var.Y = j22 - j23;
                                                    x50Var.e0 = j23;
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        kf.k0.x(new StringBuilder("InstantCamera detected desync between audio and video "), x50Var.Y);
                                                    }
                                                }
                                            }
                                            long j24 = j16;
                                            if (BuildVars.LOGS_ENABLED) {
                                                kf.k0.t(n50Var.d, new StringBuilder("InstantCamera first audio frame not found, removing buffers "));
                                            }
                                            x50Var.I.remove(n50Var);
                                            if (x50Var.I.isEmpty()) {
                                                break;
                                            } else {
                                                n50Var = (n50) x50Var.I.get(0);
                                                j16 = j24;
                                            }
                                        }
                                    }
                                } else {
                                    j12 = -1;
                                }
                                if (x50Var.M == j12) {
                                    x50Var.M = n50Var.b[n50Var.e];
                                }
                                if (x50Var.I.size() > 1) {
                                    n50Var = (n50) x50Var.I.get(0);
                                }
                                n50 n50Var2 = n50Var;
                                try {
                                    x50Var.e(false);
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                                boolean z10 = false;
                                while (n50Var2 != null) {
                                    try {
                                        int dequeueInputBuffer = x50Var.C.dequeueInputBuffer(j15);
                                        if (dequeueInputBuffer >= 0) {
                                            ByteBuffer inputBuffer = x50Var.C.getInputBuffer(dequeueInputBuffer);
                                            long[] jArr = n50Var2.b;
                                            int i44 = n50Var2.e;
                                            long j25 = jArr[i44];
                                            while (true) {
                                                int i45 = n50Var2.d;
                                                if (i44 <= i45) {
                                                    if (i44 < i45) {
                                                        j13 = j15;
                                                        long j26 = n50Var2.b[i44] - x50Var.M;
                                                        if (x50Var.T) {
                                                            j14 = j25;
                                                        } else {
                                                            j14 = j25;
                                                            if (n50Var2.b[i44] >= x50Var.a0 - x50Var.Y || j26 >= 60000000) {
                                                            }
                                                        }
                                                        if (inputBuffer.remaining() < n50Var2.c[i44]) {
                                                            n50Var2.e = i44;
                                                        } else {
                                                            inputBuffer.put(n50Var2.a[i44]);
                                                        }
                                                    } else {
                                                        j13 = j15;
                                                        j14 = j25;
                                                    }
                                                    if (i44 >= n50Var2.d - 1) {
                                                        x50Var.I.remove(n50Var2);
                                                        if (x50Var.T) {
                                                            x50Var.w0.put(n50Var2);
                                                        }
                                                        if (x50Var.I.isEmpty()) {
                                                            z10 = n50Var2.f;
                                                        } else {
                                                            n50Var2 = (n50) x50Var.I.get(0);
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
                                            n50Var2 = null;
                                            long j27 = j14 == j13 ? j13 : j14 - x50Var.M;
                                            long j28 = x50Var.h0;
                                            if (j28 >= j13) {
                                                j27 += j28;
                                            }
                                            long j29 = j27;
                                            x50Var.g0 = j29 - x50Var.f0;
                                            x50Var.f0 = j29;
                                            x50Var.C.queueInputBuffer(dequeueInputBuffer, 0, inputBuffer.position(), j29, z10 ? 4 : 0);
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
                            x50Var.A0 = true;
                            File file = x50Var.E0.V;
                            if (file != null) {
                                file.delete();
                                x50Var.E0.V = null;
                            }
                            y50 y50Var12 = x50Var.E0;
                            y50Var12.V = t6.x(y50Var12.a, true);
                            try {
                                FileLog.d("InstantCamera handlePauseRecording drain encoders");
                                x50Var.e(false);
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            MP4Builder mP4Builder = x50Var.H;
                            if (mP4Builder != null) {
                                try {
                                    mP4Builder.finishMovie(x50Var.E0.V);
                                } catch (Exception e12) {
                                    FileLog.e(e12);
                                }
                            }
                            AndroidUtilities.runOnUIThread(new u50(x50Var, i14));
                            break;
                        } else if (i25 == 5) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera resume encoder");
                            }
                            x50Var.A0 = false;
                            break;
                        }
                    }
                }
                break;
        }
    }

    public v0(t0 t0Var) {
        this.a = 0;
        this.b = new WeakReference(t0Var);
    }
}
