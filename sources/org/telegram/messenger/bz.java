package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class bz {
    public String e;
    public String f;
    public String g;
    public long h;
    public long i;
    public int j;
    public double k;
    public long l;
    public long m;
    public final /* synthetic */ gz o;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayList d = new ArrayList();
    public int n = ConnectionsManager.DEFAULT_DATACENTER_ID;

    public bz(gz gzVar) {
        this.o = gzVar;
    }

    public final void a(String str, long j3, float f10) {
        this.b.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.c;
        hashMap.put(str, valueOf);
        this.i = 0L;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            this.i = ((Long) ((Map.Entry) it.next()).getValue()).longValue() + this.i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.i;
        if (j10 != this.m) {
            if (elapsedRealtime != this.l) {
                double d = (j10 - r0) / ((elapsedRealtime - r2) / 1000.0d);
                double d2 = this.k;
                if (d2 == 0.0d) {
                    this.k = d;
                } else {
                    this.k = (0.99d * d2) + (d * 0.01d);
                }
                this.n = (int) (((this.h - j10) * 1000) / this.k);
                this.m = j10;
                this.l = elapsedRealtime;
            }
        }
        int i7 = (int) ((j10 / this.h) * 100.0f);
        if (this.j != i7) {
            this.j = i7;
            this.o.getNotificationCenter().k(qs.w1, this.e);
        }
    }

    public final void b() {
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
        tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
        tL_stickers_createStickerSet.title = this.f;
        tL_stickers_createStickerSet.short_name = this.e;
        String str = this.g;
        if (str != null) {
            tL_stickers_createStickerSet.software = str;
            tL_stickers_createStickerSet.flags |= 8;
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = ((zy) arrayList.get(i7)).f;
            if (tL_inputStickerSetItem != null) {
                tL_stickers_createStickerSet.stickers.add(tL_inputStickerSetItem);
            }
        }
        this.o.getConnectionsManager().sendRequest(tL_stickers_createStickerSet, new az(this, tL_stickers_createStickerSet));
    }
}
