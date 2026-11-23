package org.telegram.messenger;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class iw implements Runnable {
    public final /* synthetic */ TL_stories.StoryItem E;
    public final /* synthetic */ bw F;
    public final /* synthetic */ long G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ long I;
    public final /* synthetic */ Runnable J;
    public final /* synthetic */ sh.f a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ long c;
    public final /* synthetic */ c d;
    public final /* synthetic */ CharSequence e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ fj n;
    public final /* synthetic */ fj r;
    public final /* synthetic */ fj s;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;

    public /* synthetic */ iw(sh.f fVar, ArrayList arrayList, long j3, c cVar, CharSequence charSequence, boolean z10, ArrayList arrayList2, fj fjVar, fj fjVar2, fj fjVar3, boolean z11, int i7, int i10, TL_stories.StoryItem storyItem, bw bwVar, long j10, boolean z12, long j11, Runnable runnable) {
        this.a = fVar;
        this.b = arrayList;
        this.c = j3;
        this.d = cVar;
        this.e = charSequence;
        this.f = z10;
        this.h = arrayList2;
        this.n = fjVar;
        this.r = fjVar2;
        this.s = fjVar3;
        this.w = z11;
        this.x = i7;
        this.y = i10;
        this.E = storyItem;
        this.F = bwVar;
        this.G = j10;
        this.H = z12;
        this.I = j11;
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
        int i7;
        ArrayList arrayList;
        sh.f fVar;
        final String str;
        TLRPC.TL_document tL_document;
        final TLRPC.TL_document tL_document2;
        int i10;
        final HashMap hashMap;
        Bitmap bitmap;
        sh.f fVar2 = this.a;
        long j3 = fVar2 != null ? fVar2.c : 0L;
        int i11 = 1;
        boolean z10 = fVar2 != null;
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        long j10 = j3 != 0 ? j3 : 0L;
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            final fj fjVar = (fj) arrayList2.get(i12);
            String str2 = fjVar.k.attachPath;
            File file = new File(str2);
            final long j11 = this.c;
            boolean C = n5.C(j11);
            if (!C && size > i11 && i13 % 10 == 0 && fVar2 == null) {
                j10 = Utilities.b.nextLong();
                i13 = 0;
            }
            if (str2 == null || str2.length() <= 0) {
                i7 = i11;
                arrayList = arrayList2;
            } else {
                StringBuilder n10 = p5.c.n(str2, MediaStreamTrack.AUDIO_TRACK_KIND);
                i7 = i11;
                arrayList = arrayList2;
                n10.append(file.length());
                str2 = n10.toString();
            }
            final c cVar = this.d;
            if (!C && !TextUtils.isEmpty(str2) && !z10) {
                Object[] g02 = tr.a0(cVar.a).g0(!C ? i7 : 4, str2);
                if (g02 != null) {
                    Object obj = g02[0];
                    fVar = fVar2;
                    if (obj instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) obj;
                        String str3 = (String) g02[i7];
                        zy.w(cVar, C, tL_document, str2, null, 0L, false);
                        str = str3;
                        if (tL_document == null) {
                            tL_document = (TLRPC.TL_document) fjVar.k.media.document;
                        }
                        tL_document2 = tL_document;
                        if (tL_document2 != null && tL_document2.thumbs.isEmpty()) {
                            rf.a a10 = rf.a.a(file);
                            bitmap = a10 == null ? a10.o : null;
                            if (bitmap != null) {
                                i10 = i13;
                                TLRPC.PhotoSize Z = ec.Z(bitmap, 132.0f, 132.0f, 55, C);
                                if (Z != null) {
                                    tL_document2.thumbs.add(Z);
                                    tL_document2.flags |= 1;
                                }
                                bitmap.recycle();
                                if (!C && mp.u1(cVar.a).c1(Integer.valueOf((int) (4294967295L & j11))) == null) {
                                    return;
                                }
                                int i14 = i7;
                                CharSequence[] charSequenceArr = new CharSequence[i14];
                                charSequenceArr[0] = this.e;
                                ArrayList Y = i12 != 0 ? ri.d0(cVar.a).Y(charSequenceArr, i14, i14) : null;
                                String charSequence = i12 != 0 ? charSequenceArr[0].toString() : null;
                                hashMap = new HashMap();
                                if (str2 != null) {
                                    hashMap.put("originalPath", str2);
                                }
                                if (str != null) {
                                    hashMap.put("parentObject", str);
                                }
                                int i15 = i10 + 1;
                                hashMap.put("groupId", "" + j10);
                                if (!this.f && ((fVar == null && i15 == 10) || i12 == size - 1)) {
                                    hashMap.put("final", "1");
                                }
                                ArrayList arrayList3 = this.h;
                                int intValue = arrayList3 == null ? ((Integer) arrayList3.get(i12)).intValue() : 0;
                                long j12 = j10;
                                final fj fjVar2 = this.n;
                                final fj fjVar3 = this.r;
                                final String str4 = charSequence;
                                final ArrayList arrayList4 = Y;
                                final fj fjVar4 = this.s;
                                final boolean z11 = this.w;
                                final sh.f fVar3 = fVar;
                                final int i16 = intValue;
                                final int i17 = this.x;
                                final int i18 = this.y;
                                final TL_stories.StoryItem storyItem = this.E;
                                final bw bwVar = this.F;
                                final long j13 = this.G;
                                final boolean z12 = this.H;
                                final long j14 = this.I;
                                g0.g3(new Runnable() { // from class: org.telegram.messenger.yw
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        fj fjVar5 = fj.this;
                                        c cVar2 = cVar;
                                        TLRPC.TL_document tL_document3 = tL_document2;
                                        fj fjVar6 = fjVar;
                                        HashMap hashMap2 = hashMap;
                                        String str5 = str;
                                        if (fjVar5 != null) {
                                            zy.C(cVar2.a).t(fjVar5, null, null, null, tL_document3, fjVar6.k.attachPath, null, hashMap2, false, false, str5);
                                            return;
                                        }
                                        xy e10 = xy.e(tL_document3, null, fjVar6.k.attachPath, j11, fjVar3, fjVar4, str4, arrayList4, hashMap2, z11, i17, i18, 0, str5, false);
                                        e10.H = storyItem;
                                        e10.K = bwVar;
                                        e10.O = j13;
                                        e10.L = z12;
                                        e10.Q = j14;
                                        e10.j = fVar3;
                                        e10.k = i16;
                                        zy.C(cVar2.a).r0(e10);
                                    }
                                });
                                i12++;
                                fVar2 = fVar3;
                                size = size;
                                j10 = j12;
                                i13 = i15;
                                arrayList2 = arrayList;
                                i11 = 1;
                            }
                        }
                        i10 = i13;
                        if (!C) {
                        }
                        int i142 = i7;
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
                        hashMap.put("groupId", "" + j10);
                        if (!this.f) {
                            hashMap.put("final", "1");
                        }
                        ArrayList arrayList32 = this.h;
                        if (arrayList32 == null) {
                        }
                        long j122 = j10;
                        final fj fjVar22 = this.n;
                        final fj fjVar32 = this.r;
                        final String str42 = charSequence;
                        final ArrayList arrayList42 = Y;
                        final fj fjVar42 = this.s;
                        final boolean z112 = this.w;
                        final sh.f fVar32 = fVar;
                        final int i162 = intValue;
                        final int i172 = this.x;
                        final int i182 = this.y;
                        final TL_stories.StoryItem storyItem2 = this.E;
                        final bw bwVar2 = this.F;
                        final long j132 = this.G;
                        final boolean z122 = this.H;
                        final long j142 = this.I;
                        g0.g3(new Runnable() { // from class: org.telegram.messenger.yw
                            @Override // java.lang.Runnable
                            public final void run() {
                                fj fjVar5 = fj.this;
                                c cVar2 = cVar;
                                TLRPC.TL_document tL_document3 = tL_document2;
                                fj fjVar6 = fjVar;
                                HashMap hashMap2 = hashMap;
                                String str5 = str;
                                if (fjVar5 != null) {
                                    zy.C(cVar2.a).t(fjVar5, null, null, null, tL_document3, fjVar6.k.attachPath, null, hashMap2, false, false, str5);
                                    return;
                                }
                                xy e10 = xy.e(tL_document3, null, fjVar6.k.attachPath, j11, fjVar32, fjVar42, str42, arrayList42, hashMap2, z112, i172, i182, 0, str5, false);
                                e10.H = storyItem2;
                                e10.K = bwVar2;
                                e10.O = j132;
                                e10.L = z122;
                                e10.Q = j142;
                                e10.j = fVar32;
                                e10.k = i162;
                                zy.C(cVar2.a).r0(e10);
                            }
                        });
                        i12++;
                        fVar2 = fVar32;
                        size = size;
                        j10 = j122;
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
                        rf.a a102 = rf.a.a(file);
                        if (a102 == null) {
                        }
                        if (bitmap != null) {
                        }
                    }
                    i10 = i13;
                    if (!C) {
                    }
                    int i1422 = i7;
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
                    hashMap.put("groupId", "" + j10);
                    if (!this.f) {
                    }
                    ArrayList arrayList322 = this.h;
                    if (arrayList322 == null) {
                    }
                    long j1222 = j10;
                    final fj fjVar222 = this.n;
                    final fj fjVar322 = this.r;
                    final String str422 = charSequence;
                    final ArrayList arrayList422 = Y;
                    final fj fjVar422 = this.s;
                    final boolean z1122 = this.w;
                    final sh.f fVar322 = fVar;
                    final int i1622 = intValue;
                    final int i1722 = this.x;
                    final int i1822 = this.y;
                    final TL_stories.StoryItem storyItem22 = this.E;
                    final bw bwVar22 = this.F;
                    final long j1322 = this.G;
                    final boolean z1222 = this.H;
                    final long j1422 = this.I;
                    g0.g3(new Runnable() { // from class: org.telegram.messenger.yw
                        @Override // java.lang.Runnable
                        public final void run() {
                            fj fjVar5 = fj.this;
                            c cVar2 = cVar;
                            TLRPC.TL_document tL_document3 = tL_document2;
                            fj fjVar6 = fjVar;
                            HashMap hashMap2 = hashMap;
                            String str5 = str;
                            if (fjVar5 != null) {
                                zy.C(cVar2.a).t(fjVar5, null, null, null, tL_document3, fjVar6.k.attachPath, null, hashMap2, false, false, str5);
                                return;
                            }
                            xy e10 = xy.e(tL_document3, null, fjVar6.k.attachPath, j11, fjVar322, fjVar422, str422, arrayList422, hashMap2, z1122, i1722, i1822, 0, str5, false);
                            e10.H = storyItem22;
                            e10.K = bwVar22;
                            e10.O = j1322;
                            e10.L = z1222;
                            e10.Q = j1422;
                            e10.j = fVar322;
                            e10.k = i1622;
                            zy.C(cVar2.a).r0(e10);
                        }
                    });
                    i12++;
                    fVar2 = fVar322;
                    size = size;
                    j10 = j1222;
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
            int i14222 = i7;
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
            hashMap.put("groupId", "" + j10);
            if (!this.f) {
            }
            ArrayList arrayList3222 = this.h;
            if (arrayList3222 == null) {
            }
            long j12222 = j10;
            final fj fjVar2222 = this.n;
            final fj fjVar3222 = this.r;
            final String str4222 = charSequence;
            final ArrayList arrayList4222 = Y;
            final fj fjVar4222 = this.s;
            final boolean z11222 = this.w;
            final sh.f fVar3222 = fVar;
            final int i16222 = intValue;
            final int i17222 = this.x;
            final int i18222 = this.y;
            final TL_stories.StoryItem storyItem222 = this.E;
            final bw bwVar222 = this.F;
            final long j13222 = this.G;
            final boolean z12222 = this.H;
            final long j14222 = this.I;
            g0.g3(new Runnable() { // from class: org.telegram.messenger.yw
                @Override // java.lang.Runnable
                public final void run() {
                    fj fjVar5 = fj.this;
                    c cVar2 = cVar;
                    TLRPC.TL_document tL_document3 = tL_document2;
                    fj fjVar6 = fjVar;
                    HashMap hashMap2 = hashMap;
                    String str5 = str;
                    if (fjVar5 != null) {
                        zy.C(cVar2.a).t(fjVar5, null, null, null, tL_document3, fjVar6.k.attachPath, null, hashMap2, false, false, str5);
                        return;
                    }
                    xy e10 = xy.e(tL_document3, null, fjVar6.k.attachPath, j11, fjVar3222, fjVar4222, str4222, arrayList4222, hashMap2, z11222, i17222, i18222, 0, str5, false);
                    e10.H = storyItem222;
                    e10.K = bwVar222;
                    e10.O = j13222;
                    e10.L = z12222;
                    e10.Q = j14222;
                    e10.j = fVar3222;
                    e10.k = i16222;
                    zy.C(cVar2.a).r0(e10);
                }
            });
            i12++;
            fVar2 = fVar3222;
            size = size;
            j10 = j12222;
            i13 = i15222;
            arrayList2 = arrayList;
            i11 = 1;
        }
        Runnable runnable = this.J;
        if (runnable != null) {
            g0.g3(runnable);
        }
    }
}
