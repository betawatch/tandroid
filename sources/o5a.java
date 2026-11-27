// default package

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class o5a implements Runnable {
    public final /* synthetic */ TL_stories.StoryItem E;
    public final /* synthetic */ c5a F;
    public final /* synthetic */ long G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ long I;
    public final /* synthetic */ r5a J;
    public final /* synthetic */ ki8 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ long c;
    public final /* synthetic */ k5 d;
    public final /* synthetic */ CharSequence e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ r47 n;
    public final /* synthetic */ r47 r;
    public final /* synthetic */ r47 s;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;

    public /* synthetic */ o5a(ki8 ki8Var, ArrayList arrayList, long j, k5 k5Var, CharSequence charSequence, boolean z, ArrayList arrayList2, r47 r47Var, r47 r47Var2, r47 r47Var3, boolean z2, int i, int i2, TL_stories.StoryItem storyItem, c5a c5aVar, long j2, boolean z3, long j3, r5a r5aVar) {
        this.a = ki8Var;
        this.b = arrayList;
        this.c = j;
        this.d = k5Var;
        this.e = charSequence;
        this.f = z;
        this.h = arrayList2;
        this.n = r47Var;
        this.r = r47Var2;
        this.s = r47Var3;
        this.w = z2;
        this.x = i;
        this.y = i2;
        this.E = storyItem;
        this.F = c5aVar;
        this.G = j2;
        this.H = z3;
        this.I = j3;
        this.J = r5aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0162, code lost:
    
        if (r15 == (r11 - 1)) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c7  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        boolean z;
        int i;
        int i2;
        String str;
        TLRPC.TL_document tL_document;
        TLRPC.TL_document tL_document2;
        int i3;
        TLRPC.TL_document tL_document3;
        TLRPC.TL_document tL_document4;
        int i4;
        final r47 r47Var;
        final long j2;
        String str2;
        final ArrayList arrayList;
        int i5;
        Bitmap bitmap;
        ki8 ki8Var = this.a;
        int i6 = 1;
        if (ki8Var != null) {
            j = ki8Var.c;
            z = true;
        } else {
            j = 0;
            z = false;
        }
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        long j3 = j != 0 ? j : 0L;
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            r47 r47Var2 = (r47) arrayList2.get(i7);
            String str3 = r47Var2.k.attachPath;
            File file = new File(str3);
            long j4 = this.c;
            boolean B = wf3.B(j4);
            if (!B && size > i6 && i8 % 10 == 0 && ki8Var == null) {
                j3 = Utilities.b.nextLong();
                i8 = 0;
            }
            long j5 = j3;
            if (str3 == null || str3.length() <= 0) {
                i = i6;
                i2 = i7;
            } else {
                StringBuilder l = c00.l(str3, MediaStreamTrack.AUDIO_TRACK_KIND);
                i = i6;
                i2 = i7;
                l.append(file.length());
                str3 = l.toString();
            }
            final k5 k5Var = this.d;
            if (!B && !TextUtils.isEmpty(str3) && !z) {
                Object[] g0 = kf7.a0(k5Var.a).g0(!B ? i : 4, str3);
                if (g0 != null) {
                    Object obj = g0[0];
                    if (obj instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) obj;
                        str = (String) g0[i];
                        r7a.v(k5Var, B, tL_document, str3, null, 0L, false);
                        if (tL_document == null) {
                            tL_document = (TLRPC.TL_document) r47Var2.k.media.document;
                        }
                        tL_document2 = tL_document;
                        if (tL_document2 != null && tL_document2.thumbs.isEmpty()) {
                            h00 a = h00.a(file);
                            bitmap = a == null ? a.o : null;
                            if (bitmap != null) {
                                i3 = i;
                                TLRPC.PhotoSize U = in5.U(bitmap, 132.0f, 132.0f, 55, B);
                                if (U != null) {
                                    tL_document2.thumbs.add(U);
                                    tL_document2.flags |= 1;
                                }
                                bitmap.recycle();
                                if (B) {
                                    tL_document3 = tL_document2;
                                    if (uc7.s1(k5Var.a).a1(Integer.valueOf((int) (j4 & 4294967295L))) == null) {
                                        return;
                                    }
                                } else {
                                    tL_document3 = tL_document2;
                                }
                                int i9 = i3;
                                CharSequence[] charSequenceArr = new CharSequence[i9];
                                charSequenceArr[0] = this.e;
                                if (i2 == 0) {
                                    ArrayList Y = ls6.d0(k5Var.a).Y(charSequenceArr, i9, i9);
                                    str2 = charSequenceArr[0].toString();
                                    tL_document4 = tL_document3;
                                    r47Var = r47Var2;
                                    arrayList = Y;
                                    i4 = size;
                                    j2 = j4;
                                } else {
                                    tL_document4 = tL_document3;
                                    i4 = size;
                                    r47Var = r47Var2;
                                    j2 = j4;
                                    str2 = null;
                                    arrayList = null;
                                }
                                int i10 = i8;
                                final HashMap hashMap = new HashMap();
                                if (str3 != null) {
                                    hashMap.put("originalPath", str3);
                                }
                                if (str != null) {
                                    hashMap.put("parentObject", str);
                                }
                                int i11 = i10 + 1;
                                hashMap.put("groupId", String.valueOf(j5));
                                if (this.f) {
                                    i5 = i2;
                                } else {
                                    if (ki8Var == null && i11 == 10) {
                                        i5 = i2;
                                    } else {
                                        i5 = i2;
                                    }
                                    hashMap.put("final", "1");
                                }
                                ArrayList arrayList3 = this.h;
                                final int intValue = arrayList3 != null ? ((Integer) arrayList3.get(i5)).intValue() : 0;
                                final ki8 ki8Var2 = ki8Var;
                                ArrayList arrayList4 = arrayList2;
                                final String str4 = str;
                                final r47 r47Var3 = this.n;
                                final r47 r47Var4 = this.r;
                                int i12 = i4;
                                final r47 r47Var5 = this.s;
                                final boolean z2 = this.w;
                                int i13 = i5;
                                final int i14 = this.x;
                                final int i15 = this.y;
                                final TL_stories.StoryItem storyItem = this.E;
                                final c5a c5aVar = this.F;
                                final long j6 = this.G;
                                final boolean z3 = this.H;
                                final long j7 = this.I;
                                final String str5 = str2;
                                final TLRPC.TL_document tL_document5 = tL_document4;
                                hl.c3(new Runnable() { // from class: a6a
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        r47 r47Var6 = r47.this;
                                        k5 k5Var2 = k5Var;
                                        TLRPC.TL_document tL_document6 = tL_document5;
                                        r47 r47Var7 = r47Var;
                                        HashMap hashMap2 = hashMap;
                                        String str6 = str4;
                                        if (r47Var6 != null) {
                                            r7a.B(k5Var2.a).s(r47Var6, null, null, null, tL_document6, r47Var7.k.attachPath, null, hashMap2, false, false, str6);
                                            return;
                                        }
                                        p7a e = p7a.e(tL_document6, null, r47Var7.k.attachPath, j2, r47Var4, r47Var5, str5, arrayList, hashMap2, z2, i14, i15, 0, str6, false);
                                        e.H = storyItem;
                                        e.K = c5aVar;
                                        e.O = j6;
                                        e.L = z3;
                                        e.Q = j7;
                                        e.j = ki8Var2;
                                        e.k = intValue;
                                        r7a.B(k5Var2.a).q0(e);
                                    }
                                });
                                i7 = i13 + 1;
                                ki8Var = ki8Var2;
                                j3 = j5;
                                size = i12;
                                i8 = i11;
                                arrayList2 = arrayList4;
                                i6 = 1;
                            }
                        }
                        i3 = i;
                        if (B) {
                        }
                        int i92 = i3;
                        CharSequence[] charSequenceArr2 = new CharSequence[i92];
                        charSequenceArr2[0] = this.e;
                        if (i2 == 0) {
                        }
                        int i102 = i8;
                        final HashMap hashMap2 = new HashMap();
                        if (str3 != null) {
                        }
                        if (str != null) {
                        }
                        int i112 = i102 + 1;
                        hashMap2.put("groupId", String.valueOf(j5));
                        if (this.f) {
                        }
                        ArrayList arrayList32 = this.h;
                        if (arrayList32 != null) {
                        }
                        final ki8 ki8Var22 = ki8Var;
                        ArrayList arrayList42 = arrayList2;
                        final String str42 = str;
                        final r47 r47Var32 = this.n;
                        final r47 r47Var42 = this.r;
                        int i122 = i4;
                        final r47 r47Var52 = this.s;
                        final boolean z22 = this.w;
                        int i132 = i5;
                        final int i142 = this.x;
                        final int i152 = this.y;
                        final TL_stories.StoryItem storyItem2 = this.E;
                        final c5a c5aVar2 = this.F;
                        final long j62 = this.G;
                        final boolean z32 = this.H;
                        final long j72 = this.I;
                        final String str52 = str2;
                        final TLRPC.TL_document tL_document52 = tL_document4;
                        hl.c3(new Runnable() { // from class: a6a
                            @Override // java.lang.Runnable
                            public final void run() {
                                r47 r47Var6 = r47.this;
                                k5 k5Var2 = k5Var;
                                TLRPC.TL_document tL_document6 = tL_document52;
                                r47 r47Var7 = r47Var;
                                HashMap hashMap22 = hashMap2;
                                String str6 = str42;
                                if (r47Var6 != null) {
                                    r7a.B(k5Var2.a).s(r47Var6, null, null, null, tL_document6, r47Var7.k.attachPath, null, hashMap22, false, false, str6);
                                    return;
                                }
                                p7a e = p7a.e(tL_document6, null, r47Var7.k.attachPath, j2, r47Var42, r47Var52, str52, arrayList, hashMap22, z22, i142, i152, 0, str6, false);
                                e.H = storyItem2;
                                e.K = c5aVar2;
                                e.O = j62;
                                e.L = z32;
                                e.Q = j72;
                                e.j = ki8Var22;
                                e.k = intValue;
                                r7a.B(k5Var2.a).q0(e);
                            }
                        });
                        i7 = i132 + 1;
                        ki8Var = ki8Var22;
                        j3 = j5;
                        size = i122;
                        i8 = i112;
                        arrayList2 = arrayList42;
                        i6 = 1;
                    }
                }
            }
            str = null;
            tL_document = null;
            if (tL_document == null) {
            }
            tL_document2 = tL_document;
            if (tL_document2 != null) {
                h00 a2 = h00.a(file);
                if (a2 == null) {
                }
                if (bitmap != null) {
                }
            }
            i3 = i;
            if (B) {
            }
            int i922 = i3;
            CharSequence[] charSequenceArr22 = new CharSequence[i922];
            charSequenceArr22[0] = this.e;
            if (i2 == 0) {
            }
            int i1022 = i8;
            final HashMap hashMap22 = new HashMap();
            if (str3 != null) {
            }
            if (str != null) {
            }
            int i1122 = i1022 + 1;
            hashMap22.put("groupId", String.valueOf(j5));
            if (this.f) {
            }
            ArrayList arrayList322 = this.h;
            if (arrayList322 != null) {
            }
            final ki8 ki8Var222 = ki8Var;
            ArrayList arrayList422 = arrayList2;
            final String str422 = str;
            final r47 r47Var322 = this.n;
            final r47 r47Var422 = this.r;
            int i1222 = i4;
            final r47 r47Var522 = this.s;
            final boolean z222 = this.w;
            int i1322 = i5;
            final int i1422 = this.x;
            final int i1522 = this.y;
            final TL_stories.StoryItem storyItem22 = this.E;
            final c5a c5aVar22 = this.F;
            final long j622 = this.G;
            final boolean z322 = this.H;
            final long j722 = this.I;
            final String str522 = str2;
            final TLRPC.TL_document tL_document522 = tL_document4;
            hl.c3(new Runnable() { // from class: a6a
                @Override // java.lang.Runnable
                public final void run() {
                    r47 r47Var6 = r47.this;
                    k5 k5Var2 = k5Var;
                    TLRPC.TL_document tL_document6 = tL_document522;
                    r47 r47Var7 = r47Var;
                    HashMap hashMap222 = hashMap22;
                    String str6 = str422;
                    if (r47Var6 != null) {
                        r7a.B(k5Var2.a).s(r47Var6, null, null, null, tL_document6, r47Var7.k.attachPath, null, hashMap222, false, false, str6);
                        return;
                    }
                    p7a e = p7a.e(tL_document6, null, r47Var7.k.attachPath, j2, r47Var422, r47Var522, str522, arrayList, hashMap222, z222, i1422, i1522, 0, str6, false);
                    e.H = storyItem22;
                    e.K = c5aVar22;
                    e.O = j622;
                    e.L = z322;
                    e.Q = j722;
                    e.j = ki8Var222;
                    e.k = intValue;
                    r7a.B(k5Var2.a).q0(e);
                }
            });
            i7 = i1322 + 1;
            ki8Var = ki8Var222;
            j3 = j5;
            size = i1222;
            i8 = i1122;
            arrayList2 = arrayList422;
            i6 = 1;
        }
        r5a r5aVar = this.J;
        if (r5aVar != null) {
            hl.c3(r5aVar);
        }
    }
}
