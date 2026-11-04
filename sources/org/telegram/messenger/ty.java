package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ty {
    public String e;
    public String f;
    public String g;
    public long h;
    public long i;
    public int j;
    public double k;
    public long l;
    public long m;
    public final /* synthetic */ yy o;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayList d = new ArrayList();
    public int n = ConnectionsManager.DEFAULT_DATACENTER_ID;

    public ty(yy yyVar) {
        this.o = yyVar;
    }

    public final void a(String str, long j10, float f10) {
        this.b.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.c;
        hashMap.put(str, valueOf);
        this.i = 0L;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            this.i = ((Long) ((Map.Entry) it.next()).getValue()).longValue() + this.i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.i;
        if (j11 != this.m) {
            if (elapsedRealtime != this.l) {
                double d = (j11 - r0) / ((elapsedRealtime - r2) / 1000.0d);
                double d10 = this.k;
                if (d10 == 0.0d) {
                    this.k = d;
                } else {
                    this.k = (0.99d * d10) + (d * 0.01d);
                }
                this.n = (int) (((this.h - j11) * 1000) / this.k);
                this.m = j11;
                this.l = elapsedRealtime;
            }
        }
        int i3 = (int) ((j11 / this.h) * 100.0f);
        if (this.j != i3) {
            this.j = i3;
            this.o.getNotificationCenter().k(hs.w1, this.e);
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
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = ((ry) arrayList.get(i3)).f;
            if (tL_inputStickerSetItem != null) {
                tL_stickers_createStickerSet.stickers.add(tL_inputStickerSetItem);
            }
        }
        this.o.getConnectionsManager().sendRequest(tL_stickers_createStickerSet, new sy(this, tL_stickers_createStickerSet));
    }
}
