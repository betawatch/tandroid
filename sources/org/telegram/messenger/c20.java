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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class c20 {
    public boolean A;
    public TLRPC.Document B;
    public Object C;
    public RLottieNative D;
    public float E;
    public float F;
    public Bitmap G;
    public Matrix H;
    public View I;
    public org.telegram.ui.Components.b6 J;
    public boolean K;
    public Canvas L;
    public TL_stories.MediaArea M;
    public TLRPC.MessageMedia N;
    public hi.qb O;
    public float P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public int U;
    public int V;
    public tg.h0 W;
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

    public c20() {
        this.j = "";
        this.k = new ArrayList();
        this.t = "";
        this.v = 1.0f;
    }

    public final c20 a() {
        c20 c20Var = new c20();
        c20Var.a = this.a;
        c20Var.b = this.b;
        c20Var.c = this.c;
        c20Var.d = this.d;
        c20Var.e = this.e;
        c20Var.f = this.f;
        c20Var.g = this.g;
        c20Var.i = this.i;
        c20Var.j = this.j;
        if (this.k != null) {
            ArrayList arrayList = new ArrayList();
            c20Var.k = arrayList;
            arrayList.addAll(this.k);
        }
        c20Var.l = this.l;
        c20Var.m = this.m;
        c20Var.n = this.n;
        c20Var.o = this.o;
        c20Var.p = this.p;
        c20Var.q = this.q;
        c20Var.r = this.r;
        c20Var.s = this.s;
        c20Var.v = this.v;
        c20Var.w = this.w;
        c20Var.x = this.x;
        c20Var.y = this.y;
        c20Var.z = this.z;
        c20Var.B = this.B;
        c20Var.C = this.C;
        c20Var.D = this.D;
        c20Var.E = this.E;
        c20Var.F = this.F;
        c20Var.G = this.G;
        c20Var.I = this.I;
        c20Var.J = this.J;
        c20Var.L = this.L;
        c20Var.M = this.M;
        c20Var.N = this.N;
        c20Var.P = this.P;
        c20Var.U = this.U;
        c20Var.V = this.V;
        c20Var.Q = this.Q;
        c20Var.T = this.T;
        c20Var.R = this.R;
        c20Var.S = this.S;
        c20Var.W = this.W;
        c20Var.O = this.O;
        return c20Var;
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
            ((b20) this.k.get(i7)).serializeToStream(abstractSerializedData);
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
            if (this.O == null) {
                abstractSerializedData.writeInt32(-559038737);
            } else {
                abstractSerializedData.writeInt32(132805945);
                this.O.serializeToStream(abstractSerializedData);
            }
        }
    }

    public c20(AbstractSerializedData abstractSerializedData, boolean z10, boolean z11) {
        sg.a0 a0Var;
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
        for (int i7 = 0; i7 < readInt32; i7++) {
            b20 b20Var = new b20();
            abstractSerializedData.readInt32(z11);
            b20Var.readParams(abstractSerializedData, z11);
            this.k.add(b20Var);
        }
        this.l = abstractSerializedData.readInt32(z11);
        this.m = abstractSerializedData.readInt32(z11);
        this.q = abstractSerializedData.readInt32(z11);
        this.r = abstractSerializedData.readInt32(z11);
        this.p = abstractSerializedData.readInt32(z11);
        String readString = abstractSerializedData.readString(z11);
        this.o = readString;
        sg.a0 a0Var2 = sg.a0.e;
        tg.h0 h0Var = null;
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
                int i11 = tg.h0.j;
            } else {
                h0Var = new tg.h0();
            }
            this.W = (tg.h0) TLObject.TLdeserialize(tg.h0.class, h0Var, abstractSerializedData, readInt323, z11);
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
                we weVar = new we();
                this.u = weVar;
                weVar.readParams(abstractSerializedData, z11);
                return;
            }
            return;
        }
        if (b10 == 8 && abstractSerializedData.readInt32(z11) == 132805945) {
            hi.qb qbVar = new hi.qb();
            qbVar.a = abstractSerializedData.readDouble(false);
            qbVar.b = abstractSerializedData.readDouble(false);
            qbVar.c = abstractSerializedData.readString(false);
            qbVar.d = abstractSerializedData.readFloat(false);
            this.O = qbVar;
        }
    }
}
