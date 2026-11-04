package org.telegram.messenger;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class hw implements Runnable {
    public final /* synthetic */ TL_stories.StoryItem E;
    public final /* synthetic */ zv F;
    public final /* synthetic */ long G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ long I;
    public final /* synthetic */ Runnable J;
    public final /* synthetic */ th.f a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ long c;
    public final /* synthetic */ c d;
    public final /* synthetic */ CharSequence e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ zi n;
    public final /* synthetic */ zi r;
    public final /* synthetic */ zi s;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;

    public /* synthetic */ hw(th.f fVar, ArrayList arrayList, long j10, c cVar, CharSequence charSequence, boolean z10, ArrayList arrayList2, zi ziVar, zi ziVar2, zi ziVar3, boolean z11, int i3, int i10, TL_stories.StoryItem storyItem, zv zvVar, long j11, boolean z12, long j12, Runnable runnable) {
        this.a = fVar;
        this.b = arrayList;
        this.c = j10;
        this.d = cVar;
        this.e = charSequence;
        this.f = z10;
        this.h = arrayList2;
        this.n = ziVar;
        this.r = ziVar2;
        this.s = ziVar3;
        this.w = z11;
        this.x = i3;
        this.y = i10;
        this.E = storyItem;
        this.F = zvVar;
        this.G = j11;
        this.H = z12;
        this.I = j12;
        this.J = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d3  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i3;
        ArrayList arrayList;
        th.f fVar;
        final String str;
        TLRPC.TL_document tL_document;
        final TLRPC.TL_document tL_document2;
        int i10;
        final HashMap hashMap;
        Bitmap bitmap;
        th.f fVar2 = this.a;
        long j10 = fVar2 != null ? fVar2.c : 0L;
        int i11 = 1;
        boolean z10 = fVar2 != null;
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        long j11 = j10 != 0 ? j10 : 0L;
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            final zi ziVar = (zi) arrayList2.get(i12);
            String str2 = ziVar.k.attachPath;
            File file = new File(str2);
            final long j12 = this.c;
            boolean C = m5.C(j12);
            if (!C && size > i11 && i13 % 10 == 0 && fVar2 == null) {
                j11 = Utilities.b.nextLong();
                i13 = 0;
            }
            if (str2 == null || str2.length() <= 0) {
                i3 = i11;
                arrayList = arrayList2;
            } else {
                StringBuilder h = t4.c.h(str2, MediaStreamTrack.AUDIO_TRACK_KIND);
                i3 = i11;
                arrayList = arrayList2;
                h.append(file.length());
                str2 = h.toString();
            }
            final c cVar = this.d;
            if (!C && !TextUtils.isEmpty(str2) && !z10) {
                Object[] g02 = qr.a0(cVar.a).g0(!C ? i3 : 4, str2);
                if (g02 != null) {
                    Object obj = g02[0];
                    fVar = fVar2;
                    if (obj instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) obj;
                        String str3 = (String) g02[i3];
                        yy.w(cVar, C, tL_document, str2, null, 0L, false);
                        str = str3;
                        if (tL_document == null) {
                            tL_document = (TLRPC.TL_document) ziVar.k.media.document;
                        }
                        tL_document2 = tL_document;
                        if (tL_document2 != null && tL_document2.thumbs.isEmpty()) {
                            of.a a10 = of.a.a(file);
                            bitmap = a10 == null ? a10.o : null;
                            if (bitmap != null) {
                                i10 = i13;
                                TLRPC.PhotoSize Z = zb.Z(bitmap, 132.0f, 132.0f, 55, C);
                                if (Z != null) {
                                    tL_document2.thumbs.add(Z);
                                    tL_document2.flags |= 1;
                                }
                                bitmap.recycle();
                                if (!C && hp.s1(cVar.a).a1(Integer.valueOf((int) (4294967295L & j12))) == null) {
                                    return;
                                }
                                int i14 = i3;
                                CharSequence[] charSequenceArr = new CharSequence[i14];
                                charSequenceArr[0] = this.e;
                                ArrayList W = i12 != 0 ? li.b0(cVar.a).W(charSequenceArr, i14, i14) : null;
                                String charSequence = i12 != 0 ? charSequenceArr[0].toString() : null;
                                hashMap = new HashMap();
                                if (str2 != null) {
                                    hashMap.put("originalPath", str2);
                                }
                                if (str != null) {
                                    hashMap.put("parentObject", str);
                                }
                                int i15 = i10 + 1;
                                hashMap.put("groupId", "" + j11);
                                if (!this.f && ((fVar == null && i15 == 10) || i12 == size - 1)) {
                                    hashMap.put("final", "1");
                                }
                                ArrayList arrayList3 = this.h;
                                int intValue = arrayList3 == null ? ((Integer) arrayList3.get(i12)).intValue() : 0;
                                long j13 = j11;
                                final zi ziVar2 = this.n;
                                final zi ziVar3 = this.r;
                                final String str4 = charSequence;
                                final ArrayList arrayList4 = W;
                                final zi ziVar4 = this.s;
                                final boolean z11 = this.w;
                                final th.f fVar3 = fVar;
                                final int i16 = intValue;
                                final int i17 = this.x;
                                final int i18 = this.y;
                                final TL_stories.StoryItem storyItem = this.E;
                                final zv zvVar = this.F;
                                final long j14 = this.G;
                                final boolean z12 = this.H;
                                final long j15 = this.I;
                                g0.h3(new Runnable() { // from class: org.telegram.messenger.yw
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zi ziVar5 = zi.this;
                                        c cVar2 = cVar;
                                        TLRPC.TL_document tL_document3 = tL_document2;
                                        zi ziVar6 = ziVar;
                                        HashMap hashMap2 = hashMap;
                                        String str5 = str;
                                        if (ziVar5 != null) {
                                            yy.C(cVar2.a).t(ziVar5, null, null, null, tL_document3, ziVar6.k.attachPath, null, hashMap2, false, false, str5);
                                            return;
                                        }
                                        wy e10 = wy.e(tL_document3, null, ziVar6.k.attachPath, j12, ziVar3, ziVar4, str4, arrayList4, hashMap2, z11, i17, i18, 0, str5, false);
                                        e10.H = storyItem;
                                        e10.K = zvVar;
                                        e10.O = j14;
                                        e10.L = z12;
                                        e10.Q = j15;
                                        e10.j = fVar3;
                                        e10.k = i16;
                                        yy.C(cVar2.a).r0(e10);
                                    }
                                });
                                i12++;
                                fVar2 = fVar3;
                                size = size;
                                j11 = j13;
                                i13 = i15;
                                arrayList2 = arrayList;
                                i11 = 1;
                            }
                        }
                        i10 = i13;
                        if (!C) {
                        }
                        int i142 = i3;
                        CharSequence[] charSequenceArr2 = new CharSequence[i142];
                        charSequenceArr2[0] = this.e;
                        if (i12 != 0) {
                        }
                        if (i12 != 0) {
                        }
                        hashMap = new HashMap();
                        if (str2 != null) {
                        }
                        if (str != null) {
                        }
                        int i152 = i10 + 1;
                        hashMap.put("groupId", "" + j11);
                        if (!this.f) {
                            hashMap.put("final", "1");
                        }
                        ArrayList arrayList32 = this.h;
                        if (arrayList32 == null) {
                        }
                        long j132 = j11;
                        final zi ziVar22 = this.n;
                        final zi ziVar32 = this.r;
                        final String str42 = charSequence;
                        final ArrayList arrayList42 = W;
                        final zi ziVar42 = this.s;
                        final boolean z112 = this.w;
                        final th.f fVar32 = fVar;
                        final int i162 = intValue;
                        final int i172 = this.x;
                        final int i182 = this.y;
                        final TL_stories.StoryItem storyItem2 = this.E;
                        final zv zvVar2 = this.F;
                        final long j142 = this.G;
                        final boolean z122 = this.H;
                        final long j152 = this.I;
                        g0.h3(new Runnable() { // from class: org.telegram.messenger.yw
                            @Override // java.lang.Runnable
                            public final void run() {
                                zi ziVar5 = zi.this;
                                c cVar2 = cVar;
                                TLRPC.TL_document tL_document3 = tL_document2;
                                zi ziVar6 = ziVar;
                                HashMap hashMap2 = hashMap;
                                String str5 = str;
                                if (ziVar5 != null) {
                                    yy.C(cVar2.a).t(ziVar5, null, null, null, tL_document3, ziVar6.k.attachPath, null, hashMap2, false, false, str5);
                                    return;
                                }
                                wy e10 = wy.e(tL_document3, null, ziVar6.k.attachPath, j12, ziVar32, ziVar42, str42, arrayList42, hashMap2, z112, i172, i182, 0, str5, false);
                                e10.H = storyItem2;
                                e10.K = zvVar2;
                                e10.O = j142;
                                e10.L = z122;
                                e10.Q = j152;
                                e10.j = fVar32;
                                e10.k = i162;
                                yy.C(cVar2.a).r0(e10);
                            }
                        });
                        i12++;
                        fVar2 = fVar32;
                        size = size;
                        j11 = j132;
                        i13 = i152;
                        arrayList2 = arrayList;
                        i11 = 1;
                    }
                    str = null;
                    tL_document = null;
                    if (tL_document == null) {
                    }
                    tL_document2 = tL_document;
                    if (tL_document2 != null) {
                        of.a a102 = of.a.a(file);
                        if (a102 == null) {
                        }
                        if (bitmap != null) {
                        }
                    }
                    i10 = i13;
                    if (!C) {
                    }
                    int i1422 = i3;
                    CharSequence[] charSequenceArr22 = new CharSequence[i1422];
                    charSequenceArr22[0] = this.e;
                    if (i12 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    hashMap = new HashMap();
                    if (str2 != null) {
                    }
                    if (str != null) {
                    }
                    int i1522 = i10 + 1;
                    hashMap.put("groupId", "" + j11);
                    if (!this.f) {
                    }
                    ArrayList arrayList322 = this.h;
                    if (arrayList322 == null) {
                    }
                    long j1322 = j11;
                    final zi ziVar222 = this.n;
                    final zi ziVar322 = this.r;
                    final String str422 = charSequence;
                    final ArrayList arrayList422 = W;
                    final zi ziVar422 = this.s;
                    final boolean z1122 = this.w;
                    final th.f fVar322 = fVar;
                    final int i1622 = intValue;
                    final int i1722 = this.x;
                    final int i1822 = this.y;
                    final TL_stories.StoryItem storyItem22 = this.E;
                    final zv zvVar22 = this.F;
                    final long j1422 = this.G;
                    final boolean z1222 = this.H;
                    final long j1522 = this.I;
                    g0.h3(new Runnable() { // from class: org.telegram.messenger.yw
                        @Override // java.lang.Runnable
                        public final void run() {
                            zi ziVar5 = zi.this;
                            c cVar2 = cVar;
                            TLRPC.TL_document tL_document3 = tL_document2;
                            zi ziVar6 = ziVar;
                            HashMap hashMap2 = hashMap;
                            String str5 = str;
                            if (ziVar5 != null) {
                                yy.C(cVar2.a).t(ziVar5, null, null, null, tL_document3, ziVar6.k.attachPath, null, hashMap2, false, false, str5);
                                return;
                            }
                            wy e10 = wy.e(tL_document3, null, ziVar6.k.attachPath, j12, ziVar322, ziVar422, str422, arrayList422, hashMap2, z1122, i1722, i1822, 0, str5, false);
                            e10.H = storyItem22;
                            e10.K = zvVar22;
                            e10.O = j1422;
                            e10.L = z1222;
                            e10.Q = j1522;
                            e10.j = fVar322;
                            e10.k = i1622;
                            yy.C(cVar2.a).r0(e10);
                        }
                    });
                    i12++;
                    fVar2 = fVar322;
                    size = size;
                    j11 = j1322;
                    i13 = i1522;
                    arrayList2 = arrayList;
                    i11 = 1;
                }
            }
            fVar = fVar2;
            str = null;
            tL_document = null;
            if (tL_document == null) {
            }
            tL_document2 = tL_document;
            if (tL_document2 != null) {
            }
            i10 = i13;
            if (!C) {
            }
            int i14222 = i3;
            CharSequence[] charSequenceArr222 = new CharSequence[i14222];
            charSequenceArr222[0] = this.e;
            if (i12 != 0) {
            }
            if (i12 != 0) {
            }
            hashMap = new HashMap();
            if (str2 != null) {
            }
            if (str != null) {
            }
            int i15222 = i10 + 1;
            hashMap.put("groupId", "" + j11);
            if (!this.f) {
            }
            ArrayList arrayList3222 = this.h;
            if (arrayList3222 == null) {
            }
            long j13222 = j11;
            final zi ziVar2222 = this.n;
            final zi ziVar3222 = this.r;
            final String str4222 = charSequence;
            final ArrayList arrayList4222 = W;
            final zi ziVar4222 = this.s;
            final boolean z11222 = this.w;
            final th.f fVar3222 = fVar;
            final int i16222 = intValue;
            final int i17222 = this.x;
            final int i18222 = this.y;
            final TL_stories.StoryItem storyItem222 = this.E;
            final zv zvVar222 = this.F;
            final long j14222 = this.G;
            final boolean z12222 = this.H;
            final long j15222 = this.I;
            g0.h3(new Runnable() { // from class: org.telegram.messenger.yw
                @Override // java.lang.Runnable
                public final void run() {
                    zi ziVar5 = zi.this;
                    c cVar2 = cVar;
                    TLRPC.TL_document tL_document3 = tL_document2;
                    zi ziVar6 = ziVar;
                    HashMap hashMap2 = hashMap;
                    String str5 = str;
                    if (ziVar5 != null) {
                        yy.C(cVar2.a).t(ziVar5, null, null, null, tL_document3, ziVar6.k.attachPath, null, hashMap2, false, false, str5);
                        return;
                    }
                    wy e10 = wy.e(tL_document3, null, ziVar6.k.attachPath, j12, ziVar3222, ziVar4222, str4222, arrayList4222, hashMap2, z11222, i17222, i18222, 0, str5, false);
                    e10.H = storyItem222;
                    e10.K = zvVar222;
                    e10.O = j14222;
                    e10.L = z12222;
                    e10.Q = j15222;
                    e10.j = fVar3222;
                    e10.k = i16222;
                    yy.C(cVar2.a).r0(e10);
                }
            });
            i12++;
            fVar2 = fVar3222;
            size = size;
            j11 = j13222;
            i13 = i15222;
            arrayList2 = arrayList;
            i11 = 1;
        }
        Runnable runnable = this.J;
        if (runnable != null) {
            g0.h3(runnable);
        }
    }
}
