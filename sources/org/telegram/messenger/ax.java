package org.telegram.messenger;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ax implements Runnable {
    public final /* synthetic */ TL_stories.StoryItem D;
    public final /* synthetic */ sw E;
    public final /* synthetic */ long F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ long H;
    public final /* synthetic */ Runnable I;
    public final /* synthetic */ ih.i a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ long c;
    public final /* synthetic */ c d;
    public final /* synthetic */ CharSequence e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ jj n;
    public final /* synthetic */ jj r;
    public final /* synthetic */ jj s;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;

    public /* synthetic */ ax(ih.i iVar, ArrayList arrayList, long j10, c cVar, CharSequence charSequence, boolean z10, ArrayList arrayList2, jj jjVar, jj jjVar2, jj jjVar3, boolean z11, int i10, int i11, TL_stories.StoryItem storyItem, sw swVar, long j11, boolean z12, long j12, Runnable runnable) {
        this.a = iVar;
        this.b = arrayList;
        this.c = j10;
        this.d = cVar;
        this.e = charSequence;
        this.f = z10;
        this.h = arrayList2;
        this.n = jjVar;
        this.r = jjVar2;
        this.s = jjVar3;
        this.w = z11;
        this.x = i10;
        this.y = i11;
        this.D = storyItem;
        this.E = swVar;
        this.F = j11;
        this.G = z12;
        this.H = j12;
        this.I = runnable;
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
        int i10;
        ArrayList arrayList;
        ih.i iVar;
        final String str;
        TLRPC.TL_document tL_document;
        final TLRPC.TL_document tL_document2;
        int i11;
        final HashMap hashMap;
        Bitmap bitmap;
        ih.i iVar2 = this.a;
        long j10 = iVar2 != null ? iVar2.c : 0L;
        int i12 = 1;
        boolean z10 = iVar2 != null;
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        long j11 = j10 != 0 ? j10 : 0L;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            final jj jjVar = (jj) arrayList2.get(i13);
            String str2 = jjVar.k.attachPath;
            File file = new File(str2);
            final long j12 = this.c;
            boolean C = o5.C(j12);
            if (!C && size > i12 && i14 % 10 == 0 && iVar2 == null) {
                j11 = Utilities.b.nextLong();
                i14 = 0;
            }
            if (str2 == null || str2.length() <= 0) {
                i10 = i12;
                arrayList = arrayList2;
            } else {
                StringBuilder i15 = sc.e.i(str2, MediaStreamTrack.AUDIO_TRACK_KIND);
                i10 = i12;
                arrayList = arrayList2;
                i15.append(file.length());
                str2 = i15.toString();
            }
            final c cVar = this.d;
            if (!C && !TextUtils.isEmpty(str2) && !z10) {
                Object[] g02 = hs.a0(cVar.a).g0(!C ? i10 : 4, str2);
                if (g02 != null) {
                    Object obj = g02[0];
                    iVar = iVar2;
                    if (obj instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) obj;
                        String str3 = (String) g02[i10];
                        qz.w(cVar, C, tL_document, str2, null, 0L, false);
                        str = str3;
                        if (tL_document == null) {
                            tL_document = (TLRPC.TL_document) jjVar.k.media.document;
                        }
                        tL_document2 = tL_document;
                        if (tL_document2 != null && tL_document2.thumbs.isEmpty()) {
                            cf.a a2 = cf.a.a(file);
                            bitmap = a2 == null ? a2.o : null;
                            if (bitmap != null) {
                                i11 = i14;
                                TLRPC.PhotoSize Z = hc.Z(bitmap, 132.0f, 132.0f, 55, C);
                                if (Z != null) {
                                    tL_document2.thumbs.add(Z);
                                    tL_document2.flags |= 1;
                                }
                                bitmap.recycle();
                                if (!C && vp.r1(cVar.a).Z0(Integer.valueOf((int) (4294967295L & j12))) == null) {
                                    return;
                                }
                                int i16 = i10;
                                CharSequence[] charSequenceArr = new CharSequence[i16];
                                charSequenceArr[0] = this.e;
                                ArrayList W = i13 != 0 ? ui.b0(cVar.a).W(charSequenceArr, i16, i16) : null;
                                String charSequence = i13 != 0 ? charSequenceArr[0].toString() : null;
                                hashMap = new HashMap();
                                if (str2 != null) {
                                    hashMap.put("originalPath", str2);
                                }
                                if (str != null) {
                                    hashMap.put("parentObject", str);
                                }
                                int i17 = i11 + 1;
                                hashMap.put("groupId", "" + j11);
                                if (!this.f && ((iVar == null && i17 == 10) || i13 == size - 1)) {
                                    hashMap.put("final", "1");
                                }
                                ArrayList arrayList3 = this.h;
                                int intValue = arrayList3 == null ? ((Integer) arrayList3.get(i13)).intValue() : 0;
                                long j13 = j11;
                                final jj jjVar2 = this.n;
                                final jj jjVar3 = this.r;
                                final String str4 = charSequence;
                                final ArrayList arrayList4 = W;
                                final jj jjVar4 = this.s;
                                final boolean z11 = this.w;
                                final ih.i iVar3 = iVar;
                                final int i18 = intValue;
                                final int i19 = this.x;
                                final int i20 = this.y;
                                final TL_stories.StoryItem storyItem = this.D;
                                final sw swVar = this.E;
                                final long j14 = this.F;
                                final boolean z12 = this.G;
                                final long j15 = this.H;
                                i0.g3(new Runnable() { // from class: org.telegram.messenger.rx
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        jj jjVar5 = jj.this;
                                        c cVar2 = cVar;
                                        TLRPC.TL_document tL_document3 = tL_document2;
                                        jj jjVar6 = jjVar;
                                        HashMap hashMap2 = hashMap;
                                        String str5 = str;
                                        if (jjVar5 != null) {
                                            qz.C(cVar2.a).t(jjVar5, null, null, null, tL_document3, jjVar6.k.attachPath, null, hashMap2, false, false, str5);
                                            return;
                                        }
                                        oz e = oz.e(tL_document3, null, jjVar6.k.attachPath, j12, jjVar3, jjVar4, str4, arrayList4, hashMap2, z11, i19, i20, 0, str5, false);
                                        e.H = storyItem;
                                        e.K = swVar;
                                        e.O = j14;
                                        e.L = z12;
                                        e.Q = j15;
                                        e.j = iVar3;
                                        e.k = i18;
                                        qz.C(cVar2.a).r0(e);
                                    }
                                });
                                i13++;
                                iVar2 = iVar3;
                                size = size;
                                j11 = j13;
                                i14 = i17;
                                arrayList2 = arrayList;
                                i12 = 1;
                            }
                        }
                        i11 = i14;
                        if (!C) {
                        }
                        int i162 = i10;
                        CharSequence[] charSequenceArr2 = new CharSequence[i162];
                        charSequenceArr2[0] = this.e;
                        if (i13 != 0) {
                        }
                        if (i13 != 0) {
                        }
                        hashMap = new HashMap();
                        if (str2 != null) {
                        }
                        if (str != null) {
                        }
                        int i172 = i11 + 1;
                        hashMap.put("groupId", "" + j11);
                        if (!this.f) {
                            hashMap.put("final", "1");
                        }
                        ArrayList arrayList32 = this.h;
                        if (arrayList32 == null) {
                        }
                        long j132 = j11;
                        final jj jjVar22 = this.n;
                        final jj jjVar32 = this.r;
                        final String str42 = charSequence;
                        final ArrayList arrayList42 = W;
                        final jj jjVar42 = this.s;
                        final boolean z112 = this.w;
                        final ih.i iVar32 = iVar;
                        final int i182 = intValue;
                        final int i192 = this.x;
                        final int i202 = this.y;
                        final TL_stories.StoryItem storyItem2 = this.D;
                        final sw swVar2 = this.E;
                        final long j142 = this.F;
                        final boolean z122 = this.G;
                        final long j152 = this.H;
                        i0.g3(new Runnable() { // from class: org.telegram.messenger.rx
                            @Override // java.lang.Runnable
                            public final void run() {
                                jj jjVar5 = jj.this;
                                c cVar2 = cVar;
                                TLRPC.TL_document tL_document3 = tL_document2;
                                jj jjVar6 = jjVar;
                                HashMap hashMap2 = hashMap;
                                String str5 = str;
                                if (jjVar5 != null) {
                                    qz.C(cVar2.a).t(jjVar5, null, null, null, tL_document3, jjVar6.k.attachPath, null, hashMap2, false, false, str5);
                                    return;
                                }
                                oz e = oz.e(tL_document3, null, jjVar6.k.attachPath, j12, jjVar32, jjVar42, str42, arrayList42, hashMap2, z112, i192, i202, 0, str5, false);
                                e.H = storyItem2;
                                e.K = swVar2;
                                e.O = j142;
                                e.L = z122;
                                e.Q = j152;
                                e.j = iVar32;
                                e.k = i182;
                                qz.C(cVar2.a).r0(e);
                            }
                        });
                        i13++;
                        iVar2 = iVar32;
                        size = size;
                        j11 = j132;
                        i14 = i172;
                        arrayList2 = arrayList;
                        i12 = 1;
                    }
                    str = null;
                    tL_document = null;
                    if (tL_document == null) {
                    }
                    tL_document2 = tL_document;
                    if (tL_document2 != null) {
                        cf.a a22 = cf.a.a(file);
                        if (a22 == null) {
                        }
                        if (bitmap != null) {
                        }
                    }
                    i11 = i14;
                    if (!C) {
                    }
                    int i1622 = i10;
                    CharSequence[] charSequenceArr22 = new CharSequence[i1622];
                    charSequenceArr22[0] = this.e;
                    if (i13 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    hashMap = new HashMap();
                    if (str2 != null) {
                    }
                    if (str != null) {
                    }
                    int i1722 = i11 + 1;
                    hashMap.put("groupId", "" + j11);
                    if (!this.f) {
                    }
                    ArrayList arrayList322 = this.h;
                    if (arrayList322 == null) {
                    }
                    long j1322 = j11;
                    final jj jjVar222 = this.n;
                    final jj jjVar322 = this.r;
                    final String str422 = charSequence;
                    final ArrayList arrayList422 = W;
                    final jj jjVar422 = this.s;
                    final boolean z1122 = this.w;
                    final ih.i iVar322 = iVar;
                    final int i1822 = intValue;
                    final int i1922 = this.x;
                    final int i2022 = this.y;
                    final TL_stories.StoryItem storyItem22 = this.D;
                    final sw swVar22 = this.E;
                    final long j1422 = this.F;
                    final boolean z1222 = this.G;
                    final long j1522 = this.H;
                    i0.g3(new Runnable() { // from class: org.telegram.messenger.rx
                        @Override // java.lang.Runnable
                        public final void run() {
                            jj jjVar5 = jj.this;
                            c cVar2 = cVar;
                            TLRPC.TL_document tL_document3 = tL_document2;
                            jj jjVar6 = jjVar;
                            HashMap hashMap2 = hashMap;
                            String str5 = str;
                            if (jjVar5 != null) {
                                qz.C(cVar2.a).t(jjVar5, null, null, null, tL_document3, jjVar6.k.attachPath, null, hashMap2, false, false, str5);
                                return;
                            }
                            oz e = oz.e(tL_document3, null, jjVar6.k.attachPath, j12, jjVar322, jjVar422, str422, arrayList422, hashMap2, z1122, i1922, i2022, 0, str5, false);
                            e.H = storyItem22;
                            e.K = swVar22;
                            e.O = j1422;
                            e.L = z1222;
                            e.Q = j1522;
                            e.j = iVar322;
                            e.k = i1822;
                            qz.C(cVar2.a).r0(e);
                        }
                    });
                    i13++;
                    iVar2 = iVar322;
                    size = size;
                    j11 = j1322;
                    i14 = i1722;
                    arrayList2 = arrayList;
                    i12 = 1;
                }
            }
            iVar = iVar2;
            str = null;
            tL_document = null;
            if (tL_document == null) {
            }
            tL_document2 = tL_document;
            if (tL_document2 != null) {
            }
            i11 = i14;
            if (!C) {
            }
            int i16222 = i10;
            CharSequence[] charSequenceArr222 = new CharSequence[i16222];
            charSequenceArr222[0] = this.e;
            if (i13 != 0) {
            }
            if (i13 != 0) {
            }
            hashMap = new HashMap();
            if (str2 != null) {
            }
            if (str != null) {
            }
            int i17222 = i11 + 1;
            hashMap.put("groupId", "" + j11);
            if (!this.f) {
            }
            ArrayList arrayList3222 = this.h;
            if (arrayList3222 == null) {
            }
            long j13222 = j11;
            final jj jjVar2222 = this.n;
            final jj jjVar3222 = this.r;
            final String str4222 = charSequence;
            final ArrayList arrayList4222 = W;
            final jj jjVar4222 = this.s;
            final boolean z11222 = this.w;
            final ih.i iVar3222 = iVar;
            final int i18222 = intValue;
            final int i19222 = this.x;
            final int i20222 = this.y;
            final TL_stories.StoryItem storyItem222 = this.D;
            final sw swVar222 = this.E;
            final long j14222 = this.F;
            final boolean z12222 = this.G;
            final long j15222 = this.H;
            i0.g3(new Runnable() { // from class: org.telegram.messenger.rx
                @Override // java.lang.Runnable
                public final void run() {
                    jj jjVar5 = jj.this;
                    c cVar2 = cVar;
                    TLRPC.TL_document tL_document3 = tL_document2;
                    jj jjVar6 = jjVar;
                    HashMap hashMap2 = hashMap;
                    String str5 = str;
                    if (jjVar5 != null) {
                        qz.C(cVar2.a).t(jjVar5, null, null, null, tL_document3, jjVar6.k.attachPath, null, hashMap2, false, false, str5);
                        return;
                    }
                    oz e = oz.e(tL_document3, null, jjVar6.k.attachPath, j12, jjVar3222, jjVar4222, str4222, arrayList4222, hashMap2, z11222, i19222, i20222, 0, str5, false);
                    e.H = storyItem222;
                    e.K = swVar222;
                    e.O = j14222;
                    e.L = z12222;
                    e.Q = j15222;
                    e.j = iVar3222;
                    e.k = i18222;
                    qz.C(cVar2.a).r0(e);
                }
            });
            i13++;
            iVar2 = iVar3222;
            size = size;
            j11 = j13222;
            i14 = i17222;
            arrayList2 = arrayList;
            i12 = 1;
        }
        Runnable runnable = this.I;
        if (runnable != null) {
            i0.g3(runnable);
        }
    }
}
