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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j4 extends org.telegram.ui.Components.vk0 {
    public TLRPC.WebPage A;
    public TL_iv.pageBlockChannel B;
    public boolean C;
    public final boolean D;
    public int[] E;
    public int F;
    public final /* synthetic */ l4 H;
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
    public final kt0 G = new kt0(this, 11);

    public j4(l4 l4Var, Context context, boolean z10) {
        this.H = l4Var;
        this.c = context;
        this.D = z10;
    }

    public static int I(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            return 0;
        }
        if ((pageBlock instanceof TL_iv.pageBlockHeader) || l4.K(pageBlock)) {
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
        if (pageBlock instanceof b4) {
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
        if (pageBlock instanceof d4) {
            return 21;
        }
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            return 22;
        }
        if (pageBlock instanceof f4) {
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
        if (pageBlock instanceof g4) {
            return 28;
        }
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            return 92;
        }
        if (pageBlock instanceof z3) {
            return I(((z3) pageBlock).b);
        }
        if (pageBlock instanceof TL_iv.pageBlockCover) {
            return I(((TL_iv.pageBlockCover) pageBlock).cover);
        }
        return 100;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 23 || i9 == 24;
    }

    public final void E(TL_iv.PageBlock pageBlock, j4 j4Var) {
        boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
        ArrayList arrayList = this.f;
        if (z10) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            TLRPC.Photo e10 = i4.e(this.A, pageblockphoto.photo_id);
            if (e10 != null) {
                pageblockphoto.thumb = FileLoader.getClosestPhotoSizeWithSize(e10.sizes, 56, true);
                pageblockphoto.thumbObject = e10;
                arrayList.add(pageBlock);
                return;
            }
            return;
        }
        if ((pageBlock instanceof TL_iv.pageBlockVideo) && i4.g(j4Var.A, pageBlock)) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            TLRPC.Document a2 = i4.a(this.A, pageblockvideo.video_id);
            if (a2 != null) {
                pageblockvideo.thumb = FileLoader.getClosestPhotoSizeWithSize(a2.thumbs, 56, true);
                pageblockvideo.thumbObject = a2;
                arrayList.add(pageBlock);
                return;
            }
            return;
        }
        boolean z11 = pageBlock instanceof TL_iv.pageBlockSlideshow;
        int i9 = 0;
        l4 l4Var = this.H;
        if (z11) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            int size = pageblockslideshow.items.size();
            while (i9 < size) {
                TL_iv.PageBlock pageBlock2 = pageblockslideshow.items.get(i9);
                pageBlock2.groupId = l4Var.U;
                E(pageBlock2, j4Var);
                i9++;
            }
            l4Var.U++;
            return;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockCollage)) {
            if (pageBlock instanceof TL_iv.pageBlockCover) {
                E(((TL_iv.pageBlockCover) pageBlock).cover, j4Var);
                return;
            }
            return;
        }
        TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
        int size2 = pageblockcollage.items.size();
        while (i9 < size2) {
            TL_iv.PageBlock pageBlock3 = pageblockcollage.items.get(i9);
            pageBlock3.groupId = l4Var.U;
            E(pageBlock3, j4Var);
            i9++;
        }
        l4Var.U++;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void F(org.telegram.ui.j4 r24, org.telegram.tgnet.tl.TL_iv.PageBlock r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j4.F(org.telegram.ui.j4, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, int):void");
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
    public final void H(int i9, f2.q1 q1Var, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10) {
        TLRPC.Photo photo;
        ?? r10;
        float f10;
        float f11;
        l1 l1Var;
        int i12;
        int i13;
        String str;
        TLRPC.Document a2;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        float f12;
        float f13;
        boolean z11;
        boolean z12 = pageBlock instanceof TL_iv.pageBlockCover;
        TL_iv.PageBlock pageBlock2 = z12 ? ((TL_iv.pageBlockCover) pageBlock).cover : pageBlock instanceof z3 ? ((z3) pageBlock).b : pageBlock;
        if (i9 == 92) {
            ((c2) q1Var.a).setBlock((TL_iv.pageBlockMath) pageBlock2);
            return;
        }
        if (i9 == 100) {
            ((TextView) q1Var.a).setText("unsupported block " + pageBlock2);
            return;
        }
        switch (i9) {
            case 0:
                ((e2) q1Var.a).setBlock((TL_iv.pageBlockParagraph) pageBlock2);
                break;
            case 1:
                ((y1) q1Var.a).setBlock(pageBlock2);
                break;
            case 2:
                break;
            case 3:
                v1 v1Var = (v1) q1Var.a;
                TL_iv.pageBlockEmbed pageblockembed = (TL_iv.pageBlockEmbed) pageBlock2;
                TL_iv.pageBlockEmbed pageblockembed2 = v1Var.v;
                v1Var.v = pageblockembed;
                u1 u1Var = v1Var.a;
                if (u1Var != null) {
                    photo = null;
                    r10 = 0;
                    u1Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                } else {
                    photo = null;
                    r10 = 0;
                }
                TL_iv.pageBlockEmbed pageblockembed3 = v1Var.v;
                if (pageblockembed2 != pageblockembed3) {
                    v1Var.s = r10;
                    u1 u1Var2 = v1Var.a;
                    if (u1Var2 != 0) {
                        if (pageblockembed3.allow_scrolling) {
                            u1Var2.setVerticalScrollBarEnabled(true);
                            v1Var.a.setHorizontalScrollBarEnabled(true);
                        } else {
                            u1Var2.setVerticalScrollBarEnabled(r10);
                            v1Var.a.setHorizontalScrollBarEnabled(r10);
                        }
                    }
                    v1Var.r = r10;
                    u1 u1Var3 = v1Var.a;
                    if (u1Var3 != null) {
                        try {
                            u1Var3.loadUrl("about:blank");
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                    try {
                        TL_iv.pageBlockEmbed pageblockembed4 = v1Var.v;
                        String str2 = pageblockembed4.html;
                        if (str2 != null) {
                            u1 u1Var4 = v1Var.a;
                            if (u1Var4 != null) {
                                u1Var4.loadDataWithBaseURL("https://telegram.org/embed", str2, "text/html", "UTF-8", null);
                                v1Var.a.setVisibility(0);
                            }
                            org.telegram.ui.Components.g81 g81Var = v1Var.b;
                            if (g81Var != null) {
                                g81Var.setVisibility(4);
                                v1Var.b.g(null, null, null, null, false);
                            }
                        } else {
                            long j10 = pageblockembed4.poster_photo_id;
                            if (v1Var.b.g(pageblockembed.url, j10 != 0 ? i4.e(v1Var.w.A, j10) : photo, v1Var.w.A, null, false)) {
                                u1 u1Var5 = v1Var.a;
                                if (u1Var5 != null) {
                                    u1Var5.setVisibility(4);
                                    v1Var.a.stopLoading();
                                    v1Var.a.loadUrl("about:blank");
                                }
                                org.telegram.ui.Components.g81 g81Var2 = v1Var.b;
                                if (g81Var2 != null) {
                                    g81Var2.setVisibility(0);
                                }
                            } else {
                                u1 u1Var6 = v1Var.a;
                                if (u1Var6 != null) {
                                    u1Var6.setVisibility(0);
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
                                    v1Var.a.loadUrl(v1Var.v.url, hashMap);
                                }
                                org.telegram.ui.Components.g81 g81Var3 = v1Var.b;
                                if (g81Var3 != null) {
                                    g81Var3.setVisibility(4);
                                    v1Var.b.g(null, null, null, null, false);
                                }
                            }
                        }
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
                v1Var.requestLayout();
                break;
            case 4:
                ((v2) q1Var.a).setBlock((TL_iv.pageBlockSubtitle) pageBlock2);
                break;
            case 5:
                a3 a3Var = (a3) q1Var.a;
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock2;
                a3Var.b(pageblockvideo, (b3) this.H.y.f(pageblockvideo.video_id), z10, i10 == 0);
                TL_iv.pageBlockChannel pageblockchannel = this.B;
                f1 f1Var = a3Var.s;
                a3Var.J = pageBlock;
                if (pageblockchannel != null && z12) {
                    f1Var.setBlock(pageblockchannel);
                    f1Var.setVisibility(0);
                    break;
                }
                break;
            case 6:
                ((k2) q1Var.a).setBlock((TL_iv.pageBlockPullquote) pageBlock2);
                break;
            case 7:
                ((e1) q1Var.a).setBlock((TL_iv.pageBlockBlockquote) pageBlock2);
                break;
            case 8:
                t2 t2Var = (t2) q1Var.a;
                t2Var.d = (TL_iv.pageBlockSlideshow) pageBlock2;
                t2Var.b.g();
                o2 o2Var = t2Var.a;
                o2Var.x(0, false);
                o2Var.forceLayout();
                t2Var.requestLayout();
                break;
            case 9:
                f2 f2Var = (f2) q1Var.a;
                f2Var.a((TL_iv.pageBlockPhoto) pageBlock2, this.A, z10, i10 == 0);
                f2Var.setParentBlock(pageBlock);
                break;
            case 10:
                ((d1) q1Var.a).setBlock((TL_iv.pageBlockAuthorDate) pageBlock2);
                break;
            case 11:
                ((y2) q1Var.a).setBlock((TL_iv.pageBlockTitle) pageBlock2);
                break;
            case 12:
                ((a2) q1Var.a).setBlock((b4) pageBlock2);
                break;
            case 13:
                ((x1) q1Var.a).setBlock((TL_iv.pageBlockFooter) pageBlock2);
                break;
            case 14:
                ((j2) q1Var.a).setBlock((TL_iv.pageBlockPreformatted) pageBlock2);
                break;
            case 15:
                ((u2) q1Var.a).setBlock((TL_iv.pageBlockSubheader) pageBlock2);
                break;
            case 16:
                ((w1) q1Var.a).setBlock((TL_iv.pageBlockEmbedPost) pageBlock2);
                break;
            case 17:
                m1 m1Var = (m1) q1Var.a;
                TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock2;
                if (m1Var.s != pageblockcollage) {
                    m1Var.s = pageblockcollage;
                    l1 l1Var2 = m1Var.v;
                    int i14 = l1Var2.c;
                    ArrayList arrayList = l1Var2.a;
                    arrayList.clear();
                    HashMap hashMap2 = l1Var2.b;
                    hashMap2.clear();
                    m1 m1Var2 = l1Var2.d;
                    TL_iv.pageBlockCollage pageblockcollage2 = m1Var2.s;
                    j4 j4Var = m1Var2.w;
                    int size = pageblockcollage2.items.size();
                    if (size > 1) {
                        StringBuilder sb2 = new StringBuilder();
                        int i15 = 0;
                        boolean z13 = false;
                        float f14 = 1.0f;
                        while (i15 < size) {
                            TL_iv.PageBlock pageBlock3 = m1Var2.s.items.get(i15);
                            if (pageBlock3 instanceof TL_iv.pageBlockPhoto) {
                                TLRPC.Photo e12 = i4.e(j4Var.A, ((TL_iv.pageBlockPhoto) pageBlock3).photo_id);
                                if (e12 == null) {
                                    i15++;
                                } else {
                                    closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(e12.sizes, AndroidUtilities.getPhotoSize());
                                    MessageObject.GroupedMessagePosition groupedMessagePosition = new MessageObject.GroupedMessagePosition();
                                    groupedMessagePosition.last = i15 != size + (-1);
                                    f12 = closestPhotoSizeWithSize != null ? 1.0f : closestPhotoSizeWithSize.w / closestPhotoSizeWithSize.h;
                                    groupedMessagePosition.aspectRatio = f12;
                                    if (f12 <= 1.2f) {
                                        sb2.append("w");
                                    } else if (f12 < 0.8f) {
                                        sb2.append("n");
                                    } else {
                                        sb2.append("q");
                                    }
                                    f13 = groupedMessagePosition.aspectRatio;
                                    f14 += f13;
                                    if (f13 > 2.0f) {
                                        z13 = true;
                                    }
                                    hashMap2.put(pageBlock3, groupedMessagePosition);
                                    arrayList.add(groupedMessagePosition);
                                    i15++;
                                }
                            } else {
                                if ((pageBlock3 instanceof TL_iv.pageBlockVideo) && (a2 = i4.a(j4Var.A, ((TL_iv.pageBlockVideo) pageBlock3).video_id)) != null) {
                                    closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(a2.thumbs, 90);
                                    MessageObject.GroupedMessagePosition groupedMessagePosition2 = new MessageObject.GroupedMessagePosition();
                                    groupedMessagePosition2.last = i15 != size + (-1);
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
                                i15++;
                            }
                        }
                        int dp = AndroidUtilities.dp(120.0f);
                        float dp2 = AndroidUtilities.dp(120.0f);
                        Point point = AndroidUtilities.displaySize;
                        float f15 = i14;
                        int min = (int) (dp2 / (Math.min(point.x, point.y) / f15));
                        float dp3 = AndroidUtilities.dp(40.0f);
                        Point point2 = AndroidUtilities.displaySize;
                        int min2 = (int) (dp3 / (Math.min(point2.x, point2.y) / f15));
                        float f16 = f15 / 814.0f;
                        float f17 = f14 / size;
                        if (z13 || !(size == 2 || size == 3 || size == 4)) {
                            int size2 = arrayList.size();
                            float[] fArr = new float[size2];
                            for (int i16 = 0; i16 < size; i16++) {
                                if (f17 > 1.1f) {
                                    fArr[i16] = Math.max(1.0f, ((MessageObject.GroupedMessagePosition) arrayList.get(i16)).aspectRatio);
                                } else {
                                    fArr[i16] = Math.min(1.0f, ((MessageObject.GroupedMessagePosition) arrayList.get(i16)).aspectRatio);
                                }
                                fArr[i16] = Math.max(0.66667f, Math.min(1.7f, fArr[i16]));
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (int i17 = 1; i17 < size2; i17++) {
                                int i18 = size2 - i17;
                                if (i17 <= 3 && i18 <= 3) {
                                    float a3 = l1Var2.a(fArr, 0, i17);
                                    float a10 = l1Var2.a(fArr, i17, size2);
                                    k1 k1Var = new k1();
                                    k1Var.a = new int[]{i17, i18};
                                    k1Var.b = new float[]{a3, a10};
                                    arrayList2.add(k1Var);
                                }
                            }
                            for (int i19 = 1; i19 < size2 - 1; i19++) {
                                int i20 = 1;
                                while (true) {
                                    int i21 = size2 - i19;
                                    if (i20 < i21) {
                                        int i22 = i21 - i20;
                                        if (i19 <= 3) {
                                            if (i20 <= (f17 < 0.85f ? 4 : 3) && i22 <= 3) {
                                                float a11 = l1Var2.a(fArr, 0, i19);
                                                int i23 = i19 + i20;
                                                float a12 = l1Var2.a(fArr, i19, i23);
                                                float a13 = l1Var2.a(fArr, i23, size2);
                                                k1 k1Var2 = new k1();
                                                k1Var2.a = new int[]{i19, i20, i22};
                                                i13 = i14;
                                                k1Var2.b = new float[]{a11, a12, a13};
                                                arrayList2.add(k1Var2);
                                                i20++;
                                                i14 = i13;
                                            }
                                        }
                                        i13 = i14;
                                        i20++;
                                        i14 = i13;
                                    }
                                }
                            }
                            int i24 = i14;
                            for (int i25 = 1; i25 < size2 - 2; i25++) {
                                int i26 = 1;
                                while (true) {
                                    int i27 = size2 - i25;
                                    if (i26 < i27) {
                                        int i28 = 1;
                                        while (true) {
                                            int i29 = i27 - i26;
                                            if (i28 < i29) {
                                                int i30 = i29 - i28;
                                                if (i25 > 3 || i26 > 3 || i28 > 3 || i30 > 3) {
                                                    l1Var = l1Var2;
                                                    i12 = i27;
                                                } else {
                                                    float a14 = l1Var2.a(fArr, 0, i25);
                                                    int i31 = i25 + i26;
                                                    float a15 = l1Var2.a(fArr, i25, i31);
                                                    i12 = i27;
                                                    int i32 = i31 + i28;
                                                    float a16 = l1Var2.a(fArr, i31, i32);
                                                    float a17 = l1Var2.a(fArr, i32, size2);
                                                    k1 k1Var3 = new k1();
                                                    k1Var3.a = new int[]{i25, i26, i28, i30};
                                                    l1Var = l1Var2;
                                                    k1Var3.b = new float[]{a14, a15, a16, a17};
                                                    arrayList2.add(k1Var3);
                                                }
                                                i28++;
                                                i27 = i12;
                                                l1Var2 = l1Var;
                                            }
                                        }
                                        i26++;
                                    }
                                }
                            }
                            float f18 = (i24 / 3) * 4;
                            k1 k1Var4 = null;
                            int i33 = 0;
                            float f19 = 0.0f;
                            while (i33 < arrayList2.size()) {
                                k1 k1Var5 = (k1) arrayList2.get(i33);
                                float f20 = Float.MAX_VALUE;
                                int i34 = 0;
                                float f21 = 0.0f;
                                while (true) {
                                    float[] fArr2 = k1Var5.b;
                                    float f22 = f18;
                                    if (i34 < fArr2.length) {
                                        float f23 = fArr2[i34];
                                        f21 += f23;
                                        if (f23 < f20) {
                                            f20 = f23;
                                        }
                                        i34++;
                                        f18 = f22;
                                    } else {
                                        float abs = Math.abs(f21 - f22);
                                        int[] iArr = k1Var5.a;
                                        if (iArr.length > 1) {
                                            int i35 = iArr[0];
                                            int i36 = iArr[1];
                                            if (i35 <= i36) {
                                                f10 = abs;
                                                if (iArr.length <= 2 || i36 <= iArr[2]) {
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
                                            if (k1Var4 != null || f11 < f19) {
                                                f19 = f11;
                                                k1Var4 = k1Var5;
                                            }
                                            i33++;
                                            f18 = f22;
                                        } else {
                                            f10 = abs;
                                        }
                                        f11 = f10;
                                        if (f20 < min) {
                                        }
                                        if (k1Var4 != null) {
                                        }
                                        f19 = f11;
                                        k1Var4 = k1Var5;
                                        i33++;
                                        f18 = f22;
                                    }
                                }
                            }
                            if (k1Var4 != null) {
                                int[] iArr2 = k1Var4.a;
                                int i37 = 0;
                                int i38 = 0;
                                while (i37 < iArr2.length) {
                                    int i39 = iArr2[i37];
                                    float f24 = k1Var4.b[i37];
                                    int i40 = i38;
                                    int i41 = i24;
                                    MessageObject.GroupedMessagePosition groupedMessagePosition3 = null;
                                    int i42 = 0;
                                    while (i42 < i39) {
                                        int i43 = (int) (fArr[i40] * f24);
                                        i41 -= i43;
                                        MessageObject.GroupedMessagePosition groupedMessagePosition4 = (MessageObject.GroupedMessagePosition) arrayList.get(i40);
                                        int i44 = i37 == 0 ? 4 : 0;
                                        k1 k1Var6 = k1Var4;
                                        if (i37 == iArr2.length - 1) {
                                            i44 |= 8;
                                        }
                                        if (i42 == 0) {
                                            i44 |= 1;
                                        }
                                        if (i42 == i39 - 1) {
                                            i44 |= 2;
                                            groupedMessagePosition3 = groupedMessagePosition4;
                                        }
                                        int i45 = i42;
                                        groupedMessagePosition4.set(i45, i42, i37, i37, i43, f24 / 814.0f, i44);
                                        i40++;
                                        i42 = i45 + 1;
                                        k1Var4 = k1Var6;
                                    }
                                    groupedMessagePosition3.pw += i41;
                                    groupedMessagePosition3.spanSize += i41;
                                    i37++;
                                    k1Var4 = k1Var4;
                                    i38 = i40;
                                }
                            }
                        } else if (size == 2) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition5 = (MessageObject.GroupedMessagePosition) arrayList.get(0);
                            MessageObject.GroupedMessagePosition groupedMessagePosition6 = (MessageObject.GroupedMessagePosition) arrayList.get(1);
                            String sb3 = sb2.toString();
                            if (sb3.equals("ww")) {
                                if (f17 > f16 * 1.4d) {
                                    float f25 = groupedMessagePosition5.aspectRatio;
                                    float f26 = groupedMessagePosition6.aspectRatio;
                                    if (f25 - f26 < 0.2d) {
                                        float round = Math.round(Math.min(f15 / f25, Math.min(f15 / f26, 407.0f))) / 814.0f;
                                        groupedMessagePosition5.set(0, 0, 0, 0, l1Var2.c, round, 7);
                                        groupedMessagePosition6.set(0, 0, 1, 1, l1Var2.c, round, 11);
                                    }
                                }
                                str = sb3;
                            } else {
                                str = sb3;
                            }
                            if (str.equals("ww") || str.equals("qq")) {
                                int i46 = i14 / 2;
                                float f27 = i46;
                                float round2 = Math.round(Math.min(f27 / groupedMessagePosition5.aspectRatio, Math.min(f27 / groupedMessagePosition6.aspectRatio, 814.0f))) / 814.0f;
                                groupedMessagePosition5.set(0, 0, 0, 0, i46, round2, 13);
                                groupedMessagePosition6.set(1, 1, 0, 0, i46, round2, 14);
                            } else {
                                float f28 = groupedMessagePosition5.aspectRatio;
                                int max = (int) Math.max(f15 * 0.4f, Math.round((f15 / f28) / ((1.0f / groupedMessagePosition6.aspectRatio) + (1.0f / f28))));
                                int i47 = i14 - max;
                                if (i47 < min) {
                                    max -= min - i47;
                                } else {
                                    min = i47;
                                }
                                float min3 = Math.min(814.0f, Math.round(Math.min(min / groupedMessagePosition5.aspectRatio, max / groupedMessagePosition6.aspectRatio))) / 814.0f;
                                groupedMessagePosition5.set(0, 0, 0, 0, min, min3, 13);
                                groupedMessagePosition6.set(1, 1, 0, 0, max, min3, 14);
                            }
                        } else if (size == 3) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition7 = (MessageObject.GroupedMessagePosition) arrayList.get(0);
                            MessageObject.GroupedMessagePosition groupedMessagePosition8 = (MessageObject.GroupedMessagePosition) arrayList.get(1);
                            MessageObject.GroupedMessagePosition groupedMessagePosition9 = (MessageObject.GroupedMessagePosition) arrayList.get(2);
                            if (sb2.charAt(0) == 'n') {
                                float f29 = groupedMessagePosition8.aspectRatio;
                                float min4 = Math.min(407.0f, Math.round((f29 * f15) / (groupedMessagePosition9.aspectRatio + f29)));
                                int max2 = (int) Math.max(min, Math.min(f15 * 0.5f, Math.round(Math.min(groupedMessagePosition9.aspectRatio * min4, groupedMessagePosition8.aspectRatio * r10))));
                                int round3 = Math.round(Math.min((groupedMessagePosition7.aspectRatio * 814.0f) + min2, i14 - max2));
                                groupedMessagePosition7.set(0, 0, 0, 1, round3, 1.0f, 13);
                                float f30 = (814.0f - min4) / 814.0f;
                                groupedMessagePosition8.set(1, 1, 0, 0, max2, f30, 6);
                                float f31 = min4 / 814.0f;
                                groupedMessagePosition9.set(0, 1, 1, 1, max2, f31, 10);
                                groupedMessagePosition9.spanSize = i14;
                                groupedMessagePosition7.siblingHeights = new float[]{f31, f30};
                                groupedMessagePosition8.spanSize = i14 - round3;
                                groupedMessagePosition9.leftSpanOffset = round3;
                            } else {
                                float round4 = Math.round(Math.min(f15 / groupedMessagePosition7.aspectRatio, 537.24005f)) / 814.0f;
                                groupedMessagePosition7.set(0, 1, 0, 0, l1Var2.c, round4, 7);
                                int i48 = i14 / 2;
                                float f32 = i48;
                                float min5 = Math.min(814.0f - round4, Math.round(Math.min(f32 / groupedMessagePosition8.aspectRatio, f32 / groupedMessagePosition9.aspectRatio))) / 814.0f;
                                groupedMessagePosition8.set(0, 0, 1, 1, i48, min5, 9);
                                groupedMessagePosition9.set(1, 1, 1, 1, i48, min5, 10);
                            }
                        } else if (size == 4) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition10 = (MessageObject.GroupedMessagePosition) arrayList.get(0);
                            MessageObject.GroupedMessagePosition groupedMessagePosition11 = (MessageObject.GroupedMessagePosition) arrayList.get(1);
                            MessageObject.GroupedMessagePosition groupedMessagePosition12 = (MessageObject.GroupedMessagePosition) arrayList.get(2);
                            MessageObject.GroupedMessagePosition groupedMessagePosition13 = (MessageObject.GroupedMessagePosition) arrayList.get(3);
                            if (sb2.charAt(0) == 'w') {
                                float round5 = Math.round(Math.min(f15 / groupedMessagePosition10.aspectRatio, 537.24005f)) / 814.0f;
                                groupedMessagePosition10.set(0, 2, 0, 0, l1Var2.c, round5, 7);
                                float round6 = Math.round(f15 / ((groupedMessagePosition11.aspectRatio + groupedMessagePosition12.aspectRatio) + groupedMessagePosition13.aspectRatio));
                                float f33 = min;
                                int max3 = (int) Math.max(f33, Math.min(f15 * 0.4f, groupedMessagePosition11.aspectRatio * round6));
                                int max4 = (int) Math.max(Math.max(f33, 0.33f * f15), groupedMessagePosition13.aspectRatio * round6);
                                float min6 = Math.min(814.0f - round5, round6) / 814.0f;
                                groupedMessagePosition11.set(0, 0, 1, 1, max3, min6, 9);
                                groupedMessagePosition12.set(1, 1, 1, 1, (i14 - max3) - max4, min6, 8);
                                groupedMessagePosition13.set(2, 2, 1, 1, max4, min6, 10);
                            } else {
                                int max5 = Math.max(min, Math.round(814.0f / ((1.0f / ((MessageObject.GroupedMessagePosition) arrayList.get(3)).aspectRatio) + ((1.0f / groupedMessagePosition12.aspectRatio) + (1.0f / groupedMessagePosition11.aspectRatio)))));
                                float f34 = dp;
                                float f35 = max5;
                                float min7 = Math.min(0.33f, Math.max(f34, f35 / groupedMessagePosition11.aspectRatio) / 814.0f);
                                float min8 = Math.min(0.33f, Math.max(f34, f35 / groupedMessagePosition12.aspectRatio) / 814.0f);
                                float f36 = (1.0f - min7) - min8;
                                int round7 = Math.round(Math.min((814.0f * groupedMessagePosition10.aspectRatio) + min2, i14 - max5));
                                groupedMessagePosition10.set(0, 0, 0, 2, round7, min7 + min8 + f36, 13);
                                groupedMessagePosition11.set(1, 1, 0, 0, max5, min7, 6);
                                groupedMessagePosition12.set(0, 1, 1, 1, max5, min8, 2);
                                groupedMessagePosition12.spanSize = i14;
                                groupedMessagePosition13.set(0, 1, 2, 2, max5, f36, 10);
                                groupedMessagePosition13.spanSize = i14;
                                groupedMessagePosition11.spanSize = i14 - round7;
                                groupedMessagePosition12.leftSpanOffset = round7;
                                groupedMessagePosition13.leftSpanOffset = round7;
                                groupedMessagePosition10.siblingHeights = new float[]{min7, min8, f36};
                            }
                        }
                        for (int i49 = 0; i49 < size; i49++) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition14 = (MessageObject.GroupedMessagePosition) arrayList.get(i49);
                            if ((groupedMessagePosition14.flags & 1) != 0) {
                                groupedMessagePosition14.edge = true;
                            }
                        }
                    }
                }
                m1Var.b.l();
                m1Var.a.setGlowColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                m1Var.requestLayout();
                break;
            case 18:
                ((f1) q1Var.a).setBlock((TL_iv.pageBlockChannel) pageBlock2);
                break;
            case 19:
                c1 c1Var = (c1) q1Var.a;
                TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock2;
                z11 = i10 == 0;
                a70 a70Var = c1Var.a;
                c1Var.G = pageblockaudio;
                MessageObject messageObject = (MessageObject) c1Var.b.s.get(pageblockaudio);
                c1Var.I = messageObject;
                if (messageObject != null) {
                    c1Var.H = messageObject.getDocument();
                }
                c1Var.h = z11;
                org.telegram.ui.Components.ln0 ln0Var = c1Var.f;
                int i50 = org.telegram.ui.ActionBar.f6.ud;
                ((l4) a70Var).getClass();
                int w02 = org.telegram.ui.ActionBar.f6.w0(null, i50, false);
                int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.vd, false);
                int i51 = org.telegram.ui.ActionBar.f6.xd;
                ln0Var.h(w02, w03, org.telegram.ui.ActionBar.f6.w0(null, i51, false), org.telegram.ui.ActionBar.f6.w0(null, i51, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.wd, false));
                c1Var.a(false);
                c1Var.requestLayout();
                break;
            case 20:
                ((z1) q1Var.a).setBlock((TL_iv.pageBlockKicker) pageBlock2);
                break;
            case 21:
                ((d2) q1Var.a).setBlock((d4) pageBlock2);
                break;
            case 22:
                b2 b2Var = (b2) q1Var.a;
                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock2;
                z11 = i10 == 0;
                b2Var.x = pageblockmap;
                b2Var.h = z11;
                b2Var.requestLayout();
                break;
            case 23:
                l2 l2Var = (l2) q1Var.a;
                TLRPC.WebPage webPage = this.A;
                l2Var.n = (f4) pageBlock2;
                l2Var.r = webPage;
                l2Var.requestLayout();
                break;
            case 24:
                ((o1) q1Var.a).setBlock((TL_iv.pageBlockDetails) pageBlock2);
                break;
            case 25:
                ((x2) q1Var.a).setBlock((TL_iv.pageBlockTable) pageBlock2);
                break;
            case 26:
                ((m2) q1Var.a).setBlock((TL_iv.pageBlockRelatedArticles) pageBlock2);
                break;
            case 27:
                break;
        }
    }

    public final boolean J(z3 z3Var) {
        TL_iv.PageBlock z10 = l4.z(z3Var.a);
        if (z10 instanceof TL_iv.pageBlockDetails) {
            return ((TL_iv.pageBlockDetails) z10).open;
        }
        if (!(z10 instanceof z3)) {
            return false;
        }
        z3 z3Var2 = (z3) z10;
        TL_iv.PageBlock z11 = l4.z(z3Var2.b);
        if (!(z11 instanceof TL_iv.pageBlockDetails) || ((TL_iv.pageBlockDetails) z11).open) {
            return J(z3Var2);
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
        if (l4.K(pageBlock)) {
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
        int i9 = 0;
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            L(null, pageblockslideshow.caption.text);
            L(null, pageblockslideshow.caption.credit);
            G(pageblockslideshow.caption.text, pageblockslideshow);
            G(pageblockslideshow.caption.credit, pageblockslideshow);
            int size = pageblockslideshow.items.size();
            while (i9 < size) {
                K(pageblockslideshow.items.get(i9));
                i9++;
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
        if (pageBlock instanceof b4) {
            b4 b4Var = (b4) pageBlock;
            TL_iv.RichText richText2 = b4Var.e;
            if (richText2 != null) {
                L(null, richText2);
                G(b4Var.e, b4Var);
                return;
            } else {
                TL_iv.PageBlock pageBlock10 = b4Var.d;
                if (pageBlock10 != null) {
                    K(pageBlock10);
                    return;
                }
                return;
            }
        }
        if (pageBlock instanceof d4) {
            d4 d4Var = (d4) pageBlock;
            TL_iv.RichText richText3 = d4Var.e;
            if (richText3 != null) {
                L(null, richText3);
                G(d4Var.e, d4Var);
                return;
            } else {
                TL_iv.PageBlock pageBlock11 = d4Var.d;
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
            while (i9 < size2) {
                K(pageblockcollage.items.get(i9));
                i9++;
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
            while (i9 < size3) {
                K(pageblockdetails.blocks.get(i9));
                i9++;
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
            for (int i9 = 0; i9 < size; i9++) {
                L(richText2, richText2.texts.get(i9));
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
        for (int i9 = 0; i9 < size; i9++) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i9);
            TL_iv.PageBlock z10 = l4.z(pageBlock);
            if (!(z10 instanceof z3) || J((z3) z10)) {
                arrayList.add(pageBlock);
            }
        }
        if (arrayList.size() < 100) {
            Utilities.globalQueue.cancelRunnable(this.G);
            Utilities.globalQueue.postRunnable(this.G, 100L);
        }
    }

    @Override // f2.r0
    public final int h() {
        int i9;
        TLRPC.WebPage webPage = this.A;
        if (webPage == null || webPage.cached_page == null) {
            i9 = 0;
        } else {
            i9 = this.d.size();
            if (this.A.cached_page.local == null) {
                i9++;
            }
        }
        return this.D ? i9 + 1 : i9;
    }

    @Override // f2.r0
    public final int j(int i9) {
        TL_iv.Page page;
        if (this.D) {
            if (i9 == 0) {
                return 2147483646;
            }
            i9--;
        }
        ArrayList arrayList = this.d;
        if (i9 != arrayList.size()) {
            return I((TL_iv.PageBlock) arrayList.get(i9));
        }
        TLRPC.WebPage webPage = this.A;
        return (webPage == null || (page = webPage.cached_page) == null || !page.web) ? 90 : 91;
    }

    @Override // f2.r0
    public final void l() {
        M();
        super.l();
    }

    @Override // f2.r0
    public final void m(int i9) {
        M();
        super.m(i9);
    }

    @Override // f2.r0
    public final void p(int i9, int i10) {
        M();
        super.p(i9, i10);
    }

    @Override // f2.r0
    public final void q(int i9, int i10) {
        M();
        super.q(i9, i10);
    }

    @Override // f2.r0
    public final void r(int i9, int i10, Object obj) {
        M();
        super.r(i9, i10, obj);
    }

    @Override // f2.r0
    public final void s(int i9, int i10) {
        M();
        super.s(i9, i10);
    }

    @Override // f2.r0
    public final void t(int i9, int i10) {
        M();
        super.t(i9, i10);
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        if (this.D) {
            i9--;
        }
        int i10 = i9;
        if (i10 >= 0) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                H(q1Var.f, q1Var, (TL_iv.PageBlock) arrayList.get(i10), i10, arrayList.size(), false);
            }
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        View a3Var;
        Context context = this.c;
        if (i9 != 2147483646) {
            l4 l4Var = this.H;
            switch (i9) {
                case 0:
                    view = new e2(context, l4Var, this);
                    break;
                case 1:
                    view = new y1(context, l4Var, this);
                    break;
                case 2:
                    view = new p1(context);
                    break;
                case 3:
                    view = new v1(l4Var, context, this);
                    break;
                case 4:
                    view = new v2(context, l4Var, this);
                    break;
                case 5:
                    a3Var = new a3(context, l4Var, this, 0);
                    view = a3Var;
                    break;
                case 6:
                    view = new k2(context, l4Var, this);
                    break;
                case 7:
                    view = new e1(context, l4Var, this);
                    break;
                case 8:
                    view = new t2(l4Var, context, this);
                    break;
                case 9:
                    a3Var = new f2(context, l4Var, this, 0);
                    view = a3Var;
                    break;
                case 10:
                    view = new d1(context, l4Var, this);
                    break;
                case 11:
                    view = new y2(context, l4Var, this);
                    break;
                case 12:
                    view = new a2(context, l4Var, this);
                    break;
                case 13:
                    view = new x1(context, l4Var, this);
                    break;
                case 14:
                    view = new j2(context, l4Var, this);
                    break;
                case 15:
                    view = new u2(context, l4Var, this);
                    break;
                case 16:
                    view = new w1(context, l4Var, this);
                    break;
                case 17:
                    view = new m1(l4Var, context, this);
                    break;
                case 18:
                    a3Var = new f1(context, l4Var, this, 0);
                    view = a3Var;
                    break;
                case 19:
                    view = new c1(context, l4Var, this);
                    break;
                case 20:
                    view = new z1(context, l4Var, this);
                    break;
                case 21:
                    view = new d2(context, l4Var, this);
                    break;
                case 22:
                    view = new b2(context, l4Var, this);
                    break;
                case 23:
                    view = new l2(context, l4Var, this);
                    break;
                case 24:
                    view = new o1(context, l4Var, this);
                    break;
                case 25:
                    view = new x2(context, l4Var, this);
                    break;
                case 26:
                    view = new m2(context, l4Var, this);
                    break;
                case 27:
                    View n1Var = new n1(context);
                    new RectF();
                    n1Var.setImportantForAccessibility(2);
                    view = n1Var;
                    break;
                case 28:
                    view = new n2(context, l4Var);
                    break;
                default:
                    switch (i9) {
                        case 90:
                            a3Var = new s3(l4Var, context, false);
                            view = a3Var;
                            break;
                        case 91:
                            view = new s3(l4Var, context, true);
                            break;
                        case 92:
                            view = new c2(context, l4Var);
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
            View anVar = new org.telegram.ui.Components.an(context, 9);
            anVar.setImportantForAccessibility(2);
            view = anVar;
        }
        view.setLayoutParams(new f2.a1(-1, -2));
        view.setFocusable(true);
        return new org.telegram.ui.Components.ik0(view);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        int i9 = q1Var.f;
        if (i9 == 90 || i9 == 91) {
            s3 s3Var = (s3) q1Var.a;
            TL_iv.Page page = this.A.cached_page;
            int i10 = page != null ? page.views : 0;
            l4 l4Var = s3Var.e;
            TextView textView = s3Var.a;
            TextView textView2 = s3Var.b;
            if (i10 == 0) {
                s3Var.c = false;
                textView2.setVisibility(8);
                textView.setGravity(17);
            } else {
                s3Var.c = true;
                textView2.setVisibility(0);
                textView.setGravity(21);
                textView2.setText(LocaleController.formatPluralStringComma("Views", i10));
            }
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.M6, false);
            textView.setTextColor(l4Var.a());
            textView2.setTextColor(l4Var.a());
            textView.setBackgroundColor(Color.argb(34, Color.red(w02), Color.green(w02), Color.blue(w02)));
        }
    }
}
