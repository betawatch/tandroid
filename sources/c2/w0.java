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
import j7.l1;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import lh.m7;
import nh.o7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.camera.Size;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.ui.Components.h50;
import org.telegram.ui.Components.n50;
import org.telegram.ui.Components.o50;
import org.telegram.ui.Components.r50;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.w40;
import org.telegram.ui.Components.x40;
import org.telegram.ui.Components.y40;
import org.telegram.ui.Components.z40;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class w0 extends Handler {
    public final /* synthetic */ int a;
    public WeakReference b;

    public /* synthetic */ w0(int i10) {
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
    
        org.telegram.messenger.FileLog.d("InstantCamera stop audio encoding because of stoped video recording at " + r2.b[r12] + " last video " + r7.Z);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01e5, code lost:
    
        r7.h0 = true;
        r7.H.clear();
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
        boolean z10;
        long j10;
        long j11;
        FloatBuffer floatBuffer;
        FloatBuffer floatBuffer2;
        int i10;
        int i11;
        int i12;
        float f9;
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
                    a1 a1Var = t0Var.i;
                    ArrayList arrayList = a1Var.v;
                    int i15 = message.what;
                    int i16 = message.arg1;
                    int i17 = message.arg2;
                    Object obj = message.obj;
                    Bundle peekData = message.peekData();
                    switch (i15) {
                        case 0:
                            if (i16 == t0Var.g) {
                                t0Var.g = 0;
                                if (a1Var.y == t0Var) {
                                    a1Var.q();
                                }
                            }
                            if (((x0) sparseArray.get(i16)) != null) {
                                sparseArray.remove(i16);
                                x0.a(null, null);
                                break;
                            }
                            break;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (t0Var.f == 0 && i16 == t0Var.g && i17 >= 1) {
                                    t0Var.g = 0;
                                    t0Var.f = i17;
                                    u f10 = u.f(bundle);
                                    if (a1Var.y == t0Var) {
                                        a1Var.g(f10);
                                    }
                                    if (a1Var.y == t0Var) {
                                        a1Var.A = true;
                                        int size = arrayList.size();
                                        for (int i18 = 0; i18 < size; i18++) {
                                            ((u0) arrayList.get(i18)).a(a1Var.y);
                                        }
                                        o oVar = (o) a1Var.h;
                                        if (oVar != null) {
                                            t0 t0Var2 = a1Var.y;
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
                                x0 x0Var = (x0) sparseArray.get(i16);
                                if (x0Var != null) {
                                    sparseArray.remove(i16);
                                    x0Var.b(bundle2);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                String string = peekData != null ? peekData.getString("error") : null;
                                Bundle bundle3 = (Bundle) obj;
                                if (((x0) sparseArray.get(i16)) != null) {
                                    sparseArray.remove(i16);
                                    x0.a(string, bundle3);
                                    break;
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (t0Var.f != 0) {
                                    u f11 = u.f(bundle4);
                                    if (a1Var.y == t0Var) {
                                        a1Var.g(f11);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 6:
                            if (obj instanceof Bundle) {
                                Bundle bundle5 = (Bundle) obj;
                                x0 x0Var2 = (x0) sparseArray.get(i16);
                                if (bundle5.containsKey("routeId")) {
                                    sparseArray.remove(i16);
                                    x0Var2.b(bundle5);
                                    break;
                                } else {
                                    x0Var2.getClass();
                                    x0.a("DynamicGroupRouteController is created without valid route id.", bundle5);
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
                                    if (a1Var.y == t0Var) {
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
                                        if (u0Var2 instanceof y0) {
                                            ((y0) u0Var2).l(nVar, arrayList2);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 8:
                            if (a1Var.y == t0Var) {
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
                                a1.c cVar = a1Var.B;
                                if (cVar != null && (u0Var instanceof s)) {
                                    s sVar = (s) u0Var;
                                    e eVar = (e) ((b1) cVar.b).c;
                                    if (eVar.e == sVar) {
                                        eVar.i(eVar.c(), 2);
                                    }
                                }
                                arrayList.remove(u0Var);
                                u0Var.c();
                                a1Var.r();
                                break;
                            }
                            break;
                    }
                    int i23 = a1.C;
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
                r50 r50Var = (r50) this.b.get();
                if (r50Var != null) {
                    if (i25 == 0) {
                        try {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera start encoder");
                            }
                            r50.a(r50Var, message.arg1 == 1);
                            break;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            r50.b(r50Var, 0, null);
                            Looper.myLooper().quit();
                        }
                    } else if (i25 == 1) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("InstantCamera stop encoder");
                        }
                        r50.b(r50Var, message.arg1, (n50) message.obj);
                        break;
                    } else {
                        long j15 = 0;
                        long j16 = -1;
                        if (i25 == 2) {
                            long j17 = (message.arg1 << 32) | (message.arg2 & 4294967295L);
                            Integer num = (Integer) message.obj;
                            if (!r50Var.z0 && r50Var.D0.N) {
                                try {
                                    r50Var.e(false);
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                }
                                if (r50Var.s0.equals(num)) {
                                    z10 = false;
                                } else {
                                    r50Var.s0 = num;
                                    z10 = true;
                                }
                                long j18 = r50Var.c0;
                                if (j18 >= 0) {
                                    if (r50Var.b0 == -1) {
                                        r50Var.b0 = j17 - j18;
                                    }
                                    j17 -= r50Var.b0;
                                }
                                if (!z10) {
                                    long j19 = r50Var.O;
                                    if (j19 != -1) {
                                        j10 = j17 - j19;
                                        r50Var.O = j17;
                                        j11 = j10;
                                        r50Var.M = false;
                                        r50Var.K = System.currentTimeMillis();
                                        if (!r50Var.W) {
                                            long j20 = r50Var.V + j10;
                                            r50Var.V = j20;
                                            if (j20 >= 200000000) {
                                                r50Var.W = true;
                                            }
                                        }
                                        r50Var.N += j10;
                                        if (r50Var.Y == -1) {
                                            r50Var.Y = j17 / 1000;
                                            if (BuildVars.LOGS_ENABLED) {
                                                l1.x(new StringBuilder("InstantCamera first video frame was at "), r50Var.Y);
                                            }
                                        }
                                        r50Var.a0 = j17 - r50Var.Z;
                                        r50Var.Z = j17;
                                        s50 s50Var = r50Var.D0;
                                        floatBuffer = s50Var.v0;
                                        floatBuffer2 = s50Var.u0;
                                        FloatBuffer floatBuffer3 = s50Var.w0;
                                        if (floatBuffer != null || floatBuffer2 == null) {
                                            FileLog.d("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                                            break;
                                        } else {
                                            z40 z40Var = r50Var.t0;
                                            int i26 = 36160;
                                            if (z40Var != null) {
                                                GLES20.glBindFramebuffer(36160, z40Var.j[0]);
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, z40Var.k[0], 0);
                                                GLES20.glViewport(0, 0, z40Var.a, z40Var.b);
                                            }
                                            GLES20.glUseProgram(r50Var.i0);
                                            GLES20.glActiveTexture(33984);
                                            GLES20.glVertexAttribPointer(r50Var.l0, 3, 5126, false, 12, (Buffer) floatBuffer2);
                                            GLES20.glEnableVertexAttribArray(r50Var.l0);
                                            GLES20.glVertexAttribPointer(r50Var.m0, 2, 5126, false, 8, (Buffer) floatBuffer);
                                            GLES20.glEnableVertexAttribArray(r50Var.m0);
                                            GLES20.glUniformMatrix4fv(r50Var.j0, 1, false, r50Var.D0.r0, 0);
                                            GLES20.glUniform2f(r50Var.n0, r50Var.d, r50Var.e);
                                            s50 s50Var2 = r50Var.D0;
                                            if (s50Var2.Q[0] == 0 || floatBuffer3 == null || s50Var2.l0) {
                                                i10 = 36197;
                                                i11 = 33984;
                                            } else {
                                                if (!r50Var.n) {
                                                    GLES20.glEnable(3042);
                                                    r50Var.n = true;
                                                }
                                                if (r50Var.D0.z0 != null) {
                                                    i11 = 33984;
                                                    GLES20.glUniform2f(r50Var.o0, r2.getWidth(), r50Var.D0.z0.getHeight());
                                                } else {
                                                    i11 = 33984;
                                                }
                                                GLES20.glVertexAttribPointer(r50Var.m0, 2, 5126, false, 8, (Buffer) floatBuffer3);
                                                GLES20.glUniformMatrix4fv(r50Var.k0, 1, false, r50Var.D0.t0, 0);
                                                GLES20.glUniform1f(r50Var.q0, 1.0f);
                                                GLES20.glBindTexture(36197, r50Var.D0.Q[0]);
                                                i10 = 36197;
                                                GLES20.glDrawArrays(5, 0, 4);
                                            }
                                            s50 s50Var3 = r50Var.D0;
                                            Size[] sizeArr = s50Var3.e0;
                                            if (sizeArr != null) {
                                                int i27 = r50Var.o0;
                                                float width = sizeArr[s50Var3.W0].getWidth();
                                                s50 s50Var4 = r50Var.D0;
                                                GLES20.glUniform2f(i27, width, s50Var4.e0[s50Var4.W0].getHeight());
                                                int i28 = r50Var.p0;
                                                s50 s50Var5 = r50Var.D0;
                                                s50 s50Var6 = r50Var.D0;
                                                GLES20.glUniform2f(i28, (1.0f / s50Var5.e0[s50Var5.W0].getWidth()) / 2.0f, (1.0f / s50Var6.e0[s50Var6.W0].getHeight()) / 2.0f);
                                            }
                                            s50 s50Var7 = r50Var.D0;
                                            int i29 = s50Var7.P[s50Var7.W0];
                                            if (i29 != Integer.MIN_VALUE) {
                                                i12 = 0;
                                                GLES20.glUniformMatrix4fv(r50Var.k0, 1, false, r50Var.D0.s0, 0);
                                                GLES20.glUniform1f(r50Var.q0, r50Var.D0.R);
                                                GLES20.glBindTexture(i10, i29);
                                                GLES20.glDrawArrays(5, 0, 4);
                                            } else {
                                                i12 = 0;
                                            }
                                            GLES20.glDisableVertexAttribArray(r50Var.l0);
                                            GLES20.glDisableVertexAttribArray(r50Var.m0);
                                            GLES20.glBindTexture(i10, i12);
                                            GLES20.glUseProgram(i12);
                                            z40 z40Var2 = r50Var.t0;
                                            if (z40Var2 != null) {
                                                GLES20.glDisable(3042);
                                                y40 y40Var = z40Var2.c;
                                                int[] iArr = z40Var2.k;
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], i12);
                                                GLES20.glViewport(i12, i12, 48, 48);
                                                GLES20.glUseProgram(y40Var.a);
                                                int i30 = y40Var.d;
                                                f9 = 1.0f;
                                                FloatBuffer floatBuffer4 = z40Var2.g;
                                                GLES20.glVertexAttribPointer(i30, 3, 5126, false, 12, floatBuffer4.position(i12));
                                                int i31 = y40Var.d;
                                                GLES20.glEnableVertexAttribArray(i31);
                                                int i32 = y40Var.e;
                                                FloatBuffer floatBuffer5 = z40Var2.h;
                                                GLES20.glVertexAttribPointer(i32, 2, 5126, false, 8, floatBuffer5.position(i12));
                                                int i33 = y40Var.e;
                                                GLES20.glEnableVertexAttribArray(i33);
                                                GLES20.glActiveTexture(i11);
                                                GLES20.glBindTexture(3553, iArr[i12]);
                                                GLES20.glUniform1i(y40Var.f, i12);
                                                GLES20.glDrawArrays(5, i12, 4);
                                                int i34 = 48;
                                                GLES20.glBindTexture(3553, i12);
                                                GLES20.glDisableVertexAttribArray(i33);
                                                GLES20.glDisableVertexAttribArray(i31);
                                                GLES20.glUseProgram(i12);
                                                int i35 = 0;
                                                while (i35 < i14) {
                                                    w40 w40Var = z40Var2.e;
                                                    GLES20.glFramebufferTexture2D(i26, 36064, 3553, iArr[i35 == 0 ? (char) 2 : (char) 1], i12);
                                                    GLES20.glViewport(i12, i12, i34, i34);
                                                    int i36 = w40Var.a;
                                                    int i37 = w40Var.e;
                                                    int i38 = w40Var.d;
                                                    GLES20.glUseProgram(i36);
                                                    GLES20.glVertexAttribPointer(w40Var.d, 3, 5126, false, 12, floatBuffer4.position(i12));
                                                    GLES20.glEnableVertexAttribArray(i38);
                                                    GLES20.glVertexAttribPointer(w40Var.e, 2, 5126, false, 8, floatBuffer5.position(i12));
                                                    GLES20.glEnableVertexAttribArray(i37);
                                                    GLES20.glActiveTexture(i11);
                                                    GLES20.glBindTexture(3553, iArr[i35 == 0 ? (char) 1 : (char) 2]);
                                                    i12 = 0;
                                                    GLES20.glUniform1i(w40Var.f, 0);
                                                    GLES20.glUniform2f(w40Var.g, i35 == 0 ? 0.020833334f : 0.0f, i35 == 1 ? 0.020833334f : 0.0f);
                                                    GLES20.glDrawArrays(5, 0, 4);
                                                    GLES20.glBindTexture(3553, 0);
                                                    GLES20.glDisableVertexAttribArray(i37);
                                                    GLES20.glDisableVertexAttribArray(i38);
                                                    GLES20.glUseProgram(0);
                                                    i35++;
                                                    i34 = 48;
                                                    i14 = 2;
                                                    i26 = 36160;
                                                }
                                                x40 x40Var = z40Var2.f;
                                                GLES20.glBindFramebuffer(36160, i12);
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], i12);
                                                GLES20.glViewport(i12, i12, z40Var2.a, z40Var2.b);
                                                GLES20.glUseProgram(x40Var.a);
                                                GLES20.glVertexAttribPointer(x40Var.d, 3, 5126, false, 12, floatBuffer4.position(i12));
                                                GLES20.glEnableVertexAttribArray(x40Var.d);
                                                GLES20.glVertexAttribPointer(x40Var.e, 2, 5126, false, 8, floatBuffer5.position(i12));
                                                GLES20.glEnableVertexAttribArray(x40Var.e);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, iArr[1]);
                                                GLES20.glActiveTexture(i11);
                                                GLES20.glBindTexture(3553, iArr[0]);
                                                GLES20.glUniform1i(x40Var.f, 0);
                                                GLES20.glUniform1i(x40Var.g, 1);
                                                GLES20.glUniform2f(x40Var.h, z40Var2.a / 2.0f, z40Var2.b / 2.0f);
                                                GLES20.glDrawArrays(5, 0, 4);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glActiveTexture(i11);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glDisableVertexAttribArray(x40Var.e);
                                                GLES20.glDisableVertexAttribArray(x40Var.d);
                                                GLES20.glUseProgram(0);
                                                y40 y40Var2 = z40Var2.d;
                                                GLES20.glEnable(3042);
                                                int i39 = y40Var2.a;
                                                int i40 = y40Var2.e;
                                                int i41 = y40Var2.d;
                                                GLES20.glUseProgram(i39);
                                                GLES20.glActiveTexture(i11);
                                                for (int i42 = 0; i42 < 2; i42++) {
                                                    if (i42 == 0) {
                                                        GLES20.glVertexAttribPointer(y40Var2.d, 3, 5126, false, 12, floatBuffer4.position(12));
                                                        GLES20.glEnableVertexAttribArray(i41);
                                                        GLES20.glVertexAttribPointer(y40Var2.e, 2, 5126, false, 8, floatBuffer5.position(8));
                                                        GLES20.glEnableVertexAttribArray(i40);
                                                        GLES20.glBindTexture(3553, iArr[3]);
                                                        i13 = 4;
                                                    } else {
                                                        int i43 = z40Var2.i;
                                                        z40Var2.i = i43 + 1;
                                                        GLES20.glVertexAttribPointer(y40Var2.d, 3, 5126, false, 12, floatBuffer4.position(24));
                                                        GLES20.glEnableVertexAttribArray(i41);
                                                        GLES20.glVertexAttribPointer(y40Var2.e, 2, 5126, false, 8, floatBuffer5.position(((i43 % 27) * 8) + 16));
                                                        GLES20.glEnableVertexAttribArray(i40);
                                                        i13 = 4;
                                                        GLES20.glBindTexture(3553, iArr[4]);
                                                    }
                                                    GLES20.glUniform1i(y40Var2.f, 0);
                                                    GLES20.glDrawArrays(5, 0, i13);
                                                    GLES20.glBindTexture(3553, 0);
                                                    GLES20.glDisableVertexAttribArray(i40);
                                                    GLES20.glDisableVertexAttribArray(i41);
                                                }
                                                GLES20.glUseProgram(0);
                                                GLES20.glDisable(3042);
                                                if (r50Var.n) {
                                                    GLES20.glEnable(3042);
                                                }
                                            } else {
                                                f9 = 1.0f;
                                            }
                                            EGLExt.eglPresentationTimeANDROID(r50Var.s, r50Var.y, r50Var.N);
                                            EGL14.eglSwapBuffers(r50Var.s, r50Var.y);
                                            if (r50Var.x0 != null && SharedConfig.getDevicePerformanceClass() == 2 && r50Var.y0 % 33 == 0) {
                                                r50Var.x0.postRunnable(new m7(r50Var, 24));
                                            }
                                            r50Var.y0++;
                                            s50 s50Var8 = r50Var.D0;
                                            if (s50Var8.Q[0] != 0) {
                                                float f12 = s50Var8.R;
                                                if (f12 < f9 && !s50Var8.l0) {
                                                    float f13 = (j11 / 2.0E8f) + f12;
                                                    s50Var8.R = f13;
                                                    if (f13 > f9) {
                                                        GLES20.glDisable(3042);
                                                        r50Var.n = false;
                                                        s50 s50Var9 = r50Var.D0;
                                                        s50Var9.R = 1.0f;
                                                        GLES20.glDeleteTextures(1, s50Var9.Q, 0);
                                                        s50 s50Var10 = r50Var.D0;
                                                        s50Var10.Q[0] = 0;
                                                        if (!s50Var10.B) {
                                                            r50Var.D0.B = true;
                                                            AndroidUtilities.runOnUIThread(new o50(r50Var, 6));
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!s50Var8.B) {
                                                r50Var.D0.B = true;
                                                AndroidUtilities.runOnUIThread(new o50(r50Var, 7));
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (r50Var.N != 0 && !r50Var.M) {
                                    j10 = j17 - r50Var.O;
                                    long currentTimeMillis = (System.currentTimeMillis() - r50Var.K) * 1000000;
                                    if (j10 < 0 || Math.abs(currentTimeMillis - j10) > 100000000) {
                                        j10 = currentTimeMillis;
                                    }
                                    break;
                                }
                                j10 = 0;
                                r50Var.O = j17;
                                j11 = 0;
                                r50Var.M = false;
                                r50Var.K = System.currentTimeMillis();
                                if (!r50Var.W) {
                                }
                                r50Var.N += j10;
                                if (r50Var.Y == -1) {
                                }
                                r50Var.a0 = j17 - r50Var.Z;
                                r50Var.Z = j17;
                                s50 s50Var11 = r50Var.D0;
                                floatBuffer = s50Var11.v0;
                                floatBuffer2 = s50Var11.u0;
                                FloatBuffer floatBuffer32 = s50Var11.w0;
                                if (floatBuffer != null) {
                                }
                                FileLog.d("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                            }
                        } else if (i25 == 3) {
                            h50 h50Var = (h50) message.obj;
                            if (!r50Var.z0 && !r50Var.h0) {
                                r50Var.H.add(h50Var);
                                if (r50Var.d0 == -1) {
                                    if (r50Var.Y == -1) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("InstantCamera video record not yet started");
                                            break;
                                        }
                                    } else {
                                        while (true) {
                                            int i44 = 0;
                                            while (i44 < h50Var.d) {
                                                if (i44 != 0 || Math.abs(r50Var.Y - h50Var.b[i44]) <= 10000000) {
                                                    j12 = j16;
                                                    long j21 = h50Var.b[i44];
                                                    if (j21 >= r50Var.Y) {
                                                        h50Var.e = i44;
                                                        r50Var.d0 = j21;
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            l1.x(l1.o(i44, "InstantCamera found first audio frame at ", " timestamp = "), h50Var.b[i44]);
                                                        }
                                                    } else {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            l1.x(l1.o(i44, "InstantCamera ignore first audio frame at ", " timestamp = "), h50Var.b[i44]);
                                                        }
                                                        i44++;
                                                        j16 = j12;
                                                    }
                                                } else {
                                                    long j22 = r50Var.Y;
                                                    j12 = j16;
                                                    long j23 = h50Var.b[i44];
                                                    r50Var.X = j22 - j23;
                                                    r50Var.d0 = j23;
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        l1.x(new StringBuilder("InstantCamera detected desync between audio and video "), r50Var.X);
                                                    }
                                                }
                                            }
                                            long j24 = j16;
                                            if (BuildVars.LOGS_ENABLED) {
                                                l1.t(h50Var.d, new StringBuilder("InstantCamera first audio frame not found, removing buffers "));
                                            }
                                            r50Var.H.remove(h50Var);
                                            if (r50Var.H.isEmpty()) {
                                                break;
                                            } else {
                                                h50Var = (h50) r50Var.H.get(0);
                                                j16 = j24;
                                            }
                                        }
                                    }
                                } else {
                                    j12 = -1;
                                }
                                if (r50Var.L == j12) {
                                    r50Var.L = h50Var.b[h50Var.e];
                                }
                                if (r50Var.H.size() > 1) {
                                    h50Var = (h50) r50Var.H.get(0);
                                }
                                h50 h50Var2 = h50Var;
                                try {
                                    r50Var.e(false);
                                } catch (Exception e12) {
                                    FileLog.e(e12);
                                }
                                boolean z11 = false;
                                while (h50Var2 != null) {
                                    try {
                                        int dequeueInputBuffer = r50Var.B.dequeueInputBuffer(j15);
                                        if (dequeueInputBuffer >= 0) {
                                            ByteBuffer inputBuffer = r50Var.B.getInputBuffer(dequeueInputBuffer);
                                            long[] jArr = h50Var2.b;
                                            int i45 = h50Var2.e;
                                            long j25 = jArr[i45];
                                            while (true) {
                                                int i46 = h50Var2.d;
                                                if (i45 <= i46) {
                                                    if (i45 < i46) {
                                                        j13 = j15;
                                                        long j26 = h50Var2.b[i45] - r50Var.L;
                                                        if (r50Var.S) {
                                                            j14 = j25;
                                                        } else {
                                                            j14 = j25;
                                                            if (h50Var2.b[i45] >= r50Var.Z - r50Var.X || j26 >= 60000000) {
                                                            }
                                                        }
                                                        if (inputBuffer.remaining() < h50Var2.c[i45]) {
                                                            h50Var2.e = i45;
                                                        } else {
                                                            inputBuffer.put(h50Var2.a[i45]);
                                                        }
                                                    } else {
                                                        j13 = j15;
                                                        j14 = j25;
                                                    }
                                                    if (i45 >= h50Var2.d - 1) {
                                                        r50Var.H.remove(h50Var2);
                                                        if (r50Var.S) {
                                                            r50Var.v0.put(h50Var2);
                                                        }
                                                        if (r50Var.H.isEmpty()) {
                                                            z11 = h50Var2.f;
                                                        } else {
                                                            h50Var2 = (h50) r50Var.H.get(0);
                                                        }
                                                    }
                                                    i45++;
                                                    j15 = j13;
                                                    j25 = j14;
                                                } else {
                                                    j13 = j15;
                                                    j14 = j25;
                                                }
                                            }
                                            h50Var2 = null;
                                            long j27 = j14 == j13 ? j13 : j14 - r50Var.L;
                                            long j28 = r50Var.g0;
                                            if (j28 >= j13) {
                                                j27 += j28;
                                            }
                                            long j29 = j27;
                                            r50Var.f0 = j29 - r50Var.e0;
                                            r50Var.e0 = j29;
                                            r50Var.B.queueInputBuffer(dequeueInputBuffer, 0, inputBuffer.position(), j29, z11 ? 4 : 0);
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
                            r50Var.z0 = true;
                            File file = r50Var.D0.U;
                            if (file != null) {
                                file.delete();
                                r50Var.D0.U = null;
                            }
                            s50 s50Var12 = r50Var.D0;
                            s50Var12.U = o7.x(s50Var12.a, true);
                            try {
                                FileLog.d("InstantCamera handlePauseRecording drain encoders");
                                r50Var.e(false);
                            } catch (Exception e13) {
                                FileLog.e(e13);
                            }
                            MP4Builder mP4Builder = r50Var.G;
                            if (mP4Builder != null) {
                                try {
                                    mP4Builder.finishMovie(r50Var.D0.U);
                                } catch (Exception e14) {
                                    FileLog.e(e14);
                                }
                            }
                            AndroidUtilities.runOnUIThread(new o50(r50Var, i14));
                            break;
                        } else if (i25 == 5) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera resume encoder");
                            }
                            r50Var.z0 = false;
                            break;
                        }
                    }
                }
                break;
        }
    }

    public w0(t0 t0Var) {
        this.a = 0;
        this.b = new WeakReference(t0Var);
    }
}
