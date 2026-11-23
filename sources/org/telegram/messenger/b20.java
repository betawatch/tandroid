package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.RLottieNative;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class b20 {
    public boolean A;
    public TLRPC.Document B;
    public Object C;
    public RLottieNative D;
    public float E;
    public float F;
    public Bitmap G;
    public Matrix H;
    public View I;
    public Canvas J;
    public org.telegram.ui.Components.b6 K;
    public boolean L;
    public Canvas M;
    public TL_stories.MediaArea N;
    public TLRPC.MessageMedia O;
    public hi.kc P;
    public float Q;
    public long R;
    public long S;
    public long T;
    public long U;
    public long V;
    public long W;
    public int[] X;
    public int Y;
    public int Z;
    public byte a;
    public tg.m0 a0;
    public byte b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public String j;
    public ArrayList k;
    public int l;
    public int m;
    public sg.a0 n;
    public String o;
    public int p;
    public int q;
    public int r;
    public float s;
    public String t;
    public we u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    public b20() {
        this.j = "";
        this.k = new ArrayList();
        this.t = "";
        this.v = 1.0f;
    }

    public final b20 a() {
        b20 b20Var = new b20();
        b20Var.a = this.a;
        b20Var.b = this.b;
        b20Var.c = this.c;
        b20Var.d = this.d;
        b20Var.e = this.e;
        b20Var.f = this.f;
        b20Var.g = this.g;
        b20Var.i = this.i;
        b20Var.j = this.j;
        if (this.k != null) {
            ArrayList arrayList = new ArrayList();
            b20Var.k = arrayList;
            arrayList.addAll(this.k);
        }
        b20Var.l = this.l;
        b20Var.m = this.m;
        b20Var.n = this.n;
        b20Var.o = this.o;
        b20Var.p = this.p;
        b20Var.q = this.q;
        b20Var.r = this.r;
        b20Var.s = this.s;
        b20Var.v = this.v;
        b20Var.w = this.w;
        b20Var.x = this.x;
        b20Var.y = this.y;
        b20Var.z = this.z;
        b20Var.B = this.B;
        b20Var.C = this.C;
        b20Var.D = this.D;
        b20Var.E = this.E;
        b20Var.F = this.F;
        b20Var.G = this.G;
        b20Var.I = this.I;
        b20Var.J = this.J;
        b20Var.K = this.K;
        b20Var.M = this.M;
        b20Var.N = this.N;
        b20Var.O = this.O;
        b20Var.Q = this.Q;
        b20Var.Y = this.Y;
        b20Var.Z = this.Z;
        b20Var.R = this.R;
        b20Var.U = this.U;
        b20Var.S = this.S;
        b20Var.T = this.T;
        b20Var.V = this.V;
        b20Var.W = this.W;
        b20Var.X = this.X;
        b20Var.a0 = this.a0;
        b20Var.P = this.P;
        return b20Var;
    }

    public final void b(AbstractSerializedData abstractSerializedData, boolean z10) {
        String str;
        abstractSerializedData.writeByte(this.a);
        abstractSerializedData.writeByte(this.b);
        abstractSerializedData.writeFloat(this.c);
        abstractSerializedData.writeFloat(this.d);
        abstractSerializedData.writeFloat(this.e);
        abstractSerializedData.writeFloat(this.f);
        abstractSerializedData.writeFloat(this.g);
        abstractSerializedData.writeString(this.j);
        abstractSerializedData.writeInt32(this.k.size());
        for (int i7 = 0; i7 < this.k.size(); i7++) {
            ((a20) this.k.get(i7)).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.l);
        abstractSerializedData.writeInt32(this.m);
        abstractSerializedData.writeInt32(this.q);
        abstractSerializedData.writeInt32(this.r);
        abstractSerializedData.writeInt32(this.p);
        sg.a0 a0Var = this.n;
        if (a0Var == null) {
            str = this.o;
            if (str == null) {
                str = "";
            }
        } else {
            str = a0Var.a;
        }
        abstractSerializedData.writeString(str);
        abstractSerializedData.writeFloat(this.v);
        abstractSerializedData.writeFloat(this.w);
        abstractSerializedData.writeFloat(this.x);
        abstractSerializedData.writeFloat(this.y);
        abstractSerializedData.writeFloat(this.z);
        if (z10) {
            TLRPC.Document document = this.B;
            if (document == null) {
                abstractSerializedData.writeInt32(TLRPC.TL_null.constructor);
            } else {
                document.serializeToStream(abstractSerializedData);
            }
        }
        byte b10 = this.a;
        if (b10 == 3) {
            abstractSerializedData.writeFloat(this.Q);
            this.N.serializeToStream(abstractSerializedData);
            TLRPC.MessageMedia messageMedia = this.O;
            if (messageMedia.provider == null) {
                messageMedia.provider = "";
            }
            if (messageMedia.venue_id == null) {
                messageMedia.venue_id = "";
            }
            if (messageMedia.venue_type == null) {
                messageMedia.venue_type = "";
            }
            messageMedia.serializeToStream(abstractSerializedData);
            TLRPC.MessageMedia messageMedia2 = this.O;
            if (!(messageMedia2 instanceof TLRPC.TL_messageMediaVenue) || ((TLRPC.TL_messageMediaVenue) messageMedia2).emoji == null) {
                abstractSerializedData.writeInt32(TLRPC.TL_null.constructor);
                return;
            } else {
                abstractSerializedData.writeInt32(-559038737);
                abstractSerializedData.writeString(((TLRPC.TL_messageMediaVenue) this.O).emoji);
                return;
            }
        }
        if (b10 == 7) {
            abstractSerializedData.writeFloat(this.Q);
            this.N.serializeToStream(abstractSerializedData);
            this.a0.serializeToStream(abstractSerializedData);
            return;
        }
        if (b10 == 4) {
            this.N.serializeToStream(abstractSerializedData);
            return;
        }
        if (b10 == 5) {
            abstractSerializedData.writeInt64(this.R);
            abstractSerializedData.writeInt64(this.S);
            abstractSerializedData.writeInt64(this.T);
            abstractSerializedData.writeInt64(this.U);
            return;
        }
        if (b10 == 11) {
            abstractSerializedData.writeInt64(this.V);
            abstractSerializedData.writeInt64(this.W);
            int[] iArr = this.X;
            int length = (iArr == null || iArr.length > 4096) ? 0 : iArr.length;
            abstractSerializedData.writeInt32(length);
            for (int i10 = 0; i10 < length; i10++) {
                abstractSerializedData.writeInt32(this.X[i10]);
            }
            return;
        }
        if (b10 == 2) {
            abstractSerializedData.writeString(this.t);
            we weVar = this.u;
            if (weVar != null) {
                weVar.serializeToStream(abstractSerializedData);
                return;
            } else {
                abstractSerializedData.writeInt32(TLRPC.TL_null.constructor);
                return;
            }
        }
        if (b10 == 8) {
            if (this.P == null) {
                abstractSerializedData.writeInt32(-559038737);
            } else {
                abstractSerializedData.writeInt32(132805945);
                this.P.serializeToStream(abstractSerializedData);
            }
        }
    }

    public b20(AbstractSerializedData abstractSerializedData, boolean z10, boolean z11) {
        sg.a0 a0Var;
        int readInt32;
        this.j = "";
        this.k = new ArrayList();
        this.t = "";
        this.v = 1.0f;
        this.a = abstractSerializedData.readByte(z11);
        this.b = abstractSerializedData.readByte(z11);
        this.c = abstractSerializedData.readFloat(z11);
        this.d = abstractSerializedData.readFloat(z11);
        this.e = abstractSerializedData.readFloat(z11);
        this.f = abstractSerializedData.readFloat(z11);
        this.g = abstractSerializedData.readFloat(z11);
        this.j = abstractSerializedData.readString(z11);
        int readInt322 = abstractSerializedData.readInt32(z11);
        for (int i7 = 0; i7 < readInt322; i7++) {
            a20 a20Var = new a20();
            abstractSerializedData.readInt32(z11);
            a20Var.readParams(abstractSerializedData, z11);
            this.k.add(a20Var);
        }
        this.l = abstractSerializedData.readInt32(z11);
        this.m = abstractSerializedData.readInt32(z11);
        this.q = abstractSerializedData.readInt32(z11);
        this.r = abstractSerializedData.readInt32(z11);
        this.p = abstractSerializedData.readInt32(z11);
        String readString = abstractSerializedData.readString(z11);
        this.o = readString;
        sg.a0 a0Var2 = sg.a0.e;
        tg.m0 m0Var = null;
        if (readString != null && !TextUtils.isEmpty(readString)) {
            List c10 = sg.a0.c();
            for (int i10 = 0; i10 < c10.size(); i10++) {
                a0Var = (sg.a0) c10.get(i10);
                if (a0Var != null && TextUtils.equals(readString, a0Var.a)) {
                    break;
                }
            }
        }
        a0Var = null;
        this.n = a0Var;
        this.v = abstractSerializedData.readFloat(z11);
        this.w = abstractSerializedData.readFloat(z11);
        this.x = abstractSerializedData.readFloat(z11);
        this.y = abstractSerializedData.readFloat(z11);
        this.z = abstractSerializedData.readFloat(z11);
        if (z10) {
            int readInt323 = abstractSerializedData.readInt32(z11);
            if (readInt323 == 1450380236) {
                this.B = null;
            } else {
                this.B = TLRPC.Document.TLdeserialize(abstractSerializedData, readInt323, z11);
            }
        }
        byte b10 = this.a;
        if (b10 == 3) {
            this.Q = abstractSerializedData.readFloat(z11);
            this.N = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
            this.O = TLRPC.MessageMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
            if (abstractSerializedData.remaining() <= 0 || abstractSerializedData.readInt32(z11) != -559038737) {
                return;
            }
            String readString2 = abstractSerializedData.readString(z11);
            TLRPC.MessageMedia messageMedia = this.O;
            if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
                ((TLRPC.TL_messageMediaVenue) messageMedia).emoji = readString2;
                return;
            }
            return;
        }
        if (b10 == 7) {
            this.Q = abstractSerializedData.readFloat(z11);
            this.N = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
            int readInt324 = abstractSerializedData.readInt32(z11);
            if (-625858389 != readInt324) {
                int i11 = tg.m0.j;
            } else {
                m0Var = new tg.m0();
            }
            this.a0 = (tg.m0) TLObject.TLdeserialize(tg.m0.class, m0Var, abstractSerializedData, readInt324, z11);
            return;
        }
        if (b10 == 4) {
            this.N = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
            return;
        }
        if (b10 == 5) {
            this.R = abstractSerializedData.readInt64(z11);
            this.S = abstractSerializedData.readInt64(z11);
            this.T = abstractSerializedData.readInt64(z11);
            this.U = abstractSerializedData.readInt64(z11);
            return;
        }
        if (b10 == 11 || b10 == 10) {
            this.V = abstractSerializedData.readInt64(z11);
            this.W = abstractSerializedData.readInt64(z11);
            if (this.a == 11 && (readInt32 = abstractSerializedData.readInt32(z11)) > 0 && readInt32 <= 4096) {
                this.X = new int[readInt32];
                for (int i12 = 0; i12 < readInt32; i12++) {
                    this.X[i12] = abstractSerializedData.readInt32(z11);
                }
            }
            this.a = (byte) 11;
            return;
        }
        if (b10 == 2) {
            this.t = abstractSerializedData.readString(z11);
            if (abstractSerializedData.readInt32(z11) == 1151577037) {
                we weVar = new we();
                this.u = weVar;
                weVar.readParams(abstractSerializedData, z11);
                return;
            }
            return;
        }
        if (b10 == 8 && abstractSerializedData.readInt32(z11) == 132805945) {
            hi.kc kcVar = new hi.kc();
            kcVar.a = abstractSerializedData.readDouble(false);
            kcVar.b = abstractSerializedData.readDouble(false);
            kcVar.c = abstractSerializedData.readString(false);
            kcVar.d = abstractSerializedData.readFloat(false);
            this.P = kcVar;
        }
    }
}
