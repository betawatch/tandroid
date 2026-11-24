// default package

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.i;
import org.telegram.ui.j;
import org.telegram.ui.k;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class dx extends n39 {
    public TLRPC.WebPage F;
    public TL_iv.pageBlockChannel G;
    public boolean H;
    public int I;
    public final boolean J;
    public int[] K;
    public int L;
    public final /* synthetic */ o N;
    public final Activity c;
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
    public final b1 M = new b1(this, 25);

    public dx(o oVar, Activity activity, boolean z) {
        this.N = oVar;
        this.c = activity;
        this.J = z;
    }

    public static int I(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            return 0;
        }
        if ((pageBlock instanceof TL_iv.pageBlockHeader) || o.H(pageBlock)) {
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
        if (pageBlock instanceof vw) {
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
        if (pageBlock instanceof xw) {
            return 21;
        }
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            return 22;
        }
        if (pageBlock instanceof zw) {
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
        if (pageBlock instanceof ax) {
            return 28;
        }
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            return 92;
        }
        if (pageBlock instanceof tw) {
            return I(((tw) pageBlock).b);
        }
        if (pageBlock instanceof TL_iv.pageBlockCover) {
            return I(((TL_iv.pageBlockCover) pageBlock).cover);
        }
        return 100;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return i == 23 || i == 24;
    }

    public final void E(dx dxVar, TL_iv.PageBlock pageBlock) {
        boolean z = pageBlock instanceof TL_iv.pageBlockPhoto;
        ArrayList arrayList = this.f;
        int i = 0;
        if (z) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            TLRPC.Photo e = cx.e(this.F, pageblockphoto.photo_id);
            if (e != null) {
                pageblockphoto.thumb = ba4.w(e.sizes, 56, true, null, false);
                pageblockphoto.thumbObject = e;
                arrayList.add(pageBlock);
                return;
            }
            return;
        }
        if ((pageBlock instanceof TL_iv.pageBlockVideo) && cx.g(dxVar.F, pageBlock)) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            TLRPC.Document a = cx.a(this.F, pageblockvideo.video_id);
            if (a != null) {
                pageblockvideo.thumb = ba4.w(a.thumbs, 56, true, null, false);
                pageblockvideo.thumbObject = a;
                arrayList.add(pageBlock);
                return;
            }
            return;
        }
        boolean z2 = pageBlock instanceof TL_iv.pageBlockSlideshow;
        o oVar = this.N;
        if (z2) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            int size = pageblockslideshow.items.size();
            while (i < size) {
                TL_iv.PageBlock pageBlock2 = pageblockslideshow.items.get(i);
                pageBlock2.groupId = oVar.Z;
                E(dxVar, pageBlock2);
                i++;
            }
            oVar.Z++;
            return;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockCollage)) {
            if (pageBlock instanceof TL_iv.pageBlockCover) {
                E(dxVar, ((TL_iv.pageBlockCover) pageBlock).cover);
                return;
            }
            return;
        }
        TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
        int size2 = pageblockcollage.items.size();
        while (i < size2) {
            TL_iv.PageBlock pageBlock3 = pageblockcollage.items.get(i);
            pageBlock3.groupId = oVar.Z;
            E(dxVar, pageBlock3);
            i++;
        }
        oVar.Z++;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void F(dx r24, org.telegram.tgnet.tl.TL_iv.PageBlock r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dx.F(dx, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, int):void");
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

    /* JADX WARN: Code restructure failed: missing block: B:220:0x06d9, code lost:
    
        if (r13[2] > r13[r14]) goto L193;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(int i, s49 s49Var, TL_iv.PageBlock pageBlock, int i2, int i3, boolean z) {
        TLRPC.Photo photo;
        c27 c27Var;
        c27 c27Var2;
        int i4;
        lu luVar;
        int i5;
        float f;
        TLRPC.Document a;
        TLRPC.PhotoSize w;
        float f2;
        float f3;
        boolean z2;
        boolean z3 = pageBlock instanceof TL_iv.pageBlockCover;
        TL_iv.PageBlock pageBlock2 = z3 ? ((TL_iv.pageBlockCover) pageBlock).cover : pageBlock instanceof tw ? ((tw) pageBlock).b : pageBlock;
        if (i == 92) {
            ((zu) s49Var.a).setBlock((TL_iv.pageBlockMath) pageBlock2);
            return;
        }
        if (i == 100) {
            ((TextView) s49Var.a).setText("unsupported block " + pageBlock2);
            return;
        }
        switch (i) {
            case 0:
                ((bv) s49Var.a).setBlock((TL_iv.pageBlockParagraph) pageBlock2);
                break;
            case 1:
                ((vu) s49Var.a).setBlock(pageBlock2);
                break;
            case 2:
                break;
            case 3:
                j jVar = (j) s49Var.a;
                TL_iv.pageBlockEmbed pageblockembed = (TL_iv.pageBlockEmbed) pageBlock2;
                TL_iv.pageBlockEmbed pageblockembed2 = jVar.w;
                jVar.w = pageblockembed;
                i iVar = jVar.a;
                if (iVar != null) {
                    photo = null;
                    zkb.h(bkb.c6, null, iVar);
                } else {
                    photo = null;
                }
                TL_iv.pageBlockEmbed pageblockembed3 = jVar.w;
                if (pageblockembed2 != pageblockembed3) {
                    jVar.s = false;
                    i iVar2 = jVar.a;
                    if (iVar2 != null) {
                        if (pageblockembed3.allow_scrolling) {
                            iVar2.setVerticalScrollBarEnabled(true);
                            jVar.a.setHorizontalScrollBarEnabled(true);
                        } else {
                            iVar2.setVerticalScrollBarEnabled(false);
                            jVar.a.setHorizontalScrollBarEnabled(false);
                        }
                    }
                    jVar.r = 0;
                    i iVar3 = jVar.a;
                    if (iVar3 != null) {
                        try {
                            iVar3.loadUrl("about:blank");
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                    }
                    try {
                        TL_iv.pageBlockEmbed pageblockembed4 = jVar.w;
                        String str = pageblockembed4.html;
                        if (str != null) {
                            i iVar4 = jVar.a;
                            if (iVar4 != null) {
                                iVar4.loadDataWithBaseURL("https://telegram.org/embed", str, "text/html", "UTF-8", null);
                                jVar.a.setVisibility(0);
                            }
                            stc stcVar = jVar.b;
                            if (stcVar != null) {
                                stcVar.setVisibility(4);
                                jVar.b.g(null, null, null, null, false);
                            }
                        } else {
                            long j = pageblockembed4.poster_photo_id;
                            boolean g = jVar.b.g(pageblockembed.url, j != 0 ? cx.e(jVar.x.F, j) : photo, jVar.x.F, null, false);
                            i iVar5 = jVar.a;
                            if (g) {
                                if (iVar5 != null) {
                                    iVar5.setVisibility(4);
                                    jVar.a.stopLoading();
                                    jVar.a.loadUrl("about:blank");
                                }
                                stc stcVar2 = jVar.b;
                                if (stcVar2 != null) {
                                    stcVar2.setVisibility(0);
                                }
                            } else {
                                if (iVar5 != null) {
                                    iVar5.setVisibility(0);
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("Referer", a.b.getPackageName());
                                    jVar.a.loadUrl(jVar.w.url, hashMap);
                                }
                                stc stcVar3 = jVar.b;
                                if (stcVar3 != null) {
                                    stcVar3.setVisibility(4);
                                    jVar.b.g(null, null, null, null, false);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                    }
                }
                jVar.requestLayout();
                break;
            case 4:
                ((rv) s49Var.a).setBlock((TL_iv.pageBlockSubtitle) pageBlock2);
                break;
            case 5:
                xv xvVar = (xv) s49Var.a;
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock2;
                xvVar.b(pageblockvideo, (yv) this.N.E.f(pageblockvideo.video_id), z, i2 == 0);
                TL_iv.pageBlockChannel pageblockchannel = this.G;
                eu euVar = xvVar.s;
                xvVar.O = pageBlock;
                if (pageblockchannel != null && z3) {
                    euVar.setBlock(pageblockchannel);
                    euVar.setVisibility(0);
                    break;
                }
                break;
            case 6:
                ((hv) s49Var.a).setBlock((TL_iv.pageBlockPullquote) pageBlock2);
                break;
            case 7:
                ((du) s49Var.a).setBlock((TL_iv.pageBlockBlockquote) pageBlock2);
                break;
            case 8:
                pv pvVar = (pv) s49Var.a;
                pvVar.e = (TL_iv.pageBlockSlideshow) pageBlock2;
                pvVar.c.g();
                k kVar = pvVar.b;
                kVar.x(0, false);
                kVar.forceLayout();
                pvVar.requestLayout();
                break;
            case 9:
                cv cvVar = (cv) s49Var.a;
                cvVar.a((TL_iv.pageBlockPhoto) pageBlock2, this.F, z, i2 == 0);
                cvVar.setParentBlock(pageBlock);
                break;
            case 10:
                ((cu) s49Var.a).setBlock((TL_iv.pageBlockAuthorDate) pageBlock2);
                break;
            case 11:
                ((vv) s49Var.a).setBlock((TL_iv.pageBlockTitle) pageBlock2);
                break;
            case 12:
                ((xu) s49Var.a).setBlock((vw) pageBlock2);
                break;
            case 13:
                ((uu) s49Var.a).setBlock((TL_iv.pageBlockFooter) pageBlock2);
                break;
            case 14:
                ((gv) s49Var.a).setBlock((TL_iv.pageBlockPreformatted) pageBlock2);
                break;
            case 15:
                ((qv) s49Var.a).setBlock((TL_iv.pageBlockSubheader) pageBlock2);
                break;
            case 16:
                ((tu) s49Var.a).setBlock((TL_iv.pageBlockEmbedPost) pageBlock2);
                break;
            case 17:
                mu muVar = (mu) s49Var.a;
                TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock2;
                if (muVar.s != pageblockcollage) {
                    muVar.s = pageblockcollage;
                    lu luVar2 = muVar.w;
                    luVar2.getClass();
                    ArrayList arrayList = luVar2.a;
                    arrayList.clear();
                    HashMap hashMap2 = luVar2.b;
                    hashMap2.clear();
                    mu muVar2 = luVar2.c;
                    TL_iv.pageBlockCollage pageblockcollage2 = muVar2.s;
                    dx dxVar = muVar2.x;
                    int size = pageblockcollage2.items.size();
                    if (size > 1) {
                        StringBuilder sb = new StringBuilder();
                        int i6 = 0;
                        boolean z4 = false;
                        float f4 = 1.0f;
                        while (true) {
                            float f5 = 1.0f;
                            if (i6 < size) {
                                TL_iv.PageBlock pageBlock3 = muVar2.s.items.get(i6);
                                if (pageBlock3 instanceof TL_iv.pageBlockPhoto) {
                                    TLRPC.Photo e3 = cx.e(dxVar.F, ((TL_iv.pageBlockPhoto) pageBlock3).photo_id);
                                    if (e3 != null) {
                                        w = ba4.w(e3.sizes, gl.Y0(false), false, null, false);
                                        c27 c27Var3 = new c27();
                                        c27Var3.h = i6 != size + (-1);
                                        f2 = w != null ? 1.0f : w.w / w.h;
                                        c27Var3.g = f2;
                                        if (f2 <= 1.2f) {
                                            sb.append("w");
                                        } else if (f2 < 0.8f) {
                                            sb.append("n");
                                        } else {
                                            sb.append("q");
                                        }
                                        f3 = c27Var3.g;
                                        f4 += f3;
                                        if (f3 > 2.0f) {
                                            z4 = true;
                                        }
                                        hashMap2.put(pageBlock3, c27Var3);
                                        arrayList.add(c27Var3);
                                        i6++;
                                    } else {
                                        i6++;
                                    }
                                } else {
                                    if ((pageBlock3 instanceof TL_iv.pageBlockVideo) && (a = cx.a(dxVar.F, ((TL_iv.pageBlockVideo) pageBlock3).video_id)) != null) {
                                        w = ba4.w(a.thumbs, 90, false, null, false);
                                        c27 c27Var32 = new c27();
                                        c27Var32.h = i6 != size + (-1);
                                        if (w != null) {
                                        }
                                        c27Var32.g = f2;
                                        if (f2 <= 1.2f) {
                                        }
                                        f3 = c27Var32.g;
                                        f4 += f3;
                                        if (f3 > 2.0f) {
                                        }
                                        hashMap2.put(pageBlock3, c27Var32);
                                        arrayList.add(c27Var32);
                                    }
                                    i6++;
                                }
                            } else {
                                int L = gl.L(120.0f);
                                float L2 = gl.L(120.0f);
                                Point point = gl.q;
                                int min = (int) (L2 / (Math.min(point.x, point.y) / 1000.0f));
                                int L3 = (int) (gl.L(40.0f) / (Math.min(point.x, point.y) / 1000.0f));
                                float f6 = f4 / size;
                                int i7 = 3;
                                if (z4 || !(size == 2 || size == 3 || size == 4)) {
                                    int i8 = 2;
                                    int size2 = arrayList.size();
                                    float[] fArr = new float[size2];
                                    int i9 = 0;
                                    while (i9 < size) {
                                        if (f6 > 1.1f) {
                                            f = f5;
                                            fArr[i9] = Math.max(f, ((c27) arrayList.get(i9)).g);
                                        } else {
                                            f = f5;
                                            fArr[i9] = Math.min(f, ((c27) arrayList.get(i9)).g);
                                        }
                                        fArr[i9] = Math.max(0.66667f, Math.min(1.7f, fArr[i9]));
                                        i9++;
                                        f5 = f;
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    int i10 = 1;
                                    while (i10 < size2) {
                                        int i11 = size2 - i10;
                                        if (i10 <= 3 && i11 <= 3) {
                                            float a2 = luVar2.a(0, i10, fArr);
                                            float a3 = luVar2.a(i10, size2, fArr);
                                            ku kuVar = new ku();
                                            kuVar.a = new int[]{i10, i11};
                                            float[] fArr2 = new float[i8];
                                            fArr2[0] = a2;
                                            fArr2[1] = a3;
                                            kuVar.b = fArr2;
                                            arrayList2.add(kuVar);
                                        }
                                        i10++;
                                        i8 = 2;
                                    }
                                    for (int i12 = 1; i12 < size2 - 1; i12++) {
                                        int i13 = 1;
                                        while (true) {
                                            int i14 = size2 - i12;
                                            if (i13 < i14) {
                                                int i15 = i14 - i13;
                                                if (i12 <= 3) {
                                                    if (i13 <= (f6 < 0.85f ? 4 : 3) && i15 <= 3) {
                                                        float a4 = luVar2.a(0, i12, fArr);
                                                        int i16 = i12 + i13;
                                                        float a5 = luVar2.a(i12, i16, fArr);
                                                        float a6 = luVar2.a(i16, size2, fArr);
                                                        ku kuVar2 = new ku();
                                                        kuVar2.a = new int[]{i12, i13, i15};
                                                        kuVar2.b = new float[]{a4, a5, a6};
                                                        arrayList2.add(kuVar2);
                                                    }
                                                }
                                                i13++;
                                            }
                                        }
                                    }
                                    for (int i17 = 1; i17 < size2 - 2; i17++) {
                                        int i18 = 1;
                                        while (true) {
                                            int i19 = size2 - i17;
                                            if (i18 < i19) {
                                                int i20 = 1;
                                                while (true) {
                                                    int i21 = i19 - i18;
                                                    if (i20 < i21) {
                                                        int i22 = i21 - i20;
                                                        if (i17 > i7 || i18 > i7 || i20 > i7 || i22 > i7) {
                                                            luVar = luVar2;
                                                            i5 = i7;
                                                        } else {
                                                            float a7 = luVar2.a(0, i17, fArr);
                                                            int i23 = i17 + i18;
                                                            float a8 = luVar2.a(i17, i23, fArr);
                                                            i5 = i7;
                                                            int i24 = i23 + i20;
                                                            float a9 = luVar2.a(i23, i24, fArr);
                                                            float a10 = luVar2.a(i24, size2, fArr);
                                                            ku kuVar3 = new ku();
                                                            kuVar3.a = new int[]{i17, i18, i20, i22};
                                                            luVar = luVar2;
                                                            float[] fArr3 = new float[4];
                                                            fArr3[0] = a7;
                                                            fArr3[1] = a8;
                                                            fArr3[2] = a9;
                                                            fArr3[i5] = a10;
                                                            kuVar3.b = fArr3;
                                                            arrayList2.add(kuVar3);
                                                        }
                                                        i20++;
                                                        i7 = i5;
                                                        luVar2 = luVar;
                                                    }
                                                }
                                                i18++;
                                            }
                                        }
                                    }
                                    int i25 = i7;
                                    ku kuVar4 = null;
                                    int i26 = 0;
                                    float f7 = 0.0f;
                                    while (i26 < arrayList2.size()) {
                                        ku kuVar5 = (ku) arrayList2.get(i26);
                                        float f8 = Float.MAX_VALUE;
                                        int i27 = 0;
                                        float f9 = 0.0f;
                                        while (true) {
                                            float[] fArr4 = kuVar5.b;
                                            if (i27 < fArr4.length) {
                                                float f10 = fArr4[i27];
                                                f9 += f10;
                                                if (f10 < f8) {
                                                    f8 = f10;
                                                }
                                                i27++;
                                            } else {
                                                float abs = Math.abs(f9 - 1332.0f);
                                                int[] iArr = kuVar5.a;
                                                if (iArr.length > 1) {
                                                    int i28 = iArr[0];
                                                    int i29 = iArr[1];
                                                    if (i28 <= i29 && (iArr.length <= 2 || i29 <= iArr[2])) {
                                                        i4 = i25;
                                                        if (iArr.length > i4) {
                                                            break;
                                                        }
                                                    } else {
                                                        i4 = i25;
                                                    }
                                                    abs *= 1.2f;
                                                } else {
                                                    i4 = i25;
                                                }
                                                if (f8 < min) {
                                                    abs *= 1.5f;
                                                }
                                                if (kuVar4 == null || abs < f7) {
                                                    kuVar4 = kuVar5;
                                                    f7 = abs;
                                                }
                                                i26++;
                                                i25 = i4;
                                            }
                                        }
                                    }
                                    if (kuVar4 != null) {
                                        int[] iArr2 = kuVar4.a;
                                        int i30 = 0;
                                        int i31 = 0;
                                        while (i31 < iArr2.length) {
                                            int i32 = iArr2[i31];
                                            float f11 = kuVar4.b[i31];
                                            c27 c27Var4 = null;
                                            int i33 = 1000;
                                            int i34 = 0;
                                            while (i34 < i32) {
                                                int i35 = (int) (fArr[i30] * f11);
                                                int i36 = i33 - i35;
                                                c27 c27Var5 = (c27) arrayList.get(i30);
                                                int i37 = i31 == 0 ? 4 : 0;
                                                if (i31 == iArr2.length - 1) {
                                                    i37 |= 8;
                                                }
                                                if (i34 == 0) {
                                                    i37 |= 1;
                                                }
                                                if (i34 == i32 - 1) {
                                                    i37 |= 2;
                                                    c27Var2 = c27Var5;
                                                    c27Var = c27Var2;
                                                } else {
                                                    c27Var = c27Var4;
                                                    c27Var2 = c27Var5;
                                                }
                                                c27Var2.a(f11 / 814.0f, i34, i34, i31, i31, i35, i37);
                                                i30++;
                                                i34++;
                                                i33 = i36;
                                                c27Var4 = c27Var;
                                            }
                                            c27Var4.e += i33;
                                            c27Var4.i += i33;
                                            i31++;
                                        }
                                    }
                                } else if (size == 2) {
                                    c27 c27Var6 = (c27) arrayList.get(0);
                                    c27 c27Var7 = (c27) arrayList.get(1);
                                    String sb2 = sb.toString();
                                    if (sb2.equals("ww") && f6 > 1.71990168094635d) {
                                        float f12 = c27Var6.g;
                                        float f13 = c27Var7.g;
                                        if (f12 - f13 < 0.2d) {
                                            float round = Math.round(Math.min(1000.0f / f12, Math.min(1000.0f / f13, 407.0f))) / 814.0f;
                                            c27Var6.a(round, 0, 0, 0, 0, 1000, 7);
                                            c27Var7.a(round, 0, 0, 1, 1, 1000, 11);
                                        }
                                    }
                                    if (sb2.equals("ww") || sb2.equals("qq")) {
                                        float round2 = Math.round(Math.min(500.0f / c27Var6.g, Math.min(500.0f / c27Var7.g, 814.0f))) / 814.0f;
                                        c27Var6.a(round2, 0, 0, 0, 0, 500, 13);
                                        c27Var7.a(round2, 1, 1, 0, 0, 500, 14);
                                    } else {
                                        float f14 = c27Var6.g;
                                        int max = (int) Math.max(400.0f, Math.round((1000.0f / f14) / ((1.0f / c27Var7.g) + (1.0f / f14))));
                                        int i38 = 1000 - max;
                                        if (i38 < min) {
                                            max -= min - i38;
                                        } else {
                                            min = i38;
                                        }
                                        float min2 = Math.min(814.0f, Math.round(Math.min(min / c27Var6.g, max / c27Var7.g))) / 814.0f;
                                        c27Var6.a(min2, 0, 0, 0, 0, min, 13);
                                        c27Var7.a(min2, 1, 1, 0, 0, max, 14);
                                    }
                                } else if (size == 3) {
                                    c27 c27Var8 = (c27) arrayList.get(0);
                                    c27 c27Var9 = (c27) arrayList.get(1);
                                    c27 c27Var10 = (c27) arrayList.get(2);
                                    if (sb.charAt(0) == 'n') {
                                        float f15 = c27Var9.g;
                                        float min3 = Math.min(407.0f, Math.round((f15 * 1000.0f) / (c27Var10.g + f15)));
                                        int max2 = (int) Math.max(min, Math.min(500.0f, Math.round(Math.min(c27Var10.g * min3, c27Var9.g * r10))));
                                        int round3 = Math.round(Math.min((c27Var8.g * 814.0f) + L3, 1000 - max2));
                                        c27Var8.a(1.0f, 0, 0, 0, 1, round3, 13);
                                        float f16 = (814.0f - min3) / 814.0f;
                                        c27Var9.a(f16, 1, 1, 0, 0, max2, 6);
                                        float f17 = min3 / 814.0f;
                                        c27Var10.a(f17, 0, 1, 1, 1, max2, 10);
                                        c27Var10.i = 1000;
                                        c27Var8.m = new float[]{f17, f16};
                                        c27Var9.i = 1000 - round3;
                                        c27Var10.j = round3;
                                    } else {
                                        float round4 = Math.round(Math.min(1000.0f / c27Var8.g, 537.24005f)) / 814.0f;
                                        c27Var8.a(round4, 0, 1, 0, 0, 1000, 7);
                                        float min4 = Math.min(814.0f - round4, Math.round(Math.min(500.0f / c27Var9.g, 500.0f / c27Var10.g))) / 814.0f;
                                        c27Var9.a(min4, 0, 0, 1, 1, 500, 9);
                                        c27Var10.a(min4, 1, 1, 1, 1, 500, 10);
                                    }
                                } else if (size == 4) {
                                    c27 c27Var11 = (c27) arrayList.get(0);
                                    c27 c27Var12 = (c27) arrayList.get(1);
                                    c27 c27Var13 = (c27) arrayList.get(2);
                                    c27 c27Var14 = (c27) arrayList.get(3);
                                    if (sb.charAt(0) == 'w') {
                                        float round5 = Math.round(Math.min(1000.0f / c27Var11.g, 537.24005f)) / 814.0f;
                                        c27Var11.a(round5, 0, 2, 0, 0, 1000, 7);
                                        float round6 = Math.round(1000.0f / ((c27Var12.g + c27Var13.g) + c27Var14.g));
                                        float f18 = min;
                                        int max3 = (int) Math.max(f18, Math.min(400.0f, c27Var12.g * round6));
                                        int max4 = (int) Math.max(Math.max(f18, 330.0f), c27Var14.g * round6);
                                        float min5 = Math.min(814.0f - round5, round6) / 814.0f;
                                        c27Var12.a(min5, 0, 0, 1, 1, max3, 9);
                                        c27Var13.a(min5, 1, 1, 1, 1, (1000 - max3) - max4, 8);
                                        c27Var14.a(min5, 2, 2, 1, 1, max4, 10);
                                    } else {
                                        int max5 = Math.max(min, Math.round(814.0f / ((1.0f / ((c27) arrayList.get(3)).g) + ((1.0f / c27Var13.g) + (1.0f / c27Var12.g)))));
                                        float f19 = L;
                                        float f20 = max5;
                                        float min6 = Math.min(0.33f, Math.max(f19, f20 / c27Var12.g) / 814.0f);
                                        float min7 = Math.min(0.33f, Math.max(f19, f20 / c27Var13.g) / 814.0f);
                                        float f21 = (1.0f - min6) - min7;
                                        int round7 = Math.round(Math.min((c27Var11.g * 814.0f) + L3, 1000 - max5));
                                        c27Var11.a(min6 + min7 + f21, 0, 0, 0, 2, round7, 13);
                                        c27Var12.a(min6, 1, 1, 0, 0, max5, 6);
                                        c27Var13.a(min7, 0, 1, 1, 1, max5, 2);
                                        c27Var13.i = 1000;
                                        c27Var14.a(f21, 0, 1, 2, 2, max5, 10);
                                        c27Var14.i = 1000;
                                        c27Var12.i = 1000 - round7;
                                        c27Var13.j = round7;
                                        c27Var14.j = round7;
                                        c27Var11.m = new float[]{min6, min7, f21};
                                    }
                                }
                                for (int i39 = 0; i39 < size; i39++) {
                                    c27 c27Var15 = (c27) arrayList.get(i39);
                                    if ((c27Var15.l & 1) != 0) {
                                        c27Var15.k = true;
                                    }
                                }
                            }
                        }
                    }
                }
                muVar.b.f();
                zkb.H(muVar.a, bkb.c6, null);
                muVar.requestLayout();
                break;
            case 18:
                ((eu) s49Var.a).setBlock((TL_iv.pageBlockChannel) pageBlock2);
                break;
            case 19:
                bu buVar = (bu) s49Var.a;
                TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock2;
                z2 = i2 == 0;
                vg5 vg5Var = buVar.a;
                buVar.L = pageblockaudio;
                k27 k27Var = (k27) buVar.b.s.get(pageblockaudio);
                buVar.N = k27Var;
                if (k27Var != null) {
                    buVar.M = k27Var.F0();
                }
                buVar.h = z2;
                xu9 xu9Var = buVar.f;
                int i40 = bkb.ke;
                ((o) vg5Var).getClass();
                int w0 = bkb.w0(null, i40, false);
                int w02 = bkb.w0(null, bkb.le, false);
                int i41 = bkb.ne;
                xu9Var.f(w0, w02, bkb.w0(null, i41, false), bkb.w0(null, i41, false), bkb.w0(null, bkb.me, false));
                buVar.a(false);
                buVar.requestLayout();
                break;
            case 20:
                ((wu) s49Var.a).setBlock((TL_iv.pageBlockKicker) pageBlock2);
                break;
            case 21:
                ((av) s49Var.a).setBlock((xw) pageBlock2);
                break;
            case 22:
                yu yuVar = (yu) s49Var.a;
                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock2;
                z2 = i2 == 0;
                yuVar.y = pageblockmap;
                yuVar.h = z2;
                yuVar.requestLayout();
                break;
            case 23:
                iv ivVar = (iv) s49Var.a;
                TLRPC.WebPage webPage = this.F;
                ivVar.n = (zw) pageBlock2;
                ivVar.r = webPage;
                ivVar.requestLayout();
                break;
            case 24:
                ((ou) s49Var.a).setBlock((TL_iv.pageBlockDetails) pageBlock2);
                break;
            case 25:
                ((uv) s49Var.a).setBlock((TL_iv.pageBlockTable) pageBlock2);
                break;
            case 26:
                ((jv) s49Var.a).setBlock((TL_iv.pageBlockRelatedArticles) pageBlock2);
                break;
            case 27:
                break;
        }
    }

    public final boolean J(tw twVar) {
        TL_iv.PageBlock w = o.w(twVar.a);
        if (w instanceof TL_iv.pageBlockDetails) {
            return ((TL_iv.pageBlockDetails) w).open;
        }
        if (!(w instanceof tw)) {
            return false;
        }
        tw twVar2 = (tw) w;
        TL_iv.PageBlock w2 = o.w(twVar2.b);
        if (!(w2 instanceof TL_iv.pageBlockDetails) || ((TL_iv.pageBlockDetails) w2).open) {
            return J(twVar2);
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
        if (o.H(pageBlock)) {
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
        int i = 0;
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            L(null, pageblockslideshow.caption.text);
            L(null, pageblockslideshow.caption.credit);
            G(pageblockslideshow.caption.text, pageblockslideshow);
            G(pageblockslideshow.caption.credit, pageblockslideshow);
            int size = pageblockslideshow.items.size();
            while (i < size) {
                K(pageblockslideshow.items.get(i));
                i++;
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
        if (pageBlock instanceof vw) {
            vw vwVar = (vw) pageBlock;
            TL_iv.RichText richText2 = vwVar.e;
            if (richText2 != null) {
                L(null, richText2);
                G(vwVar.e, vwVar);
                return;
            } else {
                TL_iv.PageBlock pageBlock10 = vwVar.d;
                if (pageBlock10 != null) {
                    K(pageBlock10);
                    return;
                }
                return;
            }
        }
        if (pageBlock instanceof xw) {
            xw xwVar = (xw) pageBlock;
            TL_iv.RichText richText3 = xwVar.e;
            if (richText3 != null) {
                L(null, richText3);
                G(xwVar.e, xwVar);
                return;
            } else {
                TL_iv.PageBlock pageBlock11 = xwVar.d;
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
            while (i < size2) {
                K(pageblockcollage.items.get(i));
                i++;
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
            while (i < size3) {
                K(pageblockdetails.blocks.get(i));
                i++;
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
            for (int i2 = 0; i2 < size4; i2++) {
                TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i2);
                int size5 = pagetablerow.cells.size();
                for (int i3 = 0; i3 < size5; i3++) {
                    TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i3);
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
        if (richText2 != null) {
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
                for (int i = 0; i < size; i++) {
                    L(richText2, richText2.texts.get(i));
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
                boolean z = richText3 instanceof TL_iv.textPlain;
                HashMap hashMap = this.r;
                if (z) {
                    if (!TextUtils.isEmpty(((TL_iv.textPlain) richText3).text)) {
                        hashMap.put(lowerCase, textanchor);
                    }
                } else if (!(richText3 instanceof TL_iv.textEmpty)) {
                    hashMap.put(lowerCase, textanchor);
                }
                this.n.put(lowerCase, -1);
            }
        }
    }

    public final void M() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i);
            TL_iv.PageBlock w = o.w(pageBlock);
            if (!(w instanceof tw) || J((tw) w)) {
                arrayList.add(pageBlock);
            }
        }
        if (arrayList.size() < 100) {
            Utilities.e.a(this.M);
            Utilities.e.d(this.M, 100L);
        }
    }

    @Override // w39
    public final int b() {
        int i;
        TLRPC.WebPage webPage = this.F;
        if (webPage == null || webPage.cached_page == null) {
            i = 0;
        } else {
            i = this.d.size();
            if (this.F.cached_page.local == null) {
                i++;
            }
        }
        return this.J ? i + 1 : i;
    }

    @Override // w39
    public final int d(int i) {
        TL_iv.Page page;
        if (this.J) {
            if (i == 0) {
                return 2147483646;
            }
            i--;
        }
        ArrayList arrayList = this.d;
        if (i != arrayList.size()) {
            return I((TL_iv.PageBlock) arrayList.get(i));
        }
        TLRPC.WebPage webPage = this.F;
        return (webPage == null || (page = webPage.cached_page) == null || !page.web) ? 90 : 91;
    }

    @Override // w39
    public final void f() {
        M();
        super.f();
    }

    @Override // w39
    public final void g(int i) {
        M();
        super.g(i);
    }

    @Override // w39
    public final void j(int i, int i2) {
        M();
        super.j(i, i2);
    }

    @Override // w39
    public final void l(int i, int i2) {
        M();
        super.l(i, i2);
    }

    @Override // w39
    public final void n(int i, int i2, Object obj) {
        M();
        super.n(i, i2, obj);
    }

    @Override // w39
    public final void p(int i, int i2) {
        M();
        super.p(i, i2);
    }

    @Override // w39
    public final void q(int i, int i2) {
        M();
        super.q(i, i2);
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        if (this.J) {
            i--;
        }
        int i2 = i;
        if (i2 >= 0) {
            ArrayList arrayList = this.d;
            if (i2 < arrayList.size()) {
                H(s49Var.f, s49Var, (TL_iv.PageBlock) arrayList.get(i2), i2, arrayList.size(), false);
            }
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        View bvVar;
        View xvVar;
        byte b = 2;
        Activity activity = this.c;
        if (i != 2147483646) {
            o oVar = this.N;
            switch (i) {
                case 0:
                    bvVar = new bv(activity, oVar, this);
                    view = bvVar;
                    break;
                case 1:
                    bvVar = new vu(activity, oVar, this);
                    view = bvVar;
                    break;
                case 2:
                    view = new pu(activity);
                    break;
                case 3:
                    bvVar = new j(oVar, activity, this);
                    view = bvVar;
                    break;
                case 4:
                    bvVar = new rv(activity, oVar, this);
                    view = bvVar;
                    break;
                case 5:
                    xvVar = new xv(activity, oVar, this, 0);
                    view = xvVar;
                    break;
                case 6:
                    bvVar = new hv(activity, oVar, this);
                    view = bvVar;
                    break;
                case 7:
                    bvVar = new du(activity, oVar, this);
                    view = bvVar;
                    break;
                case 8:
                    bvVar = new pv(oVar, activity, this);
                    view = bvVar;
                    break;
                case 9:
                    xvVar = new cv(activity, oVar, this, 0);
                    view = xvVar;
                    break;
                case 10:
                    bvVar = new cu(activity, oVar, this);
                    view = bvVar;
                    break;
                case 11:
                    bvVar = new vv(activity, oVar, this);
                    view = bvVar;
                    break;
                case 12:
                    bvVar = new xu(activity, oVar, this);
                    view = bvVar;
                    break;
                case 13:
                    bvVar = new uu(activity, oVar, this);
                    view = bvVar;
                    break;
                case 14:
                    bvVar = new gv(activity, oVar, this);
                    view = bvVar;
                    break;
                case 15:
                    bvVar = new qv(activity, oVar, this);
                    view = bvVar;
                    break;
                case 16:
                    bvVar = new tu(activity, oVar, this);
                    view = bvVar;
                    break;
                case 17:
                    bvVar = new mu(oVar, activity, this);
                    view = bvVar;
                    break;
                case 18:
                    xvVar = new eu(activity, oVar, this, 0);
                    view = xvVar;
                    break;
                case 19:
                    bvVar = new bu(activity, oVar, this);
                    view = bvVar;
                    break;
                case 20:
                    bvVar = new wu(activity, oVar, this);
                    view = bvVar;
                    break;
                case 21:
                    bvVar = new av(activity, oVar, this);
                    view = bvVar;
                    break;
                case 22:
                    bvVar = new yu(activity, oVar, this);
                    view = bvVar;
                    break;
                case 23:
                    bvVar = new iv(activity, oVar, this);
                    view = bvVar;
                    break;
                case 24:
                    bvVar = new ou(activity, oVar, this);
                    view = bvVar;
                    break;
                case 25:
                    bvVar = new uv(activity, oVar, this);
                    view = bvVar;
                    break;
                case 26:
                    bvVar = new jv(activity, oVar, this);
                    view = bvVar;
                    break;
                case 27:
                    View nuVar = new nu(activity);
                    nuVar.setImportantForAccessibility(2);
                    view = nuVar;
                    break;
                case 28:
                    view = new kv(activity, oVar);
                    break;
                default:
                    switch (i) {
                        case kk7.a1 /* 90 */:
                            view = new mw(oVar, activity, false);
                            break;
                        case kk7.b1 /* 91 */:
                            view = new mw(oVar, activity, true);
                            break;
                        case kk7.c1 /* 92 */:
                            view = new zu(activity, oVar);
                            break;
                        default:
                            TextView textView = new TextView(activity);
                            textView.setBackgroundColor(-65536);
                            textView.setTextColor(-16777216);
                            textView.setTextSize(1, 20.0f);
                            view = textView;
                            break;
                    }
            }
        } else {
            View d62Var = new d62(activity, b);
            d62Var.setImportantForAccessibility(2);
            view = d62Var;
        }
        view.setLayoutParams(new e49(-1, -2));
        view.setFocusable(true);
        return new y29(view);
    }

    @Override // w39
    public final void y(s49 s49Var) {
        int i = s49Var.f;
        if (i == 90 || i == 91) {
            mw mwVar = (mw) s49Var.a;
            TL_iv.Page page = this.F.cached_page;
            int i2 = page != null ? page.views : 0;
            TextView textView = mwVar.b;
            TextView textView2 = mwVar.a;
            if (i2 == 0) {
                mwVar.c = false;
                textView.setVisibility(8);
                textView2.setGravity(17);
            } else {
                mwVar.c = true;
                textView.setVisibility(0);
                textView2.setGravity(21);
                textView.setText(k96.H(',', "Views", i2));
            }
            int i3 = bkb.L6;
            int w0 = bkb.w0(null, i3, false);
            int i4 = bkb.x6;
            textView2.setTextColor(bkb.w0(null, i4, false));
            textView.setTextColor(bkb.w0(null, i4, false));
            textView2.setBackgroundColor(Color.argb(34, Color.red(w0), Color.green(w0), Color.blue(w0)));
            zkb.X(textView2, i4, null);
            zkb.X(textView, i4, null);
            zkb.i(textView2, zkb.g(i3, 34), null);
        }
    }
}
