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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class z10 {
    public boolean A;
    public TLRPC.Document B;
    public Object C;
    public RLottieNative D;
    public float E;
    public float F;
    public Bitmap G;
    public Matrix H;
    public View I;
    public org.telegram.ui.Components.t5 J;
    public boolean K;
    public Canvas L;
    public TL_stories.MediaArea M;
    public TLRPC.MessageMedia N;
    public gi.sb O;
    public float P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public int U;
    public int V;
    public ug.g0 W;
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
    public tg.b0 n;
    public String o;
    public int p;
    public int q;
    public int r;
    public float s;
    public String t;
    public re u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    public z10() {
        this.j = "";
        this.k = new ArrayList();
        this.t = "";
        this.v = 1.0f;
    }

    public final z10 a() {
        z10 z10Var = new z10();
        z10Var.a = this.a;
        z10Var.b = this.b;
        z10Var.c = this.c;
        z10Var.d = this.d;
        z10Var.e = this.e;
        z10Var.f = this.f;
        z10Var.g = this.g;
        z10Var.i = this.i;
        z10Var.j = this.j;
        if (this.k != null) {
            ArrayList arrayList = new ArrayList();
            z10Var.k = arrayList;
            arrayList.addAll(this.k);
        }
        z10Var.l = this.l;
        z10Var.m = this.m;
        z10Var.n = this.n;
        z10Var.o = this.o;
        z10Var.p = this.p;
        z10Var.q = this.q;
        z10Var.r = this.r;
        z10Var.s = this.s;
        z10Var.v = this.v;
        z10Var.w = this.w;
        z10Var.x = this.x;
        z10Var.y = this.y;
        z10Var.z = this.z;
        z10Var.B = this.B;
        z10Var.C = this.C;
        z10Var.D = this.D;
        z10Var.E = this.E;
        z10Var.F = this.F;
        z10Var.G = this.G;
        z10Var.I = this.I;
        z10Var.J = this.J;
        z10Var.L = this.L;
        z10Var.M = this.M;
        z10Var.N = this.N;
        z10Var.P = this.P;
        z10Var.U = this.U;
        z10Var.V = this.V;
        z10Var.Q = this.Q;
        z10Var.T = this.T;
        z10Var.R = this.R;
        z10Var.S = this.S;
        z10Var.W = this.W;
        z10Var.O = this.O;
        return z10Var;
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
        for (int i3 = 0; i3 < this.k.size(); i3++) {
            ((y10) this.k.get(i3)).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.l);
        abstractSerializedData.writeInt32(this.m);
        abstractSerializedData.writeInt32(this.q);
        abstractSerializedData.writeInt32(this.r);
        abstractSerializedData.writeInt32(this.p);
        tg.b0 b0Var = this.n;
        if (b0Var == null) {
            str = this.o;
            if (str == null) {
                str = "";
            }
        } else {
            str = b0Var.a;
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
            re reVar = this.u;
            if (reVar != null) {
                reVar.serializeToStream(abstractSerializedData);
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

    public z10(AbstractSerializedData abstractSerializedData, boolean z10, boolean z11) {
        tg.b0 b0Var;
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
        for (int i3 = 0; i3 < readInt32; i3++) {
            y10 y10Var = new y10();
            abstractSerializedData.readInt32(z11);
            y10Var.readParams(abstractSerializedData, z11);
            this.k.add(y10Var);
        }
        this.l = abstractSerializedData.readInt32(z11);
        this.m = abstractSerializedData.readInt32(z11);
        this.q = abstractSerializedData.readInt32(z11);
        this.r = abstractSerializedData.readInt32(z11);
        this.p = abstractSerializedData.readInt32(z11);
        String readString = abstractSerializedData.readString(z11);
        this.o = readString;
        tg.b0 b0Var2 = tg.b0.e;
        ug.g0 g0Var = null;
        if (readString != null && !TextUtils.isEmpty(readString)) {
            List c2 = tg.b0.c();
            for (int i10 = 0; i10 < c2.size(); i10++) {
                b0Var = (tg.b0) c2.get(i10);
                if (b0Var != null && TextUtils.equals(readString, b0Var.a)) {
                    break;
                }
            }
        }
        b0Var = null;
        this.n = b0Var;
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
                int i11 = ug.g0.j;
            } else {
                g0Var = new ug.g0();
            }
            this.W = (ug.g0) TLObject.TLdeserialize(ug.g0.class, g0Var, abstractSerializedData, readInt323, z11);
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
                re reVar = new re();
                this.u = reVar;
                reVar.readParams(abstractSerializedData, z11);
                return;
            }
            return;
        }
        if (b10 == 8 && abstractSerializedData.readInt32(z11) == 132805945) {
            gi.sb sbVar = new gi.sb();
            sbVar.a = abstractSerializedData.readDouble(false);
            sbVar.b = abstractSerializedData.readDouble(false);
            sbVar.c = abstractSerializedData.readString(false);
            sbVar.d = abstractSerializedData.readFloat(false);
            this.O = sbVar;
        }
    }
}
