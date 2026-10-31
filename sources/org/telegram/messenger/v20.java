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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class v20 {
    public boolean A;
    public TLRPC.Document B;
    public Object C;
    public RLottieNative D;
    public float E;
    public float F;
    public Bitmap G;
    public Matrix H;
    public View I;
    public org.telegram.ui.Components.s5 J;
    public boolean K;
    public Canvas L;
    public TL_stories.MediaArea M;
    public TLRPC.MessageMedia N;
    public vh.k9 O;
    public float P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public int U;
    public int V;
    public jg.s0 W;
    public byte a;
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
    public ig.h0 n;
    public String o;
    public int p;
    public int q;
    public int r;
    public float s;
    public String t;
    public ye u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    public v20() {
        this.j = "";
        this.k = new ArrayList();
        this.t = "";
        this.v = 1.0f;
    }

    public final v20 a() {
        v20 v20Var = new v20();
        v20Var.a = this.a;
        v20Var.b = this.b;
        v20Var.c = this.c;
        v20Var.d = this.d;
        v20Var.e = this.e;
        v20Var.f = this.f;
        v20Var.g = this.g;
        v20Var.i = this.i;
        v20Var.j = this.j;
        if (this.k != null) {
            ArrayList arrayList = new ArrayList();
            v20Var.k = arrayList;
            arrayList.addAll(this.k);
        }
        v20Var.l = this.l;
        v20Var.m = this.m;
        v20Var.n = this.n;
        v20Var.o = this.o;
        v20Var.p = this.p;
        v20Var.q = this.q;
        v20Var.r = this.r;
        v20Var.s = this.s;
        v20Var.v = this.v;
        v20Var.w = this.w;
        v20Var.x = this.x;
        v20Var.y = this.y;
        v20Var.z = this.z;
        v20Var.B = this.B;
        v20Var.C = this.C;
        v20Var.D = this.D;
        v20Var.E = this.E;
        v20Var.F = this.F;
        v20Var.G = this.G;
        v20Var.I = this.I;
        v20Var.J = this.J;
        v20Var.L = this.L;
        v20Var.M = this.M;
        v20Var.N = this.N;
        v20Var.P = this.P;
        v20Var.U = this.U;
        v20Var.V = this.V;
        v20Var.Q = this.Q;
        v20Var.T = this.T;
        v20Var.R = this.R;
        v20Var.S = this.S;
        v20Var.W = this.W;
        v20Var.O = this.O;
        return v20Var;
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
        for (int i10 = 0; i10 < this.k.size(); i10++) {
            ((u20) this.k.get(i10)).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.l);
        abstractSerializedData.writeInt32(this.m);
        abstractSerializedData.writeInt32(this.q);
        abstractSerializedData.writeInt32(this.r);
        abstractSerializedData.writeInt32(this.p);
        ig.h0 h0Var = this.n;
        if (h0Var == null) {
            str = this.o;
            if (str == null) {
                str = "";
            }
        } else {
            str = h0Var.a;
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
            abstractSerializedData.writeFloat(this.P);
            this.M.serializeToStream(abstractSerializedData);
            TLRPC.MessageMedia messageMedia = this.N;
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
            TLRPC.MessageMedia messageMedia2 = this.N;
            if (!(messageMedia2 instanceof TLRPC.TL_messageMediaVenue) || ((TLRPC.TL_messageMediaVenue) messageMedia2).emoji == null) {
                abstractSerializedData.writeInt32(TLRPC.TL_null.constructor);
                return;
            } else {
                abstractSerializedData.writeInt32(-559038737);
                abstractSerializedData.writeString(((TLRPC.TL_messageMediaVenue) this.N).emoji);
                return;
            }
        }
        if (b10 == 7) {
            abstractSerializedData.writeFloat(this.P);
            this.M.serializeToStream(abstractSerializedData);
            this.W.serializeToStream(abstractSerializedData);
            return;
        }
        if (b10 == 4) {
            this.M.serializeToStream(abstractSerializedData);
            return;
        }
        if (b10 == 5) {
            abstractSerializedData.writeInt64(this.Q);
            abstractSerializedData.writeInt64(this.R);
            abstractSerializedData.writeInt64(this.S);
            abstractSerializedData.writeInt64(this.T);
            return;
        }
        if (b10 == 2) {
            abstractSerializedData.writeString(this.t);
            ye yeVar = this.u;
            if (yeVar != null) {
                yeVar.serializeToStream(abstractSerializedData);
                return;
            } else {
                abstractSerializedData.writeInt32(TLRPC.TL_null.constructor);
                return;
            }
        }
        if (b10 == 8) {
            if (this.O == null) {
                abstractSerializedData.writeInt32(-559038737);
            } else {
                abstractSerializedData.writeInt32(132805945);
                this.O.serializeToStream(abstractSerializedData);
            }
        }
    }

    public v20(AbstractSerializedData abstractSerializedData, boolean z10, boolean z11) {
        ig.h0 h0Var;
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
        int readInt32 = abstractSerializedData.readInt32(z11);
        for (int i10 = 0; i10 < readInt32; i10++) {
            u20 u20Var = new u20();
            abstractSerializedData.readInt32(z11);
            u20Var.readParams(abstractSerializedData, z11);
            this.k.add(u20Var);
        }
        this.l = abstractSerializedData.readInt32(z11);
        this.m = abstractSerializedData.readInt32(z11);
        this.q = abstractSerializedData.readInt32(z11);
        this.r = abstractSerializedData.readInt32(z11);
        this.p = abstractSerializedData.readInt32(z11);
        String readString = abstractSerializedData.readString(z11);
        this.o = readString;
        ig.h0 h0Var2 = ig.h0.e;
        jg.s0 s0Var = null;
        if (readString != null && !TextUtils.isEmpty(readString)) {
            List c10 = ig.h0.c();
            for (int i11 = 0; i11 < c10.size(); i11++) {
                h0Var = (ig.h0) c10.get(i11);
                if (h0Var != null && TextUtils.equals(readString, h0Var.a)) {
                    break;
                }
            }
        }
        h0Var = null;
        this.n = h0Var;
        this.v = abstractSerializedData.readFloat(z11);
        this.w = abstractSerializedData.readFloat(z11);
        this.x = abstractSerializedData.readFloat(z11);
        this.y = abstractSerializedData.readFloat(z11);
        this.z = abstractSerializedData.readFloat(z11);
        if (z10) {
            int readInt322 = abstractSerializedData.readInt32(z11);
            if (readInt322 == 1450380236) {
                this.B = null;
            } else {
                this.B = TLRPC.Document.TLdeserialize(abstractSerializedData, readInt322, z11);
            }
        }
        byte b10 = this.a;
        if (b10 == 3) {
            this.P = abstractSerializedData.readFloat(z11);
            this.M = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
            this.N = TLRPC.MessageMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
            if (abstractSerializedData.remaining() <= 0 || abstractSerializedData.readInt32(z11) != -559038737) {
                return;
            }
            String readString2 = abstractSerializedData.readString(z11);
            TLRPC.MessageMedia messageMedia = this.N;
            if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
                ((TLRPC.TL_messageMediaVenue) messageMedia).emoji = readString2;
                return;
            }
            return;
        }
        if (b10 == 7) {
            this.P = abstractSerializedData.readFloat(z11);
            this.M = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
            int readInt323 = abstractSerializedData.readInt32(z11);
            if (-625858389 != readInt323) {
                int i12 = jg.s0.j;
            } else {
                s0Var = new jg.s0();
            }
            this.W = (jg.s0) TLObject.TLdeserialize(jg.s0.class, s0Var, abstractSerializedData, readInt323, z11);
            return;
        }
        if (b10 == 4) {
            this.M = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
            return;
        }
        if (b10 == 5) {
            this.Q = abstractSerializedData.readInt64(z11);
            this.R = abstractSerializedData.readInt64(z11);
            this.S = abstractSerializedData.readInt64(z11);
            this.T = abstractSerializedData.readInt64(z11);
            return;
        }
        if (b10 == 2) {
            this.t = abstractSerializedData.readString(z11);
            if (abstractSerializedData.readInt32(z11) == 1151577037) {
                ye yeVar = new ye();
                this.u = yeVar;
                yeVar.readParams(abstractSerializedData, z11);
                return;
            }
            return;
        }
        if (b10 == 8 && abstractSerializedData.readInt32(z11) == 132805945) {
            vh.k9 k9Var = new vh.k9();
            k9Var.a = abstractSerializedData.readDouble(false);
            k9Var.b = abstractSerializedData.readDouble(false);
            k9Var.c = abstractSerializedData.readString(false);
            k9Var.d = abstractSerializedData.readFloat(false);
            this.O = k9Var;
        }
    }
}
