package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.car.app.IOnDoneCallback;
import b8.mf;
import b8.yd;
import b8.ye;
import ci.e9;
import ci.v8;
import ei.q9;
import ei.r9;
import gi.f7;
import gi.qa;
import gi.va;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a20;
import org.telegram.messenger.a8;
import org.telegram.messenger.b20;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.m10;
import org.telegram.messenger.qr;
import org.telegram.messenger.re;
import org.telegram.messenger.u10;
import org.telegram.messenger.v10;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.x9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hm0;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z3(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        int i3;
        long j10;
        int i10;
        long j11;
        long j12;
        ArrayList arrayList;
        f7 f7Var = (f7) this.b;
        String str = (String) this.c;
        int[][] iArr = (int[][]) this.d;
        u10 u10Var = (u10) this.e;
        f7Var.getClass();
        b20 b20Var = new b20();
        char c2 = 1;
        b20Var.J = true;
        b20Var.a0 = f7Var.c1;
        b20Var.h = f7Var.k0;
        b20Var.i = f7Var.l0;
        b20Var.k = f7Var.i0;
        b20Var.l = f7Var.j0;
        File file = f7Var.P0;
        b20Var.B = file == null ? null : file.getPath();
        File file2 = f7Var.W0;
        b20Var.D = file2 == null ? null : file2.getPath();
        File file3 = f7Var.X0;
        b20Var.E = file3 == null ? null : file3.getPath();
        File file4 = f7Var.Y0;
        b20Var.F = file4 == null ? null : file4.getPath();
        int v = MediaController.v(b20Var.k, b20Var.l, b20Var.m, true);
        if (!f7Var.K || str == null || f7Var.v()) {
            File file5 = f7Var.Z0;
            if (file5 != null) {
                b20Var.o = file5.getAbsolutePath();
            } else {
                b20Var.o = str;
            }
            b20Var.I = true;
            b20Var.L = f7Var.S;
            if (f7Var.v()) {
                int i11 = 0;
                boolean z10 = false;
                while (i11 < f7Var.T.size()) {
                    f7 f7Var2 = (f7) f7Var.T.get(i11);
                    if (f7Var2.K) {
                        f7Var2.k0 = Math.max(f7Var2.k0, iArr[i11][c2]);
                        f7Var2.l0 = Math.max(f7Var2.l0, iArr[i11][2]);
                        i10 = v;
                        f7Var2.h0 = Math.max(f7Var2.h0, iArr[i11][4]);
                        z10 = true;
                    } else {
                        i10 = v;
                    }
                    i11++;
                    v = i10;
                    c2 = 1;
                }
                i3 = v;
                ArrayList a10 = a20.a(f7Var);
                b20Var.M = a10;
                if (z10) {
                    int size = a10.size();
                    long j13 = 0;
                    a20 a20Var = null;
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = a10.get(i12);
                        i12++;
                        a20 a20Var2 = (a20) obj;
                        if (a20Var2.b) {
                            long j14 = a20Var2.o;
                            if (j14 > j13) {
                                a20Var = a20Var2;
                                j13 = j14;
                            }
                        }
                    }
                    if (a20Var != null) {
                        float f10 = a20Var.o;
                        float f11 = a20Var.k;
                        float f12 = a20Var.j;
                        long j15 = (long) ((f11 - f12) * f10);
                        f7Var.h0 = j15;
                        b20Var.v = j15;
                        b20Var.r = j15;
                        j10 = -(a20Var.f + ((long) (f12 * f10)));
                        a20Var.f = j10;
                        ArrayList arrayList2 = b20Var.M;
                        int size2 = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            Object obj2 = arrayList2.get(i13);
                            i13++;
                            a20 a20Var3 = (a20) obj2;
                            if (a20Var3.b && a20Var3 != a20Var) {
                                a20Var3.f += j10;
                            }
                        }
                        b20Var.a = -1L;
                        b20Var.b = -1L;
                        b20Var.t = true;
                        b20Var.j = -1;
                        b20Var.u = 1.0f;
                        b20Var.m = -1;
                        b20Var.n = 30;
                        b20Var.q = (long) (((f7Var.h0 / 1000.0f) * i3) / 8.0f);
                        b20Var.A = null;
                    }
                } else {
                    long j16 = f7Var.S0;
                    f7Var.h0 = j16;
                    b20Var.v = j16;
                    b20Var.r = j16;
                }
            } else {
                i3 = v;
                if (f7Var.o0 != null) {
                    long j17 = (long) ((f7Var.t0 - f7Var.s0) * f7Var.q0);
                    f7Var.h0 = j17;
                    b20Var.v = j17;
                    b20Var.r = j17;
                } else if (f7Var.y != null) {
                    long j18 = (long) ((f7Var.F - f7Var.E) * f7Var.C);
                    f7Var.h0 = j18;
                    b20Var.v = j18;
                    b20Var.r = j18;
                } else {
                    long j19 = f7Var.S0;
                    f7Var.h0 = j19;
                    b20Var.v = j19;
                    b20Var.r = j19;
                }
            }
            j10 = 0;
            b20Var.a = -1L;
            b20Var.b = -1L;
            b20Var.t = true;
            b20Var.j = -1;
            b20Var.u = 1.0f;
            b20Var.m = -1;
            b20Var.n = 30;
            b20Var.q = (long) (((f7Var.h0 / 1000.0f) * i3) / 8.0f);
            b20Var.A = null;
        } else {
            b20Var.o = str;
            b20Var.I = false;
            b20Var.n = Math.min(59, iArr[0][7]);
            int E = MediaController.E(str);
            if (E == -1) {
                E = iArr[0][3];
            }
            b20Var.j = E;
            if (E >= 1000000 || (arrayList = f7Var.T0) == null || arrayList.isEmpty()) {
                int i14 = b20Var.j;
                if (i14 < 500000) {
                    b20Var.m = 2500000;
                    b20Var.j = -1;
                } else {
                    b20Var.m = Utilities.j(i14, 3000000, 500000);
                }
            } else {
                b20Var.m = 2000000;
                b20Var.j = -1;
            }
            StringBuilder sb2 = new StringBuilder("story bitrate, original = ");
            sb2.append(b20Var.j);
            sb2.append(" => ");
            k2.p1.q(b20Var.m, sb2);
            int i15 = iArr[0][4];
            long j20 = i15;
            f7Var.h0 = j20;
            b20Var.v = j20 * 1000;
            float f13 = j20;
            long j21 = ((long) (f7Var.Z * f13)) * 1000;
            b20Var.a = j21;
            long j22 = ((long) (f7Var.a0 * f13)) * 1000;
            b20Var.b = j22;
            b20Var.r = j22 - j21;
            b20Var.u = f7Var.P;
            b20Var.t = f7Var.Y;
            b20Var.q = (long) a1.g.e(i15 / 1000.0f, v, 8.0f, r2[5]);
            b20Var.q = Math.max(f7Var.L.length(), b20Var.q);
            b20Var.A = f7Var.a1;
            File file6 = f7Var.Q0;
            b20Var.C = file6 == null ? null : file6.getPath();
            j10 = 0;
        }
        b20Var.S = f7Var.a;
        b20Var.U = f7Var.z0;
        b20Var.T = f7Var.y0;
        b20Var.c = -1L;
        re reVar = f7Var.m0;
        if (reVar != null) {
            b20Var.H = reVar.clone();
        } else {
            b20Var.H = new re();
        }
        b20Var.H.B = new Matrix();
        b20Var.H.B.set(f7Var.n0);
        b20Var.G = f7Var.T0;
        b20Var.Q = Integer.valueOf(f7Var.A0);
        b20Var.R = Integer.valueOf(f7Var.B0);
        b20Var.V = true;
        b20Var.K = f7Var.d1;
        b20Var.b0.clear();
        if (f7Var.v() && !f7Var.Y) {
            ArrayList arrayList3 = b20Var.M;
            int size3 = arrayList3.size();
            int i16 = 0;
            while (i16 < size3) {
                Object obj3 = arrayList3.get(i16);
                i16++;
                a20 a20Var4 = (a20) obj3;
                if (a20Var4.b && a20Var4.e > 0.0f && !a20Var4.c) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(a20Var4.d);
                    mixedSoundInfo.volume = a20Var4.e;
                    float f14 = a20Var4.j;
                    float f15 = a20Var4.o;
                    mixedSoundInfo.audioOffset = ((long) (f14 * f15)) * 1000;
                    mixedSoundInfo.startTime = a20Var4.f * 1000;
                    mixedSoundInfo.duration = ((long) ((a20Var4.k - f14) * f15)) * 1000;
                    b20Var.b0.add(mixedSoundInfo);
                }
            }
        }
        File file7 = f7Var.o0;
        if (file7 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
            mixedSoundInfo2.volume = f7Var.u0;
            float f16 = f7Var.s0;
            float f17 = f7Var.q0;
            long j23 = ((long) (f16 * f17)) * 1000;
            mixedSoundInfo2.audioOffset = j23;
            if (f7Var.K) {
                mixedSoundInfo2.startTime = ((long) (f7Var.r0 - (f7Var.Z * f7Var.h0))) * 1000;
                j12 = 0;
            } else {
                j12 = 0;
                mixedSoundInfo2.startTime = 0L;
            }
            long j24 = mixedSoundInfo2.startTime + j10;
            mixedSoundInfo2.startTime = j24;
            if (j24 < j12) {
                mixedSoundInfo2.audioOffset = j23 - j24;
                mixedSoundInfo2.startTime = j12;
            }
            mixedSoundInfo2.duration = ((long) ((f7Var.t0 - f16) * f17)) * 1000;
            b20Var.b0.add(mixedSoundInfo2);
        }
        String str2 = f7Var.y;
        if (str2 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str2);
            mixedSoundInfo3.volume = f7Var.G;
            float f18 = f7Var.E;
            float f19 = f7Var.C;
            long j25 = ((long) (f18 * f19)) * 1000;
            mixedSoundInfo3.audioOffset = j25;
            if (f7Var.K) {
                mixedSoundInfo3.startTime = ((long) (f7Var.D - (f7Var.Z * f7Var.h0))) * 1000;
                j11 = 0;
            } else {
                j11 = 0;
                mixedSoundInfo3.startTime = 0L;
            }
            long j26 = mixedSoundInfo3.startTime + j10;
            mixedSoundInfo3.startTime = j26;
            if (j26 < j11) {
                mixedSoundInfo3.audioOffset = j25 - j26;
                mixedSoundInfo3.startTime = j11;
            }
            mixedSoundInfo3.duration = ((long) ((f7Var.F - f18) * f19)) * 1000;
            b20Var.b0.add(mixedSoundInfo3);
        }
        u10Var.a(b20Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0176, code lost:
    
        if (r6.equals("android.media.metadata.WRITER") == false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        Bitmap bitmap;
        Bundle bundle;
        g9.i0 i0Var;
        Bundle bundle2;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        Bundle bundle3;
        CharSequence charSequence;
        CharSequence charSequence2;
        o4.m0 m0Var = (o4.m0) this.b;
        AtomicInteger atomicInteger = (AtomicInteger) this.c;
        ArrayList arrayList3 = (ArrayList) this.d;
        if (atomicInteger.incrementAndGet() == arrayList3.size()) {
            ArrayList arrayList4 = new ArrayList();
            int i3 = 0;
            for (ArrayList arrayList5 = (ArrayList) this.e; i3 < arrayList5.size(); arrayList5 = arrayList2) {
                l9.y yVar = (l9.y) arrayList5.get(i3);
                if (yVar != null) {
                    try {
                        bitmap = (Bitmap) yd.a(yVar);
                    } catch (CancellationException | ExecutionException e10) {
                        synchronized (g2.a.b) {
                            Log.d("MediaSessionLegacyStub", g2.a.a("Failed to get bitmap", e10));
                        }
                    }
                    d2.n0 n0Var = (d2.n0) arrayList3.get(i3);
                    int i10 = o4.n.a;
                    String str = !n0Var.a.equals("") ? null : n0Var.a;
                    d2.q0 q0Var = n0Var.d;
                    Bitmap bitmap2 = bitmap == null ? bitmap : null;
                    bundle = q0Var.J;
                    CharSequence charSequence3 = q0Var.a;
                    CharSequence charSequence4 = q0Var.g;
                    CharSequence charSequence5 = q0Var.f;
                    i0Var = q0Var.K;
                    Integer num = q0Var.I;
                    Integer num2 = q0Var.q;
                    if (bundle != null) {
                        bundle = new Bundle(bundle);
                    }
                    bundle2 = bundle;
                    z10 = num2 == null && num2.intValue() != -1;
                    z11 = num == null;
                    if (!z10 || z11) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        Bundle bundle4 = bundle2;
                        if (z10) {
                            arrayList = arrayList3;
                            arrayList2 = arrayList5;
                        } else {
                            num2.getClass();
                            arrayList = arrayList3;
                            arrayList2 = arrayList5;
                            bundle4.putLong("android.media.extra.BT_FOLDER_TYPE", o4.n.a(num2.intValue()));
                        }
                        if (z11) {
                            num.getClass();
                            bundle4.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", num.intValue());
                        }
                        bundle3 = bundle4;
                    } else {
                        arrayList = arrayList3;
                        arrayList2 = arrayList5;
                        bundle3 = bundle2;
                    }
                    if (!i0Var.isEmpty()) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST", new ArrayList<>(i0Var));
                    }
                    charSequence = q0Var.e;
                    if (charSequence == null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putCharSequence("androidx.media3.mediadescriptioncompat.title", charSequence3);
                    } else {
                        int i11 = 3;
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            char c2 = 2;
                            if (i12 < i11) {
                                String[] strArr = p4.i.d;
                                if (i13 < strArr.length) {
                                    int i14 = i13 + 1;
                                    String str2 = strArr[i13];
                                    str2.getClass();
                                    switch (str2.hashCode()) {
                                        case -1853648227:
                                            if (str2.equals("android.media.metadata.ARTIST")) {
                                                c2 = 0;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1850878751:
                                            if (str2.equals("android.media.metadata.AUTHOR")) {
                                                c2 = 1;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1224124471:
                                            break;
                                        case 194702059:
                                            if (str2.equals("android.media.metadata.DISPLAY_SUBTITLE")) {
                                                c2 = 3;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1058837545:
                                            if (str2.equals("android.media.metadata.DISPLAY_DESCRIPTION")) {
                                                c2 = 4;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1684534006:
                                            if (str2.equals("android.media.metadata.COMPOSER")) {
                                                c2 = 5;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1879671865:
                                            if (str2.equals("android.media.metadata.ALBUM")) {
                                                c2 = 6;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1897146402:
                                            if (str2.equals("android.media.metadata.TITLE")) {
                                                c2 = 7;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1965214221:
                                            if (str2.equals("android.media.metadata.ALBUM_ARTIST")) {
                                                c2 = '\b';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        default:
                                            c2 = 65535;
                                            break;
                                    }
                                    switch (c2) {
                                        case 0:
                                            charSequence2 = q0Var.b;
                                            break;
                                        case 1:
                                        default:
                                            charSequence2 = null;
                                            break;
                                        case 2:
                                            charSequence2 = q0Var.A;
                                            break;
                                        case 3:
                                            charSequence2 = charSequence5;
                                            break;
                                        case 4:
                                            charSequence2 = charSequence4;
                                            break;
                                        case 5:
                                            charSequence2 = q0Var.B;
                                            break;
                                        case 6:
                                            charSequence2 = q0Var.c;
                                            break;
                                        case 7:
                                            charSequence2 = charSequence3;
                                            break;
                                        case '\b':
                                            charSequence2 = q0Var.d;
                                            break;
                                    }
                                    if (!TextUtils.isEmpty(charSequence2)) {
                                        charSequenceArr[i12] = charSequence2;
                                        i12++;
                                    }
                                    i13 = i14;
                                    i11 = 3;
                                }
                            }
                        }
                        charSequence = charSequenceArr[0];
                        charSequence5 = charSequenceArr[1];
                        charSequence4 = charSequenceArr[2];
                    }
                    arrayList4.add(new p4.o(new p4.h(str, charSequence, charSequence5, charSequence4, bitmap2, q0Var.n, bundle3, n0Var.f.a), i3 != -1 ? -1L : i3));
                    i3++;
                    arrayList3 = arrayList;
                }
                bitmap = null;
                d2.n0 n0Var2 = (d2.n0) arrayList3.get(i3);
                int i102 = o4.n.a;
                if (!n0Var2.a.equals("")) {
                }
                d2.q0 q0Var2 = n0Var2.d;
                if (bitmap == null) {
                }
                bundle = q0Var2.J;
                CharSequence charSequence32 = q0Var2.a;
                CharSequence charSequence42 = q0Var2.g;
                CharSequence charSequence52 = q0Var2.f;
                i0Var = q0Var2.K;
                Integer num3 = q0Var2.I;
                Integer num22 = q0Var2.q;
                if (bundle != null) {
                }
                bundle2 = bundle;
                if (num22 == null) {
                }
                if (num3 == null) {
                }
                if (z10) {
                }
                if (bundle2 == null) {
                }
                Bundle bundle42 = bundle2;
                if (z10) {
                }
                if (z11) {
                }
                bundle3 = bundle42;
                if (!i0Var.isEmpty()) {
                }
                charSequence = q0Var2.e;
                if (charSequence == null) {
                }
                arrayList4.add(new p4.o(new p4.h(str, charSequence, charSequence52, charSequence42, bitmap2, q0Var2.n, bundle3, n0Var2.f.a), i3 != -1 ? -1L : i3));
                i3++;
                arrayList3 = arrayList;
            }
            o4.o0.e0(((o4.o0) m0Var.e).n, arrayList4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ef, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void c() {
        o4.h1 h1Var = (o4.h1) this.b;
        o4.v vVar = (o4.v) this.c;
        o4.e0 e0Var = (o4.e0) this.d;
        o4.l lVar = (o4.l) this.e;
        ui.f fVar = h1Var.b;
        boolean z10 = false;
        try {
            h1Var.c.remove(vVar);
            if (e0Var.j()) {
                ye.a(lVar);
                return;
            }
            o4.c1 c1Var = (o4.c1) vVar.d;
            c1Var.getClass();
            IBinder asBinder = c1Var.a.asBinder();
            o4.t m10 = e0Var.m(vVar);
            if (fVar.t(vVar)) {
                g2.a.l("MediaSessionStub", "Controller " + vVar + " has sent connection request multiple times");
            }
            fVar.a(asBinder, vVar, m10.a, m10.b);
            com.google.android.gms.common.api.internal.s s6 = fVar.s(vVar);
            if (s6 == null) {
                g2.a.l("MediaSessionStub", "Ignoring connection request from unknown controller info");
                ye.a(lVar);
                return;
            }
            o4.l1 l1Var = e0Var.t;
            o4.j1 j1Var = e0Var.s;
            d2.a1 a1Var = m10.b;
            o4.j1 a12 = h1Var.a1(j1Var);
            MediaSession.Token token = ((p4.l) e0Var.h.n.a).c.b;
            g9.i0 i0Var = m10.c;
            if (i0Var == null) {
                i0Var = e0Var.y;
            }
            g9.i0 i0Var2 = m10.d;
            if (i0Var2 == null) {
                i0Var2 = e0Var.z;
            }
            g9.i0 i0Var3 = e0Var.r;
            o4.o1 o1Var = m10.a;
            d2.a1 t10 = l1Var.t();
            o4.t1 t1Var = e0Var.j.a;
            t1Var.getClass();
            o4.j jVar = new o4.j(h1Var, i0Var, i0Var2, i0Var3, o1Var, a1Var, t10, new Bundle(t1Var.g), e0Var.A, a12, token);
            if (e0Var.j()) {
                ye.a(lVar);
                return;
            }
            try {
                ((o4.k) lVar).H0(s6.e(), jVar.a(vVar.c));
                z10 = true;
            } catch (RemoteException unused) {
            }
            if (z10 && (!e0Var.x || !o4.e0.k(vVar))) {
                e0Var.e.getClass();
            }
        } finally {
            if (0 == 0) {
                ye.a(lVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0373, code lost:
    
        if (r8 != null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0375, code lost:
    
        r8.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x038d, code lost:
    
        org.telegram.messenger.g0.h3(new ei.o6(r9, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0396, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x038a, code lost:
    
        if (r8 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011c, code lost:
    
        if (r6 == null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04be  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        BufferedWriter bufferedWriter;
        String e10;
        BufferedWriter bufferedWriter2;
        String str;
        int i3;
        int i10;
        f7 f7Var;
        File file;
        ArrayList arrayList;
        TL_stories.StoryItem storyItem;
        TLRPC.Photo photo;
        q9 q9Var;
        char c2;
        org.telegram.ui.ActionBar.d2 T;
        boolean z10;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLiteCursor sQLiteCursor = null;
        int i11 = 1;
        switch (this.a) {
            case 0:
                final o4 o4Var = (o4) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                q2 q2Var = (q2) this.d;
                final View view = (View) this.e;
                vp0 vp0Var = o4Var.a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    q2Var.i(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = o4Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(o4Var.b).sendRequest(savestargift, null, 64);
                }
                boolean z11 = savedStarGift.pinned_to_top;
                final boolean z12 = !z11;
                if (o4Var.e.o(savedStarGift, z12, false)) {
                    new t4(o4Var.getContext(), vp0Var.c, savedStarGift, o4Var.c, new m10() { // from class: ai.e4
                        @Override // org.telegram.messenger.m10
                        public final Object run() {
                            ((q2) view).d(z12, true);
                            o4 o4Var2 = o4.this;
                            o4Var2.f.v0(0);
                            return fc.a0(o4Var2.a.a);
                        }
                    }).show();
                    return;
                }
                if (z11) {
                    org.telegram.messenger.k5.o(null, 2131749888, fc.a0(vp0Var.a), R.raw.ic_unpin, 36);
                } else {
                    fc.a0(vp0Var.a).I(R.raw.ic_pin, bd.M0(2131750084, null), bd.M0(2131750085, null)).j();
                }
                ((q2) view).d(z12, true);
                o4Var.f.v0(0);
                return;
            case 1:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.b;
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.c;
                String str2 = (String) this.d;
                androidx.car.app.utils.a aVar = (androidx.car.app.utils.a) this.e;
                if (oVar != null && ((androidx.lifecycle.v) oVar).c.compareTo(androidx.lifecycle.n.c) >= 0) {
                    androidx.car.app.utils.g.b(iOnDoneCallback, str2, aVar);
                    return;
                }
                androidx.car.app.utils.g.f(iOnDoneCallback, str2, new IllegalStateException("Lifecycle is not at least created when dispatching " + aVar));
                return;
            case 2:
                m.o3 o3Var = (m.o3) this.b;
                String str3 = (String) this.c;
                Map map = (Map) this.d;
                List list = (List) this.e;
                ba.h hVar = (ba.h) o3Var.a;
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) o3Var.g;
                if (((String) atomicMarkableReference.getReference()) != null) {
                    hVar.i(str3, (String) atomicMarkableReference.getReference());
                }
                if (!map.isEmpty()) {
                    hVar.h(str3, map, false);
                }
                if (list.isEmpty()) {
                    return;
                }
                File b10 = hVar.a.b(str3, "rollouts-state");
                if (list.isEmpty()) {
                    ba.h.g(b10, "Rollout state is empty for session: " + str3);
                    return;
                }
                try {
                    e10 = ba.h.e(list);
                    bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b10), ba.h.b));
                } catch (Exception e11) {
                    e = e11;
                    bufferedWriter = null;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = null;
                }
                try {
                    bufferedWriter2.write(e10);
                    bufferedWriter2.flush();
                    z9.g.b(bufferedWriter2, "Failed to close rollouts state file.");
                    return;
                } catch (Exception e12) {
                    e = e12;
                    bufferedWriter = bufferedWriter2;
                    try {
                        Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                        ba.h.f(b10);
                        z9.g.b(bufferedWriter, "Failed to close rollouts state file.");
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        z9.g.b(bufferedWriter, "Failed to close rollouts state file.");
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bufferedWriter = bufferedWriter2;
                    z9.g.b(bufferedWriter, "Failed to close rollouts state file.");
                    throw th;
                }
            case 3:
                h41 h41Var = (h41) this.b;
                bi.a0 a0Var = (bi.a0) this.c;
                v10 v10Var = (v10) this.d;
                u10 u10Var = (u10) this.e;
                if (bi.a0.d(h41Var.getParentActivity())) {
                    a0Var.e();
                    hm0 hm0Var = new hm0(10, false, false, null);
                    hm0Var.H = 1;
                    hm0Var.I = false;
                    hm0Var.y = false;
                    hm0Var.W = new android.support.v4.media.session.a0(v10Var, h41Var, u10Var, 11);
                    h41Var.presentFragment(hm0Var);
                    return;
                }
                return;
            case 4:
                String str4 = (String) this.b;
                v10 v10Var2 = (v10) this.c;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.d;
                u10 u10Var2 = (u10) this.e;
                try {
                    Point c12 = org.telegram.messenger.g0.c1();
                    Bitmap K = zb.K(str4, null, c12.x, c12.y, true);
                    if (K != null) {
                        str = bi.a0.l(K, v10Var2);
                        try {
                            K.recycle();
                        } catch (Throwable th5) {
                            th = th5;
                            a8.g(th, true);
                            org.telegram.messenger.g0.h3(new bi.y(d2Var, str, u10Var2));
                            return;
                        }
                    } else {
                        str = null;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    str = null;
                }
                org.telegram.messenger.g0.h3(new bi.y(d2Var, str, u10Var2));
                return;
            case 5:
                ci.u uVar = (ci.u) this.b;
                TLObject tLObject = (TLObject) this.c;
                String str5 = (String) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                s sVar = uVar.n;
                ci.v vVar = uVar.r;
                if (vVar.P) {
                    return;
                }
                uVar.e = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    i3 = ((org.telegram.ui.ActionBar.d2) vVar).currentAccount;
                    hp.s1(i3).Y3(starsStatus.users, false);
                    i10 = ((org.telegram.ui.ActionBar.d2) vVar).currentAccount;
                    hp.s1(i10).S3(starsStatus.chats, false);
                    boolean z13 = ((starsStatus.flags & 1) == 0 || starsStatus.next_offset == null) ? false : true;
                    if (z13 && TextUtils.equals(str5, starsStatus.next_offset)) {
                        uVar.h = true;
                    } else {
                        uVar.b.addAll(starsStatus.history);
                        uVar.d = starsStatus.next_offset;
                        uVar.f = !z13;
                    }
                } else {
                    uVar.h = true;
                    if (tL_error != null) {
                        fc.d0(tL_error);
                    }
                }
                uVar.c.g3.O(false);
                uVar.removeCallbacks(sVar);
                uVar.post(sVar);
                return;
            case 6:
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                sf.b bVar = (sf.b) this.d;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.e;
                if (d2Var2 != null && tL_error2 != null) {
                    fc.a0(d2Var2).f0(tL_error2, false);
                }
                if ((d2Var2 instanceof wm) && tL_error2 == null) {
                    ((wm) d2Var2).Bc();
                }
                bVar.b();
                s1Var.dismiss();
                return;
            case 7:
                ci.l6 l6Var = (ci.l6) this.b;
                boolean[] zArr = (boolean[]) this.c;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) this.d;
                hc[] hcVarArr = (hc[]) this.e;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                TL_stars.StarGift y12 = l6Var.y1();
                org.telegram.messenger.q9.c(l6Var.a).j(y12.gift_id, new ci.o2(l6Var, y12, starGiftAttribute, hcVarArr, zArr, 0));
                return;
            case 8:
                ci.l6 l6Var2 = (ci.l6) this.b;
                zi ziVar = (zi) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                l6Var2.e3 = true;
                l6Var2.i2(ziVar, null);
                l6Var2.s2(0, true, null);
                gz gzVar = l6Var2.T1;
                if (gzVar != null) {
                    gzVar.c(true);
                }
                e9.y(l6Var2.a, false).O();
                v8 G = e9.y(l6Var2.a, false).G(h10.i(l6Var2.a).e(), false);
                if (G != null) {
                    G.k(arrayList2, starGift);
                    return;
                }
                return;
            case 9:
                ci.l6 l6Var3 = (ci.l6) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                k3 k3Var = (k3) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.e;
                if (!(tLObject2 instanceof TLRPC.TL_messages_chatFull)) {
                    ac Y = l6Var3.k().Y(tL_error3);
                    Y.t = true;
                    Y.j();
                    return;
                }
                TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject2;
                hp.s1(l6Var3.a).Y3(tL_messages_chatFull.users, false);
                hp.s1(l6Var3.a).S3(tL_messages_chatFull.chats, false);
                hp.s1(l6Var3.a).R3(tL_messages_chatFull.full_chat);
                if (tL_messages_chatFull.full_chat.stargifts_available) {
                    k3Var.run();
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, l6Var3.getContext(), l6Var3.J0);
                alertDialog$Builder.a.S = bd.M0(2131750270, null);
                alertDialog$Builder.a.U = bd.M0(2131750271, null);
                k2.p1.B(null, 2131747839, alertDialog$Builder, null);
                return;
            case 10:
                ci.l6 l6Var4 = (ci.l6) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                if (tL_error4 != null || !(tLObject3 instanceof TLRPC.Updates)) {
                    l6Var4.k().f0(tL_error4, false);
                    return;
                }
                l6Var4.k2 = true;
                l6Var4.l3 = null;
                l6Var4.m1(inputSavedStarGift, (TLRPC.Updates) tLObject3, new ci.s1(l6Var4, 9));
                Utilities.d.c(new ci.e0(6, l6Var4, tLObject3));
                return;
            case 11:
                ci.h5 h5Var = (ci.h5) this.b;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.Components.h6 h6Var = h5Var.I;
                h5Var.i0 = false;
                if (starGift2 != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    return;
                }
                fh0 fh0Var = h5Var.m0;
                if (fh0Var != null) {
                    fh0Var.d();
                    org.telegram.messenger.g0.i3(new y1(4), 750L);
                }
                h5Var.R.animate().alpha(0.0f).start();
                h5Var.T.animate().alpha(1.0f).start();
                h5Var.H.animate().alpha(1.0f).start();
                h5Var.S.animate().alpha(0.0f).start();
                h5Var.Q.animate().alpha(1.0f).start();
                h5Var.N.setText(org.telegram.messenger.g0.X2(bd.G(arrayList3.size(), "GiftCraftFailedText", new Object[0])));
                h6Var.setText(bd.M0(2131749803, null));
                h6Var.setTranslationY(org.telegram.messenger.g0.L(6.0f));
                h5Var.J.setAlpha(0.0f);
                if (h5Var.P != null) {
                    int i12 = 0;
                    while (true) {
                        q2[] q2VarArr = h5Var.P;
                        if (i12 < q2VarArr.length) {
                            org.telegram.messenger.g0.E2(q2VarArr[i12]);
                            i12++;
                        } else {
                            h5Var.P = null;
                        }
                    }
                }
                h5Var.P = new q2[arrayList3.size()];
                int i13 = 0;
                while (i13 < arrayList3.size()) {
                    TL_stars.StarGift starGift3 = (TL_stars.StarGift) arrayList3.get(i13);
                    q2 q2Var2 = new q2(h5Var.a0, h5Var.getContext(), h5Var.a);
                    q2Var2.h(starGift3, false, false, false, false, true);
                    q2Var2.y.setVisibility(8);
                    q2Var2.setRibbonColor(-3065286);
                    k9 k9Var = q2Var2.E;
                    FrameLayout.LayoutParams e13 = mf.e(42, 42, 17);
                    q2Var2.F = e13;
                    k9Var.setLayoutParams(e13);
                    int i14 = i13 + 1;
                    boolean z14 = i14 >= arrayList3.size();
                    LinearLayout linearLayout = h5Var.O;
                    h5Var.P[i13] = q2Var2;
                    linearLayout.addView(q2Var2, mf.q(74, 74, 0.0f, 51, 0, 0, z14 ? 0 : 6, 0));
                    i13 = i14;
                }
                return;
            case 12:
                ei.b4 b4Var = (ei.b4) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                u10 u10Var3 = (u10) this.e;
                ei.j4 j4Var = b4Var.x;
                if (tLObject4 instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject4;
                    hp.s1(j4Var.m2).Y3(tL_stories_stories.users, false);
                    hp.s1(j4Var.m2).S3(tL_stories_stories.chats, false);
                    for (int i15 = 0; i15 < tL_stories_stories.stories.size(); i15++) {
                        if (tL_stories_stories.stories.get(i15).id == storyItem2.id) {
                            u10Var3.a(tL_stories_stories.stories.get(i15).media.document);
                            return;
                        }
                    }
                }
                u10Var3.a(null);
                return;
            case 13:
                ei.b4 b4Var2 = (ei.b4) this.b;
                Activity activity = (Activity) this.c;
                r9 r9Var = (r9) this.d;
                ei.g4 g4Var = (ei.g4) this.e;
                va D = va.D(activity, b4Var2.x.m2);
                ei.i4 i4Var = b4Var2.x.w2;
                long j10 = (i4Var == null || (q9Var = (q9) i4Var.c) == null) ? 0L : q9Var.currentPosition;
                gi.z0 z0Var = hp.s1(b4Var2.x.m2).P1().w;
                TL_stories.StoryItem storyItem3 = b4Var2.x.y1.a;
                long j11 = storyItem3.dialogId;
                ArrayList arrayList4 = z0Var.b;
                int size = arrayList4.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj = arrayList4.get(i16);
                    i16++;
                    f7Var = (f7) obj;
                    if (f7Var.g && storyItem3.id == f7Var.f && j11 == f7Var.e) {
                        TLRPC.MessageMedia messageMedia = storyItem3.media;
                        TLRPC.Document document = messageMedia.document;
                        arrayList = arrayList4;
                        storyItem = storyItem3;
                        if ((document == null || document.id == f7Var.H) && ((photo = messageMedia.photo) == null || photo.id == f7Var.I)) {
                            f7Var.h = true;
                            if (f7Var != null || f7Var.u || (file = f7Var.L) == null || !file.exists()) {
                                f7Var = f7.n(b4Var2.x.y1.h(), b4Var2.x.y1.a);
                                f7Var.e = b4Var2.x.l1;
                            }
                            f7 g7 = f7Var.g();
                            if (b4Var2.x.G0()) {
                                ei.j4 j4Var2 = b4Var2.x;
                                g7.J0 = j4Var2.l1;
                                g7.L0 = hp.Z4(j4Var2.y1.a.media);
                                ei.r6 r6Var = r9Var.P0;
                                if (r6Var instanceof ei.k6) {
                                    g7.K0 = ((ei.k6) r6Var).E;
                                }
                            }
                            D.R(qa.d(r9Var), g7, j10);
                            D.R = new ei.v3(b4Var2, 3);
                            D.S = new ei.x3(b4Var2, g4Var, 1);
                            return;
                        }
                    } else {
                        arrayList = arrayList4;
                        storyItem = storyItem3;
                    }
                    storyItem3 = storyItem;
                    arrayList4 = arrayList;
                }
                f7Var = null;
                if (f7Var != null) {
                }
                f7Var = f7.n(b4Var2.x.y1.h(), b4Var2.x.y1.a);
                f7Var.e = b4Var2.x.l1;
                f7 g72 = f7Var.g();
                if (b4Var2.x.G0()) {
                }
                D.R(qa.d(r9Var), g72, j10);
                D.R = new ei.v3(b4Var2, 3);
                D.S = new ei.x3(b4Var2, g4Var, 1);
                return;
            case 14:
                ei.n6 n6Var = (ei.n6) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                u10 u10Var4 = (u10) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.e;
                n6Var.i = false;
                if (tLObject5 instanceof TL_stories.TL_storyAlbum) {
                    ei.s6 a10 = ei.s6.a((TL_stories.TL_storyAlbum) tLObject5);
                    n6Var.h.add(a10);
                    n6Var.f(true);
                    u10Var4.a(a10);
                    return;
                }
                if (tL_error5 == null || (T = LaunchActivity.T()) == null) {
                    c2 = 0;
                } else {
                    c2 = 0;
                    fc.a0(T).f0(tL_error5, false);
                }
                hs f10 = hs.f(n6Var.a);
                Object[] objArr = new Object[2];
                objArr[c2] = Long.valueOf(n6Var.b);
                objArr[1] = n6Var;
                f10.k(hs.j3, objArr);
                return;
            case 15:
                ei.r6 r6Var2 = (ei.r6) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                qr qrVar = (qr) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                int i17 = r6Var2.f;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i18 = r6Var2.e;
                sb2.append(i18);
                sb2.append("{");
                long j12 = r6Var2.d;
                sb2.append(j12);
                sb2.append("} saveCache {");
                sb2.append(ei.z6.a(arrayList5));
                k2.p1.w("}", sb2);
                try {
                    SQLiteDatabase sQLiteDatabase = qrVar.b;
                    SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO profile_stories VALUES(?, ?, ?, ?, ?, ?)");
                    try {
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM profile_stories_albums_links WHERE dialog_id = " + j12 + " AND album_id = " + i17).stepThis().dispose();
                        sQLitePreparedStatement2 = sQLiteDatabase.executeFast("REPLACE INTO profile_stories_albums_links VALUES(?, ?, ?, ?)");
                        int i19 = 0;
                        while (i19 < arrayList5.size()) {
                            try {
                                TL_stories.StoryItem storyItem4 = ((zi) arrayList5.get(i19)).l;
                                if (storyItem4 != null) {
                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem4.getObjectSize());
                                    storyItem4.serializeToStream(nativeByteBuffer);
                                    executeFast.requery();
                                    executeFast.bindLong(i11, j12);
                                    executeFast.bindInteger(2, storyItem4.id);
                                    executeFast.bindByteBuffer(3, nativeByteBuffer);
                                    executeFast.bindInteger(4, i18);
                                    executeFast.bindInteger(5, r6Var2.m.contains(Integer.valueOf(storyItem4.id)) ? 1 : 0);
                                    executeFast.bindInteger(6, arrayList6.indexOf(Integer.valueOf(storyItem4.id)) + 1);
                                    executeFast.step();
                                    nativeByteBuffer.reuse();
                                    sQLitePreparedStatement2.requery();
                                    sQLitePreparedStatement2.bindLong(i11, j12);
                                    sQLitePreparedStatement2.bindInteger(2, i17);
                                    sQLitePreparedStatement2.bindInteger(3, storyItem4.id);
                                    sQLitePreparedStatement2.bindInteger(4, i19);
                                    sQLitePreparedStatement2.step();
                                }
                                i19++;
                                i11 = 1;
                            } catch (Throwable th7) {
                                th = th7;
                                sQLitePreparedStatement = executeFast;
                                z10 = true;
                                try {
                                    qrVar.o(th, z10);
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                        break;
                                    }
                                } catch (Throwable th8) {
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    if (sQLitePreparedStatement2 != null) {
                                        sQLitePreparedStatement2.dispose();
                                    }
                                    throw th8;
                                }
                            }
                        }
                        if (executeFast != null) {
                            executeFast.dispose();
                            break;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        sQLitePreparedStatement = executeFast;
                        z10 = true;
                        sQLitePreparedStatement2 = null;
                        qrVar.o(th, z10);
                        if (sQLitePreparedStatement != null) {
                        }
                    }
                } catch (Throwable th10) {
                    th = th10;
                    z10 = true;
                    sQLitePreparedStatement = null;
                }
                break;
            case 16:
                gi.y5 y5Var = (gi.y5) this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.c;
                f7 f7Var2 = (f7) this.d;
                boolean[] zArr2 = (boolean[]) this.e;
                x9 x9Var = y5Var.H;
                Bitmap bitmap = y5Var.a;
                if (bitmap != null && !bitmap.isRecycled()) {
                    y5Var.a.recycle();
                }
                Bitmap bitmap2 = bitmapArr[0];
                y5Var.a = bitmap2;
                if (f7Var2 != null && !f7Var2.c && f7Var2.K && bitmap2 != null) {
                    f7Var2.k0 = bitmap2.getWidth();
                    f7Var2.l0 = y5Var.a.getHeight();
                    f7Var2.A();
                }
                if (zArr2[0] && f7Var2 != null && x9Var != null && y5Var.a != null) {
                    x9Var.e();
                    x9Var.f(f7Var2.b(0.2f, y5Var.a), false);
                    gi.v8 v8Var = y5Var.w;
                    if (v8Var != null) {
                        v8Var.run();
                    }
                }
                y5Var.r();
                y5Var.invalidate();
                return;
            case 17:
                a();
                return;
            case 18:
                gi.d dVar = (gi.d) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.d;
                ii.p1 p1Var = (ii.p1) this.e;
                dVar.setLoading(false);
                if (tLObject6 instanceof TLRPC.TL_boolTrue) {
                    t2Var.dismiss();
                    p1Var.a(Boolean.FALSE);
                    return;
                }
                return;
            case 19:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.b;
                org.telegram.ui.ActionBar.t2 t2Var2 = (org.telegram.ui.ActionBar.t2) this.c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                org.telegram.messenger.g0.g(connectedbotstarref.url);
                new fc(t2Var2.F, e6Var).I(R.raw.copy, bd.M0(2131754333, null), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131754334, ii.k.J0(connectedbotstarref.commission_permille), l10.p(user)))).j();
                return;
            case 20:
                ii.q3.A0((ii.q3) this.b, (Context) this.c, (TLRPC.User) this.d, (TL_payments.connectedBotStarRef) this.e);
                return;
            case 21:
                TLObject tLObject7 = (TLObject) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.e;
                if (!(tLObject7 instanceof TLRPC.TL_boolTrue)) {
                    if (zArr3[0]) {
                        return;
                    }
                    zArr3[0] = true;
                    pVar.a(Boolean.TRUE, "cancelled");
                    return;
                }
                userFull.bot_can_manage_emoji_status = true;
                if (zArr3[0]) {
                    return;
                }
                zArr3[0] = true;
                pVar.a(Boolean.TRUE, "allowed");
                return;
            case 22:
                lg.z zVar = (lg.z) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                Runnable runnable2 = (Runnable) this.e;
                ArrayList arrayList7 = zVar.b;
                if (tLObject8 instanceof TL_account.TL_businessChatLink) {
                    TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) tLObject8;
                    int indexOf = arrayList7.indexOf(tL_businessChatLink);
                    if (indexOf != -1) {
                        arrayList7.set(indexOf, tL_businessChatLink2);
                        hs.f(zVar.a).k(hs.J1, new Object[0]);
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        zVar.f();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                lg.u1 u1Var = (lg.u1) this.b;
                qr qrVar2 = (qr) this.c;
                lg.t1 t1Var = (lg.t1) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                ArrayList arrayList8 = new ArrayList();
                try {
                    try {
                        sQLiteCursor = qrVar2.b.queryFinalized("SELECT id FROM quick_replies_messages WHERE topic_id = ?", Integer.valueOf(t1Var.a));
                        while (sQLiteCursor.next()) {
                            arrayList8.add(Integer.valueOf(sQLiteCursor.intValue(0)));
                        }
                    } catch (Exception e14) {
                        a8.g(e14, true);
                        break;
                    }
                    sQLiteCursor.dispose();
                    org.telegram.messenger.g0.h3(new z3(u1Var, arrayList8, t1Var, tL_messages_sendQuickReplyMessages, 24));
                    return;
                } catch (Throwable th11) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th11;
                }
            case 24:
                lg.u1 u1Var2 = (lg.u1) this.b;
                ArrayList<Integer> arrayList9 = (ArrayList) this.c;
                lg.t1 t1Var2 = (lg.t1) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages2 = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                int i20 = u1Var2.a;
                if (arrayList9.isEmpty() || arrayList9.size() < t1Var2.a()) {
                    TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                    tL_messages_getQuickReplyMessages.shortcut_id = t1Var2.a;
                    ConnectionsManager.getInstance(i20).sendRequest(tL_messages_getQuickReplyMessages, new r6(u1Var2, arrayList9, tL_messages_sendQuickReplyMessages2, 12));
                    return;
                } else {
                    tL_messages_sendQuickReplyMessages2.id = arrayList9;
                    for (int i21 = 0; i21 < arrayList9.size(); i21++) {
                        tL_messages_sendQuickReplyMessages2.random_id.add(Long.valueOf(Utilities.b.nextLong()));
                    }
                    ConnectionsManager.getInstance(i20).sendRequest(tL_messages_sendQuickReplyMessages2, null);
                    return;
                }
            case 25:
                mi.p pVar2 = (mi.p) this.b;
                mi.a aVar2 = (mi.a) this.c;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.d;
                f60 f60Var = (f60) this.e;
                pVar2.r.Y4(aVar2, pageBlock);
                f60Var.u();
                return;
            case 26:
                ui.f fVar = (ui.f) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                o4.h hVar2 = (o4.h) this.d;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.e;
                synchronized (fVar.b) {
                    try {
                        if (atomicBoolean.get()) {
                            atomicBoolean2.set(true);
                        } else {
                            fVar.j(hVar2);
                        }
                    } finally {
                    }
                }
                return;
            case 27:
                b();
                return;
            case 28:
                c();
                return;
            default:
                o4.e0 e0Var = (o4.e0) this.b;
                l9.e0 e0Var2 = (l9.e0) this.c;
                g2.k kVar = (g2.k) this.d;
                l9.y yVar = (l9.y) this.e;
                if (e0Var.j()) {
                    e0Var2.m(null);
                    return;
                }
                try {
                    kVar.accept(yVar);
                    e0Var2.m(null);
                    return;
                } catch (Throwable th12) {
                    e0Var2.n(th12);
                    return;
                }
        }
    }
}
