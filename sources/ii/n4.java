package ii;

import ai.o8;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.ub1;
import org.telegram.ui.vt0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class n4 implements k0, k2.o, l.w, l.i, k1.f, yo0, le.f, v71, r0.n, me.a, qg.v1, com.google.android.gms.common.api.internal.o, s4.h1, com.google.android.gms.common.api.internal.s, androidx.lifecycle.s0, w2.d {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ n4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // k2.o
    public void A(k2.l lVar) {
        n4.y yVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new k2.i(yVar, lVar, 0));
        }
    }

    public void C(int i10, int i11, c3.p pVar) {
        char c10;
        char c11;
        long j3;
        int i12;
        int i13;
        int i14;
        int i15;
        u3.d dVar = (u3.d) this.b;
        u3.e eVar = dVar.b;
        SparseArray sparseArray = dVar.c;
        e2.v vVar = dVar.k;
        e2.v vVar2 = dVar.i;
        int i16 = 1;
        int i17 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (dVar.J != 2) {
                    return;
                }
                u3.c cVar = (u3.c) sparseArray.get(dVar.P);
                int i18 = dVar.S;
                e2.v vVar3 = dVar.p;
                if (i18 != 4 || !"V_VP9".equals(cVar.c)) {
                    pVar.o(i11);
                    return;
                } else {
                    vVar3.G(i11);
                    pVar.readFully(vVar3.a, 0, i11);
                    return;
                }
            }
            if (i10 == 16877) {
                dVar.d(i10);
                u3.c cVar2 = dVar.x;
                int i19 = cVar2.h;
                if (i19 != 1685485123 && i19 != 1685480259) {
                    pVar.o(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                cVar2.P = bArr;
                pVar.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 16981) {
                dVar.d(i10);
                byte[] bArr2 = new byte[i11];
                dVar.x.j = bArr2;
                pVar.readFully(bArr2, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr3 = new byte[i11];
                pVar.readFully(bArr3, 0, i11);
                dVar.d(i10);
                dVar.x.k = new c3.g0(1, 0, 0, bArr3);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(vVar.a, (byte) 0);
                pVar.readFully(vVar.a, 4 - i11, i11);
                vVar.J(0);
                dVar.z = (int) vVar.z();
                return;
            }
            if (i10 == 25506) {
                dVar.d(i10);
                byte[] bArr4 = new byte[i11];
                dVar.x.l = bArr4;
                pVar.readFully(bArr4, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw b2.s0.a(null, "Unexpected id: " + i10);
            }
            dVar.d(i10);
            byte[] bArr5 = new byte[i11];
            dVar.x.x = bArr5;
            pVar.readFully(bArr5, 0, i11);
            return;
        }
        if (dVar.J == 0) {
            dVar.P = (int) eVar.b(pVar, false, true, 8);
            dVar.Q = eVar.c;
            dVar.L = -9223372036854775807L;
            dVar.J = 1;
            vVar2.G(0);
        }
        u3.c cVar3 = (u3.c) sparseArray.get(dVar.P);
        if (cVar3 == null) {
            pVar.o(i11 - dVar.Q);
            dVar.J = 0;
            return;
        }
        cVar3.Z.getClass();
        if (dVar.J == 1) {
            dVar.j(pVar, 3);
            int i20 = (vVar2.a[2] & 6) >> 1;
            byte b10 = 255;
            if (i20 == 0) {
                dVar.N = 1;
                int[] iArr = dVar.O;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.O = iArr;
                iArr[0] = (i11 - dVar.Q) - 3;
            } else {
                dVar.j(pVar, 4);
                int i21 = (vVar2.a[3] & 255) + 1;
                dVar.N = i21;
                int[] iArr2 = dVar.O;
                if (iArr2 == null) {
                    iArr2 = new int[i21];
                } else if (iArr2.length < i21) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i21)];
                }
                dVar.O = iArr2;
                if (i20 == 2) {
                    int i22 = (i11 - dVar.Q) - 4;
                    int i23 = dVar.N;
                    Arrays.fill(iArr2, 0, i23, i22 / i23);
                } else {
                    if (i20 != 1) {
                        if (i20 != 3) {
                            throw b2.s0.a(null, "Unexpected lacing value: " + i20);
                        }
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 4;
                        while (true) {
                            int i27 = dVar.N - i16;
                            if (i24 >= i27) {
                                c10 = 1;
                                c11 = 0;
                                dVar.O[i27] = ((i11 - dVar.Q) - i26) - i25;
                                break;
                            }
                            dVar.O[i24] = i17;
                            int i28 = i26 + 1;
                            dVar.j(pVar, i28);
                            if (vVar2.a[i26] == 0) {
                                throw b2.s0.a(null, "No valid varint length mask found");
                            }
                            int i29 = 0;
                            while (true) {
                                if (i29 >= 8) {
                                    j3 = 0;
                                    i12 = i28;
                                    break;
                                }
                                int i30 = 1 << (7 - i29);
                                if ((vVar2.a[i26] & i30) != 0) {
                                    i12 = i28 + i29;
                                    dVar.j(pVar, i12);
                                    j3 = vVar2.a[i26] & b10 & (~i30);
                                    while (i28 < i12) {
                                        j3 = (j3 << 8) | (vVar2.a[i28] & b10);
                                        i28++;
                                        b10 = 255;
                                    }
                                    if (i24 > 0) {
                                        j3 -= (1 << ((i29 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i29++;
                                    b10 = 255;
                                }
                            }
                            if (j3 < -2147483648L || j3 > 2147483647L) {
                                break;
                            }
                            int i31 = (int) j3;
                            int[] iArr3 = dVar.O;
                            if (i24 != 0) {
                                i31 += iArr3[i24 - 1];
                            }
                            iArr3[i24] = i31;
                            i25 += i31;
                            i24++;
                            i26 = i12;
                            b10 = 255;
                            i16 = 1;
                            i17 = 0;
                        }
                        throw b2.s0.a(null, "EBML lacing sample size out of range.");
                    }
                    int i32 = 0;
                    int i33 = 0;
                    int i34 = 4;
                    while (true) {
                        i13 = dVar.N - 1;
                        if (i32 >= i13) {
                            break;
                        }
                        dVar.O[i32] = 0;
                        while (true) {
                            i14 = i34 + 1;
                            dVar.j(pVar, i14);
                            int i35 = vVar2.a[i34] & 255;
                            int[] iArr4 = dVar.O;
                            i15 = iArr4[i32] + i35;
                            iArr4[i32] = i15;
                            if (i35 != 255) {
                                break;
                            } else {
                                i34 = i14;
                            }
                        }
                        i33 += i15;
                        i32++;
                        i34 = i14;
                    }
                    dVar.O[i13] = ((i11 - dVar.Q) - i34) - i33;
                }
            }
            c10 = 1;
            c11 = 0;
            byte[] bArr6 = vVar2.a;
            dVar.K = dVar.l((bArr6[c10] & 255) | (bArr6[c11] << 8)) + dVar.E;
            dVar.R = (cVar3.e == 2 || (i10 == 163 && (vVar2.a[2] & 128) == 128)) ? 1 : 0;
            dVar.J = 2;
            dVar.M = 0;
        }
        if (i10 == 163) {
            while (true) {
                int i36 = dVar.M;
                if (i36 >= dVar.N) {
                    dVar.J = 0;
                    return;
                } else {
                    dVar.e(cVar3, ((dVar.M * cVar3.f) / MediaDataController.MAX_STYLE_RUNS_COUNT) + dVar.K, dVar.R, dVar.n(pVar, cVar3, dVar.O[i36], false), 0);
                    dVar.M++;
                }
            }
        } else {
            while (true) {
                int i37 = dVar.M;
                if (i37 >= dVar.N) {
                    return;
                }
                int[] iArr5 = dVar.O;
                iArr5[i37] = dVar.n(pVar, cVar3, iArr5[i37], true);
                dVar.M++;
            }
        }
    }

    @Override // k2.o
    public void E(k2.l lVar) {
        n4.y yVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new k2.i(yVar, lVar, 1));
        }
    }

    public void F(int i10, long j3) {
        u3.d dVar = (u3.d) this.b;
        if (i10 == 20529) {
            if (j3 == 0) {
                return;
            }
            throw b2.s0.a(null, "ContentEncodingOrder " + j3 + " not supported");
        }
        if (i10 == 20530) {
            if (j3 == 1) {
                return;
            }
            throw b2.s0.a(null, "ContentEncodingScope " + j3 + " not supported");
        }
        switch (i10) {
            case 131:
                dVar.d(i10);
                dVar.x.e = (int) j3;
                return;
            case 136:
                dVar.d(i10);
                dVar.x.X = j3 == 1;
                return;
            case 155:
                dVar.L = dVar.l(j3);
                return;
            case 159:
                dVar.d(i10);
                dVar.x.Q = (int) j3;
                return;
            case 176:
                dVar.d(i10);
                dVar.x.n = (int) j3;
                return;
            case MessagesStorage.LAST_DB_VERSION /* 179 */:
                dVar.a(i10);
                dVar.F.c(dVar.l(j3));
                return;
            case 186:
                dVar.d(i10);
                dVar.x.o = (int) j3;
                return;
            case 215:
                dVar.d(i10);
                dVar.x.d = (int) j3;
                return;
            case 231:
                dVar.E = dVar.l(j3);
                return;
            case 238:
                dVar.S = (int) j3;
                return;
            case 241:
                if (dVar.H) {
                    return;
                }
                dVar.a(i10);
                dVar.G.c(j3);
                dVar.H = true;
                return;
            case 251:
                dVar.T = true;
                return;
            case 16871:
                dVar.d(i10);
                dVar.x.h = (int) j3;
                return;
            case 16980:
                if (j3 == 3) {
                    return;
                }
                throw b2.s0.a(null, "ContentCompAlgo " + j3 + " not supported");
            case 17029:
                if (j3 < 1 || j3 > 2) {
                    throw b2.s0.a(null, "DocTypeReadVersion " + j3 + " not supported");
                }
                return;
            case 17143:
                if (j3 == 1) {
                    return;
                }
                throw b2.s0.a(null, "EBMLReadVersion " + j3 + " not supported");
            case 18401:
                if (j3 == 5) {
                    return;
                }
                throw b2.s0.a(null, "ContentEncAlgo " + j3 + " not supported");
            case 18408:
                if (j3 == 1) {
                    return;
                }
                throw b2.s0.a(null, "AESSettingsCipherMode " + j3 + " not supported");
            case 21420:
                dVar.A = j3 + dVar.s;
                return;
            case 21432:
                int i11 = (int) j3;
                dVar.d(i10);
                if (i11 == 0) {
                    dVar.x.y = 0;
                    return;
                }
                if (i11 == 1) {
                    dVar.x.y = 2;
                    return;
                } else if (i11 == 3) {
                    dVar.x.y = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    dVar.x.y = 3;
                    return;
                }
            case 21680:
                dVar.d(i10);
                dVar.x.q = (int) j3;
                return;
            case 21682:
                dVar.d(i10);
                dVar.x.s = (int) j3;
                return;
            case 21690:
                dVar.d(i10);
                dVar.x.r = (int) j3;
                return;
            case 21930:
                dVar.d(i10);
                dVar.x.W = j3 == 1;
                return;
            case 21938:
                dVar.d(i10);
                u3.c cVar = dVar.x;
                cVar.z = true;
                cVar.p = (int) j3;
                return;
            case 21998:
                dVar.d(i10);
                dVar.x.g = (int) j3;
                return;
            case 22186:
                dVar.d(i10);
                dVar.x.T = j3;
                return;
            case 22203:
                dVar.d(i10);
                dVar.x.U = j3;
                return;
            case 25188:
                dVar.d(i10);
                dVar.x.R = (int) j3;
                return;
            case 30114:
                dVar.U = j3;
                return;
            case 30321:
                dVar.d(i10);
                int i12 = (int) j3;
                if (i12 == 0) {
                    dVar.x.t = 0;
                    return;
                }
                if (i12 == 1) {
                    dVar.x.t = 1;
                    return;
                } else if (i12 == 2) {
                    dVar.x.t = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    dVar.x.t = 3;
                    return;
                }
            case 2352003:
                dVar.d(i10);
                dVar.x.f = (int) j3;
                return;
            case 2807729:
                dVar.t = j3;
                return;
            default:
                switch (i10) {
                    case 21945:
                        dVar.d(i10);
                        int i13 = (int) j3;
                        if (i13 == 1) {
                            dVar.x.C = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            dVar.x.C = 1;
                            return;
                        }
                    case 21946:
                        dVar.d(i10);
                        int g10 = b2.j.g((int) j3);
                        if (g10 != -1) {
                            dVar.x.B = g10;
                            return;
                        }
                        return;
                    case 21947:
                        dVar.d(i10);
                        dVar.x.z = true;
                        int f7 = b2.j.f((int) j3);
                        if (f7 != -1) {
                            dVar.x.A = f7;
                            return;
                        }
                        return;
                    case 21948:
                        dVar.d(i10);
                        dVar.x.D = (int) j3;
                        return;
                    case 21949:
                        dVar.d(i10);
                        dVar.x.E = (int) j3;
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean G(MotionEvent motionEvent) {
        boolean z10;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        boolean onFling;
        p20 p20Var;
        boolean z11;
        o20 o20Var = (o20) this.b;
        int i10 = o20.w;
        p20 p20Var2 = o20Var.f;
        androidx.mediarouter.app.c cVar = o20Var.e;
        int action = motionEvent.getAction();
        if (o20Var.v == null) {
            o20Var.v = VelocityTracker.obtain();
        }
        o20Var.v.addMovement(motionEvent);
        int i11 = action & 255;
        boolean z12 = i11 == 6;
        int actionIndex = z12 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f7 = 0.0f;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < pointerCount; i12++) {
            if (actionIndex != i12) {
                f7 = motionEvent.getX(i12) + f7;
                f10 = motionEvent.getY(i12) + f10;
            }
        }
        float f11 = z12 ? pointerCount - 1 : pointerCount;
        float f12 = f7 / f11;
        float f13 = f10 / f11;
        if (i11 == 0) {
            if (o20Var.g != null && p20Var2.a()) {
                boolean hasMessages = cVar.hasMessages(3);
                if (hasMessages) {
                    cVar.removeMessages(3);
                }
                MotionEvent motionEvent4 = o20Var.m;
                if (motionEvent4 != null && (motionEvent3 = o20Var.n) != null && hasMessages && o20Var.l && motionEvent.getEventTime() - motionEvent3.getEventTime() <= 220) {
                    int x10 = ((int) motionEvent4.getX()) - ((int) motionEvent.getX());
                    int y3 = ((int) motionEvent4.getY()) - ((int) motionEvent.getY());
                    if ((y3 * y3) + (x10 * x10) < o20Var.b) {
                        o20Var.o = true;
                        z10 = o20Var.g.onDoubleTap(o20Var.m) | o20Var.g.onDoubleTapEvent(motionEvent);
                        o20Var.p = f12;
                        o20Var.r = f12;
                        o20Var.q = f13;
                        o20Var.s = f13;
                        motionEvent2 = o20Var.m;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        o20Var.m = MotionEvent.obtain(motionEvent);
                        o20Var.k = true;
                        o20Var.l = true;
                        o20Var.h = true;
                        o20Var.j = false;
                        o20Var.i = false;
                        if (o20Var.t) {
                            cVar.removeMessages(2);
                            cVar.sendEmptyMessageAtTime(2, o20Var.m.getDownTime() + i10 + o20Var.u);
                        }
                        cVar.sendEmptyMessageAtTime(1, o20Var.m.getDownTime() + i10);
                        return p20Var2.onDown(motionEvent) | z10;
                    }
                }
                cVar.sendEmptyMessageDelayed(3, 220L);
            }
            z10 = false;
            o20Var.p = f12;
            o20Var.r = f12;
            o20Var.q = f13;
            o20Var.s = f13;
            motionEvent2 = o20Var.m;
            if (motionEvent2 != null) {
            }
            o20Var.m = MotionEvent.obtain(motionEvent);
            o20Var.k = true;
            o20Var.l = true;
            o20Var.h = true;
            o20Var.j = false;
            o20Var.i = false;
            if (o20Var.t) {
            }
            cVar.sendEmptyMessageAtTime(1, o20Var.m.getDownTime() + i10);
            return p20Var2.onDown(motionEvent) | z10;
        }
        if (i11 == 1) {
            o20Var.h = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (o20Var.o) {
                onFling = o20Var.g.onDoubleTapEvent(motionEvent);
            } else {
                if (o20Var.j) {
                    cVar.removeMessages(3);
                    o20Var.j = false;
                } else if (o20Var.k) {
                    boolean onSingleTapUp = p20Var2.onSingleTapUp(motionEvent);
                    if (o20Var.i && (p20Var = o20Var.g) != null) {
                        p20Var.onSingleTapConfirmed(motionEvent);
                    }
                    onFling = onSingleTapUp;
                } else {
                    VelocityTracker velocityTracker = o20Var.v;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, o20Var.d);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > o20Var.c || Math.abs(xVelocity) > o20Var.c) {
                        onFling = p20Var2.onFling(o20Var.m, motionEvent, xVelocity, yVelocity);
                    }
                }
                onFling = false;
            }
            MotionEvent motionEvent5 = o20Var.n;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            o20Var.n = obtain;
            VelocityTracker velocityTracker2 = o20Var.v;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                o20Var.v = null;
            }
            o20Var.o = false;
            o20Var.i = false;
            cVar.removeMessages(1);
            cVar.removeMessages(2);
            return onFling;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                cVar.removeMessages(1);
                cVar.removeMessages(2);
                cVar.removeMessages(3);
                o20Var.v.recycle();
                o20Var.v = null;
                o20Var.o = false;
                o20Var.h = false;
                o20Var.k = false;
                o20Var.l = false;
                o20Var.i = false;
                if (o20Var.j) {
                    o20Var.j = false;
                    return false;
                }
            } else if (i11 == 5) {
                o20Var.p = f12;
                o20Var.r = f12;
                o20Var.q = f13;
                o20Var.s = f13;
                cVar.removeMessages(1);
                cVar.removeMessages(2);
                cVar.removeMessages(3);
                o20Var.o = false;
                o20Var.k = false;
                o20Var.l = false;
                o20Var.i = false;
                if (o20Var.j) {
                    o20Var.j = false;
                    return false;
                }
            } else if (i11 == 6) {
                o20Var.p = f12;
                o20Var.r = f12;
                o20Var.q = f13;
                o20Var.s = f13;
                o20Var.v.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, o20Var.d);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = o20Var.v.getXVelocity(pointerId2);
                float yVelocity2 = o20Var.v.getYVelocity(pointerId2);
                for (int i13 = 0; i13 < pointerCount; i13++) {
                    if (i13 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i13);
                        if ((o20Var.v.getYVelocity(pointerId3) * yVelocity2) + (o20Var.v.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            o20Var.v.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!o20Var.j) {
            float f14 = o20Var.p - f12;
            float f15 = o20Var.q - f13;
            if (o20Var.o) {
                return o20Var.g.onDoubleTapEvent(motionEvent);
            }
            if (o20Var.k) {
                int i14 = (int) (f12 - o20Var.r);
                int i15 = (int) (f13 - o20Var.s);
                int i16 = (i15 * i15) + (i14 * i14);
                if (i16 > o20Var.a) {
                    z11 = p20Var2.onScroll(o20Var.m, motionEvent, f14, f15);
                    o20Var.p = f12;
                    o20Var.q = f13;
                    o20Var.k = false;
                    cVar.removeMessages(3);
                    cVar.removeMessages(1);
                    cVar.removeMessages(2);
                } else {
                    z11 = false;
                }
                if (i16 > o20Var.a) {
                    o20Var.l = false;
                }
                return z11;
            }
            if (Math.abs(f14) >= 1.0f || Math.abs(f15) >= 1.0f) {
                boolean onScroll = p20Var2.onScroll(o20Var.m, motionEvent, f14, f15);
                o20Var.p = f12;
                o20Var.q = f13;
                return onScroll;
            }
        }
        return false;
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 H(Class cls, v1.b bVar) {
        androidx.lifecycle.m0 m0Var = null;
        for (v1.c cVar : (v1.c[]) this.b) {
            if (cVar.a.equals(cls)) {
                m0Var = new androidx.lifecycle.m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    public void I() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + L());
    }

    @Override // ii.k0
    public q9 J() {
        o4 o4Var = ((q4) this.b).G;
        if (o4Var != null) {
            return ((t3) o4Var).a.getTextSelectionHelper();
        }
        return null;
    }

    public void K(long j3) {
        long L = L();
        if (L != j3) {
            if (L != -1) {
                if (L != -2) {
                    return;
                } else {
                    L = -2;
                }
            }
            StringBuilder u10 = a4.a.u(j3, "expected non-string scope or scope ", " but found ");
            u10.append(L);
            throw new IOException(u10.toString());
        }
    }

    public long L() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // l.i
    public boolean M(l.k kVar, MenuItem menuItem) {
        ((Toolbar) this.b).getClass();
        return false;
    }

    @Override // ii.k0
    public void N(CharSequence charSequence) {
        o4 o4Var = ((q4) this.b).G;
        if (o4Var != null) {
            t3 t3Var = (t3) o4Var;
            t3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            t3Var.a.u4(charSequence.toString());
        }
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        sm0 sm0Var = (sm0) this.b;
        sm0Var.v.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        sm0Var.s.requestLayout();
        return r0.l1.b;
    }

    @Override // ii.k0
    public p9 R() {
        return (q4) this.b;
    }

    @Override // ii.k0
    public a T() {
        return ((q4) this.b).a;
    }

    @Override // ii.k0
    public boolean W() {
        q4 q4Var = (q4) this.b;
        o4 o4Var = q4Var.G;
        if (o4Var == null) {
            return false;
        }
        a aVar = q4Var.a;
        return ((t3) o4Var).a.T4();
    }

    @Override // qg.v1
    public void X(float f7) {
        vt0 vt0Var = (vt0) this.b;
        pg.u0.e(vt0Var.P1).k(String.valueOf(pg.m.a.indexOf(vt0Var.W0.getCurrentBrush())), f7);
        pg.t1 t1Var = vt0Var.K1;
        t1Var.c = f7;
        vt0Var.t0(t1Var, null);
    }

    @Override // org.telegram.ui.Components.yo0
    public void Y(float f7, boolean z10) {
        ub1 ub1Var = (ub1) ((org.telegram.ui.Cells.k0) this.b);
        int i10 = (int) (org.telegram.ui.ActionBar.i6.q * 100.0f);
        int i11 = (int) (f7 * 100.0f);
        org.telegram.ui.ActionBar.i6.q = f7;
        if (i10 != i11) {
            ThemeActivity themeActivity = ub1Var.e.e;
            il0 il0Var = (il0) themeActivity.b.K(themeActivity.f0);
            if (il0Var != null) {
                ((e9) il0Var.a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (org.telegram.ui.ActionBar.i6.q * 100.0f))));
            }
            org.telegram.ui.ActionBar.i6.E(true);
        }
    }

    @Override // ii.k0
    public void Z(int i10, int i11) {
        q4 q4Var = (q4) this.b;
        o4 o4Var = q4Var.G;
        if (o4Var != null) {
            a aVar = q4Var.a;
            i2 i2Var = ((t3) o4Var).a.Q3;
            if (i2Var != null) {
                i2Var.f(i10, i11);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 25:
                s6.f fVar = new s6.f(1, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).u();
                s6.a aVar = (s6.a) this.b;
                Parcel I0 = eVar.I0();
                k7.a.d(I0, fVar);
                k7.a.c(I0, aVar);
                I0.writeStrongBinder(null);
                eVar.J0(I0, 2);
                return;
            default:
                v8.e eVar2 = (v8.e) this.b;
                e8.b bVar = (e8.b) obj;
                bVar.getClass();
                e8.a aVar2 = new e8.a(1, (TaskCompletionSource) obj2);
                try {
                    e8.i iVar = (e8.i) bVar.u();
                    Bundle G = bVar.G();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = e8.c.a;
                    obtain.writeInt(1);
                    eVar2.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar2);
                    try {
                        iVar.a.transact(14, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th2) {
                        obtain.recycle();
                        throw th2;
                    }
                } catch (RemoteException e7) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e7);
                    Bundle bundle = Bundle.EMPTY;
                    v7.g5.a(Status.h, Boolean.FALSE, aVar2.b);
                    return;
                }
        }
    }

    @Override // ii.k0
    public void b(i1 i1Var) {
        o4 o4Var = ((q4) this.b).G;
        if (o4Var != null) {
            x3 x3Var = ((t3) o4Var).a;
            x3.N1(x3Var, i1Var);
            x3Var.o3.P(i1Var, true);
        }
    }

    @Override // l.w
    public void c(l.k kVar, boolean z10) {
        if (kVar instanceof l.d0) {
            ((l.d0) kVar).z.k().c(false);
        }
        l.w wVar = ((m.h) this.b).e;
        if (wVar != null) {
            wVar.c(kVar, z10);
        }
    }

    @Override // k2.o
    public void d(long j3) {
        n4.y yVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new ai.j(yVar, j3, 12));
        }
    }

    @Override // s4.h1
    public int e(View view) {
        return s4.o0.z(view) - ((ViewGroup.MarginLayoutParams) ((s4.p0) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 f(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // me.a
    public /* synthetic */ boolean forceEnableVibration() {
        return false;
    }

    @Override // ii.k0
    public void g() {
        q4 q4Var = (q4) this.b;
        o4 o4Var = q4Var.G;
        if (o4Var != null) {
            x3.Q1(((t3) o4Var).a, q4Var.a);
        }
    }

    @Override // ii.k0
    public void g0() {
        q4 q4Var = (q4) this.b;
        o4 o4Var = q4Var.G;
        if (o4Var != null) {
            a aVar = q4Var.a;
            x3 x3Var = ((t3) o4Var).a;
            i2 i2Var = x3Var.Q3;
            if (i2Var != null) {
                i2Var.g();
            }
            x3Var.o3.onContentChanged();
        }
    }

    @Override // qg.v1
    public float get() {
        vt0 vt0Var = (vt0) this.b;
        int i10 = vt0Var.P1;
        pg.m currentBrush = vt0Var.W0.getCurrentBrush();
        return currentBrush == null ? pg.u0.e(i10).i : pg.u0.e(i10).f(String.valueOf(pg.m.a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override // org.telegram.ui.Components.yo0
    public CharSequence getContentDescription() {
        return " ";
    }

    @Override // k1.f
    public ce.b getData() {
        return ((k1.a0) this.b).c;
    }

    @Override // me.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // le.f
    public /* synthetic */ boolean i() {
        return false;
    }

    @Override // me.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.v71
    public void invalidate() {
        ((rg0) this.b).h.invalidate();
    }

    @Override // le.f
    public /* synthetic */ boolean j(float f7) {
        return false;
    }

    @Override // s4.h1
    public int l() {
        return ((s4.o0) this.b).G();
    }

    @Override // k2.o
    public void m() {
        ((FfmpegAudioRenderer) this.b).f0 = true;
    }

    @Override // s4.h1
    public int n() {
        s4.o0 o0Var = (s4.o0) this.b;
        return o0Var.n - o0Var.C();
    }

    @Override // me.a
    public /* synthetic */ boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override // me.a
    public boolean needClickAt(View view, float f7, float f10) {
        int dp = AndroidUtilities.dp(9.0f);
        h71 h71Var = (h71) this.b;
        float f11 = -dp;
        h71Var.g.inset(f11, f11);
        boolean contains = h71Var.g.contains(f7, f10);
        float f12 = dp;
        h71Var.g.inset(f12, f12);
        return contains;
    }

    @Override // me.a
    public /* synthetic */ boolean needLongPress(float f7, float f10) {
        return false;
    }

    @Override // k2.o
    public void onAudioSessionIdChanged(int i10) {
        n4.y yVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new o8(yVar, i10, 11));
        }
    }

    @Override // me.a
    public void onClickAt(View view, float f7, float f10) {
        Runnable runnable = ((h71) this.b).j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // me.a
    public void onClickTouchDown(View view, float f7, float f10) {
        ((h71) this.b).h.c(true);
    }

    @Override // me.a
    public void onClickTouchUp(View view, float f7, float f10) {
        ((h71) this.b).h.c(false);
    }

    @Override // me.a
    public /* synthetic */ boolean onLongPressRequestedAt(View view, float f7, float f10) {
        return false;
    }

    @Override // k2.o
    public void onSkipSilenceEnabledChanged(boolean z10) {
        n4.y yVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new bi.f(7, yVar, z10));
        }
    }

    @Override // s4.h1
    public View p(int i10) {
        return ((s4.o0) this.b).q(i10);
    }

    @Override // org.telegram.ui.Components.yo0
    public /* synthetic */ int p0() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void q(Object obj) {
        ((g8.c) obj).onLocationResult((LocationResult) this.b);
    }

    @Override // s4.h1
    public int r(View view) {
        return s4.o0.v(view) + ((ViewGroup.MarginLayoutParams) ((s4.p0) view.getLayoutParams())).bottomMargin;
    }

    @Override // k2.o
    public void s(int i10, long j3, long j10) {
        n4.y yVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new k2.j(yVar, i10, j3, j10, 0));
        }
    }

    @Override // k1.f
    public Object t(rd.p pVar, kd.c cVar) {
        return ((k1.a0) this.b).t(new n1.c(pVar, null, 0), cVar);
    }

    public String toString() {
        switch (this.a) {
            case 22:
                re.b bVar = re.b.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((ra.a) this.b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override // k2.o
    public void u() {
        x2.p pVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.b;
        synchronized (ffmpegAudioRenderer.a) {
            pVar = ffmpegAudioRenderer.H;
        }
        if (pVar != null) {
            pVar.h();
        }
    }

    @Override // l.w
    public boolean v(l.k kVar) {
        m.h hVar = (m.h) this.b;
        if (kVar == hVar.c) {
            return false;
        }
        ((l.d0) kVar).A.getClass();
        hVar.getClass();
        l.w wVar = hVar.e;
        if (wVar != null) {
            return wVar.v(kVar);
        }
        return false;
    }

    @Override // ii.k0
    public void v0() {
        q4 q4Var = (q4) this.b;
        o4 o4Var = q4Var.G;
        if (o4Var != null) {
            a aVar = q4Var.a;
            x3.P1(((t3) o4Var).a);
        }
    }

    @Override // l.i
    public void w(l.k kVar) {
        Toolbar toolbar = (Toolbar) this.b;
        m.h hVar = toolbar.a.J;
        if (hVar == null || !hVar.g()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.W.d).iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.c0) it.next()).a.t();
            }
        }
    }

    @Override // k2.o
    public void x(Exception exc) {
        e2.a.f("DecoderAudioRenderer", "Audio sink error", exc);
        n4.y yVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new k2.g(yVar, exc, 1));
        }
    }

    @Override // k2.o
    public void y() {
        ((FfmpegAudioRenderer) this.b).Z = true;
    }

    @Override // le.f
    public void z() {
        ((m9) this.b).a.invalidate();
    }

    public /* synthetic */ n4(s6.g gVar, s6.a aVar) {
        this.a = 25;
        this.b = aVar;
    }

    public n4(int i10) {
        this.a = i10;
        switch (i10) {
            case 22:
                break;
            case 29:
                this.b = new qb.b(28);
                break;
            default:
                this.b = new ArrayDeque(16);
                break;
        }
    }

    public n4(x6.a aVar) {
        this.a = 1;
        n6.l.h(aVar);
        this.b = aVar;
    }

    public n4(v1.c[] initializers) {
        this.a = 27;
        kotlin.jvm.internal.i.e(initializers, "initializers");
        this.b = initializers;
    }

    public n4(ArrayList arrayList) {
        this.a = 23;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    public n4(EditText editText) {
        this.a = 19;
        this.b = new n7.z0(editText);
    }

    public n4(Context context, p20 p20Var) {
        this.a = 13;
        this.b = new o20(context, p20Var);
    }

    public n4(Context context, n4.y yVar) {
        this.a = 8;
        n4.x xVar = ((n4.r) yVar.b).c;
        DesugarCollections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = new n4.k(context, xVar);
        } else {
            this.b = new n4.j(context, xVar);
        }
    }

    @Override // le.f
    public /* synthetic */ void h(boolean z10) {
    }

    @Override // org.telegram.ui.Components.yo0
    public void B() {
    }

    @Override // k2.o
    public /* synthetic */ void D() {
    }

    @Override // le.f
    public /* synthetic */ void a() {
    }

    @Override // le.f
    public /* synthetic */ void k() {
    }

    @Override // k2.o
    public /* synthetic */ void o() {
    }

    @Override // me.a
    public /* synthetic */ void onClickTouchMove(View view, float f7, float f10) {
    }

    @Override // me.a
    public /* synthetic */ void onLongPressCancelled(View view, float f7, float f10) {
    }

    @Override // me.a
    public /* synthetic */ void onLongPressFinish(View view, float f7, float f10) {
    }

    @Override // me.a
    public /* synthetic */ void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }
}
