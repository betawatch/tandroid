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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class e20 {
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
    public hi.pb O;
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
    public xe u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    public e20() {
        this.j = "";
        this.k = new ArrayList();
        this.t = "";
        this.v = 1.0f;
    }

    public final e20 a() {
        e20 e20Var = new e20();
        e20Var.a = this.a;
        e20Var.b = this.b;
        e20Var.c = this.c;
        e20Var.d = this.d;
        e20Var.e = this.e;
        e20Var.f = this.f;
        e20Var.g = this.g;
        e20Var.i = this.i;
        e20Var.j = this.j;
        if (this.k != null) {
            ArrayList arrayList = new ArrayList();
            e20Var.k = arrayList;
            arrayList.addAll(this.k);
        }
        e20Var.l = this.l;
        e20Var.m = this.m;
        e20Var.n = this.n;
        e20Var.o = this.o;
        e20Var.p = this.p;
        e20Var.q = this.q;
        e20Var.r = this.r;
        e20Var.s = this.s;
        e20Var.v = this.v;
        e20Var.w = this.w;
        e20Var.x = this.x;
        e20Var.y = this.y;
        e20Var.z = this.z;
        e20Var.B = this.B;
        e20Var.C = this.C;
        e20Var.D = this.D;
        e20Var.E = this.E;
        e20Var.F = this.F;
        e20Var.G = this.G;
        e20Var.I = this.I;
        e20Var.J = this.J;
        e20Var.L = this.L;
        e20Var.M = this.M;
        e20Var.N = this.N;
        e20Var.P = this.P;
        e20Var.U = this.U;
        e20Var.V = this.V;
        e20Var.Q = this.Q;
        e20Var.T = this.T;
        e20Var.R = this.R;
        e20Var.S = this.S;
        e20Var.W = this.W;
        e20Var.O = this.O;
        return e20Var;
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
            ((d20) this.k.get(i7)).serializeToStream(abstractSerializedData);
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
            xe xeVar = this.u;
            if (xeVar != null) {
                xeVar.serializeToStream(abstractSerializedData);
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

    public e20(AbstractSerializedData abstractSerializedData, boolean z10, boolean z11) {
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
            d20 d20Var = new d20();
            abstractSerializedData.readInt32(z11);
            d20Var.readParams(abstractSerializedData, z11);
            this.k.add(d20Var);
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
                xe xeVar = new xe();
                this.u = xeVar;
                xeVar.readParams(abstractSerializedData, z11);
                return;
            }
            return;
        }
        if (b10 == 8 && abstractSerializedData.readInt32(z11) == 132805945) {
            hi.pb pbVar = new hi.pb();
            pbVar.a = abstractSerializedData.readDouble(false);
            pbVar.b = abstractSerializedData.readDouble(false);
            pbVar.c = abstractSerializedData.readString(false);
            pbVar.d = abstractSerializedData.readFloat(false);
            this.O = pbVar;
        }
    }
}
