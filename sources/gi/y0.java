package gi;

import android.graphics.PointF;
import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.a20;
import org.telegram.messenger.li;
import org.telegram.messenger.re;
import org.telegram.messenger.z10;
import org.telegram.messenger.ze;
import org.telegram.messenger.zi;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Components.ld0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y0 {
    public final long A;
    public final ArrayList B;
    public final List C;
    public final String D;
    public final ze E;
    public final int F;
    public boolean G;
    public int H;
    public long I;
    public long J;
    public long K;
    public long L;
    public final boolean M;
    public final TLRPC.TL_error N;
    public final String O;
    public final TLRPC.InputDocument P;
    public final String Q;
    public final String R;
    public final long S;
    public final long T;
    public final float U;
    public final float V;
    public final float W;
    public final String X;
    public final String Y;
    public final long Z;
    public long a;
    public final long a0;
    public final long b;
    public final float b0;
    public final String c;
    public final float c0;
    public final String d;
    public final float d0;
    public final boolean e;
    public final float e0;
    public final String f;
    public final TLRPC.InputPeer f0;
    public final boolean g;
    public final long g0;
    public final boolean h;
    public final String h0;
    public final long i;
    public final TLRPC.InputMedia i0;
    public final long j;
    public final t j0;
    public final int k;
    public final ArrayList k0;
    public final int l;
    public final int m;
    public final int n;
    public final re o;
    public final int p;
    public final int q;
    public final long r;
    public final float[] s;
    public final int t;
    public final int u;
    public final String v;
    public final ArrayList w;
    public final ArrayList x;
    public final String y;
    public final String z;

    public y0(f7 f7Var) {
        float[] fArr = new float[9];
        this.s = fArr;
        ArrayList arrayList = new ArrayList();
        this.x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.d0 = 1.0f;
        this.e0 = 1.0f;
        this.a = f7Var.b;
        this.b = f7Var.d;
        File file = f7Var.O0;
        this.c = file == null ? "" : file.toString();
        File file2 = f7Var.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.e = f7Var.K;
        File file3 = f7Var.L;
        this.f = file3 == null ? "" : file3.toString();
        this.g = f7Var.M;
        this.h = f7Var.Y;
        float f10 = f7Var.Z;
        long j10 = f7Var.h0;
        this.i = (long) (f10 * j10);
        this.j = (long) (f7Var.a0 * j10);
        this.k = f7Var.Q;
        this.l = f7Var.R;
        this.m = f7Var.k0;
        this.n = f7Var.l0;
        this.o = f7Var.m0;
        this.p = f7Var.i0;
        this.q = f7Var.j0;
        this.r = j10;
        f7Var.n0.getValues(fArr);
        this.t = f7Var.A0;
        this.u = f7Var.B0;
        CharSequence[] charSequenceArr = {f7Var.C0};
        this.w = f7Var.D0 ? li.b0(f7Var.a).W(charSequenceArr, true, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(f7Var.F0);
        File file4 = f7Var.P0;
        this.y = file4 == null ? "" : file4.toString();
        File file5 = f7Var.R0;
        this.z = file5 == null ? "" : file5.toString();
        this.A = f7Var.S0;
        this.B = f7Var.T0;
        this.C = f7Var.U0;
        File file6 = f7Var.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = f7Var.a1;
        this.F = f7Var.I0;
        this.M = f7Var.w;
        this.N = f7Var.x;
        this.O = f7Var.y;
        this.P = f7Var.z;
        this.Q = f7Var.A;
        this.R = f7Var.B;
        this.S = f7Var.C;
        this.T = f7Var.D;
        this.U = f7Var.E;
        this.V = f7Var.F;
        this.W = f7Var.G;
        File file7 = f7Var.o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = f7Var.p0;
        this.Z = f7Var.q0;
        this.a0 = f7Var.r0;
        this.b0 = f7Var.s0;
        this.c0 = f7Var.t0;
        this.d0 = f7Var.u0;
        this.e0 = f7Var.P;
        this.f0 = f7Var.v0;
        this.g0 = f7Var.J0;
        this.h0 = f7Var.K0;
        this.i0 = f7Var.L0;
        this.j0 = f7Var.S;
        this.k0 = a20.a(f7Var);
    }

    public final f7 a() {
        f7 f7Var = new f7();
        f7Var.b = this.a;
        f7Var.c = true;
        f7Var.d = this.b;
        String str = this.c;
        if (!TextUtils.isEmpty(str)) {
            f7Var.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            f7Var.N0 = new File(str2);
        }
        f7Var.K = this.e;
        String str3 = this.f;
        if (str3 != null) {
            f7Var.L = new File(str3);
        }
        f7Var.M = this.g;
        f7Var.Y = this.h;
        long j10 = this.r;
        f7Var.h0 = j10;
        if (j10 > 0) {
            f7Var.Z = this.i / j10;
            f7Var.a0 = this.j / j10;
        } else {
            f7Var.Z = 0.0f;
            f7Var.a0 = 1.0f;
        }
        f7Var.Q = this.k;
        f7Var.R = this.l;
        f7Var.k0 = this.m;
        f7Var.l0 = this.n;
        f7Var.m0 = this.o;
        f7Var.i0 = this.p;
        f7Var.j0 = this.q;
        f7Var.n0.setValues(this.s);
        f7Var.A0 = this.t;
        f7Var.B0 = this.u;
        ArrayList arrayList = null;
        String str4 = this.v;
        int i3 = 0;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (org.telegram.ui.ActionBar.k6.o2 == null) {
                org.telegram.ui.ActionBar.k6.Q();
            }
            CharSequence m10 = org.telegram.messenger.i6.m(spannableString, org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt(), true, null, 0);
            zi.b(m10, this.w, true, false, true, false, 0);
            f7Var.C0 = zi.C5(m10, this.w, org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt(), false);
        } else {
            f7Var.C0 = "";
        }
        ArrayList arrayList2 = f7Var.F0;
        arrayList2.clear();
        arrayList2.addAll(this.x);
        String str5 = this.y;
        if (str5 != null) {
            f7Var.P0 = new File(str5);
        }
        String str6 = this.z;
        if (str6 != null) {
            f7Var.R0 = new File(str6);
        }
        f7Var.S0 = this.A;
        f7Var.T0 = this.B;
        f7Var.U0 = this.C;
        String str7 = this.D;
        if (str7 != null) {
            f7Var.Z0 = new File(str7);
        }
        f7Var.a1 = this.E;
        f7Var.I0 = this.F;
        f7Var.g = this.G;
        f7Var.f = this.H;
        f7Var.e = this.I;
        f7Var.J = this.L;
        f7Var.I = this.K;
        f7Var.H = this.J;
        f7Var.w = this.M;
        f7Var.x = this.N;
        f7Var.y = this.O;
        f7Var.z = this.P;
        f7Var.A = this.Q;
        f7Var.B = this.R;
        f7Var.C = this.S;
        f7Var.D = this.T;
        f7Var.E = this.U;
        f7Var.F = this.V;
        f7Var.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            f7Var.o0 = new File(str8);
        }
        f7Var.p0 = this.Y;
        f7Var.q0 = this.Z;
        f7Var.r0 = this.a0;
        f7Var.s0 = this.b0;
        f7Var.t0 = this.c0;
        f7Var.u0 = this.d0;
        f7Var.P = this.e0;
        f7Var.v0 = this.f0;
        f7Var.J0 = this.g0;
        f7Var.K0 = this.h0;
        f7Var.L0 = this.i0;
        f7Var.S = this.j0;
        int i10 = a20.C;
        ArrayList arrayList3 = this.k0;
        if (arrayList3 != null) {
            arrayList = new ArrayList();
            int size = arrayList3.size();
            while (i3 < size) {
                Object obj = arrayList3.get(i3);
                i3++;
                a20 a20Var = (a20) obj;
                f7 f7Var2 = new f7();
                f7Var2.K = a20Var.b;
                f7Var2.Y = a20Var.c;
                f7Var2.L = new File(a20Var.d);
                f7Var2.P = a20Var.e;
                f7Var2.U = a20Var.i;
                f7Var2.X = a20Var.f;
                f7Var2.V = a20Var.j;
                f7Var2.W = a20Var.k;
                f7Var2.k0 = a20Var.l;
                f7Var2.l0 = a20Var.m;
                f7Var2.h0 = a20Var.o;
                arrayList.add(f7Var2);
            }
        }
        f7Var.T = arrayList;
        return f7Var;
    }

    public final void b(NativeByteBuffer nativeByteBuffer) {
        ArrayList arrayList;
        nativeByteBuffer.writeInt32(-1318387531);
        nativeByteBuffer.writeInt64(this.b);
        nativeByteBuffer.writeString(this.c);
        nativeByteBuffer.writeBool(this.e);
        nativeByteBuffer.writeString(this.f);
        nativeByteBuffer.writeBool(this.g);
        nativeByteBuffer.writeBool(this.h);
        nativeByteBuffer.writeInt64(this.i);
        nativeByteBuffer.writeInt64(this.j);
        nativeByteBuffer.writeInt32(this.k);
        nativeByteBuffer.writeInt32(this.l);
        nativeByteBuffer.writeInt32(this.m);
        nativeByteBuffer.writeInt32(this.n);
        nativeByteBuffer.writeInt32(this.p);
        nativeByteBuffer.writeInt32(this.q);
        nativeByteBuffer.writeInt64(this.r);
        int i3 = 0;
        int i10 = 0;
        while (true) {
            float[] fArr = this.s;
            if (i10 >= fArr.length) {
                break;
            }
            nativeByteBuffer.writeFloat(fArr[i10]);
            i10++;
        }
        nativeByteBuffer.writeInt32(this.t);
        nativeByteBuffer.writeInt32(this.u);
        nativeByteBuffer.writeString(this.v);
        nativeByteBuffer.writeInt32(Vector.constructor);
        ArrayList arrayList2 = this.w;
        nativeByteBuffer.writeInt32(arrayList2 == null ? 0 : arrayList2.size());
        if (arrayList2 != null) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                ((TLRPC.MessageEntity) arrayList2.get(i11)).serializeToStream(nativeByteBuffer);
            }
        }
        nativeByteBuffer.writeInt32(Vector.constructor);
        ArrayList arrayList3 = this.x;
        nativeByteBuffer.writeInt32(arrayList3 == null ? 0 : arrayList3.size());
        if (arrayList3 != null) {
            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                ((TLRPC.InputPrivacyRule) arrayList3.get(i12)).serializeToStream(nativeByteBuffer);
            }
        }
        nativeByteBuffer.writeBool(false);
        nativeByteBuffer.writeString(this.y);
        nativeByteBuffer.writeInt64(this.A);
        nativeByteBuffer.writeInt32(Vector.constructor);
        ArrayList arrayList4 = this.B;
        nativeByteBuffer.writeInt32(arrayList4 == null ? 0 : arrayList4.size());
        if (arrayList4 != null) {
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                ((z10) arrayList4.get(i13)).b(nativeByteBuffer, true);
            }
        }
        nativeByteBuffer.writeInt32(Vector.constructor);
        List list = this.C;
        nativeByteBuffer.writeInt32(list == null ? 0 : list.size());
        if (list != null) {
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((TLRPC.InputDocument) list.get(i14)).serializeToStream(nativeByteBuffer);
            }
        }
        String str = this.D;
        if (str == null) {
            str = "";
        }
        nativeByteBuffer.writeString(str);
        ze zeVar = this.E;
        if (zeVar == null) {
            nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
        } else {
            nativeByteBuffer.writeInt32(-1318387530);
            nativeByteBuffer.writeFloat(zeVar.a);
            nativeByteBuffer.writeFloat(zeVar.b);
            nativeByteBuffer.writeFloat(zeVar.c);
            nativeByteBuffer.writeFloat(zeVar.d);
            nativeByteBuffer.writeFloat(zeVar.e);
            nativeByteBuffer.writeFloat(zeVar.f);
            nativeByteBuffer.writeFloat(zeVar.g);
            nativeByteBuffer.writeInt32(zeVar.h);
            nativeByteBuffer.writeInt32(zeVar.i);
            nativeByteBuffer.writeFloat(zeVar.j);
            nativeByteBuffer.writeFloat(zeVar.k);
            nativeByteBuffer.writeFloat(zeVar.l);
            nativeByteBuffer.writeFloat(zeVar.m);
            nativeByteBuffer.writeInt32(zeVar.n);
            nativeByteBuffer.writeFloat(zeVar.o);
            g2.d dVar = zeVar.p;
            ((ld0) dVar.b).d(nativeByteBuffer);
            ((ld0) dVar.c).d(nativeByteBuffer);
            ((ld0) dVar.d).d(nativeByteBuffer);
            ((ld0) dVar.e).d(nativeByteBuffer);
            nativeByteBuffer.writeFloat(zeVar.q);
            if (zeVar.r == null) {
                nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
            } else {
                nativeByteBuffer.writeInt32(-559038737);
                nativeByteBuffer.writeFloat(zeVar.r.x);
                nativeByteBuffer.writeFloat(zeVar.r.y);
            }
            nativeByteBuffer.writeFloat(zeVar.s);
            nativeByteBuffer.writeFloat(zeVar.t);
        }
        nativeByteBuffer.writeInt32(this.F);
        nativeByteBuffer.writeInt32(Vector.constructor);
        nativeByteBuffer.writeInt32(0);
        nativeByteBuffer.writeBool(this.G);
        nativeByteBuffer.writeInt32(this.H);
        nativeByteBuffer.writeInt64(this.I);
        nativeByteBuffer.writeInt64(this.L);
        nativeByteBuffer.writeInt64(this.K);
        nativeByteBuffer.writeInt64(this.J);
        nativeByteBuffer.writeString(this.z);
        nativeByteBuffer.writeBool(this.M);
        TLRPC.TL_error tL_error = this.N;
        if (tL_error == null) {
            nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
        } else {
            tL_error.serializeToStream(nativeByteBuffer);
        }
        nativeByteBuffer.writeString(this.d);
        String str2 = this.O;
        if (str2 == null) {
            nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
        } else {
            nativeByteBuffer.writeInt32(TLRPC.TL_documentAttributeAudio.constructor);
            nativeByteBuffer.writeString(str2);
            String str3 = this.Q;
            if (str3 == null) {
                nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
            } else {
                nativeByteBuffer.writeInt32(TLRPC.TL_jsonString.constructor);
                nativeByteBuffer.writeString(str3);
            }
            String str4 = this.R;
            if (str4 == null) {
                nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
            } else {
                nativeByteBuffer.writeInt32(TLRPC.TL_jsonString.constructor);
                nativeByteBuffer.writeString(str4);
            }
            nativeByteBuffer.writeInt64(this.S);
            nativeByteBuffer.writeInt64(this.T);
            nativeByteBuffer.writeFloat(this.U);
            nativeByteBuffer.writeFloat(this.V);
            nativeByteBuffer.writeFloat(this.W);
        }
        TLRPC.InputPeer inputPeer = this.f0;
        if (inputPeer != null) {
            inputPeer.serializeToStream(nativeByteBuffer);
        } else {
            new TLRPC.TL_inputPeerSelf().serializeToStream(nativeByteBuffer);
        }
        String str5 = this.X;
        if (TextUtils.isEmpty(str5)) {
            nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
        } else {
            nativeByteBuffer.writeInt32(TLRPC.TL_documentAttributeVideo.constructor);
            nativeByteBuffer.writeString(str5);
            nativeByteBuffer.writeInt64(this.Z);
            nativeByteBuffer.writeInt64(this.a0);
            nativeByteBuffer.writeFloat(this.b0);
            nativeByteBuffer.writeFloat(this.c0);
            nativeByteBuffer.writeFloat(this.d0);
        }
        nativeByteBuffer.writeFloat(this.e0);
        nativeByteBuffer.writeInt64(this.g0);
        String str6 = this.h0;
        nativeByteBuffer.writeString(str6 != null ? str6 : "");
        TLRPC.InputMedia inputMedia = this.i0;
        if (inputMedia == null) {
            nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
        } else {
            inputMedia.serializeToStream(nativeByteBuffer);
        }
        t tVar = this.j0;
        if (tVar == null || tVar.e.size() <= 1 || (arrayList = this.k0) == null || arrayList.size() <= 1) {
            nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
        } else {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(tVar.a);
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((a20) obj).serializeToStream(nativeByteBuffer);
            }
        }
        re reVar = this.o;
        if (reVar == null) {
            nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
        } else {
            reVar.serializeToStream(nativeByteBuffer);
        }
        TLRPC.InputDocument inputDocument = this.P;
        if (inputDocument == null) {
            nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
        } else {
            inputDocument.serializeToStream(nativeByteBuffer);
        }
    }

    public y0(NativeByteBuffer nativeByteBuffer) {
        int readInt32;
        this.s = new float[9];
        this.x = new ArrayList();
        this.V = 1.0f;
        this.W = 1.0f;
        this.d0 = 1.0f;
        this.e0 = 1.0f;
        if (nativeByteBuffer.readInt32(true) == -1318387531) {
            this.b = nativeByteBuffer.readInt64(true);
            String readString = nativeByteBuffer.readString(true);
            this.c = readString;
            if (readString != null && readString.length() == 0) {
                this.c = null;
            }
            this.e = nativeByteBuffer.readBool(true);
            String readString2 = nativeByteBuffer.readString(true);
            this.f = readString2;
            if (readString2 != null && readString2.length() == 0) {
                this.f = null;
            }
            this.g = nativeByteBuffer.readBool(true);
            this.h = nativeByteBuffer.readBool(true);
            this.i = nativeByteBuffer.readInt64(true);
            this.j = nativeByteBuffer.readInt64(true);
            this.k = nativeByteBuffer.readInt32(true);
            this.l = nativeByteBuffer.readInt32(true);
            this.m = nativeByteBuffer.readInt32(true);
            this.n = nativeByteBuffer.readInt32(true);
            this.p = nativeByteBuffer.readInt32(true);
            this.q = nativeByteBuffer.readInt32(true);
            this.r = nativeByteBuffer.readInt64(true);
            int i3 = 0;
            while (true) {
                float[] fArr = this.s;
                if (i3 >= fArr.length) {
                    break;
                }
                fArr[i3] = nativeByteBuffer.readFloat(true);
                i3++;
            }
            this.t = nativeByteBuffer.readInt32(true);
            this.u = nativeByteBuffer.readInt32(true);
            String readString3 = nativeByteBuffer.readString(true);
            this.v = readString3;
            if (readString3 != null && readString3.length() == 0) {
                this.v = null;
            }
            if (nativeByteBuffer.readInt32(true) == 481674261) {
                int readInt322 = nativeByteBuffer.readInt32(true);
                for (int i10 = 0; i10 < readInt322; i10++) {
                    if (this.w == null) {
                        this.w = new ArrayList();
                    }
                    this.w.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int readInt323 = nativeByteBuffer.readInt32(true);
                    this.x.clear();
                    for (int i11 = 0; i11 < readInt323; i11++) {
                        this.x.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    nativeByteBuffer.readBool(true);
                    String readString4 = nativeByteBuffer.readString(true);
                    this.y = readString4;
                    if (readString4 != null && readString4.length() == 0) {
                        this.y = null;
                    }
                    this.A = nativeByteBuffer.readInt64(true);
                    if (nativeByteBuffer.readInt32(true) == 481674261) {
                        int readInt324 = nativeByteBuffer.readInt32(true);
                        for (int i12 = 0; i12 < readInt324; i12++) {
                            if (this.B == null) {
                                this.B = new ArrayList();
                            }
                            this.B.add(new z10(nativeByteBuffer, true, true));
                        }
                        if (nativeByteBuffer.readInt32(true) == 481674261) {
                            int readInt325 = nativeByteBuffer.readInt32(true);
                            for (int i13 = 0; i13 < readInt325; i13++) {
                                if (this.C == null) {
                                    this.C = new ArrayList();
                                }
                                this.C.add(TLRPC.InputDocument.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                            }
                            String readString5 = nativeByteBuffer.readString(true);
                            this.D = readString5;
                            if (readString5 != null && readString5.length() == 0) {
                                this.D = null;
                            }
                            int readInt326 = nativeByteBuffer.readInt32(true);
                            if (readInt326 == 1450380236) {
                                this.E = null;
                            } else if (readInt326 == -1318387530) {
                                ze zeVar = new ze();
                                this.E = zeVar;
                                zeVar.a = nativeByteBuffer.readFloat(true);
                                zeVar.b = nativeByteBuffer.readFloat(true);
                                zeVar.c = nativeByteBuffer.readFloat(true);
                                zeVar.d = nativeByteBuffer.readFloat(true);
                                zeVar.e = nativeByteBuffer.readFloat(true);
                                zeVar.f = nativeByteBuffer.readFloat(true);
                                zeVar.g = nativeByteBuffer.readFloat(true);
                                zeVar.h = nativeByteBuffer.readInt32(true);
                                zeVar.i = nativeByteBuffer.readInt32(true);
                                zeVar.j = nativeByteBuffer.readFloat(true);
                                zeVar.k = nativeByteBuffer.readFloat(true);
                                zeVar.l = nativeByteBuffer.readFloat(true);
                                zeVar.m = nativeByteBuffer.readFloat(true);
                                zeVar.n = nativeByteBuffer.readInt32(true);
                                zeVar.o = nativeByteBuffer.readFloat(true);
                                g2.d dVar = zeVar.p;
                                ((ld0) dVar.b).c(nativeByteBuffer);
                                ((ld0) dVar.c).c(nativeByteBuffer);
                                ((ld0) dVar.d).c(nativeByteBuffer);
                                ((ld0) dVar.e).c(nativeByteBuffer);
                                zeVar.q = nativeByteBuffer.readFloat(true);
                                if (nativeByteBuffer.readInt32(true) == 1450380236) {
                                    zeVar.r = null;
                                } else {
                                    if (zeVar.r == null) {
                                        zeVar.r = new PointF();
                                    }
                                    zeVar.r.x = nativeByteBuffer.readFloat(true);
                                    zeVar.r.y = nativeByteBuffer.readFloat(true);
                                }
                                zeVar.s = nativeByteBuffer.readFloat(true);
                                zeVar.t = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() >= 4) {
                                this.F = nativeByteBuffer.readInt32(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                if (nativeByteBuffer.readInt32(true) == 481674261) {
                                    nativeByteBuffer.readInt32(true);
                                } else {
                                    throw new RuntimeException("Vector magic in StoryDraft parse error (5)");
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.G = nativeByteBuffer.readBool(true);
                                this.H = nativeByteBuffer.readInt32(true);
                                this.I = nativeByteBuffer.readInt64(true);
                                this.L = nativeByteBuffer.readInt64(true);
                                this.K = nativeByteBuffer.readInt64(true);
                                this.J = nativeByteBuffer.readInt64(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                String readString6 = nativeByteBuffer.readString(true);
                                this.z = readString6;
                                if (readString6 != null && readString6.length() == 0) {
                                    this.z = null;
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.M = nativeByteBuffer.readBool(true);
                                int readInt327 = nativeByteBuffer.readInt32(true);
                                if (readInt327 == 1450380236) {
                                    this.N = null;
                                } else {
                                    this.N = TLRPC.TL_error.TLdeserialize(nativeByteBuffer, readInt327, true);
                                }
                                this.d = nativeByteBuffer.readString(true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -1739392570) {
                                this.O = nativeByteBuffer.readString(true);
                                if (nativeByteBuffer.readInt32(true) == -1222740358) {
                                    this.Q = nativeByteBuffer.readString(true);
                                }
                                if (nativeByteBuffer.readInt32(true) == -1222740358) {
                                    this.R = nativeByteBuffer.readString(true);
                                }
                                this.S = nativeByteBuffer.readInt64(true);
                                this.T = nativeByteBuffer.readInt64(true);
                                this.U = nativeByteBuffer.readFloat(true);
                                this.V = nativeByteBuffer.readFloat(true);
                                this.W = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f0 = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                this.X = nativeByteBuffer.readString(true);
                                this.Z = nativeByteBuffer.readInt64(true);
                                this.a0 = nativeByteBuffer.readInt64(true);
                                this.b0 = nativeByteBuffer.readFloat(true);
                                this.c0 = nativeByteBuffer.readFloat(true);
                                this.d0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.e0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.g0 = nativeByteBuffer.readInt64(true);
                                this.h0 = nativeByteBuffer.readString(true);
                                int readInt328 = nativeByteBuffer.readInt32(true);
                                if (readInt328 != 1450380236) {
                                    this.i0 = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, readInt328, true);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                this.j0 = new t(nativeByteBuffer.readString(true));
                                this.k0 = new ArrayList();
                                for (int i14 = 0; i14 < this.j0.e.size(); i14++) {
                                    a20 a20Var = new a20();
                                    a20Var.readParams(nativeByteBuffer, true);
                                    a20Var.r = (s) this.j0.e.get(i14);
                                    this.k0.add(a20Var);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                re reVar = new re();
                                this.o = reVar;
                                reVar.readParams(nativeByteBuffer, true);
                            }
                            if (nativeByteBuffer.remaining() <= 0 || (readInt32 = nativeByteBuffer.readInt32(true)) != 448771445) {
                                return;
                            }
                            this.P = TLRPC.InputDocument.TLdeserialize(nativeByteBuffer, readInt32, true);
                            return;
                        }
                        throw new RuntimeException("Vector magic in StoryDraft parse error (4)");
                    }
                    throw new RuntimeException("Vector magic in StoryDraft parse error (3)");
                }
                throw new RuntimeException("Vector magic in StoryDraft parse error (2)");
            }
            throw new RuntimeException("Vector magic in StoryDraft parse error (1)");
        }
        throw new RuntimeException("StoryDraft parse error");
    }
}
