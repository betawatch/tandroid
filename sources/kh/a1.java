package kh;

import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class a1 {
    public final long A;
    public final ArrayList B;
    public final List C;
    public final String D;
    public final MediaController.SavedFilterState E;
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
    public final u j0;
    public final int k;
    public final ArrayList k0;
    public final int l;
    public final int m;
    public final int n;
    public final MediaController.CropState o;
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

    public a1(a8 a8Var) {
        float[] fArr = new float[9];
        this.s = fArr;
        ArrayList arrayList = new ArrayList();
        this.x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.d0 = 1.0f;
        this.e0 = 1.0f;
        this.a = a8Var.b;
        this.b = a8Var.d;
        File file = a8Var.O0;
        this.c = file == null ? "" : file.toString();
        File file2 = a8Var.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.e = a8Var.K;
        File file3 = a8Var.L;
        this.f = file3 == null ? "" : file3.toString();
        this.g = a8Var.M;
        this.h = a8Var.Y;
        float f10 = a8Var.Z;
        long j10 = a8Var.h0;
        this.i = (long) (f10 * j10);
        this.j = (long) (a8Var.a0 * j10);
        this.k = a8Var.Q;
        this.l = a8Var.R;
        this.m = a8Var.k0;
        this.n = a8Var.l0;
        this.o = a8Var.m0;
        this.p = a8Var.i0;
        this.q = a8Var.j0;
        this.r = j10;
        a8Var.n0.getValues(fArr);
        this.t = a8Var.A0;
        this.u = a8Var.B0;
        CharSequence[] charSequenceArr = {a8Var.C0};
        this.w = a8Var.D0 ? MediaDataController.getInstance(a8Var.a).getEntities(charSequenceArr, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(a8Var.F0);
        File file4 = a8Var.P0;
        this.y = file4 == null ? "" : file4.toString();
        File file5 = a8Var.R0;
        this.z = file5 == null ? "" : file5.toString();
        this.A = a8Var.S0;
        this.B = a8Var.T0;
        this.C = a8Var.U0;
        File file6 = a8Var.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = a8Var.a1;
        this.F = a8Var.I0;
        this.M = a8Var.w;
        this.N = a8Var.x;
        this.O = a8Var.y;
        this.P = a8Var.z;
        this.Q = a8Var.A;
        this.R = a8Var.B;
        this.S = a8Var.C;
        this.T = a8Var.D;
        this.U = a8Var.E;
        this.V = a8Var.F;
        this.W = a8Var.G;
        File file7 = a8Var.o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = a8Var.p0;
        this.Z = a8Var.q0;
        this.a0 = a8Var.r0;
        this.b0 = a8Var.s0;
        this.c0 = a8Var.t0;
        this.d0 = a8Var.u0;
        this.e0 = a8Var.P;
        this.f0 = a8Var.v0;
        this.g0 = a8Var.J0;
        this.h0 = a8Var.K0;
        this.i0 = a8Var.L0;
        this.j0 = a8Var.S;
        this.k0 = VideoEditedInfo.Part.toParts(a8Var);
    }

    public final a8 a() {
        a8 a8Var = new a8();
        a8Var.b = this.a;
        a8Var.c = true;
        a8Var.d = this.b;
        String str = this.c;
        if (!TextUtils.isEmpty(str)) {
            a8Var.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            a8Var.N0 = new File(str2);
        }
        a8Var.K = this.e;
        String str3 = this.f;
        if (str3 != null) {
            a8Var.L = new File(str3);
        }
        a8Var.M = this.g;
        a8Var.Y = this.h;
        long j10 = this.r;
        a8Var.h0 = j10;
        if (j10 > 0) {
            a8Var.Z = this.i / j10;
            a8Var.a0 = this.j / j10;
        } else {
            a8Var.Z = 0.0f;
            a8Var.a0 = 1.0f;
        }
        a8Var.Q = this.k;
        a8Var.R = this.l;
        a8Var.k0 = this.m;
        a8Var.l0 = this.n;
        a8Var.m0 = this.o;
        a8Var.i0 = this.p;
        a8Var.j0 = this.q;
        a8Var.n0.setValues(this.s);
        a8Var.A0 = this.t;
        a8Var.B0 = this.u;
        String str4 = this.v;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (org.telegram.ui.ActionBar.f6.o2 == null) {
                org.telegram.ui.ActionBar.f6.O();
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, org.telegram.ui.ActionBar.f6.o2.getFontMetricsInt(), true);
            MessageObject.addEntitiesToText(replaceEmoji, this.w, true, false, true, false);
            a8Var.C0 = MessageObject.replaceAnimatedEmoji(replaceEmoji, this.w, org.telegram.ui.ActionBar.f6.o2.getFontMetricsInt());
        } else {
            a8Var.C0 = "";
        }
        ArrayList arrayList = a8Var.F0;
        arrayList.clear();
        arrayList.addAll(this.x);
        String str5 = this.y;
        if (str5 != null) {
            a8Var.P0 = new File(str5);
        }
        String str6 = this.z;
        if (str6 != null) {
            a8Var.R0 = new File(str6);
        }
        a8Var.S0 = this.A;
        a8Var.T0 = this.B;
        a8Var.U0 = this.C;
        String str7 = this.D;
        if (str7 != null) {
            a8Var.Z0 = new File(str7);
        }
        a8Var.a1 = this.E;
        a8Var.I0 = this.F;
        a8Var.g = this.G;
        a8Var.f = this.H;
        a8Var.e = this.I;
        a8Var.J = this.L;
        a8Var.I = this.K;
        a8Var.H = this.J;
        a8Var.w = this.M;
        a8Var.x = this.N;
        a8Var.y = this.O;
        a8Var.z = this.P;
        a8Var.A = this.Q;
        a8Var.B = this.R;
        a8Var.C = this.S;
        a8Var.D = this.T;
        a8Var.E = this.U;
        a8Var.F = this.V;
        a8Var.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            a8Var.o0 = new File(str8);
        }
        a8Var.p0 = this.Y;
        a8Var.q0 = this.Z;
        a8Var.r0 = this.a0;
        a8Var.s0 = this.b0;
        a8Var.t0 = this.c0;
        a8Var.u0 = this.d0;
        a8Var.P = this.e0;
        a8Var.v0 = this.f0;
        a8Var.J0 = this.g0;
        a8Var.K0 = this.h0;
        a8Var.L0 = this.i0;
        a8Var.S = this.j0;
        a8Var.T = VideoEditedInfo.Part.toStoryEntries(this.k0);
        return a8Var;
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
        int i9 = 0;
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
                ((VideoEditedInfo.MediaEntity) arrayList4.get(i13)).serializeTo(nativeByteBuffer, true);
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
        MediaController.SavedFilterState savedFilterState = this.E;
        if (savedFilterState == null) {
            nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
        } else {
            nativeByteBuffer.writeInt32(-1318387530);
            savedFilterState.serializeToStream(nativeByteBuffer);
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
        u uVar = this.j0;
        if (uVar == null || uVar.e.size() <= 1 || (arrayList = this.k0) == null || arrayList.size() <= 1) {
            nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
        } else {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(uVar.a);
            int size = arrayList.size();
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                ((VideoEditedInfo.Part) obj).serializeToStream(nativeByteBuffer);
            }
        }
        MediaController.CropState cropState = this.o;
        if (cropState == null) {
            nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
        } else {
            cropState.serializeToStream(nativeByteBuffer);
        }
        TLRPC.InputDocument inputDocument = this.P;
        if (inputDocument == null) {
            nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
        } else {
            inputDocument.serializeToStream(nativeByteBuffer);
        }
    }

    public a1(NativeByteBuffer nativeByteBuffer) {
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
            int i9 = 0;
            while (true) {
                float[] fArr = this.s;
                if (i9 >= fArr.length) {
                    break;
                }
                fArr[i9] = nativeByteBuffer.readFloat(true);
                i9++;
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
                            this.B.add(new VideoEditedInfo.MediaEntity(nativeByteBuffer, true, true));
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
                                MediaController.SavedFilterState savedFilterState = new MediaController.SavedFilterState();
                                this.E = savedFilterState;
                                savedFilterState.readParams(nativeByteBuffer, true);
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
                                this.j0 = new u(nativeByteBuffer.readString(true));
                                this.k0 = new ArrayList();
                                for (int i14 = 0; i14 < this.j0.e.size(); i14++) {
                                    VideoEditedInfo.Part part = new VideoEditedInfo.Part();
                                    part.readParams(nativeByteBuffer, true);
                                    part.part = (t) this.j0.e.get(i14);
                                    this.k0.add(part);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                MediaController.CropState cropState = new MediaController.CropState();
                                this.o = cropState;
                                cropState.readParams(nativeByteBuffer, true);
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
