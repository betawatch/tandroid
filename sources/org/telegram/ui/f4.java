package org.telegram.ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f4 extends org.telegram.ui.Components.sk0 {
    public TLRPC.WebPage E;
    public TL_iv.pageBlockChannel F;
    public boolean G;
    public int H;
    public final boolean I;
    public int[] J;
    public int K;
    public final /* synthetic */ h4 M;
    public final Context c;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final HashMap h = new HashMap();
    public final HashMap n = new HashMap();
    public final HashMap r = new HashMap();
    public final HashMap s = new HashMap();
    public final ArrayList w = new ArrayList();
    public final HashMap x = new HashMap();
    public final ArrayList y = new ArrayList();
    public final HashMap D = new HashMap();
    public final rr0 L = new rr0(this, 11);

    public f4(h4 h4Var, Context context, boolean z10) {
        this.M = h4Var;
        this.c = context;
        this.I = z10;
    }

    public static int I(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            return 0;
        }
        if ((pageBlock instanceof TL_iv.pageBlockHeader) || h4.I(pageBlock)) {
            return 1;
        }
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            return 2;
        }
        if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            return 3;
        }
        if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
            return 4;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            return 5;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return 6;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return 7;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            return 8;
        }
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            return 9;
        }
        if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
            return 10;
        }
        if (pageBlock instanceof TL_iv.pageBlockTitle) {
            return 11;
        }
        if (pageBlock instanceof x3) {
            return 12;
        }
        if (pageBlock instanceof TL_iv.pageBlockFooter) {
            return 13;
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            return 14;
        }
        if (pageBlock instanceof TL_iv.pageBlockSubheader) {
            return 15;
        }
        if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            return 16;
        }
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            return 17;
        }
        if (pageBlock instanceof TL_iv.pageBlockChannel) {
            return 18;
        }
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            return 19;
        }
        if (pageBlock instanceof TL_iv.pageBlockKicker) {
            return 20;
        }
        if (pageBlock instanceof z3) {
            return 21;
        }
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            return 22;
        }
        if (pageBlock instanceof b4) {
            return 23;
        }
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            return 24;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            return 25;
        }
        if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
            return 26;
        }
        if (pageBlock instanceof c4) {
            return 28;
        }
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            return 92;
        }
        if (pageBlock instanceof v3) {
            return I(((v3) pageBlock).b);
        }
        if (pageBlock instanceof TL_iv.pageBlockCover) {
            return I(((TL_iv.pageBlockCover) pageBlock).cover);
        }
        return 100;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 23 || i10 == 24;
    }

    public final void E(TL_iv.PageBlock pageBlock, f4 f4Var) {
        boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
        ArrayList arrayList = this.f;
        int i10 = 0;
        if (z10) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            TLRPC.Photo e = e4.e(this.E, pageblockphoto.photo_id);
            if (e != null) {
                pageblockphoto.thumb = org.telegram.messenger.b8.w(e.sizes, 56, true, null, false);
                pageblockphoto.thumbObject = e;
                arrayList.add(pageBlock);
                return;
            }
            return;
        }
        if ((pageBlock instanceof TL_iv.pageBlockVideo) && e4.g(f4Var.E, pageBlock)) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            TLRPC.Document a2 = e4.a(this.E, pageblockvideo.video_id);
            if (a2 != null) {
                pageblockvideo.thumb = org.telegram.messenger.b8.w(a2.thumbs, 56, true, null, false);
                pageblockvideo.thumbObject = a2;
                arrayList.add(pageBlock);
                return;
            }
            return;
        }
        boolean z11 = pageBlock instanceof TL_iv.pageBlockSlideshow;
        h4 h4Var = this.M;
        if (z11) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            int size = pageblockslideshow.items.size();
            while (i10 < size) {
                TL_iv.PageBlock pageBlock2 = pageblockslideshow.items.get(i10);
                pageBlock2.groupId = h4Var.Y;
                E(pageBlock2, f4Var);
                i10++;
            }
            h4Var.Y++;
            return;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockCollage)) {
            if (pageBlock instanceof TL_iv.pageBlockCover) {
                E(((TL_iv.pageBlockCover) pageBlock).cover, f4Var);
                return;
            }
            return;
        }
        TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
        int size2 = pageblockcollage.items.size();
        while (i10 < size2) {
            TL_iv.PageBlock pageBlock3 = pageblockcollage.items.get(i10);
            pageBlock3.groupId = h4Var.Y;
            E(pageBlock3, f4Var);
            i10++;
        }
        h4Var.Y++;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void F(org.telegram.ui.f4 r24, org.telegram.tgnet.tl.TL_iv.PageBlock r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f4.F(org.telegram.ui.f4, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, int):void");
    }

    public final void G(Object obj, TL_iv.PageBlock pageBlock) {
        if (obj instanceof TL_iv.textEmpty) {
            return;
        }
        HashMap hashMap = this.x;
        if (hashMap.containsKey(obj)) {
            return;
        }
        hashMap.put(obj, pageBlock);
        this.y.add(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:235:0x074f, code lost:
    
        if (r3[2] > r3[3]) goto L208;
     */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(int i10, s4.c1 c1Var, TL_iv.PageBlock pageBlock, int i11, int i12, boolean z10) {
        TLRPC.Photo photo;
        int i13;
        float f7;
        float f10;
        i1 i1Var;
        int i14;
        int i15;
        float f11;
        org.telegram.messenger.bj bjVar;
        float f12;
        int i16;
        TLRPC.Document a2;
        TLRPC.PhotoSize w9;
        float f13;
        float f14;
        boolean z11;
        boolean z12 = pageBlock instanceof TL_iv.pageBlockCover;
        TL_iv.PageBlock pageBlock2 = z12 ? ((TL_iv.pageBlockCover) pageBlock).cover : pageBlock instanceof v3 ? ((v3) pageBlock).b : pageBlock;
        if (i10 == 92) {
            ((y1) c1Var.a).setBlock((TL_iv.pageBlockMath) pageBlock2);
            return;
        }
        if (i10 == 100) {
            ((TextView) c1Var.a).setText("unsupported block " + pageBlock2);
            return;
        }
        switch (i10) {
            case 0:
                ((a2) c1Var.a).setBlock((TL_iv.pageBlockParagraph) pageBlock2);
                break;
            case 1:
                ((u1) c1Var.a).setBlock(pageBlock2);
                break;
            case 2:
                break;
            case 3:
                r1 r1Var = (r1) c1Var.a;
                TL_iv.pageBlockEmbed pageblockembed = (TL_iv.pageBlockEmbed) pageBlock2;
                TL_iv.pageBlockEmbed pageblockembed2 = r1Var.w;
                r1Var.w = pageblockembed;
                q1 q1Var = r1Var.a;
                if (q1Var != null) {
                    photo = null;
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, q1Var, null);
                } else {
                    photo = null;
                }
                TL_iv.pageBlockEmbed pageblockembed3 = r1Var.w;
                if (pageblockembed2 != pageblockembed3) {
                    r1Var.s = false;
                    q1 q1Var2 = r1Var.a;
                    if (q1Var2 != null) {
                        if (pageblockembed3.allow_scrolling) {
                            q1Var2.setVerticalScrollBarEnabled(true);
                            r1Var.a.setHorizontalScrollBarEnabled(true);
                        } else {
                            q1Var2.setVerticalScrollBarEnabled(false);
                            r1Var.a.setHorizontalScrollBarEnabled(false);
                        }
                    }
                    r1Var.r = 0;
                    q1 q1Var3 = r1Var.a;
                    if (q1Var3 != null) {
                        try {
                            q1Var3.loadUrl("about:blank");
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                    }
                    try {
                        TL_iv.pageBlockEmbed pageblockembed4 = r1Var.w;
                        String str = pageblockembed4.html;
                        if (str != null) {
                            q1 q1Var4 = r1Var.a;
                            if (q1Var4 != null) {
                                q1Var4.loadDataWithBaseURL("https://telegram.org/embed", str, "text/html", "UTF-8", null);
                                r1Var.a.setVisibility(0);
                            }
                            org.telegram.ui.Components.m81 m81Var = r1Var.b;
                            if (m81Var != null) {
                                m81Var.setVisibility(4);
                                r1Var.b.g(null, null, null, null, false);
                            }
                        } else {
                            long j10 = pageblockembed4.poster_photo_id;
                            if (r1Var.b.g(pageblockembed.url, j10 != 0 ? e4.e(r1Var.x.E, j10) : photo, r1Var.x.E, null, false)) {
                                q1 q1Var5 = r1Var.a;
                                if (q1Var5 != null) {
                                    q1Var5.setVisibility(4);
                                    r1Var.a.stopLoading();
                                    r1Var.a.loadUrl("about:blank");
                                }
                                org.telegram.ui.Components.m81 m81Var2 = r1Var.b;
                                if (m81Var2 != null) {
                                    m81Var2.setVisibility(0);
                                }
                            } else {
                                q1 q1Var6 = r1Var.a;
                                if (q1Var6 != null) {
                                    q1Var6.setVisibility(0);
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("Referer", org.telegram.messenger.w0.b.getPackageName());
                                    r1Var.a.loadUrl(r1Var.w.url, hashMap);
                                }
                                org.telegram.ui.Components.m81 m81Var3 = r1Var.b;
                                if (m81Var3 != null) {
                                    m81Var3.setVisibility(4);
                                    r1Var.b.g(null, null, null, null, false);
                                }
                            }
                        }
                    } catch (Exception e7) {
                        org.telegram.messenger.f8.g(e7, true);
                    }
                }
                r1Var.requestLayout();
                break;
            case 4:
                ((q2) c1Var.a).setBlock((TL_iv.pageBlockSubtitle) pageBlock2);
                break;
            case 5:
                v2 v2Var = (v2) c1Var.a;
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock2;
                v2Var.b(pageblockvideo, (w2) this.M.D.f(pageblockvideo.video_id), z10, i11 == 0);
                TL_iv.pageBlockChannel pageblockchannel = this.F;
                c1 c1Var2 = v2Var.s;
                v2Var.N = pageBlock;
                if (pageblockchannel != null && z12) {
                    c1Var2.setBlock(pageblockchannel);
                    c1Var2.setVisibility(0);
                    break;
                }
                break;
            case 6:
                ((g2) c1Var.a).setBlock((TL_iv.pageBlockPullquote) pageBlock2);
                break;
            case 7:
                ((b1) c1Var.a).setBlock((TL_iv.pageBlockBlockquote) pageBlock2);
                break;
            case 8:
                o2 o2Var = (o2) c1Var.a;
                o2Var.e = (TL_iv.pageBlockSlideshow) pageBlock2;
                o2Var.c.g();
                j2 j2Var = o2Var.b;
                j2Var.x(0, false);
                j2Var.forceLayout();
                o2Var.requestLayout();
                break;
            case 9:
                b2 b2Var = (b2) c1Var.a;
                b2Var.a((TL_iv.pageBlockPhoto) pageBlock2, this.E, z10, i11 == 0);
                b2Var.setParentBlock(pageBlock);
                break;
            case 10:
                ((a1) c1Var.a).setBlock((TL_iv.pageBlockAuthorDate) pageBlock2);
                break;
            case 11:
                ((t2) c1Var.a).setBlock((TL_iv.pageBlockTitle) pageBlock2);
                break;
            case 12:
                ((w1) c1Var.a).setBlock((x3) pageBlock2);
                break;
            case 13:
                ((t1) c1Var.a).setBlock((TL_iv.pageBlockFooter) pageBlock2);
                break;
            case 14:
                ((f2) c1Var.a).setBlock((TL_iv.pageBlockPreformatted) pageBlock2);
                break;
            case 15:
                ((p2) c1Var.a).setBlock((TL_iv.pageBlockSubheader) pageBlock2);
                break;
            case 16:
                ((s1) c1Var.a).setBlock((TL_iv.pageBlockEmbedPost) pageBlock2);
                break;
            case 17:
                j1 j1Var = (j1) c1Var.a;
                TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock2;
                if (j1Var.s != pageblockcollage) {
                    j1Var.s = pageblockcollage;
                    i1 i1Var2 = j1Var.w;
                    int i17 = i1Var2.c;
                    ArrayList arrayList = i1Var2.a;
                    arrayList.clear();
                    HashMap hashMap2 = i1Var2.b;
                    hashMap2.clear();
                    j1 j1Var2 = i1Var2.d;
                    TL_iv.pageBlockCollage pageblockcollage2 = j1Var2.s;
                    f4 f4Var = j1Var2.x;
                    int size = pageblockcollage2.items.size();
                    if (size > 1) {
                        StringBuilder sb2 = new StringBuilder();
                        int i18 = 0;
                        boolean z13 = false;
                        float f15 = 1.0f;
                        while (i18 < size) {
                            TL_iv.PageBlock pageBlock3 = j1Var2.s.items.get(i18);
                            if (pageBlock3 instanceof TL_iv.pageBlockPhoto) {
                                TLRPC.Photo e10 = e4.e(f4Var.E, ((TL_iv.pageBlockPhoto) pageBlock3).photo_id);
                                if (e10 == null) {
                                    i18++;
                                } else {
                                    w9 = org.telegram.messenger.b8.w(e10.sizes, org.telegram.messenger.i0.Z0(false), false, null, false);
                                    org.telegram.messenger.bj bjVar2 = new org.telegram.messenger.bj();
                                    bjVar2.h = i18 != size + (-1);
                                    f13 = w9 != null ? 1.0f : w9.w / w9.h;
                                    bjVar2.g = f13;
                                    if (f13 <= 1.2f) {
                                        sb2.append("w");
                                    } else if (f13 < 0.8f) {
                                        sb2.append("n");
                                    } else {
                                        sb2.append("q");
                                    }
                                    f14 = bjVar2.g;
                                    f15 += f14;
                                    if (f14 > 2.0f) {
                                        z13 = true;
                                    }
                                    hashMap2.put(pageBlock3, bjVar2);
                                    arrayList.add(bjVar2);
                                    i18++;
                                }
                            } else {
                                if ((pageBlock3 instanceof TL_iv.pageBlockVideo) && (a2 = e4.a(f4Var.E, ((TL_iv.pageBlockVideo) pageBlock3).video_id)) != null) {
                                    w9 = org.telegram.messenger.b8.w(a2.thumbs, 90, false, null, false);
                                    org.telegram.messenger.bj bjVar22 = new org.telegram.messenger.bj();
                                    bjVar22.h = i18 != size + (-1);
                                    if (w9 != null) {
                                    }
                                    bjVar22.g = f13;
                                    if (f13 <= 1.2f) {
                                    }
                                    f14 = bjVar22.g;
                                    f15 += f14;
                                    if (f14 > 2.0f) {
                                    }
                                    hashMap2.put(pageBlock3, bjVar22);
                                    arrayList.add(bjVar22);
                                }
                                i18++;
                            }
                        }
                        float f16 = 1.0f;
                        int L = org.telegram.messenger.i0.L(120.0f);
                        float L2 = org.telegram.messenger.i0.L(120.0f);
                        Point point = org.telegram.messenger.i0.q;
                        float f17 = i17;
                        int min = (int) (L2 / (Math.min(point.x, point.y) / f17));
                        int L3 = (int) (org.telegram.messenger.i0.L(40.0f) / (Math.min(point.x, point.y) / f17));
                        float f18 = f17 / 814.0f;
                        float f19 = f15 / size;
                        if (z13 || !(size == 2 || size == 3 || size == 4)) {
                            i13 = size;
                            int size2 = arrayList.size();
                            float[] fArr = new float[size2];
                            int i19 = 0;
                            while (i19 < i13) {
                                if (f19 > 1.1f) {
                                    f11 = f16;
                                    fArr[i19] = Math.max(f11, ((org.telegram.messenger.bj) arrayList.get(i19)).g);
                                } else {
                                    f11 = f16;
                                    fArr[i19] = Math.min(f11, ((org.telegram.messenger.bj) arrayList.get(i19)).g);
                                }
                                fArr[i19] = Math.max(0.66667f, Math.min(1.7f, fArr[i19]));
                                i19++;
                                f16 = f11;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (int i20 = 1; i20 < size2; i20++) {
                                int i21 = size2 - i20;
                                if (i20 <= 3 && i21 <= 3) {
                                    float a10 = i1Var2.a(0, i20, fArr);
                                    float a11 = i1Var2.a(i20, size2, fArr);
                                    h1 h1Var = new h1();
                                    h1Var.a = new int[]{i20, i21};
                                    h1Var.b = new float[]{a10, a11};
                                    arrayList2.add(h1Var);
                                }
                            }
                            for (int i22 = 1; i22 < size2 - 1; i22++) {
                                int i23 = 1;
                                while (true) {
                                    int i24 = size2 - i22;
                                    if (i23 < i24) {
                                        int i25 = i24 - i23;
                                        if (i22 <= 3) {
                                            if (i23 <= (f19 < 0.85f ? 4 : 3) && i25 <= 3) {
                                                float a12 = i1Var2.a(0, i22, fArr);
                                                int i26 = i22 + i23;
                                                float a13 = i1Var2.a(i22, i26, fArr);
                                                float a14 = i1Var2.a(i26, size2, fArr);
                                                h1 h1Var2 = new h1();
                                                h1Var2.a = new int[]{i22, i23, i25};
                                                i15 = i17;
                                                h1Var2.b = new float[]{a12, a13, a14};
                                                arrayList2.add(h1Var2);
                                                i23++;
                                                i17 = i15;
                                            }
                                        }
                                        i15 = i17;
                                        i23++;
                                        i17 = i15;
                                    }
                                }
                            }
                            int i27 = i17;
                            for (int i28 = 1; i28 < size2 - 2; i28++) {
                                int i29 = 1;
                                while (true) {
                                    int i30 = size2 - i28;
                                    if (i29 < i30) {
                                        int i31 = 1;
                                        while (true) {
                                            int i32 = i30 - i29;
                                            if (i31 < i32) {
                                                int i33 = i32 - i31;
                                                if (i28 > 3 || i29 > 3 || i31 > 3 || i33 > 3) {
                                                    i1Var = i1Var2;
                                                    i14 = i30;
                                                } else {
                                                    float a15 = i1Var2.a(0, i28, fArr);
                                                    int i34 = i28 + i29;
                                                    float a16 = i1Var2.a(i28, i34, fArr);
                                                    i14 = i30;
                                                    int i35 = i34 + i31;
                                                    float a17 = i1Var2.a(i34, i35, fArr);
                                                    float a18 = i1Var2.a(i35, size2, fArr);
                                                    h1 h1Var3 = new h1();
                                                    h1Var3.a = new int[]{i28, i29, i31, i33};
                                                    i1Var = i1Var2;
                                                    h1Var3.b = new float[]{a15, a16, a17, a18};
                                                    arrayList2.add(h1Var3);
                                                }
                                                i31++;
                                                i30 = i14;
                                                i1Var2 = i1Var;
                                            }
                                        }
                                        i29++;
                                    }
                                }
                            }
                            float f20 = (i27 / 3) * 4;
                            int i36 = 0;
                            h1 h1Var4 = null;
                            float f21 = 0.0f;
                            while (i36 < arrayList2.size()) {
                                h1 h1Var5 = (h1) arrayList2.get(i36);
                                float f22 = Float.MAX_VALUE;
                                int i37 = 0;
                                float f23 = 0.0f;
                                while (true) {
                                    float[] fArr2 = h1Var5.b;
                                    float f24 = f20;
                                    if (i37 < fArr2.length) {
                                        float f25 = fArr2[i37];
                                        f23 += f25;
                                        if (f25 < f22) {
                                            f22 = f25;
                                        }
                                        i37++;
                                        f20 = f24;
                                    } else {
                                        float abs = Math.abs(f23 - f24);
                                        int[] iArr = h1Var5.a;
                                        if (iArr.length > 1) {
                                            int i38 = iArr[0];
                                            int i39 = iArr[1];
                                            if (i38 <= i39) {
                                                f7 = abs;
                                                if (iArr.length <= 2 || i39 <= iArr[2]) {
                                                    if (iArr.length > 3) {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                f7 = abs;
                                            }
                                            f10 = f7 * 1.2f;
                                            if (f22 < min) {
                                                f10 *= 1.5f;
                                            }
                                            if (h1Var4 != null || f10 < f21) {
                                                f21 = f10;
                                                h1Var4 = h1Var5;
                                            }
                                            i36++;
                                            f20 = f24;
                                        } else {
                                            f7 = abs;
                                        }
                                        f10 = f7;
                                        if (f22 < min) {
                                        }
                                        if (h1Var4 != null) {
                                        }
                                        f21 = f10;
                                        h1Var4 = h1Var5;
                                        i36++;
                                        f20 = f24;
                                    }
                                }
                            }
                            if (h1Var4 != null) {
                                int[] iArr2 = h1Var4.a;
                                int i40 = 0;
                                int i41 = 0;
                                while (i40 < iArr2.length) {
                                    int i42 = iArr2[i40];
                                    float f26 = h1Var4.b[i40];
                                    int i43 = i27;
                                    int i44 = 0;
                                    org.telegram.messenger.bj bjVar3 = null;
                                    while (i44 < i42) {
                                        int i45 = (int) (fArr[i41] * f26);
                                        i43 -= i45;
                                        org.telegram.messenger.bj bjVar4 = (org.telegram.messenger.bj) arrayList.get(i41);
                                        int i46 = i40 == 0 ? 4 : 0;
                                        int i47 = i41;
                                        if (i40 == iArr2.length - 1) {
                                            i46 |= 8;
                                        }
                                        if (i44 == 0) {
                                            i46 |= 1;
                                        }
                                        if (i44 == i42 - 1) {
                                            i46 |= 2;
                                            bjVar3 = bjVar4;
                                        }
                                        int i48 = i40;
                                        int i49 = i44;
                                        bjVar4.a(f26 / 814.0f, i49, i44, i48, i40, i45, i46);
                                        i44 = i49 + 1;
                                        i41 = i47 + 1;
                                        i40 = i48;
                                    }
                                    bjVar3.e += i43;
                                    bjVar3.i += i43;
                                    i40++;
                                    i41 = i41;
                                }
                            }
                        } else if (size == 2) {
                            org.telegram.messenger.bj bjVar5 = (org.telegram.messenger.bj) arrayList.get(0);
                            org.telegram.messenger.bj bjVar6 = (org.telegram.messenger.bj) arrayList.get(1);
                            String sb3 = sb2.toString();
                            if (sb3.equals("ww")) {
                                i16 = size;
                                f12 = f17;
                                if (f19 > f18 * 1.4d) {
                                    float f27 = bjVar5.g;
                                    float f28 = bjVar6.g;
                                    if (f27 - f28 < 0.2d) {
                                        float round = Math.round(Math.min(f12 / f27, Math.min(f12 / f28, 407.0f))) / 814.0f;
                                        bjVar5.a(round, 0, 0, 0, 0, i1Var2.c, 7);
                                        bjVar6.a(round, 0, 0, 1, 1, i1Var2.c, 11);
                                        i13 = i16;
                                    }
                                }
                                bjVar = bjVar6;
                            } else {
                                bjVar = bjVar6;
                                f12 = f17;
                                i16 = size;
                            }
                            if (sb3.equals("ww") || sb3.equals("qq")) {
                                int i50 = i17 / 2;
                                float f29 = i50;
                                float round2 = Math.round(Math.min(f29 / bjVar5.g, Math.min(f29 / bjVar.g, 814.0f))) / 814.0f;
                                bjVar5.a(round2, 0, 0, 0, 0, i50, 13);
                                bjVar.a(round2, 1, 1, 0, 0, i50, 14);
                            } else {
                                float f30 = bjVar5.g;
                                int max = (int) Math.max(f12 * 0.4f, Math.round((f12 / f30) / ((1.0f / bjVar.g) + (1.0f / f30))));
                                int i51 = i17 - max;
                                if (i51 < min) {
                                    max -= min - i51;
                                } else {
                                    min = i51;
                                }
                                float min2 = Math.min(814.0f, Math.round(Math.min(min / bjVar5.g, max / bjVar.g))) / 814.0f;
                                bjVar5.a(min2, 0, 0, 0, 0, min, 13);
                                bjVar.a(min2, 1, 1, 0, 0, max, 14);
                            }
                            i13 = i16;
                        } else {
                            i13 = size;
                            if (i13 == 3) {
                                org.telegram.messenger.bj bjVar7 = (org.telegram.messenger.bj) arrayList.get(0);
                                org.telegram.messenger.bj bjVar8 = (org.telegram.messenger.bj) arrayList.get(1);
                                org.telegram.messenger.bj bjVar9 = (org.telegram.messenger.bj) arrayList.get(2);
                                if (sb2.charAt(0) == 'n') {
                                    float f31 = bjVar8.g;
                                    float min3 = Math.min(407.0f, Math.round((f31 * f17) / (bjVar9.g + f31)));
                                    int max2 = (int) Math.max(min, Math.min(0.5f * f17, Math.round(Math.min(bjVar9.g * min3, bjVar8.g * r10))));
                                    int round3 = Math.round(Math.min((bjVar7.g * 814.0f) + L3, i17 - max2));
                                    bjVar7.a(1.0f, 0, 0, 0, 1, round3, 13);
                                    float f32 = (814.0f - min3) / 814.0f;
                                    bjVar8.a(f32, 1, 1, 0, 0, max2, 6);
                                    float f33 = min3 / 814.0f;
                                    bjVar9.a(f33, 0, 1, 1, 1, max2, 10);
                                    bjVar9.i = i17;
                                    bjVar7.m = new float[]{f33, f32};
                                    bjVar8.i = i17 - round3;
                                    bjVar9.j = round3;
                                } else {
                                    float round4 = Math.round(Math.min(f17 / bjVar7.g, 537.24005f)) / 814.0f;
                                    bjVar7.a(round4, 0, 1, 0, 0, i1Var2.c, 7);
                                    int i52 = i17 / 2;
                                    float f34 = i52;
                                    float min4 = Math.min(814.0f - round4, Math.round(Math.min(f34 / bjVar8.g, f34 / bjVar9.g))) / 814.0f;
                                    bjVar8.a(min4, 0, 0, 1, 1, i52, 9);
                                    bjVar9.a(min4, 1, 1, 1, 1, i52, 10);
                                }
                            } else if (i13 == 4) {
                                org.telegram.messenger.bj bjVar10 = (org.telegram.messenger.bj) arrayList.get(0);
                                org.telegram.messenger.bj bjVar11 = (org.telegram.messenger.bj) arrayList.get(1);
                                org.telegram.messenger.bj bjVar12 = (org.telegram.messenger.bj) arrayList.get(2);
                                org.telegram.messenger.bj bjVar13 = (org.telegram.messenger.bj) arrayList.get(3);
                                if (sb2.charAt(0) == 'w') {
                                    float round5 = Math.round(Math.min(f17 / bjVar10.g, 537.24005f)) / 814.0f;
                                    bjVar10.a(round5, 0, 2, 0, 0, i1Var2.c, 7);
                                    float round6 = Math.round(f17 / ((bjVar11.g + bjVar12.g) + bjVar13.g));
                                    float f35 = min;
                                    int max3 = (int) Math.max(f35, Math.min(f17 * 0.4f, bjVar11.g * round6));
                                    int max4 = (int) Math.max(Math.max(f35, f17 * 0.33f), bjVar13.g * round6);
                                    float min5 = Math.min(814.0f - round5, round6) / 814.0f;
                                    bjVar11.a(min5, 0, 0, 1, 1, max3, 9);
                                    bjVar12.a(min5, 1, 1, 1, 1, (i17 - max3) - max4, 8);
                                    bjVar13.a(min5, 2, 2, 1, 1, max4, 10);
                                } else {
                                    int max5 = Math.max(min, Math.round(814.0f / ((1.0f / ((org.telegram.messenger.bj) arrayList.get(3)).g) + ((1.0f / bjVar12.g) + (1.0f / bjVar11.g)))));
                                    float f36 = L;
                                    float f37 = max5;
                                    float min6 = Math.min(0.33f, Math.max(f36, f37 / bjVar11.g) / 814.0f);
                                    float min7 = Math.min(0.33f, Math.max(f36, f37 / bjVar12.g) / 814.0f);
                                    float f38 = (1.0f - min6) - min7;
                                    int round7 = Math.round(Math.min((bjVar10.g * 814.0f) + L3, i17 - max5));
                                    bjVar10.a(min6 + min7 + f38, 0, 0, 0, 2, round7, 13);
                                    bjVar11.a(min6, 1, 1, 0, 0, max5, 6);
                                    bjVar12.a(min7, 0, 1, 1, 1, max5, 2);
                                    bjVar12.i = i17;
                                    bjVar13.a(f38, 0, 1, 2, 2, max5, 10);
                                    bjVar13.i = i17;
                                    bjVar11.i = i17 - round7;
                                    bjVar12.j = round7;
                                    bjVar13.j = round7;
                                    bjVar10.m = new float[]{min6, min7, f38};
                                }
                            }
                        }
                        for (int i53 = 0; i53 < i13; i53++) {
                            org.telegram.messenger.bj bjVar14 = (org.telegram.messenger.bj) arrayList.get(i53);
                            if ((bjVar14.l & 1) != 0) {
                                bjVar14.k = true;
                            }
                        }
                    }
                }
                j1Var.b.f();
                org.telegram.ui.ActionBar.a7.I(j1Var.a, org.telegram.ui.ActionBar.t6.d6, null);
                j1Var.requestLayout();
                break;
            case 18:
                ((c1) c1Var.a).setBlock((TL_iv.pageBlockChannel) pageBlock2);
                break;
            case 19:
                z0 z0Var = (z0) c1Var.a;
                TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock2;
                z11 = i11 == 0;
                m60 m60Var = z0Var.a;
                z0Var.K = pageblockaudio;
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) z0Var.b.s.get(pageblockaudio);
                z0Var.M = jjVar;
                if (jjVar != null) {
                    z0Var.L = jjVar.F0();
                }
                z0Var.h = z11;
                org.telegram.ui.Components.kn0 kn0Var = z0Var.f;
                int i54 = org.telegram.ui.ActionBar.t6.ie;
                ((h4) m60Var).getClass();
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, i54, false);
                int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.je, false);
                int i55 = org.telegram.ui.ActionBar.t6.le;
                kn0Var.g(x02, x03, org.telegram.ui.ActionBar.t6.x0(null, i55, false), org.telegram.ui.ActionBar.t6.x0(null, i55, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ke, false));
                z0Var.a(false);
                z0Var.requestLayout();
                break;
            case 20:
                ((v1) c1Var.a).setBlock((TL_iv.pageBlockKicker) pageBlock2);
                break;
            case 21:
                ((z1) c1Var.a).setBlock((z3) pageBlock2);
                break;
            case 22:
                x1 x1Var = (x1) c1Var.a;
                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock2;
                z11 = i11 == 0;
                x1Var.y = pageblockmap;
                x1Var.h = z11;
                x1Var.requestLayout();
                break;
            case 23:
                h2 h2Var = (h2) c1Var.a;
                TLRPC.WebPage webPage = this.E;
                h2Var.n = (b4) pageBlock2;
                h2Var.r = webPage;
                h2Var.requestLayout();
                break;
            case 24:
                ((l1) c1Var.a).setBlock((TL_iv.pageBlockDetails) pageBlock2);
                break;
            case 25:
                ((s2) c1Var.a).setBlock((TL_iv.pageBlockTable) pageBlock2);
                break;
            case 26:
                ((i2) c1Var.a).setBlock((TL_iv.pageBlockRelatedArticles) pageBlock2);
                break;
            case 27:
                break;
        }
    }

    public final boolean J(v3 v3Var) {
        TL_iv.PageBlock x10 = h4.x(v3Var.a);
        if (x10 instanceof TL_iv.pageBlockDetails) {
            return ((TL_iv.pageBlockDetails) x10).open;
        }
        if (!(x10 instanceof v3)) {
            return false;
        }
        v3 v3Var2 = (v3) x10;
        TL_iv.PageBlock x11 = h4.x(v3Var2.b);
        if (!(x11 instanceof TL_iv.pageBlockDetails) || ((TL_iv.pageBlockDetails) x11).open) {
            return J(v3Var2);
        }
        return false;
    }

    public final void K(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            TL_iv.PageBlock pageBlock2 = (TL_iv.pageBlockEmbedPost) pageBlock;
            L(null, pageBlock2.caption.text);
            L(null, pageBlock2.caption.credit);
            G(pageBlock2.caption.text, pageBlock2);
            G(pageBlock2.caption.credit, pageBlock2);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            TL_iv.PageBlock pageBlock3 = (TL_iv.pageBlockParagraph) pageBlock;
            L(null, pageBlock3.text);
            G(pageBlock3.text, pageBlock3);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockKicker) {
            TL_iv.PageBlock pageBlock4 = (TL_iv.pageBlockKicker) pageBlock;
            L(null, pageBlock4.text);
            G(pageBlock4.text, pageBlock4);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockFooter) {
            TL_iv.PageBlock pageBlock5 = (TL_iv.pageBlockFooter) pageBlock;
            L(null, pageBlock5.text);
            G(pageBlock5.text, pageBlock5);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeader) {
            TL_iv.PageBlock pageBlock6 = (TL_iv.pageBlockHeader) pageBlock;
            L(null, pageBlock6.text);
            G(pageBlock6.text, pageBlock6);
            return;
        }
        if (h4.I(pageBlock)) {
            TL_iv.RichText richText = pageBlock.text;
            L(null, richText);
            G(richText, pageBlock);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            TL_iv.PageBlock pageBlock7 = (TL_iv.pageBlockPreformatted) pageBlock;
            L(null, pageBlock7.text);
            G(pageBlock7.text, pageBlock7);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockSubheader) {
            TL_iv.PageBlock pageBlock8 = (TL_iv.pageBlockSubheader) pageBlock;
            L(null, pageBlock8.text);
            G(pageBlock8.text, pageBlock8);
            return;
        }
        int i10 = 0;
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            L(null, pageblockslideshow.caption.text);
            L(null, pageblockslideshow.caption.credit);
            G(pageblockslideshow.caption.text, pageblockslideshow);
            G(pageblockslideshow.caption.credit, pageblockslideshow);
            int size = pageblockslideshow.items.size();
            while (i10 < size) {
                K(pageblockslideshow.items.get(i10));
                i10++;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.PageBlock pageBlock9 = (TL_iv.pageBlockPhoto) pageBlock;
            L(null, pageBlock9.caption.text);
            L(null, pageBlock9.caption.credit);
            G(pageBlock9.caption.text, pageBlock9);
            G(pageBlock9.caption.credit, pageBlock9);
            return;
        }
        if (pageBlock instanceof x3) {
            x3 x3Var = (x3) pageBlock;
            TL_iv.RichText richText2 = x3Var.e;
            if (richText2 != null) {
                L(null, richText2);
                G(x3Var.e, x3Var);
                return;
            } else {
                TL_iv.PageBlock pageBlock10 = x3Var.d;
                if (pageBlock10 != null) {
                    K(pageBlock10);
                    return;
                }
                return;
            }
        }
        if (pageBlock instanceof z3) {
            z3 z3Var = (z3) pageBlock;
            TL_iv.RichText richText3 = z3Var.e;
            if (richText3 != null) {
                L(null, richText3);
                G(z3Var.e, z3Var);
                return;
            } else {
                TL_iv.PageBlock pageBlock11 = z3Var.d;
                if (pageBlock11 != null) {
                    K(pageBlock11);
                    return;
                }
                return;
            }
        }
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            L(null, pageblockcollage.caption.text);
            L(null, pageblockcollage.caption.credit);
            G(pageblockcollage.caption.text, pageblockcollage);
            G(pageblockcollage.caption.credit, pageblockcollage);
            int size2 = pageblockcollage.items.size();
            while (i10 < size2) {
                K(pageblockcollage.items.get(i10));
                i10++;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.PageBlock pageBlock12 = (TL_iv.pageBlockEmbed) pageBlock;
            L(null, pageBlock12.caption.text);
            L(null, pageBlock12.caption.credit);
            G(pageBlock12.caption.text, pageBlock12);
            G(pageBlock12.caption.credit, pageBlock12);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
            TL_iv.PageBlock pageBlock13 = (TL_iv.pageBlockSubtitle) pageBlock;
            L(null, pageBlock13.text);
            G(pageBlock13.text, pageBlock13);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            L(null, pageblockblockquote.text);
            L(null, pageblockblockquote.caption);
            G(pageblockblockquote.text, pageblockblockquote);
            G(pageblockblockquote.caption, pageblockblockquote);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            L(null, pageblockdetails.title);
            G(pageblockdetails.title, pageblockdetails);
            int size3 = pageblockdetails.blocks.size();
            while (i10 < size3) {
                K(pageblockdetails.blocks.get(i10));
                i10++;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            TL_iv.PageBlock pageBlock14 = (TL_iv.pageBlockVideo) pageBlock;
            L(null, pageBlock14.caption.text);
            L(null, pageBlock14.caption.credit);
            G(pageBlock14.caption.text, pageBlock14);
            G(pageBlock14.caption.credit, pageBlock14);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            L(null, pageblockpullquote.text);
            L(null, pageblockpullquote.caption);
            G(pageblockpullquote.text, pageblockpullquote);
            G(pageblockpullquote.caption, pageblockpullquote);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TL_iv.PageBlock pageBlock15 = (TL_iv.pageBlockAudio) pageBlock;
            L(null, pageBlock15.caption.text);
            L(null, pageBlock15.caption.credit);
            G(pageBlock15.caption.text, pageBlock15);
            G(pageBlock15.caption.credit, pageBlock15);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
            L(null, pageblocktable.title);
            G(pageblocktable.title, pageblocktable);
            int size4 = pageblocktable.rows.size();
            for (int i11 = 0; i11 < size4; i11++) {
                TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i11);
                int size5 = pagetablerow.cells.size();
                for (int i12 = 0; i12 < size5; i12++) {
                    TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i12);
                    L(null, pagetablecell.text);
                    G(pagetablecell.text, pageblocktable);
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTitle) {
            TL_iv.PageBlock pageBlock16 = (TL_iv.pageBlockTitle) pageBlock;
            L(null, pageBlock16.text);
            G(pageBlock16.text, pageBlock16);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockCover) {
            K(((TL_iv.pageBlockCover) pageBlock).cover);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
            TL_iv.pageBlockAuthorDate pageblockauthordate = (TL_iv.pageBlockAuthorDate) pageBlock;
            L(null, pageblockauthordate.author);
            G(pageblockauthordate.author, pageblockauthordate);
        } else {
            if (pageBlock instanceof TL_iv.pageBlockMap) {
                TL_iv.PageBlock pageBlock17 = (TL_iv.pageBlockMap) pageBlock;
                L(null, pageBlock17.caption.text);
                L(null, pageBlock17.caption.credit);
                G(pageBlock17.caption.text, pageBlock17);
                G(pageBlock17.caption.credit, pageBlock17);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = (TL_iv.pageBlockRelatedArticles) pageBlock;
                L(null, pageblockrelatedarticles.title);
                G(pageblockrelatedarticles.title, pageblockrelatedarticles);
            }
        }
    }

    public final void L(TL_iv.RichText richText, TL_iv.RichText richText2) {
        if (richText2 == null) {
            return;
        }
        richText2.parentRichText = richText;
        if (richText2 instanceof TL_iv.textFixed) {
            L(richText2, ((TL_iv.textFixed) richText2).text);
            return;
        }
        if (richText2 instanceof TL_iv.textItalic) {
            L(richText2, ((TL_iv.textItalic) richText2).text);
            return;
        }
        if (richText2 instanceof TL_iv.textBold) {
            L(richText2, ((TL_iv.textBold) richText2).text);
            return;
        }
        if (richText2 instanceof TL_iv.textUnderline) {
            L(richText2, ((TL_iv.textUnderline) richText2).text);
            return;
        }
        if (richText2 instanceof TL_iv.textStrike) {
            L(richText2, ((TL_iv.textStrike) richText2).text);
            return;
        }
        if (richText2 instanceof TL_iv.textEmail) {
            L(richText2, ((TL_iv.textEmail) richText2).text);
            return;
        }
        if (richText2 instanceof TL_iv.textPhone) {
            L(richText2, ((TL_iv.textPhone) richText2).text);
            return;
        }
        if (richText2 instanceof TL_iv.textUrl) {
            L(richText2, ((TL_iv.textUrl) richText2).text);
            return;
        }
        if (richText2 instanceof TL_iv.textConcat) {
            int size = richText2.texts.size();
            for (int i10 = 0; i10 < size; i10++) {
                L(richText2, richText2.texts.get(i10));
            }
            return;
        }
        if (richText2 instanceof TL_iv.textSubscript) {
            L(richText2, ((TL_iv.textSubscript) richText2).text);
            return;
        }
        if (richText2 instanceof TL_iv.textSuperscript) {
            L(richText2, ((TL_iv.textSuperscript) richText2).text);
            return;
        }
        if (richText2 instanceof TL_iv.textMarked) {
            L(richText2, ((TL_iv.textMarked) richText2).text);
            return;
        }
        if (richText2 instanceof TL_iv.textSpoiler) {
            L(richText2, ((TL_iv.textSpoiler) richText2).text);
            return;
        }
        if (richText2 instanceof TL_iv.textAnchor) {
            TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
            L(richText2, textanchor.text);
            String lowerCase = textanchor.name.toLowerCase();
            this.h.put(lowerCase, Integer.valueOf(this.e.size()));
            TL_iv.RichText richText3 = textanchor.text;
            boolean z10 = richText3 instanceof TL_iv.textPlain;
            HashMap hashMap = this.r;
            if (z10) {
                if (!TextUtils.isEmpty(((TL_iv.textPlain) richText3).text)) {
                    hashMap.put(lowerCase, textanchor);
                }
            } else if (!(richText3 instanceof TL_iv.textEmpty)) {
                hashMap.put(lowerCase, textanchor);
            }
            this.n.put(lowerCase, -1);
        }
    }

    public final void M() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i10);
            TL_iv.PageBlock x10 = h4.x(pageBlock);
            if (!(x10 instanceof v3) || J((v3) x10)) {
                arrayList.add(pageBlock);
            }
        }
        if (arrayList.size() < 100) {
            Utilities.e.a(this.L);
            Utilities.e.d(this.L, 100L);
        }
    }

    @Override // s4.g0
    public final int b() {
        int i10;
        TLRPC.WebPage webPage = this.E;
        if (webPage == null || webPage.cached_page == null) {
            i10 = 0;
        } else {
            i10 = this.d.size();
            if (this.E.cached_page.local == null) {
                i10++;
            }
        }
        return this.I ? i10 + 1 : i10;
    }

    @Override // s4.g0
    public final int d(int i10) {
        TL_iv.Page page;
        if (this.I) {
            if (i10 == 0) {
                return 2147483646;
            }
            i10--;
        }
        ArrayList arrayList = this.d;
        if (i10 != arrayList.size()) {
            return I((TL_iv.PageBlock) arrayList.get(i10));
        }
        TLRPC.WebPage webPage = this.E;
        return (webPage == null || (page = webPage.cached_page) == null || !page.web) ? 90 : 91;
    }

    @Override // s4.g0
    public final void f() {
        M();
        super.f();
    }

    @Override // s4.g0
    public final void g(int i10) {
        M();
        super.g(i10);
    }

    @Override // s4.g0
    public final void j(int i10, int i11) {
        M();
        super.j(i10, i11);
    }

    @Override // s4.g0
    public final void k(int i10, int i11) {
        M();
        super.k(i10, i11);
    }

    @Override // s4.g0
    public final void n(int i10, int i11, Object obj) {
        M();
        super.n(i10, i11, obj);
    }

    @Override // s4.g0
    public final void o(int i10, int i11) {
        M();
        super.o(i10, i11);
    }

    @Override // s4.g0
    public final void p(int i10, int i11) {
        M();
        super.p(i10, i11);
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        if (this.I) {
            i10--;
        }
        int i11 = i10;
        if (i11 >= 0) {
            ArrayList arrayList = this.d;
            if (i11 < arrayList.size()) {
                H(c1Var.f, c1Var, (TL_iv.PageBlock) arrayList.get(i11), i11, arrayList.size(), false);
            }
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        View v2Var;
        Context context = this.c;
        if (i10 != 2147483646) {
            h4 h4Var = this.M;
            switch (i10) {
                case 0:
                    view = new a2(context, h4Var, this);
                    break;
                case 1:
                    view = new u1(context, h4Var, this);
                    break;
                case 2:
                    view = new m1(context);
                    break;
                case 3:
                    view = new r1(h4Var, context, this);
                    break;
                case 4:
                    view = new q2(context, h4Var, this);
                    break;
                case 5:
                    v2Var = new v2(context, h4Var, this, 0);
                    view = v2Var;
                    break;
                case 6:
                    view = new g2(context, h4Var, this);
                    break;
                case 7:
                    view = new b1(context, h4Var, this);
                    break;
                case 8:
                    view = new o2(h4Var, context, this);
                    break;
                case 9:
                    v2Var = new b2(context, h4Var, this, 0);
                    view = v2Var;
                    break;
                case 10:
                    view = new a1(context, h4Var, this);
                    break;
                case 11:
                    view = new t2(context, h4Var, this);
                    break;
                case 12:
                    view = new w1(context, h4Var, this);
                    break;
                case 13:
                    view = new t1(context, h4Var, this);
                    break;
                case 14:
                    view = new f2(context, h4Var, this);
                    break;
                case 15:
                    view = new p2(context, h4Var, this);
                    break;
                case 16:
                    view = new s1(context, h4Var, this);
                    break;
                case 17:
                    view = new j1(h4Var, context, this);
                    break;
                case 18:
                    v2Var = new c1(context, h4Var, this, 0);
                    view = v2Var;
                    break;
                case 19:
                    view = new z0(context, h4Var, this);
                    break;
                case 20:
                    view = new v1(context, h4Var, this);
                    break;
                case 21:
                    view = new z1(context, h4Var, this);
                    break;
                case 22:
                    view = new x1(context, h4Var, this);
                    break;
                case 23:
                    view = new h2(context, h4Var, this);
                    break;
                case 24:
                    view = new l1(context, h4Var, this);
                    break;
                case 25:
                    view = new s2(context, h4Var, this);
                    break;
                case 26:
                    view = new i2(context, h4Var, this);
                    break;
                case 27:
                    View k1Var = new k1(context);
                    new RectF();
                    k1Var.setImportantForAccessibility(2);
                    view = k1Var;
                    break;
                case 28:
                    view = new mg.k1(context, h4Var);
                    break;
                default:
                    switch (i10) {
                        case org.telegram.messenger.zs.b1 /* 90 */:
                            v2Var = new o3(h4Var, context, false);
                            view = v2Var;
                            break;
                        case org.telegram.messenger.zs.c1 /* 91 */:
                            view = new o3(h4Var, context, true);
                            break;
                        case org.telegram.messenger.zs.d1 /* 92 */:
                            view = new y1(context, h4Var);
                            break;
                        default:
                            TextView textView = new TextView(context);
                            textView.setBackgroundColor(-65536);
                            textView.setTextColor(-16777216);
                            textView.setTextSize(1, 20.0f);
                            view = textView;
                            break;
                    }
            }
        } else {
            View bnVar = new org.telegram.ui.Components.bn(context, 4);
            bnVar.setImportantForAccessibility(2);
            view = bnVar;
        }
        view.setLayoutParams(new s4.o0(-1, -2));
        view.setFocusable(true);
        return new org.telegram.ui.Components.ck0(view);
    }

    @Override // s4.g0
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 == 90 || i10 == 91) {
            o3 o3Var = (o3) c1Var.a;
            TL_iv.Page page = this.E.cached_page;
            int i11 = page != null ? page.views : 0;
            TextView textView = o3Var.b;
            TextView textView2 = o3Var.a;
            if (i11 == 0) {
                o3Var.c = false;
                textView.setVisibility(8);
                textView2.setGravity(17);
            } else {
                o3Var.c = true;
                textView.setVisibility(0);
                textView2.setGravity(21);
                textView.setText(org.telegram.messenger.cd.H(',', "Views", i11));
            }
            int i12 = org.telegram.ui.ActionBar.t6.M6;
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, i12, false);
            int i13 = org.telegram.ui.ActionBar.t6.y6;
            textView2.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i13, false));
            textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i13, false));
            textView2.setBackgroundColor(Color.argb(34, Color.red(x02), Color.green(x02), Color.blue(x02)));
            org.telegram.ui.ActionBar.a7.V(textView2, i13, null);
            org.telegram.ui.ActionBar.a7.V(textView, i13, null);
            org.telegram.ui.ActionBar.a7.j(textView2, org.telegram.ui.ActionBar.a7.h(i12, 34), null);
        }
    }
}
