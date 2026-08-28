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
import kh.a8;
import m.i3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.camera.Size;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.ui.Components.b50;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.l40;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.z40;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class v0 extends Handler {
    public final /* synthetic */ int a;
    public WeakReference b;

    public /* synthetic */ v0(int i9) {
        this.a = i9;
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
        p pVar;
        boolean z10;
        long j10;
        long j11;
        FloatBuffer floatBuffer;
        FloatBuffer floatBuffer2;
        int i9;
        int i10;
        int i11;
        float f10;
        int i12;
        long j12;
        long j13;
        long j14;
        t0 t0Var = null;
        t0 t0Var2 = null;
        int i13 = 2;
        switch (this.a) {
            case 0:
                s0 s0Var = (s0) this.b.get();
                if (s0Var != null) {
                    SparseArray sparseArray = s0Var.h;
                    z0 z0Var = s0Var.i;
                    ArrayList arrayList = z0Var.v;
                    int i14 = message.what;
                    int i15 = message.arg1;
                    int i16 = message.arg2;
                    Object obj = message.obj;
                    Bundle peekData = message.peekData();
                    switch (i14) {
                        case 0:
                            if (i15 == s0Var.g) {
                                s0Var.g = 0;
                                if (z0Var.y == s0Var) {
                                    z0Var.q();
                                }
                            }
                            if (((w0) sparseArray.get(i15)) != null) {
                                sparseArray.remove(i15);
                                w0.a(null, null);
                                break;
                            }
                            break;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (s0Var.f == 0 && i15 == s0Var.g && i16 >= 1) {
                                    s0Var.g = 0;
                                    s0Var.f = i16;
                                    t f11 = t.f(bundle);
                                    if (z0Var.y == s0Var) {
                                        z0Var.g(f11);
                                    }
                                    if (z0Var.y == s0Var) {
                                        z0Var.A = true;
                                        int size = arrayList.size();
                                        for (int i17 = 0; i17 < size; i17++) {
                                            ((t0) arrayList.get(i17)).a(z0Var.y);
                                        }
                                        o oVar = (o) z0Var.h;
                                        if (oVar != null) {
                                            s0 s0Var2 = z0Var.y;
                                            int i18 = s0Var2.d;
                                            s0Var2.d = i18 + 1;
                                            s0Var2.b(10, i18, 0, oVar.a, null);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                w0 w0Var = (w0) sparseArray.get(i15);
                                if (w0Var != null) {
                                    sparseArray.remove(i15);
                                    w0Var.b(bundle2);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                String string = peekData != null ? peekData.getString("error") : null;
                                Bundle bundle3 = (Bundle) obj;
                                if (((w0) sparseArray.get(i15)) != null) {
                                    sparseArray.remove(i15);
                                    w0.a(string, bundle3);
                                    break;
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (s0Var.f != 0) {
                                    t f12 = t.f(bundle4);
                                    if (z0Var.y == s0Var) {
                                        z0Var.g(f12);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 6:
                            if (obj instanceof Bundle) {
                                Bundle bundle5 = (Bundle) obj;
                                w0 w0Var2 = (w0) sparseArray.get(i15);
                                if (bundle5.containsKey("routeId")) {
                                    sparseArray.remove(i15);
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
                                if (s0Var.f != 0) {
                                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                    n nVar = bundle7 != null ? new n(bundle7) : null;
                                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                    ArrayList arrayList2 = new ArrayList();
                                    int size2 = parcelableArrayList.size();
                                    int i19 = 0;
                                    while (i19 < size2) {
                                        Object obj2 = parcelableArrayList.get(i19);
                                        i19++;
                                        Bundle bundle8 = (Bundle) obj2;
                                        if (bundle8 == null) {
                                            pVar = null;
                                        } else {
                                            Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                            pVar = new p(bundle9 != null ? new n(bundle9) : null, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                        }
                                        arrayList2.add(pVar);
                                    }
                                    if (z0Var.y == s0Var) {
                                        int size3 = arrayList.size();
                                        int i20 = 0;
                                        while (true) {
                                            if (i20 < size3) {
                                                Object obj3 = arrayList.get(i20);
                                                i20++;
                                                t0 t0Var3 = (t0) obj3;
                                                if (t0Var3.b() == i16) {
                                                    t0Var2 = t0Var3;
                                                }
                                            }
                                        }
                                        if (t0Var2 instanceof x0) {
                                            ((x0) t0Var2).l(nVar, arrayList2);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 8:
                            if (z0Var.y == s0Var) {
                                int size4 = arrayList.size();
                                int i21 = 0;
                                while (true) {
                                    if (i21 < size4) {
                                        Object obj4 = arrayList.get(i21);
                                        i21++;
                                        t0 t0Var4 = (t0) obj4;
                                        if (t0Var4.b() == i16) {
                                            t0Var = t0Var4;
                                        }
                                    }
                                }
                                a1.c cVar = z0Var.B;
                                if (cVar != null && (t0Var instanceof r)) {
                                    r rVar = (r) t0Var;
                                    e eVar = (e) ((a1) cVar.b).c;
                                    if (eVar.e == rVar) {
                                        eVar.i(eVar.c(), 2);
                                    }
                                }
                                arrayList.remove(t0Var);
                                t0Var.c();
                                z0Var.r();
                                break;
                            }
                            break;
                    }
                    int i22 = z0.C;
                    break;
                }
                break;
            case 1:
                int i23 = message.what;
                if (i23 == -3 || i23 == -2 || i23 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.b.get(), message.what);
                    break;
                } else if (i23 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            default:
                int i24 = message.what;
                e50 e50Var = (e50) this.b.get();
                if (e50Var != null) {
                    if (i24 == 0) {
                        try {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera start encoder");
                            }
                            e50.a(e50Var, message.arg1 == 1);
                            break;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            e50.b(e50Var, 0, null);
                            Looper.myLooper().quit();
                        }
                    } else if (i24 == 1) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("InstantCamera stop encoder");
                        }
                        e50.b(e50Var, message.arg1, (z40) message.obj);
                        break;
                    } else {
                        long j15 = 0;
                        long j16 = -1;
                        if (i24 == 2) {
                            long j17 = (message.arg1 << 32) | (message.arg2 & 4294967295L);
                            Integer num = (Integer) message.obj;
                            if (!e50Var.z0 && e50Var.D0.N) {
                                try {
                                    e50Var.e(false);
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                }
                                if (e50Var.s0.equals(num)) {
                                    z10 = false;
                                } else {
                                    e50Var.s0 = num;
                                    z10 = true;
                                }
                                long j18 = e50Var.c0;
                                if (j18 >= 0) {
                                    if (e50Var.b0 == -1) {
                                        e50Var.b0 = j17 - j18;
                                    }
                                    j17 -= e50Var.b0;
                                }
                                if (!z10) {
                                    long j19 = e50Var.O;
                                    if (j19 != -1) {
                                        j10 = j17 - j19;
                                        e50Var.O = j17;
                                        j11 = j10;
                                        e50Var.M = false;
                                        e50Var.K = System.currentTimeMillis();
                                        if (!e50Var.W) {
                                            long j20 = e50Var.V + j10;
                                            e50Var.V = j20;
                                            if (j20 >= 200000000) {
                                                e50Var.W = true;
                                            }
                                        }
                                        e50Var.N += j10;
                                        if (e50Var.Y == -1) {
                                            e50Var.Y = j17 / 1000;
                                            if (BuildVars.LOGS_ENABLED) {
                                                j3.r0.z(new StringBuilder("InstantCamera first video frame was at "), e50Var.Y);
                                            }
                                        }
                                        e50Var.a0 = j17 - e50Var.Z;
                                        e50Var.Z = j17;
                                        f50 f50Var = e50Var.D0;
                                        floatBuffer = f50Var.v0;
                                        floatBuffer2 = f50Var.u0;
                                        FloatBuffer floatBuffer3 = f50Var.w0;
                                        if (floatBuffer != null || floatBuffer2 == null) {
                                            FileLog.d("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                                            break;
                                        } else {
                                            l40 l40Var = e50Var.t0;
                                            int i25 = 36160;
                                            if (l40Var != null) {
                                                GLES20.glBindFramebuffer(36160, l40Var.j[0]);
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, l40Var.k[0], 0);
                                                GLES20.glViewport(0, 0, l40Var.a, l40Var.b);
                                            }
                                            GLES20.glUseProgram(e50Var.i0);
                                            GLES20.glActiveTexture(33984);
                                            GLES20.glVertexAttribPointer(e50Var.l0, 3, 5126, false, 12, (Buffer) floatBuffer2);
                                            GLES20.glEnableVertexAttribArray(e50Var.l0);
                                            GLES20.glVertexAttribPointer(e50Var.m0, 2, 5126, false, 8, (Buffer) floatBuffer);
                                            GLES20.glEnableVertexAttribArray(e50Var.m0);
                                            GLES20.glUniformMatrix4fv(e50Var.j0, 1, false, e50Var.D0.r0, 0);
                                            GLES20.glUniform2f(e50Var.n0, e50Var.d, e50Var.e);
                                            f50 f50Var2 = e50Var.D0;
                                            if (f50Var2.Q[0] == 0 || floatBuffer3 == null || f50Var2.l0) {
                                                i9 = 36197;
                                                i10 = 33984;
                                            } else {
                                                if (!e50Var.n) {
                                                    GLES20.glEnable(3042);
                                                    e50Var.n = true;
                                                }
                                                if (e50Var.D0.z0 != null) {
                                                    i10 = 33984;
                                                    GLES20.glUniform2f(e50Var.o0, r2.getWidth(), e50Var.D0.z0.getHeight());
                                                } else {
                                                    i10 = 33984;
                                                }
                                                GLES20.glVertexAttribPointer(e50Var.m0, 2, 5126, false, 8, (Buffer) floatBuffer3);
                                                GLES20.glUniformMatrix4fv(e50Var.k0, 1, false, e50Var.D0.t0, 0);
                                                GLES20.glUniform1f(e50Var.q0, 1.0f);
                                                GLES20.glBindTexture(36197, e50Var.D0.Q[0]);
                                                i9 = 36197;
                                                GLES20.glDrawArrays(5, 0, 4);
                                            }
                                            f50 f50Var3 = e50Var.D0;
                                            Size[] sizeArr = f50Var3.e0;
                                            if (sizeArr != null) {
                                                int i26 = e50Var.o0;
                                                float width = sizeArr[f50Var3.W0].getWidth();
                                                f50 f50Var4 = e50Var.D0;
                                                GLES20.glUniform2f(i26, width, f50Var4.e0[f50Var4.W0].getHeight());
                                                int i27 = e50Var.p0;
                                                f50 f50Var5 = e50Var.D0;
                                                f50 f50Var6 = e50Var.D0;
                                                GLES20.glUniform2f(i27, (1.0f / f50Var5.e0[f50Var5.W0].getWidth()) / 2.0f, (1.0f / f50Var6.e0[f50Var6.W0].getHeight()) / 2.0f);
                                            }
                                            f50 f50Var7 = e50Var.D0;
                                            int i28 = f50Var7.P[f50Var7.W0];
                                            if (i28 != Integer.MIN_VALUE) {
                                                i11 = 0;
                                                GLES20.glUniformMatrix4fv(e50Var.k0, 1, false, e50Var.D0.s0, 0);
                                                GLES20.glUniform1f(e50Var.q0, e50Var.D0.R);
                                                GLES20.glBindTexture(i9, i28);
                                                GLES20.glDrawArrays(5, 0, 4);
                                            } else {
                                                i11 = 0;
                                            }
                                            GLES20.glDisableVertexAttribArray(e50Var.l0);
                                            GLES20.glDisableVertexAttribArray(e50Var.m0);
                                            GLES20.glBindTexture(i9, i11);
                                            GLES20.glUseProgram(i11);
                                            l40 l40Var2 = e50Var.t0;
                                            if (l40Var2 != null) {
                                                GLES20.glDisable(3042);
                                                k40 k40Var = l40Var2.c;
                                                int[] iArr = l40Var2.k;
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], i11);
                                                GLES20.glViewport(i11, i11, 48, 48);
                                                GLES20.glUseProgram(k40Var.a);
                                                int i29 = k40Var.d;
                                                f10 = 1.0f;
                                                FloatBuffer floatBuffer4 = l40Var2.g;
                                                GLES20.glVertexAttribPointer(i29, 3, 5126, false, 12, floatBuffer4.position(i11));
                                                int i30 = k40Var.d;
                                                GLES20.glEnableVertexAttribArray(i30);
                                                int i31 = k40Var.e;
                                                FloatBuffer floatBuffer5 = l40Var2.h;
                                                GLES20.glVertexAttribPointer(i31, 2, 5126, false, 8, floatBuffer5.position(i11));
                                                int i32 = k40Var.e;
                                                GLES20.glEnableVertexAttribArray(i32);
                                                GLES20.glActiveTexture(i10);
                                                GLES20.glBindTexture(3553, iArr[i11]);
                                                GLES20.glUniform1i(k40Var.f, i11);
                                                GLES20.glDrawArrays(5, i11, 4);
                                                GLES20.glBindTexture(3553, i11);
                                                GLES20.glDisableVertexAttribArray(i32);
                                                GLES20.glDisableVertexAttribArray(i30);
                                                GLES20.glUseProgram(i11);
                                                int i33 = 0;
                                                while (i33 < i13) {
                                                    i40 i40Var = l40Var2.e;
                                                    GLES20.glFramebufferTexture2D(i25, 36064, 3553, iArr[i33 == 0 ? (char) 2 : (char) 1], i11);
                                                    GLES20.glViewport(i11, i11, 48, 48);
                                                    int i34 = i40Var.a;
                                                    int i35 = i40Var.e;
                                                    int i36 = i40Var.d;
                                                    GLES20.glUseProgram(i34);
                                                    GLES20.glVertexAttribPointer(i40Var.d, 3, 5126, false, 12, floatBuffer4.position(i11));
                                                    GLES20.glEnableVertexAttribArray(i36);
                                                    GLES20.glVertexAttribPointer(i40Var.e, 2, 5126, false, 8, floatBuffer5.position(i11));
                                                    GLES20.glEnableVertexAttribArray(i35);
                                                    GLES20.glActiveTexture(i10);
                                                    GLES20.glBindTexture(3553, iArr[i33 == 0 ? (char) 1 : (char) 2]);
                                                    i11 = 0;
                                                    GLES20.glUniform1i(i40Var.f, 0);
                                                    GLES20.glUniform2f(i40Var.g, i33 == 0 ? 0.020833334f : 0.0f, i33 == 1 ? 0.020833334f : 0.0f);
                                                    GLES20.glDrawArrays(5, 0, 4);
                                                    GLES20.glBindTexture(3553, 0);
                                                    GLES20.glDisableVertexAttribArray(i35);
                                                    GLES20.glDisableVertexAttribArray(i36);
                                                    GLES20.glUseProgram(0);
                                                    i33++;
                                                    i13 = 2;
                                                    i25 = 36160;
                                                }
                                                j40 j40Var = l40Var2.f;
                                                GLES20.glBindFramebuffer(36160, i11);
                                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], i11);
                                                GLES20.glViewport(i11, i11, l40Var2.a, l40Var2.b);
                                                GLES20.glUseProgram(j40Var.a);
                                                GLES20.glVertexAttribPointer(j40Var.d, 3, 5126, false, 12, floatBuffer4.position(i11));
                                                GLES20.glEnableVertexAttribArray(j40Var.d);
                                                GLES20.glVertexAttribPointer(j40Var.e, 2, 5126, false, 8, floatBuffer5.position(i11));
                                                GLES20.glEnableVertexAttribArray(j40Var.e);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, iArr[1]);
                                                GLES20.glActiveTexture(i10);
                                                GLES20.glBindTexture(3553, iArr[0]);
                                                GLES20.glUniform1i(j40Var.f, 0);
                                                GLES20.glUniform1i(j40Var.g, 1);
                                                GLES20.glUniform2f(j40Var.h, l40Var2.a / 2.0f, l40Var2.b / 2.0f);
                                                GLES20.glDrawArrays(5, 0, 4);
                                                GLES20.glActiveTexture(33985);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glActiveTexture(i10);
                                                GLES20.glBindTexture(3553, 0);
                                                GLES20.glDisableVertexAttribArray(j40Var.e);
                                                GLES20.glDisableVertexAttribArray(j40Var.d);
                                                GLES20.glUseProgram(0);
                                                k40 k40Var2 = l40Var2.d;
                                                GLES20.glEnable(3042);
                                                int i37 = k40Var2.a;
                                                int i38 = k40Var2.e;
                                                int i39 = k40Var2.d;
                                                GLES20.glUseProgram(i37);
                                                GLES20.glActiveTexture(i10);
                                                for (int i40 = 0; i40 < 2; i40++) {
                                                    if (i40 == 0) {
                                                        GLES20.glVertexAttribPointer(k40Var2.d, 3, 5126, false, 12, floatBuffer4.position(12));
                                                        GLES20.glEnableVertexAttribArray(i39);
                                                        GLES20.glVertexAttribPointer(k40Var2.e, 2, 5126, false, 8, floatBuffer5.position(8));
                                                        GLES20.glEnableVertexAttribArray(i38);
                                                        GLES20.glBindTexture(3553, iArr[3]);
                                                        i12 = 4;
                                                    } else {
                                                        int i41 = l40Var2.i;
                                                        l40Var2.i = i41 + 1;
                                                        GLES20.glVertexAttribPointer(k40Var2.d, 3, 5126, false, 12, floatBuffer4.position(24));
                                                        GLES20.glEnableVertexAttribArray(i39);
                                                        GLES20.glVertexAttribPointer(k40Var2.e, 2, 5126, false, 8, floatBuffer5.position(((i41 % 27) * 8) + 16));
                                                        GLES20.glEnableVertexAttribArray(i38);
                                                        i12 = 4;
                                                        GLES20.glBindTexture(3553, iArr[4]);
                                                    }
                                                    GLES20.glUniform1i(k40Var2.f, 0);
                                                    GLES20.glDrawArrays(5, 0, i12);
                                                    GLES20.glBindTexture(3553, 0);
                                                    GLES20.glDisableVertexAttribArray(i38);
                                                    GLES20.glDisableVertexAttribArray(i39);
                                                }
                                                GLES20.glUseProgram(0);
                                                GLES20.glDisable(3042);
                                                if (e50Var.n) {
                                                    GLES20.glEnable(3042);
                                                }
                                            } else {
                                                f10 = 1.0f;
                                            }
                                            EGLExt.eglPresentationTimeANDROID(e50Var.s, e50Var.y, e50Var.N);
                                            EGL14.eglSwapBuffers(e50Var.s, e50Var.y);
                                            if (e50Var.x0 != null && SharedConfig.getDevicePerformanceClass() == 2 && e50Var.y0 % 33 == 0) {
                                                e50Var.x0.postRunnable(new i3(e50Var, 21));
                                            }
                                            e50Var.y0++;
                                            f50 f50Var8 = e50Var.D0;
                                            if (f50Var8.Q[0] != 0) {
                                                float f13 = f50Var8.R;
                                                if (f13 < f10 && !f50Var8.l0) {
                                                    float f14 = (j11 / 2.0E8f) + f13;
                                                    f50Var8.R = f14;
                                                    if (f14 > f10) {
                                                        GLES20.glDisable(3042);
                                                        e50Var.n = false;
                                                        f50 f50Var9 = e50Var.D0;
                                                        f50Var9.R = 1.0f;
                                                        GLES20.glDeleteTextures(1, f50Var9.Q, 0);
                                                        f50 f50Var10 = e50Var.D0;
                                                        f50Var10.Q[0] = 0;
                                                        if (!f50Var10.B) {
                                                            e50Var.D0.B = true;
                                                            AndroidUtilities.runOnUIThread(new b50(e50Var, 6));
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!f50Var8.B) {
                                                e50Var.D0.B = true;
                                                AndroidUtilities.runOnUIThread(new b50(e50Var, 7));
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (e50Var.N != 0 && !e50Var.M) {
                                    j10 = j17 - e50Var.O;
                                    long currentTimeMillis = (System.currentTimeMillis() - e50Var.K) * 1000000;
                                    if (j10 < 0 || Math.abs(currentTimeMillis - j10) > 100000000) {
                                        j10 = currentTimeMillis;
                                    }
                                    break;
                                }
                                j10 = 0;
                                e50Var.O = j17;
                                j11 = 0;
                                e50Var.M = false;
                                e50Var.K = System.currentTimeMillis();
                                if (!e50Var.W) {
                                }
                                e50Var.N += j10;
                                if (e50Var.Y == -1) {
                                }
                                e50Var.a0 = j17 - e50Var.Z;
                                e50Var.Z = j17;
                                f50 f50Var11 = e50Var.D0;
                                floatBuffer = f50Var11.v0;
                                floatBuffer2 = f50Var11.u0;
                                FloatBuffer floatBuffer32 = f50Var11.w0;
                                if (floatBuffer != null) {
                                }
                                FileLog.d("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                            }
                        } else if (i24 == 3) {
                            t40 t40Var = (t40) message.obj;
                            if (!e50Var.z0 && !e50Var.h0) {
                                e50Var.H.add(t40Var);
                                if (e50Var.d0 == -1) {
                                    if (e50Var.Y == -1) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("InstantCamera video record not yet started");
                                            break;
                                        }
                                    } else {
                                        while (true) {
                                            int i42 = 0;
                                            while (i42 < t40Var.d) {
                                                if (i42 != 0 || Math.abs(e50Var.Y - t40Var.b[i42]) <= 10000000) {
                                                    j12 = j16;
                                                    long j21 = t40Var.b[i42];
                                                    if (j21 >= e50Var.Y) {
                                                        t40Var.e = i42;
                                                        e50Var.d0 = j21;
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            j3.r0.z(j3.r0.p(i42, "InstantCamera found first audio frame at ", " timestamp = "), t40Var.b[i42]);
                                                        }
                                                    } else {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            j3.r0.z(j3.r0.p(i42, "InstantCamera ignore first audio frame at ", " timestamp = "), t40Var.b[i42]);
                                                        }
                                                        i42++;
                                                        j16 = j12;
                                                    }
                                                } else {
                                                    long j22 = e50Var.Y;
                                                    j12 = j16;
                                                    long j23 = t40Var.b[i42];
                                                    e50Var.X = j22 - j23;
                                                    e50Var.d0 = j23;
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        j3.r0.z(new StringBuilder("InstantCamera detected desync between audio and video "), e50Var.X);
                                                    }
                                                }
                                            }
                                            long j24 = j16;
                                            if (BuildVars.LOGS_ENABLED) {
                                                org.telegram.messenger.l0.n(t40Var.d, new StringBuilder("InstantCamera first audio frame not found, removing buffers "));
                                            }
                                            e50Var.H.remove(t40Var);
                                            if (e50Var.H.isEmpty()) {
                                                break;
                                            } else {
                                                t40Var = (t40) e50Var.H.get(0);
                                                j16 = j24;
                                            }
                                        }
                                    }
                                } else {
                                    j12 = -1;
                                }
                                if (e50Var.L == j12) {
                                    e50Var.L = t40Var.b[t40Var.e];
                                }
                                if (e50Var.H.size() > 1) {
                                    t40Var = (t40) e50Var.H.get(0);
                                }
                                t40 t40Var2 = t40Var;
                                try {
                                    e50Var.e(false);
                                } catch (Exception e12) {
                                    FileLog.e(e12);
                                }
                                boolean z11 = false;
                                while (t40Var2 != null) {
                                    try {
                                        int dequeueInputBuffer = e50Var.B.dequeueInputBuffer(j15);
                                        if (dequeueInputBuffer >= 0) {
                                            ByteBuffer inputBuffer = e50Var.B.getInputBuffer(dequeueInputBuffer);
                                            long[] jArr = t40Var2.b;
                                            int i43 = t40Var2.e;
                                            long j25 = jArr[i43];
                                            while (true) {
                                                int i44 = t40Var2.d;
                                                if (i43 <= i44) {
                                                    if (i43 < i44) {
                                                        j13 = j15;
                                                        long j26 = t40Var2.b[i43] - e50Var.L;
                                                        if (e50Var.S) {
                                                            j14 = j25;
                                                        } else {
                                                            j14 = j25;
                                                            if (t40Var2.b[i43] >= e50Var.Z - e50Var.X || j26 >= 60000000) {
                                                            }
                                                        }
                                                        if (inputBuffer.remaining() < t40Var2.c[i43]) {
                                                            t40Var2.e = i43;
                                                        } else {
                                                            inputBuffer.put(t40Var2.a[i43]);
                                                        }
                                                    } else {
                                                        j13 = j15;
                                                        j14 = j25;
                                                    }
                                                    if (i43 >= t40Var2.d - 1) {
                                                        e50Var.H.remove(t40Var2);
                                                        if (e50Var.S) {
                                                            e50Var.v0.put(t40Var2);
                                                        }
                                                        if (e50Var.H.isEmpty()) {
                                                            z11 = t40Var2.f;
                                                        } else {
                                                            t40Var2 = (t40) e50Var.H.get(0);
                                                        }
                                                    }
                                                    i43++;
                                                    j15 = j13;
                                                    j25 = j14;
                                                } else {
                                                    j13 = j15;
                                                    j14 = j25;
                                                }
                                            }
                                            t40Var2 = null;
                                            long j27 = j14 == j13 ? j13 : j14 - e50Var.L;
                                            long j28 = e50Var.g0;
                                            if (j28 >= j13) {
                                                j27 += j28;
                                            }
                                            long j29 = j27;
                                            e50Var.f0 = j29 - e50Var.e0;
                                            e50Var.e0 = j29;
                                            e50Var.B.queueInputBuffer(dequeueInputBuffer, 0, inputBuffer.position(), j29, z11 ? 4 : 0);
                                        } else {
                                            j13 = j15;
                                        }
                                        j15 = j13;
                                    } catch (Throwable th) {
                                        FileLog.e(th);
                                        return;
                                    }
                                }
                                break;
                            }
                        } else if (i24 == 4) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera pause encoder");
                            }
                            e50Var.z0 = true;
                            File file = e50Var.D0.U;
                            if (file != null) {
                                file.delete();
                                e50Var.D0.U = null;
                            }
                            f50 f50Var12 = e50Var.D0;
                            f50Var12.U = a8.x(f50Var12.a, true);
                            try {
                                FileLog.d("InstantCamera handlePauseRecording drain encoders");
                                e50Var.e(false);
                            } catch (Exception e13) {
                                FileLog.e(e13);
                            }
                            MP4Builder mP4Builder = e50Var.G;
                            if (mP4Builder != null) {
                                try {
                                    mP4Builder.finishMovie(e50Var.D0.U);
                                } catch (Exception e14) {
                                    FileLog.e(e14);
                                }
                            }
                            AndroidUtilities.runOnUIThread(new b50(e50Var, i13));
                            break;
                        } else if (i24 == 5) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera resume encoder");
                            }
                            e50Var.z0 = false;
                            break;
                        }
                    }
                }
                break;
        }
    }

    public v0(s0 s0Var) {
        this.a = 0;
        this.b = new WeakReference(s0Var);
    }
}
