package jg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.f8;
import org.telegram.messenger.k20;
import org.telegram.messenger.kj;
import org.telegram.messenger.r20;
import org.telegram.messenger.y20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
    public k20 m;
    public r20 n;
    public boolean o;
    public ArrayList p;
    public ArrayList q;
    public kj r;
    public y20 s;
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
