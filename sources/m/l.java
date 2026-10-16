package m;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.net.Uri;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import ji.h5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.uf0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.xq0;
import org.telegram.ui.Components.z71;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.a5;
import org.telegram.ui.gu0;
import org.telegram.ui.ic0;
import org.telegram.ui.o9;
import org.telegram.ui.y9;
import org.telegram.ui.zs0;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class l implements l.i, l2.h, o0.a, z71, f5, lb0, mg.o, bh.h, y9, com.google.android.gms.common.api.internal.o, rg.x1, n5.b, w2.a, OnCompleteListener, xq0 {
    public Object a;

    public /* synthetic */ l(Object obj) {
        this.a = obj;
    }

    public static float[] B(ArrayList arrayList) {
        float f7;
        int i10;
        int i11;
        float f10;
        double d;
        double d10;
        double[] dArr;
        ArrayList arrayList2;
        float f11;
        int i12;
        int size = arrayList.size();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            f7 = 255.0f;
            if (i14 >= size) {
                break;
            }
            PointF pointF = (PointF) arrayList.get(i14);
            pointF.x *= 255.0f;
            pointF.y *= 255.0f;
            i14++;
        }
        int size2 = arrayList.size();
        int i15 = 1;
        double d11 = 1.0d;
        if (size2 <= 0 || size2 == 1) {
            i10 = 0;
            i11 = 1;
            f10 = 255.0f;
            d = 1.0d;
            d10 = 6.0d;
            dArr = null;
        } else {
            char c10 = 2;
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size2, 3);
            double[] dArr3 = new double[size2];
            double[] dArr4 = dArr2[0];
            dArr4[1] = 1.0d;
            double d12 = 0.0d;
            dArr4[0] = 0.0d;
            dArr4[2] = 0.0d;
            int i16 = 1;
            while (true) {
                i12 = size2 - 1;
                if (i16 >= i12) {
                    break;
                }
                PointF pointF2 = (PointF) arrayList.get(i16 - 1);
                PointF pointF3 = (PointF) arrayList.get(i16);
                int i17 = i16 + 1;
                double d13 = d11;
                PointF pointF4 = (PointF) arrayList.get(i17);
                double[] dArr5 = dArr2[i16];
                char c11 = c10;
                float f12 = pointF3.x;
                double d14 = d12;
                int i18 = i13;
                int i19 = i15;
                double d15 = f12 - pointF2.x;
                dArr5[i18] = d15 / 6.0d;
                float f13 = pointF4.x;
                float f14 = f7;
                dArr5[i19] = (f13 - r14) / 3.0d;
                double d16 = f13 - f12;
                dArr5[c11] = d16 / 6.0d;
                float f15 = pointF4.y;
                float f16 = pointF3.y;
                dArr3[i16] = ((f15 - f16) / d16) - ((f16 - pointF2.y) / d15);
                i16 = i17;
                c10 = c11;
                d11 = d13;
                d12 = d14;
                i13 = i18;
                i15 = i19;
                f7 = f14;
            }
            i10 = i13;
            i11 = i15;
            f10 = f7;
            d = d11;
            char c12 = c10;
            double d17 = d12;
            d10 = 6.0d;
            dArr3[i10] = d17;
            dArr3[i12] = d17;
            double[] dArr6 = dArr2[i12];
            dArr6[i11] = d;
            dArr6[i10] = d17;
            dArr6[c12] = d17;
            for (int i20 = i11; i20 < size2; i20++) {
                double[] dArr7 = dArr2[i20];
                double d18 = dArr7[i10];
                int i21 = i20 - 1;
                double[] dArr8 = dArr2[i21];
                double d19 = d18 / dArr8[i11];
                dArr7[i11] = dArr7[i11] - (dArr8[c12] * d19);
                dArr7[i10] = d17;
                dArr3[i20] = dArr3[i20] - (d19 * dArr3[i21]);
            }
            for (int i22 = size2 - 2; i22 >= 0; i22--) {
                double[] dArr9 = dArr2[i22];
                double d20 = dArr9[c12];
                int i23 = i22 + 1;
                double[] dArr10 = dArr2[i23];
                double d21 = d20 / dArr10[i11];
                dArr9[i11] = dArr9[i11] - (dArr10[i10] * d21);
                dArr9[c12] = d17;
                dArr3[i22] = dArr3[i22] - (d21 * dArr3[i23]);
            }
            dArr = new double[size2];
            for (int i24 = i10; i24 < size2; i24++) {
                dArr[i24] = dArr3[i24] / dArr2[i24][i11];
            }
        }
        int length = dArr.length;
        if (length < i11) {
            arrayList2 = null;
            f11 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i25 = i10;
            while (i25 < length - 1) {
                PointF pointF5 = (PointF) arrayList.get(i25);
                int i26 = i25 + 1;
                PointF pointF6 = (PointF) arrayList.get(i26);
                int i27 = (int) pointF5.x;
                while (true) {
                    float f17 = pointF6.x;
                    if (i27 < ((int) f17)) {
                        float f18 = i27;
                        PointF pointF7 = pointF5;
                        double d22 = f17 - pointF5.x;
                        double d23 = (f18 - r12) / d22;
                        double d24 = d - d23;
                        int i28 = length;
                        double[] dArr11 = dArr;
                        float f19 = (float) (((((((d23 * d23) * d23) - d23) * dArr11[i26]) + ((((d24 * d24) * d24) - d24) * dArr11[i25])) * ((d22 * d22) / d10)) + (pointF6.y * d23) + (pointF7.y * d24));
                        if (f19 > f10) {
                            f19 = f10;
                        } else if (f19 < 0.0f) {
                            f19 = 0.0f;
                        }
                        arrayList2.add(new PointF(f18, f19));
                        i27++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i28;
                    }
                }
                i25 = i26;
            }
            f11 = 0.0f;
            arrayList2.add((PointF) i2.d.h(1, arrayList));
        }
        int i29 = i10;
        float f20 = ((PointF) arrayList2.get(i29)).x;
        if (f20 > f11) {
            for (int i30 = (int) f20; i30 >= 0; i30--) {
                arrayList2.add(i29, new PointF(i30, f11));
            }
        }
        float f21 = ((PointF) i2.d.h(1, arrayList2)).x;
        if (f21 < f10) {
            for (int i31 = ((int) f21) + 1; i31 <= 255; i31++) {
                arrayList2.add(new PointF(i31, f10));
            }
        }
        float[] fArr = new float[arrayList2.size()];
        int size3 = arrayList2.size();
        while (i29 < size3) {
            PointF pointF8 = (PointF) arrayList2.get(i29);
            float sqrt = (float) Math.sqrt(Math.pow(pointF8.x - pointF8.y, 2.0d));
            if (pointF8.x > pointF8.y) {
                sqrt = -sqrt;
            }
            fArr[i29] = sqrt;
            i29++;
        }
        return fArr;
    }

    public static l D(float f7, int i10) {
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f7);
        int i12 = (int) (point.y * f7);
        if (i11 == i12) {
            return new l(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new l(i11, i12, i12, i11);
        }
        return (i10 == 1) == (i11 < i12) ? new l(i11, i12, new int[0]) : new l(i12, i11, new int[0]);
    }

    public static void E(String str, TreeMap treeMap) {
        String[] split = str.split(":", 2);
        if (split.length < 2) {
            return;
        }
        String trim = split[0].trim();
        String trim2 = split[1].trim();
        List list = (List) treeMap.get(trim);
        if (list == null) {
            list = new ArrayList();
            treeMap.put(trim, list);
        }
        list.add(trim2);
    }

    @Override // mg.o
    public void A() {
        tf0 tf0Var = ((uf0) this.a).a;
        if (tf0Var != null) {
            ((zs0) tf0Var).a.e0.invalidate();
        }
    }

    public void C(int i10, long j10) {
        u3.f fVar = (u3.f) this.a;
        if (i10 == 240) {
            if (fVar.z) {
                return;
            }
            fVar.g(i10);
            if (fVar.H == -1) {
                fVar.H = j10;
                return;
            }
            return;
        }
        if (i10 == 241) {
            if (fVar.z) {
                return;
            }
            fVar.g(i10);
            if (fVar.G == -1) {
                fVar.G = j10;
                return;
            }
            return;
        }
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw b2.x0.a(null, "ContentEncodingOrder " + j10 + " not supported");
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw b2.x0.a(null, "ContentEncodingScope " + j10 + " not supported");
        }
        switch (i10) {
            case 131:
                int i11 = (int) j10;
                if (i11 == 1) {
                    fVar.h(i10);
                    fVar.y.e = 2;
                    return;
                }
                if (i11 == 2) {
                    fVar.h(i10);
                    fVar.y.e = 1;
                    return;
                } else if (i11 == 17) {
                    fVar.h(i10);
                    fVar.y.e = 3;
                    return;
                } else if (i11 != 33) {
                    fVar.h(i10);
                    fVar.y.e = -1;
                    return;
                } else {
                    fVar.h(i10);
                    fVar.y.e = 5;
                    return;
                }
            case 136:
                fVar.h(i10);
                fVar.y.Y = j10 == 1;
                return;
            case 155:
                fVar.Q = fVar.n(j10);
                return;
            case 159:
                fVar.h(i10);
                fVar.y.Q = (int) j10;
                return;
            case 176:
                fVar.h(i10);
                fVar.y.n = (int) j10;
                return;
            case MessagesStorage.LAST_DB_VERSION /* 179 */:
                if (fVar.z) {
                    return;
                }
                fVar.g(i10);
                fVar.E = fVar.n(j10);
                return;
            case 186:
                fVar.h(i10);
                fVar.y.o = (int) j10;
                return;
            case 215:
                fVar.h(i10);
                fVar.y.d = (int) j10;
                return;
            case TLRPC.LAYER /* 231 */:
                fVar.M = fVar.n(j10);
                return;
            case 238:
                fVar.X = (int) j10;
                return;
            case 247:
                if (fVar.z) {
                    return;
                }
                fVar.g(i10);
                fVar.F = (int) j10;
                return;
            case 251:
                fVar.Y = true;
                return;
            case 16871:
                fVar.h(i10);
                fVar.y.h = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw b2.x0.a(null, "ContentCompAlgo " + j10 + " not supported");
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw b2.x0.a(null, "DocTypeReadVersion " + j10 + " not supported");
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw b2.x0.a(null, "EBMLReadVersion " + j10 + " not supported");
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw b2.x0.a(null, "ContentEncAlgo " + j10 + " not supported");
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw b2.x0.a(null, "AESSettingsCipherMode " + j10 + " not supported");
            case 21420:
                fVar.B = j10 + fVar.s;
                return;
            case 21432:
                int i12 = (int) j10;
                fVar.h(i10);
                if (i12 == 0) {
                    fVar.y.y = 0;
                    return;
                }
                if (i12 == 1) {
                    fVar.y.y = 2;
                    return;
                } else if (i12 == 3) {
                    fVar.y.y = 1;
                    return;
                } else {
                    if (i12 != 15) {
                        return;
                    }
                    fVar.y.y = 3;
                    return;
                }
            case 21680:
                fVar.h(i10);
                fVar.y.q = (int) j10;
                return;
            case 21682:
                fVar.h(i10);
                fVar.y.s = (int) j10;
                return;
            case 21690:
                fVar.h(i10);
                fVar.y.r = (int) j10;
                return;
            case 21930:
                fVar.h(i10);
                fVar.y.X = j10 == 1;
                return;
            case 21938:
                fVar.h(i10);
                u3.e eVar = fVar.y;
                eVar.z = true;
                eVar.p = (int) j10;
                return;
            case 21998:
                fVar.h(i10);
                fVar.y.g = (int) j10;
                return;
            case 22186:
                fVar.h(i10);
                fVar.y.T = j10;
                return;
            case 22203:
                fVar.h(i10);
                fVar.y.U = j10;
                return;
            case 25188:
                fVar.h(i10);
                fVar.y.R = (int) j10;
                return;
            case 30114:
                fVar.Z = j10;
                return;
            case 30321:
                fVar.h(i10);
                int i13 = (int) j10;
                if (i13 == 0) {
                    fVar.y.t = 0;
                    return;
                }
                if (i13 == 1) {
                    fVar.y.t = 1;
                    return;
                } else if (i13 == 2) {
                    fVar.y.t = 2;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    fVar.y.t = 3;
                    return;
                }
            case 2352003:
                fVar.h(i10);
                fVar.y.f = (int) j10;
                return;
            case 2807729:
                fVar.t = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        fVar.h(i10);
                        int i14 = (int) j10;
                        if (i14 == 1) {
                            fVar.y.C = 2;
                            return;
                        } else {
                            if (i14 != 2) {
                                return;
                            }
                            fVar.y.C = 1;
                            return;
                        }
                    case 21946:
                        fVar.h(i10);
                        int g10 = b2.o.g((int) j10);
                        if (g10 != -1) {
                            fVar.y.B = g10;
                            return;
                        }
                        return;
                    case 21947:
                        fVar.h(i10);
                        fVar.y.z = true;
                        int f7 = b2.o.f((int) j10);
                        if (f7 != -1) {
                            fVar.y.A = f7;
                            return;
                        }
                        return;
                    case 21948:
                        fVar.h(i10);
                        fVar.y.D = (int) j10;
                        return;
                    case 21949:
                        fVar.h(i10);
                        fVar.y.E = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    public void F(int i10, long j10, long j11) {
        u3.f fVar = (u3.f) this.a;
        fVar.j0.getClass();
        if (i10 == 160) {
            fVar.Y = false;
            fVar.Z = 0L;
            return;
        }
        if (i10 == 174) {
            u3.e eVar = new u3.e();
            eVar.n = -1;
            eVar.o = -1;
            eVar.p = -1;
            eVar.q = -1;
            eVar.r = -1;
            eVar.s = 0;
            eVar.t = -1;
            eVar.u = 0.0f;
            eVar.v = 0.0f;
            eVar.w = 0.0f;
            eVar.x = null;
            eVar.y = -1;
            eVar.z = false;
            eVar.A = -1;
            eVar.B = -1;
            eVar.C = -1;
            eVar.D = MediaDataController.MAX_STYLE_RUNS_COUNT;
            eVar.E = 200;
            eVar.F = -1.0f;
            eVar.G = -1.0f;
            eVar.H = -1.0f;
            eVar.I = -1.0f;
            eVar.J = -1.0f;
            eVar.K = -1.0f;
            eVar.L = -1.0f;
            eVar.M = -1.0f;
            eVar.N = -1.0f;
            eVar.O = -1.0f;
            eVar.Q = 1;
            eVar.R = -1;
            eVar.S = 8000;
            eVar.T = 0L;
            eVar.U = 0L;
            eVar.W = false;
            eVar.Y = true;
            eVar.Z = "eng";
            fVar.y = eVar;
            eVar.a = fVar.w;
            return;
        }
        if (i10 == 183) {
            if (fVar.z) {
                return;
            }
            fVar.g(i10);
            fVar.F = -1;
            fVar.G = -1L;
            fVar.H = -1L;
            return;
        }
        if (i10 == 187) {
            if (fVar.z) {
                return;
            }
            fVar.g(i10);
            fVar.E = -9223372036854775807L;
            return;
        }
        if (i10 == 19899) {
            fVar.A = -1;
            fVar.B = -1L;
            return;
        }
        if (i10 == 20533) {
            fVar.h(i10);
            fVar.y.i = true;
            return;
        }
        if (i10 == 21968) {
            fVar.h(i10);
            fVar.y.z = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = fVar.s;
            if (j12 != -1 && j12 != j10) {
                throw b2.x0.a(null, "Multiple Segment elements not supported");
            }
            fVar.s = j10;
            fVar.r = j11;
            return;
        }
        if (i10 == 475249515) {
            if (fVar.z) {
                return;
            }
            fVar.D = true;
        } else if (i10 == 524531317 && !fVar.z) {
            if (fVar.d && fVar.K != -1) {
                fVar.J = true;
            } else {
                fVar.j0.K(new c3.t(fVar.v));
                fVar.z = true;
            }
        }
    }

    public void G(int i10, String str) {
        u3.f fVar = (u3.f) this.a;
        if (i10 == 134) {
            fVar.h(i10);
            fVar.y.c = str;
            return;
        }
        if (i10 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                fVar.w = str.equals("webm");
                return;
            }
            throw b2.x0.a(null, "DocType " + str + " not supported");
        }
        if (i10 == 21358) {
            fVar.h(i10);
            fVar.y.b = str;
        } else {
            if (i10 != 2274716) {
                return;
            }
            fVar.h(i10);
            fVar.y.Z = str;
        }
    }

    @Override // rg.x1
    public void G0(float f7) {
        gu0 gu0Var = (gu0) this.a;
        qg.s0.e(gu0Var.P1).k(String.valueOf(qg.m.a.indexOf(gu0Var.W0.getCurrentBrush())), f7);
        qg.q1 q1Var = gu0Var.K1;
        q1Var.c = f7;
        gu0Var.t0(q1Var, null);
    }

    public void H(ba.a aVar, TreeMap treeMap) {
        String str;
        List list = (List) treeMap.get("Sec-WebSocket-Protocol");
        if (list == null || (str = (String) list.get(0)) == null || str.length() == 0) {
            return;
        }
        synchronized (((tc.u) this.a).c) {
        }
        throw new tc.n(19, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), aVar);
    }

    @Override // mg.o
    public void I(boolean z10) {
        ((uf0) this.a).c.setAspectLock(z10);
    }

    @Override // org.telegram.ui.y9
    public /* synthetic */ String I0() {
        return null;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        ((ChatActivityEnterView) this.a).R0(i10, z10, 0, true, 0L);
    }

    @Override // org.telegram.ui.y9
    public void K(String str) {
        String trim;
        int i10;
        a5 a5Var = (a5) this.a;
        if (str == null) {
            trim = "";
        } else {
            try {
                trim = str.trim();
            } catch (Throwable unused) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.g3(a5Var, 7));
                return;
            }
        }
        Uri parse = Uri.parse(trim);
        String scheme = parse.getScheme();
        if (("ton".equalsIgnoreCase(scheme) || "tc".equalsIgnoreCase(scheme)) && (a5Var.getParentActivity() instanceof LaunchActivity)) {
            LaunchActivity launchActivity = (LaunchActivity) a5Var.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.m2) a5Var).currentAccount;
            if (new ic0(launchActivity, i10, null, false).g(parse)) {
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.g3(a5Var, 7));
    }

    @Override // o0.a
    public Cursor X(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.a;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    @Override // l2.h
    public long a(long j10) {
        return 0L;
    }

    @Override // w2.a
    public long b(long j10) {
        ArrayList arrayList = (ArrayList) this.a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((z3.b) arrayList.get(0)).b) {
            return ((z3.b) arrayList.get(0)).b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            z3.b bVar = (z3.b) arrayList.get(i10);
            long j11 = bVar.b;
            long j12 = bVar.b;
            if (j10 < j11) {
                long j13 = ((z3.b) arrayList.get(i10 - 1)).d;
                return (j13 == -9223372036854775807L || j13 <= j10 || j13 >= j12) ? j12 : j13;
            }
        }
        long j14 = ((z3.b) e9.s.m(arrayList)).d;
        if (j14 == -9223372036854775807L || j10 >= j14) {
            return Long.MIN_VALUE;
        }
        return j14;
    }

    @Override // w2.a
    public void clear() {
        ((ArrayList) this.a).clear();
    }

    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.a;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // w2.a
    public e9.n0 d(long j10) {
        int z10 = z(j10);
        if (z10 == 0) {
            e9.l0 l0Var = e9.n0.b;
            return e9.x1.e;
        }
        z3.b bVar = (z3.b) ((ArrayList) this.a).get(z10 - 1);
        long j11 = bVar.d;
        if (j11 == -9223372036854775807L || j10 < j11) {
            return bVar.a;
        }
        e9.l0 l0Var2 = e9.n0.b;
        return e9.x1.e;
    }

    @Override // mg.o
    public void d0(boolean z10) {
        uf0 uf0Var = (uf0) this.a;
        uf0Var.getClass();
        tf0 tf0Var = uf0Var.a;
        if (tf0Var != null) {
            ((zs0) tf0Var).a(z10);
        }
    }

    @Override // org.telegram.ui.y9
    public /* synthetic */ boolean d1(String str, o9 o9Var) {
        return false;
    }

    @Override // l2.h
    public long e(long j10, long j11) {
        return 0L;
    }

    @Override // l2.h
    public long f(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // hd.a
    public Object get() {
        return new s5.i((Context) ((hd.a) this.a).get(), "com.google.android.datatransport.events", Integer.valueOf(s5.i.d).intValue());
    }

    @Override // l2.h
    public m2.j h(long j10) {
        return (m2.j) this.a;
    }

    @Override // mg.o
    public void h0() {
        tf0 tf0Var = ((uf0) this.a).a;
        if (tf0Var != null) {
            PhotoViewer photoViewer = ((zs0) tf0Var).a;
            if (photoViewer.c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.q3();
            }
        }
    }

    @Override // org.telegram.ui.Components.lb0
    public Paint.FontMetricsInt i() {
        return ((vi) this.a).H0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // org.telegram.ui.Components.z71
    public void invalidate() {
        ((org.telegram.ui.Cells.u1) ((org.telegram.ui.Cells.h1) this.a).b).invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // w2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean j(z3.b bVar, long j10) {
        boolean z10;
        int size;
        ArrayList arrayList = (ArrayList) this.a;
        long j11 = bVar.b;
        u6.g(j11 != -9223372036854775807L);
        if (j11 <= j10) {
            long j12 = bVar.d;
            if (j12 == -9223372036854775807L || j10 < j12) {
                z10 = true;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    if (j11 >= ((z3.b) arrayList.get(size)).b) {
                        arrayList.add(size + 1, bVar);
                        return z10;
                    }
                    if (((z3.b) arrayList.get(size)).b <= j10) {
                        z10 = false;
                    }
                }
                arrayList.add(0, bVar);
                return z10;
            }
        }
        z10 = false;
        while (size >= 0) {
        }
        arrayList.add(0, bVar);
        return z10;
    }

    @Override // bh.h
    public void k(Canvas canvas) {
        ir0 ir0Var = (ir0) this.a;
        canvas.drawColor(ir0Var.getThemedColor(g6.d6));
        if (SharedConfig.chatBlurEnabled()) {
            ir0Var.O0.b(canvas, -3);
        }
    }

    @Override // l.i
    public void l(l.k kVar) {
        h hVar = ((ActionMenuView) this.a).K;
        if (hVar != null) {
            hVar.l(kVar);
        }
    }

    @Override // bh.h
    public void m0(bh.a aVar) {
        aVar.a(((ir0) this.a).getThemedColor(g6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override // l2.h
    public long n(long j10, long j11) {
        return 0L;
    }

    @Override // l.i
    public boolean o(l.k kVar, MenuItem menuItem) {
        m mVar = ((ActionMenuView) this.a).P;
        if (mVar == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((h5) mVar).b).W.c).iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.a0) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        y8.e0 e0Var = (y8.e0) this.a;
        if (task.isSuccessful()) {
            x8.m.L0(e0Var, true, (byte[]) task.getResult());
        } else {
            Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
            x8.m.L0(e0Var, false, null);
        }
    }

    @Override // w2.a
    public long p(long j10) {
        ArrayList arrayList = (ArrayList) this.a;
        if (arrayList.isEmpty() || j10 < ((z3.b) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j11 = ((z3.b) arrayList.get(i10)).b;
            if (j10 == j11) {
                return j11;
            }
            if (j10 < j11) {
                z3.b bVar = (z3.b) arrayList.get(i10 - 1);
                long j12 = bVar.d;
                return (j12 == -9223372036854775807L || j12 > j10) ? bVar.b : j12;
            }
        }
        z3.b bVar2 = (z3.b) e9.s.m(arrayList);
        long j13 = bVar2.d;
        return (j13 == -9223372036854775807L || j10 < j13) ? bVar2.b : j13;
    }

    @Override // w2.a
    public void q(long j10) {
        ArrayList arrayList = (ArrayList) this.a;
        int z10 = z(j10);
        if (z10 == 0) {
            return;
        }
        long j11 = ((z3.b) arrayList.get(z10 - 1)).d;
        if (j11 == -9223372036854775807L || j11 >= j10) {
            z10--;
        }
        arrayList.subList(0, z10).clear();
    }

    @Override // org.telegram.ui.Components.lb0
    public void r(int i10, int i11, CharSequence charSequence, boolean z10) {
        vi viVar = (vi) this.a;
        if (viVar.o1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(viVar.o1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, viVar.o1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            viVar.o1().setText(spannableStringBuilder);
            viVar.o1().setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // l2.h
    public boolean s() {
        return true;
    }

    @Override // org.telegram.ui.Components.xq0
    public void s0() {
        sc k10 = ((zh.r3) this.a).getBulletinFactory().k(false);
        k10.t = true;
        k10.j();
    }

    public void t(int i10, int i11, c3.p pVar) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        int i17;
        int i18;
        int i19;
        int i20;
        u3.f fVar = (u3.f) this.a;
        u3.g gVar = fVar.b;
        SparseArray sparseArray = fVar.c;
        e2.x xVar = fVar.k;
        e2.x xVar2 = fVar.i;
        int i21 = 2;
        int i22 = 0;
        int i23 = 1;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (fVar.O != 2) {
                    return;
                }
                u3.e eVar = (u3.e) sparseArray.get(fVar.U);
                int i24 = fVar.X;
                e2.x xVar3 = fVar.p;
                if (i24 != 4 || !"V_VP9".equals(eVar.c)) {
                    pVar.r(i11);
                    return;
                } else {
                    xVar3.K(i11);
                    pVar.readFully(xVar3.a, 0, i11);
                    return;
                }
            }
            if (i10 == 16877) {
                fVar.h(i10);
                u3.e eVar2 = fVar.y;
                int i25 = eVar2.h;
                if (i25 != 1685485123 && i25 != 1685480259) {
                    pVar.r(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                eVar2.P = bArr;
                pVar.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 16981) {
                fVar.h(i10);
                byte[] bArr2 = new byte[i11];
                fVar.y.j = bArr2;
                pVar.readFully(bArr2, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr3 = new byte[i11];
                pVar.readFully(bArr3, 0, i11);
                fVar.h(i10);
                fVar.y.k = new c3.h0(1, 0, 0, bArr3);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(xVar.a, (byte) 0);
                pVar.readFully(xVar.a, 4 - i11, i11);
                xVar.N(0);
                fVar.A = (int) xVar.C();
                return;
            }
            if (i10 == 25506) {
                fVar.h(i10);
                byte[] bArr4 = new byte[i11];
                fVar.y.l = bArr4;
                pVar.readFully(bArr4, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw b2.x0.a(null, "Unexpected id: " + i10);
            }
            fVar.h(i10);
            byte[] bArr5 = new byte[i11];
            fVar.y.x = bArr5;
            pVar.readFully(bArr5, 0, i11);
            return;
        }
        if (fVar.O == 0) {
            fVar.U = (int) gVar.b(pVar, false, true, 8);
            fVar.V = gVar.c;
            fVar.Q = -9223372036854775807L;
            fVar.O = 1;
            xVar2.K(0);
        }
        u3.e eVar3 = (u3.e) sparseArray.get(fVar.U);
        if (eVar3 == null) {
            pVar.r(i11 - fVar.V);
            fVar.O = 0;
            return;
        }
        eVar3.a0.getClass();
        if (fVar.O == 1) {
            fVar.l(pVar, 3);
            int i26 = (xVar2.a[2] & 6) >> 1;
            byte b10 = 255;
            if (i26 == 0) {
                fVar.S = 1;
                int[] iArr = fVar.T;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                fVar.T = iArr;
                iArr[0] = (i11 - fVar.V) - 3;
            } else {
                fVar.l(pVar, 4);
                int i27 = (xVar2.a[3] & 255) + 1;
                fVar.S = i27;
                int[] iArr2 = fVar.T;
                if (iArr2 == null) {
                    iArr2 = new int[i27];
                } else if (iArr2.length < i27) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i27)];
                }
                fVar.T = iArr2;
                if (i26 == 2) {
                    int i28 = (i11 - fVar.V) - 4;
                    int i29 = fVar.S;
                    Arrays.fill(iArr2, 0, i29, i28 / i29);
                } else {
                    if (i26 != 1) {
                        if (i26 != 3) {
                            throw b2.x0.a(null, "Unexpected lacing value: " + i26);
                        }
                        int i30 = 0;
                        int i31 = 0;
                        int i32 = 4;
                        while (true) {
                            int i33 = fVar.S - i23;
                            if (i30 >= i33) {
                                i12 = i21;
                                i13 = i22;
                                i14 = i23;
                                fVar.T[i33] = ((i11 - fVar.V) - i32) - i31;
                                break;
                            }
                            fVar.T[i30] = i22;
                            int i34 = i32 + 1;
                            fVar.l(pVar, i34);
                            if (xVar2.a[i32] == 0) {
                                throw b2.x0.a(null, "No valid varint length mask found");
                            }
                            int i35 = i22;
                            while (true) {
                                if (i35 >= 8) {
                                    i15 = i21;
                                    i16 = i23;
                                    j10 = 0;
                                    i17 = i34;
                                    break;
                                }
                                int i36 = i23 << (7 - i35);
                                i15 = i21;
                                if ((xVar2.a[i32] & i36) != 0) {
                                    int i37 = i34 + i35;
                                    fVar.l(pVar, i37);
                                    i16 = i23;
                                    j10 = xVar2.a[i32] & b10 & (~i36);
                                    while (i34 < i37) {
                                        j10 = (j10 << 8) | (xVar2.a[i34] & b10);
                                        i34++;
                                        i37 = i37;
                                        b10 = 255;
                                    }
                                    i17 = i37;
                                    if (i30 > 0) {
                                        j10 -= (1 << ((i35 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i35++;
                                    i21 = i15;
                                    b10 = 255;
                                }
                            }
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                break;
                            }
                            int i38 = (int) j10;
                            int[] iArr3 = fVar.T;
                            if (i30 != 0) {
                                i38 += iArr3[i30 - 1];
                            }
                            iArr3[i30] = i38;
                            i31 += i38;
                            i30++;
                            i22 = i35;
                            i21 = i15;
                            i23 = i16;
                            i32 = i17;
                            b10 = 255;
                        }
                        throw b2.x0.a(null, "EBML lacing sample size out of range.");
                    }
                    int i39 = 0;
                    int i40 = 0;
                    int i41 = 4;
                    while (true) {
                        i18 = fVar.S - 1;
                        if (i39 >= i18) {
                            break;
                        }
                        fVar.T[i39] = 0;
                        while (true) {
                            i19 = i41 + 1;
                            fVar.l(pVar, i19);
                            int i42 = xVar2.a[i41] & 255;
                            int[] iArr4 = fVar.T;
                            i20 = iArr4[i39] + i42;
                            iArr4[i39] = i20;
                            if (i42 != 255) {
                                break;
                            } else {
                                i41 = i19;
                            }
                        }
                        i40 += i20;
                        i39++;
                        i41 = i19;
                    }
                    fVar.T[i18] = ((i11 - fVar.V) - i41) - i40;
                }
            }
            i12 = 2;
            i13 = 0;
            i14 = 1;
            byte[] bArr6 = xVar2.a;
            fVar.P = fVar.n((bArr6[i14] & 255) | (bArr6[i13] << 8)) + fVar.M;
            fVar.W = (eVar3.e == i14 || (i10 == 163 && (xVar2.a[i12] & 128) == 128)) ? 1 : i13;
            fVar.O = i12;
            fVar.R = i13;
        }
        if (i10 == 163) {
            while (true) {
                int i43 = fVar.R;
                if (i43 >= fVar.S) {
                    fVar.O = 0;
                    return;
                } else {
                    fVar.i(eVar3, ((fVar.R * eVar3.f) / MediaDataController.MAX_STYLE_RUNS_COUNT) + fVar.P, fVar.W, fVar.o(pVar, eVar3, fVar.T[i43], false), 0);
                    fVar.R++;
                }
            }
        } else {
            while (true) {
                int i44 = fVar.R;
                if (i44 >= fVar.S) {
                    return;
                }
                int[] iArr5 = fVar.T;
                iArr5[i44] = fVar.o(pVar, eVar3, iArr5[i44], true);
                fVar.R++;
            }
        }
    }

    @Override // l2.h
    public long u() {
        return 0L;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void v(Object obj) {
        ((g8.c) obj).onLocationResult((LocationResult) this.a);
    }

    @Override // l2.h
    public long w(long j10) {
        return 1L;
    }

    @Override // l2.h
    public long x(long j10, long j11) {
        return 1L;
    }

    public int z(long j10) {
        ArrayList arrayList = (ArrayList) this.a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (j10 < ((z3.b) arrayList.get(i10)).b) {
                return i10;
            }
        }
        return arrayList.size();
    }

    public l(int i10) {
        switch (i10) {
            case 23:
                this.a = new ArrayList();
                break;
            default:
                this.a = new o2.d(1.0f, 5, 0, false);
                break;
        }
    }

    @Override // rg.x1
    public float get() {
        gu0 gu0Var = (gu0) this.a;
        int i10 = gu0Var.P1;
        qg.m currentBrush = gu0Var.W0.getCurrentBrush();
        if (currentBrush == null) {
            return qg.s0.e(i10).i;
        }
        return qg.s0.e(i10).f(String.valueOf(qg.m.a.indexOf(currentBrush)), currentBrush.d());
    }

    public l(int i10, int i11, int... iArr) {
        w60[] w60VarArr = new w60[(iArr.length / 2) + 1];
        this.a = w60VarArr;
        w60 w60Var = new w60(i10, i11);
        int i12 = 0;
        w60VarArr[0] = w60Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((w60[]) this.a)[i13] = new w60(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    @Override // org.telegram.ui.Components.xq0
    public /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.y9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.y9
    public /* synthetic */ void V0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Components.lb0
    public /* synthetic */ void y(String str) {
    }

    @Override // l2.h
    public long c(long j10, long j11) {
        return j11;
    }

    @Override // org.telegram.ui.Components.lb0
    public /* synthetic */ void g(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.lb0
    public /* synthetic */ void m(TLRPC.TL_document tL_document, String str, Object obj) {
    }
}
