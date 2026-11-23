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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class e4 extends org.telegram.ui.Components.dk0 {
    public TLRPC.WebPage F;
    public TL_iv.pageBlockChannel G;
    public boolean H;
    public int I;
    public final boolean J;
    public int[] K;
    public int L;
    public final /* synthetic */ g4 N;
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
    public final HashMap E = new HashMap();
    public final hq0 M = new hq0(this, 11);

    public e4(g4 g4Var, Context context, boolean z10) {
        this.N = g4Var;
        this.c = context;
        this.J = z10;
    }

    public static int I(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            return 0;
        }
        if ((pageBlock instanceof TL_iv.pageBlockHeader) || g4.I(pageBlock)) {
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
        if (pageBlock instanceof w3) {
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
        if (pageBlock instanceof y3) {
            return 21;
        }
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            return 22;
        }
        if (pageBlock instanceof a4) {
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
        if (pageBlock instanceof b4) {
            return 28;
        }
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            return 92;
        }
        if (pageBlock instanceof u3) {
            return I(((u3) pageBlock).b);
        }
        if (pageBlock instanceof TL_iv.pageBlockCover) {
            return I(((TL_iv.pageBlockCover) pageBlock).cover);
        }
        return 100;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 23 || i7 == 24;
    }

    public final void E(TL_iv.PageBlock pageBlock, e4 e4Var) {
        boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
        ArrayList arrayList = this.f;
        int i7 = 0;
        if (z10) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            TLRPC.Photo e10 = d4.e(this.F, pageblockphoto.photo_id);
            if (e10 != null) {
                pageblockphoto.thumb = org.telegram.messenger.w7.w(e10.sizes, 56, true, null, false);
                pageblockphoto.thumbObject = e10;
                arrayList.add(pageBlock);
                return;
            }
            return;
        }
        if ((pageBlock instanceof TL_iv.pageBlockVideo) && d4.g(e4Var.F, pageBlock)) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            TLRPC.Document a10 = d4.a(this.F, pageblockvideo.video_id);
            if (a10 != null) {
                pageblockvideo.thumb = org.telegram.messenger.w7.w(a10.thumbs, 56, true, null, false);
                pageblockvideo.thumbObject = a10;
                arrayList.add(pageBlock);
                return;
            }
            return;
        }
        boolean z11 = pageBlock instanceof TL_iv.pageBlockSlideshow;
        g4 g4Var = this.N;
        if (z11) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            int size = pageblockslideshow.items.size();
            while (i7 < size) {
                TL_iv.PageBlock pageBlock2 = pageblockslideshow.items.get(i7);
                pageBlock2.groupId = g4Var.Z;
                E(pageBlock2, e4Var);
                i7++;
            }
            g4Var.Z++;
            return;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockCollage)) {
            if (pageBlock instanceof TL_iv.pageBlockCover) {
                E(((TL_iv.pageBlockCover) pageBlock).cover, e4Var);
                return;
            }
            return;
        }
        TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
        int size2 = pageblockcollage.items.size();
        while (i7 < size2) {
            TL_iv.PageBlock pageBlock3 = pageblockcollage.items.get(i7);
            pageBlock3.groupId = g4Var.Z;
            E(pageBlock3, e4Var);
            i7++;
        }
        g4Var.Z++;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void F(org.telegram.ui.e4 r24, org.telegram.tgnet.tl.TL_iv.PageBlock r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e4.F(org.telegram.ui.e4, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, int):void");
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
    public final void H(int i7, v4.f1 f1Var, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10) {
        TLRPC.Photo photo;
        int i12;
        float f10;
        float f11;
        g1 g1Var;
        int i13;
        int i14;
        float f12;
        org.telegram.messenger.yi yiVar;
        float f13;
        int i15;
        TLRPC.Document a10;
        TLRPC.PhotoSize w10;
        float f14;
        float f15;
        boolean z11;
        boolean z12 = pageBlock instanceof TL_iv.pageBlockCover;
        TL_iv.PageBlock pageBlock2 = z12 ? ((TL_iv.pageBlockCover) pageBlock).cover : pageBlock instanceof u3 ? ((u3) pageBlock).b : pageBlock;
        if (i7 == 92) {
            ((x1) f1Var.a).setBlock((TL_iv.pageBlockMath) pageBlock2);
            return;
        }
        if (i7 == 100) {
            ((TextView) f1Var.a).setText("unsupported block " + pageBlock2);
            return;
        }
        switch (i7) {
            case 0:
                ((z1) f1Var.a).setBlock((TL_iv.pageBlockParagraph) pageBlock2);
                break;
            case 1:
                ((t1) f1Var.a).setBlock(pageBlock2);
                break;
            case 2:
                break;
            case 3:
                q1 q1Var = (q1) f1Var.a;
                TL_iv.pageBlockEmbed pageblockembed = (TL_iv.pageBlockEmbed) pageBlock2;
                TL_iv.pageBlockEmbed pageblockembed2 = q1Var.w;
                q1Var.w = pageblockembed;
                p1 p1Var = q1Var.a;
                if (p1Var != null) {
                    photo = null;
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, p1Var, null);
                } else {
                    photo = null;
                }
                TL_iv.pageBlockEmbed pageblockembed3 = q1Var.w;
                if (pageblockembed2 != pageblockembed3) {
                    q1Var.s = false;
                    p1 p1Var2 = q1Var.a;
                    if (p1Var2 != null) {
                        if (pageblockembed3.allow_scrolling) {
                            p1Var2.setVerticalScrollBarEnabled(true);
                            q1Var.a.setHorizontalScrollBarEnabled(true);
                        } else {
                            p1Var2.setVerticalScrollBarEnabled(false);
                            q1Var.a.setHorizontalScrollBarEnabled(false);
                        }
                    }
                    q1Var.r = 0;
                    p1 p1Var3 = q1Var.a;
                    if (p1Var3 != null) {
                        try {
                            p1Var3.loadUrl("about:blank");
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                    }
                    try {
                        TL_iv.pageBlockEmbed pageblockembed4 = q1Var.w;
                        String str = pageblockembed4.html;
                        if (str != null) {
                            p1 p1Var4 = q1Var.a;
                            if (p1Var4 != null) {
                                p1Var4.loadDataWithBaseURL("https://telegram.org/embed", str, "text/html", "UTF-8", null);
                                q1Var.a.setVisibility(0);
                            }
                            org.telegram.ui.Components.z71 z71Var = q1Var.b;
                            if (z71Var != null) {
                                z71Var.setVisibility(4);
                                q1Var.b.g(null, null, null, null, false);
                            }
                        } else {
                            long j3 = pageblockembed4.poster_photo_id;
                            if (q1Var.b.g(pageblockembed.url, j3 != 0 ? d4.e(q1Var.x.F, j3) : photo, q1Var.x.F, null, false)) {
                                p1 p1Var5 = q1Var.a;
                                if (p1Var5 != null) {
                                    p1Var5.setVisibility(4);
                                    q1Var.a.stopLoading();
                                    q1Var.a.loadUrl("about:blank");
                                }
                                org.telegram.ui.Components.z71 z71Var2 = q1Var.b;
                                if (z71Var2 != null) {
                                    z71Var2.setVisibility(0);
                                }
                            } else {
                                p1 p1Var6 = q1Var.a;
                                if (p1Var6 != null) {
                                    p1Var6.setVisibility(0);
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("Referer", org.telegram.messenger.t0.b.getPackageName());
                                    q1Var.a.loadUrl(q1Var.w.url, hashMap);
                                }
                                org.telegram.ui.Components.z71 z71Var3 = q1Var.b;
                                if (z71Var3 != null) {
                                    z71Var3.setVisibility(4);
                                    q1Var.b.g(null, null, null, null, false);
                                }
                            }
                        }
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                q1Var.requestLayout();
                break;
            case 4:
                ((q2) f1Var.a).setBlock((TL_iv.pageBlockSubtitle) pageBlock2);
                break;
            case 5:
                v2 v2Var = (v2) f1Var.a;
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock2;
                v2Var.b(pageblockvideo, (w2) this.N.E.f(pageblockvideo.video_id), z10, i10 == 0);
                TL_iv.pageBlockChannel pageblockchannel = this.G;
                a1 a1Var = v2Var.s;
                v2Var.O = pageBlock;
                if (pageblockchannel != null && z12) {
                    a1Var.setBlock(pageblockchannel);
                    a1Var.setVisibility(0);
                    break;
                }
                break;
            case 6:
                ((f2) f1Var.a).setBlock((TL_iv.pageBlockPullquote) pageBlock2);
                break;
            case 7:
                ((z0) f1Var.a).setBlock((TL_iv.pageBlockBlockquote) pageBlock2);
                break;
            case 8:
                o2 o2Var = (o2) f1Var.a;
                o2Var.e = (TL_iv.pageBlockSlideshow) pageBlock2;
                o2Var.c.g();
                j2 j2Var = o2Var.b;
                j2Var.x(0, false);
                j2Var.forceLayout();
                o2Var.requestLayout();
                break;
            case 9:
                a2 a2Var = (a2) f1Var.a;
                a2Var.a((TL_iv.pageBlockPhoto) pageBlock2, this.F, z10, i10 == 0);
                a2Var.setParentBlock(pageBlock);
                break;
            case 10:
                ((y0) f1Var.a).setBlock((TL_iv.pageBlockAuthorDate) pageBlock2);
                break;
            case 11:
                ((t2) f1Var.a).setBlock((TL_iv.pageBlockTitle) pageBlock2);
                break;
            case 12:
                ((v1) f1Var.a).setBlock((w3) pageBlock2);
                break;
            case 13:
                ((s1) f1Var.a).setBlock((TL_iv.pageBlockFooter) pageBlock2);
                break;
            case 14:
                ((e2) f1Var.a).setBlock((TL_iv.pageBlockPreformatted) pageBlock2);
                break;
            case 15:
                ((p2) f1Var.a).setBlock((TL_iv.pageBlockSubheader) pageBlock2);
                break;
            case 16:
                ((r1) f1Var.a).setBlock((TL_iv.pageBlockEmbedPost) pageBlock2);
                break;
            case 17:
                h1 h1Var = (h1) f1Var.a;
                TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock2;
                if (h1Var.s != pageblockcollage) {
                    h1Var.s = pageblockcollage;
                    g1 g1Var2 = h1Var.w;
                    int i16 = g1Var2.c;
                    ArrayList arrayList = g1Var2.a;
                    arrayList.clear();
                    HashMap hashMap2 = g1Var2.b;
                    hashMap2.clear();
                    h1 h1Var2 = g1Var2.d;
                    TL_iv.pageBlockCollage pageblockcollage2 = h1Var2.s;
                    e4 e4Var = h1Var2.x;
                    int size = pageblockcollage2.items.size();
                    if (size > 1) {
                        StringBuilder sb2 = new StringBuilder();
                        int i17 = 0;
                        boolean z13 = false;
                        float f16 = 1.0f;
                        while (i17 < size) {
                            TL_iv.PageBlock pageBlock3 = h1Var2.s.items.get(i17);
                            if (pageBlock3 instanceof TL_iv.pageBlockPhoto) {
                                TLRPC.Photo e12 = d4.e(e4Var.F, ((TL_iv.pageBlockPhoto) pageBlock3).photo_id);
                                if (e12 == null) {
                                    i17++;
                                } else {
                                    w10 = org.telegram.messenger.w7.w(e12.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
                                    org.telegram.messenger.yi yiVar2 = new org.telegram.messenger.yi();
                                    yiVar2.h = i17 != size + (-1);
                                    f14 = w10 != null ? 1.0f : w10.w / w10.h;
                                    yiVar2.g = f14;
                                    if (f14 <= 1.2f) {
                                        sb2.append("w");
                                    } else if (f14 < 0.8f) {
                                        sb2.append("n");
                                    } else {
                                        sb2.append("q");
                                    }
                                    f15 = yiVar2.g;
                                    f16 += f15;
                                    if (f15 > 2.0f) {
                                        z13 = true;
                                    }
                                    hashMap2.put(pageBlock3, yiVar2);
                                    arrayList.add(yiVar2);
                                    i17++;
                                }
                            } else {
                                if ((pageBlock3 instanceof TL_iv.pageBlockVideo) && (a10 = d4.a(e4Var.F, ((TL_iv.pageBlockVideo) pageBlock3).video_id)) != null) {
                                    w10 = org.telegram.messenger.w7.w(a10.thumbs, 90, false, null, false);
                                    org.telegram.messenger.yi yiVar22 = new org.telegram.messenger.yi();
                                    yiVar22.h = i17 != size + (-1);
                                    if (w10 != null) {
                                    }
                                    yiVar22.g = f14;
                                    if (f14 <= 1.2f) {
                                    }
                                    f15 = yiVar22.g;
                                    f16 += f15;
                                    if (f15 > 2.0f) {
                                    }
                                    hashMap2.put(pageBlock3, yiVar22);
                                    arrayList.add(yiVar22);
                                }
                                i17++;
                            }
                        }
                        float f17 = 1.0f;
                        int L = org.telegram.messenger.g0.L(120.0f);
                        float L2 = org.telegram.messenger.g0.L(120.0f);
                        Point point = org.telegram.messenger.g0.q;
                        float f18 = i16;
                        int min = (int) (L2 / (Math.min(point.x, point.y) / f18));
                        int L3 = (int) (org.telegram.messenger.g0.L(40.0f) / (Math.min(point.x, point.y) / f18));
                        float f19 = f18 / 814.0f;
                        float f20 = f16 / size;
                        if (z13 || !(size == 2 || size == 3 || size == 4)) {
                            i12 = size;
                            int size2 = arrayList.size();
                            float[] fArr = new float[size2];
                            int i18 = 0;
                            while (i18 < i12) {
                                if (f20 > 1.1f) {
                                    f12 = f17;
                                    fArr[i18] = Math.max(f12, ((org.telegram.messenger.yi) arrayList.get(i18)).g);
                                } else {
                                    f12 = f17;
                                    fArr[i18] = Math.min(f12, ((org.telegram.messenger.yi) arrayList.get(i18)).g);
                                }
                                fArr[i18] = Math.max(0.66667f, Math.min(1.7f, fArr[i18]));
                                i18++;
                                f17 = f12;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (int i19 = 1; i19 < size2; i19++) {
                                int i20 = size2 - i19;
                                if (i19 <= 3 && i20 <= 3) {
                                    float a11 = g1Var2.a(0, i19, fArr);
                                    float a12 = g1Var2.a(i19, size2, fArr);
                                    f1 f1Var2 = new f1();
                                    f1Var2.a = new int[]{i19, i20};
                                    f1Var2.b = new float[]{a11, a12};
                                    arrayList2.add(f1Var2);
                                }
                            }
                            for (int i21 = 1; i21 < size2 - 1; i21++) {
                                int i22 = 1;
                                while (true) {
                                    int i23 = size2 - i21;
                                    if (i22 < i23) {
                                        int i24 = i23 - i22;
                                        if (i21 <= 3) {
                                            if (i22 <= (f20 < 0.85f ? 4 : 3) && i24 <= 3) {
                                                float a13 = g1Var2.a(0, i21, fArr);
                                                int i25 = i21 + i22;
                                                float a14 = g1Var2.a(i21, i25, fArr);
                                                float a15 = g1Var2.a(i25, size2, fArr);
                                                f1 f1Var3 = new f1();
                                                f1Var3.a = new int[]{i21, i22, i24};
                                                i14 = i16;
                                                f1Var3.b = new float[]{a13, a14, a15};
                                                arrayList2.add(f1Var3);
                                                i22++;
                                                i16 = i14;
                                            }
                                        }
                                        i14 = i16;
                                        i22++;
                                        i16 = i14;
                                    }
                                }
                            }
                            int i26 = i16;
                            for (int i27 = 1; i27 < size2 - 2; i27++) {
                                int i28 = 1;
                                while (true) {
                                    int i29 = size2 - i27;
                                    if (i28 < i29) {
                                        int i30 = 1;
                                        while (true) {
                                            int i31 = i29 - i28;
                                            if (i30 < i31) {
                                                int i32 = i31 - i30;
                                                if (i27 > 3 || i28 > 3 || i30 > 3 || i32 > 3) {
                                                    g1Var = g1Var2;
                                                    i13 = i29;
                                                } else {
                                                    float a16 = g1Var2.a(0, i27, fArr);
                                                    int i33 = i27 + i28;
                                                    float a17 = g1Var2.a(i27, i33, fArr);
                                                    i13 = i29;
                                                    int i34 = i33 + i30;
                                                    float a18 = g1Var2.a(i33, i34, fArr);
                                                    float a19 = g1Var2.a(i34, size2, fArr);
                                                    f1 f1Var4 = new f1();
                                                    f1Var4.a = new int[]{i27, i28, i30, i32};
                                                    g1Var = g1Var2;
                                                    f1Var4.b = new float[]{a16, a17, a18, a19};
                                                    arrayList2.add(f1Var4);
                                                }
                                                i30++;
                                                i29 = i13;
                                                g1Var2 = g1Var;
                                            }
                                        }
                                        i28++;
                                    }
                                }
                            }
                            float f21 = (i26 / 3) * 4;
                            int i35 = 0;
                            f1 f1Var5 = null;
                            float f22 = 0.0f;
                            while (i35 < arrayList2.size()) {
                                f1 f1Var6 = (f1) arrayList2.get(i35);
                                float f23 = Float.MAX_VALUE;
                                int i36 = 0;
                                float f24 = 0.0f;
                                while (true) {
                                    float[] fArr2 = f1Var6.b;
                                    float f25 = f21;
                                    if (i36 < fArr2.length) {
                                        float f26 = fArr2[i36];
                                        f24 += f26;
                                        if (f26 < f23) {
                                            f23 = f26;
                                        }
                                        i36++;
                                        f21 = f25;
                                    } else {
                                        float abs = Math.abs(f24 - f25);
                                        int[] iArr = f1Var6.a;
                                        if (iArr.length > 1) {
                                            int i37 = iArr[0];
                                            int i38 = iArr[1];
                                            if (i37 <= i38) {
                                                f10 = abs;
                                                if (iArr.length <= 2 || i38 <= iArr[2]) {
                                                    if (iArr.length > 3) {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                f10 = abs;
                                            }
                                            f11 = f10 * 1.2f;
                                            if (f23 < min) {
                                                f11 *= 1.5f;
                                            }
                                            if (f1Var5 != null || f11 < f22) {
                                                f22 = f11;
                                                f1Var5 = f1Var6;
                                            }
                                            i35++;
                                            f21 = f25;
                                        } else {
                                            f10 = abs;
                                        }
                                        f11 = f10;
                                        if (f23 < min) {
                                        }
                                        if (f1Var5 != null) {
                                        }
                                        f22 = f11;
                                        f1Var5 = f1Var6;
                                        i35++;
                                        f21 = f25;
                                    }
                                }
                            }
                            if (f1Var5 != null) {
                                int[] iArr2 = f1Var5.a;
                                int i39 = 0;
                                int i40 = 0;
                                while (i39 < iArr2.length) {
                                    int i41 = iArr2[i39];
                                    float f27 = f1Var5.b[i39];
                                    int i42 = i26;
                                    int i43 = 0;
                                    org.telegram.messenger.yi yiVar3 = null;
                                    while (i43 < i41) {
                                        int i44 = (int) (fArr[i40] * f27);
                                        i42 -= i44;
                                        org.telegram.messenger.yi yiVar4 = (org.telegram.messenger.yi) arrayList.get(i40);
                                        int i45 = i39 == 0 ? 4 : 0;
                                        int i46 = i40;
                                        if (i39 == iArr2.length - 1) {
                                            i45 |= 8;
                                        }
                                        if (i43 == 0) {
                                            i45 |= 1;
                                        }
                                        if (i43 == i41 - 1) {
                                            i45 |= 2;
                                            yiVar3 = yiVar4;
                                        }
                                        int i47 = i39;
                                        int i48 = i43;
                                        yiVar4.a(f27 / 814.0f, i48, i43, i47, i39, i44, i45);
                                        i43 = i48 + 1;
                                        i40 = i46 + 1;
                                        i39 = i47;
                                    }
                                    yiVar3.e += i42;
                                    yiVar3.i += i42;
                                    i39++;
                                    i40 = i40;
                                }
                            }
                        } else if (size == 2) {
                            org.telegram.messenger.yi yiVar5 = (org.telegram.messenger.yi) arrayList.get(0);
                            org.telegram.messenger.yi yiVar6 = (org.telegram.messenger.yi) arrayList.get(1);
                            String sb3 = sb2.toString();
                            if (sb3.equals("ww")) {
                                i15 = size;
                                f13 = f18;
                                if (f20 > f19 * 1.4d) {
                                    float f28 = yiVar5.g;
                                    float f29 = yiVar6.g;
                                    if (f28 - f29 < 0.2d) {
                                        float round = Math.round(Math.min(f13 / f28, Math.min(f13 / f29, 407.0f))) / 814.0f;
                                        yiVar5.a(round, 0, 0, 0, 0, g1Var2.c, 7);
                                        yiVar6.a(round, 0, 0, 1, 1, g1Var2.c, 11);
                                        i12 = i15;
                                    }
                                }
                                yiVar = yiVar6;
                            } else {
                                yiVar = yiVar6;
                                f13 = f18;
                                i15 = size;
                            }
                            if (sb3.equals("ww") || sb3.equals("qq")) {
                                int i49 = i16 / 2;
                                float f30 = i49;
                                float round2 = Math.round(Math.min(f30 / yiVar5.g, Math.min(f30 / yiVar.g, 814.0f))) / 814.0f;
                                yiVar5.a(round2, 0, 0, 0, 0, i49, 13);
                                yiVar.a(round2, 1, 1, 0, 0, i49, 14);
                            } else {
                                float f31 = yiVar5.g;
                                int max = (int) Math.max(f13 * 0.4f, Math.round((f13 / f31) / ((1.0f / yiVar.g) + (1.0f / f31))));
                                int i50 = i16 - max;
                                if (i50 < min) {
                                    max -= min - i50;
                                } else {
                                    min = i50;
                                }
                                float min2 = Math.min(814.0f, Math.round(Math.min(min / yiVar5.g, max / yiVar.g))) / 814.0f;
                                yiVar5.a(min2, 0, 0, 0, 0, min, 13);
                                yiVar.a(min2, 1, 1, 0, 0, max, 14);
                            }
                            i12 = i15;
                        } else {
                            i12 = size;
                            if (i12 == 3) {
                                org.telegram.messenger.yi yiVar7 = (org.telegram.messenger.yi) arrayList.get(0);
                                org.telegram.messenger.yi yiVar8 = (org.telegram.messenger.yi) arrayList.get(1);
                                org.telegram.messenger.yi yiVar9 = (org.telegram.messenger.yi) arrayList.get(2);
                                if (sb2.charAt(0) == 'n') {
                                    float f32 = yiVar8.g;
                                    float min3 = Math.min(407.0f, Math.round((f32 * f18) / (yiVar9.g + f32)));
                                    int max2 = (int) Math.max(min, Math.min(0.5f * f18, Math.round(Math.min(yiVar9.g * min3, yiVar8.g * r10))));
                                    int round3 = Math.round(Math.min((yiVar7.g * 814.0f) + L3, i16 - max2));
                                    yiVar7.a(1.0f, 0, 0, 0, 1, round3, 13);
                                    float f33 = (814.0f - min3) / 814.0f;
                                    yiVar8.a(f33, 1, 1, 0, 0, max2, 6);
                                    float f34 = min3 / 814.0f;
                                    yiVar9.a(f34, 0, 1, 1, 1, max2, 10);
                                    yiVar9.i = i16;
                                    yiVar7.m = new float[]{f34, f33};
                                    yiVar8.i = i16 - round3;
                                    yiVar9.j = round3;
                                } else {
                                    float round4 = Math.round(Math.min(f18 / yiVar7.g, 537.24005f)) / 814.0f;
                                    yiVar7.a(round4, 0, 1, 0, 0, g1Var2.c, 7);
                                    int i51 = i16 / 2;
                                    float f35 = i51;
                                    float min4 = Math.min(814.0f - round4, Math.round(Math.min(f35 / yiVar8.g, f35 / yiVar9.g))) / 814.0f;
                                    yiVar8.a(min4, 0, 0, 1, 1, i51, 9);
                                    yiVar9.a(min4, 1, 1, 1, 1, i51, 10);
                                }
                            } else if (i12 == 4) {
                                org.telegram.messenger.yi yiVar10 = (org.telegram.messenger.yi) arrayList.get(0);
                                org.telegram.messenger.yi yiVar11 = (org.telegram.messenger.yi) arrayList.get(1);
                                org.telegram.messenger.yi yiVar12 = (org.telegram.messenger.yi) arrayList.get(2);
                                org.telegram.messenger.yi yiVar13 = (org.telegram.messenger.yi) arrayList.get(3);
                                if (sb2.charAt(0) == 'w') {
                                    float round5 = Math.round(Math.min(f18 / yiVar10.g, 537.24005f)) / 814.0f;
                                    yiVar10.a(round5, 0, 2, 0, 0, g1Var2.c, 7);
                                    float round6 = Math.round(f18 / ((yiVar11.g + yiVar12.g) + yiVar13.g));
                                    float f36 = min;
                                    int max3 = (int) Math.max(f36, Math.min(f18 * 0.4f, yiVar11.g * round6));
                                    int max4 = (int) Math.max(Math.max(f36, f18 * 0.33f), yiVar13.g * round6);
                                    float min5 = Math.min(814.0f - round5, round6) / 814.0f;
                                    yiVar11.a(min5, 0, 0, 1, 1, max3, 9);
                                    yiVar12.a(min5, 1, 1, 1, 1, (i16 - max3) - max4, 8);
                                    yiVar13.a(min5, 2, 2, 1, 1, max4, 10);
                                } else {
                                    int max5 = Math.max(min, Math.round(814.0f / ((1.0f / ((org.telegram.messenger.yi) arrayList.get(3)).g) + ((1.0f / yiVar12.g) + (1.0f / yiVar11.g)))));
                                    float f37 = L;
                                    float f38 = max5;
                                    float min6 = Math.min(0.33f, Math.max(f37, f38 / yiVar11.g) / 814.0f);
                                    float min7 = Math.min(0.33f, Math.max(f37, f38 / yiVar12.g) / 814.0f);
                                    float f39 = (1.0f - min6) - min7;
                                    int round7 = Math.round(Math.min((yiVar10.g * 814.0f) + L3, i16 - max5));
                                    yiVar10.a(min6 + min7 + f39, 0, 0, 0, 2, round7, 13);
                                    yiVar11.a(min6, 1, 1, 0, 0, max5, 6);
                                    yiVar12.a(min7, 0, 1, 1, 1, max5, 2);
                                    yiVar12.i = i16;
                                    yiVar13.a(f39, 0, 1, 2, 2, max5, 10);
                                    yiVar13.i = i16;
                                    yiVar11.i = i16 - round7;
                                    yiVar12.j = round7;
                                    yiVar13.j = round7;
                                    yiVar10.m = new float[]{min6, min7, f39};
                                }
                            }
                        }
                        for (int i52 = 0; i52 < i12; i52++) {
                            org.telegram.messenger.yi yiVar14 = (org.telegram.messenger.yi) arrayList.get(i52);
                            if ((yiVar14.l & 1) != 0) {
                                yiVar14.k = true;
                            }
                        }
                    }
                }
                h1Var.b.f();
                org.telegram.ui.ActionBar.t6.H(h1Var.a, org.telegram.ui.ActionBar.m6.d6, null);
                h1Var.requestLayout();
                break;
            case 18:
                ((a1) f1Var.a).setBlock((TL_iv.pageBlockChannel) pageBlock2);
                break;
            case 19:
                x0 x0Var = (x0) f1Var.a;
                TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock2;
                z11 = i10 == 0;
                p50 p50Var = x0Var.a;
                x0Var.L = pageblockaudio;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) x0Var.b.s.get(pageblockaudio);
                x0Var.N = gjVar;
                if (gjVar != null) {
                    x0Var.M = gjVar.F0();
                }
                x0Var.h = z11;
                org.telegram.ui.Components.ym0 ym0Var = x0Var.f;
                int i53 = org.telegram.ui.ActionBar.m6.le;
                ((g4) p50Var).getClass();
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, i53, false);
                int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.me, false);
                int i54 = org.telegram.ui.ActionBar.m6.oe;
                ym0Var.g(x02, x03, org.telegram.ui.ActionBar.m6.x0(null, i54, false), org.telegram.ui.ActionBar.m6.x0(null, i54, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.ne, false));
                x0Var.a(false);
                x0Var.requestLayout();
                break;
            case 20:
                ((u1) f1Var.a).setBlock((TL_iv.pageBlockKicker) pageBlock2);
                break;
            case 21:
                ((y1) f1Var.a).setBlock((y3) pageBlock2);
                break;
            case 22:
                w1 w1Var = (w1) f1Var.a;
                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock2;
                z11 = i10 == 0;
                w1Var.y = pageblockmap;
                w1Var.h = z11;
                w1Var.requestLayout();
                break;
            case 23:
                g2 g2Var = (g2) f1Var.a;
                TLRPC.WebPage webPage = this.F;
                g2Var.n = (a4) pageBlock2;
                g2Var.r = webPage;
                g2Var.requestLayout();
                break;
            case 24:
                ((j1) f1Var.a).setBlock((TL_iv.pageBlockDetails) pageBlock2);
                break;
            case 25:
                ((s2) f1Var.a).setBlock((TL_iv.pageBlockTable) pageBlock2);
                break;
            case 26:
                ((h2) f1Var.a).setBlock((TL_iv.pageBlockRelatedArticles) pageBlock2);
                break;
            case 27:
                break;
        }
    }

    public final boolean J(u3 u3Var) {
        TL_iv.PageBlock x10 = g4.x(u3Var.a);
        if (x10 instanceof TL_iv.pageBlockDetails) {
            return ((TL_iv.pageBlockDetails) x10).open;
        }
        if (!(x10 instanceof u3)) {
            return false;
        }
        u3 u3Var2 = (u3) x10;
        TL_iv.PageBlock x11 = g4.x(u3Var2.b);
        if (!(x11 instanceof TL_iv.pageBlockDetails) || ((TL_iv.pageBlockDetails) x11).open) {
            return J(u3Var2);
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
        if (g4.I(pageBlock)) {
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
        int i7 = 0;
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            L(null, pageblockslideshow.caption.text);
            L(null, pageblockslideshow.caption.credit);
            G(pageblockslideshow.caption.text, pageblockslideshow);
            G(pageblockslideshow.caption.credit, pageblockslideshow);
            int size = pageblockslideshow.items.size();
            while (i7 < size) {
                K(pageblockslideshow.items.get(i7));
                i7++;
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
        if (pageBlock instanceof w3) {
            w3 w3Var = (w3) pageBlock;
            TL_iv.RichText richText2 = w3Var.e;
            if (richText2 != null) {
                L(null, richText2);
                G(w3Var.e, w3Var);
                return;
            } else {
                TL_iv.PageBlock pageBlock10 = w3Var.d;
                if (pageBlock10 != null) {
                    K(pageBlock10);
                    return;
                }
                return;
            }
        }
        if (pageBlock instanceof y3) {
            y3 y3Var = (y3) pageBlock;
            TL_iv.RichText richText3 = y3Var.e;
            if (richText3 != null) {
                L(null, richText3);
                G(y3Var.e, y3Var);
                return;
            } else {
                TL_iv.PageBlock pageBlock11 = y3Var.d;
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
            while (i7 < size2) {
                K(pageblockcollage.items.get(i7));
                i7++;
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
            while (i7 < size3) {
                K(pageblockdetails.blocks.get(i7));
                i7++;
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
            for (int i10 = 0; i10 < size4; i10++) {
                TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i10);
                int size5 = pagetablerow.cells.size();
                for (int i11 = 0; i11 < size5; i11++) {
                    TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i11);
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
            for (int i7 = 0; i7 < size; i7++) {
                L(richText2, richText2.texts.get(i7));
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
        for (int i7 = 0; i7 < size; i7++) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i7);
            TL_iv.PageBlock x10 = g4.x(pageBlock);
            if (!(x10 instanceof u3) || J((u3) x10)) {
                arrayList.add(pageBlock);
            }
        }
        if (arrayList.size() < 100) {
            Utilities.e.a(this.M);
            Utilities.e.d(this.M, 100L);
        }
    }

    @Override // v4.i0
    public final int b() {
        int i7;
        TLRPC.WebPage webPage = this.F;
        if (webPage == null || webPage.cached_page == null) {
            i7 = 0;
        } else {
            i7 = this.d.size();
            if (this.F.cached_page.local == null) {
                i7++;
            }
        }
        return this.J ? i7 + 1 : i7;
    }

    @Override // v4.i0
    public final int d(int i7) {
        TL_iv.Page page;
        if (this.J) {
            if (i7 == 0) {
                return 2147483646;
            }
            i7--;
        }
        ArrayList arrayList = this.d;
        if (i7 != arrayList.size()) {
            return I((TL_iv.PageBlock) arrayList.get(i7));
        }
        TLRPC.WebPage webPage = this.F;
        return (webPage == null || (page = webPage.cached_page) == null || !page.web) ? 90 : 91;
    }

    @Override // v4.i0
    public final void f() {
        M();
        super.f();
    }

    @Override // v4.i0
    public final void g(int i7) {
        M();
        super.g(i7);
    }

    @Override // v4.i0
    public final void j(int i7, int i10) {
        M();
        super.j(i7, i10);
    }

    @Override // v4.i0
    public final void k(int i7, int i10) {
        M();
        super.k(i7, i10);
    }

    @Override // v4.i0
    public final void n(int i7, int i10, Object obj) {
        M();
        super.n(i7, i10, obj);
    }

    @Override // v4.i0
    public final void o(int i7, int i10) {
        M();
        super.o(i7, i10);
    }

    @Override // v4.i0
    public final void p(int i7, int i10) {
        M();
        super.p(i7, i10);
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        if (this.J) {
            i7--;
        }
        int i10 = i7;
        if (i10 >= 0) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                H(f1Var.f, f1Var, (TL_iv.PageBlock) arrayList.get(i10), i10, arrayList.size(), false);
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        View v2Var;
        Context context = this.c;
        if (i7 != 2147483646) {
            g4 g4Var = this.N;
            switch (i7) {
                case 0:
                    view = new z1(context, g4Var, this);
                    break;
                case 1:
                    view = new t1(context, g4Var, this);
                    break;
                case 2:
                    view = new k1(context);
                    break;
                case 3:
                    view = new q1(g4Var, context, this);
                    break;
                case 4:
                    view = new q2(context, g4Var, this);
                    break;
                case 5:
                    v2Var = new v2(context, g4Var, this, 0);
                    view = v2Var;
                    break;
                case 6:
                    view = new f2(context, g4Var, this);
                    break;
                case 7:
                    view = new z0(context, g4Var, this);
                    break;
                case 8:
                    view = new o2(g4Var, context, this);
                    break;
                case 9:
                    v2Var = new a2(context, g4Var, this, 0);
                    view = v2Var;
                    break;
                case 10:
                    view = new y0(context, g4Var, this);
                    break;
                case 11:
                    view = new t2(context, g4Var, this);
                    break;
                case 12:
                    view = new v1(context, g4Var, this);
                    break;
                case 13:
                    view = new s1(context, g4Var, this);
                    break;
                case 14:
                    view = new e2(context, g4Var, this);
                    break;
                case 15:
                    view = new p2(context, g4Var, this);
                    break;
                case 16:
                    view = new r1(context, g4Var, this);
                    break;
                case 17:
                    view = new h1(g4Var, context, this);
                    break;
                case 18:
                    v2Var = new a1(context, g4Var, this, 0);
                    view = v2Var;
                    break;
                case 19:
                    view = new x0(context, g4Var, this);
                    break;
                case 20:
                    view = new u1(context, g4Var, this);
                    break;
                case 21:
                    view = new y1(context, g4Var, this);
                    break;
                case 22:
                    view = new w1(context, g4Var, this);
                    break;
                case 23:
                    view = new g2(context, g4Var, this);
                    break;
                case 24:
                    view = new j1(context, g4Var, this);
                    break;
                case 25:
                    view = new s2(context, g4Var, this);
                    break;
                case 26:
                    view = new h2(context, g4Var, this);
                    break;
                case 27:
                    View i1Var = new i1(context);
                    new RectF();
                    i1Var.setImportantForAccessibility(2);
                    view = i1Var;
                    break;
                case 28:
                    view = new i2(context, g4Var);
                    break;
                default:
                    switch (i7) {
                        case org.telegram.messenger.ls.b1 /* 90 */:
                            v2Var = new n3(g4Var, context, false);
                            view = v2Var;
                            break;
                        case org.telegram.messenger.ls.c1 /* 91 */:
                            view = new n3(g4Var, context, true);
                            break;
                        case org.telegram.messenger.ls.d1 /* 92 */:
                            view = new x1(context, g4Var);
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
            View lnVar = new org.telegram.ui.Components.ln(context, 7);
            lnVar.setImportantForAccessibility(2);
            view = lnVar;
        }
        view.setLayoutParams(new v4.q0(-1, -2));
        view.setFocusable(true);
        return new org.telegram.ui.Components.mj0(view);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        int i7 = f1Var.f;
        if (i7 == 90 || i7 == 91) {
            n3 n3Var = (n3) f1Var.a;
            TL_iv.Page page = this.F.cached_page;
            int i10 = page != null ? page.views : 0;
            TextView textView = n3Var.b;
            TextView textView2 = n3Var.a;
            if (i10 == 0) {
                n3Var.c = false;
                textView.setVisibility(8);
                textView2.setGravity(17);
            } else {
                n3Var.c = true;
                textView.setVisibility(0);
                textView2.setGravity(21);
                textView.setText(org.telegram.messenger.hd.H(',', "Views", i10));
            }
            int i11 = org.telegram.ui.ActionBar.m6.M6;
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, i11, false);
            int i12 = org.telegram.ui.ActionBar.m6.y6;
            textView2.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i12, false));
            textView.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i12, false));
            textView2.setBackgroundColor(Color.argb(34, Color.red(x02), Color.green(x02), Color.blue(x02)));
            org.telegram.ui.ActionBar.t6.U(textView2, i12, null);
            org.telegram.ui.ActionBar.t6.U(textView, i12, null);
            org.telegram.ui.ActionBar.t6.i(textView2, org.telegram.ui.ActionBar.t6.g(i11, 34), null);
        }
    }
}
