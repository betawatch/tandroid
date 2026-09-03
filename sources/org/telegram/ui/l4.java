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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class l4 extends org.telegram.ui.Components.ql0 {
    public TLRPC.WebPage B;
    public TL_iv.pageBlockChannel C;
    public boolean D;
    public final boolean E;
    public int[] F;
    public int G;
    public final /* synthetic */ n4 I;
    public final Context c;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final HashMap h = new HashMap();
    public final HashMap n = new HashMap();
    public final HashMap r = new HashMap();
    public final HashMap s = new HashMap();
    public final ArrayList v = new ArrayList();
    public final HashMap w = new HashMap();
    public final ArrayList x = new ArrayList();
    public final HashMap y = new HashMap();
    public final yt0 H = new yt0(this, 11);

    public l4(n4 n4Var, Context context, boolean z4) {
        this.I = n4Var;
        this.c = context;
        this.E = z4;
    }

    public static int I(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            return 0;
        }
        if ((pageBlock instanceof TL_iv.pageBlockHeader) || n4.K(pageBlock)) {
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
        if (pageBlock instanceof d4) {
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
        if (pageBlock instanceof f4) {
            return 21;
        }
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            return 22;
        }
        if (pageBlock instanceof h4) {
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
        if (pageBlock instanceof i4) {
            return 28;
        }
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            return 92;
        }
        if (pageBlock instanceof b4) {
            return I(((b4) pageBlock).b);
        }
        if (pageBlock instanceof TL_iv.pageBlockCover) {
            return I(((TL_iv.pageBlockCover) pageBlock).cover);
        }
        return 100;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 23 || i10 == 24;
    }

    public final void E(TL_iv.PageBlock pageBlock, l4 l4Var) {
        boolean z4 = pageBlock instanceof TL_iv.pageBlockPhoto;
        ArrayList arrayList = this.f;
        if (z4) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            TLRPC.Photo e = k4.e(this.B, pageblockphoto.photo_id);
            if (e != null) {
                pageblockphoto.thumb = FileLoader.getClosestPhotoSizeWithSize(e.sizes, 56, true);
                pageblockphoto.thumbObject = e;
                arrayList.add(pageBlock);
                return;
            }
            return;
        }
        if ((pageBlock instanceof TL_iv.pageBlockVideo) && k4.g(l4Var.B, pageBlock)) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            TLRPC.Document a2 = k4.a(this.B, pageblockvideo.video_id);
            if (a2 != null) {
                pageblockvideo.thumb = FileLoader.getClosestPhotoSizeWithSize(a2.thumbs, 56, true);
                pageblockvideo.thumbObject = a2;
                arrayList.add(pageBlock);
                return;
            }
            return;
        }
        boolean z10 = pageBlock instanceof TL_iv.pageBlockSlideshow;
        int i10 = 0;
        n4 n4Var = this.I;
        if (z10) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            int size = pageblockslideshow.items.size();
            while (i10 < size) {
                TL_iv.PageBlock pageBlock2 = pageblockslideshow.items.get(i10);
                pageBlock2.groupId = n4Var.V;
                E(pageBlock2, l4Var);
                i10++;
            }
            n4Var.V++;
            return;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockCollage)) {
            if (pageBlock instanceof TL_iv.pageBlockCover) {
                E(((TL_iv.pageBlockCover) pageBlock).cover, l4Var);
                return;
            }
            return;
        }
        TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
        int size2 = pageblockcollage.items.size();
        while (i10 < size2) {
            TL_iv.PageBlock pageBlock3 = pageblockcollage.items.get(i10);
            pageBlock3.groupId = n4Var.V;
            E(pageBlock3, l4Var);
            i10++;
        }
        n4Var.V++;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void F(org.telegram.ui.l4 r24, org.telegram.tgnet.tl.TL_iv.PageBlock r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l4.F(org.telegram.ui.l4, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, int):void");
    }

    public final void G(Object obj, TL_iv.PageBlock pageBlock) {
        if (obj instanceof TL_iv.textEmpty) {
            return;
        }
        HashMap hashMap = this.w;
        if (hashMap.containsKey(obj)) {
            return;
        }
        hashMap.put(obj, pageBlock);
        this.x.add(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x074e, code lost:
    
        if (r3[2] > r3[3]) goto L204;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0178  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(int i10, f2.l1 l1Var, TL_iv.PageBlock pageBlock, int i11, int i12, boolean z4) {
        TLRPC.Photo photo;
        ?? r10;
        float f10;
        float f11;
        m1 m1Var;
        int i13;
        int i14;
        String str;
        TLRPC.Document a2;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        float f12;
        float f13;
        boolean z10;
        boolean z11 = pageBlock instanceof TL_iv.pageBlockCover;
        TL_iv.PageBlock pageBlock2 = z11 ? ((TL_iv.pageBlockCover) pageBlock).cover : pageBlock instanceof b4 ? ((b4) pageBlock).b : pageBlock;
        if (i10 == 92) {
            ((d2) l1Var.a).setBlock((TL_iv.pageBlockMath) pageBlock2);
            return;
        }
        if (i10 == 100) {
            ((TextView) l1Var.a).setText("unsupported block " + pageBlock2);
            return;
        }
        switch (i10) {
            case 0:
                ((f2) l1Var.a).setBlock((TL_iv.pageBlockParagraph) pageBlock2);
                break;
            case 1:
                ((z1) l1Var.a).setBlock(pageBlock2);
                break;
            case 2:
                break;
            case 3:
                w1 w1Var = (w1) l1Var.a;
                TL_iv.pageBlockEmbed pageblockembed = (TL_iv.pageBlockEmbed) pageBlock2;
                TL_iv.pageBlockEmbed pageblockembed2 = w1Var.v;
                w1Var.v = pageblockembed;
                v1 v1Var = w1Var.a;
                if (v1Var != null) {
                    photo = null;
                    r10 = 0;
                    v1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                } else {
                    photo = null;
                    r10 = 0;
                }
                TL_iv.pageBlockEmbed pageblockembed3 = w1Var.v;
                if (pageblockembed2 != pageblockembed3) {
                    w1Var.s = r10;
                    v1 v1Var2 = w1Var.a;
                    if (v1Var2 != 0) {
                        if (pageblockembed3.allow_scrolling) {
                            v1Var2.setVerticalScrollBarEnabled(true);
                            w1Var.a.setHorizontalScrollBarEnabled(true);
                        } else {
                            v1Var2.setVerticalScrollBarEnabled(r10);
                            w1Var.a.setHorizontalScrollBarEnabled(r10);
                        }
                    }
                    w1Var.r = r10;
                    v1 v1Var3 = w1Var.a;
                    if (v1Var3 != null) {
                        try {
                            v1Var3.loadUrl("about:blank");
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    try {
                        TL_iv.pageBlockEmbed pageblockembed4 = w1Var.v;
                        String str2 = pageblockembed4.html;
                        if (str2 != null) {
                            v1 v1Var4 = w1Var.a;
                            if (v1Var4 != null) {
                                v1Var4.loadDataWithBaseURL("https://telegram.org/embed", str2, "text/html", "UTF-8", null);
                                w1Var.a.setVisibility(0);
                            }
                            org.telegram.ui.Components.e91 e91Var = w1Var.b;
                            if (e91Var != null) {
                                e91Var.setVisibility(4);
                                w1Var.b.g(null, null, null, null, false);
                            }
                        } else {
                            long j10 = pageblockembed4.poster_photo_id;
                            if (w1Var.b.g(pageblockembed.url, j10 != 0 ? k4.e(w1Var.w.B, j10) : photo, w1Var.w.B, null, false)) {
                                v1 v1Var5 = w1Var.a;
                                if (v1Var5 != null) {
                                    v1Var5.setVisibility(4);
                                    w1Var.a.stopLoading();
                                    w1Var.a.loadUrl("about:blank");
                                }
                                org.telegram.ui.Components.e91 e91Var2 = w1Var.b;
                                if (e91Var2 != null) {
                                    e91Var2.setVisibility(0);
                                }
                            } else {
                                v1 v1Var6 = w1Var.a;
                                if (v1Var6 != null) {
                                    v1Var6.setVisibility(0);
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
                                    w1Var.a.loadUrl(w1Var.v.url, hashMap);
                                }
                                org.telegram.ui.Components.e91 e91Var3 = w1Var.b;
                                if (e91Var3 != null) {
                                    e91Var3.setVisibility(4);
                                    w1Var.b.g(null, null, null, null, false);
                                }
                            }
                        }
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
                w1Var.requestLayout();
                break;
            case 4:
                ((w2) l1Var.a).setBlock((TL_iv.pageBlockSubtitle) pageBlock2);
                break;
            case 5:
                b3 b3Var = (b3) l1Var.a;
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock2;
                b3Var.b(pageblockvideo, (c3) this.I.y.f(pageblockvideo.video_id), z4, i11 == 0);
                TL_iv.pageBlockChannel pageblockchannel = this.C;
                g1 g1Var = b3Var.s;
                b3Var.K = pageBlock;
                if (pageblockchannel != null && z11) {
                    g1Var.setBlock(pageblockchannel);
                    g1Var.setVisibility(0);
                    break;
                }
                break;
            case 6:
                ((l2) l1Var.a).setBlock((TL_iv.pageBlockPullquote) pageBlock2);
                break;
            case 7:
                ((f1) l1Var.a).setBlock((TL_iv.pageBlockBlockquote) pageBlock2);
                break;
            case 8:
                u2 u2Var = (u2) l1Var.a;
                u2Var.d = (TL_iv.pageBlockSlideshow) pageBlock2;
                u2Var.b.g();
                p2 p2Var = u2Var.a;
                p2Var.x(0, false);
                p2Var.forceLayout();
                u2Var.requestLayout();
                break;
            case 9:
                g2 g2Var = (g2) l1Var.a;
                g2Var.a((TL_iv.pageBlockPhoto) pageBlock2, this.B, z4, i11 == 0);
                g2Var.setParentBlock(pageBlock);
                break;
            case 10:
                ((e1) l1Var.a).setBlock((TL_iv.pageBlockAuthorDate) pageBlock2);
                break;
            case 11:
                ((z2) l1Var.a).setBlock((TL_iv.pageBlockTitle) pageBlock2);
                break;
            case 12:
                ((b2) l1Var.a).setBlock((d4) pageBlock2);
                break;
            case 13:
                ((y1) l1Var.a).setBlock((TL_iv.pageBlockFooter) pageBlock2);
                break;
            case 14:
                ((k2) l1Var.a).setBlock((TL_iv.pageBlockPreformatted) pageBlock2);
                break;
            case 15:
                ((v2) l1Var.a).setBlock((TL_iv.pageBlockSubheader) pageBlock2);
                break;
            case 16:
                ((x1) l1Var.a).setBlock((TL_iv.pageBlockEmbedPost) pageBlock2);
                break;
            case 17:
                n1 n1Var = (n1) l1Var.a;
                TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock2;
                if (n1Var.s != pageblockcollage) {
                    n1Var.s = pageblockcollage;
                    m1 m1Var2 = n1Var.v;
                    int i15 = m1Var2.c;
                    ArrayList arrayList = m1Var2.a;
                    arrayList.clear();
                    HashMap hashMap2 = m1Var2.b;
                    hashMap2.clear();
                    n1 n1Var2 = m1Var2.d;
                    TL_iv.pageBlockCollage pageblockcollage2 = n1Var2.s;
                    l4 l4Var = n1Var2.w;
                    int size = pageblockcollage2.items.size();
                    if (size > 1) {
                        StringBuilder sb = new StringBuilder();
                        int i16 = 0;
                        boolean z12 = false;
                        float f14 = 1.0f;
                        while (i16 < size) {
                            TL_iv.PageBlock pageBlock3 = n1Var2.s.items.get(i16);
                            if (pageBlock3 instanceof TL_iv.pageBlockPhoto) {
                                TLRPC.Photo e10 = k4.e(l4Var.B, ((TL_iv.pageBlockPhoto) pageBlock3).photo_id);
                                if (e10 == null) {
                                    i16++;
                                } else {
                                    closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(e10.sizes, AndroidUtilities.getPhotoSize());
                                    MessageObject.GroupedMessagePosition groupedMessagePosition = new MessageObject.GroupedMessagePosition();
                                    groupedMessagePosition.last = i16 != size + (-1);
                                    f12 = closestPhotoSizeWithSize != null ? 1.0f : closestPhotoSizeWithSize.w / closestPhotoSizeWithSize.h;
                                    groupedMessagePosition.aspectRatio = f12;
                                    if (f12 <= 1.2f) {
                                        sb.append("w");
                                    } else if (f12 < 0.8f) {
                                        sb.append("n");
                                    } else {
                                        sb.append("q");
                                    }
                                    f13 = groupedMessagePosition.aspectRatio;
                                    f14 += f13;
                                    if (f13 > 2.0f) {
                                        z12 = true;
                                    }
                                    hashMap2.put(pageBlock3, groupedMessagePosition);
                                    arrayList.add(groupedMessagePosition);
                                    i16++;
                                }
                            } else {
                                if ((pageBlock3 instanceof TL_iv.pageBlockVideo) && (a2 = k4.a(l4Var.B, ((TL_iv.pageBlockVideo) pageBlock3).video_id)) != null) {
                                    closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(a2.thumbs, 90);
                                    MessageObject.GroupedMessagePosition groupedMessagePosition2 = new MessageObject.GroupedMessagePosition();
                                    groupedMessagePosition2.last = i16 != size + (-1);
                                    if (closestPhotoSizeWithSize != null) {
                                    }
                                    groupedMessagePosition2.aspectRatio = f12;
                                    if (f12 <= 1.2f) {
                                    }
                                    f13 = groupedMessagePosition2.aspectRatio;
                                    f14 += f13;
                                    if (f13 > 2.0f) {
                                    }
                                    hashMap2.put(pageBlock3, groupedMessagePosition2);
                                    arrayList.add(groupedMessagePosition2);
                                }
                                i16++;
                            }
                        }
                        int dp = AndroidUtilities.dp(120.0f);
                        float dp2 = AndroidUtilities.dp(120.0f);
                        Point point = AndroidUtilities.displaySize;
                        float f15 = i15;
                        int min = (int) (dp2 / (Math.min(point.x, point.y) / f15));
                        float dp3 = AndroidUtilities.dp(40.0f);
                        Point point2 = AndroidUtilities.displaySize;
                        int min2 = (int) (dp3 / (Math.min(point2.x, point2.y) / f15));
                        float f16 = f15 / 814.0f;
                        float f17 = f14 / size;
                        if (z12 || !(size == 2 || size == 3 || size == 4)) {
                            int size2 = arrayList.size();
                            float[] fArr = new float[size2];
                            for (int i17 = 0; i17 < size; i17++) {
                                if (f17 > 1.1f) {
                                    fArr[i17] = Math.max(1.0f, ((MessageObject.GroupedMessagePosition) arrayList.get(i17)).aspectRatio);
                                } else {
                                    fArr[i17] = Math.min(1.0f, ((MessageObject.GroupedMessagePosition) arrayList.get(i17)).aspectRatio);
                                }
                                fArr[i17] = Math.max(0.66667f, Math.min(1.7f, fArr[i17]));
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (int i18 = 1; i18 < size2; i18++) {
                                int i19 = size2 - i18;
                                if (i18 <= 3 && i19 <= 3) {
                                    float a10 = m1Var2.a(fArr, 0, i18);
                                    float a11 = m1Var2.a(fArr, i18, size2);
                                    l1 l1Var2 = new l1();
                                    l1Var2.a = new int[]{i18, i19};
                                    l1Var2.b = new float[]{a10, a11};
                                    arrayList2.add(l1Var2);
                                }
                            }
                            for (int i20 = 1; i20 < size2 - 1; i20++) {
                                int i21 = 1;
                                while (true) {
                                    int i22 = size2 - i20;
                                    if (i21 < i22) {
                                        int i23 = i22 - i21;
                                        if (i20 <= 3) {
                                            if (i21 <= (f17 < 0.85f ? 4 : 3) && i23 <= 3) {
                                                float a12 = m1Var2.a(fArr, 0, i20);
                                                int i24 = i20 + i21;
                                                float a13 = m1Var2.a(fArr, i20, i24);
                                                float a14 = m1Var2.a(fArr, i24, size2);
                                                l1 l1Var3 = new l1();
                                                l1Var3.a = new int[]{i20, i21, i23};
                                                i14 = i15;
                                                l1Var3.b = new float[]{a12, a13, a14};
                                                arrayList2.add(l1Var3);
                                                i21++;
                                                i15 = i14;
                                            }
                                        }
                                        i14 = i15;
                                        i21++;
                                        i15 = i14;
                                    }
                                }
                            }
                            int i25 = i15;
                            for (int i26 = 1; i26 < size2 - 2; i26++) {
                                int i27 = 1;
                                while (true) {
                                    int i28 = size2 - i26;
                                    if (i27 < i28) {
                                        int i29 = 1;
                                        while (true) {
                                            int i30 = i28 - i27;
                                            if (i29 < i30) {
                                                int i31 = i30 - i29;
                                                if (i26 > 3 || i27 > 3 || i29 > 3 || i31 > 3) {
                                                    m1Var = m1Var2;
                                                    i13 = i28;
                                                } else {
                                                    float a15 = m1Var2.a(fArr, 0, i26);
                                                    int i32 = i26 + i27;
                                                    float a16 = m1Var2.a(fArr, i26, i32);
                                                    i13 = i28;
                                                    int i33 = i32 + i29;
                                                    float a17 = m1Var2.a(fArr, i32, i33);
                                                    float a18 = m1Var2.a(fArr, i33, size2);
                                                    l1 l1Var4 = new l1();
                                                    l1Var4.a = new int[]{i26, i27, i29, i31};
                                                    m1Var = m1Var2;
                                                    l1Var4.b = new float[]{a15, a16, a17, a18};
                                                    arrayList2.add(l1Var4);
                                                }
                                                i29++;
                                                i28 = i13;
                                                m1Var2 = m1Var;
                                            }
                                        }
                                        i27++;
                                    }
                                }
                            }
                            float f18 = (i25 / 3) * 4;
                            l1 l1Var5 = null;
                            int i34 = 0;
                            float f19 = 0.0f;
                            while (i34 < arrayList2.size()) {
                                l1 l1Var6 = (l1) arrayList2.get(i34);
                                float f20 = Float.MAX_VALUE;
                                int i35 = 0;
                                float f21 = 0.0f;
                                while (true) {
                                    float[] fArr2 = l1Var6.b;
                                    float f22 = f18;
                                    if (i35 < fArr2.length) {
                                        float f23 = fArr2[i35];
                                        f21 += f23;
                                        if (f23 < f20) {
                                            f20 = f23;
                                        }
                                        i35++;
                                        f18 = f22;
                                    } else {
                                        float abs = Math.abs(f21 - f22);
                                        int[] iArr = l1Var6.a;
                                        if (iArr.length > 1) {
                                            int i36 = iArr[0];
                                            int i37 = iArr[1];
                                            if (i36 <= i37) {
                                                f10 = abs;
                                                if (iArr.length <= 2 || i37 <= iArr[2]) {
                                                    if (iArr.length > 3) {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                f10 = abs;
                                            }
                                            f11 = f10 * 1.2f;
                                            if (f20 < min) {
                                                f11 *= 1.5f;
                                            }
                                            if (l1Var5 != null || f11 < f19) {
                                                f19 = f11;
                                                l1Var5 = l1Var6;
                                            }
                                            i34++;
                                            f18 = f22;
                                        } else {
                                            f10 = abs;
                                        }
                                        f11 = f10;
                                        if (f20 < min) {
                                        }
                                        if (l1Var5 != null) {
                                        }
                                        f19 = f11;
                                        l1Var5 = l1Var6;
                                        i34++;
                                        f18 = f22;
                                    }
                                }
                            }
                            if (l1Var5 != null) {
                                int[] iArr2 = l1Var5.a;
                                int i38 = 0;
                                int i39 = 0;
                                while (i38 < iArr2.length) {
                                    int i40 = iArr2[i38];
                                    float f24 = l1Var5.b[i38];
                                    int i41 = i39;
                                    int i42 = i25;
                                    MessageObject.GroupedMessagePosition groupedMessagePosition3 = null;
                                    int i43 = 0;
                                    while (i43 < i40) {
                                        int i44 = (int) (fArr[i41] * f24);
                                        i42 -= i44;
                                        MessageObject.GroupedMessagePosition groupedMessagePosition4 = (MessageObject.GroupedMessagePosition) arrayList.get(i41);
                                        int i45 = i38 == 0 ? 4 : 0;
                                        l1 l1Var7 = l1Var5;
                                        if (i38 == iArr2.length - 1) {
                                            i45 |= 8;
                                        }
                                        if (i43 == 0) {
                                            i45 |= 1;
                                        }
                                        if (i43 == i40 - 1) {
                                            i45 |= 2;
                                            groupedMessagePosition3 = groupedMessagePosition4;
                                        }
                                        int i46 = i43;
                                        groupedMessagePosition4.set(i46, i43, i38, i38, i44, f24 / 814.0f, i45);
                                        i41++;
                                        i43 = i46 + 1;
                                        l1Var5 = l1Var7;
                                    }
                                    groupedMessagePosition3.pw += i42;
                                    groupedMessagePosition3.spanSize += i42;
                                    i38++;
                                    l1Var5 = l1Var5;
                                    i39 = i41;
                                }
                            }
                        } else if (size == 2) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition5 = (MessageObject.GroupedMessagePosition) arrayList.get(0);
                            MessageObject.GroupedMessagePosition groupedMessagePosition6 = (MessageObject.GroupedMessagePosition) arrayList.get(1);
                            String sb2 = sb.toString();
                            if (sb2.equals("ww")) {
                                if (f17 > f16 * 1.4d) {
                                    float f25 = groupedMessagePosition5.aspectRatio;
                                    float f26 = groupedMessagePosition6.aspectRatio;
                                    if (f25 - f26 < 0.2d) {
                                        float round = Math.round(Math.min(f15 / f25, Math.min(f15 / f26, 407.0f))) / 814.0f;
                                        groupedMessagePosition5.set(0, 0, 0, 0, m1Var2.c, round, 7);
                                        groupedMessagePosition6.set(0, 0, 1, 1, m1Var2.c, round, 11);
                                    }
                                }
                                str = sb2;
                            } else {
                                str = sb2;
                            }
                            if (str.equals("ww") || str.equals("qq")) {
                                int i47 = i15 / 2;
                                float f27 = i47;
                                float round2 = Math.round(Math.min(f27 / groupedMessagePosition5.aspectRatio, Math.min(f27 / groupedMessagePosition6.aspectRatio, 814.0f))) / 814.0f;
                                groupedMessagePosition5.set(0, 0, 0, 0, i47, round2, 13);
                                groupedMessagePosition6.set(1, 1, 0, 0, i47, round2, 14);
                            } else {
                                float f28 = groupedMessagePosition5.aspectRatio;
                                int max = (int) Math.max(f15 * 0.4f, Math.round((f15 / f28) / ((1.0f / groupedMessagePosition6.aspectRatio) + (1.0f / f28))));
                                int i48 = i15 - max;
                                if (i48 < min) {
                                    max -= min - i48;
                                } else {
                                    min = i48;
                                }
                                float min3 = Math.min(814.0f, Math.round(Math.min(min / groupedMessagePosition5.aspectRatio, max / groupedMessagePosition6.aspectRatio))) / 814.0f;
                                groupedMessagePosition5.set(0, 0, 0, 0, min, min3, 13);
                                groupedMessagePosition6.set(1, 1, 0, 0, max, min3, 14);
                            }
                        } else if (size == 3) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition7 = (MessageObject.GroupedMessagePosition) arrayList.get(0);
                            MessageObject.GroupedMessagePosition groupedMessagePosition8 = (MessageObject.GroupedMessagePosition) arrayList.get(1);
                            MessageObject.GroupedMessagePosition groupedMessagePosition9 = (MessageObject.GroupedMessagePosition) arrayList.get(2);
                            if (sb.charAt(0) == 'n') {
                                float f29 = groupedMessagePosition8.aspectRatio;
                                float min4 = Math.min(407.0f, Math.round((f29 * f15) / (groupedMessagePosition9.aspectRatio + f29)));
                                int max2 = (int) Math.max(min, Math.min(f15 * 0.5f, Math.round(Math.min(groupedMessagePosition9.aspectRatio * min4, groupedMessagePosition8.aspectRatio * r10))));
                                int round3 = Math.round(Math.min((groupedMessagePosition7.aspectRatio * 814.0f) + min2, i15 - max2));
                                groupedMessagePosition7.set(0, 0, 0, 1, round3, 1.0f, 13);
                                float f30 = (814.0f - min4) / 814.0f;
                                groupedMessagePosition8.set(1, 1, 0, 0, max2, f30, 6);
                                float f31 = min4 / 814.0f;
                                groupedMessagePosition9.set(0, 1, 1, 1, max2, f31, 10);
                                groupedMessagePosition9.spanSize = i15;
                                groupedMessagePosition7.siblingHeights = new float[]{f31, f30};
                                groupedMessagePosition8.spanSize = i15 - round3;
                                groupedMessagePosition9.leftSpanOffset = round3;
                            } else {
                                float round4 = Math.round(Math.min(f15 / groupedMessagePosition7.aspectRatio, 537.24005f)) / 814.0f;
                                groupedMessagePosition7.set(0, 1, 0, 0, m1Var2.c, round4, 7);
                                int i49 = i15 / 2;
                                float f32 = i49;
                                float min5 = Math.min(814.0f - round4, Math.round(Math.min(f32 / groupedMessagePosition8.aspectRatio, f32 / groupedMessagePosition9.aspectRatio))) / 814.0f;
                                groupedMessagePosition8.set(0, 0, 1, 1, i49, min5, 9);
                                groupedMessagePosition9.set(1, 1, 1, 1, i49, min5, 10);
                            }
                        } else if (size == 4) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition10 = (MessageObject.GroupedMessagePosition) arrayList.get(0);
                            MessageObject.GroupedMessagePosition groupedMessagePosition11 = (MessageObject.GroupedMessagePosition) arrayList.get(1);
                            MessageObject.GroupedMessagePosition groupedMessagePosition12 = (MessageObject.GroupedMessagePosition) arrayList.get(2);
                            MessageObject.GroupedMessagePosition groupedMessagePosition13 = (MessageObject.GroupedMessagePosition) arrayList.get(3);
                            if (sb.charAt(0) == 'w') {
                                float round5 = Math.round(Math.min(f15 / groupedMessagePosition10.aspectRatio, 537.24005f)) / 814.0f;
                                groupedMessagePosition10.set(0, 2, 0, 0, m1Var2.c, round5, 7);
                                float round6 = Math.round(f15 / ((groupedMessagePosition11.aspectRatio + groupedMessagePosition12.aspectRatio) + groupedMessagePosition13.aspectRatio));
                                float f33 = min;
                                int max3 = (int) Math.max(f33, Math.min(f15 * 0.4f, groupedMessagePosition11.aspectRatio * round6));
                                int max4 = (int) Math.max(Math.max(f33, 0.33f * f15), groupedMessagePosition13.aspectRatio * round6);
                                float min6 = Math.min(814.0f - round5, round6) / 814.0f;
                                groupedMessagePosition11.set(0, 0, 1, 1, max3, min6, 9);
                                groupedMessagePosition12.set(1, 1, 1, 1, (i15 - max3) - max4, min6, 8);
                                groupedMessagePosition13.set(2, 2, 1, 1, max4, min6, 10);
                            } else {
                                int max5 = Math.max(min, Math.round(814.0f / ((1.0f / ((MessageObject.GroupedMessagePosition) arrayList.get(3)).aspectRatio) + ((1.0f / groupedMessagePosition12.aspectRatio) + (1.0f / groupedMessagePosition11.aspectRatio)))));
                                float f34 = dp;
                                float f35 = max5;
                                float min7 = Math.min(0.33f, Math.max(f34, f35 / groupedMessagePosition11.aspectRatio) / 814.0f);
                                float min8 = Math.min(0.33f, Math.max(f34, f35 / groupedMessagePosition12.aspectRatio) / 814.0f);
                                float f36 = (1.0f - min7) - min8;
                                int round7 = Math.round(Math.min((814.0f * groupedMessagePosition10.aspectRatio) + min2, i15 - max5));
                                groupedMessagePosition10.set(0, 0, 0, 2, round7, min7 + min8 + f36, 13);
                                groupedMessagePosition11.set(1, 1, 0, 0, max5, min7, 6);
                                groupedMessagePosition12.set(0, 1, 1, 1, max5, min8, 2);
                                groupedMessagePosition12.spanSize = i15;
                                groupedMessagePosition13.set(0, 1, 2, 2, max5, f36, 10);
                                groupedMessagePosition13.spanSize = i15;
                                groupedMessagePosition11.spanSize = i15 - round7;
                                groupedMessagePosition12.leftSpanOffset = round7;
                                groupedMessagePosition13.leftSpanOffset = round7;
                                groupedMessagePosition10.siblingHeights = new float[]{min7, min8, f36};
                            }
                        }
                        for (int i50 = 0; i50 < size; i50++) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition14 = (MessageObject.GroupedMessagePosition) arrayList.get(i50);
                            if ((groupedMessagePosition14.flags & 1) != 0) {
                                groupedMessagePosition14.edge = true;
                            }
                        }
                    }
                }
                n1Var.b.l();
                n1Var.a.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                n1Var.requestLayout();
                break;
            case 18:
                ((g1) l1Var.a).setBlock((TL_iv.pageBlockChannel) pageBlock2);
                break;
            case 19:
                d1 d1Var = (d1) l1Var.a;
                TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock2;
                z10 = i11 == 0;
                p70 p70Var = d1Var.a;
                d1Var.H = pageblockaudio;
                MessageObject messageObject = (MessageObject) d1Var.b.s.get(pageblockaudio);
                d1Var.J = messageObject;
                if (messageObject != null) {
                    d1Var.I = messageObject.getDocument();
                }
                d1Var.h = z10;
                org.telegram.ui.Components.fo0 fo0Var = d1Var.f;
                int i51 = org.telegram.ui.ActionBar.j6.ud;
                ((n4) p70Var).getClass();
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i51, false);
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.vd, false);
                int i52 = org.telegram.ui.ActionBar.j6.xd;
                fo0Var.h(w02, w03, org.telegram.ui.ActionBar.j6.w0(null, i52, false), org.telegram.ui.ActionBar.j6.w0(null, i52, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.wd, false));
                d1Var.a(false);
                d1Var.requestLayout();
                break;
            case 20:
                ((a2) l1Var.a).setBlock((TL_iv.pageBlockKicker) pageBlock2);
                break;
            case 21:
                ((e2) l1Var.a).setBlock((f4) pageBlock2);
                break;
            case 22:
                c2 c2Var = (c2) l1Var.a;
                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock2;
                z10 = i11 == 0;
                c2Var.x = pageblockmap;
                c2Var.h = z10;
                c2Var.requestLayout();
                break;
            case 23:
                m2 m2Var = (m2) l1Var.a;
                TLRPC.WebPage webPage = this.B;
                m2Var.n = (h4) pageBlock2;
                m2Var.r = webPage;
                m2Var.requestLayout();
                break;
            case 24:
                ((p1) l1Var.a).setBlock((TL_iv.pageBlockDetails) pageBlock2);
                break;
            case 25:
                ((y2) l1Var.a).setBlock((TL_iv.pageBlockTable) pageBlock2);
                break;
            case 26:
                ((n2) l1Var.a).setBlock((TL_iv.pageBlockRelatedArticles) pageBlock2);
                break;
            case 27:
                break;
        }
    }

    public final boolean J(b4 b4Var) {
        TL_iv.PageBlock z4 = n4.z(b4Var.a);
        if (z4 instanceof TL_iv.pageBlockDetails) {
            return ((TL_iv.pageBlockDetails) z4).open;
        }
        if (!(z4 instanceof b4)) {
            return false;
        }
        b4 b4Var2 = (b4) z4;
        TL_iv.PageBlock z10 = n4.z(b4Var2.b);
        if (!(z10 instanceof TL_iv.pageBlockDetails) || ((TL_iv.pageBlockDetails) z10).open) {
            return J(b4Var2);
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
        if (n4.K(pageBlock)) {
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
        if (pageBlock instanceof d4) {
            d4 d4Var = (d4) pageBlock;
            TL_iv.RichText richText2 = d4Var.e;
            if (richText2 != null) {
                L(null, richText2);
                G(d4Var.e, d4Var);
                return;
            } else {
                TL_iv.PageBlock pageBlock10 = d4Var.d;
                if (pageBlock10 != null) {
                    K(pageBlock10);
                    return;
                }
                return;
            }
        }
        if (pageBlock instanceof f4) {
            f4 f4Var = (f4) pageBlock;
            TL_iv.RichText richText3 = f4Var.e;
            if (richText3 != null) {
                L(null, richText3);
                G(f4Var.e, f4Var);
                return;
            } else {
                TL_iv.PageBlock pageBlock11 = f4Var.d;
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
            boolean z4 = richText3 instanceof TL_iv.textPlain;
            HashMap hashMap = this.r;
            if (z4) {
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
            TL_iv.PageBlock z4 = n4.z(pageBlock);
            if (!(z4 instanceof b4) || J((b4) z4)) {
                arrayList.add(pageBlock);
            }
        }
        if (arrayList.size() < 100) {
            Utilities.globalQueue.cancelRunnable(this.H);
            Utilities.globalQueue.postRunnable(this.H, 100L);
        }
    }

    @Override // f2.o0
    public final int h() {
        int i10;
        TLRPC.WebPage webPage = this.B;
        if (webPage == null || webPage.cached_page == null) {
            i10 = 0;
        } else {
            i10 = this.d.size();
            if (this.B.cached_page.local == null) {
                i10++;
            }
        }
        return this.E ? i10 + 1 : i10;
    }

    @Override // f2.o0
    public final int j(int i10) {
        TL_iv.Page page;
        if (this.E) {
            if (i10 == 0) {
                return 2147483646;
            }
            i10--;
        }
        ArrayList arrayList = this.d;
        if (i10 != arrayList.size()) {
            return I((TL_iv.PageBlock) arrayList.get(i10));
        }
        TLRPC.WebPage webPage = this.B;
        return (webPage == null || (page = webPage.cached_page) == null || !page.web) ? 90 : 91;
    }

    @Override // f2.o0
    public final void l() {
        M();
        super.l();
    }

    @Override // f2.o0
    public final void m(int i10) {
        M();
        super.m(i10);
    }

    @Override // f2.o0
    public final void p(int i10, int i11) {
        M();
        super.p(i10, i11);
    }

    @Override // f2.o0
    public final void q(int i10, int i11) {
        M();
        super.q(i10, i11);
    }

    @Override // f2.o0
    public final void r(int i10, int i11, Object obj) {
        M();
        super.r(i10, i11, obj);
    }

    @Override // f2.o0
    public final void s(int i10, int i11) {
        M();
        super.s(i10, i11);
    }

    @Override // f2.o0
    public final void t(int i10, int i11) {
        M();
        super.t(i10, i11);
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        if (this.E) {
            i10--;
        }
        int i11 = i10;
        if (i11 >= 0) {
            ArrayList arrayList = this.d;
            if (i11 < arrayList.size()) {
                H(l1Var.f, l1Var, (TL_iv.PageBlock) arrayList.get(i11), i11, arrayList.size(), false);
            }
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        View b3Var;
        Context context = this.c;
        if (i10 != 2147483646) {
            n4 n4Var = this.I;
            switch (i10) {
                case 0:
                    view = new f2(context, n4Var, this);
                    break;
                case 1:
                    view = new z1(context, n4Var, this);
                    break;
                case 2:
                    view = new q1(context);
                    break;
                case 3:
                    view = new w1(n4Var, context, this);
                    break;
                case 4:
                    view = new w2(context, n4Var, this);
                    break;
                case 5:
                    b3Var = new b3(context, n4Var, this, 0);
                    view = b3Var;
                    break;
                case 6:
                    view = new l2(context, n4Var, this);
                    break;
                case 7:
                    view = new f1(context, n4Var, this);
                    break;
                case 8:
                    view = new u2(n4Var, context, this);
                    break;
                case 9:
                    b3Var = new g2(context, n4Var, this, 0);
                    view = b3Var;
                    break;
                case 10:
                    view = new e1(context, n4Var, this);
                    break;
                case 11:
                    view = new z2(context, n4Var, this);
                    break;
                case 12:
                    view = new b2(context, n4Var, this);
                    break;
                case 13:
                    view = new y1(context, n4Var, this);
                    break;
                case 14:
                    view = new k2(context, n4Var, this);
                    break;
                case 15:
                    view = new v2(context, n4Var, this);
                    break;
                case 16:
                    view = new x1(context, n4Var, this);
                    break;
                case 17:
                    view = new n1(n4Var, context, this);
                    break;
                case 18:
                    b3Var = new g1(context, n4Var, this, 0);
                    view = b3Var;
                    break;
                case 19:
                    view = new d1(context, n4Var, this);
                    break;
                case 20:
                    view = new a2(context, n4Var, this);
                    break;
                case 21:
                    view = new e2(context, n4Var, this);
                    break;
                case 22:
                    view = new c2(context, n4Var, this);
                    break;
                case 23:
                    view = new m2(context, n4Var, this);
                    break;
                case 24:
                    view = new p1(context, n4Var, this);
                    break;
                case 25:
                    view = new y2(context, n4Var, this);
                    break;
                case 26:
                    view = new n2(context, n4Var, this);
                    break;
                case 27:
                    View o1Var = new o1(context);
                    new RectF();
                    o1Var.setImportantForAccessibility(2);
                    view = o1Var;
                    break;
                case 28:
                    view = new o2(context, n4Var);
                    break;
                default:
                    switch (i10) {
                        case 90:
                            b3Var = new u3(n4Var, context, false);
                            view = b3Var;
                            break;
                        case 91:
                            view = new u3(n4Var, context, true);
                            break;
                        case 92:
                            view = new d2(context, n4Var);
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
            View gnVar = new org.telegram.ui.Components.gn(context, 5);
            gnVar.setImportantForAccessibility(2);
            view = gnVar;
        }
        view.setLayoutParams(new f2.w0(-1, -2));
        view.setFocusable(true);
        return new org.telegram.ui.Components.dl0(view);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        int i10 = l1Var.f;
        if (i10 == 90 || i10 == 91) {
            u3 u3Var = (u3) l1Var.a;
            TL_iv.Page page = this.B.cached_page;
            int i11 = page != null ? page.views : 0;
            n4 n4Var = u3Var.e;
            TextView textView = u3Var.a;
            TextView textView2 = u3Var.b;
            if (i11 == 0) {
                u3Var.c = false;
                textView2.setVisibility(8);
                textView.setGravity(17);
            } else {
                u3Var.c = true;
                textView2.setVisibility(0);
                textView.setGravity(21);
                textView2.setText(LocaleController.formatPluralStringComma("Views", i11));
            }
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.M6, false);
            textView.setTextColor(n4Var.a());
            textView2.setTextColor(n4Var.a());
            textView.setBackgroundColor(Color.argb(34, Color.red(w02), Color.green(w02), Color.blue(w02)));
        }
    }
}
