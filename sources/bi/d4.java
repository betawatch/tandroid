package bi;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Map;
import java.io.File;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.ef;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.messenger.x20;
import org.telegram.messenger.ye;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z60;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class d4 extends u51 {
    public static final ArrayList z4 = new ArrayList();
    public float A3;
    public float B3;
    public float C3;
    public float D3;
    public View E3;
    public b F3;
    public boolean G3;
    public boolean H3;
    public boolean I3;
    public boolean J3;
    public TL_iv.pageTableCell K3;
    public TL_iv.pageTableCell L3;
    public long M3;
    public float N3;
    public float O3;
    public boolean P3;
    public o2 Q3;
    public int R3;
    public n1 S3;
    public final l T3;
    public ArrayList U3;
    public int V3;
    public int W3;
    public int X3;
    public boolean Y3;
    public a Z3;
    public boolean a4;
    public final v3 b4;
    public final z2 c4;
    public final w3 d4;
    public final x3 e4;
    public final y3 f4;
    public final IdentityHashMap g4;
    public final IdentityHashMap h4;
    public a i4;
    public a j4;
    public final z3 k4;
    public final i3 l4;
    public final int m3;
    public final j3 m4;
    public final org.telegram.ui.ActionBar.p6 n3;
    public final k3 n4;
    public final b4 o3;
    public final l3 o4;
    public jj p3;
    public z5 p4;
    public boolean q3;
    public z60 q4;
    public TL_iv.RichMessage r3;
    public int r4;
    public final ArrayList s3;
    public int s4;
    public final HashMap t3;
    public final a3 t4;
    public final q3 u3;
    public final m3 u4;
    public final v9 v3;
    public final a4.l v4;
    public int w3;
    public final ArrayList w4;
    public int x3;
    public dl0 x4;
    public int y3;
    public int y4;
    public boolean z3;

    public d4(Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, b4 b4Var) {
        super(context, i10, 0, false, new ag.a(r1, 13), new a1.c(r1, 10), null, p6Var);
        this.q3 = true;
        this.s3 = new ArrayList();
        this.t3 = new HashMap();
        this.w3 = -1;
        this.x3 = -1;
        this.y3 = 0;
        this.T3 = new l(this, 2);
        this.Y3 = true;
        this.b4 = new v3(this);
        this.c4 = new z2(this);
        this.d4 = new w3(this);
        this.e4 = new x3(this);
        this.f4 = new y3(this);
        this.g4 = new IdentityHashMap();
        this.h4 = new IdentityHashMap();
        this.k4 = new z3(this);
        this.l4 = new i3(this);
        this.m4 = new j3(this);
        this.n4 = new k3(this);
        this.o4 = new l3(this);
        this.r4 = -1;
        this.s4 = -1;
        this.t4 = new a3(this);
        this.u4 = new m3(this);
        a4.l lVar = new a4.l(this, 7);
        this.v4 = lVar;
        this.w4 = new ArrayList();
        this.y4 = -1;
        d4[] d4VarArr = {this};
        this.m3 = i10;
        this.n3 = p6Var;
        this.o3 = b4Var;
        this.f3.r = false;
        setClipToPadding(false);
        setClipChildren(false);
        E1(new ag.a(this, 14), false);
        setReorderLongPressEnabled(false);
        z1(true);
        q3 q3Var = new q3(this, b4Var);
        this.u3 = q3Var;
        q3Var.S(this);
        q3Var.z0 = this.e3;
        v9 n10 = q3Var.n(context);
        this.v3 = n10;
        org.telegram.messenger.i0.E2(n10);
        q3Var.D = new s3(this, b4Var);
        j(new t3(0, this, b4Var));
        this.Q3 = new o2(lVar);
    }

    public static boolean A3(a aVar) {
        return aVar != null && (aVar.b instanceof TL_iv.pageBlockDetails);
    }

    public static boolean C3(TL_iv.PageBlock pageBlock) {
        return ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || H3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !q6.z(pageBlock).isEmpty()) ? false : true;
    }

    public static boolean D3(TL_iv.PageBlock pageBlock) {
        return (H3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails)) ? false : true;
    }

    public static boolean E3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow);
    }

    public static boolean F3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
    }

    public static boolean G3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || E3(pageBlock);
    }

    public static boolean H3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockDivider) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockMath) || (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockTable) || (pageBlock instanceof TL_iv.pageBlockButtonRow) || (pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList);
    }

    public static boolean I3(a aVar) {
        return aVar != null && !aVar.i && !A3(aVar) && (aVar.b instanceof TL_iv.pageBlockParagraph) && aVar.c == 0 && aVar.d == 0 && !aVar.e && aVar.k.isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0128, code lost:
    
        r18 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0154, code lost:
    
        r22.L();
        r12 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void L1(d4[] d4VarArr, ArrayList arrayList, p51 p51Var) {
        int i10;
        boolean z10;
        ArrayList arrayList2;
        int i11;
        boolean z11;
        int i12;
        d4 d4Var = d4VarArr[0];
        if (d4Var != null) {
            ArrayList arrayList3 = d4Var.s3;
            d4Var.d2();
            ArrayList arrayList4 = d4Var.w4;
            arrayList4.clear();
            HashMap hashMap = new HashMap();
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i10 = 1;
                if (i13 >= arrayList3.size()) {
                    break;
                }
                a aVar = (a) arrayList3.get(i13);
                boolean z12 = aVar.i;
                ArrayList arrayList5 = aVar.k;
                if (!z12) {
                    for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                        Map.-EL.merge(hashMap, (Long) arrayList5.get(i15), 1, new e3());
                    }
                    if (aVar.b instanceof TL_iv.pageBlockParagraph) {
                        i14++;
                    }
                }
                i13++;
            }
            boolean z13 = i14 == 1;
            ArrayList arrayList6 = new ArrayList();
            int i16 = -1;
            int i17 = 0;
            int i18 = 0;
            int i19 = -1;
            a aVar2 = null;
            while (i17 < arrayList3.size()) {
                a aVar3 = (a) arrayList3.get(i17);
                boolean z14 = aVar3.i;
                ArrayList arrayList7 = aVar3.k;
                if (z14) {
                    int i20 = i19 != i16 ? i10 : 0;
                    if (!arrayList6.isEmpty()) {
                        a1.g.x(i10, arrayList6);
                    }
                    if (i19 == i16 || arrayList6.size() >= i19) {
                        if (i20 == 0) {
                            if (i18 != 0) {
                                p51Var.L();
                                i18 = 0;
                            }
                            int i21 = z0.b;
                            a51 K = a51.K(z0.class);
                            K.G = aVar3;
                            arrayList.add(K);
                            arrayList4.add(aVar3);
                        }
                        z10 = z13;
                        arrayList2 = arrayList6;
                        i11 = i10;
                    } else {
                        z10 = z13;
                        arrayList2 = arrayList6;
                        i11 = i10;
                        i19 = i16;
                    }
                } else {
                    int i22 = i19 != i16 ? i10 : 0;
                    if (A3(aVar3)) {
                        if (i22 == 0) {
                            boolean z15 = ((TL_iv.pageBlockDetails) aVar3.b).open;
                            if (!arrayList6.isEmpty() || z15) {
                                if (i18 != 0) {
                                    p51Var.L();
                                    i18 = 0;
                                }
                            } else if (i18 == 0) {
                                p51Var.M();
                                i18 = i10;
                            }
                            l3 l3Var = d4Var.o4;
                            int i23 = x0.b;
                            a51 K2 = a51.K(x0.class);
                            K2.G = aVar3;
                            K2.H = l3Var;
                            arrayList.add(K2);
                            arrayList4.add(aVar3);
                            if (!z15) {
                                i19 = arrayList6.size() + 1;
                            }
                        }
                        arrayList6.add(aVar3);
                    } else if (i22 == 0) {
                        if (aVar2 != null) {
                            ArrayList arrayList8 = aVar2.k;
                            int size = arrayList8.size();
                            int i24 = 0;
                            while (true) {
                                z10 = z13;
                                if (i24 >= size || i24 >= arrayList7.size()) {
                                    break;
                                }
                                arrayList2 = arrayList6;
                                if (!((Long) arrayList8.get(i24)).equals(arrayList7.get(i24))) {
                                    break;
                                }
                                i24++;
                                z13 = z10;
                                arrayList6 = arrayList2;
                            }
                            int i25 = size - 1;
                            while (i25 >= i24) {
                                Long l4 = (Long) arrayList8.get(i25);
                                l4.getClass();
                                Integer num = (Integer) hashMap.get(l4);
                                if (num != null) {
                                    i12 = i24;
                                    if (num.intValue() >= 2 || i25 > 0 || d4Var.t3.containsKey(l4)) {
                                    }
                                } else {
                                    i12 = i24;
                                }
                                i25--;
                                i24 = i12;
                            }
                        } else {
                            z10 = z13;
                            arrayList2 = arrayList6;
                        }
                        if (aVar2 != null) {
                            d4Var.v3(aVar2, arrayList7, hashMap, arrayList);
                        }
                        if (arrayList2.isEmpty()) {
                            if (i18 == 0) {
                                p51Var.M();
                                i18 = 1;
                            }
                        } else if (i18 != 0) {
                            p51Var.L();
                            i18 = 0;
                        }
                        TL_iv.PageBlock pageBlock = aVar3.b;
                        if (pageBlock instanceof TL_iv.pageBlockDivider) {
                            z2 z2Var = d4Var.c4;
                            int i26 = b1.b;
                            a51 K3 = a51.K(b1.class);
                            K3.G = aVar3;
                            K3.H = z2Var;
                            arrayList.add(K3);
                        } else if (G3(pageBlock)) {
                            w3 w3Var = d4Var.d4;
                            int i27 = e5.b;
                            a51 K4 = a51.K(e5.class);
                            K4.d = (int) aVar3.a;
                            K4.G = aVar3;
                            K4.H = w3Var;
                            arrayList.add(K4);
                        } else {
                            TL_iv.PageBlock pageBlock2 = aVar3.b;
                            if (pageBlock2 instanceof TL_iv.pageBlockAudio) {
                                x3 x3Var = d4Var.e4;
                                int i28 = a0.b;
                                a51 K5 = a51.K(a0.class);
                                K5.G = aVar3;
                                K5.H = x3Var;
                                arrayList.add(K5);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockDocument) {
                                y3 y3Var = d4Var.f4;
                                int i29 = d1.b;
                                a51 K6 = a51.K(d1.class);
                                K6.G = aVar3;
                                K6.H = y3Var;
                                arrayList.add(K6);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockMap) {
                                z3 z3Var = d4Var.k4;
                                int i30 = x4.b;
                                a51 K7 = a51.K(x4.class);
                                K7.G = aVar3;
                                K7.H = z3Var;
                                arrayList.add(K7);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockMath) {
                                i3 i3Var = d4Var.l4;
                                int i31 = z4.b;
                                a51 K8 = a51.K(z4.class);
                                K8.G = aVar3;
                                K8.H = i3Var;
                                arrayList.add(K8);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                                k3 k3Var = d4Var.n4;
                                int i32 = x5.b;
                                a51 K9 = a51.K(x5.class);
                                K9.G = aVar3;
                                K9.H = k3Var;
                                arrayList.add(K9);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockButtonRow) {
                                v3 v3Var = d4Var.b4;
                                int i33 = i0.b;
                                a51 K10 = a51.K(i0.class);
                                K10.G = aVar3;
                                K10.H = v3Var;
                                arrayList.add(K10);
                            } else {
                                aVar3.p = i17 == 0;
                                aVar3.q = z10 && (pageBlock2 instanceof TL_iv.pageBlockParagraph);
                                if (arrayList3.size() == 2) {
                                    i11 = 1;
                                    if (i17 == 1 && (aVar3.b instanceof TL_iv.pageBlockParagraph) && (((a) arrayList3.get(0)).b instanceof TL_iv.pageBlockHeading1)) {
                                        z11 = true;
                                        m3 m3Var = d4Var.u4;
                                        int i34 = o6.b;
                                        a51 K11 = a51.K(o6.class);
                                        K11.G = aVar3;
                                        K11.H = m3Var;
                                        K11.r = z11;
                                        arrayList.add(K11);
                                        arrayList4.add(aVar3);
                                        aVar2 = aVar3;
                                    }
                                } else {
                                    i11 = 1;
                                }
                                z11 = false;
                                m3 m3Var2 = d4Var.u4;
                                int i342 = o6.b;
                                a51 K112 = a51.K(o6.class);
                                K112.G = aVar3;
                                K112.H = m3Var2;
                                K112.r = z11;
                                arrayList.add(K112);
                                arrayList4.add(aVar3);
                                aVar2 = aVar3;
                            }
                        }
                        i11 = 1;
                        arrayList4.add(aVar3);
                        aVar2 = aVar3;
                    }
                    z10 = z13;
                    arrayList2 = arrayList6;
                    i11 = i10;
                }
                i17++;
                i10 = i11;
                z13 = z10;
                arrayList6 = arrayList2;
                i16 = -1;
            }
            int i35 = i10;
            if (i18 != 0) {
                p51Var.L();
            }
            if (aVar2 != null) {
                d4Var.v3(aVar2, z4, hashMap, arrayList);
            }
            int i36 = 0;
            while (i36 < arrayList4.size()) {
                a aVar4 = (a) arrayList4.get(i36);
                aVar4.n = false;
                aVar4.o = false;
                aVar4.l = 0;
                aVar4.m = 0;
                int size2 = aVar4.k.size();
                if (size2 != 0) {
                    a aVar5 = i36 > 0 ? (a) arrayList4.get(i36 - 1) : null;
                    int i37 = i36 + 1;
                    a aVar6 = i37 < arrayList4.size() ? (a) arrayList4.get(i37) : null;
                    aVar4.l = size2 - o4(aVar4, aVar5);
                    int o42 = size2 - o4(aVar4, aVar6);
                    aVar4.m = o42;
                    aVar4.n = aVar4.l > 0 ? i35 : 0;
                    aVar4.o = o42 > 0 ? i35 : 0;
                }
                i36++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void M2(a aVar, ArrayList arrayList) {
        TLRPC.Document document;
        TL_iv.pageBlockCollage pageblockcollage;
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            w wVar = aVar.g;
            if (wVar == null || !wVar.b()) {
                return;
            }
            TL_iv.PageBlock pageBlock2 = aVar.b;
            if (((TL_iv.pageBlockPhoto) pageBlock2).photo_id != 0) {
                if (pageBlock2.caption == null) {
                    pageBlock2.caption = new TL_iv.PageCaption();
                    aVar.b.caption.text = new TL_iv.textEmpty();
                    aVar.b.caption.credit = new TL_iv.textEmpty();
                }
                arrayList.add(aVar.b);
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            w wVar2 = aVar.g;
            if (wVar2 == null || !wVar2.b()) {
                return;
            }
            TL_iv.PageBlock pageBlock3 = aVar.b;
            if (((TL_iv.pageBlockVideo) pageBlock3).video_id != 0) {
                if (pageBlock3.caption == null) {
                    pageBlock3.caption = new TL_iv.PageCaption();
                    aVar.b.caption.text = new TL_iv.textEmpty();
                    aVar.b.caption.credit = new TL_iv.textEmpty();
                }
                arrayList.add(aVar.b);
                return;
            }
            return;
        }
        if (E3(pageBlock)) {
            ArrayList j32 = j3(aVar.b);
            List T3 = T3(aVar);
            ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
            for (int i10 = 0; j32 != null && i10 < j32.size() && i10 < T3.size(); i10++) {
                TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) j32.get(i10);
                if (((w) T3.get(i10)).b()) {
                    if ((pageBlock4 instanceof TL_iv.pageBlockPhoto ? ((TL_iv.pageBlockPhoto) pageBlock4).photo_id : pageBlock4 instanceof TL_iv.pageBlockVideo ? ((TL_iv.pageBlockVideo) pageBlock4).video_id : 0L) != 0) {
                        n0.d(pageBlock4);
                        arrayList2.add(pageBlock4);
                    }
                }
            }
            if (arrayList2.size() < 2) {
                if (arrayList2.size() == 1) {
                    arrayList.add(arrayList2.get(0));
                    return;
                }
                return;
            }
            if (aVar.b instanceof TL_iv.pageBlockSlideshow) {
                TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                pageblockslideshow.items = arrayList2;
                pageblockslideshow.caption = aVar.b.caption;
                pageblockcollage = pageblockslideshow;
            } else {
                TL_iv.pageBlockCollage pageblockcollage2 = new TL_iv.pageBlockCollage();
                pageblockcollage2.items = arrayList2;
                pageblockcollage2.caption = aVar.b.caption;
                pageblockcollage = pageblockcollage2;
            }
            n0.d(pageblockcollage);
            arrayList.add(pageblockcollage);
            return;
        }
        TL_iv.PageBlock pageBlock5 = aVar.b;
        if (pageBlock5 instanceof TL_iv.pageBlockAudio) {
            w wVar3 = aVar.g;
            if (wVar3 == null || !wVar3.b()) {
                return;
            }
            TL_iv.PageBlock pageBlock6 = aVar.b;
            if (((TL_iv.pageBlockAudio) pageBlock6).audio_id != 0) {
                if (pageBlock6.caption == null) {
                    pageBlock6.caption = new TL_iv.PageCaption();
                    aVar.b.caption.text = new TL_iv.textEmpty();
                    aVar.b.caption.credit = new TL_iv.textEmpty();
                }
                arrayList.add(aVar.b);
                return;
            }
            return;
        }
        if (pageBlock5 instanceof TL_iv.pageBlockDocument) {
            w wVar4 = aVar.g;
            if (wVar4 != null && (document = wVar4.h) != null) {
                ((TL_iv.pageBlockDocument) pageBlock5).document_id = document.id;
            }
            if (wVar4 == null || !wVar4.b()) {
                return;
            }
            TL_iv.PageBlock pageBlock7 = aVar.b;
            if (((TL_iv.pageBlockDocument) pageBlock7).document_id != 0) {
                n0.d(pageBlock7);
                arrayList.add(aVar.b);
                return;
            }
            return;
        }
        if (pageBlock5 instanceof TL_iv.pageBlockMap) {
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock5;
            int i11 = y4.M;
            if (pageblockmap.geo instanceof TLRPC.TL_geoPoint) {
                if (pageblockmap.caption == null) {
                    TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
                    pageblockmap.caption = pageCaption;
                    pageCaption.text = new TL_iv.textEmpty();
                    pageblockmap.caption.credit = new TL_iv.textEmpty();
                }
                arrayList.add(pageblockmap);
                return;
            }
            return;
        }
        if (pageBlock5 instanceof TL_iv.pageBlockMath) {
            if (TextUtils.isEmpty(((TL_iv.pageBlockMath) pageBlock5).source)) {
                return;
            }
            arrayList.add(aVar.b);
            return;
        }
        if (!(pageBlock5 instanceof TL_iv.pageBlockTable)) {
            if (!(pageBlock5 instanceof TL_iv.pageBlockButtonRow)) {
                arrayList.add(pageBlock5);
                return;
            }
            TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock5;
            ArrayList<TL_keyboard.PageButton> arrayList3 = pageblockbuttonrow.buttons;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                return;
            }
            arrayList.add(pageblockbuttonrow);
            return;
        }
        TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock5;
        if (pageblocktable.title == null) {
            pageblocktable.title = new TL_iv.textEmpty();
        }
        if (pageblocktable.rows != null) {
            for (int i12 = 0; i12 < pageblocktable.rows.size(); i12++) {
                TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i12);
                if (pagetablerow.cells != null) {
                    for (int i13 = 0; i13 < pagetablerow.cells.size(); i13++) {
                        TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i13);
                        if (pagetablecell.text == null) {
                            w6.c(pagetablecell, "");
                        } else {
                            pagetablecell.flags |= 128;
                        }
                        pagetablecell.flags = pagetablecell.colspan > 1 ? pagetablecell.flags | 2 : pagetablecell.flags & (-3);
                        pagetablecell.flags = pagetablecell.rowspan > 1 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
                    }
                }
            }
        }
        if (R4(pageblocktable)) {
            arrayList.add(pageblocktable);
        }
    }

    public static void N1(d4 d4Var, int i10, int i11, int i12) {
        if (i10 < 0) {
            return;
        }
        KeyEvent.Callback m10 = d4Var.e3.m(i10);
        if (m10 instanceof q6) {
            q6 q6Var = (q6) m10;
            n1 authorEditText = (i11 == 1 && q6Var.n()) ? q6Var.getAuthorEditText() : q6Var.getEditText();
            authorEditText.O();
            authorEditText.setSelection(Math.max(0, Math.min(i12, authorEditText.length())));
            return;
        }
        if (!(m10 instanceof z5)) {
            if (m10 instanceof o0) {
                n1 captionEditText = ((o0) m10).getCaptionEditText();
                captionEditText.O();
                captionEditText.setSelection(Math.max(0, Math.min(i12, captionEditText.length())));
                return;
            }
            return;
        }
        z5 z5Var = (z5) m10;
        n1 m11 = z5Var.m(i11);
        if (m11 == null) {
            m11 = z5Var.m(0);
        }
        if (m11 == null) {
            return;
        }
        m11.O();
        m11.setSelection(Math.max(0, Math.min(i12, m11.length())));
    }

    public static boolean N2(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0065, code lost:
    
        if (r0 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TL_iv.PageBlock O1(d4 d4Var, a aVar, int i10, int i11) {
        TL_iv.PageBlock pageblockparagraph;
        d4Var.getClass();
        if (!D3(aVar.b)) {
            return null;
        }
        Editable P4 = d4Var.P4(aVar);
        int length = P4.length();
        int max = Math.max(0, Math.min(i10, length));
        if (i11 >= 0) {
            length = Math.max(0, Math.min(i11, length));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(P4.subSequence(Math.min(max, length), Math.max(max, length)));
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock != null) {
            try {
                O2(pageBlock);
                SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
                pageBlock.serializeToStream(serializedData);
                SerializedData serializedData2 = new SerializedData(serializedData.toByteArray());
                pageblockparagraph = TL_iv.PageBlock.TLdeserialize(serializedData2, serializedData2.readInt32(true), true);
                serializedData.cleanup();
                serializedData2.cleanup();
            } catch (Throwable th2) {
                f8.g(th2, true);
            }
        }
        pageblockparagraph = new TL_iv.pageBlockParagraph();
        pageblockparagraph.text = new TL_iv.textEmpty();
        q6.d(pageblockparagraph, spannableStringBuilder);
        return pageblockparagraph;
    }

    public static void O2(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return;
        }
        if (pageBlock.text == null) {
            pageBlock.text = new TL_iv.textEmpty();
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
            if (pageblockpreformatted.language == null) {
                pageblockpreformatted.language = "";
                return;
            }
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.caption == null) {
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return;
            }
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            if (pageblockpullquote.caption == null) {
                pageblockpullquote.caption = new TL_iv.textEmpty();
            }
        }
    }

    public static void P1(d4 d4Var, n1 n1Var) {
        if (n1Var == null) {
            d4Var.getClass();
            return;
        }
        n1Var.W1 = d4Var.q3;
        n1Var.setInlineButtonContext(d4Var.m3);
        n1Var.setInlineButtonClickListener(new a3(d4Var));
    }

    public static void Q1(a aVar, w wVar, d4 d4Var) {
        b4 b4Var = d4Var.o3;
        IdentityHashMap identityHashMap = d4Var.h4;
        IdentityHashMap identityHashMap2 = d4Var.g4;
        if (wVar != null) {
            l5 l5Var = (l5) identityHashMap2.remove(wVar);
            if (l5Var != null) {
                l5Var.b();
            }
            h5 h5Var = (h5) identityHashMap.remove(wVar);
            if (h5Var != null) {
                h5Var.a();
            }
            o2 o2Var = d4Var.Q3;
            if (o2Var != null) {
                o2Var.d();
            }
            d4Var.t4(aVar, wVar);
            o2 o2Var2 = d4Var.Q3;
            if (o2Var2 != null) {
                o2Var2.h();
            }
            b4Var.onContentChanged();
            return;
        }
        ArrayList arrayList = d4Var.s3;
        for (w wVar2 : T3(aVar)) {
            l5 l5Var2 = (l5) identityHashMap2.remove(wVar2);
            if (l5Var2 != null) {
                l5Var2.b();
            }
            h5 h5Var2 = (h5) identityHashMap.remove(wVar2);
            if (h5Var2 != null) {
                h5Var2.a();
            }
        }
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0) {
            o2 o2Var3 = d4Var.Q3;
            if (o2Var3 != null) {
                o2Var3.d();
            }
            arrayList.remove(indexOf);
            d4Var.f3.O(true);
            o2 o2Var4 = d4Var.Q3;
            if (o2Var4 != null) {
                o2Var4.h();
            }
        }
        b4Var.onContentChanged();
    }

    public static void Q2(ArrayList arrayList, ArrayList arrayList2, int i10, boolean z10, int i11, boolean z11, boolean z12) {
        boolean z13 = false;
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i12);
                if ((pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (!z13) {
                        V1(arrayList, null, i10, i11, z11, z12);
                        z13 = true;
                    }
                    R2(arrayList, pageBlock, i10 + 1);
                } else if (z13) {
                    arrayList.add(new a(pageBlock, i10, z10 ? 1 : 0));
                } else {
                    if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                        V1(arrayList, ((TL_iv.pageBlockParagraph) pageBlock).text, i10, i11, z11, z12);
                    } else {
                        a aVar = new a(pageBlock, i10, i11);
                        aVar.e = z11;
                        aVar.f = z12;
                        arrayList.add(aVar);
                    }
                    z13 = true;
                }
            }
        }
        if (z13) {
            return;
        }
        V1(arrayList, null, i10, i11, z11, z12);
    }

    public static TL_iv.PageBlock Q3(a aVar, w wVar) {
        if (!E3(aVar.b)) {
            return aVar.b;
        }
        ArrayList j32 = j3(aVar.b);
        ArrayList arrayList = aVar.h;
        int indexOf = arrayList != null ? arrayList.indexOf(wVar) : -1;
        if (indexOf < 0 || j32 == null || indexOf >= j32.size()) {
            return null;
        }
        return (TL_iv.PageBlock) j32.get(indexOf);
    }

    public static void R1(d4 d4Var) {
        if (d4Var.P3) {
            return;
        }
        o2 o2Var = d4Var.Q3;
        if (o2Var != null) {
            o2Var.h();
        }
        d4Var.o3.r();
        d4Var.r4();
    }

    public static void R2(ArrayList arrayList, TL_iv.PageBlock pageBlock, int i10) {
        int i11 = 0;
        if (!(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
            ArrayList<TL_iv.PageListItem> arrayList2 = ((TL_iv.pageBlockList) pageBlock).items;
            int size = arrayList2.size();
            while (i11 < size) {
                TL_iv.PageListItem pageListItem = arrayList2.get(i11);
                i11++;
                TL_iv.PageListItem pageListItem2 = pageListItem;
                if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                    V1(arrayList, ((TL_iv.TL_pageListItemText) pageListItem2).text, i10, 0, pageListItem2.checkbox, pageListItem2.checked);
                } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                    Q2(arrayList, ((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, i10, false, 0, pageListItem2.checkbox, pageListItem2.checked);
                }
            }
            return;
        }
        ArrayList<TL_iv.PageListOrderedItem> arrayList3 = ((TL_iv.pageBlockOrderedList) pageBlock).items;
        int size2 = arrayList3.size();
        int i12 = 1;
        while (i11 < size2) {
            TL_iv.PageListOrderedItem pageListOrderedItem = arrayList3.get(i11);
            i11++;
            TL_iv.PageListOrderedItem pageListOrderedItem2 = pageListOrderedItem;
            if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                V1(arrayList, ((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, i10, i12, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
            } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                int i13 = i12;
                Q2(arrayList, ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, i10, true, i13, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                i12 = i13;
            }
            i12++;
        }
    }

    public static boolean R4(TL_iv.pageBlockTable pageblocktable) {
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !TextUtils.isEmpty(s6.l(richText))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i10 = 0; i10 < pageblocktable.rows.size(); i10++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i10);
            for (int i11 = 0; i11 < pagetablerow.cells.size(); i11++) {
                if (!w6.g(pagetablerow.cells.get(i11)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void S1(d4 d4Var, a aVar) {
        ArrayList arrayList = d4Var.s3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        o2 o2Var = d4Var.Q3;
        if (o2Var != null) {
            o2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar2.k.addAll(aVar.k);
        arrayList.add(indexOf + 1, aVar2);
        d4Var.v4();
        d4Var.f3.O(false);
        o2 o2Var2 = d4Var.Q3;
        if (o2Var2 != null) {
            o2Var2.h();
        }
        d4Var.post(new v2(d4Var, aVar2, 23));
    }

    public static FrameLayout S4(z5 z5Var, boolean z10) {
        c6 m10;
        w6 model = z5Var.getModel();
        if (model != null) {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i11 = z10 ? -1 : Integer.MAX_VALUE;
            TL_iv.pageTableCell pagetablecell = null;
            for (TL_iv.pageTableCell pagetablecell2 : z5Var.getSelectedCells()) {
                int a2 = model.a(pagetablecell2);
                int o10 = z10 ? (w6.o(pagetablecell2) + model.b(pagetablecell2)) - 1 : model.b(pagetablecell2);
                if (!z10 ? o10 < i11 || (o10 == i11 && a2 < i10) : o10 > i11 || (o10 == i11 && a2 < i10)) {
                    pagetablecell = pagetablecell2;
                    i10 = a2;
                    i11 = o10;
                }
            }
            if (pagetablecell != null && (m10 = z5Var.getGrid().m(pagetablecell)) != null) {
                return m10;
            }
        }
        return z5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d2, code lost:
    
        if (((java.lang.Long) r7.k.get(r9)).longValue() == r11) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0118, code lost:
    
        if (((java.lang.Long) r7.k.get(r9)).longValue() == r11) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean T1(d4 d4Var, a aVar, boolean z10) {
        int i10;
        n1 editText;
        Editable text;
        o2 o2Var;
        o2 o2Var2;
        int i11;
        ArrayList arrayList = d4Var.w4;
        p51 p51Var = d4Var.f3;
        ArrayList arrayList2 = d4Var.s3;
        int indexOf = arrayList2.indexOf(aVar);
        if (indexOf >= 0) {
            TL_iv.PageBlock pageBlock = aVar.b;
            ArrayList arrayList3 = aVar.k;
            if (F3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote)) {
                d4Var.X4(aVar, new TL_iv.pageBlockParagraph(), 0, 0, false, false);
                return true;
            }
            if (aVar.c > 0) {
                o2 o2Var3 = d4Var.Q3;
                if (o2Var3 != null) {
                    o2Var3.d();
                }
                View C1 = d4Var.C1(aVar);
                if (C1 instanceof q6) {
                    q6 q6Var = (q6) C1;
                    if (q6Var.getEditText().isFocused()) {
                        i11 = q6Var.getEditText().getSelectionEnd();
                        d4Var.w2(indexOf);
                        d4Var.v4();
                        if (d4Var.findFocus() instanceof n1) {
                            p51Var.O(false);
                            o2 o2Var4 = d4Var.Q3;
                            if (o2Var4 != null) {
                                o2Var4.h();
                            }
                            d4Var.post(new h3(d4Var, aVar, 1));
                            return true;
                        }
                        d4Var.a2();
                        o2 o2Var5 = d4Var.Q3;
                        if (o2Var5 != null) {
                            o2Var5.h();
                        }
                        if (i11 >= 0) {
                            d4Var.post(new x2(d4Var, aVar, i11, 2));
                            return true;
                        }
                    }
                }
                i11 = -1;
                d4Var.w2(indexOf);
                d4Var.v4();
                if (d4Var.findFocus() instanceof n1) {
                }
            } else {
                if (!arrayList3.isEmpty() && z10) {
                    ArrayList arrayList4 = ((a) arrayList2.get(indexOf)).k;
                    if (!arrayList4.isEmpty()) {
                        int size = arrayList4.size() - 1;
                        long longValue = ((Long) arrayList4.get(size)).longValue();
                        if (indexOf != 0) {
                            a aVar2 = (a) arrayList2.get(indexOf - 1);
                            if (aVar2.k.size() > size) {
                            }
                        }
                        o2Var = d4Var.Q3;
                        if (o2Var != null) {
                            o2Var.d();
                        }
                        arrayList3.remove(arrayList3.size() - 1);
                        d4Var.A2();
                        d4Var.v4();
                        p51Var.O(false);
                        o2Var2 = d4Var.Q3;
                        if (o2Var2 != null) {
                            o2Var2.h();
                        }
                        d4Var.post(new h3(d4Var, aVar, 2));
                        return true;
                    }
                    ArrayList arrayList5 = ((a) arrayList2.get(indexOf)).k;
                    if (!arrayList5.isEmpty()) {
                        int size2 = arrayList5.size() - 1;
                        long longValue2 = ((Long) arrayList5.get(size2)).longValue();
                        int i12 = indexOf + 1;
                        if (i12 < arrayList2.size()) {
                            a aVar3 = (a) arrayList2.get(i12);
                            if (aVar3.k.size() > size2) {
                            }
                        }
                    }
                    o2Var = d4Var.Q3;
                    if (o2Var != null) {
                    }
                    arrayList3.remove(arrayList3.size() - 1);
                    d4Var.A2();
                    d4Var.v4();
                    p51Var.O(false);
                    o2Var2 = d4Var.Q3;
                    if (o2Var2 != null) {
                    }
                    d4Var.post(new h3(d4Var, aVar, 2));
                    return true;
                }
                if (indexOf > 0) {
                    int i13 = indexOf - 1;
                    a aVar4 = (a) arrayList2.get(i13);
                    if (A3(aVar4) || aVar4.i) {
                        if (z10 && (!A3(aVar4) || ((i10 = indexOf + 1) < arrayList2.size() && !((a) arrayList2.get(i10)).i))) {
                            o2 o2Var6 = d4Var.Q3;
                            if (o2Var6 != null) {
                                o2Var6.d();
                            }
                            arrayList2.remove(indexOf);
                            d4Var.v4();
                            p51Var.O(false);
                            o2 o2Var7 = d4Var.Q3;
                            if (o2Var7 != null) {
                                o2Var7.h();
                            }
                            d4Var.post(new h3(d4Var, aVar4, 3));
                        }
                    } else {
                        if (H3(aVar4.b)) {
                            o2 o2Var8 = d4Var.Q3;
                            if (o2Var8 != null) {
                                o2Var8.d();
                            }
                            arrayList2.remove(i13);
                            d4Var.v4();
                            p51Var.O(false);
                            o2 o2Var9 = d4Var.Q3;
                            if (o2Var9 != null) {
                                o2Var9.h();
                            }
                            d4Var.post(new h3(d4Var, aVar, 4));
                            return true;
                        }
                        o2 o2Var10 = d4Var.Q3;
                        if (o2Var10 != null) {
                            o2Var10.d();
                        }
                        View C12 = d4Var.C1(aVar4);
                        int indexOf2 = arrayList.indexOf(aVar);
                        if (!(C12 instanceof q6) || indexOf2 < 0) {
                            SpannableStringBuilder A = q6.A(aVar4.b);
                            int length = A.length();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A);
                            spannableStringBuilder.append((CharSequence) q6.A(aVar.b));
                            q6.d(aVar4.b, spannableStringBuilder);
                            arrayList2.remove(indexOf);
                            d4Var.A2();
                            d4Var.v4();
                            p51Var.O(false);
                            o2 o2Var11 = d4Var.Q3;
                            if (o2Var11 != null) {
                                o2Var11.h();
                            }
                            d4Var.post(new x2(d4Var, aVar4, length, 5));
                            return true;
                        }
                        q6 q6Var2 = (q6) C12;
                        n1 editText2 = q6Var2.getEditText();
                        int length2 = editText2.length();
                        SpannableStringBuilder A2 = q6.A(aVar.b);
                        Editable text2 = editText2.getText();
                        if (text2 != null && A2 != null && A2.length() != 0) {
                            editText2.c2 = true;
                            text2.append((CharSequence) A2);
                            editText2.c2 = false;
                        }
                        q6.d(aVar4.b, editText2.getText());
                        View C13 = d4Var.C1(aVar);
                        if ((C13 instanceof q6) && (text = (editText = ((q6) C13).getEditText()).getText()) != null && text.length() > 0) {
                            editText.c2 = true;
                            text.delete(0, text.length());
                            editText.c2 = false;
                        }
                        q6Var2.B();
                        editText2.setSelection(Math.max(0, Math.min(length2, editText2.length())));
                        arrayList2.remove(indexOf);
                        boolean A22 = d4Var.A2();
                        d4Var.v4();
                        if (A22) {
                            p51Var.O(false);
                            o2 o2Var12 = d4Var.Q3;
                            if (o2Var12 != null) {
                                o2Var12.h();
                            }
                            d4Var.post(new x2(d4Var, aVar4, Math.max(0, length2), 4));
                            return true;
                        }
                        p51Var.T();
                        d4Var.s4(indexOf);
                        s4.l0 itemAnimator = d4Var.getItemAnimator();
                        d4Var.setItemAnimator(null);
                        p51Var.s(indexOf2);
                        if ((aVar4.d > 0 || aVar.d > 0) && indexOf2 < arrayList.size()) {
                            p51Var.k(indexOf2, arrayList.size() - indexOf2);
                        }
                        d4Var.post(new g3(d4Var, itemAnimator, 1));
                        o2 o2Var13 = d4Var.Q3;
                        if (o2Var13 != null) {
                            o2Var13.h();
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static List T3(a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (E3(aVar.b)) {
            ArrayList arrayList = aVar.h;
            return arrayList != null ? arrayList : Collections.EMPTY_LIST;
        }
        w wVar = aVar.g;
        return wVar != null ? Collections.singletonList(wVar) : Collections.EMPTY_LIST;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static n1 U3(View view) {
        if (view instanceof q6) {
            return ((q6) view).getEditText();
        }
        if (view instanceof o0) {
            return ((o0) view).getCaptionEditText();
        }
        if (view instanceof y0) {
            return ((y0) view).getEditText();
        }
        return null;
    }

    public static void V1(ArrayList arrayList, TL_iv.RichText richText, int i10, int i11, boolean z10, boolean z11) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        if (richText == null) {
            richText = new TL_iv.textEmpty();
        }
        pageblockparagraph.text = richText;
        a aVar = new a(pageblockparagraph, i10, i11);
        aVar.e = z10;
        aVar.f = z11;
        arrayList.add(aVar);
    }

    public static TL_iv.PageBlock V3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return new TL_iv.pageBlockHeading1();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return new TL_iv.pageBlockHeading2();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return new TL_iv.pageBlockHeading3();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return new TL_iv.pageBlockHeading4();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return new TL_iv.pageBlockHeading5();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return new TL_iv.pageBlockHeading6();
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return new TL_iv.pageBlockBlockquote();
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return new TL_iv.pageBlockPullquote();
        }
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
            return pageBlock instanceof TL_iv.pageBlockFooter ? new TL_iv.pageBlockFooter() : new TL_iv.pageBlockParagraph();
        }
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.language = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        return pageblockpreformatted;
    }

    public static w W3(ef efVar, String str) {
        w wVar = new w();
        wVar.b = efVar.b;
        wVar.e = str;
        wVar.j = efVar.F;
        wVar.k = efVar.G;
        String str2 = efVar.h;
        boolean z10 = (str2 == null || str == null || !str.equals(str2)) ? false : true;
        wVar.l = z10 ? 0 : efVar.J;
        wVar.m = z10 ? 0 : efVar.K;
        wVar.a = 1;
        wVar.f = 0.0f;
        return wVar;
    }

    public static z5 X2(n1 n1Var) {
        for (ViewParent parent = n1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof z5) {
                return (z5) parent;
            }
        }
        return null;
    }

    public static void Z2(ArrayList arrayList, ArrayList arrayList2, java.util.Map map) {
        TL_iv.RichText richText;
        if (arrayList2 == null) {
            return;
        }
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
            if ((pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                R2(arrayList, pageBlock, 1);
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                arrayList.add(new a(pageblockdetails, 0, 0));
                int size2 = arrayList.size();
                Z2(arrayList, pageblockdetails.blocks, map);
                if (arrayList.size() == size2) {
                    arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                }
                a aVar = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar.i = true;
                arrayList.add(aVar);
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                long a2 = r0.a();
                Z2(arrayList, pageblockblockquoteblocks.blocks, map);
                for (int size3 = arrayList.size(); size3 < arrayList.size(); size3++) {
                    ((a) arrayList.get(size3)).k.add(0, Long.valueOf(a2));
                }
                if (map != null && (richText = pageblockblockquoteblocks.caption) != null && !(richText instanceof TL_iv.textEmpty)) {
                    map.put(Long.valueOf(a2), pageblockblockquoteblocks.caption);
                }
            } else {
                arrayList.add(new a(pageBlock, 0, 0));
            }
        }
    }

    public static ArrayList a3(TL_iv.RichMessage richMessage, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        Z2(arrayList, richMessage.blocks, hashMap);
        return arrayList;
    }

    public static void c2(TL_iv.pageBlockParagraph pageblockparagraph, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageblockparagraph.text = textplain;
    }

    public static int[] d5(z5 z5Var) {
        w6 w6Var = z5Var.F;
        for (int size = w6Var != null ? w6Var.g.size() : 0; size >= 0; size--) {
            n1 m10 = z5Var.m(size);
            int length = m10 != null ? m10.length() : 0;
            if (length > 0) {
                return new int[]{size, length};
            }
        }
        return null;
    }

    public static ArrayList j3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            return ((TL_iv.pageBlockCollage) pageBlock).items;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            return ((TL_iv.pageBlockSlideshow) pageBlock).items;
        }
        return null;
    }

    public static boolean k4(n1 n1Var, float f7, float f10) {
        if (n1Var != null && n1Var.getVisibility() == 0) {
            n1Var.getLocationOnScreen(new int[2]);
            float f11 = f7 - r1[0];
            float f12 = f10 - r1[1];
            if (f11 >= 0.0f && f12 >= 0.0f && f11 <= n1Var.getWidth() && f12 <= n1Var.getHeight()) {
                int offsetForPosition = n1Var.getOffsetForPosition(f11, f12);
                if (offsetForPosition < 0) {
                    offsetForPosition = 0;
                }
                n1Var.O();
                n1Var.setSelection(Math.max(0, Math.min(offsetForPosition, n1Var.length())));
                return true;
            }
        }
        return false;
    }

    public static int n4(int i10, a aVar, boolean z10) {
        if (aVar == null) {
            return org.telegram.messenger.i0.L(2.0f);
        }
        return org.telegram.messenger.m5.D(16.0f, Math.max(0, i10 - (aVar.k.size() - (z10 ? aVar.l : aVar.m))), org.telegram.messenger.i0.L(2.0f));
    }

    public static boolean o3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || G3(pageBlock);
    }

    public static int o4(a aVar, a aVar2) {
        ArrayList arrayList = aVar.k;
        int i10 = 0;
        if (aVar2 == null) {
            return 0;
        }
        ArrayList arrayList2 = aVar2.k;
        int min = Math.min(arrayList.size(), arrayList2.size());
        while (i10 < min && ((Long) arrayList.get(i10)).equals(arrayList2.get(i10))) {
            i10++;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void setEditTextsLocked(boolean z10) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof q6) {
                ((q6) childAt).setLocked(z10);
            } else if (childAt instanceof z5) {
                ((z5) childAt).setLocked(z10);
            } else if (childAt instanceof o0) {
                ((o0) childAt).getCaptionEditText().setLocked(z10);
            } else if (childAt instanceof y0) {
                ((y0) childAt).setLocked(z10);
            } else if (childAt instanceof c1) {
                childAt.invalidate();
            }
        }
    }

    public static boolean y3(int i10) {
        return i10 == 21 || i10 == 22 || i10 == 19 || i10 == 20;
    }

    public static int z2(int i10) {
        if (i10 == 4) {
            return 114971;
        }
        if (i10 == 16384) {
            return 32772;
        }
        return i10 == 32768 ? 16388 : 4;
    }

    public final boolean A2() {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            arrayList = this.s3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            boolean z10 = aVar.i;
            ArrayList arrayList2 = aVar.k;
            if (!z10) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    Map.-EL.merge(hashMap, (Long) arrayList2.get(i11), 1, new e3());
                }
            }
            i10++;
        }
        boolean z11 = false;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            a aVar2 = (a) arrayList.get(i12);
            ArrayList arrayList3 = aVar2.k;
            if (arrayList3.size() == 1 && (aVar2.b instanceof TL_iv.pageBlockParagraph)) {
                Long l4 = (Long) arrayList3.get(0);
                l4.getClass();
                Integer num = (Integer) hashMap.get(l4);
                if (num != null && num.intValue() == 1) {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    TL_iv.RichText richText = aVar2.b.text;
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.text = richText;
                    TL_iv.RichText richText2 = (TL_iv.RichText) this.t3.remove(l4);
                    if (richText2 == null) {
                        richText2 = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.caption = richText2;
                    aVar2.b = pageblockblockquote;
                    arrayList3.clear();
                    z11 = true;
                }
            }
        }
        return z11;
    }

    public final void A4() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            KeyEvent.Callback childAt = getChildAt(i10);
            if (childAt instanceof v4) {
                c0 c0Var = (c0) ((v4) childAt);
                c0Var.b.a(c0Var.a, new a1.c(c0Var, 7));
            }
        }
        invalidate();
    }

    public final ArrayList B2() {
        TLRPC.Document document;
        w wVar;
        TLRPC.Document document2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.s3;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            a aVar = (a) arrayList2.get(i10);
            if ((aVar.b instanceof TL_iv.pageBlockDocument) && (wVar = aVar.g) != null && wVar.b() && (document2 = aVar.g.h) != null) {
                ((TL_iv.pageBlockDocument) aVar.b).document_id = document2.id;
            }
            for (w wVar2 : T3(aVar)) {
                if (wVar2.b() && (document = wVar2.h) != null) {
                    long j10 = document.id;
                    if (j10 != 0 && document.access_hash != 0 && hashSet.add(Long.valueOf(j10))) {
                        arrayList.add(wVar2.h);
                    }
                }
            }
            i10++;
        }
    }

    public final boolean B3() {
        int i10;
        q3 q3Var = this.u3;
        return q3Var != null && q3Var.x() && (i10 = q3Var.p0) == q3Var.s0 && A3(B4(i10));
    }

    public final a B4(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.w4;
        if (i10 < arrayList.size()) {
            return (a) arrayList.get(i10);
        }
        return null;
    }

    public final ArrayList C2(int i10, int i11) {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.s3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (w wVar : T3((a) arrayList2.get(i10))) {
                if (wVar.b() && (document = wVar.h) != null && hashSet.add(Long.valueOf(document.id))) {
                    arrayList.add(wVar.h);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final void C4() {
        ArrayList arrayList = this.s3;
        arrayList.clear();
        arrayList.add(new a(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        this.f3.O(false);
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean D1() {
        return this.a4;
    }

    public final ArrayList D2(int i10, int i11) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.s3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (w wVar : T3((a) arrayList2.get(i10))) {
                if (wVar.b() && (photo = wVar.g) != null && hashSet.add(Long.valueOf(photo.id))) {
                    arrayList.add(wVar.g);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final View D4(int i10) {
        if (i10 < 0) {
            return null;
        }
        return this.e3.m(i10);
    }

    public final ArrayList E2() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.s3;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            for (w wVar : T3((a) arrayList2.get(i10))) {
                if (wVar.b() && (photo = wVar.g) != null && hashSet.add(Long.valueOf(photo.id))) {
                    arrayList.add(wVar.g);
                }
            }
            i10++;
        }
    }

    public final int[] E4() {
        ArrayList arrayList = this.s3;
        q3 q3Var = this.u3;
        if (q3Var == null || !q3Var.x()) {
            a T2 = T2();
            int indexOf = T2 != null ? arrayList.indexOf(T2) : -1;
            if (indexOf >= 0) {
                return new int[]{indexOf, indexOf};
            }
            return null;
        }
        int indexOf2 = arrayList.indexOf(B4(q3Var.p0));
        int indexOf3 = arrayList.indexOf(B4(q3Var.s0));
        if (indexOf2 < 0 || indexOf3 < 0) {
            return null;
        }
        return new int[]{Math.min(indexOf2, indexOf3), Math.max(indexOf2, indexOf3)};
    }

    @Override // org.telegram.ui.Components.u51
    public final void F1() {
        b4 b4Var = this.o3;
        if (b4Var != null) {
            b4Var.A();
        }
    }

    public final void F2() {
        o2 o2Var = this.Q3;
        if (o2Var != null) {
            o2Var.h();
        }
        ArrayList arrayList = this.s3;
        SpannableStringBuilder g10 = n5.g(arrayList);
        J2();
        arrayList.clear();
        HashMap hashMap = this.t3;
        hashMap.clear();
        this.r3 = null;
        Z2(arrayList, n5.b(g10), hashMap);
        this.f3.O(false);
        o2 o2Var2 = this.Q3;
        if (o2Var2 != null) {
            o2Var2.h();
        }
        b4 b4Var = this.o3;
        if (b4Var != null) {
            b4Var.onContentChanged();
            b4Var.Z();
        }
    }

    public final boolean F4() {
        q3 q3Var = this.u3;
        if (q3Var != null && q3Var.x()) {
            if (O3()) {
                int i10 = q3Var.p0;
                int i11 = q3Var.q0;
                int i12 = q3Var.t0;
                int i13 = q3Var.r0;
                int i14 = q3Var.u0;
                int i15 = i11;
                while (i15 <= i12) {
                    n1 Q4 = Q4(i10, i15);
                    if (Q4 != null) {
                        int length = Q4.length();
                        int i16 = i15 == i11 ? i13 : 0;
                        int i17 = i15 == i12 ? i14 : length;
                        if (i11 == i12) {
                            i16 = Math.min(i13, i14);
                            i17 = Math.max(i13, i14);
                        }
                        if (Math.max(0, Math.min(i16, length)) < Math.max(0, Math.min(i17, length))) {
                            return true;
                        }
                    }
                    i15++;
                }
            } else if (B3()) {
                n1 L2 = L2(q3Var.p0);
                if (L2 != null && Math.max(0, Math.min(Math.min(q3Var.r0, q3Var.u0), L2.length())) < Math.max(0, Math.min(Math.max(q3Var.r0, q3Var.u0), L2.length()))) {
                    return true;
                }
            } else if (z3()) {
                n1 v22 = v2(q3Var.p0);
                if (v22 != null) {
                    int i18 = q3Var.r0;
                    int i19 = q3Var.u0;
                    if (Math.max(0, Math.min(Math.min(i18, i19), v22.length())) < Math.max(0, Math.min(Math.max(i18, i19), v22.length()))) {
                        return true;
                    }
                }
            } else if (J3()) {
                n1 m42 = m4(q3Var.p0);
                if (m42 != null) {
                    int i20 = q3Var.r0;
                    int i21 = q3Var.u0;
                    if (Math.max(0, Math.min(Math.min(i20, i21), m42.length())) < Math.max(0, Math.min(Math.max(i20, i21), m42.length()))) {
                        return true;
                    }
                }
            } else {
                int i22 = q3Var.p0;
                int i23 = q3Var.s0;
                int i24 = q3Var.r0;
                int i25 = q3Var.u0;
                if (i22 >= 0 && i23 >= 0 && i23 >= i22 && i23 < this.w4.size()) {
                    int i26 = i22;
                    while (i26 <= i23) {
                        a B4 = B4(i26);
                        if (B4 != null) {
                            if (B4.t == 0) {
                                TL_iv.PageBlock pageBlock = B4.b;
                                if (!D3(pageBlock)) {
                                    continue;
                                } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                    continue;
                                }
                            }
                            int l22 = l2(i26);
                            if (Math.max(0, Math.min(i26 == i22 ? i24 : 0, l22)) < Math.max(0, Math.min(i26 == i23 ? i25 : l22, l22))) {
                                return true;
                            }
                        }
                        i26++;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.u51
    public final void G1() {
        b4 b4Var = this.o3;
        if (b4Var != null) {
            b4Var.T();
        }
        A4();
    }

    public final a G2() {
        int i10;
        a B4;
        a T2 = T2();
        if (T2 != null) {
            return T2;
        }
        q3 q3Var = this.u3;
        if (q3Var == null || (i10 = q3Var.p0) < 0 || (B4 = B4(i10)) == null) {
            return null;
        }
        return B4;
    }

    public final int[] G4() {
        q3 q3Var = this.u3;
        if (q3Var == null) {
            return null;
        }
        int i10 = q3Var.p0;
        int i11 = q3Var.s0;
        if (i10 < 0 || i11 < 0) {
            return null;
        }
        a B4 = B4(i10);
        a B42 = B4(i11);
        if (B4 == null || B42 == null) {
            return null;
        }
        ArrayList arrayList = this.s3;
        int indexOf = arrayList.indexOf(B4);
        int indexOf2 = arrayList.indexOf(B42);
        if (indexOf < 0 || indexOf2 < 0) {
            return null;
        }
        if (indexOf > indexOf2) {
            indexOf = indexOf2;
            indexOf2 = indexOf;
        }
        return new int[]{indexOf, indexOf2};
    }

    @Override // org.telegram.ui.Components.u51
    public final void H1(s4.c1 c1Var) {
        b4 b4Var = this.o3;
        if (b4Var == null || c1Var == null) {
            return;
        }
        View view = c1Var.a;
        view.getLocationOnScreen(new int[2]);
        view.getWidth();
        this.a4 = b4Var.c(view.getHeight() + r1[1]);
    }

    public final void H2() {
        ArrayList arrayList;
        q3 q3Var = this.u3;
        int i10 = q3Var.p0;
        int i11 = q3Var.r0;
        int i12 = q3Var.s0;
        if (Z1(i10, i11, i12, q3Var.u0, new String[]{""})) {
            return;
        }
        if (i10 > i12) {
            i12 = i10;
            i10 = i12;
        }
        ArrayList arrayList2 = new ArrayList();
        int max = Math.max(0, i10);
        while (true) {
            arrayList = this.s3;
            if (max > i12) {
                break;
            }
            ArrayList arrayList3 = this.w4;
            if (max >= arrayList3.size()) {
                break;
            }
            a aVar = (a) arrayList3.get(max);
            if (aVar.t == 0 && arrayList.indexOf(aVar) >= 0) {
                arrayList2.add(aVar);
            }
            max++;
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        o2 o2Var = this.Q3;
        if (o2Var != null) {
            o2Var.d();
        }
        int indexOf = arrayList.indexOf(arrayList2.get(0));
        arrayList.removeAll(arrayList2);
        if (arrayList.isEmpty()) {
            arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        }
        HashMap hashMap = this.t3;
        if (!hashMap.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                hashSet.addAll(((a) arrayList.get(i13)).k);
            }
            hashMap.keySet().retainAll(hashSet);
        }
        A2();
        Y3();
        v4();
        q3Var.f(false);
        this.f3.O(false);
        o2 o2Var2 = this.Q3;
        if (o2Var2 != null) {
            o2Var2.h();
        }
        post(new v2(this, (a) arrayList.get(Math.max(0, Math.min(indexOf, arrayList.size() - 1))), 0));
    }

    public final void H4(n1 n1Var) {
        n1Var.W1 = this.q3;
        n1Var.C(new b(this, 4));
    }

    @Override // org.telegram.ui.Components.u51
    public final void I1(s4.c1 c1Var) {
        a aVar = this.Z3;
        this.Z3 = null;
        this.a4 = false;
        if (aVar == null) {
            if (c1Var != null) {
                View view = c1Var.a;
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                return;
            }
            return;
        }
        o2 o2Var = this.Q3;
        if (o2Var != null) {
            o2Var.d();
        }
        u4(aVar);
        o2 o2Var2 = this.Q3;
        if (o2Var2 != null) {
            o2Var2.h();
        }
        b4 b4Var = this.o3;
        if (b4Var != null) {
            b4Var.onContentChanged();
        }
    }

    public final boolean I2() {
        q3 q3Var = this.u3;
        if (q3Var != null && q3Var.x()) {
            q3Var.f(false);
            return true;
        }
        if (this.p4 == null) {
            return false;
        }
        P2();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0236 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0252 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0482 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04d2 A[LOOP:13: B:176:0x04d0->B:177:0x04d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04e3 A[LOOP:14: B:180:0x04e1->B:181:0x04e3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04ae A[EDGE_INSN: B:245:0x04ae->B:155:0x04ae BREAK  A[LOOP:10: B:144:0x048a->B:235:0x048a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0480 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0485 A[EDGE_INSN: B:257:0x0485->B:143:0x0485 BREAK  A[LOOP:9: B:132:0x0461->B:247:0x0461], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb A[LOOP:3: B:45:0x00c5->B:47:0x00cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012e A[LOOP:4: B:53:0x0128->B:55:0x012e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0205 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0216 A[LOOP:8: B:96:0x0210->B:98:0x0216, LOOP_END] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I4(z5 z5Var) {
        int i10;
        int i11;
        HashSet hashSet;
        Iterator<TL_iv.pageTableCell> it;
        boolean z10;
        HashSet hashSet2;
        Iterator<TL_iv.pageTableCell> it2;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        z60 z60Var;
        int i17;
        int L;
        int i18;
        int[] iArr;
        FrameLayout S4;
        ?? r12;
        int i19;
        int i20;
        boolean z14;
        Iterator it3;
        Iterator it4;
        int i21;
        int i22;
        int i23;
        final int i24;
        final int i25;
        boolean z15;
        String L0;
        String str;
        int i26;
        String str2;
        final ?? r92;
        int i27;
        int i28;
        HashSet hashSet3;
        Iterator<TL_iv.pageTableCell> it5;
        boolean z16;
        boolean equals;
        final z5 z5Var2 = z5Var;
        final w6 model = z5Var2.getModel();
        LinkedHashSet linkedHashSet = z5Var2.H;
        if (model == null) {
            return;
        }
        TL_iv.pageBlockTable pageblocktable = model.a;
        Set<TL_iv.pageTableCell> selectedCells = z5Var2.getSelectedCells();
        if (selectedCells.isEmpty()) {
            return;
        }
        int size = selectedCells.size();
        int i29 = 1;
        if (size >= 2) {
            int i30 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i31 = Integer.MAX_VALUE;
            int i32 = -1;
            int i33 = -1;
            for (TL_iv.pageTableCell pagetablecell : selectedCells) {
                int b10 = model.b(pagetablecell);
                int a2 = model.a(pagetablecell);
                int o10 = w6.o(pagetablecell);
                int i34 = pagetablecell.colspan;
                if (i34 == 0) {
                    i34 = 1;
                }
                i30 = Math.min(i30, b10);
                i31 = Math.min(i31, a2);
                i32 = Math.max(i32, (b10 + o10) - 1);
                i33 = Math.max(i33, (a2 + i34) - 1);
            }
            HashSet hashSet4 = new HashSet();
            loop1: while (i30 <= i32) {
                for (int i35 = i31; i35 <= i33; i35++) {
                    if (i30 < 0 || i35 < 0 || i30 >= model.b || i35 >= model.c) {
                        equals = false;
                        break loop1;
                    }
                    hashSet4.add(model.d[i30][i35]);
                }
                i30++;
            }
            equals = hashSet4.equals(new HashSet(selectedCells));
            if (equals) {
                i10 = 1;
                if (size == 1) {
                    TL_iv.pageTableCell next = selectedCells.iterator().next();
                    if (w6.n(next) <= 1) {
                        int i36 = next.rowspan;
                        if (i36 == 0) {
                            i36 = 1;
                        }
                        if (i36 <= 1) {
                            z16 = false;
                            if (z16) {
                                i11 = 1;
                                hashSet = new HashSet();
                                it = selectedCells.iterator();
                                while (it.hasNext()) {
                                    hashSet.add(Integer.valueOf(model.b(it.next())));
                                }
                                if (!hashSet.isEmpty()) {
                                    Iterator it6 = hashSet.iterator();
                                    loop18: while (it6.hasNext()) {
                                        int intValue = ((Integer) it6.next()).intValue();
                                        if (intValue >= 0 && intValue < model.b) {
                                            for (int i37 = 0; i37 < model.c; i37++) {
                                                if (model.e[intValue][i37] == intValue && selectedCells.contains(model.d[intValue][i37])) {
                                                }
                                            }
                                        }
                                    }
                                    z10 = true;
                                    hashSet2 = new HashSet();
                                    it2 = selectedCells.iterator();
                                    while (it2.hasNext()) {
                                        hashSet2.add(Integer.valueOf(model.a(it2.next())));
                                    }
                                    if (!hashSet2.isEmpty()) {
                                        Iterator it7 = hashSet2.iterator();
                                        loop16: while (it7.hasNext()) {
                                            int intValue2 = ((Integer) it7.next()).intValue();
                                            if (intValue2 >= 0 && intValue2 < model.c) {
                                                for (int i38 = 0; i38 < model.b; i38++) {
                                                    if (model.f[i38][intValue2] == intValue2 && selectedCells.contains(model.d[i38][intValue2])) {
                                                    }
                                                }
                                            }
                                        }
                                        z11 = true;
                                        if (!selectedCells.isEmpty() || model.b <= 0 || model.c <= 0) {
                                            z12 = false;
                                        } else {
                                            HashSet hashSet5 = new HashSet();
                                            for (int i39 = 0; i39 < model.b; i39++) {
                                                for (int i40 = 0; i40 < model.c; i40++) {
                                                    hashSet5.add(model.d[i39][i40]);
                                                }
                                            }
                                            z12 = hashSet5.equals(new HashSet(selectedCells));
                                        }
                                        z13 = z12 || (model.b == 1 && model.c == 1);
                                        if (z10 || z12) {
                                            i12 = 1;
                                        } else {
                                            HashSet hashSet6 = new HashSet();
                                            Iterator<TL_iv.pageTableCell> it8 = selectedCells.iterator();
                                            while (it8.hasNext()) {
                                                hashSet6.add(Integer.valueOf(model.b(it8.next())));
                                                i29 = i29;
                                            }
                                            i12 = i29;
                                            if (hashSet6.size() < model.b) {
                                                i13 = i12;
                                                if (z11 && !z12) {
                                                    hashSet3 = new HashSet();
                                                    it5 = selectedCells.iterator();
                                                    while (it5.hasNext()) {
                                                        hashSet3.add(Integer.valueOf(model.a(it5.next())));
                                                    }
                                                    if (hashSet3.size() < model.c) {
                                                        i14 = i12;
                                                        i15 = (z13 || !z11 || model.c >= ((org.telegram.messenger.l0) vp.r1(this.m3).y7.Z.a).c) ? 0 : i12;
                                                        i16 = (z13 || !z10) ? 0 : i12;
                                                        z60Var = this.q4;
                                                        i17 = i10;
                                                        if (z60Var != null) {
                                                            this.q4 = null;
                                                            z60Var.u();
                                                        }
                                                        L = org.telegram.messenger.i0.L(((i17 + 1 + i11 + (i15 != 0 ? 2 : 0) + (i16 != 0 ? 2 : 0) + i14 + i13 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                                        FrameLayout S42 = S4(z5Var2, false);
                                                        i18 = i14;
                                                        iArr = new int[2];
                                                        S42.getLocationOnScreen(iArr);
                                                        if (((iArr[i12] - L) - org.telegram.messenger.i0.L(8.0f) >= org.telegram.messenger.i0.L(8.0f) + org.telegram.messenger.i0.m ? i12 : 0) != 0) {
                                                            S4 = S42;
                                                            r12 = i12;
                                                        } else {
                                                            boolean z17 = i12;
                                                            S4 = S4(z5Var2, z17);
                                                            r12 = z17;
                                                        }
                                                        final z60 U = this.o3.U(S4);
                                                        U.s = 0;
                                                        U.t = false;
                                                        U.Z = r12;
                                                        LinearLayout linearLayout = new LinearLayout(getContext());
                                                        linearLayout.setMinimumWidth(org.telegram.messenger.i0.L(208.0f));
                                                        linearLayout.setOrientation(r12);
                                                        TextView textView = new TextView(getContext());
                                                        textView.setText(cd.L0(2131754057, null));
                                                        textView.setTextSize(1, 12.0f);
                                                        textView.setGravity(17);
                                                        int i41 = org.telegram.ui.ActionBar.t6.y6;
                                                        org.telegram.ui.ActionBar.p6 p6Var = this.n3;
                                                        a7.V(textView, i41, p6Var);
                                                        linearLayout.addView(textView, w7.b6.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                                        LinearLayout linearLayout2 = new LinearLayout(getContext());
                                                        i19 = i11;
                                                        i20 = i13;
                                                        boolean z18 = z10;
                                                        linearLayout2.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
                                                        linearLayout2.setOrientation(0);
                                                        linearLayout.addView(linearLayout2, w7.b6.r(-2, -2, 17));
                                                        g2 g2Var = new g2(R.drawable.iv_align_horiz_left, getContext(), p6Var);
                                                        g2Var.e = 4;
                                                        g2Var.updateColors();
                                                        g2Var.b();
                                                        int i42 = org.telegram.ui.ActionBar.t6.G8;
                                                        g2Var.c(i42);
                                                        linearLayout2.addView(g2Var, w7.b6.o(32, 32));
                                                        g2 g2Var2 = new g2(R.drawable.iv_align_horiz_middle, getContext(), p6Var);
                                                        g2Var2.e = 4;
                                                        g2Var2.updateColors();
                                                        g2Var2.b();
                                                        g2Var2.c(i42);
                                                        linearLayout2.addView(g2Var2, w7.b6.o(32, 32));
                                                        g2 g2Var3 = new g2(R.drawable.iv_align_horiz_right, getContext(), p6Var);
                                                        g2Var3.e = 4;
                                                        g2Var3.updateColors();
                                                        g2Var3.b();
                                                        g2Var3.c(i42);
                                                        final g2[] g2VarArr = {g2Var, g2Var2, g2Var3};
                                                        boolean z19 = z11;
                                                        linearLayout2.addView(g2Var3, w7.b6.o(32, 32));
                                                        z14 = z12;
                                                        linearLayout2.addView(new Space(getContext()), w7.b6.o(8, 0));
                                                        g2 g2Var4 = new g2(R.drawable.iv_align_vert_top, getContext(), p6Var);
                                                        g2Var4.e = 4;
                                                        g2Var4.updateColors();
                                                        g2Var4.b();
                                                        g2Var4.c(i42);
                                                        linearLayout2.addView(g2Var4, w7.b6.o(32, 32));
                                                        g2 g2Var5 = new g2(R.drawable.iv_align_vert_middle, getContext(), p6Var);
                                                        g2Var5.e = 4;
                                                        g2Var5.updateColors();
                                                        g2Var5.b();
                                                        g2Var5.c(i42);
                                                        linearLayout2.addView(g2Var5, w7.b6.o(32, 32));
                                                        g2 g2Var6 = new g2(R.drawable.iv_align_vert_bottom, getContext(), p6Var);
                                                        g2Var6.e = 4;
                                                        g2Var6.updateColors();
                                                        g2Var6.b();
                                                        g2Var6.c(i42);
                                                        final g2[] g2VarArr2 = {g2Var4, g2Var5, g2Var6};
                                                        linearLayout2.addView(g2Var6, w7.b6.o(32, 32));
                                                        U.q(linearLayout);
                                                        it3 = linkedHashSet.iterator();
                                                        int i43 = -1;
                                                        while (true) {
                                                            if (!it3.hasNext()) {
                                                                break;
                                                            }
                                                            TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) it3.next();
                                                            if (pagetablecell2 != null) {
                                                                if (pagetablecell2.align_right) {
                                                                    i28 = 2;
                                                                } else if (pagetablecell2.align_center) {
                                                                    i28 = 1;
                                                                }
                                                                if (i43 == -1) {
                                                                    if (i43 != i28) {
                                                                        i43 = -1;
                                                                        break;
                                                                    }
                                                                } else {
                                                                    i43 = i28;
                                                                }
                                                            }
                                                            i28 = 0;
                                                            if (i43 == -1) {
                                                            }
                                                        }
                                                        it4 = linkedHashSet.iterator();
                                                        int i44 = -1;
                                                        while (true) {
                                                            if (!it4.hasNext()) {
                                                                break;
                                                            }
                                                            TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) it4.next();
                                                            if (pagetablecell3 != null) {
                                                                if (pagetablecell3.valign_bottom) {
                                                                    i27 = 2;
                                                                } else if (pagetablecell3.valign_middle) {
                                                                    i27 = 1;
                                                                }
                                                                if (i44 == -1) {
                                                                    if (i44 != i27) {
                                                                        i44 = -1;
                                                                        break;
                                                                    }
                                                                } else {
                                                                    i44 = i27;
                                                                }
                                                            }
                                                            i27 = 0;
                                                            if (i44 == -1) {
                                                            }
                                                        }
                                                        i21 = 0;
                                                        while (i21 < 3) {
                                                            g2VarArr[i21].setSelected(i21 == i43);
                                                            i21++;
                                                        }
                                                        i23 = 0;
                                                        while (i23 < 3) {
                                                            g2VarArr2[i23].setSelected(i23 == i44);
                                                            i23++;
                                                        }
                                                        for (i24 = 0; i24 < 3; i24++) {
                                                            final int i45 = 0;
                                                            g2VarArr[i24].setOnClickListener(new View.OnClickListener() { // from class: bi.s2
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    switch (i45) {
                                                                        case 0:
                                                                            z5 z5Var3 = z5Var2;
                                                                            b6 b6Var = z5Var3.w;
                                                                            Iterator it9 = z5Var3.H.iterator();
                                                                            while (true) {
                                                                                boolean hasNext = it9.hasNext();
                                                                                int i46 = i24;
                                                                                if (!hasNext) {
                                                                                    b6Var.invalidate();
                                                                                    k3 k3Var = z5Var3.E;
                                                                                    if (k3Var != null && z5Var3.a != null) {
                                                                                        k3Var.a();
                                                                                    }
                                                                                    int i47 = 0;
                                                                                    while (i47 < 3) {
                                                                                        g2VarArr[i47].setSelected(i47 == i46);
                                                                                        i47++;
                                                                                    }
                                                                                    break;
                                                                                } else {
                                                                                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) it9.next();
                                                                                    w6.k(pagetablecell4, i46);
                                                                                    c6 m10 = b6Var.m(pagetablecell4);
                                                                                    if (m10 != null && m10.b != null) {
                                                                                        m10.a();
                                                                                        m10.invalidate();
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            z5 z5Var4 = z5Var2;
                                                                            b6 b6Var2 = z5Var4.w;
                                                                            Iterator it10 = z5Var4.H.iterator();
                                                                            while (true) {
                                                                                boolean hasNext2 = it10.hasNext();
                                                                                int i48 = i24;
                                                                                if (!hasNext2) {
                                                                                    b6Var2.invalidate();
                                                                                    k3 k3Var2 = z5Var4.E;
                                                                                    if (k3Var2 != null && z5Var4.a != null) {
                                                                                        k3Var2.a();
                                                                                    }
                                                                                    int i49 = 0;
                                                                                    while (i49 < 3) {
                                                                                        g2VarArr[i49].setSelected(i49 == i48);
                                                                                        i49++;
                                                                                    }
                                                                                    break;
                                                                                } else {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it10.next();
                                                                                    w6.m(pagetablecell5, i48);
                                                                                    c6 m11 = b6Var2.m(pagetablecell5);
                                                                                    if (m11 != null && m11.b != null) {
                                                                                        m11.a();
                                                                                        m11.invalidate();
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                        }
                                                        i25 = 0;
                                                        for (i22 = 3; i25 < i22; i22 = 3) {
                                                            final int i46 = 1;
                                                            g2VarArr2[i25].setOnClickListener(new View.OnClickListener() { // from class: bi.s2
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    switch (i46) {
                                                                        case 0:
                                                                            z5 z5Var3 = z5Var2;
                                                                            b6 b6Var = z5Var3.w;
                                                                            Iterator it9 = z5Var3.H.iterator();
                                                                            while (true) {
                                                                                boolean hasNext = it9.hasNext();
                                                                                int i462 = i25;
                                                                                if (!hasNext) {
                                                                                    b6Var.invalidate();
                                                                                    k3 k3Var = z5Var3.E;
                                                                                    if (k3Var != null && z5Var3.a != null) {
                                                                                        k3Var.a();
                                                                                    }
                                                                                    int i47 = 0;
                                                                                    while (i47 < 3) {
                                                                                        g2VarArr2[i47].setSelected(i47 == i462);
                                                                                        i47++;
                                                                                    }
                                                                                    break;
                                                                                } else {
                                                                                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) it9.next();
                                                                                    w6.k(pagetablecell4, i462);
                                                                                    c6 m10 = b6Var.m(pagetablecell4);
                                                                                    if (m10 != null && m10.b != null) {
                                                                                        m10.a();
                                                                                        m10.invalidate();
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            z5 z5Var4 = z5Var2;
                                                                            b6 b6Var2 = z5Var4.w;
                                                                            Iterator it10 = z5Var4.H.iterator();
                                                                            while (true) {
                                                                                boolean hasNext2 = it10.hasNext();
                                                                                int i48 = i25;
                                                                                if (!hasNext2) {
                                                                                    b6Var2.invalidate();
                                                                                    k3 k3Var2 = z5Var4.E;
                                                                                    if (k3Var2 != null && z5Var4.a != null) {
                                                                                        k3Var2.a();
                                                                                    }
                                                                                    int i49 = 0;
                                                                                    while (i49 < 3) {
                                                                                        g2VarArr2[i49].setSelected(i49 == i48);
                                                                                        i49++;
                                                                                    }
                                                                                    break;
                                                                                } else {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it10.next();
                                                                                    w6.m(pagetablecell5, i48);
                                                                                    c6 m11 = b6Var2.m(pagetablecell5);
                                                                                    if (m11 != null && m11.b != null) {
                                                                                        m11.a();
                                                                                        m11.invalidate();
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            i25++;
                                                        }
                                                        U.o();
                                                        U.S = 208;
                                                        if (!linkedHashSet.isEmpty()) {
                                                            Iterator it9 = linkedHashSet.iterator();
                                                            while (it9.hasNext()) {
                                                                if (!((TL_iv.pageTableCell) it9.next()).header) {
                                                                }
                                                            }
                                                            z15 = true;
                                                            if (!z15) {
                                                                L0 = cd.L0(2131753995, null);
                                                            } else if (z14 || !(size <= 1 || z19 || z18)) {
                                                                L0 = cd.L0(2131754023, null);
                                                            } else {
                                                                if (z19) {
                                                                    i26 = 2131754022;
                                                                    str = null;
                                                                } else {
                                                                    str = null;
                                                                    i26 = z18 ? 2131754021 : 2131754024;
                                                                }
                                                                L0 = cd.L0(i26, str);
                                                            }
                                                            U.c(!z15 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, L0, new ag.j0(this, z5Var2, z15, 3), false);
                                                            if (i17 == 0) {
                                                                str2 = null;
                                                                final int i47 = 2;
                                                                U.c(R.drawable.iv_table_merge, cd.L0(2131754000, null), new Runnable(this) { // from class: bi.t2
                                                                    public final /* synthetic */ d4 b;

                                                                    {
                                                                        this.b = this;
                                                                    }

                                                                    /* JADX WARN: Code restructure failed: missing block: B:93:0x016b, code lost:
                                                                    
                                                                        if (r5 <= 1) goto L84;
                                                                     */
                                                                    @Override // java.lang.Runnable
                                                                    /*
                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                    */
                                                                    public final void run() {
                                                                        d4 d4Var;
                                                                        boolean z20;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        d4 d4Var2;
                                                                        boolean z21;
                                                                        switch (i47) {
                                                                            case 0:
                                                                                d4 d4Var3 = this.b;
                                                                                d4Var3.getClass();
                                                                                z5 z5Var3 = z5Var2;
                                                                                LinkedHashSet linkedHashSet2 = z5Var3.H;
                                                                                if (z5Var3.F == null || linkedHashSet2.isEmpty()) {
                                                                                    d4Var = d4Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet2.iterator();
                                                                                    int i48 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = z5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i48 = Math.min(i48, b12);
                                                                                    }
                                                                                    linkedHashSet2.clear();
                                                                                    w6 w6Var = z5Var3.F;
                                                                                    w6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        d4Var = d4Var3;
                                                                                        z20 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[w6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z20 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < w6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[w6Var.b];
                                                                                                int i49 = 0;
                                                                                                for (int i50 = 0; i50 < w6Var.b; i50++) {
                                                                                                    iArr2[i50] = i49;
                                                                                                    if (!zArr[i50]) {
                                                                                                        i49++;
                                                                                                    }
                                                                                                }
                                                                                                if (i49 == 0) {
                                                                                                    w6Var.a.rows.clear();
                                                                                                    w6Var.i();
                                                                                                    d4Var = d4Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = w6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i51 = 0;
                                                                                                    while (i51 < size2) {
                                                                                                        Object obj = arrayList2.get(i51);
                                                                                                        i51++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = w6Var.b(pagetablecell4);
                                                                                                        int a10 = w6Var.a(pagetablecell4);
                                                                                                        int o11 = w6.o(pagetablecell4);
                                                                                                        int i52 = pagetablecell4.colspan;
                                                                                                        if (i52 == 0) {
                                                                                                            i52 = 1;
                                                                                                        }
                                                                                                        int i53 = -1;
                                                                                                        d4 d4Var4 = d4Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i54 = 0;
                                                                                                        for (int i55 = b13; i55 < b13 + o11 && i55 < w6Var.b; i55++) {
                                                                                                            if (!zArr[i55]) {
                                                                                                                if (i53 < 0) {
                                                                                                                    i53 = i55;
                                                                                                                }
                                                                                                                i54++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i53 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i53], a10, i54, i52});
                                                                                                        }
                                                                                                        d4Var3 = d4Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    d4Var = d4Var3;
                                                                                                    w6Var.j(identityHashMap, i49);
                                                                                                    w6Var.i();
                                                                                                    z20 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z5Var3.x();
                                                                                    if (z20) {
                                                                                        z5Var3.s(i48, 0);
                                                                                    }
                                                                                }
                                                                                d4Var.P2();
                                                                                break;
                                                                            case 1:
                                                                                d4 d4Var5 = this.b;
                                                                                d4Var5.getClass();
                                                                                a row = z5Var2.getRow();
                                                                                d4Var5.P2();
                                                                                if (row != null) {
                                                                                    o2 o2Var = d4Var5.Q3;
                                                                                    if (o2Var != null) {
                                                                                        o2Var.d();
                                                                                    }
                                                                                    d4Var5.u4(row);
                                                                                    o2 o2Var2 = d4Var5.Q3;
                                                                                    if (o2Var2 != null) {
                                                                                        o2Var2.h();
                                                                                    }
                                                                                    b4 b4Var = d4Var5.o3;
                                                                                    if (b4Var != null) {
                                                                                        b4Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                z5 z5Var4 = z5Var2;
                                                                                LinkedHashSet linkedHashSet3 = z5Var4.H;
                                                                                if (z5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet3.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i56 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        int i58 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i57 = Math.min(i57, z5Var4.F.b(pagetablecell5));
                                                                                            i58 = Math.min(i58, z5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet3.clear();
                                                                                        w6 w6Var2 = z5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = w6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i59 = -1;
                                                                                            int i60 = -1;
                                                                                            int i61 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = w6Var2.b(pagetablecell6);
                                                                                                int a11 = w6Var2.a(pagetablecell6);
                                                                                                int o12 = w6.o(pagetablecell6);
                                                                                                int i62 = pagetablecell6.colspan;
                                                                                                if (i62 == 0) {
                                                                                                    i62 = 1;
                                                                                                }
                                                                                                i56 = Math.min(i56, b14);
                                                                                                i61 = Math.min(i61, a11);
                                                                                                i59 = Math.max(i59, (b14 + o12) - 1);
                                                                                                i60 = Math.max(i60, (a11 + i62) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i63 = i56;
                                                                                            while (true) {
                                                                                                if (i63 <= i59) {
                                                                                                    for (int i64 = i61; i64 <= i60; i64++) {
                                                                                                        if (i63 >= 0 && i64 >= 0 && i63 < w6Var2.b && i64 < w6Var2.c) {
                                                                                                            hashSet9.add(w6Var2.d[i63][i64]);
                                                                                                        }
                                                                                                    }
                                                                                                    i63++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new v6(w6Var2, 0));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i65 = 0;
                                                                                                    while (i65 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i65);
                                                                                                        i65++;
                                                                                                        String g10 = w6.g((TL_iv.pageTableCell) obj2);
                                                                                                        if (g10.isEmpty()) {
                                                                                                            arrayList = arrayList3;
                                                                                                        } else {
                                                                                                            if (sb2.length() > 0) {
                                                                                                                arrayList = arrayList3;
                                                                                                                sb2.append("\n");
                                                                                                            } else {
                                                                                                                arrayList = arrayList3;
                                                                                                            }
                                                                                                            sb2.append(g10);
                                                                                                        }
                                                                                                        arrayList3 = arrayList;
                                                                                                    }
                                                                                                    TL_iv.pageTableCell pagetablecell7 = w6Var2.d[i56][i61];
                                                                                                    int i66 = (i60 - i61) + 1;
                                                                                                    int i67 = (i59 - i56) + 1;
                                                                                                    if (i66 <= 1) {
                                                                                                        i66 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i66;
                                                                                                    int i68 = i67 > 1 ? i67 : 0;
                                                                                                    pagetablecell7.rowspan = i68;
                                                                                                    int i69 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i66 > 0 ? i69 | 2 : i69 & (-3);
                                                                                                    int i70 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i68 > 0 ? i70 | 4 : i70 & (-5);
                                                                                                    w6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = w6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    w6Var2.i();
                                                                                                    z5Var4.x();
                                                                                                    z5Var4.w.invalidate();
                                                                                                    z5Var4.s(i57, i58);
                                                                                                    z5Var4.v();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet3.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 3:
                                                                                z5 z5Var5 = z5Var2;
                                                                                LinkedHashSet linkedHashSet4 = z5Var5.H;
                                                                                if (z5Var5.F != null && linkedHashSet4.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                                    if (w6.n(pagetablecell9) <= 1) {
                                                                                        int i71 = pagetablecell9.rowspan;
                                                                                        if (i71 == 0) {
                                                                                            i71 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = z5Var5.F.b(pagetablecell9);
                                                                                    int a12 = z5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet4.clear();
                                                                                    if (z5Var5.F.p(pagetablecell9)) {
                                                                                        z5Var5.x();
                                                                                        z5Var5.w.invalidate();
                                                                                        z5Var5.s(b15, a12);
                                                                                        z5Var5.v();
                                                                                    } else {
                                                                                        linkedHashSet4.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 4:
                                                                                z5Var2.j(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 5:
                                                                                z5Var2.j(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 6:
                                                                                z5Var2.k(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 7:
                                                                                z5Var2.k(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            default:
                                                                                d4 d4Var6 = this.b;
                                                                                d4Var6.getClass();
                                                                                z5 z5Var6 = z5Var2;
                                                                                LinkedHashSet linkedHashSet5 = z5Var6.H;
                                                                                if (z5Var6.F == null || linkedHashSet5.isEmpty()) {
                                                                                    d4Var2 = d4Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet5.iterator();
                                                                                    int i72 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = z5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i72 = Math.min(i72, a13);
                                                                                    }
                                                                                    linkedHashSet5.clear();
                                                                                    w6 w6Var3 = z5Var6.F;
                                                                                    w6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        d4Var2 = d4Var6;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[w6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < w6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[w6Var3.c];
                                                                                                int i73 = 0;
                                                                                                for (int i74 = 0; i74 < w6Var3.c; i74++) {
                                                                                                    iArr4[i74] = i73;
                                                                                                    if (!zArr2[i74]) {
                                                                                                        i73++;
                                                                                                    }
                                                                                                }
                                                                                                if (i73 == 0) {
                                                                                                    w6Var3.a.rows.clear();
                                                                                                    w6Var3.i();
                                                                                                    d4Var2 = d4Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = w6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i75 = 0;
                                                                                                    while (i75 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i75);
                                                                                                        i75++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = w6Var3.b(pagetablecell10);
                                                                                                        int a14 = w6Var3.a(pagetablecell10);
                                                                                                        int o13 = w6.o(pagetablecell10);
                                                                                                        int i76 = pagetablecell10.colspan;
                                                                                                        if (i76 == 0) {
                                                                                                            i76 = 1;
                                                                                                        }
                                                                                                        int i77 = -1;
                                                                                                        d4 d4Var7 = d4Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i78 = 0;
                                                                                                        for (int i79 = a14; i79 < a14 + i76 && i79 < w6Var3.c; i79++) {
                                                                                                            if (!zArr3[i79]) {
                                                                                                                if (i77 < 0) {
                                                                                                                    i77 = i79;
                                                                                                                }
                                                                                                                i78++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i77 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i77], o13, i78});
                                                                                                        }
                                                                                                        d4Var6 = d4Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    d4Var2 = d4Var6;
                                                                                                    w6Var3.j(identityHashMap2, w6Var3.b);
                                                                                                    w6Var3.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z5Var6.x();
                                                                                    if (z21) {
                                                                                        z5Var6.s(0, i72);
                                                                                    }
                                                                                }
                                                                                d4Var2.P2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                            } else {
                                                                str2 = null;
                                                            }
                                                            if (i19 != 0) {
                                                                final int i48 = 3;
                                                                U.c(R.drawable.iv_table_unmerge, cd.L0(2131753992, str2), new Runnable(this) { // from class: bi.t2
                                                                    public final /* synthetic */ d4 b;

                                                                    {
                                                                        this.b = this;
                                                                    }

                                                                    /* JADX WARN: Code restructure failed: missing block: B:93:0x016b, code lost:
                                                                    
                                                                        if (r5 <= 1) goto L84;
                                                                     */
                                                                    @Override // java.lang.Runnable
                                                                    /*
                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                    */
                                                                    public final void run() {
                                                                        d4 d4Var;
                                                                        boolean z20;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        d4 d4Var2;
                                                                        boolean z21;
                                                                        switch (i48) {
                                                                            case 0:
                                                                                d4 d4Var3 = this.b;
                                                                                d4Var3.getClass();
                                                                                z5 z5Var3 = z5Var2;
                                                                                LinkedHashSet linkedHashSet2 = z5Var3.H;
                                                                                if (z5Var3.F == null || linkedHashSet2.isEmpty()) {
                                                                                    d4Var = d4Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet2.iterator();
                                                                                    int i482 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = z5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i482 = Math.min(i482, b12);
                                                                                    }
                                                                                    linkedHashSet2.clear();
                                                                                    w6 w6Var = z5Var3.F;
                                                                                    w6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        d4Var = d4Var3;
                                                                                        z20 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[w6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z20 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < w6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[w6Var.b];
                                                                                                int i49 = 0;
                                                                                                for (int i50 = 0; i50 < w6Var.b; i50++) {
                                                                                                    iArr2[i50] = i49;
                                                                                                    if (!zArr[i50]) {
                                                                                                        i49++;
                                                                                                    }
                                                                                                }
                                                                                                if (i49 == 0) {
                                                                                                    w6Var.a.rows.clear();
                                                                                                    w6Var.i();
                                                                                                    d4Var = d4Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = w6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i51 = 0;
                                                                                                    while (i51 < size2) {
                                                                                                        Object obj = arrayList2.get(i51);
                                                                                                        i51++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = w6Var.b(pagetablecell4);
                                                                                                        int a10 = w6Var.a(pagetablecell4);
                                                                                                        int o11 = w6.o(pagetablecell4);
                                                                                                        int i52 = pagetablecell4.colspan;
                                                                                                        if (i52 == 0) {
                                                                                                            i52 = 1;
                                                                                                        }
                                                                                                        int i53 = -1;
                                                                                                        d4 d4Var4 = d4Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i54 = 0;
                                                                                                        for (int i55 = b13; i55 < b13 + o11 && i55 < w6Var.b; i55++) {
                                                                                                            if (!zArr[i55]) {
                                                                                                                if (i53 < 0) {
                                                                                                                    i53 = i55;
                                                                                                                }
                                                                                                                i54++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i53 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i53], a10, i54, i52});
                                                                                                        }
                                                                                                        d4Var3 = d4Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    d4Var = d4Var3;
                                                                                                    w6Var.j(identityHashMap, i49);
                                                                                                    w6Var.i();
                                                                                                    z20 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z5Var3.x();
                                                                                    if (z20) {
                                                                                        z5Var3.s(i482, 0);
                                                                                    }
                                                                                }
                                                                                d4Var.P2();
                                                                                break;
                                                                            case 1:
                                                                                d4 d4Var5 = this.b;
                                                                                d4Var5.getClass();
                                                                                a row = z5Var2.getRow();
                                                                                d4Var5.P2();
                                                                                if (row != null) {
                                                                                    o2 o2Var = d4Var5.Q3;
                                                                                    if (o2Var != null) {
                                                                                        o2Var.d();
                                                                                    }
                                                                                    d4Var5.u4(row);
                                                                                    o2 o2Var2 = d4Var5.Q3;
                                                                                    if (o2Var2 != null) {
                                                                                        o2Var2.h();
                                                                                    }
                                                                                    b4 b4Var = d4Var5.o3;
                                                                                    if (b4Var != null) {
                                                                                        b4Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                z5 z5Var4 = z5Var2;
                                                                                LinkedHashSet linkedHashSet3 = z5Var4.H;
                                                                                if (z5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet3.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i56 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        int i58 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i57 = Math.min(i57, z5Var4.F.b(pagetablecell5));
                                                                                            i58 = Math.min(i58, z5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet3.clear();
                                                                                        w6 w6Var2 = z5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = w6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i59 = -1;
                                                                                            int i60 = -1;
                                                                                            int i61 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = w6Var2.b(pagetablecell6);
                                                                                                int a11 = w6Var2.a(pagetablecell6);
                                                                                                int o12 = w6.o(pagetablecell6);
                                                                                                int i62 = pagetablecell6.colspan;
                                                                                                if (i62 == 0) {
                                                                                                    i62 = 1;
                                                                                                }
                                                                                                i56 = Math.min(i56, b14);
                                                                                                i61 = Math.min(i61, a11);
                                                                                                i59 = Math.max(i59, (b14 + o12) - 1);
                                                                                                i60 = Math.max(i60, (a11 + i62) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i63 = i56;
                                                                                            while (true) {
                                                                                                if (i63 <= i59) {
                                                                                                    for (int i64 = i61; i64 <= i60; i64++) {
                                                                                                        if (i63 >= 0 && i64 >= 0 && i63 < w6Var2.b && i64 < w6Var2.c) {
                                                                                                            hashSet9.add(w6Var2.d[i63][i64]);
                                                                                                        }
                                                                                                    }
                                                                                                    i63++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new v6(w6Var2, 0));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i65 = 0;
                                                                                                    while (i65 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i65);
                                                                                                        i65++;
                                                                                                        String g10 = w6.g((TL_iv.pageTableCell) obj2);
                                                                                                        if (g10.isEmpty()) {
                                                                                                            arrayList = arrayList3;
                                                                                                        } else {
                                                                                                            if (sb2.length() > 0) {
                                                                                                                arrayList = arrayList3;
                                                                                                                sb2.append("\n");
                                                                                                            } else {
                                                                                                                arrayList = arrayList3;
                                                                                                            }
                                                                                                            sb2.append(g10);
                                                                                                        }
                                                                                                        arrayList3 = arrayList;
                                                                                                    }
                                                                                                    TL_iv.pageTableCell pagetablecell7 = w6Var2.d[i56][i61];
                                                                                                    int i66 = (i60 - i61) + 1;
                                                                                                    int i67 = (i59 - i56) + 1;
                                                                                                    if (i66 <= 1) {
                                                                                                        i66 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i66;
                                                                                                    int i68 = i67 > 1 ? i67 : 0;
                                                                                                    pagetablecell7.rowspan = i68;
                                                                                                    int i69 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i66 > 0 ? i69 | 2 : i69 & (-3);
                                                                                                    int i70 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i68 > 0 ? i70 | 4 : i70 & (-5);
                                                                                                    w6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = w6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    w6Var2.i();
                                                                                                    z5Var4.x();
                                                                                                    z5Var4.w.invalidate();
                                                                                                    z5Var4.s(i57, i58);
                                                                                                    z5Var4.v();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet3.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 3:
                                                                                z5 z5Var5 = z5Var2;
                                                                                LinkedHashSet linkedHashSet4 = z5Var5.H;
                                                                                if (z5Var5.F != null && linkedHashSet4.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                                    if (w6.n(pagetablecell9) <= 1) {
                                                                                        int i71 = pagetablecell9.rowspan;
                                                                                        if (i71 == 0) {
                                                                                            i71 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = z5Var5.F.b(pagetablecell9);
                                                                                    int a12 = z5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet4.clear();
                                                                                    if (z5Var5.F.p(pagetablecell9)) {
                                                                                        z5Var5.x();
                                                                                        z5Var5.w.invalidate();
                                                                                        z5Var5.s(b15, a12);
                                                                                        z5Var5.v();
                                                                                    } else {
                                                                                        linkedHashSet4.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 4:
                                                                                z5Var2.j(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 5:
                                                                                z5Var2.j(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 6:
                                                                                z5Var2.k(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 7:
                                                                                z5Var2.k(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            default:
                                                                                d4 d4Var6 = this.b;
                                                                                d4Var6.getClass();
                                                                                z5 z5Var6 = z5Var2;
                                                                                LinkedHashSet linkedHashSet5 = z5Var6.H;
                                                                                if (z5Var6.F == null || linkedHashSet5.isEmpty()) {
                                                                                    d4Var2 = d4Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet5.iterator();
                                                                                    int i72 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = z5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i72 = Math.min(i72, a13);
                                                                                    }
                                                                                    linkedHashSet5.clear();
                                                                                    w6 w6Var3 = z5Var6.F;
                                                                                    w6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        d4Var2 = d4Var6;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[w6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < w6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[w6Var3.c];
                                                                                                int i73 = 0;
                                                                                                for (int i74 = 0; i74 < w6Var3.c; i74++) {
                                                                                                    iArr4[i74] = i73;
                                                                                                    if (!zArr2[i74]) {
                                                                                                        i73++;
                                                                                                    }
                                                                                                }
                                                                                                if (i73 == 0) {
                                                                                                    w6Var3.a.rows.clear();
                                                                                                    w6Var3.i();
                                                                                                    d4Var2 = d4Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = w6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i75 = 0;
                                                                                                    while (i75 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i75);
                                                                                                        i75++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = w6Var3.b(pagetablecell10);
                                                                                                        int a14 = w6Var3.a(pagetablecell10);
                                                                                                        int o13 = w6.o(pagetablecell10);
                                                                                                        int i76 = pagetablecell10.colspan;
                                                                                                        if (i76 == 0) {
                                                                                                            i76 = 1;
                                                                                                        }
                                                                                                        int i77 = -1;
                                                                                                        d4 d4Var7 = d4Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i78 = 0;
                                                                                                        for (int i79 = a14; i79 < a14 + i76 && i79 < w6Var3.c; i79++) {
                                                                                                            if (!zArr3[i79]) {
                                                                                                                if (i77 < 0) {
                                                                                                                    i77 = i79;
                                                                                                                }
                                                                                                                i78++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i77 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i77], o13, i78});
                                                                                                        }
                                                                                                        d4Var6 = d4Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    d4Var2 = d4Var6;
                                                                                                    w6Var3.j(identityHashMap2, w6Var3.b);
                                                                                                    w6Var3.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z5Var6.x();
                                                                                    if (z21) {
                                                                                        z5Var6.s(0, i72);
                                                                                    }
                                                                                }
                                                                                d4Var2.P2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                            }
                                                            if (i15 != 0) {
                                                                final int i49 = 4;
                                                                U.c(R.drawable.iv_table_insert_left, cd.L0(2131754010, str2), new Runnable(this) { // from class: bi.t2
                                                                    public final /* synthetic */ d4 b;

                                                                    {
                                                                        this.b = this;
                                                                    }

                                                                    /* JADX WARN: Code restructure failed: missing block: B:93:0x016b, code lost:
                                                                    
                                                                        if (r5 <= 1) goto L84;
                                                                     */
                                                                    @Override // java.lang.Runnable
                                                                    /*
                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                    */
                                                                    public final void run() {
                                                                        d4 d4Var;
                                                                        boolean z20;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        d4 d4Var2;
                                                                        boolean z21;
                                                                        switch (i49) {
                                                                            case 0:
                                                                                d4 d4Var3 = this.b;
                                                                                d4Var3.getClass();
                                                                                z5 z5Var3 = z5Var2;
                                                                                LinkedHashSet linkedHashSet2 = z5Var3.H;
                                                                                if (z5Var3.F == null || linkedHashSet2.isEmpty()) {
                                                                                    d4Var = d4Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet2.iterator();
                                                                                    int i482 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = z5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i482 = Math.min(i482, b12);
                                                                                    }
                                                                                    linkedHashSet2.clear();
                                                                                    w6 w6Var = z5Var3.F;
                                                                                    w6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        d4Var = d4Var3;
                                                                                        z20 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[w6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z20 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < w6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[w6Var.b];
                                                                                                int i492 = 0;
                                                                                                for (int i50 = 0; i50 < w6Var.b; i50++) {
                                                                                                    iArr2[i50] = i492;
                                                                                                    if (!zArr[i50]) {
                                                                                                        i492++;
                                                                                                    }
                                                                                                }
                                                                                                if (i492 == 0) {
                                                                                                    w6Var.a.rows.clear();
                                                                                                    w6Var.i();
                                                                                                    d4Var = d4Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = w6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i51 = 0;
                                                                                                    while (i51 < size2) {
                                                                                                        Object obj = arrayList2.get(i51);
                                                                                                        i51++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = w6Var.b(pagetablecell4);
                                                                                                        int a10 = w6Var.a(pagetablecell4);
                                                                                                        int o11 = w6.o(pagetablecell4);
                                                                                                        int i52 = pagetablecell4.colspan;
                                                                                                        if (i52 == 0) {
                                                                                                            i52 = 1;
                                                                                                        }
                                                                                                        int i53 = -1;
                                                                                                        d4 d4Var4 = d4Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i54 = 0;
                                                                                                        for (int i55 = b13; i55 < b13 + o11 && i55 < w6Var.b; i55++) {
                                                                                                            if (!zArr[i55]) {
                                                                                                                if (i53 < 0) {
                                                                                                                    i53 = i55;
                                                                                                                }
                                                                                                                i54++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i53 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i53], a10, i54, i52});
                                                                                                        }
                                                                                                        d4Var3 = d4Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    d4Var = d4Var3;
                                                                                                    w6Var.j(identityHashMap, i492);
                                                                                                    w6Var.i();
                                                                                                    z20 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z5Var3.x();
                                                                                    if (z20) {
                                                                                        z5Var3.s(i482, 0);
                                                                                    }
                                                                                }
                                                                                d4Var.P2();
                                                                                break;
                                                                            case 1:
                                                                                d4 d4Var5 = this.b;
                                                                                d4Var5.getClass();
                                                                                a row = z5Var2.getRow();
                                                                                d4Var5.P2();
                                                                                if (row != null) {
                                                                                    o2 o2Var = d4Var5.Q3;
                                                                                    if (o2Var != null) {
                                                                                        o2Var.d();
                                                                                    }
                                                                                    d4Var5.u4(row);
                                                                                    o2 o2Var2 = d4Var5.Q3;
                                                                                    if (o2Var2 != null) {
                                                                                        o2Var2.h();
                                                                                    }
                                                                                    b4 b4Var = d4Var5.o3;
                                                                                    if (b4Var != null) {
                                                                                        b4Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                z5 z5Var4 = z5Var2;
                                                                                LinkedHashSet linkedHashSet3 = z5Var4.H;
                                                                                if (z5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet3.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i56 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        int i58 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i57 = Math.min(i57, z5Var4.F.b(pagetablecell5));
                                                                                            i58 = Math.min(i58, z5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet3.clear();
                                                                                        w6 w6Var2 = z5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = w6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i59 = -1;
                                                                                            int i60 = -1;
                                                                                            int i61 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = w6Var2.b(pagetablecell6);
                                                                                                int a11 = w6Var2.a(pagetablecell6);
                                                                                                int o12 = w6.o(pagetablecell6);
                                                                                                int i62 = pagetablecell6.colspan;
                                                                                                if (i62 == 0) {
                                                                                                    i62 = 1;
                                                                                                }
                                                                                                i56 = Math.min(i56, b14);
                                                                                                i61 = Math.min(i61, a11);
                                                                                                i59 = Math.max(i59, (b14 + o12) - 1);
                                                                                                i60 = Math.max(i60, (a11 + i62) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i63 = i56;
                                                                                            while (true) {
                                                                                                if (i63 <= i59) {
                                                                                                    for (int i64 = i61; i64 <= i60; i64++) {
                                                                                                        if (i63 >= 0 && i64 >= 0 && i63 < w6Var2.b && i64 < w6Var2.c) {
                                                                                                            hashSet9.add(w6Var2.d[i63][i64]);
                                                                                                        }
                                                                                                    }
                                                                                                    i63++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new v6(w6Var2, 0));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i65 = 0;
                                                                                                    while (i65 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i65);
                                                                                                        i65++;
                                                                                                        String g10 = w6.g((TL_iv.pageTableCell) obj2);
                                                                                                        if (g10.isEmpty()) {
                                                                                                            arrayList = arrayList3;
                                                                                                        } else {
                                                                                                            if (sb2.length() > 0) {
                                                                                                                arrayList = arrayList3;
                                                                                                                sb2.append("\n");
                                                                                                            } else {
                                                                                                                arrayList = arrayList3;
                                                                                                            }
                                                                                                            sb2.append(g10);
                                                                                                        }
                                                                                                        arrayList3 = arrayList;
                                                                                                    }
                                                                                                    TL_iv.pageTableCell pagetablecell7 = w6Var2.d[i56][i61];
                                                                                                    int i66 = (i60 - i61) + 1;
                                                                                                    int i67 = (i59 - i56) + 1;
                                                                                                    if (i66 <= 1) {
                                                                                                        i66 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i66;
                                                                                                    int i68 = i67 > 1 ? i67 : 0;
                                                                                                    pagetablecell7.rowspan = i68;
                                                                                                    int i69 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i66 > 0 ? i69 | 2 : i69 & (-3);
                                                                                                    int i70 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i68 > 0 ? i70 | 4 : i70 & (-5);
                                                                                                    w6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = w6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    w6Var2.i();
                                                                                                    z5Var4.x();
                                                                                                    z5Var4.w.invalidate();
                                                                                                    z5Var4.s(i57, i58);
                                                                                                    z5Var4.v();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet3.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 3:
                                                                                z5 z5Var5 = z5Var2;
                                                                                LinkedHashSet linkedHashSet4 = z5Var5.H;
                                                                                if (z5Var5.F != null && linkedHashSet4.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                                    if (w6.n(pagetablecell9) <= 1) {
                                                                                        int i71 = pagetablecell9.rowspan;
                                                                                        if (i71 == 0) {
                                                                                            i71 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = z5Var5.F.b(pagetablecell9);
                                                                                    int a12 = z5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet4.clear();
                                                                                    if (z5Var5.F.p(pagetablecell9)) {
                                                                                        z5Var5.x();
                                                                                        z5Var5.w.invalidate();
                                                                                        z5Var5.s(b15, a12);
                                                                                        z5Var5.v();
                                                                                    } else {
                                                                                        linkedHashSet4.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 4:
                                                                                z5Var2.j(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 5:
                                                                                z5Var2.j(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 6:
                                                                                z5Var2.k(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 7:
                                                                                z5Var2.k(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            default:
                                                                                d4 d4Var6 = this.b;
                                                                                d4Var6.getClass();
                                                                                z5 z5Var6 = z5Var2;
                                                                                LinkedHashSet linkedHashSet5 = z5Var6.H;
                                                                                if (z5Var6.F == null || linkedHashSet5.isEmpty()) {
                                                                                    d4Var2 = d4Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet5.iterator();
                                                                                    int i72 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = z5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i72 = Math.min(i72, a13);
                                                                                    }
                                                                                    linkedHashSet5.clear();
                                                                                    w6 w6Var3 = z5Var6.F;
                                                                                    w6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        d4Var2 = d4Var6;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[w6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < w6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[w6Var3.c];
                                                                                                int i73 = 0;
                                                                                                for (int i74 = 0; i74 < w6Var3.c; i74++) {
                                                                                                    iArr4[i74] = i73;
                                                                                                    if (!zArr2[i74]) {
                                                                                                        i73++;
                                                                                                    }
                                                                                                }
                                                                                                if (i73 == 0) {
                                                                                                    w6Var3.a.rows.clear();
                                                                                                    w6Var3.i();
                                                                                                    d4Var2 = d4Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = w6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i75 = 0;
                                                                                                    while (i75 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i75);
                                                                                                        i75++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = w6Var3.b(pagetablecell10);
                                                                                                        int a14 = w6Var3.a(pagetablecell10);
                                                                                                        int o13 = w6.o(pagetablecell10);
                                                                                                        int i76 = pagetablecell10.colspan;
                                                                                                        if (i76 == 0) {
                                                                                                            i76 = 1;
                                                                                                        }
                                                                                                        int i77 = -1;
                                                                                                        d4 d4Var7 = d4Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i78 = 0;
                                                                                                        for (int i79 = a14; i79 < a14 + i76 && i79 < w6Var3.c; i79++) {
                                                                                                            if (!zArr3[i79]) {
                                                                                                                if (i77 < 0) {
                                                                                                                    i77 = i79;
                                                                                                                }
                                                                                                                i78++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i77 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i77], o13, i78});
                                                                                                        }
                                                                                                        d4Var6 = d4Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    d4Var2 = d4Var6;
                                                                                                    w6Var3.j(identityHashMap2, w6Var3.b);
                                                                                                    w6Var3.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z5Var6.x();
                                                                                    if (z21) {
                                                                                        z5Var6.s(0, i72);
                                                                                    }
                                                                                }
                                                                                d4Var2.P2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                                final int i50 = 5;
                                                                U.c(R.drawable.iv_table_insert_right, cd.L0(2131754009, str2), new Runnable(this) { // from class: bi.t2
                                                                    public final /* synthetic */ d4 b;

                                                                    {
                                                                        this.b = this;
                                                                    }

                                                                    /* JADX WARN: Code restructure failed: missing block: B:93:0x016b, code lost:
                                                                    
                                                                        if (r5 <= 1) goto L84;
                                                                     */
                                                                    @Override // java.lang.Runnable
                                                                    /*
                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                    */
                                                                    public final void run() {
                                                                        d4 d4Var;
                                                                        boolean z20;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        d4 d4Var2;
                                                                        boolean z21;
                                                                        switch (i50) {
                                                                            case 0:
                                                                                d4 d4Var3 = this.b;
                                                                                d4Var3.getClass();
                                                                                z5 z5Var3 = z5Var2;
                                                                                LinkedHashSet linkedHashSet2 = z5Var3.H;
                                                                                if (z5Var3.F == null || linkedHashSet2.isEmpty()) {
                                                                                    d4Var = d4Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet2.iterator();
                                                                                    int i482 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = z5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i482 = Math.min(i482, b12);
                                                                                    }
                                                                                    linkedHashSet2.clear();
                                                                                    w6 w6Var = z5Var3.F;
                                                                                    w6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        d4Var = d4Var3;
                                                                                        z20 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[w6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z20 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < w6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[w6Var.b];
                                                                                                int i492 = 0;
                                                                                                for (int i502 = 0; i502 < w6Var.b; i502++) {
                                                                                                    iArr2[i502] = i492;
                                                                                                    if (!zArr[i502]) {
                                                                                                        i492++;
                                                                                                    }
                                                                                                }
                                                                                                if (i492 == 0) {
                                                                                                    w6Var.a.rows.clear();
                                                                                                    w6Var.i();
                                                                                                    d4Var = d4Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = w6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i51 = 0;
                                                                                                    while (i51 < size2) {
                                                                                                        Object obj = arrayList2.get(i51);
                                                                                                        i51++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = w6Var.b(pagetablecell4);
                                                                                                        int a10 = w6Var.a(pagetablecell4);
                                                                                                        int o11 = w6.o(pagetablecell4);
                                                                                                        int i52 = pagetablecell4.colspan;
                                                                                                        if (i52 == 0) {
                                                                                                            i52 = 1;
                                                                                                        }
                                                                                                        int i53 = -1;
                                                                                                        d4 d4Var4 = d4Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i54 = 0;
                                                                                                        for (int i55 = b13; i55 < b13 + o11 && i55 < w6Var.b; i55++) {
                                                                                                            if (!zArr[i55]) {
                                                                                                                if (i53 < 0) {
                                                                                                                    i53 = i55;
                                                                                                                }
                                                                                                                i54++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i53 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i53], a10, i54, i52});
                                                                                                        }
                                                                                                        d4Var3 = d4Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    d4Var = d4Var3;
                                                                                                    w6Var.j(identityHashMap, i492);
                                                                                                    w6Var.i();
                                                                                                    z20 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z5Var3.x();
                                                                                    if (z20) {
                                                                                        z5Var3.s(i482, 0);
                                                                                    }
                                                                                }
                                                                                d4Var.P2();
                                                                                break;
                                                                            case 1:
                                                                                d4 d4Var5 = this.b;
                                                                                d4Var5.getClass();
                                                                                a row = z5Var2.getRow();
                                                                                d4Var5.P2();
                                                                                if (row != null) {
                                                                                    o2 o2Var = d4Var5.Q3;
                                                                                    if (o2Var != null) {
                                                                                        o2Var.d();
                                                                                    }
                                                                                    d4Var5.u4(row);
                                                                                    o2 o2Var2 = d4Var5.Q3;
                                                                                    if (o2Var2 != null) {
                                                                                        o2Var2.h();
                                                                                    }
                                                                                    b4 b4Var = d4Var5.o3;
                                                                                    if (b4Var != null) {
                                                                                        b4Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                z5 z5Var4 = z5Var2;
                                                                                LinkedHashSet linkedHashSet3 = z5Var4.H;
                                                                                if (z5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet3.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i56 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        int i58 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i57 = Math.min(i57, z5Var4.F.b(pagetablecell5));
                                                                                            i58 = Math.min(i58, z5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet3.clear();
                                                                                        w6 w6Var2 = z5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = w6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i59 = -1;
                                                                                            int i60 = -1;
                                                                                            int i61 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = w6Var2.b(pagetablecell6);
                                                                                                int a11 = w6Var2.a(pagetablecell6);
                                                                                                int o12 = w6.o(pagetablecell6);
                                                                                                int i62 = pagetablecell6.colspan;
                                                                                                if (i62 == 0) {
                                                                                                    i62 = 1;
                                                                                                }
                                                                                                i56 = Math.min(i56, b14);
                                                                                                i61 = Math.min(i61, a11);
                                                                                                i59 = Math.max(i59, (b14 + o12) - 1);
                                                                                                i60 = Math.max(i60, (a11 + i62) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i63 = i56;
                                                                                            while (true) {
                                                                                                if (i63 <= i59) {
                                                                                                    for (int i64 = i61; i64 <= i60; i64++) {
                                                                                                        if (i63 >= 0 && i64 >= 0 && i63 < w6Var2.b && i64 < w6Var2.c) {
                                                                                                            hashSet9.add(w6Var2.d[i63][i64]);
                                                                                                        }
                                                                                                    }
                                                                                                    i63++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new v6(w6Var2, 0));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i65 = 0;
                                                                                                    while (i65 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i65);
                                                                                                        i65++;
                                                                                                        String g10 = w6.g((TL_iv.pageTableCell) obj2);
                                                                                                        if (g10.isEmpty()) {
                                                                                                            arrayList = arrayList3;
                                                                                                        } else {
                                                                                                            if (sb2.length() > 0) {
                                                                                                                arrayList = arrayList3;
                                                                                                                sb2.append("\n");
                                                                                                            } else {
                                                                                                                arrayList = arrayList3;
                                                                                                            }
                                                                                                            sb2.append(g10);
                                                                                                        }
                                                                                                        arrayList3 = arrayList;
                                                                                                    }
                                                                                                    TL_iv.pageTableCell pagetablecell7 = w6Var2.d[i56][i61];
                                                                                                    int i66 = (i60 - i61) + 1;
                                                                                                    int i67 = (i59 - i56) + 1;
                                                                                                    if (i66 <= 1) {
                                                                                                        i66 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i66;
                                                                                                    int i68 = i67 > 1 ? i67 : 0;
                                                                                                    pagetablecell7.rowspan = i68;
                                                                                                    int i69 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i66 > 0 ? i69 | 2 : i69 & (-3);
                                                                                                    int i70 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i68 > 0 ? i70 | 4 : i70 & (-5);
                                                                                                    w6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = w6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    w6Var2.i();
                                                                                                    z5Var4.x();
                                                                                                    z5Var4.w.invalidate();
                                                                                                    z5Var4.s(i57, i58);
                                                                                                    z5Var4.v();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet3.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 3:
                                                                                z5 z5Var5 = z5Var2;
                                                                                LinkedHashSet linkedHashSet4 = z5Var5.H;
                                                                                if (z5Var5.F != null && linkedHashSet4.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                                    if (w6.n(pagetablecell9) <= 1) {
                                                                                        int i71 = pagetablecell9.rowspan;
                                                                                        if (i71 == 0) {
                                                                                            i71 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = z5Var5.F.b(pagetablecell9);
                                                                                    int a12 = z5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet4.clear();
                                                                                    if (z5Var5.F.p(pagetablecell9)) {
                                                                                        z5Var5.x();
                                                                                        z5Var5.w.invalidate();
                                                                                        z5Var5.s(b15, a12);
                                                                                        z5Var5.v();
                                                                                    } else {
                                                                                        linkedHashSet4.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 4:
                                                                                z5Var2.j(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 5:
                                                                                z5Var2.j(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 6:
                                                                                z5Var2.k(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 7:
                                                                                z5Var2.k(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            default:
                                                                                d4 d4Var6 = this.b;
                                                                                d4Var6.getClass();
                                                                                z5 z5Var6 = z5Var2;
                                                                                LinkedHashSet linkedHashSet5 = z5Var6.H;
                                                                                if (z5Var6.F == null || linkedHashSet5.isEmpty()) {
                                                                                    d4Var2 = d4Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet5.iterator();
                                                                                    int i72 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = z5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i72 = Math.min(i72, a13);
                                                                                    }
                                                                                    linkedHashSet5.clear();
                                                                                    w6 w6Var3 = z5Var6.F;
                                                                                    w6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        d4Var2 = d4Var6;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[w6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < w6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[w6Var3.c];
                                                                                                int i73 = 0;
                                                                                                for (int i74 = 0; i74 < w6Var3.c; i74++) {
                                                                                                    iArr4[i74] = i73;
                                                                                                    if (!zArr2[i74]) {
                                                                                                        i73++;
                                                                                                    }
                                                                                                }
                                                                                                if (i73 == 0) {
                                                                                                    w6Var3.a.rows.clear();
                                                                                                    w6Var3.i();
                                                                                                    d4Var2 = d4Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = w6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i75 = 0;
                                                                                                    while (i75 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i75);
                                                                                                        i75++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = w6Var3.b(pagetablecell10);
                                                                                                        int a14 = w6Var3.a(pagetablecell10);
                                                                                                        int o13 = w6.o(pagetablecell10);
                                                                                                        int i76 = pagetablecell10.colspan;
                                                                                                        if (i76 == 0) {
                                                                                                            i76 = 1;
                                                                                                        }
                                                                                                        int i77 = -1;
                                                                                                        d4 d4Var7 = d4Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i78 = 0;
                                                                                                        for (int i79 = a14; i79 < a14 + i76 && i79 < w6Var3.c; i79++) {
                                                                                                            if (!zArr3[i79]) {
                                                                                                                if (i77 < 0) {
                                                                                                                    i77 = i79;
                                                                                                                }
                                                                                                                i78++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i77 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i77], o13, i78});
                                                                                                        }
                                                                                                        d4Var6 = d4Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    d4Var2 = d4Var6;
                                                                                                    w6Var3.j(identityHashMap2, w6Var3.b);
                                                                                                    w6Var3.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z5Var6.x();
                                                                                    if (z21) {
                                                                                        z5Var6.s(0, i72);
                                                                                    }
                                                                                }
                                                                                d4Var2.P2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                            }
                                                            if (i16 != 0) {
                                                                final int i51 = 6;
                                                                U.c(R.drawable.iv_table_insert_top, cd.L0(2131754012, str2), new Runnable(this) { // from class: bi.t2
                                                                    public final /* synthetic */ d4 b;

                                                                    {
                                                                        this.b = this;
                                                                    }

                                                                    /* JADX WARN: Code restructure failed: missing block: B:93:0x016b, code lost:
                                                                    
                                                                        if (r5 <= 1) goto L84;
                                                                     */
                                                                    @Override // java.lang.Runnable
                                                                    /*
                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                    */
                                                                    public final void run() {
                                                                        d4 d4Var;
                                                                        boolean z20;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        d4 d4Var2;
                                                                        boolean z21;
                                                                        switch (i51) {
                                                                            case 0:
                                                                                d4 d4Var3 = this.b;
                                                                                d4Var3.getClass();
                                                                                z5 z5Var3 = z5Var2;
                                                                                LinkedHashSet linkedHashSet2 = z5Var3.H;
                                                                                if (z5Var3.F == null || linkedHashSet2.isEmpty()) {
                                                                                    d4Var = d4Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet2.iterator();
                                                                                    int i482 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = z5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i482 = Math.min(i482, b12);
                                                                                    }
                                                                                    linkedHashSet2.clear();
                                                                                    w6 w6Var = z5Var3.F;
                                                                                    w6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        d4Var = d4Var3;
                                                                                        z20 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[w6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z20 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < w6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[w6Var.b];
                                                                                                int i492 = 0;
                                                                                                for (int i502 = 0; i502 < w6Var.b; i502++) {
                                                                                                    iArr2[i502] = i492;
                                                                                                    if (!zArr[i502]) {
                                                                                                        i492++;
                                                                                                    }
                                                                                                }
                                                                                                if (i492 == 0) {
                                                                                                    w6Var.a.rows.clear();
                                                                                                    w6Var.i();
                                                                                                    d4Var = d4Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = w6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i512 = 0;
                                                                                                    while (i512 < size2) {
                                                                                                        Object obj = arrayList2.get(i512);
                                                                                                        i512++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = w6Var.b(pagetablecell4);
                                                                                                        int a10 = w6Var.a(pagetablecell4);
                                                                                                        int o11 = w6.o(pagetablecell4);
                                                                                                        int i52 = pagetablecell4.colspan;
                                                                                                        if (i52 == 0) {
                                                                                                            i52 = 1;
                                                                                                        }
                                                                                                        int i53 = -1;
                                                                                                        d4 d4Var4 = d4Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i54 = 0;
                                                                                                        for (int i55 = b13; i55 < b13 + o11 && i55 < w6Var.b; i55++) {
                                                                                                            if (!zArr[i55]) {
                                                                                                                if (i53 < 0) {
                                                                                                                    i53 = i55;
                                                                                                                }
                                                                                                                i54++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i53 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i53], a10, i54, i52});
                                                                                                        }
                                                                                                        d4Var3 = d4Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    d4Var = d4Var3;
                                                                                                    w6Var.j(identityHashMap, i492);
                                                                                                    w6Var.i();
                                                                                                    z20 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z5Var3.x();
                                                                                    if (z20) {
                                                                                        z5Var3.s(i482, 0);
                                                                                    }
                                                                                }
                                                                                d4Var.P2();
                                                                                break;
                                                                            case 1:
                                                                                d4 d4Var5 = this.b;
                                                                                d4Var5.getClass();
                                                                                a row = z5Var2.getRow();
                                                                                d4Var5.P2();
                                                                                if (row != null) {
                                                                                    o2 o2Var = d4Var5.Q3;
                                                                                    if (o2Var != null) {
                                                                                        o2Var.d();
                                                                                    }
                                                                                    d4Var5.u4(row);
                                                                                    o2 o2Var2 = d4Var5.Q3;
                                                                                    if (o2Var2 != null) {
                                                                                        o2Var2.h();
                                                                                    }
                                                                                    b4 b4Var = d4Var5.o3;
                                                                                    if (b4Var != null) {
                                                                                        b4Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                z5 z5Var4 = z5Var2;
                                                                                LinkedHashSet linkedHashSet3 = z5Var4.H;
                                                                                if (z5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet3.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i56 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        int i58 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i57 = Math.min(i57, z5Var4.F.b(pagetablecell5));
                                                                                            i58 = Math.min(i58, z5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet3.clear();
                                                                                        w6 w6Var2 = z5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = w6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i59 = -1;
                                                                                            int i60 = -1;
                                                                                            int i61 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = w6Var2.b(pagetablecell6);
                                                                                                int a11 = w6Var2.a(pagetablecell6);
                                                                                                int o12 = w6.o(pagetablecell6);
                                                                                                int i62 = pagetablecell6.colspan;
                                                                                                if (i62 == 0) {
                                                                                                    i62 = 1;
                                                                                                }
                                                                                                i56 = Math.min(i56, b14);
                                                                                                i61 = Math.min(i61, a11);
                                                                                                i59 = Math.max(i59, (b14 + o12) - 1);
                                                                                                i60 = Math.max(i60, (a11 + i62) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i63 = i56;
                                                                                            while (true) {
                                                                                                if (i63 <= i59) {
                                                                                                    for (int i64 = i61; i64 <= i60; i64++) {
                                                                                                        if (i63 >= 0 && i64 >= 0 && i63 < w6Var2.b && i64 < w6Var2.c) {
                                                                                                            hashSet9.add(w6Var2.d[i63][i64]);
                                                                                                        }
                                                                                                    }
                                                                                                    i63++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new v6(w6Var2, 0));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i65 = 0;
                                                                                                    while (i65 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i65);
                                                                                                        i65++;
                                                                                                        String g10 = w6.g((TL_iv.pageTableCell) obj2);
                                                                                                        if (g10.isEmpty()) {
                                                                                                            arrayList = arrayList3;
                                                                                                        } else {
                                                                                                            if (sb2.length() > 0) {
                                                                                                                arrayList = arrayList3;
                                                                                                                sb2.append("\n");
                                                                                                            } else {
                                                                                                                arrayList = arrayList3;
                                                                                                            }
                                                                                                            sb2.append(g10);
                                                                                                        }
                                                                                                        arrayList3 = arrayList;
                                                                                                    }
                                                                                                    TL_iv.pageTableCell pagetablecell7 = w6Var2.d[i56][i61];
                                                                                                    int i66 = (i60 - i61) + 1;
                                                                                                    int i67 = (i59 - i56) + 1;
                                                                                                    if (i66 <= 1) {
                                                                                                        i66 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i66;
                                                                                                    int i68 = i67 > 1 ? i67 : 0;
                                                                                                    pagetablecell7.rowspan = i68;
                                                                                                    int i69 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i66 > 0 ? i69 | 2 : i69 & (-3);
                                                                                                    int i70 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i68 > 0 ? i70 | 4 : i70 & (-5);
                                                                                                    w6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = w6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    w6Var2.i();
                                                                                                    z5Var4.x();
                                                                                                    z5Var4.w.invalidate();
                                                                                                    z5Var4.s(i57, i58);
                                                                                                    z5Var4.v();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet3.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 3:
                                                                                z5 z5Var5 = z5Var2;
                                                                                LinkedHashSet linkedHashSet4 = z5Var5.H;
                                                                                if (z5Var5.F != null && linkedHashSet4.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                                    if (w6.n(pagetablecell9) <= 1) {
                                                                                        int i71 = pagetablecell9.rowspan;
                                                                                        if (i71 == 0) {
                                                                                            i71 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = z5Var5.F.b(pagetablecell9);
                                                                                    int a12 = z5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet4.clear();
                                                                                    if (z5Var5.F.p(pagetablecell9)) {
                                                                                        z5Var5.x();
                                                                                        z5Var5.w.invalidate();
                                                                                        z5Var5.s(b15, a12);
                                                                                        z5Var5.v();
                                                                                    } else {
                                                                                        linkedHashSet4.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 4:
                                                                                z5Var2.j(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 5:
                                                                                z5Var2.j(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 6:
                                                                                z5Var2.k(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 7:
                                                                                z5Var2.k(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            default:
                                                                                d4 d4Var6 = this.b;
                                                                                d4Var6.getClass();
                                                                                z5 z5Var6 = z5Var2;
                                                                                LinkedHashSet linkedHashSet5 = z5Var6.H;
                                                                                if (z5Var6.F == null || linkedHashSet5.isEmpty()) {
                                                                                    d4Var2 = d4Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet5.iterator();
                                                                                    int i72 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = z5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i72 = Math.min(i72, a13);
                                                                                    }
                                                                                    linkedHashSet5.clear();
                                                                                    w6 w6Var3 = z5Var6.F;
                                                                                    w6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        d4Var2 = d4Var6;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[w6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < w6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[w6Var3.c];
                                                                                                int i73 = 0;
                                                                                                for (int i74 = 0; i74 < w6Var3.c; i74++) {
                                                                                                    iArr4[i74] = i73;
                                                                                                    if (!zArr2[i74]) {
                                                                                                        i73++;
                                                                                                    }
                                                                                                }
                                                                                                if (i73 == 0) {
                                                                                                    w6Var3.a.rows.clear();
                                                                                                    w6Var3.i();
                                                                                                    d4Var2 = d4Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = w6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i75 = 0;
                                                                                                    while (i75 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i75);
                                                                                                        i75++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = w6Var3.b(pagetablecell10);
                                                                                                        int a14 = w6Var3.a(pagetablecell10);
                                                                                                        int o13 = w6.o(pagetablecell10);
                                                                                                        int i76 = pagetablecell10.colspan;
                                                                                                        if (i76 == 0) {
                                                                                                            i76 = 1;
                                                                                                        }
                                                                                                        int i77 = -1;
                                                                                                        d4 d4Var7 = d4Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i78 = 0;
                                                                                                        for (int i79 = a14; i79 < a14 + i76 && i79 < w6Var3.c; i79++) {
                                                                                                            if (!zArr3[i79]) {
                                                                                                                if (i77 < 0) {
                                                                                                                    i77 = i79;
                                                                                                                }
                                                                                                                i78++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i77 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i77], o13, i78});
                                                                                                        }
                                                                                                        d4Var6 = d4Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    d4Var2 = d4Var6;
                                                                                                    w6Var3.j(identityHashMap2, w6Var3.b);
                                                                                                    w6Var3.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z5Var6.x();
                                                                                    if (z21) {
                                                                                        z5Var6.s(0, i72);
                                                                                    }
                                                                                }
                                                                                d4Var2.P2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                                final int i52 = 7;
                                                                U.c(R.drawable.iv_table_insert_bottom, cd.L0(2131754011, str2), new Runnable(this) { // from class: bi.t2
                                                                    public final /* synthetic */ d4 b;

                                                                    {
                                                                        this.b = this;
                                                                    }

                                                                    /* JADX WARN: Code restructure failed: missing block: B:93:0x016b, code lost:
                                                                    
                                                                        if (r5 <= 1) goto L84;
                                                                     */
                                                                    @Override // java.lang.Runnable
                                                                    /*
                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                    */
                                                                    public final void run() {
                                                                        d4 d4Var;
                                                                        boolean z20;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        d4 d4Var2;
                                                                        boolean z21;
                                                                        switch (i52) {
                                                                            case 0:
                                                                                d4 d4Var3 = this.b;
                                                                                d4Var3.getClass();
                                                                                z5 z5Var3 = z5Var2;
                                                                                LinkedHashSet linkedHashSet2 = z5Var3.H;
                                                                                if (z5Var3.F == null || linkedHashSet2.isEmpty()) {
                                                                                    d4Var = d4Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet2.iterator();
                                                                                    int i482 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = z5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i482 = Math.min(i482, b12);
                                                                                    }
                                                                                    linkedHashSet2.clear();
                                                                                    w6 w6Var = z5Var3.F;
                                                                                    w6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        d4Var = d4Var3;
                                                                                        z20 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[w6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z20 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < w6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[w6Var.b];
                                                                                                int i492 = 0;
                                                                                                for (int i502 = 0; i502 < w6Var.b; i502++) {
                                                                                                    iArr2[i502] = i492;
                                                                                                    if (!zArr[i502]) {
                                                                                                        i492++;
                                                                                                    }
                                                                                                }
                                                                                                if (i492 == 0) {
                                                                                                    w6Var.a.rows.clear();
                                                                                                    w6Var.i();
                                                                                                    d4Var = d4Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = w6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i512 = 0;
                                                                                                    while (i512 < size2) {
                                                                                                        Object obj = arrayList2.get(i512);
                                                                                                        i512++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = w6Var.b(pagetablecell4);
                                                                                                        int a10 = w6Var.a(pagetablecell4);
                                                                                                        int o11 = w6.o(pagetablecell4);
                                                                                                        int i522 = pagetablecell4.colspan;
                                                                                                        if (i522 == 0) {
                                                                                                            i522 = 1;
                                                                                                        }
                                                                                                        int i53 = -1;
                                                                                                        d4 d4Var4 = d4Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i54 = 0;
                                                                                                        for (int i55 = b13; i55 < b13 + o11 && i55 < w6Var.b; i55++) {
                                                                                                            if (!zArr[i55]) {
                                                                                                                if (i53 < 0) {
                                                                                                                    i53 = i55;
                                                                                                                }
                                                                                                                i54++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i53 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i53], a10, i54, i522});
                                                                                                        }
                                                                                                        d4Var3 = d4Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    d4Var = d4Var3;
                                                                                                    w6Var.j(identityHashMap, i492);
                                                                                                    w6Var.i();
                                                                                                    z20 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z5Var3.x();
                                                                                    if (z20) {
                                                                                        z5Var3.s(i482, 0);
                                                                                    }
                                                                                }
                                                                                d4Var.P2();
                                                                                break;
                                                                            case 1:
                                                                                d4 d4Var5 = this.b;
                                                                                d4Var5.getClass();
                                                                                a row = z5Var2.getRow();
                                                                                d4Var5.P2();
                                                                                if (row != null) {
                                                                                    o2 o2Var = d4Var5.Q3;
                                                                                    if (o2Var != null) {
                                                                                        o2Var.d();
                                                                                    }
                                                                                    d4Var5.u4(row);
                                                                                    o2 o2Var2 = d4Var5.Q3;
                                                                                    if (o2Var2 != null) {
                                                                                        o2Var2.h();
                                                                                    }
                                                                                    b4 b4Var = d4Var5.o3;
                                                                                    if (b4Var != null) {
                                                                                        b4Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                z5 z5Var4 = z5Var2;
                                                                                LinkedHashSet linkedHashSet3 = z5Var4.H;
                                                                                if (z5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet3.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i56 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        int i58 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i57 = Math.min(i57, z5Var4.F.b(pagetablecell5));
                                                                                            i58 = Math.min(i58, z5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet3.clear();
                                                                                        w6 w6Var2 = z5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = w6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i59 = -1;
                                                                                            int i60 = -1;
                                                                                            int i61 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = w6Var2.b(pagetablecell6);
                                                                                                int a11 = w6Var2.a(pagetablecell6);
                                                                                                int o12 = w6.o(pagetablecell6);
                                                                                                int i62 = pagetablecell6.colspan;
                                                                                                if (i62 == 0) {
                                                                                                    i62 = 1;
                                                                                                }
                                                                                                i56 = Math.min(i56, b14);
                                                                                                i61 = Math.min(i61, a11);
                                                                                                i59 = Math.max(i59, (b14 + o12) - 1);
                                                                                                i60 = Math.max(i60, (a11 + i62) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i63 = i56;
                                                                                            while (true) {
                                                                                                if (i63 <= i59) {
                                                                                                    for (int i64 = i61; i64 <= i60; i64++) {
                                                                                                        if (i63 >= 0 && i64 >= 0 && i63 < w6Var2.b && i64 < w6Var2.c) {
                                                                                                            hashSet9.add(w6Var2.d[i63][i64]);
                                                                                                        }
                                                                                                    }
                                                                                                    i63++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new v6(w6Var2, 0));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i65 = 0;
                                                                                                    while (i65 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i65);
                                                                                                        i65++;
                                                                                                        String g10 = w6.g((TL_iv.pageTableCell) obj2);
                                                                                                        if (g10.isEmpty()) {
                                                                                                            arrayList = arrayList3;
                                                                                                        } else {
                                                                                                            if (sb2.length() > 0) {
                                                                                                                arrayList = arrayList3;
                                                                                                                sb2.append("\n");
                                                                                                            } else {
                                                                                                                arrayList = arrayList3;
                                                                                                            }
                                                                                                            sb2.append(g10);
                                                                                                        }
                                                                                                        arrayList3 = arrayList;
                                                                                                    }
                                                                                                    TL_iv.pageTableCell pagetablecell7 = w6Var2.d[i56][i61];
                                                                                                    int i66 = (i60 - i61) + 1;
                                                                                                    int i67 = (i59 - i56) + 1;
                                                                                                    if (i66 <= 1) {
                                                                                                        i66 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i66;
                                                                                                    int i68 = i67 > 1 ? i67 : 0;
                                                                                                    pagetablecell7.rowspan = i68;
                                                                                                    int i69 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i66 > 0 ? i69 | 2 : i69 & (-3);
                                                                                                    int i70 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i68 > 0 ? i70 | 4 : i70 & (-5);
                                                                                                    w6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = w6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    w6Var2.i();
                                                                                                    z5Var4.x();
                                                                                                    z5Var4.w.invalidate();
                                                                                                    z5Var4.s(i57, i58);
                                                                                                    z5Var4.v();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet3.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 3:
                                                                                z5 z5Var5 = z5Var2;
                                                                                LinkedHashSet linkedHashSet4 = z5Var5.H;
                                                                                if (z5Var5.F != null && linkedHashSet4.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                                    if (w6.n(pagetablecell9) <= 1) {
                                                                                        int i71 = pagetablecell9.rowspan;
                                                                                        if (i71 == 0) {
                                                                                            i71 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = z5Var5.F.b(pagetablecell9);
                                                                                    int a12 = z5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet4.clear();
                                                                                    if (z5Var5.F.p(pagetablecell9)) {
                                                                                        z5Var5.x();
                                                                                        z5Var5.w.invalidate();
                                                                                        z5Var5.s(b15, a12);
                                                                                        z5Var5.v();
                                                                                    } else {
                                                                                        linkedHashSet4.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 4:
                                                                                z5Var2.j(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 5:
                                                                                z5Var2.j(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 6:
                                                                                z5Var2.k(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 7:
                                                                                z5Var2.k(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            default:
                                                                                d4 d4Var6 = this.b;
                                                                                d4Var6.getClass();
                                                                                z5 z5Var6 = z5Var2;
                                                                                LinkedHashSet linkedHashSet5 = z5Var6.H;
                                                                                if (z5Var6.F == null || linkedHashSet5.isEmpty()) {
                                                                                    d4Var2 = d4Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet5.iterator();
                                                                                    int i72 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = z5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i72 = Math.min(i72, a13);
                                                                                    }
                                                                                    linkedHashSet5.clear();
                                                                                    w6 w6Var3 = z5Var6.F;
                                                                                    w6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        d4Var2 = d4Var6;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[w6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < w6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[w6Var3.c];
                                                                                                int i73 = 0;
                                                                                                for (int i74 = 0; i74 < w6Var3.c; i74++) {
                                                                                                    iArr4[i74] = i73;
                                                                                                    if (!zArr2[i74]) {
                                                                                                        i73++;
                                                                                                    }
                                                                                                }
                                                                                                if (i73 == 0) {
                                                                                                    w6Var3.a.rows.clear();
                                                                                                    w6Var3.i();
                                                                                                    d4Var2 = d4Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = w6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i75 = 0;
                                                                                                    while (i75 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i75);
                                                                                                        i75++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = w6Var3.b(pagetablecell10);
                                                                                                        int a14 = w6Var3.a(pagetablecell10);
                                                                                                        int o13 = w6.o(pagetablecell10);
                                                                                                        int i76 = pagetablecell10.colspan;
                                                                                                        if (i76 == 0) {
                                                                                                            i76 = 1;
                                                                                                        }
                                                                                                        int i77 = -1;
                                                                                                        d4 d4Var7 = d4Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i78 = 0;
                                                                                                        for (int i79 = a14; i79 < a14 + i76 && i79 < w6Var3.c; i79++) {
                                                                                                            if (!zArr3[i79]) {
                                                                                                                if (i77 < 0) {
                                                                                                                    i77 = i79;
                                                                                                                }
                                                                                                                i78++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i77 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i77], o13, i78});
                                                                                                        }
                                                                                                        d4Var6 = d4Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    d4Var2 = d4Var6;
                                                                                                    w6Var3.j(identityHashMap2, w6Var3.b);
                                                                                                    w6Var3.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z5Var6.x();
                                                                                    if (z21) {
                                                                                        z5Var6.s(0, i72);
                                                                                    }
                                                                                }
                                                                                d4Var2.P2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                            }
                                                            if (i18 == 0) {
                                                                String L02 = cd.L0(2131754039, str2);
                                                                final int i53 = 8;
                                                                Runnable runnable = new Runnable(this) { // from class: bi.t2
                                                                    public final /* synthetic */ d4 b;

                                                                    {
                                                                        this.b = this;
                                                                    }

                                                                    /* JADX WARN: Code restructure failed: missing block: B:93:0x016b, code lost:
                                                                    
                                                                        if (r5 <= 1) goto L84;
                                                                     */
                                                                    @Override // java.lang.Runnable
                                                                    /*
                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                    */
                                                                    public final void run() {
                                                                        d4 d4Var;
                                                                        boolean z20;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        d4 d4Var2;
                                                                        boolean z21;
                                                                        switch (i53) {
                                                                            case 0:
                                                                                d4 d4Var3 = this.b;
                                                                                d4Var3.getClass();
                                                                                z5 z5Var3 = z5Var2;
                                                                                LinkedHashSet linkedHashSet2 = z5Var3.H;
                                                                                if (z5Var3.F == null || linkedHashSet2.isEmpty()) {
                                                                                    d4Var = d4Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet2.iterator();
                                                                                    int i482 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = z5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i482 = Math.min(i482, b12);
                                                                                    }
                                                                                    linkedHashSet2.clear();
                                                                                    w6 w6Var = z5Var3.F;
                                                                                    w6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        d4Var = d4Var3;
                                                                                        z20 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[w6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z20 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < w6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[w6Var.b];
                                                                                                int i492 = 0;
                                                                                                for (int i502 = 0; i502 < w6Var.b; i502++) {
                                                                                                    iArr2[i502] = i492;
                                                                                                    if (!zArr[i502]) {
                                                                                                        i492++;
                                                                                                    }
                                                                                                }
                                                                                                if (i492 == 0) {
                                                                                                    w6Var.a.rows.clear();
                                                                                                    w6Var.i();
                                                                                                    d4Var = d4Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = w6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i512 = 0;
                                                                                                    while (i512 < size2) {
                                                                                                        Object obj = arrayList2.get(i512);
                                                                                                        i512++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = w6Var.b(pagetablecell4);
                                                                                                        int a10 = w6Var.a(pagetablecell4);
                                                                                                        int o11 = w6.o(pagetablecell4);
                                                                                                        int i522 = pagetablecell4.colspan;
                                                                                                        if (i522 == 0) {
                                                                                                            i522 = 1;
                                                                                                        }
                                                                                                        int i532 = -1;
                                                                                                        d4 d4Var4 = d4Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i54 = 0;
                                                                                                        for (int i55 = b13; i55 < b13 + o11 && i55 < w6Var.b; i55++) {
                                                                                                            if (!zArr[i55]) {
                                                                                                                if (i532 < 0) {
                                                                                                                    i532 = i55;
                                                                                                                }
                                                                                                                i54++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i532 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i532], a10, i54, i522});
                                                                                                        }
                                                                                                        d4Var3 = d4Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    d4Var = d4Var3;
                                                                                                    w6Var.j(identityHashMap, i492);
                                                                                                    w6Var.i();
                                                                                                    z20 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z5Var3.x();
                                                                                    if (z20) {
                                                                                        z5Var3.s(i482, 0);
                                                                                    }
                                                                                }
                                                                                d4Var.P2();
                                                                                break;
                                                                            case 1:
                                                                                d4 d4Var5 = this.b;
                                                                                d4Var5.getClass();
                                                                                a row = z5Var2.getRow();
                                                                                d4Var5.P2();
                                                                                if (row != null) {
                                                                                    o2 o2Var = d4Var5.Q3;
                                                                                    if (o2Var != null) {
                                                                                        o2Var.d();
                                                                                    }
                                                                                    d4Var5.u4(row);
                                                                                    o2 o2Var2 = d4Var5.Q3;
                                                                                    if (o2Var2 != null) {
                                                                                        o2Var2.h();
                                                                                    }
                                                                                    b4 b4Var = d4Var5.o3;
                                                                                    if (b4Var != null) {
                                                                                        b4Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                z5 z5Var4 = z5Var2;
                                                                                LinkedHashSet linkedHashSet3 = z5Var4.H;
                                                                                if (z5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet3.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i56 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        int i58 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i57 = Math.min(i57, z5Var4.F.b(pagetablecell5));
                                                                                            i58 = Math.min(i58, z5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet3.clear();
                                                                                        w6 w6Var2 = z5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = w6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i59 = -1;
                                                                                            int i60 = -1;
                                                                                            int i61 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = w6Var2.b(pagetablecell6);
                                                                                                int a11 = w6Var2.a(pagetablecell6);
                                                                                                int o12 = w6.o(pagetablecell6);
                                                                                                int i62 = pagetablecell6.colspan;
                                                                                                if (i62 == 0) {
                                                                                                    i62 = 1;
                                                                                                }
                                                                                                i56 = Math.min(i56, b14);
                                                                                                i61 = Math.min(i61, a11);
                                                                                                i59 = Math.max(i59, (b14 + o12) - 1);
                                                                                                i60 = Math.max(i60, (a11 + i62) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i63 = i56;
                                                                                            while (true) {
                                                                                                if (i63 <= i59) {
                                                                                                    for (int i64 = i61; i64 <= i60; i64++) {
                                                                                                        if (i63 >= 0 && i64 >= 0 && i63 < w6Var2.b && i64 < w6Var2.c) {
                                                                                                            hashSet9.add(w6Var2.d[i63][i64]);
                                                                                                        }
                                                                                                    }
                                                                                                    i63++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new v6(w6Var2, 0));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i65 = 0;
                                                                                                    while (i65 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i65);
                                                                                                        i65++;
                                                                                                        String g10 = w6.g((TL_iv.pageTableCell) obj2);
                                                                                                        if (g10.isEmpty()) {
                                                                                                            arrayList = arrayList3;
                                                                                                        } else {
                                                                                                            if (sb2.length() > 0) {
                                                                                                                arrayList = arrayList3;
                                                                                                                sb2.append("\n");
                                                                                                            } else {
                                                                                                                arrayList = arrayList3;
                                                                                                            }
                                                                                                            sb2.append(g10);
                                                                                                        }
                                                                                                        arrayList3 = arrayList;
                                                                                                    }
                                                                                                    TL_iv.pageTableCell pagetablecell7 = w6Var2.d[i56][i61];
                                                                                                    int i66 = (i60 - i61) + 1;
                                                                                                    int i67 = (i59 - i56) + 1;
                                                                                                    if (i66 <= 1) {
                                                                                                        i66 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i66;
                                                                                                    int i68 = i67 > 1 ? i67 : 0;
                                                                                                    pagetablecell7.rowspan = i68;
                                                                                                    int i69 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i66 > 0 ? i69 | 2 : i69 & (-3);
                                                                                                    int i70 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i68 > 0 ? i70 | 4 : i70 & (-5);
                                                                                                    w6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = w6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    w6Var2.i();
                                                                                                    z5Var4.x();
                                                                                                    z5Var4.w.invalidate();
                                                                                                    z5Var4.s(i57, i58);
                                                                                                    z5Var4.v();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet3.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 3:
                                                                                z5 z5Var5 = z5Var2;
                                                                                LinkedHashSet linkedHashSet4 = z5Var5.H;
                                                                                if (z5Var5.F != null && linkedHashSet4.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                                    if (w6.n(pagetablecell9) <= 1) {
                                                                                        int i71 = pagetablecell9.rowspan;
                                                                                        if (i71 == 0) {
                                                                                            i71 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = z5Var5.F.b(pagetablecell9);
                                                                                    int a12 = z5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet4.clear();
                                                                                    if (z5Var5.F.p(pagetablecell9)) {
                                                                                        z5Var5.x();
                                                                                        z5Var5.w.invalidate();
                                                                                        z5Var5.s(b15, a12);
                                                                                        z5Var5.v();
                                                                                    } else {
                                                                                        linkedHashSet4.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 4:
                                                                                z5Var2.j(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 5:
                                                                                z5Var2.j(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 6:
                                                                                z5Var2.k(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 7:
                                                                                z5Var2.k(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            default:
                                                                                d4 d4Var6 = this.b;
                                                                                d4Var6.getClass();
                                                                                z5 z5Var6 = z5Var2;
                                                                                LinkedHashSet linkedHashSet5 = z5Var6.H;
                                                                                if (z5Var6.F == null || linkedHashSet5.isEmpty()) {
                                                                                    d4Var2 = d4Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet5.iterator();
                                                                                    int i72 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = z5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i72 = Math.min(i72, a13);
                                                                                    }
                                                                                    linkedHashSet5.clear();
                                                                                    w6 w6Var3 = z5Var6.F;
                                                                                    w6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        d4Var2 = d4Var6;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[w6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < w6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[w6Var3.c];
                                                                                                int i73 = 0;
                                                                                                for (int i74 = 0; i74 < w6Var3.c; i74++) {
                                                                                                    iArr4[i74] = i73;
                                                                                                    if (!zArr2[i74]) {
                                                                                                        i73++;
                                                                                                    }
                                                                                                }
                                                                                                if (i73 == 0) {
                                                                                                    w6Var3.a.rows.clear();
                                                                                                    w6Var3.i();
                                                                                                    d4Var2 = d4Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = w6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i75 = 0;
                                                                                                    while (i75 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i75);
                                                                                                        i75++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = w6Var3.b(pagetablecell10);
                                                                                                        int a14 = w6Var3.a(pagetablecell10);
                                                                                                        int o13 = w6.o(pagetablecell10);
                                                                                                        int i76 = pagetablecell10.colspan;
                                                                                                        if (i76 == 0) {
                                                                                                            i76 = 1;
                                                                                                        }
                                                                                                        int i77 = -1;
                                                                                                        d4 d4Var7 = d4Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i78 = 0;
                                                                                                        for (int i79 = a14; i79 < a14 + i76 && i79 < w6Var3.c; i79++) {
                                                                                                            if (!zArr3[i79]) {
                                                                                                                if (i77 < 0) {
                                                                                                                    i77 = i79;
                                                                                                                }
                                                                                                                i78++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i77 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i77], o13, i78});
                                                                                                        }
                                                                                                        d4Var6 = d4Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    d4Var2 = d4Var6;
                                                                                                    w6Var3.j(identityHashMap2, w6Var3.b);
                                                                                                    w6Var3.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z5Var6.x();
                                                                                    if (z21) {
                                                                                        z5Var6.s(0, i72);
                                                                                    }
                                                                                }
                                                                                d4Var2.P2();
                                                                                break;
                                                                        }
                                                                    }
                                                                };
                                                                r92 = 1;
                                                                U.c(R.drawable.iv_table_remove, L02, runnable, true);
                                                            } else {
                                                                r92 = 1;
                                                            }
                                                            if (i20 != 0) {
                                                                final int i54 = 0;
                                                                U.c(R.drawable.iv_table_remove, cd.L0(2131754035, str2), new Runnable(this) { // from class: bi.t2
                                                                    public final /* synthetic */ d4 b;

                                                                    {
                                                                        this.b = this;
                                                                    }

                                                                    /* JADX WARN: Code restructure failed: missing block: B:93:0x016b, code lost:
                                                                    
                                                                        if (r5 <= 1) goto L84;
                                                                     */
                                                                    @Override // java.lang.Runnable
                                                                    /*
                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                    */
                                                                    public final void run() {
                                                                        d4 d4Var;
                                                                        boolean z20;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        d4 d4Var2;
                                                                        boolean z21;
                                                                        switch (i54) {
                                                                            case 0:
                                                                                d4 d4Var3 = this.b;
                                                                                d4Var3.getClass();
                                                                                z5 z5Var3 = z5Var2;
                                                                                LinkedHashSet linkedHashSet2 = z5Var3.H;
                                                                                if (z5Var3.F == null || linkedHashSet2.isEmpty()) {
                                                                                    d4Var = d4Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet2.iterator();
                                                                                    int i482 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = z5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i482 = Math.min(i482, b12);
                                                                                    }
                                                                                    linkedHashSet2.clear();
                                                                                    w6 w6Var = z5Var3.F;
                                                                                    w6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        d4Var = d4Var3;
                                                                                        z20 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[w6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z20 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < w6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[w6Var.b];
                                                                                                int i492 = 0;
                                                                                                for (int i502 = 0; i502 < w6Var.b; i502++) {
                                                                                                    iArr2[i502] = i492;
                                                                                                    if (!zArr[i502]) {
                                                                                                        i492++;
                                                                                                    }
                                                                                                }
                                                                                                if (i492 == 0) {
                                                                                                    w6Var.a.rows.clear();
                                                                                                    w6Var.i();
                                                                                                    d4Var = d4Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = w6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i512 = 0;
                                                                                                    while (i512 < size2) {
                                                                                                        Object obj = arrayList2.get(i512);
                                                                                                        i512++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = w6Var.b(pagetablecell4);
                                                                                                        int a10 = w6Var.a(pagetablecell4);
                                                                                                        int o11 = w6.o(pagetablecell4);
                                                                                                        int i522 = pagetablecell4.colspan;
                                                                                                        if (i522 == 0) {
                                                                                                            i522 = 1;
                                                                                                        }
                                                                                                        int i532 = -1;
                                                                                                        d4 d4Var4 = d4Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i542 = 0;
                                                                                                        for (int i55 = b13; i55 < b13 + o11 && i55 < w6Var.b; i55++) {
                                                                                                            if (!zArr[i55]) {
                                                                                                                if (i532 < 0) {
                                                                                                                    i532 = i55;
                                                                                                                }
                                                                                                                i542++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i532 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i532], a10, i542, i522});
                                                                                                        }
                                                                                                        d4Var3 = d4Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    d4Var = d4Var3;
                                                                                                    w6Var.j(identityHashMap, i492);
                                                                                                    w6Var.i();
                                                                                                    z20 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z5Var3.x();
                                                                                    if (z20) {
                                                                                        z5Var3.s(i482, 0);
                                                                                    }
                                                                                }
                                                                                d4Var.P2();
                                                                                break;
                                                                            case 1:
                                                                                d4 d4Var5 = this.b;
                                                                                d4Var5.getClass();
                                                                                a row = z5Var2.getRow();
                                                                                d4Var5.P2();
                                                                                if (row != null) {
                                                                                    o2 o2Var = d4Var5.Q3;
                                                                                    if (o2Var != null) {
                                                                                        o2Var.d();
                                                                                    }
                                                                                    d4Var5.u4(row);
                                                                                    o2 o2Var2 = d4Var5.Q3;
                                                                                    if (o2Var2 != null) {
                                                                                        o2Var2.h();
                                                                                    }
                                                                                    b4 b4Var = d4Var5.o3;
                                                                                    if (b4Var != null) {
                                                                                        b4Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                z5 z5Var4 = z5Var2;
                                                                                LinkedHashSet linkedHashSet3 = z5Var4.H;
                                                                                if (z5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet3.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i56 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        int i58 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i57 = Math.min(i57, z5Var4.F.b(pagetablecell5));
                                                                                            i58 = Math.min(i58, z5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet3.clear();
                                                                                        w6 w6Var2 = z5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = w6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i59 = -1;
                                                                                            int i60 = -1;
                                                                                            int i61 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = w6Var2.b(pagetablecell6);
                                                                                                int a11 = w6Var2.a(pagetablecell6);
                                                                                                int o12 = w6.o(pagetablecell6);
                                                                                                int i62 = pagetablecell6.colspan;
                                                                                                if (i62 == 0) {
                                                                                                    i62 = 1;
                                                                                                }
                                                                                                i56 = Math.min(i56, b14);
                                                                                                i61 = Math.min(i61, a11);
                                                                                                i59 = Math.max(i59, (b14 + o12) - 1);
                                                                                                i60 = Math.max(i60, (a11 + i62) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i63 = i56;
                                                                                            while (true) {
                                                                                                if (i63 <= i59) {
                                                                                                    for (int i64 = i61; i64 <= i60; i64++) {
                                                                                                        if (i63 >= 0 && i64 >= 0 && i63 < w6Var2.b && i64 < w6Var2.c) {
                                                                                                            hashSet9.add(w6Var2.d[i63][i64]);
                                                                                                        }
                                                                                                    }
                                                                                                    i63++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new v6(w6Var2, 0));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i65 = 0;
                                                                                                    while (i65 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i65);
                                                                                                        i65++;
                                                                                                        String g10 = w6.g((TL_iv.pageTableCell) obj2);
                                                                                                        if (g10.isEmpty()) {
                                                                                                            arrayList = arrayList3;
                                                                                                        } else {
                                                                                                            if (sb2.length() > 0) {
                                                                                                                arrayList = arrayList3;
                                                                                                                sb2.append("\n");
                                                                                                            } else {
                                                                                                                arrayList = arrayList3;
                                                                                                            }
                                                                                                            sb2.append(g10);
                                                                                                        }
                                                                                                        arrayList3 = arrayList;
                                                                                                    }
                                                                                                    TL_iv.pageTableCell pagetablecell7 = w6Var2.d[i56][i61];
                                                                                                    int i66 = (i60 - i61) + 1;
                                                                                                    int i67 = (i59 - i56) + 1;
                                                                                                    if (i66 <= 1) {
                                                                                                        i66 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i66;
                                                                                                    int i68 = i67 > 1 ? i67 : 0;
                                                                                                    pagetablecell7.rowspan = i68;
                                                                                                    int i69 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i66 > 0 ? i69 | 2 : i69 & (-3);
                                                                                                    int i70 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i68 > 0 ? i70 | 4 : i70 & (-5);
                                                                                                    w6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = w6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    w6Var2.i();
                                                                                                    z5Var4.x();
                                                                                                    z5Var4.w.invalidate();
                                                                                                    z5Var4.s(i57, i58);
                                                                                                    z5Var4.v();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet3.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 3:
                                                                                z5 z5Var5 = z5Var2;
                                                                                LinkedHashSet linkedHashSet4 = z5Var5.H;
                                                                                if (z5Var5.F != null && linkedHashSet4.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                                    if (w6.n(pagetablecell9) <= 1) {
                                                                                        int i71 = pagetablecell9.rowspan;
                                                                                        if (i71 == 0) {
                                                                                            i71 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = z5Var5.F.b(pagetablecell9);
                                                                                    int a12 = z5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet4.clear();
                                                                                    if (z5Var5.F.p(pagetablecell9)) {
                                                                                        z5Var5.x();
                                                                                        z5Var5.w.invalidate();
                                                                                        z5Var5.s(b15, a12);
                                                                                        z5Var5.v();
                                                                                    } else {
                                                                                        linkedHashSet4.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 4:
                                                                                z5Var2.j(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 5:
                                                                                z5Var2.j(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 6:
                                                                                z5Var2.k(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 7:
                                                                                z5Var2.k(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            default:
                                                                                d4 d4Var6 = this.b;
                                                                                d4Var6.getClass();
                                                                                z5 z5Var6 = z5Var2;
                                                                                LinkedHashSet linkedHashSet5 = z5Var6.H;
                                                                                if (z5Var6.F == null || linkedHashSet5.isEmpty()) {
                                                                                    d4Var2 = d4Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet5.iterator();
                                                                                    int i72 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = z5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i72 = Math.min(i72, a13);
                                                                                    }
                                                                                    linkedHashSet5.clear();
                                                                                    w6 w6Var3 = z5Var6.F;
                                                                                    w6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        d4Var2 = d4Var6;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[w6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < w6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[w6Var3.c];
                                                                                                int i73 = 0;
                                                                                                for (int i74 = 0; i74 < w6Var3.c; i74++) {
                                                                                                    iArr4[i74] = i73;
                                                                                                    if (!zArr2[i74]) {
                                                                                                        i73++;
                                                                                                    }
                                                                                                }
                                                                                                if (i73 == 0) {
                                                                                                    w6Var3.a.rows.clear();
                                                                                                    w6Var3.i();
                                                                                                    d4Var2 = d4Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = w6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i75 = 0;
                                                                                                    while (i75 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i75);
                                                                                                        i75++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = w6Var3.b(pagetablecell10);
                                                                                                        int a14 = w6Var3.a(pagetablecell10);
                                                                                                        int o13 = w6.o(pagetablecell10);
                                                                                                        int i76 = pagetablecell10.colspan;
                                                                                                        if (i76 == 0) {
                                                                                                            i76 = 1;
                                                                                                        }
                                                                                                        int i77 = -1;
                                                                                                        d4 d4Var7 = d4Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i78 = 0;
                                                                                                        for (int i79 = a14; i79 < a14 + i76 && i79 < w6Var3.c; i79++) {
                                                                                                            if (!zArr3[i79]) {
                                                                                                                if (i77 < 0) {
                                                                                                                    i77 = i79;
                                                                                                                }
                                                                                                                i78++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i77 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i77], o13, i78});
                                                                                                        }
                                                                                                        d4Var6 = d4Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    d4Var2 = d4Var6;
                                                                                                    w6Var3.j(identityHashMap2, w6Var3.b);
                                                                                                    w6Var3.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z5Var6.x();
                                                                                    if (z21) {
                                                                                        z5Var6.s(0, i72);
                                                                                    }
                                                                                }
                                                                                d4Var2.P2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, r92);
                                                            }
                                                            if (z14) {
                                                                U.c(R.drawable.iv_table_remove, cd.L0(2131754034, str2), new Runnable(this) { // from class: bi.t2
                                                                    public final /* synthetic */ d4 b;

                                                                    {
                                                                        this.b = this;
                                                                    }

                                                                    /* JADX WARN: Code restructure failed: missing block: B:93:0x016b, code lost:
                                                                    
                                                                        if (r5 <= 1) goto L84;
                                                                     */
                                                                    @Override // java.lang.Runnable
                                                                    /*
                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                    */
                                                                    public final void run() {
                                                                        d4 d4Var;
                                                                        boolean z20;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        d4 d4Var2;
                                                                        boolean z21;
                                                                        switch (r92) {
                                                                            case 0:
                                                                                d4 d4Var3 = this.b;
                                                                                d4Var3.getClass();
                                                                                z5 z5Var3 = z5Var2;
                                                                                LinkedHashSet linkedHashSet2 = z5Var3.H;
                                                                                if (z5Var3.F == null || linkedHashSet2.isEmpty()) {
                                                                                    d4Var = d4Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet2.iterator();
                                                                                    int i482 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = z5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i482 = Math.min(i482, b12);
                                                                                    }
                                                                                    linkedHashSet2.clear();
                                                                                    w6 w6Var = z5Var3.F;
                                                                                    w6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        d4Var = d4Var3;
                                                                                        z20 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[w6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z20 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < w6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[w6Var.b];
                                                                                                int i492 = 0;
                                                                                                for (int i502 = 0; i502 < w6Var.b; i502++) {
                                                                                                    iArr2[i502] = i492;
                                                                                                    if (!zArr[i502]) {
                                                                                                        i492++;
                                                                                                    }
                                                                                                }
                                                                                                if (i492 == 0) {
                                                                                                    w6Var.a.rows.clear();
                                                                                                    w6Var.i();
                                                                                                    d4Var = d4Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = w6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i512 = 0;
                                                                                                    while (i512 < size2) {
                                                                                                        Object obj = arrayList2.get(i512);
                                                                                                        i512++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = w6Var.b(pagetablecell4);
                                                                                                        int a10 = w6Var.a(pagetablecell4);
                                                                                                        int o11 = w6.o(pagetablecell4);
                                                                                                        int i522 = pagetablecell4.colspan;
                                                                                                        if (i522 == 0) {
                                                                                                            i522 = 1;
                                                                                                        }
                                                                                                        int i532 = -1;
                                                                                                        d4 d4Var4 = d4Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i542 = 0;
                                                                                                        for (int i55 = b13; i55 < b13 + o11 && i55 < w6Var.b; i55++) {
                                                                                                            if (!zArr[i55]) {
                                                                                                                if (i532 < 0) {
                                                                                                                    i532 = i55;
                                                                                                                }
                                                                                                                i542++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i532 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i532], a10, i542, i522});
                                                                                                        }
                                                                                                        d4Var3 = d4Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    d4Var = d4Var3;
                                                                                                    w6Var.j(identityHashMap, i492);
                                                                                                    w6Var.i();
                                                                                                    z20 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z5Var3.x();
                                                                                    if (z20) {
                                                                                        z5Var3.s(i482, 0);
                                                                                    }
                                                                                }
                                                                                d4Var.P2();
                                                                                break;
                                                                            case 1:
                                                                                d4 d4Var5 = this.b;
                                                                                d4Var5.getClass();
                                                                                a row = z5Var2.getRow();
                                                                                d4Var5.P2();
                                                                                if (row != null) {
                                                                                    o2 o2Var = d4Var5.Q3;
                                                                                    if (o2Var != null) {
                                                                                        o2Var.d();
                                                                                    }
                                                                                    d4Var5.u4(row);
                                                                                    o2 o2Var2 = d4Var5.Q3;
                                                                                    if (o2Var2 != null) {
                                                                                        o2Var2.h();
                                                                                    }
                                                                                    b4 b4Var = d4Var5.o3;
                                                                                    if (b4Var != null) {
                                                                                        b4Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                z5 z5Var4 = z5Var2;
                                                                                LinkedHashSet linkedHashSet3 = z5Var4.H;
                                                                                if (z5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet3.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i56 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        int i58 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i57 = Math.min(i57, z5Var4.F.b(pagetablecell5));
                                                                                            i58 = Math.min(i58, z5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet3.clear();
                                                                                        w6 w6Var2 = z5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = w6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i59 = -1;
                                                                                            int i60 = -1;
                                                                                            int i61 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = w6Var2.b(pagetablecell6);
                                                                                                int a11 = w6Var2.a(pagetablecell6);
                                                                                                int o12 = w6.o(pagetablecell6);
                                                                                                int i62 = pagetablecell6.colspan;
                                                                                                if (i62 == 0) {
                                                                                                    i62 = 1;
                                                                                                }
                                                                                                i56 = Math.min(i56, b14);
                                                                                                i61 = Math.min(i61, a11);
                                                                                                i59 = Math.max(i59, (b14 + o12) - 1);
                                                                                                i60 = Math.max(i60, (a11 + i62) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i63 = i56;
                                                                                            while (true) {
                                                                                                if (i63 <= i59) {
                                                                                                    for (int i64 = i61; i64 <= i60; i64++) {
                                                                                                        if (i63 >= 0 && i64 >= 0 && i63 < w6Var2.b && i64 < w6Var2.c) {
                                                                                                            hashSet9.add(w6Var2.d[i63][i64]);
                                                                                                        }
                                                                                                    }
                                                                                                    i63++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new v6(w6Var2, 0));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i65 = 0;
                                                                                                    while (i65 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i65);
                                                                                                        i65++;
                                                                                                        String g10 = w6.g((TL_iv.pageTableCell) obj2);
                                                                                                        if (g10.isEmpty()) {
                                                                                                            arrayList = arrayList3;
                                                                                                        } else {
                                                                                                            if (sb2.length() > 0) {
                                                                                                                arrayList = arrayList3;
                                                                                                                sb2.append("\n");
                                                                                                            } else {
                                                                                                                arrayList = arrayList3;
                                                                                                            }
                                                                                                            sb2.append(g10);
                                                                                                        }
                                                                                                        arrayList3 = arrayList;
                                                                                                    }
                                                                                                    TL_iv.pageTableCell pagetablecell7 = w6Var2.d[i56][i61];
                                                                                                    int i66 = (i60 - i61) + 1;
                                                                                                    int i67 = (i59 - i56) + 1;
                                                                                                    if (i66 <= 1) {
                                                                                                        i66 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i66;
                                                                                                    int i68 = i67 > 1 ? i67 : 0;
                                                                                                    pagetablecell7.rowspan = i68;
                                                                                                    int i69 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i66 > 0 ? i69 | 2 : i69 & (-3);
                                                                                                    int i70 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i68 > 0 ? i70 | 4 : i70 & (-5);
                                                                                                    w6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = w6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    w6Var2.i();
                                                                                                    z5Var4.x();
                                                                                                    z5Var4.w.invalidate();
                                                                                                    z5Var4.s(i57, i58);
                                                                                                    z5Var4.v();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet3.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 3:
                                                                                z5 z5Var5 = z5Var2;
                                                                                LinkedHashSet linkedHashSet4 = z5Var5.H;
                                                                                if (z5Var5.F != null && linkedHashSet4.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                                    if (w6.n(pagetablecell9) <= 1) {
                                                                                        int i71 = pagetablecell9.rowspan;
                                                                                        if (i71 == 0) {
                                                                                            i71 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = z5Var5.F.b(pagetablecell9);
                                                                                    int a12 = z5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet4.clear();
                                                                                    if (z5Var5.F.p(pagetablecell9)) {
                                                                                        z5Var5.x();
                                                                                        z5Var5.w.invalidate();
                                                                                        z5Var5.s(b15, a12);
                                                                                        z5Var5.v();
                                                                                    } else {
                                                                                        linkedHashSet4.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 4:
                                                                                z5Var2.j(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 5:
                                                                                z5Var2.j(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 6:
                                                                                z5Var2.k(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 7:
                                                                                z5Var2.k(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            default:
                                                                                d4 d4Var6 = this.b;
                                                                                d4Var6.getClass();
                                                                                z5 z5Var6 = z5Var2;
                                                                                LinkedHashSet linkedHashSet5 = z5Var6.H;
                                                                                if (z5Var6.F == null || linkedHashSet5.isEmpty()) {
                                                                                    d4Var2 = d4Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet5.iterator();
                                                                                    int i72 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = z5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i72 = Math.min(i72, a13);
                                                                                    }
                                                                                    linkedHashSet5.clear();
                                                                                    w6 w6Var3 = z5Var6.F;
                                                                                    w6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        d4Var2 = d4Var6;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[w6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < w6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[w6Var3.c];
                                                                                                int i73 = 0;
                                                                                                for (int i74 = 0; i74 < w6Var3.c; i74++) {
                                                                                                    iArr4[i74] = i73;
                                                                                                    if (!zArr2[i74]) {
                                                                                                        i73++;
                                                                                                    }
                                                                                                }
                                                                                                if (i73 == 0) {
                                                                                                    w6Var3.a.rows.clear();
                                                                                                    w6Var3.i();
                                                                                                    d4Var2 = d4Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = w6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i75 = 0;
                                                                                                    while (i75 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i75);
                                                                                                        i75++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = w6Var3.b(pagetablecell10);
                                                                                                        int a14 = w6Var3.a(pagetablecell10);
                                                                                                        int o13 = w6.o(pagetablecell10);
                                                                                                        int i76 = pagetablecell10.colspan;
                                                                                                        if (i76 == 0) {
                                                                                                            i76 = 1;
                                                                                                        }
                                                                                                        int i77 = -1;
                                                                                                        d4 d4Var7 = d4Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i78 = 0;
                                                                                                        for (int i79 = a14; i79 < a14 + i76 && i79 < w6Var3.c; i79++) {
                                                                                                            if (!zArr3[i79]) {
                                                                                                                if (i77 < 0) {
                                                                                                                    i77 = i79;
                                                                                                                }
                                                                                                                i78++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i77 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i77], o13, i78});
                                                                                                        }
                                                                                                        d4Var6 = d4Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    d4Var2 = d4Var6;
                                                                                                    w6Var3.j(identityHashMap2, w6Var3.b);
                                                                                                    w6Var3.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z5Var6.x();
                                                                                    if (z21) {
                                                                                        z5Var6.s(0, i72);
                                                                                    }
                                                                                }
                                                                                d4Var2.P2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, r92);
                                                                U.o();
                                                                final int i55 = 0;
                                                                U.i(new Runnable() { // from class: bi.u2
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i55) {
                                                                            case 0:
                                                                                U.n0 = true;
                                                                                boolean z20 = !model.a.bordered;
                                                                                z5 z5Var3 = z5Var2;
                                                                                w6 w6Var = z5Var3.F;
                                                                                if (w6Var != null) {
                                                                                    TL_iv.pageBlockTable pageblocktable2 = w6Var.a;
                                                                                    if (pageblocktable2.bordered != z20) {
                                                                                        pageblocktable2.bordered = z20;
                                                                                        z5Var3.w.invalidate();
                                                                                        k3 k3Var = z5Var3.E;
                                                                                        if (k3Var != null && z5Var3.a != null) {
                                                                                            k3Var.a();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                r4[0].setChecked(z20);
                                                                                break;
                                                                            default:
                                                                                U.n0 = true;
                                                                                boolean z21 = !model.a.compact;
                                                                                z5 z5Var4 = z5Var2;
                                                                                w6 w6Var2 = z5Var4.F;
                                                                                if (w6Var2 != null) {
                                                                                    TL_iv.pageBlockTable pageblocktable3 = w6Var2.a;
                                                                                    if (pageblocktable3.compact != z21) {
                                                                                        pageblocktable3.compact = z21;
                                                                                        b6 b6Var = z5Var4.w;
                                                                                        if (b6Var.a != null) {
                                                                                            for (int i56 = 0; i56 < b6Var.getChildCount(); i56++) {
                                                                                                View childAt = b6Var.getChildAt(i56);
                                                                                                if (childAt instanceof c6) {
                                                                                                    ((c6) childAt).setCompact(b6Var.a.a.compact);
                                                                                                }
                                                                                            }
                                                                                            b6Var.requestLayout();
                                                                                            b6Var.invalidate();
                                                                                        }
                                                                                        z5Var4.x.requestLayout();
                                                                                        z5Var4.requestLayout();
                                                                                        k3 k3Var2 = z5Var4.E;
                                                                                        if (k3Var2 != null && z5Var4.a != null) {
                                                                                            k3Var2.a();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                r4[1].setChecked(z21);
                                                                                break;
                                                                        }
                                                                    }
                                                                }, cd.L0(2131753991, str2), pageblocktable.bordered);
                                                                final int i56 = 1;
                                                                z5Var2 = z5Var;
                                                                U.i(new Runnable() { // from class: bi.u2
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i56) {
                                                                            case 0:
                                                                                U.n0 = true;
                                                                                boolean z20 = !model.a.bordered;
                                                                                z5 z5Var3 = z5Var2;
                                                                                w6 w6Var = z5Var3.F;
                                                                                if (w6Var != null) {
                                                                                    TL_iv.pageBlockTable pageblocktable2 = w6Var.a;
                                                                                    if (pageblocktable2.bordered != z20) {
                                                                                        pageblocktable2.bordered = z20;
                                                                                        z5Var3.w.invalidate();
                                                                                        k3 k3Var = z5Var3.E;
                                                                                        if (k3Var != null && z5Var3.a != null) {
                                                                                            k3Var.a();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                r4[0].setChecked(z20);
                                                                                break;
                                                                            default:
                                                                                U.n0 = true;
                                                                                boolean z21 = !model.a.compact;
                                                                                z5 z5Var4 = z5Var2;
                                                                                w6 w6Var2 = z5Var4.F;
                                                                                if (w6Var2 != null) {
                                                                                    TL_iv.pageBlockTable pageblocktable3 = w6Var2.a;
                                                                                    if (pageblocktable3.compact != z21) {
                                                                                        pageblocktable3.compact = z21;
                                                                                        b6 b6Var = z5Var4.w;
                                                                                        if (b6Var.a != null) {
                                                                                            for (int i562 = 0; i562 < b6Var.getChildCount(); i562++) {
                                                                                                View childAt = b6Var.getChildAt(i562);
                                                                                                if (childAt instanceof c6) {
                                                                                                    ((c6) childAt).setCompact(b6Var.a.a.compact);
                                                                                                }
                                                                                            }
                                                                                            b6Var.requestLayout();
                                                                                            b6Var.invalidate();
                                                                                        }
                                                                                        z5Var4.x.requestLayout();
                                                                                        z5Var4.requestLayout();
                                                                                        k3 k3Var2 = z5Var4.E;
                                                                                        if (k3Var2 != null && z5Var4.a != null) {
                                                                                            k3Var2.a();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                r4[1].setChecked(z21);
                                                                                break;
                                                                        }
                                                                    }
                                                                }, cd.L0(2131753990, str2), pageblocktable.compact);
                                                                final org.telegram.ui.ActionBar.b1[] b1VarArr = {U.y(), U.y()};
                                                            }
                                                            U.p = new a3.l0(this, U, z5Var2, 12);
                                                            this.q4 = U;
                                                            U.Z();
                                                        }
                                                        z15 = false;
                                                        if (!z15) {
                                                        }
                                                        U.c(!z15 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, L0, new ag.j0(this, z5Var2, z15, 3), false);
                                                        if (i17 == 0) {
                                                        }
                                                        if (i19 != 0) {
                                                        }
                                                        if (i15 != 0) {
                                                        }
                                                        if (i16 != 0) {
                                                        }
                                                        if (i18 == 0) {
                                                        }
                                                        if (i20 != 0) {
                                                        }
                                                        if (z14) {
                                                        }
                                                        U.p = new a3.l0(this, U, z5Var2, 12);
                                                        this.q4 = U;
                                                        U.Z();
                                                    }
                                                }
                                                i14 = 0;
                                                if (z13) {
                                                }
                                                if (z13) {
                                                }
                                                z60Var = this.q4;
                                                i17 = i10;
                                                if (z60Var != null) {
                                                }
                                                L = org.telegram.messenger.i0.L(((i17 + 1 + i11 + (i15 != 0 ? 2 : 0) + (i16 != 0 ? 2 : 0) + i14 + i13 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                                FrameLayout S422 = S4(z5Var2, false);
                                                i18 = i14;
                                                iArr = new int[2];
                                                S422.getLocationOnScreen(iArr);
                                                if (((iArr[i12] - L) - org.telegram.messenger.i0.L(8.0f) >= org.telegram.messenger.i0.L(8.0f) + org.telegram.messenger.i0.m ? i12 : 0) != 0) {
                                                }
                                                final z60 U2 = this.o3.U(S4);
                                                U2.s = 0;
                                                U2.t = false;
                                                U2.Z = r12;
                                                LinearLayout linearLayout3 = new LinearLayout(getContext());
                                                linearLayout3.setMinimumWidth(org.telegram.messenger.i0.L(208.0f));
                                                linearLayout3.setOrientation(r12);
                                                TextView textView2 = new TextView(getContext());
                                                textView2.setText(cd.L0(2131754057, null));
                                                textView2.setTextSize(1, 12.0f);
                                                textView2.setGravity(17);
                                                int i412 = org.telegram.ui.ActionBar.t6.y6;
                                                org.telegram.ui.ActionBar.p6 p6Var2 = this.n3;
                                                a7.V(textView2, i412, p6Var2);
                                                linearLayout3.addView(textView2, w7.b6.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                                LinearLayout linearLayout22 = new LinearLayout(getContext());
                                                i19 = i11;
                                                i20 = i13;
                                                boolean z182 = z10;
                                                linearLayout22.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
                                                linearLayout22.setOrientation(0);
                                                linearLayout3.addView(linearLayout22, w7.b6.r(-2, -2, 17));
                                                g2 g2Var7 = new g2(R.drawable.iv_align_horiz_left, getContext(), p6Var2);
                                                g2Var7.e = 4;
                                                g2Var7.updateColors();
                                                g2Var7.b();
                                                int i422 = org.telegram.ui.ActionBar.t6.G8;
                                                g2Var7.c(i422);
                                                linearLayout22.addView(g2Var7, w7.b6.o(32, 32));
                                                g2 g2Var22 = new g2(R.drawable.iv_align_horiz_middle, getContext(), p6Var2);
                                                g2Var22.e = 4;
                                                g2Var22.updateColors();
                                                g2Var22.b();
                                                g2Var22.c(i422);
                                                linearLayout22.addView(g2Var22, w7.b6.o(32, 32));
                                                g2 g2Var32 = new g2(R.drawable.iv_align_horiz_right, getContext(), p6Var2);
                                                g2Var32.e = 4;
                                                g2Var32.updateColors();
                                                g2Var32.b();
                                                g2Var32.c(i422);
                                                final g2[] g2VarArr3 = {g2Var7, g2Var22, g2Var32};
                                                boolean z192 = z11;
                                                linearLayout22.addView(g2Var32, w7.b6.o(32, 32));
                                                z14 = z12;
                                                linearLayout22.addView(new Space(getContext()), w7.b6.o(8, 0));
                                                g2 g2Var42 = new g2(R.drawable.iv_align_vert_top, getContext(), p6Var2);
                                                g2Var42.e = 4;
                                                g2Var42.updateColors();
                                                g2Var42.b();
                                                g2Var42.c(i422);
                                                linearLayout22.addView(g2Var42, w7.b6.o(32, 32));
                                                g2 g2Var52 = new g2(R.drawable.iv_align_vert_middle, getContext(), p6Var2);
                                                g2Var52.e = 4;
                                                g2Var52.updateColors();
                                                g2Var52.b();
                                                g2Var52.c(i422);
                                                linearLayout22.addView(g2Var52, w7.b6.o(32, 32));
                                                g2 g2Var62 = new g2(R.drawable.iv_align_vert_bottom, getContext(), p6Var2);
                                                g2Var62.e = 4;
                                                g2Var62.updateColors();
                                                g2Var62.b();
                                                g2Var62.c(i422);
                                                final g2[] g2VarArr22 = {g2Var42, g2Var52, g2Var62};
                                                linearLayout22.addView(g2Var62, w7.b6.o(32, 32));
                                                U2.q(linearLayout3);
                                                it3 = linkedHashSet.iterator();
                                                int i432 = -1;
                                                while (true) {
                                                    if (!it3.hasNext()) {
                                                    }
                                                }
                                                it4 = linkedHashSet.iterator();
                                                int i442 = -1;
                                                while (true) {
                                                    if (!it4.hasNext()) {
                                                    }
                                                }
                                                i21 = 0;
                                                while (i21 < 3) {
                                                }
                                                i23 = 0;
                                                while (i23 < 3) {
                                                }
                                                while (i24 < 3) {
                                                }
                                                i25 = 0;
                                                while (i25 < i22) {
                                                }
                                                U2.o();
                                                U2.S = 208;
                                                if (!linkedHashSet.isEmpty()) {
                                                }
                                                z15 = false;
                                                if (!z15) {
                                                }
                                                U2.c(!z15 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, L0, new ag.j0(this, z5Var2, z15, 3), false);
                                                if (i17 == 0) {
                                                }
                                                if (i19 != 0) {
                                                }
                                                if (i15 != 0) {
                                                }
                                                if (i16 != 0) {
                                                }
                                                if (i18 == 0) {
                                                }
                                                if (i20 != 0) {
                                                }
                                                if (z14) {
                                                }
                                                U2.p = new a3.l0(this, U2, z5Var2, 12);
                                                this.q4 = U2;
                                                U2.Z();
                                            }
                                        }
                                        i13 = 0;
                                        if (z11) {
                                            hashSet3 = new HashSet();
                                            it5 = selectedCells.iterator();
                                            while (it5.hasNext()) {
                                            }
                                            if (hashSet3.size() < model.c) {
                                            }
                                        }
                                        i14 = 0;
                                        if (z13) {
                                        }
                                        if (z13) {
                                        }
                                        z60Var = this.q4;
                                        i17 = i10;
                                        if (z60Var != null) {
                                        }
                                        L = org.telegram.messenger.i0.L(((i17 + 1 + i11 + (i15 != 0 ? 2 : 0) + (i16 != 0 ? 2 : 0) + i14 + i13 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                        FrameLayout S4222 = S4(z5Var2, false);
                                        i18 = i14;
                                        iArr = new int[2];
                                        S4222.getLocationOnScreen(iArr);
                                        if (((iArr[i12] - L) - org.telegram.messenger.i0.L(8.0f) >= org.telegram.messenger.i0.L(8.0f) + org.telegram.messenger.i0.m ? i12 : 0) != 0) {
                                        }
                                        final z60 U22 = this.o3.U(S4);
                                        U22.s = 0;
                                        U22.t = false;
                                        U22.Z = r12;
                                        LinearLayout linearLayout32 = new LinearLayout(getContext());
                                        linearLayout32.setMinimumWidth(org.telegram.messenger.i0.L(208.0f));
                                        linearLayout32.setOrientation(r12);
                                        TextView textView22 = new TextView(getContext());
                                        textView22.setText(cd.L0(2131754057, null));
                                        textView22.setTextSize(1, 12.0f);
                                        textView22.setGravity(17);
                                        int i4122 = org.telegram.ui.ActionBar.t6.y6;
                                        org.telegram.ui.ActionBar.p6 p6Var22 = this.n3;
                                        a7.V(textView22, i4122, p6Var22);
                                        linearLayout32.addView(textView22, w7.b6.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                        LinearLayout linearLayout222 = new LinearLayout(getContext());
                                        i19 = i11;
                                        i20 = i13;
                                        boolean z1822 = z10;
                                        linearLayout222.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
                                        linearLayout222.setOrientation(0);
                                        linearLayout32.addView(linearLayout222, w7.b6.r(-2, -2, 17));
                                        g2 g2Var72 = new g2(R.drawable.iv_align_horiz_left, getContext(), p6Var22);
                                        g2Var72.e = 4;
                                        g2Var72.updateColors();
                                        g2Var72.b();
                                        int i4222 = org.telegram.ui.ActionBar.t6.G8;
                                        g2Var72.c(i4222);
                                        linearLayout222.addView(g2Var72, w7.b6.o(32, 32));
                                        g2 g2Var222 = new g2(R.drawable.iv_align_horiz_middle, getContext(), p6Var22);
                                        g2Var222.e = 4;
                                        g2Var222.updateColors();
                                        g2Var222.b();
                                        g2Var222.c(i4222);
                                        linearLayout222.addView(g2Var222, w7.b6.o(32, 32));
                                        g2 g2Var322 = new g2(R.drawable.iv_align_horiz_right, getContext(), p6Var22);
                                        g2Var322.e = 4;
                                        g2Var322.updateColors();
                                        g2Var322.b();
                                        g2Var322.c(i4222);
                                        final g2[] g2VarArr32 = {g2Var72, g2Var222, g2Var322};
                                        boolean z1922 = z11;
                                        linearLayout222.addView(g2Var322, w7.b6.o(32, 32));
                                        z14 = z12;
                                        linearLayout222.addView(new Space(getContext()), w7.b6.o(8, 0));
                                        g2 g2Var422 = new g2(R.drawable.iv_align_vert_top, getContext(), p6Var22);
                                        g2Var422.e = 4;
                                        g2Var422.updateColors();
                                        g2Var422.b();
                                        g2Var422.c(i4222);
                                        linearLayout222.addView(g2Var422, w7.b6.o(32, 32));
                                        g2 g2Var522 = new g2(R.drawable.iv_align_vert_middle, getContext(), p6Var22);
                                        g2Var522.e = 4;
                                        g2Var522.updateColors();
                                        g2Var522.b();
                                        g2Var522.c(i4222);
                                        linearLayout222.addView(g2Var522, w7.b6.o(32, 32));
                                        g2 g2Var622 = new g2(R.drawable.iv_align_vert_bottom, getContext(), p6Var22);
                                        g2Var622.e = 4;
                                        g2Var622.updateColors();
                                        g2Var622.b();
                                        g2Var622.c(i4222);
                                        final g2[] g2VarArr222 = {g2Var422, g2Var522, g2Var622};
                                        linearLayout222.addView(g2Var622, w7.b6.o(32, 32));
                                        U22.q(linearLayout32);
                                        it3 = linkedHashSet.iterator();
                                        int i4322 = -1;
                                        while (true) {
                                            if (!it3.hasNext()) {
                                            }
                                        }
                                        it4 = linkedHashSet.iterator();
                                        int i4422 = -1;
                                        while (true) {
                                            if (!it4.hasNext()) {
                                            }
                                        }
                                        i21 = 0;
                                        while (i21 < 3) {
                                        }
                                        i23 = 0;
                                        while (i23 < 3) {
                                        }
                                        while (i24 < 3) {
                                        }
                                        i25 = 0;
                                        while (i25 < i22) {
                                        }
                                        U22.o();
                                        U22.S = 208;
                                        if (!linkedHashSet.isEmpty()) {
                                        }
                                        z15 = false;
                                        if (!z15) {
                                        }
                                        U22.c(!z15 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, L0, new ag.j0(this, z5Var2, z15, 3), false);
                                        if (i17 == 0) {
                                        }
                                        if (i19 != 0) {
                                        }
                                        if (i15 != 0) {
                                        }
                                        if (i16 != 0) {
                                        }
                                        if (i18 == 0) {
                                        }
                                        if (i20 != 0) {
                                        }
                                        if (z14) {
                                        }
                                        U22.p = new a3.l0(this, U22, z5Var2, 12);
                                        this.q4 = U22;
                                        U22.Z();
                                    }
                                    z11 = false;
                                    if (selectedCells.isEmpty()) {
                                    }
                                    z12 = false;
                                    if (z12) {
                                    }
                                    if (z10) {
                                    }
                                    i12 = 1;
                                    i13 = 0;
                                    if (z11) {
                                    }
                                    i14 = 0;
                                    if (z13) {
                                    }
                                    if (z13) {
                                    }
                                    z60Var = this.q4;
                                    i17 = i10;
                                    if (z60Var != null) {
                                    }
                                    L = org.telegram.messenger.i0.L(((i17 + 1 + i11 + (i15 != 0 ? 2 : 0) + (i16 != 0 ? 2 : 0) + i14 + i13 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                    FrameLayout S42222 = S4(z5Var2, false);
                                    i18 = i14;
                                    iArr = new int[2];
                                    S42222.getLocationOnScreen(iArr);
                                    if (((iArr[i12] - L) - org.telegram.messenger.i0.L(8.0f) >= org.telegram.messenger.i0.L(8.0f) + org.telegram.messenger.i0.m ? i12 : 0) != 0) {
                                    }
                                    final z60 U222 = this.o3.U(S4);
                                    U222.s = 0;
                                    U222.t = false;
                                    U222.Z = r12;
                                    LinearLayout linearLayout322 = new LinearLayout(getContext());
                                    linearLayout322.setMinimumWidth(org.telegram.messenger.i0.L(208.0f));
                                    linearLayout322.setOrientation(r12);
                                    TextView textView222 = new TextView(getContext());
                                    textView222.setText(cd.L0(2131754057, null));
                                    textView222.setTextSize(1, 12.0f);
                                    textView222.setGravity(17);
                                    int i41222 = org.telegram.ui.ActionBar.t6.y6;
                                    org.telegram.ui.ActionBar.p6 p6Var222 = this.n3;
                                    a7.V(textView222, i41222, p6Var222);
                                    linearLayout322.addView(textView222, w7.b6.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                    LinearLayout linearLayout2222 = new LinearLayout(getContext());
                                    i19 = i11;
                                    i20 = i13;
                                    boolean z18222 = z10;
                                    linearLayout2222.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
                                    linearLayout2222.setOrientation(0);
                                    linearLayout322.addView(linearLayout2222, w7.b6.r(-2, -2, 17));
                                    g2 g2Var722 = new g2(R.drawable.iv_align_horiz_left, getContext(), p6Var222);
                                    g2Var722.e = 4;
                                    g2Var722.updateColors();
                                    g2Var722.b();
                                    int i42222 = org.telegram.ui.ActionBar.t6.G8;
                                    g2Var722.c(i42222);
                                    linearLayout2222.addView(g2Var722, w7.b6.o(32, 32));
                                    g2 g2Var2222 = new g2(R.drawable.iv_align_horiz_middle, getContext(), p6Var222);
                                    g2Var2222.e = 4;
                                    g2Var2222.updateColors();
                                    g2Var2222.b();
                                    g2Var2222.c(i42222);
                                    linearLayout2222.addView(g2Var2222, w7.b6.o(32, 32));
                                    g2 g2Var3222 = new g2(R.drawable.iv_align_horiz_right, getContext(), p6Var222);
                                    g2Var3222.e = 4;
                                    g2Var3222.updateColors();
                                    g2Var3222.b();
                                    g2Var3222.c(i42222);
                                    final g2[] g2VarArr322 = {g2Var722, g2Var2222, g2Var3222};
                                    boolean z19222 = z11;
                                    linearLayout2222.addView(g2Var3222, w7.b6.o(32, 32));
                                    z14 = z12;
                                    linearLayout2222.addView(new Space(getContext()), w7.b6.o(8, 0));
                                    g2 g2Var4222 = new g2(R.drawable.iv_align_vert_top, getContext(), p6Var222);
                                    g2Var4222.e = 4;
                                    g2Var4222.updateColors();
                                    g2Var4222.b();
                                    g2Var4222.c(i42222);
                                    linearLayout2222.addView(g2Var4222, w7.b6.o(32, 32));
                                    g2 g2Var5222 = new g2(R.drawable.iv_align_vert_middle, getContext(), p6Var222);
                                    g2Var5222.e = 4;
                                    g2Var5222.updateColors();
                                    g2Var5222.b();
                                    g2Var5222.c(i42222);
                                    linearLayout2222.addView(g2Var5222, w7.b6.o(32, 32));
                                    g2 g2Var6222 = new g2(R.drawable.iv_align_vert_bottom, getContext(), p6Var222);
                                    g2Var6222.e = 4;
                                    g2Var6222.updateColors();
                                    g2Var6222.b();
                                    g2Var6222.c(i42222);
                                    final g2[] g2VarArr2222 = {g2Var4222, g2Var5222, g2Var6222};
                                    linearLayout2222.addView(g2Var6222, w7.b6.o(32, 32));
                                    U222.q(linearLayout322);
                                    it3 = linkedHashSet.iterator();
                                    int i43222 = -1;
                                    while (true) {
                                        if (!it3.hasNext()) {
                                        }
                                    }
                                    it4 = linkedHashSet.iterator();
                                    int i44222 = -1;
                                    while (true) {
                                        if (!it4.hasNext()) {
                                        }
                                    }
                                    i21 = 0;
                                    while (i21 < 3) {
                                    }
                                    i23 = 0;
                                    while (i23 < 3) {
                                    }
                                    while (i24 < 3) {
                                    }
                                    i25 = 0;
                                    while (i25 < i22) {
                                    }
                                    U222.o();
                                    U222.S = 208;
                                    if (!linkedHashSet.isEmpty()) {
                                    }
                                    z15 = false;
                                    if (!z15) {
                                    }
                                    U222.c(!z15 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, L0, new ag.j0(this, z5Var2, z15, 3), false);
                                    if (i17 == 0) {
                                    }
                                    if (i19 != 0) {
                                    }
                                    if (i15 != 0) {
                                    }
                                    if (i16 != 0) {
                                    }
                                    if (i18 == 0) {
                                    }
                                    if (i20 != 0) {
                                    }
                                    if (z14) {
                                    }
                                    U222.p = new a3.l0(this, U222, z5Var2, 12);
                                    this.q4 = U222;
                                    U222.Z();
                                }
                                z10 = false;
                                hashSet2 = new HashSet();
                                it2 = selectedCells.iterator();
                                while (it2.hasNext()) {
                                }
                                if (!hashSet2.isEmpty()) {
                                }
                                z11 = false;
                                if (selectedCells.isEmpty()) {
                                }
                                z12 = false;
                                if (z12) {
                                }
                                if (z10) {
                                }
                                i12 = 1;
                                i13 = 0;
                                if (z11) {
                                }
                                i14 = 0;
                                if (z13) {
                                }
                                if (z13) {
                                }
                                z60Var = this.q4;
                                i17 = i10;
                                if (z60Var != null) {
                                }
                                L = org.telegram.messenger.i0.L(((i17 + 1 + i11 + (i15 != 0 ? 2 : 0) + (i16 != 0 ? 2 : 0) + i14 + i13 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                FrameLayout S422222 = S4(z5Var2, false);
                                i18 = i14;
                                iArr = new int[2];
                                S422222.getLocationOnScreen(iArr);
                                if (((iArr[i12] - L) - org.telegram.messenger.i0.L(8.0f) >= org.telegram.messenger.i0.L(8.0f) + org.telegram.messenger.i0.m ? i12 : 0) != 0) {
                                }
                                final z60 U2222 = this.o3.U(S4);
                                U2222.s = 0;
                                U2222.t = false;
                                U2222.Z = r12;
                                LinearLayout linearLayout3222 = new LinearLayout(getContext());
                                linearLayout3222.setMinimumWidth(org.telegram.messenger.i0.L(208.0f));
                                linearLayout3222.setOrientation(r12);
                                TextView textView2222 = new TextView(getContext());
                                textView2222.setText(cd.L0(2131754057, null));
                                textView2222.setTextSize(1, 12.0f);
                                textView2222.setGravity(17);
                                int i412222 = org.telegram.ui.ActionBar.t6.y6;
                                org.telegram.ui.ActionBar.p6 p6Var2222 = this.n3;
                                a7.V(textView2222, i412222, p6Var2222);
                                linearLayout3222.addView(textView2222, w7.b6.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                LinearLayout linearLayout22222 = new LinearLayout(getContext());
                                i19 = i11;
                                i20 = i13;
                                boolean z182222 = z10;
                                linearLayout22222.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
                                linearLayout22222.setOrientation(0);
                                linearLayout3222.addView(linearLayout22222, w7.b6.r(-2, -2, 17));
                                g2 g2Var7222 = new g2(R.drawable.iv_align_horiz_left, getContext(), p6Var2222);
                                g2Var7222.e = 4;
                                g2Var7222.updateColors();
                                g2Var7222.b();
                                int i422222 = org.telegram.ui.ActionBar.t6.G8;
                                g2Var7222.c(i422222);
                                linearLayout22222.addView(g2Var7222, w7.b6.o(32, 32));
                                g2 g2Var22222 = new g2(R.drawable.iv_align_horiz_middle, getContext(), p6Var2222);
                                g2Var22222.e = 4;
                                g2Var22222.updateColors();
                                g2Var22222.b();
                                g2Var22222.c(i422222);
                                linearLayout22222.addView(g2Var22222, w7.b6.o(32, 32));
                                g2 g2Var32222 = new g2(R.drawable.iv_align_horiz_right, getContext(), p6Var2222);
                                g2Var32222.e = 4;
                                g2Var32222.updateColors();
                                g2Var32222.b();
                                g2Var32222.c(i422222);
                                final g2[] g2VarArr3222 = {g2Var7222, g2Var22222, g2Var32222};
                                boolean z192222 = z11;
                                linearLayout22222.addView(g2Var32222, w7.b6.o(32, 32));
                                z14 = z12;
                                linearLayout22222.addView(new Space(getContext()), w7.b6.o(8, 0));
                                g2 g2Var42222 = new g2(R.drawable.iv_align_vert_top, getContext(), p6Var2222);
                                g2Var42222.e = 4;
                                g2Var42222.updateColors();
                                g2Var42222.b();
                                g2Var42222.c(i422222);
                                linearLayout22222.addView(g2Var42222, w7.b6.o(32, 32));
                                g2 g2Var52222 = new g2(R.drawable.iv_align_vert_middle, getContext(), p6Var2222);
                                g2Var52222.e = 4;
                                g2Var52222.updateColors();
                                g2Var52222.b();
                                g2Var52222.c(i422222);
                                linearLayout22222.addView(g2Var52222, w7.b6.o(32, 32));
                                g2 g2Var62222 = new g2(R.drawable.iv_align_vert_bottom, getContext(), p6Var2222);
                                g2Var62222.e = 4;
                                g2Var62222.updateColors();
                                g2Var62222.b();
                                g2Var62222.c(i422222);
                                final g2[] g2VarArr22222 = {g2Var42222, g2Var52222, g2Var62222};
                                linearLayout22222.addView(g2Var62222, w7.b6.o(32, 32));
                                U2222.q(linearLayout3222);
                                it3 = linkedHashSet.iterator();
                                int i432222 = -1;
                                while (true) {
                                    if (!it3.hasNext()) {
                                    }
                                }
                                it4 = linkedHashSet.iterator();
                                int i442222 = -1;
                                while (true) {
                                    if (!it4.hasNext()) {
                                    }
                                }
                                i21 = 0;
                                while (i21 < 3) {
                                }
                                i23 = 0;
                                while (i23 < 3) {
                                }
                                while (i24 < 3) {
                                }
                                i25 = 0;
                                while (i25 < i22) {
                                }
                                U2222.o();
                                U2222.S = 208;
                                if (!linkedHashSet.isEmpty()) {
                                }
                                z15 = false;
                                if (!z15) {
                                }
                                U2222.c(!z15 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, L0, new ag.j0(this, z5Var2, z15, 3), false);
                                if (i17 == 0) {
                                }
                                if (i19 != 0) {
                                }
                                if (i15 != 0) {
                                }
                                if (i16 != 0) {
                                }
                                if (i18 == 0) {
                                }
                                if (i20 != 0) {
                                }
                                if (z14) {
                                }
                                U2222.p = new a3.l0(this, U2222, z5Var2, 12);
                                this.q4 = U2222;
                                U2222.Z();
                            }
                        }
                    }
                    z16 = true;
                    if (z16) {
                    }
                }
                i11 = 0;
                hashSet = new HashSet();
                it = selectedCells.iterator();
                while (it.hasNext()) {
                }
                if (!hashSet.isEmpty()) {
                }
                z10 = false;
                hashSet2 = new HashSet();
                it2 = selectedCells.iterator();
                while (it2.hasNext()) {
                }
                if (!hashSet2.isEmpty()) {
                }
                z11 = false;
                if (selectedCells.isEmpty()) {
                }
                z12 = false;
                if (z12) {
                }
                if (z10) {
                }
                i12 = 1;
                i13 = 0;
                if (z11) {
                }
                i14 = 0;
                if (z13) {
                }
                if (z13) {
                }
                z60Var = this.q4;
                i17 = i10;
                if (z60Var != null) {
                }
                L = org.telegram.messenger.i0.L(((i17 + 1 + i11 + (i15 != 0 ? 2 : 0) + (i16 != 0 ? 2 : 0) + i14 + i13 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                FrameLayout S4222222 = S4(z5Var2, false);
                i18 = i14;
                iArr = new int[2];
                S4222222.getLocationOnScreen(iArr);
                if (((iArr[i12] - L) - org.telegram.messenger.i0.L(8.0f) >= org.telegram.messenger.i0.L(8.0f) + org.telegram.messenger.i0.m ? i12 : 0) != 0) {
                }
                final z60 U22222 = this.o3.U(S4);
                U22222.s = 0;
                U22222.t = false;
                U22222.Z = r12;
                LinearLayout linearLayout32222 = new LinearLayout(getContext());
                linearLayout32222.setMinimumWidth(org.telegram.messenger.i0.L(208.0f));
                linearLayout32222.setOrientation(r12);
                TextView textView22222 = new TextView(getContext());
                textView22222.setText(cd.L0(2131754057, null));
                textView22222.setTextSize(1, 12.0f);
                textView22222.setGravity(17);
                int i4122222 = org.telegram.ui.ActionBar.t6.y6;
                org.telegram.ui.ActionBar.p6 p6Var22222 = this.n3;
                a7.V(textView22222, i4122222, p6Var22222);
                linearLayout32222.addView(textView22222, w7.b6.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                LinearLayout linearLayout222222 = new LinearLayout(getContext());
                i19 = i11;
                i20 = i13;
                boolean z1822222 = z10;
                linearLayout222222.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
                linearLayout222222.setOrientation(0);
                linearLayout32222.addView(linearLayout222222, w7.b6.r(-2, -2, 17));
                g2 g2Var72222 = new g2(R.drawable.iv_align_horiz_left, getContext(), p6Var22222);
                g2Var72222.e = 4;
                g2Var72222.updateColors();
                g2Var72222.b();
                int i4222222 = org.telegram.ui.ActionBar.t6.G8;
                g2Var72222.c(i4222222);
                linearLayout222222.addView(g2Var72222, w7.b6.o(32, 32));
                g2 g2Var222222 = new g2(R.drawable.iv_align_horiz_middle, getContext(), p6Var22222);
                g2Var222222.e = 4;
                g2Var222222.updateColors();
                g2Var222222.b();
                g2Var222222.c(i4222222);
                linearLayout222222.addView(g2Var222222, w7.b6.o(32, 32));
                g2 g2Var322222 = new g2(R.drawable.iv_align_horiz_right, getContext(), p6Var22222);
                g2Var322222.e = 4;
                g2Var322222.updateColors();
                g2Var322222.b();
                g2Var322222.c(i4222222);
                final g2[] g2VarArr32222 = {g2Var72222, g2Var222222, g2Var322222};
                boolean z1922222 = z11;
                linearLayout222222.addView(g2Var322222, w7.b6.o(32, 32));
                z14 = z12;
                linearLayout222222.addView(new Space(getContext()), w7.b6.o(8, 0));
                g2 g2Var422222 = new g2(R.drawable.iv_align_vert_top, getContext(), p6Var22222);
                g2Var422222.e = 4;
                g2Var422222.updateColors();
                g2Var422222.b();
                g2Var422222.c(i4222222);
                linearLayout222222.addView(g2Var422222, w7.b6.o(32, 32));
                g2 g2Var522222 = new g2(R.drawable.iv_align_vert_middle, getContext(), p6Var22222);
                g2Var522222.e = 4;
                g2Var522222.updateColors();
                g2Var522222.b();
                g2Var522222.c(i4222222);
                linearLayout222222.addView(g2Var522222, w7.b6.o(32, 32));
                g2 g2Var622222 = new g2(R.drawable.iv_align_vert_bottom, getContext(), p6Var22222);
                g2Var622222.e = 4;
                g2Var622222.updateColors();
                g2Var622222.b();
                g2Var622222.c(i4222222);
                final g2[] g2VarArr222222 = {g2Var422222, g2Var522222, g2Var622222};
                linearLayout222222.addView(g2Var622222, w7.b6.o(32, 32));
                U22222.q(linearLayout32222);
                it3 = linkedHashSet.iterator();
                int i4322222 = -1;
                while (true) {
                    if (!it3.hasNext()) {
                    }
                }
                it4 = linkedHashSet.iterator();
                int i4422222 = -1;
                while (true) {
                    if (!it4.hasNext()) {
                    }
                }
                i21 = 0;
                while (i21 < 3) {
                }
                i23 = 0;
                while (i23 < 3) {
                }
                while (i24 < 3) {
                }
                i25 = 0;
                while (i25 < i22) {
                }
                U22222.o();
                U22222.S = 208;
                if (!linkedHashSet.isEmpty()) {
                }
                z15 = false;
                if (!z15) {
                }
                U22222.c(!z15 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, L0, new ag.j0(this, z5Var2, z15, 3), false);
                if (i17 == 0) {
                }
                if (i19 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i18 == 0) {
                }
                if (i20 != 0) {
                }
                if (z14) {
                }
                U22222.p = new a3.l0(this, U22222, z5Var2, 12);
                this.q4 = U22222;
                U22222.Z();
            }
        }
        i10 = 0;
        if (size == 1) {
        }
        i11 = 0;
        hashSet = new HashSet();
        it = selectedCells.iterator();
        while (it.hasNext()) {
        }
        if (!hashSet.isEmpty()) {
        }
        z10 = false;
        hashSet2 = new HashSet();
        it2 = selectedCells.iterator();
        while (it2.hasNext()) {
        }
        if (!hashSet2.isEmpty()) {
        }
        z11 = false;
        if (selectedCells.isEmpty()) {
        }
        z12 = false;
        if (z12) {
        }
        if (z10) {
        }
        i12 = 1;
        i13 = 0;
        if (z11) {
        }
        i14 = 0;
        if (z13) {
        }
        if (z13) {
        }
        z60Var = this.q4;
        i17 = i10;
        if (z60Var != null) {
        }
        L = org.telegram.messenger.i0.L(((i17 + 1 + i11 + (i15 != 0 ? 2 : 0) + (i16 != 0 ? 2 : 0) + i14 + i13 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
        FrameLayout S42222222 = S4(z5Var2, false);
        i18 = i14;
        iArr = new int[2];
        S42222222.getLocationOnScreen(iArr);
        if (((iArr[i12] - L) - org.telegram.messenger.i0.L(8.0f) >= org.telegram.messenger.i0.L(8.0f) + org.telegram.messenger.i0.m ? i12 : 0) != 0) {
        }
        final z60 U222222 = this.o3.U(S4);
        U222222.s = 0;
        U222222.t = false;
        U222222.Z = r12;
        LinearLayout linearLayout322222 = new LinearLayout(getContext());
        linearLayout322222.setMinimumWidth(org.telegram.messenger.i0.L(208.0f));
        linearLayout322222.setOrientation(r12);
        TextView textView222222 = new TextView(getContext());
        textView222222.setText(cd.L0(2131754057, null));
        textView222222.setTextSize(1, 12.0f);
        textView222222.setGravity(17);
        int i41222222 = org.telegram.ui.ActionBar.t6.y6;
        org.telegram.ui.ActionBar.p6 p6Var222222 = this.n3;
        a7.V(textView222222, i41222222, p6Var222222);
        linearLayout322222.addView(textView222222, w7.b6.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
        LinearLayout linearLayout2222222 = new LinearLayout(getContext());
        i19 = i11;
        i20 = i13;
        boolean z18222222 = z10;
        linearLayout2222222.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        linearLayout2222222.setOrientation(0);
        linearLayout322222.addView(linearLayout2222222, w7.b6.r(-2, -2, 17));
        g2 g2Var722222 = new g2(R.drawable.iv_align_horiz_left, getContext(), p6Var222222);
        g2Var722222.e = 4;
        g2Var722222.updateColors();
        g2Var722222.b();
        int i42222222 = org.telegram.ui.ActionBar.t6.G8;
        g2Var722222.c(i42222222);
        linearLayout2222222.addView(g2Var722222, w7.b6.o(32, 32));
        g2 g2Var2222222 = new g2(R.drawable.iv_align_horiz_middle, getContext(), p6Var222222);
        g2Var2222222.e = 4;
        g2Var2222222.updateColors();
        g2Var2222222.b();
        g2Var2222222.c(i42222222);
        linearLayout2222222.addView(g2Var2222222, w7.b6.o(32, 32));
        g2 g2Var3222222 = new g2(R.drawable.iv_align_horiz_right, getContext(), p6Var222222);
        g2Var3222222.e = 4;
        g2Var3222222.updateColors();
        g2Var3222222.b();
        g2Var3222222.c(i42222222);
        final g2[] g2VarArr322222 = {g2Var722222, g2Var2222222, g2Var3222222};
        boolean z19222222 = z11;
        linearLayout2222222.addView(g2Var3222222, w7.b6.o(32, 32));
        z14 = z12;
        linearLayout2222222.addView(new Space(getContext()), w7.b6.o(8, 0));
        g2 g2Var4222222 = new g2(R.drawable.iv_align_vert_top, getContext(), p6Var222222);
        g2Var4222222.e = 4;
        g2Var4222222.updateColors();
        g2Var4222222.b();
        g2Var4222222.c(i42222222);
        linearLayout2222222.addView(g2Var4222222, w7.b6.o(32, 32));
        g2 g2Var5222222 = new g2(R.drawable.iv_align_vert_middle, getContext(), p6Var222222);
        g2Var5222222.e = 4;
        g2Var5222222.updateColors();
        g2Var5222222.b();
        g2Var5222222.c(i42222222);
        linearLayout2222222.addView(g2Var5222222, w7.b6.o(32, 32));
        g2 g2Var6222222 = new g2(R.drawable.iv_align_vert_bottom, getContext(), p6Var222222);
        g2Var6222222.e = 4;
        g2Var6222222.updateColors();
        g2Var6222222.b();
        g2Var6222222.c(i42222222);
        final g2[] g2VarArr2222222 = {g2Var4222222, g2Var5222222, g2Var6222222};
        linearLayout2222222.addView(g2Var6222222, w7.b6.o(32, 32));
        U222222.q(linearLayout322222);
        it3 = linkedHashSet.iterator();
        int i43222222 = -1;
        while (true) {
            if (!it3.hasNext()) {
            }
        }
        it4 = linkedHashSet.iterator();
        int i44222222 = -1;
        while (true) {
            if (!it4.hasNext()) {
            }
        }
        i21 = 0;
        while (i21 < 3) {
        }
        i23 = 0;
        while (i23 < 3) {
        }
        while (i24 < 3) {
        }
        i25 = 0;
        while (i25 < i22) {
        }
        U222222.o();
        U222222.S = 208;
        if (!linkedHashSet.isEmpty()) {
        }
        z15 = false;
        if (!z15) {
        }
        U222222.c(!z15 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, L0, new ag.j0(this, z5Var2, z15, 3), false);
        if (i17 == 0) {
        }
        if (i19 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i18 == 0) {
        }
        if (i20 != 0) {
        }
        if (z14) {
        }
        U222222.p = new a3.l0(this, U222222, z5Var2, 12);
        this.q4 = U222222;
        U222222.Z();
    }

    @Override // org.telegram.ui.Components.u51
    public final void J1(s4.c1 c1Var) {
        int b10;
        a51 G;
        a aVar = null;
        if (c1Var != null && (b10 = c1Var.b()) >= 0 && (G = this.f3.G(b10)) != null) {
            Object obj = G.G;
            if (obj instanceof a) {
                aVar = (a) obj;
            }
        }
        this.Z3 = aVar;
        this.a4 = false;
        b4 b4Var = this.o3;
        if (b4Var != null) {
            b4Var.u();
        }
    }

    public final void J2() {
        q3 q3Var = this.u3;
        if (q3Var != null) {
            q3Var.f(true);
        }
        P2();
        q3();
        IdentityHashMap identityHashMap = this.g4;
        Iterator it = identityHashMap.values().iterator();
        while (it.hasNext()) {
            ((l5) it.next()).b();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.h4;
        Iterator it2 = identityHashMap2.values().iterator();
        while (it2.hasNext()) {
            ((h5) it2.next()).a();
        }
        identityHashMap2.clear();
    }

    public final boolean J3() {
        int i10;
        a B4;
        q3 q3Var = this.u3;
        return q3Var != null && q3Var.x() && (i10 = q3Var.p0) == q3Var.s0 && i10 >= 0 && i10 < this.w4.size() && q3Var.q0 == 1 && q3Var.t0 == 1 && (B4 = B4(i10)) != null && q6.p(B4.b);
    }

    public final q6 J4() {
        q3 q3Var = this.u3;
        if (q3Var == null || !q3Var.x()) {
            return null;
        }
        int i10 = q3Var.p0;
        int i11 = q3Var.s0;
        a B4 = B4(i10);
        if (i10 == i11 && B4 != null && D3(B4.b)) {
            return x2(i10);
        }
        return null;
    }

    public final int K2(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            ArrayList arrayList = this.s3;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (A3((a) arrayList.get(i12))) {
                i11++;
            } else if (((a) arrayList.get(i12)).i) {
                i11--;
            }
        }
        return i11;
    }

    public final boolean K3(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.s3;
            if (i11 < arrayList.size() && i10 <= i11) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a aVar = (a) arrayList.get(i10);
                    if (!aVar.i && !A3(aVar)) {
                        if (!aVar.k.isEmpty() || q6.p(aVar.b)) {
                            z10 = true;
                        }
                    }
                    i10++;
                }
                return z10;
            }
        }
        return false;
    }

    public final Editable K4(int i10, int i11, int i12, int i13) {
        if (i10 != i12) {
            return null;
        }
        if (A3(B4(i10))) {
            n1 L2 = L2(i10);
            if (L2 != null) {
                return L2.getText();
            }
            return null;
        }
        if (J3()) {
            n1 m42 = m4(i10);
            if (m42 != null) {
                return m42.getText();
            }
            return null;
        }
        a B4 = B4(i10);
        if (B4 == null || !D3(B4.b)) {
            return null;
        }
        int l22 = l2(i10);
        if (a1.g.D(i11, i13, l22, 0) >= a1.g.B(i11, i13, l22, 0)) {
            return null;
        }
        q6 x22 = x2(i10);
        return x22 != null ? x22.getEditText().getText() : q6.A(B4.b);
    }

    public final n1 L2(int i10) {
        if (!A3(B4(i10))) {
            return null;
        }
        View D4 = D4(i10);
        if (D4 instanceof y0) {
            return ((y0) D4).getEditText();
        }
        return null;
    }

    public final boolean L3() {
        q3 q3Var = this.u3;
        if (q3Var != null && q3Var.x()) {
            int i10 = q3Var.p0;
            int i11 = q3Var.s0;
            if (i10 >= 0 && i11 >= 0 && i11 >= i10) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a B4 = B4(i10);
                    if (B4 != null) {
                        if (F3(B4.b)) {
                            z10 = true;
                        }
                    }
                    i10++;
                }
                return z10;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0020, code lost:
    
        if (r12 > r13) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0162 A[LOOP:2: B:68:0x0160->B:69:0x0162, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016f A[LOOP:3: B:72:0x0169->B:74:0x016f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean L4(int i10, int i11, int i12, int i13, ArrayList arrayList) {
        int i14;
        a aVar;
        CharSequence A;
        CharSequence A2;
        CharSequence subSequence;
        CharSequence subSequence2;
        o2 o2Var;
        ArrayList arrayList2;
        SpannableStringBuilder A3;
        int length;
        int i15;
        o2 o2Var2;
        if (i10 >= 0 && i11 >= 0) {
            ArrayList arrayList3 = this.s3;
            if (i10 < arrayList3.size() && i11 < arrayList3.size()) {
                if (i10 <= i11) {
                    if (i10 == i11) {
                    }
                    for (i14 = i10; i14 <= i11; i14++) {
                        a aVar2 = (a) arrayList3.get(i14);
                        if (!aVar2.i && !A3(aVar2) && !H3(aVar2.b) && !o3(aVar2.b) && !(aVar2.b instanceof TL_iv.pageBlockTable)) {
                        }
                    }
                    aVar = (a) arrayList3.get(i10);
                    a aVar3 = (a) arrayList3.get(i11);
                    A = q6.A(aVar.b);
                    A2 = i10 != i11 ? A : q6.A(aVar3.b);
                    if (A == null) {
                        A = "";
                    }
                    if (A2 == null) {
                        A2 = "";
                    }
                    int max = Math.max(0, Math.min(i12, A.length()));
                    int max2 = Math.max(0, Math.min(i13, A2.length()));
                    subSequence = A.subSequence(0, max);
                    subSequence2 = A2.subSequence(max2, A2.length());
                    o2Var = this.Q3;
                    if (o2Var != null) {
                        o2Var.d();
                    }
                    if (arrayList.size() == 1 || !I3((a) arrayList.get(0))) {
                        arrayList2 = new ArrayList(arrayList);
                        if (subSequence.length() > 0) {
                            TL_iv.PageBlock V3 = V3(aVar.b);
                            q6.d(V3, subSequence);
                            arrayList2.add(0, new a(V3, aVar.c, aVar.d));
                        }
                        aVar = (a) i0.a.g(1, arrayList);
                        if (aVar != null) {
                            if (A3(aVar)) {
                                length = s6.r(((TL_iv.pageBlockDetails) aVar.b).title, null, true).length();
                            } else {
                                TL_iv.PageBlock pageBlock = aVar.b;
                                if (((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote) || F3(pageBlock)) && (A3 = q6.A(aVar.b)) != null) {
                                    length = A3.length();
                                }
                            }
                            if (subSequence2.length() > 0) {
                                TL_iv.PageBlock V32 = V3(aVar3.b);
                                q6.d(V32, subSequence2);
                                arrayList2.add(new a(V32, aVar3.c, aVar3.d));
                            }
                            while (i11 >= i10) {
                                arrayList3.remove(i11);
                                i11--;
                            }
                            for (i15 = 0; i15 < arrayList2.size(); i15++) {
                                arrayList3.add(i10 + i15, (a) arrayList2.get(i15));
                            }
                        }
                        length = 0;
                        if (subSequence2.length() > 0) {
                        }
                        while (i11 >= i10) {
                        }
                        while (i15 < arrayList2.size()) {
                        }
                    } else {
                        CharSequence A4 = q6.A(((a) arrayList.get(0)).b);
                        CharSequence charSequence = A4 != null ? A4 : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(subSequence);
                        spannableStringBuilder.append(charSequence);
                        length = spannableStringBuilder.length();
                        spannableStringBuilder.append(subSequence2);
                        q6.d(aVar.b, spannableStringBuilder);
                        while (i11 > i10) {
                            arrayList3.remove(i11);
                            i11--;
                        }
                    }
                    v4();
                    this.u3.f(false);
                    this.f3.O(false);
                    o2Var2 = this.Q3;
                    if (o2Var2 != null) {
                        o2Var2.h();
                    }
                    post(new x2(this, aVar, length, 1));
                    return true;
                }
                i11 = i10;
                i10 = i11;
                i13 = i12;
                i12 = i13;
                while (i14 <= i11) {
                }
                aVar = (a) arrayList3.get(i10);
                a aVar32 = (a) arrayList3.get(i11);
                A = q6.A(aVar.b);
                if (i10 != i11) {
                }
                if (A == null) {
                }
                if (A2 == null) {
                }
                int max3 = Math.max(0, Math.min(i12, A.length()));
                int max22 = Math.max(0, Math.min(i13, A2.length()));
                subSequence = A.subSequence(0, max3);
                subSequence2 = A2.subSequence(max22, A2.length());
                o2Var = this.Q3;
                if (o2Var != null) {
                }
                if (arrayList.size() == 1) {
                }
                arrayList2 = new ArrayList(arrayList);
                if (subSequence.length() > 0) {
                }
                aVar = (a) i0.a.g(1, arrayList);
                if (aVar != null) {
                }
                length = 0;
                if (subSequence2.length() > 0) {
                }
                while (i11 >= i10) {
                }
                while (i15 < arrayList2.size()) {
                }
                v4();
                this.u3.f(false);
                this.f3.O(false);
                o2Var2 = this.Q3;
                if (o2Var2 != null) {
                }
                post(new x2(this, aVar, length, 1));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean M3(int i10, int i11, int i12, int i13, int i14) {
        int length;
        int D;
        int B;
        int max;
        int max2;
        if (B3()) {
            n1 L2 = L2(i11);
            return (L2 == null || (max = Math.max(0, Math.min(Math.min(i12, i14), L2.length()))) >= (max2 = Math.max(0, Math.min(Math.max(i12, i14), L2.length()))) || (i10 & L2.c(max, max2)) == 0) ? false : true;
        }
        if (!J3()) {
            int i15 = i11;
            boolean z10 = false;
            while (i15 <= i13) {
                a B4 = B4(i15);
                if (B4 != null) {
                    TL_iv.PageBlock pageBlock = B4.b;
                    if (D3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                        int l22 = l2(i15);
                        int i16 = i15 == i11 ? i12 : 0;
                        int i17 = i15 == i13 ? i14 : l22;
                        int max3 = Math.max(0, Math.min(i16, l22));
                        int max4 = Math.max(0, Math.min(i17, l22));
                        if (max3 < max4) {
                            q6 x22 = x2(i15);
                            if (x22 != null ? (x22.getStyleDelegate().c(max3, max4) & i10) != 0 : s6.i(max3, max4, i10, q6.A(B4(i15).b))) {
                                z10 = true;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                i15++;
            }
            return z10;
        }
        n1 m42 = m4(i11);
        if (m42 != null && (D = a1.g.D(i12, i14, (length = m42.length()), 0)) < (B = a1.g.B(i12, i14, length, 0)) && (i10 & m42.c(D, B)) != 0) {
        }
    }

    public final void M4(View view) {
        s4.c1 T;
        int b10;
        if (view == null || this.g3 == null || !this.j3 || (T = T(view)) == null || (b10 = T.b()) < 0 || this.f3.H(b10) < 0) {
            return;
        }
        this.H3 = true;
        q3 q3Var = this.u3;
        if (q3Var.x()) {
            q3Var.f(false);
        }
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        this.g3.t(T);
    }

    public final boolean N3(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = i12;
        boolean z10 = false;
        while (i16 <= i14) {
            n1 Q4 = Q4(i11, i16);
            if (Q4 != null) {
                int length = Q4.length();
                int i17 = i16 == i12 ? i13 : 0;
                int i18 = i16 == i14 ? i15 : length;
                if (i12 == i14) {
                    i17 = Math.min(i13, i15);
                    i18 = Math.max(i13, i15);
                }
                int max = Math.max(0, Math.min(i17, length));
                int max2 = Math.max(0, Math.min(i18, length));
                if (max >= max2) {
                    continue;
                } else {
                    if ((Q4.c(max, max2) & i10) == 0) {
                        return false;
                    }
                    z10 = true;
                }
            }
            i16++;
        }
        return z10;
    }

    public final void N4(a aVar, w wVar, ef efVar) {
        long j10;
        l5 l5Var = (l5) this.g4.remove(wVar);
        if (l5Var != null) {
            l5Var.b();
        }
        IdentityHashMap identityHashMap = this.h4;
        h5 h5Var = (h5) identityHashMap.remove(wVar);
        if (h5Var != null) {
            h5Var.a();
        }
        wVar.a = 1;
        wVar.f = 0.0f;
        h5 h5Var2 = new h5(this.m3, efVar, new android.support.v4.media.session.a0(aVar, wVar, this));
        identityHashMap.put(wVar, h5Var2);
        if (h5Var2.f || h5Var2.h || h5Var2.n) {
            return;
        }
        h5Var2.f = true;
        int i10 = efVar.F;
        String str = efVar.I;
        int i11 = efVar.G;
        if (i10 <= 0 || i11 <= 0) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                i10 = options.outWidth;
                i11 = options.outHeight;
            } catch (Exception unused) {
            }
        }
        x20 x20Var = null;
        r8 = null;
        ArrayList arrayList = null;
        x20Var = null;
        if (i10 > 0 && i11 > 0) {
            int i12 = efVar.J;
            if (i12 == 90 || i12 == 270) {
                int i13 = i11;
                i11 = i10;
                i10 = i13;
            }
            x20 x20Var2 = new x20();
            x20Var2.a = 0L;
            x20Var2.d = 0L;
            x20Var2.b = Math.min(3000L, efVar.t);
            while (true) {
                j10 = x20Var2.b;
                if (j10 <= 0 || j10 >= 1000) {
                    break;
                } else {
                    x20Var2.b = j10 * 2;
                }
            }
            if (j10 <= 0) {
                x20Var2.b = 3000L;
            }
            long j11 = x20Var2.b;
            x20Var2.e = j11;
            x20Var2.f = 1;
            x20Var2.g = 0;
            x20Var2.o = str;
            x20Var2.q = (int) ((r14 / 1000.0f) * 115200.0f);
            x20Var2.r = j11;
            x20Var2.n = 30;
            x20Var2.v = j11;
            x20Var2.A = efVar.o;
            String str2 = efVar.k;
            if (str2 != null) {
                x20Var2.B = str2;
                ArrayList arrayList2 = efVar.q;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList = efVar.q;
                }
                x20Var2.G = arrayList;
            } else {
                x20Var2.B = efVar.j;
                x20Var2.G = efVar.p;
            }
            x20Var2.I = true;
            ye yeVar = efVar.A;
            if (yeVar != null) {
                int i14 = yeVar.k;
                if (i14 == 90 || i14 == 270) {
                    int i15 = i11;
                    i11 = i10;
                    i10 = i15;
                }
                i10 = (int) (i10 * yeVar.e);
                i11 = (int) (i11 * yeVar.f);
            }
            float f7 = i10;
            float f10 = i11;
            float max = Math.max(f7 / 854.0f, f10 / 854.0f);
            if (max < 1.0f) {
                max = 1.0f;
            }
            int i16 = (int) (f7 / max);
            int i17 = (int) (f10 / max);
            if (i16 % 16 != 0) {
                i16 = Math.max(1, Math.round(i16 / 16.0f)) * 16;
            }
            if (i17 % 16 != 0) {
                i17 = Math.max(1, Math.round(i17 / 16.0f)) * 16;
            }
            x20Var2.k = i16;
            x20Var2.h = i16;
            x20Var2.l = i17;
            x20Var2.i = i17;
            x20Var2.m = -1;
            x20Var2.t = true;
            x20Var2.c = 0L;
            x20Var = x20Var2;
        }
        h5Var2.d = x20Var;
        if (x20Var == null || !x20Var.c()) {
            h5Var2.b();
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 1;
        String absolutePath = new File(b8.z(4), "rich_anim_" + tz.p() + ".mp4").getAbsolutePath();
        h5Var2.e = absolutePath;
        tL_message.attachPath = absolutePath;
        jj jjVar = new jj(h5Var2.a, tL_message, null, false, false);
        h5Var2.c = jjVar;
        jjVar.p0 = h5Var2.d;
        zs f11 = zs.f(h5Var2.a);
        f11.b(h5Var2, zs.a2);
        f11.b(h5Var2, zs.b2);
        f11.b(h5Var2, zs.c2);
        MediaController.B().h0(h5Var2.c, false, false, false);
    }

    public final boolean O3() {
        q3 q3Var = this.u3;
        if (q3Var == null || !q3Var.x()) {
            return false;
        }
        int i10 = q3Var.p0;
        int i11 = q3Var.s0;
        a B4 = B4(i10);
        return i10 == i11 && B4 != null && (B4.b instanceof TL_iv.pageBlockTable);
    }

    public final void O4(a aVar, w wVar, String str, boolean z10, int i10, int i11, int i12) {
        IdentityHashMap identityHashMap = this.g4;
        l5 l5Var = (l5) identityHashMap.remove(wVar);
        if (l5Var != null) {
            l5Var.b();
        }
        l5 l5Var2 = new l5(this.m3, str, z10, i10, i11, i12, new p3(aVar, wVar, this));
        identityHashMap.put(wVar, l5Var2);
        l5Var2.d();
    }

    public final void P2() {
        if (this.I3) {
            requestDisallowInterceptTouchEvent(false);
        }
        this.I3 = false;
        this.J3 = false;
        this.K3 = null;
        this.L3 = null;
        z60 z60Var = this.q4;
        if (z60Var != null) {
            this.q4 = null;
            z60Var.u();
        }
        z5 z5Var = this.p4;
        if (z5Var != null) {
            LinkedHashSet linkedHashSet = z5Var.H;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                z5Var.w.invalidate();
                z5Var.v();
            }
            this.p4 = null;
        }
        this.s4 = -1;
        this.r4 = -1;
        setEditTextsLocked(false);
    }

    public final boolean P3() {
        org.telegram.messenger.s0 s0Var = vp.r1(this.m3).y7;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.s3;
            if (i10 >= arrayList.size()) {
                break;
            }
            i11 += T3((a) arrayList.get(i10)).size();
            i10++;
        }
        ArrayList c32 = c3();
        p2 p2Var = new p2();
        p2Var.d = i11;
        p2Var.b = c32.size() + p2Var.b;
        for (int i12 = 0; i12 < c32.size(); i12++) {
            p2.b((TL_iv.PageBlock) c32.get(i12), 1, p2Var);
        }
        return p2Var.a <= ((org.telegram.messenger.l0) s0Var.V.a).c && p2Var.b <= ((org.telegram.messenger.l0) s0Var.W.a).c && p2Var.c <= ((org.telegram.messenger.l0) s0Var.X.a).c && p2Var.d <= ((org.telegram.messenger.l0) s0Var.Y.a).c && p2Var.e <= ((org.telegram.messenger.l0) s0Var.Z.a).c;
    }

    public final Editable P4(a aVar) {
        View C1 = C1(aVar);
        return C1 instanceof q6 ? ((q6) C1).getEditText().getText() : q6.A(aVar.b);
    }

    public final n1 Q4(int i10, int i11) {
        View D4 = D4(i10);
        if (D4 instanceof z5) {
            return ((z5) D4).m(i11);
        }
        return null;
    }

    public final int[] R3(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < this.U3.size(); i12++) {
            int length = q6.z(((a) this.U3.get(i12)).b).length();
            if (i10 <= i11 + length) {
                return new int[]{i12, i10 - i11};
            }
            i11 += length + 1;
        }
        int size = this.U3.size() - 1;
        return new int[]{size, q6.z(((a) this.U3.get(size)).b).length()};
    }

    public final n1 S2() {
        View findFocus = findFocus();
        if (findFocus instanceof n1) {
            return (n1) findFocus;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof q6) {
                return ((q6) childAt).getEditText();
            }
        }
        return null;
    }

    public final int S3(int i10) {
        int i11 = 1;
        int i12 = i10 + 1;
        while (true) {
            ArrayList arrayList = this.s3;
            if (i12 >= arrayList.size()) {
                return arrayList.size();
            }
            a aVar = (a) arrayList.get(i12);
            if (A3(aVar)) {
                i11++;
            } else if (aVar.i && i11 - 1 == 0) {
                return i12;
            }
            i12++;
        }
    }

    public final a T2() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof q6) {
                q6 q6Var = (q6) childAt;
                if (q6Var.getEditText().isFocused() || (q6Var.n() && q6Var.h.isFocused())) {
                    return q6Var.getRow();
                }
            }
        }
        return null;
    }

    public final void T4() {
        int[] E4 = E4();
        if (E4 == null) {
            return;
        }
        int i10 = E4[0];
        int i11 = E4[1];
        if (i10 >= 0) {
            ArrayList arrayList = this.s3;
            if (i11 >= arrayList.size() || i10 > i11) {
                return;
            }
            o2 o2Var = this.Q3;
            if (o2Var != null) {
                o2Var.d();
            }
            if (K3(i10, i11)) {
                for (int i12 = i10; i12 <= i11; i12++) {
                    a aVar = (a) arrayList.get(i12);
                    boolean z10 = aVar.i;
                    ArrayList arrayList2 = aVar.k;
                    if (!z10 && !A3(aVar)) {
                        if (q6.p(aVar.b)) {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            pageblockparagraph.text = aVar.b.text;
                            aVar.b = pageblockparagraph;
                        } else if (!arrayList2.isEmpty()) {
                            a1.g.x(1, arrayList2);
                        }
                    }
                }
            } else {
                long a2 = r0.a();
                for (int i13 = i10; i13 <= i11; i13++) {
                    a aVar2 = (a) arrayList.get(i13);
                    boolean z11 = aVar2.i;
                    ArrayList arrayList3 = aVar2.k;
                    if (!z11 && !A3(aVar2)) {
                        if (q6.p(aVar2.b)) {
                            long a10 = r0.a();
                            TL_iv.RichText k10 = q6.k(aVar2.b);
                            if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                                this.t3.put(Long.valueOf(a10), k10);
                            }
                            arrayList3.add(Long.valueOf(a10));
                            TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                            pageblockparagraph2.text = aVar2.b.text;
                            aVar2.b = pageblockparagraph2;
                        }
                        arrayList3.add(0, Long.valueOf(a2));
                    }
                }
            }
            A2();
            Y3();
            v4();
            q3 q3Var = this.u3;
            boolean z12 = q3Var != null && q3Var.x();
            a aVar3 = (a) arrayList.get(Math.max(0, Math.min(i10, arrayList.size() - 1)));
            a aVar4 = (a) arrayList.get(Math.max(0, Math.min(i11, arrayList.size() - 1)));
            this.f3.O(false);
            o2 o2Var2 = this.Q3;
            if (o2Var2 != null) {
                o2Var2.h();
            }
            if (z12) {
                post(new a3.l0(this, aVar3, aVar4, 13));
            } else {
                post(new v2(this, aVar3, 9));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U1(TL_iv.PageBlock pageBlock) {
        o2 o2Var;
        o2 o2Var2 = this.Q3;
        if (o2Var2 != null) {
            o2Var2.d();
        }
        a T2 = T2();
        if (T2 == null) {
            T2 = this.j4;
        }
        ArrayList arrayList = this.s3;
        int indexOf = T2 != null ? arrayList.indexOf(T2) : -1;
        if (indexOf >= 0 && (T2.b instanceof TL_iv.pageBlockBlockquote)) {
            long a2 = r0.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) T2.b).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                this.t3.put(Long.valueOf(a2), richText);
            }
            T2.k.add(Long.valueOf(a2));
            T2.b = new TL_iv.pageBlockParagraph();
        }
        boolean z10 = indexOf >= 0 && !T2.k.isEmpty();
        if (indexOf >= 0) {
            TL_iv.PageBlock pageBlock2 = T2.b;
            if ((pageBlock2 instanceof TL_iv.pageBlockParagraph) && T2.g == null && q6.z(pageBlock2).isEmpty()) {
                T2.b = pageBlock;
                this.j4 = T2;
                if (o3(pageBlock)) {
                    int indexOf2 = arrayList.indexOf(T2) + 1;
                    if (indexOf2 >= arrayList.size() || H3(((a) arrayList.get(indexOf2)).b)) {
                        a aVar = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                        if (z10) {
                            aVar.k.addAll(T2.k);
                        }
                        arrayList.add(indexOf2, aVar);
                        T2 = aVar;
                    } else {
                        T2 = (a) arrayList.get(indexOf2);
                    }
                }
                this.f3.O(false);
                o2Var = this.Q3;
                if (o2Var != null) {
                    o2Var.h();
                }
                post(new v2(this, T2, 1));
            }
        }
        a aVar2 = new a(pageBlock, 0, 0);
        if (z10) {
            aVar2.k.addAll(T2.k);
        }
        if (indexOf >= 0) {
            arrayList.add(indexOf + 1, aVar2);
        } else {
            arrayList.add(aVar2);
        }
        T2 = aVar2;
        this.j4 = T2;
        if (o3(pageBlock)) {
        }
        this.f3.O(false);
        o2Var = this.Q3;
        if (o2Var != null) {
        }
        post(new v2(this, T2, 1));
    }

    public final z5 U2() {
        View findFocus = findFocus();
        if (findFocus instanceof n1) {
            return X2((n1) findFocus);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U4(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        a aVar2;
        o2 o2Var;
        ArrayList arrayList = this.s3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        o2 o2Var2 = this.Q3;
        if (o2Var2 != null) {
            o2Var2.d();
        }
        aVar.b = pageBlock;
        aVar.c = i10;
        aVar.d = i11;
        aVar.e = z10;
        aVar.f = z11;
        v4();
        boolean z12 = pageBlock instanceof TL_iv.pageBlockTable;
        if (z12) {
            int i12 = indexOf + 1;
            if (i12 >= arrayList.size() || H3(((a) arrayList.get(i12)).b)) {
                arrayList.add(i12, new a(new TL_iv.pageBlockParagraph(), 0, 0));
            }
        } else if (H3(pageBlock)) {
            if (G3(pageBlock) && aVar.g == null) {
                aVar.g = new w();
            }
            int i13 = indexOf + 1;
            if (i13 >= arrayList.size() || H3(((a) arrayList.get(i13)).b)) {
                aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                arrayList.add(i13, aVar2);
            } else {
                aVar2 = (a) arrayList.get(i13);
            }
            if (aVar2 == aVar || z12 || H3(pageBlock) || !(findFocus() instanceof n1)) {
                this.f3.O(false);
                o2Var = this.Q3;
                if (o2Var != null) {
                    o2Var.h();
                }
                post(new v2(this, aVar2, 18));
            }
            a2();
            o2 o2Var3 = this.Q3;
            if (o2Var3 != null) {
                o2Var3.h();
            }
            View C1 = C1(aVar);
            if (C1 instanceof q6) {
                q6 q6Var = (q6) C1;
                q6Var.B();
                q6Var.getEditText().setSelection(q6Var.getEditText().length());
                return;
            }
            return;
        }
        aVar2 = aVar;
        if (aVar2 == aVar) {
        }
        this.f3.O(false);
        o2Var = this.Q3;
        if (o2Var != null) {
        }
        post(new v2(this, aVar2, 18));
    }

    public final TLRPC.Document V2(long j10) {
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document2;
        if (j10 == 0) {
            return null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.s3.size(); i11++) {
            for (w wVar : T3((a) this.s3.get(i11))) {
                if (wVar != null && (document2 = wVar.h) != null && document2.id == j10) {
                    return document2;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.r3;
        if (richMessage != null && (arrayList = richMessage.documents) != null) {
            int size = arrayList.size();
            while (i10 < size) {
                TLRPC.Document document3 = arrayList.get(i10);
                i10++;
                TLRPC.Document document4 = document3;
                if (document4 != null && document4.id == j10) {
                    return document4;
                }
            }
        }
        HashMap hashMap = g5.a;
        synchronized (g5.class) {
            document = j10 != 0 ? (TLRPC.Document) g5.b.get(Long.valueOf(j10)) : null;
        }
        return document;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0185, code lost:
    
        if (r2 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b3, code lost:
    
        if (r2 != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0189, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x018a, code lost:
    
        r7 = r14.w4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0193, code lost:
    
        if (r2 >= r7.size()) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0195, code lost:
    
        r7 = (bi.a) r7.get(r2);
        r12 = r7.t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x019f, code lost:
    
        if (r12 == 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01a1, code lost:
    
        r0.X(r2, bi.s6.l((org.telegram.tgnet.tl.TL_iv.RichText) r14.t3.get(java.lang.Long.valueOf(r12))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01ed, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01b5, code lost:
    
        r0.X(r2, bi.q6.z(r7.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01c4, code lost:
    
        if (bi.q6.p(r7.b) == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01c6, code lost:
    
        r7 = bi.s6.l(bi.q6.k(r7.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01d4, code lost:
    
        if (r7.isEmpty() != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01d6, code lost:
    
        r0.w0.put(65536 + r2, org.telegram.ui.Cells.k9.Y(r7));
        r3.put(r2, java.lang.Math.max(2, r3.get(r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01f0, code lost:
    
        r2 = r7.size() - 1;
        r7 = (bi.a) r7.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01ff, code lost:
    
        if (r7.t != 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0207, code lost:
    
        if (bi.q6.p(r7.b) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0209, code lost:
    
        r7 = bi.s6.l(bi.q6.k(r7.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x021a, code lost:
    
        if (r7.isEmpty() != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x021c, code lost:
    
        r7 = r7.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0220, code lost:
    
        if (r2 < 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0224, code lost:
    
        if (r0.F == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0226, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x022d, code lost:
    
        if (r8 >= r0.F.getChildCount()) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x022f, code lost:
    
        r10 = r0.F.getChildAt(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0237, code lost:
    
        if ((r10 instanceof org.telegram.ui.Cells.j9) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0239, code lost:
    
        r10 = (org.telegram.ui.Cells.j9) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x023f, code lost:
    
        if (r0.d0(r10) != r2) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0241, code lost:
    
        r5 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0243, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0246, code lost:
    
        r0.W = r5;
        r0.u = 0;
        r0.v = r7;
        r0.p0 = 0;
        r0.s0 = r2;
        r0.q0 = 0;
        r0.t0 = 1;
        r0.r0 = 0;
        r0.u0 = r7;
        r3.put(0, java.lang.Math.max(1, r3.get(0)));
        r3.put(r2, java.lang.Math.max(2, r3.get(r2)));
        r0.B0 = 0;
        r0.D0 = 0;
        r0.C0 = 0;
        r2 = r0.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0276, code lost:
    
        if (r2 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0278, code lost:
    
        r2.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x027b, code lost:
    
        r0.U();
        r0.w();
        r0.u();
        org.telegram.messenger.i0.r(r4);
        org.telegram.messenger.i0.g3(r4);
        r0 = r0.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x028c, code lost:
    
        if (r0 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x028e, code lost:
    
        r0.a(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0292, code lost:
    
        r0.i0(0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0295, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0214, code lost:
    
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0291, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean V4() {
        z5 z5Var;
        int[] d52;
        int[] d53;
        boolean z10;
        boolean z11;
        int length;
        o0 o0Var;
        q6 q6Var;
        int l4;
        if (this.s3.isEmpty()) {
            return false;
        }
        q3 q3Var = this.u3;
        boolean x10 = q3Var.x();
        SparseIntArray sparseIntArray = q3Var.y0;
        org.telegram.ui.Cells.f fVar = q3Var.m0;
        j9 j9Var = null;
        if (x10) {
            int i10 = q3Var.p0;
            if (i10 == q3Var.s0) {
                View D4 = D4(i10);
                if ((D4 instanceof z5) && (((d52 = d5((z5Var = (z5) D4))) == null || q3Var.q0 != 0 || q3Var.r0 != 0 || q3Var.t0 != d52[0] || q3Var.u0 != d52[1]) && (d53 = d5(z5Var)) != null)) {
                    int i11 = d53[0];
                    int i12 = d53[1];
                    ArrayList arrayList = q3Var.A0;
                    int d02 = q3Var.d0(z5Var);
                    if (d02 >= 0 && (i11 != 0 || i12 != 0)) {
                        q3Var.W = z5Var;
                        q3Var.s0 = d02;
                        q3Var.p0 = d02;
                        q3Var.q0 = 0;
                        q3Var.t0 = i11;
                        q3Var.r0 = 0;
                        q3Var.u0 = i12;
                        q3Var.u = 0;
                        q3Var.v = i12;
                        q3Var.B0 = d02;
                        q3Var.D0 = 0;
                        q3Var.C0 = 0;
                        q3Var.h0(z5Var, d02);
                        arrayList.clear();
                        z5Var.h(arrayList);
                        if (!arrayList.isEmpty() && arrayList.size() > 0) {
                            q3Var.a = ((u9) arrayList.get(0)).getX();
                            q3Var.b = ((u9) arrayList.get(0)).getY();
                        } else if (!arrayList.isEmpty()) {
                            q3Var.a = ((u9) arrayList.get(0)).getX();
                            q3Var.b = ((u9) arrayList.get(0)).getY();
                        }
                        v9 v9Var = q3Var.C;
                        if (v9Var != null) {
                            v9Var.setVisibility(0);
                        }
                        q3Var.U();
                        q3Var.w();
                        q3Var.u();
                        org.telegram.messenger.i0.r(fVar);
                        org.telegram.messenger.i0.g3(fVar);
                        w7.x5 x5Var = q3Var.D;
                        if (x5Var != null) {
                            x5Var.a(true);
                        }
                        z5Var.invalidate();
                        z10 = true;
                    }
                }
            }
            z10 = false;
        } else {
            n1 S2 = S2();
            if (S2 != 0 && S2.getText() != null && (length = S2.getText().length()) > 0) {
                z5 X2 = X2(S2);
                if (X2 != null) {
                    if (S2 == X2.getTitleEditText()) {
                        l4 = 0;
                    } else {
                        c6 q6 = X2.q(S2);
                        l4 = q6 != null ? X2.l(q6.b) : -1;
                    }
                    if (l4 >= 0) {
                        S2.setSelection(S2.getSelectionEnd());
                        z11 = q3Var.j0(X2, l4, 0, length);
                    }
                } else {
                    if (!(S2 instanceof o0)) {
                        ViewParent parent = S2.getParent();
                        while (true) {
                            if (parent == null) {
                                o0Var = null;
                                break;
                            }
                            if (parent instanceof o0) {
                                o0Var = (o0) parent;
                                break;
                            }
                            parent = parent.getParent();
                        }
                    } else {
                        o0Var = (o0) S2;
                    }
                    if (o0Var instanceof j9) {
                        S2.setSelection(S2.getSelectionEnd());
                        z11 = q3Var.j0((j9) o0Var, 0, 0, length);
                    } else {
                        ViewParent parent2 = S2.getParent();
                        while (true) {
                            if (parent2 == null) {
                                q6Var = null;
                                break;
                            }
                            if (parent2 instanceof q6) {
                                q6Var = (q6) parent2;
                                break;
                            }
                            parent2 = parent2.getParent();
                        }
                        if (q6Var != null) {
                            int i13 = S2 == q6Var.getAuthorEditText() ? 1 : 0;
                            S2.setSelection(S2.getSelectionEnd());
                            z11 = q3Var.j0(q6Var, i13, 0, length);
                        }
                    }
                }
            }
            z11 = false;
        }
    }

    public final void W1(a aVar, ef efVar) {
        d4 d4Var;
        if (aVar != null && G3(aVar.b)) {
            String str = efVar.h;
            if (str == null) {
                str = efVar.I;
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                o2 o2Var = this.Q3;
                if (o2Var != null) {
                    o2Var.d();
                }
                w W3 = W3(efVar, str2);
                boolean c10 = h5.c(efVar);
                TL_iv.PageBlock pageblockvideo = (efVar.b || c10) ? new TL_iv.pageBlockVideo() : new TL_iv.pageBlockPhoto();
                if (E3(aVar.b)) {
                    j3(aVar.b).add(pageblockvideo);
                    if (aVar.h == null) {
                        aVar.h = new ArrayList();
                    }
                    aVar.h.add(W3);
                } else {
                    w wVar = aVar.g;
                    if (wVar == null || wVar.a == 0) {
                        aVar.b = pageblockvideo;
                        aVar.g = W3;
                    } else {
                        TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                        pageblockcollage.caption = aVar.b.caption;
                        n0.d(pageblockcollage);
                        ArrayList<TL_iv.PageBlock> arrayList = new ArrayList<>();
                        pageblockcollage.items = arrayList;
                        arrayList.add(aVar.b);
                        pageblockcollage.items.add(pageblockvideo);
                        ArrayList arrayList2 = new ArrayList();
                        aVar.h = arrayList2;
                        arrayList2.add(aVar.g);
                        aVar.h.add(W3);
                        aVar.g = null;
                        aVar.b = pageblockcollage;
                    }
                }
                this.f3.O(false);
                q4(aVar);
                if (c10) {
                    N4(aVar, W3, efVar);
                    d4Var = this;
                } else {
                    d4Var = this;
                    d4Var.O4(aVar, W3, str2, efVar.b, efVar.F, efVar.G, efVar.E);
                }
                o2 o2Var2 = d4Var.Q3;
                if (o2Var2 != null) {
                    o2Var2.h();
                }
                d4Var.o3.onContentChanged();
            }
        }
    }

    public final int W2(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.s3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            if (!aVar.i) {
                int i12 = -1;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    a aVar2 = (a) arrayList.get(i14);
                    if (A3(aVar2)) {
                        i13++;
                        if (i12 == -1 && !((TL_iv.pageBlockDetails) aVar2.b).open) {
                            i12 = i13;
                        }
                    } else if (aVar2.i) {
                        if (i12 != -1 && i13 == i12) {
                            i12 = -1;
                        }
                        i13--;
                    }
                }
                if (i12 != -1) {
                    continue;
                } else {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if (!H3(pageBlock) || o3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
                        return i10;
                    }
                }
            }
            i10 += i11;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f5, code lost:
    
        if (r4 <= r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0141, code lost:
    
        r1.k0(r11, r12, r13);
        r1.l0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0147, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013f, code lost:
    
        if (r5 <= r4.getLineRight(r2)) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean W4(View view, float f7, float f10) {
        int lineForVertical;
        int lineForVertical2;
        c6 m10;
        int lineForVertical3;
        if (view != 0) {
            q3 q3Var = this.u3;
            if (!q3Var.x()) {
                int left = (int) ((f7 - view.getLeft()) - getLeft());
                int top = (int) ((f10 - view.getTop()) - getTop());
                if (view instanceof q6) {
                    q6 q6Var = (q6) view;
                    n1 n1Var = q6Var.h;
                    n1 n1Var2 = q6Var.f;
                    LinearLayout linearLayout = q6Var.b;
                    if (q6.y(n1Var2, n1Var2.getLeft() + linearLayout.getLeft(), n1Var2.getTop() + linearLayout.getTop(), left, top) || (n1Var.getVisibility() == 0 && q6.y(n1Var, n1Var.getLeft(), n1Var.getTop(), left, top))) {
                        q3Var.k0(q6Var, left, top);
                        q3Var.l0();
                        return true;
                    }
                } else if (view instanceof z5) {
                    z5 z5Var = (z5) view;
                    y5 y5Var = z5Var.x;
                    h4 h4Var = z5Var.s;
                    b6 b6Var = z5Var.w;
                    TL_iv.pageTableCell o10 = z5Var.o(left, top);
                    if (o10 != null && (m10 = b6Var.m(o10)) != null) {
                        n1 n1Var3 = m10.a;
                        int scrollX = h4Var.getScrollX() + (((left - h4Var.getLeft()) - y5Var.getLeft()) - b6Var.getLeft());
                        int top2 = ((top - h4Var.getTop()) - y5Var.getTop()) - b6Var.getTop();
                        int left2 = (scrollX - m10.getLeft()) - n1Var3.getLeft();
                        int top3 = (top2 - m10.getTop()) - n1Var3.getTop();
                        Layout layout = n1Var3.getLayout();
                        if (layout != null) {
                            int paddingTop = top3 - n1Var3.getPaddingTop();
                            int paddingLeft = left2 - n1Var3.getPaddingLeft();
                            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical3 = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical3 < layout.getLineCount()) {
                                float lineLeft = layout.getLineLeft(lineForVertical3);
                                float lineRight = layout.getLineRight(lineForVertical3);
                                float f11 = paddingLeft;
                                if (f11 >= lineLeft) {
                                }
                            }
                        }
                    }
                    n1 n1Var4 = z5Var.r;
                    Layout layout2 = n1Var4.getLayout();
                    if (layout2 != null) {
                        int paddingLeft2 = left - (n1Var4.getPaddingLeft() + n1Var4.getLeft());
                        int paddingTop2 = top - (n1Var4.getPaddingTop() + n1Var4.getTop());
                        if (paddingTop2 >= 0 && paddingTop2 < layout2.getHeight() && (lineForVertical2 = layout2.getLineForVertical(paddingTop2)) >= 0 && lineForVertical2 < layout2.getLineCount()) {
                            float f12 = paddingLeft2;
                            if (f12 >= layout2.getLineLeft(lineForVertical2)) {
                            }
                        }
                    }
                } else if (view instanceof o0) {
                    if (((o0) view).a(left, top)) {
                        q3Var.k0(view, left, top);
                        q3Var.l0();
                        return true;
                    }
                } else if (view instanceof y0) {
                    y0 y0Var = (y0) view;
                    n1 n1Var5 = y0Var.d;
                    Layout layout3 = n1Var5.getLayout();
                    if (layout3 != null && n1Var5.length() != 0) {
                        int paddingLeft3 = left - (n1Var5.getPaddingLeft() + n1Var5.getLeft());
                        int paddingTop3 = top - (n1Var5.getPaddingTop() + n1Var5.getTop());
                        if (paddingTop3 >= 0 && paddingTop3 < layout3.getHeight() && (lineForVertical = layout3.getLineForVertical(paddingTop3)) >= 0 && lineForVertical < layout3.getLineCount()) {
                            int L = org.telegram.messenger.i0.L(24.0f);
                            int max = Math.max(0, (n1Var5.getWidth() - n1Var5.getPaddingLeft()) - n1Var5.getPaddingRight());
                            float f13 = L;
                            float max2 = Math.max(0.0f, layout3.getLineLeft(lineForVertical) - f13);
                            float min = Math.min(max, layout3.getLineRight(lineForVertical) + f13);
                            float f14 = paddingLeft3;
                            if (f14 >= max2 && f14 <= min) {
                                q3Var.k0(y0Var, left, top);
                                q3Var.l0();
                                return true;
                            }
                        }
                    }
                } else if (view instanceof a5) {
                    a5 a5Var = (a5) view;
                    if (a5Var.x != null) {
                        int[] iArr = new int[4];
                        a5Var.j(iArr);
                        if (left >= iArr[0] && left <= iArr[2] && top >= iArr[1] && top <= iArr[3]) {
                            q3Var.k0(view, left, top);
                            q3Var.l0();
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void X1(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int indexOf;
        if (richMessage == null || (arrayList = richMessage.blocks) == null || arrayList.isEmpty()) {
            return;
        }
        o2 o2Var = this.Q3;
        if (o2Var != null) {
            o2Var.d();
        }
        TL_iv.RichMessage richMessage2 = this.r3;
        if (richMessage2 == null) {
            this.r3 = richMessage;
        } else {
            ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
            if (arrayList2 != null) {
                richMessage2.photos.addAll(arrayList2);
            }
            ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
            if (arrayList3 != null) {
                this.r3.documents.addAll(arrayList3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Z2(arrayList4, richMessage.blocks, this.t3);
        if (arrayList4.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < arrayList4.size(); i10++) {
            y4((a) arrayList4.get(i10));
        }
        ArrayList arrayList5 = this.s3;
        int size = arrayList5.size();
        a T2 = T2();
        if (T2 != null && (indexOf = arrayList5.indexOf(T2)) >= 0) {
            TL_iv.PageBlock pageBlock = T2.b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && q6.z(pageBlock).isEmpty()) {
                arrayList5.remove(indexOf);
                size = indexOf;
            } else {
                size = indexOf + 1;
            }
        }
        arrayList5.addAll(size, arrayList4);
        Y3();
        v4();
        this.f3.O(false);
        o2 o2Var2 = this.Q3;
        if (o2Var2 != null) {
            o2Var2.h();
        }
        b4 b4Var = this.o3;
        if (b4Var != null) {
            b4Var.onContentChanged();
        }
    }

    public final a X3(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.w4;
            if (i10 >= arrayList.size()) {
                return null;
            }
            a aVar = (a) arrayList.get(i10);
            if (!aVar.i) {
                if (aVar.t == 0) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if (H3(pageBlock) && !o3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockTable)) {
                    }
                }
                return aVar;
            }
            i10 += i11;
        }
        return null;
    }

    public final void X4(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        if (aVar == null) {
            aVar = a5();
        }
        a aVar2 = aVar;
        if (aVar2 == null || pageBlock == null) {
            return;
        }
        ArrayList arrayList = this.s3;
        if (arrayList.indexOf(aVar2) < 0 || A3(aVar2) || aVar2.i) {
            return;
        }
        TL_iv.PageBlock pageBlock2 = aVar2.b;
        if (pageBlock != pageBlock2 && D3(pageBlock2) && D3(pageBlock)) {
            q6 x22 = x2(arrayList.indexOf(aVar2));
            q6.d(pageBlock, x22 != null ? x22.getEditText().getText() : q6.A(aVar2.b));
            TL_iv.RichText k10 = q6.k(aVar2.b);
            if (k10 != null && q6.k(pageBlock) != null) {
                if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                    ((TL_iv.pageBlockBlockquote) pageBlock).caption = k10;
                } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                    ((TL_iv.pageBlockPullquote) pageBlock).caption = k10;
                }
            }
        }
        U4(aVar2, pageBlock, i10, i11, z10, z11);
    }

    public final a Y1(a aVar, int i10) {
        int i11;
        ArrayList arrayList = this.w4;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0 || (i11 = indexOf + i10) < 0 || i11 >= arrayList.size()) {
            return null;
        }
        a aVar2 = (a) arrayList.get(i11);
        if (aVar2.t != 0) {
            return aVar2;
        }
        return null;
    }

    public final void Y2() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            KeyEvent.Callback childAt = getChildAt(i10);
            if (childAt instanceof q6) {
                q6 q6Var = (q6) childAt;
                q6Var.f.J();
                q6Var.h.J();
            } else if (childAt instanceof o0) {
                ((o0) childAt).getCaptionEditText().J();
            } else if (childAt instanceof y0) {
                ((y0) childAt).getEditText().J();
            }
        }
    }

    public final void Y3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.s3;
            if (i10 >= arrayList.size()) {
                return;
            }
            a aVar = (a) arrayList.get(i10);
            if (!aVar.k.isEmpty() && q6.p(aVar.b)) {
                long a2 = r0.a();
                TL_iv.RichText k10 = q6.k(aVar.b);
                if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                    this.t3.put(Long.valueOf(a2), k10);
                }
                aVar.k.add(Long.valueOf(a2));
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = aVar.b.text;
                aVar.b = pageblockparagraph;
            }
            i10++;
        }
    }

    public final void Y4(a aVar, TL_iv.PageBlock pageBlock) {
        if (aVar == null) {
            aVar = a5();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        X4(aVar2, pageBlock, aVar2.c, aVar2.d, aVar2.e, aVar2.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0134, code lost:
    
        r6 = r21 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0123, code lost:
    
        r4 = r21 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e9, code lost:
    
        r8 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ea, code lost:
    
        if (r8 <= 0) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f0, code lost:
    
        if (K2(r8) <= 0) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f2, code lost:
    
        r8 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f5, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f6, code lost:
    
        r12 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
    
        if (r12 >= r5.size()) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0102, code lost:
    
        if (K2(r12) <= 0) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0104, code lost:
    
        r9 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0106, code lost:
    
        r13 = (bi.a) r5.get(r4);
        r7 = (bi.a) r5.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0114, code lost:
    
        if (r8 != r4) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011a, code lost:
    
        if (A3(r13) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011e, code lost:
    
        if (r13.i == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0121, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0125, code lost:
    
        if (r9 != r6) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012b, code lost:
    
        if (A3(r7) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012f, code lost:
    
        if (r7.i == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0132, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0136, code lost:
    
        r10 = new java.lang.StringBuilder();
        r17 = r4;
        r18 = r6;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0141, code lost:
    
        if (r4 >= r25.length) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0143, code lost:
    
        if (r4 <= 0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0145, code lost:
    
        r10.append(' ');
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014a, code lost:
    
        r10.append(r25[r4]);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0152, code lost:
    
        r3 = r10.toString();
        r4 = r20.Q3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0158, code lost:
    
        if (r4 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015a, code lost:
    
        r4.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x015d, code lost:
    
        if (r17 != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x015f, code lost:
    
        r4 = bi.q6.z(r13.b);
        r1 = r4.substring(0, java.lang.Math.max(0, java.lang.Math.min(r1, r4.length())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0176, code lost:
    
        if (r18 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0178, code lost:
    
        r4 = bi.q6.z(r7.b);
        r15 = r4.substring(java.lang.Math.max(0, java.lang.Math.min(r2, r4.length())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018e, code lost:
    
        bi.q6.e(r13.b, r1 + r3 + r15);
        r5.subList(r8 + 1, r12).clear();
        r1 = r3.length() + r1.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b8, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x021c, code lost:
    
        if (r5.isEmpty() == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x021e, code lost:
    
        r13 = new bi.a(new org.telegram.tgnet.tl.TL_iv.pageBlockParagraph(), r6, r6);
        r5.add(r13);
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x022c, code lost:
    
        v4();
        r11.f(r6);
        r14.O(r6);
        r2 = r20.Q3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0237, code lost:
    
        if (r2 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0239, code lost:
    
        r2.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x023c, code lost:
    
        post(new bi.x2(r20, r13, r1, 3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0245, code lost:
    
        return r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ba, code lost:
    
        if (r18 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bc, code lost:
    
        r1 = bi.q6.z(r7.b);
        r1 = r1.substring(java.lang.Math.max(0, java.lang.Math.min(r2, r1.length())));
        bi.q6.e(r7.b, r3 + r1);
        r5.subList(r8, r9).clear();
        r1 = r3.length();
        r13 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f4, code lost:
    
        r5.subList(r8, r12).clear();
        r1 = new org.telegram.tgnet.tl.TL_iv.pageBlockParagraph();
        c2(r1, r3);
        r6 = 0;
        r13 = new bi.a(r1, 0, 0);
        r5.add(java.lang.Math.min(r8, r5.size()), r13);
        r1 = r3.length();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z1(int i10, int i11, int i12, int i13, String[] strArr) {
        String str;
        z5 z5Var;
        w6 model;
        int max;
        int length;
        int length2;
        int i14 = i11;
        int i15 = i13;
        a B4 = B4(i10);
        ArrayList arrayList = this.s3;
        int indexOf = arrayList.indexOf(B4);
        int indexOf2 = arrayList.indexOf(B4(i12));
        if (indexOf < 0 || indexOf2 < 0 || indexOf >= arrayList.size() || indexOf2 >= arrayList.size()) {
            return false;
        }
        a aVar = (a) arrayList.get(indexOf);
        a aVar2 = (a) arrayList.get(indexOf2);
        q3 q3Var = this.u3;
        int i16 = 1;
        if (indexOf == indexOf2 && A3(aVar)) {
            View C1 = C1(aVar);
            if (!(C1 instanceof y0) || !(aVar.b instanceof TL_iv.pageBlockDetails)) {
                return true;
            }
            n1 editText = ((y0) C1).getEditText();
            o2 o2Var = this.Q3;
            if (o2Var != null) {
                o2Var.d();
            }
            StringBuilder sb2 = new StringBuilder();
            for (int i17 = 0; i17 < strArr.length; i17++) {
                if (i17 > 0) {
                    sb2.append(' ');
                }
                sb2.append(strArr[i17]);
            }
            String sb3 = sb2.toString();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editText.getText());
            int length3 = spannableStringBuilder.length();
            int D = a1.g.D(i14, i15, length3, 0);
            spannableStringBuilder.replace(D, a1.g.B(i14, i15, length3, 0), (CharSequence) sb3);
            editText.setTextSilently(spannableStringBuilder);
            editText.f();
            ((TL_iv.pageBlockDetails) aVar.b).title = s6.f(spannableStringBuilder);
            int length4 = sb3.length() + D;
            q3Var.f(false);
            o2 o2Var2 = this.Q3;
            if (o2Var2 != null) {
                o2Var2.h();
            }
            post(new d3(editText, length4, 0));
            return true;
        }
        int i18 = indexOf;
        while (true) {
            p51 p51Var = this.f3;
            str = "";
            if (i18 > indexOf2) {
                int i19 = i16;
                o2 o2Var3 = this.Q3;
                if (o2Var3 != null) {
                    o2Var3.d();
                }
                TL_iv.PageBlock pageBlock = aVar.b;
                boolean z10 = pageBlock instanceof TL_iv.pageBlockTable;
                boolean z11 = aVar2.b instanceof TL_iv.pageBlockTable;
                b4 b4Var = this.o3;
                if (z10 || z11) {
                    if (z10 && z11 && indexOf == indexOf2) {
                        int i20 = q3Var.q0;
                        int i21 = q3Var.t0;
                        View C12 = C1(aVar);
                        if ((C12 instanceof z5) && (model = (z5Var = (z5) C12).getModel()) != null) {
                            ArrayList arrayList2 = model.g;
                            if (i20 == 0 && i21 == 0) {
                                TL_iv.PageBlock pageBlock2 = aVar.b;
                                if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                                    TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                                    o2 o2Var4 = this.Q3;
                                    if (o2Var4 != null) {
                                        o2Var4.d();
                                    }
                                    String l4 = s6.l(pageblocktable.title);
                                    int max2 = Math.max(0, Math.min(Math.min(i14, i15), l4.length()));
                                    int max3 = Math.max(0, Math.min(Math.max(i14, i15), l4.length()));
                                    StringBuilder sb4 = new StringBuilder();
                                    for (int i22 = 0; i22 < strArr.length; i22++) {
                                        if (i22 > 0) {
                                            sb4.append(' ');
                                        }
                                        sb4.append(strArr[i22]);
                                    }
                                    String sb5 = sb4.toString();
                                    String str2 = l4.substring(0, max2) + sb5 + l4.substring(max3);
                                    TL_iv.textPlain textplain = new TL_iv.textPlain();
                                    textplain.text = str2;
                                    pageblocktable.title = textplain;
                                    n1 titleEditText = z5Var.getTitleEditText();
                                    titleEditText.setTextSilently(str2);
                                    titleEditText.f();
                                    int length5 = sb5.length() + max2;
                                    q3Var.f(false);
                                    o2 o2Var5 = this.Q3;
                                    if (o2Var5 != null) {
                                        o2Var5.h();
                                    }
                                    b4Var.onContentChanged();
                                    post(new d3(titleEditText, length5, 4));
                                    return true;
                                }
                            } else {
                                int i23 = i20 - 1;
                                int i24 = i21 - 1;
                                int size = arrayList2.size();
                                if (i23 >= 0 && i23 < size && i24 >= 0 && i24 < size) {
                                    o2 o2Var6 = this.Q3;
                                    if (o2Var6 != null) {
                                        o2Var6.d();
                                    }
                                    if (i23 > i24 || (i23 == i24 && i14 > i15)) {
                                        i15 = i14;
                                        i14 = i15;
                                        i24 = i23;
                                        i23 = i24;
                                    }
                                    StringBuilder sb6 = new StringBuilder();
                                    for (int i25 = 0; i25 < strArr.length; i25++) {
                                        if (i25 > 0) {
                                            sb6.append('\n');
                                        }
                                        sb6.append(strArr[i25]);
                                    }
                                    String sb7 = sb6.toString();
                                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) arrayList2.get(i23);
                                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) arrayList2.get(i24);
                                    if (i23 == i24) {
                                        String g10 = w6.g(pagetablecell);
                                        max = Math.max(0, Math.min(i14, g10.length()));
                                        String str3 = g10.substring(0, max) + sb7 + g10.substring(Math.max(0, Math.min(i15, g10.length())));
                                        w6.c(pagetablecell, str3);
                                        c6 m10 = z5Var.getGrid().m(pagetablecell);
                                        if (m10 != null) {
                                            m10.a.setTextSilently(str3);
                                        }
                                        length = sb7.length();
                                    } else {
                                        String g11 = w6.g(pagetablecell);
                                        max = Math.max(0, Math.min(i14, g11.length()));
                                        String str4 = g11.substring(0, max) + sb7;
                                        w6.c(pagetablecell, str4);
                                        c6 m11 = z5Var.getGrid().m(pagetablecell);
                                        if (m11 != null) {
                                            m11.a.setTextSilently(str4);
                                        }
                                        for (int i26 = i23 + 1; i26 < i24; i26++) {
                                            TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) arrayList2.get(i26);
                                            w6.c(pagetablecell3, "");
                                            c6 m12 = z5Var.getGrid().m(pagetablecell3);
                                            if (m12 != null) {
                                                m12.a.setTextSilently("");
                                            }
                                        }
                                        String g12 = w6.g(pagetablecell2);
                                        String substring = g12.substring(Math.max(0, Math.min(i15, g12.length())));
                                        w6.c(pagetablecell2, substring);
                                        c6 m13 = z5Var.getGrid().m(pagetablecell2);
                                        if (m13 != null) {
                                            m13.a.setTextSilently(substring);
                                        }
                                        length = sb7.length();
                                    }
                                    int i27 = length + max;
                                    q3Var.f(false);
                                    o2 o2Var7 = this.Q3;
                                    if (o2Var7 != null) {
                                        o2Var7.h();
                                    }
                                    post(new ag.o0(z5Var, pagetablecell, i27, 1));
                                    return true;
                                }
                            }
                        }
                        return true;
                    }
                    return false;
                }
                boolean o32 = o3(pageBlock);
                boolean o33 = o3(aVar2.b);
                if (o32 || o33) {
                    if (o32 && o33 && indexOf == indexOf2) {
                        View C13 = C1(aVar);
                        if (C13 instanceof o0) {
                            o0 o0Var = (o0) C13;
                            n1 captionEditText = o0Var.getCaptionEditText();
                            o2 o2Var8 = this.Q3;
                            if (o2Var8 != null) {
                                o2Var8.d();
                            }
                            StringBuilder sb8 = new StringBuilder();
                            for (int i28 = 0; i28 < strArr.length; i28++) {
                                if (i28 > 0) {
                                    sb8.append(' ');
                                }
                                sb8.append(strArr[i28]);
                            }
                            String sb9 = sb8.toString();
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(captionEditText.getText());
                            int length6 = spannableStringBuilder2.length();
                            int D2 = a1.g.D(i14, i15, length6, 0);
                            spannableStringBuilder2.replace(D2, a1.g.B(i14, i15, length6, 0), (CharSequence) sb9);
                            captionEditText.setTextSilently(spannableStringBuilder2);
                            captionEditText.f();
                            o0Var.b();
                            int length7 = sb9.length() + D2;
                            q3Var.f(false);
                            o2 o2Var9 = this.Q3;
                            if (o2Var9 != null) {
                                o2Var9.h();
                            }
                            post(new d3(captionEditText, length7, 2));
                            return true;
                        }
                    }
                    return false;
                }
                if (indexOf != indexOf2 || !q6.p(aVar.b) || q3Var.q0 != i19 || q3Var.t0 != i19) {
                    String z12 = q6.z(aVar.b);
                    String z13 = indexOf == indexOf2 ? z12 : q6.z(aVar2.b);
                    int max4 = Math.max(0, Math.min(i14, z12.length()));
                    int max5 = Math.max(0, Math.min(i15, z13.length()));
                    String substring2 = z12.substring(0, max4);
                    String substring3 = z13.substring(max5);
                    if (strArr.length <= 1) {
                        str = strArr.length != 0 ? strArr[0] : "";
                        q6.e(aVar.b, substring2 + str + substring3);
                        if (indexOf2 > indexOf) {
                            while (indexOf2 > indexOf) {
                                arrayList.remove(indexOf2);
                                indexOf2--;
                            }
                        }
                        length2 = str.length() + substring2.length();
                    } else {
                        TL_iv.PageBlock pageBlock3 = aVar.b;
                        StringBuilder t10 = a1.g.t(substring2);
                        t10.append(strArr[0]);
                        q6.e(pageBlock3, t10.toString());
                        if (indexOf2 > indexOf) {
                            while (indexOf2 > indexOf) {
                                arrayList.remove(indexOf2);
                                indexOf2--;
                            }
                        }
                        for (int i29 = 1; i29 < strArr.length - 1; i29++) {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            c2(pageblockparagraph, strArr[i29]);
                            int i30 = indexOf + i29;
                            int i31 = aVar.c;
                            int i32 = aVar.d;
                            if (i32 > 0) {
                                i32 += i29;
                            }
                            arrayList.add(i30, new a(pageblockparagraph, i31, i32));
                        }
                        String str5 = strArr[strArr.length - 1];
                        TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                        c2(pageblockparagraph2, str5 + substring3);
                        int length8 = (strArr.length + indexOf) - 1;
                        int i33 = aVar.c;
                        int i34 = aVar.d;
                        if (i34 > 0) {
                            i34 = (i34 + strArr.length) - 1;
                        }
                        arrayList.add(length8, new a(pageblockparagraph2, i33, i34));
                        indexOf = (indexOf + strArr.length) - 1;
                        length2 = str5.length();
                    }
                    v4();
                    a aVar3 = (indexOf < 0 || indexOf >= arrayList.size()) ? null : (a) arrayList.get(indexOf);
                    q3Var.f(false);
                    p51Var.O(false);
                    o2 o2Var10 = this.Q3;
                    if (o2Var10 != null) {
                        o2Var10.h();
                    }
                    post(new x2(this, aVar3, length2, 0));
                    return true;
                }
                View C14 = C1(aVar);
                if (C14 instanceof q6) {
                    q6 q6Var = (q6) C14;
                    n1 authorEditText = q6Var.getAuthorEditText();
                    o2 o2Var11 = this.Q3;
                    if (o2Var11 != null) {
                        o2Var11.d();
                    }
                    StringBuilder sb10 = new StringBuilder();
                    for (int i35 = 0; i35 < strArr.length; i35++) {
                        if (i35 > 0) {
                            sb10.append(' ');
                        }
                        sb10.append(strArr[i35]);
                    }
                    String sb11 = sb10.toString();
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(authorEditText.getText());
                    int length9 = spannableStringBuilder3.length();
                    int D3 = a1.g.D(i14, i15, length9, 0);
                    spannableStringBuilder3.replace(D3, a1.g.B(i14, i15, length9, 0), (CharSequence) sb11);
                    authorEditText.setTextSilently(spannableStringBuilder3);
                    authorEditText.f();
                    q6Var.w();
                    int length10 = sb11.length() + D3;
                    q3Var.f(false);
                    o2 o2Var12 = this.Q3;
                    if (o2Var12 != null) {
                        o2Var12.h();
                    }
                    b4Var.onContentChanged();
                    post(new d3(authorEditText, length10, 1));
                    return true;
                }
                return true;
            }
            boolean z14 = i16;
            if (((a) arrayList.get(i18)).i || A3((a) arrayList.get(i18))) {
                break;
            }
            i18++;
            i16 = z14 ? 1 : 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z3(a aVar, boolean z10) {
        int i10;
        o2 o2Var;
        int indexOf = this.s3.indexOf(aVar);
        if (indexOf >= 0) {
            View C1 = C1(aVar);
            if (C1 instanceof q6) {
                q6 q6Var = (q6) C1;
                if (q6Var.getEditText().isFocused()) {
                    i10 = q6Var.getEditText().getSelectionEnd();
                    o2Var = this.Q3;
                    if (o2Var != null) {
                        o2Var.d();
                    }
                    if (t3(indexOf, z10, false)) {
                        v4();
                        if (findFocus() instanceof n1) {
                            a2();
                        } else {
                            this.f3.O(false);
                        }
                        o2 o2Var2 = this.Q3;
                        if (o2Var2 != null) {
                            o2Var2.h();
                        }
                        if (i10 < 0) {
                            return true;
                        }
                        post(new x2(this, aVar, i10, 2));
                        return true;
                    }
                }
            }
            i10 = -1;
            o2Var = this.Q3;
            if (o2Var != null) {
            }
            if (t3(indexOf, z10, false)) {
            }
        }
        return false;
    }

    public final void Z4(a aVar, int i10) {
        boolean z10;
        d4 d4Var;
        TL_iv.PageBlock pageBlock;
        if (aVar == null) {
            aVar = a5();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        if (i10 == 0) {
            X4(aVar2, aVar2.b, 0, 0, false, false);
            return;
        }
        int max = Math.max(1, aVar2.c);
        int max2 = i10 == 2 ? Math.max(1, aVar2.d) : 0;
        boolean z11 = i10 == 3;
        TL_iv.PageBlock pageBlock2 = aVar2.b;
        if (!(pageBlock2 instanceof TL_iv.pageBlockParagraph)) {
            pageBlock2 = new TL_iv.pageBlockParagraph();
        }
        if (z11 && aVar2.f) {
            z10 = true;
            pageBlock = pageBlock2;
            d4Var = this;
        } else {
            z10 = false;
            d4Var = this;
            pageBlock = pageBlock2;
        }
        d4Var.X4(aVar2, pageBlock, max, max2, z11, z10);
    }

    public final void a2() {
        q6 q6Var;
        a aVar;
        n6 n6Var;
        this.f3.T();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof q6) && (aVar = (q6Var = (q6) childAt).y) != null && (n6Var = q6Var.D) != null) {
                q6Var.f(aVar, n6Var, q6Var.E);
            }
        }
    }

    public final void a4() {
        int length;
        int D;
        int B;
        int length2;
        int D2;
        int B2;
        int length3;
        int D3;
        int B3;
        int length4;
        int D4;
        int B4;
        n1 Q4;
        int length5;
        int D5;
        int B5;
        boolean O3 = O3();
        q3 q3Var = this.u3;
        if (O3) {
            int i10 = q3Var.p0;
            int i11 = q3Var.q0;
            if (i11 == q3Var.t0 && (Q4 = Q4(i10, i11)) != null && (D5 = a1.g.D(q3Var.r0, q3Var.u0, (length5 = Q4.length()), 0)) < (B5 = a1.g.B(q3Var.r0, q3Var.u0, length5, 0))) {
                o2 o2Var = this.Q3;
                if (o2Var != null) {
                    o2Var.d();
                }
                if (s6.h(Q4.getText(), D5, B5)) {
                    s6.n(Q4.getText(), D5, B5);
                    Q4.f();
                    j4(i10, i11);
                    o2 o2Var2 = this.Q3;
                    if (o2Var2 != null) {
                        o2Var2.h();
                    }
                    r4();
                }
                Q4.O1 = D5;
                Q4.P1 = B5;
                Q4.B();
                return;
            }
            return;
        }
        if (B3()) {
            int i12 = q3Var.p0;
            n1 L2 = L2(i12);
            if (L2 != null && (D4 = a1.g.D(q3Var.r0, q3Var.u0, (length4 = L2.length()), 0)) < (B4 = a1.g.B(q3Var.r0, q3Var.u0, length4, 0))) {
                o2 o2Var3 = this.Q3;
                if (o2Var3 != null) {
                    o2Var3.d();
                }
                if (s6.h(L2.getText(), D4, B4)) {
                    s6.n(L2.getText(), D4, B4);
                    L2.f();
                    h4(i12);
                    o2 o2Var4 = this.Q3;
                    if (o2Var4 != null) {
                        o2Var4.h();
                    }
                    r4();
                }
                L2.O1 = D4;
                L2.P1 = B4;
                L2.B();
                return;
            }
            return;
        }
        if (z3()) {
            int i13 = q3Var.p0;
            n1 v22 = v2(i13);
            if (v22 != null && (D3 = a1.g.D(q3Var.r0, q3Var.u0, (length3 = v22.length()), 0)) < (B3 = a1.g.B(q3Var.r0, q3Var.u0, length3, 0))) {
                o2 o2Var5 = this.Q3;
                if (o2Var5 != null) {
                    o2Var5.d();
                }
                if (s6.h(v22.getText(), D3, B3)) {
                    s6.n(v22.getText(), D3, B3);
                    v22.f();
                    g4(i13);
                    o2 o2Var6 = this.Q3;
                    if (o2Var6 != null) {
                        o2Var6.h();
                    }
                    r4();
                }
                v22.O1 = D3;
                v22.P1 = B3;
                v22.B();
                return;
            }
            return;
        }
        if (J3()) {
            int i14 = q3Var.p0;
            n1 m42 = m4(i14);
            if (m42 != null && (D2 = a1.g.D(q3Var.r0, q3Var.u0, (length2 = m42.length()), 0)) < (B2 = a1.g.B(q3Var.r0, q3Var.u0, length2, 0))) {
                o2 o2Var7 = this.Q3;
                if (o2Var7 != null) {
                    o2Var7.d();
                }
                if (s6.h(m42.getText(), D2, B2)) {
                    s6.n(m42.getText(), D2, B2);
                    m42.f();
                    i4(i14);
                    o2 o2Var8 = this.Q3;
                    if (o2Var8 != null) {
                        o2Var8.h();
                    }
                    r4();
                }
                m42.O1 = D2;
                m42.P1 = B2;
                m42.B();
                return;
            }
            return;
        }
        q6 J4 = J4();
        if (J4 != null && (D = a1.g.D(q3Var.r0, q3Var.u0, (length = J4.getEditText().length()), 0)) < (B = a1.g.B(q3Var.r0, q3Var.u0, length, 0))) {
            o2 o2Var9 = this.Q3;
            if (o2Var9 != null) {
                o2Var9.d();
            }
            if (s6.h(J4.getEditText().getText(), D, B)) {
                s6.n(J4.getEditText().getText(), D, B);
                J4.getEditText().f();
                J4.x();
                o2 o2Var10 = this.Q3;
                if (o2Var10 != null) {
                    o2Var10.h();
                }
                r4();
            }
            n1 editText = J4.getEditText();
            editText.O1 = D;
            editText.P1 = B;
            J4.getEditText().B();
        }
    }

    public final a a5() {
        q3 q3Var;
        int i10;
        a T2 = T2();
        return (T2 == null && (q3Var = this.u3) != null && q3Var.x() && (i10 = q3Var.p0) == q3Var.s0) ? B4(i10) : T2;
    }

    public final boolean b2(int i10, int i11) {
        q3 q3Var;
        ArrayList arrayList = this.U3;
        if (arrayList != null && !arrayList.isEmpty()) {
            int max = Math.max(0, Math.min(i10, i11));
            int max2 = Math.max(0, Math.max(i10, i11));
            int[] R3 = R3(max);
            int[] R32 = R3(max2);
            a aVar = (a) this.U3.get(R3[0]);
            if (R3[0] == R32[0] || max == max2) {
                View C1 = C1(aVar);
                if (C1 instanceof q6) {
                    q6 q6Var = (q6) C1;
                    q6Var.B();
                    n1 editText = q6Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.min(R3[1], length), Math.min(R32[1], length));
                }
            } else {
                View C12 = C1(aVar);
                View C13 = C1(this.U3.get(R32[0]));
                if ((C12 instanceof q6) && (C13 instanceof q6)) {
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.s3;
                        int size = arrayList2.size();
                        q3Var = this.u3;
                        if (i12 >= size) {
                            break;
                        }
                        q3Var.X(i12, q6.z(((a) arrayList2.get(i12)).b));
                        i12++;
                    }
                    q6 q6Var2 = (q6) C12;
                    int length2 = q6Var2.getEditText().length();
                    if (R3[1] >= length2) {
                        length2 = Math.max(0, length2 - 1);
                    }
                    if (!q3Var.j0(q6Var2, 0, R3[1], length2)) {
                        q6Var2.B();
                        return true;
                    }
                    q3Var.b0(0, R32[1], (q6) C13);
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList b3(int i10, int i11, int i12, boolean z10) {
        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks;
        boolean z11;
        d4 d4Var;
        int i13;
        int i14;
        ArrayList arrayList = new ArrayList();
        int i15 = i10;
        while (i15 < i11) {
            ArrayList arrayList2 = this.s3;
            a aVar = (a) arrayList2.get(i15);
            boolean z12 = aVar.i;
            ArrayList arrayList3 = aVar.k;
            if (z12) {
                i15++;
            } else if (arrayList3.size() > i12) {
                Long l4 = (Long) arrayList3.get(i12);
                long longValue = l4.longValue();
                int i16 = i15 + 1;
                while (i16 < i11) {
                    a aVar2 = (a) arrayList2.get(i16);
                    if (aVar2.k.size() <= i12 || ((Long) aVar2.k.get(i12)).longValue() != longValue) {
                        break;
                    }
                    i16++;
                }
                ArrayList<TL_iv.PageBlock> b32 = b3(i15, i16, i12 + 1, true);
                if (b32.isEmpty()) {
                    pageblockblockquoteblocks = null;
                } else {
                    TL_iv.RichText richText = (TL_iv.RichText) this.t3.get(l4);
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    if (b32.size() == 1 && (b32.get(0) instanceof TL_iv.pageBlockParagraph)) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.text = b32.get(0).text != null ? b32.get(0).text : new TL_iv.textEmpty();
                        pageblockblockquote.caption = richText;
                        pageblockblockquoteblocks = pageblockblockquote;
                    } else {
                        pageblockblockquoteblocks = new TL_iv.pageBlockBlockquoteBlocks();
                        pageblockblockquoteblocks.blocks = b32;
                        pageblockblockquoteblocks.caption = richText;
                    }
                }
                if (pageblockblockquoteblocks != null) {
                    arrayList.add(pageblockblockquoteblocks);
                }
                i15 = i16;
            } else if (A3(aVar)) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                int S3 = S3(i15);
                pageblockdetails.blocks = b3(i15 + 1, Math.min(S3, i11), i12, true);
                arrayList.add(pageblockdetails);
                i15 = S3 + 1;
            } else {
                int i17 = aVar.c;
                if (i17 <= 0) {
                    M2(aVar, arrayList);
                    i15++;
                    i13 = i11;
                    i14 = i12;
                } else {
                    int[] iArr = {i15};
                    if (aVar.d > 0) {
                        z11 = true;
                        i13 = i11;
                        i14 = i12;
                        d4Var = this;
                    } else {
                        z11 = false;
                        d4Var = this;
                        i13 = i11;
                        i14 = i12;
                    }
                    TL_iv.PageBlock n22 = d4Var.n2(i15, i17, i13, i14, z11, iArr);
                    if (n22 != null) {
                        arrayList.add(n22);
                    }
                    int i18 = iArr[0];
                    i15 = i18 <= 0 ? i13 : i18;
                }
                i11 = i13;
                i12 = i14;
            }
        }
        if (!z10) {
            while (!arrayList.isEmpty() && C3((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && C3((TL_iv.PageBlock) i0.a.g(1, arrayList))) {
                a1.g.x(1, arrayList);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b4(int i10) {
        o2 o2Var;
        int i11;
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        int i12;
        int length;
        int D;
        int B;
        int length2;
        int D2;
        int B2;
        int length3;
        int D3;
        int B3;
        o2 o2Var2;
        int i13;
        q3 q3Var = this.u3;
        if (q3Var != null && q3Var.x()) {
            boolean O3 = O3();
            b4 b4Var = this.o3;
            int i14 = 0;
            if (O3) {
                int i15 = q3Var.p0;
                int i16 = q3Var.q0;
                int i17 = q3Var.t0;
                int i18 = q3Var.r0;
                int i19 = q3Var.u0;
                boolean N3 = N3(i10, i15, i16, i18, i17, i19);
                int z22 = !N3 ? z2(i10) : 0;
                o2 o2Var3 = this.Q3;
                if (o2Var3 != null) {
                    o2Var3.d();
                }
                this.P3 = true;
                int i20 = i16;
                boolean z11 = false;
                while (i20 <= i17) {
                    n1 Q4 = Q4(i15, i20);
                    if (Q4 == null) {
                        i13 = i16;
                    } else {
                        int length4 = Q4.length();
                        int i21 = i20 == i16 ? i18 : 0;
                        int i22 = i20 == i17 ? i19 : length4;
                        if (i16 == i17) {
                            i21 = Math.min(i18, i19);
                            i22 = Math.max(i18, i19);
                        }
                        int i23 = i21;
                        i13 = i16;
                        int max = Math.max(0, Math.min(i23, length4));
                        int max2 = Math.max(0, Math.min(i22, length4));
                        if (max < max2) {
                            if (N3) {
                                Q4.b(i10, max, max2);
                            } else {
                                if (z22 != 0) {
                                    Q4.b(z22, max, max2);
                                }
                                Q4.a(i10, max, max2);
                            }
                            Q4.f();
                            Q4.requestLayout();
                            j4(i15, i20);
                            z11 = true;
                        }
                    }
                    i20++;
                    i16 = i13;
                }
                this.P3 = false;
                if (z11 && (o2Var2 = this.Q3) != null) {
                    o2Var2.h();
                }
                b4Var.r();
                if (z11) {
                    r4();
                }
            } else if (B3()) {
                int i24 = q3Var.p0;
                n1 L2 = L2(i24);
                if (L2 != null && (D3 = a1.g.D(q3Var.r0, q3Var.u0, (length3 = L2.length()), 0)) < (B3 = a1.g.B(q3Var.r0, q3Var.u0, length3, 0))) {
                    boolean z12 = (L2.c(D3, B3) & i10) == 0;
                    o2 o2Var4 = this.Q3;
                    if (o2Var4 != null) {
                        o2Var4.d();
                    }
                    this.P3 = true;
                    if (z12) {
                        int z23 = z2(i10);
                        if (z23 != 0) {
                            L2.b(z23, D3, B3);
                        }
                        L2.a(i10, D3, B3);
                    } else {
                        L2.b(i10, D3, B3);
                    }
                    this.P3 = false;
                    h4(i24);
                    L2.f();
                    L2.requestLayout();
                    o2 o2Var5 = this.Q3;
                    if (o2Var5 != null) {
                        o2Var5.h();
                    }
                    b4Var.r();
                    r4();
                }
            } else if (z3()) {
                int i25 = q3Var.p0;
                n1 v22 = v2(i25);
                if (v22 != null && (D2 = a1.g.D(q3Var.r0, q3Var.u0, (length2 = v22.length()), 0)) < (B2 = a1.g.B(q3Var.r0, q3Var.u0, length2, 0))) {
                    boolean z13 = (v22.c(D2, B2) & i10) == 0;
                    int z24 = z13 ? z2(i10) : 0;
                    o2 o2Var6 = this.Q3;
                    if (o2Var6 != null) {
                        o2Var6.d();
                    }
                    this.P3 = true;
                    if (z13) {
                        if (z24 != 0) {
                            v22.b(z24, D2, B2);
                        }
                        v22.a(i10, D2, B2);
                    } else {
                        v22.b(i10, D2, B2);
                    }
                    v22.f();
                    v22.requestLayout();
                    g4(i25);
                    this.P3 = false;
                    o2 o2Var7 = this.Q3;
                    if (o2Var7 != null) {
                        o2Var7.h();
                    }
                    b4Var.r();
                    r4();
                }
            } else if (J3()) {
                int i26 = q3Var.p0;
                n1 m42 = m4(i26);
                if (m42 != null && (D = a1.g.D(q3Var.r0, q3Var.u0, (length = m42.length()), 0)) < (B = a1.g.B(q3Var.r0, q3Var.u0, length, 0))) {
                    boolean z14 = (m42.c(D, B) & i10) == 0;
                    int z25 = z14 ? z2(i10) : 0;
                    o2 o2Var8 = this.Q3;
                    if (o2Var8 != null) {
                        o2Var8.d();
                    }
                    this.P3 = true;
                    if (z14) {
                        if (z25 != 0) {
                            m42.b(z25, D, B);
                        }
                        m42.a(i10, D, B);
                    } else {
                        m42.b(i10, D, B);
                    }
                    m42.f();
                    m42.requestLayout();
                    i4(i26);
                    this.P3 = false;
                    o2 o2Var9 = this.Q3;
                    if (o2Var9 != null) {
                        o2Var9.h();
                    }
                    b4Var.r();
                    r4();
                }
            } else {
                int i27 = q3Var.p0;
                int i28 = q3Var.s0;
                int i29 = q3Var.r0;
                int i30 = q3Var.u0;
                if (i27 >= 0 && i28 >= 0 && i28 >= i27 && i28 < this.w4.size()) {
                    int i31 = i10;
                    boolean M3 = M3(i31, i27, i29, i28, i30);
                    boolean z15 = !M3;
                    int z26 = !M3 ? z2(i31) : 0;
                    o2 o2Var10 = this.Q3;
                    if (o2Var10 != null) {
                        o2Var10.d();
                    }
                    this.P3 = true;
                    int i32 = i27;
                    boolean z16 = false;
                    while (i32 <= i28) {
                        a B4 = B4(i32);
                        if (B4 != null) {
                            TL_iv.PageBlock pageBlock = B4.b;
                            if (D3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                                int l22 = l2(i32);
                                int i33 = i32 == i27 ? i29 : i14;
                                z10 = z16;
                                int i34 = i32 == i28 ? i30 : l22;
                                int max3 = Math.max(i14, Math.min(i33, l22));
                                int max4 = Math.max(i14, Math.min(i34, l22));
                                if (max3 >= max4) {
                                    i11 = z26;
                                    z16 = z10;
                                    i32++;
                                    i31 = i10;
                                    z26 = i11;
                                    i14 = 0;
                                } else {
                                    q6 x22 = x2(i32);
                                    if (x22 != null) {
                                        org.telegram.ui.ActionBar.r4 styleDelegate = x22.getStyleDelegate();
                                        if (M3) {
                                            styleDelegate.b(i31, max3, max4);
                                        } else {
                                            if (z26 != 0) {
                                                styleDelegate.b(z26, max3, max4);
                                            }
                                            styleDelegate.a(i31, max3, max4);
                                        }
                                        x22.getEditText().f();
                                        x22.getEditText().requestLayout();
                                        x22.x();
                                        i11 = z26;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(q6.A(B4.b));
                                        if (M3 || z26 == 0) {
                                            i11 = z26;
                                            spannableStringBuilder = spannableStringBuilder2;
                                            i12 = max3;
                                        } else {
                                            i11 = z26;
                                            i12 = max3;
                                            s6.o(spannableStringBuilder2, i12, max4, i11, false, null);
                                            spannableStringBuilder = spannableStringBuilder2;
                                        }
                                        s6.o(spannableStringBuilder, i12, max4, i31, z15, null);
                                        q6.d(B4.b, spannableStringBuilder);
                                    }
                                    z16 = true;
                                    i32++;
                                    i31 = i10;
                                    z26 = i11;
                                    i14 = 0;
                                }
                            }
                        }
                        i11 = z26;
                        z10 = z16;
                        z16 = z10;
                        i32++;
                        i31 = i10;
                        z26 = i11;
                        i14 = 0;
                    }
                    boolean z17 = z16;
                    this.P3 = i14;
                    if (z17 && (o2Var = this.Q3) != null) {
                        o2Var.h();
                    }
                    b4Var.r();
                    if (z17) {
                        r4();
                    }
                }
            }
        }
    }

    public final void b5(float f7, float f10) {
        TL_iv.pageTableCell o10;
        z5 z5Var = this.p4;
        if (!this.I3 || z5Var == null || this.E3 != z5Var || (o10 = z5Var.o((int) ((f7 - z5Var.getLeft()) - getLeft()), (int) ((f10 - z5Var.getTop()) - getTop()))) == null || o10 == this.L3) {
            return;
        }
        this.L3 = o10;
        z5Var.y(this.K3, o10);
    }

    public final ArrayList c3() {
        return b3(0, this.s3.size(), 0, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c4(View view) {
        n1 editText;
        n1 n1Var;
        d4 d4Var;
        c4 c4Var = null;
        if (o2()) {
            boolean O3 = O3();
            q3 q3Var = this.u3;
            if (O3) {
                int i10 = q3Var.p0;
                int i11 = q3Var.q0;
                if (i11 == q3Var.t0) {
                    editText = Q4(i10, i11);
                    n1Var = editText;
                    if (n1Var != null) {
                        int length = n1Var.length();
                        d4Var = this;
                        c4Var = new c4(d4Var, n1Var, a1.g.D(q3Var.r0, q3Var.u0, length, 0), a1.g.B(q3Var.r0, q3Var.u0, length, 0), null);
                    }
                }
            } else {
                if (B3()) {
                    editText = L2(q3Var.p0);
                } else if (z3()) {
                    editText = v2(q3Var.p0);
                } else if (J3()) {
                    editText = m4(q3Var.p0);
                } else {
                    q6 J4 = J4();
                    if (J4 != null) {
                        editText = J4.getEditText();
                    }
                }
                n1Var = editText;
                if (n1Var != null) {
                }
            }
            if (c4Var == null) {
                r3(false);
                d4Var.o3.N(c4Var, view);
                return;
            }
            return;
        }
        d4Var = this;
        if (c4Var == null) {
        }
    }

    public final void c5(a aVar, String str) {
        a aVar2;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (TextUtils.equals(pageblockpreformatted.language, str)) {
                    return;
                }
                o2 o2Var = this.Q3;
                if (o2Var != null) {
                    o2Var.d();
                }
                pageblockpreformatted.language = str;
                q6 x22 = x2(this.s3.indexOf(aVar));
                if (x22 != null && (aVar2 = x22.y) != null) {
                    x22.J(aVar2.b, true);
                    x22.H = null;
                    x22.C();
                }
                o2 o2Var2 = this.Q3;
                if (o2Var2 != null) {
                    o2Var2.h();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d2() {
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            ArrayList arrayList6 = this.s3;
            if (i15 >= arrayList6.size()) {
                return;
            }
            a aVar = (a) arrayList6.get(i15);
            ArrayList arrayList7 = aVar.j;
            ArrayList arrayList8 = aVar.k;
            arrayList7.clear();
            int i16 = 1;
            if (aVar.i) {
                if (!arrayList.isEmpty()) {
                    a1.g.x(1, arrayList);
                }
                arrayList2.clear();
                arrayList3.clear();
                arrayList4.clear();
                arrayList5.clear();
                i13 = i14;
            } else {
                for (int i17 = i14; i17 < arrayList8.size(); i17++) {
                    ((Long) arrayList8.get(i17)).getClass();
                    arrayList7.add(new r0());
                }
                for (int i18 = i14; i18 < arrayList.size(); i18++) {
                    arrayList7.add((r0) arrayList.get(i18));
                }
                int max = Math.max(i14, aVar.c);
                if (max == 0) {
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                } else {
                    int i19 = aVar.d > 0 ? 1 : i14;
                    while (arrayList2.size() > max) {
                        arrayList2.remove(arrayList2.size() - 1);
                        arrayList3.remove(arrayList3.size() - 1);
                        arrayList4.remove(arrayList4.size() - 1);
                        arrayList5.remove(arrayList5.size() - 1);
                    }
                    int i20 = 1;
                    while (i20 <= max) {
                        int i21 = i20 - 1;
                        if (i20 == max) {
                            i11 = i14;
                            i10 = i16;
                        } else {
                            i10 = i14;
                            i11 = i10;
                        }
                        int i22 = i21 < arrayList2.size() ? i16 : i11;
                        if (i22 == 0 || i10 == 0) {
                            i12 = i16;
                        } else {
                            i12 = i16;
                            if (((Boolean) arrayList3.get(i21)).booleanValue() != i19) {
                                i22 = i11;
                            }
                        }
                        if (i22 == 0) {
                            while (arrayList2.size() > i21) {
                                arrayList2.remove(arrayList2.size() - 1);
                                arrayList3.remove(arrayList3.size() - 1);
                                arrayList4.remove(arrayList4.size() - 1);
                                arrayList5.remove(arrayList5.size() - 1);
                            }
                            arrayList2.add(Long.valueOf(r0.a()));
                            arrayList3.add(Boolean.valueOf(i10 != 0 ? i19 : i11));
                            arrayList4.add(Integer.valueOf(i11));
                            arrayList5.add(0L);
                        }
                        ((Long) arrayList2.get(i21)).getClass();
                        if (i10 != 0) {
                            if (((((Long) arrayList5.get(i21)).longValue() == 0 || !H3(aVar.b)) ? i12 : i11) != 0) {
                                arrayList4.set(i21, Integer.valueOf(((Integer) arrayList4.get(i21)).intValue() + 1));
                                arrayList5.set(i21, Long.valueOf(aVar.a));
                            } else {
                                ((Integer) arrayList4.get(i21)).getClass();
                                ((Long) arrayList5.get(i21)).getClass();
                            }
                            arrayList7.add(new r0());
                        } else {
                            ((Boolean) arrayList3.get(i21)).getClass();
                            arrayList7.add(new r0());
                        }
                        i20++;
                        i14 = i11;
                        i16 = i12;
                    }
                }
                i13 = i14;
                if (A3(aVar)) {
                    boolean z10 = ((TL_iv.pageBlockDetails) aVar.b).open;
                    r0.a();
                    arrayList.add(new r0());
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                }
                if (q6.p(aVar.b)) {
                    r0.a();
                    arrayList7.add(new r0());
                }
            }
            i15++;
            i14 = i13;
        }
    }

    public final boolean d3() {
        ArrayList arrayList = this.s3;
        a aVar = arrayList.isEmpty() ? null : (a) i0.a.g(1, arrayList);
        if (aVar != null && !H3(aVar.b) && !aVar.i && !A3(aVar) && !N2(aVar.b)) {
            if (!(C1(aVar) instanceof q6)) {
                return false;
            }
            h3(aVar);
            return true;
        }
        o2 o2Var = this.Q3;
        if (o2Var != null) {
            o2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(aVar2);
        this.f3.O(false);
        o2 o2Var2 = this.Q3;
        if (o2Var2 != null) {
            o2Var2.h();
        }
        post(new v2(this, aVar2, 21));
        return true;
    }

    public final void d4() {
        int length;
        int D;
        int B;
        int length2;
        int D2;
        int B2;
        int length3;
        int D3;
        int B3;
        int length4;
        int D4;
        int B4;
        n1 Q4;
        int length5;
        int D5;
        int B5;
        boolean O3 = O3();
        b4 b4Var = this.o3;
        q3 q3Var = this.u3;
        if (O3) {
            int i10 = q3Var.p0;
            int i11 = q3Var.q0;
            if (i11 == q3Var.t0 && (Q4 = Q4(i10, i11)) != null && (D5 = a1.g.D(q3Var.r0, q3Var.u0, (length5 = Q4.length()), 0)) < (B5 = a1.g.B(q3Var.r0, q3Var.u0, length5, 0))) {
                if (s6.h(Q4.getText(), D5, B5)) {
                    o2 o2Var = this.Q3;
                    if (o2Var != null) {
                        o2Var.d();
                    }
                    s6.n(Q4.getText(), D5, B5);
                    Q4.f();
                    j4(i10, i11);
                    o2 o2Var2 = this.Q3;
                    if (o2Var2 != null) {
                        o2Var2.h();
                    }
                    b4Var.r();
                    r4();
                    return;
                }
                o2 o2Var3 = this.Q3;
                if (o2Var3 != null) {
                    o2Var3.d();
                }
                if (s6.g(Q4.getText(), D5, B5)) {
                    s6.m(Q4.getText(), D5, B5);
                    Q4.f();
                    j4(i10, i11);
                    o2 o2Var4 = this.Q3;
                    if (o2Var4 != null) {
                        o2Var4.h();
                    }
                    r4();
                }
                Q4.O1 = D5;
                Q4.P1 = B5;
                r3(false);
                H4(Q4);
                return;
            }
            return;
        }
        if (B3()) {
            int i12 = q3Var.p0;
            n1 L2 = L2(i12);
            if (L2 != null && (D4 = a1.g.D(q3Var.r0, q3Var.u0, (length4 = L2.length()), 0)) < (B4 = a1.g.B(q3Var.r0, q3Var.u0, length4, 0))) {
                if (s6.h(L2.getText(), D4, B4)) {
                    o2 o2Var5 = this.Q3;
                    if (o2Var5 != null) {
                        o2Var5.d();
                    }
                    s6.n(L2.getText(), D4, B4);
                    L2.f();
                    h4(i12);
                    o2 o2Var6 = this.Q3;
                    if (o2Var6 != null) {
                        o2Var6.h();
                    }
                    b4Var.r();
                    r4();
                    return;
                }
                o2 o2Var7 = this.Q3;
                if (o2Var7 != null) {
                    o2Var7.d();
                }
                if (s6.g(L2.getText(), D4, B4)) {
                    s6.m(L2.getText(), D4, B4);
                    L2.f();
                    h4(i12);
                    o2 o2Var8 = this.Q3;
                    if (o2Var8 != null) {
                        o2Var8.h();
                    }
                    r4();
                }
                L2.O1 = D4;
                L2.P1 = B4;
                r3(false);
                H4(L2);
                return;
            }
            return;
        }
        if (z3()) {
            int i13 = q3Var.p0;
            n1 v22 = v2(i13);
            if (v22 != null && (D3 = a1.g.D(q3Var.r0, q3Var.u0, (length3 = v22.length()), 0)) < (B3 = a1.g.B(q3Var.r0, q3Var.u0, length3, 0))) {
                if (s6.h(v22.getText(), D3, B3)) {
                    o2 o2Var9 = this.Q3;
                    if (o2Var9 != null) {
                        o2Var9.d();
                    }
                    s6.n(v22.getText(), D3, B3);
                    v22.f();
                    g4(i13);
                    o2 o2Var10 = this.Q3;
                    if (o2Var10 != null) {
                        o2Var10.h();
                    }
                    b4Var.r();
                    r4();
                    return;
                }
                o2 o2Var11 = this.Q3;
                if (o2Var11 != null) {
                    o2Var11.d();
                }
                if (s6.g(v22.getText(), D3, B3)) {
                    s6.m(v22.getText(), D3, B3);
                    v22.f();
                    g4(i13);
                    o2 o2Var12 = this.Q3;
                    if (o2Var12 != null) {
                        o2Var12.h();
                    }
                    r4();
                }
                v22.O1 = D3;
                v22.P1 = B3;
                r3(false);
                H4(v22);
                return;
            }
            return;
        }
        if (J3()) {
            int i14 = q3Var.p0;
            n1 m42 = m4(i14);
            if (m42 != null && (D2 = a1.g.D(q3Var.r0, q3Var.u0, (length2 = m42.length()), 0)) < (B2 = a1.g.B(q3Var.r0, q3Var.u0, length2, 0))) {
                if (s6.h(m42.getText(), D2, B2)) {
                    o2 o2Var13 = this.Q3;
                    if (o2Var13 != null) {
                        o2Var13.d();
                    }
                    s6.n(m42.getText(), D2, B2);
                    m42.f();
                    i4(i14);
                    o2 o2Var14 = this.Q3;
                    if (o2Var14 != null) {
                        o2Var14.h();
                    }
                    b4Var.r();
                    r4();
                    return;
                }
                o2 o2Var15 = this.Q3;
                if (o2Var15 != null) {
                    o2Var15.d();
                }
                if (s6.g(m42.getText(), D2, B2)) {
                    s6.m(m42.getText(), D2, B2);
                    m42.f();
                    i4(i14);
                    o2 o2Var16 = this.Q3;
                    if (o2Var16 != null) {
                        o2Var16.h();
                    }
                    r4();
                }
                m42.O1 = D2;
                m42.P1 = B2;
                r3(false);
                H4(m42);
                return;
            }
            return;
        }
        q6 J4 = J4();
        if (J4 != null && (D = a1.g.D(q3Var.r0, q3Var.u0, (length = J4.getEditText().length()), 0)) < (B = a1.g.B(q3Var.r0, q3Var.u0, length, 0))) {
            if (s6.h(J4.getEditText().getText(), D, B)) {
                o2 o2Var17 = this.Q3;
                if (o2Var17 != null) {
                    o2Var17.d();
                }
                s6.n(J4.getEditText().getText(), D, B);
                J4.getEditText().f();
                J4.x();
                o2 o2Var18 = this.Q3;
                if (o2Var18 != null) {
                    o2Var18.h();
                }
                b4Var.r();
                r4();
                return;
            }
            o2 o2Var19 = this.Q3;
            if (o2Var19 != null) {
                o2Var19.d();
            }
            if (s6.g(J4.getEditText().getText(), D, B)) {
                s6.m(J4.getEditText().getText(), D, B);
                J4.getEditText().f();
                J4.x();
                o2 o2Var20 = this.Q3;
                if (o2Var20 != null) {
                    o2Var20.h();
                }
                r4();
            }
            n1 editText = J4.getEditText();
            editText.O1 = D;
            editText.P1 = B;
            r3(false);
            H4(J4.getEditText());
        }
    }

    @Override // org.telegram.ui.Components.u51, org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i10;
        Long l4;
        a aVar;
        View view;
        Long l10;
        int i11;
        int i12;
        ArrayList arrayList2;
        a aVar2;
        a aVar3;
        float f7;
        a aVar4;
        boolean z10;
        int childCount = getChildCount();
        if (childCount != 0) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                arrayList = this.w4;
                if (i13 >= childCount) {
                    break;
                }
                int R = RecyclerView.R(getChildAt(i13));
                a aVar5 = (R < 0 || R >= arrayList.size()) ? null : (a) arrayList.get(R);
                if (aVar5 != null) {
                    ArrayList arrayList3 = aVar5.k;
                    if (arrayList3.size() > i14) {
                        i14 = arrayList3.size();
                    }
                }
                i13++;
            }
            if (i14 != 0) {
                if (this.x4 == null) {
                    dl0 dl0Var = new dl0(this);
                    this.x4 = dl0Var;
                    dl0Var.a(null, null, null, this.n3, 1);
                    v7.a5.a(this.x4, this.n3);
                }
                int i15 = 0;
                while (i15 < i14) {
                    float f10 = 0.0f;
                    long j10 = 0;
                    int i16 = 0;
                    boolean z11 = false;
                    a aVar6 = null;
                    a aVar7 = null;
                    float f11 = 1.0f;
                    float f12 = 0.0f;
                    while (i16 <= childCount) {
                        if (i16 < childCount) {
                            View childAt = getChildAt(i16);
                            int R2 = RecyclerView.R(childAt);
                            aVar = (R2 < 0 || R2 >= arrayList.size()) ? null : (a) arrayList.get(R2);
                            if (aVar != null) {
                                ArrayList arrayList4 = aVar.k;
                                if (i15 < arrayList4.size()) {
                                    l4 = (Long) arrayList4.get(i15);
                                    i10 = childCount;
                                    view = childAt;
                                }
                            }
                            i10 = childCount;
                            view = childAt;
                            l4 = null;
                        } else {
                            i10 = childCount;
                            l4 = null;
                            aVar = null;
                            view = null;
                        }
                        if (!z11 || (l4 != null && l4.longValue() == j10)) {
                            l10 = l4;
                            i11 = i15;
                            i12 = i14;
                            arrayList2 = arrayList;
                            aVar2 = aVar6;
                            aVar3 = aVar7;
                            f7 = f11;
                        } else {
                            int n42 = n4(i15, aVar6, true);
                            l10 = l4;
                            int n43 = n4(i15, aVar7, false);
                            if (f12 - f10 <= org.telegram.messenger.i0.L(4.0f)) {
                                i11 = i15;
                                i12 = i14;
                                arrayList2 = arrayList;
                            } else {
                                int L = org.telegram.messenger.i0.L(16.0f) * i15;
                                i11 = i15;
                                int L2 = org.telegram.messenger.i0.L(16.0f) + L;
                                i12 = i14;
                                arrayList2 = arrayList;
                                int z12 = org.telegram.messenger.m5.z(16.0f, getWidth(), L);
                                if (z12 - L2 > org.telegram.messenger.i0.L(8.0f)) {
                                    float floor = (float) Math.floor(tz.Y0 / 3.0f);
                                    RectF rectF = org.telegram.messenger.i0.P;
                                    rectF.set(L2, n42 + f10, z12, f12 - n43);
                                    aVar2 = aVar6;
                                    aVar3 = aVar7;
                                    this.x4.c(floor, floor, floor, f11, canvas, rectF);
                                    f7 = f11;
                                    this.x4.f(canvas, rectF, f7);
                                    z11 = false;
                                }
                            }
                            aVar2 = aVar6;
                            aVar3 = aVar7;
                            f7 = f11;
                            z11 = false;
                        }
                        if (view == null || l10 == null) {
                            aVar7 = aVar3;
                            f11 = f7;
                            aVar4 = aVar2;
                        } else {
                            if (z11) {
                                aVar4 = aVar2;
                                z10 = z11;
                            } else {
                                j10 = l10.longValue();
                                f10 = Float.MAX_VALUE;
                                f12 = -3.4028235E38f;
                                aVar4 = aVar;
                                z10 = true;
                                f7 = 1.0f;
                            }
                            if (aVar == null || aVar != this.Z3) {
                                float y3 = view.getY();
                                float height = view.getHeight() + y3;
                                if (y3 < f10) {
                                    f10 = y3;
                                }
                                if (height > f12) {
                                    f12 = height;
                                }
                                f11 = Math.min(f7, view.getAlpha());
                                z11 = z10;
                            } else {
                                z11 = z10;
                                f11 = f7;
                            }
                            aVar7 = aVar;
                        }
                        i16++;
                        aVar6 = aVar4;
                        childCount = i10;
                        i15 = i11;
                        i14 = i12;
                        arrayList = arrayList2;
                    }
                    i15++;
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e2(jj jjVar) {
        TLRPC.Document F0;
        if (jjVar == null || (F0 = jjVar.F0()) == null) {
            return;
        }
        o2 o2Var = this.Q3;
        if (o2Var != null) {
            o2Var.d();
        }
        TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
        a aVar = new a(pageblockaudio, 0, 0);
        w wVar = new w();
        aVar.g = wVar;
        wVar.c = true;
        long j10 = F0.id;
        boolean z10 = j10 == 0 || F0.dc_id == 0 || F0.access_hash == 0;
        if (z10) {
            TLRPC.Message message = jjVar.k;
            String str = message != null ? message.attachPath : null;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            w wVar2 = aVar.g;
            wVar2.i = F0;
            wVar2.e = str;
            wVar2.a = 1;
            wVar2.f = 0.0f;
        } else {
            wVar.h = F0;
            wVar.i = F0;
            wVar.a = 2;
            pageblockaudio.audio_id = j10;
        }
        x3(aVar);
        if (z10) {
            w wVar3 = aVar.g;
            String str2 = wVar3.e;
            IdentityHashMap identityHashMap = this.g4;
            l5 l5Var = (l5) identityHashMap.remove(wVar3);
            if (l5Var != null) {
                l5Var.b();
            }
            l5 l5Var2 = new l5(this.m3, str2, F0, new o3(aVar, wVar3, this));
            identityHashMap.put(wVar3, l5Var2);
            l5Var2.d();
        }
        o2 o2Var2 = this.Q3;
        if (o2Var2 != null) {
            o2Var2.h();
        }
        this.o3.onContentChanged();
    }

    public final void e3(a aVar, boolean z10) {
        View C1 = C1(aVar);
        if (!(C1 instanceof r5)) {
            f3(aVar, z10);
            return;
        }
        n1 n1Var = ((r5) C1).r;
        n1Var.N();
        n1Var.setSelection(z10 ? n1Var.length() : 0);
    }

    public final void e4() {
        n1 editText;
        Runnable r2Var;
        int length;
        final int D;
        final int B;
        q3 q3Var = this.u3;
        if (q3Var == null || !q3Var.x()) {
            return;
        }
        int i10 = 1;
        int i11 = 0;
        if (O3()) {
            int i12 = q3Var.p0;
            int i13 = q3Var.q0;
            if (i13 != q3Var.t0) {
                return;
            }
            editText = Q4(i12, i13);
            r2Var = new w2(this, i12, i13, 1);
        } else if (B3()) {
            int i14 = q3Var.p0;
            editText = L2(i14);
            r2Var = new q2(this, i14, 3);
        } else if (z3()) {
            int i15 = q3Var.p0;
            editText = v2(i15);
            r2Var = new q2(this, i15, i11);
        } else if (J3()) {
            int i16 = q3Var.p0;
            editText = m4(i16);
            r2Var = new q2(this, i16, i10);
        } else {
            q6 J4 = J4();
            if (J4 == null) {
                return;
            }
            editText = J4.getEditText();
            r2Var = new r2(J4, i11);
        }
        final n1 n1Var = editText;
        final Runnable runnable = r2Var;
        if (n1Var != null && (D = a1.g.D(q3Var.r0, q3Var.u0, (length = n1Var.length()), 0)) <= (B = a1.g.B(q3Var.r0, q3Var.u0, length, 0))) {
            Editable text = n1Var.getText();
            int i17 = v.h;
            String str = null;
            if (text != null) {
                v[] vVarArr = (v[]) text.getSpans(D, B, v.class);
                if (vVarArr.length > 0) {
                    str = vVarArr[0].a;
                }
            }
            if (str == null) {
                str = n1Var.getText().subSequence(D, B).toString();
            }
            final float L = org.telegram.messenger.i0.L(tz.W0 + 4);
            int i18 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.p6 p6Var = this.n3;
            final int w02 = org.telegram.ui.ActionBar.t6.w0(i18, p6Var);
            t.X(getContext(), str, new q20() { // from class: bi.f3
                @Override // org.telegram.messenger.q20
                public final void a(Object obj) {
                    v a2;
                    String str2 = (String) obj;
                    d4 d4Var = d4.this;
                    d4Var.getClass();
                    if (TextUtils.isEmpty(str2) || (a2 = v.a(str2, w02, L)) == null) {
                        return;
                    }
                    o2 o2Var = d4Var.Q3;
                    if (o2Var != null) {
                        o2Var.d();
                    }
                    q3 q3Var2 = d4Var.u3;
                    if (q3Var2 != null) {
                        q3Var2.f(false);
                    }
                    n1 n1Var2 = n1Var;
                    n1Var2.setLocked(false);
                    SpannableString spannableString = new SpannableString(" ");
                    spannableString.setSpan(a2, 0, 1, 33);
                    Editable text2 = n1Var2.getText();
                    int max = Math.max(0, Math.min(D, text2.length()));
                    text2.replace(max, Math.max(max, Math.min(B, text2.length())), spannableString);
                    runnable.run();
                    o2 o2Var2 = d4Var.Q3;
                    if (o2Var2 != null) {
                        o2Var2.h();
                    }
                    d4Var.o3.onContentChanged();
                    int min = Math.min(max + 1, n1Var2.length());
                    n1Var2.N();
                    d4Var.post(new d3(n1Var2, min, 3));
                }
            }, p6Var);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(1:9)(1:(7:44|11|12|13|14|15|(4:34|18|19|(1:29)(4:21|(1:23)(1:28)|24|26)))(1:43))|10|11|12|13|14|15|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        org.telegram.messenger.f8.g(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0080, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072 A[Catch: Exception -> 0x007e, TRY_LEAVE, TryCatch #2 {Exception -> 0x007e, blocks: (B:15:0x005f, B:34:0x0072), top: B:14:0x005f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e5(CharSequence charSequence) {
        boolean z10;
        String str;
        ClipboardManager clipboardManager;
        int i10;
        int i11;
        int i12;
        q3 q3Var = this.u3;
        a B4 = B4(q3Var.p0);
        ArrayList arrayList = this.s3;
        int indexOf = arrayList.indexOf(B4);
        int indexOf2 = arrayList.indexOf(B4(q3Var.s0));
        int i13 = q3Var.r0;
        int i14 = q3Var.u0;
        try {
            if (indexOf < 0 || indexOf2 < 0 || indexOf >= arrayList.size() || indexOf2 >= arrayList.size()) {
                z10 = true;
            } else {
                if (indexOf > indexOf2) {
                    i12 = i14;
                    i11 = indexOf2;
                } else if (indexOf != indexOf2 || i13 <= i14) {
                    i10 = i14;
                    i11 = indexOf;
                    indexOf = indexOf2;
                    i12 = i13;
                    HashMap hashMap = this.t3;
                    StringBuilder sb2 = new StringBuilder();
                    j4 j4Var = new j4();
                    int i15 = indexOf;
                    int i16 = indexOf;
                    z10 = true;
                    l4.F(sb2, arrayList, new int[]{i11}, i16, i11, i15, i12, i10, j4Var, false, 0, hashMap);
                    j4Var.b(sb2);
                    str = sb2.toString();
                    if (!TextUtils.isEmpty(str)) {
                        g5.a(D2(i11, i16), C2(i11, i16));
                        clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
                        if (clipboardManager == null) {
                            return;
                        }
                        clipboardManager.setPrimaryClip(str != null ? ClipData.newHtmlText("label", charSequence, str) : ClipData.newPlainText("label", charSequence));
                        return;
                    }
                } else {
                    i12 = i14;
                    i11 = indexOf;
                    indexOf = indexOf2;
                }
                i10 = i13;
                HashMap hashMap2 = this.t3;
                StringBuilder sb22 = new StringBuilder();
                j4 j4Var2 = new j4();
                int i152 = indexOf;
                int i162 = indexOf;
                z10 = true;
                l4.F(sb22, arrayList, new int[]{i11}, i162, i11, i152, i12, i10, j4Var2, false, 0, hashMap2);
                j4Var2.b(sb22);
                str = sb22.toString();
                if (!TextUtils.isEmpty(str)) {
                }
            }
            clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
            }
        } catch (Exception e) {
            f8.g(e, z10);
            return;
        }
        str = null;
    }

    public final void f2(String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            TLRPC.TL_document tL_document = new TLRPC.TL_document();
            tL_document.id = 0L;
            tL_document.dc_id = 0;
            tL_document.size = file.length();
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            String mimeTypeFromExtension = (lastIndexOf < 0 || (i10 = lastIndexOf + 1) >= name.length()) ? null : MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(i10).toLowerCase());
            if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                mimeTypeFromExtension = "application/octet-stream";
            }
            tL_document.mime_type = mimeTypeFromExtension;
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = name;
            tL_document.attributes.add(tL_documentAttributeFilename);
            g2(tL_document, str);
        }
    }

    public final void f3(a aVar, boolean z10) {
        View C1 = C1(aVar);
        if (!(C1 instanceof z5)) {
            if (z10 && (C1 instanceof q6)) {
                q6 q6Var = (q6) C1;
                if (q6Var.n()) {
                    q6Var.i();
                    return;
                }
            }
            n1 U3 = U3(C1);
            if (U3 == null) {
                g3(aVar);
                return;
            }
            U3.N();
            if (z10) {
                U3.setSelection(U3.length());
                return;
            }
            return;
        }
        z5 z5Var = (z5) C1;
        n1 n1Var = z5Var.r;
        w6 w6Var = z5Var.F;
        if (w6Var == null) {
            return;
        }
        if (!z10) {
            n1Var.N();
            n1Var.setSelection(0);
        } else {
            if (w6Var.g.isEmpty()) {
                return;
            }
            c6 m10 = z5Var.w.m((TL_iv.pageTableCell) i0.a.g(1, z5Var.F.g));
            if (m10 == null) {
                return;
            }
            n1 n1Var2 = m10.a;
            n1Var2.N();
            n1Var2.setSelection(n1Var2.length());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f4() {
        ClipData primaryClip;
        String str;
        boolean isEmpty;
        d4 d4Var;
        HashMap hashMap;
        ArrayList z42;
        CharSequence coerceToText;
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (clipboardManager == null || !clipboardManager.hasPrimaryClip() || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getItemCount() == 0) {
            return;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        if (primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
            try {
                str = itemAt.getHtmlText();
            } catch (Exception unused) {
            }
            isEmpty = TextUtils.isEmpty(str);
            q3 q3Var = this.u3;
            if (!isEmpty) {
                try {
                    hashMap = new HashMap();
                    z42 = z4(l4.z(str, hashMap));
                } catch (Exception e) {
                    e = e;
                    d4Var = this;
                }
                if (!z42.isEmpty()) {
                    ArrayList arrayList = this.s3;
                    d4Var = this;
                    try {
                        if (d4Var.L4(arrayList.indexOf(B4(q3Var.p0)), arrayList.indexOf(B4(q3Var.s0)), q3Var.r0, q3Var.u0, z42)) {
                            if (hashMap.isEmpty()) {
                                return;
                            }
                            d4Var.t3.putAll(hashMap);
                            return;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        f8.g(e, true);
                        coerceToText = itemAt.coerceToText(getContext());
                        if (coerceToText == null) {
                        }
                        d4Var.Z1(q3Var.p0, q3Var.r0, q3Var.s0, q3Var.u0, coerceToText.toString().split("\n", -1));
                    }
                    coerceToText = itemAt.coerceToText(getContext());
                    if (coerceToText == null) {
                        coerceToText = "";
                    }
                    d4Var.Z1(q3Var.p0, q3Var.r0, q3Var.s0, q3Var.u0, coerceToText.toString().split("\n", -1));
                }
            }
            d4Var = this;
            coerceToText = itemAt.coerceToText(getContext());
            if (coerceToText == null) {
            }
            d4Var.Z1(q3Var.p0, q3Var.r0, q3Var.s0, q3Var.u0, coerceToText.toString().split("\n", -1));
        }
        str = null;
        isEmpty = TextUtils.isEmpty(str);
        q3 q3Var2 = this.u3;
        if (!isEmpty) {
        }
        d4Var = this;
        coerceToText = itemAt.coerceToText(getContext());
        if (coerceToText == null) {
        }
        d4Var.Z1(q3Var2.p0, q3Var2.r0, q3Var2.s0, q3Var2.u0, coerceToText.toString().split("\n", -1));
    }

    public final void g2(TLRPC.Document document, String str) {
        if (document == null) {
            return;
        }
        o2 o2Var = this.Q3;
        if (o2Var != null) {
            o2Var.d();
        }
        TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
        a aVar = new a(pageblockdocument, 0, 0);
        w wVar = new w();
        aVar.g = wVar;
        wVar.d = true;
        long j10 = document.id;
        boolean z10 = j10 == 0 || document.dc_id == 0 || document.access_hash == 0;
        if (!z10) {
            wVar.h = document;
            wVar.a = 2;
            pageblockdocument.document_id = j10;
        } else {
            if (TextUtils.isEmpty(str) || !sc.e.x(str)) {
                return;
            }
            w wVar2 = aVar.g;
            wVar2.h = document;
            wVar2.e = str;
            wVar2.a = 1;
            wVar2.f = 0.0f;
        }
        x3(aVar);
        if (z10) {
            w wVar3 = aVar.g;
            IdentityHashMap identityHashMap = this.g4;
            l5 l5Var = (l5) identityHashMap.remove(wVar3);
            if (l5Var != null) {
                l5Var.b();
            }
            l5 l5Var2 = new l5(this.m3, str, document, new n3(this, wVar3, aVar, str));
            identityHashMap.put(wVar3, l5Var2);
            l5Var2.d();
        }
        o2 o2Var2 = this.Q3;
        if (o2Var2 != null) {
            o2Var2.h();
        }
        this.o3.onContentChanged();
    }

    public final void g3(a aVar) {
        View C1 = C1(aVar);
        if (C1 instanceof q6) {
            ((q6) C1).B();
        } else if (C1 instanceof y0) {
            ((y0) C1).d.N();
        }
    }

    public final void g4(int i10) {
        KeyEvent.Callback D4 = D4(i10);
        if (D4 instanceof o0) {
            ((o0) D4).b();
        }
    }

    public n1 getFocusedEditTextOrNull() {
        View findFocus = findFocus();
        if (findFocus instanceof n1) {
            return (n1) findFocus;
        }
        return null;
    }

    public w4 getMapDelegate() {
        return this.k4;
    }

    public View getOverlayView() {
        return this.v3;
    }

    public k9 getTextSelectionHelper() {
        return this.u3;
    }

    public final void h2(Uri uri) {
        if (uri == null) {
            return;
        }
        a aVar = this.i4;
        String str = null;
        this.i4 = null;
        Context context = getContext();
        if (context == null) {
            return;
        }
        try {
            str = context.getContentResolver().getType(uri);
        } catch (Exception e) {
            f8.g(e, true);
        }
        String str2 = str;
        boolean startsWith = str2 != null ? str2.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND) : uri.toString().contains(MediaStreamTrack.VIDEO_TRACK_KIND);
        int i10 = this.y4;
        this.y4 = i10 - 1;
        Utilities.e.c(new y2(this, uri, startsWith, str2, i10, aVar));
    }

    public final void h3(a aVar) {
        View C1 = C1(aVar);
        if (C1 instanceof q6) {
            q6 q6Var = (q6) C1;
            q6Var.B();
            n1 editText = q6Var.getEditText();
            editText.setSelection(editText.length());
            return;
        }
        if (C1 instanceof y0) {
            y0 y0Var = (y0) C1;
            y0Var.d.N();
            n1 editText2 = y0Var.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    public final void h4(int i10) {
        a B4 = B4(i10);
        n1 L2 = L2(i10);
        if (!A3(B4) || L2 == null) {
            return;
        }
        ((TL_iv.pageBlockDetails) B4.b).title = s6.f(L2.getText());
    }

    public final void i2(ef efVar) {
        d4 d4Var;
        String str = efVar.h;
        if (str == null) {
            str = efVar.I;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        o2 o2Var = this.Q3;
        if (o2Var != null) {
            o2Var.d();
        }
        boolean c10 = h5.c(efVar);
        a aVar = new a((efVar.b || c10) ? new TL_iv.pageBlockVideo() : new TL_iv.pageBlockPhoto(), 0, 0);
        aVar.g = W3(efVar, str2);
        x3(aVar);
        if (c10) {
            N4(aVar, aVar.g, efVar);
            d4Var = this;
        } else {
            d4Var = this;
            d4Var.O4(aVar, aVar.g, str2, efVar.b, efVar.F, efVar.G, efVar.E);
        }
        o2 o2Var2 = d4Var.Q3;
        if (o2Var2 != null) {
            o2Var2.h();
        }
        d4Var.o3.onContentChanged();
    }

    public final void i3(a aVar) {
        View C1 = C1(aVar);
        if (C1 instanceof q6) {
            q6 q6Var = (q6) C1;
            q6Var.B();
            q6Var.getEditText().setSelection(0);
        } else if (C1 instanceof y0) {
            y0 y0Var = (y0) C1;
            y0Var.d.N();
            y0Var.getEditText().setSelection(0);
        }
    }

    public final void i4(int i10) {
        View D4 = D4(i10);
        if (D4 instanceof q6) {
            ((q6) D4).w();
        }
    }

    public final void j2(z5 z5Var) {
        z5 z5Var2 = this.p4;
        if (z5Var2 != null && z5Var2 != z5Var) {
            LinkedHashSet linkedHashSet = z5Var2.H;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                z5Var2.w.invalidate();
                z5Var2.v();
            }
        }
        this.p4 = z5Var;
        this.J3 = false;
        this.s4 = -1;
        this.r4 = -1;
        z5Var.setCellSelectionListener(this.t4);
        q3 q3Var = this.u3;
        if (q3Var != null && q3Var.x()) {
            q3Var.f(false);
        }
        setEditTextsLocked(true);
    }

    public final void j4(int i10, int i11) {
        c6 m10;
        View D4 = D4(i10);
        if (D4 instanceof z5) {
            z5 z5Var = (z5) D4;
            if (i11 == 0) {
                z5Var.w();
                return;
            }
            TL_iv.pageTableCell g10 = z5Var.g(i11);
            if (g10 == null || (m10 = z5Var.getGrid().m(g10)) == null) {
                return;
            }
            w6.d(g10, m10.a.getText());
        }
    }

    public final u3 k2() {
        int i10;
        int i11;
        q3 q3Var = this.u3;
        if (q3Var == null || !q3Var.x() || J3()) {
            return null;
        }
        a B4 = B4(q3Var.p0);
        ArrayList arrayList = this.s3;
        int indexOf = arrayList.indexOf(B4);
        int indexOf2 = arrayList.indexOf(B4(q3Var.s0));
        if (indexOf < 0 || indexOf2 < 0) {
            return null;
        }
        if (indexOf > indexOf2) {
            i11 = indexOf;
            i10 = indexOf2;
        } else {
            i10 = indexOf;
            i11 = indexOf2;
        }
        for (int i12 = i10; i12 <= i11; i12++) {
            a aVar = (a) arrayList.get(i12);
            if (aVar.i || A3(aVar)) {
                return null;
            }
        }
        return new u3(this, i10, i11, q3Var.r0, q3Var.u0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0575, code lost:
    
        if (r0 != false) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x08f3, code lost:
    
        if (r6 == false) goto L598;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x06b7, code lost:
    
        if (r3 < (r5.getLineCount() - 1)) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0732, code lost:
    
        r13 = r4.getRow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x07ae, code lost:
    
        if (r15.getLineForOffset(r6.getEditText().getSelectionEnd()) >= (r15.getLineCount() - 1)) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x02c8, code lost:
    
        if (r3 < r14.size()) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0491, code lost:
    
        if (r3 < r14.size()) goto L332;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:602:0x0535. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:125:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0176 A[LOOP:0: B:130:0x0170->B:132:0x0176, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0202 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0583 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0601 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x08fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0932 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:508:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k3(KeyEvent keyEvent) {
        int i10;
        boolean z10;
        boolean z11;
        View findFocus;
        z5 X2;
        int i11;
        z5 z5Var;
        r5 r5Var;
        a aVar;
        int indexOf;
        boolean z12;
        n1 U3;
        Layout layout;
        boolean z13;
        Layout layout2;
        int i12;
        final float primaryHorizontal;
        a X3;
        int i13;
        int i14;
        int i15;
        int l4;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean b02;
        Layout layout3;
        int i20;
        int length;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int max;
        a T2;
        int indexOf2;
        boolean z14;
        int i26;
        int i27;
        int unicodeChar;
        boolean z15;
        o2 o2Var;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        boolean isShiftPressed = keyEvent.isShiftPressed();
        boolean isCtrlPressed = keyEvent.isCtrlPressed();
        boolean isAltPressed = keyEvent.isAltPressed();
        q3 q3Var = this.u3;
        boolean x10 = q3Var.x();
        if (isCtrlPressed && !isAltPressed && (o2Var = this.Q3) != null) {
            if (keyCode == 54 && !isShiftPressed) {
                o2Var.k();
                return true;
            }
            if ((keyCode == 54 && isShiftPressed) || keyCode == 53) {
                o2Var.i();
                return true;
            }
        }
        if (isCtrlPressed && !isAltPressed) {
            int i28 = 4;
            if (isShiftPressed) {
                if (keyCode != 41) {
                    if (keyCode != 44) {
                        if (keyCode == 47 || keyCode == 52) {
                            i28 = 8;
                        }
                        i28 = 0;
                        z15 = false;
                    } else {
                        i28 = 256;
                    }
                }
                z15 = false;
            } else if (keyCode != 30) {
                if (keyCode != 33) {
                    if (keyCode == 37) {
                        i28 = 2;
                    } else if (keyCode != 39) {
                        if (keyCode == 49) {
                            i28 = 16;
                        }
                        i28 = 0;
                        z15 = false;
                    } else {
                        i28 = 0;
                        z15 = true;
                    }
                }
                z15 = false;
            } else {
                z15 = false;
                i28 = 1;
            }
            if (z15) {
                d4();
                return true;
            }
            if (i28 != 0) {
                b4(i28);
                return true;
            }
        }
        if (keyCode == 111 && x10) {
            q3Var.f(false);
            return true;
        }
        if (x10) {
            if (isCtrlPressed && !isShiftPressed && keyCode == 31) {
                CharSequence r10 = q3Var.r();
                if (r10 == null || r10.length() == 0) {
                    return true;
                }
                e5(r10);
                return true;
            }
            if (isCtrlPressed && !isShiftPressed && keyCode == 52) {
                CharSequence r11 = q3Var.r();
                if (r11 != null && r11.length() > 0) {
                    e5(r11);
                }
                H2();
                return true;
            }
            if (isCtrlPressed && keyCode == 50) {
                f4();
                return true;
            }
            if (keyCode == 67 || keyCode == 112) {
                H2();
                return true;
            }
            if (keyCode == 66) {
                w4("\n");
                return true;
            }
            if (!isCtrlPressed && !isAltPressed && (unicodeChar = keyEvent.getUnicodeChar(keyEvent.getMetaState())) >= 32) {
                w4(String.valueOf((char) unicodeChar));
                return true;
            }
        }
        ArrayList arrayList = this.s3;
        if (!x10 && isShiftPressed && y3(keyCode) && (T2 = T2()) != null && (indexOf2 = arrayList.indexOf(T2)) >= 0) {
            View C1 = C1(T2);
            if (C1 instanceof q6) {
                q6 q6Var = (q6) C1;
                n1 editText = q6Var.getEditText();
                if (editText.getLayout() != null) {
                    int selectionEnd = editText.getSelectionEnd();
                    int length2 = editText.length();
                    switch (keyCode) {
                        case 19:
                        case 21:
                            if (selectionEnd <= 0) {
                                z14 = false;
                                i26 = !z14 ? indexOf2 + 1 : indexOf2 - 1;
                                if (i26 >= 0 && i26 < arrayList.size()) {
                                    a aVar2 = (a) arrayList.get(i26);
                                    i10 = 1;
                                    for (i27 = 0; i27 < arrayList.size(); i27++) {
                                        q3Var.X(i27, q6.z(((a) arrayList.get(i27)).b));
                                    }
                                    if (length2 != 0) {
                                        int max2 = Math.max(0, Math.min(editText.getSelectionStart(), length2));
                                        if (z14) {
                                            if (max2 >= length2) {
                                                length2--;
                                            }
                                            if (q3Var.j0(q6Var, 0, max2, length2)) {
                                                KeyEvent.Callback C12 = C1(aVar2);
                                                if (C12 instanceof j9) {
                                                    q3Var.b0(0, 0, (j9) C12);
                                                    break;
                                                } else {
                                                    v0(i26);
                                                    post(new v2(this, aVar2, 14));
                                                    break;
                                                }
                                            }
                                        } else if (q3Var.j0(q6Var, 0, max2, max2 > 0 ? 0 : 1)) {
                                            KeyEvent.Callback C13 = C1(aVar2);
                                            if (C13 instanceof j9) {
                                                q3Var.b0(0, C13 instanceof q6 ? ((q6) C13).getEditText().length() : 0, (j9) C13);
                                                break;
                                            } else {
                                                v0(i26);
                                                post(new v2(this, aVar2, 15));
                                                break;
                                            }
                                        }
                                    }
                                    if (!x10 && isShiftPressed && y3(keyCode)) {
                                        int i29 = (isCtrlPressed || isAltPressed) ? i10 : 0;
                                        int i30 = q3Var.B0;
                                        int i31 = q3Var.D0;
                                        int i32 = q3Var.C0;
                                        int i33 = q3Var.p0;
                                        int i34 = q3Var.q0;
                                        int i35 = q3Var.r0;
                                        int i36 = q3Var.s0;
                                        int i37 = i29;
                                        int i38 = q3Var.t0;
                                        int i39 = q3Var.u0;
                                        if (i30 == i33 && i31 == i34 && i32 == i35) {
                                            i33 = i36;
                                            i34 = i38;
                                        } else {
                                            i39 = i35;
                                        }
                                        View D4 = D4(i33);
                                        if (D4 != null) {
                                            if (D4 instanceof z5) {
                                                z5 z5Var2 = (z5) D4;
                                                w6 model = z5Var2.getModel();
                                                if (model != null) {
                                                    ArrayList arrayList2 = model.g;
                                                    if (!arrayList2.isEmpty()) {
                                                        int size = arrayList2.size() + 1;
                                                        int i40 = (i34 < 0 || i34 >= size) ? 0 : i34;
                                                        n1 m10 = z5Var2.m(i40);
                                                        if (m10 != null) {
                                                            Layout layout4 = m10.getLayout();
                                                            z10 = isCtrlPressed;
                                                            layout3 = layout4;
                                                        } else {
                                                            z10 = isCtrlPressed;
                                                            layout3 = null;
                                                        }
                                                        if (layout3 != null) {
                                                            CharSequence text = layout3.getText();
                                                            z11 = isAltPressed;
                                                            int length3 = text.length();
                                                            switch (keyCode) {
                                                                case 19:
                                                                    int lineForOffset = layout3.getLineForOffset(i39) - i10;
                                                                    if (lineForOffset >= 0) {
                                                                        length = layout3.getOffsetForHorizontal(lineForOffset, layout3.getPrimaryHorizontal(i39));
                                                                    } else if (i40 == 0) {
                                                                        i22 = i33 - 1;
                                                                        if (i22 >= 0) {
                                                                            length = l4(i22);
                                                                            i34 = 0;
                                                                            break;
                                                                        }
                                                                        i22 = i33;
                                                                        length = 0;
                                                                        break;
                                                                    } else {
                                                                        int i41 = i40 - 1;
                                                                        if (i41 >= 0 && i41 < arrayList2.size()) {
                                                                            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) arrayList2.get(i41);
                                                                            int b10 = model.b(pagetablecell);
                                                                            int a2 = model.a(pagetablecell);
                                                                            int i42 = b10 - 1;
                                                                            if (i42 >= 0) {
                                                                                i20 = arrayList2.indexOf(model.d[i42][Math.min(a2, model.c - 1)]);
                                                                                if (i20 < 0) {
                                                                                    i21 = i20 + 1;
                                                                                    n1 m11 = z5Var2.m(i21);
                                                                                    Layout layout5 = m11 != null ? m11.getLayout() : null;
                                                                                    length = layout5 != null ? layout5.getText().length() : 0;
                                                                                } else {
                                                                                    length = z5Var2.getTitleEditText().length();
                                                                                    i21 = 0;
                                                                                }
                                                                                i34 = i21;
                                                                            }
                                                                        }
                                                                        i20 = -1;
                                                                        if (i20 < 0) {
                                                                        }
                                                                        i34 = i21;
                                                                    }
                                                                    i22 = i33;
                                                                    break;
                                                                case 20:
                                                                    int lineForOffset2 = layout3.getLineForOffset(i39) + 1;
                                                                    int i43 = length3;
                                                                    if (lineForOffset2 < layout3.getLineCount()) {
                                                                        length = layout3.getOffsetForHorizontal(lineForOffset2, layout3.getPrimaryHorizontal(i39));
                                                                        i22 = i33;
                                                                        break;
                                                                    } else {
                                                                        if (i40 == 0) {
                                                                            if (size > i10) {
                                                                                i22 = i33;
                                                                                length = 0;
                                                                                i34 = 1;
                                                                                break;
                                                                            } else {
                                                                                i22 = i33 + 1;
                                                                                if (i22 >= arrayList.size()) {
                                                                                    i22 = i33;
                                                                                }
                                                                                length = 0;
                                                                                i34 = 0;
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            int i44 = i40 - 1;
                                                                            if (i44 < 0 || i44 >= arrayList2.size()) {
                                                                                i23 = 1;
                                                                            } else {
                                                                                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) arrayList2.get(i44);
                                                                                int b11 = model.b(pagetablecell2);
                                                                                int a10 = model.a(pagetablecell2);
                                                                                i23 = 1;
                                                                                int max3 = Math.max(1, w6.o(pagetablecell2)) + b11;
                                                                                if (max3 < model.b) {
                                                                                    i24 = arrayList2.indexOf(model.d[max3][Math.min(a10, model.c - 1)]);
                                                                                    if (i24 < 0) {
                                                                                        i25 = i24 + i23;
                                                                                        i22 = i33;
                                                                                    } else {
                                                                                        int i45 = i33 + 1;
                                                                                        if (i45 < arrayList.size()) {
                                                                                            i22 = i45;
                                                                                            i25 = 0;
                                                                                        } else {
                                                                                            i22 = i33;
                                                                                            i25 = i34;
                                                                                            i34 = i25;
                                                                                        }
                                                                                    }
                                                                                    i43 = 0;
                                                                                    i34 = i25;
                                                                                }
                                                                            }
                                                                            i24 = -1;
                                                                            if (i24 < 0) {
                                                                            }
                                                                            i43 = 0;
                                                                            i34 = i25;
                                                                        }
                                                                        length = i43;
                                                                        break;
                                                                    }
                                                                case 21:
                                                                    if (i37 != 0) {
                                                                        BreakIterator wordInstance = BreakIterator.getWordInstance();
                                                                        wordInstance.setText(text.toString());
                                                                        int preceding = wordInstance.preceding(Math.max(0, Math.min(i39, text.length())));
                                                                        max = preceding == -1 ? 0 : preceding;
                                                                    } else {
                                                                        max = Math.max(0, i39 - 1);
                                                                    }
                                                                    if (max == i39 && i39 <= 0) {
                                                                        int i46 = i40 - 1;
                                                                        if (i46 >= 0) {
                                                                            n1 m12 = z5Var2.m(i46);
                                                                            Layout layout6 = m12 != null ? m12.getLayout() : null;
                                                                            length = layout6 != null ? layout6.getText().length() : 0;
                                                                            i34 = i46;
                                                                            i22 = i33;
                                                                            break;
                                                                        } else {
                                                                            int i47 = i33 - 1;
                                                                            if (i47 >= 0) {
                                                                                i22 = i47;
                                                                                length = l4(i47);
                                                                                i34 = 0;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                    length = max;
                                                                    i22 = i33;
                                                                case 22:
                                                                    if (i37 != 0) {
                                                                        BreakIterator wordInstance2 = BreakIterator.getWordInstance();
                                                                        wordInstance2.setText(text.toString());
                                                                        length = wordInstance2.following(Math.min(i39, text.length()));
                                                                        if (length == -1) {
                                                                            length = text.length();
                                                                        }
                                                                    } else {
                                                                        length = Math.min(length3, i39 + 1);
                                                                    }
                                                                    if (length == i39 && i39 >= length3) {
                                                                        int i48 = i40 + 1;
                                                                        if (i48 < size) {
                                                                            i34 = i48;
                                                                            i22 = i33;
                                                                            length = 0;
                                                                            break;
                                                                        } else {
                                                                            i22 = i33 + 1;
                                                                            break;
                                                                        }
                                                                    }
                                                                    i22 = i33;
                                                                    break;
                                                                default:
                                                                    length = i39;
                                                                    i22 = i33;
                                                                    break;
                                                            }
                                                            i17 = length;
                                                            i18 = i22;
                                                            i19 = i34;
                                                            i34 = i40;
                                                        }
                                                    }
                                                }
                                                z10 = isCtrlPressed;
                                            } else {
                                                z10 = isCtrlPressed;
                                                z11 = isAltPressed;
                                                if (D4 instanceof q6) {
                                                    Layout layout7 = ((q6) D4).getEditText().getLayout();
                                                    if (layout7 != null) {
                                                        CharSequence text2 = layout7.getText();
                                                        int length4 = text2.length();
                                                        switch (keyCode) {
                                                            case 19:
                                                                int lineForOffset3 = layout7.getLineForOffset(i39) - 1;
                                                                if (lineForOffset3 >= 0) {
                                                                    i14 = layout7.getOffsetForHorizontal(lineForOffset3, layout7.getPrimaryHorizontal(i39));
                                                                    i16 = i33;
                                                                    break;
                                                                } else {
                                                                    i15 = i33 - 1;
                                                                    if (i15 >= 0) {
                                                                        l4 = l4(i15);
                                                                        int i49 = l4;
                                                                        i16 = i15;
                                                                        i14 = i49;
                                                                        break;
                                                                    } else {
                                                                        i16 = i33;
                                                                        i14 = 0;
                                                                        break;
                                                                    }
                                                                }
                                                            case 20:
                                                                int lineForOffset4 = layout7.getLineForOffset(i39) + 1;
                                                                if (lineForOffset4 < layout7.getLineCount()) {
                                                                    i14 = layout7.getOffsetForHorizontal(lineForOffset4, layout7.getPrimaryHorizontal(i39));
                                                                } else {
                                                                    int i50 = i33 + 1;
                                                                    if (i50 < arrayList.size()) {
                                                                        i16 = i50;
                                                                        i14 = 0;
                                                                        break;
                                                                    } else {
                                                                        i14 = length4;
                                                                    }
                                                                }
                                                                i16 = i33;
                                                                break;
                                                            case 21:
                                                                if (i37 != 0) {
                                                                    BreakIterator wordInstance3 = BreakIterator.getWordInstance();
                                                                    wordInstance3.setText(text2.toString());
                                                                    int preceding2 = wordInstance3.preceding(Math.max(0, Math.min(i39, text2.length())));
                                                                    i14 = preceding2 == -1 ? 0 : preceding2;
                                                                } else {
                                                                    i14 = Math.max(0, i39 - 1);
                                                                }
                                                                if (i14 == i39 && i39 <= 0 && i33 - 1 >= 0) {
                                                                    i14 = l4(i16);
                                                                    break;
                                                                }
                                                                i16 = i33;
                                                                break;
                                                            case 22:
                                                                if (i37 != 0) {
                                                                    BreakIterator wordInstance4 = BreakIterator.getWordInstance();
                                                                    wordInstance4.setText(text2.toString());
                                                                    i14 = wordInstance4.following(Math.min(i39, text2.length()));
                                                                    if (i14 == -1) {
                                                                        i14 = text2.length();
                                                                    }
                                                                } else {
                                                                    i14 = Math.min(length4, i39 + 1);
                                                                }
                                                                if (i14 == i39) {
                                                                    if (i39 >= length4) {
                                                                        i16 = i33 + 1;
                                                                        break;
                                                                    }
                                                                }
                                                                i16 = i33;
                                                                break;
                                                            default:
                                                                i14 = i39;
                                                                i16 = i33;
                                                                break;
                                                        }
                                                        i17 = i14;
                                                        i18 = i16;
                                                        i19 = i34;
                                                    }
                                                    b02 = false;
                                                    break;
                                                } else {
                                                    if ((D4 instanceof c1) || (D4 instanceof f5) || (D4 instanceof b0) || (D4 instanceof y4) || (D4 instanceof a5)) {
                                                        switch (keyCode) {
                                                            case 19:
                                                            case 21:
                                                                i15 = i33 - 1;
                                                                if (i15 >= 0) {
                                                                    l4 = l4(i15);
                                                                    int i492 = l4;
                                                                    i16 = i15;
                                                                    i14 = i492;
                                                                    break;
                                                                }
                                                                i14 = i39;
                                                                i16 = i33;
                                                                break;
                                                            case 20:
                                                            case 22:
                                                                int i51 = i33 + 1;
                                                                if (i51 < arrayList.size()) {
                                                                    i16 = i51;
                                                                    i14 = 0;
                                                                    break;
                                                                }
                                                                i14 = i39;
                                                                i16 = i33;
                                                                break;
                                                            default:
                                                                i14 = i39;
                                                                i16 = i33;
                                                                break;
                                                        }
                                                        i17 = i14;
                                                        i18 = i16;
                                                        i19 = i34;
                                                    }
                                                    b02 = false;
                                                }
                                            }
                                            if (i18 != i33 || i19 != i34 || i17 != i39) {
                                                if (i18 != i33) {
                                                    v0(i18);
                                                }
                                                KeyEvent.Callback D42 = D4(i18);
                                                if (D42 instanceof j9) {
                                                    b02 = q3Var.b0(i19, i17, (j9) D42);
                                                    break;
                                                } else {
                                                    post(new b3(this, i18, i19, i17, 0));
                                                }
                                            }
                                            b02 = true;
                                            break;
                                        } else {
                                            z10 = isCtrlPressed;
                                        }
                                        z11 = isAltPressed;
                                        b02 = false;
                                    } else {
                                        z10 = isCtrlPressed;
                                        z11 = isAltPressed;
                                    }
                                    if (!x10 && !isShiftPressed && !z10 && !z11 && y3(keyCode)) {
                                        boolean z16 = keyCode == 22 || keyCode == 20;
                                        this.w3 = z16 ? q3Var.s0 : q3Var.p0;
                                        this.x3 = z16 ? q3Var.u0 : q3Var.r0;
                                        this.y3 = z16 ? q3Var.t0 : q3Var.q0;
                                        q3Var.f(false);
                                        break;
                                    } else if (z10 || keyCode != 29 || (!q3Var.a0() && !V4())) {
                                        if (!x10 && !isShiftPressed && !z10 && !z11 && (keyCode == 20 || keyCode == 19)) {
                                            boolean z17 = keyCode != 20;
                                            i11 = 0;
                                            while (true) {
                                                if (i11 >= getChildCount()) {
                                                    View childAt = getChildAt(i11);
                                                    if (childAt instanceof z5) {
                                                        z5Var = (z5) childAt;
                                                        if (z5Var.getTitleEditText().isFocused()) {
                                                        }
                                                    }
                                                    i11++;
                                                } else {
                                                    z5Var = null;
                                                }
                                            }
                                            p51 p51Var = this.f3;
                                            if (z5Var == null) {
                                                int indexOf3 = arrayList.indexOf(z5Var.getRow());
                                                if (indexOf3 >= 0) {
                                                    if (!z17) {
                                                        int W2 = W2(indexOf3 - 1, -1);
                                                        if (W2 >= 0) {
                                                            post(new v2(this, (a) arrayList.get(W2), 5));
                                                        }
                                                    } else if (!z5Var.t()) {
                                                        int W22 = W2(indexOf3 + 1, 1);
                                                        if (W22 < 0) {
                                                            a aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                                            arrayList.add(aVar3);
                                                            p51Var.O(false);
                                                            post(new v2(this, aVar3, 2));
                                                        } else {
                                                            post(new v2(this, (a) arrayList.get(W22), 4));
                                                        }
                                                    }
                                                    z13 = true;
                                                    break;
                                                }
                                                z13 = false;
                                                break;
                                            } else {
                                                int i52 = 0;
                                                while (true) {
                                                    if (i52 < getChildCount()) {
                                                        View childAt2 = getChildAt(i52);
                                                        if (childAt2 instanceof r5) {
                                                            r5Var = (r5) childAt2;
                                                            if (r5Var.r.isFocused()) {
                                                            }
                                                        }
                                                        i52++;
                                                    } else {
                                                        r5Var = null;
                                                    }
                                                }
                                                if (r5Var != null) {
                                                    n1 n1Var = r5Var.r;
                                                    int indexOf4 = this.w4.indexOf(r5Var.getRow());
                                                    if (indexOf4 >= 0) {
                                                        Layout layout8 = n1Var.getLayout();
                                                        int lineForOffset5 = layout8 != null ? layout8.getLineForOffset(n1Var.getSelectionEnd()) : 0;
                                                        if (z17) {
                                                            if (layout8 != null) {
                                                                i13 = 1;
                                                                break;
                                                            } else {
                                                                i13 = 1;
                                                            }
                                                            a X32 = X3(indexOf4 + i13, i13);
                                                            if (X32 == null) {
                                                                a aVar4 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                                                arrayList.add(aVar4);
                                                                p51Var.O(false);
                                                                post(new v2(this, aVar4, 6));
                                                            } else {
                                                                post(new v2(this, X32, 7));
                                                            }
                                                            z13 = true;
                                                        } else if ((layout8 == null || lineForOffset5 <= 0) && (X3 = X3(indexOf4 - 1, -1)) != null) {
                                                            post(new v2(this, X3, 8));
                                                            z13 = true;
                                                        }
                                                    }
                                                    z13 = false;
                                                } else {
                                                    int i53 = 0;
                                                    while (true) {
                                                        if (i53 < getChildCount()) {
                                                            KeyEvent.Callback childAt3 = getChildAt(i53);
                                                            if (childAt3 instanceof q6) {
                                                                q6 q6Var2 = (q6) childAt3;
                                                                if (q6Var2.getEditText().isFocused() || (q6Var2.n() && q6Var2.h.isFocused())) {
                                                                }
                                                                i53++;
                                                            } else if (childAt3 instanceof o0) {
                                                                o0 o0Var = (o0) childAt3;
                                                                if (o0Var.getCaptionEditText().isFocused()) {
                                                                    aVar = o0Var.getRow();
                                                                } else {
                                                                    i53++;
                                                                }
                                                            } else {
                                                                if (childAt3 instanceof y0) {
                                                                    y0 y0Var = (y0) childAt3;
                                                                    if (y0Var.getEditText().isFocused()) {
                                                                        aVar = y0Var.getRow();
                                                                    }
                                                                } else {
                                                                    continue;
                                                                }
                                                                i53++;
                                                            }
                                                        } else {
                                                            aVar = null;
                                                        }
                                                    }
                                                    if (aVar != null && (indexOf = arrayList.indexOf(aVar)) >= 0) {
                                                        View C14 = C1(aVar);
                                                        boolean z18 = C14 instanceof q6;
                                                        if (z18) {
                                                            final q6 q6Var3 = (q6) C14;
                                                            n1 n1Var2 = q6Var3.f;
                                                            n1 n1Var3 = q6Var3.h;
                                                            if (q6Var3.n()) {
                                                                if (!z17 || n1Var3.isFocused()) {
                                                                    z12 = z17;
                                                                    if (!z12 && n1Var3.isFocused() && ((layout2 = q6Var3.getAuthorEditText().getLayout()) == null || layout2.getLineForOffset(q6Var3.getAuthorEditText().getSelectionEnd()) <= 0)) {
                                                                        Layout layout9 = n1Var3.getLayout();
                                                                        final float primaryHorizontal2 = layout9 == null ? 0.0f : layout9.getPrimaryHorizontal(Math.max(0, Math.min(n1Var3.getSelectionEnd(), n1Var3.length())));
                                                                        n1Var2.N();
                                                                        final int i54 = 0;
                                                                        n1Var2.post(new Runnable() { // from class: bi.d6
                                                                            @Override // java.lang.Runnable
                                                                            public final void run() {
                                                                                switch (i54) {
                                                                                    case 0:
                                                                                        n1 n1Var4 = q6Var3.f;
                                                                                        Layout layout10 = n1Var4.getLayout();
                                                                                        int length5 = n1Var4.length();
                                                                                        if (layout10 != null) {
                                                                                            length5 = layout10.getOffsetForHorizontal(Math.max(0, layout10.getLineCount() - 1), primaryHorizontal2);
                                                                                        }
                                                                                        n1Var4.setSelection(Math.max(0, Math.min(length5, n1Var4.length())));
                                                                                        break;
                                                                                    default:
                                                                                        n1 n1Var5 = q6Var3.h;
                                                                                        Layout layout11 = n1Var5.getLayout();
                                                                                        int length6 = n1Var5.length();
                                                                                        if (layout11 != null) {
                                                                                            length6 = layout11.getOffsetForHorizontal(0, primaryHorizontal2);
                                                                                        }
                                                                                        n1Var5.setSelection(Math.max(0, Math.min(length6, n1Var5.length())));
                                                                                        break;
                                                                                }
                                                                            }
                                                                        });
                                                                        z13 = true;
                                                                    }
                                                                    if (z18) {
                                                                        U3 = U3(C14);
                                                                    } else {
                                                                        q6 q6Var4 = (q6) C14;
                                                                        U3 = (q6Var4.n() && q6Var4.h.isFocused()) ? q6Var4.getAuthorEditText() : q6Var4.getEditText();
                                                                    }
                                                                    if (U3 != null && (layout = U3.getLayout()) != null) {
                                                                        int lineForOffset6 = layout.getLineForOffset(U3.getSelectionEnd());
                                                                        if (z12) {
                                                                            if (lineForOffset6 <= 0) {
                                                                                a Y1 = Y1(aVar, -1);
                                                                                if (Y1 != null) {
                                                                                    post(new v2(this, Y1, 13));
                                                                                } else {
                                                                                    int W23 = W2(indexOf - 1, -1);
                                                                                    if (W23 >= 0) {
                                                                                        post(new v2(this, (a) arrayList.get(W23), 3));
                                                                                    }
                                                                                }
                                                                                z13 = true;
                                                                            }
                                                                        } else if (lineForOffset6 >= layout.getLineCount() - 1) {
                                                                            a Y12 = Y1(aVar, 1);
                                                                            if (Y12 != null) {
                                                                                post(new v2(this, Y12, 10));
                                                                                z13 = true;
                                                                                break;
                                                                            } else {
                                                                                int W24 = W2(indexOf + 1, 1);
                                                                                if (W24 < 0) {
                                                                                    a aVar5 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                                                                    arrayList.add(aVar5);
                                                                                    p51Var.O(false);
                                                                                    post(new v2(this, aVar5, 11));
                                                                                } else {
                                                                                    post(new v2(this, (a) arrayList.get(W24), 12));
                                                                                }
                                                                                z13 = true;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    Layout layout10 = q6Var3.getEditText().getLayout();
                                                                    if (layout10 != null) {
                                                                        z12 = z17;
                                                                        break;
                                                                    }
                                                                    Layout layout11 = n1Var2.getLayout();
                                                                    if (layout11 == null) {
                                                                        i12 = 0;
                                                                        primaryHorizontal = 0.0f;
                                                                    } else {
                                                                        i12 = 0;
                                                                        primaryHorizontal = layout11.getPrimaryHorizontal(Math.max(0, Math.min(n1Var2.getSelectionEnd(), n1Var2.length())));
                                                                    }
                                                                    if (n1Var3.getVisibility() != 0) {
                                                                        n1Var3.setVisibility(i12);
                                                                        q6Var3.requestLayout();
                                                                    }
                                                                    n1Var3.N();
                                                                    final int i55 = 1;
                                                                    n1Var3.post(new Runnable() { // from class: bi.d6
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i55) {
                                                                                case 0:
                                                                                    n1 n1Var4 = q6Var3.f;
                                                                                    Layout layout102 = n1Var4.getLayout();
                                                                                    int length5 = n1Var4.length();
                                                                                    if (layout102 != null) {
                                                                                        length5 = layout102.getOffsetForHorizontal(Math.max(0, layout102.getLineCount() - 1), primaryHorizontal);
                                                                                    }
                                                                                    n1Var4.setSelection(Math.max(0, Math.min(length5, n1Var4.length())));
                                                                                    break;
                                                                                default:
                                                                                    n1 n1Var5 = q6Var3.h;
                                                                                    Layout layout112 = n1Var5.getLayout();
                                                                                    int length6 = n1Var5.length();
                                                                                    if (layout112 != null) {
                                                                                        length6 = layout112.getOffsetForHorizontal(0, primaryHorizontal);
                                                                                    }
                                                                                    n1Var5.setSelection(Math.max(0, Math.min(length6, n1Var5.length())));
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    z13 = true;
                                                                }
                                                            }
                                                        }
                                                        z12 = z17;
                                                        if (z18) {
                                                        }
                                                        if (U3 != null) {
                                                            int lineForOffset62 = layout.getLineForOffset(U3.getSelectionEnd());
                                                            if (z12) {
                                                            }
                                                        }
                                                    }
                                                    z13 = false;
                                                }
                                            }
                                        }
                                        if (!x10 && !z10 && !z11 && keyCode == 61) {
                                            findFocus = findFocus();
                                            if (findFocus instanceof n1) {
                                                if ((X2 = X2((r3 = (n1) findFocus))) != null) {
                                                    if (findFocus != X2.getTitleEditText()) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        if (keyCode != 61 && x10) {
                                            int i56 = q3Var.p0;
                                            int i57 = q3Var.s0;
                                            if (i56 >= 0 && i57 >= i56) {
                                                if (i56 == i57) {
                                                    a B4 = B4(i56);
                                                    if (B4 != null) {
                                                        Z3(B4, isShiftPressed);
                                                        break;
                                                    }
                                                } else {
                                                    int indexOf5 = arrayList.indexOf(B4(i56));
                                                    int indexOf6 = arrayList.indexOf(B4(i57));
                                                    if (indexOf5 >= 0 && indexOf6 >= indexOf5) {
                                                        p4(indexOf5, indexOf6, isShiftPressed);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 20:
                        case 22:
                            if (selectionEnd >= length2) {
                                z14 = true;
                                if (!z14) {
                                }
                                if (i26 >= 0) {
                                    a aVar22 = (a) arrayList.get(i26);
                                    i10 = 1;
                                    while (i27 < arrayList.size()) {
                                    }
                                    if (length2 != 0) {
                                    }
                                    if (!x10) {
                                    }
                                    z10 = isCtrlPressed;
                                    z11 = isAltPressed;
                                    if (!x10) {
                                    }
                                    if (z10) {
                                        break;
                                    }
                                    if (!x10) {
                                        if (keyCode != 20) {
                                        }
                                        i11 = 0;
                                        while (true) {
                                            if (i11 >= getChildCount()) {
                                            }
                                            i11++;
                                        }
                                        p51 p51Var2 = this.f3;
                                        if (z5Var == null) {
                                        }
                                    }
                                    if (!x10) {
                                        findFocus = findFocus();
                                        if ((findFocus instanceof n1) && (X2 = X2((r3 = (n1) findFocus))) != null) {
                                        }
                                    }
                                    if (keyCode != 61) {
                                    }
                                    break;
                                }
                            }
                            break;
                    }
                    return true;
                }
            }
        }
        i10 = 1;
        if (!x10) {
        }
        z10 = isCtrlPressed;
        z11 = isAltPressed;
        if (!x10) {
        }
        if (z10) {
        }
        if (!x10) {
        }
        if (!x10) {
        }
        if (keyCode != 61) {
        }
        return false;
    }

    public final int l2(int i10) {
        n1 L2 = L2(i10);
        if (L2 != null) {
            return L2.length();
        }
        q6 x22 = x2(i10);
        if (x22 != null) {
            return x22.getEditText().length();
        }
        a B4 = B4(i10);
        if (B4 == null) {
            return 0;
        }
        return q6.z(B4.b).length();
    }

    /* JADX WARN: Removed duplicated region for block: B:237:0x0435  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l3(MotionEvent motionEvent) {
        boolean z10;
        a row;
        int i10;
        z5 z5Var;
        int action = motionEvent.getAction();
        q3 q3Var = this.u3;
        View view = null;
        if (action == 0) {
            this.C3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            this.D3 = y3;
            this.G3 = false;
            this.H3 = false;
            int i11 = (int) this.C3;
            int top = ((int) y3) - getTop();
            z5 z5Var2 = this.p4;
            if (z5Var2 == null) {
                z5Var2 = U2();
            }
            if (z5Var2 != null && z5Var2.getParent() == this) {
                int left = i11 - z5Var2.getLeft();
                int top2 = top - z5Var2.getTop();
                if (z5Var2.r(left, top2) >= 0 || z5Var2.p(left, top2) >= 0) {
                    view = z5Var2;
                    this.E3 = view;
                    long eventTime = motionEvent.getEventTime();
                    z10 = q3Var.x() && eventTime - this.M3 <= ((long) ViewConfiguration.getDoubleTapTimeout()) && Math.abs(this.C3 - this.N3) <= ((float) org.telegram.messenger.i0.L(24.0f)) && Math.abs(this.D3 - this.O3) <= ((float) org.telegram.messenger.i0.L(24.0f));
                    this.M3 = eventTime;
                    float f7 = this.C3;
                    this.N3 = f7;
                    float f10 = this.D3;
                    this.O3 = f10;
                    if (!z10 && W4(this.E3, f7, f10)) {
                        this.H3 = true;
                        this.M3 = 0L;
                        org.telegram.ui.Cells.f fVar = q3Var.m0;
                        if (!q3Var.x()) {
                            return true;
                        }
                        q3Var.i = false;
                        q3Var.R = false;
                        q3Var.k = false;
                        v9 v9Var = q3Var.C;
                        if (v9Var != null) {
                            v9Var.invalidate();
                        }
                        org.telegram.messenger.i0.r(fVar);
                        org.telegram.messenger.i0.g3(fVar);
                        return true;
                    }
                    if (this.E3 != null) {
                        Runnable runnable = this.F3;
                        if (runnable != null) {
                            removeCallbacks(runnable);
                        }
                        b bVar = new b(this, 2);
                        this.F3 = bVar;
                        postDelayed(bVar, ViewConfiguration.getLongPressTimeout());
                    }
                }
            }
            int i12 = 0;
            while (true) {
                if (i12 >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i12);
                if (top >= childAt.getTop() && top < childAt.getBottom() && i11 >= childAt.getLeft() && i11 < childAt.getRight()) {
                    view = childAt;
                    break;
                }
                i12++;
            }
            this.E3 = view;
            long eventTime2 = motionEvent.getEventTime();
            if (q3Var.x()) {
            }
            this.M3 = eventTime2;
            float f72 = this.C3;
            this.N3 = f72;
            float f102 = this.D3;
            this.O3 = f102;
            if (!z10) {
            }
            if (this.E3 != null) {
            }
        } else {
            if (action == 1) {
                Runnable runnable2 = this.F3;
                if (runnable2 != null) {
                    removeCallbacks(runnable2);
                    this.F3 = null;
                }
                if (this.I3) {
                    b5(motionEvent.getX(), motionEvent.getY());
                    z5 z5Var3 = this.p4;
                    if (this.I3) {
                        requestDisallowInterceptTouchEvent(false);
                    }
                    this.I3 = false;
                    this.K3 = null;
                    this.L3 = null;
                    this.J3 = z5Var3 != null && z5Var3.getSelectedCells().size() > 1;
                    if (z5Var3 != null && !z5Var3.H.isEmpty()) {
                        I4(z5Var3);
                    }
                    this.E3 = null;
                    this.H3 = false;
                    return true;
                }
                if (!this.G3 && !this.H3) {
                    View view2 = this.E3;
                    if (view2 instanceof z5) {
                        if (m3((z5) view2, (int) ((motionEvent.getX() - r0.getLeft()) - getLeft()), (int) ((motionEvent.getY() - r0.getTop()) - getTop()))) {
                            this.E3 = null;
                            this.H3 = false;
                            return false;
                        }
                    }
                }
                if (!this.G3 && !this.H3 && (z5Var = this.p4) != null) {
                    View view3 = this.E3;
                    if (view3 == z5Var) {
                        z5 z5Var4 = (z5) view3;
                        TL_iv.pageTableCell o10 = z5Var4.o((int) ((motionEvent.getX() - z5Var4.getLeft()) - getLeft()), (int) ((motionEvent.getY() - z5Var4.getTop()) - getTop()));
                        if (o10 != null) {
                            if (this.r4 >= 0 || this.s4 >= 0) {
                                P2();
                            } else {
                                LinkedHashSet linkedHashSet = z5Var4.H;
                                if (!linkedHashSet.remove(o10)) {
                                    linkedHashSet.add(o10);
                                }
                                z5Var4.w.invalidate();
                                z5Var4.v();
                            }
                        }
                    } else if (view3 != null) {
                        P2();
                    }
                }
                boolean z11 = this.G3;
                p51 p51Var = this.f3;
                ArrayList arrayList = this.s3;
                if (!z11 && !this.H3 && this.E3 == null && !q3Var.x() && this.p4 == null) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    View view4 = (View) getParent();
                    if (view4 != null && x10 >= getLeft() && x10 <= getRight()) {
                        int paddingTop = getPaddingTop() + getTop();
                        for (int i13 = 0; i13 < getChildCount(); i13++) {
                            paddingTop = Math.max(paddingTop, getChildAt(i13).getBottom() + getTop());
                        }
                        int z12 = org.telegram.messenger.m5.z(60.0f, view4.getHeight(), Math.max(Math.max(this.X3, this.V3), this.W3));
                        if (y10 >= paddingTop && y10 <= z12) {
                            a aVar = arrayList.isEmpty() ? null : (a) i0.a.g(1, arrayList);
                            if (aVar == null || !aVar.k.isEmpty() || H3(aVar.b) || aVar.i || A3(aVar) || N2(aVar.b)) {
                                o2 o2Var = this.Q3;
                                if (o2Var != null) {
                                    o2Var.d();
                                }
                                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                arrayList.add(aVar2);
                                p51Var.O(false);
                                o2 o2Var2 = this.Q3;
                                if (o2Var2 != null) {
                                    o2Var2.h();
                                }
                                post(new v2(this, aVar2, 19));
                            } else {
                                h3(aVar);
                            }
                        }
                    }
                }
                if (!this.G3 && !this.H3 && this.E3 == null && !q3Var.x() && this.p4 == null) {
                    float x11 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    if (this.Y3 && x11 >= getLeft() && x11 <= getRight()) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= getChildCount()) {
                                i10 = Integer.MAX_VALUE;
                                break;
                            }
                            View childAt2 = getChildAt(i14);
                            if (RecyclerView.R(childAt2) == 0) {
                                i10 = childAt2.getTop() + getTop();
                                break;
                            }
                            i14++;
                        }
                        if (i10 != Integer.MAX_VALUE) {
                            if (y11 >= org.telegram.messenger.i0.L(60.0f) + getTop() && y11 <= i10) {
                                a aVar3 = arrayList.isEmpty() ? null : (a) arrayList.get(0);
                                if (aVar3 == null || H3(aVar3.b) || aVar3.i || A3(aVar3) || N2(aVar3.b)) {
                                    o2 o2Var3 = this.Q3;
                                    if (o2Var3 != null) {
                                        o2Var3.d();
                                    }
                                    a aVar4 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                    arrayList.add(0, aVar4);
                                    p51Var.O(false);
                                    o2 o2Var4 = this.Q3;
                                    if (o2Var4 != null) {
                                        o2Var4.h();
                                    }
                                    post(new v2(this, aVar4, 16));
                                } else {
                                    i3(aVar3);
                                }
                            }
                        }
                    }
                }
                if (!this.G3 && !this.H3 && (this.E3 instanceof a5) && !q3Var.x() && this.p4 == null && (row = ((a5) this.E3).getRow()) != null) {
                    TL_iv.PageBlock pageBlock = row.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                        t.X(getContext(), TextUtils.isEmpty(pageblockmath.source) ? "" : pageblockmath.source, new ag.e0(6, this, pageblockmath), this.n3);
                    }
                }
                this.E3 = null;
                this.H3 = false;
                return false;
            }
            if (action == 2) {
                if (this.I3 && this.E3 == this.p4) {
                    b5(motionEvent.getX(), motionEvent.getY());
                    this.G3 = true;
                    return true;
                }
                float x12 = motionEvent.getX() - this.C3;
                float y12 = motionEvent.getY() - this.D3;
                if ((y12 * y12) + (x12 * x12) > org.telegram.messenger.i0.L(8.0f) * org.telegram.messenger.i0.L(8.0f)) {
                    this.G3 = true;
                    Runnable runnable3 = this.F3;
                    if (runnable3 != null) {
                        removeCallbacks(runnable3);
                        this.F3 = null;
                        return false;
                    }
                }
            } else if (action == 3) {
                Runnable runnable4 = this.F3;
                if (runnable4 != null) {
                    removeCallbacks(runnable4);
                    this.F3 = null;
                }
                if (this.I3) {
                    P2();
                }
                this.E3 = null;
                this.H3 = false;
                return false;
            }
        }
        return false;
    }

    public final int l4(int i10) {
        Layout layout;
        View D4 = D4(i10);
        if (!(D4 instanceof q6) || (layout = ((q6) D4).getEditText().getLayout()) == null) {
            return 0;
        }
        return layout.getText().length();
    }

    public final TL_iv.RichMessage m2() {
        if (!n3()) {
            return null;
        }
        ArrayList<TL_iv.PageBlock> c32 = c3();
        if (c32.isEmpty()) {
            return null;
        }
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        richMessage.blocks = c32;
        richMessage.photos = E2();
        richMessage.documents = B2();
        return richMessage;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00d8, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3(z5 z5Var, int i10, int i11) {
        w6 w6Var;
        w6 w6Var2;
        int r10 = z5Var.r(i10, i11);
        LinkedHashSet linkedHashSet = z5Var.H;
        b6 b6Var = z5Var.w;
        if (r10 >= 0) {
            int r11 = (b6Var.v() && r10 == b6Var.k()) ? b6Var.r() : r10;
            if (z5Var == this.p4 && (w6Var2 = z5Var.F) != null && r10 >= 0 && r11 >= r10 && r11 < w6Var2.b && !linkedHashSet.isEmpty()) {
                int i12 = r10;
                loop0: while (i12 <= r11) {
                    int i13 = 0;
                    while (true) {
                        w6 w6Var3 = z5Var.F;
                        if (i13 < w6Var3.c) {
                            if (!linkedHashSet.contains(w6Var3.d[i12][i13])) {
                                break loop0;
                            }
                            i13++;
                        }
                    }
                }
                I4(z5Var);
                return true;
            }
            j2(z5Var);
            w6 w6Var4 = z5Var.F;
            if (w6Var4 != null && r10 >= 0 && r11 >= r10 && r11 < w6Var4.b) {
                linkedHashSet.clear();
                for (int i14 = r10; i14 <= r11; i14++) {
                    int i15 = 0;
                    while (true) {
                        w6 w6Var5 = z5Var.F;
                        if (i15 < w6Var5.c) {
                            TL_iv.pageTableCell pagetablecell = w6Var5.d[i14][i15];
                            if (pagetablecell != null) {
                                linkedHashSet.add(pagetablecell);
                            }
                            i15++;
                        }
                    }
                }
                b6Var.invalidate();
                z5Var.v();
            }
            this.r4 = r10;
            return true;
        }
        int p5 = z5Var.p(i10, i11);
        if (p5 < 0) {
            return false;
        }
        int q6 = (b6Var.u() && p5 == b6Var.j()) ? b6Var.q() : p5;
        if (z5Var == this.p4 && (w6Var = z5Var.F) != null && p5 >= 0 && q6 >= p5 && q6 < w6Var.c && !linkedHashSet.isEmpty()) {
            int i16 = p5;
            loop4: while (i16 <= q6) {
                int i17 = 0;
                while (true) {
                    w6 w6Var6 = z5Var.F;
                    if (i17 < w6Var6.b) {
                        if (!linkedHashSet.contains(w6Var6.d[i17][i16])) {
                            break loop4;
                        }
                        i17++;
                    }
                }
            }
            I4(z5Var);
            return true;
        }
        j2(z5Var);
        w6 w6Var7 = z5Var.F;
        if (w6Var7 != null && p5 >= 0 && q6 >= p5 && q6 < w6Var7.c) {
            linkedHashSet.clear();
            for (int i18 = p5; i18 <= q6; i18++) {
                int i19 = 0;
                while (true) {
                    w6 w6Var8 = z5Var.F;
                    if (i19 < w6Var8.b) {
                        TL_iv.pageTableCell pagetablecell2 = w6Var8.d[i19][i18];
                        if (pagetablecell2 != null) {
                            linkedHashSet.add(pagetablecell2);
                        }
                        i19++;
                    }
                }
            }
            b6Var.invalidate();
            z5Var.v();
        }
        this.s4 = p5;
        return true;
    }

    public final n1 m4(int i10) {
        View D4 = D4(i10);
        if (D4 instanceof q6) {
            return ((q6) D4).getAuthorEditText();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0091, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0088, code lost:
    
        r9 = r6;
        r14 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TL_iv.PageBlock n2(int i10, int i11, int i12, int i13, boolean z10, int[] iArr) {
        int i14;
        TL_iv.RichText richText;
        int i15;
        a aVar;
        TL_iv.RichText richText2;
        ArrayList arrayList;
        boolean z11;
        int i16 = i12;
        int i17 = i13;
        TL_iv.pageBlockOrderedList pageblockorderedlist = z10 ? new TL_iv.pageBlockOrderedList() : null;
        TL_iv.pageBlockList pageblocklist = z10 ? null : new TL_iv.pageBlockList();
        int i18 = i10;
        int i19 = 1;
        while (i18 < i16) {
            d4 d4Var = this;
            ArrayList arrayList2 = d4Var.s3;
            a aVar2 = (a) arrayList2.get(i18);
            if (aVar2.k.size() > i17 || (i14 = aVar2.c) < i11) {
                break;
            }
            if (i14 == i11) {
                if ((aVar2.d > 0) != z10) {
                    break;
                }
            }
            if (i14 > i11) {
                break;
            }
            boolean H3 = H3(aVar2.b);
            if (H3) {
                richText = null;
            } else {
                TL_iv.PageBlock pageBlock = aVar2.b;
                richText = pageBlock == null ? null : pageBlock.text;
                if (richText == null) {
                    richText = new TL_iv.textEmpty();
                }
            }
            int i20 = i18 + 1;
            ArrayList arrayList3 = new ArrayList();
            if (H3) {
                M2(aVar2, arrayList3);
            }
            while (true) {
                if (i20 >= i16) {
                    i15 = i20;
                    aVar = aVar2;
                    richText2 = richText;
                    arrayList = arrayList3;
                    break;
                }
                a aVar3 = (a) arrayList2.get(i20);
                if (aVar3.k.size() <= i17) {
                    aVar = aVar2;
                    int i21 = aVar3.c;
                    if (i21 < i11) {
                        break;
                    }
                    if (i21 != i11) {
                        if (aVar3.d > 0) {
                            richText2 = richText;
                            z11 = true;
                        } else {
                            richText2 = richText;
                            z11 = false;
                        }
                        ArrayList arrayList4 = arrayList3;
                        int[] iArr2 = {i20};
                        d4 d4Var2 = d4Var;
                        i15 = i20;
                        arrayList = arrayList4;
                        TL_iv.PageBlock n22 = d4Var2.n2(i15, i21, i16, i17, z11, iArr2);
                        if (n22 != null) {
                            arrayList.add(n22);
                        }
                        i20 = iArr2[0];
                        if (i20 <= i15) {
                            break;
                        }
                        d4Var = this;
                        i16 = i12;
                        i17 = i13;
                        richText = richText2;
                        aVar2 = aVar;
                        arrayList3 = arrayList;
                    } else {
                        if (!H3(aVar3.b)) {
                            break;
                        }
                        M2(aVar3, arrayList3);
                        i20++;
                        aVar2 = aVar;
                    }
                } else {
                    i15 = i20;
                    aVar = aVar2;
                    break;
                }
            }
            if (H3 || !arrayList.isEmpty()) {
                ArrayList<TL_iv.PageBlock> arrayList5 = new ArrayList<>();
                if (!H3) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = richText2;
                    arrayList5.add(pageblockparagraph);
                }
                arrayList5.addAll(arrayList);
                if (arrayList5.isEmpty()) {
                    i16 = i12;
                    i17 = i13;
                    i18 = i15;
                } else if (z10) {
                    TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = new TL_iv.TL_pageListOrderedItemBlocks();
                    tL_pageListOrderedItemBlocks.num = a1.g.k(i19, ".");
                    tL_pageListOrderedItemBlocks.blocks = arrayList5;
                    tL_pageListOrderedItemBlocks.checkbox = aVar.e;
                    tL_pageListOrderedItemBlocks.checked = aVar.f;
                    pageblockorderedlist.items.add(tL_pageListOrderedItemBlocks);
                } else {
                    TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = new TL_iv.TL_pageListItemBlocks();
                    tL_pageListItemBlocks.blocks = arrayList5;
                    tL_pageListItemBlocks.checkbox = aVar.e;
                    tL_pageListItemBlocks.checked = aVar.f;
                    pageblocklist.items.add(tL_pageListItemBlocks);
                }
            } else if (z10) {
                TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = new TL_iv.TL_pageListOrderedItemText();
                tL_pageListOrderedItemText.num = a1.g.k(i19, ".");
                tL_pageListOrderedItemText.text = richText2;
                tL_pageListOrderedItemText.checkbox = aVar.e;
                tL_pageListOrderedItemText.checked = aVar.f;
                pageblockorderedlist.items.add(tL_pageListOrderedItemText);
            } else {
                TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                tL_pageListItemText.text = richText2;
                tL_pageListItemText.checkbox = aVar.e;
                tL_pageListItemText.checked = aVar.f;
                pageblocklist.items.add(tL_pageListItemText);
            }
            i19++;
            i16 = i12;
            i17 = i13;
            i18 = i15;
        }
        iArr[0] = i18;
        if (z10) {
            if (!pageblockorderedlist.items.isEmpty()) {
                return pageblockorderedlist;
            }
        } else if (!pageblocklist.items.isEmpty()) {
            return pageblocklist;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockDocument) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n3() {
        int i10 = 0;
        loop0: while (true) {
            ArrayList arrayList = this.s3;
            if (i10 >= arrayList.size()) {
                return false;
            }
            a aVar = (a) arrayList.get(i10);
            if (!q6.z(aVar.b).isEmpty()) {
                break;
            }
            if (!G3(aVar.b)) {
                TL_iv.PageBlock pageBlock = aVar.b;
                if (!(pageBlock instanceof TL_iv.pageBlockAudio)) {
                }
            }
            for (w wVar : T3(aVar)) {
                if (wVar.b() || wVar.a()) {
                    break loop0;
                }
            }
            TL_iv.PageBlock pageBlock2 = aVar.b;
            if ((pageBlock2 instanceof TL_iv.pageBlockMath) && !TextUtils.isEmpty(((TL_iv.pageBlockMath) pageBlock2).source)) {
                break;
            }
            TL_iv.PageBlock pageBlock3 = aVar.b;
            if (pageBlock3 instanceof TL_iv.pageBlockMap) {
                int i11 = y4.M;
                if (((TL_iv.pageBlockMap) pageBlock3).geo instanceof TLRPC.TL_geoPoint) {
                    return true;
                }
            }
            if ((pageBlock3 instanceof TL_iv.pageBlockTable) && R4((TL_iv.pageBlockTable) pageBlock3)) {
                break;
            }
            TL_iv.PageBlock pageBlock4 = aVar.b;
            if ((pageBlock4 instanceof TL_iv.pageBlockButtonRow) && !((TL_iv.pageBlockButtonRow) pageBlock4).buttons.isEmpty()) {
                break;
            }
            i10++;
        }
        return true;
    }

    public final boolean o2() {
        n1 editText;
        int length;
        int D;
        int B;
        q3 q3Var = this.u3;
        if (q3Var == null || !q3Var.x() || q3Var.p0 != q3Var.s0) {
            return false;
        }
        if (O3()) {
            int i10 = q3Var.p0;
            int i11 = q3Var.q0;
            if (i11 != q3Var.t0) {
                return false;
            }
            editText = Q4(i10, i11);
        } else if (B3()) {
            editText = L2(q3Var.p0);
        } else if (z3()) {
            editText = v2(q3Var.p0);
        } else if (J3()) {
            editText = m4(q3Var.p0);
        } else {
            q6 J4 = J4();
            if (J4 == null) {
                return false;
            }
            editText = J4.getEditText();
        }
        if (editText == null || (D = a1.g.D(q3Var.r0, q3Var.u0, (length = editText.length()), 0)) >= (B = a1.g.B(q3Var.r0, q3Var.u0, length, 0))) {
            return false;
        }
        Editable text = editText.getText();
        if (text != null && D < B) {
            for (u4 u4Var : (u4[]) text.getSpans(D, B, u4.class)) {
                if (text.getSpanStart(u4Var) < B && text.getSpanEnd(u4Var) > D) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.T3);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.T3);
        this.h3 = false;
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i13 - i11;
        int i15 = this.R3;
        boolean z11 = i15 > 0 && i14 < i15;
        super.onLayout(z10, i10, i11, i12, i13);
        if (z11) {
            View findFocus = findFocus();
            View F = findFocus == null ? null : F(findFocus);
            if (F != null) {
                int L = (org.telegram.messenger.i0.L(8.0f) + F.getBottom()) - (i14 - getPaddingBottom());
                if (L > 0) {
                    post(new q2(this, L, 2));
                }
            }
        }
        this.R3 = i14;
    }

    public final boolean p2() {
        int[] G4 = G4();
        if (G4 == null) {
            return q2(G2());
        }
        for (int i10 = G4[0]; i10 <= G4[1]; i10++) {
            if (q2((a) this.s3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean p3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.s3;
            if (i10 >= arrayList.size()) {
                return false;
            }
            Iterator it = T3((a) arrayList.get(i10)).iterator();
            while (it.hasNext()) {
                if (((w) it.next()).a()) {
                    return true;
                }
            }
            i10++;
        }
    }

    public final boolean p4(int i10, int i11, boolean z10) {
        boolean z11;
        if (i10 >= 0 && i11 >= i10) {
            ArrayList arrayList = this.s3;
            if (i11 < arrayList.size()) {
                o2 o2Var = this.Q3;
                if (o2Var != null) {
                    o2Var.d();
                }
                if (z10) {
                    z11 = false;
                    while (i11 >= i10) {
                        if (t3(i11, true, true)) {
                            z11 = true;
                        }
                        i11--;
                    }
                } else {
                    a aVar = (a) arrayList.get(i10);
                    if (aVar.c >= 1 && (i10 == 0 || ((a) arrayList.get(i10 - 1)).c < aVar.c)) {
                        return false;
                    }
                    z11 = false;
                    while (i10 <= i11) {
                        if (t3(i10, false, true)) {
                            z11 = true;
                        }
                        i10++;
                    }
                }
                if (z11) {
                    v4();
                    if (findFocus() instanceof n1) {
                        a2();
                    } else {
                        this.f3.O(false);
                    }
                    o2 o2Var2 = this.Q3;
                    if (o2Var2 != null) {
                        o2Var2.h();
                    }
                }
                return z11;
            }
        }
        return false;
    }

    public final boolean q2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar == null || (indexOf = (arrayList = this.s3).indexOf(aVar)) < 0 || indexOf < 0 || indexOf >= arrayList.size()) {
            return false;
        }
        a aVar2 = (a) arrayList.get(indexOf);
        if (aVar2.c == 0) {
            TL_iv.PageBlock pageBlock = aVar2.b;
            if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !F3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !r2(indexOf)) {
                return false;
            }
        } else if (indexOf <= 0 || ((a) arrayList.get(indexOf - 1)).c < aVar2.c) {
            return false;
        }
        return s3(indexOf);
    }

    public final void q3() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            KeyEvent.Callback childAt = getChildAt(i10);
            if (childAt instanceof q6) {
                q6 q6Var = (q6) childAt;
                q6Var.f.m();
                q6Var.h.m();
            } else if (childAt instanceof z5) {
                z5 z5Var = (z5) childAt;
                b6 b6Var = z5Var.w;
                z5Var.r.m();
                for (int i11 = 0; i11 < b6Var.getChildCount(); i11++) {
                    View childAt2 = b6Var.getChildAt(i11);
                    if (childAt2 instanceof c6) {
                        ((c6) childAt2).a.m();
                    }
                }
            } else if (childAt instanceof o0) {
                ((o0) childAt).getCaptionEditText().m();
            } else if (childAt instanceof y0) {
                ((y0) childAt).getEditText().m();
            }
        }
    }

    public final void q4(a aVar) {
        View C1 = C1(aVar);
        if (C1 instanceof f5) {
            f5 f5Var = (f5) C1;
            ArrayList arrayList = f5Var.D;
            if (f5Var.a == null) {
                return;
            }
            f5Var.p();
            if (f5Var.W >= arrayList.size()) {
                f5Var.W = Math.max(0, arrayList.size() - 1);
            }
            f5Var.q(false);
            f5Var.requestLayout();
            f5Var.invalidate();
        }
    }

    public final boolean r2(int i10) {
        if (i10 <= 0) {
            return false;
        }
        ArrayList arrayList = this.s3;
        return i10 < arrayList.size() && H3(((a) arrayList.get(i10)).b) && ((a) arrayList.get(i10 - 1)).c >= 1;
    }

    public final void r3(boolean z10) {
        q3 q3Var = this.u3;
        if (q3Var != null) {
            if (z10) {
                q3Var.f(false);
            } else {
                org.telegram.messenger.i0.r(q3Var.m0);
                q3Var.u();
            }
        }
        if (z10) {
            Y2();
        } else {
            q3();
        }
    }

    public final void r4() {
        post(new b(this, 3));
    }

    public final boolean s2() {
        int[] G4 = G4();
        if (G4 == null) {
            return t2(G2());
        }
        for (int i10 = G4[0]; i10 <= G4[1]; i10++) {
            if (t2((a) this.s3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean s3(int i10) {
        return ((a) this.s3.get(i10)).c + 1 <= ((org.telegram.messenger.l0) vp.r1(this.m3).y7.X.a).c + (-6);
    }

    public final void s4(int i10) {
        ArrayList arrayList = this.s3;
        int min = Math.min(arrayList.size() - 1, i10 + 1);
        for (int max = Math.max(0, i10 - 1); max <= min; max++) {
            a aVar = (a) arrayList.get(max);
            if (aVar.c > 0) {
                View C1 = C1(aVar);
                if (C1 instanceof q6) {
                    ((q6) C1).F();
                }
            }
        }
    }

    public void setAdaptiveLinkDialogs(boolean z10) {
        this.q3 = z10;
    }

    public void setAllowTapAboveContent(boolean z10) {
        this.Y3 = z10;
    }

    public void setFileRefParentObject(jj jjVar) {
        this.p3 = jjVar;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.U3 = new ArrayList();
        ArrayList arrayList = this.s3;
        Z2(arrayList, n5.b(charSequence), this.t3);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.U3.add((a) arrayList.get(size));
        }
        this.f3.O(false);
    }

    public final boolean t2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        return aVar != null && (indexOf = (arrayList = this.s3).indexOf(aVar)) >= 0 && aVar.c > 0 && indexOf >= 0 && indexOf < arrayList.size() && ((a) arrayList.get(indexOf)).c > 0;
    }

    public final boolean t3(int i10, boolean z10, boolean z11) {
        int i11 = 0;
        if (i10 >= 0) {
            ArrayList arrayList = this.s3;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (z10) {
                    if (aVar.c > 0) {
                        w2(i10);
                        return true;
                    }
                } else if (aVar.c == 0) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    boolean z12 = (pageBlock instanceof TL_iv.pageBlockParagraph) || F3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter);
                    if ((z12 || r2(i10)) && s3(i10)) {
                        a aVar2 = i10 > 0 ? (a) arrayList.get(i10 - 1) : null;
                        if (!z12) {
                            aVar.c = aVar2.c;
                            aVar.d = aVar2.d > 0 ? 1 : 0;
                            aVar.e = false;
                            aVar.f = false;
                            return true;
                        }
                        aVar.c = 1;
                        if (aVar2 != null && aVar2.d > 0) {
                            i11 = 1;
                        }
                        aVar.d = i11;
                        return true;
                    }
                } else if ((z11 || (i10 != 0 && ((a) arrayList.get(i10 - 1)).c >= aVar.c)) && s3(i10)) {
                    aVar.c++;
                    return true;
                }
            }
        }
        return false;
    }

    public final void t4(a aVar, w wVar) {
        if (aVar == null) {
            return;
        }
        if (!E3(aVar.b)) {
            u4(aVar);
            return;
        }
        ArrayList j32 = j3(aVar.b);
        ArrayList arrayList = aVar.h;
        int indexOf = arrayList != null ? arrayList.indexOf(wVar) : -1;
        if (indexOf >= 0) {
            aVar.h.remove(indexOf);
            if (j32 != null && indexOf < j32.size()) {
                j32.remove(indexOf);
            }
        }
        if (aVar.h.isEmpty()) {
            u4(aVar);
            return;
        }
        int size = aVar.h.size();
        p51 p51Var = this.f3;
        if (size != 1) {
            p51Var.O(true);
            q4(aVar);
            return;
        }
        TL_iv.PageCaption pageCaption = aVar.b.caption;
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) j32.get(0);
        aVar.b = pageBlock;
        pageBlock.caption = pageCaption;
        aVar.g = (w) aVar.h.get(0);
        aVar.h = null;
        p51Var.O(true);
        q4(aVar);
    }

    public final boolean u2() {
        o2 o2Var = this.Q3;
        if (o2Var != null) {
            return o2Var.e || !o2Var.b.isEmpty();
        }
        return false;
    }

    public final void u3(boolean z10) {
        int i10;
        int i11;
        int[] G4 = G4();
        if (G4 != null && (i10 = G4[0]) != (i11 = G4[1])) {
            p4(i10, i11, z10);
            return;
        }
        a G2 = G4 == null ? G2() : (a) this.s3.get(G4[0]);
        if (G2 != null) {
            Z3(G2, z10);
        }
    }

    public final void u4(a aVar) {
        ArrayList arrayList = this.s3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            this.f3.O(true);
        }
    }

    public final n1 v2(int i10) {
        KeyEvent.Callback D4 = D4(i10);
        if (D4 instanceof o0) {
            return ((o0) D4).getCaptionEditText();
        }
        return null;
    }

    public final void v3(a aVar, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2) {
        ArrayList arrayList3 = aVar.k;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size && i10 < arrayList.size() && ((Long) arrayList3.get(i10)).equals(arrayList.get(i10))) {
            i10++;
        }
        for (int i11 = size - 1; i11 >= i10; i11--) {
            Long l4 = (Long) arrayList3.get(i11);
            long longValue = l4.longValue();
            Integer num = (Integer) hashMap.get(l4);
            if (num != null && (num.intValue() >= 2 || i11 != 0 || this.t3.containsKey(l4))) {
                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar2.t = longValue;
                for (int i12 = 0; i12 <= i11; i12++) {
                    aVar2.k.add((Long) arrayList3.get(i12));
                }
                int i13 = q5.b;
                a51 K = a51.K(q5.class);
                K.G = aVar2;
                K.H = this.m4;
                arrayList2.add(K);
                this.w4.add(aVar2);
            }
        }
    }

    public final void v4() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.s3;
            if (i10 >= arrayList.size()) {
                return;
            }
            a aVar = (a) arrayList.get(i10);
            if (aVar.c > 0 && aVar.d > 0 && !H3(aVar.b)) {
                int i11 = aVar.c;
                int i12 = 1;
                for (int i13 = i10 - 1; i13 >= 0; i13--) {
                    a aVar2 = (a) arrayList.get(i13);
                    int i14 = aVar2.c;
                    if (i14 < i11) {
                        break;
                    }
                    if (i14 == i11 && !H3(aVar2.b)) {
                        if (aVar2.d <= 0) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                aVar.d = i12;
            }
            i10++;
        }
    }

    public final void w2(int i10) {
        a aVar;
        int i11;
        ArrayList arrayList = this.s3;
        a aVar2 = (a) arrayList.get(i10);
        int i12 = aVar2.c;
        if (i12 <= 0) {
            return;
        }
        int i13 = i12 - 1;
        aVar2.c = i13;
        if (i13 == 0) {
            aVar2.d = 0;
            aVar2.e = false;
            aVar2.f = false;
        }
        while (true) {
            i10++;
            if (i10 >= arrayList.size() || (i11 = (aVar = (a) arrayList.get(i10)).c) <= i12) {
                return;
            } else {
                aVar.c = i11 - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w3() {
        o2 o2Var;
        o2 o2Var2 = this.Q3;
        if (o2Var2 != null) {
            o2Var2.d();
        }
        TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
        pageblockdetails.open = true;
        pageblockdetails.title = new TL_iv.textEmpty();
        a aVar = new a(pageblockdetails, 0, 0);
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        a aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar3.i = true;
        a T2 = T2();
        ArrayList arrayList = this.s3;
        int indexOf = T2 != null ? arrayList.indexOf(T2) : -1;
        if (T2 != null) {
            TL_iv.PageBlock pageBlock = T2.b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && T2.g == null && !T2.i && q6.z(pageBlock).isEmpty()) {
                arrayList.remove(indexOf);
                arrayList.add(indexOf, aVar3);
                arrayList.add(indexOf, aVar2);
                arrayList.add(indexOf, aVar);
                this.f3.O(false);
                o2Var = this.Q3;
                if (o2Var != null) {
                    o2Var.h();
                }
                post(new v2(this, aVar, 20));
            }
        }
        indexOf = indexOf >= 0 ? indexOf + 1 : arrayList.size();
        arrayList.add(indexOf, aVar3);
        arrayList.add(indexOf, aVar2);
        arrayList.add(indexOf, aVar);
        this.f3.O(false);
        o2Var = this.Q3;
        if (o2Var != null) {
        }
        post(new v2(this, aVar, 20));
    }

    public final void w4(String str) {
        q3 q3Var = this.u3;
        Z1(q3Var.p0, q3Var.r0, q3Var.s0, q3Var.u0, str.split("\n", -1));
    }

    public final q6 x2(int i10) {
        if (i10 < 0) {
            return null;
        }
        View m10 = this.e3.m(i10);
        if (m10 instanceof q6) {
            return (q6) m10;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x3(a aVar) {
        boolean z10;
        int indexOf;
        int indexOf2;
        ArrayList arrayList = aVar.k;
        a T2 = T2();
        if (T2 == null) {
            T2 = this.j4;
        }
        ArrayList arrayList2 = this.s3;
        int indexOf3 = T2 != null ? arrayList2.indexOf(T2) : -1;
        if (indexOf3 < 0 || !(T2.b instanceof TL_iv.pageBlockBlockquote)) {
            z10 = false;
        } else {
            long a2 = r0.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) T2.b).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                this.t3.put(Long.valueOf(a2), richText);
            }
            T2.k.add(Long.valueOf(a2));
            T2.b = new TL_iv.pageBlockParagraph();
            z10 = true;
        }
        boolean z11 = indexOf3 >= 0 && !T2.k.isEmpty();
        if (z11) {
            arrayList.clear();
            arrayList.addAll(T2.k);
        }
        if (indexOf3 >= 0) {
            TL_iv.PageBlock pageBlock = T2.b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && T2.g == null && q6.z(pageBlock).isEmpty()) {
                arrayList2.set(indexOf3, aVar);
                this.j4 = aVar;
                indexOf = arrayList2.indexOf(aVar);
                if (indexOf < arrayList2.size() - 1 || H3(((a) arrayList2.get(indexOf + 1)).b)) {
                    a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                    if (z11) {
                        aVar2.k.addAll(arrayList);
                    }
                    arrayList2.add(indexOf + 1, aVar2);
                }
                this.f3.O(!z10);
                indexOf2 = arrayList2.indexOf(aVar) + 1;
                if (indexOf2 > 0 || indexOf2 >= arrayList2.size() || H3(((a) arrayList2.get(indexOf2)).b)) {
                    return;
                }
                post(new v2(this, (a) arrayList2.get(indexOf2), 17));
                return;
            }
        }
        if (indexOf3 >= 0) {
            arrayList2.add(indexOf3 + 1, aVar);
        } else {
            arrayList2.add(aVar);
        }
        this.j4 = aVar;
        indexOf = arrayList2.indexOf(aVar);
        if (indexOf < arrayList2.size() - 1) {
        }
        a aVar22 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        if (z11) {
        }
        arrayList2.add(indexOf + 1, aVar22);
        this.f3.O(!z10);
        indexOf2 = arrayList2.indexOf(aVar) + 1;
        if (indexOf2 > 0) {
        }
    }

    public final w x4(TL_iv.PageBlock pageBlock) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.Photo> arrayList;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TLRPC.Document V2 = V2(((TL_iv.pageBlockAudio) pageBlock).audio_id);
            if (V2 == null) {
                return null;
            }
            w wVar = new w();
            wVar.c = true;
            wVar.a = 2;
            wVar.h = V2;
            wVar.i = V2;
            return wVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document V22 = V2(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (V22 == null) {
                return null;
            }
            w wVar2 = new w();
            wVar2.d = true;
            wVar2.a = 2;
            wVar2.h = V22;
            return wVar2;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            TLRPC.Document V23 = V2(pageblockvideo.video_id);
            if (V23 == null) {
                return null;
            }
            w wVar3 = new w();
            wVar3.b = true;
            wVar3.a = 2;
            wVar3.h = V23;
            wVar3.n = pageblockvideo.spoiler;
            for (int i10 = 0; i10 < V23.attributes.size(); i10++) {
                if (V23.attributes.get(i10) instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) V23.attributes.get(i10);
                    wVar3.j = tL_documentAttributeVideo.w;
                    wVar3.k = tL_documentAttributeVideo.h;
                    return wVar3;
                }
            }
            return wVar3;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockPhoto)) {
            return null;
        }
        TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
        long j10 = pageblockphoto.photo_id;
        if (j10 == 0) {
            photo = null;
        } else {
            int i11 = 0;
            loop1: while (true) {
                if (i11 < this.s3.size()) {
                    for (w wVar4 : T3((a) this.s3.get(i11))) {
                        if (wVar4 != null && (photo = wVar4.g) != null && photo.id == j10) {
                            break loop1;
                        }
                    }
                    i11++;
                } else {
                    TL_iv.RichMessage richMessage = this.r3;
                    if (richMessage != null && (arrayList = richMessage.photos) != null) {
                        int size = arrayList.size();
                        int i12 = 0;
                        while (i12 < size) {
                            TLRPC.Photo photo2 = arrayList.get(i12);
                            i12++;
                            TLRPC.Photo photo3 = photo2;
                            if (photo3 != null && photo3.id == j10) {
                                photo = photo3;
                                break;
                            }
                        }
                    }
                    HashMap hashMap = g5.a;
                    synchronized (g5.class) {
                        photo = j10 == 0 ? null : (TLRPC.Photo) g5.a.get(Long.valueOf(j10));
                    }
                }
            }
        }
        if (photo == null) {
            return null;
        }
        w wVar5 = new w();
        wVar5.a = 2;
        wVar5.g = photo;
        wVar5.n = pageblockphoto.spoiler;
        TLRPC.PhotoSize w9 = b8.w(photo.sizes, org.telegram.messenger.i0.Z0(false), false, null, false);
        if (w9 != null) {
            wVar5.j = w9.w;
            wVar5.k = w9.h;
        }
        return wVar5;
    }

    public final void y2() {
        J2();
        this.r3 = null;
        this.i4 = null;
        this.j4 = null;
        this.Q3 = new o2(this.v4);
        C4();
        this.Q3.j();
        b4 b4Var = this.o3;
        if (b4Var != null) {
            b4Var.Z();
        }
    }

    public final void y4(a aVar) {
        TL_iv.PageBlock pageBlock;
        if (this.r3 == null || aVar == null || (pageBlock = aVar.b) == null) {
            return;
        }
        if (!E3(pageBlock)) {
            w x42 = x4(aVar.b);
            if (x42 != null) {
                aVar.g = x42;
                return;
            }
            return;
        }
        ArrayList j32 = j3(aVar.b);
        aVar.h = new ArrayList();
        if (j32 != null) {
            for (int i10 = 0; i10 < j32.size(); i10++) {
                w x43 = x4((TL_iv.PageBlock) j32.get(i10));
                ArrayList arrayList = aVar.h;
                if (x43 == null) {
                    x43 = new w();
                }
                arrayList.add(x43);
            }
        }
    }

    public final boolean z3() {
        int i10;
        q3 q3Var = this.u3;
        if (q3Var == null || !q3Var.x() || (i10 = q3Var.p0) != q3Var.s0 || i10 < 0 || i10 >= this.w4.size()) {
            return false;
        }
        return D4(i10) instanceof o0;
    }

    public final ArrayList z4(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            if (E3(aVar.b)) {
                ArrayList j32 = j3(aVar.b);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (j32 != null) {
                    int size2 = j32.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = j32.get(i11);
                        i11++;
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj2;
                        w x42 = x4(pageBlock);
                        if (x42 != null) {
                            arrayList3.add(pageBlock);
                            arrayList4.add(x42);
                        }
                    }
                    j32.clear();
                    j32.addAll(arrayList3);
                }
                if (!arrayList4.isEmpty()) {
                    aVar.h = arrayList4;
                    arrayList2.add(aVar);
                }
            } else {
                TL_iv.PageBlock pageBlock2 = aVar.b;
                if ((pageBlock2 instanceof TL_iv.pageBlockPhoto) || (pageBlock2 instanceof TL_iv.pageBlockVideo) || (pageBlock2 instanceof TL_iv.pageBlockAudio) || (pageBlock2 instanceof TL_iv.pageBlockDocument)) {
                    w x43 = x4(pageBlock2);
                    if (x43 != null) {
                        aVar.g = x43;
                        arrayList2.add(aVar);
                    }
                } else {
                    arrayList2.add(aVar);
                }
            }
        }
        return arrayList2;
    }
}
