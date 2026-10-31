package jg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.f8;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.x20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t2 {
    public String a;
    public String b;
    public String c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f;
    public TLRPC.InputFile g;
    public boolean h;
    public long i;
    public TLRPC.StickerSet j;
    public TLRPC.Document k;
    public String l;
    public j20 m;
    public q20 n;
    public boolean o;
    public ArrayList p;
    public ArrayList q;
    public jj r;
    public x20 s;
    public float t;
    public float u;

    public final void a() {
        ArrayList arrayList = this.q;
        ArrayList arrayList2 = this.p;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            try {
                ((File) obj).delete();
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        arrayList2.clear();
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            try {
                ((File) obj2).delete();
            } catch (Exception e7) {
                f8.g(e7, true);
            }
        }
        arrayList.clear();
    }

    public final float b() {
        float f7 = this.m == null ? 0.9f : 1.0f;
        if (this.s == null) {
            return f7 * this.u;
        }
        return c3.i0.C(this.u, 0.5f, this.t * 0.5f, f7);
    }
}
