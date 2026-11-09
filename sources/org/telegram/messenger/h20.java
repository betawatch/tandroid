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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class h20 {
    public boolean A;
    public TLRPC.Document B;
    public Object C;
    public RLottieNative D;
    public float E;
    public float F;
    public Bitmap G;
    public Matrix H;
    public View I;
    public org.telegram.ui.Components.v5 J;
    public boolean K;
    public Canvas L;
    public TL_stories.MediaArea M;
    public TLRPC.MessageMedia N;
    public fi.sb O;
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
    public sg.b0 n;
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

    public h20() {
        this.j = "";
        this.k = new ArrayList();
        this.t = "";
        this.v = 1.0f;
    }

    public final h20 a() {
        h20 h20Var = new h20();
        h20Var.a = this.a;
        h20Var.b = this.b;
        h20Var.c = this.c;
        h20Var.d = this.d;
        h20Var.e = this.e;
        h20Var.f = this.f;
        h20Var.g = this.g;
        h20Var.i = this.i;
        h20Var.j = this.j;
        if (this.k != null) {
            ArrayList arrayList = new ArrayList();
            h20Var.k = arrayList;
            arrayList.addAll(this.k);
        }
        h20Var.l = this.l;
        h20Var.m = this.m;
        h20Var.n = this.n;
        h20Var.o = this.o;
        h20Var.p = this.p;
        h20Var.q = this.q;
        h20Var.r = this.r;
        h20Var.s = this.s;
        h20Var.v = this.v;
        h20Var.w = this.w;
        h20Var.x = this.x;
        h20Var.y = this.y;
        h20Var.z = this.z;
        h20Var.B = this.B;
        h20Var.C = this.C;
        h20Var.D = this.D;
        h20Var.E = this.E;
        h20Var.F = this.F;
        h20Var.G = this.G;
        h20Var.I = this.I;
        h20Var.J = this.J;
        h20Var.L = this.L;
        h20Var.M = this.M;
        h20Var.N = this.N;
        h20Var.P = this.P;
        h20Var.U = this.U;
        h20Var.V = this.V;
        h20Var.Q = this.Q;
        h20Var.T = this.T;
        h20Var.R = this.R;
        h20Var.S = this.S;
        h20Var.W = this.W;
        h20Var.O = this.O;
        return h20Var;
    }

    public final void b(AbstractSerializedData abstractSerializedData, boolean z9) {
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
            ((g20) this.k.get(i7)).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.l);
        abstractSerializedData.writeInt32(this.m);
        abstractSerializedData.writeInt32(this.q);
        abstractSerializedData.writeInt32(this.r);
        abstractSerializedData.writeInt32(this.p);
        sg.b0 b0Var = this.n;
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
        if (z9) {
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

    public h20(AbstractSerializedData abstractSerializedData, boolean z9, boolean z10) {
        sg.b0 b0Var;
        this.j = "";
        this.k = new ArrayList();
        this.t = "";
        this.v = 1.0f;
        this.a = abstractSerializedData.readByte(z10);
        this.b = abstractSerializedData.readByte(z10);
        this.c = abstractSerializedData.readFloat(z10);
        this.d = abstractSerializedData.readFloat(z10);
        this.e = abstractSerializedData.readFloat(z10);
        this.f = abstractSerializedData.readFloat(z10);
        this.g = abstractSerializedData.readFloat(z10);
        this.j = abstractSerializedData.readString(z10);
        int readInt32 = abstractSerializedData.readInt32(z10);
        for (int i7 = 0; i7 < readInt32; i7++) {
            g20 g20Var = new g20();
            abstractSerializedData.readInt32(z10);
            g20Var.readParams(abstractSerializedData, z10);
            this.k.add(g20Var);
        }
        this.l = abstractSerializedData.readInt32(z10);
        this.m = abstractSerializedData.readInt32(z10);
        this.q = abstractSerializedData.readInt32(z10);
        this.r = abstractSerializedData.readInt32(z10);
        this.p = abstractSerializedData.readInt32(z10);
        String readString = abstractSerializedData.readString(z10);
        this.o = readString;
        sg.b0 b0Var2 = sg.b0.e;
        tg.h0 h0Var = null;
        if (readString != null && !TextUtils.isEmpty(readString)) {
            List c10 = sg.b0.c();
            for (int i10 = 0; i10 < c10.size(); i10++) {
                b0Var = (sg.b0) c10.get(i10);
                if (b0Var != null && TextUtils.equals(readString, b0Var.a)) {
                    break;
                }
            }
        }
        b0Var = null;
        this.n = b0Var;
        this.v = abstractSerializedData.readFloat(z10);
        this.w = abstractSerializedData.readFloat(z10);
        this.x = abstractSerializedData.readFloat(z10);
        this.y = abstractSerializedData.readFloat(z10);
        this.z = abstractSerializedData.readFloat(z10);
        if (z9) {
            int readInt322 = abstractSerializedData.readInt32(z10);
            if (readInt322 == 1450380236) {
                this.B = null;
            } else {
                this.B = TLRPC.Document.TLdeserialize(abstractSerializedData, readInt322, z10);
            }
        }
        byte b10 = this.a;
        if (b10 == 3) {
            this.P = abstractSerializedData.readFloat(z10);
            this.M = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z10), z10);
            this.N = TLRPC.MessageMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z10), z10);
            if (abstractSerializedData.remaining() <= 0 || abstractSerializedData.readInt32(z10) != -559038737) {
                return;
            }
            String readString2 = abstractSerializedData.readString(z10);
            TLRPC.MessageMedia messageMedia = this.N;
            if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
                ((TLRPC.TL_messageMediaVenue) messageMedia).emoji = readString2;
                return;
            }
            return;
        }
        if (b10 == 7) {
            this.P = abstractSerializedData.readFloat(z10);
            this.M = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z10), z10);
            int readInt323 = abstractSerializedData.readInt32(z10);
            if (-625858389 != readInt323) {
                int i11 = tg.h0.j;
            } else {
                h0Var = new tg.h0();
            }
            this.W = (tg.h0) TLObject.TLdeserialize(tg.h0.class, h0Var, abstractSerializedData, readInt323, z10);
            return;
        }
        if (b10 == 4) {
            this.M = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z10), z10);
            return;
        }
        if (b10 == 5) {
            this.Q = abstractSerializedData.readInt64(z10);
            this.R = abstractSerializedData.readInt64(z10);
            this.S = abstractSerializedData.readInt64(z10);
            this.T = abstractSerializedData.readInt64(z10);
            return;
        }
        if (b10 == 2) {
            this.t = abstractSerializedData.readString(z10);
            if (abstractSerializedData.readInt32(z10) == 1151577037) {
                ye yeVar = new ye();
                this.u = yeVar;
                yeVar.readParams(abstractSerializedData, z10);
                return;
            }
            return;
        }
        if (b10 == 8 && abstractSerializedData.readInt32(z10) == 132805945) {
            fi.sb sbVar = new fi.sb();
            sbVar.a = abstractSerializedData.readDouble(false);
            sbVar.b = abstractSerializedData.readDouble(false);
            sbVar.c = abstractSerializedData.readString(false);
            sbVar.d = abstractSerializedData.readFloat(false);
            this.O = sbVar;
        }
    }
}
